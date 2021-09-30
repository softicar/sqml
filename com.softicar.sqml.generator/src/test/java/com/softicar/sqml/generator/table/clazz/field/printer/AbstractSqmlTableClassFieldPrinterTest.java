package com.softicar.sqml.generator.table.clazz.field.printer;

import com.softicar.platform.db.core.table.DbTableName;
import com.softicar.platform.db.structure.mysql.parser.DbMysqlCreateTableStatementParser;
import com.softicar.platform.db.structure.table.IDbTableStructure;
import com.softicar.sqml.generator.table.clazz.field.utils.SqmlTableClassFieldUtils;
import com.softicar.sqml.generator.table.clazz.printer.ISqmlTableClassPrinterConfig;
import com.softicar.sqml.generator.table.clazz.printer.SqmlTableClassPrinter;
import com.softicar.sqml.generator.table.clazz.utils.SqmlTableClassPrinterTestConfig;
import org.junit.Assert;

public abstract class AbstractSqmlTableClassFieldPrinterTest extends Assert {

	public String generateStaticFinal(String fieldDefinition) {

		return new TestCase(fieldDefinition).generateStaticFinal();
	}

	public static void assertStartsWith(String start, String text) {

		if (!text.startsWith(start)) {
			fail(String.format("Failed assertion: expected '%s' to start with '%s'", text, start));
		}
	}

	public static void assertEndsWith(String end, String text) {

		if (!text.endsWith(end)) {
			fail(String.format("Failed assertion: expected '%s' to end with '%s'", text, end));
		}
	}

	public static void assertMatches(String pattern, String text) {

		if (!text.matches(pattern)) {
			fail(String.format("Failed assertion: expected '%s' to match '%s'", text, pattern));
		}
	}

	private static class TestCase {

		private final DbTableName tableName;
		private final IDbTableStructure tableStructure;
		private final ISqmlTableClassPrinterConfig config;
		private final SqmlTableClassPrinter classGenerator;
		private final ISqmlTableClassFieldPrinter fieldGenerator;

		public TestCase(String fieldDefinition) {

			this.tableName = new DbTableName("db", "foo");
			this.tableStructure = new DbMysqlCreateTableStatementParser(getCreateTableStatement(fieldDefinition)).parse();
			this.config = new SqmlTableClassPrinterTestConfig(tableName).addTableStructure(tableStructure);
			this.classGenerator = new SqmlTableClassPrinter(config, tableName);
			this.fieldGenerator = SqmlTableClassFieldUtils.createPrinter(classGenerator, tableStructure.getColumns().get(1), config);

		}

		private String getCreateTableStatement(String fieldDefinition) {

			return String.format("CREATE TABLE `db`.`foo` (`id` INT AUTO_INCREMENT, %s, PRIMARY KEY (`id`))", fieldDefinition);
		}

		public String generateStaticFinal() {

			fieldGenerator.printStaticFinal(1);
			return classGenerator.getCodeLines().get(0);
		}
	}
}
