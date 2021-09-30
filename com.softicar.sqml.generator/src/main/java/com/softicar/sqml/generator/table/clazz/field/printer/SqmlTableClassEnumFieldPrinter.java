package com.softicar.sqml.generator.table.clazz.field.printer;

import com.softicar.platform.common.code.java.JavaClass;
import com.softicar.platform.db.runtime.field.IDbEnumField;
import com.softicar.platform.db.sql.SqlValueCompare;
import com.softicar.sqml.generator.table.clazz.field.definition.ISqmlTableClassFieldDefinition;
import com.softicar.sqml.generator.table.clazz.printer.SqmlTableClassPrinter;

class SqmlTableClassEnumFieldPrinter extends AbstractSqmlTableClassEnumFieldPrinter {

	public SqmlTableClassEnumFieldPrinter(SqmlTableClassPrinter classPrinter, ISqmlTableClassFieldDefinition fieldDefinition) {

		super(classPrinter, fieldDefinition);
	}

	@Override
	public String getCreateFieldFunctionNameSuffix() {

		return "EnumField";
	}

	@Override
	protected JavaClass getFieldClass() {

		return new JavaClass(IDbEnumField.class);
	}

	@Override
	protected void printEnumClassExtra() {

		classPrinter.addImport(com.softicar.platform.db.sql.SqlValueCompare.class);

		classPrinter.beginMethod("public %s<%s, %s> isTrue()", SqlValueCompare.class.getSimpleName(), classPrinter.getSimpleClassName(), getEnumClassName());
		classPrinter.println("return %s.Type.EQUAL.get(%s, this);", SqlValueCompare.class.getSimpleName(), nameDeterminer.getStaticFinalName());
		classPrinter.endBlock();

		classPrinter.beginMethod("public %s<%s, %s> isFalse()", SqlValueCompare.class.getSimpleName(), classPrinter.getSimpleClassName(), getEnumClassName());
		classPrinter.println("return %s.Type.NOT_EQUAL.get(%s, this);", SqlValueCompare.class.getSimpleName(), nameDeterminer.getStaticFinalName());
		classPrinter.endBlock();
	}
}
