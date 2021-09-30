package com.softicar.sqml.ui.action.table.show;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.softicar.platform.db.structure.utils.DbTableStructureSqlGenerator;
import com.softicar.sqml.generator.table.structure.SqmlTableStructure;
import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.SqmlMissingTargetTableOfForeignKeyException;
import com.softicar.sqml.ui.internal.SqmlActivator;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

public class SqmlShowCreateTableDisplayer {

	private final IResourceSetProvider resourceSetProvider;

	@Inject
	public SqmlShowCreateTableDisplayer(Injector injector) {

		this.resourceSetProvider = injector.getInstance(IResourceSetProvider.class);
	}

	public void show(Collection<? extends IFile> files) {

		Shell shell = SqmlActivator.getInstance().getWorkbench().getActiveWorkbenchWindow().getShell();
		try {
			new SqmlShowCreateTableDialog(shell, getShowCreateTableStatements(files)).open();
		} catch (SqmlMissingTargetTableOfForeignKeyException exception) {
			MessageDialog
				.openError(//
					shell,
					"Missing Target Table",
					exception.getMessage() + "\n\nTry rebuilding the project.");
		}
	}

	private String getShowCreateTableStatements(Collection<? extends IFile> files) {

		return getTables(files)//
			.stream()
			.sorted(Comparator.comparing(ISqmlTable::getPhysicalNameOverride))
			.map(this::getShowCreateTableStatement)
			.collect(Collectors.joining("\n\n"));
	}

	private String getShowCreateTableStatement(ISqmlTable table) {

		return new DbTableStructureSqlGenerator(new SqmlTableStructure(table))//
			.setHumanReadable(true)
			.getCreateTableStatement();
	}

	private Set<ISqmlTable> getTables(Collection<? extends IFile> files) {

		return files//
			.stream()
			.map(this::getTables)
			.flatMap(Collection::stream)
			.collect(Collectors.toCollection(HashSet::new));
	}

	private Collection<? extends ISqmlTable> getTables(IFile file) {

		return getSqmlFile(file).getTables();
	}

	private ISqmlFile getSqmlFile(IFile file) {

		ResourceSet resourceSet = resourceSetProvider.get(file.getProject());
		URI resourceURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
		return (ISqmlFile) resourceSet.getResource(resourceURI, true).getContents().get(0);
	}
}
