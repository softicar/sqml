package com.softicar.sqml.generator.table.clazz.field.utils;

import com.softicar.platform.common.code.java.IdentifierNames;
import com.softicar.platform.db.structure.column.IDbColumnStructure;
import com.softicar.sqml.generator.table.clazz.field.definition.SqmlTableClassFieldDefinition;
import com.softicar.sqml.generator.table.clazz.field.printer.ISqmlTableClassFieldPrinter;
import com.softicar.sqml.generator.table.clazz.field.printer.SqmlTableClassFieldPrinterFactory;
import com.softicar.sqml.generator.table.clazz.printer.ISqmlTableClassPrinterConfig;
import com.softicar.sqml.generator.table.clazz.printer.SqmlTableClassPrinter;

/**
 * Provides utility methods for code generation of database fields.
 *
 * @author Oliver Richers
 */
public final class SqmlTableClassFieldUtils {

	public static ISqmlTableClassFieldPrinter createPrinter(SqmlTableClassPrinter classPrinter, IDbColumnStructure columnStructure,
			ISqmlTableClassPrinterConfig config) {

		return SqmlTableClassFieldPrinterFactory.create(classPrinter, new SqmlTableClassFieldDefinition(config, columnStructure));
	}

	public static String getUpperCamelName(ISqmlTableClassFieldPrinter fieldPrinter) {

		return IdentifierNames.Type.UPPER_CAMEL.get(fieldPrinter.getFieldDefinition().getNameFragments());
	}

	public static String getStaticFinalName(ISqmlTableClassFieldPrinter fieldPrinter) {

		return IdentifierNames.Type.UPPER_WITH_UNDER_SCORE.get(fieldPrinter.getFieldDefinition().getNameFragments());
	}

	public static String getMemberName(ISqmlTableClassFieldPrinter fieldPrinter) {

		return fieldPrinter.getNameDeterminer().getMemberName();
	}

	public static String getLocalName(ISqmlTableClassFieldPrinter fieldPrinter) {

		return IdentifierNames.Type.LOWER_CAMEL.get(fieldPrinter.getFieldDefinition().getNameFragments());
	}

	public static String getEnumVariableName(String rawName) {

		if (rawName.equals("")) {
			return "_EMPTY_";
		}

		StringBuilder builder = new StringBuilder(rawName.length());
		for (int i = 0; i != rawName.length(); ++i) {
			char c = rawName.charAt(i);
			if (Character.isLetterOrDigit(c)) {
				builder.append(c);
			} else {
				builder.append("_");
			}
		}

		String result = IdentifierNames.Type.UPPER_WITH_UNDER_SCORE.get(builder.toString());
		return Character.isDigit(result.charAt(0))? "_" + result : result;
	}
}
