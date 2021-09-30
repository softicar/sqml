package com.softicar.sqml.test.builtin;

import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Before;
import org.junit.Test;

public class SqmlStringTest extends AbstractSqmlTest {

	@Before
	public void before() {

		parser.loadLanguagePackage();
	}

	@Test
	public void charLength() {

		createExpressionTest("charLength('Foo')").assertGeneratedSql("CHAR_LENGTH('Foo')");
	}

	@Test
	public void length() {

		createExpressionTest("length('Foo')").assertGeneratedSql("LENGTH('Foo')");
	}

	@Test
	public void octetLength() {

		createExpressionTest("octetLength('Foo')").assertGeneratedSql("OCTET_LENGTH('Foo')");
	}

	@Test
	public void lower() {

		createExpressionTest("lower('Foo')").assertGeneratedSql("LOWER('Foo')");
	}

	@Test
	public void lpad() {

		createExpressionTest("lpad('Foo', 9, 'l')").assertGeneratedSql("LPAD('Foo', 9, 'l')");
	}

	@Test
	public void ltrim() {

		createExpressionTest("ltrim(' foo ')").assertGeneratedSql("LTRIM(' foo ')");
	}

	@Test
	public void trim() {

		createExpressionTest("trim(' foo ')").assertGeneratedSql("TRIM(' foo ')");
	}

	@Test
	public void rpad() {

		createExpressionTest("rpad('Foo', 9, 'r')").assertGeneratedSql("RPAD('Foo', 9, 'r')");
	}

	@Test
	public void rtrim() {

		createExpressionTest("rtrim(' foo ')").assertGeneratedSql("RTRIM(' foo ')");
	}

	@Test
	public void substr() {

		createExpressionTest("substr('foo', 2)").assertGeneratedSql("SUBSTR('foo', 2)");
		createExpressionTest("substr('foo', 1, 3)").assertGeneratedSql("SUBSTR('foo', 1, 3)");
	}

	@Test
	public void upper() {

		createExpressionTest("upper('Foo')").assertGeneratedSql("UPPER('Foo')");
	}
}
