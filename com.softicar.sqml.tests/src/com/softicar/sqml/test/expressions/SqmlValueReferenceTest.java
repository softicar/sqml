package com.softicar.sqml.test.expressions;

import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.expressions.validation.SqmlIssueInvalidValueReference;
import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.selects.ISqmlSelectColumn;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlTestCases;
import org.junit.Test;

public class SqmlValueReferenceTest extends AbstractSqmlTest {

	@Test
	public void testTypeOfUnresolvedReference() {

		ISqmlFile file = parser.parse("PACKAGE com.example QUERY Q SELECT foo AS x END", "Q.sqml");
		ISqmlSelectColumn column = file.getQuery("Q").getSelect().getColumn("x");
		assertSame(SqmlBuiltInTypes.getUnknownType(), column.getExpression().getSqmlType());
	}

	@Test
	public void testName() {

		SqmlTestCases.loadStockTestCase(parser);

		createQueryTest()//
			.add("SELECT Stock AS stock")
			.assertIssue(SqmlIssueInvalidValueReference.class, 3);
	}

	// -------------------- table references -------------------- //

	@Test
	public void testTableReferenceInIfExpression() {

		SqmlTestCases.loadStockTestCase(parser);

		createQueryTest()//
			.add("SELECT IF(TRUE, stock, stock) AS stock")
			.add("FROM Stock AS stock")
			.assertJava("...STOCK_COLUMN = new DbQueryTableStubColumn...")
			.assertGeneratedSelect("SELECT CASE WHEN TRUE THEN stock.id ELSE stock.id END AS stock FROM db.stock AS stock");
	}

	// -------------------- table column references -------------------- //

	@Test
	public void testSelectionOfColumnWithPhysicalNameOverride() {

		createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("String name ['fooName']")
			.assertNoIssues();

		createQueryTest()//
			.add("SELECT f.name")
			.add("FROM Foo f")
			.assertJava("addIdentifier(\"f\", Foo.NAME);")
			.assertGeneratedSelect("SELECT f.fooName AS name FROM db.foo AS f");
	}

	// -------------------- id column references -------------------- //

	@Test
	public void testSelectionOfIdColumnWithPhysicalNameOverride() {

		createTableTest("Bar", "db.bar")//
			.add("PK Integer id = SERIAL ['barId']")
			.assertNoIssues();

		createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("Bar bar ['theBar']")
			.assertNoIssues();

		createQueryTest()//
			.add("SELECT f.bar.id AS barId")
			.add("FROM Foo f")
			.assertJava("addIdentifier(\"f\", Foo.BAR);")
			.assertGeneratedSelect("SELECT f.theBar AS barId FROM db.foo AS f");
	}
}
