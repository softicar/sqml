package com.softicar.sqml.generator.query;

import com.softicar.sqml.generator.common.SqmlJavaCodePrinter;
import com.softicar.sqml.generator.preferences.ISqmlGeneratorPreferences;

public interface ISqmlQueryGenerator {

	ISqmlGeneratorPreferences getPreferences();

	SqmlJavaCodePrinter getPrinter();

	String getSimpleQueryInterfaceName();

	QueryColumnsGenerator getColumnsGenerator();

	QueryParametersGenerator getParametersGenerator();
}
