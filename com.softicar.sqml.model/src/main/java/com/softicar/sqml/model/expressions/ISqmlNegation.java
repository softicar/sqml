package com.softicar.sqml.model.expressions;

import com.softicar.sqml.model.ISqmlModelVisitor;

public interface ISqmlNegation extends ISqmlUnaryOperation {

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}
}
