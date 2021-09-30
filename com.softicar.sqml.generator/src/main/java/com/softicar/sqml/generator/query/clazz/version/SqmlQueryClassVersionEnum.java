package com.softicar.sqml.generator.query.clazz.version;

import com.softicar.sqml.generator.common.ISqmlGeneratorVersion;

public enum SqmlQueryClassVersionEnum implements ISqmlGeneratorVersion {

	VERSION_20200502(20200502),
	VERSION_20200915(20200915),
	// add versions as needed
	;

	private final int value;

	private SqmlQueryClassVersionEnum(int value) {

		this.value = value;
	}

	@Override
	public int getValue() {

		return value;
	}
}
