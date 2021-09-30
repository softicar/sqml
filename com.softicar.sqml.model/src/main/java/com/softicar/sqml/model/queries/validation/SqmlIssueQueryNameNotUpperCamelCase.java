package com.softicar.sqml.model.queries.validation;

import com.softicar.sqml.model.files.FilesPackage;
import com.softicar.sqml.model.queries.ISqmlQuery;
import com.softicar.sqml.model.validation.AbstractSqmlWarning;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueQueryNameNotUpperCamelCase extends AbstractSqmlWarning<ISqmlQuery> {

	public SqmlIssueQueryNameNotUpperCamelCase(ISqmlQuery query) {

		super(query);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return FilesPackage.eINSTANCE.getSqmlFileElement_Name();
	}

	@Override
	public String getMessage() {

		return String.format("Query names must be upper-camel-case.");
	}
}
