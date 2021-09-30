package com.softicar.sqml.ui.icons;

import org.eclipse.jface.resource.ImageDescriptor;

public enum SqmlUiIconEnum {
	DB_TO_SQML("db_to_sqml.png"),
	DOWNLOAD("download.png"),
	JAVA("java.png"),
	JAVA_EXTRACT("java_extract.png"),
	RELOAD("reload.png"),
	SQL("sql.png"),
	SQML("sqml.png"),
	SQML_TO_JAVA("sqml_to_java.png");

	private final String filename;

	private SqmlUiIconEnum(String filename) {

		this.filename = filename;
	}

	public ImageDescriptor getImageDescriptor() {

		return ImageDescriptor.createFromFile(SqmlUiIconEnum.class, filename);
	}
}
