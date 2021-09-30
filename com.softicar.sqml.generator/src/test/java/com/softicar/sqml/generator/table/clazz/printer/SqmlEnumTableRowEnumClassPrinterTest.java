package com.softicar.sqml.generator.table.clazz.printer;

import com.softicar.platform.db.structure.column.IDbColumnStructure;
import com.softicar.platform.db.structure.enums.DbEnumTableRowStructure;
import com.softicar.platform.db.structure.enums.IDbEnumTableRowValue;
import com.softicar.platform.db.structure.mysql.parser.DbMysqlCreateTableStatementParser;
import com.softicar.platform.db.structure.table.DbTableStructure;
import com.softicar.sqml.generator.table.clazz.utils.SqmlTableClassCodeAsserter;
import com.softicar.sqml.generator.table.clazz.utils.SqmlTableClassPrinterTestConfig;
import java.math.BigDecimal;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class SqmlEnumTableRowEnumClassPrinterTest extends Assert {

	private DbTableStructure tableStructure;

	@Test
	public void test() {

		String tableDefinition = new StringBuilder()
			.append("CREATE TABLE `db`.`foo` (")
			.append("    `id` INT NOT NULL AUTO_INCREMENT,")
			.append("    `name` VARCHAR NOT NULL,")
			.append("    `boolean` BOOL NOT NULL,")
			.append("    `decimal` DECIMAL(10,2) NOT NULL,")
			.append("    `double` DOUBLE NOT NULL,")
			.append("    `float` FLOAT NOT NULL,")
			.append("    `integer` INT NOT NULL,")
			.append("    `long` BIGINT NOT NULL,")
			.append("    `string` VARCHAR NOT NULL,")
			.append("    PRIMARY KEY (`id`)")
			.append(") COMMENT = '@enum@'")
			.toString();
		this.tableStructure = new DbMysqlCreateTableStatementParser(tableDefinition).parse();

		addEnumTableRow(1, "A", true, new BigDecimal("1.12"), 2.41d, 3.14f, 123, 123L, "foo");
		addEnumTableRow(2, "B", false, new BigDecimal("4.12"), 5.41d, 6.14f, 321, 321L, "bar");
		addEnumTableRow(3, "C", null, null, null, null, null, null, null);

		generateCode(tableStructure)//
			.assertLine("public enum FooEnum implements IDbEnumTableRowEnum<FooEnum, Foo>, IDisplayable {")
			.assertLine("A(1, \"A\", true, new BigDecimal(\"1.12\"), 2.41d, 3.14f, 123, 123L, \"foo\"),")
			.assertLine("B(2, \"B\", false, new BigDecimal(\"4.12\"), 5.41d, 6.14f, 321, 321L, \"bar\"),")
			.assertLine("C(3, \"C\", null, null, null, null, null, null, null),")
			.assertLine("private Integer id;")
			.assertLine("private String name;")
			.assertLine("private Boolean boolean;")
			.assertLine("private BigDecimal decimal;")
			.assertLine("private Double double;")
			.assertLine("private Float float;")
			.assertLine("private Integer integer;")
			.assertLine("private Long long;")
			.assertLine("private String string;")
			.assertLine("public IDisplayString toDisplay() {")
			.assertLine("case A:")
			.assertLine("return TestI18n.A;")
			.assertLine("case B:")
			.assertLine("return TestI18n.B;")
			.assertLine("case C:")
			.assertLine("return TestI18n.C;")
			.assertLine("public void setFields(ISqlFieldValueConsumer<Foo> consumer) {")
			.assertLine("consumer.consumeFieldValue(Foo.ID, id);")
			.assertLine("consumer.consumeFieldValue(Foo.NAME, name);")
			.assertLine("consumer.consumeFieldValue(Foo.BOOLEAN, boolean);")
			.assertLine("consumer.consumeFieldValue(Foo.DECIMAL, decimal);")
			.assertLine("consumer.consumeFieldValue(Foo.DOUBLE, double);")
			.assertLine("consumer.consumeFieldValue(Foo.FLOAT, float);")
			.assertLine("consumer.consumeFieldValue(Foo.INTEGER, integer);")
			.assertLine("consumer.consumeFieldValue(Foo.LONG, long);")
			.assertLine("consumer.consumeFieldValue(Foo.STRING, string);");
	}

	@Test
	public void testWithNameColumnNameOverride() {

		String tableDefinition = new StringBuilder()
			.append("CREATE TABLE `db`.`foo` (")
			.append("    `id` INT NOT NULL AUTO_INCREMENT,")
			.append("    `foo` VARCHAR NOT NULL COMMENT '@name=name@',")
			.append("    PRIMARY KEY (`id`),")
			.append(") COMMENT = '@enum@'")
			.toString();
		this.tableStructure = new DbMysqlCreateTableStatementParser(tableDefinition).parse();

		addEnumTableRow(1, "foo");
		addEnumTableRow(2, "bar");

		generateCode(tableStructure)//
			.assertLine("public enum FooEnum implements IDbEnumTableRowEnum<FooEnum, Foo>, IDisplayable {")
			.assertLine("FOO(1, \"foo\"),")
			.assertLine("BAR(2, \"bar\"),")
			.assertLine("private Integer id;")
			.assertLine("private String name;");
	}

	@Test
	public void testWithAmbiguousNameColumn() {

		String tableDefinition = new StringBuilder()
			.append("CREATE TABLE `db`.`foo` (")
			.append("    `id` INT NOT NULL AUTO_INCREMENT,")
			.append("    `title` VARCHAR NOT NULL COMMENT '@name=name@',")
			.append("    `name` VARCHAR COMMENT '@name=shortName@',")
			.append("    PRIMARY KEY (`id`),")
			.append(") COMMENT = '@enum@'")
			.toString();
		this.tableStructure = new DbMysqlCreateTableStatementParser(tableDefinition).parse();

		addEnumTableRow(1, "foo", "F");
		addEnumTableRow(2, "bar", "B");

		generateCode(tableStructure)//
			.assertLine("public enum FooEnum implements IDbEnumTableRowEnum<FooEnum, Foo>, IDisplayable {")
			.assertLine("FOO(1, \"foo\", \"F\"),")
			.assertLine("BAR(2, \"bar\", \"B\"),")
			.assertLine("private Integer id;")
			.assertLine("private String name;")
			.assertLine("private String shortName;");
	}

	private void addEnumTableRow(Object...values) {

		DbEnumTableRowStructure tableRowStructure = new DbEnumTableRowStructure(tableStructure);

		List<? extends IDbColumnStructure> columnList = tableStructure.getColumns();
		for (int i = 0; i < values.length; i++) {
			tableRowStructure.setValue(columnList.get(i), IDbEnumTableRowValue.valueOf(values[i]));
		}

		tableStructure.addEnumTableRow(tableRowStructure);
	}

	private SqmlTableClassCodeAsserter generateCode(DbTableStructure tableStructure) {

		SqmlTableClassPrinterTestConfig config = new SqmlTableClassPrinterTestConfig(tableStructure.getTableName());
		config.addTableStructure(tableStructure);
		SqmlTableClassPrinter classPrinter = new SqmlTableClassPrinter(config, tableStructure.getTableName());
		new SqmlEnumTableRowEnumClassPrinter(classPrinter, tableStructure).printEnumClassFile();
		return new SqmlTableClassCodeAsserter(config.getGeneratedCode());
	}
}
