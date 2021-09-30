package com.softicar.sqml.test.tables;

import com.softicar.sqml.model.tables.validation.SqmlIssueTooLongConstraintName;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlTableColumnConstraintNameAttributeTest extends AbstractSqmlTest {

	@Test
	public void testWithValidConstraintName() {

		createTableTest("Bar", "db.bar")//
			.add("PK Integer id = SERIAL")
			.assertNoIssues();

		createTableTest("T", "db.t")//
			.add("PK Integer id = SERIAL")
			.add("Bar bar [CONSTRAINT_NAME='123456789012345678901234567890123456789012345678901234567890123']")
			.assertNoIssues();
	}

	@Test
	public void testWithTooLongConstraintName() {

		createTableTest("Bar", "db.bar")//
			.add("PK Integer id = SERIAL")
			.assertNoIssues();

		createTableTest("T", "db.t")//
			.add("PK Integer id = SERIAL")
			.add("Bar bar [CONSTRAINT_NAME='1234567890123456789012345678901234567890123456789012345678901234']")
			.assertIssue(SqmlIssueTooLongConstraintName.class, 4)
			.assertNoMoreIssues();
	}
}
