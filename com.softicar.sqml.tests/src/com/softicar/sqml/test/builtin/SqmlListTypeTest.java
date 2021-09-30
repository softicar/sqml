package com.softicar.sqml.test.builtin;

import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.builtin.SqmlListType;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlListTypeTest extends AbstractSqmlTest {

	private static SqmlListType LIST_TYPE = SqmlBuiltInTypes.getListType();

	@Test
	public void isCollection() {

		assertTrue(LIST_TYPE.isCollection());
	}

	@Test
	public void isAssignableToCollection() {

		assertTrue(LIST_TYPE.isAssignableTo(SqmlBuiltInTypes.getCollectionType()));
		assertTrue(LIST_TYPE.isAssignableTo(SqmlBuiltInTypes.getListType()));
		assertFalse(LIST_TYPE.isAssignableTo(SqmlBuiltInTypes.getSetType()));
	}
}
