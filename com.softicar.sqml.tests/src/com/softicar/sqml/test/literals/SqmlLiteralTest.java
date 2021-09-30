package com.softicar.sqml.test.literals;

import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlLiteralTest extends AbstractSqmlTest {

	@Test
	public void testTypeOfLiterals() {

		assertType(BOOLEAN, LITERALS_FACTORY.createSqmlBooleanLiteral());
		assertType(INTEGER, LITERALS_FACTORY.createSqmlIntegerLiteral());
		assertType(LONG, LITERALS_FACTORY.createSqmlLongLiteral());
		assertType(FLOAT, LITERALS_FACTORY.createSqmlFloatLiteral());
		assertType(DOUBLE, LITERALS_FACTORY.createSqmlDoubleLiteral());
		assertType(DECIMAL, LITERALS_FACTORY.createSqmlDecimalLiteral());
		assertType(STRING, LITERALS_FACTORY.createSqmlStringLiteral());
	}

	@Test
	public void testTypeOfParsedLiterals() {

		assertTypeOfExpression(BOOLEAN, "TRUE");
		assertTypeOfExpression(BOOLEAN, "FALSE");
		assertTypeOfExpression(INTEGER, "23");
		assertTypeOfExpression(LONG, "23L");
		assertTypeOfExpression(FLOAT, "23.3f");
		assertTypeOfExpression(DOUBLE, "23.3d");
		assertTypeOfExpression(DECIMAL, "23.3");
		assertTypeOfExpression(STRING, "'23.3'");
	}

	@Test
	public void testNegativeNumericLiterals() {

		assertTypeOfExpression(INTEGER, "-23");
		assertTypeOfExpression(LONG, "-23L");
		assertTypeOfExpression(FLOAT, "-23.3f");
		assertTypeOfExpression(DOUBLE, "-23.3d");
		assertTypeOfExpression(DECIMAL, "-23.3");
	}

	@Test
	public void testLiterals() {

		createQueryTest()
			.add("SELECT")
			.add("1 AS one,")
			.add("2L AS two,")
			.add("3.03f AS three,")
			.add("4.04d AS four,")
			.add("5.05 AS five")
			.assertGeneratedSelect("SELECT 1 AS one, 2 AS two, 3.03 AS three, 4.04 AS four, 5.05 AS five");
	}

	@Test
	public void testNegativeLiterals() {

		createQueryTest()
			.add("SELECT")
			.add("-1 AS one,")
			.add("-2L AS two,")
			.add("-3.03f AS three,")
			.add("-4.04d AS four,")
			.add("-5.05 AS five")
			.assertGeneratedSelect("SELECT - 1 AS one, - 2 AS two, - 3.03 AS three, - 4.04 AS four, - 5.05 AS five");
	}
}
