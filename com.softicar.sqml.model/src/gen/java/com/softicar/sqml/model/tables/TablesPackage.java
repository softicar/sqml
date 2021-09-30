/**
 */
package com.softicar.sqml.model.tables;

import com.softicar.sqml.model.files.FilesPackage;

import com.softicar.sqml.model.interfaces.InterfacesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.softicar.sqml.model.tables.TablesFactory
 * @model kind="package"
 * @generated
 */
public interface TablesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tables";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "com.softicar.sqml.model.tables";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tables";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TablesPackage eINSTANCE = com.softicar.sqml.model.tables.impl.TablesPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.tables.impl.SqmlLiteralDefaultValueImpl <em>Sqml Literal Default Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.tables.impl.SqmlLiteralDefaultValueImpl
	 * @see com.softicar.sqml.model.tables.impl.TablesPackageImpl#getSqmlLiteralDefaultValue()
	 * @generated
	 */
	int SQML_LITERAL_DEFAULT_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Minus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_LITERAL_DEFAULT_VALUE__MINUS = InterfacesPackage.ISQML_LITERAL_DEFAULT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_LITERAL_DEFAULT_VALUE__LITERAL = InterfacesPackage.ISQML_LITERAL_DEFAULT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sqml Literal Default Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_LITERAL_DEFAULT_VALUE_FEATURE_COUNT = InterfacesPackage.ISQML_LITERAL_DEFAULT_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sqml Literal Default Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_LITERAL_DEFAULT_VALUE_OPERATION_COUNT = InterfacesPackage.ISQML_LITERAL_DEFAULT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.tables.impl.SqmlRowConstructorDefaultValueImpl <em>Sqml Row Constructor Default Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.tables.impl.SqmlRowConstructorDefaultValueImpl
	 * @see com.softicar.sqml.model.tables.impl.TablesPackageImpl#getSqmlRowConstructorDefaultValue()
	 * @generated
	 */
	int SQML_ROW_CONSTRUCTOR_DEFAULT_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Value References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_ROW_CONSTRUCTOR_DEFAULT_VALUE__VALUE_REFERENCES = InterfacesPackage.ISQML_ROW_CONSTRUCTOR_DEFAULT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sqml Row Constructor Default Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_ROW_CONSTRUCTOR_DEFAULT_VALUE_FEATURE_COUNT = InterfacesPackage.ISQML_ROW_CONSTRUCTOR_DEFAULT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sqml Row Constructor Default Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_ROW_CONSTRUCTOR_DEFAULT_VALUE_OPERATION_COUNT = InterfacesPackage.ISQML_ROW_CONSTRUCTOR_DEFAULT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.tables.impl.SqmlTableImpl <em>Sqml Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.tables.impl.SqmlTableImpl
	 * @see com.softicar.sqml.model.tables.impl.TablesPackageImpl#getSqmlTable()
	 * @generated
	 */
	int SQML_TABLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE__NAME = FilesPackage.SQML_FILE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Enum Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE__ENUM_TABLE = FilesPackage.SQML_FILE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Physical Name Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE__PHYSICAL_NAME_OVERRIDE = FilesPackage.SQML_FILE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE__COLUMNS = FilesPackage.SQML_FILE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Table Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE__TABLE_KEYS = FilesPackage.SQML_FILE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Enums</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE__ENUMS = FilesPackage.SQML_FILE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE__ROWS = FilesPackage.SQML_FILE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Sqml Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_FEATURE_COUNT = FilesPackage.SQML_FILE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Sqml Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_OPERATION_COUNT = FilesPackage.SQML_FILE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.tables.impl.SqmlTableColumnImpl <em>Sqml Table Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.tables.impl.SqmlTableColumnImpl
	 * @see com.softicar.sqml.model.tables.impl.TablesPackageImpl#getSqmlTableColumn()
	 * @generated
	 */
	int SQML_TABLE_COLUMN = 3;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_COLUMN__TABLE = InterfacesPackage.ISQML_TABLE_COLUMN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_COLUMN__NAME = InterfacesPackage.ISQML_TABLE_COLUMN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Physical Name Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_COLUMN__PHYSICAL_NAME_OVERRIDE = InterfacesPackage.ISQML_TABLE_COLUMN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_COLUMN__TYPE_REFERENCE = InterfacesPackage.ISQML_TABLE_COLUMN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_COLUMN__PRIMARY_KEY = InterfacesPackage.ISQML_TABLE_COLUMN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Serial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_COLUMN__SERIAL = InterfacesPackage.ISQML_TABLE_COLUMN_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Base Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_COLUMN__BASE_COLUMN = InterfacesPackage.ISQML_TABLE_COLUMN_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_COLUMN__NULLABLE = InterfacesPackage.ISQML_TABLE_COLUMN_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Unsigned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_COLUMN__UNSIGNED = InterfacesPackage.ISQML_TABLE_COLUMN_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>On Delete Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_COLUMN__ON_DELETE_ACTION = InterfacesPackage.ISQML_TABLE_COLUMN_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>On Update Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_COLUMN__ON_UPDATE_ACTION = InterfacesPackage.ISQML_TABLE_COLUMN_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Default Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_COLUMN__DEFAULT_NULL = InterfacesPackage.ISQML_TABLE_COLUMN_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Default Now</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_COLUMN__DEFAULT_NOW = InterfacesPackage.ISQML_TABLE_COLUMN_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>On Update Now</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_COLUMN__ON_UPDATE_NOW = InterfacesPackage.ISQML_TABLE_COLUMN_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_COLUMN__TIMESTAMP = InterfacesPackage.ISQML_TABLE_COLUMN_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_COLUMN__DEFAULT_VALUE = InterfacesPackage.ISQML_TABLE_COLUMN_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_COLUMN__BITS = InterfacesPackage.ISQML_TABLE_COLUMN_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_COLUMN__PRECISION = InterfacesPackage.ISQML_TABLE_COLUMN_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_COLUMN__SCALE = InterfacesPackage.ISQML_TABLE_COLUMN_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_COLUMN__MAX_LENGTH = InterfacesPackage.ISQML_TABLE_COLUMN_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Length Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_COLUMN__LENGTH_BITS = InterfacesPackage.ISQML_TABLE_COLUMN_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Character Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_COLUMN__CHARACTER_SET = InterfacesPackage.ISQML_TABLE_COLUMN_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Collation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_COLUMN__COLLATION = InterfacesPackage.ISQML_TABLE_COLUMN_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_COLUMN__COMMENT = InterfacesPackage.ISQML_TABLE_COLUMN_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Constraint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_COLUMN__CONSTRAINT_NAME = InterfacesPackage.ISQML_TABLE_COLUMN_FEATURE_COUNT + 24;

	/**
	 * The number of structural features of the '<em>Sqml Table Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_COLUMN_FEATURE_COUNT = InterfacesPackage.ISQML_TABLE_COLUMN_FEATURE_COUNT + 25;

	/**
	 * The number of operations of the '<em>Sqml Table Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_COLUMN_OPERATION_COUNT = InterfacesPackage.ISQML_TABLE_COLUMN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.tables.impl.SqmlTableKeyImpl <em>Sqml Table Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.tables.impl.SqmlTableKeyImpl
	 * @see com.softicar.sqml.model.tables.impl.TablesPackageImpl#getSqmlTableKey()
	 * @generated
	 */
	int SQML_TABLE_KEY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_KEY__NAME = InterfacesPackage.ISQML_TABLE_KEY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_KEY__COLUMNS = InterfacesPackage.ISQML_TABLE_KEY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_KEY__TABLE = InterfacesPackage.ISQML_TABLE_KEY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sqml Table Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_KEY_FEATURE_COUNT = InterfacesPackage.ISQML_TABLE_KEY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sqml Table Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_KEY_OPERATION_COUNT = InterfacesPackage.ISQML_TABLE_KEY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.tables.impl.SqmlUniqueKeyImpl <em>Sqml Unique Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.tables.impl.SqmlUniqueKeyImpl
	 * @see com.softicar.sqml.model.tables.impl.TablesPackageImpl#getSqmlUniqueKey()
	 * @generated
	 */
	int SQML_UNIQUE_KEY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_UNIQUE_KEY__NAME = SQML_TABLE_KEY__NAME;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_UNIQUE_KEY__COLUMNS = SQML_TABLE_KEY__COLUMNS;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_UNIQUE_KEY__TABLE = SQML_TABLE_KEY__TABLE;

	/**
	 * The number of structural features of the '<em>Sqml Unique Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_UNIQUE_KEY_FEATURE_COUNT = SQML_TABLE_KEY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sqml Unique Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_UNIQUE_KEY_OPERATION_COUNT = SQML_TABLE_KEY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.tables.impl.SqmlIndexKeyImpl <em>Sqml Index Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.tables.impl.SqmlIndexKeyImpl
	 * @see com.softicar.sqml.model.tables.impl.TablesPackageImpl#getSqmlIndexKey()
	 * @generated
	 */
	int SQML_INDEX_KEY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_INDEX_KEY__NAME = SQML_TABLE_KEY__NAME;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_INDEX_KEY__COLUMNS = SQML_TABLE_KEY__COLUMNS;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_INDEX_KEY__TABLE = SQML_TABLE_KEY__TABLE;

	/**
	 * The number of structural features of the '<em>Sqml Index Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_INDEX_KEY_FEATURE_COUNT = SQML_TABLE_KEY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sqml Index Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_INDEX_KEY_OPERATION_COUNT = SQML_TABLE_KEY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.tables.impl.SqmlValueReferenceDefaultValueImpl <em>Sqml Value Reference Default Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.tables.impl.SqmlValueReferenceDefaultValueImpl
	 * @see com.softicar.sqml.model.tables.impl.TablesPackageImpl#getSqmlValueReferenceDefaultValue()
	 * @generated
	 */
	int SQML_VALUE_REFERENCE_DEFAULT_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Value Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_VALUE_REFERENCE_DEFAULT_VALUE__VALUE_REFERENCE = InterfacesPackage.ISQML_VALUE_REFERENCE_DEFAULT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sqml Value Reference Default Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_VALUE_REFERENCE_DEFAULT_VALUE_FEATURE_COUNT = InterfacesPackage.ISQML_VALUE_REFERENCE_DEFAULT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sqml Value Reference Default Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_VALUE_REFERENCE_DEFAULT_VALUE_OPERATION_COUNT = InterfacesPackage.ISQML_VALUE_REFERENCE_DEFAULT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.tables.impl.SqmlTableRowImpl <em>Sqml Table Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.tables.impl.SqmlTableRowImpl
	 * @see com.softicar.sqml.model.tables.impl.TablesPackageImpl#getSqmlTableRow()
	 * @generated
	 */
	int SQML_TABLE_ROW = 8;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_ROW__TABLE = InterfacesPackage.ISQML_TABLE_ROW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_ROW__VALUES = InterfacesPackage.ISQML_TABLE_ROW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sqml Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_ROW_FEATURE_COUNT = InterfacesPackage.ISQML_TABLE_ROW_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sqml Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_ROW_OPERATION_COUNT = InterfacesPackage.ISQML_TABLE_ROW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.tables.impl.SqmlTableRowValueImpl <em>Sqml Table Row Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.tables.impl.SqmlTableRowValueImpl
	 * @see com.softicar.sqml.model.tables.impl.TablesPackageImpl#getSqmlTableRowValue()
	 * @generated
	 */
	int SQML_TABLE_ROW_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Row</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_ROW_VALUE__ROW = InterfacesPackage.ISQML_TABLE_ROW_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_ROW_VALUE__LITERAL = InterfacesPackage.ISQML_TABLE_ROW_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_ROW_VALUE__NULL = InterfacesPackage.ISQML_TABLE_ROW_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sqml Table Row Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_ROW_VALUE_FEATURE_COUNT = InterfacesPackage.ISQML_TABLE_ROW_VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sqml Table Row Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_ROW_VALUE_OPERATION_COUNT = InterfacesPackage.ISQML_TABLE_ROW_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.tables.SqmlForeignKeyAction <em>Sqml Foreign Key Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.tables.SqmlForeignKeyAction
	 * @see com.softicar.sqml.model.tables.impl.TablesPackageImpl#getSqmlForeignKeyAction()
	 * @generated
	 */
	int SQML_FOREIGN_KEY_ACTION = 10;


	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.tables.SqmlLiteralDefaultValue <em>Sqml Literal Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Literal Default Value</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlLiteralDefaultValue
	 * @generated
	 */
	EClass getSqmlLiteralDefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.tables.SqmlLiteralDefaultValue#isMinus <em>Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minus</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlLiteralDefaultValue#isMinus()
	 * @see #getSqmlLiteralDefaultValue()
	 * @generated
	 */
	EAttribute getSqmlLiteralDefaultValue_Minus();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.tables.SqmlLiteralDefaultValue#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Literal</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlLiteralDefaultValue#getLiteral()
	 * @see #getSqmlLiteralDefaultValue()
	 * @generated
	 */
	EReference getSqmlLiteralDefaultValue_Literal();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.tables.SqmlRowConstructorDefaultValue <em>Sqml Row Constructor Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Row Constructor Default Value</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlRowConstructorDefaultValue
	 * @generated
	 */
	EClass getSqmlRowConstructorDefaultValue();

	/**
	 * Returns the meta object for the containment reference list '{@link com.softicar.sqml.model.tables.SqmlRowConstructorDefaultValue#getValueReferences <em>Value References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value References</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlRowConstructorDefaultValue#getValueReferences()
	 * @see #getSqmlRowConstructorDefaultValue()
	 * @generated
	 */
	EReference getSqmlRowConstructorDefaultValue_ValueReferences();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.tables.SqmlTable <em>Sqml Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Table</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTable
	 * @generated
	 */
	EClass getSqmlTable();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.tables.SqmlTable#isEnumTable <em>Enum Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum Table</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTable#isEnumTable()
	 * @see #getSqmlTable()
	 * @generated
	 */
	EAttribute getSqmlTable_EnumTable();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.tables.SqmlTable#getPhysicalNameOverride <em>Physical Name Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical Name Override</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTable#getPhysicalNameOverride()
	 * @see #getSqmlTable()
	 * @generated
	 */
	EAttribute getSqmlTable_PhysicalNameOverride();

	/**
	 * Returns the meta object for the containment reference list '{@link com.softicar.sqml.model.tables.SqmlTable#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTable#getColumns()
	 * @see #getSqmlTable()
	 * @generated
	 */
	EReference getSqmlTable_Columns();

	/**
	 * Returns the meta object for the containment reference list '{@link com.softicar.sqml.model.tables.SqmlTable#getTableKeys <em>Table Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Keys</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTable#getTableKeys()
	 * @see #getSqmlTable()
	 * @generated
	 */
	EReference getSqmlTable_TableKeys();

	/**
	 * Returns the meta object for the containment reference list '{@link com.softicar.sqml.model.tables.SqmlTable#getEnums <em>Enums</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enums</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTable#getEnums()
	 * @see #getSqmlTable()
	 * @generated
	 */
	EReference getSqmlTable_Enums();

	/**
	 * Returns the meta object for the containment reference list '{@link com.softicar.sqml.model.tables.SqmlTable#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTable#getRows()
	 * @see #getSqmlTable()
	 * @generated
	 */
	EReference getSqmlTable_Rows();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.tables.SqmlTableColumn <em>Sqml Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Table Column</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableColumn
	 * @generated
	 */
	EClass getSqmlTableColumn();

	/**
	 * Returns the meta object for the container reference '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableColumn#getTable()
	 * @see #getSqmlTableColumn()
	 * @generated
	 */
	EReference getSqmlTableColumn_Table();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableColumn#getName()
	 * @see #getSqmlTableColumn()
	 * @generated
	 */
	EAttribute getSqmlTableColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getPhysicalNameOverride <em>Physical Name Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical Name Override</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableColumn#getPhysicalNameOverride()
	 * @see #getSqmlTableColumn()
	 * @generated
	 */
	EAttribute getSqmlTableColumn_PhysicalNameOverride();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getTypeReference <em>Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Reference</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableColumn#getTypeReference()
	 * @see #getSqmlTableColumn()
	 * @generated
	 */
	EReference getSqmlTableColumn_TypeReference();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.tables.SqmlTableColumn#isPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Key</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableColumn#isPrimaryKey()
	 * @see #getSqmlTableColumn()
	 * @generated
	 */
	EAttribute getSqmlTableColumn_PrimaryKey();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.tables.SqmlTableColumn#isSerial <em>Serial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableColumn#isSerial()
	 * @see #getSqmlTableColumn()
	 * @generated
	 */
	EAttribute getSqmlTableColumn_Serial();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.tables.SqmlTableColumn#isBaseColumn <em>Base Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Column</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableColumn#isBaseColumn()
	 * @see #getSqmlTableColumn()
	 * @generated
	 */
	EAttribute getSqmlTableColumn_BaseColumn();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.tables.SqmlTableColumn#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableColumn#isNullable()
	 * @see #getSqmlTableColumn()
	 * @generated
	 */
	EAttribute getSqmlTableColumn_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.tables.SqmlTableColumn#isUnsigned <em>Unsigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unsigned</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableColumn#isUnsigned()
	 * @see #getSqmlTableColumn()
	 * @generated
	 */
	EAttribute getSqmlTableColumn_Unsigned();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getOnDeleteAction <em>On Delete Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Delete Action</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableColumn#getOnDeleteAction()
	 * @see #getSqmlTableColumn()
	 * @generated
	 */
	EAttribute getSqmlTableColumn_OnDeleteAction();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getOnUpdateAction <em>On Update Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Update Action</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableColumn#getOnUpdateAction()
	 * @see #getSqmlTableColumn()
	 * @generated
	 */
	EAttribute getSqmlTableColumn_OnUpdateAction();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.tables.SqmlTableColumn#isDefaultNull <em>Default Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Null</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableColumn#isDefaultNull()
	 * @see #getSqmlTableColumn()
	 * @generated
	 */
	EAttribute getSqmlTableColumn_DefaultNull();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.tables.SqmlTableColumn#isDefaultNow <em>Default Now</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Now</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableColumn#isDefaultNow()
	 * @see #getSqmlTableColumn()
	 * @generated
	 */
	EAttribute getSqmlTableColumn_DefaultNow();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.tables.SqmlTableColumn#isOnUpdateNow <em>On Update Now</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Update Now</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableColumn#isOnUpdateNow()
	 * @see #getSqmlTableColumn()
	 * @generated
	 */
	EAttribute getSqmlTableColumn_OnUpdateNow();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.tables.SqmlTableColumn#isTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableColumn#isTimestamp()
	 * @see #getSqmlTableColumn()
	 * @generated
	 */
	EAttribute getSqmlTableColumn_Timestamp();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableColumn#getDefaultValue()
	 * @see #getSqmlTableColumn()
	 * @generated
	 */
	EReference getSqmlTableColumn_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getBits <em>Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bits</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableColumn#getBits()
	 * @see #getSqmlTableColumn()
	 * @generated
	 */
	EAttribute getSqmlTableColumn_Bits();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableColumn#getPrecision()
	 * @see #getSqmlTableColumn()
	 * @generated
	 */
	EAttribute getSqmlTableColumn_Precision();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableColumn#getScale()
	 * @see #getSqmlTableColumn()
	 * @generated
	 */
	EAttribute getSqmlTableColumn_Scale();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableColumn#getMaxLength()
	 * @see #getSqmlTableColumn()
	 * @generated
	 */
	EAttribute getSqmlTableColumn_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getLengthBits <em>Length Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length Bits</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableColumn#getLengthBits()
	 * @see #getSqmlTableColumn()
	 * @generated
	 */
	EAttribute getSqmlTableColumn_LengthBits();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getCharacterSet <em>Character Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Character Set</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableColumn#getCharacterSet()
	 * @see #getSqmlTableColumn()
	 * @generated
	 */
	EAttribute getSqmlTableColumn_CharacterSet();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getCollation <em>Collation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collation</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableColumn#getCollation()
	 * @see #getSqmlTableColumn()
	 * @generated
	 */
	EAttribute getSqmlTableColumn_Collation();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableColumn#getComment()
	 * @see #getSqmlTableColumn()
	 * @generated
	 */
	EAttribute getSqmlTableColumn_Comment();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getConstraintName <em>Constraint Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Name</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableColumn#getConstraintName()
	 * @see #getSqmlTableColumn()
	 * @generated
	 */
	EAttribute getSqmlTableColumn_ConstraintName();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.tables.SqmlTableKey <em>Sqml Table Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Table Key</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableKey
	 * @generated
	 */
	EClass getSqmlTableKey();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.tables.SqmlTableKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableKey#getName()
	 * @see #getSqmlTableKey()
	 * @generated
	 */
	EAttribute getSqmlTableKey_Name();

	/**
	 * Returns the meta object for the reference list '{@link com.softicar.sqml.model.tables.SqmlTableKey#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Columns</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableKey#getColumns()
	 * @see #getSqmlTableKey()
	 * @generated
	 */
	EReference getSqmlTableKey_Columns();

	/**
	 * Returns the meta object for the container reference '{@link com.softicar.sqml.model.tables.SqmlTableKey#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableKey#getTable()
	 * @see #getSqmlTableKey()
	 * @generated
	 */
	EReference getSqmlTableKey_Table();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.tables.SqmlUniqueKey <em>Sqml Unique Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Unique Key</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlUniqueKey
	 * @generated
	 */
	EClass getSqmlUniqueKey();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.tables.SqmlIndexKey <em>Sqml Index Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Index Key</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlIndexKey
	 * @generated
	 */
	EClass getSqmlIndexKey();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.tables.SqmlValueReferenceDefaultValue <em>Sqml Value Reference Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Value Reference Default Value</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlValueReferenceDefaultValue
	 * @generated
	 */
	EClass getSqmlValueReferenceDefaultValue();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.tables.SqmlValueReferenceDefaultValue#getValueReference <em>Value Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Reference</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlValueReferenceDefaultValue#getValueReference()
	 * @see #getSqmlValueReferenceDefaultValue()
	 * @generated
	 */
	EReference getSqmlValueReferenceDefaultValue_ValueReference();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.tables.SqmlTableRow <em>Sqml Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Table Row</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableRow
	 * @generated
	 */
	EClass getSqmlTableRow();

	/**
	 * Returns the meta object for the container reference '{@link com.softicar.sqml.model.tables.SqmlTableRow#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableRow#getTable()
	 * @see #getSqmlTableRow()
	 * @generated
	 */
	EReference getSqmlTableRow_Table();

	/**
	 * Returns the meta object for the containment reference list '{@link com.softicar.sqml.model.tables.SqmlTableRow#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableRow#getValues()
	 * @see #getSqmlTableRow()
	 * @generated
	 */
	EReference getSqmlTableRow_Values();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.tables.SqmlTableRowValue <em>Sqml Table Row Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Table Row Value</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableRowValue
	 * @generated
	 */
	EClass getSqmlTableRowValue();

	/**
	 * Returns the meta object for the container reference '{@link com.softicar.sqml.model.tables.SqmlTableRowValue#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Row</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableRowValue#getRow()
	 * @see #getSqmlTableRowValue()
	 * @generated
	 */
	EReference getSqmlTableRowValue_Row();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.tables.SqmlTableRowValue#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Literal</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableRowValue#getLiteral()
	 * @see #getSqmlTableRowValue()
	 * @generated
	 */
	EReference getSqmlTableRowValue_Literal();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.tables.SqmlTableRowValue#isNull <em>Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlTableRowValue#isNull()
	 * @see #getSqmlTableRowValue()
	 * @generated
	 */
	EAttribute getSqmlTableRowValue_Null();

	/**
	 * Returns the meta object for enum '{@link com.softicar.sqml.model.tables.SqmlForeignKeyAction <em>Sqml Foreign Key Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sqml Foreign Key Action</em>'.
	 * @see com.softicar.sqml.model.tables.SqmlForeignKeyAction
	 * @generated
	 */
	EEnum getSqmlForeignKeyAction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TablesFactory getTablesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.tables.impl.SqmlLiteralDefaultValueImpl <em>Sqml Literal Default Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.tables.impl.SqmlLiteralDefaultValueImpl
		 * @see com.softicar.sqml.model.tables.impl.TablesPackageImpl#getSqmlLiteralDefaultValue()
		 * @generated
		 */
		EClass SQML_LITERAL_DEFAULT_VALUE = eINSTANCE.getSqmlLiteralDefaultValue();

		/**
		 * The meta object literal for the '<em><b>Minus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_LITERAL_DEFAULT_VALUE__MINUS = eINSTANCE.getSqmlLiteralDefaultValue_Minus();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_LITERAL_DEFAULT_VALUE__LITERAL = eINSTANCE.getSqmlLiteralDefaultValue_Literal();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.tables.impl.SqmlRowConstructorDefaultValueImpl <em>Sqml Row Constructor Default Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.tables.impl.SqmlRowConstructorDefaultValueImpl
		 * @see com.softicar.sqml.model.tables.impl.TablesPackageImpl#getSqmlRowConstructorDefaultValue()
		 * @generated
		 */
		EClass SQML_ROW_CONSTRUCTOR_DEFAULT_VALUE = eINSTANCE.getSqmlRowConstructorDefaultValue();

		/**
		 * The meta object literal for the '<em><b>Value References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_ROW_CONSTRUCTOR_DEFAULT_VALUE__VALUE_REFERENCES = eINSTANCE.getSqmlRowConstructorDefaultValue_ValueReferences();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.tables.impl.SqmlTableImpl <em>Sqml Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.tables.impl.SqmlTableImpl
		 * @see com.softicar.sqml.model.tables.impl.TablesPackageImpl#getSqmlTable()
		 * @generated
		 */
		EClass SQML_TABLE = eINSTANCE.getSqmlTable();

		/**
		 * The meta object literal for the '<em><b>Enum Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_TABLE__ENUM_TABLE = eINSTANCE.getSqmlTable_EnumTable();

		/**
		 * The meta object literal for the '<em><b>Physical Name Override</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_TABLE__PHYSICAL_NAME_OVERRIDE = eINSTANCE.getSqmlTable_PhysicalNameOverride();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_TABLE__COLUMNS = eINSTANCE.getSqmlTable_Columns();

		/**
		 * The meta object literal for the '<em><b>Table Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_TABLE__TABLE_KEYS = eINSTANCE.getSqmlTable_TableKeys();

		/**
		 * The meta object literal for the '<em><b>Enums</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_TABLE__ENUMS = eINSTANCE.getSqmlTable_Enums();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_TABLE__ROWS = eINSTANCE.getSqmlTable_Rows();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.tables.impl.SqmlTableColumnImpl <em>Sqml Table Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.tables.impl.SqmlTableColumnImpl
		 * @see com.softicar.sqml.model.tables.impl.TablesPackageImpl#getSqmlTableColumn()
		 * @generated
		 */
		EClass SQML_TABLE_COLUMN = eINSTANCE.getSqmlTableColumn();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_TABLE_COLUMN__TABLE = eINSTANCE.getSqmlTableColumn_Table();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_TABLE_COLUMN__NAME = eINSTANCE.getSqmlTableColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Physical Name Override</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_TABLE_COLUMN__PHYSICAL_NAME_OVERRIDE = eINSTANCE.getSqmlTableColumn_PhysicalNameOverride();

		/**
		 * The meta object literal for the '<em><b>Type Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_TABLE_COLUMN__TYPE_REFERENCE = eINSTANCE.getSqmlTableColumn_TypeReference();

		/**
		 * The meta object literal for the '<em><b>Primary Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_TABLE_COLUMN__PRIMARY_KEY = eINSTANCE.getSqmlTableColumn_PrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Serial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_TABLE_COLUMN__SERIAL = eINSTANCE.getSqmlTableColumn_Serial();

		/**
		 * The meta object literal for the '<em><b>Base Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_TABLE_COLUMN__BASE_COLUMN = eINSTANCE.getSqmlTableColumn_BaseColumn();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_TABLE_COLUMN__NULLABLE = eINSTANCE.getSqmlTableColumn_Nullable();

		/**
		 * The meta object literal for the '<em><b>Unsigned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_TABLE_COLUMN__UNSIGNED = eINSTANCE.getSqmlTableColumn_Unsigned();

		/**
		 * The meta object literal for the '<em><b>On Delete Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_TABLE_COLUMN__ON_DELETE_ACTION = eINSTANCE.getSqmlTableColumn_OnDeleteAction();

		/**
		 * The meta object literal for the '<em><b>On Update Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_TABLE_COLUMN__ON_UPDATE_ACTION = eINSTANCE.getSqmlTableColumn_OnUpdateAction();

		/**
		 * The meta object literal for the '<em><b>Default Null</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_TABLE_COLUMN__DEFAULT_NULL = eINSTANCE.getSqmlTableColumn_DefaultNull();

		/**
		 * The meta object literal for the '<em><b>Default Now</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_TABLE_COLUMN__DEFAULT_NOW = eINSTANCE.getSqmlTableColumn_DefaultNow();

		/**
		 * The meta object literal for the '<em><b>On Update Now</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_TABLE_COLUMN__ON_UPDATE_NOW = eINSTANCE.getSqmlTableColumn_OnUpdateNow();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_TABLE_COLUMN__TIMESTAMP = eINSTANCE.getSqmlTableColumn_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_TABLE_COLUMN__DEFAULT_VALUE = eINSTANCE.getSqmlTableColumn_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Bits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_TABLE_COLUMN__BITS = eINSTANCE.getSqmlTableColumn_Bits();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_TABLE_COLUMN__PRECISION = eINSTANCE.getSqmlTableColumn_Precision();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_TABLE_COLUMN__SCALE = eINSTANCE.getSqmlTableColumn_Scale();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_TABLE_COLUMN__MAX_LENGTH = eINSTANCE.getSqmlTableColumn_MaxLength();

		/**
		 * The meta object literal for the '<em><b>Length Bits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_TABLE_COLUMN__LENGTH_BITS = eINSTANCE.getSqmlTableColumn_LengthBits();

		/**
		 * The meta object literal for the '<em><b>Character Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_TABLE_COLUMN__CHARACTER_SET = eINSTANCE.getSqmlTableColumn_CharacterSet();

		/**
		 * The meta object literal for the '<em><b>Collation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_TABLE_COLUMN__COLLATION = eINSTANCE.getSqmlTableColumn_Collation();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_TABLE_COLUMN__COMMENT = eINSTANCE.getSqmlTableColumn_Comment();

		/**
		 * The meta object literal for the '<em><b>Constraint Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_TABLE_COLUMN__CONSTRAINT_NAME = eINSTANCE.getSqmlTableColumn_ConstraintName();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.tables.impl.SqmlTableKeyImpl <em>Sqml Table Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.tables.impl.SqmlTableKeyImpl
		 * @see com.softicar.sqml.model.tables.impl.TablesPackageImpl#getSqmlTableKey()
		 * @generated
		 */
		EClass SQML_TABLE_KEY = eINSTANCE.getSqmlTableKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_TABLE_KEY__NAME = eINSTANCE.getSqmlTableKey_Name();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_TABLE_KEY__COLUMNS = eINSTANCE.getSqmlTableKey_Columns();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_TABLE_KEY__TABLE = eINSTANCE.getSqmlTableKey_Table();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.tables.impl.SqmlUniqueKeyImpl <em>Sqml Unique Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.tables.impl.SqmlUniqueKeyImpl
		 * @see com.softicar.sqml.model.tables.impl.TablesPackageImpl#getSqmlUniqueKey()
		 * @generated
		 */
		EClass SQML_UNIQUE_KEY = eINSTANCE.getSqmlUniqueKey();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.tables.impl.SqmlIndexKeyImpl <em>Sqml Index Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.tables.impl.SqmlIndexKeyImpl
		 * @see com.softicar.sqml.model.tables.impl.TablesPackageImpl#getSqmlIndexKey()
		 * @generated
		 */
		EClass SQML_INDEX_KEY = eINSTANCE.getSqmlIndexKey();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.tables.impl.SqmlValueReferenceDefaultValueImpl <em>Sqml Value Reference Default Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.tables.impl.SqmlValueReferenceDefaultValueImpl
		 * @see com.softicar.sqml.model.tables.impl.TablesPackageImpl#getSqmlValueReferenceDefaultValue()
		 * @generated
		 */
		EClass SQML_VALUE_REFERENCE_DEFAULT_VALUE = eINSTANCE.getSqmlValueReferenceDefaultValue();

		/**
		 * The meta object literal for the '<em><b>Value Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_VALUE_REFERENCE_DEFAULT_VALUE__VALUE_REFERENCE = eINSTANCE.getSqmlValueReferenceDefaultValue_ValueReference();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.tables.impl.SqmlTableRowImpl <em>Sqml Table Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.tables.impl.SqmlTableRowImpl
		 * @see com.softicar.sqml.model.tables.impl.TablesPackageImpl#getSqmlTableRow()
		 * @generated
		 */
		EClass SQML_TABLE_ROW = eINSTANCE.getSqmlTableRow();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_TABLE_ROW__TABLE = eINSTANCE.getSqmlTableRow_Table();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_TABLE_ROW__VALUES = eINSTANCE.getSqmlTableRow_Values();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.tables.impl.SqmlTableRowValueImpl <em>Sqml Table Row Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.tables.impl.SqmlTableRowValueImpl
		 * @see com.softicar.sqml.model.tables.impl.TablesPackageImpl#getSqmlTableRowValue()
		 * @generated
		 */
		EClass SQML_TABLE_ROW_VALUE = eINSTANCE.getSqmlTableRowValue();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_TABLE_ROW_VALUE__ROW = eINSTANCE.getSqmlTableRowValue_Row();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_TABLE_ROW_VALUE__LITERAL = eINSTANCE.getSqmlTableRowValue_Literal();

		/**
		 * The meta object literal for the '<em><b>Null</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_TABLE_ROW_VALUE__NULL = eINSTANCE.getSqmlTableRowValue_Null();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.tables.SqmlForeignKeyAction <em>Sqml Foreign Key Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.tables.SqmlForeignKeyAction
		 * @see com.softicar.sqml.model.tables.impl.TablesPackageImpl#getSqmlForeignKeyAction()
		 * @generated
		 */
		EEnum SQML_FOREIGN_KEY_ACTION = eINSTANCE.getSqmlForeignKeyAction();

	}

} //TablesPackage
