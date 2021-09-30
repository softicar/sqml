package com.softicar.sqml.test.conditions;

import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Before;
import org.junit.Test;

public class SqmlBooleanComparisonTest extends AbstractSqmlTest {

	@Before
	public void before() {

		parser.loadLanguagePackage();

		createTableTest("T", "db.t")//
			.add("PK Integer id = SERIAL")
			.add("Boolean flagA")
			.add("Boolean flagB")
			.assertNoIssues();
	}

	// -------------------- primitive types -------------------- //

	@Test
	public void testBooleanEquals() {

		createQueryTest()
			.add("SELECT TRUE = FALSE AS a")
			.add("SELECT t.flagA = t.flagB AS b")
			.add("SELECT t.flagA = FALSE AS c")
			.add("FROM T t")
			.assertNoIssues()
			.assertGeneratedSelect("SELECT TRUE = FALSE AS a, t.flagA = t.flagB AS b, t.flagA = FALSE AS c FROM db.t AS t");
	}

	@Test
	public void testBooleanNotEquals() {

		createQueryTest()
			.add("SELECT TRUE != FALSE AS a")
			.add("SELECT t.flagA != t.flagB AS b")
			.add("SELECT t.flagA != FALSE AS c")
			.add("FROM T t")
			.assertNoIssues()
			.assertGeneratedSelect("SELECT TRUE != FALSE AS a, t.flagA != t.flagB AS b, t.flagA != FALSE AS c FROM db.t AS t");
	}
}
