package com.softicar.sqml.test.builtin;

import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Before;
import org.junit.Test;

public class SqmlMathTest extends AbstractSqmlTest {

	@Before
	public void before() {

		parser.loadLanguagePackage();
	}

	@Test
	public void testAbs() {

		createQueryTest()
			.add("SELECT")
			.add("abs(5) AS i,")
			.add("abs(6L) AS l,")
			.add("abs(1.2f) AS f,")
			.add("abs(2.3d) AS d,")
			.add("abs(3.4) AS m")
			.assertGeneratedSelect("SELECT ABS(5) AS i, ABS(6) AS l, ABS(1.2) AS f, ABS(2.3) AS d, ABS(3.4) AS m");
	}

	@Test
	public void testCeil() {

		createQueryTest()
			.add("SELECT")
			.add("ceil(1.2f) AS f,")
			.add("ceil(2.3d) AS d,")
			.add("ceil(3.4) AS m")
			.assertGeneratedSelect("SELECT CEIL(1.2) AS f, CEIL(2.3) AS d, CEIL(3.4) AS m");
	}

	@Test
	public void testFloor() {

		createQueryTest()
			.add("SELECT")
			.add("floor(1.2f) AS f,")
			.add("floor(2.3d) AS d,")
			.add("floor(3.4) AS m")
			.assertGeneratedSelect("SELECT FLOOR(1.2) AS f, FLOOR(2.3) AS d, FLOOR(3.4) AS m");
	}

	@Test
	public void testRound() {

		createQueryTest()
			.add("SELECT")
			.add("round(1.2f) AS f,")
			.add("round(2.3d) AS d,")
			.add("round(3.4) AS m")
			.assertGeneratedSelect("SELECT ROUND(1.2) AS f, ROUND(2.3) AS d, ROUND(3.4) AS m");

		createQueryTest()
			.add("SELECT")
			.add("round(1.2f, 1) AS f,")
			.add("round(2.3d, 2) AS d,")
			.add("round(3.4, 3) AS m")
			.assertGeneratedSelect("SELECT ROUND(1.2, 1) AS f, ROUND(2.3, 2) AS d, ROUND(3.4, 3) AS m");
	}

	@Test
	public void testTruncate() {

		createQueryTest()
			.add("SELECT")
			.add("truncate(1.2f, 1) AS f,")
			.add("truncate(2.3d, 2) AS d,")
			.add("truncate(3.4, 3) AS m")
			.assertGeneratedSelect("SELECT TRUNCATE(1.2, 1) AS f, TRUNCATE(2.3, 2) AS d, TRUNCATE(3.4, 3) AS m");
	}
}
