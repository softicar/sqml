package com.softicar.sqml.generator.sqml;

import com.softicar.platform.common.code.java.CodePrinter;
import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import java.util.Set;
import java.util.TreeSet;

class ImportsPrinter {

	private final JavaClassName className;
	private final Set<JavaClassName> imports;

	public ImportsPrinter(JavaClassName className) {

		this.className = className;
		this.imports = new TreeSet<>();
	}

	public void print(CodePrinter printer) {

		// add imports
		int importCount = 0;
		for (JavaClassName foreignClassName: imports) {
			if (!foreignClassName.getPackageName().equals(className.getPackageName())) {
				printer.println("IMPORT %s", foreignClassName.getCanonicalName());
				++importCount;
			}
		}

		// add separator line
		if (importCount > 0) {
			printer.println();
		}
	}

	public void addImport(JavaClassName className) {

		imports.add(className);
	}
}
