package com.softicar.sqml.utils;

import com.google.common.base.Predicate;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.utils.SqmlNavigation;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.IEObjectDescription;

/**
 * Filters for {@link IEObjectDescription} of {@link ISqmlTable} with the
 * physical table name.
 * <p>
 * The table name comparison is case-insensitive.
 * 
 * @author Oliver Richers
 */
public class SqmlPhysicalTableNamePredicate implements Predicate<IEObjectDescription> {

	private final Resource resource;
	private final String physicalTableName;

	public SqmlPhysicalTableNamePredicate(ISqmlTable table) {

		this.resource = SqmlNavigation.getResource(table);
		this.physicalTableName = table.getPhysicalNameOverride().toUpperCase();
	}

	@Override
	public boolean apply(IEObjectDescription objectDescription) {

		Object object = EcoreUtil.resolve(objectDescription.getEObjectOrProxy(), resource);

		if (object instanceof ISqmlTable) {
			ISqmlTable table = (ISqmlTable) object;
			String physicalTableName = table.getPhysicalNameOverride();
			if (physicalTableName != null) {
				return physicalTableName.toUpperCase().equals(this.physicalTableName);
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
