package com.softicar.sqml.generator.sqml;

import com.softicar.platform.common.core.exceptions.SofticarUnknownEnumConstantException;
import com.softicar.platform.common.code.java.CodePrinter;
import com.softicar.platform.common.string.Imploder;
import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.platform.db.structure.column.IDbColumnStructure;
import java.util.List;

class ColumnPrinter {

	private final ISqmlFileGeneratorConfig config;
	private final IDbColumnStructure columnStructure;
	private final String sqmlType;
	private final String logicalName;
	private final List<String> attributes;

	public ColumnPrinter(ISqmlFileGeneratorConfig config, ColumnTypeGetter typeGetter, IDbColumnStructure columnStructure) {

		this.config = config;
		this.columnStructure = columnStructure;
		this.sqmlType = typeGetter.getType(columnStructure);
		this.logicalName = new ColumnNameDeterminer(config, columnStructure).determineLogicalName();
		this.attributes = new ColumnAttributesDeterminer(this).determineAttributes();
	}

	public ISqmlFileGeneratorConfig getConfig() {

		return config;
	}

	public IDbColumnStructure getColumnStructure() {

		return columnStructure;
	}

	public String getLogicalName() {

		return logicalName;
	}

	public boolean isForeignRowColumn() {

		return columnStructure.isForeignKey() && new ForeignClassNameGetter(config).get(columnStructure) != null;
	}

	public void print(CodePrinter printer) {

		StringBuilder builder = new StringBuilder();

		// add PK prefix if necessary
		if (isPrimaryKey()) {
			builder.append("PK ");
		}

		// append type
		builder.append(sqmlType);

		// append logical name
		builder.append(' ').append(logicalName);

		appendBaseAssignment(builder);
		appendSerialAssignment(builder);
		appendDefaultAssignment(builder);

		// append optional attributes
		if (!attributes.isEmpty()) {
			builder.append(" [");
			builder.append(Imploder.implode(attributes, " "));
			builder.append("]");
		}

		printer.println(builder.toString());
	}

	private boolean isPrimaryKey() {

		return columnStructure//
			.getTableStructure()
			.getPrimaryKey()
			.map(primaryKey -> primaryKey.containsColumn(columnStructure))
			.orElse(false);
	}

	private void appendBaseAssignment(StringBuilder builder) {

		if (columnStructure.isBaseColumn()) {
			builder.append(" = BASE");
		}
	}

	private void appendSerialAssignment(StringBuilder builder) {

		if (columnStructure.isAutoIncrement()) {
			builder.append(" = SERIAL");
		}
	}

	private void appendDefaultAssignment(StringBuilder builder) {

		switch (columnStructure.getDefaultType()) {
		case CURRENT_TIMESTAMP:
			builder.append(" = NOW");
			break;
		case NONE:
			// nothing to do
			break;
		case NULL:
			builder.append(" = NULL");
			break;
		case NORMAL:
			builder.append(" = " + getDefaultValueString());
			break;
		}
	}

	private String getDefaultValueString() {

		SqlFieldType logicalFieldType = columnStructure.getFieldType();
		String defaultValue = columnStructure.getDefaultValue();

		switch (logicalFieldType) {
		case BIG_DECIMAL:
			return defaultValue;
		case BOOLEAN:
			return defaultValue.equals("0")? "FALSE" : "TRUE";
		case BYTE_ARRAY:
			throw new UnsupportedOperationException("Default values for blobs not implemented yet.");
		case DAY:
		case DAY_TIME:
		case STRING:
		case TIME:
			return "'" + defaultValue.replace("\\", "\\\\").replace("'", "\\'") + "'";
		case DOUBLE:
			return defaultValue + "d";
		case ENUM:
			return EnumsPrinter.getEnumDefaultValueString(columnStructure);
		case FLOAT:
			return defaultValue + "f";
		case INTEGER:
			return defaultValue;
		case LONG:
			return defaultValue + "L";
		}

		throw new SofticarUnknownEnumConstantException(logicalFieldType);
	}
}
