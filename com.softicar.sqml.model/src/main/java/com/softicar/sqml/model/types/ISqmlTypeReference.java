package com.softicar.sqml.model.types;

import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.types.validation.SqmlIssueUnresolvedTypeReference;
import com.softicar.sqml.model.validation.ISqmlValidatable;
import com.softicar.sqml.model.validation.ISqmlValidationContext;
import java.util.List;

public interface ISqmlTypeReference extends ISqmlModelElement, ISqmlValidatable {

	boolean isList();

	ISqmlTypeDefinition getTypeDefinition();

	List<? extends ISqmlTypeReference> getTypeParameters();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	default ISqmlType getSqmlType() {

		return SqmlTypeReferenceMethods.getSqmlType(this);
	}

	@Override
	default void validate(ISqmlValidationContext context) {

		SqmlIssueUnresolvedTypeReference.validate(this, context);
	}
}
