package com.softicar.sqml.model.tables;

import com.softicar.sqml.model.tables.validation.SqmlTableRowValidator;
import com.softicar.sqml.model.validation.ISqmlValidatable;
import com.softicar.sqml.model.validation.ISqmlValidationContext;
import java.util.List;
import org.eclipse.emf.ecore.EObject;

public interface ISqmlTableRow extends ISqmlValidatable, EObject {

	ISqmlTable getTable();

	List<? extends ISqmlTableRowValue> getValues();

	@Override
	default void validate(ISqmlValidationContext context) {

		new SqmlTableRowValidator(this, context).validate();
	}
}
