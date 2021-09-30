package com.softicar.sqml.utils;

import com.google.common.base.Predicate;

public class TruePredicate<T> implements Predicate<T> {

	@Override
	public boolean apply(T input) {

		return true;
	}
}
