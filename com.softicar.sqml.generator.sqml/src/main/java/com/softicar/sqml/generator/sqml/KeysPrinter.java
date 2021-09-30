package com.softicar.sqml.generator.sqml;

import com.softicar.platform.common.code.java.CodePrinter;
import com.softicar.platform.common.core.exceptions.SofticarUnknownEnumConstantException;
import com.softicar.platform.common.string.Imploder;
import com.softicar.platform.db.structure.column.IDbColumnStructure;
import com.softicar.platform.db.structure.key.DbKeyType;
import com.softicar.platform.db.structure.key.IDbKeyStructure;
import com.softicar.platform.db.structure.table.IDbTableStructure;
import com.softicar.sqml.generator.sqml.keyword.SqmlKeyword;
import com.softicar.sqml.model.tables.SqmlTableKeyNames;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class KeysPrinter {

	private final IDbTableStructure tableStructure;
	private final ColumnsPrinter columnsPrinter;

	public KeysPrinter(IDbTableStructure tableStructure, ColumnsPrinter columnsPrinter) {

		this.tableStructure = tableStructure;
		this.columnsPrinter = columnsPrinter;
	}

	public void print(CodePrinter printer) {

		boolean first = true;
		for (IDbKeyStructure keyStructure: tableStructure//
			.getKeys()
			.stream()
			.filter(this::isRelevantKey)
			.sorted(Comparator.comparing(IDbKeyStructure::getType))
			.collect(Collectors.toList())) {
			if (first) {
				printer.println();
				first = false;
			}

			String type = getKeyWord(keyStructure.getType());
			String columns = Imploder.implode(getLogicalColumnNames(keyStructure), " ");
			String implicitKeyName = getImplicitKeyName(keyStructure);
			if (!implicitKeyName.equals(keyStructure.getNameOrThrow())) {
				String name = getKeyName(keyStructure);
				printer.println("%s %s AS %s", type, columns, name);
			} else {
				printer.println("%s %s", type, columns);
			}
		}
	}

	private String getImplicitKeyName(IDbKeyStructure keyStructure) {

		return SqmlTableKeyNames
			.getImplicitKeyName(
				keyStructure//
					.getColumns()
					.stream()
					.filter(column -> !column.isIgnored())
					.map(this::getLogicalColumnName)
					.collect(Collectors.toList()));
	}

	private String getLogicalColumnName(IDbColumnStructure columnStructure) {

		return columnsPrinter.getColumnPrinter(columnStructure).getLogicalName();
	}

	private String getKeyName(IDbKeyStructure keyStructure) {

		String name = keyStructure.getNameOrThrow();
		if (SqmlKeyword.isKeyword(name)) {
			name = "^" + name;
		}
		return name;
	}

	private String getKeyWord(DbKeyType keyType) {

		switch (keyType) {
		case PRIMARY:
			return "PK";
		case UNIQUE:
			return "UK";
		case INDEX:
			return "IK";
		}
		throw new SofticarUnknownEnumConstantException(keyType);
	}

	private boolean isRelevantKey(IDbKeyStructure keyStructure) {

		return isRelevantType(keyStructure.getType()) && hasNonIgnoredColumns(keyStructure);
	}

	private boolean isRelevantType(DbKeyType keyType) {

		return keyType == DbKeyType.UNIQUE || keyType == DbKeyType.INDEX;
	}

	private boolean hasNonIgnoredColumns(IDbKeyStructure keyStructure) {

		return keyStructure//
			.getColumns()
			.stream()
			.anyMatch(column -> !column.isIgnored());
	}

	private List<String> getLogicalColumnNames(IDbKeyStructure keyStructure) {

		return keyStructure//
			.getColumns()
			.stream()
			.filter(column -> !column.isIgnored())
			.map(column -> columnsPrinter.getColumnPrinter(column).getLogicalName())
			.collect(Collectors.toList());
	}
}
