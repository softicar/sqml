package com.softicar.sqml.model;

import com.softicar.sqml.model.generation.ISqmlSelectGenerator;

public interface ISqmlGeneratable {

	void generateSql(ISqmlSelectGenerator generator);
}
