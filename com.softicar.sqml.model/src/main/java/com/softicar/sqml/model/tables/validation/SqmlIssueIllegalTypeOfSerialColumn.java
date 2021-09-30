package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.tables.TablesPackage;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import com.softicar.sqml.model.validation.ISqmlIssueAcceptor;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueIllegalTypeOfSerialColumn extends AbstractSqmlError<ISqmlTableColumn> {

	public SqmlIssueIllegalTypeOfSerialColumn(ISqmlTableColumn tableColumn) {

		super(tableColumn);
	}

	public static void validate(ISqmlTableColumn column, ISqmlIssueAcceptor acceptor) {

		if (column.isSerial()) {
			if (column.getTypeReference().getSqmlType().is(SqmlBuiltInTypes.getIntegerType())) {
				// okay
			} else if (column.getTypeReference().getSqmlType().is(SqmlBuiltInTypes.getLongType())) {
				// okay
			} else {
				acceptor.accept(new SqmlIssueIllegalTypeOfSerialColumn(column));
			}
		}
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return TablesPackage.eINSTANCE.getSqmlTableColumn_TypeReference();
	}

	@Override
	public String getMessage() {

		return String.format("The type of the serial column '%s' is illegal.", getTargetObject().getName());
	}
}
