package com.softicar.sqml.ui.action.clean.build;

import com.google.inject.Inject;
import com.softicar.sqml.ui.selection.SqmlUiSelection;
import java.util.Collection;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.ui.progress.IProgressConstants2;

public class SqmlCleanBuildCommandHandler extends AbstractHandler {

	public static final String ID = SqmlCleanBuildCommandHandler.class.getCanonicalName();

	@Inject
	public SqmlCleanBuildCommandHandler() {

	}

	@Override
	public Object execute(ExecutionEvent event) {

		SqmlUiSelection selection = new SqmlUiSelection(event);
		Collection<IJavaProject> projects = selection.getElementsOfType(IJavaProject.class);
		if (!projects.isEmpty()) {
			SqmlCleanBuildJob buildJob = new SqmlCleanBuildJob(projects);
			buildJob.setRule(ResourcesPlugin.getWorkspace().getRuleFactory().buildRule());
			buildJob.setUser(true);
			buildJob.setProperty(IProgressConstants2.SHOW_IN_TASKBAR_ICON_PROPERTY, Boolean.TRUE);
			buildJob.schedule();
		}
		return null;
	}
}
