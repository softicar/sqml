package com.softicar.sqml.test.functions;

import com.softicar.sqml.model.builtin.functions.SqmlBuiltInFunctions;
import com.softicar.sqml.model.conditions.ISqmlComparison;
import com.softicar.sqml.model.expressions.ISqmlAddition;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.expressions.validation.SqmlIssueUnresolvedBinaryOperator;
import com.softicar.sqml.model.expressions.validation.SqmlIssueUnresolvedFunctionCall;
import com.softicar.sqml.model.expressions.validation.SqmlIssueUnresolvedPathTarget;
import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.functions.ISqmlFunction;
import com.softicar.sqml.model.validation.SqmlIssueType;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlBinaryOperationTest extends AbstractSqmlTest {

	@Test
	public void testWithUndefinedParameterType() {

		createQueryTest()//
			.add("SELECT foo + '' + '' AS x")
			.assertIssue(SqmlIssueUnresolvedPathTarget.class, 3)
			.assertIssue(SqmlIssueUnresolvedBinaryOperator.class, 3);
	}

	@Test
	public void prefersLinkingToBuiltInOperator() {

		ISqmlFile file = createFileTest("Query.sqml")//
			.add("PACKAGE com.example")
			.add()
			.add("FUNCTION Boolean =(Integer a, Integer b) {")
			.add("    SQL {$a = $b}")
			.add("}")
			.add()
			.add("QUERY Query {")
			.add("    SELECT 1 = 2 AS x")
			.add("}")
			.getFile();

		ISqmlExpression expression = file.getQuery("Query").getSelect().getColumn("x").getExpression();
		assertTrue(expression instanceof ISqmlComparison);

		ISqmlComparison comparison = (ISqmlComparison) expression;
		assertNotSame(file.getFunction("="), comparison.getFunction());
		assertSame(getBuiltInFunction("=(Integer,Integer)"), comparison.getFunction());
	}

	@Test
	public void testLanguagePackage() {

		parser.loadLanguagePackage();
		createExpressionTest("1 = 2").assertNoErrors();
		createExpressionTest("1 = 2").assertNoErrors();
		createExpressionTest("1 = 2").assertNoErrors();
	}

	@Test
	public void linksOperatorCallToOperatorFunction() {

		ISqmlFile file = createFileTest("Query.sqml")//
			.add("PACKAGE com.example")
			.add()
			.add("FUNCTION Integer +(Integer a, Integer b) {")
			.add("    SQL {$a + $b}")
			.add("}")
			.add()
			.add("QUERY Query {")
			.add("    SELECT 1 + 2 AS x")
			.add("}")
			.getFile();

		ISqmlExpression expression = file.getQuery("Query").getSelect().getColumn("x").getExpression();
		assertTrue(expression instanceof ISqmlAddition);

		ISqmlAddition addition = (ISqmlAddition) expression;
		assertSame(file.getFunction("+"), addition.getFunction());
	}

	@Test
	public void checksForUnmatchedOperatorCall() {

		createFileTest("Query.sqml")//
			.add("PACKAGE com.example")
			.add()
			.add("FUNCTION Integer +(Integer a, Integer b) {")
			.add("    SQL {$a + $b}")
			.add("}")
			.add()
			.add("QUERY Query {")
			.add("    SELECT 1 - 2 AS x")
			.add("}")
			.assertIssue(SqmlIssueUnresolvedBinaryOperator.class, 8)
			.assertIssue(SqmlIssueUnresolvedFunctionCall.class, 8)
			.assertIssue(SqmlIssueType.UNRESOLVED_PROXY, 8)
			.assertNoMoreIssues();
	}

	private ISqmlFunction getBuiltInFunction(String signature) {

		return SqmlBuiltInFunctions.get().findFunctionBySimpleSignature(signature).get();
	}
}
