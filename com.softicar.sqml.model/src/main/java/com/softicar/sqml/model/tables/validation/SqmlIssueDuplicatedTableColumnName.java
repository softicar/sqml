package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.tables.TablesPackage;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueDuplicatedTableColumnName extends AbstractSqmlError<ISqmlTableColumn> {

	public SqmlIssueDuplicatedTableColumnName(ISqmlTableColumn tableColumn) {

		super(tableColumn);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return TablesPackage.eINSTANCE.getSqmlTableColumn_Name();
	}

	@Override
	public String getMessage() {

		return String.format("Duplicated table column name '%s'.", getTargetObject().getName());
	}
}
