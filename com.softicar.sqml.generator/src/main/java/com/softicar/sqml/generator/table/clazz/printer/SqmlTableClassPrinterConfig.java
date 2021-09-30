package com.softicar.sqml.generator.table.clazz.printer;

import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.platform.db.core.table.DbTableName;
import com.softicar.platform.db.structure.table.IDbTableStructure;
import com.softicar.sqml.generator.common.ISqmlFileSystemAccess;
import com.softicar.sqml.generator.common.SqmlImportOverrides;
import com.softicar.sqml.generator.preferences.ISqmlGeneratorPreferences;
import com.softicar.sqml.generator.table.clazz.version.SqmlTableClassVersion;
import com.softicar.sqml.generator.table.structure.SqmlShallowTableStructure;
import com.softicar.sqml.generator.table.structure.SqmlTableStructure;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.utils.SqmlLogicError;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SqmlTableClassPrinterConfig implements ISqmlTableClassPrinterConfig {

	private final ISqmlGeneratorPreferences preferences;
	private final ISqmlFileSystemAccess fileSystemAccess;
	private final Map<DbTableName, ISqmlTable> tableNameToTable = new TreeMap<>();
	private final Map<DbTableName, IDbTableStructure> tableStructures = new TreeMap<>();
	private final Map<DbTableName, JavaClassName> classNames = new TreeMap<>();
	private boolean extractCustomBaseClass;
	private boolean extractCustomTableClass;
	private boolean extractGeneratedBaseClass;

	public SqmlTableClassPrinterConfig(ISqmlGeneratorPreferences preferences, ISqmlTable table, ISqmlFileSystemAccess fileSystemAccess) {

		this.preferences = preferences;
		this.fileSystemAccess = fileSystemAccess;
		this.extractCustomBaseClass = false;
		this.extractCustomTableClass = false;
		this.extractGeneratedBaseClass = false;

		addTable(table, new SqmlTableStructure(table));

		// add referenced tables
		for (ISqmlTableColumn column: table.getColumns()) {
			column//
				.getForeignKeyTargetTable()
				.ifPresent(targetTable -> addTableAndPkTargetTables(targetTable));
		}
	}

	public void setExtractCustomBaseClass(boolean extractCustomBaseClass) {

		this.extractCustomBaseClass = extractCustomBaseClass;
	}

	public void setExtractCustomTableClass(boolean extractCustomTableClass) {

		this.extractCustomTableClass = extractCustomTableClass;
	}

	public void setExtractGeneratedBaseClass(boolean extractGeneratedBaseClass) {

		this.extractGeneratedBaseClass = extractGeneratedBaseClass;
	}

	private void addTableAndPkTargetTables(ISqmlTable table) {

		IDbTableStructure tableStructure = new SqmlShallowTableStructure(table);
		if (addTable(table, tableStructure)) {
			table//
				.getColumns()
				.stream()
				.filter(ISqmlTableColumn::isPrimaryKey)
				.forEach(column -> {
					column//
						.getForeignKeyTargetTable()
						.ifPresent(targetTable -> addTableAndPkTargetTables(targetTable));
				});
		}
	}

	private boolean addTable(ISqmlTable table, IDbTableStructure tableStructure) {

		DbTableName tableName = table.getDbTableName();
		if (!tableNameToTable.containsKey(tableName)) {
			tableNameToTable.put(tableName, table);
			tableStructures.put(tableName, tableStructure);
			classNames.put(tableName, table.getClassName());
			return true;
		} else {
			return false;
		}
	}

	@Override
	public JavaClassName getClassName(DbTableName tableName) {

		JavaClassName className = classNames.get(tableName);
		if (className == null) {
			throw new SqmlLogicError("Missing table definition for '%s'.", tableName);
		}
		return className;
	}

	@Override
	public IDbTableStructure getTableStructure(DbTableName tableName) {

		return tableStructures.get(tableName);
	}

	@Override
	public void writeClassFile(JavaClassName className, String content) {

		fileSystemAccess.writeFileIfNecessary(className, content);
	}

	@Override
	public String readClassFile(JavaClassName className) {

		return fileSystemAccess.readFile(className);
	}

	@Override
	public boolean classFileExists(JavaClassName className) {

		return fileSystemAccess.existsFile(className);
	}

	@Override
	public boolean isExtractCustomBaseClass() {

		return extractCustomBaseClass;
	}

	@Override
	public boolean isExtractCustomTableClass() {

		return extractCustomTableClass;
	}

	@Override
	public boolean isExtractGeneratedBaseClass() {

		return extractGeneratedBaseClass;
	}

	@Override
	public boolean isGenerateSuppressWarnings() {

		return preferences.isGenerateSuppressAllWarningsForTables();
	}

	@Override
	public boolean isGenerateGetByIdMethod() {

		return preferences.isGenerateGetByIdMethod();
	}

	@Override
	public boolean isGenerateGetIdMethods() {

		return preferences.isGenerateGetIdMethods();
	}

	@Override
	public Optional<JavaClassName> getAnnotationForGeneratedClasses() {

		return preferences.getAnnotationForGeneratedClassesAsOptional();
	}

	@Override
	public Optional<JavaClassName> getI18nClass() {

		return preferences.getI18nClassAsOptional();
	}

	@Override
	public Collection<String> getTableClassNamePrefixes() {

		return Arrays//
			.asList(preferences.getTableClassNamePrefixes().split(","))
			.stream()
			.map(String::trim)
			.filter(prefix -> !prefix.isEmpty())
			.collect(Collectors.toList());
	}

	@Override
	public SqmlTableClassVersion getVersion() {

		return preferences.getGeneratedTableCodeVersion();
	}

	@Override
	public String getPrefixForClassFields() {

		return preferences.getPrefixForClassFields();
	}

	@Override
	public String getPrefixForGeneratedLoadByMethods() {

		return preferences.getPrefixForLoadByMethods();
	}

	@Override
	public SqmlImportOverrides getImportOverrides() {

		return preferences.getImportOverrides();
	}
}
