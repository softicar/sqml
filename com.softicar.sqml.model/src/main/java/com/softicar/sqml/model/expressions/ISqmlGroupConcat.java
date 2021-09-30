package com.softicar.sqml.model.expressions;

import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.selects.ISqmlOrderByExpression;
import com.softicar.sqml.model.types.ISqmlType;
import java.util.List;

public interface ISqmlGroupConcat extends ISqmlExpression {

	boolean isDistinct();

	List<? extends ISqmlExpression> getExpressions();

	List<? extends ISqmlOrderByExpression> getOrderByExpressions();

	String getSeparator();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default ISqmlType getSqmlType() {

		return SqmlBuiltInTypes.getStringType();
	}
}
