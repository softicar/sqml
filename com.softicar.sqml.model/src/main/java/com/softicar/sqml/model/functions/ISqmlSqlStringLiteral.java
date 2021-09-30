package com.softicar.sqml.model.functions;

import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.ISqmlModelVisitor;

public interface ISqmlSqlStringLiteral extends ISqmlModelElement {

	String getString();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}
}
