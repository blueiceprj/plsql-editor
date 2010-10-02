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
import plsql.editor.xtext.plSql.ProcedureDefinition;
import plsql.editor.xtext.plSql.ProcedureImplementation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.impl.ProcedureDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.impl.ProcedureDefinitionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.impl.ProcedureDefinitionImpl#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureDefinitionImpl extends ItemImpl implements ProcedureDefinition
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
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected ParameterSequence parameters;

  /**
   * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplementation()
   * @generated
   * @ordered
   */
  protected ProcedureImplementation implementation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcedureDefinitionImpl()
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
    return PlSqlPackage.Literals.PROCEDURE_DEFINITION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.PROCEDURE_DEFINITION__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlSqlPackage.PROCEDURE_DEFINITION__PARAMETERS, oldParameters, newParameters);
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
        msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.PROCEDURE_DEFINITION__PARAMETERS, null, msgs);
      if (newParameters != null)
        msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.PROCEDURE_DEFINITION__PARAMETERS, null, msgs);
      msgs = basicSetParameters(newParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.PROCEDURE_DEFINITION__PARAMETERS, newParameters, newParameters));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcedureImplementation getImplementation()
  {
    return implementation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImplementation(ProcedureImplementation newImplementation, NotificationChain msgs)
  {
    ProcedureImplementation oldImplementation = implementation;
    implementation = newImplementation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlSqlPackage.PROCEDURE_DEFINITION__IMPLEMENTATION, oldImplementation, newImplementation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImplementation(ProcedureImplementation newImplementation)
  {
    if (newImplementation != implementation)
    {
      NotificationChain msgs = null;
      if (implementation != null)
        msgs = ((InternalEObject)implementation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.PROCEDURE_DEFINITION__IMPLEMENTATION, null, msgs);
      if (newImplementation != null)
        msgs = ((InternalEObject)newImplementation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.PROCEDURE_DEFINITION__IMPLEMENTATION, null, msgs);
      msgs = basicSetImplementation(newImplementation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.PROCEDURE_DEFINITION__IMPLEMENTATION, newImplementation, newImplementation));
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
      case PlSqlPackage.PROCEDURE_DEFINITION__PARAMETERS:
        return basicSetParameters(null, msgs);
      case PlSqlPackage.PROCEDURE_DEFINITION__IMPLEMENTATION:
        return basicSetImplementation(null, msgs);
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
      case PlSqlPackage.PROCEDURE_DEFINITION__NAME:
        return getName();
      case PlSqlPackage.PROCEDURE_DEFINITION__PARAMETERS:
        return getParameters();
      case PlSqlPackage.PROCEDURE_DEFINITION__IMPLEMENTATION:
        return getImplementation();
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
      case PlSqlPackage.PROCEDURE_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case PlSqlPackage.PROCEDURE_DEFINITION__PARAMETERS:
        setParameters((ParameterSequence)newValue);
        return;
      case PlSqlPackage.PROCEDURE_DEFINITION__IMPLEMENTATION:
        setImplementation((ProcedureImplementation)newValue);
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
      case PlSqlPackage.PROCEDURE_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PlSqlPackage.PROCEDURE_DEFINITION__PARAMETERS:
        setParameters((ParameterSequence)null);
        return;
      case PlSqlPackage.PROCEDURE_DEFINITION__IMPLEMENTATION:
        setImplementation((ProcedureImplementation)null);
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
      case PlSqlPackage.PROCEDURE_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PlSqlPackage.PROCEDURE_DEFINITION__PARAMETERS:
        return parameters != null;
      case PlSqlPackage.PROCEDURE_DEFINITION__IMPLEMENTATION:
        return implementation != null;
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
        case PlSqlPackage.PROCEDURE_DEFINITION__NAME: return PlSqlPackage.NAME_DECLARATION__NAME;
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
        case PlSqlPackage.NAME_DECLARATION__NAME: return PlSqlPackage.PROCEDURE_DEFINITION__NAME;
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
    result.append(')');
    return result.toString();
  }

} //ProcedureDefinitionImpl
