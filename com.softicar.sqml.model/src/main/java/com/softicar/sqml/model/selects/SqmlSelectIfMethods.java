package com.softicar.sqml.model.selects;

import java.util.ArrayList;
import java.util.List;

public class SqmlSelectIfMethods {

	public static List<? extends ISqmlSelectPart> getAllElements(ISqmlSelectIf selectIf) {

		List<ISqmlSelectPart> parts = new ArrayList<>(selectIf.getParts());
		parts.addAll(selectIf.getElseIfs());
		if (selectIf.getElse() != null) {
			parts.add(selectIf.getElse());
		}
		return parts;
	}
}
