package com.softicar.sqml.model.conditions;

import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.expressions.ISqmlExpression;

public interface ISqmlIsNull extends ISqmlCondition {

	boolean isNot();

	ISqmlExpression getOperand();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}
}
