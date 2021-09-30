package com.softicar.sqml.model.expressions;

public interface ISqmlStaticParentheses extends ISqmlStaticExpression {

	ISqmlStaticExpression getExpression();

	@Override
	default String getJavaCode() {

		return "(" + getExpression().getJavaCode() + ")";
	}
}
