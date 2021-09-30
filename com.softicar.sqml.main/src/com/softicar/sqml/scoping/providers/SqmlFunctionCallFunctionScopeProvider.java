package com.softicar.sqml.scoping.providers;

import com.google.inject.Inject;
import com.softicar.sqml.model.functions.FunctionsPackage;
import com.softicar.sqml.model.functions.ISqmlFunctionCall;
import com.softicar.sqml.model.functions.linking.ISqmlFunctionCallLinkFinderProvider;
import com.softicar.sqml.model.functions.linking.SqmlFunctionCallLink;
import com.softicar.sqml.model.functions.linking.SqmlFunctionCallLinks;
import com.softicar.sqml.scoping.SqmlLazyScope;
import com.softicar.sqml.scoping.SqmlScopeStack;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;

public class SqmlFunctionCallFunctionScopeProvider extends AbstractSqmlReferenceScopeProvider {

	private final ISqmlFunctionCallLinkFinderProvider finderProvider;

	@Inject
	public SqmlFunctionCallFunctionScopeProvider(ISqmlFunctionCallLinkFinderProvider finderProvider) {

		this.finderProvider = finderProvider;
	}

	@Override
	public EReference getReference() {

		return FunctionsPackage.eINSTANCE.getSqmlFunctionCall_Function();
	}

	@Override
	public IScope getScope(EObject context) {

		if (context instanceof ISqmlFunctionCall) {
			ISqmlFunctionCall functionCall = (ISqmlFunctionCall) context;

			SqmlScopeStack scopeStack = new SqmlScopeStack();
			scopeStack.push(new SqmlLazyScope(() -> getSimilarNameScope(functionCall)));
			scopeStack.push(getMatchingNameScope(functionCall));
			return scopeStack;
		} else {
			return getImportScope(context, getReference());
		}
	}

	private IScope getMatchingNameScope(ISqmlFunctionCall functionCall) {

		List<SqmlFunctionCallLink> links = finderProvider//
				.getFinder()
				.findLinks(functionCall)
				.getSortedList();
		return Scopes.scopeFor(SqmlFunctionCallLinks.toFunctions(links));
	}

	private IScope getSimilarNameScope(ISqmlFunctionCall functionCall) {

		List<SqmlFunctionCallLink> links = finderProvider//
				.getFinder()
				.setIncludeFunctionsWithSimilarName(true)
				.setIncludeInvisibleFunctions(true)
				.findLinks(functionCall)
				.getSortedList();
		return Scopes.scopeFor(SqmlFunctionCallLinks.toFunctions(links));
	}
}
