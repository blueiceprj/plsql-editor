/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pragma Restrict References</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.PragmaRestrictReferences#getRestrictions <em>Restrictions</em>}</li>
 * </ul>
 * </p>
 *
 * @see plsql.editor.xtext.plSql.PlSqlPackage#getPragmaRestrictReferences()
 * @model
 * @generated
 */
public interface PragmaRestrictReferences extends Pragma
{
  /**
   * Returns the value of the '<em><b>Restrictions</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Restrictions</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Restrictions</em>' attribute list.
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getPragmaRestrictReferences_Restrictions()
   * @model unique="false"
   * @generated
   */
  EList<String> getRestrictions();

} // PragmaRestrictReferences
