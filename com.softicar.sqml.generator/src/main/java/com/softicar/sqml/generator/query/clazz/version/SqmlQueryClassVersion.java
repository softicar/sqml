package com.softicar.sqml.generator.query.clazz.version;

import com.softicar.sqml.generator.common.SqmlGeneratorVersionProxy;

/**
 * Proxy for {@link SqmlQueryClassVersionEnum}.
 *
 * @author Oliver Richers
 * @see SqmlGeneratorVersionProxy
 */
public class SqmlQueryClassVersion extends SqmlGeneratorVersionProxy<SqmlQueryClassVersionEnum> {

	private static final SqmlQueryClassVersion LATEST = new SqmlQueryClassVersion(0);

	public SqmlQueryClassVersion(int value) {

		super(value);
	}

	public static SqmlQueryClassVersion getLatest() {

		return LATEST;
	}
}
