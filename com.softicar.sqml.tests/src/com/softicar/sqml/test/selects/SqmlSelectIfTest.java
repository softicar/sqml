package com.softicar.sqml.test.selects;

import com.softicar.platform.db.runtime.select.IDbSqlSelect;
import com.softicar.sqml.model.selects.ISqmlSelectColumn;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlQueryTest;
import org.junit.Test;

public class SqmlSelectIfTest extends AbstractSqmlTest {

	@Test
	public void test() {

		createQueryTest()
			.add("Boolean a")
			.add("Boolean b")
			.add("#IF $a { SELECT 1 AS a }")
			.add("ELSE IF $b { SELECT 2 AS b }")
			.add("ELSE { SELECT 3 AS c }")
			.assertGeneratedSelect("SELECT 1 AS a", true, true)
			.assertGeneratedSelect("SELECT 1 AS a", true, false)
			.assertGeneratedSelect("SELECT 2 AS b", false, true)
			.assertGeneratedSelect("SELECT 3 AS c", false, false);
	}

	@Test
	public void testScopingOfBlocks() {

		createQueryTest()
			.add("Boolean foo")
			.add("Boolean bar")
			.add("#IF $foo { SELECT 1 AS a }")
			.add("ELSE IF $bar { SELECT 2 AS b }")
			.add("ELSE { SELECT 3 AS c }")
			.add("ORDER BY a, b, c")
			.assertNoIssues();
	}

	@Test
	public void testActiveColumns() {

		SqmlQueryTest queryTest = createQueryTest()
			.add("Boolean foo")
			.add("Boolean bar")
			.add("#IF $foo { SELECT 1 AS a }")
			.add("ELSE IF $bar { SELECT 2 AS b }")
			.add("ELSE { SELECT 3 AS c }");

		assertActiveColumn(queryTest, "a", true, false);
		assertActiveColumn(queryTest, "b", false, true);
		assertActiveColumn(queryTest, "c", false, false);
	}

	private void assertActiveColumn(SqmlQueryTest queryTest, String expectedColumnName, Object...args) {

		IDbSqlSelect select = queryTest.createRuntimeQuery(args).createSelect();
		for (ISqmlSelectColumn column: queryTest.getQuery().getSelect().getColumns()) {
			if (column.getName().equals(expectedColumnName)) {
				assertTrue(select.isActiveColumn(column.getName()));
			} else {
				assertFalse(select.isActiveColumn(column.getName()));
			}
		}
	}
}
