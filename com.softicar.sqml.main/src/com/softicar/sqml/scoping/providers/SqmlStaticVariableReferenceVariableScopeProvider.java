package com.softicar.sqml.scoping.providers;

import com.softicar.sqml.model.expressions.ExpressionsPackage;
import com.softicar.sqml.model.functions.ISqmlFunction;
import com.softicar.sqml.model.queries.ISqmlQuery;
import com.softicar.sqml.model.utils.SqmlNavigation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;

public class SqmlStaticVariableReferenceVariableScopeProvider extends AbstractSqmlReferenceScopeProvider {

	@Override
	public EReference getReference() {

		return ExpressionsPackage.eINSTANCE.getSqmlStaticVariableReference_Variable();
	}

	@Override
	public IScope getScope(EObject context) {

		ISqmlQuery query = SqmlNavigation.find(ISqmlQuery.class, context);
		if (query != null) {
			return Scopes.scopeFor(query.getParameters());
		}

		ISqmlFunction function = SqmlNavigation.find(ISqmlFunction.class, context);
		if (function != null) {
			return Scopes.scopeFor(function.getParameters());
		}

		throw new IllegalArgumentException(String.format("Parameter reference is neither part of a query nor part of a function."));
	}
}
