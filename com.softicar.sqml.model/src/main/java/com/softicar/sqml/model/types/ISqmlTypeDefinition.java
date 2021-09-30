package com.softicar.sqml.model.types;

import com.softicar.sqml.model.ISqmlModelElement;
import org.eclipse.emf.ecore.EReference;

/**
 * Represents the definition of an SQML type.
 * <p>
 * In contrast to {@link ISqmlType}, an type definition is always part of an
 * {@link EReference} and there is only one definition for the same type.
 * Examples of type definitions are tables and built-in types.
 * 
 * @author Oliver Richers
 */
public interface ISqmlTypeDefinition extends ISqmlType, ISqmlModelElement {

	// nothing to add
}
