package com.softicar.sqml.model.expressions;

import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.types.ISqmlType;
import java.util.List;

public interface ISqmlStaticIf extends ISqmlExpression {

	List<? extends ISqmlStaticExpression> getConditions();

	List<? extends ISqmlExpression> getExpressions();

	ISqmlExpression getElseExpression();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default ISqmlType getSqmlType() {

		return getExpressions().get(0).getSqmlType();
	}
}
