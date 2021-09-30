package com.softicar.sqml.ui.preferences;

import com.softicar.sqml.generator.common.SqmlImportOverridesParser;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.widgets.Composite;

public class SqmlImportOverridesEditor extends StringFieldEditor {

	private boolean oldValid;

	public SqmlImportOverridesEditor(Composite parent) {

		super(//
			SqmlPreferences.IMPORT_OVERRIDES,
			"Import Overrides",
			StringFieldEditor.UNLIMITED,
			10,
			StringFieldEditor.VALIDATE_ON_KEY_STROKE,
			parent);

		this.oldValid = true;
	}

	@Override
	protected void refreshValidState() {

		Collection<String> errors = parse().getErrors();
		if (errors.isEmpty()) {
			clearErrorMessage();
			updateValidState(true);
		} else {
			showErrorMessage(errors.stream().collect(Collectors.joining("\n")));
			updateValidState(false);
		}
	}

	@Override
	public boolean isValid() {

		return parse().getErrors().isEmpty();
	}

	private SqmlImportOverridesParser parse() {

		return new SqmlImportOverridesParser(Optional.of(getStringValue()).orElse("")).parse();
	}

	private void updateValidState(boolean newValid) {

		if (oldValid != newValid) {
			fireStateChanged(IS_VALID, oldValid, newValid);
			this.oldValid = newValid;
		}
	}
}
