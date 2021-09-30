package com.softicar.sqml.test.scoping;

import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Before;

public abstract class AbstractSqmlScopeTest extends AbstractSqmlTest {

	protected ISqmlFile tableFile;
	protected ISqmlFile queryFile;

	@Before
	public void before() {

		this.tableFile = createFileTest("Table.sqml")
			.add("PACKAGE com.example.table")
			.add()
			.add("TABLE Table 'db.table' {")
			.add("    PK Integer id = SERIAL")
			.add("    ENUM State { ONE TWO }")
			.add("}")
			.assertNoIssues()
			.getFile();

		this.queryFile = createFileTest("Query.sqml")
			.add("PACKAGE com.example.query")
			.add()
			.add("IMPORT com.example.table.Table")
			.add()
			.add("QUERY Query {")
			.add("    SELECT t.* FROM Table t")
			.add("}")
			.getFile();
	}
}
