package plsql.editor.xtext.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPlSqlLexer extends Lexer {
    public static final int RULE_ID=71;
    public static final int RULE_ANY_OTHER=76;
    public static final int KEYWORD_56=14;
    public static final int KEYWORD_19=37;
    public static final int KEYWORD_55=13;
    public static final int KEYWORD_17=54;
    public static final int KEYWORD_54=12;
    public static final int KEYWORD_18=55;
    public static final int KEYWORD_53=23;
    public static final int KEYWORD_15=52;
    public static final int KEYWORD_52=22;
    public static final int KEYWORD_16=53;
    public static final int KEYWORD_51=21;
    public static final int KEYWORD_13=62;
    public static final int KEYWORD_50=20;
    public static final int KEYWORD_14=63;
    public static final int KEYWORD_11=60;
    public static final int KEYWORD_12=61;
    public static final int EOF=-1;
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
    public static final int KEYWORD_1=64;
    public static final int KEYWORD_30=48;
    public static final int KEYWORD_5=68;
    public static final int KEYWORD_34=28;
    public static final int KEYWORD_4=67;
    public static final int KEYWORD_33=51;
    public static final int KEYWORD_3=66;
    public static final int KEYWORD_32=50;
    public static final int KEYWORD_2=65;
    public static final int KEYWORD_31=49;
    public static final int KEYWORD_38=32;
    public static final int Tokens=77;
    public static final int RULE_SL_COMMENT=70;
    public static final int KEYWORD_37=31;
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
    public static final int RULE_WS=75;
    public static final int KEYWORD_47=17;
    public static final int KEYWORD_46=27;
    public static final int KEYWORD_49=19;
    public static final int KEYWORD_48=18;
    public InternalPlSqlLexer() {;} 
    public InternalPlSqlLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g"; }

    // $ANTLR start KEYWORD_66
    public final void mKEYWORD_66() throws RecognitionException {
        try {
            int _type = KEYWORD_66;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:19:12: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'T' | 't' ) '_' ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:19:14: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'T' | 't' ) '_' ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            match('_'); 
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_66

    // $ANTLR start KEYWORD_65
    public final void mKEYWORD_65() throws RecognitionException {
        try {
            int _type = KEYWORD_65;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:21:12: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'C' | 'c' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:21:14: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'C' | 'c' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_65

    // $ANTLR start KEYWORD_63
    public final void mKEYWORD_63() throws RecognitionException {
        try {
            int _type = KEYWORD_63;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:23:12: ( ( 'C' | 'c' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) '_' ( 'U' | 'u' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:23:14: ( 'C' | 'c' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) '_' ( 'U' | 'u' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            match('_'); 
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_63

    // $ANTLR start KEYWORD_64
    public final void mKEYWORD_64() throws RecognitionException {
        try {
            int _type = KEYWORD_64;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:25:12: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'T' | 't' ) '_' ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'E' | 'e' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:25:14: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'T' | 't' ) '_' ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            match('_'); 
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_64

    // $ANTLR start KEYWORD_59
    public final void mKEYWORD_59() throws RecognitionException {
        try {
            int _type = KEYWORD_59;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:27:12: ( ( 'P' | 'p' ) ( 'I' | 'i' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'D' | 'd' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:27:14: ( 'P' | 'p' ) ( 'I' | 'i' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_59

    // $ANTLR start KEYWORD_60
    public final void mKEYWORD_60() throws RecognitionException {
        try {
            int _type = KEYWORD_60;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:29:12: ( ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:29:14: ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_60

    // $ANTLR start KEYWORD_61
    public final void mKEYWORD_61() throws RecognitionException {
        try {
            int _type = KEYWORD_61;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:31:12: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'S' | 's' ) '_' ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:31:14: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'S' | 's' ) '_' ( 'O' | 'o' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            match('_'); 
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_61

    // $ANTLR start KEYWORD_62
    public final void mKEYWORD_62() throws RecognitionException {
        try {
            int _type = KEYWORD_62;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:33:12: ( ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'P' | 'p' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:33:14: ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'P' | 'p' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_62

    // $ANTLR start KEYWORD_54
    public final void mKEYWORD_54() throws RecognitionException {
        try {
            int _type = KEYWORD_54;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:35:12: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:35:14: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_54

    // $ANTLR start KEYWORD_55
    public final void mKEYWORD_55() throws RecognitionException {
        try {
            int _type = KEYWORD_55;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:37:12: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:37:14: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_55

    // $ANTLR start KEYWORD_56
    public final void mKEYWORD_56() throws RecognitionException {
        try {
            int _type = KEYWORD_56;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:39:12: ( ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:39:14: ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_56

    // $ANTLR start KEYWORD_57
    public final void mKEYWORD_57() throws RecognitionException {
        try {
            int _type = KEYWORD_57;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:41:12: ( ( 'F' | 'f' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:41:14: ( 'F' | 'f' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_57

    // $ANTLR start KEYWORD_58
    public final void mKEYWORD_58() throws RecognitionException {
        try {
            int _type = KEYWORD_58;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:43:12: ( ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'R' | 'r' ) '2' )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:43:14: ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'R' | 'r' ) '2'
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            match('2'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_58

    // $ANTLR start KEYWORD_47
    public final void mKEYWORD_47() throws RecognitionException {
        try {
            int _type = KEYWORD_47;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:45:12: ( ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'N' | 'n' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:45:14: ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_47

    // $ANTLR start KEYWORD_48
    public final void mKEYWORD_48() throws RecognitionException {
        try {
            int _type = KEYWORD_48;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:47:12: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:47:14: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_48

    // $ANTLR start KEYWORD_49
    public final void mKEYWORD_49() throws RecognitionException {
        try {
            int _type = KEYWORD_49;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:49:12: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:49:14: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_49

    // $ANTLR start KEYWORD_50
    public final void mKEYWORD_50() throws RecognitionException {
        try {
            int _type = KEYWORD_50;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:51:12: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'T' | 't' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:51:14: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_50

    // $ANTLR start KEYWORD_51
    public final void mKEYWORD_51() throws RecognitionException {
        try {
            int _type = KEYWORD_51;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:53:12: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:53:14: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_51

    // $ANTLR start KEYWORD_52
    public final void mKEYWORD_52() throws RecognitionException {
        try {
            int _type = KEYWORD_52;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:55:12: ( ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'K' | 'k' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:55:14: ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'K' | 'k' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_52

    // $ANTLR start KEYWORD_53
    public final void mKEYWORD_53() throws RecognitionException {
        try {
            int _type = KEYWORD_53;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:57:12: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:57:14: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_53

    // $ANTLR start KEYWORD_43
    public final void mKEYWORD_43() throws RecognitionException {
        try {
            int _type = KEYWORD_43;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:59:12: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'Y' | 'y' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:59:14: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_43

    // $ANTLR start KEYWORD_44
    public final void mKEYWORD_44() throws RecognitionException {
        try {
            int _type = KEYWORD_44;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:61:12: ( ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:61:14: ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_44

    // $ANTLR start KEYWORD_45
    public final void mKEYWORD_45() throws RecognitionException {
        try {
            int _type = KEYWORD_45;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:63:12: ( ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'M' | 'm' ) ( 'A' | 'a' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:63:14: ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'M' | 'm' ) ( 'A' | 'a' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_45

    // $ANTLR start KEYWORD_46
    public final void mKEYWORD_46() throws RecognitionException {
        try {
            int _type = KEYWORD_46;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:65:12: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'N' | 'n' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:65:14: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_46

    // $ANTLR start KEYWORD_34
    public final void mKEYWORD_34() throws RecognitionException {
        try {
            int _type = KEYWORD_34;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:67:12: ( ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:67:14: ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_34

    // $ANTLR start KEYWORD_35
    public final void mKEYWORD_35() throws RecognitionException {
        try {
            int _type = KEYWORD_35;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:69:12: ( ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:69:14: ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_35

    // $ANTLR start KEYWORD_36
    public final void mKEYWORD_36() throws RecognitionException {
        try {
            int _type = KEYWORD_36;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:71:12: ( ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'F' | 'f' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:71:14: ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_36

    // $ANTLR start KEYWORD_37
    public final void mKEYWORD_37() throws RecognitionException {
        try {
            int _type = KEYWORD_37;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:73:12: ( ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:73:14: ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_37

    // $ANTLR start KEYWORD_38
    public final void mKEYWORD_38() throws RecognitionException {
        try {
            int _type = KEYWORD_38;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:75:12: ( ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:75:14: ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_38

    // $ANTLR start KEYWORD_39
    public final void mKEYWORD_39() throws RecognitionException {
        try {
            int _type = KEYWORD_39;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:77:12: ( ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'T' | 't' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:77:14: ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_39

    // $ANTLR start KEYWORD_40
    public final void mKEYWORD_40() throws RecognitionException {
        try {
            int _type = KEYWORD_40;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:79:12: ( ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:79:14: ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_40

    // $ANTLR start KEYWORD_41
    public final void mKEYWORD_41() throws RecognitionException {
        try {
            int _type = KEYWORD_41;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:81:12: ( ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'S' | 's' ) ( 'T' | 't' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:81:14: ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'S' | 's' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_41

    // $ANTLR start KEYWORD_42
    public final void mKEYWORD_42() throws RecognitionException {
        try {
            int _type = KEYWORD_42;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:83:12: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:83:14: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_42

    // $ANTLR start KEYWORD_19
    public final void mKEYWORD_19() throws RecognitionException {
        try {
            int _type = KEYWORD_19;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:85:12: ( ( 'B' | 'b' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'K' | 'k' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:85:14: ( 'B' | 'b' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'K' | 'k' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_19

    // $ANTLR start KEYWORD_20
    public final void mKEYWORD_20() throws RecognitionException {
        try {
            int _type = KEYWORD_20;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:87:12: ( ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:87:14: ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_20

    // $ANTLR start KEYWORD_21
    public final void mKEYWORD_21() throws RecognitionException {
        try {
            int _type = KEYWORD_21;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:89:12: ( ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:89:14: ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_21

    // $ANTLR start KEYWORD_22
    public final void mKEYWORD_22() throws RecognitionException {
        try {
            int _type = KEYWORD_22;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:91:12: ( ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'I' | 'i' ) ( 'T' | 't' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:91:14: ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'I' | 'i' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_22

    // $ANTLR start KEYWORD_23
    public final void mKEYWORD_23() throws RecognitionException {
        try {
            int _type = KEYWORD_23;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:93:12: ( ( 'G' | 'g' ) ( 'O' | 'o' ) ( 'T' | 't' ) ( 'O' | 'o' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:93:14: ( 'G' | 'g' ) ( 'O' | 'o' ) ( 'T' | 't' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_23

    // $ANTLR start KEYWORD_24
    public final void mKEYWORD_24() throws RecognitionException {
        try {
            int _type = KEYWORD_24;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:95:12: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:95:14: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_24

    // $ANTLR start KEYWORD_25
    public final void mKEYWORD_25() throws RecognitionException {
        try {
            int _type = KEYWORD_25;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:97:12: ( ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'O' | 'o' ) ( 'P' | 'p' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:97:14: ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'O' | 'o' ) ( 'P' | 'p' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_25

    // $ANTLR start KEYWORD_26
    public final void mKEYWORD_26() throws RecognitionException {
        try {
            int _type = KEYWORD_26;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:99:12: ( ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:99:14: ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_26

    // $ANTLR start KEYWORD_27
    public final void mKEYWORD_27() throws RecognitionException {
        try {
            int _type = KEYWORD_27;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:101:12: ( ( 'R' | 'r' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'S' | 's' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:101:14: ( 'R' | 'r' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_27

    // $ANTLR start KEYWORD_28
    public final void mKEYWORD_28() throws RecognitionException {
        try {
            int _type = KEYWORD_28;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:103:12: ( ( 'R' | 'r' ) ( 'N' | 'n' ) ( 'P' | 'p' ) ( 'S' | 's' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:103:14: ( 'R' | 'r' ) ( 'N' | 'n' ) ( 'P' | 'p' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_28

    // $ANTLR start KEYWORD_29
    public final void mKEYWORD_29() throws RecognitionException {
        try {
            int _type = KEYWORD_29;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:105:12: ( ( 'T' | 't' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' | 'n' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:105:14: ( 'T' | 't' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_29

    // $ANTLR start KEYWORD_30
    public final void mKEYWORD_30() throws RecognitionException {
        try {
            int _type = KEYWORD_30;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:107:12: ( ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:107:14: ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_30

    // $ANTLR start KEYWORD_31
    public final void mKEYWORD_31() throws RecognitionException {
        try {
            int _type = KEYWORD_31;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:109:12: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' | 'n' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:109:14: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_31

    // $ANTLR start KEYWORD_32
    public final void mKEYWORD_32() throws RecognitionException {
        try {
            int _type = KEYWORD_32;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:111:12: ( ( 'W' | 'w' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'S' | 's' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:111:14: ( 'W' | 'w' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_32

    // $ANTLR start KEYWORD_33
    public final void mKEYWORD_33() throws RecognitionException {
        try {
            int _type = KEYWORD_33;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:113:12: ( ( 'W' | 'w' ) ( 'N' | 'n' ) ( 'P' | 'p' ) ( 'S' | 's' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:113:14: ( 'W' | 'w' ) ( 'N' | 'n' ) ( 'P' | 'p' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_33

    // $ANTLR start KEYWORD_15
    public final void mKEYWORD_15() throws RecognitionException {
        try {
            int _type = KEYWORD_15;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:115:12: ( ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:115:14: ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_15

    // $ANTLR start KEYWORD_16
    public final void mKEYWORD_16() throws RecognitionException {
        try {
            int _type = KEYWORD_16;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:117:12: ( ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:117:14: ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_16

    // $ANTLR start KEYWORD_17
    public final void mKEYWORD_17() throws RecognitionException {
        try {
            int _type = KEYWORD_17;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:119:12: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:119:14: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_17

    // $ANTLR start KEYWORD_18
    public final void mKEYWORD_18() throws RecognitionException {
        try {
            int _type = KEYWORD_18;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:121:12: ( ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'T' | 't' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:121:14: ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_18

    // $ANTLR start KEYWORD_7
    public final void mKEYWORD_7() throws RecognitionException {
        try {
            int _type = KEYWORD_7;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:123:11: ( '.' '.' )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:123:13: '.' '.'
            {
            match('.'); 
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_7

    // $ANTLR start KEYWORD_8
    public final void mKEYWORD_8() throws RecognitionException {
        try {
            int _type = KEYWORD_8;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:125:11: ( ':' '=' )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:125:13: ':' '='
            {
            match(':'); 
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_8

    // $ANTLR start KEYWORD_9
    public final void mKEYWORD_9() throws RecognitionException {
        try {
            int _type = KEYWORD_9;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:127:11: ( '<' '<' )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:127:13: '<' '<'
            {
            match('<'); 
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_9

    // $ANTLR start KEYWORD_10
    public final void mKEYWORD_10() throws RecognitionException {
        try {
            int _type = KEYWORD_10;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:129:12: ( '>' '>' )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:129:14: '>' '>'
            {
            match('>'); 
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_10

    // $ANTLR start KEYWORD_11
    public final void mKEYWORD_11() throws RecognitionException {
        try {
            int _type = KEYWORD_11;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:131:12: ( ( 'A' | 'a' ) ( 'S' | 's' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:131:14: ( 'A' | 'a' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_11

    // $ANTLR start KEYWORD_12
    public final void mKEYWORD_12() throws RecognitionException {
        try {
            int _type = KEYWORD_12;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:133:12: ( ( 'I' | 'i' ) ( 'F' | 'f' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:133:14: ( 'I' | 'i' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_12

    // $ANTLR start KEYWORD_13
    public final void mKEYWORD_13() throws RecognitionException {
        try {
            int _type = KEYWORD_13;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:135:12: ( ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:135:14: ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_13

    // $ANTLR start KEYWORD_14
    public final void mKEYWORD_14() throws RecognitionException {
        try {
            int _type = KEYWORD_14;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:137:12: ( ( 'I' | 'i' ) ( 'S' | 's' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:137:14: ( 'I' | 'i' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_14

    // $ANTLR start KEYWORD_1
    public final void mKEYWORD_1() throws RecognitionException {
        try {
            int _type = KEYWORD_1;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:139:11: ( '(' )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:139:13: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_1

    // $ANTLR start KEYWORD_2
    public final void mKEYWORD_2() throws RecognitionException {
        try {
            int _type = KEYWORD_2;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:141:11: ( ')' )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:141:13: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_2

    // $ANTLR start KEYWORD_3
    public final void mKEYWORD_3() throws RecognitionException {
        try {
            int _type = KEYWORD_3;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:143:11: ( ',' )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:143:13: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_3

    // $ANTLR start KEYWORD_4
    public final void mKEYWORD_4() throws RecognitionException {
        try {
            int _type = KEYWORD_4;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:145:11: ( '.' )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:145:13: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_4

    // $ANTLR start KEYWORD_5
    public final void mKEYWORD_5() throws RecognitionException {
        try {
            int _type = KEYWORD_5;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:147:11: ( ':' )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:147:13: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_5

    // $ANTLR start KEYWORD_6
    public final void mKEYWORD_6() throws RecognitionException {
        try {
            int _type = KEYWORD_6;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:149:11: ( ';' )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:149:13: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_6

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:153:17: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:153:19: '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:153:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:153:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:153:40: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:153:41: ( '\\r' )? '\\n'
                    {
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:153:41: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:153:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:155:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:155:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:155:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:155:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:155:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:157:10: ( ( '0' .. '9' )+ )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:157:12: ( '0' .. '9' )+
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:157:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:157:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:159:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:159:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:159:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("159:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:159:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:159:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFE')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:159:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:159:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:159:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:159:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFE')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:159:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:159:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:161:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:161:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:161:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFE')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:161:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:163:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:163:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:163:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:165:16: ( . )
            // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:165:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:8: ( KEYWORD_66 | KEYWORD_65 | KEYWORD_63 | KEYWORD_64 | KEYWORD_59 | KEYWORD_60 | KEYWORD_61 | KEYWORD_62 | KEYWORD_54 | KEYWORD_55 | KEYWORD_56 | KEYWORD_57 | KEYWORD_58 | KEYWORD_47 | KEYWORD_48 | KEYWORD_49 | KEYWORD_50 | KEYWORD_51 | KEYWORD_52 | KEYWORD_53 | KEYWORD_43 | KEYWORD_44 | KEYWORD_45 | KEYWORD_46 | KEYWORD_34 | KEYWORD_35 | KEYWORD_36 | KEYWORD_37 | KEYWORD_38 | KEYWORD_39 | KEYWORD_40 | KEYWORD_41 | KEYWORD_42 | KEYWORD_19 | KEYWORD_20 | KEYWORD_21 | KEYWORD_22 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | KEYWORD_26 | KEYWORD_27 | KEYWORD_28 | KEYWORD_29 | KEYWORD_30 | KEYWORD_31 | KEYWORD_32 | KEYWORD_33 | KEYWORD_15 | KEYWORD_16 | KEYWORD_17 | KEYWORD_18 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=73;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='R'||LA12_0=='r') ) {
            switch ( input.LA(2) ) {
            case 'E':
            case 'e':
                {
                switch ( input.LA(3) ) {
                case 'S':
                case 's':
                    {
                    switch ( input.LA(4) ) {
                    case 'T':
                    case 't':
                        {
                        int LA12_138 = input.LA(5);

                        if ( (LA12_138=='R'||LA12_138=='r') ) {
                            int LA12_190 = input.LA(6);

                            if ( (LA12_190=='I'||LA12_190=='i') ) {
                                int LA12_238 = input.LA(7);

                                if ( (LA12_238=='C'||LA12_238=='c') ) {
                                    int LA12_271 = input.LA(8);

                                    if ( (LA12_271=='T'||LA12_271=='t') ) {
                                        int LA12_295 = input.LA(9);

                                        if ( (LA12_295=='_') ) {
                                            int LA12_315 = input.LA(10);

                                            if ( (LA12_315=='R'||LA12_315=='r') ) {
                                                int LA12_328 = input.LA(11);

                                                if ( (LA12_328=='E'||LA12_328=='e') ) {
                                                    int LA12_336 = input.LA(12);

                                                    if ( (LA12_336=='F'||LA12_336=='f') ) {
                                                        int LA12_340 = input.LA(13);

                                                        if ( (LA12_340=='E'||LA12_340=='e') ) {
                                                            int LA12_344 = input.LA(14);

                                                            if ( (LA12_344=='R'||LA12_344=='r') ) {
                                                                int LA12_348 = input.LA(15);

                                                                if ( (LA12_348=='E'||LA12_348=='e') ) {
                                                                    int LA12_350 = input.LA(16);

                                                                    if ( (LA12_350=='N'||LA12_350=='n') ) {
                                                                        int LA12_351 = input.LA(17);

                                                                        if ( (LA12_351=='C'||LA12_351=='c') ) {
                                                                            int LA12_352 = input.LA(18);

                                                                            if ( (LA12_352=='E'||LA12_352=='e') ) {
                                                                                int LA12_353 = input.LA(19);

                                                                                if ( (LA12_353=='S'||LA12_353=='s') ) {
                                                                                    int LA12_354 = input.LA(20);

                                                                                    if ( ((LA12_354>='0' && LA12_354<='9')||(LA12_354>='A' && LA12_354<='Z')||LA12_354=='_'||(LA12_354>='a' && LA12_354<='z')) ) {
                                                                                        alt12=68;
                                                                                    }
                                                                                    else {
                                                                                        alt12=1;}
                                                                                }
                                                                                else {
                                                                                    alt12=68;}
                                                                            }
                                                                            else {
                                                                                alt12=68;}
                                                                        }
                                                                        else {
                                                                            alt12=68;}
                                                                    }
                                                                    else {
                                                                        alt12=68;}
                                                                }
                                                                else {
                                                                    alt12=68;}
                                                            }
                                                            else {
                                                                alt12=68;}
                                                        }
                                                        else {
                                                            alt12=68;}
                                                    }
                                                    else {
                                                        alt12=68;}
                                                }
                                                else {
                                                    alt12=68;}
                                            }
                                            else {
                                                alt12=68;}
                                        }
                                        else {
                                            alt12=68;}
                                    }
                                    else {
                                        alt12=68;}
                                }
                                else {
                                    alt12=68;}
                            }
                            else {
                                alt12=68;}
                        }
                        else {
                            alt12=68;}
                        }
                        break;
                    case 'U':
                    case 'u':
                        {
                        int LA12_139 = input.LA(5);

                        if ( (LA12_139=='L'||LA12_139=='l') ) {
                            int LA12_191 = input.LA(6);

                            if ( (LA12_191=='T'||LA12_191=='t') ) {
                                int LA12_239 = input.LA(7);

                                if ( (LA12_239=='_') ) {
                                    int LA12_272 = input.LA(8);

                                    if ( (LA12_272=='C'||LA12_272=='c') ) {
                                        int LA12_296 = input.LA(9);

                                        if ( (LA12_296=='A'||LA12_296=='a') ) {
                                            int LA12_316 = input.LA(10);

                                            if ( (LA12_316=='C'||LA12_316=='c') ) {
                                                int LA12_329 = input.LA(11);

                                                if ( (LA12_329=='H'||LA12_329=='h') ) {
                                                    int LA12_337 = input.LA(12);

                                                    if ( (LA12_337=='E'||LA12_337=='e') ) {
                                                        int LA12_341 = input.LA(13);

                                                        if ( ((LA12_341>='0' && LA12_341<='9')||(LA12_341>='A' && LA12_341<='Z')||LA12_341=='_'||(LA12_341>='a' && LA12_341<='z')) ) {
                                                            alt12=68;
                                                        }
                                                        else {
                                                            alt12=4;}
                                                    }
                                                    else {
                                                        alt12=68;}
                                                }
                                                else {
                                                    alt12=68;}
                                            }
                                            else {
                                                alt12=68;}
                                        }
                                        else {
                                            alt12=68;}
                                    }
                                    else {
                                        alt12=68;}
                                }
                                else {
                                    alt12=68;}
                            }
                            else {
                                alt12=68;}
                        }
                        else {
                            alt12=68;}
                        }
                        break;
                    default:
                        alt12=68;}

                    }
                    break;
                case 'L':
                case 'l':
                    {
                    int LA12_88 = input.LA(4);

                    if ( (LA12_88=='I'||LA12_88=='i') ) {
                        int LA12_140 = input.LA(5);

                        if ( (LA12_140=='E'||LA12_140=='e') ) {
                            int LA12_192 = input.LA(6);

                            if ( (LA12_192=='S'||LA12_192=='s') ) {
                                int LA12_240 = input.LA(7);

                                if ( (LA12_240=='_') ) {
                                    int LA12_273 = input.LA(8);

                                    if ( (LA12_273=='O'||LA12_273=='o') ) {
                                        int LA12_297 = input.LA(9);

                                        if ( (LA12_297=='N'||LA12_297=='n') ) {
                                            int LA12_317 = input.LA(10);

                                            if ( ((LA12_317>='0' && LA12_317<='9')||(LA12_317>='A' && LA12_317<='Z')||LA12_317=='_'||(LA12_317>='a' && LA12_317<='z')) ) {
                                                alt12=68;
                                            }
                                            else {
                                                alt12=7;}
                                        }
                                        else {
                                            alt12=68;}
                                    }
                                    else {
                                        alt12=68;}
                                }
                                else {
                                    alt12=68;}
                            }
                            else {
                                alt12=68;}
                        }
                        else {
                            alt12=68;}
                    }
                    else {
                        alt12=68;}
                    }
                    break;
                case 'V':
                case 'v':
                    {
                    int LA12_89 = input.LA(4);

                    if ( (LA12_89=='E'||LA12_89=='e') ) {
                        int LA12_141 = input.LA(5);

                        if ( (LA12_141=='R'||LA12_141=='r') ) {
                            int LA12_193 = input.LA(6);

                            if ( (LA12_193=='S'||LA12_193=='s') ) {
                                int LA12_241 = input.LA(7);

                                if ( (LA12_241=='E'||LA12_241=='e') ) {
                                    int LA12_274 = input.LA(8);

                                    if ( ((LA12_274>='0' && LA12_274<='9')||(LA12_274>='A' && LA12_274<='Z')||LA12_274=='_'||(LA12_274>='a' && LA12_274<='z')) ) {
                                        alt12=68;
                                    }
                                    else {
                                        alt12=20;}
                                }
                                else {
                                    alt12=68;}
                            }
                            else {
                                alt12=68;}
                        }
                        else {
                            alt12=68;}
                    }
                    else {
                        alt12=68;}
                    }
                    break;
                case 'T':
                case 't':
                    {
                    int LA12_90 = input.LA(4);

                    if ( (LA12_90=='U'||LA12_90=='u') ) {
                        int LA12_142 = input.LA(5);

                        if ( (LA12_142=='R'||LA12_142=='r') ) {
                            int LA12_194 = input.LA(6);

                            if ( (LA12_194=='N'||LA12_194=='n') ) {
                                int LA12_242 = input.LA(7);

                                if ( ((LA12_242>='0' && LA12_242<='9')||(LA12_242>='A' && LA12_242<='Z')||LA12_242=='_'||(LA12_242>='a' && LA12_242<='z')) ) {
                                    alt12=68;
                                }
                                else {
                                    alt12=24;}
                            }
                            else {
                                alt12=68;}
                        }
                        else {
                            alt12=68;}
                    }
                    else {
                        alt12=68;}
                    }
                    break;
                default:
                    alt12=68;}

                }
                break;
            case 'A':
            case 'a':
                {
                int LA12_35 = input.LA(3);

                if ( (LA12_35=='I'||LA12_35=='i') ) {
                    int LA12_91 = input.LA(4);

                    if ( (LA12_91=='S'||LA12_91=='s') ) {
                        int LA12_143 = input.LA(5);

                        if ( (LA12_143=='E'||LA12_143=='e') ) {
                            int LA12_195 = input.LA(6);

                            if ( ((LA12_195>='0' && LA12_195<='9')||(LA12_195>='A' && LA12_195<='Z')||LA12_195=='_'||(LA12_195>='a' && LA12_195<='z')) ) {
                                alt12=68;
                            }
                            else {
                                alt12=31;}
                        }
                        else {
                            alt12=68;}
                    }
                    else {
                        alt12=68;}
                }
                else {
                    alt12=68;}
                }
                break;
            case 'N':
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 'P':
                case 'p':
                    {
                    int LA12_92 = input.LA(4);

                    if ( (LA12_92=='S'||LA12_92=='s') ) {
                        int LA12_144 = input.LA(5);

                        if ( ((LA12_144>='0' && LA12_144<='9')||(LA12_144>='A' && LA12_144<='Z')||LA12_144=='_'||(LA12_144>='a' && LA12_144<='z')) ) {
                            alt12=68;
                        }
                        else {
                            alt12=43;}
                    }
                    else {
                        alt12=68;}
                    }
                    break;
                case 'D':
                case 'd':
                    {
                    int LA12_93 = input.LA(4);

                    if ( (LA12_93=='S'||LA12_93=='s') ) {
                        int LA12_145 = input.LA(5);

                        if ( ((LA12_145>='0' && LA12_145<='9')||(LA12_145>='A' && LA12_145<='Z')||LA12_145=='_'||(LA12_145>='a' && LA12_145<='z')) ) {
                            alt12=68;
                        }
                        else {
                            alt12=42;}
                    }
                    else {
                        alt12=68;}
                    }
                    break;
                default:
                    alt12=68;}

                }
                break;
            default:
                alt12=68;}

        }
        else if ( (LA12_0=='D'||LA12_0=='d') ) {
            int LA12_2 = input.LA(2);

            if ( (LA12_2=='E'||LA12_2=='e') ) {
                switch ( input.LA(3) ) {
                case 'F':
                case 'f':
                    {
                    switch ( input.LA(4) ) {
                    case 'A':
                    case 'a':
                        {
                        int LA12_146 = input.LA(5);

                        if ( (LA12_146=='U'||LA12_146=='u') ) {
                            int LA12_198 = input.LA(6);

                            if ( (LA12_198=='L'||LA12_198=='l') ) {
                                int LA12_244 = input.LA(7);

                                if ( (LA12_244=='T'||LA12_244=='t') ) {
                                    int LA12_276 = input.LA(8);

                                    if ( ((LA12_276>='0' && LA12_276<='9')||(LA12_276>='A' && LA12_276<='Z')||LA12_276=='_'||(LA12_276>='a' && LA12_276<='z')) ) {
                                        alt12=68;
                                    }
                                    else {
                                        alt12=17;}
                                }
                                else {
                                    alt12=68;}
                            }
                            else {
                                alt12=68;}
                        }
                        else {
                            alt12=68;}
                        }
                        break;
                    case 'I':
                    case 'i':
                        {
                        int LA12_147 = input.LA(5);

                        if ( (LA12_147=='N'||LA12_147=='n') ) {
                            int LA12_199 = input.LA(6);

                            if ( (LA12_199=='E'||LA12_199=='e') ) {
                                int LA12_245 = input.LA(7);

                                if ( (LA12_245=='R'||LA12_245=='r') ) {
                                    int LA12_277 = input.LA(8);

                                    if ( ((LA12_277>='0' && LA12_277<='9')||(LA12_277>='A' && LA12_277<='Z')||LA12_277=='_'||(LA12_277>='a' && LA12_277<='z')) ) {
                                        alt12=68;
                                    }
                                    else {
                                        alt12=18;}
                                }
                                else {
                                    alt12=68;}
                            }
                            else {
                                alt12=68;}
                        }
                        else {
                            alt12=68;}
                        }
                        break;
                    default:
                        alt12=68;}

                    }
                    break;
                case 'T':
                case 't':
                    {
                    int LA12_95 = input.LA(4);

                    if ( (LA12_95=='E'||LA12_95=='e') ) {
                        int LA12_148 = input.LA(5);

                        if ( (LA12_148=='R'||LA12_148=='r') ) {
                            int LA12_200 = input.LA(6);

                            if ( (LA12_200=='M'||LA12_200=='m') ) {
                                int LA12_246 = input.LA(7);

                                if ( (LA12_246=='I'||LA12_246=='i') ) {
                                    int LA12_278 = input.LA(8);

                                    if ( (LA12_278=='N'||LA12_278=='n') ) {
                                        int LA12_301 = input.LA(9);

                                        if ( (LA12_301=='I'||LA12_301=='i') ) {
                                            int LA12_318 = input.LA(10);

                                            if ( (LA12_318=='S'||LA12_318=='s') ) {
                                                int LA12_331 = input.LA(11);

                                                if ( (LA12_331=='T'||LA12_331=='t') ) {
                                                    int LA12_338 = input.LA(12);

                                                    if ( (LA12_338=='I'||LA12_338=='i') ) {
                                                        int LA12_342 = input.LA(13);

                                                        if ( (LA12_342=='C'||LA12_342=='c') ) {
                                                            int LA12_346 = input.LA(14);

                                                            if ( ((LA12_346>='0' && LA12_346<='9')||(LA12_346>='A' && LA12_346<='Z')||LA12_346=='_'||(LA12_346>='a' && LA12_346<='z')) ) {
                                                                alt12=68;
                                                            }
                                                            else {
                                                                alt12=2;}
                                                        }
                                                        else {
                                                            alt12=68;}
                                                    }
                                                    else {
                                                        alt12=68;}
                                                }
                                                else {
                                                    alt12=68;}
                                            }
                                            else {
                                                alt12=68;}
                                        }
                                        else {
                                            alt12=68;}
                                    }
                                    else {
                                        alt12=68;}
                                }
                                else {
                                    alt12=68;}
                            }
                            else {
                                alt12=68;}
                        }
                        else {
                            alt12=68;}
                    }
                    else {
                        alt12=68;}
                    }
                    break;
                case 'C':
                case 'c':
                    {
                    int LA12_96 = input.LA(4);

                    if ( (LA12_96=='L'||LA12_96=='l') ) {
                        int LA12_149 = input.LA(5);

                        if ( (LA12_149=='A'||LA12_149=='a') ) {
                            int LA12_201 = input.LA(6);

                            if ( (LA12_201=='R'||LA12_201=='r') ) {
                                int LA12_247 = input.LA(7);

                                if ( (LA12_247=='E'||LA12_247=='e') ) {
                                    int LA12_279 = input.LA(8);

                                    if ( ((LA12_279>='0' && LA12_279<='9')||(LA12_279>='A' && LA12_279<='Z')||LA12_279=='_'||(LA12_279>='a' && LA12_279<='z')) ) {
                                        alt12=68;
                                    }
                                    else {
                                        alt12=16;}
                                }
                                else {
                                    alt12=68;}
                            }
                            else {
                                alt12=68;}
                        }
                        else {
                            alt12=68;}
                    }
                    else {
                        alt12=68;}
                    }
                    break;
                default:
                    alt12=68;}

            }
            else {
                alt12=68;}
        }
        else if ( (LA12_0=='C'||LA12_0=='c') ) {
            switch ( input.LA(2) ) {
            case 'U':
            case 'u':
                {
                int LA12_39 = input.LA(3);

                if ( (LA12_39=='R'||LA12_39=='r') ) {
                    int LA12_97 = input.LA(4);

                    if ( (LA12_97=='R'||LA12_97=='r') ) {
                        int LA12_150 = input.LA(5);

                        if ( (LA12_150=='E'||LA12_150=='e') ) {
                            int LA12_202 = input.LA(6);

                            if ( (LA12_202=='N'||LA12_202=='n') ) {
                                int LA12_248 = input.LA(7);

                                if ( (LA12_248=='T'||LA12_248=='t') ) {
                                    int LA12_280 = input.LA(8);

                                    if ( (LA12_280=='_') ) {
                                        int LA12_303 = input.LA(9);

                                        if ( (LA12_303=='U'||LA12_303=='u') ) {
                                            int LA12_319 = input.LA(10);

                                            if ( (LA12_319=='S'||LA12_319=='s') ) {
                                                int LA12_332 = input.LA(11);

                                                if ( (LA12_332=='E'||LA12_332=='e') ) {
                                                    int LA12_339 = input.LA(12);

                                                    if ( (LA12_339=='R'||LA12_339=='r') ) {
                                                        int LA12_343 = input.LA(13);

                                                        if ( ((LA12_343>='0' && LA12_343<='9')||(LA12_343>='A' && LA12_343<='Z')||LA12_343=='_'||(LA12_343>='a' && LA12_343<='z')) ) {
                                                            alt12=68;
                                                        }
                                                        else {
                                                            alt12=3;}
                                                    }
                                                    else {
                                                        alt12=68;}
                                                }
                                                else {
                                                    alt12=68;}
                                            }
                                            else {
                                                alt12=68;}
                                        }
                                        else {
                                            alt12=68;}
                                    }
                                    else {
                                        alt12=68;}
                                }
                                else {
                                    alt12=68;}
                            }
                            else {
                                alt12=68;}
                        }
                        else {
                            alt12=68;}
                    }
                    else {
                        alt12=68;}
                }
                else {
                    alt12=68;}
                }
                break;
            case 'L':
            case 'l':
                {
                int LA12_40 = input.LA(3);

                if ( (LA12_40=='O'||LA12_40=='o') ) {
                    int LA12_98 = input.LA(4);

                    if ( (LA12_98=='S'||LA12_98=='s') ) {
                        int LA12_151 = input.LA(5);

                        if ( (LA12_151=='E'||LA12_151=='e') ) {
                            int LA12_203 = input.LA(6);

                            if ( ((LA12_203>='0' && LA12_203<='9')||(LA12_203>='A' && LA12_203<='Z')||LA12_203=='_'||(LA12_203>='a' && LA12_203<='z')) ) {
                                alt12=68;
                            }
                            else {
                                alt12=26;}
                        }
                        else {
                            alt12=68;}
                    }
                    else {
                        alt12=68;}
                }
                else {
                    alt12=68;}
                }
                break;
            case 'O':
            case 'o':
                {
                switch ( input.LA(3) ) {
                case 'N':
                case 'n':
                    {
                    switch ( input.LA(4) ) {
                    case 'T':
                    case 't':
                        {
                        int LA12_152 = input.LA(5);

                        if ( (LA12_152=='I'||LA12_152=='i') ) {
                            int LA12_204 = input.LA(6);

                            if ( (LA12_204=='N'||LA12_204=='n') ) {
                                int LA12_250 = input.LA(7);

                                if ( (LA12_250=='U'||LA12_250=='u') ) {
                                    int LA12_281 = input.LA(8);

                                    if ( (LA12_281=='E'||LA12_281=='e') ) {
                                        int LA12_304 = input.LA(9);

                                        if ( ((LA12_304>='0' && LA12_304<='9')||(LA12_304>='A' && LA12_304<='Z')||LA12_304=='_'||(LA12_304>='a' && LA12_304<='z')) ) {
                                            alt12=68;
                                        }
                                        else {
                                            alt12=10;}
                                    }
                                    else {
                                        alt12=68;}
                                }
                                else {
                                    alt12=68;}
                            }
                            else {
                                alt12=68;}
                        }
                        else {
                            alt12=68;}
                        }
                        break;
                    case 'S':
                    case 's':
                        {
                        int LA12_153 = input.LA(5);

                        if ( (LA12_153=='T'||LA12_153=='t') ) {
                            int LA12_205 = input.LA(6);

                            if ( (LA12_205=='A'||LA12_205=='a') ) {
                                int LA12_251 = input.LA(7);

                                if ( (LA12_251=='N'||LA12_251=='n') ) {
                                    int LA12_282 = input.LA(8);

                                    if ( (LA12_282=='T'||LA12_282=='t') ) {
                                        int LA12_305 = input.LA(9);

                                        if ( ((LA12_305>='0' && LA12_305<='9')||(LA12_305>='A' && LA12_305<='Z')||LA12_305=='_'||(LA12_305>='a' && LA12_305<='z')) ) {
                                            alt12=68;
                                        }
                                        else {
                                            alt12=9;}
                                    }
                                    else {
                                        alt12=68;}
                                }
                                else {
                                    alt12=68;}
                            }
                            else {
                                alt12=68;}
                        }
                        else {
                            alt12=68;}
                        }
                        break;
                    default:
                        alt12=68;}

                    }
                    break;
                case 'L':
                case 'l':
                    {
                    int LA12_100 = input.LA(4);

                    if ( (LA12_100=='L'||LA12_100=='l') ) {
                        int LA12_154 = input.LA(5);

                        if ( (LA12_154=='E'||LA12_154=='e') ) {
                            int LA12_206 = input.LA(6);

                            if ( (LA12_206=='C'||LA12_206=='c') ) {
                                int LA12_252 = input.LA(7);

                                if ( (LA12_252=='T'||LA12_252=='t') ) {
                                    int LA12_283 = input.LA(8);

                                    if ( ((LA12_283>='0' && LA12_283<='9')||(LA12_283>='A' && LA12_283<='Z')||LA12_283=='_'||(LA12_283>='a' && LA12_283<='z')) ) {
                                        alt12=68;
                                    }
                                    else {
                                        alt12=15;}
                                }
                                else {
                                    alt12=68;}
                            }
                            else {
                                alt12=68;}
                        }
                        else {
                            alt12=68;}
                    }
                    else {
                        alt12=68;}
                    }
                    break;
                default:
                    alt12=68;}

                }
                break;
            case 'A':
            case 'a':
                {
                int LA12_42 = input.LA(3);

                if ( (LA12_42=='S'||LA12_42=='s') ) {
                    int LA12_101 = input.LA(4);

                    if ( (LA12_101=='E'||LA12_101=='e') ) {
                        int LA12_155 = input.LA(5);

                        if ( ((LA12_155>='0' && LA12_155<='9')||(LA12_155>='A' && LA12_155<='Z')||LA12_155=='_'||(LA12_155>='a' && LA12_155<='z')) ) {
                            alt12=68;
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=68;}
                }
                else {
                    alt12=68;}
                }
                break;
            default:
                alt12=68;}

        }
        else if ( (LA12_0=='P'||LA12_0=='p') ) {
            switch ( input.LA(2) ) {
            case 'R':
            case 'r':
                {
                switch ( input.LA(3) ) {
                case 'A':
                case 'a':
                    {
                    int LA12_102 = input.LA(4);

                    if ( (LA12_102=='G'||LA12_102=='g') ) {
                        int LA12_156 = input.LA(5);

                        if ( (LA12_156=='M'||LA12_156=='m') ) {
                            int LA12_208 = input.LA(6);

                            if ( (LA12_208=='A'||LA12_208=='a') ) {
                                int LA12_253 = input.LA(7);

                                if ( ((LA12_253>='0' && LA12_253<='9')||(LA12_253>='A' && LA12_253<='Z')||LA12_253=='_'||(LA12_253>='a' && LA12_253<='z')) ) {
                                    alt12=68;
                                }
                                else {
                                    alt12=23;}
                            }
                            else {
                                alt12=68;}
                        }
                        else {
                            alt12=68;}
                    }
                    else {
                        alt12=68;}
                    }
                    break;
                case 'O':
                case 'o':
                    {
                    int LA12_103 = input.LA(4);

                    if ( (LA12_103=='C'||LA12_103=='c') ) {
                        int LA12_157 = input.LA(5);

                        if ( (LA12_157=='E'||LA12_157=='e') ) {
                            int LA12_209 = input.LA(6);

                            if ( (LA12_209=='D'||LA12_209=='d') ) {
                                int LA12_254 = input.LA(7);

                                if ( (LA12_254=='U'||LA12_254=='u') ) {
                                    int LA12_285 = input.LA(8);

                                    if ( (LA12_285=='R'||LA12_285=='r') ) {
                                        int LA12_307 = input.LA(9);

                                        if ( (LA12_307=='E'||LA12_307=='e') ) {
                                            int LA12_322 = input.LA(10);

                                            if ( ((LA12_322>='0' && LA12_322<='9')||(LA12_322>='A' && LA12_322<='Z')||LA12_322=='_'||(LA12_322>='a' && LA12_322<='z')) ) {
                                                alt12=68;
                                            }
                                            else {
                                                alt12=6;}
                                        }
                                        else {
                                            alt12=68;}
                                    }
                                    else {
                                        alt12=68;}
                                }
                                else {
                                    alt12=68;}
                            }
                            else {
                                alt12=68;}
                        }
                        else {
                            alt12=68;}
                    }
                    else {
                        alt12=68;}
                    }
                    break;
                default:
                    alt12=68;}

                }
                break;
            case 'A':
            case 'a':
                {
                int LA12_44 = input.LA(3);

                if ( (LA12_44=='C'||LA12_44=='c') ) {
                    int LA12_104 = input.LA(4);

                    if ( (LA12_104=='K'||LA12_104=='k') ) {
                        int LA12_158 = input.LA(5);

                        if ( (LA12_158=='A'||LA12_158=='a') ) {
                            int LA12_210 = input.LA(6);

                            if ( (LA12_210=='G'||LA12_210=='g') ) {
                                int LA12_255 = input.LA(7);

                                if ( (LA12_255=='E'||LA12_255=='e') ) {
                                    int LA12_286 = input.LA(8);

                                    if ( ((LA12_286>='0' && LA12_286<='9')||(LA12_286>='A' && LA12_286<='Z')||LA12_286=='_'||(LA12_286>='a' && LA12_286<='z')) ) {
                                        alt12=68;
                                    }
                                    else {
                                        alt12=19;}
                                }
                                else {
                                    alt12=68;}
                            }
                            else {
                                alt12=68;}
                        }
                        else {
                            alt12=68;}
                    }
                    else {
                        alt12=68;}
                }
                else {
                    alt12=68;}
                }
                break;
            case 'I':
            case 'i':
                {
                int LA12_45 = input.LA(3);

                if ( (LA12_45=='P'||LA12_45=='p') ) {
                    int LA12_105 = input.LA(4);

                    if ( (LA12_105=='E'||LA12_105=='e') ) {
                        int LA12_159 = input.LA(5);

                        if ( (LA12_159=='L'||LA12_159=='l') ) {
                            int LA12_211 = input.LA(6);

                            if ( (LA12_211=='I'||LA12_211=='i') ) {
                                int LA12_256 = input.LA(7);

                                if ( (LA12_256=='N'||LA12_256=='n') ) {
                                    int LA12_287 = input.LA(8);

                                    if ( (LA12_287=='E'||LA12_287=='e') ) {
                                        int LA12_309 = input.LA(9);

                                        if ( (LA12_309=='D'||LA12_309=='d') ) {
                                            int LA12_323 = input.LA(10);

                                            if ( ((LA12_323>='0' && LA12_323<='9')||(LA12_323>='A' && LA12_323<='Z')||LA12_323=='_'||(LA12_323>='a' && LA12_323<='z')) ) {
                                                alt12=68;
                                            }
                                            else {
                                                alt12=5;}
                                        }
                                        else {
                                            alt12=68;}
                                    }
                                    else {
                                        alt12=68;}
                                }
                                else {
                                    alt12=68;}
                            }
                            else {
                                alt12=68;}
                        }
                        else {
                            alt12=68;}
                    }
                    else {
                        alt12=68;}
                }
                else {
                    alt12=68;}
                }
                break;
            default:
                alt12=68;}

        }
        else if ( (LA12_0=='T'||LA12_0=='t') ) {
            switch ( input.LA(2) ) {
            case 'R':
            case 'r':
                {
                int LA12_46 = input.LA(3);

                if ( (LA12_46=='U'||LA12_46=='u') ) {
                    switch ( input.LA(4) ) {
                    case 'S':
                    case 's':
                        {
                        int LA12_160 = input.LA(5);

                        if ( (LA12_160=='T'||LA12_160=='t') ) {
                            int LA12_212 = input.LA(6);

                            if ( ((LA12_212>='0' && LA12_212<='9')||(LA12_212>='A' && LA12_212<='Z')||LA12_212=='_'||(LA12_212>='a' && LA12_212<='z')) ) {
                                alt12=68;
                            }
                            else {
                                alt12=32;}
                        }
                        else {
                            alt12=68;}
                        }
                        break;
                    case 'E':
                    case 'e':
                        {
                        int LA12_161 = input.LA(5);

                        if ( ((LA12_161>='0' && LA12_161<='9')||(LA12_161>='A' && LA12_161<='Z')||LA12_161=='_'||(LA12_161>='a' && LA12_161<='z')) ) {
                            alt12=68;
                        }
                        else {
                            alt12=45;}
                        }
                        break;
                    default:
                        alt12=68;}

                }
                else {
                    alt12=68;}
                }
                break;
            case 'H':
            case 'h':
                {
                int LA12_47 = input.LA(3);

                if ( (LA12_47=='E'||LA12_47=='e') ) {
                    int LA12_107 = input.LA(4);

                    if ( (LA12_107=='N'||LA12_107=='n') ) {
                        int LA12_162 = input.LA(5);

                        if ( ((LA12_162>='0' && LA12_162<='9')||(LA12_162>='A' && LA12_162<='Z')||LA12_162=='_'||(LA12_162>='a' && LA12_162<='z')) ) {
                            alt12=68;
                        }
                        else {
                            alt12=44;}
                    }
                    else {
                        alt12=68;}
                }
                else {
                    alt12=68;}
                }
                break;
            case 'I':
            case 'i':
                {
                int LA12_48 = input.LA(3);

                if ( (LA12_48=='M'||LA12_48=='m') ) {
                    int LA12_108 = input.LA(4);

                    if ( (LA12_108=='E'||LA12_108=='e') ) {
                        int LA12_163 = input.LA(5);

                        if ( (LA12_163=='S'||LA12_163=='s') ) {
                            int LA12_215 = input.LA(6);

                            if ( (LA12_215=='T'||LA12_215=='t') ) {
                                int LA12_258 = input.LA(7);

                                if ( (LA12_258=='A'||LA12_258=='a') ) {
                                    int LA12_288 = input.LA(8);

                                    if ( (LA12_288=='M'||LA12_288=='m') ) {
                                        int LA12_310 = input.LA(9);

                                        if ( (LA12_310=='P'||LA12_310=='p') ) {
                                            int LA12_324 = input.LA(10);

                                            if ( ((LA12_324>='0' && LA12_324<='9')||(LA12_324>='A' && LA12_324<='Z')||LA12_324=='_'||(LA12_324>='a' && LA12_324<='z')) ) {
                                                alt12=68;
                                            }
                                            else {
                                                alt12=8;}
                                        }
                                        else {
                                            alt12=68;}
                                    }
                                    else {
                                        alt12=68;}
                                }
                                else {
                                    alt12=68;}
                            }
                            else {
                                alt12=68;}
                        }
                        else {
                            alt12=68;}
                    }
                    else {
                        alt12=68;}
                }
                else {
                    alt12=68;}
                }
                break;
            default:
                alt12=68;}

        }
        else if ( (LA12_0=='E'||LA12_0=='e') ) {
            switch ( input.LA(2) ) {
            case 'L':
            case 'l':
                {
                int LA12_49 = input.LA(3);

                if ( (LA12_49=='S'||LA12_49=='s') ) {
                    switch ( input.LA(4) ) {
                    case 'E':
                    case 'e':
                        {
                        int LA12_164 = input.LA(5);

                        if ( ((LA12_164>='0' && LA12_164<='9')||(LA12_164>='A' && LA12_164<='Z')||LA12_164=='_'||(LA12_164>='a' && LA12_164<='z')) ) {
                            alt12=68;
                        }
                        else {
                            alt12=36;}
                        }
                        break;
                    case 'I':
                    case 'i':
                        {
                        int LA12_165 = input.LA(5);

                        if ( (LA12_165=='F'||LA12_165=='f') ) {
                            int LA12_217 = input.LA(6);

                            if ( ((LA12_217>='0' && LA12_217<='9')||(LA12_217>='A' && LA12_217<='Z')||LA12_217=='_'||(LA12_217>='a' && LA12_217<='z')) ) {
                                alt12=68;
                            }
                            else {
                                alt12=27;}
                        }
                        else {
                            alt12=68;}
                        }
                        break;
                    default:
                        alt12=68;}

                }
                else {
                    alt12=68;}
                }
                break;
            case 'X':
            case 'x':
                {
                switch ( input.LA(3) ) {
                case 'T':
                case 't':
                    {
                    int LA12_110 = input.LA(4);

                    if ( (LA12_110=='E'||LA12_110=='e') ) {
                        int LA12_166 = input.LA(5);

                        if ( (LA12_166=='R'||LA12_166=='r') ) {
                            int LA12_218 = input.LA(6);

                            if ( (LA12_218=='N'||LA12_218=='n') ) {
                                int LA12_260 = input.LA(7);

                                if ( (LA12_260=='A'||LA12_260=='a') ) {
                                    int LA12_289 = input.LA(8);

                                    if ( (LA12_289=='L'||LA12_289=='l') ) {
                                        int LA12_311 = input.LA(9);

                                        if ( ((LA12_311>='0' && LA12_311<='9')||(LA12_311>='A' && LA12_311<='Z')||LA12_311=='_'||(LA12_311>='a' && LA12_311<='z')) ) {
                                            alt12=68;
                                        }
                                        else {
                                            alt12=11;}
                                    }
                                    else {
                                        alt12=68;}
                                }
                                else {
                                    alt12=68;}
                            }
                            else {
                                alt12=68;}
                        }
                        else {
                            alt12=68;}
                    }
                    else {
                        alt12=68;}
                    }
                    break;
                case 'I':
                case 'i':
                    {
                    int LA12_111 = input.LA(4);

                    if ( (LA12_111=='T'||LA12_111=='t') ) {
                        int LA12_167 = input.LA(5);

                        if ( ((LA12_167>='0' && LA12_167<='9')||(LA12_167>='A' && LA12_167<='Z')||LA12_167=='_'||(LA12_167>='a' && LA12_167<='z')) ) {
                            alt12=68;
                        }
                        else {
                            alt12=37;}
                    }
                    else {
                        alt12=68;}
                    }
                    break;
                default:
                    alt12=68;}

                }
                break;
            case 'N':
            case 'n':
                {
                int LA12_51 = input.LA(3);

                if ( (LA12_51=='D'||LA12_51=='d') ) {
                    int LA12_112 = input.LA(4);

                    if ( ((LA12_112>='0' && LA12_112<='9')||(LA12_112>='A' && LA12_112<='Z')||LA12_112=='_'||(LA12_112>='a' && LA12_112<='z')) ) {
                        alt12=68;
                    }
                    else {
                        alt12=49;}
                }
                else {
                    alt12=68;}
                }
                break;
            default:
                alt12=68;}

        }
        else if ( (LA12_0=='F'||LA12_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'A':
            case 'a':
                {
                int LA12_52 = input.LA(3);

                if ( (LA12_52=='L'||LA12_52=='l') ) {
                    int LA12_113 = input.LA(4);

                    if ( (LA12_113=='S'||LA12_113=='s') ) {
                        int LA12_169 = input.LA(5);

                        if ( (LA12_169=='E'||LA12_169=='e') ) {
                            int LA12_220 = input.LA(6);

                            if ( ((LA12_220>='0' && LA12_220<='9')||(LA12_220>='A' && LA12_220<='Z')||LA12_220=='_'||(LA12_220>='a' && LA12_220<='z')) ) {
                                alt12=68;
                            }
                            else {
                                alt12=28;}
                        }
                        else {
                            alt12=68;}
                    }
                    else {
                        alt12=68;}
                }
                else {
                    alt12=68;}
                }
                break;
            case 'E':
            case 'e':
                {
                int LA12_53 = input.LA(3);

                if ( (LA12_53=='T'||LA12_53=='t') ) {
                    int LA12_114 = input.LA(4);

                    if ( (LA12_114=='C'||LA12_114=='c') ) {
                        int LA12_170 = input.LA(5);

                        if ( (LA12_170=='H'||LA12_170=='h') ) {
                            int LA12_221 = input.LA(6);

                            if ( ((LA12_221>='0' && LA12_221<='9')||(LA12_221>='A' && LA12_221<='Z')||LA12_221=='_'||(LA12_221>='a' && LA12_221<='z')) ) {
                                alt12=68;
                            }
                            else {
                                alt12=29;}
                        }
                        else {
                            alt12=68;}
                    }
                    else {
                        alt12=68;}
                }
                else {
                    alt12=68;}
                }
                break;
            case 'O':
            case 'o':
                {
                int LA12_54 = input.LA(3);

                if ( (LA12_54=='R'||LA12_54=='r') ) {
                    int LA12_115 = input.LA(4);

                    if ( ((LA12_115>='0' && LA12_115<='9')||(LA12_115>='A' && LA12_115<='Z')||LA12_115=='_'||(LA12_115>='a' && LA12_115<='z')) ) {
                        alt12=68;
                    }
                    else {
                        alt12=50;}
                }
                else {
                    alt12=68;}
                }
                break;
            case 'U':
            case 'u':
                {
                int LA12_55 = input.LA(3);

                if ( (LA12_55=='N'||LA12_55=='n') ) {
                    int LA12_116 = input.LA(4);

                    if ( (LA12_116=='C'||LA12_116=='c') ) {
                        int LA12_172 = input.LA(5);

                        if ( (LA12_172=='T'||LA12_172=='t') ) {
                            int LA12_222 = input.LA(6);

                            if ( (LA12_222=='I'||LA12_222=='i') ) {
                                int LA12_263 = input.LA(7);

                                if ( (LA12_263=='O'||LA12_263=='o') ) {
                                    int LA12_290 = input.LA(8);

                                    if ( (LA12_290=='N'||LA12_290=='n') ) {
                                        int LA12_312 = input.LA(9);

                                        if ( ((LA12_312>='0' && LA12_312<='9')||(LA12_312>='A' && LA12_312<='Z')||LA12_312=='_'||(LA12_312>='a' && LA12_312<='z')) ) {
                                            alt12=68;
                                        }
                                        else {
                                            alt12=12;}
                                    }
                                    else {
                                        alt12=68;}
                                }
                                else {
                                    alt12=68;}
                            }
                            else {
                                alt12=68;}
                        }
                        else {
                            alt12=68;}
                    }
                    else {
                        alt12=68;}
                }
                else {
                    alt12=68;}
                }
                break;
            default:
                alt12=68;}

        }
        else if ( (LA12_0=='V'||LA12_0=='v') ) {
            int LA12_8 = input.LA(2);

            if ( (LA12_8=='A'||LA12_8=='a') ) {
                int LA12_56 = input.LA(3);

                if ( (LA12_56=='R'||LA12_56=='r') ) {
                    int LA12_117 = input.LA(4);

                    if ( (LA12_117=='C'||LA12_117=='c') ) {
                        int LA12_173 = input.LA(5);

                        if ( (LA12_173=='H'||LA12_173=='h') ) {
                            int LA12_223 = input.LA(6);

                            if ( (LA12_223=='A'||LA12_223=='a') ) {
                                int LA12_264 = input.LA(7);

                                if ( (LA12_264=='R'||LA12_264=='r') ) {
                                    int LA12_291 = input.LA(8);

                                    if ( (LA12_291=='2') ) {
                                        int LA12_313 = input.LA(9);

                                        if ( ((LA12_313>='0' && LA12_313<='9')||(LA12_313>='A' && LA12_313<='Z')||LA12_313=='_'||(LA12_313>='a' && LA12_313<='z')) ) {
                                            alt12=68;
                                        }
                                        else {
                                            alt12=13;}
                                    }
                                    else {
                                        alt12=68;}
                                }
                                else {
                                    alt12=68;}
                            }
                            else {
                                alt12=68;}
                        }
                        else {
                            alt12=68;}
                    }
                    else {
                        alt12=68;}
                }
                else {
                    alt12=68;}
            }
            else {
                alt12=68;}
        }
        else if ( (LA12_0=='B'||LA12_0=='b') ) {
            switch ( input.LA(2) ) {
            case 'E':
            case 'e':
                {
                int LA12_57 = input.LA(3);

                if ( (LA12_57=='G'||LA12_57=='g') ) {
                    int LA12_118 = input.LA(4);

                    if ( (LA12_118=='I'||LA12_118=='i') ) {
                        int LA12_174 = input.LA(5);

                        if ( (LA12_174=='N'||LA12_174=='n') ) {
                            int LA12_224 = input.LA(6);

                            if ( ((LA12_224>='0' && LA12_224<='9')||(LA12_224>='A' && LA12_224<='Z')||LA12_224=='_'||(LA12_224>='a' && LA12_224<='z')) ) {
                                alt12=68;
                            }
                            else {
                                alt12=25;}
                        }
                        else {
                            alt12=68;}
                    }
                    else {
                        alt12=68;}
                }
                else {
                    alt12=68;}
                }
                break;
            case 'U':
            case 'u':
                {
                int LA12_58 = input.LA(3);

                if ( (LA12_58=='L'||LA12_58=='l') ) {
                    int LA12_119 = input.LA(4);

                    if ( (LA12_119=='K'||LA12_119=='k') ) {
                        int LA12_175 = input.LA(5);

                        if ( ((LA12_175>='0' && LA12_175<='9')||(LA12_175>='A' && LA12_175<='Z')||LA12_175=='_'||(LA12_175>='a' && LA12_175<='z')) ) {
                            alt12=68;
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=68;}
                }
                else {
                    alt12=68;}
                }
                break;
            case 'O':
            case 'o':
                {
                int LA12_59 = input.LA(3);

                if ( (LA12_59=='O'||LA12_59=='o') ) {
                    int LA12_120 = input.LA(4);

                    if ( (LA12_120=='L'||LA12_120=='l') ) {
                        int LA12_176 = input.LA(5);

                        if ( (LA12_176=='E'||LA12_176=='e') ) {
                            int LA12_226 = input.LA(6);

                            if ( (LA12_226=='A'||LA12_226=='a') ) {
                                int LA12_266 = input.LA(7);

                                if ( (LA12_266=='N'||LA12_266=='n') ) {
                                    int LA12_292 = input.LA(8);

                                    if ( ((LA12_292>='0' && LA12_292<='9')||(LA12_292>='A' && LA12_292<='Z')||LA12_292=='_'||(LA12_292>='a' && LA12_292<='z')) ) {
                                        alt12=68;
                                    }
                                    else {
                                        alt12=14;}
                                }
                                else {
                                    alt12=68;}
                            }
                            else {
                                alt12=68;}
                        }
                        else {
                            alt12=68;}
                    }
                    else {
                        alt12=68;}
                }
                else {
                    alt12=68;}
                }
                break;
            default:
                alt12=68;}

        }
        else if ( (LA12_0=='N'||LA12_0=='n') ) {
            switch ( input.LA(2) ) {
            case 'O':
            case 'o':
                {
                switch ( input.LA(3) ) {
                case 'C':
                case 'c':
                    {
                    int LA12_121 = input.LA(4);

                    if ( (LA12_121=='O'||LA12_121=='o') ) {
                        int LA12_177 = input.LA(5);

                        if ( (LA12_177=='P'||LA12_177=='p') ) {
                            int LA12_227 = input.LA(6);

                            if ( (LA12_227=='Y'||LA12_227=='y') ) {
                                int LA12_267 = input.LA(7);

                                if ( ((LA12_267>='0' && LA12_267<='9')||(LA12_267>='A' && LA12_267<='Z')||LA12_267=='_'||(LA12_267>='a' && LA12_267<='z')) ) {
                                    alt12=68;
                                }
                                else {
                                    alt12=21;}
                            }
                            else {
                                alt12=68;}
                        }
                        else {
                            alt12=68;}
                    }
                    else {
                        alt12=68;}
                    }
                    break;
                case 'T':
                case 't':
                    {
                    int LA12_122 = input.LA(4);

                    if ( ((LA12_122>='0' && LA12_122<='9')||(LA12_122>='A' && LA12_122<='Z')||LA12_122=='_'||(LA12_122>='a' && LA12_122<='z')) ) {
                        alt12=68;
                    }
                    else {
                        alt12=51;}
                    }
                    break;
                default:
                    alt12=68;}

                }
                break;
            case 'U':
            case 'u':
                {
                switch ( input.LA(3) ) {
                case 'L':
                case 'l':
                    {
                    int LA12_123 = input.LA(4);

                    if ( (LA12_123=='L'||LA12_123=='l') ) {
                        int LA12_179 = input.LA(5);

                        if ( ((LA12_179>='0' && LA12_179<='9')||(LA12_179>='A' && LA12_179<='Z')||LA12_179=='_'||(LA12_179>='a' && LA12_179<='z')) ) {
                            alt12=68;
                        }
                        else {
                            alt12=41;}
                    }
                    else {
                        alt12=68;}
                    }
                    break;
                case 'M':
                case 'm':
                    {
                    int LA12_124 = input.LA(4);

                    if ( (LA12_124=='B'||LA12_124=='b') ) {
                        int LA12_180 = input.LA(5);

                        if ( (LA12_180=='E'||LA12_180=='e') ) {
                            int LA12_229 = input.LA(6);

                            if ( (LA12_229=='R'||LA12_229=='r') ) {
                                int LA12_268 = input.LA(7);

                                if ( ((LA12_268>='0' && LA12_268<='9')||(LA12_268>='A' && LA12_268<='Z')||LA12_268=='_'||(LA12_268>='a' && LA12_268<='z')) ) {
                                    alt12=68;
                                }
                                else {
                                    alt12=22;}
                            }
                            else {
                                alt12=68;}
                        }
                        else {
                            alt12=68;}
                    }
                    else {
                        alt12=68;}
                    }
                    break;
                default:
                    alt12=68;}

                }
                break;
            default:
                alt12=68;}

        }
        else if ( (LA12_0=='L'||LA12_0=='l') ) {
            switch ( input.LA(2) ) {
            case 'I':
            case 'i':
                {
                int LA12_62 = input.LA(3);

                if ( (LA12_62=='M'||LA12_62=='m') ) {
                    int LA12_125 = input.LA(4);

                    if ( (LA12_125=='I'||LA12_125=='i') ) {
                        int LA12_181 = input.LA(5);

                        if ( (LA12_181=='T'||LA12_181=='t') ) {
                            int LA12_230 = input.LA(6);

                            if ( ((LA12_230>='0' && LA12_230<='9')||(LA12_230>='A' && LA12_230<='Z')||LA12_230=='_'||(LA12_230>='a' && LA12_230<='z')) ) {
                                alt12=68;
                            }
                            else {
                                alt12=30;}
                        }
                        else {
                            alt12=68;}
                    }
                    else {
                        alt12=68;}
                }
                else {
                    alt12=68;}
                }
                break;
            case 'O':
            case 'o':
                {
                int LA12_63 = input.LA(3);

                if ( (LA12_63=='O'||LA12_63=='o') ) {
                    int LA12_126 = input.LA(4);

                    if ( (LA12_126=='P'||LA12_126=='p') ) {
                        int LA12_182 = input.LA(5);

                        if ( ((LA12_182>='0' && LA12_182<='9')||(LA12_182>='A' && LA12_182<='Z')||LA12_182=='_'||(LA12_182>='a' && LA12_182<='z')) ) {
                            alt12=68;
                        }
                        else {
                            alt12=40;}
                    }
                    else {
                        alt12=68;}
                }
                else {
                    alt12=68;}
                }
                break;
            default:
                alt12=68;}

        }
        else if ( (LA12_0=='W'||LA12_0=='w') ) {
            switch ( input.LA(2) ) {
            case 'H':
            case 'h':
                {
                switch ( input.LA(3) ) {
                case 'E':
                case 'e':
                    {
                    int LA12_127 = input.LA(4);

                    if ( (LA12_127=='N'||LA12_127=='n') ) {
                        int LA12_183 = input.LA(5);

                        if ( ((LA12_183>='0' && LA12_183<='9')||(LA12_183>='A' && LA12_183<='Z')||LA12_183=='_'||(LA12_183>='a' && LA12_183<='z')) ) {
                            alt12=68;
                        }
                        else {
                            alt12=46;}
                    }
                    else {
                        alt12=68;}
                    }
                    break;
                case 'I':
                case 'i':
                    {
                    int LA12_128 = input.LA(4);

                    if ( (LA12_128=='L'||LA12_128=='l') ) {
                        int LA12_184 = input.LA(5);

                        if ( (LA12_184=='E'||LA12_184=='e') ) {
                            int LA12_233 = input.LA(6);

                            if ( ((LA12_233>='0' && LA12_233<='9')||(LA12_233>='A' && LA12_233<='Z')||LA12_233=='_'||(LA12_233>='a' && LA12_233<='z')) ) {
                                alt12=68;
                            }
                            else {
                                alt12=33;}
                        }
                        else {
                            alt12=68;}
                    }
                    else {
                        alt12=68;}
                    }
                    break;
                default:
                    alt12=68;}

                }
                break;
            case 'N':
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 'D':
                case 'd':
                    {
                    int LA12_129 = input.LA(4);

                    if ( (LA12_129=='S'||LA12_129=='s') ) {
                        int LA12_185 = input.LA(5);

                        if ( ((LA12_185>='0' && LA12_185<='9')||(LA12_185>='A' && LA12_185<='Z')||LA12_185=='_'||(LA12_185>='a' && LA12_185<='z')) ) {
                            alt12=68;
                        }
                        else {
                            alt12=47;}
                    }
                    else {
                        alt12=68;}
                    }
                    break;
                case 'P':
                case 'p':
                    {
                    int LA12_130 = input.LA(4);

                    if ( (LA12_130=='S'||LA12_130=='s') ) {
                        int LA12_186 = input.LA(5);

                        if ( ((LA12_186>='0' && LA12_186<='9')||(LA12_186>='A' && LA12_186<='Z')||LA12_186=='_'||(LA12_186>='a' && LA12_186<='z')) ) {
                            alt12=68;
                        }
                        else {
                            alt12=48;}
                    }
                    else {
                        alt12=68;}
                    }
                    break;
                default:
                    alt12=68;}

                }
                break;
            default:
                alt12=68;}

        }
        else if ( (LA12_0=='G'||LA12_0=='g') ) {
            int LA12_13 = input.LA(2);

            if ( (LA12_13=='O'||LA12_13=='o') ) {
                int LA12_66 = input.LA(3);

                if ( (LA12_66=='T'||LA12_66=='t') ) {
                    int LA12_131 = input.LA(4);

                    if ( (LA12_131=='O'||LA12_131=='o') ) {
                        int LA12_187 = input.LA(5);

                        if ( ((LA12_187>='0' && LA12_187<='9')||(LA12_187>='A' && LA12_187<='Z')||LA12_187=='_'||(LA12_187>='a' && LA12_187<='z')) ) {
                            alt12=68;
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=68;}
                }
                else {
                    alt12=68;}
            }
            else {
                alt12=68;}
        }
        else if ( (LA12_0=='I'||LA12_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'S':
            case 's':
                {
                int LA12_67 = input.LA(3);

                if ( ((LA12_67>='0' && LA12_67<='9')||(LA12_67>='A' && LA12_67<='Z')||LA12_67=='_'||(LA12_67>='a' && LA12_67<='z')) ) {
                    alt12=68;
                }
                else {
                    alt12=60;}
                }
                break;
            case 'F':
            case 'f':
                {
                int LA12_68 = input.LA(3);

                if ( ((LA12_68>='0' && LA12_68<='9')||(LA12_68>='A' && LA12_68<='Z')||LA12_68=='_'||(LA12_68>='a' && LA12_68<='z')) ) {
                    alt12=68;
                }
                else {
                    alt12=58;}
                }
                break;
            case 'N':
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 'T':
                case 't':
                    {
                    int LA12_134 = input.LA(4);

                    if ( (LA12_134=='O'||LA12_134=='o') ) {
                        int LA12_188 = input.LA(5);

                        if ( ((LA12_188>='0' && LA12_188<='9')||(LA12_188>='A' && LA12_188<='Z')||LA12_188=='_'||(LA12_188>='a' && LA12_188<='z')) ) {
                            alt12=68;
                        }
                        else {
                            alt12=39;}
                    }
                    else {
                        alt12=68;}
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt12=68;
                    }
                    break;
                default:
                    alt12=59;}

                }
                break;
            default:
                alt12=68;}

        }
        else if ( (LA12_0=='O'||LA12_0=='o') ) {
            int LA12_15 = input.LA(2);

            if ( (LA12_15=='U'||LA12_15=='u') ) {
                int LA12_70 = input.LA(3);

                if ( (LA12_70=='T'||LA12_70=='t') ) {
                    int LA12_136 = input.LA(4);

                    if ( ((LA12_136>='0' && LA12_136<='9')||(LA12_136>='A' && LA12_136<='Z')||LA12_136=='_'||(LA12_136>='a' && LA12_136<='z')) ) {
                        alt12=68;
                    }
                    else {
                        alt12=52;}
                }
                else {
                    alt12=68;}
            }
            else {
                alt12=68;}
        }
        else if ( (LA12_0=='.') ) {
            int LA12_16 = input.LA(2);

            if ( (LA12_16=='.') ) {
                alt12=53;
            }
            else {
                alt12=64;}
        }
        else if ( (LA12_0==':') ) {
            int LA12_17 = input.LA(2);

            if ( (LA12_17=='=') ) {
                alt12=54;
            }
            else {
                alt12=65;}
        }
        else if ( (LA12_0=='<') ) {
            int LA12_18 = input.LA(2);

            if ( (LA12_18=='<') ) {
                alt12=55;
            }
            else {
                alt12=73;}
        }
        else if ( (LA12_0=='>') ) {
            int LA12_19 = input.LA(2);

            if ( (LA12_19=='>') ) {
                alt12=56;
            }
            else {
                alt12=73;}
        }
        else if ( (LA12_0=='A'||LA12_0=='a') ) {
            int LA12_20 = input.LA(2);

            if ( (LA12_20=='S'||LA12_20=='s') ) {
                int LA12_77 = input.LA(3);

                if ( ((LA12_77>='0' && LA12_77<='9')||(LA12_77>='A' && LA12_77<='Z')||LA12_77=='_'||(LA12_77>='a' && LA12_77<='z')) ) {
                    alt12=68;
                }
                else {
                    alt12=57;}
            }
            else {
                alt12=68;}
        }
        else if ( (LA12_0=='(') ) {
            alt12=61;
        }
        else if ( (LA12_0==')') ) {
            alt12=62;
        }
        else if ( (LA12_0==',') ) {
            alt12=63;
        }
        else if ( (LA12_0==';') ) {
            alt12=66;
        }
        else if ( (LA12_0=='-') ) {
            int LA12_25 = input.LA(2);

            if ( (LA12_25=='-') ) {
                alt12=67;
            }
            else {
                alt12=73;}
        }
        else if ( (LA12_0=='^') ) {
            int LA12_26 = input.LA(2);

            if ( ((LA12_26>='A' && LA12_26<='Z')||LA12_26=='_'||(LA12_26>='a' && LA12_26<='z')) ) {
                alt12=68;
            }
            else {
                alt12=73;}
        }
        else if ( (LA12_0=='H'||(LA12_0>='J' && LA12_0<='K')||LA12_0=='M'||LA12_0=='Q'||LA12_0=='S'||LA12_0=='U'||(LA12_0>='X' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='h'||(LA12_0>='j' && LA12_0<='k')||LA12_0=='m'||LA12_0=='q'||LA12_0=='s'||LA12_0=='u'||(LA12_0>='x' && LA12_0<='z')) ) {
            alt12=68;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=69;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_29 = input.LA(2);

            if ( ((LA12_29>='\u0000' && LA12_29<='\uFFFE')) ) {
                alt12=70;
            }
            else {
                alt12=73;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_30 = input.LA(2);

            if ( ((LA12_30>='\u0000' && LA12_30<='\uFFFE')) ) {
                alt12=70;
            }
            else {
                alt12=73;}
        }
        else if ( (LA12_0=='/') ) {
            int LA12_31 = input.LA(2);

            if ( (LA12_31=='*') ) {
                alt12=71;
            }
            else {
                alt12=73;}
        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=72;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||LA12_0=='='||(LA12_0>='?' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFE')) ) {
            alt12=73;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( KEYWORD_66 | KEYWORD_65 | KEYWORD_63 | KEYWORD_64 | KEYWORD_59 | KEYWORD_60 | KEYWORD_61 | KEYWORD_62 | KEYWORD_54 | KEYWORD_55 | KEYWORD_56 | KEYWORD_57 | KEYWORD_58 | KEYWORD_47 | KEYWORD_48 | KEYWORD_49 | KEYWORD_50 | KEYWORD_51 | KEYWORD_52 | KEYWORD_53 | KEYWORD_43 | KEYWORD_44 | KEYWORD_45 | KEYWORD_46 | KEYWORD_34 | KEYWORD_35 | KEYWORD_36 | KEYWORD_37 | KEYWORD_38 | KEYWORD_39 | KEYWORD_40 | KEYWORD_41 | KEYWORD_42 | KEYWORD_19 | KEYWORD_20 | KEYWORD_21 | KEYWORD_22 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | KEYWORD_26 | KEYWORD_27 | KEYWORD_28 | KEYWORD_29 | KEYWORD_30 | KEYWORD_31 | KEYWORD_32 | KEYWORD_33 | KEYWORD_15 | KEYWORD_16 | KEYWORD_17 | KEYWORD_18 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:10: KEYWORD_66
                {
                mKEYWORD_66(); 

                }
                break;
            case 2 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:21: KEYWORD_65
                {
                mKEYWORD_65(); 

                }
                break;
            case 3 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:32: KEYWORD_63
                {
                mKEYWORD_63(); 

                }
                break;
            case 4 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:43: KEYWORD_64
                {
                mKEYWORD_64(); 

                }
                break;
            case 5 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:54: KEYWORD_59
                {
                mKEYWORD_59(); 

                }
                break;
            case 6 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:65: KEYWORD_60
                {
                mKEYWORD_60(); 

                }
                break;
            case 7 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:76: KEYWORD_61
                {
                mKEYWORD_61(); 

                }
                break;
            case 8 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:87: KEYWORD_62
                {
                mKEYWORD_62(); 

                }
                break;
            case 9 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:98: KEYWORD_54
                {
                mKEYWORD_54(); 

                }
                break;
            case 10 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:109: KEYWORD_55
                {
                mKEYWORD_55(); 

                }
                break;
            case 11 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:120: KEYWORD_56
                {
                mKEYWORD_56(); 

                }
                break;
            case 12 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:131: KEYWORD_57
                {
                mKEYWORD_57(); 

                }
                break;
            case 13 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:142: KEYWORD_58
                {
                mKEYWORD_58(); 

                }
                break;
            case 14 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:153: KEYWORD_47
                {
                mKEYWORD_47(); 

                }
                break;
            case 15 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:164: KEYWORD_48
                {
                mKEYWORD_48(); 

                }
                break;
            case 16 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:175: KEYWORD_49
                {
                mKEYWORD_49(); 

                }
                break;
            case 17 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:186: KEYWORD_50
                {
                mKEYWORD_50(); 

                }
                break;
            case 18 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:197: KEYWORD_51
                {
                mKEYWORD_51(); 

                }
                break;
            case 19 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:208: KEYWORD_52
                {
                mKEYWORD_52(); 

                }
                break;
            case 20 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:219: KEYWORD_53
                {
                mKEYWORD_53(); 

                }
                break;
            case 21 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:230: KEYWORD_43
                {
                mKEYWORD_43(); 

                }
                break;
            case 22 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:241: KEYWORD_44
                {
                mKEYWORD_44(); 

                }
                break;
            case 23 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:252: KEYWORD_45
                {
                mKEYWORD_45(); 

                }
                break;
            case 24 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:263: KEYWORD_46
                {
                mKEYWORD_46(); 

                }
                break;
            case 25 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:274: KEYWORD_34
                {
                mKEYWORD_34(); 

                }
                break;
            case 26 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:285: KEYWORD_35
                {
                mKEYWORD_35(); 

                }
                break;
            case 27 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:296: KEYWORD_36
                {
                mKEYWORD_36(); 

                }
                break;
            case 28 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:307: KEYWORD_37
                {
                mKEYWORD_37(); 

                }
                break;
            case 29 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:318: KEYWORD_38
                {
                mKEYWORD_38(); 

                }
                break;
            case 30 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:329: KEYWORD_39
                {
                mKEYWORD_39(); 

                }
                break;
            case 31 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:340: KEYWORD_40
                {
                mKEYWORD_40(); 

                }
                break;
            case 32 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:351: KEYWORD_41
                {
                mKEYWORD_41(); 

                }
                break;
            case 33 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:362: KEYWORD_42
                {
                mKEYWORD_42(); 

                }
                break;
            case 34 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:373: KEYWORD_19
                {
                mKEYWORD_19(); 

                }
                break;
            case 35 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:384: KEYWORD_20
                {
                mKEYWORD_20(); 

                }
                break;
            case 36 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:395: KEYWORD_21
                {
                mKEYWORD_21(); 

                }
                break;
            case 37 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:406: KEYWORD_22
                {
                mKEYWORD_22(); 

                }
                break;
            case 38 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:417: KEYWORD_23
                {
                mKEYWORD_23(); 

                }
                break;
            case 39 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:428: KEYWORD_24
                {
                mKEYWORD_24(); 

                }
                break;
            case 40 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:439: KEYWORD_25
                {
                mKEYWORD_25(); 

                }
                break;
            case 41 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:450: KEYWORD_26
                {
                mKEYWORD_26(); 

                }
                break;
            case 42 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:461: KEYWORD_27
                {
                mKEYWORD_27(); 

                }
                break;
            case 43 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:472: KEYWORD_28
                {
                mKEYWORD_28(); 

                }
                break;
            case 44 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:483: KEYWORD_29
                {
                mKEYWORD_29(); 

                }
                break;
            case 45 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:494: KEYWORD_30
                {
                mKEYWORD_30(); 

                }
                break;
            case 46 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:505: KEYWORD_31
                {
                mKEYWORD_31(); 

                }
                break;
            case 47 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:516: KEYWORD_32
                {
                mKEYWORD_32(); 

                }
                break;
            case 48 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:527: KEYWORD_33
                {
                mKEYWORD_33(); 

                }
                break;
            case 49 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:538: KEYWORD_15
                {
                mKEYWORD_15(); 

                }
                break;
            case 50 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:549: KEYWORD_16
                {
                mKEYWORD_16(); 

                }
                break;
            case 51 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:560: KEYWORD_17
                {
                mKEYWORD_17(); 

                }
                break;
            case 52 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:571: KEYWORD_18
                {
                mKEYWORD_18(); 

                }
                break;
            case 53 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:582: KEYWORD_7
                {
                mKEYWORD_7(); 

                }
                break;
            case 54 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:592: KEYWORD_8
                {
                mKEYWORD_8(); 

                }
                break;
            case 55 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:602: KEYWORD_9
                {
                mKEYWORD_9(); 

                }
                break;
            case 56 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:612: KEYWORD_10
                {
                mKEYWORD_10(); 

                }
                break;
            case 57 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:623: KEYWORD_11
                {
                mKEYWORD_11(); 

                }
                break;
            case 58 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:634: KEYWORD_12
                {
                mKEYWORD_12(); 

                }
                break;
            case 59 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:645: KEYWORD_13
                {
                mKEYWORD_13(); 

                }
                break;
            case 60 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:656: KEYWORD_14
                {
                mKEYWORD_14(); 

                }
                break;
            case 61 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:667: KEYWORD_1
                {
                mKEYWORD_1(); 

                }
                break;
            case 62 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:677: KEYWORD_2
                {
                mKEYWORD_2(); 

                }
                break;
            case 63 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:687: KEYWORD_3
                {
                mKEYWORD_3(); 

                }
                break;
            case 64 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:697: KEYWORD_4
                {
                mKEYWORD_4(); 

                }
                break;
            case 65 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:707: KEYWORD_5
                {
                mKEYWORD_5(); 

                }
                break;
            case 66 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:717: KEYWORD_6
                {
                mKEYWORD_6(); 

                }
                break;
            case 67 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:727: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 68 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:743: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 69 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:751: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 70 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:760: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 71 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:772: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 72 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:788: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 73 :
                // ../plsql.editor.xtext/src-gen/plsql/editor/xtext/parser/antlr/lexer/InternalPlSql.g:1:796: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}