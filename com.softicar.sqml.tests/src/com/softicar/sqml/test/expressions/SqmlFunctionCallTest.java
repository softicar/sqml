package com.softicar.sqml.test.expressions;

import com.softicar.sqml.model.expressions.validation.SqmlIssueAmbiguousFunctionCall;
import com.softicar.sqml.model.expressions.validation.SqmlIssueFunctionCallToInvisibleFunction;
import com.softicar.sqml.model.expressions.validation.SqmlIssueIncompatibleFunctionCallArguments;
import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.functions.ISqmlFunction;
import com.softicar.sqml.model.functions.ISqmlFunctionCall;
import com.softicar.sqml.model.queries.ISqmlQuery;
import com.softicar.sqml.model.selects.ISqmlSelectColumn;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlFunctionCallTest extends AbstractSqmlTest {

	@Test
	public void testSqmlErrorAmbiguousFunctionCall() {

		createFileTest("Q.sqml")
			.add("PACKAGE com.example")
			.add()
			.add("FUNCTION Integer foo(Integer i, Long l) SQL {} END")
			.add("FUNCTION Integer foo(Long l, Integer i) SQL {} END")
			.add()
			.add("QUERY Q")
			.add("    SELECT foo(1, 2) AS x")
			.add("END")
			.assertIssue(SqmlIssueAmbiguousFunctionCall.class, 7);
	}

	@Test
	public void testSqmlErrorIncompatibleFunctionCallArguments() {

		createFileTest("Q.sqml")
			.add("PACKAGE com.example")
			.add()
			.add("FUNCTION Integer foo(Integer i) SQL {} END")
			.add()
			.add("QUERY Q")
			.add("    SELECT")
			.add("        foo() AS x,")
			.add("        foo('2') AS y")
			.add("END")
			.assertIssue(SqmlIssueIncompatibleFunctionCallArguments.class, 7)
			.assertIssue(SqmlIssueIncompatibleFunctionCallArguments.class, 8);
	}

	@Test
	public void testSqmlErrorFunctionCallToInvisibleFunction() {

		createFileTest("Foo.sqml")//
			.add("PACKAGE com.example.foo")
			.add("FUNCTION Integer foo(Integer i) { SQL {$i} }")
			.assertNoIssues();

		createQueryTest()//
			.add("SELECT")
			.add("    foo() AS x,")
			.add("    foo('2') AS y")
			.assertIssue(SqmlIssueFunctionCallToInvisibleFunction.class, 4)
			.assertIssue(SqmlIssueFunctionCallToInvisibleFunction.class, 5);
	}

	@Test
	public void testLocalFunctionCall() {

		ISqmlFile file = createFileTest("Query.sqml")
			.add("PACKAGE com.example")
			.add()
			.add("FUNCTION String foo(String a, String b) {")
			.add("    SQL {CONCAT($a, $b)}")
			.add("}")
			.add()
			.add("QUERY Query {")
			.add("    SELECT foo('1', '2') AS x")
			.add("}")
			.assertNoIssues()
			.getFile();

		ISqmlQuery fooQuery = file.getQuery("Query");
		assertSame(file.getFunction("foo"), getCalledFunction(fooQuery, 0));
	}

	@Test
	public void testFunctionOverloading() {

		ISqmlFile file = createFileTest("Query.sqml")
			.add("PACKAGE com.example")
			.add()
			.add("FUNCTION String foo(Integer i) { SQL {$i} }")
			.add("FUNCTION String foo(Double d) { SQL {$d} }")
			.add("FUNCTION String foo(Long l) { SQL {$l} }")
			.add()
			.add("QUERY Query {")
			.add("    SELECT foo(1) AS one, foo(2d) AS two, foo(3L) AS three")
			.add("}")
			.getFile();

		ISqmlQuery query = file.getQuery("Query");
		assertSame(getFunction(file, 0), getCalledFunction(query, 0));
		assertSame(getFunction(file, 1), getCalledFunction(query, 1));
		assertSame(getFunction(file, 2), getCalledFunction(query, 2));
	}

	@Test
	public void testFriendPackageFunctionCall() {

		ISqmlFile friendPackage = createFileTest("Foo.sqml")
			.add("PACKAGE com.example")
			.add()
			.add("FUNCTION String foo(Integer d) { SQL {$d} }")
			.add("FUNCTION String foo(String s) { SQL {$s} }")
			.getFile();

		ISqmlFile thisPackage = createFileTest("Query.sqml")
			.add("PACKAGE com.example")
			.add()
			.add("QUERY Query {")
			.add("    SELECT foo(1) AS one, foo('2') AS two")
			.add("}")
			.assertNoIssues()
			.getFile();

		ISqmlQuery query = thisPackage.getQuery("Query");
		assertSame(getFunction(friendPackage, 0), getCalledFunction(query, 0));
		assertSame(getFunction(friendPackage, 1), getCalledFunction(query, 1));
	}

	@Test
	public void testImportedFunctionOverloading() {

		ISqmlFile remotePackage = createFileTest("FooBase.sqml")
			.add("PACKAGE com.example.base")
			.add()
			.add("FUNCTION String foo(Integer i) { SQL {$i} }")
			.add("FUNCTION String foo(Double d) { SQL {$d} }")
			.add("FUNCTION String foo(Long l) { SQL {$l} }")
			.getFile();

		ISqmlFile friendPackage = createFileTest("FooSame.sqml")
			.add("PACKAGE com.example")
			.add()
			.add("FUNCTION String foo(Double d) { SQL {$d} }")
			.add("FUNCTION String foo(String s) { SQL {$s} }")
			.getFile();

		ISqmlFile thisPackage = createFileTest("Query.sqml")
			.add("PACKAGE com.example")
			.add()
			.add("IMPORT com.example.base.foo")
			.add()
			.add("FUNCTION String foo(Long l) { SQL {$l} }")
			.add()
			.add("QUERY Query {")
			.add("    SELECT foo(1) AS one, foo(2d) AS two, foo(3L) AS three, foo('4') AS four")
			.add("}")
			.getFile();

		ISqmlQuery query = thisPackage.getQuery("Query");
		assertSame(getFunction(remotePackage, 0), getCalledFunction(query, 0));
		assertSame(getFunction(remotePackage, 1), getCalledFunction(query, 1));
		assertSame(getFunction(thisPackage, 0), getCalledFunction(query, 2));
		assertSame(getFunction(friendPackage, 1), getCalledFunction(query, 3));
	}

	private ISqmlFunction getFunction(ISqmlFile file, int index) {

		return (ISqmlFunction) file.getElements().get(index);
	}

	private ISqmlFunction getCalledFunction(ISqmlQuery fooQuery, int index) {

		ISqmlSelectColumn column = fooQuery.getSelect().getColumns().get(index);
		return ((ISqmlFunctionCall) column.getExpression()).getFunction();
	}
}
