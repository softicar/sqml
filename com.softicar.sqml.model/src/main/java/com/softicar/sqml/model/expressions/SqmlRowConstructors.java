package com.softicar.sqml.model.expressions;

import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.builtin.SqmlTypeList;
import com.softicar.sqml.model.types.ISqmlType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SqmlRowConstructors {

	public static ISqmlType getSqmlType(ISqmlRowConstructor rowConstructor) {

		if (rowConstructor.getExpressions().size() == 1 && !rowConstructor.isExplicit()) {
			// a row constructor without an explicit ROW keyword
			// and only one element is just a simple parenthesized expression
			return rowConstructor.getExpressions().get(0).getSqmlType();
		} else {
			return SqmlBuiltInTypes.getTupleType().parameterize(getTypeList(rowConstructor.getExpressions()));
		}
	}

	private static SqmlTypeList getTypeList(Collection<? extends ISqmlExpression> expressions) {

		List<ISqmlType> types = new ArrayList<>();
		for (ISqmlExpression expression: expressions) {
			types.add(expression.getSqmlType());
		}
		return new SqmlTypeList(types);
	}
}
