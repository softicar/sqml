package com.softicar.sqml.test.expressions;

import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.expressions.ISqmlRowConstructor;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlRowConstructorTest extends AbstractSqmlTest {

	@Test
	public void testTypeOfSingleValueRowConstructor() {

		ISqmlExpression implicitRow = createExpressionTest("(42)").getExpression();
		ISqmlExpression explicitRow = createExpressionTest("ROW(42)").getExpression();

		assertTrue(implicitRow instanceof ISqmlRowConstructor);
		assertTrue(explicitRow instanceof ISqmlRowConstructor);

		ISqmlType expectedImplicitType = SqmlBuiltInTypes.getIntegerType();
		ISqmlType expectedExplicitType = SqmlBuiltInTypes.getTupleType().parameterize(expectedImplicitType);

		assertTrue(implicitRow.getSqmlType().is(expectedImplicitType));
		assertTrue(explicitRow.getSqmlType().is(expectedExplicitType));
	}

	@Test
	public void testTypeOfMultiValueRowConstructor() {

		ISqmlExpression implicitRow = createExpressionTest("(1, 'xxx', 3.4)").getExpression();
		ISqmlExpression explicitRow = createExpressionTest("ROW(1, 'xxx', 3.4)").getExpression();

		assertTrue(implicitRow instanceof ISqmlRowConstructor);
		assertTrue(explicitRow instanceof ISqmlRowConstructor);

		ISqmlType expectedType = SqmlBuiltInTypes
			.getTupleType()
			.parameterize(//
				SqmlBuiltInTypes.getIntegerType(),
				SqmlBuiltInTypes.getStringType(),
				SqmlBuiltInTypes.getDecimalType());

		assertTrue(implicitRow.getSqmlType().is(expectedType));
		assertTrue(explicitRow.getSqmlType().is(expectedType));
	}

	@Test
	public void testSqlGeneration() {

		parser.loadLanguagePackage();

		createQueryTest()
			.add("SELECT 1 AS one")
			.add("WHERE (1) = (2)")
			.add("WHERE ROW(1) = ROW(2)")
			.add("WHERE (1,2) = ROW(2,3)")
			.assertGeneratedSelect("SELECT 1 AS one WHERE (1) = (2) AND ROW(1) = ROW(2) AND (1, 2) = ROW(2, 3)");
	}
}
