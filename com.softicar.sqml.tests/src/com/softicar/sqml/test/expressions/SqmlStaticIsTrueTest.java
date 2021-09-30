package com.softicar.sqml.test.expressions;

import com.softicar.sqml.model.expressions.validation.SqmlIssueParameterReferenceNotBoolean;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlStaticIsTrueTest extends AbstractSqmlTest {

	@Test
	public void testIsTrueCheck() {

		createQueryTest()
			.add("Boolean flag")
			.add("SELECT STATIC IF $flag {1} ELSE {2} AS x, STATIC IF NOT $flag {1} ELSE {2} AS y")
			.assertGeneratedSelect("SELECT 1 AS x, 2 AS y", true)
			.assertGeneratedSelect("SELECT 2 AS x, 1 AS y", false);
	}

	@Test
	public void testNotBooleanValidation() {

		createQueryTest()
			.add("Integer value")
			.add("SELECT")
			.add("    STATIC IF $value {1} ELSE {2} AS x")
			.assertIssue(SqmlIssueParameterReferenceNotBoolean.class, 5);
	}
}
