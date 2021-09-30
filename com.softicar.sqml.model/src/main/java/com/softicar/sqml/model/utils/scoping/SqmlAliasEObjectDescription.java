package com.softicar.sqml.model.utils.scoping;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;

public class SqmlAliasEObjectDescription implements IEObjectDescription {

	private final QualifiedName alias;
	private final IEObjectDescription description;

	public SqmlAliasEObjectDescription(QualifiedName qualifiedName, EObject object) {

		this(new EObjectDescription(qualifiedName, object, null));
	}

	public SqmlAliasEObjectDescription(IEObjectDescription description) {

		this(description.getQualifiedName().getLastSegment(), description);
	}

	public SqmlAliasEObjectDescription(String alias, IEObjectDescription description) {

		this.alias = QualifiedName.create(alias);
		this.description = description;
	}

	@Override
	public QualifiedName getName() {

		return alias;
	}

	@Override
	public QualifiedName getQualifiedName() {

		return description.getQualifiedName();
	}

	@Override
	public EObject getEObjectOrProxy() {

		return description.getEObjectOrProxy();
	}

	@Override
	public URI getEObjectURI() {

		return description.getEObjectURI();
	}

	@Override
	public EClass getEClass() {

		return description.getEClass();
	}

	@Override
	public String getUserData(String name) {

		return description.getUserData(name);
	}

	@Override
	public String[] getUserDataKeys() {

		return description.getUserDataKeys();
	}
}
