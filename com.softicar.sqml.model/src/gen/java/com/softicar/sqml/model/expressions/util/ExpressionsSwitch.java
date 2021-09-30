/**
 */
package com.softicar.sqml.model.expressions.util;

import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.ISqmlValue;

import com.softicar.sqml.model.expressions.*;

import com.softicar.sqml.model.functions.ISqmlFunctionCall;

import com.softicar.sqml.model.validation.ISqmlValidatable;

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
 * @see com.softicar.sqml.model.expressions.ExpressionsPackage
 * @generated
 */
public class ExpressionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExpressionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionsSwitch() {
		if (modelPackage == null) {
			modelPackage = ExpressionsPackage.eINSTANCE;
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
			case ExpressionsPackage.ABSTRACT_SQML_BINARY_OPERATION: {
				AbstractSqmlBinaryOperation abstractSqmlBinaryOperation = (AbstractSqmlBinaryOperation)theEObject;
				T result = caseAbstractSqmlBinaryOperation(abstractSqmlBinaryOperation);
				if (result == null) result = caseISqmlBinaryOperation(abstractSqmlBinaryOperation);
				if (result == null) result = caseISqmlFunctionCall(abstractSqmlBinaryOperation);
				if (result == null) result = caseISqmlExpression(abstractSqmlBinaryOperation);
				if (result == null) result = caseISqmlValue(abstractSqmlBinaryOperation);
				if (result == null) result = caseISqmlModelElement(abstractSqmlBinaryOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.SQML_NEGATION: {
				SqmlNegation sqmlNegation = (SqmlNegation)theEObject;
				T result = caseSqmlNegation(sqmlNegation);
				if (result == null) result = caseISqmlNegation(sqmlNegation);
				if (result == null) result = caseISqmlUnaryOperation(sqmlNegation);
				if (result == null) result = caseISqmlExpression(sqmlNegation);
				if (result == null) result = caseISqmlValue(sqmlNegation);
				if (result == null) result = caseISqmlModelElement(sqmlNegation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.SQML_ADDITION: {
				SqmlAddition sqmlAddition = (SqmlAddition)theEObject;
				T result = caseSqmlAddition(sqmlAddition);
				if (result == null) result = caseAbstractSqmlBinaryOperation(sqmlAddition);
				if (result == null) result = caseISqmlAddition(sqmlAddition);
				if (result == null) result = caseISqmlBinaryOperation(sqmlAddition);
				if (result == null) result = caseISqmlFunctionCall(sqmlAddition);
				if (result == null) result = caseISqmlExpression(sqmlAddition);
				if (result == null) result = caseISqmlValue(sqmlAddition);
				if (result == null) result = caseISqmlModelElement(sqmlAddition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.SQML_MULTIPLICATION: {
				SqmlMultiplication sqmlMultiplication = (SqmlMultiplication)theEObject;
				T result = caseSqmlMultiplication(sqmlMultiplication);
				if (result == null) result = caseAbstractSqmlBinaryOperation(sqmlMultiplication);
				if (result == null) result = caseISqmlMultiplication(sqmlMultiplication);
				if (result == null) result = caseISqmlBinaryOperation(sqmlMultiplication);
				if (result == null) result = caseISqmlFunctionCall(sqmlMultiplication);
				if (result == null) result = caseISqmlExpression(sqmlMultiplication);
				if (result == null) result = caseISqmlValue(sqmlMultiplication);
				if (result == null) result = caseISqmlModelElement(sqmlMultiplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.SQML_STATIC_VARIABLE_REFERENCE: {
				SqmlStaticVariableReference sqmlStaticVariableReference = (SqmlStaticVariableReference)theEObject;
				T result = caseSqmlStaticVariableReference(sqmlStaticVariableReference);
				if (result == null) result = caseISqmlStaticVariableReference(sqmlStaticVariableReference);
				if (result == null) result = caseISqmlExpression(sqmlStaticVariableReference);
				if (result == null) result = caseISqmlStaticExpression(sqmlStaticVariableReference);
				if (result == null) result = caseISqmlValue(sqmlStaticVariableReference);
				if (result == null) result = caseISqmlModelElement(sqmlStaticVariableReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.SQML_PATH: {
				SqmlPath sqmlPath = (SqmlPath)theEObject;
				T result = caseSqmlPath(sqmlPath);
				if (result == null) result = caseISqmlPath(sqmlPath);
				if (result == null) result = caseISqmlValidatable(sqmlPath);
				if (result == null) result = caseISqmlModelElement(sqmlPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.SQML_GROUP_CONCAT: {
				SqmlGroupConcat sqmlGroupConcat = (SqmlGroupConcat)theEObject;
				T result = caseSqmlGroupConcat(sqmlGroupConcat);
				if (result == null) result = caseISqmlGroupConcat(sqmlGroupConcat);
				if (result == null) result = caseISqmlExpression(sqmlGroupConcat);
				if (result == null) result = caseISqmlValue(sqmlGroupConcat);
				if (result == null) result = caseISqmlModelElement(sqmlGroupConcat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.SQML_CASE: {
				SqmlCase sqmlCase = (SqmlCase)theEObject;
				T result = caseSqmlCase(sqmlCase);
				if (result == null) result = caseISqmlCase(sqmlCase);
				if (result == null) result = caseISqmlExpression(sqmlCase);
				if (result == null) result = caseISqmlValue(sqmlCase);
				if (result == null) result = caseISqmlModelElement(sqmlCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.SQML_CASE_WHEN: {
				SqmlCaseWhen sqmlCaseWhen = (SqmlCaseWhen)theEObject;
				T result = caseSqmlCaseWhen(sqmlCaseWhen);
				if (result == null) result = caseISqmlCaseWhen(sqmlCaseWhen);
				if (result == null) result = caseISqmlModelElement(sqmlCaseWhen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.SQML_IF: {
				SqmlIf sqmlIf = (SqmlIf)theEObject;
				T result = caseSqmlIf(sqmlIf);
				if (result == null) result = caseISqmlIf(sqmlIf);
				if (result == null) result = caseISqmlExpression(sqmlIf);
				if (result == null) result = caseISqmlValue(sqmlIf);
				if (result == null) result = caseISqmlModelElement(sqmlIf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.SQML_IF_NULL: {
				SqmlIfNull sqmlIfNull = (SqmlIfNull)theEObject;
				T result = caseSqmlIfNull(sqmlIfNull);
				if (result == null) result = caseISqmlIfNull(sqmlIfNull);
				if (result == null) result = caseISqmlExpression(sqmlIfNull);
				if (result == null) result = caseISqmlValue(sqmlIfNull);
				if (result == null) result = caseISqmlModelElement(sqmlIfNull);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.SQML_ROW_CONSTRUCTOR: {
				SqmlRowConstructor sqmlRowConstructor = (SqmlRowConstructor)theEObject;
				T result = caseSqmlRowConstructor(sqmlRowConstructor);
				if (result == null) result = caseISqmlRowConstructor(sqmlRowConstructor);
				if (result == null) result = caseISqmlExpression(sqmlRowConstructor);
				if (result == null) result = caseISqmlValue(sqmlRowConstructor);
				if (result == null) result = caseISqmlModelElement(sqmlRowConstructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.SQML_STATIC_AND: {
				SqmlStaticAnd sqmlStaticAnd = (SqmlStaticAnd)theEObject;
				T result = caseSqmlStaticAnd(sqmlStaticAnd);
				if (result == null) result = caseISqmlStaticAnd(sqmlStaticAnd);
				if (result == null) result = caseISqmlStaticExpression(sqmlStaticAnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.SQML_STATIC_IF: {
				SqmlStaticIf sqmlStaticIf = (SqmlStaticIf)theEObject;
				T result = caseSqmlStaticIf(sqmlStaticIf);
				if (result == null) result = caseISqmlStaticIf(sqmlStaticIf);
				if (result == null) result = caseISqmlExpression(sqmlStaticIf);
				if (result == null) result = caseISqmlValue(sqmlStaticIf);
				if (result == null) result = caseISqmlModelElement(sqmlStaticIf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.SQML_STATIC_IS_EMPTY: {
				SqmlStaticIsEmpty sqmlStaticIsEmpty = (SqmlStaticIsEmpty)theEObject;
				T result = caseSqmlStaticIsEmpty(sqmlStaticIsEmpty);
				if (result == null) result = caseISqmlStaticIsEmpty(sqmlStaticIsEmpty);
				if (result == null) result = caseISqmlStaticParameterTest(sqmlStaticIsEmpty);
				if (result == null) result = caseISqmlStaticExpression(sqmlStaticIsEmpty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.SQML_STATIC_IS_NULL: {
				SqmlStaticIsNull sqmlStaticIsNull = (SqmlStaticIsNull)theEObject;
				T result = caseSqmlStaticIsNull(sqmlStaticIsNull);
				if (result == null) result = caseISqmlStaticIsNull(sqmlStaticIsNull);
				if (result == null) result = caseISqmlStaticParameterTest(sqmlStaticIsNull);
				if (result == null) result = caseISqmlStaticExpression(sqmlStaticIsNull);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.SQML_STATIC_IS_TRUE: {
				SqmlStaticIsTrue sqmlStaticIsTrue = (SqmlStaticIsTrue)theEObject;
				T result = caseSqmlStaticIsTrue(sqmlStaticIsTrue);
				if (result == null) result = caseISqmlStaticIsTrue(sqmlStaticIsTrue);
				if (result == null) result = caseISqmlStaticParameterTest(sqmlStaticIsTrue);
				if (result == null) result = caseISqmlStaticExpression(sqmlStaticIsTrue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.SQML_STATIC_OR: {
				SqmlStaticOr sqmlStaticOr = (SqmlStaticOr)theEObject;
				T result = caseSqmlStaticOr(sqmlStaticOr);
				if (result == null) result = caseISqmlStaticOr(sqmlStaticOr);
				if (result == null) result = caseISqmlStaticExpression(sqmlStaticOr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.SQML_STATIC_PARENTHESES: {
				SqmlStaticParentheses sqmlStaticParentheses = (SqmlStaticParentheses)theEObject;
				T result = caseSqmlStaticParentheses(sqmlStaticParentheses);
				if (result == null) result = caseISqmlStaticParentheses(sqmlStaticParentheses);
				if (result == null) result = caseISqmlStaticExpression(sqmlStaticParentheses);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.SQML_SUB_SELECT: {
				SqmlSubSelect sqmlSubSelect = (SqmlSubSelect)theEObject;
				T result = caseSqmlSubSelect(sqmlSubSelect);
				if (result == null) result = caseISqmlSubSelect(sqmlSubSelect);
				if (result == null) result = caseISqmlExpression(sqmlSubSelect);
				if (result == null) result = caseISqmlValue(sqmlSubSelect);
				if (result == null) result = caseISqmlModelElement(sqmlSubSelect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.SQML_VALUE_REFERENCE: {
				SqmlValueReference sqmlValueReference = (SqmlValueReference)theEObject;
				T result = caseSqmlValueReference(sqmlValueReference);
				if (result == null) result = caseISqmlValueReference(sqmlValueReference);
				if (result == null) result = caseISqmlValidatable(sqmlValueReference);
				if (result == null) result = caseISqmlExpression(sqmlValueReference);
				if (result == null) result = caseISqmlValue(sqmlValueReference);
				if (result == null) result = caseISqmlModelElement(sqmlValueReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Sqml Binary Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Sqml Binary Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSqmlBinaryOperation(AbstractSqmlBinaryOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Negation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Negation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlNegation(SqmlNegation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Addition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Addition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlAddition(SqmlAddition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Multiplication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Multiplication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlMultiplication(SqmlMultiplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Static Variable Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Static Variable Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlStaticVariableReference(SqmlStaticVariableReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlPath(SqmlPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Group Concat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Group Concat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlGroupConcat(SqmlGroupConcat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlCase(SqmlCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Case When</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Case When</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlCaseWhen(SqmlCaseWhen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlIf(SqmlIf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml If Null</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml If Null</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlIfNull(SqmlIfNull object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Row Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Row Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlRowConstructor(SqmlRowConstructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Static And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Static And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlStaticAnd(SqmlStaticAnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Static If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Static If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlStaticIf(SqmlStaticIf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Static Is Empty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Static Is Empty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlStaticIsEmpty(SqmlStaticIsEmpty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Static Is Null</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Static Is Null</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlStaticIsNull(SqmlStaticIsNull object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Static Is True</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Static Is True</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlStaticIsTrue(SqmlStaticIsTrue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Static Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Static Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlStaticOr(SqmlStaticOr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Static Parentheses</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Static Parentheses</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlStaticParentheses(SqmlStaticParentheses object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Sub Select</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Sub Select</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlSubSelect(SqmlSubSelect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Value Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Value Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlValueReference(SqmlValueReference object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Unary Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Unary Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlUnaryOperation(ISqmlUnaryOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Negation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Negation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlNegation(ISqmlNegation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Addition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Addition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlAddition(ISqmlAddition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Multiplication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Multiplication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlMultiplication(ISqmlMultiplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Static Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Static Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlStaticExpression(ISqmlStaticExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Static Variable Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Static Variable Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlStaticVariableReference(ISqmlStaticVariableReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Validatable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Validatable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlValidatable(ISqmlValidatable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlPath(ISqmlPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Group Concat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Group Concat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlGroupConcat(ISqmlGroupConcat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlCase(ISqmlCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Case When</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Case When</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlCaseWhen(ISqmlCaseWhen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlIf(ISqmlIf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml If Null</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml If Null</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlIfNull(ISqmlIfNull object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Row Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Row Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlRowConstructor(ISqmlRowConstructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Static And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Static And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlStaticAnd(ISqmlStaticAnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Static If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Static If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlStaticIf(ISqmlStaticIf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Static Parameter Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Static Parameter Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlStaticParameterTest(ISqmlStaticParameterTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Static Is Empty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Static Is Empty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlStaticIsEmpty(ISqmlStaticIsEmpty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Static Is Null</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Static Is Null</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlStaticIsNull(ISqmlStaticIsNull object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Static Is True</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Static Is True</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlStaticIsTrue(ISqmlStaticIsTrue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Static Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Static Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlStaticOr(ISqmlStaticOr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Static Parentheses</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Static Parentheses</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlStaticParentheses(ISqmlStaticParentheses object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Sub Select</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Sub Select</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlSubSelect(ISqmlSubSelect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Value Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Value Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlValueReference(ISqmlValueReference object) {
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

} //ExpressionsSwitch
