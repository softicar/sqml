package com.softicar.sqml.ui.hover.providers;

import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.types.ISqmlEnum;
import com.softicar.sqml.model.utils.SqmlNavigation;
import com.softicar.sqml.ui.hover.AbstractSqmlElementHoverProvider;

public class SqmlEnumHoverProvider extends AbstractSqmlElementHoverProvider<ISqmlEnum> {

	@Override
	protected Class<ISqmlEnum> getElementClass() {

		return ISqmlEnum.class;
	}

	@Override
	protected String getFirstLine(ISqmlEnum sqmlEnum) {

		String enumName = sqmlEnum.getName();
		ISqmlTable table = SqmlNavigation.find(ISqmlTable.class, sqmlEnum);
		if (table != null) {
			return String.format("ENUM <b>%s</b> - %s", enumName, table.getClassName());
		} else {
			return String.format("ENUM <b>%s</b>", enumName);
		}
	}
}
