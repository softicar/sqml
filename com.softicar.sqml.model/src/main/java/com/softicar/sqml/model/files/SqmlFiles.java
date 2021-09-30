package com.softicar.sqml.model.files;

import com.softicar.sqml.model.functions.ISqmlFunction;
import com.softicar.sqml.model.queries.ISqmlQuery;
import com.softicar.sqml.model.tables.ISqmlTable;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.naming.QualifiedName;

public class SqmlFiles {

	public static boolean hasImport(ISqmlFile file, QualifiedName qualifiedName) {

		for (ISqmlImport sqmlImport: file.getImports()) {
			if (sqmlImport.getQualifiedName().equals(qualifiedName)) {
				return true;
			}
		}
		return false;
	}

	// ------------------------------ functions ---------------------------- //

	public static List<? extends ISqmlFunction> getFunctions(ISqmlFile file) {

		List<ISqmlFunction> functions = new ArrayList<>();

		for (ISqmlFileElement element: file.getElements()) {
			if (element instanceof ISqmlFunction) {
				functions.add((ISqmlFunction) element);
			}
		}

		return functions;
	}

	public static List<? extends ISqmlFunction> findFunctions(ISqmlFile file, String functionName) {

		List<ISqmlFunction> functions = new ArrayList<>();

		for (ISqmlFunction function: getFunctions(file)) {
			if (function.getName().equals(functionName)) {
				functions.add(function);
			}
		}

		return functions;
	}

	public static ISqmlFunction getFunction(ISqmlFile file, String functionName) {

		List<? extends ISqmlFunction> functions = findFunctions(file, functionName);

		if (functions.isEmpty()) {
			throw new RuntimeException(String.format("Failed to find function '%s'.", functionName));
		} else if (functions.size() > 1) {
			throw new RuntimeException(String.format("Found more than one function with name '%s'.", functionName));
		} else {
			return functions.get(0);
		}
	}

	// ------------------------------ tables ------------------------------ //

	public static List<? extends ISqmlTable> getTables(ISqmlFile file) {

		List<ISqmlTable> tables = new ArrayList<>();

		for (ISqmlFileElement element: file.getElements()) {
			if (element instanceof ISqmlTable) {
				tables.add((ISqmlTable) element);
			}
		}

		return tables;
	}

	public static ISqmlTable getTable(ISqmlFile file, String tableName) {

		ISqmlTable table = findTable(file, tableName);
		if (table != null) {
			return table;
		} else {
			throw new RuntimeException(String.format("Failed to find table '%s'.", tableName));
		}
	}

	public static ISqmlTable findTable(ISqmlFile file, String tableName) {

		for (ISqmlTable table: getTables(file)) {
			if (table.getName().equals(tableName)) {
				return table;
			}
		}

		return null;
	}

	// ------------------------------ queries ------------------------------ //

	public static List<? extends ISqmlQuery> getQueries(ISqmlFile file) {

		List<ISqmlQuery> queries = new ArrayList<>();

		for (ISqmlFileElement element: file.getElements()) {
			if (element instanceof ISqmlQuery) {
				queries.add((ISqmlQuery) element);
			}
		}

		return queries;
	}

	public static ISqmlQuery findQuery(ISqmlFile file, String queryName) {

		for (ISqmlQuery query: getQueries(file)) {
			if (query.getName().equals(queryName)) {
				return query;
			}
		}

		return null;
	}

	public static ISqmlQuery getQuery(ISqmlFile file, String queryName) {

		ISqmlQuery query = findQuery(file, queryName);
		if (query != null) {
			return query;
		} else {
			throw new RuntimeException(String.format("Failed to find query '%s'.", queryName));
		}
	}
}
