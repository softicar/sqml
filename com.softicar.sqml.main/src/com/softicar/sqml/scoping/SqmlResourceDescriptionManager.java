package com.softicar.sqml.scoping;

import java.util.Collection;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionManager;

public class SqmlResourceDescriptionManager extends DefaultResourceDescriptionManager implements IResourceDescription.Manager.AllChangeAware {

//	private boolean log;

//	@Override
//	public Delta createDelta(IResourceDescription oldDescription, IResourceDescription newDescription) {
//
//		Delta delta = super.createDelta(oldDescription, newDescription);
//		Log.finfo(
//				"createDelta(%s, %s) --> %s (changes: %s)",
//				getUriOrNull(oldDescription),
//				getUriOrNull(newDescription),
//				System.identityHashCode(delta),
//				delta.haveEObjectDescriptionsChanged());
//		return delta;
//	}

//	@Override
//	public boolean isAffected(Collection<Delta> deltas, IResourceDescription candidate, IResourceDescriptions context) {
//
//		this.log = getUriOrNull(candidate).toString().contains("Workflow");
//		if (log) {
//			Log.finfo("isAffected(deltas, %s, context) {", getUriOrNull(candidate));
//			Log.finfo("\tdeltas {");
//			for (Delta delta: deltas) {
//				Log.finfo("\t\t%s", System.identityHashCode(delta));
//				if (delta.getOld() == null) {
//					Log.finfo("\t\tADDED " + delta.getUri());
//					Log.finfo("\t\tNEW: " + delta.getNew().getURI());
//				} else if (delta.getNew() == null) {
//					Log.finfo("\t\tDELETED " + delta.getUri());
//					Log.finfo("\t\tOLD: " + delta.getOld().getURI());
//				} else if (delta.haveEObjectDescriptionsChanged()) {
//					Log.finfo("\t\tCHANGED " + delta.getUri());
//					Log.finfo("\t\tOLD: " + delta.getOld().getExportedObjects());
//					Log.finfo("\t\tNEW: " + delta.getNew().getExportedObjects());
//				} else {
//					Log.finfo("\t\tNOP " + delta.getUri());
//					Log.finfo("\t\tOLD: " + delta.getOld().getExportedObjects());
//					Log.finfo("\t\tNEW: " + delta.getNew().getExportedObjects());
//				}
//			}
//			Log.finfo("\t}");
//		}
//		boolean affected = super.isAffected(deltas, candidate, context);
//		if (log) {
//			Log.finfo("} --> %s", affected);
//		}
//		return affected;
//	}

	@Override
	public boolean isAffectedByAny(Collection<Delta> deltas, IResourceDescription candidate, IResourceDescriptions context) {

//		this.log = getUriOrNull(candidate).toString().contains("Workflow");
//		if (log) {
//			Log.finfo("isAffectedByAny(deltas, %s, context) {", getUriOrNull(candidate));
//			Log.finfo("\tdeltas {");
//			for (Delta delta: deltas) {
//				Log.finfo("\t\t%s", System.identityHashCode(delta));
//				if (delta.getOld() == null) {
//					Log.finfo("\t\tADDED " + delta.getUri());
//					Log.finfo("\t\tNEW: " + delta.getNew().getURI());
//				} else if (delta.getNew() == null) {
//					Log.finfo("\t\tDELETED " + delta.getUri());
//					Log.finfo("\t\tOLD: " + delta.getOld().getURI());
//				} else if (delta.haveEObjectDescriptionsChanged()) {
//					Log.finfo("\t\tCHANGED " + delta.getUri());
//					Log.finfo("\t\tOLD: " + delta.getOld().getExportedObjects());
//					Log.finfo("\t\tNEW: " + delta.getNew().getExportedObjects());
//				} else {
//					Log.finfo("\t\tNOP " + delta.getUri());
//					Log.finfo("\t\tOLD: " + delta.getOld().getExportedObjects());
//					Log.finfo("\t\tNEW: " + delta.getNew().getExportedObjects());
//				}
//			}
//			Log.finfo("\t}");
//		}
		boolean affected = super.isAffected(deltas, candidate, context);
//		if (log) {
//			Log.finfo("} --> %s", affected);
//		}
		return affected;
	}

	@Override
	protected boolean hasChanges(Delta delta, IResourceDescription candidate) {

		// we are pessimistic here, assuming that any change of an SQML
		// resource can have effect on other SQML resources
		return isSqmlResource(delta) && isSqmlResource(candidate);
	}

	@Override
	protected boolean isAffected(Collection<QualifiedName> importedNames, IResourceDescription description) {

		boolean affected = isSqmlResource(description) && super.isAffected(importedNames, description);
//		if (log) {
//			Log.finfo(
//					"\tisAffected(%s, %s) --> %s",
//					importedNames,
//					description != null? getUriOrNull(description) : null,
//					affected);
//		}
		return affected;
	}

	private boolean isSqmlResource(Delta delta) {

		return isSqmlResource(delta.getOld()) || isSqmlResource(delta.getNew());
	}

	private boolean isSqmlResource(IResourceDescription description) {

		String path = getUriPathOrNull(description);
		return path != null && path.endsWith(".sqml");
	}

//	private boolean isJavaResource(IResourceDescription description) {
//
//		URI uri = getUriOrNull(description);
//		return uri != null && uri.scheme().equals("java");
//	}

	private String getUriPathOrNull(IResourceDescription description) {

		URI uri = getUriOrNull(description);
		return uri != null? uri.path() : null;
	}

	private URI getUriOrNull(IResourceDescription description) {

		return description != null? description.getURI() : null;
	}
}
