package com.softicar.sqml.model.queries;

import com.softicar.sqml.model.ISqmlStaticVariable;
import com.softicar.sqml.model.queries.validation.SqmlQueryParameterValidator;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.types.ISqmlTypeReference;
import com.softicar.sqml.model.validation.ISqmlValidatable;
import com.softicar.sqml.model.validation.ISqmlValidationContext;

public interface ISqmlQueryParameter extends ISqmlValidatable, ISqmlStaticVariable {

	ISqmlQuery getQuery();

	ISqmlTypeReference getTypeReference();

	@Override
	default void validate(ISqmlValidationContext context) {

		new SqmlQueryParameterValidator(this, context).validate();
	}

	@Override
	default ISqmlType getSqmlType() {

		return getTypeReference().getSqmlType();
	}
}
