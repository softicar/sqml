package com.softicar.sqml.test.expressions;

import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.expressions.validation.SqmlIssueAmbiguousFunctionCall;
import com.softicar.sqml.model.expressions.validation.SqmlIssueIncompatibleFunctionCallArguments;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.validation.ISqmlIssue;
import org.junit.Test;

public class SqmlAdditionTest extends AbstractSqmlBinaryOperationTest {

	@Test
	public void testInteger() {

		testAddition("i", "i", SqmlBuiltInTypes.getIntegerType());
		testAddition("i", "l", SqmlBuiltInTypes.getLongType());
		testAddition("i", "f", SqmlIssueAmbiguousFunctionCall.class);
		testAddition("i", "d", SqmlBuiltInTypes.getDoubleType());
		testAddition("i", "m", SqmlBuiltInTypes.getDecimalType());
		testAddition("i", "s", SqmlIssueIncompatibleFunctionCallArguments.class);
	}

	@Test
	public void testLong() {

		testAddition("l", "i", SqmlBuiltInTypes.getLongType());
		testAddition("l", "l", SqmlBuiltInTypes.getLongType());
		testAddition("l", "f", SqmlBuiltInTypes.getDecimalType());
		testAddition("l", "d", SqmlBuiltInTypes.getDecimalType());
		testAddition("l", "m", SqmlBuiltInTypes.getDecimalType());
		testAddition("l", "s", SqmlIssueIncompatibleFunctionCallArguments.class);
	}

	@Test
	public void testFloat() {

		testAddition("f", "i", SqmlIssueAmbiguousFunctionCall.class);
		testAddition("f", "l", SqmlBuiltInTypes.getDecimalType());
		testAddition("f", "f", SqmlBuiltInTypes.getFloatType());
		testAddition("f", "d", SqmlBuiltInTypes.getDoubleType());
		testAddition("f", "m", SqmlBuiltInTypes.getDecimalType());
		testAddition("f", "s", SqmlIssueIncompatibleFunctionCallArguments.class);
	}

	@Test
	public void testDouble() {

		testAddition("d", "i", SqmlBuiltInTypes.getDoubleType());
		testAddition("d", "l", SqmlBuiltInTypes.getDecimalType());
		testAddition("d", "f", SqmlBuiltInTypes.getDoubleType());
		testAddition("d", "d", SqmlBuiltInTypes.getDoubleType());
		testAddition("d", "m", SqmlBuiltInTypes.getDecimalType());
		testAddition("d", "s", SqmlIssueIncompatibleFunctionCallArguments.class);
	}

	@Test
	public void testDecimal() {

		testAddition("m", "i", SqmlBuiltInTypes.getDecimalType());
		testAddition("m", "l", SqmlBuiltInTypes.getDecimalType());
		testAddition("m", "f", SqmlBuiltInTypes.getDecimalType());
		testAddition("m", "d", SqmlBuiltInTypes.getDecimalType());
		testAddition("m", "m", SqmlBuiltInTypes.getDecimalType());
		testAddition("m", "s", SqmlIssueIncompatibleFunctionCallArguments.class);
	}

	@Test
	public void testStrings() {

		createExpressionTest("'1' + '2'").assertGeneratedSql("CONCAT('1', '2')").assertSqmlType(SqmlBuiltInTypes.getStringType());
		createExpressionTest("'3' - '4'").assertError(SqmlIssueIncompatibleFunctionCallArguments.class, 3);
	}

	private void testAddition(String type1, String type2, ISqmlType expectedType) {

		test(type1, "+", type2, expectedType);
		test(type1, "-", type2, expectedType);
	}

	private void testAddition(String type1, String type2, Class<? extends ISqmlIssue> errorClass) {

		test(type1, "+", type2, errorClass);
		test(type1, "-", type2, errorClass);
	}
}
