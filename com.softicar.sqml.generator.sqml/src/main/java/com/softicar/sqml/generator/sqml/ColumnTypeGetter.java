package com.softicar.sqml.generator.sqml;

import com.softicar.platform.common.core.exceptions.SofticarUnknownEnumConstantException;
import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.platform.db.structure.column.IDbColumnStructure;

class ColumnTypeGetter {

	private final ISqmlFileGeneratorConfig config;
	private final ImportsPrinter importsPrinter;

	public ColumnTypeGetter(ISqmlFileGeneratorConfig config, ImportsPrinter importsPrinter) {

		this.config = config;
		this.importsPrinter = importsPrinter;
	}

	public String getType(IDbColumnStructure columnStructure) {

		if (columnStructure.isForeignKey()) {
			JavaClassName foreignClassName = new ForeignClassNameGetter(config).get(columnStructure);
			if (foreignClassName != null) {
				importsPrinter.addImport(foreignClassName);
				return foreignClassName.getSimpleName();
			}
		}

		SqlFieldType logicalFieldType = columnStructure.getFieldType();

		switch (logicalFieldType) {
		case BIG_DECIMAL:
			return "Decimal";
		case BOOLEAN:
			return "Boolean";
		case BYTE_ARRAY:
			return "Blob";
		case DAY:
			return "Day";
		case DAY_TIME:
			return "DayTime";
		case DOUBLE:
			return "Double";
		case ENUM:
			return EnumsPrinter.getEnumTypeName(columnStructure);
		case FLOAT:
			return "Float";
		case INTEGER:
			return "Integer";
		case LONG:
			return "Long";
		case STRING:
			return "String";
		case TIME:
			return "Time";
		}

		throw new SofticarUnknownEnumConstantException(logicalFieldType);
	}
}
