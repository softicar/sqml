package com.softicar.sqml.model.literals;

import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.types.ISqmlType;

public interface ISqmlLongLiteral extends ISqmlLiteral<Long> {

	@Override
	Long getValue();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default ISqmlType getSqmlType() {

		return SqmlLiterals.getLongType();
	}

	@Override
	default String getStringValue() {

		return getValue() + "";
	}

	@Override
	default <T> T convert(ISqmlLiteralConverter<T> converter) {

		return converter.convertLong(this);
	}
}
