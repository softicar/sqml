package com.softicar.sqml.generator.table.structure;

import com.softicar.platform.common.core.exceptions.SofticarUnknownEnumConstantException;
import com.softicar.platform.db.structure.foreign.key.DbForeignKeyAction;
import com.softicar.platform.db.structure.foreign.key.DbForeignKeyStructure;
import com.softicar.platform.db.structure.table.IDbTableStructure;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.tables.SqmlForeignKeyAction;
import com.softicar.sqml.model.tables.SqmlMissingTargetTableOfForeignKeyException;
import java.util.Optional;

class SqmlForeignKeyStructure extends DbForeignKeyStructure {

	public SqmlForeignKeyStructure(IDbTableStructure tableStructure, ISqmlTableColumn column) {

		super(tableStructure);

		ISqmlTable foreignTable = column.getForeignKeyTargetTable().get();
		if (foreignTable.eIsProxy()) {
			throw new SqmlMissingTargetTableOfForeignKeyException(column);
		}

		setForeignTableName(foreignTable.getDbTableName());
		setName(determineName(column));
		setOnDeleteAction(determineForeignKeyAction(column.getOnDeleteAction()));
		setOnUpdateAction(determineForeignKeyAction(column.getOnUpdateAction()));
		addColumnPair(column.getPhysicalName(), foreignTable.getPrimarKeyColumn().getPhysicalName());
	}

	private static String determineName(ISqmlTableColumn column) {

		return Optional//
			.ofNullable(column.getConstraintName())
			.orElse(column.getPhysicalName());
	}

	private static DbForeignKeyAction determineForeignKeyAction(SqmlForeignKeyAction action) {

		switch (action) {
		case UNDEFINED:
			return DbForeignKeyAction.getDefault();
		case CASCADE:
			return DbForeignKeyAction.CASCADE;
		case NO_ACTION:
			return DbForeignKeyAction.NO_ACTION;
		case RESTRICT:
			return DbForeignKeyAction.RESTRICT;
		case SET_DEFAULT:
			return DbForeignKeyAction.SET_DEFAULT;
		case SET_NULL:
			return DbForeignKeyAction.SET_NULL;
		}
		throw new SofticarUnknownEnumConstantException(action);
	}
}
