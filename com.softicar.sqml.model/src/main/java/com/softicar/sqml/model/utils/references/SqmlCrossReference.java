package com.softicar.sqml.model.utils.references;

import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.utils.SqmlNavigation;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.IReferenceDescription;

public class SqmlCrossReference {

	private final ResourceSet resourceSet;
	private final IReferenceDescription referenceDescription;
	private final EObject sourceObject;
	private final EObject targetObject;
	private final ISqmlFile sqmlSourceFile;

	public SqmlCrossReference(ResourceSet resourceSet, IReferenceDescription referenceDescription) {

		this.resourceSet = resourceSet;
		this.referenceDescription = referenceDescription;
		this.sourceObject = getObject(referenceDescription.getSourceEObjectUri());
		this.targetObject = getObject(referenceDescription.getTargetEObjectUri());
		this.sqmlSourceFile = SqmlNavigation.find(ISqmlFile.class, sourceObject);
	}

	public IReferenceDescription getReferenceDescription() {

		return referenceDescription;
	}

	public EObject getSourceObject() {

		return sourceObject;
	}

	public EObject getTargetObject() {

		return targetObject;
	}

	public ISqmlFile getSqmlSourceFile() {

		return sqmlSourceFile;
	}

	private EObject getObject(URI objectUri) {

		return resourceSet.getEObject(objectUri, true);
	}
}
