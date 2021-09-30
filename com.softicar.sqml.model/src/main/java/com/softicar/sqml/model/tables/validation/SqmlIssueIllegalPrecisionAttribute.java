package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.tables.TablesPackage;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueIllegalPrecisionAttribute extends AbstractSqmlError<ISqmlTableColumn> {

	public SqmlIssueIllegalPrecisionAttribute(ISqmlTableColumn tableColumn) {

		super(tableColumn);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return TablesPackage.eINSTANCE.getSqmlTableColumn_Precision();
	}

	@Override
	public String getMessage() {

		ISqmlType columnType = getTargetObject().getSqmlType();
		return String.format("The PRECISION attribute may not be used on columns of type %s.", columnType);
	}
}
