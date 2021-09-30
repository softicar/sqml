package com.softicar.sqml.test.tables;

import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.validation.SqmlIssueIllegalMaxLengthAttribute;
import com.softicar.sqml.model.tables.validation.SqmlIssueIllegalMaxLengthAttributeValue;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlTableColumnMaxLengthAttributeTest extends AbstractSqmlTest {

	@Test
	public void testMaxLengthAttribute() {

		ISqmlTable table = createTableTest("T", "db.t")//
			.add("PK Integer id = SERIAL")
			.add("String text [MAXLENGTH=100]")
			.add("Blob blob [MAXLENGTH=123]")
			.add("String other")
			.assertNoIssues()
			.getTable();

		assertEquals(100, table.getColumn("text").getMaxLength());
		assertEquals(123, table.getColumn("blob").getMaxLength());
		assertNull(table.getColumn("other").getMaxLength());
	}

	@Test
	public void errorOnIllegalMaxLengthAttribute() {

		createTableTest("T", "db.t")//
			.add("Integer id = SERIAL")
			.add("Integer number [MAXLENGTH=8]")
			.assertIssue(SqmlIssueIllegalMaxLengthAttribute.class, 4);
	}

	@Test
	public void errorOnIllegalMaxLengthAttributeValue() {

		createTableTest("T", "db.t")
			.add("PK Integer id = SERIAL")
			.add("String text0 [MAXLENGTH=0]")
			.add("String text1 [MAXLENGTH=1]")
			.assertIssue(SqmlIssueIllegalMaxLengthAttributeValue.class, 4)
			.assertNoMoreIssues();
	}
}
