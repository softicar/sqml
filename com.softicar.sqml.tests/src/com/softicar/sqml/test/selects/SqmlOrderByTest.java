package com.softicar.sqml.test.selects;

import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlTestCases;
import org.junit.Test;

public class SqmlOrderByTest extends AbstractSqmlTest {

	@Test
	public void testSelectColumnReference() {

		parser.loadLanguagePackage();
		SqmlTestCases.loadStockTestCase(parser);

		createQueryTest()//
			.add("SELECT sum(s.quantity) AS sum")
			.add("FROM Stock s")
			.add("GROUP BY s.articleNumber")
			.add("ORDER BY sum")
			.assertGeneratedSelect("SELECT SUM(s.quantity) AS `sum` FROM db.stock AS s GROUP BY s.articleNumber ORDER BY `sum`");
	}
}
