package com.softicar.sqml.scoping.providers;

import com.google.inject.Inject;
import com.softicar.sqml.model.expressions.ExpressionsPackage;
import com.softicar.sqml.model.functions.linking.ISqmlFunctionCallLinkFinderProvider;
import org.eclipse.emf.ecore.EReference;

public class SqmlBinaryOperationFunctionScopeProvider extends SqmlFunctionCallFunctionScopeProvider {

	@Inject
	public SqmlBinaryOperationFunctionScopeProvider(ISqmlFunctionCallLinkFinderProvider finderProvider) {

		super(finderProvider);
	}

	@Override
	public EReference getReference() {

		return ExpressionsPackage.eINSTANCE.getAbstractSqmlBinaryOperation_Function();
	}
}
