package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.tables.TablesPackage;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueEnumTableWithIllegalNameColumnType extends AbstractSqmlError<ISqmlTableColumn> {

	public SqmlIssueEnumTableWithIllegalNameColumnType(ISqmlTableColumn tableColumn) {

		super(tableColumn);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return TablesPackage.eINSTANCE.getSqmlTableColumn_TypeReference();
	}

	@Override
	public String getMessage() {

		return "Name column of enum table must be of type STRING.";
	}
}
