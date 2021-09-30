package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.tables.ISqmlTableRowValue;
import com.softicar.sqml.model.tables.TablesPackage;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueIllegalNullValueForNonNullableTableColumn extends AbstractSqmlError<ISqmlTableRowValue> {

	private final ISqmlTableColumn tableColumn;

	public SqmlIssueIllegalNullValueForNonNullableTableColumn(ISqmlTableRowValue tableRowValue, ISqmlTableColumn tableColumn) {

		super(tableRowValue);
		this.tableColumn = tableColumn;
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return TablesPackage.eINSTANCE.getSqmlTableRowValue_Null();
	}

	@Override
	public String getMessage() {

		return String.format("Illegal NULL value for non-nullable column '%s'.", tableColumn.getName());
	}
}
