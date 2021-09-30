package com.softicar.sqml.test.expressions;

import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlStaticIfTest extends AbstractSqmlTest {

	@Test
	public void testMissingElse() {

		createQueryTest()//
			.add("Boolean flag")
			.add("SELECT STATIC IF $flag {1} AS x")
			.assertGeneratedSelect("SELECT 1 AS x", true)
			.assertGeneratedSelect("SELECT NULL AS x", false);
	}

	@Test
	public void testSqmlType() {

		ISqmlExpression expression = createQueryTest()//
			.add("Boolean flag")
			.add("SELECT STATIC IF $flag {1} ELSE {2} AS x")
			.getSelect()
			.getColumn("x")
			.getExpression();

		ISqmlType sqmlType = expression.getSqmlType();
		assertNotNull(sqmlType);
		assertTrue(sqmlType.is(SqmlBuiltInTypes.getIntegerType()));
	}
}
