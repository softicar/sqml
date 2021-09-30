package com.softicar.sqml.model.tables;

public class SqmlMissingTargetTableOfForeignKeyException extends RuntimeException {

	private final ISqmlTableColumn column;

	public SqmlMissingTargetTableOfForeignKeyException(ISqmlTableColumn column) {

		super(String.format("Missing target table for foreign key column: %s.%s", column.getTable().getName(), column.getName()));
		this.column = column;
	}

	public ISqmlTableColumn getColumn() {

		return column;
	}
}
