/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see plsql.editor.xtext.plSql.PlSqlPackage
 * @generated
 */
public class PlSqlAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PlSqlPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlSqlAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PlSqlPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PlSqlSwitch<Adapter> modelSwitch =
    new PlSqlSwitch<Adapter>()
    {
      @Override
      public Adapter caseCompilationUnit(CompilationUnit object)
      {
        return createCompilationUnitAdapter();
      }
      @Override
      public Adapter caseProcedure(Procedure object)
      {
        return createProcedureAdapter();
      }
      @Override
      public Adapter casePackage(plsql.editor.xtext.plSql.Package object)
      {
        return createPackageAdapter();
      }
      @Override
      public Adapter caseProcedureDeclaration(ProcedureDeclaration object)
      {
        return createProcedureDeclarationAdapter();
      }
      @Override
      public Adapter caseProcedureDefinition(ProcedureDefinition object)
      {
        return createProcedureDefinitionAdapter();
      }
      @Override
      public Adapter caseFunction(Function object)
      {
        return createFunctionAdapter();
      }
      @Override
      public Adapter caseParameterSequence(ParameterSequence object)
      {
        return createParameterSequenceAdapter();
      }
      @Override
      public Adapter caseParameterDeclaration(ParameterDeclaration object)
      {
        return createParameterDeclarationAdapter();
      }
      @Override
      public Adapter caseParameterValue(ParameterValue object)
      {
        return createParameterValueAdapter();
      }
      @Override
      public Adapter caseProcedureInvokerRightsClause(ProcedureInvokerRightsClause object)
      {
        return createProcedureInvokerRightsClauseAdapter();
      }
      @Override
      public Adapter caseFunctionInvokerRightsClause(FunctionInvokerRightsClause object)
      {
        return createFunctionInvokerRightsClauseAdapter();
      }
      @Override
      public Adapter casePragma(Pragma object)
      {
        return createPragmaAdapter();
      }
      @Override
      public Adapter casePragmaRestrictReferences(PragmaRestrictReferences object)
      {
        return createPragmaRestrictReferencesAdapter();
      }
      @Override
      public Adapter casePragmaTimestamp(PragmaTimestamp object)
      {
        return createPragmaTimestampAdapter();
      }
      @Override
      public Adapter caseProcedureContent(ProcedureContent object)
      {
        return createProcedureContentAdapter();
      }
      @Override
      public Adapter caseProcedureImplementation(ProcedureImplementation object)
      {
        return createProcedureImplementationAdapter();
      }
      @Override
      public Adapter caseFunctionContent(FunctionContent object)
      {
        return createFunctionContentAdapter();
      }
      @Override
      public Adapter caseFunctionImplementation(FunctionImplementation object)
      {
        return createFunctionImplementationAdapter();
      }
      @Override
      public Adapter caseFunctionClause(FunctionClause object)
      {
        return createFunctionClauseAdapter();
      }
      @Override
      public Adapter caseDeterministicClause(DeterministicClause object)
      {
        return createDeterministicClauseAdapter();
      }
      @Override
      public Adapter caseResultCacheClause(ResultCacheClause object)
      {
        return createResultCacheClauseAdapter();
      }
      @Override
      public Adapter casePipelinedClause(PipelinedClause object)
      {
        return createPipelinedClauseAdapter();
      }
      @Override
      public Adapter caseStatementBody(StatementBody object)
      {
        return createStatementBodyAdapter();
      }
      @Override
      public Adapter caseDeclareSection(DeclareSection object)
      {
        return createDeclareSectionAdapter();
      }
      @Override
      public Adapter caseItem(Item object)
      {
        return createItemAdapter();
      }
      @Override
      public Adapter caseItemDeclaration(ItemDeclaration object)
      {
        return createItemDeclarationAdapter();
      }
      @Override
      public Adapter caseExternalProcedureDeclaration(ExternalProcedureDeclaration object)
      {
        return createExternalProcedureDeclarationAdapter();
      }
      @Override
      public Adapter caseVariableDeclaration(VariableDeclaration object)
      {
        return createVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseVariableValue(VariableValue object)
      {
        return createVariableValueAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseIntLiteralExpression(IntLiteralExpression object)
      {
        return createIntLiteralExpressionAdapter();
      }
      @Override
      public Adapter caseStringLiteralExpression(StringLiteralExpression object)
      {
        return createStringLiteralExpressionAdapter();
      }
      @Override
      public Adapter caseBooleanLiteralExpression(BooleanLiteralExpression object)
      {
        return createBooleanLiteralExpressionAdapter();
      }
      @Override
      public Adapter caseNullLiteralExpression(NullLiteralExpression object)
      {
        return createNullLiteralExpressionAdapter();
      }
      @Override
      public Adapter caseVariableRefExpression(VariableRefExpression object)
      {
        return createVariableRefExpressionAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseLabel(Label object)
      {
        return createLabelAdapter();
      }
      @Override
      public Adapter caseAssignmentStatement(AssignmentStatement object)
      {
        return createAssignmentStatementAdapter();
      }
      @Override
      public Adapter caseAssignmentTarget(AssignmentTarget object)
      {
        return createAssignmentTargetAdapter();
      }
      @Override
      public Adapter caseVariableAssignmentTarget(VariableAssignmentTarget object)
      {
        return createVariableAssignmentTargetAdapter();
      }
      @Override
      public Adapter caseBlockStatement(BlockStatement object)
      {
        return createBlockStatementAdapter();
      }
      @Override
      public Adapter caseCaseStatement(CaseStatement object)
      {
        return createCaseStatementAdapter();
      }
      @Override
      public Adapter caseCaseStatementWhenBranch(CaseStatementWhenBranch object)
      {
        return createCaseStatementWhenBranchAdapter();
      }
      @Override
      public Adapter caseCaseStatementElseBranch(CaseStatementElseBranch object)
      {
        return createCaseStatementElseBranchAdapter();
      }
      @Override
      public Adapter caseCloseStatement(CloseStatement object)
      {
        return createCloseStatementAdapter();
      }
      @Override
      public Adapter caseContinueStatement(ContinueStatement object)
      {
        return createContinueStatementAdapter();
      }
      @Override
      public Adapter caseExitStatement(ExitStatement object)
      {
        return createExitStatementAdapter();
      }
      @Override
      public Adapter caseFetchStatement(FetchStatement object)
      {
        return createFetchStatementAdapter();
      }
      @Override
      public Adapter caseFetchStatementIntoClause(FetchStatementIntoClause object)
      {
        return createFetchStatementIntoClauseAdapter();
      }
      @Override
      public Adapter caseFetchStatementSingleIntoClause(FetchStatementSingleIntoClause object)
      {
        return createFetchStatementSingleIntoClauseAdapter();
      }
      @Override
      public Adapter caseFetchStatementBulkIntoClause(FetchStatementBulkIntoClause object)
      {
        return createFetchStatementBulkIntoClauseAdapter();
      }
      @Override
      public Adapter caseGotoStatement(GotoStatement object)
      {
        return createGotoStatementAdapter();
      }
      @Override
      public Adapter caseIfStatement(IfStatement object)
      {
        return createIfStatementAdapter();
      }
      @Override
      public Adapter caseIfStatementElsifBranch(IfStatementElsifBranch object)
      {
        return createIfStatementElsifBranchAdapter();
      }
      @Override
      public Adapter caseIfStatementElseBranch(IfStatementElseBranch object)
      {
        return createIfStatementElseBranchAdapter();
      }
      @Override
      public Adapter caseLoopStatement(LoopStatement object)
      {
        return createLoopStatementAdapter();
      }
      @Override
      public Adapter caseBasicLoopStatement(BasicLoopStatement object)
      {
        return createBasicLoopStatementAdapter();
      }
      @Override
      public Adapter caseWhileLoopStatement(WhileLoopStatement object)
      {
        return createWhileLoopStatementAdapter();
      }
      @Override
      public Adapter caseForLoopStatement(ForLoopStatement object)
      {
        return createForLoopStatementAdapter();
      }
      @Override
      public Adapter caseReturnStatement(ReturnStatement object)
      {
        return createReturnStatementAdapter();
      }
      @Override
      public Adapter caseNullStatement(NullStatement object)
      {
        return createNullStatementAdapter();
      }
      @Override
      public Adapter caseRaiseStatement(RaiseStatement object)
      {
        return createRaiseStatementAdapter();
      }
      @Override
      public Adapter caseVariableRef(VariableRef object)
      {
        return createVariableRefAdapter();
      }
      @Override
      public Adapter caseQualifiedName(QualifiedName object)
      {
        return createQualifiedNameAdapter();
      }
      @Override
      public Adapter caseName(Name object)
      {
        return createNameAdapter();
      }
      @Override
      public Adapter caseLoopVariableDeclaration(LoopVariableDeclaration object)
      {
        return createLoopVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseNameDeclaration(NameDeclaration object)
      {
        return createNameDeclarationAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.CompilationUnit <em>Compilation Unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.CompilationUnit
   * @generated
   */
  public Adapter createCompilationUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.Procedure <em>Procedure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.Procedure
   * @generated
   */
  public Adapter createProcedureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.Package
   * @generated
   */
  public Adapter createPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.ProcedureDeclaration <em>Procedure Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.ProcedureDeclaration
   * @generated
   */
  public Adapter createProcedureDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.ProcedureDefinition <em>Procedure Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.ProcedureDefinition
   * @generated
   */
  public Adapter createProcedureDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.Function
   * @generated
   */
  public Adapter createFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.ParameterSequence <em>Parameter Sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.ParameterSequence
   * @generated
   */
  public Adapter createParameterSequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.ParameterDeclaration <em>Parameter Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.ParameterDeclaration
   * @generated
   */
  public Adapter createParameterDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.ParameterValue <em>Parameter Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.ParameterValue
   * @generated
   */
  public Adapter createParameterValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.ProcedureInvokerRightsClause <em>Procedure Invoker Rights Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.ProcedureInvokerRightsClause
   * @generated
   */
  public Adapter createProcedureInvokerRightsClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.FunctionInvokerRightsClause <em>Function Invoker Rights Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.FunctionInvokerRightsClause
   * @generated
   */
  public Adapter createFunctionInvokerRightsClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.Pragma <em>Pragma</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.Pragma
   * @generated
   */
  public Adapter createPragmaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.PragmaRestrictReferences <em>Pragma Restrict References</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.PragmaRestrictReferences
   * @generated
   */
  public Adapter createPragmaRestrictReferencesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.PragmaTimestamp <em>Pragma Timestamp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.PragmaTimestamp
   * @generated
   */
  public Adapter createPragmaTimestampAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.ProcedureContent <em>Procedure Content</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.ProcedureContent
   * @generated
   */
  public Adapter createProcedureContentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.ProcedureImplementation <em>Procedure Implementation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.ProcedureImplementation
   * @generated
   */
  public Adapter createProcedureImplementationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.FunctionContent <em>Function Content</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.FunctionContent
   * @generated
   */
  public Adapter createFunctionContentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.FunctionImplementation <em>Function Implementation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.FunctionImplementation
   * @generated
   */
  public Adapter createFunctionImplementationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.FunctionClause <em>Function Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.FunctionClause
   * @generated
   */
  public Adapter createFunctionClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.DeterministicClause <em>Deterministic Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.DeterministicClause
   * @generated
   */
  public Adapter createDeterministicClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.ResultCacheClause <em>Result Cache Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.ResultCacheClause
   * @generated
   */
  public Adapter createResultCacheClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.PipelinedClause <em>Pipelined Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.PipelinedClause
   * @generated
   */
  public Adapter createPipelinedClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.StatementBody <em>Statement Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.StatementBody
   * @generated
   */
  public Adapter createStatementBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.DeclareSection <em>Declare Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.DeclareSection
   * @generated
   */
  public Adapter createDeclareSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.Item <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.Item
   * @generated
   */
  public Adapter createItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.ItemDeclaration <em>Item Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.ItemDeclaration
   * @generated
   */
  public Adapter createItemDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.ExternalProcedureDeclaration <em>External Procedure Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.ExternalProcedureDeclaration
   * @generated
   */
  public Adapter createExternalProcedureDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.VariableDeclaration
   * @generated
   */
  public Adapter createVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.VariableValue <em>Variable Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.VariableValue
   * @generated
   */
  public Adapter createVariableValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.IntLiteralExpression <em>Int Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.IntLiteralExpression
   * @generated
   */
  public Adapter createIntLiteralExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.StringLiteralExpression <em>String Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.StringLiteralExpression
   * @generated
   */
  public Adapter createStringLiteralExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.BooleanLiteralExpression <em>Boolean Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.BooleanLiteralExpression
   * @generated
   */
  public Adapter createBooleanLiteralExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.NullLiteralExpression <em>Null Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.NullLiteralExpression
   * @generated
   */
  public Adapter createNullLiteralExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.VariableRefExpression <em>Variable Ref Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.VariableRefExpression
   * @generated
   */
  public Adapter createVariableRefExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.Label
   * @generated
   */
  public Adapter createLabelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.AssignmentStatement <em>Assignment Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.AssignmentStatement
   * @generated
   */
  public Adapter createAssignmentStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.AssignmentTarget <em>Assignment Target</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.AssignmentTarget
   * @generated
   */
  public Adapter createAssignmentTargetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.VariableAssignmentTarget <em>Variable Assignment Target</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.VariableAssignmentTarget
   * @generated
   */
  public Adapter createVariableAssignmentTargetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.BlockStatement <em>Block Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.BlockStatement
   * @generated
   */
  public Adapter createBlockStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.CaseStatement <em>Case Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.CaseStatement
   * @generated
   */
  public Adapter createCaseStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.CaseStatementWhenBranch <em>Case Statement When Branch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.CaseStatementWhenBranch
   * @generated
   */
  public Adapter createCaseStatementWhenBranchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.CaseStatementElseBranch <em>Case Statement Else Branch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.CaseStatementElseBranch
   * @generated
   */
  public Adapter createCaseStatementElseBranchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.CloseStatement <em>Close Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.CloseStatement
   * @generated
   */
  public Adapter createCloseStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.ContinueStatement <em>Continue Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.ContinueStatement
   * @generated
   */
  public Adapter createContinueStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.ExitStatement <em>Exit Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.ExitStatement
   * @generated
   */
  public Adapter createExitStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.FetchStatement <em>Fetch Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.FetchStatement
   * @generated
   */
  public Adapter createFetchStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.FetchStatementIntoClause <em>Fetch Statement Into Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.FetchStatementIntoClause
   * @generated
   */
  public Adapter createFetchStatementIntoClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.FetchStatementSingleIntoClause <em>Fetch Statement Single Into Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.FetchStatementSingleIntoClause
   * @generated
   */
  public Adapter createFetchStatementSingleIntoClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.FetchStatementBulkIntoClause <em>Fetch Statement Bulk Into Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.FetchStatementBulkIntoClause
   * @generated
   */
  public Adapter createFetchStatementBulkIntoClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.GotoStatement <em>Goto Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.GotoStatement
   * @generated
   */
  public Adapter createGotoStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.IfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.IfStatement
   * @generated
   */
  public Adapter createIfStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.IfStatementElsifBranch <em>If Statement Elsif Branch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.IfStatementElsifBranch
   * @generated
   */
  public Adapter createIfStatementElsifBranchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.IfStatementElseBranch <em>If Statement Else Branch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.IfStatementElseBranch
   * @generated
   */
  public Adapter createIfStatementElseBranchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.LoopStatement <em>Loop Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.LoopStatement
   * @generated
   */
  public Adapter createLoopStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.BasicLoopStatement <em>Basic Loop Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.BasicLoopStatement
   * @generated
   */
  public Adapter createBasicLoopStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.WhileLoopStatement <em>While Loop Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.WhileLoopStatement
   * @generated
   */
  public Adapter createWhileLoopStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.ForLoopStatement <em>For Loop Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.ForLoopStatement
   * @generated
   */
  public Adapter createForLoopStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.ReturnStatement <em>Return Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.ReturnStatement
   * @generated
   */
  public Adapter createReturnStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.NullStatement <em>Null Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.NullStatement
   * @generated
   */
  public Adapter createNullStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.RaiseStatement <em>Raise Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.RaiseStatement
   * @generated
   */
  public Adapter createRaiseStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.VariableRef <em>Variable Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.VariableRef
   * @generated
   */
  public Adapter createVariableRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.QualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.QualifiedName
   * @generated
   */
  public Adapter createQualifiedNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.Name <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.Name
   * @generated
   */
  public Adapter createNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.LoopVariableDeclaration <em>Loop Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.LoopVariableDeclaration
   * @generated
   */
  public Adapter createLoopVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link plsql.editor.xtext.plSql.NameDeclaration <em>Name Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see plsql.editor.xtext.plSql.NameDeclaration
   * @generated
   */
  public Adapter createNameDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PlSqlAdapterFactory
