package com.softicar.sqml.generator.table.clazz.field.printer;

import com.softicar.platform.common.code.java.JavaClass;
import com.softicar.platform.db.runtime.field.IDbIdField;
import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.sqml.generator.table.clazz.field.definition.ISqmlTableClassFieldDefinition;
import com.softicar.sqml.generator.table.clazz.printer.SqmlTableClassPrinter;

class SqmlTableClassIdFieldPrinter extends SqmlTableClassFieldPrinter {

	public SqmlTableClassIdFieldPrinter(SqmlTableClassPrinter classPrinter, ISqmlTableClassFieldDefinition fieldDefinition) {

		super(classPrinter, fieldDefinition);
	}

	@Override
	protected String getCreateFieldFunctionNameSuffix() {

		return fieldDefinition.getFieldType() == SqlFieldType.LONG? "IdFieldForLong" : "IdField";
	}

	@Override
	protected JavaClass getFieldClass() {

		return new JavaClass(IDbIdField.class);
	}
}
