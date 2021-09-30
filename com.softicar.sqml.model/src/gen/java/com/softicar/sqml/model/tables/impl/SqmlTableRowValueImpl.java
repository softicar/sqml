/**
 */
package com.softicar.sqml.model.tables.impl;

import com.softicar.sqml.model.literals.ISqmlLiteral;

import com.softicar.sqml.model.tables.SqmlTableRow;
import com.softicar.sqml.model.tables.SqmlTableRowValue;
import com.softicar.sqml.model.tables.TablesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sqml Table Row Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableRowValueImpl#getRow <em>Row</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableRowValueImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableRowValueImpl#isNull <em>Null</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqmlTableRowValueImpl extends MinimalEObjectImpl.Container implements SqmlTableRowValue {
	/**
	 * The cached value of the '{@link #getLiteral() <em>Literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteral()
	 * @generated
	 * @ordered
	 */
	protected ISqmlLiteral<?> literal;

	/**
	 * The default value of the '{@link #isNull() <em>Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNull()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NULL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNull() <em>Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNull()
	 * @generated
	 * @ordered
	 */
	protected boolean null_ = NULL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqmlTableRowValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablesPackage.Literals.SQML_TABLE_ROW_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlTableRow getRow() {
		if (eContainerFeatureID() != TablesPackage.SQML_TABLE_ROW_VALUE__ROW) return null;
		return (SqmlTableRow)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlTableRow basicGetRow() {
		if (eContainerFeatureID() != TablesPackage.SQML_TABLE_ROW_VALUE__ROW) return null;
		return (SqmlTableRow)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRow(SqmlTableRow newRow, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRow, TablesPackage.SQML_TABLE_ROW_VALUE__ROW, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRow(SqmlTableRow newRow) {
		if (newRow != eInternalContainer() || (eContainerFeatureID() != TablesPackage.SQML_TABLE_ROW_VALUE__ROW && newRow != null)) {
			if (EcoreUtil.isAncestor(this, newRow))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRow != null)
				msgs = ((InternalEObject)newRow).eInverseAdd(this, TablesPackage.SQML_TABLE_ROW__VALUES, SqmlTableRow.class, msgs);
			msgs = basicSetRow(newRow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_ROW_VALUE__ROW, newRow, newRow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISqmlLiteral<?> getLiteral() {
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLiteral(ISqmlLiteral<?> newLiteral, NotificationChain msgs) {
		ISqmlLiteral<?> oldLiteral = literal;
		literal = newLiteral;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_ROW_VALUE__LITERAL, oldLiteral, newLiteral);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiteral(ISqmlLiteral<?> newLiteral) {
		if (newLiteral != literal) {
			NotificationChain msgs = null;
			if (literal != null)
				msgs = ((InternalEObject)literal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablesPackage.SQML_TABLE_ROW_VALUE__LITERAL, null, msgs);
			if (newLiteral != null)
				msgs = ((InternalEObject)newLiteral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablesPackage.SQML_TABLE_ROW_VALUE__LITERAL, null, msgs);
			msgs = basicSetLiteral(newLiteral, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_ROW_VALUE__LITERAL, newLiteral, newLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNull() {
		return null_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNull(boolean newNull) {
		boolean oldNull = null_;
		null_ = newNull;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_ROW_VALUE__NULL, oldNull, null_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablesPackage.SQML_TABLE_ROW_VALUE__ROW:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRow((SqmlTableRow)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablesPackage.SQML_TABLE_ROW_VALUE__ROW:
				return basicSetRow(null, msgs);
			case TablesPackage.SQML_TABLE_ROW_VALUE__LITERAL:
				return basicSetLiteral(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TablesPackage.SQML_TABLE_ROW_VALUE__ROW:
				return eInternalContainer().eInverseRemove(this, TablesPackage.SQML_TABLE_ROW__VALUES, SqmlTableRow.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TablesPackage.SQML_TABLE_ROW_VALUE__ROW:
				if (resolve) return getRow();
				return basicGetRow();
			case TablesPackage.SQML_TABLE_ROW_VALUE__LITERAL:
				return getLiteral();
			case TablesPackage.SQML_TABLE_ROW_VALUE__NULL:
				return isNull();
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
			case TablesPackage.SQML_TABLE_ROW_VALUE__ROW:
				setRow((SqmlTableRow)newValue);
				return;
			case TablesPackage.SQML_TABLE_ROW_VALUE__LITERAL:
				setLiteral((ISqmlLiteral<?>)newValue);
				return;
			case TablesPackage.SQML_TABLE_ROW_VALUE__NULL:
				setNull((Boolean)newValue);
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
			case TablesPackage.SQML_TABLE_ROW_VALUE__ROW:
				setRow((SqmlTableRow)null);
				return;
			case TablesPackage.SQML_TABLE_ROW_VALUE__LITERAL:
				setLiteral((ISqmlLiteral<?>)null);
				return;
			case TablesPackage.SQML_TABLE_ROW_VALUE__NULL:
				setNull(NULL_EDEFAULT);
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
			case TablesPackage.SQML_TABLE_ROW_VALUE__ROW:
				return basicGetRow() != null;
			case TablesPackage.SQML_TABLE_ROW_VALUE__LITERAL:
				return literal != null;
			case TablesPackage.SQML_TABLE_ROW_VALUE__NULL:
				return null_ != NULL_EDEFAULT;
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
		result.append(" (null: ");
		result.append(null_);
		result.append(')');
		return result.toString();
	}

} //SqmlTableRowValueImpl
