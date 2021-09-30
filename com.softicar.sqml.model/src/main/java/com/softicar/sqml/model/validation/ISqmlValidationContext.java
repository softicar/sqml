package com.softicar.sqml.model.validation;

import com.google.inject.Injector;
import com.softicar.platform.common.core.java.packages.name.JavaPackageName;
import com.softicar.sqml.model.files.ISqmlFile;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;

public interface ISqmlValidationContext extends ISqmlIssueAcceptor, IGlobalScopeProvider {

	Injector getInjector();

	ISqmlValidationConfiguration getValidationConfiguration();

	JavaPackageName getExpectedPackageName(ISqmlFile file);
}
