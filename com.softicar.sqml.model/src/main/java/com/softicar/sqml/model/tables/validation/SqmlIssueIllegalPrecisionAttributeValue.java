package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.tables.TablesPackage;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueIllegalPrecisionAttributeValue extends AbstractSqmlError<ISqmlTableColumn> {

	public SqmlIssueIllegalPrecisionAttributeValue(ISqmlTableColumn tableColumn) {

		super(tableColumn);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return TablesPackage.eINSTANCE.getSqmlTableColumn_Precision();
	}

	@Override
	public String getMessage() {

		return "Illegal value for PRECISION attribute. Precision must be at least 1 and the scale must not be greater than the precision.";
	}
}
