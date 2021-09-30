package com.softicar.sqml.ui;

import com.google.inject.Binder;
import com.google.inject.name.Names;
import com.softicar.sqml.generator.preferences.ISqmlGeneratorPreferencesProvider;
import com.softicar.sqml.ui.contentassist.SqmlProposalProvider;
import com.softicar.sqml.ui.contentassist.SqmlReferenceProposalCreator;
import com.softicar.sqml.ui.generation.SqmlUiGeneratorPreferencesProvider;
import com.softicar.sqml.ui.highlighting.SqmlHighlightingCalculator;
import com.softicar.sqml.ui.highlighting.SqmlHighlightingConfiguration;
import com.softicar.sqml.ui.hover.SqmlHoverProvider;
import com.softicar.sqml.ui.preferences.SqmlGeneratorPreferenceInitializer;
import com.softicar.sqml.ui.preferences.SqmlValidatorPreferenceInitializer;
import com.softicar.sqml.ui.resource.SqmlResourceUIServiceProvider;
import com.softicar.sqml.ui.validation.SqmlUiValidationConfigurationProvider;
import com.softicar.sqml.validation.ISqmlValidationConfigurationProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.ui.editor.contentassist.AbstractJavaBasedContentProposalProvider.ReferenceProposalCreator;
import org.eclipse.xtext.ui.editor.contentassist.IContentProposalProvider;
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreInitializer;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.resource.IResourceUIServiceProvider;

/**
 * Use this class to register components to be used within the IDE.
 */
public class SqmlUiModule extends AbstractSqmlUiModule {

	public SqmlUiModule(AbstractUIPlugin plugin) {

		super(plugin);
	}

	public Class<? extends IEObjectHoverProvider> bindIEObjectHoverProvider() {

		return SqmlHoverProvider.class;
	}

	public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {

		return SqmlHighlightingCalculator.class;
	}

	public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {

		return SqmlHighlightingConfiguration.class;
	}

	public Class<? extends IResourceUIServiceProvider> bindIResourceUIServiceProvider() {

		return SqmlResourceUIServiceProvider.class;
	}

	@Override
	public Class<? extends IContentProposalProvider> bindIContentProposalProvider() {

		return SqmlProposalProvider.class;
	}

	public Class<? extends ISqmlGeneratorPreferencesProvider> bindISqmlGeneratorPreferencesProvider() {

		return SqmlUiGeneratorPreferencesProvider.class;
	}

	public Class<? extends ISqmlValidationConfigurationProvider> bindISqmlValidationConfigurationProvider() {

		return SqmlUiValidationConfigurationProvider.class;
	}

	@Override
	public void configureIPreferenceStoreInitializer(Binder binder) {

		super.configureIPreferenceStoreInitializer(binder);
		binder.bind(IPreferenceStoreInitializer.class).annotatedWith(Names.named("SqmlGeneratorPreferences")).to(SqmlGeneratorPreferenceInitializer.class);
		binder.bind(IPreferenceStoreInitializer.class).annotatedWith(Names.named("SqmlValidatorPreferences")).to(SqmlValidatorPreferenceInitializer.class);
	}

	@Override
	public Class<? extends ReferenceProposalCreator> bindAbstractJavaBasedContentProposalProvider$ReferenceProposalCreator() {

		return SqmlReferenceProposalCreator.class;
	}
}
