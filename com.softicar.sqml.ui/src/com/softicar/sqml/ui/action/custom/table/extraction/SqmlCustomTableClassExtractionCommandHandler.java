package com.softicar.sqml.ui.action.custom.table.extraction;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.softicar.sqml.generator.table.clazz.ISqmlTableClassGenerator;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.ui.selection.SqmlUiSelection;
import java.util.List;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

public class SqmlCustomTableClassExtractionCommandHandler extends AbstractHandler {

	public static final String ID = SqmlCustomTableClassExtractionCommandHandler.class.getCanonicalName();
	private final IResourceSetProvider resourceSetProvider;
	private final Provider<ISqmlTableClassGenerator> generatorProvider;

	@Inject
	public SqmlCustomTableClassExtractionCommandHandler(IResourceSetProvider resourceSetProvider, Provider<ISqmlTableClassGenerator> generatorProvider) {

		this.resourceSetProvider = resourceSetProvider;
		this.generatorProvider = generatorProvider;
	}

	@Override
	public Object execute(ExecutionEvent event) {

		SqmlUiSelection selection = new SqmlUiSelection(event);
		List<ISqmlTable> tables = selection.getSelectedSqmlTables(resourceSetProvider);
		if (!tables.isEmpty()) {
			SqmlCustomTableClassExtrationJob job = new SqmlCustomTableClassExtrationJob(generatorProvider.get(), tables);
			job.setUser(true);
			job.schedule();
		}
		return null;
	}
}
