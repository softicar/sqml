package com.softicar.sqml.test.builtin;

import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Before;
import org.junit.Test;

public class SqmlCastsTest extends AbstractSqmlTest {

	@Before
	public void before() {

		parser.loadLanguagePackage();
	}

	@Test
	public void toDay() {

		createExpressionTest("toDay('2013-09-13')").assertGeneratedSql("CAST('2013-09-13' AS DATE)");
		createExpressionTest("toDay(now())").assertGeneratedSql("CAST(NOW() AS DATE)");
	}

	@Test
	public void toDayTime() {

		createExpressionTest("toDayTime(today())").assertGeneratedSql("CAST(CURDATE() AS DATETIME)");
		createExpressionTest("toDayTime('2013-09-13 11:22:33')").assertGeneratedSql("CAST('2013-09-13 11:22:33' AS DATETIME)");
	}

	@Test
	public void toDecimal() {

		createExpressionTest("toDecimal(55, 2, 1)").assertGeneratedSql("CAST(55 AS DECIMAL(2, 1))");
		createExpressionTest("toDecimal(66L, 3, 2)").assertGeneratedSql("CAST(66 AS DECIMAL(3, 2))");
		createExpressionTest("toDecimal('77.64', 4, 2)").assertGeneratedSql("CAST('77.64' AS DECIMAL(4, 2))");
	}
}
