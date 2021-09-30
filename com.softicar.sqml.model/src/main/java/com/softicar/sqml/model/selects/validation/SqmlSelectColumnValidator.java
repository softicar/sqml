package com.softicar.sqml.model.selects.validation;

import com.softicar.sqml.model.expressions.ISqmlStaticVariableReference;
import com.softicar.sqml.model.expressions.ISqmlValueReference;
import com.softicar.sqml.model.selects.ISqmlSelectColumn;
import com.softicar.sqml.model.validation.ISqmlIssueAcceptor;

public class SqmlSelectColumnValidator {

	private final ISqmlSelectColumn selectColumn;
	private final ISqmlIssueAcceptor acceptor;

	public SqmlSelectColumnValidator(ISqmlSelectColumn selectColumn, ISqmlIssueAcceptor acceptor) {

		this.selectColumn = selectColumn;
		this.acceptor = acceptor;
	}

	public void validate() {

		if (selectColumn.getAlias() == null) {
			if (selectColumn.getExpression() instanceof ISqmlValueReference) {
				ISqmlValueReference valueReference = (ISqmlValueReference) selectColumn.getExpression();
				if (valueReference.isVariableReference()) {
					// okay
				} else if (valueReference.isTabularColumnReference()) {
					// okay
				} else {
					acceptor.accept(new SqmlIssueMissingAliasForSelectColumn(selectColumn));
				}
			} else if (selectColumn.getExpression() instanceof ISqmlStaticVariableReference) {
				// okay
			} else {
				acceptor.accept(new SqmlIssueMissingAliasForSelectColumn(selectColumn));
			}
		} else {
			// check naming convention of alias
			String alias = selectColumn.getAlias();
			if (!alias.isEmpty() && !Character.isLowerCase(alias.charAt(0))) {
				acceptor.accept(new SqmlIssueSelectColumnAliasNotLowerCamelCase(selectColumn));
			}
		}
	}
}
