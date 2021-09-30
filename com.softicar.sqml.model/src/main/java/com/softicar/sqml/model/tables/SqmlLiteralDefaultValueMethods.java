package com.softicar.sqml.model.tables;

import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.literals.ISqmlLiteral;
import com.softicar.sqml.model.types.ISqmlType;

public class SqmlLiteralDefaultValueMethods {

	public static ISqmlType getSqmlType(ISqmlLiteralDefaultValue defaultValue) {

		ISqmlLiteral<?> literal = defaultValue.getLiteral();
		return literal != null? literal.getSqmlType() : SqmlBuiltInTypes.getUnknownType();
	}

	public static String getStringValue(ISqmlLiteralDefaultValue defaultValue) {

		ISqmlLiteral<?> literal = defaultValue.getLiteral();
		if (defaultValue.isMinus()) {
			return "-" + literal.getStringValue();
		} else {
			return literal.getStringValue();
		}
	}
}
