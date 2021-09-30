package com.softicar.sqml.test.builder;

import com.softicar.platform.common.string.formatting.Formatting;
import com.softicar.platform.db.runtime.logic.AbstractDbObject;
import com.softicar.platform.db.runtime.logic.DbObjectTable;
import com.softicar.platform.db.runtime.object.DbObjectTableBuilder;
import com.softicar.platform.db.runtime.query.DbQueryColumn;
import com.softicar.platform.db.runtime.query.DbQueryTableColumn;
import com.softicar.platform.db.runtime.query.DbQueryTableStubColumn;
import com.softicar.platform.db.runtime.query.builder.IDbQuerySqlBuilder;
import com.softicar.platform.db.runtime.select.DbSqlFormatter;
import com.softicar.platform.db.runtime.select.IDbSqlSelect;
import com.softicar.platform.db.sql.type.SqlValueTypes;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Before;
import org.junit.Test;

public class SqmlDistinctColumnValuesTest extends AbstractSqmlTest {

	private static final String ORIGINAL_SELECT = "SELECT f.id, f.name, f.bar, b.* FROM Foo f JOIN f.bar b";
	private static final String EXPECTED_SELECT = new StringBuilder()
		.append("SELECT f.id AS id, f.name AS name, f.bar AS bar, b.id AS b$id, b.name AS b$name")
		.append(" FROM db.foo AS f")
		.append(" JOIN db.bar AS b")
		.append(" ON f.bar = b.id")
		.toString();
	private static final DbQueryColumn<DummyQueryRow, Integer> ID_COLUMN = new DbQueryColumn<>(null, "id", SqlValueTypes.INTEGER);
	private static final DbQueryColumn<DummyQueryRow, String> STRING_COLUMN = new DbQueryColumn<>(null, "name", SqlValueTypes.STRING);
	private static final DbQueryTableStubColumn<DummyQueryRow, Bar> STUB_COLUMN = new DbQueryTableStubColumn<>(null, "bar", Bar.TABLE);
	private static final DbQueryTableColumn<DummyQueryRow, Bar> TABLE_COLUMN = new DbQueryTableColumn<>(null, "b", Bar.TABLE);
	private int limit = 0;

	@Before
	public void before() {

		createTableTest("Bar", "db.bar")//
			.add("PK Integer id = SERIAL")
			.add("String name")
			.assertNoIssues();
		createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("String name")
			.add("Bar bar")
			.assertNoIssues();
	}

	@Test
	public void testIdColumn() {

		assertSelect(ID_COLUMN, "SELECT DISTINCT x.id FROM (%s) x", EXPECTED_SELECT);
	}

	@Test
	public void testIdColumnWithLimit() {

		limit = 20;
		assertSelect(ID_COLUMN, "SELECT DISTINCT x.id FROM (%s) x LIMIT 20", EXPECTED_SELECT);
	}

	@Test
	public void testStringColumn() {

		assertSelect(STRING_COLUMN, "SELECT DISTINCT x.name FROM (%s) x", EXPECTED_SELECT);
	}

	@Test
	public void testStubColumn() {

		assertSelect(STUB_COLUMN, "SELECT DISTINCT x.bar FROM (%s) x", EXPECTED_SELECT);
	}

	@Test
	public void testTableColumn() {

		assertSelect(TABLE_COLUMN, "SELECT DISTINCT x.b$id, x.b$name FROM (%s) x", EXPECTED_SELECT);
	}

	private void assertSelect(DbQueryColumn<?, ?> column, String expectedSelect, Object...arguments) {

		IDbQuerySqlBuilder sqlBuilder = createQueryTest().add(ORIGINAL_SELECT).createSqlBuilder();
		IDbSqlSelect select = sqlBuilder.buildDistinctColumnValuesSelect(column, limit);
		String actualSelect = new DbSqlFormatter(select).setExpandParameters(true).format();
		assertEquals(Formatting.format(expectedSelect, arguments), actualSelect);
	}

	private static class Bar extends AbstractDbObject<Bar> {

		public static final DbObjectTableBuilder<Bar, Bar> BUILDER = new DbObjectTableBuilder<>("db", "bar", Bar::new, Bar.class);
		public static final DbObjectTable<Bar> TABLE = new DbObjectTable<>(BUILDER);

		static {
			BUILDER.addIdField("id", null, null);
			BUILDER.addStringField("name", null, null);
		}

		@Override
		public DbObjectTable<Bar> table() {

			return TABLE;
		}
	}
}
