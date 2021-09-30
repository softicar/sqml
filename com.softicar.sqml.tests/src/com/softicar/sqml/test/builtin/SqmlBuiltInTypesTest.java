package com.softicar.sqml.test.builtin;

import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlBuiltInTypesTest extends AbstractSqmlTest {

	@Test
	public void testFieldTypes() {

		testFieldType(SqlFieldType.BOOLEAN, BOOLEAN);
		testFieldType(SqlFieldType.INTEGER, INTEGER);
		testFieldType(SqlFieldType.LONG, LONG);
		testFieldType(SqlFieldType.FLOAT, FLOAT);
		testFieldType(SqlFieldType.DOUBLE, DOUBLE);
		testFieldType(SqlFieldType.BIG_DECIMAL, DECIMAL);
		testFieldType(SqlFieldType.STRING, STRING);
		testFieldType(SqlFieldType.BYTE_ARRAY, BLOB);
		testFieldType(SqlFieldType.DAY, DAY);
		testFieldType(SqlFieldType.DAY_TIME, DAY_TIME);
	}

	private void testFieldType(SqlFieldType expectedFieldType, ISqmlType primitiveType) {

		assertSame(expectedFieldType, primitiveType.getFieldType());
		assertEquals(expectedFieldType.getJavaClass().getCanonicalName(), primitiveType.getJavaType().getCanonicalName());
	}

	@Test
	public void testIsSame() {

		testIsSame(BLOB, BLOB);
		testIsSame(BOOLEAN, BOOLEAN);
		testIsSame(DAY, DAY);
		testIsSame(DAY_TIME, DAY_TIME);
		testIsSame(DECIMAL, DECIMAL);
		testIsSame(DOUBLE, DOUBLE);
		testIsSame(FLOAT, FLOAT);
		testIsSame(INTEGER, INTEGER);
		testIsSame(LONG, LONG);
		testIsSame(STRING, STRING);
	}

	private void testIsSame(ISqmlType typeA, ISqmlType typeB) {

		assertTrue(typeA.is(typeA));
		assertTrue(typeB.is(typeB));
	}

	@Test
	public void isAssignableToItself() {

		isAssignableTo(BLOB, BLOB);
		isAssignableTo(BOOLEAN, BOOLEAN);
		isAssignableTo(DAY, DAY);
		isAssignableTo(DAY_TIME, DAY_TIME);
		isAssignableTo(DECIMAL, DECIMAL);
		isAssignableTo(DOUBLE, DOUBLE);
		isAssignableTo(FLOAT, FLOAT);
		isAssignableTo(INTEGER, INTEGER);
		isAssignableTo(LONG, LONG);
		isAssignableTo(STRING, STRING);
	}

	private void isAssignableTo(ISqmlType sourceType, ISqmlType targetType) {

		assertTrue(sourceType.isAssignableTo(targetType));
	}
}
