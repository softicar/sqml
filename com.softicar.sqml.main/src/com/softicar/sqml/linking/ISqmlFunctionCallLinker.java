package com.softicar.sqml.linking;

import com.softicar.sqml.model.functions.ISqmlFunction;
import com.softicar.sqml.model.functions.ISqmlFunctionCall;
import java.util.List;

public interface ISqmlFunctionCallLinker {

	List<ISqmlFunction> link(ISqmlFunctionCall functionCall);
}
