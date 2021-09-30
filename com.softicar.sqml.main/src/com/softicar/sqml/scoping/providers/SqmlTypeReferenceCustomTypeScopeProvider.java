package com.softicar.sqml.scoping.providers;

import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.files.ISqmlFileElement;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.types.ISqmlEnum;
import com.softicar.sqml.model.types.ISqmlTypeDefinition;
import com.softicar.sqml.model.types.TypesPackage;
import com.softicar.sqml.model.utils.SqmlNavigation;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;

public class SqmlTypeReferenceCustomTypeScopeProvider extends AbstractSqmlReferenceScopeProvider {

	@Override
	public EReference getReference() {

		return TypesPackage.eINSTANCE.getSqmlTypeReference_TypeDefinition();
	}

	@Override
	public IScope getScope(EObject context) {

		IScope importScope = getImportScope(context, getReference());

		// add all top-level types in the current file
		ISqmlFile sqmlFile = SqmlNavigation.findOrThrow(ISqmlFile.class, context);
		List<ISqmlTypeDefinition> topLevelTypes = new ArrayList<>();
		for (ISqmlFileElement fileElement: sqmlFile.getElements()) {
			if (fileElement instanceof ISqmlTypeDefinition) {
				topLevelTypes.add((ISqmlTypeDefinition) fileElement);
			}
		}
		IScope scope = Scopes.scopeFor(topLevelTypes, importScope);

		// add table enum-types if this reference is used within a table
		ISqmlTable sqmlTable = SqmlNavigation.find(ISqmlTable.class, context);
		if (sqmlTable != null) {
			List<ISqmlEnum> enumTypes = new ArrayList<>();
			for (ISqmlEnum sqmlEnum: sqmlTable.getEnums()) {
				enumTypes.add(sqmlEnum);
			}
			scope = Scopes.scopeFor(enumTypes, scope);
		}

		// add built-in types
		scope = Scopes.scopeFor(SqmlBuiltInTypes.getAll(), scope);

		return scope;
	}
}
