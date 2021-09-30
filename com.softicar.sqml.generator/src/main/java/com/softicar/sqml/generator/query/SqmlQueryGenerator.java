package com.softicar.sqml.generator.query;

import com.softicar.platform.common.code.java.JavaIdentifier;
import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.platform.db.runtime.query.IDbQuery;
import com.softicar.sqml.generator.common.SqmlJavaCodePrinter;
import com.softicar.sqml.generator.preferences.ISqmlGeneratorPreferences;
import com.softicar.sqml.model.queries.ISqmlQuery;

public class SqmlQueryGenerator implements ISqmlQueryGenerator {

	private final ISqmlGeneratorPreferences preferences;
	private final ISqmlQuery query;
	private final SqmlJavaCodePrinter printer;
	private final JavaClassName interfaceName;
	private final QueryColumnsGenerator columnsGenerator;
	private final QueryParametersGenerator parametersGenerator;
	private final SqmlQueryFactoryGenerator factoryGenerator;
	private final ParametersClassGenerator parametersClassGenerator;
	private final QueryClassGenerator queryGenerator;
	private final QueryRowGenerator rowGenerator;

	public SqmlQueryGenerator(ISqmlGeneratorPreferences preferences, ISqmlQuery query) {

		this.preferences = preferences;
		this.query = query;
		this.printer = new SqmlJavaCodePrinter(preferences);
		this.interfaceName = getInterfaceName(query);
		this.columnsGenerator = new QueryColumnsGenerator(this, query);
		this.parametersGenerator = new QueryParametersGenerator(this);
		this.factoryGenerator = new SqmlQueryFactoryGenerator(this);
		this.parametersClassGenerator = new ParametersClassGenerator(parametersGenerator);
		this.queryGenerator = new QueryClassGenerator(this, parametersGenerator);
		this.rowGenerator = new QueryRowGenerator(this);
	}

	public static JavaClassName getInterfaceName(ISqmlQuery query) {

		return new JavaClassName(query.getJavaPackageName(), new JavaIdentifier("I" + query.getName()).asClass());
	}

	public ISqmlQuery getQuery() {

		return query;
	}

	@Override
	public ISqmlGeneratorPreferences getPreferences() {

		return preferences;
	}

	@Override
	public SqmlJavaCodePrinter getPrinter() {

		return printer;
	}

	@Override
	public QueryColumnsGenerator getColumnsGenerator() {

		return columnsGenerator;
	}

	@Override
	public QueryParametersGenerator getParametersGenerator() {

		return parametersGenerator;
	}

	@Override
	public String getSimpleQueryInterfaceName() {

		return interfaceName.getSimpleName();
	}

	public void printCode() {

		printer.addImport(IDbQuery.class);
		printer.printGeneratedClassAnnotationIfGiven();
		if (preferences.isGenerateSuppressAllWarningsForQueries()) {
			printer.println("@SuppressWarnings(\"all\")");
		}
		printer
			.beginClass(
				"public interface %s extends %s<%s.%s>",
				getSimpleQueryInterfaceName(),
				IDbQuery.class.getSimpleName(),
				getSimpleQueryInterfaceName(),
				QueryRowGenerator.ROW_INTERFACE);

		// constants
		printer.printSeparator("CONSTANTS");
		columnsGenerator.printColumnConstants();
		factoryGenerator.printFactoryConstant();
		printer.println();

		// methods
		if (parametersGenerator.hasOptionalParameters()) {
			printer.printSeparator("METHODS");
			parametersGenerator.printInterfaceSetterMethods();
			printer.println();
		}

		// interfaces
		printer.printSeparator("INTERFACES");
		rowGenerator.printInterface();
		factoryGenerator.printFactoryInterface();
		parametersGenerator.printSetterInterfaces();

		// implementation
		printer.printSeparator("IMPLEMENTATION");
		printer.beginClass("class Implementation");
		factoryGenerator.printFactoryClass();
		parametersClassGenerator.generateClass();
		queryGenerator.generateClass();
		rowGenerator.generateClass();
		printer.endClass();

		printer.endClass();
	}
}
