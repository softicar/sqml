package com.softicar.sqml.model.conditions;

import com.softicar.sqml.model.ISqmlGeneratable;
import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.expressions.ISqmlBinaryOperation;
import com.softicar.sqml.model.generation.ISqmlSelectGenerator;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.utils.SqmlFunctionCallArguments;
import java.util.List;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

public interface ISqmlComparison extends ISqmlBinaryOperation, ISqmlCondition, ISqmlGeneratable {

	@Override
	default ISqmlType getSqmlType() {

		return ISqmlCondition.super.getSqmlType();
	}

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default void generateSql(ISqmlSelectGenerator generator) {

		generator.getBuilder().pushCallArguments(new SqmlFunctionCallArguments(this));
		generator.visit(getFunction());
		generator.getBuilder().popCallArguments();
	}

	@Override
	default String getOperatorSymbol() {

		List<INode> nodes = NodeModelUtils.findNodesForFeature(this, ConditionsPackage.eINSTANCE.getSqmlComparison_Function());
		return nodes.size() == 1? NodeModelUtils.getTokenText(nodes.get(0)) : null;
	}
}
