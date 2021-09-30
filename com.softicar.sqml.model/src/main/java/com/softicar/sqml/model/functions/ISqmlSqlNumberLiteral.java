package com.softicar.sqml.model.functions;

import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.ISqmlModelVisitor;
import java.math.BigDecimal;

public interface ISqmlSqlNumberLiteral extends ISqmlModelElement {

	Integer getInteger();

	BigDecimal getDecimal();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	default BigDecimal getValue() {

		if (getDecimal() != null) {
			return getDecimal();
		} else {
			return BigDecimal.valueOf(getInteger());
		}
	}
}
