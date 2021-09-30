package com.softicar.sqml.test.selects;

import com.softicar.sqml.model.selects.validation.SqmlIssueLateDistincts;
import com.softicar.sqml.model.selects.validation.SqmlIssueMultipleDistincts;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlTestCases;
import org.junit.Test;

public class SqmlSelectDistinctTest extends AbstractSqmlTest {

	@Test
	public void testDistinctWithSingleSelectClause() {

		SqmlTestCases.loadDeliveryTestCase(parser);

		createQueryTest()
			.add("SELECT DISTINCT i.delivery, i.charge")
			.add("FROM Item i")
			.assertGeneratedSelect("SELECT DISTINCT i.delivery AS delivery, i.charge AS charge FROM db.item AS i");
	}

	@Test
	public void testDistinctWithMultipleSelectClauses() {

		SqmlTestCases.loadDeliveryTestCase(parser);

		createQueryTest()
			.add("SELECT DISTINCT i.delivery, i.charge")
			.add("SELECT i.id")
			.add("FROM Item i")
			.assertGeneratedSelect("SELECT DISTINCT i.delivery AS delivery, i.charge AS charge, i.id AS id FROM db.item AS i");
	}

	@Test
	public void testMultipleDistincts() {

		SqmlTestCases.loadDeliveryTestCase(parser);

		createQueryTest()
			.add("SELECT DISTINCT i.delivery")
			.add("SELECT DISTINCT i.charge")
			.add("FROM Item i")
			.assertIssue(SqmlIssueMultipleDistincts.class, 3)
			.assertIssue(SqmlIssueMultipleDistincts.class, 4)
			.assertIssue(SqmlIssueLateDistincts.class, 4)
			.assertNoMoreIssues();
	}

	@Test
	public void testLateDistinct() {

		SqmlTestCases.loadDeliveryTestCase(parser);

		createQueryTest()
			.add("SELECT i.delivery")
			.add("SELECT DISTINCT i.charge")
			.add("FROM Item i")
			.assertIssue(SqmlIssueLateDistincts.class, 4)
			.assertNoMoreIssues();
	}
}
