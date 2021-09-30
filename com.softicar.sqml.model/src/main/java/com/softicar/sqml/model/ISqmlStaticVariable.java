package com.softicar.sqml.model;

import com.softicar.sqml.model.types.ISqmlType;
import org.eclipse.emf.ecore.EObject;

public interface ISqmlStaticVariable extends EObject {

	String getName();

	ISqmlType getSqmlType();

	// TODO: move down to ISqmlQueryParameter
	default boolean isOptional() {

		return false;
	}
}
