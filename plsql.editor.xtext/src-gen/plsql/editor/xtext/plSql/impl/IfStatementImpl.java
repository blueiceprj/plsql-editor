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

import plsql.editor.xtext.plSql.Expression;
import plsql.editor.xtext.plSql.IfStatement;
import plsql.editor.xtext.plSql.IfStatementElseBranch;
import plsql.editor.xtext.plSql.IfStatementElsifBranch;
import plsql.editor.xtext.plSql.PlSqlPackage;
import plsql.editor.xtext.plSql.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.impl.IfStatementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.impl.IfStatementImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.impl.IfStatementImpl#getElsifBranches <em>Elsif Branches</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.impl.IfStatementImpl#getElseBranch <em>Else Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfStatementImpl extends StatementImpl implements IfStatement
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
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<Statement> statements;

  /**
   * The cached value of the '{@link #getElsifBranches() <em>Elsif Branches</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElsifBranches()
   * @generated
   * @ordered
   */
  protected EList<IfStatementElsifBranch> elsifBranches;

  /**
   * The cached value of the '{@link #getElseBranch() <em>Else Branch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseBranch()
   * @generated
   * @ordered
   */
  protected IfStatementElseBranch elseBranch;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfStatementImpl()
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
    return PlSqlPackage.Literals.IF_STATEMENT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlSqlPackage.IF_STATEMENT__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.IF_STATEMENT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.IF_STATEMENT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.IF_STATEMENT__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<Statement>(Statement.class, this, PlSqlPackage.IF_STATEMENT__STATEMENTS);
    }
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IfStatementElsifBranch> getElsifBranches()
  {
    if (elsifBranches == null)
    {
      elsifBranches = new EObjectContainmentEList<IfStatementElsifBranch>(IfStatementElsifBranch.class, this, PlSqlPackage.IF_STATEMENT__ELSIF_BRANCHES);
    }
    return elsifBranches;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStatementElseBranch getElseBranch()
  {
    return elseBranch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElseBranch(IfStatementElseBranch newElseBranch, NotificationChain msgs)
  {
    IfStatementElseBranch oldElseBranch = elseBranch;
    elseBranch = newElseBranch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlSqlPackage.IF_STATEMENT__ELSE_BRANCH, oldElseBranch, newElseBranch);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElseBranch(IfStatementElseBranch newElseBranch)
  {
    if (newElseBranch != elseBranch)
    {
      NotificationChain msgs = null;
      if (elseBranch != null)
        msgs = ((InternalEObject)elseBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.IF_STATEMENT__ELSE_BRANCH, null, msgs);
      if (newElseBranch != null)
        msgs = ((InternalEObject)newElseBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.IF_STATEMENT__ELSE_BRANCH, null, msgs);
      msgs = basicSetElseBranch(newElseBranch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.IF_STATEMENT__ELSE_BRANCH, newElseBranch, newElseBranch));
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
      case PlSqlPackage.IF_STATEMENT__EXPRESSION:
        return basicSetExpression(null, msgs);
      case PlSqlPackage.IF_STATEMENT__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
      case PlSqlPackage.IF_STATEMENT__ELSIF_BRANCHES:
        return ((InternalEList<?>)getElsifBranches()).basicRemove(otherEnd, msgs);
      case PlSqlPackage.IF_STATEMENT__ELSE_BRANCH:
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
      case PlSqlPackage.IF_STATEMENT__EXPRESSION:
        return getExpression();
      case PlSqlPackage.IF_STATEMENT__STATEMENTS:
        return getStatements();
      case PlSqlPackage.IF_STATEMENT__ELSIF_BRANCHES:
        return getElsifBranches();
      case PlSqlPackage.IF_STATEMENT__ELSE_BRANCH:
        return getElseBranch();
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
      case PlSqlPackage.IF_STATEMENT__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case PlSqlPackage.IF_STATEMENT__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends Statement>)newValue);
        return;
      case PlSqlPackage.IF_STATEMENT__ELSIF_BRANCHES:
        getElsifBranches().clear();
        getElsifBranches().addAll((Collection<? extends IfStatementElsifBranch>)newValue);
        return;
      case PlSqlPackage.IF_STATEMENT__ELSE_BRANCH:
        setElseBranch((IfStatementElseBranch)newValue);
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
      case PlSqlPackage.IF_STATEMENT__EXPRESSION:
        setExpression((Expression)null);
        return;
      case PlSqlPackage.IF_STATEMENT__STATEMENTS:
        getStatements().clear();
        return;
      case PlSqlPackage.IF_STATEMENT__ELSIF_BRANCHES:
        getElsifBranches().clear();
        return;
      case PlSqlPackage.IF_STATEMENT__ELSE_BRANCH:
        setElseBranch((IfStatementElseBranch)null);
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
      case PlSqlPackage.IF_STATEMENT__EXPRESSION:
        return expression != null;
      case PlSqlPackage.IF_STATEMENT__STATEMENTS:
        return statements != null && !statements.isEmpty();
      case PlSqlPackage.IF_STATEMENT__ELSIF_BRANCHES:
        return elsifBranches != null && !elsifBranches.isEmpty();
      case PlSqlPackage.IF_STATEMENT__ELSE_BRANCH:
        return elseBranch != null;
    }
    return super.eIsSet(featureID);
  }

} //IfStatementImpl
