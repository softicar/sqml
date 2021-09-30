package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.TablesPackage;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueEnumTableMissingIdColumn extends AbstractSqmlError<ISqmlTable> {

	public SqmlIssueEnumTableMissingIdColumn(ISqmlTable table) {

		super(table);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return TablesPackage.eINSTANCE.getSqmlTable_EnumTable();
	}

	@Override
	public String getMessage() {

		return "Enum table is missing serial primary key column.";
	}
}
