package com.softicar.sqml.model.queries.validation;

import com.softicar.sqml.model.selects.ISqmlSelectColumn;
import com.softicar.sqml.model.selects.SelectsPackage;
import com.softicar.sqml.model.validation.AbstractSqmlWarning;
import java.util.regex.Pattern;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueIllegalSelectColumnTitle extends AbstractSqmlWarning<ISqmlSelectColumn> {

	private static final Pattern LEGAL_TITLE_PATTERN = Pattern.compile("[A-Za-z0-9 _-]+");

	public SqmlIssueIllegalSelectColumnTitle(ISqmlSelectColumn selectColumn) {

		super(selectColumn);
	}

	public static boolean isValidateTitle(String title) {

		return title == null || title.isEmpty() || LEGAL_TITLE_PATTERN.matcher(title).matches();
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return SelectsPackage.eINSTANCE.getSqmlSelectColumn_Title();
	}

	@Override
	public String getMessage() {

		return String.format("Illegal column title '%s'. Must match regex '%s'.", getTargetObject().getTitle(), LEGAL_TITLE_PATTERN.pattern());
	}
}
