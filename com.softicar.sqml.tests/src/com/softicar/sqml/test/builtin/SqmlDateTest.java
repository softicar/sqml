package com.softicar.sqml.test.builtin;

import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Before;
import org.junit.Test;

public class SqmlDateTest extends AbstractSqmlTest {

	@Before
	public void before() {

		parser.loadLanguagePackage();

		createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("Day day")
			.add("DayTime dayTime")
			.assertNoIssues();
	}

	@Test
	public void dateFormat() {

		createQueryTest()//
			.add("SELECT")
			.add("dateFormat(f.day, '%Y') AS x,")
			.add("dateFormat(f.dayTime, '%Y') AS y")
			.add("FROM Foo f")
			.assertGeneratedSelect("SELECT DATE_FORMAT(f.`day`, '%Y') AS x, DATE_FORMAT(f.dayTime, '%Y') AS y FROM db.foo AS f");
	}

	@Test
	public void dayOfMonth() {

		createQueryTest()//
			.add("SELECT dayOfMonth(f.day) AS x, dayOfMonth(f.dayTime) AS y")
			.add("FROM Foo f")
			.assertGeneratedSelect("SELECT DAYOFMONTH(f.`day`) AS x, DAYOFMONTH(f.dayTime) AS y FROM db.foo AS f");
	}

	@Test
	public void dayOfYear() {

		createQueryTest()//
			.add("SELECT dayOfYear(f.day) AS x, dayOfYear(f.dayTime) AS y")
			.add("FROM Foo f")
			.assertGeneratedSelect("SELECT DAYOFYEAR(f.`day`) AS x, DAYOFYEAR(f.dayTime) AS y FROM db.foo AS f");
	}

	@Test
	public void month() {

		createQueryTest()//
			.add("SELECT month(f.day) AS x, month(f.dayTime) AS y")
			.add("FROM Foo f")
			.assertGeneratedSelect("SELECT MONTH(f.`day`) AS x, MONTH(f.dayTime) AS y FROM db.foo AS f");
	}

	@Test
	public void now() {

		createQueryTest()//
			.add("SELECT now() AS x")
			.assertGeneratedSelect("SELECT NOW() AS x");
	}

	@Test
	public void today() {

		createQueryTest()//
			.add("SELECT today() AS x")
			.assertGeneratedSelect("SELECT CURDATE() AS x");
	}

	@Test
	public void year() {

		createQueryTest()//
			.add("SELECT year(f.day) AS x, year(f.dayTime) AS y")
			.add("FROM Foo f")
			.assertGeneratedSelect("SELECT YEAR(f.`day`) AS x, YEAR(f.dayTime) AS y FROM db.foo AS f");
	}
}
