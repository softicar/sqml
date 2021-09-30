/**
 */
package com.softicar.sqml.model.queries.impl;

import com.softicar.sqml.model.queries.*;

import org.eclipse.emf.ecore.EClass;
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
public class QueriesFactoryImpl extends EFactoryImpl implements QueriesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QueriesFactory init() {
		try {
			QueriesFactory theQueriesFactory = (QueriesFactory)EPackage.Registry.INSTANCE.getEFactory(QueriesPackage.eNS_URI);
			if (theQueriesFactory != null) {
				return theQueriesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QueriesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueriesFactoryImpl() {
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
			case QueriesPackage.SQML_QUERY: return createSqmlQuery();
			case QueriesPackage.SQML_QUERY_PARAMETER: return createSqmlQueryParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlQuery createSqmlQuery() {
		SqmlQueryImpl sqmlQuery = new SqmlQueryImpl();
		return sqmlQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlQueryParameter createSqmlQueryParameter() {
		SqmlQueryParameterImpl sqmlQueryParameter = new SqmlQueryParameterImpl();
		return sqmlQueryParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueriesPackage getQueriesPackage() {
		return (QueriesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QueriesPackage getPackage() {
		return QueriesPackage.eINSTANCE;
	}

} //QueriesFactoryImpl
