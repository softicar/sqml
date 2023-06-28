/**
 */
package com.softicar.sqml.model.conditions.impl;

import com.softicar.sqml.model.conditions.ConditionsFactory;
import com.softicar.sqml.model.conditions.ConditionsPackage;
import com.softicar.sqml.model.conditions.SqmlAnd;
import com.softicar.sqml.model.conditions.SqmlBetween;
import com.softicar.sqml.model.conditions.SqmlComparison;
import com.softicar.sqml.model.conditions.SqmlExists;
import com.softicar.sqml.model.conditions.SqmlIn;
import com.softicar.sqml.model.conditions.SqmlIsNull;
import com.softicar.sqml.model.conditions.SqmlLike;
import com.softicar.sqml.model.conditions.SqmlNot;
import com.softicar.sqml.model.conditions.SqmlOr;
import com.softicar.sqml.model.conditions.SqmlRegexp;

import com.softicar.sqml.model.interfaces.InterfacesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class ConditionsPackageImpl extends EPackageImpl implements ConditionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlAndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlBetweenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlComparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlExistsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlIsNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlLikeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlNotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlOrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlRegexpEClass = null;

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
	 * @see com.softicar.sqml.model.conditions.ConditionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConditionsPackageImpl() {
		super(eNS_URI, ConditionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConditionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConditionsPackage init() {
		if (isInited) return (ConditionsPackage)EPackage.Registry.INSTANCE.getEPackage(ConditionsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredConditionsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ConditionsPackageImpl theConditionsPackage = registeredConditionsPackage instanceof ConditionsPackageImpl ? (ConditionsPackageImpl)registeredConditionsPackage : new ConditionsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		InterfacesPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theConditionsPackage.createPackageContents();

		// Initialize created meta-data
		theConditionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConditionsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConditionsPackage.eNS_URI, theConditionsPackage);
		return theConditionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSqmlAnd() {
		return sqmlAndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlAnd_Left() {
		return (EReference)sqmlAndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlAnd_Right() {
		return (EReference)sqmlAndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSqmlBetween() {
		return sqmlBetweenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlBetween_Operand() {
		return (EReference)sqmlBetweenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlBetween_Left() {
		return (EReference)sqmlBetweenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlBetween_Right() {
		return (EReference)sqmlBetweenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSqmlComparison() {
		return sqmlComparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlComparison_Function() {
		return (EReference)sqmlComparisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlComparison_Left() {
		return (EReference)sqmlComparisonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlComparison_Right() {
		return (EReference)sqmlComparisonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSqmlExists() {
		return sqmlExistsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlExists_SubSelect() {
		return (EReference)sqmlExistsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSqmlIn() {
		return sqmlInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSqmlIn_Not() {
		return (EAttribute)sqmlInEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlIn_Left() {
		return (EReference)sqmlInEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlIn_Right() {
		return (EReference)sqmlInEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSqmlIsNull() {
		return sqmlIsNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSqmlIsNull_Not() {
		return (EAttribute)sqmlIsNullEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlIsNull_Operand() {
		return (EReference)sqmlIsNullEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSqmlLike() {
		return sqmlLikeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSqmlLike_Not() {
		return (EAttribute)sqmlLikeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlLike_Left() {
		return (EReference)sqmlLikeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlLike_Right() {
		return (EReference)sqmlLikeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSqmlLike_Escape() {
		return (EAttribute)sqmlLikeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSqmlNot() {
		return sqmlNotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlNot_Condition() {
		return (EReference)sqmlNotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSqmlOr() {
		return sqmlOrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlOr_Left() {
		return (EReference)sqmlOrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlOr_Right() {
		return (EReference)sqmlOrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSqmlRegexp() {
		return sqmlRegexpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSqmlRegexp_Not() {
		return (EAttribute)sqmlRegexpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlRegexp_Operand() {
		return (EReference)sqmlRegexpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlRegexp_Regexp() {
		return (EReference)sqmlRegexpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionsFactory getConditionsFactory() {
		return (ConditionsFactory)getEFactoryInstance();
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
		sqmlAndEClass = createEClass(SQML_AND);
		createEReference(sqmlAndEClass, SQML_AND__LEFT);
		createEReference(sqmlAndEClass, SQML_AND__RIGHT);

		sqmlBetweenEClass = createEClass(SQML_BETWEEN);
		createEReference(sqmlBetweenEClass, SQML_BETWEEN__OPERAND);
		createEReference(sqmlBetweenEClass, SQML_BETWEEN__LEFT);
		createEReference(sqmlBetweenEClass, SQML_BETWEEN__RIGHT);

		sqmlComparisonEClass = createEClass(SQML_COMPARISON);
		createEReference(sqmlComparisonEClass, SQML_COMPARISON__FUNCTION);
		createEReference(sqmlComparisonEClass, SQML_COMPARISON__LEFT);
		createEReference(sqmlComparisonEClass, SQML_COMPARISON__RIGHT);

		sqmlExistsEClass = createEClass(SQML_EXISTS);
		createEReference(sqmlExistsEClass, SQML_EXISTS__SUB_SELECT);

		sqmlInEClass = createEClass(SQML_IN);
		createEAttribute(sqmlInEClass, SQML_IN__NOT);
		createEReference(sqmlInEClass, SQML_IN__LEFT);
		createEReference(sqmlInEClass, SQML_IN__RIGHT);

		sqmlIsNullEClass = createEClass(SQML_IS_NULL);
		createEAttribute(sqmlIsNullEClass, SQML_IS_NULL__NOT);
		createEReference(sqmlIsNullEClass, SQML_IS_NULL__OPERAND);

		sqmlLikeEClass = createEClass(SQML_LIKE);
		createEAttribute(sqmlLikeEClass, SQML_LIKE__NOT);
		createEReference(sqmlLikeEClass, SQML_LIKE__LEFT);
		createEReference(sqmlLikeEClass, SQML_LIKE__RIGHT);
		createEAttribute(sqmlLikeEClass, SQML_LIKE__ESCAPE);

		sqmlNotEClass = createEClass(SQML_NOT);
		createEReference(sqmlNotEClass, SQML_NOT__CONDITION);

		sqmlOrEClass = createEClass(SQML_OR);
		createEReference(sqmlOrEClass, SQML_OR__LEFT);
		createEReference(sqmlOrEClass, SQML_OR__RIGHT);

		sqmlRegexpEClass = createEClass(SQML_REGEXP);
		createEAttribute(sqmlRegexpEClass, SQML_REGEXP__NOT);
		createEReference(sqmlRegexpEClass, SQML_REGEXP__OPERAND);
		createEReference(sqmlRegexpEClass, SQML_REGEXP__REGEXP);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sqmlAndEClass.getESuperTypes().add(theInterfacesPackage.getISqmlAnd());
		sqmlBetweenEClass.getESuperTypes().add(theInterfacesPackage.getISqmlBetween());
		sqmlComparisonEClass.getESuperTypes().add(theInterfacesPackage.getISqmlComparison());
		sqmlExistsEClass.getESuperTypes().add(theInterfacesPackage.getISqmlExists());
		sqmlInEClass.getESuperTypes().add(theInterfacesPackage.getISqmlIn());
		sqmlIsNullEClass.getESuperTypes().add(theInterfacesPackage.getISqmlIsNull());
		sqmlLikeEClass.getESuperTypes().add(theInterfacesPackage.getISqmlLike());
		sqmlNotEClass.getESuperTypes().add(theInterfacesPackage.getISqmlNot());
		sqmlOrEClass.getESuperTypes().add(theInterfacesPackage.getISqmlOr());
		sqmlRegexpEClass.getESuperTypes().add(theInterfacesPackage.getISqmlRegexp());

		// Initialize classes, features, and operations; add parameters
		initEClass(sqmlAndEClass, SqmlAnd.class, "SqmlAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlAnd_Left(), theInterfacesPackage.getISqmlExpression(), null, "left", null, 0, 1, SqmlAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlAnd_Right(), theInterfacesPackage.getISqmlExpression(), null, "right", null, 0, 1, SqmlAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlBetweenEClass, SqmlBetween.class, "SqmlBetween", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlBetween_Operand(), theInterfacesPackage.getISqmlExpression(), null, "operand", null, 0, 1, SqmlBetween.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlBetween_Left(), theInterfacesPackage.getISqmlExpression(), null, "left", null, 0, 1, SqmlBetween.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlBetween_Right(), theInterfacesPackage.getISqmlExpression(), null, "right", null, 0, 1, SqmlBetween.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlComparisonEClass, SqmlComparison.class, "SqmlComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlComparison_Function(), theInterfacesPackage.getISqmlFunction(), null, "function", null, 0, 1, SqmlComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlComparison_Left(), theInterfacesPackage.getISqmlExpression(), null, "left", null, 0, 1, SqmlComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlComparison_Right(), theInterfacesPackage.getISqmlExpression(), null, "right", null, 0, 1, SqmlComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlExistsEClass, SqmlExists.class, "SqmlExists", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlExists_SubSelect(), theInterfacesPackage.getISqmlSubSelect(), null, "subSelect", null, 0, 1, SqmlExists.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlInEClass, SqmlIn.class, "SqmlIn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlIn_Not(), theEcorePackage.getEBoolean(), "not", null, 0, 1, SqmlIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlIn_Left(), theInterfacesPackage.getISqmlExpression(), null, "left", null, 0, 1, SqmlIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlIn_Right(), theInterfacesPackage.getISqmlExpression(), null, "right", null, 0, 1, SqmlIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlIsNullEClass, SqmlIsNull.class, "SqmlIsNull", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlIsNull_Not(), theEcorePackage.getEBoolean(), "not", null, 0, 1, SqmlIsNull.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlIsNull_Operand(), theInterfacesPackage.getISqmlExpression(), null, "operand", null, 0, 1, SqmlIsNull.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlLikeEClass, SqmlLike.class, "SqmlLike", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlLike_Not(), theEcorePackage.getEBoolean(), "not", null, 0, 1, SqmlLike.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlLike_Left(), theInterfacesPackage.getISqmlExpression(), null, "left", null, 0, 1, SqmlLike.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlLike_Right(), theInterfacesPackage.getISqmlExpression(), null, "right", null, 0, 1, SqmlLike.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlLike_Escape(), theEcorePackage.getEString(), "escape", null, 0, 1, SqmlLike.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlNotEClass, SqmlNot.class, "SqmlNot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlNot_Condition(), theInterfacesPackage.getISqmlExpression(), null, "condition", null, 0, 1, SqmlNot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlOrEClass, SqmlOr.class, "SqmlOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlOr_Left(), theInterfacesPackage.getISqmlExpression(), null, "left", null, 0, 1, SqmlOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlOr_Right(), theInterfacesPackage.getISqmlExpression(), null, "right", null, 0, 1, SqmlOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlRegexpEClass, SqmlRegexp.class, "SqmlRegexp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlRegexp_Not(), theEcorePackage.getEBoolean(), "not", null, 0, 1, SqmlRegexp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlRegexp_Operand(), theInterfacesPackage.getISqmlExpression(), null, "operand", null, 0, 1, SqmlRegexp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlRegexp_Regexp(), theInterfacesPackage.getISqmlExpression(), null, "regexp", null, 0, 1, SqmlRegexp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ConditionsPackageImpl
