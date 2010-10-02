package plsql.editor.xtext.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import plsql.editor.xtext.services.PlSqlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPlSqlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_66", "KEYWORD_65", "KEYWORD_63", "KEYWORD_64", "KEYWORD_59", "KEYWORD_60", "KEYWORD_61", "KEYWORD_62", "KEYWORD_54", "KEYWORD_55", "KEYWORD_56", "KEYWORD_57", "KEYWORD_58", "KEYWORD_47", "KEYWORD_48", "KEYWORD_49", "KEYWORD_50", "KEYWORD_51", "KEYWORD_52", "KEYWORD_53", "KEYWORD_43", "KEYWORD_44", "KEYWORD_45", "KEYWORD_46", "KEYWORD_34", "KEYWORD_35", "KEYWORD_36", "KEYWORD_37", "KEYWORD_38", "KEYWORD_39", "KEYWORD_40", "KEYWORD_41", "KEYWORD_42", "KEYWORD_19", "KEYWORD_20", "KEYWORD_21", "KEYWORD_22", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_26", "KEYWORD_27", "KEYWORD_28", "KEYWORD_29", "KEYWORD_30", "KEYWORD_31", "KEYWORD_32", "KEYWORD_33", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "KEYWORD_18", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "RULE_SL_COMMENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "Tokens"
    };
    public static final int RULE_ID=71;
    public static final int RULE_ANY_OTHER=76;
    public static final int KEYWORD_56=14;
    public static final int KEYWORD_19=37;
    public static final int KEYWORD_55=13;
    public static final int KEYWORD_54=12;
    public static final int KEYWORD_17=54;
    public static final int KEYWORD_53=23;
    public static final int KEYWORD_18=55;
    public static final int KEYWORD_52=22;
    public static final int KEYWORD_15=52;
    public static final int KEYWORD_51=21;
    public static final int KEYWORD_16=53;
    public static final int KEYWORD_50=20;
    public static final int KEYWORD_13=62;
    public static final int KEYWORD_14=63;
    public static final int KEYWORD_11=60;
    public static final int EOF=-1;
    public static final int KEYWORD_12=61;
    public static final int KEYWORD_10=59;
    public static final int KEYWORD_59=8;
    public static final int KEYWORD_58=16;
    public static final int KEYWORD_57=15;
    public static final int KEYWORD_6=69;
    public static final int KEYWORD_7=56;
    public static final int KEYWORD_8=57;
    public static final int KEYWORD_9=58;
    public static final int KEYWORD_28=46;
    public static final int KEYWORD_65=5;
    public static final int KEYWORD_29=47;
    public static final int KEYWORD_64=7;
    public static final int RULE_INT=72;
    public static final int KEYWORD_66=4;
    public static final int KEYWORD_61=10;
    public static final int KEYWORD_24=42;
    public static final int KEYWORD_60=9;
    public static final int KEYWORD_25=43;
    public static final int KEYWORD_26=44;
    public static final int KEYWORD_63=6;
    public static final int KEYWORD_27=45;
    public static final int KEYWORD_62=11;
    public static final int KEYWORD_20=38;
    public static final int KEYWORD_21=39;
    public static final int KEYWORD_22=40;
    public static final int KEYWORD_23=41;
    public static final int KEYWORD_30=48;
    public static final int KEYWORD_1=64;
    public static final int KEYWORD_34=28;
    public static final int KEYWORD_5=68;
    public static final int KEYWORD_33=51;
    public static final int KEYWORD_4=67;
    public static final int KEYWORD_32=50;
    public static final int KEYWORD_3=66;
    public static final int KEYWORD_31=49;
    public static final int KEYWORD_2=65;
    public static final int KEYWORD_38=32;
    public static final int KEYWORD_37=31;
    public static final int RULE_SL_COMMENT=70;
    public static final int Tokens=77;
    public static final int KEYWORD_36=30;
    public static final int KEYWORD_35=29;
    public static final int RULE_ML_COMMENT=74;
    public static final int KEYWORD_39=33;
    public static final int RULE_STRING=73;
    public static final int KEYWORD_41=35;
    public static final int KEYWORD_40=34;
    public static final int KEYWORD_43=24;
    public static final int KEYWORD_42=36;
    public static final int KEYWORD_45=26;
    public static final int KEYWORD_44=25;
    public static final int KEYWORD_47=17;
    public static final int RULE_WS=75;
    public static final int KEYWORD_46=27;
    public static final int KEYWORD_49=19;
    public static final int KEYWORD_48=18;

        public InternalPlSqlParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g"; }




     	private PlSqlGrammarAccess grammarAccess;
     	
        public InternalPlSqlParser(TokenStream input, IAstFactory factory, PlSqlGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("plsql/editor/xtext/parser/antlr/internal/InternalPlSql.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "CompilationUnit";	
       	} 
       	   	
       	@Override
       	protected PlSqlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleCompilationUnit
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:72:1: entryRuleCompilationUnit returns [EObject current=null] : iv_ruleCompilationUnit= ruleCompilationUnit EOF ;
    public final EObject entryRuleCompilationUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompilationUnit = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:73:2: (iv_ruleCompilationUnit= ruleCompilationUnit EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:74:2: iv_ruleCompilationUnit= ruleCompilationUnit EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompilationUnitRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompilationUnit_in_entryRuleCompilationUnit67);
            iv_ruleCompilationUnit=ruleCompilationUnit();
            _fsp--;

             current =iv_ruleCompilationUnit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompilationUnit77); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCompilationUnit


    // $ANTLR start ruleCompilationUnit
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:81:1: ruleCompilationUnit returns [EObject current=null] : (this_Procedure_0= ruleProcedure | this_Function_1= ruleFunction | this_Package_2= rulePackage ) ;
    public final EObject ruleCompilationUnit() throws RecognitionException {
        EObject current = null;

        EObject this_Procedure_0 = null;

        EObject this_Function_1 = null;

        EObject this_Package_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:86:6: ( (this_Procedure_0= ruleProcedure | this_Function_1= ruleFunction | this_Package_2= rulePackage ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:87:1: (this_Procedure_0= ruleProcedure | this_Function_1= ruleFunction | this_Package_2= rulePackage )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:87:1: (this_Procedure_0= ruleProcedure | this_Function_1= ruleFunction | this_Package_2= rulePackage )
            int alt1=3;
            switch ( input.LA(1) ) {
            case KEYWORD_60:
                {
                alt1=1;
                }
                break;
            case KEYWORD_57:
                {
                alt1=2;
                }
                break;
            case KEYWORD_52:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("87:1: (this_Procedure_0= ruleProcedure | this_Function_1= ruleFunction | this_Package_2= rulePackage )", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:88:5: this_Procedure_0= ruleProcedure
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCompilationUnitAccess().getProcedureParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleProcedure_in_ruleCompilationUnit124);
                    this_Procedure_0=ruleProcedure();
                    _fsp--;


                            current = this_Procedure_0;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:98:5: this_Function_1= ruleFunction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCompilationUnitAccess().getFunctionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFunction_in_ruleCompilationUnit151);
                    this_Function_1=ruleFunction();
                    _fsp--;


                            current = this_Function_1;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:108:5: this_Package_2= rulePackage
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCompilationUnitAccess().getPackageParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePackage_in_ruleCompilationUnit178);
                    this_Package_2=rulePackage();
                    _fsp--;


                            current = this_Package_2;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCompilationUnit


    // $ANTLR start entryRuleProcedure
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:124:1: entryRuleProcedure returns [EObject current=null] : iv_ruleProcedure= ruleProcedure EOF ;
    public final EObject entryRuleProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedure = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:125:2: (iv_ruleProcedure= ruleProcedure EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:126:2: iv_ruleProcedure= ruleProcedure EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProcedureRule(), currentNode); 
            pushFollow(FOLLOW_ruleProcedure_in_entryRuleProcedure212);
            iv_ruleProcedure=ruleProcedure();
            _fsp--;

             current =iv_ruleProcedure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcedure222); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleProcedure


    // $ANTLR start ruleProcedure
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:133:1: ruleProcedure returns [EObject current=null] : ( KEYWORD_60 ( ( (lv_schemaName_1_0= RULE_ID ) ) KEYWORD_4 )? ( (lv_name_3_0= RULE_ID ) ) ( KEYWORD_1 ( (lv_parameters_5_0= ruleParameterSequence ) ) KEYWORD_2 )? ( (lv_invokerRights_7_0= ruleProcedureInvokerRightsClause ) )? ( KEYWORD_14 | KEYWORD_11 ) ( (lv_content_10_0= ruleProcedureContent ) ) ) ;
    public final EObject ruleProcedure() throws RecognitionException {
        EObject current = null;

        Token lv_schemaName_1_0=null;
        Token lv_name_3_0=null;
        EObject lv_parameters_5_0 = null;

        EObject lv_invokerRights_7_0 = null;

        EObject lv_content_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:138:6: ( ( KEYWORD_60 ( ( (lv_schemaName_1_0= RULE_ID ) ) KEYWORD_4 )? ( (lv_name_3_0= RULE_ID ) ) ( KEYWORD_1 ( (lv_parameters_5_0= ruleParameterSequence ) ) KEYWORD_2 )? ( (lv_invokerRights_7_0= ruleProcedureInvokerRightsClause ) )? ( KEYWORD_14 | KEYWORD_11 ) ( (lv_content_10_0= ruleProcedureContent ) ) ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:139:1: ( KEYWORD_60 ( ( (lv_schemaName_1_0= RULE_ID ) ) KEYWORD_4 )? ( (lv_name_3_0= RULE_ID ) ) ( KEYWORD_1 ( (lv_parameters_5_0= ruleParameterSequence ) ) KEYWORD_2 )? ( (lv_invokerRights_7_0= ruleProcedureInvokerRightsClause ) )? ( KEYWORD_14 | KEYWORD_11 ) ( (lv_content_10_0= ruleProcedureContent ) ) )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:139:1: ( KEYWORD_60 ( ( (lv_schemaName_1_0= RULE_ID ) ) KEYWORD_4 )? ( (lv_name_3_0= RULE_ID ) ) ( KEYWORD_1 ( (lv_parameters_5_0= ruleParameterSequence ) ) KEYWORD_2 )? ( (lv_invokerRights_7_0= ruleProcedureInvokerRightsClause ) )? ( KEYWORD_14 | KEYWORD_11 ) ( (lv_content_10_0= ruleProcedureContent ) ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:140:2: KEYWORD_60 ( ( (lv_schemaName_1_0= RULE_ID ) ) KEYWORD_4 )? ( (lv_name_3_0= RULE_ID ) ) ( KEYWORD_1 ( (lv_parameters_5_0= ruleParameterSequence ) ) KEYWORD_2 )? ( (lv_invokerRights_7_0= ruleProcedureInvokerRightsClause ) )? ( KEYWORD_14 | KEYWORD_11 ) ( (lv_content_10_0= ruleProcedureContent ) )
            {
            match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_ruleProcedure258); 

                    createLeafNode(grammarAccess.getProcedureAccess().getPROCEDUREKeyword_0(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:144:1: ( ( (lv_schemaName_1_0= RULE_ID ) ) KEYWORD_4 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==KEYWORD_4) ) {
                    alt2=1;
                }
            }
            switch (alt2) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:144:2: ( (lv_schemaName_1_0= RULE_ID ) ) KEYWORD_4
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:144:2: ( (lv_schemaName_1_0= RULE_ID ) )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:145:1: (lv_schemaName_1_0= RULE_ID )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:145:1: (lv_schemaName_1_0= RULE_ID )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:146:3: lv_schemaName_1_0= RULE_ID
                    {
                    lv_schemaName_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcedure276); 

                    			createLeafNode(grammarAccess.getProcedureAccess().getSchemaNameIDTerminalRuleCall_1_0_0(), "schemaName"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProcedureRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"schemaName",
                    	        		lv_schemaName_1_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleProcedure292); 

                            createLeafNode(grammarAccess.getProcedureAccess().getFullStopKeyword_1_1(), null); 
                        

                    }
                    break;

            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:173:3: ( (lv_name_3_0= RULE_ID ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:174:1: (lv_name_3_0= RULE_ID )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:174:1: (lv_name_3_0= RULE_ID )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:175:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcedure311); 

            			createLeafNode(grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProcedureRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_3_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:197:2: ( KEYWORD_1 ( (lv_parameters_5_0= ruleParameterSequence ) ) KEYWORD_2 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==KEYWORD_1) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:198:2: KEYWORD_1 ( (lv_parameters_5_0= ruleParameterSequence ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleProcedure328); 

                            createLeafNode(grammarAccess.getProcedureAccess().getLeftParenthesisKeyword_3_0(), null); 
                        
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:202:1: ( (lv_parameters_5_0= ruleParameterSequence ) )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:203:1: (lv_parameters_5_0= ruleParameterSequence )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:203:1: (lv_parameters_5_0= ruleParameterSequence )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:204:3: lv_parameters_5_0= ruleParameterSequence
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProcedureAccess().getParametersParameterSequenceParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameterSequence_in_ruleProcedure349);
                    lv_parameters_5_0=ruleParameterSequence();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProcedureRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"parameters",
                    	        		lv_parameters_5_0, 
                    	        		"ParameterSequence", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleProcedure360); 

                            createLeafNode(grammarAccess.getProcedureAccess().getRightParenthesisKeyword_3_2(), null); 
                        

                    }
                    break;

            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:231:3: ( (lv_invokerRights_7_0= ruleProcedureInvokerRightsClause ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==KEYWORD_63||LA4_0==KEYWORD_51) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:232:1: (lv_invokerRights_7_0= ruleProcedureInvokerRightsClause )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:232:1: (lv_invokerRights_7_0= ruleProcedureInvokerRightsClause )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:233:3: lv_invokerRights_7_0= ruleProcedureInvokerRightsClause
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProcedureAccess().getInvokerRightsProcedureInvokerRightsClauseParserRuleCall_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleProcedureInvokerRightsClause_in_ruleProcedure383);
                    lv_invokerRights_7_0=ruleProcedureInvokerRightsClause();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProcedureRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"invokerRights",
                    	        		lv_invokerRights_7_0, 
                    	        		"ProcedureInvokerRightsClause", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:255:3: ( KEYWORD_14 | KEYWORD_11 )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==KEYWORD_14) ) {
                alt5=1;
            }
            else if ( (LA5_0==KEYWORD_11) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("255:3: ( KEYWORD_14 | KEYWORD_11 )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:256:2: KEYWORD_14
                    {
                    match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleProcedure396); 

                            createLeafNode(grammarAccess.getProcedureAccess().getISKeyword_5_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:262:2: KEYWORD_11
                    {
                    match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleProcedure413); 

                            createLeafNode(grammarAccess.getProcedureAccess().getASKeyword_5_1(), null); 
                        

                    }
                    break;

            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:266:2: ( (lv_content_10_0= ruleProcedureContent ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:267:1: (lv_content_10_0= ruleProcedureContent )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:267:1: (lv_content_10_0= ruleProcedureContent )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:268:3: lv_content_10_0= ruleProcedureContent
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getProcedureAccess().getContentProcedureContentParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleProcedureContent_in_ruleProcedure435);
            lv_content_10_0=ruleProcedureContent();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProcedureRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"content",
            	        		lv_content_10_0, 
            	        		"ProcedureContent", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProcedure


    // $ANTLR start entryRulePackage
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:298:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:299:2: (iv_rulePackage= rulePackage EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:300:2: iv_rulePackage= rulePackage EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPackageRule(), currentNode); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage470);
            iv_rulePackage=rulePackage();
            _fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage480); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePackage


    // $ANTLR start rulePackage
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:307:1: rulePackage returns [EObject current=null] : ( KEYWORD_52 ( ( (lv_schemaName_1_0= RULE_ID ) ) KEYWORD_4 )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_invokerRights_4_0= ruleProcedureInvokerRightsClause ) )? ( KEYWORD_14 | KEYWORD_11 ) ( (lv_items_7_0= ruleItem ) )* KEYWORD_15 ( (lv_endName_9_0= RULE_ID ) )? KEYWORD_6 ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token lv_schemaName_1_0=null;
        Token lv_name_3_0=null;
        Token lv_endName_9_0=null;
        EObject lv_invokerRights_4_0 = null;

        EObject lv_items_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:312:6: ( ( KEYWORD_52 ( ( (lv_schemaName_1_0= RULE_ID ) ) KEYWORD_4 )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_invokerRights_4_0= ruleProcedureInvokerRightsClause ) )? ( KEYWORD_14 | KEYWORD_11 ) ( (lv_items_7_0= ruleItem ) )* KEYWORD_15 ( (lv_endName_9_0= RULE_ID ) )? KEYWORD_6 ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:313:1: ( KEYWORD_52 ( ( (lv_schemaName_1_0= RULE_ID ) ) KEYWORD_4 )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_invokerRights_4_0= ruleProcedureInvokerRightsClause ) )? ( KEYWORD_14 | KEYWORD_11 ) ( (lv_items_7_0= ruleItem ) )* KEYWORD_15 ( (lv_endName_9_0= RULE_ID ) )? KEYWORD_6 )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:313:1: ( KEYWORD_52 ( ( (lv_schemaName_1_0= RULE_ID ) ) KEYWORD_4 )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_invokerRights_4_0= ruleProcedureInvokerRightsClause ) )? ( KEYWORD_14 | KEYWORD_11 ) ( (lv_items_7_0= ruleItem ) )* KEYWORD_15 ( (lv_endName_9_0= RULE_ID ) )? KEYWORD_6 )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:314:2: KEYWORD_52 ( ( (lv_schemaName_1_0= RULE_ID ) ) KEYWORD_4 )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_invokerRights_4_0= ruleProcedureInvokerRightsClause ) )? ( KEYWORD_14 | KEYWORD_11 ) ( (lv_items_7_0= ruleItem ) )* KEYWORD_15 ( (lv_endName_9_0= RULE_ID ) )? KEYWORD_6
            {
            match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_rulePackage516); 

                    createLeafNode(grammarAccess.getPackageAccess().getPACKAGEKeyword_0(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:318:1: ( ( (lv_schemaName_1_0= RULE_ID ) ) KEYWORD_4 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==KEYWORD_4) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:318:2: ( (lv_schemaName_1_0= RULE_ID ) ) KEYWORD_4
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:318:2: ( (lv_schemaName_1_0= RULE_ID ) )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:319:1: (lv_schemaName_1_0= RULE_ID )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:319:1: (lv_schemaName_1_0= RULE_ID )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:320:3: lv_schemaName_1_0= RULE_ID
                    {
                    lv_schemaName_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage534); 

                    			createLeafNode(grammarAccess.getPackageAccess().getSchemaNameIDTerminalRuleCall_1_0_0(), "schemaName"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPackageRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"schemaName",
                    	        		lv_schemaName_1_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rulePackage550); 

                            createLeafNode(grammarAccess.getPackageAccess().getFullStopKeyword_1_1(), null); 
                        

                    }
                    break;

            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:347:3: ( (lv_name_3_0= RULE_ID ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:348:1: (lv_name_3_0= RULE_ID )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:348:1: (lv_name_3_0= RULE_ID )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:349:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage569); 

            			createLeafNode(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPackageRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_3_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:371:2: ( (lv_invokerRights_4_0= ruleProcedureInvokerRightsClause ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==KEYWORD_63||LA7_0==KEYWORD_51) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:372:1: (lv_invokerRights_4_0= ruleProcedureInvokerRightsClause )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:372:1: (lv_invokerRights_4_0= ruleProcedureInvokerRightsClause )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:373:3: lv_invokerRights_4_0= ruleProcedureInvokerRightsClause
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPackageAccess().getInvokerRightsProcedureInvokerRightsClauseParserRuleCall_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleProcedureInvokerRightsClause_in_rulePackage595);
                    lv_invokerRights_4_0=ruleProcedureInvokerRightsClause();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPackageRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"invokerRights",
                    	        		lv_invokerRights_4_0, 
                    	        		"ProcedureInvokerRightsClause", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:395:3: ( KEYWORD_14 | KEYWORD_11 )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==KEYWORD_14) ) {
                alt8=1;
            }
            else if ( (LA8_0==KEYWORD_11) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("395:3: ( KEYWORD_14 | KEYWORD_11 )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:396:2: KEYWORD_14
                    {
                    match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_rulePackage608); 

                            createLeafNode(grammarAccess.getPackageAccess().getISKeyword_4_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:402:2: KEYWORD_11
                    {
                    match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_rulePackage625); 

                            createLeafNode(grammarAccess.getPackageAccess().getASKeyword_4_1(), null); 
                        

                    }
                    break;

            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:406:2: ( (lv_items_7_0= ruleItem ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==KEYWORD_60||LA9_0==KEYWORD_45||LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:407:1: (lv_items_7_0= ruleItem )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:407:1: (lv_items_7_0= ruleItem )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:408:3: lv_items_7_0= ruleItem
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPackageAccess().getItemsItemParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleItem_in_rulePackage647);
            	    lv_items_7_0=ruleItem();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPackageRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"items",
            	    	        		lv_items_7_0, 
            	    	        		"Item", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_rulePackage659); 

                    createLeafNode(grammarAccess.getPackageAccess().getENDKeyword_6(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:435:1: ( (lv_endName_9_0= RULE_ID ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:436:1: (lv_endName_9_0= RULE_ID )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:436:1: (lv_endName_9_0= RULE_ID )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:437:3: lv_endName_9_0= RULE_ID
                    {
                    lv_endName_9_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage676); 

                    			createLeafNode(grammarAccess.getPackageAccess().getEndNameIDTerminalRuleCall_7_0(), "endName"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPackageRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"endName",
                    	        		lv_endName_9_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rulePackage693); 

                    createLeafNode(grammarAccess.getPackageAccess().getSemicolonKeyword_8(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePackage


    // $ANTLR start entryRuleProcedureDeclaration
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:472:1: entryRuleProcedureDeclaration returns [EObject current=null] : iv_ruleProcedureDeclaration= ruleProcedureDeclaration EOF ;
    public final EObject entryRuleProcedureDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedureDeclaration = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:473:2: (iv_ruleProcedureDeclaration= ruleProcedureDeclaration EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:474:2: iv_ruleProcedureDeclaration= ruleProcedureDeclaration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProcedureDeclarationRule(), currentNode); 
            pushFollow(FOLLOW_ruleProcedureDeclaration_in_entryRuleProcedureDeclaration728);
            iv_ruleProcedureDeclaration=ruleProcedureDeclaration();
            _fsp--;

             current =iv_ruleProcedureDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcedureDeclaration738); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleProcedureDeclaration


    // $ANTLR start ruleProcedureDeclaration
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:481:1: ruleProcedureDeclaration returns [EObject current=null] : ( KEYWORD_60 ( (lv_name_1_0= RULE_ID ) ) ( KEYWORD_1 ( (lv_parameters_3_0= ruleParameterSequence ) ) KEYWORD_2 )? KEYWORD_6 ) ;
    public final EObject ruleProcedureDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_parameters_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:486:6: ( ( KEYWORD_60 ( (lv_name_1_0= RULE_ID ) ) ( KEYWORD_1 ( (lv_parameters_3_0= ruleParameterSequence ) ) KEYWORD_2 )? KEYWORD_6 ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:487:1: ( KEYWORD_60 ( (lv_name_1_0= RULE_ID ) ) ( KEYWORD_1 ( (lv_parameters_3_0= ruleParameterSequence ) ) KEYWORD_2 )? KEYWORD_6 )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:487:1: ( KEYWORD_60 ( (lv_name_1_0= RULE_ID ) ) ( KEYWORD_1 ( (lv_parameters_3_0= ruleParameterSequence ) ) KEYWORD_2 )? KEYWORD_6 )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:488:2: KEYWORD_60 ( (lv_name_1_0= RULE_ID ) ) ( KEYWORD_1 ( (lv_parameters_3_0= ruleParameterSequence ) ) KEYWORD_2 )? KEYWORD_6
            {
            match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_ruleProcedureDeclaration774); 

                    createLeafNode(grammarAccess.getProcedureDeclarationAccess().getPROCEDUREKeyword_0(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:492:1: ( (lv_name_1_0= RULE_ID ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:493:1: (lv_name_1_0= RULE_ID )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:493:1: (lv_name_1_0= RULE_ID )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:494:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcedureDeclaration791); 

            			createLeafNode(grammarAccess.getProcedureDeclarationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProcedureDeclarationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:516:2: ( KEYWORD_1 ( (lv_parameters_3_0= ruleParameterSequence ) ) KEYWORD_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==KEYWORD_1) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:517:2: KEYWORD_1 ( (lv_parameters_3_0= ruleParameterSequence ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleProcedureDeclaration808); 

                            createLeafNode(grammarAccess.getProcedureDeclarationAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:521:1: ( (lv_parameters_3_0= ruleParameterSequence ) )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:522:1: (lv_parameters_3_0= ruleParameterSequence )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:522:1: (lv_parameters_3_0= ruleParameterSequence )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:523:3: lv_parameters_3_0= ruleParameterSequence
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProcedureDeclarationAccess().getParametersParameterSequenceParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameterSequence_in_ruleProcedureDeclaration829);
                    lv_parameters_3_0=ruleParameterSequence();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProcedureDeclarationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"parameters",
                    	        		lv_parameters_3_0, 
                    	        		"ParameterSequence", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleProcedureDeclaration840); 

                            createLeafNode(grammarAccess.getProcedureDeclarationAccess().getRightParenthesisKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleProcedureDeclaration853); 

                    createLeafNode(grammarAccess.getProcedureDeclarationAccess().getSemicolonKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProcedureDeclaration


    // $ANTLR start entryRuleProcedureDefinition
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:563:1: entryRuleProcedureDefinition returns [EObject current=null] : iv_ruleProcedureDefinition= ruleProcedureDefinition EOF ;
    public final EObject entryRuleProcedureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedureDefinition = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:564:2: (iv_ruleProcedureDefinition= ruleProcedureDefinition EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:565:2: iv_ruleProcedureDefinition= ruleProcedureDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProcedureDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleProcedureDefinition_in_entryRuleProcedureDefinition888);
            iv_ruleProcedureDefinition=ruleProcedureDefinition();
            _fsp--;

             current =iv_ruleProcedureDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcedureDefinition898); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleProcedureDefinition


    // $ANTLR start ruleProcedureDefinition
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:572:1: ruleProcedureDefinition returns [EObject current=null] : ( KEYWORD_60 ( (lv_name_1_0= RULE_ID ) ) ( KEYWORD_1 ( (lv_parameters_3_0= ruleParameterSequence ) ) KEYWORD_2 )? ( KEYWORD_14 | KEYWORD_11 ) ( (lv_implementation_7_0= ruleProcedureImplementation ) ) ) ;
    public final EObject ruleProcedureDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_implementation_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:577:6: ( ( KEYWORD_60 ( (lv_name_1_0= RULE_ID ) ) ( KEYWORD_1 ( (lv_parameters_3_0= ruleParameterSequence ) ) KEYWORD_2 )? ( KEYWORD_14 | KEYWORD_11 ) ( (lv_implementation_7_0= ruleProcedureImplementation ) ) ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:578:1: ( KEYWORD_60 ( (lv_name_1_0= RULE_ID ) ) ( KEYWORD_1 ( (lv_parameters_3_0= ruleParameterSequence ) ) KEYWORD_2 )? ( KEYWORD_14 | KEYWORD_11 ) ( (lv_implementation_7_0= ruleProcedureImplementation ) ) )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:578:1: ( KEYWORD_60 ( (lv_name_1_0= RULE_ID ) ) ( KEYWORD_1 ( (lv_parameters_3_0= ruleParameterSequence ) ) KEYWORD_2 )? ( KEYWORD_14 | KEYWORD_11 ) ( (lv_implementation_7_0= ruleProcedureImplementation ) ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:579:2: KEYWORD_60 ( (lv_name_1_0= RULE_ID ) ) ( KEYWORD_1 ( (lv_parameters_3_0= ruleParameterSequence ) ) KEYWORD_2 )? ( KEYWORD_14 | KEYWORD_11 ) ( (lv_implementation_7_0= ruleProcedureImplementation ) )
            {
            match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_ruleProcedureDefinition934); 

                    createLeafNode(grammarAccess.getProcedureDefinitionAccess().getPROCEDUREKeyword_0(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:583:1: ( (lv_name_1_0= RULE_ID ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:584:1: (lv_name_1_0= RULE_ID )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:584:1: (lv_name_1_0= RULE_ID )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:585:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcedureDefinition951); 

            			createLeafNode(grammarAccess.getProcedureDefinitionAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProcedureDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:607:2: ( KEYWORD_1 ( (lv_parameters_3_0= ruleParameterSequence ) ) KEYWORD_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==KEYWORD_1) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:608:2: KEYWORD_1 ( (lv_parameters_3_0= ruleParameterSequence ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleProcedureDefinition968); 

                            createLeafNode(grammarAccess.getProcedureDefinitionAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:612:1: ( (lv_parameters_3_0= ruleParameterSequence ) )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:613:1: (lv_parameters_3_0= ruleParameterSequence )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:613:1: (lv_parameters_3_0= ruleParameterSequence )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:614:3: lv_parameters_3_0= ruleParameterSequence
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProcedureDefinitionAccess().getParametersParameterSequenceParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameterSequence_in_ruleProcedureDefinition989);
                    lv_parameters_3_0=ruleParameterSequence();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProcedureDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"parameters",
                    	        		lv_parameters_3_0, 
                    	        		"ParameterSequence", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleProcedureDefinition1000); 

                            createLeafNode(grammarAccess.getProcedureDefinitionAccess().getRightParenthesisKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:641:3: ( KEYWORD_14 | KEYWORD_11 )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==KEYWORD_14) ) {
                alt13=1;
            }
            else if ( (LA13_0==KEYWORD_11) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("641:3: ( KEYWORD_14 | KEYWORD_11 )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:642:2: KEYWORD_14
                    {
                    match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleProcedureDefinition1014); 

                            createLeafNode(grammarAccess.getProcedureDefinitionAccess().getISKeyword_3_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:648:2: KEYWORD_11
                    {
                    match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleProcedureDefinition1031); 

                            createLeafNode(grammarAccess.getProcedureDefinitionAccess().getASKeyword_3_1(), null); 
                        

                    }
                    break;

            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:652:2: ( (lv_implementation_7_0= ruleProcedureImplementation ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:653:1: (lv_implementation_7_0= ruleProcedureImplementation )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:653:1: (lv_implementation_7_0= ruleProcedureImplementation )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:654:3: lv_implementation_7_0= ruleProcedureImplementation
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getProcedureDefinitionAccess().getImplementationProcedureImplementationParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleProcedureImplementation_in_ruleProcedureDefinition1053);
            lv_implementation_7_0=ruleProcedureImplementation();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProcedureDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"implementation",
            	        		lv_implementation_7_0, 
            	        		"ProcedureImplementation", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProcedureDefinition


    // $ANTLR start entryRuleFunction
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:684:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:685:2: (iv_ruleFunction= ruleFunction EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:686:2: iv_ruleFunction= ruleFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction1088);
            iv_ruleFunction=ruleFunction();
            _fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction1098); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFunction


    // $ANTLR start ruleFunction
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:693:1: ruleFunction returns [EObject current=null] : ( KEYWORD_57 ( ( (lv_schemaName_1_0= RULE_ID ) ) KEYWORD_4 )? ( (lv_name_3_0= RULE_ID ) ) ( KEYWORD_1 ( (lv_parameters_5_0= ruleParameterSequence ) ) KEYWORD_2 )? KEYWORD_46 ( (lv_returnType_8_0= ruleDataType ) ) ( (lv_functionClauses_9_0= ruleFunctionClause ) ) ( KEYWORD_14 | KEYWORD_11 ) ( (lv_content_12_0= ruleFunctionContent ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_schemaName_1_0=null;
        Token lv_name_3_0=null;
        EObject lv_parameters_5_0 = null;

        AntlrDatatypeRuleToken lv_returnType_8_0 = null;

        EObject lv_functionClauses_9_0 = null;

        EObject lv_content_12_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:698:6: ( ( KEYWORD_57 ( ( (lv_schemaName_1_0= RULE_ID ) ) KEYWORD_4 )? ( (lv_name_3_0= RULE_ID ) ) ( KEYWORD_1 ( (lv_parameters_5_0= ruleParameterSequence ) ) KEYWORD_2 )? KEYWORD_46 ( (lv_returnType_8_0= ruleDataType ) ) ( (lv_functionClauses_9_0= ruleFunctionClause ) ) ( KEYWORD_14 | KEYWORD_11 ) ( (lv_content_12_0= ruleFunctionContent ) ) ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:699:1: ( KEYWORD_57 ( ( (lv_schemaName_1_0= RULE_ID ) ) KEYWORD_4 )? ( (lv_name_3_0= RULE_ID ) ) ( KEYWORD_1 ( (lv_parameters_5_0= ruleParameterSequence ) ) KEYWORD_2 )? KEYWORD_46 ( (lv_returnType_8_0= ruleDataType ) ) ( (lv_functionClauses_9_0= ruleFunctionClause ) ) ( KEYWORD_14 | KEYWORD_11 ) ( (lv_content_12_0= ruleFunctionContent ) ) )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:699:1: ( KEYWORD_57 ( ( (lv_schemaName_1_0= RULE_ID ) ) KEYWORD_4 )? ( (lv_name_3_0= RULE_ID ) ) ( KEYWORD_1 ( (lv_parameters_5_0= ruleParameterSequence ) ) KEYWORD_2 )? KEYWORD_46 ( (lv_returnType_8_0= ruleDataType ) ) ( (lv_functionClauses_9_0= ruleFunctionClause ) ) ( KEYWORD_14 | KEYWORD_11 ) ( (lv_content_12_0= ruleFunctionContent ) ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:700:2: KEYWORD_57 ( ( (lv_schemaName_1_0= RULE_ID ) ) KEYWORD_4 )? ( (lv_name_3_0= RULE_ID ) ) ( KEYWORD_1 ( (lv_parameters_5_0= ruleParameterSequence ) ) KEYWORD_2 )? KEYWORD_46 ( (lv_returnType_8_0= ruleDataType ) ) ( (lv_functionClauses_9_0= ruleFunctionClause ) ) ( KEYWORD_14 | KEYWORD_11 ) ( (lv_content_12_0= ruleFunctionContent ) )
            {
            match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_ruleFunction1134); 

                    createLeafNode(grammarAccess.getFunctionAccess().getFUNCTIONKeyword_0(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:704:1: ( ( (lv_schemaName_1_0= RULE_ID ) ) KEYWORD_4 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==KEYWORD_4) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:704:2: ( (lv_schemaName_1_0= RULE_ID ) ) KEYWORD_4
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:704:2: ( (lv_schemaName_1_0= RULE_ID ) )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:705:1: (lv_schemaName_1_0= RULE_ID )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:705:1: (lv_schemaName_1_0= RULE_ID )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:706:3: lv_schemaName_1_0= RULE_ID
                    {
                    lv_schemaName_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction1152); 

                    			createLeafNode(grammarAccess.getFunctionAccess().getSchemaNameIDTerminalRuleCall_1_0_0(), "schemaName"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"schemaName",
                    	        		lv_schemaName_1_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleFunction1168); 

                            createLeafNode(grammarAccess.getFunctionAccess().getFullStopKeyword_1_1(), null); 
                        

                    }
                    break;

            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:733:3: ( (lv_name_3_0= RULE_ID ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:734:1: (lv_name_3_0= RULE_ID )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:734:1: (lv_name_3_0= RULE_ID )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:735:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction1187); 

            			createLeafNode(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_3_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:757:2: ( KEYWORD_1 ( (lv_parameters_5_0= ruleParameterSequence ) ) KEYWORD_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==KEYWORD_1) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:758:2: KEYWORD_1 ( (lv_parameters_5_0= ruleParameterSequence ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleFunction1204); 

                            createLeafNode(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_3_0(), null); 
                        
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:762:1: ( (lv_parameters_5_0= ruleParameterSequence ) )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:763:1: (lv_parameters_5_0= ruleParameterSequence )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:763:1: (lv_parameters_5_0= ruleParameterSequence )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:764:3: lv_parameters_5_0= ruleParameterSequence
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFunctionAccess().getParametersParameterSequenceParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameterSequence_in_ruleFunction1225);
                    lv_parameters_5_0=ruleParameterSequence();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"parameters",
                    	        		lv_parameters_5_0, 
                    	        		"ParameterSequence", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleFunction1236); 

                            createLeafNode(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_3_2(), null); 
                        

                    }
                    break;

            }

            match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_ruleFunction1249); 

                    createLeafNode(grammarAccess.getFunctionAccess().getRETURNKeyword_4(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:796:1: ( (lv_returnType_8_0= ruleDataType ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:797:1: (lv_returnType_8_0= ruleDataType )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:797:1: (lv_returnType_8_0= ruleDataType )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:798:3: lv_returnType_8_0= ruleDataType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFunctionAccess().getReturnTypeDataTypeParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDataType_in_ruleFunction1270);
            lv_returnType_8_0=ruleDataType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"returnType",
            	        		lv_returnType_8_0, 
            	        		"DataType", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:820:2: ( (lv_functionClauses_9_0= ruleFunctionClause ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:821:1: (lv_functionClauses_9_0= ruleFunctionClause )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:821:1: (lv_functionClauses_9_0= ruleFunctionClause )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:822:3: lv_functionClauses_9_0= ruleFunctionClause
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFunctionAccess().getFunctionClausesFunctionClauseParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFunctionClause_in_ruleFunction1291);
            lv_functionClauses_9_0=ruleFunctionClause();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"functionClauses",
            	        		lv_functionClauses_9_0, 
            	        		"FunctionClause", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:844:2: ( KEYWORD_14 | KEYWORD_11 )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==KEYWORD_14) ) {
                alt16=1;
            }
            else if ( (LA16_0==KEYWORD_11) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("844:2: ( KEYWORD_14 | KEYWORD_11 )", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:845:2: KEYWORD_14
                    {
                    match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleFunction1303); 

                            createLeafNode(grammarAccess.getFunctionAccess().getISKeyword_7_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:851:2: KEYWORD_11
                    {
                    match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleFunction1320); 

                            createLeafNode(grammarAccess.getFunctionAccess().getASKeyword_7_1(), null); 
                        

                    }
                    break;

            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:855:2: ( (lv_content_12_0= ruleFunctionContent ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:856:1: (lv_content_12_0= ruleFunctionContent )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:856:1: (lv_content_12_0= ruleFunctionContent )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:857:3: lv_content_12_0= ruleFunctionContent
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFunctionAccess().getContentFunctionContentParserRuleCall_8_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFunctionContent_in_ruleFunction1342);
            lv_content_12_0=ruleFunctionContent();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"content",
            	        		lv_content_12_0, 
            	        		"FunctionContent", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFunction


    // $ANTLR start entryRuleParameterSequence
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:887:1: entryRuleParameterSequence returns [EObject current=null] : iv_ruleParameterSequence= ruleParameterSequence EOF ;
    public final EObject entryRuleParameterSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterSequence = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:888:2: (iv_ruleParameterSequence= ruleParameterSequence EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:889:2: iv_ruleParameterSequence= ruleParameterSequence EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParameterSequenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameterSequence_in_entryRuleParameterSequence1377);
            iv_ruleParameterSequence=ruleParameterSequence();
            _fsp--;

             current =iv_ruleParameterSequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterSequence1387); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParameterSequence


    // $ANTLR start ruleParameterSequence
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:896:1: ruleParameterSequence returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleParameterDeclaration ) ) ( KEYWORD_3 ( (lv_parameters_2_0= ruleParameterDeclaration ) ) )* ) ;
    public final EObject ruleParameterSequence() throws RecognitionException {
        EObject current = null;

        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:901:6: ( ( ( (lv_parameters_0_0= ruleParameterDeclaration ) ) ( KEYWORD_3 ( (lv_parameters_2_0= ruleParameterDeclaration ) ) )* ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:902:1: ( ( (lv_parameters_0_0= ruleParameterDeclaration ) ) ( KEYWORD_3 ( (lv_parameters_2_0= ruleParameterDeclaration ) ) )* )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:902:1: ( ( (lv_parameters_0_0= ruleParameterDeclaration ) ) ( KEYWORD_3 ( (lv_parameters_2_0= ruleParameterDeclaration ) ) )* )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:902:2: ( (lv_parameters_0_0= ruleParameterDeclaration ) ) ( KEYWORD_3 ( (lv_parameters_2_0= ruleParameterDeclaration ) ) )*
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:902:2: ( (lv_parameters_0_0= ruleParameterDeclaration ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:903:1: (lv_parameters_0_0= ruleParameterDeclaration )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:903:1: (lv_parameters_0_0= ruleParameterDeclaration )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:904:3: lv_parameters_0_0= ruleParameterDeclaration
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getParameterSequenceAccess().getParametersParameterDeclarationParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleParameterSequence1433);
            lv_parameters_0_0=ruleParameterDeclaration();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getParameterSequenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"parameters",
            	        		lv_parameters_0_0, 
            	        		"ParameterDeclaration", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:926:2: ( KEYWORD_3 ( (lv_parameters_2_0= ruleParameterDeclaration ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==KEYWORD_3) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:927:2: KEYWORD_3 ( (lv_parameters_2_0= ruleParameterDeclaration ) )
            	    {
            	    match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleParameterSequence1445); 

            	            createLeafNode(grammarAccess.getParameterSequenceAccess().getCommaKeyword_1_0(), null); 
            	        
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:931:1: ( (lv_parameters_2_0= ruleParameterDeclaration ) )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:932:1: (lv_parameters_2_0= ruleParameterDeclaration )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:932:1: (lv_parameters_2_0= ruleParameterDeclaration )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:933:3: lv_parameters_2_0= ruleParameterDeclaration
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getParameterSequenceAccess().getParametersParameterDeclarationParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleParameterSequence1466);
            	    lv_parameters_2_0=ruleParameterDeclaration();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getParameterSequenceRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"parameters",
            	    	        		lv_parameters_2_0, 
            	    	        		"ParameterDeclaration", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleParameterSequence


    // $ANTLR start entryRuleParameterDeclaration
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:963:1: entryRuleParameterDeclaration returns [EObject current=null] : iv_ruleParameterDeclaration= ruleParameterDeclaration EOF ;
    public final EObject entryRuleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDeclaration = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:964:2: (iv_ruleParameterDeclaration= ruleParameterDeclaration EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:965:2: iv_ruleParameterDeclaration= ruleParameterDeclaration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParameterDeclarationRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration1503);
            iv_ruleParameterDeclaration=ruleParameterDeclaration();
            _fsp--;

             current =iv_ruleParameterDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclaration1513); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParameterDeclaration


    // $ANTLR start ruleParameterDeclaration
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:972:1: ruleParameterDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_behavior_1_0= ruleParameterBehavior ) )? ( (lv_dataType_2_0= ruleDataType ) ) ( (lv_value_3_0= ruleParameterValue ) )? ) ;
    public final EObject ruleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        AntlrDatatypeRuleToken lv_behavior_1_0 = null;

        AntlrDatatypeRuleToken lv_dataType_2_0 = null;

        EObject lv_value_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:977:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_behavior_1_0= ruleParameterBehavior ) )? ( (lv_dataType_2_0= ruleDataType ) ) ( (lv_value_3_0= ruleParameterValue ) )? ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:978:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_behavior_1_0= ruleParameterBehavior ) )? ( (lv_dataType_2_0= ruleDataType ) ) ( (lv_value_3_0= ruleParameterValue ) )? )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:978:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_behavior_1_0= ruleParameterBehavior ) )? ( (lv_dataType_2_0= ruleDataType ) ) ( (lv_value_3_0= ruleParameterValue ) )? )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:978:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_behavior_1_0= ruleParameterBehavior ) )? ( (lv_dataType_2_0= ruleDataType ) ) ( (lv_value_3_0= ruleParameterValue ) )?
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:978:2: ( (lv_name_0_0= RULE_ID ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:979:1: (lv_name_0_0= RULE_ID )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:979:1: (lv_name_0_0= RULE_ID )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:980:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterDeclaration1555); 

            			createLeafNode(grammarAccess.getParameterDeclarationAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getParameterDeclarationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1002:2: ( (lv_behavior_1_0= ruleParameterBehavior ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==KEYWORD_18||LA18_0==KEYWORD_13) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1003:1: (lv_behavior_1_0= ruleParameterBehavior )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1003:1: (lv_behavior_1_0= ruleParameterBehavior )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1004:3: lv_behavior_1_0= ruleParameterBehavior
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getParameterDeclarationAccess().getBehaviorParameterBehaviorParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameterBehavior_in_ruleParameterDeclaration1581);
                    lv_behavior_1_0=ruleParameterBehavior();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getParameterDeclarationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"behavior",
                    	        		lv_behavior_1_0, 
                    	        		"ParameterBehavior", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1026:3: ( (lv_dataType_2_0= ruleDataType ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1027:1: (lv_dataType_2_0= ruleDataType )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1027:1: (lv_dataType_2_0= ruleDataType )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1028:3: lv_dataType_2_0= ruleDataType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getParameterDeclarationAccess().getDataTypeDataTypeParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDataType_in_ruleParameterDeclaration1603);
            lv_dataType_2_0=ruleDataType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getParameterDeclarationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"dataType",
            	        		lv_dataType_2_0, 
            	        		"DataType", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1050:2: ( (lv_value_3_0= ruleParameterValue ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==KEYWORD_50||LA19_0==KEYWORD_8) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1051:1: (lv_value_3_0= ruleParameterValue )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1051:1: (lv_value_3_0= ruleParameterValue )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1052:3: lv_value_3_0= ruleParameterValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getParameterDeclarationAccess().getValueParameterValueParserRuleCall_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameterValue_in_ruleParameterDeclaration1624);
                    lv_value_3_0=ruleParameterValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getParameterDeclarationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_3_0, 
                    	        		"ParameterValue", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleParameterDeclaration


    // $ANTLR start entryRuleParameterValue
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1082:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1083:2: (iv_ruleParameterValue= ruleParameterValue EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1084:2: iv_ruleParameterValue= ruleParameterValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParameterValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameterValue_in_entryRuleParameterValue1660);
            iv_ruleParameterValue=ruleParameterValue();
            _fsp--;

             current =iv_ruleParameterValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterValue1670); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParameterValue


    // $ANTLR start ruleParameterValue
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1091:1: ruleParameterValue returns [EObject current=null] : ( ( KEYWORD_8 | KEYWORD_50 ) ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1096:6: ( ( ( KEYWORD_8 | KEYWORD_50 ) ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1097:1: ( ( KEYWORD_8 | KEYWORD_50 ) ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1097:1: ( ( KEYWORD_8 | KEYWORD_50 ) ( (lv_expression_2_0= ruleExpression ) ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1097:2: ( KEYWORD_8 | KEYWORD_50 ) ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1097:2: ( KEYWORD_8 | KEYWORD_50 )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==KEYWORD_8) ) {
                alt20=1;
            }
            else if ( (LA20_0==KEYWORD_50) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1097:2: ( KEYWORD_8 | KEYWORD_50 )", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1098:2: KEYWORD_8
                    {
                    match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleParameterValue1707); 

                            createLeafNode(grammarAccess.getParameterValueAccess().getColonEqualsSignKeyword_0_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1104:2: KEYWORD_50
                    {
                    match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_ruleParameterValue1724); 

                            createLeafNode(grammarAccess.getParameterValueAccess().getDEFAULTKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1108:2: ( (lv_expression_2_0= ruleExpression ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1109:1: (lv_expression_2_0= ruleExpression )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1109:1: (lv_expression_2_0= ruleExpression )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1110:3: lv_expression_2_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getParameterValueAccess().getExpressionExpressionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleParameterValue1746);
            lv_expression_2_0=ruleExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getParameterValueRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"expression",
            	        		lv_expression_2_0, 
            	        		"Expression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleParameterValue


    // $ANTLR start entryRuleParameterBehavior
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1140:1: entryRuleParameterBehavior returns [String current=null] : iv_ruleParameterBehavior= ruleParameterBehavior EOF ;
    public final String entryRuleParameterBehavior() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterBehavior = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1141:1: (iv_ruleParameterBehavior= ruleParameterBehavior EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1142:2: iv_ruleParameterBehavior= ruleParameterBehavior EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParameterBehaviorRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameterBehavior_in_entryRuleParameterBehavior1782);
            iv_ruleParameterBehavior=ruleParameterBehavior();
            _fsp--;

             current =iv_ruleParameterBehavior.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterBehavior1793); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParameterBehavior


    // $ANTLR start ruleParameterBehavior
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1149:1: ruleParameterBehavior returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_13 | (kw= KEYWORD_18 (kw= KEYWORD_43 )? ) | (kw= KEYWORD_13 kw= KEYWORD_18 (kw= KEYWORD_43 )? ) ) ;
    public final AntlrDatatypeRuleToken ruleParameterBehavior() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1154:6: ( (kw= KEYWORD_13 | (kw= KEYWORD_18 (kw= KEYWORD_43 )? ) | (kw= KEYWORD_13 kw= KEYWORD_18 (kw= KEYWORD_43 )? ) ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1155:1: (kw= KEYWORD_13 | (kw= KEYWORD_18 (kw= KEYWORD_43 )? ) | (kw= KEYWORD_13 kw= KEYWORD_18 (kw= KEYWORD_43 )? ) )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1155:1: (kw= KEYWORD_13 | (kw= KEYWORD_18 (kw= KEYWORD_43 )? ) | (kw= KEYWORD_13 kw= KEYWORD_18 (kw= KEYWORD_43 )? ) )
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==KEYWORD_13) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==KEYWORD_18) ) {
                    alt23=3;
                }
                else if ( (LA23_1==EOF||(LA23_1>=KEYWORD_58 && LA23_1<=KEYWORD_47)||LA23_1==KEYWORD_44||LA23_1==RULE_ID) ) {
                    alt23=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1155:1: (kw= KEYWORD_13 | (kw= KEYWORD_18 (kw= KEYWORD_43 )? ) | (kw= KEYWORD_13 kw= KEYWORD_18 (kw= KEYWORD_43 )? ) )", 23, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA23_0==KEYWORD_18) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1155:1: (kw= KEYWORD_13 | (kw= KEYWORD_18 (kw= KEYWORD_43 )? ) | (kw= KEYWORD_13 kw= KEYWORD_18 (kw= KEYWORD_43 )? ) )", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1156:2: kw= KEYWORD_13
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleParameterBehavior1831); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getParameterBehaviorAccess().getINKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1162:6: (kw= KEYWORD_18 (kw= KEYWORD_43 )? )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1162:6: (kw= KEYWORD_18 (kw= KEYWORD_43 )? )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1163:2: kw= KEYWORD_18 (kw= KEYWORD_43 )?
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleParameterBehavior1851); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getParameterBehaviorAccess().getOUTKeyword_1_0(), null); 
                        
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1168:1: (kw= KEYWORD_43 )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==KEYWORD_43) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1169:2: kw= KEYWORD_43
                            {
                            kw=(Token)input.LT(1);
                            match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_ruleParameterBehavior1865); 

                                    current.merge(kw);
                                    createLeafNode(grammarAccess.getParameterBehaviorAccess().getNOCOPYKeyword_1_1(), null); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1175:6: (kw= KEYWORD_13 kw= KEYWORD_18 (kw= KEYWORD_43 )? )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1175:6: (kw= KEYWORD_13 kw= KEYWORD_18 (kw= KEYWORD_43 )? )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1176:2: kw= KEYWORD_13 kw= KEYWORD_18 (kw= KEYWORD_43 )?
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleParameterBehavior1888); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getParameterBehaviorAccess().getINKeyword_2_0(), null); 
                        
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleParameterBehavior1901); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getParameterBehaviorAccess().getOUTKeyword_2_1(), null); 
                        
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1187:1: (kw= KEYWORD_43 )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==KEYWORD_43) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1188:2: kw= KEYWORD_43
                            {
                            kw=(Token)input.LT(1);
                            match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_ruleParameterBehavior1915); 

                                    current.merge(kw);
                                    createLeafNode(grammarAccess.getParameterBehaviorAccess().getNOCOPYKeyword_2_2(), null); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleParameterBehavior


    // $ANTLR start entryRuleProcedureInvokerRightsClause
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1201:1: entryRuleProcedureInvokerRightsClause returns [EObject current=null] : iv_ruleProcedureInvokerRightsClause= ruleProcedureInvokerRightsClause EOF ;
    public final EObject entryRuleProcedureInvokerRightsClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedureInvokerRightsClause = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1202:2: (iv_ruleProcedureInvokerRightsClause= ruleProcedureInvokerRightsClause EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1203:2: iv_ruleProcedureInvokerRightsClause= ruleProcedureInvokerRightsClause EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProcedureInvokerRightsClauseRule(), currentNode); 
            pushFollow(FOLLOW_ruleProcedureInvokerRightsClause_in_entryRuleProcedureInvokerRightsClause1957);
            iv_ruleProcedureInvokerRightsClause=ruleProcedureInvokerRightsClause();
            _fsp--;

             current =iv_ruleProcedureInvokerRightsClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcedureInvokerRightsClause1967); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleProcedureInvokerRightsClause


    // $ANTLR start ruleProcedureInvokerRightsClause
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1210:1: ruleProcedureInvokerRightsClause returns [EObject current=null] : ( (lv_right_0_0= ruleInvokerRight ) ) ;
    public final EObject ruleProcedureInvokerRightsClause() throws RecognitionException {
        EObject current = null;

        Enumerator lv_right_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1215:6: ( ( (lv_right_0_0= ruleInvokerRight ) ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1216:1: ( (lv_right_0_0= ruleInvokerRight ) )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1216:1: ( (lv_right_0_0= ruleInvokerRight ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1217:1: (lv_right_0_0= ruleInvokerRight )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1217:1: (lv_right_0_0= ruleInvokerRight )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1218:3: lv_right_0_0= ruleInvokerRight
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getProcedureInvokerRightsClauseAccess().getRightInvokerRightEnumRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInvokerRight_in_ruleProcedureInvokerRightsClause2012);
            lv_right_0_0=ruleInvokerRight();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProcedureInvokerRightsClauseRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"right",
            	        		lv_right_0_0, 
            	        		"InvokerRight", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProcedureInvokerRightsClause


    // $ANTLR start entryRuleFunctionInvokerRightsClause
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1248:1: entryRuleFunctionInvokerRightsClause returns [EObject current=null] : iv_ruleFunctionInvokerRightsClause= ruleFunctionInvokerRightsClause EOF ;
    public final EObject entryRuleFunctionInvokerRightsClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionInvokerRightsClause = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1249:2: (iv_ruleFunctionInvokerRightsClause= ruleFunctionInvokerRightsClause EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1250:2: iv_ruleFunctionInvokerRightsClause= ruleFunctionInvokerRightsClause EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionInvokerRightsClauseRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionInvokerRightsClause_in_entryRuleFunctionInvokerRightsClause2046);
            iv_ruleFunctionInvokerRightsClause=ruleFunctionInvokerRightsClause();
            _fsp--;

             current =iv_ruleFunctionInvokerRightsClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionInvokerRightsClause2056); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFunctionInvokerRightsClause


    // $ANTLR start ruleFunctionInvokerRightsClause
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1257:1: ruleFunctionInvokerRightsClause returns [EObject current=null] : ( (lv_right_0_0= ruleInvokerRight ) ) ;
    public final EObject ruleFunctionInvokerRightsClause() throws RecognitionException {
        EObject current = null;

        Enumerator lv_right_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1262:6: ( ( (lv_right_0_0= ruleInvokerRight ) ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1263:1: ( (lv_right_0_0= ruleInvokerRight ) )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1263:1: ( (lv_right_0_0= ruleInvokerRight ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1264:1: (lv_right_0_0= ruleInvokerRight )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1264:1: (lv_right_0_0= ruleInvokerRight )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1265:3: lv_right_0_0= ruleInvokerRight
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFunctionInvokerRightsClauseAccess().getRightInvokerRightEnumRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInvokerRight_in_ruleFunctionInvokerRightsClause2101);
            lv_right_0_0=ruleInvokerRight();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionInvokerRightsClauseRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"right",
            	        		lv_right_0_0, 
            	        		"InvokerRight", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFunctionInvokerRightsClause


    // $ANTLR start entryRulePragma
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1295:1: entryRulePragma returns [EObject current=null] : iv_rulePragma= rulePragma EOF ;
    public final EObject entryRulePragma() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePragma = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1296:2: (iv_rulePragma= rulePragma EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1297:2: iv_rulePragma= rulePragma EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPragmaRule(), currentNode); 
            pushFollow(FOLLOW_rulePragma_in_entryRulePragma2135);
            iv_rulePragma=rulePragma();
            _fsp--;

             current =iv_rulePragma; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePragma2145); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePragma


    // $ANTLR start rulePragma
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1304:1: rulePragma returns [EObject current=null] : (this_PragmaRestrictReferences_0= rulePragmaRestrictReferences | this_PragmaTimestamp_1= rulePragmaTimestamp ) ;
    public final EObject rulePragma() throws RecognitionException {
        EObject current = null;

        EObject this_PragmaRestrictReferences_0 = null;

        EObject this_PragmaTimestamp_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1309:6: ( (this_PragmaRestrictReferences_0= rulePragmaRestrictReferences | this_PragmaTimestamp_1= rulePragmaTimestamp ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1310:1: (this_PragmaRestrictReferences_0= rulePragmaRestrictReferences | this_PragmaTimestamp_1= rulePragmaTimestamp )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1310:1: (this_PragmaRestrictReferences_0= rulePragmaRestrictReferences | this_PragmaTimestamp_1= rulePragmaTimestamp )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==KEYWORD_45) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==KEYWORD_66) ) {
                    alt24=1;
                }
                else if ( (LA24_1==KEYWORD_62) ) {
                    alt24=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1310:1: (this_PragmaRestrictReferences_0= rulePragmaRestrictReferences | this_PragmaTimestamp_1= rulePragmaTimestamp )", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1310:1: (this_PragmaRestrictReferences_0= rulePragmaRestrictReferences | this_PragmaTimestamp_1= rulePragmaTimestamp )", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1311:5: this_PragmaRestrictReferences_0= rulePragmaRestrictReferences
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPragmaAccess().getPragmaRestrictReferencesParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePragmaRestrictReferences_in_rulePragma2192);
                    this_PragmaRestrictReferences_0=rulePragmaRestrictReferences();
                    _fsp--;


                            current = this_PragmaRestrictReferences_0;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1321:5: this_PragmaTimestamp_1= rulePragmaTimestamp
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPragmaAccess().getPragmaTimestampParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePragmaTimestamp_in_rulePragma2219);
                    this_PragmaTimestamp_1=rulePragmaTimestamp();
                    _fsp--;


                            current = this_PragmaTimestamp_1;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePragma


    // $ANTLR start entryRulePragmaRestrictReferences
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1337:1: entryRulePragmaRestrictReferences returns [EObject current=null] : iv_rulePragmaRestrictReferences= rulePragmaRestrictReferences EOF ;
    public final EObject entryRulePragmaRestrictReferences() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePragmaRestrictReferences = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1338:2: (iv_rulePragmaRestrictReferences= rulePragmaRestrictReferences EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1339:2: iv_rulePragmaRestrictReferences= rulePragmaRestrictReferences EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPragmaRestrictReferencesRule(), currentNode); 
            pushFollow(FOLLOW_rulePragmaRestrictReferences_in_entryRulePragmaRestrictReferences2253);
            iv_rulePragmaRestrictReferences=rulePragmaRestrictReferences();
            _fsp--;

             current =iv_rulePragmaRestrictReferences; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePragmaRestrictReferences2263); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePragmaRestrictReferences


    // $ANTLR start rulePragmaRestrictReferences
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1346:1: rulePragmaRestrictReferences returns [EObject current=null] : ( KEYWORD_45 KEYWORD_66 KEYWORD_1 ( ruleSubprogramName | KEYWORD_50 ) KEYWORD_3 ( (lv_restrictions_6_0= rulePragmaRestrictReferencesRestriction ) ) ( KEYWORD_3 ( (lv_restrictions_8_0= rulePragmaRestrictReferencesRestriction ) ) )* KEYWORD_2 KEYWORD_6 ) ;
    public final EObject rulePragmaRestrictReferences() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_restrictions_6_0 = null;

        AntlrDatatypeRuleToken lv_restrictions_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1351:6: ( ( KEYWORD_45 KEYWORD_66 KEYWORD_1 ( ruleSubprogramName | KEYWORD_50 ) KEYWORD_3 ( (lv_restrictions_6_0= rulePragmaRestrictReferencesRestriction ) ) ( KEYWORD_3 ( (lv_restrictions_8_0= rulePragmaRestrictReferencesRestriction ) ) )* KEYWORD_2 KEYWORD_6 ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1352:1: ( KEYWORD_45 KEYWORD_66 KEYWORD_1 ( ruleSubprogramName | KEYWORD_50 ) KEYWORD_3 ( (lv_restrictions_6_0= rulePragmaRestrictReferencesRestriction ) ) ( KEYWORD_3 ( (lv_restrictions_8_0= rulePragmaRestrictReferencesRestriction ) ) )* KEYWORD_2 KEYWORD_6 )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1352:1: ( KEYWORD_45 KEYWORD_66 KEYWORD_1 ( ruleSubprogramName | KEYWORD_50 ) KEYWORD_3 ( (lv_restrictions_6_0= rulePragmaRestrictReferencesRestriction ) ) ( KEYWORD_3 ( (lv_restrictions_8_0= rulePragmaRestrictReferencesRestriction ) ) )* KEYWORD_2 KEYWORD_6 )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1353:2: KEYWORD_45 KEYWORD_66 KEYWORD_1 ( ruleSubprogramName | KEYWORD_50 ) KEYWORD_3 ( (lv_restrictions_6_0= rulePragmaRestrictReferencesRestriction ) ) ( KEYWORD_3 ( (lv_restrictions_8_0= rulePragmaRestrictReferencesRestriction ) ) )* KEYWORD_2 KEYWORD_6
            {
            match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_rulePragmaRestrictReferences2299); 

                    createLeafNode(grammarAccess.getPragmaRestrictReferencesAccess().getPRAGMAKeyword_0(), null); 
                
            match(input,KEYWORD_66,FOLLOW_KEYWORD_66_in_rulePragmaRestrictReferences2310); 

                    createLeafNode(grammarAccess.getPragmaRestrictReferencesAccess().getRESTRICT_REFERENCESKeyword_1(), null); 
                
            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_rulePragmaRestrictReferences2321); 

                    createLeafNode(grammarAccess.getPragmaRestrictReferencesAccess().getLeftParenthesisKeyword_2(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1367:1: ( ruleSubprogramName | KEYWORD_50 )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            else if ( (LA25_0==KEYWORD_50) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1367:1: ( ruleSubprogramName | KEYWORD_50 )", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1368:5: ruleSubprogramName
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPragmaRestrictReferencesAccess().getSubprogramNameParserRuleCall_3_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSubprogramName_in_rulePragmaRestrictReferences2338);
                    ruleSubprogramName();
                    _fsp--;


                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1377:2: KEYWORD_50
                    {
                    match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_rulePragmaRestrictReferences2354); 

                            createLeafNode(grammarAccess.getPragmaRestrictReferencesAccess().getDEFAULTKeyword_3_1(), null); 
                        

                    }
                    break;

            }

            match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_rulePragmaRestrictReferences2366); 

                    createLeafNode(grammarAccess.getPragmaRestrictReferencesAccess().getCommaKeyword_4(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1386:1: ( (lv_restrictions_6_0= rulePragmaRestrictReferencesRestriction ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1387:1: (lv_restrictions_6_0= rulePragmaRestrictReferencesRestriction )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1387:1: (lv_restrictions_6_0= rulePragmaRestrictReferencesRestriction )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1388:3: lv_restrictions_6_0= rulePragmaRestrictReferencesRestriction
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPragmaRestrictReferencesAccess().getRestrictionsPragmaRestrictReferencesRestrictionParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePragmaRestrictReferencesRestriction_in_rulePragmaRestrictReferences2387);
            lv_restrictions_6_0=rulePragmaRestrictReferencesRestriction();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPragmaRestrictReferencesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"restrictions",
            	        		lv_restrictions_6_0, 
            	        		"PragmaRestrictReferencesRestriction", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1410:2: ( KEYWORD_3 ( (lv_restrictions_8_0= rulePragmaRestrictReferencesRestriction ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==KEYWORD_3) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1411:2: KEYWORD_3 ( (lv_restrictions_8_0= rulePragmaRestrictReferencesRestriction ) )
            	    {
            	    match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_rulePragmaRestrictReferences2399); 

            	            createLeafNode(grammarAccess.getPragmaRestrictReferencesAccess().getCommaKeyword_6_0(), null); 
            	        
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1415:1: ( (lv_restrictions_8_0= rulePragmaRestrictReferencesRestriction ) )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1416:1: (lv_restrictions_8_0= rulePragmaRestrictReferencesRestriction )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1416:1: (lv_restrictions_8_0= rulePragmaRestrictReferencesRestriction )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1417:3: lv_restrictions_8_0= rulePragmaRestrictReferencesRestriction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPragmaRestrictReferencesAccess().getRestrictionsPragmaRestrictReferencesRestrictionParserRuleCall_6_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePragmaRestrictReferencesRestriction_in_rulePragmaRestrictReferences2420);
            	    lv_restrictions_8_0=rulePragmaRestrictReferencesRestriction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPragmaRestrictReferencesRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"restrictions",
            	    	        		lv_restrictions_8_0, 
            	    	        		"PragmaRestrictReferencesRestriction", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rulePragmaRestrictReferences2433); 

                    createLeafNode(grammarAccess.getPragmaRestrictReferencesAccess().getRightParenthesisKeyword_7(), null); 
                
            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rulePragmaRestrictReferences2444); 

                    createLeafNode(grammarAccess.getPragmaRestrictReferencesAccess().getSemicolonKeyword_8(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePragmaRestrictReferences


    // $ANTLR start entryRulePragmaRestrictReferencesRestriction
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1457:1: entryRulePragmaRestrictReferencesRestriction returns [String current=null] : iv_rulePragmaRestrictReferencesRestriction= rulePragmaRestrictReferencesRestriction EOF ;
    public final String entryRulePragmaRestrictReferencesRestriction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePragmaRestrictReferencesRestriction = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1458:1: (iv_rulePragmaRestrictReferencesRestriction= rulePragmaRestrictReferencesRestriction EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1459:2: iv_rulePragmaRestrictReferencesRestriction= rulePragmaRestrictReferencesRestriction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPragmaRestrictReferencesRestrictionRule(), currentNode); 
            pushFollow(FOLLOW_rulePragmaRestrictReferencesRestriction_in_entryRulePragmaRestrictReferencesRestriction2480);
            iv_rulePragmaRestrictReferencesRestriction=rulePragmaRestrictReferencesRestriction();
            _fsp--;

             current =iv_rulePragmaRestrictReferencesRestriction.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePragmaRestrictReferencesRestriction2491); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePragmaRestrictReferencesRestriction


    // $ANTLR start rulePragmaRestrictReferencesRestriction
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1466:1: rulePragmaRestrictReferencesRestriction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_27 | kw= KEYWORD_32 | kw= KEYWORD_28 | kw= KEYWORD_33 | kw= KEYWORD_41 ) ;
    public final AntlrDatatypeRuleToken rulePragmaRestrictReferencesRestriction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1471:6: ( (kw= KEYWORD_27 | kw= KEYWORD_32 | kw= KEYWORD_28 | kw= KEYWORD_33 | kw= KEYWORD_41 ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1472:1: (kw= KEYWORD_27 | kw= KEYWORD_32 | kw= KEYWORD_28 | kw= KEYWORD_33 | kw= KEYWORD_41 )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1472:1: (kw= KEYWORD_27 | kw= KEYWORD_32 | kw= KEYWORD_28 | kw= KEYWORD_33 | kw= KEYWORD_41 )
            int alt27=5;
            switch ( input.LA(1) ) {
            case KEYWORD_27:
                {
                alt27=1;
                }
                break;
            case KEYWORD_32:
                {
                alt27=2;
                }
                break;
            case KEYWORD_28:
                {
                alt27=3;
                }
                break;
            case KEYWORD_33:
                {
                alt27=4;
                }
                break;
            case KEYWORD_41:
                {
                alt27=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1472:1: (kw= KEYWORD_27 | kw= KEYWORD_32 | kw= KEYWORD_28 | kw= KEYWORD_33 | kw= KEYWORD_41 )", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1473:2: kw= KEYWORD_27
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_rulePragmaRestrictReferencesRestriction2529); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPragmaRestrictReferencesRestrictionAccess().getRNDSKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1480:2: kw= KEYWORD_32
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_rulePragmaRestrictReferencesRestriction2548); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPragmaRestrictReferencesRestrictionAccess().getWNDSKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1487:2: kw= KEYWORD_28
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_rulePragmaRestrictReferencesRestriction2567); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPragmaRestrictReferencesRestrictionAccess().getRNPSKeyword_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1494:2: kw= KEYWORD_33
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_rulePragmaRestrictReferencesRestriction2586); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPragmaRestrictReferencesRestrictionAccess().getWNPSKeyword_3(), null); 
                        

                    }
                    break;
                case 5 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1501:2: kw= KEYWORD_41
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_rulePragmaRestrictReferencesRestriction2605); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPragmaRestrictReferencesRestrictionAccess().getTRUSTKeyword_4(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePragmaRestrictReferencesRestriction


    // $ANTLR start entryRuleSubprogramName
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1514:1: entryRuleSubprogramName returns [String current=null] : iv_ruleSubprogramName= ruleSubprogramName EOF ;
    public final String entryRuleSubprogramName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSubprogramName = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1515:1: (iv_ruleSubprogramName= ruleSubprogramName EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1516:2: iv_ruleSubprogramName= ruleSubprogramName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSubprogramNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleSubprogramName_in_entryRuleSubprogramName2645);
            iv_ruleSubprogramName=ruleSubprogramName();
            _fsp--;

             current =iv_ruleSubprogramName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubprogramName2656); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSubprogramName


    // $ANTLR start ruleSubprogramName
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1523:1: ruleSubprogramName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleSubprogramName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1528:6: (this_ID_0= RULE_ID )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1529:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubprogramName2695); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getSubprogramNameAccess().getIDTerminalRuleCall(), null); 
                

            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSubprogramName


    // $ANTLR start entryRulePragmaTimestamp
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1544:1: entryRulePragmaTimestamp returns [EObject current=null] : iv_rulePragmaTimestamp= rulePragmaTimestamp EOF ;
    public final EObject entryRulePragmaTimestamp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePragmaTimestamp = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1545:2: (iv_rulePragmaTimestamp= rulePragmaTimestamp EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1546:2: iv_rulePragmaTimestamp= rulePragmaTimestamp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPragmaTimestampRule(), currentNode); 
            pushFollow(FOLLOW_rulePragmaTimestamp_in_entryRulePragmaTimestamp2738);
            iv_rulePragmaTimestamp=rulePragmaTimestamp();
            _fsp--;

             current =iv_rulePragmaTimestamp; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePragmaTimestamp2748); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePragmaTimestamp


    // $ANTLR start rulePragmaTimestamp
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1553:1: rulePragmaTimestamp returns [EObject current=null] : ( KEYWORD_45 KEYWORD_62 KEYWORD_1 ( (lv_timestamp_3_0= RULE_STRING ) ) KEYWORD_2 KEYWORD_6 ) ;
    public final EObject rulePragmaTimestamp() throws RecognitionException {
        EObject current = null;

        Token lv_timestamp_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1558:6: ( ( KEYWORD_45 KEYWORD_62 KEYWORD_1 ( (lv_timestamp_3_0= RULE_STRING ) ) KEYWORD_2 KEYWORD_6 ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1559:1: ( KEYWORD_45 KEYWORD_62 KEYWORD_1 ( (lv_timestamp_3_0= RULE_STRING ) ) KEYWORD_2 KEYWORD_6 )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1559:1: ( KEYWORD_45 KEYWORD_62 KEYWORD_1 ( (lv_timestamp_3_0= RULE_STRING ) ) KEYWORD_2 KEYWORD_6 )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1560:2: KEYWORD_45 KEYWORD_62 KEYWORD_1 ( (lv_timestamp_3_0= RULE_STRING ) ) KEYWORD_2 KEYWORD_6
            {
            match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_rulePragmaTimestamp2784); 

                    createLeafNode(grammarAccess.getPragmaTimestampAccess().getPRAGMAKeyword_0(), null); 
                
            match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_rulePragmaTimestamp2795); 

                    createLeafNode(grammarAccess.getPragmaTimestampAccess().getTIMESTAMPKeyword_1(), null); 
                
            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_rulePragmaTimestamp2806); 

                    createLeafNode(grammarAccess.getPragmaTimestampAccess().getLeftParenthesisKeyword_2(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1574:1: ( (lv_timestamp_3_0= RULE_STRING ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1575:1: (lv_timestamp_3_0= RULE_STRING )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1575:1: (lv_timestamp_3_0= RULE_STRING )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1576:3: lv_timestamp_3_0= RULE_STRING
            {
            lv_timestamp_3_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePragmaTimestamp2823); 

            			createLeafNode(grammarAccess.getPragmaTimestampAccess().getTimestampSTRINGTerminalRuleCall_3_0(), "timestamp"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPragmaTimestampRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"timestamp",
            	        		lv_timestamp_3_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rulePragmaTimestamp2839); 

                    createLeafNode(grammarAccess.getPragmaTimestampAccess().getRightParenthesisKeyword_4(), null); 
                
            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rulePragmaTimestamp2850); 

                    createLeafNode(grammarAccess.getPragmaTimestampAccess().getSemicolonKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePragmaTimestamp


    // $ANTLR start entryRuleDataType
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1616:1: entryRuleDataType returns [String current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final String entryRuleDataType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataType = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1617:1: (iv_ruleDataType= ruleDataType EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1618:2: iv_ruleDataType= ruleDataType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType2886);
            iv_ruleDataType=ruleDataType();
            _fsp--;

             current =iv_ruleDataType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType2897); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDataType


    // $ANTLR start ruleDataType
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1625:1: ruleDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= KEYWORD_44 (kw= KEYWORD_1 this_INT_2= RULE_INT (kw= KEYWORD_3 this_INT_4= RULE_INT )? kw= KEYWORD_2 )? ) | (kw= KEYWORD_58 (kw= KEYWORD_1 this_INT_8= RULE_INT kw= KEYWORD_2 )? ) | kw= KEYWORD_47 | this_ID_11= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleDataType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;
        Token this_INT_8=null;
        Token this_ID_11=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1630:6: ( ( (kw= KEYWORD_44 (kw= KEYWORD_1 this_INT_2= RULE_INT (kw= KEYWORD_3 this_INT_4= RULE_INT )? kw= KEYWORD_2 )? ) | (kw= KEYWORD_58 (kw= KEYWORD_1 this_INT_8= RULE_INT kw= KEYWORD_2 )? ) | kw= KEYWORD_47 | this_ID_11= RULE_ID ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1631:1: ( (kw= KEYWORD_44 (kw= KEYWORD_1 this_INT_2= RULE_INT (kw= KEYWORD_3 this_INT_4= RULE_INT )? kw= KEYWORD_2 )? ) | (kw= KEYWORD_58 (kw= KEYWORD_1 this_INT_8= RULE_INT kw= KEYWORD_2 )? ) | kw= KEYWORD_47 | this_ID_11= RULE_ID )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1631:1: ( (kw= KEYWORD_44 (kw= KEYWORD_1 this_INT_2= RULE_INT (kw= KEYWORD_3 this_INT_4= RULE_INT )? kw= KEYWORD_2 )? ) | (kw= KEYWORD_58 (kw= KEYWORD_1 this_INT_8= RULE_INT kw= KEYWORD_2 )? ) | kw= KEYWORD_47 | this_ID_11= RULE_ID )
            int alt31=4;
            switch ( input.LA(1) ) {
            case KEYWORD_44:
                {
                alt31=1;
                }
                break;
            case KEYWORD_58:
                {
                alt31=2;
                }
                break;
            case KEYWORD_47:
                {
                alt31=3;
                }
                break;
            case RULE_ID:
                {
                alt31=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1631:1: ( (kw= KEYWORD_44 (kw= KEYWORD_1 this_INT_2= RULE_INT (kw= KEYWORD_3 this_INT_4= RULE_INT )? kw= KEYWORD_2 )? ) | (kw= KEYWORD_58 (kw= KEYWORD_1 this_INT_8= RULE_INT kw= KEYWORD_2 )? ) | kw= KEYWORD_47 | this_ID_11= RULE_ID )", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1631:2: (kw= KEYWORD_44 (kw= KEYWORD_1 this_INT_2= RULE_INT (kw= KEYWORD_3 this_INT_4= RULE_INT )? kw= KEYWORD_2 )? )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1631:2: (kw= KEYWORD_44 (kw= KEYWORD_1 this_INT_2= RULE_INT (kw= KEYWORD_3 this_INT_4= RULE_INT )? kw= KEYWORD_2 )? )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1632:2: kw= KEYWORD_44 (kw= KEYWORD_1 this_INT_2= RULE_INT (kw= KEYWORD_3 this_INT_4= RULE_INT )? kw= KEYWORD_2 )?
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleDataType2936); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDataTypeAccess().getNUMBERKeyword_0_0(), null); 
                        
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1637:1: (kw= KEYWORD_1 this_INT_2= RULE_INT (kw= KEYWORD_3 this_INT_4= RULE_INT )? kw= KEYWORD_2 )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==KEYWORD_1) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1638:2: kw= KEYWORD_1 this_INT_2= RULE_INT (kw= KEYWORD_3 this_INT_4= RULE_INT )? kw= KEYWORD_2
                            {
                            kw=(Token)input.LT(1);
                            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleDataType2950); 

                                    current.merge(kw);
                                    createLeafNode(grammarAccess.getDataTypeAccess().getLeftParenthesisKeyword_0_1_0(), null); 
                                
                            this_INT_2=(Token)input.LT(1);
                            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDataType2965); 

                            		current.merge(this_INT_2);
                                
                             
                                createLeafNode(grammarAccess.getDataTypeAccess().getINTTerminalRuleCall_0_1_1(), null); 
                                
                            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1650:1: (kw= KEYWORD_3 this_INT_4= RULE_INT )?
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( (LA28_0==KEYWORD_3) ) {
                                alt28=1;
                            }
                            switch (alt28) {
                                case 1 :
                                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1651:2: kw= KEYWORD_3 this_INT_4= RULE_INT
                                    {
                                    kw=(Token)input.LT(1);
                                    match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleDataType2984); 

                                            current.merge(kw);
                                            createLeafNode(grammarAccess.getDataTypeAccess().getCommaKeyword_0_1_2_0(), null); 
                                        
                                    this_INT_4=(Token)input.LT(1);
                                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDataType2999); 

                                    		current.merge(this_INT_4);
                                        
                                     
                                        createLeafNode(grammarAccess.getDataTypeAccess().getINTTerminalRuleCall_0_1_2_1(), null); 
                                        

                                    }
                                    break;

                            }

                            kw=(Token)input.LT(1);
                            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleDataType3019); 

                                    current.merge(kw);
                                    createLeafNode(grammarAccess.getDataTypeAccess().getRightParenthesisKeyword_0_1_3(), null); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1670:6: (kw= KEYWORD_58 (kw= KEYWORD_1 this_INT_8= RULE_INT kw= KEYWORD_2 )? )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1670:6: (kw= KEYWORD_58 (kw= KEYWORD_1 this_INT_8= RULE_INT kw= KEYWORD_2 )? )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1671:2: kw= KEYWORD_58 (kw= KEYWORD_1 this_INT_8= RULE_INT kw= KEYWORD_2 )?
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_58,FOLLOW_KEYWORD_58_in_ruleDataType3042); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDataTypeAccess().getVARCHAR2Keyword_1_0(), null); 
                        
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1676:1: (kw= KEYWORD_1 this_INT_8= RULE_INT kw= KEYWORD_2 )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==KEYWORD_1) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1677:2: kw= KEYWORD_1 this_INT_8= RULE_INT kw= KEYWORD_2
                            {
                            kw=(Token)input.LT(1);
                            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleDataType3056); 

                                    current.merge(kw);
                                    createLeafNode(grammarAccess.getDataTypeAccess().getLeftParenthesisKeyword_1_1_0(), null); 
                                
                            this_INT_8=(Token)input.LT(1);
                            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDataType3071); 

                            		current.merge(this_INT_8);
                                
                             
                                createLeafNode(grammarAccess.getDataTypeAccess().getINTTerminalRuleCall_1_1_1(), null); 
                                
                            kw=(Token)input.LT(1);
                            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleDataType3089); 

                                    current.merge(kw);
                                    createLeafNode(grammarAccess.getDataTypeAccess().getRightParenthesisKeyword_1_1_2(), null); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1697:2: kw= KEYWORD_47
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_ruleDataType3111); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDataTypeAccess().getBOOLEANKeyword_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1703:10: this_ID_11= RULE_ID
                    {
                    this_ID_11=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataType3132); 

                    		current.merge(this_ID_11);
                        
                     
                        createLeafNode(grammarAccess.getDataTypeAccess().getIDTerminalRuleCall_3(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDataType


    // $ANTLR start entryRuleProcedureContent
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1718:1: entryRuleProcedureContent returns [EObject current=null] : iv_ruleProcedureContent= ruleProcedureContent EOF ;
    public final EObject entryRuleProcedureContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedureContent = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1719:2: (iv_ruleProcedureContent= ruleProcedureContent EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1720:2: iv_ruleProcedureContent= ruleProcedureContent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProcedureContentRule(), currentNode); 
            pushFollow(FOLLOW_ruleProcedureContent_in_entryRuleProcedureContent3176);
            iv_ruleProcedureContent=ruleProcedureContent();
            _fsp--;

             current =iv_ruleProcedureContent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcedureContent3186); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleProcedureContent


    // $ANTLR start ruleProcedureContent
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1727:1: ruleProcedureContent returns [EObject current=null] : (this_ProcedureImplementation_0= ruleProcedureImplementation | this_ExternalProcedureDeclaration_1= ruleExternalProcedureDeclaration ) ;
    public final EObject ruleProcedureContent() throws RecognitionException {
        EObject current = null;

        EObject this_ProcedureImplementation_0 = null;

        EObject this_ExternalProcedureDeclaration_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1732:6: ( (this_ProcedureImplementation_0= ruleProcedureImplementation | this_ExternalProcedureDeclaration_1= ruleExternalProcedureDeclaration ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1733:1: (this_ProcedureImplementation_0= ruleProcedureImplementation | this_ExternalProcedureDeclaration_1= ruleExternalProcedureDeclaration )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1733:1: (this_ProcedureImplementation_0= ruleProcedureImplementation | this_ExternalProcedureDeclaration_1= ruleExternalProcedureDeclaration )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==KEYWORD_60||LA32_0==KEYWORD_49||LA32_0==KEYWORD_45||LA32_0==KEYWORD_34||LA32_0==RULE_ID) ) {
                alt32=1;
            }
            else if ( (LA32_0==KEYWORD_56) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1733:1: (this_ProcedureImplementation_0= ruleProcedureImplementation | this_ExternalProcedureDeclaration_1= ruleExternalProcedureDeclaration )", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1734:5: this_ProcedureImplementation_0= ruleProcedureImplementation
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getProcedureContentAccess().getProcedureImplementationParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleProcedureImplementation_in_ruleProcedureContent3233);
                    this_ProcedureImplementation_0=ruleProcedureImplementation();
                    _fsp--;


                            current = this_ProcedureImplementation_0;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1744:5: this_ExternalProcedureDeclaration_1= ruleExternalProcedureDeclaration
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getProcedureContentAccess().getExternalProcedureDeclarationParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExternalProcedureDeclaration_in_ruleProcedureContent3260);
                    this_ExternalProcedureDeclaration_1=ruleExternalProcedureDeclaration();
                    _fsp--;


                            current = this_ExternalProcedureDeclaration_1;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProcedureContent


    // $ANTLR start entryRuleProcedureImplementation
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1760:1: entryRuleProcedureImplementation returns [EObject current=null] : iv_ruleProcedureImplementation= ruleProcedureImplementation EOF ;
    public final EObject entryRuleProcedureImplementation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedureImplementation = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1761:2: (iv_ruleProcedureImplementation= ruleProcedureImplementation EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1762:2: iv_ruleProcedureImplementation= ruleProcedureImplementation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProcedureImplementationRule(), currentNode); 
            pushFollow(FOLLOW_ruleProcedureImplementation_in_entryRuleProcedureImplementation3294);
            iv_ruleProcedureImplementation=ruleProcedureImplementation();
            _fsp--;

             current =iv_ruleProcedureImplementation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcedureImplementation3304); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleProcedureImplementation


    // $ANTLR start ruleProcedureImplementation
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1769:1: ruleProcedureImplementation returns [EObject current=null] : ( ( (lv_declareSection_0_0= ruleDeclareSection ) )? ( (lv_body_1_0= ruleStatementBody ) ) ) ;
    public final EObject ruleProcedureImplementation() throws RecognitionException {
        EObject current = null;

        EObject lv_declareSection_0_0 = null;

        EObject lv_body_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1774:6: ( ( ( (lv_declareSection_0_0= ruleDeclareSection ) )? ( (lv_body_1_0= ruleStatementBody ) ) ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1775:1: ( ( (lv_declareSection_0_0= ruleDeclareSection ) )? ( (lv_body_1_0= ruleStatementBody ) ) )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1775:1: ( ( (lv_declareSection_0_0= ruleDeclareSection ) )? ( (lv_body_1_0= ruleStatementBody ) ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1775:2: ( (lv_declareSection_0_0= ruleDeclareSection ) )? ( (lv_body_1_0= ruleStatementBody ) )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1775:2: ( (lv_declareSection_0_0= ruleDeclareSection ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==KEYWORD_60||LA33_0==KEYWORD_49||LA33_0==KEYWORD_45||LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1776:1: (lv_declareSection_0_0= ruleDeclareSection )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1776:1: (lv_declareSection_0_0= ruleDeclareSection )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1777:3: lv_declareSection_0_0= ruleDeclareSection
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProcedureImplementationAccess().getDeclareSectionDeclareSectionParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDeclareSection_in_ruleProcedureImplementation3350);
                    lv_declareSection_0_0=ruleDeclareSection();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProcedureImplementationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"declareSection",
                    	        		lv_declareSection_0_0, 
                    	        		"DeclareSection", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1799:3: ( (lv_body_1_0= ruleStatementBody ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1800:1: (lv_body_1_0= ruleStatementBody )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1800:1: (lv_body_1_0= ruleStatementBody )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1801:3: lv_body_1_0= ruleStatementBody
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getProcedureImplementationAccess().getBodyStatementBodyParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatementBody_in_ruleProcedureImplementation3372);
            lv_body_1_0=ruleStatementBody();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProcedureImplementationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"body",
            	        		lv_body_1_0, 
            	        		"StatementBody", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProcedureImplementation


    // $ANTLR start entryRuleFunctionContent
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1831:1: entryRuleFunctionContent returns [EObject current=null] : iv_ruleFunctionContent= ruleFunctionContent EOF ;
    public final EObject entryRuleFunctionContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionContent = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1832:2: (iv_ruleFunctionContent= ruleFunctionContent EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1833:2: iv_ruleFunctionContent= ruleFunctionContent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionContentRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionContent_in_entryRuleFunctionContent3407);
            iv_ruleFunctionContent=ruleFunctionContent();
            _fsp--;

             current =iv_ruleFunctionContent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionContent3417); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFunctionContent


    // $ANTLR start ruleFunctionContent
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1840:1: ruleFunctionContent returns [EObject current=null] : this_FunctionImplementation_0= ruleFunctionImplementation ;
    public final EObject ruleFunctionContent() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionImplementation_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1845:6: (this_FunctionImplementation_0= ruleFunctionImplementation )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1847:5: this_FunctionImplementation_0= ruleFunctionImplementation
            {
             
                    currentNode=createCompositeNode(grammarAccess.getFunctionContentAccess().getFunctionImplementationParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleFunctionImplementation_in_ruleFunctionContent3463);
            this_FunctionImplementation_0=ruleFunctionImplementation();
            _fsp--;


                    current = this_FunctionImplementation_0;
                    currentNode = currentNode.getParent();
                

            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFunctionContent


    // $ANTLR start entryRuleFunctionImplementation
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1863:1: entryRuleFunctionImplementation returns [EObject current=null] : iv_ruleFunctionImplementation= ruleFunctionImplementation EOF ;
    public final EObject entryRuleFunctionImplementation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionImplementation = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1864:2: (iv_ruleFunctionImplementation= ruleFunctionImplementation EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1865:2: iv_ruleFunctionImplementation= ruleFunctionImplementation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionImplementationRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionImplementation_in_entryRuleFunctionImplementation3496);
            iv_ruleFunctionImplementation=ruleFunctionImplementation();
            _fsp--;

             current =iv_ruleFunctionImplementation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionImplementation3506); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFunctionImplementation


    // $ANTLR start ruleFunctionImplementation
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1872:1: ruleFunctionImplementation returns [EObject current=null] : ( ( (lv_declareSection_0_0= ruleDeclareSection ) )? ( (lv_body_1_0= ruleStatementBody ) ) ) ;
    public final EObject ruleFunctionImplementation() throws RecognitionException {
        EObject current = null;

        EObject lv_declareSection_0_0 = null;

        EObject lv_body_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1877:6: ( ( ( (lv_declareSection_0_0= ruleDeclareSection ) )? ( (lv_body_1_0= ruleStatementBody ) ) ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1878:1: ( ( (lv_declareSection_0_0= ruleDeclareSection ) )? ( (lv_body_1_0= ruleStatementBody ) ) )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1878:1: ( ( (lv_declareSection_0_0= ruleDeclareSection ) )? ( (lv_body_1_0= ruleStatementBody ) ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1878:2: ( (lv_declareSection_0_0= ruleDeclareSection ) )? ( (lv_body_1_0= ruleStatementBody ) )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1878:2: ( (lv_declareSection_0_0= ruleDeclareSection ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==KEYWORD_60||LA34_0==KEYWORD_49||LA34_0==KEYWORD_45||LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1879:1: (lv_declareSection_0_0= ruleDeclareSection )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1879:1: (lv_declareSection_0_0= ruleDeclareSection )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1880:3: lv_declareSection_0_0= ruleDeclareSection
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFunctionImplementationAccess().getDeclareSectionDeclareSectionParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDeclareSection_in_ruleFunctionImplementation3552);
                    lv_declareSection_0_0=ruleDeclareSection();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionImplementationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"declareSection",
                    	        		lv_declareSection_0_0, 
                    	        		"DeclareSection", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1902:3: ( (lv_body_1_0= ruleStatementBody ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1903:1: (lv_body_1_0= ruleStatementBody )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1903:1: (lv_body_1_0= ruleStatementBody )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1904:3: lv_body_1_0= ruleStatementBody
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFunctionImplementationAccess().getBodyStatementBodyParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatementBody_in_ruleFunctionImplementation3574);
            lv_body_1_0=ruleStatementBody();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionImplementationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"body",
            	        		lv_body_1_0, 
            	        		"StatementBody", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFunctionImplementation


    // $ANTLR start entryRuleFunctionClause
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1934:1: entryRuleFunctionClause returns [EObject current=null] : iv_ruleFunctionClause= ruleFunctionClause EOF ;
    public final EObject entryRuleFunctionClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionClause = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1935:2: (iv_ruleFunctionClause= ruleFunctionClause EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1936:2: iv_ruleFunctionClause= ruleFunctionClause EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionClauseRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionClause_in_entryRuleFunctionClause3609);
            iv_ruleFunctionClause=ruleFunctionClause();
            _fsp--;

             current =iv_ruleFunctionClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionClause3619); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFunctionClause


    // $ANTLR start ruleFunctionClause
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1943:1: ruleFunctionClause returns [EObject current=null] : (this_FunctionInvokerRightsClause_0= ruleFunctionInvokerRightsClause | this_DeterministicClause_1= ruleDeterministicClause | this_ResultCacheClause_2= ruleResultCacheClause | this_PipelinedClause_3= rulePipelinedClause ) ;
    public final EObject ruleFunctionClause() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionInvokerRightsClause_0 = null;

        EObject this_DeterministicClause_1 = null;

        EObject this_ResultCacheClause_2 = null;

        EObject this_PipelinedClause_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1948:6: ( (this_FunctionInvokerRightsClause_0= ruleFunctionInvokerRightsClause | this_DeterministicClause_1= ruleDeterministicClause | this_ResultCacheClause_2= ruleResultCacheClause | this_PipelinedClause_3= rulePipelinedClause ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1949:1: (this_FunctionInvokerRightsClause_0= ruleFunctionInvokerRightsClause | this_DeterministicClause_1= ruleDeterministicClause | this_ResultCacheClause_2= ruleResultCacheClause | this_PipelinedClause_3= rulePipelinedClause )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1949:1: (this_FunctionInvokerRightsClause_0= ruleFunctionInvokerRightsClause | this_DeterministicClause_1= ruleDeterministicClause | this_ResultCacheClause_2= ruleResultCacheClause | this_PipelinedClause_3= rulePipelinedClause )
            int alt35=4;
            switch ( input.LA(1) ) {
            case KEYWORD_63:
            case KEYWORD_51:
                {
                alt35=1;
                }
                break;
            case KEYWORD_65:
                {
                alt35=2;
                }
                break;
            case KEYWORD_64:
                {
                alt35=3;
                }
                break;
            case KEYWORD_59:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1949:1: (this_FunctionInvokerRightsClause_0= ruleFunctionInvokerRightsClause | this_DeterministicClause_1= ruleDeterministicClause | this_ResultCacheClause_2= ruleResultCacheClause | this_PipelinedClause_3= rulePipelinedClause )", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1950:5: this_FunctionInvokerRightsClause_0= ruleFunctionInvokerRightsClause
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFunctionClauseAccess().getFunctionInvokerRightsClauseParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFunctionInvokerRightsClause_in_ruleFunctionClause3666);
                    this_FunctionInvokerRightsClause_0=ruleFunctionInvokerRightsClause();
                    _fsp--;


                            current = this_FunctionInvokerRightsClause_0;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1960:5: this_DeterministicClause_1= ruleDeterministicClause
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFunctionClauseAccess().getDeterministicClauseParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDeterministicClause_in_ruleFunctionClause3693);
                    this_DeterministicClause_1=ruleDeterministicClause();
                    _fsp--;


                            current = this_DeterministicClause_1;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1970:5: this_ResultCacheClause_2= ruleResultCacheClause
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFunctionClauseAccess().getResultCacheClauseParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleResultCacheClause_in_ruleFunctionClause3720);
                    this_ResultCacheClause_2=ruleResultCacheClause();
                    _fsp--;


                            current = this_ResultCacheClause_2;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1980:5: this_PipelinedClause_3= rulePipelinedClause
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFunctionClauseAccess().getPipelinedClauseParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePipelinedClause_in_ruleFunctionClause3747);
                    this_PipelinedClause_3=rulePipelinedClause();
                    _fsp--;


                            current = this_PipelinedClause_3;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFunctionClause


    // $ANTLR start entryRuleDeterministicClause
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1996:1: entryRuleDeterministicClause returns [EObject current=null] : iv_ruleDeterministicClause= ruleDeterministicClause EOF ;
    public final EObject entryRuleDeterministicClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeterministicClause = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1997:2: (iv_ruleDeterministicClause= ruleDeterministicClause EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:1998:2: iv_ruleDeterministicClause= ruleDeterministicClause EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDeterministicClauseRule(), currentNode); 
            pushFollow(FOLLOW_ruleDeterministicClause_in_entryRuleDeterministicClause3781);
            iv_ruleDeterministicClause=ruleDeterministicClause();
            _fsp--;

             current =iv_ruleDeterministicClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeterministicClause3791); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDeterministicClause


    // $ANTLR start ruleDeterministicClause
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2005:1: ruleDeterministicClause returns [EObject current=null] : ( () KEYWORD_65 ) ;
    public final EObject ruleDeterministicClause() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2010:6: ( ( () KEYWORD_65 ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2011:1: ( () KEYWORD_65 )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2011:1: ( () KEYWORD_65 )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2011:2: () KEYWORD_65
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2011:2: ()
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2012:5: 
            {
             
                    temp=factory.create(grammarAccess.getDeterministicClauseAccess().getDeterministicClauseAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getDeterministicClauseAccess().getDeterministicClauseAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,KEYWORD_65,FOLLOW_KEYWORD_65_in_ruleDeterministicClause3836); 

                    createLeafNode(grammarAccess.getDeterministicClauseAccess().getDETERMINISTICKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDeterministicClause


    // $ANTLR start entryRuleResultCacheClause
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2035:1: entryRuleResultCacheClause returns [EObject current=null] : iv_ruleResultCacheClause= ruleResultCacheClause EOF ;
    public final EObject entryRuleResultCacheClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultCacheClause = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2036:2: (iv_ruleResultCacheClause= ruleResultCacheClause EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2037:2: iv_ruleResultCacheClause= ruleResultCacheClause EOF
            {
             currentNode = createCompositeNode(grammarAccess.getResultCacheClauseRule(), currentNode); 
            pushFollow(FOLLOW_ruleResultCacheClause_in_entryRuleResultCacheClause3871);
            iv_ruleResultCacheClause=ruleResultCacheClause();
            _fsp--;

             current =iv_ruleResultCacheClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResultCacheClause3881); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleResultCacheClause


    // $ANTLR start ruleResultCacheClause
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2044:1: ruleResultCacheClause returns [EObject current=null] : ( () KEYWORD_64 ( KEYWORD_61 KEYWORD_1 ( ( (lv_dataSources_4_0= RULE_ID ) ) ( KEYWORD_3 ( (lv_dataSources_6_0= RULE_ID ) ) ) )? KEYWORD_2 )? ) ;
    public final EObject ruleResultCacheClause() throws RecognitionException {
        EObject current = null;

        Token lv_dataSources_4_0=null;
        Token lv_dataSources_6_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2049:6: ( ( () KEYWORD_64 ( KEYWORD_61 KEYWORD_1 ( ( (lv_dataSources_4_0= RULE_ID ) ) ( KEYWORD_3 ( (lv_dataSources_6_0= RULE_ID ) ) ) )? KEYWORD_2 )? ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2050:1: ( () KEYWORD_64 ( KEYWORD_61 KEYWORD_1 ( ( (lv_dataSources_4_0= RULE_ID ) ) ( KEYWORD_3 ( (lv_dataSources_6_0= RULE_ID ) ) ) )? KEYWORD_2 )? )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2050:1: ( () KEYWORD_64 ( KEYWORD_61 KEYWORD_1 ( ( (lv_dataSources_4_0= RULE_ID ) ) ( KEYWORD_3 ( (lv_dataSources_6_0= RULE_ID ) ) ) )? KEYWORD_2 )? )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2050:2: () KEYWORD_64 ( KEYWORD_61 KEYWORD_1 ( ( (lv_dataSources_4_0= RULE_ID ) ) ( KEYWORD_3 ( (lv_dataSources_6_0= RULE_ID ) ) ) )? KEYWORD_2 )?
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2050:2: ()
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2051:5: 
            {
             
                    temp=factory.create(grammarAccess.getResultCacheClauseAccess().getResultCacheClauseAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getResultCacheClauseAccess().getResultCacheClauseAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,KEYWORD_64,FOLLOW_KEYWORD_64_in_ruleResultCacheClause3926); 

                    createLeafNode(grammarAccess.getResultCacheClauseAccess().getRESULT_CACHEKeyword_1(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2066:1: ( KEYWORD_61 KEYWORD_1 ( ( (lv_dataSources_4_0= RULE_ID ) ) ( KEYWORD_3 ( (lv_dataSources_6_0= RULE_ID ) ) ) )? KEYWORD_2 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==KEYWORD_61) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2067:2: KEYWORD_61 KEYWORD_1 ( ( (lv_dataSources_4_0= RULE_ID ) ) ( KEYWORD_3 ( (lv_dataSources_6_0= RULE_ID ) ) ) )? KEYWORD_2
                    {
                    match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleResultCacheClause3938); 

                            createLeafNode(grammarAccess.getResultCacheClauseAccess().getRELIES_ONKeyword_2_0(), null); 
                        
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleResultCacheClause3949); 

                            createLeafNode(grammarAccess.getResultCacheClauseAccess().getLeftParenthesisKeyword_2_1(), null); 
                        
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2076:1: ( ( (lv_dataSources_4_0= RULE_ID ) ) ( KEYWORD_3 ( (lv_dataSources_6_0= RULE_ID ) ) ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==RULE_ID) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2076:2: ( (lv_dataSources_4_0= RULE_ID ) ) ( KEYWORD_3 ( (lv_dataSources_6_0= RULE_ID ) ) )
                            {
                            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2076:2: ( (lv_dataSources_4_0= RULE_ID ) )
                            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2077:1: (lv_dataSources_4_0= RULE_ID )
                            {
                            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2077:1: (lv_dataSources_4_0= RULE_ID )
                            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2078:3: lv_dataSources_4_0= RULE_ID
                            {
                            lv_dataSources_4_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResultCacheClause3967); 

                            			createLeafNode(grammarAccess.getResultCacheClauseAccess().getDataSourcesIDTerminalRuleCall_2_2_0_0(), "dataSources"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getResultCacheClauseRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"dataSources",
                            	        		lv_dataSources_4_0, 
                            	        		"ID", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }

                            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2100:2: ( KEYWORD_3 ( (lv_dataSources_6_0= RULE_ID ) ) )
                            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2101:2: KEYWORD_3 ( (lv_dataSources_6_0= RULE_ID ) )
                            {
                            match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleResultCacheClause3984); 

                                    createLeafNode(grammarAccess.getResultCacheClauseAccess().getCommaKeyword_2_2_1_0(), null); 
                                
                            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2105:1: ( (lv_dataSources_6_0= RULE_ID ) )
                            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2106:1: (lv_dataSources_6_0= RULE_ID )
                            {
                            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2106:1: (lv_dataSources_6_0= RULE_ID )
                            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2107:3: lv_dataSources_6_0= RULE_ID
                            {
                            lv_dataSources_6_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResultCacheClause4001); 

                            			createLeafNode(grammarAccess.getResultCacheClauseAccess().getDataSourcesIDTerminalRuleCall_2_2_1_1_0(), "dataSources"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getResultCacheClauseRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"dataSources",
                            	        		lv_dataSources_6_0, 
                            	        		"ID", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }


                            }


                            }
                            break;

                    }

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleResultCacheClause4020); 

                            createLeafNode(grammarAccess.getResultCacheClauseAccess().getRightParenthesisKeyword_2_3(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleResultCacheClause


    // $ANTLR start entryRulePipelinedClause
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2142:1: entryRulePipelinedClause returns [EObject current=null] : iv_rulePipelinedClause= rulePipelinedClause EOF ;
    public final EObject entryRulePipelinedClause() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePipelinedClause = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2143:2: (iv_rulePipelinedClause= rulePipelinedClause EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2144:2: iv_rulePipelinedClause= rulePipelinedClause EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPipelinedClauseRule(), currentNode); 
            pushFollow(FOLLOW_rulePipelinedClause_in_entryRulePipelinedClause4057);
            iv_rulePipelinedClause=rulePipelinedClause();
            _fsp--;

             current =iv_rulePipelinedClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePipelinedClause4067); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePipelinedClause


    // $ANTLR start rulePipelinedClause
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2151:1: rulePipelinedClause returns [EObject current=null] : ( () KEYWORD_59 ) ;
    public final EObject rulePipelinedClause() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2156:6: ( ( () KEYWORD_59 ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2157:1: ( () KEYWORD_59 )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2157:1: ( () KEYWORD_59 )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2157:2: () KEYWORD_59
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2157:2: ()
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2158:5: 
            {
             
                    temp=factory.create(grammarAccess.getPipelinedClauseAccess().getPipelinedClauseAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getPipelinedClauseAccess().getPipelinedClauseAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_rulePipelinedClause4112); 

                    createLeafNode(grammarAccess.getPipelinedClauseAccess().getPIPELINEDKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePipelinedClause


    // $ANTLR start entryRuleStatementBody
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2181:1: entryRuleStatementBody returns [EObject current=null] : iv_ruleStatementBody= ruleStatementBody EOF ;
    public final EObject entryRuleStatementBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementBody = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2182:2: (iv_ruleStatementBody= ruleStatementBody EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2183:2: iv_ruleStatementBody= ruleStatementBody EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStatementBodyRule(), currentNode); 
            pushFollow(FOLLOW_ruleStatementBody_in_entryRuleStatementBody4147);
            iv_ruleStatementBody=ruleStatementBody();
            _fsp--;

             current =iv_ruleStatementBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatementBody4157); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStatementBody


    // $ANTLR start ruleStatementBody
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2190:1: ruleStatementBody returns [EObject current=null] : ( KEYWORD_34 ( (lv_statements_1_0= ruleStatement ) )+ KEYWORD_15 ( (lv_endName_3_0= RULE_ID ) )? KEYWORD_6 ) ;
    public final EObject ruleStatementBody() throws RecognitionException {
        EObject current = null;

        Token lv_endName_3_0=null;
        EObject lv_statements_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2195:6: ( ( KEYWORD_34 ( (lv_statements_1_0= ruleStatement ) )+ KEYWORD_15 ( (lv_endName_3_0= RULE_ID ) )? KEYWORD_6 ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2196:1: ( KEYWORD_34 ( (lv_statements_1_0= ruleStatement ) )+ KEYWORD_15 ( (lv_endName_3_0= RULE_ID ) )? KEYWORD_6 )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2196:1: ( KEYWORD_34 ( (lv_statements_1_0= ruleStatement ) )+ KEYWORD_15 ( (lv_endName_3_0= RULE_ID ) )? KEYWORD_6 )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2197:2: KEYWORD_34 ( (lv_statements_1_0= ruleStatement ) )+ KEYWORD_15 ( (lv_endName_3_0= RULE_ID ) )? KEYWORD_6
            {
            match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleStatementBody4193); 

                    createLeafNode(grammarAccess.getStatementBodyAccess().getBEGINKeyword_0(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2201:1: ( (lv_statements_1_0= ruleStatement ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==KEYWORD_60||LA38_0==KEYWORD_55||LA38_0==KEYWORD_49||(LA38_0>=KEYWORD_45 && LA38_0<=KEYWORD_35)||LA38_0==KEYWORD_38||LA38_0==KEYWORD_40||LA38_0==KEYWORD_42||LA38_0==KEYWORD_20||(LA38_0>=KEYWORD_22 && LA38_0<=KEYWORD_23)||(LA38_0>=KEYWORD_25 && LA38_0<=KEYWORD_26)||LA38_0==KEYWORD_16||LA38_0==KEYWORD_9||LA38_0==KEYWORD_12||LA38_0==KEYWORD_5||LA38_0==RULE_ID) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2202:1: (lv_statements_1_0= ruleStatement )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2202:1: (lv_statements_1_0= ruleStatement )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2203:3: lv_statements_1_0= ruleStatement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStatementBodyAccess().getStatementsStatementParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleStatementBody4214);
            	    lv_statements_1_0=ruleStatement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getStatementBodyRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"statements",
            	    	        		lv_statements_1_0, 
            	    	        		"Statement", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);

            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleStatementBody4226); 

                    createLeafNode(grammarAccess.getStatementBodyAccess().getENDKeyword_2(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2230:1: ( (lv_endName_3_0= RULE_ID ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2231:1: (lv_endName_3_0= RULE_ID )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2231:1: (lv_endName_3_0= RULE_ID )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2232:3: lv_endName_3_0= RULE_ID
                    {
                    lv_endName_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatementBody4243); 

                    			createLeafNode(grammarAccess.getStatementBodyAccess().getEndNameIDTerminalRuleCall_3_0(), "endName"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStatementBodyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"endName",
                    	        		lv_endName_3_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleStatementBody4260); 

                    createLeafNode(grammarAccess.getStatementBodyAccess().getSemicolonKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStatementBody


    // $ANTLR start entryRuleDeclareSection
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2267:1: entryRuleDeclareSection returns [EObject current=null] : iv_ruleDeclareSection= ruleDeclareSection EOF ;
    public final EObject entryRuleDeclareSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclareSection = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2268:2: (iv_ruleDeclareSection= ruleDeclareSection EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2269:2: iv_ruleDeclareSection= ruleDeclareSection EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDeclareSectionRule(), currentNode); 
            pushFollow(FOLLOW_ruleDeclareSection_in_entryRuleDeclareSection4295);
            iv_ruleDeclareSection=ruleDeclareSection();
            _fsp--;

             current =iv_ruleDeclareSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclareSection4305); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDeclareSection


    // $ANTLR start ruleDeclareSection
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2276:1: ruleDeclareSection returns [EObject current=null] : ( ( KEYWORD_49 )? ( (lv_items_1_0= ruleItem ) )+ ) ;
    public final EObject ruleDeclareSection() throws RecognitionException {
        EObject current = null;

        EObject lv_items_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2281:6: ( ( ( KEYWORD_49 )? ( (lv_items_1_0= ruleItem ) )+ ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2282:1: ( ( KEYWORD_49 )? ( (lv_items_1_0= ruleItem ) )+ )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2282:1: ( ( KEYWORD_49 )? ( (lv_items_1_0= ruleItem ) )+ )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2282:2: ( KEYWORD_49 )? ( (lv_items_1_0= ruleItem ) )+
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2282:2: ( KEYWORD_49 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==KEYWORD_49) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2283:2: KEYWORD_49
                    {
                    match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleDeclareSection4342); 

                            createLeafNode(grammarAccess.getDeclareSectionAccess().getDECLAREKeyword_0(), null); 
                        

                    }
                    break;

            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2287:3: ( (lv_items_1_0= ruleItem ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==KEYWORD_60||LA41_0==KEYWORD_45||LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2288:1: (lv_items_1_0= ruleItem )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2288:1: (lv_items_1_0= ruleItem )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2289:3: lv_items_1_0= ruleItem
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDeclareSectionAccess().getItemsItemParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleItem_in_ruleDeclareSection4365);
            	    lv_items_1_0=ruleItem();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDeclareSectionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"items",
            	    	        		lv_items_1_0, 
            	    	        		"Item", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDeclareSection


    // $ANTLR start entryRuleItem
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2319:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2320:2: (iv_ruleItem= ruleItem EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2321:2: iv_ruleItem= ruleItem EOF
            {
             currentNode = createCompositeNode(grammarAccess.getItemRule(), currentNode); 
            pushFollow(FOLLOW_ruleItem_in_entryRuleItem4401);
            iv_ruleItem=ruleItem();
            _fsp--;

             current =iv_ruleItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItem4411); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleItem


    // $ANTLR start ruleItem
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2328:1: ruleItem returns [EObject current=null] : (this_ItemDeclaration_0= ruleItemDeclaration | this_ProcedureDeclaration_1= ruleProcedureDeclaration | this_ProcedureDefinition_2= ruleProcedureDefinition | this_Pragma_3= rulePragma ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        EObject this_ItemDeclaration_0 = null;

        EObject this_ProcedureDeclaration_1 = null;

        EObject this_ProcedureDefinition_2 = null;

        EObject this_Pragma_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2333:6: ( (this_ItemDeclaration_0= ruleItemDeclaration | this_ProcedureDeclaration_1= ruleProcedureDeclaration | this_ProcedureDefinition_2= ruleProcedureDefinition | this_Pragma_3= rulePragma ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2334:1: (this_ItemDeclaration_0= ruleItemDeclaration | this_ProcedureDeclaration_1= ruleProcedureDeclaration | this_ProcedureDefinition_2= ruleProcedureDefinition | this_Pragma_3= rulePragma )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2334:1: (this_ItemDeclaration_0= ruleItemDeclaration | this_ProcedureDeclaration_1= ruleProcedureDeclaration | this_ProcedureDefinition_2= ruleProcedureDefinition | this_Pragma_3= rulePragma )
            int alt42=4;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2335:5: this_ItemDeclaration_0= ruleItemDeclaration
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getItemAccess().getItemDeclarationParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleItemDeclaration_in_ruleItem4458);
                    this_ItemDeclaration_0=ruleItemDeclaration();
                    _fsp--;


                            current = this_ItemDeclaration_0;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2345:5: this_ProcedureDeclaration_1= ruleProcedureDeclaration
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getItemAccess().getProcedureDeclarationParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleProcedureDeclaration_in_ruleItem4485);
                    this_ProcedureDeclaration_1=ruleProcedureDeclaration();
                    _fsp--;


                            current = this_ProcedureDeclaration_1;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2355:5: this_ProcedureDefinition_2= ruleProcedureDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getItemAccess().getProcedureDefinitionParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleProcedureDefinition_in_ruleItem4512);
                    this_ProcedureDefinition_2=ruleProcedureDefinition();
                    _fsp--;


                            current = this_ProcedureDefinition_2;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2365:5: this_Pragma_3= rulePragma
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getItemAccess().getPragmaParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePragma_in_ruleItem4539);
                    this_Pragma_3=rulePragma();
                    _fsp--;


                            current = this_Pragma_3;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleItem


    // $ANTLR start entryRuleItemDeclaration
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2381:1: entryRuleItemDeclaration returns [EObject current=null] : iv_ruleItemDeclaration= ruleItemDeclaration EOF ;
    public final EObject entryRuleItemDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemDeclaration = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2382:2: (iv_ruleItemDeclaration= ruleItemDeclaration EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2383:2: iv_ruleItemDeclaration= ruleItemDeclaration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getItemDeclarationRule(), currentNode); 
            pushFollow(FOLLOW_ruleItemDeclaration_in_entryRuleItemDeclaration4573);
            iv_ruleItemDeclaration=ruleItemDeclaration();
            _fsp--;

             current =iv_ruleItemDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItemDeclaration4583); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleItemDeclaration


    // $ANTLR start ruleItemDeclaration
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2390:1: ruleItemDeclaration returns [EObject current=null] : this_VariableDeclaration_0= ruleVariableDeclaration ;
    public final EObject ruleItemDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDeclaration_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2395:6: (this_VariableDeclaration_0= ruleVariableDeclaration )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2397:5: this_VariableDeclaration_0= ruleVariableDeclaration
            {
             
                    currentNode=createCompositeNode(grammarAccess.getItemDeclarationAccess().getVariableDeclarationParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleItemDeclaration4629);
            this_VariableDeclaration_0=ruleVariableDeclaration();
            _fsp--;


                    current = this_VariableDeclaration_0;
                    currentNode = currentNode.getParent();
                

            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleItemDeclaration


    // $ANTLR start entryRuleExternalProcedureDeclaration
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2413:1: entryRuleExternalProcedureDeclaration returns [EObject current=null] : iv_ruleExternalProcedureDeclaration= ruleExternalProcedureDeclaration EOF ;
    public final EObject entryRuleExternalProcedureDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalProcedureDeclaration = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2414:2: (iv_ruleExternalProcedureDeclaration= ruleExternalProcedureDeclaration EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2415:2: iv_ruleExternalProcedureDeclaration= ruleExternalProcedureDeclaration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExternalProcedureDeclarationRule(), currentNode); 
            pushFollow(FOLLOW_ruleExternalProcedureDeclaration_in_entryRuleExternalProcedureDeclaration4662);
            iv_ruleExternalProcedureDeclaration=ruleExternalProcedureDeclaration();
            _fsp--;

             current =iv_ruleExternalProcedureDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalProcedureDeclaration4672); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExternalProcedureDeclaration


    // $ANTLR start ruleExternalProcedureDeclaration
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2422:1: ruleExternalProcedureDeclaration returns [EObject current=null] : ( () KEYWORD_56 ) ;
    public final EObject ruleExternalProcedureDeclaration() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2427:6: ( ( () KEYWORD_56 ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2428:1: ( () KEYWORD_56 )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2428:1: ( () KEYWORD_56 )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2428:2: () KEYWORD_56
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2428:2: ()
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2429:5: 
            {
             
                    temp=factory.create(grammarAccess.getExternalProcedureDeclarationAccess().getExternalProcedureDeclarationAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getExternalProcedureDeclarationAccess().getExternalProcedureDeclarationAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_ruleExternalProcedureDeclaration4717); 

                    createLeafNode(grammarAccess.getExternalProcedureDeclarationAccess().getEXTERNALKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExternalProcedureDeclaration


    // $ANTLR start entryRuleVariableDeclaration
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2452:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2453:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2454:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVariableDeclarationRule(), currentNode); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration4752);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();
            _fsp--;

             current =iv_ruleVariableDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration4762); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVariableDeclaration


    // $ANTLR start ruleVariableDeclaration
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2461:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_isConstant_1_0= KEYWORD_54 ) )? ( (lv_dataType_2_0= ruleDataType ) ) ( (lv_isNotNull_3_0= ruleNOT_NULL ) )? ( (lv_value_4_0= ruleVariableValue ) )? KEYWORD_6 ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_isConstant_1_0=null;
        AntlrDatatypeRuleToken lv_dataType_2_0 = null;

        AntlrDatatypeRuleToken lv_isNotNull_3_0 = null;

        EObject lv_value_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2466:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_isConstant_1_0= KEYWORD_54 ) )? ( (lv_dataType_2_0= ruleDataType ) ) ( (lv_isNotNull_3_0= ruleNOT_NULL ) )? ( (lv_value_4_0= ruleVariableValue ) )? KEYWORD_6 ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2467:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_isConstant_1_0= KEYWORD_54 ) )? ( (lv_dataType_2_0= ruleDataType ) ) ( (lv_isNotNull_3_0= ruleNOT_NULL ) )? ( (lv_value_4_0= ruleVariableValue ) )? KEYWORD_6 )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2467:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_isConstant_1_0= KEYWORD_54 ) )? ( (lv_dataType_2_0= ruleDataType ) ) ( (lv_isNotNull_3_0= ruleNOT_NULL ) )? ( (lv_value_4_0= ruleVariableValue ) )? KEYWORD_6 )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2467:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_isConstant_1_0= KEYWORD_54 ) )? ( (lv_dataType_2_0= ruleDataType ) ) ( (lv_isNotNull_3_0= ruleNOT_NULL ) )? ( (lv_value_4_0= ruleVariableValue ) )? KEYWORD_6
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2467:2: ( (lv_name_0_0= RULE_ID ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2468:1: (lv_name_0_0= RULE_ID )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2468:1: (lv_name_0_0= RULE_ID )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2469:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration4804); 

            			createLeafNode(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVariableDeclarationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2491:2: ( (lv_isConstant_1_0= KEYWORD_54 ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==KEYWORD_54) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2492:1: (lv_isConstant_1_0= KEYWORD_54 )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2492:1: (lv_isConstant_1_0= KEYWORD_54 )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2493:3: lv_isConstant_1_0= KEYWORD_54
                    {
                    lv_isConstant_1_0=(Token)input.LT(1);
                    match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_ruleVariableDeclaration4828); 

                            createLeafNode(grammarAccess.getVariableDeclarationAccess().getIsConstantCONSTANTKeyword_1_0(), "isConstant"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getVariableDeclarationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "isConstant", true, "CONSTANT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2513:3: ( (lv_dataType_2_0= ruleDataType ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2514:1: (lv_dataType_2_0= ruleDataType )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2514:1: (lv_dataType_2_0= ruleDataType )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2515:3: lv_dataType_2_0= ruleDataType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getVariableDeclarationAccess().getDataTypeDataTypeParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDataType_in_ruleVariableDeclaration4863);
            lv_dataType_2_0=ruleDataType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVariableDeclarationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"dataType",
            	        		lv_dataType_2_0, 
            	        		"DataType", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2537:2: ( (lv_isNotNull_3_0= ruleNOT_NULL ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==KEYWORD_17) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2538:1: (lv_isNotNull_3_0= ruleNOT_NULL )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2538:1: (lv_isNotNull_3_0= ruleNOT_NULL )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2539:3: lv_isNotNull_3_0= ruleNOT_NULL
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getVariableDeclarationAccess().getIsNotNullNOT_NULLParserRuleCall_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleNOT_NULL_in_ruleVariableDeclaration4884);
                    lv_isNotNull_3_0=ruleNOT_NULL();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getVariableDeclarationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"isNotNull",
                    	        		true, 
                    	        		"NOT_NULL", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2561:3: ( (lv_value_4_0= ruleVariableValue ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==KEYWORD_50||LA45_0==KEYWORD_8) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2562:1: (lv_value_4_0= ruleVariableValue )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2562:1: (lv_value_4_0= ruleVariableValue )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2563:3: lv_value_4_0= ruleVariableValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getVariableDeclarationAccess().getValueVariableValueParserRuleCall_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleVariableValue_in_ruleVariableDeclaration4906);
                    lv_value_4_0=ruleVariableValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getVariableDeclarationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_4_0, 
                    	        		"VariableValue", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleVariableDeclaration4918); 

                    createLeafNode(grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVariableDeclaration


    // $ANTLR start entryRuleNOT_NULL
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2598:1: entryRuleNOT_NULL returns [String current=null] : iv_ruleNOT_NULL= ruleNOT_NULL EOF ;
    public final String entryRuleNOT_NULL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNOT_NULL = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2599:1: (iv_ruleNOT_NULL= ruleNOT_NULL EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2600:2: iv_ruleNOT_NULL= ruleNOT_NULL EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNOT_NULLRule(), currentNode); 
            pushFollow(FOLLOW_ruleNOT_NULL_in_entryRuleNOT_NULL4954);
            iv_ruleNOT_NULL=ruleNOT_NULL();
            _fsp--;

             current =iv_ruleNOT_NULL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNOT_NULL4965); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNOT_NULL


    // $ANTLR start ruleNOT_NULL
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2607:1: ruleNOT_NULL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_17 kw= KEYWORD_26 ) ;
    public final AntlrDatatypeRuleToken ruleNOT_NULL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2612:6: ( (kw= KEYWORD_17 kw= KEYWORD_26 ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2613:1: (kw= KEYWORD_17 kw= KEYWORD_26 )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2613:1: (kw= KEYWORD_17 kw= KEYWORD_26 )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2614:2: kw= KEYWORD_17 kw= KEYWORD_26
            {
            kw=(Token)input.LT(1);
            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleNOT_NULL5003); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getNOT_NULLAccess().getNOTKeyword_0(), null); 
                
            kw=(Token)input.LT(1);
            match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleNOT_NULL5016); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getNOT_NULLAccess().getNULLKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNOT_NULL


    // $ANTLR start entryRuleVariableValue
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2633:1: entryRuleVariableValue returns [EObject current=null] : iv_ruleVariableValue= ruleVariableValue EOF ;
    public final EObject entryRuleVariableValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableValue = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2634:2: (iv_ruleVariableValue= ruleVariableValue EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2635:2: iv_ruleVariableValue= ruleVariableValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVariableValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleVariableValue_in_entryRuleVariableValue5055);
            iv_ruleVariableValue=ruleVariableValue();
            _fsp--;

             current =iv_ruleVariableValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableValue5065); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVariableValue


    // $ANTLR start ruleVariableValue
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2642:1: ruleVariableValue returns [EObject current=null] : ( ( KEYWORD_8 | KEYWORD_50 ) ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleVariableValue() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2647:6: ( ( ( KEYWORD_8 | KEYWORD_50 ) ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2648:1: ( ( KEYWORD_8 | KEYWORD_50 ) ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2648:1: ( ( KEYWORD_8 | KEYWORD_50 ) ( (lv_expression_2_0= ruleExpression ) ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2648:2: ( KEYWORD_8 | KEYWORD_50 ) ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2648:2: ( KEYWORD_8 | KEYWORD_50 )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==KEYWORD_8) ) {
                alt46=1;
            }
            else if ( (LA46_0==KEYWORD_50) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2648:2: ( KEYWORD_8 | KEYWORD_50 )", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2649:2: KEYWORD_8
                    {
                    match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleVariableValue5102); 

                            createLeafNode(grammarAccess.getVariableValueAccess().getColonEqualsSignKeyword_0_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2655:2: KEYWORD_50
                    {
                    match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_ruleVariableValue5119); 

                            createLeafNode(grammarAccess.getVariableValueAccess().getDEFAULTKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2659:2: ( (lv_expression_2_0= ruleExpression ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2660:1: (lv_expression_2_0= ruleExpression )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2660:1: (lv_expression_2_0= ruleExpression )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2661:3: lv_expression_2_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getVariableValueAccess().getExpressionExpressionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleVariableValue5141);
            lv_expression_2_0=ruleExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVariableValueRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"expression",
            	        		lv_expression_2_0, 
            	        		"Expression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVariableValue


    // $ANTLR start entryRuleExpression
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2691:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2692:2: (iv_ruleExpression= ruleExpression EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2693:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression5176);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression5186); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2700:1: ruleExpression returns [EObject current=null] : (this_IntLiteralExpression_0= ruleIntLiteralExpression | this_StringLiteralExpression_1= ruleStringLiteralExpression | this_BooleanLiteralExpression_2= ruleBooleanLiteralExpression | this_NullLiteralExpression_3= ruleNullLiteralExpression | this_VariableRefExpression_4= ruleVariableRefExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntLiteralExpression_0 = null;

        EObject this_StringLiteralExpression_1 = null;

        EObject this_BooleanLiteralExpression_2 = null;

        EObject this_NullLiteralExpression_3 = null;

        EObject this_VariableRefExpression_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2705:6: ( (this_IntLiteralExpression_0= ruleIntLiteralExpression | this_StringLiteralExpression_1= ruleStringLiteralExpression | this_BooleanLiteralExpression_2= ruleBooleanLiteralExpression | this_NullLiteralExpression_3= ruleNullLiteralExpression | this_VariableRefExpression_4= ruleVariableRefExpression ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2706:1: (this_IntLiteralExpression_0= ruleIntLiteralExpression | this_StringLiteralExpression_1= ruleStringLiteralExpression | this_BooleanLiteralExpression_2= ruleBooleanLiteralExpression | this_NullLiteralExpression_3= ruleNullLiteralExpression | this_VariableRefExpression_4= ruleVariableRefExpression )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2706:1: (this_IntLiteralExpression_0= ruleIntLiteralExpression | this_StringLiteralExpression_1= ruleStringLiteralExpression | this_BooleanLiteralExpression_2= ruleBooleanLiteralExpression | this_NullLiteralExpression_3= ruleNullLiteralExpression | this_VariableRefExpression_4= ruleVariableRefExpression )
            int alt47=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt47=1;
                }
                break;
            case RULE_STRING:
                {
                alt47=2;
                }
                break;
            case KEYWORD_37:
            case KEYWORD_30:
                {
                alt47=3;
                }
                break;
            case KEYWORD_26:
                {
                alt47=4;
                }
                break;
            case KEYWORD_5:
            case RULE_ID:
                {
                alt47=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2706:1: (this_IntLiteralExpression_0= ruleIntLiteralExpression | this_StringLiteralExpression_1= ruleStringLiteralExpression | this_BooleanLiteralExpression_2= ruleBooleanLiteralExpression | this_NullLiteralExpression_3= ruleNullLiteralExpression | this_VariableRefExpression_4= ruleVariableRefExpression )", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2707:5: this_IntLiteralExpression_0= ruleIntLiteralExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getIntLiteralExpressionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntLiteralExpression_in_ruleExpression5233);
                    this_IntLiteralExpression_0=ruleIntLiteralExpression();
                    _fsp--;


                            current = this_IntLiteralExpression_0;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2717:5: this_StringLiteralExpression_1= ruleStringLiteralExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getStringLiteralExpressionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringLiteralExpression_in_ruleExpression5260);
                    this_StringLiteralExpression_1=ruleStringLiteralExpression();
                    _fsp--;


                            current = this_StringLiteralExpression_1;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2727:5: this_BooleanLiteralExpression_2= ruleBooleanLiteralExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getBooleanLiteralExpressionParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBooleanLiteralExpression_in_ruleExpression5287);
                    this_BooleanLiteralExpression_2=ruleBooleanLiteralExpression();
                    _fsp--;


                            current = this_BooleanLiteralExpression_2;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2737:5: this_NullLiteralExpression_3= ruleNullLiteralExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getNullLiteralExpressionParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNullLiteralExpression_in_ruleExpression5314);
                    this_NullLiteralExpression_3=ruleNullLiteralExpression();
                    _fsp--;


                            current = this_NullLiteralExpression_3;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2747:5: this_VariableRefExpression_4= ruleVariableRefExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getVariableRefExpressionParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVariableRefExpression_in_ruleExpression5341);
                    this_VariableRefExpression_4=ruleVariableRefExpression();
                    _fsp--;


                            current = this_VariableRefExpression_4;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleIntLiteralExpression
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2763:1: entryRuleIntLiteralExpression returns [EObject current=null] : iv_ruleIntLiteralExpression= ruleIntLiteralExpression EOF ;
    public final EObject entryRuleIntLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteralExpression = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2764:2: (iv_ruleIntLiteralExpression= ruleIntLiteralExpression EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2765:2: iv_ruleIntLiteralExpression= ruleIntLiteralExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntLiteralExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntLiteralExpression_in_entryRuleIntLiteralExpression5375);
            iv_ruleIntLiteralExpression=ruleIntLiteralExpression();
            _fsp--;

             current =iv_ruleIntLiteralExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteralExpression5385); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIntLiteralExpression


    // $ANTLR start ruleIntLiteralExpression
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2772:1: ruleIntLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2777:6: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2778:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2778:1: ( (lv_value_0_0= RULE_INT ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2779:1: (lv_value_0_0= RULE_INT )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2779:1: (lv_value_0_0= RULE_INT )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2780:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteralExpression5426); 

            			createLeafNode(grammarAccess.getIntLiteralExpressionAccess().getValueINTTerminalRuleCall_0(), "value"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIntLiteralExpressionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_0_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIntLiteralExpression


    // $ANTLR start entryRuleStringLiteralExpression
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2810:1: entryRuleStringLiteralExpression returns [EObject current=null] : iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF ;
    public final EObject entryRuleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpression = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2811:2: (iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2812:2: iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringLiteralExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringLiteralExpression_in_entryRuleStringLiteralExpression5465);
            iv_ruleStringLiteralExpression=ruleStringLiteralExpression();
            _fsp--;

             current =iv_ruleStringLiteralExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteralExpression5475); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStringLiteralExpression


    // $ANTLR start ruleStringLiteralExpression
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2819:1: ruleStringLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2824:6: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2825:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2825:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2826:1: (lv_value_0_0= RULE_STRING )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2826:1: (lv_value_0_0= RULE_STRING )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2827:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteralExpression5516); 

            			createLeafNode(grammarAccess.getStringLiteralExpressionAccess().getValueSTRINGTerminalRuleCall_0(), "value"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStringLiteralExpressionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_0_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStringLiteralExpression


    // $ANTLR start entryRuleBooleanLiteralExpression
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2857:1: entryRuleBooleanLiteralExpression returns [EObject current=null] : iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF ;
    public final EObject entryRuleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpression = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2858:2: (iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2859:2: iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanLiteralExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleBooleanLiteralExpression_in_entryRuleBooleanLiteralExpression5555);
            iv_ruleBooleanLiteralExpression=ruleBooleanLiteralExpression();
            _fsp--;

             current =iv_ruleBooleanLiteralExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteralExpression5565); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBooleanLiteralExpression


    // $ANTLR start ruleBooleanLiteralExpression
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2866:1: ruleBooleanLiteralExpression returns [EObject current=null] : ( ( (lv_value_0_1= KEYWORD_30 | lv_value_0_2= KEYWORD_37 ) ) ) ;
    public final EObject ruleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2871:6: ( ( ( (lv_value_0_1= KEYWORD_30 | lv_value_0_2= KEYWORD_37 ) ) ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2872:1: ( ( (lv_value_0_1= KEYWORD_30 | lv_value_0_2= KEYWORD_37 ) ) )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2872:1: ( ( (lv_value_0_1= KEYWORD_30 | lv_value_0_2= KEYWORD_37 ) ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2873:1: ( (lv_value_0_1= KEYWORD_30 | lv_value_0_2= KEYWORD_37 ) )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2873:1: ( (lv_value_0_1= KEYWORD_30 | lv_value_0_2= KEYWORD_37 ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2874:1: (lv_value_0_1= KEYWORD_30 | lv_value_0_2= KEYWORD_37 )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2874:1: (lv_value_0_1= KEYWORD_30 | lv_value_0_2= KEYWORD_37 )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==KEYWORD_30) ) {
                alt48=1;
            }
            else if ( (LA48_0==KEYWORD_37) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2874:1: (lv_value_0_1= KEYWORD_30 | lv_value_0_2= KEYWORD_37 )", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2875:3: lv_value_0_1= KEYWORD_30
                    {
                    lv_value_0_1=(Token)input.LT(1);
                    match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleBooleanLiteralExpression5610); 

                            createLeafNode(grammarAccess.getBooleanLiteralExpressionAccess().getValueTRUEKeyword_0_0(), "value"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBooleanLiteralExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "value", lv_value_0_1, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 2 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2894:8: lv_value_0_2= KEYWORD_37
                    {
                    lv_value_0_2=(Token)input.LT(1);
                    match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleBooleanLiteralExpression5640); 

                            createLeafNode(grammarAccess.getBooleanLiteralExpressionAccess().getValueFALSEKeyword_0_1(), "value"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBooleanLiteralExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "value", lv_value_0_2, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBooleanLiteralExpression


    // $ANTLR start entryRuleNullLiteralExpression
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2924:1: entryRuleNullLiteralExpression returns [EObject current=null] : iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF ;
    public final EObject entryRuleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpression = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2925:2: (iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2926:2: iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNullLiteralExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleNullLiteralExpression_in_entryRuleNullLiteralExpression5690);
            iv_ruleNullLiteralExpression=ruleNullLiteralExpression();
            _fsp--;

             current =iv_ruleNullLiteralExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteralExpression5700); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNullLiteralExpression


    // $ANTLR start ruleNullLiteralExpression
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2933:1: ruleNullLiteralExpression returns [EObject current=null] : ( () KEYWORD_26 ) ;
    public final EObject ruleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2938:6: ( ( () KEYWORD_26 ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2939:1: ( () KEYWORD_26 )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2939:1: ( () KEYWORD_26 )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2939:2: () KEYWORD_26
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2939:2: ()
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2940:5: 
            {
             
                    temp=factory.create(grammarAccess.getNullLiteralExpressionAccess().getNullLiteralExpressionAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getNullLiteralExpressionAccess().getNullLiteralExpressionAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleNullLiteralExpression5745); 

                    createLeafNode(grammarAccess.getNullLiteralExpressionAccess().getNULLKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNullLiteralExpression


    // $ANTLR start entryRuleVariableRefExpression
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2963:1: entryRuleVariableRefExpression returns [EObject current=null] : iv_ruleVariableRefExpression= ruleVariableRefExpression EOF ;
    public final EObject entryRuleVariableRefExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableRefExpression = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2964:2: (iv_ruleVariableRefExpression= ruleVariableRefExpression EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2965:2: iv_ruleVariableRefExpression= ruleVariableRefExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVariableRefExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleVariableRefExpression_in_entryRuleVariableRefExpression5780);
            iv_ruleVariableRefExpression=ruleVariableRefExpression();
            _fsp--;

             current =iv_ruleVariableRefExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableRefExpression5790); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVariableRefExpression


    // $ANTLR start ruleVariableRefExpression
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2972:1: ruleVariableRefExpression returns [EObject current=null] : ( (lv_variable_0_0= ruleVariableRef ) ) ;
    public final EObject ruleVariableRefExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_variable_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2977:6: ( ( (lv_variable_0_0= ruleVariableRef ) ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2978:1: ( (lv_variable_0_0= ruleVariableRef ) )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2978:1: ( (lv_variable_0_0= ruleVariableRef ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2979:1: (lv_variable_0_0= ruleVariableRef )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2979:1: (lv_variable_0_0= ruleVariableRef )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:2980:3: lv_variable_0_0= ruleVariableRef
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getVariableRefExpressionAccess().getVariableVariableRefParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleVariableRef_in_ruleVariableRefExpression5835);
            lv_variable_0_0=ruleVariableRef();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVariableRefExpressionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"variable",
            	        		lv_variable_0_0, 
            	        		"VariableRef", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVariableRefExpression


    // $ANTLR start entryRuleStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3010:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3011:2: (iv_ruleStatement= ruleStatement EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3012:2: iv_ruleStatement= ruleStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement5869);
            iv_ruleStatement=ruleStatement();
            _fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement5879); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStatement


    // $ANTLR start ruleStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3019:1: ruleStatement returns [EObject current=null] : (this_AssignmentStatement_0= ruleAssignmentStatement | this_BlockStatement_1= ruleBlockStatement | this_CaseStatement_2= ruleCaseStatement | this_CloseStatement_3= ruleCloseStatement | this_ContinueStatement_4= ruleContinueStatement | this_ExitStatement_5= ruleExitStatement | this_FetchStatement_6= ruleFetchStatement | this_GotoStatement_7= ruleGotoStatement | this_IfStatement_8= ruleIfStatement | this_LoopStatement_9= ruleLoopStatement | this_NullStatement_10= ruleNullStatement | this_RaiseStatement_11= ruleRaiseStatement | this_ReturnStatement_12= ruleReturnStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_AssignmentStatement_0 = null;

        EObject this_BlockStatement_1 = null;

        EObject this_CaseStatement_2 = null;

        EObject this_CloseStatement_3 = null;

        EObject this_ContinueStatement_4 = null;

        EObject this_ExitStatement_5 = null;

        EObject this_FetchStatement_6 = null;

        EObject this_GotoStatement_7 = null;

        EObject this_IfStatement_8 = null;

        EObject this_LoopStatement_9 = null;

        EObject this_NullStatement_10 = null;

        EObject this_RaiseStatement_11 = null;

        EObject this_ReturnStatement_12 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3024:6: ( (this_AssignmentStatement_0= ruleAssignmentStatement | this_BlockStatement_1= ruleBlockStatement | this_CaseStatement_2= ruleCaseStatement | this_CloseStatement_3= ruleCloseStatement | this_ContinueStatement_4= ruleContinueStatement | this_ExitStatement_5= ruleExitStatement | this_FetchStatement_6= ruleFetchStatement | this_GotoStatement_7= ruleGotoStatement | this_IfStatement_8= ruleIfStatement | this_LoopStatement_9= ruleLoopStatement | this_NullStatement_10= ruleNullStatement | this_RaiseStatement_11= ruleRaiseStatement | this_ReturnStatement_12= ruleReturnStatement ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3025:1: (this_AssignmentStatement_0= ruleAssignmentStatement | this_BlockStatement_1= ruleBlockStatement | this_CaseStatement_2= ruleCaseStatement | this_CloseStatement_3= ruleCloseStatement | this_ContinueStatement_4= ruleContinueStatement | this_ExitStatement_5= ruleExitStatement | this_FetchStatement_6= ruleFetchStatement | this_GotoStatement_7= ruleGotoStatement | this_IfStatement_8= ruleIfStatement | this_LoopStatement_9= ruleLoopStatement | this_NullStatement_10= ruleNullStatement | this_RaiseStatement_11= ruleRaiseStatement | this_ReturnStatement_12= ruleReturnStatement )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3025:1: (this_AssignmentStatement_0= ruleAssignmentStatement | this_BlockStatement_1= ruleBlockStatement | this_CaseStatement_2= ruleCaseStatement | this_CloseStatement_3= ruleCloseStatement | this_ContinueStatement_4= ruleContinueStatement | this_ExitStatement_5= ruleExitStatement | this_FetchStatement_6= ruleFetchStatement | this_GotoStatement_7= ruleGotoStatement | this_IfStatement_8= ruleIfStatement | this_LoopStatement_9= ruleLoopStatement | this_NullStatement_10= ruleNullStatement | this_RaiseStatement_11= ruleRaiseStatement | this_ReturnStatement_12= ruleReturnStatement )
            int alt49=13;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3026:5: this_AssignmentStatement_0= ruleAssignmentStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getAssignmentStatementParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAssignmentStatement_in_ruleStatement5926);
                    this_AssignmentStatement_0=ruleAssignmentStatement();
                    _fsp--;


                            current = this_AssignmentStatement_0;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3036:5: this_BlockStatement_1= ruleBlockStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getBlockStatementParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBlockStatement_in_ruleStatement5953);
                    this_BlockStatement_1=ruleBlockStatement();
                    _fsp--;


                            current = this_BlockStatement_1;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3046:5: this_CaseStatement_2= ruleCaseStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getCaseStatementParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCaseStatement_in_ruleStatement5980);
                    this_CaseStatement_2=ruleCaseStatement();
                    _fsp--;


                            current = this_CaseStatement_2;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3056:5: this_CloseStatement_3= ruleCloseStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getCloseStatementParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCloseStatement_in_ruleStatement6007);
                    this_CloseStatement_3=ruleCloseStatement();
                    _fsp--;


                            current = this_CloseStatement_3;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3066:5: this_ContinueStatement_4= ruleContinueStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getContinueStatementParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleContinueStatement_in_ruleStatement6034);
                    this_ContinueStatement_4=ruleContinueStatement();
                    _fsp--;


                            current = this_ContinueStatement_4;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3076:5: this_ExitStatement_5= ruleExitStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getExitStatementParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExitStatement_in_ruleStatement6061);
                    this_ExitStatement_5=ruleExitStatement();
                    _fsp--;


                            current = this_ExitStatement_5;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3086:5: this_FetchStatement_6= ruleFetchStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getFetchStatementParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFetchStatement_in_ruleStatement6088);
                    this_FetchStatement_6=ruleFetchStatement();
                    _fsp--;


                            current = this_FetchStatement_6;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 8 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3096:5: this_GotoStatement_7= ruleGotoStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getGotoStatementParserRuleCall_7(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleGotoStatement_in_ruleStatement6115);
                    this_GotoStatement_7=ruleGotoStatement();
                    _fsp--;


                            current = this_GotoStatement_7;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 9 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3106:5: this_IfStatement_8= ruleIfStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_8(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIfStatement_in_ruleStatement6142);
                    this_IfStatement_8=ruleIfStatement();
                    _fsp--;


                            current = this_IfStatement_8;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 10 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3116:5: this_LoopStatement_9= ruleLoopStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getLoopStatementParserRuleCall_9(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLoopStatement_in_ruleStatement6169);
                    this_LoopStatement_9=ruleLoopStatement();
                    _fsp--;


                            current = this_LoopStatement_9;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 11 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3126:5: this_NullStatement_10= ruleNullStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getNullStatementParserRuleCall_10(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNullStatement_in_ruleStatement6196);
                    this_NullStatement_10=ruleNullStatement();
                    _fsp--;


                            current = this_NullStatement_10;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 12 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3136:5: this_RaiseStatement_11= ruleRaiseStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getRaiseStatementParserRuleCall_11(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRaiseStatement_in_ruleStatement6223);
                    this_RaiseStatement_11=ruleRaiseStatement();
                    _fsp--;


                            current = this_RaiseStatement_11;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 13 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3146:5: this_ReturnStatement_12= ruleReturnStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getReturnStatementParserRuleCall_12(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleReturnStatement_in_ruleStatement6250);
                    this_ReturnStatement_12=ruleReturnStatement();
                    _fsp--;


                            current = this_ReturnStatement_12;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStatement


    // $ANTLR start entryRuleLabel
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3162:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3163:2: (iv_ruleLabel= ruleLabel EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3164:2: iv_ruleLabel= ruleLabel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLabelRule(), currentNode); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel6284);
            iv_ruleLabel=ruleLabel();
            _fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel6294); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLabel


    // $ANTLR start ruleLabel
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3171:1: ruleLabel returns [EObject current=null] : ( KEYWORD_9 ( (lv_name_1_0= RULE_ID ) ) KEYWORD_10 ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3176:6: ( ( KEYWORD_9 ( (lv_name_1_0= RULE_ID ) ) KEYWORD_10 ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3177:1: ( KEYWORD_9 ( (lv_name_1_0= RULE_ID ) ) KEYWORD_10 )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3177:1: ( KEYWORD_9 ( (lv_name_1_0= RULE_ID ) ) KEYWORD_10 )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3178:2: KEYWORD_9 ( (lv_name_1_0= RULE_ID ) ) KEYWORD_10
            {
            match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleLabel6330); 

                    createLeafNode(grammarAccess.getLabelAccess().getLessThanSignLessThanSignKeyword_0(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3182:1: ( (lv_name_1_0= RULE_ID ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3183:1: (lv_name_1_0= RULE_ID )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3183:1: (lv_name_1_0= RULE_ID )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3184:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabel6347); 

            			createLeafNode(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLabelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleLabel6363); 

                    createLeafNode(grammarAccess.getLabelAccess().getGreaterThanSignGreaterThanSignKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLabel


    // $ANTLR start entryRuleAssignmentStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3219:1: entryRuleAssignmentStatement returns [EObject current=null] : iv_ruleAssignmentStatement= ruleAssignmentStatement EOF ;
    public final EObject entryRuleAssignmentStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentStatement = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3220:2: (iv_ruleAssignmentStatement= ruleAssignmentStatement EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3221:2: iv_ruleAssignmentStatement= ruleAssignmentStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssignmentStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssignmentStatement_in_entryRuleAssignmentStatement6398);
            iv_ruleAssignmentStatement=ruleAssignmentStatement();
            _fsp--;

             current =iv_ruleAssignmentStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentStatement6408); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAssignmentStatement


    // $ANTLR start ruleAssignmentStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3228:1: ruleAssignmentStatement returns [EObject current=null] : ( ( (lv_labels_0_0= ruleLabel ) )* ( (lv_target_1_0= ruleAssignmentTarget ) ) KEYWORD_8 ( (lv_expression_3_0= ruleExpression ) ) KEYWORD_6 ) ;
    public final EObject ruleAssignmentStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_labels_0_0 = null;

        EObject lv_target_1_0 = null;

        EObject lv_expression_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3233:6: ( ( ( (lv_labels_0_0= ruleLabel ) )* ( (lv_target_1_0= ruleAssignmentTarget ) ) KEYWORD_8 ( (lv_expression_3_0= ruleExpression ) ) KEYWORD_6 ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3234:1: ( ( (lv_labels_0_0= ruleLabel ) )* ( (lv_target_1_0= ruleAssignmentTarget ) ) KEYWORD_8 ( (lv_expression_3_0= ruleExpression ) ) KEYWORD_6 )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3234:1: ( ( (lv_labels_0_0= ruleLabel ) )* ( (lv_target_1_0= ruleAssignmentTarget ) ) KEYWORD_8 ( (lv_expression_3_0= ruleExpression ) ) KEYWORD_6 )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3234:2: ( (lv_labels_0_0= ruleLabel ) )* ( (lv_target_1_0= ruleAssignmentTarget ) ) KEYWORD_8 ( (lv_expression_3_0= ruleExpression ) ) KEYWORD_6
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3234:2: ( (lv_labels_0_0= ruleLabel ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==KEYWORD_9) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3235:1: (lv_labels_0_0= ruleLabel )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3235:1: (lv_labels_0_0= ruleLabel )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3236:3: lv_labels_0_0= ruleLabel
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAssignmentStatementAccess().getLabelsLabelParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLabel_in_ruleAssignmentStatement6454);
            	    lv_labels_0_0=ruleLabel();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAssignmentStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"labels",
            	    	        		lv_labels_0_0, 
            	    	        		"Label", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3258:3: ( (lv_target_1_0= ruleAssignmentTarget ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3259:1: (lv_target_1_0= ruleAssignmentTarget )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3259:1: (lv_target_1_0= ruleAssignmentTarget )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3260:3: lv_target_1_0= ruleAssignmentTarget
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAssignmentStatementAccess().getTargetAssignmentTargetParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAssignmentTarget_in_ruleAssignmentStatement6476);
            lv_target_1_0=ruleAssignmentTarget();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssignmentStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"target",
            	        		lv_target_1_0, 
            	        		"AssignmentTarget", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleAssignmentStatement6487); 

                    createLeafNode(grammarAccess.getAssignmentStatementAccess().getColonEqualsSignKeyword_2(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3287:1: ( (lv_expression_3_0= ruleExpression ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3288:1: (lv_expression_3_0= ruleExpression )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3288:1: (lv_expression_3_0= ruleExpression )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3289:3: lv_expression_3_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAssignmentStatementAccess().getExpressionExpressionParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignmentStatement6508);
            lv_expression_3_0=ruleExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssignmentStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"expression",
            	        		lv_expression_3_0, 
            	        		"Expression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleAssignmentStatement6519); 

                    createLeafNode(grammarAccess.getAssignmentStatementAccess().getSemicolonKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAssignmentStatement


    // $ANTLR start entryRuleAssignmentTarget
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3324:1: entryRuleAssignmentTarget returns [EObject current=null] : iv_ruleAssignmentTarget= ruleAssignmentTarget EOF ;
    public final EObject entryRuleAssignmentTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentTarget = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3325:2: (iv_ruleAssignmentTarget= ruleAssignmentTarget EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3326:2: iv_ruleAssignmentTarget= ruleAssignmentTarget EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssignmentTargetRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssignmentTarget_in_entryRuleAssignmentTarget6554);
            iv_ruleAssignmentTarget=ruleAssignmentTarget();
            _fsp--;

             current =iv_ruleAssignmentTarget; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentTarget6564); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAssignmentTarget


    // $ANTLR start ruleAssignmentTarget
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3333:1: ruleAssignmentTarget returns [EObject current=null] : this_VariableAssignmentTarget_0= ruleVariableAssignmentTarget ;
    public final EObject ruleAssignmentTarget() throws RecognitionException {
        EObject current = null;

        EObject this_VariableAssignmentTarget_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3338:6: (this_VariableAssignmentTarget_0= ruleVariableAssignmentTarget )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3340:5: this_VariableAssignmentTarget_0= ruleVariableAssignmentTarget
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAssignmentTargetAccess().getVariableAssignmentTargetParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleVariableAssignmentTarget_in_ruleAssignmentTarget6610);
            this_VariableAssignmentTarget_0=ruleVariableAssignmentTarget();
            _fsp--;


                    current = this_VariableAssignmentTarget_0;
                    currentNode = currentNode.getParent();
                

            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAssignmentTarget


    // $ANTLR start entryRuleVariableAssignmentTarget
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3356:1: entryRuleVariableAssignmentTarget returns [EObject current=null] : iv_ruleVariableAssignmentTarget= ruleVariableAssignmentTarget EOF ;
    public final EObject entryRuleVariableAssignmentTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignmentTarget = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3357:2: (iv_ruleVariableAssignmentTarget= ruleVariableAssignmentTarget EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3358:2: iv_ruleVariableAssignmentTarget= ruleVariableAssignmentTarget EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVariableAssignmentTargetRule(), currentNode); 
            pushFollow(FOLLOW_ruleVariableAssignmentTarget_in_entryRuleVariableAssignmentTarget6643);
            iv_ruleVariableAssignmentTarget=ruleVariableAssignmentTarget();
            _fsp--;

             current =iv_ruleVariableAssignmentTarget; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAssignmentTarget6653); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVariableAssignmentTarget


    // $ANTLR start ruleVariableAssignmentTarget
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3365:1: ruleVariableAssignmentTarget returns [EObject current=null] : ( (lv_variable_0_0= ruleVariableRef ) ) ;
    public final EObject ruleVariableAssignmentTarget() throws RecognitionException {
        EObject current = null;

        EObject lv_variable_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3370:6: ( ( (lv_variable_0_0= ruleVariableRef ) ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3371:1: ( (lv_variable_0_0= ruleVariableRef ) )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3371:1: ( (lv_variable_0_0= ruleVariableRef ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3372:1: (lv_variable_0_0= ruleVariableRef )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3372:1: (lv_variable_0_0= ruleVariableRef )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3373:3: lv_variable_0_0= ruleVariableRef
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getVariableAssignmentTargetAccess().getVariableVariableRefParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleVariableRef_in_ruleVariableAssignmentTarget6698);
            lv_variable_0_0=ruleVariableRef();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVariableAssignmentTargetRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"variable",
            	        		lv_variable_0_0, 
            	        		"VariableRef", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVariableAssignmentTarget


    // $ANTLR start entryRuleBlockStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3403:1: entryRuleBlockStatement returns [EObject current=null] : iv_ruleBlockStatement= ruleBlockStatement EOF ;
    public final EObject entryRuleBlockStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockStatement = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3404:2: (iv_ruleBlockStatement= ruleBlockStatement EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3405:2: iv_ruleBlockStatement= ruleBlockStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBlockStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleBlockStatement_in_entryRuleBlockStatement6732);
            iv_ruleBlockStatement=ruleBlockStatement();
            _fsp--;

             current =iv_ruleBlockStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockStatement6742); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBlockStatement


    // $ANTLR start ruleBlockStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3412:1: ruleBlockStatement returns [EObject current=null] : ( ( (lv_labels_0_0= ruleLabel ) )* ( (lv_declareSection_1_0= ruleDeclareSection ) )? ( (lv_body_2_0= ruleStatementBody ) ) ) ;
    public final EObject ruleBlockStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_labels_0_0 = null;

        EObject lv_declareSection_1_0 = null;

        EObject lv_body_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3417:6: ( ( ( (lv_labels_0_0= ruleLabel ) )* ( (lv_declareSection_1_0= ruleDeclareSection ) )? ( (lv_body_2_0= ruleStatementBody ) ) ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3418:1: ( ( (lv_labels_0_0= ruleLabel ) )* ( (lv_declareSection_1_0= ruleDeclareSection ) )? ( (lv_body_2_0= ruleStatementBody ) ) )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3418:1: ( ( (lv_labels_0_0= ruleLabel ) )* ( (lv_declareSection_1_0= ruleDeclareSection ) )? ( (lv_body_2_0= ruleStatementBody ) ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3418:2: ( (lv_labels_0_0= ruleLabel ) )* ( (lv_declareSection_1_0= ruleDeclareSection ) )? ( (lv_body_2_0= ruleStatementBody ) )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3418:2: ( (lv_labels_0_0= ruleLabel ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==KEYWORD_9) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3419:1: (lv_labels_0_0= ruleLabel )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3419:1: (lv_labels_0_0= ruleLabel )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3420:3: lv_labels_0_0= ruleLabel
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBlockStatementAccess().getLabelsLabelParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLabel_in_ruleBlockStatement6788);
            	    lv_labels_0_0=ruleLabel();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBlockStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"labels",
            	    	        		lv_labels_0_0, 
            	    	        		"Label", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3442:3: ( (lv_declareSection_1_0= ruleDeclareSection ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==KEYWORD_60||LA52_0==KEYWORD_49||LA52_0==KEYWORD_45||LA52_0==RULE_ID) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3443:1: (lv_declareSection_1_0= ruleDeclareSection )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3443:1: (lv_declareSection_1_0= ruleDeclareSection )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3444:3: lv_declareSection_1_0= ruleDeclareSection
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBlockStatementAccess().getDeclareSectionDeclareSectionParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDeclareSection_in_ruleBlockStatement6810);
                    lv_declareSection_1_0=ruleDeclareSection();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBlockStatementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"declareSection",
                    	        		lv_declareSection_1_0, 
                    	        		"DeclareSection", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3466:3: ( (lv_body_2_0= ruleStatementBody ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3467:1: (lv_body_2_0= ruleStatementBody )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3467:1: (lv_body_2_0= ruleStatementBody )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3468:3: lv_body_2_0= ruleStatementBody
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBlockStatementAccess().getBodyStatementBodyParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatementBody_in_ruleBlockStatement6832);
            lv_body_2_0=ruleStatementBody();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBlockStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"body",
            	        		lv_body_2_0, 
            	        		"StatementBody", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBlockStatement


    // $ANTLR start entryRuleCaseStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3498:1: entryRuleCaseStatement returns [EObject current=null] : iv_ruleCaseStatement= ruleCaseStatement EOF ;
    public final EObject entryRuleCaseStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseStatement = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3499:2: (iv_ruleCaseStatement= ruleCaseStatement EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3500:2: iv_ruleCaseStatement= ruleCaseStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCaseStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleCaseStatement_in_entryRuleCaseStatement6867);
            iv_ruleCaseStatement=ruleCaseStatement();
            _fsp--;

             current =iv_ruleCaseStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCaseStatement6877); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCaseStatement


    // $ANTLR start ruleCaseStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3507:1: ruleCaseStatement returns [EObject current=null] : ( ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_20 ( (lv_expression_2_0= ruleExpression ) )? ( (lv_whenBranches_3_0= ruleCaseStatementWhenBranch ) )+ ( (lv_elseBranch_4_0= ruleCaseStatementElseBranch ) )? KEYWORD_15 KEYWORD_20 ( (lv_endLabel_7_0= RULE_ID ) )? KEYWORD_6 ) ;
    public final EObject ruleCaseStatement() throws RecognitionException {
        EObject current = null;

        Token lv_endLabel_7_0=null;
        EObject lv_labels_0_0 = null;

        EObject lv_expression_2_0 = null;

        EObject lv_whenBranches_3_0 = null;

        EObject lv_elseBranch_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3512:6: ( ( ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_20 ( (lv_expression_2_0= ruleExpression ) )? ( (lv_whenBranches_3_0= ruleCaseStatementWhenBranch ) )+ ( (lv_elseBranch_4_0= ruleCaseStatementElseBranch ) )? KEYWORD_15 KEYWORD_20 ( (lv_endLabel_7_0= RULE_ID ) )? KEYWORD_6 ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3513:1: ( ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_20 ( (lv_expression_2_0= ruleExpression ) )? ( (lv_whenBranches_3_0= ruleCaseStatementWhenBranch ) )+ ( (lv_elseBranch_4_0= ruleCaseStatementElseBranch ) )? KEYWORD_15 KEYWORD_20 ( (lv_endLabel_7_0= RULE_ID ) )? KEYWORD_6 )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3513:1: ( ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_20 ( (lv_expression_2_0= ruleExpression ) )? ( (lv_whenBranches_3_0= ruleCaseStatementWhenBranch ) )+ ( (lv_elseBranch_4_0= ruleCaseStatementElseBranch ) )? KEYWORD_15 KEYWORD_20 ( (lv_endLabel_7_0= RULE_ID ) )? KEYWORD_6 )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3513:2: ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_20 ( (lv_expression_2_0= ruleExpression ) )? ( (lv_whenBranches_3_0= ruleCaseStatementWhenBranch ) )+ ( (lv_elseBranch_4_0= ruleCaseStatementElseBranch ) )? KEYWORD_15 KEYWORD_20 ( (lv_endLabel_7_0= RULE_ID ) )? KEYWORD_6
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3513:2: ( (lv_labels_0_0= ruleLabel ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==KEYWORD_9) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3514:1: (lv_labels_0_0= ruleLabel )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3514:1: (lv_labels_0_0= ruleLabel )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3515:3: lv_labels_0_0= ruleLabel
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCaseStatementAccess().getLabelsLabelParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLabel_in_ruleCaseStatement6923);
            	    lv_labels_0_0=ruleLabel();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCaseStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"labels",
            	    	        		lv_labels_0_0, 
            	    	        		"Label", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleCaseStatement6935); 

                    createLeafNode(grammarAccess.getCaseStatementAccess().getCASEKeyword_1(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3542:1: ( (lv_expression_2_0= ruleExpression ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==KEYWORD_37||LA54_0==KEYWORD_26||LA54_0==KEYWORD_30||LA54_0==KEYWORD_5||(LA54_0>=RULE_ID && LA54_0<=RULE_STRING)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3543:1: (lv_expression_2_0= ruleExpression )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3543:1: (lv_expression_2_0= ruleExpression )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3544:3: lv_expression_2_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCaseStatementAccess().getExpressionExpressionParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleCaseStatement6956);
                    lv_expression_2_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCaseStatementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expression",
                    	        		lv_expression_2_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3566:3: ( (lv_whenBranches_3_0= ruleCaseStatementWhenBranch ) )+
            int cnt55=0;
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==KEYWORD_31) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3567:1: (lv_whenBranches_3_0= ruleCaseStatementWhenBranch )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3567:1: (lv_whenBranches_3_0= ruleCaseStatementWhenBranch )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3568:3: lv_whenBranches_3_0= ruleCaseStatementWhenBranch
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCaseStatementAccess().getWhenBranchesCaseStatementWhenBranchParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleCaseStatementWhenBranch_in_ruleCaseStatement6978);
            	    lv_whenBranches_3_0=ruleCaseStatementWhenBranch();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCaseStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"whenBranches",
            	    	        		lv_whenBranches_3_0, 
            	    	        		"CaseStatementWhenBranch", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt55 >= 1 ) break loop55;
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
            } while (true);

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3590:3: ( (lv_elseBranch_4_0= ruleCaseStatementElseBranch ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==KEYWORD_21) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3591:1: (lv_elseBranch_4_0= ruleCaseStatementElseBranch )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3591:1: (lv_elseBranch_4_0= ruleCaseStatementElseBranch )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3592:3: lv_elseBranch_4_0= ruleCaseStatementElseBranch
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCaseStatementAccess().getElseBranchCaseStatementElseBranchParserRuleCall_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCaseStatementElseBranch_in_ruleCaseStatement7000);
                    lv_elseBranch_4_0=ruleCaseStatementElseBranch();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCaseStatementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"elseBranch",
                    	        		lv_elseBranch_4_0, 
                    	        		"CaseStatementElseBranch", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleCaseStatement7012); 

                    createLeafNode(grammarAccess.getCaseStatementAccess().getENDKeyword_5(), null); 
                
            match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleCaseStatement7023); 

                    createLeafNode(grammarAccess.getCaseStatementAccess().getCASEKeyword_6(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3624:1: ( (lv_endLabel_7_0= RULE_ID ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3625:1: (lv_endLabel_7_0= RULE_ID )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3625:1: (lv_endLabel_7_0= RULE_ID )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3626:3: lv_endLabel_7_0= RULE_ID
                    {
                    lv_endLabel_7_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCaseStatement7040); 

                    			createLeafNode(grammarAccess.getCaseStatementAccess().getEndLabelIDTerminalRuleCall_7_0(), "endLabel"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCaseStatementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"endLabel",
                    	        		lv_endLabel_7_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleCaseStatement7057); 

                    createLeafNode(grammarAccess.getCaseStatementAccess().getSemicolonKeyword_8(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCaseStatement


    // $ANTLR start entryRuleCaseStatementWhenBranch
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3661:1: entryRuleCaseStatementWhenBranch returns [EObject current=null] : iv_ruleCaseStatementWhenBranch= ruleCaseStatementWhenBranch EOF ;
    public final EObject entryRuleCaseStatementWhenBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseStatementWhenBranch = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3662:2: (iv_ruleCaseStatementWhenBranch= ruleCaseStatementWhenBranch EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3663:2: iv_ruleCaseStatementWhenBranch= ruleCaseStatementWhenBranch EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCaseStatementWhenBranchRule(), currentNode); 
            pushFollow(FOLLOW_ruleCaseStatementWhenBranch_in_entryRuleCaseStatementWhenBranch7092);
            iv_ruleCaseStatementWhenBranch=ruleCaseStatementWhenBranch();
            _fsp--;

             current =iv_ruleCaseStatementWhenBranch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCaseStatementWhenBranch7102); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCaseStatementWhenBranch


    // $ANTLR start ruleCaseStatementWhenBranch
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3670:1: ruleCaseStatementWhenBranch returns [EObject current=null] : ( KEYWORD_31 ( (lv_expression_1_0= ruleExpression ) ) KEYWORD_29 ( (lv_statements_3_0= ruleStatement ) )+ ) ;
    public final EObject ruleCaseStatementWhenBranch() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_1_0 = null;

        EObject lv_statements_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3675:6: ( ( KEYWORD_31 ( (lv_expression_1_0= ruleExpression ) ) KEYWORD_29 ( (lv_statements_3_0= ruleStatement ) )+ ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3676:1: ( KEYWORD_31 ( (lv_expression_1_0= ruleExpression ) ) KEYWORD_29 ( (lv_statements_3_0= ruleStatement ) )+ )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3676:1: ( KEYWORD_31 ( (lv_expression_1_0= ruleExpression ) ) KEYWORD_29 ( (lv_statements_3_0= ruleStatement ) )+ )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3677:2: KEYWORD_31 ( (lv_expression_1_0= ruleExpression ) ) KEYWORD_29 ( (lv_statements_3_0= ruleStatement ) )+
            {
            match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_ruleCaseStatementWhenBranch7138); 

                    createLeafNode(grammarAccess.getCaseStatementWhenBranchAccess().getWHENKeyword_0(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3681:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3682:1: (lv_expression_1_0= ruleExpression )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3682:1: (lv_expression_1_0= ruleExpression )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3683:3: lv_expression_1_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCaseStatementWhenBranchAccess().getExpressionExpressionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleCaseStatementWhenBranch7159);
            lv_expression_1_0=ruleExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCaseStatementWhenBranchRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"expression",
            	        		lv_expression_1_0, 
            	        		"Expression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleCaseStatementWhenBranch7170); 

                    createLeafNode(grammarAccess.getCaseStatementWhenBranchAccess().getTHENKeyword_2(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3710:1: ( (lv_statements_3_0= ruleStatement ) )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==KEYWORD_60||LA58_0==KEYWORD_55||LA58_0==KEYWORD_49||(LA58_0>=KEYWORD_45 && LA58_0<=KEYWORD_35)||LA58_0==KEYWORD_38||LA58_0==KEYWORD_40||LA58_0==KEYWORD_42||LA58_0==KEYWORD_20||(LA58_0>=KEYWORD_22 && LA58_0<=KEYWORD_23)||(LA58_0>=KEYWORD_25 && LA58_0<=KEYWORD_26)||LA58_0==KEYWORD_16||LA58_0==KEYWORD_9||LA58_0==KEYWORD_12||LA58_0==KEYWORD_5||LA58_0==RULE_ID) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3711:1: (lv_statements_3_0= ruleStatement )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3711:1: (lv_statements_3_0= ruleStatement )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3712:3: lv_statements_3_0= ruleStatement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCaseStatementWhenBranchAccess().getStatementsStatementParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleCaseStatementWhenBranch7191);
            	    lv_statements_3_0=ruleStatement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCaseStatementWhenBranchRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"statements",
            	    	        		lv_statements_3_0, 
            	    	        		"Statement", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt58 >= 1 ) break loop58;
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCaseStatementWhenBranch


    // $ANTLR start entryRuleCaseStatementElseBranch
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3742:1: entryRuleCaseStatementElseBranch returns [EObject current=null] : iv_ruleCaseStatementElseBranch= ruleCaseStatementElseBranch EOF ;
    public final EObject entryRuleCaseStatementElseBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseStatementElseBranch = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3743:2: (iv_ruleCaseStatementElseBranch= ruleCaseStatementElseBranch EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3744:2: iv_ruleCaseStatementElseBranch= ruleCaseStatementElseBranch EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCaseStatementElseBranchRule(), currentNode); 
            pushFollow(FOLLOW_ruleCaseStatementElseBranch_in_entryRuleCaseStatementElseBranch7227);
            iv_ruleCaseStatementElseBranch=ruleCaseStatementElseBranch();
            _fsp--;

             current =iv_ruleCaseStatementElseBranch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCaseStatementElseBranch7237); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCaseStatementElseBranch


    // $ANTLR start ruleCaseStatementElseBranch
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3751:1: ruleCaseStatementElseBranch returns [EObject current=null] : ( KEYWORD_21 ( (lv_statements_1_0= ruleStatement ) )+ ) ;
    public final EObject ruleCaseStatementElseBranch() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3756:6: ( ( KEYWORD_21 ( (lv_statements_1_0= ruleStatement ) )+ ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3757:1: ( KEYWORD_21 ( (lv_statements_1_0= ruleStatement ) )+ )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3757:1: ( KEYWORD_21 ( (lv_statements_1_0= ruleStatement ) )+ )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3758:2: KEYWORD_21 ( (lv_statements_1_0= ruleStatement ) )+
            {
            match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleCaseStatementElseBranch7273); 

                    createLeafNode(grammarAccess.getCaseStatementElseBranchAccess().getELSEKeyword_0(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3762:1: ( (lv_statements_1_0= ruleStatement ) )+
            int cnt59=0;
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==KEYWORD_60||LA59_0==KEYWORD_55||LA59_0==KEYWORD_49||(LA59_0>=KEYWORD_45 && LA59_0<=KEYWORD_35)||LA59_0==KEYWORD_38||LA59_0==KEYWORD_40||LA59_0==KEYWORD_42||LA59_0==KEYWORD_20||(LA59_0>=KEYWORD_22 && LA59_0<=KEYWORD_23)||(LA59_0>=KEYWORD_25 && LA59_0<=KEYWORD_26)||LA59_0==KEYWORD_16||LA59_0==KEYWORD_9||LA59_0==KEYWORD_12||LA59_0==KEYWORD_5||LA59_0==RULE_ID) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3763:1: (lv_statements_1_0= ruleStatement )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3763:1: (lv_statements_1_0= ruleStatement )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3764:3: lv_statements_1_0= ruleStatement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCaseStatementElseBranchAccess().getStatementsStatementParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleCaseStatementElseBranch7294);
            	    lv_statements_1_0=ruleStatement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCaseStatementElseBranchRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"statements",
            	    	        		lv_statements_1_0, 
            	    	        		"Statement", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt59 >= 1 ) break loop59;
                        EarlyExitException eee =
                            new EarlyExitException(59, input);
                        throw eee;
                }
                cnt59++;
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCaseStatementElseBranch


    // $ANTLR start entryRuleCloseStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3794:1: entryRuleCloseStatement returns [EObject current=null] : iv_ruleCloseStatement= ruleCloseStatement EOF ;
    public final EObject entryRuleCloseStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCloseStatement = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3795:2: (iv_ruleCloseStatement= ruleCloseStatement EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3796:2: iv_ruleCloseStatement= ruleCloseStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCloseStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleCloseStatement_in_entryRuleCloseStatement7330);
            iv_ruleCloseStatement=ruleCloseStatement();
            _fsp--;

             current =iv_ruleCloseStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCloseStatement7340); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCloseStatement


    // $ANTLR start ruleCloseStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3803:1: ruleCloseStatement returns [EObject current=null] : ( ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_35 ( (lv_cursor_2_0= ruleVariableRef ) ) KEYWORD_6 ) ;
    public final EObject ruleCloseStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_labels_0_0 = null;

        EObject lv_cursor_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3808:6: ( ( ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_35 ( (lv_cursor_2_0= ruleVariableRef ) ) KEYWORD_6 ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3809:1: ( ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_35 ( (lv_cursor_2_0= ruleVariableRef ) ) KEYWORD_6 )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3809:1: ( ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_35 ( (lv_cursor_2_0= ruleVariableRef ) ) KEYWORD_6 )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3809:2: ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_35 ( (lv_cursor_2_0= ruleVariableRef ) ) KEYWORD_6
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3809:2: ( (lv_labels_0_0= ruleLabel ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==KEYWORD_9) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3810:1: (lv_labels_0_0= ruleLabel )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3810:1: (lv_labels_0_0= ruleLabel )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3811:3: lv_labels_0_0= ruleLabel
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCloseStatementAccess().getLabelsLabelParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLabel_in_ruleCloseStatement7386);
            	    lv_labels_0_0=ruleLabel();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCloseStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"labels",
            	    	        		lv_labels_0_0, 
            	    	        		"Label", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_ruleCloseStatement7398); 

                    createLeafNode(grammarAccess.getCloseStatementAccess().getCLOSEKeyword_1(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3838:1: ( (lv_cursor_2_0= ruleVariableRef ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3839:1: (lv_cursor_2_0= ruleVariableRef )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3839:1: (lv_cursor_2_0= ruleVariableRef )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3840:3: lv_cursor_2_0= ruleVariableRef
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCloseStatementAccess().getCursorVariableRefParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleVariableRef_in_ruleCloseStatement7419);
            lv_cursor_2_0=ruleVariableRef();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCloseStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"cursor",
            	        		lv_cursor_2_0, 
            	        		"VariableRef", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleCloseStatement7430); 

                    createLeafNode(grammarAccess.getCloseStatementAccess().getSemicolonKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCloseStatement


    // $ANTLR start entryRuleContinueStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3875:1: entryRuleContinueStatement returns [EObject current=null] : iv_ruleContinueStatement= ruleContinueStatement EOF ;
    public final EObject entryRuleContinueStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContinueStatement = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3876:2: (iv_ruleContinueStatement= ruleContinueStatement EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3877:2: iv_ruleContinueStatement= ruleContinueStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getContinueStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleContinueStatement_in_entryRuleContinueStatement7465);
            iv_ruleContinueStatement=ruleContinueStatement();
            _fsp--;

             current =iv_ruleContinueStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContinueStatement7475); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleContinueStatement


    // $ANTLR start ruleContinueStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3884:1: ruleContinueStatement returns [EObject current=null] : ( () ( (lv_labels_1_0= ruleLabel ) )* KEYWORD_55 ( (lv_labelName_3_0= RULE_ID ) )? ( KEYWORD_31 ( (lv_whenExpression_5_0= ruleExpression ) ) )? KEYWORD_6 ) ;
    public final EObject ruleContinueStatement() throws RecognitionException {
        EObject current = null;

        Token lv_labelName_3_0=null;
        EObject lv_labels_1_0 = null;

        EObject lv_whenExpression_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3889:6: ( ( () ( (lv_labels_1_0= ruleLabel ) )* KEYWORD_55 ( (lv_labelName_3_0= RULE_ID ) )? ( KEYWORD_31 ( (lv_whenExpression_5_0= ruleExpression ) ) )? KEYWORD_6 ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3890:1: ( () ( (lv_labels_1_0= ruleLabel ) )* KEYWORD_55 ( (lv_labelName_3_0= RULE_ID ) )? ( KEYWORD_31 ( (lv_whenExpression_5_0= ruleExpression ) ) )? KEYWORD_6 )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3890:1: ( () ( (lv_labels_1_0= ruleLabel ) )* KEYWORD_55 ( (lv_labelName_3_0= RULE_ID ) )? ( KEYWORD_31 ( (lv_whenExpression_5_0= ruleExpression ) ) )? KEYWORD_6 )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3890:2: () ( (lv_labels_1_0= ruleLabel ) )* KEYWORD_55 ( (lv_labelName_3_0= RULE_ID ) )? ( KEYWORD_31 ( (lv_whenExpression_5_0= ruleExpression ) ) )? KEYWORD_6
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3890:2: ()
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3891:5: 
            {
             
                    temp=factory.create(grammarAccess.getContinueStatementAccess().getContinueStatementAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getContinueStatementAccess().getContinueStatementAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3901:2: ( (lv_labels_1_0= ruleLabel ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==KEYWORD_9) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3902:1: (lv_labels_1_0= ruleLabel )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3902:1: (lv_labels_1_0= ruleLabel )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3903:3: lv_labels_1_0= ruleLabel
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getContinueStatementAccess().getLabelsLabelParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLabel_in_ruleContinueStatement7530);
            	    lv_labels_1_0=ruleLabel();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getContinueStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"labels",
            	    	        		lv_labels_1_0, 
            	    	        		"Label", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleContinueStatement7542); 

                    createLeafNode(grammarAccess.getContinueStatementAccess().getCONTINUEKeyword_2(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3930:1: ( (lv_labelName_3_0= RULE_ID ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3931:1: (lv_labelName_3_0= RULE_ID )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3931:1: (lv_labelName_3_0= RULE_ID )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3932:3: lv_labelName_3_0= RULE_ID
                    {
                    lv_labelName_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContinueStatement7559); 

                    			createLeafNode(grammarAccess.getContinueStatementAccess().getLabelNameIDTerminalRuleCall_3_0(), "labelName"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getContinueStatementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"labelName",
                    	        		lv_labelName_3_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3954:3: ( KEYWORD_31 ( (lv_whenExpression_5_0= ruleExpression ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==KEYWORD_31) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3955:2: KEYWORD_31 ( (lv_whenExpression_5_0= ruleExpression ) )
                    {
                    match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_ruleContinueStatement7577); 

                            createLeafNode(grammarAccess.getContinueStatementAccess().getWHENKeyword_4_0(), null); 
                        
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3959:1: ( (lv_whenExpression_5_0= ruleExpression ) )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3960:1: (lv_whenExpression_5_0= ruleExpression )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3960:1: (lv_whenExpression_5_0= ruleExpression )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3961:3: lv_whenExpression_5_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getContinueStatementAccess().getWhenExpressionExpressionParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleContinueStatement7598);
                    lv_whenExpression_5_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getContinueStatementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"whenExpression",
                    	        		lv_whenExpression_5_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleContinueStatement7611); 

                    createLeafNode(grammarAccess.getContinueStatementAccess().getSemicolonKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleContinueStatement


    // $ANTLR start entryRuleExitStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3996:1: entryRuleExitStatement returns [EObject current=null] : iv_ruleExitStatement= ruleExitStatement EOF ;
    public final EObject entryRuleExitStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitStatement = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3997:2: (iv_ruleExitStatement= ruleExitStatement EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:3998:2: iv_ruleExitStatement= ruleExitStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExitStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleExitStatement_in_entryRuleExitStatement7646);
            iv_ruleExitStatement=ruleExitStatement();
            _fsp--;

             current =iv_ruleExitStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitStatement7656); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExitStatement


    // $ANTLR start ruleExitStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4005:1: ruleExitStatement returns [EObject current=null] : ( () ( (lv_labels_1_0= ruleLabel ) )* KEYWORD_22 ( (lv_labelName_3_0= RULE_ID ) )? ( KEYWORD_31 ( (lv_whenExpression_5_0= ruleExpression ) ) )? KEYWORD_6 ) ;
    public final EObject ruleExitStatement() throws RecognitionException {
        EObject current = null;

        Token lv_labelName_3_0=null;
        EObject lv_labels_1_0 = null;

        EObject lv_whenExpression_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4010:6: ( ( () ( (lv_labels_1_0= ruleLabel ) )* KEYWORD_22 ( (lv_labelName_3_0= RULE_ID ) )? ( KEYWORD_31 ( (lv_whenExpression_5_0= ruleExpression ) ) )? KEYWORD_6 ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4011:1: ( () ( (lv_labels_1_0= ruleLabel ) )* KEYWORD_22 ( (lv_labelName_3_0= RULE_ID ) )? ( KEYWORD_31 ( (lv_whenExpression_5_0= ruleExpression ) ) )? KEYWORD_6 )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4011:1: ( () ( (lv_labels_1_0= ruleLabel ) )* KEYWORD_22 ( (lv_labelName_3_0= RULE_ID ) )? ( KEYWORD_31 ( (lv_whenExpression_5_0= ruleExpression ) ) )? KEYWORD_6 )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4011:2: () ( (lv_labels_1_0= ruleLabel ) )* KEYWORD_22 ( (lv_labelName_3_0= RULE_ID ) )? ( KEYWORD_31 ( (lv_whenExpression_5_0= ruleExpression ) ) )? KEYWORD_6
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4011:2: ()
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4012:5: 
            {
             
                    temp=factory.create(grammarAccess.getExitStatementAccess().getExitStatementAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getExitStatementAccess().getExitStatementAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4022:2: ( (lv_labels_1_0= ruleLabel ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==KEYWORD_9) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4023:1: (lv_labels_1_0= ruleLabel )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4023:1: (lv_labels_1_0= ruleLabel )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4024:3: lv_labels_1_0= ruleLabel
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getExitStatementAccess().getLabelsLabelParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLabel_in_ruleExitStatement7711);
            	    lv_labels_1_0=ruleLabel();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getExitStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"labels",
            	    	        		lv_labels_1_0, 
            	    	        		"Label", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleExitStatement7723); 

                    createLeafNode(grammarAccess.getExitStatementAccess().getEXITKeyword_2(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4051:1: ( (lv_labelName_3_0= RULE_ID ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_ID) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4052:1: (lv_labelName_3_0= RULE_ID )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4052:1: (lv_labelName_3_0= RULE_ID )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4053:3: lv_labelName_3_0= RULE_ID
                    {
                    lv_labelName_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExitStatement7740); 

                    			createLeafNode(grammarAccess.getExitStatementAccess().getLabelNameIDTerminalRuleCall_3_0(), "labelName"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getExitStatementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"labelName",
                    	        		lv_labelName_3_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4075:3: ( KEYWORD_31 ( (lv_whenExpression_5_0= ruleExpression ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==KEYWORD_31) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4076:2: KEYWORD_31 ( (lv_whenExpression_5_0= ruleExpression ) )
                    {
                    match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_ruleExitStatement7758); 

                            createLeafNode(grammarAccess.getExitStatementAccess().getWHENKeyword_4_0(), null); 
                        
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4080:1: ( (lv_whenExpression_5_0= ruleExpression ) )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4081:1: (lv_whenExpression_5_0= ruleExpression )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4081:1: (lv_whenExpression_5_0= ruleExpression )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4082:3: lv_whenExpression_5_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExitStatementAccess().getWhenExpressionExpressionParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleExitStatement7779);
                    lv_whenExpression_5_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getExitStatementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"whenExpression",
                    	        		lv_whenExpression_5_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleExitStatement7792); 

                    createLeafNode(grammarAccess.getExitStatementAccess().getSemicolonKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExitStatement


    // $ANTLR start entryRuleFetchStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4117:1: entryRuleFetchStatement returns [EObject current=null] : iv_ruleFetchStatement= ruleFetchStatement EOF ;
    public final EObject entryRuleFetchStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFetchStatement = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4118:2: (iv_ruleFetchStatement= ruleFetchStatement EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4119:2: iv_ruleFetchStatement= ruleFetchStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFetchStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleFetchStatement_in_entryRuleFetchStatement7827);
            iv_ruleFetchStatement=ruleFetchStatement();
            _fsp--;

             current =iv_ruleFetchStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFetchStatement7837); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFetchStatement


    // $ANTLR start ruleFetchStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4126:1: ruleFetchStatement returns [EObject current=null] : ( ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_38 ( (lv_cursor_2_0= ruleVariableRef ) )? ( (lv_intoClause_3_0= ruleFetchStatementIntoClause ) ) KEYWORD_6 ) ;
    public final EObject ruleFetchStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_labels_0_0 = null;

        EObject lv_cursor_2_0 = null;

        EObject lv_intoClause_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4131:6: ( ( ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_38 ( (lv_cursor_2_0= ruleVariableRef ) )? ( (lv_intoClause_3_0= ruleFetchStatementIntoClause ) ) KEYWORD_6 ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4132:1: ( ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_38 ( (lv_cursor_2_0= ruleVariableRef ) )? ( (lv_intoClause_3_0= ruleFetchStatementIntoClause ) ) KEYWORD_6 )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4132:1: ( ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_38 ( (lv_cursor_2_0= ruleVariableRef ) )? ( (lv_intoClause_3_0= ruleFetchStatementIntoClause ) ) KEYWORD_6 )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4132:2: ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_38 ( (lv_cursor_2_0= ruleVariableRef ) )? ( (lv_intoClause_3_0= ruleFetchStatementIntoClause ) ) KEYWORD_6
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4132:2: ( (lv_labels_0_0= ruleLabel ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==KEYWORD_9) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4133:1: (lv_labels_0_0= ruleLabel )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4133:1: (lv_labels_0_0= ruleLabel )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4134:3: lv_labels_0_0= ruleLabel
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFetchStatementAccess().getLabelsLabelParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLabel_in_ruleFetchStatement7883);
            	    lv_labels_0_0=ruleLabel();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFetchStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"labels",
            	    	        		lv_labels_0_0, 
            	    	        		"Label", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruleFetchStatement7895); 

                    createLeafNode(grammarAccess.getFetchStatementAccess().getFETCHKeyword_1(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4161:1: ( (lv_cursor_2_0= ruleVariableRef ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==KEYWORD_5||LA68_0==RULE_ID) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4162:1: (lv_cursor_2_0= ruleVariableRef )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4162:1: (lv_cursor_2_0= ruleVariableRef )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4163:3: lv_cursor_2_0= ruleVariableRef
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFetchStatementAccess().getCursorVariableRefParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleVariableRef_in_ruleFetchStatement7916);
                    lv_cursor_2_0=ruleVariableRef();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFetchStatementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"cursor",
                    	        		lv_cursor_2_0, 
                    	        		"VariableRef", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4185:3: ( (lv_intoClause_3_0= ruleFetchStatementIntoClause ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4186:1: (lv_intoClause_3_0= ruleFetchStatementIntoClause )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4186:1: (lv_intoClause_3_0= ruleFetchStatementIntoClause )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4187:3: lv_intoClause_3_0= ruleFetchStatementIntoClause
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFetchStatementAccess().getIntoClauseFetchStatementIntoClauseParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFetchStatementIntoClause_in_ruleFetchStatement7938);
            lv_intoClause_3_0=ruleFetchStatementIntoClause();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFetchStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"intoClause",
            	        		lv_intoClause_3_0, 
            	        		"FetchStatementIntoClause", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleFetchStatement7949); 

                    createLeafNode(grammarAccess.getFetchStatementAccess().getSemicolonKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFetchStatement


    // $ANTLR start entryRuleFetchStatementIntoClause
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4222:1: entryRuleFetchStatementIntoClause returns [EObject current=null] : iv_ruleFetchStatementIntoClause= ruleFetchStatementIntoClause EOF ;
    public final EObject entryRuleFetchStatementIntoClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFetchStatementIntoClause = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4223:2: (iv_ruleFetchStatementIntoClause= ruleFetchStatementIntoClause EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4224:2: iv_ruleFetchStatementIntoClause= ruleFetchStatementIntoClause EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFetchStatementIntoClauseRule(), currentNode); 
            pushFollow(FOLLOW_ruleFetchStatementIntoClause_in_entryRuleFetchStatementIntoClause7984);
            iv_ruleFetchStatementIntoClause=ruleFetchStatementIntoClause();
            _fsp--;

             current =iv_ruleFetchStatementIntoClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFetchStatementIntoClause7994); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFetchStatementIntoClause


    // $ANTLR start ruleFetchStatementIntoClause
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4231:1: ruleFetchStatementIntoClause returns [EObject current=null] : (this_FetchStatementSingleIntoClause_0= ruleFetchStatementSingleIntoClause | this_FetchStatementBulkIntoClause_1= ruleFetchStatementBulkIntoClause ) ;
    public final EObject ruleFetchStatementIntoClause() throws RecognitionException {
        EObject current = null;

        EObject this_FetchStatementSingleIntoClause_0 = null;

        EObject this_FetchStatementBulkIntoClause_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4236:6: ( (this_FetchStatementSingleIntoClause_0= ruleFetchStatementSingleIntoClause | this_FetchStatementBulkIntoClause_1= ruleFetchStatementBulkIntoClause ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4237:1: (this_FetchStatementSingleIntoClause_0= ruleFetchStatementSingleIntoClause | this_FetchStatementBulkIntoClause_1= ruleFetchStatementBulkIntoClause )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4237:1: (this_FetchStatementSingleIntoClause_0= ruleFetchStatementSingleIntoClause | this_FetchStatementBulkIntoClause_1= ruleFetchStatementBulkIntoClause )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==KEYWORD_24) ) {
                alt69=1;
            }
            else if ( (LA69_0==KEYWORD_19) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4237:1: (this_FetchStatementSingleIntoClause_0= ruleFetchStatementSingleIntoClause | this_FetchStatementBulkIntoClause_1= ruleFetchStatementBulkIntoClause )", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4238:5: this_FetchStatementSingleIntoClause_0= ruleFetchStatementSingleIntoClause
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFetchStatementIntoClauseAccess().getFetchStatementSingleIntoClauseParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFetchStatementSingleIntoClause_in_ruleFetchStatementIntoClause8041);
                    this_FetchStatementSingleIntoClause_0=ruleFetchStatementSingleIntoClause();
                    _fsp--;


                            current = this_FetchStatementSingleIntoClause_0;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4248:5: this_FetchStatementBulkIntoClause_1= ruleFetchStatementBulkIntoClause
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFetchStatementIntoClauseAccess().getFetchStatementBulkIntoClauseParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFetchStatementBulkIntoClause_in_ruleFetchStatementIntoClause8068);
                    this_FetchStatementBulkIntoClause_1=ruleFetchStatementBulkIntoClause();
                    _fsp--;


                            current = this_FetchStatementBulkIntoClause_1;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFetchStatementIntoClause


    // $ANTLR start entryRuleFetchStatementSingleIntoClause
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4264:1: entryRuleFetchStatementSingleIntoClause returns [EObject current=null] : iv_ruleFetchStatementSingleIntoClause= ruleFetchStatementSingleIntoClause EOF ;
    public final EObject entryRuleFetchStatementSingleIntoClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFetchStatementSingleIntoClause = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4265:2: (iv_ruleFetchStatementSingleIntoClause= ruleFetchStatementSingleIntoClause EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4266:2: iv_ruleFetchStatementSingleIntoClause= ruleFetchStatementSingleIntoClause EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFetchStatementSingleIntoClauseRule(), currentNode); 
            pushFollow(FOLLOW_ruleFetchStatementSingleIntoClause_in_entryRuleFetchStatementSingleIntoClause8102);
            iv_ruleFetchStatementSingleIntoClause=ruleFetchStatementSingleIntoClause();
            _fsp--;

             current =iv_ruleFetchStatementSingleIntoClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFetchStatementSingleIntoClause8112); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFetchStatementSingleIntoClause


    // $ANTLR start ruleFetchStatementSingleIntoClause
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4273:1: ruleFetchStatementSingleIntoClause returns [EObject current=null] : ( KEYWORD_24 ( (lv_targetVariables_1_0= ruleVariableRef ) )+ ) ;
    public final EObject ruleFetchStatementSingleIntoClause() throws RecognitionException {
        EObject current = null;

        EObject lv_targetVariables_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4278:6: ( ( KEYWORD_24 ( (lv_targetVariables_1_0= ruleVariableRef ) )+ ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4279:1: ( KEYWORD_24 ( (lv_targetVariables_1_0= ruleVariableRef ) )+ )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4279:1: ( KEYWORD_24 ( (lv_targetVariables_1_0= ruleVariableRef ) )+ )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4280:2: KEYWORD_24 ( (lv_targetVariables_1_0= ruleVariableRef ) )+
            {
            match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleFetchStatementSingleIntoClause8148); 

                    createLeafNode(grammarAccess.getFetchStatementSingleIntoClauseAccess().getINTOKeyword_0(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4284:1: ( (lv_targetVariables_1_0= ruleVariableRef ) )+
            int cnt70=0;
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==KEYWORD_5||LA70_0==RULE_ID) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4285:1: (lv_targetVariables_1_0= ruleVariableRef )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4285:1: (lv_targetVariables_1_0= ruleVariableRef )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4286:3: lv_targetVariables_1_0= ruleVariableRef
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFetchStatementSingleIntoClauseAccess().getTargetVariablesVariableRefParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariableRef_in_ruleFetchStatementSingleIntoClause8169);
            	    lv_targetVariables_1_0=ruleVariableRef();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFetchStatementSingleIntoClauseRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"targetVariables",
            	    	        		lv_targetVariables_1_0, 
            	    	        		"VariableRef", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt70 >= 1 ) break loop70;
                        EarlyExitException eee =
                            new EarlyExitException(70, input);
                        throw eee;
                }
                cnt70++;
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFetchStatementSingleIntoClause


    // $ANTLR start entryRuleFetchStatementBulkIntoClause
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4316:1: entryRuleFetchStatementBulkIntoClause returns [EObject current=null] : iv_ruleFetchStatementBulkIntoClause= ruleFetchStatementBulkIntoClause EOF ;
    public final EObject entryRuleFetchStatementBulkIntoClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFetchStatementBulkIntoClause = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4317:2: (iv_ruleFetchStatementBulkIntoClause= ruleFetchStatementBulkIntoClause EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4318:2: iv_ruleFetchStatementBulkIntoClause= ruleFetchStatementBulkIntoClause EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFetchStatementBulkIntoClauseRule(), currentNode); 
            pushFollow(FOLLOW_ruleFetchStatementBulkIntoClause_in_entryRuleFetchStatementBulkIntoClause8205);
            iv_ruleFetchStatementBulkIntoClause=ruleFetchStatementBulkIntoClause();
            _fsp--;

             current =iv_ruleFetchStatementBulkIntoClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFetchStatementBulkIntoClause8215); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFetchStatementBulkIntoClause


    // $ANTLR start ruleFetchStatementBulkIntoClause
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4325:1: ruleFetchStatementBulkIntoClause returns [EObject current=null] : ( KEYWORD_19 KEYWORD_48 KEYWORD_24 ( (lv_targetVariables_3_0= ruleVariableRef ) )+ ( KEYWORD_39 ( (lv_limitExpression_5_0= ruleExpression ) ) )? ) ;
    public final EObject ruleFetchStatementBulkIntoClause() throws RecognitionException {
        EObject current = null;

        EObject lv_targetVariables_3_0 = null;

        EObject lv_limitExpression_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4330:6: ( ( KEYWORD_19 KEYWORD_48 KEYWORD_24 ( (lv_targetVariables_3_0= ruleVariableRef ) )+ ( KEYWORD_39 ( (lv_limitExpression_5_0= ruleExpression ) ) )? ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4331:1: ( KEYWORD_19 KEYWORD_48 KEYWORD_24 ( (lv_targetVariables_3_0= ruleVariableRef ) )+ ( KEYWORD_39 ( (lv_limitExpression_5_0= ruleExpression ) ) )? )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4331:1: ( KEYWORD_19 KEYWORD_48 KEYWORD_24 ( (lv_targetVariables_3_0= ruleVariableRef ) )+ ( KEYWORD_39 ( (lv_limitExpression_5_0= ruleExpression ) ) )? )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4332:2: KEYWORD_19 KEYWORD_48 KEYWORD_24 ( (lv_targetVariables_3_0= ruleVariableRef ) )+ ( KEYWORD_39 ( (lv_limitExpression_5_0= ruleExpression ) ) )?
            {
            match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleFetchStatementBulkIntoClause8251); 

                    createLeafNode(grammarAccess.getFetchStatementBulkIntoClauseAccess().getBULKKeyword_0(), null); 
                
            match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_ruleFetchStatementBulkIntoClause8262); 

                    createLeafNode(grammarAccess.getFetchStatementBulkIntoClauseAccess().getCOLLECTKeyword_1(), null); 
                
            match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleFetchStatementBulkIntoClause8273); 

                    createLeafNode(grammarAccess.getFetchStatementBulkIntoClauseAccess().getINTOKeyword_2(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4346:1: ( (lv_targetVariables_3_0= ruleVariableRef ) )+
            int cnt71=0;
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==KEYWORD_5||LA71_0==RULE_ID) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4347:1: (lv_targetVariables_3_0= ruleVariableRef )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4347:1: (lv_targetVariables_3_0= ruleVariableRef )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4348:3: lv_targetVariables_3_0= ruleVariableRef
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFetchStatementBulkIntoClauseAccess().getTargetVariablesVariableRefParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariableRef_in_ruleFetchStatementBulkIntoClause8294);
            	    lv_targetVariables_3_0=ruleVariableRef();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFetchStatementBulkIntoClauseRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"targetVariables",
            	    	        		lv_targetVariables_3_0, 
            	    	        		"VariableRef", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt71 >= 1 ) break loop71;
                        EarlyExitException eee =
                            new EarlyExitException(71, input);
                        throw eee;
                }
                cnt71++;
            } while (true);

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4370:3: ( KEYWORD_39 ( (lv_limitExpression_5_0= ruleExpression ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==KEYWORD_39) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4371:2: KEYWORD_39 ( (lv_limitExpression_5_0= ruleExpression ) )
                    {
                    match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_ruleFetchStatementBulkIntoClause8307); 

                            createLeafNode(grammarAccess.getFetchStatementBulkIntoClauseAccess().getLIMITKeyword_4_0(), null); 
                        
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4375:1: ( (lv_limitExpression_5_0= ruleExpression ) )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4376:1: (lv_limitExpression_5_0= ruleExpression )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4376:1: (lv_limitExpression_5_0= ruleExpression )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4377:3: lv_limitExpression_5_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFetchStatementBulkIntoClauseAccess().getLimitExpressionExpressionParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleFetchStatementBulkIntoClause8328);
                    lv_limitExpression_5_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFetchStatementBulkIntoClauseRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"limitExpression",
                    	        		lv_limitExpression_5_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFetchStatementBulkIntoClause


    // $ANTLR start entryRuleGotoStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4407:1: entryRuleGotoStatement returns [EObject current=null] : iv_ruleGotoStatement= ruleGotoStatement EOF ;
    public final EObject entryRuleGotoStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGotoStatement = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4408:2: (iv_ruleGotoStatement= ruleGotoStatement EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4409:2: iv_ruleGotoStatement= ruleGotoStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGotoStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleGotoStatement_in_entryRuleGotoStatement8365);
            iv_ruleGotoStatement=ruleGotoStatement();
            _fsp--;

             current =iv_ruleGotoStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGotoStatement8375); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleGotoStatement


    // $ANTLR start ruleGotoStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4416:1: ruleGotoStatement returns [EObject current=null] : ( ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_23 ( ( RULE_ID ) ) KEYWORD_6 ) ;
    public final EObject ruleGotoStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_labels_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4421:6: ( ( ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_23 ( ( RULE_ID ) ) KEYWORD_6 ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4422:1: ( ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_23 ( ( RULE_ID ) ) KEYWORD_6 )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4422:1: ( ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_23 ( ( RULE_ID ) ) KEYWORD_6 )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4422:2: ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_23 ( ( RULE_ID ) ) KEYWORD_6
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4422:2: ( (lv_labels_0_0= ruleLabel ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==KEYWORD_9) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4423:1: (lv_labels_0_0= ruleLabel )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4423:1: (lv_labels_0_0= ruleLabel )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4424:3: lv_labels_0_0= ruleLabel
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getGotoStatementAccess().getLabelsLabelParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLabel_in_ruleGotoStatement8421);
            	    lv_labels_0_0=ruleLabel();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getGotoStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"labels",
            	    	        		lv_labels_0_0, 
            	    	        		"Label", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleGotoStatement8433); 

                    createLeafNode(grammarAccess.getGotoStatementAccess().getGOTOKeyword_1(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4451:1: ( ( RULE_ID ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4452:1: ( RULE_ID )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4452:1: ( RULE_ID )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4453:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getGotoStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGotoStatement8451); 

            		createLeafNode(grammarAccess.getGotoStatementAccess().getLabelNameLabelCrossReference_2_0(), "labelName"); 
            	

            }


            }

            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleGotoStatement8462); 

                    createLeafNode(grammarAccess.getGotoStatementAccess().getSemicolonKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleGotoStatement


    // $ANTLR start entryRuleIfStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4478:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4479:2: (iv_ruleIfStatement= ruleIfStatement EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4480:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIfStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleIfStatement_in_entryRuleIfStatement8497);
            iv_ruleIfStatement=ruleIfStatement();
            _fsp--;

             current =iv_ruleIfStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfStatement8507); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIfStatement


    // $ANTLR start ruleIfStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4487:1: ruleIfStatement returns [EObject current=null] : ( ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_12 ( (lv_expression_2_0= ruleExpression ) ) KEYWORD_29 ( (lv_statements_4_0= ruleStatement ) )+ ( (lv_elsifBranches_5_0= ruleIfStatementElsifBranch ) )* ( (lv_elseBranch_6_0= ruleIfStatementElseBranch ) )? KEYWORD_15 KEYWORD_12 KEYWORD_6 ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_labels_0_0 = null;

        EObject lv_expression_2_0 = null;

        EObject lv_statements_4_0 = null;

        EObject lv_elsifBranches_5_0 = null;

        EObject lv_elseBranch_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4492:6: ( ( ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_12 ( (lv_expression_2_0= ruleExpression ) ) KEYWORD_29 ( (lv_statements_4_0= ruleStatement ) )+ ( (lv_elsifBranches_5_0= ruleIfStatementElsifBranch ) )* ( (lv_elseBranch_6_0= ruleIfStatementElseBranch ) )? KEYWORD_15 KEYWORD_12 KEYWORD_6 ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4493:1: ( ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_12 ( (lv_expression_2_0= ruleExpression ) ) KEYWORD_29 ( (lv_statements_4_0= ruleStatement ) )+ ( (lv_elsifBranches_5_0= ruleIfStatementElsifBranch ) )* ( (lv_elseBranch_6_0= ruleIfStatementElseBranch ) )? KEYWORD_15 KEYWORD_12 KEYWORD_6 )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4493:1: ( ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_12 ( (lv_expression_2_0= ruleExpression ) ) KEYWORD_29 ( (lv_statements_4_0= ruleStatement ) )+ ( (lv_elsifBranches_5_0= ruleIfStatementElsifBranch ) )* ( (lv_elseBranch_6_0= ruleIfStatementElseBranch ) )? KEYWORD_15 KEYWORD_12 KEYWORD_6 )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4493:2: ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_12 ( (lv_expression_2_0= ruleExpression ) ) KEYWORD_29 ( (lv_statements_4_0= ruleStatement ) )+ ( (lv_elsifBranches_5_0= ruleIfStatementElsifBranch ) )* ( (lv_elseBranch_6_0= ruleIfStatementElseBranch ) )? KEYWORD_15 KEYWORD_12 KEYWORD_6
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4493:2: ( (lv_labels_0_0= ruleLabel ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==KEYWORD_9) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4494:1: (lv_labels_0_0= ruleLabel )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4494:1: (lv_labels_0_0= ruleLabel )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4495:3: lv_labels_0_0= ruleLabel
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getIfStatementAccess().getLabelsLabelParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLabel_in_ruleIfStatement8553);
            	    lv_labels_0_0=ruleLabel();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getIfStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"labels",
            	    	        		lv_labels_0_0, 
            	    	        		"Label", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

            match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleIfStatement8565); 

                    createLeafNode(grammarAccess.getIfStatementAccess().getIFKeyword_1(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4522:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4523:1: (lv_expression_2_0= ruleExpression )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4523:1: (lv_expression_2_0= ruleExpression )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4524:3: lv_expression_2_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getIfStatementAccess().getExpressionExpressionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleIfStatement8586);
            lv_expression_2_0=ruleExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIfStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"expression",
            	        		lv_expression_2_0, 
            	        		"Expression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleIfStatement8597); 

                    createLeafNode(grammarAccess.getIfStatementAccess().getTHENKeyword_3(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4551:1: ( (lv_statements_4_0= ruleStatement ) )+
            int cnt75=0;
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==KEYWORD_60||LA75_0==KEYWORD_55||LA75_0==KEYWORD_49||(LA75_0>=KEYWORD_45 && LA75_0<=KEYWORD_35)||LA75_0==KEYWORD_38||LA75_0==KEYWORD_40||LA75_0==KEYWORD_42||LA75_0==KEYWORD_20||(LA75_0>=KEYWORD_22 && LA75_0<=KEYWORD_23)||(LA75_0>=KEYWORD_25 && LA75_0<=KEYWORD_26)||LA75_0==KEYWORD_16||LA75_0==KEYWORD_9||LA75_0==KEYWORD_12||LA75_0==KEYWORD_5||LA75_0==RULE_ID) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4552:1: (lv_statements_4_0= ruleStatement )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4552:1: (lv_statements_4_0= ruleStatement )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4553:3: lv_statements_4_0= ruleStatement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getIfStatementAccess().getStatementsStatementParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleIfStatement8618);
            	    lv_statements_4_0=ruleStatement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getIfStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"statements",
            	    	        		lv_statements_4_0, 
            	    	        		"Statement", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt75 >= 1 ) break loop75;
                        EarlyExitException eee =
                            new EarlyExitException(75, input);
                        throw eee;
                }
                cnt75++;
            } while (true);

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4575:3: ( (lv_elsifBranches_5_0= ruleIfStatementElsifBranch ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==KEYWORD_36) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4576:1: (lv_elsifBranches_5_0= ruleIfStatementElsifBranch )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4576:1: (lv_elsifBranches_5_0= ruleIfStatementElsifBranch )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4577:3: lv_elsifBranches_5_0= ruleIfStatementElsifBranch
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getIfStatementAccess().getElsifBranchesIfStatementElsifBranchParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleIfStatementElsifBranch_in_ruleIfStatement8640);
            	    lv_elsifBranches_5_0=ruleIfStatementElsifBranch();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getIfStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"elsifBranches",
            	    	        		lv_elsifBranches_5_0, 
            	    	        		"IfStatementElsifBranch", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4599:3: ( (lv_elseBranch_6_0= ruleIfStatementElseBranch ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==KEYWORD_21) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4600:1: (lv_elseBranch_6_0= ruleIfStatementElseBranch )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4600:1: (lv_elseBranch_6_0= ruleIfStatementElseBranch )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4601:3: lv_elseBranch_6_0= ruleIfStatementElseBranch
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getIfStatementAccess().getElseBranchIfStatementElseBranchParserRuleCall_6_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleIfStatementElseBranch_in_ruleIfStatement8662);
                    lv_elseBranch_6_0=ruleIfStatementElseBranch();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIfStatementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"elseBranch",
                    	        		lv_elseBranch_6_0, 
                    	        		"IfStatementElseBranch", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleIfStatement8674); 

                    createLeafNode(grammarAccess.getIfStatementAccess().getENDKeyword_7(), null); 
                
            match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleIfStatement8685); 

                    createLeafNode(grammarAccess.getIfStatementAccess().getIFKeyword_8(), null); 
                
            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleIfStatement8696); 

                    createLeafNode(grammarAccess.getIfStatementAccess().getSemicolonKeyword_9(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIfStatement


    // $ANTLR start entryRuleIfStatementElsifBranch
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4646:1: entryRuleIfStatementElsifBranch returns [EObject current=null] : iv_ruleIfStatementElsifBranch= ruleIfStatementElsifBranch EOF ;
    public final EObject entryRuleIfStatementElsifBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatementElsifBranch = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4647:2: (iv_ruleIfStatementElsifBranch= ruleIfStatementElsifBranch EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4648:2: iv_ruleIfStatementElsifBranch= ruleIfStatementElsifBranch EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIfStatementElsifBranchRule(), currentNode); 
            pushFollow(FOLLOW_ruleIfStatementElsifBranch_in_entryRuleIfStatementElsifBranch8731);
            iv_ruleIfStatementElsifBranch=ruleIfStatementElsifBranch();
            _fsp--;

             current =iv_ruleIfStatementElsifBranch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfStatementElsifBranch8741); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIfStatementElsifBranch


    // $ANTLR start ruleIfStatementElsifBranch
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4655:1: ruleIfStatementElsifBranch returns [EObject current=null] : ( KEYWORD_36 ( (lv_expression_1_0= ruleExpression ) ) KEYWORD_29 ( (lv_statements_3_0= ruleStatement ) )+ ) ;
    public final EObject ruleIfStatementElsifBranch() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_1_0 = null;

        EObject lv_statements_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4660:6: ( ( KEYWORD_36 ( (lv_expression_1_0= ruleExpression ) ) KEYWORD_29 ( (lv_statements_3_0= ruleStatement ) )+ ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4661:1: ( KEYWORD_36 ( (lv_expression_1_0= ruleExpression ) ) KEYWORD_29 ( (lv_statements_3_0= ruleStatement ) )+ )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4661:1: ( KEYWORD_36 ( (lv_expression_1_0= ruleExpression ) ) KEYWORD_29 ( (lv_statements_3_0= ruleStatement ) )+ )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4662:2: KEYWORD_36 ( (lv_expression_1_0= ruleExpression ) ) KEYWORD_29 ( (lv_statements_3_0= ruleStatement ) )+
            {
            match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleIfStatementElsifBranch8777); 

                    createLeafNode(grammarAccess.getIfStatementElsifBranchAccess().getELSIFKeyword_0(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4666:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4667:1: (lv_expression_1_0= ruleExpression )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4667:1: (lv_expression_1_0= ruleExpression )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4668:3: lv_expression_1_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getIfStatementElsifBranchAccess().getExpressionExpressionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleIfStatementElsifBranch8798);
            lv_expression_1_0=ruleExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIfStatementElsifBranchRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"expression",
            	        		lv_expression_1_0, 
            	        		"Expression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleIfStatementElsifBranch8809); 

                    createLeafNode(grammarAccess.getIfStatementElsifBranchAccess().getTHENKeyword_2(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4695:1: ( (lv_statements_3_0= ruleStatement ) )+
            int cnt78=0;
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==KEYWORD_60||LA78_0==KEYWORD_55||LA78_0==KEYWORD_49||(LA78_0>=KEYWORD_45 && LA78_0<=KEYWORD_35)||LA78_0==KEYWORD_38||LA78_0==KEYWORD_40||LA78_0==KEYWORD_42||LA78_0==KEYWORD_20||(LA78_0>=KEYWORD_22 && LA78_0<=KEYWORD_23)||(LA78_0>=KEYWORD_25 && LA78_0<=KEYWORD_26)||LA78_0==KEYWORD_16||LA78_0==KEYWORD_9||LA78_0==KEYWORD_12||LA78_0==KEYWORD_5||LA78_0==RULE_ID) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4696:1: (lv_statements_3_0= ruleStatement )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4696:1: (lv_statements_3_0= ruleStatement )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4697:3: lv_statements_3_0= ruleStatement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getIfStatementElsifBranchAccess().getStatementsStatementParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleIfStatementElsifBranch8830);
            	    lv_statements_3_0=ruleStatement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getIfStatementElsifBranchRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"statements",
            	    	        		lv_statements_3_0, 
            	    	        		"Statement", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt78 >= 1 ) break loop78;
                        EarlyExitException eee =
                            new EarlyExitException(78, input);
                        throw eee;
                }
                cnt78++;
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIfStatementElsifBranch


    // $ANTLR start entryRuleIfStatementElseBranch
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4727:1: entryRuleIfStatementElseBranch returns [EObject current=null] : iv_ruleIfStatementElseBranch= ruleIfStatementElseBranch EOF ;
    public final EObject entryRuleIfStatementElseBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatementElseBranch = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4728:2: (iv_ruleIfStatementElseBranch= ruleIfStatementElseBranch EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4729:2: iv_ruleIfStatementElseBranch= ruleIfStatementElseBranch EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIfStatementElseBranchRule(), currentNode); 
            pushFollow(FOLLOW_ruleIfStatementElseBranch_in_entryRuleIfStatementElseBranch8866);
            iv_ruleIfStatementElseBranch=ruleIfStatementElseBranch();
            _fsp--;

             current =iv_ruleIfStatementElseBranch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfStatementElseBranch8876); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIfStatementElseBranch


    // $ANTLR start ruleIfStatementElseBranch
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4736:1: ruleIfStatementElseBranch returns [EObject current=null] : ( KEYWORD_21 ( (lv_statements_1_0= ruleStatement ) )+ ) ;
    public final EObject ruleIfStatementElseBranch() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4741:6: ( ( KEYWORD_21 ( (lv_statements_1_0= ruleStatement ) )+ ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4742:1: ( KEYWORD_21 ( (lv_statements_1_0= ruleStatement ) )+ )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4742:1: ( KEYWORD_21 ( (lv_statements_1_0= ruleStatement ) )+ )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4743:2: KEYWORD_21 ( (lv_statements_1_0= ruleStatement ) )+
            {
            match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleIfStatementElseBranch8912); 

                    createLeafNode(grammarAccess.getIfStatementElseBranchAccess().getELSEKeyword_0(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4747:1: ( (lv_statements_1_0= ruleStatement ) )+
            int cnt79=0;
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==KEYWORD_60||LA79_0==KEYWORD_55||LA79_0==KEYWORD_49||(LA79_0>=KEYWORD_45 && LA79_0<=KEYWORD_35)||LA79_0==KEYWORD_38||LA79_0==KEYWORD_40||LA79_0==KEYWORD_42||LA79_0==KEYWORD_20||(LA79_0>=KEYWORD_22 && LA79_0<=KEYWORD_23)||(LA79_0>=KEYWORD_25 && LA79_0<=KEYWORD_26)||LA79_0==KEYWORD_16||LA79_0==KEYWORD_9||LA79_0==KEYWORD_12||LA79_0==KEYWORD_5||LA79_0==RULE_ID) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4748:1: (lv_statements_1_0= ruleStatement )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4748:1: (lv_statements_1_0= ruleStatement )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4749:3: lv_statements_1_0= ruleStatement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getIfStatementElseBranchAccess().getStatementsStatementParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleIfStatementElseBranch8933);
            	    lv_statements_1_0=ruleStatement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getIfStatementElseBranchRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"statements",
            	    	        		lv_statements_1_0, 
            	    	        		"Statement", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt79 >= 1 ) break loop79;
                        EarlyExitException eee =
                            new EarlyExitException(79, input);
                        throw eee;
                }
                cnt79++;
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIfStatementElseBranch


    // $ANTLR start entryRuleLoopStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4779:1: entryRuleLoopStatement returns [EObject current=null] : iv_ruleLoopStatement= ruleLoopStatement EOF ;
    public final EObject entryRuleLoopStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopStatement = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4780:2: (iv_ruleLoopStatement= ruleLoopStatement EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4781:2: iv_ruleLoopStatement= ruleLoopStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLoopStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleLoopStatement_in_entryRuleLoopStatement8969);
            iv_ruleLoopStatement=ruleLoopStatement();
            _fsp--;

             current =iv_ruleLoopStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoopStatement8979); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLoopStatement


    // $ANTLR start ruleLoopStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4788:1: ruleLoopStatement returns [EObject current=null] : (this_BasicLoopStatement_0= ruleBasicLoopStatement | this_WhileLoopStatement_1= ruleWhileLoopStatement | this_ForLoopStatement_2= ruleForLoopStatement ) ;
    public final EObject ruleLoopStatement() throws RecognitionException {
        EObject current = null;

        EObject this_BasicLoopStatement_0 = null;

        EObject this_WhileLoopStatement_1 = null;

        EObject this_ForLoopStatement_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4793:6: ( (this_BasicLoopStatement_0= ruleBasicLoopStatement | this_WhileLoopStatement_1= ruleWhileLoopStatement | this_ForLoopStatement_2= ruleForLoopStatement ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4794:1: (this_BasicLoopStatement_0= ruleBasicLoopStatement | this_WhileLoopStatement_1= ruleWhileLoopStatement | this_ForLoopStatement_2= ruleForLoopStatement )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4794:1: (this_BasicLoopStatement_0= ruleBasicLoopStatement | this_WhileLoopStatement_1= ruleWhileLoopStatement | this_ForLoopStatement_2= ruleForLoopStatement )
            int alt80=3;
            alt80 = dfa80.predict(input);
            switch (alt80) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4795:5: this_BasicLoopStatement_0= ruleBasicLoopStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLoopStatementAccess().getBasicLoopStatementParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBasicLoopStatement_in_ruleLoopStatement9026);
                    this_BasicLoopStatement_0=ruleBasicLoopStatement();
                    _fsp--;


                            current = this_BasicLoopStatement_0;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4805:5: this_WhileLoopStatement_1= ruleWhileLoopStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLoopStatementAccess().getWhileLoopStatementParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleWhileLoopStatement_in_ruleLoopStatement9053);
                    this_WhileLoopStatement_1=ruleWhileLoopStatement();
                    _fsp--;


                            current = this_WhileLoopStatement_1;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4815:5: this_ForLoopStatement_2= ruleForLoopStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLoopStatementAccess().getForLoopStatementParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleForLoopStatement_in_ruleLoopStatement9080);
                    this_ForLoopStatement_2=ruleForLoopStatement();
                    _fsp--;


                            current = this_ForLoopStatement_2;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLoopStatement


    // $ANTLR start entryRuleBasicLoopStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4831:1: entryRuleBasicLoopStatement returns [EObject current=null] : iv_ruleBasicLoopStatement= ruleBasicLoopStatement EOF ;
    public final EObject entryRuleBasicLoopStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicLoopStatement = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4832:2: (iv_ruleBasicLoopStatement= ruleBasicLoopStatement EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4833:2: iv_ruleBasicLoopStatement= ruleBasicLoopStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBasicLoopStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleBasicLoopStatement_in_entryRuleBasicLoopStatement9114);
            iv_ruleBasicLoopStatement=ruleBasicLoopStatement();
            _fsp--;

             current =iv_ruleBasicLoopStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicLoopStatement9124); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBasicLoopStatement


    // $ANTLR start ruleBasicLoopStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4840:1: ruleBasicLoopStatement returns [EObject current=null] : ( ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_25 ( (lv_statements_2_0= ruleStatement ) )+ KEYWORD_15 KEYWORD_25 ( (lv_endLabel_5_0= RULE_ID ) )? KEYWORD_6 ) ;
    public final EObject ruleBasicLoopStatement() throws RecognitionException {
        EObject current = null;

        Token lv_endLabel_5_0=null;
        EObject lv_labels_0_0 = null;

        EObject lv_statements_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4845:6: ( ( ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_25 ( (lv_statements_2_0= ruleStatement ) )+ KEYWORD_15 KEYWORD_25 ( (lv_endLabel_5_0= RULE_ID ) )? KEYWORD_6 ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4846:1: ( ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_25 ( (lv_statements_2_0= ruleStatement ) )+ KEYWORD_15 KEYWORD_25 ( (lv_endLabel_5_0= RULE_ID ) )? KEYWORD_6 )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4846:1: ( ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_25 ( (lv_statements_2_0= ruleStatement ) )+ KEYWORD_15 KEYWORD_25 ( (lv_endLabel_5_0= RULE_ID ) )? KEYWORD_6 )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4846:2: ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_25 ( (lv_statements_2_0= ruleStatement ) )+ KEYWORD_15 KEYWORD_25 ( (lv_endLabel_5_0= RULE_ID ) )? KEYWORD_6
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4846:2: ( (lv_labels_0_0= ruleLabel ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==KEYWORD_9) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4847:1: (lv_labels_0_0= ruleLabel )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4847:1: (lv_labels_0_0= ruleLabel )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4848:3: lv_labels_0_0= ruleLabel
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBasicLoopStatementAccess().getLabelsLabelParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLabel_in_ruleBasicLoopStatement9170);
            	    lv_labels_0_0=ruleLabel();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBasicLoopStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"labels",
            	    	        		lv_labels_0_0, 
            	    	        		"Label", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);

            match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleBasicLoopStatement9182); 

                    createLeafNode(grammarAccess.getBasicLoopStatementAccess().getLOOPKeyword_1(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4875:1: ( (lv_statements_2_0= ruleStatement ) )+
            int cnt82=0;
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==KEYWORD_60||LA82_0==KEYWORD_55||LA82_0==KEYWORD_49||(LA82_0>=KEYWORD_45 && LA82_0<=KEYWORD_35)||LA82_0==KEYWORD_38||LA82_0==KEYWORD_40||LA82_0==KEYWORD_42||LA82_0==KEYWORD_20||(LA82_0>=KEYWORD_22 && LA82_0<=KEYWORD_23)||(LA82_0>=KEYWORD_25 && LA82_0<=KEYWORD_26)||LA82_0==KEYWORD_16||LA82_0==KEYWORD_9||LA82_0==KEYWORD_12||LA82_0==KEYWORD_5||LA82_0==RULE_ID) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4876:1: (lv_statements_2_0= ruleStatement )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4876:1: (lv_statements_2_0= ruleStatement )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4877:3: lv_statements_2_0= ruleStatement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBasicLoopStatementAccess().getStatementsStatementParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleBasicLoopStatement9203);
            	    lv_statements_2_0=ruleStatement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBasicLoopStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"statements",
            	    	        		lv_statements_2_0, 
            	    	        		"Statement", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt82 >= 1 ) break loop82;
                        EarlyExitException eee =
                            new EarlyExitException(82, input);
                        throw eee;
                }
                cnt82++;
            } while (true);

            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleBasicLoopStatement9215); 

                    createLeafNode(grammarAccess.getBasicLoopStatementAccess().getENDKeyword_3(), null); 
                
            match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleBasicLoopStatement9226); 

                    createLeafNode(grammarAccess.getBasicLoopStatementAccess().getLOOPKeyword_4(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4909:1: ( (lv_endLabel_5_0= RULE_ID ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_ID) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4910:1: (lv_endLabel_5_0= RULE_ID )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4910:1: (lv_endLabel_5_0= RULE_ID )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4911:3: lv_endLabel_5_0= RULE_ID
                    {
                    lv_endLabel_5_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBasicLoopStatement9243); 

                    			createLeafNode(grammarAccess.getBasicLoopStatementAccess().getEndLabelIDTerminalRuleCall_5_0(), "endLabel"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBasicLoopStatementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"endLabel",
                    	        		lv_endLabel_5_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleBasicLoopStatement9260); 

                    createLeafNode(grammarAccess.getBasicLoopStatementAccess().getSemicolonKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBasicLoopStatement


    // $ANTLR start entryRuleWhileLoopStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4946:1: entryRuleWhileLoopStatement returns [EObject current=null] : iv_ruleWhileLoopStatement= ruleWhileLoopStatement EOF ;
    public final EObject entryRuleWhileLoopStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileLoopStatement = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4947:2: (iv_ruleWhileLoopStatement= ruleWhileLoopStatement EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4948:2: iv_ruleWhileLoopStatement= ruleWhileLoopStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWhileLoopStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleWhileLoopStatement_in_entryRuleWhileLoopStatement9295);
            iv_ruleWhileLoopStatement=ruleWhileLoopStatement();
            _fsp--;

             current =iv_ruleWhileLoopStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhileLoopStatement9305); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleWhileLoopStatement


    // $ANTLR start ruleWhileLoopStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4955:1: ruleWhileLoopStatement returns [EObject current=null] : ( ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_42 ( (lv_expression_2_0= ruleExpression ) ) KEYWORD_25 ( (lv_statements_4_0= ruleStatement ) )+ KEYWORD_15 KEYWORD_25 ( (lv_endLabel_7_0= RULE_ID ) )? KEYWORD_6 ) ;
    public final EObject ruleWhileLoopStatement() throws RecognitionException {
        EObject current = null;

        Token lv_endLabel_7_0=null;
        EObject lv_labels_0_0 = null;

        EObject lv_expression_2_0 = null;

        EObject lv_statements_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4960:6: ( ( ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_42 ( (lv_expression_2_0= ruleExpression ) ) KEYWORD_25 ( (lv_statements_4_0= ruleStatement ) )+ KEYWORD_15 KEYWORD_25 ( (lv_endLabel_7_0= RULE_ID ) )? KEYWORD_6 ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4961:1: ( ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_42 ( (lv_expression_2_0= ruleExpression ) ) KEYWORD_25 ( (lv_statements_4_0= ruleStatement ) )+ KEYWORD_15 KEYWORD_25 ( (lv_endLabel_7_0= RULE_ID ) )? KEYWORD_6 )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4961:1: ( ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_42 ( (lv_expression_2_0= ruleExpression ) ) KEYWORD_25 ( (lv_statements_4_0= ruleStatement ) )+ KEYWORD_15 KEYWORD_25 ( (lv_endLabel_7_0= RULE_ID ) )? KEYWORD_6 )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4961:2: ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_42 ( (lv_expression_2_0= ruleExpression ) ) KEYWORD_25 ( (lv_statements_4_0= ruleStatement ) )+ KEYWORD_15 KEYWORD_25 ( (lv_endLabel_7_0= RULE_ID ) )? KEYWORD_6
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4961:2: ( (lv_labels_0_0= ruleLabel ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==KEYWORD_9) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4962:1: (lv_labels_0_0= ruleLabel )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4962:1: (lv_labels_0_0= ruleLabel )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4963:3: lv_labels_0_0= ruleLabel
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getWhileLoopStatementAccess().getLabelsLabelParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLabel_in_ruleWhileLoopStatement9351);
            	    lv_labels_0_0=ruleLabel();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getWhileLoopStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"labels",
            	    	        		lv_labels_0_0, 
            	    	        		"Label", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);

            match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_ruleWhileLoopStatement9363); 

                    createLeafNode(grammarAccess.getWhileLoopStatementAccess().getWHILEKeyword_1(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4990:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4991:1: (lv_expression_2_0= ruleExpression )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4991:1: (lv_expression_2_0= ruleExpression )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:4992:3: lv_expression_2_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getWhileLoopStatementAccess().getExpressionExpressionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleWhileLoopStatement9384);
            lv_expression_2_0=ruleExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getWhileLoopStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"expression",
            	        		lv_expression_2_0, 
            	        		"Expression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleWhileLoopStatement9395); 

                    createLeafNode(grammarAccess.getWhileLoopStatementAccess().getLOOPKeyword_3(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5019:1: ( (lv_statements_4_0= ruleStatement ) )+
            int cnt85=0;
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==KEYWORD_60||LA85_0==KEYWORD_55||LA85_0==KEYWORD_49||(LA85_0>=KEYWORD_45 && LA85_0<=KEYWORD_35)||LA85_0==KEYWORD_38||LA85_0==KEYWORD_40||LA85_0==KEYWORD_42||LA85_0==KEYWORD_20||(LA85_0>=KEYWORD_22 && LA85_0<=KEYWORD_23)||(LA85_0>=KEYWORD_25 && LA85_0<=KEYWORD_26)||LA85_0==KEYWORD_16||LA85_0==KEYWORD_9||LA85_0==KEYWORD_12||LA85_0==KEYWORD_5||LA85_0==RULE_ID) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5020:1: (lv_statements_4_0= ruleStatement )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5020:1: (lv_statements_4_0= ruleStatement )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5021:3: lv_statements_4_0= ruleStatement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getWhileLoopStatementAccess().getStatementsStatementParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleWhileLoopStatement9416);
            	    lv_statements_4_0=ruleStatement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getWhileLoopStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"statements",
            	    	        		lv_statements_4_0, 
            	    	        		"Statement", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt85 >= 1 ) break loop85;
                        EarlyExitException eee =
                            new EarlyExitException(85, input);
                        throw eee;
                }
                cnt85++;
            } while (true);

            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleWhileLoopStatement9428); 

                    createLeafNode(grammarAccess.getWhileLoopStatementAccess().getENDKeyword_5(), null); 
                
            match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleWhileLoopStatement9439); 

                    createLeafNode(grammarAccess.getWhileLoopStatementAccess().getLOOPKeyword_6(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5053:1: ( (lv_endLabel_7_0= RULE_ID ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_ID) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5054:1: (lv_endLabel_7_0= RULE_ID )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5054:1: (lv_endLabel_7_0= RULE_ID )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5055:3: lv_endLabel_7_0= RULE_ID
                    {
                    lv_endLabel_7_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWhileLoopStatement9456); 

                    			createLeafNode(grammarAccess.getWhileLoopStatementAccess().getEndLabelIDTerminalRuleCall_7_0(), "endLabel"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getWhileLoopStatementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"endLabel",
                    	        		lv_endLabel_7_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleWhileLoopStatement9473); 

                    createLeafNode(grammarAccess.getWhileLoopStatementAccess().getSemicolonKeyword_8(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleWhileLoopStatement


    // $ANTLR start entryRuleForLoopStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5090:1: entryRuleForLoopStatement returns [EObject current=null] : iv_ruleForLoopStatement= ruleForLoopStatement EOF ;
    public final EObject entryRuleForLoopStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForLoopStatement = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5091:2: (iv_ruleForLoopStatement= ruleForLoopStatement EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5092:2: iv_ruleForLoopStatement= ruleForLoopStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getForLoopStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleForLoopStatement_in_entryRuleForLoopStatement9508);
            iv_ruleForLoopStatement=ruleForLoopStatement();
            _fsp--;

             current =iv_ruleForLoopStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForLoopStatement9518); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleForLoopStatement


    // $ANTLR start ruleForLoopStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5099:1: ruleForLoopStatement returns [EObject current=null] : ( ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_16 ( (lv_indexVariable_2_0= ruleLoopVariableDeclaration ) ) KEYWORD_13 ( KEYWORD_53 )? ( (lv_lowerBound_5_0= ruleExpression ) ) KEYWORD_7 ( (lv_upperBound_7_0= ruleExpression ) ) KEYWORD_25 ( (lv_statements_9_0= ruleStatement ) )+ KEYWORD_15 KEYWORD_25 ( (lv_endLabel_12_0= RULE_ID ) )? KEYWORD_6 ) ;
    public final EObject ruleForLoopStatement() throws RecognitionException {
        EObject current = null;

        Token lv_endLabel_12_0=null;
        EObject lv_labels_0_0 = null;

        EObject lv_indexVariable_2_0 = null;

        EObject lv_lowerBound_5_0 = null;

        EObject lv_upperBound_7_0 = null;

        EObject lv_statements_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5104:6: ( ( ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_16 ( (lv_indexVariable_2_0= ruleLoopVariableDeclaration ) ) KEYWORD_13 ( KEYWORD_53 )? ( (lv_lowerBound_5_0= ruleExpression ) ) KEYWORD_7 ( (lv_upperBound_7_0= ruleExpression ) ) KEYWORD_25 ( (lv_statements_9_0= ruleStatement ) )+ KEYWORD_15 KEYWORD_25 ( (lv_endLabel_12_0= RULE_ID ) )? KEYWORD_6 ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5105:1: ( ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_16 ( (lv_indexVariable_2_0= ruleLoopVariableDeclaration ) ) KEYWORD_13 ( KEYWORD_53 )? ( (lv_lowerBound_5_0= ruleExpression ) ) KEYWORD_7 ( (lv_upperBound_7_0= ruleExpression ) ) KEYWORD_25 ( (lv_statements_9_0= ruleStatement ) )+ KEYWORD_15 KEYWORD_25 ( (lv_endLabel_12_0= RULE_ID ) )? KEYWORD_6 )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5105:1: ( ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_16 ( (lv_indexVariable_2_0= ruleLoopVariableDeclaration ) ) KEYWORD_13 ( KEYWORD_53 )? ( (lv_lowerBound_5_0= ruleExpression ) ) KEYWORD_7 ( (lv_upperBound_7_0= ruleExpression ) ) KEYWORD_25 ( (lv_statements_9_0= ruleStatement ) )+ KEYWORD_15 KEYWORD_25 ( (lv_endLabel_12_0= RULE_ID ) )? KEYWORD_6 )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5105:2: ( (lv_labels_0_0= ruleLabel ) )* KEYWORD_16 ( (lv_indexVariable_2_0= ruleLoopVariableDeclaration ) ) KEYWORD_13 ( KEYWORD_53 )? ( (lv_lowerBound_5_0= ruleExpression ) ) KEYWORD_7 ( (lv_upperBound_7_0= ruleExpression ) ) KEYWORD_25 ( (lv_statements_9_0= ruleStatement ) )+ KEYWORD_15 KEYWORD_25 ( (lv_endLabel_12_0= RULE_ID ) )? KEYWORD_6
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5105:2: ( (lv_labels_0_0= ruleLabel ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==KEYWORD_9) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5106:1: (lv_labels_0_0= ruleLabel )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5106:1: (lv_labels_0_0= ruleLabel )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5107:3: lv_labels_0_0= ruleLabel
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getForLoopStatementAccess().getLabelsLabelParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLabel_in_ruleForLoopStatement9564);
            	    lv_labels_0_0=ruleLabel();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getForLoopStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"labels",
            	    	        		lv_labels_0_0, 
            	    	        		"Label", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);

            match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleForLoopStatement9576); 

                    createLeafNode(grammarAccess.getForLoopStatementAccess().getFORKeyword_1(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5134:1: ( (lv_indexVariable_2_0= ruleLoopVariableDeclaration ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5135:1: (lv_indexVariable_2_0= ruleLoopVariableDeclaration )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5135:1: (lv_indexVariable_2_0= ruleLoopVariableDeclaration )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5136:3: lv_indexVariable_2_0= ruleLoopVariableDeclaration
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getForLoopStatementAccess().getIndexVariableLoopVariableDeclarationParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLoopVariableDeclaration_in_ruleForLoopStatement9597);
            lv_indexVariable_2_0=ruleLoopVariableDeclaration();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getForLoopStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"indexVariable",
            	        		lv_indexVariable_2_0, 
            	        		"LoopVariableDeclaration", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleForLoopStatement9608); 

                    createLeafNode(grammarAccess.getForLoopStatementAccess().getINKeyword_3(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5163:1: ( KEYWORD_53 )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==KEYWORD_53) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5164:2: KEYWORD_53
                    {
                    match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_ruleForLoopStatement9620); 

                            createLeafNode(grammarAccess.getForLoopStatementAccess().getREVERSEKeyword_4(), null); 
                        

                    }
                    break;

            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5168:3: ( (lv_lowerBound_5_0= ruleExpression ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5169:1: (lv_lowerBound_5_0= ruleExpression )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5169:1: (lv_lowerBound_5_0= ruleExpression )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5170:3: lv_lowerBound_5_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getForLoopStatementAccess().getLowerBoundExpressionParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleForLoopStatement9643);
            lv_lowerBound_5_0=ruleExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getForLoopStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"lowerBound",
            	        		lv_lowerBound_5_0, 
            	        		"Expression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleForLoopStatement9654); 

                    createLeafNode(grammarAccess.getForLoopStatementAccess().getFullStopFullStopKeyword_6(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5197:1: ( (lv_upperBound_7_0= ruleExpression ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5198:1: (lv_upperBound_7_0= ruleExpression )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5198:1: (lv_upperBound_7_0= ruleExpression )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5199:3: lv_upperBound_7_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getForLoopStatementAccess().getUpperBoundExpressionParserRuleCall_7_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleForLoopStatement9675);
            lv_upperBound_7_0=ruleExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getForLoopStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"upperBound",
            	        		lv_upperBound_7_0, 
            	        		"Expression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleForLoopStatement9686); 

                    createLeafNode(grammarAccess.getForLoopStatementAccess().getLOOPKeyword_8(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5226:1: ( (lv_statements_9_0= ruleStatement ) )+
            int cnt89=0;
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==KEYWORD_60||LA89_0==KEYWORD_55||LA89_0==KEYWORD_49||(LA89_0>=KEYWORD_45 && LA89_0<=KEYWORD_35)||LA89_0==KEYWORD_38||LA89_0==KEYWORD_40||LA89_0==KEYWORD_42||LA89_0==KEYWORD_20||(LA89_0>=KEYWORD_22 && LA89_0<=KEYWORD_23)||(LA89_0>=KEYWORD_25 && LA89_0<=KEYWORD_26)||LA89_0==KEYWORD_16||LA89_0==KEYWORD_9||LA89_0==KEYWORD_12||LA89_0==KEYWORD_5||LA89_0==RULE_ID) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5227:1: (lv_statements_9_0= ruleStatement )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5227:1: (lv_statements_9_0= ruleStatement )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5228:3: lv_statements_9_0= ruleStatement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getForLoopStatementAccess().getStatementsStatementParserRuleCall_9_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleForLoopStatement9707);
            	    lv_statements_9_0=ruleStatement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getForLoopStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"statements",
            	    	        		lv_statements_9_0, 
            	    	        		"Statement", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt89 >= 1 ) break loop89;
                        EarlyExitException eee =
                            new EarlyExitException(89, input);
                        throw eee;
                }
                cnt89++;
            } while (true);

            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleForLoopStatement9719); 

                    createLeafNode(grammarAccess.getForLoopStatementAccess().getENDKeyword_10(), null); 
                
            match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleForLoopStatement9730); 

                    createLeafNode(grammarAccess.getForLoopStatementAccess().getLOOPKeyword_11(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5260:1: ( (lv_endLabel_12_0= RULE_ID ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==RULE_ID) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5261:1: (lv_endLabel_12_0= RULE_ID )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5261:1: (lv_endLabel_12_0= RULE_ID )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5262:3: lv_endLabel_12_0= RULE_ID
                    {
                    lv_endLabel_12_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForLoopStatement9747); 

                    			createLeafNode(grammarAccess.getForLoopStatementAccess().getEndLabelIDTerminalRuleCall_12_0(), "endLabel"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getForLoopStatementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"endLabel",
                    	        		lv_endLabel_12_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleForLoopStatement9764); 

                    createLeafNode(grammarAccess.getForLoopStatementAccess().getSemicolonKeyword_13(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleForLoopStatement


    // $ANTLR start entryRuleReturnStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5297:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5298:2: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5299:2: iv_ruleReturnStatement= ruleReturnStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getReturnStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement9799);
            iv_ruleReturnStatement=ruleReturnStatement();
            _fsp--;

             current =iv_ruleReturnStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnStatement9809); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleReturnStatement


    // $ANTLR start ruleReturnStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5306:1: ruleReturnStatement returns [EObject current=null] : ( () ( (lv_labels_1_0= ruleLabel ) )* KEYWORD_46 ( (lv_expression_3_0= ruleExpression ) )? KEYWORD_6 ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_labels_1_0 = null;

        EObject lv_expression_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5311:6: ( ( () ( (lv_labels_1_0= ruleLabel ) )* KEYWORD_46 ( (lv_expression_3_0= ruleExpression ) )? KEYWORD_6 ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5312:1: ( () ( (lv_labels_1_0= ruleLabel ) )* KEYWORD_46 ( (lv_expression_3_0= ruleExpression ) )? KEYWORD_6 )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5312:1: ( () ( (lv_labels_1_0= ruleLabel ) )* KEYWORD_46 ( (lv_expression_3_0= ruleExpression ) )? KEYWORD_6 )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5312:2: () ( (lv_labels_1_0= ruleLabel ) )* KEYWORD_46 ( (lv_expression_3_0= ruleExpression ) )? KEYWORD_6
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5312:2: ()
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5313:5: 
            {
             
                    temp=factory.create(grammarAccess.getReturnStatementAccess().getReturnStatementAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getReturnStatementAccess().getReturnStatementAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5323:2: ( (lv_labels_1_0= ruleLabel ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==KEYWORD_9) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5324:1: (lv_labels_1_0= ruleLabel )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5324:1: (lv_labels_1_0= ruleLabel )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5325:3: lv_labels_1_0= ruleLabel
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getReturnStatementAccess().getLabelsLabelParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLabel_in_ruleReturnStatement9864);
            	    lv_labels_1_0=ruleLabel();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getReturnStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"labels",
            	    	        		lv_labels_1_0, 
            	    	        		"Label", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);

            match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_ruleReturnStatement9876); 

                    createLeafNode(grammarAccess.getReturnStatementAccess().getRETURNKeyword_2(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5352:1: ( (lv_expression_3_0= ruleExpression ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==KEYWORD_37||LA92_0==KEYWORD_26||LA92_0==KEYWORD_30||LA92_0==KEYWORD_5||(LA92_0>=RULE_ID && LA92_0<=RULE_STRING)) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5353:1: (lv_expression_3_0= ruleExpression )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5353:1: (lv_expression_3_0= ruleExpression )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5354:3: lv_expression_3_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getReturnStatementAccess().getExpressionExpressionParserRuleCall_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleReturnStatement9897);
                    lv_expression_3_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getReturnStatementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expression",
                    	        		lv_expression_3_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleReturnStatement9909); 

                    createLeafNode(grammarAccess.getReturnStatementAccess().getSemicolonKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleReturnStatement


    // $ANTLR start entryRuleNullStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5389:1: entryRuleNullStatement returns [EObject current=null] : iv_ruleNullStatement= ruleNullStatement EOF ;
    public final EObject entryRuleNullStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullStatement = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5390:2: (iv_ruleNullStatement= ruleNullStatement EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5391:2: iv_ruleNullStatement= ruleNullStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNullStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleNullStatement_in_entryRuleNullStatement9944);
            iv_ruleNullStatement=ruleNullStatement();
            _fsp--;

             current =iv_ruleNullStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullStatement9954); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNullStatement


    // $ANTLR start ruleNullStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5398:1: ruleNullStatement returns [EObject current=null] : ( () ( (lv_labels_1_0= ruleLabel ) )* KEYWORD_26 KEYWORD_6 ) ;
    public final EObject ruleNullStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_labels_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5403:6: ( ( () ( (lv_labels_1_0= ruleLabel ) )* KEYWORD_26 KEYWORD_6 ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5404:1: ( () ( (lv_labels_1_0= ruleLabel ) )* KEYWORD_26 KEYWORD_6 )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5404:1: ( () ( (lv_labels_1_0= ruleLabel ) )* KEYWORD_26 KEYWORD_6 )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5404:2: () ( (lv_labels_1_0= ruleLabel ) )* KEYWORD_26 KEYWORD_6
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5404:2: ()
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5405:5: 
            {
             
                    temp=factory.create(grammarAccess.getNullStatementAccess().getNullStatementAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getNullStatementAccess().getNullStatementAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5415:2: ( (lv_labels_1_0= ruleLabel ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==KEYWORD_9) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5416:1: (lv_labels_1_0= ruleLabel )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5416:1: (lv_labels_1_0= ruleLabel )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5417:3: lv_labels_1_0= ruleLabel
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getNullStatementAccess().getLabelsLabelParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLabel_in_ruleNullStatement10009);
            	    lv_labels_1_0=ruleLabel();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getNullStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"labels",
            	    	        		lv_labels_1_0, 
            	    	        		"Label", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);

            match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleNullStatement10021); 

                    createLeafNode(grammarAccess.getNullStatementAccess().getNULLKeyword_2(), null); 
                
            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleNullStatement10032); 

                    createLeafNode(grammarAccess.getNullStatementAccess().getSemicolonKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNullStatement


    // $ANTLR start entryRuleRaiseStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5457:1: entryRuleRaiseStatement returns [EObject current=null] : iv_ruleRaiseStatement= ruleRaiseStatement EOF ;
    public final EObject entryRuleRaiseStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRaiseStatement = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5458:2: (iv_ruleRaiseStatement= ruleRaiseStatement EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5459:2: iv_ruleRaiseStatement= ruleRaiseStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRaiseStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleRaiseStatement_in_entryRuleRaiseStatement10067);
            iv_ruleRaiseStatement=ruleRaiseStatement();
            _fsp--;

             current =iv_ruleRaiseStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRaiseStatement10077); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRaiseStatement


    // $ANTLR start ruleRaiseStatement
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5466:1: ruleRaiseStatement returns [EObject current=null] : ( () ( (lv_labels_1_0= ruleLabel ) )* KEYWORD_40 ( (lv_exceptionName_3_0= RULE_ID ) )? KEYWORD_6 ) ;
    public final EObject ruleRaiseStatement() throws RecognitionException {
        EObject current = null;

        Token lv_exceptionName_3_0=null;
        EObject lv_labels_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5471:6: ( ( () ( (lv_labels_1_0= ruleLabel ) )* KEYWORD_40 ( (lv_exceptionName_3_0= RULE_ID ) )? KEYWORD_6 ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5472:1: ( () ( (lv_labels_1_0= ruleLabel ) )* KEYWORD_40 ( (lv_exceptionName_3_0= RULE_ID ) )? KEYWORD_6 )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5472:1: ( () ( (lv_labels_1_0= ruleLabel ) )* KEYWORD_40 ( (lv_exceptionName_3_0= RULE_ID ) )? KEYWORD_6 )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5472:2: () ( (lv_labels_1_0= ruleLabel ) )* KEYWORD_40 ( (lv_exceptionName_3_0= RULE_ID ) )? KEYWORD_6
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5472:2: ()
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5473:5: 
            {
             
                    temp=factory.create(grammarAccess.getRaiseStatementAccess().getRaiseStatementAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getRaiseStatementAccess().getRaiseStatementAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5483:2: ( (lv_labels_1_0= ruleLabel ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==KEYWORD_9) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5484:1: (lv_labels_1_0= ruleLabel )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5484:1: (lv_labels_1_0= ruleLabel )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5485:3: lv_labels_1_0= ruleLabel
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRaiseStatementAccess().getLabelsLabelParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLabel_in_ruleRaiseStatement10132);
            	    lv_labels_1_0=ruleLabel();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRaiseStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"labels",
            	    	        		lv_labels_1_0, 
            	    	        		"Label", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);

            match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleRaiseStatement10144); 

                    createLeafNode(grammarAccess.getRaiseStatementAccess().getRAISEKeyword_2(), null); 
                
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5512:1: ( (lv_exceptionName_3_0= RULE_ID ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==RULE_ID) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5513:1: (lv_exceptionName_3_0= RULE_ID )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5513:1: (lv_exceptionName_3_0= RULE_ID )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5514:3: lv_exceptionName_3_0= RULE_ID
                    {
                    lv_exceptionName_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRaiseStatement10161); 

                    			createLeafNode(grammarAccess.getRaiseStatementAccess().getExceptionNameIDTerminalRuleCall_3_0(), "exceptionName"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRaiseStatementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"exceptionName",
                    	        		lv_exceptionName_3_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleRaiseStatement10178); 

                    createLeafNode(grammarAccess.getRaiseStatementAccess().getSemicolonKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRaiseStatement


    // $ANTLR start entryRuleVariableRef
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5549:1: entryRuleVariableRef returns [EObject current=null] : iv_ruleVariableRef= ruleVariableRef EOF ;
    public final EObject entryRuleVariableRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableRef = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5550:2: (iv_ruleVariableRef= ruleVariableRef EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5551:2: iv_ruleVariableRef= ruleVariableRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVariableRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleVariableRef_in_entryRuleVariableRef10213);
            iv_ruleVariableRef=ruleVariableRef();
            _fsp--;

             current =iv_ruleVariableRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableRef10223); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVariableRef


    // $ANTLR start ruleVariableRef
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5558:1: ruleVariableRef returns [EObject current=null] : ( ( (lv_isHostRef_0_0= KEYWORD_5 ) )? ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleVariableRef() throws RecognitionException {
        EObject current = null;

        Token lv_isHostRef_0_0=null;
        EObject lv_name_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5563:6: ( ( ( (lv_isHostRef_0_0= KEYWORD_5 ) )? ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5564:1: ( ( (lv_isHostRef_0_0= KEYWORD_5 ) )? ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5564:1: ( ( (lv_isHostRef_0_0= KEYWORD_5 ) )? ( (lv_name_1_0= ruleQualifiedName ) ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5564:2: ( (lv_isHostRef_0_0= KEYWORD_5 ) )? ( (lv_name_1_0= ruleQualifiedName ) )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5564:2: ( (lv_isHostRef_0_0= KEYWORD_5 ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==KEYWORD_5) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5565:1: (lv_isHostRef_0_0= KEYWORD_5 )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5565:1: (lv_isHostRef_0_0= KEYWORD_5 )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5566:3: lv_isHostRef_0_0= KEYWORD_5
                    {
                    lv_isHostRef_0_0=(Token)input.LT(1);
                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleVariableRef10267); 

                            createLeafNode(grammarAccess.getVariableRefAccess().getIsHostRefColonKeyword_0_0(), "isHostRef"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getVariableRefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "isHostRef", true, ":", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5586:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5587:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5587:1: (lv_name_1_0= ruleQualifiedName )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5588:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getVariableRefAccess().getNameQualifiedNameParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleVariableRef10302);
            lv_name_1_0=ruleQualifiedName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVariableRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"QualifiedName", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVariableRef


    // $ANTLR start entryRuleQualifiedName
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5618:1: entryRuleQualifiedName returns [EObject current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final EObject entryRuleQualifiedName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedName = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5619:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5620:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQualifiedNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10337);
            iv_ruleQualifiedName=ruleQualifiedName();
            _fsp--;

             current =iv_ruleQualifiedName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10347); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleQualifiedName


    // $ANTLR start ruleQualifiedName
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5627:1: ruleQualifiedName returns [EObject current=null] : ( ( (lv_names_0_0= ruleName ) ) ( KEYWORD_4 ( (lv_names_2_0= ruleName ) ) )* ) ;
    public final EObject ruleQualifiedName() throws RecognitionException {
        EObject current = null;

        EObject lv_names_0_0 = null;

        EObject lv_names_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5632:6: ( ( ( (lv_names_0_0= ruleName ) ) ( KEYWORD_4 ( (lv_names_2_0= ruleName ) ) )* ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5633:1: ( ( (lv_names_0_0= ruleName ) ) ( KEYWORD_4 ( (lv_names_2_0= ruleName ) ) )* )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5633:1: ( ( (lv_names_0_0= ruleName ) ) ( KEYWORD_4 ( (lv_names_2_0= ruleName ) ) )* )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5633:2: ( (lv_names_0_0= ruleName ) ) ( KEYWORD_4 ( (lv_names_2_0= ruleName ) ) )*
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5633:2: ( (lv_names_0_0= ruleName ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5634:1: (lv_names_0_0= ruleName )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5634:1: (lv_names_0_0= ruleName )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5635:3: lv_names_0_0= ruleName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getQualifiedNameAccess().getNamesNameParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleName_in_ruleQualifiedName10393);
            lv_names_0_0=ruleName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getQualifiedNameRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"names",
            	        		lv_names_0_0, 
            	        		"Name", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5657:2: ( KEYWORD_4 ( (lv_names_2_0= ruleName ) ) )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==KEYWORD_4) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5658:2: KEYWORD_4 ( (lv_names_2_0= ruleName ) )
            	    {
            	    match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleQualifiedName10405); 

            	            createLeafNode(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5662:1: ( (lv_names_2_0= ruleName ) )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5663:1: (lv_names_2_0= ruleName )
            	    {
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5663:1: (lv_names_2_0= ruleName )
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5664:3: lv_names_2_0= ruleName
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getQualifiedNameAccess().getNamesNameParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleName_in_ruleQualifiedName10426);
            	    lv_names_2_0=ruleName();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getQualifiedNameRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"names",
            	    	        		lv_names_2_0, 
            	    	        		"Name", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleQualifiedName


    // $ANTLR start entryRuleName
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5694:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5695:2: (iv_ruleName= ruleName EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5696:2: iv_ruleName= ruleName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName10463);
            iv_ruleName=ruleName();
            _fsp--;

             current =iv_ruleName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName10473); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleName


    // $ANTLR start ruleName
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5703:1: ruleName returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5708:6: ( ( ( RULE_ID ) ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5709:1: ( ( RULE_ID ) )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5709:1: ( ( RULE_ID ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5710:1: ( RULE_ID )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5710:1: ( RULE_ID )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5711:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getNameRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleName10515); 

            		createLeafNode(grammarAccess.getNameAccess().getDeclarationNameDeclarationCrossReference_0(), "declaration"); 
            	

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleName


    // $ANTLR start entryRuleLoopVariableDeclaration
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5731:1: entryRuleLoopVariableDeclaration returns [EObject current=null] : iv_ruleLoopVariableDeclaration= ruleLoopVariableDeclaration EOF ;
    public final EObject entryRuleLoopVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopVariableDeclaration = null;


        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5732:2: (iv_ruleLoopVariableDeclaration= ruleLoopVariableDeclaration EOF )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5733:2: iv_ruleLoopVariableDeclaration= ruleLoopVariableDeclaration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLoopVariableDeclarationRule(), currentNode); 
            pushFollow(FOLLOW_ruleLoopVariableDeclaration_in_entryRuleLoopVariableDeclaration10549);
            iv_ruleLoopVariableDeclaration=ruleLoopVariableDeclaration();
            _fsp--;

             current =iv_ruleLoopVariableDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoopVariableDeclaration10559); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLoopVariableDeclaration


    // $ANTLR start ruleLoopVariableDeclaration
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5740:1: ruleLoopVariableDeclaration returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleLoopVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5745:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5746:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5746:1: ( (lv_name_0_0= RULE_ID ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5747:1: (lv_name_0_0= RULE_ID )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5747:1: (lv_name_0_0= RULE_ID )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5748:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLoopVariableDeclaration10600); 

            			createLeafNode(grammarAccess.getLoopVariableDeclarationAccess().getNameIDTerminalRuleCall_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLoopVariableDeclarationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLoopVariableDeclaration


    // $ANTLR start ruleInvokerRight
    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5780:1: ruleInvokerRight returns [Enumerator current=null] : ( ( KEYWORD_63 ) | ( KEYWORD_51 ) ) ;
    public final Enumerator ruleInvokerRight() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5784:6: ( ( ( KEYWORD_63 ) | ( KEYWORD_51 ) ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5785:1: ( ( KEYWORD_63 ) | ( KEYWORD_51 ) )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5785:1: ( ( KEYWORD_63 ) | ( KEYWORD_51 ) )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==KEYWORD_63) ) {
                alt98=1;
            }
            else if ( (LA98_0==KEYWORD_51) ) {
                alt98=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("5785:1: ( ( KEYWORD_63 ) | ( KEYWORD_51 ) )", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5785:2: ( KEYWORD_63 )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5785:2: ( KEYWORD_63 )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5785:7: KEYWORD_63
                    {
                    match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleInvokerRight10657); 

                            current = grammarAccess.getInvokerRightAccess().getCURRENT_USEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getInvokerRightAccess().getCURRENT_USEREnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5791:6: ( KEYWORD_51 )
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5791:6: ( KEYWORD_51 )
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/internal/InternalPlSql.g:5791:11: KEYWORD_51
                    {
                    match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_ruleInvokerRight10674); 

                            current = grammarAccess.getInvokerRightAccess().getDEFINEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getInvokerRightAccess().getDEFINEREnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInvokerRight


    protected DFA42 dfa42 = new DFA42(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA80 dfa80 = new DFA80(this);
    static final String DFA42_eotS =
        "\104\uffff";
    static final String DFA42_eofS =
        "\104\uffff";
    static final String DFA42_minS =
        "\1\11\1\uffff\1\107\1\uffff\1\74\1\107\2\uffff\3\20\4\24\2\20\1"+
        "\110\2\37\1\107\1\74\1\110\1\20\6\101\1\107\1\101\1\20\1\101\1\110"+
        "\1\24\1\107\2\20\5\24\2\101\2\20\1\110\2\37\1\110\1\20\6\101\1\107"+
        "\2\101\1\110\1\24\1\107\1\24\2\101";
    static final String DFA42_maxS =
        "\1\107\1\uffff\1\107\1\uffff\1\105\1\107\2\uffff\3\107\4\102\2\107"+
        "\1\110\2\111\1\107\1\105\1\110\1\107\6\102\1\107\1\103\1\107\1\101"+
        "\1\110\1\102\3\107\5\102\1\101\1\103\2\107\1\110\2\111\1\110\1\107"+
        "\6\102\1\107\1\103\1\101\1\110\1\102\1\107\1\102\1\101\1\103";
    static final String DFA42_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\2\uffff\1\3\1\2\74\uffff";
    static final String DFA42_specialS =
        "\104\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\2\20\uffff\1\3\54\uffff\1\1",
            "",
            "\1\4",
            "",
            "\1\6\2\uffff\1\6\1\5\4\uffff\1\7",
            "\1\10",
            "",
            "",
            "\1\14\1\15\7\uffff\1\13\35\uffff\1\12\6\uffff\1\11\10\uffff"+
            "\1\16",
            "\1\14\1\15\7\uffff\1\13\35\uffff\1\17\17\uffff\1\16",
            "\1\14\1\15\6\uffff\1\20\1\13\55\uffff\1\16",
            "\1\23\44\uffff\1\22\6\uffff\1\21\1\25\1\24",
            "\1\23\44\uffff\1\22\6\uffff\1\26\1\25\1\24",
            "\1\23\44\uffff\1\22\7\uffff\1\25\1\24",
            "\1\23\44\uffff\1\22\7\uffff\1\25\1\24",
            "\1\14\1\15\6\uffff\1\27\1\13\55\uffff\1\16",
            "\1\14\1\15\7\uffff\1\13\55\uffff\1\16",
            "\1\30",
            "\1\34\14\uffff\1\35\3\uffff\1\33\23\uffff\1\36\2\uffff\1\37"+
            "\1\31\1\32",
            "\1\34\14\uffff\1\35\3\uffff\1\33\23\uffff\1\36\2\uffff\1\37"+
            "\1\31\1\32",
            "\1\40",
            "\1\6\2\uffff\1\6\5\uffff\1\7",
            "\1\41",
            "\1\14\1\15\7\uffff\1\13\55\uffff\1\16",
            "\1\43\1\42",
            "\1\25\1\24",
            "\1\25\1\24",
            "\1\25\1\24",
            "\1\25\1\24",
            "\1\25\1\24",
            "\1\37",
            "\1\25\1\24\1\44",
            "\1\50\1\51\7\uffff\1\47\35\uffff\1\46\6\uffff\1\45\10\uffff"+
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\23\44\uffff\1\22\7\uffff\1\25\1\24",
            "\1\55",
            "\1\50\1\51\7\uffff\1\47\35\uffff\1\56\17\uffff\1\52",
            "\1\50\1\51\6\uffff\1\57\1\47\55\uffff\1\52",
            "\1\62\44\uffff\1\61\6\uffff\1\60\1\25\1\24",
            "\1\62\44\uffff\1\61\6\uffff\1\63\1\25\1\24",
            "\1\62\44\uffff\1\61\7\uffff\1\25\1\24",
            "\1\62\44\uffff\1\61\7\uffff\1\25\1\24",
            "\1\23\44\uffff\1\22\7\uffff\1\25\1\24",
            "\1\43",
            "\1\25\1\24\1\44",
            "\1\50\1\51\6\uffff\1\64\1\47\55\uffff\1\52",
            "\1\50\1\51\7\uffff\1\47\55\uffff\1\52",
            "\1\65",
            "\1\71\14\uffff\1\72\3\uffff\1\70\23\uffff\1\73\2\uffff\1\74"+
            "\1\66\1\67",
            "\1\71\14\uffff\1\72\3\uffff\1\70\23\uffff\1\73\2\uffff\1\74"+
            "\1\66\1\67",
            "\1\75",
            "\1\50\1\51\7\uffff\1\47\55\uffff\1\52",
            "\1\77\1\76",
            "\1\25\1\24",
            "\1\25\1\24",
            "\1\25\1\24",
            "\1\25\1\24",
            "\1\25\1\24",
            "\1\74",
            "\1\25\1\24\1\100",
            "\1\101",
            "\1\102",
            "\1\62\44\uffff\1\61\7\uffff\1\25\1\24",
            "\1\103",
            "\1\62\44\uffff\1\61\7\uffff\1\25\1\24",
            "\1\77",
            "\1\25\1\24\1\100"
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "2334:1: (this_ItemDeclaration_0= ruleItemDeclaration | this_ProcedureDeclaration_1= ruleProcedureDeclaration | this_ProcedureDefinition_2= ruleProcedureDefinition | this_Pragma_3= rulePragma )";
        }
    }
    static final String DFA49_eotS =
        "\22\uffff";
    static final String DFA49_eofS =
        "\22\uffff";
    static final String DFA49_minS =
        "\1\11\1\107\1\uffff\1\14\14\uffff\1\73\1\11";
    static final String DFA49_maxS =
        "\2\107\1\uffff\1\107\14\uffff\1\73\1\107";
    static final String DFA49_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
        "\1\14\1\15\2\uffff";
    static final String DFA49_specialS =
        "\22\uffff}>";
    static final String[] DFA49_transitionS = {
            "\1\4\3\uffff\1\7\5\uffff\1\4\6\uffff\1\4\1\17\1\4\1\6\2\uffff"+
            "\1\11\1\uffff\1\16\1\uffff\1\14\1\uffff\1\5\1\uffff\1\10\1\12"+
            "\1\uffff\1\14\1\15\10\uffff\1\14\4\uffff\1\1\2\uffff\1\13\6"+
            "\uffff\1\2\2\uffff\1\3",
            "\1\20",
            "",
            "\1\4\3\uffff\2\4\7\uffff\1\4\37\uffff\1\2\11\uffff\1\2\3\uffff"+
            "\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\21",
            "\1\4\3\uffff\1\7\5\uffff\1\4\6\uffff\1\4\1\17\1\4\1\6\2\uffff"+
            "\1\11\1\uffff\1\16\1\uffff\1\14\1\uffff\1\5\1\uffff\1\10\1\12"+
            "\1\uffff\1\14\1\15\10\uffff\1\14\4\uffff\1\1\2\uffff\1\13\6"+
            "\uffff\1\2\2\uffff\1\3"
    };

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "3025:1: (this_AssignmentStatement_0= ruleAssignmentStatement | this_BlockStatement_1= ruleBlockStatement | this_CaseStatement_2= ruleCaseStatement | this_CloseStatement_3= ruleCloseStatement | this_ContinueStatement_4= ruleContinueStatement | this_ExitStatement_5= ruleExitStatement | this_FetchStatement_6= ruleFetchStatement | this_GotoStatement_7= ruleGotoStatement | this_IfStatement_8= ruleIfStatement | this_LoopStatement_9= ruleLoopStatement | this_NullStatement_10= ruleNullStatement | this_RaiseStatement_11= ruleRaiseStatement | this_ReturnStatement_12= ruleReturnStatement )";
        }
    }
    static final String DFA80_eotS =
        "\7\uffff";
    static final String DFA80_eofS =
        "\7\uffff";
    static final String DFA80_minS =
        "\1\44\1\107\3\uffff\1\73\1\44";
    static final String DFA80_maxS =
        "\1\72\1\107\3\uffff\1\73\1\72";
    static final String DFA80_acceptS =
        "\2\uffff\1\1\1\2\1\3\2\uffff";
    static final String DFA80_specialS =
        "\7\uffff}>";
    static final String[] DFA80_transitionS = {
            "\1\3\6\uffff\1\2\11\uffff\1\4\4\uffff\1\1",
            "\1\5",
            "",
            "",
            "",
            "\1\6",
            "\1\3\6\uffff\1\2\11\uffff\1\4\4\uffff\1\1"
    };

    static final short[] DFA80_eot = DFA.unpackEncodedString(DFA80_eotS);
    static final short[] DFA80_eof = DFA.unpackEncodedString(DFA80_eofS);
    static final char[] DFA80_min = DFA.unpackEncodedStringToUnsignedChars(DFA80_minS);
    static final char[] DFA80_max = DFA.unpackEncodedStringToUnsignedChars(DFA80_maxS);
    static final short[] DFA80_accept = DFA.unpackEncodedString(DFA80_acceptS);
    static final short[] DFA80_special = DFA.unpackEncodedString(DFA80_specialS);
    static final short[][] DFA80_transition;

    static {
        int numStates = DFA80_transitionS.length;
        DFA80_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA80_transition[i] = DFA.unpackEncodedString(DFA80_transitionS[i]);
        }
    }

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = DFA80_eot;
            this.eof = DFA80_eof;
            this.min = DFA80_min;
            this.max = DFA80_max;
            this.accept = DFA80_accept;
            this.special = DFA80_special;
            this.transition = DFA80_transition;
        }
        public String getDescription() {
            return "4794:1: (this_BasicLoopStatement_0= ruleBasicLoopStatement | this_WhileLoopStatement_1= ruleWhileLoopStatement | this_ForLoopStatement_2= ruleForLoopStatement )";
        }
    }
 

    public static final BitSet FOLLOW_ruleCompilationUnit_in_entryRuleCompilationUnit67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompilationUnit77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedure_in_ruleCompilationUnit124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleCompilationUnit151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleCompilationUnit178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedure_in_entryRuleProcedure212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcedure222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_ruleProcedure258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcedure276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleProcedure292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcedure311 = new BitSet(new long[]{0x9000000000200040L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleProcedure328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleParameterSequence_in_ruleProcedure349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleProcedure360 = new BitSet(new long[]{0x9000000000200040L});
    public static final BitSet FOLLOW_ruleProcedureInvokerRightsClause_in_ruleProcedure383 = new BitSet(new long[]{0x9000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleProcedure396 = new BitSet(new long[]{0x0000000014084200L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleProcedure413 = new BitSet(new long[]{0x0000000014084200L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleProcedureContent_in_ruleProcedure435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage470 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_rulePackage516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rulePackage550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage569 = new BitSet(new long[]{0x9000000000200040L});
    public static final BitSet FOLLOW_ruleProcedureInvokerRightsClause_in_rulePackage595 = new BitSet(new long[]{0x9000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_14_in_rulePackage608 = new BitSet(new long[]{0x0010000004000200L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_11_in_rulePackage625 = new BitSet(new long[]{0x0010000004000200L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleItem_in_rulePackage647 = new BitSet(new long[]{0x0010000004000200L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_15_in_rulePackage659 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rulePackage693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedureDeclaration_in_entryRuleProcedureDeclaration728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcedureDeclaration738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_ruleProcedureDeclaration774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcedureDeclaration791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000021L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleProcedureDeclaration808 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleParameterSequence_in_ruleProcedureDeclaration829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleProcedureDeclaration840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleProcedureDeclaration853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedureDefinition_in_entryRuleProcedureDefinition888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcedureDefinition898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_ruleProcedureDefinition934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcedureDefinition951 = new BitSet(new long[]{0x9000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleProcedureDefinition968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleParameterSequence_in_ruleProcedureDefinition989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleProcedureDefinition1000 = new BitSet(new long[]{0x9000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleProcedureDefinition1014 = new BitSet(new long[]{0x0000000014080200L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleProcedureDefinition1031 = new BitSet(new long[]{0x0000000014080200L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleProcedureImplementation_in_ruleProcedureDefinition1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction1088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_57_in_ruleFunction1134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction1152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleFunction1168 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction1187 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleFunction1204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleParameterSequence_in_ruleFunction1225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleFunction1236 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_KEYWORD_46_in_ruleFunction1249 = new BitSet(new long[]{0x0000000002030000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleFunction1270 = new BitSet(new long[]{0x00000000002001E0L});
    public static final BitSet FOLLOW_ruleFunctionClause_in_ruleFunction1291 = new BitSet(new long[]{0x9000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleFunction1303 = new BitSet(new long[]{0x0000000014080200L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleFunction1320 = new BitSet(new long[]{0x0000000014080200L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleFunctionContent_in_ruleFunction1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterSequence_in_entryRuleParameterSequence1377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterSequence1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleParameterSequence1433 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleParameterSequence1445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleParameterSequence1466 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration1503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterDeclaration1555 = new BitSet(new long[]{0x4080000002030000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleParameterBehavior_in_ruleParameterDeclaration1581 = new BitSet(new long[]{0x0000000002030000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleParameterDeclaration1603 = new BitSet(new long[]{0x0200000000100002L});
    public static final BitSet FOLLOW_ruleParameterValue_in_ruleParameterDeclaration1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterValue_in_entryRuleParameterValue1660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterValue1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleParameterValue1707 = new BitSet(new long[]{0x0001100080000000L,0x0000000000000390L});
    public static final BitSet FOLLOW_KEYWORD_50_in_ruleParameterValue1724 = new BitSet(new long[]{0x0001100080000000L,0x0000000000000390L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParameterValue1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterBehavior_in_entryRuleParameterBehavior1782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterBehavior1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleParameterBehavior1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleParameterBehavior1851 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_ruleParameterBehavior1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleParameterBehavior1888 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleParameterBehavior1901 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_ruleParameterBehavior1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedureInvokerRightsClause_in_entryRuleProcedureInvokerRightsClause1957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcedureInvokerRightsClause1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvokerRight_in_ruleProcedureInvokerRightsClause2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionInvokerRightsClause_in_entryRuleFunctionInvokerRightsClause2046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionInvokerRightsClause2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvokerRight_in_ruleFunctionInvokerRightsClause2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePragma_in_entryRulePragma2135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePragma2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePragmaRestrictReferences_in_rulePragma2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePragmaTimestamp_in_rulePragma2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePragmaRestrictReferences_in_entryRulePragmaRestrictReferences2253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePragmaRestrictReferences2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_rulePragmaRestrictReferences2299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_KEYWORD_66_in_rulePragmaRestrictReferences2310 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_1_in_rulePragmaRestrictReferences2321 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleSubprogramName_in_rulePragmaRestrictReferences2338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_50_in_rulePragmaRestrictReferences2354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_3_in_rulePragmaRestrictReferences2366 = new BitSet(new long[]{0x000C600800000000L});
    public static final BitSet FOLLOW_rulePragmaRestrictReferencesRestriction_in_rulePragmaRestrictReferences2387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_KEYWORD_3_in_rulePragmaRestrictReferences2399 = new BitSet(new long[]{0x000C600800000000L});
    public static final BitSet FOLLOW_rulePragmaRestrictReferencesRestriction_in_rulePragmaRestrictReferences2420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rulePragmaRestrictReferences2433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rulePragmaRestrictReferences2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePragmaRestrictReferencesRestriction_in_entryRulePragmaRestrictReferencesRestriction2480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePragmaRestrictReferencesRestriction2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_rulePragmaRestrictReferencesRestriction2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_rulePragmaRestrictReferencesRestriction2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_rulePragmaRestrictReferencesRestriction2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_rulePragmaRestrictReferencesRestriction2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_rulePragmaRestrictReferencesRestriction2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubprogramName_in_entryRuleSubprogramName2645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubprogramName2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubprogramName2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePragmaTimestamp_in_entryRulePragmaTimestamp2738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePragmaTimestamp2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_rulePragmaTimestamp2784 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_KEYWORD_62_in_rulePragmaTimestamp2795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_1_in_rulePragmaTimestamp2806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePragmaTimestamp2823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rulePragmaTimestamp2839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rulePragmaTimestamp2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType2886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleDataType2936 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleDataType2950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDataType2965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleDataType2984 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDataType2999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleDataType3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_58_in_ruleDataType3042 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleDataType3056 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDataType3071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleDataType3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_ruleDataType3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataType3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedureContent_in_entryRuleProcedureContent3176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcedureContent3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedureImplementation_in_ruleProcedureContent3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalProcedureDeclaration_in_ruleProcedureContent3260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedureImplementation_in_entryRuleProcedureImplementation3294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcedureImplementation3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclareSection_in_ruleProcedureImplementation3350 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleStatementBody_in_ruleProcedureImplementation3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionContent_in_entryRuleFunctionContent3407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionContent3417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionImplementation_in_ruleFunctionContent3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionImplementation_in_entryRuleFunctionImplementation3496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionImplementation3506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclareSection_in_ruleFunctionImplementation3552 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleStatementBody_in_ruleFunctionImplementation3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionClause_in_entryRuleFunctionClause3609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionClause3619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionInvokerRightsClause_in_ruleFunctionClause3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeterministicClause_in_ruleFunctionClause3693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultCacheClause_in_ruleFunctionClause3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePipelinedClause_in_ruleFunctionClause3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeterministicClause_in_entryRuleDeterministicClause3781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeterministicClause3791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_65_in_ruleDeterministicClause3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultCacheClause_in_entryRuleResultCacheClause3871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultCacheClause3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_64_in_ruleResultCacheClause3926 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleResultCacheClause3938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleResultCacheClause3949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResultCacheClause3967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleResultCacheClause3984 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResultCacheClause4001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleResultCacheClause4020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePipelinedClause_in_entryRulePipelinedClause4057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePipelinedClause4067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_59_in_rulePipelinedClause4112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementBody_in_entryRuleStatementBody4147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatementBody4157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleStatementBody4193 = new BitSet(new long[]{0x24201B553C082200L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatementBody4214 = new BitSet(new long[]{0x24301B553C082200L,0x0000000000000090L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleStatementBody4226 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatementBody4243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleStatementBody4260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclareSection_in_entryRuleDeclareSection4295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclareSection4305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleDeclareSection4342 = new BitSet(new long[]{0x0000000004000200L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleItem_in_ruleDeclareSection4365 = new BitSet(new long[]{0x0000000004000202L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleItem_in_entryRuleItem4401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItem4411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemDeclaration_in_ruleItem4458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedureDeclaration_in_ruleItem4485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedureDefinition_in_ruleItem4512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePragma_in_ruleItem4539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemDeclaration_in_entryRuleItemDeclaration4573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItemDeclaration4583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleItemDeclaration4629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalProcedureDeclaration_in_entryRuleExternalProcedureDeclaration4662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalProcedureDeclaration4672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_56_in_ruleExternalProcedureDeclaration4717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration4752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration4762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration4804 = new BitSet(new long[]{0x0000000002031000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_54_in_ruleVariableDeclaration4828 = new BitSet(new long[]{0x0000000002030000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleVariableDeclaration4863 = new BitSet(new long[]{0x0240000000100000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleNOT_NULL_in_ruleVariableDeclaration4884 = new BitSet(new long[]{0x0200000000100000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariableValue_in_ruleVariableDeclaration4906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleVariableDeclaration4918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNOT_NULL_in_entryRuleNOT_NULL4954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNOT_NULL4965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleNOT_NULL5003 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleNOT_NULL5016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableValue_in_entryRuleVariableValue5055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableValue5065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleVariableValue5102 = new BitSet(new long[]{0x0001100080000000L,0x0000000000000390L});
    public static final BitSet FOLLOW_KEYWORD_50_in_ruleVariableValue5119 = new BitSet(new long[]{0x0001100080000000L,0x0000000000000390L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableValue5141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression5176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression5186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteralExpression_in_ruleExpression5233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteralExpression_in_ruleExpression5260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteralExpression_in_ruleExpression5287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteralExpression_in_ruleExpression5314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableRefExpression_in_ruleExpression5341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteralExpression_in_entryRuleIntLiteralExpression5375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteralExpression5385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteralExpression5426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteralExpression_in_entryRuleStringLiteralExpression5465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteralExpression5475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteralExpression5516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteralExpression_in_entryRuleBooleanLiteralExpression5555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteralExpression5565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleBooleanLiteralExpression5610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleBooleanLiteralExpression5640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteralExpression_in_entryRuleNullLiteralExpression5690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteralExpression5700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleNullLiteralExpression5745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableRefExpression_in_entryRuleVariableRefExpression5780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableRefExpression5790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableRef_in_ruleVariableRefExpression5835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement5869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement5879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentStatement_in_ruleStatement5926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockStatement_in_ruleStatement5953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCaseStatement_in_ruleStatement5980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCloseStatement_in_ruleStatement6007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContinueStatement_in_ruleStatement6034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitStatement_in_ruleStatement6061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFetchStatement_in_ruleStatement6088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGotoStatement_in_ruleStatement6115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_ruleStatement6142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopStatement_in_ruleStatement6169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullStatement_in_ruleStatement6196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRaiseStatement_in_ruleStatement6223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnStatement_in_ruleStatement6250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel6284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel6294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleLabel6330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabel6347 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleLabel6363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentStatement_in_entryRuleAssignmentStatement6398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentStatement6408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleAssignmentStatement6454 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleAssignmentTarget_in_ruleAssignmentStatement6476 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleAssignmentStatement6487 = new BitSet(new long[]{0x0001100080000000L,0x0000000000000390L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignmentStatement6508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleAssignmentStatement6519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentTarget_in_entryRuleAssignmentTarget6554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentTarget6564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignmentTarget_in_ruleAssignmentTarget6610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignmentTarget_in_entryRuleVariableAssignmentTarget6643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAssignmentTarget6653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableRef_in_ruleVariableAssignmentTarget6698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockStatement_in_entryRuleBlockStatement6732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockStatement6742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleBlockStatement6788 = new BitSet(new long[]{0x0400000014080200L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDeclareSection_in_ruleBlockStatement6810 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleStatementBody_in_ruleBlockStatement6832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCaseStatement_in_entryRuleCaseStatement6867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCaseStatement6877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleCaseStatement6923 = new BitSet(new long[]{0x0400004000000000L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleCaseStatement6935 = new BitSet(new long[]{0x0003100080000000L,0x0000000000000390L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCaseStatement6956 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ruleCaseStatementWhenBranch_in_ruleCaseStatement6978 = new BitSet(new long[]{0x0012008000000000L});
    public static final BitSet FOLLOW_ruleCaseStatementElseBranch_in_ruleCaseStatement7000 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleCaseStatement7012 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleCaseStatement7023 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCaseStatement7040 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleCaseStatement7057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCaseStatementWhenBranch_in_entryRuleCaseStatementWhenBranch7092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCaseStatementWhenBranch7102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_ruleCaseStatementWhenBranch7138 = new BitSet(new long[]{0x0001100080000000L,0x0000000000000390L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCaseStatementWhenBranch7159 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleCaseStatementWhenBranch7170 = new BitSet(new long[]{0x24201B553C082200L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleCaseStatementWhenBranch7191 = new BitSet(new long[]{0x24201B553C082202L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleCaseStatementElseBranch_in_entryRuleCaseStatementElseBranch7227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCaseStatementElseBranch7237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleCaseStatementElseBranch7273 = new BitSet(new long[]{0x24201B553C082200L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleCaseStatementElseBranch7294 = new BitSet(new long[]{0x24201B553C082202L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleCloseStatement_in_entryRuleCloseStatement7330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCloseStatement7340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleCloseStatement7386 = new BitSet(new long[]{0x0400000020000000L});
    public static final BitSet FOLLOW_KEYWORD_35_in_ruleCloseStatement7398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleVariableRef_in_ruleCloseStatement7419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleCloseStatement7430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContinueStatement_in_entryRuleContinueStatement7465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContinueStatement7475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleContinueStatement7530 = new BitSet(new long[]{0x0400000000002000L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleContinueStatement7542 = new BitSet(new long[]{0x0002000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContinueStatement7559 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_31_in_ruleContinueStatement7577 = new BitSet(new long[]{0x0001100080000000L,0x0000000000000390L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleContinueStatement7598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleContinueStatement7611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitStatement_in_entryRuleExitStatement7646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitStatement7656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleExitStatement7711 = new BitSet(new long[]{0x0400010000000000L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleExitStatement7723 = new BitSet(new long[]{0x0002000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExitStatement7740 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_31_in_ruleExitStatement7758 = new BitSet(new long[]{0x0001100080000000L,0x0000000000000390L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExitStatement7779 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleExitStatement7792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFetchStatement_in_entryRuleFetchStatement7827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFetchStatement7837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleFetchStatement7883 = new BitSet(new long[]{0x0400000100000000L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruleFetchStatement7895 = new BitSet(new long[]{0x0000042000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleVariableRef_in_ruleFetchStatement7916 = new BitSet(new long[]{0x0000042000000000L});
    public static final BitSet FOLLOW_ruleFetchStatementIntoClause_in_ruleFetchStatement7938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleFetchStatement7949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFetchStatementIntoClause_in_entryRuleFetchStatementIntoClause7984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFetchStatementIntoClause7994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFetchStatementSingleIntoClause_in_ruleFetchStatementIntoClause8041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFetchStatementBulkIntoClause_in_ruleFetchStatementIntoClause8068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFetchStatementSingleIntoClause_in_entryRuleFetchStatementSingleIntoClause8102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFetchStatementSingleIntoClause8112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleFetchStatementSingleIntoClause8148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleVariableRef_in_ruleFetchStatementSingleIntoClause8169 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleFetchStatementBulkIntoClause_in_entryRuleFetchStatementBulkIntoClause8205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFetchStatementBulkIntoClause8215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleFetchStatementBulkIntoClause8251 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_KEYWORD_48_in_ruleFetchStatementBulkIntoClause8262 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleFetchStatementBulkIntoClause8273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleVariableRef_in_ruleFetchStatementBulkIntoClause8294 = new BitSet(new long[]{0x0000000200000002L,0x0000000000000090L});
    public static final BitSet FOLLOW_KEYWORD_39_in_ruleFetchStatementBulkIntoClause8307 = new BitSet(new long[]{0x0001100080000000L,0x0000000000000390L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFetchStatementBulkIntoClause8328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGotoStatement_in_entryRuleGotoStatement8365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGotoStatement8375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleGotoStatement8421 = new BitSet(new long[]{0x0400020000000000L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleGotoStatement8433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGotoStatement8451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleGotoStatement8462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_entryRuleIfStatement8497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfStatement8507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleIfStatement8553 = new BitSet(new long[]{0x2400000000000000L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleIfStatement8565 = new BitSet(new long[]{0x0001100080000000L,0x0000000000000390L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfStatement8586 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleIfStatement8597 = new BitSet(new long[]{0x24201B553C082200L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIfStatement8618 = new BitSet(new long[]{0x24301BD57C082200L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleIfStatementElsifBranch_in_ruleIfStatement8640 = new BitSet(new long[]{0x0010008040000000L});
    public static final BitSet FOLLOW_ruleIfStatementElseBranch_in_ruleIfStatement8662 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleIfStatement8674 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleIfStatement8685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleIfStatement8696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatementElsifBranch_in_entryRuleIfStatementElsifBranch8731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfStatementElsifBranch8741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleIfStatementElsifBranch8777 = new BitSet(new long[]{0x0001100080000000L,0x0000000000000390L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfStatementElsifBranch8798 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleIfStatementElsifBranch8809 = new BitSet(new long[]{0x24201B553C082200L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIfStatementElsifBranch8830 = new BitSet(new long[]{0x24201B553C082202L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleIfStatementElseBranch_in_entryRuleIfStatementElseBranch8866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfStatementElseBranch8876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleIfStatementElseBranch8912 = new BitSet(new long[]{0x24201B553C082200L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIfStatementElseBranch8933 = new BitSet(new long[]{0x24201B553C082202L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleLoopStatement_in_entryRuleLoopStatement8969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoopStatement8979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicLoopStatement_in_ruleLoopStatement9026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileLoopStatement_in_ruleLoopStatement9053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForLoopStatement_in_ruleLoopStatement9080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicLoopStatement_in_entryRuleBasicLoopStatement9114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicLoopStatement9124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleBasicLoopStatement9170 = new BitSet(new long[]{0x0400080000000000L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleBasicLoopStatement9182 = new BitSet(new long[]{0x24201B553C082200L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleBasicLoopStatement9203 = new BitSet(new long[]{0x24301B553C082200L,0x0000000000000090L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleBasicLoopStatement9215 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleBasicLoopStatement9226 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBasicLoopStatement9243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleBasicLoopStatement9260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileLoopStatement_in_entryRuleWhileLoopStatement9295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhileLoopStatement9305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleWhileLoopStatement9351 = new BitSet(new long[]{0x0400001000000000L});
    public static final BitSet FOLLOW_KEYWORD_42_in_ruleWhileLoopStatement9363 = new BitSet(new long[]{0x0001100080000000L,0x0000000000000390L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleWhileLoopStatement9384 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleWhileLoopStatement9395 = new BitSet(new long[]{0x24201B553C082200L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleWhileLoopStatement9416 = new BitSet(new long[]{0x24301B553C082200L,0x0000000000000090L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleWhileLoopStatement9428 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleWhileLoopStatement9439 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWhileLoopStatement9456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleWhileLoopStatement9473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForLoopStatement_in_entryRuleForLoopStatement9508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForLoopStatement9518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleForLoopStatement9564 = new BitSet(new long[]{0x0420000000000000L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleForLoopStatement9576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleLoopVariableDeclaration_in_ruleForLoopStatement9597 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleForLoopStatement9608 = new BitSet(new long[]{0x0001100080800000L,0x0000000000000390L});
    public static final BitSet FOLLOW_KEYWORD_53_in_ruleForLoopStatement9620 = new BitSet(new long[]{0x0001100080000000L,0x0000000000000390L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForLoopStatement9643 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleForLoopStatement9654 = new BitSet(new long[]{0x0001100080000000L,0x0000000000000390L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForLoopStatement9675 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleForLoopStatement9686 = new BitSet(new long[]{0x24201B553C082200L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleForLoopStatement9707 = new BitSet(new long[]{0x24301B553C082200L,0x0000000000000090L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleForLoopStatement9719 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleForLoopStatement9730 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForLoopStatement9747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleForLoopStatement9764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement9799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnStatement9809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleReturnStatement9864 = new BitSet(new long[]{0x0400000008000000L});
    public static final BitSet FOLLOW_KEYWORD_46_in_ruleReturnStatement9876 = new BitSet(new long[]{0x0001100080000000L,0x00000000000003B0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReturnStatement9897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleReturnStatement9909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullStatement_in_entryRuleNullStatement9944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullStatement9954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleNullStatement10009 = new BitSet(new long[]{0x0400100000000000L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleNullStatement10021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleNullStatement10032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRaiseStatement_in_entryRuleRaiseStatement10067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRaiseStatement10077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleRaiseStatement10132 = new BitSet(new long[]{0x0400000400000000L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleRaiseStatement10144 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRaiseStatement10161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleRaiseStatement10178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableRef_in_entryRuleVariableRef10213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableRef10223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleVariableRef10267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleVariableRef10302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleQualifiedName10393 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleQualifiedName10405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleName_in_ruleQualifiedName10426 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName10463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName10473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleName10515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopVariableDeclaration_in_entryRuleLoopVariableDeclaration10549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoopVariableDeclaration10559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLoopVariableDeclaration10600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleInvokerRight10657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_ruleInvokerRight10674 = new BitSet(new long[]{0x0000000000000002L});

}