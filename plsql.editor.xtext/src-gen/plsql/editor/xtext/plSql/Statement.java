/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.Statement#getLabels <em>Labels</em>}</li>
 * </ul>
 * </p>
 *
 * @see plsql.editor.xtext.plSql.PlSqlPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
   * The list contents are of type {@link plsql.editor.xtext.plSql.Label}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Labels</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Labels</em>' containment reference list.
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getStatement_Labels()
   * @model containment="true"
   * @generated
   */
  EList<Label> getLabels();

} // Statement
