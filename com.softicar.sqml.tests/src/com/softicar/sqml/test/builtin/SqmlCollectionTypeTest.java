package com.softicar.sqml.test.builtin;

import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.builtin.SqmlCollectionType;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlCollectionTypeTest extends AbstractSqmlTest {

	private static SqmlCollectionType COLLECTION_TYPE = SqmlBuiltInTypes.getCollectionType();

	@Test
	public void isCollection() {

		assertTrue(COLLECTION_TYPE.isCollection());
	}

	@Test
	public void isAssignableToCollection() {

		assertTrue(COLLECTION_TYPE.isAssignableTo(SqmlBuiltInTypes.getCollectionType()));
		assertFalse(COLLECTION_TYPE.isAssignableTo(SqmlBuiltInTypes.getListType()));
		assertFalse(COLLECTION_TYPE.isAssignableTo(SqmlBuiltInTypes.getSetType()));
	}
}
