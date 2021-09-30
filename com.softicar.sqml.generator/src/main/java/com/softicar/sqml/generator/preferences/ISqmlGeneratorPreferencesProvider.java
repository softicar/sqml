package com.softicar.sqml.generator.preferences;

import com.google.inject.ImplementedBy;
import org.eclipse.emf.ecore.resource.Resource;

@ImplementedBy(SqmlDefaultGeneratorPreferencesProvider.class)
public interface ISqmlGeneratorPreferencesProvider {

	ISqmlGeneratorPreferences getPreferences(Resource resource);
}
