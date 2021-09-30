package com.softicar.sqml.generator.table.clazz.printer;

import com.softicar.platform.db.structure.mysql.parser.DbMysqlCreateTableStatementParser;
import com.softicar.platform.db.structure.table.DbTableStructure;
import com.softicar.sqml.generator.table.clazz.utils.AbstractSqmlTableClassPrinterTest;
import org.junit.Test;

public class SqmlEnumTableClassPrinterTest extends AbstractSqmlTableClassPrinterTest {

	@Test
	public void testTableStructureGeneration() {

		String tableDefinition = new StringBuilder()
			.append("CREATE TABLE `db`.`foo` (")
			.append("    `id` INT NOT NULL AUTO_INCREMENT,")
			.append("    `name` VARCHAR NOT NULL,")
			.append("    PRIMARY KEY (`id`)")
			.append(") COMMENT = '@enum@'")
			.toString();

		DbTableStructure tableStructure = new DbMysqlCreateTableStatementParser(tableDefinition)//
			.parse()
			.setEnumTable(true);

		generateCode(tableStructure)//
			.assertLine("public class Foo extends AbstractDbEnumTableRow<Foo, FooEnum> {")
			.assertNoLine("...PRIMARY_KEY...")
			.assertLine("public static final DbEnumTable<Foo, FooEnum> TABLE = new DbEnumTable<>(BUILDER, FooEnum.values());");
	}
}
