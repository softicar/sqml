package com.softicar.sqml.test.runtime.query.filters;

import com.softicar.platform.common.container.data.table.DataTableValueFilterOperator;
import com.softicar.platform.common.core.utils.CastUtils;
import com.softicar.platform.db.runtime.query.IDbQuery;
import com.softicar.platform.db.runtime.query.IDbQueryColumn;
import com.softicar.platform.db.runtime.query.IDbQueryFactory;
import com.softicar.platform.db.runtime.query.IDbQueryRow;
import com.softicar.platform.db.runtime.select.DbSqlFormatter;
import com.softicar.platform.db.runtime.select.IDbSqlSelect;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlTestCases;
import java.lang.reflect.Method;
import org.junit.Before;
import org.junit.Test;

public class SqmlValueFilterTest<R extends IDbQueryRow<R>> extends AbstractSqmlTest {

	private Class<IDbQuery<?>> queryClass;
	private IDbQuery<R> query;

	@Before
	public void before() {

		parser.loadLanguagePackage();
	}

	@Test
	public void testIntegerFilter() throws ReflectiveOperationException {

		createQuery("SELECT 1 AS one");
		setValueFilter("ONE_COLUMN", DataTableValueFilterOperator.EQUAL, 22);
		assertGeneratedSelect("SELECT 1 AS one HAVING (one = 22)");
	}

	@Test
	public void testIntegerFilterWithExistingHavingClause() throws ReflectiveOperationException {

		createQuery("SELECT 1 AS one HAVING one = 2");
		setValueFilter("ONE_COLUMN", DataTableValueFilterOperator.EQUAL, 22);
		assertGeneratedSelect("SELECT 1 AS one HAVING one = 2 AND (one = 22)");
	}

	@Test
	public void testIntegerFilterWithOrInHavingClause() throws ReflectiveOperationException {

		createQuery("SELECT 1 AS one HAVING one = 2 OR one = 3");
		setValueFilter("ONE_COLUMN", DataTableValueFilterOperator.EQUAL, 22);
		assertGeneratedSelect("SELECT 1 AS one HAVING (one = 2 OR one = 3) AND (one = 22)");
	}

	@Test
	public void testFilterOnStubColumn() throws ReflectiveOperationException {

		SqmlTestCases.loadDeliveryTestCase(parser);
		createQuery("SELECT i.delivery FROM Item i");
		setValueFilter("DELIVERY_COLUMN", DataTableValueFilterOperator.EQUAL, 22);
		assertGeneratedSelect("SELECT i.delivery AS delivery FROM db.item AS i HAVING (delivery = 22)");
	}

	@Test
	public void testFilterOnNonStubTableColumn() throws ReflectiveOperationException {

		SqmlTestCases.loadDeliveryTestCase(parser);
		createQuery("SELECT i.* FROM Item i");
		setValueFilter("I_COLUMN", DataTableValueFilterOperator.EQUAL, 22);
		assertGeneratedSelect("SELECT i.id AS i$id, i.delivery AS i$delivery, i.charge AS i$charge FROM db.item AS i HAVING (i$id = 22)");
	}

	// TODO: incorporate the logic below into SqmlQueryTest

	private void assertGeneratedSelect(String expectedSql) throws ReflectiveOperationException {

		IDbSqlSelect select = createSelect();
		assertEquals(expectedSql, new DbSqlFormatter(select).setExpandParameters(true).format());
	}

	private void createQuery(String statement) throws ReflectiveOperationException {

		this.queryClass = createQueryTest().add(statement).createRuntimeQueryClass();
		this.query = createQuery();
	}

	private IDbSqlSelect createSelect() throws ReflectiveOperationException {

		Method method = query.getClass().getMethod("createSelect");
		return (IDbSqlSelect) method.invoke(query);
	}

	private IDbQuery<R> createQuery() throws ReflectiveOperationException {

		IDbQueryFactory<?> factory = CastUtils.cast(queryClass.getDeclaredField("FACTORY").get(null));
		Method method = factory.getClass().getMethod("createQuery");
		method.setAccessible(true);
		IDbQuery<R> query = CastUtils.cast(method.invoke(factory));
		return query;
	}

	private <T> IDbQueryColumn<R, T> getQueryColumn(String name) throws ReflectiveOperationException {

		return CastUtils.cast(queryClass.getDeclaredField(name).get(null));
	}

	private <T> void setValueFilter(String columnName, DataTableValueFilterOperator filterOperation, T value) throws ReflectiveOperationException {

		IDbQueryColumn<R, T> column = getQueryColumn(columnName);
		query.getFilters().addValueFilter(column, filterOperation, value);
	}
}
