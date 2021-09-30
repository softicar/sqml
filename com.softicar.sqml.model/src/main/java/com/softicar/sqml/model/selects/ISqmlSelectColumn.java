package com.softicar.sqml.model.selects;

import com.softicar.sqml.model.ISqmlColumn;
import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.expressions.ISqmlValueReference;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.validation.ISqmlValidatable;
import com.softicar.sqml.model.validation.ISqmlValidationContext;

public interface ISqmlSelectColumn extends ISqmlValidatable, ISqmlColumn {

	/**
	 * Returns the alias of this column.
	 *
	 * @return the alias or null if no alias was given
	 */
	String getAlias();

	/**
	 * Returns the title of this column.
	 *
	 * @return the title or null if no title was given
	 */
	String getTitle();

	ISqmlExpression getExpression();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default void validate(ISqmlValidationContext context) {

		SqmlSelectColumnMethods.validate(this, context);
	}

	default boolean isDotStarTableVariableReference() {

		ISqmlExpression expression = getExpression();
		if (expression instanceof ISqmlValueReference) {
			ISqmlValueReference valueReference = (ISqmlValueReference) expression;
			return valueReference.isVariableReference() && expression.getSqmlType() instanceof ISqmlTable && valueReference.isDotStar();
		} else {
			return false;
		}
	}

	default ISqmlTable getTableOfTableRowExpression() {

		ISqmlExpression expression = getExpression();
		if (expression instanceof ISqmlValueReference) {
			ISqmlValueReference valueReference = (ISqmlValueReference) expression;
			if (valueReference.isVariableReference() && expression.getSqmlType() instanceof ISqmlTable) {
				return (ISqmlTable) expression.getSqmlType();
			}
		}
		return null;
	}

	default boolean isForeignTableReference() {

		ISqmlExpression expression = getExpression();
		if (expression instanceof ISqmlValueReference) {
			ISqmlValueReference valueReference = (ISqmlValueReference) expression;
			return valueReference.isTabularColumnReference() && expression.getSqmlType() instanceof ISqmlTable;
		} else {
			return false;
		}
	}

	@Override
	default ISqmlType getSqmlType() {

		return SqmlSelectColumnMethods.getSqmlType(this);
	}
}
