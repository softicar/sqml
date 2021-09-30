package com.softicar.sqml.generator.table.clazz.printer;

import com.softicar.platform.common.code.title.TitleFromIdentifierDeterminer;
import com.softicar.platform.common.core.i18n.IDisplayString;
import com.softicar.platform.common.core.i18n.key.computer.I18nKeyComputer;
import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.platform.db.runtime.table.DbTableBuilder;
import com.softicar.sqml.generator.table.clazz.version.SqmlTableClassVersionEnum;
import java.util.Optional;
import java.util.function.Function;

/**
 * Prints a <i>static</i> block, setting the singular and plural title on the
 * {@link DbTableBuilder} instance.
 *
 * @author Oliver Richers
 */
public class SqmlTableClassTitlesPrinter {

	private final SqmlTableClassPrinter printer;
	private final Optional<JavaClassName> i18nClass;
	private final String singularTitle;
	private final String pluralTitle;

	public SqmlTableClassTitlesPrinter(SqmlTableClassPrinter printer) {

		this.printer = printer;
		this.i18nClass = printer.getConfig().getI18nClass();

		TitleFromIdentifierDeterminer titleDeterminer = new TitleFromIdentifierDeterminer(printer.getSimpleClassName());
		printer.getConfig().getTableClassNamePrefixes().forEach(titleDeterminer::addPrefixToDrop);
		this.singularTitle = titleDeterminer.getTitle();
		this.pluralTitle = titleDeterminer.getPluralTitle();
	}

	public void print() {

		if (i18nClass.isPresent()) {
			printWithI18nClass(i18nClass.get());
		} else {
			printWithoutI18nClass();
		}
	}

	private void printWithI18nClass(JavaClassName i18nClass) {

		printer.addImport(i18nClass);
		print(title -> String.format("%s.%s", i18nClass.getSimpleName(), new I18nKeyComputer(title).compute()));
	}

	private void printWithoutI18nClass() {

		printer.addImport(IDisplayString.class);
		if (printer.getConfig().getVersion().isBefore(SqmlTableClassVersionEnum.VERSION_20201015)) {
			print(title -> String.format("%s.createI18n(\"%s\")", IDisplayString.class.getSimpleName(), title));
		} else {
			print(title -> String.format("%s.create(\"%s\")", IDisplayString.class.getSimpleName(), title));
		}
	}

	private void print(Function<String, String> titleCreation) {

		printer.beginBlock("static");
		printer.println("%s.setTitle(%s);", printer.getTableBuilderConstant(), titleCreation.apply(singularTitle));
		printer.println("%s.setPluralTitle(%s);", printer.getTableBuilderConstant(), titleCreation.apply(pluralTitle));
		printer.endBlock();
	}
}
