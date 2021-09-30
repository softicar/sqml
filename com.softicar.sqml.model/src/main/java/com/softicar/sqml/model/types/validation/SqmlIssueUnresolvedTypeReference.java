package com.softicar.sqml.model.types.validation;

import com.softicar.sqml.model.types.ISqmlTypeReference;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import com.softicar.sqml.model.validation.ISqmlIssueAcceptor;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueUnresolvedTypeReference extends AbstractSqmlError<ISqmlTypeReference> {

	public SqmlIssueUnresolvedTypeReference(ISqmlTypeReference typeReference) {

		super(typeReference);
	}

	public static void validate(ISqmlTypeReference typeReference, ISqmlIssueAcceptor acceptor) {

		if (typeReference.getTypeDefinition().eIsProxy()) {
			acceptor.accept(new SqmlIssueUnresolvedTypeReference(typeReference));
		}
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		// mark the complete expression
		return null;
	}

	@Override
	public String getMessage() {

		// TODO: add referenced type name to message
		return String.format("Unresolved type reference.");
	}
}
