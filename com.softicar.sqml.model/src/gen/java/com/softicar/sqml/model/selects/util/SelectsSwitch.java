/**
 */
package com.softicar.sqml.model.selects.util;

import com.softicar.sqml.model.ISqmlColumn;
import com.softicar.sqml.model.ISqmlGeneratable;
import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.ISqmlTabular;
import com.softicar.sqml.model.ISqmlValue;

import com.softicar.sqml.model.expressions.ISqmlExpression;

import com.softicar.sqml.model.selects.*;

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
 * @see com.softicar.sqml.model.selects.SelectsPackage
 * @generated
 */
public class SelectsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SelectsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectsSwitch() {
		if (modelPackage == null) {
			modelPackage = SelectsPackage.eINSTANCE;
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
			case SelectsPackage.ABSTRACT_SQML_SELECT_BLOCK: {
				AbstractSqmlSelectBlock abstractSqmlSelectBlock = (AbstractSqmlSelectBlock)theEObject;
				T result = caseAbstractSqmlSelectBlock(abstractSqmlSelectBlock);
				if (result == null) result = caseISqmlSelectBlock(abstractSqmlSelectBlock);
				if (result == null) result = caseISqmlSelectPart(abstractSqmlSelectBlock);
				if (result == null) result = caseISqmlModelElement(abstractSqmlSelectBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectsPackage.SQML_FOREIGN_KEY_VARIABLE: {
				SqmlForeignKeyVariable sqmlForeignKeyVariable = (SqmlForeignKeyVariable)theEObject;
				T result = caseSqmlForeignKeyVariable(sqmlForeignKeyVariable);
				if (result == null) result = caseISqmlForeignKeyVariable(sqmlForeignKeyVariable);
				if (result == null) result = caseISqmlVariable(sqmlForeignKeyVariable);
				if (result == null) result = caseISqmlGeneratable(sqmlForeignKeyVariable);
				if (result == null) result = caseISqmlValue(sqmlForeignKeyVariable);
				if (result == null) result = caseISqmlModelElement(sqmlForeignKeyVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectsPackage.SQML_FROM_CLAUSE: {
				SqmlFromClause sqmlFromClause = (SqmlFromClause)theEObject;
				T result = caseSqmlFromClause(sqmlFromClause);
				if (result == null) result = caseISqmlFromClause(sqmlFromClause);
				if (result == null) result = caseISqmlSelectPart(sqmlFromClause);
				if (result == null) result = caseISqmlModelElement(sqmlFromClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectsPackage.SQML_GROUP_BY_CLAUSE: {
				SqmlGroupByClause sqmlGroupByClause = (SqmlGroupByClause)theEObject;
				T result = caseSqmlGroupByClause(sqmlGroupByClause);
				if (result == null) result = caseISqmlGroupByClause(sqmlGroupByClause);
				if (result == null) result = caseISqmlSelectPart(sqmlGroupByClause);
				if (result == null) result = caseISqmlModelElement(sqmlGroupByClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectsPackage.SQML_HAVING_CLAUSE: {
				SqmlHavingClause sqmlHavingClause = (SqmlHavingClause)theEObject;
				T result = caseSqmlHavingClause(sqmlHavingClause);
				if (result == null) result = caseISqmlHavingClause(sqmlHavingClause);
				if (result == null) result = caseISqmlSelectPart(sqmlHavingClause);
				if (result == null) result = caseISqmlModelElement(sqmlHavingClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectsPackage.SQML_JOIN_CLAUSE: {
				SqmlJoinClause sqmlJoinClause = (SqmlJoinClause)theEObject;
				T result = caseSqmlJoinClause(sqmlJoinClause);
				if (result == null) result = caseISqmlJoinClause(sqmlJoinClause);
				if (result == null) result = caseISqmlValidatable(sqmlJoinClause);
				if (result == null) result = caseISqmlSelectPart(sqmlJoinClause);
				if (result == null) result = caseISqmlModelElement(sqmlJoinClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectsPackage.SQML_ORDER_BY_CLAUSE: {
				SqmlOrderByClause sqmlOrderByClause = (SqmlOrderByClause)theEObject;
				T result = caseSqmlOrderByClause(sqmlOrderByClause);
				if (result == null) result = caseISqmlOrderByClause(sqmlOrderByClause);
				if (result == null) result = caseISqmlSelectPart(sqmlOrderByClause);
				if (result == null) result = caseISqmlModelElement(sqmlOrderByClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectsPackage.SQML_ORDER_BY_EXPRESSION: {
				SqmlOrderByExpression sqmlOrderByExpression = (SqmlOrderByExpression)theEObject;
				T result = caseSqmlOrderByExpression(sqmlOrderByExpression);
				if (result == null) result = caseISqmlOrderByExpression(sqmlOrderByExpression);
				if (result == null) result = caseISqmlModelElement(sqmlOrderByExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectsPackage.SQML_SELECT: {
				SqmlSelect sqmlSelect = (SqmlSelect)theEObject;
				T result = caseSqmlSelect(sqmlSelect);
				if (result == null) result = caseAbstractSqmlSelectBlock(sqmlSelect);
				if (result == null) result = caseISqmlSelect(sqmlSelect);
				if (result == null) result = caseISqmlSelectBlock(sqmlSelect);
				if (result == null) result = caseISqmlExpression(sqmlSelect);
				if (result == null) result = caseISqmlTabular(sqmlSelect);
				if (result == null) result = caseISqmlValidatable(sqmlSelect);
				if (result == null) result = caseISqmlSelectPart(sqmlSelect);
				if (result == null) result = caseISqmlValue(sqmlSelect);
				if (result == null) result = caseISqmlModelElement(sqmlSelect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectsPackage.SQML_SELECT_CLAUSE: {
				SqmlSelectClause sqmlSelectClause = (SqmlSelectClause)theEObject;
				T result = caseSqmlSelectClause(sqmlSelectClause);
				if (result == null) result = caseISqmlSelectClause(sqmlSelectClause);
				if (result == null) result = caseISqmlSelectPart(sqmlSelectClause);
				if (result == null) result = caseISqmlModelElement(sqmlSelectClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectsPackage.SQML_SELECT_COLUMN: {
				SqmlSelectColumn sqmlSelectColumn = (SqmlSelectColumn)theEObject;
				T result = caseSqmlSelectColumn(sqmlSelectColumn);
				if (result == null) result = caseISqmlSelectColumn(sqmlSelectColumn);
				if (result == null) result = caseISqmlValidatable(sqmlSelectColumn);
				if (result == null) result = caseISqmlColumn(sqmlSelectColumn);
				if (result == null) result = caseISqmlValue(sqmlSelectColumn);
				if (result == null) result = caseISqmlModelElement(sqmlSelectColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectsPackage.SQML_SELECT_ELSE: {
				SqmlSelectElse sqmlSelectElse = (SqmlSelectElse)theEObject;
				T result = caseSqmlSelectElse(sqmlSelectElse);
				if (result == null) result = caseAbstractSqmlSelectBlock(sqmlSelectElse);
				if (result == null) result = caseISqmlSelectElse(sqmlSelectElse);
				if (result == null) result = caseISqmlSelectBlock(sqmlSelectElse);
				if (result == null) result = caseISqmlSelectPart(sqmlSelectElse);
				if (result == null) result = caseISqmlModelElement(sqmlSelectElse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectsPackage.SQML_SELECT_ELSE_IF: {
				SqmlSelectElseIf sqmlSelectElseIf = (SqmlSelectElseIf)theEObject;
				T result = caseSqmlSelectElseIf(sqmlSelectElseIf);
				if (result == null) result = caseAbstractSqmlSelectBlock(sqmlSelectElseIf);
				if (result == null) result = caseISqmlSelectElseIf(sqmlSelectElseIf);
				if (result == null) result = caseISqmlSelectBlock(sqmlSelectElseIf);
				if (result == null) result = caseISqmlSelectPart(sqmlSelectElseIf);
				if (result == null) result = caseISqmlModelElement(sqmlSelectElseIf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectsPackage.SQML_SELECT_IF: {
				SqmlSelectIf sqmlSelectIf = (SqmlSelectIf)theEObject;
				T result = caseSqmlSelectIf(sqmlSelectIf);
				if (result == null) result = caseAbstractSqmlSelectBlock(sqmlSelectIf);
				if (result == null) result = caseISqmlSelectIf(sqmlSelectIf);
				if (result == null) result = caseISqmlSelectBlock(sqmlSelectIf);
				if (result == null) result = caseISqmlSelectPart(sqmlSelectIf);
				if (result == null) result = caseISqmlModelElement(sqmlSelectIf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectsPackage.SQML_SUB_SELECT_VARIABLE: {
				SqmlSubSelectVariable sqmlSubSelectVariable = (SqmlSubSelectVariable)theEObject;
				T result = caseSqmlSubSelectVariable(sqmlSubSelectVariable);
				if (result == null) result = caseISqmlSubSelectVariable(sqmlSubSelectVariable);
				if (result == null) result = caseISqmlVariable(sqmlSubSelectVariable);
				if (result == null) result = caseISqmlGeneratable(sqmlSubSelectVariable);
				if (result == null) result = caseISqmlValue(sqmlSubSelectVariable);
				if (result == null) result = caseISqmlModelElement(sqmlSubSelectVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectsPackage.SQML_TABLE_VARIABLE: {
				SqmlTableVariable sqmlTableVariable = (SqmlTableVariable)theEObject;
				T result = caseSqmlTableVariable(sqmlTableVariable);
				if (result == null) result = caseISqmlTableVariable(sqmlTableVariable);
				if (result == null) result = caseISqmlVariable(sqmlTableVariable);
				if (result == null) result = caseISqmlGeneratable(sqmlTableVariable);
				if (result == null) result = caseISqmlValue(sqmlTableVariable);
				if (result == null) result = caseISqmlModelElement(sqmlTableVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectsPackage.SQML_WHERE_CLAUSE: {
				SqmlWhereClause sqmlWhereClause = (SqmlWhereClause)theEObject;
				T result = caseSqmlWhereClause(sqmlWhereClause);
				if (result == null) result = caseISqmlWhereClause(sqmlWhereClause);
				if (result == null) result = caseISqmlValidatable(sqmlWhereClause);
				if (result == null) result = caseISqmlSelectPart(sqmlWhereClause);
				if (result == null) result = caseISqmlModelElement(sqmlWhereClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Sqml Select Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Sqml Select Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSqmlSelectBlock(AbstractSqmlSelectBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Foreign Key Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Foreign Key Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlForeignKeyVariable(SqmlForeignKeyVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml From Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml From Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlFromClause(SqmlFromClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Group By Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Group By Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlGroupByClause(SqmlGroupByClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Having Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Having Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlHavingClause(SqmlHavingClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Join Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Join Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlJoinClause(SqmlJoinClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Order By Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Order By Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlOrderByClause(SqmlOrderByClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Order By Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Order By Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlOrderByExpression(SqmlOrderByExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Select</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Select</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlSelect(SqmlSelect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Select Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Select Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlSelectClause(SqmlSelectClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Select Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Select Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlSelectColumn(SqmlSelectColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Select Else</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Select Else</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlSelectElse(SqmlSelectElse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Select Else If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Select Else If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlSelectElseIf(SqmlSelectElseIf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Select If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Select If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlSelectIf(SqmlSelectIf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Sub Select Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Sub Select Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlSubSelectVariable(SqmlSubSelectVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Table Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Table Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlTableVariable(SqmlTableVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Where Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Where Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlWhereClause(SqmlWhereClause object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Select Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Select Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlSelectPart(ISqmlSelectPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Select Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Select Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlSelectBlock(ISqmlSelectBlock object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlVariable(ISqmlVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Foreign Key Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Foreign Key Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlForeignKeyVariable(ISqmlForeignKeyVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml From Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml From Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlFromClause(ISqmlFromClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Group By Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Group By Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlGroupByClause(ISqmlGroupByClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Having Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Having Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlHavingClause(ISqmlHavingClause object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Join Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Join Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlJoinClause(ISqmlJoinClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Order By Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Order By Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlOrderByClause(ISqmlOrderByClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Order By Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Order By Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlOrderByExpression(ISqmlOrderByExpression object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Tabular</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Tabular</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlTabular(ISqmlTabular object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Select</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Select</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlSelect(ISqmlSelect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Select Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Select Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlSelectClause(ISqmlSelectClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlColumn(ISqmlColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Select Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Select Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlSelectColumn(ISqmlSelectColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Select Else</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Select Else</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlSelectElse(ISqmlSelectElse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Select Else If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Select Else If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlSelectElseIf(ISqmlSelectElseIf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Select If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Select If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlSelectIf(ISqmlSelectIf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Sub Select Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Sub Select Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlSubSelectVariable(ISqmlSubSelectVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Table Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Table Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlTableVariable(ISqmlTableVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Where Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Where Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlWhereClause(ISqmlWhereClause object) {
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

} //SelectsSwitch
