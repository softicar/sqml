package com.softicar.sqml.generator.query;

import com.softicar.platform.db.core.DbResultSet;
import com.softicar.platform.db.runtime.query.AbstractDbQueryRow;
import com.softicar.platform.db.runtime.query.IDbQueryRow;
import com.softicar.platform.db.runtime.select.IDbSqlSelect;

class QueryRowGenerator extends AbstractGenerator {

	public static final String ROW_CLASS = "Row";
	public static final String ROW_INTERFACE = "IRow";

	public QueryRowGenerator(ISqmlQueryGenerator generator) {

		super(generator);
	}

	public void printInterface() {

		addImport(IDbQueryRow.class);
		beginClass("interface %s extends %s<%s>", ROW_INTERFACE, IDbQueryRow.class.getSimpleName(), ROW_INTERFACE);
		printInterfaceGetters();
		endClass();
	}

	private void printInterfaceGetters() {

		for (SqmlQueryColumnGenerator columnGenerator: getColumnsGenerator()) {
			columnGenerator.printInterfaceGetter();
		}
	}

	public void generateClass() {

		addImport(AbstractDbQueryRow.class);
		beginClass(//
			"private static class %s extends %s<%s> implements %s",
			ROW_CLASS,
			AbstractDbQueryRow.class.getSimpleName(),
			ROW_INTERFACE,
			ROW_INTERFACE);
		generateFields();
		println();
		generareConstructor();
		printGetThisMethod();
		generateGetters();
		endClass();
	}

	private void printGetThisMethod() {

		println("@Override");
		beginMethod("public %s getThis()", ROW_CLASS);
		println("return this;");
		endMethod();
	}

	private void generateFields() {

		for (SqmlQueryColumnGenerator columnGenerator: getColumnsGenerator()) {
			columnGenerator.printField();
		}
	}

	private void generareConstructor() {

		addImport(DbResultSet.class);
		addImport(IDbSqlSelect.class);

		beginMethod(
			"private %s(%s query, %s select, %s resultSet)",
			ROW_CLASS,
			getSimpleQueryInterfaceName(),
			IDbSqlSelect.class.getSimpleName(),
			DbResultSet.class.getSimpleName());
		println("super(query);");
		println();
		for (SqmlQueryColumnGenerator columnGenerator: getColumnsGenerator()) {
			columnGenerator.printResultSetAssignment("select", "resultSet");
		}
		endMethod();
	}

	private void generateGetters() {

		for (SqmlQueryColumnGenerator columnGenerator: getColumnsGenerator()) {
			columnGenerator.printGetter();
		}
	}
}
