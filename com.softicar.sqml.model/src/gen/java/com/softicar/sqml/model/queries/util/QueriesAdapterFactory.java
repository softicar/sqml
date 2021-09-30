/**
 */
package com.softicar.sqml.model.queries.util;

import com.softicar.sqml.model.ISqmlGlobalObject;
import com.softicar.sqml.model.ISqmlStaticVariable;

import com.softicar.sqml.model.files.ISqmlFileElement;
import com.softicar.sqml.model.files.SqmlFileElement;

import com.softicar.sqml.model.queries.*;

import com.softicar.sqml.model.validation.ISqmlValidatable;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.softicar.sqml.model.queries.QueriesPackage
 * @generated
 */
public class QueriesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QueriesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueriesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QueriesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueriesSwitch<Adapter> modelSwitch =
		new QueriesSwitch<Adapter>() {
			@Override
			public Adapter caseSqmlQuery(SqmlQuery object) {
				return createSqmlQueryAdapter();
			}
			@Override
			public Adapter caseSqmlQueryParameter(SqmlQueryParameter object) {
				return createSqmlQueryParameterAdapter();
			}
			@Override
			public Adapter caseISqmlGlobalObject(ISqmlGlobalObject object) {
				return createISqmlGlobalObjectAdapter();
			}
			@Override
			public Adapter caseISqmlFileElement(ISqmlFileElement object) {
				return createISqmlFileElementAdapter();
			}
			@Override
			public Adapter caseSqmlFileElement(SqmlFileElement object) {
				return createSqmlFileElementAdapter();
			}
			@Override
			public Adapter caseISqmlValidatable(ISqmlValidatable object) {
				return createISqmlValidatableAdapter();
			}
			@Override
			public Adapter caseISqmlQuery(ISqmlQuery object) {
				return createISqmlQueryAdapter();
			}
			@Override
			public Adapter caseISqmlStaticVariable(ISqmlStaticVariable object) {
				return createISqmlStaticVariableAdapter();
			}
			@Override
			public Adapter caseISqmlQueryParameter(ISqmlQueryParameter object) {
				return createISqmlQueryParameterAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.queries.SqmlQuery <em>Sqml Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.queries.SqmlQuery
	 * @generated
	 */
	public Adapter createSqmlQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.queries.SqmlQueryParameter <em>Sqml Query Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.queries.SqmlQueryParameter
	 * @generated
	 */
	public Adapter createSqmlQueryParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.ISqmlGlobalObject <em>ISqml Global Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.ISqmlGlobalObject
	 * @generated
	 */
	public Adapter createISqmlGlobalObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.files.ISqmlFileElement <em>ISqml File Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.files.ISqmlFileElement
	 * @generated
	 */
	public Adapter createISqmlFileElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.files.SqmlFileElement <em>Sqml File Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.files.SqmlFileElement
	 * @generated
	 */
	public Adapter createSqmlFileElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.validation.ISqmlValidatable <em>ISqml Validatable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.validation.ISqmlValidatable
	 * @generated
	 */
	public Adapter createISqmlValidatableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.queries.ISqmlQuery <em>ISqml Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.queries.ISqmlQuery
	 * @generated
	 */
	public Adapter createISqmlQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.ISqmlStaticVariable <em>ISqml Static Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.ISqmlStaticVariable
	 * @generated
	 */
	public Adapter createISqmlStaticVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.queries.ISqmlQueryParameter <em>ISqml Query Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.queries.ISqmlQueryParameter
	 * @generated
	 */
	public Adapter createISqmlQueryParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //QueriesAdapterFactory
