/**
 */
package com.softicar.sqml.model.functions.util;

import com.softicar.sqml.model.ISqmlGeneratable;
import com.softicar.sqml.model.ISqmlGlobalObject;
import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.ISqmlStaticVariable;
import com.softicar.sqml.model.ISqmlValue;

import com.softicar.sqml.model.expressions.ISqmlExpression;

import com.softicar.sqml.model.files.ISqmlFileElement;
import com.softicar.sqml.model.files.SqmlFileElement;

import com.softicar.sqml.model.functions.*;

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
 * @see com.softicar.sqml.model.functions.FunctionsPackage
 * @generated
 */
public class FunctionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FunctionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FunctionsPackage.eINSTANCE;
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
	protected FunctionsSwitch<Adapter> modelSwitch =
		new FunctionsSwitch<Adapter>() {
			@Override
			public Adapter caseSqmlFunction(SqmlFunction object) {
				return createSqmlFunctionAdapter();
			}
			@Override
			public Adapter caseSqmlFunctionCall(SqmlFunctionCall object) {
				return createSqmlFunctionCallAdapter();
			}
			@Override
			public Adapter caseSqmlFunctionParameter(SqmlFunctionParameter object) {
				return createSqmlFunctionParameterAdapter();
			}
			@Override
			public Adapter caseSqmlSql(SqmlSql object) {
				return createSqmlSqlAdapter();
			}
			@Override
			public Adapter caseSqmlSqlId(SqmlSqlId object) {
				return createSqmlSqlIdAdapter();
			}
			@Override
			public Adapter caseSqmlSqlKeyword(SqmlSqlKeyword object) {
				return createSqmlSqlKeywordAdapter();
			}
			@Override
			public Adapter caseSqmlSqlNumberLiteral(SqmlSqlNumberLiteral object) {
				return createSqmlSqlNumberLiteralAdapter();
			}
			@Override
			public Adapter caseSqmlSqlStringLiteral(SqmlSqlStringLiteral object) {
				return createSqmlSqlStringLiteralAdapter();
			}
			@Override
			public Adapter caseSqmlSqlSymbol(SqmlSqlSymbol object) {
				return createSqmlSqlSymbolAdapter();
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
			public Adapter caseISqmlGeneratable(ISqmlGeneratable object) {
				return createISqmlGeneratableAdapter();
			}
			@Override
			public Adapter caseISqmlModelElement(ISqmlModelElement object) {
				return createISqmlModelElementAdapter();
			}
			@Override
			public Adapter caseISqmlValidatable(ISqmlValidatable object) {
				return createISqmlValidatableAdapter();
			}
			@Override
			public Adapter caseISqmlFunction(ISqmlFunction object) {
				return createISqmlFunctionAdapter();
			}
			@Override
			public Adapter caseISqmlValue(ISqmlValue object) {
				return createISqmlValueAdapter();
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
			public Adapter caseISqmlStaticVariable(ISqmlStaticVariable object) {
				return createISqmlStaticVariableAdapter();
			}
			@Override
			public Adapter caseISqmlFunctionParameter(ISqmlFunctionParameter object) {
				return createISqmlFunctionParameterAdapter();
			}
			@Override
			public Adapter caseISqmlSql(ISqmlSql object) {
				return createISqmlSqlAdapter();
			}
			@Override
			public Adapter caseISqmlSqlId(ISqmlSqlId object) {
				return createISqmlSqlIdAdapter();
			}
			@Override
			public Adapter caseISqmlSqlKeyword(ISqmlSqlKeyword object) {
				return createISqmlSqlKeywordAdapter();
			}
			@Override
			public Adapter caseISqmlSqlNumberLiteral(ISqmlSqlNumberLiteral object) {
				return createISqmlSqlNumberLiteralAdapter();
			}
			@Override
			public Adapter caseISqmlSqlStringLiteral(ISqmlSqlStringLiteral object) {
				return createISqmlSqlStringLiteralAdapter();
			}
			@Override
			public Adapter caseISqmlSqlSymbol(ISqmlSqlSymbol object) {
				return createISqmlSqlSymbolAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.functions.SqmlFunction <em>Sqml Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.functions.SqmlFunction
	 * @generated
	 */
	public Adapter createSqmlFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.functions.SqmlFunctionCall <em>Sqml Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.functions.SqmlFunctionCall
	 * @generated
	 */
	public Adapter createSqmlFunctionCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.functions.SqmlFunctionParameter <em>Sqml Function Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.functions.SqmlFunctionParameter
	 * @generated
	 */
	public Adapter createSqmlFunctionParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.functions.SqmlSql <em>Sqml Sql</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.functions.SqmlSql
	 * @generated
	 */
	public Adapter createSqmlSqlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.functions.SqmlSqlId <em>Sqml Sql Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.functions.SqmlSqlId
	 * @generated
	 */
	public Adapter createSqmlSqlIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.functions.SqmlSqlKeyword <em>Sqml Sql Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.functions.SqmlSqlKeyword
	 * @generated
	 */
	public Adapter createSqmlSqlKeywordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.functions.SqmlSqlNumberLiteral <em>Sqml Sql Number Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.functions.SqmlSqlNumberLiteral
	 * @generated
	 */
	public Adapter createSqmlSqlNumberLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.functions.SqmlSqlStringLiteral <em>Sqml Sql String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.functions.SqmlSqlStringLiteral
	 * @generated
	 */
	public Adapter createSqmlSqlStringLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.functions.SqmlSqlSymbol <em>Sqml Sql Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.functions.SqmlSqlSymbol
	 * @generated
	 */
	public Adapter createSqmlSqlSymbolAdapter() {
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
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.functions.ISqmlFunction <em>ISqml Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.functions.ISqmlFunction
	 * @generated
	 */
	public Adapter createISqmlFunctionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.ISqmlStaticVariable <em>ISqml Static Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.ISqmlStaticVariable
	 * @generated
	 */
	public Adapter createISqmlStaticVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.functions.ISqmlFunctionParameter <em>ISqml Function Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.functions.ISqmlFunctionParameter
	 * @generated
	 */
	public Adapter createISqmlFunctionParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.functions.ISqmlSql <em>ISqml Sql</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.functions.ISqmlSql
	 * @generated
	 */
	public Adapter createISqmlSqlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.functions.ISqmlSqlId <em>ISqml Sql Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.functions.ISqmlSqlId
	 * @generated
	 */
	public Adapter createISqmlSqlIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.functions.ISqmlSqlKeyword <em>ISqml Sql Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.functions.ISqmlSqlKeyword
	 * @generated
	 */
	public Adapter createISqmlSqlKeywordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.functions.ISqmlSqlNumberLiteral <em>ISqml Sql Number Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.functions.ISqmlSqlNumberLiteral
	 * @generated
	 */
	public Adapter createISqmlSqlNumberLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.functions.ISqmlSqlStringLiteral <em>ISqml Sql String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.functions.ISqmlSqlStringLiteral
	 * @generated
	 */
	public Adapter createISqmlSqlStringLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.functions.ISqmlSqlSymbol <em>ISqml Sql Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.functions.ISqmlSqlSymbol
	 * @generated
	 */
	public Adapter createISqmlSqlSymbolAdapter() {
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

} //FunctionsAdapterFactory
