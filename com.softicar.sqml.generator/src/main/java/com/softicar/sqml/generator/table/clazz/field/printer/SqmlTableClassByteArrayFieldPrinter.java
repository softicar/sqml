package com.softicar.sqml.generator.table.clazz.field.printer;

import com.softicar.platform.common.code.java.JavaClass;
import com.softicar.platform.db.runtime.field.IDbByteArrayField;
import com.softicar.sqml.generator.table.clazz.field.definition.ISqmlTableClassFieldDefinition;
import com.softicar.sqml.generator.table.clazz.printer.SqmlTableClassPrinter;

class SqmlTableClassByteArrayFieldPrinter extends SqmlTableClassFieldPrinter {

	public SqmlTableClassByteArrayFieldPrinter(SqmlTableClassPrinter classPrinter, ISqmlTableClassFieldDefinition fieldDefinition) {

		super(classPrinter, fieldDefinition);
	}

	@Override
	protected JavaClass getFieldClass() {

		return new JavaClass(IDbByteArrayField.class);
	}

	@Override
	protected String getCreateFieldFunctionNameSuffix() {

		return "ByteArrayField";
	}
}
