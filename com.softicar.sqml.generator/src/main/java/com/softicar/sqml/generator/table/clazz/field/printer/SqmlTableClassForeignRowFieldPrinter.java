package com.softicar.sqml.generator.table.clazz.field.printer;

import com.softicar.platform.db.runtime.field.IDbForeignRowField;
import com.softicar.sqml.generator.table.clazz.field.definition.ISqmlTableClassFieldDefinition;
import com.softicar.sqml.generator.table.clazz.field.utils.SqmlTableClassFieldNameDeterminer;
import com.softicar.sqml.generator.table.clazz.printer.SqmlTableClassPrinter;

class SqmlTableClassForeignRowFieldPrinter extends SqmlTableClassFieldPrinter {

	private final ISqmlTableClassFieldDefinition targetFieldDefinition;

	public SqmlTableClassForeignRowFieldPrinter(SqmlTableClassPrinter classPrinter, ISqmlTableClassFieldDefinition fieldDefinition) {

		super(classPrinter, fieldDefinition);

		this.targetFieldDefinition = fieldDefinition.getForeignKeyTargetFieldDefinition().get();
	}

	@Override
	public String getFieldType() {

		classPrinter.addImport(IDbForeignRowField.class);
		classPrinter.addImport(fieldDefinition.getValueClass());
		classPrinter.addImport(targetFieldDefinition.getValueClass());
		return String
			.format(
				"%s<%s, %s, %s>",
				IDbForeignRowField.class.getSimpleName(),
				classPrinter.getSimpleClassName(),
				fieldDefinition.getValueClass().getSimpleName(),
				targetFieldDefinition.getValueClass().getSimpleName());
	}

	@Override
	protected String getCreateFieldFunctionNameSuffix() {

		return String.format("ForeignRowField");
	}

	@Override
	protected String getFieldFactoryParameters() {

		SqmlTableClassFieldNameDeterminer pkFieldNameDeterminer = new SqmlTableClassFieldNameDeterminer(classPrinter.getConfig(), targetFieldDefinition);
		return ", " + fieldDefinition.getValueClass().getSimpleName() + "." + pkFieldNameDeterminer.getStaticFinalName();
	}
}
