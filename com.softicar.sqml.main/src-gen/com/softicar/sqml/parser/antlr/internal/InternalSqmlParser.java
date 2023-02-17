package com.softicar.sqml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.softicar.sqml.services.SqmlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSqmlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DECIMAL", "RULE_LONG", "RULE_FLOAT", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PACKAGE'", "'IMPORT'", "'<'", "','", "'>'", "'['", "']'", "'VALUETYPE'", "'{'", "'}'", "'ENUM'", "'ON'", "'='", "'TABLE'", "'PK'", "'NULL'", "'NOW'", "'SERIAL'", "'BASE'", "'NULLABLE'", "'TIMESTAMP'", "'UNSIGNED'", "'DELETE'", "'UPDATE'", "'BITS'", "'PRECISION'", "'MAXLENGTH'", "'LENGTHBITS'", "'CHARACTER'", "'SET'", "'COLLATION'", "'COMMENT'", "'CONSTRAINT_NAME'", "'ROW'", "'('", "')'", "'-'", "'UK'", "'IK'", "'AS'", "'QUERY'", "'OPTIONAL'", "'FUNCTION'", "'SQL'", "'ACTION'", "'AND'", "'ASC'", "'BETWEEN'", "'BY'", "'CASCADE'", "'CASE'", "'DEFAULT'", "'DESC'", "'DISTINCT'", "'ELSE'", "'EMPTY'", "'END'", "'ESCAPE'", "'EXISTS'", "'FALSE'", "'FOR'", "'FROM'", "'GROUP'", "'GROUP_CONCAT'", "'HAVING'", "'IF'", "'IFNULL'", "'IN'", "'IS'", "'JOIN'", "'LEFT'", "'LIKE'", "'NEXT'", "'NO_ACTION'", "'NOT'", "'OR'", "'ORDER'", "'REGEXP'", "'RESTRICT'", "'SELECT'", "'SEPARATOR'", "'SET_DEFAULT'", "'SET_NULL'", "'STATIC'", "'THEN'", "'TITLE'", "'TRUE'", "'WHEN'", "'WHERE'", "'+'", "'*'", "'/'", "'%'", "'|'", "'&'", "'^'", "'~'", "'.'", "'<>'", "'!='", "'<='", "'>='", "'#'", "'$'", "'.*'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=9;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int RULE_DECIMAL=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_DOUBLE=10;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int RULE_LONG=8;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalSqmlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSqmlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSqmlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSqml.g"; }



     	private SqmlGrammarAccess grammarAccess;

        public InternalSqmlParser(TokenStream input, SqmlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SqmlFile";
       	}

       	@Override
       	protected SqmlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSqmlFile"
    // InternalSqml.g:65:1: entryRuleSqmlFile returns [EObject current=null] : iv_ruleSqmlFile= ruleSqmlFile EOF ;
    public final EObject entryRuleSqmlFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlFile = null;


        try {
            // InternalSqml.g:65:49: (iv_ruleSqmlFile= ruleSqmlFile EOF )
            // InternalSqml.g:66:2: iv_ruleSqmlFile= ruleSqmlFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlFileRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlFile=ruleSqmlFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlFile; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlFile"


    // $ANTLR start "ruleSqmlFile"
    // InternalSqml.g:72:1: ruleSqmlFile returns [EObject current=null] : ( ( (lv_packageDeclaration_0_0= ruleSqmlPackageDeclaration ) ) ( (lv_imports_1_0= ruleSqmlImport ) )* ( (lv_elements_2_0= ruleSqmlFileElement ) )* ) ;
    public final EObject ruleSqmlFile() throws RecognitionException {
        EObject current = null;

        EObject lv_packageDeclaration_0_0 = null;

        EObject lv_imports_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:78:2: ( ( ( (lv_packageDeclaration_0_0= ruleSqmlPackageDeclaration ) ) ( (lv_imports_1_0= ruleSqmlImport ) )* ( (lv_elements_2_0= ruleSqmlFileElement ) )* ) )
            // InternalSqml.g:79:2: ( ( (lv_packageDeclaration_0_0= ruleSqmlPackageDeclaration ) ) ( (lv_imports_1_0= ruleSqmlImport ) )* ( (lv_elements_2_0= ruleSqmlFileElement ) )* )
            {
            // InternalSqml.g:79:2: ( ( (lv_packageDeclaration_0_0= ruleSqmlPackageDeclaration ) ) ( (lv_imports_1_0= ruleSqmlImport ) )* ( (lv_elements_2_0= ruleSqmlFileElement ) )* )
            // InternalSqml.g:80:3: ( (lv_packageDeclaration_0_0= ruleSqmlPackageDeclaration ) ) ( (lv_imports_1_0= ruleSqmlImport ) )* ( (lv_elements_2_0= ruleSqmlFileElement ) )*
            {
            // InternalSqml.g:80:3: ( (lv_packageDeclaration_0_0= ruleSqmlPackageDeclaration ) )
            // InternalSqml.g:81:4: (lv_packageDeclaration_0_0= ruleSqmlPackageDeclaration )
            {
            // InternalSqml.g:81:4: (lv_packageDeclaration_0_0= ruleSqmlPackageDeclaration )
            // InternalSqml.g:82:5: lv_packageDeclaration_0_0= ruleSqmlPackageDeclaration
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlFileAccess().getPackageDeclarationSqmlPackageDeclarationParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_packageDeclaration_0_0=ruleSqmlPackageDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlFileRule());
              					}
              					set(
              						current,
              						"packageDeclaration",
              						lv_packageDeclaration_0_0,
              						"com.softicar.sqml.Sqml.SqmlPackageDeclaration");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSqml.g:99:3: ( (lv_imports_1_0= ruleSqmlImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSqml.g:100:4: (lv_imports_1_0= ruleSqmlImport )
            	    {
            	    // InternalSqml.g:100:4: (lv_imports_1_0= ruleSqmlImport )
            	    // InternalSqml.g:101:5: lv_imports_1_0= ruleSqmlImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSqmlFileAccess().getImportsSqmlImportParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_imports_1_0=ruleSqmlImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSqmlFileRule());
            	      					}
            	      					add(
            	      						current,
            	      						"imports",
            	      						lv_imports_1_0,
            	      						"com.softicar.sqml.Sqml.SqmlImport");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalSqml.g:118:3: ( (lv_elements_2_0= ruleSqmlFileElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22||LA2_0==25||LA2_0==28||LA2_0==55||LA2_0==57) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSqml.g:119:4: (lv_elements_2_0= ruleSqmlFileElement )
            	    {
            	    // InternalSqml.g:119:4: (lv_elements_2_0= ruleSqmlFileElement )
            	    // InternalSqml.g:120:5: lv_elements_2_0= ruleSqmlFileElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSqmlFileAccess().getElementsSqmlFileElementParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_elements_2_0=ruleSqmlFileElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSqmlFileRule());
            	      					}
            	      					add(
            	      						current,
            	      						"elements",
            	      						lv_elements_2_0,
            	      						"com.softicar.sqml.Sqml.SqmlFileElement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlFile"


    // $ANTLR start "entryRuleSqmlPackageDeclaration"
    // InternalSqml.g:141:1: entryRuleSqmlPackageDeclaration returns [EObject current=null] : iv_ruleSqmlPackageDeclaration= ruleSqmlPackageDeclaration EOF ;
    public final EObject entryRuleSqmlPackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlPackageDeclaration = null;


        try {
            // InternalSqml.g:141:63: (iv_ruleSqmlPackageDeclaration= ruleSqmlPackageDeclaration EOF )
            // InternalSqml.g:142:2: iv_ruleSqmlPackageDeclaration= ruleSqmlPackageDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlPackageDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlPackageDeclaration=ruleSqmlPackageDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlPackageDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlPackageDeclaration"


    // $ANTLR start "ruleSqmlPackageDeclaration"
    // InternalSqml.g:148:1: ruleSqmlPackageDeclaration returns [EObject current=null] : (otherlv_0= 'PACKAGE' ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleSqmlPackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:154:2: ( (otherlv_0= 'PACKAGE' ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // InternalSqml.g:155:2: (otherlv_0= 'PACKAGE' ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // InternalSqml.g:155:2: (otherlv_0= 'PACKAGE' ( (lv_name_1_0= ruleQualifiedName ) ) )
            // InternalSqml.g:156:3: otherlv_0= 'PACKAGE' ( (lv_name_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSqmlPackageDeclarationAccess().getPACKAGEKeyword_0());
              		
            }
            // InternalSqml.g:160:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalSqml.g:161:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalSqml.g:161:4: (lv_name_1_0= ruleQualifiedName )
            // InternalSqml.g:162:5: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlPackageDeclarationRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.softicar.sqml.Sqml.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlPackageDeclaration"


    // $ANTLR start "entryRuleSqmlImport"
    // InternalSqml.g:183:1: entryRuleSqmlImport returns [EObject current=null] : iv_ruleSqmlImport= ruleSqmlImport EOF ;
    public final EObject entryRuleSqmlImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlImport = null;


        try {
            // InternalSqml.g:183:51: (iv_ruleSqmlImport= ruleSqmlImport EOF )
            // InternalSqml.g:184:2: iv_ruleSqmlImport= ruleSqmlImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlImport=ruleSqmlImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlImport; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlImport"


    // $ANTLR start "ruleSqmlImport"
    // InternalSqml.g:190:1: ruleSqmlImport returns [EObject current=null] : (otherlv_0= 'IMPORT' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleSqmlImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSqml.g:196:2: ( (otherlv_0= 'IMPORT' ( ( ruleQualifiedName ) ) ) )
            // InternalSqml.g:197:2: (otherlv_0= 'IMPORT' ( ( ruleQualifiedName ) ) )
            {
            // InternalSqml.g:197:2: (otherlv_0= 'IMPORT' ( ( ruleQualifiedName ) ) )
            // InternalSqml.g:198:3: otherlv_0= 'IMPORT' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSqmlImportAccess().getIMPORTKeyword_0());
              		
            }
            // InternalSqml.g:202:3: ( ( ruleQualifiedName ) )
            // InternalSqml.g:203:4: ( ruleQualifiedName )
            {
            // InternalSqml.g:203:4: ( ruleQualifiedName )
            // InternalSqml.g:204:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSqmlImportRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlImportAccess().getTargetISqmlGlobalObjectCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlImport"


    // $ANTLR start "entryRuleSqmlFileElement"
    // InternalSqml.g:222:1: entryRuleSqmlFileElement returns [EObject current=null] : iv_ruleSqmlFileElement= ruleSqmlFileElement EOF ;
    public final EObject entryRuleSqmlFileElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlFileElement = null;


        try {
            // InternalSqml.g:222:56: (iv_ruleSqmlFileElement= ruleSqmlFileElement EOF )
            // InternalSqml.g:223:2: iv_ruleSqmlFileElement= ruleSqmlFileElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlFileElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlFileElement=ruleSqmlFileElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlFileElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlFileElement"


    // $ANTLR start "ruleSqmlFileElement"
    // InternalSqml.g:229:1: ruleSqmlFileElement returns [EObject current=null] : (this_SqmlValueType_0= ruleSqmlValueType | this_SqmlTable_1= ruleSqmlTable | this_SqmlQuery_2= ruleSqmlQuery | this_SqmlFunction_3= ruleSqmlFunction ) ;
    public final EObject ruleSqmlFileElement() throws RecognitionException {
        EObject current = null;

        EObject this_SqmlValueType_0 = null;

        EObject this_SqmlTable_1 = null;

        EObject this_SqmlQuery_2 = null;

        EObject this_SqmlFunction_3 = null;



        	enterRule();

        try {
            // InternalSqml.g:235:2: ( (this_SqmlValueType_0= ruleSqmlValueType | this_SqmlTable_1= ruleSqmlTable | this_SqmlQuery_2= ruleSqmlQuery | this_SqmlFunction_3= ruleSqmlFunction ) )
            // InternalSqml.g:236:2: (this_SqmlValueType_0= ruleSqmlValueType | this_SqmlTable_1= ruleSqmlTable | this_SqmlQuery_2= ruleSqmlQuery | this_SqmlFunction_3= ruleSqmlFunction )
            {
            // InternalSqml.g:236:2: (this_SqmlValueType_0= ruleSqmlValueType | this_SqmlTable_1= ruleSqmlTable | this_SqmlQuery_2= ruleSqmlQuery | this_SqmlFunction_3= ruleSqmlFunction )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt3=1;
                }
                break;
            case 25:
            case 28:
                {
                alt3=2;
                }
                break;
            case 55:
                {
                alt3=3;
                }
                break;
            case 57:
                {
                alt3=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSqml.g:237:3: this_SqmlValueType_0= ruleSqmlValueType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlFileElementAccess().getSqmlValueTypeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlValueType_0=ruleSqmlValueType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlValueType_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSqml.g:246:3: this_SqmlTable_1= ruleSqmlTable
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlFileElementAccess().getSqmlTableParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlTable_1=ruleSqmlTable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlTable_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSqml.g:255:3: this_SqmlQuery_2= ruleSqmlQuery
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlFileElementAccess().getSqmlQueryParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlQuery_2=ruleSqmlQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlQuery_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSqml.g:264:3: this_SqmlFunction_3= ruleSqmlFunction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlFileElementAccess().getSqmlFunctionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlFunction_3=ruleSqmlFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlFunction_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlFileElement"


    // $ANTLR start "entryRuleSqmlTypeReference"
    // InternalSqml.g:276:1: entryRuleSqmlTypeReference returns [EObject current=null] : iv_ruleSqmlTypeReference= ruleSqmlTypeReference EOF ;
    public final EObject entryRuleSqmlTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlTypeReference = null;


        try {
            // InternalSqml.g:276:58: (iv_ruleSqmlTypeReference= ruleSqmlTypeReference EOF )
            // InternalSqml.g:277:2: iv_ruleSqmlTypeReference= ruleSqmlTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlTypeReference=ruleSqmlTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlTypeReference"


    // $ANTLR start "ruleSqmlTypeReference"
    // InternalSqml.g:283:1: ruleSqmlTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_typeParameters_2_0= ruleSqmlTypeReference ) ) (otherlv_3= ',' ( (lv_typeParameters_4_0= ruleSqmlTypeReference ) ) )* otherlv_5= '>' )? ( ( (lv_list_6_0= '[' ) ) otherlv_7= ']' )? ) ;
    public final EObject ruleSqmlTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_list_6_0=null;
        Token otherlv_7=null;
        EObject lv_typeParameters_2_0 = null;

        EObject lv_typeParameters_4_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:289:2: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_typeParameters_2_0= ruleSqmlTypeReference ) ) (otherlv_3= ',' ( (lv_typeParameters_4_0= ruleSqmlTypeReference ) ) )* otherlv_5= '>' )? ( ( (lv_list_6_0= '[' ) ) otherlv_7= ']' )? ) )
            // InternalSqml.g:290:2: ( ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_typeParameters_2_0= ruleSqmlTypeReference ) ) (otherlv_3= ',' ( (lv_typeParameters_4_0= ruleSqmlTypeReference ) ) )* otherlv_5= '>' )? ( ( (lv_list_6_0= '[' ) ) otherlv_7= ']' )? )
            {
            // InternalSqml.g:290:2: ( ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_typeParameters_2_0= ruleSqmlTypeReference ) ) (otherlv_3= ',' ( (lv_typeParameters_4_0= ruleSqmlTypeReference ) ) )* otherlv_5= '>' )? ( ( (lv_list_6_0= '[' ) ) otherlv_7= ']' )? )
            // InternalSqml.g:291:3: ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_typeParameters_2_0= ruleSqmlTypeReference ) ) (otherlv_3= ',' ( (lv_typeParameters_4_0= ruleSqmlTypeReference ) ) )* otherlv_5= '>' )? ( ( (lv_list_6_0= '[' ) ) otherlv_7= ']' )?
            {
            // InternalSqml.g:291:3: ( ( ruleQualifiedName ) )
            // InternalSqml.g:292:4: ( ruleQualifiedName )
            {
            // InternalSqml.g:292:4: ( ruleQualifiedName )
            // InternalSqml.g:293:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSqmlTypeReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlTypeReferenceAccess().getTypeDefinitionISqmlTypeDefinitionCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSqml.g:307:3: (otherlv_1= '<' ( (lv_typeParameters_2_0= ruleSqmlTypeReference ) ) (otherlv_3= ',' ( (lv_typeParameters_4_0= ruleSqmlTypeReference ) ) )* otherlv_5= '>' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // InternalSqml.g:308:4: otherlv_1= '<' ( (lv_typeParameters_2_0= ruleSqmlTypeReference ) ) (otherlv_3= ',' ( (lv_typeParameters_4_0= ruleSqmlTypeReference ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSqmlTypeReferenceAccess().getLessThanSignKeyword_1_0());
                      			
                    }
                    // InternalSqml.g:312:4: ( (lv_typeParameters_2_0= ruleSqmlTypeReference ) )
                    // InternalSqml.g:313:5: (lv_typeParameters_2_0= ruleSqmlTypeReference )
                    {
                    // InternalSqml.g:313:5: (lv_typeParameters_2_0= ruleSqmlTypeReference )
                    // InternalSqml.g:314:6: lv_typeParameters_2_0= ruleSqmlTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSqmlTypeReferenceAccess().getTypeParametersSqmlTypeReferenceParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_7);
                    lv_typeParameters_2_0=ruleSqmlTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSqmlTypeReferenceRule());
                      						}
                      						add(
                      							current,
                      							"typeParameters",
                      							lv_typeParameters_2_0,
                      							"com.softicar.sqml.Sqml.SqmlTypeReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSqml.g:331:4: (otherlv_3= ',' ( (lv_typeParameters_4_0= ruleSqmlTypeReference ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==18) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSqml.g:332:5: otherlv_3= ',' ( (lv_typeParameters_4_0= ruleSqmlTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getSqmlTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalSqml.g:336:5: ( (lv_typeParameters_4_0= ruleSqmlTypeReference ) )
                    	    // InternalSqml.g:337:6: (lv_typeParameters_4_0= ruleSqmlTypeReference )
                    	    {
                    	    // InternalSqml.g:337:6: (lv_typeParameters_4_0= ruleSqmlTypeReference )
                    	    // InternalSqml.g:338:7: lv_typeParameters_4_0= ruleSqmlTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSqmlTypeReferenceAccess().getTypeParametersSqmlTypeReferenceParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_7);
                    	    lv_typeParameters_4_0=ruleSqmlTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSqmlTypeReferenceRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"typeParameters",
                    	      								lv_typeParameters_4_0,
                    	      								"com.softicar.sqml.Sqml.SqmlTypeReference");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,19,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getSqmlTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                      			
                    }

                    }
                    break;

            }

            // InternalSqml.g:361:3: ( ( (lv_list_6_0= '[' ) ) otherlv_7= ']' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSqml.g:362:4: ( (lv_list_6_0= '[' ) ) otherlv_7= ']'
                    {
                    // InternalSqml.g:362:4: ( (lv_list_6_0= '[' ) )
                    // InternalSqml.g:363:5: (lv_list_6_0= '[' )
                    {
                    // InternalSqml.g:363:5: (lv_list_6_0= '[' )
                    // InternalSqml.g:364:6: lv_list_6_0= '['
                    {
                    lv_list_6_0=(Token)match(input,20,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_list_6_0, grammarAccess.getSqmlTypeReferenceAccess().getListLeftSquareBracketKeyword_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSqmlTypeReferenceRule());
                      						}
                      						setWithLastConsumed(current, "list", lv_list_6_0 != null, "[");
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getSqmlTypeReferenceAccess().getRightSquareBracketKeyword_2_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlTypeReference"


    // $ANTLR start "entryRuleSqmlValueType"
    // InternalSqml.g:385:1: entryRuleSqmlValueType returns [EObject current=null] : iv_ruleSqmlValueType= ruleSqmlValueType EOF ;
    public final EObject entryRuleSqmlValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlValueType = null;


        try {
            // InternalSqml.g:385:54: (iv_ruleSqmlValueType= ruleSqmlValueType EOF )
            // InternalSqml.g:386:2: iv_ruleSqmlValueType= ruleSqmlValueType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlValueTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlValueType=ruleSqmlValueType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlValueType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlValueType"


    // $ANTLR start "ruleSqmlValueType"
    // InternalSqml.g:392:1: ruleSqmlValueType returns [EObject current=null] : (otherlv_0= 'VALUETYPE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleSqmlValueType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSqml.g:398:2: ( (otherlv_0= 'VALUETYPE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // InternalSqml.g:399:2: (otherlv_0= 'VALUETYPE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // InternalSqml.g:399:2: (otherlv_0= 'VALUETYPE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // InternalSqml.g:400:3: otherlv_0= 'VALUETYPE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSqmlValueTypeAccess().getVALUETYPEKeyword_0());
              		
            }
            // InternalSqml.g:404:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSqml.g:405:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSqml.g:405:4: (lv_name_1_0= RULE_ID )
            // InternalSqml.g:406:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getSqmlValueTypeAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSqmlValueTypeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSqmlValueTypeAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSqmlValueTypeAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlValueType"


    // $ANTLR start "entryRuleSqmlEnum"
    // InternalSqml.g:434:1: entryRuleSqmlEnum returns [EObject current=null] : iv_ruleSqmlEnum= ruleSqmlEnum EOF ;
    public final EObject entryRuleSqmlEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlEnum = null;


        try {
            // InternalSqml.g:434:49: (iv_ruleSqmlEnum= ruleSqmlEnum EOF )
            // InternalSqml.g:435:2: iv_ruleSqmlEnum= ruleSqmlEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlEnumRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlEnum=ruleSqmlEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlEnum; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlEnum"


    // $ANTLR start "ruleSqmlEnum"
    // InternalSqml.g:441:1: ruleSqmlEnum returns [EObject current=null] : (otherlv_0= 'ENUM' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'ON' ( (lv_typeReference_3_0= ruleSqmlTypeReference ) ) )? otherlv_4= '{' ( (lv_enumerators_5_0= ruleSqmlEnumerator ) )* otherlv_6= '}' ) ;
    public final EObject ruleSqmlEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_typeReference_3_0 = null;

        EObject lv_enumerators_5_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:447:2: ( (otherlv_0= 'ENUM' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'ON' ( (lv_typeReference_3_0= ruleSqmlTypeReference ) ) )? otherlv_4= '{' ( (lv_enumerators_5_0= ruleSqmlEnumerator ) )* otherlv_6= '}' ) )
            // InternalSqml.g:448:2: (otherlv_0= 'ENUM' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'ON' ( (lv_typeReference_3_0= ruleSqmlTypeReference ) ) )? otherlv_4= '{' ( (lv_enumerators_5_0= ruleSqmlEnumerator ) )* otherlv_6= '}' )
            {
            // InternalSqml.g:448:2: (otherlv_0= 'ENUM' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'ON' ( (lv_typeReference_3_0= ruleSqmlTypeReference ) ) )? otherlv_4= '{' ( (lv_enumerators_5_0= ruleSqmlEnumerator ) )* otherlv_6= '}' )
            // InternalSqml.g:449:3: otherlv_0= 'ENUM' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'ON' ( (lv_typeReference_3_0= ruleSqmlTypeReference ) ) )? otherlv_4= '{' ( (lv_enumerators_5_0= ruleSqmlEnumerator ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSqmlEnumAccess().getENUMKeyword_0());
              		
            }
            // InternalSqml.g:453:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSqml.g:454:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSqml.g:454:4: (lv_name_1_0= RULE_ID )
            // InternalSqml.g:455:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getSqmlEnumAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSqmlEnumRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSqml.g:471:3: (otherlv_2= 'ON' ( (lv_typeReference_3_0= ruleSqmlTypeReference ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSqml.g:472:4: otherlv_2= 'ON' ( (lv_typeReference_3_0= ruleSqmlTypeReference ) )
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSqmlEnumAccess().getONKeyword_2_0());
                      			
                    }
                    // InternalSqml.g:476:4: ( (lv_typeReference_3_0= ruleSqmlTypeReference ) )
                    // InternalSqml.g:477:5: (lv_typeReference_3_0= ruleSqmlTypeReference )
                    {
                    // InternalSqml.g:477:5: (lv_typeReference_3_0= ruleSqmlTypeReference )
                    // InternalSqml.g:478:6: lv_typeReference_3_0= ruleSqmlTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSqmlEnumAccess().getTypeReferenceSqmlTypeReferenceParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    lv_typeReference_3_0=ruleSqmlTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSqmlEnumRule());
                      						}
                      						set(
                      							current,
                      							"typeReference",
                      							lv_typeReference_3_0,
                      							"com.softicar.sqml.Sqml.SqmlTypeReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,23,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSqmlEnumAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalSqml.g:500:3: ( (lv_enumerators_5_0= ruleSqmlEnumerator ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSqml.g:501:4: (lv_enumerators_5_0= ruleSqmlEnumerator )
            	    {
            	    // InternalSqml.g:501:4: (lv_enumerators_5_0= ruleSqmlEnumerator )
            	    // InternalSqml.g:502:5: lv_enumerators_5_0= ruleSqmlEnumerator
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSqmlEnumAccess().getEnumeratorsSqmlEnumeratorParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_enumerators_5_0=ruleSqmlEnumerator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSqmlEnumRule());
            	      					}
            	      					add(
            	      						current,
            	      						"enumerators",
            	      						lv_enumerators_5_0,
            	      						"com.softicar.sqml.Sqml.SqmlEnumerator");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getSqmlEnumAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlEnum"


    // $ANTLR start "entryRuleSqmlEnumerator"
    // InternalSqml.g:527:1: entryRuleSqmlEnumerator returns [EObject current=null] : iv_ruleSqmlEnumerator= ruleSqmlEnumerator EOF ;
    public final EObject entryRuleSqmlEnumerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlEnumerator = null;


        try {
            // InternalSqml.g:527:55: (iv_ruleSqmlEnumerator= ruleSqmlEnumerator EOF )
            // InternalSqml.g:528:2: iv_ruleSqmlEnumerator= ruleSqmlEnumerator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlEnumeratorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlEnumerator=ruleSqmlEnumerator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlEnumerator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlEnumerator"


    // $ANTLR start "ruleSqmlEnumerator"
    // InternalSqml.g:534:1: ruleSqmlEnumerator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleSqmlLiteral ) ) )? ) ;
    public final EObject ruleSqmlEnumerator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:540:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleSqmlLiteral ) ) )? ) )
            // InternalSqml.g:541:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleSqmlLiteral ) ) )? )
            {
            // InternalSqml.g:541:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleSqmlLiteral ) ) )? )
            // InternalSqml.g:542:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleSqmlLiteral ) ) )?
            {
            // InternalSqml.g:542:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSqml.g:543:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSqml.g:543:4: (lv_name_0_0= RULE_ID )
            // InternalSqml.g:544:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getSqmlEnumeratorAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSqmlEnumeratorRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSqml.g:560:3: (otherlv_1= '=' ( (lv_value_2_0= ruleSqmlLiteral ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSqml.g:561:4: otherlv_1= '=' ( (lv_value_2_0= ruleSqmlLiteral ) )
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSqmlEnumeratorAccess().getEqualsSignKeyword_1_0());
                      			
                    }
                    // InternalSqml.g:565:4: ( (lv_value_2_0= ruleSqmlLiteral ) )
                    // InternalSqml.g:566:5: (lv_value_2_0= ruleSqmlLiteral )
                    {
                    // InternalSqml.g:566:5: (lv_value_2_0= ruleSqmlLiteral )
                    // InternalSqml.g:567:6: lv_value_2_0= ruleSqmlLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSqmlEnumeratorAccess().getValueSqmlLiteralParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleSqmlLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSqmlEnumeratorRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_2_0,
                      							"com.softicar.sqml.Sqml.SqmlLiteral");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlEnumerator"


    // $ANTLR start "entryRuleSqmlTable"
    // InternalSqml.g:589:1: entryRuleSqmlTable returns [EObject current=null] : iv_ruleSqmlTable= ruleSqmlTable EOF ;
    public final EObject entryRuleSqmlTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlTable = null;


        try {
            // InternalSqml.g:589:50: (iv_ruleSqmlTable= ruleSqmlTable EOF )
            // InternalSqml.g:590:2: iv_ruleSqmlTable= ruleSqmlTable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlTableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlTable=ruleSqmlTable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlTable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlTable"


    // $ANTLR start "ruleSqmlTable"
    // InternalSqml.g:596:1: ruleSqmlTable returns [EObject current=null] : ( ( (lv_enumTable_0_0= 'ENUM' ) )? otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) ( (lv_physicalNameOverride_3_0= RULE_STRING ) ) otherlv_4= '{' ( (lv_columns_5_0= ruleSqmlTableColumn ) )* ( (lv_tableKeys_6_0= ruleSqmlTableKey ) )* ( (lv_enums_7_0= ruleSqmlEnum ) )* ( (lv_rows_8_0= ruleSqmlTableRow ) )* otherlv_9= '}' ) ;
    public final EObject ruleSqmlTable() throws RecognitionException {
        EObject current = null;

        Token lv_enumTable_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_physicalNameOverride_3_0=null;
        Token otherlv_4=null;
        Token otherlv_9=null;
        EObject lv_columns_5_0 = null;

        EObject lv_tableKeys_6_0 = null;

        EObject lv_enums_7_0 = null;

        EObject lv_rows_8_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:602:2: ( ( ( (lv_enumTable_0_0= 'ENUM' ) )? otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) ( (lv_physicalNameOverride_3_0= RULE_STRING ) ) otherlv_4= '{' ( (lv_columns_5_0= ruleSqmlTableColumn ) )* ( (lv_tableKeys_6_0= ruleSqmlTableKey ) )* ( (lv_enums_7_0= ruleSqmlEnum ) )* ( (lv_rows_8_0= ruleSqmlTableRow ) )* otherlv_9= '}' ) )
            // InternalSqml.g:603:2: ( ( (lv_enumTable_0_0= 'ENUM' ) )? otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) ( (lv_physicalNameOverride_3_0= RULE_STRING ) ) otherlv_4= '{' ( (lv_columns_5_0= ruleSqmlTableColumn ) )* ( (lv_tableKeys_6_0= ruleSqmlTableKey ) )* ( (lv_enums_7_0= ruleSqmlEnum ) )* ( (lv_rows_8_0= ruleSqmlTableRow ) )* otherlv_9= '}' )
            {
            // InternalSqml.g:603:2: ( ( (lv_enumTable_0_0= 'ENUM' ) )? otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) ( (lv_physicalNameOverride_3_0= RULE_STRING ) ) otherlv_4= '{' ( (lv_columns_5_0= ruleSqmlTableColumn ) )* ( (lv_tableKeys_6_0= ruleSqmlTableKey ) )* ( (lv_enums_7_0= ruleSqmlEnum ) )* ( (lv_rows_8_0= ruleSqmlTableRow ) )* otherlv_9= '}' )
            // InternalSqml.g:604:3: ( (lv_enumTable_0_0= 'ENUM' ) )? otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) ( (lv_physicalNameOverride_3_0= RULE_STRING ) ) otherlv_4= '{' ( (lv_columns_5_0= ruleSqmlTableColumn ) )* ( (lv_tableKeys_6_0= ruleSqmlTableKey ) )* ( (lv_enums_7_0= ruleSqmlEnum ) )* ( (lv_rows_8_0= ruleSqmlTableRow ) )* otherlv_9= '}'
            {
            // InternalSqml.g:604:3: ( (lv_enumTable_0_0= 'ENUM' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSqml.g:605:4: (lv_enumTable_0_0= 'ENUM' )
                    {
                    // InternalSqml.g:605:4: (lv_enumTable_0_0= 'ENUM' )
                    // InternalSqml.g:606:5: lv_enumTable_0_0= 'ENUM'
                    {
                    lv_enumTable_0_0=(Token)match(input,25,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_enumTable_0_0, grammarAccess.getSqmlTableAccess().getEnumTableENUMKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlTableRule());
                      					}
                      					setWithLastConsumed(current, "enumTable", lv_enumTable_0_0 != null, "ENUM");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,28,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSqmlTableAccess().getTABLEKeyword_1());
              		
            }
            // InternalSqml.g:622:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSqml.g:623:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSqml.g:623:4: (lv_name_2_0= RULE_ID )
            // InternalSqml.g:624:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getSqmlTableAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSqmlTableRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSqml.g:640:3: ( (lv_physicalNameOverride_3_0= RULE_STRING ) )
            // InternalSqml.g:641:4: (lv_physicalNameOverride_3_0= RULE_STRING )
            {
            // InternalSqml.g:641:4: (lv_physicalNameOverride_3_0= RULE_STRING )
            // InternalSqml.g:642:5: lv_physicalNameOverride_3_0= RULE_STRING
            {
            lv_physicalNameOverride_3_0=(Token)match(input,RULE_STRING,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_physicalNameOverride_3_0, grammarAccess.getSqmlTableAccess().getPhysicalNameOverrideSTRINGTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSqmlTableRule());
              					}
              					setWithLastConsumed(
              						current,
              						"physicalNameOverride",
              						lv_physicalNameOverride_3_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSqmlTableAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalSqml.g:662:3: ( (lv_columns_5_0= ruleSqmlTableColumn ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSqml.g:663:4: (lv_columns_5_0= ruleSqmlTableColumn )
            	    {
            	    // InternalSqml.g:663:4: (lv_columns_5_0= ruleSqmlTableColumn )
            	    // InternalSqml.g:664:5: lv_columns_5_0= ruleSqmlTableColumn
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSqmlTableAccess().getColumnsSqmlTableColumnParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_columns_5_0=ruleSqmlTableColumn();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSqmlTableRule());
            	      					}
            	      					add(
            	      						current,
            	      						"columns",
            	      						lv_columns_5_0,
            	      						"com.softicar.sqml.Sqml.SqmlTableColumn");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalSqml.g:681:3: ( (lv_tableKeys_6_0= ruleSqmlTableKey ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=52 && LA12_0<=53)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSqml.g:682:4: (lv_tableKeys_6_0= ruleSqmlTableKey )
            	    {
            	    // InternalSqml.g:682:4: (lv_tableKeys_6_0= ruleSqmlTableKey )
            	    // InternalSqml.g:683:5: lv_tableKeys_6_0= ruleSqmlTableKey
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSqmlTableAccess().getTableKeysSqmlTableKeyParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_tableKeys_6_0=ruleSqmlTableKey();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSqmlTableRule());
            	      					}
            	      					add(
            	      						current,
            	      						"tableKeys",
            	      						lv_tableKeys_6_0,
            	      						"com.softicar.sqml.Sqml.SqmlTableKey");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalSqml.g:700:3: ( (lv_enums_7_0= ruleSqmlEnum ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSqml.g:701:4: (lv_enums_7_0= ruleSqmlEnum )
            	    {
            	    // InternalSqml.g:701:4: (lv_enums_7_0= ruleSqmlEnum )
            	    // InternalSqml.g:702:5: lv_enums_7_0= ruleSqmlEnum
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSqmlTableAccess().getEnumsSqmlEnumParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_enums_7_0=ruleSqmlEnum();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSqmlTableRule());
            	      					}
            	      					add(
            	      						current,
            	      						"enums",
            	      						lv_enums_7_0,
            	      						"com.softicar.sqml.Sqml.SqmlEnum");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalSqml.g:719:3: ( (lv_rows_8_0= ruleSqmlTableRow ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==48) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSqml.g:720:4: (lv_rows_8_0= ruleSqmlTableRow )
            	    {
            	    // InternalSqml.g:720:4: (lv_rows_8_0= ruleSqmlTableRow )
            	    // InternalSqml.g:721:5: lv_rows_8_0= ruleSqmlTableRow
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSqmlTableAccess().getRowsSqmlTableRowParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_rows_8_0=ruleSqmlTableRow();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSqmlTableRule());
            	      					}
            	      					add(
            	      						current,
            	      						"rows",
            	      						lv_rows_8_0,
            	      						"com.softicar.sqml.Sqml.SqmlTableRow");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_9=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getSqmlTableAccess().getRightCurlyBracketKeyword_9());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlTable"


    // $ANTLR start "entryRuleSqmlTableColumn"
    // InternalSqml.g:746:1: entryRuleSqmlTableColumn returns [EObject current=null] : iv_ruleSqmlTableColumn= ruleSqmlTableColumn EOF ;
    public final EObject entryRuleSqmlTableColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlTableColumn = null;


        try {
            // InternalSqml.g:746:56: (iv_ruleSqmlTableColumn= ruleSqmlTableColumn EOF )
            // InternalSqml.g:747:2: iv_ruleSqmlTableColumn= ruleSqmlTableColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlTableColumnRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlTableColumn=ruleSqmlTableColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlTableColumn; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlTableColumn"


    // $ANTLR start "ruleSqmlTableColumn"
    // InternalSqml.g:753:1: ruleSqmlTableColumn returns [EObject current=null] : ( ( (lv_primaryKey_0_0= 'PK' ) )? ( (lv_typeReference_1_0= ruleSqmlTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( ( (lv_defaultValue_4_0= ruleSqmlDefaultValue ) ) | ( (lv_defaultNull_5_0= 'NULL' ) ) | ( (lv_defaultNow_6_0= 'NOW' ) ) | ( (lv_serial_7_0= 'SERIAL' ) ) | ( (lv_baseColumn_8_0= 'BASE' ) ) ) )? (otherlv_9= '[' ( ( ( ( ({...}? => ( ({...}? => ( (lv_nullable_11_0= 'NULLABLE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_timestamp_12_0= 'TIMESTAMP' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unsigned_13_0= 'UNSIGNED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ON' otherlv_15= 'DELETE' ( (lv_onDeleteAction_16_0= ruleSqmlForeignKeyAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'ON' otherlv_18= 'UPDATE' ( (lv_onUpdateAction_19_0= ruleSqmlForeignKeyAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ON' otherlv_21= 'UPDATE' ( (lv_onUpdateNow_22_0= 'NOW' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_physicalNameOverride_23_0= RULE_STRING ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'BITS' otherlv_25= '=' ( (lv_bits_26_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'PRECISION' otherlv_28= '=' ( (lv_precision_29_0= RULE_INT ) ) otherlv_30= ',' ( (lv_scale_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'MAXLENGTH' otherlv_33= '=' ( (lv_maxLength_34_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'LENGTHBITS' otherlv_36= '=' ( (lv_lengthBits_37_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'CHARACTER' otherlv_39= 'SET' otherlv_40= '=' ( (lv_characterSet_41_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'COLLATION' otherlv_43= '=' ( (lv_collation_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'COMMENT' otherlv_46= '=' ( (lv_comment_47_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'CONSTRAINT_NAME' otherlv_49= '=' ( (lv_constraintName_50_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_51= ']' )? ) ;
    public final EObject ruleSqmlTableColumn() throws RecognitionException {
        EObject current = null;

        Token lv_primaryKey_0_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_defaultNull_5_0=null;
        Token lv_defaultNow_6_0=null;
        Token lv_serial_7_0=null;
        Token lv_baseColumn_8_0=null;
        Token otherlv_9=null;
        Token lv_nullable_11_0=null;
        Token lv_timestamp_12_0=null;
        Token lv_unsigned_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_onUpdateNow_22_0=null;
        Token lv_physicalNameOverride_23_0=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token lv_bits_26_0=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token lv_precision_29_0=null;
        Token otherlv_30=null;
        Token lv_scale_31_0=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token lv_maxLength_34_0=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token lv_lengthBits_37_0=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token lv_characterSet_41_0=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token lv_collation_44_0=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token lv_comment_47_0=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token lv_constraintName_50_0=null;
        Token otherlv_51=null;
        EObject lv_typeReference_1_0 = null;

        EObject lv_defaultValue_4_0 = null;

        Enumerator lv_onDeleteAction_16_0 = null;

        Enumerator lv_onUpdateAction_19_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:759:2: ( ( ( (lv_primaryKey_0_0= 'PK' ) )? ( (lv_typeReference_1_0= ruleSqmlTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( ( (lv_defaultValue_4_0= ruleSqmlDefaultValue ) ) | ( (lv_defaultNull_5_0= 'NULL' ) ) | ( (lv_defaultNow_6_0= 'NOW' ) ) | ( (lv_serial_7_0= 'SERIAL' ) ) | ( (lv_baseColumn_8_0= 'BASE' ) ) ) )? (otherlv_9= '[' ( ( ( ( ({...}? => ( ({...}? => ( (lv_nullable_11_0= 'NULLABLE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_timestamp_12_0= 'TIMESTAMP' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unsigned_13_0= 'UNSIGNED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ON' otherlv_15= 'DELETE' ( (lv_onDeleteAction_16_0= ruleSqmlForeignKeyAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'ON' otherlv_18= 'UPDATE' ( (lv_onUpdateAction_19_0= ruleSqmlForeignKeyAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ON' otherlv_21= 'UPDATE' ( (lv_onUpdateNow_22_0= 'NOW' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_physicalNameOverride_23_0= RULE_STRING ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'BITS' otherlv_25= '=' ( (lv_bits_26_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'PRECISION' otherlv_28= '=' ( (lv_precision_29_0= RULE_INT ) ) otherlv_30= ',' ( (lv_scale_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'MAXLENGTH' otherlv_33= '=' ( (lv_maxLength_34_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'LENGTHBITS' otherlv_36= '=' ( (lv_lengthBits_37_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'CHARACTER' otherlv_39= 'SET' otherlv_40= '=' ( (lv_characterSet_41_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'COLLATION' otherlv_43= '=' ( (lv_collation_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'COMMENT' otherlv_46= '=' ( (lv_comment_47_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'CONSTRAINT_NAME' otherlv_49= '=' ( (lv_constraintName_50_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_51= ']' )? ) )
            // InternalSqml.g:760:2: ( ( (lv_primaryKey_0_0= 'PK' ) )? ( (lv_typeReference_1_0= ruleSqmlTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( ( (lv_defaultValue_4_0= ruleSqmlDefaultValue ) ) | ( (lv_defaultNull_5_0= 'NULL' ) ) | ( (lv_defaultNow_6_0= 'NOW' ) ) | ( (lv_serial_7_0= 'SERIAL' ) ) | ( (lv_baseColumn_8_0= 'BASE' ) ) ) )? (otherlv_9= '[' ( ( ( ( ({...}? => ( ({...}? => ( (lv_nullable_11_0= 'NULLABLE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_timestamp_12_0= 'TIMESTAMP' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unsigned_13_0= 'UNSIGNED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ON' otherlv_15= 'DELETE' ( (lv_onDeleteAction_16_0= ruleSqmlForeignKeyAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'ON' otherlv_18= 'UPDATE' ( (lv_onUpdateAction_19_0= ruleSqmlForeignKeyAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ON' otherlv_21= 'UPDATE' ( (lv_onUpdateNow_22_0= 'NOW' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_physicalNameOverride_23_0= RULE_STRING ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'BITS' otherlv_25= '=' ( (lv_bits_26_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'PRECISION' otherlv_28= '=' ( (lv_precision_29_0= RULE_INT ) ) otherlv_30= ',' ( (lv_scale_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'MAXLENGTH' otherlv_33= '=' ( (lv_maxLength_34_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'LENGTHBITS' otherlv_36= '=' ( (lv_lengthBits_37_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'CHARACTER' otherlv_39= 'SET' otherlv_40= '=' ( (lv_characterSet_41_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'COLLATION' otherlv_43= '=' ( (lv_collation_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'COMMENT' otherlv_46= '=' ( (lv_comment_47_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'CONSTRAINT_NAME' otherlv_49= '=' ( (lv_constraintName_50_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_51= ']' )? )
            {
            // InternalSqml.g:760:2: ( ( (lv_primaryKey_0_0= 'PK' ) )? ( (lv_typeReference_1_0= ruleSqmlTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( ( (lv_defaultValue_4_0= ruleSqmlDefaultValue ) ) | ( (lv_defaultNull_5_0= 'NULL' ) ) | ( (lv_defaultNow_6_0= 'NOW' ) ) | ( (lv_serial_7_0= 'SERIAL' ) ) | ( (lv_baseColumn_8_0= 'BASE' ) ) ) )? (otherlv_9= '[' ( ( ( ( ({...}? => ( ({...}? => ( (lv_nullable_11_0= 'NULLABLE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_timestamp_12_0= 'TIMESTAMP' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unsigned_13_0= 'UNSIGNED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ON' otherlv_15= 'DELETE' ( (lv_onDeleteAction_16_0= ruleSqmlForeignKeyAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'ON' otherlv_18= 'UPDATE' ( (lv_onUpdateAction_19_0= ruleSqmlForeignKeyAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ON' otherlv_21= 'UPDATE' ( (lv_onUpdateNow_22_0= 'NOW' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_physicalNameOverride_23_0= RULE_STRING ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'BITS' otherlv_25= '=' ( (lv_bits_26_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'PRECISION' otherlv_28= '=' ( (lv_precision_29_0= RULE_INT ) ) otherlv_30= ',' ( (lv_scale_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'MAXLENGTH' otherlv_33= '=' ( (lv_maxLength_34_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'LENGTHBITS' otherlv_36= '=' ( (lv_lengthBits_37_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'CHARACTER' otherlv_39= 'SET' otherlv_40= '=' ( (lv_characterSet_41_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'COLLATION' otherlv_43= '=' ( (lv_collation_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'COMMENT' otherlv_46= '=' ( (lv_comment_47_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'CONSTRAINT_NAME' otherlv_49= '=' ( (lv_constraintName_50_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_51= ']' )? )
            // InternalSqml.g:761:3: ( (lv_primaryKey_0_0= 'PK' ) )? ( (lv_typeReference_1_0= ruleSqmlTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( ( (lv_defaultValue_4_0= ruleSqmlDefaultValue ) ) | ( (lv_defaultNull_5_0= 'NULL' ) ) | ( (lv_defaultNow_6_0= 'NOW' ) ) | ( (lv_serial_7_0= 'SERIAL' ) ) | ( (lv_baseColumn_8_0= 'BASE' ) ) ) )? (otherlv_9= '[' ( ( ( ( ({...}? => ( ({...}? => ( (lv_nullable_11_0= 'NULLABLE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_timestamp_12_0= 'TIMESTAMP' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unsigned_13_0= 'UNSIGNED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ON' otherlv_15= 'DELETE' ( (lv_onDeleteAction_16_0= ruleSqmlForeignKeyAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'ON' otherlv_18= 'UPDATE' ( (lv_onUpdateAction_19_0= ruleSqmlForeignKeyAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ON' otherlv_21= 'UPDATE' ( (lv_onUpdateNow_22_0= 'NOW' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_physicalNameOverride_23_0= RULE_STRING ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'BITS' otherlv_25= '=' ( (lv_bits_26_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'PRECISION' otherlv_28= '=' ( (lv_precision_29_0= RULE_INT ) ) otherlv_30= ',' ( (lv_scale_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'MAXLENGTH' otherlv_33= '=' ( (lv_maxLength_34_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'LENGTHBITS' otherlv_36= '=' ( (lv_lengthBits_37_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'CHARACTER' otherlv_39= 'SET' otherlv_40= '=' ( (lv_characterSet_41_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'COLLATION' otherlv_43= '=' ( (lv_collation_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'COMMENT' otherlv_46= '=' ( (lv_comment_47_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'CONSTRAINT_NAME' otherlv_49= '=' ( (lv_constraintName_50_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_51= ']' )?
            {
            // InternalSqml.g:761:3: ( (lv_primaryKey_0_0= 'PK' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSqml.g:762:4: (lv_primaryKey_0_0= 'PK' )
                    {
                    // InternalSqml.g:762:4: (lv_primaryKey_0_0= 'PK' )
                    // InternalSqml.g:763:5: lv_primaryKey_0_0= 'PK'
                    {
                    lv_primaryKey_0_0=(Token)match(input,29,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_primaryKey_0_0, grammarAccess.getSqmlTableColumnAccess().getPrimaryKeyPKKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlTableColumnRule());
                      					}
                      					setWithLastConsumed(current, "primaryKey", lv_primaryKey_0_0 != null, "PK");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSqml.g:775:3: ( (lv_typeReference_1_0= ruleSqmlTypeReference ) )
            // InternalSqml.g:776:4: (lv_typeReference_1_0= ruleSqmlTypeReference )
            {
            // InternalSqml.g:776:4: (lv_typeReference_1_0= ruleSqmlTypeReference )
            // InternalSqml.g:777:5: lv_typeReference_1_0= ruleSqmlTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlTableColumnAccess().getTypeReferenceSqmlTypeReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_typeReference_1_0=ruleSqmlTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlTableColumnRule());
              					}
              					set(
              						current,
              						"typeReference",
              						lv_typeReference_1_0,
              						"com.softicar.sqml.Sqml.SqmlTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSqml.g:794:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSqml.g:795:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSqml.g:795:4: (lv_name_2_0= RULE_ID )
            // InternalSqml.g:796:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getSqmlTableColumnAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSqmlTableColumnRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSqml.g:812:3: (otherlv_3= '=' ( ( (lv_defaultValue_4_0= ruleSqmlDefaultValue ) ) | ( (lv_defaultNull_5_0= 'NULL' ) ) | ( (lv_defaultNow_6_0= 'NOW' ) ) | ( (lv_serial_7_0= 'SERIAL' ) ) | ( (lv_baseColumn_8_0= 'BASE' ) ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSqml.g:813:4: otherlv_3= '=' ( ( (lv_defaultValue_4_0= ruleSqmlDefaultValue ) ) | ( (lv_defaultNull_5_0= 'NULL' ) ) | ( (lv_defaultNow_6_0= 'NOW' ) ) | ( (lv_serial_7_0= 'SERIAL' ) ) | ( (lv_baseColumn_8_0= 'BASE' ) ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSqmlTableColumnAccess().getEqualsSignKeyword_3_0());
                      			
                    }
                    // InternalSqml.g:817:4: ( ( (lv_defaultValue_4_0= ruleSqmlDefaultValue ) ) | ( (lv_defaultNull_5_0= 'NULL' ) ) | ( (lv_defaultNow_6_0= 'NOW' ) ) | ( (lv_serial_7_0= 'SERIAL' ) ) | ( (lv_baseColumn_8_0= 'BASE' ) ) )
                    int alt16=5;
                    switch ( input.LA(1) ) {
                    case RULE_ID:
                    case RULE_STRING:
                    case RULE_INT:
                    case RULE_DECIMAL:
                    case RULE_LONG:
                    case RULE_FLOAT:
                    case RULE_DOUBLE:
                    case 49:
                    case 51:
                    case 74:
                    case 87:
                    case 101:
                        {
                        alt16=1;
                        }
                        break;
                    case 30:
                        {
                        alt16=2;
                        }
                        break;
                    case 31:
                        {
                        alt16=3;
                        }
                        break;
                    case 32:
                        {
                        alt16=4;
                        }
                        break;
                    case 33:
                        {
                        alt16=5;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }

                    switch (alt16) {
                        case 1 :
                            // InternalSqml.g:818:5: ( (lv_defaultValue_4_0= ruleSqmlDefaultValue ) )
                            {
                            // InternalSqml.g:818:5: ( (lv_defaultValue_4_0= ruleSqmlDefaultValue ) )
                            // InternalSqml.g:819:6: (lv_defaultValue_4_0= ruleSqmlDefaultValue )
                            {
                            // InternalSqml.g:819:6: (lv_defaultValue_4_0= ruleSqmlDefaultValue )
                            // InternalSqml.g:820:7: lv_defaultValue_4_0= ruleSqmlDefaultValue
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSqmlTableColumnAccess().getDefaultValueSqmlDefaultValueParserRuleCall_3_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_8);
                            lv_defaultValue_4_0=ruleSqmlDefaultValue();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSqmlTableColumnRule());
                              							}
                              							set(
                              								current,
                              								"defaultValue",
                              								lv_defaultValue_4_0,
                              								"com.softicar.sqml.Sqml.SqmlDefaultValue");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSqml.g:838:5: ( (lv_defaultNull_5_0= 'NULL' ) )
                            {
                            // InternalSqml.g:838:5: ( (lv_defaultNull_5_0= 'NULL' ) )
                            // InternalSqml.g:839:6: (lv_defaultNull_5_0= 'NULL' )
                            {
                            // InternalSqml.g:839:6: (lv_defaultNull_5_0= 'NULL' )
                            // InternalSqml.g:840:7: lv_defaultNull_5_0= 'NULL'
                            {
                            lv_defaultNull_5_0=(Token)match(input,30,FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_defaultNull_5_0, grammarAccess.getSqmlTableColumnAccess().getDefaultNullNULLKeyword_3_1_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSqmlTableColumnRule());
                              							}
                              							setWithLastConsumed(current, "defaultNull", lv_defaultNull_5_0 != null, "NULL");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalSqml.g:853:5: ( (lv_defaultNow_6_0= 'NOW' ) )
                            {
                            // InternalSqml.g:853:5: ( (lv_defaultNow_6_0= 'NOW' ) )
                            // InternalSqml.g:854:6: (lv_defaultNow_6_0= 'NOW' )
                            {
                            // InternalSqml.g:854:6: (lv_defaultNow_6_0= 'NOW' )
                            // InternalSqml.g:855:7: lv_defaultNow_6_0= 'NOW'
                            {
                            lv_defaultNow_6_0=(Token)match(input,31,FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_defaultNow_6_0, grammarAccess.getSqmlTableColumnAccess().getDefaultNowNOWKeyword_3_1_2_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSqmlTableColumnRule());
                              							}
                              							setWithLastConsumed(current, "defaultNow", lv_defaultNow_6_0 != null, "NOW");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 4 :
                            // InternalSqml.g:868:5: ( (lv_serial_7_0= 'SERIAL' ) )
                            {
                            // InternalSqml.g:868:5: ( (lv_serial_7_0= 'SERIAL' ) )
                            // InternalSqml.g:869:6: (lv_serial_7_0= 'SERIAL' )
                            {
                            // InternalSqml.g:869:6: (lv_serial_7_0= 'SERIAL' )
                            // InternalSqml.g:870:7: lv_serial_7_0= 'SERIAL'
                            {
                            lv_serial_7_0=(Token)match(input,32,FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_serial_7_0, grammarAccess.getSqmlTableColumnAccess().getSerialSERIALKeyword_3_1_3_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSqmlTableColumnRule());
                              							}
                              							setWithLastConsumed(current, "serial", lv_serial_7_0 != null, "SERIAL");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 5 :
                            // InternalSqml.g:883:5: ( (lv_baseColumn_8_0= 'BASE' ) )
                            {
                            // InternalSqml.g:883:5: ( (lv_baseColumn_8_0= 'BASE' ) )
                            // InternalSqml.g:884:6: (lv_baseColumn_8_0= 'BASE' )
                            {
                            // InternalSqml.g:884:6: (lv_baseColumn_8_0= 'BASE' )
                            // InternalSqml.g:885:7: lv_baseColumn_8_0= 'BASE'
                            {
                            lv_baseColumn_8_0=(Token)match(input,33,FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_baseColumn_8_0, grammarAccess.getSqmlTableColumnAccess().getBaseColumnBASEKeyword_3_1_4_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSqmlTableColumnRule());
                              							}
                              							setWithLastConsumed(current, "baseColumn", lv_baseColumn_8_0 != null, "BASE");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalSqml.g:899:3: (otherlv_9= '[' ( ( ( ( ({...}? => ( ({...}? => ( (lv_nullable_11_0= 'NULLABLE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_timestamp_12_0= 'TIMESTAMP' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unsigned_13_0= 'UNSIGNED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ON' otherlv_15= 'DELETE' ( (lv_onDeleteAction_16_0= ruleSqmlForeignKeyAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'ON' otherlv_18= 'UPDATE' ( (lv_onUpdateAction_19_0= ruleSqmlForeignKeyAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ON' otherlv_21= 'UPDATE' ( (lv_onUpdateNow_22_0= 'NOW' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_physicalNameOverride_23_0= RULE_STRING ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'BITS' otherlv_25= '=' ( (lv_bits_26_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'PRECISION' otherlv_28= '=' ( (lv_precision_29_0= RULE_INT ) ) otherlv_30= ',' ( (lv_scale_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'MAXLENGTH' otherlv_33= '=' ( (lv_maxLength_34_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'LENGTHBITS' otherlv_36= '=' ( (lv_lengthBits_37_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'CHARACTER' otherlv_39= 'SET' otherlv_40= '=' ( (lv_characterSet_41_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'COLLATION' otherlv_43= '=' ( (lv_collation_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'COMMENT' otherlv_46= '=' ( (lv_comment_47_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'CONSTRAINT_NAME' otherlv_49= '=' ( (lv_constraintName_50_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_51= ']' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSqml.g:900:4: otherlv_9= '[' ( ( ( ( ({...}? => ( ({...}? => ( (lv_nullable_11_0= 'NULLABLE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_timestamp_12_0= 'TIMESTAMP' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unsigned_13_0= 'UNSIGNED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ON' otherlv_15= 'DELETE' ( (lv_onDeleteAction_16_0= ruleSqmlForeignKeyAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'ON' otherlv_18= 'UPDATE' ( (lv_onUpdateAction_19_0= ruleSqmlForeignKeyAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ON' otherlv_21= 'UPDATE' ( (lv_onUpdateNow_22_0= 'NOW' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_physicalNameOverride_23_0= RULE_STRING ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'BITS' otherlv_25= '=' ( (lv_bits_26_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'PRECISION' otherlv_28= '=' ( (lv_precision_29_0= RULE_INT ) ) otherlv_30= ',' ( (lv_scale_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'MAXLENGTH' otherlv_33= '=' ( (lv_maxLength_34_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'LENGTHBITS' otherlv_36= '=' ( (lv_lengthBits_37_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'CHARACTER' otherlv_39= 'SET' otherlv_40= '=' ( (lv_characterSet_41_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'COLLATION' otherlv_43= '=' ( (lv_collation_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'COMMENT' otherlv_46= '=' ( (lv_comment_47_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'CONSTRAINT_NAME' otherlv_49= '=' ( (lv_constraintName_50_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_51= ']'
                    {
                    otherlv_9=(Token)match(input,20,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getSqmlTableColumnAccess().getLeftSquareBracketKeyword_4_0());
                      			
                    }
                    // InternalSqml.g:904:4: ( ( ( ( ({...}? => ( ({...}? => ( (lv_nullable_11_0= 'NULLABLE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_timestamp_12_0= 'TIMESTAMP' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unsigned_13_0= 'UNSIGNED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ON' otherlv_15= 'DELETE' ( (lv_onDeleteAction_16_0= ruleSqmlForeignKeyAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'ON' otherlv_18= 'UPDATE' ( (lv_onUpdateAction_19_0= ruleSqmlForeignKeyAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ON' otherlv_21= 'UPDATE' ( (lv_onUpdateNow_22_0= 'NOW' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_physicalNameOverride_23_0= RULE_STRING ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'BITS' otherlv_25= '=' ( (lv_bits_26_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'PRECISION' otherlv_28= '=' ( (lv_precision_29_0= RULE_INT ) ) otherlv_30= ',' ( (lv_scale_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'MAXLENGTH' otherlv_33= '=' ( (lv_maxLength_34_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'LENGTHBITS' otherlv_36= '=' ( (lv_lengthBits_37_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'CHARACTER' otherlv_39= 'SET' otherlv_40= '=' ( (lv_characterSet_41_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'COLLATION' otherlv_43= '=' ( (lv_collation_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'COMMENT' otherlv_46= '=' ( (lv_comment_47_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'CONSTRAINT_NAME' otherlv_49= '=' ( (lv_constraintName_50_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
                    // InternalSqml.g:905:5: ( ( ( ({...}? => ( ({...}? => ( (lv_nullable_11_0= 'NULLABLE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_timestamp_12_0= 'TIMESTAMP' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unsigned_13_0= 'UNSIGNED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ON' otherlv_15= 'DELETE' ( (lv_onDeleteAction_16_0= ruleSqmlForeignKeyAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'ON' otherlv_18= 'UPDATE' ( (lv_onUpdateAction_19_0= ruleSqmlForeignKeyAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ON' otherlv_21= 'UPDATE' ( (lv_onUpdateNow_22_0= 'NOW' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_physicalNameOverride_23_0= RULE_STRING ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'BITS' otherlv_25= '=' ( (lv_bits_26_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'PRECISION' otherlv_28= '=' ( (lv_precision_29_0= RULE_INT ) ) otherlv_30= ',' ( (lv_scale_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'MAXLENGTH' otherlv_33= '=' ( (lv_maxLength_34_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'LENGTHBITS' otherlv_36= '=' ( (lv_lengthBits_37_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'CHARACTER' otherlv_39= 'SET' otherlv_40= '=' ( (lv_characterSet_41_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'COLLATION' otherlv_43= '=' ( (lv_collation_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'COMMENT' otherlv_46= '=' ( (lv_comment_47_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'CONSTRAINT_NAME' otherlv_49= '=' ( (lv_constraintName_50_0= RULE_STRING ) ) ) ) ) ) )* ) )
                    {
                    // InternalSqml.g:905:5: ( ( ( ({...}? => ( ({...}? => ( (lv_nullable_11_0= 'NULLABLE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_timestamp_12_0= 'TIMESTAMP' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unsigned_13_0= 'UNSIGNED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ON' otherlv_15= 'DELETE' ( (lv_onDeleteAction_16_0= ruleSqmlForeignKeyAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'ON' otherlv_18= 'UPDATE' ( (lv_onUpdateAction_19_0= ruleSqmlForeignKeyAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ON' otherlv_21= 'UPDATE' ( (lv_onUpdateNow_22_0= 'NOW' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_physicalNameOverride_23_0= RULE_STRING ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'BITS' otherlv_25= '=' ( (lv_bits_26_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'PRECISION' otherlv_28= '=' ( (lv_precision_29_0= RULE_INT ) ) otherlv_30= ',' ( (lv_scale_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'MAXLENGTH' otherlv_33= '=' ( (lv_maxLength_34_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'LENGTHBITS' otherlv_36= '=' ( (lv_lengthBits_37_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'CHARACTER' otherlv_39= 'SET' otherlv_40= '=' ( (lv_characterSet_41_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'COLLATION' otherlv_43= '=' ( (lv_collation_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'COMMENT' otherlv_46= '=' ( (lv_comment_47_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'CONSTRAINT_NAME' otherlv_49= '=' ( (lv_constraintName_50_0= RULE_STRING ) ) ) ) ) ) )* ) )
                    // InternalSqml.g:906:6: ( ( ({...}? => ( ({...}? => ( (lv_nullable_11_0= 'NULLABLE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_timestamp_12_0= 'TIMESTAMP' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unsigned_13_0= 'UNSIGNED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ON' otherlv_15= 'DELETE' ( (lv_onDeleteAction_16_0= ruleSqmlForeignKeyAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'ON' otherlv_18= 'UPDATE' ( (lv_onUpdateAction_19_0= ruleSqmlForeignKeyAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ON' otherlv_21= 'UPDATE' ( (lv_onUpdateNow_22_0= 'NOW' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_physicalNameOverride_23_0= RULE_STRING ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'BITS' otherlv_25= '=' ( (lv_bits_26_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'PRECISION' otherlv_28= '=' ( (lv_precision_29_0= RULE_INT ) ) otherlv_30= ',' ( (lv_scale_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'MAXLENGTH' otherlv_33= '=' ( (lv_maxLength_34_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'LENGTHBITS' otherlv_36= '=' ( (lv_lengthBits_37_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'CHARACTER' otherlv_39= 'SET' otherlv_40= '=' ( (lv_characterSet_41_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'COLLATION' otherlv_43= '=' ( (lv_collation_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'COMMENT' otherlv_46= '=' ( (lv_comment_47_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'CONSTRAINT_NAME' otherlv_49= '=' ( (lv_constraintName_50_0= RULE_STRING ) ) ) ) ) ) )* )
                    {
                    getUnorderedGroupHelper().enter(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1());
                    // InternalSqml.g:909:6: ( ( ({...}? => ( ({...}? => ( (lv_nullable_11_0= 'NULLABLE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_timestamp_12_0= 'TIMESTAMP' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unsigned_13_0= 'UNSIGNED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ON' otherlv_15= 'DELETE' ( (lv_onDeleteAction_16_0= ruleSqmlForeignKeyAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'ON' otherlv_18= 'UPDATE' ( (lv_onUpdateAction_19_0= ruleSqmlForeignKeyAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ON' otherlv_21= 'UPDATE' ( (lv_onUpdateNow_22_0= 'NOW' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_physicalNameOverride_23_0= RULE_STRING ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'BITS' otherlv_25= '=' ( (lv_bits_26_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'PRECISION' otherlv_28= '=' ( (lv_precision_29_0= RULE_INT ) ) otherlv_30= ',' ( (lv_scale_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'MAXLENGTH' otherlv_33= '=' ( (lv_maxLength_34_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'LENGTHBITS' otherlv_36= '=' ( (lv_lengthBits_37_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'CHARACTER' otherlv_39= 'SET' otherlv_40= '=' ( (lv_characterSet_41_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'COLLATION' otherlv_43= '=' ( (lv_collation_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'COMMENT' otherlv_46= '=' ( (lv_comment_47_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'CONSTRAINT_NAME' otherlv_49= '=' ( (lv_constraintName_50_0= RULE_STRING ) ) ) ) ) ) )* )
                    // InternalSqml.g:910:7: ( ({...}? => ( ({...}? => ( (lv_nullable_11_0= 'NULLABLE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_timestamp_12_0= 'TIMESTAMP' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unsigned_13_0= 'UNSIGNED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ON' otherlv_15= 'DELETE' ( (lv_onDeleteAction_16_0= ruleSqmlForeignKeyAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'ON' otherlv_18= 'UPDATE' ( (lv_onUpdateAction_19_0= ruleSqmlForeignKeyAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ON' otherlv_21= 'UPDATE' ( (lv_onUpdateNow_22_0= 'NOW' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_physicalNameOverride_23_0= RULE_STRING ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'BITS' otherlv_25= '=' ( (lv_bits_26_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'PRECISION' otherlv_28= '=' ( (lv_precision_29_0= RULE_INT ) ) otherlv_30= ',' ( (lv_scale_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'MAXLENGTH' otherlv_33= '=' ( (lv_maxLength_34_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'LENGTHBITS' otherlv_36= '=' ( (lv_lengthBits_37_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'CHARACTER' otherlv_39= 'SET' otherlv_40= '=' ( (lv_characterSet_41_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'COLLATION' otherlv_43= '=' ( (lv_collation_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'COMMENT' otherlv_46= '=' ( (lv_comment_47_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'CONSTRAINT_NAME' otherlv_49= '=' ( (lv_constraintName_50_0= RULE_STRING ) ) ) ) ) ) )*
                    {
                    // InternalSqml.g:910:7: ( ({...}? => ( ({...}? => ( (lv_nullable_11_0= 'NULLABLE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_timestamp_12_0= 'TIMESTAMP' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unsigned_13_0= 'UNSIGNED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ON' otherlv_15= 'DELETE' ( (lv_onDeleteAction_16_0= ruleSqmlForeignKeyAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'ON' otherlv_18= 'UPDATE' ( (lv_onUpdateAction_19_0= ruleSqmlForeignKeyAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ON' otherlv_21= 'UPDATE' ( (lv_onUpdateNow_22_0= 'NOW' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_physicalNameOverride_23_0= RULE_STRING ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'BITS' otherlv_25= '=' ( (lv_bits_26_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'PRECISION' otherlv_28= '=' ( (lv_precision_29_0= RULE_INT ) ) otherlv_30= ',' ( (lv_scale_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'MAXLENGTH' otherlv_33= '=' ( (lv_maxLength_34_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'LENGTHBITS' otherlv_36= '=' ( (lv_lengthBits_37_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'CHARACTER' otherlv_39= 'SET' otherlv_40= '=' ( (lv_characterSet_41_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'COLLATION' otherlv_43= '=' ( (lv_collation_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'COMMENT' otherlv_46= '=' ( (lv_comment_47_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'CONSTRAINT_NAME' otherlv_49= '=' ( (lv_constraintName_50_0= RULE_STRING ) ) ) ) ) ) )*
                    loop18:
                    do {
                        int alt18=16;
                        alt18 = dfa18.predict(input);
                        switch (alt18) {
                    	case 1 :
                    	    // InternalSqml.g:911:5: ({...}? => ( ({...}? => ( (lv_nullable_11_0= 'NULLABLE' ) ) ) ) )
                    	    {
                    	    // InternalSqml.g:911:5: ({...}? => ( ({...}? => ( (lv_nullable_11_0= 'NULLABLE' ) ) ) ) )
                    	    // InternalSqml.g:912:6: {...}? => ( ({...}? => ( (lv_nullable_11_0= 'NULLABLE' ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 0) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleSqmlTableColumn", "getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 0)");
                    	    }
                    	    // InternalSqml.g:912:115: ( ({...}? => ( (lv_nullable_11_0= 'NULLABLE' ) ) ) )
                    	    // InternalSqml.g:913:7: ({...}? => ( (lv_nullable_11_0= 'NULLABLE' ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 0);
                    	    // InternalSqml.g:916:10: ({...}? => ( (lv_nullable_11_0= 'NULLABLE' ) ) )
                    	    // InternalSqml.g:916:11: {...}? => ( (lv_nullable_11_0= 'NULLABLE' ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleSqmlTableColumn", "true");
                    	    }
                    	    // InternalSqml.g:916:20: ( (lv_nullable_11_0= 'NULLABLE' ) )
                    	    // InternalSqml.g:916:21: (lv_nullable_11_0= 'NULLABLE' )
                    	    {
                    	    // InternalSqml.g:916:21: (lv_nullable_11_0= 'NULLABLE' )
                    	    // InternalSqml.g:917:11: lv_nullable_11_0= 'NULLABLE'
                    	    {
                    	    lv_nullable_11_0=(Token)match(input,34,FOLLOW_24); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      											newLeafNode(lv_nullable_11_0, grammarAccess.getSqmlTableColumnAccess().getNullableNULLABLEKeyword_4_1_0_0());
                    	      										
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      											if (current==null) {
                    	      												current = createModelElement(grammarAccess.getSqmlTableColumnRule());
                    	      											}
                    	      											setWithLastConsumed(current, "nullable", lv_nullable_11_0 != null, "NULLABLE");
                    	      										
                    	    }

                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSqml.g:934:5: ({...}? => ( ({...}? => ( (lv_timestamp_12_0= 'TIMESTAMP' ) ) ) ) )
                    	    {
                    	    // InternalSqml.g:934:5: ({...}? => ( ({...}? => ( (lv_timestamp_12_0= 'TIMESTAMP' ) ) ) ) )
                    	    // InternalSqml.g:935:6: {...}? => ( ({...}? => ( (lv_timestamp_12_0= 'TIMESTAMP' ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 1) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleSqmlTableColumn", "getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 1)");
                    	    }
                    	    // InternalSqml.g:935:115: ( ({...}? => ( (lv_timestamp_12_0= 'TIMESTAMP' ) ) ) )
                    	    // InternalSqml.g:936:7: ({...}? => ( (lv_timestamp_12_0= 'TIMESTAMP' ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 1);
                    	    // InternalSqml.g:939:10: ({...}? => ( (lv_timestamp_12_0= 'TIMESTAMP' ) ) )
                    	    // InternalSqml.g:939:11: {...}? => ( (lv_timestamp_12_0= 'TIMESTAMP' ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleSqmlTableColumn", "true");
                    	    }
                    	    // InternalSqml.g:939:20: ( (lv_timestamp_12_0= 'TIMESTAMP' ) )
                    	    // InternalSqml.g:939:21: (lv_timestamp_12_0= 'TIMESTAMP' )
                    	    {
                    	    // InternalSqml.g:939:21: (lv_timestamp_12_0= 'TIMESTAMP' )
                    	    // InternalSqml.g:940:11: lv_timestamp_12_0= 'TIMESTAMP'
                    	    {
                    	    lv_timestamp_12_0=(Token)match(input,35,FOLLOW_24); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      											newLeafNode(lv_timestamp_12_0, grammarAccess.getSqmlTableColumnAccess().getTimestampTIMESTAMPKeyword_4_1_1_0());
                    	      										
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      											if (current==null) {
                    	      												current = createModelElement(grammarAccess.getSqmlTableColumnRule());
                    	      											}
                    	      											setWithLastConsumed(current, "timestamp", lv_timestamp_12_0 != null, "TIMESTAMP");
                    	      										
                    	    }

                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalSqml.g:957:5: ({...}? => ( ({...}? => ( (lv_unsigned_13_0= 'UNSIGNED' ) ) ) ) )
                    	    {
                    	    // InternalSqml.g:957:5: ({...}? => ( ({...}? => ( (lv_unsigned_13_0= 'UNSIGNED' ) ) ) ) )
                    	    // InternalSqml.g:958:6: {...}? => ( ({...}? => ( (lv_unsigned_13_0= 'UNSIGNED' ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 2) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleSqmlTableColumn", "getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 2)");
                    	    }
                    	    // InternalSqml.g:958:115: ( ({...}? => ( (lv_unsigned_13_0= 'UNSIGNED' ) ) ) )
                    	    // InternalSqml.g:959:7: ({...}? => ( (lv_unsigned_13_0= 'UNSIGNED' ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 2);
                    	    // InternalSqml.g:962:10: ({...}? => ( (lv_unsigned_13_0= 'UNSIGNED' ) ) )
                    	    // InternalSqml.g:962:11: {...}? => ( (lv_unsigned_13_0= 'UNSIGNED' ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleSqmlTableColumn", "true");
                    	    }
                    	    // InternalSqml.g:962:20: ( (lv_unsigned_13_0= 'UNSIGNED' ) )
                    	    // InternalSqml.g:962:21: (lv_unsigned_13_0= 'UNSIGNED' )
                    	    {
                    	    // InternalSqml.g:962:21: (lv_unsigned_13_0= 'UNSIGNED' )
                    	    // InternalSqml.g:963:11: lv_unsigned_13_0= 'UNSIGNED'
                    	    {
                    	    lv_unsigned_13_0=(Token)match(input,36,FOLLOW_24); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      											newLeafNode(lv_unsigned_13_0, grammarAccess.getSqmlTableColumnAccess().getUnsignedUNSIGNEDKeyword_4_1_2_0());
                    	      										
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      											if (current==null) {
                    	      												current = createModelElement(grammarAccess.getSqmlTableColumnRule());
                    	      											}
                    	      											setWithLastConsumed(current, "unsigned", lv_unsigned_13_0 != null, "UNSIGNED");
                    	      										
                    	    }

                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalSqml.g:980:5: ({...}? => ( ({...}? => (otherlv_14= 'ON' otherlv_15= 'DELETE' ( (lv_onDeleteAction_16_0= ruleSqmlForeignKeyAction ) ) ) ) ) )
                    	    {
                    	    // InternalSqml.g:980:5: ({...}? => ( ({...}? => (otherlv_14= 'ON' otherlv_15= 'DELETE' ( (lv_onDeleteAction_16_0= ruleSqmlForeignKeyAction ) ) ) ) ) )
                    	    // InternalSqml.g:981:6: {...}? => ( ({...}? => (otherlv_14= 'ON' otherlv_15= 'DELETE' ( (lv_onDeleteAction_16_0= ruleSqmlForeignKeyAction ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 3) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleSqmlTableColumn", "getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 3)");
                    	    }
                    	    // InternalSqml.g:981:115: ( ({...}? => (otherlv_14= 'ON' otherlv_15= 'DELETE' ( (lv_onDeleteAction_16_0= ruleSqmlForeignKeyAction ) ) ) ) )
                    	    // InternalSqml.g:982:7: ({...}? => (otherlv_14= 'ON' otherlv_15= 'DELETE' ( (lv_onDeleteAction_16_0= ruleSqmlForeignKeyAction ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 3);
                    	    // InternalSqml.g:985:10: ({...}? => (otherlv_14= 'ON' otherlv_15= 'DELETE' ( (lv_onDeleteAction_16_0= ruleSqmlForeignKeyAction ) ) ) )
                    	    // InternalSqml.g:985:11: {...}? => (otherlv_14= 'ON' otherlv_15= 'DELETE' ( (lv_onDeleteAction_16_0= ruleSqmlForeignKeyAction ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleSqmlTableColumn", "true");
                    	    }
                    	    // InternalSqml.g:985:20: (otherlv_14= 'ON' otherlv_15= 'DELETE' ( (lv_onDeleteAction_16_0= ruleSqmlForeignKeyAction ) ) )
                    	    // InternalSqml.g:985:21: otherlv_14= 'ON' otherlv_15= 'DELETE' ( (lv_onDeleteAction_16_0= ruleSqmlForeignKeyAction ) )
                    	    {
                    	    otherlv_14=(Token)match(input,26,FOLLOW_25); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_14, grammarAccess.getSqmlTableColumnAccess().getONKeyword_4_1_3_0());
                    	      									
                    	    }
                    	    otherlv_15=(Token)match(input,37,FOLLOW_26); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_15, grammarAccess.getSqmlTableColumnAccess().getDELETEKeyword_4_1_3_1());
                    	      									
                    	    }
                    	    // InternalSqml.g:993:10: ( (lv_onDeleteAction_16_0= ruleSqmlForeignKeyAction ) )
                    	    // InternalSqml.g:994:11: (lv_onDeleteAction_16_0= ruleSqmlForeignKeyAction )
                    	    {
                    	    // InternalSqml.g:994:11: (lv_onDeleteAction_16_0= ruleSqmlForeignKeyAction )
                    	    // InternalSqml.g:995:12: lv_onDeleteAction_16_0= ruleSqmlForeignKeyAction
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      												newCompositeNode(grammarAccess.getSqmlTableColumnAccess().getOnDeleteActionSqmlForeignKeyActionEnumRuleCall_4_1_3_2_0());
                    	      											
                    	    }
                    	    pushFollow(FOLLOW_24);
                    	    lv_onDeleteAction_16_0=ruleSqmlForeignKeyAction();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      												if (current==null) {
                    	      													current = createModelElementForParent(grammarAccess.getSqmlTableColumnRule());
                    	      												}
                    	      												set(
                    	      													current,
                    	      													"onDeleteAction",
                    	      													lv_onDeleteAction_16_0,
                    	      													"com.softicar.sqml.Sqml.SqmlForeignKeyAction");
                    	      												afterParserOrEnumRuleCall();
                    	      											
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // InternalSqml.g:1018:5: ({...}? => ( ({...}? => (otherlv_17= 'ON' otherlv_18= 'UPDATE' ( (lv_onUpdateAction_19_0= ruleSqmlForeignKeyAction ) ) ) ) ) )
                    	    {
                    	    // InternalSqml.g:1018:5: ({...}? => ( ({...}? => (otherlv_17= 'ON' otherlv_18= 'UPDATE' ( (lv_onUpdateAction_19_0= ruleSqmlForeignKeyAction ) ) ) ) ) )
                    	    // InternalSqml.g:1019:6: {...}? => ( ({...}? => (otherlv_17= 'ON' otherlv_18= 'UPDATE' ( (lv_onUpdateAction_19_0= ruleSqmlForeignKeyAction ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 4) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleSqmlTableColumn", "getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 4)");
                    	    }
                    	    // InternalSqml.g:1019:115: ( ({...}? => (otherlv_17= 'ON' otherlv_18= 'UPDATE' ( (lv_onUpdateAction_19_0= ruleSqmlForeignKeyAction ) ) ) ) )
                    	    // InternalSqml.g:1020:7: ({...}? => (otherlv_17= 'ON' otherlv_18= 'UPDATE' ( (lv_onUpdateAction_19_0= ruleSqmlForeignKeyAction ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 4);
                    	    // InternalSqml.g:1023:10: ({...}? => (otherlv_17= 'ON' otherlv_18= 'UPDATE' ( (lv_onUpdateAction_19_0= ruleSqmlForeignKeyAction ) ) ) )
                    	    // InternalSqml.g:1023:11: {...}? => (otherlv_17= 'ON' otherlv_18= 'UPDATE' ( (lv_onUpdateAction_19_0= ruleSqmlForeignKeyAction ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleSqmlTableColumn", "true");
                    	    }
                    	    // InternalSqml.g:1023:20: (otherlv_17= 'ON' otherlv_18= 'UPDATE' ( (lv_onUpdateAction_19_0= ruleSqmlForeignKeyAction ) ) )
                    	    // InternalSqml.g:1023:21: otherlv_17= 'ON' otherlv_18= 'UPDATE' ( (lv_onUpdateAction_19_0= ruleSqmlForeignKeyAction ) )
                    	    {
                    	    otherlv_17=(Token)match(input,26,FOLLOW_27); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_17, grammarAccess.getSqmlTableColumnAccess().getONKeyword_4_1_4_0());
                    	      									
                    	    }
                    	    otherlv_18=(Token)match(input,38,FOLLOW_26); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_18, grammarAccess.getSqmlTableColumnAccess().getUPDATEKeyword_4_1_4_1());
                    	      									
                    	    }
                    	    // InternalSqml.g:1031:10: ( (lv_onUpdateAction_19_0= ruleSqmlForeignKeyAction ) )
                    	    // InternalSqml.g:1032:11: (lv_onUpdateAction_19_0= ruleSqmlForeignKeyAction )
                    	    {
                    	    // InternalSqml.g:1032:11: (lv_onUpdateAction_19_0= ruleSqmlForeignKeyAction )
                    	    // InternalSqml.g:1033:12: lv_onUpdateAction_19_0= ruleSqmlForeignKeyAction
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      												newCompositeNode(grammarAccess.getSqmlTableColumnAccess().getOnUpdateActionSqmlForeignKeyActionEnumRuleCall_4_1_4_2_0());
                    	      											
                    	    }
                    	    pushFollow(FOLLOW_24);
                    	    lv_onUpdateAction_19_0=ruleSqmlForeignKeyAction();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      												if (current==null) {
                    	      													current = createModelElementForParent(grammarAccess.getSqmlTableColumnRule());
                    	      												}
                    	      												set(
                    	      													current,
                    	      													"onUpdateAction",
                    	      													lv_onUpdateAction_19_0,
                    	      													"com.softicar.sqml.Sqml.SqmlForeignKeyAction");
                    	      												afterParserOrEnumRuleCall();
                    	      											
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // InternalSqml.g:1056:5: ({...}? => ( ({...}? => (otherlv_20= 'ON' otherlv_21= 'UPDATE' ( (lv_onUpdateNow_22_0= 'NOW' ) ) ) ) ) )
                    	    {
                    	    // InternalSqml.g:1056:5: ({...}? => ( ({...}? => (otherlv_20= 'ON' otherlv_21= 'UPDATE' ( (lv_onUpdateNow_22_0= 'NOW' ) ) ) ) ) )
                    	    // InternalSqml.g:1057:6: {...}? => ( ({...}? => (otherlv_20= 'ON' otherlv_21= 'UPDATE' ( (lv_onUpdateNow_22_0= 'NOW' ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 5) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleSqmlTableColumn", "getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 5)");
                    	    }
                    	    // InternalSqml.g:1057:115: ( ({...}? => (otherlv_20= 'ON' otherlv_21= 'UPDATE' ( (lv_onUpdateNow_22_0= 'NOW' ) ) ) ) )
                    	    // InternalSqml.g:1058:7: ({...}? => (otherlv_20= 'ON' otherlv_21= 'UPDATE' ( (lv_onUpdateNow_22_0= 'NOW' ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 5);
                    	    // InternalSqml.g:1061:10: ({...}? => (otherlv_20= 'ON' otherlv_21= 'UPDATE' ( (lv_onUpdateNow_22_0= 'NOW' ) ) ) )
                    	    // InternalSqml.g:1061:11: {...}? => (otherlv_20= 'ON' otherlv_21= 'UPDATE' ( (lv_onUpdateNow_22_0= 'NOW' ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleSqmlTableColumn", "true");
                    	    }
                    	    // InternalSqml.g:1061:20: (otherlv_20= 'ON' otherlv_21= 'UPDATE' ( (lv_onUpdateNow_22_0= 'NOW' ) ) )
                    	    // InternalSqml.g:1061:21: otherlv_20= 'ON' otherlv_21= 'UPDATE' ( (lv_onUpdateNow_22_0= 'NOW' ) )
                    	    {
                    	    otherlv_20=(Token)match(input,26,FOLLOW_27); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_20, grammarAccess.getSqmlTableColumnAccess().getONKeyword_4_1_5_0());
                    	      									
                    	    }
                    	    otherlv_21=(Token)match(input,38,FOLLOW_28); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_21, grammarAccess.getSqmlTableColumnAccess().getUPDATEKeyword_4_1_5_1());
                    	      									
                    	    }
                    	    // InternalSqml.g:1069:10: ( (lv_onUpdateNow_22_0= 'NOW' ) )
                    	    // InternalSqml.g:1070:11: (lv_onUpdateNow_22_0= 'NOW' )
                    	    {
                    	    // InternalSqml.g:1070:11: (lv_onUpdateNow_22_0= 'NOW' )
                    	    // InternalSqml.g:1071:12: lv_onUpdateNow_22_0= 'NOW'
                    	    {
                    	    lv_onUpdateNow_22_0=(Token)match(input,31,FOLLOW_24); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      												newLeafNode(lv_onUpdateNow_22_0, grammarAccess.getSqmlTableColumnAccess().getOnUpdateNowNOWKeyword_4_1_5_2_0());
                    	      											
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      												if (current==null) {
                    	      													current = createModelElement(grammarAccess.getSqmlTableColumnRule());
                    	      												}
                    	      												setWithLastConsumed(current, "onUpdateNow", lv_onUpdateNow_22_0 != null, "NOW");
                    	      											
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 7 :
                    	    // InternalSqml.g:1089:5: ({...}? => ( ({...}? => ( (lv_physicalNameOverride_23_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    // InternalSqml.g:1089:5: ({...}? => ( ({...}? => ( (lv_physicalNameOverride_23_0= RULE_STRING ) ) ) ) )
                    	    // InternalSqml.g:1090:6: {...}? => ( ({...}? => ( (lv_physicalNameOverride_23_0= RULE_STRING ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 6) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleSqmlTableColumn", "getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 6)");
                    	    }
                    	    // InternalSqml.g:1090:115: ( ({...}? => ( (lv_physicalNameOverride_23_0= RULE_STRING ) ) ) )
                    	    // InternalSqml.g:1091:7: ({...}? => ( (lv_physicalNameOverride_23_0= RULE_STRING ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 6);
                    	    // InternalSqml.g:1094:10: ({...}? => ( (lv_physicalNameOverride_23_0= RULE_STRING ) ) )
                    	    // InternalSqml.g:1094:11: {...}? => ( (lv_physicalNameOverride_23_0= RULE_STRING ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleSqmlTableColumn", "true");
                    	    }
                    	    // InternalSqml.g:1094:20: ( (lv_physicalNameOverride_23_0= RULE_STRING ) )
                    	    // InternalSqml.g:1094:21: (lv_physicalNameOverride_23_0= RULE_STRING )
                    	    {
                    	    // InternalSqml.g:1094:21: (lv_physicalNameOverride_23_0= RULE_STRING )
                    	    // InternalSqml.g:1095:11: lv_physicalNameOverride_23_0= RULE_STRING
                    	    {
                    	    lv_physicalNameOverride_23_0=(Token)match(input,RULE_STRING,FOLLOW_24); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      											newLeafNode(lv_physicalNameOverride_23_0, grammarAccess.getSqmlTableColumnAccess().getPhysicalNameOverrideSTRINGTerminalRuleCall_4_1_6_0());
                    	      										
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      											if (current==null) {
                    	      												current = createModelElement(grammarAccess.getSqmlTableColumnRule());
                    	      											}
                    	      											setWithLastConsumed(
                    	      												current,
                    	      												"physicalNameOverride",
                    	      												lv_physicalNameOverride_23_0,
                    	      												"org.eclipse.xtext.common.Terminals.STRING");
                    	      										
                    	    }

                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 8 :
                    	    // InternalSqml.g:1116:5: ({...}? => ( ({...}? => (otherlv_24= 'BITS' otherlv_25= '=' ( (lv_bits_26_0= RULE_INT ) ) ) ) ) )
                    	    {
                    	    // InternalSqml.g:1116:5: ({...}? => ( ({...}? => (otherlv_24= 'BITS' otherlv_25= '=' ( (lv_bits_26_0= RULE_INT ) ) ) ) ) )
                    	    // InternalSqml.g:1117:6: {...}? => ( ({...}? => (otherlv_24= 'BITS' otherlv_25= '=' ( (lv_bits_26_0= RULE_INT ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 7) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleSqmlTableColumn", "getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 7)");
                    	    }
                    	    // InternalSqml.g:1117:115: ( ({...}? => (otherlv_24= 'BITS' otherlv_25= '=' ( (lv_bits_26_0= RULE_INT ) ) ) ) )
                    	    // InternalSqml.g:1118:7: ({...}? => (otherlv_24= 'BITS' otherlv_25= '=' ( (lv_bits_26_0= RULE_INT ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 7);
                    	    // InternalSqml.g:1121:10: ({...}? => (otherlv_24= 'BITS' otherlv_25= '=' ( (lv_bits_26_0= RULE_INT ) ) ) )
                    	    // InternalSqml.g:1121:11: {...}? => (otherlv_24= 'BITS' otherlv_25= '=' ( (lv_bits_26_0= RULE_INT ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleSqmlTableColumn", "true");
                    	    }
                    	    // InternalSqml.g:1121:20: (otherlv_24= 'BITS' otherlv_25= '=' ( (lv_bits_26_0= RULE_INT ) ) )
                    	    // InternalSqml.g:1121:21: otherlv_24= 'BITS' otherlv_25= '=' ( (lv_bits_26_0= RULE_INT ) )
                    	    {
                    	    otherlv_24=(Token)match(input,39,FOLLOW_29); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_24, grammarAccess.getSqmlTableColumnAccess().getBITSKeyword_4_1_7_0());
                    	      									
                    	    }
                    	    otherlv_25=(Token)match(input,27,FOLLOW_30); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_25, grammarAccess.getSqmlTableColumnAccess().getEqualsSignKeyword_4_1_7_1());
                    	      									
                    	    }
                    	    // InternalSqml.g:1129:10: ( (lv_bits_26_0= RULE_INT ) )
                    	    // InternalSqml.g:1130:11: (lv_bits_26_0= RULE_INT )
                    	    {
                    	    // InternalSqml.g:1130:11: (lv_bits_26_0= RULE_INT )
                    	    // InternalSqml.g:1131:12: lv_bits_26_0= RULE_INT
                    	    {
                    	    lv_bits_26_0=(Token)match(input,RULE_INT,FOLLOW_24); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      												newLeafNode(lv_bits_26_0, grammarAccess.getSqmlTableColumnAccess().getBitsINTTerminalRuleCall_4_1_7_2_0());
                    	      											
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      												if (current==null) {
                    	      													current = createModelElement(grammarAccess.getSqmlTableColumnRule());
                    	      												}
                    	      												setWithLastConsumed(
                    	      													current,
                    	      													"bits",
                    	      													lv_bits_26_0,
                    	      													"org.eclipse.xtext.common.Terminals.INT");
                    	      											
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 9 :
                    	    // InternalSqml.g:1153:5: ({...}? => ( ({...}? => (otherlv_27= 'PRECISION' otherlv_28= '=' ( (lv_precision_29_0= RULE_INT ) ) otherlv_30= ',' ( (lv_scale_31_0= RULE_INT ) ) ) ) ) )
                    	    {
                    	    // InternalSqml.g:1153:5: ({...}? => ( ({...}? => (otherlv_27= 'PRECISION' otherlv_28= '=' ( (lv_precision_29_0= RULE_INT ) ) otherlv_30= ',' ( (lv_scale_31_0= RULE_INT ) ) ) ) ) )
                    	    // InternalSqml.g:1154:6: {...}? => ( ({...}? => (otherlv_27= 'PRECISION' otherlv_28= '=' ( (lv_precision_29_0= RULE_INT ) ) otherlv_30= ',' ( (lv_scale_31_0= RULE_INT ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 8) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleSqmlTableColumn", "getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 8)");
                    	    }
                    	    // InternalSqml.g:1154:115: ( ({...}? => (otherlv_27= 'PRECISION' otherlv_28= '=' ( (lv_precision_29_0= RULE_INT ) ) otherlv_30= ',' ( (lv_scale_31_0= RULE_INT ) ) ) ) )
                    	    // InternalSqml.g:1155:7: ({...}? => (otherlv_27= 'PRECISION' otherlv_28= '=' ( (lv_precision_29_0= RULE_INT ) ) otherlv_30= ',' ( (lv_scale_31_0= RULE_INT ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 8);
                    	    // InternalSqml.g:1158:10: ({...}? => (otherlv_27= 'PRECISION' otherlv_28= '=' ( (lv_precision_29_0= RULE_INT ) ) otherlv_30= ',' ( (lv_scale_31_0= RULE_INT ) ) ) )
                    	    // InternalSqml.g:1158:11: {...}? => (otherlv_27= 'PRECISION' otherlv_28= '=' ( (lv_precision_29_0= RULE_INT ) ) otherlv_30= ',' ( (lv_scale_31_0= RULE_INT ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleSqmlTableColumn", "true");
                    	    }
                    	    // InternalSqml.g:1158:20: (otherlv_27= 'PRECISION' otherlv_28= '=' ( (lv_precision_29_0= RULE_INT ) ) otherlv_30= ',' ( (lv_scale_31_0= RULE_INT ) ) )
                    	    // InternalSqml.g:1158:21: otherlv_27= 'PRECISION' otherlv_28= '=' ( (lv_precision_29_0= RULE_INT ) ) otherlv_30= ',' ( (lv_scale_31_0= RULE_INT ) )
                    	    {
                    	    otherlv_27=(Token)match(input,40,FOLLOW_29); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_27, grammarAccess.getSqmlTableColumnAccess().getPRECISIONKeyword_4_1_8_0());
                    	      									
                    	    }
                    	    otherlv_28=(Token)match(input,27,FOLLOW_30); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_28, grammarAccess.getSqmlTableColumnAccess().getEqualsSignKeyword_4_1_8_1());
                    	      									
                    	    }
                    	    // InternalSqml.g:1166:10: ( (lv_precision_29_0= RULE_INT ) )
                    	    // InternalSqml.g:1167:11: (lv_precision_29_0= RULE_INT )
                    	    {
                    	    // InternalSqml.g:1167:11: (lv_precision_29_0= RULE_INT )
                    	    // InternalSqml.g:1168:12: lv_precision_29_0= RULE_INT
                    	    {
                    	    lv_precision_29_0=(Token)match(input,RULE_INT,FOLLOW_31); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      												newLeafNode(lv_precision_29_0, grammarAccess.getSqmlTableColumnAccess().getPrecisionINTTerminalRuleCall_4_1_8_2_0());
                    	      											
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      												if (current==null) {
                    	      													current = createModelElement(grammarAccess.getSqmlTableColumnRule());
                    	      												}
                    	      												setWithLastConsumed(
                    	      													current,
                    	      													"precision",
                    	      													lv_precision_29_0,
                    	      													"org.eclipse.xtext.common.Terminals.INT");
                    	      											
                    	    }

                    	    }


                    	    }

                    	    otherlv_30=(Token)match(input,18,FOLLOW_30); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_30, grammarAccess.getSqmlTableColumnAccess().getCommaKeyword_4_1_8_3());
                    	      									
                    	    }
                    	    // InternalSqml.g:1188:10: ( (lv_scale_31_0= RULE_INT ) )
                    	    // InternalSqml.g:1189:11: (lv_scale_31_0= RULE_INT )
                    	    {
                    	    // InternalSqml.g:1189:11: (lv_scale_31_0= RULE_INT )
                    	    // InternalSqml.g:1190:12: lv_scale_31_0= RULE_INT
                    	    {
                    	    lv_scale_31_0=(Token)match(input,RULE_INT,FOLLOW_24); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      												newLeafNode(lv_scale_31_0, grammarAccess.getSqmlTableColumnAccess().getScaleINTTerminalRuleCall_4_1_8_4_0());
                    	      											
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      												if (current==null) {
                    	      													current = createModelElement(grammarAccess.getSqmlTableColumnRule());
                    	      												}
                    	      												setWithLastConsumed(
                    	      													current,
                    	      													"scale",
                    	      													lv_scale_31_0,
                    	      													"org.eclipse.xtext.common.Terminals.INT");
                    	      											
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 10 :
                    	    // InternalSqml.g:1212:5: ({...}? => ( ({...}? => (otherlv_32= 'MAXLENGTH' otherlv_33= '=' ( (lv_maxLength_34_0= RULE_INT ) ) ) ) ) )
                    	    {
                    	    // InternalSqml.g:1212:5: ({...}? => ( ({...}? => (otherlv_32= 'MAXLENGTH' otherlv_33= '=' ( (lv_maxLength_34_0= RULE_INT ) ) ) ) ) )
                    	    // InternalSqml.g:1213:6: {...}? => ( ({...}? => (otherlv_32= 'MAXLENGTH' otherlv_33= '=' ( (lv_maxLength_34_0= RULE_INT ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 9) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleSqmlTableColumn", "getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 9)");
                    	    }
                    	    // InternalSqml.g:1213:115: ( ({...}? => (otherlv_32= 'MAXLENGTH' otherlv_33= '=' ( (lv_maxLength_34_0= RULE_INT ) ) ) ) )
                    	    // InternalSqml.g:1214:7: ({...}? => (otherlv_32= 'MAXLENGTH' otherlv_33= '=' ( (lv_maxLength_34_0= RULE_INT ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 9);
                    	    // InternalSqml.g:1217:10: ({...}? => (otherlv_32= 'MAXLENGTH' otherlv_33= '=' ( (lv_maxLength_34_0= RULE_INT ) ) ) )
                    	    // InternalSqml.g:1217:11: {...}? => (otherlv_32= 'MAXLENGTH' otherlv_33= '=' ( (lv_maxLength_34_0= RULE_INT ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleSqmlTableColumn", "true");
                    	    }
                    	    // InternalSqml.g:1217:20: (otherlv_32= 'MAXLENGTH' otherlv_33= '=' ( (lv_maxLength_34_0= RULE_INT ) ) )
                    	    // InternalSqml.g:1217:21: otherlv_32= 'MAXLENGTH' otherlv_33= '=' ( (lv_maxLength_34_0= RULE_INT ) )
                    	    {
                    	    otherlv_32=(Token)match(input,41,FOLLOW_29); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_32, grammarAccess.getSqmlTableColumnAccess().getMAXLENGTHKeyword_4_1_9_0());
                    	      									
                    	    }
                    	    otherlv_33=(Token)match(input,27,FOLLOW_30); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_33, grammarAccess.getSqmlTableColumnAccess().getEqualsSignKeyword_4_1_9_1());
                    	      									
                    	    }
                    	    // InternalSqml.g:1225:10: ( (lv_maxLength_34_0= RULE_INT ) )
                    	    // InternalSqml.g:1226:11: (lv_maxLength_34_0= RULE_INT )
                    	    {
                    	    // InternalSqml.g:1226:11: (lv_maxLength_34_0= RULE_INT )
                    	    // InternalSqml.g:1227:12: lv_maxLength_34_0= RULE_INT
                    	    {
                    	    lv_maxLength_34_0=(Token)match(input,RULE_INT,FOLLOW_24); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      												newLeafNode(lv_maxLength_34_0, grammarAccess.getSqmlTableColumnAccess().getMaxLengthINTTerminalRuleCall_4_1_9_2_0());
                    	      											
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      												if (current==null) {
                    	      													current = createModelElement(grammarAccess.getSqmlTableColumnRule());
                    	      												}
                    	      												setWithLastConsumed(
                    	      													current,
                    	      													"maxLength",
                    	      													lv_maxLength_34_0,
                    	      													"org.eclipse.xtext.common.Terminals.INT");
                    	      											
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 11 :
                    	    // InternalSqml.g:1249:5: ({...}? => ( ({...}? => (otherlv_35= 'LENGTHBITS' otherlv_36= '=' ( (lv_lengthBits_37_0= RULE_INT ) ) ) ) ) )
                    	    {
                    	    // InternalSqml.g:1249:5: ({...}? => ( ({...}? => (otherlv_35= 'LENGTHBITS' otherlv_36= '=' ( (lv_lengthBits_37_0= RULE_INT ) ) ) ) ) )
                    	    // InternalSqml.g:1250:6: {...}? => ( ({...}? => (otherlv_35= 'LENGTHBITS' otherlv_36= '=' ( (lv_lengthBits_37_0= RULE_INT ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 10) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleSqmlTableColumn", "getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 10)");
                    	    }
                    	    // InternalSqml.g:1250:116: ( ({...}? => (otherlv_35= 'LENGTHBITS' otherlv_36= '=' ( (lv_lengthBits_37_0= RULE_INT ) ) ) ) )
                    	    // InternalSqml.g:1251:7: ({...}? => (otherlv_35= 'LENGTHBITS' otherlv_36= '=' ( (lv_lengthBits_37_0= RULE_INT ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 10);
                    	    // InternalSqml.g:1254:10: ({...}? => (otherlv_35= 'LENGTHBITS' otherlv_36= '=' ( (lv_lengthBits_37_0= RULE_INT ) ) ) )
                    	    // InternalSqml.g:1254:11: {...}? => (otherlv_35= 'LENGTHBITS' otherlv_36= '=' ( (lv_lengthBits_37_0= RULE_INT ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleSqmlTableColumn", "true");
                    	    }
                    	    // InternalSqml.g:1254:20: (otherlv_35= 'LENGTHBITS' otherlv_36= '=' ( (lv_lengthBits_37_0= RULE_INT ) ) )
                    	    // InternalSqml.g:1254:21: otherlv_35= 'LENGTHBITS' otherlv_36= '=' ( (lv_lengthBits_37_0= RULE_INT ) )
                    	    {
                    	    otherlv_35=(Token)match(input,42,FOLLOW_29); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_35, grammarAccess.getSqmlTableColumnAccess().getLENGTHBITSKeyword_4_1_10_0());
                    	      									
                    	    }
                    	    otherlv_36=(Token)match(input,27,FOLLOW_30); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_36, grammarAccess.getSqmlTableColumnAccess().getEqualsSignKeyword_4_1_10_1());
                    	      									
                    	    }
                    	    // InternalSqml.g:1262:10: ( (lv_lengthBits_37_0= RULE_INT ) )
                    	    // InternalSqml.g:1263:11: (lv_lengthBits_37_0= RULE_INT )
                    	    {
                    	    // InternalSqml.g:1263:11: (lv_lengthBits_37_0= RULE_INT )
                    	    // InternalSqml.g:1264:12: lv_lengthBits_37_0= RULE_INT
                    	    {
                    	    lv_lengthBits_37_0=(Token)match(input,RULE_INT,FOLLOW_24); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      												newLeafNode(lv_lengthBits_37_0, grammarAccess.getSqmlTableColumnAccess().getLengthBitsINTTerminalRuleCall_4_1_10_2_0());
                    	      											
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      												if (current==null) {
                    	      													current = createModelElement(grammarAccess.getSqmlTableColumnRule());
                    	      												}
                    	      												setWithLastConsumed(
                    	      													current,
                    	      													"lengthBits",
                    	      													lv_lengthBits_37_0,
                    	      													"org.eclipse.xtext.common.Terminals.INT");
                    	      											
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 12 :
                    	    // InternalSqml.g:1286:5: ({...}? => ( ({...}? => (otherlv_38= 'CHARACTER' otherlv_39= 'SET' otherlv_40= '=' ( (lv_characterSet_41_0= RULE_STRING ) ) ) ) ) )
                    	    {
                    	    // InternalSqml.g:1286:5: ({...}? => ( ({...}? => (otherlv_38= 'CHARACTER' otherlv_39= 'SET' otherlv_40= '=' ( (lv_characterSet_41_0= RULE_STRING ) ) ) ) ) )
                    	    // InternalSqml.g:1287:6: {...}? => ( ({...}? => (otherlv_38= 'CHARACTER' otherlv_39= 'SET' otherlv_40= '=' ( (lv_characterSet_41_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 11) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleSqmlTableColumn", "getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 11)");
                    	    }
                    	    // InternalSqml.g:1287:116: ( ({...}? => (otherlv_38= 'CHARACTER' otherlv_39= 'SET' otherlv_40= '=' ( (lv_characterSet_41_0= RULE_STRING ) ) ) ) )
                    	    // InternalSqml.g:1288:7: ({...}? => (otherlv_38= 'CHARACTER' otherlv_39= 'SET' otherlv_40= '=' ( (lv_characterSet_41_0= RULE_STRING ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 11);
                    	    // InternalSqml.g:1291:10: ({...}? => (otherlv_38= 'CHARACTER' otherlv_39= 'SET' otherlv_40= '=' ( (lv_characterSet_41_0= RULE_STRING ) ) ) )
                    	    // InternalSqml.g:1291:11: {...}? => (otherlv_38= 'CHARACTER' otherlv_39= 'SET' otherlv_40= '=' ( (lv_characterSet_41_0= RULE_STRING ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleSqmlTableColumn", "true");
                    	    }
                    	    // InternalSqml.g:1291:20: (otherlv_38= 'CHARACTER' otherlv_39= 'SET' otherlv_40= '=' ( (lv_characterSet_41_0= RULE_STRING ) ) )
                    	    // InternalSqml.g:1291:21: otherlv_38= 'CHARACTER' otherlv_39= 'SET' otherlv_40= '=' ( (lv_characterSet_41_0= RULE_STRING ) )
                    	    {
                    	    otherlv_38=(Token)match(input,43,FOLLOW_32); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_38, grammarAccess.getSqmlTableColumnAccess().getCHARACTERKeyword_4_1_11_0());
                    	      									
                    	    }
                    	    otherlv_39=(Token)match(input,44,FOLLOW_29); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_39, grammarAccess.getSqmlTableColumnAccess().getSETKeyword_4_1_11_1());
                    	      									
                    	    }
                    	    otherlv_40=(Token)match(input,27,FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_40, grammarAccess.getSqmlTableColumnAccess().getEqualsSignKeyword_4_1_11_2());
                    	      									
                    	    }
                    	    // InternalSqml.g:1303:10: ( (lv_characterSet_41_0= RULE_STRING ) )
                    	    // InternalSqml.g:1304:11: (lv_characterSet_41_0= RULE_STRING )
                    	    {
                    	    // InternalSqml.g:1304:11: (lv_characterSet_41_0= RULE_STRING )
                    	    // InternalSqml.g:1305:12: lv_characterSet_41_0= RULE_STRING
                    	    {
                    	    lv_characterSet_41_0=(Token)match(input,RULE_STRING,FOLLOW_24); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      												newLeafNode(lv_characterSet_41_0, grammarAccess.getSqmlTableColumnAccess().getCharacterSetSTRINGTerminalRuleCall_4_1_11_3_0());
                    	      											
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      												if (current==null) {
                    	      													current = createModelElement(grammarAccess.getSqmlTableColumnRule());
                    	      												}
                    	      												setWithLastConsumed(
                    	      													current,
                    	      													"characterSet",
                    	      													lv_characterSet_41_0,
                    	      													"org.eclipse.xtext.common.Terminals.STRING");
                    	      											
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 13 :
                    	    // InternalSqml.g:1327:5: ({...}? => ( ({...}? => (otherlv_42= 'COLLATION' otherlv_43= '=' ( (lv_collation_44_0= RULE_STRING ) ) ) ) ) )
                    	    {
                    	    // InternalSqml.g:1327:5: ({...}? => ( ({...}? => (otherlv_42= 'COLLATION' otherlv_43= '=' ( (lv_collation_44_0= RULE_STRING ) ) ) ) ) )
                    	    // InternalSqml.g:1328:6: {...}? => ( ({...}? => (otherlv_42= 'COLLATION' otherlv_43= '=' ( (lv_collation_44_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 12) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleSqmlTableColumn", "getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 12)");
                    	    }
                    	    // InternalSqml.g:1328:116: ( ({...}? => (otherlv_42= 'COLLATION' otherlv_43= '=' ( (lv_collation_44_0= RULE_STRING ) ) ) ) )
                    	    // InternalSqml.g:1329:7: ({...}? => (otherlv_42= 'COLLATION' otherlv_43= '=' ( (lv_collation_44_0= RULE_STRING ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 12);
                    	    // InternalSqml.g:1332:10: ({...}? => (otherlv_42= 'COLLATION' otherlv_43= '=' ( (lv_collation_44_0= RULE_STRING ) ) ) )
                    	    // InternalSqml.g:1332:11: {...}? => (otherlv_42= 'COLLATION' otherlv_43= '=' ( (lv_collation_44_0= RULE_STRING ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleSqmlTableColumn", "true");
                    	    }
                    	    // InternalSqml.g:1332:20: (otherlv_42= 'COLLATION' otherlv_43= '=' ( (lv_collation_44_0= RULE_STRING ) ) )
                    	    // InternalSqml.g:1332:21: otherlv_42= 'COLLATION' otherlv_43= '=' ( (lv_collation_44_0= RULE_STRING ) )
                    	    {
                    	    otherlv_42=(Token)match(input,45,FOLLOW_29); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_42, grammarAccess.getSqmlTableColumnAccess().getCOLLATIONKeyword_4_1_12_0());
                    	      									
                    	    }
                    	    otherlv_43=(Token)match(input,27,FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_43, grammarAccess.getSqmlTableColumnAccess().getEqualsSignKeyword_4_1_12_1());
                    	      									
                    	    }
                    	    // InternalSqml.g:1340:10: ( (lv_collation_44_0= RULE_STRING ) )
                    	    // InternalSqml.g:1341:11: (lv_collation_44_0= RULE_STRING )
                    	    {
                    	    // InternalSqml.g:1341:11: (lv_collation_44_0= RULE_STRING )
                    	    // InternalSqml.g:1342:12: lv_collation_44_0= RULE_STRING
                    	    {
                    	    lv_collation_44_0=(Token)match(input,RULE_STRING,FOLLOW_24); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      												newLeafNode(lv_collation_44_0, grammarAccess.getSqmlTableColumnAccess().getCollationSTRINGTerminalRuleCall_4_1_12_2_0());
                    	      											
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      												if (current==null) {
                    	      													current = createModelElement(grammarAccess.getSqmlTableColumnRule());
                    	      												}
                    	      												setWithLastConsumed(
                    	      													current,
                    	      													"collation",
                    	      													lv_collation_44_0,
                    	      													"org.eclipse.xtext.common.Terminals.STRING");
                    	      											
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 14 :
                    	    // InternalSqml.g:1364:5: ({...}? => ( ({...}? => (otherlv_45= 'COMMENT' otherlv_46= '=' ( (lv_comment_47_0= RULE_STRING ) ) ) ) ) )
                    	    {
                    	    // InternalSqml.g:1364:5: ({...}? => ( ({...}? => (otherlv_45= 'COMMENT' otherlv_46= '=' ( (lv_comment_47_0= RULE_STRING ) ) ) ) ) )
                    	    // InternalSqml.g:1365:6: {...}? => ( ({...}? => (otherlv_45= 'COMMENT' otherlv_46= '=' ( (lv_comment_47_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 13) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleSqmlTableColumn", "getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 13)");
                    	    }
                    	    // InternalSqml.g:1365:116: ( ({...}? => (otherlv_45= 'COMMENT' otherlv_46= '=' ( (lv_comment_47_0= RULE_STRING ) ) ) ) )
                    	    // InternalSqml.g:1366:7: ({...}? => (otherlv_45= 'COMMENT' otherlv_46= '=' ( (lv_comment_47_0= RULE_STRING ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 13);
                    	    // InternalSqml.g:1369:10: ({...}? => (otherlv_45= 'COMMENT' otherlv_46= '=' ( (lv_comment_47_0= RULE_STRING ) ) ) )
                    	    // InternalSqml.g:1369:11: {...}? => (otherlv_45= 'COMMENT' otherlv_46= '=' ( (lv_comment_47_0= RULE_STRING ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleSqmlTableColumn", "true");
                    	    }
                    	    // InternalSqml.g:1369:20: (otherlv_45= 'COMMENT' otherlv_46= '=' ( (lv_comment_47_0= RULE_STRING ) ) )
                    	    // InternalSqml.g:1369:21: otherlv_45= 'COMMENT' otherlv_46= '=' ( (lv_comment_47_0= RULE_STRING ) )
                    	    {
                    	    otherlv_45=(Token)match(input,46,FOLLOW_29); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_45, grammarAccess.getSqmlTableColumnAccess().getCOMMENTKeyword_4_1_13_0());
                    	      									
                    	    }
                    	    otherlv_46=(Token)match(input,27,FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_46, grammarAccess.getSqmlTableColumnAccess().getEqualsSignKeyword_4_1_13_1());
                    	      									
                    	    }
                    	    // InternalSqml.g:1377:10: ( (lv_comment_47_0= RULE_STRING ) )
                    	    // InternalSqml.g:1378:11: (lv_comment_47_0= RULE_STRING )
                    	    {
                    	    // InternalSqml.g:1378:11: (lv_comment_47_0= RULE_STRING )
                    	    // InternalSqml.g:1379:12: lv_comment_47_0= RULE_STRING
                    	    {
                    	    lv_comment_47_0=(Token)match(input,RULE_STRING,FOLLOW_24); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      												newLeafNode(lv_comment_47_0, grammarAccess.getSqmlTableColumnAccess().getCommentSTRINGTerminalRuleCall_4_1_13_2_0());
                    	      											
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      												if (current==null) {
                    	      													current = createModelElement(grammarAccess.getSqmlTableColumnRule());
                    	      												}
                    	      												setWithLastConsumed(
                    	      													current,
                    	      													"comment",
                    	      													lv_comment_47_0,
                    	      													"org.eclipse.xtext.common.Terminals.STRING");
                    	      											
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 15 :
                    	    // InternalSqml.g:1401:5: ({...}? => ( ({...}? => (otherlv_48= 'CONSTRAINT_NAME' otherlv_49= '=' ( (lv_constraintName_50_0= RULE_STRING ) ) ) ) ) )
                    	    {
                    	    // InternalSqml.g:1401:5: ({...}? => ( ({...}? => (otherlv_48= 'CONSTRAINT_NAME' otherlv_49= '=' ( (lv_constraintName_50_0= RULE_STRING ) ) ) ) ) )
                    	    // InternalSqml.g:1402:6: {...}? => ( ({...}? => (otherlv_48= 'CONSTRAINT_NAME' otherlv_49= '=' ( (lv_constraintName_50_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 14) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleSqmlTableColumn", "getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 14)");
                    	    }
                    	    // InternalSqml.g:1402:116: ( ({...}? => (otherlv_48= 'CONSTRAINT_NAME' otherlv_49= '=' ( (lv_constraintName_50_0= RULE_STRING ) ) ) ) )
                    	    // InternalSqml.g:1403:7: ({...}? => (otherlv_48= 'CONSTRAINT_NAME' otherlv_49= '=' ( (lv_constraintName_50_0= RULE_STRING ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 14);
                    	    // InternalSqml.g:1406:10: ({...}? => (otherlv_48= 'CONSTRAINT_NAME' otherlv_49= '=' ( (lv_constraintName_50_0= RULE_STRING ) ) ) )
                    	    // InternalSqml.g:1406:11: {...}? => (otherlv_48= 'CONSTRAINT_NAME' otherlv_49= '=' ( (lv_constraintName_50_0= RULE_STRING ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleSqmlTableColumn", "true");
                    	    }
                    	    // InternalSqml.g:1406:20: (otherlv_48= 'CONSTRAINT_NAME' otherlv_49= '=' ( (lv_constraintName_50_0= RULE_STRING ) ) )
                    	    // InternalSqml.g:1406:21: otherlv_48= 'CONSTRAINT_NAME' otherlv_49= '=' ( (lv_constraintName_50_0= RULE_STRING ) )
                    	    {
                    	    otherlv_48=(Token)match(input,47,FOLLOW_29); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_48, grammarAccess.getSqmlTableColumnAccess().getCONSTRAINT_NAMEKeyword_4_1_14_0());
                    	      									
                    	    }
                    	    otherlv_49=(Token)match(input,27,FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_49, grammarAccess.getSqmlTableColumnAccess().getEqualsSignKeyword_4_1_14_1());
                    	      									
                    	    }
                    	    // InternalSqml.g:1414:10: ( (lv_constraintName_50_0= RULE_STRING ) )
                    	    // InternalSqml.g:1415:11: (lv_constraintName_50_0= RULE_STRING )
                    	    {
                    	    // InternalSqml.g:1415:11: (lv_constraintName_50_0= RULE_STRING )
                    	    // InternalSqml.g:1416:12: lv_constraintName_50_0= RULE_STRING
                    	    {
                    	    lv_constraintName_50_0=(Token)match(input,RULE_STRING,FOLLOW_24); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      												newLeafNode(lv_constraintName_50_0, grammarAccess.getSqmlTableColumnAccess().getConstraintNameSTRINGTerminalRuleCall_4_1_14_2_0());
                    	      											
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      												if (current==null) {
                    	      													current = createModelElement(grammarAccess.getSqmlTableColumnRule());
                    	      												}
                    	      												setWithLastConsumed(
                    	      													current,
                    	      													"constraintName",
                    	      													lv_constraintName_50_0,
                    	      													"org.eclipse.xtext.common.Terminals.STRING");
                    	      											
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1());

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }


                    }

                    getUnorderedGroupHelper().leave(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1());

                    }

                    otherlv_51=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_51, grammarAccess.getSqmlTableColumnAccess().getRightSquareBracketKeyword_4_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlTableColumn"


    // $ANTLR start "entryRuleSqmlTableRow"
    // InternalSqml.g:1454:1: entryRuleSqmlTableRow returns [EObject current=null] : iv_ruleSqmlTableRow= ruleSqmlTableRow EOF ;
    public final EObject entryRuleSqmlTableRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlTableRow = null;


        try {
            // InternalSqml.g:1454:53: (iv_ruleSqmlTableRow= ruleSqmlTableRow EOF )
            // InternalSqml.g:1455:2: iv_ruleSqmlTableRow= ruleSqmlTableRow EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlTableRowRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlTableRow=ruleSqmlTableRow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlTableRow; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlTableRow"


    // $ANTLR start "ruleSqmlTableRow"
    // InternalSqml.g:1461:1: ruleSqmlTableRow returns [EObject current=null] : (otherlv_0= 'ROW' otherlv_1= '(' ( (lv_values_2_0= ruleSqmlTableRowValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleSqmlTableRowValue ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleSqmlTableRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:1467:2: ( (otherlv_0= 'ROW' otherlv_1= '(' ( (lv_values_2_0= ruleSqmlTableRowValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleSqmlTableRowValue ) ) )* otherlv_5= ')' ) )
            // InternalSqml.g:1468:2: (otherlv_0= 'ROW' otherlv_1= '(' ( (lv_values_2_0= ruleSqmlTableRowValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleSqmlTableRowValue ) ) )* otherlv_5= ')' )
            {
            // InternalSqml.g:1468:2: (otherlv_0= 'ROW' otherlv_1= '(' ( (lv_values_2_0= ruleSqmlTableRowValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleSqmlTableRowValue ) ) )* otherlv_5= ')' )
            // InternalSqml.g:1469:3: otherlv_0= 'ROW' otherlv_1= '(' ( (lv_values_2_0= ruleSqmlTableRowValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleSqmlTableRowValue ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSqmlTableRowAccess().getROWKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,49,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSqmlTableRowAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSqml.g:1477:3: ( (lv_values_2_0= ruleSqmlTableRowValue ) )
            // InternalSqml.g:1478:4: (lv_values_2_0= ruleSqmlTableRowValue )
            {
            // InternalSqml.g:1478:4: (lv_values_2_0= ruleSqmlTableRowValue )
            // InternalSqml.g:1479:5: lv_values_2_0= ruleSqmlTableRowValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlTableRowAccess().getValuesSqmlTableRowValueParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_35);
            lv_values_2_0=ruleSqmlTableRowValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlTableRowRule());
              					}
              					add(
              						current,
              						"values",
              						lv_values_2_0,
              						"com.softicar.sqml.Sqml.SqmlTableRowValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSqml.g:1496:3: (otherlv_3= ',' ( (lv_values_4_0= ruleSqmlTableRowValue ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==18) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSqml.g:1497:4: otherlv_3= ',' ( (lv_values_4_0= ruleSqmlTableRowValue ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getSqmlTableRowAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalSqml.g:1501:4: ( (lv_values_4_0= ruleSqmlTableRowValue ) )
            	    // InternalSqml.g:1502:5: (lv_values_4_0= ruleSqmlTableRowValue )
            	    {
            	    // InternalSqml.g:1502:5: (lv_values_4_0= ruleSqmlTableRowValue )
            	    // InternalSqml.g:1503:6: lv_values_4_0= ruleSqmlTableRowValue
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSqmlTableRowAccess().getValuesSqmlTableRowValueParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_35);
            	    lv_values_4_0=ruleSqmlTableRowValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSqmlTableRowRule());
            	      						}
            	      						add(
            	      							current,
            	      							"values",
            	      							lv_values_4_0,
            	      							"com.softicar.sqml.Sqml.SqmlTableRowValue");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_5=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSqmlTableRowAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlTableRow"


    // $ANTLR start "entryRuleSqmlTableRowValue"
    // InternalSqml.g:1529:1: entryRuleSqmlTableRowValue returns [EObject current=null] : iv_ruleSqmlTableRowValue= ruleSqmlTableRowValue EOF ;
    public final EObject entryRuleSqmlTableRowValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlTableRowValue = null;


        try {
            // InternalSqml.g:1529:58: (iv_ruleSqmlTableRowValue= ruleSqmlTableRowValue EOF )
            // InternalSqml.g:1530:2: iv_ruleSqmlTableRowValue= ruleSqmlTableRowValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlTableRowValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlTableRowValue=ruleSqmlTableRowValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlTableRowValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlTableRowValue"


    // $ANTLR start "ruleSqmlTableRowValue"
    // InternalSqml.g:1536:1: ruleSqmlTableRowValue returns [EObject current=null] : ( ( (lv_literal_0_0= ruleSqmlLiteral ) ) | ( (lv_null_1_0= 'NULL' ) ) ) ;
    public final EObject ruleSqmlTableRowValue() throws RecognitionException {
        EObject current = null;

        Token lv_null_1_0=null;
        EObject lv_literal_0_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:1542:2: ( ( ( (lv_literal_0_0= ruleSqmlLiteral ) ) | ( (lv_null_1_0= 'NULL' ) ) ) )
            // InternalSqml.g:1543:2: ( ( (lv_literal_0_0= ruleSqmlLiteral ) ) | ( (lv_null_1_0= 'NULL' ) ) )
            {
            // InternalSqml.g:1543:2: ( ( (lv_literal_0_0= ruleSqmlLiteral ) ) | ( (lv_null_1_0= 'NULL' ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_DOUBLE)||LA21_0==74||LA21_0==101) ) {
                alt21=1;
            }
            else if ( (LA21_0==30) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalSqml.g:1544:3: ( (lv_literal_0_0= ruleSqmlLiteral ) )
                    {
                    // InternalSqml.g:1544:3: ( (lv_literal_0_0= ruleSqmlLiteral ) )
                    // InternalSqml.g:1545:4: (lv_literal_0_0= ruleSqmlLiteral )
                    {
                    // InternalSqml.g:1545:4: (lv_literal_0_0= ruleSqmlLiteral )
                    // InternalSqml.g:1546:5: lv_literal_0_0= ruleSqmlLiteral
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSqmlTableRowValueAccess().getLiteralSqmlLiteralParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_literal_0_0=ruleSqmlLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSqmlTableRowValueRule());
                      					}
                      					set(
                      						current,
                      						"literal",
                      						lv_literal_0_0,
                      						"com.softicar.sqml.Sqml.SqmlLiteral");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSqml.g:1564:3: ( (lv_null_1_0= 'NULL' ) )
                    {
                    // InternalSqml.g:1564:3: ( (lv_null_1_0= 'NULL' ) )
                    // InternalSqml.g:1565:4: (lv_null_1_0= 'NULL' )
                    {
                    // InternalSqml.g:1565:4: (lv_null_1_0= 'NULL' )
                    // InternalSqml.g:1566:5: lv_null_1_0= 'NULL'
                    {
                    lv_null_1_0=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_null_1_0, grammarAccess.getSqmlTableRowValueAccess().getNullNULLKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlTableRowValueRule());
                      					}
                      					setWithLastConsumed(current, "null", lv_null_1_0 != null, "NULL");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlTableRowValue"


    // $ANTLR start "entryRuleSqmlDefaultValue"
    // InternalSqml.g:1582:1: entryRuleSqmlDefaultValue returns [EObject current=null] : iv_ruleSqmlDefaultValue= ruleSqmlDefaultValue EOF ;
    public final EObject entryRuleSqmlDefaultValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlDefaultValue = null;


        try {
            // InternalSqml.g:1582:57: (iv_ruleSqmlDefaultValue= ruleSqmlDefaultValue EOF )
            // InternalSqml.g:1583:2: iv_ruleSqmlDefaultValue= ruleSqmlDefaultValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlDefaultValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlDefaultValue=ruleSqmlDefaultValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlDefaultValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlDefaultValue"


    // $ANTLR start "ruleSqmlDefaultValue"
    // InternalSqml.g:1589:1: ruleSqmlDefaultValue returns [EObject current=null] : (this_SqmlRowConstructorDefaultValue_0= ruleSqmlRowConstructorDefaultValue | this_SqmlLiteralDefaultValue_1= ruleSqmlLiteralDefaultValue | this_SqmlValueReferenceDefaultValue_2= ruleSqmlValueReferenceDefaultValue ) ;
    public final EObject ruleSqmlDefaultValue() throws RecognitionException {
        EObject current = null;

        EObject this_SqmlRowConstructorDefaultValue_0 = null;

        EObject this_SqmlLiteralDefaultValue_1 = null;

        EObject this_SqmlValueReferenceDefaultValue_2 = null;



        	enterRule();

        try {
            // InternalSqml.g:1595:2: ( (this_SqmlRowConstructorDefaultValue_0= ruleSqmlRowConstructorDefaultValue | this_SqmlLiteralDefaultValue_1= ruleSqmlLiteralDefaultValue | this_SqmlValueReferenceDefaultValue_2= ruleSqmlValueReferenceDefaultValue ) )
            // InternalSqml.g:1596:2: (this_SqmlRowConstructorDefaultValue_0= ruleSqmlRowConstructorDefaultValue | this_SqmlLiteralDefaultValue_1= ruleSqmlLiteralDefaultValue | this_SqmlValueReferenceDefaultValue_2= ruleSqmlValueReferenceDefaultValue )
            {
            // InternalSqml.g:1596:2: (this_SqmlRowConstructorDefaultValue_0= ruleSqmlRowConstructorDefaultValue | this_SqmlLiteralDefaultValue_1= ruleSqmlLiteralDefaultValue | this_SqmlValueReferenceDefaultValue_2= ruleSqmlValueReferenceDefaultValue )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt22=1;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_DECIMAL:
            case RULE_LONG:
            case RULE_FLOAT:
            case RULE_DOUBLE:
            case 51:
            case 74:
            case 101:
                {
                alt22=2;
                }
                break;
            case RULE_ID:
            case 87:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalSqml.g:1597:3: this_SqmlRowConstructorDefaultValue_0= ruleSqmlRowConstructorDefaultValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlDefaultValueAccess().getSqmlRowConstructorDefaultValueParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlRowConstructorDefaultValue_0=ruleSqmlRowConstructorDefaultValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlRowConstructorDefaultValue_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSqml.g:1606:3: this_SqmlLiteralDefaultValue_1= ruleSqmlLiteralDefaultValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlDefaultValueAccess().getSqmlLiteralDefaultValueParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlLiteralDefaultValue_1=ruleSqmlLiteralDefaultValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlLiteralDefaultValue_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSqml.g:1615:3: this_SqmlValueReferenceDefaultValue_2= ruleSqmlValueReferenceDefaultValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlDefaultValueAccess().getSqmlValueReferenceDefaultValueParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlValueReferenceDefaultValue_2=ruleSqmlValueReferenceDefaultValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlValueReferenceDefaultValue_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlDefaultValue"


    // $ANTLR start "entryRuleSqmlRowConstructorDefaultValue"
    // InternalSqml.g:1627:1: entryRuleSqmlRowConstructorDefaultValue returns [EObject current=null] : iv_ruleSqmlRowConstructorDefaultValue= ruleSqmlRowConstructorDefaultValue EOF ;
    public final EObject entryRuleSqmlRowConstructorDefaultValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlRowConstructorDefaultValue = null;


        try {
            // InternalSqml.g:1627:71: (iv_ruleSqmlRowConstructorDefaultValue= ruleSqmlRowConstructorDefaultValue EOF )
            // InternalSqml.g:1628:2: iv_ruleSqmlRowConstructorDefaultValue= ruleSqmlRowConstructorDefaultValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlRowConstructorDefaultValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlRowConstructorDefaultValue=ruleSqmlRowConstructorDefaultValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlRowConstructorDefaultValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlRowConstructorDefaultValue"


    // $ANTLR start "ruleSqmlRowConstructorDefaultValue"
    // InternalSqml.g:1634:1: ruleSqmlRowConstructorDefaultValue returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_valueReferences_2_0= ruleSqmlValueReference ) ) (otherlv_3= ',' ( (lv_valueReferences_4_0= ruleSqmlValueReference ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleSqmlRowConstructorDefaultValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_valueReferences_2_0 = null;

        EObject lv_valueReferences_4_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:1640:2: ( ( () otherlv_1= '(' ( ( (lv_valueReferences_2_0= ruleSqmlValueReference ) ) (otherlv_3= ',' ( (lv_valueReferences_4_0= ruleSqmlValueReference ) ) )* )? otherlv_5= ')' ) )
            // InternalSqml.g:1641:2: ( () otherlv_1= '(' ( ( (lv_valueReferences_2_0= ruleSqmlValueReference ) ) (otherlv_3= ',' ( (lv_valueReferences_4_0= ruleSqmlValueReference ) ) )* )? otherlv_5= ')' )
            {
            // InternalSqml.g:1641:2: ( () otherlv_1= '(' ( ( (lv_valueReferences_2_0= ruleSqmlValueReference ) ) (otherlv_3= ',' ( (lv_valueReferences_4_0= ruleSqmlValueReference ) ) )* )? otherlv_5= ')' )
            // InternalSqml.g:1642:3: () otherlv_1= '(' ( ( (lv_valueReferences_2_0= ruleSqmlValueReference ) ) (otherlv_3= ',' ( (lv_valueReferences_4_0= ruleSqmlValueReference ) ) )* )? otherlv_5= ')'
            {
            // InternalSqml.g:1642:3: ()
            // InternalSqml.g:1643:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSqmlRowConstructorDefaultValueAccess().getSqmlRowConstructorDefaultValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSqmlRowConstructorDefaultValueAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSqml.g:1653:3: ( ( (lv_valueReferences_2_0= ruleSqmlValueReference ) ) (otherlv_3= ',' ( (lv_valueReferences_4_0= ruleSqmlValueReference ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID||LA24_0==87) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSqml.g:1654:4: ( (lv_valueReferences_2_0= ruleSqmlValueReference ) ) (otherlv_3= ',' ( (lv_valueReferences_4_0= ruleSqmlValueReference ) ) )*
                    {
                    // InternalSqml.g:1654:4: ( (lv_valueReferences_2_0= ruleSqmlValueReference ) )
                    // InternalSqml.g:1655:5: (lv_valueReferences_2_0= ruleSqmlValueReference )
                    {
                    // InternalSqml.g:1655:5: (lv_valueReferences_2_0= ruleSqmlValueReference )
                    // InternalSqml.g:1656:6: lv_valueReferences_2_0= ruleSqmlValueReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSqmlRowConstructorDefaultValueAccess().getValueReferencesSqmlValueReferenceParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_35);
                    lv_valueReferences_2_0=ruleSqmlValueReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSqmlRowConstructorDefaultValueRule());
                      						}
                      						add(
                      							current,
                      							"valueReferences",
                      							lv_valueReferences_2_0,
                      							"com.softicar.sqml.Sqml.SqmlValueReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSqml.g:1673:4: (otherlv_3= ',' ( (lv_valueReferences_4_0= ruleSqmlValueReference ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==18) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalSqml.g:1674:5: otherlv_3= ',' ( (lv_valueReferences_4_0= ruleSqmlValueReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_37); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getSqmlRowConstructorDefaultValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalSqml.g:1678:5: ( (lv_valueReferences_4_0= ruleSqmlValueReference ) )
                    	    // InternalSqml.g:1679:6: (lv_valueReferences_4_0= ruleSqmlValueReference )
                    	    {
                    	    // InternalSqml.g:1679:6: (lv_valueReferences_4_0= ruleSqmlValueReference )
                    	    // InternalSqml.g:1680:7: lv_valueReferences_4_0= ruleSqmlValueReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSqmlRowConstructorDefaultValueAccess().getValueReferencesSqmlValueReferenceParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_35);
                    	    lv_valueReferences_4_0=ruleSqmlValueReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSqmlRowConstructorDefaultValueRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"valueReferences",
                    	      								lv_valueReferences_4_0,
                    	      								"com.softicar.sqml.Sqml.SqmlValueReference");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSqmlRowConstructorDefaultValueAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlRowConstructorDefaultValue"


    // $ANTLR start "entryRuleSqmlLiteralDefaultValue"
    // InternalSqml.g:1707:1: entryRuleSqmlLiteralDefaultValue returns [EObject current=null] : iv_ruleSqmlLiteralDefaultValue= ruleSqmlLiteralDefaultValue EOF ;
    public final EObject entryRuleSqmlLiteralDefaultValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlLiteralDefaultValue = null;


        try {
            // InternalSqml.g:1707:64: (iv_ruleSqmlLiteralDefaultValue= ruleSqmlLiteralDefaultValue EOF )
            // InternalSqml.g:1708:2: iv_ruleSqmlLiteralDefaultValue= ruleSqmlLiteralDefaultValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlLiteralDefaultValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlLiteralDefaultValue=ruleSqmlLiteralDefaultValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlLiteralDefaultValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlLiteralDefaultValue"


    // $ANTLR start "ruleSqmlLiteralDefaultValue"
    // InternalSqml.g:1714:1: ruleSqmlLiteralDefaultValue returns [EObject current=null] : ( ( (lv_minus_0_0= '-' ) )? ( (lv_literal_1_0= ruleSqmlLiteral ) ) ) ;
    public final EObject ruleSqmlLiteralDefaultValue() throws RecognitionException {
        EObject current = null;

        Token lv_minus_0_0=null;
        EObject lv_literal_1_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:1720:2: ( ( ( (lv_minus_0_0= '-' ) )? ( (lv_literal_1_0= ruleSqmlLiteral ) ) ) )
            // InternalSqml.g:1721:2: ( ( (lv_minus_0_0= '-' ) )? ( (lv_literal_1_0= ruleSqmlLiteral ) ) )
            {
            // InternalSqml.g:1721:2: ( ( (lv_minus_0_0= '-' ) )? ( (lv_literal_1_0= ruleSqmlLiteral ) ) )
            // InternalSqml.g:1722:3: ( (lv_minus_0_0= '-' ) )? ( (lv_literal_1_0= ruleSqmlLiteral ) )
            {
            // InternalSqml.g:1722:3: ( (lv_minus_0_0= '-' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==51) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSqml.g:1723:4: (lv_minus_0_0= '-' )
                    {
                    // InternalSqml.g:1723:4: (lv_minus_0_0= '-' )
                    // InternalSqml.g:1724:5: lv_minus_0_0= '-'
                    {
                    lv_minus_0_0=(Token)match(input,51,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_minus_0_0, grammarAccess.getSqmlLiteralDefaultValueAccess().getMinusHyphenMinusKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlLiteralDefaultValueRule());
                      					}
                      					setWithLastConsumed(current, "minus", lv_minus_0_0 != null, "-");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSqml.g:1736:3: ( (lv_literal_1_0= ruleSqmlLiteral ) )
            // InternalSqml.g:1737:4: (lv_literal_1_0= ruleSqmlLiteral )
            {
            // InternalSqml.g:1737:4: (lv_literal_1_0= ruleSqmlLiteral )
            // InternalSqml.g:1738:5: lv_literal_1_0= ruleSqmlLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlLiteralDefaultValueAccess().getLiteralSqmlLiteralParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_literal_1_0=ruleSqmlLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlLiteralDefaultValueRule());
              					}
              					set(
              						current,
              						"literal",
              						lv_literal_1_0,
              						"com.softicar.sqml.Sqml.SqmlLiteral");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlLiteralDefaultValue"


    // $ANTLR start "entryRuleSqmlValueReferenceDefaultValue"
    // InternalSqml.g:1759:1: entryRuleSqmlValueReferenceDefaultValue returns [EObject current=null] : iv_ruleSqmlValueReferenceDefaultValue= ruleSqmlValueReferenceDefaultValue EOF ;
    public final EObject entryRuleSqmlValueReferenceDefaultValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlValueReferenceDefaultValue = null;


        try {
            // InternalSqml.g:1759:71: (iv_ruleSqmlValueReferenceDefaultValue= ruleSqmlValueReferenceDefaultValue EOF )
            // InternalSqml.g:1760:2: iv_ruleSqmlValueReferenceDefaultValue= ruleSqmlValueReferenceDefaultValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlValueReferenceDefaultValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlValueReferenceDefaultValue=ruleSqmlValueReferenceDefaultValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlValueReferenceDefaultValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlValueReferenceDefaultValue"


    // $ANTLR start "ruleSqmlValueReferenceDefaultValue"
    // InternalSqml.g:1766:1: ruleSqmlValueReferenceDefaultValue returns [EObject current=null] : ( (lv_valueReference_0_0= ruleSqmlValueReference ) ) ;
    public final EObject ruleSqmlValueReferenceDefaultValue() throws RecognitionException {
        EObject current = null;

        EObject lv_valueReference_0_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:1772:2: ( ( (lv_valueReference_0_0= ruleSqmlValueReference ) ) )
            // InternalSqml.g:1773:2: ( (lv_valueReference_0_0= ruleSqmlValueReference ) )
            {
            // InternalSqml.g:1773:2: ( (lv_valueReference_0_0= ruleSqmlValueReference ) )
            // InternalSqml.g:1774:3: (lv_valueReference_0_0= ruleSqmlValueReference )
            {
            // InternalSqml.g:1774:3: (lv_valueReference_0_0= ruleSqmlValueReference )
            // InternalSqml.g:1775:4: lv_valueReference_0_0= ruleSqmlValueReference
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getSqmlValueReferenceDefaultValueAccess().getValueReferenceSqmlValueReferenceParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_valueReference_0_0=ruleSqmlValueReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getSqmlValueReferenceDefaultValueRule());
              				}
              				set(
              					current,
              					"valueReference",
              					lv_valueReference_0_0,
              					"com.softicar.sqml.Sqml.SqmlValueReference");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlValueReferenceDefaultValue"


    // $ANTLR start "entryRuleSqmlTableKey"
    // InternalSqml.g:1795:1: entryRuleSqmlTableKey returns [EObject current=null] : iv_ruleSqmlTableKey= ruleSqmlTableKey EOF ;
    public final EObject entryRuleSqmlTableKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlTableKey = null;


        try {
            // InternalSqml.g:1795:53: (iv_ruleSqmlTableKey= ruleSqmlTableKey EOF )
            // InternalSqml.g:1796:2: iv_ruleSqmlTableKey= ruleSqmlTableKey EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlTableKeyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlTableKey=ruleSqmlTableKey();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlTableKey; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlTableKey"


    // $ANTLR start "ruleSqmlTableKey"
    // InternalSqml.g:1802:1: ruleSqmlTableKey returns [EObject current=null] : ( ( (otherlv_0= 'UK' () ) | (otherlv_2= 'IK' () ) ) ( (otherlv_4= RULE_ID ) )* (otherlv_5= 'AS' ( (lv_name_6_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSqmlTableKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;


        	enterRule();

        try {
            // InternalSqml.g:1808:2: ( ( ( (otherlv_0= 'UK' () ) | (otherlv_2= 'IK' () ) ) ( (otherlv_4= RULE_ID ) )* (otherlv_5= 'AS' ( (lv_name_6_0= RULE_ID ) ) )? ) )
            // InternalSqml.g:1809:2: ( ( (otherlv_0= 'UK' () ) | (otherlv_2= 'IK' () ) ) ( (otherlv_4= RULE_ID ) )* (otherlv_5= 'AS' ( (lv_name_6_0= RULE_ID ) ) )? )
            {
            // InternalSqml.g:1809:2: ( ( (otherlv_0= 'UK' () ) | (otherlv_2= 'IK' () ) ) ( (otherlv_4= RULE_ID ) )* (otherlv_5= 'AS' ( (lv_name_6_0= RULE_ID ) ) )? )
            // InternalSqml.g:1810:3: ( (otherlv_0= 'UK' () ) | (otherlv_2= 'IK' () ) ) ( (otherlv_4= RULE_ID ) )* (otherlv_5= 'AS' ( (lv_name_6_0= RULE_ID ) ) )?
            {
            // InternalSqml.g:1810:3: ( (otherlv_0= 'UK' () ) | (otherlv_2= 'IK' () ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==52) ) {
                alt26=1;
            }
            else if ( (LA26_0==53) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalSqml.g:1811:4: (otherlv_0= 'UK' () )
                    {
                    // InternalSqml.g:1811:4: (otherlv_0= 'UK' () )
                    // InternalSqml.g:1812:5: otherlv_0= 'UK' ()
                    {
                    otherlv_0=(Token)match(input,52,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_0, grammarAccess.getSqmlTableKeyAccess().getUKKeyword_0_0_0());
                      				
                    }
                    // InternalSqml.g:1816:5: ()
                    // InternalSqml.g:1817:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getSqmlTableKeyAccess().getSqmlUniqueKeyAction_0_0_1(),
                      							current);
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSqml.g:1825:4: (otherlv_2= 'IK' () )
                    {
                    // InternalSqml.g:1825:4: (otherlv_2= 'IK' () )
                    // InternalSqml.g:1826:5: otherlv_2= 'IK' ()
                    {
                    otherlv_2=(Token)match(input,53,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getSqmlTableKeyAccess().getIKKeyword_0_1_0());
                      				
                    }
                    // InternalSqml.g:1830:5: ()
                    // InternalSqml.g:1831:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getSqmlTableKeyAccess().getSqmlIndexKeyAction_0_1_1(),
                      							current);
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSqml.g:1839:3: ( (otherlv_4= RULE_ID ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSqml.g:1840:4: (otherlv_4= RULE_ID )
            	    {
            	    // InternalSqml.g:1840:4: (otherlv_4= RULE_ID )
            	    // InternalSqml.g:1841:5: otherlv_4= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElement(grammarAccess.getSqmlTableKeyRule());
            	      					}
            	      				
            	    }
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_38); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_4, grammarAccess.getSqmlTableKeyAccess().getColumnsISqmlTableColumnCrossReference_1_0());
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // InternalSqml.g:1852:3: (otherlv_5= 'AS' ( (lv_name_6_0= RULE_ID ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==54) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSqml.g:1853:4: otherlv_5= 'AS' ( (lv_name_6_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,54,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getSqmlTableKeyAccess().getASKeyword_2_0());
                      			
                    }
                    // InternalSqml.g:1857:4: ( (lv_name_6_0= RULE_ID ) )
                    // InternalSqml.g:1858:5: (lv_name_6_0= RULE_ID )
                    {
                    // InternalSqml.g:1858:5: (lv_name_6_0= RULE_ID )
                    // InternalSqml.g:1859:6: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_6_0, grammarAccess.getSqmlTableKeyAccess().getNameIDTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSqmlTableKeyRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_6_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlTableKey"


    // $ANTLR start "entryRuleSqmlQuery"
    // InternalSqml.g:1880:1: entryRuleSqmlQuery returns [EObject current=null] : iv_ruleSqmlQuery= ruleSqmlQuery EOF ;
    public final EObject entryRuleSqmlQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlQuery = null;


        try {
            // InternalSqml.g:1880:50: (iv_ruleSqmlQuery= ruleSqmlQuery EOF )
            // InternalSqml.g:1881:2: iv_ruleSqmlQuery= ruleSqmlQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlQuery=ruleSqmlQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlQuery; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlQuery"


    // $ANTLR start "ruleSqmlQuery"
    // InternalSqml.g:1887:1: ruleSqmlQuery returns [EObject current=null] : (otherlv_0= 'QUERY' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parameters_3_0= ruleSqmlQueryParameter ) )* ( (lv_select_4_0= ruleSqmlSelect ) ) otherlv_5= '}' ) ;
    public final EObject ruleSqmlQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_select_4_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:1893:2: ( (otherlv_0= 'QUERY' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parameters_3_0= ruleSqmlQueryParameter ) )* ( (lv_select_4_0= ruleSqmlSelect ) ) otherlv_5= '}' ) )
            // InternalSqml.g:1894:2: (otherlv_0= 'QUERY' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parameters_3_0= ruleSqmlQueryParameter ) )* ( (lv_select_4_0= ruleSqmlSelect ) ) otherlv_5= '}' )
            {
            // InternalSqml.g:1894:2: (otherlv_0= 'QUERY' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parameters_3_0= ruleSqmlQueryParameter ) )* ( (lv_select_4_0= ruleSqmlSelect ) ) otherlv_5= '}' )
            // InternalSqml.g:1895:3: otherlv_0= 'QUERY' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parameters_3_0= ruleSqmlQueryParameter ) )* ( (lv_select_4_0= ruleSqmlSelect ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSqmlQueryAccess().getQUERYKeyword_0());
              		
            }
            // InternalSqml.g:1899:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSqml.g:1900:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSqml.g:1900:4: (lv_name_1_0= RULE_ID )
            // InternalSqml.g:1901:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getSqmlQueryAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSqmlQueryRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSqmlQueryAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalSqml.g:1921:3: ( (lv_parameters_3_0= ruleSqmlQueryParameter ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID||LA29_0==56) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSqml.g:1922:4: (lv_parameters_3_0= ruleSqmlQueryParameter )
            	    {
            	    // InternalSqml.g:1922:4: (lv_parameters_3_0= ruleSqmlQueryParameter )
            	    // InternalSqml.g:1923:5: lv_parameters_3_0= ruleSqmlQueryParameter
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSqmlQueryAccess().getParametersSqmlQueryParameterParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_39);
            	    lv_parameters_3_0=ruleSqmlQueryParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSqmlQueryRule());
            	      					}
            	      					add(
            	      						current,
            	      						"parameters",
            	      						lv_parameters_3_0,
            	      						"com.softicar.sqml.Sqml.SqmlQueryParameter");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // InternalSqml.g:1940:3: ( (lv_select_4_0= ruleSqmlSelect ) )
            // InternalSqml.g:1941:4: (lv_select_4_0= ruleSqmlSelect )
            {
            // InternalSqml.g:1941:4: (lv_select_4_0= ruleSqmlSelect )
            // InternalSqml.g:1942:5: lv_select_4_0= ruleSqmlSelect
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlQueryAccess().getSelectSqmlSelectParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_select_4_0=ruleSqmlSelect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlQueryRule());
              					}
              					set(
              						current,
              						"select",
              						lv_select_4_0,
              						"com.softicar.sqml.Sqml.SqmlSelect");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSqmlQueryAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlQuery"


    // $ANTLR start "entryRuleSqmlQueryParameter"
    // InternalSqml.g:1967:1: entryRuleSqmlQueryParameter returns [EObject current=null] : iv_ruleSqmlQueryParameter= ruleSqmlQueryParameter EOF ;
    public final EObject entryRuleSqmlQueryParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlQueryParameter = null;


        try {
            // InternalSqml.g:1967:59: (iv_ruleSqmlQueryParameter= ruleSqmlQueryParameter EOF )
            // InternalSqml.g:1968:2: iv_ruleSqmlQueryParameter= ruleSqmlQueryParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlQueryParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlQueryParameter=ruleSqmlQueryParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlQueryParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlQueryParameter"


    // $ANTLR start "ruleSqmlQueryParameter"
    // InternalSqml.g:1974:1: ruleSqmlQueryParameter returns [EObject current=null] : ( ( (lv_optional_0_0= 'OPTIONAL' ) )? ( (lv_typeReference_1_0= ruleSqmlTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleSqmlQueryParameter() throws RecognitionException {
        EObject current = null;

        Token lv_optional_0_0=null;
        Token lv_name_2_0=null;
        EObject lv_typeReference_1_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:1980:2: ( ( ( (lv_optional_0_0= 'OPTIONAL' ) )? ( (lv_typeReference_1_0= ruleSqmlTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalSqml.g:1981:2: ( ( (lv_optional_0_0= 'OPTIONAL' ) )? ( (lv_typeReference_1_0= ruleSqmlTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalSqml.g:1981:2: ( ( (lv_optional_0_0= 'OPTIONAL' ) )? ( (lv_typeReference_1_0= ruleSqmlTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalSqml.g:1982:3: ( (lv_optional_0_0= 'OPTIONAL' ) )? ( (lv_typeReference_1_0= ruleSqmlTypeReference ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalSqml.g:1982:3: ( (lv_optional_0_0= 'OPTIONAL' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==56) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSqml.g:1983:4: (lv_optional_0_0= 'OPTIONAL' )
                    {
                    // InternalSqml.g:1983:4: (lv_optional_0_0= 'OPTIONAL' )
                    // InternalSqml.g:1984:5: lv_optional_0_0= 'OPTIONAL'
                    {
                    lv_optional_0_0=(Token)match(input,56,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_optional_0_0, grammarAccess.getSqmlQueryParameterAccess().getOptionalOPTIONALKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlQueryParameterRule());
                      					}
                      					setWithLastConsumed(current, "optional", lv_optional_0_0 != null, "OPTIONAL");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSqml.g:1996:3: ( (lv_typeReference_1_0= ruleSqmlTypeReference ) )
            // InternalSqml.g:1997:4: (lv_typeReference_1_0= ruleSqmlTypeReference )
            {
            // InternalSqml.g:1997:4: (lv_typeReference_1_0= ruleSqmlTypeReference )
            // InternalSqml.g:1998:5: lv_typeReference_1_0= ruleSqmlTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlQueryParameterAccess().getTypeReferenceSqmlTypeReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_typeReference_1_0=ruleSqmlTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlQueryParameterRule());
              					}
              					set(
              						current,
              						"typeReference",
              						lv_typeReference_1_0,
              						"com.softicar.sqml.Sqml.SqmlTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSqml.g:2015:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSqml.g:2016:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSqml.g:2016:4: (lv_name_2_0= RULE_ID )
            // InternalSqml.g:2017:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getSqmlQueryParameterAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSqmlQueryParameterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlQueryParameter"


    // $ANTLR start "entryRuleSqmlFunction"
    // InternalSqml.g:2037:1: entryRuleSqmlFunction returns [EObject current=null] : iv_ruleSqmlFunction= ruleSqmlFunction EOF ;
    public final EObject entryRuleSqmlFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlFunction = null;


        try {
            // InternalSqml.g:2037:53: (iv_ruleSqmlFunction= ruleSqmlFunction EOF )
            // InternalSqml.g:2038:2: iv_ruleSqmlFunction= ruleSqmlFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlFunction=ruleSqmlFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlFunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlFunction"


    // $ANTLR start "ruleSqmlFunction"
    // InternalSqml.g:2044:1: ruleSqmlFunction returns [EObject current=null] : (otherlv_0= 'FUNCTION' ( (lv_returnType_1_0= ruleSqmlTypeReference ) ) ( (lv_name_2_0= ruleSqmlFunctionName ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleSqmlFunctionParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleSqmlFunctionParameter ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( ( (lv_expression_9_0= ruleSqmlExpression ) ) | (otherlv_10= 'SQL' ( (lv_sql_11_0= ruleSqmlSql ) ) ) ) otherlv_12= '}' ) ;
    public final EObject ruleSqmlFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_returnType_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_expression_9_0 = null;

        EObject lv_sql_11_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:2050:2: ( (otherlv_0= 'FUNCTION' ( (lv_returnType_1_0= ruleSqmlTypeReference ) ) ( (lv_name_2_0= ruleSqmlFunctionName ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleSqmlFunctionParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleSqmlFunctionParameter ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( ( (lv_expression_9_0= ruleSqmlExpression ) ) | (otherlv_10= 'SQL' ( (lv_sql_11_0= ruleSqmlSql ) ) ) ) otherlv_12= '}' ) )
            // InternalSqml.g:2051:2: (otherlv_0= 'FUNCTION' ( (lv_returnType_1_0= ruleSqmlTypeReference ) ) ( (lv_name_2_0= ruleSqmlFunctionName ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleSqmlFunctionParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleSqmlFunctionParameter ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( ( (lv_expression_9_0= ruleSqmlExpression ) ) | (otherlv_10= 'SQL' ( (lv_sql_11_0= ruleSqmlSql ) ) ) ) otherlv_12= '}' )
            {
            // InternalSqml.g:2051:2: (otherlv_0= 'FUNCTION' ( (lv_returnType_1_0= ruleSqmlTypeReference ) ) ( (lv_name_2_0= ruleSqmlFunctionName ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleSqmlFunctionParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleSqmlFunctionParameter ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( ( (lv_expression_9_0= ruleSqmlExpression ) ) | (otherlv_10= 'SQL' ( (lv_sql_11_0= ruleSqmlSql ) ) ) ) otherlv_12= '}' )
            // InternalSqml.g:2052:3: otherlv_0= 'FUNCTION' ( (lv_returnType_1_0= ruleSqmlTypeReference ) ) ( (lv_name_2_0= ruleSqmlFunctionName ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleSqmlFunctionParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleSqmlFunctionParameter ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( ( (lv_expression_9_0= ruleSqmlExpression ) ) | (otherlv_10= 'SQL' ( (lv_sql_11_0= ruleSqmlSql ) ) ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSqmlFunctionAccess().getFUNCTIONKeyword_0());
              		
            }
            // InternalSqml.g:2056:3: ( (lv_returnType_1_0= ruleSqmlTypeReference ) )
            // InternalSqml.g:2057:4: (lv_returnType_1_0= ruleSqmlTypeReference )
            {
            // InternalSqml.g:2057:4: (lv_returnType_1_0= ruleSqmlTypeReference )
            // InternalSqml.g:2058:5: lv_returnType_1_0= ruleSqmlTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlFunctionAccess().getReturnTypeSqmlTypeReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_40);
            lv_returnType_1_0=ruleSqmlTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlFunctionRule());
              					}
              					set(
              						current,
              						"returnType",
              						lv_returnType_1_0,
              						"com.softicar.sqml.Sqml.SqmlTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSqml.g:2075:3: ( (lv_name_2_0= ruleSqmlFunctionName ) )
            // InternalSqml.g:2076:4: (lv_name_2_0= ruleSqmlFunctionName )
            {
            // InternalSqml.g:2076:4: (lv_name_2_0= ruleSqmlFunctionName )
            // InternalSqml.g:2077:5: lv_name_2_0= ruleSqmlFunctionName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlFunctionAccess().getNameSqmlFunctionNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_33);
            lv_name_2_0=ruleSqmlFunctionName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlFunctionRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"com.softicar.sqml.Sqml.SqmlFunctionName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,49,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSqmlFunctionAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalSqml.g:2098:3: ( ( (lv_parameters_4_0= ruleSqmlFunctionParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleSqmlFunctionParameter ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSqml.g:2099:4: ( (lv_parameters_4_0= ruleSqmlFunctionParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleSqmlFunctionParameter ) ) )*
                    {
                    // InternalSqml.g:2099:4: ( (lv_parameters_4_0= ruleSqmlFunctionParameter ) )
                    // InternalSqml.g:2100:5: (lv_parameters_4_0= ruleSqmlFunctionParameter )
                    {
                    // InternalSqml.g:2100:5: (lv_parameters_4_0= ruleSqmlFunctionParameter )
                    // InternalSqml.g:2101:6: lv_parameters_4_0= ruleSqmlFunctionParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSqmlFunctionAccess().getParametersSqmlFunctionParameterParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_35);
                    lv_parameters_4_0=ruleSqmlFunctionParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSqmlFunctionRule());
                      						}
                      						add(
                      							current,
                      							"parameters",
                      							lv_parameters_4_0,
                      							"com.softicar.sqml.Sqml.SqmlFunctionParameter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSqml.g:2118:4: (otherlv_5= ',' ( (lv_parameters_6_0= ruleSqmlFunctionParameter ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==18) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalSqml.g:2119:5: otherlv_5= ',' ( (lv_parameters_6_0= ruleSqmlFunctionParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getSqmlFunctionAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalSqml.g:2123:5: ( (lv_parameters_6_0= ruleSqmlFunctionParameter ) )
                    	    // InternalSqml.g:2124:6: (lv_parameters_6_0= ruleSqmlFunctionParameter )
                    	    {
                    	    // InternalSqml.g:2124:6: (lv_parameters_6_0= ruleSqmlFunctionParameter )
                    	    // InternalSqml.g:2125:7: lv_parameters_6_0= ruleSqmlFunctionParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSqmlFunctionAccess().getParametersSqmlFunctionParameterParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_35);
                    	    lv_parameters_6_0=ruleSqmlFunctionParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSqmlFunctionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_6_0,
                    	      								"com.softicar.sqml.Sqml.SqmlFunctionParameter");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,50,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getSqmlFunctionAccess().getRightParenthesisKeyword_5());
              		
            }
            otherlv_8=(Token)match(input,23,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getSqmlFunctionAccess().getLeftCurlyBracketKeyword_6());
              		
            }
            // InternalSqml.g:2152:3: ( ( (lv_expression_9_0= ruleSqmlExpression ) ) | (otherlv_10= 'SQL' ( (lv_sql_11_0= ruleSqmlSql ) ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_DOUBLE)||(LA33_0>=48 && LA33_0<=49)||LA33_0==51||LA33_0==65||(LA33_0>=73 && LA33_0<=74)||LA33_0==78||(LA33_0>=80 && LA33_0<=81)||LA33_0==87||LA33_0==89||LA33_0==98||LA33_0==101||LA33_0==118) ) {
                alt33=1;
            }
            else if ( (LA33_0==58) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalSqml.g:2153:4: ( (lv_expression_9_0= ruleSqmlExpression ) )
                    {
                    // InternalSqml.g:2153:4: ( (lv_expression_9_0= ruleSqmlExpression ) )
                    // InternalSqml.g:2154:5: (lv_expression_9_0= ruleSqmlExpression )
                    {
                    // InternalSqml.g:2154:5: (lv_expression_9_0= ruleSqmlExpression )
                    // InternalSqml.g:2155:6: lv_expression_9_0= ruleSqmlExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSqmlFunctionAccess().getExpressionSqmlExpressionParserRuleCall_7_0_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_expression_9_0=ruleSqmlExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSqmlFunctionRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_9_0,
                      							"com.softicar.sqml.Sqml.SqmlExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSqml.g:2173:4: (otherlv_10= 'SQL' ( (lv_sql_11_0= ruleSqmlSql ) ) )
                    {
                    // InternalSqml.g:2173:4: (otherlv_10= 'SQL' ( (lv_sql_11_0= ruleSqmlSql ) ) )
                    // InternalSqml.g:2174:5: otherlv_10= 'SQL' ( (lv_sql_11_0= ruleSqmlSql ) )
                    {
                    otherlv_10=(Token)match(input,58,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_10, grammarAccess.getSqmlFunctionAccess().getSQLKeyword_7_1_0());
                      				
                    }
                    // InternalSqml.g:2178:5: ( (lv_sql_11_0= ruleSqmlSql ) )
                    // InternalSqml.g:2179:6: (lv_sql_11_0= ruleSqmlSql )
                    {
                    // InternalSqml.g:2179:6: (lv_sql_11_0= ruleSqmlSql )
                    // InternalSqml.g:2180:7: lv_sql_11_0= ruleSqmlSql
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSqmlFunctionAccess().getSqlSqmlSqlParserRuleCall_7_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_11);
                    lv_sql_11_0=ruleSqmlSql();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSqmlFunctionRule());
                      							}
                      							set(
                      								current,
                      								"sql",
                      								lv_sql_11_0,
                      								"com.softicar.sqml.Sqml.SqmlSql");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getSqmlFunctionAccess().getRightCurlyBracketKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlFunction"


    // $ANTLR start "entryRuleSqmlFunctionParameter"
    // InternalSqml.g:2207:1: entryRuleSqmlFunctionParameter returns [EObject current=null] : iv_ruleSqmlFunctionParameter= ruleSqmlFunctionParameter EOF ;
    public final EObject entryRuleSqmlFunctionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlFunctionParameter = null;


        try {
            // InternalSqml.g:2207:62: (iv_ruleSqmlFunctionParameter= ruleSqmlFunctionParameter EOF )
            // InternalSqml.g:2208:2: iv_ruleSqmlFunctionParameter= ruleSqmlFunctionParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlFunctionParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlFunctionParameter=ruleSqmlFunctionParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlFunctionParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlFunctionParameter"


    // $ANTLR start "ruleSqmlFunctionParameter"
    // InternalSqml.g:2214:1: ruleSqmlFunctionParameter returns [EObject current=null] : ( ( (lv_typeReference_0_0= ruleSqmlTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSqmlFunctionParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_typeReference_0_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:2220:2: ( ( ( (lv_typeReference_0_0= ruleSqmlTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSqml.g:2221:2: ( ( (lv_typeReference_0_0= ruleSqmlTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSqml.g:2221:2: ( ( (lv_typeReference_0_0= ruleSqmlTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSqml.g:2222:3: ( (lv_typeReference_0_0= ruleSqmlTypeReference ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalSqml.g:2222:3: ( (lv_typeReference_0_0= ruleSqmlTypeReference ) )
            // InternalSqml.g:2223:4: (lv_typeReference_0_0= ruleSqmlTypeReference )
            {
            // InternalSqml.g:2223:4: (lv_typeReference_0_0= ruleSqmlTypeReference )
            // InternalSqml.g:2224:5: lv_typeReference_0_0= ruleSqmlTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlFunctionParameterAccess().getTypeReferenceSqmlTypeReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_typeReference_0_0=ruleSqmlTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlFunctionParameterRule());
              					}
              					set(
              						current,
              						"typeReference",
              						lv_typeReference_0_0,
              						"com.softicar.sqml.Sqml.SqmlTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSqml.g:2241:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSqml.g:2242:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSqml.g:2242:4: (lv_name_1_0= RULE_ID )
            // InternalSqml.g:2243:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getSqmlFunctionParameterAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSqmlFunctionParameterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlFunctionParameter"


    // $ANTLR start "entryRuleSqmlSql"
    // InternalSqml.g:2263:1: entryRuleSqmlSql returns [EObject current=null] : iv_ruleSqmlSql= ruleSqmlSql EOF ;
    public final EObject entryRuleSqmlSql() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlSql = null;


        try {
            // InternalSqml.g:2263:48: (iv_ruleSqmlSql= ruleSqmlSql EOF )
            // InternalSqml.g:2264:2: iv_ruleSqmlSql= ruleSqmlSql EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlSqlRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlSql=ruleSqmlSql();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlSql; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlSql"


    // $ANTLR start "ruleSqmlSql"
    // InternalSqml.g:2270:1: ruleSqmlSql returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_tokens_2_0= ruleSqmlSqlToken ) )* otherlv_3= '}' ) ;
    public final EObject ruleSqmlSql() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_tokens_2_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:2276:2: ( ( () otherlv_1= '{' ( (lv_tokens_2_0= ruleSqmlSqlToken ) )* otherlv_3= '}' ) )
            // InternalSqml.g:2277:2: ( () otherlv_1= '{' ( (lv_tokens_2_0= ruleSqmlSqlToken ) )* otherlv_3= '}' )
            {
            // InternalSqml.g:2277:2: ( () otherlv_1= '{' ( (lv_tokens_2_0= ruleSqmlSqlToken ) )* otherlv_3= '}' )
            // InternalSqml.g:2278:3: () otherlv_1= '{' ( (lv_tokens_2_0= ruleSqmlSqlToken ) )* otherlv_3= '}'
            {
            // InternalSqml.g:2278:3: ()
            // InternalSqml.g:2279:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSqmlSqlAccess().getSqmlSqlAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSqmlSqlAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalSqml.g:2289:3: ( (lv_tokens_2_0= ruleSqmlSqlToken ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_DECIMAL)||(LA34_0>=15 && LA34_0<=19)||LA34_0==22||(LA34_0>=25 && LA34_0<=116)||LA34_0==118) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalSqml.g:2290:4: (lv_tokens_2_0= ruleSqmlSqlToken )
            	    {
            	    // InternalSqml.g:2290:4: (lv_tokens_2_0= ruleSqmlSqlToken )
            	    // InternalSqml.g:2291:5: lv_tokens_2_0= ruleSqmlSqlToken
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSqmlSqlAccess().getTokensSqmlSqlTokenParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_43);
            	    lv_tokens_2_0=ruleSqmlSqlToken();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSqmlSqlRule());
            	      					}
            	      					add(
            	      						current,
            	      						"tokens",
            	      						lv_tokens_2_0,
            	      						"com.softicar.sqml.Sqml.SqmlSqlToken");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSqmlSqlAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlSql"


    // $ANTLR start "entryRuleSqmlSqlToken"
    // InternalSqml.g:2316:1: entryRuleSqmlSqlToken returns [EObject current=null] : iv_ruleSqmlSqlToken= ruleSqmlSqlToken EOF ;
    public final EObject entryRuleSqmlSqlToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlSqlToken = null;


        try {
            // InternalSqml.g:2316:53: (iv_ruleSqmlSqlToken= ruleSqmlSqlToken EOF )
            // InternalSqml.g:2317:2: iv_ruleSqmlSqlToken= ruleSqmlSqlToken EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlSqlTokenRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlSqlToken=ruleSqmlSqlToken();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlSqlToken; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlSqlToken"


    // $ANTLR start "ruleSqmlSqlToken"
    // InternalSqml.g:2323:1: ruleSqmlSqlToken returns [EObject current=null] : ( ( ( ruleSqmlStaticVariableReference )=>this_SqmlStaticVariableReference_0= ruleSqmlStaticVariableReference ) | this_SqmlSqlKeyword_1= ruleSqmlSqlKeyword | this_SqmlSqlId_2= ruleSqmlSqlId | this_SqmlSqlNumberLiteral_3= ruleSqmlSqlNumberLiteral | this_SqmlSqlStringLiteral_4= ruleSqmlSqlStringLiteral | this_SqmlSqlSymbol_5= ruleSqmlSqlSymbol ) ;
    public final EObject ruleSqmlSqlToken() throws RecognitionException {
        EObject current = null;

        EObject this_SqmlStaticVariableReference_0 = null;

        EObject this_SqmlSqlKeyword_1 = null;

        EObject this_SqmlSqlId_2 = null;

        EObject this_SqmlSqlNumberLiteral_3 = null;

        EObject this_SqmlSqlStringLiteral_4 = null;

        EObject this_SqmlSqlSymbol_5 = null;



        	enterRule();

        try {
            // InternalSqml.g:2329:2: ( ( ( ( ruleSqmlStaticVariableReference )=>this_SqmlStaticVariableReference_0= ruleSqmlStaticVariableReference ) | this_SqmlSqlKeyword_1= ruleSqmlSqlKeyword | this_SqmlSqlId_2= ruleSqmlSqlId | this_SqmlSqlNumberLiteral_3= ruleSqmlSqlNumberLiteral | this_SqmlSqlStringLiteral_4= ruleSqmlSqlStringLiteral | this_SqmlSqlSymbol_5= ruleSqmlSqlSymbol ) )
            // InternalSqml.g:2330:2: ( ( ( ruleSqmlStaticVariableReference )=>this_SqmlStaticVariableReference_0= ruleSqmlStaticVariableReference ) | this_SqmlSqlKeyword_1= ruleSqmlSqlKeyword | this_SqmlSqlId_2= ruleSqmlSqlId | this_SqmlSqlNumberLiteral_3= ruleSqmlSqlNumberLiteral | this_SqmlSqlStringLiteral_4= ruleSqmlSqlStringLiteral | this_SqmlSqlSymbol_5= ruleSqmlSqlSymbol )
            {
            // InternalSqml.g:2330:2: ( ( ( ruleSqmlStaticVariableReference )=>this_SqmlStaticVariableReference_0= ruleSqmlStaticVariableReference ) | this_SqmlSqlKeyword_1= ruleSqmlSqlKeyword | this_SqmlSqlId_2= ruleSqmlSqlId | this_SqmlSqlNumberLiteral_3= ruleSqmlSqlNumberLiteral | this_SqmlSqlStringLiteral_4= ruleSqmlSqlStringLiteral | this_SqmlSqlSymbol_5= ruleSqmlSqlSymbol )
            int alt35=6;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==87) ) {
                int LA35_1 = input.LA(2);

                if ( (synpred1_InternalSqml()) ) {
                    alt35=1;
                }
                else if ( (true) ) {
                    alt35=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA35_0==118) && (synpred1_InternalSqml())) {
                alt35=1;
            }
            else if ( ((LA35_0>=15 && LA35_0<=16)||LA35_0==22||(LA35_0>=25 && LA35_0<=26)||(LA35_0>=28 && LA35_0<=48)||(LA35_0>=52 && LA35_0<=86)||(LA35_0>=88 && LA35_0<=103)) ) {
                alt35=2;
            }
            else if ( (LA35_0==RULE_ID) ) {
                alt35=3;
            }
            else if ( ((LA35_0>=RULE_INT && LA35_0<=RULE_DECIMAL)) ) {
                alt35=4;
            }
            else if ( (LA35_0==RULE_STRING) ) {
                alt35=5;
            }
            else if ( ((LA35_0>=17 && LA35_0<=19)||LA35_0==27||(LA35_0>=49 && LA35_0<=51)||(LA35_0>=104 && LA35_0<=116)) ) {
                alt35=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalSqml.g:2331:3: ( ( ruleSqmlStaticVariableReference )=>this_SqmlStaticVariableReference_0= ruleSqmlStaticVariableReference )
                    {
                    // InternalSqml.g:2331:3: ( ( ruleSqmlStaticVariableReference )=>this_SqmlStaticVariableReference_0= ruleSqmlStaticVariableReference )
                    // InternalSqml.g:2332:4: ( ruleSqmlStaticVariableReference )=>this_SqmlStaticVariableReference_0= ruleSqmlStaticVariableReference
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSqmlSqlTokenAccess().getSqmlStaticVariableReferenceParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlStaticVariableReference_0=ruleSqmlStaticVariableReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_SqmlStaticVariableReference_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSqml.g:2343:3: this_SqmlSqlKeyword_1= ruleSqmlSqlKeyword
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlSqlTokenAccess().getSqmlSqlKeywordParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlSqlKeyword_1=ruleSqmlSqlKeyword();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlSqlKeyword_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSqml.g:2352:3: this_SqmlSqlId_2= ruleSqmlSqlId
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlSqlTokenAccess().getSqmlSqlIdParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlSqlId_2=ruleSqmlSqlId();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlSqlId_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSqml.g:2361:3: this_SqmlSqlNumberLiteral_3= ruleSqmlSqlNumberLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlSqlTokenAccess().getSqmlSqlNumberLiteralParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlSqlNumberLiteral_3=ruleSqmlSqlNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlSqlNumberLiteral_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalSqml.g:2370:3: this_SqmlSqlStringLiteral_4= ruleSqmlSqlStringLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlSqlTokenAccess().getSqmlSqlStringLiteralParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlSqlStringLiteral_4=ruleSqmlSqlStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlSqlStringLiteral_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalSqml.g:2379:3: this_SqmlSqlSymbol_5= ruleSqmlSqlSymbol
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlSqlTokenAccess().getSqmlSqlSymbolParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlSqlSymbol_5=ruleSqmlSqlSymbol();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlSqlSymbol_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlSqlToken"


    // $ANTLR start "entryRuleSqmlSqlKeyword"
    // InternalSqml.g:2391:1: entryRuleSqmlSqlKeyword returns [EObject current=null] : iv_ruleSqmlSqlKeyword= ruleSqmlSqlKeyword EOF ;
    public final EObject entryRuleSqmlSqlKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlSqlKeyword = null;


        try {
            // InternalSqml.g:2391:55: (iv_ruleSqmlSqlKeyword= ruleSqmlSqlKeyword EOF )
            // InternalSqml.g:2392:2: iv_ruleSqmlSqlKeyword= ruleSqmlSqlKeyword EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlSqlKeywordRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlSqlKeyword=ruleSqmlSqlKeyword();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlSqlKeyword; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlSqlKeyword"


    // $ANTLR start "ruleSqmlSqlKeyword"
    // InternalSqml.g:2398:1: ruleSqmlSqlKeyword returns [EObject current=null] : ( ( (lv_keywordText_0_1= 'ACTION' | lv_keywordText_0_2= 'AND' | lv_keywordText_0_3= 'AS' | lv_keywordText_0_4= 'ASC' | lv_keywordText_0_5= 'BASE' | lv_keywordText_0_6= 'BETWEEN' | lv_keywordText_0_7= 'BITS' | lv_keywordText_0_8= 'BY' | lv_keywordText_0_9= 'CASCADE' | lv_keywordText_0_10= 'CASE' | lv_keywordText_0_11= 'CHARACTER' | lv_keywordText_0_12= 'COLLATION' | lv_keywordText_0_13= 'COMMENT' | lv_keywordText_0_14= 'CONSTRAINT_NAME' | lv_keywordText_0_15= 'DEFAULT' | lv_keywordText_0_16= 'DELETE' | lv_keywordText_0_17= 'DESC' | lv_keywordText_0_18= 'DISTINCT' | lv_keywordText_0_19= 'ELSE' | lv_keywordText_0_20= 'EMPTY' | lv_keywordText_0_21= 'END' | lv_keywordText_0_22= 'ENUM' | lv_keywordText_0_23= 'ESCAPE' | lv_keywordText_0_24= 'EXISTS' | lv_keywordText_0_25= 'FALSE' | lv_keywordText_0_26= 'FOR' | lv_keywordText_0_27= 'FROM' | lv_keywordText_0_28= 'FUNCTION' | lv_keywordText_0_29= 'GROUP' | lv_keywordText_0_30= 'GROUP_CONCAT' | lv_keywordText_0_31= 'HAVING' | lv_keywordText_0_32= 'IF' | lv_keywordText_0_33= 'IFNULL' | lv_keywordText_0_34= 'IK' | lv_keywordText_0_35= 'IMPORT' | lv_keywordText_0_36= 'IN' | lv_keywordText_0_37= 'IS' | lv_keywordText_0_38= 'JOIN' | lv_keywordText_0_39= 'LEFT' | lv_keywordText_0_40= 'LENGTHBITS' | lv_keywordText_0_41= 'LIKE' | lv_keywordText_0_42= 'MAXLENGTH' | lv_keywordText_0_43= 'NEXT' | lv_keywordText_0_44= 'NO_ACTION' | lv_keywordText_0_45= 'NOT' | lv_keywordText_0_46= 'NOW' | lv_keywordText_0_47= 'NULL' | lv_keywordText_0_48= 'NULLABLE' | lv_keywordText_0_49= 'ON' | lv_keywordText_0_50= 'OPTIONAL' | lv_keywordText_0_51= 'OR' | lv_keywordText_0_52= 'ORDER' | lv_keywordText_0_53= 'PACKAGE' | lv_keywordText_0_54= 'PK' | lv_keywordText_0_55= 'PRECISION' | lv_keywordText_0_56= 'QUERY' | lv_keywordText_0_57= 'REGEXP' | lv_keywordText_0_58= 'RESTRICT' | lv_keywordText_0_59= 'ROW' | lv_keywordText_0_60= 'SELECT' | lv_keywordText_0_61= 'SEPARATOR' | lv_keywordText_0_62= 'SERIAL' | lv_keywordText_0_63= 'SET' | lv_keywordText_0_64= 'SET_DEFAULT' | lv_keywordText_0_65= 'SET_NULL' | lv_keywordText_0_66= 'SQL' | lv_keywordText_0_67= 'STATIC' | lv_keywordText_0_68= 'TABLE' | lv_keywordText_0_69= 'THEN' | lv_keywordText_0_70= 'TIMESTAMP' | lv_keywordText_0_71= 'TITLE' | lv_keywordText_0_72= 'TRUE' | lv_keywordText_0_73= 'UK' | lv_keywordText_0_74= 'UNSIGNED' | lv_keywordText_0_75= 'UPDATE' | lv_keywordText_0_76= 'VALUETYPE' | lv_keywordText_0_77= 'WHEN' | lv_keywordText_0_78= 'WHERE' ) ) ) ;
    public final EObject ruleSqmlSqlKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keywordText_0_1=null;
        Token lv_keywordText_0_2=null;
        Token lv_keywordText_0_3=null;
        Token lv_keywordText_0_4=null;
        Token lv_keywordText_0_5=null;
        Token lv_keywordText_0_6=null;
        Token lv_keywordText_0_7=null;
        Token lv_keywordText_0_8=null;
        Token lv_keywordText_0_9=null;
        Token lv_keywordText_0_10=null;
        Token lv_keywordText_0_11=null;
        Token lv_keywordText_0_12=null;
        Token lv_keywordText_0_13=null;
        Token lv_keywordText_0_14=null;
        Token lv_keywordText_0_15=null;
        Token lv_keywordText_0_16=null;
        Token lv_keywordText_0_17=null;
        Token lv_keywordText_0_18=null;
        Token lv_keywordText_0_19=null;
        Token lv_keywordText_0_20=null;
        Token lv_keywordText_0_21=null;
        Token lv_keywordText_0_22=null;
        Token lv_keywordText_0_23=null;
        Token lv_keywordText_0_24=null;
        Token lv_keywordText_0_25=null;
        Token lv_keywordText_0_26=null;
        Token lv_keywordText_0_27=null;
        Token lv_keywordText_0_28=null;
        Token lv_keywordText_0_29=null;
        Token lv_keywordText_0_30=null;
        Token lv_keywordText_0_31=null;
        Token lv_keywordText_0_32=null;
        Token lv_keywordText_0_33=null;
        Token lv_keywordText_0_34=null;
        Token lv_keywordText_0_35=null;
        Token lv_keywordText_0_36=null;
        Token lv_keywordText_0_37=null;
        Token lv_keywordText_0_38=null;
        Token lv_keywordText_0_39=null;
        Token lv_keywordText_0_40=null;
        Token lv_keywordText_0_41=null;
        Token lv_keywordText_0_42=null;
        Token lv_keywordText_0_43=null;
        Token lv_keywordText_0_44=null;
        Token lv_keywordText_0_45=null;
        Token lv_keywordText_0_46=null;
        Token lv_keywordText_0_47=null;
        Token lv_keywordText_0_48=null;
        Token lv_keywordText_0_49=null;
        Token lv_keywordText_0_50=null;
        Token lv_keywordText_0_51=null;
        Token lv_keywordText_0_52=null;
        Token lv_keywordText_0_53=null;
        Token lv_keywordText_0_54=null;
        Token lv_keywordText_0_55=null;
        Token lv_keywordText_0_56=null;
        Token lv_keywordText_0_57=null;
        Token lv_keywordText_0_58=null;
        Token lv_keywordText_0_59=null;
        Token lv_keywordText_0_60=null;
        Token lv_keywordText_0_61=null;
        Token lv_keywordText_0_62=null;
        Token lv_keywordText_0_63=null;
        Token lv_keywordText_0_64=null;
        Token lv_keywordText_0_65=null;
        Token lv_keywordText_0_66=null;
        Token lv_keywordText_0_67=null;
        Token lv_keywordText_0_68=null;
        Token lv_keywordText_0_69=null;
        Token lv_keywordText_0_70=null;
        Token lv_keywordText_0_71=null;
        Token lv_keywordText_0_72=null;
        Token lv_keywordText_0_73=null;
        Token lv_keywordText_0_74=null;
        Token lv_keywordText_0_75=null;
        Token lv_keywordText_0_76=null;
        Token lv_keywordText_0_77=null;
        Token lv_keywordText_0_78=null;


        	enterRule();

        try {
            // InternalSqml.g:2404:2: ( ( ( (lv_keywordText_0_1= 'ACTION' | lv_keywordText_0_2= 'AND' | lv_keywordText_0_3= 'AS' | lv_keywordText_0_4= 'ASC' | lv_keywordText_0_5= 'BASE' | lv_keywordText_0_6= 'BETWEEN' | lv_keywordText_0_7= 'BITS' | lv_keywordText_0_8= 'BY' | lv_keywordText_0_9= 'CASCADE' | lv_keywordText_0_10= 'CASE' | lv_keywordText_0_11= 'CHARACTER' | lv_keywordText_0_12= 'COLLATION' | lv_keywordText_0_13= 'COMMENT' | lv_keywordText_0_14= 'CONSTRAINT_NAME' | lv_keywordText_0_15= 'DEFAULT' | lv_keywordText_0_16= 'DELETE' | lv_keywordText_0_17= 'DESC' | lv_keywordText_0_18= 'DISTINCT' | lv_keywordText_0_19= 'ELSE' | lv_keywordText_0_20= 'EMPTY' | lv_keywordText_0_21= 'END' | lv_keywordText_0_22= 'ENUM' | lv_keywordText_0_23= 'ESCAPE' | lv_keywordText_0_24= 'EXISTS' | lv_keywordText_0_25= 'FALSE' | lv_keywordText_0_26= 'FOR' | lv_keywordText_0_27= 'FROM' | lv_keywordText_0_28= 'FUNCTION' | lv_keywordText_0_29= 'GROUP' | lv_keywordText_0_30= 'GROUP_CONCAT' | lv_keywordText_0_31= 'HAVING' | lv_keywordText_0_32= 'IF' | lv_keywordText_0_33= 'IFNULL' | lv_keywordText_0_34= 'IK' | lv_keywordText_0_35= 'IMPORT' | lv_keywordText_0_36= 'IN' | lv_keywordText_0_37= 'IS' | lv_keywordText_0_38= 'JOIN' | lv_keywordText_0_39= 'LEFT' | lv_keywordText_0_40= 'LENGTHBITS' | lv_keywordText_0_41= 'LIKE' | lv_keywordText_0_42= 'MAXLENGTH' | lv_keywordText_0_43= 'NEXT' | lv_keywordText_0_44= 'NO_ACTION' | lv_keywordText_0_45= 'NOT' | lv_keywordText_0_46= 'NOW' | lv_keywordText_0_47= 'NULL' | lv_keywordText_0_48= 'NULLABLE' | lv_keywordText_0_49= 'ON' | lv_keywordText_0_50= 'OPTIONAL' | lv_keywordText_0_51= 'OR' | lv_keywordText_0_52= 'ORDER' | lv_keywordText_0_53= 'PACKAGE' | lv_keywordText_0_54= 'PK' | lv_keywordText_0_55= 'PRECISION' | lv_keywordText_0_56= 'QUERY' | lv_keywordText_0_57= 'REGEXP' | lv_keywordText_0_58= 'RESTRICT' | lv_keywordText_0_59= 'ROW' | lv_keywordText_0_60= 'SELECT' | lv_keywordText_0_61= 'SEPARATOR' | lv_keywordText_0_62= 'SERIAL' | lv_keywordText_0_63= 'SET' | lv_keywordText_0_64= 'SET_DEFAULT' | lv_keywordText_0_65= 'SET_NULL' | lv_keywordText_0_66= 'SQL' | lv_keywordText_0_67= 'STATIC' | lv_keywordText_0_68= 'TABLE' | lv_keywordText_0_69= 'THEN' | lv_keywordText_0_70= 'TIMESTAMP' | lv_keywordText_0_71= 'TITLE' | lv_keywordText_0_72= 'TRUE' | lv_keywordText_0_73= 'UK' | lv_keywordText_0_74= 'UNSIGNED' | lv_keywordText_0_75= 'UPDATE' | lv_keywordText_0_76= 'VALUETYPE' | lv_keywordText_0_77= 'WHEN' | lv_keywordText_0_78= 'WHERE' ) ) ) )
            // InternalSqml.g:2405:2: ( ( (lv_keywordText_0_1= 'ACTION' | lv_keywordText_0_2= 'AND' | lv_keywordText_0_3= 'AS' | lv_keywordText_0_4= 'ASC' | lv_keywordText_0_5= 'BASE' | lv_keywordText_0_6= 'BETWEEN' | lv_keywordText_0_7= 'BITS' | lv_keywordText_0_8= 'BY' | lv_keywordText_0_9= 'CASCADE' | lv_keywordText_0_10= 'CASE' | lv_keywordText_0_11= 'CHARACTER' | lv_keywordText_0_12= 'COLLATION' | lv_keywordText_0_13= 'COMMENT' | lv_keywordText_0_14= 'CONSTRAINT_NAME' | lv_keywordText_0_15= 'DEFAULT' | lv_keywordText_0_16= 'DELETE' | lv_keywordText_0_17= 'DESC' | lv_keywordText_0_18= 'DISTINCT' | lv_keywordText_0_19= 'ELSE' | lv_keywordText_0_20= 'EMPTY' | lv_keywordText_0_21= 'END' | lv_keywordText_0_22= 'ENUM' | lv_keywordText_0_23= 'ESCAPE' | lv_keywordText_0_24= 'EXISTS' | lv_keywordText_0_25= 'FALSE' | lv_keywordText_0_26= 'FOR' | lv_keywordText_0_27= 'FROM' | lv_keywordText_0_28= 'FUNCTION' | lv_keywordText_0_29= 'GROUP' | lv_keywordText_0_30= 'GROUP_CONCAT' | lv_keywordText_0_31= 'HAVING' | lv_keywordText_0_32= 'IF' | lv_keywordText_0_33= 'IFNULL' | lv_keywordText_0_34= 'IK' | lv_keywordText_0_35= 'IMPORT' | lv_keywordText_0_36= 'IN' | lv_keywordText_0_37= 'IS' | lv_keywordText_0_38= 'JOIN' | lv_keywordText_0_39= 'LEFT' | lv_keywordText_0_40= 'LENGTHBITS' | lv_keywordText_0_41= 'LIKE' | lv_keywordText_0_42= 'MAXLENGTH' | lv_keywordText_0_43= 'NEXT' | lv_keywordText_0_44= 'NO_ACTION' | lv_keywordText_0_45= 'NOT' | lv_keywordText_0_46= 'NOW' | lv_keywordText_0_47= 'NULL' | lv_keywordText_0_48= 'NULLABLE' | lv_keywordText_0_49= 'ON' | lv_keywordText_0_50= 'OPTIONAL' | lv_keywordText_0_51= 'OR' | lv_keywordText_0_52= 'ORDER' | lv_keywordText_0_53= 'PACKAGE' | lv_keywordText_0_54= 'PK' | lv_keywordText_0_55= 'PRECISION' | lv_keywordText_0_56= 'QUERY' | lv_keywordText_0_57= 'REGEXP' | lv_keywordText_0_58= 'RESTRICT' | lv_keywordText_0_59= 'ROW' | lv_keywordText_0_60= 'SELECT' | lv_keywordText_0_61= 'SEPARATOR' | lv_keywordText_0_62= 'SERIAL' | lv_keywordText_0_63= 'SET' | lv_keywordText_0_64= 'SET_DEFAULT' | lv_keywordText_0_65= 'SET_NULL' | lv_keywordText_0_66= 'SQL' | lv_keywordText_0_67= 'STATIC' | lv_keywordText_0_68= 'TABLE' | lv_keywordText_0_69= 'THEN' | lv_keywordText_0_70= 'TIMESTAMP' | lv_keywordText_0_71= 'TITLE' | lv_keywordText_0_72= 'TRUE' | lv_keywordText_0_73= 'UK' | lv_keywordText_0_74= 'UNSIGNED' | lv_keywordText_0_75= 'UPDATE' | lv_keywordText_0_76= 'VALUETYPE' | lv_keywordText_0_77= 'WHEN' | lv_keywordText_0_78= 'WHERE' ) ) )
            {
            // InternalSqml.g:2405:2: ( ( (lv_keywordText_0_1= 'ACTION' | lv_keywordText_0_2= 'AND' | lv_keywordText_0_3= 'AS' | lv_keywordText_0_4= 'ASC' | lv_keywordText_0_5= 'BASE' | lv_keywordText_0_6= 'BETWEEN' | lv_keywordText_0_7= 'BITS' | lv_keywordText_0_8= 'BY' | lv_keywordText_0_9= 'CASCADE' | lv_keywordText_0_10= 'CASE' | lv_keywordText_0_11= 'CHARACTER' | lv_keywordText_0_12= 'COLLATION' | lv_keywordText_0_13= 'COMMENT' | lv_keywordText_0_14= 'CONSTRAINT_NAME' | lv_keywordText_0_15= 'DEFAULT' | lv_keywordText_0_16= 'DELETE' | lv_keywordText_0_17= 'DESC' | lv_keywordText_0_18= 'DISTINCT' | lv_keywordText_0_19= 'ELSE' | lv_keywordText_0_20= 'EMPTY' | lv_keywordText_0_21= 'END' | lv_keywordText_0_22= 'ENUM' | lv_keywordText_0_23= 'ESCAPE' | lv_keywordText_0_24= 'EXISTS' | lv_keywordText_0_25= 'FALSE' | lv_keywordText_0_26= 'FOR' | lv_keywordText_0_27= 'FROM' | lv_keywordText_0_28= 'FUNCTION' | lv_keywordText_0_29= 'GROUP' | lv_keywordText_0_30= 'GROUP_CONCAT' | lv_keywordText_0_31= 'HAVING' | lv_keywordText_0_32= 'IF' | lv_keywordText_0_33= 'IFNULL' | lv_keywordText_0_34= 'IK' | lv_keywordText_0_35= 'IMPORT' | lv_keywordText_0_36= 'IN' | lv_keywordText_0_37= 'IS' | lv_keywordText_0_38= 'JOIN' | lv_keywordText_0_39= 'LEFT' | lv_keywordText_0_40= 'LENGTHBITS' | lv_keywordText_0_41= 'LIKE' | lv_keywordText_0_42= 'MAXLENGTH' | lv_keywordText_0_43= 'NEXT' | lv_keywordText_0_44= 'NO_ACTION' | lv_keywordText_0_45= 'NOT' | lv_keywordText_0_46= 'NOW' | lv_keywordText_0_47= 'NULL' | lv_keywordText_0_48= 'NULLABLE' | lv_keywordText_0_49= 'ON' | lv_keywordText_0_50= 'OPTIONAL' | lv_keywordText_0_51= 'OR' | lv_keywordText_0_52= 'ORDER' | lv_keywordText_0_53= 'PACKAGE' | lv_keywordText_0_54= 'PK' | lv_keywordText_0_55= 'PRECISION' | lv_keywordText_0_56= 'QUERY' | lv_keywordText_0_57= 'REGEXP' | lv_keywordText_0_58= 'RESTRICT' | lv_keywordText_0_59= 'ROW' | lv_keywordText_0_60= 'SELECT' | lv_keywordText_0_61= 'SEPARATOR' | lv_keywordText_0_62= 'SERIAL' | lv_keywordText_0_63= 'SET' | lv_keywordText_0_64= 'SET_DEFAULT' | lv_keywordText_0_65= 'SET_NULL' | lv_keywordText_0_66= 'SQL' | lv_keywordText_0_67= 'STATIC' | lv_keywordText_0_68= 'TABLE' | lv_keywordText_0_69= 'THEN' | lv_keywordText_0_70= 'TIMESTAMP' | lv_keywordText_0_71= 'TITLE' | lv_keywordText_0_72= 'TRUE' | lv_keywordText_0_73= 'UK' | lv_keywordText_0_74= 'UNSIGNED' | lv_keywordText_0_75= 'UPDATE' | lv_keywordText_0_76= 'VALUETYPE' | lv_keywordText_0_77= 'WHEN' | lv_keywordText_0_78= 'WHERE' ) ) )
            // InternalSqml.g:2406:3: ( (lv_keywordText_0_1= 'ACTION' | lv_keywordText_0_2= 'AND' | lv_keywordText_0_3= 'AS' | lv_keywordText_0_4= 'ASC' | lv_keywordText_0_5= 'BASE' | lv_keywordText_0_6= 'BETWEEN' | lv_keywordText_0_7= 'BITS' | lv_keywordText_0_8= 'BY' | lv_keywordText_0_9= 'CASCADE' | lv_keywordText_0_10= 'CASE' | lv_keywordText_0_11= 'CHARACTER' | lv_keywordText_0_12= 'COLLATION' | lv_keywordText_0_13= 'COMMENT' | lv_keywordText_0_14= 'CONSTRAINT_NAME' | lv_keywordText_0_15= 'DEFAULT' | lv_keywordText_0_16= 'DELETE' | lv_keywordText_0_17= 'DESC' | lv_keywordText_0_18= 'DISTINCT' | lv_keywordText_0_19= 'ELSE' | lv_keywordText_0_20= 'EMPTY' | lv_keywordText_0_21= 'END' | lv_keywordText_0_22= 'ENUM' | lv_keywordText_0_23= 'ESCAPE' | lv_keywordText_0_24= 'EXISTS' | lv_keywordText_0_25= 'FALSE' | lv_keywordText_0_26= 'FOR' | lv_keywordText_0_27= 'FROM' | lv_keywordText_0_28= 'FUNCTION' | lv_keywordText_0_29= 'GROUP' | lv_keywordText_0_30= 'GROUP_CONCAT' | lv_keywordText_0_31= 'HAVING' | lv_keywordText_0_32= 'IF' | lv_keywordText_0_33= 'IFNULL' | lv_keywordText_0_34= 'IK' | lv_keywordText_0_35= 'IMPORT' | lv_keywordText_0_36= 'IN' | lv_keywordText_0_37= 'IS' | lv_keywordText_0_38= 'JOIN' | lv_keywordText_0_39= 'LEFT' | lv_keywordText_0_40= 'LENGTHBITS' | lv_keywordText_0_41= 'LIKE' | lv_keywordText_0_42= 'MAXLENGTH' | lv_keywordText_0_43= 'NEXT' | lv_keywordText_0_44= 'NO_ACTION' | lv_keywordText_0_45= 'NOT' | lv_keywordText_0_46= 'NOW' | lv_keywordText_0_47= 'NULL' | lv_keywordText_0_48= 'NULLABLE' | lv_keywordText_0_49= 'ON' | lv_keywordText_0_50= 'OPTIONAL' | lv_keywordText_0_51= 'OR' | lv_keywordText_0_52= 'ORDER' | lv_keywordText_0_53= 'PACKAGE' | lv_keywordText_0_54= 'PK' | lv_keywordText_0_55= 'PRECISION' | lv_keywordText_0_56= 'QUERY' | lv_keywordText_0_57= 'REGEXP' | lv_keywordText_0_58= 'RESTRICT' | lv_keywordText_0_59= 'ROW' | lv_keywordText_0_60= 'SELECT' | lv_keywordText_0_61= 'SEPARATOR' | lv_keywordText_0_62= 'SERIAL' | lv_keywordText_0_63= 'SET' | lv_keywordText_0_64= 'SET_DEFAULT' | lv_keywordText_0_65= 'SET_NULL' | lv_keywordText_0_66= 'SQL' | lv_keywordText_0_67= 'STATIC' | lv_keywordText_0_68= 'TABLE' | lv_keywordText_0_69= 'THEN' | lv_keywordText_0_70= 'TIMESTAMP' | lv_keywordText_0_71= 'TITLE' | lv_keywordText_0_72= 'TRUE' | lv_keywordText_0_73= 'UK' | lv_keywordText_0_74= 'UNSIGNED' | lv_keywordText_0_75= 'UPDATE' | lv_keywordText_0_76= 'VALUETYPE' | lv_keywordText_0_77= 'WHEN' | lv_keywordText_0_78= 'WHERE' ) )
            {
            // InternalSqml.g:2406:3: ( (lv_keywordText_0_1= 'ACTION' | lv_keywordText_0_2= 'AND' | lv_keywordText_0_3= 'AS' | lv_keywordText_0_4= 'ASC' | lv_keywordText_0_5= 'BASE' | lv_keywordText_0_6= 'BETWEEN' | lv_keywordText_0_7= 'BITS' | lv_keywordText_0_8= 'BY' | lv_keywordText_0_9= 'CASCADE' | lv_keywordText_0_10= 'CASE' | lv_keywordText_0_11= 'CHARACTER' | lv_keywordText_0_12= 'COLLATION' | lv_keywordText_0_13= 'COMMENT' | lv_keywordText_0_14= 'CONSTRAINT_NAME' | lv_keywordText_0_15= 'DEFAULT' | lv_keywordText_0_16= 'DELETE' | lv_keywordText_0_17= 'DESC' | lv_keywordText_0_18= 'DISTINCT' | lv_keywordText_0_19= 'ELSE' | lv_keywordText_0_20= 'EMPTY' | lv_keywordText_0_21= 'END' | lv_keywordText_0_22= 'ENUM' | lv_keywordText_0_23= 'ESCAPE' | lv_keywordText_0_24= 'EXISTS' | lv_keywordText_0_25= 'FALSE' | lv_keywordText_0_26= 'FOR' | lv_keywordText_0_27= 'FROM' | lv_keywordText_0_28= 'FUNCTION' | lv_keywordText_0_29= 'GROUP' | lv_keywordText_0_30= 'GROUP_CONCAT' | lv_keywordText_0_31= 'HAVING' | lv_keywordText_0_32= 'IF' | lv_keywordText_0_33= 'IFNULL' | lv_keywordText_0_34= 'IK' | lv_keywordText_0_35= 'IMPORT' | lv_keywordText_0_36= 'IN' | lv_keywordText_0_37= 'IS' | lv_keywordText_0_38= 'JOIN' | lv_keywordText_0_39= 'LEFT' | lv_keywordText_0_40= 'LENGTHBITS' | lv_keywordText_0_41= 'LIKE' | lv_keywordText_0_42= 'MAXLENGTH' | lv_keywordText_0_43= 'NEXT' | lv_keywordText_0_44= 'NO_ACTION' | lv_keywordText_0_45= 'NOT' | lv_keywordText_0_46= 'NOW' | lv_keywordText_0_47= 'NULL' | lv_keywordText_0_48= 'NULLABLE' | lv_keywordText_0_49= 'ON' | lv_keywordText_0_50= 'OPTIONAL' | lv_keywordText_0_51= 'OR' | lv_keywordText_0_52= 'ORDER' | lv_keywordText_0_53= 'PACKAGE' | lv_keywordText_0_54= 'PK' | lv_keywordText_0_55= 'PRECISION' | lv_keywordText_0_56= 'QUERY' | lv_keywordText_0_57= 'REGEXP' | lv_keywordText_0_58= 'RESTRICT' | lv_keywordText_0_59= 'ROW' | lv_keywordText_0_60= 'SELECT' | lv_keywordText_0_61= 'SEPARATOR' | lv_keywordText_0_62= 'SERIAL' | lv_keywordText_0_63= 'SET' | lv_keywordText_0_64= 'SET_DEFAULT' | lv_keywordText_0_65= 'SET_NULL' | lv_keywordText_0_66= 'SQL' | lv_keywordText_0_67= 'STATIC' | lv_keywordText_0_68= 'TABLE' | lv_keywordText_0_69= 'THEN' | lv_keywordText_0_70= 'TIMESTAMP' | lv_keywordText_0_71= 'TITLE' | lv_keywordText_0_72= 'TRUE' | lv_keywordText_0_73= 'UK' | lv_keywordText_0_74= 'UNSIGNED' | lv_keywordText_0_75= 'UPDATE' | lv_keywordText_0_76= 'VALUETYPE' | lv_keywordText_0_77= 'WHEN' | lv_keywordText_0_78= 'WHERE' ) )
            // InternalSqml.g:2407:4: (lv_keywordText_0_1= 'ACTION' | lv_keywordText_0_2= 'AND' | lv_keywordText_0_3= 'AS' | lv_keywordText_0_4= 'ASC' | lv_keywordText_0_5= 'BASE' | lv_keywordText_0_6= 'BETWEEN' | lv_keywordText_0_7= 'BITS' | lv_keywordText_0_8= 'BY' | lv_keywordText_0_9= 'CASCADE' | lv_keywordText_0_10= 'CASE' | lv_keywordText_0_11= 'CHARACTER' | lv_keywordText_0_12= 'COLLATION' | lv_keywordText_0_13= 'COMMENT' | lv_keywordText_0_14= 'CONSTRAINT_NAME' | lv_keywordText_0_15= 'DEFAULT' | lv_keywordText_0_16= 'DELETE' | lv_keywordText_0_17= 'DESC' | lv_keywordText_0_18= 'DISTINCT' | lv_keywordText_0_19= 'ELSE' | lv_keywordText_0_20= 'EMPTY' | lv_keywordText_0_21= 'END' | lv_keywordText_0_22= 'ENUM' | lv_keywordText_0_23= 'ESCAPE' | lv_keywordText_0_24= 'EXISTS' | lv_keywordText_0_25= 'FALSE' | lv_keywordText_0_26= 'FOR' | lv_keywordText_0_27= 'FROM' | lv_keywordText_0_28= 'FUNCTION' | lv_keywordText_0_29= 'GROUP' | lv_keywordText_0_30= 'GROUP_CONCAT' | lv_keywordText_0_31= 'HAVING' | lv_keywordText_0_32= 'IF' | lv_keywordText_0_33= 'IFNULL' | lv_keywordText_0_34= 'IK' | lv_keywordText_0_35= 'IMPORT' | lv_keywordText_0_36= 'IN' | lv_keywordText_0_37= 'IS' | lv_keywordText_0_38= 'JOIN' | lv_keywordText_0_39= 'LEFT' | lv_keywordText_0_40= 'LENGTHBITS' | lv_keywordText_0_41= 'LIKE' | lv_keywordText_0_42= 'MAXLENGTH' | lv_keywordText_0_43= 'NEXT' | lv_keywordText_0_44= 'NO_ACTION' | lv_keywordText_0_45= 'NOT' | lv_keywordText_0_46= 'NOW' | lv_keywordText_0_47= 'NULL' | lv_keywordText_0_48= 'NULLABLE' | lv_keywordText_0_49= 'ON' | lv_keywordText_0_50= 'OPTIONAL' | lv_keywordText_0_51= 'OR' | lv_keywordText_0_52= 'ORDER' | lv_keywordText_0_53= 'PACKAGE' | lv_keywordText_0_54= 'PK' | lv_keywordText_0_55= 'PRECISION' | lv_keywordText_0_56= 'QUERY' | lv_keywordText_0_57= 'REGEXP' | lv_keywordText_0_58= 'RESTRICT' | lv_keywordText_0_59= 'ROW' | lv_keywordText_0_60= 'SELECT' | lv_keywordText_0_61= 'SEPARATOR' | lv_keywordText_0_62= 'SERIAL' | lv_keywordText_0_63= 'SET' | lv_keywordText_0_64= 'SET_DEFAULT' | lv_keywordText_0_65= 'SET_NULL' | lv_keywordText_0_66= 'SQL' | lv_keywordText_0_67= 'STATIC' | lv_keywordText_0_68= 'TABLE' | lv_keywordText_0_69= 'THEN' | lv_keywordText_0_70= 'TIMESTAMP' | lv_keywordText_0_71= 'TITLE' | lv_keywordText_0_72= 'TRUE' | lv_keywordText_0_73= 'UK' | lv_keywordText_0_74= 'UNSIGNED' | lv_keywordText_0_75= 'UPDATE' | lv_keywordText_0_76= 'VALUETYPE' | lv_keywordText_0_77= 'WHEN' | lv_keywordText_0_78= 'WHERE' )
            {
            // InternalSqml.g:2407:4: (lv_keywordText_0_1= 'ACTION' | lv_keywordText_0_2= 'AND' | lv_keywordText_0_3= 'AS' | lv_keywordText_0_4= 'ASC' | lv_keywordText_0_5= 'BASE' | lv_keywordText_0_6= 'BETWEEN' | lv_keywordText_0_7= 'BITS' | lv_keywordText_0_8= 'BY' | lv_keywordText_0_9= 'CASCADE' | lv_keywordText_0_10= 'CASE' | lv_keywordText_0_11= 'CHARACTER' | lv_keywordText_0_12= 'COLLATION' | lv_keywordText_0_13= 'COMMENT' | lv_keywordText_0_14= 'CONSTRAINT_NAME' | lv_keywordText_0_15= 'DEFAULT' | lv_keywordText_0_16= 'DELETE' | lv_keywordText_0_17= 'DESC' | lv_keywordText_0_18= 'DISTINCT' | lv_keywordText_0_19= 'ELSE' | lv_keywordText_0_20= 'EMPTY' | lv_keywordText_0_21= 'END' | lv_keywordText_0_22= 'ENUM' | lv_keywordText_0_23= 'ESCAPE' | lv_keywordText_0_24= 'EXISTS' | lv_keywordText_0_25= 'FALSE' | lv_keywordText_0_26= 'FOR' | lv_keywordText_0_27= 'FROM' | lv_keywordText_0_28= 'FUNCTION' | lv_keywordText_0_29= 'GROUP' | lv_keywordText_0_30= 'GROUP_CONCAT' | lv_keywordText_0_31= 'HAVING' | lv_keywordText_0_32= 'IF' | lv_keywordText_0_33= 'IFNULL' | lv_keywordText_0_34= 'IK' | lv_keywordText_0_35= 'IMPORT' | lv_keywordText_0_36= 'IN' | lv_keywordText_0_37= 'IS' | lv_keywordText_0_38= 'JOIN' | lv_keywordText_0_39= 'LEFT' | lv_keywordText_0_40= 'LENGTHBITS' | lv_keywordText_0_41= 'LIKE' | lv_keywordText_0_42= 'MAXLENGTH' | lv_keywordText_0_43= 'NEXT' | lv_keywordText_0_44= 'NO_ACTION' | lv_keywordText_0_45= 'NOT' | lv_keywordText_0_46= 'NOW' | lv_keywordText_0_47= 'NULL' | lv_keywordText_0_48= 'NULLABLE' | lv_keywordText_0_49= 'ON' | lv_keywordText_0_50= 'OPTIONAL' | lv_keywordText_0_51= 'OR' | lv_keywordText_0_52= 'ORDER' | lv_keywordText_0_53= 'PACKAGE' | lv_keywordText_0_54= 'PK' | lv_keywordText_0_55= 'PRECISION' | lv_keywordText_0_56= 'QUERY' | lv_keywordText_0_57= 'REGEXP' | lv_keywordText_0_58= 'RESTRICT' | lv_keywordText_0_59= 'ROW' | lv_keywordText_0_60= 'SELECT' | lv_keywordText_0_61= 'SEPARATOR' | lv_keywordText_0_62= 'SERIAL' | lv_keywordText_0_63= 'SET' | lv_keywordText_0_64= 'SET_DEFAULT' | lv_keywordText_0_65= 'SET_NULL' | lv_keywordText_0_66= 'SQL' | lv_keywordText_0_67= 'STATIC' | lv_keywordText_0_68= 'TABLE' | lv_keywordText_0_69= 'THEN' | lv_keywordText_0_70= 'TIMESTAMP' | lv_keywordText_0_71= 'TITLE' | lv_keywordText_0_72= 'TRUE' | lv_keywordText_0_73= 'UK' | lv_keywordText_0_74= 'UNSIGNED' | lv_keywordText_0_75= 'UPDATE' | lv_keywordText_0_76= 'VALUETYPE' | lv_keywordText_0_77= 'WHEN' | lv_keywordText_0_78= 'WHERE' )
            int alt36=78;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt36=1;
                }
                break;
            case 60:
                {
                alt36=2;
                }
                break;
            case 54:
                {
                alt36=3;
                }
                break;
            case 61:
                {
                alt36=4;
                }
                break;
            case 33:
                {
                alt36=5;
                }
                break;
            case 62:
                {
                alt36=6;
                }
                break;
            case 39:
                {
                alt36=7;
                }
                break;
            case 63:
                {
                alt36=8;
                }
                break;
            case 64:
                {
                alt36=9;
                }
                break;
            case 65:
                {
                alt36=10;
                }
                break;
            case 43:
                {
                alt36=11;
                }
                break;
            case 45:
                {
                alt36=12;
                }
                break;
            case 46:
                {
                alt36=13;
                }
                break;
            case 47:
                {
                alt36=14;
                }
                break;
            case 66:
                {
                alt36=15;
                }
                break;
            case 37:
                {
                alt36=16;
                }
                break;
            case 67:
                {
                alt36=17;
                }
                break;
            case 68:
                {
                alt36=18;
                }
                break;
            case 69:
                {
                alt36=19;
                }
                break;
            case 70:
                {
                alt36=20;
                }
                break;
            case 71:
                {
                alt36=21;
                }
                break;
            case 25:
                {
                alt36=22;
                }
                break;
            case 72:
                {
                alt36=23;
                }
                break;
            case 73:
                {
                alt36=24;
                }
                break;
            case 74:
                {
                alt36=25;
                }
                break;
            case 75:
                {
                alt36=26;
                }
                break;
            case 76:
                {
                alt36=27;
                }
                break;
            case 57:
                {
                alt36=28;
                }
                break;
            case 77:
                {
                alt36=29;
                }
                break;
            case 78:
                {
                alt36=30;
                }
                break;
            case 79:
                {
                alt36=31;
                }
                break;
            case 80:
                {
                alt36=32;
                }
                break;
            case 81:
                {
                alt36=33;
                }
                break;
            case 53:
                {
                alt36=34;
                }
                break;
            case 16:
                {
                alt36=35;
                }
                break;
            case 82:
                {
                alt36=36;
                }
                break;
            case 83:
                {
                alt36=37;
                }
                break;
            case 84:
                {
                alt36=38;
                }
                break;
            case 85:
                {
                alt36=39;
                }
                break;
            case 42:
                {
                alt36=40;
                }
                break;
            case 86:
                {
                alt36=41;
                }
                break;
            case 41:
                {
                alt36=42;
                }
                break;
            case 87:
                {
                alt36=43;
                }
                break;
            case 88:
                {
                alt36=44;
                }
                break;
            case 89:
                {
                alt36=45;
                }
                break;
            case 31:
                {
                alt36=46;
                }
                break;
            case 30:
                {
                alt36=47;
                }
                break;
            case 34:
                {
                alt36=48;
                }
                break;
            case 26:
                {
                alt36=49;
                }
                break;
            case 56:
                {
                alt36=50;
                }
                break;
            case 90:
                {
                alt36=51;
                }
                break;
            case 91:
                {
                alt36=52;
                }
                break;
            case 15:
                {
                alt36=53;
                }
                break;
            case 29:
                {
                alt36=54;
                }
                break;
            case 40:
                {
                alt36=55;
                }
                break;
            case 55:
                {
                alt36=56;
                }
                break;
            case 92:
                {
                alt36=57;
                }
                break;
            case 93:
                {
                alt36=58;
                }
                break;
            case 48:
                {
                alt36=59;
                }
                break;
            case 94:
                {
                alt36=60;
                }
                break;
            case 95:
                {
                alt36=61;
                }
                break;
            case 32:
                {
                alt36=62;
                }
                break;
            case 44:
                {
                alt36=63;
                }
                break;
            case 96:
                {
                alt36=64;
                }
                break;
            case 97:
                {
                alt36=65;
                }
                break;
            case 58:
                {
                alt36=66;
                }
                break;
            case 98:
                {
                alt36=67;
                }
                break;
            case 28:
                {
                alt36=68;
                }
                break;
            case 99:
                {
                alt36=69;
                }
                break;
            case 35:
                {
                alt36=70;
                }
                break;
            case 100:
                {
                alt36=71;
                }
                break;
            case 101:
                {
                alt36=72;
                }
                break;
            case 52:
                {
                alt36=73;
                }
                break;
            case 36:
                {
                alt36=74;
                }
                break;
            case 38:
                {
                alt36=75;
                }
                break;
            case 22:
                {
                alt36=76;
                }
                break;
            case 102:
                {
                alt36=77;
                }
                break;
            case 103:
                {
                alt36=78;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalSqml.g:2408:5: lv_keywordText_0_1= 'ACTION'
                    {
                    lv_keywordText_0_1=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_1, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextACTIONKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalSqml.g:2419:5: lv_keywordText_0_2= 'AND'
                    {
                    lv_keywordText_0_2=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_2, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextANDKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalSqml.g:2430:5: lv_keywordText_0_3= 'AS'
                    {
                    lv_keywordText_0_3=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_3, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextASKeyword_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_3, null);
                      				
                    }

                    }
                    break;
                case 4 :
                    // InternalSqml.g:2441:5: lv_keywordText_0_4= 'ASC'
                    {
                    lv_keywordText_0_4=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_4, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextASCKeyword_0_3());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_4, null);
                      				
                    }

                    }
                    break;
                case 5 :
                    // InternalSqml.g:2452:5: lv_keywordText_0_5= 'BASE'
                    {
                    lv_keywordText_0_5=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_5, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextBASEKeyword_0_4());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_5, null);
                      				
                    }

                    }
                    break;
                case 6 :
                    // InternalSqml.g:2463:5: lv_keywordText_0_6= 'BETWEEN'
                    {
                    lv_keywordText_0_6=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_6, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextBETWEENKeyword_0_5());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_6, null);
                      				
                    }

                    }
                    break;
                case 7 :
                    // InternalSqml.g:2474:5: lv_keywordText_0_7= 'BITS'
                    {
                    lv_keywordText_0_7=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_7, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextBITSKeyword_0_6());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_7, null);
                      				
                    }

                    }
                    break;
                case 8 :
                    // InternalSqml.g:2485:5: lv_keywordText_0_8= 'BY'
                    {
                    lv_keywordText_0_8=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_8, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextBYKeyword_0_7());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_8, null);
                      				
                    }

                    }
                    break;
                case 9 :
                    // InternalSqml.g:2496:5: lv_keywordText_0_9= 'CASCADE'
                    {
                    lv_keywordText_0_9=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_9, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextCASCADEKeyword_0_8());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_9, null);
                      				
                    }

                    }
                    break;
                case 10 :
                    // InternalSqml.g:2507:5: lv_keywordText_0_10= 'CASE'
                    {
                    lv_keywordText_0_10=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_10, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextCASEKeyword_0_9());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_10, null);
                      				
                    }

                    }
                    break;
                case 11 :
                    // InternalSqml.g:2518:5: lv_keywordText_0_11= 'CHARACTER'
                    {
                    lv_keywordText_0_11=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_11, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextCHARACTERKeyword_0_10());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_11, null);
                      				
                    }

                    }
                    break;
                case 12 :
                    // InternalSqml.g:2529:5: lv_keywordText_0_12= 'COLLATION'
                    {
                    lv_keywordText_0_12=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_12, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextCOLLATIONKeyword_0_11());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_12, null);
                      				
                    }

                    }
                    break;
                case 13 :
                    // InternalSqml.g:2540:5: lv_keywordText_0_13= 'COMMENT'
                    {
                    lv_keywordText_0_13=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_13, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextCOMMENTKeyword_0_12());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_13, null);
                      				
                    }

                    }
                    break;
                case 14 :
                    // InternalSqml.g:2551:5: lv_keywordText_0_14= 'CONSTRAINT_NAME'
                    {
                    lv_keywordText_0_14=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_14, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextCONSTRAINT_NAMEKeyword_0_13());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_14, null);
                      				
                    }

                    }
                    break;
                case 15 :
                    // InternalSqml.g:2562:5: lv_keywordText_0_15= 'DEFAULT'
                    {
                    lv_keywordText_0_15=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_15, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextDEFAULTKeyword_0_14());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_15, null);
                      				
                    }

                    }
                    break;
                case 16 :
                    // InternalSqml.g:2573:5: lv_keywordText_0_16= 'DELETE'
                    {
                    lv_keywordText_0_16=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_16, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextDELETEKeyword_0_15());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_16, null);
                      				
                    }

                    }
                    break;
                case 17 :
                    // InternalSqml.g:2584:5: lv_keywordText_0_17= 'DESC'
                    {
                    lv_keywordText_0_17=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_17, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextDESCKeyword_0_16());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_17, null);
                      				
                    }

                    }
                    break;
                case 18 :
                    // InternalSqml.g:2595:5: lv_keywordText_0_18= 'DISTINCT'
                    {
                    lv_keywordText_0_18=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_18, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextDISTINCTKeyword_0_17());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_18, null);
                      				
                    }

                    }
                    break;
                case 19 :
                    // InternalSqml.g:2606:5: lv_keywordText_0_19= 'ELSE'
                    {
                    lv_keywordText_0_19=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_19, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextELSEKeyword_0_18());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_19, null);
                      				
                    }

                    }
                    break;
                case 20 :
                    // InternalSqml.g:2617:5: lv_keywordText_0_20= 'EMPTY'
                    {
                    lv_keywordText_0_20=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_20, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextEMPTYKeyword_0_19());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_20, null);
                      				
                    }

                    }
                    break;
                case 21 :
                    // InternalSqml.g:2628:5: lv_keywordText_0_21= 'END'
                    {
                    lv_keywordText_0_21=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_21, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextENDKeyword_0_20());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_21, null);
                      				
                    }

                    }
                    break;
                case 22 :
                    // InternalSqml.g:2639:5: lv_keywordText_0_22= 'ENUM'
                    {
                    lv_keywordText_0_22=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_22, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextENUMKeyword_0_21());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_22, null);
                      				
                    }

                    }
                    break;
                case 23 :
                    // InternalSqml.g:2650:5: lv_keywordText_0_23= 'ESCAPE'
                    {
                    lv_keywordText_0_23=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_23, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextESCAPEKeyword_0_22());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_23, null);
                      				
                    }

                    }
                    break;
                case 24 :
                    // InternalSqml.g:2661:5: lv_keywordText_0_24= 'EXISTS'
                    {
                    lv_keywordText_0_24=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_24, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextEXISTSKeyword_0_23());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_24, null);
                      				
                    }

                    }
                    break;
                case 25 :
                    // InternalSqml.g:2672:5: lv_keywordText_0_25= 'FALSE'
                    {
                    lv_keywordText_0_25=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_25, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextFALSEKeyword_0_24());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_25, null);
                      				
                    }

                    }
                    break;
                case 26 :
                    // InternalSqml.g:2683:5: lv_keywordText_0_26= 'FOR'
                    {
                    lv_keywordText_0_26=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_26, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextFORKeyword_0_25());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_26, null);
                      				
                    }

                    }
                    break;
                case 27 :
                    // InternalSqml.g:2694:5: lv_keywordText_0_27= 'FROM'
                    {
                    lv_keywordText_0_27=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_27, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextFROMKeyword_0_26());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_27, null);
                      				
                    }

                    }
                    break;
                case 28 :
                    // InternalSqml.g:2705:5: lv_keywordText_0_28= 'FUNCTION'
                    {
                    lv_keywordText_0_28=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_28, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextFUNCTIONKeyword_0_27());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_28, null);
                      				
                    }

                    }
                    break;
                case 29 :
                    // InternalSqml.g:2716:5: lv_keywordText_0_29= 'GROUP'
                    {
                    lv_keywordText_0_29=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_29, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextGROUPKeyword_0_28());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_29, null);
                      				
                    }

                    }
                    break;
                case 30 :
                    // InternalSqml.g:2727:5: lv_keywordText_0_30= 'GROUP_CONCAT'
                    {
                    lv_keywordText_0_30=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_30, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextGROUP_CONCATKeyword_0_29());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_30, null);
                      				
                    }

                    }
                    break;
                case 31 :
                    // InternalSqml.g:2738:5: lv_keywordText_0_31= 'HAVING'
                    {
                    lv_keywordText_0_31=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_31, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextHAVINGKeyword_0_30());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_31, null);
                      				
                    }

                    }
                    break;
                case 32 :
                    // InternalSqml.g:2749:5: lv_keywordText_0_32= 'IF'
                    {
                    lv_keywordText_0_32=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_32, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextIFKeyword_0_31());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_32, null);
                      				
                    }

                    }
                    break;
                case 33 :
                    // InternalSqml.g:2760:5: lv_keywordText_0_33= 'IFNULL'
                    {
                    lv_keywordText_0_33=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_33, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextIFNULLKeyword_0_32());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_33, null);
                      				
                    }

                    }
                    break;
                case 34 :
                    // InternalSqml.g:2771:5: lv_keywordText_0_34= 'IK'
                    {
                    lv_keywordText_0_34=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_34, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextIKKeyword_0_33());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_34, null);
                      				
                    }

                    }
                    break;
                case 35 :
                    // InternalSqml.g:2782:5: lv_keywordText_0_35= 'IMPORT'
                    {
                    lv_keywordText_0_35=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_35, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextIMPORTKeyword_0_34());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_35, null);
                      				
                    }

                    }
                    break;
                case 36 :
                    // InternalSqml.g:2793:5: lv_keywordText_0_36= 'IN'
                    {
                    lv_keywordText_0_36=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_36, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextINKeyword_0_35());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_36, null);
                      				
                    }

                    }
                    break;
                case 37 :
                    // InternalSqml.g:2804:5: lv_keywordText_0_37= 'IS'
                    {
                    lv_keywordText_0_37=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_37, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextISKeyword_0_36());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_37, null);
                      				
                    }

                    }
                    break;
                case 38 :
                    // InternalSqml.g:2815:5: lv_keywordText_0_38= 'JOIN'
                    {
                    lv_keywordText_0_38=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_38, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextJOINKeyword_0_37());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_38, null);
                      				
                    }

                    }
                    break;
                case 39 :
                    // InternalSqml.g:2826:5: lv_keywordText_0_39= 'LEFT'
                    {
                    lv_keywordText_0_39=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_39, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextLEFTKeyword_0_38());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_39, null);
                      				
                    }

                    }
                    break;
                case 40 :
                    // InternalSqml.g:2837:5: lv_keywordText_0_40= 'LENGTHBITS'
                    {
                    lv_keywordText_0_40=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_40, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextLENGTHBITSKeyword_0_39());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_40, null);
                      				
                    }

                    }
                    break;
                case 41 :
                    // InternalSqml.g:2848:5: lv_keywordText_0_41= 'LIKE'
                    {
                    lv_keywordText_0_41=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_41, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextLIKEKeyword_0_40());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_41, null);
                      				
                    }

                    }
                    break;
                case 42 :
                    // InternalSqml.g:2859:5: lv_keywordText_0_42= 'MAXLENGTH'
                    {
                    lv_keywordText_0_42=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_42, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextMAXLENGTHKeyword_0_41());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_42, null);
                      				
                    }

                    }
                    break;
                case 43 :
                    // InternalSqml.g:2870:5: lv_keywordText_0_43= 'NEXT'
                    {
                    lv_keywordText_0_43=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_43, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextNEXTKeyword_0_42());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_43, null);
                      				
                    }

                    }
                    break;
                case 44 :
                    // InternalSqml.g:2881:5: lv_keywordText_0_44= 'NO_ACTION'
                    {
                    lv_keywordText_0_44=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_44, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextNO_ACTIONKeyword_0_43());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_44, null);
                      				
                    }

                    }
                    break;
                case 45 :
                    // InternalSqml.g:2892:5: lv_keywordText_0_45= 'NOT'
                    {
                    lv_keywordText_0_45=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_45, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextNOTKeyword_0_44());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_45, null);
                      				
                    }

                    }
                    break;
                case 46 :
                    // InternalSqml.g:2903:5: lv_keywordText_0_46= 'NOW'
                    {
                    lv_keywordText_0_46=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_46, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextNOWKeyword_0_45());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_46, null);
                      				
                    }

                    }
                    break;
                case 47 :
                    // InternalSqml.g:2914:5: lv_keywordText_0_47= 'NULL'
                    {
                    lv_keywordText_0_47=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_47, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextNULLKeyword_0_46());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_47, null);
                      				
                    }

                    }
                    break;
                case 48 :
                    // InternalSqml.g:2925:5: lv_keywordText_0_48= 'NULLABLE'
                    {
                    lv_keywordText_0_48=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_48, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextNULLABLEKeyword_0_47());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_48, null);
                      				
                    }

                    }
                    break;
                case 49 :
                    // InternalSqml.g:2936:5: lv_keywordText_0_49= 'ON'
                    {
                    lv_keywordText_0_49=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_49, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextONKeyword_0_48());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_49, null);
                      				
                    }

                    }
                    break;
                case 50 :
                    // InternalSqml.g:2947:5: lv_keywordText_0_50= 'OPTIONAL'
                    {
                    lv_keywordText_0_50=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_50, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextOPTIONALKeyword_0_49());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_50, null);
                      				
                    }

                    }
                    break;
                case 51 :
                    // InternalSqml.g:2958:5: lv_keywordText_0_51= 'OR'
                    {
                    lv_keywordText_0_51=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_51, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextORKeyword_0_50());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_51, null);
                      				
                    }

                    }
                    break;
                case 52 :
                    // InternalSqml.g:2969:5: lv_keywordText_0_52= 'ORDER'
                    {
                    lv_keywordText_0_52=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_52, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextORDERKeyword_0_51());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_52, null);
                      				
                    }

                    }
                    break;
                case 53 :
                    // InternalSqml.g:2980:5: lv_keywordText_0_53= 'PACKAGE'
                    {
                    lv_keywordText_0_53=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_53, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextPACKAGEKeyword_0_52());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_53, null);
                      				
                    }

                    }
                    break;
                case 54 :
                    // InternalSqml.g:2991:5: lv_keywordText_0_54= 'PK'
                    {
                    lv_keywordText_0_54=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_54, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextPKKeyword_0_53());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_54, null);
                      				
                    }

                    }
                    break;
                case 55 :
                    // InternalSqml.g:3002:5: lv_keywordText_0_55= 'PRECISION'
                    {
                    lv_keywordText_0_55=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_55, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextPRECISIONKeyword_0_54());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_55, null);
                      				
                    }

                    }
                    break;
                case 56 :
                    // InternalSqml.g:3013:5: lv_keywordText_0_56= 'QUERY'
                    {
                    lv_keywordText_0_56=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_56, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextQUERYKeyword_0_55());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_56, null);
                      				
                    }

                    }
                    break;
                case 57 :
                    // InternalSqml.g:3024:5: lv_keywordText_0_57= 'REGEXP'
                    {
                    lv_keywordText_0_57=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_57, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextREGEXPKeyword_0_56());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_57, null);
                      				
                    }

                    }
                    break;
                case 58 :
                    // InternalSqml.g:3035:5: lv_keywordText_0_58= 'RESTRICT'
                    {
                    lv_keywordText_0_58=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_58, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextRESTRICTKeyword_0_57());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_58, null);
                      				
                    }

                    }
                    break;
                case 59 :
                    // InternalSqml.g:3046:5: lv_keywordText_0_59= 'ROW'
                    {
                    lv_keywordText_0_59=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_59, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextROWKeyword_0_58());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_59, null);
                      				
                    }

                    }
                    break;
                case 60 :
                    // InternalSqml.g:3057:5: lv_keywordText_0_60= 'SELECT'
                    {
                    lv_keywordText_0_60=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_60, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextSELECTKeyword_0_59());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_60, null);
                      				
                    }

                    }
                    break;
                case 61 :
                    // InternalSqml.g:3068:5: lv_keywordText_0_61= 'SEPARATOR'
                    {
                    lv_keywordText_0_61=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_61, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextSEPARATORKeyword_0_60());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_61, null);
                      				
                    }

                    }
                    break;
                case 62 :
                    // InternalSqml.g:3079:5: lv_keywordText_0_62= 'SERIAL'
                    {
                    lv_keywordText_0_62=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_62, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextSERIALKeyword_0_61());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_62, null);
                      				
                    }

                    }
                    break;
                case 63 :
                    // InternalSqml.g:3090:5: lv_keywordText_0_63= 'SET'
                    {
                    lv_keywordText_0_63=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_63, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextSETKeyword_0_62());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_63, null);
                      				
                    }

                    }
                    break;
                case 64 :
                    // InternalSqml.g:3101:5: lv_keywordText_0_64= 'SET_DEFAULT'
                    {
                    lv_keywordText_0_64=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_64, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextSET_DEFAULTKeyword_0_63());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_64, null);
                      				
                    }

                    }
                    break;
                case 65 :
                    // InternalSqml.g:3112:5: lv_keywordText_0_65= 'SET_NULL'
                    {
                    lv_keywordText_0_65=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_65, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextSET_NULLKeyword_0_64());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_65, null);
                      				
                    }

                    }
                    break;
                case 66 :
                    // InternalSqml.g:3123:5: lv_keywordText_0_66= 'SQL'
                    {
                    lv_keywordText_0_66=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_66, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextSQLKeyword_0_65());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_66, null);
                      				
                    }

                    }
                    break;
                case 67 :
                    // InternalSqml.g:3134:5: lv_keywordText_0_67= 'STATIC'
                    {
                    lv_keywordText_0_67=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_67, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextSTATICKeyword_0_66());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_67, null);
                      				
                    }

                    }
                    break;
                case 68 :
                    // InternalSqml.g:3145:5: lv_keywordText_0_68= 'TABLE'
                    {
                    lv_keywordText_0_68=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_68, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextTABLEKeyword_0_67());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_68, null);
                      				
                    }

                    }
                    break;
                case 69 :
                    // InternalSqml.g:3156:5: lv_keywordText_0_69= 'THEN'
                    {
                    lv_keywordText_0_69=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_69, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextTHENKeyword_0_68());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_69, null);
                      				
                    }

                    }
                    break;
                case 70 :
                    // InternalSqml.g:3167:5: lv_keywordText_0_70= 'TIMESTAMP'
                    {
                    lv_keywordText_0_70=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_70, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextTIMESTAMPKeyword_0_69());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_70, null);
                      				
                    }

                    }
                    break;
                case 71 :
                    // InternalSqml.g:3178:5: lv_keywordText_0_71= 'TITLE'
                    {
                    lv_keywordText_0_71=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_71, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextTITLEKeyword_0_70());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_71, null);
                      				
                    }

                    }
                    break;
                case 72 :
                    // InternalSqml.g:3189:5: lv_keywordText_0_72= 'TRUE'
                    {
                    lv_keywordText_0_72=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_72, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextTRUEKeyword_0_71());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_72, null);
                      				
                    }

                    }
                    break;
                case 73 :
                    // InternalSqml.g:3200:5: lv_keywordText_0_73= 'UK'
                    {
                    lv_keywordText_0_73=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_73, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextUKKeyword_0_72());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_73, null);
                      				
                    }

                    }
                    break;
                case 74 :
                    // InternalSqml.g:3211:5: lv_keywordText_0_74= 'UNSIGNED'
                    {
                    lv_keywordText_0_74=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_74, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextUNSIGNEDKeyword_0_73());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_74, null);
                      				
                    }

                    }
                    break;
                case 75 :
                    // InternalSqml.g:3222:5: lv_keywordText_0_75= 'UPDATE'
                    {
                    lv_keywordText_0_75=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_75, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextUPDATEKeyword_0_74());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_75, null);
                      				
                    }

                    }
                    break;
                case 76 :
                    // InternalSqml.g:3233:5: lv_keywordText_0_76= 'VALUETYPE'
                    {
                    lv_keywordText_0_76=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_76, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextVALUETYPEKeyword_0_75());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_76, null);
                      				
                    }

                    }
                    break;
                case 77 :
                    // InternalSqml.g:3244:5: lv_keywordText_0_77= 'WHEN'
                    {
                    lv_keywordText_0_77=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_77, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextWHENKeyword_0_76());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_77, null);
                      				
                    }

                    }
                    break;
                case 78 :
                    // InternalSqml.g:3255:5: lv_keywordText_0_78= 'WHERE'
                    {
                    lv_keywordText_0_78=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_keywordText_0_78, grammarAccess.getSqmlSqlKeywordAccess().getKeywordTextWHEREKeyword_0_77());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlKeywordRule());
                      					}
                      					setWithLastConsumed(current, "keywordText", lv_keywordText_0_78, null);
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlSqlKeyword"


    // $ANTLR start "entryRuleSqmlSqlId"
    // InternalSqml.g:3271:1: entryRuleSqmlSqlId returns [EObject current=null] : iv_ruleSqmlSqlId= ruleSqmlSqlId EOF ;
    public final EObject entryRuleSqmlSqlId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlSqlId = null;


        try {
            // InternalSqml.g:3271:50: (iv_ruleSqmlSqlId= ruleSqmlSqlId EOF )
            // InternalSqml.g:3272:2: iv_ruleSqmlSqlId= ruleSqmlSqlId EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlSqlIdRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlSqlId=ruleSqmlSqlId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlSqlId; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlSqlId"


    // $ANTLR start "ruleSqmlSqlId"
    // InternalSqml.g:3278:1: ruleSqmlSqlId returns [EObject current=null] : ( (lv_identifier_0_0= RULE_ID ) ) ;
    public final EObject ruleSqmlSqlId() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;


        	enterRule();

        try {
            // InternalSqml.g:3284:2: ( ( (lv_identifier_0_0= RULE_ID ) ) )
            // InternalSqml.g:3285:2: ( (lv_identifier_0_0= RULE_ID ) )
            {
            // InternalSqml.g:3285:2: ( (lv_identifier_0_0= RULE_ID ) )
            // InternalSqml.g:3286:3: (lv_identifier_0_0= RULE_ID )
            {
            // InternalSqml.g:3286:3: (lv_identifier_0_0= RULE_ID )
            // InternalSqml.g:3287:4: lv_identifier_0_0= RULE_ID
            {
            lv_identifier_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_identifier_0_0, grammarAccess.getSqmlSqlIdAccess().getIdentifierIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSqmlSqlIdRule());
              				}
              				setWithLastConsumed(
              					current,
              					"identifier",
              					lv_identifier_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlSqlId"


    // $ANTLR start "entryRuleSqmlSqlSymbol"
    // InternalSqml.g:3306:1: entryRuleSqmlSqlSymbol returns [EObject current=null] : iv_ruleSqmlSqlSymbol= ruleSqmlSqlSymbol EOF ;
    public final EObject entryRuleSqmlSqlSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlSqlSymbol = null;


        try {
            // InternalSqml.g:3306:54: (iv_ruleSqmlSqlSymbol= ruleSqmlSqlSymbol EOF )
            // InternalSqml.g:3307:2: iv_ruleSqmlSqlSymbol= ruleSqmlSqlSymbol EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlSqlSymbolRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlSqlSymbol=ruleSqmlSqlSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlSqlSymbol; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlSqlSymbol"


    // $ANTLR start "ruleSqmlSqlSymbol"
    // InternalSqml.g:3313:1: ruleSqmlSqlSymbol returns [EObject current=null] : ( ( (lv_symbolText_0_1= '+' | lv_symbolText_0_2= '-' | lv_symbolText_0_3= '*' | lv_symbolText_0_4= '/' | lv_symbolText_0_5= '%' | lv_symbolText_0_6= '|' | lv_symbolText_0_7= '&' | lv_symbolText_0_8= '^' | lv_symbolText_0_9= '~' | lv_symbolText_0_10= '(' | lv_symbolText_0_11= ')' | lv_symbolText_0_12= '.' | lv_symbolText_0_13= ',' | lv_symbolText_0_14= '=' | lv_symbolText_0_15= '<>' | lv_symbolText_0_16= '!=' | lv_symbolText_0_17= '<' | lv_symbolText_0_18= '<=' | lv_symbolText_0_19= '>' | lv_symbolText_0_20= '>=' ) ) ) ;
    public final EObject ruleSqmlSqlSymbol() throws RecognitionException {
        EObject current = null;

        Token lv_symbolText_0_1=null;
        Token lv_symbolText_0_2=null;
        Token lv_symbolText_0_3=null;
        Token lv_symbolText_0_4=null;
        Token lv_symbolText_0_5=null;
        Token lv_symbolText_0_6=null;
        Token lv_symbolText_0_7=null;
        Token lv_symbolText_0_8=null;
        Token lv_symbolText_0_9=null;
        Token lv_symbolText_0_10=null;
        Token lv_symbolText_0_11=null;
        Token lv_symbolText_0_12=null;
        Token lv_symbolText_0_13=null;
        Token lv_symbolText_0_14=null;
        Token lv_symbolText_0_15=null;
        Token lv_symbolText_0_16=null;
        Token lv_symbolText_0_17=null;
        Token lv_symbolText_0_18=null;
        Token lv_symbolText_0_19=null;
        Token lv_symbolText_0_20=null;


        	enterRule();

        try {
            // InternalSqml.g:3319:2: ( ( ( (lv_symbolText_0_1= '+' | lv_symbolText_0_2= '-' | lv_symbolText_0_3= '*' | lv_symbolText_0_4= '/' | lv_symbolText_0_5= '%' | lv_symbolText_0_6= '|' | lv_symbolText_0_7= '&' | lv_symbolText_0_8= '^' | lv_symbolText_0_9= '~' | lv_symbolText_0_10= '(' | lv_symbolText_0_11= ')' | lv_symbolText_0_12= '.' | lv_symbolText_0_13= ',' | lv_symbolText_0_14= '=' | lv_symbolText_0_15= '<>' | lv_symbolText_0_16= '!=' | lv_symbolText_0_17= '<' | lv_symbolText_0_18= '<=' | lv_symbolText_0_19= '>' | lv_symbolText_0_20= '>=' ) ) ) )
            // InternalSqml.g:3320:2: ( ( (lv_symbolText_0_1= '+' | lv_symbolText_0_2= '-' | lv_symbolText_0_3= '*' | lv_symbolText_0_4= '/' | lv_symbolText_0_5= '%' | lv_symbolText_0_6= '|' | lv_symbolText_0_7= '&' | lv_symbolText_0_8= '^' | lv_symbolText_0_9= '~' | lv_symbolText_0_10= '(' | lv_symbolText_0_11= ')' | lv_symbolText_0_12= '.' | lv_symbolText_0_13= ',' | lv_symbolText_0_14= '=' | lv_symbolText_0_15= '<>' | lv_symbolText_0_16= '!=' | lv_symbolText_0_17= '<' | lv_symbolText_0_18= '<=' | lv_symbolText_0_19= '>' | lv_symbolText_0_20= '>=' ) ) )
            {
            // InternalSqml.g:3320:2: ( ( (lv_symbolText_0_1= '+' | lv_symbolText_0_2= '-' | lv_symbolText_0_3= '*' | lv_symbolText_0_4= '/' | lv_symbolText_0_5= '%' | lv_symbolText_0_6= '|' | lv_symbolText_0_7= '&' | lv_symbolText_0_8= '^' | lv_symbolText_0_9= '~' | lv_symbolText_0_10= '(' | lv_symbolText_0_11= ')' | lv_symbolText_0_12= '.' | lv_symbolText_0_13= ',' | lv_symbolText_0_14= '=' | lv_symbolText_0_15= '<>' | lv_symbolText_0_16= '!=' | lv_symbolText_0_17= '<' | lv_symbolText_0_18= '<=' | lv_symbolText_0_19= '>' | lv_symbolText_0_20= '>=' ) ) )
            // InternalSqml.g:3321:3: ( (lv_symbolText_0_1= '+' | lv_symbolText_0_2= '-' | lv_symbolText_0_3= '*' | lv_symbolText_0_4= '/' | lv_symbolText_0_5= '%' | lv_symbolText_0_6= '|' | lv_symbolText_0_7= '&' | lv_symbolText_0_8= '^' | lv_symbolText_0_9= '~' | lv_symbolText_0_10= '(' | lv_symbolText_0_11= ')' | lv_symbolText_0_12= '.' | lv_symbolText_0_13= ',' | lv_symbolText_0_14= '=' | lv_symbolText_0_15= '<>' | lv_symbolText_0_16= '!=' | lv_symbolText_0_17= '<' | lv_symbolText_0_18= '<=' | lv_symbolText_0_19= '>' | lv_symbolText_0_20= '>=' ) )
            {
            // InternalSqml.g:3321:3: ( (lv_symbolText_0_1= '+' | lv_symbolText_0_2= '-' | lv_symbolText_0_3= '*' | lv_symbolText_0_4= '/' | lv_symbolText_0_5= '%' | lv_symbolText_0_6= '|' | lv_symbolText_0_7= '&' | lv_symbolText_0_8= '^' | lv_symbolText_0_9= '~' | lv_symbolText_0_10= '(' | lv_symbolText_0_11= ')' | lv_symbolText_0_12= '.' | lv_symbolText_0_13= ',' | lv_symbolText_0_14= '=' | lv_symbolText_0_15= '<>' | lv_symbolText_0_16= '!=' | lv_symbolText_0_17= '<' | lv_symbolText_0_18= '<=' | lv_symbolText_0_19= '>' | lv_symbolText_0_20= '>=' ) )
            // InternalSqml.g:3322:4: (lv_symbolText_0_1= '+' | lv_symbolText_0_2= '-' | lv_symbolText_0_3= '*' | lv_symbolText_0_4= '/' | lv_symbolText_0_5= '%' | lv_symbolText_0_6= '|' | lv_symbolText_0_7= '&' | lv_symbolText_0_8= '^' | lv_symbolText_0_9= '~' | lv_symbolText_0_10= '(' | lv_symbolText_0_11= ')' | lv_symbolText_0_12= '.' | lv_symbolText_0_13= ',' | lv_symbolText_0_14= '=' | lv_symbolText_0_15= '<>' | lv_symbolText_0_16= '!=' | lv_symbolText_0_17= '<' | lv_symbolText_0_18= '<=' | lv_symbolText_0_19= '>' | lv_symbolText_0_20= '>=' )
            {
            // InternalSqml.g:3322:4: (lv_symbolText_0_1= '+' | lv_symbolText_0_2= '-' | lv_symbolText_0_3= '*' | lv_symbolText_0_4= '/' | lv_symbolText_0_5= '%' | lv_symbolText_0_6= '|' | lv_symbolText_0_7= '&' | lv_symbolText_0_8= '^' | lv_symbolText_0_9= '~' | lv_symbolText_0_10= '(' | lv_symbolText_0_11= ')' | lv_symbolText_0_12= '.' | lv_symbolText_0_13= ',' | lv_symbolText_0_14= '=' | lv_symbolText_0_15= '<>' | lv_symbolText_0_16= '!=' | lv_symbolText_0_17= '<' | lv_symbolText_0_18= '<=' | lv_symbolText_0_19= '>' | lv_symbolText_0_20= '>=' )
            int alt37=20;
            switch ( input.LA(1) ) {
            case 104:
                {
                alt37=1;
                }
                break;
            case 51:
                {
                alt37=2;
                }
                break;
            case 105:
                {
                alt37=3;
                }
                break;
            case 106:
                {
                alt37=4;
                }
                break;
            case 107:
                {
                alt37=5;
                }
                break;
            case 108:
                {
                alt37=6;
                }
                break;
            case 109:
                {
                alt37=7;
                }
                break;
            case 110:
                {
                alt37=8;
                }
                break;
            case 111:
                {
                alt37=9;
                }
                break;
            case 49:
                {
                alt37=10;
                }
                break;
            case 50:
                {
                alt37=11;
                }
                break;
            case 112:
                {
                alt37=12;
                }
                break;
            case 18:
                {
                alt37=13;
                }
                break;
            case 27:
                {
                alt37=14;
                }
                break;
            case 113:
                {
                alt37=15;
                }
                break;
            case 114:
                {
                alt37=16;
                }
                break;
            case 17:
                {
                alt37=17;
                }
                break;
            case 115:
                {
                alt37=18;
                }
                break;
            case 19:
                {
                alt37=19;
                }
                break;
            case 116:
                {
                alt37=20;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalSqml.g:3323:5: lv_symbolText_0_1= '+'
                    {
                    lv_symbolText_0_1=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbolText_0_1, grammarAccess.getSqmlSqlSymbolAccess().getSymbolTextPlusSignKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlSymbolRule());
                      					}
                      					setWithLastConsumed(current, "symbolText", lv_symbolText_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalSqml.g:3334:5: lv_symbolText_0_2= '-'
                    {
                    lv_symbolText_0_2=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbolText_0_2, grammarAccess.getSqmlSqlSymbolAccess().getSymbolTextHyphenMinusKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlSymbolRule());
                      					}
                      					setWithLastConsumed(current, "symbolText", lv_symbolText_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalSqml.g:3345:5: lv_symbolText_0_3= '*'
                    {
                    lv_symbolText_0_3=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbolText_0_3, grammarAccess.getSqmlSqlSymbolAccess().getSymbolTextAsteriskKeyword_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlSymbolRule());
                      					}
                      					setWithLastConsumed(current, "symbolText", lv_symbolText_0_3, null);
                      				
                    }

                    }
                    break;
                case 4 :
                    // InternalSqml.g:3356:5: lv_symbolText_0_4= '/'
                    {
                    lv_symbolText_0_4=(Token)match(input,106,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbolText_0_4, grammarAccess.getSqmlSqlSymbolAccess().getSymbolTextSolidusKeyword_0_3());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlSymbolRule());
                      					}
                      					setWithLastConsumed(current, "symbolText", lv_symbolText_0_4, null);
                      				
                    }

                    }
                    break;
                case 5 :
                    // InternalSqml.g:3367:5: lv_symbolText_0_5= '%'
                    {
                    lv_symbolText_0_5=(Token)match(input,107,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbolText_0_5, grammarAccess.getSqmlSqlSymbolAccess().getSymbolTextPercentSignKeyword_0_4());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlSymbolRule());
                      					}
                      					setWithLastConsumed(current, "symbolText", lv_symbolText_0_5, null);
                      				
                    }

                    }
                    break;
                case 6 :
                    // InternalSqml.g:3378:5: lv_symbolText_0_6= '|'
                    {
                    lv_symbolText_0_6=(Token)match(input,108,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbolText_0_6, grammarAccess.getSqmlSqlSymbolAccess().getSymbolTextVerticalLineKeyword_0_5());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlSymbolRule());
                      					}
                      					setWithLastConsumed(current, "symbolText", lv_symbolText_0_6, null);
                      				
                    }

                    }
                    break;
                case 7 :
                    // InternalSqml.g:3389:5: lv_symbolText_0_7= '&'
                    {
                    lv_symbolText_0_7=(Token)match(input,109,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbolText_0_7, grammarAccess.getSqmlSqlSymbolAccess().getSymbolTextAmpersandKeyword_0_6());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlSymbolRule());
                      					}
                      					setWithLastConsumed(current, "symbolText", lv_symbolText_0_7, null);
                      				
                    }

                    }
                    break;
                case 8 :
                    // InternalSqml.g:3400:5: lv_symbolText_0_8= '^'
                    {
                    lv_symbolText_0_8=(Token)match(input,110,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbolText_0_8, grammarAccess.getSqmlSqlSymbolAccess().getSymbolTextCircumflexAccentKeyword_0_7());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlSymbolRule());
                      					}
                      					setWithLastConsumed(current, "symbolText", lv_symbolText_0_8, null);
                      				
                    }

                    }
                    break;
                case 9 :
                    // InternalSqml.g:3411:5: lv_symbolText_0_9= '~'
                    {
                    lv_symbolText_0_9=(Token)match(input,111,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbolText_0_9, grammarAccess.getSqmlSqlSymbolAccess().getSymbolTextTildeKeyword_0_8());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlSymbolRule());
                      					}
                      					setWithLastConsumed(current, "symbolText", lv_symbolText_0_9, null);
                      				
                    }

                    }
                    break;
                case 10 :
                    // InternalSqml.g:3422:5: lv_symbolText_0_10= '('
                    {
                    lv_symbolText_0_10=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbolText_0_10, grammarAccess.getSqmlSqlSymbolAccess().getSymbolTextLeftParenthesisKeyword_0_9());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlSymbolRule());
                      					}
                      					setWithLastConsumed(current, "symbolText", lv_symbolText_0_10, null);
                      				
                    }

                    }
                    break;
                case 11 :
                    // InternalSqml.g:3433:5: lv_symbolText_0_11= ')'
                    {
                    lv_symbolText_0_11=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbolText_0_11, grammarAccess.getSqmlSqlSymbolAccess().getSymbolTextRightParenthesisKeyword_0_10());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlSymbolRule());
                      					}
                      					setWithLastConsumed(current, "symbolText", lv_symbolText_0_11, null);
                      				
                    }

                    }
                    break;
                case 12 :
                    // InternalSqml.g:3444:5: lv_symbolText_0_12= '.'
                    {
                    lv_symbolText_0_12=(Token)match(input,112,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbolText_0_12, grammarAccess.getSqmlSqlSymbolAccess().getSymbolTextFullStopKeyword_0_11());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlSymbolRule());
                      					}
                      					setWithLastConsumed(current, "symbolText", lv_symbolText_0_12, null);
                      				
                    }

                    }
                    break;
                case 13 :
                    // InternalSqml.g:3455:5: lv_symbolText_0_13= ','
                    {
                    lv_symbolText_0_13=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbolText_0_13, grammarAccess.getSqmlSqlSymbolAccess().getSymbolTextCommaKeyword_0_12());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlSymbolRule());
                      					}
                      					setWithLastConsumed(current, "symbolText", lv_symbolText_0_13, null);
                      				
                    }

                    }
                    break;
                case 14 :
                    // InternalSqml.g:3466:5: lv_symbolText_0_14= '='
                    {
                    lv_symbolText_0_14=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbolText_0_14, grammarAccess.getSqmlSqlSymbolAccess().getSymbolTextEqualsSignKeyword_0_13());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlSymbolRule());
                      					}
                      					setWithLastConsumed(current, "symbolText", lv_symbolText_0_14, null);
                      				
                    }

                    }
                    break;
                case 15 :
                    // InternalSqml.g:3477:5: lv_symbolText_0_15= '<>'
                    {
                    lv_symbolText_0_15=(Token)match(input,113,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbolText_0_15, grammarAccess.getSqmlSqlSymbolAccess().getSymbolTextLessThanSignGreaterThanSignKeyword_0_14());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlSymbolRule());
                      					}
                      					setWithLastConsumed(current, "symbolText", lv_symbolText_0_15, null);
                      				
                    }

                    }
                    break;
                case 16 :
                    // InternalSqml.g:3488:5: lv_symbolText_0_16= '!='
                    {
                    lv_symbolText_0_16=(Token)match(input,114,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbolText_0_16, grammarAccess.getSqmlSqlSymbolAccess().getSymbolTextExclamationMarkEqualsSignKeyword_0_15());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlSymbolRule());
                      					}
                      					setWithLastConsumed(current, "symbolText", lv_symbolText_0_16, null);
                      				
                    }

                    }
                    break;
                case 17 :
                    // InternalSqml.g:3499:5: lv_symbolText_0_17= '<'
                    {
                    lv_symbolText_0_17=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbolText_0_17, grammarAccess.getSqmlSqlSymbolAccess().getSymbolTextLessThanSignKeyword_0_16());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlSymbolRule());
                      					}
                      					setWithLastConsumed(current, "symbolText", lv_symbolText_0_17, null);
                      				
                    }

                    }
                    break;
                case 18 :
                    // InternalSqml.g:3510:5: lv_symbolText_0_18= '<='
                    {
                    lv_symbolText_0_18=(Token)match(input,115,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbolText_0_18, grammarAccess.getSqmlSqlSymbolAccess().getSymbolTextLessThanSignEqualsSignKeyword_0_17());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlSymbolRule());
                      					}
                      					setWithLastConsumed(current, "symbolText", lv_symbolText_0_18, null);
                      				
                    }

                    }
                    break;
                case 19 :
                    // InternalSqml.g:3521:5: lv_symbolText_0_19= '>'
                    {
                    lv_symbolText_0_19=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbolText_0_19, grammarAccess.getSqmlSqlSymbolAccess().getSymbolTextGreaterThanSignKeyword_0_18());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlSymbolRule());
                      					}
                      					setWithLastConsumed(current, "symbolText", lv_symbolText_0_19, null);
                      				
                    }

                    }
                    break;
                case 20 :
                    // InternalSqml.g:3532:5: lv_symbolText_0_20= '>='
                    {
                    lv_symbolText_0_20=(Token)match(input,116,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbolText_0_20, grammarAccess.getSqmlSqlSymbolAccess().getSymbolTextGreaterThanSignEqualsSignKeyword_0_19());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlSymbolRule());
                      					}
                      					setWithLastConsumed(current, "symbolText", lv_symbolText_0_20, null);
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlSqlSymbol"


    // $ANTLR start "entryRuleSqmlSqlStringLiteral"
    // InternalSqml.g:3548:1: entryRuleSqmlSqlStringLiteral returns [EObject current=null] : iv_ruleSqmlSqlStringLiteral= ruleSqmlSqlStringLiteral EOF ;
    public final EObject entryRuleSqmlSqlStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlSqlStringLiteral = null;


        try {
            // InternalSqml.g:3548:61: (iv_ruleSqmlSqlStringLiteral= ruleSqmlSqlStringLiteral EOF )
            // InternalSqml.g:3549:2: iv_ruleSqmlSqlStringLiteral= ruleSqmlSqlStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlSqlStringLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlSqlStringLiteral=ruleSqmlSqlStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlSqlStringLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlSqlStringLiteral"


    // $ANTLR start "ruleSqmlSqlStringLiteral"
    // InternalSqml.g:3555:1: ruleSqmlSqlStringLiteral returns [EObject current=null] : ( (lv_string_0_0= RULE_STRING ) ) ;
    public final EObject ruleSqmlSqlStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_string_0_0=null;


        	enterRule();

        try {
            // InternalSqml.g:3561:2: ( ( (lv_string_0_0= RULE_STRING ) ) )
            // InternalSqml.g:3562:2: ( (lv_string_0_0= RULE_STRING ) )
            {
            // InternalSqml.g:3562:2: ( (lv_string_0_0= RULE_STRING ) )
            // InternalSqml.g:3563:3: (lv_string_0_0= RULE_STRING )
            {
            // InternalSqml.g:3563:3: (lv_string_0_0= RULE_STRING )
            // InternalSqml.g:3564:4: lv_string_0_0= RULE_STRING
            {
            lv_string_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_string_0_0, grammarAccess.getSqmlSqlStringLiteralAccess().getStringSTRINGTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSqmlSqlStringLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"string",
              					lv_string_0_0,
              					"org.eclipse.xtext.common.Terminals.STRING");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlSqlStringLiteral"


    // $ANTLR start "entryRuleSqmlSqlNumberLiteral"
    // InternalSqml.g:3583:1: entryRuleSqmlSqlNumberLiteral returns [EObject current=null] : iv_ruleSqmlSqlNumberLiteral= ruleSqmlSqlNumberLiteral EOF ;
    public final EObject entryRuleSqmlSqlNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlSqlNumberLiteral = null;


        try {
            // InternalSqml.g:3583:61: (iv_ruleSqmlSqlNumberLiteral= ruleSqmlSqlNumberLiteral EOF )
            // InternalSqml.g:3584:2: iv_ruleSqmlSqlNumberLiteral= ruleSqmlSqlNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlSqlNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlSqlNumberLiteral=ruleSqmlSqlNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlSqlNumberLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlSqlNumberLiteral"


    // $ANTLR start "ruleSqmlSqlNumberLiteral"
    // InternalSqml.g:3590:1: ruleSqmlSqlNumberLiteral returns [EObject current=null] : ( ( (lv_integer_0_0= RULE_INT ) ) | ( (lv_decimal_1_0= RULE_DECIMAL ) ) ) ;
    public final EObject ruleSqmlSqlNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        Token lv_decimal_1_0=null;


        	enterRule();

        try {
            // InternalSqml.g:3596:2: ( ( ( (lv_integer_0_0= RULE_INT ) ) | ( (lv_decimal_1_0= RULE_DECIMAL ) ) ) )
            // InternalSqml.g:3597:2: ( ( (lv_integer_0_0= RULE_INT ) ) | ( (lv_decimal_1_0= RULE_DECIMAL ) ) )
            {
            // InternalSqml.g:3597:2: ( ( (lv_integer_0_0= RULE_INT ) ) | ( (lv_decimal_1_0= RULE_DECIMAL ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_INT) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_DECIMAL) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalSqml.g:3598:3: ( (lv_integer_0_0= RULE_INT ) )
                    {
                    // InternalSqml.g:3598:3: ( (lv_integer_0_0= RULE_INT ) )
                    // InternalSqml.g:3599:4: (lv_integer_0_0= RULE_INT )
                    {
                    // InternalSqml.g:3599:4: (lv_integer_0_0= RULE_INT )
                    // InternalSqml.g:3600:5: lv_integer_0_0= RULE_INT
                    {
                    lv_integer_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_integer_0_0, grammarAccess.getSqmlSqlNumberLiteralAccess().getIntegerINTTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlNumberLiteralRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"integer",
                      						lv_integer_0_0,
                      						"org.eclipse.xtext.common.Terminals.INT");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSqml.g:3617:3: ( (lv_decimal_1_0= RULE_DECIMAL ) )
                    {
                    // InternalSqml.g:3617:3: ( (lv_decimal_1_0= RULE_DECIMAL ) )
                    // InternalSqml.g:3618:4: (lv_decimal_1_0= RULE_DECIMAL )
                    {
                    // InternalSqml.g:3618:4: (lv_decimal_1_0= RULE_DECIMAL )
                    // InternalSqml.g:3619:5: lv_decimal_1_0= RULE_DECIMAL
                    {
                    lv_decimal_1_0=(Token)match(input,RULE_DECIMAL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_decimal_1_0, grammarAccess.getSqmlSqlNumberLiteralAccess().getDecimalDECIMALTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSqlNumberLiteralRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"decimal",
                      						lv_decimal_1_0,
                      						"com.softicar.sqml.Sqml.DECIMAL");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlSqlNumberLiteral"


    // $ANTLR start "entryRuleSqmlSelect"
    // InternalSqml.g:3639:1: entryRuleSqmlSelect returns [EObject current=null] : iv_ruleSqmlSelect= ruleSqmlSelect EOF ;
    public final EObject entryRuleSqmlSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlSelect = null;


        try {
            // InternalSqml.g:3639:51: (iv_ruleSqmlSelect= ruleSqmlSelect EOF )
            // InternalSqml.g:3640:2: iv_ruleSqmlSelect= ruleSqmlSelect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlSelectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlSelect=ruleSqmlSelect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlSelect; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlSelect"


    // $ANTLR start "ruleSqmlSelect"
    // InternalSqml.g:3646:1: ruleSqmlSelect returns [EObject current=null] : ( (lv_parts_0_0= ruleSqmlSelectPart ) )+ ;
    public final EObject ruleSqmlSelect() throws RecognitionException {
        EObject current = null;

        EObject lv_parts_0_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:3652:2: ( ( (lv_parts_0_0= ruleSqmlSelectPart ) )+ )
            // InternalSqml.g:3653:2: ( (lv_parts_0_0= ruleSqmlSelectPart ) )+
            {
            // InternalSqml.g:3653:2: ( (lv_parts_0_0= ruleSqmlSelectPart ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=76 && LA39_0<=77)||LA39_0==79||(LA39_0>=84 && LA39_0<=85)||LA39_0==91||LA39_0==94||LA39_0==103||LA39_0==117) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalSqml.g:3654:3: (lv_parts_0_0= ruleSqmlSelectPart )
            	    {
            	    // InternalSqml.g:3654:3: (lv_parts_0_0= ruleSqmlSelectPart )
            	    // InternalSqml.g:3655:4: lv_parts_0_0= ruleSqmlSelectPart
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getSqmlSelectAccess().getPartsSqmlSelectPartParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_44);
            	    lv_parts_0_0=ruleSqmlSelectPart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getSqmlSelectRule());
            	      				}
            	      				add(
            	      					current,
            	      					"parts",
            	      					lv_parts_0_0,
            	      					"com.softicar.sqml.Sqml.SqmlSelectPart");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlSelect"


    // $ANTLR start "entryRuleSqmlSelectPart"
    // InternalSqml.g:3675:1: entryRuleSqmlSelectPart returns [EObject current=null] : iv_ruleSqmlSelectPart= ruleSqmlSelectPart EOF ;
    public final EObject entryRuleSqmlSelectPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlSelectPart = null;


        try {
            // InternalSqml.g:3675:55: (iv_ruleSqmlSelectPart= ruleSqmlSelectPart EOF )
            // InternalSqml.g:3676:2: iv_ruleSqmlSelectPart= ruleSqmlSelectPart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlSelectPartRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlSelectPart=ruleSqmlSelectPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlSelectPart; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlSelectPart"


    // $ANTLR start "ruleSqmlSelectPart"
    // InternalSqml.g:3682:1: ruleSqmlSelectPart returns [EObject current=null] : (this_SqmlSelectIf_0= ruleSqmlSelectIf | this_SqmlSelectClause_1= ruleSqmlSelectClause | this_SqmlFromClause_2= ruleSqmlFromClause | this_SqmlJoinClause_3= ruleSqmlJoinClause | this_SqmlWhereClause_4= ruleSqmlWhereClause | this_SqmlGroupByClause_5= ruleSqmlGroupByClause | this_SqmlHavingClause_6= ruleSqmlHavingClause | this_SqmlOrderByClause_7= ruleSqmlOrderByClause ) ;
    public final EObject ruleSqmlSelectPart() throws RecognitionException {
        EObject current = null;

        EObject this_SqmlSelectIf_0 = null;

        EObject this_SqmlSelectClause_1 = null;

        EObject this_SqmlFromClause_2 = null;

        EObject this_SqmlJoinClause_3 = null;

        EObject this_SqmlWhereClause_4 = null;

        EObject this_SqmlGroupByClause_5 = null;

        EObject this_SqmlHavingClause_6 = null;

        EObject this_SqmlOrderByClause_7 = null;



        	enterRule();

        try {
            // InternalSqml.g:3688:2: ( (this_SqmlSelectIf_0= ruleSqmlSelectIf | this_SqmlSelectClause_1= ruleSqmlSelectClause | this_SqmlFromClause_2= ruleSqmlFromClause | this_SqmlJoinClause_3= ruleSqmlJoinClause | this_SqmlWhereClause_4= ruleSqmlWhereClause | this_SqmlGroupByClause_5= ruleSqmlGroupByClause | this_SqmlHavingClause_6= ruleSqmlHavingClause | this_SqmlOrderByClause_7= ruleSqmlOrderByClause ) )
            // InternalSqml.g:3689:2: (this_SqmlSelectIf_0= ruleSqmlSelectIf | this_SqmlSelectClause_1= ruleSqmlSelectClause | this_SqmlFromClause_2= ruleSqmlFromClause | this_SqmlJoinClause_3= ruleSqmlJoinClause | this_SqmlWhereClause_4= ruleSqmlWhereClause | this_SqmlGroupByClause_5= ruleSqmlGroupByClause | this_SqmlHavingClause_6= ruleSqmlHavingClause | this_SqmlOrderByClause_7= ruleSqmlOrderByClause )
            {
            // InternalSqml.g:3689:2: (this_SqmlSelectIf_0= ruleSqmlSelectIf | this_SqmlSelectClause_1= ruleSqmlSelectClause | this_SqmlFromClause_2= ruleSqmlFromClause | this_SqmlJoinClause_3= ruleSqmlJoinClause | this_SqmlWhereClause_4= ruleSqmlWhereClause | this_SqmlGroupByClause_5= ruleSqmlGroupByClause | this_SqmlHavingClause_6= ruleSqmlHavingClause | this_SqmlOrderByClause_7= ruleSqmlOrderByClause )
            int alt40=8;
            switch ( input.LA(1) ) {
            case 117:
                {
                alt40=1;
                }
                break;
            case 94:
                {
                alt40=2;
                }
                break;
            case 76:
                {
                alt40=3;
                }
                break;
            case 84:
            case 85:
                {
                alt40=4;
                }
                break;
            case 103:
                {
                alt40=5;
                }
                break;
            case 77:
                {
                alt40=6;
                }
                break;
            case 79:
                {
                alt40=7;
                }
                break;
            case 91:
                {
                alt40=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalSqml.g:3690:3: this_SqmlSelectIf_0= ruleSqmlSelectIf
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlSelectPartAccess().getSqmlSelectIfParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlSelectIf_0=ruleSqmlSelectIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlSelectIf_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSqml.g:3699:3: this_SqmlSelectClause_1= ruleSqmlSelectClause
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlSelectPartAccess().getSqmlSelectClauseParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlSelectClause_1=ruleSqmlSelectClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlSelectClause_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSqml.g:3708:3: this_SqmlFromClause_2= ruleSqmlFromClause
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlSelectPartAccess().getSqmlFromClauseParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlFromClause_2=ruleSqmlFromClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlFromClause_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSqml.g:3717:3: this_SqmlJoinClause_3= ruleSqmlJoinClause
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlSelectPartAccess().getSqmlJoinClauseParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlJoinClause_3=ruleSqmlJoinClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlJoinClause_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalSqml.g:3726:3: this_SqmlWhereClause_4= ruleSqmlWhereClause
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlSelectPartAccess().getSqmlWhereClauseParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlWhereClause_4=ruleSqmlWhereClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlWhereClause_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalSqml.g:3735:3: this_SqmlGroupByClause_5= ruleSqmlGroupByClause
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlSelectPartAccess().getSqmlGroupByClauseParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlGroupByClause_5=ruleSqmlGroupByClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlGroupByClause_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalSqml.g:3744:3: this_SqmlHavingClause_6= ruleSqmlHavingClause
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlSelectPartAccess().getSqmlHavingClauseParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlHavingClause_6=ruleSqmlHavingClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlHavingClause_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalSqml.g:3753:3: this_SqmlOrderByClause_7= ruleSqmlOrderByClause
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlSelectPartAccess().getSqmlOrderByClauseParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlOrderByClause_7=ruleSqmlOrderByClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlOrderByClause_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlSelectPart"


    // $ANTLR start "entryRuleSqmlSelectIf"
    // InternalSqml.g:3765:1: entryRuleSqmlSelectIf returns [EObject current=null] : iv_ruleSqmlSelectIf= ruleSqmlSelectIf EOF ;
    public final EObject entryRuleSqmlSelectIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlSelectIf = null;


        try {
            // InternalSqml.g:3765:53: (iv_ruleSqmlSelectIf= ruleSqmlSelectIf EOF )
            // InternalSqml.g:3766:2: iv_ruleSqmlSelectIf= ruleSqmlSelectIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlSelectIfRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlSelectIf=ruleSqmlSelectIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlSelectIf; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlSelectIf"


    // $ANTLR start "ruleSqmlSelectIf"
    // InternalSqml.g:3772:1: ruleSqmlSelectIf returns [EObject current=null] : (otherlv_0= '#' otherlv_1= 'IF' ( (lv_condition_2_0= ruleSqmlStaticExpression ) ) otherlv_3= '{' ( (lv_parts_4_0= ruleSqmlSelectPart ) )* otherlv_5= '}' ( (lv_elseIfs_6_0= ruleSqmlSelectElseIf ) )* ( (lv_else_7_0= ruleSqmlSelectElse ) )? ) ;
    public final EObject ruleSqmlSelectIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_2_0 = null;

        EObject lv_parts_4_0 = null;

        EObject lv_elseIfs_6_0 = null;

        EObject lv_else_7_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:3778:2: ( (otherlv_0= '#' otherlv_1= 'IF' ( (lv_condition_2_0= ruleSqmlStaticExpression ) ) otherlv_3= '{' ( (lv_parts_4_0= ruleSqmlSelectPart ) )* otherlv_5= '}' ( (lv_elseIfs_6_0= ruleSqmlSelectElseIf ) )* ( (lv_else_7_0= ruleSqmlSelectElse ) )? ) )
            // InternalSqml.g:3779:2: (otherlv_0= '#' otherlv_1= 'IF' ( (lv_condition_2_0= ruleSqmlStaticExpression ) ) otherlv_3= '{' ( (lv_parts_4_0= ruleSqmlSelectPart ) )* otherlv_5= '}' ( (lv_elseIfs_6_0= ruleSqmlSelectElseIf ) )* ( (lv_else_7_0= ruleSqmlSelectElse ) )? )
            {
            // InternalSqml.g:3779:2: (otherlv_0= '#' otherlv_1= 'IF' ( (lv_condition_2_0= ruleSqmlStaticExpression ) ) otherlv_3= '{' ( (lv_parts_4_0= ruleSqmlSelectPart ) )* otherlv_5= '}' ( (lv_elseIfs_6_0= ruleSqmlSelectElseIf ) )* ( (lv_else_7_0= ruleSqmlSelectElse ) )? )
            // InternalSqml.g:3780:3: otherlv_0= '#' otherlv_1= 'IF' ( (lv_condition_2_0= ruleSqmlStaticExpression ) ) otherlv_3= '{' ( (lv_parts_4_0= ruleSqmlSelectPart ) )* otherlv_5= '}' ( (lv_elseIfs_6_0= ruleSqmlSelectElseIf ) )* ( (lv_else_7_0= ruleSqmlSelectElse ) )?
            {
            otherlv_0=(Token)match(input,117,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSqmlSelectIfAccess().getNumberSignKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,80,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSqmlSelectIfAccess().getIFKeyword_1());
              		
            }
            // InternalSqml.g:3788:3: ( (lv_condition_2_0= ruleSqmlStaticExpression ) )
            // InternalSqml.g:3789:4: (lv_condition_2_0= ruleSqmlStaticExpression )
            {
            // InternalSqml.g:3789:4: (lv_condition_2_0= ruleSqmlStaticExpression )
            // InternalSqml.g:3790:5: lv_condition_2_0= ruleSqmlStaticExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlSelectIfAccess().getConditionSqmlStaticExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_condition_2_0=ruleSqmlStaticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlSelectIfRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_2_0,
              						"com.softicar.sqml.Sqml.SqmlStaticExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSqmlSelectIfAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalSqml.g:3811:3: ( (lv_parts_4_0= ruleSqmlSelectPart ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=76 && LA41_0<=77)||LA41_0==79||(LA41_0>=84 && LA41_0<=85)||LA41_0==91||LA41_0==94||LA41_0==103||LA41_0==117) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalSqml.g:3812:4: (lv_parts_4_0= ruleSqmlSelectPart )
            	    {
            	    // InternalSqml.g:3812:4: (lv_parts_4_0= ruleSqmlSelectPart )
            	    // InternalSqml.g:3813:5: lv_parts_4_0= ruleSqmlSelectPart
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSqmlSelectIfAccess().getPartsSqmlSelectPartParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_47);
            	    lv_parts_4_0=ruleSqmlSelectPart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSqmlSelectIfRule());
            	      					}
            	      					add(
            	      						current,
            	      						"parts",
            	      						lv_parts_4_0,
            	      						"com.softicar.sqml.Sqml.SqmlSelectPart");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_5=(Token)match(input,24,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSqmlSelectIfAccess().getRightCurlyBracketKeyword_5());
              		
            }
            // InternalSqml.g:3834:3: ( (lv_elseIfs_6_0= ruleSqmlSelectElseIf ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==69) ) {
                    int LA42_1 = input.LA(2);

                    if ( (LA42_1==80) ) {
                        alt42=1;
                    }


                }


                switch (alt42) {
            	case 1 :
            	    // InternalSqml.g:3835:4: (lv_elseIfs_6_0= ruleSqmlSelectElseIf )
            	    {
            	    // InternalSqml.g:3835:4: (lv_elseIfs_6_0= ruleSqmlSelectElseIf )
            	    // InternalSqml.g:3836:5: lv_elseIfs_6_0= ruleSqmlSelectElseIf
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSqmlSelectIfAccess().getElseIfsSqmlSelectElseIfParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_48);
            	    lv_elseIfs_6_0=ruleSqmlSelectElseIf();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSqmlSelectIfRule());
            	      					}
            	      					add(
            	      						current,
            	      						"elseIfs",
            	      						lv_elseIfs_6_0,
            	      						"com.softicar.sqml.Sqml.SqmlSelectElseIf");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            // InternalSqml.g:3853:3: ( (lv_else_7_0= ruleSqmlSelectElse ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==69) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSqml.g:3854:4: (lv_else_7_0= ruleSqmlSelectElse )
                    {
                    // InternalSqml.g:3854:4: (lv_else_7_0= ruleSqmlSelectElse )
                    // InternalSqml.g:3855:5: lv_else_7_0= ruleSqmlSelectElse
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSqmlSelectIfAccess().getElseSqmlSelectElseParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_else_7_0=ruleSqmlSelectElse();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSqmlSelectIfRule());
                      					}
                      					set(
                      						current,
                      						"else",
                      						lv_else_7_0,
                      						"com.softicar.sqml.Sqml.SqmlSelectElse");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlSelectIf"


    // $ANTLR start "entryRuleSqmlSelectElseIf"
    // InternalSqml.g:3876:1: entryRuleSqmlSelectElseIf returns [EObject current=null] : iv_ruleSqmlSelectElseIf= ruleSqmlSelectElseIf EOF ;
    public final EObject entryRuleSqmlSelectElseIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlSelectElseIf = null;


        try {
            // InternalSqml.g:3876:57: (iv_ruleSqmlSelectElseIf= ruleSqmlSelectElseIf EOF )
            // InternalSqml.g:3877:2: iv_ruleSqmlSelectElseIf= ruleSqmlSelectElseIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlSelectElseIfRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlSelectElseIf=ruleSqmlSelectElseIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlSelectElseIf; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlSelectElseIf"


    // $ANTLR start "ruleSqmlSelectElseIf"
    // InternalSqml.g:3883:1: ruleSqmlSelectElseIf returns [EObject current=null] : (otherlv_0= 'ELSE' otherlv_1= 'IF' ( (lv_condition_2_0= ruleSqmlStaticExpression ) ) otherlv_3= '{' ( (lv_parts_4_0= ruleSqmlSelectPart ) )* otherlv_5= '}' ) ;
    public final EObject ruleSqmlSelectElseIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_2_0 = null;

        EObject lv_parts_4_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:3889:2: ( (otherlv_0= 'ELSE' otherlv_1= 'IF' ( (lv_condition_2_0= ruleSqmlStaticExpression ) ) otherlv_3= '{' ( (lv_parts_4_0= ruleSqmlSelectPart ) )* otherlv_5= '}' ) )
            // InternalSqml.g:3890:2: (otherlv_0= 'ELSE' otherlv_1= 'IF' ( (lv_condition_2_0= ruleSqmlStaticExpression ) ) otherlv_3= '{' ( (lv_parts_4_0= ruleSqmlSelectPart ) )* otherlv_5= '}' )
            {
            // InternalSqml.g:3890:2: (otherlv_0= 'ELSE' otherlv_1= 'IF' ( (lv_condition_2_0= ruleSqmlStaticExpression ) ) otherlv_3= '{' ( (lv_parts_4_0= ruleSqmlSelectPart ) )* otherlv_5= '}' )
            // InternalSqml.g:3891:3: otherlv_0= 'ELSE' otherlv_1= 'IF' ( (lv_condition_2_0= ruleSqmlStaticExpression ) ) otherlv_3= '{' ( (lv_parts_4_0= ruleSqmlSelectPart ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSqmlSelectElseIfAccess().getELSEKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,80,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSqmlSelectElseIfAccess().getIFKeyword_1());
              		
            }
            // InternalSqml.g:3899:3: ( (lv_condition_2_0= ruleSqmlStaticExpression ) )
            // InternalSqml.g:3900:4: (lv_condition_2_0= ruleSqmlStaticExpression )
            {
            // InternalSqml.g:3900:4: (lv_condition_2_0= ruleSqmlStaticExpression )
            // InternalSqml.g:3901:5: lv_condition_2_0= ruleSqmlStaticExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlSelectElseIfAccess().getConditionSqmlStaticExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_condition_2_0=ruleSqmlStaticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlSelectElseIfRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_2_0,
              						"com.softicar.sqml.Sqml.SqmlStaticExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSqmlSelectElseIfAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalSqml.g:3922:3: ( (lv_parts_4_0= ruleSqmlSelectPart ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=76 && LA44_0<=77)||LA44_0==79||(LA44_0>=84 && LA44_0<=85)||LA44_0==91||LA44_0==94||LA44_0==103||LA44_0==117) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalSqml.g:3923:4: (lv_parts_4_0= ruleSqmlSelectPart )
            	    {
            	    // InternalSqml.g:3923:4: (lv_parts_4_0= ruleSqmlSelectPart )
            	    // InternalSqml.g:3924:5: lv_parts_4_0= ruleSqmlSelectPart
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSqmlSelectElseIfAccess().getPartsSqmlSelectPartParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_47);
            	    lv_parts_4_0=ruleSqmlSelectPart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSqmlSelectElseIfRule());
            	      					}
            	      					add(
            	      						current,
            	      						"parts",
            	      						lv_parts_4_0,
            	      						"com.softicar.sqml.Sqml.SqmlSelectPart");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_5=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSqmlSelectElseIfAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlSelectElseIf"


    // $ANTLR start "entryRuleSqmlSelectElse"
    // InternalSqml.g:3949:1: entryRuleSqmlSelectElse returns [EObject current=null] : iv_ruleSqmlSelectElse= ruleSqmlSelectElse EOF ;
    public final EObject entryRuleSqmlSelectElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlSelectElse = null;


        try {
            // InternalSqml.g:3949:55: (iv_ruleSqmlSelectElse= ruleSqmlSelectElse EOF )
            // InternalSqml.g:3950:2: iv_ruleSqmlSelectElse= ruleSqmlSelectElse EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlSelectElseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlSelectElse=ruleSqmlSelectElse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlSelectElse; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlSelectElse"


    // $ANTLR start "ruleSqmlSelectElse"
    // InternalSqml.g:3956:1: ruleSqmlSelectElse returns [EObject current=null] : ( () otherlv_1= 'ELSE' otherlv_2= '{' ( (lv_parts_3_0= ruleSqmlSelectPart ) )* otherlv_4= '}' ) ;
    public final EObject ruleSqmlSelectElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parts_3_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:3962:2: ( ( () otherlv_1= 'ELSE' otherlv_2= '{' ( (lv_parts_3_0= ruleSqmlSelectPart ) )* otherlv_4= '}' ) )
            // InternalSqml.g:3963:2: ( () otherlv_1= 'ELSE' otherlv_2= '{' ( (lv_parts_3_0= ruleSqmlSelectPart ) )* otherlv_4= '}' )
            {
            // InternalSqml.g:3963:2: ( () otherlv_1= 'ELSE' otherlv_2= '{' ( (lv_parts_3_0= ruleSqmlSelectPart ) )* otherlv_4= '}' )
            // InternalSqml.g:3964:3: () otherlv_1= 'ELSE' otherlv_2= '{' ( (lv_parts_3_0= ruleSqmlSelectPart ) )* otherlv_4= '}'
            {
            // InternalSqml.g:3964:3: ()
            // InternalSqml.g:3965:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSqmlSelectElseAccess().getSqmlSelectElseAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSqmlSelectElseAccess().getELSEKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSqmlSelectElseAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalSqml.g:3979:3: ( (lv_parts_3_0= ruleSqmlSelectPart ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=76 && LA45_0<=77)||LA45_0==79||(LA45_0>=84 && LA45_0<=85)||LA45_0==91||LA45_0==94||LA45_0==103||LA45_0==117) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalSqml.g:3980:4: (lv_parts_3_0= ruleSqmlSelectPart )
            	    {
            	    // InternalSqml.g:3980:4: (lv_parts_3_0= ruleSqmlSelectPart )
            	    // InternalSqml.g:3981:5: lv_parts_3_0= ruleSqmlSelectPart
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSqmlSelectElseAccess().getPartsSqmlSelectPartParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_47);
            	    lv_parts_3_0=ruleSqmlSelectPart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSqmlSelectElseRule());
            	      					}
            	      					add(
            	      						current,
            	      						"parts",
            	      						lv_parts_3_0,
            	      						"com.softicar.sqml.Sqml.SqmlSelectPart");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSqmlSelectElseAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlSelectElse"


    // $ANTLR start "entryRuleSqmlSelectClause"
    // InternalSqml.g:4006:1: entryRuleSqmlSelectClause returns [EObject current=null] : iv_ruleSqmlSelectClause= ruleSqmlSelectClause EOF ;
    public final EObject entryRuleSqmlSelectClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlSelectClause = null;


        try {
            // InternalSqml.g:4006:57: (iv_ruleSqmlSelectClause= ruleSqmlSelectClause EOF )
            // InternalSqml.g:4007:2: iv_ruleSqmlSelectClause= ruleSqmlSelectClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlSelectClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlSelectClause=ruleSqmlSelectClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlSelectClause; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlSelectClause"


    // $ANTLR start "ruleSqmlSelectClause"
    // InternalSqml.g:4013:1: ruleSqmlSelectClause returns [EObject current=null] : (otherlv_0= 'SELECT' ( (lv_distinct_1_0= 'DISTINCT' ) )? ( (lv_columns_2_0= ruleSqmlSelectColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleSqmlSelectColumn ) ) )* ) ;
    public final EObject ruleSqmlSelectClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_distinct_1_0=null;
        Token otherlv_3=null;
        EObject lv_columns_2_0 = null;

        EObject lv_columns_4_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:4019:2: ( (otherlv_0= 'SELECT' ( (lv_distinct_1_0= 'DISTINCT' ) )? ( (lv_columns_2_0= ruleSqmlSelectColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleSqmlSelectColumn ) ) )* ) )
            // InternalSqml.g:4020:2: (otherlv_0= 'SELECT' ( (lv_distinct_1_0= 'DISTINCT' ) )? ( (lv_columns_2_0= ruleSqmlSelectColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleSqmlSelectColumn ) ) )* )
            {
            // InternalSqml.g:4020:2: (otherlv_0= 'SELECT' ( (lv_distinct_1_0= 'DISTINCT' ) )? ( (lv_columns_2_0= ruleSqmlSelectColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleSqmlSelectColumn ) ) )* )
            // InternalSqml.g:4021:3: otherlv_0= 'SELECT' ( (lv_distinct_1_0= 'DISTINCT' ) )? ( (lv_columns_2_0= ruleSqmlSelectColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleSqmlSelectColumn ) ) )*
            {
            otherlv_0=(Token)match(input,94,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSqmlSelectClauseAccess().getSELECTKeyword_0());
              		
            }
            // InternalSqml.g:4025:3: ( (lv_distinct_1_0= 'DISTINCT' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==68) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSqml.g:4026:4: (lv_distinct_1_0= 'DISTINCT' )
                    {
                    // InternalSqml.g:4026:4: (lv_distinct_1_0= 'DISTINCT' )
                    // InternalSqml.g:4027:5: lv_distinct_1_0= 'DISTINCT'
                    {
                    lv_distinct_1_0=(Token)match(input,68,FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_distinct_1_0, grammarAccess.getSqmlSelectClauseAccess().getDistinctDISTINCTKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlSelectClauseRule());
                      					}
                      					setWithLastConsumed(current, "distinct", lv_distinct_1_0 != null, "DISTINCT");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSqml.g:4039:3: ( (lv_columns_2_0= ruleSqmlSelectColumn ) )
            // InternalSqml.g:4040:4: (lv_columns_2_0= ruleSqmlSelectColumn )
            {
            // InternalSqml.g:4040:4: (lv_columns_2_0= ruleSqmlSelectColumn )
            // InternalSqml.g:4041:5: lv_columns_2_0= ruleSqmlSelectColumn
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlSelectClauseAccess().getColumnsSqmlSelectColumnParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_50);
            lv_columns_2_0=ruleSqmlSelectColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlSelectClauseRule());
              					}
              					add(
              						current,
              						"columns",
              						lv_columns_2_0,
              						"com.softicar.sqml.Sqml.SqmlSelectColumn");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSqml.g:4058:3: (otherlv_3= ',' ( (lv_columns_4_0= ruleSqmlSelectColumn ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==18) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalSqml.g:4059:4: otherlv_3= ',' ( (lv_columns_4_0= ruleSqmlSelectColumn ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_49); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getSqmlSelectClauseAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalSqml.g:4063:4: ( (lv_columns_4_0= ruleSqmlSelectColumn ) )
            	    // InternalSqml.g:4064:5: (lv_columns_4_0= ruleSqmlSelectColumn )
            	    {
            	    // InternalSqml.g:4064:5: (lv_columns_4_0= ruleSqmlSelectColumn )
            	    // InternalSqml.g:4065:6: lv_columns_4_0= ruleSqmlSelectColumn
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSqmlSelectClauseAccess().getColumnsSqmlSelectColumnParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_50);
            	    lv_columns_4_0=ruleSqmlSelectColumn();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSqmlSelectClauseRule());
            	      						}
            	      						add(
            	      							current,
            	      							"columns",
            	      							lv_columns_4_0,
            	      							"com.softicar.sqml.Sqml.SqmlSelectColumn");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlSelectClause"


    // $ANTLR start "entryRuleSqmlSelectColumn"
    // InternalSqml.g:4087:1: entryRuleSqmlSelectColumn returns [EObject current=null] : iv_ruleSqmlSelectColumn= ruleSqmlSelectColumn EOF ;
    public final EObject entryRuleSqmlSelectColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlSelectColumn = null;


        try {
            // InternalSqml.g:4087:57: (iv_ruleSqmlSelectColumn= ruleSqmlSelectColumn EOF )
            // InternalSqml.g:4088:2: iv_ruleSqmlSelectColumn= ruleSqmlSelectColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlSelectColumnRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlSelectColumn=ruleSqmlSelectColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlSelectColumn; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlSelectColumn"


    // $ANTLR start "ruleSqmlSelectColumn"
    // InternalSqml.g:4094:1: ruleSqmlSelectColumn returns [EObject current=null] : ( ( (lv_expression_0_0= ruleSqmlExpression ) ) (otherlv_1= 'AS' ( (lv_alias_2_0= RULE_ID ) ) )? (otherlv_3= 'TITLE' ( (lv_title_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleSqmlSelectColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_alias_2_0=null;
        Token otherlv_3=null;
        Token lv_title_4_0=null;
        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:4100:2: ( ( ( (lv_expression_0_0= ruleSqmlExpression ) ) (otherlv_1= 'AS' ( (lv_alias_2_0= RULE_ID ) ) )? (otherlv_3= 'TITLE' ( (lv_title_4_0= RULE_STRING ) ) )? ) )
            // InternalSqml.g:4101:2: ( ( (lv_expression_0_0= ruleSqmlExpression ) ) (otherlv_1= 'AS' ( (lv_alias_2_0= RULE_ID ) ) )? (otherlv_3= 'TITLE' ( (lv_title_4_0= RULE_STRING ) ) )? )
            {
            // InternalSqml.g:4101:2: ( ( (lv_expression_0_0= ruleSqmlExpression ) ) (otherlv_1= 'AS' ( (lv_alias_2_0= RULE_ID ) ) )? (otherlv_3= 'TITLE' ( (lv_title_4_0= RULE_STRING ) ) )? )
            // InternalSqml.g:4102:3: ( (lv_expression_0_0= ruleSqmlExpression ) ) (otherlv_1= 'AS' ( (lv_alias_2_0= RULE_ID ) ) )? (otherlv_3= 'TITLE' ( (lv_title_4_0= RULE_STRING ) ) )?
            {
            // InternalSqml.g:4102:3: ( (lv_expression_0_0= ruleSqmlExpression ) )
            // InternalSqml.g:4103:4: (lv_expression_0_0= ruleSqmlExpression )
            {
            // InternalSqml.g:4103:4: (lv_expression_0_0= ruleSqmlExpression )
            // InternalSqml.g:4104:5: lv_expression_0_0= ruleSqmlExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlSelectColumnAccess().getExpressionSqmlExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_51);
            lv_expression_0_0=ruleSqmlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlSelectColumnRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_0_0,
              						"com.softicar.sqml.Sqml.SqmlExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSqml.g:4121:3: (otherlv_1= 'AS' ( (lv_alias_2_0= RULE_ID ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==54) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSqml.g:4122:4: otherlv_1= 'AS' ( (lv_alias_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,54,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSqmlSelectColumnAccess().getASKeyword_1_0());
                      			
                    }
                    // InternalSqml.g:4126:4: ( (lv_alias_2_0= RULE_ID ) )
                    // InternalSqml.g:4127:5: (lv_alias_2_0= RULE_ID )
                    {
                    // InternalSqml.g:4127:5: (lv_alias_2_0= RULE_ID )
                    // InternalSqml.g:4128:6: lv_alias_2_0= RULE_ID
                    {
                    lv_alias_2_0=(Token)match(input,RULE_ID,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_alias_2_0, grammarAccess.getSqmlSelectColumnAccess().getAliasIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSqmlSelectColumnRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"alias",
                      							lv_alias_2_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSqml.g:4145:3: (otherlv_3= 'TITLE' ( (lv_title_4_0= RULE_STRING ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==100) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalSqml.g:4146:4: otherlv_3= 'TITLE' ( (lv_title_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,100,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSqmlSelectColumnAccess().getTITLEKeyword_2_0());
                      			
                    }
                    // InternalSqml.g:4150:4: ( (lv_title_4_0= RULE_STRING ) )
                    // InternalSqml.g:4151:5: (lv_title_4_0= RULE_STRING )
                    {
                    // InternalSqml.g:4151:5: (lv_title_4_0= RULE_STRING )
                    // InternalSqml.g:4152:6: lv_title_4_0= RULE_STRING
                    {
                    lv_title_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_title_4_0, grammarAccess.getSqmlSelectColumnAccess().getTitleSTRINGTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSqmlSelectColumnRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"title",
                      							lv_title_4_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlSelectColumn"


    // $ANTLR start "entryRuleSqmlFromClause"
    // InternalSqml.g:4173:1: entryRuleSqmlFromClause returns [EObject current=null] : iv_ruleSqmlFromClause= ruleSqmlFromClause EOF ;
    public final EObject entryRuleSqmlFromClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlFromClause = null;


        try {
            // InternalSqml.g:4173:55: (iv_ruleSqmlFromClause= ruleSqmlFromClause EOF )
            // InternalSqml.g:4174:2: iv_ruleSqmlFromClause= ruleSqmlFromClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlFromClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlFromClause=ruleSqmlFromClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlFromClause; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlFromClause"


    // $ANTLR start "ruleSqmlFromClause"
    // InternalSqml.g:4180:1: ruleSqmlFromClause returns [EObject current=null] : (otherlv_0= 'FROM' ( ( (lv_variable_1_1= ruleSqmlTableVariable | lv_variable_1_2= ruleSqmlSubSelectVariable ) ) ) ) ;
    public final EObject ruleSqmlFromClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_variable_1_1 = null;

        EObject lv_variable_1_2 = null;



        	enterRule();

        try {
            // InternalSqml.g:4186:2: ( (otherlv_0= 'FROM' ( ( (lv_variable_1_1= ruleSqmlTableVariable | lv_variable_1_2= ruleSqmlSubSelectVariable ) ) ) ) )
            // InternalSqml.g:4187:2: (otherlv_0= 'FROM' ( ( (lv_variable_1_1= ruleSqmlTableVariable | lv_variable_1_2= ruleSqmlSubSelectVariable ) ) ) )
            {
            // InternalSqml.g:4187:2: (otherlv_0= 'FROM' ( ( (lv_variable_1_1= ruleSqmlTableVariable | lv_variable_1_2= ruleSqmlSubSelectVariable ) ) ) )
            // InternalSqml.g:4188:3: otherlv_0= 'FROM' ( ( (lv_variable_1_1= ruleSqmlTableVariable | lv_variable_1_2= ruleSqmlSubSelectVariable ) ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSqmlFromClauseAccess().getFROMKeyword_0());
              		
            }
            // InternalSqml.g:4192:3: ( ( (lv_variable_1_1= ruleSqmlTableVariable | lv_variable_1_2= ruleSqmlSubSelectVariable ) ) )
            // InternalSqml.g:4193:4: ( (lv_variable_1_1= ruleSqmlTableVariable | lv_variable_1_2= ruleSqmlSubSelectVariable ) )
            {
            // InternalSqml.g:4193:4: ( (lv_variable_1_1= ruleSqmlTableVariable | lv_variable_1_2= ruleSqmlSubSelectVariable ) )
            // InternalSqml.g:4194:5: (lv_variable_1_1= ruleSqmlTableVariable | lv_variable_1_2= ruleSqmlSubSelectVariable )
            {
            // InternalSqml.g:4194:5: (lv_variable_1_1= ruleSqmlTableVariable | lv_variable_1_2= ruleSqmlSubSelectVariable )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                alt50=1;
            }
            else if ( (LA50_0==49) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalSqml.g:4195:6: lv_variable_1_1= ruleSqmlTableVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSqmlFromClauseAccess().getVariableSqmlTableVariableParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_variable_1_1=ruleSqmlTableVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSqmlFromClauseRule());
                      						}
                      						set(
                      							current,
                      							"variable",
                      							lv_variable_1_1,
                      							"com.softicar.sqml.Sqml.SqmlTableVariable");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalSqml.g:4211:6: lv_variable_1_2= ruleSqmlSubSelectVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSqmlFromClauseAccess().getVariableSqmlSubSelectVariableParserRuleCall_1_0_1());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_variable_1_2=ruleSqmlSubSelectVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSqmlFromClauseRule());
                      						}
                      						set(
                      							current,
                      							"variable",
                      							lv_variable_1_2,
                      							"com.softicar.sqml.Sqml.SqmlSubSelectVariable");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlFromClause"


    // $ANTLR start "entryRuleSqmlForeignKeyVariable"
    // InternalSqml.g:4233:1: entryRuleSqmlForeignKeyVariable returns [EObject current=null] : iv_ruleSqmlForeignKeyVariable= ruleSqmlForeignKeyVariable EOF ;
    public final EObject entryRuleSqmlForeignKeyVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlForeignKeyVariable = null;


        try {
            // InternalSqml.g:4233:63: (iv_ruleSqmlForeignKeyVariable= ruleSqmlForeignKeyVariable EOF )
            // InternalSqml.g:4234:2: iv_ruleSqmlForeignKeyVariable= ruleSqmlForeignKeyVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlForeignKeyVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlForeignKeyVariable=ruleSqmlForeignKeyVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlForeignKeyVariable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlForeignKeyVariable"


    // $ANTLR start "ruleSqmlForeignKeyVariable"
    // InternalSqml.g:4240:1: ruleSqmlForeignKeyVariable returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'AS' )? ( (lv_name_4_0= RULE_ID ) ) ) ;
    public final EObject ruleSqmlForeignKeyVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;


        	enterRule();

        try {
            // InternalSqml.g:4246:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'AS' )? ( (lv_name_4_0= RULE_ID ) ) ) )
            // InternalSqml.g:4247:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'AS' )? ( (lv_name_4_0= RULE_ID ) ) )
            {
            // InternalSqml.g:4247:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'AS' )? ( (lv_name_4_0= RULE_ID ) ) )
            // InternalSqml.g:4248:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'AS' )? ( (lv_name_4_0= RULE_ID ) )
            {
            // InternalSqml.g:4248:3: ( (otherlv_0= RULE_ID ) )
            // InternalSqml.g:4249:4: (otherlv_0= RULE_ID )
            {
            // InternalSqml.g:4249:4: (otherlv_0= RULE_ID )
            // InternalSqml.g:4250:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSqmlForeignKeyVariableRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getSqmlForeignKeyVariableAccess().getVariableISqmlVariableCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,112,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSqmlForeignKeyVariableAccess().getFullStopKeyword_1());
              		
            }
            // InternalSqml.g:4265:3: ( (otherlv_2= RULE_ID ) )
            // InternalSqml.g:4266:4: (otherlv_2= RULE_ID )
            {
            // InternalSqml.g:4266:4: (otherlv_2= RULE_ID )
            // InternalSqml.g:4267:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSqmlForeignKeyVariableRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getSqmlForeignKeyVariableAccess().getColumnISqmlColumnCrossReference_2_0());
              				
            }

            }


            }

            // InternalSqml.g:4278:3: (otherlv_3= 'AS' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==54) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalSqml.g:4279:4: otherlv_3= 'AS'
                    {
                    otherlv_3=(Token)match(input,54,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSqmlForeignKeyVariableAccess().getASKeyword_3());
                      			
                    }

                    }
                    break;

            }

            // InternalSqml.g:4284:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalSqml.g:4285:4: (lv_name_4_0= RULE_ID )
            {
            // InternalSqml.g:4285:4: (lv_name_4_0= RULE_ID )
            // InternalSqml.g:4286:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getSqmlForeignKeyVariableAccess().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSqmlForeignKeyVariableRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlForeignKeyVariable"


    // $ANTLR start "entryRuleSqmlTableVariable"
    // InternalSqml.g:4306:1: entryRuleSqmlTableVariable returns [EObject current=null] : iv_ruleSqmlTableVariable= ruleSqmlTableVariable EOF ;
    public final EObject entryRuleSqmlTableVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlTableVariable = null;


        try {
            // InternalSqml.g:4306:58: (iv_ruleSqmlTableVariable= ruleSqmlTableVariable EOF )
            // InternalSqml.g:4307:2: iv_ruleSqmlTableVariable= ruleSqmlTableVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlTableVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlTableVariable=ruleSqmlTableVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlTableVariable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlTableVariable"


    // $ANTLR start "ruleSqmlTableVariable"
    // InternalSqml.g:4313:1: ruleSqmlTableVariable returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'AS' )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleSqmlTableVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalSqml.g:4319:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'AS' )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalSqml.g:4320:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'AS' )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalSqml.g:4320:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'AS' )? ( (lv_name_2_0= RULE_ID ) ) )
            // InternalSqml.g:4321:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'AS' )? ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalSqml.g:4321:3: ( (otherlv_0= RULE_ID ) )
            // InternalSqml.g:4322:4: (otherlv_0= RULE_ID )
            {
            // InternalSqml.g:4322:4: (otherlv_0= RULE_ID )
            // InternalSqml.g:4323:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSqmlTableVariableRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getSqmlTableVariableAccess().getTableISqmlTableCrossReference_0_0());
              				
            }

            }


            }

            // InternalSqml.g:4334:3: (otherlv_1= 'AS' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==54) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalSqml.g:4335:4: otherlv_1= 'AS'
                    {
                    otherlv_1=(Token)match(input,54,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSqmlTableVariableAccess().getASKeyword_1());
                      			
                    }

                    }
                    break;

            }

            // InternalSqml.g:4340:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSqml.g:4341:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSqml.g:4341:4: (lv_name_2_0= RULE_ID )
            // InternalSqml.g:4342:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getSqmlTableVariableAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSqmlTableVariableRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlTableVariable"


    // $ANTLR start "entryRuleSqmlSubSelectVariable"
    // InternalSqml.g:4362:1: entryRuleSqmlSubSelectVariable returns [EObject current=null] : iv_ruleSqmlSubSelectVariable= ruleSqmlSubSelectVariable EOF ;
    public final EObject entryRuleSqmlSubSelectVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlSubSelectVariable = null;


        try {
            // InternalSqml.g:4362:62: (iv_ruleSqmlSubSelectVariable= ruleSqmlSubSelectVariable EOF )
            // InternalSqml.g:4363:2: iv_ruleSqmlSubSelectVariable= ruleSqmlSubSelectVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlSubSelectVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlSubSelectVariable=ruleSqmlSubSelectVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlSubSelectVariable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlSubSelectVariable"


    // $ANTLR start "ruleSqmlSubSelectVariable"
    // InternalSqml.g:4369:1: ruleSqmlSubSelectVariable returns [EObject current=null] : (otherlv_0= '(' ( (lv_subSelect_1_0= ruleSqmlSelect ) ) otherlv_2= ')' (otherlv_3= 'AS' )? ( (lv_name_4_0= RULE_ID ) ) ) ;
    public final EObject ruleSqmlSubSelectVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        EObject lv_subSelect_1_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:4375:2: ( (otherlv_0= '(' ( (lv_subSelect_1_0= ruleSqmlSelect ) ) otherlv_2= ')' (otherlv_3= 'AS' )? ( (lv_name_4_0= RULE_ID ) ) ) )
            // InternalSqml.g:4376:2: (otherlv_0= '(' ( (lv_subSelect_1_0= ruleSqmlSelect ) ) otherlv_2= ')' (otherlv_3= 'AS' )? ( (lv_name_4_0= RULE_ID ) ) )
            {
            // InternalSqml.g:4376:2: (otherlv_0= '(' ( (lv_subSelect_1_0= ruleSqmlSelect ) ) otherlv_2= ')' (otherlv_3= 'AS' )? ( (lv_name_4_0= RULE_ID ) ) )
            // InternalSqml.g:4377:3: otherlv_0= '(' ( (lv_subSelect_1_0= ruleSqmlSelect ) ) otherlv_2= ')' (otherlv_3= 'AS' )? ( (lv_name_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSqmlSubSelectVariableAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalSqml.g:4381:3: ( (lv_subSelect_1_0= ruleSqmlSelect ) )
            // InternalSqml.g:4382:4: (lv_subSelect_1_0= ruleSqmlSelect )
            {
            // InternalSqml.g:4382:4: (lv_subSelect_1_0= ruleSqmlSelect )
            // InternalSqml.g:4383:5: lv_subSelect_1_0= ruleSqmlSelect
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlSubSelectVariableAccess().getSubSelectSqmlSelectParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_56);
            lv_subSelect_1_0=ruleSqmlSelect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlSubSelectVariableRule());
              					}
              					set(
              						current,
              						"subSelect",
              						lv_subSelect_1_0,
              						"com.softicar.sqml.Sqml.SqmlSelect");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,50,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSqmlSubSelectVariableAccess().getRightParenthesisKeyword_2());
              		
            }
            // InternalSqml.g:4404:3: (otherlv_3= 'AS' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==54) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalSqml.g:4405:4: otherlv_3= 'AS'
                    {
                    otherlv_3=(Token)match(input,54,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSqmlSubSelectVariableAccess().getASKeyword_3());
                      			
                    }

                    }
                    break;

            }

            // InternalSqml.g:4410:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalSqml.g:4411:4: (lv_name_4_0= RULE_ID )
            {
            // InternalSqml.g:4411:4: (lv_name_4_0= RULE_ID )
            // InternalSqml.g:4412:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getSqmlSubSelectVariableAccess().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSqmlSubSelectVariableRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlSubSelectVariable"


    // $ANTLR start "entryRuleSqmlJoinClause"
    // InternalSqml.g:4432:1: entryRuleSqmlJoinClause returns [EObject current=null] : iv_ruleSqmlJoinClause= ruleSqmlJoinClause EOF ;
    public final EObject entryRuleSqmlJoinClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlJoinClause = null;


        try {
            // InternalSqml.g:4432:55: (iv_ruleSqmlJoinClause= ruleSqmlJoinClause EOF )
            // InternalSqml.g:4433:2: iv_ruleSqmlJoinClause= ruleSqmlJoinClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlJoinClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlJoinClause=ruleSqmlJoinClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlJoinClause; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlJoinClause"


    // $ANTLR start "ruleSqmlJoinClause"
    // InternalSqml.g:4439:1: ruleSqmlJoinClause returns [EObject current=null] : ( ( (lv_leftJoin_0_0= 'LEFT' ) )? otherlv_1= 'JOIN' ( ( (lv_variable_2_1= ruleSqmlForeignKeyVariable | lv_variable_2_2= ruleSqmlTableVariable | lv_variable_2_3= ruleSqmlSubSelectVariable ) ) ) (otherlv_3= 'ON' ( (lv_conditions_4_0= ruleSqmlExpression ) ) )* ) ;
    public final EObject ruleSqmlJoinClause() throws RecognitionException {
        EObject current = null;

        Token lv_leftJoin_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_2_1 = null;

        EObject lv_variable_2_2 = null;

        EObject lv_variable_2_3 = null;

        EObject lv_conditions_4_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:4445:2: ( ( ( (lv_leftJoin_0_0= 'LEFT' ) )? otherlv_1= 'JOIN' ( ( (lv_variable_2_1= ruleSqmlForeignKeyVariable | lv_variable_2_2= ruleSqmlTableVariable | lv_variable_2_3= ruleSqmlSubSelectVariable ) ) ) (otherlv_3= 'ON' ( (lv_conditions_4_0= ruleSqmlExpression ) ) )* ) )
            // InternalSqml.g:4446:2: ( ( (lv_leftJoin_0_0= 'LEFT' ) )? otherlv_1= 'JOIN' ( ( (lv_variable_2_1= ruleSqmlForeignKeyVariable | lv_variable_2_2= ruleSqmlTableVariable | lv_variable_2_3= ruleSqmlSubSelectVariable ) ) ) (otherlv_3= 'ON' ( (lv_conditions_4_0= ruleSqmlExpression ) ) )* )
            {
            // InternalSqml.g:4446:2: ( ( (lv_leftJoin_0_0= 'LEFT' ) )? otherlv_1= 'JOIN' ( ( (lv_variable_2_1= ruleSqmlForeignKeyVariable | lv_variable_2_2= ruleSqmlTableVariable | lv_variable_2_3= ruleSqmlSubSelectVariable ) ) ) (otherlv_3= 'ON' ( (lv_conditions_4_0= ruleSqmlExpression ) ) )* )
            // InternalSqml.g:4447:3: ( (lv_leftJoin_0_0= 'LEFT' ) )? otherlv_1= 'JOIN' ( ( (lv_variable_2_1= ruleSqmlForeignKeyVariable | lv_variable_2_2= ruleSqmlTableVariable | lv_variable_2_3= ruleSqmlSubSelectVariable ) ) ) (otherlv_3= 'ON' ( (lv_conditions_4_0= ruleSqmlExpression ) ) )*
            {
            // InternalSqml.g:4447:3: ( (lv_leftJoin_0_0= 'LEFT' ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==85) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalSqml.g:4448:4: (lv_leftJoin_0_0= 'LEFT' )
                    {
                    // InternalSqml.g:4448:4: (lv_leftJoin_0_0= 'LEFT' )
                    // InternalSqml.g:4449:5: lv_leftJoin_0_0= 'LEFT'
                    {
                    lv_leftJoin_0_0=(Token)match(input,85,FOLLOW_57); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_leftJoin_0_0, grammarAccess.getSqmlJoinClauseAccess().getLeftJoinLEFTKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlJoinClauseRule());
                      					}
                      					setWithLastConsumed(current, "leftJoin", lv_leftJoin_0_0 != null, "LEFT");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,84,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSqmlJoinClauseAccess().getJOINKeyword_1());
              		
            }
            // InternalSqml.g:4465:3: ( ( (lv_variable_2_1= ruleSqmlForeignKeyVariable | lv_variable_2_2= ruleSqmlTableVariable | lv_variable_2_3= ruleSqmlSubSelectVariable ) ) )
            // InternalSqml.g:4466:4: ( (lv_variable_2_1= ruleSqmlForeignKeyVariable | lv_variable_2_2= ruleSqmlTableVariable | lv_variable_2_3= ruleSqmlSubSelectVariable ) )
            {
            // InternalSqml.g:4466:4: ( (lv_variable_2_1= ruleSqmlForeignKeyVariable | lv_variable_2_2= ruleSqmlTableVariable | lv_variable_2_3= ruleSqmlSubSelectVariable ) )
            // InternalSqml.g:4467:5: (lv_variable_2_1= ruleSqmlForeignKeyVariable | lv_variable_2_2= ruleSqmlTableVariable | lv_variable_2_3= ruleSqmlSubSelectVariable )
            {
            // InternalSqml.g:4467:5: (lv_variable_2_1= ruleSqmlForeignKeyVariable | lv_variable_2_2= ruleSqmlTableVariable | lv_variable_2_3= ruleSqmlSubSelectVariable )
            int alt55=3;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                int LA55_1 = input.LA(2);

                if ( (LA55_1==112) ) {
                    alt55=1;
                }
                else if ( (LA55_1==RULE_ID||LA55_1==54) ) {
                    alt55=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA55_0==49) ) {
                alt55=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalSqml.g:4468:6: lv_variable_2_1= ruleSqmlForeignKeyVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSqmlJoinClauseAccess().getVariableSqmlForeignKeyVariableParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_58);
                    lv_variable_2_1=ruleSqmlForeignKeyVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSqmlJoinClauseRule());
                      						}
                      						set(
                      							current,
                      							"variable",
                      							lv_variable_2_1,
                      							"com.softicar.sqml.Sqml.SqmlForeignKeyVariable");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalSqml.g:4484:6: lv_variable_2_2= ruleSqmlTableVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSqmlJoinClauseAccess().getVariableSqmlTableVariableParserRuleCall_2_0_1());
                      					
                    }
                    pushFollow(FOLLOW_58);
                    lv_variable_2_2=ruleSqmlTableVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSqmlJoinClauseRule());
                      						}
                      						set(
                      							current,
                      							"variable",
                      							lv_variable_2_2,
                      							"com.softicar.sqml.Sqml.SqmlTableVariable");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalSqml.g:4500:6: lv_variable_2_3= ruleSqmlSubSelectVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSqmlJoinClauseAccess().getVariableSqmlSubSelectVariableParserRuleCall_2_0_2());
                      					
                    }
                    pushFollow(FOLLOW_58);
                    lv_variable_2_3=ruleSqmlSubSelectVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSqmlJoinClauseRule());
                      						}
                      						set(
                      							current,
                      							"variable",
                      							lv_variable_2_3,
                      							"com.softicar.sqml.Sqml.SqmlSubSelectVariable");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalSqml.g:4518:3: (otherlv_3= 'ON' ( (lv_conditions_4_0= ruleSqmlExpression ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==26) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalSqml.g:4519:4: otherlv_3= 'ON' ( (lv_conditions_4_0= ruleSqmlExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,26,FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getSqmlJoinClauseAccess().getONKeyword_3_0());
            	      			
            	    }
            	    // InternalSqml.g:4523:4: ( (lv_conditions_4_0= ruleSqmlExpression ) )
            	    // InternalSqml.g:4524:5: (lv_conditions_4_0= ruleSqmlExpression )
            	    {
            	    // InternalSqml.g:4524:5: (lv_conditions_4_0= ruleSqmlExpression )
            	    // InternalSqml.g:4525:6: lv_conditions_4_0= ruleSqmlExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSqmlJoinClauseAccess().getConditionsSqmlExpressionParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_58);
            	    lv_conditions_4_0=ruleSqmlExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSqmlJoinClauseRule());
            	      						}
            	      						add(
            	      							current,
            	      							"conditions",
            	      							lv_conditions_4_0,
            	      							"com.softicar.sqml.Sqml.SqmlExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlJoinClause"


    // $ANTLR start "entryRuleSqmlWhereClause"
    // InternalSqml.g:4547:1: entryRuleSqmlWhereClause returns [EObject current=null] : iv_ruleSqmlWhereClause= ruleSqmlWhereClause EOF ;
    public final EObject entryRuleSqmlWhereClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlWhereClause = null;


        try {
            // InternalSqml.g:4547:56: (iv_ruleSqmlWhereClause= ruleSqmlWhereClause EOF )
            // InternalSqml.g:4548:2: iv_ruleSqmlWhereClause= ruleSqmlWhereClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlWhereClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlWhereClause=ruleSqmlWhereClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlWhereClause; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlWhereClause"


    // $ANTLR start "ruleSqmlWhereClause"
    // InternalSqml.g:4554:1: ruleSqmlWhereClause returns [EObject current=null] : (otherlv_0= 'WHERE' ( (lv_condition_1_0= ruleSqmlExpression ) ) ) ;
    public final EObject ruleSqmlWhereClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_condition_1_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:4560:2: ( (otherlv_0= 'WHERE' ( (lv_condition_1_0= ruleSqmlExpression ) ) ) )
            // InternalSqml.g:4561:2: (otherlv_0= 'WHERE' ( (lv_condition_1_0= ruleSqmlExpression ) ) )
            {
            // InternalSqml.g:4561:2: (otherlv_0= 'WHERE' ( (lv_condition_1_0= ruleSqmlExpression ) ) )
            // InternalSqml.g:4562:3: otherlv_0= 'WHERE' ( (lv_condition_1_0= ruleSqmlExpression ) )
            {
            otherlv_0=(Token)match(input,103,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSqmlWhereClauseAccess().getWHEREKeyword_0());
              		
            }
            // InternalSqml.g:4566:3: ( (lv_condition_1_0= ruleSqmlExpression ) )
            // InternalSqml.g:4567:4: (lv_condition_1_0= ruleSqmlExpression )
            {
            // InternalSqml.g:4567:4: (lv_condition_1_0= ruleSqmlExpression )
            // InternalSqml.g:4568:5: lv_condition_1_0= ruleSqmlExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlWhereClauseAccess().getConditionSqmlExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_condition_1_0=ruleSqmlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlWhereClauseRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_1_0,
              						"com.softicar.sqml.Sqml.SqmlExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlWhereClause"


    // $ANTLR start "entryRuleSqmlGroupByClause"
    // InternalSqml.g:4589:1: entryRuleSqmlGroupByClause returns [EObject current=null] : iv_ruleSqmlGroupByClause= ruleSqmlGroupByClause EOF ;
    public final EObject entryRuleSqmlGroupByClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlGroupByClause = null;


        try {
            // InternalSqml.g:4589:58: (iv_ruleSqmlGroupByClause= ruleSqmlGroupByClause EOF )
            // InternalSqml.g:4590:2: iv_ruleSqmlGroupByClause= ruleSqmlGroupByClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlGroupByClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlGroupByClause=ruleSqmlGroupByClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlGroupByClause; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlGroupByClause"


    // $ANTLR start "ruleSqmlGroupByClause"
    // InternalSqml.g:4596:1: ruleSqmlGroupByClause returns [EObject current=null] : (otherlv_0= 'GROUP' otherlv_1= 'BY' ( (lv_expressions_2_0= ruleSqmlExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleSqmlExpression ) ) )* ) ;
    public final EObject ruleSqmlGroupByClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;

        EObject lv_expressions_4_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:4602:2: ( (otherlv_0= 'GROUP' otherlv_1= 'BY' ( (lv_expressions_2_0= ruleSqmlExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleSqmlExpression ) ) )* ) )
            // InternalSqml.g:4603:2: (otherlv_0= 'GROUP' otherlv_1= 'BY' ( (lv_expressions_2_0= ruleSqmlExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleSqmlExpression ) ) )* )
            {
            // InternalSqml.g:4603:2: (otherlv_0= 'GROUP' otherlv_1= 'BY' ( (lv_expressions_2_0= ruleSqmlExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleSqmlExpression ) ) )* )
            // InternalSqml.g:4604:3: otherlv_0= 'GROUP' otherlv_1= 'BY' ( (lv_expressions_2_0= ruleSqmlExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleSqmlExpression ) ) )*
            {
            otherlv_0=(Token)match(input,77,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSqmlGroupByClauseAccess().getGROUPKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,63,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSqmlGroupByClauseAccess().getBYKeyword_1());
              		
            }
            // InternalSqml.g:4612:3: ( (lv_expressions_2_0= ruleSqmlExpression ) )
            // InternalSqml.g:4613:4: (lv_expressions_2_0= ruleSqmlExpression )
            {
            // InternalSqml.g:4613:4: (lv_expressions_2_0= ruleSqmlExpression )
            // InternalSqml.g:4614:5: lv_expressions_2_0= ruleSqmlExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlGroupByClauseAccess().getExpressionsSqmlExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_50);
            lv_expressions_2_0=ruleSqmlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlGroupByClauseRule());
              					}
              					add(
              						current,
              						"expressions",
              						lv_expressions_2_0,
              						"com.softicar.sqml.Sqml.SqmlExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSqml.g:4631:3: (otherlv_3= ',' ( (lv_expressions_4_0= ruleSqmlExpression ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==18) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalSqml.g:4632:4: otherlv_3= ',' ( (lv_expressions_4_0= ruleSqmlExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getSqmlGroupByClauseAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalSqml.g:4636:4: ( (lv_expressions_4_0= ruleSqmlExpression ) )
            	    // InternalSqml.g:4637:5: (lv_expressions_4_0= ruleSqmlExpression )
            	    {
            	    // InternalSqml.g:4637:5: (lv_expressions_4_0= ruleSqmlExpression )
            	    // InternalSqml.g:4638:6: lv_expressions_4_0= ruleSqmlExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSqmlGroupByClauseAccess().getExpressionsSqmlExpressionParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_50);
            	    lv_expressions_4_0=ruleSqmlExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSqmlGroupByClauseRule());
            	      						}
            	      						add(
            	      							current,
            	      							"expressions",
            	      							lv_expressions_4_0,
            	      							"com.softicar.sqml.Sqml.SqmlExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlGroupByClause"


    // $ANTLR start "entryRuleSqmlHavingClause"
    // InternalSqml.g:4660:1: entryRuleSqmlHavingClause returns [EObject current=null] : iv_ruleSqmlHavingClause= ruleSqmlHavingClause EOF ;
    public final EObject entryRuleSqmlHavingClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlHavingClause = null;


        try {
            // InternalSqml.g:4660:57: (iv_ruleSqmlHavingClause= ruleSqmlHavingClause EOF )
            // InternalSqml.g:4661:2: iv_ruleSqmlHavingClause= ruleSqmlHavingClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlHavingClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlHavingClause=ruleSqmlHavingClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlHavingClause; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlHavingClause"


    // $ANTLR start "ruleSqmlHavingClause"
    // InternalSqml.g:4667:1: ruleSqmlHavingClause returns [EObject current=null] : (otherlv_0= 'HAVING' ( (lv_condition_1_0= ruleSqmlExpression ) ) ) ;
    public final EObject ruleSqmlHavingClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_condition_1_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:4673:2: ( (otherlv_0= 'HAVING' ( (lv_condition_1_0= ruleSqmlExpression ) ) ) )
            // InternalSqml.g:4674:2: (otherlv_0= 'HAVING' ( (lv_condition_1_0= ruleSqmlExpression ) ) )
            {
            // InternalSqml.g:4674:2: (otherlv_0= 'HAVING' ( (lv_condition_1_0= ruleSqmlExpression ) ) )
            // InternalSqml.g:4675:3: otherlv_0= 'HAVING' ( (lv_condition_1_0= ruleSqmlExpression ) )
            {
            otherlv_0=(Token)match(input,79,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSqmlHavingClauseAccess().getHAVINGKeyword_0());
              		
            }
            // InternalSqml.g:4679:3: ( (lv_condition_1_0= ruleSqmlExpression ) )
            // InternalSqml.g:4680:4: (lv_condition_1_0= ruleSqmlExpression )
            {
            // InternalSqml.g:4680:4: (lv_condition_1_0= ruleSqmlExpression )
            // InternalSqml.g:4681:5: lv_condition_1_0= ruleSqmlExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlHavingClauseAccess().getConditionSqmlExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_condition_1_0=ruleSqmlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlHavingClauseRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_1_0,
              						"com.softicar.sqml.Sqml.SqmlExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlHavingClause"


    // $ANTLR start "entryRuleSqmlOrderByClause"
    // InternalSqml.g:4702:1: entryRuleSqmlOrderByClause returns [EObject current=null] : iv_ruleSqmlOrderByClause= ruleSqmlOrderByClause EOF ;
    public final EObject entryRuleSqmlOrderByClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlOrderByClause = null;


        try {
            // InternalSqml.g:4702:58: (iv_ruleSqmlOrderByClause= ruleSqmlOrderByClause EOF )
            // InternalSqml.g:4703:2: iv_ruleSqmlOrderByClause= ruleSqmlOrderByClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlOrderByClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlOrderByClause=ruleSqmlOrderByClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlOrderByClause; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlOrderByClause"


    // $ANTLR start "ruleSqmlOrderByClause"
    // InternalSqml.g:4709:1: ruleSqmlOrderByClause returns [EObject current=null] : (otherlv_0= 'ORDER' otherlv_1= 'BY' ( (lv_expressions_2_0= ruleSqmlOrderByExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleSqmlOrderByExpression ) ) )* ) ;
    public final EObject ruleSqmlOrderByClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;

        EObject lv_expressions_4_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:4715:2: ( (otherlv_0= 'ORDER' otherlv_1= 'BY' ( (lv_expressions_2_0= ruleSqmlOrderByExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleSqmlOrderByExpression ) ) )* ) )
            // InternalSqml.g:4716:2: (otherlv_0= 'ORDER' otherlv_1= 'BY' ( (lv_expressions_2_0= ruleSqmlOrderByExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleSqmlOrderByExpression ) ) )* )
            {
            // InternalSqml.g:4716:2: (otherlv_0= 'ORDER' otherlv_1= 'BY' ( (lv_expressions_2_0= ruleSqmlOrderByExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleSqmlOrderByExpression ) ) )* )
            // InternalSqml.g:4717:3: otherlv_0= 'ORDER' otherlv_1= 'BY' ( (lv_expressions_2_0= ruleSqmlOrderByExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleSqmlOrderByExpression ) ) )*
            {
            otherlv_0=(Token)match(input,91,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSqmlOrderByClauseAccess().getORDERKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,63,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSqmlOrderByClauseAccess().getBYKeyword_1());
              		
            }
            // InternalSqml.g:4725:3: ( (lv_expressions_2_0= ruleSqmlOrderByExpression ) )
            // InternalSqml.g:4726:4: (lv_expressions_2_0= ruleSqmlOrderByExpression )
            {
            // InternalSqml.g:4726:4: (lv_expressions_2_0= ruleSqmlOrderByExpression )
            // InternalSqml.g:4727:5: lv_expressions_2_0= ruleSqmlOrderByExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlOrderByClauseAccess().getExpressionsSqmlOrderByExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_50);
            lv_expressions_2_0=ruleSqmlOrderByExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlOrderByClauseRule());
              					}
              					add(
              						current,
              						"expressions",
              						lv_expressions_2_0,
              						"com.softicar.sqml.Sqml.SqmlOrderByExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSqml.g:4744:3: (otherlv_3= ',' ( (lv_expressions_4_0= ruleSqmlOrderByExpression ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==18) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalSqml.g:4745:4: otherlv_3= ',' ( (lv_expressions_4_0= ruleSqmlOrderByExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getSqmlOrderByClauseAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalSqml.g:4749:4: ( (lv_expressions_4_0= ruleSqmlOrderByExpression ) )
            	    // InternalSqml.g:4750:5: (lv_expressions_4_0= ruleSqmlOrderByExpression )
            	    {
            	    // InternalSqml.g:4750:5: (lv_expressions_4_0= ruleSqmlOrderByExpression )
            	    // InternalSqml.g:4751:6: lv_expressions_4_0= ruleSqmlOrderByExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSqmlOrderByClauseAccess().getExpressionsSqmlOrderByExpressionParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_50);
            	    lv_expressions_4_0=ruleSqmlOrderByExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSqmlOrderByClauseRule());
            	      						}
            	      						add(
            	      							current,
            	      							"expressions",
            	      							lv_expressions_4_0,
            	      							"com.softicar.sqml.Sqml.SqmlOrderByExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlOrderByClause"


    // $ANTLR start "entryRuleSqmlOrderByExpression"
    // InternalSqml.g:4773:1: entryRuleSqmlOrderByExpression returns [EObject current=null] : iv_ruleSqmlOrderByExpression= ruleSqmlOrderByExpression EOF ;
    public final EObject entryRuleSqmlOrderByExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlOrderByExpression = null;


        try {
            // InternalSqml.g:4773:62: (iv_ruleSqmlOrderByExpression= ruleSqmlOrderByExpression EOF )
            // InternalSqml.g:4774:2: iv_ruleSqmlOrderByExpression= ruleSqmlOrderByExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlOrderByExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlOrderByExpression=ruleSqmlOrderByExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlOrderByExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlOrderByExpression"


    // $ANTLR start "ruleSqmlOrderByExpression"
    // InternalSqml.g:4780:1: ruleSqmlOrderByExpression returns [EObject current=null] : ( ( (lv_expression_0_0= ruleSqmlExpression ) ) (otherlv_1= 'ASC' | ( (lv_descending_2_0= 'DESC' ) ) )? ) ;
    public final EObject ruleSqmlOrderByExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_descending_2_0=null;
        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:4786:2: ( ( ( (lv_expression_0_0= ruleSqmlExpression ) ) (otherlv_1= 'ASC' | ( (lv_descending_2_0= 'DESC' ) ) )? ) )
            // InternalSqml.g:4787:2: ( ( (lv_expression_0_0= ruleSqmlExpression ) ) (otherlv_1= 'ASC' | ( (lv_descending_2_0= 'DESC' ) ) )? )
            {
            // InternalSqml.g:4787:2: ( ( (lv_expression_0_0= ruleSqmlExpression ) ) (otherlv_1= 'ASC' | ( (lv_descending_2_0= 'DESC' ) ) )? )
            // InternalSqml.g:4788:3: ( (lv_expression_0_0= ruleSqmlExpression ) ) (otherlv_1= 'ASC' | ( (lv_descending_2_0= 'DESC' ) ) )?
            {
            // InternalSqml.g:4788:3: ( (lv_expression_0_0= ruleSqmlExpression ) )
            // InternalSqml.g:4789:4: (lv_expression_0_0= ruleSqmlExpression )
            {
            // InternalSqml.g:4789:4: (lv_expression_0_0= ruleSqmlExpression )
            // InternalSqml.g:4790:5: lv_expression_0_0= ruleSqmlExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlOrderByExpressionAccess().getExpressionSqmlExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_61);
            lv_expression_0_0=ruleSqmlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlOrderByExpressionRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_0_0,
              						"com.softicar.sqml.Sqml.SqmlExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSqml.g:4807:3: (otherlv_1= 'ASC' | ( (lv_descending_2_0= 'DESC' ) ) )?
            int alt59=3;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==61) ) {
                alt59=1;
            }
            else if ( (LA59_0==67) ) {
                alt59=2;
            }
            switch (alt59) {
                case 1 :
                    // InternalSqml.g:4808:4: otherlv_1= 'ASC'
                    {
                    otherlv_1=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSqmlOrderByExpressionAccess().getASCKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSqml.g:4813:4: ( (lv_descending_2_0= 'DESC' ) )
                    {
                    // InternalSqml.g:4813:4: ( (lv_descending_2_0= 'DESC' ) )
                    // InternalSqml.g:4814:5: (lv_descending_2_0= 'DESC' )
                    {
                    // InternalSqml.g:4814:5: (lv_descending_2_0= 'DESC' )
                    // InternalSqml.g:4815:6: lv_descending_2_0= 'DESC'
                    {
                    lv_descending_2_0=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_descending_2_0, grammarAccess.getSqmlOrderByExpressionAccess().getDescendingDESCKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSqmlOrderByExpressionRule());
                      						}
                      						setWithLastConsumed(current, "descending", lv_descending_2_0 != null, "DESC");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlOrderByExpression"


    // $ANTLR start "entryRuleSqmlExpression"
    // InternalSqml.g:4832:1: entryRuleSqmlExpression returns [EObject current=null] : iv_ruleSqmlExpression= ruleSqmlExpression EOF ;
    public final EObject entryRuleSqmlExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlExpression = null;


        try {
            // InternalSqml.g:4832:55: (iv_ruleSqmlExpression= ruleSqmlExpression EOF )
            // InternalSqml.g:4833:2: iv_ruleSqmlExpression= ruleSqmlExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlExpression=ruleSqmlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlExpression"


    // $ANTLR start "ruleSqmlExpression"
    // InternalSqml.g:4839:1: ruleSqmlExpression returns [EObject current=null] : this_SqmlOr_0= ruleSqmlOr ;
    public final EObject ruleSqmlExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SqmlOr_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:4845:2: (this_SqmlOr_0= ruleSqmlOr )
            // InternalSqml.g:4846:2: this_SqmlOr_0= ruleSqmlOr
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getSqmlExpressionAccess().getSqmlOrParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_SqmlOr_0=ruleSqmlOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_SqmlOr_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlExpression"


    // $ANTLR start "entryRuleSqmlOr"
    // InternalSqml.g:4857:1: entryRuleSqmlOr returns [EObject current=null] : iv_ruleSqmlOr= ruleSqmlOr EOF ;
    public final EObject entryRuleSqmlOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlOr = null;


        try {
            // InternalSqml.g:4857:47: (iv_ruleSqmlOr= ruleSqmlOr EOF )
            // InternalSqml.g:4858:2: iv_ruleSqmlOr= ruleSqmlOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlOr=ruleSqmlOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlOr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlOr"


    // $ANTLR start "ruleSqmlOr"
    // InternalSqml.g:4864:1: ruleSqmlOr returns [EObject current=null] : (this_SqmlAnd_0= ruleSqmlAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleSqmlAnd ) ) )* ) ;
    public final EObject ruleSqmlOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_SqmlAnd_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:4870:2: ( (this_SqmlAnd_0= ruleSqmlAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleSqmlAnd ) ) )* ) )
            // InternalSqml.g:4871:2: (this_SqmlAnd_0= ruleSqmlAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleSqmlAnd ) ) )* )
            {
            // InternalSqml.g:4871:2: (this_SqmlAnd_0= ruleSqmlAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleSqmlAnd ) ) )* )
            // InternalSqml.g:4872:3: this_SqmlAnd_0= ruleSqmlAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleSqmlAnd ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSqmlOrAccess().getSqmlAndParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_62);
            this_SqmlAnd_0=ruleSqmlAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SqmlAnd_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSqml.g:4880:3: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleSqmlAnd ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==90) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalSqml.g:4881:4: () otherlv_2= 'OR' ( (lv_right_3_0= ruleSqmlAnd ) )
            	    {
            	    // InternalSqml.g:4881:4: ()
            	    // InternalSqml.g:4882:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getSqmlOrAccess().getSqmlOrLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,90,FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSqmlOrAccess().getORKeyword_1_1());
            	      			
            	    }
            	    // InternalSqml.g:4892:4: ( (lv_right_3_0= ruleSqmlAnd ) )
            	    // InternalSqml.g:4893:5: (lv_right_3_0= ruleSqmlAnd )
            	    {
            	    // InternalSqml.g:4893:5: (lv_right_3_0= ruleSqmlAnd )
            	    // InternalSqml.g:4894:6: lv_right_3_0= ruleSqmlAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSqmlOrAccess().getRightSqmlAndParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_62);
            	    lv_right_3_0=ruleSqmlAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSqmlOrRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"com.softicar.sqml.Sqml.SqmlAnd");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlOr"


    // $ANTLR start "entryRuleSqmlAnd"
    // InternalSqml.g:4916:1: entryRuleSqmlAnd returns [EObject current=null] : iv_ruleSqmlAnd= ruleSqmlAnd EOF ;
    public final EObject entryRuleSqmlAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlAnd = null;


        try {
            // InternalSqml.g:4916:48: (iv_ruleSqmlAnd= ruleSqmlAnd EOF )
            // InternalSqml.g:4917:2: iv_ruleSqmlAnd= ruleSqmlAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlAnd=ruleSqmlAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlAnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlAnd"


    // $ANTLR start "ruleSqmlAnd"
    // InternalSqml.g:4923:1: ruleSqmlAnd returns [EObject current=null] : (this_SqmlCondition_0= ruleSqmlCondition ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleSqmlCondition ) ) )* ) ;
    public final EObject ruleSqmlAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_SqmlCondition_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:4929:2: ( (this_SqmlCondition_0= ruleSqmlCondition ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleSqmlCondition ) ) )* ) )
            // InternalSqml.g:4930:2: (this_SqmlCondition_0= ruleSqmlCondition ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleSqmlCondition ) ) )* )
            {
            // InternalSqml.g:4930:2: (this_SqmlCondition_0= ruleSqmlCondition ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleSqmlCondition ) ) )* )
            // InternalSqml.g:4931:3: this_SqmlCondition_0= ruleSqmlCondition ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleSqmlCondition ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSqmlAndAccess().getSqmlConditionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_63);
            this_SqmlCondition_0=ruleSqmlCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SqmlCondition_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSqml.g:4939:3: ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleSqmlCondition ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==60) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalSqml.g:4940:4: () otherlv_2= 'AND' ( (lv_right_3_0= ruleSqmlCondition ) )
            	    {
            	    // InternalSqml.g:4940:4: ()
            	    // InternalSqml.g:4941:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getSqmlAndAccess().getSqmlAndLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,60,FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSqmlAndAccess().getANDKeyword_1_1());
            	      			
            	    }
            	    // InternalSqml.g:4951:4: ( (lv_right_3_0= ruleSqmlCondition ) )
            	    // InternalSqml.g:4952:5: (lv_right_3_0= ruleSqmlCondition )
            	    {
            	    // InternalSqml.g:4952:5: (lv_right_3_0= ruleSqmlCondition )
            	    // InternalSqml.g:4953:6: lv_right_3_0= ruleSqmlCondition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSqmlAndAccess().getRightSqmlConditionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_63);
            	    lv_right_3_0=ruleSqmlCondition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSqmlAndRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"com.softicar.sqml.Sqml.SqmlCondition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlAnd"


    // $ANTLR start "entryRuleSqmlCondition"
    // InternalSqml.g:4975:1: entryRuleSqmlCondition returns [EObject current=null] : iv_ruleSqmlCondition= ruleSqmlCondition EOF ;
    public final EObject entryRuleSqmlCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlCondition = null;


        try {
            // InternalSqml.g:4975:54: (iv_ruleSqmlCondition= ruleSqmlCondition EOF )
            // InternalSqml.g:4976:2: iv_ruleSqmlCondition= ruleSqmlCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlCondition=ruleSqmlCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlCondition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlCondition"


    // $ANTLR start "ruleSqmlCondition"
    // InternalSqml.g:4982:1: ruleSqmlCondition returns [EObject current=null] : ( ( () otherlv_1= 'NOT' ( (lv_condition_2_0= ruleSqmlCondition ) ) ) | ( () otherlv_4= 'EXISTS' ( (lv_subSelect_5_0= ruleSqmlSubSelect ) ) ) | (this_SqmlOperand_6= ruleSqmlOperand ( ( () ( ( ruleSqmlComparisonOperator ) ) ( (lv_right_9_0= ruleSqmlOperand ) ) ) | ( () ( (lv_not_11_0= 'NOT' ) )? otherlv_12= 'LIKE' ( (lv_right_13_0= ruleSqmlOperand ) ) (otherlv_14= 'ESCAPE' ( (lv_escape_15_0= RULE_STRING ) ) )? ) | ( () otherlv_17= 'IS' ( (lv_not_18_0= 'NOT' ) )? otherlv_19= 'NULL' ) | ( () otherlv_21= 'BETWEEN' ( (lv_left_22_0= ruleSqmlOperand ) ) otherlv_23= 'AND' ( (lv_right_24_0= ruleSqmlOperand ) ) ) | ( () ( (lv_not_26_0= 'NOT' ) )? otherlv_27= 'IN' ( ( (lv_right_28_1= ruleSqmlStaticVariableReference | lv_right_28_2= ruleSqmlSubSelect | lv_right_28_3= ruleSqmlRowConstructor ) ) ) ) | ( () ( (lv_not_30_0= 'NOT' ) )? otherlv_31= 'REGEXP' ( (lv_regexp_32_0= ruleSqmlOperand ) ) ) )? ) ) ;
    public final EObject ruleSqmlCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token lv_not_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_escape_15_0=null;
        Token otherlv_17=null;
        Token lv_not_18_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token lv_not_26_0=null;
        Token otherlv_27=null;
        Token lv_not_30_0=null;
        Token otherlv_31=null;
        EObject lv_condition_2_0 = null;

        EObject lv_subSelect_5_0 = null;

        EObject this_SqmlOperand_6 = null;

        EObject lv_right_9_0 = null;

        EObject lv_right_13_0 = null;

        EObject lv_left_22_0 = null;

        EObject lv_right_24_0 = null;

        EObject lv_right_28_1 = null;

        EObject lv_right_28_2 = null;

        EObject lv_right_28_3 = null;

        EObject lv_regexp_32_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:4988:2: ( ( ( () otherlv_1= 'NOT' ( (lv_condition_2_0= ruleSqmlCondition ) ) ) | ( () otherlv_4= 'EXISTS' ( (lv_subSelect_5_0= ruleSqmlSubSelect ) ) ) | (this_SqmlOperand_6= ruleSqmlOperand ( ( () ( ( ruleSqmlComparisonOperator ) ) ( (lv_right_9_0= ruleSqmlOperand ) ) ) | ( () ( (lv_not_11_0= 'NOT' ) )? otherlv_12= 'LIKE' ( (lv_right_13_0= ruleSqmlOperand ) ) (otherlv_14= 'ESCAPE' ( (lv_escape_15_0= RULE_STRING ) ) )? ) | ( () otherlv_17= 'IS' ( (lv_not_18_0= 'NOT' ) )? otherlv_19= 'NULL' ) | ( () otherlv_21= 'BETWEEN' ( (lv_left_22_0= ruleSqmlOperand ) ) otherlv_23= 'AND' ( (lv_right_24_0= ruleSqmlOperand ) ) ) | ( () ( (lv_not_26_0= 'NOT' ) )? otherlv_27= 'IN' ( ( (lv_right_28_1= ruleSqmlStaticVariableReference | lv_right_28_2= ruleSqmlSubSelect | lv_right_28_3= ruleSqmlRowConstructor ) ) ) ) | ( () ( (lv_not_30_0= 'NOT' ) )? otherlv_31= 'REGEXP' ( (lv_regexp_32_0= ruleSqmlOperand ) ) ) )? ) ) )
            // InternalSqml.g:4989:2: ( ( () otherlv_1= 'NOT' ( (lv_condition_2_0= ruleSqmlCondition ) ) ) | ( () otherlv_4= 'EXISTS' ( (lv_subSelect_5_0= ruleSqmlSubSelect ) ) ) | (this_SqmlOperand_6= ruleSqmlOperand ( ( () ( ( ruleSqmlComparisonOperator ) ) ( (lv_right_9_0= ruleSqmlOperand ) ) ) | ( () ( (lv_not_11_0= 'NOT' ) )? otherlv_12= 'LIKE' ( (lv_right_13_0= ruleSqmlOperand ) ) (otherlv_14= 'ESCAPE' ( (lv_escape_15_0= RULE_STRING ) ) )? ) | ( () otherlv_17= 'IS' ( (lv_not_18_0= 'NOT' ) )? otherlv_19= 'NULL' ) | ( () otherlv_21= 'BETWEEN' ( (lv_left_22_0= ruleSqmlOperand ) ) otherlv_23= 'AND' ( (lv_right_24_0= ruleSqmlOperand ) ) ) | ( () ( (lv_not_26_0= 'NOT' ) )? otherlv_27= 'IN' ( ( (lv_right_28_1= ruleSqmlStaticVariableReference | lv_right_28_2= ruleSqmlSubSelect | lv_right_28_3= ruleSqmlRowConstructor ) ) ) ) | ( () ( (lv_not_30_0= 'NOT' ) )? otherlv_31= 'REGEXP' ( (lv_regexp_32_0= ruleSqmlOperand ) ) ) )? ) )
            {
            // InternalSqml.g:4989:2: ( ( () otherlv_1= 'NOT' ( (lv_condition_2_0= ruleSqmlCondition ) ) ) | ( () otherlv_4= 'EXISTS' ( (lv_subSelect_5_0= ruleSqmlSubSelect ) ) ) | (this_SqmlOperand_6= ruleSqmlOperand ( ( () ( ( ruleSqmlComparisonOperator ) ) ( (lv_right_9_0= ruleSqmlOperand ) ) ) | ( () ( (lv_not_11_0= 'NOT' ) )? otherlv_12= 'LIKE' ( (lv_right_13_0= ruleSqmlOperand ) ) (otherlv_14= 'ESCAPE' ( (lv_escape_15_0= RULE_STRING ) ) )? ) | ( () otherlv_17= 'IS' ( (lv_not_18_0= 'NOT' ) )? otherlv_19= 'NULL' ) | ( () otherlv_21= 'BETWEEN' ( (lv_left_22_0= ruleSqmlOperand ) ) otherlv_23= 'AND' ( (lv_right_24_0= ruleSqmlOperand ) ) ) | ( () ( (lv_not_26_0= 'NOT' ) )? otherlv_27= 'IN' ( ( (lv_right_28_1= ruleSqmlStaticVariableReference | lv_right_28_2= ruleSqmlSubSelect | lv_right_28_3= ruleSqmlRowConstructor ) ) ) ) | ( () ( (lv_not_30_0= 'NOT' ) )? otherlv_31= 'REGEXP' ( (lv_regexp_32_0= ruleSqmlOperand ) ) ) )? ) )
            int alt69=3;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt69=1;
                }
                break;
            case 73:
                {
                alt69=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case RULE_DECIMAL:
            case RULE_LONG:
            case RULE_FLOAT:
            case RULE_DOUBLE:
            case 48:
            case 49:
            case 51:
            case 65:
            case 74:
            case 78:
            case 80:
            case 81:
            case 87:
            case 98:
            case 101:
            case 118:
                {
                alt69=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // InternalSqml.g:4990:3: ( () otherlv_1= 'NOT' ( (lv_condition_2_0= ruleSqmlCondition ) ) )
                    {
                    // InternalSqml.g:4990:3: ( () otherlv_1= 'NOT' ( (lv_condition_2_0= ruleSqmlCondition ) ) )
                    // InternalSqml.g:4991:4: () otherlv_1= 'NOT' ( (lv_condition_2_0= ruleSqmlCondition ) )
                    {
                    // InternalSqml.g:4991:4: ()
                    // InternalSqml.g:4992:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSqmlConditionAccess().getSqmlNotAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,89,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSqmlConditionAccess().getNOTKeyword_0_1());
                      			
                    }
                    // InternalSqml.g:5002:4: ( (lv_condition_2_0= ruleSqmlCondition ) )
                    // InternalSqml.g:5003:5: (lv_condition_2_0= ruleSqmlCondition )
                    {
                    // InternalSqml.g:5003:5: (lv_condition_2_0= ruleSqmlCondition )
                    // InternalSqml.g:5004:6: lv_condition_2_0= ruleSqmlCondition
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSqmlConditionAccess().getConditionSqmlConditionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_condition_2_0=ruleSqmlCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSqmlConditionRule());
                      						}
                      						set(
                      							current,
                      							"condition",
                      							lv_condition_2_0,
                      							"com.softicar.sqml.Sqml.SqmlCondition");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSqml.g:5023:3: ( () otherlv_4= 'EXISTS' ( (lv_subSelect_5_0= ruleSqmlSubSelect ) ) )
                    {
                    // InternalSqml.g:5023:3: ( () otherlv_4= 'EXISTS' ( (lv_subSelect_5_0= ruleSqmlSubSelect ) ) )
                    // InternalSqml.g:5024:4: () otherlv_4= 'EXISTS' ( (lv_subSelect_5_0= ruleSqmlSubSelect ) )
                    {
                    // InternalSqml.g:5024:4: ()
                    // InternalSqml.g:5025:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSqmlConditionAccess().getSqmlExistsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_4=(Token)match(input,73,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getSqmlConditionAccess().getEXISTSKeyword_1_1());
                      			
                    }
                    // InternalSqml.g:5035:4: ( (lv_subSelect_5_0= ruleSqmlSubSelect ) )
                    // InternalSqml.g:5036:5: (lv_subSelect_5_0= ruleSqmlSubSelect )
                    {
                    // InternalSqml.g:5036:5: (lv_subSelect_5_0= ruleSqmlSubSelect )
                    // InternalSqml.g:5037:6: lv_subSelect_5_0= ruleSqmlSubSelect
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSqmlConditionAccess().getSubSelectSqmlSubSelectParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_subSelect_5_0=ruleSqmlSubSelect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSqmlConditionRule());
                      						}
                      						set(
                      							current,
                      							"subSelect",
                      							lv_subSelect_5_0,
                      							"com.softicar.sqml.Sqml.SqmlSubSelect");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSqml.g:5056:3: (this_SqmlOperand_6= ruleSqmlOperand ( ( () ( ( ruleSqmlComparisonOperator ) ) ( (lv_right_9_0= ruleSqmlOperand ) ) ) | ( () ( (lv_not_11_0= 'NOT' ) )? otherlv_12= 'LIKE' ( (lv_right_13_0= ruleSqmlOperand ) ) (otherlv_14= 'ESCAPE' ( (lv_escape_15_0= RULE_STRING ) ) )? ) | ( () otherlv_17= 'IS' ( (lv_not_18_0= 'NOT' ) )? otherlv_19= 'NULL' ) | ( () otherlv_21= 'BETWEEN' ( (lv_left_22_0= ruleSqmlOperand ) ) otherlv_23= 'AND' ( (lv_right_24_0= ruleSqmlOperand ) ) ) | ( () ( (lv_not_26_0= 'NOT' ) )? otherlv_27= 'IN' ( ( (lv_right_28_1= ruleSqmlStaticVariableReference | lv_right_28_2= ruleSqmlSubSelect | lv_right_28_3= ruleSqmlRowConstructor ) ) ) ) | ( () ( (lv_not_30_0= 'NOT' ) )? otherlv_31= 'REGEXP' ( (lv_regexp_32_0= ruleSqmlOperand ) ) ) )? )
                    {
                    // InternalSqml.g:5056:3: (this_SqmlOperand_6= ruleSqmlOperand ( ( () ( ( ruleSqmlComparisonOperator ) ) ( (lv_right_9_0= ruleSqmlOperand ) ) ) | ( () ( (lv_not_11_0= 'NOT' ) )? otherlv_12= 'LIKE' ( (lv_right_13_0= ruleSqmlOperand ) ) (otherlv_14= 'ESCAPE' ( (lv_escape_15_0= RULE_STRING ) ) )? ) | ( () otherlv_17= 'IS' ( (lv_not_18_0= 'NOT' ) )? otherlv_19= 'NULL' ) | ( () otherlv_21= 'BETWEEN' ( (lv_left_22_0= ruleSqmlOperand ) ) otherlv_23= 'AND' ( (lv_right_24_0= ruleSqmlOperand ) ) ) | ( () ( (lv_not_26_0= 'NOT' ) )? otherlv_27= 'IN' ( ( (lv_right_28_1= ruleSqmlStaticVariableReference | lv_right_28_2= ruleSqmlSubSelect | lv_right_28_3= ruleSqmlRowConstructor ) ) ) ) | ( () ( (lv_not_30_0= 'NOT' ) )? otherlv_31= 'REGEXP' ( (lv_regexp_32_0= ruleSqmlOperand ) ) ) )? )
                    // InternalSqml.g:5057:4: this_SqmlOperand_6= ruleSqmlOperand ( ( () ( ( ruleSqmlComparisonOperator ) ) ( (lv_right_9_0= ruleSqmlOperand ) ) ) | ( () ( (lv_not_11_0= 'NOT' ) )? otherlv_12= 'LIKE' ( (lv_right_13_0= ruleSqmlOperand ) ) (otherlv_14= 'ESCAPE' ( (lv_escape_15_0= RULE_STRING ) ) )? ) | ( () otherlv_17= 'IS' ( (lv_not_18_0= 'NOT' ) )? otherlv_19= 'NULL' ) | ( () otherlv_21= 'BETWEEN' ( (lv_left_22_0= ruleSqmlOperand ) ) otherlv_23= 'AND' ( (lv_right_24_0= ruleSqmlOperand ) ) ) | ( () ( (lv_not_26_0= 'NOT' ) )? otherlv_27= 'IN' ( ( (lv_right_28_1= ruleSqmlStaticVariableReference | lv_right_28_2= ruleSqmlSubSelect | lv_right_28_3= ruleSqmlRowConstructor ) ) ) ) | ( () ( (lv_not_30_0= 'NOT' ) )? otherlv_31= 'REGEXP' ( (lv_regexp_32_0= ruleSqmlOperand ) ) ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSqmlConditionAccess().getSqmlOperandParserRuleCall_2_0());
                      			
                    }
                    pushFollow(FOLLOW_64);
                    this_SqmlOperand_6=ruleSqmlOperand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_SqmlOperand_6;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalSqml.g:5065:4: ( ( () ( ( ruleSqmlComparisonOperator ) ) ( (lv_right_9_0= ruleSqmlOperand ) ) ) | ( () ( (lv_not_11_0= 'NOT' ) )? otherlv_12= 'LIKE' ( (lv_right_13_0= ruleSqmlOperand ) ) (otherlv_14= 'ESCAPE' ( (lv_escape_15_0= RULE_STRING ) ) )? ) | ( () otherlv_17= 'IS' ( (lv_not_18_0= 'NOT' ) )? otherlv_19= 'NULL' ) | ( () otherlv_21= 'BETWEEN' ( (lv_left_22_0= ruleSqmlOperand ) ) otherlv_23= 'AND' ( (lv_right_24_0= ruleSqmlOperand ) ) ) | ( () ( (lv_not_26_0= 'NOT' ) )? otherlv_27= 'IN' ( ( (lv_right_28_1= ruleSqmlStaticVariableReference | lv_right_28_2= ruleSqmlSubSelect | lv_right_28_3= ruleSqmlRowConstructor ) ) ) ) | ( () ( (lv_not_30_0= 'NOT' ) )? otherlv_31= 'REGEXP' ( (lv_regexp_32_0= ruleSqmlOperand ) ) ) )?
                    int alt68=7;
                    switch ( input.LA(1) ) {
                        case 17:
                        case 19:
                        case 27:
                        case 114:
                        case 115:
                        case 116:
                            {
                            alt68=1;
                            }
                            break;
                        case 89:
                            {
                            switch ( input.LA(2) ) {
                                case 86:
                                    {
                                    alt68=2;
                                    }
                                    break;
                                case 82:
                                    {
                                    alt68=5;
                                    }
                                    break;
                                case 92:
                                    {
                                    alt68=6;
                                    }
                                    break;
                            }

                            }
                            break;
                        case 86:
                            {
                            alt68=2;
                            }
                            break;
                        case 83:
                            {
                            alt68=3;
                            }
                            break;
                        case 62:
                            {
                            alt68=4;
                            }
                            break;
                        case 82:
                            {
                            alt68=5;
                            }
                            break;
                        case 92:
                            {
                            alt68=6;
                            }
                            break;
                    }

                    switch (alt68) {
                        case 1 :
                            // InternalSqml.g:5066:5: ( () ( ( ruleSqmlComparisonOperator ) ) ( (lv_right_9_0= ruleSqmlOperand ) ) )
                            {
                            // InternalSqml.g:5066:5: ( () ( ( ruleSqmlComparisonOperator ) ) ( (lv_right_9_0= ruleSqmlOperand ) ) )
                            // InternalSqml.g:5067:6: () ( ( ruleSqmlComparisonOperator ) ) ( (lv_right_9_0= ruleSqmlOperand ) )
                            {
                            // InternalSqml.g:5067:6: ()
                            // InternalSqml.g:5068:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							current = forceCreateModelElementAndSet(
                              								grammarAccess.getSqmlConditionAccess().getSqmlComparisonLeftAction_2_1_0_0(),
                              								current);
                              						
                            }

                            }

                            // InternalSqml.g:5074:6: ( ( ruleSqmlComparisonOperator ) )
                            // InternalSqml.g:5075:7: ( ruleSqmlComparisonOperator )
                            {
                            // InternalSqml.g:5075:7: ( ruleSqmlComparisonOperator )
                            // InternalSqml.g:5076:8: ruleSqmlComparisonOperator
                            {
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getSqmlConditionRule());
                              								}
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSqmlConditionAccess().getFunctionSqmlFunctionCrossReference_2_1_0_1_0());
                              							
                            }
                            pushFollow(FOLLOW_59);
                            ruleSqmlComparisonOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalSqml.g:5090:6: ( (lv_right_9_0= ruleSqmlOperand ) )
                            // InternalSqml.g:5091:7: (lv_right_9_0= ruleSqmlOperand )
                            {
                            // InternalSqml.g:5091:7: (lv_right_9_0= ruleSqmlOperand )
                            // InternalSqml.g:5092:8: lv_right_9_0= ruleSqmlOperand
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSqmlConditionAccess().getRightSqmlOperandParserRuleCall_2_1_0_2_0());
                              							
                            }
                            pushFollow(FOLLOW_2);
                            lv_right_9_0=ruleSqmlOperand();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getSqmlConditionRule());
                              								}
                              								set(
                              									current,
                              									"right",
                              									lv_right_9_0,
                              									"com.softicar.sqml.Sqml.SqmlOperand");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSqml.g:5111:5: ( () ( (lv_not_11_0= 'NOT' ) )? otherlv_12= 'LIKE' ( (lv_right_13_0= ruleSqmlOperand ) ) (otherlv_14= 'ESCAPE' ( (lv_escape_15_0= RULE_STRING ) ) )? )
                            {
                            // InternalSqml.g:5111:5: ( () ( (lv_not_11_0= 'NOT' ) )? otherlv_12= 'LIKE' ( (lv_right_13_0= ruleSqmlOperand ) ) (otherlv_14= 'ESCAPE' ( (lv_escape_15_0= RULE_STRING ) ) )? )
                            // InternalSqml.g:5112:6: () ( (lv_not_11_0= 'NOT' ) )? otherlv_12= 'LIKE' ( (lv_right_13_0= ruleSqmlOperand ) ) (otherlv_14= 'ESCAPE' ( (lv_escape_15_0= RULE_STRING ) ) )?
                            {
                            // InternalSqml.g:5112:6: ()
                            // InternalSqml.g:5113:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							current = forceCreateModelElementAndSet(
                              								grammarAccess.getSqmlConditionAccess().getSqmlLikeLeftAction_2_1_1_0(),
                              								current);
                              						
                            }

                            }

                            // InternalSqml.g:5119:6: ( (lv_not_11_0= 'NOT' ) )?
                            int alt62=2;
                            int LA62_0 = input.LA(1);

                            if ( (LA62_0==89) ) {
                                alt62=1;
                            }
                            switch (alt62) {
                                case 1 :
                                    // InternalSqml.g:5120:7: (lv_not_11_0= 'NOT' )
                                    {
                                    // InternalSqml.g:5120:7: (lv_not_11_0= 'NOT' )
                                    // InternalSqml.g:5121:8: lv_not_11_0= 'NOT'
                                    {
                                    lv_not_11_0=(Token)match(input,89,FOLLOW_65); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(lv_not_11_0, grammarAccess.getSqmlConditionAccess().getNotNOTKeyword_2_1_1_1_0());
                                      							
                                    }
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElement(grammarAccess.getSqmlConditionRule());
                                      								}
                                      								setWithLastConsumed(current, "not", lv_not_11_0 != null, "NOT");
                                      							
                                    }

                                    }


                                    }
                                    break;

                            }

                            otherlv_12=(Token)match(input,86,FOLLOW_59); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_12, grammarAccess.getSqmlConditionAccess().getLIKEKeyword_2_1_1_2());
                              					
                            }
                            // InternalSqml.g:5137:6: ( (lv_right_13_0= ruleSqmlOperand ) )
                            // InternalSqml.g:5138:7: (lv_right_13_0= ruleSqmlOperand )
                            {
                            // InternalSqml.g:5138:7: (lv_right_13_0= ruleSqmlOperand )
                            // InternalSqml.g:5139:8: lv_right_13_0= ruleSqmlOperand
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSqmlConditionAccess().getRightSqmlOperandParserRuleCall_2_1_1_3_0());
                              							
                            }
                            pushFollow(FOLLOW_66);
                            lv_right_13_0=ruleSqmlOperand();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getSqmlConditionRule());
                              								}
                              								set(
                              									current,
                              									"right",
                              									lv_right_13_0,
                              									"com.softicar.sqml.Sqml.SqmlOperand");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalSqml.g:5156:6: (otherlv_14= 'ESCAPE' ( (lv_escape_15_0= RULE_STRING ) ) )?
                            int alt63=2;
                            int LA63_0 = input.LA(1);

                            if ( (LA63_0==72) ) {
                                alt63=1;
                            }
                            switch (alt63) {
                                case 1 :
                                    // InternalSqml.g:5157:7: otherlv_14= 'ESCAPE' ( (lv_escape_15_0= RULE_STRING ) )
                                    {
                                    otherlv_14=(Token)match(input,72,FOLLOW_17); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_14, grammarAccess.getSqmlConditionAccess().getESCAPEKeyword_2_1_1_4_0());
                                      						
                                    }
                                    // InternalSqml.g:5161:7: ( (lv_escape_15_0= RULE_STRING ) )
                                    // InternalSqml.g:5162:8: (lv_escape_15_0= RULE_STRING )
                                    {
                                    // InternalSqml.g:5162:8: (lv_escape_15_0= RULE_STRING )
                                    // InternalSqml.g:5163:9: lv_escape_15_0= RULE_STRING
                                    {
                                    lv_escape_15_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(lv_escape_15_0, grammarAccess.getSqmlConditionAccess().getEscapeSTRINGTerminalRuleCall_2_1_1_4_1_0());
                                      								
                                    }
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElement(grammarAccess.getSqmlConditionRule());
                                      									}
                                      									setWithLastConsumed(
                                      										current,
                                      										"escape",
                                      										lv_escape_15_0,
                                      										"org.eclipse.xtext.common.Terminals.STRING");
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalSqml.g:5182:5: ( () otherlv_17= 'IS' ( (lv_not_18_0= 'NOT' ) )? otherlv_19= 'NULL' )
                            {
                            // InternalSqml.g:5182:5: ( () otherlv_17= 'IS' ( (lv_not_18_0= 'NOT' ) )? otherlv_19= 'NULL' )
                            // InternalSqml.g:5183:6: () otherlv_17= 'IS' ( (lv_not_18_0= 'NOT' ) )? otherlv_19= 'NULL'
                            {
                            // InternalSqml.g:5183:6: ()
                            // InternalSqml.g:5184:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							current = forceCreateModelElementAndSet(
                              								grammarAccess.getSqmlConditionAccess().getSqmlIsNullOperandAction_2_1_2_0(),
                              								current);
                              						
                            }

                            }

                            otherlv_17=(Token)match(input,83,FOLLOW_67); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_17, grammarAccess.getSqmlConditionAccess().getISKeyword_2_1_2_1());
                              					
                            }
                            // InternalSqml.g:5194:6: ( (lv_not_18_0= 'NOT' ) )?
                            int alt64=2;
                            int LA64_0 = input.LA(1);

                            if ( (LA64_0==89) ) {
                                alt64=1;
                            }
                            switch (alt64) {
                                case 1 :
                                    // InternalSqml.g:5195:7: (lv_not_18_0= 'NOT' )
                                    {
                                    // InternalSqml.g:5195:7: (lv_not_18_0= 'NOT' )
                                    // InternalSqml.g:5196:8: lv_not_18_0= 'NOT'
                                    {
                                    lv_not_18_0=(Token)match(input,89,FOLLOW_68); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(lv_not_18_0, grammarAccess.getSqmlConditionAccess().getNotNOTKeyword_2_1_2_2_0());
                                      							
                                    }
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElement(grammarAccess.getSqmlConditionRule());
                                      								}
                                      								setWithLastConsumed(current, "not", lv_not_18_0 != null, "NOT");
                                      							
                                    }

                                    }


                                    }
                                    break;

                            }

                            otherlv_19=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_19, grammarAccess.getSqmlConditionAccess().getNULLKeyword_2_1_2_3());
                              					
                            }

                            }


                            }
                            break;
                        case 4 :
                            // InternalSqml.g:5214:5: ( () otherlv_21= 'BETWEEN' ( (lv_left_22_0= ruleSqmlOperand ) ) otherlv_23= 'AND' ( (lv_right_24_0= ruleSqmlOperand ) ) )
                            {
                            // InternalSqml.g:5214:5: ( () otherlv_21= 'BETWEEN' ( (lv_left_22_0= ruleSqmlOperand ) ) otherlv_23= 'AND' ( (lv_right_24_0= ruleSqmlOperand ) ) )
                            // InternalSqml.g:5215:6: () otherlv_21= 'BETWEEN' ( (lv_left_22_0= ruleSqmlOperand ) ) otherlv_23= 'AND' ( (lv_right_24_0= ruleSqmlOperand ) )
                            {
                            // InternalSqml.g:5215:6: ()
                            // InternalSqml.g:5216:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							current = forceCreateModelElementAndSet(
                              								grammarAccess.getSqmlConditionAccess().getSqmlBetweenOperandAction_2_1_3_0(),
                              								current);
                              						
                            }

                            }

                            otherlv_21=(Token)match(input,62,FOLLOW_59); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_21, grammarAccess.getSqmlConditionAccess().getBETWEENKeyword_2_1_3_1());
                              					
                            }
                            // InternalSqml.g:5226:6: ( (lv_left_22_0= ruleSqmlOperand ) )
                            // InternalSqml.g:5227:7: (lv_left_22_0= ruleSqmlOperand )
                            {
                            // InternalSqml.g:5227:7: (lv_left_22_0= ruleSqmlOperand )
                            // InternalSqml.g:5228:8: lv_left_22_0= ruleSqmlOperand
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSqmlConditionAccess().getLeftSqmlOperandParserRuleCall_2_1_3_2_0());
                              							
                            }
                            pushFollow(FOLLOW_69);
                            lv_left_22_0=ruleSqmlOperand();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getSqmlConditionRule());
                              								}
                              								set(
                              									current,
                              									"left",
                              									lv_left_22_0,
                              									"com.softicar.sqml.Sqml.SqmlOperand");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_23=(Token)match(input,60,FOLLOW_59); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_23, grammarAccess.getSqmlConditionAccess().getANDKeyword_2_1_3_3());
                              					
                            }
                            // InternalSqml.g:5249:6: ( (lv_right_24_0= ruleSqmlOperand ) )
                            // InternalSqml.g:5250:7: (lv_right_24_0= ruleSqmlOperand )
                            {
                            // InternalSqml.g:5250:7: (lv_right_24_0= ruleSqmlOperand )
                            // InternalSqml.g:5251:8: lv_right_24_0= ruleSqmlOperand
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSqmlConditionAccess().getRightSqmlOperandParserRuleCall_2_1_3_4_0());
                              							
                            }
                            pushFollow(FOLLOW_2);
                            lv_right_24_0=ruleSqmlOperand();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getSqmlConditionRule());
                              								}
                              								set(
                              									current,
                              									"right",
                              									lv_right_24_0,
                              									"com.softicar.sqml.Sqml.SqmlOperand");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }


                            }
                            break;
                        case 5 :
                            // InternalSqml.g:5270:5: ( () ( (lv_not_26_0= 'NOT' ) )? otherlv_27= 'IN' ( ( (lv_right_28_1= ruleSqmlStaticVariableReference | lv_right_28_2= ruleSqmlSubSelect | lv_right_28_3= ruleSqmlRowConstructor ) ) ) )
                            {
                            // InternalSqml.g:5270:5: ( () ( (lv_not_26_0= 'NOT' ) )? otherlv_27= 'IN' ( ( (lv_right_28_1= ruleSqmlStaticVariableReference | lv_right_28_2= ruleSqmlSubSelect | lv_right_28_3= ruleSqmlRowConstructor ) ) ) )
                            // InternalSqml.g:5271:6: () ( (lv_not_26_0= 'NOT' ) )? otherlv_27= 'IN' ( ( (lv_right_28_1= ruleSqmlStaticVariableReference | lv_right_28_2= ruleSqmlSubSelect | lv_right_28_3= ruleSqmlRowConstructor ) ) )
                            {
                            // InternalSqml.g:5271:6: ()
                            // InternalSqml.g:5272:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							current = forceCreateModelElementAndSet(
                              								grammarAccess.getSqmlConditionAccess().getSqmlInLeftAction_2_1_4_0(),
                              								current);
                              						
                            }

                            }

                            // InternalSqml.g:5278:6: ( (lv_not_26_0= 'NOT' ) )?
                            int alt65=2;
                            int LA65_0 = input.LA(1);

                            if ( (LA65_0==89) ) {
                                alt65=1;
                            }
                            switch (alt65) {
                                case 1 :
                                    // InternalSqml.g:5279:7: (lv_not_26_0= 'NOT' )
                                    {
                                    // InternalSqml.g:5279:7: (lv_not_26_0= 'NOT' )
                                    // InternalSqml.g:5280:8: lv_not_26_0= 'NOT'
                                    {
                                    lv_not_26_0=(Token)match(input,89,FOLLOW_70); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(lv_not_26_0, grammarAccess.getSqmlConditionAccess().getNotNOTKeyword_2_1_4_1_0());
                                      							
                                    }
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElement(grammarAccess.getSqmlConditionRule());
                                      								}
                                      								setWithLastConsumed(current, "not", lv_not_26_0 != null, "NOT");
                                      							
                                    }

                                    }


                                    }
                                    break;

                            }

                            otherlv_27=(Token)match(input,82,FOLLOW_71); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_27, grammarAccess.getSqmlConditionAccess().getINKeyword_2_1_4_2());
                              					
                            }
                            // InternalSqml.g:5296:6: ( ( (lv_right_28_1= ruleSqmlStaticVariableReference | lv_right_28_2= ruleSqmlSubSelect | lv_right_28_3= ruleSqmlRowConstructor ) ) )
                            // InternalSqml.g:5297:7: ( (lv_right_28_1= ruleSqmlStaticVariableReference | lv_right_28_2= ruleSqmlSubSelect | lv_right_28_3= ruleSqmlRowConstructor ) )
                            {
                            // InternalSqml.g:5297:7: ( (lv_right_28_1= ruleSqmlStaticVariableReference | lv_right_28_2= ruleSqmlSubSelect | lv_right_28_3= ruleSqmlRowConstructor ) )
                            // InternalSqml.g:5298:8: (lv_right_28_1= ruleSqmlStaticVariableReference | lv_right_28_2= ruleSqmlSubSelect | lv_right_28_3= ruleSqmlRowConstructor )
                            {
                            // InternalSqml.g:5298:8: (lv_right_28_1= ruleSqmlStaticVariableReference | lv_right_28_2= ruleSqmlSubSelect | lv_right_28_3= ruleSqmlRowConstructor )
                            int alt66=3;
                            switch ( input.LA(1) ) {
                            case 87:
                            case 118:
                                {
                                alt66=1;
                                }
                                break;
                            case 49:
                                {
                                int LA66_2 = input.LA(2);

                                if ( ((LA66_2>=76 && LA66_2<=77)||LA66_2==79||(LA66_2>=84 && LA66_2<=85)||LA66_2==91||LA66_2==94||LA66_2==103||LA66_2==117) ) {
                                    alt66=2;
                                }
                                else if ( ((LA66_2>=RULE_ID && LA66_2<=RULE_DOUBLE)||(LA66_2>=48 && LA66_2<=49)||LA66_2==51||LA66_2==65||(LA66_2>=73 && LA66_2<=74)||LA66_2==78||(LA66_2>=80 && LA66_2<=81)||LA66_2==87||LA66_2==89||LA66_2==98||LA66_2==101||LA66_2==118) ) {
                                    alt66=3;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 66, 2, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 48:
                                {
                                alt66=3;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 66, 0, input);

                                throw nvae;
                            }

                            switch (alt66) {
                                case 1 :
                                    // InternalSqml.g:5299:9: lv_right_28_1= ruleSqmlStaticVariableReference
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getSqmlConditionAccess().getRightSqmlStaticVariableReferenceParserRuleCall_2_1_4_3_0_0());
                                      								
                                    }
                                    pushFollow(FOLLOW_2);
                                    lv_right_28_1=ruleSqmlStaticVariableReference();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getSqmlConditionRule());
                                      									}
                                      									set(
                                      										current,
                                      										"right",
                                      										lv_right_28_1,
                                      										"com.softicar.sqml.Sqml.SqmlStaticVariableReference");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }
                                    break;
                                case 2 :
                                    // InternalSqml.g:5315:9: lv_right_28_2= ruleSqmlSubSelect
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getSqmlConditionAccess().getRightSqmlSubSelectParserRuleCall_2_1_4_3_0_1());
                                      								
                                    }
                                    pushFollow(FOLLOW_2);
                                    lv_right_28_2=ruleSqmlSubSelect();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getSqmlConditionRule());
                                      									}
                                      									set(
                                      										current,
                                      										"right",
                                      										lv_right_28_2,
                                      										"com.softicar.sqml.Sqml.SqmlSubSelect");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }
                                    break;
                                case 3 :
                                    // InternalSqml.g:5331:9: lv_right_28_3= ruleSqmlRowConstructor
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getSqmlConditionAccess().getRightSqmlRowConstructorParserRuleCall_2_1_4_3_0_2());
                                      								
                                    }
                                    pushFollow(FOLLOW_2);
                                    lv_right_28_3=ruleSqmlRowConstructor();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getSqmlConditionRule());
                                      									}
                                      									set(
                                      										current,
                                      										"right",
                                      										lv_right_28_3,
                                      										"com.softicar.sqml.Sqml.SqmlRowConstructor");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }
                                    break;

                            }


                            }


                            }


                            }


                            }
                            break;
                        case 6 :
                            // InternalSqml.g:5351:5: ( () ( (lv_not_30_0= 'NOT' ) )? otherlv_31= 'REGEXP' ( (lv_regexp_32_0= ruleSqmlOperand ) ) )
                            {
                            // InternalSqml.g:5351:5: ( () ( (lv_not_30_0= 'NOT' ) )? otherlv_31= 'REGEXP' ( (lv_regexp_32_0= ruleSqmlOperand ) ) )
                            // InternalSqml.g:5352:6: () ( (lv_not_30_0= 'NOT' ) )? otherlv_31= 'REGEXP' ( (lv_regexp_32_0= ruleSqmlOperand ) )
                            {
                            // InternalSqml.g:5352:6: ()
                            // InternalSqml.g:5353:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							current = forceCreateModelElementAndSet(
                              								grammarAccess.getSqmlConditionAccess().getSqmlRegexpOperandAction_2_1_5_0(),
                              								current);
                              						
                            }

                            }

                            // InternalSqml.g:5359:6: ( (lv_not_30_0= 'NOT' ) )?
                            int alt67=2;
                            int LA67_0 = input.LA(1);

                            if ( (LA67_0==89) ) {
                                alt67=1;
                            }
                            switch (alt67) {
                                case 1 :
                                    // InternalSqml.g:5360:7: (lv_not_30_0= 'NOT' )
                                    {
                                    // InternalSqml.g:5360:7: (lv_not_30_0= 'NOT' )
                                    // InternalSqml.g:5361:8: lv_not_30_0= 'NOT'
                                    {
                                    lv_not_30_0=(Token)match(input,89,FOLLOW_72); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(lv_not_30_0, grammarAccess.getSqmlConditionAccess().getNotNOTKeyword_2_1_5_1_0());
                                      							
                                    }
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElement(grammarAccess.getSqmlConditionRule());
                                      								}
                                      								setWithLastConsumed(current, "not", lv_not_30_0 != null, "NOT");
                                      							
                                    }

                                    }


                                    }
                                    break;

                            }

                            otherlv_31=(Token)match(input,92,FOLLOW_59); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_31, grammarAccess.getSqmlConditionAccess().getREGEXPKeyword_2_1_5_2());
                              					
                            }
                            // InternalSqml.g:5377:6: ( (lv_regexp_32_0= ruleSqmlOperand ) )
                            // InternalSqml.g:5378:7: (lv_regexp_32_0= ruleSqmlOperand )
                            {
                            // InternalSqml.g:5378:7: (lv_regexp_32_0= ruleSqmlOperand )
                            // InternalSqml.g:5379:8: lv_regexp_32_0= ruleSqmlOperand
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSqmlConditionAccess().getRegexpSqmlOperandParserRuleCall_2_1_5_3_0());
                              							
                            }
                            pushFollow(FOLLOW_2);
                            lv_regexp_32_0=ruleSqmlOperand();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getSqmlConditionRule());
                              								}
                              								set(
                              									current,
                              									"regexp",
                              									lv_regexp_32_0,
                              									"com.softicar.sqml.Sqml.SqmlOperand");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlCondition"


    // $ANTLR start "entryRuleSqmlOperand"
    // InternalSqml.g:5403:1: entryRuleSqmlOperand returns [EObject current=null] : iv_ruleSqmlOperand= ruleSqmlOperand EOF ;
    public final EObject entryRuleSqmlOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlOperand = null;


        try {
            // InternalSqml.g:5403:52: (iv_ruleSqmlOperand= ruleSqmlOperand EOF )
            // InternalSqml.g:5404:2: iv_ruleSqmlOperand= ruleSqmlOperand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlOperandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlOperand=ruleSqmlOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlOperand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlOperand"


    // $ANTLR start "ruleSqmlOperand"
    // InternalSqml.g:5410:1: ruleSqmlOperand returns [EObject current=null] : this_SqmlAddition_0= ruleSqmlAddition ;
    public final EObject ruleSqmlOperand() throws RecognitionException {
        EObject current = null;

        EObject this_SqmlAddition_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:5416:2: (this_SqmlAddition_0= ruleSqmlAddition )
            // InternalSqml.g:5417:2: this_SqmlAddition_0= ruleSqmlAddition
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getSqmlOperandAccess().getSqmlAdditionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_SqmlAddition_0=ruleSqmlAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_SqmlAddition_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlOperand"


    // $ANTLR start "entryRuleSqmlAddition"
    // InternalSqml.g:5428:1: entryRuleSqmlAddition returns [EObject current=null] : iv_ruleSqmlAddition= ruleSqmlAddition EOF ;
    public final EObject entryRuleSqmlAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlAddition = null;


        try {
            // InternalSqml.g:5428:53: (iv_ruleSqmlAddition= ruleSqmlAddition EOF )
            // InternalSqml.g:5429:2: iv_ruleSqmlAddition= ruleSqmlAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlAdditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlAddition=ruleSqmlAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlAddition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlAddition"


    // $ANTLR start "ruleSqmlAddition"
    // InternalSqml.g:5435:1: ruleSqmlAddition returns [EObject current=null] : (this_SqmlMultiplication_0= ruleSqmlMultiplication ( () ( ( ruleSqmlAdditionOperator ) ) ( (lv_right_3_0= ruleSqmlMultiplication ) ) )* ) ;
    public final EObject ruleSqmlAddition() throws RecognitionException {
        EObject current = null;

        EObject this_SqmlMultiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:5441:2: ( (this_SqmlMultiplication_0= ruleSqmlMultiplication ( () ( ( ruleSqmlAdditionOperator ) ) ( (lv_right_3_0= ruleSqmlMultiplication ) ) )* ) )
            // InternalSqml.g:5442:2: (this_SqmlMultiplication_0= ruleSqmlMultiplication ( () ( ( ruleSqmlAdditionOperator ) ) ( (lv_right_3_0= ruleSqmlMultiplication ) ) )* )
            {
            // InternalSqml.g:5442:2: (this_SqmlMultiplication_0= ruleSqmlMultiplication ( () ( ( ruleSqmlAdditionOperator ) ) ( (lv_right_3_0= ruleSqmlMultiplication ) ) )* )
            // InternalSqml.g:5443:3: this_SqmlMultiplication_0= ruleSqmlMultiplication ( () ( ( ruleSqmlAdditionOperator ) ) ( (lv_right_3_0= ruleSqmlMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSqmlAdditionAccess().getSqmlMultiplicationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_73);
            this_SqmlMultiplication_0=ruleSqmlMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SqmlMultiplication_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSqml.g:5451:3: ( () ( ( ruleSqmlAdditionOperator ) ) ( (lv_right_3_0= ruleSqmlMultiplication ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==51||LA70_0==104) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalSqml.g:5452:4: () ( ( ruleSqmlAdditionOperator ) ) ( (lv_right_3_0= ruleSqmlMultiplication ) )
            	    {
            	    // InternalSqml.g:5452:4: ()
            	    // InternalSqml.g:5453:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getSqmlAdditionAccess().getSqmlAdditionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalSqml.g:5459:4: ( ( ruleSqmlAdditionOperator ) )
            	    // InternalSqml.g:5460:5: ( ruleSqmlAdditionOperator )
            	    {
            	    // InternalSqml.g:5460:5: ( ruleSqmlAdditionOperator )
            	    // InternalSqml.g:5461:6: ruleSqmlAdditionOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getSqmlAdditionRule());
            	      						}
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSqmlAdditionAccess().getFunctionSqmlFunctionCrossReference_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_59);
            	    ruleSqmlAdditionOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalSqml.g:5475:4: ( (lv_right_3_0= ruleSqmlMultiplication ) )
            	    // InternalSqml.g:5476:5: (lv_right_3_0= ruleSqmlMultiplication )
            	    {
            	    // InternalSqml.g:5476:5: (lv_right_3_0= ruleSqmlMultiplication )
            	    // InternalSqml.g:5477:6: lv_right_3_0= ruleSqmlMultiplication
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSqmlAdditionAccess().getRightSqmlMultiplicationParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_73);
            	    lv_right_3_0=ruleSqmlMultiplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSqmlAdditionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"com.softicar.sqml.Sqml.SqmlMultiplication");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlAddition"


    // $ANTLR start "entryRuleSqmlMultiplication"
    // InternalSqml.g:5499:1: entryRuleSqmlMultiplication returns [EObject current=null] : iv_ruleSqmlMultiplication= ruleSqmlMultiplication EOF ;
    public final EObject entryRuleSqmlMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlMultiplication = null;


        try {
            // InternalSqml.g:5499:59: (iv_ruleSqmlMultiplication= ruleSqmlMultiplication EOF )
            // InternalSqml.g:5500:2: iv_ruleSqmlMultiplication= ruleSqmlMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlMultiplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlMultiplication=ruleSqmlMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlMultiplication; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlMultiplication"


    // $ANTLR start "ruleSqmlMultiplication"
    // InternalSqml.g:5506:1: ruleSqmlMultiplication returns [EObject current=null] : (this_SqmlPrimay_0= ruleSqmlPrimay ( () ( ( ruleSqmlMultiplicationOperator ) ) ( (lv_right_3_0= ruleSqmlPrimay ) ) )* ) ;
    public final EObject ruleSqmlMultiplication() throws RecognitionException {
        EObject current = null;

        EObject this_SqmlPrimay_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:5512:2: ( (this_SqmlPrimay_0= ruleSqmlPrimay ( () ( ( ruleSqmlMultiplicationOperator ) ) ( (lv_right_3_0= ruleSqmlPrimay ) ) )* ) )
            // InternalSqml.g:5513:2: (this_SqmlPrimay_0= ruleSqmlPrimay ( () ( ( ruleSqmlMultiplicationOperator ) ) ( (lv_right_3_0= ruleSqmlPrimay ) ) )* )
            {
            // InternalSqml.g:5513:2: (this_SqmlPrimay_0= ruleSqmlPrimay ( () ( ( ruleSqmlMultiplicationOperator ) ) ( (lv_right_3_0= ruleSqmlPrimay ) ) )* )
            // InternalSqml.g:5514:3: this_SqmlPrimay_0= ruleSqmlPrimay ( () ( ( ruleSqmlMultiplicationOperator ) ) ( (lv_right_3_0= ruleSqmlPrimay ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSqmlMultiplicationAccess().getSqmlPrimayParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_74);
            this_SqmlPrimay_0=ruleSqmlPrimay();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SqmlPrimay_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSqml.g:5522:3: ( () ( ( ruleSqmlMultiplicationOperator ) ) ( (lv_right_3_0= ruleSqmlPrimay ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( ((LA71_0>=105 && LA71_0<=107)) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalSqml.g:5523:4: () ( ( ruleSqmlMultiplicationOperator ) ) ( (lv_right_3_0= ruleSqmlPrimay ) )
            	    {
            	    // InternalSqml.g:5523:4: ()
            	    // InternalSqml.g:5524:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getSqmlMultiplicationAccess().getSqmlMultiplicationLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalSqml.g:5530:4: ( ( ruleSqmlMultiplicationOperator ) )
            	    // InternalSqml.g:5531:5: ( ruleSqmlMultiplicationOperator )
            	    {
            	    // InternalSqml.g:5531:5: ( ruleSqmlMultiplicationOperator )
            	    // InternalSqml.g:5532:6: ruleSqmlMultiplicationOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getSqmlMultiplicationRule());
            	      						}
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSqmlMultiplicationAccess().getFunctionSqmlFunctionCrossReference_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_59);
            	    ruleSqmlMultiplicationOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalSqml.g:5546:4: ( (lv_right_3_0= ruleSqmlPrimay ) )
            	    // InternalSqml.g:5547:5: (lv_right_3_0= ruleSqmlPrimay )
            	    {
            	    // InternalSqml.g:5547:5: (lv_right_3_0= ruleSqmlPrimay )
            	    // InternalSqml.g:5548:6: lv_right_3_0= ruleSqmlPrimay
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSqmlMultiplicationAccess().getRightSqmlPrimayParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_74);
            	    lv_right_3_0=ruleSqmlPrimay();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSqmlMultiplicationRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"com.softicar.sqml.Sqml.SqmlPrimay");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlMultiplication"


    // $ANTLR start "entryRuleSqmlPrimay"
    // InternalSqml.g:5570:1: entryRuleSqmlPrimay returns [EObject current=null] : iv_ruleSqmlPrimay= ruleSqmlPrimay EOF ;
    public final EObject entryRuleSqmlPrimay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlPrimay = null;


        try {
            // InternalSqml.g:5570:51: (iv_ruleSqmlPrimay= ruleSqmlPrimay EOF )
            // InternalSqml.g:5571:2: iv_ruleSqmlPrimay= ruleSqmlPrimay EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlPrimayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlPrimay=ruleSqmlPrimay();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlPrimay; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlPrimay"


    // $ANTLR start "ruleSqmlPrimay"
    // InternalSqml.g:5577:1: ruleSqmlPrimay returns [EObject current=null] : (this_SqmlRowConstructor_0= ruleSqmlRowConstructor | this_SqmlNegation_1= ruleSqmlNegation | this_SqmlValueReference_2= ruleSqmlValueReference | this_SqmlFunctionCall_3= ruleSqmlFunctionCall | this_SqmlGroupConcat_4= ruleSqmlGroupConcat | this_SqmlCase_5= ruleSqmlCase | this_SqmlIf_6= ruleSqmlIf | this_SqmlIfNull_7= ruleSqmlIfNull | this_SqmlStaticIf_8= ruleSqmlStaticIf | this_SqmlStaticVariableReference_9= ruleSqmlStaticVariableReference | this_SqmlLiteral_10= ruleSqmlLiteral ) ;
    public final EObject ruleSqmlPrimay() throws RecognitionException {
        EObject current = null;

        EObject this_SqmlRowConstructor_0 = null;

        EObject this_SqmlNegation_1 = null;

        EObject this_SqmlValueReference_2 = null;

        EObject this_SqmlFunctionCall_3 = null;

        EObject this_SqmlGroupConcat_4 = null;

        EObject this_SqmlCase_5 = null;

        EObject this_SqmlIf_6 = null;

        EObject this_SqmlIfNull_7 = null;

        EObject this_SqmlStaticIf_8 = null;

        EObject this_SqmlStaticVariableReference_9 = null;

        EObject this_SqmlLiteral_10 = null;



        	enterRule();

        try {
            // InternalSqml.g:5583:2: ( (this_SqmlRowConstructor_0= ruleSqmlRowConstructor | this_SqmlNegation_1= ruleSqmlNegation | this_SqmlValueReference_2= ruleSqmlValueReference | this_SqmlFunctionCall_3= ruleSqmlFunctionCall | this_SqmlGroupConcat_4= ruleSqmlGroupConcat | this_SqmlCase_5= ruleSqmlCase | this_SqmlIf_6= ruleSqmlIf | this_SqmlIfNull_7= ruleSqmlIfNull | this_SqmlStaticIf_8= ruleSqmlStaticIf | this_SqmlStaticVariableReference_9= ruleSqmlStaticVariableReference | this_SqmlLiteral_10= ruleSqmlLiteral ) )
            // InternalSqml.g:5584:2: (this_SqmlRowConstructor_0= ruleSqmlRowConstructor | this_SqmlNegation_1= ruleSqmlNegation | this_SqmlValueReference_2= ruleSqmlValueReference | this_SqmlFunctionCall_3= ruleSqmlFunctionCall | this_SqmlGroupConcat_4= ruleSqmlGroupConcat | this_SqmlCase_5= ruleSqmlCase | this_SqmlIf_6= ruleSqmlIf | this_SqmlIfNull_7= ruleSqmlIfNull | this_SqmlStaticIf_8= ruleSqmlStaticIf | this_SqmlStaticVariableReference_9= ruleSqmlStaticVariableReference | this_SqmlLiteral_10= ruleSqmlLiteral )
            {
            // InternalSqml.g:5584:2: (this_SqmlRowConstructor_0= ruleSqmlRowConstructor | this_SqmlNegation_1= ruleSqmlNegation | this_SqmlValueReference_2= ruleSqmlValueReference | this_SqmlFunctionCall_3= ruleSqmlFunctionCall | this_SqmlGroupConcat_4= ruleSqmlGroupConcat | this_SqmlCase_5= ruleSqmlCase | this_SqmlIf_6= ruleSqmlIf | this_SqmlIfNull_7= ruleSqmlIfNull | this_SqmlStaticIf_8= ruleSqmlStaticIf | this_SqmlStaticVariableReference_9= ruleSqmlStaticVariableReference | this_SqmlLiteral_10= ruleSqmlLiteral )
            int alt72=11;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // InternalSqml.g:5585:3: this_SqmlRowConstructor_0= ruleSqmlRowConstructor
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlPrimayAccess().getSqmlRowConstructorParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlRowConstructor_0=ruleSqmlRowConstructor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlRowConstructor_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSqml.g:5594:3: this_SqmlNegation_1= ruleSqmlNegation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlPrimayAccess().getSqmlNegationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlNegation_1=ruleSqmlNegation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlNegation_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSqml.g:5603:3: this_SqmlValueReference_2= ruleSqmlValueReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlPrimayAccess().getSqmlValueReferenceParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlValueReference_2=ruleSqmlValueReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlValueReference_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSqml.g:5612:3: this_SqmlFunctionCall_3= ruleSqmlFunctionCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlPrimayAccess().getSqmlFunctionCallParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlFunctionCall_3=ruleSqmlFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlFunctionCall_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalSqml.g:5621:3: this_SqmlGroupConcat_4= ruleSqmlGroupConcat
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlPrimayAccess().getSqmlGroupConcatParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlGroupConcat_4=ruleSqmlGroupConcat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlGroupConcat_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalSqml.g:5630:3: this_SqmlCase_5= ruleSqmlCase
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlPrimayAccess().getSqmlCaseParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlCase_5=ruleSqmlCase();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlCase_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalSqml.g:5639:3: this_SqmlIf_6= ruleSqmlIf
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlPrimayAccess().getSqmlIfParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlIf_6=ruleSqmlIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlIf_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalSqml.g:5648:3: this_SqmlIfNull_7= ruleSqmlIfNull
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlPrimayAccess().getSqmlIfNullParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlIfNull_7=ruleSqmlIfNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlIfNull_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalSqml.g:5657:3: this_SqmlStaticIf_8= ruleSqmlStaticIf
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlPrimayAccess().getSqmlStaticIfParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlStaticIf_8=ruleSqmlStaticIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlStaticIf_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalSqml.g:5666:3: this_SqmlStaticVariableReference_9= ruleSqmlStaticVariableReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlPrimayAccess().getSqmlStaticVariableReferenceParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlStaticVariableReference_9=ruleSqmlStaticVariableReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlStaticVariableReference_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalSqml.g:5675:3: this_SqmlLiteral_10= ruleSqmlLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlPrimayAccess().getSqmlLiteralParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlLiteral_10=ruleSqmlLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlLiteral_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlPrimay"


    // $ANTLR start "entryRuleSqmlSubSelect"
    // InternalSqml.g:5687:1: entryRuleSqmlSubSelect returns [EObject current=null] : iv_ruleSqmlSubSelect= ruleSqmlSubSelect EOF ;
    public final EObject entryRuleSqmlSubSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlSubSelect = null;


        try {
            // InternalSqml.g:5687:54: (iv_ruleSqmlSubSelect= ruleSqmlSubSelect EOF )
            // InternalSqml.g:5688:2: iv_ruleSqmlSubSelect= ruleSqmlSubSelect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlSubSelectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlSubSelect=ruleSqmlSubSelect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlSubSelect; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlSubSelect"


    // $ANTLR start "ruleSqmlSubSelect"
    // InternalSqml.g:5694:1: ruleSqmlSubSelect returns [EObject current=null] : (otherlv_0= '(' ( (lv_select_1_0= ruleSqmlSelect ) ) otherlv_2= ')' ) ;
    public final EObject ruleSqmlSubSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_select_1_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:5700:2: ( (otherlv_0= '(' ( (lv_select_1_0= ruleSqmlSelect ) ) otherlv_2= ')' ) )
            // InternalSqml.g:5701:2: (otherlv_0= '(' ( (lv_select_1_0= ruleSqmlSelect ) ) otherlv_2= ')' )
            {
            // InternalSqml.g:5701:2: (otherlv_0= '(' ( (lv_select_1_0= ruleSqmlSelect ) ) otherlv_2= ')' )
            // InternalSqml.g:5702:3: otherlv_0= '(' ( (lv_select_1_0= ruleSqmlSelect ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSqmlSubSelectAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalSqml.g:5706:3: ( (lv_select_1_0= ruleSqmlSelect ) )
            // InternalSqml.g:5707:4: (lv_select_1_0= ruleSqmlSelect )
            {
            // InternalSqml.g:5707:4: (lv_select_1_0= ruleSqmlSelect )
            // InternalSqml.g:5708:5: lv_select_1_0= ruleSqmlSelect
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlSubSelectAccess().getSelectSqmlSelectParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_56);
            lv_select_1_0=ruleSqmlSelect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlSubSelectRule());
              					}
              					set(
              						current,
              						"select",
              						lv_select_1_0,
              						"com.softicar.sqml.Sqml.SqmlSelect");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSqmlSubSelectAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlSubSelect"


    // $ANTLR start "entryRuleSqmlStaticVariableReference"
    // InternalSqml.g:5733:1: entryRuleSqmlStaticVariableReference returns [EObject current=null] : iv_ruleSqmlStaticVariableReference= ruleSqmlStaticVariableReference EOF ;
    public final EObject entryRuleSqmlStaticVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlStaticVariableReference = null;


        try {
            // InternalSqml.g:5733:68: (iv_ruleSqmlStaticVariableReference= ruleSqmlStaticVariableReference EOF )
            // InternalSqml.g:5734:2: iv_ruleSqmlStaticVariableReference= ruleSqmlStaticVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlStaticVariableReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlStaticVariableReference=ruleSqmlStaticVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlStaticVariableReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlStaticVariableReference"


    // $ANTLR start "ruleSqmlStaticVariableReference"
    // InternalSqml.g:5740:1: ruleSqmlStaticVariableReference returns [EObject current=null] : ( ( (lv_nextIteration_0_0= 'NEXT' ) )? otherlv_1= '$' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleSqmlStaticVariableReference() throws RecognitionException {
        EObject current = null;

        Token lv_nextIteration_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSqml.g:5746:2: ( ( ( (lv_nextIteration_0_0= 'NEXT' ) )? otherlv_1= '$' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalSqml.g:5747:2: ( ( (lv_nextIteration_0_0= 'NEXT' ) )? otherlv_1= '$' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalSqml.g:5747:2: ( ( (lv_nextIteration_0_0= 'NEXT' ) )? otherlv_1= '$' ( (otherlv_2= RULE_ID ) ) )
            // InternalSqml.g:5748:3: ( (lv_nextIteration_0_0= 'NEXT' ) )? otherlv_1= '$' ( (otherlv_2= RULE_ID ) )
            {
            // InternalSqml.g:5748:3: ( (lv_nextIteration_0_0= 'NEXT' ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==87) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalSqml.g:5749:4: (lv_nextIteration_0_0= 'NEXT' )
                    {
                    // InternalSqml.g:5749:4: (lv_nextIteration_0_0= 'NEXT' )
                    // InternalSqml.g:5750:5: lv_nextIteration_0_0= 'NEXT'
                    {
                    lv_nextIteration_0_0=(Token)match(input,87,FOLLOW_75); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_nextIteration_0_0, grammarAccess.getSqmlStaticVariableReferenceAccess().getNextIterationNEXTKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlStaticVariableReferenceRule());
                      					}
                      					setWithLastConsumed(current, "nextIteration", lv_nextIteration_0_0 != null, "NEXT");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,118,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSqmlStaticVariableReferenceAccess().getDollarSignKeyword_1());
              		
            }
            // InternalSqml.g:5766:3: ( (otherlv_2= RULE_ID ) )
            // InternalSqml.g:5767:4: (otherlv_2= RULE_ID )
            {
            // InternalSqml.g:5767:4: (otherlv_2= RULE_ID )
            // InternalSqml.g:5768:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSqmlStaticVariableReferenceRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getSqmlStaticVariableReferenceAccess().getVariableISqmlStaticVariableCrossReference_2_0());
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlStaticVariableReference"


    // $ANTLR start "entryRuleSqmlRowConstructor"
    // InternalSqml.g:5783:1: entryRuleSqmlRowConstructor returns [EObject current=null] : iv_ruleSqmlRowConstructor= ruleSqmlRowConstructor EOF ;
    public final EObject entryRuleSqmlRowConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlRowConstructor = null;


        try {
            // InternalSqml.g:5783:59: (iv_ruleSqmlRowConstructor= ruleSqmlRowConstructor EOF )
            // InternalSqml.g:5784:2: iv_ruleSqmlRowConstructor= ruleSqmlRowConstructor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlRowConstructorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlRowConstructor=ruleSqmlRowConstructor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlRowConstructor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlRowConstructor"


    // $ANTLR start "ruleSqmlRowConstructor"
    // InternalSqml.g:5790:1: ruleSqmlRowConstructor returns [EObject current=null] : ( ( (lv_explicit_0_0= 'ROW' ) )? otherlv_1= '(' ( (lv_expressions_2_0= ruleSqmlExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleSqmlExpression ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleSqmlRowConstructor() throws RecognitionException {
        EObject current = null;

        Token lv_explicit_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expressions_2_0 = null;

        EObject lv_expressions_4_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:5796:2: ( ( ( (lv_explicit_0_0= 'ROW' ) )? otherlv_1= '(' ( (lv_expressions_2_0= ruleSqmlExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleSqmlExpression ) ) )* otherlv_5= ')' ) )
            // InternalSqml.g:5797:2: ( ( (lv_explicit_0_0= 'ROW' ) )? otherlv_1= '(' ( (lv_expressions_2_0= ruleSqmlExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleSqmlExpression ) ) )* otherlv_5= ')' )
            {
            // InternalSqml.g:5797:2: ( ( (lv_explicit_0_0= 'ROW' ) )? otherlv_1= '(' ( (lv_expressions_2_0= ruleSqmlExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleSqmlExpression ) ) )* otherlv_5= ')' )
            // InternalSqml.g:5798:3: ( (lv_explicit_0_0= 'ROW' ) )? otherlv_1= '(' ( (lv_expressions_2_0= ruleSqmlExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleSqmlExpression ) ) )* otherlv_5= ')'
            {
            // InternalSqml.g:5798:3: ( (lv_explicit_0_0= 'ROW' ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==48) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalSqml.g:5799:4: (lv_explicit_0_0= 'ROW' )
                    {
                    // InternalSqml.g:5799:4: (lv_explicit_0_0= 'ROW' )
                    // InternalSqml.g:5800:5: lv_explicit_0_0= 'ROW'
                    {
                    lv_explicit_0_0=(Token)match(input,48,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_explicit_0_0, grammarAccess.getSqmlRowConstructorAccess().getExplicitROWKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlRowConstructorRule());
                      					}
                      					setWithLastConsumed(current, "explicit", lv_explicit_0_0 != null, "ROW");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,49,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSqmlRowConstructorAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSqml.g:5816:3: ( (lv_expressions_2_0= ruleSqmlExpression ) )
            // InternalSqml.g:5817:4: (lv_expressions_2_0= ruleSqmlExpression )
            {
            // InternalSqml.g:5817:4: (lv_expressions_2_0= ruleSqmlExpression )
            // InternalSqml.g:5818:5: lv_expressions_2_0= ruleSqmlExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlRowConstructorAccess().getExpressionsSqmlExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_35);
            lv_expressions_2_0=ruleSqmlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlRowConstructorRule());
              					}
              					add(
              						current,
              						"expressions",
              						lv_expressions_2_0,
              						"com.softicar.sqml.Sqml.SqmlExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSqml.g:5835:3: (otherlv_3= ',' ( (lv_expressions_4_0= ruleSqmlExpression ) ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==18) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalSqml.g:5836:4: otherlv_3= ',' ( (lv_expressions_4_0= ruleSqmlExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getSqmlRowConstructorAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalSqml.g:5840:4: ( (lv_expressions_4_0= ruleSqmlExpression ) )
            	    // InternalSqml.g:5841:5: (lv_expressions_4_0= ruleSqmlExpression )
            	    {
            	    // InternalSqml.g:5841:5: (lv_expressions_4_0= ruleSqmlExpression )
            	    // InternalSqml.g:5842:6: lv_expressions_4_0= ruleSqmlExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSqmlRowConstructorAccess().getExpressionsSqmlExpressionParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_35);
            	    lv_expressions_4_0=ruleSqmlExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSqmlRowConstructorRule());
            	      						}
            	      						add(
            	      							current,
            	      							"expressions",
            	      							lv_expressions_4_0,
            	      							"com.softicar.sqml.Sqml.SqmlExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);

            otherlv_5=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSqmlRowConstructorAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlRowConstructor"


    // $ANTLR start "entryRuleSqmlNegation"
    // InternalSqml.g:5868:1: entryRuleSqmlNegation returns [EObject current=null] : iv_ruleSqmlNegation= ruleSqmlNegation EOF ;
    public final EObject entryRuleSqmlNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlNegation = null;


        try {
            // InternalSqml.g:5868:53: (iv_ruleSqmlNegation= ruleSqmlNegation EOF )
            // InternalSqml.g:5869:2: iv_ruleSqmlNegation= ruleSqmlNegation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlNegationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlNegation=ruleSqmlNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlNegation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlNegation"


    // $ANTLR start "ruleSqmlNegation"
    // InternalSqml.g:5875:1: ruleSqmlNegation returns [EObject current=null] : (otherlv_0= '-' ( (lv_expression_1_0= ruleSqmlPrimay ) ) ) ;
    public final EObject ruleSqmlNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:5881:2: ( (otherlv_0= '-' ( (lv_expression_1_0= ruleSqmlPrimay ) ) ) )
            // InternalSqml.g:5882:2: (otherlv_0= '-' ( (lv_expression_1_0= ruleSqmlPrimay ) ) )
            {
            // InternalSqml.g:5882:2: (otherlv_0= '-' ( (lv_expression_1_0= ruleSqmlPrimay ) ) )
            // InternalSqml.g:5883:3: otherlv_0= '-' ( (lv_expression_1_0= ruleSqmlPrimay ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSqmlNegationAccess().getHyphenMinusKeyword_0());
              		
            }
            // InternalSqml.g:5887:3: ( (lv_expression_1_0= ruleSqmlPrimay ) )
            // InternalSqml.g:5888:4: (lv_expression_1_0= ruleSqmlPrimay )
            {
            // InternalSqml.g:5888:4: (lv_expression_1_0= ruleSqmlPrimay )
            // InternalSqml.g:5889:5: lv_expression_1_0= ruleSqmlPrimay
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlNegationAccess().getExpressionSqmlPrimayParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleSqmlPrimay();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlNegationRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_1_0,
              						"com.softicar.sqml.Sqml.SqmlPrimay");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlNegation"


    // $ANTLR start "entryRuleSqmlFunctionCall"
    // InternalSqml.g:5910:1: entryRuleSqmlFunctionCall returns [EObject current=null] : iv_ruleSqmlFunctionCall= ruleSqmlFunctionCall EOF ;
    public final EObject entryRuleSqmlFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlFunctionCall = null;


        try {
            // InternalSqml.g:5910:57: (iv_ruleSqmlFunctionCall= ruleSqmlFunctionCall EOF )
            // InternalSqml.g:5911:2: iv_ruleSqmlFunctionCall= ruleSqmlFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlFunctionCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlFunctionCall=ruleSqmlFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlFunctionCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlFunctionCall"


    // $ANTLR start "ruleSqmlFunctionCall"
    // InternalSqml.g:5917:1: ruleSqmlFunctionCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleSqmlOperand ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleSqmlOperand ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleSqmlFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:5923:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleSqmlOperand ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleSqmlOperand ) ) )* )? otherlv_5= ')' ) )
            // InternalSqml.g:5924:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleSqmlOperand ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleSqmlOperand ) ) )* )? otherlv_5= ')' )
            {
            // InternalSqml.g:5924:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleSqmlOperand ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleSqmlOperand ) ) )* )? otherlv_5= ')' )
            // InternalSqml.g:5925:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleSqmlOperand ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleSqmlOperand ) ) )* )? otherlv_5= ')'
            {
            // InternalSqml.g:5925:3: ( (otherlv_0= RULE_ID ) )
            // InternalSqml.g:5926:4: (otherlv_0= RULE_ID )
            {
            // InternalSqml.g:5926:4: (otherlv_0= RULE_ID )
            // InternalSqml.g:5927:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSqmlFunctionCallRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getSqmlFunctionCallAccess().getFunctionSqmlFunctionCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,49,FOLLOW_76); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSqmlFunctionCallAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSqml.g:5942:3: ( ( (lv_arguments_2_0= ruleSqmlOperand ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleSqmlOperand ) ) )* )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( ((LA77_0>=RULE_ID && LA77_0<=RULE_DOUBLE)||(LA77_0>=48 && LA77_0<=49)||LA77_0==51||LA77_0==65||LA77_0==74||LA77_0==78||(LA77_0>=80 && LA77_0<=81)||LA77_0==87||LA77_0==98||LA77_0==101||LA77_0==118) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalSqml.g:5943:4: ( (lv_arguments_2_0= ruleSqmlOperand ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleSqmlOperand ) ) )*
                    {
                    // InternalSqml.g:5943:4: ( (lv_arguments_2_0= ruleSqmlOperand ) )
                    // InternalSqml.g:5944:5: (lv_arguments_2_0= ruleSqmlOperand )
                    {
                    // InternalSqml.g:5944:5: (lv_arguments_2_0= ruleSqmlOperand )
                    // InternalSqml.g:5945:6: lv_arguments_2_0= ruleSqmlOperand
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSqmlFunctionCallAccess().getArgumentsSqmlOperandParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_35);
                    lv_arguments_2_0=ruleSqmlOperand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSqmlFunctionCallRule());
                      						}
                      						add(
                      							current,
                      							"arguments",
                      							lv_arguments_2_0,
                      							"com.softicar.sqml.Sqml.SqmlOperand");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSqml.g:5962:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleSqmlOperand ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==18) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalSqml.g:5963:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleSqmlOperand ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_59); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getSqmlFunctionCallAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalSqml.g:5967:5: ( (lv_arguments_4_0= ruleSqmlOperand ) )
                    	    // InternalSqml.g:5968:6: (lv_arguments_4_0= ruleSqmlOperand )
                    	    {
                    	    // InternalSqml.g:5968:6: (lv_arguments_4_0= ruleSqmlOperand )
                    	    // InternalSqml.g:5969:7: lv_arguments_4_0= ruleSqmlOperand
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSqmlFunctionCallAccess().getArgumentsSqmlOperandParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_35);
                    	    lv_arguments_4_0=ruleSqmlOperand();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSqmlFunctionCallRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"arguments",
                    	      								lv_arguments_4_0,
                    	      								"com.softicar.sqml.Sqml.SqmlOperand");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSqmlFunctionCallAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlFunctionCall"


    // $ANTLR start "entryRuleSqmlGroupConcat"
    // InternalSqml.g:5996:1: entryRuleSqmlGroupConcat returns [EObject current=null] : iv_ruleSqmlGroupConcat= ruleSqmlGroupConcat EOF ;
    public final EObject entryRuleSqmlGroupConcat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlGroupConcat = null;


        try {
            // InternalSqml.g:5996:56: (iv_ruleSqmlGroupConcat= ruleSqmlGroupConcat EOF )
            // InternalSqml.g:5997:2: iv_ruleSqmlGroupConcat= ruleSqmlGroupConcat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlGroupConcatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlGroupConcat=ruleSqmlGroupConcat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlGroupConcat; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlGroupConcat"


    // $ANTLR start "ruleSqmlGroupConcat"
    // InternalSqml.g:6003:1: ruleSqmlGroupConcat returns [EObject current=null] : (otherlv_0= 'GROUP_CONCAT' otherlv_1= '(' ( (lv_distinct_2_0= 'DISTINCT' ) )? ( (lv_expressions_3_0= ruleSqmlOperand ) ) (otherlv_4= ',' ( (lv_expressions_5_0= ruleSqmlOperand ) ) )* (otherlv_6= 'ORDER' otherlv_7= 'BY' ( (lv_orderByExpressions_8_0= ruleSqmlOrderByExpression ) ) (otherlv_9= ',' ( (lv_orderByExpressions_10_0= ruleSqmlOrderByExpression ) ) )* )? (otherlv_11= 'SEPARATOR' ( (lv_separator_12_0= RULE_STRING ) ) )? otherlv_13= ')' ) ;
    public final EObject ruleSqmlGroupConcat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_distinct_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_separator_12_0=null;
        Token otherlv_13=null;
        EObject lv_expressions_3_0 = null;

        EObject lv_expressions_5_0 = null;

        EObject lv_orderByExpressions_8_0 = null;

        EObject lv_orderByExpressions_10_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:6009:2: ( (otherlv_0= 'GROUP_CONCAT' otherlv_1= '(' ( (lv_distinct_2_0= 'DISTINCT' ) )? ( (lv_expressions_3_0= ruleSqmlOperand ) ) (otherlv_4= ',' ( (lv_expressions_5_0= ruleSqmlOperand ) ) )* (otherlv_6= 'ORDER' otherlv_7= 'BY' ( (lv_orderByExpressions_8_0= ruleSqmlOrderByExpression ) ) (otherlv_9= ',' ( (lv_orderByExpressions_10_0= ruleSqmlOrderByExpression ) ) )* )? (otherlv_11= 'SEPARATOR' ( (lv_separator_12_0= RULE_STRING ) ) )? otherlv_13= ')' ) )
            // InternalSqml.g:6010:2: (otherlv_0= 'GROUP_CONCAT' otherlv_1= '(' ( (lv_distinct_2_0= 'DISTINCT' ) )? ( (lv_expressions_3_0= ruleSqmlOperand ) ) (otherlv_4= ',' ( (lv_expressions_5_0= ruleSqmlOperand ) ) )* (otherlv_6= 'ORDER' otherlv_7= 'BY' ( (lv_orderByExpressions_8_0= ruleSqmlOrderByExpression ) ) (otherlv_9= ',' ( (lv_orderByExpressions_10_0= ruleSqmlOrderByExpression ) ) )* )? (otherlv_11= 'SEPARATOR' ( (lv_separator_12_0= RULE_STRING ) ) )? otherlv_13= ')' )
            {
            // InternalSqml.g:6010:2: (otherlv_0= 'GROUP_CONCAT' otherlv_1= '(' ( (lv_distinct_2_0= 'DISTINCT' ) )? ( (lv_expressions_3_0= ruleSqmlOperand ) ) (otherlv_4= ',' ( (lv_expressions_5_0= ruleSqmlOperand ) ) )* (otherlv_6= 'ORDER' otherlv_7= 'BY' ( (lv_orderByExpressions_8_0= ruleSqmlOrderByExpression ) ) (otherlv_9= ',' ( (lv_orderByExpressions_10_0= ruleSqmlOrderByExpression ) ) )* )? (otherlv_11= 'SEPARATOR' ( (lv_separator_12_0= RULE_STRING ) ) )? otherlv_13= ')' )
            // InternalSqml.g:6011:3: otherlv_0= 'GROUP_CONCAT' otherlv_1= '(' ( (lv_distinct_2_0= 'DISTINCT' ) )? ( (lv_expressions_3_0= ruleSqmlOperand ) ) (otherlv_4= ',' ( (lv_expressions_5_0= ruleSqmlOperand ) ) )* (otherlv_6= 'ORDER' otherlv_7= 'BY' ( (lv_orderByExpressions_8_0= ruleSqmlOrderByExpression ) ) (otherlv_9= ',' ( (lv_orderByExpressions_10_0= ruleSqmlOrderByExpression ) ) )* )? (otherlv_11= 'SEPARATOR' ( (lv_separator_12_0= RULE_STRING ) ) )? otherlv_13= ')'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSqmlGroupConcatAccess().getGROUP_CONCATKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,49,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSqmlGroupConcatAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSqml.g:6019:3: ( (lv_distinct_2_0= 'DISTINCT' ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==68) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalSqml.g:6020:4: (lv_distinct_2_0= 'DISTINCT' )
                    {
                    // InternalSqml.g:6020:4: (lv_distinct_2_0= 'DISTINCT' )
                    // InternalSqml.g:6021:5: lv_distinct_2_0= 'DISTINCT'
                    {
                    lv_distinct_2_0=(Token)match(input,68,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_distinct_2_0, grammarAccess.getSqmlGroupConcatAccess().getDistinctDISTINCTKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlGroupConcatRule());
                      					}
                      					setWithLastConsumed(current, "distinct", lv_distinct_2_0 != null, "DISTINCT");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSqml.g:6033:3: ( (lv_expressions_3_0= ruleSqmlOperand ) )
            // InternalSqml.g:6034:4: (lv_expressions_3_0= ruleSqmlOperand )
            {
            // InternalSqml.g:6034:4: (lv_expressions_3_0= ruleSqmlOperand )
            // InternalSqml.g:6035:5: lv_expressions_3_0= ruleSqmlOperand
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlGroupConcatAccess().getExpressionsSqmlOperandParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_77);
            lv_expressions_3_0=ruleSqmlOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlGroupConcatRule());
              					}
              					add(
              						current,
              						"expressions",
              						lv_expressions_3_0,
              						"com.softicar.sqml.Sqml.SqmlOperand");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSqml.g:6052:3: (otherlv_4= ',' ( (lv_expressions_5_0= ruleSqmlOperand ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==18) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalSqml.g:6053:4: otherlv_4= ',' ( (lv_expressions_5_0= ruleSqmlOperand ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getSqmlGroupConcatAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalSqml.g:6057:4: ( (lv_expressions_5_0= ruleSqmlOperand ) )
            	    // InternalSqml.g:6058:5: (lv_expressions_5_0= ruleSqmlOperand )
            	    {
            	    // InternalSqml.g:6058:5: (lv_expressions_5_0= ruleSqmlOperand )
            	    // InternalSqml.g:6059:6: lv_expressions_5_0= ruleSqmlOperand
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSqmlGroupConcatAccess().getExpressionsSqmlOperandParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_77);
            	    lv_expressions_5_0=ruleSqmlOperand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSqmlGroupConcatRule());
            	      						}
            	      						add(
            	      							current,
            	      							"expressions",
            	      							lv_expressions_5_0,
            	      							"com.softicar.sqml.Sqml.SqmlOperand");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            // InternalSqml.g:6077:3: (otherlv_6= 'ORDER' otherlv_7= 'BY' ( (lv_orderByExpressions_8_0= ruleSqmlOrderByExpression ) ) (otherlv_9= ',' ( (lv_orderByExpressions_10_0= ruleSqmlOrderByExpression ) ) )* )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==91) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalSqml.g:6078:4: otherlv_6= 'ORDER' otherlv_7= 'BY' ( (lv_orderByExpressions_8_0= ruleSqmlOrderByExpression ) ) (otherlv_9= ',' ( (lv_orderByExpressions_10_0= ruleSqmlOrderByExpression ) ) )*
                    {
                    otherlv_6=(Token)match(input,91,FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getSqmlGroupConcatAccess().getORDERKeyword_5_0());
                      			
                    }
                    otherlv_7=(Token)match(input,63,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getSqmlGroupConcatAccess().getBYKeyword_5_1());
                      			
                    }
                    // InternalSqml.g:6086:4: ( (lv_orderByExpressions_8_0= ruleSqmlOrderByExpression ) )
                    // InternalSqml.g:6087:5: (lv_orderByExpressions_8_0= ruleSqmlOrderByExpression )
                    {
                    // InternalSqml.g:6087:5: (lv_orderByExpressions_8_0= ruleSqmlOrderByExpression )
                    // InternalSqml.g:6088:6: lv_orderByExpressions_8_0= ruleSqmlOrderByExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSqmlGroupConcatAccess().getOrderByExpressionsSqmlOrderByExpressionParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_78);
                    lv_orderByExpressions_8_0=ruleSqmlOrderByExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSqmlGroupConcatRule());
                      						}
                      						add(
                      							current,
                      							"orderByExpressions",
                      							lv_orderByExpressions_8_0,
                      							"com.softicar.sqml.Sqml.SqmlOrderByExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSqml.g:6105:4: (otherlv_9= ',' ( (lv_orderByExpressions_10_0= ruleSqmlOrderByExpression ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==18) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // InternalSqml.g:6106:5: otherlv_9= ',' ( (lv_orderByExpressions_10_0= ruleSqmlOrderByExpression ) )
                    	    {
                    	    otherlv_9=(Token)match(input,18,FOLLOW_59); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_9, grammarAccess.getSqmlGroupConcatAccess().getCommaKeyword_5_3_0());
                    	      				
                    	    }
                    	    // InternalSqml.g:6110:5: ( (lv_orderByExpressions_10_0= ruleSqmlOrderByExpression ) )
                    	    // InternalSqml.g:6111:6: (lv_orderByExpressions_10_0= ruleSqmlOrderByExpression )
                    	    {
                    	    // InternalSqml.g:6111:6: (lv_orderByExpressions_10_0= ruleSqmlOrderByExpression )
                    	    // InternalSqml.g:6112:7: lv_orderByExpressions_10_0= ruleSqmlOrderByExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSqmlGroupConcatAccess().getOrderByExpressionsSqmlOrderByExpressionParserRuleCall_5_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_78);
                    	    lv_orderByExpressions_10_0=ruleSqmlOrderByExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSqmlGroupConcatRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"orderByExpressions",
                    	      								lv_orderByExpressions_10_0,
                    	      								"com.softicar.sqml.Sqml.SqmlOrderByExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSqml.g:6131:3: (otherlv_11= 'SEPARATOR' ( (lv_separator_12_0= RULE_STRING ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==95) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalSqml.g:6132:4: otherlv_11= 'SEPARATOR' ( (lv_separator_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,95,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getSqmlGroupConcatAccess().getSEPARATORKeyword_6_0());
                      			
                    }
                    // InternalSqml.g:6136:4: ( (lv_separator_12_0= RULE_STRING ) )
                    // InternalSqml.g:6137:5: (lv_separator_12_0= RULE_STRING )
                    {
                    // InternalSqml.g:6137:5: (lv_separator_12_0= RULE_STRING )
                    // InternalSqml.g:6138:6: lv_separator_12_0= RULE_STRING
                    {
                    lv_separator_12_0=(Token)match(input,RULE_STRING,FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_separator_12_0, grammarAccess.getSqmlGroupConcatAccess().getSeparatorSTRINGTerminalRuleCall_6_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSqmlGroupConcatRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"separator",
                      							lv_separator_12_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getSqmlGroupConcatAccess().getRightParenthesisKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlGroupConcat"


    // $ANTLR start "entryRuleSqmlCase"
    // InternalSqml.g:6163:1: entryRuleSqmlCase returns [EObject current=null] : iv_ruleSqmlCase= ruleSqmlCase EOF ;
    public final EObject entryRuleSqmlCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlCase = null;


        try {
            // InternalSqml.g:6163:49: (iv_ruleSqmlCase= ruleSqmlCase EOF )
            // InternalSqml.g:6164:2: iv_ruleSqmlCase= ruleSqmlCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlCaseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlCase=ruleSqmlCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlCase; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlCase"


    // $ANTLR start "ruleSqmlCase"
    // InternalSqml.g:6170:1: ruleSqmlCase returns [EObject current=null] : (otherlv_0= 'CASE' ( (lv_operand_1_0= ruleSqmlExpression ) )? ( (lv_whens_2_0= ruleSqmlCaseWhen ) )+ (otherlv_3= 'ELSE' ( (lv_elseExpression_4_0= ruleSqmlExpression ) ) )? otherlv_5= 'END' ) ;
    public final EObject ruleSqmlCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_operand_1_0 = null;

        EObject lv_whens_2_0 = null;

        EObject lv_elseExpression_4_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:6176:2: ( (otherlv_0= 'CASE' ( (lv_operand_1_0= ruleSqmlExpression ) )? ( (lv_whens_2_0= ruleSqmlCaseWhen ) )+ (otherlv_3= 'ELSE' ( (lv_elseExpression_4_0= ruleSqmlExpression ) ) )? otherlv_5= 'END' ) )
            // InternalSqml.g:6177:2: (otherlv_0= 'CASE' ( (lv_operand_1_0= ruleSqmlExpression ) )? ( (lv_whens_2_0= ruleSqmlCaseWhen ) )+ (otherlv_3= 'ELSE' ( (lv_elseExpression_4_0= ruleSqmlExpression ) ) )? otherlv_5= 'END' )
            {
            // InternalSqml.g:6177:2: (otherlv_0= 'CASE' ( (lv_operand_1_0= ruleSqmlExpression ) )? ( (lv_whens_2_0= ruleSqmlCaseWhen ) )+ (otherlv_3= 'ELSE' ( (lv_elseExpression_4_0= ruleSqmlExpression ) ) )? otherlv_5= 'END' )
            // InternalSqml.g:6178:3: otherlv_0= 'CASE' ( (lv_operand_1_0= ruleSqmlExpression ) )? ( (lv_whens_2_0= ruleSqmlCaseWhen ) )+ (otherlv_3= 'ELSE' ( (lv_elseExpression_4_0= ruleSqmlExpression ) ) )? otherlv_5= 'END'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_79); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSqmlCaseAccess().getCASEKeyword_0());
              		
            }
            // InternalSqml.g:6182:3: ( (lv_operand_1_0= ruleSqmlExpression ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( ((LA83_0>=RULE_ID && LA83_0<=RULE_DOUBLE)||(LA83_0>=48 && LA83_0<=49)||LA83_0==51||LA83_0==65||(LA83_0>=73 && LA83_0<=74)||LA83_0==78||(LA83_0>=80 && LA83_0<=81)||LA83_0==87||LA83_0==89||LA83_0==98||LA83_0==101||LA83_0==118) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalSqml.g:6183:4: (lv_operand_1_0= ruleSqmlExpression )
                    {
                    // InternalSqml.g:6183:4: (lv_operand_1_0= ruleSqmlExpression )
                    // InternalSqml.g:6184:5: lv_operand_1_0= ruleSqmlExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSqmlCaseAccess().getOperandSqmlExpressionParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_79);
                    lv_operand_1_0=ruleSqmlExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSqmlCaseRule());
                      					}
                      					set(
                      						current,
                      						"operand",
                      						lv_operand_1_0,
                      						"com.softicar.sqml.Sqml.SqmlExpression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSqml.g:6201:3: ( (lv_whens_2_0= ruleSqmlCaseWhen ) )+
            int cnt84=0;
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==102) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalSqml.g:6202:4: (lv_whens_2_0= ruleSqmlCaseWhen )
            	    {
            	    // InternalSqml.g:6202:4: (lv_whens_2_0= ruleSqmlCaseWhen )
            	    // InternalSqml.g:6203:5: lv_whens_2_0= ruleSqmlCaseWhen
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSqmlCaseAccess().getWhensSqmlCaseWhenParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_80);
            	    lv_whens_2_0=ruleSqmlCaseWhen();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSqmlCaseRule());
            	      					}
            	      					add(
            	      						current,
            	      						"whens",
            	      						lv_whens_2_0,
            	      						"com.softicar.sqml.Sqml.SqmlCaseWhen");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt84 >= 1 ) break loop84;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(84, input);
                        throw eee;
                }
                cnt84++;
            } while (true);

            // InternalSqml.g:6220:3: (otherlv_3= 'ELSE' ( (lv_elseExpression_4_0= ruleSqmlExpression ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==69) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalSqml.g:6221:4: otherlv_3= 'ELSE' ( (lv_elseExpression_4_0= ruleSqmlExpression ) )
                    {
                    otherlv_3=(Token)match(input,69,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSqmlCaseAccess().getELSEKeyword_3_0());
                      			
                    }
                    // InternalSqml.g:6225:4: ( (lv_elseExpression_4_0= ruleSqmlExpression ) )
                    // InternalSqml.g:6226:5: (lv_elseExpression_4_0= ruleSqmlExpression )
                    {
                    // InternalSqml.g:6226:5: (lv_elseExpression_4_0= ruleSqmlExpression )
                    // InternalSqml.g:6227:6: lv_elseExpression_4_0= ruleSqmlExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSqmlCaseAccess().getElseExpressionSqmlExpressionParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_81);
                    lv_elseExpression_4_0=ruleSqmlExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSqmlCaseRule());
                      						}
                      						set(
                      							current,
                      							"elseExpression",
                      							lv_elseExpression_4_0,
                      							"com.softicar.sqml.Sqml.SqmlExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSqmlCaseAccess().getENDKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlCase"


    // $ANTLR start "entryRuleSqmlCaseWhen"
    // InternalSqml.g:6253:1: entryRuleSqmlCaseWhen returns [EObject current=null] : iv_ruleSqmlCaseWhen= ruleSqmlCaseWhen EOF ;
    public final EObject entryRuleSqmlCaseWhen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlCaseWhen = null;


        try {
            // InternalSqml.g:6253:53: (iv_ruleSqmlCaseWhen= ruleSqmlCaseWhen EOF )
            // InternalSqml.g:6254:2: iv_ruleSqmlCaseWhen= ruleSqmlCaseWhen EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlCaseWhenRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlCaseWhen=ruleSqmlCaseWhen();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlCaseWhen; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlCaseWhen"


    // $ANTLR start "ruleSqmlCaseWhen"
    // InternalSqml.g:6260:1: ruleSqmlCaseWhen returns [EObject current=null] : (otherlv_0= 'WHEN' ( (lv_whenExpression_1_0= ruleSqmlExpression ) ) otherlv_2= 'THEN' ( (lv_thenExpression_3_0= ruleSqmlExpression ) ) ) ;
    public final EObject ruleSqmlCaseWhen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_whenExpression_1_0 = null;

        EObject lv_thenExpression_3_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:6266:2: ( (otherlv_0= 'WHEN' ( (lv_whenExpression_1_0= ruleSqmlExpression ) ) otherlv_2= 'THEN' ( (lv_thenExpression_3_0= ruleSqmlExpression ) ) ) )
            // InternalSqml.g:6267:2: (otherlv_0= 'WHEN' ( (lv_whenExpression_1_0= ruleSqmlExpression ) ) otherlv_2= 'THEN' ( (lv_thenExpression_3_0= ruleSqmlExpression ) ) )
            {
            // InternalSqml.g:6267:2: (otherlv_0= 'WHEN' ( (lv_whenExpression_1_0= ruleSqmlExpression ) ) otherlv_2= 'THEN' ( (lv_thenExpression_3_0= ruleSqmlExpression ) ) )
            // InternalSqml.g:6268:3: otherlv_0= 'WHEN' ( (lv_whenExpression_1_0= ruleSqmlExpression ) ) otherlv_2= 'THEN' ( (lv_thenExpression_3_0= ruleSqmlExpression ) )
            {
            otherlv_0=(Token)match(input,102,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSqmlCaseWhenAccess().getWHENKeyword_0());
              		
            }
            // InternalSqml.g:6272:3: ( (lv_whenExpression_1_0= ruleSqmlExpression ) )
            // InternalSqml.g:6273:4: (lv_whenExpression_1_0= ruleSqmlExpression )
            {
            // InternalSqml.g:6273:4: (lv_whenExpression_1_0= ruleSqmlExpression )
            // InternalSqml.g:6274:5: lv_whenExpression_1_0= ruleSqmlExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlCaseWhenAccess().getWhenExpressionSqmlExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_82);
            lv_whenExpression_1_0=ruleSqmlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlCaseWhenRule());
              					}
              					set(
              						current,
              						"whenExpression",
              						lv_whenExpression_1_0,
              						"com.softicar.sqml.Sqml.SqmlExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,99,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSqmlCaseWhenAccess().getTHENKeyword_2());
              		
            }
            // InternalSqml.g:6295:3: ( (lv_thenExpression_3_0= ruleSqmlExpression ) )
            // InternalSqml.g:6296:4: (lv_thenExpression_3_0= ruleSqmlExpression )
            {
            // InternalSqml.g:6296:4: (lv_thenExpression_3_0= ruleSqmlExpression )
            // InternalSqml.g:6297:5: lv_thenExpression_3_0= ruleSqmlExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlCaseWhenAccess().getThenExpressionSqmlExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_thenExpression_3_0=ruleSqmlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlCaseWhenRule());
              					}
              					set(
              						current,
              						"thenExpression",
              						lv_thenExpression_3_0,
              						"com.softicar.sqml.Sqml.SqmlExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlCaseWhen"


    // $ANTLR start "entryRuleSqmlIf"
    // InternalSqml.g:6318:1: entryRuleSqmlIf returns [EObject current=null] : iv_ruleSqmlIf= ruleSqmlIf EOF ;
    public final EObject entryRuleSqmlIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlIf = null;


        try {
            // InternalSqml.g:6318:47: (iv_ruleSqmlIf= ruleSqmlIf EOF )
            // InternalSqml.g:6319:2: iv_ruleSqmlIf= ruleSqmlIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlIfRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlIf=ruleSqmlIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlIf; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlIf"


    // $ANTLR start "ruleSqmlIf"
    // InternalSqml.g:6325:1: ruleSqmlIf returns [EObject current=null] : (otherlv_0= 'IF' otherlv_1= '(' ( (lv_condition_2_0= ruleSqmlExpression ) ) otherlv_3= ',' ( (lv_thenExpression_4_0= ruleSqmlExpression ) ) otherlv_5= ',' ( (lv_elseExpression_6_0= ruleSqmlExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleSqmlIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_condition_2_0 = null;

        EObject lv_thenExpression_4_0 = null;

        EObject lv_elseExpression_6_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:6331:2: ( (otherlv_0= 'IF' otherlv_1= '(' ( (lv_condition_2_0= ruleSqmlExpression ) ) otherlv_3= ',' ( (lv_thenExpression_4_0= ruleSqmlExpression ) ) otherlv_5= ',' ( (lv_elseExpression_6_0= ruleSqmlExpression ) ) otherlv_7= ')' ) )
            // InternalSqml.g:6332:2: (otherlv_0= 'IF' otherlv_1= '(' ( (lv_condition_2_0= ruleSqmlExpression ) ) otherlv_3= ',' ( (lv_thenExpression_4_0= ruleSqmlExpression ) ) otherlv_5= ',' ( (lv_elseExpression_6_0= ruleSqmlExpression ) ) otherlv_7= ')' )
            {
            // InternalSqml.g:6332:2: (otherlv_0= 'IF' otherlv_1= '(' ( (lv_condition_2_0= ruleSqmlExpression ) ) otherlv_3= ',' ( (lv_thenExpression_4_0= ruleSqmlExpression ) ) otherlv_5= ',' ( (lv_elseExpression_6_0= ruleSqmlExpression ) ) otherlv_7= ')' )
            // InternalSqml.g:6333:3: otherlv_0= 'IF' otherlv_1= '(' ( (lv_condition_2_0= ruleSqmlExpression ) ) otherlv_3= ',' ( (lv_thenExpression_4_0= ruleSqmlExpression ) ) otherlv_5= ',' ( (lv_elseExpression_6_0= ruleSqmlExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSqmlIfAccess().getIFKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,49,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSqmlIfAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSqml.g:6341:3: ( (lv_condition_2_0= ruleSqmlExpression ) )
            // InternalSqml.g:6342:4: (lv_condition_2_0= ruleSqmlExpression )
            {
            // InternalSqml.g:6342:4: (lv_condition_2_0= ruleSqmlExpression )
            // InternalSqml.g:6343:5: lv_condition_2_0= ruleSqmlExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlIfAccess().getConditionSqmlExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_condition_2_0=ruleSqmlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlIfRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_2_0,
              						"com.softicar.sqml.Sqml.SqmlExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSqmlIfAccess().getCommaKeyword_3());
              		
            }
            // InternalSqml.g:6364:3: ( (lv_thenExpression_4_0= ruleSqmlExpression ) )
            // InternalSqml.g:6365:4: (lv_thenExpression_4_0= ruleSqmlExpression )
            {
            // InternalSqml.g:6365:4: (lv_thenExpression_4_0= ruleSqmlExpression )
            // InternalSqml.g:6366:5: lv_thenExpression_4_0= ruleSqmlExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlIfAccess().getThenExpressionSqmlExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_thenExpression_4_0=ruleSqmlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlIfRule());
              					}
              					set(
              						current,
              						"thenExpression",
              						lv_thenExpression_4_0,
              						"com.softicar.sqml.Sqml.SqmlExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSqmlIfAccess().getCommaKeyword_5());
              		
            }
            // InternalSqml.g:6387:3: ( (lv_elseExpression_6_0= ruleSqmlExpression ) )
            // InternalSqml.g:6388:4: (lv_elseExpression_6_0= ruleSqmlExpression )
            {
            // InternalSqml.g:6388:4: (lv_elseExpression_6_0= ruleSqmlExpression )
            // InternalSqml.g:6389:5: lv_elseExpression_6_0= ruleSqmlExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlIfAccess().getElseExpressionSqmlExpressionParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_56);
            lv_elseExpression_6_0=ruleSqmlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlIfRule());
              					}
              					set(
              						current,
              						"elseExpression",
              						lv_elseExpression_6_0,
              						"com.softicar.sqml.Sqml.SqmlExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getSqmlIfAccess().getRightParenthesisKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlIf"


    // $ANTLR start "entryRuleSqmlIfNull"
    // InternalSqml.g:6414:1: entryRuleSqmlIfNull returns [EObject current=null] : iv_ruleSqmlIfNull= ruleSqmlIfNull EOF ;
    public final EObject entryRuleSqmlIfNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlIfNull = null;


        try {
            // InternalSqml.g:6414:51: (iv_ruleSqmlIfNull= ruleSqmlIfNull EOF )
            // InternalSqml.g:6415:2: iv_ruleSqmlIfNull= ruleSqmlIfNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlIfNullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlIfNull=ruleSqmlIfNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlIfNull; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlIfNull"


    // $ANTLR start "ruleSqmlIfNull"
    // InternalSqml.g:6421:1: ruleSqmlIfNull returns [EObject current=null] : (otherlv_0= 'IFNULL' otherlv_1= '(' ( (lv_testExpression_2_0= ruleSqmlExpression ) ) otherlv_3= ',' ( (lv_thenExpression_4_0= ruleSqmlExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleSqmlIfNull() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_testExpression_2_0 = null;

        EObject lv_thenExpression_4_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:6427:2: ( (otherlv_0= 'IFNULL' otherlv_1= '(' ( (lv_testExpression_2_0= ruleSqmlExpression ) ) otherlv_3= ',' ( (lv_thenExpression_4_0= ruleSqmlExpression ) ) otherlv_5= ')' ) )
            // InternalSqml.g:6428:2: (otherlv_0= 'IFNULL' otherlv_1= '(' ( (lv_testExpression_2_0= ruleSqmlExpression ) ) otherlv_3= ',' ( (lv_thenExpression_4_0= ruleSqmlExpression ) ) otherlv_5= ')' )
            {
            // InternalSqml.g:6428:2: (otherlv_0= 'IFNULL' otherlv_1= '(' ( (lv_testExpression_2_0= ruleSqmlExpression ) ) otherlv_3= ',' ( (lv_thenExpression_4_0= ruleSqmlExpression ) ) otherlv_5= ')' )
            // InternalSqml.g:6429:3: otherlv_0= 'IFNULL' otherlv_1= '(' ( (lv_testExpression_2_0= ruleSqmlExpression ) ) otherlv_3= ',' ( (lv_thenExpression_4_0= ruleSqmlExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,81,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSqmlIfNullAccess().getIFNULLKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,49,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSqmlIfNullAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSqml.g:6437:3: ( (lv_testExpression_2_0= ruleSqmlExpression ) )
            // InternalSqml.g:6438:4: (lv_testExpression_2_0= ruleSqmlExpression )
            {
            // InternalSqml.g:6438:4: (lv_testExpression_2_0= ruleSqmlExpression )
            // InternalSqml.g:6439:5: lv_testExpression_2_0= ruleSqmlExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlIfNullAccess().getTestExpressionSqmlExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_testExpression_2_0=ruleSqmlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlIfNullRule());
              					}
              					set(
              						current,
              						"testExpression",
              						lv_testExpression_2_0,
              						"com.softicar.sqml.Sqml.SqmlExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSqmlIfNullAccess().getCommaKeyword_3());
              		
            }
            // InternalSqml.g:6460:3: ( (lv_thenExpression_4_0= ruleSqmlExpression ) )
            // InternalSqml.g:6461:4: (lv_thenExpression_4_0= ruleSqmlExpression )
            {
            // InternalSqml.g:6461:4: (lv_thenExpression_4_0= ruleSqmlExpression )
            // InternalSqml.g:6462:5: lv_thenExpression_4_0= ruleSqmlExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlIfNullAccess().getThenExpressionSqmlExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_56);
            lv_thenExpression_4_0=ruleSqmlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlIfNullRule());
              					}
              					set(
              						current,
              						"thenExpression",
              						lv_thenExpression_4_0,
              						"com.softicar.sqml.Sqml.SqmlExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSqmlIfNullAccess().getRightParenthesisKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlIfNull"


    // $ANTLR start "entryRuleSqmlStaticIf"
    // InternalSqml.g:6487:1: entryRuleSqmlStaticIf returns [EObject current=null] : iv_ruleSqmlStaticIf= ruleSqmlStaticIf EOF ;
    public final EObject entryRuleSqmlStaticIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlStaticIf = null;


        try {
            // InternalSqml.g:6487:53: (iv_ruleSqmlStaticIf= ruleSqmlStaticIf EOF )
            // InternalSqml.g:6488:2: iv_ruleSqmlStaticIf= ruleSqmlStaticIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlStaticIfRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlStaticIf=ruleSqmlStaticIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlStaticIf; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlStaticIf"


    // $ANTLR start "ruleSqmlStaticIf"
    // InternalSqml.g:6494:1: ruleSqmlStaticIf returns [EObject current=null] : (otherlv_0= 'STATIC' otherlv_1= 'IF' ( (lv_conditions_2_0= ruleSqmlStaticExpression ) ) otherlv_3= '{' ( (lv_expressions_4_0= ruleSqmlExpression ) ) otherlv_5= '}' ( ( ( ( 'ELSE' 'IF' ) )=> (otherlv_6= 'ELSE' otherlv_7= 'IF' ) ) ( (lv_conditions_8_0= ruleSqmlStaticExpression ) ) otherlv_9= '{' ( (lv_expressions_10_0= ruleSqmlExpression ) ) otherlv_11= '}' )* (otherlv_12= 'ELSE' otherlv_13= '{' ( (lv_elseExpression_14_0= ruleSqmlExpression ) ) otherlv_15= '}' )? ) ;
    public final EObject ruleSqmlStaticIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_conditions_2_0 = null;

        EObject lv_expressions_4_0 = null;

        EObject lv_conditions_8_0 = null;

        EObject lv_expressions_10_0 = null;

        EObject lv_elseExpression_14_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:6500:2: ( (otherlv_0= 'STATIC' otherlv_1= 'IF' ( (lv_conditions_2_0= ruleSqmlStaticExpression ) ) otherlv_3= '{' ( (lv_expressions_4_0= ruleSqmlExpression ) ) otherlv_5= '}' ( ( ( ( 'ELSE' 'IF' ) )=> (otherlv_6= 'ELSE' otherlv_7= 'IF' ) ) ( (lv_conditions_8_0= ruleSqmlStaticExpression ) ) otherlv_9= '{' ( (lv_expressions_10_0= ruleSqmlExpression ) ) otherlv_11= '}' )* (otherlv_12= 'ELSE' otherlv_13= '{' ( (lv_elseExpression_14_0= ruleSqmlExpression ) ) otherlv_15= '}' )? ) )
            // InternalSqml.g:6501:2: (otherlv_0= 'STATIC' otherlv_1= 'IF' ( (lv_conditions_2_0= ruleSqmlStaticExpression ) ) otherlv_3= '{' ( (lv_expressions_4_0= ruleSqmlExpression ) ) otherlv_5= '}' ( ( ( ( 'ELSE' 'IF' ) )=> (otherlv_6= 'ELSE' otherlv_7= 'IF' ) ) ( (lv_conditions_8_0= ruleSqmlStaticExpression ) ) otherlv_9= '{' ( (lv_expressions_10_0= ruleSqmlExpression ) ) otherlv_11= '}' )* (otherlv_12= 'ELSE' otherlv_13= '{' ( (lv_elseExpression_14_0= ruleSqmlExpression ) ) otherlv_15= '}' )? )
            {
            // InternalSqml.g:6501:2: (otherlv_0= 'STATIC' otherlv_1= 'IF' ( (lv_conditions_2_0= ruleSqmlStaticExpression ) ) otherlv_3= '{' ( (lv_expressions_4_0= ruleSqmlExpression ) ) otherlv_5= '}' ( ( ( ( 'ELSE' 'IF' ) )=> (otherlv_6= 'ELSE' otherlv_7= 'IF' ) ) ( (lv_conditions_8_0= ruleSqmlStaticExpression ) ) otherlv_9= '{' ( (lv_expressions_10_0= ruleSqmlExpression ) ) otherlv_11= '}' )* (otherlv_12= 'ELSE' otherlv_13= '{' ( (lv_elseExpression_14_0= ruleSqmlExpression ) ) otherlv_15= '}' )? )
            // InternalSqml.g:6502:3: otherlv_0= 'STATIC' otherlv_1= 'IF' ( (lv_conditions_2_0= ruleSqmlStaticExpression ) ) otherlv_3= '{' ( (lv_expressions_4_0= ruleSqmlExpression ) ) otherlv_5= '}' ( ( ( ( 'ELSE' 'IF' ) )=> (otherlv_6= 'ELSE' otherlv_7= 'IF' ) ) ( (lv_conditions_8_0= ruleSqmlStaticExpression ) ) otherlv_9= '{' ( (lv_expressions_10_0= ruleSqmlExpression ) ) otherlv_11= '}' )* (otherlv_12= 'ELSE' otherlv_13= '{' ( (lv_elseExpression_14_0= ruleSqmlExpression ) ) otherlv_15= '}' )?
            {
            otherlv_0=(Token)match(input,98,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSqmlStaticIfAccess().getSTATICKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,80,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSqmlStaticIfAccess().getIFKeyword_1());
              		
            }
            // InternalSqml.g:6510:3: ( (lv_conditions_2_0= ruleSqmlStaticExpression ) )
            // InternalSqml.g:6511:4: (lv_conditions_2_0= ruleSqmlStaticExpression )
            {
            // InternalSqml.g:6511:4: (lv_conditions_2_0= ruleSqmlStaticExpression )
            // InternalSqml.g:6512:5: lv_conditions_2_0= ruleSqmlStaticExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlStaticIfAccess().getConditionsSqmlStaticExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_conditions_2_0=ruleSqmlStaticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlStaticIfRule());
              					}
              					add(
              						current,
              						"conditions",
              						lv_conditions_2_0,
              						"com.softicar.sqml.Sqml.SqmlStaticExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSqmlStaticIfAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalSqml.g:6533:3: ( (lv_expressions_4_0= ruleSqmlExpression ) )
            // InternalSqml.g:6534:4: (lv_expressions_4_0= ruleSqmlExpression )
            {
            // InternalSqml.g:6534:4: (lv_expressions_4_0= ruleSqmlExpression )
            // InternalSqml.g:6535:5: lv_expressions_4_0= ruleSqmlExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlStaticIfAccess().getExpressionsSqmlExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_expressions_4_0=ruleSqmlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlStaticIfRule());
              					}
              					add(
              						current,
              						"expressions",
              						lv_expressions_4_0,
              						"com.softicar.sqml.Sqml.SqmlExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSqmlStaticIfAccess().getRightCurlyBracketKeyword_5());
              		
            }
            // InternalSqml.g:6556:3: ( ( ( ( 'ELSE' 'IF' ) )=> (otherlv_6= 'ELSE' otherlv_7= 'IF' ) ) ( (lv_conditions_8_0= ruleSqmlStaticExpression ) ) otherlv_9= '{' ( (lv_expressions_10_0= ruleSqmlExpression ) ) otherlv_11= '}' )*
            loop86:
            do {
                int alt86=2;
                alt86 = dfa86.predict(input);
                switch (alt86) {
            	case 1 :
            	    // InternalSqml.g:6557:4: ( ( ( 'ELSE' 'IF' ) )=> (otherlv_6= 'ELSE' otherlv_7= 'IF' ) ) ( (lv_conditions_8_0= ruleSqmlStaticExpression ) ) otherlv_9= '{' ( (lv_expressions_10_0= ruleSqmlExpression ) ) otherlv_11= '}'
            	    {
            	    // InternalSqml.g:6557:4: ( ( ( 'ELSE' 'IF' ) )=> (otherlv_6= 'ELSE' otherlv_7= 'IF' ) )
            	    // InternalSqml.g:6558:5: ( ( 'ELSE' 'IF' ) )=> (otherlv_6= 'ELSE' otherlv_7= 'IF' )
            	    {
            	    // InternalSqml.g:6563:5: (otherlv_6= 'ELSE' otherlv_7= 'IF' )
            	    // InternalSqml.g:6564:6: otherlv_6= 'ELSE' otherlv_7= 'IF'
            	    {
            	    otherlv_6=(Token)match(input,69,FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_6, grammarAccess.getSqmlStaticIfAccess().getELSEKeyword_6_0_0_0());
            	      					
            	    }
            	    otherlv_7=(Token)match(input,80,FOLLOW_46); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_7, grammarAccess.getSqmlStaticIfAccess().getIFKeyword_6_0_0_1());
            	      					
            	    }

            	    }


            	    }

            	    // InternalSqml.g:6574:4: ( (lv_conditions_8_0= ruleSqmlStaticExpression ) )
            	    // InternalSqml.g:6575:5: (lv_conditions_8_0= ruleSqmlStaticExpression )
            	    {
            	    // InternalSqml.g:6575:5: (lv_conditions_8_0= ruleSqmlStaticExpression )
            	    // InternalSqml.g:6576:6: lv_conditions_8_0= ruleSqmlStaticExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSqmlStaticIfAccess().getConditionsSqmlStaticExpressionParserRuleCall_6_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_conditions_8_0=ruleSqmlStaticExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSqmlStaticIfRule());
            	      						}
            	      						add(
            	      							current,
            	      							"conditions",
            	      							lv_conditions_8_0,
            	      							"com.softicar.sqml.Sqml.SqmlStaticExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_9=(Token)match(input,23,FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_9, grammarAccess.getSqmlStaticIfAccess().getLeftCurlyBracketKeyword_6_2());
            	      			
            	    }
            	    // InternalSqml.g:6597:4: ( (lv_expressions_10_0= ruleSqmlExpression ) )
            	    // InternalSqml.g:6598:5: (lv_expressions_10_0= ruleSqmlExpression )
            	    {
            	    // InternalSqml.g:6598:5: (lv_expressions_10_0= ruleSqmlExpression )
            	    // InternalSqml.g:6599:6: lv_expressions_10_0= ruleSqmlExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSqmlStaticIfAccess().getExpressionsSqmlExpressionParserRuleCall_6_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_expressions_10_0=ruleSqmlExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSqmlStaticIfRule());
            	      						}
            	      						add(
            	      							current,
            	      							"expressions",
            	      							lv_expressions_10_0,
            	      							"com.softicar.sqml.Sqml.SqmlExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_11=(Token)match(input,24,FOLLOW_48); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_11, grammarAccess.getSqmlStaticIfAccess().getRightCurlyBracketKeyword_6_4());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);

            // InternalSqml.g:6621:3: (otherlv_12= 'ELSE' otherlv_13= '{' ( (lv_elseExpression_14_0= ruleSqmlExpression ) ) otherlv_15= '}' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==69) ) {
                int LA87_1 = input.LA(2);

                if ( (LA87_1==23) ) {
                    alt87=1;
                }
            }
            switch (alt87) {
                case 1 :
                    // InternalSqml.g:6622:4: otherlv_12= 'ELSE' otherlv_13= '{' ( (lv_elseExpression_14_0= ruleSqmlExpression ) ) otherlv_15= '}'
                    {
                    otherlv_12=(Token)match(input,69,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getSqmlStaticIfAccess().getELSEKeyword_7_0());
                      			
                    }
                    otherlv_13=(Token)match(input,23,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getSqmlStaticIfAccess().getLeftCurlyBracketKeyword_7_1());
                      			
                    }
                    // InternalSqml.g:6630:4: ( (lv_elseExpression_14_0= ruleSqmlExpression ) )
                    // InternalSqml.g:6631:5: (lv_elseExpression_14_0= ruleSqmlExpression )
                    {
                    // InternalSqml.g:6631:5: (lv_elseExpression_14_0= ruleSqmlExpression )
                    // InternalSqml.g:6632:6: lv_elseExpression_14_0= ruleSqmlExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSqmlStaticIfAccess().getElseExpressionSqmlExpressionParserRuleCall_7_2_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_elseExpression_14_0=ruleSqmlExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSqmlStaticIfRule());
                      						}
                      						set(
                      							current,
                      							"elseExpression",
                      							lv_elseExpression_14_0,
                      							"com.softicar.sqml.Sqml.SqmlExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getSqmlStaticIfAccess().getRightCurlyBracketKeyword_7_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlStaticIf"


    // $ANTLR start "entryRuleSqmlStaticExpression"
    // InternalSqml.g:6658:1: entryRuleSqmlStaticExpression returns [EObject current=null] : iv_ruleSqmlStaticExpression= ruleSqmlStaticExpression EOF ;
    public final EObject entryRuleSqmlStaticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlStaticExpression = null;


        try {
            // InternalSqml.g:6658:61: (iv_ruleSqmlStaticExpression= ruleSqmlStaticExpression EOF )
            // InternalSqml.g:6659:2: iv_ruleSqmlStaticExpression= ruleSqmlStaticExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlStaticExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlStaticExpression=ruleSqmlStaticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlStaticExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlStaticExpression"


    // $ANTLR start "ruleSqmlStaticExpression"
    // InternalSqml.g:6665:1: ruleSqmlStaticExpression returns [EObject current=null] : this_SqmlStaticOr_0= ruleSqmlStaticOr ;
    public final EObject ruleSqmlStaticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SqmlStaticOr_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:6671:2: (this_SqmlStaticOr_0= ruleSqmlStaticOr )
            // InternalSqml.g:6672:2: this_SqmlStaticOr_0= ruleSqmlStaticOr
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getSqmlStaticExpressionAccess().getSqmlStaticOrParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_SqmlStaticOr_0=ruleSqmlStaticOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_SqmlStaticOr_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlStaticExpression"


    // $ANTLR start "entryRuleSqmlStaticOr"
    // InternalSqml.g:6683:1: entryRuleSqmlStaticOr returns [EObject current=null] : iv_ruleSqmlStaticOr= ruleSqmlStaticOr EOF ;
    public final EObject entryRuleSqmlStaticOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlStaticOr = null;


        try {
            // InternalSqml.g:6683:53: (iv_ruleSqmlStaticOr= ruleSqmlStaticOr EOF )
            // InternalSqml.g:6684:2: iv_ruleSqmlStaticOr= ruleSqmlStaticOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlStaticOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlStaticOr=ruleSqmlStaticOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlStaticOr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlStaticOr"


    // $ANTLR start "ruleSqmlStaticOr"
    // InternalSqml.g:6690:1: ruleSqmlStaticOr returns [EObject current=null] : (this_SqmlStaticAnd_0= ruleSqmlStaticAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleSqmlStaticAnd ) ) )* ) ;
    public final EObject ruleSqmlStaticOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_SqmlStaticAnd_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:6696:2: ( (this_SqmlStaticAnd_0= ruleSqmlStaticAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleSqmlStaticAnd ) ) )* ) )
            // InternalSqml.g:6697:2: (this_SqmlStaticAnd_0= ruleSqmlStaticAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleSqmlStaticAnd ) ) )* )
            {
            // InternalSqml.g:6697:2: (this_SqmlStaticAnd_0= ruleSqmlStaticAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleSqmlStaticAnd ) ) )* )
            // InternalSqml.g:6698:3: this_SqmlStaticAnd_0= ruleSqmlStaticAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleSqmlStaticAnd ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSqmlStaticOrAccess().getSqmlStaticAndParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_62);
            this_SqmlStaticAnd_0=ruleSqmlStaticAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SqmlStaticAnd_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSqml.g:6706:3: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleSqmlStaticAnd ) ) )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==90) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // InternalSqml.g:6707:4: () otherlv_2= 'OR' ( (lv_right_3_0= ruleSqmlStaticAnd ) )
            	    {
            	    // InternalSqml.g:6707:4: ()
            	    // InternalSqml.g:6708:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getSqmlStaticOrAccess().getSqmlStaticOrLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,90,FOLLOW_46); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSqmlStaticOrAccess().getORKeyword_1_1());
            	      			
            	    }
            	    // InternalSqml.g:6718:4: ( (lv_right_3_0= ruleSqmlStaticAnd ) )
            	    // InternalSqml.g:6719:5: (lv_right_3_0= ruleSqmlStaticAnd )
            	    {
            	    // InternalSqml.g:6719:5: (lv_right_3_0= ruleSqmlStaticAnd )
            	    // InternalSqml.g:6720:6: lv_right_3_0= ruleSqmlStaticAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSqmlStaticOrAccess().getRightSqmlStaticAndParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_62);
            	    lv_right_3_0=ruleSqmlStaticAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSqmlStaticOrRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"com.softicar.sqml.Sqml.SqmlStaticAnd");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlStaticOr"


    // $ANTLR start "entryRuleSqmlStaticAnd"
    // InternalSqml.g:6742:1: entryRuleSqmlStaticAnd returns [EObject current=null] : iv_ruleSqmlStaticAnd= ruleSqmlStaticAnd EOF ;
    public final EObject entryRuleSqmlStaticAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlStaticAnd = null;


        try {
            // InternalSqml.g:6742:54: (iv_ruleSqmlStaticAnd= ruleSqmlStaticAnd EOF )
            // InternalSqml.g:6743:2: iv_ruleSqmlStaticAnd= ruleSqmlStaticAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlStaticAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlStaticAnd=ruleSqmlStaticAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlStaticAnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlStaticAnd"


    // $ANTLR start "ruleSqmlStaticAnd"
    // InternalSqml.g:6749:1: ruleSqmlStaticAnd returns [EObject current=null] : (this_SqmlStaticAtom_0= ruleSqmlStaticAtom ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleSqmlStaticAtom ) ) )* ) ;
    public final EObject ruleSqmlStaticAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_SqmlStaticAtom_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:6755:2: ( (this_SqmlStaticAtom_0= ruleSqmlStaticAtom ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleSqmlStaticAtom ) ) )* ) )
            // InternalSqml.g:6756:2: (this_SqmlStaticAtom_0= ruleSqmlStaticAtom ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleSqmlStaticAtom ) ) )* )
            {
            // InternalSqml.g:6756:2: (this_SqmlStaticAtom_0= ruleSqmlStaticAtom ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleSqmlStaticAtom ) ) )* )
            // InternalSqml.g:6757:3: this_SqmlStaticAtom_0= ruleSqmlStaticAtom ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleSqmlStaticAtom ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSqmlStaticAndAccess().getSqmlStaticAtomParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_63);
            this_SqmlStaticAtom_0=ruleSqmlStaticAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SqmlStaticAtom_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSqml.g:6765:3: ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleSqmlStaticAtom ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==60) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // InternalSqml.g:6766:4: () otherlv_2= 'AND' ( (lv_right_3_0= ruleSqmlStaticAtom ) )
            	    {
            	    // InternalSqml.g:6766:4: ()
            	    // InternalSqml.g:6767:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getSqmlStaticAndAccess().getSqmlStaticAndLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,60,FOLLOW_46); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSqmlStaticAndAccess().getANDKeyword_1_1());
            	      			
            	    }
            	    // InternalSqml.g:6777:4: ( (lv_right_3_0= ruleSqmlStaticAtom ) )
            	    // InternalSqml.g:6778:5: (lv_right_3_0= ruleSqmlStaticAtom )
            	    {
            	    // InternalSqml.g:6778:5: (lv_right_3_0= ruleSqmlStaticAtom )
            	    // InternalSqml.g:6779:6: lv_right_3_0= ruleSqmlStaticAtom
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSqmlStaticAndAccess().getRightSqmlStaticAtomParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_63);
            	    lv_right_3_0=ruleSqmlStaticAtom();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSqmlStaticAndRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"com.softicar.sqml.Sqml.SqmlStaticAtom");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlStaticAnd"


    // $ANTLR start "entryRuleSqmlStaticAtom"
    // InternalSqml.g:6801:1: entryRuleSqmlStaticAtom returns [EObject current=null] : iv_ruleSqmlStaticAtom= ruleSqmlStaticAtom EOF ;
    public final EObject entryRuleSqmlStaticAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlStaticAtom = null;


        try {
            // InternalSqml.g:6801:55: (iv_ruleSqmlStaticAtom= ruleSqmlStaticAtom EOF )
            // InternalSqml.g:6802:2: iv_ruleSqmlStaticAtom= ruleSqmlStaticAtom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlStaticAtomRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlStaticAtom=ruleSqmlStaticAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlStaticAtom; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlStaticAtom"


    // $ANTLR start "ruleSqmlStaticAtom"
    // InternalSqml.g:6808:1: ruleSqmlStaticAtom returns [EObject current=null] : (this_SqmlStaticParentheses_0= ruleSqmlStaticParentheses | this_SqmlStaticIsEmpty_1= ruleSqmlStaticIsEmpty | this_SqmlStaticIsNull_2= ruleSqmlStaticIsNull | this_SqmlStaticIsTrue_3= ruleSqmlStaticIsTrue ) ;
    public final EObject ruleSqmlStaticAtom() throws RecognitionException {
        EObject current = null;

        EObject this_SqmlStaticParentheses_0 = null;

        EObject this_SqmlStaticIsEmpty_1 = null;

        EObject this_SqmlStaticIsNull_2 = null;

        EObject this_SqmlStaticIsTrue_3 = null;



        	enterRule();

        try {
            // InternalSqml.g:6814:2: ( (this_SqmlStaticParentheses_0= ruleSqmlStaticParentheses | this_SqmlStaticIsEmpty_1= ruleSqmlStaticIsEmpty | this_SqmlStaticIsNull_2= ruleSqmlStaticIsNull | this_SqmlStaticIsTrue_3= ruleSqmlStaticIsTrue ) )
            // InternalSqml.g:6815:2: (this_SqmlStaticParentheses_0= ruleSqmlStaticParentheses | this_SqmlStaticIsEmpty_1= ruleSqmlStaticIsEmpty | this_SqmlStaticIsNull_2= ruleSqmlStaticIsNull | this_SqmlStaticIsTrue_3= ruleSqmlStaticIsTrue )
            {
            // InternalSqml.g:6815:2: (this_SqmlStaticParentheses_0= ruleSqmlStaticParentheses | this_SqmlStaticIsEmpty_1= ruleSqmlStaticIsEmpty | this_SqmlStaticIsNull_2= ruleSqmlStaticIsNull | this_SqmlStaticIsTrue_3= ruleSqmlStaticIsTrue )
            int alt90=4;
            alt90 = dfa90.predict(input);
            switch (alt90) {
                case 1 :
                    // InternalSqml.g:6816:3: this_SqmlStaticParentheses_0= ruleSqmlStaticParentheses
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlStaticAtomAccess().getSqmlStaticParenthesesParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlStaticParentheses_0=ruleSqmlStaticParentheses();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlStaticParentheses_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSqml.g:6825:3: this_SqmlStaticIsEmpty_1= ruleSqmlStaticIsEmpty
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlStaticAtomAccess().getSqmlStaticIsEmptyParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlStaticIsEmpty_1=ruleSqmlStaticIsEmpty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlStaticIsEmpty_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSqml.g:6834:3: this_SqmlStaticIsNull_2= ruleSqmlStaticIsNull
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlStaticAtomAccess().getSqmlStaticIsNullParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlStaticIsNull_2=ruleSqmlStaticIsNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlStaticIsNull_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSqml.g:6843:3: this_SqmlStaticIsTrue_3= ruleSqmlStaticIsTrue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlStaticAtomAccess().getSqmlStaticIsTrueParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlStaticIsTrue_3=ruleSqmlStaticIsTrue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlStaticIsTrue_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlStaticAtom"


    // $ANTLR start "entryRuleSqmlStaticIsEmpty"
    // InternalSqml.g:6855:1: entryRuleSqmlStaticIsEmpty returns [EObject current=null] : iv_ruleSqmlStaticIsEmpty= ruleSqmlStaticIsEmpty EOF ;
    public final EObject entryRuleSqmlStaticIsEmpty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlStaticIsEmpty = null;


        try {
            // InternalSqml.g:6855:58: (iv_ruleSqmlStaticIsEmpty= ruleSqmlStaticIsEmpty EOF )
            // InternalSqml.g:6856:2: iv_ruleSqmlStaticIsEmpty= ruleSqmlStaticIsEmpty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlStaticIsEmptyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlStaticIsEmpty=ruleSqmlStaticIsEmpty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlStaticIsEmpty; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlStaticIsEmpty"


    // $ANTLR start "ruleSqmlStaticIsEmpty"
    // InternalSqml.g:6862:1: ruleSqmlStaticIsEmpty returns [EObject current=null] : ( ( (lv_parameterReference_0_0= ruleSqmlStaticVariableReference ) ) otherlv_1= 'IS' ( (lv_not_2_0= 'NOT' ) )? otherlv_3= 'EMPTY' ) ;
    public final EObject ruleSqmlStaticIsEmpty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_not_2_0=null;
        Token otherlv_3=null;
        EObject lv_parameterReference_0_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:6868:2: ( ( ( (lv_parameterReference_0_0= ruleSqmlStaticVariableReference ) ) otherlv_1= 'IS' ( (lv_not_2_0= 'NOT' ) )? otherlv_3= 'EMPTY' ) )
            // InternalSqml.g:6869:2: ( ( (lv_parameterReference_0_0= ruleSqmlStaticVariableReference ) ) otherlv_1= 'IS' ( (lv_not_2_0= 'NOT' ) )? otherlv_3= 'EMPTY' )
            {
            // InternalSqml.g:6869:2: ( ( (lv_parameterReference_0_0= ruleSqmlStaticVariableReference ) ) otherlv_1= 'IS' ( (lv_not_2_0= 'NOT' ) )? otherlv_3= 'EMPTY' )
            // InternalSqml.g:6870:3: ( (lv_parameterReference_0_0= ruleSqmlStaticVariableReference ) ) otherlv_1= 'IS' ( (lv_not_2_0= 'NOT' ) )? otherlv_3= 'EMPTY'
            {
            // InternalSqml.g:6870:3: ( (lv_parameterReference_0_0= ruleSqmlStaticVariableReference ) )
            // InternalSqml.g:6871:4: (lv_parameterReference_0_0= ruleSqmlStaticVariableReference )
            {
            // InternalSqml.g:6871:4: (lv_parameterReference_0_0= ruleSqmlStaticVariableReference )
            // InternalSqml.g:6872:5: lv_parameterReference_0_0= ruleSqmlStaticVariableReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlStaticIsEmptyAccess().getParameterReferenceSqmlStaticVariableReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_83);
            lv_parameterReference_0_0=ruleSqmlStaticVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlStaticIsEmptyRule());
              					}
              					set(
              						current,
              						"parameterReference",
              						lv_parameterReference_0_0,
              						"com.softicar.sqml.Sqml.SqmlStaticVariableReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,83,FOLLOW_84); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSqmlStaticIsEmptyAccess().getISKeyword_1());
              		
            }
            // InternalSqml.g:6893:3: ( (lv_not_2_0= 'NOT' ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==89) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalSqml.g:6894:4: (lv_not_2_0= 'NOT' )
                    {
                    // InternalSqml.g:6894:4: (lv_not_2_0= 'NOT' )
                    // InternalSqml.g:6895:5: lv_not_2_0= 'NOT'
                    {
                    lv_not_2_0=(Token)match(input,89,FOLLOW_85); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_not_2_0, grammarAccess.getSqmlStaticIsEmptyAccess().getNotNOTKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlStaticIsEmptyRule());
                      					}
                      					setWithLastConsumed(current, "not", lv_not_2_0 != null, "NOT");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSqmlStaticIsEmptyAccess().getEMPTYKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlStaticIsEmpty"


    // $ANTLR start "entryRuleSqmlStaticIsNull"
    // InternalSqml.g:6915:1: entryRuleSqmlStaticIsNull returns [EObject current=null] : iv_ruleSqmlStaticIsNull= ruleSqmlStaticIsNull EOF ;
    public final EObject entryRuleSqmlStaticIsNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlStaticIsNull = null;


        try {
            // InternalSqml.g:6915:57: (iv_ruleSqmlStaticIsNull= ruleSqmlStaticIsNull EOF )
            // InternalSqml.g:6916:2: iv_ruleSqmlStaticIsNull= ruleSqmlStaticIsNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlStaticIsNullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlStaticIsNull=ruleSqmlStaticIsNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlStaticIsNull; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlStaticIsNull"


    // $ANTLR start "ruleSqmlStaticIsNull"
    // InternalSqml.g:6922:1: ruleSqmlStaticIsNull returns [EObject current=null] : ( ( (lv_parameterReference_0_0= ruleSqmlStaticVariableReference ) ) otherlv_1= 'IS' ( (lv_not_2_0= 'NOT' ) )? otherlv_3= 'NULL' ) ;
    public final EObject ruleSqmlStaticIsNull() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_not_2_0=null;
        Token otherlv_3=null;
        EObject lv_parameterReference_0_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:6928:2: ( ( ( (lv_parameterReference_0_0= ruleSqmlStaticVariableReference ) ) otherlv_1= 'IS' ( (lv_not_2_0= 'NOT' ) )? otherlv_3= 'NULL' ) )
            // InternalSqml.g:6929:2: ( ( (lv_parameterReference_0_0= ruleSqmlStaticVariableReference ) ) otherlv_1= 'IS' ( (lv_not_2_0= 'NOT' ) )? otherlv_3= 'NULL' )
            {
            // InternalSqml.g:6929:2: ( ( (lv_parameterReference_0_0= ruleSqmlStaticVariableReference ) ) otherlv_1= 'IS' ( (lv_not_2_0= 'NOT' ) )? otherlv_3= 'NULL' )
            // InternalSqml.g:6930:3: ( (lv_parameterReference_0_0= ruleSqmlStaticVariableReference ) ) otherlv_1= 'IS' ( (lv_not_2_0= 'NOT' ) )? otherlv_3= 'NULL'
            {
            // InternalSqml.g:6930:3: ( (lv_parameterReference_0_0= ruleSqmlStaticVariableReference ) )
            // InternalSqml.g:6931:4: (lv_parameterReference_0_0= ruleSqmlStaticVariableReference )
            {
            // InternalSqml.g:6931:4: (lv_parameterReference_0_0= ruleSqmlStaticVariableReference )
            // InternalSqml.g:6932:5: lv_parameterReference_0_0= ruleSqmlStaticVariableReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlStaticIsNullAccess().getParameterReferenceSqmlStaticVariableReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_83);
            lv_parameterReference_0_0=ruleSqmlStaticVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlStaticIsNullRule());
              					}
              					set(
              						current,
              						"parameterReference",
              						lv_parameterReference_0_0,
              						"com.softicar.sqml.Sqml.SqmlStaticVariableReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,83,FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSqmlStaticIsNullAccess().getISKeyword_1());
              		
            }
            // InternalSqml.g:6953:3: ( (lv_not_2_0= 'NOT' ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==89) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalSqml.g:6954:4: (lv_not_2_0= 'NOT' )
                    {
                    // InternalSqml.g:6954:4: (lv_not_2_0= 'NOT' )
                    // InternalSqml.g:6955:5: lv_not_2_0= 'NOT'
                    {
                    lv_not_2_0=(Token)match(input,89,FOLLOW_68); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_not_2_0, grammarAccess.getSqmlStaticIsNullAccess().getNotNOTKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlStaticIsNullRule());
                      					}
                      					setWithLastConsumed(current, "not", lv_not_2_0 != null, "NOT");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSqmlStaticIsNullAccess().getNULLKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlStaticIsNull"


    // $ANTLR start "entryRuleSqmlStaticIsTrue"
    // InternalSqml.g:6975:1: entryRuleSqmlStaticIsTrue returns [EObject current=null] : iv_ruleSqmlStaticIsTrue= ruleSqmlStaticIsTrue EOF ;
    public final EObject entryRuleSqmlStaticIsTrue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlStaticIsTrue = null;


        try {
            // InternalSqml.g:6975:57: (iv_ruleSqmlStaticIsTrue= ruleSqmlStaticIsTrue EOF )
            // InternalSqml.g:6976:2: iv_ruleSqmlStaticIsTrue= ruleSqmlStaticIsTrue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlStaticIsTrueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlStaticIsTrue=ruleSqmlStaticIsTrue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlStaticIsTrue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlStaticIsTrue"


    // $ANTLR start "ruleSqmlStaticIsTrue"
    // InternalSqml.g:6982:1: ruleSqmlStaticIsTrue returns [EObject current=null] : ( ( (lv_not_0_0= 'NOT' ) )? ( (lv_parameterReference_1_0= ruleSqmlStaticVariableReference ) ) ) ;
    public final EObject ruleSqmlStaticIsTrue() throws RecognitionException {
        EObject current = null;

        Token lv_not_0_0=null;
        EObject lv_parameterReference_1_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:6988:2: ( ( ( (lv_not_0_0= 'NOT' ) )? ( (lv_parameterReference_1_0= ruleSqmlStaticVariableReference ) ) ) )
            // InternalSqml.g:6989:2: ( ( (lv_not_0_0= 'NOT' ) )? ( (lv_parameterReference_1_0= ruleSqmlStaticVariableReference ) ) )
            {
            // InternalSqml.g:6989:2: ( ( (lv_not_0_0= 'NOT' ) )? ( (lv_parameterReference_1_0= ruleSqmlStaticVariableReference ) ) )
            // InternalSqml.g:6990:3: ( (lv_not_0_0= 'NOT' ) )? ( (lv_parameterReference_1_0= ruleSqmlStaticVariableReference ) )
            {
            // InternalSqml.g:6990:3: ( (lv_not_0_0= 'NOT' ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==89) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalSqml.g:6991:4: (lv_not_0_0= 'NOT' )
                    {
                    // InternalSqml.g:6991:4: (lv_not_0_0= 'NOT' )
                    // InternalSqml.g:6992:5: lv_not_0_0= 'NOT'
                    {
                    lv_not_0_0=(Token)match(input,89,FOLLOW_86); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_not_0_0, grammarAccess.getSqmlStaticIsTrueAccess().getNotNOTKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlStaticIsTrueRule());
                      					}
                      					setWithLastConsumed(current, "not", lv_not_0_0 != null, "NOT");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSqml.g:7004:3: ( (lv_parameterReference_1_0= ruleSqmlStaticVariableReference ) )
            // InternalSqml.g:7005:4: (lv_parameterReference_1_0= ruleSqmlStaticVariableReference )
            {
            // InternalSqml.g:7005:4: (lv_parameterReference_1_0= ruleSqmlStaticVariableReference )
            // InternalSqml.g:7006:5: lv_parameterReference_1_0= ruleSqmlStaticVariableReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlStaticIsTrueAccess().getParameterReferenceSqmlStaticVariableReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_parameterReference_1_0=ruleSqmlStaticVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlStaticIsTrueRule());
              					}
              					set(
              						current,
              						"parameterReference",
              						lv_parameterReference_1_0,
              						"com.softicar.sqml.Sqml.SqmlStaticVariableReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlStaticIsTrue"


    // $ANTLR start "entryRuleSqmlStaticParentheses"
    // InternalSqml.g:7027:1: entryRuleSqmlStaticParentheses returns [EObject current=null] : iv_ruleSqmlStaticParentheses= ruleSqmlStaticParentheses EOF ;
    public final EObject entryRuleSqmlStaticParentheses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlStaticParentheses = null;


        try {
            // InternalSqml.g:7027:62: (iv_ruleSqmlStaticParentheses= ruleSqmlStaticParentheses EOF )
            // InternalSqml.g:7028:2: iv_ruleSqmlStaticParentheses= ruleSqmlStaticParentheses EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlStaticParenthesesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlStaticParentheses=ruleSqmlStaticParentheses();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlStaticParentheses; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlStaticParentheses"


    // $ANTLR start "ruleSqmlStaticParentheses"
    // InternalSqml.g:7034:1: ruleSqmlStaticParentheses returns [EObject current=null] : (otherlv_0= '(' ( (lv_expression_1_0= ruleSqmlStaticExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleSqmlStaticParentheses() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:7040:2: ( (otherlv_0= '(' ( (lv_expression_1_0= ruleSqmlStaticExpression ) ) otherlv_2= ')' ) )
            // InternalSqml.g:7041:2: (otherlv_0= '(' ( (lv_expression_1_0= ruleSqmlStaticExpression ) ) otherlv_2= ')' )
            {
            // InternalSqml.g:7041:2: (otherlv_0= '(' ( (lv_expression_1_0= ruleSqmlStaticExpression ) ) otherlv_2= ')' )
            // InternalSqml.g:7042:3: otherlv_0= '(' ( (lv_expression_1_0= ruleSqmlStaticExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSqmlStaticParenthesesAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalSqml.g:7046:3: ( (lv_expression_1_0= ruleSqmlStaticExpression ) )
            // InternalSqml.g:7047:4: (lv_expression_1_0= ruleSqmlStaticExpression )
            {
            // InternalSqml.g:7047:4: (lv_expression_1_0= ruleSqmlStaticExpression )
            // InternalSqml.g:7048:5: lv_expression_1_0= ruleSqmlStaticExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlStaticParenthesesAccess().getExpressionSqmlStaticExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_56);
            lv_expression_1_0=ruleSqmlStaticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlStaticParenthesesRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_1_0,
              						"com.softicar.sqml.Sqml.SqmlStaticExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSqmlStaticParenthesesAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlStaticParentheses"


    // $ANTLR start "entryRuleSqmlValueReference"
    // InternalSqml.g:7073:1: entryRuleSqmlValueReference returns [EObject current=null] : iv_ruleSqmlValueReference= ruleSqmlValueReference EOF ;
    public final EObject entryRuleSqmlValueReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlValueReference = null;


        try {
            // InternalSqml.g:7073:59: (iv_ruleSqmlValueReference= ruleSqmlValueReference EOF )
            // InternalSqml.g:7074:2: iv_ruleSqmlValueReference= ruleSqmlValueReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlValueReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlValueReference=ruleSqmlValueReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlValueReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlValueReference"


    // $ANTLR start "ruleSqmlValueReference"
    // InternalSqml.g:7080:1: ruleSqmlValueReference returns [EObject current=null] : ( ( (lv_nextIteration_0_0= 'NEXT' ) )? ( (lv_path_1_0= ruleSqmlPath ) ) ( (lv_dotStar_2_0= '.*' ) )? ) ;
    public final EObject ruleSqmlValueReference() throws RecognitionException {
        EObject current = null;

        Token lv_nextIteration_0_0=null;
        Token lv_dotStar_2_0=null;
        EObject lv_path_1_0 = null;



        	enterRule();

        try {
            // InternalSqml.g:7086:2: ( ( ( (lv_nextIteration_0_0= 'NEXT' ) )? ( (lv_path_1_0= ruleSqmlPath ) ) ( (lv_dotStar_2_0= '.*' ) )? ) )
            // InternalSqml.g:7087:2: ( ( (lv_nextIteration_0_0= 'NEXT' ) )? ( (lv_path_1_0= ruleSqmlPath ) ) ( (lv_dotStar_2_0= '.*' ) )? )
            {
            // InternalSqml.g:7087:2: ( ( (lv_nextIteration_0_0= 'NEXT' ) )? ( (lv_path_1_0= ruleSqmlPath ) ) ( (lv_dotStar_2_0= '.*' ) )? )
            // InternalSqml.g:7088:3: ( (lv_nextIteration_0_0= 'NEXT' ) )? ( (lv_path_1_0= ruleSqmlPath ) ) ( (lv_dotStar_2_0= '.*' ) )?
            {
            // InternalSqml.g:7088:3: ( (lv_nextIteration_0_0= 'NEXT' ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==87) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalSqml.g:7089:4: (lv_nextIteration_0_0= 'NEXT' )
                    {
                    // InternalSqml.g:7089:4: (lv_nextIteration_0_0= 'NEXT' )
                    // InternalSqml.g:7090:5: lv_nextIteration_0_0= 'NEXT'
                    {
                    lv_nextIteration_0_0=(Token)match(input,87,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_nextIteration_0_0, grammarAccess.getSqmlValueReferenceAccess().getNextIterationNEXTKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlValueReferenceRule());
                      					}
                      					setWithLastConsumed(current, "nextIteration", lv_nextIteration_0_0 != null, "NEXT");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSqml.g:7102:3: ( (lv_path_1_0= ruleSqmlPath ) )
            // InternalSqml.g:7103:4: (lv_path_1_0= ruleSqmlPath )
            {
            // InternalSqml.g:7103:4: (lv_path_1_0= ruleSqmlPath )
            // InternalSqml.g:7104:5: lv_path_1_0= ruleSqmlPath
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqmlValueReferenceAccess().getPathSqmlPathParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_87);
            lv_path_1_0=ruleSqmlPath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqmlValueReferenceRule());
              					}
              					set(
              						current,
              						"path",
              						lv_path_1_0,
              						"com.softicar.sqml.Sqml.SqmlPath");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSqml.g:7121:3: ( (lv_dotStar_2_0= '.*' ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==119) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalSqml.g:7122:4: (lv_dotStar_2_0= '.*' )
                    {
                    // InternalSqml.g:7122:4: (lv_dotStar_2_0= '.*' )
                    // InternalSqml.g:7123:5: lv_dotStar_2_0= '.*'
                    {
                    lv_dotStar_2_0=(Token)match(input,119,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_dotStar_2_0, grammarAccess.getSqmlValueReferenceAccess().getDotStarFullStopAsteriskKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSqmlValueReferenceRule());
                      					}
                      					setWithLastConsumed(current, "dotStar", lv_dotStar_2_0 != null, ".*");
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlValueReference"


    // $ANTLR start "entryRuleSqmlPath"
    // InternalSqml.g:7139:1: entryRuleSqmlPath returns [EObject current=null] : iv_ruleSqmlPath= ruleSqmlPath EOF ;
    public final EObject entryRuleSqmlPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlPath = null;


        try {
            // InternalSqml.g:7139:49: (iv_ruleSqmlPath= ruleSqmlPath EOF )
            // InternalSqml.g:7140:2: iv_ruleSqmlPath= ruleSqmlPath EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlPathRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlPath=ruleSqmlPath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlPath; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlPath"


    // $ANTLR start "ruleSqmlPath"
    // InternalSqml.g:7146:1: ruleSqmlPath returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleSqmlPath() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSqml.g:7152:2: ( ( ( (otherlv_0= RULE_ID ) ) ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) )
            // InternalSqml.g:7153:2: ( ( (otherlv_0= RULE_ID ) ) ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            {
            // InternalSqml.g:7153:2: ( ( (otherlv_0= RULE_ID ) ) ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            // InternalSqml.g:7154:3: ( (otherlv_0= RULE_ID ) ) ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            {
            // InternalSqml.g:7154:3: ( (otherlv_0= RULE_ID ) )
            // InternalSqml.g:7155:4: (otherlv_0= RULE_ID )
            {
            // InternalSqml.g:7155:4: (otherlv_0= RULE_ID )
            // InternalSqml.g:7156:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSqmlPathRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_88); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getSqmlPathAccess().getTargetISqmlModelElementCrossReference_0_0());
              				
            }

            }


            }

            // InternalSqml.g:7167:3: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==112) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // InternalSqml.g:7168:4: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalSqml.g:7168:4: ()
            	    // InternalSqml.g:7169:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getSqmlPathAccess().getSqmlPathParentAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,112,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSqmlPathAccess().getFullStopKeyword_1_1());
            	      			
            	    }
            	    // InternalSqml.g:7179:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalSqml.g:7180:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalSqml.g:7180:5: (otherlv_3= RULE_ID )
            	    // InternalSqml.g:7181:6: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getSqmlPathRule());
            	      						}
            	      					
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_88); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_3, grammarAccess.getSqmlPathAccess().getTargetISqmlModelElementCrossReference_1_2_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop96;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlPath"


    // $ANTLR start "entryRuleSqmlLiteral"
    // InternalSqml.g:7197:1: entryRuleSqmlLiteral returns [EObject current=null] : iv_ruleSqmlLiteral= ruleSqmlLiteral EOF ;
    public final EObject entryRuleSqmlLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlLiteral = null;


        try {
            // InternalSqml.g:7197:52: (iv_ruleSqmlLiteral= ruleSqmlLiteral EOF )
            // InternalSqml.g:7198:2: iv_ruleSqmlLiteral= ruleSqmlLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlLiteral=ruleSqmlLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlLiteral"


    // $ANTLR start "ruleSqmlLiteral"
    // InternalSqml.g:7204:1: ruleSqmlLiteral returns [EObject current=null] : (this_SqmlIntegerLiteral_0= ruleSqmlIntegerLiteral | this_SqmlLongLiteral_1= ruleSqmlLongLiteral | this_SqmlFloatLiteral_2= ruleSqmlFloatLiteral | this_SqmlDoubleLiteral_3= ruleSqmlDoubleLiteral | this_SqmlDecimalLiteral_4= ruleSqmlDecimalLiteral | this_SqmlStringLiteral_5= ruleSqmlStringLiteral | this_SqmlBooleanLiteral_6= ruleSqmlBooleanLiteral ) ;
    public final EObject ruleSqmlLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_SqmlIntegerLiteral_0 = null;

        EObject this_SqmlLongLiteral_1 = null;

        EObject this_SqmlFloatLiteral_2 = null;

        EObject this_SqmlDoubleLiteral_3 = null;

        EObject this_SqmlDecimalLiteral_4 = null;

        EObject this_SqmlStringLiteral_5 = null;

        EObject this_SqmlBooleanLiteral_6 = null;



        	enterRule();

        try {
            // InternalSqml.g:7210:2: ( (this_SqmlIntegerLiteral_0= ruleSqmlIntegerLiteral | this_SqmlLongLiteral_1= ruleSqmlLongLiteral | this_SqmlFloatLiteral_2= ruleSqmlFloatLiteral | this_SqmlDoubleLiteral_3= ruleSqmlDoubleLiteral | this_SqmlDecimalLiteral_4= ruleSqmlDecimalLiteral | this_SqmlStringLiteral_5= ruleSqmlStringLiteral | this_SqmlBooleanLiteral_6= ruleSqmlBooleanLiteral ) )
            // InternalSqml.g:7211:2: (this_SqmlIntegerLiteral_0= ruleSqmlIntegerLiteral | this_SqmlLongLiteral_1= ruleSqmlLongLiteral | this_SqmlFloatLiteral_2= ruleSqmlFloatLiteral | this_SqmlDoubleLiteral_3= ruleSqmlDoubleLiteral | this_SqmlDecimalLiteral_4= ruleSqmlDecimalLiteral | this_SqmlStringLiteral_5= ruleSqmlStringLiteral | this_SqmlBooleanLiteral_6= ruleSqmlBooleanLiteral )
            {
            // InternalSqml.g:7211:2: (this_SqmlIntegerLiteral_0= ruleSqmlIntegerLiteral | this_SqmlLongLiteral_1= ruleSqmlLongLiteral | this_SqmlFloatLiteral_2= ruleSqmlFloatLiteral | this_SqmlDoubleLiteral_3= ruleSqmlDoubleLiteral | this_SqmlDecimalLiteral_4= ruleSqmlDecimalLiteral | this_SqmlStringLiteral_5= ruleSqmlStringLiteral | this_SqmlBooleanLiteral_6= ruleSqmlBooleanLiteral )
            int alt97=7;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt97=1;
                }
                break;
            case RULE_LONG:
                {
                alt97=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt97=3;
                }
                break;
            case RULE_DOUBLE:
                {
                alt97=4;
                }
                break;
            case RULE_DECIMAL:
                {
                alt97=5;
                }
                break;
            case RULE_STRING:
                {
                alt97=6;
                }
                break;
            case 74:
            case 101:
                {
                alt97=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // InternalSqml.g:7212:3: this_SqmlIntegerLiteral_0= ruleSqmlIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlLiteralAccess().getSqmlIntegerLiteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlIntegerLiteral_0=ruleSqmlIntegerLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlIntegerLiteral_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSqml.g:7221:3: this_SqmlLongLiteral_1= ruleSqmlLongLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlLiteralAccess().getSqmlLongLiteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlLongLiteral_1=ruleSqmlLongLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlLongLiteral_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSqml.g:7230:3: this_SqmlFloatLiteral_2= ruleSqmlFloatLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlLiteralAccess().getSqmlFloatLiteralParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlFloatLiteral_2=ruleSqmlFloatLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlFloatLiteral_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSqml.g:7239:3: this_SqmlDoubleLiteral_3= ruleSqmlDoubleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlLiteralAccess().getSqmlDoubleLiteralParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlDoubleLiteral_3=ruleSqmlDoubleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlDoubleLiteral_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalSqml.g:7248:3: this_SqmlDecimalLiteral_4= ruleSqmlDecimalLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlLiteralAccess().getSqmlDecimalLiteralParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlDecimalLiteral_4=ruleSqmlDecimalLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlDecimalLiteral_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalSqml.g:7257:3: this_SqmlStringLiteral_5= ruleSqmlStringLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlLiteralAccess().getSqmlStringLiteralParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlStringLiteral_5=ruleSqmlStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlStringLiteral_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalSqml.g:7266:3: this_SqmlBooleanLiteral_6= ruleSqmlBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlLiteralAccess().getSqmlBooleanLiteralParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlBooleanLiteral_6=ruleSqmlBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SqmlBooleanLiteral_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlLiteral"


    // $ANTLR start "entryRuleSqmlIntegerLiteral"
    // InternalSqml.g:7278:1: entryRuleSqmlIntegerLiteral returns [EObject current=null] : iv_ruleSqmlIntegerLiteral= ruleSqmlIntegerLiteral EOF ;
    public final EObject entryRuleSqmlIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlIntegerLiteral = null;


        try {
            // InternalSqml.g:7278:59: (iv_ruleSqmlIntegerLiteral= ruleSqmlIntegerLiteral EOF )
            // InternalSqml.g:7279:2: iv_ruleSqmlIntegerLiteral= ruleSqmlIntegerLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlIntegerLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlIntegerLiteral=ruleSqmlIntegerLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlIntegerLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlIntegerLiteral"


    // $ANTLR start "ruleSqmlIntegerLiteral"
    // InternalSqml.g:7285:1: ruleSqmlIntegerLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleSqmlIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSqml.g:7291:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalSqml.g:7292:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalSqml.g:7292:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalSqml.g:7293:3: (lv_value_0_0= RULE_INT )
            {
            // InternalSqml.g:7293:3: (lv_value_0_0= RULE_INT )
            // InternalSqml.g:7294:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getSqmlIntegerLiteralAccess().getValueINTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSqmlIntegerLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.eclipse.xtext.common.Terminals.INT");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlIntegerLiteral"


    // $ANTLR start "entryRuleSqmlLongLiteral"
    // InternalSqml.g:7313:1: entryRuleSqmlLongLiteral returns [EObject current=null] : iv_ruleSqmlLongLiteral= ruleSqmlLongLiteral EOF ;
    public final EObject entryRuleSqmlLongLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlLongLiteral = null;


        try {
            // InternalSqml.g:7313:56: (iv_ruleSqmlLongLiteral= ruleSqmlLongLiteral EOF )
            // InternalSqml.g:7314:2: iv_ruleSqmlLongLiteral= ruleSqmlLongLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlLongLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlLongLiteral=ruleSqmlLongLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlLongLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlLongLiteral"


    // $ANTLR start "ruleSqmlLongLiteral"
    // InternalSqml.g:7320:1: ruleSqmlLongLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_LONG ) ) ;
    public final EObject ruleSqmlLongLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSqml.g:7326:2: ( ( (lv_value_0_0= RULE_LONG ) ) )
            // InternalSqml.g:7327:2: ( (lv_value_0_0= RULE_LONG ) )
            {
            // InternalSqml.g:7327:2: ( (lv_value_0_0= RULE_LONG ) )
            // InternalSqml.g:7328:3: (lv_value_0_0= RULE_LONG )
            {
            // InternalSqml.g:7328:3: (lv_value_0_0= RULE_LONG )
            // InternalSqml.g:7329:4: lv_value_0_0= RULE_LONG
            {
            lv_value_0_0=(Token)match(input,RULE_LONG,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getSqmlLongLiteralAccess().getValueLONGTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSqmlLongLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"com.softicar.sqml.Sqml.LONG");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlLongLiteral"


    // $ANTLR start "entryRuleSqmlFloatLiteral"
    // InternalSqml.g:7348:1: entryRuleSqmlFloatLiteral returns [EObject current=null] : iv_ruleSqmlFloatLiteral= ruleSqmlFloatLiteral EOF ;
    public final EObject entryRuleSqmlFloatLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlFloatLiteral = null;


        try {
            // InternalSqml.g:7348:57: (iv_ruleSqmlFloatLiteral= ruleSqmlFloatLiteral EOF )
            // InternalSqml.g:7349:2: iv_ruleSqmlFloatLiteral= ruleSqmlFloatLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlFloatLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlFloatLiteral=ruleSqmlFloatLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlFloatLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlFloatLiteral"


    // $ANTLR start "ruleSqmlFloatLiteral"
    // InternalSqml.g:7355:1: ruleSqmlFloatLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleSqmlFloatLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSqml.g:7361:2: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalSqml.g:7362:2: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalSqml.g:7362:2: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalSqml.g:7363:3: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalSqml.g:7363:3: (lv_value_0_0= RULE_FLOAT )
            // InternalSqml.g:7364:4: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getSqmlFloatLiteralAccess().getValueFLOATTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSqmlFloatLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"com.softicar.sqml.Sqml.FLOAT");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlFloatLiteral"


    // $ANTLR start "entryRuleSqmlDoubleLiteral"
    // InternalSqml.g:7383:1: entryRuleSqmlDoubleLiteral returns [EObject current=null] : iv_ruleSqmlDoubleLiteral= ruleSqmlDoubleLiteral EOF ;
    public final EObject entryRuleSqmlDoubleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlDoubleLiteral = null;


        try {
            // InternalSqml.g:7383:58: (iv_ruleSqmlDoubleLiteral= ruleSqmlDoubleLiteral EOF )
            // InternalSqml.g:7384:2: iv_ruleSqmlDoubleLiteral= ruleSqmlDoubleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlDoubleLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlDoubleLiteral=ruleSqmlDoubleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlDoubleLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlDoubleLiteral"


    // $ANTLR start "ruleSqmlDoubleLiteral"
    // InternalSqml.g:7390:1: ruleSqmlDoubleLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DOUBLE ) ) ;
    public final EObject ruleSqmlDoubleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSqml.g:7396:2: ( ( (lv_value_0_0= RULE_DOUBLE ) ) )
            // InternalSqml.g:7397:2: ( (lv_value_0_0= RULE_DOUBLE ) )
            {
            // InternalSqml.g:7397:2: ( (lv_value_0_0= RULE_DOUBLE ) )
            // InternalSqml.g:7398:3: (lv_value_0_0= RULE_DOUBLE )
            {
            // InternalSqml.g:7398:3: (lv_value_0_0= RULE_DOUBLE )
            // InternalSqml.g:7399:4: lv_value_0_0= RULE_DOUBLE
            {
            lv_value_0_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getSqmlDoubleLiteralAccess().getValueDOUBLETerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSqmlDoubleLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"com.softicar.sqml.Sqml.DOUBLE");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlDoubleLiteral"


    // $ANTLR start "entryRuleSqmlDecimalLiteral"
    // InternalSqml.g:7418:1: entryRuleSqmlDecimalLiteral returns [EObject current=null] : iv_ruleSqmlDecimalLiteral= ruleSqmlDecimalLiteral EOF ;
    public final EObject entryRuleSqmlDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlDecimalLiteral = null;


        try {
            // InternalSqml.g:7418:59: (iv_ruleSqmlDecimalLiteral= ruleSqmlDecimalLiteral EOF )
            // InternalSqml.g:7419:2: iv_ruleSqmlDecimalLiteral= ruleSqmlDecimalLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlDecimalLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlDecimalLiteral=ruleSqmlDecimalLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlDecimalLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlDecimalLiteral"


    // $ANTLR start "ruleSqmlDecimalLiteral"
    // InternalSqml.g:7425:1: ruleSqmlDecimalLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DECIMAL ) ) ;
    public final EObject ruleSqmlDecimalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSqml.g:7431:2: ( ( (lv_value_0_0= RULE_DECIMAL ) ) )
            // InternalSqml.g:7432:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            {
            // InternalSqml.g:7432:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            // InternalSqml.g:7433:3: (lv_value_0_0= RULE_DECIMAL )
            {
            // InternalSqml.g:7433:3: (lv_value_0_0= RULE_DECIMAL )
            // InternalSqml.g:7434:4: lv_value_0_0= RULE_DECIMAL
            {
            lv_value_0_0=(Token)match(input,RULE_DECIMAL,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getSqmlDecimalLiteralAccess().getValueDECIMALTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSqmlDecimalLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"com.softicar.sqml.Sqml.DECIMAL");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlDecimalLiteral"


    // $ANTLR start "entryRuleSqmlStringLiteral"
    // InternalSqml.g:7453:1: entryRuleSqmlStringLiteral returns [EObject current=null] : iv_ruleSqmlStringLiteral= ruleSqmlStringLiteral EOF ;
    public final EObject entryRuleSqmlStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlStringLiteral = null;


        try {
            // InternalSqml.g:7453:58: (iv_ruleSqmlStringLiteral= ruleSqmlStringLiteral EOF )
            // InternalSqml.g:7454:2: iv_ruleSqmlStringLiteral= ruleSqmlStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlStringLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlStringLiteral=ruleSqmlStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlStringLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlStringLiteral"


    // $ANTLR start "ruleSqmlStringLiteral"
    // InternalSqml.g:7460:1: ruleSqmlStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleSqmlStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSqml.g:7466:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalSqml.g:7467:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalSqml.g:7467:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalSqml.g:7468:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalSqml.g:7468:3: (lv_value_0_0= RULE_STRING )
            // InternalSqml.g:7469:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getSqmlStringLiteralAccess().getValueSTRINGTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSqmlStringLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.eclipse.xtext.common.Terminals.STRING");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlStringLiteral"


    // $ANTLR start "entryRuleSqmlBooleanLiteral"
    // InternalSqml.g:7488:1: entryRuleSqmlBooleanLiteral returns [EObject current=null] : iv_ruleSqmlBooleanLiteral= ruleSqmlBooleanLiteral EOF ;
    public final EObject entryRuleSqmlBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqmlBooleanLiteral = null;


        try {
            // InternalSqml.g:7488:59: (iv_ruleSqmlBooleanLiteral= ruleSqmlBooleanLiteral EOF )
            // InternalSqml.g:7489:2: iv_ruleSqmlBooleanLiteral= ruleSqmlBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlBooleanLiteral=ruleSqmlBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlBooleanLiteral"


    // $ANTLR start "ruleSqmlBooleanLiteral"
    // InternalSqml.g:7495:1: ruleSqmlBooleanLiteral returns [EObject current=null] : ( ( () ( (lv_true_1_0= 'TRUE' ) ) ) | (otherlv_2= 'FALSE' () ) ) ;
    public final EObject ruleSqmlBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_true_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSqml.g:7501:2: ( ( ( () ( (lv_true_1_0= 'TRUE' ) ) ) | (otherlv_2= 'FALSE' () ) ) )
            // InternalSqml.g:7502:2: ( ( () ( (lv_true_1_0= 'TRUE' ) ) ) | (otherlv_2= 'FALSE' () ) )
            {
            // InternalSqml.g:7502:2: ( ( () ( (lv_true_1_0= 'TRUE' ) ) ) | (otherlv_2= 'FALSE' () ) )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==101) ) {
                alt98=1;
            }
            else if ( (LA98_0==74) ) {
                alt98=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // InternalSqml.g:7503:3: ( () ( (lv_true_1_0= 'TRUE' ) ) )
                    {
                    // InternalSqml.g:7503:3: ( () ( (lv_true_1_0= 'TRUE' ) ) )
                    // InternalSqml.g:7504:4: () ( (lv_true_1_0= 'TRUE' ) )
                    {
                    // InternalSqml.g:7504:4: ()
                    // InternalSqml.g:7505:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSqmlBooleanLiteralAccess().getSqmlBooleanLiteralAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSqml.g:7511:4: ( (lv_true_1_0= 'TRUE' ) )
                    // InternalSqml.g:7512:5: (lv_true_1_0= 'TRUE' )
                    {
                    // InternalSqml.g:7512:5: (lv_true_1_0= 'TRUE' )
                    // InternalSqml.g:7513:6: lv_true_1_0= 'TRUE'
                    {
                    lv_true_1_0=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_true_1_0, grammarAccess.getSqmlBooleanLiteralAccess().getTrueTRUEKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSqmlBooleanLiteralRule());
                      						}
                      						setWithLastConsumed(current, "true", lv_true_1_0 != null, "TRUE");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSqml.g:7527:3: (otherlv_2= 'FALSE' () )
                    {
                    // InternalSqml.g:7527:3: (otherlv_2= 'FALSE' () )
                    // InternalSqml.g:7528:4: otherlv_2= 'FALSE' ()
                    {
                    otherlv_2=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSqmlBooleanLiteralAccess().getFALSEKeyword_1_0());
                      			
                    }
                    // InternalSqml.g:7532:4: ()
                    // InternalSqml.g:7533:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSqmlBooleanLiteralAccess().getSqmlBooleanLiteralAction_1_1(),
                      						current);
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlBooleanLiteral"


    // $ANTLR start "entryRuleSqmlFunctionName"
    // InternalSqml.g:7544:1: entryRuleSqmlFunctionName returns [String current=null] : iv_ruleSqmlFunctionName= ruleSqmlFunctionName EOF ;
    public final String entryRuleSqmlFunctionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSqmlFunctionName = null;


        try {
            // InternalSqml.g:7544:56: (iv_ruleSqmlFunctionName= ruleSqmlFunctionName EOF )
            // InternalSqml.g:7545:2: iv_ruleSqmlFunctionName= ruleSqmlFunctionName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlFunctionNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlFunctionName=ruleSqmlFunctionName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlFunctionName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlFunctionName"


    // $ANTLR start "ruleSqmlFunctionName"
    // InternalSqml.g:7551:1: ruleSqmlFunctionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_SqmlComparisonOperator_1= ruleSqmlComparisonOperator | this_SqmlAdditionOperator_2= ruleSqmlAdditionOperator | this_SqmlMultiplicationOperator_3= ruleSqmlMultiplicationOperator ) ;
    public final AntlrDatatypeRuleToken ruleSqmlFunctionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_SqmlComparisonOperator_1 = null;

        AntlrDatatypeRuleToken this_SqmlAdditionOperator_2 = null;

        AntlrDatatypeRuleToken this_SqmlMultiplicationOperator_3 = null;



        	enterRule();

        try {
            // InternalSqml.g:7557:2: ( (this_ID_0= RULE_ID | this_SqmlComparisonOperator_1= ruleSqmlComparisonOperator | this_SqmlAdditionOperator_2= ruleSqmlAdditionOperator | this_SqmlMultiplicationOperator_3= ruleSqmlMultiplicationOperator ) )
            // InternalSqml.g:7558:2: (this_ID_0= RULE_ID | this_SqmlComparisonOperator_1= ruleSqmlComparisonOperator | this_SqmlAdditionOperator_2= ruleSqmlAdditionOperator | this_SqmlMultiplicationOperator_3= ruleSqmlMultiplicationOperator )
            {
            // InternalSqml.g:7558:2: (this_ID_0= RULE_ID | this_SqmlComparisonOperator_1= ruleSqmlComparisonOperator | this_SqmlAdditionOperator_2= ruleSqmlAdditionOperator | this_SqmlMultiplicationOperator_3= ruleSqmlMultiplicationOperator )
            int alt99=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt99=1;
                }
                break;
            case 17:
            case 19:
            case 27:
            case 114:
            case 115:
            case 116:
                {
                alt99=2;
                }
                break;
            case 51:
            case 104:
                {
                alt99=3;
                }
                break;
            case 105:
            case 106:
            case 107:
                {
                alt99=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // InternalSqml.g:7559:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_0, grammarAccess.getSqmlFunctionNameAccess().getIDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSqml.g:7567:3: this_SqmlComparisonOperator_1= ruleSqmlComparisonOperator
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlFunctionNameAccess().getSqmlComparisonOperatorParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlComparisonOperator_1=ruleSqmlComparisonOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_SqmlComparisonOperator_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSqml.g:7578:3: this_SqmlAdditionOperator_2= ruleSqmlAdditionOperator
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlFunctionNameAccess().getSqmlAdditionOperatorParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlAdditionOperator_2=ruleSqmlAdditionOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_SqmlAdditionOperator_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSqml.g:7589:3: this_SqmlMultiplicationOperator_3= ruleSqmlMultiplicationOperator
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSqmlFunctionNameAccess().getSqmlMultiplicationOperatorParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SqmlMultiplicationOperator_3=ruleSqmlMultiplicationOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_SqmlMultiplicationOperator_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlFunctionName"


    // $ANTLR start "entryRuleSqmlComparisonOperator"
    // InternalSqml.g:7603:1: entryRuleSqmlComparisonOperator returns [String current=null] : iv_ruleSqmlComparisonOperator= ruleSqmlComparisonOperator EOF ;
    public final String entryRuleSqmlComparisonOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSqmlComparisonOperator = null;


        try {
            // InternalSqml.g:7603:62: (iv_ruleSqmlComparisonOperator= ruleSqmlComparisonOperator EOF )
            // InternalSqml.g:7604:2: iv_ruleSqmlComparisonOperator= ruleSqmlComparisonOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlComparisonOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlComparisonOperator=ruleSqmlComparisonOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlComparisonOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlComparisonOperator"


    // $ANTLR start "ruleSqmlComparisonOperator"
    // InternalSqml.g:7610:1: ruleSqmlComparisonOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '!=' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleSqmlComparisonOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSqml.g:7616:2: ( (kw= '=' | kw= '!=' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) )
            // InternalSqml.g:7617:2: (kw= '=' | kw= '!=' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
            {
            // InternalSqml.g:7617:2: (kw= '=' | kw= '!=' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
            int alt100=6;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt100=1;
                }
                break;
            case 114:
                {
                alt100=2;
                }
                break;
            case 17:
                {
                alt100=3;
                }
                break;
            case 115:
                {
                alt100=4;
                }
                break;
            case 19:
                {
                alt100=5;
                }
                break;
            case 116:
                {
                alt100=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // InternalSqml.g:7618:3: kw= '='
                    {
                    kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSqmlComparisonOperatorAccess().getEqualsSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSqml.g:7624:3: kw= '!='
                    {
                    kw=(Token)match(input,114,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSqmlComparisonOperatorAccess().getExclamationMarkEqualsSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSqml.g:7630:3: kw= '<'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSqmlComparisonOperatorAccess().getLessThanSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSqml.g:7636:3: kw= '<='
                    {
                    kw=(Token)match(input,115,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSqmlComparisonOperatorAccess().getLessThanSignEqualsSignKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalSqml.g:7642:3: kw= '>'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSqmlComparisonOperatorAccess().getGreaterThanSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalSqml.g:7648:3: kw= '>='
                    {
                    kw=(Token)match(input,116,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSqmlComparisonOperatorAccess().getGreaterThanSignEqualsSignKeyword_5());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlComparisonOperator"


    // $ANTLR start "entryRuleSqmlAdditionOperator"
    // InternalSqml.g:7657:1: entryRuleSqmlAdditionOperator returns [String current=null] : iv_ruleSqmlAdditionOperator= ruleSqmlAdditionOperator EOF ;
    public final String entryRuleSqmlAdditionOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSqmlAdditionOperator = null;


        try {
            // InternalSqml.g:7657:60: (iv_ruleSqmlAdditionOperator= ruleSqmlAdditionOperator EOF )
            // InternalSqml.g:7658:2: iv_ruleSqmlAdditionOperator= ruleSqmlAdditionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlAdditionOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlAdditionOperator=ruleSqmlAdditionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlAdditionOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlAdditionOperator"


    // $ANTLR start "ruleSqmlAdditionOperator"
    // InternalSqml.g:7664:1: ruleSqmlAdditionOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleSqmlAdditionOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSqml.g:7670:2: ( (kw= '+' | kw= '-' ) )
            // InternalSqml.g:7671:2: (kw= '+' | kw= '-' )
            {
            // InternalSqml.g:7671:2: (kw= '+' | kw= '-' )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==104) ) {
                alt101=1;
            }
            else if ( (LA101_0==51) ) {
                alt101=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // InternalSqml.g:7672:3: kw= '+'
                    {
                    kw=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSqmlAdditionOperatorAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSqml.g:7678:3: kw= '-'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSqmlAdditionOperatorAccess().getHyphenMinusKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlAdditionOperator"


    // $ANTLR start "entryRuleSqmlMultiplicationOperator"
    // InternalSqml.g:7687:1: entryRuleSqmlMultiplicationOperator returns [String current=null] : iv_ruleSqmlMultiplicationOperator= ruleSqmlMultiplicationOperator EOF ;
    public final String entryRuleSqmlMultiplicationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSqmlMultiplicationOperator = null;


        try {
            // InternalSqml.g:7687:66: (iv_ruleSqmlMultiplicationOperator= ruleSqmlMultiplicationOperator EOF )
            // InternalSqml.g:7688:2: iv_ruleSqmlMultiplicationOperator= ruleSqmlMultiplicationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqmlMultiplicationOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqmlMultiplicationOperator=ruleSqmlMultiplicationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqmlMultiplicationOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqmlMultiplicationOperator"


    // $ANTLR start "ruleSqmlMultiplicationOperator"
    // InternalSqml.g:7694:1: ruleSqmlMultiplicationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleSqmlMultiplicationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSqml.g:7700:2: ( (kw= '*' | kw= '/' | kw= '%' ) )
            // InternalSqml.g:7701:2: (kw= '*' | kw= '/' | kw= '%' )
            {
            // InternalSqml.g:7701:2: (kw= '*' | kw= '/' | kw= '%' )
            int alt102=3;
            switch ( input.LA(1) ) {
            case 105:
                {
                alt102=1;
                }
                break;
            case 106:
                {
                alt102=2;
                }
                break;
            case 107:
                {
                alt102=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // InternalSqml.g:7702:3: kw= '*'
                    {
                    kw=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSqmlMultiplicationOperatorAccess().getAsteriskKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSqml.g:7708:3: kw= '/'
                    {
                    kw=(Token)match(input,106,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSqmlMultiplicationOperatorAccess().getSolidusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSqml.g:7714:3: kw= '%'
                    {
                    kw=(Token)match(input,107,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSqmlMultiplicationOperatorAccess().getPercentSignKeyword_2());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlMultiplicationOperator"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSqml.g:7723:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSqml.g:7723:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSqml.g:7724:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSqml.g:7730:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSqml.g:7736:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSqml.g:7737:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSqml.g:7737:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSqml.g:7738:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_88); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalSqml.g:7745:3: (kw= '.' this_ID_2= RULE_ID )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==112) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // InternalSqml.g:7746:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,112,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_88); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop103;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleSqmlForeignKeyAction"
    // InternalSqml.g:7763:1: ruleSqmlForeignKeyAction returns [Enumerator current=null] : ( (enumLiteral_0= 'CASCADE' ) | (enumLiteral_1= 'NO_ACTION' ) | (enumLiteral_2= 'RESTRICT' ) | (enumLiteral_3= 'SET_DEFAULT' ) | (enumLiteral_4= 'SET_NULL' ) ) ;
    public final Enumerator ruleSqmlForeignKeyAction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalSqml.g:7769:2: ( ( (enumLiteral_0= 'CASCADE' ) | (enumLiteral_1= 'NO_ACTION' ) | (enumLiteral_2= 'RESTRICT' ) | (enumLiteral_3= 'SET_DEFAULT' ) | (enumLiteral_4= 'SET_NULL' ) ) )
            // InternalSqml.g:7770:2: ( (enumLiteral_0= 'CASCADE' ) | (enumLiteral_1= 'NO_ACTION' ) | (enumLiteral_2= 'RESTRICT' ) | (enumLiteral_3= 'SET_DEFAULT' ) | (enumLiteral_4= 'SET_NULL' ) )
            {
            // InternalSqml.g:7770:2: ( (enumLiteral_0= 'CASCADE' ) | (enumLiteral_1= 'NO_ACTION' ) | (enumLiteral_2= 'RESTRICT' ) | (enumLiteral_3= 'SET_DEFAULT' ) | (enumLiteral_4= 'SET_NULL' ) )
            int alt104=5;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt104=1;
                }
                break;
            case 88:
                {
                alt104=2;
                }
                break;
            case 93:
                {
                alt104=3;
                }
                break;
            case 96:
                {
                alt104=4;
                }
                break;
            case 97:
                {
                alt104=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // InternalSqml.g:7771:3: (enumLiteral_0= 'CASCADE' )
                    {
                    // InternalSqml.g:7771:3: (enumLiteral_0= 'CASCADE' )
                    // InternalSqml.g:7772:4: enumLiteral_0= 'CASCADE'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSqmlForeignKeyActionAccess().getCASCADEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getSqmlForeignKeyActionAccess().getCASCADEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSqml.g:7779:3: (enumLiteral_1= 'NO_ACTION' )
                    {
                    // InternalSqml.g:7779:3: (enumLiteral_1= 'NO_ACTION' )
                    // InternalSqml.g:7780:4: enumLiteral_1= 'NO_ACTION'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSqmlForeignKeyActionAccess().getNO_ACTIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getSqmlForeignKeyActionAccess().getNO_ACTIONEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSqml.g:7787:3: (enumLiteral_2= 'RESTRICT' )
                    {
                    // InternalSqml.g:7787:3: (enumLiteral_2= 'RESTRICT' )
                    // InternalSqml.g:7788:4: enumLiteral_2= 'RESTRICT'
                    {
                    enumLiteral_2=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSqmlForeignKeyActionAccess().getRESTRICTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getSqmlForeignKeyActionAccess().getRESTRICTEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSqml.g:7795:3: (enumLiteral_3= 'SET_DEFAULT' )
                    {
                    // InternalSqml.g:7795:3: (enumLiteral_3= 'SET_DEFAULT' )
                    // InternalSqml.g:7796:4: enumLiteral_3= 'SET_DEFAULT'
                    {
                    enumLiteral_3=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSqmlForeignKeyActionAccess().getSET_DEFAULTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getSqmlForeignKeyActionAccess().getSET_DEFAULTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSqml.g:7803:3: (enumLiteral_4= 'SET_NULL' )
                    {
                    // InternalSqml.g:7803:3: (enumLiteral_4= 'SET_NULL' )
                    // InternalSqml.g:7804:4: enumLiteral_4= 'SET_NULL'
                    {
                    enumLiteral_4=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSqmlForeignKeyActionAccess().getSET_NULLEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getSqmlForeignKeyActionAccess().getSET_NULLEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSqmlForeignKeyAction"

    // $ANTLR start synpred1_InternalSqml
    public final void synpred1_InternalSqml_fragment() throws RecognitionException {   
        // InternalSqml.g:2332:4: ( ruleSqmlStaticVariableReference )
        // InternalSqml.g:2332:5: ruleSqmlStaticVariableReference
        {
        pushFollow(FOLLOW_2);
        ruleSqmlStaticVariableReference();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalSqml

    // $ANTLR start synpred2_InternalSqml
    public final void synpred2_InternalSqml_fragment() throws RecognitionException {   
        // InternalSqml.g:6558:5: ( ( 'ELSE' 'IF' ) )
        // InternalSqml.g:6558:6: ( 'ELSE' 'IF' )
        {
        // InternalSqml.g:6558:6: ( 'ELSE' 'IF' )
        // InternalSqml.g:6559:6: 'ELSE' 'IF'
        {
        match(input,69,FOLLOW_45); if (state.failed) return ;
        match(input,80,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalSqml

    // Delegated rules

    public final boolean synpred2_InternalSqml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalSqml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalSqml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalSqml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA86 dfa86 = new DFA86(this);
    protected DFA90 dfa90 = new DFA90(this);
    static final String dfa_1s = "\23\uffff";
    static final String dfa_2s = "\1\5\4\uffff\1\45\12\uffff\1\37\2\uffff";
    static final String dfa_3s = "\1\57\4\uffff\1\46\12\uffff\1\141\2\uffff";
    static final String dfa_4s = "\1\uffff\1\20\1\1\1\2\1\3\1\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\4\1\uffff\1\5\1\6";
    static final String dfa_5s = "\1\0\4\uffff\1\2\12\uffff\1\1\2\uffff}>";
    static final String[] dfa_6s = {
            "\1\6\17\uffff\1\1\4\uffff\1\5\7\uffff\1\2\1\3\1\4\2\uffff\1\7\1\10\1\11\1\12\1\13\1\uffff\1\14\1\15\1\16",
            "",
            "",
            "",
            "",
            "\1\17\1\20",
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
            "\1\22\40\uffff\1\21\27\uffff\1\21\4\uffff\1\21\2\uffff\2\21",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 910:7: ( ({...}? => ( ({...}? => ( (lv_nullable_11_0= 'NULLABLE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_timestamp_12_0= 'TIMESTAMP' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unsigned_13_0= 'UNSIGNED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'ON' otherlv_15= 'DELETE' ( (lv_onDeleteAction_16_0= ruleSqmlForeignKeyAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'ON' otherlv_18= 'UPDATE' ( (lv_onUpdateAction_19_0= ruleSqmlForeignKeyAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ON' otherlv_21= 'UPDATE' ( (lv_onUpdateNow_22_0= 'NOW' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_physicalNameOverride_23_0= RULE_STRING ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'BITS' otherlv_25= '=' ( (lv_bits_26_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'PRECISION' otherlv_28= '=' ( (lv_precision_29_0= RULE_INT ) ) otherlv_30= ',' ( (lv_scale_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'MAXLENGTH' otherlv_33= '=' ( (lv_maxLength_34_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'LENGTHBITS' otherlv_36= '=' ( (lv_lengthBits_37_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'CHARACTER' otherlv_39= 'SET' otherlv_40= '=' ( (lv_characterSet_41_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'COLLATION' otherlv_43= '=' ( (lv_collation_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'COMMENT' otherlv_46= '=' ( (lv_comment_47_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'CONSTRAINT_NAME' otherlv_49= '=' ( (lv_constraintName_50_0= RULE_STRING ) ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_0 = input.LA(1);

                         
                        int index18_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_0==21) ) {s = 1;}

                        else if ( LA18_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 0) ) {s = 2;}

                        else if ( LA18_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 1) ) {s = 3;}

                        else if ( LA18_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 2) ) {s = 4;}

                        else if ( LA18_0 == 26 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 5) ) ) {s = 5;}

                        else if ( LA18_0 == RULE_STRING && getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 6) ) {s = 6;}

                        else if ( LA18_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 7) ) {s = 7;}

                        else if ( LA18_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 8) ) {s = 8;}

                        else if ( LA18_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 9) ) {s = 9;}

                        else if ( LA18_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 10) ) {s = 10;}

                        else if ( LA18_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 11) ) {s = 11;}

                        else if ( LA18_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 12) ) {s = 12;}

                        else if ( LA18_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 13) ) {s = 13;}

                        else if ( LA18_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 14) ) {s = 14;}

                         
                        input.seek(index18_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_16 = input.LA(1);

                         
                        int index18_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ( LA18_16 == 64 || LA18_16 == 88 || LA18_16 == 93 || LA18_16 >= 96 && LA18_16 <= 97 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 4) ) {s = 17;}

                        else if ( LA18_16 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 5) ) {s = 18;}

                         
                        input.seek(index18_16);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_5 = input.LA(1);

                         
                        int index18_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA18_5 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 3) ) {s = 15;}

                        else if ( LA18_5 == 38 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getSqmlTableColumnAccess().getUnorderedGroup_4_1(), 5) ) ) {s = 16;}

                         
                        input.seek(index18_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\16\uffff";
    static final String dfa_8s = "\4\uffff\1\14\11\uffff";
    static final String dfa_9s = "\1\4\2\uffff\1\4\1\21\11\uffff";
    static final String dfa_10s = "\1\166\2\uffff\1\166\1\167\11\uffff";
    static final String dfa_11s = "\1\uffff\1\1\1\2\2\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\3\1\4";
    static final String dfa_12s = "\16\uffff}>";
    static final String[] dfa_13s = {
            "\1\4\6\13\45\uffff\2\1\1\uffff\1\2\15\uffff\1\6\10\uffff\1\13\3\uffff\1\5\1\uffff\1\7\1\10\5\uffff\1\3\12\uffff\1\11\2\uffff\1\13\20\uffff\1\12",
            "",
            "",
            "\1\14\161\uffff\1\12",
            "\3\14\4\uffff\1\14\1\uffff\2\14\25\uffff\1\15\2\14\2\uffff\1\14\5\uffff\3\14\4\uffff\1\14\1\uffff\1\14\1\uffff\2\14\3\uffff\2\14\1\uffff\1\14\2\uffff\5\14\2\uffff\4\14\1\uffff\2\14\3\uffff\2\14\1\uffff\6\14\4\uffff\1\14\1\uffff\4\14\1\uffff\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "5584:2: (this_SqmlRowConstructor_0= ruleSqmlRowConstructor | this_SqmlNegation_1= ruleSqmlNegation | this_SqmlValueReference_2= ruleSqmlValueReference | this_SqmlFunctionCall_3= ruleSqmlFunctionCall | this_SqmlGroupConcat_4= ruleSqmlGroupConcat | this_SqmlCase_5= ruleSqmlCase | this_SqmlIf_6= ruleSqmlIf | this_SqmlIfNull_7= ruleSqmlIfNull | this_SqmlStaticIf_8= ruleSqmlStaticIf | this_SqmlStaticVariableReference_9= ruleSqmlStaticVariableReference | this_SqmlLiteral_10= ruleSqmlLiteral )";
        }
    }
    static final String dfa_14s = "\55\uffff";
    static final String dfa_15s = "\1\2\54\uffff";
    static final String dfa_16s = "\1\21\1\0\53\uffff";
    static final String dfa_17s = "\1\165\1\0\53\uffff";
    static final String dfa_18s = "\2\uffff\1\2\51\uffff\1\1";
    static final String dfa_19s = "\1\uffff\1\0\53\uffff}>";
    static final String[] dfa_20s = {
            "\3\2\4\uffff\1\2\1\uffff\2\2\26\uffff\2\2\2\uffff\1\2\5\uffff\3\2\4\uffff\1\2\1\uffff\1\1\1\uffff\2\2\3\uffff\2\2\1\uffff\1\2\2\uffff\5\2\2\uffff\4\2\1\uffff\2\2\3\uffff\2\2\1\uffff\6\2\6\uffff\4\2",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA86 extends DFA {

        public DFA86(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 86;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "()* loopback of 6556:3: ( ( ( ( 'ELSE' 'IF' ) )=> (otherlv_6= 'ELSE' otherlv_7= 'IF' ) ) ( (lv_conditions_8_0= ruleSqmlStaticExpression ) ) otherlv_9= '{' ( (lv_expressions_10_0= ruleSqmlExpression ) ) otherlv_11= '}' )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA86_1 = input.LA(1);

                         
                        int index86_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSqml()) ) {s = 44;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index86_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 86, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_21s = "\12\uffff";
    static final String dfa_22s = "\5\uffff\1\4\4\uffff";
    static final String dfa_23s = "\1\61\1\uffff\1\166\1\4\1\uffff\1\27\2\36\2\uffff";
    static final String dfa_24s = "\1\166\1\uffff\1\166\1\4\1\uffff\1\132\1\131\1\106\2\uffff";
    static final String dfa_25s = "\1\uffff\1\1\2\uffff\1\4\3\uffff\1\2\1\3";
    static final String dfa_26s = "\12\uffff}>";
    static final String[] dfa_27s = {
            "\1\1\45\uffff\1\2\1\uffff\1\4\34\uffff\1\3",
            "",
            "\1\3",
            "\1\5",
            "",
            "\1\4\32\uffff\1\4\11\uffff\1\4\26\uffff\1\6\6\uffff\1\4",
            "\1\11\47\uffff\1\10\22\uffff\1\7",
            "\1\11\47\uffff\1\10",
            "",
            ""
    };

    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[][] dfa_27 = unpackEncodedStringArray(dfa_27s);

    class DFA90 extends DFA {

        public DFA90(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 90;
            this.eot = dfa_21;
            this.eof = dfa_22;
            this.min = dfa_23;
            this.max = dfa_24;
            this.accept = dfa_25;
            this.special = dfa_26;
            this.transition = dfa_27;
        }
        public String getDescription() {
            return "6815:2: (this_SqmlStaticParentheses_0= ruleSqmlStaticParentheses | this_SqmlStaticIsEmpty_1= ruleSqmlStaticIsEmpty | this_SqmlStaticIsNull_2= ruleSqmlStaticIsNull | this_SqmlStaticIsTrue_3= ruleSqmlStaticIsTrue )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0280000012410002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0280000012400002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000120002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000007E0L,0x0000002000000400L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0031000023000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0031000003000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0001000003000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0001000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008100002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000A0003C00007F0L,0x0000002000800400L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000EF9C04200020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000321000001L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000400007E0L,0x0000002000000400L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0004000000040000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000E0000000007F0L,0x0000002000800400L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000A0000000007F0L,0x0000002000800400L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0040000000000012L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0100000000000010L,0x002000804830B000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00080000080A0010L,0x001C0F0000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x040B0000000007F0L,0x0040002402834602L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0xFFFFFFFFFF4F80F0L,0x005FFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0100000000000012L,0x002000804830B000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0002000000000000L,0x0040000002800000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0100000001000010L,0x002000804830B000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x000B0000000007F0L,0x0040002402834612L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0040000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0040000000000010L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x000B0000000007F0L,0x0040002402834602L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x40000000080A0002L,0x001C0000124C0000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000040000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0003000000000000L,0x0040000000800000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0008000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x00080000080A0012L,0x001C0F0000000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x000F0000000007F0L,0x0040002402834602L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0004000000040000L,0x0000000088000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0004000000040000L,0x0000000080000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x000B0000000007F0L,0x0040006402834602L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x000B0000000007F0L,0x00400064028346A2L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000040L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0040000000800000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});

}
