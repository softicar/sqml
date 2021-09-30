package com.softicar.sqml.model.tables;

import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.platform.db.core.table.DbTableName;
import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.ISqmlTabular;
import com.softicar.sqml.model.tables.validation.SqmlTableValidator;
import com.softicar.sqml.model.types.ISqmlEnum;
import com.softicar.sqml.model.types.ISqmlTopLevelTypeDefinition;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.utils.ISqmlJavaType;
import com.softicar.sqml.model.validation.ISqmlValidatable;
import com.softicar.sqml.model.validation.ISqmlValidationContext;
import java.util.Collection;
import java.util.List;

public interface ISqmlTable extends ISqmlTabular, ISqmlTopLevelTypeDefinition, ISqmlValidatable {

	String getPhysicalNameOverride();

	@Override
	List<? extends ISqmlTableColumn> getColumns();

	List<? extends ISqmlTableKey> getTableKeys();

	Collection<ISqmlEnum> getEnums();

	boolean isEnumTable();

	List<? extends ISqmlTableRow> getRows();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default int getResultSetSize() {

		return SqmlTableMethods.getResultSetSize(this);
	}

	@Override
	default SqlFieldType getFieldType() {

		return null;
	}

	@Override
	default boolean is(ISqmlType sqlType) {

		return SqmlTableMethods.is(this, sqlType);
	}

	@Override
	default boolean isCollection() {

		return false;
	}

	@Override
	default boolean isTuple() {

		return false;
	}

	@Override
	default ISqmlType getElementType() {

		return SqmlTableMethods.getElementType(this);
	}

	@Override
	default boolean isAssignableTo(ISqmlType sqlType) {

		return SqmlTableMethods.isImplicit(this, sqlType);
	}

	@Override
	default ISqmlJavaType getJavaType() {

		return SqmlTableMethods.getJavaType(this);
	}

	@Override
	default ISqmlJavaType getConcreteJavaType() {

		return SqmlTableMethods.getConcreteJavaType(this);
	}

	default DbTableName getDbTableName() {

		return SqmlTableMethods.getDbTableName(this);
	}

	default JavaClassName getClassName() {

		return SqmlTableMethods.getClassName(this);
	}

	default ISqmlTableColumn getPrimarKeyColumn() {

		return SqmlTableMethods.getPrimarKeyColumn(this);
	}

	default List<ISqmlTableColumn> getPrimarKeyColumns() {

		return SqmlTableMethods.getPrimarKeyColumns(this);
	}

	@Override
	default String getDisplayName() {

		return SqmlTableMethods.getDisplayName(this);
	}

	default ISqmlTableColumn getColumn(String columnName) {

		return SqmlTableMethods.getColumn(this, columnName);
	}

	default ISqmlEnum getEnum(String enumName) {

		return SqmlTableMethods.getEnum(this, enumName);
	}

	@Override
	default void validate(ISqmlValidationContext context) {

		new SqmlTableValidator(this, context).validate();
	}
}
