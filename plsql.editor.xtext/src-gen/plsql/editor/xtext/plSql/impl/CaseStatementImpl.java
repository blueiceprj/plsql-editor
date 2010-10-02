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

import plsql.editor.xtext.plSql.CaseStatement;
import plsql.editor.xtext.plSql.CaseStatementElseBranch;
import plsql.editor.xtext.plSql.CaseStatementWhenBranch;
import plsql.editor.xtext.plSql.Expression;
import plsql.editor.xtext.plSql.PlSqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.impl.CaseStatementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.impl.CaseStatementImpl#getWhenBranches <em>When Branches</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.impl.CaseStatementImpl#getElseBranch <em>Else Branch</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.impl.CaseStatementImpl#getEndLabel <em>End Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CaseStatementImpl extends StatementImpl implements CaseStatement
{
  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * The cached value of the '{@link #getWhenBranches() <em>When Branches</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhenBranches()
   * @generated
   * @ordered
   */
  protected EList<CaseStatementWhenBranch> whenBranches;

  /**
   * The cached value of the '{@link #getElseBranch() <em>Else Branch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseBranch()
   * @generated
   * @ordered
   */
  protected CaseStatementElseBranch elseBranch;

  /**
   * The default value of the '{@link #getEndLabel() <em>End Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndLabel()
   * @generated
   * @ordered
   */
  protected static final String END_LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEndLabel() <em>End Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndLabel()
   * @generated
   * @ordered
   */
  protected String endLabel = END_LABEL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CaseStatementImpl()
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
    return PlSqlPackage.Literals.CASE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlSqlPackage.CASE_STATEMENT__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.CASE_STATEMENT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.CASE_STATEMENT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.CASE_STATEMENT__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CaseStatementWhenBranch> getWhenBranches()
  {
    if (whenBranches == null)
    {
      whenBranches = new EObjectContainmentEList<CaseStatementWhenBranch>(CaseStatementWhenBranch.class, this, PlSqlPackage.CASE_STATEMENT__WHEN_BRANCHES);
    }
    return whenBranches;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CaseStatementElseBranch getElseBranch()
  {
    return elseBranch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElseBranch(CaseStatementElseBranch newElseBranch, NotificationChain msgs)
  {
    CaseStatementElseBranch oldElseBranch = elseBranch;
    elseBranch = newElseBranch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlSqlPackage.CASE_STATEMENT__ELSE_BRANCH, oldElseBranch, newElseBranch);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElseBranch(CaseStatementElseBranch newElseBranch)
  {
    if (newElseBranch != elseBranch)
    {
      NotificationChain msgs = null;
      if (elseBranch != null)
        msgs = ((InternalEObject)elseBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.CASE_STATEMENT__ELSE_BRANCH, null, msgs);
      if (newElseBranch != null)
        msgs = ((InternalEObject)newElseBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.CASE_STATEMENT__ELSE_BRANCH, null, msgs);
      msgs = basicSetElseBranch(newElseBranch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.CASE_STATEMENT__ELSE_BRANCH, newElseBranch, newElseBranch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEndLabel()
  {
    return endLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndLabel(String newEndLabel)
  {
    String oldEndLabel = endLabel;
    endLabel = newEndLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.CASE_STATEMENT__END_LABEL, oldEndLabel, endLabel));
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
      case PlSqlPackage.CASE_STATEMENT__EXPRESSION:
        return basicSetExpression(null, msgs);
      case PlSqlPackage.CASE_STATEMENT__WHEN_BRANCHES:
        return ((InternalEList<?>)getWhenBranches()).basicRemove(otherEnd, msgs);
      case PlSqlPackage.CASE_STATEMENT__ELSE_BRANCH:
        return basicSetElseBranch(null, msgs);
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
      case PlSqlPackage.CASE_STATEMENT__EXPRESSION:
        return getExpression();
      case PlSqlPackage.CASE_STATEMENT__WHEN_BRANCHES:
        return getWhenBranches();
      case PlSqlPackage.CASE_STATEMENT__ELSE_BRANCH:
        return getElseBranch();
      case PlSqlPackage.CASE_STATEMENT__END_LABEL:
        return getEndLabel();
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
      case PlSqlPackage.CASE_STATEMENT__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case PlSqlPackage.CASE_STATEMENT__WHEN_BRANCHES:
        getWhenBranches().clear();
        getWhenBranches().addAll((Collection<? extends CaseStatementWhenBranch>)newValue);
        return;
      case PlSqlPackage.CASE_STATEMENT__ELSE_BRANCH:
        setElseBranch((CaseStatementElseBranch)newValue);
        return;
      case PlSqlPackage.CASE_STATEMENT__END_LABEL:
        setEndLabel((String)newValue);
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
      case PlSqlPackage.CASE_STATEMENT__EXPRESSION:
        setExpression((Expression)null);
        return;
      case PlSqlPackage.CASE_STATEMENT__WHEN_BRANCHES:
        getWhenBranches().clear();
        return;
      case PlSqlPackage.CASE_STATEMENT__ELSE_BRANCH:
        setElseBranch((CaseStatementElseBranch)null);
        return;
      case PlSqlPackage.CASE_STATEMENT__END_LABEL:
        setEndLabel(END_LABEL_EDEFAULT);
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
      case PlSqlPackage.CASE_STATEMENT__EXPRESSION:
        return expression != null;
      case PlSqlPackage.CASE_STATEMENT__WHEN_BRANCHES:
        return whenBranches != null && !whenBranches.isEmpty();
      case PlSqlPackage.CASE_STATEMENT__ELSE_BRANCH:
        return elseBranch != null;
      case PlSqlPackage.CASE_STATEMENT__END_LABEL:
        return END_LABEL_EDEFAULT == null ? endLabel != null : !END_LABEL_EDEFAULT.equals(endLabel);
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
    result.append(" (endLabel: ");
    result.append(endLabel);
    result.append(')');
    return result.toString();
  }

} //CaseStatementImpl
