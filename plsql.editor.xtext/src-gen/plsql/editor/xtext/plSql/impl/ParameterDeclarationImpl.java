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

import plsql.editor.xtext.plSql.ParameterDeclaration;
import plsql.editor.xtext.plSql.ParameterValue;
import plsql.editor.xtext.plSql.PlSqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.impl.ParameterDeclarationImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.impl.ParameterDeclarationImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.impl.ParameterDeclarationImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterDeclarationImpl extends NameDeclarationImpl implements ParameterDeclaration
{
  /**
   * The default value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehavior()
   * @generated
   * @ordered
   */
  protected static final String BEHAVIOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehavior()
   * @generated
   * @ordered
   */
  protected String behavior = BEHAVIOR_EDEFAULT;

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
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected ParameterValue value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterDeclarationImpl()
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
    return PlSqlPackage.Literals.PARAMETER_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBehavior()
  {
    return behavior;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBehavior(String newBehavior)
  {
    String oldBehavior = behavior;
    behavior = newBehavior;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.PARAMETER_DECLARATION__BEHAVIOR, oldBehavior, behavior));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.PARAMETER_DECLARATION__DATA_TYPE, oldDataType, dataType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterValue getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(ParameterValue newValue, NotificationChain msgs)
  {
    ParameterValue oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlSqlPackage.PARAMETER_DECLARATION__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(ParameterValue newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.PARAMETER_DECLARATION__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.PARAMETER_DECLARATION__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.PARAMETER_DECLARATION__VALUE, newValue, newValue));
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
      case PlSqlPackage.PARAMETER_DECLARATION__VALUE:
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
      case PlSqlPackage.PARAMETER_DECLARATION__BEHAVIOR:
        return getBehavior();
      case PlSqlPackage.PARAMETER_DECLARATION__DATA_TYPE:
        return getDataType();
      case PlSqlPackage.PARAMETER_DECLARATION__VALUE:
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
      case PlSqlPackage.PARAMETER_DECLARATION__BEHAVIOR:
        setBehavior((String)newValue);
        return;
      case PlSqlPackage.PARAMETER_DECLARATION__DATA_TYPE:
        setDataType((String)newValue);
        return;
      case PlSqlPackage.PARAMETER_DECLARATION__VALUE:
        setValue((ParameterValue)newValue);
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
      case PlSqlPackage.PARAMETER_DECLARATION__BEHAVIOR:
        setBehavior(BEHAVIOR_EDEFAULT);
        return;
      case PlSqlPackage.PARAMETER_DECLARATION__DATA_TYPE:
        setDataType(DATA_TYPE_EDEFAULT);
        return;
      case PlSqlPackage.PARAMETER_DECLARATION__VALUE:
        setValue((ParameterValue)null);
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
      case PlSqlPackage.PARAMETER_DECLARATION__BEHAVIOR:
        return BEHAVIOR_EDEFAULT == null ? behavior != null : !BEHAVIOR_EDEFAULT.equals(behavior);
      case PlSqlPackage.PARAMETER_DECLARATION__DATA_TYPE:
        return DATA_TYPE_EDEFAULT == null ? dataType != null : !DATA_TYPE_EDEFAULT.equals(dataType);
      case PlSqlPackage.PARAMETER_DECLARATION__VALUE:
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
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (behavior: ");
    result.append(behavior);
    result.append(", dataType: ");
    result.append(dataType);
    result.append(')');
    return result.toString();
  }

} //ParameterDeclarationImpl
