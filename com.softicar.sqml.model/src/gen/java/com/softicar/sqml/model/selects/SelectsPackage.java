/**
 */
package com.softicar.sqml.model.selects;

import com.softicar.sqml.model.interfaces.InterfacesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see com.softicar.sqml.model.selects.SelectsFactory
 * @model kind="package"
 * @generated
 */
public interface SelectsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "selects";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "com.softicar.sqml.model.selects";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "selects";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SelectsPackage eINSTANCE = com.softicar.sqml.model.selects.impl.SelectsPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.impl.AbstractSqmlSelectBlockImpl <em>Abstract Sqml Select Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.impl.AbstractSqmlSelectBlockImpl
	 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getAbstractSqmlSelectBlock()
	 * @generated
	 */
	int ABSTRACT_SQML_SELECT_BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQML_SELECT_BLOCK__PARTS = InterfacesPackage.ISQML_SELECT_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Sqml Select Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQML_SELECT_BLOCK_FEATURE_COUNT = InterfacesPackage.ISQML_SELECT_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQML_SELECT_BLOCK___GET_ALL_ELEMENTS = InterfacesPackage.ISQML_SELECT_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Sqml Select Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQML_SELECT_BLOCK_OPERATION_COUNT = InterfacesPackage.ISQML_SELECT_BLOCK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.impl.SqmlForeignKeyVariableImpl <em>Sqml Foreign Key Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.impl.SqmlForeignKeyVariableImpl
	 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getSqmlForeignKeyVariable()
	 * @generated
	 */
	int SQML_FOREIGN_KEY_VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FOREIGN_KEY_VARIABLE__NAME = InterfacesPackage.ISQML_FOREIGN_KEY_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FOREIGN_KEY_VARIABLE__VARIABLE = InterfacesPackage.ISQML_FOREIGN_KEY_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FOREIGN_KEY_VARIABLE__COLUMN = InterfacesPackage.ISQML_FOREIGN_KEY_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sqml Foreign Key Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FOREIGN_KEY_VARIABLE_FEATURE_COUNT = InterfacesPackage.ISQML_FOREIGN_KEY_VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sqml Foreign Key Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FOREIGN_KEY_VARIABLE_OPERATION_COUNT = InterfacesPackage.ISQML_FOREIGN_KEY_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.impl.SqmlFromClauseImpl <em>Sqml From Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.impl.SqmlFromClauseImpl
	 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getSqmlFromClause()
	 * @generated
	 */
	int SQML_FROM_CLAUSE = 2;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FROM_CLAUSE__VARIABLE = InterfacesPackage.ISQML_FROM_CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sqml From Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FROM_CLAUSE_FEATURE_COUNT = InterfacesPackage.ISQML_FROM_CLAUSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sqml From Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FROM_CLAUSE_OPERATION_COUNT = InterfacesPackage.ISQML_FROM_CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.impl.SqmlGroupByClauseImpl <em>Sqml Group By Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.impl.SqmlGroupByClauseImpl
	 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getSqmlGroupByClause()
	 * @generated
	 */
	int SQML_GROUP_BY_CLAUSE = 3;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_GROUP_BY_CLAUSE__EXPRESSIONS = InterfacesPackage.ISQML_GROUP_BY_CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sqml Group By Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_GROUP_BY_CLAUSE_FEATURE_COUNT = InterfacesPackage.ISQML_GROUP_BY_CLAUSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sqml Group By Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_GROUP_BY_CLAUSE_OPERATION_COUNT = InterfacesPackage.ISQML_GROUP_BY_CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.impl.SqmlHavingClauseImpl <em>Sqml Having Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.impl.SqmlHavingClauseImpl
	 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getSqmlHavingClause()
	 * @generated
	 */
	int SQML_HAVING_CLAUSE = 4;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_HAVING_CLAUSE__CONDITION = InterfacesPackage.ISQML_HAVING_CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sqml Having Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_HAVING_CLAUSE_FEATURE_COUNT = InterfacesPackage.ISQML_HAVING_CLAUSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sqml Having Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_HAVING_CLAUSE_OPERATION_COUNT = InterfacesPackage.ISQML_HAVING_CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.impl.SqmlJoinClauseImpl <em>Sqml Join Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.impl.SqmlJoinClauseImpl
	 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getSqmlJoinClause()
	 * @generated
	 */
	int SQML_JOIN_CLAUSE = 5;

	/**
	 * The feature id for the '<em><b>Left Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_JOIN_CLAUSE__LEFT_JOIN = InterfacesPackage.ISQML_JOIN_CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_JOIN_CLAUSE__VARIABLE = InterfacesPackage.ISQML_JOIN_CLAUSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_JOIN_CLAUSE__CONDITIONS = InterfacesPackage.ISQML_JOIN_CLAUSE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sqml Join Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_JOIN_CLAUSE_FEATURE_COUNT = InterfacesPackage.ISQML_JOIN_CLAUSE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sqml Join Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_JOIN_CLAUSE_OPERATION_COUNT = InterfacesPackage.ISQML_JOIN_CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.impl.SqmlOrderByClauseImpl <em>Sqml Order By Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.impl.SqmlOrderByClauseImpl
	 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getSqmlOrderByClause()
	 * @generated
	 */
	int SQML_ORDER_BY_CLAUSE = 6;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_ORDER_BY_CLAUSE__EXPRESSIONS = InterfacesPackage.ISQML_ORDER_BY_CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sqml Order By Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_ORDER_BY_CLAUSE_FEATURE_COUNT = InterfacesPackage.ISQML_ORDER_BY_CLAUSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sqml Order By Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_ORDER_BY_CLAUSE_OPERATION_COUNT = InterfacesPackage.ISQML_ORDER_BY_CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.impl.SqmlOrderByExpressionImpl <em>Sqml Order By Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.impl.SqmlOrderByExpressionImpl
	 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getSqmlOrderByExpression()
	 * @generated
	 */
	int SQML_ORDER_BY_EXPRESSION = 7;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_ORDER_BY_EXPRESSION__EXPRESSION = InterfacesPackage.ISQML_ORDER_BY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Descending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_ORDER_BY_EXPRESSION__DESCENDING = InterfacesPackage.ISQML_ORDER_BY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sqml Order By Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_ORDER_BY_EXPRESSION_FEATURE_COUNT = InterfacesPackage.ISQML_ORDER_BY_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sqml Order By Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_ORDER_BY_EXPRESSION_OPERATION_COUNT = InterfacesPackage.ISQML_ORDER_BY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.impl.SqmlSelectImpl <em>Sqml Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.impl.SqmlSelectImpl
	 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getSqmlSelect()
	 * @generated
	 */
	int SQML_SELECT = 8;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SELECT__PARTS = ABSTRACT_SQML_SELECT_BLOCK__PARTS;

	/**
	 * The number of structural features of the '<em>Sqml Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SELECT_FEATURE_COUNT = ABSTRACT_SQML_SELECT_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SELECT___GET_ALL_ELEMENTS = ABSTRACT_SQML_SELECT_BLOCK___GET_ALL_ELEMENTS;

	/**
	 * The number of operations of the '<em>Sqml Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SELECT_OPERATION_COUNT = ABSTRACT_SQML_SELECT_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.impl.SqmlSelectClauseImpl <em>Sqml Select Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.impl.SqmlSelectClauseImpl
	 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getSqmlSelectClause()
	 * @generated
	 */
	int SQML_SELECT_CLAUSE = 9;

	/**
	 * The feature id for the '<em><b>Distinct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SELECT_CLAUSE__DISTINCT = InterfacesPackage.ISQML_SELECT_CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SELECT_CLAUSE__COLUMNS = InterfacesPackage.ISQML_SELECT_CLAUSE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sqml Select Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SELECT_CLAUSE_FEATURE_COUNT = InterfacesPackage.ISQML_SELECT_CLAUSE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sqml Select Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SELECT_CLAUSE_OPERATION_COUNT = InterfacesPackage.ISQML_SELECT_CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.impl.SqmlSelectColumnImpl <em>Sqml Select Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.impl.SqmlSelectColumnImpl
	 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getSqmlSelectColumn()
	 * @generated
	 */
	int SQML_SELECT_COLUMN = 10;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SELECT_COLUMN__ALIAS = InterfacesPackage.ISQML_SELECT_COLUMN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SELECT_COLUMN__TITLE = InterfacesPackage.ISQML_SELECT_COLUMN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SELECT_COLUMN__EXPRESSION = InterfacesPackage.ISQML_SELECT_COLUMN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SELECT_COLUMN__NAME = InterfacesPackage.ISQML_SELECT_COLUMN_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sqml Select Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SELECT_COLUMN_FEATURE_COUNT = InterfacesPackage.ISQML_SELECT_COLUMN_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Sqml Select Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SELECT_COLUMN_OPERATION_COUNT = InterfacesPackage.ISQML_SELECT_COLUMN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.impl.SqmlSelectElseImpl <em>Sqml Select Else</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.impl.SqmlSelectElseImpl
	 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getSqmlSelectElse()
	 * @generated
	 */
	int SQML_SELECT_ELSE = 11;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SELECT_ELSE__PARTS = ABSTRACT_SQML_SELECT_BLOCK__PARTS;

	/**
	 * The number of structural features of the '<em>Sqml Select Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SELECT_ELSE_FEATURE_COUNT = ABSTRACT_SQML_SELECT_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SELECT_ELSE___GET_ALL_ELEMENTS = ABSTRACT_SQML_SELECT_BLOCK___GET_ALL_ELEMENTS;

	/**
	 * The number of operations of the '<em>Sqml Select Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SELECT_ELSE_OPERATION_COUNT = ABSTRACT_SQML_SELECT_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.impl.SqmlSelectElseIfImpl <em>Sqml Select Else If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.impl.SqmlSelectElseIfImpl
	 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getSqmlSelectElseIf()
	 * @generated
	 */
	int SQML_SELECT_ELSE_IF = 12;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SELECT_ELSE_IF__PARTS = ABSTRACT_SQML_SELECT_BLOCK__PARTS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SELECT_ELSE_IF__CONDITION = ABSTRACT_SQML_SELECT_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sqml Select Else If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SELECT_ELSE_IF_FEATURE_COUNT = ABSTRACT_SQML_SELECT_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SELECT_ELSE_IF___GET_ALL_ELEMENTS = ABSTRACT_SQML_SELECT_BLOCK___GET_ALL_ELEMENTS;

	/**
	 * The number of operations of the '<em>Sqml Select Else If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SELECT_ELSE_IF_OPERATION_COUNT = ABSTRACT_SQML_SELECT_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.impl.SqmlSelectIfImpl <em>Sqml Select If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.impl.SqmlSelectIfImpl
	 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getSqmlSelectIf()
	 * @generated
	 */
	int SQML_SELECT_IF = 13;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SELECT_IF__PARTS = ABSTRACT_SQML_SELECT_BLOCK__PARTS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SELECT_IF__CONDITION = ABSTRACT_SQML_SELECT_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else Ifs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SELECT_IF__ELSE_IFS = ABSTRACT_SQML_SELECT_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SELECT_IF__ELSE = ABSTRACT_SQML_SELECT_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sqml Select If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SELECT_IF_FEATURE_COUNT = ABSTRACT_SQML_SELECT_BLOCK_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get All Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SELECT_IF___GET_ALL_ELEMENTS = ABSTRACT_SQML_SELECT_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sqml Select If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SELECT_IF_OPERATION_COUNT = ABSTRACT_SQML_SELECT_BLOCK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.impl.SqmlSubSelectVariableImpl <em>Sqml Sub Select Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.impl.SqmlSubSelectVariableImpl
	 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getSqmlSubSelectVariable()
	 * @generated
	 */
	int SQML_SUB_SELECT_VARIABLE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SUB_SELECT_VARIABLE__NAME = InterfacesPackage.ISQML_SUB_SELECT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SUB_SELECT_VARIABLE__SUB_SELECT = InterfacesPackage.ISQML_SUB_SELECT_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sqml Sub Select Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SUB_SELECT_VARIABLE_FEATURE_COUNT = InterfacesPackage.ISQML_SUB_SELECT_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sqml Sub Select Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SUB_SELECT_VARIABLE_OPERATION_COUNT = InterfacesPackage.ISQML_SUB_SELECT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.impl.SqmlTableVariableImpl <em>Sqml Table Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.impl.SqmlTableVariableImpl
	 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getSqmlTableVariable()
	 * @generated
	 */
	int SQML_TABLE_VARIABLE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_VARIABLE__NAME = InterfacesPackage.ISQML_TABLE_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_VARIABLE__TABLE = InterfacesPackage.ISQML_TABLE_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sqml Table Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_VARIABLE_FEATURE_COUNT = InterfacesPackage.ISQML_TABLE_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sqml Table Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TABLE_VARIABLE_OPERATION_COUNT = InterfacesPackage.ISQML_TABLE_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.impl.SqmlWhereClauseImpl <em>Sqml Where Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.impl.SqmlWhereClauseImpl
	 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getSqmlWhereClause()
	 * @generated
	 */
	int SQML_WHERE_CLAUSE = 16;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_WHERE_CLAUSE__CONDITION = InterfacesPackage.ISQML_WHERE_CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sqml Where Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_WHERE_CLAUSE_FEATURE_COUNT = InterfacesPackage.ISQML_WHERE_CLAUSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sqml Where Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_WHERE_CLAUSE_OPERATION_COUNT = InterfacesPackage.ISQML_WHERE_CLAUSE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.AbstractSqmlSelectBlock <em>Abstract Sqml Select Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Sqml Select Block</em>'.
	 * @see com.softicar.sqml.model.selects.AbstractSqmlSelectBlock
	 * @generated
	 */
	EClass getAbstractSqmlSelectBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link com.softicar.sqml.model.selects.AbstractSqmlSelectBlock#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see com.softicar.sqml.model.selects.AbstractSqmlSelectBlock#getParts()
	 * @see #getAbstractSqmlSelectBlock()
	 * @generated
	 */
	EReference getAbstractSqmlSelectBlock_Parts();

	/**
	 * Returns the meta object for the '{@link com.softicar.sqml.model.selects.AbstractSqmlSelectBlock#getAllElements() <em>Get All Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Elements</em>' operation.
	 * @see com.softicar.sqml.model.selects.AbstractSqmlSelectBlock#getAllElements()
	 * @generated
	 */
	EOperation getAbstractSqmlSelectBlock__GetAllElements();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.SqmlForeignKeyVariable <em>Sqml Foreign Key Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Foreign Key Variable</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlForeignKeyVariable
	 * @generated
	 */
	EClass getSqmlForeignKeyVariable();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.selects.SqmlForeignKeyVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlForeignKeyVariable#getName()
	 * @see #getSqmlForeignKeyVariable()
	 * @generated
	 */
	EAttribute getSqmlForeignKeyVariable_Name();

	/**
	 * Returns the meta object for the reference '{@link com.softicar.sqml.model.selects.SqmlForeignKeyVariable#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlForeignKeyVariable#getVariable()
	 * @see #getSqmlForeignKeyVariable()
	 * @generated
	 */
	EReference getSqmlForeignKeyVariable_Variable();

	/**
	 * Returns the meta object for the reference '{@link com.softicar.sqml.model.selects.SqmlForeignKeyVariable#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Column</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlForeignKeyVariable#getColumn()
	 * @see #getSqmlForeignKeyVariable()
	 * @generated
	 */
	EReference getSqmlForeignKeyVariable_Column();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.SqmlFromClause <em>Sqml From Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml From Clause</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlFromClause
	 * @generated
	 */
	EClass getSqmlFromClause();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.selects.SqmlFromClause#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlFromClause#getVariable()
	 * @see #getSqmlFromClause()
	 * @generated
	 */
	EReference getSqmlFromClause_Variable();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.SqmlGroupByClause <em>Sqml Group By Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Group By Clause</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlGroupByClause
	 * @generated
	 */
	EClass getSqmlGroupByClause();

	/**
	 * Returns the meta object for the containment reference list '{@link com.softicar.sqml.model.selects.SqmlGroupByClause#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlGroupByClause#getExpressions()
	 * @see #getSqmlGroupByClause()
	 * @generated
	 */
	EReference getSqmlGroupByClause_Expressions();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.SqmlHavingClause <em>Sqml Having Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Having Clause</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlHavingClause
	 * @generated
	 */
	EClass getSqmlHavingClause();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.selects.SqmlHavingClause#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlHavingClause#getCondition()
	 * @see #getSqmlHavingClause()
	 * @generated
	 */
	EReference getSqmlHavingClause_Condition();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.SqmlJoinClause <em>Sqml Join Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Join Clause</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlJoinClause
	 * @generated
	 */
	EClass getSqmlJoinClause();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.selects.SqmlJoinClause#isLeftJoin <em>Left Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Join</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlJoinClause#isLeftJoin()
	 * @see #getSqmlJoinClause()
	 * @generated
	 */
	EAttribute getSqmlJoinClause_LeftJoin();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.selects.SqmlJoinClause#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlJoinClause#getVariable()
	 * @see #getSqmlJoinClause()
	 * @generated
	 */
	EReference getSqmlJoinClause_Variable();

	/**
	 * Returns the meta object for the containment reference list '{@link com.softicar.sqml.model.selects.SqmlJoinClause#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlJoinClause#getConditions()
	 * @see #getSqmlJoinClause()
	 * @generated
	 */
	EReference getSqmlJoinClause_Conditions();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.SqmlOrderByClause <em>Sqml Order By Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Order By Clause</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlOrderByClause
	 * @generated
	 */
	EClass getSqmlOrderByClause();

	/**
	 * Returns the meta object for the containment reference list '{@link com.softicar.sqml.model.selects.SqmlOrderByClause#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlOrderByClause#getExpressions()
	 * @see #getSqmlOrderByClause()
	 * @generated
	 */
	EReference getSqmlOrderByClause_Expressions();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.SqmlOrderByExpression <em>Sqml Order By Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Order By Expression</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlOrderByExpression
	 * @generated
	 */
	EClass getSqmlOrderByExpression();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.selects.SqmlOrderByExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlOrderByExpression#getExpression()
	 * @see #getSqmlOrderByExpression()
	 * @generated
	 */
	EReference getSqmlOrderByExpression_Expression();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.selects.SqmlOrderByExpression#isDescending <em>Descending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descending</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlOrderByExpression#isDescending()
	 * @see #getSqmlOrderByExpression()
	 * @generated
	 */
	EAttribute getSqmlOrderByExpression_Descending();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.SqmlSelect <em>Sqml Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Select</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlSelect
	 * @generated
	 */
	EClass getSqmlSelect();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.SqmlSelectClause <em>Sqml Select Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Select Clause</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlSelectClause
	 * @generated
	 */
	EClass getSqmlSelectClause();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.selects.SqmlSelectClause#isDistinct <em>Distinct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distinct</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlSelectClause#isDistinct()
	 * @see #getSqmlSelectClause()
	 * @generated
	 */
	EAttribute getSqmlSelectClause_Distinct();

	/**
	 * Returns the meta object for the containment reference list '{@link com.softicar.sqml.model.selects.SqmlSelectClause#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlSelectClause#getColumns()
	 * @see #getSqmlSelectClause()
	 * @generated
	 */
	EReference getSqmlSelectClause_Columns();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.SqmlSelectColumn <em>Sqml Select Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Select Column</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlSelectColumn
	 * @generated
	 */
	EClass getSqmlSelectColumn();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.selects.SqmlSelectColumn#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlSelectColumn#getAlias()
	 * @see #getSqmlSelectColumn()
	 * @generated
	 */
	EAttribute getSqmlSelectColumn_Alias();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.selects.SqmlSelectColumn#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlSelectColumn#getTitle()
	 * @see #getSqmlSelectColumn()
	 * @generated
	 */
	EAttribute getSqmlSelectColumn_Title();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.selects.SqmlSelectColumn#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlSelectColumn#getExpression()
	 * @see #getSqmlSelectColumn()
	 * @generated
	 */
	EReference getSqmlSelectColumn_Expression();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.selects.SqmlSelectColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlSelectColumn#getName()
	 * @see #getSqmlSelectColumn()
	 * @generated
	 */
	EAttribute getSqmlSelectColumn_Name();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.SqmlSelectElse <em>Sqml Select Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Select Else</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlSelectElse
	 * @generated
	 */
	EClass getSqmlSelectElse();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.SqmlSelectElseIf <em>Sqml Select Else If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Select Else If</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlSelectElseIf
	 * @generated
	 */
	EClass getSqmlSelectElseIf();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.selects.SqmlSelectElseIf#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlSelectElseIf#getCondition()
	 * @see #getSqmlSelectElseIf()
	 * @generated
	 */
	EReference getSqmlSelectElseIf_Condition();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.SqmlSelectIf <em>Sqml Select If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Select If</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlSelectIf
	 * @generated
	 */
	EClass getSqmlSelectIf();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.selects.SqmlSelectIf#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlSelectIf#getCondition()
	 * @see #getSqmlSelectIf()
	 * @generated
	 */
	EReference getSqmlSelectIf_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link com.softicar.sqml.model.selects.SqmlSelectIf#getElseIfs <em>Else Ifs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else Ifs</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlSelectIf#getElseIfs()
	 * @see #getSqmlSelectIf()
	 * @generated
	 */
	EReference getSqmlSelectIf_ElseIfs();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.selects.SqmlSelectIf#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlSelectIf#getElse()
	 * @see #getSqmlSelectIf()
	 * @generated
	 */
	EReference getSqmlSelectIf_Else();

	/**
	 * Returns the meta object for the '{@link com.softicar.sqml.model.selects.SqmlSelectIf#getAllElements() <em>Get All Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Elements</em>' operation.
	 * @see com.softicar.sqml.model.selects.SqmlSelectIf#getAllElements()
	 * @generated
	 */
	EOperation getSqmlSelectIf__GetAllElements();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.SqmlSubSelectVariable <em>Sqml Sub Select Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Sub Select Variable</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlSubSelectVariable
	 * @generated
	 */
	EClass getSqmlSubSelectVariable();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.selects.SqmlSubSelectVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlSubSelectVariable#getName()
	 * @see #getSqmlSubSelectVariable()
	 * @generated
	 */
	EAttribute getSqmlSubSelectVariable_Name();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.selects.SqmlSubSelectVariable#getSubSelect <em>Sub Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Select</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlSubSelectVariable#getSubSelect()
	 * @see #getSqmlSubSelectVariable()
	 * @generated
	 */
	EReference getSqmlSubSelectVariable_SubSelect();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.SqmlTableVariable <em>Sqml Table Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Table Variable</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlTableVariable
	 * @generated
	 */
	EClass getSqmlTableVariable();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.selects.SqmlTableVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlTableVariable#getName()
	 * @see #getSqmlTableVariable()
	 * @generated
	 */
	EAttribute getSqmlTableVariable_Name();

	/**
	 * Returns the meta object for the reference '{@link com.softicar.sqml.model.selects.SqmlTableVariable#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlTableVariable#getTable()
	 * @see #getSqmlTableVariable()
	 * @generated
	 */
	EReference getSqmlTableVariable_Table();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.SqmlWhereClause <em>Sqml Where Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Where Clause</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlWhereClause
	 * @generated
	 */
	EClass getSqmlWhereClause();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.selects.SqmlWhereClause#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see com.softicar.sqml.model.selects.SqmlWhereClause#getCondition()
	 * @see #getSqmlWhereClause()
	 * @generated
	 */
	EReference getSqmlWhereClause_Condition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SelectsFactory getSelectsFactory();

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
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.impl.AbstractSqmlSelectBlockImpl <em>Abstract Sqml Select Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.impl.AbstractSqmlSelectBlockImpl
		 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getAbstractSqmlSelectBlock()
		 * @generated
		 */
		EClass ABSTRACT_SQML_SELECT_BLOCK = eINSTANCE.getAbstractSqmlSelectBlock();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_SQML_SELECT_BLOCK__PARTS = eINSTANCE.getAbstractSqmlSelectBlock_Parts();

		/**
		 * The meta object literal for the '<em><b>Get All Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_SQML_SELECT_BLOCK___GET_ALL_ELEMENTS = eINSTANCE.getAbstractSqmlSelectBlock__GetAllElements();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.impl.SqmlForeignKeyVariableImpl <em>Sqml Foreign Key Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.impl.SqmlForeignKeyVariableImpl
		 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getSqmlForeignKeyVariable()
		 * @generated
		 */
		EClass SQML_FOREIGN_KEY_VARIABLE = eINSTANCE.getSqmlForeignKeyVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_FOREIGN_KEY_VARIABLE__NAME = eINSTANCE.getSqmlForeignKeyVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_FOREIGN_KEY_VARIABLE__VARIABLE = eINSTANCE.getSqmlForeignKeyVariable_Variable();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_FOREIGN_KEY_VARIABLE__COLUMN = eINSTANCE.getSqmlForeignKeyVariable_Column();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.impl.SqmlFromClauseImpl <em>Sqml From Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.impl.SqmlFromClauseImpl
		 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getSqmlFromClause()
		 * @generated
		 */
		EClass SQML_FROM_CLAUSE = eINSTANCE.getSqmlFromClause();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_FROM_CLAUSE__VARIABLE = eINSTANCE.getSqmlFromClause_Variable();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.impl.SqmlGroupByClauseImpl <em>Sqml Group By Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.impl.SqmlGroupByClauseImpl
		 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getSqmlGroupByClause()
		 * @generated
		 */
		EClass SQML_GROUP_BY_CLAUSE = eINSTANCE.getSqmlGroupByClause();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_GROUP_BY_CLAUSE__EXPRESSIONS = eINSTANCE.getSqmlGroupByClause_Expressions();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.impl.SqmlHavingClauseImpl <em>Sqml Having Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.impl.SqmlHavingClauseImpl
		 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getSqmlHavingClause()
		 * @generated
		 */
		EClass SQML_HAVING_CLAUSE = eINSTANCE.getSqmlHavingClause();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_HAVING_CLAUSE__CONDITION = eINSTANCE.getSqmlHavingClause_Condition();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.impl.SqmlJoinClauseImpl <em>Sqml Join Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.impl.SqmlJoinClauseImpl
		 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getSqmlJoinClause()
		 * @generated
		 */
		EClass SQML_JOIN_CLAUSE = eINSTANCE.getSqmlJoinClause();

		/**
		 * The meta object literal for the '<em><b>Left Join</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_JOIN_CLAUSE__LEFT_JOIN = eINSTANCE.getSqmlJoinClause_LeftJoin();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_JOIN_CLAUSE__VARIABLE = eINSTANCE.getSqmlJoinClause_Variable();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_JOIN_CLAUSE__CONDITIONS = eINSTANCE.getSqmlJoinClause_Conditions();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.impl.SqmlOrderByClauseImpl <em>Sqml Order By Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.impl.SqmlOrderByClauseImpl
		 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getSqmlOrderByClause()
		 * @generated
		 */
		EClass SQML_ORDER_BY_CLAUSE = eINSTANCE.getSqmlOrderByClause();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_ORDER_BY_CLAUSE__EXPRESSIONS = eINSTANCE.getSqmlOrderByClause_Expressions();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.impl.SqmlOrderByExpressionImpl <em>Sqml Order By Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.impl.SqmlOrderByExpressionImpl
		 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getSqmlOrderByExpression()
		 * @generated
		 */
		EClass SQML_ORDER_BY_EXPRESSION = eINSTANCE.getSqmlOrderByExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_ORDER_BY_EXPRESSION__EXPRESSION = eINSTANCE.getSqmlOrderByExpression_Expression();

		/**
		 * The meta object literal for the '<em><b>Descending</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_ORDER_BY_EXPRESSION__DESCENDING = eINSTANCE.getSqmlOrderByExpression_Descending();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.impl.SqmlSelectImpl <em>Sqml Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.impl.SqmlSelectImpl
		 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getSqmlSelect()
		 * @generated
		 */
		EClass SQML_SELECT = eINSTANCE.getSqmlSelect();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.impl.SqmlSelectClauseImpl <em>Sqml Select Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.impl.SqmlSelectClauseImpl
		 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getSqmlSelectClause()
		 * @generated
		 */
		EClass SQML_SELECT_CLAUSE = eINSTANCE.getSqmlSelectClause();

		/**
		 * The meta object literal for the '<em><b>Distinct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_SELECT_CLAUSE__DISTINCT = eINSTANCE.getSqmlSelectClause_Distinct();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_SELECT_CLAUSE__COLUMNS = eINSTANCE.getSqmlSelectClause_Columns();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.impl.SqmlSelectColumnImpl <em>Sqml Select Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.impl.SqmlSelectColumnImpl
		 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getSqmlSelectColumn()
		 * @generated
		 */
		EClass SQML_SELECT_COLUMN = eINSTANCE.getSqmlSelectColumn();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_SELECT_COLUMN__ALIAS = eINSTANCE.getSqmlSelectColumn_Alias();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_SELECT_COLUMN__TITLE = eINSTANCE.getSqmlSelectColumn_Title();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_SELECT_COLUMN__EXPRESSION = eINSTANCE.getSqmlSelectColumn_Expression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_SELECT_COLUMN__NAME = eINSTANCE.getSqmlSelectColumn_Name();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.impl.SqmlSelectElseImpl <em>Sqml Select Else</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.impl.SqmlSelectElseImpl
		 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getSqmlSelectElse()
		 * @generated
		 */
		EClass SQML_SELECT_ELSE = eINSTANCE.getSqmlSelectElse();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.impl.SqmlSelectElseIfImpl <em>Sqml Select Else If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.impl.SqmlSelectElseIfImpl
		 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getSqmlSelectElseIf()
		 * @generated
		 */
		EClass SQML_SELECT_ELSE_IF = eINSTANCE.getSqmlSelectElseIf();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_SELECT_ELSE_IF__CONDITION = eINSTANCE.getSqmlSelectElseIf_Condition();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.impl.SqmlSelectIfImpl <em>Sqml Select If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.impl.SqmlSelectIfImpl
		 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getSqmlSelectIf()
		 * @generated
		 */
		EClass SQML_SELECT_IF = eINSTANCE.getSqmlSelectIf();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_SELECT_IF__CONDITION = eINSTANCE.getSqmlSelectIf_Condition();

		/**
		 * The meta object literal for the '<em><b>Else Ifs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_SELECT_IF__ELSE_IFS = eINSTANCE.getSqmlSelectIf_ElseIfs();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_SELECT_IF__ELSE = eINSTANCE.getSqmlSelectIf_Else();

		/**
		 * The meta object literal for the '<em><b>Get All Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SQML_SELECT_IF___GET_ALL_ELEMENTS = eINSTANCE.getSqmlSelectIf__GetAllElements();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.impl.SqmlSubSelectVariableImpl <em>Sqml Sub Select Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.impl.SqmlSubSelectVariableImpl
		 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getSqmlSubSelectVariable()
		 * @generated
		 */
		EClass SQML_SUB_SELECT_VARIABLE = eINSTANCE.getSqmlSubSelectVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_SUB_SELECT_VARIABLE__NAME = eINSTANCE.getSqmlSubSelectVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Sub Select</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_SUB_SELECT_VARIABLE__SUB_SELECT = eINSTANCE.getSqmlSubSelectVariable_SubSelect();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.impl.SqmlTableVariableImpl <em>Sqml Table Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.impl.SqmlTableVariableImpl
		 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getSqmlTableVariable()
		 * @generated
		 */
		EClass SQML_TABLE_VARIABLE = eINSTANCE.getSqmlTableVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_TABLE_VARIABLE__NAME = eINSTANCE.getSqmlTableVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_TABLE_VARIABLE__TABLE = eINSTANCE.getSqmlTableVariable_Table();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.impl.SqmlWhereClauseImpl <em>Sqml Where Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.impl.SqmlWhereClauseImpl
		 * @see com.softicar.sqml.model.selects.impl.SelectsPackageImpl#getSqmlWhereClause()
		 * @generated
		 */
		EClass SQML_WHERE_CLAUSE = eINSTANCE.getSqmlWhereClause();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_WHERE_CLAUSE__CONDITION = eINSTANCE.getSqmlWhereClause_Condition();

	}

} //SelectsPackage
