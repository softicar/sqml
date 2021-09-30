package com.softicar.sqml.test.expressions;

import com.softicar.sqml.model.expressions.validation.SqmlIssueParameterReferenceNeverNull;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlStaticIsNullTest extends AbstractSqmlTest {

	@Test
	public void testIsNullCheck() {

		createQueryTest()//
			.add("Integer id")
			.add("SELECT")
			.add("    STATIC IF $id IS NULL {1} ELSE {2} AS x,")
			.add("    STATIC IF $id IS NOT NULL {1} ELSE {2} AS y")
			.assertGeneratedSelect("SELECT 1 AS x, 2 AS y", (Integer) null)
			.assertGeneratedSelect("SELECT 2 AS x, 1 AS y", 33);
	}

	@Test
	public void testCannotBeNullValidation() {

		createQueryTest()//
			.add("Integer[] id")
			.add("SELECT")
			.add("    STATIC IF $id IS NULL {1} ELSE {2} AS x")
			.assertIssue(SqmlIssueParameterReferenceNeverNull.class, 5);
	}
}
