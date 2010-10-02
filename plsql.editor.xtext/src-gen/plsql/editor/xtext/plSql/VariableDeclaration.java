/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.VariableDeclaration#isIsConstant <em>Is Constant</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.VariableDeclaration#getDataType <em>Data Type</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.VariableDeclaration#isIsNotNull <em>Is Not Null</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.VariableDeclaration#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see plsql.editor.xtext.plSql.PlSqlPackage#getVariableDeclaration()
 * @model
 * @generated
 */
public interface VariableDeclaration extends ItemDeclaration, NameDeclaration
{
  /**
   * Returns the value of the '<em><b>Is Constant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Constant</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Constant</em>' attribute.
   * @see #setIsConstant(boolean)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getVariableDeclaration_IsConstant()
   * @model
   * @generated
   */
  boolean isIsConstant();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.VariableDeclaration#isIsConstant <em>Is Constant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Constant</em>' attribute.
   * @see #isIsConstant()
   * @generated
   */
  void setIsConstant(boolean value);

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
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getVariableDeclaration_DataType()
   * @model
   * @generated
   */
  String getDataType();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.VariableDeclaration#getDataType <em>Data Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Type</em>' attribute.
   * @see #getDataType()
   * @generated
   */
  void setDataType(String value);

  /**
   * Returns the value of the '<em><b>Is Not Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Not Null</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Not Null</em>' attribute.
   * @see #setIsNotNull(boolean)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getVariableDeclaration_IsNotNull()
   * @model
   * @generated
   */
  boolean isIsNotNull();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.VariableDeclaration#isIsNotNull <em>Is Not Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Not Null</em>' attribute.
   * @see #isIsNotNull()
   * @generated
   */
  void setIsNotNull(boolean value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(VariableValue)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getVariableDeclaration_Value()
   * @model containment="true"
   * @generated
   */
  VariableValue getValue();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.VariableDeclaration#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(VariableValue value);

} // VariableDeclaration
