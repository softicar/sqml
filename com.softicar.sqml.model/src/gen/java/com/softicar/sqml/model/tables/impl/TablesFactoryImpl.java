/**
 */
package com.softicar.sqml.model.tables.impl;

import com.softicar.sqml.model.tables.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TablesFactoryImpl extends EFactoryImpl implements TablesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TablesFactory init() {
		try {
			TablesFactory theTablesFactory = (TablesFactory)EPackage.Registry.INSTANCE.getEFactory(TablesPackage.eNS_URI);
			if (theTablesFactory != null) {
				return theTablesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TablesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TablesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TablesPackage.SQML_LITERAL_DEFAULT_VALUE: return createSqmlLiteralDefaultValue();
			case TablesPackage.SQML_ROW_CONSTRUCTOR_DEFAULT_VALUE: return createSqmlRowConstructorDefaultValue();
			case TablesPackage.SQML_TABLE: return createSqmlTable();
			case TablesPackage.SQML_TABLE_COLUMN: return createSqmlTableColumn();
			case TablesPackage.SQML_UNIQUE_KEY: return createSqmlUniqueKey();
			case TablesPackage.SQML_INDEX_KEY: return createSqmlIndexKey();
			case TablesPackage.SQML_VALUE_REFERENCE_DEFAULT_VALUE: return createSqmlValueReferenceDefaultValue();
			case TablesPackage.SQML_TABLE_ROW: return createSqmlTableRow();
			case TablesPackage.SQML_TABLE_ROW_VALUE: return createSqmlTableRowValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TablesPackage.SQML_FOREIGN_KEY_ACTION:
				return createSqmlForeignKeyActionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TablesPackage.SQML_FOREIGN_KEY_ACTION:
				return convertSqmlForeignKeyActionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlLiteralDefaultValue createSqmlLiteralDefaultValue() {
		SqmlLiteralDefaultValueImpl sqmlLiteralDefaultValue = new SqmlLiteralDefaultValueImpl();
		return sqmlLiteralDefaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlRowConstructorDefaultValue createSqmlRowConstructorDefaultValue() {
		SqmlRowConstructorDefaultValueImpl sqmlRowConstructorDefaultValue = new SqmlRowConstructorDefaultValueImpl();
		return sqmlRowConstructorDefaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlTable createSqmlTable() {
		SqmlTableImpl sqmlTable = new SqmlTableImpl();
		return sqmlTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlTableColumn createSqmlTableColumn() {
		SqmlTableColumnImpl sqmlTableColumn = new SqmlTableColumnImpl();
		return sqmlTableColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlUniqueKey createSqmlUniqueKey() {
		SqmlUniqueKeyImpl sqmlUniqueKey = new SqmlUniqueKeyImpl();
		return sqmlUniqueKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlIndexKey createSqmlIndexKey() {
		SqmlIndexKeyImpl sqmlIndexKey = new SqmlIndexKeyImpl();
		return sqmlIndexKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlValueReferenceDefaultValue createSqmlValueReferenceDefaultValue() {
		SqmlValueReferenceDefaultValueImpl sqmlValueReferenceDefaultValue = new SqmlValueReferenceDefaultValueImpl();
		return sqmlValueReferenceDefaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlTableRow createSqmlTableRow() {
		SqmlTableRowImpl sqmlTableRow = new SqmlTableRowImpl();
		return sqmlTableRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlTableRowValue createSqmlTableRowValue() {
		SqmlTableRowValueImpl sqmlTableRowValue = new SqmlTableRowValueImpl();
		return sqmlTableRowValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlForeignKeyAction createSqmlForeignKeyActionFromString(EDataType eDataType, String initialValue) {
		SqmlForeignKeyAction result = SqmlForeignKeyAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSqmlForeignKeyActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TablesPackage getTablesPackage() {
		return (TablesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TablesPackage getPackage() {
		return TablesPackage.eINSTANCE;
	}

} //TablesFactoryImpl
