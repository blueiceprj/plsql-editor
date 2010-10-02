/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import plsql.editor.xtext.plSql.NameDeclaration;
import plsql.editor.xtext.plSql.PlSqlPackage;
import plsql.editor.xtext.plSql.VariableDeclaration;
import plsql.editor.xtext.plSql.VariableValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.impl.VariableDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.impl.VariableDeclarationImpl#isIsConstant <em>Is Constant</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.impl.VariableDeclarationImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.impl.VariableDeclarationImpl#isIsNotNull <em>Is Not Null</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.impl.VariableDeclarationImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDeclarationImpl extends ItemDeclarationImpl implements VariableDeclaration
{
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
   * The default value of the '{@link #isIsConstant() <em>Is Constant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsConstant()
   * @generated
   * @ordered
   */
  protected static final boolean IS_CONSTANT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsConstant() <em>Is Constant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsConstant()
   * @generated
   * @ordered
   */
  protected boolean isConstant = IS_CONSTANT_EDEFAULT;

  /**
   * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataType()
   * @generated
   * @ordered
   */
  protected static final String DATA_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataType()
   * @generated
   * @ordered
   */
  protected String dataType = DATA_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #isIsNotNull() <em>Is Not Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsNotNull()
   * @generated
   * @ordered
   */
  protected static final boolean IS_NOT_NULL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsNotNull() <em>Is Not Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsNotNull()
   * @generated
   * @ordered
   */
  protected boolean isNotNull = IS_NOT_NULL_EDEFAULT;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected VariableValue value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableDeclarationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PlSqlPackage.Literals.VARIABLE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.VARIABLE_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsConstant()
  {
    return isConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsConstant(boolean newIsConstant)
  {
    boolean oldIsConstant = isConstant;
    isConstant = newIsConstant;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.VARIABLE_DECLARATION__IS_CONSTANT, oldIsConstant, isConstant));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDataType()
  {
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataType(String newDataType)
  {
    String oldDataType = dataType;
    dataType = newDataType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.VARIABLE_DECLARATION__DATA_TYPE, oldDataType, dataType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsNotNull()
  {
    return isNotNull;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsNotNull(boolean newIsNotNull)
  {
    boolean oldIsNotNull = isNotNull;
    isNotNull = newIsNotNull;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.VARIABLE_DECLARATION__IS_NOT_NULL, oldIsNotNull, isNotNull));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableValue getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(VariableValue newValue, NotificationChain msgs)
  {
    VariableValue oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlSqlPackage.VARIABLE_DECLARATION__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(VariableValue newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.VARIABLE_DECLARATION__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.VARIABLE_DECLARATION__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.VARIABLE_DECLARATION__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PlSqlPackage.VARIABLE_DECLARATION__VALUE:
        return basicSetValue(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PlSqlPackage.VARIABLE_DECLARATION__NAME:
        return getName();
      case PlSqlPackage.VARIABLE_DECLARATION__IS_CONSTANT:
        return isIsConstant();
      case PlSqlPackage.VARIABLE_DECLARATION__DATA_TYPE:
        return getDataType();
      case PlSqlPackage.VARIABLE_DECLARATION__IS_NOT_NULL:
        return isIsNotNull();
      case PlSqlPackage.VARIABLE_DECLARATION__VALUE:
        return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PlSqlPackage.VARIABLE_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case PlSqlPackage.VARIABLE_DECLARATION__IS_CONSTANT:
        setIsConstant((Boolean)newValue);
        return;
      case PlSqlPackage.VARIABLE_DECLARATION__DATA_TYPE:
        setDataType((String)newValue);
        return;
      case PlSqlPackage.VARIABLE_DECLARATION__IS_NOT_NULL:
        setIsNotNull((Boolean)newValue);
        return;
      case PlSqlPackage.VARIABLE_DECLARATION__VALUE:
        setValue((VariableValue)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PlSqlPackage.VARIABLE_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PlSqlPackage.VARIABLE_DECLARATION__IS_CONSTANT:
        setIsConstant(IS_CONSTANT_EDEFAULT);
        return;
      case PlSqlPackage.VARIABLE_DECLARATION__DATA_TYPE:
        setDataType(DATA_TYPE_EDEFAULT);
        return;
      case PlSqlPackage.VARIABLE_DECLARATION__IS_NOT_NULL:
        setIsNotNull(IS_NOT_NULL_EDEFAULT);
        return;
      case PlSqlPackage.VARIABLE_DECLARATION__VALUE:
        setValue((VariableValue)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PlSqlPackage.VARIABLE_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PlSqlPackage.VARIABLE_DECLARATION__IS_CONSTANT:
        return isConstant != IS_CONSTANT_EDEFAULT;
      case PlSqlPackage.VARIABLE_DECLARATION__DATA_TYPE:
        return DATA_TYPE_EDEFAULT == null ? dataType != null : !DATA_TYPE_EDEFAULT.equals(dataType);
      case PlSqlPackage.VARIABLE_DECLARATION__IS_NOT_NULL:
        return isNotNull != IS_NOT_NULL_EDEFAULT;
      case PlSqlPackage.VARIABLE_DECLARATION__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == NameDeclaration.class)
    {
      switch (derivedFeatureID)
      {
        case PlSqlPackage.VARIABLE_DECLARATION__NAME: return PlSqlPackage.NAME_DECLARATION__NAME;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == NameDeclaration.class)
    {
      switch (baseFeatureID)
      {
        case PlSqlPackage.NAME_DECLARATION__NAME: return PlSqlPackage.VARIABLE_DECLARATION__NAME;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", isConstant: ");
    result.append(isConstant);
    result.append(", dataType: ");
    result.append(dataType);
    result.append(", isNotNull: ");
    result.append(isNotNull);
    result.append(')');
    return result.toString();
  }

} //VariableDeclarationImpl
