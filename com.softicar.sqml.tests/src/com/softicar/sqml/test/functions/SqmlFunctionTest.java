package com.softicar.sqml.test.functions;

import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.functions.ISqmlFunction;
import com.softicar.sqml.model.functions.validation.SqmlIssueIncompatibleFunctionReturnType;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlTestCases;
import org.junit.Test;

public class SqmlFunctionTest extends AbstractSqmlTest {

	@Test
	public void testSignature() {

		SqmlTestCases.loadDeliveryTestCase(parser);

		ISqmlFile file = createFileTest("Foo.sqml")//
			.add("PACKAGE com.example")
			.add()
			.add("FUNCTION Integer foo1() { SQL {} }")
			.add("FUNCTION Integer foo2(String a) { SQL {$a} }")
			.add("FUNCTION Integer foo3(Item item, Integer x) { SQL {$item + $x} }")
			.getFile();

		ISqmlFunction foo1 = file.getFunction("foo1");
		assertEquals("foo1", foo1.getName());
		assertEquals("foo1()", foo1.getSimpleSignature());
		assertEquals("com.example.foo1", foo1.getQualifiedName().toString("."));
		assertEquals("com.example.foo1()", foo1.getQualifiedSignature().toString("."));

		ISqmlFunction foo2 = file.getFunction("foo2");
		assertEquals("foo2(String)", foo2.getSimpleSignature());
		assertEquals("com.example.foo2(String)", foo2.getQualifiedSignature().toString("."));

		ISqmlFunction foo3 = file.getFunction("foo3");
		assertEquals("foo3(com.example.Item,Integer)", foo3.getSimpleSignature());
		assertEquals("com.example.foo3(com.example.Item,Integer)", foo3.getQualifiedSignature().toString("."));
	}

	@Test
	public void checkReturnType() {

		createFileTest("Foo.sqml")//
			.add("PACKAGE com.example")
			.add()
			.add("FUNCTION Integer foo() {")
			.add("    'hello'")
			.add("}")
			.add()
			.add("FUNCTION Integer foo(String x) {")
			.add("    $x")
			.add("}")
			.add()
			.add("FUNCTION Long foo(Integer x) {")
			.add("    $x")
			.add("}")
			.assertIssue(SqmlIssueIncompatibleFunctionReturnType.class, 4)
			.assertIssue(SqmlIssueIncompatibleFunctionReturnType.class, 8)
			.assertNoMoreIssues();
	}

	@Test
	public void replacesSqlFunctionParameters() {

		ISqmlFile file = createFileTest("Query.sqml")//
			.add("PACKAGE com.example")
			.add()
			.add("FUNCTION String substr(String text, Integer startIndex, Integer length) {")
			.add("    SQL {SUBSTRING($text, $startIndex, $length)}")
			.add("}")
			.add()
			.add("QUERY Query {")
			.add("    SELECT substr('hello', 2, 2) AS ll")
			.add("}")
			.getFile();
		createQueryTest(file.getQuery("Query"))//
			.assertNoIssues()
			.assertGeneratedSelect("SELECT SUBSTRING('hello', 2, 2) AS ll");
	}

	@Test
	public void replacesExpressionFunctionParameters() {

		parser.loadLanguagePackage();

		ISqmlFile file = createFileTest("Query.sqml")//
			.add("PACKAGE com.example")
			.add()
			.add("FUNCTION Integer add(Integer x, Integer y) {")
			.add("    ($x + $y)")
			.add("}")
			.add()
			.add("QUERY Query {")
			.add("    SELECT add(add(1, 2), add(3, 4)) AS x")
			.add("}")
			.getFile();
		createQueryTest(file.getQuery("Query"))//
			.assertNoIssues()
			.assertGeneratedSelect("SELECT ((1 + 2) + (3 + 4)) AS x");
	}

	@Test
	public void testNumberLiterals() {

		createFileTest("Foo.sqml")//
			.add("PACKAGE com.example")
			.add("FUNCTION Decimal getDecimal() {")
			.add("    SQL {return 4.5}")
			.add("}")
			.add("FUNCTION Decimal getInteger() {")
			.add("    SQL {return 33}")
			.add("}")
			.assertNoIssues();
	}

	@Test
	public void testUseOfBuiltInFunctionsInCustomFunctions() {

		parser.loadLanguagePackage();

		ISqmlFile file = createFileTest("Query.sqml")//
			.add("PACKAGE com.example")
			.add()
			.add("FUNCTION Boolean less(Integer x, Integer y) {")
			.add("    $x < $y")
			.add("}")
			.add()
			.add("QUERY Query {")
			.add("    SELECT less(1,2) AS x")
			.add("}")
			.getFile();
		createQueryTest(file.getQuery("Query"))//
			.assertNoIssues()
			.assertGeneratedSelect("SELECT 1 < 2 AS x");
	}
}
