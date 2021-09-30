package com.softicar.sqml.ui.menu;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.CommandContributionItemParameter;
import org.eclipse.ui.services.IServiceLocator;

public class EclipseMenuItemBuilder {

	private final IServiceLocator serviceLocator;
	private String menuItemId;
	private String commandHandlerId;
	private String label;
	private ImageDescriptor icon;
	private int style;

	public EclipseMenuItemBuilder(IServiceLocator serviceLocator) {

		this.serviceLocator = serviceLocator;
		this.style = SWT.PUSH;
	}

	public CommandContributionItem build() {

		if (menuItemId == null) {
			throw new IllegalStateException("Menu item ID has not been defined.");
		}
		if (commandHandlerId == null) {
			throw new IllegalStateException("Command handler ID has not been defined.");
		}

		CommandContributionItemParameter parameter = new CommandContributionItemParameter(//
			serviceLocator,
			menuItemId,
			commandHandlerId,
			style);
		parameter.label = label;
		parameter.icon = icon;
		return new CommandContributionItem(parameter);
	}

	public EclipseMenuItemBuilder setMenuItemId(String menuItemId) {

		this.menuItemId = menuItemId;
		return this;
	}

	public EclipseMenuItemBuilder setCommandHandlerId(String commandHandlerId) {

		this.commandHandlerId = commandHandlerId;
		return this;
	}

	public EclipseMenuItemBuilder setLabel(String label) {

		this.label = label;
		return this;
	}

	public EclipseMenuItemBuilder setIcon(ImageDescriptor icon) {

		this.icon = icon;
		return this;
	}

	public EclipseMenuItemBuilder setStyle(int style) {

		this.style = style;
		return this;
	}
}
