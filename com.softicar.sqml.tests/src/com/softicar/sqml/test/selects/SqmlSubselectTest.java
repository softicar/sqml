package com.softicar.sqml.test.selects;

import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlTestCases;
import org.junit.Test;

public class SqmlSubselectTest extends AbstractSqmlTest {

	@Test
	public void testSimpleSubSelects() {

		SqmlTestCases.loadDeliveryTestCase(parser);

		createQueryTest()//
			.add("SELECT s.id, s.delivery")
			.add("FROM (FROM Item i SELECT i.id, i.delivery) s")
			.assertGeneratedSelect("SELECT s.id AS id, s.delivery AS delivery FROM (SELECT i.id AS id, i.delivery AS delivery FROM db.item AS i) AS s");
	}

	@Test
	public void testNonAliasSubSelectColumns() {

		parser.loadLanguagePackage();

		createTableTest("T", "db.t")//
			.add("PK Integer id = SERIAL ['tableId']")
			.assertNoIssues();

		createQueryTest()//
			.add("SELECT t.id")
			.add("FROM T t")
			.add("JOIN (SELECT t.id FROM T t) sub")
			.add("ON sub.id = t.id")
			.assertGeneratedSelect("SELECT t.tableId AS id FROM db.t AS t JOIN (SELECT t.tableId AS id FROM db.t AS t) AS sub ON sub.id = t.tableId");
	}
}
