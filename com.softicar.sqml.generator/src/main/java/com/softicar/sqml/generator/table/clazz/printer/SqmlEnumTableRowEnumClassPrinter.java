package com.softicar.sqml.generator.table.clazz.printer;

import com.softicar.platform.common.code.java.IdentifierNames;
import com.softicar.platform.common.code.java.WordFragment;
import com.softicar.platform.common.core.i18n.IDisplayString;
import com.softicar.platform.common.core.i18n.IDisplayable;
import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.platform.common.string.Imploder;
import com.softicar.platform.db.runtime.enums.IDbEnumTableRowEnum;
import com.softicar.platform.db.sql.field.ISqlFieldValueConsumer;
import com.softicar.platform.db.structure.enums.IDbEnumTableRowStructure;
import com.softicar.platform.db.structure.table.IDbTableStructure;
import com.softicar.sqml.generator.common.SqmlJavaCodePrinter;
import com.softicar.sqml.generator.table.clazz.field.printer.ISqmlTableClassFieldPrinter;
import com.softicar.sqml.generator.table.clazz.type.SqmlTableClassTypesDeterminer;
import com.softicar.sqml.generator.table.clazz.version.SqmlTableClassVersionEnum;
import java.util.List;
import java.util.stream.Collectors;

public class SqmlEnumTableRowEnumClassPrinter extends SqmlJavaCodePrinter {

	private final SqmlTableClassPrinter classPrinter;
	private final List<ISqmlTableClassFieldPrinter> fieldPrinters;
	private final JavaClassName className;
	private final IDbTableStructure tableStructure;

	public SqmlEnumTableRowEnumClassPrinter(SqmlTableClassPrinter classPrinter, IDbTableStructure tableStructure) {

		super(classPrinter);

		this.classPrinter = classPrinter;
		this.fieldPrinters = classPrinter.getAllFields();
		this.className = classPrinter.getTableRowEnumClassName();
		this.tableStructure = tableStructure;
	}

	public void printEnumClassFile() {

		classPrinter.getConfig().writeClassFile(className, generateCode());
	}

	private String generateCode() {

		addImport(IDbEnumTableRowEnum.class);
		printGeneratedClassAnnotationIfGiven();
		beginClass(//
			"public enum %s implements %s<%s, %s>%s",
			className.getSimpleName(),
			IDbEnumTableRowEnum.class.getSimpleName(),
			className.getSimpleName(),
			classPrinter.getSimpleClassName(),
			getAdditionalInterfaces());
		printEnumerators();
		println();
		printFields();
		println();
		printConstructor();
		printGetTableMethod();
		printGetIdMethod();
		printToDisplayMethod();
		printSetFieldsMethod();
		endBlock();
		return toString(className.getPackageName());
	}

	private String getAdditionalInterfaces() {

		if (classPrinter.getConfig().getVersion().isBefore(SqmlTableClassVersionEnum.VERSION_20201127)) {
			return "";
		} else {
			addImport(IDisplayable.class);
			return ", " + IDisplayable.class.getSimpleName();
		}
	}

	// ------------------------------ enumerators ------------------------------ //

	private void printEnumerators() {

		tableStructure.getEnumTableRows().forEach(this::printEnumerator);
		println("//");
		println(";");
	}

	private void printEnumerator(IDbEnumTableRowStructure tableRowStructure) {

		String enumeratorName = getEnumeratorName(tableRowStructure);
		List<String> values = fieldPrinters//
			.stream()
			.map(ISqmlTableClassFieldPrinter::getColumnStructure)
			.map(columnStructure -> tableRowStructure.getValue(columnStructure).convert(new SqmlEnumTableRowValueToJavaConverter()))
			.collect(Collectors.toList());
		println(//
			"%s(%s),",
			enumeratorName,
			Imploder.implode(values, ", "));
	}

	private String getEnumeratorName(IDbEnumTableRowStructure tableRowStructure) {

		String name = tableRowStructure.getNameOrThrow();
		return IdentifierNames.Type.UPPER_WITH_UNDER_SCORE.get(WordFragment.parse(name));
	}

	// ------------------------------ fields ------------------------------ //

	private void printFields() {

		fieldPrinters.forEach(this::printField);
	}

	private void printField(ISqmlTableClassFieldPrinter fieldPrinter) {

		addImport(fieldPrinter.getFieldDefinition().getValueClass());
		println(//
			"private %s %s;",
			getFieldType(fieldPrinter),
			getFieldName(fieldPrinter));
	}

	// ------------------------------ methods ------------------------------ //

	private void printConstructor() {

		beginMethod(
			"private %s(%s)",
			className.getSimpleName(),
			fieldPrinters//
				.stream()
				.map(fieldPrinter -> getFieldType(fieldPrinter) + " " + getFieldName(fieldPrinter))
				.collect(Collectors.joining(", ")));
		fieldPrinters//
			.stream()
			.map(this::getFieldName)
			.forEach(fieldName -> println("this.%s = %s;", fieldName, fieldName));
		endMethod();
	}

	private void printGetTableMethod() {

		String tableType = new SqmlTableClassTypesDeterminer(this, classPrinter).getAndImportTableType();

		println("@Override");
		beginMethod("public %s getTable()", tableType);
		println("return %s.TABLE;", classPrinter.getSimpleClassName());
		endMethod();
	}

	private void printGetIdMethod() {

		println("@Override");
		beginMethod("public Integer getId()");
		println("return id;");
		endMethod();
	}

	private void printToDisplayMethod() {

		if (classPrinter.getConfig().getVersion().isBefore(SqmlTableClassVersionEnum.VERSION_20201127)) {
			return;
		}

		classPrinter//
			.getConfig()
			.getI18nClass()
			.ifPresentOrElse(this::printToDisplayMethodWithI18n, this::printToDisplayMethodWithoutI18n);
	}

	private void printToDisplayMethodWithI18n(JavaClassName i18nClass) {

		addImport(i18nClass);
		addImport(IDisplayString.class);
		addImport(IllegalArgumentException.class);

		println("@Override");
		beginMethod("public %s toDisplay()", IDisplayString.class.getSimpleName());
		beginBlock("switch (this)");
		for (IDbEnumTableRowStructure tableRowStructure: tableStructure.getEnumTableRows()) {
			String enumeratorName = getEnumeratorName(tableRowStructure);
			printlnIndented(-1, "case %s:", enumeratorName);
			println("return %s.%s;", i18nClass.getSimpleName(), enumeratorName);
		}
		endBlock();
		println("throw new %s(\"Unknown enumerator: \" + name());", IllegalArgumentException.class.getSimpleName());
		endMethod();
	}

	private void printToDisplayMethodWithoutI18n() {

		addImport(IDisplayString.class);

		println("@Override");
		beginMethod("public %s toDisplay()", IDisplayString.class.getSimpleName());
		println("return %s.create(name());", IDisplayString.class.getSimpleName());
		endMethod();
	}

	private void printSetFieldsMethod() {

		addImport(ISqlFieldValueConsumer.class);

		println("@Override");
		beginMethod(//
			"public void setFields(%s<%s> consumer)",
			ISqlFieldValueConsumer.class.getSimpleName(),
			classPrinter.getSimpleClassName());
		fieldPrinters.forEach(this::printConsumeFieldCall);
		endMethod();
	}

	private void printConsumeFieldCall(ISqmlTableClassFieldPrinter fieldPrinter) {

		println(//
			"consumer.consumeFieldValue(%s.%s, %s);",
			classPrinter.getSimpleClassName(),
			fieldPrinter.getNameDeterminer().getStaticFinalName(),
			fieldPrinter.getNameDeterminer().getLowerCamelName());
	}

	// ------------------------------ utilities ------------------------------ //

	private String getFieldName(ISqmlTableClassFieldPrinter fieldPrinter) {

		return fieldPrinter.getNameDeterminer().getLowerCamelName();
	}

	private String getFieldType(ISqmlTableClassFieldPrinter fieldPrinter) {

		return fieldPrinter.getFieldDefinition().getValueClass().getSimpleName();
	}
}
