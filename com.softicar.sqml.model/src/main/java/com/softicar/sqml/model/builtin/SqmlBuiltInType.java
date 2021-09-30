package com.softicar.sqml.model.builtin;

import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.types.impl.AbstractSqmlTypeDefinitionImpl;
import com.softicar.sqml.model.utils.ISqmlJavaType;
import org.eclipse.xtext.naming.QualifiedName;

public abstract class SqmlBuiltInType extends AbstractSqmlTypeDefinitionImpl {

	private final QualifiedName qualifiedName;
	private final SqlFieldType fieldType;

	protected SqmlBuiltInType(String name, SqlFieldType fieldType) {

		this.qualifiedName = QualifiedName.create(name);
		this.fieldType = fieldType;
		setName(name);
	}

	@Override
	public boolean isAssignableTo(ISqmlType targetType) {

		return targetType == this;
	}

	@Override
	public void accept(ISqmlModelVisitor visitor) {

		// TODO
		// visitor.visit(this);
	}

	@Override
	public SqlFieldType getFieldType() {

		return fieldType;
	}

	@Override
	public String getDisplayName() {

		return getName();
	}

	@Override
	public QualifiedName getQualifiedName() {

		return qualifiedName;
	}

	@Override
	public ISqmlJavaType getConcreteJavaType() {

		return getJavaType();
	}
}
