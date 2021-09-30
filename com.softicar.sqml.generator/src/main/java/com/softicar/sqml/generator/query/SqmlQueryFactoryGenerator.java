package com.softicar.sqml.generator.query;

import com.softicar.platform.db.runtime.query.IDbQueryColumn;
import com.softicar.platform.db.runtime.query.IDbQueryFactory;
import java.util.ArrayList;
import java.util.List;

public class SqmlQueryFactoryGenerator extends AbstractGenerator {

	public static final String FACTORY_CLASS = "Factory";
	public static final String FACTORY_CONTANT = "FACTORY";
	public static final String FACTORY_INTERFACE = "IFactory";

	public SqmlQueryFactoryGenerator(ISqmlQueryGenerator queryGenerator) {

		super(queryGenerator);
	}

	public void printFactoryConstant() {

		println("%s %s = new Implementation.%s();", FACTORY_INTERFACE, FACTORY_CONTANT, FACTORY_CLASS);
	}

	public void printFactoryInterface() {

		addImport(List.class);
		addImport(IDbQueryColumn.class);
		addImport(IDbQueryFactory.class);

		beginClass("interface %s extends %s<%s>", FACTORY_INTERFACE, IDbQueryFactory.class.getSimpleName(), QueryRowGenerator.ROW_INTERFACE);
		println("%s createQuery();", getCreateQueryMethodResult());
		if (!getPreferences().isGenerateSuppressAllWarningsForQueries()) {
			// FIXME: this is just a hack to temporarily retain the original behavior
			// remove the condition together with this println as soon as possible
			println("List<%s<%s, ?>> getColumns();", IDbQueryColumn.class.getSimpleName(), QueryRowGenerator.ROW_INTERFACE);
		}
		endClass();
	}

	private String getCreateQueryMethodResult() {

		if (getParametersGenerator().hasMandatoryParameters()) {
			return getParametersGenerator().getFirstMandatoryParameterGenerator().getSetterInterfaceName();
		} else {
			return getSimpleQueryInterfaceName();
		}
	}

	public void printFactoryClass() {

		beginClass("private static class %s implements %s", FACTORY_CLASS, FACTORY_INTERFACE);
		printFields();
		printConstructor();
		printCreateQueryMethod();
		printGetColumnsMethod();
		endClass();
	}

	private void printFields() {

		addImport(List.class);
		addImport(ArrayList.class);
		addImport(IDbQueryColumn.class);
		println(
			"private List<%s<%s, ?>> columns = new ArrayList<>(%s);",
			IDbQueryColumn.class.getSimpleName(),
			QueryRowGenerator.ROW_INTERFACE,
			getColumnsGenerator().size());
		println();
	}

	private void printConstructor() {

		beginMethod("public %s()", FACTORY_CLASS);
		for (SqmlQueryColumnGenerator columnGenerator: getColumnsGenerator()) {
			println("this.columns.add(%s);", columnGenerator.getColumnConstantName().asConstant());
		}
		endMethod();
	}

	private void printCreateQueryMethod() {

		println("@Override");
		beginMethod("public %s createQuery()", getCreateQueryMethodResult());
		if (getParametersGenerator().hasMandatoryParameters()) {
			println(
				"return new %s().new %s();",
				QueryClassGenerator.QUERY_CLASS_NAME,
				getParametersGenerator().getFirstMandatoryParameterGenerator().getSetterClassName());
		} else {
			println("return new %s();", QueryClassGenerator.QUERY_CLASS_NAME);
		}
		endMethod();
	}

	private void printGetColumnsMethod() {

		println("@Override");
		beginMethod("public List<%s<%s, ?>> getColumns()", IDbQueryColumn.class.getSimpleName(), QueryRowGenerator.ROW_INTERFACE);
		println("return columns;");
		endMethod();
	}
}
