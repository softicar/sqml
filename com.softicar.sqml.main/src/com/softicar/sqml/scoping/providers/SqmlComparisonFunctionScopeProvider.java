package com.softicar.sqml.scoping.providers;

import com.google.inject.Inject;
import com.softicar.sqml.model.conditions.ConditionsPackage;
import com.softicar.sqml.model.functions.linking.ISqmlFunctionCallLinkFinderProvider;
import org.eclipse.emf.ecore.EReference;

public class SqmlComparisonFunctionScopeProvider extends SqmlFunctionCallFunctionScopeProvider {

	@Inject
	public SqmlComparisonFunctionScopeProvider(ISqmlFunctionCallLinkFinderProvider finderProvider) {

		super(finderProvider);
	}

	@Override
	public EReference getReference() {

		return ConditionsPackage.eINSTANCE.getSqmlComparison_Function();
	}
}
