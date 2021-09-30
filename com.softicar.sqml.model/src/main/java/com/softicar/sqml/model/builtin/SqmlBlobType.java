package com.softicar.sqml.model.builtin;

import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.sqml.model.utils.ISqmlJavaType;
import com.softicar.sqml.model.utils.SqmlJavaType;

public class SqmlBlobType extends SqmlBuiltInType {

	public SqmlBlobType() {

		super("Blob", SqlFieldType.BYTE_ARRAY);
	}

	public static SqmlBlobType get() {

		return SqmlBuiltInTypes.getBlobType();
	}

	@Override
	public ISqmlJavaType getJavaType() {

		return new SqmlJavaType(byte[].class);
	}
}
