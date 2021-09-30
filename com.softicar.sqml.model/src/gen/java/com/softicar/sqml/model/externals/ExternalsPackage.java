/**
 */
package com.softicar.sqml.model.externals;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

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
 * @see com.softicar.sqml.model.externals.ExternalsFactory
 * @model kind="package"
 * @generated
 */
public interface ExternalsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "externals";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "com.softicar.sqml.model.externals";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "externals";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExternalsPackage eINSTANCE = com.softicar.sqml.model.externals.impl.ExternalsPackageImpl.init();

	/**
	 * The meta object id for the '<em>Big Decimal</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.softicar.sqml.model.externals.impl.ExternalsPackageImpl#getBigDecimal()
	 * @generated
	 */
	int BIG_DECIMAL = 0;

	/**
	 * The meta object id for the '<em>Collection</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Collection
	 * @see com.softicar.sqml.model.externals.impl.ExternalsPackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 1;

	/**
	 * The meta object id for the '<em>ISqml Java Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.utils.ISqmlJavaType
	 * @see com.softicar.sqml.model.externals.impl.ExternalsPackageImpl#getISqmlJavaType()
	 * @generated
	 */
	int ISQML_JAVA_TYPE = 2;

	/**
	 * The meta object id for the '<em>ISqml Select Generator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.generation.ISqmlSelectGenerator
	 * @see com.softicar.sqml.model.externals.impl.ExternalsPackageImpl#getISqmlSelectGenerator()
	 * @generated
	 */
	int ISQML_SELECT_GENERATOR = 3;

	/**
	 * The meta object id for the '<em>Java Class</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.platform.common.code.java.JavaClass
	 * @see com.softicar.sqml.model.externals.impl.ExternalsPackageImpl#getJavaClass()
	 * @generated
	 */
	int JAVA_CLASS = 4;

	/**
	 * The meta object id for the '<em>Java Class Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.platform.common.core.java.classes.name.JavaClassName
	 * @see com.softicar.sqml.model.externals.impl.ExternalsPackageImpl#getJavaClassName()
	 * @generated
	 */
	int JAVA_CLASS_NAME = 5;

	/**
	 * The meta object id for the '<em>Java Package Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.platform.common.core.java.packages.name.JavaPackageName
	 * @see com.softicar.sqml.model.externals.impl.ExternalsPackageImpl#getJavaPackageName()
	 * @generated
	 */
	int JAVA_PACKAGE_NAME = 6;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see com.softicar.sqml.model.externals.impl.ExternalsPackageImpl#getList()
	 * @generated
	 */
	int LIST = 7;

	/**
	 * The meta object id for the '<em>Qualified Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.naming.QualifiedName
	 * @see com.softicar.sqml.model.externals.impl.ExternalsPackageImpl#getQualifiedName()
	 * @generated
	 */
	int QUALIFIED_NAME = 8;

	/**
	 * The meta object id for the '<em>Sql Field Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.platform.db.sql.type.SqlFieldType
	 * @see com.softicar.sqml.model.externals.impl.ExternalsPackageImpl#getSqlFieldType()
	 * @generated
	 */
	int SQL_FIELD_TYPE = 9;

	/**
	 * The meta object id for the '<em>Sql Keyword</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.platform.db.sql.token.SqlKeyword
	 * @see com.softicar.sqml.model.externals.impl.ExternalsPackageImpl#getSqlKeyword()
	 * @generated
	 */
	int SQL_KEYWORD = 10;

	/**
	 * The meta object id for the '<em>Sql Symbol</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.platform.db.sql.token.SqlSymbol
	 * @see com.softicar.sqml.model.externals.impl.ExternalsPackageImpl#getSqlSymbol()
	 * @generated
	 */
	int SQL_SYMBOL = 11;

	/**
	 * The meta object id for the '<em>Db Table Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.platform.db.core.table.DbTableName
	 * @see com.softicar.sqml.model.externals.impl.ExternalsPackageImpl#getDbTableName()
	 * @generated
	 */
	int DB_TABLE_NAME = 12;


	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Big Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Big Decimal</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 * @generated
	 */
	EDataType getBigDecimal();

	/**
	 * Returns the meta object for data type '{@link java.util.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Collection</em>'.
	 * @see java.util.Collection
	 * @model instanceClass="java.util.Collection" typeParameters="T"
	 * @generated
	 */
	EDataType getCollection();

	/**
	 * Returns the meta object for data type '{@link com.softicar.sqml.model.utils.ISqmlJavaType <em>ISqml Java Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ISqml Java Type</em>'.
	 * @see com.softicar.sqml.model.utils.ISqmlJavaType
	 * @model instanceClass="com.softicar.sqml.model.utils.ISqmlJavaType"
	 * @generated
	 */
	EDataType getISqmlJavaType();

	/**
	 * Returns the meta object for data type '{@link com.softicar.sqml.model.generation.ISqmlSelectGenerator <em>ISqml Select Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ISqml Select Generator</em>'.
	 * @see com.softicar.sqml.model.generation.ISqmlSelectGenerator
	 * @model instanceClass="com.softicar.sqml.model.generation.ISqmlSelectGenerator"
	 * @generated
	 */
	EDataType getISqmlSelectGenerator();

	/**
	 * Returns the meta object for data type '{@link com.softicar.platform.common.code.java.JavaClass <em>Java Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Class</em>'.
	 * @see com.softicar.platform.common.code.java.JavaClass
	 * @model instanceClass="com.softicar.platform.common.code.java.JavaClass"
	 * @generated
	 */
	EDataType getJavaClass();

	/**
	 * Returns the meta object for data type '{@link com.softicar.platform.common.core.java.classes.name.JavaClassName <em>Java Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Class Name</em>'.
	 * @see com.softicar.platform.common.core.java.classes.name.JavaClassName
	 * @model instanceClass="com.softicar.platform.common.core.java.classes.name.JavaClassName"
	 * @generated
	 */
	EDataType getJavaClassName();

	/**
	 * Returns the meta object for data type '{@link com.softicar.platform.common.core.java.packages.name.JavaPackageName <em>Java Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Package Name</em>'.
	 * @see com.softicar.platform.common.core.java.packages.name.JavaPackageName
	 * @model instanceClass="com.softicar.platform.common.core.java.packages.name.JavaPackageName"
	 * @generated
	 */
	EDataType getJavaPackageName();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List" typeParameters="T"
	 * @generated
	 */
	EDataType getList();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.xtext.naming.QualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Qualified Name</em>'.
	 * @see org.eclipse.xtext.naming.QualifiedName
	 * @model instanceClass="org.eclipse.xtext.naming.QualifiedName"
	 * @generated
	 */
	EDataType getQualifiedName();

	/**
	 * Returns the meta object for data type '{@link com.softicar.platform.db.sql.type.SqlFieldType <em>Sql Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sql Field Type</em>'.
	 * @see com.softicar.platform.db.sql.type.SqlFieldType
	 * @model instanceClass="com.softicar.platform.db.sql.type.SqlFieldType"
	 * @generated
	 */
	EDataType getSqlFieldType();

	/**
	 * Returns the meta object for data type '{@link com.softicar.platform.db.sql.token.SqlKeyword <em>Sql Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sql Keyword</em>'.
	 * @see com.softicar.platform.db.sql.token.SqlKeyword
	 * @model instanceClass="com.softicar.platform.db.sql.token.SqlKeyword"
	 * @generated
	 */
	EDataType getSqlKeyword();

	/**
	 * Returns the meta object for data type '{@link com.softicar.platform.db.sql.token.SqlSymbol <em>Sql Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sql Symbol</em>'.
	 * @see com.softicar.platform.db.sql.token.SqlSymbol
	 * @model instanceClass="com.softicar.platform.db.sql.token.SqlSymbol"
	 * @generated
	 */
	EDataType getSqlSymbol();

	/**
	 * Returns the meta object for data type '{@link com.softicar.platform.db.core.table.DbTableName <em>Db Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Db Table Name</em>'.
	 * @see com.softicar.platform.db.core.table.DbTableName
	 * @model instanceClass="com.softicar.platform.db.core.table.DbTableName"
	 * @generated
	 */
	EDataType getDbTableName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExternalsFactory getExternalsFactory();

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
		 * The meta object literal for the '<em>Big Decimal</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.softicar.sqml.model.externals.impl.ExternalsPackageImpl#getBigDecimal()
		 * @generated
		 */
		EDataType BIG_DECIMAL = eINSTANCE.getBigDecimal();

		/**
		 * The meta object literal for the '<em>Collection</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Collection
		 * @see com.softicar.sqml.model.externals.impl.ExternalsPackageImpl#getCollection()
		 * @generated
		 */
		EDataType COLLECTION = eINSTANCE.getCollection();

		/**
		 * The meta object literal for the '<em>ISqml Java Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.utils.ISqmlJavaType
		 * @see com.softicar.sqml.model.externals.impl.ExternalsPackageImpl#getISqmlJavaType()
		 * @generated
		 */
		EDataType ISQML_JAVA_TYPE = eINSTANCE.getISqmlJavaType();

		/**
		 * The meta object literal for the '<em>ISqml Select Generator</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.generation.ISqmlSelectGenerator
		 * @see com.softicar.sqml.model.externals.impl.ExternalsPackageImpl#getISqmlSelectGenerator()
		 * @generated
		 */
		EDataType ISQML_SELECT_GENERATOR = eINSTANCE.getISqmlSelectGenerator();

		/**
		 * The meta object literal for the '<em>Java Class</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.platform.common.code.java.JavaClass
		 * @see com.softicar.sqml.model.externals.impl.ExternalsPackageImpl#getJavaClass()
		 * @generated
		 */
		EDataType JAVA_CLASS = eINSTANCE.getJavaClass();

		/**
		 * The meta object literal for the '<em>Java Class Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.platform.common.core.java.classes.name.JavaClassName
		 * @see com.softicar.sqml.model.externals.impl.ExternalsPackageImpl#getJavaClassName()
		 * @generated
		 */
		EDataType JAVA_CLASS_NAME = eINSTANCE.getJavaClassName();

		/**
		 * The meta object literal for the '<em>Java Package Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.platform.common.core.java.packages.name.JavaPackageName
		 * @see com.softicar.sqml.model.externals.impl.ExternalsPackageImpl#getJavaPackageName()
		 * @generated
		 */
		EDataType JAVA_PACKAGE_NAME = eINSTANCE.getJavaPackageName();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see com.softicar.sqml.model.externals.impl.ExternalsPackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em>Qualified Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.naming.QualifiedName
		 * @see com.softicar.sqml.model.externals.impl.ExternalsPackageImpl#getQualifiedName()
		 * @generated
		 */
		EDataType QUALIFIED_NAME = eINSTANCE.getQualifiedName();

		/**
		 * The meta object literal for the '<em>Sql Field Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.platform.db.sql.type.SqlFieldType
		 * @see com.softicar.sqml.model.externals.impl.ExternalsPackageImpl#getSqlFieldType()
		 * @generated
		 */
		EDataType SQL_FIELD_TYPE = eINSTANCE.getSqlFieldType();

		/**
		 * The meta object literal for the '<em>Sql Keyword</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.platform.db.sql.token.SqlKeyword
		 * @see com.softicar.sqml.model.externals.impl.ExternalsPackageImpl#getSqlKeyword()
		 * @generated
		 */
		EDataType SQL_KEYWORD = eINSTANCE.getSqlKeyword();

		/**
		 * The meta object literal for the '<em>Sql Symbol</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.platform.db.sql.token.SqlSymbol
		 * @see com.softicar.sqml.model.externals.impl.ExternalsPackageImpl#getSqlSymbol()
		 * @generated
		 */
		EDataType SQL_SYMBOL = eINSTANCE.getSqlSymbol();

		/**
		 * The meta object literal for the '<em>Db Table Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.platform.db.core.table.DbTableName
		 * @see com.softicar.sqml.model.externals.impl.ExternalsPackageImpl#getDbTableName()
		 * @generated
		 */
		EDataType DB_TABLE_NAME = eINSTANCE.getDbTableName();

	}

} //ExternalsPackage
