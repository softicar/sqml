package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.files.FilesPackage;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueTableNameMustMatchFilename extends AbstractSqmlError<ISqmlTable> {

	private final String expectedName;

	public SqmlIssueTableNameMustMatchFilename(ISqmlTable table, String expectedName) {

		super(table);
		this.expectedName = expectedName;
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return FilesPackage.eINSTANCE.getSqmlFileElement_Name();
	}

	@Override
	public String getMessage() {

		return String.format("Table must match filename '%s'.", expectedName);
	}
}
