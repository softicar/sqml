package com.softicar.sqml.model.expressions.validation;

import com.softicar.sqml.model.ISqmlValue;
import com.softicar.sqml.model.expressions.ISqmlValueReference;
import com.softicar.sqml.model.selects.ISqmlSelect;
import com.softicar.sqml.model.selects.ISqmlSelectColumn;
import com.softicar.sqml.model.selects.ISqmlVariable;
import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.utils.SqmlNavigation;
import com.softicar.sqml.model.validation.ISqmlIssueAcceptor;

public class SqmlValueReferenceValidator {

	private final ISqmlValueReference reference;
	private final ISqmlIssueAcceptor acceptor;

	public SqmlValueReferenceValidator(ISqmlValueReference reference, ISqmlIssueAcceptor acceptor) {

		this.reference = reference;
		this.acceptor = acceptor;
	}

	public void validate() {

		validateDotStar();

		if (reference.isVariableReference()) {
			validateVariableReference();
		}

		if (reference.isTabularColumnReference()) {
			validateTableColumnReference();
		}

		if (reference.getValue() == null) {
			acceptor.accept(new SqmlIssueInvalidValueReference(reference));
		}
	}

	private void validateDotStar() {

		boolean dotStarAllowed = reference.isTableVariableReference() && reference.eContainer() instanceof ISqmlSelectColumn;

		if (reference.isDotStar() && !dotStarAllowed) {
			acceptor.accept(new SqmlIssueIllegalDotStarSuffix(reference));
		}
	}

	private void validateVariableReference() {

		// prevent references to sub-selects:
		// SELECT x FROM (SELECT...) x
		ISqmlVariable variable = (ISqmlVariable) reference.getValue();
		if (variable.getTabular() instanceof ISqmlSelect) {
			acceptor.accept(new SqmlIssueVariableReferenceRefersToSubSelect(reference.getPath()));
		}

		// prevent variable references in sub-selects
		// SELECT ... FROM (SELECT x FROM X x)
		if (reference.eContainer() instanceof ISqmlSelectColumn) {
			ISqmlSelectColumn selectColumn = (ISqmlSelectColumn) reference.eContainer();
			if (SqmlNavigation.findOrThrow(ISqmlSelect.class, selectColumn).isSubSelect()) {
				acceptor.accept(new SqmlIssueVariableReferenceUsedInSubSelect(reference.getPath()));
			}
		}
	}

	private void validateTableColumnReference() {

		ISqmlValue value = reference.getValue();
		if (value instanceof ISqmlTableColumn) {
			ISqmlTableColumn tableColumn = (ISqmlTableColumn) value;
			if (tableColumn.getTypeReference().getTypeDefinition().eIsProxy()) {
				acceptor.accept(new SqmlIssueUnresolvedTableColumnType(reference));
			}
		}
	}
}
