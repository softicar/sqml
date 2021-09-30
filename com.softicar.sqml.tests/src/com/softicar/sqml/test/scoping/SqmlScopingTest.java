package com.softicar.sqml.test.scoping;

import com.softicar.sqml.model.ISqmlColumn;
import com.softicar.sqml.model.expressions.validation.SqmlIssueUnresolvedPathTarget;
import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.queries.ISqmlQuery;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.types.ISqmlEnum;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlDeliveryTestCase;
import com.softicar.sqml.test.utils.SqmlTestCases;
import org.junit.Test;

public class SqmlScopingTest extends AbstractSqmlTest {

	@Test
	public void putsColumnsIntoScopeOfKey() {

		createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("String name")
			.add("Integer age")
			.add()
			.add("UK name age")
			.add("IK age")
			.assertNoIssues();
	}

	@Test
	public void putsEnumsIntoScope() {

		ISqmlTable table = createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("Status status")
			.add()
			.add("ENUM Status ON String {")
			.add("    OK = 'OK'")
			.add("    FAIL = 'FAIL'")
			.add("}")
			.getTable();

		ISqmlColumn column = table.getColumns().get(1);
		ISqmlEnum sqmlEnum = table.getEnums().iterator().next();

		assertSame(sqmlEnum, column.getSqmlType());
	}

	@Test
	public void testPackageInternalCrossReferences() {

		SqmlDeliveryTestCase testCase = SqmlTestCases.loadDeliveryTestCase(parser);

		ISqmlFile queryFile = createFileTest("FooQuery.sqml")//
			.add("PACKAGE com.example")
			.add()
			.add("QUERY FooQuery {")
			.add("    SELECT d.* FROM Delivery d")
			.add("}")
			.assertNoIssues()
			.getFile();

		// check that query refers to correct table
		ISqmlTable deliveryTable = testCase.getDeliveryTable();
		ISqmlQuery deliveryQuery = queryFile.getQuery("FooQuery");
		assertSame(deliveryTable, deliveryQuery.getSelect().getVariable("d").getTabular());
	}

	@Test
	public void testPackageExternalCrossReferences() {

		SqmlDeliveryTestCase testCase = SqmlTestCases.loadDeliveryTestCase(parser);

		ISqmlFile queryFile = createFileTest("FooQuery.sqml")//
			.add("PACKAGE com.example.foo")
			.add()
			.add("IMPORT com.example.Delivery")
			.add()
			.add("QUERY FooQuery {")
			.add("    SELECT d.* FROM Delivery d")
			.add("}")
			.assertNoIssues()
			.getFile();

		// check that query refers to correct table
		ISqmlTable deliveryTable = testCase.getDeliveryTable();
		ISqmlQuery deliveryQuery = queryFile.getQuery("FooQuery");
		assertSame(deliveryTable, deliveryQuery.getSelect().getVariable("d").getTabular());
	}

	@Test
	public void allowsSelectionOfColumnsOfJoinedSubSelect() {

		SqmlTestCases.loadDeliveryTestCase(parser);

		createQueryTest()//
			.add("FROM")
			.add("(FROM Delivery d")
			.add("SELECT d.id, d.number) s")
			.add("SELECT s.id, s.number")
			.assertNoIssues();
	}

	@Test
	public void testNestedFunctionCalls() {

		// this is a regression test
		// this SELECT was causing a cyclic resolution error
		parser.loadLanguagePackage();
		createQueryTest()//
			.add("SELECT toInteger(toString(x))")
			.assertIssue(SqmlIssueUnresolvedPathTarget.class, 3);
	}
}
