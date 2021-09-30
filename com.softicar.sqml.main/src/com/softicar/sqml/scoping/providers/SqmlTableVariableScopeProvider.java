package com.softicar.sqml.scoping.providers;

import com.softicar.sqml.model.selects.SelectsPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;

public class SqmlTableVariableScopeProvider extends AbstractSqmlReferenceScopeProvider {

	@Override
	public EReference getReference() {

		return SelectsPackage.eINSTANCE.getSqmlTableVariable_Table();
	}

	@Override
	public IScope getScope(EObject context) {

		return getImportScope(context, getReference());
	}
}
