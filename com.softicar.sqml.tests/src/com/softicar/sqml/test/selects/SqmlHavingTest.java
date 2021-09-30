package com.softicar.sqml.test.selects;

import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlTestCases;
import org.junit.Test;

public class SqmlHavingTest extends AbstractSqmlTest {

	@Test
	public void testSelectColumnReference() {

		parser.loadLanguagePackage();
		SqmlTestCases.loadStockTestCase(parser);

		createQueryTest()
			.add("SELECT sum(s.quantity) AS sum")
			.add("FROM Stock s")
			.add("GROUP BY s.articleNumber")
			.add("HAVING sum > 100")
			.assertGeneratedSelect("SELECT SUM(s.quantity) AS `sum` FROM db.stock AS s GROUP BY s.articleNumber HAVING `sum` > 100");
	}
}
