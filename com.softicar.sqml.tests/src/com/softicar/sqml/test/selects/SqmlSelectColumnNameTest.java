package com.softicar.sqml.test.selects;

import com.softicar.sqml.model.queries.ISqmlQuery;
import com.softicar.sqml.model.selects.validation.SqmlIssueDuplicatedSelectColumnName;
import com.softicar.sqml.model.selects.validation.SqmlIssueMissingAliasForSelectColumn;
import com.softicar.sqml.model.selects.validation.SqmlIssueSelectColumnAliasNotLowerCamelCase;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlTestCases;
import org.junit.Test;

public class SqmlSelectColumnNameTest extends AbstractSqmlTest {

	@Test
	public void testColumnNames() {

		// test alias
		ISqmlQuery query1 = createQueryTest().add("SELECT 1 AS one").getQuery();
		assertEquals("one", getColumnName(query1, 0));

		// test column references to sub-selects
		ISqmlQuery query2 = createQueryTest().add("SELECT s.name FROM (SELECT 'x' AS name) s").getQuery();
		assertEquals("name", getColumnName(query2, 0));

		// test column references to tables
		SqmlTestCases.loadDeliveryTestCase(parser);
		ISqmlQuery query3 = createQueryTest().add("SELECT d.supplier FROM Delivery d").getQuery();
		assertEquals("supplier", getColumnName(query3, 0));
	}

	@Test
	public void prohibitsOmissionOfMandatoryAlias() {

		createQueryTest()//
			.add("SELECT 1")
			.assertIssue(SqmlIssueMissingAliasForSelectColumn.class, 3);
	}

	@Test
	public void allowsOmissionOfAliasForVariableReference() {

		createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.assertNoIssues();

		createQueryTest()//
			.add("SELECT foo.*")
			.add("FROM Foo foo")
			.assertNoIssues()
			.assertGeneratedSelect("SELECT foo.id AS foo$id FROM db.foo AS foo");
	}

	@Test
	public void allowsOmissionOfAliasForColumnReference() {

		createQueryTest()//
			.add("SELECT s.one FROM (SELECT 1 AS one) s")
			.assertNoIssues()
			.assertGeneratedSelect("SELECT s.one AS one FROM (SELECT 1 AS one) AS s");
	}

	@Test
	public void addsImplicitAliasForPhysicalColumnNamesIfNecessary() {

		createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL ['fooId']")
			.assertNoIssues();

		createQueryTest()//
			.add("SELECT foo.id FROM Foo foo")
			.assertNoIssues()
			.assertGeneratedSelect("SELECT foo.fooId AS id FROM db.foo AS foo");
	}

	private String getColumnName(ISqmlQuery query, int index) {

		return query.getSelect().getColumns().get(index).getName();
	}

	@Test
	public void prohibitsDuplicatedColumnNamesCaseInsensitive() {

		createQueryTest()//
			.add("SELECT 1 AS one")
			.add("SELECT 1 AS onE")
			.assertIssue(SqmlIssueDuplicatedSelectColumnName.class, 3);
	}

	@Test
	public void prohibitsDuplicatedImplicitColumnNamesCaseInsensitive() {

		SqmlTestCases.loadDeliveryTestCase(parser);

		createQueryTest()//
			.add("SELECT d")
			.add("SELECT D")
			.add("FROM Delivery d")
			.add("JOIN Delivery D")
			.assertIssue(SqmlIssueDuplicatedSelectColumnName.class, 3);
	}

	@Test
	public void prohibitsDuplicatedColumnNamesInConditionalClauses() {

		SqmlTestCases.loadDeliveryTestCase(parser);

		createQueryTest()//
			.add("Boolean flag")
			.add("SELECT d")
			.add("#IF $flag { SELECT d }")
			.add("FROM Delivery d")
			.assertIssue(SqmlIssueDuplicatedSelectColumnName.class, 4)
			.assertIssue(SqmlIssueDuplicatedSelectColumnName.class, 5);
	}

	@Test
	public void testNonLowerCamelCaseName() {

		createQueryTest()//
			.add("SELECT 1 AS Foo")
			.assertIssue(SqmlIssueSelectColumnAliasNotLowerCamelCase.class, 3)
			.assertNoMoreIssues();
	}
}
