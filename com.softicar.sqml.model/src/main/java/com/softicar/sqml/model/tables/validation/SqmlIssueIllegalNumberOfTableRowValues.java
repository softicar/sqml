package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.tables.ISqmlTableRow;
import com.softicar.sqml.model.tables.TablesPackage;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueIllegalNumberOfTableRowValues extends AbstractSqmlError<ISqmlTableRow> {

	private final int expectedNumber;
	private final int actualNumber;

	public SqmlIssueIllegalNumberOfTableRowValues(ISqmlTableRow tableRow, int expectedNumber, int actualNumber) {

		super(tableRow);
		this.expectedNumber = expectedNumber;
		this.actualNumber = actualNumber;
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return TablesPackage.eINSTANCE.getSqmlTableRow_Values();
	}

	@Override
	public String getMessage() {

		return String.format("Illegal number of table row values. Expected %s but got %s.", expectedNumber, actualNumber);
	}
}
