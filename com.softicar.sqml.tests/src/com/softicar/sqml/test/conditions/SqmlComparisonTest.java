package com.softicar.sqml.test.conditions;

import com.softicar.sqml.model.expressions.validation.SqmlIssueIncompatibleFunctionCallArguments;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlExpressionBatchTest;
import com.softicar.sqml.test.utils.SqmlTestCases;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class SqmlComparisonTest extends AbstractSqmlTest {

	@Before
	public void before() {

		parser.loadLanguagePackage();
		SqmlTestCases.loadDeliveryTestCase(parser);
	}

	// -------------------- primitive types -------------------- //

	@Test
	public void comparePrimitiveTypes() {

		checkAllComparisonOperators("23", "23");
		checkAllComparisonOperators("23L", "23");
		checkAllComparisonOperators("23f", "23");
		checkAllComparisonOperators("23d", "23");
		checkAllComparisonOperators("23.0", "23.0");
		checkAllComparisonOperators("'23'", "'23'");
		checkAllComparisonOperators("today()", "CURDATE()");
		checkAllComparisonOperators("now()", "NOW()");
	}

	private void checkAllComparisonOperators(String sqmlLiteral, String sqlLiteral) {

		SqmlExpressionBatchTest batchTest = new SqmlExpressionBatchTest(parser);
		for (String operator: Arrays.asList("=", "!=", "<", ">", "<=", ">=")) {
			batchTest.addExpression(sqmlLiteral + " " + operator + " " + sqmlLiteral, sqlLiteral + " " + operator + " " + sqlLiteral);
		}
		batchTest.check();
	}

	// -------------------- enumerations -------------------- //

	@Test
	public void compareEnums() {

		createTableTest("T", "db.t")//
			.add("PK Integer id = SERIAL")
			.add("State state")
			.add("Type type")
			.add("Priority priority")
			.add()
			.add("ENUM State ON String {")
			.add("    OPEN = 'OPEN'")
			.add("    CLOSED = 'CLOSED'")
			.add("}")
			.add()
			.add("ENUM Type ON String {")
			.add("    COFFEE = 'COFFE'")
			.add("    TEA = 'TEA'")
			.add("}")
			.add()
			.add("ENUM Priority ON Integer {")
			.add("    LOW = 1")
			.add("    NORMAL = 2")
			.add("    HIGH = 3")
			.add("}")
			.assertNoIssues();

		new SqmlExpressionBatchTest(parser)//
			.addExpression("t.state = 'OPEN'", "t.state = 'OPEN'")
			.addExpression("t.priority = 2", "t.priority = 2")
			.addExpression("'CLOSED' = t.state", "'CLOSED' = t.state")
			.addExpression("1 = t.priority", "1 = t.priority")
			.addExpression("1 < t.priority", "1 < t.priority")
			.addExpression("1 > t.priority", "1 > t.priority")
			.addExpression("1 != t.priority", "1 != t.priority")
			.addExpression("1 <= t.priority", "1 <= t.priority")
			.addExpression("1 >= t.priority", "1 >= t.priority")
			.addExpression("t.priority = t.priority", "t.priority = t.priority")
			.addExpression("t.priority < t.priority", "t.priority < t.priority")
			.addExpression("t.priority > t.priority", "t.priority > t.priority")
			.addExpression("t.priority != t.priority", "t.priority != t.priority")
			.addExpression("t.priority <= t.priority", "t.priority <= t.priority")
			.addExpression("t.priority >= t.priority", "t.priority >= t.priority")
			.addExpression("t.state = t.state", "t.state = t.state")
			.setSuffix("FROM T t", "FROM db.t AS t")
			.check();

		// Enum = Other Enum
		createQueryTest()//
			.add("SELECT t.state = t.type AS x FROM T t")
			.assertIssue(SqmlIssueIncompatibleFunctionCallArguments.class, 3);
		createQueryTest()//
			.add("SELECT t.priority = t.type AS x FROM T t")
			.assertIssue(SqmlIssueIncompatibleFunctionCallArguments.class, 3);
	}

	// -------------------- tables -------------------- //

	@Test
	public void compareTableToInteger() {

		createQueryTest()//
			.add("Integer id")
			.add("SELECT i = $id AS x, i != $id AS y FROM Item i")
			.assertNoIssues()
			.assertGeneratedSelect("SELECT i.id = 22 AS x, i.id != 22 AS y FROM db.item AS i", 22)
			.assertGeneratedSelect("SELECT i.id = NULL AS x, i.id != NULL AS y FROM db.item AS i", (Integer) null);
	}

	@Test
	public void compareTableSelectColumnToInteger() {

		createQueryTest()//
			.add("SELECT item.*")
			.add("FROM Item item")
			.add("WHERE item = 22")
			.add("HAVING item = 13")
			.assertNoIssues()
			.assertGeneratedSelect(
				new StringBuilder()
					.append("SELECT item.id AS item$id, ")
					.append("item.delivery AS item$delivery, item.charge AS item$charge ")
					.append("FROM db.item AS item ")
					.append("WHERE item.id = 22 HAVING item.id = 13")
					.toString());
	}

	@Test
	public void testParameters() {

		createQueryTest()//
			.add("Integer id")
			.add("SELECT d.number")
			.add("FROM Delivery AS d")
			.add("WHERE d.id = $id")
			.assertGeneratedSelect("SELECT d.number AS number FROM db.delivery AS d WHERE d.id = 33", 33);
	}

	@Test
	public void compareValueToParameter() {

		createQueryTest()//
			.add("Integer charge")
			.add("SELECT i.id")
			.add("FROM Item i")
			.add("WHERE i.charge = $charge")
			.assertGeneratedSelect("SELECT i.id AS id FROM db.item AS i WHERE i.charge = NULL", (Integer) null)
			.assertGeneratedSelect("SELECT i.id AS id FROM db.item AS i WHERE i.charge = 1337", 1337);
	}

	@Test
	public void compareForeignKeyToParameter() {

		createQueryTest()//
			.add("Supplier parentSupplier")
			.add("SELECT s.id")
			.add("FROM Supplier s")
			.add("WHERE s.parentSupplier = $parentSupplier")
			.assertGeneratedSelect("SELECT s.id AS id FROM db.supplier AS s WHERE s.parentSupplier = NULL", (Integer) null)
			.assertGeneratedSelect("SELECT s.id AS id FROM db.supplier AS s WHERE s.parentSupplier = 1", 1);
	}

	@Test
	public void compareTableReferenceToParameter() {

		createQueryTest()//
			.add("Integer id")
			.add("Item item")
			.add("SELECT i.id")
			.add("FROM Item i")
			.add("WHERE i = $id")
			.add("WHERE i = $item")
			.assertGeneratedSelect(
				new StringBuilder()//
					.append("SELECT i.id AS id")
					.append(" FROM db.item AS i")
					.append(" WHERE i.id = 23 AND i.id = NULL")
					.toString(),
				23,
				null);
	}

	@Test
	public void testValidateWithIncompatibleTypes() {

		createQueryTest()//
			.add("Item i")
			.add("Integer id")
			.add("SELECT d.id")
			.add("FROM Delivery d")
			.add("WHERE d = '23'")
			.add("WHERE d = $i")
			.add("WHERE d.number = $id")
			.assertIssue(SqmlIssueIncompatibleFunctionCallArguments.class, 7)
			.assertIssue(SqmlIssueIncompatibleFunctionCallArguments.class, 8)
			.assertIssue(SqmlIssueIncompatibleFunctionCallArguments.class, 9);
	}

	@Test
	public void testValidateWithIllegalListComparison() {

		createQueryTest()//
			.add("Integer id")
			.add("Integer[] ids")
			.add("SELECT d.id")
			.add("FROM Delivery d")
			.add("WHERE d.id = $id")
			.add("WHERE d.id = $ids")
			.assertIssue(SqmlIssueIncompatibleFunctionCallArguments.class, 8)
			.assertNoMoreIssues();
	}

	@Test
	public void testValidateWithIllegalComparator() {

		createQueryTest()//
			.add("Integer id")
			.add("Item item")
			.add("SELECT i.id")
			.add("FROM Item i")
			.add("WHERE i < $item")
			.add("WHERE i.delivery > 33")
			.assertIssue(SqmlIssueIncompatibleFunctionCallArguments.class, 7)
			.assertIssue(SqmlIssueIncompatibleFunctionCallArguments.class, 8);
	}

	@Test
	public void testGenerateSqlWithNestedComparison() {

		createQueryTest()//
			.add("Integer i")
			.add("Boolean b")
			.add("SELECT ($i = 3) = $b AS x")
			.assertGeneratedSelect("SELECT (5 = 3) = TRUE AS x", 5, true);
	}
}
