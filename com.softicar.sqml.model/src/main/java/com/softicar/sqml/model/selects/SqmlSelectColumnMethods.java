package com.softicar.sqml.model.selects;

import com.softicar.sqml.model.ISqmlColumn;
import com.softicar.sqml.model.ISqmlStaticVariable;
import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.expressions.ISqmlStaticVariableReference;
import com.softicar.sqml.model.expressions.ISqmlValueReference;
import com.softicar.sqml.model.selects.validation.SqmlSelectColumnValidator;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.validation.ISqmlIssueAcceptor;

public class SqmlSelectColumnMethods {

	public static void validate(ISqmlSelectColumn selectColumn, ISqmlIssueAcceptor acceptor) {

		new SqmlSelectColumnValidator(selectColumn, acceptor).validate();
	}

	public static String getName(ISqmlSelectColumn selectColumn) {

		String alias = selectColumn.getAlias();
		if (alias != null) {
			return alias;
		} else {
			ISqmlExpression expression = selectColumn.getExpression();
			if (expression instanceof ISqmlValueReference) {
				ISqmlValueReference valueReference = (ISqmlValueReference) expression;
				if (valueReference.isVariableReference()) {
					return ((ISqmlVariable) valueReference.getValue()).getName();
				} else if (valueReference.isTabularColumnReference()) {
					return ((ISqmlColumn) valueReference.getValue()).getName();
				} else {
					return null;
				}
			} else if (expression instanceof ISqmlStaticVariableReference) {
				ISqmlStaticVariableReference variableReference = (ISqmlStaticVariableReference) expression;
				ISqmlStaticVariable variable = variableReference.getVariable();
				return variable != null? variable.getName() : null;
			} else {
				return null;
			}
		}
	}

	public static ISqmlType getSqmlType(ISqmlSelectColumn selectColumn) {

		ISqmlExpression expression = selectColumn.getExpression();
		return expression != null? expression.getSqmlType() : SqmlBuiltInTypes.getUnknownType();
	}
}
