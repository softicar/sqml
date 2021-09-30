package com.softicar.sqml.model.expressions;

import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.expressions.validation.SqmlIssueUnresolvedPathTarget;
import com.softicar.sqml.model.validation.ISqmlValidatable;
import com.softicar.sqml.model.validation.ISqmlValidationContext;
import java.util.List;

public interface ISqmlPath extends ISqmlValidatable, ISqmlModelElement {

	ISqmlPath getParent();

	ISqmlModelElement getTarget();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default void validate(ISqmlValidationContext context) {

		if (getTarget().eIsProxy()) {
			context.accept(new SqmlIssueUnresolvedPathTarget(this));
		}
	}

	default List<ISqmlModelElement> getAllTargets() {

		return SqmlPaths.getAllTargets(this);
	}

	default ISqmlModelElement getRootTarget() {

		ISqmlPath parent = getParent();
		return parent != null? parent.getRootTarget() : getTarget();
	}
}
