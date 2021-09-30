package com.softicar.sqml.test.runtime;

import com.softicar.platform.db.core.database.DbCurrentDatabase;
import com.softicar.platform.db.core.statement.IDbStatement;
import com.softicar.platform.db.core.statement.IDbStatementExecutionListener;
import com.softicar.platform.db.core.table.DbTableName;
import com.softicar.platform.db.core.table.IDbCoreTable;
import com.softicar.platform.db.core.test.DbTestDatabase;
import com.softicar.platform.db.runtime.query.IDbQuery;
import com.softicar.platform.db.runtime.table.creator.DbAutomaticTableCreator;
import com.softicar.platform.db.runtime.test.DbRandomAutoIncrementSupplier;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlDeliveryTestCase;
import com.softicar.sqml.test.utils.SqmlTestCases;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SqmlQueryDbAccessTest extends AbstractSqmlTest {

	private final AccessListener accessListener;
	private ISqmlTable itemTable;
	private ISqmlTable deliveryTable;
	private ISqmlTable supplierTable;

	public SqmlQueryDbAccessTest() {

		this.accessListener = new AccessListener();

		// setup test database and listeners
		DbTestDatabase testDatabase = new DbTestDatabase();
		testDatabase.addListener(new DbAutomaticTableCreator(new DbRandomAutoIncrementSupplier()));
		testDatabase.addListener(accessListener);
		DbCurrentDatabase.set(testDatabase);
	}

	@Before
	public void before() {

		parser.loadLanguagePackage();
		SqmlDeliveryTestCase testCase = SqmlTestCases.loadDeliveryTestCase(parser);

		this.itemTable = testCase.getItemTable();
		this.deliveryTable = testCase.getDeliveryTable();
		this.supplierTable = testCase.getSupplierTable();
	}

	// ------------------------------ list() ------------------------------ //

	@Test
	public void testList() {

		createSimpleSelect().list();

		accessListener.assertAccess("SELECT", itemTable, deliveryTable);
	}

	@Test
	public void testListWithSubSelect() {

		createSelectWithSubSelect().list();

		accessListener.assertAccess("SELECT", itemTable, deliveryTable, supplierTable);
	}

	// ------------------------------ count() ------------------------------ //

	@Test
	public void testCount() {

		createSimpleSelect().count();

		accessListener.assertAccess("SELECT", itemTable, deliveryTable);
	}

	@Test
	public void testCountWithSubSelect() {

		createSelectWithSubSelect().count();

		accessListener.assertAccess("SELECT", itemTable, deliveryTable, supplierTable);
	}

	// ------------------------------ private ------------------------------ //

	private IDbQuery<?> createSimpleSelect() {

		IDbQuery<?> query = createQueryTest()//
			.add("SELECT item")
			.add("FROM Item item")
			.add("JOIN item.delivery AS delivery")
			.createRuntimeQuery();
		return query;
	}

	private IDbQuery<?> createSelectWithSubSelect() {

		IDbQuery<?> query = createQueryTest()//
			.add("SELECT i")
			.add("FROM Item i")
			.add("JOIN i.delivery AS d")
			.add("WHERE d.supplier IN (SELECT s.id FROM Supplier AS s)")
			.createRuntimeQuery();
		return query;
	}

	// ------------------------------ access listener ------------------------------ //

	private static class AccessListener implements IDbStatementExecutionListener {

		private final List<IDbStatement> statements;

		public AccessListener() {

			this.statements = new ArrayList<>();
		}

		@Override
		public void beforeExecution(IDbStatement statement) {

			if (!statement.getText().startsWith("CREATE TABLE") && !statement.getText().startsWith("CREATE SCHEMA")) {
				statements.add(statement);
			}
		}

		public void assertAccess(String expectedPrefix, ISqmlTable...tables) {

			assertAccess(expectedPrefix, new HashSet<>(Arrays.asList(tables)));
		}

		public void assertAccess(String expectedPrefix, Set<ISqmlTable> tables) {

			Assert.assertEquals(1, statements.size());

			IDbStatement statement = statements.get(0);
			Assert.assertTrue(statement.getText().startsWith(expectedPrefix));
			Collection<DbTableName> expectedTables = tables//
				.stream()
				.map(ISqmlTable::getDbTableName)
				.collect(Collectors.toCollection(TreeSet::new));
			Collection<DbTableName> actualTables = statements//
				.get(0)
				.getTables()
				.stream()
				.map(IDbCoreTable::getFullName)
				.collect(Collectors.toCollection(TreeSet::new));
			Assert.assertEquals(expectedTables, actualTables);
		}
	}
}
