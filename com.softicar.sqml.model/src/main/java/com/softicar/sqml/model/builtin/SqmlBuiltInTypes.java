package com.softicar.sqml.model.builtin;

import com.softicar.sqml.model.simple.SqmlSimpleResource;
import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.emf.common.util.URI;

public class SqmlBuiltInTypes extends SqmlSimpleResource {

	private static final String FILENAME = SqmlBuiltInTypes.class.getSimpleName() + ".sqml";
	private static final SqmlBuiltInTypes SINGLETON = new SqmlBuiltInTypes();

	private final Collection<SqmlBuiltInType> allTypes = new ArrayList<>();
	private final SqmlBlobType blobType = new SqmlBlobType();
	private final SqmlBooleanType booleanType = new SqmlBooleanType();
	private final SqmlCollectionType collectionType = new SqmlCollectionType();
	private final SqmlDayType dayType = new SqmlDayType();
	private final SqmlDayTimeType dayTimeType = new SqmlDayTimeType();
	private final SqmlDecimalType decimalType = new SqmlDecimalType();
	private final SqmlDoubleType doubleType = new SqmlDoubleType();
	private final SqmlFloatType floatType = new SqmlFloatType();
	private final SqmlIntegerType integerType = new SqmlIntegerType();
	private final SqmlListType listType = new SqmlListType();
	private final SqmlLongType longType = new SqmlLongType();
	private final SqmlSetType setType = new SqmlSetType();
	private final SqmlStringType stringType = new SqmlStringType();
	private final SqmlTimeType timeType = new SqmlTimeType();
	private final SqmlTupleType tupleType = new SqmlTupleType();
	private final SqmlUnknownType unknownType = new SqmlUnknownType();

	public SqmlBuiltInTypes() {

		super(SqmlBuiltInPackage.getQualifiedName(), FILENAME);

		allTypes.add(blobType);
		allTypes.add(booleanType);
		allTypes.add(collectionType);
		allTypes.add(dayType);
		allTypes.add(dayTimeType);
		allTypes.add(decimalType);
		allTypes.add(doubleType);
		allTypes.add(floatType);
		allTypes.add(integerType);
		allTypes.add(listType);
		allTypes.add(longType);
		allTypes.add(setType);
		allTypes.add(stringType);
		allTypes.add(timeType);
		allTypes.add(tupleType);
		allTypes.add(unknownType);

		getFile().getElements().addAll(allTypes);
	}

	public static SqmlBuiltInTypes get() {

		return SINGLETON;
	}

	public static boolean isBuiltIn(URI objectUri) {

		return objectUri.trimFragment().toString().endsWith(SqmlBuiltInTypes.FILENAME);
	}

	public static Collection<SqmlBuiltInType> getAll() {

		return get().allTypes;
	}

	public static SqmlBooleanType getBooleanType() {

		return get().booleanType;
	}

	public static SqmlBlobType getBlobType() {

		return get().blobType;
	}

	public static SqmlCollectionType getCollectionType() {

		return get().collectionType;
	}

	public static SqmlDayType getDayType() {

		return get().dayType;
	}

	public static SqmlDayTimeType getDayTimeType() {

		return get().dayTimeType;
	}

	public static SqmlDecimalType getDecimalType() {

		return get().decimalType;
	}

	public static SqmlDoubleType getDoubleType() {

		return get().doubleType;
	}

	public static SqmlFloatType getFloatType() {

		return get().floatType;
	}

	public static SqmlIntegerType getIntegerType() {

		return get().integerType;
	}

	public static SqmlListType getListType() {

		return get().listType;
	}

	public static SqmlLongType getLongType() {

		return get().longType;
	}

	public static SqmlSetType getSetType() {

		return get().setType;
	}

	public static SqmlStringType getStringType() {

		return get().stringType;
	}

	public static SqmlTimeType getTimeType() {

		return get().timeType;
	}

	public static SqmlTupleType getTupleType() {

		return get().tupleType;
	}

	public static SqmlUnknownType getUnknownType() {

		return get().unknownType;
	}
}
