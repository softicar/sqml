package com.softicar.sqml.model.selects;

import com.softicar.sqml.model.ISqmlModelVisitor;
import java.util.List;

public interface ISqmlSelectClause extends ISqmlSelectPart {

	boolean isDistinct();

	@Override
	List<? extends ISqmlSelectColumn> getColumns();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}
}
