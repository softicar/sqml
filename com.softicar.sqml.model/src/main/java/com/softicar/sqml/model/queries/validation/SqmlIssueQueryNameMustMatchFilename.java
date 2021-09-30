package com.softicar.sqml.model.queries.validation;

import com.softicar.sqml.model.files.FilesPackage;
import com.softicar.sqml.model.queries.ISqmlQuery;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueQueryNameMustMatchFilename extends AbstractSqmlError<ISqmlQuery> {

	private final String expectedName;

	public SqmlIssueQueryNameMustMatchFilename(ISqmlQuery query, String expectedName) {

		super(query);
		this.expectedName = expectedName;
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return FilesPackage.eINSTANCE.getSqmlFileElement_Name();
	}

	@Override
	public String getMessage() {

		return String.format("Query must match filename '%s'.", expectedName);
	}
}
