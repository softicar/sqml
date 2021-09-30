package com.softicar.sqml.test.expressions;

import com.softicar.sqml.model.expressions.validation.SqmlIssueIllegalDotStarSuffix;
import com.softicar.sqml.model.expressions.validation.SqmlIssueVariableReferenceRefersToSubSelect;
import com.softicar.sqml.model.expressions.validation.SqmlIssueVariableReferenceUsedInSubSelect;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlTestCases;
import org.junit.Before;
import org.junit.Test;

public class SqmlTableRowExpressionTest extends AbstractSqmlTest {

	@Before
	public void before() {

		SqmlTestCases.loadDeliveryTestCase(parser);
	}

	@Test
	public void testSubSelectVariableReference() {

		createQueryTest()//
			.add("SELECT s")
			.add("FROM (SELECT 1 AS one) s")
			.assertIssue(SqmlIssueVariableReferenceRefersToSubSelect.class, 3)
			.assertNoMoreIssues();
	}

	@Test
	public void testSubSelectVariableReferenceWithDotStar() {

		createQueryTest()//
			.add("SELECT s.*")
			.add("FROM (SELECT 1 AS one) s")
			.assertIssue(SqmlIssueVariableReferenceRefersToSubSelect.class, 3)
			.assertIssue(SqmlIssueIllegalDotStarSuffix.class, 3)
			.assertNoMoreIssues();
	}

	@Test
	public void testTableReferenceAsSelectColumn() {

		createQueryTest()//
			.add("SELECT i.*")
			.add("FROM Item i")
			.assertNoIssues();

		createQueryTest()//
			.add("SELECT i")
			.add("FROM Item i")
			.assertNoMoreIssues();
	}

	@Test
	public void testTableReferenceInWhereClause() {

		createQueryTest()//
			.add("Item[] items")
			.add("SELECT 1 AS one")
			.add("FROM Item i")
			.add("WHERE i IN $items")
			.assertNoIssues();

		createQueryTest()//
			.add("Item[] items")
			.add("SELECT 1 AS one")
			.add("FROM Item i")
			.add("WHERE i.* IN $items")
			.assertIssue(SqmlIssueIllegalDotStarSuffix.class, 6)
			.assertNoMoreIssues();
	}

	@Test
	public void testTableReferenceInSubSelect() {

		createQueryTest()//
			.add("SELECT 1 AS one")
			.add("FROM (SELECT i FROM Item i) s")
			.assertIssue(SqmlIssueVariableReferenceUsedInSubSelect.class, 4);
	}

	@Test
	public void testSelectFullTableReference() {

		createQueryTest()//
			.add("SELECT d.*")
			.add("FROM Item i")
			.add("JOIN i.delivery d")
			.assertGeneratedSelect(
				"SELECT d.id AS d$id, d.number AS d$number, d.supplier AS d$supplier FROM db.item AS i JOIN db.delivery AS d ON i.delivery = d.id")
			.assertJava("IDbQueryTableColumn<IRow, Delivery> D_COLUMN = new DbQueryTableColumn<>(IRow::getD, \"d\", Delivery.TABLE);");
	}

	@Test
	public void testSelectStubTableReference() {

		createQueryTest()//
			.add("SELECT d")
			.add("FROM Item i")
			.add("JOIN i.delivery d")
			.assertGeneratedSelect("SELECT d.id AS d FROM db.item AS i JOIN db.delivery AS d ON i.delivery = d.id")
			.assertJava("IDbQueryTableColumn<IRow, Delivery> D_COLUMN = new DbQueryTableStubColumn<>(IRow::getD, \"d\", Delivery.TABLE);");
	}

	@Test
	public void testVirtualTableReferenceColumnNames() {

		createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("String name")
			.assertNoIssues();

		// without alias
		createQueryTest()//
			.add("SELECT f.*")
			.add("FROM Foo f")
			.assertGeneratedSelect("SELECT f.id AS f$id, f.name AS f$name FROM db.foo AS f");

		// with alias
		createQueryTest()//
			.add("SELECT f.* AS x")
			.add("FROM Foo f")
			.assertGeneratedSelect("SELECT f.id AS x$id, f.name AS x$name FROM db.foo AS f");
	}

	@Test
	public void testInIfExpression() {

		SqmlTestCases.loadStockTestCase(parser);

		createQueryTest()//
			.add("SELECT IF(TRUE, stock.*, stock.*) AS stock")
			.add("FROM Stock AS stock")
			.assertIssue(SqmlIssueIllegalDotStarSuffix.class, 3)
			.assertNoMoreIssues();
	}
}
