package com.softicar.sqml.generator.query;

import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.sqml.generator.common.SqmlJavaCodePrinter;

public class DelegatingJavaCodePrinter {

	private final SqmlJavaCodePrinter printer;

	public DelegatingJavaCodePrinter(SqmlJavaCodePrinter printer) {

		this.printer = printer;
	}

	public void addImport(JavaClassName className) {

		printer.addImport(className);
	}

	public void addImport(Class<?> classImport) {

		printer.addImport(classImport);
	}

	public void println() {

		printer.println();
	}

	public void println(String arg0, Object...arg1) {

		printer.println(arg0, arg1);
	}

	public void beginBlock() {

		printer.beginBlock();
	}

	public void beginBlock(String text, Object...args) {

		printer.beginBlock(text, args);
	}

	public void beginClass(String format, Object...args) {

		printer.beginClass(format, args);
	}

	public void beginMethod(String format, Object...args) {

		printer.beginMethod(format, args);
	}

	public void decrementIndentation() {

		printer.decrementIndentation();
	}

	public void endBlock() {

		printer.endBlock();
	}

	public void endClass() {

		printer.endClass();
	}

	public void endMethod() {

		printer.endMethod();
	}

	public void incrementIndentation() {

		printer.incrementIndentation();
	}

	public void beginSwitch(String text) {

		printer.beginSwitch(text);
	}

	public void endSwitch() {

		printer.endSwitch();
	}
}
