package com.softicar.sqml.generator.table.clazz.field.printer;

import com.softicar.platform.db.runtime.field.IDbForeignField;
import com.softicar.sqml.generator.table.clazz.field.definition.ISqmlTableClassFieldDefinition;
import com.softicar.sqml.generator.table.clazz.printer.SqmlTableClassPrinter;

class SqmlTableClassForeignObjectFieldPrinter extends SqmlTableClassFieldPrinter {

	public SqmlTableClassForeignObjectFieldPrinter(SqmlTableClassPrinter classPrinter, ISqmlTableClassFieldDefinition fieldDefinition) {

		super(classPrinter, fieldDefinition);
	}

	@Override
	public String getFieldType() {

		classPrinter.addImport(IDbForeignField.class);
		classPrinter.addImport(fieldDefinition.getValueClass());
		return String
			.format(//
				"%s<%s, %s>",
				IDbForeignField.class.getSimpleName(),
				classPrinter.getSimpleClassName(),
				fieldDefinition.getValueClass().getSimpleName());
	}

	@Override
	protected String getCreateFieldFunctionNameSuffix() {

		return String.format("ForeignField");
	}

	@Override
	protected String getFieldFactoryParameters() {

		return ", " + fieldDefinition.getValueClass().getSimpleName() + ".ID";
	}
}
