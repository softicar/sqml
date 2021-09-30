/**
 */
package com.softicar.sqml.model.tables.util;

import com.softicar.sqml.model.ISqmlColumn;
import com.softicar.sqml.model.ISqmlGlobalObject;
import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.ISqmlTabular;
import com.softicar.sqml.model.ISqmlValue;

import com.softicar.sqml.model.expressions.ISqmlExpression;

import com.softicar.sqml.model.files.ISqmlFileElement;
import com.softicar.sqml.model.files.SqmlFileElement;

import com.softicar.sqml.model.tables.*;

import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.types.ISqmlTypeDefinition;

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
 * @see com.softicar.sqml.model.tables.TablesPackage
 * @generated
 */
public class TablesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TablesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TablesSwitch() {
		if (modelPackage == null) {
			modelPackage = TablesPackage.eINSTANCE;
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
			case TablesPackage.SQML_LITERAL_DEFAULT_VALUE: {
				SqmlLiteralDefaultValue sqmlLiteralDefaultValue = (SqmlLiteralDefaultValue)theEObject;
				T result = caseSqmlLiteralDefaultValue(sqmlLiteralDefaultValue);
				if (result == null) result = caseISqmlLiteralDefaultValue(sqmlLiteralDefaultValue);
				if (result == null) result = caseISqmlDefaultValue(sqmlLiteralDefaultValue);
				if (result == null) result = caseISqmlExpression(sqmlLiteralDefaultValue);
				if (result == null) result = caseISqmlValue(sqmlLiteralDefaultValue);
				if (result == null) result = caseISqmlModelElement(sqmlLiteralDefaultValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablesPackage.SQML_ROW_CONSTRUCTOR_DEFAULT_VALUE: {
				SqmlRowConstructorDefaultValue sqmlRowConstructorDefaultValue = (SqmlRowConstructorDefaultValue)theEObject;
				T result = caseSqmlRowConstructorDefaultValue(sqmlRowConstructorDefaultValue);
				if (result == null) result = caseISqmlRowConstructorDefaultValue(sqmlRowConstructorDefaultValue);
				if (result == null) result = caseISqmlDefaultValue(sqmlRowConstructorDefaultValue);
				if (result == null) result = caseISqmlExpression(sqmlRowConstructorDefaultValue);
				if (result == null) result = caseISqmlValue(sqmlRowConstructorDefaultValue);
				if (result == null) result = caseISqmlModelElement(sqmlRowConstructorDefaultValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablesPackage.SQML_TABLE: {
				SqmlTable sqmlTable = (SqmlTable)theEObject;
				T result = caseSqmlTable(sqmlTable);
				if (result == null) result = caseSqmlFileElement(sqmlTable);
				if (result == null) result = caseISqmlTable(sqmlTable);
				if (result == null) result = caseISqmlFileElement(sqmlTable);
				if (result == null) result = caseISqmlTabular(sqmlTable);
				if (result == null) result = caseISqmlTypeDefinition(sqmlTable);
				if (result == null) result = caseISqmlGlobalObject(sqmlTable);
				if (result == null) result = caseISqmlType(sqmlTable);
				if (result == null) result = caseISqmlModelElement(sqmlTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablesPackage.SQML_TABLE_COLUMN: {
				SqmlTableColumn sqmlTableColumn = (SqmlTableColumn)theEObject;
				T result = caseSqmlTableColumn(sqmlTableColumn);
				if (result == null) result = caseISqmlTableColumn(sqmlTableColumn);
				if (result == null) result = caseISqmlValidatable(sqmlTableColumn);
				if (result == null) result = caseISqmlColumn(sqmlTableColumn);
				if (result == null) result = caseISqmlValue(sqmlTableColumn);
				if (result == null) result = caseISqmlModelElement(sqmlTableColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablesPackage.SQML_TABLE_KEY: {
				SqmlTableKey sqmlTableKey = (SqmlTableKey)theEObject;
				T result = caseSqmlTableKey(sqmlTableKey);
				if (result == null) result = caseISqmlTableKey(sqmlTableKey);
				if (result == null) result = caseISqmlModelElement(sqmlTableKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablesPackage.SQML_UNIQUE_KEY: {
				SqmlUniqueKey sqmlUniqueKey = (SqmlUniqueKey)theEObject;
				T result = caseSqmlUniqueKey(sqmlUniqueKey);
				if (result == null) result = caseSqmlTableKey(sqmlUniqueKey);
				if (result == null) result = caseISqmlUniqueKey(sqmlUniqueKey);
				if (result == null) result = caseISqmlTableKey(sqmlUniqueKey);
				if (result == null) result = caseISqmlModelElement(sqmlUniqueKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablesPackage.SQML_INDEX_KEY: {
				SqmlIndexKey sqmlIndexKey = (SqmlIndexKey)theEObject;
				T result = caseSqmlIndexKey(sqmlIndexKey);
				if (result == null) result = caseSqmlTableKey(sqmlIndexKey);
				if (result == null) result = caseISqmlIndexKey(sqmlIndexKey);
				if (result == null) result = caseISqmlTableKey(sqmlIndexKey);
				if (result == null) result = caseISqmlModelElement(sqmlIndexKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablesPackage.SQML_VALUE_REFERENCE_DEFAULT_VALUE: {
				SqmlValueReferenceDefaultValue sqmlValueReferenceDefaultValue = (SqmlValueReferenceDefaultValue)theEObject;
				T result = caseSqmlValueReferenceDefaultValue(sqmlValueReferenceDefaultValue);
				if (result == null) result = caseISqmlValueReferenceDefaultValue(sqmlValueReferenceDefaultValue);
				if (result == null) result = caseISqmlDefaultValue(sqmlValueReferenceDefaultValue);
				if (result == null) result = caseISqmlExpression(sqmlValueReferenceDefaultValue);
				if (result == null) result = caseISqmlValue(sqmlValueReferenceDefaultValue);
				if (result == null) result = caseISqmlModelElement(sqmlValueReferenceDefaultValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablesPackage.SQML_TABLE_ROW: {
				SqmlTableRow sqmlTableRow = (SqmlTableRow)theEObject;
				T result = caseSqmlTableRow(sqmlTableRow);
				if (result == null) result = caseISqmlTableRow(sqmlTableRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablesPackage.SQML_TABLE_ROW_VALUE: {
				SqmlTableRowValue sqmlTableRowValue = (SqmlTableRowValue)theEObject;
				T result = caseSqmlTableRowValue(sqmlTableRowValue);
				if (result == null) result = caseISqmlTableRowValue(sqmlTableRowValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Literal Default Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Literal Default Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlLiteralDefaultValue(SqmlLiteralDefaultValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Row Constructor Default Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Row Constructor Default Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlRowConstructorDefaultValue(SqmlRowConstructorDefaultValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlTable(SqmlTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Table Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Table Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlTableColumn(SqmlTableColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Table Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Table Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlTableKey(SqmlTableKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Unique Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Unique Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlUniqueKey(SqmlUniqueKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Index Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Index Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlIndexKey(SqmlIndexKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Value Reference Default Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Value Reference Default Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlValueReferenceDefaultValue(SqmlValueReferenceDefaultValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Table Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Table Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlTableRow(SqmlTableRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqml Table Row Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqml Table Row Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqmlTableRowValue(SqmlTableRowValue object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Default Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Default Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlDefaultValue(ISqmlDefaultValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Literal Default Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Literal Default Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlLiteralDefaultValue(ISqmlLiteralDefaultValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Row Constructor Default Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Row Constructor Default Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlRowConstructorDefaultValue(ISqmlRowConstructorDefaultValue object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlType(ISqmlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlTypeDefinition(ISqmlTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlTable(ISqmlTable object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Table Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Table Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlTableColumn(ISqmlTableColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Table Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Table Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlTableKey(ISqmlTableKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Unique Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Unique Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlUniqueKey(ISqmlUniqueKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Index Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Index Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlIndexKey(ISqmlIndexKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Value Reference Default Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Value Reference Default Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlValueReferenceDefaultValue(ISqmlValueReferenceDefaultValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Table Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Table Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlTableRow(ISqmlTableRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Table Row Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Table Row Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlTableRowValue(ISqmlTableRowValue object) {
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

} //TablesSwitch
