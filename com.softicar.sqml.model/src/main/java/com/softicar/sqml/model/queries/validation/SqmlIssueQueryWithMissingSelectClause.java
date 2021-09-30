package com.softicar.sqml.model.queries.validation;

import com.softicar.sqml.model.files.FilesPackage;
import com.softicar.sqml.model.queries.ISqmlQuery;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueQueryWithMissingSelectClause extends AbstractSqmlError<ISqmlQuery> {

	public SqmlIssueQueryWithMissingSelectClause(ISqmlQuery query) {

		super(query);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return FilesPackage.eINSTANCE.getSqmlFileElement_Name();
	}

	@Override
	public String getMessage() {

		return "The query is missing a SELECT clause.";
	}
}
