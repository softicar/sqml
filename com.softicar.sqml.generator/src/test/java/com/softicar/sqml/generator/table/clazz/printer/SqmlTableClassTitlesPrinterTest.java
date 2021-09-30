package com.softicar.sqml.generator.table.clazz.printer;

import com.softicar.platform.db.core.table.DbTableName;
import com.softicar.sqml.generator.table.clazz.utils.AbstractSqmlTableClassPrinterTest;
import org.junit.Test;

public class SqmlTableClassTitlesPrinterTest extends AbstractSqmlTableClassPrinterTest {

	public SqmlTableClassTitlesPrinterTest() {

		super(new DbTableName("db", "FooBar"));
	}

	@Test
	public void testWithI18nClass() {

		String tableDefinition = new StringBuilder()
			.append("CREATE TABLE `db`.`FooBar` (")
			.append("    `id` INT NOT NULL AUTO_INCREMENT,")
			.append("    `name` VARCHAR DEFAULT 'bar',")
			.append("    PRIMARY KEY (`id`)")
			.append(")")
			.toString();

		generateCode(tableDefinition)//
			.assertLine("BUILDER.setTitle(TestI18n.FOO_BAR);")
			.assertLine("BUILDER.setPluralTitle(TestI18n.FOO_BARS);");
	}

	@Test
	public void testWithoutI18nClass() {

		config.setI18nClass("");

		String tableDefinition = new StringBuilder()
			.append("CREATE TABLE `db`.`FooBar` (")
			.append("    `id` INT NOT NULL AUTO_INCREMENT,")
			.append("    `name` VARCHAR DEFAULT 'bar',")
			.append("    PRIMARY KEY (`id`)")
			.append(")")
			.toString();

		generateCode(tableDefinition)//
			.assertLine("BUILDER.setTitle(IDisplayString.create(\"Foo Bar\"));")
			.assertLine("BUILDER.setPluralTitle(IDisplayString.create(\"Foo Bars\"));");
	}
}
