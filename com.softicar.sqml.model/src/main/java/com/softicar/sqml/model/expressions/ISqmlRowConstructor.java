package com.softicar.sqml.model.expressions;

import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.types.ISqmlType;
import java.util.List;

public interface ISqmlRowConstructor extends ISqmlExpression {

	boolean isExplicit();

	List<? extends ISqmlExpression> getExpressions();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default ISqmlType getSqmlType() {

		return SqmlRowConstructors.getSqmlType(this);
	}
}
