package com.softicar.sqml.test.generator.sqml;

import com.softicar.platform.common.string.Imploder;
import com.softicar.platform.db.structure.mysql.parser.DbMysqlCreateTableStatementParser;
import com.softicar.platform.db.structure.table.IDbTableStructure;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class SqmlTableFileGeneratorTest extends AbstractSqmlTableFileGeneratorTest {

	private final List<String> createTableLines;

	public SqmlTableFileGeneratorTest() {

		this.createTableLines = new ArrayList<>();
	}

	@Test
	public void testBitsAttribute() {

		addLine("`a` INT");
		addLine("`b` TINYINT");
		addLine("`c` SMALLINT");
		addLine("`d` MEDIUMINT");
		addLine("`e` BIGINT");

		generateCode()//
			.assertLine("Integer a [NULLABLE]")
			.assertLine("Integer b [NULLABLE BITS=8]")
			.assertLine("Integer c [NULLABLE BITS=16]")
			.assertLine("Integer d [NULLABLE BITS=24]")
			.assertLine("Long e [NULLABLE]");
	}

	@Test
	public void testCharacterSet() {

		addLine("`a1` VARCHAR(100)");
		addLine("`a2` VARCHAR(100) CHARACTER SET foo");
		addLine("`b1` ENUM('A','B')");
		addLine("`b2` ENUM('A','B') CHARACTER SET bar");

		generateCode()//
			.assertLine("String a1 [NULLABLE MAXLENGTH=100]")
			.assertLine("String a2 [NULLABLE MAXLENGTH=100 CHARACTER SET='foo']")
			.assertLine("B1 b1 [NULLABLE]")
			.assertLine("B2 b2 [NULLABLE CHARACTER SET='bar']");
	}

	@Test
	public void testNonSerialPrimaryKey() {

		addLine("`a` INT NOT NULL");
		addLine("`b` BIGINT");
		addLine("`c` VARCHAR(100) NOT NULL");
		addLine("PRIMARY KEY (`a`, `c`)");

		generateCode()//
			.assertLine("PK Integer a")
			.assertLine("Long b [NULLABLE]")
			.assertLine("PK String c [MAXLENGTH=100]");
	}

	@Test
	public void testDecimalDefaultValue() {

		addLine("`a` DECIMAL(10,2) NOT NULL DEFAULT '3.14'");

		generateCode().assertLine("Decimal a = 3.14 [PRECISION=10,2]");
	}

	@Test
	public void testEnums() {

		addLine("`id` INT NOT NULL AUTO_INCREMENT");
		addLine("`state` ENUM('OPEN','lower','WITH SPACES','33')");

		generateCode()//
			.assertLine("ENUM State {")
			.assertLine("    OPEN")
			.assertLine("    LOWER = 'lower'")
			.assertLine("    WITH_SPACES = 'WITH SPACES'")
			.assertLine("    _33 = '33'")
			.assertLine("}");
	}

	@Test
	public void testMaxLengthAttributeWithString() {

		addLine("`a` TEXT NOT NULL");
		addLine("`b` VARCHAR(63) NOT NULL");

		generateCode()//
			.assertLine("String a [LENGTHBITS=16]")
			.assertLine("String b [MAXLENGTH=63]");
	}

	@Test
	public void testMaxLengthAttributeWithBlob() {

		addLine("`a` VARBINARY NOT NULL");
		addLine("`b` VARBINARY(42) NOT NULL");

		generateCode()//
			.assertLine("Blob a")
			.assertLine("Blob b [MAXLENGTH=42]");
	}

	@Test
	public void testLengthBitsAttributeWithString() {

		addLine("`a` TINYTEXT NOT NULL");
		addLine("`b` TEXT NOT NULL");
		addLine("`c` MEDIUMTEXT NOT NULL");
		addLine("`d` LONGTEXT NOT NULL");

		generateCode()//
			.assertLine("String a [LENGTHBITS=8]")
			.assertLine("String b [LENGTHBITS=16]")
			.assertLine("String c [LENGTHBITS=24]")
			.assertLine("String d [LENGTHBITS=32]");
	}

	@Test
	public void testLengthBitsAttributeWithBlob() {

		addLine("`a` TINYBLOB NOT NULL");
		addLine("`b` BLOB NOT NULL");
		addLine("`c` MEDIUMBLOB NOT NULL");
		addLine("`d` LONGBLOB NOT NULL");

		generateCode()//
			.assertLine("Blob a [LENGTHBITS=8]")
			.assertLine("Blob b [LENGTHBITS=16]")
			.assertLine("Blob c [LENGTHBITS=24]")
			.assertLine("Blob d [LENGTHBITS=32]");
	}

	@Test
	public void testNullableAttribute() {

		addLine("`id` INT NOT NULL AUTO_INCREMENT");
		addLine("`a` VARCHAR NOT NULL");
		addLine("`b` VARCHAR");
		addLine("PRIMARY KEY (`id`)");

		generateCode()//
			.assertLine("PK Integer id = SERIAL")
			.assertLine("String a")
			.assertLine("String b [NULLABLE]");
	}

	@Test
	public void testNameOverride() {

		addLine("`a` INT NOT NULL");
		addLine("`b` INT NOT NULL COMMENT '@name=c@'");

		generateCode()//
			.assertLine("Integer a")
			.assertLine("Integer c ['b' COMMENT='@name=c@']");
	}

	@Test
	public void testOnUpdateNowAndTimestamp() {

		addLine("`a1` DATETIME");
		addLine("`a2` DATETIME ON UPDATE CURRENT_TIMESTAMP");
		addLine("`b1` TIMESTAMP");
		addLine("`b2` TIMESTAMP ON UPDATE CURRENT_TIMESTAMP");
		addLine("`int` INT ON UPDATE CURRENT_TIMESTAMP");
		addLine("`date` DATE ON UPDATE CURRENT_TIMESTAMP");

		generateCode()//
			.assertLine("DayTime a1 [NULLABLE]")
			.assertLine("DayTime a2 [NULLABLE ON UPDATE NOW]")
			.assertLine("DayTime b1 [NULLABLE TIMESTAMP]")
			.assertLine("DayTime b2 [NULLABLE ON UPDATE NOW TIMESTAMP]")
			.assertLine("Integer int [NULLABLE]")
			.assertLine("Day date [NULLABLE]");
	}

	@Test
	public void testPrecisionAttribute() {

		addLine("`a` DECIMAL(8) NOT NULL");
		addLine("`b` DECIMAL(9,3) NOT NULL");

		generateCode()//
			.assertLine("Decimal a [PRECISION=8,0]")
			.assertLine("Decimal b [PRECISION=9,3]");
	}

	@Test
	public void testTrivial() {

		addLine("`id` INT NOT NULL AUTO_INCREMENT");

		generateCode()//
			.assertLine("PACKAGE com.example")
			.assertLine("")
			.assertLine("TABLE Foo 'db.foo' {")
			.assertLine("    Integer id = SERIAL")
			.assertLine("}");
	}

	// ------------------------------ utilities ------------------------------ //

	private void addLine(String line) {

		createTableLines.add(line);
	}

	@Override
	protected IDbTableStructure getTableStructure() {

		String createTableStatement = new StringBuilder()//
			.append("CREATE TABLE `db`.`foo` (")
			.append(Imploder.implode(createTableLines, ",\n"))
			.append(");")
			.toString();
		return new DbMysqlCreateTableStatementParser(createTableStatement).parse();
	}
}
