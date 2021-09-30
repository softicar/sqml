package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.tables.TablesPackage;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import com.softicar.sqml.model.validation.ISqmlIssueAcceptor;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueIllegalTypeOfBaseColumn extends AbstractSqmlError<ISqmlTableColumn> {

	public SqmlIssueIllegalTypeOfBaseColumn(ISqmlTableColumn tableColumn) {

		super(tableColumn);
	}

	public static void validate(ISqmlTableColumn column, ISqmlIssueAcceptor acceptor) {

		if (column.isBaseColumn()) {
			if (column.getTypeReference().getSqmlType() instanceof ISqmlTable) {
				// okay
			} else {
				acceptor.accept(new SqmlIssueIllegalTypeOfBaseColumn(column));
			}
		}
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return TablesPackage.eINSTANCE.getSqmlTableColumn_TypeReference();
	}

	@Override
	public String getMessage() {

		return String.format("The type of the base column '%s' is illegal.", getTargetObject().getName());
	}
}
