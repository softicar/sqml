package com.softicar.sqml.generator.query;

import com.softicar.sqml.generator.preferences.ISqmlGeneratorPreferences;

public abstract class AbstractGenerator extends DelegatingJavaCodePrinter {

	private final ISqmlQueryGenerator queryGenerator;

	public AbstractGenerator(ISqmlQueryGenerator queryGenerator) {

		super(queryGenerator.getPrinter());

		this.queryGenerator = queryGenerator;
	}

	public ISqmlGeneratorPreferences getPreferences() {

		return queryGenerator.getPreferences();
	}

	public String getSimpleQueryInterfaceName() {

		return queryGenerator.getSimpleQueryInterfaceName();
	}

	public QueryColumnsGenerator getColumnsGenerator() {

		return queryGenerator.getColumnsGenerator();
	}

	public QueryParametersGenerator getParametersGenerator() {

		return queryGenerator.getParametersGenerator();
	}
}
