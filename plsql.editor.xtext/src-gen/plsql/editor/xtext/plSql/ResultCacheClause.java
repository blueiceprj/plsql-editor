/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Cache Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.ResultCacheClause#getDataSources <em>Data Sources</em>}</li>
 * </ul>
 * </p>
 *
 * @see plsql.editor.xtext.plSql.PlSqlPackage#getResultCacheClause()
 * @model
 * @generated
 */
public interface ResultCacheClause extends FunctionClause
{
  /**
   * Returns the value of the '<em><b>Data Sources</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Sources</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Sources</em>' attribute list.
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getResultCacheClause_DataSources()
   * @model unique="false"
   * @generated
   */
  EList<String> getDataSources();

} // ResultCacheClause
