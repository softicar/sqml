package com.softicar.sqml.generator.table.clazz.field.utils;

import com.softicar.platform.common.code.java.IdentifierNames;
import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.sqml.generator.table.clazz.field.definition.ISqmlTableClassFieldDefinition;
import com.softicar.sqml.generator.table.clazz.printer.ISqmlTableClassPrinterConfig;

public class SqmlTableClassFieldNameDeterminer {

	private final ISqmlTableClassPrinterConfig config;
	private final ISqmlTableClassFieldDefinition fieldDefinition;

	public SqmlTableClassFieldNameDeterminer(ISqmlTableClassPrinterConfig config, ISqmlTableClassFieldDefinition fieldDefinition) {

		this.config = config;
		this.fieldDefinition = fieldDefinition;
	}

	public String getGetFunctionName() {

		if (fieldDefinition.getFieldType() == SqlFieldType.BOOLEAN) {
			return "is" + getUpperCamelName();
		} else {
			return "get" + getUpperCamelName();
		}
	}

	public String getSetFunctionName() {

		return "set" + getUpperCamelName();
	}

	public String getMemberName() {

		return config.getPrefixForClassFields() + getLowerCamelName();
	}

	public String getStaticFinalName() {

		return IdentifierNames.Type.UPPER_WITH_UNDER_SCORE.get(fieldDefinition.getNameFragments());
	}

	public String getLowerCamelName() {

		return IdentifierNames.Type.LOWER_CAMEL.get(fieldDefinition.getNameFragments());
	}

	public String getUpperCamelName() {

		return IdentifierNames.Type.UPPER_CAMEL.get(fieldDefinition.getNameFragments());
	}
}
