/**
 */
package com.softicar.sqml.model.tables;

import com.softicar.sqml.model.types.ISqmlTypeReference;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Table Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableColumn#getTable <em>Table</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableColumn#getName <em>Name</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableColumn#getPhysicalNameOverride <em>Physical Name Override</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableColumn#getTypeReference <em>Type Reference</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableColumn#isPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableColumn#isSerial <em>Serial</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableColumn#isBaseColumn <em>Base Column</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableColumn#isNullable <em>Nullable</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableColumn#isUnsigned <em>Unsigned</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableColumn#getOnDeleteAction <em>On Delete Action</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableColumn#getOnUpdateAction <em>On Update Action</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableColumn#isDefaultNull <em>Default Null</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableColumn#isDefaultNow <em>Default Now</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableColumn#isOnUpdateNow <em>On Update Now</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableColumn#isTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableColumn#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableColumn#getBits <em>Bits</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableColumn#getPrecision <em>Precision</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableColumn#getScale <em>Scale</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableColumn#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableColumn#getLengthBits <em>Length Bits</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableColumn#getCharacterSet <em>Character Set</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableColumn#getCollation <em>Collation</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableColumn#getComment <em>Comment</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableColumn#getConstraintName <em>Constraint Name</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableColumn()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlTableColumn"
 * @generated
 */
public interface SqmlTableColumn extends EObject, ISqmlTableColumn {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.softicar.sqml.model.tables.SqmlTable#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' container reference.
	 * @see #setTable(SqmlTable)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableColumn_Table()
	 * @see com.softicar.sqml.model.tables.SqmlTable#getColumns
	 * @model opposite="columns" transient="false"
	 * @generated
	 */
	SqmlTable getTable();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getTable <em>Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' container reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(SqmlTable value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableColumn_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Physical Name Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Name Override</em>' attribute.
	 * @see #setPhysicalNameOverride(String)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableColumn_PhysicalNameOverride()
	 * @model unique="false"
	 * @generated
	 */
	String getPhysicalNameOverride();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getPhysicalNameOverride <em>Physical Name Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Name Override</em>' attribute.
	 * @see #getPhysicalNameOverride()
	 * @generated
	 */
	void setPhysicalNameOverride(String value);

	/**
	 * Returns the value of the '<em><b>Type Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Reference</em>' containment reference.
	 * @see #setTypeReference(ISqmlTypeReference)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableColumn_TypeReference()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlTypeReference" containment="true"
	 * @generated
	 */
	ISqmlTypeReference getTypeReference();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getTypeReference <em>Type Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Reference</em>' containment reference.
	 * @see #getTypeReference()
	 * @generated
	 */
	void setTypeReference(ISqmlTypeReference value);

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' attribute.
	 * @see #setPrimaryKey(boolean)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableColumn_PrimaryKey()
	 * @model unique="false"
	 * @generated
	 */
	boolean isPrimaryKey();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTableColumn#isPrimaryKey <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key</em>' attribute.
	 * @see #isPrimaryKey()
	 * @generated
	 */
	void setPrimaryKey(boolean value);

	/**
	 * Returns the value of the '<em><b>Serial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial</em>' attribute.
	 * @see #setSerial(boolean)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableColumn_Serial()
	 * @model unique="false"
	 * @generated
	 */
	boolean isSerial();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTableColumn#isSerial <em>Serial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial</em>' attribute.
	 * @see #isSerial()
	 * @generated
	 */
	void setSerial(boolean value);

	/**
	 * Returns the value of the '<em><b>Base Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Column</em>' attribute.
	 * @see #setBaseColumn(boolean)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableColumn_BaseColumn()
	 * @model unique="false"
	 * @generated
	 */
	boolean isBaseColumn();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTableColumn#isBaseColumn <em>Base Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Column</em>' attribute.
	 * @see #isBaseColumn()
	 * @generated
	 */
	void setBaseColumn(boolean value);

	/**
	 * Returns the value of the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullable</em>' attribute.
	 * @see #setNullable(boolean)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableColumn_Nullable()
	 * @model unique="false"
	 * @generated
	 */
	boolean isNullable();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTableColumn#isNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable</em>' attribute.
	 * @see #isNullable()
	 * @generated
	 */
	void setNullable(boolean value);

	/**
	 * Returns the value of the '<em><b>Unsigned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsigned</em>' attribute.
	 * @see #setUnsigned(boolean)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableColumn_Unsigned()
	 * @model unique="false"
	 * @generated
	 */
	boolean isUnsigned();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTableColumn#isUnsigned <em>Unsigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsigned</em>' attribute.
	 * @see #isUnsigned()
	 * @generated
	 */
	void setUnsigned(boolean value);

	/**
	 * Returns the value of the '<em><b>On Delete Action</b></em>' attribute.
	 * The literals are from the enumeration {@link com.softicar.sqml.model.tables.SqmlForeignKeyAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Delete Action</em>' attribute.
	 * @see com.softicar.sqml.model.tables.SqmlForeignKeyAction
	 * @see #setOnDeleteAction(SqmlForeignKeyAction)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableColumn_OnDeleteAction()
	 * @model unique="false"
	 * @generated
	 */
	SqmlForeignKeyAction getOnDeleteAction();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getOnDeleteAction <em>On Delete Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Delete Action</em>' attribute.
	 * @see com.softicar.sqml.model.tables.SqmlForeignKeyAction
	 * @see #getOnDeleteAction()
	 * @generated
	 */
	void setOnDeleteAction(SqmlForeignKeyAction value);

	/**
	 * Returns the value of the '<em><b>On Update Action</b></em>' attribute.
	 * The literals are from the enumeration {@link com.softicar.sqml.model.tables.SqmlForeignKeyAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Update Action</em>' attribute.
	 * @see com.softicar.sqml.model.tables.SqmlForeignKeyAction
	 * @see #setOnUpdateAction(SqmlForeignKeyAction)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableColumn_OnUpdateAction()
	 * @model unique="false"
	 * @generated
	 */
	SqmlForeignKeyAction getOnUpdateAction();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getOnUpdateAction <em>On Update Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Update Action</em>' attribute.
	 * @see com.softicar.sqml.model.tables.SqmlForeignKeyAction
	 * @see #getOnUpdateAction()
	 * @generated
	 */
	void setOnUpdateAction(SqmlForeignKeyAction value);

	/**
	 * Returns the value of the '<em><b>Default Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Null</em>' attribute.
	 * @see #setDefaultNull(boolean)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableColumn_DefaultNull()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDefaultNull();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTableColumn#isDefaultNull <em>Default Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Null</em>' attribute.
	 * @see #isDefaultNull()
	 * @generated
	 */
	void setDefaultNull(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Now</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Now</em>' attribute.
	 * @see #setDefaultNow(boolean)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableColumn_DefaultNow()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDefaultNow();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTableColumn#isDefaultNow <em>Default Now</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Now</em>' attribute.
	 * @see #isDefaultNow()
	 * @generated
	 */
	void setDefaultNow(boolean value);

	/**
	 * Returns the value of the '<em><b>On Update Now</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Update Now</em>' attribute.
	 * @see #setOnUpdateNow(boolean)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableColumn_OnUpdateNow()
	 * @model unique="false"
	 * @generated
	 */
	boolean isOnUpdateNow();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTableColumn#isOnUpdateNow <em>On Update Now</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Update Now</em>' attribute.
	 * @see #isOnUpdateNow()
	 * @generated
	 */
	void setOnUpdateNow(boolean value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(boolean)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableColumn_Timestamp()
	 * @model unique="false"
	 * @generated
	 */
	boolean isTimestamp();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTableColumn#isTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #isTimestamp()
	 * @generated
	 */
	void setTimestamp(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(ISqmlDefaultValue)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableColumn_DefaultValue()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlDefaultValue" containment="true"
	 * @generated
	 */
	ISqmlDefaultValue getDefaultValue();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(ISqmlDefaultValue value);

	/**
	 * Returns the value of the '<em><b>Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bits</em>' attribute.
	 * @see #setBits(Integer)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableColumn_Bits()
	 * @model unique="false"
	 * @generated
	 */
	Integer getBits();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getBits <em>Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bits</em>' attribute.
	 * @see #getBits()
	 * @generated
	 */
	void setBits(Integer value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(Integer)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableColumn_Precision()
	 * @model unique="false"
	 * @generated
	 */
	Integer getPrecision();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(Integer value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(Integer)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableColumn_Scale()
	 * @model unique="false"
	 * @generated
	 */
	Integer getScale();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(Integer)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableColumn_MaxLength()
	 * @model unique="false"
	 * @generated
	 */
	Integer getMaxLength();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(Integer value);

	/**
	 * Returns the value of the '<em><b>Length Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length Bits</em>' attribute.
	 * @see #setLengthBits(Integer)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableColumn_LengthBits()
	 * @model unique="false"
	 * @generated
	 */
	Integer getLengthBits();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getLengthBits <em>Length Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length Bits</em>' attribute.
	 * @see #getLengthBits()
	 * @generated
	 */
	void setLengthBits(Integer value);

	/**
	 * Returns the value of the '<em><b>Character Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character Set</em>' attribute.
	 * @see #setCharacterSet(String)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableColumn_CharacterSet()
	 * @model unique="false"
	 * @generated
	 */
	String getCharacterSet();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getCharacterSet <em>Character Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character Set</em>' attribute.
	 * @see #getCharacterSet()
	 * @generated
	 */
	void setCharacterSet(String value);

	/**
	 * Returns the value of the '<em><b>Collation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collation</em>' attribute.
	 * @see #setCollation(String)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableColumn_Collation()
	 * @model unique="false"
	 * @generated
	 */
	String getCollation();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getCollation <em>Collation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collation</em>' attribute.
	 * @see #getCollation()
	 * @generated
	 */
	void setCollation(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableColumn_Comment()
	 * @model unique="false"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Constraint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Name</em>' attribute.
	 * @see #setConstraintName(String)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableColumn_ConstraintName()
	 * @model unique="false"
	 * @generated
	 */
	String getConstraintName();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getConstraintName <em>Constraint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Name</em>' attribute.
	 * @see #getConstraintName()
	 * @generated
	 */
	void setConstraintName(String value);

} // SqmlTableColumn
