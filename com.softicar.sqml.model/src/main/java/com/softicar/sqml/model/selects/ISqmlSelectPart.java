package com.softicar.sqml.model.selects;

import com.softicar.sqml.model.ISqmlModelElement;
import java.util.Collections;
import java.util.List;

public interface ISqmlSelectPart extends ISqmlModelElement {

	default List<? extends ISqmlVariable> getVariables() {

		return Collections.emptyList();
	}

	default List<? extends ISqmlSelectColumn> getColumns() {

		return Collections.emptyList();
	}

	/**
	 * Returns all SELECT clauses of this select part, including all sub-parts.
	 *
	 * @return a list of all SELECT clauses
	 */
	default List<? extends ISqmlSelectClause> getAllSelectClauses() {

		return SqmlSelectPartMethods.getAllSelectClauses(this);
	}

	/**
	 * Returns all FROM clauses of this select part, including all sub-parts.
	 * <p>
	 * This method is actually only useful for validation purposes. Because a
	 * single SELECT statement may only have up to one FROM clause, the returned
	 * list has usually a size of zero or one.
	 *
	 * @return a list of all FROM clauses
	 */
	default List<? extends ISqmlFromClause> getFromClauses() {

		return Collections.emptyList();
	}
}
