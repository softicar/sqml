package com.softicar.sqml.model.simple;

import com.softicar.sqml.model.functions.impl.SqmlFunctionParameterImpl;
import com.softicar.sqml.model.types.ISqmlTypeDefinition;

public class SqmlSimpleFunctionParameter extends SqmlFunctionParameterImpl {

	public SqmlSimpleFunctionParameter(String name, ISqmlTypeDefinition typeDefinition) {

		if (name == null) {
			throw new IllegalArgumentException("Name of function parameter may not be null.");
		}

		if (typeDefinition == null) {
			throw new IllegalArgumentException("Type of function parameter may not be null.");
		}

		setName(name);
		setTypeReference(new SqmlSimpleTypeReference(typeDefinition));
	}
}
