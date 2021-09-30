package com.softicar.sqml.model.simple;

import com.softicar.sqml.model.types.ISqmlTypeDefinition;
import com.softicar.sqml.model.types.impl.SqmlTypeReferenceImpl;

public class SqmlSimpleTypeReference extends SqmlTypeReferenceImpl {

	public SqmlSimpleTypeReference(ISqmlTypeDefinition typeDefinition) {

		setTypeDefinition(typeDefinition);
	}
}
