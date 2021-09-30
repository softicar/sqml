package com.softicar.sqml.test.queries;

import com.softicar.sqml.model.queries.validation.SqmlIssueQueryNameNotEndingWithQueryWord;
import com.softicar.sqml.model.queries.validation.SqmlIssueQueryNameNotUpperCamelCase;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlQueryNameConventionTest extends AbstractSqmlTest {

	@Test
	public void testNonUpperCamelCaseQueryName() {

		createFileTest("myQuery.sqml")//
			.add("PACKAGE com.softicar.sqml")
			.add("QUERY myQuery {")
			.add("    SELECT 1 AS foo")
			.add("}")
			.assertIssue(SqmlIssueQueryNameNotUpperCamelCase.class, 2)
			.assertNoMoreIssues();
	}

	@Test
	public void testQueryNameNotEndingWithQuery() {

		createFileTest("MySelect.sqml")//
			.add("PACKAGE com.softicar.sqml")
			.add("QUERY MySelect {")
			.add("    SELECT 1 AS foo")
			.add("}")
			.assertIssue(SqmlIssueQueryNameNotEndingWithQueryWord.class, 2)
			.assertNoMoreIssues();
	}
}
