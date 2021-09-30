package com.softicar.sqml.test.tables;

import com.softicar.sqml.model.tables.validation.SqmlIssueMissingSerialColumn;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlTableClassGeneratorTest extends AbstractSqmlTest {

	@Test
	public void testTrivialTable() {

		createTableTest("Item", "db.item")//
			.add("PK Integer itemId = SERIAL ['id']")
			.assertJava("package com.example;")
			.assertJava()
			.assertJava("public class Item extends AbstractDbObject<Item> {")
			.assertJava("public static final IDbIdField<Item> ID = BUILDER.addIdField(\"id\"...);");
	}

	@Test
	public void testForeignReferences() {

		createTableTest("Container", "db.containers")//
			.add("PK Integer id = SERIAL")
			.assertNoIssues();

		createTableTest("Item", "db.items")//
			.add("PK Integer id = SERIAL")
			.add("Container container")
			.assertJava("public final Container getContainer() {")
			.assertJava("public final Item setContainer(Container value) {");
	}

	@Test
	public void testSelfReferences() {

		createTableTest("Item", "db.items")//
			.add("PK Integer id = SERIAL")
			.add("Item parent")
			.assertJava("public static final IDbForeignField<Item, Item> PARENT = ...")
			.assertJava("public final Item getParent() {")
			.assertJava("public final Item setParent(Item value) {");
	}

	@Test
	public void testFourPrimaryKeyColumns() {

		createTableTest("Foo", "db.foo")//
			.add("PK Integer a")
			.add("PK Integer b")
			.add("PK Integer c")
			.add("PK Integer d")
			.assertIssue(SqmlIssueMissingSerialColumn.class, 2)
			.assertJava("public class Foo extends AbstractDbRecord<Foo, Tuple4<Integer, Integer, Integer, Integer>> {")
			.assertJava("public static final IDbTableKey<Foo, Tuple4<Integer, Integer, Integer, Integer>> PRIMARY_KEY = ...");
	}

	@Test
	public void testUniqueKeys() {

		createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("String foo")
			.add("String bar")
			.add("UK foo")
			.add("UK foo bar")
			.add("UK foo bar AS x")
			.assertJava("public static final IDbKey<Foo> UK_FOO = BUILDER.addUniqueKey(\"foo\", FOO);")
			.assertJava("public static final IDbKey<Foo> UK_FOO_BAR = BUILDER.addUniqueKey(\"fooBar\", FOO, BAR);")
			.assertJava("public static final IDbKey<Foo> UK_X = BUILDER.addUniqueKey(\"x\", FOO, BAR);");
	}

	@Test
	public void testIndexKeys() {

		createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("String foo")
			.add("String bar")
			.add("IK foo")
			.add("IK foo bar")
			.add("IK foo bar AS x")
			.assertJava("public static final IDbKey<Foo> IK_FOO = BUILDER.addIndexKey(\"foo\", FOO);")
			.assertJava("public static final IDbKey<Foo> IK_FOO_BAR = BUILDER.addIndexKey(\"fooBar\", FOO, BAR);")
			.assertJava("public static final IDbKey<Foo> IK_X = BUILDER.addIndexKey(\"x\", FOO, BAR);");
	}
}
