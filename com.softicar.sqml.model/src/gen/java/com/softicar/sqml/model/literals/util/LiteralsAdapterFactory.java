/**
 */
package com.softicar.sqml.model.literals.util;

import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.ISqmlValue;

import com.softicar.sqml.model.expressions.ISqmlExpression;

import com.softicar.sqml.model.literals.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.softicar.sqml.model.literals.LiteralsPackage
 * @generated
 */
public class LiteralsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LiteralsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LiteralsPackage.eINSTANCE;
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
	protected LiteralsSwitch<Adapter> modelSwitch =
		new LiteralsSwitch<Adapter>() {
			@Override
			public Adapter caseSqmlBooleanLiteral(SqmlBooleanLiteral object) {
				return createSqmlBooleanLiteralAdapter();
			}
			@Override
			public Adapter caseSqmlIntegerLiteral(SqmlIntegerLiteral object) {
				return createSqmlIntegerLiteralAdapter();
			}
			@Override
			public Adapter caseSqmlLongLiteral(SqmlLongLiteral object) {
				return createSqmlLongLiteralAdapter();
			}
			@Override
			public Adapter caseSqmlFloatLiteral(SqmlFloatLiteral object) {
				return createSqmlFloatLiteralAdapter();
			}
			@Override
			public Adapter caseSqmlDoubleLiteral(SqmlDoubleLiteral object) {
				return createSqmlDoubleLiteralAdapter();
			}
			@Override
			public Adapter caseSqmlDecimalLiteral(SqmlDecimalLiteral object) {
				return createSqmlDecimalLiteralAdapter();
			}
			@Override
			public Adapter caseSqmlStringLiteral(SqmlStringLiteral object) {
				return createSqmlStringLiteralAdapter();
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
			public Adapter caseISqmlLiteral(ISqmlLiteral<?> object) {
				return createISqmlLiteralAdapter();
			}
			@Override
			public Adapter caseISqmlBooleanLiteral(ISqmlBooleanLiteral object) {
				return createISqmlBooleanLiteralAdapter();
			}
			@Override
			public Adapter caseISqmlIntegerLiteral(ISqmlIntegerLiteral object) {
				return createISqmlIntegerLiteralAdapter();
			}
			@Override
			public Adapter caseISqmlLongLiteral(ISqmlLongLiteral object) {
				return createISqmlLongLiteralAdapter();
			}
			@Override
			public Adapter caseISqmlFloatLiteral(ISqmlFloatLiteral object) {
				return createISqmlFloatLiteralAdapter();
			}
			@Override
			public Adapter caseISqmlDoubleLiteral(ISqmlDoubleLiteral object) {
				return createISqmlDoubleLiteralAdapter();
			}
			@Override
			public Adapter caseISqmlDecimalLiteral(ISqmlDecimalLiteral object) {
				return createISqmlDecimalLiteralAdapter();
			}
			@Override
			public Adapter caseISqmlStringLiteral(ISqmlStringLiteral object) {
				return createISqmlStringLiteralAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.literals.SqmlBooleanLiteral <em>Sqml Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.literals.SqmlBooleanLiteral
	 * @generated
	 */
	public Adapter createSqmlBooleanLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.literals.SqmlIntegerLiteral <em>Sqml Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.literals.SqmlIntegerLiteral
	 * @generated
	 */
	public Adapter createSqmlIntegerLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.literals.SqmlLongLiteral <em>Sqml Long Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.literals.SqmlLongLiteral
	 * @generated
	 */
	public Adapter createSqmlLongLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.literals.SqmlFloatLiteral <em>Sqml Float Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.literals.SqmlFloatLiteral
	 * @generated
	 */
	public Adapter createSqmlFloatLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.literals.SqmlDoubleLiteral <em>Sqml Double Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.literals.SqmlDoubleLiteral
	 * @generated
	 */
	public Adapter createSqmlDoubleLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.literals.SqmlDecimalLiteral <em>Sqml Decimal Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.literals.SqmlDecimalLiteral
	 * @generated
	 */
	public Adapter createSqmlDecimalLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.literals.SqmlStringLiteral <em>Sqml String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.literals.SqmlStringLiteral
	 * @generated
	 */
	public Adapter createSqmlStringLiteralAdapter() {
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
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.literals.ISqmlLiteral <em>ISqml Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.literals.ISqmlLiteral
	 * @generated
	 */
	public Adapter createISqmlLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.literals.ISqmlBooleanLiteral <em>ISqml Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.literals.ISqmlBooleanLiteral
	 * @generated
	 */
	public Adapter createISqmlBooleanLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.literals.ISqmlIntegerLiteral <em>ISqml Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.literals.ISqmlIntegerLiteral
	 * @generated
	 */
	public Adapter createISqmlIntegerLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.literals.ISqmlLongLiteral <em>ISqml Long Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.literals.ISqmlLongLiteral
	 * @generated
	 */
	public Adapter createISqmlLongLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.literals.ISqmlFloatLiteral <em>ISqml Float Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.literals.ISqmlFloatLiteral
	 * @generated
	 */
	public Adapter createISqmlFloatLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.literals.ISqmlDoubleLiteral <em>ISqml Double Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.literals.ISqmlDoubleLiteral
	 * @generated
	 */
	public Adapter createISqmlDoubleLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.literals.ISqmlDecimalLiteral <em>ISqml Decimal Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.literals.ISqmlDecimalLiteral
	 * @generated
	 */
	public Adapter createISqmlDecimalLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.literals.ISqmlStringLiteral <em>ISqml String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.literals.ISqmlStringLiteral
	 * @generated
	 */
	public Adapter createISqmlStringLiteralAdapter() {
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

} //LiteralsAdapterFactory
