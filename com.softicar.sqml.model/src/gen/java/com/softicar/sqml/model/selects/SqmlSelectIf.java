/**
 */
package com.softicar.sqml.model.selects;

import com.softicar.sqml.model.expressions.ISqmlStaticExpression;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Select If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.selects.SqmlSelectIf#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.softicar.sqml.model.selects.SqmlSelectIf#getElseIfs <em>Else Ifs</em>}</li>
 *   <li>{@link com.softicar.sqml.model.selects.SqmlSelectIf#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlSelectIf()
 * @model superTypes="com.softicar.sqml.model.selects.AbstractSqmlSelectBlock com.softicar.sqml.model.interfaces.ISqmlSelectIf"
 * @generated
 */
public interface SqmlSelectIf extends AbstractSqmlSelectBlock, ISqmlSelectIf {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(ISqmlStaticExpression)
	 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlSelectIf_Condition()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlStaticExpression" containment="true"
	 * @generated
	 */
	ISqmlStaticExpression getCondition();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.selects.SqmlSelectIf#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(ISqmlStaticExpression value);

	/**
	 * Returns the value of the '<em><b>Else Ifs</b></em>' containment reference list.
	 * The list contents are of type {@link com.softicar.sqml.model.selects.ISqmlSelectElseIf}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Ifs</em>' containment reference list.
	 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlSelectIf_ElseIfs()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlSelectElseIf" containment="true"
	 * @generated
	 */
	EList<ISqmlSelectElseIf> getElseIfs();

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(ISqmlSelectElse)
	 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlSelectIf_Else()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlSelectElse" containment="true"
	 * @generated
	 */
	ISqmlSelectElse getElse();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.selects.SqmlSelectIf#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(ISqmlSelectElse value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="com.softicar.sqml.model.externals.List&lt;? extends com.softicar.sqml.model.interfaces.ISqmlSelectPart&gt;" unique="false" many="false"
	 * @generated
	 */
	List<? extends ISqmlSelectPart> getAllElements();

} // SqmlSelectIf
