/**
 */
package com.softicar.sqml.model.functions.util;

import com.softicar.sqml.model.ISqmlGeneratable;
import com.softicar.sqml.model.ISqmlGlobalObject;
import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.ISqmlStaticVariable;
import com.softicar.sqml.model.ISqmlValue;

import com.softicar.sqml.model.expressions.ISqmlExpression;

import com.softicar.sqml.model.files.ISqmlFileElement;
import com.softicar.sqml.model.files.SqmlFileElement;

import com.softicar.sqml.model.functions.*;

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
 * @see com.softicar.sqml.model.functions.FunctionsPackage
 * @generated
 */
public class FunctionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FunctionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionsSwitch() {
		if (modelPackage == null) {
			modelPackage = FunctionsPackage.eINSTANCE;
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
			case FunctionsPackage.SQML_FUNCTION: {
				SqmlFunction sqmlFunction = (SqmlFunction)theEObject;
				T result = caseSqmlFunction(sqmlFunction);
				if (result == null) result = caseSqmlFileElement(sqmlFunction);
				if (result == null) result = caseISqmlFunction(sqmlFunction);
				if (result == null) result = caseISqmlFileElement(sqmlFunction);
				if (result == null) result = caseISqmlGeneratable(sqmlFunction);
				if (result == null) result = caseISqmlModelElement(sqmlFunction);
				if (result == null) result = caseISqmlValidatable(sqmlFunction);
				if (result == null) result = caseISqmlGlobalObject(sqmlFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.SQML_FUNCTION_CALL: {
				SqmlFunctionCall sqmlFunctionCall = (SqmlFunctionCall)theEObject;
				T result = caseSqmlFunctionCall(sqmlFunctionCall);
				if (result == null) result = caseISqmlFunctionCall(sqmlFunctionCall);
				if (result == null) result = caseISqmlExpression(sqmlFunctionCall);
				if (result == null) result = caseISqmlValue(sqmlFunctionCall);
				if (result == null) result = caseISqmlModelElement(sqmlFunctionCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.SQML_FUNCTION_PARAMETER: {
				SqmlFunctionParameter sqmlFunctionParameter = (SqmlFunctionParameter)theEObject;
				T result = caseSqmlFunctionParameter(sqmlFunctionParameter);
				if (result == null) result = caseISqmlFunctionParameter(sqmlFunctionParameter);
				if (result == null) result = caseISqmlValidatable(sqmlFunctionParameter);
				if (result == null) result = caseISqmlStaticVariable(sqmlFunctionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.SQML_SQL: {
				SqmlSql sqmlSql = (SqmlSql)theEObject;
				T result = caseSqmlSql(sqmlSql);
				if (result == null) result = caseISqmlSql(sqmlSql);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.SQML_SQL_ID: {
				SqmlSqlId sqmlSqlId = (SqmlSqlId)theEObject;
				T result = caseSqmlSqlId(sqmlSqlId);
				if (result == null) result = caseISqmlSqlId(sqmlSqlId);
				if (result == null) result = caseISqmlModelElement(sqmlSqlId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.SQML_SQL_KEYWORD: {
				SqmlSqlKeyword sqmlSqlKeyword = (SqmlSqlKeyword)theEObject;
				T result = caseSqmlSqlKeyword(sqmlSqlKeyword);
				if (result == null) result = caseISqmlSqlKeyword(sqmlSqlKeyword);
				if (result == null) result = caseISqmlModelElement(sqmlSqlKeyword);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.SQML_SQL_NUMBER_LITERAL: {
				SqmlSqlNumberLiteral sqmlSqlNumberLiteral = (SqmlSqlNumberLiteral)theEObject;
				T result = caseSqmlSqlNumberLiteral(sqmlSqlNumberLiteral);
				if (result == null) result = caseISqmlSqlNumberLiteral(sqmlSqlNumberLiteral);
				if (result == null) result = caseISqmlModelElement(sqmlSqlNumberLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.SQML_SQL_STRING_LITERAL: {
				SqmlSqlStringLiteral sqmlSqlStringLiteral = (SqmlSqlStringLiteral)theEObject;
				T result = caseSqmlSqlStringLiteral(sqmlSqlStringLiteral);
				if (result == null) result = caseISqmlSqlStringLiteral(sqmlSqlStringLiteral);
				if (result == null) result = caseISqmlModelElement(sqmlSqlStringLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionsPackage.SQML_SQL_SYMBOL: {
				SqmlSqlSymbol sqmlSqlSymbol = (SqmlSqlSymbol)theEObject;
				T result = caseSqmlSqlSymbol(sqmlSqlSymbol);
				if (result == null) result = caseISqmlSqlSymbol(sqmlSqlSymbol);
				if (result == null) result = caseISqmlModelElement(sqmlSqlSymbol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlFunction(SqmlFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Function Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlFunctionCall(SqmlFunctionCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Function Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Function Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlFunctionParameter(SqmlFunctionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Sql</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Sql</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlSql(SqmlSql object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Sql Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Sql Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlSqlId(SqmlSqlId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Sql Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Sql Keyword</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlSqlKeyword(SqmlSqlKeyword object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Sql Number Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Sql Number Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlSqlNumberLiteral(SqmlSqlNumberLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Sql String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Sql String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlSqlStringLiteral(SqmlSqlStringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Sql Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Sql Symbol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlSqlSymbol(SqmlSqlSymbol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Global Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Global Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlGlobalObject(ISqmlGlobalObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml File Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml File Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlFileElement(ISqmlFileElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml File Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml File Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlFileElement(SqmlFileElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Generatable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Generatable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlGeneratable(ISqmlGeneratable object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlFunction(ISqmlFunction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Static Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Static Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlStaticVariable(ISqmlStaticVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Function Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Function Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlFunctionParameter(ISqmlFunctionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Sql</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Sql</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlSql(ISqmlSql object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Sql Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Sql Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlSqlId(ISqmlSqlId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Sql Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Sql Keyword</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlSqlKeyword(ISqmlSqlKeyword object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Sql Number Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Sql Number Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlSqlNumberLiteral(ISqmlSqlNumberLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Sql String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Sql String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlSqlStringLiteral(ISqmlSqlStringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Sql Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Sql Symbol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlSqlSymbol(ISqmlSqlSymbol object) {
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

} //FunctionsSwitch
