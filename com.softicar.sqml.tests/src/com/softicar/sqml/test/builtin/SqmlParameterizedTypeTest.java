package com.softicar.sqml.test.builtin;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import com.softicar.sqml.model.builtin.ISqmlGenericType;
import com.softicar.sqml.model.builtin.ISqmlParameterizedType;
import com.softicar.sqml.model.builtin.SqmlGenericType;
import com.softicar.sqml.model.builtin.SqmlParameterizedType;
import com.softicar.sqml.model.builtin.SqmlTypeList;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.utils.ISqmlJavaType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SqmlParameterizedTypeTest extends Assert {

	private RawType rawType1;
	private RawType rawType2;
	private ISqmlType typeA;
	private ISqmlType typeB;

	@Before
	public void before() {

		this.rawType1 = new RawType();
		this.rawType2 = new RawType();
		this.typeA = mock(ISqmlType.class);
		this.typeB = mock(ISqmlType.class);

		when(typeA.is(typeA)).thenReturn(true);
		when(typeB.is(typeB)).thenReturn(true);
	}

	@Test
	public void is() {

		assertTrue(make(rawType1).is(make(rawType1)));
		assertTrue(make(rawType1, typeA).is(make(rawType1, typeA)));
		assertTrue(make(rawType1, typeA, typeB).is(make(rawType1, typeA, typeB)));

		assertFalse(make(rawType1, typeA).is(make(rawType1)));
		assertFalse(make(rawType1, typeA).is(make(rawType1, typeB)));
		assertFalse(make(rawType1, typeA, typeB).is(make(rawType1, typeA)));
		assertFalse(make(rawType1, typeA, typeB).is(make(rawType1, typeB, typeA)));
	}

	@Test
	public void isAssignableTo() {

		rawType1.setAssignableTo(rawType2);

		assertTrue(make(rawType1).isAssignableTo(make(rawType2)));
		assertFalse(make(rawType2).isAssignableTo(make(rawType1)));

		assertTrue(make(rawType1, typeA).isAssignableTo(make(rawType2, typeA)));
		assertFalse(make(rawType2, typeA).isAssignableTo(make(rawType1, typeA)));

		assertFalse(make(rawType1, typeA).isAssignableTo(make(rawType2, typeB)));
		assertFalse(make(rawType2, typeA).isAssignableTo(make(rawType1, typeB)));
	}

	@Test
	public void isCollection() {

		rawType1.setCollection(false);
		assertFalse(make(rawType1, typeA).isCollection());

		rawType1.setCollection(true);
		assertTrue(make(rawType1, typeA).isCollection());
	}

	private class RawType extends SqmlGenericType {

		private boolean collection = false;
		private ISqmlType assignableToType = null;

		public RawType() {

			super("TestType", null);
		}

		public void setCollection(boolean collection) {

			this.collection = collection;
		}

		public void setAssignableTo(ISqmlType targetType) {

			assignableToType = targetType;
		}

		@Override
		public boolean isAssignableTo(ISqmlType targetType) {

			return is(targetType) || targetType.is(assignableToType);
		}

		@Override
		public boolean isCollection() {

			return collection;
		}

		@Override
		public ISqmlJavaType getJavaType() {

			return null;
		}
	}

	private ISqmlParameterizedType make(ISqmlGenericType genericType, ISqmlType...typeParameters) {

		return new SqmlParameterizedType(genericType, new SqmlTypeList(typeParameters));
	}
}
