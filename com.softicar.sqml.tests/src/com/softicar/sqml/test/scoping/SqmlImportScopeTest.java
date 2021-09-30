package com.softicar.sqml.test.scoping;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.types.TypesPackage;
import com.softicar.sqml.model.utils.scoping.ISqmlFileScopeProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.junit.Test;

public class SqmlImportScopeTest extends AbstractSqmlScopeTest {

	@Inject private ISqmlFileScopeProvider fileScopeProvider;

	@Test
	public void testAllElements() {

		IScope scope = fileScopeProvider.getImportScope(queryFile, TypesPackage.eINSTANCE.getSqmlTypeReference_TypeDefinition());

		Iterable<IEObjectDescription> scopeElements = scope.getAllElements();
		assertEquals(1, Iterables.size(scopeElements));

		IEObjectDescription firstElement = Iterables.getFirst(scopeElements, null);
		assertEquals("Table", firstElement.getName().toString());
		assertEquals("com.example.table.Table", firstElement.getQualifiedName().toString());
	}

	@Test
	public void testSingleElement() {

		IScope scope = fileScopeProvider.getImportScope(queryFile, TypesPackage.eINSTANCE.getSqmlTypeReference_TypeDefinition());

		IEObjectDescription singleElement = scope.getSingleElement(QualifiedName.create("Table"));
		assertEquals("Table", singleElement.getName().toString());
		assertEquals("com.example.table.Table", singleElement.getQualifiedName().toString());
	}

	@Test
	public void testElementsByEObject() {

		IScope scope = fileScopeProvider.getImportScope(queryFile, TypesPackage.eINSTANCE.getSqmlTypeReference_TypeDefinition());
		ISqmlTable table = tableFile.getTable("Table");

		Iterable<IEObjectDescription> descriptions = scope.getElements(table);
		assertEquals(1, Iterables.size(descriptions));

		IEObjectDescription description = descriptions.iterator().next();
		assertEquals("Table", description.getName().toString());
		assertEquals("com.example.table.Table", description.getQualifiedName().toString());
	}
}
