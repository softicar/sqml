/**
 */
package com.softicar.sqml.model.selects.impl;

import com.softicar.sqml.model.ISqmlColumn;

import com.softicar.sqml.model.selects.ISqmlVariable;
import com.softicar.sqml.model.selects.SelectsPackage;
import com.softicar.sqml.model.selects.SqmlForeignKeyVariable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sqml Foreign Key Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.selects.impl.SqmlForeignKeyVariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.softicar.sqml.model.selects.impl.SqmlForeignKeyVariableImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link com.softicar.sqml.model.selects.impl.SqmlForeignKeyVariableImpl#getColumn <em>Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqmlForeignKeyVariableImpl extends MinimalEObjectImpl.Container implements SqmlForeignKeyVariable {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected ISqmlVariable variable;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected ISqmlColumn column;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqmlForeignKeyVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SelectsPackage.Literals.SQML_FOREIGN_KEY_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelectsPackage.SQML_FOREIGN_KEY_VARIABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISqmlVariable getVariable() {
		if (variable != null && ((EObject)variable).eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (ISqmlVariable)eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SelectsPackage.SQML_FOREIGN_KEY_VARIABLE__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISqmlVariable basicGetVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariable(ISqmlVariable newVariable) {
		ISqmlVariable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelectsPackage.SQML_FOREIGN_KEY_VARIABLE__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISqmlColumn getColumn() {
		if (column != null && ((EObject)column).eIsProxy()) {
			InternalEObject oldColumn = (InternalEObject)column;
			column = (ISqmlColumn)eResolveProxy(oldColumn);
			if (column != oldColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SelectsPackage.SQML_FOREIGN_KEY_VARIABLE__COLUMN, oldColumn, column));
			}
		}
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISqmlColumn basicGetColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumn(ISqmlColumn newColumn) {
		ISqmlColumn oldColumn = column;
		column = newColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelectsPackage.SQML_FOREIGN_KEY_VARIABLE__COLUMN, oldColumn, column));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SelectsPackage.SQML_FOREIGN_KEY_VARIABLE__NAME:
				return getName();
			case SelectsPackage.SQML_FOREIGN_KEY_VARIABLE__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
			case SelectsPackage.SQML_FOREIGN_KEY_VARIABLE__COLUMN:
				if (resolve) return getColumn();
				return basicGetColumn();
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
			case SelectsPackage.SQML_FOREIGN_KEY_VARIABLE__NAME:
				setName((String)newValue);
				return;
			case SelectsPackage.SQML_FOREIGN_KEY_VARIABLE__VARIABLE:
				setVariable((ISqmlVariable)newValue);
				return;
			case SelectsPackage.SQML_FOREIGN_KEY_VARIABLE__COLUMN:
				setColumn((ISqmlColumn)newValue);
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
			case SelectsPackage.SQML_FOREIGN_KEY_VARIABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SelectsPackage.SQML_FOREIGN_KEY_VARIABLE__VARIABLE:
				setVariable((ISqmlVariable)null);
				return;
			case SelectsPackage.SQML_FOREIGN_KEY_VARIABLE__COLUMN:
				setColumn((ISqmlColumn)null);
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
			case SelectsPackage.SQML_FOREIGN_KEY_VARIABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SelectsPackage.SQML_FOREIGN_KEY_VARIABLE__VARIABLE:
				return variable != null;
			case SelectsPackage.SQML_FOREIGN_KEY_VARIABLE__COLUMN:
				return column != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SqmlForeignKeyVariableImpl
