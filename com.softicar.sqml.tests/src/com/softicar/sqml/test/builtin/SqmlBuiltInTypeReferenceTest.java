package com.softicar.sqml.test.builtin;

import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.simple.SqmlSimpleTypeReference;
import com.softicar.sqml.model.types.ISqmlTypeDefinition;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlBuiltInTypeReferenceTest extends AbstractSqmlTest {

	@Test
	public void getSqmlType() {

		ISqmlTypeDefinition typeDefinition = SqmlBuiltInTypes.getIntegerType();
		SqmlSimpleTypeReference typeReference = new SqmlSimpleTypeReference(typeDefinition);

		assertSame(typeDefinition, typeReference.getTypeDefinition());
		assertSame(typeDefinition, typeReference.getSqmlType());
	}
}
