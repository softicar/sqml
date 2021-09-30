package com.softicar.sqml.test.expressions;

import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlTestCases;
import org.junit.Test;

public class SqmlCastTest extends AbstractSqmlTest {

	@Test
	public void testToString() {

		parser.loadLanguagePackage();
		SqmlTestCases.loadDeliveryTestCase(parser);

		createQueryTest()//
			.add("SELECT toString(i.id) + 'hi' AS x")
			.add("FROM Item i")
			.assertGeneratedSelect("SELECT CONCAT(CAST(i.id AS CHAR), 'hi') AS x FROM db.item AS i");
	}

	@Test
	public void testToInteger() {

		parser.loadLanguagePackage();

		createQueryTest()//
			.add("SELECT 1 + toInteger(2L) + toInteger('3') AS x")
			.assertGeneratedSelect("SELECT 1 + 2 + CAST('3' AS SIGNED) AS x");
	}
}
