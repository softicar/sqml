package com.softicar.sqml.model.expressions;

import com.softicar.sqml.model.functions.ISqmlFunctionCall;
import com.softicar.sqml.model.functions.SqmlFunctionCallMethods;
import com.softicar.sqml.model.types.ISqmlType;
import java.util.Arrays;
import java.util.List;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

public interface ISqmlBinaryOperation extends ISqmlFunctionCall {

	ISqmlExpression getLeft();

	ISqmlExpression getRight();

	default String getOperatorSymbol() {

		List<INode> nodes = NodeModelUtils.findNodesForFeature(this, ExpressionsPackage.eINSTANCE.getAbstractSqmlBinaryOperation_Function());
		return nodes.size() == 1? NodeModelUtils.getTokenText(nodes.get(0)) : null;
	}

	@Override
	default List<ISqmlExpression> getArguments() {

		return Arrays.asList(getLeft(), getRight());
	}

	@Override
	default QualifiedName getFunctionName() {

		return QualifiedName.create(getOperatorSymbol());
	}

	@Override
	default String getDisplayName() {

		return SqmlFunctionCallMethods.getDisplayName(this);
	}

	@Override
	default ISqmlType getSqmlType() {

		return getFunction().getSqmlType();
	}

	@Override
	default boolean isWellDefined() {

		return SqmlFunctionCallMethods.isWellDefined(this);
	}
}
