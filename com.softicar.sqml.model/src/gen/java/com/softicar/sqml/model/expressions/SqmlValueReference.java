/**
 */
package com.softicar.sqml.model.expressions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Value Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.expressions.SqmlValueReference#isNextIteration <em>Next Iteration</em>}</li>
 *   <li>{@link com.softicar.sqml.model.expressions.SqmlValueReference#isDotStar <em>Dot Star</em>}</li>
 *   <li>{@link com.softicar.sqml.model.expressions.SqmlValueReference#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlValueReference()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlValueReference"
 * @generated
 */
public interface SqmlValueReference extends EObject, ISqmlValueReference {
	/**
	 * Returns the value of the '<em><b>Next Iteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Iteration</em>' attribute.
	 * @see #setNextIteration(boolean)
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlValueReference_NextIteration()
	 * @model unique="false"
	 * @generated
	 */
	boolean isNextIteration();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.expressions.SqmlValueReference#isNextIteration <em>Next Iteration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Iteration</em>' attribute.
	 * @see #isNextIteration()
	 * @generated
	 */
	void setNextIteration(boolean value);

	/**
	 * Returns the value of the '<em><b>Dot Star</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dot Star</em>' attribute.
	 * @see #setDotStar(boolean)
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlValueReference_DotStar()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDotStar();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.expressions.SqmlValueReference#isDotStar <em>Dot Star</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dot Star</em>' attribute.
	 * @see #isDotStar()
	 * @generated
	 */
	void setDotStar(boolean value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(SqmlPath)
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlValueReference_Path()
	 * @model containment="true"
	 * @generated
	 */
	SqmlPath getPath();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.expressions.SqmlValueReference#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(SqmlPath value);

} // SqmlValueReference
