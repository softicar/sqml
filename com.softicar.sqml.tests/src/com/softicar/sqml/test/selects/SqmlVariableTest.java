package com.softicar.sqml.test.selects;

import com.softicar.sqml.model.selects.validation.SqmlIssueDuplicatedVariableName;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlTestCases;
import org.junit.Test;

public class SqmlVariableTest extends AbstractSqmlTest {

	@Test
	public void prohibitsDuplicatedVariableNamesCaseInsensitively() {

		SqmlTestCases.loadDeliveryTestCase(parser);

		createQueryTest()
			.add("SELECT 1 AS one")
			.add("FROM Delivery delivery")
			.add("JOIN Delivery deliVery")
			.assertIssue(SqmlIssueDuplicatedVariableName.class, 4)
			.assertIssue(SqmlIssueDuplicatedVariableName.class, 5);
	}
}
