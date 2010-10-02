/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Invoker Right</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see plsql.editor.xtext.plSql.PlSqlPackage#getInvokerRight()
 * @model
 * @generated
 */
public enum InvokerRight implements Enumerator
{
  /**
   * The '<em><b>CURRENT USER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CURRENT_USER_VALUE
   * @generated
   * @ordered
   */
  CURRENT_USER(0, "CURRENT_USER", "CURRENT_USER"),

  /**
   * The '<em><b>DEFINER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEFINER_VALUE
   * @generated
   * @ordered
   */
  DEFINER(1, "DEFINER", "DEFINER");

  /**
   * The '<em><b>CURRENT USER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CURRENT USER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CURRENT_USER
   * @model
   * @generated
   * @ordered
   */
  public static final int CURRENT_USER_VALUE = 0;

  /**
   * The '<em><b>DEFINER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DEFINER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DEFINER
   * @model
   * @generated
   * @ordered
   */
  public static final int DEFINER_VALUE = 1;

  /**
   * An array of all the '<em><b>Invoker Right</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final InvokerRight[] VALUES_ARRAY =
    new InvokerRight[]
    {
      CURRENT_USER,
      DEFINER,
    };

  /**
   * A public read-only list of all the '<em><b>Invoker Right</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<InvokerRight> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Invoker Right</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static InvokerRight get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      InvokerRight result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Invoker Right</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static InvokerRight getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      InvokerRight result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Invoker Right</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static InvokerRight get(int value)
  {
    switch (value)
    {
      case CURRENT_USER_VALUE: return CURRENT_USER;
      case DEFINER_VALUE: return DEFINER;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private InvokerRight(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //InvokerRight
