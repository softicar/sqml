package com.softicar.sqml.generator.table.clazz.field.printer;

import org.junit.Test;

public class SqmlTableClassFieldDefaultValueCodePrinterTest extends AbstractSqmlTableClassFieldPrinterTest {

	@Test
	public void testBigDecimal() {

		assertEndsWith("o.foo=v).setTitle(TestI18n.FOO).setNullable().setSize(8, 2);", generateStaticFinal("`foo` decimal(8,2)"));
		assertEndsWith("o.foo=v).setTitle(TestI18n.FOO).setSize(8, 2);", generateStaticFinal("`foo` decimal(8,2) NOT NULL"));
		assertEndsWith(//
			"o.foo=v).setTitle(TestI18n.FOO).setNullable().setDefault(new BigDecimal(\"1.23\")).setSize(8, 2);",
			generateStaticFinal("`foo` decimal(8,2) DEFAULT '1.23'"));
	}

	@Test
	public void testByteArray() {

		assertEndsWith("o.foo=v).setTitle(TestI18n.FOO).setNullable().setLengthBits(16);", generateStaticFinal("`foo` blob"));
		assertEndsWith("o.foo=v).setTitle(TestI18n.FOO).setLengthBits(16);", generateStaticFinal("`foo` blob NOT NULL"));
	}

	@Test
	public void testBoolean() {

		assertEndsWith("o.foo=v).setTitle(TestI18n.FOO).setNullable();", generateStaticFinal("`foo` tinyint(1)"));
		assertEndsWith("o.foo=v).setTitle(TestI18n.FOO);", generateStaticFinal("`foo` tinyint(1) NOT NULL"));
		assertEndsWith("o.foo=v).setTitle(TestI18n.FOO).setNullable().setDefault(false);", generateStaticFinal("`foo` tinyint(1) DEFAULT '0'"));
		assertEndsWith("o.foo=v).setTitle(TestI18n.FOO).setNullable().setDefault(true);", generateStaticFinal("`foo` tinyint(1) DEFAULT '1'"));
	}

	@Test
	public void testDay() {

		assertEndsWith("o.foo=v).setTitle(TestI18n.FOO).setNullable();", generateStaticFinal("`foo` DATE"));
		assertEndsWith("o.foo=v).setTitle(TestI18n.FOO);", generateStaticFinal("`foo` DATE NOT NULL"));
		assertEndsWith("o.foo=v).setTitle(TestI18n.FOO).setNullable().setDefault(Day.get(735882));", generateStaticFinal("`foo` DATE DEFAULT '2014-10-11'"));
	}

	@Test
	public void testDayTime() {

		assertEndsWith("o.foo=v).setTitle(TestI18n.FOO).setNullable();", generateStaticFinal("`foo` DATETIME"));
		assertEndsWith("o.foo=v).setTitle(TestI18n.FOO);", generateStaticFinal("`foo` DATETIME NOT NULL"));
		assertEndsWith(//
			"o.foo=v).setTitle(TestI18n.FOO).setNullable().setDefault(new DayTime(Day.get(735882), 11, 22, 33));",
			generateStaticFinal("`foo` DATETIME DEFAULT '2014-10-11 11:22:33'"));
	}

	@Test
	public void testDouble() {

		assertEndsWith("o.foo=v).setTitle(TestI18n.FOO).setNullable();", generateStaticFinal("`foo` DOUBLE"));
		assertEndsWith("o.foo=v).setTitle(TestI18n.FOO);", generateStaticFinal("`foo` DOUBLE NOT NULL"));
		assertEndsWith(
			"o.foo=v).setTitle(TestI18n.FOO).setNullable().setDefault(Double.valueOf(\"1.23\"));",
			generateStaticFinal("`foo` DOUBLE DEFAULT '1.23'"));
	}

	@Test
	public void testEnum() {

		assertEndsWith("Foo.class).setTitle(TestI18n.FOO).setNullable();", generateStaticFinal("`foo` enum('A','B','C')"));
		assertEndsWith("Foo.class).setTitle(TestI18n.FOO);", generateStaticFinal("`foo` enum('A','B','C') NOT NULL"));
		assertEndsWith("Foo.class).setTitle(TestI18n.FOO).setNullable().setDefault(Foo.B);", generateStaticFinal("`foo` enum('A','B','C') DEFAULT 'B'"));
	}

	@Test
	public void testFloat() {

		assertEndsWith("o.foo=v).setTitle(TestI18n.FOO).setNullable();", generateStaticFinal("`foo` FLOAT"));
		assertEndsWith("o.foo=v).setTitle(TestI18n.FOO);", generateStaticFinal("`foo` FLOAT NOT NULL"));
		assertEndsWith("o.foo=v).setTitle(TestI18n.FOO).setNullable().setDefault(Float.valueOf(\"1.23\"));", generateStaticFinal("`foo` FLOAT DEFAULT '1.23'"));
	}

	@Test
	public void testForeign() {

		String constraint = ", CONSTRAINT `foo` FOREIGN KEY (`foo`) REFERENCES `foo` (`id`)";
		assertEndsWith("Foo.ID).setTitle(TestI18n.FOO).setNullable();", generateStaticFinal("`foo` INT" + constraint));
		assertEndsWith("Foo.ID).setTitle(TestI18n.FOO);", generateStaticFinal("`foo` INT NOT NULL" + constraint));
		assertEndsWith("Foo.ID).setTitle(TestI18n.FOO).setNullable().setDefault(3);", generateStaticFinal("`foo` INT DEFAULT '3'" + constraint));
	}

	@Test
	public void testInteger() {

		assertEndsWith("o.foo=v).setTitle(TestI18n.FOO).setNullable();", generateStaticFinal("`foo` INT"));
		assertEndsWith("o.foo=v).setTitle(TestI18n.FOO);", generateStaticFinal("`foo` INT NOT NULL"));
		assertEndsWith("o.foo=v).setTitle(TestI18n.FOO).setNullable().setDefault(43);", generateStaticFinal("`foo` INT DEFAULT '43'"));
	}

	@Test
	public void testLong() {

		assertEndsWith("o.foo=v).setTitle(TestI18n.FOO).setNullable();", generateStaticFinal("`foo` BIGINT"));
		assertEndsWith("o.foo=v).setTitle(TestI18n.FOO);", generateStaticFinal("`foo` BIGINT NOT NULL"));
		assertEndsWith("o.foo=v).setTitle(TestI18n.FOO).setNullable().setDefault(43L);", generateStaticFinal("`foo` BIGINT DEFAULT '43'"));
	}

	@Test
	public void testString() {

		assertEndsWith("o.foo=v).setTitle(TestI18n.FOO).setNullable().setMaximumLength(255);", generateStaticFinal("`foo` varchar(255)"));
		assertEndsWith("o.foo=v).setTitle(TestI18n.FOO).setMaximumLength(255);", generateStaticFinal("`foo` varchar(255) NOT NULL"));
		assertEndsWith(//
			"o.foo=v).setTitle(TestI18n.FOO).setDefault(\"bar \").setMaximumLength(255);",
			generateStaticFinal("`foo` varchar(255) NOT NULL DEFAULT 'bar '"));
	}

	@Test
	public void testTime() {

		assertEndsWith("o.foo=v).setTitle(TestI18n.FOO).setNullable();", generateStaticFinal("`foo` TIME"));
		assertEndsWith("o.foo=v).setTitle(TestI18n.FOO);", generateStaticFinal("`foo` TIME NOT NULL"));
		assertEndsWith("o.foo=v).setTitle(TestI18n.FOO).setNullable().setDefault(new Time(11, 22, 33));", generateStaticFinal("`foo` TIME DEFAULT '11:22:33'"));
	}
}
