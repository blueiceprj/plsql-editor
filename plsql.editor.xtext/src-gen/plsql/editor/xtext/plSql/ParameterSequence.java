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
 * A representation of the model object '<em><b>Parameter Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.ParameterSequence#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see plsql.editor.xtext.plSql.PlSqlPackage#getParameterSequence()
 * @model
 * @generated
 */
public interface ParameterSequence extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link plsql.editor.xtext.plSql.ParameterDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getParameterSequence_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<ParameterDeclaration> getParameters();

} // ParameterSequence
