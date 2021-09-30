package com.softicar.sqml.model.expressions;

import com.softicar.sqml.model.ISqmlModelElement;
import java.util.List;

public interface ISqmlExpressionList extends ISqmlModelElement {

	List<? extends ISqmlExpression> getExpressions();
}
