package com.softicar.sqml.test.expressions;

import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.expressions.validation.SqmlIssueAmbiguousFunctionCall;
import com.softicar.sqml.model.expressions.validation.SqmlIssueIncompatibleFunctionCallArguments;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.validation.ISqmlIssue;
import org.junit.Test;

public class SqmlMultiplicationTest extends AbstractSqmlBinaryOperationTest {

	@Test
	public void testInteger() {

		testMultiplication("i", "i", SqmlBuiltInTypes.getIntegerType());
		testMultiplication("i", "l", SqmlBuiltInTypes.getLongType());
		testMultiplication("i", "f", SqmlIssueAmbiguousFunctionCall.class);
		testMultiplication("i", "d", SqmlBuiltInTypes.getDoubleType());
		testMultiplication("i", "m", SqmlBuiltInTypes.getDecimalType());
		testMultiplication("i", "s", SqmlIssueIncompatibleFunctionCallArguments.class);
	}

	@Test
	public void testLong() {

		testMultiplication("l", "i", SqmlBuiltInTypes.getLongType());
		testMultiplication("l", "l", SqmlBuiltInTypes.getLongType());
		testMultiplication("l", "f", SqmlBuiltInTypes.getDecimalType());
		testMultiplication("l", "d", SqmlBuiltInTypes.getDecimalType());
		testMultiplication("l", "m", SqmlBuiltInTypes.getDecimalType());
		testMultiplication("l", "s", SqmlIssueIncompatibleFunctionCallArguments.class);
	}

	@Test
	public void testFloat() {

		testMultiplication("f", "i", SqmlIssueAmbiguousFunctionCall.class);
		testMultiplication("f", "l", SqmlBuiltInTypes.getDecimalType());
		testMultiplication("f", "f", SqmlBuiltInTypes.getFloatType());
		testMultiplication("f", "d", SqmlBuiltInTypes.getDoubleType());
		testMultiplication("f", "m", SqmlBuiltInTypes.getDecimalType());
		testMultiplication("f", "s", SqmlIssueIncompatibleFunctionCallArguments.class);
	}

	@Test
	public void testDouble() {

		testMultiplication("d", "i", SqmlBuiltInTypes.getDoubleType());
		testMultiplication("d", "l", SqmlBuiltInTypes.getDecimalType());
		testMultiplication("d", "f", SqmlBuiltInTypes.getDoubleType());
		testMultiplication("d", "d", SqmlBuiltInTypes.getDoubleType());
		testMultiplication("d", "m", SqmlBuiltInTypes.getDecimalType());
		testMultiplication("d", "s", SqmlIssueIncompatibleFunctionCallArguments.class);
	}

	@Test
	public void testDecimal() {

		testMultiplication("m", "i", SqmlBuiltInTypes.getDecimalType());
		testMultiplication("m", "l", SqmlBuiltInTypes.getDecimalType());
		testMultiplication("m", "f", SqmlBuiltInTypes.getDecimalType());
		testMultiplication("m", "d", SqmlBuiltInTypes.getDecimalType());
		testMultiplication("m", "m", SqmlBuiltInTypes.getDecimalType());
		testMultiplication("m", "s", SqmlIssueIncompatibleFunctionCallArguments.class);
	}

	@Test
	public void testStrings() {

		createExpressionTest("'1' * '2'").assertError(SqmlIssueIncompatibleFunctionCallArguments.class, 3);
		createExpressionTest("'3' / '4'").assertError(SqmlIssueIncompatibleFunctionCallArguments.class, 3);
	}

	private void testMultiplication(String type1, String type2, ISqmlType expectedType) {

		test(type1, "*", type2, expectedType);
		test(type1, "/", type2, expectedType);
		test(type1, "%", type2, expectedType);
	}

	private void testMultiplication(String type1, String type2, Class<? extends ISqmlIssue> errorClass) {

		test(type1, "*", type2, errorClass);
		test(type1, "/", type2, errorClass);
		test(type1, "%", type2, errorClass);
	}
}
