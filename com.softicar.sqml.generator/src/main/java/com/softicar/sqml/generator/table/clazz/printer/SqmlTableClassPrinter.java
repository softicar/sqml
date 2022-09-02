package com.softicar.sqml.generator.table.clazz.printer;

import com.softicar.platform.common.code.java.JavaClass;
import com.softicar.platform.common.container.set.SetFactory;
import com.softicar.platform.common.core.exceptions.SofticarDeveloperException;
import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.platform.common.core.java.packages.name.JavaPackageName;
import com.softicar.platform.common.string.Imploder;
import com.softicar.platform.db.core.table.DbTableName;
import com.softicar.platform.db.runtime.key.DbTableKeyFactory;
import com.softicar.platform.db.runtime.key.IDbTableKey;
import com.softicar.platform.db.sql.statement.ISqlSelect;
import com.softicar.platform.db.structure.column.IDbColumnStructure;
import com.softicar.platform.db.structure.key.DbKeyType;
import com.softicar.platform.db.structure.key.IDbKeyStructure;
import com.softicar.platform.db.structure.table.IDbTableStructure;
import com.softicar.sqml.generator.common.SqmlJavaCodePrinter;
import com.softicar.sqml.generator.table.clazz.field.printer.ISqmlTableClassFieldPrinter;
import com.softicar.sqml.generator.table.clazz.field.printer.SqmlTableClassFieldPrinterList;
import com.softicar.sqml.generator.table.clazz.field.utils.SqmlTableClassFieldUtils;
import com.softicar.sqml.generator.table.clazz.key.SqmlTableClassKeyDeclarationPrinter;
import com.softicar.sqml.generator.table.clazz.key.SqmlTableClassKeyTypeDeterminer;
import com.softicar.sqml.generator.table.clazz.type.SqmlTableClassBaseTypesDeterminer;
import com.softicar.sqml.generator.table.clazz.type.SqmlTableClassTypesDeterminer;
import com.softicar.sqml.generator.table.clazz.version.SqmlTableClassVersionEnum;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * This is class prints the Java code for a single table class.
 *
 * @author Oliver Richers
 */
public class SqmlTableClassPrinter extends SqmlJavaCodePrinter implements ISqmlTableClassPrinterSettings {

	private static final String TABLE_BUILDER_CONSTANT = "BUILDER";
	private static final String TABLE_CONSTANT = "TABLE";
	private static final String PRIMARY_KEY_CONSTANT = "PRIMARY_KEY";
	private static final Set<String> RESERVED_FIELD_NAMES = SetFactory.createTreeSetFrom(TABLE_CONSTANT, PRIMARY_KEY_CONSTANT);

	private final ISqmlTableClassPrinterConfig config;
	private final DbTableName tableName;
	private final JavaClassName className;
	private final IDbTableStructure tableStructure;
	private final String simpleClassName;
	private final SqmlTableClassFieldPrinterList fieldPrinters;
	private final boolean customBaseClassExists;
	private final boolean customTableClassExists;
	private final boolean generatedBaseClassExists;
	private final SqmlTableClassBaseTypesDeterminer baseTypeDeterminer;
	private final SqmlTableClassKeyTypeDeterminer keyTypeDeterminer;
	private final SqmlTableClassTypesDeterminer tableTypeDeterminer;

	public SqmlTableClassPrinter(ISqmlTableClassPrinterConfig config, DbTableName tableName) {

		super(config);

		this.config = config;
		this.tableName = tableName;
		this.className = config.getClassName(tableName);
		this.tableStructure = config.getTableStructure(tableName);
		this.simpleClassName = className.getSimpleName();
		this.fieldPrinters = new SqmlTableClassFieldPrinterList(this);
		this.customBaseClassExists = config.classFileExists(getCustomBaseClassName());
		this.customTableClassExists = config.classFileExists(getCustomTableClassName());
		this.generatedBaseClassExists = config.classFileExists(getGeneratedBaseClassName());
		this.baseTypeDeterminer = new SqmlTableClassBaseTypesDeterminer(this, this);
		this.keyTypeDeterminer = new SqmlTableClassKeyTypeDeterminer(this, this);
		this.tableTypeDeterminer = new SqmlTableClassTypesDeterminer(this, this);

		// validate field names
		for (ISqmlTableClassFieldPrinter fieldPrinter: fieldPrinters.getAllFieldPrinters()) {
			String columnName = fieldPrinter.getFieldDefinition().getColumn().getLogicalName();
			if (RESERVED_FIELD_NAMES.contains(columnName.toUpperCase())) {
				throw new RuntimeException(String.format("The table %s uses the reserved column name '%s'.", tableName, columnName));
			}
		}
	}

	// ------------------------------ getters ------------------------------ //

	@Override
	public ISqmlTableClassPrinterConfig getConfig() {

		return config;
	}

	public JavaClassName getClassName() {

		return className;
	}

	@Override
	public String getSimpleClassName() {

		return simpleClassName;
	}

	@Override
	public DbTableName getTableName() {

		return tableName;
	}

	@Override
	public IDbTableStructure getTableStructure() {

		return tableStructure;
	}

	public String getTableBuilderConstant() {

		return TABLE_BUILDER_CONSTANT;
	}

	public List<ISqmlTableClassFieldPrinter> getControlFields() {

		return fieldPrinters.getControlFieldPrinters();
	}

	public List<ISqmlTableClassFieldPrinter> getDataFields() {

		return fieldPrinters.getDataFieldPrinters();
	}

	public List<ISqmlTableClassFieldPrinter> getAllFields() {

		return fieldPrinters.getAllFieldPrinters();
	}

	@Override
	public ISqmlTableClassFieldPrinter getFieldPrinter(IDbColumnStructure column) {

		return fieldPrinters.getFieldPrinter(column);
	}

	// ------------------------------ utilities ------------------------------ //

	@Override
	public JavaClassName getCustomChildClassName() {

		return className;
	}

	@Override
	public JavaClassName getCustomBaseClassName() {

		JavaPackageName packageName = getClassName().getPackageName();
		return packageName.getClassName("Abstract" + simpleClassName);
	}

	@Override
	public JavaClassName getCustomTableClassName() {

		JavaPackageName packageName = getClassName().getPackageName();
		return packageName.getClassName(simpleClassName + "Table");
	}

	@Override
	public JavaClassName getGeneratedBaseClassName() {

		JavaPackageName packageName = getClassName().getPackageName();
		return packageName.getClassName(simpleClassName + "Generated");
	}

	public JavaClassName getGeneratedClassName() {

		return isUseGeneratedBase()? getGeneratedBaseClassName() : className;
	}

	@Override
	public JavaClassName getTableRowEnumClassName() {

		JavaPackageName packageName = getClassName().getPackageName();
		return packageName.getClassName(simpleClassName + "Enum");
	}

	// ------------------------------ predicates ------------------------------ //

	@Override
	public boolean isEnumTable() {

		return tableStructure.isEnumTable();
	}

	@Override
	public boolean isObject() {

		return tableStructure.getIdColumn().isPresent() && !isEnumTable();
	}

	@Override
	public boolean isSubObject() {

		return tableStructure//
			.getPkColumn()
			.map(IDbColumnStructure::isBaseColumn)
			.orElse(false);
	}

	@Override
	public boolean isRecord() {

		return !isObject() && !isSubObject() && !isEnumTable();
	}

	@Override
	public boolean isUseCustomBase() {

		return customBaseClassExists || config.isExtractCustomBaseClass();
	}

	@Override
	public boolean isUseGeneratedBase() {

		return generatedBaseClassExists || config.isExtractGeneratedBaseClass();
	}

	@Override
	public boolean isUseCustomTableClass() {

		return customTableClassExists || config.isExtractCustomTableClass();
	}

	// ------------------------------ file generation ------------------------------ //

	@Override
	public void addImport(JavaClass javaClass) {

		// TODO: this is actually a dirty hack to prevent simple class names to be added to the imports
		if (javaClass.getCanonicalName().equals(javaClass.getSimpleName())) {
			super.addImports(javaClass.getImports());
		} else {
			super.addImport(javaClass);
		}
	}

	public void printClassFile() {

		JavaClassName generatedClassName = getGeneratedClassName();

		// print class
		printClassHeader();
		printStaticConstants();
		printEnums();
		printConstructors();
		if (isObject()) {
			printStaticFunctions();
		}
		printGettersAndSetters();
		printUtils();
		printFieldMembers();
		endBlock();

		// generate custom child class
		if (config.isExtractGeneratedBaseClass() && !generatedBaseClassExists) {
			new SqmlCustomTableChildClassPrinter(this).printClassFile();
		}

		// generate custom base class
		if (config.isExtractCustomBaseClass() && !customBaseClassExists) {
			new SqmlCustomTableBaseClassPrinter(this).printClassFile();
		}

		// generate custom table class
		if (config.isExtractCustomTableClass() && !customTableClassExists) {
			new SqmlCustomTableClassPrinter(this).printClassFile();
		}

		// generate table row enum class
		if (tableStructure.isEnumTable()) {
			new SqmlEnumTableRowEnumClassPrinter(this, tableStructure).printEnumClassFile();
		}

		// now, we can prepend the imports
		prependFileHeader(generatedClassName.getPackageName());

		// write class file
		StringBuilder content = new StringBuilder();
		writeOut(content);
		config.writeClassFile(generatedClassName, content.toString());
	}

	// ------------------------------ print methods ------------------------------ //

	private void printClassHeader() {

		printJavaDoc();
		printGeneratedClassAnnotationIfGiven();
		if (config.isGenerateSuppressWarnings()) {
			println("@SuppressWarnings(\"all\")");
		}
		String classHeader = String
			.format(//
				"public class %s extends %s",
				getGeneratedClassName().getSimpleName(),
				baseTypeDeterminer.getAndImportBaseTypeOfGeneratedClass());
		beginClass(classHeader);
	}

	private void printJavaDoc() {

		println("/**");
		println(" * This is the automatically generated class %s for", simpleClassName);
		println(" * database table <i>%s</i>.", tableName.getCanonicalName());
		println(" */");
	}

	private void printStaticConstants() {

		printSeparator("STATIC CONSTANTS");
		println("// @formatter:off");

		// table structure constant
		println(
			"private static final %s %s = new %s<>(%s, %s::new, %s.class);",
			tableTypeDeterminer.getAndImportTableBuilderType(),
			getTableBuilderConstant(),
			tableTypeDeterminer.getAndImportTableBuilderClass().getSimpleName(),
			getTableNameExpression(),
			simpleClassName,
			simpleClassName);

		// table singular and plural title
		if (config.getVersion().isEqualOrLater(SqmlTableClassVersionEnum.VERSION_20200506)) {
			new SqmlTableClassTitlesPrinter(this).print();
		}

		// print static finals of fields and keys
		printFieldConstants(getControlFields(), 0);
		printFieldConstants(getDataFields(), getControlFields().size());
		if (isRecord()) {
			printPrimaryKeyStaticFinal();
		}

		printKeyStaticFinals(DbKeyType.UNIQUE);
		printKeyStaticFinals(DbKeyType.INDEX);

		println(//
			"public static final %s %s = new %s(%s%s);",
			tableTypeDeterminer.getAndImportTableType(),
			TABLE_CONSTANT,
			tableTypeDeterminer.getAndImportTableAllocationType(),
			getTableBuilderConstant(),
			tableTypeDeterminer.getAdditionalCreationParameters());

		println("// @formatter:on");
		println();
	}

	private String getTableNameExpression() {

		return String.format("\"%s\", \"%s\"", tableName.getDatabaseName(), tableName.getSimpleName());
	}

	private void printFieldConstants(List<ISqmlTableClassFieldPrinter> fields, int index) {

		for (ISqmlTableClassFieldPrinter field: fields) {
			field.printStaticFinal(index);
			index++;
		}
	}

	private void printPrimaryKeyStaticFinal() {

		addImport(IDbTableKey.class);
		addImport(DbTableKeyFactory.class);
		println(
			"public static final %s<%s, %s> %s = %s.setPrimaryKey(%s.createKey(%s));", //
			IDbTableKey.class.getSimpleName(),
			simpleClassName,
			keyTypeDeterminer.getAndImportType(),
			PRIMARY_KEY_CONSTANT,
			getTableBuilderConstant(),
			DbTableKeyFactory.class.getSimpleName(),
			tableStructure
				.getPrimaryKey()
				.get()
				.getColumns()
				.stream()
				.map(c -> getFieldPrinter(c).getNameDeterminer().getStaticFinalName())
				.collect(Collectors.joining(", ")));
	}

	private void printKeyStaticFinals(DbKeyType keyType) {

		tableStructure//
			.getKeys()
			.stream()
			.filter(key -> key.getType() == keyType)
			.forEach(key -> new SqmlTableClassKeyDeclarationPrinter(this, key).print());
	}

	private void printEnums() {

		// print enum classes for fields
		for (ISqmlTableClassFieldPrinter fieldPrinter: getDataFields()) {
			fieldPrinter.printEnumClass();
		}
	}

	private void printConstructors() {

		String simpleNameOfGeneratedClass = getGeneratedClassName().getSimpleName();
		if (isRecord()) {
			printSeparator("CONSTRUCTORS");
			beginMethod("protected %s()", simpleNameOfGeneratedClass);
			println("// protected");
			endBlock();
		}
	}

	private void printStaticFunctions() {

		printSeparator("STATIC FUNCTIONS");

		addImport(ISqlSelect.class);
		beginMethod("public static %s<%s> createSelect()", ISqlSelect.class.getSimpleName(), simpleClassName, simpleClassName);
		println("return %s.createSelect();", TABLE_CONSTANT);
		endBlock();

		if (config.isGenerateGetByIdMethod()) {
			beginMethod("public static %s get(Integer id)", simpleClassName);
			println("return %s.get(id);", TABLE_CONSTANT);
			endBlock();
		}

		printLoadByUniqueKeyFunctions();
	}

	private void printLoadByUniqueKeyFunctions() {

		for (IDbKeyStructure key: tableStructure.getKeys()) {
			if (key.getType() == DbKeyType.UNIQUE) {
				List<ISqmlTableClassFieldPrinter> fieldList = new ArrayList<>();
				for (IDbColumnStructure column: key.getColumns()) {
					fieldList.add(fieldPrinters.getFieldPrinter(column));
				}
				printLoadByFunction(fieldList);
			}
		}
	}

	private void printLoadByFunction(List<ISqmlTableClassFieldPrinter> fieldPrinters) {

		// get parameter strings
		List<String> parameters = new ArrayList<>(fieldPrinters.size());
		for (ISqmlTableClassFieldPrinter fieldPrinter: fieldPrinters) {
			JavaClass valueClass = fieldPrinter.getFieldDefinition().getValueClass();
			if (valueClass == null) {
				throw new SofticarDeveloperException(
					"Failed to find value class for field %s.%s.",
					fieldPrinter.getFieldDefinition().getColumn().getTableStructure().getTableName(),
					fieldPrinter.getFieldDefinition().getColumn().getName().orElse("UNKNOWN"));
			}

			parameters.add(String.format("%s %s", valueClass.getSimpleName(), SqmlTableClassFieldUtils.getLocalName(fieldPrinter)));
		}

		// get name strings
		List<String> names = new ArrayList<>(fieldPrinters.size());
		for (ISqmlTableClassFieldPrinter fieldPrinter: fieldPrinters) {
			names.add(SqmlTableClassFieldUtils.getUpperCamelName(fieldPrinter));
		}

		// print function
		beginMethod(//
			"public static %s %s%s(%s)",
			simpleClassName,
			config.getPrefixForGeneratedLoadByMethods(),
			Imploder.implode(names, "And"),
			Imploder.implode(parameters, ", "));
		println("return TABLE//");
		printlnIndented(2, ".createSelect()");
		for (ISqmlTableClassFieldPrinter fieldPrinter: fieldPrinters) {
			String condition;
			if (config.getVersion().isBefore(SqmlTableClassVersionEnum.VERSION_20220902)) {
				condition = ".where(%s.equal(%s))";
			} else {
				condition = ".where(%s.isEqual(%s))";
			}
			printlnIndented(//
				2,
				condition,
				SqmlTableClassFieldUtils.getStaticFinalName(fieldPrinter),
				SqmlTableClassFieldUtils.getLocalName(fieldPrinter));
		}
		printlnIndented(2, ".getOne();");
		endBlock();
	}

	private void printGettersAndSetters() {

		printSeparator("GETTERS AND SETTERS");

		for (ISqmlTableClassFieldPrinter fieldPrinter: getAllFields()) {
			fieldPrinter.printGetFunction();
			if (!fieldPrinters.isControlField(fieldPrinter)) {
				fieldPrinter.printSetFunction();
			}
		}
	}

	private void printUtils() {

		printSeparator("UTILS");

		// table()
		println("@Override");
		beginMethod("public final %s table()", tableTypeDeterminer.getAndImportTableType());
		println("return %s;", TABLE_CONSTANT);
		endBlock();
	}

	private void printFieldMembers() {

		printSeparator("FIELD MEMBERS");

		// print members and add imports
		for (ISqmlTableClassFieldPrinter fieldPrinter: getAllFields()) {
			if (fieldPrinter.getFieldDefinition().isIdField()) {
				// TODO remove this special case when we have support for BIGINT identity columns (i3495)
				println("private Integer %s;", SqmlTableClassFieldUtils.getMemberName(fieldPrinter));
			} else {
				JavaClass valueClass = fieldPrinter.getFieldDefinition().getValueClass();
				addImports(valueClass.getImports());
				println("private %s %s;", valueClass.getSimpleName(), SqmlTableClassFieldUtils.getMemberName(fieldPrinter));
			}
		}

		println();
	}
}
