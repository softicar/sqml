package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.tables.ISqmlTableRowValue;
import com.softicar.sqml.model.tables.TablesPackage;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueIllegalTypeOfTableRowValue extends AbstractSqmlError<ISqmlTableRowValue> {

	private final ISqmlTableColumn tableColumn;

	public SqmlIssueIllegalTypeOfTableRowValue(ISqmlTableRowValue tableRowValue, ISqmlTableColumn tableColumn) {

		super(tableRowValue);
		this.tableColumn = tableColumn;
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return TablesPackage.eINSTANCE.getSqmlTableRowValue_Literal();
	}

	@Override
	public String getMessage() {

		return String.format("Illegal type of table row value for column '%s'.", tableColumn.getName());
	}
}
