package com.softicar.sqml.test.queries;

import com.softicar.sqml.model.expressions.validation.SqmlIssueUnresolvedTableColumnType;
import com.softicar.sqml.model.queries.validation.SqmlIssueQueryNameMustMatchFilename;
import com.softicar.sqml.model.queries.validation.SqmlIssueQueryWithMissingSelectClause;
import com.softicar.sqml.model.selects.SqmlIssueUnresolvedForeignKeyType;
import com.softicar.sqml.model.types.validation.SqmlIssueUnresolvedTypeReference;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlTestCases;
import org.junit.Test;

public class SqmlQueryTest extends AbstractSqmlTest {

	@Test
	public void testEmptyQuery() {

		SqmlTestCases.loadStockTestCase(parser);

		createQueryTest()//
			.assertIssue(SqmlIssueQueryWithMissingSelectClause.class, 2);
	}

	@Test
	public void testQueryWithUnresolvedColumnTypeInSelectClause() {

		createFileTest("Foo.sqml")//
			.add("PACKAGE com.example")
			.add()
			.add("TABLE Foo 'db.tab' {")
			.add("    PK Integer id = SERIAL")
			.add("    Bar bar")
			.add("}")
			.assertIssue(SqmlIssueUnresolvedTypeReference.class, 5);

		createQueryTest()//
			.add("FROM Foo foo")
			.add("SELECT foo.bar")
			.assertIssue(SqmlIssueUnresolvedTableColumnType.class, 4);
	}

	@Test
	public void testQueryWithUnresolvedColumnTypeInJoinClause() {

		createFileTest("Foo.sqml")//
			.add("PACKAGE com.example")
			.add()
			.add("TABLE Foo 'db.tab' {")
			.add("    PK Integer id = SERIAL")
			.add("    Bar bar")
			.add("}")
			.assertIssue(SqmlIssueUnresolvedTypeReference.class, 5);

		createQueryTest()//
			.add("SELECT foo.id")
			.add("FROM Foo foo")
			.add("JOIN foo.bar")
			.assertIssue(SqmlIssueUnresolvedForeignKeyType.class, 5);
	}

	@Test
	public void testMissingSelectClause() {

		SqmlTestCases.loadStockTestCase(parser);

		createQueryTest()//
			.add("FROM Stock stock")
			.assertIssue(SqmlIssueQueryWithMissingSelectClause.class, 2);
	}

	@Test
	public void validateSqmlIssueQueryNameMustMatchFilename() {

		createFileTest("FooQuery.sqml")//
			.add("PACKAGE com.example")
			.add()
			.add("QUERY FooQuery {")
			.add("    SELECT 1 AS x")
			.add("}")
			.assertNoIssues();

		createFileTest("FooQuery.sqml")//
			.add("PACKAGE com.example")
			.add()
			.add("QUERY BarQuery {")
			.add("    SELECT 1 AS x")
			.add("}")
			.assertIssue(SqmlIssueQueryNameMustMatchFilename.class, 3);
	}
}
