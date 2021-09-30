package com.softicar.sqml.test.expressions;

import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlTestCases;
import org.junit.Test;

public class SqmlGroupConcatTest extends AbstractSqmlTest {

	@Test
	public void groupConcat() {

		SqmlTestCases.loadDeliveryTestCase(parser);
		createQueryTest()
			.add("SELECT")
			.add("GROUP_CONCAT(DISTINCT i.id ORDER BY i.id SEPARATOR '/') AS x")
			.add("FROM Item i")
			.add("GROUP BY i.id")
			.assertGeneratedSelect("SELECT GROUP_CONCAT(DISTINCT i.id ORDER BY i.id SEPARATOR '/') AS x FROM db.item AS i GROUP BY i.id");
	}
}
