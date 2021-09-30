package com.softicar.sqml.ui.menu;

import com.softicar.sqml.ui.action.clean.build.SqmlCleanBuildCommandHandler;
import com.softicar.sqml.ui.action.table.download.SqmlTableStructuresDownloadCommandHandler;
import com.softicar.sqml.ui.icons.SqmlUiIconEnum;
import java.util.Collection;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.ui.services.IServiceLocator;

public class SqmlProjectsPopupMenu extends MenuManager {

	public static final String ID = SqmlProjectsPopupMenu.class.getCanonicalName();

	public SqmlProjectsPopupMenu(IServiceLocator serviceLocator, Collection<IJavaProject> projects) {

		super("Sqml", SqmlUiIconEnum.SQML.getImageDescriptor(), ID);

		setVisible(true);
		this
			.add(
				new EclipseMenuItemBuilder(serviceLocator)//
					.setMenuItemId(ID + "#" + SqmlCleanBuildCommandHandler.ID)
					.setCommandHandlerId(SqmlCleanBuildCommandHandler.ID)
					.setIcon(SqmlUiIconEnum.RELOAD.getImageDescriptor())
					.setLabel(getLabelForCleanAndRebuild(projects))
					.build());
		this
			.add(
				new EclipseMenuItemBuilder(serviceLocator)//
					.setMenuItemId(ID + "#" + SqmlTableStructuresDownloadCommandHandler.ID)
					.setCommandHandlerId(SqmlTableStructuresDownloadCommandHandler.ID)
					.setIcon(SqmlUiIconEnum.DOWNLOAD.getImageDescriptor())
					.setLabel(getLabelForDownloadOfTableStructures(projects))
					.build());
	}

	private static String getLabelForCleanAndRebuild(Collection<IJavaProject> projects) {

		if (projects.size() == 1) {
			return String.format("Clean and Re-Build Project %s", projects.iterator().next().getElementName());
		} else {
			return String.format("Clean and Re-Build %s Projects", projects.size());
		}
	}

	private static String getLabelForDownloadOfTableStructures(Collection<IJavaProject> projects) {

		if (projects.size() == 1) {
			return String.format("Download Table Structures for Project %s", projects.iterator().next().getElementName());
		} else {
			return String.format("Download Table Structures %s Projects", projects.size());
		}
	}
}
