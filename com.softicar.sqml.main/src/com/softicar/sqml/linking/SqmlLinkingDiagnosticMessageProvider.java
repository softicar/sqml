package com.softicar.sqml.linking;

import com.softicar.sqml.model.expressions.ISqmlBinaryOperation;
import com.softicar.sqml.model.expressions.validation.SqmlIssueUnresolvedBinaryOperator;
import org.eclipse.xtext.diagnostics.DiagnosticMessage;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.linking.impl.LinkingDiagnosticMessageProvider;

public class SqmlLinkingDiagnosticMessageProvider extends LinkingDiagnosticMessageProvider {

	@Override
	public DiagnosticMessage getUnresolvedProxyMessage(ILinkingDiagnosticContext context) {

		if (context.getContext() instanceof ISqmlBinaryOperation) {
			SqmlIssueUnresolvedBinaryOperator unresolvedBinaryOperator = new SqmlIssueUnresolvedBinaryOperator((ISqmlBinaryOperation) context.getContext());
			return new DiagnosticMessage(unresolvedBinaryOperator.getMessage(), Severity.ERROR, unresolvedBinaryOperator.getType().getIdentifier());
		} else {
			return super.getUnresolvedProxyMessage(context);
		}
	}
}
