package com.softicar.sqml.test.tables;

import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.validation.SqmlIssueIllegalLengthBitsAttribute;
import com.softicar.sqml.model.tables.validation.SqmlIssueIllegalLengthBitsAttributeValue;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlTableColumnLengthBitsAttributeTest extends AbstractSqmlTest {

	@Test
	public void testLengthBitsAttribute() {

		ISqmlTable table = createTableTest("T", "db.t")//
			.add("PK Integer id = SERIAL")
			.add("String text [LENGTHBITS=16]")
			.add("Blob blob [LENGTHBITS=24]")
			.add("String other")
			.assertNoIssues()
			.getTable();

		assertEquals(16, table.getColumn("text").getLengthBits());
		assertEquals(24, table.getColumn("blob").getLengthBits());
		assertNull(table.getColumn("other").getLengthBits());
	}

	@Test
	public void errorOnIllegalLengthBitsAttribute() {

		createTableTest("T", "db.t")//
			.add("PK Integer id = SERIAL")
			.add("Boolean boolean [LENGTHBITS=8]")
			.add("Day day [LENGTHBITS=8]")
			.add("DayTime dayTime [LENGTHBITS=8]")
			.add("Decimal decimal [LENGTHBITS=8 PRECISION=8,2]")
			.add("Double double [LENGTHBITS=8]")
			.add("Float float [LENGTHBITS=8]")
			.assertIssue(SqmlIssueIllegalLengthBitsAttribute.class, 4)
			.assertIssue(SqmlIssueIllegalLengthBitsAttribute.class, 5)
			.assertIssue(SqmlIssueIllegalLengthBitsAttribute.class, 6)
			.assertIssue(SqmlIssueIllegalLengthBitsAttribute.class, 7)
			.assertIssue(SqmlIssueIllegalLengthBitsAttribute.class, 8)
			.assertIssue(SqmlIssueIllegalLengthBitsAttribute.class, 9)
			.assertNoMoreIssues();
	}

	@Test
	public void errorOnIllegalLengthBitsAttributeValue() {

		createTableTest("T", "db.t")//
			.add("PK Integer id = SERIAL")
			.add("String string [LENGTHBITS=4]")
			.add("Blob blob [LENGTHBITS=12]")
			.assertIssue(SqmlIssueIllegalLengthBitsAttributeValue.class, 4)
			.assertIssue(SqmlIssueIllegalLengthBitsAttributeValue.class, 5)
			.assertNoMoreIssues();
	}
}
