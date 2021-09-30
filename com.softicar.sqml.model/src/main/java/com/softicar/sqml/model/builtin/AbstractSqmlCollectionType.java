package com.softicar.sqml.model.builtin;

import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.sqml.model.types.ISqmlType;

public abstract class AbstractSqmlCollectionType extends SqmlGenericType {

	public AbstractSqmlCollectionType(String name, SqlFieldType fieldType) {

		super(name, fieldType);
	}

	@Override
	public boolean isCollection() {

		return true;
	}

	@Override
	public boolean isAssignableTo(ISqmlType targetType) {

		return is(targetType) || targetType.is(SqmlBuiltInTypes.getCollectionType());
	}
}
