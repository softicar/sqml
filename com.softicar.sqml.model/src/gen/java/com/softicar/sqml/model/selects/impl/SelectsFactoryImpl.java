/**
 */
package com.softicar.sqml.model.selects.impl;

import com.softicar.sqml.model.selects.*;

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
public class SelectsFactoryImpl extends EFactoryImpl implements SelectsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SelectsFactory init() {
		try {
			SelectsFactory theSelectsFactory = (SelectsFactory)EPackage.Registry.INSTANCE.getEFactory(SelectsPackage.eNS_URI);
			if (theSelectsFactory != null) {
				return theSelectsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SelectsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectsFactoryImpl() {
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
			case SelectsPackage.SQML_FOREIGN_KEY_VARIABLE: return createSqmlForeignKeyVariable();
			case SelectsPackage.SQML_FROM_CLAUSE: return createSqmlFromClause();
			case SelectsPackage.SQML_GROUP_BY_CLAUSE: return createSqmlGroupByClause();
			case SelectsPackage.SQML_HAVING_CLAUSE: return createSqmlHavingClause();
			case SelectsPackage.SQML_JOIN_CLAUSE: return createSqmlJoinClause();
			case SelectsPackage.SQML_ORDER_BY_CLAUSE: return createSqmlOrderByClause();
			case SelectsPackage.SQML_ORDER_BY_EXPRESSION: return createSqmlOrderByExpression();
			case SelectsPackage.SQML_SELECT: return createSqmlSelect();
			case SelectsPackage.SQML_SELECT_CLAUSE: return createSqmlSelectClause();
			case SelectsPackage.SQML_SELECT_COLUMN: return createSqmlSelectColumn();
			case SelectsPackage.SQML_SELECT_ELSE: return createSqmlSelectElse();
			case SelectsPackage.SQML_SELECT_ELSE_IF: return createSqmlSelectElseIf();
			case SelectsPackage.SQML_SELECT_IF: return createSqmlSelectIf();
			case SelectsPackage.SQML_SUB_SELECT_VARIABLE: return createSqmlSubSelectVariable();
			case SelectsPackage.SQML_TABLE_VARIABLE: return createSqmlTableVariable();
			case SelectsPackage.SQML_WHERE_CLAUSE: return createSqmlWhereClause();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlForeignKeyVariable createSqmlForeignKeyVariable() {
		SqmlForeignKeyVariableImpl sqmlForeignKeyVariable = new SqmlForeignKeyVariableImpl();
		return sqmlForeignKeyVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlFromClause createSqmlFromClause() {
		SqmlFromClauseImpl sqmlFromClause = new SqmlFromClauseImpl();
		return sqmlFromClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlGroupByClause createSqmlGroupByClause() {
		SqmlGroupByClauseImpl sqmlGroupByClause = new SqmlGroupByClauseImpl();
		return sqmlGroupByClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlHavingClause createSqmlHavingClause() {
		SqmlHavingClauseImpl sqmlHavingClause = new SqmlHavingClauseImpl();
		return sqmlHavingClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlJoinClause createSqmlJoinClause() {
		SqmlJoinClauseImpl sqmlJoinClause = new SqmlJoinClauseImpl();
		return sqmlJoinClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlOrderByClause createSqmlOrderByClause() {
		SqmlOrderByClauseImpl sqmlOrderByClause = new SqmlOrderByClauseImpl();
		return sqmlOrderByClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlOrderByExpression createSqmlOrderByExpression() {
		SqmlOrderByExpressionImpl sqmlOrderByExpression = new SqmlOrderByExpressionImpl();
		return sqmlOrderByExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlSelect createSqmlSelect() {
		SqmlSelectImpl sqmlSelect = new SqmlSelectImpl();
		return sqmlSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlSelectClause createSqmlSelectClause() {
		SqmlSelectClauseImpl sqmlSelectClause = new SqmlSelectClauseImpl();
		return sqmlSelectClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlSelectColumn createSqmlSelectColumn() {
		SqmlSelectColumnImpl sqmlSelectColumn = new SqmlSelectColumnImpl();
		return sqmlSelectColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlSelectElse createSqmlSelectElse() {
		SqmlSelectElseImpl sqmlSelectElse = new SqmlSelectElseImpl();
		return sqmlSelectElse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlSelectElseIf createSqmlSelectElseIf() {
		SqmlSelectElseIfImpl sqmlSelectElseIf = new SqmlSelectElseIfImpl();
		return sqmlSelectElseIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlSelectIf createSqmlSelectIf() {
		SqmlSelectIfImpl sqmlSelectIf = new SqmlSelectIfImpl();
		return sqmlSelectIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlSubSelectVariable createSqmlSubSelectVariable() {
		SqmlSubSelectVariableImpl sqmlSubSelectVariable = new SqmlSubSelectVariableImpl();
		return sqmlSubSelectVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlTableVariable createSqmlTableVariable() {
		SqmlTableVariableImpl sqmlTableVariable = new SqmlTableVariableImpl();
		return sqmlTableVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlWhereClause createSqmlWhereClause() {
		SqmlWhereClauseImpl sqmlWhereClause = new SqmlWhereClauseImpl();
		return sqmlWhereClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectsPackage getSelectsPackage() {
		return (SelectsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SelectsPackage getPackage() {
		return SelectsPackage.eINSTANCE;
	}

} //SelectsFactoryImpl
