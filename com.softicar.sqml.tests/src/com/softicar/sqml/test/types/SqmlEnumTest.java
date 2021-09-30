package com.softicar.sqml.test.types;

import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.builtin.SqmlStringType;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.types.ISqmlEnum;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlEnumTest extends AbstractSqmlTest {

	@Test
	public void testEnumType() {

		ISqmlTable table = createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("StringEnum stringEnum")
			.add("IntegerEnum integerEnum")
			.add()
			.add("ENUM StringEnum ON String {")
			.add("    ONE = '1'")
			.add("    TWO = '2'")
			.add("}")
			.add()
			.add("ENUM IntegerEnum ON Integer {")
			.add("    ONE = 1")
			.add("    TWO = 2")
			.add("}")
			.assertNoIssues()
			.getTable();

		assertTrue(table.getEnum("StringEnum").getLiteralValueType().is(SqmlBuiltInTypes.getStringType()));
		assertTrue(table.getColumn("stringEnum").getSqmlType().is(table.getEnum("StringEnum")));
		assertFalse(table.getColumn("stringEnum").getSqmlType().isAssignableTo(SqmlBuiltInTypes.getStringType()));
		assertFalse(table.getColumn("stringEnum").getSqmlType().isAssignableTo(SqmlBuiltInTypes.getIntegerType()));

		assertTrue(table.getEnum("IntegerEnum").getLiteralValueType().is(SqmlBuiltInTypes.getIntegerType()));
		assertTrue(table.getColumn("integerEnum").getSqmlType().is(table.getEnum("IntegerEnum")));
		assertFalse(table.getColumn("integerEnum").getSqmlType().isAssignableTo(SqmlBuiltInTypes.getIntegerType()));
		assertFalse(table.getColumn("integerEnum").getSqmlType().isAssignableTo(SqmlBuiltInTypes.getStringType()));
	}

	@Test
	public void testImplicitLiteralEnumType() {

		ISqmlEnum sqmlEnum = createTableTest("T", "db.t")//
			.add("PK Integer id = SERIAL")
			.add()
			.add("ENUM State {")
			.add("    OPEN")
			.add("    CLOSED")
			.add("}")
			.getTable()
			.getEnum("State");

		assertSame(SqmlStringType.get(), sqmlEnum.getLiteralValueType());
	}

	@Test
	public void allowsOmissionOfLiteralTypeForStringEnums() {

		createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("State state")
			.add()
			.add("ENUM State {")
			.add("    OPEN")
			.add("    CLOSED")
			.add("}")
			.assertNoIssues();
	}
}
