/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlSqlPackageImpl extends EPackageImpl implements PlSqlPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compilationUnitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass procedureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass procedureDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass procedureDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterSequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass procedureInvokerRightsClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionInvokerRightsClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pragmaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pragmaRestrictReferencesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pragmaTimestampEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass procedureContentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass procedureImplementationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionContentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionImplementationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deterministicClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resultCacheClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pipelinedClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declareSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass externalProcedureDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intLiteralExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringLiteralExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanLiteralExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nullLiteralExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableRefExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignmentStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignmentTargetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableAssignmentTargetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass caseStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass caseStatementWhenBranchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass caseStatementElseBranchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass closeStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass continueStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exitStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fetchStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fetchStatementIntoClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fetchStatementSingleIntoClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fetchStatementBulkIntoClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gotoStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifStatementElsifBranchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifStatementElseBranchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loopStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass basicLoopStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whileLoopStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forLoopStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass returnStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nullStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass raiseStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualifiedNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loopVariableDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum invokerRightEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see plsql.editor.xtext.plSql.PlSqlPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PlSqlPackageImpl()
  {
    super(eNS_URI, PlSqlFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link PlSqlPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PlSqlPackage init()
  {
    if (isInited) return (PlSqlPackage)EPackage.Registry.INSTANCE.getEPackage(PlSqlPackage.eNS_URI);

    // Obtain or create and register package
    PlSqlPackageImpl thePlSqlPackage = (PlSqlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PlSqlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PlSqlPackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePlSqlPackage.createPackageContents();

    // Initialize created meta-data
    thePlSqlPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePlSqlPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PlSqlPackage.eNS_URI, thePlSqlPackage);
    return thePlSqlPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompilationUnit()
  {
    return compilationUnitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcedure()
  {
    return procedureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcedure_SchemaName()
  {
    return (EAttribute)procedureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedure_Parameters()
  {
    return (EReference)procedureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedure_InvokerRights()
  {
    return (EReference)procedureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedure_Content()
  {
    return (EReference)procedureEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackage()
  {
    return packageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackage_SchemaName()
  {
    return (EAttribute)packageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackage_InvokerRights()
  {
    return (EReference)packageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackage_Items()
  {
    return (EReference)packageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackage_EndName()
  {
    return (EAttribute)packageEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcedureDeclaration()
  {
    return procedureDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcedureDeclaration_Name()
  {
    return (EAttribute)procedureDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedureDeclaration_Parameters()
  {
    return (EReference)procedureDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcedureDefinition()
  {
    return procedureDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedureDefinition_Parameters()
  {
    return (EReference)procedureDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedureDefinition_Implementation()
  {
    return (EReference)procedureDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunction()
  {
    return functionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunction_SchemaName()
  {
    return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunction_Parameters()
  {
    return (EReference)functionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunction_ReturnType()
  {
    return (EAttribute)functionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunction_FunctionClauses()
  {
    return (EReference)functionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunction_Content()
  {
    return (EReference)functionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterSequence()
  {
    return parameterSequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterSequence_Parameters()
  {
    return (EReference)parameterSequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterDeclaration()
  {
    return parameterDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterDeclaration_Behavior()
  {
    return (EAttribute)parameterDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterDeclaration_DataType()
  {
    return (EAttribute)parameterDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterDeclaration_Value()
  {
    return (EReference)parameterDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterValue()
  {
    return parameterValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterValue_Expression()
  {
    return (EReference)parameterValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcedureInvokerRightsClause()
  {
    return procedureInvokerRightsClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcedureInvokerRightsClause_Right()
  {
    return (EAttribute)procedureInvokerRightsClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionInvokerRightsClause()
  {
    return functionInvokerRightsClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionInvokerRightsClause_Right()
  {
    return (EAttribute)functionInvokerRightsClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPragma()
  {
    return pragmaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPragmaRestrictReferences()
  {
    return pragmaRestrictReferencesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPragmaRestrictReferences_Restrictions()
  {
    return (EAttribute)pragmaRestrictReferencesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPragmaTimestamp()
  {
    return pragmaTimestampEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPragmaTimestamp_Timestamp()
  {
    return (EAttribute)pragmaTimestampEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcedureContent()
  {
    return procedureContentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcedureImplementation()
  {
    return procedureImplementationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedureImplementation_DeclareSection()
  {
    return (EReference)procedureImplementationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedureImplementation_Body()
  {
    return (EReference)procedureImplementationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionContent()
  {
    return functionContentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionImplementation()
  {
    return functionImplementationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionImplementation_DeclareSection()
  {
    return (EReference)functionImplementationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionImplementation_Body()
  {
    return (EReference)functionImplementationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionClause()
  {
    return functionClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeterministicClause()
  {
    return deterministicClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResultCacheClause()
  {
    return resultCacheClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResultCacheClause_DataSources()
  {
    return (EAttribute)resultCacheClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPipelinedClause()
  {
    return pipelinedClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatementBody()
  {
    return statementBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatementBody_Statements()
  {
    return (EReference)statementBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatementBody_EndName()
  {
    return (EAttribute)statementBodyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclareSection()
  {
    return declareSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclareSection_Items()
  {
    return (EReference)declareSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItem()
  {
    return itemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItemDeclaration()
  {
    return itemDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternalProcedureDeclaration()
  {
    return externalProcedureDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDeclaration()
  {
    return variableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDeclaration_IsConstant()
  {
    return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDeclaration_DataType()
  {
    return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDeclaration_IsNotNull()
  {
    return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDeclaration_Value()
  {
    return (EReference)variableDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableValue()
  {
    return variableValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableValue_Expression()
  {
    return (EReference)variableValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntLiteralExpression()
  {
    return intLiteralExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntLiteralExpression_Value()
  {
    return (EAttribute)intLiteralExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringLiteralExpression()
  {
    return stringLiteralExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringLiteralExpression_Value()
  {
    return (EAttribute)stringLiteralExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanLiteralExpression()
  {
    return booleanLiteralExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanLiteralExpression_Value()
  {
    return (EAttribute)booleanLiteralExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNullLiteralExpression()
  {
    return nullLiteralExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableRefExpression()
  {
    return variableRefExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableRefExpression_Variable()
  {
    return (EReference)variableRefExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_Labels()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLabel()
  {
    return labelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabel_Name()
  {
    return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignmentStatement()
  {
    return assignmentStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignmentStatement_Target()
  {
    return (EReference)assignmentStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignmentStatement_Expression()
  {
    return (EReference)assignmentStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignmentTarget()
  {
    return assignmentTargetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableAssignmentTarget()
  {
    return variableAssignmentTargetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableAssignmentTarget_Variable()
  {
    return (EReference)variableAssignmentTargetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlockStatement()
  {
    return blockStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlockStatement_DeclareSection()
  {
    return (EReference)blockStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlockStatement_Body()
  {
    return (EReference)blockStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCaseStatement()
  {
    return caseStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCaseStatement_Expression()
  {
    return (EReference)caseStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCaseStatement_WhenBranches()
  {
    return (EReference)caseStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCaseStatement_ElseBranch()
  {
    return (EReference)caseStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCaseStatement_EndLabel()
  {
    return (EAttribute)caseStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCaseStatementWhenBranch()
  {
    return caseStatementWhenBranchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCaseStatementWhenBranch_Expression()
  {
    return (EReference)caseStatementWhenBranchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCaseStatementWhenBranch_Statements()
  {
    return (EReference)caseStatementWhenBranchEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCaseStatementElseBranch()
  {
    return caseStatementElseBranchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCaseStatementElseBranch_Statements()
  {
    return (EReference)caseStatementElseBranchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCloseStatement()
  {
    return closeStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCloseStatement_Cursor()
  {
    return (EReference)closeStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContinueStatement()
  {
    return continueStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContinueStatement_LabelName()
  {
    return (EAttribute)continueStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContinueStatement_WhenExpression()
  {
    return (EReference)continueStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExitStatement()
  {
    return exitStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExitStatement_LabelName()
  {
    return (EAttribute)exitStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExitStatement_WhenExpression()
  {
    return (EReference)exitStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFetchStatement()
  {
    return fetchStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFetchStatement_Cursor()
  {
    return (EReference)fetchStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFetchStatement_IntoClause()
  {
    return (EReference)fetchStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFetchStatementIntoClause()
  {
    return fetchStatementIntoClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFetchStatementIntoClause_TargetVariables()
  {
    return (EReference)fetchStatementIntoClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFetchStatementSingleIntoClause()
  {
    return fetchStatementSingleIntoClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFetchStatementBulkIntoClause()
  {
    return fetchStatementBulkIntoClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFetchStatementBulkIntoClause_LimitExpression()
  {
    return (EReference)fetchStatementBulkIntoClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGotoStatement()
  {
    return gotoStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGotoStatement_LabelName()
  {
    return (EReference)gotoStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfStatement()
  {
    return ifStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatement_Expression()
  {
    return (EReference)ifStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatement_Statements()
  {
    return (EReference)ifStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatement_ElsifBranches()
  {
    return (EReference)ifStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatement_ElseBranch()
  {
    return (EReference)ifStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfStatementElsifBranch()
  {
    return ifStatementElsifBranchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatementElsifBranch_Expression()
  {
    return (EReference)ifStatementElsifBranchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatementElsifBranch_Statements()
  {
    return (EReference)ifStatementElsifBranchEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfStatementElseBranch()
  {
    return ifStatementElseBranchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatementElseBranch_Statements()
  {
    return (EReference)ifStatementElseBranchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLoopStatement()
  {
    return loopStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoopStatement_Statements()
  {
    return (EReference)loopStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoopStatement_EndLabel()
  {
    return (EAttribute)loopStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBasicLoopStatement()
  {
    return basicLoopStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhileLoopStatement()
  {
    return whileLoopStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhileLoopStatement_Expression()
  {
    return (EReference)whileLoopStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForLoopStatement()
  {
    return forLoopStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForLoopStatement_IndexVariable()
  {
    return (EReference)forLoopStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForLoopStatement_LowerBound()
  {
    return (EReference)forLoopStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForLoopStatement_UpperBound()
  {
    return (EReference)forLoopStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReturnStatement()
  {
    return returnStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReturnStatement_Expression()
  {
    return (EReference)returnStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNullStatement()
  {
    return nullStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRaiseStatement()
  {
    return raiseStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRaiseStatement_ExceptionName()
  {
    return (EAttribute)raiseStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableRef()
  {
    return variableRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableRef_IsHostRef()
  {
    return (EAttribute)variableRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableRef_Name()
  {
    return (EReference)variableRefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualifiedName()
  {
    return qualifiedNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQualifiedName_Names()
  {
    return (EReference)qualifiedNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getName_()
  {
    return nameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getName_Declaration()
  {
    return (EReference)nameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLoopVariableDeclaration()
  {
    return loopVariableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNameDeclaration()
  {
    return nameDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNameDeclaration_Name()
  {
    return (EAttribute)nameDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getInvokerRight()
  {
    return invokerRightEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlSqlFactory getPlSqlFactory()
  {
    return (PlSqlFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    compilationUnitEClass = createEClass(COMPILATION_UNIT);

    procedureEClass = createEClass(PROCEDURE);
    createEAttribute(procedureEClass, PROCEDURE__SCHEMA_NAME);
    createEReference(procedureEClass, PROCEDURE__PARAMETERS);
    createEReference(procedureEClass, PROCEDURE__INVOKER_RIGHTS);
    createEReference(procedureEClass, PROCEDURE__CONTENT);

    packageEClass = createEClass(PACKAGE);
    createEAttribute(packageEClass, PACKAGE__SCHEMA_NAME);
    createEReference(packageEClass, PACKAGE__INVOKER_RIGHTS);
    createEReference(packageEClass, PACKAGE__ITEMS);
    createEAttribute(packageEClass, PACKAGE__END_NAME);

    procedureDeclarationEClass = createEClass(PROCEDURE_DECLARATION);
    createEAttribute(procedureDeclarationEClass, PROCEDURE_DECLARATION__NAME);
    createEReference(procedureDeclarationEClass, PROCEDURE_DECLARATION__PARAMETERS);

    procedureDefinitionEClass = createEClass(PROCEDURE_DEFINITION);
    createEReference(procedureDefinitionEClass, PROCEDURE_DEFINITION__PARAMETERS);
    createEReference(procedureDefinitionEClass, PROCEDURE_DEFINITION__IMPLEMENTATION);

    functionEClass = createEClass(FUNCTION);
    createEAttribute(functionEClass, FUNCTION__SCHEMA_NAME);
    createEReference(functionEClass, FUNCTION__PARAMETERS);
    createEAttribute(functionEClass, FUNCTION__RETURN_TYPE);
    createEReference(functionEClass, FUNCTION__FUNCTION_CLAUSES);
    createEReference(functionEClass, FUNCTION__CONTENT);

    parameterSequenceEClass = createEClass(PARAMETER_SEQUENCE);
    createEReference(parameterSequenceEClass, PARAMETER_SEQUENCE__PARAMETERS);

    parameterDeclarationEClass = createEClass(PARAMETER_DECLARATION);
    createEAttribute(parameterDeclarationEClass, PARAMETER_DECLARATION__BEHAVIOR);
    createEAttribute(parameterDeclarationEClass, PARAMETER_DECLARATION__DATA_TYPE);
    createEReference(parameterDeclarationEClass, PARAMETER_DECLARATION__VALUE);

    parameterValueEClass = createEClass(PARAMETER_VALUE);
    createEReference(parameterValueEClass, PARAMETER_VALUE__EXPRESSION);

    procedureInvokerRightsClauseEClass = createEClass(PROCEDURE_INVOKER_RIGHTS_CLAUSE);
    createEAttribute(procedureInvokerRightsClauseEClass, PROCEDURE_INVOKER_RIGHTS_CLAUSE__RIGHT);

    functionInvokerRightsClauseEClass = createEClass(FUNCTION_INVOKER_RIGHTS_CLAUSE);
    createEAttribute(functionInvokerRightsClauseEClass, FUNCTION_INVOKER_RIGHTS_CLAUSE__RIGHT);

    pragmaEClass = createEClass(PRAGMA);

    pragmaRestrictReferencesEClass = createEClass(PRAGMA_RESTRICT_REFERENCES);
    createEAttribute(pragmaRestrictReferencesEClass, PRAGMA_RESTRICT_REFERENCES__RESTRICTIONS);

    pragmaTimestampEClass = createEClass(PRAGMA_TIMESTAMP);
    createEAttribute(pragmaTimestampEClass, PRAGMA_TIMESTAMP__TIMESTAMP);

    procedureContentEClass = createEClass(PROCEDURE_CONTENT);

    procedureImplementationEClass = createEClass(PROCEDURE_IMPLEMENTATION);
    createEReference(procedureImplementationEClass, PROCEDURE_IMPLEMENTATION__DECLARE_SECTION);
    createEReference(procedureImplementationEClass, PROCEDURE_IMPLEMENTATION__BODY);

    functionContentEClass = createEClass(FUNCTION_CONTENT);

    functionImplementationEClass = createEClass(FUNCTION_IMPLEMENTATION);
    createEReference(functionImplementationEClass, FUNCTION_IMPLEMENTATION__DECLARE_SECTION);
    createEReference(functionImplementationEClass, FUNCTION_IMPLEMENTATION__BODY);

    functionClauseEClass = createEClass(FUNCTION_CLAUSE);

    deterministicClauseEClass = createEClass(DETERMINISTIC_CLAUSE);

    resultCacheClauseEClass = createEClass(RESULT_CACHE_CLAUSE);
    createEAttribute(resultCacheClauseEClass, RESULT_CACHE_CLAUSE__DATA_SOURCES);

    pipelinedClauseEClass = createEClass(PIPELINED_CLAUSE);

    statementBodyEClass = createEClass(STATEMENT_BODY);
    createEReference(statementBodyEClass, STATEMENT_BODY__STATEMENTS);
    createEAttribute(statementBodyEClass, STATEMENT_BODY__END_NAME);

    declareSectionEClass = createEClass(DECLARE_SECTION);
    createEReference(declareSectionEClass, DECLARE_SECTION__ITEMS);

    itemEClass = createEClass(ITEM);

    itemDeclarationEClass = createEClass(ITEM_DECLARATION);

    externalProcedureDeclarationEClass = createEClass(EXTERNAL_PROCEDURE_DECLARATION);

    variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
    createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__IS_CONSTANT);
    createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__DATA_TYPE);
    createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__IS_NOT_NULL);
    createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__VALUE);

    variableValueEClass = createEClass(VARIABLE_VALUE);
    createEReference(variableValueEClass, VARIABLE_VALUE__EXPRESSION);

    expressionEClass = createEClass(EXPRESSION);

    intLiteralExpressionEClass = createEClass(INT_LITERAL_EXPRESSION);
    createEAttribute(intLiteralExpressionEClass, INT_LITERAL_EXPRESSION__VALUE);

    stringLiteralExpressionEClass = createEClass(STRING_LITERAL_EXPRESSION);
    createEAttribute(stringLiteralExpressionEClass, STRING_LITERAL_EXPRESSION__VALUE);

    booleanLiteralExpressionEClass = createEClass(BOOLEAN_LITERAL_EXPRESSION);
    createEAttribute(booleanLiteralExpressionEClass, BOOLEAN_LITERAL_EXPRESSION__VALUE);

    nullLiteralExpressionEClass = createEClass(NULL_LITERAL_EXPRESSION);

    variableRefExpressionEClass = createEClass(VARIABLE_REF_EXPRESSION);
    createEReference(variableRefExpressionEClass, VARIABLE_REF_EXPRESSION__VARIABLE);

    statementEClass = createEClass(STATEMENT);
    createEReference(statementEClass, STATEMENT__LABELS);

    labelEClass = createEClass(LABEL);
    createEAttribute(labelEClass, LABEL__NAME);

    assignmentStatementEClass = createEClass(ASSIGNMENT_STATEMENT);
    createEReference(assignmentStatementEClass, ASSIGNMENT_STATEMENT__TARGET);
    createEReference(assignmentStatementEClass, ASSIGNMENT_STATEMENT__EXPRESSION);

    assignmentTargetEClass = createEClass(ASSIGNMENT_TARGET);

    variableAssignmentTargetEClass = createEClass(VARIABLE_ASSIGNMENT_TARGET);
    createEReference(variableAssignmentTargetEClass, VARIABLE_ASSIGNMENT_TARGET__VARIABLE);

    blockStatementEClass = createEClass(BLOCK_STATEMENT);
    createEReference(blockStatementEClass, BLOCK_STATEMENT__DECLARE_SECTION);
    createEReference(blockStatementEClass, BLOCK_STATEMENT__BODY);

    caseStatementEClass = createEClass(CASE_STATEMENT);
    createEReference(caseStatementEClass, CASE_STATEMENT__EXPRESSION);
    createEReference(caseStatementEClass, CASE_STATEMENT__WHEN_BRANCHES);
    createEReference(caseStatementEClass, CASE_STATEMENT__ELSE_BRANCH);
    createEAttribute(caseStatementEClass, CASE_STATEMENT__END_LABEL);

    caseStatementWhenBranchEClass = createEClass(CASE_STATEMENT_WHEN_BRANCH);
    createEReference(caseStatementWhenBranchEClass, CASE_STATEMENT_WHEN_BRANCH__EXPRESSION);
    createEReference(caseStatementWhenBranchEClass, CASE_STATEMENT_WHEN_BRANCH__STATEMENTS);

    caseStatementElseBranchEClass = createEClass(CASE_STATEMENT_ELSE_BRANCH);
    createEReference(caseStatementElseBranchEClass, CASE_STATEMENT_ELSE_BRANCH__STATEMENTS);

    closeStatementEClass = createEClass(CLOSE_STATEMENT);
    createEReference(closeStatementEClass, CLOSE_STATEMENT__CURSOR);

    continueStatementEClass = createEClass(CONTINUE_STATEMENT);
    createEAttribute(continueStatementEClass, CONTINUE_STATEMENT__LABEL_NAME);
    createEReference(continueStatementEClass, CONTINUE_STATEMENT__WHEN_EXPRESSION);

    exitStatementEClass = createEClass(EXIT_STATEMENT);
    createEAttribute(exitStatementEClass, EXIT_STATEMENT__LABEL_NAME);
    createEReference(exitStatementEClass, EXIT_STATEMENT__WHEN_EXPRESSION);

    fetchStatementEClass = createEClass(FETCH_STATEMENT);
    createEReference(fetchStatementEClass, FETCH_STATEMENT__CURSOR);
    createEReference(fetchStatementEClass, FETCH_STATEMENT__INTO_CLAUSE);

    fetchStatementIntoClauseEClass = createEClass(FETCH_STATEMENT_INTO_CLAUSE);
    createEReference(fetchStatementIntoClauseEClass, FETCH_STATEMENT_INTO_CLAUSE__TARGET_VARIABLES);

    fetchStatementSingleIntoClauseEClass = createEClass(FETCH_STATEMENT_SINGLE_INTO_CLAUSE);

    fetchStatementBulkIntoClauseEClass = createEClass(FETCH_STATEMENT_BULK_INTO_CLAUSE);
    createEReference(fetchStatementBulkIntoClauseEClass, FETCH_STATEMENT_BULK_INTO_CLAUSE__LIMIT_EXPRESSION);

    gotoStatementEClass = createEClass(GOTO_STATEMENT);
    createEReference(gotoStatementEClass, GOTO_STATEMENT__LABEL_NAME);

    ifStatementEClass = createEClass(IF_STATEMENT);
    createEReference(ifStatementEClass, IF_STATEMENT__EXPRESSION);
    createEReference(ifStatementEClass, IF_STATEMENT__STATEMENTS);
    createEReference(ifStatementEClass, IF_STATEMENT__ELSIF_BRANCHES);
    createEReference(ifStatementEClass, IF_STATEMENT__ELSE_BRANCH);

    ifStatementElsifBranchEClass = createEClass(IF_STATEMENT_ELSIF_BRANCH);
    createEReference(ifStatementElsifBranchEClass, IF_STATEMENT_ELSIF_BRANCH__EXPRESSION);
    createEReference(ifStatementElsifBranchEClass, IF_STATEMENT_ELSIF_BRANCH__STATEMENTS);

    ifStatementElseBranchEClass = createEClass(IF_STATEMENT_ELSE_BRANCH);
    createEReference(ifStatementElseBranchEClass, IF_STATEMENT_ELSE_BRANCH__STATEMENTS);

    loopStatementEClass = createEClass(LOOP_STATEMENT);
    createEReference(loopStatementEClass, LOOP_STATEMENT__STATEMENTS);
    createEAttribute(loopStatementEClass, LOOP_STATEMENT__END_LABEL);

    basicLoopStatementEClass = createEClass(BASIC_LOOP_STATEMENT);

    whileLoopStatementEClass = createEClass(WHILE_LOOP_STATEMENT);
    createEReference(whileLoopStatementEClass, WHILE_LOOP_STATEMENT__EXPRESSION);

    forLoopStatementEClass = createEClass(FOR_LOOP_STATEMENT);
    createEReference(forLoopStatementEClass, FOR_LOOP_STATEMENT__INDEX_VARIABLE);
    createEReference(forLoopStatementEClass, FOR_LOOP_STATEMENT__LOWER_BOUND);
    createEReference(forLoopStatementEClass, FOR_LOOP_STATEMENT__UPPER_BOUND);

    returnStatementEClass = createEClass(RETURN_STATEMENT);
    createEReference(returnStatementEClass, RETURN_STATEMENT__EXPRESSION);

    nullStatementEClass = createEClass(NULL_STATEMENT);

    raiseStatementEClass = createEClass(RAISE_STATEMENT);
    createEAttribute(raiseStatementEClass, RAISE_STATEMENT__EXCEPTION_NAME);

    variableRefEClass = createEClass(VARIABLE_REF);
    createEAttribute(variableRefEClass, VARIABLE_REF__IS_HOST_REF);
    createEReference(variableRefEClass, VARIABLE_REF__NAME);

    qualifiedNameEClass = createEClass(QUALIFIED_NAME);
    createEReference(qualifiedNameEClass, QUALIFIED_NAME__NAMES);

    nameEClass = createEClass(NAME);
    createEReference(nameEClass, NAME__DECLARATION);

    loopVariableDeclarationEClass = createEClass(LOOP_VARIABLE_DECLARATION);

    nameDeclarationEClass = createEClass(NAME_DECLARATION);
    createEAttribute(nameDeclarationEClass, NAME_DECLARATION__NAME);

    // Create enums
    invokerRightEEnum = createEEnum(INVOKER_RIGHT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    procedureEClass.getESuperTypes().add(this.getCompilationUnit());
    procedureEClass.getESuperTypes().add(this.getNameDeclaration());
    packageEClass.getESuperTypes().add(this.getCompilationUnit());
    packageEClass.getESuperTypes().add(this.getNameDeclaration());
    procedureDeclarationEClass.getESuperTypes().add(this.getItem());
    procedureDefinitionEClass.getESuperTypes().add(this.getItem());
    procedureDefinitionEClass.getESuperTypes().add(this.getNameDeclaration());
    functionEClass.getESuperTypes().add(this.getCompilationUnit());
    functionEClass.getESuperTypes().add(this.getNameDeclaration());
    parameterDeclarationEClass.getESuperTypes().add(this.getNameDeclaration());
    functionInvokerRightsClauseEClass.getESuperTypes().add(this.getFunctionClause());
    pragmaEClass.getESuperTypes().add(this.getItem());
    pragmaRestrictReferencesEClass.getESuperTypes().add(this.getPragma());
    pragmaTimestampEClass.getESuperTypes().add(this.getPragma());
    procedureImplementationEClass.getESuperTypes().add(this.getProcedureContent());
    functionImplementationEClass.getESuperTypes().add(this.getFunctionContent());
    deterministicClauseEClass.getESuperTypes().add(this.getFunctionClause());
    resultCacheClauseEClass.getESuperTypes().add(this.getFunctionClause());
    pipelinedClauseEClass.getESuperTypes().add(this.getFunctionClause());
    itemDeclarationEClass.getESuperTypes().add(this.getItem());
    externalProcedureDeclarationEClass.getESuperTypes().add(this.getProcedureContent());
    variableDeclarationEClass.getESuperTypes().add(this.getItemDeclaration());
    variableDeclarationEClass.getESuperTypes().add(this.getNameDeclaration());
    intLiteralExpressionEClass.getESuperTypes().add(this.getExpression());
    stringLiteralExpressionEClass.getESuperTypes().add(this.getExpression());
    booleanLiteralExpressionEClass.getESuperTypes().add(this.getExpression());
    nullLiteralExpressionEClass.getESuperTypes().add(this.getExpression());
    variableRefExpressionEClass.getESuperTypes().add(this.getExpression());
    assignmentStatementEClass.getESuperTypes().add(this.getStatement());
    variableAssignmentTargetEClass.getESuperTypes().add(this.getAssignmentTarget());
    blockStatementEClass.getESuperTypes().add(this.getStatement());
    caseStatementEClass.getESuperTypes().add(this.getStatement());
    closeStatementEClass.getESuperTypes().add(this.getStatement());
    continueStatementEClass.getESuperTypes().add(this.getStatement());
    exitStatementEClass.getESuperTypes().add(this.getStatement());
    fetchStatementEClass.getESuperTypes().add(this.getStatement());
    fetchStatementSingleIntoClauseEClass.getESuperTypes().add(this.getFetchStatementIntoClause());
    fetchStatementBulkIntoClauseEClass.getESuperTypes().add(this.getFetchStatementIntoClause());
    gotoStatementEClass.getESuperTypes().add(this.getStatement());
    ifStatementEClass.getESuperTypes().add(this.getStatement());
    loopStatementEClass.getESuperTypes().add(this.getStatement());
    basicLoopStatementEClass.getESuperTypes().add(this.getLoopStatement());
    whileLoopStatementEClass.getESuperTypes().add(this.getLoopStatement());
    forLoopStatementEClass.getESuperTypes().add(this.getLoopStatement());
    returnStatementEClass.getESuperTypes().add(this.getStatement());
    nullStatementEClass.getESuperTypes().add(this.getStatement());
    raiseStatementEClass.getESuperTypes().add(this.getStatement());
    loopVariableDeclarationEClass.getESuperTypes().add(this.getNameDeclaration());

    // Initialize classes and features; add operations and parameters
    initEClass(compilationUnitEClass, CompilationUnit.class, "CompilationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(procedureEClass, Procedure.class, "Procedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProcedure_SchemaName(), ecorePackage.getEString(), "schemaName", null, 0, 1, Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcedure_Parameters(), this.getParameterSequence(), null, "parameters", null, 0, 1, Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcedure_InvokerRights(), this.getProcedureInvokerRightsClause(), null, "invokerRights", null, 0, 1, Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcedure_Content(), this.getProcedureContent(), null, "content", null, 0, 1, Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageEClass, plsql.editor.xtext.plSql.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackage_SchemaName(), ecorePackage.getEString(), "schemaName", null, 0, 1, plsql.editor.xtext.plSql.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackage_InvokerRights(), this.getProcedureInvokerRightsClause(), null, "invokerRights", null, 0, 1, plsql.editor.xtext.plSql.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackage_Items(), this.getItem(), null, "items", null, 0, -1, plsql.editor.xtext.plSql.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPackage_EndName(), ecorePackage.getEString(), "endName", null, 0, 1, plsql.editor.xtext.plSql.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(procedureDeclarationEClass, ProcedureDeclaration.class, "ProcedureDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProcedureDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProcedureDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcedureDeclaration_Parameters(), this.getParameterSequence(), null, "parameters", null, 0, 1, ProcedureDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(procedureDefinitionEClass, ProcedureDefinition.class, "ProcedureDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProcedureDefinition_Parameters(), this.getParameterSequence(), null, "parameters", null, 0, 1, ProcedureDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcedureDefinition_Implementation(), this.getProcedureImplementation(), null, "implementation", null, 0, 1, ProcedureDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunction_SchemaName(), ecorePackage.getEString(), "schemaName", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunction_Parameters(), this.getParameterSequence(), null, "parameters", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunction_ReturnType(), ecorePackage.getEString(), "returnType", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunction_FunctionClauses(), this.getFunctionClause(), null, "functionClauses", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunction_Content(), this.getFunctionContent(), null, "content", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterSequenceEClass, ParameterSequence.class, "ParameterSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterSequence_Parameters(), this.getParameterDeclaration(), null, "parameters", null, 0, -1, ParameterSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterDeclarationEClass, ParameterDeclaration.class, "ParameterDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameterDeclaration_Behavior(), ecorePackage.getEString(), "behavior", null, 0, 1, ParameterDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameterDeclaration_DataType(), ecorePackage.getEString(), "dataType", null, 0, 1, ParameterDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameterDeclaration_Value(), this.getParameterValue(), null, "value", null, 0, 1, ParameterDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterValueEClass, ParameterValue.class, "ParameterValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterValue_Expression(), this.getExpression(), null, "expression", null, 0, 1, ParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(procedureInvokerRightsClauseEClass, ProcedureInvokerRightsClause.class, "ProcedureInvokerRightsClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProcedureInvokerRightsClause_Right(), this.getInvokerRight(), "right", null, 0, 1, ProcedureInvokerRightsClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionInvokerRightsClauseEClass, FunctionInvokerRightsClause.class, "FunctionInvokerRightsClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionInvokerRightsClause_Right(), this.getInvokerRight(), "right", null, 0, 1, FunctionInvokerRightsClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pragmaEClass, Pragma.class, "Pragma", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(pragmaRestrictReferencesEClass, PragmaRestrictReferences.class, "PragmaRestrictReferences", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPragmaRestrictReferences_Restrictions(), ecorePackage.getEString(), "restrictions", null, 0, -1, PragmaRestrictReferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pragmaTimestampEClass, PragmaTimestamp.class, "PragmaTimestamp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPragmaTimestamp_Timestamp(), ecorePackage.getEString(), "timestamp", null, 0, 1, PragmaTimestamp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(procedureContentEClass, ProcedureContent.class, "ProcedureContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(procedureImplementationEClass, ProcedureImplementation.class, "ProcedureImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProcedureImplementation_DeclareSection(), this.getDeclareSection(), null, "declareSection", null, 0, 1, ProcedureImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcedureImplementation_Body(), this.getStatementBody(), null, "body", null, 0, 1, ProcedureImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionContentEClass, FunctionContent.class, "FunctionContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(functionImplementationEClass, FunctionImplementation.class, "FunctionImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionImplementation_DeclareSection(), this.getDeclareSection(), null, "declareSection", null, 0, 1, FunctionImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionImplementation_Body(), this.getStatementBody(), null, "body", null, 0, 1, FunctionImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionClauseEClass, FunctionClause.class, "FunctionClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(deterministicClauseEClass, DeterministicClause.class, "DeterministicClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(resultCacheClauseEClass, ResultCacheClause.class, "ResultCacheClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResultCacheClause_DataSources(), ecorePackage.getEString(), "dataSources", null, 0, -1, ResultCacheClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pipelinedClauseEClass, PipelinedClause.class, "PipelinedClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(statementBodyEClass, StatementBody.class, "StatementBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStatementBody_Statements(), this.getStatement(), null, "statements", null, 0, -1, StatementBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStatementBody_EndName(), ecorePackage.getEString(), "endName", null, 0, 1, StatementBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declareSectionEClass, DeclareSection.class, "DeclareSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeclareSection_Items(), this.getItem(), null, "items", null, 0, -1, DeclareSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(itemDeclarationEClass, ItemDeclaration.class, "ItemDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(externalProcedureDeclarationEClass, ExternalProcedureDeclaration.class, "ExternalProcedureDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableDeclaration_IsConstant(), ecorePackage.getEBoolean(), "isConstant", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDeclaration_DataType(), ecorePackage.getEString(), "dataType", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDeclaration_IsNotNull(), ecorePackage.getEBoolean(), "isNotNull", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableDeclaration_Value(), this.getVariableValue(), null, "value", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableValueEClass, VariableValue.class, "VariableValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableValue_Expression(), this.getExpression(), null, "expression", null, 0, 1, VariableValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(intLiteralExpressionEClass, IntLiteralExpression.class, "IntLiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntLiteralExpression_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntLiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringLiteralExpressionEClass, StringLiteralExpression.class, "StringLiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringLiteralExpression_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringLiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanLiteralExpressionEClass, BooleanLiteralExpression.class, "BooleanLiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanLiteralExpression_Value(), ecorePackage.getEString(), "value", null, 0, 1, BooleanLiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nullLiteralExpressionEClass, NullLiteralExpression.class, "NullLiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variableRefExpressionEClass, VariableRefExpression.class, "VariableRefExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableRefExpression_Variable(), this.getVariableRef(), null, "variable", null, 0, 1, VariableRefExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStatement_Labels(), this.getLabel(), null, "labels", null, 0, -1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLabel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignmentStatementEClass, AssignmentStatement.class, "AssignmentStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssignmentStatement_Target(), this.getAssignmentTarget(), null, "target", null, 0, 1, AssignmentStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssignmentStatement_Expression(), this.getExpression(), null, "expression", null, 0, 1, AssignmentStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignmentTargetEClass, AssignmentTarget.class, "AssignmentTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variableAssignmentTargetEClass, VariableAssignmentTarget.class, "VariableAssignmentTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableAssignmentTarget_Variable(), this.getVariableRef(), null, "variable", null, 0, 1, VariableAssignmentTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(blockStatementEClass, BlockStatement.class, "BlockStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBlockStatement_DeclareSection(), this.getDeclareSection(), null, "declareSection", null, 0, 1, BlockStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBlockStatement_Body(), this.getStatementBody(), null, "body", null, 0, 1, BlockStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(caseStatementEClass, CaseStatement.class, "CaseStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCaseStatement_Expression(), this.getExpression(), null, "expression", null, 0, 1, CaseStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCaseStatement_WhenBranches(), this.getCaseStatementWhenBranch(), null, "whenBranches", null, 0, -1, CaseStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCaseStatement_ElseBranch(), this.getCaseStatementElseBranch(), null, "elseBranch", null, 0, 1, CaseStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCaseStatement_EndLabel(), ecorePackage.getEString(), "endLabel", null, 0, 1, CaseStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(caseStatementWhenBranchEClass, CaseStatementWhenBranch.class, "CaseStatementWhenBranch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCaseStatementWhenBranch_Expression(), this.getExpression(), null, "expression", null, 0, 1, CaseStatementWhenBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCaseStatementWhenBranch_Statements(), this.getStatement(), null, "statements", null, 0, -1, CaseStatementWhenBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(caseStatementElseBranchEClass, CaseStatementElseBranch.class, "CaseStatementElseBranch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCaseStatementElseBranch_Statements(), this.getStatement(), null, "statements", null, 0, -1, CaseStatementElseBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(closeStatementEClass, CloseStatement.class, "CloseStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCloseStatement_Cursor(), this.getVariableRef(), null, "cursor", null, 0, 1, CloseStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(continueStatementEClass, ContinueStatement.class, "ContinueStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContinueStatement_LabelName(), ecorePackage.getEString(), "labelName", null, 0, 1, ContinueStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContinueStatement_WhenExpression(), this.getExpression(), null, "whenExpression", null, 0, 1, ContinueStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exitStatementEClass, ExitStatement.class, "ExitStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExitStatement_LabelName(), ecorePackage.getEString(), "labelName", null, 0, 1, ExitStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExitStatement_WhenExpression(), this.getExpression(), null, "whenExpression", null, 0, 1, ExitStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fetchStatementEClass, FetchStatement.class, "FetchStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFetchStatement_Cursor(), this.getVariableRef(), null, "cursor", null, 0, 1, FetchStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFetchStatement_IntoClause(), this.getFetchStatementIntoClause(), null, "intoClause", null, 0, 1, FetchStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fetchStatementIntoClauseEClass, FetchStatementIntoClause.class, "FetchStatementIntoClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFetchStatementIntoClause_TargetVariables(), this.getVariableRef(), null, "targetVariables", null, 0, -1, FetchStatementIntoClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fetchStatementSingleIntoClauseEClass, FetchStatementSingleIntoClause.class, "FetchStatementSingleIntoClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fetchStatementBulkIntoClauseEClass, FetchStatementBulkIntoClause.class, "FetchStatementBulkIntoClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFetchStatementBulkIntoClause_LimitExpression(), this.getExpression(), null, "limitExpression", null, 0, 1, FetchStatementBulkIntoClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(gotoStatementEClass, GotoStatement.class, "GotoStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGotoStatement_LabelName(), this.getLabel(), null, "labelName", null, 0, 1, GotoStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifStatementEClass, IfStatement.class, "IfStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfStatement_Expression(), this.getExpression(), null, "expression", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfStatement_Statements(), this.getStatement(), null, "statements", null, 0, -1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfStatement_ElsifBranches(), this.getIfStatementElsifBranch(), null, "elsifBranches", null, 0, -1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfStatement_ElseBranch(), this.getIfStatementElseBranch(), null, "elseBranch", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifStatementElsifBranchEClass, IfStatementElsifBranch.class, "IfStatementElsifBranch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfStatementElsifBranch_Expression(), this.getExpression(), null, "expression", null, 0, 1, IfStatementElsifBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfStatementElsifBranch_Statements(), this.getStatement(), null, "statements", null, 0, -1, IfStatementElsifBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifStatementElseBranchEClass, IfStatementElseBranch.class, "IfStatementElseBranch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfStatementElseBranch_Statements(), this.getStatement(), null, "statements", null, 0, -1, IfStatementElseBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loopStatementEClass, LoopStatement.class, "LoopStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLoopStatement_Statements(), this.getStatement(), null, "statements", null, 0, -1, LoopStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoopStatement_EndLabel(), ecorePackage.getEString(), "endLabel", null, 0, 1, LoopStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(basicLoopStatementEClass, BasicLoopStatement.class, "BasicLoopStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(whileLoopStatementEClass, WhileLoopStatement.class, "WhileLoopStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhileLoopStatement_Expression(), this.getExpression(), null, "expression", null, 0, 1, WhileLoopStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(forLoopStatementEClass, ForLoopStatement.class, "ForLoopStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getForLoopStatement_IndexVariable(), this.getLoopVariableDeclaration(), null, "indexVariable", null, 0, 1, ForLoopStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForLoopStatement_LowerBound(), this.getExpression(), null, "lowerBound", null, 0, 1, ForLoopStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForLoopStatement_UpperBound(), this.getExpression(), null, "upperBound", null, 0, 1, ForLoopStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(returnStatementEClass, ReturnStatement.class, "ReturnStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReturnStatement_Expression(), this.getExpression(), null, "expression", null, 0, 1, ReturnStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nullStatementEClass, NullStatement.class, "NullStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(raiseStatementEClass, RaiseStatement.class, "RaiseStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRaiseStatement_ExceptionName(), ecorePackage.getEString(), "exceptionName", null, 0, 1, RaiseStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableRefEClass, VariableRef.class, "VariableRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableRef_IsHostRef(), ecorePackage.getEBoolean(), "isHostRef", null, 0, 1, VariableRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableRef_Name(), this.getQualifiedName(), null, "name", null, 0, 1, VariableRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qualifiedNameEClass, QualifiedName.class, "QualifiedName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQualifiedName_Names(), this.getName_(), null, "names", null, 0, -1, QualifiedName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nameEClass, Name.class, "Name", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getName_Declaration(), this.getNameDeclaration(), null, "declaration", null, 0, 1, Name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loopVariableDeclarationEClass, LoopVariableDeclaration.class, "LoopVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nameDeclarationEClass, NameDeclaration.class, "NameDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNameDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, NameDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(invokerRightEEnum, InvokerRight.class, "InvokerRight");
    addEEnumLiteral(invokerRightEEnum, InvokerRight.CURRENT_USER);
    addEEnumLiteral(invokerRightEEnum, InvokerRight.DEFINER);

    // Create resource
    createResource(eNS_URI);
  }

} //PlSqlPackageImpl
