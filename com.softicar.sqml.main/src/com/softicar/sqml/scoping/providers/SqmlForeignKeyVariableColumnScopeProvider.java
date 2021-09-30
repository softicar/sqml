package com.softicar.sqml.scoping.providers;

import com.softicar.sqml.model.selects.ISqmlForeignKeyVariable;
import com.softicar.sqml.model.selects.ISqmlVariable;
import com.softicar.sqml.model.selects.SelectsPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;

public class SqmlForeignKeyVariableColumnScopeProvider extends AbstractSqmlReferenceScopeProvider {

	@Override
	public EReference getReference() {

		return SelectsPackage.eINSTANCE.getSqmlForeignKeyVariable_Column();
	}

	@Override
	public IScope getScope(EObject context) {

		if (context instanceof ISqmlForeignKeyVariable) {
			ISqmlForeignKeyVariable variable = (ISqmlForeignKeyVariable) context;
			ISqmlVariable foreignVariable = variable.getVariable();
			if (foreignVariable != null && foreignVariable.getTabular() != null) {
				return Scopes.scopeFor(foreignVariable.getTabular().getColumns());
			} else {
				return IScope.NULLSCOPE;
			}
		} else {
			return IScope.NULLSCOPE;
		}
	}
}
