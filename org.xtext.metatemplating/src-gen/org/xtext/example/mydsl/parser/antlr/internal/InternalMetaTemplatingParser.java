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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'IMPORT'", "'//'", "'/*'", "'*/'", "'[['", "']]'", "'FORALL'", "'('", "':'", "'TAGGED'", "')'", "'{'", "'}'", "'foreach'", "'in'", "'['", "']'", "'TAGINFO'", "'.{'", "'.'", "'()'", "'@{'", "'}@'", "'#'", "','", "'<'", "'>'", "'\\''"
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

                if ( (LA1_0==RULE_ID||(LA1_0>=14 && LA1_0<=15)||LA1_0==17||LA1_0==19||LA1_0==26||LA1_0==28||LA1_0==34||LA1_0==36) ) {
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
            case 17:
            case 28:
            case 34:
            case 36:
                {
                alt5=1;
                }
                break;
            case 26:
                {
                alt5=2;
                }
                break;
            case 19:
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
            case 17:
                {
                alt6=4;
                }
                break;
            case 28:
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


    // $ANTLR start "entryRulePh"
    // InternalMetaTemplating.g:562:1: entryRulePh returns [EObject current=null] : iv_rulePh= rulePh EOF ;
    public final EObject entryRulePh() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePh = null;


        try {
            // InternalMetaTemplating.g:562:43: (iv_rulePh= rulePh EOF )
            // InternalMetaTemplating.g:563:2: iv_rulePh= rulePh EOF
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
    // InternalMetaTemplating.g:569:1: rulePh returns [EObject current=null] : ( (otherlv_0= '[[' ( (lv_property_1_0= ruleProperty ) ) otherlv_2= ']]' ) | (otherlv_3= '[[' ( (lv_property_4_0= ruleProperty ) ) ( (lv_metaProperty_5_0= ruleMetaProperty ) ) otherlv_6= ']]' ) ) ;
    public final EObject rulePh() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_property_1_0 = null;

        EObject lv_property_4_0 = null;

        EObject lv_metaProperty_5_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:575:2: ( ( (otherlv_0= '[[' ( (lv_property_1_0= ruleProperty ) ) otherlv_2= ']]' ) | (otherlv_3= '[[' ( (lv_property_4_0= ruleProperty ) ) ( (lv_metaProperty_5_0= ruleMetaProperty ) ) otherlv_6= ']]' ) ) )
            // InternalMetaTemplating.g:576:2: ( (otherlv_0= '[[' ( (lv_property_1_0= ruleProperty ) ) otherlv_2= ']]' ) | (otherlv_3= '[[' ( (lv_property_4_0= ruleProperty ) ) ( (lv_metaProperty_5_0= ruleMetaProperty ) ) otherlv_6= ']]' ) )
            {
            // InternalMetaTemplating.g:576:2: ( (otherlv_0= '[[' ( (lv_property_1_0= ruleProperty ) ) otherlv_2= ']]' ) | (otherlv_3= '[[' ( (lv_property_4_0= ruleProperty ) ) ( (lv_metaProperty_5_0= ruleMetaProperty ) ) otherlv_6= ']]' ) )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalMetaTemplating.g:577:3: (otherlv_0= '[[' ( (lv_property_1_0= ruleProperty ) ) otherlv_2= ']]' )
                    {
                    // InternalMetaTemplating.g:577:3: (otherlv_0= '[[' ( (lv_property_1_0= ruleProperty ) ) otherlv_2= ']]' )
                    // InternalMetaTemplating.g:578:4: otherlv_0= '[[' ( (lv_property_1_0= ruleProperty ) ) otherlv_2= ']]'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getPhAccess().getLeftSquareBracketLeftSquareBracketKeyword_0_0());
                    			
                    // InternalMetaTemplating.g:582:4: ( (lv_property_1_0= ruleProperty ) )
                    // InternalMetaTemplating.g:583:5: (lv_property_1_0= ruleProperty )
                    {
                    // InternalMetaTemplating.g:583:5: (lv_property_1_0= ruleProperty )
                    // InternalMetaTemplating.g:584:6: lv_property_1_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getPhAccess().getPropertyPropertyParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_10);
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

                    otherlv_2=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPhAccess().getRightSquareBracketRightSquareBracketKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:607:3: (otherlv_3= '[[' ( (lv_property_4_0= ruleProperty ) ) ( (lv_metaProperty_5_0= ruleMetaProperty ) ) otherlv_6= ']]' )
                    {
                    // InternalMetaTemplating.g:607:3: (otherlv_3= '[[' ( (lv_property_4_0= ruleProperty ) ) ( (lv_metaProperty_5_0= ruleMetaProperty ) ) otherlv_6= ']]' )
                    // InternalMetaTemplating.g:608:4: otherlv_3= '[[' ( (lv_property_4_0= ruleProperty ) ) ( (lv_metaProperty_5_0= ruleMetaProperty ) ) otherlv_6= ']]'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getPhAccess().getLeftSquareBracketLeftSquareBracketKeyword_1_0());
                    			
                    // InternalMetaTemplating.g:612:4: ( (lv_property_4_0= ruleProperty ) )
                    // InternalMetaTemplating.g:613:5: (lv_property_4_0= ruleProperty )
                    {
                    // InternalMetaTemplating.g:613:5: (lv_property_4_0= ruleProperty )
                    // InternalMetaTemplating.g:614:6: lv_property_4_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getPhAccess().getPropertyPropertyParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_property_4_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPhRule());
                    						}
                    						set(
                    							current,
                    							"property",
                    							lv_property_4_0,
                    							"org.xtext.example.mydsl.MetaTemplating.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMetaTemplating.g:631:4: ( (lv_metaProperty_5_0= ruleMetaProperty ) )
                    // InternalMetaTemplating.g:632:5: (lv_metaProperty_5_0= ruleMetaProperty )
                    {
                    // InternalMetaTemplating.g:632:5: (lv_metaProperty_5_0= ruleMetaProperty )
                    // InternalMetaTemplating.g:633:6: lv_metaProperty_5_0= ruleMetaProperty
                    {

                    						newCompositeNode(grammarAccess.getPhAccess().getMetaPropertyMetaPropertyParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_metaProperty_5_0=ruleMetaProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPhRule());
                    						}
                    						set(
                    							current,
                    							"metaProperty",
                    							lv_metaProperty_5_0,
                    							"org.xtext.example.mydsl.MetaTemplating.MetaProperty");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getPhAccess().getRightSquareBracketRightSquareBracketKeyword_1_3());
                    			

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
    // $ANTLR end "rulePh"


    // $ANTLR start "entryRuleRule"
    // InternalMetaTemplating.g:659:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalMetaTemplating.g:659:45: (iv_ruleRule= ruleRule EOF )
            // InternalMetaTemplating.g:660:2: iv_ruleRule= ruleRule EOF
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
    // InternalMetaTemplating.g:666:1: ruleRule returns [EObject current=null] : (otherlv_0= 'FORALL' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_property_4_0= ruleProperty ) ) otherlv_5= 'TAGGED' ( (lv_tag_6_0= RULE_ID ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_body_9_0= ruleInstructions ) )* otherlv_10= '}' ) ;
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
            // InternalMetaTemplating.g:672:2: ( (otherlv_0= 'FORALL' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_property_4_0= ruleProperty ) ) otherlv_5= 'TAGGED' ( (lv_tag_6_0= RULE_ID ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_body_9_0= ruleInstructions ) )* otherlv_10= '}' ) )
            // InternalMetaTemplating.g:673:2: (otherlv_0= 'FORALL' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_property_4_0= ruleProperty ) ) otherlv_5= 'TAGGED' ( (lv_tag_6_0= RULE_ID ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_body_9_0= ruleInstructions ) )* otherlv_10= '}' )
            {
            // InternalMetaTemplating.g:673:2: (otherlv_0= 'FORALL' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_property_4_0= ruleProperty ) ) otherlv_5= 'TAGGED' ( (lv_tag_6_0= RULE_ID ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_body_9_0= ruleInstructions ) )* otherlv_10= '}' )
            // InternalMetaTemplating.g:674:3: otherlv_0= 'FORALL' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_property_4_0= ruleProperty ) ) otherlv_5= 'TAGGED' ( (lv_tag_6_0= RULE_ID ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_body_9_0= ruleInstructions ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getFORALLKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMetaTemplating.g:682:3: ( (lv_element_2_0= RULE_ID ) )
            // InternalMetaTemplating.g:683:4: (lv_element_2_0= RULE_ID )
            {
            // InternalMetaTemplating.g:683:4: (lv_element_2_0= RULE_ID )
            // InternalMetaTemplating.g:684:5: lv_element_2_0= RULE_ID
            {
            lv_element_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_3=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getColonKeyword_3());
            		
            // InternalMetaTemplating.g:704:3: ( (lv_property_4_0= ruleProperty ) )
            // InternalMetaTemplating.g:705:4: (lv_property_4_0= ruleProperty )
            {
            // InternalMetaTemplating.g:705:4: (lv_property_4_0= ruleProperty )
            // InternalMetaTemplating.g:706:5: lv_property_4_0= ruleProperty
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getPropertyPropertyParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_5=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getTAGGEDKeyword_5());
            		
            // InternalMetaTemplating.g:727:3: ( (lv_tag_6_0= RULE_ID ) )
            // InternalMetaTemplating.g:728:4: (lv_tag_6_0= RULE_ID )
            {
            // InternalMetaTemplating.g:728:4: (lv_tag_6_0= RULE_ID )
            // InternalMetaTemplating.g:729:5: lv_tag_6_0= RULE_ID
            {
            lv_tag_6_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            otherlv_7=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalMetaTemplating.g:753:3: ( (lv_body_9_0= ruleInstructions ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||(LA8_0>=14 && LA8_0<=15)||LA8_0==17||LA8_0==19||LA8_0==26||LA8_0==28||LA8_0==34||LA8_0==36) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMetaTemplating.g:754:4: (lv_body_9_0= ruleInstructions )
            	    {
            	    // InternalMetaTemplating.g:754:4: (lv_body_9_0= ruleInstructions )
            	    // InternalMetaTemplating.g:755:5: lv_body_9_0= ruleInstructions
            	    {

            	    					newCompositeNode(grammarAccess.getRuleAccess().getBodyInstructionsParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_17);
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
            	    break loop8;
                }
            } while (true);

            otherlv_10=(Token)match(input,25,FOLLOW_2); 

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
    // InternalMetaTemplating.g:780:1: entryRuleIterator returns [EObject current=null] : iv_ruleIterator= ruleIterator EOF ;
    public final EObject entryRuleIterator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterator = null;


        try {
            // InternalMetaTemplating.g:780:49: (iv_ruleIterator= ruleIterator EOF )
            // InternalMetaTemplating.g:781:2: iv_ruleIterator= ruleIterator EOF
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
    // InternalMetaTemplating.g:787:1: ruleIterator returns [EObject current=null] : (otherlv_0= 'foreach' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= 'in' ( (lv_metaElement_4_0= ruleMetaPh ) ) ( (lv_subProperties_5_0= ruleSubProperty ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_body_8_0= ruleInstructions ) )* otherlv_9= '}' ) ;
    public final EObject ruleIterator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_element_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_metaElement_4_0 = null;

        EObject lv_subProperties_5_0 = null;

        EObject lv_body_8_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:793:2: ( (otherlv_0= 'foreach' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= 'in' ( (lv_metaElement_4_0= ruleMetaPh ) ) ( (lv_subProperties_5_0= ruleSubProperty ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_body_8_0= ruleInstructions ) )* otherlv_9= '}' ) )
            // InternalMetaTemplating.g:794:2: (otherlv_0= 'foreach' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= 'in' ( (lv_metaElement_4_0= ruleMetaPh ) ) ( (lv_subProperties_5_0= ruleSubProperty ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_body_8_0= ruleInstructions ) )* otherlv_9= '}' )
            {
            // InternalMetaTemplating.g:794:2: (otherlv_0= 'foreach' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= 'in' ( (lv_metaElement_4_0= ruleMetaPh ) ) ( (lv_subProperties_5_0= ruleSubProperty ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_body_8_0= ruleInstructions ) )* otherlv_9= '}' )
            // InternalMetaTemplating.g:795:3: otherlv_0= 'foreach' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= 'in' ( (lv_metaElement_4_0= ruleMetaPh ) ) ( (lv_subProperties_5_0= ruleSubProperty ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_body_8_0= ruleInstructions ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getIteratorAccess().getForeachKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getIteratorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMetaTemplating.g:803:3: ( (lv_element_2_0= RULE_ID ) )
            // InternalMetaTemplating.g:804:4: (lv_element_2_0= RULE_ID )
            {
            // InternalMetaTemplating.g:804:4: (lv_element_2_0= RULE_ID )
            // InternalMetaTemplating.g:805:5: lv_element_2_0= RULE_ID
            {
            lv_element_2_0=(Token)match(input,RULE_ID,FOLLOW_18); 

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

            otherlv_3=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getIteratorAccess().getInKeyword_3());
            		
            // InternalMetaTemplating.g:825:3: ( (lv_metaElement_4_0= ruleMetaPh ) )
            // InternalMetaTemplating.g:826:4: (lv_metaElement_4_0= ruleMetaPh )
            {
            // InternalMetaTemplating.g:826:4: (lv_metaElement_4_0= ruleMetaPh )
            // InternalMetaTemplating.g:827:5: lv_metaElement_4_0= ruleMetaPh
            {

            					newCompositeNode(grammarAccess.getIteratorAccess().getMetaElementMetaPhParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_metaElement_4_0=ruleMetaPh();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIteratorRule());
            					}
            					set(
            						current,
            						"metaElement",
            						lv_metaElement_4_0,
            						"org.xtext.example.mydsl.MetaTemplating.MetaPh");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMetaTemplating.g:844:3: ( (lv_subProperties_5_0= ruleSubProperty ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==32) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMetaTemplating.g:845:4: (lv_subProperties_5_0= ruleSubProperty )
            	    {
            	    // InternalMetaTemplating.g:845:4: (lv_subProperties_5_0= ruleSubProperty )
            	    // InternalMetaTemplating.g:846:5: lv_subProperties_5_0= ruleSubProperty
            	    {

            	    					newCompositeNode(grammarAccess.getIteratorAccess().getSubPropertiesSubPropertyParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_subProperties_5_0=ruleSubProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIteratorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"subProperties",
            	    						lv_subProperties_5_0,
            	    						"org.xtext.example.mydsl.MetaTemplating.SubProperty");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getIteratorAccess().getRightParenthesisKeyword_6());
            		
            otherlv_7=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getIteratorAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalMetaTemplating.g:871:3: ( (lv_body_8_0= ruleInstructions ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||(LA10_0>=14 && LA10_0<=15)||LA10_0==17||LA10_0==19||LA10_0==26||LA10_0==28||LA10_0==34||LA10_0==36) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMetaTemplating.g:872:4: (lv_body_8_0= ruleInstructions )
            	    {
            	    // InternalMetaTemplating.g:872:4: (lv_body_8_0= ruleInstructions )
            	    // InternalMetaTemplating.g:873:5: lv_body_8_0= ruleInstructions
            	    {

            	    					newCompositeNode(grammarAccess.getIteratorAccess().getBodyInstructionsParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_body_8_0=ruleInstructions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIteratorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"body",
            	    						lv_body_8_0,
            	    						"org.xtext.example.mydsl.MetaTemplating.Instructions");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_9=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getIteratorAccess().getRightCurlyBracketKeyword_9());
            		

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


    // $ANTLR start "entryRuleMetaPh"
    // InternalMetaTemplating.g:898:1: entryRuleMetaPh returns [EObject current=null] : iv_ruleMetaPh= ruleMetaPh EOF ;
    public final EObject entryRuleMetaPh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaPh = null;


        try {
            // InternalMetaTemplating.g:898:47: (iv_ruleMetaPh= ruleMetaPh EOF )
            // InternalMetaTemplating.g:899:2: iv_ruleMetaPh= ruleMetaPh EOF
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
    // InternalMetaTemplating.g:905:1: ruleMetaPh returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_property_1_0= ruleProperty ) ) otherlv_2= ']' ) | (otherlv_3= '[' ( (lv_property_4_0= ruleProperty ) ) ( (lv_info_5_0= ruleTagInfo ) ) otherlv_6= ']' ) ) ;
    public final EObject ruleMetaPh() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_property_1_0 = null;

        EObject lv_property_4_0 = null;

        EObject lv_info_5_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:911:2: ( ( (otherlv_0= '[' ( (lv_property_1_0= ruleProperty ) ) otherlv_2= ']' ) | (otherlv_3= '[' ( (lv_property_4_0= ruleProperty ) ) ( (lv_info_5_0= ruleTagInfo ) ) otherlv_6= ']' ) ) )
            // InternalMetaTemplating.g:912:2: ( (otherlv_0= '[' ( (lv_property_1_0= ruleProperty ) ) otherlv_2= ']' ) | (otherlv_3= '[' ( (lv_property_4_0= ruleProperty ) ) ( (lv_info_5_0= ruleTagInfo ) ) otherlv_6= ']' ) )
            {
            // InternalMetaTemplating.g:912:2: ( (otherlv_0= '[' ( (lv_property_1_0= ruleProperty ) ) otherlv_2= ']' ) | (otherlv_3= '[' ( (lv_property_4_0= ruleProperty ) ) ( (lv_info_5_0= ruleTagInfo ) ) otherlv_6= ']' ) )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalMetaTemplating.g:913:3: (otherlv_0= '[' ( (lv_property_1_0= ruleProperty ) ) otherlv_2= ']' )
                    {
                    // InternalMetaTemplating.g:913:3: (otherlv_0= '[' ( (lv_property_1_0= ruleProperty ) ) otherlv_2= ']' )
                    // InternalMetaTemplating.g:914:4: otherlv_0= '[' ( (lv_property_1_0= ruleProperty ) ) otherlv_2= ']'
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getMetaPhAccess().getLeftSquareBracketKeyword_0_0());
                    			
                    // InternalMetaTemplating.g:918:4: ( (lv_property_1_0= ruleProperty ) )
                    // InternalMetaTemplating.g:919:5: (lv_property_1_0= ruleProperty )
                    {
                    // InternalMetaTemplating.g:919:5: (lv_property_1_0= ruleProperty )
                    // InternalMetaTemplating.g:920:6: lv_property_1_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getMetaPhAccess().getPropertyPropertyParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_21);
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

                    otherlv_2=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getMetaPhAccess().getRightSquareBracketKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:943:3: (otherlv_3= '[' ( (lv_property_4_0= ruleProperty ) ) ( (lv_info_5_0= ruleTagInfo ) ) otherlv_6= ']' )
                    {
                    // InternalMetaTemplating.g:943:3: (otherlv_3= '[' ( (lv_property_4_0= ruleProperty ) ) ( (lv_info_5_0= ruleTagInfo ) ) otherlv_6= ']' )
                    // InternalMetaTemplating.g:944:4: otherlv_3= '[' ( (lv_property_4_0= ruleProperty ) ) ( (lv_info_5_0= ruleTagInfo ) ) otherlv_6= ']'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getMetaPhAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalMetaTemplating.g:948:4: ( (lv_property_4_0= ruleProperty ) )
                    // InternalMetaTemplating.g:949:5: (lv_property_4_0= ruleProperty )
                    {
                    // InternalMetaTemplating.g:949:5: (lv_property_4_0= ruleProperty )
                    // InternalMetaTemplating.g:950:6: lv_property_4_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getMetaPhAccess().getPropertyPropertyParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_property_4_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMetaPhRule());
                    						}
                    						set(
                    							current,
                    							"property",
                    							lv_property_4_0,
                    							"org.xtext.example.mydsl.MetaTemplating.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMetaTemplating.g:967:4: ( (lv_info_5_0= ruleTagInfo ) )
                    // InternalMetaTemplating.g:968:5: (lv_info_5_0= ruleTagInfo )
                    {
                    // InternalMetaTemplating.g:968:5: (lv_info_5_0= ruleTagInfo )
                    // InternalMetaTemplating.g:969:6: lv_info_5_0= ruleTagInfo
                    {

                    						newCompositeNode(grammarAccess.getMetaPhAccess().getInfoTagInfoParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_info_5_0=ruleTagInfo();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMetaPhRule());
                    						}
                    						set(
                    							current,
                    							"info",
                    							lv_info_5_0,
                    							"org.xtext.example.mydsl.MetaTemplating.TagInfo");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getMetaPhAccess().getRightSquareBracketKeyword_1_3());
                    			

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
    // $ANTLR end "ruleMetaPh"


    // $ANTLR start "entryRuleTagInfo"
    // InternalMetaTemplating.g:995:1: entryRuleTagInfo returns [EObject current=null] : iv_ruleTagInfo= ruleTagInfo EOF ;
    public final EObject entryRuleTagInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagInfo = null;


        try {
            // InternalMetaTemplating.g:995:48: (iv_ruleTagInfo= ruleTagInfo EOF )
            // InternalMetaTemplating.g:996:2: iv_ruleTagInfo= ruleTagInfo EOF
            {
             newCompositeNode(grammarAccess.getTagInfoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTagInfo=ruleTagInfo();

            state._fsp--;

             current =iv_ruleTagInfo; 
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
    // $ANTLR end "entryRuleTagInfo"


    // $ANTLR start "ruleTagInfo"
    // InternalMetaTemplating.g:1002:1: ruleTagInfo returns [EObject current=null] : (otherlv_0= 'TAGINFO' ( (lv_tag_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleTagInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_tag_1_0=null;


        	enterRule();

        try {
            // InternalMetaTemplating.g:1008:2: ( (otherlv_0= 'TAGINFO' ( (lv_tag_1_0= RULE_STRING ) ) ) )
            // InternalMetaTemplating.g:1009:2: (otherlv_0= 'TAGINFO' ( (lv_tag_1_0= RULE_STRING ) ) )
            {
            // InternalMetaTemplating.g:1009:2: (otherlv_0= 'TAGINFO' ( (lv_tag_1_0= RULE_STRING ) ) )
            // InternalMetaTemplating.g:1010:3: otherlv_0= 'TAGINFO' ( (lv_tag_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTagInfoAccess().getTAGINFOKeyword_0());
            		
            // InternalMetaTemplating.g:1014:3: ( (lv_tag_1_0= RULE_STRING ) )
            // InternalMetaTemplating.g:1015:4: (lv_tag_1_0= RULE_STRING )
            {
            // InternalMetaTemplating.g:1015:4: (lv_tag_1_0= RULE_STRING )
            // InternalMetaTemplating.g:1016:5: lv_tag_1_0= RULE_STRING
            {
            lv_tag_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_tag_1_0, grammarAccess.getTagInfoAccess().getTagSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTagInfoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tag",
            						lv_tag_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleTagInfo"


    // $ANTLR start "entryRuleMetaProperty"
    // InternalMetaTemplating.g:1036:1: entryRuleMetaProperty returns [EObject current=null] : iv_ruleMetaProperty= ruleMetaProperty EOF ;
    public final EObject entryRuleMetaProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaProperty = null;


        try {
            // InternalMetaTemplating.g:1036:53: (iv_ruleMetaProperty= ruleMetaProperty EOF )
            // InternalMetaTemplating.g:1037:2: iv_ruleMetaProperty= ruleMetaProperty EOF
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
    // InternalMetaTemplating.g:1043:1: ruleMetaProperty returns [EObject current=null] : (otherlv_0= '.{' ( (lv_property_1_0= ruleProperty ) ) otherlv_2= '}' ) ;
    public final EObject ruleMetaProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_property_1_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:1049:2: ( (otherlv_0= '.{' ( (lv_property_1_0= ruleProperty ) ) otherlv_2= '}' ) )
            // InternalMetaTemplating.g:1050:2: (otherlv_0= '.{' ( (lv_property_1_0= ruleProperty ) ) otherlv_2= '}' )
            {
            // InternalMetaTemplating.g:1050:2: (otherlv_0= '.{' ( (lv_property_1_0= ruleProperty ) ) otherlv_2= '}' )
            // InternalMetaTemplating.g:1051:3: otherlv_0= '.{' ( (lv_property_1_0= ruleProperty ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMetaPropertyAccess().getFullStopLeftCurlyBracketKeyword_0());
            		
            // InternalMetaTemplating.g:1055:3: ( (lv_property_1_0= ruleProperty ) )
            // InternalMetaTemplating.g:1056:4: (lv_property_1_0= ruleProperty )
            {
            // InternalMetaTemplating.g:1056:4: (lv_property_1_0= ruleProperty )
            // InternalMetaTemplating.g:1057:5: lv_property_1_0= ruleProperty
            {

            					newCompositeNode(grammarAccess.getMetaPropertyAccess().getPropertyPropertyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_2=(Token)match(input,25,FOLLOW_2); 

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
    // InternalMetaTemplating.g:1082:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalMetaTemplating.g:1082:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalMetaTemplating.g:1083:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalMetaTemplating.g:1089:1: ruleProperty returns [EObject current=null] : ( ( (lv_property_0_0= RULE_ID ) ) ( (lv_subProperties_1_0= ruleSubProperty ) )* ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_property_0_0=null;
        EObject lv_subProperties_1_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:1095:2: ( ( ( (lv_property_0_0= RULE_ID ) ) ( (lv_subProperties_1_0= ruleSubProperty ) )* ) )
            // InternalMetaTemplating.g:1096:2: ( ( (lv_property_0_0= RULE_ID ) ) ( (lv_subProperties_1_0= ruleSubProperty ) )* )
            {
            // InternalMetaTemplating.g:1096:2: ( ( (lv_property_0_0= RULE_ID ) ) ( (lv_subProperties_1_0= ruleSubProperty ) )* )
            // InternalMetaTemplating.g:1097:3: ( (lv_property_0_0= RULE_ID ) ) ( (lv_subProperties_1_0= ruleSubProperty ) )*
            {
            // InternalMetaTemplating.g:1097:3: ( (lv_property_0_0= RULE_ID ) )
            // InternalMetaTemplating.g:1098:4: (lv_property_0_0= RULE_ID )
            {
            // InternalMetaTemplating.g:1098:4: (lv_property_0_0= RULE_ID )
            // InternalMetaTemplating.g:1099:5: lv_property_0_0= RULE_ID
            {
            lv_property_0_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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

            // InternalMetaTemplating.g:1115:3: ( (lv_subProperties_1_0= ruleSubProperty ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMetaTemplating.g:1116:4: (lv_subProperties_1_0= ruleSubProperty )
            	    {
            	    // InternalMetaTemplating.g:1116:4: (lv_subProperties_1_0= ruleSubProperty )
            	    // InternalMetaTemplating.g:1117:5: lv_subProperties_1_0= ruleSubProperty
            	    {

            	    					newCompositeNode(grammarAccess.getPropertyAccess().getSubPropertiesSubPropertyParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_24);
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
            	    break loop12;
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
    // InternalMetaTemplating.g:1138:1: entryRuleSubProperty returns [EObject current=null] : iv_ruleSubProperty= ruleSubProperty EOF ;
    public final EObject entryRuleSubProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubProperty = null;


        try {
            // InternalMetaTemplating.g:1138:52: (iv_ruleSubProperty= ruleSubProperty EOF )
            // InternalMetaTemplating.g:1139:2: iv_ruleSubProperty= ruleSubProperty EOF
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
    // InternalMetaTemplating.g:1145:1: ruleSubProperty returns [EObject current=null] : ( (otherlv_0= '.' ( (lv_property_1_0= RULE_ID ) ) ) | (otherlv_2= '.' ( (lv_property_3_0= RULE_ID ) ) otherlv_4= '()' ) ) ;
    public final EObject ruleSubProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_property_1_0=null;
        Token otherlv_2=null;
        Token lv_property_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMetaTemplating.g:1151:2: ( ( (otherlv_0= '.' ( (lv_property_1_0= RULE_ID ) ) ) | (otherlv_2= '.' ( (lv_property_3_0= RULE_ID ) ) otherlv_4= '()' ) ) )
            // InternalMetaTemplating.g:1152:2: ( (otherlv_0= '.' ( (lv_property_1_0= RULE_ID ) ) ) | (otherlv_2= '.' ( (lv_property_3_0= RULE_ID ) ) otherlv_4= '()' ) )
            {
            // InternalMetaTemplating.g:1152:2: ( (otherlv_0= '.' ( (lv_property_1_0= RULE_ID ) ) ) | (otherlv_2= '.' ( (lv_property_3_0= RULE_ID ) ) otherlv_4= '()' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_ID) ) {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==33) ) {
                        alt13=2;
                    }
                    else if ( (LA13_2==EOF||LA13_2==18||(LA13_2>=22 && LA13_2<=23)||LA13_2==25||(LA13_2>=29 && LA13_2<=32)) ) {
                        alt13=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMetaTemplating.g:1153:3: (otherlv_0= '.' ( (lv_property_1_0= RULE_ID ) ) )
                    {
                    // InternalMetaTemplating.g:1153:3: (otherlv_0= '.' ( (lv_property_1_0= RULE_ID ) ) )
                    // InternalMetaTemplating.g:1154:4: otherlv_0= '.' ( (lv_property_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getSubPropertyAccess().getFullStopKeyword_0_0());
                    			
                    // InternalMetaTemplating.g:1158:4: ( (lv_property_1_0= RULE_ID ) )
                    // InternalMetaTemplating.g:1159:5: (lv_property_1_0= RULE_ID )
                    {
                    // InternalMetaTemplating.g:1159:5: (lv_property_1_0= RULE_ID )
                    // InternalMetaTemplating.g:1160:6: lv_property_1_0= RULE_ID
                    {
                    lv_property_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_property_1_0, grammarAccess.getSubPropertyAccess().getPropertyIDTerminalRuleCall_0_1_0());
                    					

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


                    }


                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:1178:3: (otherlv_2= '.' ( (lv_property_3_0= RULE_ID ) ) otherlv_4= '()' )
                    {
                    // InternalMetaTemplating.g:1178:3: (otherlv_2= '.' ( (lv_property_3_0= RULE_ID ) ) otherlv_4= '()' )
                    // InternalMetaTemplating.g:1179:4: otherlv_2= '.' ( (lv_property_3_0= RULE_ID ) ) otherlv_4= '()'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getSubPropertyAccess().getFullStopKeyword_1_0());
                    			
                    // InternalMetaTemplating.g:1183:4: ( (lv_property_3_0= RULE_ID ) )
                    // InternalMetaTemplating.g:1184:5: (lv_property_3_0= RULE_ID )
                    {
                    // InternalMetaTemplating.g:1184:5: (lv_property_3_0= RULE_ID )
                    // InternalMetaTemplating.g:1185:6: lv_property_3_0= RULE_ID
                    {
                    lv_property_3_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(lv_property_3_0, grammarAccess.getSubPropertyAccess().getPropertyIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSubPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"property",
                    							lv_property_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getSubPropertyAccess().getLeftParenthesisRightParenthesisKeyword_1_2());
                    			

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
    // $ANTLR end "ruleSubProperty"


    // $ANTLR start "entryRuleEscapedString"
    // InternalMetaTemplating.g:1210:1: entryRuleEscapedString returns [EObject current=null] : iv_ruleEscapedString= ruleEscapedString EOF ;
    public final EObject entryRuleEscapedString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscapedString = null;


        try {
            // InternalMetaTemplating.g:1210:54: (iv_ruleEscapedString= ruleEscapedString EOF )
            // InternalMetaTemplating.g:1211:2: iv_ruleEscapedString= ruleEscapedString EOF
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
    // InternalMetaTemplating.g:1217:1: ruleEscapedString returns [EObject current=null] : (otherlv_0= '@{' ( (lv_str_1_0= RULE_STRING ) ) otherlv_2= '}@' ) ;
    public final EObject ruleEscapedString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_str_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMetaTemplating.g:1223:2: ( (otherlv_0= '@{' ( (lv_str_1_0= RULE_STRING ) ) otherlv_2= '}@' ) )
            // InternalMetaTemplating.g:1224:2: (otherlv_0= '@{' ( (lv_str_1_0= RULE_STRING ) ) otherlv_2= '}@' )
            {
            // InternalMetaTemplating.g:1224:2: (otherlv_0= '@{' ( (lv_str_1_0= RULE_STRING ) ) otherlv_2= '}@' )
            // InternalMetaTemplating.g:1225:3: otherlv_0= '@{' ( (lv_str_1_0= RULE_STRING ) ) otherlv_2= '}@'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getEscapedStringAccess().getCommercialAtLeftCurlyBracketKeyword_0());
            		
            // InternalMetaTemplating.g:1229:3: ( (lv_str_1_0= RULE_STRING ) )
            // InternalMetaTemplating.g:1230:4: (lv_str_1_0= RULE_STRING )
            {
            // InternalMetaTemplating.g:1230:4: (lv_str_1_0= RULE_STRING )
            // InternalMetaTemplating.g:1231:5: lv_str_1_0= RULE_STRING
            {
            lv_str_1_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

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
    // InternalMetaTemplating.g:1255:1: entryRuleEscaped returns [EObject current=null] : iv_ruleEscaped= ruleEscaped EOF ;
    public final EObject entryRuleEscaped() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscaped = null;


        try {
            // InternalMetaTemplating.g:1255:48: (iv_ruleEscaped= ruleEscaped EOF )
            // InternalMetaTemplating.g:1256:2: iv_ruleEscaped= ruleEscaped EOF
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
    // InternalMetaTemplating.g:1262:1: ruleEscaped returns [EObject current=null] : (otherlv_0= '#' ( ( (lv_char_1_1= '#' | lv_char_1_2= '{' | lv_char_1_3= '}' | lv_char_1_4= '[' | lv_char_1_5= ']' | lv_char_1_6= ',' | lv_char_1_7= ';' | lv_char_1_8= '(' | lv_char_1_9= ')' | lv_char_1_10= ':' | lv_char_1_11= '<' | lv_char_1_12= '>' | lv_char_1_13= '\\'' ) ) ) ) ;
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
            // InternalMetaTemplating.g:1268:2: ( (otherlv_0= '#' ( ( (lv_char_1_1= '#' | lv_char_1_2= '{' | lv_char_1_3= '}' | lv_char_1_4= '[' | lv_char_1_5= ']' | lv_char_1_6= ',' | lv_char_1_7= ';' | lv_char_1_8= '(' | lv_char_1_9= ')' | lv_char_1_10= ':' | lv_char_1_11= '<' | lv_char_1_12= '>' | lv_char_1_13= '\\'' ) ) ) ) )
            // InternalMetaTemplating.g:1269:2: (otherlv_0= '#' ( ( (lv_char_1_1= '#' | lv_char_1_2= '{' | lv_char_1_3= '}' | lv_char_1_4= '[' | lv_char_1_5= ']' | lv_char_1_6= ',' | lv_char_1_7= ';' | lv_char_1_8= '(' | lv_char_1_9= ')' | lv_char_1_10= ':' | lv_char_1_11= '<' | lv_char_1_12= '>' | lv_char_1_13= '\\'' ) ) ) )
            {
            // InternalMetaTemplating.g:1269:2: (otherlv_0= '#' ( ( (lv_char_1_1= '#' | lv_char_1_2= '{' | lv_char_1_3= '}' | lv_char_1_4= '[' | lv_char_1_5= ']' | lv_char_1_6= ',' | lv_char_1_7= ';' | lv_char_1_8= '(' | lv_char_1_9= ')' | lv_char_1_10= ':' | lv_char_1_11= '<' | lv_char_1_12= '>' | lv_char_1_13= '\\'' ) ) ) )
            // InternalMetaTemplating.g:1270:3: otherlv_0= '#' ( ( (lv_char_1_1= '#' | lv_char_1_2= '{' | lv_char_1_3= '}' | lv_char_1_4= '[' | lv_char_1_5= ']' | lv_char_1_6= ',' | lv_char_1_7= ';' | lv_char_1_8= '(' | lv_char_1_9= ')' | lv_char_1_10= ':' | lv_char_1_11= '<' | lv_char_1_12= '>' | lv_char_1_13= '\\'' ) ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getEscapedAccess().getNumberSignKeyword_0());
            		
            // InternalMetaTemplating.g:1274:3: ( ( (lv_char_1_1= '#' | lv_char_1_2= '{' | lv_char_1_3= '}' | lv_char_1_4= '[' | lv_char_1_5= ']' | lv_char_1_6= ',' | lv_char_1_7= ';' | lv_char_1_8= '(' | lv_char_1_9= ')' | lv_char_1_10= ':' | lv_char_1_11= '<' | lv_char_1_12= '>' | lv_char_1_13= '\\'' ) ) )
            // InternalMetaTemplating.g:1275:4: ( (lv_char_1_1= '#' | lv_char_1_2= '{' | lv_char_1_3= '}' | lv_char_1_4= '[' | lv_char_1_5= ']' | lv_char_1_6= ',' | lv_char_1_7= ';' | lv_char_1_8= '(' | lv_char_1_9= ')' | lv_char_1_10= ':' | lv_char_1_11= '<' | lv_char_1_12= '>' | lv_char_1_13= '\\'' ) )
            {
            // InternalMetaTemplating.g:1275:4: ( (lv_char_1_1= '#' | lv_char_1_2= '{' | lv_char_1_3= '}' | lv_char_1_4= '[' | lv_char_1_5= ']' | lv_char_1_6= ',' | lv_char_1_7= ';' | lv_char_1_8= '(' | lv_char_1_9= ')' | lv_char_1_10= ':' | lv_char_1_11= '<' | lv_char_1_12= '>' | lv_char_1_13= '\\'' ) )
            // InternalMetaTemplating.g:1276:5: (lv_char_1_1= '#' | lv_char_1_2= '{' | lv_char_1_3= '}' | lv_char_1_4= '[' | lv_char_1_5= ']' | lv_char_1_6= ',' | lv_char_1_7= ';' | lv_char_1_8= '(' | lv_char_1_9= ')' | lv_char_1_10= ':' | lv_char_1_11= '<' | lv_char_1_12= '>' | lv_char_1_13= '\\'' )
            {
            // InternalMetaTemplating.g:1276:5: (lv_char_1_1= '#' | lv_char_1_2= '{' | lv_char_1_3= '}' | lv_char_1_4= '[' | lv_char_1_5= ']' | lv_char_1_6= ',' | lv_char_1_7= ';' | lv_char_1_8= '(' | lv_char_1_9= ')' | lv_char_1_10= ':' | lv_char_1_11= '<' | lv_char_1_12= '>' | lv_char_1_13= '\\'' )
            int alt14=13;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt14=1;
                }
                break;
            case 24:
                {
                alt14=2;
                }
                break;
            case 25:
                {
                alt14=3;
                }
                break;
            case 28:
                {
                alt14=4;
                }
                break;
            case 29:
                {
                alt14=5;
                }
                break;
            case 37:
                {
                alt14=6;
                }
                break;
            case 12:
                {
                alt14=7;
                }
                break;
            case 20:
                {
                alt14=8;
                }
                break;
            case 23:
                {
                alt14=9;
                }
                break;
            case 21:
                {
                alt14=10;
                }
                break;
            case 38:
                {
                alt14=11;
                }
                break;
            case 39:
                {
                alt14=12;
                }
                break;
            case 40:
                {
                alt14=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMetaTemplating.g:1277:6: lv_char_1_1= '#'
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
                    // InternalMetaTemplating.g:1288:6: lv_char_1_2= '{'
                    {
                    lv_char_1_2=(Token)match(input,24,FOLLOW_2); 

                    						newLeafNode(lv_char_1_2, grammarAccess.getEscapedAccess().getCharLeftCurlyBracketKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalMetaTemplating.g:1299:6: lv_char_1_3= '}'
                    {
                    lv_char_1_3=(Token)match(input,25,FOLLOW_2); 

                    						newLeafNode(lv_char_1_3, grammarAccess.getEscapedAccess().getCharRightCurlyBracketKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalMetaTemplating.g:1310:6: lv_char_1_4= '['
                    {
                    lv_char_1_4=(Token)match(input,28,FOLLOW_2); 

                    						newLeafNode(lv_char_1_4, grammarAccess.getEscapedAccess().getCharLeftSquareBracketKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalMetaTemplating.g:1321:6: lv_char_1_5= ']'
                    {
                    lv_char_1_5=(Token)match(input,29,FOLLOW_2); 

                    						newLeafNode(lv_char_1_5, grammarAccess.getEscapedAccess().getCharRightSquareBracketKeyword_1_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalMetaTemplating.g:1332:6: lv_char_1_6= ','
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
                    // InternalMetaTemplating.g:1343:6: lv_char_1_7= ';'
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
                    // InternalMetaTemplating.g:1354:6: lv_char_1_8= '('
                    {
                    lv_char_1_8=(Token)match(input,20,FOLLOW_2); 

                    						newLeafNode(lv_char_1_8, grammarAccess.getEscapedAccess().getCharLeftParenthesisKeyword_1_0_7());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_8, null);
                    					

                    }
                    break;
                case 9 :
                    // InternalMetaTemplating.g:1365:6: lv_char_1_9= ')'
                    {
                    lv_char_1_9=(Token)match(input,23,FOLLOW_2); 

                    						newLeafNode(lv_char_1_9, grammarAccess.getEscapedAccess().getCharRightParenthesisKeyword_1_0_8());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_9, null);
                    					

                    }
                    break;
                case 10 :
                    // InternalMetaTemplating.g:1376:6: lv_char_1_10= ':'
                    {
                    lv_char_1_10=(Token)match(input,21,FOLLOW_2); 

                    						newLeafNode(lv_char_1_10, grammarAccess.getEscapedAccess().getCharColonKeyword_1_0_9());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_10, null);
                    					

                    }
                    break;
                case 11 :
                    // InternalMetaTemplating.g:1387:6: lv_char_1_11= '<'
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
                    // InternalMetaTemplating.g:1398:6: lv_char_1_12= '>'
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
                    // InternalMetaTemplating.g:1409:6: lv_char_1_13= '\\''
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


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\1\21\1\5\1\22\1\5\2\uffff\2\22";
    static final String dfa_3s = "\1\21\1\5\1\40\1\5\2\uffff\1\41\1\40";
    static final String dfa_4s = "\4\uffff\1\1\1\2\2\uffff";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\4\14\uffff\1\5\1\3",
            "\1\6",
            "",
            "",
            "\1\4\14\uffff\1\5\1\3\1\7",
            "\1\4\14\uffff\1\5\1\3"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "576:2: ( (otherlv_0= '[[' ( (lv_property_1_0= ruleProperty ) ) otherlv_2= ']]' ) | (otherlv_3= '[[' ( (lv_property_4_0= ruleProperty ) ) ( (lv_metaProperty_5_0= ruleMetaProperty ) ) otherlv_6= ']]' ) )";
        }
    }
    static final String dfa_7s = "\1\34\1\5\1\35\1\5\2\uffff\2\35";
    static final String dfa_8s = "\1\34\1\5\1\40\1\5\2\uffff\1\41\1\40";
    static final String[] dfa_9s = {
            "\1\1",
            "\1\2",
            "\1\4\1\5\1\uffff\1\3",
            "\1\6",
            "",
            "",
            "\1\4\1\5\1\uffff\1\3\1\7",
            "\1\4\1\5\1\uffff\1\3"
    };
    static final char[] dfa_7 = DFA.unpackEncodedStringToUnsignedChars(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final short[][] dfa_9 = unpackEncodedStringArray(dfa_9s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_7;
            this.max = dfa_8;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_9;
        }
        public String getDescription() {
            return "912:2: ( (otherlv_0= '[' ( (lv_property_1_0= ruleProperty ) ) otherlv_2= ']' ) | (otherlv_3= '[' ( (lv_property_4_0= ruleProperty ) ) ( (lv_info_5_0= ruleTagInfo ) ) otherlv_6= ']' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000014140AC022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000014160AC020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001410020020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000001F033B01000L});

}