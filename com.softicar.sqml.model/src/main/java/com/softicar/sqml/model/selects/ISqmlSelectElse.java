package com.softicar.sqml.model.selects;

import com.softicar.sqml.model.ISqmlModelVisitor;
import java.util.List;

public interface ISqmlSelectElse extends ISqmlSelectPart {

	List<? extends ISqmlSelectPart> getParts();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}
}
