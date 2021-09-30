package com.softicar.sqml.model.queries.validation;

import com.softicar.sqml.model.expressions.ISqmlStaticVariableReference;
import com.softicar.sqml.model.queries.ISqmlQueryParameter;
import com.softicar.sqml.model.validation.ISqmlIssueAcceptor;
import java.util.List;
import org.eclipse.xtext.EcoreUtil2;

public class SqmlQueryParameterValidator {

	private final ISqmlQueryParameter parameter;
	private final ISqmlIssueAcceptor acceptor;

	public SqmlQueryParameterValidator(ISqmlQueryParameter parameter, ISqmlIssueAcceptor acceptor) {

		this.parameter = parameter;
		this.acceptor = acceptor;
	}

	public void validate() {

		if (!isUsed()) {
			acceptor.accept(new SqmlIssueQueryParameterUnused(parameter));
		}

		String name = parameter.getName();
		if (name != null && !name.isEmpty()) {
			if (!Character.isLowerCase(name.charAt(0))) {
				acceptor.accept(new SqmlIssueQueryParameterNameNotLowerCamelCase(parameter));
			}
		}
	}

	private boolean isUsed() {

		List<ISqmlStaticVariableReference> references = EcoreUtil2.getAllContentsOfType(parameter.getQuery(), ISqmlStaticVariableReference.class);

		for (ISqmlStaticVariableReference reference: references) {
			if (reference.getVariable() == parameter) {
				return true;
			}
		}

		return false;
	}
}
