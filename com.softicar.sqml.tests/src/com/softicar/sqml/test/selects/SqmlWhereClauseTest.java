package com.softicar.sqml.test.selects;

import com.softicar.sqml.model.selects.validation.SqmlIssueWhereClauseConditionNotBoolean;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlTestCases;
import org.junit.Test;

public class SqmlWhereClauseTest extends AbstractSqmlTest {

	@Test
	public void testConditionalWheres() {

		parser.loadLanguagePackage();
		SqmlTestCases.loadDeliveryTestCase(parser);

		createQueryTest()
			.add("Boolean where1")
			.add("Boolean where2")
			.add("SELECT i.id")
			.add("FROM Item i")
			.add("#IF $where1 { WHERE i.id = 3 }")
			.add("#IF $where2 { WHERE i.id = 7 }")
			.assertNoIssues()
			.assertGeneratedSelect("SELECT i.id AS id FROM db.item AS i", false, false)
			.assertGeneratedSelect("SELECT i.id AS id FROM db.item AS i WHERE i.id = 3", true, false)
			.assertGeneratedSelect("SELECT i.id AS id FROM db.item AS i WHERE i.id = 7", false, true)
			.assertGeneratedSelect("SELECT i.id AS id FROM db.item AS i WHERE i.id = 3 AND i.id = 7", true, true);
	}

	@Test
	public void prohibitsNonBooleanConditions() {

		createQueryTest()//
			.add("SELECT 1 AS one")
			.add("WHERE 'foo'")
			.assertIssue(SqmlIssueWhereClauseConditionNotBoolean.class, 4);
	}
}
