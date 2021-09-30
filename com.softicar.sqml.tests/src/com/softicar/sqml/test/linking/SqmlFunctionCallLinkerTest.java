package com.softicar.sqml.test.linking;

import com.softicar.sqml.model.expressions.validation.SqmlIssueIncompatibleFunctionCallArguments;
import com.softicar.sqml.model.expressions.validation.SqmlIssueUnresolvedFunctionCall;
import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.functions.ISqmlFunctionCall;
import com.softicar.sqml.model.validation.SqmlIssueType;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlFunctionCallLinkerTest extends AbstractSqmlTest {

	@Test
	public void prefersNameMatchOverArgumentMatch() {

		ISqmlFile file = createFileTest("Query.sqml")
			.add("PACKAGE com.example")
			.add()
			.add("FUNCTION Integer foo() { SQL {} }")
			.add("FUNCTION Integer FOO(Integer i) { SQL {$i} }")
			.add()
			.add("QUERY Query {")
			.add("    SELECT")
			.add("        foo(1) AS a,")
			.add("        FOO() AS b")
			.add("}")
			.assertIssue(SqmlIssueIncompatibleFunctionCallArguments.class, 8)
			.assertIssue(SqmlIssueIncompatibleFunctionCallArguments.class, 9)
			.getFile();

		ISqmlFunctionCall callA = (ISqmlFunctionCall) file.getQuery("Query").getSelect().getColumn("a").getExpression();
		ISqmlFunctionCall callB = (ISqmlFunctionCall) file.getQuery("Query").getSelect().getColumn("b").getExpression();

		assertSame(file.getFunction("foo"), callA.getFunction());
		assertSame(file.getFunction("FOO"), callB.getFunction());
	}

	@Test
	public void doesNotLinkToFunctionWithUnmatchedName() {

		createFileTest("Query.sqml")
			.add("PACKAGE com.example")
			.add()
			.add("FUNCTION Integer foo(Integer x) { SQL {$x} }")
			.add()
			.add("QUERY Query {")
			.add("    SELECT")
			.add("        FOO(1) AS x")
			.add("}")
			.assertIssue(SqmlIssueUnresolvedFunctionCall.class, 7)
			.assertIssue(SqmlIssueType.UNRESOLVED_PROXY, 7)
			.assertIssue(SqmlIssueType.LINKING_ERROR, 7)
			.assertNoMoreIssues();
	}
}
