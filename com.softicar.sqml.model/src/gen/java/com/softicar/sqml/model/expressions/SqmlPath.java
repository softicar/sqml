/**
 */
package com.softicar.sqml.model.expressions;

import com.softicar.sqml.model.ISqmlModelElement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.expressions.SqmlPath#getParent <em>Parent</em>}</li>
 *   <li>{@link com.softicar.sqml.model.expressions.SqmlPath#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlPath()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlPath"
 * @generated
 */
public interface SqmlPath extends EObject, ISqmlPath {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' containment reference.
	 * @see #setParent(SqmlPath)
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlPath_Parent()
	 * @model containment="true"
	 * @generated
	 */
	SqmlPath getParent();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.expressions.SqmlPath#getParent <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' containment reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(SqmlPath value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ISqmlModelElement)
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlPath_Target()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlModelElement"
	 * @generated
	 */
	ISqmlModelElement getTarget();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.expressions.SqmlPath#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ISqmlModelElement value);

} // SqmlPath
