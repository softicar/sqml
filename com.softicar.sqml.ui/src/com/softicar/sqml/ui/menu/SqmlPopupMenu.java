package com.softicar.sqml.ui.menu;

import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.ui.action.custom.base.extraction.SqmlCustomBaseClassExtractionCommandHandler;
import com.softicar.sqml.ui.action.custom.table.extraction.SqmlCustomTableClassExtractionCommandHandler;
import com.softicar.sqml.ui.action.generated.base.extraction.SqmlGeneratedBaseClassExtractionCommandHandler;
import com.softicar.sqml.ui.action.table.download.SqmlTableStructuresDownloadCommandHandler;
import com.softicar.sqml.ui.action.table.download.SqmlTableStructuresInPackageDownloadCommandHandler;
import com.softicar.sqml.ui.action.table.download.SqmlTableStructuresInPackageTreeDownloadCommandHandler;
import com.softicar.sqml.ui.action.table.show.SqmlShowCreateTableCommandHandler;
import com.softicar.sqml.ui.icons.SqmlUiIconEnum;
import java.util.Collection;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.ui.services.IServiceLocator;

public class SqmlPopupMenu extends MenuManager {

	private static final String ID = SqmlPopupMenu.class.getCanonicalName();

	public SqmlPopupMenu(IServiceLocator serviceLocator, Collection<ISqmlTable> tables) {

		super("Sqml", SqmlUiIconEnum.SQML.getImageDescriptor(), ID);

		setVisible(true);
		this
			.add(
				new EclipseMenuItemBuilder(serviceLocator)//
					.setMenuItemId(ID + "#" + SqmlCustomBaseClassExtractionCommandHandler.ID)
					.setCommandHandlerId(SqmlCustomBaseClassExtractionCommandHandler.ID)
					.setIcon(SqmlUiIconEnum.JAVA_EXTRACT.getImageDescriptor())
					.setLabel("Extract Base Class")
					.build());
		this
			.add(
				new EclipseMenuItemBuilder(serviceLocator)//
					.setMenuItemId(ID + "#" + SqmlCustomTableClassExtractionCommandHandler.ID)
					.setCommandHandlerId(SqmlCustomTableClassExtractionCommandHandler.ID)
					.setIcon(SqmlUiIconEnum.JAVA_EXTRACT.getImageDescriptor())
					.setLabel("Extract Table Class")
					.build());
		this
			.add(
				new EclipseMenuItemBuilder(serviceLocator)//
					.setMenuItemId(ID + "#" + SqmlGeneratedBaseClassExtractionCommandHandler.ID)
					.setCommandHandlerId(SqmlGeneratedBaseClassExtractionCommandHandler.ID)
					.setIcon(SqmlUiIconEnum.JAVA_EXTRACT.getImageDescriptor())
					.setLabel("Extract Generated Class")
					.build());
		this
			.add(
				new EclipseMenuItemBuilder(serviceLocator)//
					.setMenuItemId(ID + "#" + SqmlTableStructuresDownloadCommandHandler.ID)
					.setCommandHandlerId(SqmlTableStructuresDownloadCommandHandler.ID)
					.setIcon(SqmlUiIconEnum.DOWNLOAD.getImageDescriptor())
					.setLabel(getLabelForDownload(tables))
					.build());
		this
			.add(
				new EclipseMenuItemBuilder(serviceLocator)//
					.setMenuItemId(ID + "#" + SqmlShowCreateTableCommandHandler.ID)
					.setCommandHandlerId(SqmlShowCreateTableCommandHandler.ID)
					.setIcon(SqmlUiIconEnum.SQL.getImageDescriptor())
					.setLabel("Show Create Table")
					.build());
	}

	private static String getLabelForDownload(Collection<ISqmlTable> tables) {

		if (tables.size() == 1) {
			return String.format("Download Table Structure for %s", tables.iterator().next().getName());
		} else {
			return String.format("Download Table Structures for %s Tables", tables.size());
		}
	}

	public SqmlPopupMenu(IServiceLocator serviceLocator, IPackageFragment packageFragment) {

		super("Sqml", SqmlUiIconEnum.SQML.getImageDescriptor(), ID);

		setVisible(true);
		this
			.add(
				new EclipseMenuItemBuilder(serviceLocator)//
					.setMenuItemId(ID + ".Package")
					.setCommandHandlerId(SqmlTableStructuresInPackageDownloadCommandHandler.ID)
					.setIcon(SqmlUiIconEnum.DOWNLOAD.getImageDescriptor())
					.setLabel(String.format("Download Table Structures in Package %s", packageFragment.getElementName()))
					.build());
		this
			.add(
				new EclipseMenuItemBuilder(serviceLocator)//
					.setMenuItemId(ID + ".PackageTree")
					.setCommandHandlerId(SqmlTableStructuresInPackageTreeDownloadCommandHandler.ID)
					.setIcon(SqmlUiIconEnum.DOWNLOAD.getImageDescriptor())
					.setLabel(String.format("Download Table Structures in Package Tree %s.*", packageFragment.getElementName()))
					.build());
	}
}
