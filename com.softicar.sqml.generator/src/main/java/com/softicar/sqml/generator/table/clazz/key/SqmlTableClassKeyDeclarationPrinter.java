package com.softicar.sqml.generator.table.clazz.key;

import com.softicar.platform.common.code.java.IdentifierNames;
import com.softicar.platform.common.code.java.WordFragment;
import com.softicar.platform.db.runtime.key.IDbKey;
import com.softicar.platform.db.structure.column.IDbColumnStructure;
import com.softicar.platform.db.structure.key.DbKeyType;
import com.softicar.platform.db.structure.key.IDbKeyStructure;
import com.softicar.sqml.generator.table.clazz.printer.SqmlTableClassPrinter;
import java.util.List;
import java.util.stream.Collectors;

public class SqmlTableClassKeyDeclarationPrinter {

	private final SqmlTableClassPrinter classPrinter;
	private final IDbKeyStructure keyStructure;

	public SqmlTableClassKeyDeclarationPrinter(SqmlTableClassPrinter classPrinter, IDbKeyStructure keyStructure) {

		this.classPrinter = classPrinter;
		this.keyStructure = keyStructure;
	}

	public void print() {

		classPrinter.addImport(IDbKey.class);
		classPrinter
			.println(
				"public static final %s<%s> %s_%s = %s.%s(\"%s\", %s);", //
				IDbKey.class.getSimpleName(),
				classPrinter.getSimpleClassName(),
				getKeyStaticFinalNamePrefix(),
				getKeyStaticFinalName(),
				classPrinter.getTableBuilderConstant(),
				getAddKeyMethodName(),
				keyStructure.getNameOrThrow(),
				keyStructure//
					.getColumns()
					.stream()
					.map(this::getColumnStaticFinalName)
					.collect(Collectors.joining(", ")));
	}

	private String getKeyStaticFinalNamePrefix() {

		return keyStructure.getType() == DbKeyType.UNIQUE? "UK" : "IK";
	}

	private String getKeyStaticFinalName() {

		List<WordFragment> nameFragments = WordFragment.parse(keyStructure.getNameOrThrow());
		return IdentifierNames.Type.UPPER_WITH_UNDER_SCORE.get(nameFragments);
	}

	private String getAddKeyMethodName() {

		return keyStructure.getType() == DbKeyType.UNIQUE? "addUniqueKey" : "addIndexKey";
	}

	private String getColumnStaticFinalName(IDbColumnStructure columnStructure) {

		return classPrinter//
			.getFieldPrinter(columnStructure)
			.getNameDeterminer()
			.getStaticFinalName();
	}
}
