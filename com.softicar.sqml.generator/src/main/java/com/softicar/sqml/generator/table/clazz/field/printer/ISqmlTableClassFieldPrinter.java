package com.softicar.sqml.generator.table.clazz.field.printer;

import com.softicar.platform.db.structure.column.IDbColumnStructure;
import com.softicar.sqml.generator.table.clazz.field.definition.ISqmlTableClassFieldDefinition;
import com.softicar.sqml.generator.table.clazz.field.utils.SqmlTableClassFieldNameDeterminer;

/**
 * Common interface of all field printers.
 *
 * @author Oliver Richers
 */
public interface ISqmlTableClassFieldPrinter {

	IDbColumnStructure getColumnStructure();

	ISqmlTableClassFieldDefinition getFieldDefinition();

	SqmlTableClassFieldNameDeterminer getNameDeterminer();

	String getEnumClassName();

	void printStaticFinal(int index);

	void printEnumClass();

	void printGetFunction();

	void printSetFunction();
}
