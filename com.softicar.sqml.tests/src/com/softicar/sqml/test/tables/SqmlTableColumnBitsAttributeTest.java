package com.softicar.sqml.test.tables;

import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.validation.SqmlIssueIllegalBitsAttribute;
import com.softicar.sqml.model.tables.validation.SqmlIssueIllegalBitsAttributeValue;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlTableColumnBitsAttributeTest extends AbstractSqmlTest {

	@Test
	public void testBitsAttribute() {

		ISqmlTable table = createTableTest("T", "db.t")//
			.add("PK Integer id = SERIAL [BITS=8]")
			.add("Integer number [BITS=24]")
			.add("Integer other")
			.assertNoIssues()
			.getTable();

		assertEquals(8, table.getColumn("id").getBits());
		assertEquals(24, table.getColumn("number").getBits());
		assertNull(table.getColumn("other").getBits());
	}

	@Test
	public void errorOnIllegalBitsAttribute() {

		createTableTest("T", "db.t")//
			.add("PK Integer id = SERIAL")
			.add("Blob blob [BITS=8]")
			.add("Day day [BITS=8]")
			.add("DayTime dayTime [BITS=8]")
			.add("Decimal decimal [BITS=8 PRECISION=8,2]")
			.add("Double double [BITS=8]")
			.add("Float float [BITS=8]")
			.add("String string [BITS=8]")
			.assertIssue(SqmlIssueIllegalBitsAttribute.class, 4)
			.assertIssue(SqmlIssueIllegalBitsAttribute.class, 5)
			.assertIssue(SqmlIssueIllegalBitsAttribute.class, 6)
			.assertIssue(SqmlIssueIllegalBitsAttribute.class, 7)
			.assertIssue(SqmlIssueIllegalBitsAttribute.class, 8)
			.assertIssue(SqmlIssueIllegalBitsAttribute.class, 9)
			.assertIssue(SqmlIssueIllegalBitsAttribute.class, 10)
			.assertNoMoreIssues();
	}

	@Test
	public void errorOnIllegalBitsAttributeValue() {

		createTableTest("T", "db.t")//
			.add("PK Integer id = SERIAL")
			.add("Integer i4 [BITS=4]")
			.add("Integer i8 [BITS=8]")
			.add("Integer i16 [BITS=16]")
			.add("Integer i24 [BITS=24]")
			.add("Integer i32 [BITS=32]")
			.assertIssue(SqmlIssueIllegalBitsAttributeValue.class, 4)
			.assertNoMoreIssues();
	}
}
