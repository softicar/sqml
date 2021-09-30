package com.softicar.sqml.test.selects;

import com.softicar.sqml.model.selects.validation.SqmlIssueMultipleFromClauses;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlTestCases;
import org.junit.Test;

public class SqmlFromClauseTest extends AbstractSqmlTest {

	@Test
	public void testMultipleFroms() {

		SqmlTestCases.loadDeliveryTestCase(parser);

		createQueryTest()
			.add("SELECT i1.id")
			.add("FROM Item i1")
			.add("FROM Item i2")
			.assertIssue(SqmlIssueMultipleFromClauses.class, 4)
			.assertIssue(SqmlIssueMultipleFromClauses.class, 5);
	}
}
