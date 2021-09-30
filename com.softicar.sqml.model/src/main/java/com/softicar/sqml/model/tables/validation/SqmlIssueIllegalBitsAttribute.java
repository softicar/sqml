package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.tables.TablesPackage;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueIllegalBitsAttribute extends AbstractSqmlError<ISqmlTableColumn> {

	public SqmlIssueIllegalBitsAttribute(ISqmlTableColumn tableColumn) {

		super(tableColumn);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return TablesPackage.eINSTANCE.getSqmlTableColumn_Bits();
	}

	@Override
	public String getMessage() {

		ISqmlType columnType = getTargetObject().getSqmlType();
		return String.format("The BITS attribute may not be used on columns of type %s.", columnType);
	}
}
