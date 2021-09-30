package com.softicar.sqml.test.selects;

import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.selects.ISqmlSelect;
import com.softicar.sqml.model.selects.ISqmlSelectColumn;
import com.softicar.sqml.model.selects.ISqmlVariable;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlTestCases;
import java.util.List;
import org.junit.Test;

public class SqmlSelectTest extends AbstractSqmlTest {

	@Test
	public void generatesComplexSqlStatement() {

		parser.loadLanguagePackage();

		createTableTest("SomeTable", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("String name")
			.assertNoIssues();

		ISqmlFile file = createFileTest("SomeQuery.sqml")
			.add("PACKAGE com.example")
			.add()
			.add("FUNCTION Integer strlen(String text) {")
			.add("    SQL {LENGTH($text)}")
			.add("}")
			.add()
			.add("QUERY SomeQuery {")
			.add("    FROM SomeTable AS t")
			.add("    SELECT t.id, t.name")
			.add("    WHERE t.name LIKE 'miau%' OR t.name LIKE 'foo%'")
			.add("    WHERE strlen(t.name) < 10")
			.add("    GROUP BY t.name, t.id")
			.add("    HAVING t.id > 100")
			.add("    ORDER BY t.id, t.name")
			.add("}")
			.getFile();

		// @formatter:off
		String expectedSql =
				"SELECT t.id AS id, t.name AS name FROM db.foo AS t "
						+ "WHERE (t.name LIKE 'miau%' OR t.name LIKE 'foo%') AND LENGTH(t.name) < 10 "
						+ "GROUP BY t.name, t.id "
						+ "HAVING t.id > 100 "
						+ "ORDER BY t.id, t.name";
		// @formatter:on

		createQueryTest(file.getQuery("SomeQuery")).assertGeneratedSelect(expectedSql);
	}

	@Test
	public void testDistinct() {

		SqmlTestCases.loadDeliveryTestCase(parser);
		createQueryTest()//
			.add("SELECT DISTINCT i.id")
			.add("FROM Item i")
			.assertGeneratedSelect("SELECT DISTINCT i.id AS id FROM db.item AS i");
	}

	@Test
	public void testDistinctInSubSelect() {

		SqmlTestCases.loadDeliveryTestCase(parser);
		createQueryTest()//
			.add("SELECT s.id")
			.add("FROM (SELECT DISTINCT i.id FROM Item i) s")
			.assertGeneratedSelect("SELECT s.id AS id FROM (SELECT DISTINCT i.id AS id FROM db.item AS i) AS s");
	}

	@Test
	public void getVariables() {

		SqmlTestCases.loadDeliveryTestCase(parser);

		// note: intentionally not using SqmlFileTest here
		ISqmlFile file = parser.parse("PACKAGE com.example QUERY Q { SELECT 1 FROM Item i JOIN delivery d JOIN Supplier s }", "Q.sqml");
		List<? extends ISqmlVariable> variables = file.getQuery("Q").getSelect().getVariables();

		assertEquals(3, variables.size());
		assertEquals("i", variables.get(0).getName());
		assertEquals("d", variables.get(1).getName());
		assertEquals("s", variables.get(2).getName());
	}

	@Test
	public void getColumn() {

		ISqmlSelect select = createQueryTest()
			.add("Boolean foo")
			.add("Boolean bar")
			.add("#IF $foo { SELECT 1 AS a }")
			.add("ELSE IF $bar { SELECT 2 AS b }")
			.add("ELSE { SELECT 3 AS c }")
			.getSelect();

		assertNotNull(select.getColumn("a"));
		assertNotNull(select.getColumn("b"));
		assertNotNull(select.getColumn("c"));
	}

	@Test
	public void getColumns() {

		List<? extends ISqmlSelectColumn> columns = createQueryTest()
			.add("Boolean foo")
			.add("Boolean bar")
			.add("#IF $foo { SELECT 1 AS a }")
			.add("ELSE IF $bar { SELECT 2 AS b }")
			.add("ELSE { SELECT 3 AS c }")
			.getSelect()
			.getColumns();

		assertNotNull(columns);
		assertEquals(3, columns.size());
		assertEquals("a", columns.get(0).getAlias());
		assertEquals("b", columns.get(1).getAlias());
		assertEquals("c", columns.get(2).getAlias());
	}
}
