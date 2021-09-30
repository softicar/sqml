package com.softicar.sqml.test.tables;

import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.tables.validation.SqmlIssueIllegalPrecisionAttribute;
import com.softicar.sqml.model.tables.validation.SqmlIssueIllegalPrecisionAttributeValue;
import com.softicar.sqml.model.tables.validation.SqmlIssueMissingPrecisionAttribute;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlTableColumnPrecisionAttributeTest extends AbstractSqmlTest {

	@Test
	public void testPrecisionAttribute() {

		ISqmlTableColumn column = createTableTest("T", "db.t")//
			.add("PK Integer id = SERIAL")
			.add("Decimal number [PRECISION=8,3]")
			.assertNoIssues()
			.getTable()
			.getColumn("number");

		assertEquals(Integer.valueOf(8), column.getPrecision());
		assertEquals(Integer.valueOf(3), column.getScale());
	}

	@Test
	public void issueOnMissingPrecisionAttribute() {

		createTableTest("T", "db.t").add("Integer id = SERIAL").add("Decimal number").assertIssue(SqmlIssueMissingPrecisionAttribute.class, 4);
	}

	@Test
	public void issueOnIllegalPrecisionAttribute() {

		createTableTest("T", "db.t").add("Integer id = SERIAL").add("String text [PRECISION=8,3]").assertIssue(SqmlIssueIllegalPrecisionAttribute.class, 4);
	}

	@Test
	public void issueOnIllegalPrecisionAttributeValue() {

		createTableTest("T", "db.t")
			.add("PK Integer id = SERIAL")
			.add("Decimal tooBigScale [PRECISION=3,10]")
			.add("Decimal zeroPrecision [PRECISION=0,0]")
			.add("Decimal minimum [PRECISION=1,0]")
			.assertIssue(SqmlIssueIllegalPrecisionAttributeValue.class, 4)
			.assertIssue(SqmlIssueIllegalPrecisionAttributeValue.class, 5)
			.assertNoMoreIssues();
	}
}
