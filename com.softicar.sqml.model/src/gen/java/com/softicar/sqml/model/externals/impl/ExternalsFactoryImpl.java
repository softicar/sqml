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

import com.softicar.sqml.model.externals.*;

import com.softicar.sqml.model.generation.ISqmlSelectGenerator;

import com.softicar.sqml.model.utils.ISqmlJavaType;

import java.math.BigDecimal;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xtext.naming.QualifiedName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalsFactoryImpl extends EFactoryImpl implements ExternalsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExternalsFactory init() {
		try {
			ExternalsFactory theExternalsFactory = (ExternalsFactory)EPackage.Registry.INSTANCE.getEFactory(ExternalsPackage.eNS_URI);
			if (theExternalsFactory != null) {
				return theExternalsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExternalsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalsFactoryImpl() {
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
			case ExternalsPackage.BIG_DECIMAL:
				return createBigDecimalFromString(eDataType, initialValue);
			case ExternalsPackage.COLLECTION:
				return createCollectionFromString(eDataType, initialValue);
			case ExternalsPackage.ISQML_JAVA_TYPE:
				return createISqmlJavaTypeFromString(eDataType, initialValue);
			case ExternalsPackage.ISQML_SELECT_GENERATOR:
				return createISqmlSelectGeneratorFromString(eDataType, initialValue);
			case ExternalsPackage.JAVA_CLASS:
				return createJavaClassFromString(eDataType, initialValue);
			case ExternalsPackage.JAVA_CLASS_NAME:
				return createJavaClassNameFromString(eDataType, initialValue);
			case ExternalsPackage.JAVA_PACKAGE_NAME:
				return createJavaPackageNameFromString(eDataType, initialValue);
			case ExternalsPackage.LIST:
				return createListFromString(eDataType, initialValue);
			case ExternalsPackage.QUALIFIED_NAME:
				return createQualifiedNameFromString(eDataType, initialValue);
			case ExternalsPackage.SQL_FIELD_TYPE:
				return createSqlFieldTypeFromString(eDataType, initialValue);
			case ExternalsPackage.SQL_KEYWORD:
				return createSqlKeywordFromString(eDataType, initialValue);
			case ExternalsPackage.SQL_SYMBOL:
				return createSqlSymbolFromString(eDataType, initialValue);
			case ExternalsPackage.DB_TABLE_NAME:
				return createDbTableNameFromString(eDataType, initialValue);
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
			case ExternalsPackage.BIG_DECIMAL:
				return convertBigDecimalToString(eDataType, instanceValue);
			case ExternalsPackage.COLLECTION:
				return convertCollectionToString(eDataType, instanceValue);
			case ExternalsPackage.ISQML_JAVA_TYPE:
				return convertISqmlJavaTypeToString(eDataType, instanceValue);
			case ExternalsPackage.ISQML_SELECT_GENERATOR:
				return convertISqmlSelectGeneratorToString(eDataType, instanceValue);
			case ExternalsPackage.JAVA_CLASS:
				return convertJavaClassToString(eDataType, instanceValue);
			case ExternalsPackage.JAVA_CLASS_NAME:
				return convertJavaClassNameToString(eDataType, instanceValue);
			case ExternalsPackage.JAVA_PACKAGE_NAME:
				return convertJavaPackageNameToString(eDataType, instanceValue);
			case ExternalsPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case ExternalsPackage.QUALIFIED_NAME:
				return convertQualifiedNameToString(eDataType, instanceValue);
			case ExternalsPackage.SQL_FIELD_TYPE:
				return convertSqlFieldTypeToString(eDataType, instanceValue);
			case ExternalsPackage.SQL_KEYWORD:
				return convertSqlKeywordToString(eDataType, instanceValue);
			case ExternalsPackage.SQL_SYMBOL:
				return convertSqlSymbolToString(eDataType, instanceValue);
			case ExternalsPackage.DB_TABLE_NAME:
				return convertDbTableNameToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createBigDecimalFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBigDecimalToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<?> createCollectionFromString(EDataType eDataType, String initialValue) {
		return (Collection<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCollectionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISqmlJavaType createISqmlJavaTypeFromString(EDataType eDataType, String initialValue) {
		return (ISqmlJavaType)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertISqmlJavaTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISqmlSelectGenerator createISqmlSelectGeneratorFromString(EDataType eDataType, String initialValue) {
		return (ISqmlSelectGenerator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertISqmlSelectGeneratorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaClass createJavaClassFromString(EDataType eDataType, String initialValue) {
		return (JavaClass)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaClassToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaClassName createJavaClassNameFromString(EDataType eDataType, String initialValue) {
		return (JavaClassName)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaClassNameToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaPackageName createJavaPackageNameFromString(EDataType eDataType, String initialValue) {
		return (JavaPackageName)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaPackageNameToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<?> createListFromString(EDataType eDataType, String initialValue) {
		return (List<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedName createQualifiedNameFromString(EDataType eDataType, String initialValue) {
		return (QualifiedName)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQualifiedNameToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlFieldType createSqlFieldTypeFromString(EDataType eDataType, String initialValue) {
		return (SqlFieldType)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSqlFieldTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlKeyword createSqlKeywordFromString(EDataType eDataType, String initialValue) {
		return (SqlKeyword)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSqlKeywordToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlSymbol createSqlSymbolFromString(EDataType eDataType, String initialValue) {
		return (SqlSymbol)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSqlSymbolToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbTableName createDbTableNameFromString(EDataType eDataType, String initialValue) {
		return (DbTableName)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbTableNameToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalsPackage getExternalsPackage() {
		return (ExternalsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExternalsPackage getPackage() {
		return ExternalsPackage.eINSTANCE;
	}

} //ExternalsFactoryImpl
