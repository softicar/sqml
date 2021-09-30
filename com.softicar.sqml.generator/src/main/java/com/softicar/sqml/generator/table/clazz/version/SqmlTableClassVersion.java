package com.softicar.sqml.generator.table.clazz.version;

import com.softicar.sqml.generator.common.SqmlGeneratorVersionProxy;

/**
 * Proxy for {@link SqmlTableClassVersionEnum}.
 *
 * @author Oliver Richers
 * @see SqmlGeneratorVersionProxy
 */
public class SqmlTableClassVersion extends SqmlGeneratorVersionProxy<SqmlTableClassVersionEnum> {

	private static final SqmlTableClassVersion LATEST = new SqmlTableClassVersion(0);

	public SqmlTableClassVersion(int value) {

		super(value);
	}

	public static SqmlTableClassVersion getLatest() {

		return LATEST;
	}
}
