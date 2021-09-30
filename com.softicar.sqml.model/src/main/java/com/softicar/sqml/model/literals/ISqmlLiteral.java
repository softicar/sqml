package com.softicar.sqml.model.literals;

import com.softicar.sqml.model.expressions.ISqmlExpression;

public interface ISqmlLiteral<V> extends ISqmlExpression {

	V getValue();

	String getStringValue();

	<T> T convert(ISqmlLiteralConverter<T> converter);
}
