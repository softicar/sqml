package com.softicar.sqml.ui.validation;

import com.softicar.sqml.model.tables.validation.SqmlIssueMissingSerialColumn;
import com.softicar.sqml.model.validation.ISqmlIssue;
import com.softicar.sqml.model.validation.ISqmlIssueType;
import com.softicar.sqml.model.validation.ISqmlValidationConfiguration;
import com.softicar.sqml.model.validation.SqmlIssueType;
import com.softicar.sqml.ui.preferences.SqmlPreferences;
import java.util.Map;
import java.util.TreeMap;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.xtext.diagnostics.Severity;

public class SqmlUiValidationConfiguration implements ISqmlValidationConfiguration {

	private final Map<ISqmlIssueType, Severity> severityMap = new TreeMap<>();
	private final boolean mandatoryIdColumn;
	private final int maximumIdentifierLength;

	public SqmlUiValidationConfiguration(IPreferenceStore preferenceStore) {

		this.mandatoryIdColumn = preferenceStore.getBoolean(SqmlPreferences.MANDATORY_ID_COLUMN);
		this.maximumIdentifierLength = preferenceStore.getInt(SqmlPreferences.MAXIMUM_IDENTIFIER_LENGTH);

		// initialize severity settings
		if (mandatoryIdColumn) {
			severityMap.put(new SqmlIssueType(SqmlIssueMissingSerialColumn.class), Severity.ERROR);
		} else {
			severityMap.put(new SqmlIssueType(SqmlIssueMissingSerialColumn.class), Severity.IGNORE);
		}
	}

	@Override
	public Severity getSeverity(ISqmlIssue issue) {

		Severity severity = severityMap.get(issue.getType());
		return severity != null? severity : issue.getSeverity();
	}

	@Override
	public boolean isMandatoryIdColumn() {

		return mandatoryIdColumn;
	}

	@Override
	public int getMaximumIdentifierLength() {

		return maximumIdentifierLength;
	}
}
