package com.softicar.sqml.model.utils;

import com.softicar.platform.common.string.formatting.Formatting;

public class SqmlLogicError extends SqmlException {

	private static final long serialVersionUID = 1L;

	public SqmlLogicError() {

		super("Internal error in SQML logic.");
	}

	public SqmlLogicError(String text, Object...args) {

		super(Formatting.format(text, args));
	}
}
