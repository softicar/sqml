package com.softicar.sqml.ui.hover.providers;

import com.softicar.sqml.model.selects.ISqmlTableVariable;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.ui.hover.AbstractSqmlElementHoverProvider;

public class SqmlTableVariableHoverProvider extends AbstractSqmlElementHoverProvider<ISqmlTableVariable> {

	@Override
	protected Class<ISqmlTableVariable> getElementClass() {

		return ISqmlTableVariable.class;
	}

	@Override
	protected String getFirstLine(ISqmlTableVariable tableVariable) {

		String variableName = tableVariable.getName();
		ISqmlTable table = tableVariable.getTable();
		if (table != null) {
			return String.format("<b>%s %s</b>", table.getClassName(), variableName);
		} else {
			return String.format("<b>%s</b>", variableName);
		}
	}
}
