package com.softicar.sqml.test.runtime;

import com.softicar.platform.db.runtime.select.IDbSqlSelect;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlTestCases;
import java.util.Arrays;
import org.junit.Test;

public class SqmlSqlSelectTest extends AbstractSqmlTest {

	@Test
	public void testColumnIndexList() {

		parser.loadLanguagePackage();
		SqmlTestCases.loadDeliveryTestCase(parser);

		IDbSqlSelect select = createQueryTest()//
			.add("SELECT 1 AS one")
			.add("SELECT item.*")
			.add("SELECT item.delivery")
			.add("SELECT 2 AS two")
			.add("FROM Item item")
			.createRuntimeQuery()
			.createSelect();
		assertEquals(Arrays.asList(1), select.getPhysicalColumnIndexList("one"));
		assertEquals(Arrays.asList(2), select.getPhysicalColumnIndexList("item"));
		assertEquals(Arrays.asList(5), select.getPhysicalColumnIndexList("delivery"));
		assertEquals(Arrays.asList(6), select.getPhysicalColumnIndexList("two"));
	}
}
