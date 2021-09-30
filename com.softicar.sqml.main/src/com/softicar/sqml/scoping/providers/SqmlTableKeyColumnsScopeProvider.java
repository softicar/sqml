package com.softicar.sqml.scoping.providers;

import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.TablesPackage;
import com.softicar.sqml.model.utils.SqmlNavigation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;

public class SqmlTableKeyColumnsScopeProvider extends AbstractSqmlReferenceScopeProvider {

	@Override
	public EReference getReference() {

		return TablesPackage.eINSTANCE.getSqmlTableKey_Columns();
	}

	@Override
	public IScope getScope(EObject context) {

		ISqmlTable table = SqmlNavigation.find(ISqmlTable.class, context);
		if (table != null) {
			return Scopes.scopeFor(table.getColumns());
		} else {
			return IScope.NULLSCOPE;
		}
	}
}
