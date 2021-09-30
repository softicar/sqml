package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.tables.TablesPackage;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import com.softicar.sqml.model.validation.ISqmlIssueAcceptor;
import java.util.List;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueSerialOrBaseColumnNotSinglePrimaryKeyColumn extends AbstractSqmlError<ISqmlTableColumn> {

	private final String type;

	public SqmlIssueSerialOrBaseColumnNotSinglePrimaryKeyColumn(ISqmlTableColumn column, String type) {

		super(column);
		this.type = type;
	}

	public static void validate(ISqmlTable table, ISqmlIssueAcceptor acceptor) {

		List<ISqmlTableColumn> primaryKeyColumns = table.getPrimarKeyColumns();

		for (ISqmlTableColumn column: primaryKeyColumns) {
			if (column.isSerial()) {
				if (!isExactPrimaryKeyColumn(column, primaryKeyColumns)) {
					acceptor.accept(new SqmlIssueSerialOrBaseColumnNotSinglePrimaryKeyColumn(column, "serial"));
				}
			} else if (column.isBaseColumn()) {
				if (!isExactPrimaryKeyColumn(column, primaryKeyColumns)) {
					acceptor.accept(new SqmlIssueSerialOrBaseColumnNotSinglePrimaryKeyColumn(column, "base"));
				}
			}
		}
	}

	private static boolean isExactPrimaryKeyColumn(ISqmlTableColumn column, List<ISqmlTableColumn> primaryKeyColumns) {

		return primaryKeyColumns.size() == 1 && primaryKeyColumns.get(0) == column;
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return TablesPackage.eINSTANCE.getSqmlTableColumn_Name();
	}

	@Override
	public String getMessage() {

		return String.format("The %s column '%s' must be the only column of the primary key.", type, getTargetObject().getName());
	}
}
