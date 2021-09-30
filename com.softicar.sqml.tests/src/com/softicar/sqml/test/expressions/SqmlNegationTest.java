package com.softicar.sqml.test.expressions;

import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.expressions.ISqmlAddition;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.expressions.ISqmlNegation;
import com.softicar.sqml.model.literals.ISqmlIntegerLiteral;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlQueryTest;
import org.junit.Test;

public class SqmlNegationTest extends AbstractSqmlTest {

	@Test
	public void testSimple() {

		SqmlQueryTest query = createQueryTest()//
			.add("SELECT -33 AS x")
			.assertGeneratedSelect("SELECT - 33 AS x");

		ISqmlExpression expression = query.getSelect().getColumn("x").getExpression();
		assertTrue(expression instanceof ISqmlNegation);

		ISqmlNegation negation = (ISqmlNegation) expression;
		assertSame(SqmlBuiltInTypes.getIntegerType(), negation.getSqmlType());
		assertTrue(negation.getExpression() instanceof ISqmlIntegerLiteral);
	}

	@Test
	public void testWithAddition() {

		parser.loadLanguagePackage();

		SqmlQueryTest query = createQueryTest()//
			.add("SELECT -22 + -33 AS x")
			.assertGeneratedSelect("SELECT - 22 + - 33 AS x");

		ISqmlExpression expression = query.getSelect().getColumn("x").getExpression();
		assertTrue(expression instanceof ISqmlAddition);

		ISqmlAddition addition = (ISqmlAddition) expression;
		assertTrue(addition.getLeft() instanceof ISqmlNegation);
		assertTrue(addition.getRight() instanceof ISqmlNegation);
	}
}
