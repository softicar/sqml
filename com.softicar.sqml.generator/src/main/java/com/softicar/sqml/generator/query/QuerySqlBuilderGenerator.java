package com.softicar.sqml.generator.query;

import com.softicar.platform.db.runtime.query.builder.AbstractDbQuerySqlBuilder;
import com.softicar.sqml.generator.common.SqmlJavaCodePrinter;
import com.softicar.sqml.generator.preferences.ISqmlGeneratorPreferences;
import com.softicar.sqml.generator.select.SqlBuilderBuilder;
import com.softicar.sqml.generator.select.SqmlSelectGenerator;
import com.softicar.sqml.model.queries.ISqmlQuery;

class QuerySqlBuilderGenerator {

	public static final String BUILDER_CLASS_NAME = "QuerySqlBuilder";
	private final SqmlJavaCodePrinter printer;
	private final ISqmlQuery query;
	private final ISqmlGeneratorPreferences preferences;

	public QuerySqlBuilderGenerator(SqmlJavaCodePrinter printer, ISqmlQuery query, ISqmlGeneratorPreferences preferences) {

		this.printer = printer;
		this.query = query;
		this.preferences = preferences;
	}

	public void generateClass() {

		printer.addImport(AbstractDbQuerySqlBuilder.class);
		printer.beginClass("private class %s extends %s", BUILDER_CLASS_NAME, AbstractDbQuerySqlBuilder.class.getSimpleName());

		printer.beginMethod("public void buildOriginalSelect()");
		query.getSelect().accept(new SqmlSelectGenerator(new SqlBuilderBuilder(printer), preferences));
		printer.endMethod();

		printer.endClass();
	}
}
