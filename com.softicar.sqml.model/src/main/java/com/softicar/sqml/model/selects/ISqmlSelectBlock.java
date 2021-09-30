package com.softicar.sqml.model.selects;

import com.softicar.sqml.model.utils.SqmlException;
import com.softicar.sqml.model.utils.SqmlLogicError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Represents a container of {@link ISqmlSelectPart}.
 * <p>
 * For example:
 *
 * <pre>
 * SELECT ...
 * FROM ..
 * #IF ... {
 *     WHERE ...
 * }
 * </pre>
 *
 * Here the complete SELECT statement and the IF block are instances of
 * {@link ISqmlSelectBlock}. Such blocks contain instanced of
 * {@link ISqmlSelectPart}, e.g. {@link ISqmlSelectClause},
 * {@link ISqmlWhereClause}, etc.
 *
 * @author Oliver Richers
 */
public interface ISqmlSelectBlock extends ISqmlSelectPart {

	@Override
	default List<? extends ISqmlVariable> getVariables() {

		List<ISqmlVariable> variables = new ArrayList<>();
		for (ISqmlSelectPart part: getAllElements()) {
			variables.addAll(part.getVariables());
		}
		return variables;
	}

	@Override
	default List<? extends ISqmlSelectColumn> getColumns() {

		List<ISqmlSelectColumn> columns = new ArrayList<>();
		for (ISqmlSelectPart part: getAllElements()) {
			columns.addAll(part.getColumns());
		}
		return columns;
	}

	@Override
	default List<? extends ISqmlFromClause> getFromClauses() {

		List<ISqmlFromClause> fromClauses = new ArrayList<>();
		for (ISqmlSelectPart part: getAllElements()) {
			fromClauses.addAll(part.getFromClauses());
		}
		return fromClauses;
	}

	default ISqmlVariable getVariable(String name) {

		for (ISqmlVariable variable: getVariables()) {
			if (variable.getName().equals(name)) {
				return variable;
			}
		}

		throw new SqmlException("Failed to find variable '%s'.", name);
	}

	default ISqmlSelectColumn getColumn(String columnName) {

		for (ISqmlSelectColumn column: getColumns()) {
			if (column.getName().equals(columnName)) {
				return column;
			}
		}

		throw new SqmlException("Failed to find select column '%s'.", columnName);
	}

	default ISqmlFromClause getFromClause() {

		List<? extends ISqmlFromClause> fromClauses = getFromClauses();

		if (fromClauses.isEmpty()) {
			return null;
		} else if (fromClauses.size() == 1) {
			return fromClauses.get(0);
		} else {
			throw new SqmlLogicError("Multiple FROM clauses in SELECT statement.");
		}
	}

	Collection<? extends ISqmlSelectPart> getParts();

	List<? extends ISqmlSelectPart> getAllElements();
}
