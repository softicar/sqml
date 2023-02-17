/**
 */
package com.softicar.sqml.model.selects.impl;

import com.softicar.sqml.model.externals.ExternalsPackage;

import com.softicar.sqml.model.interfaces.InterfacesPackage;

import com.softicar.sqml.model.selects.AbstractSqmlSelectBlock;
import com.softicar.sqml.model.selects.SelectsFactory;
import com.softicar.sqml.model.selects.SelectsPackage;
import com.softicar.sqml.model.selects.SqmlForeignKeyVariable;
import com.softicar.sqml.model.selects.SqmlFromClause;
import com.softicar.sqml.model.selects.SqmlGroupByClause;
import com.softicar.sqml.model.selects.SqmlHavingClause;
import com.softicar.sqml.model.selects.SqmlJoinClause;
import com.softicar.sqml.model.selects.SqmlOrderByClause;
import com.softicar.sqml.model.selects.SqmlOrderByExpression;
import com.softicar.sqml.model.selects.SqmlSelect;
import com.softicar.sqml.model.selects.SqmlSelectClause;
import com.softicar.sqml.model.selects.SqmlSelectColumn;
import com.softicar.sqml.model.selects.SqmlSelectElse;
import com.softicar.sqml.model.selects.SqmlSelectElseIf;
import com.softicar.sqml.model.selects.SqmlSelectIf;
import com.softicar.sqml.model.selects.SqmlSubSelectVariable;
import com.softicar.sqml.model.selects.SqmlTableVariable;
import com.softicar.sqml.model.selects.SqmlWhereClause;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SelectsPackageImpl extends EPackageImpl implements SelectsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSqmlSelectBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlForeignKeyVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlFromClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlGroupByClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlHavingClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlJoinClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlOrderByClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlOrderByExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlSelectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlSelectClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlSelectColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlSelectElseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlSelectElseIfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlSelectIfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlSubSelectVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlTableVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlWhereClauseEClass = null;

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
	 * @see com.softicar.sqml.model.selects.SelectsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SelectsPackageImpl() {
		super(eNS_URI, SelectsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SelectsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SelectsPackage init() {
		if (isInited) return (SelectsPackage)EPackage.Registry.INSTANCE.getEPackage(SelectsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSelectsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SelectsPackageImpl theSelectsPackage = registeredSelectsPackage instanceof SelectsPackageImpl ? (SelectsPackageImpl)registeredSelectsPackage : new SelectsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		InterfacesPackage.eINSTANCE.eClass();
		ExternalsPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSelectsPackage.createPackageContents();

		// Initialize created meta-data
		theSelectsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSelectsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SelectsPackage.eNS_URI, theSelectsPackage);
		return theSelectsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractSqmlSelectBlock() {
		return abstractSqmlSelectBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractSqmlSelectBlock_Parts() {
		return (EReference)abstractSqmlSelectBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractSqmlSelectBlock__GetAllElements() {
		return abstractSqmlSelectBlockEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlForeignKeyVariable() {
		return sqmlForeignKeyVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlForeignKeyVariable_Name() {
		return (EAttribute)sqmlForeignKeyVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlForeignKeyVariable_Variable() {
		return (EReference)sqmlForeignKeyVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlForeignKeyVariable_Column() {
		return (EReference)sqmlForeignKeyVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlFromClause() {
		return sqmlFromClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlFromClause_Variable() {
		return (EReference)sqmlFromClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlGroupByClause() {
		return sqmlGroupByClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlGroupByClause_Expressions() {
		return (EReference)sqmlGroupByClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlHavingClause() {
		return sqmlHavingClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlHavingClause_Condition() {
		return (EReference)sqmlHavingClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlJoinClause() {
		return sqmlJoinClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlJoinClause_LeftJoin() {
		return (EAttribute)sqmlJoinClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlJoinClause_Variable() {
		return (EReference)sqmlJoinClauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlJoinClause_Conditions() {
		return (EReference)sqmlJoinClauseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlOrderByClause() {
		return sqmlOrderByClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlOrderByClause_Expressions() {
		return (EReference)sqmlOrderByClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlOrderByExpression() {
		return sqmlOrderByExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlOrderByExpression_Expression() {
		return (EReference)sqmlOrderByExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlOrderByExpression_Descending() {
		return (EAttribute)sqmlOrderByExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlSelect() {
		return sqmlSelectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlSelectClause() {
		return sqmlSelectClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlSelectClause_Distinct() {
		return (EAttribute)sqmlSelectClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlSelectClause_Columns() {
		return (EReference)sqmlSelectClauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlSelectColumn() {
		return sqmlSelectColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlSelectColumn_Alias() {
		return (EAttribute)sqmlSelectColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlSelectColumn_Title() {
		return (EAttribute)sqmlSelectColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlSelectColumn_Expression() {
		return (EReference)sqmlSelectColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlSelectColumn_Name() {
		return (EAttribute)sqmlSelectColumnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlSelectElse() {
		return sqmlSelectElseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlSelectElseIf() {
		return sqmlSelectElseIfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlSelectElseIf_Condition() {
		return (EReference)sqmlSelectElseIfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlSelectIf() {
		return sqmlSelectIfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlSelectIf_Condition() {
		return (EReference)sqmlSelectIfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlSelectIf_ElseIfs() {
		return (EReference)sqmlSelectIfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlSelectIf_Else() {
		return (EReference)sqmlSelectIfEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSqmlSelectIf__GetAllElements() {
		return sqmlSelectIfEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlSubSelectVariable() {
		return sqmlSubSelectVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlSubSelectVariable_Name() {
		return (EAttribute)sqmlSubSelectVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlSubSelectVariable_SubSelect() {
		return (EReference)sqmlSubSelectVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlTableVariable() {
		return sqmlTableVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlTableVariable_Name() {
		return (EAttribute)sqmlTableVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlTableVariable_Table() {
		return (EReference)sqmlTableVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlWhereClause() {
		return sqmlWhereClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlWhereClause_Condition() {
		return (EReference)sqmlWhereClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectsFactory getSelectsFactory() {
		return (SelectsFactory)getEFactoryInstance();
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

		// Create classes and their features
		abstractSqmlSelectBlockEClass = createEClass(ABSTRACT_SQML_SELECT_BLOCK);
		createEReference(abstractSqmlSelectBlockEClass, ABSTRACT_SQML_SELECT_BLOCK__PARTS);
		createEOperation(abstractSqmlSelectBlockEClass, ABSTRACT_SQML_SELECT_BLOCK___GET_ALL_ELEMENTS);

		sqmlForeignKeyVariableEClass = createEClass(SQML_FOREIGN_KEY_VARIABLE);
		createEAttribute(sqmlForeignKeyVariableEClass, SQML_FOREIGN_KEY_VARIABLE__NAME);
		createEReference(sqmlForeignKeyVariableEClass, SQML_FOREIGN_KEY_VARIABLE__VARIABLE);
		createEReference(sqmlForeignKeyVariableEClass, SQML_FOREIGN_KEY_VARIABLE__COLUMN);

		sqmlFromClauseEClass = createEClass(SQML_FROM_CLAUSE);
		createEReference(sqmlFromClauseEClass, SQML_FROM_CLAUSE__VARIABLE);

		sqmlGroupByClauseEClass = createEClass(SQML_GROUP_BY_CLAUSE);
		createEReference(sqmlGroupByClauseEClass, SQML_GROUP_BY_CLAUSE__EXPRESSIONS);

		sqmlHavingClauseEClass = createEClass(SQML_HAVING_CLAUSE);
		createEReference(sqmlHavingClauseEClass, SQML_HAVING_CLAUSE__CONDITION);

		sqmlJoinClauseEClass = createEClass(SQML_JOIN_CLAUSE);
		createEAttribute(sqmlJoinClauseEClass, SQML_JOIN_CLAUSE__LEFT_JOIN);
		createEReference(sqmlJoinClauseEClass, SQML_JOIN_CLAUSE__VARIABLE);
		createEReference(sqmlJoinClauseEClass, SQML_JOIN_CLAUSE__CONDITIONS);

		sqmlOrderByClauseEClass = createEClass(SQML_ORDER_BY_CLAUSE);
		createEReference(sqmlOrderByClauseEClass, SQML_ORDER_BY_CLAUSE__EXPRESSIONS);

		sqmlOrderByExpressionEClass = createEClass(SQML_ORDER_BY_EXPRESSION);
		createEReference(sqmlOrderByExpressionEClass, SQML_ORDER_BY_EXPRESSION__EXPRESSION);
		createEAttribute(sqmlOrderByExpressionEClass, SQML_ORDER_BY_EXPRESSION__DESCENDING);

		sqmlSelectEClass = createEClass(SQML_SELECT);

		sqmlSelectClauseEClass = createEClass(SQML_SELECT_CLAUSE);
		createEAttribute(sqmlSelectClauseEClass, SQML_SELECT_CLAUSE__DISTINCT);
		createEReference(sqmlSelectClauseEClass, SQML_SELECT_CLAUSE__COLUMNS);

		sqmlSelectColumnEClass = createEClass(SQML_SELECT_COLUMN);
		createEAttribute(sqmlSelectColumnEClass, SQML_SELECT_COLUMN__ALIAS);
		createEAttribute(sqmlSelectColumnEClass, SQML_SELECT_COLUMN__TITLE);
		createEReference(sqmlSelectColumnEClass, SQML_SELECT_COLUMN__EXPRESSION);
		createEAttribute(sqmlSelectColumnEClass, SQML_SELECT_COLUMN__NAME);

		sqmlSelectElseEClass = createEClass(SQML_SELECT_ELSE);

		sqmlSelectElseIfEClass = createEClass(SQML_SELECT_ELSE_IF);
		createEReference(sqmlSelectElseIfEClass, SQML_SELECT_ELSE_IF__CONDITION);

		sqmlSelectIfEClass = createEClass(SQML_SELECT_IF);
		createEReference(sqmlSelectIfEClass, SQML_SELECT_IF__CONDITION);
		createEReference(sqmlSelectIfEClass, SQML_SELECT_IF__ELSE_IFS);
		createEReference(sqmlSelectIfEClass, SQML_SELECT_IF__ELSE);
		createEOperation(sqmlSelectIfEClass, SQML_SELECT_IF___GET_ALL_ELEMENTS);

		sqmlSubSelectVariableEClass = createEClass(SQML_SUB_SELECT_VARIABLE);
		createEAttribute(sqmlSubSelectVariableEClass, SQML_SUB_SELECT_VARIABLE__NAME);
		createEReference(sqmlSubSelectVariableEClass, SQML_SUB_SELECT_VARIABLE__SUB_SELECT);

		sqmlTableVariableEClass = createEClass(SQML_TABLE_VARIABLE);
		createEAttribute(sqmlTableVariableEClass, SQML_TABLE_VARIABLE__NAME);
		createEReference(sqmlTableVariableEClass, SQML_TABLE_VARIABLE__TABLE);

		sqmlWhereClauseEClass = createEClass(SQML_WHERE_CLAUSE);
		createEReference(sqmlWhereClauseEClass, SQML_WHERE_CLAUSE__CONDITION);
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

		// Obtain other dependent packages
		InterfacesPackage theInterfacesPackage = (InterfacesPackage)EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI);
		ExternalsPackage theExternalsPackage = (ExternalsPackage)EPackage.Registry.INSTANCE.getEPackage(ExternalsPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractSqmlSelectBlockEClass.getESuperTypes().add(theInterfacesPackage.getISqmlSelectBlock());
		sqmlForeignKeyVariableEClass.getESuperTypes().add(theInterfacesPackage.getISqmlForeignKeyVariable());
		sqmlFromClauseEClass.getESuperTypes().add(theInterfacesPackage.getISqmlFromClause());
		sqmlGroupByClauseEClass.getESuperTypes().add(theInterfacesPackage.getISqmlGroupByClause());
		sqmlHavingClauseEClass.getESuperTypes().add(theInterfacesPackage.getISqmlHavingClause());
		sqmlJoinClauseEClass.getESuperTypes().add(theInterfacesPackage.getISqmlJoinClause());
		sqmlOrderByClauseEClass.getESuperTypes().add(theInterfacesPackage.getISqmlOrderByClause());
		sqmlOrderByExpressionEClass.getESuperTypes().add(theInterfacesPackage.getISqmlOrderByExpression());
		sqmlSelectEClass.getESuperTypes().add(this.getAbstractSqmlSelectBlock());
		sqmlSelectEClass.getESuperTypes().add(theInterfacesPackage.getISqmlSelect());
		sqmlSelectClauseEClass.getESuperTypes().add(theInterfacesPackage.getISqmlSelectClause());
		sqmlSelectColumnEClass.getESuperTypes().add(theInterfacesPackage.getISqmlSelectColumn());
		sqmlSelectElseEClass.getESuperTypes().add(this.getAbstractSqmlSelectBlock());
		sqmlSelectElseEClass.getESuperTypes().add(theInterfacesPackage.getISqmlSelectElse());
		sqmlSelectElseIfEClass.getESuperTypes().add(this.getAbstractSqmlSelectBlock());
		sqmlSelectElseIfEClass.getESuperTypes().add(theInterfacesPackage.getISqmlSelectElseIf());
		sqmlSelectIfEClass.getESuperTypes().add(this.getAbstractSqmlSelectBlock());
		sqmlSelectIfEClass.getESuperTypes().add(theInterfacesPackage.getISqmlSelectIf());
		sqmlSubSelectVariableEClass.getESuperTypes().add(theInterfacesPackage.getISqmlSubSelectVariable());
		sqmlTableVariableEClass.getESuperTypes().add(theInterfacesPackage.getISqmlTableVariable());
		sqmlWhereClauseEClass.getESuperTypes().add(theInterfacesPackage.getISqmlWhereClause());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractSqmlSelectBlockEClass, AbstractSqmlSelectBlock.class, "AbstractSqmlSelectBlock", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractSqmlSelectBlock_Parts(), theInterfacesPackage.getISqmlSelectPart(), null, "parts", null, 0, -1, AbstractSqmlSelectBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getAbstractSqmlSelectBlock__GetAllElements(), null, "getAllElements", 0, 1, !IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(theExternalsPackage.getList());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(theInterfacesPackage.getISqmlSelectPart());
		g2.setEUpperBound(g3);
		initEOperation(op, g1);

		initEClass(sqmlForeignKeyVariableEClass, SqmlForeignKeyVariable.class, "SqmlForeignKeyVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlForeignKeyVariable_Name(), theEcorePackage.getEString(), "name", null, 0, 1, SqmlForeignKeyVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlForeignKeyVariable_Variable(), theInterfacesPackage.getISqmlVariable(), null, "variable", null, 0, 1, SqmlForeignKeyVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlForeignKeyVariable_Column(), theInterfacesPackage.getISqmlColumn(), null, "column", null, 0, 1, SqmlForeignKeyVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlFromClauseEClass, SqmlFromClause.class, "SqmlFromClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlFromClause_Variable(), theInterfacesPackage.getISqmlVariable(), null, "variable", null, 0, 1, SqmlFromClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlGroupByClauseEClass, SqmlGroupByClause.class, "SqmlGroupByClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlGroupByClause_Expressions(), theInterfacesPackage.getISqmlExpression(), null, "expressions", null, 0, -1, SqmlGroupByClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlHavingClauseEClass, SqmlHavingClause.class, "SqmlHavingClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlHavingClause_Condition(), theInterfacesPackage.getISqmlExpression(), null, "condition", null, 0, 1, SqmlHavingClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlJoinClauseEClass, SqmlJoinClause.class, "SqmlJoinClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlJoinClause_LeftJoin(), theEcorePackage.getEBoolean(), "leftJoin", null, 0, 1, SqmlJoinClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlJoinClause_Variable(), theInterfacesPackage.getISqmlVariable(), null, "variable", null, 0, 1, SqmlJoinClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlJoinClause_Conditions(), theInterfacesPackage.getISqmlExpression(), null, "conditions", null, 0, -1, SqmlJoinClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlOrderByClauseEClass, SqmlOrderByClause.class, "SqmlOrderByClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlOrderByClause_Expressions(), this.getSqmlOrderByExpression(), null, "expressions", null, 0, -1, SqmlOrderByClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlOrderByExpressionEClass, SqmlOrderByExpression.class, "SqmlOrderByExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlOrderByExpression_Expression(), theInterfacesPackage.getISqmlExpression(), null, "expression", null, 0, 1, SqmlOrderByExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlOrderByExpression_Descending(), theEcorePackage.getEBoolean(), "descending", null, 0, 1, SqmlOrderByExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlSelectEClass, SqmlSelect.class, "SqmlSelect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sqmlSelectClauseEClass, SqmlSelectClause.class, "SqmlSelectClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlSelectClause_Distinct(), theEcorePackage.getEBoolean(), "distinct", null, 0, 1, SqmlSelectClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlSelectClause_Columns(), this.getSqmlSelectColumn(), null, "columns", null, 0, -1, SqmlSelectClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlSelectColumnEClass, SqmlSelectColumn.class, "SqmlSelectColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlSelectColumn_Alias(), theEcorePackage.getEString(), "alias", null, 0, 1, SqmlSelectColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlSelectColumn_Title(), theEcorePackage.getEString(), "title", null, 0, 1, SqmlSelectColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlSelectColumn_Expression(), theInterfacesPackage.getISqmlExpression(), null, "expression", null, 0, 1, SqmlSelectColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlSelectColumn_Name(), theEcorePackage.getEString(), "name", null, 0, 1, SqmlSelectColumn.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(sqmlSelectElseEClass, SqmlSelectElse.class, "SqmlSelectElse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sqmlSelectElseIfEClass, SqmlSelectElseIf.class, "SqmlSelectElseIf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlSelectElseIf_Condition(), theInterfacesPackage.getISqmlStaticExpression(), null, "condition", null, 0, 1, SqmlSelectElseIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlSelectIfEClass, SqmlSelectIf.class, "SqmlSelectIf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlSelectIf_Condition(), theInterfacesPackage.getISqmlStaticExpression(), null, "condition", null, 0, 1, SqmlSelectIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlSelectIf_ElseIfs(), theInterfacesPackage.getISqmlSelectElseIf(), null, "elseIfs", null, 0, -1, SqmlSelectIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlSelectIf_Else(), theInterfacesPackage.getISqmlSelectElse(), null, "else", null, 0, 1, SqmlSelectIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSqmlSelectIf__GetAllElements(), null, "getAllElements", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theExternalsPackage.getList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theInterfacesPackage.getISqmlSelectPart());
		g2.setEUpperBound(g3);
		initEOperation(op, g1);

		initEClass(sqmlSubSelectVariableEClass, SqmlSubSelectVariable.class, "SqmlSubSelectVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlSubSelectVariable_Name(), theEcorePackage.getEString(), "name", null, 0, 1, SqmlSubSelectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlSubSelectVariable_SubSelect(), theInterfacesPackage.getISqmlSelect(), null, "subSelect", null, 0, 1, SqmlSubSelectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlTableVariableEClass, SqmlTableVariable.class, "SqmlTableVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlTableVariable_Name(), theEcorePackage.getEString(), "name", null, 0, 1, SqmlTableVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlTableVariable_Table(), theInterfacesPackage.getISqmlTable(), null, "table", null, 0, 1, SqmlTableVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlWhereClauseEClass, SqmlWhereClause.class, "SqmlWhereClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlWhereClause_Condition(), theInterfacesPackage.getISqmlExpression(), null, "condition", null, 0, 1, SqmlWhereClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SelectsPackageImpl
