package com.softicar.sqml.test.functions;

import com.softicar.sqml.model.functions.validation.SqmlIssueUnusedFunctionParameter;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlFunctionParameterTest extends AbstractSqmlTest {

	@Test
	public void warningOnUnusedParameter() {

		createFileTest("Foo.sqml")
			.add("PACKAGE com.example")
			.add("")
			.add("FUNCTION Integer Foo(Integer a) {")
			.add("	SQL {1}")
			.add("}")
			.add("")
			.add("FUNCTION Integer Bar(Integer a) {")
			.add("	SQL {$a}")
			.add("}")
			.assertIssue(SqmlIssueUnusedFunctionParameter.class, 3)
			.assertNoMoreIssues();
	}
}
