/**
 */
package com.softicar.sqml.model.tables.impl;

import com.softicar.sqml.model.files.FilesPackage;

import com.softicar.sqml.model.interfaces.InterfacesPackage;

import com.softicar.sqml.model.tables.SqmlForeignKeyAction;
import com.softicar.sqml.model.tables.SqmlIndexKey;
import com.softicar.sqml.model.tables.SqmlLiteralDefaultValue;
import com.softicar.sqml.model.tables.SqmlRowConstructorDefaultValue;
import com.softicar.sqml.model.tables.SqmlTable;
import com.softicar.sqml.model.tables.SqmlTableColumn;
import com.softicar.sqml.model.tables.SqmlTableKey;
import com.softicar.sqml.model.tables.SqmlTableRow;
import com.softicar.sqml.model.tables.SqmlTableRowValue;
import com.softicar.sqml.model.tables.SqmlUniqueKey;
import com.softicar.sqml.model.tables.SqmlValueReferenceDefaultValue;
import com.softicar.sqml.model.tables.TablesFactory;
import com.softicar.sqml.model.tables.TablesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TablesPackageImpl extends EPackageImpl implements TablesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlLiteralDefaultValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlRowConstructorDefaultValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlTableColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlTableKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlUniqueKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlIndexKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlValueReferenceDefaultValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlTableRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlTableRowValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sqmlForeignKeyActionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.softicar.sqml.model.tables.TablesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TablesPackageImpl() {
		super(eNS_URI, TablesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TablesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TablesPackage init() {
		if (isInited) return (TablesPackage)EPackage.Registry.INSTANCE.getEPackage(TablesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTablesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TablesPackageImpl theTablesPackage = registeredTablesPackage instanceof TablesPackageImpl ? (TablesPackageImpl)registeredTablesPackage : new TablesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		InterfacesPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		FilesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTablesPackage.createPackageContents();

		// Initialize created meta-data
		theTablesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTablesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TablesPackage.eNS_URI, theTablesPackage);
		return theTablesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlLiteralDefaultValue() {
		return sqmlLiteralDefaultValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlLiteralDefaultValue_Minus() {
		return (EAttribute)sqmlLiteralDefaultValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlLiteralDefaultValue_Literal() {
		return (EReference)sqmlLiteralDefaultValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlRowConstructorDefaultValue() {
		return sqmlRowConstructorDefaultValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlRowConstructorDefaultValue_ValueReferences() {
		return (EReference)sqmlRowConstructorDefaultValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlTable() {
		return sqmlTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlTable_EnumTable() {
		return (EAttribute)sqmlTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlTable_PhysicalNameOverride() {
		return (EAttribute)sqmlTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlTable_Columns() {
		return (EReference)sqmlTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlTable_TableKeys() {
		return (EReference)sqmlTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlTable_Enums() {
		return (EReference)sqmlTableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlTable_Rows() {
		return (EReference)sqmlTableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlTableColumn() {
		return sqmlTableColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlTableColumn_Table() {
		return (EReference)sqmlTableColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlTableColumn_Name() {
		return (EAttribute)sqmlTableColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlTableColumn_PhysicalNameOverride() {
		return (EAttribute)sqmlTableColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlTableColumn_TypeReference() {
		return (EReference)sqmlTableColumnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlTableColumn_PrimaryKey() {
		return (EAttribute)sqmlTableColumnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlTableColumn_Serial() {
		return (EAttribute)sqmlTableColumnEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlTableColumn_BaseColumn() {
		return (EAttribute)sqmlTableColumnEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlTableColumn_Nullable() {
		return (EAttribute)sqmlTableColumnEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlTableColumn_Unsigned() {
		return (EAttribute)sqmlTableColumnEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlTableColumn_OnDeleteAction() {
		return (EAttribute)sqmlTableColumnEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlTableColumn_OnUpdateAction() {
		return (EAttribute)sqmlTableColumnEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlTableColumn_DefaultNull() {
		return (EAttribute)sqmlTableColumnEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlTableColumn_DefaultNow() {
		return (EAttribute)sqmlTableColumnEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlTableColumn_OnUpdateNow() {
		return (EAttribute)sqmlTableColumnEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlTableColumn_Timestamp() {
		return (EAttribute)sqmlTableColumnEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlTableColumn_DefaultValue() {
		return (EReference)sqmlTableColumnEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlTableColumn_Bits() {
		return (EAttribute)sqmlTableColumnEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlTableColumn_Precision() {
		return (EAttribute)sqmlTableColumnEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlTableColumn_Scale() {
		return (EAttribute)sqmlTableColumnEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlTableColumn_MaxLength() {
		return (EAttribute)sqmlTableColumnEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlTableColumn_LengthBits() {
		return (EAttribute)sqmlTableColumnEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlTableColumn_CharacterSet() {
		return (EAttribute)sqmlTableColumnEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlTableColumn_Collation() {
		return (EAttribute)sqmlTableColumnEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlTableColumn_Comment() {
		return (EAttribute)sqmlTableColumnEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlTableColumn_ConstraintName() {
		return (EAttribute)sqmlTableColumnEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlTableKey() {
		return sqmlTableKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlTableKey_Name() {
		return (EAttribute)sqmlTableKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlTableKey_Columns() {
		return (EReference)sqmlTableKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlTableKey_Table() {
		return (EReference)sqmlTableKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlUniqueKey() {
		return sqmlUniqueKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlIndexKey() {
		return sqmlIndexKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlValueReferenceDefaultValue() {
		return sqmlValueReferenceDefaultValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlValueReferenceDefaultValue_ValueReference() {
		return (EReference)sqmlValueReferenceDefaultValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlTableRow() {
		return sqmlTableRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlTableRow_Table() {
		return (EReference)sqmlTableRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlTableRow_Values() {
		return (EReference)sqmlTableRowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlTableRowValue() {
		return sqmlTableRowValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlTableRowValue_Row() {
		return (EReference)sqmlTableRowValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlTableRowValue_Literal() {
		return (EReference)sqmlTableRowValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlTableRowValue_Null() {
		return (EAttribute)sqmlTableRowValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSqmlForeignKeyAction() {
		return sqmlForeignKeyActionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TablesFactory getTablesFactory() {
		return (TablesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		sqmlLiteralDefaultValueEClass = createEClass(SQML_LITERAL_DEFAULT_VALUE);
		createEAttribute(sqmlLiteralDefaultValueEClass, SQML_LITERAL_DEFAULT_VALUE__MINUS);
		createEReference(sqmlLiteralDefaultValueEClass, SQML_LITERAL_DEFAULT_VALUE__LITERAL);

		sqmlRowConstructorDefaultValueEClass = createEClass(SQML_ROW_CONSTRUCTOR_DEFAULT_VALUE);
		createEReference(sqmlRowConstructorDefaultValueEClass, SQML_ROW_CONSTRUCTOR_DEFAULT_VALUE__VALUE_REFERENCES);

		sqmlTableEClass = createEClass(SQML_TABLE);
		createEAttribute(sqmlTableEClass, SQML_TABLE__ENUM_TABLE);
		createEAttribute(sqmlTableEClass, SQML_TABLE__PHYSICAL_NAME_OVERRIDE);
		createEReference(sqmlTableEClass, SQML_TABLE__COLUMNS);
		createEReference(sqmlTableEClass, SQML_TABLE__TABLE_KEYS);
		createEReference(sqmlTableEClass, SQML_TABLE__ENUMS);
		createEReference(sqmlTableEClass, SQML_TABLE__ROWS);

		sqmlTableColumnEClass = createEClass(SQML_TABLE_COLUMN);
		createEReference(sqmlTableColumnEClass, SQML_TABLE_COLUMN__TABLE);
		createEAttribute(sqmlTableColumnEClass, SQML_TABLE_COLUMN__NAME);
		createEAttribute(sqmlTableColumnEClass, SQML_TABLE_COLUMN__PHYSICAL_NAME_OVERRIDE);
		createEReference(sqmlTableColumnEClass, SQML_TABLE_COLUMN__TYPE_REFERENCE);
		createEAttribute(sqmlTableColumnEClass, SQML_TABLE_COLUMN__PRIMARY_KEY);
		createEAttribute(sqmlTableColumnEClass, SQML_TABLE_COLUMN__SERIAL);
		createEAttribute(sqmlTableColumnEClass, SQML_TABLE_COLUMN__BASE_COLUMN);
		createEAttribute(sqmlTableColumnEClass, SQML_TABLE_COLUMN__NULLABLE);
		createEAttribute(sqmlTableColumnEClass, SQML_TABLE_COLUMN__UNSIGNED);
		createEAttribute(sqmlTableColumnEClass, SQML_TABLE_COLUMN__ON_DELETE_ACTION);
		createEAttribute(sqmlTableColumnEClass, SQML_TABLE_COLUMN__ON_UPDATE_ACTION);
		createEAttribute(sqmlTableColumnEClass, SQML_TABLE_COLUMN__DEFAULT_NULL);
		createEAttribute(sqmlTableColumnEClass, SQML_TABLE_COLUMN__DEFAULT_NOW);
		createEAttribute(sqmlTableColumnEClass, SQML_TABLE_COLUMN__ON_UPDATE_NOW);
		createEAttribute(sqmlTableColumnEClass, SQML_TABLE_COLUMN__TIMESTAMP);
		createEReference(sqmlTableColumnEClass, SQML_TABLE_COLUMN__DEFAULT_VALUE);
		createEAttribute(sqmlTableColumnEClass, SQML_TABLE_COLUMN__BITS);
		createEAttribute(sqmlTableColumnEClass, SQML_TABLE_COLUMN__PRECISION);
		createEAttribute(sqmlTableColumnEClass, SQML_TABLE_COLUMN__SCALE);
		createEAttribute(sqmlTableColumnEClass, SQML_TABLE_COLUMN__MAX_LENGTH);
		createEAttribute(sqmlTableColumnEClass, SQML_TABLE_COLUMN__LENGTH_BITS);
		createEAttribute(sqmlTableColumnEClass, SQML_TABLE_COLUMN__CHARACTER_SET);
		createEAttribute(sqmlTableColumnEClass, SQML_TABLE_COLUMN__COLLATION);
		createEAttribute(sqmlTableColumnEClass, SQML_TABLE_COLUMN__COMMENT);
		createEAttribute(sqmlTableColumnEClass, SQML_TABLE_COLUMN__CONSTRAINT_NAME);

		sqmlTableKeyEClass = createEClass(SQML_TABLE_KEY);
		createEAttribute(sqmlTableKeyEClass, SQML_TABLE_KEY__NAME);
		createEReference(sqmlTableKeyEClass, SQML_TABLE_KEY__COLUMNS);
		createEReference(sqmlTableKeyEClass, SQML_TABLE_KEY__TABLE);

		sqmlUniqueKeyEClass = createEClass(SQML_UNIQUE_KEY);

		sqmlIndexKeyEClass = createEClass(SQML_INDEX_KEY);

		sqmlValueReferenceDefaultValueEClass = createEClass(SQML_VALUE_REFERENCE_DEFAULT_VALUE);
		createEReference(sqmlValueReferenceDefaultValueEClass, SQML_VALUE_REFERENCE_DEFAULT_VALUE__VALUE_REFERENCE);

		sqmlTableRowEClass = createEClass(SQML_TABLE_ROW);
		createEReference(sqmlTableRowEClass, SQML_TABLE_ROW__TABLE);
		createEReference(sqmlTableRowEClass, SQML_TABLE_ROW__VALUES);

		sqmlTableRowValueEClass = createEClass(SQML_TABLE_ROW_VALUE);
		createEReference(sqmlTableRowValueEClass, SQML_TABLE_ROW_VALUE__ROW);
		createEReference(sqmlTableRowValueEClass, SQML_TABLE_ROW_VALUE__LITERAL);
		createEAttribute(sqmlTableRowValueEClass, SQML_TABLE_ROW_VALUE__NULL);

		// Create enums
		sqmlForeignKeyActionEEnum = createEEnum(SQML_FOREIGN_KEY_ACTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		InterfacesPackage theInterfacesPackage = (InterfacesPackage)EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		FilesPackage theFilesPackage = (FilesPackage)EPackage.Registry.INSTANCE.getEPackage(FilesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sqmlLiteralDefaultValueEClass.getESuperTypes().add(theInterfacesPackage.getISqmlLiteralDefaultValue());
		sqmlRowConstructorDefaultValueEClass.getESuperTypes().add(theInterfacesPackage.getISqmlRowConstructorDefaultValue());
		sqmlTableEClass.getESuperTypes().add(theFilesPackage.getSqmlFileElement());
		sqmlTableEClass.getESuperTypes().add(theInterfacesPackage.getISqmlTable());
		sqmlTableColumnEClass.getESuperTypes().add(theInterfacesPackage.getISqmlTableColumn());
		sqmlTableKeyEClass.getESuperTypes().add(theInterfacesPackage.getISqmlTableKey());
		sqmlUniqueKeyEClass.getESuperTypes().add(this.getSqmlTableKey());
		sqmlUniqueKeyEClass.getESuperTypes().add(theInterfacesPackage.getISqmlUniqueKey());
		sqmlIndexKeyEClass.getESuperTypes().add(this.getSqmlTableKey());
		sqmlIndexKeyEClass.getESuperTypes().add(theInterfacesPackage.getISqmlIndexKey());
		sqmlValueReferenceDefaultValueEClass.getESuperTypes().add(theInterfacesPackage.getISqmlValueReferenceDefaultValue());
		sqmlTableRowEClass.getESuperTypes().add(theInterfacesPackage.getISqmlTableRow());
		sqmlTableRowValueEClass.getESuperTypes().add(theInterfacesPackage.getISqmlTableRowValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(sqmlLiteralDefaultValueEClass, SqmlLiteralDefaultValue.class, "SqmlLiteralDefaultValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlLiteralDefaultValue_Minus(), theEcorePackage.getEBoolean(), "minus", null, 0, 1, SqmlLiteralDefaultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlLiteralDefaultValue_Literal(), theInterfacesPackage.getISqmlLiteral(), null, "literal", null, 0, 1, SqmlLiteralDefaultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlRowConstructorDefaultValueEClass, SqmlRowConstructorDefaultValue.class, "SqmlRowConstructorDefaultValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlRowConstructorDefaultValue_ValueReferences(), theInterfacesPackage.getISqmlValueReference(), null, "valueReferences", null, 0, -1, SqmlRowConstructorDefaultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlTableEClass, SqmlTable.class, "SqmlTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlTable_EnumTable(), theEcorePackage.getEBoolean(), "enumTable", null, 0, 1, SqmlTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlTable_PhysicalNameOverride(), theEcorePackage.getEString(), "physicalNameOverride", null, 0, 1, SqmlTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlTable_Columns(), this.getSqmlTableColumn(), this.getSqmlTableColumn_Table(), "columns", null, 0, -1, SqmlTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlTable_TableKeys(), this.getSqmlTableKey(), this.getSqmlTableKey_Table(), "tableKeys", null, 0, -1, SqmlTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlTable_Enums(), theInterfacesPackage.getISqmlEnum(), null, "enums", null, 0, -1, SqmlTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlTable_Rows(), this.getSqmlTableRow(), this.getSqmlTableRow_Table(), "rows", null, 0, -1, SqmlTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlTableColumnEClass, SqmlTableColumn.class, "SqmlTableColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlTableColumn_Table(), this.getSqmlTable(), this.getSqmlTable_Columns(), "table", null, 0, 1, SqmlTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlTableColumn_Name(), theEcorePackage.getEString(), "name", null, 0, 1, SqmlTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlTableColumn_PhysicalNameOverride(), theEcorePackage.getEString(), "physicalNameOverride", null, 0, 1, SqmlTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlTableColumn_TypeReference(), theInterfacesPackage.getISqmlTypeReference(), null, "typeReference", null, 0, 1, SqmlTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlTableColumn_PrimaryKey(), theEcorePackage.getEBoolean(), "primaryKey", null, 0, 1, SqmlTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlTableColumn_Serial(), theEcorePackage.getEBoolean(), "serial", null, 0, 1, SqmlTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlTableColumn_BaseColumn(), theEcorePackage.getEBoolean(), "baseColumn", null, 0, 1, SqmlTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlTableColumn_Nullable(), theEcorePackage.getEBoolean(), "nullable", null, 0, 1, SqmlTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlTableColumn_Unsigned(), theEcorePackage.getEBoolean(), "unsigned", null, 0, 1, SqmlTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlTableColumn_OnDeleteAction(), this.getSqmlForeignKeyAction(), "onDeleteAction", null, 0, 1, SqmlTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlTableColumn_OnUpdateAction(), this.getSqmlForeignKeyAction(), "onUpdateAction", null, 0, 1, SqmlTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlTableColumn_DefaultNull(), theEcorePackage.getEBoolean(), "defaultNull", null, 0, 1, SqmlTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlTableColumn_DefaultNow(), theEcorePackage.getEBoolean(), "defaultNow", null, 0, 1, SqmlTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlTableColumn_OnUpdateNow(), theEcorePackage.getEBoolean(), "onUpdateNow", null, 0, 1, SqmlTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlTableColumn_Timestamp(), theEcorePackage.getEBoolean(), "timestamp", null, 0, 1, SqmlTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlTableColumn_DefaultValue(), theInterfacesPackage.getISqmlDefaultValue(), null, "defaultValue", null, 0, 1, SqmlTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlTableColumn_Bits(), theEcorePackage.getEIntegerObject(), "bits", null, 0, 1, SqmlTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlTableColumn_Precision(), theEcorePackage.getEIntegerObject(), "precision", null, 0, 1, SqmlTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlTableColumn_Scale(), theEcorePackage.getEIntegerObject(), "scale", null, 0, 1, SqmlTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlTableColumn_MaxLength(), theEcorePackage.getEIntegerObject(), "maxLength", null, 0, 1, SqmlTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlTableColumn_LengthBits(), theEcorePackage.getEIntegerObject(), "lengthBits", null, 0, 1, SqmlTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlTableColumn_CharacterSet(), theEcorePackage.getEString(), "characterSet", null, 0, 1, SqmlTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlTableColumn_Collation(), theEcorePackage.getEString(), "collation", null, 0, 1, SqmlTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlTableColumn_Comment(), theEcorePackage.getEString(), "comment", null, 0, 1, SqmlTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlTableColumn_ConstraintName(), theEcorePackage.getEString(), "constraintName", null, 0, 1, SqmlTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlTableKeyEClass, SqmlTableKey.class, "SqmlTableKey", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlTableKey_Name(), theEcorePackage.getEString(), "name", null, 0, 1, SqmlTableKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlTableKey_Columns(), theInterfacesPackage.getISqmlTableColumn(), null, "columns", null, 0, -1, SqmlTableKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlTableKey_Table(), this.getSqmlTable(), this.getSqmlTable_TableKeys(), "table", null, 0, 1, SqmlTableKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlUniqueKeyEClass, SqmlUniqueKey.class, "SqmlUniqueKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sqmlIndexKeyEClass, SqmlIndexKey.class, "SqmlIndexKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sqmlValueReferenceDefaultValueEClass, SqmlValueReferenceDefaultValue.class, "SqmlValueReferenceDefaultValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlValueReferenceDefaultValue_ValueReference(), theInterfacesPackage.getISqmlValueReference(), null, "valueReference", null, 0, 1, SqmlValueReferenceDefaultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlTableRowEClass, SqmlTableRow.class, "SqmlTableRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlTableRow_Table(), this.getSqmlTable(), this.getSqmlTable_Rows(), "table", null, 0, 1, SqmlTableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlTableRow_Values(), this.getSqmlTableRowValue(), this.getSqmlTableRowValue_Row(), "values", null, 0, -1, SqmlTableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlTableRowValueEClass, SqmlTableRowValue.class, "SqmlTableRowValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlTableRowValue_Row(), this.getSqmlTableRow(), this.getSqmlTableRow_Values(), "row", null, 0, 1, SqmlTableRowValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlTableRowValue_Literal(), theInterfacesPackage.getISqmlLiteral(), null, "literal", null, 0, 1, SqmlTableRowValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlTableRowValue_Null(), theEcorePackage.getEBoolean(), "null", null, 0, 1, SqmlTableRowValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(sqmlForeignKeyActionEEnum, SqmlForeignKeyAction.class, "SqmlForeignKeyAction");
		addEEnumLiteral(sqmlForeignKeyActionEEnum, SqmlForeignKeyAction.UNDEFINED);
		addEEnumLiteral(sqmlForeignKeyActionEEnum, SqmlForeignKeyAction.CASCADE);
		addEEnumLiteral(sqmlForeignKeyActionEEnum, SqmlForeignKeyAction.NO_ACTION);
		addEEnumLiteral(sqmlForeignKeyActionEEnum, SqmlForeignKeyAction.RESTRICT);
		addEEnumLiteral(sqmlForeignKeyActionEEnum, SqmlForeignKeyAction.SET_DEFAULT);
		addEEnumLiteral(sqmlForeignKeyActionEEnum, SqmlForeignKeyAction.SET_NULL);

		// Create resource
		createResource(eNS_URI);
	}

} //TablesPackageImpl
