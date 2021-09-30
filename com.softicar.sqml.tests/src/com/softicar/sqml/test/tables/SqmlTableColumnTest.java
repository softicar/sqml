package com.softicar.sqml.test.tables;

import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.validation.SqmlIssueDuplicatedImplicitPhysicalTableColumnName;
import com.softicar.sqml.model.tables.validation.SqmlIssueDuplicatedPhysicalTableColumnName;
import com.softicar.sqml.model.tables.validation.SqmlIssueDuplicatedTableColumnName;
import com.softicar.sqml.model.tables.validation.SqmlIssueIllegalTypeOfBaseColumn;
import com.softicar.sqml.model.tables.validation.SqmlIssueIllegalTypeOfSerialColumn;
import com.softicar.sqml.model.tables.validation.SqmlIssueMissingSerialColumn;
import com.softicar.sqml.model.tables.validation.SqmlIssueNullableSerialOrBaseColumn;
import com.softicar.sqml.model.tables.validation.SqmlIssueSerialOrBaseColumnNotSinglePrimaryKeyColumn;
import com.softicar.sqml.model.tables.validation.SqmlIssueTooManySerialOrBaseColumns;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlTableColumnTest extends AbstractSqmlTest {

	// ------------------------------ serial column ------------------------------ //

	@Test
	public void testNullableSerialColumn() {

		createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL [NULLABLE]")
			.assertIssue(SqmlIssueNullableSerialOrBaseColumn.class, 3)
			.assertNoMoreIssues();
	}

	@Test
	public void testTooManySerialColumns() {

		createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("PK Integer index = SERIAL")
			.assertIssue(SqmlIssueTooManySerialOrBaseColumns.class, 3)
			.assertIssue(SqmlIssueTooManySerialOrBaseColumns.class, 4)
			.assertIssue(SqmlIssueSerialOrBaseColumnNotSinglePrimaryKeyColumn.class, 3)
			.assertIssue(SqmlIssueSerialOrBaseColumnNotSinglePrimaryKeyColumn.class, 4)
			.assertNoMoreIssues();
	}

	@Test
	public void testSerialColumnNotSinglePrimaryKeyColumn() {

		createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("PK Integer index")
			.assertIssue(SqmlIssueSerialOrBaseColumnNotSinglePrimaryKeyColumn.class, 3)
			.assertNoMoreIssues();
	}

	@Test
	public void testIllegalSerialColumnType() {

		createTableTest("Foo", "db.foo")//
			.add("PK String id = SERIAL")
			.assertIssue(SqmlIssueIllegalTypeOfSerialColumn.class, 3)
			.assertNoMoreIssues();
	}

	@Test
	public void testIntegerAndLongAsSerialColumnType() {

		createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("String name")
			.assertNoIssues();

		createTableTest("Bar", "db.bar")//
			.add("PK Long id = SERIAL")
			.add("String name")
			.assertNoIssues();
	}

	// ------------------------------ base column ------------------------------ //

	@Test
	public void testNullableBaseColumn() {

		createTableTest("Foo", "db.foo")//
			.add("PK Foo base = BASE [NULLABLE]")
			.assertIssue(SqmlIssueMissingSerialColumn.class, 2)
			.assertIssue(SqmlIssueNullableSerialOrBaseColumn.class, 3)
			.assertNoMoreIssues();
	}

	@Test
	public void testTooManyBaseColumns() {

		createTableTest("Foo", "db.foo")//
			.add("PK Foo base1 = BASE")
			.add("PK Foo base2 = BASE")
			.assertIssue(SqmlIssueMissingSerialColumn.class, 2)
			.assertIssue(SqmlIssueTooManySerialOrBaseColumns.class, 3)
			.assertIssue(SqmlIssueTooManySerialOrBaseColumns.class, 4)
			.assertIssue(SqmlIssueSerialOrBaseColumnNotSinglePrimaryKeyColumn.class, 3)
			.assertIssue(SqmlIssueSerialOrBaseColumnNotSinglePrimaryKeyColumn.class, 4)
			.assertNoMoreIssues();
	}

	@Test
	public void testBaseColumnNotSinglePrimaryKeyColumn() {

		createTableTest("Foo", "db.foo")//
			.add("PK Foo base = BASE")
			.add("PK Foo index")
			.assertIssue(SqmlIssueMissingSerialColumn.class, 2)
			.assertIssue(SqmlIssueSerialOrBaseColumnNotSinglePrimaryKeyColumn.class, 3)
			.assertNoMoreIssues();
	}

	@Test
	public void testIllegalBaseColumnType() {

		createTableTest("Foo", "db.foo")//
			.add("PK String base = BASE")
			.assertIssue(SqmlIssueMissingSerialColumn.class, 2)
			.assertIssue(SqmlIssueIllegalTypeOfBaseColumn.class, 3)
			.assertNoMoreIssues();
	}

	// ------------------------------ serial and base column ------------------------------ //

	@Test
	public void testSerialAndBaseColumns() {

		createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("PK Foo index = BASE")
			.assertIssue(SqmlIssueTooManySerialOrBaseColumns.class, 3)
			.assertIssue(SqmlIssueTooManySerialOrBaseColumns.class, 4)
			.assertIssue(SqmlIssueSerialOrBaseColumnNotSinglePrimaryKeyColumn.class, 3)
			.assertIssue(SqmlIssueSerialOrBaseColumnNotSinglePrimaryKeyColumn.class, 4)
			.assertNoMoreIssues();
	}

	// ------------------------------ other ------------------------------ //

	@Test
	public void testDuplicatedColumnName() {

		createTableTest("Foo", "db.foo")//
			.add("String name")
			.add("String name")
			.assertIssue(SqmlIssueDuplicatedTableColumnName.class, 3)
			.assertIssue(SqmlIssueDuplicatedTableColumnName.class, 4);
	}

	@Test
	public void testDuplicatedPhysicalColumnName() {

		createTableTest("Foo", "db.foo")//
			.add("String foo ['name']")
			.add("String bar ['naME']")
			.add("String Name")
			.assertIssue(SqmlIssueDuplicatedPhysicalTableColumnName.class, 3)
			.assertIssue(SqmlIssueDuplicatedPhysicalTableColumnName.class, 4)
			.assertIssue(SqmlIssueDuplicatedImplicitPhysicalTableColumnName.class, 5);
	}

	@Test
	public void testTableReferencesInSamePackage() {

		ISqmlTable fooTable = createFileTest("Foo.sqml")//
			.add("PACKAGE com.example")
			.add("TABLE Foo 'db.foo' {")
			.add("    PK Integer id = SERIAL")
			.add("}")
			.getFile()
			.getTable("Foo");

		ISqmlTable barTable = createFileTest("Bar.sqml")//
			.add("PACKAGE com.example")
			.add("TABLE Bar 'db.bar' {")
			.add("    PK Integer id = SERIAL")
			.add("    Foo foo")
			.add("}")
			.getFile()
			.getTable("Bar");

		assertSame(fooTable, barTable.getColumn("foo").getSqmlType());
	}
}
