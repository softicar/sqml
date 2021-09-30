package com.softicar.sqml.model.literals;

public interface ISqmlLiteralConverter<T> {

	T convertBoolean(ISqmlBooleanLiteral literal);

	T convertDecimal(ISqmlDecimalLiteral literal);

	T convertDouble(ISqmlDoubleLiteral literal);

	T convertFloat(ISqmlFloatLiteral literal);

	T convertInteger(ISqmlIntegerLiteral literal);

	T convertLong(ISqmlLongLiteral literal);

	T convertString(ISqmlStringLiteral literal);
}
