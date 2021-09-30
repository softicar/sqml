package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.tables.TablesPackage;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import com.softicar.sqml.model.validation.ISqmlIssueAcceptor;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueTooManySerialOrBaseColumns extends AbstractSqmlError<ISqmlTableColumn> {

	public SqmlIssueTooManySerialOrBaseColumns(ISqmlTableColumn column) {

		super(column);
	}

	public static void validate(ISqmlTable table, ISqmlIssueAcceptor acceptor) {

		List<ISqmlTableColumn> serialOrBaseColumns = new ArrayList<>();
		for (ISqmlTableColumn column: table.getColumns()) {
			if (column.isSerial() || column.isBaseColumn()) {
				serialOrBaseColumns.add(column);
			}
		}

		if (serialOrBaseColumns.size() > 1) {
			for (ISqmlTableColumn column: serialOrBaseColumns) {
				acceptor.accept(new SqmlIssueTooManySerialOrBaseColumns(column));
			}
		}
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return TablesPackage.eINSTANCE.getSqmlTableColumn_Name();
	}

	@Override
	public String getMessage() {

		return String
			.format(//
				"Too many serial or base columns. The table '%s' must have at most one serial or one base column.",
				getTargetObject().getTable().getName());
	}
}
