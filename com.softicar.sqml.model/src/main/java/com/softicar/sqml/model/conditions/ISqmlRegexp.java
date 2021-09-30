package com.softicar.sqml.model.conditions;

import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.expressions.ISqmlExpression;

public interface ISqmlRegexp extends ISqmlCondition {

	boolean isNot();

	ISqmlExpression getOperand();

	ISqmlExpression getRegexp();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}
}
