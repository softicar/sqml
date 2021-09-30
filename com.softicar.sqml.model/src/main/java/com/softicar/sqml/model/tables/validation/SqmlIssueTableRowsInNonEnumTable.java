package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.tables.ISqmlTableRow;
import com.softicar.sqml.model.tables.TablesPackage;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueTableRowsInNonEnumTable extends AbstractSqmlError<ISqmlTableRow> {

	public SqmlIssueTableRowsInNonEnumTable(ISqmlTableRow tableRow) {

		super(tableRow);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return TablesPackage.eINSTANCE.getSqmlTableRow_Values();
	}

	@Override
	public String getMessage() {

		return String.format("Table rows can only be defined for enumeration tables.");
	}
}
