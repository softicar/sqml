package com.softicar.sqml.model.utils.scoping;

import com.softicar.platform.common.container.map.list.ListTreeMap;
import com.softicar.sqml.model.ISqmlGlobalObject;
import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.files.ISqmlImport;
import com.softicar.sqml.model.functions.ISqmlFunction;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.types.ISqmlEnum;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

public class SqmlImportScope extends AbstractSqmlScope {

	private final Map<EObject, IEObjectDescription> objectToDescription;
	private final ListTreeMap<QualifiedName, IEObjectDescription> nameToDescription;

	public SqmlImportScope(ISqmlFile sqmlFile, IScope globalScope) {

		this.objectToDescription = new HashMap<>();
		this.nameToDescription = new ListTreeMap<>();

		for (ISqmlImport sqmlImport: sqmlFile.getImports()) {
			ISqmlGlobalObject target = sqmlImport.getTarget();
			QualifiedName qualifiedName = sqmlImport.getQualifiedName();
			if (isValid(target, qualifiedName)) {
				if (target instanceof ISqmlTable || target instanceof ISqmlEnum) {
					register(target, new EObjectDescription(target.getQualifiedName(), target, null));
				} else if (target instanceof ISqmlFunction) {
					for (IEObjectDescription description: globalScope.getElements(qualifiedName)) {
						register(description.getEObjectOrProxy(), description);
					}
				} else {
					// invalid
				}
			}
		}
	}

	private void register(EObject target, IEObjectDescription originalDescription) {

		IEObjectDescription aliasDescription = new SqmlAliasEObjectDescription(originalDescription);
		objectToDescription.put(target, aliasDescription);
		nameToDescription.addToList(aliasDescription.getName(), aliasDescription);
	}

	private boolean isValid(ISqmlGlobalObject target, QualifiedName qualifiedName) {

		return !target.eIsProxy() && !qualifiedName.isEmpty();
	}

	@Override
	public Iterable<IEObjectDescription> getElements(QualifiedName qualifiedName) {

		return nameToDescription.getList(qualifiedName);
	}

	@Override
	public Iterable<IEObjectDescription> getElements(EObject object) {

		IEObjectDescription description = objectToDescription.get(object);
		return description != null? Collections.singleton(description) : Collections.emptyList();
	}

	@Override
	public Iterable<IEObjectDescription> getAllElements() {

		return objectToDescription.values();
	}
}
