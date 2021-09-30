package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.tables.TablesPackage;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import com.softicar.sqml.model.validation.ISqmlIssueAcceptor;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueNullableSerialOrBaseColumn extends AbstractSqmlError<ISqmlTableColumn> {

	private final String type;

	public SqmlIssueNullableSerialOrBaseColumn(ISqmlTableColumn tableColumn, String type) {

		super(tableColumn);

		this.type = type;
	}

	public static void validate(ISqmlTableColumn column, ISqmlIssueAcceptor acceptor) {

		if (column.isNullable()) {
			if (column.isSerial()) {
				acceptor.accept(new SqmlIssueNullableSerialOrBaseColumn(column, "serial"));
			} else if (column.isBaseColumn()) {
				acceptor.accept(new SqmlIssueNullableSerialOrBaseColumn(column, "base"));
			}
		}
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return TablesPackage.eINSTANCE.getSqmlTableColumn_Nullable();
	}

	@Override
	public String getMessage() {

		return String.format("The %s table column '%s' may not be nullable.", type, getTargetObject().getName());
	}
}
