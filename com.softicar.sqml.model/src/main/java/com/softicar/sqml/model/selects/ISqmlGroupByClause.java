package com.softicar.sqml.model.selects;

import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import java.util.List;

public interface ISqmlGroupByClause extends ISqmlSelectPart {

	List<? extends ISqmlExpression> getExpressions();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}
}
