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

import plsql.editor.xtext.plSql.CloseStatement;
import plsql.editor.xtext.plSql.PlSqlPackage;
import plsql.editor.xtext.plSql.VariableRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Close Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.impl.CloseStatementImpl#getCursor <em>Cursor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CloseStatementImpl extends StatementImpl implements CloseStatement
{
  /**
   * The cached value of the '{@link #getCursor() <em>Cursor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCursor()
   * @generated
   * @ordered
   */
  protected VariableRef cursor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CloseStatementImpl()
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
    return PlSqlPackage.Literals.CLOSE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableRef getCursor()
  {
    return cursor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCursor(VariableRef newCursor, NotificationChain msgs)
  {
    VariableRef oldCursor = cursor;
    cursor = newCursor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlSqlPackage.CLOSE_STATEMENT__CURSOR, oldCursor, newCursor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCursor(VariableRef newCursor)
  {
    if (newCursor != cursor)
    {
      NotificationChain msgs = null;
      if (cursor != null)
        msgs = ((InternalEObject)cursor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.CLOSE_STATEMENT__CURSOR, null, msgs);
      if (newCursor != null)
        msgs = ((InternalEObject)newCursor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.CLOSE_STATEMENT__CURSOR, null, msgs);
      msgs = basicSetCursor(newCursor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.CLOSE_STATEMENT__CURSOR, newCursor, newCursor));
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
      case PlSqlPackage.CLOSE_STATEMENT__CURSOR:
        return basicSetCursor(null, msgs);
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
      case PlSqlPackage.CLOSE_STATEMENT__CURSOR:
        return getCursor();
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
      case PlSqlPackage.CLOSE_STATEMENT__CURSOR:
        setCursor((VariableRef)newValue);
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
      case PlSqlPackage.CLOSE_STATEMENT__CURSOR:
        setCursor((VariableRef)null);
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
      case PlSqlPackage.CLOSE_STATEMENT__CURSOR:
        return cursor != null;
    }
    return super.eIsSet(featureID);
  }

} //CloseStatementImpl
