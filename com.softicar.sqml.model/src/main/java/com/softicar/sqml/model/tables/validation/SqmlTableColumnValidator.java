package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.builtin.SqmlBlobType;
import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.builtin.SqmlDayTimeType;
import com.softicar.sqml.model.builtin.SqmlDecimalType;
import com.softicar.sqml.model.builtin.SqmlIntegerType;
import com.softicar.sqml.model.builtin.SqmlStringType;
import com.softicar.sqml.model.tables.ISqmlDefaultValue;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.types.ISqmlEnum;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.validation.ISqmlIssueAcceptor;
import com.softicar.sqml.model.validation.ISqmlValidationConfiguration;
import com.softicar.sqml.model.validation.ISqmlValidationContext;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class SqmlTableColumnValidator {

	public static final Set<Integer> VALID_BITS_VALUES = Collections.unmodifiableSet(new TreeSet<>(Arrays.asList(8, 16, 24, 32)));
	public static final Set<Integer> VALID_LENGTH_BITS_VALUES = Collections.unmodifiableSet(new TreeSet<>(Arrays.asList(8, 16, 24, 32)));
	private final ISqmlTableColumn column;
	private final ISqmlIssueAcceptor acceptor;
	private final ISqmlValidationConfiguration configuration;

	public SqmlTableColumnValidator(ISqmlTableColumn column, ISqmlValidationContext context) {

		this.column = column;
		this.acceptor = context;
		this.configuration = context.getValidationConfiguration();
	}

	public void validate() {

		SqmlIssueNullableSerialOrBaseColumn.validate(column, acceptor);
		SqmlIssueIllegalTypeOfSerialColumn.validate(column, acceptor);
		SqmlIssueIllegalTypeOfBaseColumn.validate(column, acceptor);
		SqmlIssueUnresolvedTypeOfForeignKeyColumn.validate(column, acceptor);
		validateIllegalBitsAttribute();
		validateIllegalBitsAttributeValue();
		validateIllegalCharacterSetAttribute();
		validateIllegalCollationAttribute();
		validateIllegalMaxLengthAttribute();
		validateIllegalMaxLengthAttributeValue();
		validateIllegalLengthBitsAttribute();
		validateIllegalLengthBitsAttributeValue();
		validateIllegalOnUpdateNowAttribute();
		validateIllegalPrecisionAttribute();
		validateIllegalPrecisionAttributeValue();
		validateIllegalTimestampAttribute();
		validateConstraintNameLength();
		validateMissingPrecisionAttribute();
		validateTypeOfDefaultValue();
	}

	private void validateIllegalBitsAttribute() {

		if (column.getBits() != null && !column.getSqmlType().is(SqmlIntegerType.get())) {
			acceptor.accept(new SqmlIssueIllegalBitsAttribute(column));
		}
	}

	private void validateIllegalBitsAttributeValue() {

		Integer bits = column.getBits();
		if (bits != null && !VALID_BITS_VALUES.contains(bits)) {
			acceptor.accept(new SqmlIssueIllegalBitsAttributeValue(column));
		}
	}

	private void validateIllegalCharacterSetAttribute() {

		if (column.getCharacterSet() != null && !isString() && !isEnum()) {
			acceptor.accept(new SqmlIssueIllegalCharacterSetAttribute(column));
		}
	}

	private void validateIllegalCollationAttribute() {

		if (column.getCollation() != null && !isString() && !isEnum()) {
			acceptor.accept(new SqmlIssueIllegalCollationAttribute(column));
		}
	}

	private void validateIllegalMaxLengthAttribute() {

		if (column.getMaxLength() != null && !column.getSqmlType().isIn(SqmlStringType.get(), SqmlBlobType.get())) {
			acceptor.accept(new SqmlIssueIllegalMaxLengthAttribute(column));
		}
	}

	private void validateIllegalMaxLengthAttributeValue() {

		if (column.getMaxLength() != null && column.getMaxLength() < 1) {
			acceptor.accept(new SqmlIssueIllegalMaxLengthAttributeValue(column));
		}
	}

	private void validateIllegalLengthBitsAttribute() {

		if (column.getLengthBits() != null && !column.getSqmlType().isIn(SqmlStringType.get(), SqmlBlobType.get())) {
			acceptor.accept(new SqmlIssueIllegalLengthBitsAttribute(column));
		}
	}

	private void validateIllegalLengthBitsAttributeValue() {

		Integer lengthBits = column.getLengthBits();
		if (lengthBits != null && !VALID_LENGTH_BITS_VALUES.contains(lengthBits)) {
			acceptor.accept(new SqmlIssueIllegalLengthBitsAttributeValue(column));
		}
	}

	private void validateIllegalOnUpdateNowAttribute() {

		if (column.isOnUpdateNow() && !column.getSqmlType().is(SqmlDayTimeType.get())) {
			acceptor.accept(new SqmlIssueIllegalOnUpdateNowAttribute(column));
		}
	}

	private void validateIllegalPrecisionAttribute() {

		if (column.getPrecision() != null && !column.getSqmlType().is(SqmlDecimalType.get())) {
			acceptor.accept(new SqmlIssueIllegalPrecisionAttribute(column));
		}
	}

	private void validateIllegalPrecisionAttributeValue() {

		Integer precision = column.getPrecision();
		if (precision != null) {
			// zero precision
			if (precision.equals(0)) {
				acceptor.accept(new SqmlIssueIllegalPrecisionAttributeValue(column));
			}

			// scale bigger than precision
			Integer scale = column.getScale();
			if (scale > precision) {
				acceptor.accept(new SqmlIssueIllegalPrecisionAttributeValue(column));
			}
		}
	}

	private void validateIllegalTimestampAttribute() {

		if (column.isTimestamp() && !column.getSqmlType().is(SqmlDayTimeType.get())) {
			acceptor.accept(new SqmlIssueIllegalTimestampAttribute(column));
		}
	}

	private void validateConstraintNameLength() {

		String constraintName = column.getConstraintName();
		if (constraintName != null && constraintName.length() > configuration.getMaximumIdentifierLength()) {
			acceptor.accept(new SqmlIssueTooLongConstraintName(column, configuration));
		}
	}

	private void validateMissingPrecisionAttribute() {

		if (column.getSqmlType().is(SqmlDecimalType.get()) && column.getPrecision() == null) {
			acceptor.accept(new SqmlIssueMissingPrecisionAttribute(column));
		}
	}

	private boolean isEnum() {

		return column.getSqmlType() instanceof ISqmlEnum;
	}

	private boolean isString() {

		return column.getSqmlType().is(SqmlStringType.get());
	}

	private void validateTypeOfDefaultValue() {

		ISqmlDefaultValue defaultValue = column.getDefaultValue();
		if (defaultValue != null) {
			ISqmlType columnType = column.getSqmlType();
			ISqmlType defaultValueType = defaultValue.getSqmlType();
			if (defaultValueType.isAssignableTo(columnType)) {
				// okay
			} else if (defaultValueType.is(SqmlBuiltInTypes.getStringType())) {
				if (columnType.is(SqmlBuiltInTypes.getDayType()) || columnType.is(SqmlBuiltInTypes.getDayTimeType())
						|| columnType.is(SqmlBuiltInTypes.getTimeType()) || columnType instanceof ISqmlEnum) {
					// it is okay to assign from String to Day, DayTime and Enum
					// for default values
					// TODO: validate default value string
				} else {
					acceptor.accept(new SqmlIssueIncompatibleTypeOfDefaultValue(column));
				}
			} else if (columnType instanceof ISqmlTable && defaultValueType.is(SqmlBuiltInTypes.getIntegerType())) {
				// okay to assign integer to foreign key columns
			} else {
				acceptor.accept(new SqmlIssueIncompatibleTypeOfDefaultValue(column));
			}
		}
	}
}
