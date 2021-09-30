package com.softicar.sqml.test.scoping;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.softicar.sqml.model.selects.SelectsPackage;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.utils.scoping.ISqmlFileScopeProvider;
import com.softicar.sqml.scoping.SqmlScopeStack;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.junit.Before;
import org.junit.Test;

public class SqmlScopeStackTest extends AbstractSqmlScopeTest {

	@Inject private ISqmlFileScopeProvider fileScopeProvider;
	private SqmlScopeStack scopeStack;

	@Before
	public void beforeSqmlScopeStackTest() {

		this.scopeStack = new SqmlScopeStack();
		this.scopeStack.push(fileScopeProvider.getGlobalScope(queryFile, SelectsPackage.eINSTANCE.getSqmlTableVariable_Table()));
		this.scopeStack.push(fileScopeProvider.getPackageScope(queryFile, SelectsPackage.eINSTANCE.getSqmlTableVariable_Table()));
		this.scopeStack.push(fileScopeProvider.getImportScope(queryFile, SelectsPackage.eINSTANCE.getSqmlTableVariable_Table()));
	}

	@Test
	public void testElementsByAliasName() {

		QualifiedName aliasName = QualifiedName.create("Table");

		Iterable<IEObjectDescription> descriptions = scopeStack.getElements(aliasName);
		assertEquals(1, Iterables.size(descriptions));

		IEObjectDescription description = descriptions.iterator().next();
		assertEquals("Table", description.getName().toString());
		assertEquals("com.example.table.Table", description.getQualifiedName().toString());
	}

	@Test
	public void testElementsByQualifiedName() {

		QualifiedName qualifiedName = QualifiedName.create("com", "example", "table", "Table");

		Iterable<IEObjectDescription> descriptions = scopeStack.getElements(qualifiedName);
		assertEquals(1, Iterables.size(descriptions));

		IEObjectDescription description = descriptions.iterator().next();
		assertEquals("com.example.table.Table", description.getName().toString());
		assertEquals("com.example.table.Table", description.getQualifiedName().toString());
	}

	@Test
	public void testElementsByEObject() {

		ISqmlTable table = tableFile.getTable("Table");

		Iterable<IEObjectDescription> descriptions = scopeStack.getElements(table);
		assertEquals(1, Iterables.size(descriptions));

		IEObjectDescription description = descriptions.iterator().next();
		assertEquals("Table", description.getName().toString());
		assertEquals("com.example.table.Table", description.getQualifiedName().toString());
	}
}
