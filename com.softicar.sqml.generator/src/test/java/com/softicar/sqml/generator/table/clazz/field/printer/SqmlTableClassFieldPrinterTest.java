package com.softicar.sqml.generator.table.clazz.field.printer;

import org.junit.Test;

public class SqmlTableClassFieldPrinterTest extends AbstractSqmlTableClassFieldPrinterTest {

	@Test
	public void testFieldWithComment() {

		assertEquals(//
			"public static final IDbIntegerField<Foo> I = BUILDER.addIntegerField(\"i\", o->o.i, (o,v)->o.i=v).setTitle(TestI18n.I).setComment(\"abc\");",
			generateStaticFinal("`i` INT NOT NULL COMMENT 'abc'"));
	}

	@Test
	public void testFieldWithCommentContainingDoubleQuotes() {

		assertEquals(//
			"public static final IDbIntegerField<Foo> I = BUILDER.addIntegerField(\"i\", o->o.i, (o,v)->o.i=v).setTitle(TestI18n.I).setComment(\"abc\\\"x\\\"\");",
			generateStaticFinal("`i` INT NOT NULL COMMENT 'abc\"x\"'"));
	}

	@Test
	public void testFieldWithCommentContainingBackslash() {

		assertEquals(//
			"public static final IDbIntegerField<Foo> I = BUILDER.addIntegerField(\"i\", o->o.i, (o,v)->o.i=v).setTitle(TestI18n.I).setComment(\"foo\\\\bar\");",
			generateStaticFinal("`i` INT NOT NULL COMMENT 'foo\\\\bar'"));
	}

	@Test
	public void testFieldWithNullable() {

		assertEquals(//
			"public static final IDbIntegerField<Foo> I = BUILDER.addIntegerField(\"i\", o->o.i, (o,v)->o.i=v).setTitle(TestI18n.I).setNullable();",
			generateStaticFinal("`i` INT"));
	}

	@Test
	public void testFieldWithDefaultNull() {

		assertEquals(//
			"public static final IDbIntegerField<Foo> I = BUILDER.addIntegerField(\"i\", o->o.i, (o,v)->o.i=v).setTitle(TestI18n.I).setNullable().setDefault(null);",
			generateStaticFinal("`i` INT DEFAULT NULL"));
	}

	// ------------------------------ byte array field ------------------------------ //

	@Test
	public void testByteArrayFieldWithMaximumLength() {

		assertEquals(//
			"public static final IDbStringField<Foo> F = BUILDER.addStringField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F).setNullable().setMaximumLength(9);",
			generateStaticFinal("`f` varchar(9)"));
	}

	@Test
	public void testByteArrayFieldWithVariousLengthBits() {

		assertEquals(//
			"public static final IDbStringField<Foo> F = BUILDER.addStringField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F).setNullable().setLengthBits(8);",
			generateStaticFinal("`f` tinytext"));
		assertEquals(//
			"public static final IDbStringField<Foo> F = BUILDER.addStringField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F).setNullable().setLengthBits(16);",
			generateStaticFinal("`f` text"));
		assertEquals(//
			"public static final IDbStringField<Foo> F = BUILDER.addStringField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F).setNullable().setLengthBits(24);",
			generateStaticFinal("`f` mediumtext"));
		assertEquals(//
			"public static final IDbStringField<Foo> F = BUILDER.addStringField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F).setNullable().setLengthBits(32);",
			generateStaticFinal("`f` longtext"));
	}

	// ------------------------------ day field ------------------------------ //

	@Test
	public void testDayFieldWithTodayAsDefault() {

		assertEquals(//
			"public static final IDbDayField<Foo> F = BUILDER.addDayField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F).setNullable().setDefaultToday();",
			generateStaticFinal("`f` date DEFAULT CURRENT_TIMESTAMP"));
	}

	// ------------------------------ day time field ------------------------------ //

	@Test
	public void testDayTimeFieldWithNowAsDefault() {

		assertEquals(//
			"public static final IDbDayTimeField<Foo> F = BUILDER.addDayTimeField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F).setNullable().setDefaultNow();",
			generateStaticFinal("`f` datetime DEFAULT CURRENT_TIMESTAMP"));
		assertEquals(//
			"public static final IDbDayTimeField<Foo> F = BUILDER.addDayTimeField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F).setNullable().setDefaultNow().setTimestamp();",
			generateStaticFinal("`f` timestamp DEFAULT CURRENT_TIMESTAMP"));
	}

	@Test
	public void testDayTimeFieldWithOnUpdateNow() {

		assertEquals(//
			"public static final IDbDayTimeField<Foo> F = BUILDER.addDayTimeField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F).setNullable().setOnUpdateNow();",
			generateStaticFinal("`f` datetime ON UPDATE CURRENT_TIMESTAMP"));
	}

	@Test
	public void testDayTimeFieldWithTimestamp() {

		assertEquals(//
			"public static final IDbDayTimeField<Foo> F = BUILDER.addDayTimeField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F).setNullable().setTimestamp();",
			generateStaticFinal("`f` TIMESTAMP"));
		assertEquals(//
			"public static final IDbDayTimeField<Foo> F = BUILDER.addDayTimeField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F).setNullable().setOnUpdateNow().setTimestamp();",
			generateStaticFinal("`f` TIMESTAMP ON UPDATE CURRENT_TIMESTAMP"));
	}

	// ------------------------------ enum field ------------------------------ //

	@Test
	public void testEnumFieldWithCollation() {

		assertEquals(//
			"public static final IDbEnumField<Foo, F> F = BUILDER.addEnumField(\"f\", o->o.f, (o,v)->o.f=v, F.class).setTitle(TestI18n.F).setCollation(\"utf8\");",
			generateStaticFinal("`f` enum('A','B') NOT NULL collate utf8"));
	}

	// ------------------------------ integer field ------------------------------ //

	@Test
	public void testIntegerFieldWithVariousBits() {

		assertEquals(//
			"public static final IDbIntegerField<Foo> F = BUILDER.addIntegerField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F).setNullable().setBits(8);",
			generateStaticFinal("`f` tinyint"));
		assertEquals(//
			"public static final IDbIntegerField<Foo> F = BUILDER.addIntegerField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F).setNullable().setBits(16);",
			generateStaticFinal("`f` smallint"));
		assertEquals(//
			"public static final IDbIntegerField<Foo> F = BUILDER.addIntegerField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F).setNullable().setBits(24);",
			generateStaticFinal("`f` mediumint"));
		assertEquals(//
			"public static final IDbIntegerField<Foo> F = BUILDER.addIntegerField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F).setNullable();",
			generateStaticFinal("`f` int"));
	}

	@Test
	public void testIntegerFieldWithUnsignedAttribute() {

		assertEquals(//
			"public static final IDbIntegerField<Foo> F = BUILDER.addIntegerField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F).setNullable().setUnsigned();",
			generateStaticFinal("`f` int unsigned"));
	}

	// ------------------------------ long field ------------------------------ //

	@Test
	public void testLongFieldWithUnsignedAttribute() {

		assertEquals(//
			"public static final IDbLongField<Foo> F = BUILDER.addLongField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F).setNullable().setUnsigned();",
			generateStaticFinal("`f` bigint unsigned"));
	}

	// ------------------------------ string field ------------------------------ //

	@Test
	public void testStringFieldWithMaximumLength() {

		assertEquals(//
			"public static final IDbStringField<Foo> F = BUILDER.addStringField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F).setNullable().setMaximumLength(9);",
			generateStaticFinal("`f` varchar(9)"));
	}

	@Test
	public void testStringFieldWithCollation() {

		assertEquals(//
			"public static final IDbStringField<Foo> F = BUILDER.addStringField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F).setNullable().setCollation(\"utf8\");",
			generateStaticFinal("`f` varchar collate utf8"));
	}

	@Test
	public void testStringFieldWithVariousLengthBits() {

		assertEquals(//
			"public static final IDbStringField<Foo> F = BUILDER.addStringField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F).setNullable().setLengthBits(8);",
			generateStaticFinal("`f` tinytext"));
		assertEquals(//
			"public static final IDbStringField<Foo> F = BUILDER.addStringField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F).setNullable().setLengthBits(16);",
			generateStaticFinal("`f` text"));
		assertEquals(//
			"public static final IDbStringField<Foo> F = BUILDER.addStringField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F).setNullable().setLengthBits(24);",
			generateStaticFinal("`f` mediumtext"));
		assertEquals(//
			"public static final IDbStringField<Foo> F = BUILDER.addStringField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F).setNullable().setLengthBits(32);",
			generateStaticFinal("`f` longtext"));
	}

	// ------------------------------ not-null and no-default ------------------------------ //

	@Test
	public void testBigDecimalFieldWithNotNullAndNoDefault() {

		assertEquals(//
			"public static final IDbBigDecimalField<Foo> F = BUILDER.addBigDecimalField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F).setSize(7, 3);",
			generateStaticFinal("`f` decimal(7,3) NOT NULL"));
	}

	@Test
	public void testBooleanFieldWithNotNullAndNoDefault() {

		assertEquals(//
			"public static final IDbBooleanField<Foo> F = BUILDER.addBooleanField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F);",
			generateStaticFinal("`f` bool NOT NULL"));
	}

	@Test
	public void testByteArrayFieldWithNotNullAndNoDefault() {

		assertEquals(//
			"public static final IDbByteArrayField<Foo> F = BUILDER.addByteArrayField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F).setMaximumLength(8);",
			generateStaticFinal("`f` varbinary(8) NOT NULL"));
	}

	@Test
	public void testDayFieldWithNotNullAndNoDefault() {

		assertEquals(//
			"public static final IDbDayField<Foo> F = BUILDER.addDayField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F);",
			generateStaticFinal("`f` date NOT NULL"));
	}

	@Test
	public void testDayTimeFieldWithNotNullAndNoDefault() {

		assertEquals(//
			"public static final IDbDayTimeField<Foo> F = BUILDER.addDayTimeField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F);",
			generateStaticFinal("`f` datetime NOT NULL"));
	}

	@Test
	public void testDoubleFieldWithNotNullAndNoDefault() {

		assertEquals(//
			"public static final IDbDoubleField<Foo> F = BUILDER.addDoubleField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F);",
			generateStaticFinal("`f` double NOT NULL"));
	}

	@Test
	public void testEnumFieldWithNotNullAndNoDefault() {

		assertEquals(//
			"public static final IDbEnumField<Foo, F> F = BUILDER.addEnumField(\"f\", o->o.f, (o,v)->o.f=v, F.class).setTitle(TestI18n.F);",
			generateStaticFinal("`f` enum('a','b') NOT NULL"));
	}

	@Test
	public void testFloatFieldWithNotNullAndNoDefault() {

		assertEquals(//
			"public static final IDbFloatField<Foo> F = BUILDER.addFloatField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F);",
			generateStaticFinal("`f` float NOT NULL"));
	}

	@Test
	public void testIntegerFieldWithNotNullAndNoDefault() {

		assertEquals(//
			"public static final IDbIntegerField<Foo> F = BUILDER.addIntegerField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F);",
			generateStaticFinal("`f` int NOT NULL"));
	}

	@Test
	public void testLongFieldWithNotNullAndNoDefault() {

		assertEquals(//
			"public static final IDbLongField<Foo> F = BUILDER.addLongField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F);",
			generateStaticFinal("`f` bigint NOT NULL"));
	}

	@Test
	public void testStringFieldWithNotNullAndNoDefault() {

		assertEquals(//
			"public static final IDbStringField<Foo> F = BUILDER.addStringField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F).setMaximumLength(8);",
			generateStaticFinal("`f` varchar(8) NOT NULL"));
	}

	@Test
	public void testTimeFieldWithNotNullAndNoDefault() {

		assertEquals(//
			"public static final IDbTimeField<Foo> F = BUILDER.addTimeField(\"f\", o->o.f, (o,v)->o.f=v).setTitle(TestI18n.F);",
			generateStaticFinal("`f` time NOT NULL"));
	}
}
