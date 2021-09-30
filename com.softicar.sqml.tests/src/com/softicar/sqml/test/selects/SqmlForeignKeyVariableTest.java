package com.softicar.sqml.test.selects;

import com.softicar.sqml.model.validation.SqmlIssueType;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlForeignKeyVariableTest extends AbstractSqmlTest {

	@Test
	public void testRobustness() {

		createQueryTest()//
			.add("SELECT 1 AS x")
			.add("JOIN v.g")
			.assertIssue(SqmlIssueType.UNRESOLVED_PROXY, 4);
	}
}
