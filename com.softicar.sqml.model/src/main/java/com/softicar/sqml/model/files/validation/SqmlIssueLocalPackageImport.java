package com.softicar.sqml.model.files.validation;

import com.softicar.sqml.model.files.FilesPackage;
import com.softicar.sqml.model.files.ISqmlImport;
import com.softicar.sqml.model.validation.AbstractSqmlWarning;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueLocalPackageImport extends AbstractSqmlWarning<ISqmlImport> {

	public SqmlIssueLocalPackageImport(ISqmlImport sqmlImport) {

		super(sqmlImport);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return FilesPackage.eINSTANCE.getSqmlImport_Target();
	}

	@Override
	public String getMessage() {

		return String.format("Unnecessary local package import of '%s'.", getTargetObject().getQualifiedName());
	}
}
