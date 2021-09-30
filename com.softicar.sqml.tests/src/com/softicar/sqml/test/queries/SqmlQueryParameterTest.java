package com.softicar.sqml.test.queries;

import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.queries.ISqmlQueryParameter;
import com.softicar.sqml.model.queries.validation.SqmlIssueQueryParameterNameNotLowerCamelCase;
import com.softicar.sqml.model.queries.validation.SqmlIssueQueryParameterUnused;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import java.util.Arrays;
import org.junit.Test;

public class SqmlQueryParameterTest extends AbstractSqmlTest {

	@Test
	public void testTypeOfCollectionParameter() {

		ISqmlQueryParameter parameter = createQueryTest()//
			.add("Integer[] ids")
			.add("SELECT 1 AS x")
			.add("WHERE 1 IN $ids")
			.getQuery()
			.getParameters()
			.get(0);

		ISqmlType expectedType = SqmlBuiltInTypes.getListType().parameterize(SqmlBuiltInTypes.getIntegerType());
		assertTrue(parameter.getSqmlType().is(expectedType));
	}

	@Test
	public void warningOnUnusedParameter() {

		createQueryTest()//
			.add("Integer id")
			.add("String name")
			.add("SELECT $id AS x")
			.assertIssue(SqmlIssueQueryParameterUnused.class, 4)
			.assertNoMoreIssues();
	}

	@Test
	public void testNonLowerCamelCaseName() {

		createQueryTest()//
			.add("Integer Foo")
			.add("SELECT $Foo AS foo")
			.assertIssue(SqmlIssueQueryParameterNameNotLowerCamelCase.class, 3)
			.assertNoMoreIssues();
	}

	@Test
	public void testEnumParameter() {

		createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("State state")
			.add("ENUM State { ONE TWO THREE }")
			.getTable();

		ISqmlFile file = createFileTest("Query.sqml")//
			.add("PACKAGE com.example")
			.add()
			.add("IMPORT com.example.Foo.State")
			.add()
			.add("QUERY Query {")
			.add("	State state")
			.add("	SELECT foo.id")
			.add("	FROM Foo AS foo")
			.add("	WHERE foo.state = $state")
			.add("}")
			.getFile();

		createQueryTest(file.getQuery("Query"))//
			.assertGeneratedSelect("SELECT foo.id AS id FROM db.foo AS foo WHERE foo.state = 'TWO'", "TWO");
	}

	@Test
	public void testEnumParameterList() {

		createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("State state")
			.add("ENUM State { ONE TWO THREE }")
			.getTable();

		createQueryTest()//
			.add("com.example.Foo.State[] states")
			.add("SELECT foo.id")
			.add("FROM Foo AS foo")
			.add("WHERE foo.state IN $states")
			.assertGeneratedSelect("SELECT foo.id AS id FROM db.foo AS foo WHERE foo.state IN ('ONE', 'THREE')", Arrays.asList("ONE", "THREE"));
	}
}
