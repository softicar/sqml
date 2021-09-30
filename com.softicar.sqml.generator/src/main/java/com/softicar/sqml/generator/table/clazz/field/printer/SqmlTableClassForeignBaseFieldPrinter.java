package com.softicar.sqml.generator.table.clazz.field.printer;

import com.softicar.platform.db.runtime.field.IDbBaseField;
import com.softicar.sqml.generator.table.clazz.field.definition.ISqmlTableClassFieldDefinition;
import com.softicar.sqml.generator.table.clazz.printer.SqmlTableClassPrinter;

class SqmlTableClassForeignBaseFieldPrinter extends SqmlTableClassFieldPrinter {

	public SqmlTableClassForeignBaseFieldPrinter(SqmlTableClassPrinter classPrinter, ISqmlTableClassFieldDefinition fieldDefinition) {

		super(classPrinter, fieldDefinition);
	}

	@Override
	public String getFieldType() {

		classPrinter.addImport(IDbBaseField.class);
		classPrinter.addImport(fieldDefinition.getValueClass());
		return String
			.format(
				"%s<%s, %s, %s>",
				IDbBaseField.class.getSimpleName(),
				classPrinter.getSimpleClassName(),
				fieldDefinition.getValueClass().getSimpleName(),
				fieldDefinition.getFieldType().getJavaClass().getSimpleName());
	}

	@Override
	protected String getCreateFieldFunctionNameSuffix() {

		return String.format("BaseField");
	}

	@Override
	protected String getFieldFactoryParameters() {

		return ", " + fieldDefinition.getValueClass().getSimpleName() + ".TABLE";
	}
}
