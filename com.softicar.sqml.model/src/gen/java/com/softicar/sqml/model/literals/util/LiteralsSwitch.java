/**
 */
package com.softicar.sqml.model.literals.util;

import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.ISqmlValue;

import com.softicar.sqml.model.expressions.ISqmlExpression;

import com.softicar.sqml.model.literals.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.softicar.sqml.model.literals.LiteralsPackage
 * @generated
 */
public class LiteralsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LiteralsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralsSwitch() {
		if (modelPackage == null) {
			modelPackage = LiteralsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LiteralsPackage.SQML_BOOLEAN_LITERAL: {
				SqmlBooleanLiteral sqmlBooleanLiteral = (SqmlBooleanLiteral)theEObject;
				T result = caseSqmlBooleanLiteral(sqmlBooleanLiteral);
				if (result == null) result = caseISqmlBooleanLiteral(sqmlBooleanLiteral);
				if (result == null) result = caseISqmlLiteral(sqmlBooleanLiteral);
				if (result == null) result = caseISqmlExpression(sqmlBooleanLiteral);
				if (result == null) result = caseISqmlValue(sqmlBooleanLiteral);
				if (result == null) result = caseISqmlModelElement(sqmlBooleanLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.SQML_INTEGER_LITERAL: {
				SqmlIntegerLiteral sqmlIntegerLiteral = (SqmlIntegerLiteral)theEObject;
				T result = caseSqmlIntegerLiteral(sqmlIntegerLiteral);
				if (result == null) result = caseISqmlIntegerLiteral(sqmlIntegerLiteral);
				if (result == null) result = caseISqmlLiteral(sqmlIntegerLiteral);
				if (result == null) result = caseISqmlExpression(sqmlIntegerLiteral);
				if (result == null) result = caseISqmlValue(sqmlIntegerLiteral);
				if (result == null) result = caseISqmlModelElement(sqmlIntegerLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.SQML_LONG_LITERAL: {
				SqmlLongLiteral sqmlLongLiteral = (SqmlLongLiteral)theEObject;
				T result = caseSqmlLongLiteral(sqmlLongLiteral);
				if (result == null) result = caseISqmlLongLiteral(sqmlLongLiteral);
				if (result == null) result = caseISqmlLiteral(sqmlLongLiteral);
				if (result == null) result = caseISqmlExpression(sqmlLongLiteral);
				if (result == null) result = caseISqmlValue(sqmlLongLiteral);
				if (result == null) result = caseISqmlModelElement(sqmlLongLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.SQML_FLOAT_LITERAL: {
				SqmlFloatLiteral sqmlFloatLiteral = (SqmlFloatLiteral)theEObject;
				T result = caseSqmlFloatLiteral(sqmlFloatLiteral);
				if (result == null) result = caseISqmlFloatLiteral(sqmlFloatLiteral);
				if (result == null) result = caseISqmlLiteral(sqmlFloatLiteral);
				if (result == null) result = caseISqmlExpression(sqmlFloatLiteral);
				if (result == null) result = caseISqmlValue(sqmlFloatLiteral);
				if (result == null) result = caseISqmlModelElement(sqmlFloatLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.SQML_DOUBLE_LITERAL: {
				SqmlDoubleLiteral sqmlDoubleLiteral = (SqmlDoubleLiteral)theEObject;
				T result = caseSqmlDoubleLiteral(sqmlDoubleLiteral);
				if (result == null) result = caseISqmlDoubleLiteral(sqmlDoubleLiteral);
				if (result == null) result = caseISqmlLiteral(sqmlDoubleLiteral);
				if (result == null) result = caseISqmlExpression(sqmlDoubleLiteral);
				if (result == null) result = caseISqmlValue(sqmlDoubleLiteral);
				if (result == null) result = caseISqmlModelElement(sqmlDoubleLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.SQML_DECIMAL_LITERAL: {
				SqmlDecimalLiteral sqmlDecimalLiteral = (SqmlDecimalLiteral)theEObject;
				T result = caseSqmlDecimalLiteral(sqmlDecimalLiteral);
				if (result == null) result = caseISqmlDecimalLiteral(sqmlDecimalLiteral);
				if (result == null) result = caseISqmlLiteral(sqmlDecimalLiteral);
				if (result == null) result = caseISqmlExpression(sqmlDecimalLiteral);
				if (result == null) result = caseISqmlValue(sqmlDecimalLiteral);
				if (result == null) result = caseISqmlModelElement(sqmlDecimalLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.SQML_STRING_LITERAL: {
				SqmlStringLiteral sqmlStringLiteral = (SqmlStringLiteral)theEObject;
				T result = caseSqmlStringLiteral(sqmlStringLiteral);
				if (result == null) result = caseISqmlStringLiteral(sqmlStringLiteral);
				if (result == null) result = caseISqmlLiteral(sqmlStringLiteral);
				if (result == null) result = caseISqmlExpression(sqmlStringLiteral);
				if (result == null) result = caseISqmlValue(sqmlStringLiteral);
				if (result == null) result = caseISqmlModelElement(sqmlStringLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Boolean Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlBooleanLiteral(SqmlBooleanLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Integer Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlIntegerLiteral(SqmlIntegerLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Long Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Long Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlLongLiteral(SqmlLongLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Float Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Float Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlFloatLiteral(SqmlFloatLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Double Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Double Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlDoubleLiteral(SqmlDoubleLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Decimal Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Decimal Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlDecimalLiteral(SqmlDecimalLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlStringLiteral(SqmlStringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlValue(ISqmlValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlModelElement(ISqmlModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlExpression(ISqmlExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlLiteral(ISqmlLiteral<?> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Boolean Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlBooleanLiteral(ISqmlBooleanLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Integer Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlIntegerLiteral(ISqmlIntegerLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Long Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Long Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlLongLiteral(ISqmlLongLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Float Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Float Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlFloatLiteral(ISqmlFloatLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Double Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Double Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlDoubleLiteral(ISqmlDoubleLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Decimal Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Decimal Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlDecimalLiteral(ISqmlDecimalLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlStringLiteral(ISqmlStringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LiteralsSwitch
