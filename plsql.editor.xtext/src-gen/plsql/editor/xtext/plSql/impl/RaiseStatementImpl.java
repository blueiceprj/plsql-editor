/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import plsql.editor.xtext.plSql.PlSqlPackage;
import plsql.editor.xtext.plSql.RaiseStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Raise Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.impl.RaiseStatementImpl#getExceptionName <em>Exception Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RaiseStatementImpl extends StatementImpl implements RaiseStatement
{
  /**
   * The default value of the '{@link #getExceptionName() <em>Exception Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExceptionName()
   * @generated
   * @ordered
   */
  protected static final String EXCEPTION_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExceptionName() <em>Exception Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExceptionName()
   * @generated
   * @ordered
   */
  protected String exceptionName = EXCEPTION_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RaiseStatementImpl()
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
    return PlSqlPackage.Literals.RAISE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExceptionName()
  {
    return exceptionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExceptionName(String newExceptionName)
  {
    String oldExceptionName = exceptionName;
    exceptionName = newExceptionName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.RAISE_STATEMENT__EXCEPTION_NAME, oldExceptionName, exceptionName));
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
      case PlSqlPackage.RAISE_STATEMENT__EXCEPTION_NAME:
        return getExceptionName();
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
      case PlSqlPackage.RAISE_STATEMENT__EXCEPTION_NAME:
        setExceptionName((String)newValue);
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
      case PlSqlPackage.RAISE_STATEMENT__EXCEPTION_NAME:
        setExceptionName(EXCEPTION_NAME_EDEFAULT);
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
      case PlSqlPackage.RAISE_STATEMENT__EXCEPTION_NAME:
        return EXCEPTION_NAME_EDEFAULT == null ? exceptionName != null : !EXCEPTION_NAME_EDEFAULT.equals(exceptionName);
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
    result.append(" (exceptionName: ");
    result.append(exceptionName);
    result.append(')');
    return result.toString();
  }

} //RaiseStatementImpl
