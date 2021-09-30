package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.tables.TablesPackage;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import com.softicar.sqml.model.validation.ISqmlIssueAcceptor;
import java.util.List;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueUnresolvedTypeOfForeignKeyColumn extends AbstractSqmlError<ISqmlTableColumn> {

	public SqmlIssueUnresolvedTypeOfForeignKeyColumn(ISqmlTableColumn tableColumn) {

		super(tableColumn);
	}

	public static void validate(ISqmlTableColumn column, ISqmlIssueAcceptor acceptor) {

		column.getForeignKeyTargetTable().ifPresent(targetTable -> validatePrimaryKeyColumn(column, targetTable, acceptor));
	}

	private static void validatePrimaryKeyColumn(ISqmlTableColumn column, ISqmlTable targetTable, ISqmlIssueAcceptor acceptor) {

		List<ISqmlTableColumn> primarKeyColumns = targetTable.getPrimarKeyColumns();
		if (primarKeyColumns.size() == 1) {
			ISqmlTableColumn targetColumn = primarKeyColumns.get(0);
			if (targetColumn.getTypeReference().getTypeDefinition().eIsProxy()) {
				acceptor.accept(new SqmlIssueUnresolvedTypeOfForeignKeyColumn(column));
			}
		}
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return TablesPackage.eINSTANCE.getSqmlTableColumn_TypeReference();
	}

	@Override
	public String getMessage() {

		return String.format("The type of the foreign key column '%s' is unresolved.", getTargetObject().getName());
	}
}
