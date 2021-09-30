package com.softicar.sqml.test.builtin;

import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlIssues;
import java.util.List;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.junit.Test;

public class SqmlLanguagePackageTest extends AbstractSqmlTest {

	@Test
	public void test() {

		for (Resource resource: parser.loadLanguagePackage()) {
			IResourceValidator resourceValidator = ((XtextResource) resource).getResourceServiceProvider().getResourceValidator();
			List<Issue> issues = resourceValidator.validate(resource, CheckMode.ALL, null);
			if (!issues.isEmpty()) {
				fail(new SqmlIssues(issues).getIssueReport());
			}
		}
	}
}
