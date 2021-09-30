package com.softicar.sqml.generator.common;

/**
 * Proxy for class generator versions.
 * <p>
 * Special treatment of the version value zero. The zero version value is the
 * default and will be interpreted as the latest version.
 * <p>
 * Rationale: Eclipse automatically wipes default value configurations from the
 * preference store, so we need an explicit default version value that is
 * different from any explicit version.
 *
 * @author Oliver Richers
 */
public class SqmlGeneratorVersionProxy<V extends ISqmlGeneratorVersion> implements ISqmlGeneratorVersion {

	private final int value;

	public SqmlGeneratorVersionProxy(int value) {

		this.value = value;
	}

	@Override
	public int getValue() {

		return value;
	}

	public boolean isEqualOrLater(V version) {

		return isLatest() || value >= version.getValue();
	}

	public boolean isBefore(V versionEnum) {

		return !isLatest() && value < versionEnum.getValue();
	}

	private boolean isLatest() {

		return value == 0;
	}
}
