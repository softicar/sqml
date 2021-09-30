package com.softicar.sqml.generator.sqml;

import com.softicar.platform.common.code.java.JavaIdentifier;
import com.softicar.platform.common.code.java.WordFragment;
import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.platform.db.structure.column.IDbColumnStructure;
import java.util.List;

public class ColumnNameDeterminer {

	private final ISqmlFileGeneratorConfig config;
	private final IDbColumnStructure columnStructure;

	public ColumnNameDeterminer(ISqmlFileGeneratorConfig config, IDbColumnStructure columnStructure) {

		this.config = config;
		this.columnStructure = columnStructure;
	}

	public String determineLogicalName() {

		List<WordFragment> fragments = WordFragment.parse(columnStructure.getLogicalName());
		if (columnStructure.isAutoIncrement()) {
			return "id";
		} else if (isForeignRowColumn()) {
			if (fragments.size() > 1) {
				if (fragments.get(0).getText().equals("id") && !Character.isDigit(fragments.get(1).getText().charAt(0))) {
					fragments.remove(0);
				}
				int last = fragments.size() - 1;
				if (fragments.get(last).getText().equalsIgnoreCase("id")) {
					fragments.remove(last);
				}
			}
			return getAsFieldName(fragments);
		} else if (columnStructure.getFieldType() == SqlFieldType.BOOLEAN) {
			if (fragments.size() > 1 && fragments.get(0).getText().equalsIgnoreCase("is")) {
				fragments.remove(0);
			}
			return getAsFieldName(fragments);
		} else {
			return getAsFieldName(fragments);
		}
	}

	private boolean isForeignRowColumn() {

		return columnStructure.isForeignKey() && new ForeignClassNameGetter(config).get(columnStructure) != null;
	}

	private String getAsFieldName(List<WordFragment> fragments) {

		String fieldName = new JavaIdentifier(fragments).asField();

		// for backwards compatibility
		String oldGetter = new JavaIdentifier(fragments).asGetter();
		String newGetter = new JavaIdentifier(fieldName).asGetter();
		if (!newGetter.equals(oldGetter)) {
			// TODO: remove this special case
			fieldName = columnStructure.getLogicalName();
		}

		return fieldName;
	}
}
