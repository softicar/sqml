package com.softicar.sqml.model.expressions;

import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.tables.ISqmlTableColumn;

public class SqmlValueReferences {

	public static boolean isIdColumn(ISqmlModelElement target) {

		if (target instanceof ISqmlTableColumn) {
			ISqmlTableColumn tableColumn = (ISqmlTableColumn) target;
			return tableColumn.isPrimaryKey() && tableColumn.isSerial();
		} else {
			return false;
		}
	}
}
