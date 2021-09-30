package com.softicar.sqml.model.builtin;

import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.utils.ISqmlJavaType;
import java.util.Collection;

public abstract class SqmlGenericType extends SqmlBuiltInType implements ISqmlGenericType {

	protected SqmlGenericType(String name, SqlFieldType fieldType) {

		super(name, fieldType);
	}

	@Override
	public boolean isAssignable(ISqmlTypeList typeList, ISqmlType targetType) {

		if (targetType instanceof SqmlParameterizedType) {
			// by default, a parameterized type is assignable if the raw type is
			// assignable to the target raw type and the type parameters are the
			// same
			SqmlParameterizedType targetParameterizedType = (SqmlParameterizedType) targetType;
			return isAssignableTo(targetParameterizedType.getGenericType()) && typeList.is(targetParameterizedType.getTypeParameters());
		} else {
			return false;
		}
	}

	@Override
	public ISqmlParameterizedType parameterize(ISqmlTypeList typeParameters) {

		return new SqmlParameterizedType(this, typeParameters);
	}

	@Override
	public ISqmlParameterizedType parameterize(ISqmlType...typeParameters) {

		return parameterize(new SqmlTypeList(typeParameters));
	}

	@Override
	public ISqmlParameterizedType parameterize(Collection<ISqmlType> typeParameters) {

		return parameterize(new SqmlTypeList(typeParameters));
	}

	@Override
	public ISqmlJavaType getJavaType(int parameterCount) {

		return getJavaType();
	}

	@Override
	public ISqmlJavaType getConcreteJavaType(int parameterCount) {

		return getConcreteJavaType();
	}
}
