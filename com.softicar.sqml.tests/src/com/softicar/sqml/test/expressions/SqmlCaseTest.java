package com.softicar.sqml.test.expressions;

import com.softicar.sqml.model.expressions.validation.SqmlIssueExpressionHasWrongType;
import com.softicar.sqml.model.expressions.validation.SqmlIssueExpressionNotBoolean;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlTestCases;
import org.junit.Test;

public class SqmlCaseTest extends AbstractSqmlTest {

	@Test
	public void testSearchCase() {

		parser.loadLanguagePackage();
		SqmlTestCases.loadDeliveryTestCase(parser);

		createQueryTest()//
			.add("SELECT")
			.add("  CASE")
			.add("    WHEN item.charge = 0 THEN 'empty'")
			.add("    WHEN item.charge > 3 THEN 'big'")
			.add("    ELSE 'normal'")
			.add("  END AS x")
			.add("FROM Item AS item")
			.assertGeneratedSelect(
				new StringBuilder()//
					.append("SELECT CASE")
					.append(" WHEN item.charge = 0 THEN 'empty'")
					.append(" WHEN item.charge > 3 THEN 'big'")
					.append(" ELSE 'normal'")
					.append(" END AS x")
					.append(" FROM db.item AS item")
					.toString());
	}

	@Test
	public void testSimpleCase() {

		parser.loadLanguagePackage();
		SqmlTestCases.loadDeliveryTestCase(parser);

		createQueryTest()//
			.add("SELECT")
			.add("  CASE item.charge")
			.add("    WHEN 0 THEN 'empty'")
			.add("    WHEN 3 THEN 'big'")
			.add("    ELSE 'normal'")
			.add("  END AS x")
			.add("FROM Item AS item")
			.assertGeneratedSelect(
				new StringBuilder()//
					.append("SELECT CASE item.charge")
					.append(" WHEN 0 THEN 'empty'")
					.append(" WHEN 3 THEN 'big'")
					.append(" ELSE 'normal'")
					.append(" END AS x")
					.append(" FROM db.item AS item")
					.toString());
	}

	@Test
	public void testSearchCaseWithNonBooleanExpression() {

		createQueryTest()//
			.add("SELECT CASE WHEN 1 THEN 1 END AS x")
			.assertIssue(SqmlIssueExpressionNotBoolean.class, 3)
			.assertNoMoreIssues();
	}

	@Test
	public void testSearchCaseWithIncompatibleThenTypes() {

		createQueryTest()//
			.add("SELECT")
			.add("  CASE")
			.add("    WHEN TRUE THEN 1")
			.add("    WHEN FALSE THEN 'foo'")
			.add("    ELSE 1.0")
			.add("  END AS x")
			.assertIssue(SqmlIssueExpressionHasWrongType.class, 6)
			.assertIssue(SqmlIssueExpressionHasWrongType.class, 7)
			.assertNoMoreIssues();
	}

	@Test
	public void testSimpleCaseIncompatibleOperandTypes() {

		createQueryTest()//
			.add("SELECT")
			.add("  CASE 1")
			.add("    WHEN 'foo' THEN 1")
			.add("    WHEN 1.2 THEN 2")
			.add("  END AS x")
			.assertIssue(SqmlIssueExpressionHasWrongType.class, 5)
			.assertIssue(SqmlIssueExpressionHasWrongType.class, 6)
			.assertNoMoreIssues();
	}
}
