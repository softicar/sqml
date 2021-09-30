package com.softicar.sqml.test.tables;

import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.validation.SqmlIssueIllegalOnUpdateNowAttribute;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlTableColumnOnUpdateNowAttributeTest extends AbstractSqmlTest {

	@Test
	public void testOnUpdateNowAttribute() {

		ISqmlTable table = createTableTest("T", "db.t")//
			.add("PK Integer id = SERIAL")
			.add("DayTime a")
			.add("DayTime b [ON UPDATE NOW]")
			.assertNoIssues()
			.getTable();

		assertFalse(table.getColumn("a").isOnUpdateNow());
		assertTrue(table.getColumn("b").isOnUpdateNow());
	}

	@Test
	public void issueOnIllegalPrecisionAttribute() {

		createTableTest("T", "db.t")//
			.add("PK Integer id = SERIAL")
			.add("Integer i [ON UPDATE NOW]")
			.add("Day d [ON UPDATE NOW]")
			.assertIssue(SqmlIssueIllegalOnUpdateNowAttribute.class, 4)
			.assertIssue(SqmlIssueIllegalOnUpdateNowAttribute.class, 5);
	}
}
