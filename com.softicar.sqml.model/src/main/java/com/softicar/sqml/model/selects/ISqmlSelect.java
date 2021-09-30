package com.softicar.sqml.model.selects;

import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.ISqmlTabular;
import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.queries.ISqmlQuery;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.utils.SqmlLogicError;
import com.softicar.sqml.model.validation.ISqmlValidatable;
import com.softicar.sqml.model.validation.ISqmlValidationContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public interface ISqmlSelect extends ISqmlExpression, ISqmlTabular, ISqmlSelectBlock, ISqmlValidatable {

	@Override
	default List<? extends ISqmlSelectColumn> getColumns() {

		// this override is necessary to disambiguate ISqmlSelectBlock and
		// ISqmlTabular
		return ISqmlSelectBlock.super.getColumns();
	}

	/**
	 * Returns the FROM clause of this SELECT statement or null if there is
	 * none.
	 * <p>
	 * If this select contains more than one FROM clause, this method will throw
	 * an exception.
	 *
	 * @return the FROM clause of this select, or null if there is none
	 * @throws SqmlLogicError
	 *             if there is more than one FROM clause
	 */
	@Override
	default ISqmlFromClause getFromClause() {

		return ISqmlSelectBlock.super.getFromClause();
	}

	// ---------- extensions ---------- //

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default void validate(ISqmlValidationContext context) {

		new SqmlSelectValidator(this, context).validate();
	}

	default Collection<ISqmlTable> findReferencedTables() {

		return new SqmlSelectReferencedTablesFinder().find(this);
	}

	default boolean isSubSelect() {

		if (this.eContainer() instanceof ISqmlQuery) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	default ISqmlType getSqmlType() {

		List<ISqmlType> types = new ArrayList<>();
		for (ISqmlSelectColumn column: this.getColumns()) {
			types.add(column.getExpression().getSqmlType());
		}
		if (types.size() == 1) {
			return SqmlBuiltInTypes.getListType().parameterize(types.get(0));
		} else {
			return SqmlBuiltInTypes.getListType().parameterize(SqmlBuiltInTypes.getTupleType().parameterize(types));
		}
	}
}
