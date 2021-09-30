package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.TablesPackage;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueEnumTableMissingNameColumn extends AbstractSqmlError<ISqmlTable> {

	public SqmlIssueEnumTableMissingNameColumn(ISqmlTable table) {

		super(table);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return TablesPackage.eINSTANCE.getSqmlTable_EnumTable();
	}

	@Override
	public String getMessage() {

		return "Enum table is missing name column.";
	}
}
