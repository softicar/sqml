/**
 */
package com.softicar.sqml.model.conditions.util;

import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.ISqmlValue;

import com.softicar.sqml.model.conditions.*;

import com.softicar.sqml.model.expressions.ISqmlBinaryOperation;
import com.softicar.sqml.model.expressions.ISqmlExpression;

import com.softicar.sqml.model.functions.ISqmlFunctionCall;

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
 * @see com.softicar.sqml.model.conditions.ConditionsPackage
 * @generated
 */
public class ConditionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConditionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionsSwitch() {
		if (modelPackage == null) {
			modelPackage = ConditionsPackage.eINSTANCE;
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
			case ConditionsPackage.SQML_AND: {
				SqmlAnd sqmlAnd = (SqmlAnd)theEObject;
				T result = caseSqmlAnd(sqmlAnd);
				if (result == null) result = caseISqmlAnd(sqmlAnd);
				if (result == null) result = caseISqmlCondition(sqmlAnd);
				if (result == null) result = caseISqmlExpression(sqmlAnd);
				if (result == null) result = caseISqmlValue(sqmlAnd);
				if (result == null) result = caseISqmlModelElement(sqmlAnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConditionsPackage.SQML_BETWEEN: {
				SqmlBetween sqmlBetween = (SqmlBetween)theEObject;
				T result = caseSqmlBetween(sqmlBetween);
				if (result == null) result = caseISqmlBetween(sqmlBetween);
				if (result == null) result = caseISqmlCondition(sqmlBetween);
				if (result == null) result = caseISqmlExpression(sqmlBetween);
				if (result == null) result = caseISqmlValue(sqmlBetween);
				if (result == null) result = caseISqmlModelElement(sqmlBetween);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConditionsPackage.SQML_COMPARISON: {
				SqmlComparison sqmlComparison = (SqmlComparison)theEObject;
				T result = caseSqmlComparison(sqmlComparison);
				if (result == null) result = caseISqmlComparison(sqmlComparison);
				if (result == null) result = caseISqmlBinaryOperation(sqmlComparison);
				if (result == null) result = caseISqmlCondition(sqmlComparison);
				if (result == null) result = caseISqmlFunctionCall(sqmlComparison);
				if (result == null) result = caseISqmlExpression(sqmlComparison);
				if (result == null) result = caseISqmlValue(sqmlComparison);
				if (result == null) result = caseISqmlModelElement(sqmlComparison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConditionsPackage.SQML_EXISTS: {
				SqmlExists sqmlExists = (SqmlExists)theEObject;
				T result = caseSqmlExists(sqmlExists);
				if (result == null) result = caseISqmlExists(sqmlExists);
				if (result == null) result = caseISqmlCondition(sqmlExists);
				if (result == null) result = caseISqmlExpression(sqmlExists);
				if (result == null) result = caseISqmlValue(sqmlExists);
				if (result == null) result = caseISqmlModelElement(sqmlExists);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConditionsPackage.SQML_IN: {
				SqmlIn sqmlIn = (SqmlIn)theEObject;
				T result = caseSqmlIn(sqmlIn);
				if (result == null) result = caseISqmlIn(sqmlIn);
				if (result == null) result = caseISqmlCondition(sqmlIn);
				if (result == null) result = caseISqmlExpression(sqmlIn);
				if (result == null) result = caseISqmlValue(sqmlIn);
				if (result == null) result = caseISqmlModelElement(sqmlIn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConditionsPackage.SQML_IS_NULL: {
				SqmlIsNull sqmlIsNull = (SqmlIsNull)theEObject;
				T result = caseSqmlIsNull(sqmlIsNull);
				if (result == null) result = caseISqmlIsNull(sqmlIsNull);
				if (result == null) result = caseISqmlCondition(sqmlIsNull);
				if (result == null) result = caseISqmlExpression(sqmlIsNull);
				if (result == null) result = caseISqmlValue(sqmlIsNull);
				if (result == null) result = caseISqmlModelElement(sqmlIsNull);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConditionsPackage.SQML_LIKE: {
				SqmlLike sqmlLike = (SqmlLike)theEObject;
				T result = caseSqmlLike(sqmlLike);
				if (result == null) result = caseISqmlLike(sqmlLike);
				if (result == null) result = caseISqmlCondition(sqmlLike);
				if (result == null) result = caseISqmlExpression(sqmlLike);
				if (result == null) result = caseISqmlValue(sqmlLike);
				if (result == null) result = caseISqmlModelElement(sqmlLike);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConditionsPackage.SQML_NOT: {
				SqmlNot sqmlNot = (SqmlNot)theEObject;
				T result = caseSqmlNot(sqmlNot);
				if (result == null) result = caseISqmlNot(sqmlNot);
				if (result == null) result = caseISqmlCondition(sqmlNot);
				if (result == null) result = caseISqmlExpression(sqmlNot);
				if (result == null) result = caseISqmlValue(sqmlNot);
				if (result == null) result = caseISqmlModelElement(sqmlNot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConditionsPackage.SQML_OR: {
				SqmlOr sqmlOr = (SqmlOr)theEObject;
				T result = caseSqmlOr(sqmlOr);
				if (result == null) result = caseISqmlOr(sqmlOr);
				if (result == null) result = caseISqmlCondition(sqmlOr);
				if (result == null) result = caseISqmlExpression(sqmlOr);
				if (result == null) result = caseISqmlValue(sqmlOr);
				if (result == null) result = caseISqmlModelElement(sqmlOr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConditionsPackage.SQML_REGEXP: {
				SqmlRegexp sqmlRegexp = (SqmlRegexp)theEObject;
				T result = caseSqmlRegexp(sqmlRegexp);
				if (result == null) result = caseISqmlRegexp(sqmlRegexp);
				if (result == null) result = caseISqmlCondition(sqmlRegexp);
				if (result == null) result = caseISqmlExpression(sqmlRegexp);
				if (result == null) result = caseISqmlValue(sqmlRegexp);
				if (result == null) result = caseISqmlModelElement(sqmlRegexp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlAnd(SqmlAnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Between</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Between</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlBetween(SqmlBetween object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlComparison(SqmlComparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Exists</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Exists</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlExists(SqmlExists object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlIn(SqmlIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Is Null</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Is Null</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlIsNull(SqmlIsNull object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Like</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Like</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlLike(SqmlLike object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlNot(SqmlNot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlOr(SqmlOr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Regexp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Regexp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlRegexp(SqmlRegexp object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlCondition(ISqmlCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlAnd(ISqmlAnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Between</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Between</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlBetween(ISqmlBetween object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Function Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlFunctionCall(ISqmlFunctionCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Binary Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Binary Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlBinaryOperation(ISqmlBinaryOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlComparison(ISqmlComparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Exists</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Exists</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlExists(ISqmlExists object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlIn(ISqmlIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Is Null</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Is Null</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlIsNull(ISqmlIsNull object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Like</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Like</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlLike(ISqmlLike object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlNot(ISqmlNot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlOr(ISqmlOr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Regexp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Regexp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlRegexp(ISqmlRegexp object) {
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

} //ConditionsSwitch
