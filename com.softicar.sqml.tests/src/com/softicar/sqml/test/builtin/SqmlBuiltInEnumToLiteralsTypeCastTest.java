package com.softicar.sqml.test.builtin;

import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Before;
import org.junit.Test;

public class SqmlBuiltInEnumToLiteralsTypeCastTest extends AbstractSqmlTest {

	@Before
	public void before() {

		parser.loadLanguagePackage();
	}

	@Test
	public void enumToString() {

		createTableTest("T", "db.t")//
			.add("PK Integer id = SERIAL")
			.add("State state")
			.add()
			.add("ENUM State ON String {")
			.add("    OPEN = 'OPEN'")
			.add("    CLOSED = 'CLOSED'")
			.add("}")
			.assertNoIssues();

		createQueryTest()//
			.add("SELECT toString(t.state) = 'OPEN' AS test")
			.add("FROM T t")
			.assertGeneratedSelect("SELECT CAST(t.state AS CHAR) = 'OPEN' AS test FROM db.t AS t");
	}

	@Test
	public void enumToInteger() {

		createTableTest("T", "db.t")//
			.add("PK Integer id = SERIAL")
			.add("State state")
			.add()
			.add("ENUM State ON Integer {")
			.add("    OPEN = 1")
			.add("    CLOSED = 2")
			.add("}")
			.assertNoIssues();

		createQueryTest()//
			.add("SELECT toInteger(t.state) = 2 AS test")
			.add("FROM T t")
			.assertGeneratedSelect("SELECT CAST(t.state AS SIGNED) = 2 AS test FROM db.t AS t");
	}
}
