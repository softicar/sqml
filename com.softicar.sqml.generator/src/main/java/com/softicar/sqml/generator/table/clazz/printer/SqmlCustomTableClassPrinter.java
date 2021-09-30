package com.softicar.sqml.generator.table.clazz.printer;

import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.sqml.generator.common.SqmlJavaCodePrinter;
import com.softicar.sqml.generator.table.clazz.type.SqmlTableClassTypesDeterminer;

public class SqmlCustomTableClassPrinter extends SqmlJavaCodePrinter {

	private final ISqmlTableClassPrinterSettings settings;
	private final JavaClassName className;
	private final SqmlTableClassTypesDeterminer tableTypeDeterminer;

	public SqmlCustomTableClassPrinter(ISqmlTableClassPrinterSettings settings) {

		super(settings.getConfig());

		this.settings = settings;
		this.className = settings.getCustomTableClassName();
		this.tableTypeDeterminer = new SqmlTableClassTypesDeterminer(this, settings);
	}

	public void printClassFile() {

		settings.getConfig().writeClassFile(className, generateCode());
	}

	private String generateCode() {

		// print class header
		beginClass("public class %s extends %s", className.getSimpleName(), tableTypeDeterminer.getAndImportDefaultTableType());

		// print constructor
		String visibility = settings.isRecord()? "protected" : "public";
		beginMethod("%s %s(%s builder)", visibility, className.getSimpleName(), tableTypeDeterminer.getAndImportTableBuilderInterfaceType());
		println("super(builder);");
		endBlock();

		// finish
		endBlock();
		return toString(className.getPackageName());
	}
}
