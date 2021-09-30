/**
 */
package com.softicar.sqml.model.tables.impl;

import com.softicar.sqml.model.tables.ISqmlDefaultValue;
import com.softicar.sqml.model.tables.SqmlForeignKeyAction;
import com.softicar.sqml.model.tables.SqmlTable;
import com.softicar.sqml.model.tables.SqmlTableColumn;
import com.softicar.sqml.model.tables.TablesPackage;

import com.softicar.sqml.model.types.ISqmlTypeReference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sqml Table Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableColumnImpl#getTable <em>Table</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableColumnImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableColumnImpl#getPhysicalNameOverride <em>Physical Name Override</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableColumnImpl#getTypeReference <em>Type Reference</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableColumnImpl#isPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableColumnImpl#isSerial <em>Serial</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableColumnImpl#isBaseColumn <em>Base Column</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableColumnImpl#isNullable <em>Nullable</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableColumnImpl#isUnsigned <em>Unsigned</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableColumnImpl#getOnDeleteAction <em>On Delete Action</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableColumnImpl#getOnUpdateAction <em>On Update Action</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableColumnImpl#isDefaultNull <em>Default Null</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableColumnImpl#isDefaultNow <em>Default Now</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableColumnImpl#isOnUpdateNow <em>On Update Now</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableColumnImpl#isTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableColumnImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableColumnImpl#getBits <em>Bits</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableColumnImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableColumnImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableColumnImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableColumnImpl#getLengthBits <em>Length Bits</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableColumnImpl#getCharacterSet <em>Character Set</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableColumnImpl#getCollation <em>Collation</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableColumnImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableColumnImpl#getConstraintName <em>Constraint Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqmlTableColumnImpl extends MinimalEObjectImpl.Container implements SqmlTableColumn {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhysicalNameOverride() <em>Physical Name Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalNameOverride()
	 * @generated
	 * @ordered
	 */
	protected static final String PHYSICAL_NAME_OVERRIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhysicalNameOverride() <em>Physical Name Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalNameOverride()
	 * @generated
	 * @ordered
	 */
	protected String physicalNameOverride = PHYSICAL_NAME_OVERRIDE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypeReference() <em>Type Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeReference()
	 * @generated
	 * @ordered
	 */
	protected ISqmlTypeReference typeReference;

	/**
	 * The default value of the '{@link #isPrimaryKey() <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIMARY_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrimaryKey() <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected boolean primaryKey = PRIMARY_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #isSerial() <em>Serial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSerial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SERIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSerial() <em>Serial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSerial()
	 * @generated
	 * @ordered
	 */
	protected boolean serial = SERIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isBaseColumn() <em>Base Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBaseColumn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BASE_COLUMN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBaseColumn() <em>Base Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBaseColumn()
	 * @generated
	 * @ordered
	 */
	protected boolean baseColumn = BASE_COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NULLABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullable()
	 * @generated
	 * @ordered
	 */
	protected boolean nullable = NULLABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnsigned() <em>Unsigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnsigned()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNSIGNED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnsigned() <em>Unsigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnsigned()
	 * @generated
	 * @ordered
	 */
	protected boolean unsigned = UNSIGNED_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnDeleteAction() <em>On Delete Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDeleteAction()
	 * @generated
	 * @ordered
	 */
	protected static final SqmlForeignKeyAction ON_DELETE_ACTION_EDEFAULT = SqmlForeignKeyAction.UNDEFINED;

	/**
	 * The cached value of the '{@link #getOnDeleteAction() <em>On Delete Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDeleteAction()
	 * @generated
	 * @ordered
	 */
	protected SqmlForeignKeyAction onDeleteAction = ON_DELETE_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnUpdateAction() <em>On Update Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnUpdateAction()
	 * @generated
	 * @ordered
	 */
	protected static final SqmlForeignKeyAction ON_UPDATE_ACTION_EDEFAULT = SqmlForeignKeyAction.UNDEFINED;

	/**
	 * The cached value of the '{@link #getOnUpdateAction() <em>On Update Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnUpdateAction()
	 * @generated
	 * @ordered
	 */
	protected SqmlForeignKeyAction onUpdateAction = ON_UPDATE_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isDefaultNull() <em>Default Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultNull()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_NULL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefaultNull() <em>Default Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultNull()
	 * @generated
	 * @ordered
	 */
	protected boolean defaultNull = DEFAULT_NULL_EDEFAULT;

	/**
	 * The default value of the '{@link #isDefaultNow() <em>Default Now</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultNow()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_NOW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefaultNow() <em>Default Now</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultNow()
	 * @generated
	 * @ordered
	 */
	protected boolean defaultNow = DEFAULT_NOW_EDEFAULT;

	/**
	 * The default value of the '{@link #isOnUpdateNow() <em>On Update Now</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnUpdateNow()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ON_UPDATE_NOW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOnUpdateNow() <em>On Update Now</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnUpdateNow()
	 * @generated
	 * @ordered
	 */
	protected boolean onUpdateNow = ON_UPDATE_NOW_EDEFAULT;

	/**
	 * The default value of the '{@link #isTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TIMESTAMP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTimestamp()
	 * @generated
	 * @ordered
	 */
	protected boolean timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected ISqmlDefaultValue defaultValue;

	/**
	 * The default value of the '{@link #getBits() <em>Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBits() <em>Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBits()
	 * @generated
	 * @ordered
	 */
	protected Integer bits = BITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRECISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected Integer precision = PRECISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected Integer scale = SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected Integer maxLength = MAX_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLengthBits() <em>Length Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthBits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LENGTH_BITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLengthBits() <em>Length Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthBits()
	 * @generated
	 * @ordered
	 */
	protected Integer lengthBits = LENGTH_BITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharacterSet() <em>Character Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterSet()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARACTER_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharacterSet() <em>Character Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterSet()
	 * @generated
	 * @ordered
	 */
	protected String characterSet = CHARACTER_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getCollation() <em>Collation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollation()
	 * @generated
	 * @ordered
	 */
	protected static final String COLLATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCollation() <em>Collation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollation()
	 * @generated
	 * @ordered
	 */
	protected String collation = COLLATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstraintName() <em>Constraint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraintName() <em>Constraint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintName()
	 * @generated
	 * @ordered
	 */
	protected String constraintName = CONSTRAINT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqmlTableColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablesPackage.Literals.SQML_TABLE_COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlTable getTable() {
		if (eContainerFeatureID() != TablesPackage.SQML_TABLE_COLUMN__TABLE) return null;
		return (SqmlTable)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlTable basicGetTable() {
		if (eContainerFeatureID() != TablesPackage.SQML_TABLE_COLUMN__TABLE) return null;
		return (SqmlTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTable(SqmlTable newTable, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTable, TablesPackage.SQML_TABLE_COLUMN__TABLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(SqmlTable newTable) {
		if (newTable != eInternalContainer() || (eContainerFeatureID() != TablesPackage.SQML_TABLE_COLUMN__TABLE && newTable != null)) {
			if (EcoreUtil.isAncestor(this, newTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTable != null)
				msgs = ((InternalEObject)newTable).eInverseAdd(this, TablesPackage.SQML_TABLE__COLUMNS, SqmlTable.class, msgs);
			msgs = basicSetTable(newTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_COLUMN__TABLE, newTable, newTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_COLUMN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhysicalNameOverride() {
		return physicalNameOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalNameOverride(String newPhysicalNameOverride) {
		String oldPhysicalNameOverride = physicalNameOverride;
		physicalNameOverride = newPhysicalNameOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_COLUMN__PHYSICAL_NAME_OVERRIDE, oldPhysicalNameOverride, physicalNameOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISqmlTypeReference getTypeReference() {
		return typeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeReference(ISqmlTypeReference newTypeReference, NotificationChain msgs) {
		ISqmlTypeReference oldTypeReference = typeReference;
		typeReference = newTypeReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_COLUMN__TYPE_REFERENCE, oldTypeReference, newTypeReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeReference(ISqmlTypeReference newTypeReference) {
		if (newTypeReference != typeReference) {
			NotificationChain msgs = null;
			if (typeReference != null)
				msgs = ((InternalEObject)typeReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablesPackage.SQML_TABLE_COLUMN__TYPE_REFERENCE, null, msgs);
			if (newTypeReference != null)
				msgs = ((InternalEObject)newTypeReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablesPackage.SQML_TABLE_COLUMN__TYPE_REFERENCE, null, msgs);
			msgs = basicSetTypeReference(newTypeReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_COLUMN__TYPE_REFERENCE, newTypeReference, newTypeReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrimaryKey() {
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryKey(boolean newPrimaryKey) {
		boolean oldPrimaryKey = primaryKey;
		primaryKey = newPrimaryKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_COLUMN__PRIMARY_KEY, oldPrimaryKey, primaryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSerial() {
		return serial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSerial(boolean newSerial) {
		boolean oldSerial = serial;
		serial = newSerial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_COLUMN__SERIAL, oldSerial, serial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBaseColumn() {
		return baseColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseColumn(boolean newBaseColumn) {
		boolean oldBaseColumn = baseColumn;
		baseColumn = newBaseColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_COLUMN__BASE_COLUMN, oldBaseColumn, baseColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNullable() {
		return nullable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullable(boolean newNullable) {
		boolean oldNullable = nullable;
		nullable = newNullable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_COLUMN__NULLABLE, oldNullable, nullable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnsigned() {
		return unsigned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnsigned(boolean newUnsigned) {
		boolean oldUnsigned = unsigned;
		unsigned = newUnsigned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_COLUMN__UNSIGNED, oldUnsigned, unsigned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlForeignKeyAction getOnDeleteAction() {
		return onDeleteAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnDeleteAction(SqmlForeignKeyAction newOnDeleteAction) {
		SqmlForeignKeyAction oldOnDeleteAction = onDeleteAction;
		onDeleteAction = newOnDeleteAction == null ? ON_DELETE_ACTION_EDEFAULT : newOnDeleteAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_COLUMN__ON_DELETE_ACTION, oldOnDeleteAction, onDeleteAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlForeignKeyAction getOnUpdateAction() {
		return onUpdateAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnUpdateAction(SqmlForeignKeyAction newOnUpdateAction) {
		SqmlForeignKeyAction oldOnUpdateAction = onUpdateAction;
		onUpdateAction = newOnUpdateAction == null ? ON_UPDATE_ACTION_EDEFAULT : newOnUpdateAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_COLUMN__ON_UPDATE_ACTION, oldOnUpdateAction, onUpdateAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefaultNull() {
		return defaultNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultNull(boolean newDefaultNull) {
		boolean oldDefaultNull = defaultNull;
		defaultNull = newDefaultNull;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_COLUMN__DEFAULT_NULL, oldDefaultNull, defaultNull));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefaultNow() {
		return defaultNow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultNow(boolean newDefaultNow) {
		boolean oldDefaultNow = defaultNow;
		defaultNow = newDefaultNow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_COLUMN__DEFAULT_NOW, oldDefaultNow, defaultNow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOnUpdateNow() {
		return onUpdateNow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnUpdateNow(boolean newOnUpdateNow) {
		boolean oldOnUpdateNow = onUpdateNow;
		onUpdateNow = newOnUpdateNow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_COLUMN__ON_UPDATE_NOW, oldOnUpdateNow, onUpdateNow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(boolean newTimestamp) {
		boolean oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_COLUMN__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISqmlDefaultValue getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue(ISqmlDefaultValue newDefaultValue, NotificationChain msgs) {
		ISqmlDefaultValue oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_COLUMN__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(ISqmlDefaultValue newDefaultValue) {
		if (newDefaultValue != defaultValue) {
			NotificationChain msgs = null;
			if (defaultValue != null)
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablesPackage.SQML_TABLE_COLUMN__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablesPackage.SQML_TABLE_COLUMN__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_COLUMN__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getBits() {
		return bits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBits(Integer newBits) {
		Integer oldBits = bits;
		bits = newBits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_COLUMN__BITS, oldBits, bits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(Integer newPrecision) {
		Integer oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_COLUMN__PRECISION, oldPrecision, precision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(Integer newScale) {
		Integer oldScale = scale;
		scale = newScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_COLUMN__SCALE, oldScale, scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLength(Integer newMaxLength) {
		Integer oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_COLUMN__MAX_LENGTH, oldMaxLength, maxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLengthBits() {
		return lengthBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLengthBits(Integer newLengthBits) {
		Integer oldLengthBits = lengthBits;
		lengthBits = newLengthBits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_COLUMN__LENGTH_BITS, oldLengthBits, lengthBits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCharacterSet() {
		return characterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacterSet(String newCharacterSet) {
		String oldCharacterSet = characterSet;
		characterSet = newCharacterSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_COLUMN__CHARACTER_SET, oldCharacterSet, characterSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCollation() {
		return collation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollation(String newCollation) {
		String oldCollation = collation;
		collation = newCollation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_COLUMN__COLLATION, oldCollation, collation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_COLUMN__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraintName() {
		return constraintName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintName(String newConstraintName) {
		String oldConstraintName = constraintName;
		constraintName = newConstraintName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_COLUMN__CONSTRAINT_NAME, oldConstraintName, constraintName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablesPackage.SQML_TABLE_COLUMN__TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTable((SqmlTable)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablesPackage.SQML_TABLE_COLUMN__TABLE:
				return basicSetTable(null, msgs);
			case TablesPackage.SQML_TABLE_COLUMN__TYPE_REFERENCE:
				return basicSetTypeReference(null, msgs);
			case TablesPackage.SQML_TABLE_COLUMN__DEFAULT_VALUE:
				return basicSetDefaultValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TablesPackage.SQML_TABLE_COLUMN__TABLE:
				return eInternalContainer().eInverseRemove(this, TablesPackage.SQML_TABLE__COLUMNS, SqmlTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TablesPackage.SQML_TABLE_COLUMN__TABLE:
				if (resolve) return getTable();
				return basicGetTable();
			case TablesPackage.SQML_TABLE_COLUMN__NAME:
				return getName();
			case TablesPackage.SQML_TABLE_COLUMN__PHYSICAL_NAME_OVERRIDE:
				return getPhysicalNameOverride();
			case TablesPackage.SQML_TABLE_COLUMN__TYPE_REFERENCE:
				return getTypeReference();
			case TablesPackage.SQML_TABLE_COLUMN__PRIMARY_KEY:
				return isPrimaryKey();
			case TablesPackage.SQML_TABLE_COLUMN__SERIAL:
				return isSerial();
			case TablesPackage.SQML_TABLE_COLUMN__BASE_COLUMN:
				return isBaseColumn();
			case TablesPackage.SQML_TABLE_COLUMN__NULLABLE:
				return isNullable();
			case TablesPackage.SQML_TABLE_COLUMN__UNSIGNED:
				return isUnsigned();
			case TablesPackage.SQML_TABLE_COLUMN__ON_DELETE_ACTION:
				return getOnDeleteAction();
			case TablesPackage.SQML_TABLE_COLUMN__ON_UPDATE_ACTION:
				return getOnUpdateAction();
			case TablesPackage.SQML_TABLE_COLUMN__DEFAULT_NULL:
				return isDefaultNull();
			case TablesPackage.SQML_TABLE_COLUMN__DEFAULT_NOW:
				return isDefaultNow();
			case TablesPackage.SQML_TABLE_COLUMN__ON_UPDATE_NOW:
				return isOnUpdateNow();
			case TablesPackage.SQML_TABLE_COLUMN__TIMESTAMP:
				return isTimestamp();
			case TablesPackage.SQML_TABLE_COLUMN__DEFAULT_VALUE:
				return getDefaultValue();
			case TablesPackage.SQML_TABLE_COLUMN__BITS:
				return getBits();
			case TablesPackage.SQML_TABLE_COLUMN__PRECISION:
				return getPrecision();
			case TablesPackage.SQML_TABLE_COLUMN__SCALE:
				return getScale();
			case TablesPackage.SQML_TABLE_COLUMN__MAX_LENGTH:
				return getMaxLength();
			case TablesPackage.SQML_TABLE_COLUMN__LENGTH_BITS:
				return getLengthBits();
			case TablesPackage.SQML_TABLE_COLUMN__CHARACTER_SET:
				return getCharacterSet();
			case TablesPackage.SQML_TABLE_COLUMN__COLLATION:
				return getCollation();
			case TablesPackage.SQML_TABLE_COLUMN__COMMENT:
				return getComment();
			case TablesPackage.SQML_TABLE_COLUMN__CONSTRAINT_NAME:
				return getConstraintName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TablesPackage.SQML_TABLE_COLUMN__TABLE:
				setTable((SqmlTable)newValue);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__NAME:
				setName((String)newValue);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__PHYSICAL_NAME_OVERRIDE:
				setPhysicalNameOverride((String)newValue);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__TYPE_REFERENCE:
				setTypeReference((ISqmlTypeReference)newValue);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__PRIMARY_KEY:
				setPrimaryKey((Boolean)newValue);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__SERIAL:
				setSerial((Boolean)newValue);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__BASE_COLUMN:
				setBaseColumn((Boolean)newValue);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__NULLABLE:
				setNullable((Boolean)newValue);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__UNSIGNED:
				setUnsigned((Boolean)newValue);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__ON_DELETE_ACTION:
				setOnDeleteAction((SqmlForeignKeyAction)newValue);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__ON_UPDATE_ACTION:
				setOnUpdateAction((SqmlForeignKeyAction)newValue);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__DEFAULT_NULL:
				setDefaultNull((Boolean)newValue);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__DEFAULT_NOW:
				setDefaultNow((Boolean)newValue);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__ON_UPDATE_NOW:
				setOnUpdateNow((Boolean)newValue);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__TIMESTAMP:
				setTimestamp((Boolean)newValue);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__DEFAULT_VALUE:
				setDefaultValue((ISqmlDefaultValue)newValue);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__BITS:
				setBits((Integer)newValue);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__PRECISION:
				setPrecision((Integer)newValue);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__SCALE:
				setScale((Integer)newValue);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__MAX_LENGTH:
				setMaxLength((Integer)newValue);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__LENGTH_BITS:
				setLengthBits((Integer)newValue);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__CHARACTER_SET:
				setCharacterSet((String)newValue);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__COLLATION:
				setCollation((String)newValue);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__COMMENT:
				setComment((String)newValue);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__CONSTRAINT_NAME:
				setConstraintName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TablesPackage.SQML_TABLE_COLUMN__TABLE:
				setTable((SqmlTable)null);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__PHYSICAL_NAME_OVERRIDE:
				setPhysicalNameOverride(PHYSICAL_NAME_OVERRIDE_EDEFAULT);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__TYPE_REFERENCE:
				setTypeReference((ISqmlTypeReference)null);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__PRIMARY_KEY:
				setPrimaryKey(PRIMARY_KEY_EDEFAULT);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__SERIAL:
				setSerial(SERIAL_EDEFAULT);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__BASE_COLUMN:
				setBaseColumn(BASE_COLUMN_EDEFAULT);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__NULLABLE:
				setNullable(NULLABLE_EDEFAULT);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__UNSIGNED:
				setUnsigned(UNSIGNED_EDEFAULT);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__ON_DELETE_ACTION:
				setOnDeleteAction(ON_DELETE_ACTION_EDEFAULT);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__ON_UPDATE_ACTION:
				setOnUpdateAction(ON_UPDATE_ACTION_EDEFAULT);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__DEFAULT_NULL:
				setDefaultNull(DEFAULT_NULL_EDEFAULT);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__DEFAULT_NOW:
				setDefaultNow(DEFAULT_NOW_EDEFAULT);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__ON_UPDATE_NOW:
				setOnUpdateNow(ON_UPDATE_NOW_EDEFAULT);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__DEFAULT_VALUE:
				setDefaultValue((ISqmlDefaultValue)null);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__BITS:
				setBits(BITS_EDEFAULT);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__SCALE:
				setScale(SCALE_EDEFAULT);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__MAX_LENGTH:
				setMaxLength(MAX_LENGTH_EDEFAULT);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__LENGTH_BITS:
				setLengthBits(LENGTH_BITS_EDEFAULT);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__CHARACTER_SET:
				setCharacterSet(CHARACTER_SET_EDEFAULT);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__COLLATION:
				setCollation(COLLATION_EDEFAULT);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case TablesPackage.SQML_TABLE_COLUMN__CONSTRAINT_NAME:
				setConstraintName(CONSTRAINT_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TablesPackage.SQML_TABLE_COLUMN__TABLE:
				return basicGetTable() != null;
			case TablesPackage.SQML_TABLE_COLUMN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TablesPackage.SQML_TABLE_COLUMN__PHYSICAL_NAME_OVERRIDE:
				return PHYSICAL_NAME_OVERRIDE_EDEFAULT == null ? physicalNameOverride != null : !PHYSICAL_NAME_OVERRIDE_EDEFAULT.equals(physicalNameOverride);
			case TablesPackage.SQML_TABLE_COLUMN__TYPE_REFERENCE:
				return typeReference != null;
			case TablesPackage.SQML_TABLE_COLUMN__PRIMARY_KEY:
				return primaryKey != PRIMARY_KEY_EDEFAULT;
			case TablesPackage.SQML_TABLE_COLUMN__SERIAL:
				return serial != SERIAL_EDEFAULT;
			case TablesPackage.SQML_TABLE_COLUMN__BASE_COLUMN:
				return baseColumn != BASE_COLUMN_EDEFAULT;
			case TablesPackage.SQML_TABLE_COLUMN__NULLABLE:
				return nullable != NULLABLE_EDEFAULT;
			case TablesPackage.SQML_TABLE_COLUMN__UNSIGNED:
				return unsigned != UNSIGNED_EDEFAULT;
			case TablesPackage.SQML_TABLE_COLUMN__ON_DELETE_ACTION:
				return onDeleteAction != ON_DELETE_ACTION_EDEFAULT;
			case TablesPackage.SQML_TABLE_COLUMN__ON_UPDATE_ACTION:
				return onUpdateAction != ON_UPDATE_ACTION_EDEFAULT;
			case TablesPackage.SQML_TABLE_COLUMN__DEFAULT_NULL:
				return defaultNull != DEFAULT_NULL_EDEFAULT;
			case TablesPackage.SQML_TABLE_COLUMN__DEFAULT_NOW:
				return defaultNow != DEFAULT_NOW_EDEFAULT;
			case TablesPackage.SQML_TABLE_COLUMN__ON_UPDATE_NOW:
				return onUpdateNow != ON_UPDATE_NOW_EDEFAULT;
			case TablesPackage.SQML_TABLE_COLUMN__TIMESTAMP:
				return timestamp != TIMESTAMP_EDEFAULT;
			case TablesPackage.SQML_TABLE_COLUMN__DEFAULT_VALUE:
				return defaultValue != null;
			case TablesPackage.SQML_TABLE_COLUMN__BITS:
				return BITS_EDEFAULT == null ? bits != null : !BITS_EDEFAULT.equals(bits);
			case TablesPackage.SQML_TABLE_COLUMN__PRECISION:
				return PRECISION_EDEFAULT == null ? precision != null : !PRECISION_EDEFAULT.equals(precision);
			case TablesPackage.SQML_TABLE_COLUMN__SCALE:
				return SCALE_EDEFAULT == null ? scale != null : !SCALE_EDEFAULT.equals(scale);
			case TablesPackage.SQML_TABLE_COLUMN__MAX_LENGTH:
				return MAX_LENGTH_EDEFAULT == null ? maxLength != null : !MAX_LENGTH_EDEFAULT.equals(maxLength);
			case TablesPackage.SQML_TABLE_COLUMN__LENGTH_BITS:
				return LENGTH_BITS_EDEFAULT == null ? lengthBits != null : !LENGTH_BITS_EDEFAULT.equals(lengthBits);
			case TablesPackage.SQML_TABLE_COLUMN__CHARACTER_SET:
				return CHARACTER_SET_EDEFAULT == null ? characterSet != null : !CHARACTER_SET_EDEFAULT.equals(characterSet);
			case TablesPackage.SQML_TABLE_COLUMN__COLLATION:
				return COLLATION_EDEFAULT == null ? collation != null : !COLLATION_EDEFAULT.equals(collation);
			case TablesPackage.SQML_TABLE_COLUMN__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case TablesPackage.SQML_TABLE_COLUMN__CONSTRAINT_NAME:
				return CONSTRAINT_NAME_EDEFAULT == null ? constraintName != null : !CONSTRAINT_NAME_EDEFAULT.equals(constraintName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", physicalNameOverride: ");
		result.append(physicalNameOverride);
		result.append(", primaryKey: ");
		result.append(primaryKey);
		result.append(", serial: ");
		result.append(serial);
		result.append(", baseColumn: ");
		result.append(baseColumn);
		result.append(", nullable: ");
		result.append(nullable);
		result.append(", unsigned: ");
		result.append(unsigned);
		result.append(", onDeleteAction: ");
		result.append(onDeleteAction);
		result.append(", onUpdateAction: ");
		result.append(onUpdateAction);
		result.append(", defaultNull: ");
		result.append(defaultNull);
		result.append(", defaultNow: ");
		result.append(defaultNow);
		result.append(", onUpdateNow: ");
		result.append(onUpdateNow);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", bits: ");
		result.append(bits);
		result.append(", precision: ");
		result.append(precision);
		result.append(", scale: ");
		result.append(scale);
		result.append(", maxLength: ");
		result.append(maxLength);
		result.append(", lengthBits: ");
		result.append(lengthBits);
		result.append(", characterSet: ");
		result.append(characterSet);
		result.append(", collation: ");
		result.append(collation);
		result.append(", comment: ");
		result.append(comment);
		result.append(", constraintName: ");
		result.append(constraintName);
		result.append(')');
		return result.toString();
	}

} //SqmlTableColumnImpl
