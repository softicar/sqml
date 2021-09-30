/**
 */
package com.softicar.sqml.model.selects;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Sqml Select Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.selects.AbstractSqmlSelectBlock#getParts <em>Parts</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.selects.SelectsPackage#getAbstractSqmlSelectBlock()
 * @model abstract="true" superTypes="com.softicar.sqml.model.interfaces.ISqmlSelectBlock"
 * @generated
 */
public interface AbstractSqmlSelectBlock extends EObject, ISqmlSelectBlock {
	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link com.softicar.sqml.model.selects.ISqmlSelectPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see com.softicar.sqml.model.selects.SelectsPackage#getAbstractSqmlSelectBlock_Parts()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlSelectPart" containment="true"
	 * @generated
	 */
	EList<ISqmlSelectPart> getParts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="com.softicar.sqml.model.externals.List&lt;? extends com.softicar.sqml.model.interfaces.ISqmlSelectPart&gt;" unique="false" many="false"
	 * @generated
	 */
	List<? extends ISqmlSelectPart> getAllElements();

} // AbstractSqmlSelectBlock
