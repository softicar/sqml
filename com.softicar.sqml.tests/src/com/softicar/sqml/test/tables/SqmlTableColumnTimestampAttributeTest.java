package com.softicar.sqml.test.tables;

import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.validation.SqmlIssueIllegalTimestampAttribute;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlTableColumnTimestampAttributeTest extends AbstractSqmlTest {

	@Test
	public void testTimestampAttribute() {

		ISqmlTable table = createTableTest("T", "db.t")//
			.add("PK Integer id = SERIAL")
			.add("DayTime a")
			.add("DayTime b [TIMESTAMP]")
			.assertNoIssues()
			.getTable();

		assertFalse(table.getColumn("a").isTimestamp());
		assertTrue(table.getColumn("b").isTimestamp());
	}

	@Test
	public void issueOnIllegalPrecisionAttribute() {

		createTableTest("T", "db.t")//
			.add("PK Integer id = SERIAL")
			.add("Integer i [TIMESTAMP]")
			.add("Day d [TIMESTAMP]")
			.assertIssue(SqmlIssueIllegalTimestampAttribute.class, 4)
			.assertIssue(SqmlIssueIllegalTimestampAttribute.class, 5);
	}
}
