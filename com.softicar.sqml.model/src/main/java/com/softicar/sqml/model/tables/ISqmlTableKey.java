package com.softicar.sqml.model.tables;

import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.validation.ISqmlValidatable;
import com.softicar.sqml.model.validation.ISqmlValidationContext;
import java.util.List;

public interface ISqmlTableKey extends ISqmlValidatable, ISqmlModelElement {

	String getName();

	List<ISqmlTableColumn> getColumns();

	default String getImplicitName() {

		return SqmlTableKeyMethods.getImplicitName(this);
	}

	@Override
	default void validate(ISqmlValidationContext context) {

		SqmlTableKeyMethods.validate(this, context);
	}

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}
}
