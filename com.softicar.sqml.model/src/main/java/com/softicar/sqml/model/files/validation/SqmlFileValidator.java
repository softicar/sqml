package com.softicar.sqml.model.files.validation;

import com.softicar.platform.common.container.map.list.ListTreeMap;
import com.softicar.sqml.model.ISqmlGlobalObject;
import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.files.ISqmlImport;
import com.softicar.sqml.model.utils.references.SqmlOutboundReferencesProvider;
import com.softicar.sqml.model.validation.ISqmlValidationContext;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import org.eclipse.xtext.naming.QualifiedName;

public class SqmlFileValidator {

	private final ISqmlFile file;
	private final ISqmlValidationContext context;

	public SqmlFileValidator(ISqmlFile file, ISqmlValidationContext context) {

		this.file = file;
		this.context = context;
	}

	public void validate() {

		checkForInvalidPackageName();
		checkForDuplicatedImports();
		checkForUnusedImports();
	}

	private void checkForInvalidPackageName() {

		SqmlIssueInvalidPackageName.validate(file, context);
	}

	private void checkForDuplicatedImports() {

		ListTreeMap<QualifiedName, ISqmlImport> aliasToImport = new ListTreeMap<>();
		for (ISqmlImport sqmlImport: file.getImports()) {
			aliasToImport.addToList(sqmlImport.getAlias(), sqmlImport);
		}

		for (Entry<QualifiedName, List<ISqmlImport>> entry: aliasToImport.entrySet()) {
			List<ISqmlImport> imports = entry.getValue();
			if (imports.size() > 1) {
				if (isAllSameTarget(imports)) {
					for (ISqmlImport sqmlImport: imports) {
						context.accept(new SqmlIssueDuplicatedImport(sqmlImport));
					}
				} else {
					for (ISqmlImport sqmlImport: imports) {
						context.accept(new SqmlIssueConflictingImport(sqmlImport));
					}
				}
			}
		}
	}

	private static boolean isAllSameTarget(List<ISqmlImport> imports) {

		QualifiedName qualifiedName = null;
		for (ISqmlImport sqmlImport: imports) {
			if (qualifiedName == null) {
				qualifiedName = sqmlImport.getQualifiedName();
			} else if (!sqmlImport.getQualifiedName().equals(qualifiedName)) {
				return false;
			}
		}
		return true;
	}

	private void checkForUnusedImports() {

		// collect names of all external objects
		Set<QualifiedName> referencedExternalNames = context
			.getInjector()//
			.getInstance(SqmlOutboundReferencesProvider.class)
			.getReferences(file)
			.stream()
			.filter(crossReference -> crossReference.getTargetObject() instanceof ISqmlGlobalObject)
			.filter(crossReference -> !(crossReference.getSourceObject() instanceof ISqmlImport))
			.map(crossReference -> crossReference.getTargetObject())
			.map(targetObject -> (ISqmlGlobalObject) targetObject)
			.map(globalObject -> globalObject.getQualifiedName())
			.collect(Collectors.toSet());

		for (ISqmlImport sqmlImport: file.getImports()) {
			if (!referencedExternalNames.contains(sqmlImport.getQualifiedName())) {
				context.accept(new SqmlIssueUnusedImport(sqmlImport));
			}
		}
	}
}
