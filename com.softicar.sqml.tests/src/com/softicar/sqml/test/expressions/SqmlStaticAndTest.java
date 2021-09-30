package com.softicar.sqml.test.expressions;

import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlStaticAndTest extends AbstractSqmlTest {

	@Test
	public void test() {

		createQueryTest()
			.add("Boolean flag1")
			.add("Boolean flag2")
			.add("SELECT STATIC IF $flag1 AND NOT $flag2 {1} ELSE {2} AS x")
			.assertGeneratedSelect("SELECT 2 AS x", true, true)
			.assertGeneratedSelect("SELECT 2 AS x", false, true)
			.assertGeneratedSelect("SELECT 1 AS x", true, false)
			.assertGeneratedSelect("SELECT 2 AS x", false, false);
	}
}
