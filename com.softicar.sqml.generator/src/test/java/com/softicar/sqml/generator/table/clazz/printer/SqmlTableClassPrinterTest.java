package com.softicar.sqml.generator.table.clazz.printer;

import com.softicar.sqml.generator.table.clazz.utils.AbstractSqmlTableClassPrinterTest;
import org.junit.Test;

public class SqmlTableClassPrinterTest extends AbstractSqmlTableClassPrinterTest {

	@Test
	public void testTableStructureGeneration() {

		String tableDefinition = new StringBuilder()
			.append("CREATE TABLE `db`.`foo` (")
			.append("    `id` INT NOT NULL AUTO_INCREMENT,")
			.append("    `name` VARCHAR DEFAULT 'bar',")
			.append("    PRIMARY KEY (`id`)")
			.append(")")
			.toString();

		generateCode(tableDefinition)//
			.assertLine(
				new StringBuilder()
					.append("private static final DbObjectTableBuilder<Foo, Foo> BUILDER")
					.append(" = new DbObjectTableBuilder<>(\"db\", \"foo\", Foo::new, Foo.class);")
					.toString())
			.assertLine("public static final IDbIdField<Foo> ID = BUILDER.addIdField(\"id\", o->o.id, (o,v)->o.id=v).setTitle(TestI18n.ID);")
			.assertLine(
				new StringBuilder()
					.append("public static final IDbStringField<Foo> NAME")
					.append(" = BUILDER.addStringField(\"name\", o->o.name, (o,v)->o.name=v).setTitle(TestI18n.NAME).setNullable().setDefault(\"bar\");")
					.toString())
			.assertLine("public static final DbObjectTable<Foo> TABLE = new DbObjectTable<>(BUILDER);");
	}

	@Test
	public void testUniqueKeyGeneration() {

		String tableDefinition = new StringBuilder()
			.append("CREATE TABLE `db`.`foo` (")
			.append("    `id` INT NOT NULL AUTO_INCREMENT,")
			.append("    `foo` VARCHAR,")
			.append("    `bar` VARCHAR,")
			.append("    PRIMARY KEY (`id`)")
			.append("    UNIQUE KEY `foo` (`foo`)")
			.append("    UNIQUE KEY `foobar` (`foo`,`bar`)")
			.append(")")
			.toString();

		generateCode(tableDefinition)//
			.assertLine("public static final IDbKey<Foo> UK_FOO = BUILDER.addUniqueKey(\"foo\", FOO);")
			.assertLine("public static final IDbKey<Foo> UK_FOOBAR = BUILDER.addUniqueKey(\"foobar\", FOO, BAR);");
	}

	@Test
	public void testIndexKeyGeneration() {

		String tableDefinition = new StringBuilder()
			.append("CREATE TABLE `db`.`foo` (")
			.append("    `id` INT NOT NULL AUTO_INCREMENT,")
			.append("    `foo` VARCHAR,")
			.append("    `bar` VARCHAR,")
			.append("    PRIMARY KEY (`id`)")
			.append("    KEY `foo` (`foo`)")
			.append("    KEY `foobar` (`foo`,`bar`)")
			.append(")")
			.toString();

		generateCode(tableDefinition)//
			.assertLine("public static final IDbKey<Foo> IK_FOO = BUILDER.addIndexKey(\"foo\", FOO);")
			.assertLine("public static final IDbKey<Foo> IK_FOOBAR = BUILDER.addIndexKey(\"foobar\", FOO, BAR);");
	}

	@Test
	public void testForeignKeyToDbRecordTable() {

		addTable(
			new StringBuilder()//
				.append("CREATE TABLE `db`.`bar` (")
				.append("    `name` VARCHAR NOT NULL,")
				.append("    `value` INT,")
				.append("    PRIMARY KEY (`name`)")
				.append(")")
				.toString());

		String tableDefinition = new StringBuilder()//
			.append("CREATE TABLE `db`.`foo` (")
			.append("    `id` INT NOT NULL AUTO_INCREMENT,")
			.append("    `bar` VARCHAR DEFAULT 'xxx',")
			.append("    PRIMARY KEY (`id`),")
			.append("    CONSTRAINT `bar` FOREIGN KEY (`bar`) REFERENCES `db`.`bar` (`name`)")
			.append(")")
			.toString();

		generateCode(tableDefinition)//
			.assertLine(
				new StringBuilder()//
					.append("public static final IDbForeignRowField<Foo, Bar, String> BAR")
					.append(
						" = BUILDER.addForeignRowField(\"bar\", o->o.bar, (o,v)->o.bar=v, Bar.NAME).setTitle(TestI18n.BAR).setNullable().setDefault(\"xxx\");")
					.toString());
	}

	@Test
	public void testForeignKeyToNonPkColumn() {

		addTable(
			new StringBuilder()//
				.append("CREATE TABLE `db`.`bar` (")
				.append("    `id` INT NOT NULL AUTO_INCREMENT,")
				.append("    `value` INT,")
				.append("    PRIMARY KEY (`id`)")
				.append(")")
				.toString());

		String tableDefinition = new StringBuilder()//
			.append("CREATE TABLE `db`.`foo` (")
			.append("    `id` INT NOT NULL AUTO_INCREMENT,")
			.append("    `bar` INT,")
			.append("    PRIMARY KEY (`id`),")
			.append("    CONSTRAINT `bar` FOREIGN KEY (`bar`) REFERENCES `bar` (`value`)")
			.append(")")
			.toString();

		generateCode(tableDefinition)//
			.assertLine(
				new StringBuilder()//
					.append("public static final IDbIntegerField<Foo> BAR")
					.append(" = BUILDER.addIntegerField(\"bar\", o->o.bar, (o,v)->o.bar=v).setTitle(TestI18n.BAR).setNullable();")
					.toString())
			.assertLine("private Integer bar;");
	}

	@Test
	public void testForeignKeyToPrimaryForeignKeyTable() {

		addTable(
			new StringBuilder()//
				.append("CREATE TABLE `db`.`bar` (")
				.append("    `id` INT NOT NULL AUTO_INCREMENT,")
				.append("    `value` INT,")
				.append("    PRIMARY KEY (`id`)")
				.append(")")
				.toString());
		addTable(
			new StringBuilder()//
				.append("CREATE TABLE `db`.`baz` (")
				.append("    `bar` INT,")
				.append("    `value` INT,")
				.append("    PRIMARY KEY (`bar`),")
				.append("    CONSTRAINT `bar` FOREIGN KEY (`bar`) REFERENCES `bar` (`id`)")
				.append(")")
				.toString());

		String tableDefinition = new StringBuilder()//
			.append("CREATE TABLE `db`.`foo` (")
			.append("    `baz` INT,")
			.append("    `value` INT,")
			.append("    PRIMARY KEY (`baz`),")
			.append("    CONSTRAINT `baz` FOREIGN KEY (`baz`) REFERENCES `baz` (`bar`)")
			.append(")")
			.toString();

		generateCode(tableDefinition)//
			.assertLine(
				new StringBuilder()//
					.append("public static final IDbForeignRowField<Foo, Baz, Bar> BAZ")
					.append(" = BUILDER.addForeignRowField(\"baz\", o->o.baz, (o,v)->o.baz=v, Baz.BAR).setTitle(TestI18n.BAZ).setNullable();")
					.toString());
	}

	@Test
	public void testSubObjectTable() {

		addTable(
			new StringBuilder()//
				.append("CREATE TABLE `db`.`bar` (")
				.append("    `id` INT NOT NULL AUTO_INCREMENT,")
				.append("    `value` INT,")
				.append("    PRIMARY KEY (`id`)")
				.append(")")
				.toString());

		String tableDefinition = new StringBuilder()//
			.append("CREATE TABLE `db`.`foo` (")
			.append("    `bar` INT COMMENT '@base@',")
			.append("    `name` VARCHAR DEFAULT 'xxx',")
			.append("    PRIMARY KEY (`bar`),")
			.append("    CONSTRAINT `bar` FOREIGN KEY (`bar`) REFERENCES `bar` (`id`)")
			.append(")")
			.toString();

		generateCode(tableDefinition)//
			.assertLine("public class Foo extends AbstractDbSubObject<Foo, Bar> {")
			.assertLine(
				new StringBuilder()
					.append("private static final DbSubObjectTableBuilder<Foo, Foo, Bar, Integer> BUILDER")
					.append(" = new DbSubObjectTableBuilder<>(\"db\", \"foo\", Foo::new, Foo.class);")
					.toString())
			.assertLine(
				new StringBuilder()
					.append("public static final IDbBaseField<Foo, Bar, Integer> BAR")
					.append(
						" = BUILDER.addBaseField(\"bar\", o->o.bar, (o,v)->o.bar=v, Bar.TABLE).setTitle(TestI18n.BAR).setNullable().setComment(\"@base@\");")
					.toString())
			.assertLine(
				new StringBuilder()
					.append("public static final IDbStringField<Foo> NAME")
					.append(" = BUILDER.addStringField(\"name\", o->o.name, (o,v)->o.name=v).setTitle(TestI18n.NAME).setNullable().setDefault(\"xxx\");")
					.toString())
			.assertLine("public static final DbSubObjectTable<Foo, Bar, Integer> TABLE = new DbSubObjectTable<>(BUILDER);")
			.assertLine("public final Bar getBar() {")
			.assertLine("	return pk();")
			.assertLine("private Bar bar;")
			.assertLine("private String name;");
	}

	@Test
	public void testSubObjectTableWithBigIntId() {

		addTable(
			new StringBuilder()//
				.append("CREATE TABLE `db`.`bar` (")
				.append("    `id` BIGINT NOT NULL AUTO_INCREMENT,")
				.append("    `value` INT,")
				.append("    PRIMARY KEY (`id`)")
				.append(")")
				.toString());

		String tableDefinition = new StringBuilder()//
			.append("CREATE TABLE `db`.`foo` (")
			.append("    `bar` BIGINT COMMENT '@base@',")
			.append("    `name` VARCHAR DEFAULT 'xxx',")
			.append("    PRIMARY KEY (`bar`),")
			.append("    CONSTRAINT `bar` FOREIGN KEY (`bar`) REFERENCES `bar` (`id`)")
			.append(")")
			.toString();

		generateCode(tableDefinition)//
			.assertLine("public class Foo extends AbstractDbSubObject<Foo, Bar> {")
			.assertLine(
				new StringBuilder()
					.append("private static final DbSubObjectTableBuilder<Foo, Foo, Bar, Long> BUILDER")
					.append(" = new DbSubObjectTableBuilder<>(\"db\", \"foo\", Foo::new, Foo.class);")
					.toString())
			.assertLine(
				new StringBuilder()
					.append("public static final IDbBaseField<Foo, Bar, Long> BAR")
					.append(" = BUILDER.addBaseField(\"bar\", o->o.bar, (o,v)->o.bar=v, Bar.TABLE)")
					.append(".setTitle(TestI18n.BAR).setNullable().setComment(\"@base@\");")
					.toString())
			.assertLine(
				new StringBuilder()
					.append("public static final IDbStringField<Foo> NAME")
					.append(" = BUILDER.addStringField(\"name\", o->o.name, (o,v)->o.name=v)")
					.append(".setTitle(TestI18n.NAME).setNullable().setDefault(\"xxx\");")
					.toString())
			.assertLine("public static final DbSubObjectTable<Foo, Bar, Long> TABLE = new DbSubObjectTable<>(BUILDER);")
			.assertLine("public final Bar getBar() {")
			.assertLine("	return pk();")
			.assertLine("private Bar bar;")
			.assertLine("private String name;");
	}
}
