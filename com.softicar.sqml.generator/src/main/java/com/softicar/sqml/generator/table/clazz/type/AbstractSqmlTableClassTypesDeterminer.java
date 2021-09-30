package com.softicar.sqml.generator.table.clazz.type;

import com.softicar.platform.common.code.java.JavaClass;
import com.softicar.sqml.generator.common.SqmlJavaCodePrinter;
import com.softicar.sqml.generator.table.clazz.key.SqmlTableClassKeyTypeDeterminer;
import com.softicar.sqml.generator.table.clazz.printer.ISqmlTableClassPrinterSettings;

class AbstractSqmlTableClassTypesDeterminer {

	protected final SqmlJavaCodePrinter printer;
	protected final ISqmlTableClassPrinterSettings settings;
	protected final SqmlTableClassKeyTypeDeterminer keyTypeDeterminer;

	public AbstractSqmlTableClassTypesDeterminer(SqmlJavaCodePrinter printer, ISqmlTableClassPrinterSettings settings) {

		this.printer = printer;
		this.settings = settings;
		this.keyTypeDeterminer = new SqmlTableClassKeyTypeDeterminer(printer, settings);
	}

	protected JavaClass addImport(JavaClass classToImport) {

		printer.addImport(classToImport);
		return classToImport;
	}

	protected Class<?> addImport(Class<?> classToImport) {

		printer.addImport(classToImport);
		return classToImport;
	}
}
