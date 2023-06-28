/**
 */
package com.softicar.sqml.model.functions.impl;

import com.softicar.sqml.model.functions.FunctionsPackage;
import com.softicar.sqml.model.functions.SqmlSqlKeyword;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sqml Sql Keyword</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.functions.impl.SqmlSqlKeywordImpl#getKeywordText <em>Keyword Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqmlSqlKeywordImpl extends MinimalEObjectImpl.Container implements SqmlSqlKeyword {
	/**
	 * The default value of the '{@link #getKeywordText() <em>Keyword Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywordText()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYWORD_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeywordText() <em>Keyword Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywordText()
	 * @generated
	 * @ordered
	 */
	protected String keywordText = KEYWORD_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqmlSqlKeywordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.SQML_SQL_KEYWORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeywordText() {
		return keywordText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeywordText(String newKeywordText) {
		String oldKeywordText = keywordText;
		keywordText = newKeywordText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SQML_SQL_KEYWORD__KEYWORD_TEXT, oldKeywordText, keywordText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunctionsPackage.SQML_SQL_KEYWORD__KEYWORD_TEXT:
				return getKeywordText();
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
			case FunctionsPackage.SQML_SQL_KEYWORD__KEYWORD_TEXT:
				setKeywordText((String)newValue);
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
			case FunctionsPackage.SQML_SQL_KEYWORD__KEYWORD_TEXT:
				setKeywordText(KEYWORD_TEXT_EDEFAULT);
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
			case FunctionsPackage.SQML_SQL_KEYWORD__KEYWORD_TEXT:
				return KEYWORD_TEXT_EDEFAULT == null ? keywordText != null : !KEYWORD_TEXT_EDEFAULT.equals(keywordText);
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
		result.append(" (keywordText: ");
		result.append(keywordText);
		result.append(')');
		return result.toString();
	}

} //SqmlSqlKeywordImpl
