package com.softicar.sqml.model.builtin;

import com.softicar.sqml.model.utils.ISqmlJavaType;
import com.softicar.sqml.model.utils.SqmlJavaType;
import java.util.Set;
import java.util.TreeSet;

public class SqmlSetType extends AbstractSqmlCollectionType {

	public SqmlSetType() {

		super("Set", null);
	}

	public static SqmlSetType get() {

		return SqmlBuiltInTypes.getSetType();
	}

	@Override
	public ISqmlJavaType getJavaType() {

		return new SqmlJavaType(Set.class);
	}

	@Override
	public ISqmlJavaType getConcreteJavaType() {

		return new SqmlJavaType(TreeSet.class);
	}
}
