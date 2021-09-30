package com.softicar.sqml.model.tables;

import com.softicar.sqml.model.ISqmlColumn;
import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.builtin.SqmlBlobType;
import com.softicar.sqml.model.builtin.SqmlDecimalType;
import com.softicar.sqml.model.builtin.SqmlIntegerType;
import com.softicar.sqml.model.builtin.SqmlStringType;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.types.ISqmlTypeReference;
import com.softicar.sqml.model.validation.ISqmlValidatable;
import com.softicar.sqml.model.validation.ISqmlValidationContext;
import java.util.Optional;

public interface ISqmlTableColumn extends ISqmlValidatable, ISqmlColumn {

	ISqmlTable getTable();

	/**
	 * Returns the logical name of this table column.
	 *
	 * @return logical column name (never null)
	 */
	@Override
	String getName();

	/**
	 * Returns the physical name of this table column.
	 * <p>
	 * The physical column name is either equal to the logical name returned by
	 * {@link #getName()} or defined by a special override parameter.
	 *
	 * @return the physical name of this column (never null)
	 */
	default String getPhysicalName() {

		if (getPhysicalNameOverride() != null) {
			return getPhysicalNameOverride();
		} else {
			return getName();
		}
	}

	String getPhysicalNameOverride();

	ISqmlTypeReference getTypeReference();

	boolean isPrimaryKey();

	boolean isSerial();

	boolean isBaseColumn();

	boolean isNullable();

	/**
	 * Specifies the bit width of this column.
	 * <p>
	 * This method is only valid for columns of type {@link SqmlIntegerType}. It
	 * returns null for other types of columns.
	 * <p>
	 * Valid returns values are 8, 16, 24 and 32.
	 *
	 * @return the number of bits used to encode the integer, or null if
	 *         unspecified
	 */
	Integer getBits();

	boolean isUnsigned();

	/**
	 * Returns the {@link SqmlForeignKeyAction} to be executed when the target
	 * row is deleted.
	 *
	 * @return the ON DELETE action (may be null)
	 */
	SqmlForeignKeyAction getOnDeleteAction();

	/**
	 * Returns the {@link SqmlForeignKeyAction} to be executed when the target
	 * row is updated.
	 *
	 * @return the ON UPDATE action (may be null)
	 */
	SqmlForeignKeyAction getOnUpdateAction();

	/**
	 * Specifies if this columns shall be assigned the current timestamp when
	 * the row is updated.
	 *
	 * @return <i>true</i> if it shall be updated; <i>false</i> otherwise
	 */
	boolean isOnUpdateNow();

	/**
	 * Specifies if this columns is based on the SQL type <i>TIMESTAMP</i> or
	 * rather <i>DATETIME</i>.
	 *
	 * @return <i>true</i> if it is based on <i>TIMESTAMP</i>; <i>false</i>
	 *         otherwise
	 */
	boolean isTimestamp();

	/**
	 * Specifies the total count of significant decimal digits of this column.
	 * <p>
	 * This method is only valid for columns of type {@link SqmlDecimalType} and
	 * returns null for other types of columns.
	 *
	 * @return the number of significant digits, or null if unspecified
	 */
	Integer getPrecision();

	/**
	 * Specifies the count of decimal digits in the fractional part of this
	 * column.
	 * <p>
	 * This method is only valid for columns of type {@link SqmlDecimalType} and
	 * returns null for other types of columns.
	 *
	 * @return the number of significant digits, or null if unspecified
	 */
	Integer getScale();

	/**
	 * Specifies the maximum length of this column.
	 * <p>
	 * This method is only valid for columns of type {@link SqmlStringType} and
	 * {@link SqmlBlobType}. It returns null for other types of columns.
	 * <p>
	 * The length is given in characters for {@link SqmlStringType} and in bytes
	 * for {@link SqmlBlobType}.
	 *
	 * @return the maximum number of characters or bytes, or null if unspecified
	 */
	Integer getMaxLength();

	/**
	 * Specifies the bits used to represent the length of this column.
	 * <p>
	 * This method is only valid for columns of type {@link SqmlStringType} and
	 * {@link SqmlBlobType}. It returns null for other types of columns.
	 * <p>
	 * Valid returns values are 8, 16, 24 and 32.
	 *
	 * @return the length bits, or null if unspecified
	 */
	Integer getLengthBits();

	String getCharacterSet();

	String getCollation();

	boolean isDefaultNull();

	boolean isDefaultNow();

	ISqmlDefaultValue getDefaultValue();

	String getComment();

	/**
	 * Returns the name of the foreign key constraint on this column.
	 * <p>
	 * If no name is given, this method will return null. In that case, the
	 * physical column name returned by {@link #getPhysicalName()} should be
	 * considered as constraint name.
	 *
	 * @return the foreign key constraint name (may be null)
	 */
	String getConstraintName();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default void validate(ISqmlValidationContext context) {

		SqmlTableColumnMethods.validate(this, context);
	}

	@Override
	default ISqmlType getSqmlType() {

		return getTypeReference().getSqmlType();
	}

	default Optional<ISqmlTable> getForeignKeyTargetTable() {

		return SqmlTableColumnMethods.getForeignKeyTargetTable(this);
	}
}
