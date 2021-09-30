package com.softicar.sqml.test.expressions;

import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.validation.ISqmlIssue;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Before;

public abstract class AbstractSqmlBinaryOperationTest extends AbstractSqmlTest {

	@Before
	public void before() {

		parser.loadLanguagePackage();

		createTableTest("T", "db.t")
			.add("PK Integer id = SERIAL")
			.add("Integer i")
			.add("Long l")
			.add("Float f")
			.add("Double d")
			.add("Decimal m [PRECISION=4,1]")
			.add("String s")
			.assertNoIssues();
	}

	protected void test(String type1, String operator, String type2, ISqmlType expectedType) {

		String expression = String.format("t.%s %s t.%s", type1, operator, type2);
		createExpressionTest(expression)//
			.setSuffix("FROM T t", "FROM db.t AS t")
			.assertNoErrors()
			.assertGeneratedSql(expression)
			.assertSqmlType(expectedType);
	}

	protected void test(String type1, String operator, String type2, Class<? extends ISqmlIssue> errorClass) {

		String expression = String.format("t.%s %s t.%s", type1, operator, type2);
		createExpressionTest(expression)//
			.setSuffix("FROM T t", "FROM db.t AS t")
			.assertError(errorClass, 3);
	}
}
