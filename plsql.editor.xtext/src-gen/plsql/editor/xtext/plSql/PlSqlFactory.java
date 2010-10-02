/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see plsql.editor.xtext.plSql.PlSqlPackage
 * @generated
 */
public interface PlSqlFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PlSqlFactory eINSTANCE = plsql.editor.xtext.plSql.impl.PlSqlFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Compilation Unit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compilation Unit</em>'.
   * @generated
   */
  CompilationUnit createCompilationUnit();

  /**
   * Returns a new object of class '<em>Procedure</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Procedure</em>'.
   * @generated
   */
  Procedure createProcedure();

  /**
   * Returns a new object of class '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package</em>'.
   * @generated
   */
  Package createPackage();

  /**
   * Returns a new object of class '<em>Procedure Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Procedure Declaration</em>'.
   * @generated
   */
  ProcedureDeclaration createProcedureDeclaration();

  /**
   * Returns a new object of class '<em>Procedure Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Procedure Definition</em>'.
   * @generated
   */
  ProcedureDefinition createProcedureDefinition();

  /**
   * Returns a new object of class '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function</em>'.
   * @generated
   */
  Function createFunction();

  /**
   * Returns a new object of class '<em>Parameter Sequence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Sequence</em>'.
   * @generated
   */
  ParameterSequence createParameterSequence();

  /**
   * Returns a new object of class '<em>Parameter Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Declaration</em>'.
   * @generated
   */
  ParameterDeclaration createParameterDeclaration();

  /**
   * Returns a new object of class '<em>Parameter Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Value</em>'.
   * @generated
   */
  ParameterValue createParameterValue();

  /**
   * Returns a new object of class '<em>Procedure Invoker Rights Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Procedure Invoker Rights Clause</em>'.
   * @generated
   */
  ProcedureInvokerRightsClause createProcedureInvokerRightsClause();

  /**
   * Returns a new object of class '<em>Function Invoker Rights Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Invoker Rights Clause</em>'.
   * @generated
   */
  FunctionInvokerRightsClause createFunctionInvokerRightsClause();

  /**
   * Returns a new object of class '<em>Pragma</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pragma</em>'.
   * @generated
   */
  Pragma createPragma();

  /**
   * Returns a new object of class '<em>Pragma Restrict References</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pragma Restrict References</em>'.
   * @generated
   */
  PragmaRestrictReferences createPragmaRestrictReferences();

  /**
   * Returns a new object of class '<em>Pragma Timestamp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pragma Timestamp</em>'.
   * @generated
   */
  PragmaTimestamp createPragmaTimestamp();

  /**
   * Returns a new object of class '<em>Procedure Content</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Procedure Content</em>'.
   * @generated
   */
  ProcedureContent createProcedureContent();

  /**
   * Returns a new object of class '<em>Procedure Implementation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Procedure Implementation</em>'.
   * @generated
   */
  ProcedureImplementation createProcedureImplementation();

  /**
   * Returns a new object of class '<em>Function Content</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Content</em>'.
   * @generated
   */
  FunctionContent createFunctionContent();

  /**
   * Returns a new object of class '<em>Function Implementation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Implementation</em>'.
   * @generated
   */
  FunctionImplementation createFunctionImplementation();

  /**
   * Returns a new object of class '<em>Function Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Clause</em>'.
   * @generated
   */
  FunctionClause createFunctionClause();

  /**
   * Returns a new object of class '<em>Deterministic Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deterministic Clause</em>'.
   * @generated
   */
  DeterministicClause createDeterministicClause();

  /**
   * Returns a new object of class '<em>Result Cache Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Result Cache Clause</em>'.
   * @generated
   */
  ResultCacheClause createResultCacheClause();

  /**
   * Returns a new object of class '<em>Pipelined Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pipelined Clause</em>'.
   * @generated
   */
  PipelinedClause createPipelinedClause();

  /**
   * Returns a new object of class '<em>Statement Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement Body</em>'.
   * @generated
   */
  StatementBody createStatementBody();

  /**
   * Returns a new object of class '<em>Declare Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declare Section</em>'.
   * @generated
   */
  DeclareSection createDeclareSection();

  /**
   * Returns a new object of class '<em>Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Item</em>'.
   * @generated
   */
  Item createItem();

  /**
   * Returns a new object of class '<em>Item Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Item Declaration</em>'.
   * @generated
   */
  ItemDeclaration createItemDeclaration();

  /**
   * Returns a new object of class '<em>External Procedure Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>External Procedure Declaration</em>'.
   * @generated
   */
  ExternalProcedureDeclaration createExternalProcedureDeclaration();

  /**
   * Returns a new object of class '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declaration</em>'.
   * @generated
   */
  VariableDeclaration createVariableDeclaration();

  /**
   * Returns a new object of class '<em>Variable Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Value</em>'.
   * @generated
   */
  VariableValue createVariableValue();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Int Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Literal Expression</em>'.
   * @generated
   */
  IntLiteralExpression createIntLiteralExpression();

  /**
   * Returns a new object of class '<em>String Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Literal Expression</em>'.
   * @generated
   */
  StringLiteralExpression createStringLiteralExpression();

  /**
   * Returns a new object of class '<em>Boolean Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Literal Expression</em>'.
   * @generated
   */
  BooleanLiteralExpression createBooleanLiteralExpression();

  /**
   * Returns a new object of class '<em>Null Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Null Literal Expression</em>'.
   * @generated
   */
  NullLiteralExpression createNullLiteralExpression();

  /**
   * Returns a new object of class '<em>Variable Ref Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Ref Expression</em>'.
   * @generated
   */
  VariableRefExpression createVariableRefExpression();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Label</em>'.
   * @generated
   */
  Label createLabel();

  /**
   * Returns a new object of class '<em>Assignment Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignment Statement</em>'.
   * @generated
   */
  AssignmentStatement createAssignmentStatement();

  /**
   * Returns a new object of class '<em>Assignment Target</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignment Target</em>'.
   * @generated
   */
  AssignmentTarget createAssignmentTarget();

  /**
   * Returns a new object of class '<em>Variable Assignment Target</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Assignment Target</em>'.
   * @generated
   */
  VariableAssignmentTarget createVariableAssignmentTarget();

  /**
   * Returns a new object of class '<em>Block Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block Statement</em>'.
   * @generated
   */
  BlockStatement createBlockStatement();

  /**
   * Returns a new object of class '<em>Case Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Statement</em>'.
   * @generated
   */
  CaseStatement createCaseStatement();

  /**
   * Returns a new object of class '<em>Case Statement When Branch</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Statement When Branch</em>'.
   * @generated
   */
  CaseStatementWhenBranch createCaseStatementWhenBranch();

  /**
   * Returns a new object of class '<em>Case Statement Else Branch</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Statement Else Branch</em>'.
   * @generated
   */
  CaseStatementElseBranch createCaseStatementElseBranch();

  /**
   * Returns a new object of class '<em>Close Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Close Statement</em>'.
   * @generated
   */
  CloseStatement createCloseStatement();

  /**
   * Returns a new object of class '<em>Continue Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Continue Statement</em>'.
   * @generated
   */
  ContinueStatement createContinueStatement();

  /**
   * Returns a new object of class '<em>Exit Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exit Statement</em>'.
   * @generated
   */
  ExitStatement createExitStatement();

  /**
   * Returns a new object of class '<em>Fetch Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fetch Statement</em>'.
   * @generated
   */
  FetchStatement createFetchStatement();

  /**
   * Returns a new object of class '<em>Fetch Statement Into Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fetch Statement Into Clause</em>'.
   * @generated
   */
  FetchStatementIntoClause createFetchStatementIntoClause();

  /**
   * Returns a new object of class '<em>Fetch Statement Single Into Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fetch Statement Single Into Clause</em>'.
   * @generated
   */
  FetchStatementSingleIntoClause createFetchStatementSingleIntoClause();

  /**
   * Returns a new object of class '<em>Fetch Statement Bulk Into Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fetch Statement Bulk Into Clause</em>'.
   * @generated
   */
  FetchStatementBulkIntoClause createFetchStatementBulkIntoClause();

  /**
   * Returns a new object of class '<em>Goto Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Goto Statement</em>'.
   * @generated
   */
  GotoStatement createGotoStatement();

  /**
   * Returns a new object of class '<em>If Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Statement</em>'.
   * @generated
   */
  IfStatement createIfStatement();

  /**
   * Returns a new object of class '<em>If Statement Elsif Branch</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Statement Elsif Branch</em>'.
   * @generated
   */
  IfStatementElsifBranch createIfStatementElsifBranch();

  /**
   * Returns a new object of class '<em>If Statement Else Branch</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Statement Else Branch</em>'.
   * @generated
   */
  IfStatementElseBranch createIfStatementElseBranch();

  /**
   * Returns a new object of class '<em>Loop Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Loop Statement</em>'.
   * @generated
   */
  LoopStatement createLoopStatement();

  /**
   * Returns a new object of class '<em>Basic Loop Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Loop Statement</em>'.
   * @generated
   */
  BasicLoopStatement createBasicLoopStatement();

  /**
   * Returns a new object of class '<em>While Loop Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>While Loop Statement</em>'.
   * @generated
   */
  WhileLoopStatement createWhileLoopStatement();

  /**
   * Returns a new object of class '<em>For Loop Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Loop Statement</em>'.
   * @generated
   */
  ForLoopStatement createForLoopStatement();

  /**
   * Returns a new object of class '<em>Return Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return Statement</em>'.
   * @generated
   */
  ReturnStatement createReturnStatement();

  /**
   * Returns a new object of class '<em>Null Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Null Statement</em>'.
   * @generated
   */
  NullStatement createNullStatement();

  /**
   * Returns a new object of class '<em>Raise Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Raise Statement</em>'.
   * @generated
   */
  RaiseStatement createRaiseStatement();

  /**
   * Returns a new object of class '<em>Variable Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Ref</em>'.
   * @generated
   */
  VariableRef createVariableRef();

  /**
   * Returns a new object of class '<em>Qualified Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qualified Name</em>'.
   * @generated
   */
  QualifiedName createQualifiedName();

  /**
   * Returns a new object of class '<em>Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Name</em>'.
   * @generated
   */
  Name createName();

  /**
   * Returns a new object of class '<em>Loop Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Loop Variable Declaration</em>'.
   * @generated
   */
  LoopVariableDeclaration createLoopVariableDeclaration();

  /**
   * Returns a new object of class '<em>Name Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Name Declaration</em>'.
   * @generated
   */
  NameDeclaration createNameDeclaration();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PlSqlPackage getPlSqlPackage();

} //PlSqlFactory
