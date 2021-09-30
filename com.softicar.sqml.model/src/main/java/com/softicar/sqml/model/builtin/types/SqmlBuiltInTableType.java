package com.softicar.sqml.model.builtin.types;

import com.softicar.platform.db.sql.ISqlTable;
import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.types.impl.SqmlValueTypeImpl;
import com.softicar.sqml.model.utils.ISqmlJavaType;
import com.softicar.sqml.model.utils.SqmlJavaType;
import org.eclipse.xtext.naming.QualifiedName;

public class SqmlBuiltInTableType extends SqmlValueTypeImpl {

	private static final ISqmlJavaType JAVA_TYPE = new SqmlJavaType(ISqlTable.class);
	private static final String NAME = "Table";

	private SqmlBuiltInTableType() {

		// use factory
	}

	public static SqmlBuiltInTableType get() {

		return new SqmlBuiltInTableType();
	}

	@Override
	public int getResultSetSize() {

		throw new UnsupportedOperationException();
	}

	@Override
	public ISqmlJavaType getJavaType() {

		return JAVA_TYPE;
	}

	@Override
	public SqlFieldType getFieldType() {

		throw new UnsupportedOperationException();
	}

	@Override
	public boolean is(ISqmlType other) {

		return false;
	}

	@Override
	public boolean isAssignableTo(ISqmlType targetType) {

		return false;
	}

	@Override
	public String getDisplayName() {

		return NAME;
	}

	@Override
	public QualifiedName getQualifiedName() {

		return QualifiedName.create(NAME);
	}
}
