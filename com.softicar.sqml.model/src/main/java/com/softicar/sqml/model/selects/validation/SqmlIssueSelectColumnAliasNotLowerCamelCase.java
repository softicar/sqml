package com.softicar.sqml.model.selects.validation;

import com.softicar.sqml.model.selects.ISqmlSelectColumn;
import com.softicar.sqml.model.selects.SelectsPackage;
import com.softicar.sqml.model.validation.AbstractSqmlWarning;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueSelectColumnAliasNotLowerCamelCase extends AbstractSqmlWarning<ISqmlSelectColumn> {

	public SqmlIssueSelectColumnAliasNotLowerCamelCase(ISqmlSelectColumn selectColumn) {

		super(selectColumn);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return SelectsPackage.eINSTANCE.getSqmlSelectColumn_Alias();
	}

	@Override
	public String getMessage() {

		return String.format("Select column aliases must be lower-camel-case.");
	}
}
