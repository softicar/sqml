package com.softicar.sqml.model.expressions;

import com.softicar.sqml.model.ISqmlColumn;
import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.ISqmlValue;
import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.expressions.validation.SqmlValueReferenceValidator;
import com.softicar.sqml.model.selects.ISqmlSelectColumn;
import com.softicar.sqml.model.selects.ISqmlVariable;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.validation.ISqmlValidatable;
import com.softicar.sqml.model.validation.ISqmlValidationContext;
import java.util.List;

public interface ISqmlValueReference extends ISqmlValidatable, ISqmlExpression {

	ISqmlPath getPath();

	boolean isNextIteration();

	boolean isDotStar();

	/**
	 * Returns the referenced value.
	 *
	 * @return the referenced value or null if the target is not an instance of
	 *         {@link ISqmlValue}
	 */
	default ISqmlValue getValue() {

		ISqmlModelElement target = getPath().getTarget();
		if (target != null && target.eIsProxy()) {
			// TODO: is this special case necessary?
			return null;
		} else if (target instanceof ISqmlValue) {
			return (ISqmlValue) target;
		} else {
			return null;
		}
	}

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	/**
	 * Returns true if this is a reference to a SELECT variable.
	 * <p>
	 * For example to a table variable {@code SELECT x FROM X x} but also to a
	 * sub-select variable {@code SELECT x FROM (SELECT ...) x}.
	 *
	 * @return if this is a variable reference
	 */
	default boolean isVariableReference() {

		ISqmlPath path = getPath();
		return path.getParent() == null && path.getTarget() instanceof ISqmlVariable;
	}

	/**
	 * Returns true if this is a reference to a SELECT variable representing a
	 * table.
	 * <p>
	 * For example {@code SELECT x FROM X x}.
	 *
	 * @return if this is a variable reference
	 */
	default boolean isTableVariableReference() {

		ISqmlPath path = getPath();
		if (path.getParent() == null && path.getTarget() instanceof ISqmlVariable) {
			ISqmlVariable variable = (ISqmlVariable) path.getTarget();
			return variable.getTabular() instanceof ISqmlTable;
		} else {
			return false;
		}
	}

	/**
	 * Returns true if this is a reference to a tabular column, i.e. a reference
	 * to a column of a table or a sub-select.
	 * <p>
	 * For example as a reference to a table column
	 * {@code SELECT x.name FROM X x} or as a reference to a sub-select column
	 * {@code SELECT x.name FROM (SELECT 'some name' AS name) x}.
	 *
	 * @return if this is a tabular column reference
	 */
	default boolean isTabularColumnReference() {

		List<? extends ISqmlModelElement> targets = getPath().getAllTargets();
		return targets.size() == 2 && targets.get(0) instanceof ISqmlVariable && targets.get(1) instanceof ISqmlColumn;
	}

	/**
	 * Returns true if this is a reference to the serial column of a table
	 * through a foreign key column.
	 * <p>
	 * For example {@code SELECT x.city.id FROM X x}.
	 *
	 * @return if this is a serial column reference
	 */
	default boolean isIdColumnReference() {

		List<? extends ISqmlModelElement> targets = getPath().getAllTargets();
		return targets.size() == 3 && targets.get(0) instanceof ISqmlVariable && targets.get(1) instanceof ISqmlColumn
				&& SqmlValueReferences.isIdColumn(targets.get(2));
	}

	/**
	 * Returns true if this is a reference to a SELECT column.
	 * <p>
	 * References to SELECT columns are only valid in the HAVING and ORDER BY
	 * clause. For example {@code SELECT 1 AS x HAVING x > 0}
	 *
	 * @return if this is a reference to a SELECT column
	 */
	default boolean isSelectColumnReference() {

		List<? extends ISqmlModelElement> targets = getPath().getAllTargets();
		return targets.size() == 1 && targets.get(0) instanceof ISqmlSelectColumn;
	}

	@Override
	default void validate(ISqmlValidationContext context) {

		new SqmlValueReferenceValidator(this, context).validate();
	}

	@Override
	default ISqmlType getSqmlType() {

		ISqmlValue value = getValue();
		return value != null? value.getSqmlType() : SqmlBuiltInTypes.getUnknownType();
	}
}
