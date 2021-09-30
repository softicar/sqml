package com.softicar.sqml.generator.sqml;

import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.platform.db.structure.column.IDbColumnStructure;
import com.softicar.platform.db.structure.foreign.key.DbForeignKeyAction;
import com.softicar.platform.db.structure.foreign.key.IDbForeignKeyStructure;
import com.softicar.sqml.generator.sqml.keyword.SqmlKeyword;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ColumnAttributesDeterminer {

	private final ColumnPrinter printer;
	private final IDbColumnStructure columnStructure;
	private final String logicalName;
	private final String physicalName;
	private final List<String> attributes = new ArrayList<>();

	public ColumnAttributesDeterminer(ColumnPrinter printer) {

		this.printer = printer;
		this.columnStructure = printer.getColumnStructure();
		this.logicalName = printer.getLogicalName();
		this.physicalName = columnStructure.getNameOrThrow();
	}

	public List<String> determineAttributes() {

		addPhysicalNameOverride();
		addNullable();
		addBits();
		addUnsigned();
		addMaxLength();
		addLengthBits();
		addCharacterSet();
		addCollation();
		addOnUpdateNow();
		addTimestamp();
		addPrecision();
		addFkAttributes();
		addComment();

		return attributes;
	}

	// ------------------------------ generic attributes ------------------------------ //

	private void addPhysicalNameOverride() {

		if (!logicalName.equals(physicalName)) {
			attributes.add(String.format("'%s'", physicalName));
		}
	}

	private void addNullable() {

		if (columnStructure.isNullable()) {
			attributes.add(SqmlKeyword.NULLABLE.name());
		}
	}

	private void addComment() {

		String comment = columnStructure.getComment();
		if (isGiven(comment)) {
			comment = comment.replace("'", "\\'");
			attributes.add(String.format("%s='%s'", SqmlKeyword.COMMENT.name(), comment));
		}
	}

	// ------------------------------ integer attributes ------------------------------ //

	private void addBits() {

		int bits = columnStructure.getBits();
		if (isType(SqlFieldType.INTEGER) && !isForeignRowColumn() && bits > 0 && bits != 32) {
			attributes.add(String.format("%s=%s", SqmlKeyword.BITS.name(), bits));
		}
	}

	private void addUnsigned() {

		if ((isType(SqlFieldType.INTEGER) || isType(SqlFieldType.LONG)) && !isForeignRowColumn() && columnStructure.isUnsigned()) {
			attributes.add(SqmlKeyword.UNSIGNED.name());
		}
	}

	// ------------------------------ string and blob attributes ------------------------------ //

	private void addMaxLength() {

		int maxLength = columnStructure.getMaxLength();
		if (isTypeIn(SqlFieldType.STRING, SqlFieldType.BYTE_ARRAY) && maxLength > 0) {
			attributes.add(String.format("%s=%s", SqmlKeyword.MAXLENGTH.name(), maxLength));
		}
	}

	private void addLengthBits() {

		int lengthBits = columnStructure.getLengthBits();
		if (isTypeIn(SqlFieldType.STRING, SqlFieldType.BYTE_ARRAY) && lengthBits > 0) {
			attributes.add(String.format("%s=%s", SqmlKeyword.LENGTHBITS.name(), lengthBits));
		}
	}

	private void addCharacterSet() {

		String characterSet = columnStructure.getCharacterSet();
		if (isTypeIn(SqlFieldType.STRING, SqlFieldType.ENUM) && isGiven(characterSet)) {
			attributes.add(String.format("%s %s='%s'", SqmlKeyword.CHARACTER.name(), SqmlKeyword.SET.name(), characterSet));
		}
	}

	private void addCollation() {

		String collation = columnStructure.getCollation();
		if (isTypeIn(SqlFieldType.STRING, SqlFieldType.ENUM) && isGiven(collation)) {
			attributes.add(String.format("%s='%s'", SqmlKeyword.COLLATION.name(), collation));
		}
	}

	// ------------------------------ daytime attributes ------------------------------ //

	private void addOnUpdateNow() {

		if (isType(SqlFieldType.DAY_TIME) && columnStructure.isOnUpdateNow()) {
			attributes.add("ON UPDATE NOW");
		}
	}

	private void addTimestamp() {

		if (isType(SqlFieldType.DAY_TIME) && columnStructure.isTimestamp()) {
			attributes.add("TIMESTAMP");
		}
	}

	// ------------------------------ decimal attributes ------------------------------ //

	private void addPrecision() {

		int precision = columnStructure.getPrecision();
		int scale = columnStructure.getScale();
		if (isType(SqlFieldType.BIG_DECIMAL) && precision > 0) {
			attributes.add(String.format("%s=%s,%s", SqmlKeyword.PRECISION.name(), precision, scale));
		}
	}

	// ------------------------------ foreign key attributes ------------------------------ //

	private void addFkAttributes() {

		columnStructure.getForeignKeyStructure().ifPresent(this::addOnDeleteAction);
		columnStructure.getForeignKeyStructure().ifPresent(this::addOnUpdateAction);
		columnStructure.getForeignKeyStructure().ifPresent(this::addConstraintName);
	}

	private void addOnDeleteAction(IDbForeignKeyStructure foreignKeyStructure) {

		addForeignKeyAction("DELETE", foreignKeyStructure.getOnDeleteAction());
	}

	private void addOnUpdateAction(IDbForeignKeyStructure foreignKeyStructure) {

		addForeignKeyAction("UPDATE", foreignKeyStructure.getOnUpdateAction());
	}

	private void addForeignKeyAction(String trigger, DbForeignKeyAction action) {

		if (action == DbForeignKeyAction.getDefault()) {
			// nothing to add for default action
		} else {
			attributes.add(String.format("ON %s %s", trigger, action.name()));
		}
	}

	private void addConstraintName(IDbForeignKeyStructure foreignKeyStructure) {

		String foreignKeyName = foreignKeyStructure.getName().orElse(null);
		if (foreignKeyName != null && !foreignKeyName.equals(columnStructure.getNameOrThrow())) {
			attributes.add(String.format("CONSTRAINT_NAME='%s'", foreignKeyName));
		}
	}

	// ------------------------------ miscellaneous ------------------------------ //

	private boolean isType(SqlFieldType type) {

		return columnStructure.getFieldType() == type;
	}

	private boolean isTypeIn(SqlFieldType...types) {

		return Arrays.asList(types).stream().anyMatch(this::isType);
	}

	private boolean isGiven(String string) {

		return string != null && !string.isEmpty();
	}

	private boolean isForeignRowColumn() {

		return printer.isForeignRowColumn();
	}
}
