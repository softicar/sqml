package com.softicar.sqml.test.selects;

import com.softicar.sqml.model.selects.validation.SqmlIssueTableVariableNameNotLowerCamelCase;
import com.softicar.sqml.model.validation.SqmlIssueType;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlTestCases;
import org.junit.Test;

public class SqmlTableVariableTest extends AbstractSqmlTest {

	@Test
	public void testRobustness() {

		createQueryTest().add("SELECT t").add("FROM T t").assertIssue(SqmlIssueType.UNRESOLVED_PROXY, 4);
	}

	@Test
	public void testNonLowerCamelCaseName() {

		SqmlTestCases.loadStockTestCase(parser);

		createQueryTest()//
			.add("SELECT STOCK.*")
			.add("FROM Stock STOCK")
			.assertIssue(SqmlIssueTableVariableNameNotLowerCamelCase.class, 4)
			.assertNoMoreIssues();
	}
}
