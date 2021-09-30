package com.softicar.sqml.generator.table.clazz.printer;

import com.softicar.platform.db.structure.mysql.parser.DbMysqlCreateTableStatementParser;
import com.softicar.platform.db.structure.table.IDbTableStructure;
import com.softicar.sqml.generator.table.clazz.utils.AbstractSqmlTableClassPrinterTest;
import org.junit.Test;

public class SqmlTableClassPrinterPrimaryKeyTest extends AbstractSqmlTableClassPrinterTest {

	@Test
	public void testObjectTable() {

		generateCode(
			new StringBuilder()//
				.append("CREATE TABLE `db`.`foo` (")
				.append("    `fooId` INT NOT NULL AUTO_INCREMENT,")
				.append("    `name` VARCHAR,")
				.append("    PRIMARY KEY (`fooId`)")
				.append(")")
				.toString())
					.assertLine("public class Foo extends AbstractDbObject<Foo> {")
					.assertLine(
						new StringBuilder()//
							.append("private static final DbObjectTableBuilder<Foo, Foo> BUILDER")
							.append(" = new DbObjectTableBuilder<>(\"db\", \"foo\", Foo::new, Foo.class);")
							.toString())
					.assertLine(
						new StringBuilder()//
							.append("public static final IDbIdField<Foo> ID")
							.append(" = BUILDER.addIdField(\"fooId\", o->o.id, (o,v)->o.id=v).setTitle(TestI18n.FOO_ID);")
							.toString())
					.assertLine("public static final DbObjectTable<Foo> TABLE = new DbObjectTable<>(BUILDER);")
					.assertLine("private Integer id;");
	}

	@Test
	public void testObjectWithBigIntIdTable() {

		generateCode(
			new StringBuilder()//
				.append("CREATE TABLE `db`.`foo` (")
				.append("    `fooId` BIGINT NOT NULL AUTO_INCREMENT,")
				.append("    `name` VARCHAR,")
				.append("    PRIMARY KEY (`fooId`)")
				.append(")")
				.toString())
					.assertLine("public class Foo extends AbstractDbObject<Foo> {")
					.assertLine(
						new StringBuilder()//
							.append("private static final DbObjectTableBuilder<Foo, Foo> BUILDER")
							.append(" = new DbObjectTableBuilder<>(\"db\", \"foo\", Foo::new, Foo.class);")
							.toString())
					.assertLine(
						new StringBuilder()//
							.append("public static final IDbIdField<Foo> ID")
							.append(" = BUILDER.addIdFieldForLong(\"fooId\", o->o.id, (o,v)->o.id=v).setTitle(TestI18n.FOO_ID);")
							.toString())
					.assertLine("private Integer id;");
	}

	@Test
	public void testRecordTable() {

		generateCode(
			new StringBuilder()//
				.append("CREATE TABLE `db`.`foo` (")
				.append("    `number` VARCHAR,")
				.append("    `value` INT,")
				.append("    PRIMARY KEY (`number`)")
				.append(")")
				.toString())
					.assertLine("public class Foo extends AbstractDbRecord<Foo, String> {")
					.assertLine(
						new StringBuilder()//
							.append("public static final IDbStringField<Foo> NUMBER")
							.append(" = BUILDER.addStringField(\"number\", o->o.number, (o,v)->o.number=v).setTitle(TestI18n.NUMBER).setNullable();")
							.toString())
					.assertLine(
						new StringBuilder()//
							.append("public static final IDbTableKey<Foo, String> PRIMARY_KEY")
							.append(" = BUILDER.setPrimaryKey(DbTableKeyFactory.createKey(NUMBER));")
							.toString())
					.assertLine("public static final DbRecordTable<Foo, String> TABLE = new DbRecordTable<>(BUILDER);")
					.assertLine("protected Foo() {")
					.assertLine("public final DbRecordTable<Foo, String> table() {")
					.assertLine("return TABLE;");
	}

	@Test
	public void testBinaryKeyTable() {

		generateCode(
			new StringBuilder()//
				.append("CREATE TABLE `db`.`foo` (")
				.append("    `id` INT,")
				.append("    `state` enum('ON','OFF'),")
				.append("    `number` VARCHAR,")
				.append("    PRIMARY KEY (`id`, `state`)")
				.append(")")
				.toString())
					.assertLine("public class Foo extends AbstractDbRecord<Foo, Tuple2<Integer, State>> {")
					.assertLine(
						new StringBuilder()//
							.append("public static final IDbIntegerField<Foo> ID")
							.append(" = BUILDER.addIntegerField(\"id\", o->o.id, (o,v)->o.id=v).setTitle(TestI18n.ID).setNullable();")
							.toString())
					.assertLine(
						new StringBuilder()//
							.append("public static final IDbTableKey<Foo, Tuple2<Integer, State>> PRIMARY_KEY")
							.append(" = BUILDER.setPrimaryKey(DbTableKeyFactory.createKey(ID, STATE));")
							.toString())
					.assertLine(
						new StringBuilder()//
							.append("public static final DbRecordTable<Foo, Tuple2<Integer, State>> TABLE")
							.append(" = new DbRecordTable<>(BUILDER);")
							.toString())
					.assertLine("protected Foo() {");
	}

	@Test
	public void testTernaryKeyTable() {

		generateCode(
			new StringBuilder()//
				.append("CREATE TABLE `db`.`foo` (")
				.append("    `number` VARCHAR,")
				.append("    `state` enum('ON','OFF'),")
				.append("    `length` DOUBLE,")
				.append("    `value` INT,")
				.append("    PRIMARY KEY (`number`, `state`, `length`)")
				.append(")")
				.toString())
					.assertLine("public class Foo extends AbstractDbRecord<Foo, Tuple3<String, State, Double>> {")
					.assertLine(
						new StringBuilder()//
							.append("public static final IDbTableKey<Foo, Tuple3<String, State, Double>> PRIMARY_KEY")
							.append(" = BUILDER.setPrimaryKey(DbTableKeyFactory.createKey(NUMBER, STATE, LENGTH));")
							.toString())
					.assertLine(
						new StringBuilder()//
							.append("public static final DbRecordTable<Foo, Tuple3<String, State, Double>> TABLE")
							.append(" = new DbRecordTable<>(BUILDER);")
							.toString())
					.assertLine("protected Foo() {");
	}

	@Test
	public void testQuadKeyTable() {

		generateCode(
			new StringBuilder()//
				.append("CREATE TABLE `db`.`foo` (")
				.append("    `a` INT,")
				.append("    `b` INT,")
				.append("    `c` INT,")
				.append("    `d` INT,")
				.append("    PRIMARY KEY (`a`, `b`, `c`, `d`)")
				.append(")")
				.toString())
					.assertLine("public class Foo extends AbstractDbRecord<Foo, Tuple4<Integer, Integer, Integer, Integer>> {")
					.assertLine(
						new StringBuilder()//
							.append("public static final IDbTableKey<Foo, Tuple4<Integer, Integer, Integer, Integer>> PRIMARY_KEY")
							.append(" = BUILDER.setPrimaryKey(DbTableKeyFactory.createKey(A, B, C, D));")
							.toString())
					.assertLine(
						new StringBuilder()//
							.append("public static final DbRecordTable<Foo, Tuple4<Integer, Integer, Integer, Integer>> TABLE")
							.append(" = new DbRecordTable<>(BUILDER);")
							.toString())
					.assertLine("protected Foo() {");
	}

	@Test
	public void testForeignKeyTable() {

		IDbTableStructure fooTable = new DbMysqlCreateTableStatementParser(
			new StringBuilder()//
				.append("CREATE TABLE `db`.`foo` (")
				.append("    `bar` INT,")
				.append("    `name` VARCHAR,")
				.append("    PRIMARY KEY (`bar`)")
				.append("    CONSTRAINT `bar` FOREIGN KEY (`bar`) REFERENCES `bar` (`id`)")
				.append(")")
				.toString()).parse();

		IDbTableStructure barTable = new DbMysqlCreateTableStatementParser(
			new StringBuilder()//
				.append("CREATE TABLE `db`.`bar` (")
				.append("    `id` INT AUTO_INCREMENT,")
				.append("    `name` VARCHAR,")
				.append("    PRIMARY KEY (`id`)")
				.append(")")
				.toString()).parse();

		generateCode(fooTable, barTable)
			.assertLine("public class Foo extends AbstractDbRecord<Foo, Bar> {")
			.assertLine(
				new StringBuilder()//
					.append("public static final IDbForeignField<Foo, Bar> BAR")
					.append(" = BUILDER.addForeignField(\"bar\", o->o.bar, (o,v)->o.bar=v, Bar.ID).setTitle(TestI18n.BAR).setNullable();")
					.toString())
			.assertLine("public static final IDbTableKey<Foo, Bar> PRIMARY_KEY = BUILDER.setPrimaryKey(DbTableKeyFactory.createKey(BAR));")
			.assertLine("public static final DbRecordTable<Foo, Bar> TABLE = new DbRecordTable<>(BUILDER);")
			.assertLine("protected Foo() {");
	}

	@Test
	public void testPkFieldAlwaysFirst() {

		generateCode(
			new StringBuilder()//
				.append("CREATE TABLE `db`.`foo` (")
				.append("    `name` VARCHAR,")
				.append("    `fooId` INT NOT NULL AUTO_INCREMENT,")
				.append("    PRIMARY KEY (`fooId`)")
				.append(")")
				.toString())
					.assertLine(
						new StringBuilder()//
							.append("public static final IDbIdField<Foo> ID")
							.append(" = BUILDER.addIdField(\"fooId\", o->o.id, (o,v)->o.id=v).setTitle(TestI18n.FOO_ID);")
							.toString())
					.assertLine(
						new StringBuilder()//
							.append("public static final IDbStringField<Foo> NAME")
							.append(" = BUILDER.addStringField(\"name\", o->o.name, (o,v)->o.name=v).setTitle(TestI18n.NAME).setNullable();")
							.toString());
	}
}
