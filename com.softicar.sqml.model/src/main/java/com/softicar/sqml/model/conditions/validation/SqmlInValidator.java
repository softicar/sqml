package com.softicar.sqml.model.conditions.validation;

import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.conditions.ISqmlIn;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.expressions.ISqmlRowConstructor;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.validation.ISqmlIssueAcceptor;

public class SqmlInValidator {

	private final ISqmlIn in;
	private final ISqmlIssueAcceptor acceptor;

	public SqmlInValidator(ISqmlIn in, ISqmlIssueAcceptor acceptor) {

		this.in = in;
		this.acceptor = acceptor;
	}

	public void validate() {

		ISqmlType leftType = in.getLeft().getSqmlType();
		ISqmlType rightType = in.getRight().getSqmlType();

		if (rightType.isCollection()) {
			validateComparableTypes(leftType, rightType.getElementType());
		} else if (in.getRight() instanceof ISqmlRowConstructor && rightType.isTuple()) {
			ISqmlRowConstructor rowConstructor = (ISqmlRowConstructor) in.getRight();
			ISqmlType commonType = validateCommonType(rowConstructor);
			validateComparableTypes(leftType, commonType);
		} else {
			acceptor.accept(new SqmlIssueRightInOperandIsNotACollection(in));
		}
	}

	private void validateComparableTypes(ISqmlType leftType, ISqmlType rightElementType) {

		if (rightElementType.is(leftType)) {
			// okay
		} else if (leftType instanceof ISqmlTable && rightElementType.is(SqmlBuiltInTypes.getIntegerType())) {
			// okay
		} else {
			acceptor.accept(new SqmlIssueInOperandsNotCompatible(in));
		}
	}

	private ISqmlType validateCommonType(ISqmlRowConstructor rowConstructor) {

		ISqmlType commonType = null;
		for (ISqmlExpression expression: rowConstructor.getExpressions()) {
			ISqmlType expressionType = expression.getSqmlType();
			if (commonType == null) {
				commonType = expressionType;
			} else if (!expressionType.is(commonType)) {
				acceptor.accept(new SqmlIssueInconsistenElementTypeInRowConstructor(rowConstructor, commonType, expressionType));
			}
		}
		return commonType;
	}
}
