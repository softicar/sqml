/**
 */
package com.softicar.sqml.model.expressions;

import com.softicar.sqml.model.ISqmlStaticVariable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Static Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.expressions.SqmlStaticVariableReference#isNextIteration <em>Next Iteration</em>}</li>
 *   <li>{@link com.softicar.sqml.model.expressions.SqmlStaticVariableReference#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlStaticVariableReference()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlStaticVariableReference"
 * @generated
 */
public interface SqmlStaticVariableReference extends EObject, ISqmlStaticVariableReference {
	/**
	 * Returns the value of the '<em><b>Next Iteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Iteration</em>' attribute.
	 * @see #setNextIteration(boolean)
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlStaticVariableReference_NextIteration()
	 * @model unique="false"
	 * @generated
	 */
	boolean isNextIteration();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.expressions.SqmlStaticVariableReference#isNextIteration <em>Next Iteration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Iteration</em>' attribute.
	 * @see #isNextIteration()
	 * @generated
	 */
	void setNextIteration(boolean value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(ISqmlStaticVariable)
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlStaticVariableReference_Variable()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlStaticVariable"
	 * @generated
	 */
	ISqmlStaticVariable getVariable();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.expressions.SqmlStaticVariableReference#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(ISqmlStaticVariable value);

} // SqmlStaticVariableReference
