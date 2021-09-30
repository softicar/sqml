package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.files.FilesPackage;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import com.softicar.sqml.model.validation.ISqmlIssueAcceptor;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * Verifies that the {@link ISqmlTable} has a serial column.
 * <p>
 * This diagnostic is usually ignored, but can be configured to be a warning or
 * error.
 *
 * @author Oliver Richers
 */
public class SqmlIssueMissingSerialColumn extends AbstractSqmlError<ISqmlTable> {

	public SqmlIssueMissingSerialColumn(ISqmlTable table) {

		super(table);
	}

	public static void validate(ISqmlTable table, ISqmlIssueAcceptor acceptor) {

		for (ISqmlTableColumn column: table.getColumns()) {
			if (column.isSerial()) {
				return;
			}
		}

		acceptor.accept(new SqmlIssueMissingSerialColumn(table));
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return FilesPackage.eINSTANCE.getSqmlFileElement_Name();
	}

	@Override
	public String getMessage() {

		return String.format("Missing serial column. The table '%s' must have a serial column.", getTargetObject().getName());
	}
}
