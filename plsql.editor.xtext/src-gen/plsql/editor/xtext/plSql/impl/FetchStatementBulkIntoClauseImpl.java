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

import plsql.editor.xtext.plSql.Expression;
import plsql.editor.xtext.plSql.FetchStatementBulkIntoClause;
import plsql.editor.xtext.plSql.PlSqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fetch Statement Bulk Into Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.impl.FetchStatementBulkIntoClauseImpl#getLimitExpression <em>Limit Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FetchStatementBulkIntoClauseImpl extends FetchStatementIntoClauseImpl implements FetchStatementBulkIntoClause
{
  /**
   * The cached value of the '{@link #getLimitExpression() <em>Limit Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLimitExpression()
   * @generated
   * @ordered
   */
  protected Expression limitExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FetchStatementBulkIntoClauseImpl()
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
    return PlSqlPackage.Literals.FETCH_STATEMENT_BULK_INTO_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getLimitExpression()
  {
    return limitExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLimitExpression(Expression newLimitExpression, NotificationChain msgs)
  {
    Expression oldLimitExpression = limitExpression;
    limitExpression = newLimitExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlSqlPackage.FETCH_STATEMENT_BULK_INTO_CLAUSE__LIMIT_EXPRESSION, oldLimitExpression, newLimitExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLimitExpression(Expression newLimitExpression)
  {
    if (newLimitExpression != limitExpression)
    {
      NotificationChain msgs = null;
      if (limitExpression != null)
        msgs = ((InternalEObject)limitExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.FETCH_STATEMENT_BULK_INTO_CLAUSE__LIMIT_EXPRESSION, null, msgs);
      if (newLimitExpression != null)
        msgs = ((InternalEObject)newLimitExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.FETCH_STATEMENT_BULK_INTO_CLAUSE__LIMIT_EXPRESSION, null, msgs);
      msgs = basicSetLimitExpression(newLimitExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.FETCH_STATEMENT_BULK_INTO_CLAUSE__LIMIT_EXPRESSION, newLimitExpression, newLimitExpression));
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
      case PlSqlPackage.FETCH_STATEMENT_BULK_INTO_CLAUSE__LIMIT_EXPRESSION:
        return basicSetLimitExpression(null, msgs);
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
      case PlSqlPackage.FETCH_STATEMENT_BULK_INTO_CLAUSE__LIMIT_EXPRESSION:
        return getLimitExpression();
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
      case PlSqlPackage.FETCH_STATEMENT_BULK_INTO_CLAUSE__LIMIT_EXPRESSION:
        setLimitExpression((Expression)newValue);
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
      case PlSqlPackage.FETCH_STATEMENT_BULK_INTO_CLAUSE__LIMIT_EXPRESSION:
        setLimitExpression((Expression)null);
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
      case PlSqlPackage.FETCH_STATEMENT_BULK_INTO_CLAUSE__LIMIT_EXPRESSION:
        return limitExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //FetchStatementBulkIntoClauseImpl
