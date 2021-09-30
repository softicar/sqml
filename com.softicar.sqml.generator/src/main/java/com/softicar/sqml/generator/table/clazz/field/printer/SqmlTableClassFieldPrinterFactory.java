package com.softicar.sqml.generator.table.clazz.field.printer;

import com.softicar.platform.common.core.exceptions.SofticarUnknownEnumConstantException;
import com.softicar.sqml.generator.table.clazz.field.definition.ISqmlTableClassFieldDefinition;
import com.softicar.sqml.generator.table.clazz.printer.SqmlTableClassPrinter;

/**
 * This is a static factory for {@link ISqmlTableClassFieldPrinter}.
 *
 * @author Oliver Richers
 */
public class SqmlTableClassFieldPrinterFactory {

	public static ISqmlTableClassFieldPrinter create(SqmlTableClassPrinter classPrinter, ISqmlTableClassFieldDefinition fieldDefinition) {

		if (fieldDefinition.isIdField()) {
			return new SqmlTableClassIdFieldPrinter(classPrinter, fieldDefinition);
		} else if (fieldDefinition.isBaseField()) {
			return new SqmlTableClassForeignBaseFieldPrinter(classPrinter, fieldDefinition);
		} else if (fieldDefinition.isForeignObjectField()) {
			return new SqmlTableClassForeignObjectFieldPrinter(classPrinter, fieldDefinition);
		} else if (fieldDefinition.isForeignRowField()) {
			return new SqmlTableClassForeignRowFieldPrinter(classPrinter, fieldDefinition);
		}

		switch (fieldDefinition.getFieldType()) {
		case BYTE_ARRAY:
			return new SqmlTableClassByteArrayFieldPrinter(classPrinter, fieldDefinition);
		case ENUM:
			return new SqmlTableClassEnumFieldPrinter(classPrinter, fieldDefinition);
		case BIG_DECIMAL:
		case BOOLEAN:
		case DAY:
		case DAY_TIME:
		case DOUBLE:
		case FLOAT:
		case INTEGER:
		case LONG:
		case STRING:
		case TIME:
			return new SqmlTableClassFieldPrinter(classPrinter, fieldDefinition);
		}

		throw new SofticarUnknownEnumConstantException(fieldDefinition.getFieldType());
	}
}
