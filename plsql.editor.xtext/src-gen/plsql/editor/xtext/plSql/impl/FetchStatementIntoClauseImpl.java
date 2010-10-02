/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import plsql.editor.xtext.plSql.FetchStatementIntoClause;
import plsql.editor.xtext.plSql.PlSqlPackage;
import plsql.editor.xtext.plSql.VariableRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fetch Statement Into Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.impl.FetchStatementIntoClauseImpl#getTargetVariables <em>Target Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FetchStatementIntoClauseImpl extends MinimalEObjectImpl.Container implements FetchStatementIntoClause
{
  /**
   * The cached value of the '{@link #getTargetVariables() <em>Target Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetVariables()
   * @generated
   * @ordered
   */
  protected EList<VariableRef> targetVariables;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FetchStatementIntoClauseImpl()
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
    return PlSqlPackage.Literals.FETCH_STATEMENT_INTO_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VariableRef> getTargetVariables()
  {
    if (targetVariables == null)
    {
      targetVariables = new EObjectContainmentEList<VariableRef>(VariableRef.class, this, PlSqlPackage.FETCH_STATEMENT_INTO_CLAUSE__TARGET_VARIABLES);
    }
    return targetVariables;
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
      case PlSqlPackage.FETCH_STATEMENT_INTO_CLAUSE__TARGET_VARIABLES:
        return ((InternalEList<?>)getTargetVariables()).basicRemove(otherEnd, msgs);
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
      case PlSqlPackage.FETCH_STATEMENT_INTO_CLAUSE__TARGET_VARIABLES:
        return getTargetVariables();
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
      case PlSqlPackage.FETCH_STATEMENT_INTO_CLAUSE__TARGET_VARIABLES:
        getTargetVariables().clear();
        getTargetVariables().addAll((Collection<? extends VariableRef>)newValue);
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
      case PlSqlPackage.FETCH_STATEMENT_INTO_CLAUSE__TARGET_VARIABLES:
        getTargetVariables().clear();
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
      case PlSqlPackage.FETCH_STATEMENT_INTO_CLAUSE__TARGET_VARIABLES:
        return targetVariables != null && !targetVariables.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FetchStatementIntoClauseImpl
