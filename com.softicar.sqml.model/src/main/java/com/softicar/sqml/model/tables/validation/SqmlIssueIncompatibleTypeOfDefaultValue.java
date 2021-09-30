package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.tables.TablesPackage;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueIncompatibleTypeOfDefaultValue extends AbstractSqmlError<ISqmlTableColumn> {

	private final ISqmlType columnType;
	private final ISqmlType valueType;

	public SqmlIssueIncompatibleTypeOfDefaultValue(ISqmlTableColumn column) {

		super(column);

		this.columnType = column.getSqmlType();
		this.valueType = column.getDefaultValue().getSqmlType();
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return TablesPackage.eINSTANCE.getSqmlTableColumn_DefaultValue();
	}

	@Override
	public String getMessage() {

		return String
			.format(//
				"Cannot assign default value of type %s to column of type %s.",
				valueType.getDisplayName(),
				columnType.getDisplayName());
	}
}
