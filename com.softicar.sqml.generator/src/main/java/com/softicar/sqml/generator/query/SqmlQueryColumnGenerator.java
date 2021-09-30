package com.softicar.sqml.generator.query;

import com.softicar.platform.common.code.java.JavaIdentifier;
import com.softicar.platform.common.core.exceptions.SofticarUnknownEnumConstantException;
import com.softicar.platform.common.core.i18n.IDisplayString;
import com.softicar.platform.common.core.i18n.key.computer.I18nKeyComputer;
import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.platform.db.runtime.query.DbQueryColumn;
import com.softicar.platform.db.runtime.query.DbQueryTableColumn;
import com.softicar.platform.db.runtime.query.DbQueryTableStubColumn;
import com.softicar.platform.db.runtime.query.IDbQueryColumn;
import com.softicar.platform.db.runtime.query.IDbQueryTableColumn;
import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.platform.db.sql.type.SqlValueTypes;
import com.softicar.sqml.generator.common.SqmlJavaCodePrinter;
import com.softicar.sqml.generator.preferences.ISqmlGeneratorPreferences;
import com.softicar.sqml.generator.query.clazz.version.SqmlQueryClassVersionEnum;
import com.softicar.sqml.generator.table.clazz.version.SqmlTableClassVersionEnum;
import com.softicar.sqml.model.selects.ISqmlSelectColumn;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.utils.ISqmlJavaType;
import java.util.Optional;

public class SqmlQueryColumnGenerator {

	private static final String COLUMN_CONSTANT_SUFFIX = "_COLUMN";
	private final ISqmlGeneratorPreferences preferences;
	private final SqmlJavaCodePrinter printer;
	private final ISqmlSelectColumn selectColumn;
	private final int logicalIndex;
	private final JavaIdentifier columnName;
	private final JavaIdentifier columnConstantName;
	private final ISqmlType columnType;
	private final ISqmlJavaType columnJavaType;

	public SqmlQueryColumnGenerator(SqmlQueryGenerator generator, ISqmlSelectColumn selectColumn, int logicalIndex) {

		this.preferences = generator.getPreferences();
		this.printer = generator.getPrinter();
		this.selectColumn = selectColumn;
		this.logicalIndex = logicalIndex;
		this.columnName = new JavaIdentifier(selectColumn.getName());
		this.columnConstantName = getNameOfColumnConstant(selectColumn);
		this.columnType = selectColumn.getSqmlType();
		this.columnJavaType = columnType.getJavaType();
	}

	public static JavaIdentifier getNameOfColumnConstant(ISqmlSelectColumn selectColumn) {

		return new JavaIdentifier(selectColumn.getName() + COLUMN_CONSTANT_SUFFIX);
	}

	public ISqmlSelectColumn getSelectColumn() {

		return selectColumn;
	}

	public JavaIdentifier getColumnName() {

		return columnName;
	}

	public JavaIdentifier getColumnConstantName() {

		return columnConstantName;
	}

	public ISqmlType getColumnType() {

		return columnType;
	}

	public void printConstant() {

		Class<?> queryColumnInterface = getColumnInterface();
		Class<?> queryColumnClass = getColumnClass();

		printer.addImport(queryColumnInterface);
		printer.addImport(queryColumnClass);
		printer.addImports(columnJavaType.getImports());

		String simpleName = columnJavaType.getSimpleName();

		if (preferences.getGeneratedQueryCodeVersion().isEqualOrLater(SqmlQueryClassVersionEnum.VERSION_20200502)) {
			printer
				.println(
					"%s<%s, %s> %s = new %s<>(%s::%s, \"%s\", %s%s);",
					queryColumnInterface.getSimpleName(),
					QueryRowGenerator.ROW_INTERFACE,
					simpleName,
					columnConstantName.asConstant(),
					queryColumnClass.getSimpleName(),
					QueryRowGenerator.ROW_INTERFACE,
					columnName.asGetter(),
					selectColumn.getName(),
					determineValueTypeReference(),
					selectColumn.getTitle() != null? ", " + determineTitleParameter() : "");
		} else {
			printer
				.println(
					"%s<%s, %s> %s = new %s<>(%s::%s, %d, \"%s\", %s%s);",
					queryColumnInterface.getSimpleName(),
					QueryRowGenerator.ROW_INTERFACE,
					simpleName,
					columnConstantName.asConstant(),
					queryColumnClass.getSimpleName(),
					QueryRowGenerator.ROW_INTERFACE,
					columnName.asGetter(),
					logicalIndex,
					selectColumn.getName(),
					determineValueTypeReference(),
					selectColumn.getTitle() != null? String.format(", \"%s\"", selectColumn.getTitle()) : "");
		}
	}

	private Class<?> getColumnInterface() {

		if (isTableColumn()) {
			return IDbQueryTableColumn.class;
		} else {
			return IDbQueryColumn.class;
		}
	}

	private Class<?> getColumnClass() {

		if (isTableStubColumn()) {
			return DbQueryTableStubColumn.class;
		} else if (isTableColumn()) {
			return DbQueryTableColumn.class;
		} else {
			return DbQueryColumn.class;
		}
	}

	private boolean isTableColumn() {

		return selectColumn.getSqmlType() instanceof ISqmlTable;
	}

	private boolean isTableStubColumn() {

		return isTableColumn() && !selectColumn.isDotStarTableVariableReference();
	}

	private String determineTitleParameter() {

		Optional<JavaClassName> i18nClass = preferences.getI18nClassAsOptional();
		if (isEmptyTitle()) {
			printer.addImport(IDisplayString.class);
			return String.format("%s.EMPTY", IDisplayString.class.getSimpleName());
		} else if (i18nClass.isPresent()) {
			printer.addImport(i18nClass.get());
			return String
				.format(//
					"%s.%s",
					i18nClass.get().getSimpleName(),
					new I18nKeyComputer(selectColumn.getTitle()).compute());
		} else {
			printer.addImport(IDisplayString.class);
			if (preferences.getGeneratedTableCodeVersion().isBefore(SqmlTableClassVersionEnum.VERSION_20201015)) {
				return String
					.format(//
						"%s.createI18n(\"%s\")",
						IDisplayString.class.getSimpleName(),
						selectColumn.getTitle());
			} else {
				return String
					.format(//
						"%s.create(\"%s\")",
						IDisplayString.class.getSimpleName(),
						selectColumn.getTitle());
			}
		}
	}

	private boolean isEmptyTitle() {

		return Optional//
			.ofNullable(selectColumn.getTitle())
			.map(String::trim)
			.map(String::isEmpty)
			.orElse(true);
	}

	private String determineValueTypeReference() {

		if (getColumnType() instanceof ISqmlTable) {
			return getColumnType().getJavaType().getSimpleName() + ".TABLE";
		}

		SqlFieldType fieldType = getColumnType().getFieldType();
		switch (fieldType) {
		case BOOLEAN:
		case INTEGER:
		case LONG:
		case FLOAT:
		case DOUBLE:
		case BIG_DECIMAL:
		case STRING:
		case BYTE_ARRAY:
		case DAY:
		case DAY_TIME:
		case TIME:
			printer.addImport(SqlValueTypes.class);
			return SqlValueTypes.class.getSimpleName() + "." + fieldType.toString();
		case ENUM:
			printer.addImport(SqlValueTypes.class);
			return SqlValueTypes.class.getSimpleName() + ".createEnumType(" + columnJavaType.getSimpleName() + ".class)";
		}

		throw new SofticarUnknownEnumConstantException(fieldType);
	}

	public void printField() {

		printer.addImports(columnJavaType.getImports());
		printer.println("private final %s %s;", columnJavaType.getSimpleNameWithTypeParameters(), columnName.asField());
	}

	public void printInterfaceGetter() {

		printer.addImports(columnJavaType.getImports());
		printer.println("%s %s();", columnJavaType.getSimpleNameWithTypeParameters(), columnName.asGetter());
	}

	public void printGetter() {

		printer.addImports(columnJavaType.getImports());
		printer.println("@Override");
		printer.beginMethod("public %s %s()", columnJavaType.getSimpleNameWithTypeParameters(), columnName.asGetter());
		printer.println("return this.%s;", columnName.asField());
		printer.endMethod();
	}

	public void printSetter() {

		printer.addImports(columnJavaType.getImports());
		printer.beginMethod("public void %s(%s %s)", columnName.asSetter(), columnJavaType.getSimpleName(), columnName.asParameter());
		printer.println("this.%s = %s;", columnName.asField(), columnName.asParameter());
		printer.endMethod();
	}

	public void printResultSetAssignment(String selectName, String resultSetName) {

		String fieldName = getColumnName().asField();
		String constantName = getColumnConstantName().asConstant();
		printer.println("this.%s = %s.loadValue(%s, %s);", fieldName, constantName, selectName, resultSetName);
	}
}
