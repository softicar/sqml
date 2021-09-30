package com.softicar.sqml.model.types;

import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.sqml.model.utils.ISqmlJavaType;
import java.util.Arrays;
import org.eclipse.xtext.naming.QualifiedName;

public interface ISqmlType {

	String getDisplayName();

	QualifiedName getQualifiedName();

	ISqmlJavaType getJavaType();

	ISqmlJavaType getConcreteJavaType();

	SqlFieldType getFieldType();

	default int getResultSetSize() {

		return 1;
	}

	default boolean is(ISqmlType other) {

		return this == other;
	}

	default boolean isIn(ISqmlType...types) {

		return Arrays.asList(types).stream().anyMatch(this::is);
	}

	default boolean isCollection() {

		return false;
	}

	default boolean isTuple() {

		return false;
	}

	default ISqmlType getElementType() {

		return SqmlTypes.getElementType(this);
	}

	/**
	 * Returns true if this type is assignable to the given type, i.e. is
	 * implicitly convertible to the target type.
	 *
	 * @param targetType
	 *            the target type
	 * @return true if this type is assignable to the target type
	 */
	default boolean isAssignableTo(ISqmlType targetType) {

		return is(targetType);
	}
}
