package com.softicar.sqml.generator.common;

import com.softicar.platform.common.code.java.JavaImports;
import com.softicar.platform.common.core.java.classes.name.JavaClassName;

public class SqmlJavaImports extends JavaImports {

	private final SqmlImportOverrides importOverrides;

	public SqmlJavaImports(SqmlImportOverrides importOverrides) {

		this.importOverrides = importOverrides;
	}

	@Override
	protected void doAddImport(JavaClassName className) {

		super.doAddImport(importOverrides.applyTo(className));
	}
}
