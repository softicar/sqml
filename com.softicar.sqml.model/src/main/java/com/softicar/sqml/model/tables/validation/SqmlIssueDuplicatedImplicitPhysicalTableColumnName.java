package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.tables.TablesPackage;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueDuplicatedImplicitPhysicalTableColumnName extends AbstractSqmlError<ISqmlTableColumn> {

	public SqmlIssueDuplicatedImplicitPhysicalTableColumnName(ISqmlTableColumn tableColumn) {

		super(tableColumn);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return TablesPackage.eINSTANCE.getSqmlTableColumn_Name();
	}

	@Override
	public String getMessage() {

		return "Duplicated implicit physical column name.";
	}

}
