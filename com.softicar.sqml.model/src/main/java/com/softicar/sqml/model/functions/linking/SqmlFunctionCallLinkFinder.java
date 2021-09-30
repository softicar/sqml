package com.softicar.sqml.model.functions.linking;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.softicar.sqml.model.builtin.functions.SqmlBuiltInFunctions;
import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.functions.FunctionsPackage;
import com.softicar.sqml.model.functions.ISqmlFunction;
import com.softicar.sqml.model.functions.ISqmlFunctionCall;
import com.softicar.sqml.model.utils.SqmlNavigation;
import com.softicar.sqml.model.utils.scoping.ISqmlFileScopeProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

public class SqmlFunctionCallLinkFinder implements ISqmlFunctionCallLinkFinder {

	private static final EReference FUNCTION_REFERENCE = FunctionsPackage.eINSTANCE.getSqmlFunctionCall_Function();
	private final ISqmlFileScopeProvider fileScopeProvider;
	private boolean includeSimilarName;
	private boolean includeInvisible;
	private boolean includeArgumentMismatch;
	private ISqmlFunctionCall functionCall;
	private QualifiedName functionName;
	private ISqmlFile callingFile;
	private SqmlFunctionCallLinkHelper linkHelper;

	public SqmlFunctionCallLinkFinder(ISqmlFileScopeProvider fileScopeProvider) {

		this.fileScopeProvider = fileScopeProvider;
		this.includeSimilarName = false;
		this.includeInvisible = false;
		this.includeArgumentMismatch = false;
	}

	@Override
	public ISqmlFunctionCallLinkFinder setIncludeFunctionsWithSimilarName(boolean includeSimilarName) {

		this.includeSimilarName = includeSimilarName;
		return this;
	}

	@Override
	public ISqmlFunctionCallLinkFinder setIncludeInvisibleFunctions(boolean includeInvisible) {

		this.includeInvisible = includeInvisible;
		return this;
	}

	@Override
	public ISqmlFunctionCallLinkFinder setIncludeFunctionsWithMismatchingArguments(boolean includeArgumentMismatch) {

		this.includeArgumentMismatch = includeArgumentMismatch;
		return this;
	}

	@Override
	public SqmlFunctionCallLinks findLinks(ISqmlFunctionCall functionCall) {

		this.functionCall = functionCall;
		this.functionName = functionCall.getFunctionName();
		this.callingFile = SqmlNavigation.findOrThrow(ISqmlFile.class, functionCall);
		this.linkHelper = new SqmlFunctionCallLinkHelper(functionCall);

		SqmlFunctionCallLinks links = new SqmlFunctionCallLinks();

		if (functionCall.isWellDefined()) {
			collectLinks(links);
		}

		return links;
	}

	private void collectLinks(SqmlFunctionCallLinks links) {

		// add built-in functions
		if (functionName.getSegmentCount() == 1) {
			String simpleName = functionName.getFirstSegment();
			for (ISqmlFunction function: SqmlBuiltInFunctions.get().findFunctionsByName(simpleName)) {
				boolean success = addLink(links, function);
				if (success) {
					return;
				}
			}
		}

		// add functions from global scope
		for (IEObjectDescription objectDescription: getGlobalElements()) {
			EObject object = objectDescription.getEObjectOrProxy();
			if (object instanceof ISqmlFunction) {
				addLink(links, resolveFunction(object));
			}
		}

		// add local functions
		for (ISqmlFunction function: callingFile.getFunctions()) {
			addLink(links, function);
		}
	}

	private Iterable<IEObjectDescription> getGlobalElements() {

		if (functionName.getSegmentCount() > 1) {
			return getGlobalScope(Predicates.alwaysTrue()).getElements(functionName);
		} else if (includeSimilarName) {
			return getGlobalScope(d -> SqmlFunctionNames.isSimilarName(functionCall, d)).getAllElements();
		} else if (includeInvisible) {
			return getGlobalScope(d -> SqmlFunctionNames.isMatchingName(functionCall, d)).getAllElements();
		} else {
			return Iterables.concat(getLanguageScopeElements(), getImportScopeElements(), getPackageScopeElements());
		}
	}

	private IScope getGlobalScope(Predicate<IEObjectDescription> predicate) {

		return fileScopeProvider.getGlobalScope(callingFile, FUNCTION_REFERENCE, predicate);
	}

	private Iterable<IEObjectDescription> getLanguageScopeElements() {

		return fileScopeProvider.getLanguageScope(callingFile, FUNCTION_REFERENCE).getElements(functionName);
	}

	private Iterable<IEObjectDescription> getImportScopeElements() {

		return fileScopeProvider.getImportScope(callingFile, FUNCTION_REFERENCE).getElements(functionName);
	}

	private Iterable<IEObjectDescription> getPackageScopeElements() {

		return fileScopeProvider.getPackageScope(callingFile, FUNCTION_REFERENCE).getElements(functionName);
	}

	private boolean addLink(SqmlFunctionCallLinks links, ISqmlFunction function) {

		SqmlFunctionCallLink link = new SqmlFunctionCallLink(functionCall, function, linkHelper);
		if ((link.isMatchingName() || includeSimilarName) //
				&& (link.isVisible() || includeInvisible) //
				&& (link.isMatchingArguments() || includeArgumentMismatch)) {
			links.add(link);
			return true;
		} else {
			return false;
		}
	}

	private ISqmlFunction resolveFunction(EObject object) {

		if (object.eIsProxy()) {
			return (ISqmlFunction) EcoreUtil.resolve(object, callingFile);
		} else {
			return (ISqmlFunction) object;
		}
	}
}
