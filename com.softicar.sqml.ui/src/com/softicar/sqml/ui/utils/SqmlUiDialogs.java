package com.softicar.sqml.ui.utils;

import com.softicar.platform.common.string.formatting.Formatting;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

public class SqmlUiDialogs {

	public static void showError(ExecutionEvent event, String text, Object...arguments) {

		Shell shell = HandlerUtil.getActiveShell(event);
		showError(shell, text, arguments);
	}

	public static void showError(Shell shell, String text, Object...arguments) {

		MessageDialog.openError(shell, "Error", Formatting.format(text, arguments));
	}
}
