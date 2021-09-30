package com.softicar.sqml.scoping.providers;

import com.google.inject.Inject;
import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.utils.SqmlNavigation;
import com.softicar.sqml.model.utils.scoping.ISqmlFileScopeProvider;
import com.softicar.sqml.scoping.SqmlScopeStack;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;

public abstract class AbstractSqmlReferenceScopeProvider implements ISqmlReferenceScopeProvider {

	@Inject private ISqmlFileScopeProvider fileScopeProvider;

	protected IScope getGlobalScope(EObject object, EReference reference) {

		ISqmlFile sqmlFile = SqmlNavigation.findOrThrow(ISqmlFile.class, object);
		return fileScopeProvider.getGlobalScope(sqmlFile, reference);
	}

	protected IScope getImportScope(EObject object, EReference reference) {

		ISqmlFile sqmlFile = SqmlNavigation.findOrThrow(ISqmlFile.class, object);

		SqmlScopeStack scopeStack = new SqmlScopeStack();
		scopeStack.push(fileScopeProvider.getGlobalScope(sqmlFile, reference));
		scopeStack.push(fileScopeProvider.getPackageScope(sqmlFile, reference));
		scopeStack.push(fileScopeProvider.getImportScope(sqmlFile, reference));
		return scopeStack;
	}
}
