package com.softicar.sqml.test.expressions;

import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Before;
import org.junit.Test;

public class SqmlPrecedenceTest extends AbstractSqmlTest {

	@Before
	public void before() {

		parser.loadLanguagePackage();
	}

	@Test
	public void simple() {

		createQueryTest()//
			.addAll("SELECT 1 + 3 * 5 AS foo")
			.assertGeneratedSelect("SELECT 1 + 3 * 5 AS foo");
	}

	@Test
	public void withParentheses() {

		createQueryTest()//
			.addAll("SELECT (1 + 3) * 5 AS foo")
			.assertGeneratedSelect("SELECT (1 + 3) * 5 AS foo");
	}
}
