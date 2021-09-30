package com.softicar.sqml.test.tables;

import com.softicar.sqml.model.tables.validation.SqmlIssueIncompatibleTypeOfDefaultValue;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlDefaultValueTest extends AbstractSqmlTest {

	@Test
	public void testDefaultValues() {

		createTableTest("Item", "db.items")//
			.add("PK Integer itemId = SERIAL ['id']")
			.add("String name = 'hello'")
			.add("String notNullWithoutDefault")
			.add("String notNullWithDefault = 'foo'")
			.add("String nullableWithoutDefault [NULLABLE]")
			.add("String nullableWithDefault = 'foo' [NULLABLE]")
			.add("String nullableWithDefaultNull = NULL [NULLABLE]")
			.add("Integer integer = -33")
			.add("Day day = NOW")
			.add("DayTime dayTime = NOW")
			.assertJava("public static final ... NAME = ...).setDefault(\"hello\");")
			.assertJava("public static final ... NOT_NULL_WITHOUT_DEFAULT = ...);")
			.assertJava("public static final ... NOT_NULL_WITH_DEFAULT = ...).setDefault(\"foo\");")
			.assertJava("public static final ... NULLABLE_WITHOUT_DEFAULT = ...).setNullable();")
			.assertJava("public static final ... NULLABLE_WITH_DEFAULT = ...).setNullable().setDefault(\"foo\");")
			.assertJava("public static final ... NULLABLE_WITH_DEFAULT_NULL = ...).setNullable().setDefault(null);")
			.assertJava("public static final ... INTEGER = ...).setDefault(-33);")
			.assertJava("public static final ... DAY = ...).setDefaultToday();")
			.assertJava("public static final ... DAY_TIME = ...).setDefaultNow();");
	}

	@Test
	public void prohibitsIncompatibleLiterals() {

		createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("String name = 1")
			.add("Integer number = 'foo'")
			.assertIssue(SqmlIssueIncompatibleTypeOfDefaultValue.class, 4)
			.assertIssue(SqmlIssueIncompatibleTypeOfDefaultValue.class, 5)
			.assertNoMoreIssues();
	}

	@Test
	public void testEnumDefaultValues() {

		createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("State state = State.OPEN")
			.add("Strange strange = Strange.STRANGE")
			.add()
			.add("ENUM State ON String {")
			.add("    OPEN")
			.add("}")
			.add()
			.add("ENUM Strange ON String {")
			.add("    STRANGE = '33 foo'")
			.add("}")
			.assertNoIssues()
			.assertJava("public static final ... STATE = ..., State.class)...setDefault(State.OPEN);")
			.assertJava("public static final ... STRANGE = ..., Strange.class)...setDefault(Strange._33_FOO);");
	}

	@Test
	public void prohibitsIncompatibleEnumerators() {

		createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("State1 state1 = State2.OPEN")
			.add("State2 state2 = State1.OPEN")
			.add()
			.add("ENUM State1 ON String {")
			.add("    OPEN = 'OPEN'")
			.add("}")
			.add()
			.add("ENUM State2 ON String {")
			.add("    OPEN = 'OPEN'")
			.add("}")
			.assertIssue(SqmlIssueIncompatibleTypeOfDefaultValue.class, 4)
			.assertIssue(SqmlIssueIncompatibleTypeOfDefaultValue.class, 5)
			.assertNoMoreIssues();
	}
}
