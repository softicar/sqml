package com.softicar.sqml.test.linking;

import com.softicar.sqml.model.validation.SqmlIssueType;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlLinkingServiceTest extends AbstractSqmlTest {

	@Test
	public void testRobustness() {

		createQueryTest()//
			.addAll("SELECT i.id AS x FROM i")
			.assertIssue(SqmlIssueType.LINKING_ERROR, 3)
			.assertIssue(SqmlIssueType.UNRESOLVED_PROXY, 3);
	}

	@Test
	public void testLinkingWithoutImpot() {

		createFileTest("Foo.sqml")//
			.add("PACKAGE com.softicar.sqml.foo.Foo")
			.add("TABLE Foo {")
			.add("    Integer id = SERIAL")
			.add("    Bar bar")
			.add("}");

		createFileTest("Bar.sqml")//
			.add("PACKAGE com.softicar.sqml.bar.Bar")
			.add("TABLE Bar {")
			.add("    Integer id = SERIAL")
			.add("}");

		createFileTest("Query.sqml")//
			.add("PACKAGE com.softicar.sqml.foo.Query")
			.add("QUERY Query {")
			.add("    SELECT 1")
			.add("    FROM Foo foo")
			.add("    JOIN Bar bar ON bar = foo.bar")
			.add("}")
			.assertIssue(SqmlIssueType.LINKING_ERROR, 5);
	}
}
