/**
 */
package com.softicar.sqml.model.externals.impl;

import com.softicar.platform.common.code.java.JavaClass;

import com.softicar.platform.common.core.java.classes.name.JavaClassName;

import com.softicar.platform.common.core.java.packages.name.JavaPackageName;

import com.softicar.platform.db.core.table.DbTableName;

import com.softicar.platform.db.sql.token.SqlKeyword;
import com.softicar.platform.db.sql.token.SqlSymbol;

import com.softicar.platform.db.sql.type.SqlFieldType;

import com.softicar.sqml.model.externals.ExternalsFactory;
import com.softicar.sqml.model.externals.ExternalsPackage;

import com.softicar.sqml.model.generation.ISqmlSelectGenerator;

import com.softicar.sqml.model.utils.ISqmlJavaType;

import java.math.BigDecimal;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.naming.QualifiedName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalsPackageImpl extends EPackageImpl implements ExternalsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bigDecimalEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType collectionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iSqmlJavaTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iSqmlSelectGeneratorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaClassEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaClassNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaPackageNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType qualifiedNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sqlFieldTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sqlKeywordEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sqlSymbolEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dbTableNameEDataType = null;

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
	 * @see com.softicar.sqml.model.externals.ExternalsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExternalsPackageImpl() {
		super(eNS_URI, ExternalsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExternalsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExternalsPackage init() {
		if (isInited) return (ExternalsPackage)EPackage.Registry.INSTANCE.getEPackage(ExternalsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredExternalsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ExternalsPackageImpl theExternalsPackage = registeredExternalsPackage instanceof ExternalsPackageImpl ? (ExternalsPackageImpl)registeredExternalsPackage : new ExternalsPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theExternalsPackage.createPackageContents();

		// Initialize created meta-data
		theExternalsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExternalsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExternalsPackage.eNS_URI, theExternalsPackage);
		return theExternalsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBigDecimal() {
		return bigDecimalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCollection() {
		return collectionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getISqmlJavaType() {
		return iSqmlJavaTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getISqmlSelectGenerator() {
		return iSqmlSelectGeneratorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaClass() {
		return javaClassEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaClassName() {
		return javaClassNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaPackageName() {
		return javaPackageNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getList() {
		return listEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getQualifiedName() {
		return qualifiedNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSqlFieldType() {
		return sqlFieldTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSqlKeyword() {
		return sqlKeywordEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSqlSymbol() {
		return sqlSymbolEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDbTableName() {
		return dbTableNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalsFactory getExternalsFactory() {
		return (ExternalsFactory)getEFactoryInstance();
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

		// Create data types
		bigDecimalEDataType = createEDataType(BIG_DECIMAL);
		collectionEDataType = createEDataType(COLLECTION);
		iSqmlJavaTypeEDataType = createEDataType(ISQML_JAVA_TYPE);
		iSqmlSelectGeneratorEDataType = createEDataType(ISQML_SELECT_GENERATOR);
		javaClassEDataType = createEDataType(JAVA_CLASS);
		javaClassNameEDataType = createEDataType(JAVA_CLASS_NAME);
		javaPackageNameEDataType = createEDataType(JAVA_PACKAGE_NAME);
		listEDataType = createEDataType(LIST);
		qualifiedNameEDataType = createEDataType(QUALIFIED_NAME);
		sqlFieldTypeEDataType = createEDataType(SQL_FIELD_TYPE);
		sqlKeywordEDataType = createEDataType(SQL_KEYWORD);
		sqlSymbolEDataType = createEDataType(SQL_SYMBOL);
		dbTableNameEDataType = createEDataType(DB_TABLE_NAME);
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

		// Initialize data types
		initEDataType(bigDecimalEDataType, BigDecimal.class, "BigDecimal", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(collectionEDataType, Collection.class, "Collection", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iSqmlJavaTypeEDataType, ISqmlJavaType.class, "ISqmlJavaType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iSqmlSelectGeneratorEDataType, ISqmlSelectGenerator.class, "ISqmlSelectGenerator", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaClassEDataType, JavaClass.class, "JavaClass", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaClassNameEDataType, JavaClassName.class, "JavaClassName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaPackageNameEDataType, JavaPackageName.class, "JavaPackageName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(qualifiedNameEDataType, QualifiedName.class, "QualifiedName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sqlFieldTypeEDataType, SqlFieldType.class, "SqlFieldType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sqlKeywordEDataType, SqlKeyword.class, "SqlKeyword", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sqlSymbolEDataType, SqlSymbol.class, "SqlSymbol", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dbTableNameEDataType, DbTableName.class, "DbTableName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ExternalsPackageImpl
