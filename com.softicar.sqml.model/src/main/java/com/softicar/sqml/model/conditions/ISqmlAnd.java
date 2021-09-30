package com.softicar.sqml.model.conditions;

import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.expressions.ISqmlExpression;

public interface ISqmlAnd extends ISqmlCondition {

	ISqmlExpression getLeft();

	ISqmlExpression getRight();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	default String getOperator() {

		return "AND";
	}
}
