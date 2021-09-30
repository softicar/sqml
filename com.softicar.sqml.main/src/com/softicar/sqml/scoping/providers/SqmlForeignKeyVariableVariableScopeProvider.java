package com.softicar.sqml.scoping.providers;

import com.softicar.sqml.model.selects.ISqmlSelect;
import com.softicar.sqml.model.selects.SelectsPackage;
import com.softicar.sqml.model.utils.SqmlNavigation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;

public class SqmlForeignKeyVariableVariableScopeProvider extends AbstractSqmlReferenceScopeProvider {

	@Override
	public EReference getReference() {

		return SelectsPackage.eINSTANCE.getSqmlForeignKeyVariable_Variable();
	}

	@Override
	public IScope getScope(EObject context) {

		ISqmlSelect select = SqmlNavigation.find(ISqmlSelect.class, context);
		if (select != null) {
			return Scopes.scopeFor(select.getVariables());
		} else {
			return IScope.NULLSCOPE;
		}
	}
}
