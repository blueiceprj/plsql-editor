/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see plsql.editor.xtext.plSql.PlSqlFactory
 * @model kind="package"
 * @generated
 */
public interface PlSqlPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "plSql";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.editor.plsql/xtext/PlSql";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "plSql";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PlSqlPackage eINSTANCE = plsql.editor.xtext.plSql.impl.PlSqlPackageImpl.init();

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.CompilationUnitImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getCompilationUnit()
   * @generated
   */
  int COMPILATION_UNIT = 0;

  /**
   * The number of structural features of the '<em>Compilation Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.ProcedureImpl <em>Procedure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.ProcedureImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getProcedure()
   * @generated
   */
  int PROCEDURE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__NAME = COMPILATION_UNIT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Schema Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__SCHEMA_NAME = COMPILATION_UNIT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__PARAMETERS = COMPILATION_UNIT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Invoker Rights</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__INVOKER_RIGHTS = COMPILATION_UNIT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__CONTENT = COMPILATION_UNIT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Procedure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_FEATURE_COUNT = COMPILATION_UNIT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.PackageImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__NAME = COMPILATION_UNIT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Schema Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__SCHEMA_NAME = COMPILATION_UNIT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Invoker Rights</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__INVOKER_RIGHTS = COMPILATION_UNIT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__ITEMS = COMPILATION_UNIT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>End Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__END_NAME = COMPILATION_UNIT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = COMPILATION_UNIT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.ItemImpl <em>Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.ItemImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getItem()
   * @generated
   */
  int ITEM = 24;

  /**
   * The number of structural features of the '<em>Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.ProcedureDeclarationImpl <em>Procedure Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.ProcedureDeclarationImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getProcedureDeclaration()
   * @generated
   */
  int PROCEDURE_DECLARATION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_DECLARATION__NAME = ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_DECLARATION__PARAMETERS = ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Procedure Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_DECLARATION_FEATURE_COUNT = ITEM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.ProcedureDefinitionImpl <em>Procedure Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.ProcedureDefinitionImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getProcedureDefinition()
   * @generated
   */
  int PROCEDURE_DEFINITION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_DEFINITION__NAME = ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_DEFINITION__PARAMETERS = ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Implementation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_DEFINITION__IMPLEMENTATION = ITEM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Procedure Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_DEFINITION_FEATURE_COUNT = ITEM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.FunctionImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = COMPILATION_UNIT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Schema Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__SCHEMA_NAME = COMPILATION_UNIT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__PARAMETERS = COMPILATION_UNIT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__RETURN_TYPE = COMPILATION_UNIT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Function Clauses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__FUNCTION_CLAUSES = COMPILATION_UNIT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__CONTENT = COMPILATION_UNIT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = COMPILATION_UNIT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.ParameterSequenceImpl <em>Parameter Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.ParameterSequenceImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getParameterSequence()
   * @generated
   */
  int PARAMETER_SEQUENCE = 6;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_SEQUENCE__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>Parameter Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_SEQUENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.NameDeclarationImpl <em>Name Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.NameDeclarationImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getNameDeclaration()
   * @generated
   */
  int NAME_DECLARATION = 66;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Name Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.ParameterDeclarationImpl <em>Parameter Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.ParameterDeclarationImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getParameterDeclaration()
   * @generated
   */
  int PARAMETER_DECLARATION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION__NAME = NAME_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Behavior</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION__BEHAVIOR = NAME_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Data Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION__DATA_TYPE = NAME_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION__VALUE = NAME_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Parameter Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION_FEATURE_COUNT = NAME_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.ParameterValueImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getParameterValue()
   * @generated
   */
  int PARAMETER_VALUE = 8;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_VALUE__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Parameter Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.ProcedureInvokerRightsClauseImpl <em>Procedure Invoker Rights Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.ProcedureInvokerRightsClauseImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getProcedureInvokerRightsClause()
   * @generated
   */
  int PROCEDURE_INVOKER_RIGHTS_CLAUSE = 9;

  /**
   * The feature id for the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_INVOKER_RIGHTS_CLAUSE__RIGHT = 0;

  /**
   * The number of structural features of the '<em>Procedure Invoker Rights Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_INVOKER_RIGHTS_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.FunctionClauseImpl <em>Function Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.FunctionClauseImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getFunctionClause()
   * @generated
   */
  int FUNCTION_CLAUSE = 18;

  /**
   * The number of structural features of the '<em>Function Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CLAUSE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.FunctionInvokerRightsClauseImpl <em>Function Invoker Rights Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.FunctionInvokerRightsClauseImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getFunctionInvokerRightsClause()
   * @generated
   */
  int FUNCTION_INVOKER_RIGHTS_CLAUSE = 10;

  /**
   * The feature id for the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_INVOKER_RIGHTS_CLAUSE__RIGHT = FUNCTION_CLAUSE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Function Invoker Rights Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_INVOKER_RIGHTS_CLAUSE_FEATURE_COUNT = FUNCTION_CLAUSE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.PragmaImpl <em>Pragma</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.PragmaImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getPragma()
   * @generated
   */
  int PRAGMA = 11;

  /**
   * The number of structural features of the '<em>Pragma</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRAGMA_FEATURE_COUNT = ITEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.PragmaRestrictReferencesImpl <em>Pragma Restrict References</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.PragmaRestrictReferencesImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getPragmaRestrictReferences()
   * @generated
   */
  int PRAGMA_RESTRICT_REFERENCES = 12;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRAGMA_RESTRICT_REFERENCES__RESTRICTIONS = PRAGMA_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pragma Restrict References</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRAGMA_RESTRICT_REFERENCES_FEATURE_COUNT = PRAGMA_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.PragmaTimestampImpl <em>Pragma Timestamp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.PragmaTimestampImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getPragmaTimestamp()
   * @generated
   */
  int PRAGMA_TIMESTAMP = 13;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRAGMA_TIMESTAMP__TIMESTAMP = PRAGMA_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pragma Timestamp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRAGMA_TIMESTAMP_FEATURE_COUNT = PRAGMA_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.ProcedureContentImpl <em>Procedure Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.ProcedureContentImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getProcedureContent()
   * @generated
   */
  int PROCEDURE_CONTENT = 14;

  /**
   * The number of structural features of the '<em>Procedure Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_CONTENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.ProcedureImplementationImpl <em>Procedure Implementation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.ProcedureImplementationImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getProcedureImplementation()
   * @generated
   */
  int PROCEDURE_IMPLEMENTATION = 15;

  /**
   * The feature id for the '<em><b>Declare Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_IMPLEMENTATION__DECLARE_SECTION = PROCEDURE_CONTENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_IMPLEMENTATION__BODY = PROCEDURE_CONTENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Procedure Implementation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_IMPLEMENTATION_FEATURE_COUNT = PROCEDURE_CONTENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.FunctionContentImpl <em>Function Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.FunctionContentImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getFunctionContent()
   * @generated
   */
  int FUNCTION_CONTENT = 16;

  /**
   * The number of structural features of the '<em>Function Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CONTENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.FunctionImplementationImpl <em>Function Implementation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.FunctionImplementationImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getFunctionImplementation()
   * @generated
   */
  int FUNCTION_IMPLEMENTATION = 17;

  /**
   * The feature id for the '<em><b>Declare Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_IMPLEMENTATION__DECLARE_SECTION = FUNCTION_CONTENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_IMPLEMENTATION__BODY = FUNCTION_CONTENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Implementation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_IMPLEMENTATION_FEATURE_COUNT = FUNCTION_CONTENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.DeterministicClauseImpl <em>Deterministic Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.DeterministicClauseImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getDeterministicClause()
   * @generated
   */
  int DETERMINISTIC_CLAUSE = 19;

  /**
   * The number of structural features of the '<em>Deterministic Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETERMINISTIC_CLAUSE_FEATURE_COUNT = FUNCTION_CLAUSE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.ResultCacheClauseImpl <em>Result Cache Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.ResultCacheClauseImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getResultCacheClause()
   * @generated
   */
  int RESULT_CACHE_CLAUSE = 20;

  /**
   * The feature id for the '<em><b>Data Sources</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_CACHE_CLAUSE__DATA_SOURCES = FUNCTION_CLAUSE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Result Cache Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_CACHE_CLAUSE_FEATURE_COUNT = FUNCTION_CLAUSE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.PipelinedClauseImpl <em>Pipelined Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.PipelinedClauseImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getPipelinedClause()
   * @generated
   */
  int PIPELINED_CLAUSE = 21;

  /**
   * The number of structural features of the '<em>Pipelined Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIPELINED_CLAUSE_FEATURE_COUNT = FUNCTION_CLAUSE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.StatementBodyImpl <em>Statement Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.StatementBodyImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getStatementBody()
   * @generated
   */
  int STATEMENT_BODY = 22;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BODY__STATEMENTS = 0;

  /**
   * The feature id for the '<em><b>End Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BODY__END_NAME = 1;

  /**
   * The number of structural features of the '<em>Statement Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BODY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.DeclareSectionImpl <em>Declare Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.DeclareSectionImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getDeclareSection()
   * @generated
   */
  int DECLARE_SECTION = 23;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARE_SECTION__ITEMS = 0;

  /**
   * The number of structural features of the '<em>Declare Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARE_SECTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.ItemDeclarationImpl <em>Item Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.ItemDeclarationImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getItemDeclaration()
   * @generated
   */
  int ITEM_DECLARATION = 25;

  /**
   * The number of structural features of the '<em>Item Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_DECLARATION_FEATURE_COUNT = ITEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.ExternalProcedureDeclarationImpl <em>External Procedure Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.ExternalProcedureDeclarationImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getExternalProcedureDeclaration()
   * @generated
   */
  int EXTERNAL_PROCEDURE_DECLARATION = 26;

  /**
   * The number of structural features of the '<em>External Procedure Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_PROCEDURE_DECLARATION_FEATURE_COUNT = PROCEDURE_CONTENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.VariableDeclarationImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__NAME = ITEM_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Constant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__IS_CONSTANT = ITEM_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Data Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__DATA_TYPE = ITEM_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Is Not Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__IS_NOT_NULL = ITEM_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__VALUE = ITEM_DECLARATION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = ITEM_DECLARATION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.VariableValueImpl <em>Variable Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.VariableValueImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getVariableValue()
   * @generated
   */
  int VARIABLE_VALUE = 28;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_VALUE__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Variable Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.ExpressionImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 29;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.IntLiteralExpressionImpl <em>Int Literal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.IntLiteralExpressionImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getIntLiteralExpression()
   * @generated
   */
  int INT_LITERAL_EXPRESSION = 30;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL_EXPRESSION__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Literal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.StringLiteralExpressionImpl <em>String Literal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.StringLiteralExpressionImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getStringLiteralExpression()
   * @generated
   */
  int STRING_LITERAL_EXPRESSION = 31;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_EXPRESSION__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.BooleanLiteralExpressionImpl <em>Boolean Literal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.BooleanLiteralExpressionImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getBooleanLiteralExpression()
   * @generated
   */
  int BOOLEAN_LITERAL_EXPRESSION = 32;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_EXPRESSION__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Literal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.NullLiteralExpressionImpl <em>Null Literal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.NullLiteralExpressionImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getNullLiteralExpression()
   * @generated
   */
  int NULL_LITERAL_EXPRESSION = 33;

  /**
   * The number of structural features of the '<em>Null Literal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.VariableRefExpressionImpl <em>Variable Ref Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.VariableRefExpressionImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getVariableRefExpression()
   * @generated
   */
  int VARIABLE_REF_EXPRESSION = 34;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REF_EXPRESSION__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Ref Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REF_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.StatementImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 35;

  /**
   * The feature id for the '<em><b>Labels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__LABELS = 0;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.LabelImpl <em>Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.LabelImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getLabel()
   * @generated
   */
  int LABEL = 36;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__NAME = 0;

  /**
   * The number of structural features of the '<em>Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.AssignmentStatementImpl <em>Assignment Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.AssignmentStatementImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getAssignmentStatement()
   * @generated
   */
  int ASSIGNMENT_STATEMENT = 37;

  /**
   * The feature id for the '<em><b>Labels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_STATEMENT__LABELS = STATEMENT__LABELS;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_STATEMENT__TARGET = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assignment Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.AssignmentTargetImpl <em>Assignment Target</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.AssignmentTargetImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getAssignmentTarget()
   * @generated
   */
  int ASSIGNMENT_TARGET = 38;

  /**
   * The number of structural features of the '<em>Assignment Target</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_TARGET_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.VariableAssignmentTargetImpl <em>Variable Assignment Target</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.VariableAssignmentTargetImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getVariableAssignmentTarget()
   * @generated
   */
  int VARIABLE_ASSIGNMENT_TARGET = 39;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGNMENT_TARGET__VARIABLE = ASSIGNMENT_TARGET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Assignment Target</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGNMENT_TARGET_FEATURE_COUNT = ASSIGNMENT_TARGET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.BlockStatementImpl <em>Block Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.BlockStatementImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getBlockStatement()
   * @generated
   */
  int BLOCK_STATEMENT = 40;

  /**
   * The feature id for the '<em><b>Labels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_STATEMENT__LABELS = STATEMENT__LABELS;

  /**
   * The feature id for the '<em><b>Declare Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_STATEMENT__DECLARE_SECTION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Block Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.CaseStatementImpl <em>Case Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.CaseStatementImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getCaseStatement()
   * @generated
   */
  int CASE_STATEMENT = 41;

  /**
   * The feature id for the '<em><b>Labels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT__LABELS = STATEMENT__LABELS;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>When Branches</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT__WHEN_BRANCHES = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else Branch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT__ELSE_BRANCH = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>End Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT__END_LABEL = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Case Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.CaseStatementWhenBranchImpl <em>Case Statement When Branch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.CaseStatementWhenBranchImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getCaseStatementWhenBranch()
   * @generated
   */
  int CASE_STATEMENT_WHEN_BRANCH = 42;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT_WHEN_BRANCH__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT_WHEN_BRANCH__STATEMENTS = 1;

  /**
   * The number of structural features of the '<em>Case Statement When Branch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT_WHEN_BRANCH_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.CaseStatementElseBranchImpl <em>Case Statement Else Branch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.CaseStatementElseBranchImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getCaseStatementElseBranch()
   * @generated
   */
  int CASE_STATEMENT_ELSE_BRANCH = 43;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT_ELSE_BRANCH__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Case Statement Else Branch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT_ELSE_BRANCH_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.CloseStatementImpl <em>Close Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.CloseStatementImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getCloseStatement()
   * @generated
   */
  int CLOSE_STATEMENT = 44;

  /**
   * The feature id for the '<em><b>Labels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOSE_STATEMENT__LABELS = STATEMENT__LABELS;

  /**
   * The feature id for the '<em><b>Cursor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOSE_STATEMENT__CURSOR = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Close Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOSE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.ContinueStatementImpl <em>Continue Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.ContinueStatementImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getContinueStatement()
   * @generated
   */
  int CONTINUE_STATEMENT = 45;

  /**
   * The feature id for the '<em><b>Labels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTINUE_STATEMENT__LABELS = STATEMENT__LABELS;

  /**
   * The feature id for the '<em><b>Label Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTINUE_STATEMENT__LABEL_NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>When Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTINUE_STATEMENT__WHEN_EXPRESSION = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Continue Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTINUE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.ExitStatementImpl <em>Exit Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.ExitStatementImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getExitStatement()
   * @generated
   */
  int EXIT_STATEMENT = 46;

  /**
   * The feature id for the '<em><b>Labels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT_STATEMENT__LABELS = STATEMENT__LABELS;

  /**
   * The feature id for the '<em><b>Label Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT_STATEMENT__LABEL_NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>When Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT_STATEMENT__WHEN_EXPRESSION = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Exit Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.FetchStatementImpl <em>Fetch Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.FetchStatementImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getFetchStatement()
   * @generated
   */
  int FETCH_STATEMENT = 47;

  /**
   * The feature id for the '<em><b>Labels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FETCH_STATEMENT__LABELS = STATEMENT__LABELS;

  /**
   * The feature id for the '<em><b>Cursor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FETCH_STATEMENT__CURSOR = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Into Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FETCH_STATEMENT__INTO_CLAUSE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Fetch Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FETCH_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.FetchStatementIntoClauseImpl <em>Fetch Statement Into Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.FetchStatementIntoClauseImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getFetchStatementIntoClause()
   * @generated
   */
  int FETCH_STATEMENT_INTO_CLAUSE = 48;

  /**
   * The feature id for the '<em><b>Target Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FETCH_STATEMENT_INTO_CLAUSE__TARGET_VARIABLES = 0;

  /**
   * The number of structural features of the '<em>Fetch Statement Into Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FETCH_STATEMENT_INTO_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.FetchStatementSingleIntoClauseImpl <em>Fetch Statement Single Into Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.FetchStatementSingleIntoClauseImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getFetchStatementSingleIntoClause()
   * @generated
   */
  int FETCH_STATEMENT_SINGLE_INTO_CLAUSE = 49;

  /**
   * The feature id for the '<em><b>Target Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FETCH_STATEMENT_SINGLE_INTO_CLAUSE__TARGET_VARIABLES = FETCH_STATEMENT_INTO_CLAUSE__TARGET_VARIABLES;

  /**
   * The number of structural features of the '<em>Fetch Statement Single Into Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FETCH_STATEMENT_SINGLE_INTO_CLAUSE_FEATURE_COUNT = FETCH_STATEMENT_INTO_CLAUSE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.FetchStatementBulkIntoClauseImpl <em>Fetch Statement Bulk Into Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.FetchStatementBulkIntoClauseImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getFetchStatementBulkIntoClause()
   * @generated
   */
  int FETCH_STATEMENT_BULK_INTO_CLAUSE = 50;

  /**
   * The feature id for the '<em><b>Target Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FETCH_STATEMENT_BULK_INTO_CLAUSE__TARGET_VARIABLES = FETCH_STATEMENT_INTO_CLAUSE__TARGET_VARIABLES;

  /**
   * The feature id for the '<em><b>Limit Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FETCH_STATEMENT_BULK_INTO_CLAUSE__LIMIT_EXPRESSION = FETCH_STATEMENT_INTO_CLAUSE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Fetch Statement Bulk Into Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FETCH_STATEMENT_BULK_INTO_CLAUSE_FEATURE_COUNT = FETCH_STATEMENT_INTO_CLAUSE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.GotoStatementImpl <em>Goto Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.GotoStatementImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getGotoStatement()
   * @generated
   */
  int GOTO_STATEMENT = 51;

  /**
   * The feature id for the '<em><b>Labels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO_STATEMENT__LABELS = STATEMENT__LABELS;

  /**
   * The feature id for the '<em><b>Label Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO_STATEMENT__LABEL_NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Goto Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.IfStatementImpl <em>If Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.IfStatementImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getIfStatement()
   * @generated
   */
  int IF_STATEMENT = 52;

  /**
   * The feature id for the '<em><b>Labels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__LABELS = STATEMENT__LABELS;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__STATEMENTS = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Elsif Branches</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__ELSIF_BRANCHES = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Else Branch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__ELSE_BRANCH = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>If Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.IfStatementElsifBranchImpl <em>If Statement Elsif Branch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.IfStatementElsifBranchImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getIfStatementElsifBranch()
   * @generated
   */
  int IF_STATEMENT_ELSIF_BRANCH = 53;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT_ELSIF_BRANCH__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT_ELSIF_BRANCH__STATEMENTS = 1;

  /**
   * The number of structural features of the '<em>If Statement Elsif Branch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT_ELSIF_BRANCH_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.IfStatementElseBranchImpl <em>If Statement Else Branch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.IfStatementElseBranchImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getIfStatementElseBranch()
   * @generated
   */
  int IF_STATEMENT_ELSE_BRANCH = 54;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT_ELSE_BRANCH__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>If Statement Else Branch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT_ELSE_BRANCH_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.LoopStatementImpl <em>Loop Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.LoopStatementImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getLoopStatement()
   * @generated
   */
  int LOOP_STATEMENT = 55;

  /**
   * The feature id for the '<em><b>Labels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_STATEMENT__LABELS = STATEMENT__LABELS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_STATEMENT__STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>End Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_STATEMENT__END_LABEL = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Loop Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.BasicLoopStatementImpl <em>Basic Loop Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.BasicLoopStatementImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getBasicLoopStatement()
   * @generated
   */
  int BASIC_LOOP_STATEMENT = 56;

  /**
   * The feature id for the '<em><b>Labels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_LOOP_STATEMENT__LABELS = LOOP_STATEMENT__LABELS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_LOOP_STATEMENT__STATEMENTS = LOOP_STATEMENT__STATEMENTS;

  /**
   * The feature id for the '<em><b>End Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_LOOP_STATEMENT__END_LABEL = LOOP_STATEMENT__END_LABEL;

  /**
   * The number of structural features of the '<em>Basic Loop Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_LOOP_STATEMENT_FEATURE_COUNT = LOOP_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.WhileLoopStatementImpl <em>While Loop Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.WhileLoopStatementImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getWhileLoopStatement()
   * @generated
   */
  int WHILE_LOOP_STATEMENT = 57;

  /**
   * The feature id for the '<em><b>Labels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_LOOP_STATEMENT__LABELS = LOOP_STATEMENT__LABELS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_LOOP_STATEMENT__STATEMENTS = LOOP_STATEMENT__STATEMENTS;

  /**
   * The feature id for the '<em><b>End Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_LOOP_STATEMENT__END_LABEL = LOOP_STATEMENT__END_LABEL;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_LOOP_STATEMENT__EXPRESSION = LOOP_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>While Loop Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_LOOP_STATEMENT_FEATURE_COUNT = LOOP_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.ForLoopStatementImpl <em>For Loop Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.ForLoopStatementImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getForLoopStatement()
   * @generated
   */
  int FOR_LOOP_STATEMENT = 58;

  /**
   * The feature id for the '<em><b>Labels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP_STATEMENT__LABELS = LOOP_STATEMENT__LABELS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP_STATEMENT__STATEMENTS = LOOP_STATEMENT__STATEMENTS;

  /**
   * The feature id for the '<em><b>End Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP_STATEMENT__END_LABEL = LOOP_STATEMENT__END_LABEL;

  /**
   * The feature id for the '<em><b>Index Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP_STATEMENT__INDEX_VARIABLE = LOOP_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP_STATEMENT__LOWER_BOUND = LOOP_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP_STATEMENT__UPPER_BOUND = LOOP_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>For Loop Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP_STATEMENT_FEATURE_COUNT = LOOP_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.ReturnStatementImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getReturnStatement()
   * @generated
   */
  int RETURN_STATEMENT = 59;

  /**
   * The feature id for the '<em><b>Labels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STATEMENT__LABELS = STATEMENT__LABELS;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Return Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.NullStatementImpl <em>Null Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.NullStatementImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getNullStatement()
   * @generated
   */
  int NULL_STATEMENT = 60;

  /**
   * The feature id for the '<em><b>Labels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_STATEMENT__LABELS = STATEMENT__LABELS;

  /**
   * The number of structural features of the '<em>Null Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.RaiseStatementImpl <em>Raise Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.RaiseStatementImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getRaiseStatement()
   * @generated
   */
  int RAISE_STATEMENT = 61;

  /**
   * The feature id for the '<em><b>Labels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RAISE_STATEMENT__LABELS = STATEMENT__LABELS;

  /**
   * The feature id for the '<em><b>Exception Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RAISE_STATEMENT__EXCEPTION_NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Raise Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RAISE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.VariableRefImpl <em>Variable Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.VariableRefImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getVariableRef()
   * @generated
   */
  int VARIABLE_REF = 62;

  /**
   * The feature id for the '<em><b>Is Host Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REF__IS_HOST_REF = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REF__NAME = 1;

  /**
   * The number of structural features of the '<em>Variable Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.QualifiedNameImpl <em>Qualified Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.QualifiedNameImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getQualifiedName()
   * @generated
   */
  int QUALIFIED_NAME = 63;

  /**
   * The feature id for the '<em><b>Names</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME__NAMES = 0;

  /**
   * The number of structural features of the '<em>Qualified Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.NameImpl <em>Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.NameImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getName_()
   * @generated
   */
  int NAME = 64;

  /**
   * The feature id for the '<em><b>Declaration</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__DECLARATION = 0;

  /**
   * The number of structural features of the '<em>Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.impl.LoopVariableDeclarationImpl <em>Loop Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.impl.LoopVariableDeclarationImpl
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getLoopVariableDeclaration()
   * @generated
   */
  int LOOP_VARIABLE_DECLARATION = 65;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_VARIABLE_DECLARATION__NAME = NAME_DECLARATION__NAME;

  /**
   * The number of structural features of the '<em>Loop Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_VARIABLE_DECLARATION_FEATURE_COUNT = NAME_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link plsql.editor.xtext.plSql.InvokerRight <em>Invoker Right</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see plsql.editor.xtext.plSql.InvokerRight
   * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getInvokerRight()
   * @generated
   */
  int INVOKER_RIGHT = 67;


  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.CompilationUnit <em>Compilation Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compilation Unit</em>'.
   * @see plsql.editor.xtext.plSql.CompilationUnit
   * @generated
   */
  EClass getCompilationUnit();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.Procedure <em>Procedure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure</em>'.
   * @see plsql.editor.xtext.plSql.Procedure
   * @generated
   */
  EClass getProcedure();

  /**
   * Returns the meta object for the attribute '{@link plsql.editor.xtext.plSql.Procedure#getSchemaName <em>Schema Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Schema Name</em>'.
   * @see plsql.editor.xtext.plSql.Procedure#getSchemaName()
   * @see #getProcedure()
   * @generated
   */
  EAttribute getProcedure_SchemaName();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.Procedure#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameters</em>'.
   * @see plsql.editor.xtext.plSql.Procedure#getParameters()
   * @see #getProcedure()
   * @generated
   */
  EReference getProcedure_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.Procedure#getInvokerRights <em>Invoker Rights</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Invoker Rights</em>'.
   * @see plsql.editor.xtext.plSql.Procedure#getInvokerRights()
   * @see #getProcedure()
   * @generated
   */
  EReference getProcedure_InvokerRights();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.Procedure#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Content</em>'.
   * @see plsql.editor.xtext.plSql.Procedure#getContent()
   * @see #getProcedure()
   * @generated
   */
  EReference getProcedure_Content();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see plsql.editor.xtext.plSql.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for the attribute '{@link plsql.editor.xtext.plSql.Package#getSchemaName <em>Schema Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Schema Name</em>'.
   * @see plsql.editor.xtext.plSql.Package#getSchemaName()
   * @see #getPackage()
   * @generated
   */
  EAttribute getPackage_SchemaName();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.Package#getInvokerRights <em>Invoker Rights</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Invoker Rights</em>'.
   * @see plsql.editor.xtext.plSql.Package#getInvokerRights()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_InvokerRights();

  /**
   * Returns the meta object for the containment reference list '{@link plsql.editor.xtext.plSql.Package#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see plsql.editor.xtext.plSql.Package#getItems()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Items();

  /**
   * Returns the meta object for the attribute '{@link plsql.editor.xtext.plSql.Package#getEndName <em>End Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Name</em>'.
   * @see plsql.editor.xtext.plSql.Package#getEndName()
   * @see #getPackage()
   * @generated
   */
  EAttribute getPackage_EndName();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.ProcedureDeclaration <em>Procedure Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure Declaration</em>'.
   * @see plsql.editor.xtext.plSql.ProcedureDeclaration
   * @generated
   */
  EClass getProcedureDeclaration();

  /**
   * Returns the meta object for the attribute '{@link plsql.editor.xtext.plSql.ProcedureDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see plsql.editor.xtext.plSql.ProcedureDeclaration#getName()
   * @see #getProcedureDeclaration()
   * @generated
   */
  EAttribute getProcedureDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.ProcedureDeclaration#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameters</em>'.
   * @see plsql.editor.xtext.plSql.ProcedureDeclaration#getParameters()
   * @see #getProcedureDeclaration()
   * @generated
   */
  EReference getProcedureDeclaration_Parameters();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.ProcedureDefinition <em>Procedure Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure Definition</em>'.
   * @see plsql.editor.xtext.plSql.ProcedureDefinition
   * @generated
   */
  EClass getProcedureDefinition();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.ProcedureDefinition#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameters</em>'.
   * @see plsql.editor.xtext.plSql.ProcedureDefinition#getParameters()
   * @see #getProcedureDefinition()
   * @generated
   */
  EReference getProcedureDefinition_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.ProcedureDefinition#getImplementation <em>Implementation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Implementation</em>'.
   * @see plsql.editor.xtext.plSql.ProcedureDefinition#getImplementation()
   * @see #getProcedureDefinition()
   * @generated
   */
  EReference getProcedureDefinition_Implementation();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see plsql.editor.xtext.plSql.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the attribute '{@link plsql.editor.xtext.plSql.Function#getSchemaName <em>Schema Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Schema Name</em>'.
   * @see plsql.editor.xtext.plSql.Function#getSchemaName()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_SchemaName();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.Function#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameters</em>'.
   * @see plsql.editor.xtext.plSql.Function#getParameters()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Parameters();

  /**
   * Returns the meta object for the attribute '{@link plsql.editor.xtext.plSql.Function#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Return Type</em>'.
   * @see plsql.editor.xtext.plSql.Function#getReturnType()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_ReturnType();

  /**
   * Returns the meta object for the containment reference list '{@link plsql.editor.xtext.plSql.Function#getFunctionClauses <em>Function Clauses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Function Clauses</em>'.
   * @see plsql.editor.xtext.plSql.Function#getFunctionClauses()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_FunctionClauses();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.Function#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Content</em>'.
   * @see plsql.editor.xtext.plSql.Function#getContent()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Content();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.ParameterSequence <em>Parameter Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Sequence</em>'.
   * @see plsql.editor.xtext.plSql.ParameterSequence
   * @generated
   */
  EClass getParameterSequence();

  /**
   * Returns the meta object for the containment reference list '{@link plsql.editor.xtext.plSql.ParameterSequence#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see plsql.editor.xtext.plSql.ParameterSequence#getParameters()
   * @see #getParameterSequence()
   * @generated
   */
  EReference getParameterSequence_Parameters();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.ParameterDeclaration <em>Parameter Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Declaration</em>'.
   * @see plsql.editor.xtext.plSql.ParameterDeclaration
   * @generated
   */
  EClass getParameterDeclaration();

  /**
   * Returns the meta object for the attribute '{@link plsql.editor.xtext.plSql.ParameterDeclaration#getBehavior <em>Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Behavior</em>'.
   * @see plsql.editor.xtext.plSql.ParameterDeclaration#getBehavior()
   * @see #getParameterDeclaration()
   * @generated
   */
  EAttribute getParameterDeclaration_Behavior();

  /**
   * Returns the meta object for the attribute '{@link plsql.editor.xtext.plSql.ParameterDeclaration#getDataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Data Type</em>'.
   * @see plsql.editor.xtext.plSql.ParameterDeclaration#getDataType()
   * @see #getParameterDeclaration()
   * @generated
   */
  EAttribute getParameterDeclaration_DataType();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.ParameterDeclaration#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see plsql.editor.xtext.plSql.ParameterDeclaration#getValue()
   * @see #getParameterDeclaration()
   * @generated
   */
  EReference getParameterDeclaration_Value();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.ParameterValue <em>Parameter Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Value</em>'.
   * @see plsql.editor.xtext.plSql.ParameterValue
   * @generated
   */
  EClass getParameterValue();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.ParameterValue#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see plsql.editor.xtext.plSql.ParameterValue#getExpression()
   * @see #getParameterValue()
   * @generated
   */
  EReference getParameterValue_Expression();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.ProcedureInvokerRightsClause <em>Procedure Invoker Rights Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure Invoker Rights Clause</em>'.
   * @see plsql.editor.xtext.plSql.ProcedureInvokerRightsClause
   * @generated
   */
  EClass getProcedureInvokerRightsClause();

  /**
   * Returns the meta object for the attribute '{@link plsql.editor.xtext.plSql.ProcedureInvokerRightsClause#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right</em>'.
   * @see plsql.editor.xtext.plSql.ProcedureInvokerRightsClause#getRight()
   * @see #getProcedureInvokerRightsClause()
   * @generated
   */
  EAttribute getProcedureInvokerRightsClause_Right();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.FunctionInvokerRightsClause <em>Function Invoker Rights Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Invoker Rights Clause</em>'.
   * @see plsql.editor.xtext.plSql.FunctionInvokerRightsClause
   * @generated
   */
  EClass getFunctionInvokerRightsClause();

  /**
   * Returns the meta object for the attribute '{@link plsql.editor.xtext.plSql.FunctionInvokerRightsClause#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right</em>'.
   * @see plsql.editor.xtext.plSql.FunctionInvokerRightsClause#getRight()
   * @see #getFunctionInvokerRightsClause()
   * @generated
   */
  EAttribute getFunctionInvokerRightsClause_Right();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.Pragma <em>Pragma</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pragma</em>'.
   * @see plsql.editor.xtext.plSql.Pragma
   * @generated
   */
  EClass getPragma();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.PragmaRestrictReferences <em>Pragma Restrict References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pragma Restrict References</em>'.
   * @see plsql.editor.xtext.plSql.PragmaRestrictReferences
   * @generated
   */
  EClass getPragmaRestrictReferences();

  /**
   * Returns the meta object for the attribute list '{@link plsql.editor.xtext.plSql.PragmaRestrictReferences#getRestrictions <em>Restrictions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Restrictions</em>'.
   * @see plsql.editor.xtext.plSql.PragmaRestrictReferences#getRestrictions()
   * @see #getPragmaRestrictReferences()
   * @generated
   */
  EAttribute getPragmaRestrictReferences_Restrictions();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.PragmaTimestamp <em>Pragma Timestamp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pragma Timestamp</em>'.
   * @see plsql.editor.xtext.plSql.PragmaTimestamp
   * @generated
   */
  EClass getPragmaTimestamp();

  /**
   * Returns the meta object for the attribute '{@link plsql.editor.xtext.plSql.PragmaTimestamp#getTimestamp <em>Timestamp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Timestamp</em>'.
   * @see plsql.editor.xtext.plSql.PragmaTimestamp#getTimestamp()
   * @see #getPragmaTimestamp()
   * @generated
   */
  EAttribute getPragmaTimestamp_Timestamp();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.ProcedureContent <em>Procedure Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure Content</em>'.
   * @see plsql.editor.xtext.plSql.ProcedureContent
   * @generated
   */
  EClass getProcedureContent();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.ProcedureImplementation <em>Procedure Implementation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure Implementation</em>'.
   * @see plsql.editor.xtext.plSql.ProcedureImplementation
   * @generated
   */
  EClass getProcedureImplementation();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.ProcedureImplementation#getDeclareSection <em>Declare Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declare Section</em>'.
   * @see plsql.editor.xtext.plSql.ProcedureImplementation#getDeclareSection()
   * @see #getProcedureImplementation()
   * @generated
   */
  EReference getProcedureImplementation_DeclareSection();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.ProcedureImplementation#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see plsql.editor.xtext.plSql.ProcedureImplementation#getBody()
   * @see #getProcedureImplementation()
   * @generated
   */
  EReference getProcedureImplementation_Body();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.FunctionContent <em>Function Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Content</em>'.
   * @see plsql.editor.xtext.plSql.FunctionContent
   * @generated
   */
  EClass getFunctionContent();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.FunctionImplementation <em>Function Implementation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Implementation</em>'.
   * @see plsql.editor.xtext.plSql.FunctionImplementation
   * @generated
   */
  EClass getFunctionImplementation();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.FunctionImplementation#getDeclareSection <em>Declare Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declare Section</em>'.
   * @see plsql.editor.xtext.plSql.FunctionImplementation#getDeclareSection()
   * @see #getFunctionImplementation()
   * @generated
   */
  EReference getFunctionImplementation_DeclareSection();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.FunctionImplementation#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see plsql.editor.xtext.plSql.FunctionImplementation#getBody()
   * @see #getFunctionImplementation()
   * @generated
   */
  EReference getFunctionImplementation_Body();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.FunctionClause <em>Function Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Clause</em>'.
   * @see plsql.editor.xtext.plSql.FunctionClause
   * @generated
   */
  EClass getFunctionClause();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.DeterministicClause <em>Deterministic Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deterministic Clause</em>'.
   * @see plsql.editor.xtext.plSql.DeterministicClause
   * @generated
   */
  EClass getDeterministicClause();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.ResultCacheClause <em>Result Cache Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Result Cache Clause</em>'.
   * @see plsql.editor.xtext.plSql.ResultCacheClause
   * @generated
   */
  EClass getResultCacheClause();

  /**
   * Returns the meta object for the attribute list '{@link plsql.editor.xtext.plSql.ResultCacheClause#getDataSources <em>Data Sources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Data Sources</em>'.
   * @see plsql.editor.xtext.plSql.ResultCacheClause#getDataSources()
   * @see #getResultCacheClause()
   * @generated
   */
  EAttribute getResultCacheClause_DataSources();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.PipelinedClause <em>Pipelined Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pipelined Clause</em>'.
   * @see plsql.editor.xtext.plSql.PipelinedClause
   * @generated
   */
  EClass getPipelinedClause();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.StatementBody <em>Statement Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement Body</em>'.
   * @see plsql.editor.xtext.plSql.StatementBody
   * @generated
   */
  EClass getStatementBody();

  /**
   * Returns the meta object for the containment reference list '{@link plsql.editor.xtext.plSql.StatementBody#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see plsql.editor.xtext.plSql.StatementBody#getStatements()
   * @see #getStatementBody()
   * @generated
   */
  EReference getStatementBody_Statements();

  /**
   * Returns the meta object for the attribute '{@link plsql.editor.xtext.plSql.StatementBody#getEndName <em>End Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Name</em>'.
   * @see plsql.editor.xtext.plSql.StatementBody#getEndName()
   * @see #getStatementBody()
   * @generated
   */
  EAttribute getStatementBody_EndName();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.DeclareSection <em>Declare Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declare Section</em>'.
   * @see plsql.editor.xtext.plSql.DeclareSection
   * @generated
   */
  EClass getDeclareSection();

  /**
   * Returns the meta object for the containment reference list '{@link plsql.editor.xtext.plSql.DeclareSection#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see plsql.editor.xtext.plSql.DeclareSection#getItems()
   * @see #getDeclareSection()
   * @generated
   */
  EReference getDeclareSection_Items();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.Item <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item</em>'.
   * @see plsql.editor.xtext.plSql.Item
   * @generated
   */
  EClass getItem();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.ItemDeclaration <em>Item Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item Declaration</em>'.
   * @see plsql.editor.xtext.plSql.ItemDeclaration
   * @generated
   */
  EClass getItemDeclaration();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.ExternalProcedureDeclaration <em>External Procedure Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Procedure Declaration</em>'.
   * @see plsql.editor.xtext.plSql.ExternalProcedureDeclaration
   * @generated
   */
  EClass getExternalProcedureDeclaration();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration</em>'.
   * @see plsql.editor.xtext.plSql.VariableDeclaration
   * @generated
   */
  EClass getVariableDeclaration();

  /**
   * Returns the meta object for the attribute '{@link plsql.editor.xtext.plSql.VariableDeclaration#isIsConstant <em>Is Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Constant</em>'.
   * @see plsql.editor.xtext.plSql.VariableDeclaration#isIsConstant()
   * @see #getVariableDeclaration()
   * @generated
   */
  EAttribute getVariableDeclaration_IsConstant();

  /**
   * Returns the meta object for the attribute '{@link plsql.editor.xtext.plSql.VariableDeclaration#getDataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Data Type</em>'.
   * @see plsql.editor.xtext.plSql.VariableDeclaration#getDataType()
   * @see #getVariableDeclaration()
   * @generated
   */
  EAttribute getVariableDeclaration_DataType();

  /**
   * Returns the meta object for the attribute '{@link plsql.editor.xtext.plSql.VariableDeclaration#isIsNotNull <em>Is Not Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Not Null</em>'.
   * @see plsql.editor.xtext.plSql.VariableDeclaration#isIsNotNull()
   * @see #getVariableDeclaration()
   * @generated
   */
  EAttribute getVariableDeclaration_IsNotNull();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.VariableDeclaration#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see plsql.editor.xtext.plSql.VariableDeclaration#getValue()
   * @see #getVariableDeclaration()
   * @generated
   */
  EReference getVariableDeclaration_Value();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.VariableValue <em>Variable Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Value</em>'.
   * @see plsql.editor.xtext.plSql.VariableValue
   * @generated
   */
  EClass getVariableValue();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.VariableValue#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see plsql.editor.xtext.plSql.VariableValue#getExpression()
   * @see #getVariableValue()
   * @generated
   */
  EReference getVariableValue_Expression();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see plsql.editor.xtext.plSql.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.IntLiteralExpression <em>Int Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Literal Expression</em>'.
   * @see plsql.editor.xtext.plSql.IntLiteralExpression
   * @generated
   */
  EClass getIntLiteralExpression();

  /**
   * Returns the meta object for the attribute '{@link plsql.editor.xtext.plSql.IntLiteralExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see plsql.editor.xtext.plSql.IntLiteralExpression#getValue()
   * @see #getIntLiteralExpression()
   * @generated
   */
  EAttribute getIntLiteralExpression_Value();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.StringLiteralExpression <em>String Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal Expression</em>'.
   * @see plsql.editor.xtext.plSql.StringLiteralExpression
   * @generated
   */
  EClass getStringLiteralExpression();

  /**
   * Returns the meta object for the attribute '{@link plsql.editor.xtext.plSql.StringLiteralExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see plsql.editor.xtext.plSql.StringLiteralExpression#getValue()
   * @see #getStringLiteralExpression()
   * @generated
   */
  EAttribute getStringLiteralExpression_Value();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.BooleanLiteralExpression <em>Boolean Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal Expression</em>'.
   * @see plsql.editor.xtext.plSql.BooleanLiteralExpression
   * @generated
   */
  EClass getBooleanLiteralExpression();

  /**
   * Returns the meta object for the attribute '{@link plsql.editor.xtext.plSql.BooleanLiteralExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see plsql.editor.xtext.plSql.BooleanLiteralExpression#getValue()
   * @see #getBooleanLiteralExpression()
   * @generated
   */
  EAttribute getBooleanLiteralExpression_Value();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.NullLiteralExpression <em>Null Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null Literal Expression</em>'.
   * @see plsql.editor.xtext.plSql.NullLiteralExpression
   * @generated
   */
  EClass getNullLiteralExpression();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.VariableRefExpression <em>Variable Ref Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Ref Expression</em>'.
   * @see plsql.editor.xtext.plSql.VariableRefExpression
   * @generated
   */
  EClass getVariableRefExpression();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.VariableRefExpression#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see plsql.editor.xtext.plSql.VariableRefExpression#getVariable()
   * @see #getVariableRefExpression()
   * @generated
   */
  EReference getVariableRefExpression_Variable();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see plsql.editor.xtext.plSql.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for the containment reference list '{@link plsql.editor.xtext.plSql.Statement#getLabels <em>Labels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Labels</em>'.
   * @see plsql.editor.xtext.plSql.Statement#getLabels()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Labels();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label</em>'.
   * @see plsql.editor.xtext.plSql.Label
   * @generated
   */
  EClass getLabel();

  /**
   * Returns the meta object for the attribute '{@link plsql.editor.xtext.plSql.Label#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see plsql.editor.xtext.plSql.Label#getName()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Name();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.AssignmentStatement <em>Assignment Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Statement</em>'.
   * @see plsql.editor.xtext.plSql.AssignmentStatement
   * @generated
   */
  EClass getAssignmentStatement();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.AssignmentStatement#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see plsql.editor.xtext.plSql.AssignmentStatement#getTarget()
   * @see #getAssignmentStatement()
   * @generated
   */
  EReference getAssignmentStatement_Target();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.AssignmentStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see plsql.editor.xtext.plSql.AssignmentStatement#getExpression()
   * @see #getAssignmentStatement()
   * @generated
   */
  EReference getAssignmentStatement_Expression();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.AssignmentTarget <em>Assignment Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Target</em>'.
   * @see plsql.editor.xtext.plSql.AssignmentTarget
   * @generated
   */
  EClass getAssignmentTarget();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.VariableAssignmentTarget <em>Variable Assignment Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Assignment Target</em>'.
   * @see plsql.editor.xtext.plSql.VariableAssignmentTarget
   * @generated
   */
  EClass getVariableAssignmentTarget();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.VariableAssignmentTarget#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see plsql.editor.xtext.plSql.VariableAssignmentTarget#getVariable()
   * @see #getVariableAssignmentTarget()
   * @generated
   */
  EReference getVariableAssignmentTarget_Variable();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.BlockStatement <em>Block Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block Statement</em>'.
   * @see plsql.editor.xtext.plSql.BlockStatement
   * @generated
   */
  EClass getBlockStatement();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.BlockStatement#getDeclareSection <em>Declare Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declare Section</em>'.
   * @see plsql.editor.xtext.plSql.BlockStatement#getDeclareSection()
   * @see #getBlockStatement()
   * @generated
   */
  EReference getBlockStatement_DeclareSection();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.BlockStatement#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see plsql.editor.xtext.plSql.BlockStatement#getBody()
   * @see #getBlockStatement()
   * @generated
   */
  EReference getBlockStatement_Body();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.CaseStatement <em>Case Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case Statement</em>'.
   * @see plsql.editor.xtext.plSql.CaseStatement
   * @generated
   */
  EClass getCaseStatement();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.CaseStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see plsql.editor.xtext.plSql.CaseStatement#getExpression()
   * @see #getCaseStatement()
   * @generated
   */
  EReference getCaseStatement_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link plsql.editor.xtext.plSql.CaseStatement#getWhenBranches <em>When Branches</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>When Branches</em>'.
   * @see plsql.editor.xtext.plSql.CaseStatement#getWhenBranches()
   * @see #getCaseStatement()
   * @generated
   */
  EReference getCaseStatement_WhenBranches();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.CaseStatement#getElseBranch <em>Else Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Branch</em>'.
   * @see plsql.editor.xtext.plSql.CaseStatement#getElseBranch()
   * @see #getCaseStatement()
   * @generated
   */
  EReference getCaseStatement_ElseBranch();

  /**
   * Returns the meta object for the attribute '{@link plsql.editor.xtext.plSql.CaseStatement#getEndLabel <em>End Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Label</em>'.
   * @see plsql.editor.xtext.plSql.CaseStatement#getEndLabel()
   * @see #getCaseStatement()
   * @generated
   */
  EAttribute getCaseStatement_EndLabel();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.CaseStatementWhenBranch <em>Case Statement When Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case Statement When Branch</em>'.
   * @see plsql.editor.xtext.plSql.CaseStatementWhenBranch
   * @generated
   */
  EClass getCaseStatementWhenBranch();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.CaseStatementWhenBranch#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see plsql.editor.xtext.plSql.CaseStatementWhenBranch#getExpression()
   * @see #getCaseStatementWhenBranch()
   * @generated
   */
  EReference getCaseStatementWhenBranch_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link plsql.editor.xtext.plSql.CaseStatementWhenBranch#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see plsql.editor.xtext.plSql.CaseStatementWhenBranch#getStatements()
   * @see #getCaseStatementWhenBranch()
   * @generated
   */
  EReference getCaseStatementWhenBranch_Statements();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.CaseStatementElseBranch <em>Case Statement Else Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case Statement Else Branch</em>'.
   * @see plsql.editor.xtext.plSql.CaseStatementElseBranch
   * @generated
   */
  EClass getCaseStatementElseBranch();

  /**
   * Returns the meta object for the containment reference list '{@link plsql.editor.xtext.plSql.CaseStatementElseBranch#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see plsql.editor.xtext.plSql.CaseStatementElseBranch#getStatements()
   * @see #getCaseStatementElseBranch()
   * @generated
   */
  EReference getCaseStatementElseBranch_Statements();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.CloseStatement <em>Close Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Close Statement</em>'.
   * @see plsql.editor.xtext.plSql.CloseStatement
   * @generated
   */
  EClass getCloseStatement();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.CloseStatement#getCursor <em>Cursor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cursor</em>'.
   * @see plsql.editor.xtext.plSql.CloseStatement#getCursor()
   * @see #getCloseStatement()
   * @generated
   */
  EReference getCloseStatement_Cursor();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.ContinueStatement <em>Continue Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Continue Statement</em>'.
   * @see plsql.editor.xtext.plSql.ContinueStatement
   * @generated
   */
  EClass getContinueStatement();

  /**
   * Returns the meta object for the attribute '{@link plsql.editor.xtext.plSql.ContinueStatement#getLabelName <em>Label Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label Name</em>'.
   * @see plsql.editor.xtext.plSql.ContinueStatement#getLabelName()
   * @see #getContinueStatement()
   * @generated
   */
  EAttribute getContinueStatement_LabelName();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.ContinueStatement#getWhenExpression <em>When Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>When Expression</em>'.
   * @see plsql.editor.xtext.plSql.ContinueStatement#getWhenExpression()
   * @see #getContinueStatement()
   * @generated
   */
  EReference getContinueStatement_WhenExpression();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.ExitStatement <em>Exit Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exit Statement</em>'.
   * @see plsql.editor.xtext.plSql.ExitStatement
   * @generated
   */
  EClass getExitStatement();

  /**
   * Returns the meta object for the attribute '{@link plsql.editor.xtext.plSql.ExitStatement#getLabelName <em>Label Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label Name</em>'.
   * @see plsql.editor.xtext.plSql.ExitStatement#getLabelName()
   * @see #getExitStatement()
   * @generated
   */
  EAttribute getExitStatement_LabelName();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.ExitStatement#getWhenExpression <em>When Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>When Expression</em>'.
   * @see plsql.editor.xtext.plSql.ExitStatement#getWhenExpression()
   * @see #getExitStatement()
   * @generated
   */
  EReference getExitStatement_WhenExpression();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.FetchStatement <em>Fetch Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fetch Statement</em>'.
   * @see plsql.editor.xtext.plSql.FetchStatement
   * @generated
   */
  EClass getFetchStatement();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.FetchStatement#getCursor <em>Cursor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cursor</em>'.
   * @see plsql.editor.xtext.plSql.FetchStatement#getCursor()
   * @see #getFetchStatement()
   * @generated
   */
  EReference getFetchStatement_Cursor();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.FetchStatement#getIntoClause <em>Into Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Into Clause</em>'.
   * @see plsql.editor.xtext.plSql.FetchStatement#getIntoClause()
   * @see #getFetchStatement()
   * @generated
   */
  EReference getFetchStatement_IntoClause();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.FetchStatementIntoClause <em>Fetch Statement Into Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fetch Statement Into Clause</em>'.
   * @see plsql.editor.xtext.plSql.FetchStatementIntoClause
   * @generated
   */
  EClass getFetchStatementIntoClause();

  /**
   * Returns the meta object for the containment reference list '{@link plsql.editor.xtext.plSql.FetchStatementIntoClause#getTargetVariables <em>Target Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Target Variables</em>'.
   * @see plsql.editor.xtext.plSql.FetchStatementIntoClause#getTargetVariables()
   * @see #getFetchStatementIntoClause()
   * @generated
   */
  EReference getFetchStatementIntoClause_TargetVariables();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.FetchStatementSingleIntoClause <em>Fetch Statement Single Into Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fetch Statement Single Into Clause</em>'.
   * @see plsql.editor.xtext.plSql.FetchStatementSingleIntoClause
   * @generated
   */
  EClass getFetchStatementSingleIntoClause();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.FetchStatementBulkIntoClause <em>Fetch Statement Bulk Into Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fetch Statement Bulk Into Clause</em>'.
   * @see plsql.editor.xtext.plSql.FetchStatementBulkIntoClause
   * @generated
   */
  EClass getFetchStatementBulkIntoClause();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.FetchStatementBulkIntoClause#getLimitExpression <em>Limit Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Limit Expression</em>'.
   * @see plsql.editor.xtext.plSql.FetchStatementBulkIntoClause#getLimitExpression()
   * @see #getFetchStatementBulkIntoClause()
   * @generated
   */
  EReference getFetchStatementBulkIntoClause_LimitExpression();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.GotoStatement <em>Goto Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goto Statement</em>'.
   * @see plsql.editor.xtext.plSql.GotoStatement
   * @generated
   */
  EClass getGotoStatement();

  /**
   * Returns the meta object for the reference '{@link plsql.editor.xtext.plSql.GotoStatement#getLabelName <em>Label Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Label Name</em>'.
   * @see plsql.editor.xtext.plSql.GotoStatement#getLabelName()
   * @see #getGotoStatement()
   * @generated
   */
  EReference getGotoStatement_LabelName();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.IfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Statement</em>'.
   * @see plsql.editor.xtext.plSql.IfStatement
   * @generated
   */
  EClass getIfStatement();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.IfStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see plsql.editor.xtext.plSql.IfStatement#getExpression()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link plsql.editor.xtext.plSql.IfStatement#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see plsql.editor.xtext.plSql.IfStatement#getStatements()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_Statements();

  /**
   * Returns the meta object for the containment reference list '{@link plsql.editor.xtext.plSql.IfStatement#getElsifBranches <em>Elsif Branches</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elsif Branches</em>'.
   * @see plsql.editor.xtext.plSql.IfStatement#getElsifBranches()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_ElsifBranches();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.IfStatement#getElseBranch <em>Else Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Branch</em>'.
   * @see plsql.editor.xtext.plSql.IfStatement#getElseBranch()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_ElseBranch();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.IfStatementElsifBranch <em>If Statement Elsif Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Statement Elsif Branch</em>'.
   * @see plsql.editor.xtext.plSql.IfStatementElsifBranch
   * @generated
   */
  EClass getIfStatementElsifBranch();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.IfStatementElsifBranch#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see plsql.editor.xtext.plSql.IfStatementElsifBranch#getExpression()
   * @see #getIfStatementElsifBranch()
   * @generated
   */
  EReference getIfStatementElsifBranch_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link plsql.editor.xtext.plSql.IfStatementElsifBranch#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see plsql.editor.xtext.plSql.IfStatementElsifBranch#getStatements()
   * @see #getIfStatementElsifBranch()
   * @generated
   */
  EReference getIfStatementElsifBranch_Statements();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.IfStatementElseBranch <em>If Statement Else Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Statement Else Branch</em>'.
   * @see plsql.editor.xtext.plSql.IfStatementElseBranch
   * @generated
   */
  EClass getIfStatementElseBranch();

  /**
   * Returns the meta object for the containment reference list '{@link plsql.editor.xtext.plSql.IfStatementElseBranch#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see plsql.editor.xtext.plSql.IfStatementElseBranch#getStatements()
   * @see #getIfStatementElseBranch()
   * @generated
   */
  EReference getIfStatementElseBranch_Statements();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.LoopStatement <em>Loop Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop Statement</em>'.
   * @see plsql.editor.xtext.plSql.LoopStatement
   * @generated
   */
  EClass getLoopStatement();

  /**
   * Returns the meta object for the containment reference list '{@link plsql.editor.xtext.plSql.LoopStatement#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see plsql.editor.xtext.plSql.LoopStatement#getStatements()
   * @see #getLoopStatement()
   * @generated
   */
  EReference getLoopStatement_Statements();

  /**
   * Returns the meta object for the attribute '{@link plsql.editor.xtext.plSql.LoopStatement#getEndLabel <em>End Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Label</em>'.
   * @see plsql.editor.xtext.plSql.LoopStatement#getEndLabel()
   * @see #getLoopStatement()
   * @generated
   */
  EAttribute getLoopStatement_EndLabel();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.BasicLoopStatement <em>Basic Loop Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Loop Statement</em>'.
   * @see plsql.editor.xtext.plSql.BasicLoopStatement
   * @generated
   */
  EClass getBasicLoopStatement();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.WhileLoopStatement <em>While Loop Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While Loop Statement</em>'.
   * @see plsql.editor.xtext.plSql.WhileLoopStatement
   * @generated
   */
  EClass getWhileLoopStatement();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.WhileLoopStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see plsql.editor.xtext.plSql.WhileLoopStatement#getExpression()
   * @see #getWhileLoopStatement()
   * @generated
   */
  EReference getWhileLoopStatement_Expression();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.ForLoopStatement <em>For Loop Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Loop Statement</em>'.
   * @see plsql.editor.xtext.plSql.ForLoopStatement
   * @generated
   */
  EClass getForLoopStatement();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.ForLoopStatement#getIndexVariable <em>Index Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index Variable</em>'.
   * @see plsql.editor.xtext.plSql.ForLoopStatement#getIndexVariable()
   * @see #getForLoopStatement()
   * @generated
   */
  EReference getForLoopStatement_IndexVariable();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.ForLoopStatement#getLowerBound <em>Lower Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lower Bound</em>'.
   * @see plsql.editor.xtext.plSql.ForLoopStatement#getLowerBound()
   * @see #getForLoopStatement()
   * @generated
   */
  EReference getForLoopStatement_LowerBound();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.ForLoopStatement#getUpperBound <em>Upper Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Upper Bound</em>'.
   * @see plsql.editor.xtext.plSql.ForLoopStatement#getUpperBound()
   * @see #getForLoopStatement()
   * @generated
   */
  EReference getForLoopStatement_UpperBound();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.ReturnStatement <em>Return Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Statement</em>'.
   * @see plsql.editor.xtext.plSql.ReturnStatement
   * @generated
   */
  EClass getReturnStatement();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.ReturnStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see plsql.editor.xtext.plSql.ReturnStatement#getExpression()
   * @see #getReturnStatement()
   * @generated
   */
  EReference getReturnStatement_Expression();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.NullStatement <em>Null Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null Statement</em>'.
   * @see plsql.editor.xtext.plSql.NullStatement
   * @generated
   */
  EClass getNullStatement();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.RaiseStatement <em>Raise Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Raise Statement</em>'.
   * @see plsql.editor.xtext.plSql.RaiseStatement
   * @generated
   */
  EClass getRaiseStatement();

  /**
   * Returns the meta object for the attribute '{@link plsql.editor.xtext.plSql.RaiseStatement#getExceptionName <em>Exception Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exception Name</em>'.
   * @see plsql.editor.xtext.plSql.RaiseStatement#getExceptionName()
   * @see #getRaiseStatement()
   * @generated
   */
  EAttribute getRaiseStatement_ExceptionName();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.VariableRef <em>Variable Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Ref</em>'.
   * @see plsql.editor.xtext.plSql.VariableRef
   * @generated
   */
  EClass getVariableRef();

  /**
   * Returns the meta object for the attribute '{@link plsql.editor.xtext.plSql.VariableRef#isIsHostRef <em>Is Host Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Host Ref</em>'.
   * @see plsql.editor.xtext.plSql.VariableRef#isIsHostRef()
   * @see #getVariableRef()
   * @generated
   */
  EAttribute getVariableRef_IsHostRef();

  /**
   * Returns the meta object for the containment reference '{@link plsql.editor.xtext.plSql.VariableRef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see plsql.editor.xtext.plSql.VariableRef#getName()
   * @see #getVariableRef()
   * @generated
   */
  EReference getVariableRef_Name();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.QualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified Name</em>'.
   * @see plsql.editor.xtext.plSql.QualifiedName
   * @generated
   */
  EClass getQualifiedName();

  /**
   * Returns the meta object for the containment reference list '{@link plsql.editor.xtext.plSql.QualifiedName#getNames <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Names</em>'.
   * @see plsql.editor.xtext.plSql.QualifiedName#getNames()
   * @see #getQualifiedName()
   * @generated
   */
  EReference getQualifiedName_Names();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.Name <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name</em>'.
   * @see plsql.editor.xtext.plSql.Name
   * @generated
   */
  EClass getName_();

  /**
   * Returns the meta object for the reference '{@link plsql.editor.xtext.plSql.Name#getDeclaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Declaration</em>'.
   * @see plsql.editor.xtext.plSql.Name#getDeclaration()
   * @see #getName_()
   * @generated
   */
  EReference getName_Declaration();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.LoopVariableDeclaration <em>Loop Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop Variable Declaration</em>'.
   * @see plsql.editor.xtext.plSql.LoopVariableDeclaration
   * @generated
   */
  EClass getLoopVariableDeclaration();

  /**
   * Returns the meta object for class '{@link plsql.editor.xtext.plSql.NameDeclaration <em>Name Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name Declaration</em>'.
   * @see plsql.editor.xtext.plSql.NameDeclaration
   * @generated
   */
  EClass getNameDeclaration();

  /**
   * Returns the meta object for the attribute '{@link plsql.editor.xtext.plSql.NameDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see plsql.editor.xtext.plSql.NameDeclaration#getName()
   * @see #getNameDeclaration()
   * @generated
   */
  EAttribute getNameDeclaration_Name();

  /**
   * Returns the meta object for enum '{@link plsql.editor.xtext.plSql.InvokerRight <em>Invoker Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Invoker Right</em>'.
   * @see plsql.editor.xtext.plSql.InvokerRight
   * @generated
   */
  EEnum getInvokerRight();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PlSqlFactory getPlSqlFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.CompilationUnitImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getCompilationUnit()
     * @generated
     */
    EClass COMPILATION_UNIT = eINSTANCE.getCompilationUnit();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.ProcedureImpl <em>Procedure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.ProcedureImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getProcedure()
     * @generated
     */
    EClass PROCEDURE = eINSTANCE.getProcedure();

    /**
     * The meta object literal for the '<em><b>Schema Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE__SCHEMA_NAME = eINSTANCE.getProcedure_SchemaName();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE__PARAMETERS = eINSTANCE.getProcedure_Parameters();

    /**
     * The meta object literal for the '<em><b>Invoker Rights</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE__INVOKER_RIGHTS = eINSTANCE.getProcedure_InvokerRights();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE__CONTENT = eINSTANCE.getProcedure_Content();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.PackageImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getPackage()
     * @generated
     */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
     * The meta object literal for the '<em><b>Schema Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE__SCHEMA_NAME = eINSTANCE.getPackage_SchemaName();

    /**
     * The meta object literal for the '<em><b>Invoker Rights</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__INVOKER_RIGHTS = eINSTANCE.getPackage_InvokerRights();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__ITEMS = eINSTANCE.getPackage_Items();

    /**
     * The meta object literal for the '<em><b>End Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE__END_NAME = eINSTANCE.getPackage_EndName();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.ProcedureDeclarationImpl <em>Procedure Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.ProcedureDeclarationImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getProcedureDeclaration()
     * @generated
     */
    EClass PROCEDURE_DECLARATION = eINSTANCE.getProcedureDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE_DECLARATION__NAME = eINSTANCE.getProcedureDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_DECLARATION__PARAMETERS = eINSTANCE.getProcedureDeclaration_Parameters();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.ProcedureDefinitionImpl <em>Procedure Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.ProcedureDefinitionImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getProcedureDefinition()
     * @generated
     */
    EClass PROCEDURE_DEFINITION = eINSTANCE.getProcedureDefinition();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_DEFINITION__PARAMETERS = eINSTANCE.getProcedureDefinition_Parameters();

    /**
     * The meta object literal for the '<em><b>Implementation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_DEFINITION__IMPLEMENTATION = eINSTANCE.getProcedureDefinition_Implementation();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.FunctionImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Schema Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__SCHEMA_NAME = eINSTANCE.getFunction_SchemaName();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__PARAMETERS = eINSTANCE.getFunction_Parameters();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__RETURN_TYPE = eINSTANCE.getFunction_ReturnType();

    /**
     * The meta object literal for the '<em><b>Function Clauses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__FUNCTION_CLAUSES = eINSTANCE.getFunction_FunctionClauses();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__CONTENT = eINSTANCE.getFunction_Content();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.ParameterSequenceImpl <em>Parameter Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.ParameterSequenceImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getParameterSequence()
     * @generated
     */
    EClass PARAMETER_SEQUENCE = eINSTANCE.getParameterSequence();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_SEQUENCE__PARAMETERS = eINSTANCE.getParameterSequence_Parameters();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.ParameterDeclarationImpl <em>Parameter Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.ParameterDeclarationImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getParameterDeclaration()
     * @generated
     */
    EClass PARAMETER_DECLARATION = eINSTANCE.getParameterDeclaration();

    /**
     * The meta object literal for the '<em><b>Behavior</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_DECLARATION__BEHAVIOR = eINSTANCE.getParameterDeclaration_Behavior();

    /**
     * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_DECLARATION__DATA_TYPE = eINSTANCE.getParameterDeclaration_DataType();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_DECLARATION__VALUE = eINSTANCE.getParameterDeclaration_Value();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.ParameterValueImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getParameterValue()
     * @generated
     */
    EClass PARAMETER_VALUE = eINSTANCE.getParameterValue();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_VALUE__EXPRESSION = eINSTANCE.getParameterValue_Expression();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.ProcedureInvokerRightsClauseImpl <em>Procedure Invoker Rights Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.ProcedureInvokerRightsClauseImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getProcedureInvokerRightsClause()
     * @generated
     */
    EClass PROCEDURE_INVOKER_RIGHTS_CLAUSE = eINSTANCE.getProcedureInvokerRightsClause();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE_INVOKER_RIGHTS_CLAUSE__RIGHT = eINSTANCE.getProcedureInvokerRightsClause_Right();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.FunctionInvokerRightsClauseImpl <em>Function Invoker Rights Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.FunctionInvokerRightsClauseImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getFunctionInvokerRightsClause()
     * @generated
     */
    EClass FUNCTION_INVOKER_RIGHTS_CLAUSE = eINSTANCE.getFunctionInvokerRightsClause();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_INVOKER_RIGHTS_CLAUSE__RIGHT = eINSTANCE.getFunctionInvokerRightsClause_Right();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.PragmaImpl <em>Pragma</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.PragmaImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getPragma()
     * @generated
     */
    EClass PRAGMA = eINSTANCE.getPragma();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.PragmaRestrictReferencesImpl <em>Pragma Restrict References</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.PragmaRestrictReferencesImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getPragmaRestrictReferences()
     * @generated
     */
    EClass PRAGMA_RESTRICT_REFERENCES = eINSTANCE.getPragmaRestrictReferences();

    /**
     * The meta object literal for the '<em><b>Restrictions</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRAGMA_RESTRICT_REFERENCES__RESTRICTIONS = eINSTANCE.getPragmaRestrictReferences_Restrictions();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.PragmaTimestampImpl <em>Pragma Timestamp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.PragmaTimestampImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getPragmaTimestamp()
     * @generated
     */
    EClass PRAGMA_TIMESTAMP = eINSTANCE.getPragmaTimestamp();

    /**
     * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRAGMA_TIMESTAMP__TIMESTAMP = eINSTANCE.getPragmaTimestamp_Timestamp();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.ProcedureContentImpl <em>Procedure Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.ProcedureContentImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getProcedureContent()
     * @generated
     */
    EClass PROCEDURE_CONTENT = eINSTANCE.getProcedureContent();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.ProcedureImplementationImpl <em>Procedure Implementation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.ProcedureImplementationImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getProcedureImplementation()
     * @generated
     */
    EClass PROCEDURE_IMPLEMENTATION = eINSTANCE.getProcedureImplementation();

    /**
     * The meta object literal for the '<em><b>Declare Section</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_IMPLEMENTATION__DECLARE_SECTION = eINSTANCE.getProcedureImplementation_DeclareSection();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_IMPLEMENTATION__BODY = eINSTANCE.getProcedureImplementation_Body();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.FunctionContentImpl <em>Function Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.FunctionContentImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getFunctionContent()
     * @generated
     */
    EClass FUNCTION_CONTENT = eINSTANCE.getFunctionContent();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.FunctionImplementationImpl <em>Function Implementation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.FunctionImplementationImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getFunctionImplementation()
     * @generated
     */
    EClass FUNCTION_IMPLEMENTATION = eINSTANCE.getFunctionImplementation();

    /**
     * The meta object literal for the '<em><b>Declare Section</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_IMPLEMENTATION__DECLARE_SECTION = eINSTANCE.getFunctionImplementation_DeclareSection();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_IMPLEMENTATION__BODY = eINSTANCE.getFunctionImplementation_Body();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.FunctionClauseImpl <em>Function Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.FunctionClauseImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getFunctionClause()
     * @generated
     */
    EClass FUNCTION_CLAUSE = eINSTANCE.getFunctionClause();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.DeterministicClauseImpl <em>Deterministic Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.DeterministicClauseImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getDeterministicClause()
     * @generated
     */
    EClass DETERMINISTIC_CLAUSE = eINSTANCE.getDeterministicClause();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.ResultCacheClauseImpl <em>Result Cache Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.ResultCacheClauseImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getResultCacheClause()
     * @generated
     */
    EClass RESULT_CACHE_CLAUSE = eINSTANCE.getResultCacheClause();

    /**
     * The meta object literal for the '<em><b>Data Sources</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESULT_CACHE_CLAUSE__DATA_SOURCES = eINSTANCE.getResultCacheClause_DataSources();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.PipelinedClauseImpl <em>Pipelined Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.PipelinedClauseImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getPipelinedClause()
     * @generated
     */
    EClass PIPELINED_CLAUSE = eINSTANCE.getPipelinedClause();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.StatementBodyImpl <em>Statement Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.StatementBodyImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getStatementBody()
     * @generated
     */
    EClass STATEMENT_BODY = eINSTANCE.getStatementBody();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_BODY__STATEMENTS = eINSTANCE.getStatementBody_Statements();

    /**
     * The meta object literal for the '<em><b>End Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT_BODY__END_NAME = eINSTANCE.getStatementBody_EndName();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.DeclareSectionImpl <em>Declare Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.DeclareSectionImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getDeclareSection()
     * @generated
     */
    EClass DECLARE_SECTION = eINSTANCE.getDeclareSection();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARE_SECTION__ITEMS = eINSTANCE.getDeclareSection_Items();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.ItemImpl <em>Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.ItemImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getItem()
     * @generated
     */
    EClass ITEM = eINSTANCE.getItem();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.ItemDeclarationImpl <em>Item Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.ItemDeclarationImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getItemDeclaration()
     * @generated
     */
    EClass ITEM_DECLARATION = eINSTANCE.getItemDeclaration();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.ExternalProcedureDeclarationImpl <em>External Procedure Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.ExternalProcedureDeclarationImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getExternalProcedureDeclaration()
     * @generated
     */
    EClass EXTERNAL_PROCEDURE_DECLARATION = eINSTANCE.getExternalProcedureDeclaration();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.VariableDeclarationImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getVariableDeclaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Is Constant</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION__IS_CONSTANT = eINSTANCE.getVariableDeclaration_IsConstant();

    /**
     * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION__DATA_TYPE = eINSTANCE.getVariableDeclaration_DataType();

    /**
     * The meta object literal for the '<em><b>Is Not Null</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION__IS_NOT_NULL = eINSTANCE.getVariableDeclaration_IsNotNull();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__VALUE = eINSTANCE.getVariableDeclaration_Value();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.VariableValueImpl <em>Variable Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.VariableValueImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getVariableValue()
     * @generated
     */
    EClass VARIABLE_VALUE = eINSTANCE.getVariableValue();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_VALUE__EXPRESSION = eINSTANCE.getVariableValue_Expression();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.ExpressionImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.IntLiteralExpressionImpl <em>Int Literal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.IntLiteralExpressionImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getIntLiteralExpression()
     * @generated
     */
    EClass INT_LITERAL_EXPRESSION = eINSTANCE.getIntLiteralExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_LITERAL_EXPRESSION__VALUE = eINSTANCE.getIntLiteralExpression_Value();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.StringLiteralExpressionImpl <em>String Literal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.StringLiteralExpressionImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getStringLiteralExpression()
     * @generated
     */
    EClass STRING_LITERAL_EXPRESSION = eINSTANCE.getStringLiteralExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL_EXPRESSION__VALUE = eINSTANCE.getStringLiteralExpression_Value();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.BooleanLiteralExpressionImpl <em>Boolean Literal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.BooleanLiteralExpressionImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getBooleanLiteralExpression()
     * @generated
     */
    EClass BOOLEAN_LITERAL_EXPRESSION = eINSTANCE.getBooleanLiteralExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_LITERAL_EXPRESSION__VALUE = eINSTANCE.getBooleanLiteralExpression_Value();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.NullLiteralExpressionImpl <em>Null Literal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.NullLiteralExpressionImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getNullLiteralExpression()
     * @generated
     */
    EClass NULL_LITERAL_EXPRESSION = eINSTANCE.getNullLiteralExpression();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.VariableRefExpressionImpl <em>Variable Ref Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.VariableRefExpressionImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getVariableRefExpression()
     * @generated
     */
    EClass VARIABLE_REF_EXPRESSION = eINSTANCE.getVariableRefExpression();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_REF_EXPRESSION__VARIABLE = eINSTANCE.getVariableRefExpression_Variable();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.StatementImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '<em><b>Labels</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__LABELS = eINSTANCE.getStatement_Labels();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.LabelImpl <em>Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.LabelImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getLabel()
     * @generated
     */
    EClass LABEL = eINSTANCE.getLabel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__NAME = eINSTANCE.getLabel_Name();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.AssignmentStatementImpl <em>Assignment Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.AssignmentStatementImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getAssignmentStatement()
     * @generated
     */
    EClass ASSIGNMENT_STATEMENT = eINSTANCE.getAssignmentStatement();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT_STATEMENT__TARGET = eINSTANCE.getAssignmentStatement_Target();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT_STATEMENT__EXPRESSION = eINSTANCE.getAssignmentStatement_Expression();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.AssignmentTargetImpl <em>Assignment Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.AssignmentTargetImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getAssignmentTarget()
     * @generated
     */
    EClass ASSIGNMENT_TARGET = eINSTANCE.getAssignmentTarget();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.VariableAssignmentTargetImpl <em>Variable Assignment Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.VariableAssignmentTargetImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getVariableAssignmentTarget()
     * @generated
     */
    EClass VARIABLE_ASSIGNMENT_TARGET = eINSTANCE.getVariableAssignmentTarget();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_ASSIGNMENT_TARGET__VARIABLE = eINSTANCE.getVariableAssignmentTarget_Variable();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.BlockStatementImpl <em>Block Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.BlockStatementImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getBlockStatement()
     * @generated
     */
    EClass BLOCK_STATEMENT = eINSTANCE.getBlockStatement();

    /**
     * The meta object literal for the '<em><b>Declare Section</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK_STATEMENT__DECLARE_SECTION = eINSTANCE.getBlockStatement_DeclareSection();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK_STATEMENT__BODY = eINSTANCE.getBlockStatement_Body();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.CaseStatementImpl <em>Case Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.CaseStatementImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getCaseStatement()
     * @generated
     */
    EClass CASE_STATEMENT = eINSTANCE.getCaseStatement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_STATEMENT__EXPRESSION = eINSTANCE.getCaseStatement_Expression();

    /**
     * The meta object literal for the '<em><b>When Branches</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_STATEMENT__WHEN_BRANCHES = eINSTANCE.getCaseStatement_WhenBranches();

    /**
     * The meta object literal for the '<em><b>Else Branch</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_STATEMENT__ELSE_BRANCH = eINSTANCE.getCaseStatement_ElseBranch();

    /**
     * The meta object literal for the '<em><b>End Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CASE_STATEMENT__END_LABEL = eINSTANCE.getCaseStatement_EndLabel();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.CaseStatementWhenBranchImpl <em>Case Statement When Branch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.CaseStatementWhenBranchImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getCaseStatementWhenBranch()
     * @generated
     */
    EClass CASE_STATEMENT_WHEN_BRANCH = eINSTANCE.getCaseStatementWhenBranch();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_STATEMENT_WHEN_BRANCH__EXPRESSION = eINSTANCE.getCaseStatementWhenBranch_Expression();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_STATEMENT_WHEN_BRANCH__STATEMENTS = eINSTANCE.getCaseStatementWhenBranch_Statements();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.CaseStatementElseBranchImpl <em>Case Statement Else Branch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.CaseStatementElseBranchImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getCaseStatementElseBranch()
     * @generated
     */
    EClass CASE_STATEMENT_ELSE_BRANCH = eINSTANCE.getCaseStatementElseBranch();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_STATEMENT_ELSE_BRANCH__STATEMENTS = eINSTANCE.getCaseStatementElseBranch_Statements();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.CloseStatementImpl <em>Close Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.CloseStatementImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getCloseStatement()
     * @generated
     */
    EClass CLOSE_STATEMENT = eINSTANCE.getCloseStatement();

    /**
     * The meta object literal for the '<em><b>Cursor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLOSE_STATEMENT__CURSOR = eINSTANCE.getCloseStatement_Cursor();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.ContinueStatementImpl <em>Continue Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.ContinueStatementImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getContinueStatement()
     * @generated
     */
    EClass CONTINUE_STATEMENT = eINSTANCE.getContinueStatement();

    /**
     * The meta object literal for the '<em><b>Label Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTINUE_STATEMENT__LABEL_NAME = eINSTANCE.getContinueStatement_LabelName();

    /**
     * The meta object literal for the '<em><b>When Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTINUE_STATEMENT__WHEN_EXPRESSION = eINSTANCE.getContinueStatement_WhenExpression();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.ExitStatementImpl <em>Exit Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.ExitStatementImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getExitStatement()
     * @generated
     */
    EClass EXIT_STATEMENT = eINSTANCE.getExitStatement();

    /**
     * The meta object literal for the '<em><b>Label Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXIT_STATEMENT__LABEL_NAME = eINSTANCE.getExitStatement_LabelName();

    /**
     * The meta object literal for the '<em><b>When Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXIT_STATEMENT__WHEN_EXPRESSION = eINSTANCE.getExitStatement_WhenExpression();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.FetchStatementImpl <em>Fetch Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.FetchStatementImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getFetchStatement()
     * @generated
     */
    EClass FETCH_STATEMENT = eINSTANCE.getFetchStatement();

    /**
     * The meta object literal for the '<em><b>Cursor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FETCH_STATEMENT__CURSOR = eINSTANCE.getFetchStatement_Cursor();

    /**
     * The meta object literal for the '<em><b>Into Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FETCH_STATEMENT__INTO_CLAUSE = eINSTANCE.getFetchStatement_IntoClause();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.FetchStatementIntoClauseImpl <em>Fetch Statement Into Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.FetchStatementIntoClauseImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getFetchStatementIntoClause()
     * @generated
     */
    EClass FETCH_STATEMENT_INTO_CLAUSE = eINSTANCE.getFetchStatementIntoClause();

    /**
     * The meta object literal for the '<em><b>Target Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FETCH_STATEMENT_INTO_CLAUSE__TARGET_VARIABLES = eINSTANCE.getFetchStatementIntoClause_TargetVariables();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.FetchStatementSingleIntoClauseImpl <em>Fetch Statement Single Into Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.FetchStatementSingleIntoClauseImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getFetchStatementSingleIntoClause()
     * @generated
     */
    EClass FETCH_STATEMENT_SINGLE_INTO_CLAUSE = eINSTANCE.getFetchStatementSingleIntoClause();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.FetchStatementBulkIntoClauseImpl <em>Fetch Statement Bulk Into Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.FetchStatementBulkIntoClauseImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getFetchStatementBulkIntoClause()
     * @generated
     */
    EClass FETCH_STATEMENT_BULK_INTO_CLAUSE = eINSTANCE.getFetchStatementBulkIntoClause();

    /**
     * The meta object literal for the '<em><b>Limit Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FETCH_STATEMENT_BULK_INTO_CLAUSE__LIMIT_EXPRESSION = eINSTANCE.getFetchStatementBulkIntoClause_LimitExpression();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.GotoStatementImpl <em>Goto Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.GotoStatementImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getGotoStatement()
     * @generated
     */
    EClass GOTO_STATEMENT = eINSTANCE.getGotoStatement();

    /**
     * The meta object literal for the '<em><b>Label Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOTO_STATEMENT__LABEL_NAME = eINSTANCE.getGotoStatement_LabelName();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.IfStatementImpl <em>If Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.IfStatementImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getIfStatement()
     * @generated
     */
    EClass IF_STATEMENT = eINSTANCE.getIfStatement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__EXPRESSION = eINSTANCE.getIfStatement_Expression();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__STATEMENTS = eINSTANCE.getIfStatement_Statements();

    /**
     * The meta object literal for the '<em><b>Elsif Branches</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__ELSIF_BRANCHES = eINSTANCE.getIfStatement_ElsifBranches();

    /**
     * The meta object literal for the '<em><b>Else Branch</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__ELSE_BRANCH = eINSTANCE.getIfStatement_ElseBranch();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.IfStatementElsifBranchImpl <em>If Statement Elsif Branch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.IfStatementElsifBranchImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getIfStatementElsifBranch()
     * @generated
     */
    EClass IF_STATEMENT_ELSIF_BRANCH = eINSTANCE.getIfStatementElsifBranch();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT_ELSIF_BRANCH__EXPRESSION = eINSTANCE.getIfStatementElsifBranch_Expression();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT_ELSIF_BRANCH__STATEMENTS = eINSTANCE.getIfStatementElsifBranch_Statements();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.IfStatementElseBranchImpl <em>If Statement Else Branch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.IfStatementElseBranchImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getIfStatementElseBranch()
     * @generated
     */
    EClass IF_STATEMENT_ELSE_BRANCH = eINSTANCE.getIfStatementElseBranch();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT_ELSE_BRANCH__STATEMENTS = eINSTANCE.getIfStatementElseBranch_Statements();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.LoopStatementImpl <em>Loop Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.LoopStatementImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getLoopStatement()
     * @generated
     */
    EClass LOOP_STATEMENT = eINSTANCE.getLoopStatement();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP_STATEMENT__STATEMENTS = eINSTANCE.getLoopStatement_Statements();

    /**
     * The meta object literal for the '<em><b>End Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOOP_STATEMENT__END_LABEL = eINSTANCE.getLoopStatement_EndLabel();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.BasicLoopStatementImpl <em>Basic Loop Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.BasicLoopStatementImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getBasicLoopStatement()
     * @generated
     */
    EClass BASIC_LOOP_STATEMENT = eINSTANCE.getBasicLoopStatement();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.WhileLoopStatementImpl <em>While Loop Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.WhileLoopStatementImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getWhileLoopStatement()
     * @generated
     */
    EClass WHILE_LOOP_STATEMENT = eINSTANCE.getWhileLoopStatement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_LOOP_STATEMENT__EXPRESSION = eINSTANCE.getWhileLoopStatement_Expression();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.ForLoopStatementImpl <em>For Loop Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.ForLoopStatementImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getForLoopStatement()
     * @generated
     */
    EClass FOR_LOOP_STATEMENT = eINSTANCE.getForLoopStatement();

    /**
     * The meta object literal for the '<em><b>Index Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_LOOP_STATEMENT__INDEX_VARIABLE = eINSTANCE.getForLoopStatement_IndexVariable();

    /**
     * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_LOOP_STATEMENT__LOWER_BOUND = eINSTANCE.getForLoopStatement_LowerBound();

    /**
     * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_LOOP_STATEMENT__UPPER_BOUND = eINSTANCE.getForLoopStatement_UpperBound();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.ReturnStatementImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getReturnStatement()
     * @generated
     */
    EClass RETURN_STATEMENT = eINSTANCE.getReturnStatement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETURN_STATEMENT__EXPRESSION = eINSTANCE.getReturnStatement_Expression();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.NullStatementImpl <em>Null Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.NullStatementImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getNullStatement()
     * @generated
     */
    EClass NULL_STATEMENT = eINSTANCE.getNullStatement();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.RaiseStatementImpl <em>Raise Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.RaiseStatementImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getRaiseStatement()
     * @generated
     */
    EClass RAISE_STATEMENT = eINSTANCE.getRaiseStatement();

    /**
     * The meta object literal for the '<em><b>Exception Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RAISE_STATEMENT__EXCEPTION_NAME = eINSTANCE.getRaiseStatement_ExceptionName();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.VariableRefImpl <em>Variable Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.VariableRefImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getVariableRef()
     * @generated
     */
    EClass VARIABLE_REF = eINSTANCE.getVariableRef();

    /**
     * The meta object literal for the '<em><b>Is Host Ref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_REF__IS_HOST_REF = eINSTANCE.getVariableRef_IsHostRef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_REF__NAME = eINSTANCE.getVariableRef_Name();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.QualifiedNameImpl <em>Qualified Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.QualifiedNameImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getQualifiedName()
     * @generated
     */
    EClass QUALIFIED_NAME = eINSTANCE.getQualifiedName();

    /**
     * The meta object literal for the '<em><b>Names</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALIFIED_NAME__NAMES = eINSTANCE.getQualifiedName_Names();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.NameImpl <em>Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.NameImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getName_()
     * @generated
     */
    EClass NAME = eINSTANCE.getName_();

    /**
     * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAME__DECLARATION = eINSTANCE.getName_Declaration();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.LoopVariableDeclarationImpl <em>Loop Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.LoopVariableDeclarationImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getLoopVariableDeclaration()
     * @generated
     */
    EClass LOOP_VARIABLE_DECLARATION = eINSTANCE.getLoopVariableDeclaration();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.impl.NameDeclarationImpl <em>Name Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.impl.NameDeclarationImpl
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getNameDeclaration()
     * @generated
     */
    EClass NAME_DECLARATION = eINSTANCE.getNameDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME_DECLARATION__NAME = eINSTANCE.getNameDeclaration_Name();

    /**
     * The meta object literal for the '{@link plsql.editor.xtext.plSql.InvokerRight <em>Invoker Right</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see plsql.editor.xtext.plSql.InvokerRight
     * @see plsql.editor.xtext.plSql.impl.PlSqlPackageImpl#getInvokerRight()
     * @generated
     */
    EEnum INVOKER_RIGHT = eINSTANCE.getInvokerRight();

  }

} //PlSqlPackage
