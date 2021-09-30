package com.softicar.sqml.model.functions.validation;

import com.softicar.sqml.model.expressions.validation.SqmlIssueAmbiguousFunctionCall;
import com.softicar.sqml.model.expressions.validation.SqmlIssueFunctionCallToInvisibleFunction;
import com.softicar.sqml.model.expressions.validation.SqmlIssueIncompatibleFunctionCallArguments;
import com.softicar.sqml.model.expressions.validation.SqmlIssueUnresolvedFunctionCall;
import com.softicar.sqml.model.functions.ISqmlFunction;
import com.softicar.sqml.model.functions.ISqmlFunctionCall;
import com.softicar.sqml.model.functions.linking.ISqmlFunctionCallLinkFinderProvider;
import com.softicar.sqml.model.functions.linking.SqmlFunctionCallLink;
import com.softicar.sqml.model.functions.linking.SqmlFunctionCallLinks;
import com.softicar.sqml.model.validation.ISqmlValidationContext;

public class SqmlFunctionCallValidator {

	private final ISqmlFunctionCall functionCall;
	private final ISqmlValidationContext context;

	public SqmlFunctionCallValidator(ISqmlFunctionCall functionCall, ISqmlValidationContext context) {

		this.functionCall = functionCall;
		this.context = context;
	}

	public void validate() {

		checkForUnresolvedCall();
		checkForAmbiguousCall();
		checkForIncompatbleArguments();
		checkForTargetInvisibility();
	}

	private void checkForUnresolvedCall() {

		if (functionCall.getFunction().eIsProxy()) {
			context.accept(new SqmlIssueUnresolvedFunctionCall(functionCall));
		}
	}

	private void checkForAmbiguousCall() {

		SqmlFunctionCallLinks links = context
			.getInjector()//
			.getInstance(ISqmlFunctionCallLinkFinderProvider.class)
			.getFinder()
			.findLinks(functionCall);
		if (links.isAmbiguous()) {
			context.accept(new SqmlIssueAmbiguousFunctionCall(functionCall));
		}
	}

	private void checkForIncompatbleArguments() {

		ISqmlFunction function = functionCall.getFunction();
		if (!function.eIsProxy() && !function.acceptsArguments(functionCall.getArguments())) {
			context.accept(new SqmlIssueIncompatibleFunctionCallArguments(functionCall));
		}
	}

	private void checkForTargetInvisibility() {

		SqmlFunctionCallLink link = new SqmlFunctionCallLink(functionCall, functionCall.getFunction());
		if (!link.isVisible() && functionCall.getFunction().getName() != null) {
			context.accept(new SqmlIssueFunctionCallToInvisibleFunction(functionCall));
		}
	}
}
