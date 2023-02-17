package com.softicar.sqml.test.utils;

import com.google.inject.Inject;
import com.softicar.platform.common.testing.AbstractTest;
import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.conditions.ConditionsFactory;
import com.softicar.sqml.model.conditions.ConditionsPackage;
import com.softicar.sqml.model.expressions.ExpressionsFactory;
import com.softicar.sqml.model.expressions.ExpressionsPackage;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.literals.LiteralsFactory;
import com.softicar.sqml.model.literals.LiteralsPackage;
import com.softicar.sqml.model.queries.ISqmlQuery;
import com.softicar.sqml.model.selects.ISqmlSelectColumn;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.test.parser.SqmlTestParser;
import com.softicar.sqml.tests.SqmlInjectorProvider;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.junit.runner.RunWith;

@InjectWith(SqmlInjectorProvider.class)
@RunWith(XtextRunner.class)
public abstract class AbstractSqmlTest extends AbstractTest {

	protected static final ConditionsPackage CONDITIONS_PACKAGE = ConditionsPackage.eINSTANCE;
	protected static final ConditionsFactory CONDITIONS_FACTORY = ConditionsFactory.eINSTANCE;
	protected static final ExpressionsPackage EXPRESSIONS_PACKAGE = ExpressionsPackage.eINSTANCE;
	protected static final ExpressionsFactory EXPRESSIONS_FACTORY = ExpressionsFactory.eINSTANCE;
	protected static final LiteralsPackage LITERALS_PACKAGE = LiteralsPackage.eINSTANCE;
	protected static final LiteralsFactory LITERALS_FACTORY = LiteralsFactory.eINSTANCE;

	protected static final ISqmlType BLOB = SqmlBuiltInTypes.getBlobType();
	protected static final ISqmlType BOOLEAN = SqmlBuiltInTypes.getBooleanType();
	protected static final ISqmlType DAY = SqmlBuiltInTypes.getDayType();
	protected static final ISqmlType DAY_TIME = SqmlBuiltInTypes.getDayTimeType();
	protected static final ISqmlType DOUBLE = SqmlBuiltInTypes.getDoubleType();
	protected static final ISqmlType DECIMAL = SqmlBuiltInTypes.getDecimalType();
	protected static final ISqmlType FLOAT = SqmlBuiltInTypes.getFloatType();
	protected static final ISqmlType INTEGER = SqmlBuiltInTypes.getIntegerType();
	protected static final ISqmlType LONG = SqmlBuiltInTypes.getLongType();
	protected static final ISqmlType STRING = SqmlBuiltInTypes.getStringType();

	@Inject protected SqmlTestParser parser;

	protected void assertTypeOfExpression(ISqmlType expectedType, String expression) {

		ISqmlQuery query = createQueryTest()//
			.add("SELECT " + expression + " AS x")
			.getQuery();
		ISqmlSelectColumn selectColumn = query.getSelect().getColumn("x");
		assertType(expectedType, selectColumn.getExpression());
	}

	protected void assertType(ISqmlType expectedType, ISqmlExpression expression) {

		assertType(expectedType, expression.getSqmlType());
	}

	protected void assertType(ISqmlType expectedType, ISqmlType actualType) {

		assertTrue(expectedType.is(actualType));
		assertTrue(actualType.is(expectedType));
	}

	protected SqmlFileTest createFileTest(String filename) {

		return new SqmlFileTest(filename, parser);
	}

	protected SqmlQueryTest createQueryTest() {

		return new SqmlQueryTest(parser);
	}

	protected SqmlQueryTest createQueryTest(ISqmlQuery query) {

		return new SqmlQueryTest(parser, query);
	}

	protected SqmlTableTest createTableTest(String tableName, String physicalName) {

		return new SqmlTableTest(tableName, physicalName, parser);
	}

	protected SqmlTableTest createTableTest(ISqmlTable table) {

		return new SqmlTableTest(parser, table);
	}

	protected SqmlExpressionTest createExpressionTest(String expression) {

		return new SqmlExpressionTest(parser, expression);
	}
}
