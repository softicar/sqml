package com.softicar.sqml.model.files.validation;

import com.softicar.platform.common.core.java.packages.name.JavaPackageName;
import com.softicar.platform.common.core.logging.Log;
import com.softicar.sqml.model.files.FilesPackage;
import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.files.ISqmlPackageDeclaration;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import com.softicar.sqml.model.validation.ISqmlValidationContext;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueInvalidPackageName extends AbstractSqmlError<ISqmlFile> {

	private final JavaPackageName declaredPackageName;
	private final JavaPackageName expectedPackageName;

	public SqmlIssueInvalidPackageName(ISqmlFile sqmlFile, JavaPackageName declaredPackageName, JavaPackageName expectedPackageName) {

		super(sqmlFile);

		this.declaredPackageName = declaredPackageName;
		this.expectedPackageName = expectedPackageName;
	}

	public static void validate(ISqmlFile sqmlFile, ISqmlValidationContext context) {

		ISqmlPackageDeclaration packageDeclaration = sqmlFile.getPackageDeclaration();
		URI fileUri = sqmlFile.eResource().getURI();
		if (fileUri.isPlatform() && packageDeclaration != null) {
			try {
				JavaPackageName declaredPackageName = packageDeclaration.getPackageName();
				JavaPackageName expectedPackageName = context.getExpectedPackageName(sqmlFile);
				if (declaredPackageName != null && !declaredPackageName.equals(expectedPackageName)) {
					context.accept(new SqmlIssueInvalidPackageName(sqmlFile, declaredPackageName, expectedPackageName));
				}
			} catch (Exception exception) {
				Log.fwarning("Failed to determine expected package name for SQML file '%s'.", fileUri);
				exception.printStackTrace();
			}
		}
	}

	@Override
	public String getMessage() {

		return String
			.format(//
				"The declared package '%s' does not match the expected package '%s'.",
				declaredPackageName,
				expectedPackageName);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return FilesPackage.eINSTANCE.getSqmlFile_PackageDeclaration();
	}
}
