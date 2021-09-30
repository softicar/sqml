package com.softicar.sqml.model;

import org.eclipse.emf.ecore.EObject;

public interface ISqmlModelElement extends EObject {

	void accept(ISqmlModelVisitor visitor);
}
