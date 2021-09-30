/**
 */
package com.softicar.sqml.model.types.util;

import com.softicar.sqml.model.ISqmlGlobalObject;
import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.ISqmlValue;

import com.softicar.sqml.model.files.ISqmlFileElement;
import com.softicar.sqml.model.files.SqmlFileElement;

import com.softicar.sqml.model.types.*;

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
 * @see com.softicar.sqml.model.types.TypesPackage
 * @generated
 */
public class TypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TypesPackage.eINSTANCE;
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
	protected TypesSwitch<Adapter> modelSwitch =
		new TypesSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractSqmlTypeDefinition(AbstractSqmlTypeDefinition object) {
				return createAbstractSqmlTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseSqmlValueType(SqmlValueType object) {
				return createSqmlValueTypeAdapter();
			}
			@Override
			public Adapter caseSqmlEnum(SqmlEnum object) {
				return createSqmlEnumAdapter();
			}
			@Override
			public Adapter caseSqmlEnumerator(SqmlEnumerator object) {
				return createSqmlEnumeratorAdapter();
			}
			@Override
			public Adapter caseSqmlTypeReference(SqmlTypeReference object) {
				return createSqmlTypeReferenceAdapter();
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
			public Adapter caseISqmlType(ISqmlType object) {
				return createISqmlTypeAdapter();
			}
			@Override
			public Adapter caseISqmlModelElement(ISqmlModelElement object) {
				return createISqmlModelElementAdapter();
			}
			@Override
			public Adapter caseISqmlTypeDefinition(ISqmlTypeDefinition object) {
				return createISqmlTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseISqmlTopLevelTypeDefinition(ISqmlTopLevelTypeDefinition object) {
				return createISqmlTopLevelTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseISqmlValueType(ISqmlValueType object) {
				return createISqmlValueTypeAdapter();
			}
			@Override
			public Adapter caseISqmlEnum(ISqmlEnum object) {
				return createISqmlEnumAdapter();
			}
			@Override
			public Adapter caseISqmlValidatable(ISqmlValidatable object) {
				return createISqmlValidatableAdapter();
			}
			@Override
			public Adapter caseISqmlValue(ISqmlValue object) {
				return createISqmlValueAdapter();
			}
			@Override
			public Adapter caseISqmlEnumerator(ISqmlEnumerator object) {
				return createISqmlEnumeratorAdapter();
			}
			@Override
			public Adapter caseISqmlTypeReference(ISqmlTypeReference object) {
				return createISqmlTypeReferenceAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.types.AbstractSqmlTypeDefinition <em>Abstract Sqml Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.types.AbstractSqmlTypeDefinition
	 * @generated
	 */
	public Adapter createAbstractSqmlTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.types.SqmlValueType <em>Sqml Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.types.SqmlValueType
	 * @generated
	 */
	public Adapter createSqmlValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.types.SqmlEnum <em>Sqml Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.types.SqmlEnum
	 * @generated
	 */
	public Adapter createSqmlEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.types.SqmlEnumerator <em>Sqml Enumerator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.types.SqmlEnumerator
	 * @generated
	 */
	public Adapter createSqmlEnumeratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.types.SqmlTypeReference <em>Sqml Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.types.SqmlTypeReference
	 * @generated
	 */
	public Adapter createSqmlTypeReferenceAdapter() {
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
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.types.ISqmlType <em>ISqml Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.types.ISqmlType
	 * @generated
	 */
	public Adapter createISqmlTypeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.types.ISqmlTypeDefinition <em>ISqml Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.types.ISqmlTypeDefinition
	 * @generated
	 */
	public Adapter createISqmlTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.types.ISqmlTopLevelTypeDefinition <em>ISqml Top Level Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.types.ISqmlTopLevelTypeDefinition
	 * @generated
	 */
	public Adapter createISqmlTopLevelTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.types.ISqmlValueType <em>ISqml Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.types.ISqmlValueType
	 * @generated
	 */
	public Adapter createISqmlValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.types.ISqmlEnum <em>ISqml Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.types.ISqmlEnum
	 * @generated
	 */
	public Adapter createISqmlEnumAdapter() {
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
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.ISqmlValue <em>ISqml Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.ISqmlValue
	 * @generated
	 */
	public Adapter createISqmlValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.types.ISqmlEnumerator <em>ISqml Enumerator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.types.ISqmlEnumerator
	 * @generated
	 */
	public Adapter createISqmlEnumeratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.types.ISqmlTypeReference <em>ISqml Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.types.ISqmlTypeReference
	 * @generated
	 */
	public Adapter createISqmlTypeReferenceAdapter() {
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

} //TypesAdapterFactory
