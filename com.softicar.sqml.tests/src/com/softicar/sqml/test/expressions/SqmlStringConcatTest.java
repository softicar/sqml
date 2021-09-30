package com.softicar.sqml.test.expressions;

import com.softicar.sqml.model.expressions.validation.SqmlIssueIncompatibleFunctionCallArguments;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlTestCases;
import org.junit.Test;

public class SqmlStringConcatTest extends AbstractSqmlTest {

	@Test
	public void testLiteralConcatenation() {

		parser.loadLanguagePackage();
		createQueryTest()//
			.add("SELECT 'Hello' + ' ' + 'World' + '!' AS x")
			.assertGeneratedSelect("SELECT CONCAT(CONCAT(CONCAT('Hello', ' '), 'World'), '!') AS x");
	}

	@Test
	public void testEnumStringConcatenation() {

		parser.loadLanguagePackage();

		createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("State state")
			.add("Prio prio")
			.add()
			.add("ENUM State ON String {")
			.add("    ONE = '1'")
			.add("    TWO = '2'")
			.add("}")
			.add()
			.add("ENUM Prio ON Integer {")
			.add("    LOW = 1")
			.add("    HIGH = 2")
			.add("}")
			.assertNoIssues();

		createQueryTest()//
			.add("SELECT")
			.add("    'foo:' + f.state AS a,")
			.add("    f.state + ':foo' AS b")
			.add("FROM Foo f")
			.assertNoIssues()
			.assertGeneratedSelect("SELECT CONCAT('foo:', f.state) AS a, CONCAT(f.state, ':foo') AS b FROM db.foo AS f");

		createQueryTest()//
			.add("SELECT")
			.add("    'foo:' + f.prio AS a,")
			.add("    f.prio + ':foo' AS b")
			.add("FROM Foo f")
			.assertIssue(SqmlIssueIncompatibleFunctionCallArguments.class, 4)
			.assertIssue(SqmlIssueIncompatibleFunctionCallArguments.class, 5);
	}

	@Test
	public void testInvalidConcatenation() {

		SqmlTestCases.loadDeliveryTestCase(parser);

		createQueryTest()//
			.add("SELECT")
			.add("'Hello' + i, ")
			.add("i + 'Hello'  ")
			.add("FROM Item i")
			.assertIssue(SqmlIssueIncompatibleFunctionCallArguments.class, 4)
			.assertIssue(SqmlIssueIncompatibleFunctionCallArguments.class, 5);
	}
}
