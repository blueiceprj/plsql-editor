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
import plsql.editor.xtext.plSql.PragmaRestrictReferences;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pragma Restrict References</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.impl.PragmaRestrictReferencesImpl#getRestrictions <em>Restrictions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PragmaRestrictReferencesImpl extends PragmaImpl implements PragmaRestrictReferences
{
  /**
   * The cached value of the '{@link #getRestrictions() <em>Restrictions</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRestrictions()
   * @generated
   * @ordered
   */
  protected EList<String> restrictions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PragmaRestrictReferencesImpl()
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
    return PlSqlPackage.Literals.PRAGMA_RESTRICT_REFERENCES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getRestrictions()
  {
    if (restrictions == null)
    {
      restrictions = new EDataTypeEList<String>(String.class, this, PlSqlPackage.PRAGMA_RESTRICT_REFERENCES__RESTRICTIONS);
    }
    return restrictions;
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
      case PlSqlPackage.PRAGMA_RESTRICT_REFERENCES__RESTRICTIONS:
        return getRestrictions();
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
      case PlSqlPackage.PRAGMA_RESTRICT_REFERENCES__RESTRICTIONS:
        getRestrictions().clear();
        getRestrictions().addAll((Collection<? extends String>)newValue);
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
      case PlSqlPackage.PRAGMA_RESTRICT_REFERENCES__RESTRICTIONS:
        getRestrictions().clear();
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
      case PlSqlPackage.PRAGMA_RESTRICT_REFERENCES__RESTRICTIONS:
        return restrictions != null && !restrictions.isEmpty();
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
    result.append(" (restrictions: ");
    result.append(restrictions);
    result.append(')');
    return result.toString();
  }

} //PragmaRestrictReferencesImpl
