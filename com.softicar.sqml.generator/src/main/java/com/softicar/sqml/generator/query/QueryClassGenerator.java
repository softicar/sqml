package com.softicar.sqml.generator.query;

import com.softicar.platform.db.core.DbResultSet;
import com.softicar.platform.db.runtime.query.AbstractDbQuery;
import com.softicar.platform.db.runtime.query.IDbQueryColumn;
import com.softicar.platform.db.runtime.select.IDbSqlSelect;
import com.softicar.sqml.generator.common.SqmlJavaCodePrinter;
import com.softicar.sqml.model.queries.ISqmlQuery;
import java.util.List;

class QueryClassGenerator {

	public static final String QUERY_CLASS_NAME = "Query";
	private final SqmlQueryGenerator interfaceGenerator;
	private final SqmlJavaCodePrinter printer;
	private final ISqmlQuery query;
	private final QueryParametersGenerator parametersGenerator;

	public QueryClassGenerator(SqmlQueryGenerator interfaceGenerator, QueryParametersGenerator parametersGenerator) {

		this.interfaceGenerator = interfaceGenerator;
		this.printer = interfaceGenerator.getPrinter();
		this.query = interfaceGenerator.getQuery();
		this.parametersGenerator = parametersGenerator;
	}

	public void generateClass() {

		printer.addImport(AbstractDbQuery.class);
		printer
			.beginClass(
				"private static class Query extends %s<%s> implements %s",
				AbstractDbQuery.class.getSimpleName(),
				QueryRowGenerator.ROW_INTERFACE,
				interfaceGenerator.getSimpleQueryInterfaceName());
		generateFields();
		generateCreateRowMethod();
		generateGetColumnsMethod();
		generateCreateClauseBuilderMethod();
		parametersGenerator.printSetterMethods();
		parametersGenerator.printSetterClasses();
		new QuerySqlBuilderGenerator(printer, query, interfaceGenerator.getPreferences()).generateClass();
		printer.endClass();
	}

	private void generateCreateClauseBuilderMethod() {

		printer.println("@Override");
		printer.beginMethod("public %s createSqlBuilder()", QuerySqlBuilderGenerator.BUILDER_CLASS_NAME);
		printer.println("return new %s();", QuerySqlBuilderGenerator.BUILDER_CLASS_NAME);
		printer.endMethod();
	}

	private void generateFields() {

		if (parametersGenerator.hasParameters()) {
			printer.println("private final %s parameters = new %s();", ParametersClassGenerator.CLASS_NAME, ParametersClassGenerator.CLASS_NAME);
			printer.println();
		}
	}

	private void generateCreateRowMethod() {

		printer.addImport(IDbSqlSelect.class);

		printer.println("@Override");
		printer
			.beginMethod(
				"public %s createRow(%s select, %s resultSet)",
				QueryRowGenerator.ROW_INTERFACE,
				IDbSqlSelect.class.getSimpleName(),
				DbResultSet.class.getSimpleName());
		printer.println("return new %s(this, select, resultSet);", QueryRowGenerator.ROW_CLASS);
		printer.endMethod();
	}

	private void generateGetColumnsMethod() {

		printer.addImport(List.class);
		printer.addImport(IDbQueryColumn.class);

		printer.println("@Override");
		printer.beginMethod("public List<%s<%s, ?>> getColumns()", IDbQueryColumn.class.getSimpleName(), QueryRowGenerator.ROW_INTERFACE);
		printer.println("return %s.getColumns();", SqmlQueryFactoryGenerator.FACTORY_CONTANT);
		printer.endMethod();
	}
}
