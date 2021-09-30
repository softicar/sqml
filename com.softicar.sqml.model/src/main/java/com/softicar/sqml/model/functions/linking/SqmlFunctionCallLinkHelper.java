package com.softicar.sqml.model.functions.linking;

import com.softicar.sqml.model.builtin.SqmlBuiltInPackage;
import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.files.ISqmlImport;
import com.softicar.sqml.model.functions.ISqmlFunction;
import com.softicar.sqml.model.functions.ISqmlFunctionCall;
import com.softicar.sqml.model.utils.SqmlNavigation;
import java.util.Set;
import java.util.TreeSet;
import org.eclipse.xtext.naming.QualifiedName;

/**
 * Helper class to improve performance of computations in
 * {@link SqmlFunctionCallLink}.
 *
 * @author Oliver Richers
 */
public class SqmlFunctionCallLinkHelper {

	private final ISqmlFunctionCall functionCall;
	private final QualifiedName calledFunctionName;
	private final ISqmlFile callingFile;
	private final QualifiedName callingPackageName;
	private final Set<QualifiedName> importedNames;

	public SqmlFunctionCallLinkHelper(ISqmlFunctionCall functionCall) {

		this.functionCall = functionCall;
		this.calledFunctionName = functionCall.getFunctionName();
		this.callingFile = SqmlNavigation.findOrThrow(ISqmlFile.class, functionCall);
		this.callingPackageName = callingFile.getPackageName();
		this.importedNames = collectImportedNames();
	}

	private Set<QualifiedName> collectImportedNames() {

		Set<QualifiedName> importedNames = new TreeSet<>();
		for (ISqmlImport sqmlImport: callingFile.getImports()) {
			importedNames.add(sqmlImport.getQualifiedName());
		}
		return importedNames;
	}

	private boolean isQualifiedCall() {

		return calledFunctionName.getSegmentCount() > 1;
	}

	public boolean isMatchingName(ISqmlFunction function) {

		return isMatchingName(function.getQualifiedName());
	}

	private boolean isMatchingName(QualifiedName qualifiedName) {

		if (isQualifiedCall()) {
			return qualifiedName.equals(calledFunctionName);
		} else {
			return qualifiedName.getLastSegment().equals(calledFunctionName.getLastSegment());
		}
	}

	public boolean isVisible(ISqmlFunction function) {

		if (isQualifiedCall()) {
			// all qualified calls are visible
			return true;
		} else {
			// local function?
			if (function.getSqmlFile() == callingFile) {
				return true;
			}

			// imported function?
			if (importedNames.contains(function.getQualifiedName())) {
				return true;
			}

			// local package
			if (isFromPackage(function, callingPackageName)) {
				return true;
			}

			// language package
			if (SqmlBuiltInPackage.contains(function)) {
				return true;
			}

			return false;
		}
	}

	public boolean isMatchingArgumentCount(ISqmlFunction function) {

		return function.getParameters().size() == functionCall.getArguments().size();
	}

	public int getArgumentConversionCount(ISqmlFunction function) {

		return function.getArgumentConversionCount(functionCall.getArguments());
	}

	public int getCallDistance(ISqmlFunction function) {

		if (isQualifiedCall()) {
			return 0;
		} else if (function.getSqmlFile() == callingFile) {
			return 0;
		} else if (callingFile.hasImport(function.getQualifiedName())) {
			return 1;
		} else if (function//
			.getQualifiedName()
			.skipLast(1)
			.equals(callingFile.getPackageDeclaration().getQualifiedName())) {
			return 2;
		} else if (SqmlBuiltInPackage.contains(function)) {
			return 3;
		} else {
			return 4;
		}
	}

	private boolean isFromPackage(ISqmlFunction function, QualifiedName packageName) {

		QualifiedName qualifiedName = function.getQualifiedName();
		if (qualifiedName.getSegmentCount() == packageName.getSegmentCount() + 1) {
			return qualifiedName.skipLast(1).equals(packageName);
		} else {
			return false;
		}
	}
}
