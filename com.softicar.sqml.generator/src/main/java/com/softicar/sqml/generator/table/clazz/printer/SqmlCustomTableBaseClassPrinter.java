package com.softicar.sqml.generator.table.clazz.printer;

import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.sqml.generator.common.SqmlJavaCodePrinter;
import com.softicar.sqml.generator.table.clazz.type.SqmlTableClassBaseTypesDeterminer;

public class SqmlCustomTableBaseClassPrinter extends SqmlJavaCodePrinter {

	private final ISqmlTableClassPrinterSettings settings;
	private final JavaClassName className;
	private final SqmlTableClassBaseTypesDeterminer baseTypeDeterminer;

	public SqmlCustomTableBaseClassPrinter(ISqmlTableClassPrinterSettings settings) {

		super(settings.getConfig());

		this.settings = settings;
		this.className = settings.getCustomBaseClassName();
		this.baseTypeDeterminer = new SqmlTableClassBaseTypesDeterminer(this, settings);
	}

	public void printClassFile() {

		settings.getConfig().writeClassFile(className, generateCode());
	}

	private String generateCode() {

		String classHeader = String
			.format(//
				"public abstract class %s extends %s",
				className.getSimpleName(),
				baseTypeDeterminer.getAndImportDefaultBaseType());
		beginClass(classHeader);
		println("// add custom code here");
		endBlock();
		return toString(className.getPackageName());
	}
}
