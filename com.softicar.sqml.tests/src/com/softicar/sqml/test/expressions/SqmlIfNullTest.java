package com.softicar.sqml.test.expressions;

import com.softicar.sqml.model.expressions.validation.SqmlIssueIfNullExpressionsNotSameType;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlIfNullTest extends AbstractSqmlTest {

	@Test
	public void checksForSameType() {

		createQueryTest()//
			.add("SELECT IFNULL(2, 'foo') AS x")
			.assertIssue(SqmlIssueIfNullExpressionsNotSameType.class, 3);
	}
}
