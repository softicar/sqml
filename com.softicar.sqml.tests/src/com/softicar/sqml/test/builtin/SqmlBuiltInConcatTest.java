package com.softicar.sqml.test.builtin;

import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlBuiltInConcatTest extends AbstractSqmlTest {

	@Test
	public void testConcatWithStringsAndNumbers() {

		createExpressionTest("concat(1, 2L, 3f, 4d, 5.0, '6')")//
			.assertNoErrors()
			.assertGeneratedSql("concat(1, 2, 3, 4, 5.0, '6')");
	}

	@Test
	public void testConcatEnums() {

		createTableTest("T", "db.t")//
			.add("PK Integer id = SERIAL")
			.add("State state")
			.add("Prio prio")
			.add()
			.add("ENUM State ON String {")
			.add("    ONE = 'one'")
			.add("}")
			.add()
			.add("ENUM Prio ON Integer {")
			.add("    ONE = 1")
			.add("}")
			.assertNoIssues();
		createQueryTest()//
			.add("SELECT concat(t.state, ' ', t.prio) AS x FROM T t")
			.assertGeneratedSelect("SELECT concat(t.state, ' ', t.prio) AS x FROM db.t AS t");
	}
}
