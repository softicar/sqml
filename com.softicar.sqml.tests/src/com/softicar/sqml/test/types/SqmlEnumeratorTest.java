package com.softicar.sqml.test.types;

import com.softicar.sqml.model.types.validation.SqmlIssueIncompatibleValueForEnumerator;
import com.softicar.sqml.model.types.validation.SqmlIssueMissingEnumeratorValueAssigment;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Before;
import org.junit.Test;

public class SqmlEnumeratorTest extends AbstractSqmlTest {

	@Before
	public void before() {

		createTableTest("T", "db.t")//
			.add("PK Integer id = SERIAL")
			.add("State state")
			.add()
			.add("ENUM State ON String {")
			.add("    OPEN = 'OPEN'")
			.add("    CLOSED = 'CLOSED'")
			.add("}")
			.assertNoIssues();
	}

	@Test
	public void testEnumToEnumComparison() {

		createQueryTest()//
			.add("SELECT t.id")
			.add("FROM T t")
			.add("WHERE t.state = T.State.OPEN")
			.assertGeneratedSelect("SELECT t.id AS id FROM db.t AS t WHERE t.state = 'OPEN'");
	}

	@Test
	public void testEnumToStringComparison() {

		createQueryTest()//
			.add("SELECT t.id")
			.add("FROM T t")
			.add("WHERE t.state = 'OPEN'")
			.assertGeneratedSelect("SELECT t.id AS id FROM db.t AS t WHERE t.state = 'OPEN'");
	}

	@Test
	public void testStringToEnumComparison() {

		createQueryTest()//
			.add("SELECT t.id")
			.add("FROM T t")
			.add("WHERE 'OPEN' = t.state")
			.assertGeneratedSelect("SELECT t.id AS id FROM db.t AS t WHERE 'OPEN' = t.state");
	}

	@Test
	public void testSelection() {

		createQueryTest()//
			.add("SELECT T.State.OPEN AS state")
			.assertGeneratedSelect("SELECT 'OPEN' AS state");
	}

	@Test
	public void allowsOmissionOfLiteralValueForStringEnums() {

		createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("State state")
			.add("")
			.add("ENUM State ON String {")
			.add("    OPEN")
			.add("    THIS_IS_IT")
			.add("    DASH = 'x-y'")
			.add("}")
			.assertNoIssues();

		createQueryTest()//
			.add("SELECT foo.id")
			.add("FROM Foo foo")
			.add("WHERE foo.state = Foo.State.OPEN")
			.add("WHERE foo.state = Foo.State.THIS_IS_IT")
			.add("WHERE foo.state = Foo.State.DASH")
			.assertNoIssues()
			.assertGeneratedSelect(
				new StringBuilder()
					.append("SELECT foo.id AS id")
					.append(" FROM db.foo AS foo")
					.append(" WHERE foo.state = 'OPEN'")
					.append(" AND foo.state = 'THIS_IS_IT'")
					.append(" AND foo.state = 'x-y'")
					.toString());
	}

	@Test
	public void prohibitsOmissionOfLiteralValueForNonStringEnums() {

		createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("State state")
			.add("")
			.add("ENUM State ON Integer {")
			.add("    OPEN = 1")
			.add("    CLOSED")
			.add("}")
			.assertIssue(SqmlIssueMissingEnumeratorValueAssigment.class, 8)
			.assertNoMoreIssues();
	}

	@Test
	public void prohibitsAssignmentOfIncompatibleValues() {

		createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("State state")
			.add("")
			.add("ENUM State ON Integer {")
			.add("    OPEN = '1'")
			.add("    CLOSED = 2.5f")
			.add("    OTHER = 33")
			.add("}")
			.assertIssue(SqmlIssueIncompatibleValueForEnumerator.class, 7)
			.assertIssue(SqmlIssueIncompatibleValueForEnumerator.class, 8)
			.assertNoMoreIssues();
	}
}
