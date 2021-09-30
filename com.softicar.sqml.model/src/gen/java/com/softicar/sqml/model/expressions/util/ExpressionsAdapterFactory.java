/**
 */
package com.softicar.sqml.model.expressions.util;

import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.ISqmlValue;

import com.softicar.sqml.model.expressions.*;

import com.softicar.sqml.model.functions.ISqmlFunctionCall;

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
 * @see com.softicar.sqml.model.expressions.ExpressionsPackage
 * @generated
 */
public class ExpressionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExpressionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExpressionsPackage.eINSTANCE;
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
	protected ExpressionsSwitch<Adapter> modelSwitch =
		new ExpressionsSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractSqmlBinaryOperation(AbstractSqmlBinaryOperation object) {
				return createAbstractSqmlBinaryOperationAdapter();
			}
			@Override
			public Adapter caseSqmlNegation(SqmlNegation object) {
				return createSqmlNegationAdapter();
			}
			@Override
			public Adapter caseSqmlAddition(SqmlAddition object) {
				return createSqmlAdditionAdapter();
			}
			@Override
			public Adapter caseSqmlMultiplication(SqmlMultiplication object) {
				return createSqmlMultiplicationAdapter();
			}
			@Override
			public Adapter caseSqmlStaticVariableReference(SqmlStaticVariableReference object) {
				return createSqmlStaticVariableReferenceAdapter();
			}
			@Override
			public Adapter caseSqmlPath(SqmlPath object) {
				return createSqmlPathAdapter();
			}
			@Override
			public Adapter caseSqmlGroupConcat(SqmlGroupConcat object) {
				return createSqmlGroupConcatAdapter();
			}
			@Override
			public Adapter caseSqmlCase(SqmlCase object) {
				return createSqmlCaseAdapter();
			}
			@Override
			public Adapter caseSqmlCaseWhen(SqmlCaseWhen object) {
				return createSqmlCaseWhenAdapter();
			}
			@Override
			public Adapter caseSqmlIf(SqmlIf object) {
				return createSqmlIfAdapter();
			}
			@Override
			public Adapter caseSqmlIfNull(SqmlIfNull object) {
				return createSqmlIfNullAdapter();
			}
			@Override
			public Adapter caseSqmlRowConstructor(SqmlRowConstructor object) {
				return createSqmlRowConstructorAdapter();
			}
			@Override
			public Adapter caseSqmlStaticAnd(SqmlStaticAnd object) {
				return createSqmlStaticAndAdapter();
			}
			@Override
			public Adapter caseSqmlStaticIf(SqmlStaticIf object) {
				return createSqmlStaticIfAdapter();
			}
			@Override
			public Adapter caseSqmlStaticIsEmpty(SqmlStaticIsEmpty object) {
				return createSqmlStaticIsEmptyAdapter();
			}
			@Override
			public Adapter caseSqmlStaticIsNull(SqmlStaticIsNull object) {
				return createSqmlStaticIsNullAdapter();
			}
			@Override
			public Adapter caseSqmlStaticIsTrue(SqmlStaticIsTrue object) {
				return createSqmlStaticIsTrueAdapter();
			}
			@Override
			public Adapter caseSqmlStaticOr(SqmlStaticOr object) {
				return createSqmlStaticOrAdapter();
			}
			@Override
			public Adapter caseSqmlStaticParentheses(SqmlStaticParentheses object) {
				return createSqmlStaticParenthesesAdapter();
			}
			@Override
			public Adapter caseSqmlSubSelect(SqmlSubSelect object) {
				return createSqmlSubSelectAdapter();
			}
			@Override
			public Adapter caseSqmlValueReference(SqmlValueReference object) {
				return createSqmlValueReferenceAdapter();
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
			public Adapter caseISqmlFunctionCall(ISqmlFunctionCall object) {
				return createISqmlFunctionCallAdapter();
			}
			@Override
			public Adapter caseISqmlBinaryOperation(ISqmlBinaryOperation object) {
				return createISqmlBinaryOperationAdapter();
			}
			@Override
			public Adapter caseISqmlUnaryOperation(ISqmlUnaryOperation object) {
				return createISqmlUnaryOperationAdapter();
			}
			@Override
			public Adapter caseISqmlNegation(ISqmlNegation object) {
				return createISqmlNegationAdapter();
			}
			@Override
			public Adapter caseISqmlAddition(ISqmlAddition object) {
				return createISqmlAdditionAdapter();
			}
			@Override
			public Adapter caseISqmlMultiplication(ISqmlMultiplication object) {
				return createISqmlMultiplicationAdapter();
			}
			@Override
			public Adapter caseISqmlStaticExpression(ISqmlStaticExpression object) {
				return createISqmlStaticExpressionAdapter();
			}
			@Override
			public Adapter caseISqmlStaticVariableReference(ISqmlStaticVariableReference object) {
				return createISqmlStaticVariableReferenceAdapter();
			}
			@Override
			public Adapter caseISqmlValidatable(ISqmlValidatable object) {
				return createISqmlValidatableAdapter();
			}
			@Override
			public Adapter caseISqmlPath(ISqmlPath object) {
				return createISqmlPathAdapter();
			}
			@Override
			public Adapter caseISqmlGroupConcat(ISqmlGroupConcat object) {
				return createISqmlGroupConcatAdapter();
			}
			@Override
			public Adapter caseISqmlCase(ISqmlCase object) {
				return createISqmlCaseAdapter();
			}
			@Override
			public Adapter caseISqmlCaseWhen(ISqmlCaseWhen object) {
				return createISqmlCaseWhenAdapter();
			}
			@Override
			public Adapter caseISqmlIf(ISqmlIf object) {
				return createISqmlIfAdapter();
			}
			@Override
			public Adapter caseISqmlIfNull(ISqmlIfNull object) {
				return createISqmlIfNullAdapter();
			}
			@Override
			public Adapter caseISqmlRowConstructor(ISqmlRowConstructor object) {
				return createISqmlRowConstructorAdapter();
			}
			@Override
			public Adapter caseISqmlStaticAnd(ISqmlStaticAnd object) {
				return createISqmlStaticAndAdapter();
			}
			@Override
			public Adapter caseISqmlStaticIf(ISqmlStaticIf object) {
				return createISqmlStaticIfAdapter();
			}
			@Override
			public Adapter caseISqmlStaticParameterTest(ISqmlStaticParameterTest object) {
				return createISqmlStaticParameterTestAdapter();
			}
			@Override
			public Adapter caseISqmlStaticIsEmpty(ISqmlStaticIsEmpty object) {
				return createISqmlStaticIsEmptyAdapter();
			}
			@Override
			public Adapter caseISqmlStaticIsNull(ISqmlStaticIsNull object) {
				return createISqmlStaticIsNullAdapter();
			}
			@Override
			public Adapter caseISqmlStaticIsTrue(ISqmlStaticIsTrue object) {
				return createISqmlStaticIsTrueAdapter();
			}
			@Override
			public Adapter caseISqmlStaticOr(ISqmlStaticOr object) {
				return createISqmlStaticOrAdapter();
			}
			@Override
			public Adapter caseISqmlStaticParentheses(ISqmlStaticParentheses object) {
				return createISqmlStaticParenthesesAdapter();
			}
			@Override
			public Adapter caseISqmlSubSelect(ISqmlSubSelect object) {
				return createISqmlSubSelectAdapter();
			}
			@Override
			public Adapter caseISqmlValueReference(ISqmlValueReference object) {
				return createISqmlValueReferenceAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.AbstractSqmlBinaryOperation <em>Abstract Sqml Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.AbstractSqmlBinaryOperation
	 * @generated
	 */
	public Adapter createAbstractSqmlBinaryOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.SqmlNegation <em>Sqml Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.SqmlNegation
	 * @generated
	 */
	public Adapter createSqmlNegationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.SqmlAddition <em>Sqml Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.SqmlAddition
	 * @generated
	 */
	public Adapter createSqmlAdditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.SqmlMultiplication <em>Sqml Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.SqmlMultiplication
	 * @generated
	 */
	public Adapter createSqmlMultiplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.SqmlStaticVariableReference <em>Sqml Static Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.SqmlStaticVariableReference
	 * @generated
	 */
	public Adapter createSqmlStaticVariableReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.SqmlPath <em>Sqml Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.SqmlPath
	 * @generated
	 */
	public Adapter createSqmlPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.SqmlGroupConcat <em>Sqml Group Concat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.SqmlGroupConcat
	 * @generated
	 */
	public Adapter createSqmlGroupConcatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.SqmlCase <em>Sqml Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.SqmlCase
	 * @generated
	 */
	public Adapter createSqmlCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.SqmlCaseWhen <em>Sqml Case When</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.SqmlCaseWhen
	 * @generated
	 */
	public Adapter createSqmlCaseWhenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.SqmlIf <em>Sqml If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.SqmlIf
	 * @generated
	 */
	public Adapter createSqmlIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.SqmlIfNull <em>Sqml If Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.SqmlIfNull
	 * @generated
	 */
	public Adapter createSqmlIfNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.SqmlRowConstructor <em>Sqml Row Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.SqmlRowConstructor
	 * @generated
	 */
	public Adapter createSqmlRowConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.SqmlStaticAnd <em>Sqml Static And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.SqmlStaticAnd
	 * @generated
	 */
	public Adapter createSqmlStaticAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.SqmlStaticIf <em>Sqml Static If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.SqmlStaticIf
	 * @generated
	 */
	public Adapter createSqmlStaticIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.SqmlStaticIsEmpty <em>Sqml Static Is Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.SqmlStaticIsEmpty
	 * @generated
	 */
	public Adapter createSqmlStaticIsEmptyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.SqmlStaticIsNull <em>Sqml Static Is Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.SqmlStaticIsNull
	 * @generated
	 */
	public Adapter createSqmlStaticIsNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.SqmlStaticIsTrue <em>Sqml Static Is True</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.SqmlStaticIsTrue
	 * @generated
	 */
	public Adapter createSqmlStaticIsTrueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.SqmlStaticOr <em>Sqml Static Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.SqmlStaticOr
	 * @generated
	 */
	public Adapter createSqmlStaticOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.SqmlStaticParentheses <em>Sqml Static Parentheses</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.SqmlStaticParentheses
	 * @generated
	 */
	public Adapter createSqmlStaticParenthesesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.SqmlSubSelect <em>Sqml Sub Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.SqmlSubSelect
	 * @generated
	 */
	public Adapter createSqmlSubSelectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.SqmlValueReference <em>Sqml Value Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.SqmlValueReference
	 * @generated
	 */
	public Adapter createSqmlValueReferenceAdapter() {
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
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.functions.ISqmlFunctionCall <em>ISqml Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.functions.ISqmlFunctionCall
	 * @generated
	 */
	public Adapter createISqmlFunctionCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlBinaryOperation <em>ISqml Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlBinaryOperation
	 * @generated
	 */
	public Adapter createISqmlBinaryOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlUnaryOperation <em>ISqml Unary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlUnaryOperation
	 * @generated
	 */
	public Adapter createISqmlUnaryOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlNegation <em>ISqml Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlNegation
	 * @generated
	 */
	public Adapter createISqmlNegationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlAddition <em>ISqml Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlAddition
	 * @generated
	 */
	public Adapter createISqmlAdditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlMultiplication <em>ISqml Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlMultiplication
	 * @generated
	 */
	public Adapter createISqmlMultiplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlStaticExpression <em>ISqml Static Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticExpression
	 * @generated
	 */
	public Adapter createISqmlStaticExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlStaticVariableReference <em>ISqml Static Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticVariableReference
	 * @generated
	 */
	public Adapter createISqmlStaticVariableReferenceAdapter() {
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
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlPath <em>ISqml Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlPath
	 * @generated
	 */
	public Adapter createISqmlPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlGroupConcat <em>ISqml Group Concat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlGroupConcat
	 * @generated
	 */
	public Adapter createISqmlGroupConcatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlCase <em>ISqml Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlCase
	 * @generated
	 */
	public Adapter createISqmlCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlCaseWhen <em>ISqml Case When</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlCaseWhen
	 * @generated
	 */
	public Adapter createISqmlCaseWhenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlIf <em>ISqml If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlIf
	 * @generated
	 */
	public Adapter createISqmlIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlIfNull <em>ISqml If Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlIfNull
	 * @generated
	 */
	public Adapter createISqmlIfNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlRowConstructor <em>ISqml Row Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlRowConstructor
	 * @generated
	 */
	public Adapter createISqmlRowConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlStaticAnd <em>ISqml Static And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticAnd
	 * @generated
	 */
	public Adapter createISqmlStaticAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlStaticIf <em>ISqml Static If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticIf
	 * @generated
	 */
	public Adapter createISqmlStaticIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlStaticParameterTest <em>ISqml Static Parameter Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticParameterTest
	 * @generated
	 */
	public Adapter createISqmlStaticParameterTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlStaticIsEmpty <em>ISqml Static Is Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticIsEmpty
	 * @generated
	 */
	public Adapter createISqmlStaticIsEmptyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlStaticIsNull <em>ISqml Static Is Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticIsNull
	 * @generated
	 */
	public Adapter createISqmlStaticIsNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlStaticIsTrue <em>ISqml Static Is True</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticIsTrue
	 * @generated
	 */
	public Adapter createISqmlStaticIsTrueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlStaticOr <em>ISqml Static Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticOr
	 * @generated
	 */
	public Adapter createISqmlStaticOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlStaticParentheses <em>ISqml Static Parentheses</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticParentheses
	 * @generated
	 */
	public Adapter createISqmlStaticParenthesesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlSubSelect <em>ISqml Sub Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlSubSelect
	 * @generated
	 */
	public Adapter createISqmlSubSelectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlValueReference <em>ISqml Value Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlValueReference
	 * @generated
	 */
	public Adapter createISqmlValueReferenceAdapter() {
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

} //ExpressionsAdapterFactory
