/*
 * generated by Xtext
 */
package com.softicar.sqml.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractSqmlValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("com.softicar.sqml.model.files"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("com.softicar.sqml.model.types"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("com.softicar.sqml.model.tables"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("com.softicar.sqml.model.interfaces"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("com.softicar.sqml.model.queries"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("com.softicar.sqml.model.functions"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("com.softicar.sqml.model.selects"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("com.softicar.sqml.model.conditions"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("com.softicar.sqml.model.expressions"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("com.softicar.sqml.model.literals"));
		return result;
	}
}