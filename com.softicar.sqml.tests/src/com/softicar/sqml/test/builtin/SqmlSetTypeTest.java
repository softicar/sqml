package com.softicar.sqml.test.builtin;

import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.builtin.SqmlSetType;
import org.junit.Assert;
import org.junit.Test;

public class SqmlSetTypeTest extends Assert {

	private static SqmlSetType SET_TYPE = SqmlBuiltInTypes.getSetType();

	@Test
	public void isCollection() {

		assertTrue(SET_TYPE.isCollection());
	}

	@Test
	public void isAssignableToCollection() {

		assertTrue(SET_TYPE.isAssignableTo(SqmlBuiltInTypes.getCollectionType()));
		assertFalse(SET_TYPE.isAssignableTo(SqmlBuiltInTypes.getListType()));
		assertTrue(SET_TYPE.isAssignableTo(SqmlBuiltInTypes.getSetType()));
	}
}
