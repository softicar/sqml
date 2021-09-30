package com.softicar.sqml.test.builtin;

import com.softicar.sqml.model.builtin.functions.SqmlBuiltInFunctions;
import com.softicar.sqml.model.functions.ISqmlFunction;
import com.softicar.sqml.model.functions.ISqmlFunctionParameter;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlBuiltInFileTest extends AbstractSqmlTest {

	@Test
	public void testFunctions() {

		for (ISqmlFunction function: SqmlBuiltInFunctions.get().getFile().getFunctions()) {
			for (ISqmlFunctionParameter parameter: function.getParameters()) {
				assertNotNull(parameter);
				assertNotNull(parameter.getSqmlType());
			}
		}
	}
}
