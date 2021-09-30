package com.softicar.sqml.scoping;

import com.google.inject.Singleton;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.utils.SqmlQualifiedPhysicalTableName;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;

@Singleton
public class SqmlResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {

	private static final Logger LOG = Logger.getLogger(SqmlResourceDescriptionStrategy.class);

	@Override
	public boolean createEObjectDescriptions(EObject object, IAcceptor<IEObjectDescription> acceptor) {

		if (getQualifiedNameProvider() == null) {
			return false;
		}

		try {
			// regular qualified name
			QualifiedName qualifiedName = getQualifiedNameProvider().getFullyQualifiedName(object);
			if (qualifiedName != null) {
				acceptor.accept(EObjectDescription.create(qualifiedName, object));
			}

			// qualified physical table name
			if (object instanceof ISqmlTable) {
				ISqmlTable table = (ISqmlTable) object;
				String physicalName = table.getPhysicalNameOverride();
				if (physicalName != null) {
					QualifiedName qualifiedPhysicalName = SqmlQualifiedPhysicalTableName.getQualifiedName(physicalName);
					acceptor.accept(EObjectDescription.create(qualifiedPhysicalName, object));
				}
			}
		} catch (Exception exception) {
			LOG.error(exception.getMessage(), exception);
		}
		return true;
	}

//	@Override
//	public boolean createReferenceDescriptions(EObject from, URI exportedContainerURI,
//			IAcceptor<IReferenceDescription> acceptor) {
//
//		boolean descriptions = super.createReferenceDescriptions(from, exportedContainerURI, description -> {
//			acceptor.accept(description);
//			Log.finfo("adding %s -> %s", description.getSourceEObjectUri(), description.getTargetEObjectUri());
//		});
//		return descriptions;
//	}
}
