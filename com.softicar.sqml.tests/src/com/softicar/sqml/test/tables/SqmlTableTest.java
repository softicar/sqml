package com.softicar.sqml.test.tables;

import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.validation.SqmlIssueDuplicatedPhysicalTable;
import com.softicar.sqml.model.tables.validation.SqmlIssueInvalidPhysicalTableName;
import com.softicar.sqml.model.tables.validation.SqmlIssueMissingPrimaryKey;
import com.softicar.sqml.model.tables.validation.SqmlIssueMissingSerialColumn;
import com.softicar.sqml.model.tables.validation.SqmlIssueTableNameMustMatchFilename;
import com.softicar.sqml.model.tables.validation.SqmlIssueTooManyPrimaryKeyFields;
import com.softicar.sqml.model.types.validation.SqmlIssueUnresolvedTypeReference;
import com.softicar.sqml.model.validation.SqmlIssueType;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlTableTest extends AbstractSqmlTest {

	@Test
	public void testRobustness() {

		createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("String name")
			.assertNoIssues();
		createTableTest("Baz", "db.baz")//
			.add("PK Integer id = SERIAL")
			.add("Foo foo")
			.assertNoIssues();
		createFileTest("Q.sqml")
			.add("PACKAGE com.example.other")
			.add("IMPORT com.example.Baz")
			.add("QUERY Q")
			.add("    Foo foo")
			.add("    SELECT bar")
			.add("    FROM Bar bar")
			.add("    WHERE bar.foo = $foo")
			.add("END")
			.assertIssue(SqmlIssueType.LINKING_ERROR, 4)
			.assertIssue(SqmlIssueType.UNRESOLVED_PROXY, 4)
			.assertIssue(SqmlIssueUnresolvedTypeReference.class, 4);
	}

	@Test
	public void testMissingSerialColumn() {

		createTableTest("Foo", "db.foo")//
			.add("PK String name")
			.assertIssue(SqmlIssueMissingSerialColumn.class, 2)
			.assertNoMoreIssues();
	}

	@Test
	public void testMissingPrimaryKey() {

		createTableTest("Foo", "db.foo")//
			.add("String name")
			.assertIssue(SqmlIssueMissingSerialColumn.class, 2)
			.assertIssue(SqmlIssueMissingPrimaryKey.class, 2)
			.assertNoMoreIssues();
	}

	@Test
	public void testMissingPrimaryKeyWithNonPkSerialColumn() {

		createTableTest("Foo", "db.foo")//
			.add("Integer id = SERIAL")
			.assertIssue(SqmlIssueMissingPrimaryKey.class, 2)
			.assertNoMoreIssues();
	}

	@Test
	public void testMissingPrimaryKeyWithNonPkBaseColumn() {

		createTableTest("Base", "db.base")//
			.add("PK Integer id = SERIAL")
			.assertNoIssues();

		createTableTest("Foo", "db.foo")//
			.add("Base base = BASE")
			.assertIssue(SqmlIssueMissingSerialColumn.class, 2)
			.assertIssue(SqmlIssueMissingPrimaryKey.class, 2)
			.assertNoMoreIssues();
	}

	@Test
	public void testTooManyPrimaryKeyFields() {

		createTableTest("Foo", "db.foo")//
			.add("PK String name1")
			.add("PK String name2")
			.add("PK String name3")
			.add("PK String name4")
			.add("PK String name5")
			.assertIssue(SqmlIssueMissingSerialColumn.class, 2)
			.assertIssue(SqmlIssueTooManyPrimaryKeyFields.class, 2)
			.assertNoMoreIssues();
	}

	@Test
	public void testJavaClassNameOfTable() {

		ISqmlTable table = createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("String name")
			.getTable();
		assertEquals("com.example.Foo", table.getJavaType().getCanonicalName());
	}

	@Test
	public void testPhysicalNameOfTable() {

		ISqmlTable table = createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("String name")
			.getTable();
		assertEquals("db.foo", table.getPhysicalNameOverride());
	}

	@Test
	public void isSame() {

		ISqmlTable fooTable = createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("String name")
			.getTable();
		ISqmlTable barTable = createTableTest("Bar", "db.bar")//
			.add("PK Integer id = SERIAL")
			.add("String name")
			.getTable();

		assertTrue(fooTable.is(fooTable));
		assertTrue(barTable.is(barTable));
		assertFalse(fooTable.is(barTable));
		assertFalse(barTable.is(fooTable));
	}

	@Test
	public void testInvalidPhysicalTableName() {

		createTableTest("Foo", "invalid")//
			.add("PK Integer id = SERIAL")
			.assertIssue(SqmlIssueInvalidPhysicalTableName.class, 2);

		createTableTest("Foo", "invalid.physical.name")//
			.add("PK Integer id = SERIAL")
			.assertIssue(SqmlIssueInvalidPhysicalTableName.class, 2);
	}

	@Test
	public void testDuplicatedPhysicalTableName() {

		createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("String name")
			.assertNoIssues();
		createTableTest("Bar", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("String name")
			.assertIssue(SqmlIssueDuplicatedPhysicalTable.class, 2)
			.assertNoMoreIssues();
	}

	@Test
	public void validateOneTablePerFile() {

		createFileTest("Foo.sqml")
			.add("PACKAGE com.example")
			.add()
			.add("TABLE Bar 'db.bar2' {")
			.add("    PK Integer id = SERIAL")
			.add("}")
			.add()
			.add("TABLE Foo 'db.foo2' {")
			.add("    PK Integer id = SERIAL")
			.add("}")
			.assertIssue(SqmlIssueTableNameMustMatchFilename.class, 3)
			.assertNoMoreIssues();
	}
}
