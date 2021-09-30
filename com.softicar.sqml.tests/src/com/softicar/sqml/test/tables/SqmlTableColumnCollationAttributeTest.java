package com.softicar.sqml.test.tables;

import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.validation.SqmlIssueIllegalCollationAttribute;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlTableColumnCollationAttributeTest extends AbstractSqmlTest {

	@Test
	public void testCollationAttribute() {

		ISqmlTable table = createTableTest("T", "db.t")//
			.add("PK Integer id = SERIAL")
			.add("String a")
			.add("String b [COLLATION='foo']")
			.add("State c [COLLATION='bar']")
			.add("ENUM State { ONE TWO }")
			.assertNoIssues()
			.assertJava("...IDbStringField<T> B = ...addStringField(...)...setCollation(\"foo\");")
			.assertJava("...IDbEnumField<T, C> C = ...addEnumField(..., C.class)...setCollation(\"bar\");")
			.getTable();

		assertNull(table.getColumn("a").getCollation());
		assertEquals("foo", table.getColumn("b").getCollation());
		assertEquals("bar", table.getColumn("c").getCollation());
	}

	@Test
	public void issueOnIllegalCollationAttribute() {

		createTableTest("T", "db.t")//
			.add("PK Integer id = SERIAL")
			.add("Integer i [COLLATION='foo']")
			.add("Day d [COLLATION='bar']")
			.assertIssue(SqmlIssueIllegalCollationAttribute.class, 4)
			.assertIssue(SqmlIssueIllegalCollationAttribute.class, 5);
	}
}
