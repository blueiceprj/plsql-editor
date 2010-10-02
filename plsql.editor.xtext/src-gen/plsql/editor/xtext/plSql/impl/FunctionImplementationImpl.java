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

import plsql.editor.xtext.plSql.DeclareSection;
import plsql.editor.xtext.plSql.FunctionImplementation;
import plsql.editor.xtext.plSql.PlSqlPackage;
import plsql.editor.xtext.plSql.StatementBody;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.impl.FunctionImplementationImpl#getDeclareSection <em>Declare Section</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.impl.FunctionImplementationImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionImplementationImpl extends FunctionContentImpl implements FunctionImplementation
{
  /**
   * The cached value of the '{@link #getDeclareSection() <em>Declare Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclareSection()
   * @generated
   * @ordered
   */
  protected DeclareSection declareSection;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected StatementBody body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionImplementationImpl()
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
    return PlSqlPackage.Literals.FUNCTION_IMPLEMENTATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeclareSection getDeclareSection()
  {
    return declareSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclareSection(DeclareSection newDeclareSection, NotificationChain msgs)
  {
    DeclareSection oldDeclareSection = declareSection;
    declareSection = newDeclareSection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlSqlPackage.FUNCTION_IMPLEMENTATION__DECLARE_SECTION, oldDeclareSection, newDeclareSection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclareSection(DeclareSection newDeclareSection)
  {
    if (newDeclareSection != declareSection)
    {
      NotificationChain msgs = null;
      if (declareSection != null)
        msgs = ((InternalEObject)declareSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.FUNCTION_IMPLEMENTATION__DECLARE_SECTION, null, msgs);
      if (newDeclareSection != null)
        msgs = ((InternalEObject)newDeclareSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.FUNCTION_IMPLEMENTATION__DECLARE_SECTION, null, msgs);
      msgs = basicSetDeclareSection(newDeclareSection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.FUNCTION_IMPLEMENTATION__DECLARE_SECTION, newDeclareSection, newDeclareSection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementBody getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(StatementBody newBody, NotificationChain msgs)
  {
    StatementBody oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlSqlPackage.FUNCTION_IMPLEMENTATION__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(StatementBody newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.FUNCTION_IMPLEMENTATION__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.FUNCTION_IMPLEMENTATION__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.FUNCTION_IMPLEMENTATION__BODY, newBody, newBody));
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
      case PlSqlPackage.FUNCTION_IMPLEMENTATION__DECLARE_SECTION:
        return basicSetDeclareSection(null, msgs);
      case PlSqlPackage.FUNCTION_IMPLEMENTATION__BODY:
        return basicSetBody(null, msgs);
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
      case PlSqlPackage.FUNCTION_IMPLEMENTATION__DECLARE_SECTION:
        return getDeclareSection();
      case PlSqlPackage.FUNCTION_IMPLEMENTATION__BODY:
        return getBody();
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
      case PlSqlPackage.FUNCTION_IMPLEMENTATION__DECLARE_SECTION:
        setDeclareSection((DeclareSection)newValue);
        return;
      case PlSqlPackage.FUNCTION_IMPLEMENTATION__BODY:
        setBody((StatementBody)newValue);
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
      case PlSqlPackage.FUNCTION_IMPLEMENTATION__DECLARE_SECTION:
        setDeclareSection((DeclareSection)null);
        return;
      case PlSqlPackage.FUNCTION_IMPLEMENTATION__BODY:
        setBody((StatementBody)null);
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
      case PlSqlPackage.FUNCTION_IMPLEMENTATION__DECLARE_SECTION:
        return declareSection != null;
      case PlSqlPackage.FUNCTION_IMPLEMENTATION__BODY:
        return body != null;
    }
    return super.eIsSet(featureID);
  }

} //FunctionImplementationImpl
