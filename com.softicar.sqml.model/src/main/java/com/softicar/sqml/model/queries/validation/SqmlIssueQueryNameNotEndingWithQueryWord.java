package com.softicar.sqml.model.queries.validation;

import com.softicar.sqml.model.files.FilesPackage;
import com.softicar.sqml.model.queries.ISqmlQuery;
import com.softicar.sqml.model.validation.AbstractSqmlWarning;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueQueryNameNotEndingWithQueryWord extends AbstractSqmlWarning<ISqmlQuery> {

	public SqmlIssueQueryNameNotEndingWithQueryWord(ISqmlQuery query) {

		super(query);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return FilesPackage.eINSTANCE.getSqmlFileElement_Name();
	}

	@Override
	public String getMessage() {

		return String.format("Query names must end with the word 'Query'.");
	}
}
