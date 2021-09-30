package com.softicar.sqml.validation;

import com.google.inject.ImplementedBy;
import com.softicar.sqml.model.validation.ISqmlValidationConfiguration;
import com.softicar.sqml.model.validation.SqmlDefaultValidationConfiguration;
import com.softicar.sqml.validation.ISqmlValidationConfigurationProvider.DefaultConfigurationProvider;
import org.eclipse.emf.ecore.resource.Resource;

@ImplementedBy(DefaultConfigurationProvider.class)
public interface ISqmlValidationConfigurationProvider {

	ISqmlValidationConfiguration getConfiguration(Resource resource);

	class DefaultConfigurationProvider implements ISqmlValidationConfigurationProvider {

		@Override
		public ISqmlValidationConfiguration getConfiguration(Resource resource) {

			return SqmlDefaultValidationConfiguration.get();
		}
	}
}
