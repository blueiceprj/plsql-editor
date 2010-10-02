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
import plsql.editor.xtext.plSql.ParameterSequence;
import plsql.editor.xtext.plSql.PlSqlPackage;
import plsql.editor.xtext.plSql.Procedure;
import plsql.editor.xtext.plSql.ProcedureContent;
import plsql.editor.xtext.plSql.ProcedureInvokerRightsClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.impl.ProcedureImpl#getName <em>Name</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.impl.ProcedureImpl#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.impl.ProcedureImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.impl.ProcedureImpl#getInvokerRights <em>Invoker Rights</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.impl.ProcedureImpl#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureImpl extends CompilationUnitImpl implements Procedure
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
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected ParameterSequence parameters;

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
   * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected ProcedureContent content;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcedureImpl()
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
    return PlSqlPackage.Literals.PROCEDURE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.PROCEDURE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.PROCEDURE__SCHEMA_NAME, oldSchemaName, schemaName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterSequence getParameters()
  {
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameters(ParameterSequence newParameters, NotificationChain msgs)
  {
    ParameterSequence oldParameters = parameters;
    parameters = newParameters;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlSqlPackage.PROCEDURE__PARAMETERS, oldParameters, newParameters);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameters(ParameterSequence newParameters)
  {
    if (newParameters != parameters)
    {
      NotificationChain msgs = null;
      if (parameters != null)
        msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.PROCEDURE__PARAMETERS, null, msgs);
      if (newParameters != null)
        msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.PROCEDURE__PARAMETERS, null, msgs);
      msgs = basicSetParameters(newParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.PROCEDURE__PARAMETERS, newParameters, newParameters));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlSqlPackage.PROCEDURE__INVOKER_RIGHTS, oldInvokerRights, newInvokerRights);
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
        msgs = ((InternalEObject)invokerRights).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.PROCEDURE__INVOKER_RIGHTS, null, msgs);
      if (newInvokerRights != null)
        msgs = ((InternalEObject)newInvokerRights).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.PROCEDURE__INVOKER_RIGHTS, null, msgs);
      msgs = basicSetInvokerRights(newInvokerRights, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.PROCEDURE__INVOKER_RIGHTS, newInvokerRights, newInvokerRights));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcedureContent getContent()
  {
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContent(ProcedureContent newContent, NotificationChain msgs)
  {
    ProcedureContent oldContent = content;
    content = newContent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlSqlPackage.PROCEDURE__CONTENT, oldContent, newContent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContent(ProcedureContent newContent)
  {
    if (newContent != content)
    {
      NotificationChain msgs = null;
      if (content != null)
        msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.PROCEDURE__CONTENT, null, msgs);
      if (newContent != null)
        msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.PROCEDURE__CONTENT, null, msgs);
      msgs = basicSetContent(newContent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.PROCEDURE__CONTENT, newContent, newContent));
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
      case PlSqlPackage.PROCEDURE__PARAMETERS:
        return basicSetParameters(null, msgs);
      case PlSqlPackage.PROCEDURE__INVOKER_RIGHTS:
        return basicSetInvokerRights(null, msgs);
      case PlSqlPackage.PROCEDURE__CONTENT:
        return basicSetContent(null, msgs);
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
      case PlSqlPackage.PROCEDURE__NAME:
        return getName();
      case PlSqlPackage.PROCEDURE__SCHEMA_NAME:
        return getSchemaName();
      case PlSqlPackage.PROCEDURE__PARAMETERS:
        return getParameters();
      case PlSqlPackage.PROCEDURE__INVOKER_RIGHTS:
        return getInvokerRights();
      case PlSqlPackage.PROCEDURE__CONTENT:
        return getContent();
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
      case PlSqlPackage.PROCEDURE__NAME:
        setName((String)newValue);
        return;
      case PlSqlPackage.PROCEDURE__SCHEMA_NAME:
        setSchemaName((String)newValue);
        return;
      case PlSqlPackage.PROCEDURE__PARAMETERS:
        setParameters((ParameterSequence)newValue);
        return;
      case PlSqlPackage.PROCEDURE__INVOKER_RIGHTS:
        setInvokerRights((ProcedureInvokerRightsClause)newValue);
        return;
      case PlSqlPackage.PROCEDURE__CONTENT:
        setContent((ProcedureContent)newValue);
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
      case PlSqlPackage.PROCEDURE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PlSqlPackage.PROCEDURE__SCHEMA_NAME:
        setSchemaName(SCHEMA_NAME_EDEFAULT);
        return;
      case PlSqlPackage.PROCEDURE__PARAMETERS:
        setParameters((ParameterSequence)null);
        return;
      case PlSqlPackage.PROCEDURE__INVOKER_RIGHTS:
        setInvokerRights((ProcedureInvokerRightsClause)null);
        return;
      case PlSqlPackage.PROCEDURE__CONTENT:
        setContent((ProcedureContent)null);
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
      case PlSqlPackage.PROCEDURE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PlSqlPackage.PROCEDURE__SCHEMA_NAME:
        return SCHEMA_NAME_EDEFAULT == null ? schemaName != null : !SCHEMA_NAME_EDEFAULT.equals(schemaName);
      case PlSqlPackage.PROCEDURE__PARAMETERS:
        return parameters != null;
      case PlSqlPackage.PROCEDURE__INVOKER_RIGHTS:
        return invokerRights != null;
      case PlSqlPackage.PROCEDURE__CONTENT:
        return content != null;
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
        case PlSqlPackage.PROCEDURE__NAME: return PlSqlPackage.NAME_DECLARATION__NAME;
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
        case PlSqlPackage.NAME_DECLARATION__NAME: return PlSqlPackage.PROCEDURE__NAME;
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
    result.append(')');
    return result.toString();
  }

} //ProcedureImpl
