package com.softicar.sqml.test.conditions;

import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlTestCases;
import org.junit.Test;

public class SqmlExistsTest extends AbstractSqmlTest {

	@Test
	public void testGenerateSql() {

		SqmlTestCases.loadStockTestCase(parser);

		createQueryTest()//
			.add("SELECT stock.articleNumber")
			.add("FROM Stock AS stock")
			.add("WHERE EXISTS (SELECT 1 AS one)")
			.assertGeneratedSelect(
				new StringBuilder()//
					.append("SELECT stock.articleNumber AS articleNumber ")
					.append("FROM db.stock AS stock ")
					.append("WHERE EXISTS (SELECT 1 AS one)")
					.toString());
	}
}
