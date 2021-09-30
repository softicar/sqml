package com.softicar.sqml.model.expressions;

import com.softicar.sqml.model.ISqmlModelVisitor;

public interface ISqmlMultiplication extends ISqmlBinaryOperation {

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}
}
