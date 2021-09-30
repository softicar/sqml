package com.softicar.sqml.model.generation;

import com.softicar.sqml.model.ISqmlModelVisitor;

public interface ISqmlSelectGenerator extends ISqmlModelVisitor {

	ISqlBuilderBuilder getBuilder();
}
