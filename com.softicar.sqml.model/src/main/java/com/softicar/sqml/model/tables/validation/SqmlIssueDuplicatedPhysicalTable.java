package com.softicar.sqml.model.tables.validation;

import com.softicar.platform.common.string.Imploder;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.TablesPackage;
import com.softicar.sqml.model.utils.SqmlNavigation;
import com.softicar.sqml.model.utils.SqmlQualifiedPhysicalTableName;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import com.softicar.sqml.model.validation.ISqmlValidationContext;
import java.util.Set;
import java.util.TreeSet;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;

public class SqmlIssueDuplicatedPhysicalTable extends AbstractSqmlError<ISqmlTable> {

	private final Set<QualifiedName> allTableNames;

	public SqmlIssueDuplicatedPhysicalTable(ISqmlTable table, Set<QualifiedName> allTableNames) {

		super(table);

		this.allTableNames = allTableNames;
	}

	public static void validate(ISqmlTable table, ISqmlValidationContext context) {

		// get matching tables from global scope
		Resource resource = SqmlNavigation.getResource(table);
		IGlobalScopeProvider scopeProvider = context.getInjector().getInstance(IGlobalScopeProvider.class);

		// collect qualified table names
		Set<QualifiedName> tableNames = new TreeSet<>();
		tableNames.add(table.getQualifiedName());
		tableNames.addAll(new SqmlQualifiedPhysicalTableName(table).findAllTables(scopeProvider, resource).keySet());

		// create error is necessary
		if (tableNames.size() > 1) {
			context.accept(new SqmlIssueDuplicatedPhysicalTable(table, tableNames));
		}
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return TablesPackage.eINSTANCE.getSqmlTable_PhysicalNameOverride();
	}

	@Override
	public String getMessage() {

		return String
			.format(//
				"The database table '%s' is implemented several times: %s",
				getTargetObject().getDisplayName(),
				Imploder.implode(allTableNames, ", "));
	}
}
