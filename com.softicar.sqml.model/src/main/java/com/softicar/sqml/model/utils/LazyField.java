package com.softicar.sqml.model.utils;

import java.util.function.Supplier;

public class LazyField<T> {

	private final Supplier<T> supplier;
	private boolean initialized;
	private T value;

	public LazyField(Supplier<T> supplier) {

		this.supplier = supplier;
		this.initialized = false;
		this.value = null;
	}

	public T getValue() {

		if (!initialized) {
			this.value = supplier.get();
			this.initialized = true;
		}
		return this.value;
	}
}
