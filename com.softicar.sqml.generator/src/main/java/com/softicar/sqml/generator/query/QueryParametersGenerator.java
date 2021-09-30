package com.softicar.sqml.generator.query;

import com.softicar.sqml.generator.common.SqmlJavaCodePrinter;
import com.softicar.sqml.model.queries.ISqmlQuery;
import com.softicar.sqml.model.queries.ISqmlQueryParameter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class QueryParametersGenerator implements Iterable<QueryParameterGenerator> {

	private final SqmlQueryGenerator interfaceGenerator;
	private final ISqmlQuery query;
	private final List<QueryParameterGenerator> parameterGenerators;
	private final List<QueryParameterGenerator> optionalParameterGenerators;
	private final List<QueryParameterGenerator> mandatoryParameterGenerators;

	public QueryParametersGenerator(SqmlQueryGenerator interfaceGenerator) {

		this.interfaceGenerator = interfaceGenerator;
		this.query = interfaceGenerator.getQuery();
		this.parameterGenerators = new ArrayList<>();
		this.optionalParameterGenerators = new ArrayList<>();
		this.mandatoryParameterGenerators = new ArrayList<>();

		createParameterGenerators();
		linkMandatoryParameterGenerators();
	}

	private void createParameterGenerators() {

		for (ISqmlQueryParameter queryParameter: query.getParameters()) {
			QueryParameterGenerator parameterGenerator = new QueryParameterGenerator(interfaceGenerator, queryParameter);
			parameterGenerators.add(parameterGenerator);
			if (queryParameter.isOptional()) {
				optionalParameterGenerators.add(parameterGenerator);
			} else {
				mandatoryParameterGenerators.add(parameterGenerator);
			}
		}
	}

	private void linkMandatoryParameterGenerators() {

		for (int i = 1; i < mandatoryParameterGenerators.size(); ++i) {
			QueryParameterGenerator previous = mandatoryParameterGenerators.get(i - 1);
			QueryParameterGenerator current = mandatoryParameterGenerators.get(i);

			previous.setNextGenerator(current);
		}
	}

	public SqmlJavaCodePrinter getPrinter() {

		return interfaceGenerator.getPrinter();
	}

	@Override
	public Iterator<QueryParameterGenerator> iterator() {

		return parameterGenerators.iterator();
	}

	public boolean hasParameters() {

		return !parameterGenerators.isEmpty();
	}

	public boolean hasMandatoryParameters() {

		return !mandatoryParameterGenerators.isEmpty();
	}

	public boolean hasOptionalParameters() {

		return !optionalParameterGenerators.isEmpty();
	}

	public QueryParameterGenerator getFirstMandatoryParameterGenerator() {

		return mandatoryParameterGenerators.get(0);
	}

	public void printSetterInterfaces() {

		for (QueryParameterGenerator parameterGenerator: mandatoryParameterGenerators) {
			parameterGenerator.printSetterInterfaceForMandatoryParameter();
		}
	}

	public void printSetterClasses() {

		for (QueryParameterGenerator parameterGenerator: mandatoryParameterGenerators) {
			parameterGenerator.printSetterClassForMandatoryParameter();
		}
	}

	public void printInterfaceSetterMethods() {

		for (QueryParameterGenerator parameterGenerator: optionalParameterGenerators) {
			parameterGenerator.printInterfaceSetterMethodForOptionalParameter();
		}
	}

	public void printSetterMethods() {

		for (QueryParameterGenerator parameterGenerator: optionalParameterGenerators) {
			parameterGenerator.printSetterMethodForOptionalParameter();
		}
	}
}
