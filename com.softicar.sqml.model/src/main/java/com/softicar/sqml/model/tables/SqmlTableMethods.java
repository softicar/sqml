package com.softicar.sqml.model.tables;

import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.platform.common.core.java.packages.name.JavaPackageName;
import com.softicar.platform.db.core.table.DbTableName;
import com.softicar.sqml.model.types.ISqmlEnum;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.types.SqmlTypes;
import com.softicar.sqml.model.utils.ISqmlJavaType;
import com.softicar.sqml.model.utils.SqmlJavaType;
import java.util.List;
import java.util.stream.Collectors;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class SqmlTableMethods {

	public static int getResultSetSize(ISqmlTable table) {

		return table.getColumns().size();
	}

	public static boolean is(ISqmlTable table, ISqmlType type) {

		if (type instanceof ISqmlTable) {
			ISqmlTable otherTable = (ISqmlTable) type;
			URI thisUri = EcoreUtil.getURI(table);
			URI thatUri = EcoreUtil.getURI(otherTable);
			return thisUri.equals(thatUri);
		} else {
			return false;
		}
	}

	public static ISqmlType getElementType(ISqmlTable table) {

		return SqmlTypes.getElementType(table);
	}

	public static boolean isImplicit(ISqmlTable table, ISqmlType type) {

		return is(table, type);
	}

	public static ISqmlJavaType getJavaType(ISqmlTable table) {

		JavaClassName className = getClassName(table);
		if (className != null) {
			return new SqmlJavaType(className);
		} else {
			return null;
		}
	}

	public static ISqmlJavaType getConcreteJavaType(ISqmlTable table) {

		return getJavaType(table);
	}

	public static DbTableName getDbTableName(ISqmlTable table) {

		String tableName = table.getPhysicalNameOverride();
		String[] nameParts = tableName.split("\\.");
		if (nameParts.length != 2) {
			throw new IllegalStateException(String.format("Internal error: Illegal table name '%s'. Must match '<database>.<table>'.", tableName));
		}
		return new DbTableName(nameParts[0], nameParts[1]);
	}

	public static JavaClassName getClassName(ISqmlTable table) {

		String tableName = table.getName();
		JavaPackageName packageName = table.getJavaPackageName();
		if (packageName != null && tableName != null) {
			return new JavaClassName(packageName, tableName);
		} else {
			return null;
		}
	}

	public static ISqmlTableColumn getPrimarKeyColumn(ISqmlTable table) {

		List<ISqmlTableColumn> primarKeyColumns = getPrimarKeyColumns(table);

		if (primarKeyColumns.size() == 1) {
			return primarKeyColumns.get(0);
		} else if (primarKeyColumns.isEmpty()) {
			throw new IllegalStateException(
				String
					.format(//
						"Internal error: Table '%s' is missing a primary key column.",
						table.getName()));
		} else {
			throw new IllegalStateException(
				String
					.format(//
						"Internal error: Table '%s' has more than one primary key column.",
						table.getName()));
		}
	}

	public static List<ISqmlTableColumn> getPrimarKeyColumns(ISqmlTable table) {

		return table
			.getColumns()//
			.stream()
			.filter(column -> column.isPrimaryKey())
			.collect(Collectors.toList());
	}

	public static String getDisplayName(ISqmlTable table) {

		return table.getQualifiedName().toString(".");
	}

	public static ISqmlTableColumn getColumn(ISqmlTable table, String columnName) {

		for (ISqmlTableColumn tableColumn: table.getColumns()) {
			if (tableColumn.getName().equals(columnName)) {
				return tableColumn;
			}
		}

		throw new RuntimeException(String.format("No column with name '%s' found in table '%s'.", columnName, table.getDisplayName()));
	}

	public static ISqmlEnum getEnum(ISqmlTable table, String enumName) {

		for (ISqmlEnum sqmlEnum: table.getEnums()) {
			if (sqmlEnum.getName().equals(enumName)) {
				return sqmlEnum;
			}
		}

		throw new RuntimeException(String.format("No enum with name '%s' found in table '%s'.", enumName, table.getDisplayName()));
	}
}
