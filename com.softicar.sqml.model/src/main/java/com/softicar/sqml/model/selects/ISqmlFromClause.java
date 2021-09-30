package com.softicar.sqml.model.selects;

import com.softicar.sqml.model.ISqmlModelVisitor;
import java.util.Collections;
import java.util.List;

public interface ISqmlFromClause extends ISqmlSelectPart {

	ISqmlVariable getVariable();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default List<? extends ISqmlVariable> getVariables() {

		return Collections.singletonList(getVariable());
	}

	@Override
	default List<? extends ISqmlFromClause> getFromClauses() {

		return Collections.singletonList(this);
	}
}
