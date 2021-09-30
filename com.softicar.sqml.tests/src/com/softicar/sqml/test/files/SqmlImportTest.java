package com.softicar.sqml.test.files;

import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.files.ISqmlImport;
import com.softicar.sqml.model.files.validation.SqmlIssueConflictingImport;
import com.softicar.sqml.model.files.validation.SqmlIssueDuplicatedImport;
import com.softicar.sqml.model.files.validation.SqmlIssueLocalPackageImport;
import com.softicar.sqml.model.files.validation.SqmlIssueUnresolvableImport;
import com.softicar.sqml.model.files.validation.SqmlIssueUnusedImport;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import java.util.List;
import org.junit.Test;

public class SqmlImportTest extends AbstractSqmlTest {

	@Test
	public void testQualifiedName() {

		ISqmlFile file = parser.parse("PACKAGE com.example IMPORT com.example.T", "Q.sqml");

		List<? extends ISqmlImport> imports = file.getImports();
		assertEquals(1, imports.size());

		ISqmlImport sqmlImport = imports.get(0);
		assertEquals("com.example.T", sqmlImport.getQualifiedName().toString());
	}

	@Test
	public void testDuplicatedImports() {

		createTableTest("T", "db.t")//
			.add("PK Integer id = SERIAL")
			.assertNoIssues();

		createFileTest("Query.sqml")//
			.add("PACKAGE com.example.other")
			.add("IMPORT com.example.T")
			.add("IMPORT com.example.T")
			.add("QUERY Query {")
			.add("    SELECT t.id FROM T t")
			.add("}")
			.assertIssue(SqmlIssueDuplicatedImport.class, 2)
			.assertIssue(SqmlIssueDuplicatedImport.class, 3);
	}

	@Test
	public void testConflictingImports() {

		createFileTest("foo/T.sqml")//
			.add("PACKAGE com.example.foo")
			.add("TABLE T 'db.foo' {")
			.add("    PK Integer id = SERIAL")
			.add("}")
			.assertNoIssues();

		createFileTest("bar/T.sqml")//
			.add("PACKAGE com.example.bar")
			.add("TABLE T 'db.bar' {")
			.add("    PK Integer id = SERIAL")
			.add("}")
			.assertNoIssues();

		createFileTest("Query.sqml")
			.add("PACKAGE com.example")
			.add("IMPORT com.example.foo.T")
			.add("IMPORT com.example.bar.T")
			.add("QUERY Query {")
			.add("    SELECT t.id FROM T t")
			.add("}")
			.assertIssue(SqmlIssueConflictingImport.class, 2)
			.assertIssue(SqmlIssueConflictingImport.class, 3);
	}

	@Test
	public void testUnresolvableImports() {

		createFileTest("T.sqml")
			.add("PACKAGE com.example")
			.add()
			.add("IMPORT some.non.existing.Table")
			.add()
			.add("TABLE T 'db.t'")
			.add("    Integer id = SERIAL")
			.add("END")
			.assertIssue(SqmlIssueUnresolvableImport.class, 3);
	}

	@Test
	public void testLocalPackageImports() {

		createTableTest("T", "db.t")//
			.add("PK Integer id = SERIAL")
			.assertNoIssues();

		createFileTest("Query.sqml")
			.add("PACKAGE com.example")
			.add("IMPORT com.example.T")
			.add("QUERY Query {")
			.add("    SELECT t.id FROM T t")
			.add("}")
			.assertIssue(SqmlIssueLocalPackageImport.class, 2);
	}

	@Test
	public void testUnusedImports() {

		createTableTest("T", "db.t")//
			.add("PK Integer id = SERIAL")
			.assertNoIssues();

		createFileTest("Query.sqml")
			.add("PACKAGE com.example.other")
			.add("IMPORT com.example.T")
			.add("QUERY Query {")
			.add("    SELECT 1 AS one")
			.add("}")
			.assertIssue(SqmlIssueUnusedImport.class, 2);
	}
}
