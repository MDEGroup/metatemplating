package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MetaTemplatingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMetaTemplatingParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'IMPORT'", "'//'", "'/*'", "'*/'", "'FORALL'", "'('", "':'", "'TAGGED'", "')'", "'{'", "'}'", "'foreach'", "'in'", "'.'", "'()'", "'[['", "']]'", "'['", "'TAGINFO'", "']'", "'.{'", "'@{'", "'}@'", "'#'", "','", "'<'", "'>'", "'\\''"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMetaTemplatingParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMetaTemplatingParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMetaTemplatingParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMetaTemplating.g"; }



     	private MetaTemplatingGrammarAccess grammarAccess;

        public InternalMetaTemplatingParser(TokenStream input, MetaTemplatingGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MetaTemplatingGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMetaTemplating.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMetaTemplating.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMetaTemplating.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMetaTemplating.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_header_0_0= ruleHeader ) ) ( (lv_content_1_0= ruleInstructions ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_header_0_0 = null;

        EObject lv_content_1_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:77:2: ( ( ( (lv_header_0_0= ruleHeader ) ) ( (lv_content_1_0= ruleInstructions ) )* ) )
            // InternalMetaTemplating.g:78:2: ( ( (lv_header_0_0= ruleHeader ) ) ( (lv_content_1_0= ruleInstructions ) )* )
            {
            // InternalMetaTemplating.g:78:2: ( ( (lv_header_0_0= ruleHeader ) ) ( (lv_content_1_0= ruleInstructions ) )* )
            // InternalMetaTemplating.g:79:3: ( (lv_header_0_0= ruleHeader ) ) ( (lv_content_1_0= ruleInstructions ) )*
            {
            // InternalMetaTemplating.g:79:3: ( (lv_header_0_0= ruleHeader ) )
            // InternalMetaTemplating.g:80:4: (lv_header_0_0= ruleHeader )
            {
            // InternalMetaTemplating.g:80:4: (lv_header_0_0= ruleHeader )
            // InternalMetaTemplating.g:81:5: lv_header_0_0= ruleHeader
            {

            					newCompositeNode(grammarAccess.getModelAccess().getHeaderHeaderParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_header_0_0=ruleHeader();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"header",
            						lv_header_0_0,
            						"org.xtext.example.mydsl.MetaTemplating.Header");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMetaTemplating.g:98:3: ( (lv_content_1_0= ruleInstructions ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=14 && LA1_0<=15)||LA1_0==17||LA1_0==24||LA1_0==28||LA1_0==30||LA1_0==34||LA1_0==36) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMetaTemplating.g:99:4: (lv_content_1_0= ruleInstructions )
            	    {
            	    // InternalMetaTemplating.g:99:4: (lv_content_1_0= ruleInstructions )
            	    // InternalMetaTemplating.g:100:5: lv_content_1_0= ruleInstructions
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getContentInstructionsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_content_1_0=ruleInstructions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"content",
            	    						lv_content_1_0,
            	    						"org.xtext.example.mydsl.MetaTemplating.Instructions");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleHeader"
    // InternalMetaTemplating.g:121:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // InternalMetaTemplating.g:121:47: (iv_ruleHeader= ruleHeader EOF )
            // InternalMetaTemplating.g:122:2: iv_ruleHeader= ruleHeader EOF
            {
             newCompositeNode(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeader=ruleHeader();

            state._fsp--;

             current =iv_ruleHeader; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalMetaTemplating.g:128:1: ruleHeader returns [EObject current=null] : ( () ( (lv_libs_1_0= ruleLibraries ) )* ( (lv_imports_2_0= ruleImport ) )* ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        EObject lv_libs_1_0 = null;

        EObject lv_imports_2_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:134:2: ( ( () ( (lv_libs_1_0= ruleLibraries ) )* ( (lv_imports_2_0= ruleImport ) )* ) )
            // InternalMetaTemplating.g:135:2: ( () ( (lv_libs_1_0= ruleLibraries ) )* ( (lv_imports_2_0= ruleImport ) )* )
            {
            // InternalMetaTemplating.g:135:2: ( () ( (lv_libs_1_0= ruleLibraries ) )* ( (lv_imports_2_0= ruleImport ) )* )
            // InternalMetaTemplating.g:136:3: () ( (lv_libs_1_0= ruleLibraries ) )* ( (lv_imports_2_0= ruleImport ) )*
            {
            // InternalMetaTemplating.g:136:3: ()
            // InternalMetaTemplating.g:137:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHeaderAccess().getHeaderAction_0(),
            					current);
            			

            }

            // InternalMetaTemplating.g:143:3: ( (lv_libs_1_0= ruleLibraries ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMetaTemplating.g:144:4: (lv_libs_1_0= ruleLibraries )
            	    {
            	    // InternalMetaTemplating.g:144:4: (lv_libs_1_0= ruleLibraries )
            	    // InternalMetaTemplating.g:145:5: lv_libs_1_0= ruleLibraries
            	    {

            	    					newCompositeNode(grammarAccess.getHeaderAccess().getLibsLibrariesParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_libs_1_0=ruleLibraries();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHeaderRule());
            	    					}
            	    					add(
            	    						current,
            	    						"libs",
            	    						lv_libs_1_0,
            	    						"org.xtext.example.mydsl.MetaTemplating.Libraries");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalMetaTemplating.g:162:3: ( (lv_imports_2_0= ruleImport ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMetaTemplating.g:163:4: (lv_imports_2_0= ruleImport )
            	    {
            	    // InternalMetaTemplating.g:163:4: (lv_imports_2_0= ruleImport )
            	    // InternalMetaTemplating.g:164:5: lv_imports_2_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getHeaderAccess().getImportsImportParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHeaderRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_2_0,
            	    						"org.xtext.example.mydsl.MetaTemplating.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleImport"
    // InternalMetaTemplating.g:185:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalMetaTemplating.g:185:47: (iv_ruleImport= ruleImport EOF )
            // InternalMetaTemplating.g:186:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalMetaTemplating.g:192:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_path_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMetaTemplating.g:198:2: ( (otherlv_0= 'import' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // InternalMetaTemplating.g:199:2: (otherlv_0= 'import' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // InternalMetaTemplating.g:199:2: (otherlv_0= 'import' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // InternalMetaTemplating.g:200:3: otherlv_0= 'import' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalMetaTemplating.g:204:3: ( (lv_path_1_0= RULE_STRING ) )
            // InternalMetaTemplating.g:205:4: (lv_path_1_0= RULE_STRING )
            {
            // InternalMetaTemplating.g:205:4: (lv_path_1_0= RULE_STRING )
            // InternalMetaTemplating.g:206:5: lv_path_1_0= RULE_STRING
            {
            lv_path_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_path_1_0, grammarAccess.getImportAccess().getPathSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getImportAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleLibraries"
    // InternalMetaTemplating.g:230:1: entryRuleLibraries returns [EObject current=null] : iv_ruleLibraries= ruleLibraries EOF ;
    public final EObject entryRuleLibraries() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibraries = null;


        try {
            // InternalMetaTemplating.g:230:50: (iv_ruleLibraries= ruleLibraries EOF )
            // InternalMetaTemplating.g:231:2: iv_ruleLibraries= ruleLibraries EOF
            {
             newCompositeNode(grammarAccess.getLibrariesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLibraries=ruleLibraries();

            state._fsp--;

             current =iv_ruleLibraries; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLibraries"


    // $ANTLR start "ruleLibraries"
    // InternalMetaTemplating.g:237:1: ruleLibraries returns [EObject current=null] : (otherlv_0= 'IMPORT' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleLibraries() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_path_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMetaTemplating.g:243:2: ( (otherlv_0= 'IMPORT' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // InternalMetaTemplating.g:244:2: (otherlv_0= 'IMPORT' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // InternalMetaTemplating.g:244:2: (otherlv_0= 'IMPORT' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // InternalMetaTemplating.g:245:3: otherlv_0= 'IMPORT' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getLibrariesAccess().getIMPORTKeyword_0());
            		
            // InternalMetaTemplating.g:249:3: ( (lv_path_1_0= RULE_STRING ) )
            // InternalMetaTemplating.g:250:4: (lv_path_1_0= RULE_STRING )
            {
            // InternalMetaTemplating.g:250:4: (lv_path_1_0= RULE_STRING )
            // InternalMetaTemplating.g:251:5: lv_path_1_0= RULE_STRING
            {
            lv_path_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_path_1_0, grammarAccess.getLibrariesAccess().getPathSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLibrariesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getLibrariesAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLibraries"


    // $ANTLR start "entryRuleComment"
    // InternalMetaTemplating.g:275:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalMetaTemplating.g:275:48: (iv_ruleComment= ruleComment EOF )
            // InternalMetaTemplating.g:276:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // InternalMetaTemplating.g:282:1: ruleComment returns [EObject current=null] : ( (otherlv_0= '//' ( (lv_word_1_0= RULE_ID ) ) ) | (otherlv_2= '/*' ( (lv_word_3_0= RULE_ID ) ) otherlv_4= '*/' ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_word_1_0=null;
        Token otherlv_2=null;
        Token lv_word_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMetaTemplating.g:288:2: ( ( (otherlv_0= '//' ( (lv_word_1_0= RULE_ID ) ) ) | (otherlv_2= '/*' ( (lv_word_3_0= RULE_ID ) ) otherlv_4= '*/' ) ) )
            // InternalMetaTemplating.g:289:2: ( (otherlv_0= '//' ( (lv_word_1_0= RULE_ID ) ) ) | (otherlv_2= '/*' ( (lv_word_3_0= RULE_ID ) ) otherlv_4= '*/' ) )
            {
            // InternalMetaTemplating.g:289:2: ( (otherlv_0= '//' ( (lv_word_1_0= RULE_ID ) ) ) | (otherlv_2= '/*' ( (lv_word_3_0= RULE_ID ) ) otherlv_4= '*/' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMetaTemplating.g:290:3: (otherlv_0= '//' ( (lv_word_1_0= RULE_ID ) ) )
                    {
                    // InternalMetaTemplating.g:290:3: (otherlv_0= '//' ( (lv_word_1_0= RULE_ID ) ) )
                    // InternalMetaTemplating.g:291:4: otherlv_0= '//' ( (lv_word_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getSolidusSolidusKeyword_0_0());
                    			
                    // InternalMetaTemplating.g:295:4: ( (lv_word_1_0= RULE_ID ) )
                    // InternalMetaTemplating.g:296:5: (lv_word_1_0= RULE_ID )
                    {
                    // InternalMetaTemplating.g:296:5: (lv_word_1_0= RULE_ID )
                    // InternalMetaTemplating.g:297:6: lv_word_1_0= RULE_ID
                    {
                    lv_word_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_word_1_0, grammarAccess.getCommentAccess().getWordIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCommentRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"word",
                    							lv_word_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:315:3: (otherlv_2= '/*' ( (lv_word_3_0= RULE_ID ) ) otherlv_4= '*/' )
                    {
                    // InternalMetaTemplating.g:315:3: (otherlv_2= '/*' ( (lv_word_3_0= RULE_ID ) ) otherlv_4= '*/' )
                    // InternalMetaTemplating.g:316:4: otherlv_2= '/*' ( (lv_word_3_0= RULE_ID ) ) otherlv_4= '*/'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getCommentAccess().getSolidusAsteriskKeyword_1_0());
                    			
                    // InternalMetaTemplating.g:320:4: ( (lv_word_3_0= RULE_ID ) )
                    // InternalMetaTemplating.g:321:5: (lv_word_3_0= RULE_ID )
                    {
                    // InternalMetaTemplating.g:321:5: (lv_word_3_0= RULE_ID )
                    // InternalMetaTemplating.g:322:6: lv_word_3_0= RULE_ID
                    {
                    lv_word_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(lv_word_3_0, grammarAccess.getCommentAccess().getWordIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCommentRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"word",
                    							lv_word_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getCommentAccess().getAsteriskSolidusKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleInstructions"
    // InternalMetaTemplating.g:347:1: entryRuleInstructions returns [EObject current=null] : iv_ruleInstructions= ruleInstructions EOF ;
    public final EObject entryRuleInstructions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstructions = null;


        try {
            // InternalMetaTemplating.g:347:53: (iv_ruleInstructions= ruleInstructions EOF )
            // InternalMetaTemplating.g:348:2: iv_ruleInstructions= ruleInstructions EOF
            {
             newCompositeNode(grammarAccess.getInstructionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstructions=ruleInstructions();

            state._fsp--;

             current =iv_ruleInstructions; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInstructions"


    // $ANTLR start "ruleInstructions"
    // InternalMetaTemplating.g:354:1: ruleInstructions returns [EObject current=null] : ( ( (lv_statement_0_0= ruleStatement ) ) | ( (lv_iterator_1_0= ruleIterator ) ) | ( (lv_rule_2_0= ruleRule ) ) | ( (lv_comment_3_0= ruleComment ) ) ) ;
    public final EObject ruleInstructions() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_0_0 = null;

        EObject lv_iterator_1_0 = null;

        EObject lv_rule_2_0 = null;

        EObject lv_comment_3_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:360:2: ( ( ( (lv_statement_0_0= ruleStatement ) ) | ( (lv_iterator_1_0= ruleIterator ) ) | ( (lv_rule_2_0= ruleRule ) ) | ( (lv_comment_3_0= ruleComment ) ) ) )
            // InternalMetaTemplating.g:361:2: ( ( (lv_statement_0_0= ruleStatement ) ) | ( (lv_iterator_1_0= ruleIterator ) ) | ( (lv_rule_2_0= ruleRule ) ) | ( (lv_comment_3_0= ruleComment ) ) )
            {
            // InternalMetaTemplating.g:361:2: ( ( (lv_statement_0_0= ruleStatement ) ) | ( (lv_iterator_1_0= ruleIterator ) ) | ( (lv_rule_2_0= ruleRule ) ) | ( (lv_comment_3_0= ruleComment ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 28:
            case 30:
            case 34:
            case 36:
                {
                alt5=1;
                }
                break;
            case 24:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            case 14:
            case 15:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMetaTemplating.g:362:3: ( (lv_statement_0_0= ruleStatement ) )
                    {
                    // InternalMetaTemplating.g:362:3: ( (lv_statement_0_0= ruleStatement ) )
                    // InternalMetaTemplating.g:363:4: (lv_statement_0_0= ruleStatement )
                    {
                    // InternalMetaTemplating.g:363:4: (lv_statement_0_0= ruleStatement )
                    // InternalMetaTemplating.g:364:5: lv_statement_0_0= ruleStatement
                    {

                    					newCompositeNode(grammarAccess.getInstructionsAccess().getStatementStatementParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_statement_0_0=ruleStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionsRule());
                    					}
                    					set(
                    						current,
                    						"statement",
                    						lv_statement_0_0,
                    						"org.xtext.example.mydsl.MetaTemplating.Statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:382:3: ( (lv_iterator_1_0= ruleIterator ) )
                    {
                    // InternalMetaTemplating.g:382:3: ( (lv_iterator_1_0= ruleIterator ) )
                    // InternalMetaTemplating.g:383:4: (lv_iterator_1_0= ruleIterator )
                    {
                    // InternalMetaTemplating.g:383:4: (lv_iterator_1_0= ruleIterator )
                    // InternalMetaTemplating.g:384:5: lv_iterator_1_0= ruleIterator
                    {

                    					newCompositeNode(grammarAccess.getInstructionsAccess().getIteratorIteratorParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_iterator_1_0=ruleIterator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionsRule());
                    					}
                    					set(
                    						current,
                    						"iterator",
                    						lv_iterator_1_0,
                    						"org.xtext.example.mydsl.MetaTemplating.Iterator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMetaTemplating.g:402:3: ( (lv_rule_2_0= ruleRule ) )
                    {
                    // InternalMetaTemplating.g:402:3: ( (lv_rule_2_0= ruleRule ) )
                    // InternalMetaTemplating.g:403:4: (lv_rule_2_0= ruleRule )
                    {
                    // InternalMetaTemplating.g:403:4: (lv_rule_2_0= ruleRule )
                    // InternalMetaTemplating.g:404:5: lv_rule_2_0= ruleRule
                    {

                    					newCompositeNode(grammarAccess.getInstructionsAccess().getRuleRuleParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_rule_2_0=ruleRule();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionsRule());
                    					}
                    					set(
                    						current,
                    						"rule",
                    						lv_rule_2_0,
                    						"org.xtext.example.mydsl.MetaTemplating.Rule");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMetaTemplating.g:422:3: ( (lv_comment_3_0= ruleComment ) )
                    {
                    // InternalMetaTemplating.g:422:3: ( (lv_comment_3_0= ruleComment ) )
                    // InternalMetaTemplating.g:423:4: (lv_comment_3_0= ruleComment )
                    {
                    // InternalMetaTemplating.g:423:4: (lv_comment_3_0= ruleComment )
                    // InternalMetaTemplating.g:424:5: lv_comment_3_0= ruleComment
                    {

                    					newCompositeNode(grammarAccess.getInstructionsAccess().getCommentCommentParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_comment_3_0=ruleComment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionsRule());
                    					}
                    					set(
                    						current,
                    						"comment",
                    						lv_comment_3_0,
                    						"org.xtext.example.mydsl.MetaTemplating.Comment");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstructions"


    // $ANTLR start "entryRuleStatement"
    // InternalMetaTemplating.g:445:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMetaTemplating.g:445:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMetaTemplating.g:446:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMetaTemplating.g:452:1: ruleStatement returns [EObject current=null] : ( ( (lv_text_0_0= RULE_ID ) ) | ( (lv_char_1_0= ruleEscaped ) ) | ( (lv_string_2_0= ruleEscapedString ) ) | ( (lv_placeholder_3_0= rulePh ) ) | ( (lv_metaPlaceholder_4_0= ruleMetaPh ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;
        EObject lv_char_1_0 = null;

        EObject lv_string_2_0 = null;

        EObject lv_placeholder_3_0 = null;

        EObject lv_metaPlaceholder_4_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:458:2: ( ( ( (lv_text_0_0= RULE_ID ) ) | ( (lv_char_1_0= ruleEscaped ) ) | ( (lv_string_2_0= ruleEscapedString ) ) | ( (lv_placeholder_3_0= rulePh ) ) | ( (lv_metaPlaceholder_4_0= ruleMetaPh ) ) ) )
            // InternalMetaTemplating.g:459:2: ( ( (lv_text_0_0= RULE_ID ) ) | ( (lv_char_1_0= ruleEscaped ) ) | ( (lv_string_2_0= ruleEscapedString ) ) | ( (lv_placeholder_3_0= rulePh ) ) | ( (lv_metaPlaceholder_4_0= ruleMetaPh ) ) )
            {
            // InternalMetaTemplating.g:459:2: ( ( (lv_text_0_0= RULE_ID ) ) | ( (lv_char_1_0= ruleEscaped ) ) | ( (lv_string_2_0= ruleEscapedString ) ) | ( (lv_placeholder_3_0= rulePh ) ) | ( (lv_metaPlaceholder_4_0= ruleMetaPh ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 36:
                {
                alt6=2;
                }
                break;
            case 34:
                {
                alt6=3;
                }
                break;
            case 28:
                {
                alt6=4;
                }
                break;
            case 30:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMetaTemplating.g:460:3: ( (lv_text_0_0= RULE_ID ) )
                    {
                    // InternalMetaTemplating.g:460:3: ( (lv_text_0_0= RULE_ID ) )
                    // InternalMetaTemplating.g:461:4: (lv_text_0_0= RULE_ID )
                    {
                    // InternalMetaTemplating.g:461:4: (lv_text_0_0= RULE_ID )
                    // InternalMetaTemplating.g:462:5: lv_text_0_0= RULE_ID
                    {
                    lv_text_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_text_0_0, grammarAccess.getStatementAccess().getTextIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStatementRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"text",
                    						lv_text_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:479:3: ( (lv_char_1_0= ruleEscaped ) )
                    {
                    // InternalMetaTemplating.g:479:3: ( (lv_char_1_0= ruleEscaped ) )
                    // InternalMetaTemplating.g:480:4: (lv_char_1_0= ruleEscaped )
                    {
                    // InternalMetaTemplating.g:480:4: (lv_char_1_0= ruleEscaped )
                    // InternalMetaTemplating.g:481:5: lv_char_1_0= ruleEscaped
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getCharEscapedParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_char_1_0=ruleEscaped();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementRule());
                    					}
                    					set(
                    						current,
                    						"char",
                    						lv_char_1_0,
                    						"org.xtext.example.mydsl.MetaTemplating.Escaped");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMetaTemplating.g:499:3: ( (lv_string_2_0= ruleEscapedString ) )
                    {
                    // InternalMetaTemplating.g:499:3: ( (lv_string_2_0= ruleEscapedString ) )
                    // InternalMetaTemplating.g:500:4: (lv_string_2_0= ruleEscapedString )
                    {
                    // InternalMetaTemplating.g:500:4: (lv_string_2_0= ruleEscapedString )
                    // InternalMetaTemplating.g:501:5: lv_string_2_0= ruleEscapedString
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getStringEscapedStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_string_2_0=ruleEscapedString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementRule());
                    					}
                    					set(
                    						current,
                    						"string",
                    						lv_string_2_0,
                    						"org.xtext.example.mydsl.MetaTemplating.EscapedString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMetaTemplating.g:519:3: ( (lv_placeholder_3_0= rulePh ) )
                    {
                    // InternalMetaTemplating.g:519:3: ( (lv_placeholder_3_0= rulePh ) )
                    // InternalMetaTemplating.g:520:4: (lv_placeholder_3_0= rulePh )
                    {
                    // InternalMetaTemplating.g:520:4: (lv_placeholder_3_0= rulePh )
                    // InternalMetaTemplating.g:521:5: lv_placeholder_3_0= rulePh
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getPlaceholderPhParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_placeholder_3_0=rulePh();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementRule());
                    					}
                    					set(
                    						current,
                    						"placeholder",
                    						lv_placeholder_3_0,
                    						"org.xtext.example.mydsl.MetaTemplating.Ph");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMetaTemplating.g:539:3: ( (lv_metaPlaceholder_4_0= ruleMetaPh ) )
                    {
                    // InternalMetaTemplating.g:539:3: ( (lv_metaPlaceholder_4_0= ruleMetaPh ) )
                    // InternalMetaTemplating.g:540:4: (lv_metaPlaceholder_4_0= ruleMetaPh )
                    {
                    // InternalMetaTemplating.g:540:4: (lv_metaPlaceholder_4_0= ruleMetaPh )
                    // InternalMetaTemplating.g:541:5: lv_metaPlaceholder_4_0= ruleMetaPh
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getMetaPlaceholderMetaPhParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_metaPlaceholder_4_0=ruleMetaPh();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementRule());
                    					}
                    					set(
                    						current,
                    						"metaPlaceholder",
                    						lv_metaPlaceholder_4_0,
                    						"org.xtext.example.mydsl.MetaTemplating.MetaPh");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleRule"
    // InternalMetaTemplating.g:562:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalMetaTemplating.g:562:45: (iv_ruleRule= ruleRule EOF )
            // InternalMetaTemplating.g:563:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalMetaTemplating.g:569:1: ruleRule returns [EObject current=null] : (otherlv_0= 'FORALL' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_property_4_0= ruleProperty ) ) otherlv_5= 'TAGGED' ( (lv_tag_6_0= RULE_ID ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_body_9_0= ruleInstructions ) )* otherlv_10= '}' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_element_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_tag_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_property_4_0 = null;

        EObject lv_body_9_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:575:2: ( (otherlv_0= 'FORALL' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_property_4_0= ruleProperty ) ) otherlv_5= 'TAGGED' ( (lv_tag_6_0= RULE_ID ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_body_9_0= ruleInstructions ) )* otherlv_10= '}' ) )
            // InternalMetaTemplating.g:576:2: (otherlv_0= 'FORALL' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_property_4_0= ruleProperty ) ) otherlv_5= 'TAGGED' ( (lv_tag_6_0= RULE_ID ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_body_9_0= ruleInstructions ) )* otherlv_10= '}' )
            {
            // InternalMetaTemplating.g:576:2: (otherlv_0= 'FORALL' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_property_4_0= ruleProperty ) ) otherlv_5= 'TAGGED' ( (lv_tag_6_0= RULE_ID ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_body_9_0= ruleInstructions ) )* otherlv_10= '}' )
            // InternalMetaTemplating.g:577:3: otherlv_0= 'FORALL' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_property_4_0= ruleProperty ) ) otherlv_5= 'TAGGED' ( (lv_tag_6_0= RULE_ID ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_body_9_0= ruleInstructions ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getFORALLKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMetaTemplating.g:585:3: ( (lv_element_2_0= RULE_ID ) )
            // InternalMetaTemplating.g:586:4: (lv_element_2_0= RULE_ID )
            {
            // InternalMetaTemplating.g:586:4: (lv_element_2_0= RULE_ID )
            // InternalMetaTemplating.g:587:5: lv_element_2_0= RULE_ID
            {
            lv_element_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_element_2_0, grammarAccess.getRuleAccess().getElementIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"element",
            						lv_element_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getColonKeyword_3());
            		
            // InternalMetaTemplating.g:607:3: ( (lv_property_4_0= ruleProperty ) )
            // InternalMetaTemplating.g:608:4: (lv_property_4_0= ruleProperty )
            {
            // InternalMetaTemplating.g:608:4: (lv_property_4_0= ruleProperty )
            // InternalMetaTemplating.g:609:5: lv_property_4_0= ruleProperty
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getPropertyPropertyParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_property_4_0=ruleProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"property",
            						lv_property_4_0,
            						"org.xtext.example.mydsl.MetaTemplating.Property");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getTAGGEDKeyword_5());
            		
            // InternalMetaTemplating.g:630:3: ( (lv_tag_6_0= RULE_ID ) )
            // InternalMetaTemplating.g:631:4: (lv_tag_6_0= RULE_ID )
            {
            // InternalMetaTemplating.g:631:4: (lv_tag_6_0= RULE_ID )
            // InternalMetaTemplating.g:632:5: lv_tag_6_0= RULE_ID
            {
            lv_tag_6_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_tag_6_0, grammarAccess.getRuleAccess().getTagIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tag",
            						lv_tag_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalMetaTemplating.g:656:3: ( (lv_body_9_0= ruleInstructions ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=14 && LA7_0<=15)||LA7_0==17||LA7_0==24||LA7_0==28||LA7_0==30||LA7_0==34||LA7_0==36) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMetaTemplating.g:657:4: (lv_body_9_0= ruleInstructions )
            	    {
            	    // InternalMetaTemplating.g:657:4: (lv_body_9_0= ruleInstructions )
            	    // InternalMetaTemplating.g:658:5: lv_body_9_0= ruleInstructions
            	    {

            	    					newCompositeNode(grammarAccess.getRuleAccess().getBodyInstructionsParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_body_9_0=ruleInstructions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"body",
            	    						lv_body_9_0,
            	    						"org.xtext.example.mydsl.MetaTemplating.Instructions");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_10=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleIterator"
    // InternalMetaTemplating.g:683:1: entryRuleIterator returns [EObject current=null] : iv_ruleIterator= ruleIterator EOF ;
    public final EObject entryRuleIterator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterator = null;


        try {
            // InternalMetaTemplating.g:683:49: (iv_ruleIterator= ruleIterator EOF )
            // InternalMetaTemplating.g:684:2: iv_ruleIterator= ruleIterator EOF
            {
             newCompositeNode(grammarAccess.getIteratorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIterator=ruleIterator();

            state._fsp--;

             current =iv_ruleIterator; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIterator"


    // $ANTLR start "ruleIterator"
    // InternalMetaTemplating.g:690:1: ruleIterator returns [EObject current=null] : (otherlv_0= 'foreach' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= 'in' ( (lv_query_4_0= ruleQuery ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_body_7_0= ruleInstructions ) )* otherlv_8= '}' ) ;
    public final EObject ruleIterator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_element_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_query_4_0 = null;

        EObject lv_body_7_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:696:2: ( (otherlv_0= 'foreach' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= 'in' ( (lv_query_4_0= ruleQuery ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_body_7_0= ruleInstructions ) )* otherlv_8= '}' ) )
            // InternalMetaTemplating.g:697:2: (otherlv_0= 'foreach' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= 'in' ( (lv_query_4_0= ruleQuery ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_body_7_0= ruleInstructions ) )* otherlv_8= '}' )
            {
            // InternalMetaTemplating.g:697:2: (otherlv_0= 'foreach' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= 'in' ( (lv_query_4_0= ruleQuery ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_body_7_0= ruleInstructions ) )* otherlv_8= '}' )
            // InternalMetaTemplating.g:698:3: otherlv_0= 'foreach' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= 'in' ( (lv_query_4_0= ruleQuery ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_body_7_0= ruleInstructions ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getIteratorAccess().getForeachKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getIteratorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMetaTemplating.g:706:3: ( (lv_element_2_0= RULE_ID ) )
            // InternalMetaTemplating.g:707:4: (lv_element_2_0= RULE_ID )
            {
            // InternalMetaTemplating.g:707:4: (lv_element_2_0= RULE_ID )
            // InternalMetaTemplating.g:708:5: lv_element_2_0= RULE_ID
            {
            lv_element_2_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_element_2_0, grammarAccess.getIteratorAccess().getElementIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIteratorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"element",
            						lv_element_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getIteratorAccess().getInKeyword_3());
            		
            // InternalMetaTemplating.g:728:3: ( (lv_query_4_0= ruleQuery ) )
            // InternalMetaTemplating.g:729:4: (lv_query_4_0= ruleQuery )
            {
            // InternalMetaTemplating.g:729:4: (lv_query_4_0= ruleQuery )
            // InternalMetaTemplating.g:730:5: lv_query_4_0= ruleQuery
            {

            					newCompositeNode(grammarAccess.getIteratorAccess().getQueryQueryParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_query_4_0=ruleQuery();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIteratorRule());
            					}
            					set(
            						current,
            						"query",
            						lv_query_4_0,
            						"org.xtext.example.mydsl.MetaTemplating.Query");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getIteratorAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getIteratorAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalMetaTemplating.g:755:3: ( (lv_body_7_0= ruleInstructions ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||(LA8_0>=14 && LA8_0<=15)||LA8_0==17||LA8_0==24||LA8_0==28||LA8_0==30||LA8_0==34||LA8_0==36) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMetaTemplating.g:756:4: (lv_body_7_0= ruleInstructions )
            	    {
            	    // InternalMetaTemplating.g:756:4: (lv_body_7_0= ruleInstructions )
            	    // InternalMetaTemplating.g:757:5: lv_body_7_0= ruleInstructions
            	    {

            	    					newCompositeNode(grammarAccess.getIteratorAccess().getBodyInstructionsParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_body_7_0=ruleInstructions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIteratorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"body",
            	    						lv_body_7_0,
            	    						"org.xtext.example.mydsl.MetaTemplating.Instructions");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_8=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getIteratorAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIterator"


    // $ANTLR start "entryRuleQuery"
    // InternalMetaTemplating.g:782:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalMetaTemplating.g:782:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalMetaTemplating.g:783:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalMetaTemplating.g:789:1: ruleQuery returns [EObject current=null] : ( ( ( (lv_item_0_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleMetaPh ) ) ) ( (lv_subQuery_2_0= ruleSubQuery ) )* ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token lv_item_0_0=null;
        EObject lv_ref_1_0 = null;

        EObject lv_subQuery_2_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:795:2: ( ( ( ( (lv_item_0_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleMetaPh ) ) ) ( (lv_subQuery_2_0= ruleSubQuery ) )* ) )
            // InternalMetaTemplating.g:796:2: ( ( ( (lv_item_0_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleMetaPh ) ) ) ( (lv_subQuery_2_0= ruleSubQuery ) )* )
            {
            // InternalMetaTemplating.g:796:2: ( ( ( (lv_item_0_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleMetaPh ) ) ) ( (lv_subQuery_2_0= ruleSubQuery ) )* )
            // InternalMetaTemplating.g:797:3: ( ( (lv_item_0_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleMetaPh ) ) ) ( (lv_subQuery_2_0= ruleSubQuery ) )*
            {
            // InternalMetaTemplating.g:797:3: ( ( (lv_item_0_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleMetaPh ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==30) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMetaTemplating.g:798:4: ( (lv_item_0_0= RULE_ID ) )
                    {
                    // InternalMetaTemplating.g:798:4: ( (lv_item_0_0= RULE_ID ) )
                    // InternalMetaTemplating.g:799:5: (lv_item_0_0= RULE_ID )
                    {
                    // InternalMetaTemplating.g:799:5: (lv_item_0_0= RULE_ID )
                    // InternalMetaTemplating.g:800:6: lv_item_0_0= RULE_ID
                    {
                    lv_item_0_0=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(lv_item_0_0, grammarAccess.getQueryAccess().getItemIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQueryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"item",
                    							lv_item_0_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:817:4: ( (lv_ref_1_0= ruleMetaPh ) )
                    {
                    // InternalMetaTemplating.g:817:4: ( (lv_ref_1_0= ruleMetaPh ) )
                    // InternalMetaTemplating.g:818:5: (lv_ref_1_0= ruleMetaPh )
                    {
                    // InternalMetaTemplating.g:818:5: (lv_ref_1_0= ruleMetaPh )
                    // InternalMetaTemplating.g:819:6: lv_ref_1_0= ruleMetaPh
                    {

                    						newCompositeNode(grammarAccess.getQueryAccess().getRefMetaPhParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_ref_1_0=ruleMetaPh();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQueryRule());
                    						}
                    						set(
                    							current,
                    							"ref",
                    							lv_ref_1_0,
                    							"org.xtext.example.mydsl.MetaTemplating.MetaPh");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMetaTemplating.g:837:3: ( (lv_subQuery_2_0= ruleSubQuery ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMetaTemplating.g:838:4: (lv_subQuery_2_0= ruleSubQuery )
            	    {
            	    // InternalMetaTemplating.g:838:4: (lv_subQuery_2_0= ruleSubQuery )
            	    // InternalMetaTemplating.g:839:5: lv_subQuery_2_0= ruleSubQuery
            	    {

            	    					newCompositeNode(grammarAccess.getQueryAccess().getSubQuerySubQueryParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_subQuery_2_0=ruleSubQuery();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQueryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"subQuery",
            	    						lv_subQuery_2_0,
            	    						"org.xtext.example.mydsl.MetaTemplating.SubQuery");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleSubQuery"
    // InternalMetaTemplating.g:860:1: entryRuleSubQuery returns [EObject current=null] : iv_ruleSubQuery= ruleSubQuery EOF ;
    public final EObject entryRuleSubQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubQuery = null;


        try {
            // InternalMetaTemplating.g:860:49: (iv_ruleSubQuery= ruleSubQuery EOF )
            // InternalMetaTemplating.g:861:2: iv_ruleSubQuery= ruleSubQuery EOF
            {
             newCompositeNode(grammarAccess.getSubQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubQuery=ruleSubQuery();

            state._fsp--;

             current =iv_ruleSubQuery; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSubQuery"


    // $ANTLR start "ruleSubQuery"
    // InternalMetaTemplating.g:867:1: ruleSubQuery returns [EObject current=null] : (otherlv_0= '.' ( ( (lv_item_1_0= RULE_ID ) ) | ( (lv_ref_2_0= ruleMetaPh ) ) ) (otherlv_3= '()' )? ) ;
    public final EObject ruleSubQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_item_1_0=null;
        Token otherlv_3=null;
        EObject lv_ref_2_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:873:2: ( (otherlv_0= '.' ( ( (lv_item_1_0= RULE_ID ) ) | ( (lv_ref_2_0= ruleMetaPh ) ) ) (otherlv_3= '()' )? ) )
            // InternalMetaTemplating.g:874:2: (otherlv_0= '.' ( ( (lv_item_1_0= RULE_ID ) ) | ( (lv_ref_2_0= ruleMetaPh ) ) ) (otherlv_3= '()' )? )
            {
            // InternalMetaTemplating.g:874:2: (otherlv_0= '.' ( ( (lv_item_1_0= RULE_ID ) ) | ( (lv_ref_2_0= ruleMetaPh ) ) ) (otherlv_3= '()' )? )
            // InternalMetaTemplating.g:875:3: otherlv_0= '.' ( ( (lv_item_1_0= RULE_ID ) ) | ( (lv_ref_2_0= ruleMetaPh ) ) ) (otherlv_3= '()' )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getSubQueryAccess().getFullStopKeyword_0());
            		
            // InternalMetaTemplating.g:879:3: ( ( (lv_item_1_0= RULE_ID ) ) | ( (lv_ref_2_0= ruleMetaPh ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==30) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMetaTemplating.g:880:4: ( (lv_item_1_0= RULE_ID ) )
                    {
                    // InternalMetaTemplating.g:880:4: ( (lv_item_1_0= RULE_ID ) )
                    // InternalMetaTemplating.g:881:5: (lv_item_1_0= RULE_ID )
                    {
                    // InternalMetaTemplating.g:881:5: (lv_item_1_0= RULE_ID )
                    // InternalMetaTemplating.g:882:6: lv_item_1_0= RULE_ID
                    {
                    lv_item_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(lv_item_1_0, grammarAccess.getSubQueryAccess().getItemIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSubQueryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"item",
                    							lv_item_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:899:4: ( (lv_ref_2_0= ruleMetaPh ) )
                    {
                    // InternalMetaTemplating.g:899:4: ( (lv_ref_2_0= ruleMetaPh ) )
                    // InternalMetaTemplating.g:900:5: (lv_ref_2_0= ruleMetaPh )
                    {
                    // InternalMetaTemplating.g:900:5: (lv_ref_2_0= ruleMetaPh )
                    // InternalMetaTemplating.g:901:6: lv_ref_2_0= ruleMetaPh
                    {

                    						newCompositeNode(grammarAccess.getSubQueryAccess().getRefMetaPhParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_ref_2_0=ruleMetaPh();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubQueryRule());
                    						}
                    						set(
                    							current,
                    							"ref",
                    							lv_ref_2_0,
                    							"org.xtext.example.mydsl.MetaTemplating.MetaPh");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMetaTemplating.g:919:3: (otherlv_3= '()' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMetaTemplating.g:920:4: otherlv_3= '()'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getSubQueryAccess().getLeftParenthesisRightParenthesisKeyword_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubQuery"


    // $ANTLR start "entryRulePh"
    // InternalMetaTemplating.g:929:1: entryRulePh returns [EObject current=null] : iv_rulePh= rulePh EOF ;
    public final EObject entryRulePh() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePh = null;


        try {
            // InternalMetaTemplating.g:929:43: (iv_rulePh= rulePh EOF )
            // InternalMetaTemplating.g:930:2: iv_rulePh= rulePh EOF
            {
             newCompositeNode(grammarAccess.getPhRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePh=rulePh();

            state._fsp--;

             current =iv_rulePh; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePh"


    // $ANTLR start "rulePh"
    // InternalMetaTemplating.g:936:1: rulePh returns [EObject current=null] : (otherlv_0= '[[' ( (lv_property_1_0= ruleProperty ) ) ( (lv_metaProperty_2_0= ruleMetaProperty ) )? otherlv_3= ']]' ) ;
    public final EObject rulePh() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_property_1_0 = null;

        EObject lv_metaProperty_2_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:942:2: ( (otherlv_0= '[[' ( (lv_property_1_0= ruleProperty ) ) ( (lv_metaProperty_2_0= ruleMetaProperty ) )? otherlv_3= ']]' ) )
            // InternalMetaTemplating.g:943:2: (otherlv_0= '[[' ( (lv_property_1_0= ruleProperty ) ) ( (lv_metaProperty_2_0= ruleMetaProperty ) )? otherlv_3= ']]' )
            {
            // InternalMetaTemplating.g:943:2: (otherlv_0= '[[' ( (lv_property_1_0= ruleProperty ) ) ( (lv_metaProperty_2_0= ruleMetaProperty ) )? otherlv_3= ']]' )
            // InternalMetaTemplating.g:944:3: otherlv_0= '[[' ( (lv_property_1_0= ruleProperty ) ) ( (lv_metaProperty_2_0= ruleMetaProperty ) )? otherlv_3= ']]'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPhAccess().getLeftSquareBracketLeftSquareBracketKeyword_0());
            		
            // InternalMetaTemplating.g:948:3: ( (lv_property_1_0= ruleProperty ) )
            // InternalMetaTemplating.g:949:4: (lv_property_1_0= ruleProperty )
            {
            // InternalMetaTemplating.g:949:4: (lv_property_1_0= ruleProperty )
            // InternalMetaTemplating.g:950:5: lv_property_1_0= ruleProperty
            {

            					newCompositeNode(grammarAccess.getPhAccess().getPropertyPropertyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_property_1_0=ruleProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhRule());
            					}
            					set(
            						current,
            						"property",
            						lv_property_1_0,
            						"org.xtext.example.mydsl.MetaTemplating.Property");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMetaTemplating.g:967:3: ( (lv_metaProperty_2_0= ruleMetaProperty ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMetaTemplating.g:968:4: (lv_metaProperty_2_0= ruleMetaProperty )
                    {
                    // InternalMetaTemplating.g:968:4: (lv_metaProperty_2_0= ruleMetaProperty )
                    // InternalMetaTemplating.g:969:5: lv_metaProperty_2_0= ruleMetaProperty
                    {

                    					newCompositeNode(grammarAccess.getPhAccess().getMetaPropertyMetaPropertyParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_metaProperty_2_0=ruleMetaProperty();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPhRule());
                    					}
                    					set(
                    						current,
                    						"metaProperty",
                    						lv_metaProperty_2_0,
                    						"org.xtext.example.mydsl.MetaTemplating.MetaProperty");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPhAccess().getRightSquareBracketRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePh"


    // $ANTLR start "entryRuleMetaPh"
    // InternalMetaTemplating.g:994:1: entryRuleMetaPh returns [EObject current=null] : iv_ruleMetaPh= ruleMetaPh EOF ;
    public final EObject entryRuleMetaPh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaPh = null;


        try {
            // InternalMetaTemplating.g:994:47: (iv_ruleMetaPh= ruleMetaPh EOF )
            // InternalMetaTemplating.g:995:2: iv_ruleMetaPh= ruleMetaPh EOF
            {
             newCompositeNode(grammarAccess.getMetaPhRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetaPh=ruleMetaPh();

            state._fsp--;

             current =iv_ruleMetaPh; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMetaPh"


    // $ANTLR start "ruleMetaPh"
    // InternalMetaTemplating.g:1001:1: ruleMetaPh returns [EObject current=null] : (otherlv_0= '[' ( (lv_property_1_0= ruleProperty ) ) (otherlv_2= 'TAGINFO' ( (lv_tag_3_0= RULE_STRING ) ) )? otherlv_4= ']' ) ;
    public final EObject ruleMetaPh() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_tag_3_0=null;
        Token otherlv_4=null;
        EObject lv_property_1_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:1007:2: ( (otherlv_0= '[' ( (lv_property_1_0= ruleProperty ) ) (otherlv_2= 'TAGINFO' ( (lv_tag_3_0= RULE_STRING ) ) )? otherlv_4= ']' ) )
            // InternalMetaTemplating.g:1008:2: (otherlv_0= '[' ( (lv_property_1_0= ruleProperty ) ) (otherlv_2= 'TAGINFO' ( (lv_tag_3_0= RULE_STRING ) ) )? otherlv_4= ']' )
            {
            // InternalMetaTemplating.g:1008:2: (otherlv_0= '[' ( (lv_property_1_0= ruleProperty ) ) (otherlv_2= 'TAGINFO' ( (lv_tag_3_0= RULE_STRING ) ) )? otherlv_4= ']' )
            // InternalMetaTemplating.g:1009:3: otherlv_0= '[' ( (lv_property_1_0= ruleProperty ) ) (otherlv_2= 'TAGINFO' ( (lv_tag_3_0= RULE_STRING ) ) )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMetaPhAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalMetaTemplating.g:1013:3: ( (lv_property_1_0= ruleProperty ) )
            // InternalMetaTemplating.g:1014:4: (lv_property_1_0= ruleProperty )
            {
            // InternalMetaTemplating.g:1014:4: (lv_property_1_0= ruleProperty )
            // InternalMetaTemplating.g:1015:5: lv_property_1_0= ruleProperty
            {

            					newCompositeNode(grammarAccess.getMetaPhAccess().getPropertyPropertyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_property_1_0=ruleProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetaPhRule());
            					}
            					set(
            						current,
            						"property",
            						lv_property_1_0,
            						"org.xtext.example.mydsl.MetaTemplating.Property");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMetaTemplating.g:1032:3: (otherlv_2= 'TAGINFO' ( (lv_tag_3_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMetaTemplating.g:1033:4: otherlv_2= 'TAGINFO' ( (lv_tag_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getMetaPhAccess().getTAGINFOKeyword_2_0());
                    			
                    // InternalMetaTemplating.g:1037:4: ( (lv_tag_3_0= RULE_STRING ) )
                    // InternalMetaTemplating.g:1038:5: (lv_tag_3_0= RULE_STRING )
                    {
                    // InternalMetaTemplating.g:1038:5: (lv_tag_3_0= RULE_STRING )
                    // InternalMetaTemplating.g:1039:6: lv_tag_3_0= RULE_STRING
                    {
                    lv_tag_3_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

                    						newLeafNode(lv_tag_3_0, grammarAccess.getMetaPhAccess().getTagSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMetaPhRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"tag",
                    							lv_tag_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMetaPhAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetaPh"


    // $ANTLR start "entryRuleMetaProperty"
    // InternalMetaTemplating.g:1064:1: entryRuleMetaProperty returns [EObject current=null] : iv_ruleMetaProperty= ruleMetaProperty EOF ;
    public final EObject entryRuleMetaProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaProperty = null;


        try {
            // InternalMetaTemplating.g:1064:53: (iv_ruleMetaProperty= ruleMetaProperty EOF )
            // InternalMetaTemplating.g:1065:2: iv_ruleMetaProperty= ruleMetaProperty EOF
            {
             newCompositeNode(grammarAccess.getMetaPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetaProperty=ruleMetaProperty();

            state._fsp--;

             current =iv_ruleMetaProperty; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMetaProperty"


    // $ANTLR start "ruleMetaProperty"
    // InternalMetaTemplating.g:1071:1: ruleMetaProperty returns [EObject current=null] : (otherlv_0= '.{' ( (lv_property_1_0= ruleProperty ) ) otherlv_2= '}' ) ;
    public final EObject ruleMetaProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_property_1_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:1077:2: ( (otherlv_0= '.{' ( (lv_property_1_0= ruleProperty ) ) otherlv_2= '}' ) )
            // InternalMetaTemplating.g:1078:2: (otherlv_0= '.{' ( (lv_property_1_0= ruleProperty ) ) otherlv_2= '}' )
            {
            // InternalMetaTemplating.g:1078:2: (otherlv_0= '.{' ( (lv_property_1_0= ruleProperty ) ) otherlv_2= '}' )
            // InternalMetaTemplating.g:1079:3: otherlv_0= '.{' ( (lv_property_1_0= ruleProperty ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMetaPropertyAccess().getFullStopLeftCurlyBracketKeyword_0());
            		
            // InternalMetaTemplating.g:1083:3: ( (lv_property_1_0= ruleProperty ) )
            // InternalMetaTemplating.g:1084:4: (lv_property_1_0= ruleProperty )
            {
            // InternalMetaTemplating.g:1084:4: (lv_property_1_0= ruleProperty )
            // InternalMetaTemplating.g:1085:5: lv_property_1_0= ruleProperty
            {

            					newCompositeNode(grammarAccess.getMetaPropertyAccess().getPropertyPropertyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_property_1_0=ruleProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetaPropertyRule());
            					}
            					set(
            						current,
            						"property",
            						lv_property_1_0,
            						"org.xtext.example.mydsl.MetaTemplating.Property");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getMetaPropertyAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetaProperty"


    // $ANTLR start "entryRuleProperty"
    // InternalMetaTemplating.g:1110:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalMetaTemplating.g:1110:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalMetaTemplating.g:1111:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalMetaTemplating.g:1117:1: ruleProperty returns [EObject current=null] : ( ( (lv_property_0_0= RULE_ID ) ) ( (lv_subProperties_1_0= ruleSubProperty ) )* ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_property_0_0=null;
        EObject lv_subProperties_1_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:1123:2: ( ( ( (lv_property_0_0= RULE_ID ) ) ( (lv_subProperties_1_0= ruleSubProperty ) )* ) )
            // InternalMetaTemplating.g:1124:2: ( ( (lv_property_0_0= RULE_ID ) ) ( (lv_subProperties_1_0= ruleSubProperty ) )* )
            {
            // InternalMetaTemplating.g:1124:2: ( ( (lv_property_0_0= RULE_ID ) ) ( (lv_subProperties_1_0= ruleSubProperty ) )* )
            // InternalMetaTemplating.g:1125:3: ( (lv_property_0_0= RULE_ID ) ) ( (lv_subProperties_1_0= ruleSubProperty ) )*
            {
            // InternalMetaTemplating.g:1125:3: ( (lv_property_0_0= RULE_ID ) )
            // InternalMetaTemplating.g:1126:4: (lv_property_0_0= RULE_ID )
            {
            // InternalMetaTemplating.g:1126:4: (lv_property_0_0= RULE_ID )
            // InternalMetaTemplating.g:1127:5: lv_property_0_0= RULE_ID
            {
            lv_property_0_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_property_0_0, grammarAccess.getPropertyAccess().getPropertyIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"property",
            						lv_property_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMetaTemplating.g:1143:3: ( (lv_subProperties_1_0= ruleSubProperty ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMetaTemplating.g:1144:4: (lv_subProperties_1_0= ruleSubProperty )
            	    {
            	    // InternalMetaTemplating.g:1144:4: (lv_subProperties_1_0= ruleSubProperty )
            	    // InternalMetaTemplating.g:1145:5: lv_subProperties_1_0= ruleSubProperty
            	    {

            	    					newCompositeNode(grammarAccess.getPropertyAccess().getSubPropertiesSubPropertyParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_subProperties_1_0=ruleSubProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPropertyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"subProperties",
            	    						lv_subProperties_1_0,
            	    						"org.xtext.example.mydsl.MetaTemplating.SubProperty");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleSubProperty"
    // InternalMetaTemplating.g:1166:1: entryRuleSubProperty returns [EObject current=null] : iv_ruleSubProperty= ruleSubProperty EOF ;
    public final EObject entryRuleSubProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubProperty = null;


        try {
            // InternalMetaTemplating.g:1166:52: (iv_ruleSubProperty= ruleSubProperty EOF )
            // InternalMetaTemplating.g:1167:2: iv_ruleSubProperty= ruleSubProperty EOF
            {
             newCompositeNode(grammarAccess.getSubPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubProperty=ruleSubProperty();

            state._fsp--;

             current =iv_ruleSubProperty; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSubProperty"


    // $ANTLR start "ruleSubProperty"
    // InternalMetaTemplating.g:1173:1: ruleSubProperty returns [EObject current=null] : (otherlv_0= '.' ( (lv_property_1_0= RULE_ID ) ) (otherlv_2= '()' )? ) ;
    public final EObject ruleSubProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_property_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMetaTemplating.g:1179:2: ( (otherlv_0= '.' ( (lv_property_1_0= RULE_ID ) ) (otherlv_2= '()' )? ) )
            // InternalMetaTemplating.g:1180:2: (otherlv_0= '.' ( (lv_property_1_0= RULE_ID ) ) (otherlv_2= '()' )? )
            {
            // InternalMetaTemplating.g:1180:2: (otherlv_0= '.' ( (lv_property_1_0= RULE_ID ) ) (otherlv_2= '()' )? )
            // InternalMetaTemplating.g:1181:3: otherlv_0= '.' ( (lv_property_1_0= RULE_ID ) ) (otherlv_2= '()' )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSubPropertyAccess().getFullStopKeyword_0());
            		
            // InternalMetaTemplating.g:1185:3: ( (lv_property_1_0= RULE_ID ) )
            // InternalMetaTemplating.g:1186:4: (lv_property_1_0= RULE_ID )
            {
            // InternalMetaTemplating.g:1186:4: (lv_property_1_0= RULE_ID )
            // InternalMetaTemplating.g:1187:5: lv_property_1_0= RULE_ID
            {
            lv_property_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_property_1_0, grammarAccess.getSubPropertyAccess().getPropertyIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"property",
            						lv_property_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMetaTemplating.g:1203:3: (otherlv_2= '()' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMetaTemplating.g:1204:4: otherlv_2= '()'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getSubPropertyAccess().getLeftParenthesisRightParenthesisKeyword_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubProperty"


    // $ANTLR start "entryRuleEscapedString"
    // InternalMetaTemplating.g:1213:1: entryRuleEscapedString returns [EObject current=null] : iv_ruleEscapedString= ruleEscapedString EOF ;
    public final EObject entryRuleEscapedString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscapedString = null;


        try {
            // InternalMetaTemplating.g:1213:54: (iv_ruleEscapedString= ruleEscapedString EOF )
            // InternalMetaTemplating.g:1214:2: iv_ruleEscapedString= ruleEscapedString EOF
            {
             newCompositeNode(grammarAccess.getEscapedStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEscapedString=ruleEscapedString();

            state._fsp--;

             current =iv_ruleEscapedString; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEscapedString"


    // $ANTLR start "ruleEscapedString"
    // InternalMetaTemplating.g:1220:1: ruleEscapedString returns [EObject current=null] : (otherlv_0= '@{' ( (lv_str_1_0= RULE_STRING ) ) otherlv_2= '}@' ) ;
    public final EObject ruleEscapedString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_str_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMetaTemplating.g:1226:2: ( (otherlv_0= '@{' ( (lv_str_1_0= RULE_STRING ) ) otherlv_2= '}@' ) )
            // InternalMetaTemplating.g:1227:2: (otherlv_0= '@{' ( (lv_str_1_0= RULE_STRING ) ) otherlv_2= '}@' )
            {
            // InternalMetaTemplating.g:1227:2: (otherlv_0= '@{' ( (lv_str_1_0= RULE_STRING ) ) otherlv_2= '}@' )
            // InternalMetaTemplating.g:1228:3: otherlv_0= '@{' ( (lv_str_1_0= RULE_STRING ) ) otherlv_2= '}@'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getEscapedStringAccess().getCommercialAtLeftCurlyBracketKeyword_0());
            		
            // InternalMetaTemplating.g:1232:3: ( (lv_str_1_0= RULE_STRING ) )
            // InternalMetaTemplating.g:1233:4: (lv_str_1_0= RULE_STRING )
            {
            // InternalMetaTemplating.g:1233:4: (lv_str_1_0= RULE_STRING )
            // InternalMetaTemplating.g:1234:5: lv_str_1_0= RULE_STRING
            {
            lv_str_1_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_str_1_0, grammarAccess.getEscapedStringAccess().getStrSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEscapedStringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"str",
            						lv_str_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEscapedStringAccess().getRightCurlyBracketCommercialAtKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEscapedString"


    // $ANTLR start "entryRuleEscaped"
    // InternalMetaTemplating.g:1258:1: entryRuleEscaped returns [EObject current=null] : iv_ruleEscaped= ruleEscaped EOF ;
    public final EObject entryRuleEscaped() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscaped = null;


        try {
            // InternalMetaTemplating.g:1258:48: (iv_ruleEscaped= ruleEscaped EOF )
            // InternalMetaTemplating.g:1259:2: iv_ruleEscaped= ruleEscaped EOF
            {
             newCompositeNode(grammarAccess.getEscapedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEscaped=ruleEscaped();

            state._fsp--;

             current =iv_ruleEscaped; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEscaped"


    // $ANTLR start "ruleEscaped"
    // InternalMetaTemplating.g:1265:1: ruleEscaped returns [EObject current=null] : (otherlv_0= '#' ( ( (lv_char_1_1= '#' | lv_char_1_2= '{' | lv_char_1_3= '}' | lv_char_1_4= '[' | lv_char_1_5= ']' | lv_char_1_6= ',' | lv_char_1_7= ';' | lv_char_1_8= '(' | lv_char_1_9= ')' | lv_char_1_10= ':' | lv_char_1_11= '<' | lv_char_1_12= '>' | lv_char_1_13= '\\'' ) ) ) ) ;
    public final EObject ruleEscaped() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_char_1_1=null;
        Token lv_char_1_2=null;
        Token lv_char_1_3=null;
        Token lv_char_1_4=null;
        Token lv_char_1_5=null;
        Token lv_char_1_6=null;
        Token lv_char_1_7=null;
        Token lv_char_1_8=null;
        Token lv_char_1_9=null;
        Token lv_char_1_10=null;
        Token lv_char_1_11=null;
        Token lv_char_1_12=null;
        Token lv_char_1_13=null;


        	enterRule();

        try {
            // InternalMetaTemplating.g:1271:2: ( (otherlv_0= '#' ( ( (lv_char_1_1= '#' | lv_char_1_2= '{' | lv_char_1_3= '}' | lv_char_1_4= '[' | lv_char_1_5= ']' | lv_char_1_6= ',' | lv_char_1_7= ';' | lv_char_1_8= '(' | lv_char_1_9= ')' | lv_char_1_10= ':' | lv_char_1_11= '<' | lv_char_1_12= '>' | lv_char_1_13= '\\'' ) ) ) ) )
            // InternalMetaTemplating.g:1272:2: (otherlv_0= '#' ( ( (lv_char_1_1= '#' | lv_char_1_2= '{' | lv_char_1_3= '}' | lv_char_1_4= '[' | lv_char_1_5= ']' | lv_char_1_6= ',' | lv_char_1_7= ';' | lv_char_1_8= '(' | lv_char_1_9= ')' | lv_char_1_10= ':' | lv_char_1_11= '<' | lv_char_1_12= '>' | lv_char_1_13= '\\'' ) ) ) )
            {
            // InternalMetaTemplating.g:1272:2: (otherlv_0= '#' ( ( (lv_char_1_1= '#' | lv_char_1_2= '{' | lv_char_1_3= '}' | lv_char_1_4= '[' | lv_char_1_5= ']' | lv_char_1_6= ',' | lv_char_1_7= ';' | lv_char_1_8= '(' | lv_char_1_9= ')' | lv_char_1_10= ':' | lv_char_1_11= '<' | lv_char_1_12= '>' | lv_char_1_13= '\\'' ) ) ) )
            // InternalMetaTemplating.g:1273:3: otherlv_0= '#' ( ( (lv_char_1_1= '#' | lv_char_1_2= '{' | lv_char_1_3= '}' | lv_char_1_4= '[' | lv_char_1_5= ']' | lv_char_1_6= ',' | lv_char_1_7= ';' | lv_char_1_8= '(' | lv_char_1_9= ')' | lv_char_1_10= ':' | lv_char_1_11= '<' | lv_char_1_12= '>' | lv_char_1_13= '\\'' ) ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getEscapedAccess().getNumberSignKeyword_0());
            		
            // InternalMetaTemplating.g:1277:3: ( ( (lv_char_1_1= '#' | lv_char_1_2= '{' | lv_char_1_3= '}' | lv_char_1_4= '[' | lv_char_1_5= ']' | lv_char_1_6= ',' | lv_char_1_7= ';' | lv_char_1_8= '(' | lv_char_1_9= ')' | lv_char_1_10= ':' | lv_char_1_11= '<' | lv_char_1_12= '>' | lv_char_1_13= '\\'' ) ) )
            // InternalMetaTemplating.g:1278:4: ( (lv_char_1_1= '#' | lv_char_1_2= '{' | lv_char_1_3= '}' | lv_char_1_4= '[' | lv_char_1_5= ']' | lv_char_1_6= ',' | lv_char_1_7= ';' | lv_char_1_8= '(' | lv_char_1_9= ')' | lv_char_1_10= ':' | lv_char_1_11= '<' | lv_char_1_12= '>' | lv_char_1_13= '\\'' ) )
            {
            // InternalMetaTemplating.g:1278:4: ( (lv_char_1_1= '#' | lv_char_1_2= '{' | lv_char_1_3= '}' | lv_char_1_4= '[' | lv_char_1_5= ']' | lv_char_1_6= ',' | lv_char_1_7= ';' | lv_char_1_8= '(' | lv_char_1_9= ')' | lv_char_1_10= ':' | lv_char_1_11= '<' | lv_char_1_12= '>' | lv_char_1_13= '\\'' ) )
            // InternalMetaTemplating.g:1279:5: (lv_char_1_1= '#' | lv_char_1_2= '{' | lv_char_1_3= '}' | lv_char_1_4= '[' | lv_char_1_5= ']' | lv_char_1_6= ',' | lv_char_1_7= ';' | lv_char_1_8= '(' | lv_char_1_9= ')' | lv_char_1_10= ':' | lv_char_1_11= '<' | lv_char_1_12= '>' | lv_char_1_13= '\\'' )
            {
            // InternalMetaTemplating.g:1279:5: (lv_char_1_1= '#' | lv_char_1_2= '{' | lv_char_1_3= '}' | lv_char_1_4= '[' | lv_char_1_5= ']' | lv_char_1_6= ',' | lv_char_1_7= ';' | lv_char_1_8= '(' | lv_char_1_9= ')' | lv_char_1_10= ':' | lv_char_1_11= '<' | lv_char_1_12= '>' | lv_char_1_13= '\\'' )
            int alt17=13;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt17=1;
                }
                break;
            case 22:
                {
                alt17=2;
                }
                break;
            case 23:
                {
                alt17=3;
                }
                break;
            case 30:
                {
                alt17=4;
                }
                break;
            case 32:
                {
                alt17=5;
                }
                break;
            case 37:
                {
                alt17=6;
                }
                break;
            case 12:
                {
                alt17=7;
                }
                break;
            case 18:
                {
                alt17=8;
                }
                break;
            case 21:
                {
                alt17=9;
                }
                break;
            case 19:
                {
                alt17=10;
                }
                break;
            case 38:
                {
                alt17=11;
                }
                break;
            case 39:
                {
                alt17=12;
                }
                break;
            case 40:
                {
                alt17=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMetaTemplating.g:1280:6: lv_char_1_1= '#'
                    {
                    lv_char_1_1=(Token)match(input,36,FOLLOW_2); 

                    						newLeafNode(lv_char_1_1, grammarAccess.getEscapedAccess().getCharNumberSignKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:1291:6: lv_char_1_2= '{'
                    {
                    lv_char_1_2=(Token)match(input,22,FOLLOW_2); 

                    						newLeafNode(lv_char_1_2, grammarAccess.getEscapedAccess().getCharLeftCurlyBracketKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalMetaTemplating.g:1302:6: lv_char_1_3= '}'
                    {
                    lv_char_1_3=(Token)match(input,23,FOLLOW_2); 

                    						newLeafNode(lv_char_1_3, grammarAccess.getEscapedAccess().getCharRightCurlyBracketKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalMetaTemplating.g:1313:6: lv_char_1_4= '['
                    {
                    lv_char_1_4=(Token)match(input,30,FOLLOW_2); 

                    						newLeafNode(lv_char_1_4, grammarAccess.getEscapedAccess().getCharLeftSquareBracketKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalMetaTemplating.g:1324:6: lv_char_1_5= ']'
                    {
                    lv_char_1_5=(Token)match(input,32,FOLLOW_2); 

                    						newLeafNode(lv_char_1_5, grammarAccess.getEscapedAccess().getCharRightSquareBracketKeyword_1_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalMetaTemplating.g:1335:6: lv_char_1_6= ','
                    {
                    lv_char_1_6=(Token)match(input,37,FOLLOW_2); 

                    						newLeafNode(lv_char_1_6, grammarAccess.getEscapedAccess().getCharCommaKeyword_1_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_6, null);
                    					

                    }
                    break;
                case 7 :
                    // InternalMetaTemplating.g:1346:6: lv_char_1_7= ';'
                    {
                    lv_char_1_7=(Token)match(input,12,FOLLOW_2); 

                    						newLeafNode(lv_char_1_7, grammarAccess.getEscapedAccess().getCharSemicolonKeyword_1_0_6());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_7, null);
                    					

                    }
                    break;
                case 8 :
                    // InternalMetaTemplating.g:1357:6: lv_char_1_8= '('
                    {
                    lv_char_1_8=(Token)match(input,18,FOLLOW_2); 

                    						newLeafNode(lv_char_1_8, grammarAccess.getEscapedAccess().getCharLeftParenthesisKeyword_1_0_7());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_8, null);
                    					

                    }
                    break;
                case 9 :
                    // InternalMetaTemplating.g:1368:6: lv_char_1_9= ')'
                    {
                    lv_char_1_9=(Token)match(input,21,FOLLOW_2); 

                    						newLeafNode(lv_char_1_9, grammarAccess.getEscapedAccess().getCharRightParenthesisKeyword_1_0_8());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_9, null);
                    					

                    }
                    break;
                case 10 :
                    // InternalMetaTemplating.g:1379:6: lv_char_1_10= ':'
                    {
                    lv_char_1_10=(Token)match(input,19,FOLLOW_2); 

                    						newLeafNode(lv_char_1_10, grammarAccess.getEscapedAccess().getCharColonKeyword_1_0_9());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_10, null);
                    					

                    }
                    break;
                case 11 :
                    // InternalMetaTemplating.g:1390:6: lv_char_1_11= '<'
                    {
                    lv_char_1_11=(Token)match(input,38,FOLLOW_2); 

                    						newLeafNode(lv_char_1_11, grammarAccess.getEscapedAccess().getCharLessThanSignKeyword_1_0_10());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_11, null);
                    					

                    }
                    break;
                case 12 :
                    // InternalMetaTemplating.g:1401:6: lv_char_1_12= '>'
                    {
                    lv_char_1_12=(Token)match(input,39,FOLLOW_2); 

                    						newLeafNode(lv_char_1_12, grammarAccess.getEscapedAccess().getCharGreaterThanSignKeyword_1_0_11());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_12, null);
                    					

                    }
                    break;
                case 13 :
                    // InternalMetaTemplating.g:1412:6: lv_char_1_13= '\\''
                    {
                    lv_char_1_13=(Token)match(input,40,FOLLOW_2); 

                    						newLeafNode(lv_char_1_13, grammarAccess.getEscapedAccess().getCharApostropheKeyword_1_0_12());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_13, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEscaped"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000145102C022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000145182C020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001450000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000001F140EC1000L});

}