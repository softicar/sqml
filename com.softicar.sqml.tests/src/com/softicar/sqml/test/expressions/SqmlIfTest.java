package com.softicar.sqml.test.expressions;

import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.expressions.validation.SqmlIssueExpressionNotBoolean;
import com.softicar.sqml.model.expressions.validation.SqmlIssueIfExpressionsNotSameType;
import com.softicar.sqml.model.validation.SqmlIssueType;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlTestCases;
import org.junit.Test;

public class SqmlIfTest extends AbstractSqmlTest {

	@Test
	public void checksForBooleanExpression() {

		createQueryTest()//
			.add("SELECT IF(93, 1, 2) AS x")
			.assertIssue(SqmlIssueExpressionNotBoolean.class, 3);
	}

	@Test
	public void checksForSameType() {

		createQueryTest()//
			.add("SELECT IF(1 = 2, 1, 'foo') AS x")
			.assertIssue(SqmlIssueIfExpressionsNotSameType.class, 3);
	}

	@Test
	public void returnsUnknownTypeWhenMissingExpressions() {

		ISqmlExpression ifExpression = createQueryTest()//
			.add("SELECT IF(TRUE,,) AS x")
			.assertIssue(SqmlIssueType.SYNTAX_ERROR, 3)
			.getQuery()
			.getSelect()
			.getColumn("x")
			.getExpression();

		assertNotNull(ifExpression.getSqmlType());
		assertSame(SqmlBuiltInTypes.getUnknownType(), ifExpression.getSqmlType());
	}

	@Test
	public void allowsComplexConditions() {

		parser.loadLanguagePackage();
		SqmlTestCases.loadDeliveryTestCase(parser);

		createQueryTest()//
			.add("SELECT IF(delivery.number = 'foo' AND supplier.supplierName = 'bar', 1, 0) AS x")
			.add("FROM Item item")
			.add("JOIN item.delivery delivery")
			.add("JOIN delivery.supplier supplier")
			.assertGeneratedSelect(
				new StringBuilder()
					.append("SELECT ")
					.append("CASE WHEN delivery.number = 'foo' AND supplier.supplierName = 'bar' THEN 1 ELSE 0 END AS x ")
					.append("FROM db.item AS item ")
					.append("JOIN db.delivery AS delivery ON item.delivery = delivery.id ")
					.append("JOIN db.supplier AS supplier ON delivery.supplier = supplier.id")
					.toString());
	}
}
