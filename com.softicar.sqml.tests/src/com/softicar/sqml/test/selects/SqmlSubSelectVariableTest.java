package com.softicar.sqml.test.selects;

import com.softicar.sqml.model.expressions.validation.SqmlIssueInvalidValueReference;
import com.softicar.sqml.model.expressions.validation.SqmlIssueUnresolvedPathTarget;
import com.softicar.sqml.model.validation.SqmlIssueType;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlSubSelectVariableTest extends AbstractSqmlTest {

	@Test
	public void testRobustness() {

		createQueryTest()
			.add("SELECT t.x AS x")
			.add("FROM (SELECT x AS y) t")
			.assertIssue(SqmlIssueType.LINKING_ERROR, 3)
			.assertIssue(SqmlIssueType.UNRESOLVED_PROXY, 3)
			.assertIssue(SqmlIssueUnresolvedPathTarget.class, 3)
			.assertIssue(SqmlIssueInvalidValueReference.class, 3)
			.assertIssue(SqmlIssueType.LINKING_ERROR, 4)
			.assertIssue(SqmlIssueType.UNRESOLVED_PROXY, 4)
			.assertIssue(SqmlIssueUnresolvedPathTarget.class, 4)
			.assertIssue(SqmlIssueInvalidValueReference.class, 4)
			.assertNoMoreIssues();
	}
}
