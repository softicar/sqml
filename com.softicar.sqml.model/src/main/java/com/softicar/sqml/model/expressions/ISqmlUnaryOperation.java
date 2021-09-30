package com.softicar.sqml.model.expressions;

import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.types.ISqmlType;

public interface ISqmlUnaryOperation extends ISqmlExpression {

	ISqmlExpression getExpression();

	@Override
	default ISqmlType getSqmlType() {

		ISqmlExpression expression = getExpression();
		return expression != null? expression.getSqmlType() : SqmlBuiltInTypes.getUnknownType();
	}
}
