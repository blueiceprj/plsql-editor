/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import plsql.editor.xtext.plSql.AssignmentStatement;
import plsql.editor.xtext.plSql.AssignmentTarget;
import plsql.editor.xtext.plSql.BasicLoopStatement;
import plsql.editor.xtext.plSql.BlockStatement;
import plsql.editor.xtext.plSql.BooleanLiteralExpression;
import plsql.editor.xtext.plSql.CaseStatement;
import plsql.editor.xtext.plSql.CaseStatementElseBranch;
import plsql.editor.xtext.plSql.CaseStatementWhenBranch;
import plsql.editor.xtext.plSql.CloseStatement;
import plsql.editor.xtext.plSql.CompilationUnit;
import plsql.editor.xtext.plSql.ContinueStatement;
import plsql.editor.xtext.plSql.DeclareSection;
import plsql.editor.xtext.plSql.DeterministicClause;
import plsql.editor.xtext.plSql.ExitStatement;
import plsql.editor.xtext.plSql.Expression;
import plsql.editor.xtext.plSql.ExternalProcedureDeclaration;
import plsql.editor.xtext.plSql.FetchStatement;
import plsql.editor.xtext.plSql.FetchStatementBulkIntoClause;
import plsql.editor.xtext.plSql.FetchStatementIntoClause;
import plsql.editor.xtext.plSql.FetchStatementSingleIntoClause;
import plsql.editor.xtext.plSql.ForLoopStatement;
import plsql.editor.xtext.plSql.Function;
import plsql.editor.xtext.plSql.FunctionClause;
import plsql.editor.xtext.plSql.FunctionContent;
import plsql.editor.xtext.plSql.FunctionImplementation;
import plsql.editor.xtext.plSql.FunctionInvokerRightsClause;
import plsql.editor.xtext.plSql.GotoStatement;
import plsql.editor.xtext.plSql.IfStatement;
import plsql.editor.xtext.plSql.IfStatementElseBranch;
import plsql.editor.xtext.plSql.IfStatementElsifBranch;
import plsql.editor.xtext.plSql.IntLiteralExpression;
import plsql.editor.xtext.plSql.InvokerRight;
import plsql.editor.xtext.plSql.Item;
import plsql.editor.xtext.plSql.ItemDeclaration;
import plsql.editor.xtext.plSql.Label;
import plsql.editor.xtext.plSql.LoopStatement;
import plsql.editor.xtext.plSql.LoopVariableDeclaration;
import plsql.editor.xtext.plSql.Name;
import plsql.editor.xtext.plSql.NameDeclaration;
import plsql.editor.xtext.plSql.NullLiteralExpression;
import plsql.editor.xtext.plSql.NullStatement;
import plsql.editor.xtext.plSql.ParameterDeclaration;
import plsql.editor.xtext.plSql.ParameterSequence;
import plsql.editor.xtext.plSql.ParameterValue;
import plsql.editor.xtext.plSql.PipelinedClause;
import plsql.editor.xtext.plSql.PlSqlFactory;
import plsql.editor.xtext.plSql.PlSqlPackage;
import plsql.editor.xtext.plSql.Pragma;
import plsql.editor.xtext.plSql.PragmaRestrictReferences;
import plsql.editor.xtext.plSql.PragmaTimestamp;
import plsql.editor.xtext.plSql.Procedure;
import plsql.editor.xtext.plSql.ProcedureContent;
import plsql.editor.xtext.plSql.ProcedureDeclaration;
import plsql.editor.xtext.plSql.ProcedureDefinition;
import plsql.editor.xtext.plSql.ProcedureImplementation;
import plsql.editor.xtext.plSql.ProcedureInvokerRightsClause;
import plsql.editor.xtext.plSql.QualifiedName;
import plsql.editor.xtext.plSql.RaiseStatement;
import plsql.editor.xtext.plSql.ResultCacheClause;
import plsql.editor.xtext.plSql.ReturnStatement;
import plsql.editor.xtext.plSql.Statement;
import plsql.editor.xtext.plSql.StatementBody;
import plsql.editor.xtext.plSql.StringLiteralExpression;
import plsql.editor.xtext.plSql.VariableAssignmentTarget;
import plsql.editor.xtext.plSql.VariableDeclaration;
import plsql.editor.xtext.plSql.VariableRef;
import plsql.editor.xtext.plSql.VariableRefExpression;
import plsql.editor.xtext.plSql.VariableValue;
import plsql.editor.xtext.plSql.WhileLoopStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlSqlFactoryImpl extends EFactoryImpl implements PlSqlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PlSqlFactory init()
  {
    try
    {
      PlSqlFactory thePlSqlFactory = (PlSqlFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.editor.plsql/xtext/PlSql"); 
      if (thePlSqlFactory != null)
      {
        return thePlSqlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PlSqlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlSqlFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PlSqlPackage.COMPILATION_UNIT: return createCompilationUnit();
      case PlSqlPackage.PROCEDURE: return createProcedure();
      case PlSqlPackage.PACKAGE: return createPackage();
      case PlSqlPackage.PROCEDURE_DECLARATION: return createProcedureDeclaration();
      case PlSqlPackage.PROCEDURE_DEFINITION: return createProcedureDefinition();
      case PlSqlPackage.FUNCTION: return createFunction();
      case PlSqlPackage.PARAMETER_SEQUENCE: return createParameterSequence();
      case PlSqlPackage.PARAMETER_DECLARATION: return createParameterDeclaration();
      case PlSqlPackage.PARAMETER_VALUE: return createParameterValue();
      case PlSqlPackage.PROCEDURE_INVOKER_RIGHTS_CLAUSE: return createProcedureInvokerRightsClause();
      case PlSqlPackage.FUNCTION_INVOKER_RIGHTS_CLAUSE: return createFunctionInvokerRightsClause();
      case PlSqlPackage.PRAGMA: return createPragma();
      case PlSqlPackage.PRAGMA_RESTRICT_REFERENCES: return createPragmaRestrictReferences();
      case PlSqlPackage.PRAGMA_TIMESTAMP: return createPragmaTimestamp();
      case PlSqlPackage.PROCEDURE_CONTENT: return createProcedureContent();
      case PlSqlPackage.PROCEDURE_IMPLEMENTATION: return createProcedureImplementation();
      case PlSqlPackage.FUNCTION_CONTENT: return createFunctionContent();
      case PlSqlPackage.FUNCTION_IMPLEMENTATION: return createFunctionImplementation();
      case PlSqlPackage.FUNCTION_CLAUSE: return createFunctionClause();
      case PlSqlPackage.DETERMINISTIC_CLAUSE: return createDeterministicClause();
      case PlSqlPackage.RESULT_CACHE_CLAUSE: return createResultCacheClause();
      case PlSqlPackage.PIPELINED_CLAUSE: return createPipelinedClause();
      case PlSqlPackage.STATEMENT_BODY: return createStatementBody();
      case PlSqlPackage.DECLARE_SECTION: return createDeclareSection();
      case PlSqlPackage.ITEM: return createItem();
      case PlSqlPackage.ITEM_DECLARATION: return createItemDeclaration();
      case PlSqlPackage.EXTERNAL_PROCEDURE_DECLARATION: return createExternalProcedureDeclaration();
      case PlSqlPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case PlSqlPackage.VARIABLE_VALUE: return createVariableValue();
      case PlSqlPackage.EXPRESSION: return createExpression();
      case PlSqlPackage.INT_LITERAL_EXPRESSION: return createIntLiteralExpression();
      case PlSqlPackage.STRING_LITERAL_EXPRESSION: return createStringLiteralExpression();
      case PlSqlPackage.BOOLEAN_LITERAL_EXPRESSION: return createBooleanLiteralExpression();
      case PlSqlPackage.NULL_LITERAL_EXPRESSION: return createNullLiteralExpression();
      case PlSqlPackage.VARIABLE_REF_EXPRESSION: return createVariableRefExpression();
      case PlSqlPackage.STATEMENT: return createStatement();
      case PlSqlPackage.LABEL: return createLabel();
      case PlSqlPackage.ASSIGNMENT_STATEMENT: return createAssignmentStatement();
      case PlSqlPackage.ASSIGNMENT_TARGET: return createAssignmentTarget();
      case PlSqlPackage.VARIABLE_ASSIGNMENT_TARGET: return createVariableAssignmentTarget();
      case PlSqlPackage.BLOCK_STATEMENT: return createBlockStatement();
      case PlSqlPackage.CASE_STATEMENT: return createCaseStatement();
      case PlSqlPackage.CASE_STATEMENT_WHEN_BRANCH: return createCaseStatementWhenBranch();
      case PlSqlPackage.CASE_STATEMENT_ELSE_BRANCH: return createCaseStatementElseBranch();
      case PlSqlPackage.CLOSE_STATEMENT: return createCloseStatement();
      case PlSqlPackage.CONTINUE_STATEMENT: return createContinueStatement();
      case PlSqlPackage.EXIT_STATEMENT: return createExitStatement();
      case PlSqlPackage.FETCH_STATEMENT: return createFetchStatement();
      case PlSqlPackage.FETCH_STATEMENT_INTO_CLAUSE: return createFetchStatementIntoClause();
      case PlSqlPackage.FETCH_STATEMENT_SINGLE_INTO_CLAUSE: return createFetchStatementSingleIntoClause();
      case PlSqlPackage.FETCH_STATEMENT_BULK_INTO_CLAUSE: return createFetchStatementBulkIntoClause();
      case PlSqlPackage.GOTO_STATEMENT: return createGotoStatement();
      case PlSqlPackage.IF_STATEMENT: return createIfStatement();
      case PlSqlPackage.IF_STATEMENT_ELSIF_BRANCH: return createIfStatementElsifBranch();
      case PlSqlPackage.IF_STATEMENT_ELSE_BRANCH: return createIfStatementElseBranch();
      case PlSqlPackage.LOOP_STATEMENT: return createLoopStatement();
      case PlSqlPackage.BASIC_LOOP_STATEMENT: return createBasicLoopStatement();
      case PlSqlPackage.WHILE_LOOP_STATEMENT: return createWhileLoopStatement();
      case PlSqlPackage.FOR_LOOP_STATEMENT: return createForLoopStatement();
      case PlSqlPackage.RETURN_STATEMENT: return createReturnStatement();
      case PlSqlPackage.NULL_STATEMENT: return createNullStatement();
      case PlSqlPackage.RAISE_STATEMENT: return createRaiseStatement();
      case PlSqlPackage.VARIABLE_REF: return createVariableRef();
      case PlSqlPackage.QUALIFIED_NAME: return createQualifiedName();
      case PlSqlPackage.NAME: return createName();
      case PlSqlPackage.LOOP_VARIABLE_DECLARATION: return createLoopVariableDeclaration();
      case PlSqlPackage.NAME_DECLARATION: return createNameDeclaration();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PlSqlPackage.INVOKER_RIGHT:
        return createInvokerRightFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PlSqlPackage.INVOKER_RIGHT:
        return convertInvokerRightToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompilationUnit createCompilationUnit()
  {
    CompilationUnitImpl compilationUnit = new CompilationUnitImpl();
    return compilationUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Procedure createProcedure()
  {
    ProcedureImpl procedure = new ProcedureImpl();
    return procedure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public plsql.editor.xtext.plSql.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcedureDeclaration createProcedureDeclaration()
  {
    ProcedureDeclarationImpl procedureDeclaration = new ProcedureDeclarationImpl();
    return procedureDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcedureDefinition createProcedureDefinition()
  {
    ProcedureDefinitionImpl procedureDefinition = new ProcedureDefinitionImpl();
    return procedureDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterSequence createParameterSequence()
  {
    ParameterSequenceImpl parameterSequence = new ParameterSequenceImpl();
    return parameterSequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterDeclaration createParameterDeclaration()
  {
    ParameterDeclarationImpl parameterDeclaration = new ParameterDeclarationImpl();
    return parameterDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterValue createParameterValue()
  {
    ParameterValueImpl parameterValue = new ParameterValueImpl();
    return parameterValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcedureInvokerRightsClause createProcedureInvokerRightsClause()
  {
    ProcedureInvokerRightsClauseImpl procedureInvokerRightsClause = new ProcedureInvokerRightsClauseImpl();
    return procedureInvokerRightsClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionInvokerRightsClause createFunctionInvokerRightsClause()
  {
    FunctionInvokerRightsClauseImpl functionInvokerRightsClause = new FunctionInvokerRightsClauseImpl();
    return functionInvokerRightsClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pragma createPragma()
  {
    PragmaImpl pragma = new PragmaImpl();
    return pragma;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PragmaRestrictReferences createPragmaRestrictReferences()
  {
    PragmaRestrictReferencesImpl pragmaRestrictReferences = new PragmaRestrictReferencesImpl();
    return pragmaRestrictReferences;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PragmaTimestamp createPragmaTimestamp()
  {
    PragmaTimestampImpl pragmaTimestamp = new PragmaTimestampImpl();
    return pragmaTimestamp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcedureContent createProcedureContent()
  {
    ProcedureContentImpl procedureContent = new ProcedureContentImpl();
    return procedureContent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcedureImplementation createProcedureImplementation()
  {
    ProcedureImplementationImpl procedureImplementation = new ProcedureImplementationImpl();
    return procedureImplementation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionContent createFunctionContent()
  {
    FunctionContentImpl functionContent = new FunctionContentImpl();
    return functionContent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionImplementation createFunctionImplementation()
  {
    FunctionImplementationImpl functionImplementation = new FunctionImplementationImpl();
    return functionImplementation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionClause createFunctionClause()
  {
    FunctionClauseImpl functionClause = new FunctionClauseImpl();
    return functionClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeterministicClause createDeterministicClause()
  {
    DeterministicClauseImpl deterministicClause = new DeterministicClauseImpl();
    return deterministicClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResultCacheClause createResultCacheClause()
  {
    ResultCacheClauseImpl resultCacheClause = new ResultCacheClauseImpl();
    return resultCacheClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PipelinedClause createPipelinedClause()
  {
    PipelinedClauseImpl pipelinedClause = new PipelinedClauseImpl();
    return pipelinedClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementBody createStatementBody()
  {
    StatementBodyImpl statementBody = new StatementBodyImpl();
    return statementBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeclareSection createDeclareSection()
  {
    DeclareSectionImpl declareSection = new DeclareSectionImpl();
    return declareSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Item createItem()
  {
    ItemImpl item = new ItemImpl();
    return item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemDeclaration createItemDeclaration()
  {
    ItemDeclarationImpl itemDeclaration = new ItemDeclarationImpl();
    return itemDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalProcedureDeclaration createExternalProcedureDeclaration()
  {
    ExternalProcedureDeclarationImpl externalProcedureDeclaration = new ExternalProcedureDeclarationImpl();
    return externalProcedureDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableValue createVariableValue()
  {
    VariableValueImpl variableValue = new VariableValueImpl();
    return variableValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntLiteralExpression createIntLiteralExpression()
  {
    IntLiteralExpressionImpl intLiteralExpression = new IntLiteralExpressionImpl();
    return intLiteralExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteralExpression createStringLiteralExpression()
  {
    StringLiteralExpressionImpl stringLiteralExpression = new StringLiteralExpressionImpl();
    return stringLiteralExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteralExpression createBooleanLiteralExpression()
  {
    BooleanLiteralExpressionImpl booleanLiteralExpression = new BooleanLiteralExpressionImpl();
    return booleanLiteralExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NullLiteralExpression createNullLiteralExpression()
  {
    NullLiteralExpressionImpl nullLiteralExpression = new NullLiteralExpressionImpl();
    return nullLiteralExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableRefExpression createVariableRefExpression()
  {
    VariableRefExpressionImpl variableRefExpression = new VariableRefExpressionImpl();
    return variableRefExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Label createLabel()
  {
    LabelImpl label = new LabelImpl();
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignmentStatement createAssignmentStatement()
  {
    AssignmentStatementImpl assignmentStatement = new AssignmentStatementImpl();
    return assignmentStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignmentTarget createAssignmentTarget()
  {
    AssignmentTargetImpl assignmentTarget = new AssignmentTargetImpl();
    return assignmentTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableAssignmentTarget createVariableAssignmentTarget()
  {
    VariableAssignmentTargetImpl variableAssignmentTarget = new VariableAssignmentTargetImpl();
    return variableAssignmentTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockStatement createBlockStatement()
  {
    BlockStatementImpl blockStatement = new BlockStatementImpl();
    return blockStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CaseStatement createCaseStatement()
  {
    CaseStatementImpl caseStatement = new CaseStatementImpl();
    return caseStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CaseStatementWhenBranch createCaseStatementWhenBranch()
  {
    CaseStatementWhenBranchImpl caseStatementWhenBranch = new CaseStatementWhenBranchImpl();
    return caseStatementWhenBranch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CaseStatementElseBranch createCaseStatementElseBranch()
  {
    CaseStatementElseBranchImpl caseStatementElseBranch = new CaseStatementElseBranchImpl();
    return caseStatementElseBranch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CloseStatement createCloseStatement()
  {
    CloseStatementImpl closeStatement = new CloseStatementImpl();
    return closeStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContinueStatement createContinueStatement()
  {
    ContinueStatementImpl continueStatement = new ContinueStatementImpl();
    return continueStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExitStatement createExitStatement()
  {
    ExitStatementImpl exitStatement = new ExitStatementImpl();
    return exitStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FetchStatement createFetchStatement()
  {
    FetchStatementImpl fetchStatement = new FetchStatementImpl();
    return fetchStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FetchStatementIntoClause createFetchStatementIntoClause()
  {
    FetchStatementIntoClauseImpl fetchStatementIntoClause = new FetchStatementIntoClauseImpl();
    return fetchStatementIntoClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FetchStatementSingleIntoClause createFetchStatementSingleIntoClause()
  {
    FetchStatementSingleIntoClauseImpl fetchStatementSingleIntoClause = new FetchStatementSingleIntoClauseImpl();
    return fetchStatementSingleIntoClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FetchStatementBulkIntoClause createFetchStatementBulkIntoClause()
  {
    FetchStatementBulkIntoClauseImpl fetchStatementBulkIntoClause = new FetchStatementBulkIntoClauseImpl();
    return fetchStatementBulkIntoClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GotoStatement createGotoStatement()
  {
    GotoStatementImpl gotoStatement = new GotoStatementImpl();
    return gotoStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStatement createIfStatement()
  {
    IfStatementImpl ifStatement = new IfStatementImpl();
    return ifStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStatementElsifBranch createIfStatementElsifBranch()
  {
    IfStatementElsifBranchImpl ifStatementElsifBranch = new IfStatementElsifBranchImpl();
    return ifStatementElsifBranch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStatementElseBranch createIfStatementElseBranch()
  {
    IfStatementElseBranchImpl ifStatementElseBranch = new IfStatementElseBranchImpl();
    return ifStatementElseBranch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoopStatement createLoopStatement()
  {
    LoopStatementImpl loopStatement = new LoopStatementImpl();
    return loopStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicLoopStatement createBasicLoopStatement()
  {
    BasicLoopStatementImpl basicLoopStatement = new BasicLoopStatementImpl();
    return basicLoopStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhileLoopStatement createWhileLoopStatement()
  {
    WhileLoopStatementImpl whileLoopStatement = new WhileLoopStatementImpl();
    return whileLoopStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForLoopStatement createForLoopStatement()
  {
    ForLoopStatementImpl forLoopStatement = new ForLoopStatementImpl();
    return forLoopStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnStatement createReturnStatement()
  {
    ReturnStatementImpl returnStatement = new ReturnStatementImpl();
    return returnStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NullStatement createNullStatement()
  {
    NullStatementImpl nullStatement = new NullStatementImpl();
    return nullStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RaiseStatement createRaiseStatement()
  {
    RaiseStatementImpl raiseStatement = new RaiseStatementImpl();
    return raiseStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableRef createVariableRef()
  {
    VariableRefImpl variableRef = new VariableRefImpl();
    return variableRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedName createQualifiedName()
  {
    QualifiedNameImpl qualifiedName = new QualifiedNameImpl();
    return qualifiedName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name createName()
  {
    NameImpl name = new NameImpl();
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoopVariableDeclaration createLoopVariableDeclaration()
  {
    LoopVariableDeclarationImpl loopVariableDeclaration = new LoopVariableDeclarationImpl();
    return loopVariableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameDeclaration createNameDeclaration()
  {
    NameDeclarationImpl nameDeclaration = new NameDeclarationImpl();
    return nameDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InvokerRight createInvokerRightFromString(EDataType eDataType, String initialValue)
  {
    InvokerRight result = InvokerRight.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertInvokerRightToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlSqlPackage getPlSqlPackage()
  {
    return (PlSqlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PlSqlPackage getPackage()
  {
    return PlSqlPackage.eINSTANCE;
  }

} //PlSqlFactoryImpl
