package com.softicar.sqml.model.expressions;

import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.selects.ISqmlSelect;
import com.softicar.sqml.model.types.ISqmlType;

public interface ISqmlSubSelect extends ISqmlExpression {

	ISqmlSelect getSelect();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default ISqmlType getSqmlType() {

		return getSelect().getSqmlType();
	}
}
