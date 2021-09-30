package com.softicar.sqml.test.builtin;

import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Before;
import org.junit.Test;

public class SqmlAggregationTest extends AbstractSqmlTest {

	@Before
	public void before() {

		parser.loadLanguagePackage();

		createTableTest("T", "db.t")
			.add("PK Integer id = SERIAL")
			.add("Integer quantity")
			.add("Decimal price [PRECISION=4,1]")
			.add("String name")
			.add("Day shipDay")
			.add("DayTime createdAt")
			.assertNoIssues();
	}

	@Test
	public void avg() {

		createQueryTest()//
			.add("SELECT avg(t.quantity) AS q")
			.add("SELECT avg(t.price) AS p")
			.add("FROM T t")
			.assertGeneratedSelect("SELECT AVG(t.quantity) AS q, AVG(t.price) AS p FROM db.t AS t");
	}

	@Test
	public void countAll() {

		createQueryTest()//
			.add("SELECT countAll() AS q")
			.add("FROM T t")
			.assertGeneratedSelect("SELECT COUNT(*) AS q FROM db.t AS t");
	}

	@Test
	public void count() {

		createQueryTest()
			.add("SELECT count(t.quantity) AS q")
			.add("SELECT count(t.name) AS n")
			.add("SELECT count(t.shipDay) AS d")
			.add("SELECT count(t.createdAt) AS t")
			.add("FROM T t")
			.assertGeneratedSelect("SELECT COUNT(t.quantity) AS q, COUNT(t.name) AS n, COUNT(t.shipDay) AS d, COUNT(t.createdAt) AS t FROM db.t AS t");
	}

	@Test
	public void max() {

		createQueryTest()
			.add("SELECT max(t.quantity) AS q")
			.add("SELECT max(t.price) AS p")
			.add("SELECT max(t.name) AS n")
			.add("SELECT max(t.shipDay) AS d")
			.add("SELECT max(t.createdAt) AS t")
			.add("FROM T t")
			.assertGeneratedSelect(
				"SELECT MAX(t.quantity) AS q, MAX(t.price) AS p, MAX(t.name) AS n, MAX(t.shipDay) AS d, MAX(t.createdAt) AS t FROM db.t AS t");
	}

	@Test
	public void min() {

		createQueryTest()
			.add("SELECT min(t.quantity) AS q")
			.add("SELECT min(t.price) AS p")
			.add("SELECT min(t.name) AS n")
			.add("SELECT min(t.shipDay) AS d")
			.add("SELECT min(t.createdAt) AS t")
			.add("FROM T t")
			.assertGeneratedSelect(
				"SELECT MIN(t.quantity) AS q, MIN(t.price) AS p, MIN(t.name) AS n, MIN(t.shipDay) AS d, MIN(t.createdAt) AS t FROM db.t AS t");
	}

	@Test
	public void sum() {

		createQueryTest()//
			.add("SELECT sum(t.quantity) AS q")
			.add("SELECT sum(t.price) AS p")
			.add("FROM T t")
			.assertGeneratedSelect("SELECT SUM(t.quantity) AS q, SUM(t.price) AS p FROM db.t AS t");
	}
}
