package com.softicar.sqml.model.literals;

import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.types.ISqmlType;

public interface ISqmlIntegerLiteral extends ISqmlLiteral<Integer> {

	@Override
	Integer getValue();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default ISqmlType getSqmlType() {

		return SqmlLiterals.getIntegerType();
	}

	@Override
	default String getStringValue() {

		return getValue() + "";
	}

	@Override
	default <T> T convert(ISqmlLiteralConverter<T> converter) {

		return converter.convertInteger(this);
	}
}
