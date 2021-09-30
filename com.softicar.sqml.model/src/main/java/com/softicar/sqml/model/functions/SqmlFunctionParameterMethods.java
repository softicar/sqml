package com.softicar.sqml.model.functions;

import com.softicar.sqml.model.expressions.ISqmlStaticVariableReference;
import com.softicar.sqml.model.functions.validation.SqmlIssueUnusedFunctionParameter;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.types.ISqmlTypeReference;
import com.softicar.sqml.model.validation.ISqmlIssueAcceptor;
import java.util.List;
import org.eclipse.xtext.EcoreUtil2;

public class SqmlFunctionParameterMethods {

	public static void validate(ISqmlFunctionParameter parameter, ISqmlIssueAcceptor acceptor) {

		if (!isUsed(parameter)) {
			acceptor.accept(new SqmlIssueUnusedFunctionParameter(parameter));
		}
	}

	private static boolean isUsed(ISqmlFunctionParameter parameter) {

		List<ISqmlStaticVariableReference> references = EcoreUtil2.getAllContentsOfType(parameter.getFunction(), ISqmlStaticVariableReference.class);

		for (ISqmlStaticVariableReference reference: references) {
			if (reference.getVariable() == parameter) {
				return true;
			}
		}

		return false;
	}

	public static ISqmlType getSqmlType(ISqmlFunctionParameter functionParameter) {

		ISqmlTypeReference typeReference = functionParameter.getTypeReference();
		return typeReference != null? typeReference.getSqmlType() : null;
	}
}
