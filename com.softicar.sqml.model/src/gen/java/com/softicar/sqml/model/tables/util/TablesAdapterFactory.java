/**
 */
package com.softicar.sqml.model.tables.util;

import com.softicar.sqml.model.ISqmlColumn;
import com.softicar.sqml.model.ISqmlGlobalObject;
import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.ISqmlTabular;
import com.softicar.sqml.model.ISqmlValue;

import com.softicar.sqml.model.expressions.ISqmlExpression;

import com.softicar.sqml.model.files.ISqmlFileElement;
import com.softicar.sqml.model.files.SqmlFileElement;

import com.softicar.sqml.model.tables.*;

import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.types.ISqmlTypeDefinition;

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
 * @see com.softicar.sqml.model.tables.TablesPackage
 * @generated
 */
public class TablesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TablesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TablesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TablesPackage.eINSTANCE;
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
	protected TablesSwitch<Adapter> modelSwitch =
		new TablesSwitch<Adapter>() {
			@Override
			public Adapter caseSqmlLiteralDefaultValue(SqmlLiteralDefaultValue object) {
				return createSqmlLiteralDefaultValueAdapter();
			}
			@Override
			public Adapter caseSqmlRowConstructorDefaultValue(SqmlRowConstructorDefaultValue object) {
				return createSqmlRowConstructorDefaultValueAdapter();
			}
			@Override
			public Adapter caseSqmlTable(SqmlTable object) {
				return createSqmlTableAdapter();
			}
			@Override
			public Adapter caseSqmlTableColumn(SqmlTableColumn object) {
				return createSqmlTableColumnAdapter();
			}
			@Override
			public Adapter caseSqmlTableKey(SqmlTableKey object) {
				return createSqmlTableKeyAdapter();
			}
			@Override
			public Adapter caseSqmlUniqueKey(SqmlUniqueKey object) {
				return createSqmlUniqueKeyAdapter();
			}
			@Override
			public Adapter caseSqmlIndexKey(SqmlIndexKey object) {
				return createSqmlIndexKeyAdapter();
			}
			@Override
			public Adapter caseSqmlValueReferenceDefaultValue(SqmlValueReferenceDefaultValue object) {
				return createSqmlValueReferenceDefaultValueAdapter();
			}
			@Override
			public Adapter caseSqmlTableRow(SqmlTableRow object) {
				return createSqmlTableRowAdapter();
			}
			@Override
			public Adapter caseSqmlTableRowValue(SqmlTableRowValue object) {
				return createSqmlTableRowValueAdapter();
			}
			@Override
			public Adapter caseISqmlValue(ISqmlValue object) {
				return createISqmlValueAdapter();
			}
			@Override
			public Adapter caseISqmlModelElement(ISqmlModelElement object) {
				return createISqmlModelElementAdapter();
			}
			@Override
			public Adapter caseISqmlExpression(ISqmlExpression object) {
				return createISqmlExpressionAdapter();
			}
			@Override
			public Adapter caseISqmlDefaultValue(ISqmlDefaultValue object) {
				return createISqmlDefaultValueAdapter();
			}
			@Override
			public Adapter caseISqmlLiteralDefaultValue(ISqmlLiteralDefaultValue object) {
				return createISqmlLiteralDefaultValueAdapter();
			}
			@Override
			public Adapter caseISqmlRowConstructorDefaultValue(ISqmlRowConstructorDefaultValue object) {
				return createISqmlRowConstructorDefaultValueAdapter();
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
			public Adapter caseISqmlTabular(ISqmlTabular object) {
				return createISqmlTabularAdapter();
			}
			@Override
			public Adapter caseISqmlType(ISqmlType object) {
				return createISqmlTypeAdapter();
			}
			@Override
			public Adapter caseISqmlTypeDefinition(ISqmlTypeDefinition object) {
				return createISqmlTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseISqmlTable(ISqmlTable object) {
				return createISqmlTableAdapter();
			}
			@Override
			public Adapter caseISqmlValidatable(ISqmlValidatable object) {
				return createISqmlValidatableAdapter();
			}
			@Override
			public Adapter caseISqmlColumn(ISqmlColumn object) {
				return createISqmlColumnAdapter();
			}
			@Override
			public Adapter caseISqmlTableColumn(ISqmlTableColumn object) {
				return createISqmlTableColumnAdapter();
			}
			@Override
			public Adapter caseISqmlTableKey(ISqmlTableKey object) {
				return createISqmlTableKeyAdapter();
			}
			@Override
			public Adapter caseISqmlUniqueKey(ISqmlUniqueKey object) {
				return createISqmlUniqueKeyAdapter();
			}
			@Override
			public Adapter caseISqmlIndexKey(ISqmlIndexKey object) {
				return createISqmlIndexKeyAdapter();
			}
			@Override
			public Adapter caseISqmlValueReferenceDefaultValue(ISqmlValueReferenceDefaultValue object) {
				return createISqmlValueReferenceDefaultValueAdapter();
			}
			@Override
			public Adapter caseISqmlTableRow(ISqmlTableRow object) {
				return createISqmlTableRowAdapter();
			}
			@Override
			public Adapter caseISqmlTableRowValue(ISqmlTableRowValue object) {
				return createISqmlTableRowValueAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.tables.SqmlLiteralDefaultValue <em>Sqml Literal Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.tables.SqmlLiteralDefaultValue
	 * @generated
	 */
	public Adapter createSqmlLiteralDefaultValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.tables.SqmlRowConstructorDefaultValue <em>Sqml Row Constructor Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.tables.SqmlRowConstructorDefaultValue
	 * @generated
	 */
	public Adapter createSqmlRowConstructorDefaultValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.tables.SqmlTable <em>Sqml Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.tables.SqmlTable
	 * @generated
	 */
	public Adapter createSqmlTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.tables.SqmlTableColumn <em>Sqml Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.tables.SqmlTableColumn
	 * @generated
	 */
	public Adapter createSqmlTableColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.tables.SqmlTableKey <em>Sqml Table Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.tables.SqmlTableKey
	 * @generated
	 */
	public Adapter createSqmlTableKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.tables.SqmlUniqueKey <em>Sqml Unique Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.tables.SqmlUniqueKey
	 * @generated
	 */
	public Adapter createSqmlUniqueKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.tables.SqmlIndexKey <em>Sqml Index Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.tables.SqmlIndexKey
	 * @generated
	 */
	public Adapter createSqmlIndexKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.tables.SqmlValueReferenceDefaultValue <em>Sqml Value Reference Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.tables.SqmlValueReferenceDefaultValue
	 * @generated
	 */
	public Adapter createSqmlValueReferenceDefaultValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.tables.SqmlTableRow <em>Sqml Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.tables.SqmlTableRow
	 * @generated
	 */
	public Adapter createSqmlTableRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.tables.SqmlTableRowValue <em>Sqml Table Row Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.tables.SqmlTableRowValue
	 * @generated
	 */
	public Adapter createSqmlTableRowValueAdapter() {
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
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlExpression <em>ISqml Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlExpression
	 * @generated
	 */
	public Adapter createISqmlExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.tables.ISqmlDefaultValue <em>ISqml Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.tables.ISqmlDefaultValue
	 * @generated
	 */
	public Adapter createISqmlDefaultValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.tables.ISqmlLiteralDefaultValue <em>ISqml Literal Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.tables.ISqmlLiteralDefaultValue
	 * @generated
	 */
	public Adapter createISqmlLiteralDefaultValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.tables.ISqmlRowConstructorDefaultValue <em>ISqml Row Constructor Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.tables.ISqmlRowConstructorDefaultValue
	 * @generated
	 */
	public Adapter createISqmlRowConstructorDefaultValueAdapter() {
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
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.ISqmlTabular <em>ISqml Tabular</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.ISqmlTabular
	 * @generated
	 */
	public Adapter createISqmlTabularAdapter() {
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
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.tables.ISqmlTable <em>ISqml Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.tables.ISqmlTable
	 * @generated
	 */
	public Adapter createISqmlTableAdapter() {
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
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.ISqmlColumn <em>ISqml Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.ISqmlColumn
	 * @generated
	 */
	public Adapter createISqmlColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.tables.ISqmlTableColumn <em>ISqml Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.tables.ISqmlTableColumn
	 * @generated
	 */
	public Adapter createISqmlTableColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.tables.ISqmlTableKey <em>ISqml Table Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.tables.ISqmlTableKey
	 * @generated
	 */
	public Adapter createISqmlTableKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.tables.ISqmlUniqueKey <em>ISqml Unique Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.tables.ISqmlUniqueKey
	 * @generated
	 */
	public Adapter createISqmlUniqueKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.tables.ISqmlIndexKey <em>ISqml Index Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.tables.ISqmlIndexKey
	 * @generated
	 */
	public Adapter createISqmlIndexKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.tables.ISqmlValueReferenceDefaultValue <em>ISqml Value Reference Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.tables.ISqmlValueReferenceDefaultValue
	 * @generated
	 */
	public Adapter createISqmlValueReferenceDefaultValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.tables.ISqmlTableRow <em>ISqml Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.tables.ISqmlTableRow
	 * @generated
	 */
	public Adapter createISqmlTableRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.tables.ISqmlTableRowValue <em>ISqml Table Row Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.tables.ISqmlTableRowValue
	 * @generated
	 */
	public Adapter createISqmlTableRowValueAdapter() {
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

} //TablesAdapterFactory
