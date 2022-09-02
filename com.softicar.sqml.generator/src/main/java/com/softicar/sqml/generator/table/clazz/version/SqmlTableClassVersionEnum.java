package com.softicar.sqml.generator.table.clazz.version;

import com.softicar.sqml.generator.common.ISqmlGeneratorVersion;

public enum SqmlTableClassVersionEnum implements ISqmlGeneratorVersion {

	VERSION_20191030(20191030),
	VERSION_20200502(20200502),
	VERSION_20200506(20200506),
	VERSION_20200922(20200922),
	VERSION_20201015(20201015),
	VERSION_20201127(20201127),
	VERSION_20220902(20220902),
	// add versions as needed
	;

	private final int value;

	private SqmlTableClassVersionEnum(int value) {

		this.value = value;
	}

	@Override
	public int getValue() {

		return value;
	}
}
