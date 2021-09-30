package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.tables.TablesPackage;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import java.util.stream.Collectors;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueIllegalBitsAttributeValue extends AbstractSqmlError<ISqmlTableColumn> {

	public SqmlIssueIllegalBitsAttributeValue(ISqmlTableColumn tableColumn) {

		super(tableColumn);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return TablesPackage.eINSTANCE.getSqmlTableColumn_Bits();
	}

	@Override
	public String getMessage() {

		String validBits = SqmlTableColumnValidator.VALID_BITS_VALUES//
			.stream()
			.sorted()
			.map(integer -> integer + "")
			.collect(Collectors.joining(", "));
		return String.format("Illegal value for BITS attribute. Valid values: %s", validBits);
	}
}
