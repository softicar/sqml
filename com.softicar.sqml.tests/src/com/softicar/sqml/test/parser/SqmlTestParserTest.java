package com.softicar.sqml.test.parser;

import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.functions.ISqmlFunctionCall;
import com.softicar.sqml.model.queries.ISqmlQuery;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.validation.SqmlIssueType;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlTestParserTest extends AbstractSqmlTest {

	@Test
	public void parseSqlTable() {

		ISqmlTable table = createTableTest("SomeTable", "db.foo")//
			.add("PK Integer id = SERIAL")
			.getTable();

		assertEquals("SomeTable", table.getName());
	}

	@Test
	public void requiresPackageDeclaration() {

		createFileTest("Foo.sqml")//
			.add("TABLE Foo 'db.foo' {")
			.add("    PK Integer id = SERIAL")
			.add("}")
			.assertIssue(SqmlIssueType.SYNTAX_ERROR, 1);
	}

	@Test
	public void testImplicitImportOfLanguagePackage() {

		parser.loadLanguagePackage();

		ISqmlFile file = createFileTest("Query.sqml")//
			.add("PACKAGE com.example")
			.add()
			.add("QUERY Query {")
			.add("    SELECT toString(33) AS x")
			.add("}")
			.getFile();
		ISqmlQuery query = file.getQuery("Query");
		ISqmlFunctionCall functionCall = (ISqmlFunctionCall) query.getSelect().getColumn("x").getExpression();
		assertNotNull(functionCall.getFunction());
		assertEquals("toString", functionCall.getFunction().getName());
	}
}
