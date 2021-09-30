/**
 */
package com.softicar.sqml.model.conditions;

import com.softicar.sqml.model.interfaces.InterfacesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see com.softicar.sqml.model.conditions.ConditionsFactory
 * @model kind="package"
 * @generated
 */
public interface ConditionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "conditions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "com.softicar.sqml.model.conditions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "conditions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConditionsPackage eINSTANCE = com.softicar.sqml.model.conditions.impl.ConditionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.conditions.impl.SqmlAndImpl <em>Sqml And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.conditions.impl.SqmlAndImpl
	 * @see com.softicar.sqml.model.conditions.impl.ConditionsPackageImpl#getSqmlAnd()
	 * @generated
	 */
	int SQML_AND = 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_AND__LEFT = InterfacesPackage.ISQML_AND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_AND__RIGHT = InterfacesPackage.ISQML_AND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sqml And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_AND_FEATURE_COUNT = InterfacesPackage.ISQML_AND_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sqml And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_AND_OPERATION_COUNT = InterfacesPackage.ISQML_AND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.conditions.impl.SqmlBetweenImpl <em>Sqml Between</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.conditions.impl.SqmlBetweenImpl
	 * @see com.softicar.sqml.model.conditions.impl.ConditionsPackageImpl#getSqmlBetween()
	 * @generated
	 */
	int SQML_BETWEEN = 1;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_BETWEEN__OPERAND = InterfacesPackage.ISQML_BETWEEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_BETWEEN__LEFT = InterfacesPackage.ISQML_BETWEEN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_BETWEEN__RIGHT = InterfacesPackage.ISQML_BETWEEN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sqml Between</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_BETWEEN_FEATURE_COUNT = InterfacesPackage.ISQML_BETWEEN_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sqml Between</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_BETWEEN_OPERATION_COUNT = InterfacesPackage.ISQML_BETWEEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.conditions.impl.SqmlComparisonImpl <em>Sqml Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.conditions.impl.SqmlComparisonImpl
	 * @see com.softicar.sqml.model.conditions.impl.ConditionsPackageImpl#getSqmlComparison()
	 * @generated
	 */
	int SQML_COMPARISON = 2;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_COMPARISON__FUNCTION = InterfacesPackage.ISQML_COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_COMPARISON__LEFT = InterfacesPackage.ISQML_COMPARISON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_COMPARISON__RIGHT = InterfacesPackage.ISQML_COMPARISON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sqml Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_COMPARISON_FEATURE_COUNT = InterfacesPackage.ISQML_COMPARISON_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sqml Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_COMPARISON_OPERATION_COUNT = InterfacesPackage.ISQML_COMPARISON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.conditions.impl.SqmlExistsImpl <em>Sqml Exists</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.conditions.impl.SqmlExistsImpl
	 * @see com.softicar.sqml.model.conditions.impl.ConditionsPackageImpl#getSqmlExists()
	 * @generated
	 */
	int SQML_EXISTS = 3;

	/**
	 * The feature id for the '<em><b>Sub Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_EXISTS__SUB_SELECT = InterfacesPackage.ISQML_EXISTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sqml Exists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_EXISTS_FEATURE_COUNT = InterfacesPackage.ISQML_EXISTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sqml Exists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_EXISTS_OPERATION_COUNT = InterfacesPackage.ISQML_EXISTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.conditions.impl.SqmlInImpl <em>Sqml In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.conditions.impl.SqmlInImpl
	 * @see com.softicar.sqml.model.conditions.impl.ConditionsPackageImpl#getSqmlIn()
	 * @generated
	 */
	int SQML_IN = 4;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_IN__NOT = InterfacesPackage.ISQML_IN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_IN__LEFT = InterfacesPackage.ISQML_IN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_IN__RIGHT = InterfacesPackage.ISQML_IN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sqml In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_IN_FEATURE_COUNT = InterfacesPackage.ISQML_IN_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sqml In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_IN_OPERATION_COUNT = InterfacesPackage.ISQML_IN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.conditions.impl.SqmlIsNullImpl <em>Sqml Is Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.conditions.impl.SqmlIsNullImpl
	 * @see com.softicar.sqml.model.conditions.impl.ConditionsPackageImpl#getSqmlIsNull()
	 * @generated
	 */
	int SQML_IS_NULL = 5;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_IS_NULL__NOT = InterfacesPackage.ISQML_IS_NULL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_IS_NULL__OPERAND = InterfacesPackage.ISQML_IS_NULL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sqml Is Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_IS_NULL_FEATURE_COUNT = InterfacesPackage.ISQML_IS_NULL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sqml Is Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_IS_NULL_OPERATION_COUNT = InterfacesPackage.ISQML_IS_NULL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.conditions.impl.SqmlLikeImpl <em>Sqml Like</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.conditions.impl.SqmlLikeImpl
	 * @see com.softicar.sqml.model.conditions.impl.ConditionsPackageImpl#getSqmlLike()
	 * @generated
	 */
	int SQML_LIKE = 6;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_LIKE__NOT = InterfacesPackage.ISQML_LIKE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_LIKE__LEFT = InterfacesPackage.ISQML_LIKE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_LIKE__RIGHT = InterfacesPackage.ISQML_LIKE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Escape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_LIKE__ESCAPE = InterfacesPackage.ISQML_LIKE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sqml Like</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_LIKE_FEATURE_COUNT = InterfacesPackage.ISQML_LIKE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Sqml Like</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_LIKE_OPERATION_COUNT = InterfacesPackage.ISQML_LIKE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.conditions.impl.SqmlNotImpl <em>Sqml Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.conditions.impl.SqmlNotImpl
	 * @see com.softicar.sqml.model.conditions.impl.ConditionsPackageImpl#getSqmlNot()
	 * @generated
	 */
	int SQML_NOT = 7;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_NOT__CONDITION = InterfacesPackage.ISQML_NOT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sqml Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_NOT_FEATURE_COUNT = InterfacesPackage.ISQML_NOT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sqml Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_NOT_OPERATION_COUNT = InterfacesPackage.ISQML_NOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.conditions.impl.SqmlOrImpl <em>Sqml Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.conditions.impl.SqmlOrImpl
	 * @see com.softicar.sqml.model.conditions.impl.ConditionsPackageImpl#getSqmlOr()
	 * @generated
	 */
	int SQML_OR = 8;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_OR__LEFT = InterfacesPackage.ISQML_OR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_OR__RIGHT = InterfacesPackage.ISQML_OR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sqml Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_OR_FEATURE_COUNT = InterfacesPackage.ISQML_OR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sqml Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_OR_OPERATION_COUNT = InterfacesPackage.ISQML_OR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.conditions.impl.SqmlRegexpImpl <em>Sqml Regexp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.conditions.impl.SqmlRegexpImpl
	 * @see com.softicar.sqml.model.conditions.impl.ConditionsPackageImpl#getSqmlRegexp()
	 * @generated
	 */
	int SQML_REGEXP = 9;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_REGEXP__NOT = InterfacesPackage.ISQML_REGEXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_REGEXP__OPERAND = InterfacesPackage.ISQML_REGEXP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Regexp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_REGEXP__REGEXP = InterfacesPackage.ISQML_REGEXP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sqml Regexp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_REGEXP_FEATURE_COUNT = InterfacesPackage.ISQML_REGEXP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sqml Regexp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_REGEXP_OPERATION_COUNT = InterfacesPackage.ISQML_REGEXP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.conditions.SqmlAnd <em>Sqml And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml And</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlAnd
	 * @generated
	 */
	EClass getSqmlAnd();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.conditions.SqmlAnd#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlAnd#getLeft()
	 * @see #getSqmlAnd()
	 * @generated
	 */
	EReference getSqmlAnd_Left();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.conditions.SqmlAnd#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlAnd#getRight()
	 * @see #getSqmlAnd()
	 * @generated
	 */
	EReference getSqmlAnd_Right();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.conditions.SqmlBetween <em>Sqml Between</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Between</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlBetween
	 * @generated
	 */
	EClass getSqmlBetween();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.conditions.SqmlBetween#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlBetween#getOperand()
	 * @see #getSqmlBetween()
	 * @generated
	 */
	EReference getSqmlBetween_Operand();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.conditions.SqmlBetween#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlBetween#getLeft()
	 * @see #getSqmlBetween()
	 * @generated
	 */
	EReference getSqmlBetween_Left();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.conditions.SqmlBetween#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlBetween#getRight()
	 * @see #getSqmlBetween()
	 * @generated
	 */
	EReference getSqmlBetween_Right();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.conditions.SqmlComparison <em>Sqml Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Comparison</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlComparison
	 * @generated
	 */
	EClass getSqmlComparison();

	/**
	 * Returns the meta object for the reference '{@link com.softicar.sqml.model.conditions.SqmlComparison#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlComparison#getFunction()
	 * @see #getSqmlComparison()
	 * @generated
	 */
	EReference getSqmlComparison_Function();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.conditions.SqmlComparison#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlComparison#getLeft()
	 * @see #getSqmlComparison()
	 * @generated
	 */
	EReference getSqmlComparison_Left();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.conditions.SqmlComparison#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlComparison#getRight()
	 * @see #getSqmlComparison()
	 * @generated
	 */
	EReference getSqmlComparison_Right();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.conditions.SqmlExists <em>Sqml Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Exists</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlExists
	 * @generated
	 */
	EClass getSqmlExists();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.conditions.SqmlExists#getSubSelect <em>Sub Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Select</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlExists#getSubSelect()
	 * @see #getSqmlExists()
	 * @generated
	 */
	EReference getSqmlExists_SubSelect();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.conditions.SqmlIn <em>Sqml In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml In</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlIn
	 * @generated
	 */
	EClass getSqmlIn();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.conditions.SqmlIn#isNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlIn#isNot()
	 * @see #getSqmlIn()
	 * @generated
	 */
	EAttribute getSqmlIn_Not();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.conditions.SqmlIn#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlIn#getLeft()
	 * @see #getSqmlIn()
	 * @generated
	 */
	EReference getSqmlIn_Left();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.conditions.SqmlIn#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlIn#getRight()
	 * @see #getSqmlIn()
	 * @generated
	 */
	EReference getSqmlIn_Right();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.conditions.SqmlIsNull <em>Sqml Is Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Is Null</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlIsNull
	 * @generated
	 */
	EClass getSqmlIsNull();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.conditions.SqmlIsNull#isNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlIsNull#isNot()
	 * @see #getSqmlIsNull()
	 * @generated
	 */
	EAttribute getSqmlIsNull_Not();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.conditions.SqmlIsNull#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlIsNull#getOperand()
	 * @see #getSqmlIsNull()
	 * @generated
	 */
	EReference getSqmlIsNull_Operand();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.conditions.SqmlLike <em>Sqml Like</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Like</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlLike
	 * @generated
	 */
	EClass getSqmlLike();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.conditions.SqmlLike#isNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlLike#isNot()
	 * @see #getSqmlLike()
	 * @generated
	 */
	EAttribute getSqmlLike_Not();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.conditions.SqmlLike#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlLike#getLeft()
	 * @see #getSqmlLike()
	 * @generated
	 */
	EReference getSqmlLike_Left();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.conditions.SqmlLike#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlLike#getRight()
	 * @see #getSqmlLike()
	 * @generated
	 */
	EReference getSqmlLike_Right();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.conditions.SqmlLike#getEscape <em>Escape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Escape</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlLike#getEscape()
	 * @see #getSqmlLike()
	 * @generated
	 */
	EAttribute getSqmlLike_Escape();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.conditions.SqmlNot <em>Sqml Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Not</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlNot
	 * @generated
	 */
	EClass getSqmlNot();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.conditions.SqmlNot#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlNot#getCondition()
	 * @see #getSqmlNot()
	 * @generated
	 */
	EReference getSqmlNot_Condition();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.conditions.SqmlOr <em>Sqml Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Or</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlOr
	 * @generated
	 */
	EClass getSqmlOr();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.conditions.SqmlOr#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlOr#getLeft()
	 * @see #getSqmlOr()
	 * @generated
	 */
	EReference getSqmlOr_Left();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.conditions.SqmlOr#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlOr#getRight()
	 * @see #getSqmlOr()
	 * @generated
	 */
	EReference getSqmlOr_Right();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.conditions.SqmlRegexp <em>Sqml Regexp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Regexp</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlRegexp
	 * @generated
	 */
	EClass getSqmlRegexp();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.conditions.SqmlRegexp#isNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlRegexp#isNot()
	 * @see #getSqmlRegexp()
	 * @generated
	 */
	EAttribute getSqmlRegexp_Not();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.conditions.SqmlRegexp#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlRegexp#getOperand()
	 * @see #getSqmlRegexp()
	 * @generated
	 */
	EReference getSqmlRegexp_Operand();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.conditions.SqmlRegexp#getRegexp <em>Regexp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Regexp</em>'.
	 * @see com.softicar.sqml.model.conditions.SqmlRegexp#getRegexp()
	 * @see #getSqmlRegexp()
	 * @generated
	 */
	EReference getSqmlRegexp_Regexp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConditionsFactory getConditionsFactory();

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
		 * The meta object literal for the '{@link com.softicar.sqml.model.conditions.impl.SqmlAndImpl <em>Sqml And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.conditions.impl.SqmlAndImpl
		 * @see com.softicar.sqml.model.conditions.impl.ConditionsPackageImpl#getSqmlAnd()
		 * @generated
		 */
		EClass SQML_AND = eINSTANCE.getSqmlAnd();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_AND__LEFT = eINSTANCE.getSqmlAnd_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_AND__RIGHT = eINSTANCE.getSqmlAnd_Right();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.conditions.impl.SqmlBetweenImpl <em>Sqml Between</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.conditions.impl.SqmlBetweenImpl
		 * @see com.softicar.sqml.model.conditions.impl.ConditionsPackageImpl#getSqmlBetween()
		 * @generated
		 */
		EClass SQML_BETWEEN = eINSTANCE.getSqmlBetween();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_BETWEEN__OPERAND = eINSTANCE.getSqmlBetween_Operand();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_BETWEEN__LEFT = eINSTANCE.getSqmlBetween_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_BETWEEN__RIGHT = eINSTANCE.getSqmlBetween_Right();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.conditions.impl.SqmlComparisonImpl <em>Sqml Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.conditions.impl.SqmlComparisonImpl
		 * @see com.softicar.sqml.model.conditions.impl.ConditionsPackageImpl#getSqmlComparison()
		 * @generated
		 */
		EClass SQML_COMPARISON = eINSTANCE.getSqmlComparison();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_COMPARISON__FUNCTION = eINSTANCE.getSqmlComparison_Function();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_COMPARISON__LEFT = eINSTANCE.getSqmlComparison_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_COMPARISON__RIGHT = eINSTANCE.getSqmlComparison_Right();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.conditions.impl.SqmlExistsImpl <em>Sqml Exists</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.conditions.impl.SqmlExistsImpl
		 * @see com.softicar.sqml.model.conditions.impl.ConditionsPackageImpl#getSqmlExists()
		 * @generated
		 */
		EClass SQML_EXISTS = eINSTANCE.getSqmlExists();

		/**
		 * The meta object literal for the '<em><b>Sub Select</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_EXISTS__SUB_SELECT = eINSTANCE.getSqmlExists_SubSelect();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.conditions.impl.SqmlInImpl <em>Sqml In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.conditions.impl.SqmlInImpl
		 * @see com.softicar.sqml.model.conditions.impl.ConditionsPackageImpl#getSqmlIn()
		 * @generated
		 */
		EClass SQML_IN = eINSTANCE.getSqmlIn();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_IN__NOT = eINSTANCE.getSqmlIn_Not();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_IN__LEFT = eINSTANCE.getSqmlIn_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_IN__RIGHT = eINSTANCE.getSqmlIn_Right();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.conditions.impl.SqmlIsNullImpl <em>Sqml Is Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.conditions.impl.SqmlIsNullImpl
		 * @see com.softicar.sqml.model.conditions.impl.ConditionsPackageImpl#getSqmlIsNull()
		 * @generated
		 */
		EClass SQML_IS_NULL = eINSTANCE.getSqmlIsNull();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_IS_NULL__NOT = eINSTANCE.getSqmlIsNull_Not();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_IS_NULL__OPERAND = eINSTANCE.getSqmlIsNull_Operand();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.conditions.impl.SqmlLikeImpl <em>Sqml Like</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.conditions.impl.SqmlLikeImpl
		 * @see com.softicar.sqml.model.conditions.impl.ConditionsPackageImpl#getSqmlLike()
		 * @generated
		 */
		EClass SQML_LIKE = eINSTANCE.getSqmlLike();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_LIKE__NOT = eINSTANCE.getSqmlLike_Not();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_LIKE__LEFT = eINSTANCE.getSqmlLike_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_LIKE__RIGHT = eINSTANCE.getSqmlLike_Right();

		/**
		 * The meta object literal for the '<em><b>Escape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_LIKE__ESCAPE = eINSTANCE.getSqmlLike_Escape();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.conditions.impl.SqmlNotImpl <em>Sqml Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.conditions.impl.SqmlNotImpl
		 * @see com.softicar.sqml.model.conditions.impl.ConditionsPackageImpl#getSqmlNot()
		 * @generated
		 */
		EClass SQML_NOT = eINSTANCE.getSqmlNot();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_NOT__CONDITION = eINSTANCE.getSqmlNot_Condition();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.conditions.impl.SqmlOrImpl <em>Sqml Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.conditions.impl.SqmlOrImpl
		 * @see com.softicar.sqml.model.conditions.impl.ConditionsPackageImpl#getSqmlOr()
		 * @generated
		 */
		EClass SQML_OR = eINSTANCE.getSqmlOr();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_OR__LEFT = eINSTANCE.getSqmlOr_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_OR__RIGHT = eINSTANCE.getSqmlOr_Right();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.conditions.impl.SqmlRegexpImpl <em>Sqml Regexp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.conditions.impl.SqmlRegexpImpl
		 * @see com.softicar.sqml.model.conditions.impl.ConditionsPackageImpl#getSqmlRegexp()
		 * @generated
		 */
		EClass SQML_REGEXP = eINSTANCE.getSqmlRegexp();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_REGEXP__NOT = eINSTANCE.getSqmlRegexp_Not();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_REGEXP__OPERAND = eINSTANCE.getSqmlRegexp_Operand();

		/**
		 * The meta object literal for the '<em><b>Regexp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_REGEXP__REGEXP = eINSTANCE.getSqmlRegexp_Regexp();

	}

} //ConditionsPackage
