package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.tables.TablesPackage;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueIllegalCharacterSetAttribute extends AbstractSqmlError<ISqmlTableColumn> {

	public SqmlIssueIllegalCharacterSetAttribute(ISqmlTableColumn tableColumn) {

		super(tableColumn);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return TablesPackage.eINSTANCE.getSqmlTableColumn_CharacterSet();
	}

	@Override
	public String getMessage() {

		ISqmlType columnType = getTargetObject().getSqmlType();
		return String.format("The CHARACTER SET attribute may not be used on columns of type %s.", columnType);
	}
}
