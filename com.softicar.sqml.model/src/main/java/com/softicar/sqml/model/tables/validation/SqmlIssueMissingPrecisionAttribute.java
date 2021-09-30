package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.builtin.SqmlDecimalType;
import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.tables.TablesPackage;
import com.softicar.sqml.model.validation.AbstractSqmlWarning;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueMissingPrecisionAttribute extends AbstractSqmlWarning<ISqmlTableColumn> {

	public SqmlIssueMissingPrecisionAttribute(ISqmlTableColumn tableColumn) {

		super(tableColumn);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return TablesPackage.eINSTANCE.getSqmlTableColumn_Name();
	}

	@Override
	public String getMessage() {

		String decimalType = SqmlDecimalType.get().getDisplayName();
		return String.format("Missing PRECISION attribute on column of type %s.", decimalType);
	}
}
