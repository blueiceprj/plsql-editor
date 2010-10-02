/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import plsql.editor.xtext.plSql.Item;
import plsql.editor.xtext.plSql.NameDeclaration;
import plsql.editor.xtext.plSql.PlSqlPackage;
import plsql.editor.xtext.plSql.ProcedureInvokerRightsClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.impl.PackageImpl#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.impl.PackageImpl#getInvokerRights <em>Invoker Rights</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.impl.PackageImpl#getItems <em>Items</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.impl.PackageImpl#getEndName <em>End Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends CompilationUnitImpl implements plsql.editor.xtext.plSql.Package
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
   * The default value of the '{@link #getSchemaName() <em>Schema Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSchemaName()
   * @generated
   * @ordered
   */
  protected static final String SCHEMA_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSchemaName() <em>Schema Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSchemaName()
   * @generated
   * @ordered
   */
  protected String schemaName = SCHEMA_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getInvokerRights() <em>Invoker Rights</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInvokerRights()
   * @generated
   * @ordered
   */
  protected ProcedureInvokerRightsClause invokerRights;

  /**
   * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItems()
   * @generated
   * @ordered
   */
  protected EList<Item> items;

  /**
   * The default value of the '{@link #getEndName() <em>End Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndName()
   * @generated
   * @ordered
   */
  protected static final String END_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEndName() <em>End Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndName()
   * @generated
   * @ordered
   */
  protected String endName = END_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackageImpl()
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
    return PlSqlPackage.Literals.PACKAGE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.PACKAGE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSchemaName()
  {
    return schemaName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSchemaName(String newSchemaName)
  {
    String oldSchemaName = schemaName;
    schemaName = newSchemaName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.PACKAGE__SCHEMA_NAME, oldSchemaName, schemaName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcedureInvokerRightsClause getInvokerRights()
  {
    return invokerRights;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInvokerRights(ProcedureInvokerRightsClause newInvokerRights, NotificationChain msgs)
  {
    ProcedureInvokerRightsClause oldInvokerRights = invokerRights;
    invokerRights = newInvokerRights;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlSqlPackage.PACKAGE__INVOKER_RIGHTS, oldInvokerRights, newInvokerRights);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInvokerRights(ProcedureInvokerRightsClause newInvokerRights)
  {
    if (newInvokerRights != invokerRights)
    {
      NotificationChain msgs = null;
      if (invokerRights != null)
        msgs = ((InternalEObject)invokerRights).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.PACKAGE__INVOKER_RIGHTS, null, msgs);
      if (newInvokerRights != null)
        msgs = ((InternalEObject)newInvokerRights).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.PACKAGE__INVOKER_RIGHTS, null, msgs);
      msgs = basicSetInvokerRights(newInvokerRights, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.PACKAGE__INVOKER_RIGHTS, newInvokerRights, newInvokerRights));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Item> getItems()
  {
    if (items == null)
    {
      items = new EObjectContainmentEList<Item>(Item.class, this, PlSqlPackage.PACKAGE__ITEMS);
    }
    return items;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEndName()
  {
    return endName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndName(String newEndName)
  {
    String oldEndName = endName;
    endName = newEndName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.PACKAGE__END_NAME, oldEndName, endName));
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
      case PlSqlPackage.PACKAGE__INVOKER_RIGHTS:
        return basicSetInvokerRights(null, msgs);
      case PlSqlPackage.PACKAGE__ITEMS:
        return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
      case PlSqlPackage.PACKAGE__NAME:
        return getName();
      case PlSqlPackage.PACKAGE__SCHEMA_NAME:
        return getSchemaName();
      case PlSqlPackage.PACKAGE__INVOKER_RIGHTS:
        return getInvokerRights();
      case PlSqlPackage.PACKAGE__ITEMS:
        return getItems();
      case PlSqlPackage.PACKAGE__END_NAME:
        return getEndName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PlSqlPackage.PACKAGE__NAME:
        setName((String)newValue);
        return;
      case PlSqlPackage.PACKAGE__SCHEMA_NAME:
        setSchemaName((String)newValue);
        return;
      case PlSqlPackage.PACKAGE__INVOKER_RIGHTS:
        setInvokerRights((ProcedureInvokerRightsClause)newValue);
        return;
      case PlSqlPackage.PACKAGE__ITEMS:
        getItems().clear();
        getItems().addAll((Collection<? extends Item>)newValue);
        return;
      case PlSqlPackage.PACKAGE__END_NAME:
        setEndName((String)newValue);
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
      case PlSqlPackage.PACKAGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PlSqlPackage.PACKAGE__SCHEMA_NAME:
        setSchemaName(SCHEMA_NAME_EDEFAULT);
        return;
      case PlSqlPackage.PACKAGE__INVOKER_RIGHTS:
        setInvokerRights((ProcedureInvokerRightsClause)null);
        return;
      case PlSqlPackage.PACKAGE__ITEMS:
        getItems().clear();
        return;
      case PlSqlPackage.PACKAGE__END_NAME:
        setEndName(END_NAME_EDEFAULT);
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
      case PlSqlPackage.PACKAGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PlSqlPackage.PACKAGE__SCHEMA_NAME:
        return SCHEMA_NAME_EDEFAULT == null ? schemaName != null : !SCHEMA_NAME_EDEFAULT.equals(schemaName);
      case PlSqlPackage.PACKAGE__INVOKER_RIGHTS:
        return invokerRights != null;
      case PlSqlPackage.PACKAGE__ITEMS:
        return items != null && !items.isEmpty();
      case PlSqlPackage.PACKAGE__END_NAME:
        return END_NAME_EDEFAULT == null ? endName != null : !END_NAME_EDEFAULT.equals(endName);
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
        case PlSqlPackage.PACKAGE__NAME: return PlSqlPackage.NAME_DECLARATION__NAME;
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
        case PlSqlPackage.NAME_DECLARATION__NAME: return PlSqlPackage.PACKAGE__NAME;
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
    result.append(", schemaName: ");
    result.append(schemaName);
    result.append(", endName: ");
    result.append(endName);
    result.append(')');
    return result.toString();
  }

} //PackageImpl
