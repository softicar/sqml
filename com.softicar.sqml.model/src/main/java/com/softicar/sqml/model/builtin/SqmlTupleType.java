package com.softicar.sqml.model.builtin;

import com.softicar.platform.common.container.tuple.Tuple0;
import com.softicar.platform.common.container.tuple.Tuple1;
import com.softicar.platform.common.container.tuple.Tuple10;
import com.softicar.platform.common.container.tuple.Tuple2;
import com.softicar.platform.common.container.tuple.Tuple3;
import com.softicar.platform.common.container.tuple.Tuple4;
import com.softicar.platform.common.container.tuple.Tuple5;
import com.softicar.platform.common.container.tuple.Tuple6;
import com.softicar.platform.common.container.tuple.Tuple7;
import com.softicar.platform.common.container.tuple.Tuple8;
import com.softicar.platform.common.container.tuple.Tuple9;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.utils.ISqmlJavaType;
import com.softicar.sqml.model.utils.SqmlException;
import com.softicar.sqml.model.utils.SqmlJavaType;

public class SqmlTupleType extends SqmlGenericType {

	public SqmlTupleType() {

		super("Tuple", null);
	}

	public static SqmlTupleType get() {

		return SqmlBuiltInTypes.getTupleType();
	}

	@Override
	public boolean isAssignable(ISqmlTypeList typeList, ISqmlType targetType) {

		if (super.isAssignable(typeList, targetType)) {
			return true;
		}

		// use of tuple as collection initializer?
		if (targetType.isCollection() && targetType instanceof ISqmlParameterizedType) {
			ISqmlParameterizedType targetParameterizedType = (ISqmlParameterizedType) targetType;
			ISqmlType targetElementType = targetParameterizedType.getElementType();
			for (ISqmlType sqmlType: typeList) {
				if (!sqmlType.is(targetElementType)) {
					return false;
				}
			}
			return true;
		}

		return false;
	}

	@Override
	public boolean isTuple() {

		return true;
	}

	@Override
	public ISqmlJavaType getJavaType() {

		return getJavaType(0);
	}

	@Override
	public ISqmlJavaType getJavaType(int parameterCount) {

		return new SqmlJavaType(getTupleClass(parameterCount));
	}

	private static Class<?> getTupleClass(int size) {

		switch (size) {
		case 0:
			return Tuple0.class;
		case 1:
			return Tuple1.class;
		case 2:
			return Tuple2.class;
		case 3:
			return Tuple3.class;
		case 4:
			return Tuple4.class;
		case 5:
			return Tuple5.class;
		case 6:
			return Tuple6.class;
		case 7:
			return Tuple7.class;
		case 8:
			return Tuple8.class;
		case 9:
			return Tuple9.class;
		case 10:
			return Tuple10.class;
		}

		throw new SqmlException("Maximum of 10 tuple parameters exceeded.");
	}
}
