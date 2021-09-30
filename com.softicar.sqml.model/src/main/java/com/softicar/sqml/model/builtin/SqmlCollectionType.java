package com.softicar.sqml.model.builtin;

import com.softicar.sqml.model.utils.ISqmlJavaType;
import com.softicar.sqml.model.utils.SqmlJavaType;
import java.util.ArrayList;
import java.util.Collection;

public class SqmlCollectionType extends AbstractSqmlCollectionType {

	public SqmlCollectionType() {

		super("Collection", null);
	}

	@Override
	public ISqmlJavaType getJavaType() {

		return new SqmlJavaType(Collection.class);
	}

	@Override
	public ISqmlJavaType getConcreteJavaType() {

		return new SqmlJavaType(ArrayList.class);
	}
}
