package com.softicar.sqml.generator.query;

import com.softicar.sqml.generator.common.SqmlJavaCodePrinter;

class ParametersClassGenerator {

	public static final String CLASS_NAME = "Parameters";
	private final QueryParametersGenerator parametersGenerator;
	private final SqmlJavaCodePrinter printer;

	public ParametersClassGenerator(QueryParametersGenerator parametersGenerator) {

		this.parametersGenerator = parametersGenerator;
		this.printer = parametersGenerator.getPrinter();
	}

	public void generateClass() {

		if (parametersGenerator.hasParameters()) {
			printer.beginClass("private static class %s", CLASS_NAME);
			generateFields();
			printer.endClass();
		}
	}

	private void generateFields() {

		for (QueryParameterGenerator parameterGenerator: parametersGenerator) {
			parameterGenerator.printField();
		}
	}
}
