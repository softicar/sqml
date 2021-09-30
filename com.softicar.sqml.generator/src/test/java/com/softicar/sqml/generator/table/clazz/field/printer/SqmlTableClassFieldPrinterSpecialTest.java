package com.softicar.sqml.generator.table.clazz.field.printer;

import com.softicar.platform.common.date.Time;
import com.softicar.sqml.generator.table.clazz.utils.AbstractSqmlTableClassPrinterTest;
import com.softicar.sqml.generator.table.clazz.utils.SqmlTableClassPrinterTestConfig;
import org.junit.Test;

public class SqmlTableClassFieldPrinterSpecialTest extends AbstractSqmlTableClassPrinterTest {

	@Test
	public void testGenerationOfTimeField() {

		String tableDefinition = new StringBuilder()
			.append("CREATE TABLE `db`.`foo` (")
			.append("    `id` INT AUTO_INCREMENT,")
			.append("    `time` TIME NOT NULL DEFAULT '13:06:55',")
			.append("    PRIMARY KEY (`id`)")
			.append(")")
			.toString();

		generateCode(tableDefinition)//
			.assertLine("import %s;", Time.class.getCanonicalName())
			.assertLine(
				new StringBuilder()
					.append("public static final IDbTimeField<Foo> TIME")
					.append(" = BUILDER.addTimeField(\"time\", o->o.time, (o,v)->o.time=v).setTitle(TestI18n.TIME).setDefault(new Time(13, 6, 55));")
					.toString());
	}

	@Test
	public void testGeneration8BitsUnsignedIdField() {

		String tableDefinition = new StringBuilder()
			.append("CREATE TABLE `db`.`foo` (")
			.append("    `id` tinyint AUTO_INCREMENT NOT NULL UNSIGNED,")
			.append("    PRIMARY KEY (`id`)")
			.append(")")
			.toString();

		generateCode(tableDefinition)//
			.assertLine(
				new StringBuilder()
					.append("public static final IDbIdField<Foo> ID")
					.append(" = BUILDER.addIdField(\"id\", o->o.id, (o,v)->o.id=v).setTitle(TestI18n.ID).setBits(8).setUnsigned();")
					.toString());
	}

	@Test
	public void testGenerationOfForeignKeyField() {

		String tableDefinition = new StringBuilder()
			.append("CREATE TABLE `db`.`foo` (")
			.append("    `id` INT AUTO_INCREMENT,")
			.append("    `bar` INT,")
			.append("    `baz` INT,")
			.append("    PRIMARY KEY (`id`),")
			.append("    CONSTRAINT `bar` FOREIGN KEY (`bar`) REFERENCES `bar` (`id`),")
			.append("    CONSTRAINT `xxx` FOREIGN KEY (`baz`) REFERENCES `bar` (`id`),")
			.append(")")
			.toString();

		addTable(
			new StringBuilder()
				.append("CREATE TABLE `db`.`Bar` (")
				.append("    `id` INT AUTO_INCREMENT,")
				.append("    PRIMARY KEY (`id`)")
				.append(")")
				.toString());

		generateCode(tableDefinition)//
			.assertForeignFieldDeclaration("Foo", "Bar", "bar", ".setTitle(TestI18n.BAR).setNullable()")
			.assertForeignFieldDeclaration("Foo", "Bar", "baz", ".setTitle(TestI18n.BAZ).setNullable().setForeignKeyName(\"xxx\")");
	}

	@Test
	public void testGenerationOfForeignKeyFieldWithVariousActions() {

		String tableDefinition = new StringBuilder()
			.append("CREATE TABLE `db`.`foo` (")
			.append("    `id` INT AUTO_INCREMENT,")
			.append("    `defaultActions` INT,")
			.append("    `cascadeAll` INT,")
			.append("    `onDeleteCascade` INT,")
			.append("    `onUpdateCascade` INT,")
			.append("    `onUpdateSetNull` INT,")
			.append("    PRIMARY KEY (`id`),")
			.append("    CONSTRAINT `defaultActions` FOREIGN KEY (`defaultActions`) REFERENCES `bar` (`id`),")
			.append("    CONSTRAINT `cascadeAll` FOREIGN KEY (`cascadeAll`) REFERENCES `bar` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,")
			.append("    CONSTRAINT `onDeleteCascade` FOREIGN KEY (`onDeleteCascade`) REFERENCES `bar` (`id`) ON DELETE CASCADE,")
			.append("    CONSTRAINT `onUpdateCascade` FOREIGN KEY (`onUpdateCascade`) REFERENCES `bar` (`id`) ON UPDATE CASCADE,")
			.append("    CONSTRAINT `onUpdateSetNull` FOREIGN KEY (`onUpdateSetNull`) REFERENCES `bar` (`id`) ON UPDATE SET NULL,")
			.append(")")
			.toString();

		addTable(
			new StringBuilder()
				.append("CREATE TABLE `db`.`Bar` (")
				.append("    `id` INT AUTO_INCREMENT,")
				.append("    PRIMARY KEY (`id`)")
				.append(")")
				.toString());

		generateCode(tableDefinition)//
			.assertForeignFieldDeclaration(//
				"Foo",
				"Bar",
				"defaultActions",
				".setTitle(TestI18n.DEFAULT_ACTIONS).setNullable()")
			.assertForeignFieldDeclaration(//
				"Foo",
				"Bar",
				"cascadeAll",
				".setTitle(TestI18n.CASCADE_ALL).setNullable().setCascade(true, true)")
			.assertForeignFieldDeclaration(//
				"Foo",
				"Bar",
				"onDeleteCascade",
				".setTitle(TestI18n.ON_DELETE_CASCADE).setNullable().setCascade(true, false)")
			.assertForeignFieldDeclaration(//
				"Foo",
				"Bar",
				"onUpdateCascade",
				".setTitle(TestI18n.ON_UPDATE_CASCADE).setNullable().setCascade(false, true)")
			.assertForeignFieldDeclaration(//
				"Foo",
				"Bar",
				"onUpdateSetNull",
				".setTitle(TestI18n.ON_UPDATE_SET_NULL).setNullable().setOnUpdate(DbForeignKeyAction.SET_NULL)");
	}

	@Test
	public void testGenerationOfBigIntForeignKeyField() {

		String tableDefinition = new StringBuilder()
			.append("CREATE TABLE `db`.`foo` (")
			.append("    `id` INT AUTO_INCREMENT,")
			.append("    `bar` BIGINT,")
			.append("    PRIMARY KEY (`id`),")
			.append("    CONSTRAINT `bar` FOREIGN KEY (`bar`) REFERENCES `bar` (`id`)")
			.append(")")
			.toString();

		addTable(
			new StringBuilder()
				.append("CREATE TABLE `db`.`bar` (")
				.append("    `id` BIGINT AUTO_INCREMENT,")
				.append("    PRIMARY KEY (`id`)")
				.append(")")
				.toString());

		generateCode(tableDefinition)//
			.assertForeignFieldDeclaration("Foo", "Bar", "bar", ".setTitle(TestI18n.BAR).setNullable()");
	}

	@Test
	public void testGenerationOfBigIntForeignKeyFieldAsPrimaryKey() {

		String tableDefinition = new StringBuilder()
			.append("CREATE TABLE `db`.`foo` (")
			.append("    `bar` BIGINT,")
			.append("    PRIMARY KEY (`bar`),")
			.append("    CONSTRAINT `bar` FOREIGN KEY (`bar`) REFERENCES `bar` (`id`)")
			.append(")")
			.toString();

		addTable(
			new StringBuilder()
				.append("CREATE TABLE `db`.`bar` (")
				.append("    `id` BIGINT AUTO_INCREMENT,")
				.append("    PRIMARY KEY (`id`)")
				.append(")")
				.toString());

		generateCode(tableDefinition)//
			.assertForeignFieldDeclaration("Foo", "Bar", "bar", ".setTitle(TestI18n.BAR).setNullable()");
	}

	@Test
	public void testGenerationOf8BitUnsignedForeignKeyField() {

		String tableDefinition = new StringBuilder()
			.append("CREATE TABLE `db`.`foo` (")
			.append("    `id` INT AUTO_INCREMENT,")
			.append("    `bar` TINYINT UNSIGNED,")
			.append("    PRIMARY KEY (`id`),")
			.append("    CONSTRAINT `bar` FOREIGN KEY (`bar`) REFERENCES `bar` (`id`),")
			.append(")")
			.toString();

		addTable(
			new StringBuilder()
				.append("CREATE TABLE `db`.`bar` (")
				.append("    `id` TINYINT UNSIGNED AUTO_INCREMENT,")
				.append("    PRIMARY KEY (`id`)")
				.append(")")
				.toString());

		generateCode(tableDefinition)//
			.assertForeignFieldDeclaration("Foo", "Bar", "bar", ".setTitle(TestI18n.BAR).setNullable()");
	}

	@Test
	public void testGenerationOfCustomTableClass() {

		String tableDefinition = new StringBuilder()
			.append("CREATE TABLE `db`.`foo` (")
			.append("    `id` INT AUTO_INCREMENT,")
			.append("    PRIMARY KEY (`id`)")
			.append(")")
			.toString();

		config.setExistingCode(SqmlTableClassPrinterTestConfig.PACKAGE_NAME.getClassName("FooTable"), "");

		generateCode(tableDefinition)//
			.assertLine(
				new StringBuilder()//
					.append("public static final FooTable TABLE")
					.append(" = new FooTable(BUILDER);")
					.toString())
			.assertLine("public final FooTable table() {");
	}
}
