package com.softicar.sqml.test.utils;

import com.softicar.platform.common.string.Imploder;
import com.softicar.sqml.test.parser.SqmlTestParser;
import java.util.ArrayList;
import java.util.List;

public class SqmlExpressionBatchTest {

	private final SqmlTestParser parser;
	private final List<String> sqmlExpressions;
	private final List<String> sqlExpressions;
	private String sqmlSuffix;
	private String sqlSuffix;

	public SqmlExpressionBatchTest(SqmlTestParser parser) {

		this.parser = parser;
		this.sqmlExpressions = new ArrayList<>();
		this.sqlExpressions = new ArrayList<>();
		this.sqmlSuffix = null;
		this.sqlSuffix = "";
	}

	public SqmlExpressionBatchTest setSuffix(String sqmlSuffix, String sqlSuffix) {

		this.sqmlSuffix = sqmlSuffix;
		this.sqlSuffix = " " + sqlSuffix;
		return this;
	}

	public SqmlExpressionBatchTest addExpression(String sqmlExpression, String sqlExpression) {

		sqmlExpressions.add(sqmlExpression + " AS e" + sqmlExpressions.size());
		sqlExpressions.add(sqlExpression + " AS e" + sqlExpressions.size());
		return this;
	}

	public void check() {

		SqmlQueryTest queryTest = new SqmlQueryTest(parser);
		for (int i = 0; i < sqmlExpressions.size(); ++i) {
			if (i == 0) {
				queryTest.add("SELECT " + sqmlExpressions.get(i));
			} else {
				queryTest.add("," + sqmlExpressions.get(i));
			}
		}

		if (sqmlSuffix != null) {
			queryTest.add(sqmlSuffix);
		}

		queryTest.assertGeneratedSelect("SELECT " + Imploder.implode(sqlExpressions, ", ") + sqlSuffix);
	}
}
