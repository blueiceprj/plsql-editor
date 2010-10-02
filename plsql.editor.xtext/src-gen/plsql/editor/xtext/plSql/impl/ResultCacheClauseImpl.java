/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import plsql.editor.xtext.plSql.PlSqlPackage;
import plsql.editor.xtext.plSql.ResultCacheClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Cache Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.impl.ResultCacheClauseImpl#getDataSources <em>Data Sources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultCacheClauseImpl extends FunctionClauseImpl implements ResultCacheClause
{
  /**
   * The cached value of the '{@link #getDataSources() <em>Data Sources</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataSources()
   * @generated
   * @ordered
   */
  protected EList<String> dataSources;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ResultCacheClauseImpl()
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
    return PlSqlPackage.Literals.RESULT_CACHE_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDataSources()
  {
    if (dataSources == null)
    {
      dataSources = new EDataTypeEList<String>(String.class, this, PlSqlPackage.RESULT_CACHE_CLAUSE__DATA_SOURCES);
    }
    return dataSources;
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
      case PlSqlPackage.RESULT_CACHE_CLAUSE__DATA_SOURCES:
        return getDataSources();
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
      case PlSqlPackage.RESULT_CACHE_CLAUSE__DATA_SOURCES:
        getDataSources().clear();
        getDataSources().addAll((Collection<? extends String>)newValue);
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
      case PlSqlPackage.RESULT_CACHE_CLAUSE__DATA_SOURCES:
        getDataSources().clear();
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
      case PlSqlPackage.RESULT_CACHE_CLAUSE__DATA_SOURCES:
        return dataSources != null && !dataSources.isEmpty();
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
    result.append(" (dataSources: ");
    result.append(dataSources);
    result.append(')');
    return result.toString();
  }

} //ResultCacheClauseImpl
