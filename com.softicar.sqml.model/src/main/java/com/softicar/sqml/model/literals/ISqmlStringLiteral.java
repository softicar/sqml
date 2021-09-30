package com.softicar.sqml.model.literals;

import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.types.ISqmlType;

public interface ISqmlStringLiteral extends ISqmlLiteral<String> {

	@Override
	String getValue();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default ISqmlType getSqmlType() {

		return SqmlLiterals.getStringType();
	}

	@Override
	default String getStringValue() {

		return getValue();
	}

	@Override
	default <T> T convert(ISqmlLiteralConverter<T> converter) {

		return converter.convertString(this);
	}
}
