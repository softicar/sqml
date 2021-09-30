package com.softicar.sqml.test.types;

import com.softicar.sqml.model.builtin.ISqmlParameterizedType;
import com.softicar.sqml.model.builtin.SqmlIntegerType;
import com.softicar.sqml.model.builtin.SqmlSetType;
import com.softicar.sqml.model.builtin.SqmlStringType;
import com.softicar.sqml.model.builtin.SqmlTupleType;
import org.junit.Assert;
import org.junit.Test;

public class SqmlTupleTest extends Assert {

	private final SqmlTupleType tupleType;
	private final SqmlIntegerType integerType;
	private final ISqmlParameterizedType integerSet;

	public SqmlTupleTest() {

		this.tupleType = SqmlTupleType.get();
		this.integerType = SqmlIntegerType.get();
		this.integerSet = SqmlSetType.get().parameterize(integerType);
	}

	@Test
	public void compatibleTupleIsAssignableToSet() {

		assertTrue(tupleType.parameterize().isAssignableTo(integerSet));
		assertTrue(tupleType.parameterize(integerType).isAssignableTo(integerSet));
		assertTrue(tupleType.parameterize(integerType, integerType).isAssignableTo(integerSet));
	}

	@Test
	public void incompatibleTupleIsNotAssignableToSet() {

		SqmlStringType stringType = SqmlStringType.get();
		assertFalse(tupleType.parameterize(stringType).isAssignableTo(integerSet));
		assertFalse(tupleType.parameterize(integerType, stringType).isAssignableTo(integerSet));
	}
}
