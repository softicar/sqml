package com.softicar.sqml.model.utils.scoping;

import com.google.common.base.Predicate;
import com.google.inject.Inject;
import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.utils.SqmlNavigation;
import com.softicar.sqml.model.utils.SqmlQualifiedPhysicalTableNameDescriptionFilter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

public class SqmlFileScopeProvider implements ISqmlFileScopeProvider {

	private final ISqmlScopeProvider globalScopeProvider;

	@Inject
	public SqmlFileScopeProvider(ISqmlScopeProvider globalScopeProvider) {

		this.globalScopeProvider = globalScopeProvider;
	}

	@Override
	public IScope getImportScope(ISqmlFile sqmlFile, EReference reference) {

		IScope globalScope = getGlobalScope(sqmlFile, reference, new SqmlImportScopeFilter(sqmlFile));
		return new SqmlImportScope(sqmlFile, globalScope);
	}

	@Override
	public IScope getPackageScope(ISqmlFile sqmlFile, EReference reference) {

		QualifiedName packageName = sqmlFile.getPackageName();
		if (packageName != null) {
			IScope globalScope = getGlobalScope(sqmlFile, reference, new SqmlPackageScopeFilter(packageName));
			return new SqmlPackageScope(globalScope, packageName);
		} else {
			return IScope.NULLSCOPE;
		}
	}

	@Override
	public IScope getLanguageScope(ISqmlFile sqmlFile, EReference reference) {

		IScope globalScope = getGlobalScope(sqmlFile, reference);
		return new SqmlLanguageScope(globalScope);
	}

	@Override
	public IScope getGlobalScope(ISqmlFile sqmlFile, EReference reference) {

		return getGlobalScope(sqmlFile, reference, new SqmlQualifiedPhysicalTableNameDescriptionFilter());
	}

	@Override
	public IScope getGlobalScope(ISqmlFile sqmlFile, EReference reference, Predicate<IEObjectDescription> filter) {

		Resource resource = SqmlNavigation.getResource(sqmlFile);
		return globalScopeProvider.getGlobalScope(resource, reference, filter);
	}
}
