package com.softicar.sqml.generator.table.structure;

import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.types.ISqmlEnum;
import com.softicar.sqml.model.types.ISqmlEnumerator;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.types.SqmlEnum;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class InternalSqmlColumnEnumValuesDeterminer {

	private final ISqmlTableColumn column;

	public InternalSqmlColumnEnumValuesDeterminer(ISqmlTableColumn column) {

		this.column = column;
	}

	public List<String> determineEnumValues() {

		ISqmlType sqmlType = column.getSqmlType();
		if (sqmlType instanceof SqmlEnum) {
			return getEnumValues((SqmlEnum) sqmlType);
		} else {
			return Collections.emptyList();
		}
	}

	private static List<String> getEnumValues(ISqmlEnum sqmlEnum) {

		List<String> values = new ArrayList<>();
		for (ISqmlEnumerator enumerator: sqmlEnum.getEnumerators()) {
			values.add(enumerator.getStringValue());
		}
		return values;
	}
}
