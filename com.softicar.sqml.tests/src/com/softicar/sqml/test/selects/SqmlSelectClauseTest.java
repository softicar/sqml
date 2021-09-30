package com.softicar.sqml.test.selects;

import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlSelectClauseTest extends AbstractSqmlTest {

	@Test
	public void testInactiveColumns() {

		createQueryTest()
			.add("Boolean flag")
			.add("#IF $flag { SELECT 1 AS x }")
			.add("SELECT 2 AS y")
			.assertJava("if(parameters.flag) {")
			.assertJava("    SELECT(X_COLUMN);")
			.assertJava("}")
			.assertJava("SELECT(Y_COLUMN);");
	}
}
