package com.softicar.sqml.model.functions;

import com.softicar.sqml.model.ISqmlGeneratable;
import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.files.ISqmlFileElement;
import com.softicar.sqml.model.generation.ISqmlSelectGenerator;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.types.ISqmlTypeReference;
import com.softicar.sqml.model.validation.ISqmlValidatable;
import com.softicar.sqml.model.validation.ISqmlValidationContext;
import java.util.List;
import org.eclipse.xtext.naming.QualifiedName;

public interface ISqmlFunction extends ISqmlFileElement, ISqmlGeneratable, ISqmlModelElement, ISqmlValidatable {

	String IS_OPERATOR_KEY = "SQML_IS_OPERATOR_KEY";

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default void validate(ISqmlValidationContext context) {

		SqmlFunctionMethods.validate(this, context);
	}

	/**
	 * Returns the fully qualified name of this function.
	 * <p>
	 * The qualified name is the package name plus the simple function name.
	 *
	 * @return the fully qualified name of this function
	 */
	@Override
	default QualifiedName getQualifiedName() {

		return ISqmlFileElement.super.getQualifiedName();
	}

	/**
	 * Returns the simple name of this function plus the types of its
	 * parameters.
	 *
	 * @return the simple signature of this function
	 */
	default String getSimpleSignature() {

		return SqmlFunctionMethods.getSimpleSignature(this);
	}

	/**
	 * Returns the qualified name of this function plus the types of its
	 * parameters.
	 *
	 * @return the fully qualified signature of this function
	 */
	default QualifiedName getQualifiedSignature() {

		return SqmlFunctionMethods.getQualifiedSignature(this);
	}

	/**
	 * Returns the display name of this function.
	 * <p>
	 * The display name of the functions includes the function parameters, so
	 * that the user can distinguish between overloaded functions.
	 *
	 * @return the display name
	 */
	default String getDisplayName() {

		return SqmlFunctionMethods.getDisplayName(this);
	}

	ISqmlTypeReference getReturnType();

	/**
	 * Returns the return type of this function.
	 *
	 * @return the return type of this function
	 */
	default ISqmlType getSqmlType() {

		return SqmlFunctionMethods.getSqmlType(this);
	}

	/**
	 * Returns a list of the function parameters.
	 *
	 * @return the function parameter list
	 */
	List<? extends ISqmlFunctionParameter> getParameters();

	/**
	 * Returns the {@link ISqmlExpression} token list if this is an expression
	 * function.
	 *
	 * @return the {@link ISqmlExpression} or null
	 */
	ISqmlExpression getExpression();

	/**
	 * Returns the SQL token list if this is an SQL function.
	 *
	 * @return the SQL tokens or null
	 */
	ISqmlSql getSql();

	/**
	 * Checks if this function accepts the given function call.
	 * <p>
	 * This method checks for a matching function name and compatible function
	 * arguments.
	 *
	 * @param arguments
	 *            the argument list to check
	 * @return true if the function call is acceptable
	 */
	default boolean acceptsArguments(List<ISqmlExpression> arguments) {

		return SqmlFunctionMethods.acceptsArguments(this, arguments);
	}

	default int getArgumentConversionCount(List<ISqmlExpression> arguments) {

		return SqmlFunctionMethods.getArgumentConversionCount(this, arguments);
	}

	@Override
	default void generateSql(ISqmlSelectGenerator generator) {

		SqmlFunctionMethods.generateSql(this, generator);
	}
}
