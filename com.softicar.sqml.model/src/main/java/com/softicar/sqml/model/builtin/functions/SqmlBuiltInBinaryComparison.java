package com.softicar.sqml.model.builtin.functions;

import com.softicar.platform.db.sql.token.SqlSymbol;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.types.ISqmlTypeDefinition;

public class SqmlBuiltInBinaryComparison extends AbstractBuiltInComparison {

	private final ISqmlTypeDefinition type;

	public SqmlBuiltInBinaryComparison(SqlSymbol operator, ISqmlTypeDefinition type) {

		super(operator, type, type);

		this.type = type;
	}

	@Override
	protected int getArgumentConversionCount(ISqmlType leftType, ISqmlType rightType) {

		if (leftType.is(type) && rightType.is(type)) {
			return 0;
		} else {
			return Integer.MAX_VALUE;
		}
	}
}
