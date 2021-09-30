package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.files.FilesPackage;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import com.softicar.sqml.model.validation.ISqmlIssueAcceptor;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueMissingPrimaryKey extends AbstractSqmlError<ISqmlTable> {

	public SqmlIssueMissingPrimaryKey(ISqmlTable table) {

		super(table);
	}

	public static void validate(ISqmlTable table, ISqmlIssueAcceptor acceptor) {

		if (table.getPrimarKeyColumns().isEmpty()) {
			acceptor.accept(new SqmlIssueMissingPrimaryKey(table));
		}
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return FilesPackage.eINSTANCE.getSqmlFileElement_Name();
	}

	@Override
	public String getMessage() {

		return String.format("Missing primary key on table '%s'.", getTargetObject().getName());
	}
}
