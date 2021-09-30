package com.softicar.sqml.model.literals;

import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.types.ISqmlType;
import java.math.BigDecimal;

public interface ISqmlDoubleLiteral extends ISqmlLiteral<BigDecimal> {

	@Override
	BigDecimal getValue();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default ISqmlType getSqmlType() {

		return SqmlLiterals.getDoubleType();
	}

	@Override
	default String getStringValue() {

		return getValue() + "";
	}

	@Override
	default <T> T convert(ISqmlLiteralConverter<T> converter) {

		return converter.convertDouble(this);
	}
}
