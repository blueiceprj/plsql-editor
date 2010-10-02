/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql.impl;

import org.eclipse.emf.ecore.EClass;

import plsql.editor.xtext.plSql.DeterministicClause;
import plsql.editor.xtext.plSql.PlSqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deterministic Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DeterministicClauseImpl extends FunctionClauseImpl implements DeterministicClause
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeterministicClauseImpl()
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
    return PlSqlPackage.Literals.DETERMINISTIC_CLAUSE;
  }

} //DeterministicClauseImpl
