package com.softicar.sqml.ui.menu;

import com.google.inject.Inject;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.ui.selection.SqmlUiSelection;
import java.util.Collection;
import org.eclipse.core.expressions.Expression;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.ui.menus.ExtensionContributionFactory;
import org.eclipse.ui.menus.IContributionRoot;
import org.eclipse.ui.services.IServiceLocator;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

public class SqmlContributionFactory extends ExtensionContributionFactory {

	private final IResourceSetProvider resourceSetProvider;

	@Inject
	public SqmlContributionFactory(IResourceSetProvider resourceSetProvider) {

		this.resourceSetProvider = resourceSetProvider;
	}

	@Override
	public void createContributionItems(IServiceLocator serviceLocator, IContributionRoot additions) {

		SqmlUiSelection selection = new SqmlUiSelection(serviceLocator);

		// selected project
		Collection<IJavaProject> selectedProjects = selection.getElementsOfType(IJavaProject.class);
		if (!selectedProjects.isEmpty()) {
			additions.addContributionItem(new SqmlProjectsPopupMenu(serviceLocator, selectedProjects), Expression.TRUE);
			return;
		}

		// selected package fragment
		IPackageFragment packageFragment = selection.getSingleElementOrNull(IPackageFragment.class);
		if (packageFragment != null) {
			additions.addContributionItem(new SqmlPopupMenu(serviceLocator, packageFragment), Expression.TRUE);
			return;
		}

		// selected tables
		Collection<ISqmlTable> tables = selection.getSelectedSqmlTables(resourceSetProvider);
		if (!tables.isEmpty()) {
			additions.addContributionItem(new SqmlPopupMenu(serviceLocator, tables), Expression.TRUE);
			return;
		}
	}
}
