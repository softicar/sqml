package com.softicar.sqml.model.functions;

import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.ISqmlModelVisitor;

public interface ISqmlSqlId extends ISqmlModelElement {

	String getIdentifier();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}
}
