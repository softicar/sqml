package com.softicar.sqml;

import com.google.inject.Injector;
import com.softicar.sqml.model.conditions.ConditionsPackage;
import com.softicar.sqml.model.expressions.ExpressionsPackage;
import com.softicar.sqml.model.externals.ExternalsPackage;
import com.softicar.sqml.model.files.FilesPackage;
import com.softicar.sqml.model.functions.FunctionsPackage;
import com.softicar.sqml.model.interfaces.InterfacesPackage;
import com.softicar.sqml.model.literals.LiteralsPackage;
import com.softicar.sqml.model.queries.QueriesPackage;
import com.softicar.sqml.model.selects.SelectsPackage;
import com.softicar.sqml.model.tables.TablesPackage;
import com.softicar.sqml.model.types.TypesPackage;
import org.eclipse.emf.ecore.EPackage;

/**
 * Initialization support for running Xtext languages without equinox extension
 * registry
 */
public class SqmlStandaloneSetup extends SqmlStandaloneSetupGenerated {

	public static void doSetup() {

		new SqmlStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	@Override
	public void register(Injector injector) {

		register(InterfacesPackage.eINSTANCE);
		register(FilesPackage.eINSTANCE);
		register(FunctionsPackage.eINSTANCE);
		register(ExternalsPackage.eINSTANCE);
		register(ConditionsPackage.eINSTANCE);
		register(ExpressionsPackage.eINSTANCE);
		register(LiteralsPackage.eINSTANCE);
		register(QueriesPackage.eINSTANCE);
		register(SelectsPackage.eINSTANCE);
		register(TablesPackage.eINSTANCE);
		register(TypesPackage.eINSTANCE);
		super.register(injector);
	}

	private void register(EPackage ePackage) {

		EPackage.Registry.INSTANCE.put(ePackage.getNsURI(), ePackage.getNsURI());
	}
}
