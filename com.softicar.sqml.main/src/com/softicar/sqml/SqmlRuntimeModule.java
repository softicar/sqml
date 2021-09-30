package com.softicar.sqml;

import com.softicar.sqml.generation.SqmlGenerator;
import com.softicar.sqml.generator.query.ISqmlQueryClassGenerator;
import com.softicar.sqml.generator.query.SqmlQueryInterfaceGenerator;
import com.softicar.sqml.generator.table.clazz.ISqmlTableClassGenerator;
import com.softicar.sqml.generator.table.clazz.SqmlTableClassGenerator;
import com.softicar.sqml.linking.ISqmlFunctionCallLinker;
import com.softicar.sqml.linking.SqmlFunctionCallLinker;
import com.softicar.sqml.linking.SqmlLinkingDiagnosticMessageProvider;
import com.softicar.sqml.linking.SqmlLinkingService;
import com.softicar.sqml.literals.SqmlValueConverterService;
import com.softicar.sqml.model.functions.linking.ISqmlFunctionCallLinkFinderProvider;
import com.softicar.sqml.model.functions.linking.SqmlFunctionCallLinkFinderProvider;
import com.softicar.sqml.model.utils.scoping.ISqmlFileScopeProvider;
import com.softicar.sqml.model.utils.scoping.ISqmlScopeProvider;
import com.softicar.sqml.model.utils.scoping.SqmlFileScopeProvider;
import com.softicar.sqml.scoping.SqmlQualifiedNameProvider;
import com.softicar.sqml.scoping.SqmlResourceDescriptionManager;
import com.softicar.sqml.scoping.SqmlResourceDescriptionStrategy;
import com.softicar.sqml.scoping.SqmlScopeProvider;
import com.softicar.sqml.validation.AbstractSqmlValidator;
import com.softicar.sqml.validation.SqmlValidator;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.linking.ILinkingDiagnosticMessageProvider;
import org.eclipse.xtext.linking.ILinkingService;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.IResourceDescription;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
public class SqmlRuntimeModule extends com.softicar.sqml.AbstractSqmlRuntimeModule {

	// -------------------- overridden -------------------- //

	@Override
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {

		return SqmlQualifiedNameProvider.class;
	}

	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {

		return SqmlValueConverterService.class;
	}

	@Override
	@org.eclipse.xtext.service.SingletonBinding(eager = true)
	public Class<? extends AbstractSqmlValidator> bindAbstractSqmlValidator() {

		return SqmlValidator.class;
	}

	public Class<? extends ILinkingDiagnosticMessageProvider.Extended> bindILinkingDiagnosticMessageProvider() {

		return SqmlLinkingDiagnosticMessageProvider.class;
	}

	// -------------------- linking -------------------- //

	@Override
	public Class<? extends ILinkingService> bindILinkingService() {

		return SqmlLinkingService.class;
	}

	public Class<? extends ISqmlFunctionCallLinker> bindISqmlFunctionCallLinker() {

		return SqmlFunctionCallLinker.class;
	}

	public Class<? extends ISqmlFunctionCallLinkFinderProvider> bindISqmlFunctionCallLinkFinderProvider() {

		return SqmlFunctionCallLinkFinderProvider.class;
	}

	// -------------------- scoping -------------------- //

	public Class<? extends ISqmlScopeProvider> bindISqmlScopeProvider() {

		return SqmlScopeProvider.class;
	}

	public Class<? extends ISqmlFileScopeProvider> bindISqmlFileScopeProvider() {

		return SqmlFileScopeProvider.class;
	}

	public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {

		return SqmlResourceDescriptionStrategy.class;
	}

	public Class<? extends IResourceDescription.Manager> bindIResourceDescriptionManager() {

		return SqmlResourceDescriptionManager.class;
	}

	// -------------------- generators -------------------- //

	public Class<? extends IGenerator> bindIGenerator() {

		return SqmlGenerator.class;
	}

	public Class<? extends ISqmlQueryClassGenerator> bindIQueryTableClassGenerator() {

		return SqmlQueryInterfaceGenerator.class;
	}

	public Class<? extends ISqmlTableClassGenerator> bindISqmlTableClassGenerator() {

		return SqmlTableClassGenerator.class;
	}
}
