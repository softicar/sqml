package com.softicar.sqml.model.queries;

import com.softicar.sqml.model.files.ISqmlFileElement;
import com.softicar.sqml.model.queries.validation.SqmlQueryValidator;
import com.softicar.sqml.model.selects.ISqmlSelect;
import com.softicar.sqml.model.validation.ISqmlValidatable;
import com.softicar.sqml.model.validation.ISqmlValidationContext;
import java.util.List;

public interface ISqmlQuery extends ISqmlFileElement, ISqmlValidatable {

	@Override
	String getName();

	ISqmlSelect getSelect();

	List<? extends ISqmlQueryParameter> getParameters();

	@Override
	default void validate(ISqmlValidationContext context) {

		new SqmlQueryValidator(this, context).validate();
	}
}
