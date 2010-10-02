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
import plsql.editor.xtext.plSql.ForLoopStatement;
import plsql.editor.xtext.plSql.LoopVariableDeclaration;
import plsql.editor.xtext.plSql.PlSqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Loop Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.impl.ForLoopStatementImpl#getIndexVariable <em>Index Variable</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.impl.ForLoopStatementImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.impl.ForLoopStatementImpl#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForLoopStatementImpl extends LoopStatementImpl implements ForLoopStatement
{
  /**
   * The cached value of the '{@link #getIndexVariable() <em>Index Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndexVariable()
   * @generated
   * @ordered
   */
  protected LoopVariableDeclaration indexVariable;

  /**
   * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowerBound()
   * @generated
   * @ordered
   */
  protected Expression lowerBound;

  /**
   * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpperBound()
   * @generated
   * @ordered
   */
  protected Expression upperBound;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForLoopStatementImpl()
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
    return PlSqlPackage.Literals.FOR_LOOP_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoopVariableDeclaration getIndexVariable()
  {
    return indexVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndexVariable(LoopVariableDeclaration newIndexVariable, NotificationChain msgs)
  {
    LoopVariableDeclaration oldIndexVariable = indexVariable;
    indexVariable = newIndexVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlSqlPackage.FOR_LOOP_STATEMENT__INDEX_VARIABLE, oldIndexVariable, newIndexVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndexVariable(LoopVariableDeclaration newIndexVariable)
  {
    if (newIndexVariable != indexVariable)
    {
      NotificationChain msgs = null;
      if (indexVariable != null)
        msgs = ((InternalEObject)indexVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.FOR_LOOP_STATEMENT__INDEX_VARIABLE, null, msgs);
      if (newIndexVariable != null)
        msgs = ((InternalEObject)newIndexVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.FOR_LOOP_STATEMENT__INDEX_VARIABLE, null, msgs);
      msgs = basicSetIndexVariable(newIndexVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.FOR_LOOP_STATEMENT__INDEX_VARIABLE, newIndexVariable, newIndexVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getLowerBound()
  {
    return lowerBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLowerBound(Expression newLowerBound, NotificationChain msgs)
  {
    Expression oldLowerBound = lowerBound;
    lowerBound = newLowerBound;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlSqlPackage.FOR_LOOP_STATEMENT__LOWER_BOUND, oldLowerBound, newLowerBound);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLowerBound(Expression newLowerBound)
  {
    if (newLowerBound != lowerBound)
    {
      NotificationChain msgs = null;
      if (lowerBound != null)
        msgs = ((InternalEObject)lowerBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.FOR_LOOP_STATEMENT__LOWER_BOUND, null, msgs);
      if (newLowerBound != null)
        msgs = ((InternalEObject)newLowerBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.FOR_LOOP_STATEMENT__LOWER_BOUND, null, msgs);
      msgs = basicSetLowerBound(newLowerBound, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.FOR_LOOP_STATEMENT__LOWER_BOUND, newLowerBound, newLowerBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getUpperBound()
  {
    return upperBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUpperBound(Expression newUpperBound, NotificationChain msgs)
  {
    Expression oldUpperBound = upperBound;
    upperBound = newUpperBound;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlSqlPackage.FOR_LOOP_STATEMENT__UPPER_BOUND, oldUpperBound, newUpperBound);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpperBound(Expression newUpperBound)
  {
    if (newUpperBound != upperBound)
    {
      NotificationChain msgs = null;
      if (upperBound != null)
        msgs = ((InternalEObject)upperBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.FOR_LOOP_STATEMENT__UPPER_BOUND, null, msgs);
      if (newUpperBound != null)
        msgs = ((InternalEObject)newUpperBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.FOR_LOOP_STATEMENT__UPPER_BOUND, null, msgs);
      msgs = basicSetUpperBound(newUpperBound, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.FOR_LOOP_STATEMENT__UPPER_BOUND, newUpperBound, newUpperBound));
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
      case PlSqlPackage.FOR_LOOP_STATEMENT__INDEX_VARIABLE:
        return basicSetIndexVariable(null, msgs);
      case PlSqlPackage.FOR_LOOP_STATEMENT__LOWER_BOUND:
        return basicSetLowerBound(null, msgs);
      case PlSqlPackage.FOR_LOOP_STATEMENT__UPPER_BOUND:
        return basicSetUpperBound(null, msgs);
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
      case PlSqlPackage.FOR_LOOP_STATEMENT__INDEX_VARIABLE:
        return getIndexVariable();
      case PlSqlPackage.FOR_LOOP_STATEMENT__LOWER_BOUND:
        return getLowerBound();
      case PlSqlPackage.FOR_LOOP_STATEMENT__UPPER_BOUND:
        return getUpperBound();
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
      case PlSqlPackage.FOR_LOOP_STATEMENT__INDEX_VARIABLE:
        setIndexVariable((LoopVariableDeclaration)newValue);
        return;
      case PlSqlPackage.FOR_LOOP_STATEMENT__LOWER_BOUND:
        setLowerBound((Expression)newValue);
        return;
      case PlSqlPackage.FOR_LOOP_STATEMENT__UPPER_BOUND:
        setUpperBound((Expression)newValue);
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
      case PlSqlPackage.FOR_LOOP_STATEMENT__INDEX_VARIABLE:
        setIndexVariable((LoopVariableDeclaration)null);
        return;
      case PlSqlPackage.FOR_LOOP_STATEMENT__LOWER_BOUND:
        setLowerBound((Expression)null);
        return;
      case PlSqlPackage.FOR_LOOP_STATEMENT__UPPER_BOUND:
        setUpperBound((Expression)null);
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
      case PlSqlPackage.FOR_LOOP_STATEMENT__INDEX_VARIABLE:
        return indexVariable != null;
      case PlSqlPackage.FOR_LOOP_STATEMENT__LOWER_BOUND:
        return lowerBound != null;
      case PlSqlPackage.FOR_LOOP_STATEMENT__UPPER_BOUND:
        return upperBound != null;
    }
    return super.eIsSet(featureID);
  }

} //ForLoopStatementImpl
