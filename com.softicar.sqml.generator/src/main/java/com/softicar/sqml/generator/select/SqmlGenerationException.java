package com.softicar.sqml.generator.select;

import com.softicar.sqml.model.utils.SqmlException;

public class SqmlGenerationException extends SqmlException {

	private static final long serialVersionUID = 1L;

	public SqmlGenerationException(String text, Object...args) {

		super(text, args);
	}
}
