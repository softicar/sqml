package com.softicar.sqml.model.selects;

import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.expressions.ISqmlStaticExpression;
import java.util.List;

public interface ISqmlSelectElseIf extends ISqmlSelectPart {

	ISqmlStaticExpression getCondition();

	List<? extends ISqmlSelectPart> getParts();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}
}
