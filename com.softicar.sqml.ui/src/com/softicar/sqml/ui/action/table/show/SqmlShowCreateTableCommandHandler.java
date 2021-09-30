package com.softicar.sqml.ui.action.table.show;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.softicar.sqml.ui.selection.SqmlUiSelection;
import java.util.Collection;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;

public class SqmlShowCreateTableCommandHandler extends AbstractHandler {

	public static final String ID = SqmlShowCreateTableCommandHandler.class.getCanonicalName();

	private final Provider<SqmlShowCreateTableDisplayer> showCreateTableDisplayer;

	@Inject
	public SqmlShowCreateTableCommandHandler(Provider<SqmlShowCreateTableDisplayer> showCreateTableDisplayer) {

		this.showCreateTableDisplayer = showCreateTableDisplayer;
	}

	@Override
	public Object execute(ExecutionEvent event) {

		Collection<IFile> files = new SqmlUiSelection(event).getSelectedFiles();
		if (!files.isEmpty()) {
			showCreateTableDisplayer.get().show(files);
		}
		return null;
	}
}
