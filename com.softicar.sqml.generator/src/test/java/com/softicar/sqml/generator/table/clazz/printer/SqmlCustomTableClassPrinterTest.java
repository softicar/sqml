package com.softicar.sqml.generator.table.clazz.printer;

import com.softicar.platform.db.structure.mysql.parser.DbMysqlCreateTableStatementParser;
import com.softicar.platform.db.structure.table.DbTableStructure;
import com.softicar.sqml.generator.table.clazz.utils.SqmlTableClassCodeAsserter;
import com.softicar.sqml.generator.table.clazz.utils.SqmlTableClassPrinterTestConfig;
import org.junit.Assert;
import org.junit.Test;

public class SqmlCustomTableClassPrinterTest extends Assert {

	@Test
	public void testPrintClassFileWithRecordTable() {

		String tableDefinition = new StringBuilder()
			.append("CREATE TABLE `db`.`foo` (")
			.append("    `id` INT NOT NULL,")
			.append("    `name` VARCHAR NOT NULL,")
			.append("    PRIMARY KEY (`id`),")
			.append(")")
			.toString();
		DbTableStructure tableStructure = new DbMysqlCreateTableStatementParser(tableDefinition).parse();

		generateCode(tableStructure)//
			.assertLine("public class FooTable extends DbRecordTable<Foo, Integer> {")
			.assertLine("protected FooTable(IDbTableBuilder<Foo, Integer> builder) {")
			.assertLine("super(builder);");
	}

	private SqmlTableClassCodeAsserter generateCode(DbTableStructure tableStructure) {

		SqmlTableClassPrinterTestConfig config = new SqmlTableClassPrinterTestConfig(tableStructure.getTableName());
		config.addTableStructure(tableStructure);
		SqmlTableClassPrinter classPrinter = new SqmlTableClassPrinter(config, tableStructure.getTableName());
		new SqmlCustomTableClassPrinter(classPrinter).printClassFile();
		return new SqmlTableClassCodeAsserter(config.getGeneratedCode());
	}
}
