package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.files.FilesPackage;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import com.softicar.sqml.model.validation.ISqmlIssueAcceptor;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueTooManyPrimaryKeyFields extends AbstractSqmlError<ISqmlTable> {

	private static final int MAXIMUM_PRIMARY_KEY_COLUMNS = 4;

	public SqmlIssueTooManyPrimaryKeyFields(ISqmlTable table) {

		super(table);
	}

	public static void validate(ISqmlTable table, ISqmlIssueAcceptor acceptor) {

		int count = 0;
		for (ISqmlTableColumn column: table.getColumns()) {
			if (column.isPrimaryKey()) {
				count++;
			}
		}

		if (count > MAXIMUM_PRIMARY_KEY_COLUMNS) {
			acceptor.accept(new SqmlIssueTooManyPrimaryKeyFields(table));
		}
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return FilesPackage.eINSTANCE.getSqmlFileElement_Name();
	}

	@Override
	public String getMessage() {

		return String.format("Too many primary key columns in %s. A maximum of %s columns allowed.", getTargetObject().getName(), MAXIMUM_PRIMARY_KEY_COLUMNS);
	}
}
