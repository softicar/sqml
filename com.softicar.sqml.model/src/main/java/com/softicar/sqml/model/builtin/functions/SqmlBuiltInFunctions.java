package com.softicar.sqml.model.builtin.functions;

import com.softicar.platform.db.sql.token.SqlKeyword;
import com.softicar.platform.db.sql.token.SqlSymbol;
import com.softicar.sqml.model.builtin.SqmlBuiltInPackage;
import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.simple.SqmlSimpleResource;
import com.softicar.sqml.model.types.ISqmlTypeDefinition;
import java.util.Arrays;
import java.util.Collection;
import org.eclipse.emf.common.util.URI;

public class SqmlBuiltInFunctions extends SqmlSimpleResource {

	private static final int MAX_CONCAT_PARAMETERS = 10;
	private static final String FILENAME = SqmlBuiltInFunctions.class.getSimpleName() + ".sqml";
	private static final SqmlBuiltInFunctions SINGLETON = new SqmlBuiltInFunctions();

	private SqmlBuiltInFunctions() {

		super(SqmlBuiltInPackage.getQualifiedName(), FILENAME);

		// add binary comparison operators
		Collection<SqlSymbol> operators = Arrays
			.asList(//
				SqlSymbol.EQUAL,
				SqlSymbol.NOT_EQUAL,
				SqlSymbol.LESS,
				SqlSymbol.LESS_EQUAL,
				SqlSymbol.GREATER,
				SqlSymbol.GREATER_EQUAL);
		addBinaryComparisonOperators(SqmlBuiltInTypes.getBooleanType(), Arrays.asList(SqlSymbol.EQUAL, SqlSymbol.NOT_EQUAL));
		addBinaryComparisonOperators(SqmlBuiltInTypes.getDayType(), operators);
		addBinaryComparisonOperators(SqmlBuiltInTypes.getDayTimeType(), operators);
		addBinaryComparisonOperators(SqmlBuiltInTypes.getDecimalType(), operators);
		addBinaryComparisonOperators(SqmlBuiltInTypes.getDoubleType(), operators);
		addBinaryComparisonOperators(SqmlBuiltInTypes.getFloatType(), operators);
		addBinaryComparisonOperators(SqmlBuiltInTypes.getIntegerType(), operators);
		addBinaryComparisonOperators(SqmlBuiltInTypes.getLongType(), operators);
		addBinaryComparisonOperators(SqmlBuiltInTypes.getStringType(), operators);
		addBinaryComparisonOperators(SqmlBuiltInTypes.getTimeType(), operators);

		// add CONCAT function
		for (int i = 2; i <= MAX_CONCAT_PARAMETERS; ++i) {
			addFunction(new SqmlBuiltInConcat(i));
		}

		// add CAST functions
		addFunction(
			new SqmlBuiltInEnumToLiteralsTypeCast(//
				"toInteger",
				SqmlBuiltInTypes.getIntegerType(),
				SqlKeyword.SIGNED));
		addFunction(
			new SqmlBuiltInEnumToLiteralsTypeCast(//
				"toString",
				SqmlBuiltInTypes.getStringType(),
				SqlKeyword.CHAR));

		// add STRING and ENUM addition
		addFunction(new SqmlBuiltInStringEnumAddition());
		addFunction(new SqmlBuiltInEnumStringAddition());

		// add STRING and ENUM comparison
		for (SqlSymbol operator: Arrays
			.asList(//
				SqlSymbol.EQUAL,
				SqlSymbol.NOT_EQUAL,
				SqlSymbol.LESS,
				SqlSymbol.LESS_EQUAL,
				SqlSymbol.GREATER,
				SqlSymbol.GREATER_EQUAL)) {
			addFunction(new SqmlBuiltInEnumToLiteralComparator(operator));
			addFunction(new SqmlBuiltInLiteralToEnumComparator(operator));
			addFunction(new SqmlBuiltInEnumToEnumComparator(operator));
		}

		// add TABLE and INTEGER comparison
		for (SqlSymbol operator: Arrays.asList(SqlSymbol.EQUAL, SqlSymbol.NOT_EQUAL)) {
			addFunction(new SqmlBuiltInTableTableComparison(operator));
			addFunction(new SqmlBuiltInTableIntegerComparison(operator));
			addFunction(new SqmlBuiltInIntegerTableComparison(operator));
		}

		// add TUPLE comparison
		for (SqlSymbol operator: Arrays.asList(SqlSymbol.EQUAL, SqlSymbol.NOT_EQUAL)) {
			addFunction(new SqmlBuiltInTupleTupleComparison(operator));
		}
	}

	private void addBinaryComparisonOperators(ISqmlTypeDefinition type, Collection<SqlSymbol> operators) {

		for (SqlSymbol operator: operators) {
			addFunction(new SqmlBuiltInBinaryComparison(operator, type));
		}
	}

	public static SqmlBuiltInFunctions get() {

		return SINGLETON;
	}

	public static boolean isBuiltIn(URI objectUri) {

		return objectUri.trimFragment().toString().endsWith(SqmlBuiltInFunctions.FILENAME);
	}
}
