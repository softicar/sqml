package com.softicar.sqml.generator.table.clazz.printer;

import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.sqml.generator.common.SqmlJavaCodePrinter;

public class SqmlCustomTableChildClassPrinter extends SqmlJavaCodePrinter {

	private final ISqmlTableClassPrinterSettings settings;
	private final JavaClassName className;

	public SqmlCustomTableChildClassPrinter(ISqmlTableClassPrinterSettings settings) {

		super(settings.getConfig());

		this.settings = settings;
		this.className = settings.getCustomChildClassName();
	}

	public void printClassFile() {

		settings.getConfig().writeClassFile(className, generateCode());
	}

	private String generateCode() {

		String classHeader = String.format("public class %s extends %s", className.getSimpleName(), settings.getGeneratedBaseClassName().getSimpleName());
		beginClass(classHeader);
		println("// add custom code here");
		endBlock();
		return toString(className.getPackageName());
	}
}
