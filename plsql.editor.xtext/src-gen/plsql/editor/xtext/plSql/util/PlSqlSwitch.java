/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see plsql.editor.xtext.plSql.PlSqlPackage
 * @generated
 */
public class PlSqlSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PlSqlPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlSqlSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PlSqlPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PlSqlPackage.COMPILATION_UNIT:
      {
        CompilationUnit compilationUnit = (CompilationUnit)theEObject;
        T result = caseCompilationUnit(compilationUnit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.PROCEDURE:
      {
        Procedure procedure = (Procedure)theEObject;
        T result = caseProcedure(procedure);
        if (result == null) result = caseCompilationUnit(procedure);
        if (result == null) result = caseNameDeclaration(procedure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.PACKAGE:
      {
        plsql.editor.xtext.plSql.Package package_ = (plsql.editor.xtext.plSql.Package)theEObject;
        T result = casePackage(package_);
        if (result == null) result = caseCompilationUnit(package_);
        if (result == null) result = caseNameDeclaration(package_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.PROCEDURE_DECLARATION:
      {
        ProcedureDeclaration procedureDeclaration = (ProcedureDeclaration)theEObject;
        T result = caseProcedureDeclaration(procedureDeclaration);
        if (result == null) result = caseItem(procedureDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.PROCEDURE_DEFINITION:
      {
        ProcedureDefinition procedureDefinition = (ProcedureDefinition)theEObject;
        T result = caseProcedureDefinition(procedureDefinition);
        if (result == null) result = caseItem(procedureDefinition);
        if (result == null) result = caseNameDeclaration(procedureDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.FUNCTION:
      {
        Function function = (Function)theEObject;
        T result = caseFunction(function);
        if (result == null) result = caseCompilationUnit(function);
        if (result == null) result = caseNameDeclaration(function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.PARAMETER_SEQUENCE:
      {
        ParameterSequence parameterSequence = (ParameterSequence)theEObject;
        T result = caseParameterSequence(parameterSequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.PARAMETER_DECLARATION:
      {
        ParameterDeclaration parameterDeclaration = (ParameterDeclaration)theEObject;
        T result = caseParameterDeclaration(parameterDeclaration);
        if (result == null) result = caseNameDeclaration(parameterDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.PARAMETER_VALUE:
      {
        ParameterValue parameterValue = (ParameterValue)theEObject;
        T result = caseParameterValue(parameterValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.PROCEDURE_INVOKER_RIGHTS_CLAUSE:
      {
        ProcedureInvokerRightsClause procedureInvokerRightsClause = (ProcedureInvokerRightsClause)theEObject;
        T result = caseProcedureInvokerRightsClause(procedureInvokerRightsClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.FUNCTION_INVOKER_RIGHTS_CLAUSE:
      {
        FunctionInvokerRightsClause functionInvokerRightsClause = (FunctionInvokerRightsClause)theEObject;
        T result = caseFunctionInvokerRightsClause(functionInvokerRightsClause);
        if (result == null) result = caseFunctionClause(functionInvokerRightsClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.PRAGMA:
      {
        Pragma pragma = (Pragma)theEObject;
        T result = casePragma(pragma);
        if (result == null) result = caseItem(pragma);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.PRAGMA_RESTRICT_REFERENCES:
      {
        PragmaRestrictReferences pragmaRestrictReferences = (PragmaRestrictReferences)theEObject;
        T result = casePragmaRestrictReferences(pragmaRestrictReferences);
        if (result == null) result = casePragma(pragmaRestrictReferences);
        if (result == null) result = caseItem(pragmaRestrictReferences);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.PRAGMA_TIMESTAMP:
      {
        PragmaTimestamp pragmaTimestamp = (PragmaTimestamp)theEObject;
        T result = casePragmaTimestamp(pragmaTimestamp);
        if (result == null) result = casePragma(pragmaTimestamp);
        if (result == null) result = caseItem(pragmaTimestamp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.PROCEDURE_CONTENT:
      {
        ProcedureContent procedureContent = (ProcedureContent)theEObject;
        T result = caseProcedureContent(procedureContent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.PROCEDURE_IMPLEMENTATION:
      {
        ProcedureImplementation procedureImplementation = (ProcedureImplementation)theEObject;
        T result = caseProcedureImplementation(procedureImplementation);
        if (result == null) result = caseProcedureContent(procedureImplementation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.FUNCTION_CONTENT:
      {
        FunctionContent functionContent = (FunctionContent)theEObject;
        T result = caseFunctionContent(functionContent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.FUNCTION_IMPLEMENTATION:
      {
        FunctionImplementation functionImplementation = (FunctionImplementation)theEObject;
        T result = caseFunctionImplementation(functionImplementation);
        if (result == null) result = caseFunctionContent(functionImplementation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.FUNCTION_CLAUSE:
      {
        FunctionClause functionClause = (FunctionClause)theEObject;
        T result = caseFunctionClause(functionClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.DETERMINISTIC_CLAUSE:
      {
        DeterministicClause deterministicClause = (DeterministicClause)theEObject;
        T result = caseDeterministicClause(deterministicClause);
        if (result == null) result = caseFunctionClause(deterministicClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.RESULT_CACHE_CLAUSE:
      {
        ResultCacheClause resultCacheClause = (ResultCacheClause)theEObject;
        T result = caseResultCacheClause(resultCacheClause);
        if (result == null) result = caseFunctionClause(resultCacheClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.PIPELINED_CLAUSE:
      {
        PipelinedClause pipelinedClause = (PipelinedClause)theEObject;
        T result = casePipelinedClause(pipelinedClause);
        if (result == null) result = caseFunctionClause(pipelinedClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.STATEMENT_BODY:
      {
        StatementBody statementBody = (StatementBody)theEObject;
        T result = caseStatementBody(statementBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.DECLARE_SECTION:
      {
        DeclareSection declareSection = (DeclareSection)theEObject;
        T result = caseDeclareSection(declareSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.ITEM:
      {
        Item item = (Item)theEObject;
        T result = caseItem(item);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.ITEM_DECLARATION:
      {
        ItemDeclaration itemDeclaration = (ItemDeclaration)theEObject;
        T result = caseItemDeclaration(itemDeclaration);
        if (result == null) result = caseItem(itemDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.EXTERNAL_PROCEDURE_DECLARATION:
      {
        ExternalProcedureDeclaration externalProcedureDeclaration = (ExternalProcedureDeclaration)theEObject;
        T result = caseExternalProcedureDeclaration(externalProcedureDeclaration);
        if (result == null) result = caseProcedureContent(externalProcedureDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.VARIABLE_DECLARATION:
      {
        VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
        T result = caseVariableDeclaration(variableDeclaration);
        if (result == null) result = caseItemDeclaration(variableDeclaration);
        if (result == null) result = caseNameDeclaration(variableDeclaration);
        if (result == null) result = caseItem(variableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.VARIABLE_VALUE:
      {
        VariableValue variableValue = (VariableValue)theEObject;
        T result = caseVariableValue(variableValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.INT_LITERAL_EXPRESSION:
      {
        IntLiteralExpression intLiteralExpression = (IntLiteralExpression)theEObject;
        T result = caseIntLiteralExpression(intLiteralExpression);
        if (result == null) result = caseExpression(intLiteralExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.STRING_LITERAL_EXPRESSION:
      {
        StringLiteralExpression stringLiteralExpression = (StringLiteralExpression)theEObject;
        T result = caseStringLiteralExpression(stringLiteralExpression);
        if (result == null) result = caseExpression(stringLiteralExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.BOOLEAN_LITERAL_EXPRESSION:
      {
        BooleanLiteralExpression booleanLiteralExpression = (BooleanLiteralExpression)theEObject;
        T result = caseBooleanLiteralExpression(booleanLiteralExpression);
        if (result == null) result = caseExpression(booleanLiteralExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.NULL_LITERAL_EXPRESSION:
      {
        NullLiteralExpression nullLiteralExpression = (NullLiteralExpression)theEObject;
        T result = caseNullLiteralExpression(nullLiteralExpression);
        if (result == null) result = caseExpression(nullLiteralExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.VARIABLE_REF_EXPRESSION:
      {
        VariableRefExpression variableRefExpression = (VariableRefExpression)theEObject;
        T result = caseVariableRefExpression(variableRefExpression);
        if (result == null) result = caseExpression(variableRefExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.LABEL:
      {
        Label label = (Label)theEObject;
        T result = caseLabel(label);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.ASSIGNMENT_STATEMENT:
      {
        AssignmentStatement assignmentStatement = (AssignmentStatement)theEObject;
        T result = caseAssignmentStatement(assignmentStatement);
        if (result == null) result = caseStatement(assignmentStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.ASSIGNMENT_TARGET:
      {
        AssignmentTarget assignmentTarget = (AssignmentTarget)theEObject;
        T result = caseAssignmentTarget(assignmentTarget);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.VARIABLE_ASSIGNMENT_TARGET:
      {
        VariableAssignmentTarget variableAssignmentTarget = (VariableAssignmentTarget)theEObject;
        T result = caseVariableAssignmentTarget(variableAssignmentTarget);
        if (result == null) result = caseAssignmentTarget(variableAssignmentTarget);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.BLOCK_STATEMENT:
      {
        BlockStatement blockStatement = (BlockStatement)theEObject;
        T result = caseBlockStatement(blockStatement);
        if (result == null) result = caseStatement(blockStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.CASE_STATEMENT:
      {
        CaseStatement caseStatement = (CaseStatement)theEObject;
        T result = caseCaseStatement(caseStatement);
        if (result == null) result = caseStatement(caseStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.CASE_STATEMENT_WHEN_BRANCH:
      {
        CaseStatementWhenBranch caseStatementWhenBranch = (CaseStatementWhenBranch)theEObject;
        T result = caseCaseStatementWhenBranch(caseStatementWhenBranch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.CASE_STATEMENT_ELSE_BRANCH:
      {
        CaseStatementElseBranch caseStatementElseBranch = (CaseStatementElseBranch)theEObject;
        T result = caseCaseStatementElseBranch(caseStatementElseBranch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.CLOSE_STATEMENT:
      {
        CloseStatement closeStatement = (CloseStatement)theEObject;
        T result = caseCloseStatement(closeStatement);
        if (result == null) result = caseStatement(closeStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.CONTINUE_STATEMENT:
      {
        ContinueStatement continueStatement = (ContinueStatement)theEObject;
        T result = caseContinueStatement(continueStatement);
        if (result == null) result = caseStatement(continueStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.EXIT_STATEMENT:
      {
        ExitStatement exitStatement = (ExitStatement)theEObject;
        T result = caseExitStatement(exitStatement);
        if (result == null) result = caseStatement(exitStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.FETCH_STATEMENT:
      {
        FetchStatement fetchStatement = (FetchStatement)theEObject;
        T result = caseFetchStatement(fetchStatement);
        if (result == null) result = caseStatement(fetchStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.FETCH_STATEMENT_INTO_CLAUSE:
      {
        FetchStatementIntoClause fetchStatementIntoClause = (FetchStatementIntoClause)theEObject;
        T result = caseFetchStatementIntoClause(fetchStatementIntoClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.FETCH_STATEMENT_SINGLE_INTO_CLAUSE:
      {
        FetchStatementSingleIntoClause fetchStatementSingleIntoClause = (FetchStatementSingleIntoClause)theEObject;
        T result = caseFetchStatementSingleIntoClause(fetchStatementSingleIntoClause);
        if (result == null) result = caseFetchStatementIntoClause(fetchStatementSingleIntoClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.FETCH_STATEMENT_BULK_INTO_CLAUSE:
      {
        FetchStatementBulkIntoClause fetchStatementBulkIntoClause = (FetchStatementBulkIntoClause)theEObject;
        T result = caseFetchStatementBulkIntoClause(fetchStatementBulkIntoClause);
        if (result == null) result = caseFetchStatementIntoClause(fetchStatementBulkIntoClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.GOTO_STATEMENT:
      {
        GotoStatement gotoStatement = (GotoStatement)theEObject;
        T result = caseGotoStatement(gotoStatement);
        if (result == null) result = caseStatement(gotoStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.IF_STATEMENT:
      {
        IfStatement ifStatement = (IfStatement)theEObject;
        T result = caseIfStatement(ifStatement);
        if (result == null) result = caseStatement(ifStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.IF_STATEMENT_ELSIF_BRANCH:
      {
        IfStatementElsifBranch ifStatementElsifBranch = (IfStatementElsifBranch)theEObject;
        T result = caseIfStatementElsifBranch(ifStatementElsifBranch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.IF_STATEMENT_ELSE_BRANCH:
      {
        IfStatementElseBranch ifStatementElseBranch = (IfStatementElseBranch)theEObject;
        T result = caseIfStatementElseBranch(ifStatementElseBranch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.LOOP_STATEMENT:
      {
        LoopStatement loopStatement = (LoopStatement)theEObject;
        T result = caseLoopStatement(loopStatement);
        if (result == null) result = caseStatement(loopStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.BASIC_LOOP_STATEMENT:
      {
        BasicLoopStatement basicLoopStatement = (BasicLoopStatement)theEObject;
        T result = caseBasicLoopStatement(basicLoopStatement);
        if (result == null) result = caseLoopStatement(basicLoopStatement);
        if (result == null) result = caseStatement(basicLoopStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.WHILE_LOOP_STATEMENT:
      {
        WhileLoopStatement whileLoopStatement = (WhileLoopStatement)theEObject;
        T result = caseWhileLoopStatement(whileLoopStatement);
        if (result == null) result = caseLoopStatement(whileLoopStatement);
        if (result == null) result = caseStatement(whileLoopStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.FOR_LOOP_STATEMENT:
      {
        ForLoopStatement forLoopStatement = (ForLoopStatement)theEObject;
        T result = caseForLoopStatement(forLoopStatement);
        if (result == null) result = caseLoopStatement(forLoopStatement);
        if (result == null) result = caseStatement(forLoopStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.RETURN_STATEMENT:
      {
        ReturnStatement returnStatement = (ReturnStatement)theEObject;
        T result = caseReturnStatement(returnStatement);
        if (result == null) result = caseStatement(returnStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.NULL_STATEMENT:
      {
        NullStatement nullStatement = (NullStatement)theEObject;
        T result = caseNullStatement(nullStatement);
        if (result == null) result = caseStatement(nullStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.RAISE_STATEMENT:
      {
        RaiseStatement raiseStatement = (RaiseStatement)theEObject;
        T result = caseRaiseStatement(raiseStatement);
        if (result == null) result = caseStatement(raiseStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.VARIABLE_REF:
      {
        VariableRef variableRef = (VariableRef)theEObject;
        T result = caseVariableRef(variableRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.QUALIFIED_NAME:
      {
        QualifiedName qualifiedName = (QualifiedName)theEObject;
        T result = caseQualifiedName(qualifiedName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.NAME:
      {
        Name name = (Name)theEObject;
        T result = caseName(name);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.LOOP_VARIABLE_DECLARATION:
      {
        LoopVariableDeclaration loopVariableDeclaration = (LoopVariableDeclaration)theEObject;
        T result = caseLoopVariableDeclaration(loopVariableDeclaration);
        if (result == null) result = caseNameDeclaration(loopVariableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlSqlPackage.NAME_DECLARATION:
      {
        NameDeclaration nameDeclaration = (NameDeclaration)theEObject;
        T result = caseNameDeclaration(nameDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compilation Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compilation Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompilationUnit(CompilationUnit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Procedure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Procedure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcedure(Procedure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackage(plsql.editor.xtext.plSql.Package object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Procedure Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Procedure Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcedureDeclaration(ProcedureDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Procedure Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Procedure Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcedureDefinition(ProcedureDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunction(Function object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterSequence(ParameterSequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterDeclaration(ParameterDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterValue(ParameterValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Procedure Invoker Rights Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Procedure Invoker Rights Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcedureInvokerRightsClause(ProcedureInvokerRightsClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Invoker Rights Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Invoker Rights Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionInvokerRightsClause(FunctionInvokerRightsClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pragma</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pragma</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePragma(Pragma object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pragma Restrict References</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pragma Restrict References</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePragmaRestrictReferences(PragmaRestrictReferences object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pragma Timestamp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pragma Timestamp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePragmaTimestamp(PragmaTimestamp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Procedure Content</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Procedure Content</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcedureContent(ProcedureContent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Procedure Implementation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Procedure Implementation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcedureImplementation(ProcedureImplementation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Content</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Content</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionContent(FunctionContent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Implementation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Implementation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionImplementation(FunctionImplementation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionClause(FunctionClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deterministic Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deterministic Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeterministicClause(DeterministicClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Result Cache Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Result Cache Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResultCacheClause(ResultCacheClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pipelined Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pipelined Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePipelinedClause(PipelinedClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatementBody(StatementBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declare Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declare Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclareSection(DeclareSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItem(Item object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItemDeclaration(ItemDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Procedure Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Procedure Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalProcedureDeclaration(ExternalProcedureDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableDeclaration(VariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableValue(VariableValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Literal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntLiteralExpression(IntLiteralExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Literal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLiteralExpression(StringLiteralExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Literal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanLiteralExpression(BooleanLiteralExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Null Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Null Literal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNullLiteralExpression(NullLiteralExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Ref Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Ref Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableRefExpression(VariableRefExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Label</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabel(Label object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignment Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignment Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignmentStatement(AssignmentStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignment Target</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignment Target</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignmentTarget(AssignmentTarget object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Assignment Target</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Assignment Target</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableAssignmentTarget(VariableAssignmentTarget object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlockStatement(BlockStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCaseStatement(CaseStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case Statement When Branch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case Statement When Branch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCaseStatementWhenBranch(CaseStatementWhenBranch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case Statement Else Branch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case Statement Else Branch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCaseStatementElseBranch(CaseStatementElseBranch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Close Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Close Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCloseStatement(CloseStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Continue Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Continue Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContinueStatement(ContinueStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exit Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exit Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExitStatement(ExitStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fetch Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fetch Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFetchStatement(FetchStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fetch Statement Into Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fetch Statement Into Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFetchStatementIntoClause(FetchStatementIntoClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fetch Statement Single Into Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fetch Statement Single Into Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFetchStatementSingleIntoClause(FetchStatementSingleIntoClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fetch Statement Bulk Into Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fetch Statement Bulk Into Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFetchStatementBulkIntoClause(FetchStatementBulkIntoClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goto Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goto Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGotoStatement(GotoStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfStatement(IfStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Statement Elsif Branch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Statement Elsif Branch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfStatementElsifBranch(IfStatementElsifBranch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Statement Else Branch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Statement Else Branch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfStatementElseBranch(IfStatementElseBranch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Loop Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loop Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoopStatement(LoopStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Loop Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Loop Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicLoopStatement(BasicLoopStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>While Loop Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>While Loop Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhileLoopStatement(WhileLoopStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Loop Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Loop Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForLoopStatement(ForLoopStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Return Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Return Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReturnStatement(ReturnStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Null Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Null Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNullStatement(NullStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Raise Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Raise Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRaiseStatement(RaiseStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableRef(VariableRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qualified Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qualified Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualifiedName(QualifiedName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseName(Name object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Loop Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loop Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoopVariableDeclaration(LoopVariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNameDeclaration(NameDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PlSqlSwitch
