package com.softicar.sqml.test.tables;

import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.validation.SqmlIssueIllegalCharacterSetAttribute;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlTableColumnCharacterSetAttributeTest extends AbstractSqmlTest {

	@Test
	public void testCharacterSetAttribute() {

		ISqmlTable table = createTableTest("T", "db.t")//
			.add("PK Integer id = SERIAL")
			.add("String a")
			.add("String b [CHARACTER SET='foo']")
			.add("State c [CHARACTER SET='bar']")
			.add("ENUM State { ONE TWO }")
			.assertNoIssues()
			.assertJava("...IDbStringField<T> B = ...addStringField(...)...setCharacterSet(\"foo\");")
			.assertJava("...IDbEnumField<T, C> C = ...addEnumField(..., C.class)...setCharacterSet(\"bar\");")
			.getTable();

		assertNull(table.getColumn("a").getCharacterSet());
		assertEquals("foo", table.getColumn("b").getCharacterSet());
		assertEquals("bar", table.getColumn("c").getCharacterSet());
	}

	@Test
	public void issueOnIllegalCharacterSetAttribute() {

		createTableTest("T", "db.t")//
			.add("PK Integer id = SERIAL")
			.add("Integer i [CHARACTER SET='foo']")
			.add("Day d [CHARACTER SET='bar']")
			.assertIssue(SqmlIssueIllegalCharacterSetAttribute.class, 4)
			.assertIssue(SqmlIssueIllegalCharacterSetAttribute.class, 5);
	}
}
