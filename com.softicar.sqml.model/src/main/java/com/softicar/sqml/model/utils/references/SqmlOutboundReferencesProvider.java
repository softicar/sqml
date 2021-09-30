package com.softicar.sqml.model.utils.references;

import com.google.inject.Inject;
import com.softicar.sqml.model.builtin.SqmlBuiltInPackage;
import com.softicar.sqml.model.builtin.SqmlBuiltIns;
import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.utils.SqmlNavigation;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.IReferenceDescription;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.IResourceServiceProvider.Registry;

public class SqmlOutboundReferencesProvider {

	private final Registry registry;

	@Inject
	public SqmlOutboundReferencesProvider(IResourceServiceProvider.Registry registry) {

		this.registry = registry;
	}

	public List<SqmlCrossReference> getReferences(ISqmlFile file) {

		return getReferences(SqmlNavigation.getResource(file));
	}

	public List<SqmlCrossReference> getReferences(Resource resource) {

		ResourceSet resourceSet = resource.getResourceSet();
		List<SqmlCrossReference> references = new ArrayList<>();
		for (IReferenceDescription description: getAllReferenceDescriptions(resource)) {
			if (!isBuiltIn(description)) {
				SqmlCrossReference crossReference = new SqmlCrossReference(resourceSet, description);
				if (!isLanguagePackage(crossReference)) {
					references.add(crossReference);
				}
			}
		}
		return references;
	}

	private boolean isBuiltIn(IReferenceDescription description) {

		return SqmlBuiltIns.isBuiltIn(description.getTargetEObjectUri());
	}

	private boolean isLanguagePackage(SqmlCrossReference crossReference) {

		return SqmlBuiltInPackage.contains(crossReference.getTargetObject());
	}

	private Iterable<IReferenceDescription> getAllReferenceDescriptions(Resource resource) {

		return registry//
			.getResourceServiceProvider(resource.getURI())
			.getResourceDescriptionManager()
			.getResourceDescription(resource)
			.getReferenceDescriptions();
	}
}
