package com.softicar.sqml.model.builtin;

import com.softicar.sqml.model.utils.ISqmlJavaType;
import com.softicar.sqml.model.utils.SqmlJavaType;
import java.util.ArrayList;
import java.util.List;

public class SqmlListType extends AbstractSqmlCollectionType {

	public SqmlListType() {

		super("List", null);
	}

	@Override
	public ISqmlJavaType getJavaType() {

		return new SqmlJavaType(List.class);
	}

	@Override
	public ISqmlJavaType getConcreteJavaType() {

		return new SqmlJavaType(ArrayList.class);
	}
}
