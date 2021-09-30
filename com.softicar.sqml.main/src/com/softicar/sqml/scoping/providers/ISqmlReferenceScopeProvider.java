package com.softicar.sqml.scoping.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;

public interface ISqmlReferenceScopeProvider {

	EReference getReference();

	IScope getScope(EObject context);
}
