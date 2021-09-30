package com.softicar.sqml.test.utils;

import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.validation.ISqmlIssue;
import com.softicar.sqml.test.parser.SqmlTestParser;
import org.junit.Assert;

public class SqmlExpressionTest {

	private final SqmlTestParser parser;
	private final String expression;
	private SqmlQueryTest queryTest;
	private String sqmlSuffix;
	private String sqlSuffix;

	public SqmlExpressionTest(SqmlTestParser parser, String expression) {

		this.parser = parser;
		this.expression = expression;
		this.queryTest = null;
		this.sqmlSuffix = "";
		this.sqlSuffix = "";
	}

	public SqmlExpressionTest setSuffix(String sqmlSuffix, String sqlSuffix) {

		this.sqmlSuffix = " " + sqmlSuffix;
		this.sqlSuffix = " " + sqlSuffix;

		return this;
	}

	public ISqmlExpression getExpression() {

		return getQueryTest().getSelect().getColumns().get(0).getExpression();
	}

	public SqmlExpressionTest assertError(Class<? extends ISqmlIssue> errorClass, int expectedLine) {

		getQueryTest().assertIssue(errorClass, expectedLine);
		return this;
	}

	public SqmlExpressionTest assertNoErrors() {

		getQueryTest().assertNoIssues();
		return this;
	}

	public SqmlExpressionTest assertSqmlType(ISqmlType expectedType) {

		ISqmlType sqmlType = getQueryTest().getSelect().getColumn("x").getExpression().getSqmlType();
		if (!sqmlType.is(expectedType)) {
			Assert
				.fail(
					String
						.format(//
							"Expected expression to be of type '%s' but was '%s'.",
							expectedType.getDisplayName(),
							sqmlType.getDisplayName()));
		}
		return this;
	}

	public SqmlExpressionTest assertGeneratedSql(String sql) {

		getQueryTest().assertGeneratedSelect("SELECT " + sql + " AS x" + sqlSuffix);
		return this;
	}

	private SqmlQueryTest getQueryTest() {

		if (queryTest == null) {
			this.queryTest = new SqmlQueryTest(parser);
			this.queryTest.add("SELECT " + expression + " AS x" + sqmlSuffix);
		}

		return queryTest;
	}
}
