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

import plsql.editor.xtext.plSql.FetchStatement;
import plsql.editor.xtext.plSql.FetchStatementIntoClause;
import plsql.editor.xtext.plSql.PlSqlPackage;
import plsql.editor.xtext.plSql.VariableRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fetch Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.impl.FetchStatementImpl#getCursor <em>Cursor</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.impl.FetchStatementImpl#getIntoClause <em>Into Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FetchStatementImpl extends StatementImpl implements FetchStatement
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
   * The cached value of the '{@link #getIntoClause() <em>Into Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntoClause()
   * @generated
   * @ordered
   */
  protected FetchStatementIntoClause intoClause;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FetchStatementImpl()
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
    return PlSqlPackage.Literals.FETCH_STATEMENT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlSqlPackage.FETCH_STATEMENT__CURSOR, oldCursor, newCursor);
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
        msgs = ((InternalEObject)cursor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.FETCH_STATEMENT__CURSOR, null, msgs);
      if (newCursor != null)
        msgs = ((InternalEObject)newCursor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.FETCH_STATEMENT__CURSOR, null, msgs);
      msgs = basicSetCursor(newCursor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.FETCH_STATEMENT__CURSOR, newCursor, newCursor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FetchStatementIntoClause getIntoClause()
  {
    return intoClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIntoClause(FetchStatementIntoClause newIntoClause, NotificationChain msgs)
  {
    FetchStatementIntoClause oldIntoClause = intoClause;
    intoClause = newIntoClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlSqlPackage.FETCH_STATEMENT__INTO_CLAUSE, oldIntoClause, newIntoClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntoClause(FetchStatementIntoClause newIntoClause)
  {
    if (newIntoClause != intoClause)
    {
      NotificationChain msgs = null;
      if (intoClause != null)
        msgs = ((InternalEObject)intoClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.FETCH_STATEMENT__INTO_CLAUSE, null, msgs);
      if (newIntoClause != null)
        msgs = ((InternalEObject)newIntoClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.FETCH_STATEMENT__INTO_CLAUSE, null, msgs);
      msgs = basicSetIntoClause(newIntoClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.FETCH_STATEMENT__INTO_CLAUSE, newIntoClause, newIntoClause));
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
      case PlSqlPackage.FETCH_STATEMENT__CURSOR:
        return basicSetCursor(null, msgs);
      case PlSqlPackage.FETCH_STATEMENT__INTO_CLAUSE:
        return basicSetIntoClause(null, msgs);
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
      case PlSqlPackage.FETCH_STATEMENT__CURSOR:
        return getCursor();
      case PlSqlPackage.FETCH_STATEMENT__INTO_CLAUSE:
        return getIntoClause();
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
      case PlSqlPackage.FETCH_STATEMENT__CURSOR:
        setCursor((VariableRef)newValue);
        return;
      case PlSqlPackage.FETCH_STATEMENT__INTO_CLAUSE:
        setIntoClause((FetchStatementIntoClause)newValue);
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
      case PlSqlPackage.FETCH_STATEMENT__CURSOR:
        setCursor((VariableRef)null);
        return;
      case PlSqlPackage.FETCH_STATEMENT__INTO_CLAUSE:
        setIntoClause((FetchStatementIntoClause)null);
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
      case PlSqlPackage.FETCH_STATEMENT__CURSOR:
        return cursor != null;
      case PlSqlPackage.FETCH_STATEMENT__INTO_CLAUSE:
        return intoClause != null;
    }
    return super.eIsSet(featureID);
  }

} //FetchStatementImpl
