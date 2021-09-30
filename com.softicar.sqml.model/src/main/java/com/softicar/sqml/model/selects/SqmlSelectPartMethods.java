package com.softicar.sqml.model.selects;

import java.util.ArrayList;
import java.util.List;

public class SqmlSelectPartMethods {

	public static List<ISqmlSelectClause> getAllSelectClauses(ISqmlSelectPart selectPart) {

		return getAllParts(selectPart, ISqmlSelectClause.class);
	}

	private static <T> List<T> getAllParts(ISqmlSelectPart selectPart, Class<T> partClass) {

		List<T> clauses = new ArrayList<>();

		if (partClass.isInstance(selectPart)) {
			clauses.add(partClass.cast(selectPart));
		}

		if (selectPart instanceof ISqmlSelectBlock) {
			ISqmlSelectBlock selectBlock = (ISqmlSelectBlock) selectPart;
			for (ISqmlSelectPart subPart: selectBlock.getParts()) {
				clauses.addAll(getAllParts(subPart, partClass));
			}
		}

		return clauses;
	}
}
