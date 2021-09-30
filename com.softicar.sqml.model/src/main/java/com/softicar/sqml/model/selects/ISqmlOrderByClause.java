package com.softicar.sqml.model.selects;

import com.softicar.sqml.model.ISqmlModelVisitor;
import java.util.List;

public interface ISqmlOrderByClause extends ISqmlSelectPart {

	List<? extends ISqmlOrderByExpression> getExpressions();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}
}
