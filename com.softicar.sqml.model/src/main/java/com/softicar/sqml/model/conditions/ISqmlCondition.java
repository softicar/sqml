package com.softicar.sqml.model.conditions;

import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.types.ISqmlType;

public interface ISqmlCondition extends ISqmlExpression {

	@Override
	default ISqmlType getSqmlType() {

		return SqmlBuiltInTypes.getBooleanType();
	}
}
