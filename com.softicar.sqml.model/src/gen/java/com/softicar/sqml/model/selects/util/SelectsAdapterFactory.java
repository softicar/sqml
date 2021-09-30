/**
 */
package com.softicar.sqml.model.selects.util;

import com.softicar.sqml.model.ISqmlColumn;
import com.softicar.sqml.model.ISqmlGeneratable;
import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.ISqmlTabular;
import com.softicar.sqml.model.ISqmlValue;

import com.softicar.sqml.model.expressions.ISqmlExpression;

import com.softicar.sqml.model.selects.*;

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
 * @see com.softicar.sqml.model.selects.SelectsPackage
 * @generated
 */
public class SelectsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SelectsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SelectsPackage.eINSTANCE;
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
	protected SelectsSwitch<Adapter> modelSwitch =
		new SelectsSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractSqmlSelectBlock(AbstractSqmlSelectBlock object) {
				return createAbstractSqmlSelectBlockAdapter();
			}
			@Override
			public Adapter caseSqmlForeignKeyVariable(SqmlForeignKeyVariable object) {
				return createSqmlForeignKeyVariableAdapter();
			}
			@Override
			public Adapter caseSqmlFromClause(SqmlFromClause object) {
				return createSqmlFromClauseAdapter();
			}
			@Override
			public Adapter caseSqmlGroupByClause(SqmlGroupByClause object) {
				return createSqmlGroupByClauseAdapter();
			}
			@Override
			public Adapter caseSqmlHavingClause(SqmlHavingClause object) {
				return createSqmlHavingClauseAdapter();
			}
			@Override
			public Adapter caseSqmlJoinClause(SqmlJoinClause object) {
				return createSqmlJoinClauseAdapter();
			}
			@Override
			public Adapter caseSqmlOrderByClause(SqmlOrderByClause object) {
				return createSqmlOrderByClauseAdapter();
			}
			@Override
			public Adapter caseSqmlOrderByExpression(SqmlOrderByExpression object) {
				return createSqmlOrderByExpressionAdapter();
			}
			@Override
			public Adapter caseSqmlSelect(SqmlSelect object) {
				return createSqmlSelectAdapter();
			}
			@Override
			public Adapter caseSqmlSelectClause(SqmlSelectClause object) {
				return createSqmlSelectClauseAdapter();
			}
			@Override
			public Adapter caseSqmlSelectColumn(SqmlSelectColumn object) {
				return createSqmlSelectColumnAdapter();
			}
			@Override
			public Adapter caseSqmlSelectElse(SqmlSelectElse object) {
				return createSqmlSelectElseAdapter();
			}
			@Override
			public Adapter caseSqmlSelectElseIf(SqmlSelectElseIf object) {
				return createSqmlSelectElseIfAdapter();
			}
			@Override
			public Adapter caseSqmlSelectIf(SqmlSelectIf object) {
				return createSqmlSelectIfAdapter();
			}
			@Override
			public Adapter caseSqmlSubSelectVariable(SqmlSubSelectVariable object) {
				return createSqmlSubSelectVariableAdapter();
			}
			@Override
			public Adapter caseSqmlTableVariable(SqmlTableVariable object) {
				return createSqmlTableVariableAdapter();
			}
			@Override
			public Adapter caseSqmlWhereClause(SqmlWhereClause object) {
				return createSqmlWhereClauseAdapter();
			}
			@Override
			public Adapter caseISqmlModelElement(ISqmlModelElement object) {
				return createISqmlModelElementAdapter();
			}
			@Override
			public Adapter caseISqmlSelectPart(ISqmlSelectPart object) {
				return createISqmlSelectPartAdapter();
			}
			@Override
			public Adapter caseISqmlSelectBlock(ISqmlSelectBlock object) {
				return createISqmlSelectBlockAdapter();
			}
			@Override
			public Adapter caseISqmlGeneratable(ISqmlGeneratable object) {
				return createISqmlGeneratableAdapter();
			}
			@Override
			public Adapter caseISqmlValue(ISqmlValue object) {
				return createISqmlValueAdapter();
			}
			@Override
			public Adapter caseISqmlVariable(ISqmlVariable object) {
				return createISqmlVariableAdapter();
			}
			@Override
			public Adapter caseISqmlForeignKeyVariable(ISqmlForeignKeyVariable object) {
				return createISqmlForeignKeyVariableAdapter();
			}
			@Override
			public Adapter caseISqmlFromClause(ISqmlFromClause object) {
				return createISqmlFromClauseAdapter();
			}
			@Override
			public Adapter caseISqmlGroupByClause(ISqmlGroupByClause object) {
				return createISqmlGroupByClauseAdapter();
			}
			@Override
			public Adapter caseISqmlHavingClause(ISqmlHavingClause object) {
				return createISqmlHavingClauseAdapter();
			}
			@Override
			public Adapter caseISqmlValidatable(ISqmlValidatable object) {
				return createISqmlValidatableAdapter();
			}
			@Override
			public Adapter caseISqmlJoinClause(ISqmlJoinClause object) {
				return createISqmlJoinClauseAdapter();
			}
			@Override
			public Adapter caseISqmlOrderByClause(ISqmlOrderByClause object) {
				return createISqmlOrderByClauseAdapter();
			}
			@Override
			public Adapter caseISqmlOrderByExpression(ISqmlOrderByExpression object) {
				return createISqmlOrderByExpressionAdapter();
			}
			@Override
			public Adapter caseISqmlExpression(ISqmlExpression object) {
				return createISqmlExpressionAdapter();
			}
			@Override
			public Adapter caseISqmlTabular(ISqmlTabular object) {
				return createISqmlTabularAdapter();
			}
			@Override
			public Adapter caseISqmlSelect(ISqmlSelect object) {
				return createISqmlSelectAdapter();
			}
			@Override
			public Adapter caseISqmlSelectClause(ISqmlSelectClause object) {
				return createISqmlSelectClauseAdapter();
			}
			@Override
			public Adapter caseISqmlColumn(ISqmlColumn object) {
				return createISqmlColumnAdapter();
			}
			@Override
			public Adapter caseISqmlSelectColumn(ISqmlSelectColumn object) {
				return createISqmlSelectColumnAdapter();
			}
			@Override
			public Adapter caseISqmlSelectElse(ISqmlSelectElse object) {
				return createISqmlSelectElseAdapter();
			}
			@Override
			public Adapter caseISqmlSelectElseIf(ISqmlSelectElseIf object) {
				return createISqmlSelectElseIfAdapter();
			}
			@Override
			public Adapter caseISqmlSelectIf(ISqmlSelectIf object) {
				return createISqmlSelectIfAdapter();
			}
			@Override
			public Adapter caseISqmlSubSelectVariable(ISqmlSubSelectVariable object) {
				return createISqmlSubSelectVariableAdapter();
			}
			@Override
			public Adapter caseISqmlTableVariable(ISqmlTableVariable object) {
				return createISqmlTableVariableAdapter();
			}
			@Override
			public Adapter caseISqmlWhereClause(ISqmlWhereClause object) {
				return createISqmlWhereClauseAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.AbstractSqmlSelectBlock <em>Abstract Sqml Select Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.AbstractSqmlSelectBlock
	 * @generated
	 */
	public Adapter createAbstractSqmlSelectBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.SqmlForeignKeyVariable <em>Sqml Foreign Key Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.SqmlForeignKeyVariable
	 * @generated
	 */
	public Adapter createSqmlForeignKeyVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.SqmlFromClause <em>Sqml From Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.SqmlFromClause
	 * @generated
	 */
	public Adapter createSqmlFromClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.SqmlGroupByClause <em>Sqml Group By Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.SqmlGroupByClause
	 * @generated
	 */
	public Adapter createSqmlGroupByClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.SqmlHavingClause <em>Sqml Having Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.SqmlHavingClause
	 * @generated
	 */
	public Adapter createSqmlHavingClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.SqmlJoinClause <em>Sqml Join Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.SqmlJoinClause
	 * @generated
	 */
	public Adapter createSqmlJoinClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.SqmlOrderByClause <em>Sqml Order By Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.SqmlOrderByClause
	 * @generated
	 */
	public Adapter createSqmlOrderByClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.SqmlOrderByExpression <em>Sqml Order By Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.SqmlOrderByExpression
	 * @generated
	 */
	public Adapter createSqmlOrderByExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.SqmlSelect <em>Sqml Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.SqmlSelect
	 * @generated
	 */
	public Adapter createSqmlSelectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.SqmlSelectClause <em>Sqml Select Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.SqmlSelectClause
	 * @generated
	 */
	public Adapter createSqmlSelectClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.SqmlSelectColumn <em>Sqml Select Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.SqmlSelectColumn
	 * @generated
	 */
	public Adapter createSqmlSelectColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.SqmlSelectElse <em>Sqml Select Else</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.SqmlSelectElse
	 * @generated
	 */
	public Adapter createSqmlSelectElseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.SqmlSelectElseIf <em>Sqml Select Else If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.SqmlSelectElseIf
	 * @generated
	 */
	public Adapter createSqmlSelectElseIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.SqmlSelectIf <em>Sqml Select If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.SqmlSelectIf
	 * @generated
	 */
	public Adapter createSqmlSelectIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.SqmlSubSelectVariable <em>Sqml Sub Select Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.SqmlSubSelectVariable
	 * @generated
	 */
	public Adapter createSqmlSubSelectVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.SqmlTableVariable <em>Sqml Table Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.SqmlTableVariable
	 * @generated
	 */
	public Adapter createSqmlTableVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.SqmlWhereClause <em>Sqml Where Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.SqmlWhereClause
	 * @generated
	 */
	public Adapter createSqmlWhereClauseAdapter() {
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
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlSelectPart <em>ISqml Select Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlSelectPart
	 * @generated
	 */
	public Adapter createISqmlSelectPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlSelectBlock <em>ISqml Select Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlSelectBlock
	 * @generated
	 */
	public Adapter createISqmlSelectBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.ISqmlGeneratable <em>ISqml Generatable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.ISqmlGeneratable
	 * @generated
	 */
	public Adapter createISqmlGeneratableAdapter() {
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
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlVariable <em>ISqml Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlVariable
	 * @generated
	 */
	public Adapter createISqmlVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlForeignKeyVariable <em>ISqml Foreign Key Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlForeignKeyVariable
	 * @generated
	 */
	public Adapter createISqmlForeignKeyVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlFromClause <em>ISqml From Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlFromClause
	 * @generated
	 */
	public Adapter createISqmlFromClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlGroupByClause <em>ISqml Group By Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlGroupByClause
	 * @generated
	 */
	public Adapter createISqmlGroupByClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlHavingClause <em>ISqml Having Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlHavingClause
	 * @generated
	 */
	public Adapter createISqmlHavingClauseAdapter() {
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
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlJoinClause <em>ISqml Join Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlJoinClause
	 * @generated
	 */
	public Adapter createISqmlJoinClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlOrderByClause <em>ISqml Order By Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlOrderByClause
	 * @generated
	 */
	public Adapter createISqmlOrderByClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlOrderByExpression <em>ISqml Order By Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlOrderByExpression
	 * @generated
	 */
	public Adapter createISqmlOrderByExpressionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlSelect <em>ISqml Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlSelect
	 * @generated
	 */
	public Adapter createISqmlSelectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlSelectClause <em>ISqml Select Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlSelectClause
	 * @generated
	 */
	public Adapter createISqmlSelectClauseAdapter() {
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
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlSelectColumn <em>ISqml Select Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlSelectColumn
	 * @generated
	 */
	public Adapter createISqmlSelectColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlSelectElse <em>ISqml Select Else</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlSelectElse
	 * @generated
	 */
	public Adapter createISqmlSelectElseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlSelectElseIf <em>ISqml Select Else If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlSelectElseIf
	 * @generated
	 */
	public Adapter createISqmlSelectElseIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlSelectIf <em>ISqml Select If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlSelectIf
	 * @generated
	 */
	public Adapter createISqmlSelectIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlSubSelectVariable <em>ISqml Sub Select Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlSubSelectVariable
	 * @generated
	 */
	public Adapter createISqmlSubSelectVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlTableVariable <em>ISqml Table Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlTableVariable
	 * @generated
	 */
	public Adapter createISqmlTableVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlWhereClause <em>ISqml Where Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlWhereClause
	 * @generated
	 */
	public Adapter createISqmlWhereClauseAdapter() {
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

} //SelectsAdapterFactory
