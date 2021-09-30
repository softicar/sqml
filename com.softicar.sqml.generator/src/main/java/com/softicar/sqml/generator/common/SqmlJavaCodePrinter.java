package com.softicar.sqml.generator.common;

import com.softicar.platform.common.code.java.JavaCodePrinter;
import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.sqml.generator.preferences.ISqmlGeneratorPreferences;
import com.softicar.sqml.generator.table.clazz.printer.ISqmlTableClassPrinterConfig;
import java.util.Optional;

public class SqmlJavaCodePrinter extends JavaCodePrinter {

	private final SqmlImportOverrides importOverrides;
	private final Optional<JavaClassName> annotationForGeneratedClasses;

	public SqmlJavaCodePrinter(SqmlJavaCodePrinter other) {

		this(other.importOverrides, other.annotationForGeneratedClasses);
	}

	public SqmlJavaCodePrinter(ISqmlGeneratorPreferences preferences) {

		this(preferences.getImportOverrides(), preferences.getAnnotationForGeneratedClassesAsOptional());
	}

	public SqmlJavaCodePrinter(ISqmlTableClassPrinterConfig config) {

		this(config.getImportOverrides(), config.getAnnotationForGeneratedClasses());
	}

	private SqmlJavaCodePrinter(SqmlImportOverrides importOverrides, Optional<JavaClassName> annotationForGeneratedClasses) {

		super(new SqmlJavaImports(importOverrides));

		this.importOverrides = importOverrides;
		this.annotationForGeneratedClasses = annotationForGeneratedClasses;
	}

	public void printGeneratedClassAnnotationIfGiven() {

		annotationForGeneratedClasses.ifPresent(this::printGeneratedClassAnnotation);
	}

	private void printGeneratedClassAnnotation(JavaClassName annotationClassName) {

		addImport(annotationClassName);
		println("@" + annotationClassName.getSimpleName());
	}
}
