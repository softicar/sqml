package com.softicar.sqml.test.generator.sqml;

import com.softicar.platform.common.string.Imploder;
import com.softicar.platform.db.structure.column.IDbColumnStructure;
import com.softicar.platform.db.structure.enums.DbEnumTableRowStructure;
import com.softicar.platform.db.structure.enums.IDbEnumTableRowValue;
import com.softicar.platform.db.structure.enums.value.DbEnumTableRowBigDecimalValue;
import com.softicar.platform.db.structure.enums.value.DbEnumTableRowBooleanValue;
import com.softicar.platform.db.structure.enums.value.DbEnumTableRowDoubleValue;
import com.softicar.platform.db.structure.enums.value.DbEnumTableRowFloatValue;
import com.softicar.platform.db.structure.enums.value.DbEnumTableRowIntegerValue;
import com.softicar.platform.db.structure.enums.value.DbEnumTableRowLongValue;
import com.softicar.platform.db.structure.enums.value.DbEnumTableRowStringValue;
import com.softicar.platform.db.structure.mysql.parser.DbMysqlCreateTableStatementParser;
import com.softicar.platform.db.structure.table.DbTableStructure;
import com.softicar.platform.db.structure.table.IDbTableStructure;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class SqmlEnumTableFileGeneratorTest extends AbstractSqmlTableFileGeneratorTest {

	private final List<String> createTableLines;
	private final List<List<IDbEnumTableRowValue>> tableRows;

	public SqmlEnumTableFileGeneratorTest() {

		this.createTableLines = new ArrayList<>();
		this.tableRows = new ArrayList<>();
	}

	@Test
	public void testSimpleCase() {

		addLine("`id` INT NOT NULL AUTO_INCREMENT");
		addLine("`name` VARCHAR(255) NOT NULL");
		addLine("PRIMARY KEY (`id`)");

		addTableRow(1, "FOO");
		addTableRow(2, "BAR");

		generateCode()//
			.assertLine("ENUM TABLE Foo 'db.foo' {")
			.assertLine("    PK Integer id = SERIAL")
			.assertLine("    String name [MAXLENGTH=255]")
			.assertLine("")
			.assertLine("    ROW (1, 'FOO')")
			.assertLine("    ROW (2, 'BAR')")
			.assertLine("}");
	}

	@Test
	public void testWithAllSupportedTypes() {

		addLine("`id` INT NOT NULL AUTO_INCREMENT");
		addLine("`name` VARCHAR(255) NOT NULL");
		addLine("`long` BIGINT NOT NULL");
		addLine("`float` FLOAT NOT NULL");
		addLine("`double` DOUBLE NOT NULL");
		addLine("`decimal` DECIMAL(5,2) NOT NULL");
		addLine("`boolean` BOOL NOT NULL");
		addLine("PRIMARY KEY (`id`)");

		addTableRow(1, "FOO", 31L, 1.1f, 2.2d, new BigDecimal("3.14"), true);
		addTableRow(2, "BAR", 47L, 1.3f, 2.4d, new BigDecimal("7.32"), false);

		generateCode()//
			.assertLine("ENUM TABLE Foo 'db.foo' {")
			.assertLine("    PK Integer id = SERIAL")
			.assertLine("    String name [MAXLENGTH=255]")
			.assertLine("    Long long")
			.assertLine("    Float float")
			.assertLine("    Double double")
			.assertLine("    Decimal decimal [PRECISION=5,2]")
			.assertLine("    Boolean boolean")
			.assertLine("")
			.assertLine("    ROW (1, 'FOO', 31L, 1.1f, 2.2d, 3.14, TRUE)")
			.assertLine("    ROW (2, 'BAR', 47L, 1.3f, 2.4d, 7.32, FALSE)")
			.assertLine("}");
	}

	@Test
	public void testWithArbitraryRowOrder() {

		addLine("`id` INT NOT NULL AUTO_INCREMENT");
		addLine("`name` VARCHAR(255) NOT NULL");
		addLine("PRIMARY KEY (`id`)");

		addTableRow(2, "BAR");
		addTableRow(3, "BAZ");
		addTableRow(1, "FOO");

		generateCode()//
			.assertLine("ENUM TABLE Foo 'db.foo' {")
			.assertLine("    PK Integer id = SERIAL")
			.assertLine("    String name [MAXLENGTH=255]")
			.assertLine("")
			.assertLine("    ROW (1, 'FOO')")
			.assertLine("    ROW (2, 'BAR')")
			.assertLine("    ROW (3, 'BAZ')")
			.assertLine("}");
	}

	// ------------------------------ utilities ------------------------------ //

	private void addLine(String line) {

		createTableLines.add(line);
	}

	private void addTableRow(Integer integerValue, String stringValue) {

		addTableRow(//
			new DbEnumTableRowIntegerValue(integerValue),
			new DbEnumTableRowStringValue(stringValue));
	}

	private void addTableRow(Integer integerValue, String stringValue, Long longValue, Float floatValue, Double doubleValue, BigDecimal decimal,
			Boolean booleanValue) {

		addTableRow(//
			new DbEnumTableRowIntegerValue(integerValue),
			new DbEnumTableRowStringValue(stringValue),
			new DbEnumTableRowLongValue(longValue),
			new DbEnumTableRowFloatValue(floatValue),
			new DbEnumTableRowDoubleValue(doubleValue),
			new DbEnumTableRowBigDecimalValue(decimal),
			new DbEnumTableRowBooleanValue(booleanValue));
	}

	private void addTableRow(IDbEnumTableRowValue...values) {

		tableRows.add(Arrays.asList(values));
	}

	@Override
	protected IDbTableStructure getTableStructure() {

		// parse CREATE TABLE statement
		String createTableStatement = new StringBuilder()//
			.append("CREATE TABLE `db`.`foo` (")
			.append(Imploder.implode(createTableLines, ",\n"))
			.append(") COMMENT '@enum@';")
			.toString();
		DbTableStructure tableStructure = new DbMysqlCreateTableStatementParser(createTableStatement).parse();

		// mark as enum table
		tableStructure.setEnumTable(true);

		// add table rows
		for (List<IDbEnumTableRowValue> rowValues: tableRows) {
			int index = 0;
			DbEnumTableRowStructure tableRowStructure = new DbEnumTableRowStructure(tableStructure);
			for (IDbColumnStructure columnStructure: tableStructure.getColumns()) {
				tableRowStructure.setValue(columnStructure, rowValues.get(index));
				index++;
			}
			tableStructure.addEnumTableRow(tableRowStructure);
		}

		return tableStructure;
	}
}
