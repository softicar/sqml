/**
 */
package com.softicar.sqml.model.functions.impl;

import com.softicar.sqml.model.functions.FunctionsPackage;
import com.softicar.sqml.model.functions.SqmlSqlSymbol;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sqml Sql Symbol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.functions.impl.SqmlSqlSymbolImpl#getSymbolText <em>Symbol Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqmlSqlSymbolImpl extends MinimalEObjectImpl.Container implements SqmlSqlSymbol {
	/**
	 * The default value of the '{@link #getSymbolText() <em>Symbol Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolText()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbolText() <em>Symbol Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolText()
	 * @generated
	 * @ordered
	 */
	protected String symbolText = SYMBOL_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqmlSqlSymbolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.SQML_SQL_SYMBOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSymbolText() {
		return symbolText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymbolText(String newSymbolText) {
		String oldSymbolText = symbolText;
		symbolText = newSymbolText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SQML_SQL_SYMBOL__SYMBOL_TEXT, oldSymbolText, symbolText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunctionsPackage.SQML_SQL_SYMBOL__SYMBOL_TEXT:
				return getSymbolText();
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
			case FunctionsPackage.SQML_SQL_SYMBOL__SYMBOL_TEXT:
				setSymbolText((String)newValue);
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
			case FunctionsPackage.SQML_SQL_SYMBOL__SYMBOL_TEXT:
				setSymbolText(SYMBOL_TEXT_EDEFAULT);
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
			case FunctionsPackage.SQML_SQL_SYMBOL__SYMBOL_TEXT:
				return SYMBOL_TEXT_EDEFAULT == null ? symbolText != null : !SYMBOL_TEXT_EDEFAULT.equals(symbolText);
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
		result.append(" (symbolText: ");
		result.append(symbolText);
		result.append(')');
		return result.toString();
	}

} //SqmlSqlSymbolImpl
