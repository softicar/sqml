package com.softicar.sqml.generator.select;

import com.softicar.sqml.model.ISqmlColumn;
import com.softicar.sqml.model.ISqmlTabular;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.expressions.ISqmlValueReference;
import com.softicar.sqml.model.generation.ISqlBuilderBuilder;
import com.softicar.sqml.model.selects.ISqmlSelectColumn;
import com.softicar.sqml.model.selects.ISqmlVariable;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.utils.SqmlLogicError;
import org.eclipse.emf.ecore.EObject;

public class ValueReferenceGenerator {

	private final ISqlBuilderBuilder builder;
	private final ISqmlValueReference valueReference;

	public ValueReferenceGenerator(ISqlBuilderBuilder builder, ISqmlValueReference valueReference) {

		this.builder = builder;
		this.valueReference = valueReference;
	}

	public void generate() {

		if (valueReference.isVariableReference()) {
			// variable reference
			ISqmlVariable variable = (ISqmlVariable) valueReference.getValue();
			ISqmlTabular tabular = variable.getTabular();
			if (tabular instanceof ISqmlTable) {
				ISqmlTable table = (ISqmlTable) tabular;
				EObject container = valueReference.eContainer();
				if (container instanceof ISqmlSelectColumn) {
					if (valueReference.isDotStar()) {
						ISqmlSelectColumn selectColumn = (ISqmlSelectColumn) container;
						String columnName = getColumnName(variable, selectColumn);
						builder.addTableColumns(variable, table, columnName);
					} else {
						builder.addIdentifier(variable, table.getPrimarKeyColumn());
					}
				} else {
					builder.addIdentifier(variable, table.getPrimarKeyColumn());
				}
			} else {
				throw new SqmlLogicError("Variable reference does not refer to a table.");
			}
		} else if (valueReference.isTabularColumnReference()) {
			// tabular column reference
			ISqmlVariable variable = (ISqmlVariable) valueReference.getPath().getParent().getTarget();
			ISqmlColumn column = (ISqmlColumn) valueReference.getValue();
			builder.addIdentifier(variable, column);
		} else if (valueReference.isIdColumnReference()) {
			ISqmlVariable variable = (ISqmlVariable) valueReference.getPath().getParent().getParent().getTarget();
			ISqmlColumn column = (ISqmlColumn) valueReference.getPath().getParent().getTarget();
			builder.addIdentifier(variable, column);
		} else if (valueReference.isSelectColumnReference()) {
			ISqmlSelectColumn column = (ISqmlSelectColumn) valueReference.getValue();
			if (isVariableReference(column.getExpression())) {
				ISqmlValueReference valueReference = (ISqmlValueReference) column.getExpression();
				ISqmlVariable variable = (ISqmlVariable) valueReference.getValue();
				ISqmlTabular tabular = variable.getTabular();
				if (tabular instanceof ISqmlTable) {
					ISqmlTable table = (ISqmlTable) tabular;
					builder.addIdentifier(variable, table.getPrimarKeyColumn());
				} else {
					throw new SqmlLogicError("Variable reference does not refer to a table.");
				}
			} else {
				builder.addIdentifier(column);
			}
		} else {
			throw new SqmlGenerationException("Illegal value reference.");
		}
	}

	private boolean isVariableReference(ISqmlExpression expression) {

		return expression instanceof ISqmlValueReference && ((ISqmlValueReference) expression).isVariableReference();
	}

	private static String getColumnName(ISqmlVariable variable, ISqmlSelectColumn selectColumn) {

		if (selectColumn.getAlias() != null) {
			return selectColumn.getAlias();
		} else {
			return variable.getName();
		}
	}
}
