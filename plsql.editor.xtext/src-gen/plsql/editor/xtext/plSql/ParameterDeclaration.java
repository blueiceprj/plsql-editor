/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.ParameterDeclaration#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.ParameterDeclaration#getDataType <em>Data Type</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.ParameterDeclaration#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see plsql.editor.xtext.plSql.PlSqlPackage#getParameterDeclaration()
 * @model
 * @generated
 */
public interface ParameterDeclaration extends NameDeclaration
{
  /**
   * Returns the value of the '<em><b>Behavior</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Behavior</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behavior</em>' attribute.
   * @see #setBehavior(String)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getParameterDeclaration_Behavior()
   * @model
   * @generated
   */
  String getBehavior();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.ParameterDeclaration#getBehavior <em>Behavior</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Behavior</em>' attribute.
   * @see #getBehavior()
   * @generated
   */
  void setBehavior(String value);

  /**
   * Returns the value of the '<em><b>Data Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Type</em>' attribute.
   * @see #setDataType(String)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getParameterDeclaration_DataType()
   * @model
   * @generated
   */
  String getDataType();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.ParameterDeclaration#getDataType <em>Data Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Type</em>' attribute.
   * @see #getDataType()
   * @generated
   */
  void setDataType(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(ParameterValue)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getParameterDeclaration_Value()
   * @model containment="true"
   * @generated
   */
  ParameterValue getValue();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.ParameterDeclaration#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ParameterValue value);

} // ParameterDeclaration
