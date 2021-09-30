package com.softicar.sqml.generator.table.clazz.field.printer;

import com.softicar.platform.common.code.title.TitleFromIdentifierDeterminer;
import com.softicar.platform.common.core.i18n.IDisplayString;
import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.platform.db.structure.column.IDbColumnStructure;
import com.softicar.sqml.generator.table.clazz.field.utils.SqmlTableClassFieldDeclarationBuilder;
import com.softicar.sqml.generator.table.clazz.printer.SqmlTableClassPrinter;
import com.softicar.sqml.generator.table.clazz.version.SqmlTableClassVersionEnum;
import java.util.Optional;

class SqmlTableClassFieldSetTitleAppender {

	private final SqmlTableClassPrinter classPrinter;
	private final IDbColumnStructure column;
	private final SqmlTableClassFieldDeclarationBuilder declaration;

	public SqmlTableClassFieldSetTitleAppender(SqmlTableClassPrinter classPrinter, IDbColumnStructure column,
			SqmlTableClassFieldDeclarationBuilder declaration) {

		this.classPrinter = classPrinter;
		this.column = column;
		this.declaration = declaration;
	}

	public void append() {

		if (classPrinter.isVersionEqualOrLater(SqmlTableClassVersionEnum.VERSION_20200502)) {
			Optional<JavaClassName> i18nClass = classPrinter.getConfig().getI18nClass();
			if (i18nClass.isPresent()) {
				appendSetTitleWithI18nClass(i18nClass.get());
			} else {
				appendSetTitleWithoutI18nClass();
			}
		}
	}

	private void appendSetTitleWithI18nClass(JavaClassName i18nClass) {

		classPrinter.addImport(i18nClass);
		declaration
			.append(//
				".setTitle(%s.%s)",
				i18nClass.getSimpleName(),
				getFieldTitleConstant());
	}

	private String getFieldTitleConstant() {

		String title = getFieldTitle();
		if (Character.isDigit(title.charAt(0))) {
			title = '_' + title;
		}
		return title.replace(' ', '_').toUpperCase();
	}

	private void appendSetTitleWithoutI18nClass() {

		classPrinter.addImport(IDisplayString.class);
		if (classPrinter.getConfig().getVersion().isBefore(SqmlTableClassVersionEnum.VERSION_20201015)) {
			declaration
				.append(//
					".setTitle(%s.createI18n(\"%s\"))",
					IDisplayString.class.getSimpleName(),
					getFieldTitle());
		} else {
			declaration
				.append(//
					".setTitle(%s.create(\"%s\"))",
					IDisplayString.class.getSimpleName(),
					getFieldTitle());
		}
	}

	private String getFieldTitle() {

		return new TitleFromIdentifierDeterminer(column.getLogicalName()).getTitle();
	}
}
