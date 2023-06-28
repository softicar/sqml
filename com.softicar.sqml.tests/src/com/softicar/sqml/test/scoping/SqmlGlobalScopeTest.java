package com.softicar.sqml.test.scoping;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.softicar.sqml.model.expressions.ExpressionsPackage;
import com.softicar.sqml.model.utils.SqmlNavigation;
import com.softicar.sqml.utils.TruePredicate;
import java.util.List;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.IScope;
import org.junit.Test;

public class SqmlGlobalScopeTest extends AbstractSqmlScopeTest {

	@Inject private IGlobalScopeProvider globalScopeProvider;

	@Test
	public void test() {

		// get global scope
		Resource queryFileResource = SqmlNavigation.getResource(queryFile);
		IScope globalScope = globalScopeProvider
			.getScope(//
				queryFileResource,
				ExpressionsPackage.eINSTANCE.getSqmlPath_Target(),
				new TruePredicate<>());
		List<IEObjectDescription> descriptions = Lists.newArrayList(globalScope.getAllElements());

		// check global scope
		assertEquals(3, descriptions.size());

		assertEquals("com.example.table.Table", descriptions.get(0).getName().toString("."));
		assertEquals("com.example.table.Table", descriptions.get(0).getQualifiedName().toString("."));
		assertSame(tableFile.getTable("Table"), descriptions.get(0).getEObjectOrProxy());

		assertEquals("$sqml.physicalTableName.db.table", descriptions.get(1).getName().toString("."));
		assertEquals("$sqml.physicalTableName.db.table", descriptions.get(1).getQualifiedName().toString("."));
		assertSame(tableFile.getTable("Table"), descriptions.get(1).getEObjectOrProxy());

		assertEquals("com.example.table.Table.State", descriptions.get(2).getName().toString("."));
		assertEquals("com.example.table.Table.State", descriptions.get(2).getQualifiedName().toString("."));
		assertSame(tableFile.getTable("Table").getEnum("State"), descriptions.get(2).getEObjectOrProxy());
	}
}
