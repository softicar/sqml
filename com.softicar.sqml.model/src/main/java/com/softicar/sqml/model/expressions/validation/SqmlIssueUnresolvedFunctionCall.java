package com.softicar.sqml.model.expressions.validation;

import com.softicar.sqml.model.conditions.ConditionsPackage;
import com.softicar.sqml.model.conditions.SqmlComparison;
import com.softicar.sqml.model.expressions.AbstractSqmlBinaryOperation;
import com.softicar.sqml.model.expressions.ExpressionsPackage;
import com.softicar.sqml.model.functions.FunctionsPackage;
import com.softicar.sqml.model.functions.ISqmlFunctionCall;
import com.softicar.sqml.model.functions.SqmlFunctionCall;
import com.softicar.sqml.model.utils.SqmlLogicError;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueUnresolvedFunctionCall extends AbstractSqmlError<ISqmlFunctionCall> {

	public SqmlIssueUnresolvedFunctionCall(ISqmlFunctionCall functionCall) {

		super(functionCall);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		// TODO: improved this by introducing ISqmlCall
		if (getTargetObject() instanceof SqmlFunctionCall) {
			return FunctionsPackage.eINSTANCE.getSqmlFunctionCall_Function();
		} else if (getTargetObject() instanceof AbstractSqmlBinaryOperation) {
			return ExpressionsPackage.eINSTANCE.getAbstractSqmlBinaryOperation_Function();
		} else if (getTargetObject() instanceof SqmlComparison) {
			return ConditionsPackage.eINSTANCE.getSqmlComparison_Function();
		} else {
			throw new SqmlLogicError("Unexpected object of type %s", getTargetObject().getClass().getCanonicalName());
		}
	}

	@Override
	public String getMessage() {

		return String.format("No matching function found for call to %s.", getTargetObject().getDisplayName());
	}
}
