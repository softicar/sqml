/**
 */
package com.softicar.sqml.model.expressions.impl;

import com.softicar.sqml.model.ISqmlStaticVariable;

import com.softicar.sqml.model.expressions.ExpressionsPackage;
import com.softicar.sqml.model.expressions.SqmlStaticVariableReference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sqml Static Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.expressions.impl.SqmlStaticVariableReferenceImpl#isNextIteration <em>Next Iteration</em>}</li>
 *   <li>{@link com.softicar.sqml.model.expressions.impl.SqmlStaticVariableReferenceImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqmlStaticVariableReferenceImpl extends MinimalEObjectImpl.Container implements SqmlStaticVariableReference {
	/**
	 * The default value of the '{@link #isNextIteration() <em>Next Iteration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNextIteration()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEXT_ITERATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNextIteration() <em>Next Iteration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNextIteration()
	 * @generated
	 * @ordered
	 */
	protected boolean nextIteration = NEXT_ITERATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected ISqmlStaticVariable variable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqmlStaticVariableReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.SQML_STATIC_VARIABLE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNextIteration() {
		return nextIteration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextIteration(boolean newNextIteration) {
		boolean oldNextIteration = nextIteration;
		nextIteration = newNextIteration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.SQML_STATIC_VARIABLE_REFERENCE__NEXT_ITERATION, oldNextIteration, nextIteration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISqmlStaticVariable getVariable() {
		if (variable != null && ((EObject)variable).eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (ISqmlStaticVariable)eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.SQML_STATIC_VARIABLE_REFERENCE__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISqmlStaticVariable basicGetVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(ISqmlStaticVariable newVariable) {
		ISqmlStaticVariable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.SQML_STATIC_VARIABLE_REFERENCE__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExpressionsPackage.SQML_STATIC_VARIABLE_REFERENCE__NEXT_ITERATION:
				return isNextIteration();
			case ExpressionsPackage.SQML_STATIC_VARIABLE_REFERENCE__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExpressionsPackage.SQML_STATIC_VARIABLE_REFERENCE__NEXT_ITERATION:
				setNextIteration((Boolean)newValue);
				return;
			case ExpressionsPackage.SQML_STATIC_VARIABLE_REFERENCE__VARIABLE:
				setVariable((ISqmlStaticVariable)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExpressionsPackage.SQML_STATIC_VARIABLE_REFERENCE__NEXT_ITERATION:
				setNextIteration(NEXT_ITERATION_EDEFAULT);
				return;
			case ExpressionsPackage.SQML_STATIC_VARIABLE_REFERENCE__VARIABLE:
				setVariable((ISqmlStaticVariable)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExpressionsPackage.SQML_STATIC_VARIABLE_REFERENCE__NEXT_ITERATION:
				return nextIteration != NEXT_ITERATION_EDEFAULT;
			case ExpressionsPackage.SQML_STATIC_VARIABLE_REFERENCE__VARIABLE:
				return variable != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nextIteration: ");
		result.append(nextIteration);
		result.append(')');
		return result.toString();
	}

} //SqmlStaticVariableReferenceImpl
