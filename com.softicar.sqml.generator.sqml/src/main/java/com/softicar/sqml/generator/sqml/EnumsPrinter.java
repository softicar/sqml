package com.softicar.sqml.generator.sqml;

import com.softicar.platform.common.code.java.CodePrinter;
import com.softicar.platform.common.code.java.JavaIdentifier;
import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.platform.db.structure.column.IDbColumnStructure;
import com.softicar.platform.db.structure.table.IDbTableStructure;
import com.softicar.sqml.generator.sqml.keyword.SqmlKeyword;
import com.softicar.sqml.generator.table.clazz.field.utils.SqmlTableClassFieldUtils;

class EnumsPrinter {

	private final IDbTableStructure tableStructure;

	public EnumsPrinter(IDbTableStructure tableStructure) {

		this.tableStructure = tableStructure;
	}

	public void print(CodePrinter printer) {

		for (IDbColumnStructure columnStructure: tableStructure.getColumns()) {
			if (!columnStructure.isIgnored()) {
				if (columnStructure.getFieldType() == SqlFieldType.ENUM) {
					printEnum(printer, columnStructure);
				}
			}
		}
	}

	private void printEnum(CodePrinter printer, IDbColumnStructure columnStructure) {

		printer.println();
		printer.println("ENUM %s {", getEnumTypeName(columnStructure));
		printer.incrementIndentation();
		for (String enumValue: columnStructure.getEnumValues()) {
			String enumeratorName = getEnumeratorName(enumValue);
			if (enumeratorName.equals(enumValue)) {
				printer.println(enumeratorName);
			} else {
				printer.println("%s = '%s'", enumeratorName, enumValue);
			}
		}
		printer.decrementIndentation();
		printer.println("}");
	}

	public static String getEnumTypeName(IDbColumnStructure columnStructure) {

		return new JavaIdentifier(columnStructure.getLogicalName()).asClass();
	}

	public static String getEnumeratorName(String enumStringValue) {

		String name = SqmlTableClassFieldUtils.getEnumVariableName(enumStringValue);
		if (SqmlKeyword.isKeyword(name)) {
			name = "^" + name;
		}
		return name;
	}

	public static String getEnumDefaultValueString(IDbColumnStructure columnStructure) {

		return getEnumeratorReferenceCode(columnStructure, columnStructure.getDefaultValue());
	}

	// returns a matching string in the form '<enum>.<enumerator>'
	private static String getEnumeratorReferenceCode(IDbColumnStructure columnStructure, String literalValue) {

		return EnumsPrinter.getEnumTypeName(columnStructure) + "." + EnumsPrinter.getEnumeratorName(literalValue);
	}
}
