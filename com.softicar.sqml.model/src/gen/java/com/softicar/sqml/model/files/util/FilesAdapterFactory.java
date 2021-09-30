/**
 */
package com.softicar.sqml.model.files.util;

import com.softicar.sqml.model.ISqmlGlobalObject;
import com.softicar.sqml.model.ISqmlModelElement;

import com.softicar.sqml.model.files.*;

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
 * @see com.softicar.sqml.model.files.FilesPackage
 * @generated
 */
public class FilesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FilesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FilesPackage.eINSTANCE;
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
	protected FilesSwitch<Adapter> modelSwitch =
		new FilesSwitch<Adapter>() {
			@Override
			public Adapter caseSqmlFile(SqmlFile object) {
				return createSqmlFileAdapter();
			}
			@Override
			public Adapter caseSqmlPackageDeclaration(SqmlPackageDeclaration object) {
				return createSqmlPackageDeclarationAdapter();
			}
			@Override
			public Adapter caseSqmlImport(SqmlImport object) {
				return createSqmlImportAdapter();
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
			public Adapter caseISqmlFile(ISqmlFile object) {
				return createISqmlFileAdapter();
			}
			@Override
			public Adapter caseISqmlPackageDeclaration(ISqmlPackageDeclaration object) {
				return createISqmlPackageDeclarationAdapter();
			}
			@Override
			public Adapter caseISqmlModelElement(ISqmlModelElement object) {
				return createISqmlModelElementAdapter();
			}
			@Override
			public Adapter caseISqmlImport(ISqmlImport object) {
				return createISqmlImportAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.files.SqmlFile <em>Sqml File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.files.SqmlFile
	 * @generated
	 */
	public Adapter createSqmlFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.files.SqmlPackageDeclaration <em>Sqml Package Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.files.SqmlPackageDeclaration
	 * @generated
	 */
	public Adapter createSqmlPackageDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.files.SqmlImport <em>Sqml Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.files.SqmlImport
	 * @generated
	 */
	public Adapter createSqmlImportAdapter() {
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
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.files.ISqmlFile <em>ISqml File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.files.ISqmlFile
	 * @generated
	 */
	public Adapter createISqmlFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.files.ISqmlPackageDeclaration <em>ISqml Package Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.files.ISqmlPackageDeclaration
	 * @generated
	 */
	public Adapter createISqmlPackageDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.ISqmlModelElement <em>ISqml Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.ISqmlModelElement
	 * @generated
	 */
	public Adapter createISqmlModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.files.ISqmlImport <em>ISqml Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.files.ISqmlImport
	 * @generated
	 */
	public Adapter createISqmlImportAdapter() {
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

} //FilesAdapterFactory
