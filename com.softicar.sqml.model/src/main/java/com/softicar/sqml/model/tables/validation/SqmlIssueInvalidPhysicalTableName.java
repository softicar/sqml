package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.TablesPackage;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueInvalidPhysicalTableName extends AbstractSqmlError<ISqmlTable> {

	public SqmlIssueInvalidPhysicalTableName(ISqmlTable table) {

		super(table);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return TablesPackage.eINSTANCE.getSqmlTable_PhysicalNameOverride();
	}

	@Override
	public String getMessage() {

		return "Physical table name must be in the form '<database>.<table>'.";
	}
}
