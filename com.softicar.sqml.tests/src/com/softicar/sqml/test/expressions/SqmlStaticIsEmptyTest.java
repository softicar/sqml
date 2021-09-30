package com.softicar.sqml.test.expressions;

import com.softicar.sqml.model.expressions.validation.SqmlIssueParameterReferenceNotCollection;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import java.util.Arrays;
import java.util.Collections;
import org.junit.Test;

public class SqmlStaticIsEmptyTest extends AbstractSqmlTest {

	@Test
	public void testIsEmptyCheck() {

		createQueryTest()
			.add("Integer[] id")
			.add("SELECT")
			.add("    STATIC IF $id IS EMPTY {1} ELSE {2} AS x,")
			.add("    STATIC IF $id IS NOT EMPTY {1} ELSE {2} AS y")
			.assertGeneratedSelect("SELECT 1 AS x, 2 AS y", Collections.emptyList())
			.assertGeneratedSelect("SELECT 2 AS x, 1 AS y", Arrays.asList(1, 2, 3));
	}

	@Test
	public void testNotCollectionValidation() {

		createQueryTest()
			.add("Integer id")
			.add("SELECT")
			.add("    STATIC IF $id IS EMPTY {1} ELSE {2} AS x")
			.assertIssue(SqmlIssueParameterReferenceNotCollection.class, 5);
	}
}
