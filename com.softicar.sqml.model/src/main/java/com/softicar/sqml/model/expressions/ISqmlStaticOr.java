package com.softicar.sqml.model.expressions;

public interface ISqmlStaticOr extends ISqmlStaticExpression {

	ISqmlStaticExpression getLeft();

	ISqmlStaticExpression getRight();

	@Override
	default String getJavaCode() {

		return getLeft().getJavaCode() + " || " + getRight().getJavaCode();
	}
}
