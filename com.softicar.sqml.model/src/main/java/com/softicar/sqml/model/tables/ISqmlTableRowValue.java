package com.softicar.sqml.model.tables;

import com.softicar.sqml.model.literals.ISqmlLiteral;
import org.eclipse.emf.ecore.EObject;

public interface ISqmlTableRowValue extends EObject {

	ISqmlTableRow getRow();

	ISqmlLiteral<?> getLiteral();

	boolean isNull();
}
