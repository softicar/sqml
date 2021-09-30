package com.softicar.sqml.model.queries.validation;

import com.softicar.sqml.model.queries.ISqmlQuery;
import com.softicar.sqml.model.selects.ISqmlSelect;
import com.softicar.sqml.model.selects.ISqmlSelectColumn;
import com.softicar.sqml.model.utils.SqmlNavigation;
import com.softicar.sqml.model.validation.ISqmlIssueAcceptor;
import org.eclipse.emf.ecore.resource.Resource;

public class SqmlQueryValidator {

	private final ISqmlQuery query;
	private final ISqmlIssueAcceptor acceptor;

	public SqmlQueryValidator(ISqmlQuery query, ISqmlIssueAcceptor acceptor) {

		this.query = query;
		this.acceptor = acceptor;
	}

	public void validate() {

		checkQueryName();
		checkForMissingSelectClause();
		validateSelectColumnTitles();
	}

	private void checkQueryName() {

		String name = query.getName();
		if (name != null && !name.isEmpty()) {
			// check matching filename
			Resource resource = SqmlNavigation.getResource(query);
			String expectedName = resource.getURI().trimFileExtension().lastSegment();
			if (!name.equals(expectedName)) {
				acceptor.accept(new SqmlIssueQueryNameMustMatchFilename(query, expectedName));
			}

			// check upper-camel-case
			if (!Character.isUpperCase(name.charAt(0))) {
				acceptor.accept(new SqmlIssueQueryNameNotUpperCamelCase(query));
			}

			// check ending with Query
			if (!name.endsWith("Query")) {
				acceptor.accept(new SqmlIssueQueryNameNotEndingWithQueryWord(query));
			}
		}
	}

	private void checkForMissingSelectClause() {

		ISqmlSelect select = query.getSelect();
		if (select == null || select.getAllSelectClauses().isEmpty()) {
			acceptor.accept(new SqmlIssueQueryWithMissingSelectClause(query));
		}
	}

	private void validateSelectColumnTitles() {

		ISqmlSelect select = query.getSelect();
		for (ISqmlSelectColumn selectColumn: select.getColumns()) {
			if (!SqmlIssueIllegalSelectColumnTitle.isValidateTitle(selectColumn.getTitle())) {
				acceptor.accept(new SqmlIssueIllegalSelectColumnTitle(selectColumn));
			}
		}
	}
}
