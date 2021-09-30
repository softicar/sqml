package com.softicar.sqml.model.selects;

import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.expressions.ISqmlExpression;

public interface ISqmlOrderByExpression extends ISqmlModelElement {

	ISqmlExpression getExpression();

	boolean isDescending();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}
}
