package com.softicar.sqml.validation;

import com.google.common.base.Predicate;
import com.google.inject.Injector;
import com.softicar.platform.common.core.java.packages.name.JavaPackageName;
import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.validation.ISqmlIssue;
import com.softicar.sqml.model.validation.ISqmlIssueAcceptor;
import com.softicar.sqml.model.validation.ISqmlValidationConfiguration;
import com.softicar.sqml.model.validation.ISqmlValidationContext;
import com.softicar.sqml.model.validation.SqmlIssueAcceptor;
import com.softicar.sqml.utils.ExpectedPackageNameDeterminer;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

public class SqmlValidationContext implements ISqmlValidationContext {

	private final Injector injector;
	private final ISqmlValidationConfiguration validationConfiguration;
	private final IGlobalScopeProvider globalScopeProvider;
	private final ISqmlIssueAcceptor issueAcceptor;

	public SqmlValidationContext(Injector injector, ValidationMessageAcceptor messageAcceptor, Resource resource) {

		this.injector = injector;
		this.validationConfiguration = getConfiguration(resource);
		this.globalScopeProvider = injector.getInstance(IGlobalScopeProvider.class);
		this.issueAcceptor = new SqmlIssueAcceptor(messageAcceptor, validationConfiguration);
	}

	@Override
	public void accept(ISqmlIssue issue) {

		issueAcceptor.accept(issue);
	}

	@Override
	public Injector getInjector() {

		return injector;
	}

	@Override
	public ISqmlValidationConfiguration getValidationConfiguration() {

		return validationConfiguration;
	}

	@Override
	public IScope getScope(Resource context, EReference reference, Predicate<IEObjectDescription> filter) {

		return globalScopeProvider.getScope(context, reference, filter);
	}

	@Override
	public JavaPackageName getExpectedPackageName(ISqmlFile file) {

		return new ExpectedPackageNameDeterminer(file).getJavaPackageName();
	}

	private ISqmlValidationConfiguration getConfiguration(Resource resource) {

		return injector.getInstance(ISqmlValidationConfigurationProvider.class).getConfiguration(resource);
	}
}
