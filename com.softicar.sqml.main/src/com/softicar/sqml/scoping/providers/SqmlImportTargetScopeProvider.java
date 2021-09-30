package com.softicar.sqml.scoping.providers;

import com.softicar.sqml.model.files.FilesPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;

public class SqmlImportTargetScopeProvider extends AbstractSqmlReferenceScopeProvider {

	@Override
	public EReference getReference() {

		return FilesPackage.eINSTANCE.getSqmlImport_Target();
	}

	@Override
	public IScope getScope(EObject context) {

		return getGlobalScope(context, getReference());
	}
}
