package com.softicar.sqml.test.expressions;

import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.expressions.validation.SqmlIssueIllegalDotStarSuffix;
import com.softicar.sqml.model.queries.ISqmlQuery;
import com.softicar.sqml.model.selects.ISqmlSelect;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.validation.SqmlIssueType;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlTestCases;
import org.junit.Test;

public class SqmlColumnReferenceTest extends AbstractSqmlTest {

	@Test
	public void testIdColumnAccess() {

		ISqmlTable x = createTableTest("X", "db.x")//
			.add("PK Integer id = SERIAL")
			.assertNoIssues()
			.getTable();
		createTableTest("Y", "db.y")//
			.add("PK Integer id = SERIAL")
			.add("X other")
			.assertNoIssues();

		ISqmlQuery query = createQueryTest()//
			.add("SELECT")
			.add("    y.other AS x,")
			.add("    y.other.id AS id")
			.add("FROM Y y")
			.assertNoIssues()
			.assertGeneratedSelect("SELECT y.other AS x, y.other AS id FROM db.y AS y")
			.getQuery();

		ISqmlSelect select = query.getSelect();
		assertTrue(select.getColumn("x").getExpression().getSqmlType().is(x));
		assertTrue(select.getColumn("id").getExpression().getSqmlType().is(SqmlBuiltInTypes.getIntegerType()));
	}

	@Test
	public void testIllegalIdColumnAccess() {

		createTableTest("X", "db.x")//
			.add("PK Integer id = SERIAL")
			.add("String name")
			.assertNoIssues();

		createTableTest("Y", "db.y")//
			.add("PK Integer id = SERIAL")
			.add("X other")
			.assertNoIssues();

		createQueryTest()
			.add("SELECT")
			.add("y.other.xxx AS x,")
			.add("y.id.id AS id")
			.add("FROM Y y")
			.assertIssue(SqmlIssueType.UNRESOLVED_PROXY, 4)
			.assertIssue(SqmlIssueType.UNRESOLVED_PROXY, 5);
	}

	@Test
	public void testSelectForeignColumnReference() {

		SqmlTestCases.loadDeliveryTestCase(parser);

		createQueryTest()//
			.add("SELECT i.delivery")
			.add("FROM Item i")
			.assertGeneratedSelect("SELECT i.delivery AS delivery FROM db.item AS i");
	}

	@Test
	public void testDotStarOnForeignColumnReference() {

		SqmlTestCases.loadDeliveryTestCase(parser);

		createQueryTest()//
			.add("SELECT i.delivery.*")
			.add("FROM Item i")
			.assertIssue(SqmlIssueIllegalDotStarSuffix.class, 3)
			.assertNoMoreIssues();
	}
}
