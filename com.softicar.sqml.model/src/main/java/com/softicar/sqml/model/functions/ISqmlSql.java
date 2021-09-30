package com.softicar.sqml.model.functions;

import com.softicar.sqml.model.ISqmlModelElement;
import java.util.List;
import org.eclipse.emf.ecore.EObject;

public interface ISqmlSql extends EObject {

	List<? extends ISqmlModelElement> getTokens();
}
