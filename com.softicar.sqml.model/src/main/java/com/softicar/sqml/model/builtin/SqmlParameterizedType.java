package com.softicar.sqml.model.builtin;

import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.types.SqmlTypes;
import com.softicar.sqml.model.utils.ISqmlJavaType;
import com.softicar.sqml.model.utils.SqmlJavaType;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.naming.QualifiedName;

/**
 * Represents the parameterization of a generic type.
 * 
 * @author Oliver Richers
 */
public class SqmlParameterizedType implements ISqmlParameterizedType {

	private final ISqmlGenericType genericType;
	private final ISqmlTypeList typeParameters;

	public SqmlParameterizedType(ISqmlGenericType genericType, ISqmlTypeList typeParameters) {

		this.genericType = genericType;
		this.typeParameters = typeParameters;
	}

	@Override
	public boolean is(ISqmlType other) {

		if (other instanceof SqmlParameterizedType) {
			SqmlParameterizedType otherGenericType = (SqmlParameterizedType) other;
			return genericType.is(otherGenericType.genericType) && getTypeParameters().is(otherGenericType.getTypeParameters());
		} else {
			return false;
		}
	}

	@Override
	public boolean isCollection() {

		return genericType.isCollection();
	}

	@Override
	public boolean isTuple() {

		return genericType.isTuple();
	}

	@Override
	public ISqmlType getElementType() {

		return SqmlTypes.getElementType(this);
	}

	@Override
	public boolean isAssignableTo(ISqmlType targetType) {

		return genericType.isAssignable(getTypeParameters(), targetType);
	}

	@Override
	public String getDisplayName() {

		return genericType.getDisplayName() + getTypeParameters().getDisplayName();
	}

	@Override
	public QualifiedName getQualifiedName() {

		return genericType.getQualifiedName();
	}

	@Override
	public int getResultSetSize() {

		return genericType.getResultSetSize();
	}

	@Override
	public ISqmlJavaType getJavaType() {

		List<ISqmlJavaType> javaTypeParameters = new ArrayList<>();
		for (ISqmlType parameterType: typeParameters) {
			javaTypeParameters.add(parameterType.getJavaType());
		}
		ISqmlJavaType genericJavaType = genericType.getJavaType(typeParameters.size());
		return new SqmlJavaType(genericJavaType.getClassName(), javaTypeParameters);
	}

	@Override
	public ISqmlJavaType getConcreteJavaType() {

		List<ISqmlJavaType> javaTypeParameters = new ArrayList<>();
		for (ISqmlType parameterType: typeParameters) {
			javaTypeParameters.add(parameterType.getConcreteJavaType());
		}
		ISqmlJavaType genericJavaType = genericType.getConcreteJavaType(typeParameters.size());
		return new SqmlJavaType(genericJavaType.getClassName(), javaTypeParameters);
	}

	@Override
	public SqlFieldType getFieldType() {

		return genericType.getFieldType();
	}

	@Override
	public ISqmlGenericType getGenericType() {

		return genericType;
	}

	@Override
	public ISqmlTypeList getTypeParameters() {

		return typeParameters;
	}
}
