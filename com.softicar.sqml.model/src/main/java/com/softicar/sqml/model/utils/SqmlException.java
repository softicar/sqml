package com.softicar.sqml.model.utils;

import com.softicar.platform.common.string.formatting.Formatting;

public class SqmlException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public SqmlException(String text, Object...args) {

		super(Formatting.format(text, args));
	}
}
