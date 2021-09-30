package com.softicar.sqml.test.tables;

import com.softicar.sqml.model.tables.validation.SqmlIssueTooLongImplicitKeyTableName;
import com.softicar.sqml.model.tables.validation.SqmlIssueTooLongTableKeyName;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlTableKeyTest extends AbstractSqmlTest {

	@Test
	public void testTooLongTableKeyName() {

		createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("String a")
			.add("String b")
			.add("IK a AS xxxxxxxx10xxxxxxxx20xxxxxxxx30xxxxxxxx40xxxxxxxx50xxxxxxxx60x63")
			.add("IK b AS xxxxxxxx10xxxxxxxx20xxxxxxxx30xxxxxxxx40xxxxxxxx50xxxxxxxx60xx64")
			.assertIssue(SqmlIssueTooLongTableKeyName.class, 7)
			.assertNoMoreIssues();
	}

	@Test
	public void testTooLongImplicitTableKeyName() {

		createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("String xxxxxxxx10")
			.add("String xxxxxxxx20")
			.add("String xxxxxxxx30")
			.add("String xxxxxxxx40")
			.add("String xxxxxxxx50")
			.add("String xxxxxxxx60")
			.add("String x63")
			.add("String xx64")
			.add("IK xxxxxxxx10 xxxxxxxx20 xxxxxxxx30 xxxxxxxx40 xxxxxxxx50 xxxxxxxx60 x63")
			.add("IK xxxxxxxx10 xxxxxxxx20 xxxxxxxx30 xxxxxxxx40 xxxxxxxx50 xxxxxxxx60 xx64")
			.assertIssue(SqmlIssueTooLongImplicitKeyTableName.class, 13)
			.assertNoMoreIssues();
	}
}
