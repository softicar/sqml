package com.softicar.sqml.model.files.validation;

import com.softicar.sqml.model.files.FilesPackage;
import com.softicar.sqml.model.files.ISqmlImport;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueUnresolvableImport extends AbstractSqmlError<ISqmlImport> {

	public SqmlIssueUnresolvableImport(ISqmlImport sqmlImport) {

		super(sqmlImport);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return FilesPackage.eINSTANCE.getSqmlImport_Target();
	}

	@Override
	public String getMessage() {

		return "Unresolvable import.";
	}
}
