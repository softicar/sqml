package com.softicar.sqml.ui.refactor.move;

import com.softicar.sqml.model.utils.references.SqmlCrossReference;
import com.softicar.sqml.ui.utils.SqmlEclipeWorkspace;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.xtext.resource.IReferenceDescription;

public class SqmlCrossReferenceValidator {

	private final SqmlCrossReference crossReference;

	public SqmlCrossReferenceValidator(SqmlCrossReference crossReference) {

		this.crossReference = crossReference;
	}

	public void validate(RefactoringStatus status) {

		EObject sourceObject = crossReference.getSourceObject();
		EObject targetObject = crossReference.getTargetObject();
		IReferenceDescription referenceDescription = crossReference.getReferenceDescription();

		if (sourceObject == null) {
			status
				.addError(
					String
						.format(
							"Failed to load source object for reference %s -> %s",
							referenceDescription.getSourceEObjectUri(),
							referenceDescription.getTargetEObjectUri()));
			return;
		}

		if (targetObject == null) {
			status
				.addError(
					String
						.format(
							"Failed to load target object for reference %s -> %s",
							referenceDescription.getSourceEObjectUri(),
							referenceDescription.getTargetEObjectUri()));
			return;
		}

		if (SqmlEclipeWorkspace.getWorkspaceFile(sourceObject) == null) {
			status.addFatalError(String.format("Failed to load file for source of reference %s", referenceDescription.getSourceEObjectUri()));
			return;
		}

		if (SqmlEclipeWorkspace.getWorkspaceFile(targetObject) == null) {
			status.addFatalError(String.format("Failed to load file for target of reference %s", referenceDescription.getTargetEObjectUri()));
			return;
		}
	}
}
