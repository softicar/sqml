package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.tables.TablesPackage;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueDuplicatedPhysicalTableColumnName extends AbstractSqmlError<ISqmlTableColumn> {

	public SqmlIssueDuplicatedPhysicalTableColumnName(ISqmlTableColumn tableColumn) {

		super(tableColumn);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return TablesPackage.eINSTANCE.getSqmlTableColumn_PhysicalNameOverride();
	}

	@Override
	public String getMessage() {

		return "Duplicated physical column name.";
	}

}
