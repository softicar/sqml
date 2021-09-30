package com.softicar.sqml.test.scoping;

import com.google.inject.Inject;
import com.softicar.sqml.model.expressions.ExpressionsPackage;
import com.softicar.sqml.model.queries.ISqmlQuery;
import com.softicar.sqml.model.tables.ISqmlTable;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.junit.Test;

public class SqmlScopeProviderTest extends AbstractSqmlScopeTest {

	@Inject private IScopeProvider scopeProvider;

	@Test
	public void test() {

		ISqmlQuery query = queryFile.getQuery("Query");
		IScope scope = scopeProvider.getScope(query.getSelect().getVariable("t"), ExpressionsPackage.eINSTANCE.getSqmlPath_Target());

		ISqmlTable table = tableFile.getTable("Table");
		assertSame(table, scope.getSingleElement(QualifiedName.create("Table")).getEObjectOrProxy());
		assertSame(table, scope.getSingleElement(QualifiedName.create("com", "example", "table", "Table")).getEObjectOrProxy());
	}
}
