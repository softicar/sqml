package com.softicar.sqml.model.conditions;

import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.expressions.ISqmlExpression;

public interface ISqmlNot extends ISqmlCondition {

	ISqmlExpression getCondition();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}
}
