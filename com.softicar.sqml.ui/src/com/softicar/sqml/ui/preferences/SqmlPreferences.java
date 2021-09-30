package com.softicar.sqml.ui.preferences;

import com.softicar.sqml.ui.SqmlUiPluginUtils;
import com.softicar.sqml.ui.utils.SqmlEclipeWorkspace;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreAccess;

public class SqmlPreferences {

	// -------------------- generator -------------------- //

	public static final String GENERATOR_PREFIX = SqmlUiPluginUtils.getPluginId() + ".generator";
	public static final String GENERATE_JAVA_FOR_QUERIES = GENERATOR_PREFIX + ".generateJavaForQueries";
	public static final String GENERATE_JAVA_FOR_TABLES = GENERATOR_PREFIX + ".generateJavaForTables";
	public static final String GENERATE_SUPPRESS_ALL_WARNINGS_FOR_QUERIES = GENERATOR_PREFIX + ".generateSuppressAllWarningsForQueries";
	public static final String GENERATE_SUPPRESS_ALL_WARNINGS_FOR_TABLES = GENERATOR_PREFIX + ".generateSuppressAllWarningsForTables";
	public static final String GENERATE_GET_BY_ID_METHOD = GENERATOR_PREFIX + ".generateGetByIdMethod";
	public static final String GENERATE_GET_ID_METHODS = GENERATOR_PREFIX + ".generateGetIdMethods";
	public static final String GENERATED_QUERY_CODE_VERSION = GENERATOR_PREFIX + ".generatedQueryClassVersion";
	public static final String GENERATED_TABLE_CODE_VERSION = GENERATOR_PREFIX + ".generatedTableClassVersion";
	public static final String ANNOTATION_FOR_GENERATED_CLASSES = GENERATOR_PREFIX + ".annotationForGeneratedClasses";
	public static final String I18N_CLASS = GENERATOR_PREFIX + ".i18nClass";
	public static final String PREFIX_FOR_CLASS_FIELDS = GENERATOR_PREFIX + ".prefixForClassFields";
	public static final String PREFIX_FOR_LOAD_BY_METHODS = GENERATOR_PREFIX + ".prefixForLoadByMethods";
	public static final String TABLE_CLASS_NAME_PREFIXES = GENERATOR_PREFIX + ".tableClassNamePrefixes";
	public static final String IMPORT_OVERRIDES = GENERATOR_PREFIX + ".importOverrides";

	// -------------------- validator -------------------- //

	public static final String VALIDATOR_PREFIX = SqmlUiPluginUtils.getPluginId() + ".validator";
	public static final String MANDATORY_ID_COLUMN = VALIDATOR_PREFIX + ".mandatoryIdColumn";
	public static final String MAXIMUM_IDENTIFIER_LENGTH = VALIDATOR_PREFIX + ".maximumIdentifierLength";

	// -------------------- utilities -------------------- //

	public static IPreferenceStore getProjectPreferenceStore(Resource resource, IPreferenceStoreAccess preferenceStoreAccess) {

		IProject project = SqmlEclipeWorkspace.getWorkspaceFile(resource).getProject();
		return preferenceStoreAccess.getContextPreferenceStore(project);
	}
}
