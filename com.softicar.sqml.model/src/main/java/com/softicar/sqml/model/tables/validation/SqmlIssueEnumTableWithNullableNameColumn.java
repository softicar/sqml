package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.tables.TablesPackage;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueEnumTableWithNullableNameColumn extends AbstractSqmlError<ISqmlTableColumn> {

	public SqmlIssueEnumTableWithNullableNameColumn(ISqmlTableColumn tableColumn) {

		super(tableColumn);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return TablesPackage.eINSTANCE.getSqmlTableColumn_Nullable();
	}

	@Override
	public String getMessage() {

		return "Name column of enum table may not be nullable.";
	}
}
