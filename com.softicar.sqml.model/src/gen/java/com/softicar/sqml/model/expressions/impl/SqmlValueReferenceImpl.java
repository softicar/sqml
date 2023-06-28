/**
 */
package com.softicar.sqml.model.expressions.impl;

import com.softicar.sqml.model.expressions.ExpressionsPackage;
import com.softicar.sqml.model.expressions.SqmlPath;
import com.softicar.sqml.model.expressions.SqmlValueReference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sqml Value Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.expressions.impl.SqmlValueReferenceImpl#isNextIteration <em>Next Iteration</em>}</li>
 *   <li>{@link com.softicar.sqml.model.expressions.impl.SqmlValueReferenceImpl#isDotStar <em>Dot Star</em>}</li>
 *   <li>{@link com.softicar.sqml.model.expressions.impl.SqmlValueReferenceImpl#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqmlValueReferenceImpl extends MinimalEObjectImpl.Container implements SqmlValueReference {
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
	 * The default value of the '{@link #isDotStar() <em>Dot Star</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDotStar()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DOT_STAR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDotStar() <em>Dot Star</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDotStar()
	 * @generated
	 * @ordered
	 */
	protected boolean dotStar = DOT_STAR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected SqmlPath path;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqmlValueReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.SQML_VALUE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNextIteration() {
		return nextIteration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNextIteration(boolean newNextIteration) {
		boolean oldNextIteration = nextIteration;
		nextIteration = newNextIteration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.SQML_VALUE_REFERENCE__NEXT_ITERATION, oldNextIteration, nextIteration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDotStar() {
		return dotStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDotStar(boolean newDotStar) {
		boolean oldDotStar = dotStar;
		dotStar = newDotStar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.SQML_VALUE_REFERENCE__DOT_STAR, oldDotStar, dotStar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SqmlPath getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(SqmlPath newPath, NotificationChain msgs) {
		SqmlPath oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.SQML_VALUE_REFERENCE__PATH, oldPath, newPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(SqmlPath newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.SQML_VALUE_REFERENCE__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.SQML_VALUE_REFERENCE__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.SQML_VALUE_REFERENCE__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionsPackage.SQML_VALUE_REFERENCE__PATH:
				return basicSetPath(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExpressionsPackage.SQML_VALUE_REFERENCE__NEXT_ITERATION:
				return isNextIteration();
			case ExpressionsPackage.SQML_VALUE_REFERENCE__DOT_STAR:
				return isDotStar();
			case ExpressionsPackage.SQML_VALUE_REFERENCE__PATH:
				return getPath();
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
			case ExpressionsPackage.SQML_VALUE_REFERENCE__NEXT_ITERATION:
				setNextIteration((Boolean)newValue);
				return;
			case ExpressionsPackage.SQML_VALUE_REFERENCE__DOT_STAR:
				setDotStar((Boolean)newValue);
				return;
			case ExpressionsPackage.SQML_VALUE_REFERENCE__PATH:
				setPath((SqmlPath)newValue);
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
			case ExpressionsPackage.SQML_VALUE_REFERENCE__NEXT_ITERATION:
				setNextIteration(NEXT_ITERATION_EDEFAULT);
				return;
			case ExpressionsPackage.SQML_VALUE_REFERENCE__DOT_STAR:
				setDotStar(DOT_STAR_EDEFAULT);
				return;
			case ExpressionsPackage.SQML_VALUE_REFERENCE__PATH:
				setPath((SqmlPath)null);
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
			case ExpressionsPackage.SQML_VALUE_REFERENCE__NEXT_ITERATION:
				return nextIteration != NEXT_ITERATION_EDEFAULT;
			case ExpressionsPackage.SQML_VALUE_REFERENCE__DOT_STAR:
				return dotStar != DOT_STAR_EDEFAULT;
			case ExpressionsPackage.SQML_VALUE_REFERENCE__PATH:
				return path != null;
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
		result.append(", dotStar: ");
		result.append(dotStar);
		result.append(')');
		return result.toString();
	}

} //SqmlValueReferenceImpl
