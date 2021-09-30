package com.softicar.sqml.model.utils;

import com.google.common.base.Predicates;
import com.softicar.platform.db.core.table.DbTableName;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.TablesPackage;
import java.util.Map;
import java.util.TreeMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.IScope;

public class SqmlQualifiedPhysicalTableName {

	private static final String PREFIX = "$sqml.physicalTableName.";
	private final QualifiedName qualifiedName;

	public SqmlQualifiedPhysicalTableName(String physicalName) {

		this.qualifiedName = getQualifiedName(physicalName);
	}

	public SqmlQualifiedPhysicalTableName(DbTableName tableName) {

		this(tableName.getCanonicalName());
	}

	public SqmlQualifiedPhysicalTableName(ISqmlTable table) {

		this(table.getPhysicalNameOverride());
	}

	public static QualifiedName getQualifiedName(String physicalName) {

		return QualifiedName.create(PREFIX + physicalName);
	}

	public Map<QualifiedName, ISqmlTable> findAllTables(IGlobalScopeProvider globalScopeProvider, Resource contextResource) {

		// get global scope
		IScope scope = globalScopeProvider.getScope(contextResource, TablesPackage.eINSTANCE.getSqmlTableColumn_Table(), Predicates.alwaysTrue());

		// find tables
		Map<QualifiedName, ISqmlTable> tables = new TreeMap<>();
		for (IEObjectDescription objectDescription: scope.getElements(qualifiedName)) {
			ISqmlTable table = resolveTable(objectDescription.getEObjectOrProxy(), contextResource);
			tables.put(table.getQualifiedName(), table);
		}
		return tables;
	}

	private static ISqmlTable resolveTable(EObject object, Resource contextResource) {

		if (object.eIsProxy()) {
			return (ISqmlTable) EcoreUtil.resolve(object, contextResource);
		} else {
			return (ISqmlTable) object;
		}
	}

	public static QualifiedName getQualifiedName(DbTableName tableName) {

		return getQualifiedName(tableName.getCanonicalName());
	}
}
