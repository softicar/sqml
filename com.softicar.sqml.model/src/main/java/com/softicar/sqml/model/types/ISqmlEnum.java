package com.softicar.sqml.model.types;

import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.sqml.model.ISqmlGlobalObject;
import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.utils.ISqmlJavaType;
import java.util.List;
import org.eclipse.xtext.naming.QualifiedName;

public interface ISqmlEnum extends ISqmlTypeDefinition, ISqmlGlobalObject {

	ISqmlTypeReference getTypeReference();

	List<? extends ISqmlEnumerator> getEnumerators();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default ISqmlType getElementType() {

		return SqmlTypes.getElementType(this);
	}

	@Override
	default boolean isAssignableTo(ISqmlType targetType) {

		return is(targetType);
	}

	default ISqmlType getLiteralValueType() {

		return SqmlEnumMethods.getLiteralValueType(this);
	}

	@Override
	default SqlFieldType getFieldType() {

		return SqlFieldType.ENUM;
	}

	@Override
	default ISqmlJavaType getJavaType() {

		return SqmlEnumMethods.getJavaType(this);
	}

	@Override
	default ISqmlJavaType getConcreteJavaType() {

		return SqmlEnumMethods.getJavaType(this);
	}

	@Override
	default String getDisplayName() {

		return getName();
	}

	@Override
	default QualifiedName getQualifiedName() {

		return SqmlEnumMethods.getQualifiedName(this);
	}
}
