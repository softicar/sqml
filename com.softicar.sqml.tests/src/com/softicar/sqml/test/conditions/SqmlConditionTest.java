package com.softicar.sqml.test.conditions;

import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlConditionTest extends AbstractSqmlTest {

	@Test
	public void testConditions() {

		verifyBoolean(CONDITIONS_FACTORY.createSqmlNot());
		verifyBoolean(CONDITIONS_FACTORY.createSqmlExists());
		verifyBoolean(CONDITIONS_FACTORY.createSqmlComparison());
		verifyBoolean(CONDITIONS_FACTORY.createSqmlLike());
		verifyBoolean(CONDITIONS_FACTORY.createSqmlIsNull());
		verifyBoolean(CONDITIONS_FACTORY.createSqmlBetween());
		verifyBoolean(CONDITIONS_FACTORY.createSqmlIn());
		verifyBoolean(CONDITIONS_FACTORY.createSqmlRegexp());
	}

	// verifies that the given expression is of boolean type
	private void verifyBoolean(ISqmlExpression expression) {

		assertTrue(expression.getSqmlType().is(SqmlBuiltInTypes.getBooleanType()));
	}
}
