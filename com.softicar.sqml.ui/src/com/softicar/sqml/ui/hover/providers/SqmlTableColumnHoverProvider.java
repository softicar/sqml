package com.softicar.sqml.ui.hover.providers;

import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.ui.hover.AbstractSqmlElementHoverProvider;

public class SqmlTableColumnHoverProvider extends AbstractSqmlElementHoverProvider<ISqmlTableColumn> {

	@Override
	protected Class<ISqmlTableColumn> getElementClass() {

		return ISqmlTableColumn.class;
	}

	@Override
	protected String getFirstLine(ISqmlTableColumn tableColumn) {

		String typeName = tableColumn.getSqmlType().getDisplayName();
		String columnName = tableColumn.getName();
		String tableClassName = tableColumn.getTable().getClassName().getCanonicalName();
		return String.format("%s <b>%s</b> - %s", typeName, columnName, tableClassName);
	}
}
