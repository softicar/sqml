package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.tables.TablesPackage;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import java.util.stream.Collectors;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueIllegalLengthBitsAttributeValue extends AbstractSqmlError<ISqmlTableColumn> {

	public SqmlIssueIllegalLengthBitsAttributeValue(ISqmlTableColumn tableColumn) {

		super(tableColumn);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return TablesPackage.eINSTANCE.getSqmlTableColumn_LengthBits();
	}

	@Override
	public String getMessage() {

		String validLengthBits = SqmlTableColumnValidator.VALID_LENGTH_BITS_VALUES//
			.stream()
			.sorted()
			.map(integer -> integer + "")
			.collect(Collectors.joining(", "));
		return String.format("Illegal value for LENGTHBITS attribute. Valid values: %s", validLengthBits);
	}
}
