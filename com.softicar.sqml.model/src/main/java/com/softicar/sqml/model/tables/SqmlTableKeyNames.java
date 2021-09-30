package com.softicar.sqml.model.tables;

import com.softicar.platform.common.code.java.IdentifierNames;
import com.softicar.platform.common.code.java.WordFragment;
import java.util.List;
import java.util.stream.Collectors;

public class SqmlTableKeyNames {

	public static String getImplicitKeyName(List<String> columnNames) {

		String concatedName = columnNames.stream().collect(Collectors.joining("_"));
		return IdentifierNames.Type.LOWER_CAMEL.get(WordFragment.parse(concatedName));
	}
}
