package com.softicar.sqml.model.literals;

import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.types.ISqmlType;

public interface ISqmlBooleanLiteral extends ISqmlLiteral<Boolean> {

	boolean isTrue();

	@Override
	default Boolean getValue() {

		return isTrue();
	}

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default ISqmlType getSqmlType() {

		return SqmlLiterals.getBooleanType();
	}

	@Override
	default String getStringValue() {

		if (isTrue()) {
			return "1";
		} else {
			return "0";
		}
	}

	@Override
	default <T> T convert(ISqmlLiteralConverter<T> converter) {

		return converter.convertBoolean(this);
	}
}
