package com.softicar.sqml.test.builder;

import com.softicar.platform.db.runtime.query.builder.IDbQuerySqlBuilder;
import com.softicar.platform.db.runtime.select.DbSqlFormatter;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlQuerySqlBuilderTest extends AbstractSqmlTest {

	@Test
	public void testLimit() {

		IDbQuerySqlBuilder sqlBuilder = createQueryTest().add("SELECT 1 AS one").createSqlBuilder();
		sqlBuilder.setLimit(10);
		assertSelect("SELECT 1 AS one LIMIT 10", sqlBuilder);
	}

	@Test
	public void testOffsetAndLimit() {

		IDbQuerySqlBuilder sqlBuilder = createQueryTest().add("SELECT 1 AS one").createSqlBuilder();
		sqlBuilder.setOffset(5);
		sqlBuilder.setLimit(15);
		assertSelect("SELECT 1 AS one LIMIT 15 OFFSET 5", sqlBuilder);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testOffsetWithoutLimit() {

		IDbQuerySqlBuilder sqlBuilder = createQueryTest().add("SELECT 1 AS one").createSqlBuilder();
		sqlBuilder.setOffset(5);
		sqlBuilder.buildSelect();
	}

	public void assertSelect(String expectedSelect, IDbQuerySqlBuilder sqlBuilder) {

		String actualSelect = new DbSqlFormatter(sqlBuilder.buildSelect()).setExpandParameters(true).format();
		assertEquals(expectedSelect, actualSelect);
	}
}
