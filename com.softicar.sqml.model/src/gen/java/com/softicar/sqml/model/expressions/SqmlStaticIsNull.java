/**
 */
package com.softicar.sqml.model.expressions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Static Is Null</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.expressions.SqmlStaticIsNull#getParameterReference <em>Parameter Reference</em>}</li>
 *   <li>{@link com.softicar.sqml.model.expressions.SqmlStaticIsNull#isNot <em>Not</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlStaticIsNull()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlStaticIsNull"
 * @generated
 */
public interface SqmlStaticIsNull extends EObject, ISqmlStaticIsNull {
	/**
	 * Returns the value of the '<em><b>Parameter Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Reference</em>' containment reference.
	 * @see #setParameterReference(ISqmlStaticVariableReference)
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlStaticIsNull_ParameterReference()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlStaticVariableReference" containment="true"
	 * @generated
	 */
	ISqmlStaticVariableReference getParameterReference();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.expressions.SqmlStaticIsNull#getParameterReference <em>Parameter Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Reference</em>' containment reference.
	 * @see #getParameterReference()
	 * @generated
	 */
	void setParameterReference(ISqmlStaticVariableReference value);

	/**
	 * Returns the value of the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' attribute.
	 * @see #setNot(boolean)
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlStaticIsNull_Not()
	 * @model unique="false"
	 * @generated
	 */
	boolean isNot();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.expressions.SqmlStaticIsNull#isNot <em>Not</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not</em>' attribute.
	 * @see #isNot()
	 * @generated
	 */
	void setNot(boolean value);

} // SqmlStaticIsNull
