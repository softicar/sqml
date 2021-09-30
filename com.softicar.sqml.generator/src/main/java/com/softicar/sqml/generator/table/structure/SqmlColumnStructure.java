package com.softicar.sqml.generator.table.structure;

import com.softicar.platform.db.runtime.field.DbIntegerField;
import com.softicar.platform.db.runtime.field.DbLongField;
import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.platform.db.structure.column.DbColumnDefaultType;
import com.softicar.platform.db.structure.column.DbColumnStructure;
import com.softicar.platform.db.structure.table.IDbTableStructure;
import com.softicar.sqml.model.tables.ISqmlDefaultValue;
import com.softicar.sqml.model.tables.ISqmlTableColumn;
import java.util.Optional;

class SqmlColumnStructure extends DbColumnStructure {

	public SqmlColumnStructure(IDbTableStructure tableStructure, ISqmlTableColumn column) {

		super(tableStructure);

		ISqmlTableColumn columnOrTargetColumn = new InternalSqmlTransientTargetColumnFinder(column).findTargetColumn();

		setAutoIncrement(column.isSerial());
		setBase(column.isBaseColumn());
		setBits(determineBits(columnOrTargetColumn));
		setCharacterSet(column.getCharacterSet());
		setCollation(column.getCollation());
		setComment(column.getComment());
		setDefaultValue(determineDefaultValue(column));
		setDefaultType(determineDefaultValueType(column));
		setEnumValues(new InternalSqmlColumnEnumValuesDeterminer(column).determineEnumValues());
		setFieldType(columnOrTargetColumn.getTypeReference().getSqmlType().getFieldType());
		setLengthBits(determineLengthBits(column));
		setLogicalName(column.getName());
		setOnUpdateNow(column.isOnUpdateNow());
		setMaxLength(determineMaxLength(column));
		setName(column.getPhysicalName());
		setNullable(column.isNullable());
		setPrecision(determinePrecision(column));
		setScale(determineScale(column));
		setUnsigned(columnOrTargetColumn.isUnsigned());
		setTimestamp(column.isTimestamp());
	}

	private static int determineBits(ISqmlTableColumn columnOrTargetColumn) {

		if (columnOrTargetColumn.getBits() != null) {
			return columnOrTargetColumn.getBits();
		} else {
			SqlFieldType fieldType = columnOrTargetColumn.getTypeReference().getSqmlType().getFieldType();
			if (fieldType == SqlFieldType.INTEGER) {
				return DbIntegerField.DEFAULT_BITS;
			} else if (fieldType == SqlFieldType.LONG) {
				return DbLongField.DEFAULT_BITS;
			} else {
				return 0;
			}
		}
	}

	private static int determineLengthBits(ISqmlTableColumn column) {

		return Optional.ofNullable(column.getLengthBits()).orElse(0);
	}

	private static String determineDefaultValue(ISqmlTableColumn column) {

		ISqmlDefaultValue defaultValue = column.getDefaultValue();
		return defaultValue != null? defaultValue.getStringValue() : null;
	}

	private static DbColumnDefaultType determineDefaultValueType(ISqmlTableColumn column) {

		if (column.isDefaultNull()) {
			return DbColumnDefaultType.NULL;
		} else if (column.isDefaultNow()) {
			return DbColumnDefaultType.CURRENT_TIMESTAMP;
		} else {
			ISqmlDefaultValue defaultValue = column.getDefaultValue();
			return defaultValue != null? DbColumnDefaultType.NORMAL : DbColumnDefaultType.NONE;
		}
	}

	private static int determineMaxLength(ISqmlTableColumn column) {

		return Optional.ofNullable(column.getMaxLength()).orElse(0);
	}

	private static int determinePrecision(ISqmlTableColumn column) {

		return Optional.ofNullable(column.getPrecision()).orElse(0);
	}

	private static int determineScale(ISqmlTableColumn column) {

		return Optional.ofNullable(column.getScale()).orElse(0);
	}
}
