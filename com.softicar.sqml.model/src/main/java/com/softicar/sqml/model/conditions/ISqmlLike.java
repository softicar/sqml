package com.softicar.sqml.model.conditions;

import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.expressions.ISqmlExpression;

public interface ISqmlLike extends ISqmlCondition {

	boolean isNot();

	ISqmlExpression getLeft();

	ISqmlExpression getRight();

	String getEscape();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}
}
