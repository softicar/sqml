package com.softicar.sqml.model.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

public class SqmlIssueAcceptor implements ISqmlIssueAcceptor {

	private final ValidationMessageAcceptor messageAcceptor;
	private final ISqmlValidationConfiguration validatorConfiguration;

	public SqmlIssueAcceptor(ValidationMessageAcceptor messageAcceptor, ISqmlValidationConfiguration validatorConfiguration) {

		this.messageAcceptor = messageAcceptor;
		this.validatorConfiguration = validatorConfiguration;
	}

	@Override
	public void accept(ISqmlIssue issue) {

		String message = issue.getMessage();
		EObject targetObject = issue.getTargetObject();
		String issueCode = issue.getType().getIdentifier();

		INode targetNode = issue.getTargetNode();
		if (targetNode != null) {
			int offset = targetNode.getOffset();
			int length = targetNode.getLength();

			switch (validatorConfiguration.getSeverity(issue)) {
			case ERROR:
				messageAcceptor.acceptError(message, targetObject, offset, length, issueCode);
				break;
			case WARNING:
				messageAcceptor.acceptWarning(message, targetObject, offset, length, issueCode);
				break;
			case INFO:
				messageAcceptor.acceptInfo(message, targetObject, offset, length, issueCode);
				break;
			case IGNORE:
				// nothing to do
			}
		} else {
			EStructuralFeature feature = issue.getStructuralFeature();

			switch (validatorConfiguration.getSeverity(issue)) {
			case ERROR:
				messageAcceptor.acceptError(message, targetObject, feature, -1, issueCode);
				break;
			case WARNING:
				messageAcceptor.acceptWarning(message, targetObject, feature, -1, issueCode);
				break;
			case INFO:
				messageAcceptor.acceptInfo(message, targetObject, feature, -1, issueCode);
				break;
			case IGNORE:
				// nothing to do
			}
		}
	}
}
