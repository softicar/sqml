package com.softicar.sqml.test.selects;

import com.softicar.sqml.model.selects.validation.SqmlIssueJoinClauseConditionNotBoolean;
import com.softicar.sqml.model.selects.validation.SqmlIssueJoinClauseWithMissingOnCondition;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlTestCases;
import org.junit.Test;

public class SqmlJoinClauseTest extends AbstractSqmlTest {

	@Test
	public void testConditionalJoins() {

		SqmlTestCases.loadDeliveryTestCase(parser);

		createQueryTest()
			.add("Boolean join")
			.add("SELECT i.id")
			.add("FROM Item i")
			.add("#IF $join {")
			.add("    JOIN i.delivery d")
			.add("}")
			.assertNoIssues()
			.assertGeneratedSelect("SELECT i.id AS id FROM db.item AS i", false)
			.assertGeneratedSelect(
				new StringBuilder()
					.append("SELECT i.id AS id")
					.append(" FROM db.item AS i")
					.append(" JOIN db.delivery AS d")
					.append(" ON i.delivery = d.id")
					.toString(),
				true);
	}

	@Test
	public void testJoinByForeignKey() {

		SqmlTestCases.loadDeliveryTestCase(parser);

		createQueryTest()
			.add("SELECT i.id")
			.add("FROM Item i")
			.add("JOIN i.delivery d1")
			.add("LEFT JOIN i.delivery d2")
			.assertNoIssues()
			.assertGeneratedSelect(
				new StringBuilder()
					.append("SELECT i.id AS id FROM db.item AS i")
					.append(" JOIN db.delivery AS d1 ON i.delivery = d1.id")
					.append(" LEFT JOIN db.delivery AS d2 ON i.delivery = d2.id")
					.toString());
	}

	@Test
	public void testJoinByForeignKeyWithAdditionalCondition() {

		SqmlTestCases.loadDeliveryTestCase(parser);

		createQueryTest()
			.add("SELECT i.id")
			.add("FROM Item i")
			.add("JOIN i.delivery d")
			.add("ON d.supplier IS NOT NULL")
			.assertNoIssues()
			.assertGeneratedSelect(
				new StringBuilder()
					.append("SELECT i.id AS id FROM db.item AS i")
					.append(" JOIN db.delivery AS d")
					.append(" ON i.delivery = d.id")
					.append(" AND d.supplier IS NOT NULL")
					.toString());
	}

	@Test
	public void prohibitsNonBooleanConditions() {

		createQueryTest()
			.add("SELECT 1 AS one")
			.add("FROM (SELECT 2 AS two) a")
			.add("JOIN (SELECT 3 AS three) b ON 'foo'")
			.assertIssue(SqmlIssueJoinClauseConditionNotBoolean.class, 5);
	}

	@Test
	public void testJoinClauseWithMissingOnCondition() {

		createQueryTest()//
			.add("SELECT 1 AS one")
			.add("JOIN (SELECT 2 AS two) two")
			.assertIssue(SqmlIssueJoinClauseWithMissingOnCondition.class, 4);
	}
}
