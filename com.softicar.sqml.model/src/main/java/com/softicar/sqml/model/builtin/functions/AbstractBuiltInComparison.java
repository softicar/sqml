package com.softicar.sqml.model.builtin.functions;

import com.softicar.platform.db.sql.token.SqlSymbol;
import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.types.ISqmlTypeDefinition;

public abstract class AbstractBuiltInComparison extends AbstractBuiltInBinaryOperator {

	public AbstractBuiltInComparison(SqlSymbol operator, ISqmlTypeDefinition leftType, ISqmlTypeDefinition rightType) {

		super(operator, SqmlBuiltInTypes.getBooleanType(), leftType, rightType);
	}
}
