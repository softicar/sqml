package com.softicar.sqml.model.functions;

import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.functions.validation.SqmlFunctionCallValidator;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.validation.ISqmlValidatable;
import com.softicar.sqml.model.validation.ISqmlValidationContext;
import java.util.List;
import org.eclipse.xtext.naming.QualifiedName;

public interface ISqmlFunctionCall extends ISqmlExpression, ISqmlValidatable {

	ISqmlFunction getFunction();

	List<ISqmlExpression> getArguments();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default ISqmlType getSqmlType() {

		return SqmlFunctionCallMethods.getSqmlType(this);
	}

	default QualifiedName getFunctionName() {

		return SqmlFunctionCallMethods.getFunctionName(this);
	}

	default String getDisplayName() {

		return SqmlFunctionCallMethods.getDisplayName(this);
	}

	default boolean isWellDefined() {

		return SqmlFunctionCallMethods.isWellDefined(this);
	}

	default boolean isQualifiedCall() {

		QualifiedName functionName = getFunctionName();
		return functionName != null && functionName.getSegmentCount() > 1;
	}

	@Override
	default void validate(ISqmlValidationContext context) {

		new SqmlFunctionCallValidator(this, context).validate();
	}
}
