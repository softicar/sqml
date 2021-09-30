package com.softicar.sqml.test.tables;

import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.ISqmlTableRow;
import com.softicar.sqml.model.tables.ISqmlTableRowValue;
import com.softicar.sqml.model.tables.validation.SqmlIssueEnumTableMissingIdColumn;
import com.softicar.sqml.model.tables.validation.SqmlIssueEnumTableMissingNameColumn;
import com.softicar.sqml.model.tables.validation.SqmlIssueEnumTableWithIllegalNameColumnType;
import com.softicar.sqml.model.tables.validation.SqmlIssueEnumTableWithNullableNameColumn;
import com.softicar.sqml.model.tables.validation.SqmlIssueIllegalNullValueForNonNullableTableColumn;
import com.softicar.sqml.model.tables.validation.SqmlIssueIllegalNumberOfTableRowValues;
import com.softicar.sqml.model.tables.validation.SqmlIssueIllegalTypeOfTableRowValue;
import com.softicar.sqml.model.tables.validation.SqmlIssueMissingPrimaryKey;
import com.softicar.sqml.model.tables.validation.SqmlIssueMissingSerialColumn;
import com.softicar.sqml.model.tables.validation.SqmlIssueTableRowsInNonEnumTable;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import java.math.BigDecimal;
import java.util.List;
import org.junit.Test;

public class SqmlEnumTableTest extends AbstractSqmlTest {

	@Test
	public void test() {

		ISqmlTable table = createFileTest("Foo.sqml")//
			.add("PACKAGE com.example")
			.add()
			.add("ENUM TABLE Foo 'db.foo' {")
			.add("  PK Integer id = SERIAL")
			.add("  String name")
			.add("  Long long")
			.add("  Float float")
			.add("  Double double")
			.add("  Decimal decimal [PRECISION=2,1]")
			.add("  String string")
			.add("  Boolean boolean")
			.add()
			.add("  ROW (1, 'A', 5L, 1.4f, 2.4d, 3.4, 'foo', TRUE)")
			.add("  ROW (2, 'B', 7L, 3.1f, 7.3d, 4.5, 'bar', FALSE)")
			.add("}")
			.assertNoIssues()
			.getFile()
			.getTable("Foo");

		assertTrue(table.isEnumTable());

		List<? extends ISqmlTableRow> rows = table.getRows();
		assertEquals(2, rows.size());

		assertValues(rows.get(0).getValues(), 1, "A", 5L, 1.4f, 2.4d, new BigDecimal("3.4"), "foo", 1);
		assertValues(rows.get(1).getValues(), 2, "B", 7L, 3.1f, 7.3d, new BigDecimal("4.5"), "bar", 0);
	}

	@Test
	public void testWithMissingIdColumn() {

		createFileTest("Foo.sqml")//
			.add("PACKAGE com.example")
			.add()
			.add("ENUM TABLE Foo 'db.foo' {")
			.add("  String name")
			.add("}")
			.assertIssue(SqmlIssueEnumTableMissingIdColumn.class, 3)
			.assertIssue(SqmlIssueMissingPrimaryKey.class, 3)
			.assertIssue(SqmlIssueMissingSerialColumn.class, 3)
			.assertNoMoreIssues();
	}

	@Test
	public void testWithMissingNameColumn() {

		createFileTest("Foo.sqml")//
			.add("PACKAGE com.example")
			.add()
			.add("ENUM TABLE Foo 'db.foo' {")
			.add("  PK Integer id = SERIAL")
			.add("}")
			.assertIssue(SqmlIssueEnumTableMissingNameColumn.class, 3)
			.assertNoMoreIssues();
	}

	@Test
	public void testWithNullableNameColumn() {

		createFileTest("Foo.sqml")//
			.add("PACKAGE com.example")
			.add()
			.add("ENUM TABLE Foo 'db.foo' {")
			.add("  PK Integer id = SERIAL")
			.add("  String name [NULLABLE]")
			.add("}")
			.assertIssue(SqmlIssueEnumTableWithNullableNameColumn.class, 5)
			.assertNoMoreIssues();
	}

	@Test
	public void testWithNonStringNameColumn() {

		createFileTest("Foo.sqml")//
			.add("PACKAGE com.example")
			.add()
			.add("ENUM TABLE Foo 'db.foo' {")
			.add("  PK Integer id = SERIAL")
			.add("  Long name")
			.add("}")
			.assertIssue(SqmlIssueEnumTableWithIllegalNameColumnType.class, 5)
			.assertNoMoreIssues();
	}

	@Test
	public void testWithNameColumnWithDifferentPhysicalName() {

		createFileTest("Foo.sqml")//
			.add("PACKAGE com.example")
			.add()
			.add("ENUM TABLE Foo 'db.foo' {")
			.add("  PK Integer id = SERIAL")
			.add("  String name ['title']")
			.add("}")
			.assertNoMoreIssues();
	}

	@Test
	public void testWithIllegalNullValue() {

		createFileTest("Foo.sqml")//
			.add("PACKAGE com.example")
			.add()
			.add("ENUM TABLE Foo 'db.foo' {")
			.add("  PK Integer id = SERIAL")
			.add("  String name")
			.add()
			.add("  ROW (1, 'FOO')")
			.add("  ROW (2, NULL)")
			.add("  ROW (NULL, 'BAR')")
			.add("}")
			.assertIssue(SqmlIssueIllegalNullValueForNonNullableTableColumn.class, 8)
			.assertIssue(SqmlIssueIllegalNullValueForNonNullableTableColumn.class, 9)
			.assertNoMoreIssues();
	}

	@Test
	public void testWithIllegalTypeOfTableRowValue() {

		createFileTest("Foo.sqml")//
			.add("PACKAGE com.example")
			.add()
			.add("ENUM TABLE Foo 'db.foo' {")
			.add("  PK Integer id = SERIAL")
			.add("  String name")
			.add()
			.add("  ROW (1, 'FOO')")
			.add("  ROW (2, 123)")
			.add("  ROW ('A', 'B')")
			.add("}")
			.assertIssue(SqmlIssueIllegalTypeOfTableRowValue.class, 8)
			.assertIssue(SqmlIssueIllegalTypeOfTableRowValue.class, 9)
			.assertNoMoreIssues();
	}

	@Test
	public void testWithIllegalNumberOfTableRowValues() {

		createFileTest("Foo.sqml")//
			.add("PACKAGE com.example")
			.add()
			.add("ENUM TABLE Foo 'db.foo' {")
			.add("  PK Integer id = SERIAL")
			.add("  String name")
			.add()
			.add("  ROW (1)")
			.add("  ROW (2, 'FOO')")
			.add("  ROW (3, 'BAR', 7)")
			.add("}")
			.assertIssue(SqmlIssueIllegalNumberOfTableRowValues.class, 7)
			.assertIssue(SqmlIssueIllegalNumberOfTableRowValues.class, 9)
			.assertNoMoreIssues();
	}

	@Test
	public void testWithTableRowsInNonEnumTable() {

		createTableTest("Foo", "db.foo")//
			.add("  PK Integer id = SERIAL")
			.add("  String name")
			.add()
			.add("  ROW (1, 'A')")
			.add("  ROW (2, 'B')")
			.assertIssue(SqmlIssueTableRowsInNonEnumTable.class, 6)
			.assertIssue(SqmlIssueTableRowsInNonEnumTable.class, 7)
			.assertNoMoreIssues();
	}

	private void assertValues(List<? extends ISqmlTableRowValue> values, Object...expectedValues) {

		assertEquals(expectedValues.length, values.size());
		for (int i = 0; i < expectedValues.length; i++) {
			assertValue(expectedValues[i], values.get(i));
		}
	}

	private void assertValue(Object expectedValue, ISqmlTableRowValue actualValue) {

		if (expectedValue == null) {
			assertTrue("Expected row value to be null.", actualValue.isNull());
		} else {
			assertEquals(expectedValue.toString(), actualValue.getLiteral().getStringValue());
		}
	}
}
