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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'IMPORT'", "'#*'", "'*#'", "'IF'", "'('", "')'", "'{'", "'}'", "'ELSE'", "'if'", "'else'", "'FORALL'", "':'", "'TAGGED'", "'.'", "'foreach'", "'in'", "'[['", "']]'", "'['", "'TAGINFO'", "']'", "'.{'", "','", "'@[['", "']]@'", "'@['", "']@'", "'@{'", "'}@'", "'#'", "'n'", "'s'", "'t'", "'<'", "'>'", "'\\''"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
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
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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

                if ( (LA1_0==RULE_ID||LA1_0==14||LA1_0==16||LA1_0==22||LA1_0==24||LA1_0==28||LA1_0==30||LA1_0==32||LA1_0==37||LA1_0==39||LA1_0==41||LA1_0==43) ) {
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


    // $ANTLR start "entryRuleNote"
    // InternalMetaTemplating.g:275:1: entryRuleNote returns [EObject current=null] : iv_ruleNote= ruleNote EOF ;
    public final EObject entryRuleNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNote = null;


        try {
            // InternalMetaTemplating.g:275:45: (iv_ruleNote= ruleNote EOF )
            // InternalMetaTemplating.g:276:2: iv_ruleNote= ruleNote EOF
            {
             newCompositeNode(grammarAccess.getNoteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNote=ruleNote();

            state._fsp--;

             current =iv_ruleNote; 
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
    // $ANTLR end "entryRuleNote"


    // $ANTLR start "ruleNote"
    // InternalMetaTemplating.g:282:1: ruleNote returns [EObject current=null] : (otherlv_0= '#*' ( (lv_word_1_0= RULE_ID ) )+ otherlv_2= '*#' ) ;
    public final EObject ruleNote() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_word_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMetaTemplating.g:288:2: ( (otherlv_0= '#*' ( (lv_word_1_0= RULE_ID ) )+ otherlv_2= '*#' ) )
            // InternalMetaTemplating.g:289:2: (otherlv_0= '#*' ( (lv_word_1_0= RULE_ID ) )+ otherlv_2= '*#' )
            {
            // InternalMetaTemplating.g:289:2: (otherlv_0= '#*' ( (lv_word_1_0= RULE_ID ) )+ otherlv_2= '*#' )
            // InternalMetaTemplating.g:290:3: otherlv_0= '#*' ( (lv_word_1_0= RULE_ID ) )+ otherlv_2= '*#'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getNoteAccess().getNumberSignAsteriskKeyword_0());
            		
            // InternalMetaTemplating.g:294:3: ( (lv_word_1_0= RULE_ID ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMetaTemplating.g:295:4: (lv_word_1_0= RULE_ID )
            	    {
            	    // InternalMetaTemplating.g:295:4: (lv_word_1_0= RULE_ID )
            	    // InternalMetaTemplating.g:296:5: lv_word_1_0= RULE_ID
            	    {
            	    lv_word_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    					newLeafNode(lv_word_1_0, grammarAccess.getNoteAccess().getWordIDTerminalRuleCall_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getNoteRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"word",
            	    						lv_word_1_0,
            	    						"org.eclipse.xtext.common.Terminals.ID");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getNoteAccess().getAsteriskNumberSignKeyword_2());
            		

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
    // $ANTLR end "ruleNote"


    // $ANTLR start "entryRuleInstructions"
    // InternalMetaTemplating.g:320:1: entryRuleInstructions returns [EObject current=null] : iv_ruleInstructions= ruleInstructions EOF ;
    public final EObject entryRuleInstructions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstructions = null;


        try {
            // InternalMetaTemplating.g:320:53: (iv_ruleInstructions= ruleInstructions EOF )
            // InternalMetaTemplating.g:321:2: iv_ruleInstructions= ruleInstructions EOF
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
    // InternalMetaTemplating.g:327:1: ruleInstructions returns [EObject current=null] : ( ( (lv_note_0_0= ruleNote ) ) | ( (lv_statement_1_0= ruleStatement ) ) | ( (lv_filter_2_0= ruleFilter ) ) | ( (lv_metaFilter_3_0= ruleMetaFilter ) ) | ( (lv_iterator_4_0= ruleIterator ) ) | ( (lv_rule_5_0= ruleRule ) ) ) ;
    public final EObject ruleInstructions() throws RecognitionException {
        EObject current = null;

        EObject lv_note_0_0 = null;

        EObject lv_statement_1_0 = null;

        EObject lv_filter_2_0 = null;

        EObject lv_metaFilter_3_0 = null;

        EObject lv_iterator_4_0 = null;

        EObject lv_rule_5_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:333:2: ( ( ( (lv_note_0_0= ruleNote ) ) | ( (lv_statement_1_0= ruleStatement ) ) | ( (lv_filter_2_0= ruleFilter ) ) | ( (lv_metaFilter_3_0= ruleMetaFilter ) ) | ( (lv_iterator_4_0= ruleIterator ) ) | ( (lv_rule_5_0= ruleRule ) ) ) )
            // InternalMetaTemplating.g:334:2: ( ( (lv_note_0_0= ruleNote ) ) | ( (lv_statement_1_0= ruleStatement ) ) | ( (lv_filter_2_0= ruleFilter ) ) | ( (lv_metaFilter_3_0= ruleMetaFilter ) ) | ( (lv_iterator_4_0= ruleIterator ) ) | ( (lv_rule_5_0= ruleRule ) ) )
            {
            // InternalMetaTemplating.g:334:2: ( ( (lv_note_0_0= ruleNote ) ) | ( (lv_statement_1_0= ruleStatement ) ) | ( (lv_filter_2_0= ruleFilter ) ) | ( (lv_metaFilter_3_0= ruleMetaFilter ) ) | ( (lv_iterator_4_0= ruleIterator ) ) | ( (lv_rule_5_0= ruleRule ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
            case 30:
            case 32:
            case 37:
            case 39:
            case 41:
            case 43:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            case 16:
                {
                alt5=4;
                }
                break;
            case 28:
                {
                alt5=5;
                }
                break;
            case 24:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMetaTemplating.g:335:3: ( (lv_note_0_0= ruleNote ) )
                    {
                    // InternalMetaTemplating.g:335:3: ( (lv_note_0_0= ruleNote ) )
                    // InternalMetaTemplating.g:336:4: (lv_note_0_0= ruleNote )
                    {
                    // InternalMetaTemplating.g:336:4: (lv_note_0_0= ruleNote )
                    // InternalMetaTemplating.g:337:5: lv_note_0_0= ruleNote
                    {

                    					newCompositeNode(grammarAccess.getInstructionsAccess().getNoteNoteParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_note_0_0=ruleNote();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionsRule());
                    					}
                    					set(
                    						current,
                    						"note",
                    						lv_note_0_0,
                    						"org.xtext.example.mydsl.MetaTemplating.Note");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:355:3: ( (lv_statement_1_0= ruleStatement ) )
                    {
                    // InternalMetaTemplating.g:355:3: ( (lv_statement_1_0= ruleStatement ) )
                    // InternalMetaTemplating.g:356:4: (lv_statement_1_0= ruleStatement )
                    {
                    // InternalMetaTemplating.g:356:4: (lv_statement_1_0= ruleStatement )
                    // InternalMetaTemplating.g:357:5: lv_statement_1_0= ruleStatement
                    {

                    					newCompositeNode(grammarAccess.getInstructionsAccess().getStatementStatementParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_statement_1_0=ruleStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionsRule());
                    					}
                    					set(
                    						current,
                    						"statement",
                    						lv_statement_1_0,
                    						"org.xtext.example.mydsl.MetaTemplating.Statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMetaTemplating.g:375:3: ( (lv_filter_2_0= ruleFilter ) )
                    {
                    // InternalMetaTemplating.g:375:3: ( (lv_filter_2_0= ruleFilter ) )
                    // InternalMetaTemplating.g:376:4: (lv_filter_2_0= ruleFilter )
                    {
                    // InternalMetaTemplating.g:376:4: (lv_filter_2_0= ruleFilter )
                    // InternalMetaTemplating.g:377:5: lv_filter_2_0= ruleFilter
                    {

                    					newCompositeNode(grammarAccess.getInstructionsAccess().getFilterFilterParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_filter_2_0=ruleFilter();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionsRule());
                    					}
                    					set(
                    						current,
                    						"filter",
                    						lv_filter_2_0,
                    						"org.xtext.example.mydsl.MetaTemplating.Filter");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMetaTemplating.g:395:3: ( (lv_metaFilter_3_0= ruleMetaFilter ) )
                    {
                    // InternalMetaTemplating.g:395:3: ( (lv_metaFilter_3_0= ruleMetaFilter ) )
                    // InternalMetaTemplating.g:396:4: (lv_metaFilter_3_0= ruleMetaFilter )
                    {
                    // InternalMetaTemplating.g:396:4: (lv_metaFilter_3_0= ruleMetaFilter )
                    // InternalMetaTemplating.g:397:5: lv_metaFilter_3_0= ruleMetaFilter
                    {

                    					newCompositeNode(grammarAccess.getInstructionsAccess().getMetaFilterMetaFilterParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_metaFilter_3_0=ruleMetaFilter();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionsRule());
                    					}
                    					set(
                    						current,
                    						"metaFilter",
                    						lv_metaFilter_3_0,
                    						"org.xtext.example.mydsl.MetaTemplating.MetaFilter");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMetaTemplating.g:415:3: ( (lv_iterator_4_0= ruleIterator ) )
                    {
                    // InternalMetaTemplating.g:415:3: ( (lv_iterator_4_0= ruleIterator ) )
                    // InternalMetaTemplating.g:416:4: (lv_iterator_4_0= ruleIterator )
                    {
                    // InternalMetaTemplating.g:416:4: (lv_iterator_4_0= ruleIterator )
                    // InternalMetaTemplating.g:417:5: lv_iterator_4_0= ruleIterator
                    {

                    					newCompositeNode(grammarAccess.getInstructionsAccess().getIteratorIteratorParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_iterator_4_0=ruleIterator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionsRule());
                    					}
                    					set(
                    						current,
                    						"iterator",
                    						lv_iterator_4_0,
                    						"org.xtext.example.mydsl.MetaTemplating.Iterator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalMetaTemplating.g:435:3: ( (lv_rule_5_0= ruleRule ) )
                    {
                    // InternalMetaTemplating.g:435:3: ( (lv_rule_5_0= ruleRule ) )
                    // InternalMetaTemplating.g:436:4: (lv_rule_5_0= ruleRule )
                    {
                    // InternalMetaTemplating.g:436:4: (lv_rule_5_0= ruleRule )
                    // InternalMetaTemplating.g:437:5: lv_rule_5_0= ruleRule
                    {

                    					newCompositeNode(grammarAccess.getInstructionsAccess().getRuleRuleParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_rule_5_0=ruleRule();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionsRule());
                    					}
                    					set(
                    						current,
                    						"rule",
                    						lv_rule_5_0,
                    						"org.xtext.example.mydsl.MetaTemplating.Rule");
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
    // InternalMetaTemplating.g:458:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMetaTemplating.g:458:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMetaTemplating.g:459:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalMetaTemplating.g:465:1: ruleStatement returns [EObject current=null] : ( ( (lv_text_0_0= RULE_ID ) ) | ( (lv_char_1_0= ruleEscaped ) ) | ( (lv_string_2_0= ruleEscapedString ) ) | ( (lv_inject_3_0= ruleInject ) ) | ( (lv_metaInject_4_0= ruleMetaInject ) ) | ( (lv_placeholder_5_0= rulePh ) ) | ( (lv_metaPlaceholder_6_0= ruleMetaPh ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;
        EObject lv_char_1_0 = null;

        EObject lv_string_2_0 = null;

        EObject lv_inject_3_0 = null;

        EObject lv_metaInject_4_0 = null;

        EObject lv_placeholder_5_0 = null;

        EObject lv_metaPlaceholder_6_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:471:2: ( ( ( (lv_text_0_0= RULE_ID ) ) | ( (lv_char_1_0= ruleEscaped ) ) | ( (lv_string_2_0= ruleEscapedString ) ) | ( (lv_inject_3_0= ruleInject ) ) | ( (lv_metaInject_4_0= ruleMetaInject ) ) | ( (lv_placeholder_5_0= rulePh ) ) | ( (lv_metaPlaceholder_6_0= ruleMetaPh ) ) ) )
            // InternalMetaTemplating.g:472:2: ( ( (lv_text_0_0= RULE_ID ) ) | ( (lv_char_1_0= ruleEscaped ) ) | ( (lv_string_2_0= ruleEscapedString ) ) | ( (lv_inject_3_0= ruleInject ) ) | ( (lv_metaInject_4_0= ruleMetaInject ) ) | ( (lv_placeholder_5_0= rulePh ) ) | ( (lv_metaPlaceholder_6_0= ruleMetaPh ) ) )
            {
            // InternalMetaTemplating.g:472:2: ( ( (lv_text_0_0= RULE_ID ) ) | ( (lv_char_1_0= ruleEscaped ) ) | ( (lv_string_2_0= ruleEscapedString ) ) | ( (lv_inject_3_0= ruleInject ) ) | ( (lv_metaInject_4_0= ruleMetaInject ) ) | ( (lv_placeholder_5_0= rulePh ) ) | ( (lv_metaPlaceholder_6_0= ruleMetaPh ) ) )
            int alt6=7;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 43:
                {
                alt6=2;
                }
                break;
            case 41:
                {
                alt6=3;
                }
                break;
            case 37:
                {
                alt6=4;
                }
                break;
            case 39:
                {
                alt6=5;
                }
                break;
            case 30:
                {
                alt6=6;
                }
                break;
            case 32:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMetaTemplating.g:473:3: ( (lv_text_0_0= RULE_ID ) )
                    {
                    // InternalMetaTemplating.g:473:3: ( (lv_text_0_0= RULE_ID ) )
                    // InternalMetaTemplating.g:474:4: (lv_text_0_0= RULE_ID )
                    {
                    // InternalMetaTemplating.g:474:4: (lv_text_0_0= RULE_ID )
                    // InternalMetaTemplating.g:475:5: lv_text_0_0= RULE_ID
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
                    // InternalMetaTemplating.g:492:3: ( (lv_char_1_0= ruleEscaped ) )
                    {
                    // InternalMetaTemplating.g:492:3: ( (lv_char_1_0= ruleEscaped ) )
                    // InternalMetaTemplating.g:493:4: (lv_char_1_0= ruleEscaped )
                    {
                    // InternalMetaTemplating.g:493:4: (lv_char_1_0= ruleEscaped )
                    // InternalMetaTemplating.g:494:5: lv_char_1_0= ruleEscaped
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
                    // InternalMetaTemplating.g:512:3: ( (lv_string_2_0= ruleEscapedString ) )
                    {
                    // InternalMetaTemplating.g:512:3: ( (lv_string_2_0= ruleEscapedString ) )
                    // InternalMetaTemplating.g:513:4: (lv_string_2_0= ruleEscapedString )
                    {
                    // InternalMetaTemplating.g:513:4: (lv_string_2_0= ruleEscapedString )
                    // InternalMetaTemplating.g:514:5: lv_string_2_0= ruleEscapedString
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
                    // InternalMetaTemplating.g:532:3: ( (lv_inject_3_0= ruleInject ) )
                    {
                    // InternalMetaTemplating.g:532:3: ( (lv_inject_3_0= ruleInject ) )
                    // InternalMetaTemplating.g:533:4: (lv_inject_3_0= ruleInject )
                    {
                    // InternalMetaTemplating.g:533:4: (lv_inject_3_0= ruleInject )
                    // InternalMetaTemplating.g:534:5: lv_inject_3_0= ruleInject
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getInjectInjectParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_inject_3_0=ruleInject();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementRule());
                    					}
                    					set(
                    						current,
                    						"inject",
                    						lv_inject_3_0,
                    						"org.xtext.example.mydsl.MetaTemplating.Inject");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMetaTemplating.g:552:3: ( (lv_metaInject_4_0= ruleMetaInject ) )
                    {
                    // InternalMetaTemplating.g:552:3: ( (lv_metaInject_4_0= ruleMetaInject ) )
                    // InternalMetaTemplating.g:553:4: (lv_metaInject_4_0= ruleMetaInject )
                    {
                    // InternalMetaTemplating.g:553:4: (lv_metaInject_4_0= ruleMetaInject )
                    // InternalMetaTemplating.g:554:5: lv_metaInject_4_0= ruleMetaInject
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getMetaInjectMetaInjectParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_metaInject_4_0=ruleMetaInject();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementRule());
                    					}
                    					set(
                    						current,
                    						"metaInject",
                    						lv_metaInject_4_0,
                    						"org.xtext.example.mydsl.MetaTemplating.MetaInject");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalMetaTemplating.g:572:3: ( (lv_placeholder_5_0= rulePh ) )
                    {
                    // InternalMetaTemplating.g:572:3: ( (lv_placeholder_5_0= rulePh ) )
                    // InternalMetaTemplating.g:573:4: (lv_placeholder_5_0= rulePh )
                    {
                    // InternalMetaTemplating.g:573:4: (lv_placeholder_5_0= rulePh )
                    // InternalMetaTemplating.g:574:5: lv_placeholder_5_0= rulePh
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getPlaceholderPhParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_placeholder_5_0=rulePh();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementRule());
                    					}
                    					set(
                    						current,
                    						"placeholder",
                    						lv_placeholder_5_0,
                    						"org.xtext.example.mydsl.MetaTemplating.Ph");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalMetaTemplating.g:592:3: ( (lv_metaPlaceholder_6_0= ruleMetaPh ) )
                    {
                    // InternalMetaTemplating.g:592:3: ( (lv_metaPlaceholder_6_0= ruleMetaPh ) )
                    // InternalMetaTemplating.g:593:4: (lv_metaPlaceholder_6_0= ruleMetaPh )
                    {
                    // InternalMetaTemplating.g:593:4: (lv_metaPlaceholder_6_0= ruleMetaPh )
                    // InternalMetaTemplating.g:594:5: lv_metaPlaceholder_6_0= ruleMetaPh
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getMetaPlaceholderMetaPhParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_metaPlaceholder_6_0=ruleMetaPh();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementRule());
                    					}
                    					set(
                    						current,
                    						"metaPlaceholder",
                    						lv_metaPlaceholder_6_0,
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


    // $ANTLR start "entryRuleMetaFilter"
    // InternalMetaTemplating.g:615:1: entryRuleMetaFilter returns [EObject current=null] : iv_ruleMetaFilter= ruleMetaFilter EOF ;
    public final EObject entryRuleMetaFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaFilter = null;


        try {
            // InternalMetaTemplating.g:615:51: (iv_ruleMetaFilter= ruleMetaFilter EOF )
            // InternalMetaTemplating.g:616:2: iv_ruleMetaFilter= ruleMetaFilter EOF
            {
             newCompositeNode(grammarAccess.getMetaFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetaFilter=ruleMetaFilter();

            state._fsp--;

             current =iv_ruleMetaFilter; 
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
    // $ANTLR end "entryRuleMetaFilter"


    // $ANTLR start "ruleMetaFilter"
    // InternalMetaTemplating.g:622:1: ruleMetaFilter returns [EObject current=null] : (otherlv_0= 'IF' otherlv_1= '(' ( (lv_condition_2_0= ruleProperty ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_truebody_5_0= ruleInstructions ) )* otherlv_6= '}' (otherlv_7= 'ELSE' otherlv_8= '{' ( (lv_falsebody_9_0= ruleInstructions ) )* otherlv_10= '}' )? ) ;
    public final EObject ruleMetaFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_condition_2_0 = null;

        EObject lv_truebody_5_0 = null;

        EObject lv_falsebody_9_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:628:2: ( (otherlv_0= 'IF' otherlv_1= '(' ( (lv_condition_2_0= ruleProperty ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_truebody_5_0= ruleInstructions ) )* otherlv_6= '}' (otherlv_7= 'ELSE' otherlv_8= '{' ( (lv_falsebody_9_0= ruleInstructions ) )* otherlv_10= '}' )? ) )
            // InternalMetaTemplating.g:629:2: (otherlv_0= 'IF' otherlv_1= '(' ( (lv_condition_2_0= ruleProperty ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_truebody_5_0= ruleInstructions ) )* otherlv_6= '}' (otherlv_7= 'ELSE' otherlv_8= '{' ( (lv_falsebody_9_0= ruleInstructions ) )* otherlv_10= '}' )? )
            {
            // InternalMetaTemplating.g:629:2: (otherlv_0= 'IF' otherlv_1= '(' ( (lv_condition_2_0= ruleProperty ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_truebody_5_0= ruleInstructions ) )* otherlv_6= '}' (otherlv_7= 'ELSE' otherlv_8= '{' ( (lv_falsebody_9_0= ruleInstructions ) )* otherlv_10= '}' )? )
            // InternalMetaTemplating.g:630:3: otherlv_0= 'IF' otherlv_1= '(' ( (lv_condition_2_0= ruleProperty ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_truebody_5_0= ruleInstructions ) )* otherlv_6= '}' (otherlv_7= 'ELSE' otherlv_8= '{' ( (lv_falsebody_9_0= ruleInstructions ) )* otherlv_10= '}' )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getMetaFilterAccess().getIFKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getMetaFilterAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMetaTemplating.g:638:3: ( (lv_condition_2_0= ruleProperty ) )
            // InternalMetaTemplating.g:639:4: (lv_condition_2_0= ruleProperty )
            {
            // InternalMetaTemplating.g:639:4: (lv_condition_2_0= ruleProperty )
            // InternalMetaTemplating.g:640:5: lv_condition_2_0= ruleProperty
            {

            					newCompositeNode(grammarAccess.getMetaFilterAccess().getConditionPropertyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_condition_2_0=ruleProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetaFilterRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"org.xtext.example.mydsl.MetaTemplating.Property");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getMetaFilterAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getMetaFilterAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMetaTemplating.g:665:3: ( (lv_truebody_5_0= ruleInstructions ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==14||LA7_0==16||LA7_0==22||LA7_0==24||LA7_0==28||LA7_0==30||LA7_0==32||LA7_0==37||LA7_0==39||LA7_0==41||LA7_0==43) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMetaTemplating.g:666:4: (lv_truebody_5_0= ruleInstructions )
            	    {
            	    // InternalMetaTemplating.g:666:4: (lv_truebody_5_0= ruleInstructions )
            	    // InternalMetaTemplating.g:667:5: lv_truebody_5_0= ruleInstructions
            	    {

            	    					newCompositeNode(grammarAccess.getMetaFilterAccess().getTruebodyInstructionsParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_truebody_5_0=ruleInstructions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMetaFilterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"truebody",
            	    						lv_truebody_5_0,
            	    						"org.xtext.example.mydsl.MetaTemplating.Instructions");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getMetaFilterAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalMetaTemplating.g:688:3: (otherlv_7= 'ELSE' otherlv_8= '{' ( (lv_falsebody_9_0= ruleInstructions ) )* otherlv_10= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMetaTemplating.g:689:4: otherlv_7= 'ELSE' otherlv_8= '{' ( (lv_falsebody_9_0= ruleInstructions ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getMetaFilterAccess().getELSEKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getMetaFilterAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalMetaTemplating.g:697:4: ( (lv_falsebody_9_0= ruleInstructions ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID||LA8_0==14||LA8_0==16||LA8_0==22||LA8_0==24||LA8_0==28||LA8_0==30||LA8_0==32||LA8_0==37||LA8_0==39||LA8_0==41||LA8_0==43) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMetaTemplating.g:698:5: (lv_falsebody_9_0= ruleInstructions )
                    	    {
                    	    // InternalMetaTemplating.g:698:5: (lv_falsebody_9_0= ruleInstructions )
                    	    // InternalMetaTemplating.g:699:6: lv_falsebody_9_0= ruleInstructions
                    	    {

                    	    						newCompositeNode(grammarAccess.getMetaFilterAccess().getFalsebodyInstructionsParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_falsebody_9_0=ruleInstructions();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMetaFilterRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"falsebody",
                    	    							lv_falsebody_9_0,
                    	    							"org.xtext.example.mydsl.MetaTemplating.Instructions");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getMetaFilterAccess().getRightCurlyBracketKeyword_7_3());
                    			

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
    // $ANTLR end "ruleMetaFilter"


    // $ANTLR start "entryRuleFilter"
    // InternalMetaTemplating.g:725:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalMetaTemplating.g:725:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalMetaTemplating.g:726:2: iv_ruleFilter= ruleFilter EOF
            {
             newCompositeNode(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilter=ruleFilter();

            state._fsp--;

             current =iv_ruleFilter; 
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
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalMetaTemplating.g:732:1: ruleFilter returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleQuery ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_truebody_5_0= ruleInstructions ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_falsebody_9_0= ruleInstructions ) )* otherlv_10= '}' )? ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_condition_2_0 = null;

        EObject lv_truebody_5_0 = null;

        EObject lv_falsebody_9_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:738:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleQuery ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_truebody_5_0= ruleInstructions ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_falsebody_9_0= ruleInstructions ) )* otherlv_10= '}' )? ) )
            // InternalMetaTemplating.g:739:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleQuery ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_truebody_5_0= ruleInstructions ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_falsebody_9_0= ruleInstructions ) )* otherlv_10= '}' )? )
            {
            // InternalMetaTemplating.g:739:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleQuery ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_truebody_5_0= ruleInstructions ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_falsebody_9_0= ruleInstructions ) )* otherlv_10= '}' )? )
            // InternalMetaTemplating.g:740:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleQuery ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_truebody_5_0= ruleInstructions ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_falsebody_9_0= ruleInstructions ) )* otherlv_10= '}' )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getFilterAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getFilterAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMetaTemplating.g:748:3: ( (lv_condition_2_0= ruleQuery ) )
            // InternalMetaTemplating.g:749:4: (lv_condition_2_0= ruleQuery )
            {
            // InternalMetaTemplating.g:749:4: (lv_condition_2_0= ruleQuery )
            // InternalMetaTemplating.g:750:5: lv_condition_2_0= ruleQuery
            {

            					newCompositeNode(grammarAccess.getFilterAccess().getConditionQueryParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_condition_2_0=ruleQuery();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilterRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"org.xtext.example.mydsl.MetaTemplating.Query");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getFilterAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getFilterAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMetaTemplating.g:775:3: ( (lv_truebody_5_0= ruleInstructions ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==14||LA10_0==16||LA10_0==22||LA10_0==24||LA10_0==28||LA10_0==30||LA10_0==32||LA10_0==37||LA10_0==39||LA10_0==41||LA10_0==43) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMetaTemplating.g:776:4: (lv_truebody_5_0= ruleInstructions )
            	    {
            	    // InternalMetaTemplating.g:776:4: (lv_truebody_5_0= ruleInstructions )
            	    // InternalMetaTemplating.g:777:5: lv_truebody_5_0= ruleInstructions
            	    {

            	    					newCompositeNode(grammarAccess.getFilterAccess().getTruebodyInstructionsParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_truebody_5_0=ruleInstructions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFilterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"truebody",
            	    						lv_truebody_5_0,
            	    						"org.xtext.example.mydsl.MetaTemplating.Instructions");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_6=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getFilterAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalMetaTemplating.g:798:3: (otherlv_7= 'else' otherlv_8= '{' ( (lv_falsebody_9_0= ruleInstructions ) )* otherlv_10= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMetaTemplating.g:799:4: otherlv_7= 'else' otherlv_8= '{' ( (lv_falsebody_9_0= ruleInstructions ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getFilterAccess().getElseKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getFilterAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalMetaTemplating.g:807:4: ( (lv_falsebody_9_0= ruleInstructions ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID||LA11_0==14||LA11_0==16||LA11_0==22||LA11_0==24||LA11_0==28||LA11_0==30||LA11_0==32||LA11_0==37||LA11_0==39||LA11_0==41||LA11_0==43) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMetaTemplating.g:808:5: (lv_falsebody_9_0= ruleInstructions )
                    	    {
                    	    // InternalMetaTemplating.g:808:5: (lv_falsebody_9_0= ruleInstructions )
                    	    // InternalMetaTemplating.g:809:6: lv_falsebody_9_0= ruleInstructions
                    	    {

                    	    						newCompositeNode(grammarAccess.getFilterAccess().getFalsebodyInstructionsParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_falsebody_9_0=ruleInstructions();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getFilterRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"falsebody",
                    	    							lv_falsebody_9_0,
                    	    							"org.xtext.example.mydsl.MetaTemplating.Instructions");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getFilterAccess().getRightCurlyBracketKeyword_7_3());
                    			

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
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleRule"
    // InternalMetaTemplating.g:835:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalMetaTemplating.g:835:45: (iv_ruleRule= ruleRule EOF )
            // InternalMetaTemplating.g:836:2: iv_ruleRule= ruleRule EOF
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
    // InternalMetaTemplating.g:842:1: ruleRule returns [EObject current=null] : (otherlv_0= 'FORALL' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_property_4_0= ruleProperty ) ) otherlv_5= 'TAGGED' ( (lv_tag_6_0= RULE_ID ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_body_9_0= ruleInstructions ) )* otherlv_10= '}' ) ;
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
            // InternalMetaTemplating.g:848:2: ( (otherlv_0= 'FORALL' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_property_4_0= ruleProperty ) ) otherlv_5= 'TAGGED' ( (lv_tag_6_0= RULE_ID ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_body_9_0= ruleInstructions ) )* otherlv_10= '}' ) )
            // InternalMetaTemplating.g:849:2: (otherlv_0= 'FORALL' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_property_4_0= ruleProperty ) ) otherlv_5= 'TAGGED' ( (lv_tag_6_0= RULE_ID ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_body_9_0= ruleInstructions ) )* otherlv_10= '}' )
            {
            // InternalMetaTemplating.g:849:2: (otherlv_0= 'FORALL' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_property_4_0= ruleProperty ) ) otherlv_5= 'TAGGED' ( (lv_tag_6_0= RULE_ID ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_body_9_0= ruleInstructions ) )* otherlv_10= '}' )
            // InternalMetaTemplating.g:850:3: otherlv_0= 'FORALL' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_property_4_0= ruleProperty ) ) otherlv_5= 'TAGGED' ( (lv_tag_6_0= RULE_ID ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_body_9_0= ruleInstructions ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getFORALLKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMetaTemplating.g:858:3: ( (lv_element_2_0= RULE_ID ) )
            // InternalMetaTemplating.g:859:4: (lv_element_2_0= RULE_ID )
            {
            // InternalMetaTemplating.g:859:4: (lv_element_2_0= RULE_ID )
            // InternalMetaTemplating.g:860:5: lv_element_2_0= RULE_ID
            {
            lv_element_2_0=(Token)match(input,RULE_ID,FOLLOW_17); 

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

            otherlv_3=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getColonKeyword_3());
            		
            // InternalMetaTemplating.g:880:3: ( (lv_property_4_0= ruleProperty ) )
            // InternalMetaTemplating.g:881:4: (lv_property_4_0= ruleProperty )
            {
            // InternalMetaTemplating.g:881:4: (lv_property_4_0= ruleProperty )
            // InternalMetaTemplating.g:882:5: lv_property_4_0= ruleProperty
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getPropertyPropertyParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_5=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getTAGGEDKeyword_5());
            		
            // InternalMetaTemplating.g:903:3: ( (lv_tag_6_0= RULE_ID ) )
            // InternalMetaTemplating.g:904:4: (lv_tag_6_0= RULE_ID )
            {
            // InternalMetaTemplating.g:904:4: (lv_tag_6_0= RULE_ID )
            // InternalMetaTemplating.g:905:5: lv_tag_6_0= RULE_ID
            {
            lv_tag_6_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            otherlv_7=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalMetaTemplating.g:929:3: ( (lv_body_9_0= ruleInstructions ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==14||LA13_0==16||LA13_0==22||LA13_0==24||LA13_0==28||LA13_0==30||LA13_0==32||LA13_0==37||LA13_0==39||LA13_0==41||LA13_0==43) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMetaTemplating.g:930:4: (lv_body_9_0= ruleInstructions )
            	    {
            	    // InternalMetaTemplating.g:930:4: (lv_body_9_0= ruleInstructions )
            	    // InternalMetaTemplating.g:931:5: lv_body_9_0= ruleInstructions
            	    {

            	    					newCompositeNode(grammarAccess.getRuleAccess().getBodyInstructionsParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_13);
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
            	    break loop13;
                }
            } while (true);

            otherlv_10=(Token)match(input,20,FOLLOW_2); 

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


    // $ANTLR start "entryRuleProperty"
    // InternalMetaTemplating.g:956:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalMetaTemplating.g:956:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalMetaTemplating.g:957:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalMetaTemplating.g:963:1: ruleProperty returns [EObject current=null] : ( ( (lv_property_0_0= RULE_ID ) ) ( (lv_subProperties_1_0= ruleSubProperty ) )* ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_property_0_0=null;
        EObject lv_subProperties_1_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:969:2: ( ( ( (lv_property_0_0= RULE_ID ) ) ( (lv_subProperties_1_0= ruleSubProperty ) )* ) )
            // InternalMetaTemplating.g:970:2: ( ( (lv_property_0_0= RULE_ID ) ) ( (lv_subProperties_1_0= ruleSubProperty ) )* )
            {
            // InternalMetaTemplating.g:970:2: ( ( (lv_property_0_0= RULE_ID ) ) ( (lv_subProperties_1_0= ruleSubProperty ) )* )
            // InternalMetaTemplating.g:971:3: ( (lv_property_0_0= RULE_ID ) ) ( (lv_subProperties_1_0= ruleSubProperty ) )*
            {
            // InternalMetaTemplating.g:971:3: ( (lv_property_0_0= RULE_ID ) )
            // InternalMetaTemplating.g:972:4: (lv_property_0_0= RULE_ID )
            {
            // InternalMetaTemplating.g:972:4: (lv_property_0_0= RULE_ID )
            // InternalMetaTemplating.g:973:5: lv_property_0_0= RULE_ID
            {
            lv_property_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            // InternalMetaTemplating.g:989:3: ( (lv_subProperties_1_0= ruleSubProperty ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMetaTemplating.g:990:4: (lv_subProperties_1_0= ruleSubProperty )
            	    {
            	    // InternalMetaTemplating.g:990:4: (lv_subProperties_1_0= ruleSubProperty )
            	    // InternalMetaTemplating.g:991:5: lv_subProperties_1_0= ruleSubProperty
            	    {

            	    					newCompositeNode(grammarAccess.getPropertyAccess().getSubPropertiesSubPropertyParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_19);
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
            	    break loop14;
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
    // InternalMetaTemplating.g:1012:1: entryRuleSubProperty returns [EObject current=null] : iv_ruleSubProperty= ruleSubProperty EOF ;
    public final EObject entryRuleSubProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubProperty = null;


        try {
            // InternalMetaTemplating.g:1012:52: (iv_ruleSubProperty= ruleSubProperty EOF )
            // InternalMetaTemplating.g:1013:2: iv_ruleSubProperty= ruleSubProperty EOF
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
    // InternalMetaTemplating.g:1019:1: ruleSubProperty returns [EObject current=null] : ( (otherlv_0= '.' ( (lv_method_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )? otherlv_4= ')' ) | (otherlv_5= '.' ( (lv_property_6_0= RULE_ID ) ) ) ) ;
    public final EObject ruleSubProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_method_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_property_6_0=null;
        EObject lv_params_3_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:1025:2: ( ( (otherlv_0= '.' ( (lv_method_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )? otherlv_4= ')' ) | (otherlv_5= '.' ( (lv_property_6_0= RULE_ID ) ) ) ) )
            // InternalMetaTemplating.g:1026:2: ( (otherlv_0= '.' ( (lv_method_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )? otherlv_4= ')' ) | (otherlv_5= '.' ( (lv_property_6_0= RULE_ID ) ) ) )
            {
            // InternalMetaTemplating.g:1026:2: ( (otherlv_0= '.' ( (lv_method_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )? otherlv_4= ')' ) | (otherlv_5= '.' ( (lv_property_6_0= RULE_ID ) ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==RULE_ID) ) {
                    int LA16_2 = input.LA(3);

                    if ( (LA16_2==17) ) {
                        alt16=1;
                    }
                    else if ( (LA16_2==EOF||LA16_2==18||LA16_2==20||(LA16_2>=26 && LA16_2<=27)||(LA16_2>=33 && LA16_2<=34)) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMetaTemplating.g:1027:3: (otherlv_0= '.' ( (lv_method_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )? otherlv_4= ')' )
                    {
                    // InternalMetaTemplating.g:1027:3: (otherlv_0= '.' ( (lv_method_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )? otherlv_4= ')' )
                    // InternalMetaTemplating.g:1028:4: otherlv_0= '.' ( (lv_method_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getSubPropertyAccess().getFullStopKeyword_0_0());
                    			
                    // InternalMetaTemplating.g:1032:4: ( (lv_method_1_0= RULE_ID ) )
                    // InternalMetaTemplating.g:1033:5: (lv_method_1_0= RULE_ID )
                    {
                    // InternalMetaTemplating.g:1033:5: (lv_method_1_0= RULE_ID )
                    // InternalMetaTemplating.g:1034:6: lv_method_1_0= RULE_ID
                    {
                    lv_method_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_method_1_0, grammarAccess.getSubPropertyAccess().getMethodIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSubPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"method",
                    							lv_method_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,17,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getSubPropertyAccess().getLeftParenthesisKeyword_0_2());
                    			
                    // InternalMetaTemplating.g:1054:4: ( (lv_params_3_0= ruleParameter ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_ID) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalMetaTemplating.g:1055:5: (lv_params_3_0= ruleParameter )
                            {
                            // InternalMetaTemplating.g:1055:5: (lv_params_3_0= ruleParameter )
                            // InternalMetaTemplating.g:1056:6: lv_params_3_0= ruleParameter
                            {

                            						newCompositeNode(grammarAccess.getSubPropertyAccess().getParamsParameterParserRuleCall_0_3_0());
                            					
                            pushFollow(FOLLOW_11);
                            lv_params_3_0=ruleParameter();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getSubPropertyRule());
                            						}
                            						set(
                            							current,
                            							"params",
                            							lv_params_3_0,
                            							"org.xtext.example.mydsl.MetaTemplating.Parameter");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getSubPropertyAccess().getRightParenthesisKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:1079:3: (otherlv_5= '.' ( (lv_property_6_0= RULE_ID ) ) )
                    {
                    // InternalMetaTemplating.g:1079:3: (otherlv_5= '.' ( (lv_property_6_0= RULE_ID ) ) )
                    // InternalMetaTemplating.g:1080:4: otherlv_5= '.' ( (lv_property_6_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getSubPropertyAccess().getFullStopKeyword_1_0());
                    			
                    // InternalMetaTemplating.g:1084:4: ( (lv_property_6_0= RULE_ID ) )
                    // InternalMetaTemplating.g:1085:5: (lv_property_6_0= RULE_ID )
                    {
                    // InternalMetaTemplating.g:1085:5: (lv_property_6_0= RULE_ID )
                    // InternalMetaTemplating.g:1086:6: lv_property_6_0= RULE_ID
                    {
                    lv_property_6_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_property_6_0, grammarAccess.getSubPropertyAccess().getPropertyIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSubPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"property",
                    							lv_property_6_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


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
    // $ANTLR end "ruleSubProperty"


    // $ANTLR start "entryRuleIterator"
    // InternalMetaTemplating.g:1107:1: entryRuleIterator returns [EObject current=null] : iv_ruleIterator= ruleIterator EOF ;
    public final EObject entryRuleIterator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterator = null;


        try {
            // InternalMetaTemplating.g:1107:49: (iv_ruleIterator= ruleIterator EOF )
            // InternalMetaTemplating.g:1108:2: iv_ruleIterator= ruleIterator EOF
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
    // InternalMetaTemplating.g:1114:1: ruleIterator returns [EObject current=null] : (otherlv_0= 'foreach' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= 'in' ( (lv_query_4_0= ruleQuery ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_body_7_0= ruleInstructions ) )* otherlv_8= '}' ) ;
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
            // InternalMetaTemplating.g:1120:2: ( (otherlv_0= 'foreach' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= 'in' ( (lv_query_4_0= ruleQuery ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_body_7_0= ruleInstructions ) )* otherlv_8= '}' ) )
            // InternalMetaTemplating.g:1121:2: (otherlv_0= 'foreach' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= 'in' ( (lv_query_4_0= ruleQuery ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_body_7_0= ruleInstructions ) )* otherlv_8= '}' )
            {
            // InternalMetaTemplating.g:1121:2: (otherlv_0= 'foreach' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= 'in' ( (lv_query_4_0= ruleQuery ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_body_7_0= ruleInstructions ) )* otherlv_8= '}' )
            // InternalMetaTemplating.g:1122:3: otherlv_0= 'foreach' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= 'in' ( (lv_query_4_0= ruleQuery ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_body_7_0= ruleInstructions ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getIteratorAccess().getForeachKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getIteratorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMetaTemplating.g:1130:3: ( (lv_element_2_0= RULE_ID ) )
            // InternalMetaTemplating.g:1131:4: (lv_element_2_0= RULE_ID )
            {
            // InternalMetaTemplating.g:1131:4: (lv_element_2_0= RULE_ID )
            // InternalMetaTemplating.g:1132:5: lv_element_2_0= RULE_ID
            {
            lv_element_2_0=(Token)match(input,RULE_ID,FOLLOW_21); 

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

            otherlv_3=(Token)match(input,29,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getIteratorAccess().getInKeyword_3());
            		
            // InternalMetaTemplating.g:1152:3: ( (lv_query_4_0= ruleQuery ) )
            // InternalMetaTemplating.g:1153:4: (lv_query_4_0= ruleQuery )
            {
            // InternalMetaTemplating.g:1153:4: (lv_query_4_0= ruleQuery )
            // InternalMetaTemplating.g:1154:5: lv_query_4_0= ruleQuery
            {

            					newCompositeNode(grammarAccess.getIteratorAccess().getQueryQueryParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_5=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getIteratorAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getIteratorAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalMetaTemplating.g:1179:3: ( (lv_body_7_0= ruleInstructions ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||LA17_0==14||LA17_0==16||LA17_0==22||LA17_0==24||LA17_0==28||LA17_0==30||LA17_0==32||LA17_0==37||LA17_0==39||LA17_0==41||LA17_0==43) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMetaTemplating.g:1180:4: (lv_body_7_0= ruleInstructions )
            	    {
            	    // InternalMetaTemplating.g:1180:4: (lv_body_7_0= ruleInstructions )
            	    // InternalMetaTemplating.g:1181:5: lv_body_7_0= ruleInstructions
            	    {

            	    					newCompositeNode(grammarAccess.getIteratorAccess().getBodyInstructionsParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_13);
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
            	    break loop17;
                }
            } while (true);

            otherlv_8=(Token)match(input,20,FOLLOW_2); 

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
    // InternalMetaTemplating.g:1206:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalMetaTemplating.g:1206:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalMetaTemplating.g:1207:2: iv_ruleQuery= ruleQuery EOF
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
    // InternalMetaTemplating.g:1213:1: ruleQuery returns [EObject current=null] : ( ( ( (lv_item_0_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleMetaPh ) ) ) ( (lv_subQuery_2_0= ruleSubQuery ) )* ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token lv_item_0_0=null;
        EObject lv_ref_1_0 = null;

        EObject lv_subQuery_2_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:1219:2: ( ( ( ( (lv_item_0_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleMetaPh ) ) ) ( (lv_subQuery_2_0= ruleSubQuery ) )* ) )
            // InternalMetaTemplating.g:1220:2: ( ( ( (lv_item_0_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleMetaPh ) ) ) ( (lv_subQuery_2_0= ruleSubQuery ) )* )
            {
            // InternalMetaTemplating.g:1220:2: ( ( ( (lv_item_0_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleMetaPh ) ) ) ( (lv_subQuery_2_0= ruleSubQuery ) )* )
            // InternalMetaTemplating.g:1221:3: ( ( (lv_item_0_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleMetaPh ) ) ) ( (lv_subQuery_2_0= ruleSubQuery ) )*
            {
            // InternalMetaTemplating.g:1221:3: ( ( (lv_item_0_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleMetaPh ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==32) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMetaTemplating.g:1222:4: ( (lv_item_0_0= RULE_ID ) )
                    {
                    // InternalMetaTemplating.g:1222:4: ( (lv_item_0_0= RULE_ID ) )
                    // InternalMetaTemplating.g:1223:5: (lv_item_0_0= RULE_ID )
                    {
                    // InternalMetaTemplating.g:1223:5: (lv_item_0_0= RULE_ID )
                    // InternalMetaTemplating.g:1224:6: lv_item_0_0= RULE_ID
                    {
                    lv_item_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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
                    // InternalMetaTemplating.g:1241:4: ( (lv_ref_1_0= ruleMetaPh ) )
                    {
                    // InternalMetaTemplating.g:1241:4: ( (lv_ref_1_0= ruleMetaPh ) )
                    // InternalMetaTemplating.g:1242:5: (lv_ref_1_0= ruleMetaPh )
                    {
                    // InternalMetaTemplating.g:1242:5: (lv_ref_1_0= ruleMetaPh )
                    // InternalMetaTemplating.g:1243:6: lv_ref_1_0= ruleMetaPh
                    {

                    						newCompositeNode(grammarAccess.getQueryAccess().getRefMetaPhParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_19);
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

            // InternalMetaTemplating.g:1261:3: ( (lv_subQuery_2_0= ruleSubQuery ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMetaTemplating.g:1262:4: (lv_subQuery_2_0= ruleSubQuery )
            	    {
            	    // InternalMetaTemplating.g:1262:4: (lv_subQuery_2_0= ruleSubQuery )
            	    // InternalMetaTemplating.g:1263:5: lv_subQuery_2_0= ruleSubQuery
            	    {

            	    					newCompositeNode(grammarAccess.getQueryAccess().getSubQuerySubQueryParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_19);
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
            	    break loop19;
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
    // InternalMetaTemplating.g:1284:1: entryRuleSubQuery returns [EObject current=null] : iv_ruleSubQuery= ruleSubQuery EOF ;
    public final EObject entryRuleSubQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubQuery = null;


        try {
            // InternalMetaTemplating.g:1284:49: (iv_ruleSubQuery= ruleSubQuery EOF )
            // InternalMetaTemplating.g:1285:2: iv_ruleSubQuery= ruleSubQuery EOF
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
    // InternalMetaTemplating.g:1291:1: ruleSubQuery returns [EObject current=null] : ( (otherlv_0= '.' ( ( (lv_methItem_1_0= RULE_ID ) ) | ( (lv_methRef_2_0= ruleMetaPh ) ) ) otherlv_3= '(' ( (lv_params_4_0= ruleParameter ) )? otherlv_5= ')' ) | (otherlv_6= '.' ( ( (lv_item_7_0= RULE_ID ) ) | ( (lv_ref_8_0= ruleMetaPh ) ) ) ) ) ;
    public final EObject ruleSubQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_methItem_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_item_7_0=null;
        EObject lv_methRef_2_0 = null;

        EObject lv_params_4_0 = null;

        EObject lv_ref_8_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:1297:2: ( ( (otherlv_0= '.' ( ( (lv_methItem_1_0= RULE_ID ) ) | ( (lv_methRef_2_0= ruleMetaPh ) ) ) otherlv_3= '(' ( (lv_params_4_0= ruleParameter ) )? otherlv_5= ')' ) | (otherlv_6= '.' ( ( (lv_item_7_0= RULE_ID ) ) | ( (lv_ref_8_0= ruleMetaPh ) ) ) ) ) )
            // InternalMetaTemplating.g:1298:2: ( (otherlv_0= '.' ( ( (lv_methItem_1_0= RULE_ID ) ) | ( (lv_methRef_2_0= ruleMetaPh ) ) ) otherlv_3= '(' ( (lv_params_4_0= ruleParameter ) )? otherlv_5= ')' ) | (otherlv_6= '.' ( ( (lv_item_7_0= RULE_ID ) ) | ( (lv_ref_8_0= ruleMetaPh ) ) ) ) )
            {
            // InternalMetaTemplating.g:1298:2: ( (otherlv_0= '.' ( ( (lv_methItem_1_0= RULE_ID ) ) | ( (lv_methRef_2_0= ruleMetaPh ) ) ) otherlv_3= '(' ( (lv_params_4_0= ruleParameter ) )? otherlv_5= ')' ) | (otherlv_6= '.' ( ( (lv_item_7_0= RULE_ID ) ) | ( (lv_ref_8_0= ruleMetaPh ) ) ) ) )
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalMetaTemplating.g:1299:3: (otherlv_0= '.' ( ( (lv_methItem_1_0= RULE_ID ) ) | ( (lv_methRef_2_0= ruleMetaPh ) ) ) otherlv_3= '(' ( (lv_params_4_0= ruleParameter ) )? otherlv_5= ')' )
                    {
                    // InternalMetaTemplating.g:1299:3: (otherlv_0= '.' ( ( (lv_methItem_1_0= RULE_ID ) ) | ( (lv_methRef_2_0= ruleMetaPh ) ) ) otherlv_3= '(' ( (lv_params_4_0= ruleParameter ) )? otherlv_5= ')' )
                    // InternalMetaTemplating.g:1300:4: otherlv_0= '.' ( ( (lv_methItem_1_0= RULE_ID ) ) | ( (lv_methRef_2_0= ruleMetaPh ) ) ) otherlv_3= '(' ( (lv_params_4_0= ruleParameter ) )? otherlv_5= ')'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_15); 

                    				newLeafNode(otherlv_0, grammarAccess.getSubQueryAccess().getFullStopKeyword_0_0());
                    			
                    // InternalMetaTemplating.g:1304:4: ( ( (lv_methItem_1_0= RULE_ID ) ) | ( (lv_methRef_2_0= ruleMetaPh ) ) )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_ID) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==32) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalMetaTemplating.g:1305:5: ( (lv_methItem_1_0= RULE_ID ) )
                            {
                            // InternalMetaTemplating.g:1305:5: ( (lv_methItem_1_0= RULE_ID ) )
                            // InternalMetaTemplating.g:1306:6: (lv_methItem_1_0= RULE_ID )
                            {
                            // InternalMetaTemplating.g:1306:6: (lv_methItem_1_0= RULE_ID )
                            // InternalMetaTemplating.g:1307:7: lv_methItem_1_0= RULE_ID
                            {
                            lv_methItem_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                            							newLeafNode(lv_methItem_1_0, grammarAccess.getSubQueryAccess().getMethItemIDTerminalRuleCall_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSubQueryRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"methItem",
                            								lv_methItem_1_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMetaTemplating.g:1324:5: ( (lv_methRef_2_0= ruleMetaPh ) )
                            {
                            // InternalMetaTemplating.g:1324:5: ( (lv_methRef_2_0= ruleMetaPh ) )
                            // InternalMetaTemplating.g:1325:6: (lv_methRef_2_0= ruleMetaPh )
                            {
                            // InternalMetaTemplating.g:1325:6: (lv_methRef_2_0= ruleMetaPh )
                            // InternalMetaTemplating.g:1326:7: lv_methRef_2_0= ruleMetaPh
                            {

                            							newCompositeNode(grammarAccess.getSubQueryAccess().getMethRefMetaPhParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_10);
                            lv_methRef_2_0=ruleMetaPh();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getSubQueryRule());
                            							}
                            							set(
                            								current,
                            								"methRef",
                            								lv_methRef_2_0,
                            								"org.xtext.example.mydsl.MetaTemplating.MetaPh");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_20); 

                    				newLeafNode(otherlv_3, grammarAccess.getSubQueryAccess().getLeftParenthesisKeyword_0_2());
                    			
                    // InternalMetaTemplating.g:1348:4: ( (lv_params_4_0= ruleParameter ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_ID) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalMetaTemplating.g:1349:5: (lv_params_4_0= ruleParameter )
                            {
                            // InternalMetaTemplating.g:1349:5: (lv_params_4_0= ruleParameter )
                            // InternalMetaTemplating.g:1350:6: lv_params_4_0= ruleParameter
                            {

                            						newCompositeNode(grammarAccess.getSubQueryAccess().getParamsParameterParserRuleCall_0_3_0());
                            					
                            pushFollow(FOLLOW_11);
                            lv_params_4_0=ruleParameter();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getSubQueryRule());
                            						}
                            						set(
                            							current,
                            							"params",
                            							lv_params_4_0,
                            							"org.xtext.example.mydsl.MetaTemplating.Parameter");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getSubQueryAccess().getRightParenthesisKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:1373:3: (otherlv_6= '.' ( ( (lv_item_7_0= RULE_ID ) ) | ( (lv_ref_8_0= ruleMetaPh ) ) ) )
                    {
                    // InternalMetaTemplating.g:1373:3: (otherlv_6= '.' ( ( (lv_item_7_0= RULE_ID ) ) | ( (lv_ref_8_0= ruleMetaPh ) ) ) )
                    // InternalMetaTemplating.g:1374:4: otherlv_6= '.' ( ( (lv_item_7_0= RULE_ID ) ) | ( (lv_ref_8_0= ruleMetaPh ) ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getSubQueryAccess().getFullStopKeyword_1_0());
                    			
                    // InternalMetaTemplating.g:1378:4: ( ( (lv_item_7_0= RULE_ID ) ) | ( (lv_ref_8_0= ruleMetaPh ) ) )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_ID) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==32) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalMetaTemplating.g:1379:5: ( (lv_item_7_0= RULE_ID ) )
                            {
                            // InternalMetaTemplating.g:1379:5: ( (lv_item_7_0= RULE_ID ) )
                            // InternalMetaTemplating.g:1380:6: (lv_item_7_0= RULE_ID )
                            {
                            // InternalMetaTemplating.g:1380:6: (lv_item_7_0= RULE_ID )
                            // InternalMetaTemplating.g:1381:7: lv_item_7_0= RULE_ID
                            {
                            lv_item_7_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(lv_item_7_0, grammarAccess.getSubQueryAccess().getItemIDTerminalRuleCall_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSubQueryRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"item",
                            								lv_item_7_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMetaTemplating.g:1398:5: ( (lv_ref_8_0= ruleMetaPh ) )
                            {
                            // InternalMetaTemplating.g:1398:5: ( (lv_ref_8_0= ruleMetaPh ) )
                            // InternalMetaTemplating.g:1399:6: (lv_ref_8_0= ruleMetaPh )
                            {
                            // InternalMetaTemplating.g:1399:6: (lv_ref_8_0= ruleMetaPh )
                            // InternalMetaTemplating.g:1400:7: lv_ref_8_0= ruleMetaPh
                            {

                            							newCompositeNode(grammarAccess.getSubQueryAccess().getRefMetaPhParserRuleCall_1_1_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_ref_8_0=ruleMetaPh();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getSubQueryRule());
                            							}
                            							set(
                            								current,
                            								"ref",
                            								lv_ref_8_0,
                            								"org.xtext.example.mydsl.MetaTemplating.MetaPh");
                            							afterParserOrEnumRuleCall();
                            						

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
    // InternalMetaTemplating.g:1423:1: entryRulePh returns [EObject current=null] : iv_rulePh= rulePh EOF ;
    public final EObject entryRulePh() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePh = null;


        try {
            // InternalMetaTemplating.g:1423:43: (iv_rulePh= rulePh EOF )
            // InternalMetaTemplating.g:1424:2: iv_rulePh= rulePh EOF
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
    // InternalMetaTemplating.g:1430:1: rulePh returns [EObject current=null] : (otherlv_0= '[[' ( (lv_property_1_0= rulePhProperty ) ) otherlv_2= ']]' ) ;
    public final EObject rulePh() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_property_1_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:1436:2: ( (otherlv_0= '[[' ( (lv_property_1_0= rulePhProperty ) ) otherlv_2= ']]' ) )
            // InternalMetaTemplating.g:1437:2: (otherlv_0= '[[' ( (lv_property_1_0= rulePhProperty ) ) otherlv_2= ']]' )
            {
            // InternalMetaTemplating.g:1437:2: (otherlv_0= '[[' ( (lv_property_1_0= rulePhProperty ) ) otherlv_2= ']]' )
            // InternalMetaTemplating.g:1438:3: otherlv_0= '[[' ( (lv_property_1_0= rulePhProperty ) ) otherlv_2= ']]'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPhAccess().getLeftSquareBracketLeftSquareBracketKeyword_0());
            		
            // InternalMetaTemplating.g:1442:3: ( (lv_property_1_0= rulePhProperty ) )
            // InternalMetaTemplating.g:1443:4: (lv_property_1_0= rulePhProperty )
            {
            // InternalMetaTemplating.g:1443:4: (lv_property_1_0= rulePhProperty )
            // InternalMetaTemplating.g:1444:5: lv_property_1_0= rulePhProperty
            {

            					newCompositeNode(grammarAccess.getPhAccess().getPropertyPhPropertyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_property_1_0=rulePhProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhRule());
            					}
            					set(
            						current,
            						"property",
            						lv_property_1_0,
            						"org.xtext.example.mydsl.MetaTemplating.PhProperty");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPhAccess().getRightSquareBracketRightSquareBracketKeyword_2());
            		

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
    // InternalMetaTemplating.g:1469:1: entryRuleMetaPh returns [EObject current=null] : iv_ruleMetaPh= ruleMetaPh EOF ;
    public final EObject entryRuleMetaPh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaPh = null;


        try {
            // InternalMetaTemplating.g:1469:47: (iv_ruleMetaPh= ruleMetaPh EOF )
            // InternalMetaTemplating.g:1470:2: iv_ruleMetaPh= ruleMetaPh EOF
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
    // InternalMetaTemplating.g:1476:1: ruleMetaPh returns [EObject current=null] : (otherlv_0= '[' ( (lv_property_1_0= ruleProperty ) ) (otherlv_2= 'TAGINFO' ( (lv_tag_3_0= RULE_ID ) ) )? otherlv_4= ']' ) ;
    public final EObject ruleMetaPh() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_tag_3_0=null;
        Token otherlv_4=null;
        EObject lv_property_1_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:1482:2: ( (otherlv_0= '[' ( (lv_property_1_0= ruleProperty ) ) (otherlv_2= 'TAGINFO' ( (lv_tag_3_0= RULE_ID ) ) )? otherlv_4= ']' ) )
            // InternalMetaTemplating.g:1483:2: (otherlv_0= '[' ( (lv_property_1_0= ruleProperty ) ) (otherlv_2= 'TAGINFO' ( (lv_tag_3_0= RULE_ID ) ) )? otherlv_4= ']' )
            {
            // InternalMetaTemplating.g:1483:2: (otherlv_0= '[' ( (lv_property_1_0= ruleProperty ) ) (otherlv_2= 'TAGINFO' ( (lv_tag_3_0= RULE_ID ) ) )? otherlv_4= ']' )
            // InternalMetaTemplating.g:1484:3: otherlv_0= '[' ( (lv_property_1_0= ruleProperty ) ) (otherlv_2= 'TAGINFO' ( (lv_tag_3_0= RULE_ID ) ) )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMetaPhAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalMetaTemplating.g:1488:3: ( (lv_property_1_0= ruleProperty ) )
            // InternalMetaTemplating.g:1489:4: (lv_property_1_0= ruleProperty )
            {
            // InternalMetaTemplating.g:1489:4: (lv_property_1_0= ruleProperty )
            // InternalMetaTemplating.g:1490:5: lv_property_1_0= ruleProperty
            {

            					newCompositeNode(grammarAccess.getMetaPhAccess().getPropertyPropertyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
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

            // InternalMetaTemplating.g:1507:3: (otherlv_2= 'TAGINFO' ( (lv_tag_3_0= RULE_ID ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMetaTemplating.g:1508:4: otherlv_2= 'TAGINFO' ( (lv_tag_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getMetaPhAccess().getTAGINFOKeyword_2_0());
                    			
                    // InternalMetaTemplating.g:1512:4: ( (lv_tag_3_0= RULE_ID ) )
                    // InternalMetaTemplating.g:1513:5: (lv_tag_3_0= RULE_ID )
                    {
                    // InternalMetaTemplating.g:1513:5: (lv_tag_3_0= RULE_ID )
                    // InternalMetaTemplating.g:1514:6: lv_tag_3_0= RULE_ID
                    {
                    lv_tag_3_0=(Token)match(input,RULE_ID,FOLLOW_24); 

                    						newLeafNode(lv_tag_3_0, grammarAccess.getMetaPhAccess().getTagIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMetaPhRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"tag",
                    							lv_tag_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,34,FOLLOW_2); 

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


    // $ANTLR start "entryRulePhProperty"
    // InternalMetaTemplating.g:1539:1: entryRulePhProperty returns [EObject current=null] : iv_rulePhProperty= rulePhProperty EOF ;
    public final EObject entryRulePhProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhProperty = null;


        try {
            // InternalMetaTemplating.g:1539:51: (iv_rulePhProperty= rulePhProperty EOF )
            // InternalMetaTemplating.g:1540:2: iv_rulePhProperty= rulePhProperty EOF
            {
             newCompositeNode(grammarAccess.getPhPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhProperty=rulePhProperty();

            state._fsp--;

             current =iv_rulePhProperty; 
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
    // $ANTLR end "entryRulePhProperty"


    // $ANTLR start "rulePhProperty"
    // InternalMetaTemplating.g:1546:1: rulePhProperty returns [EObject current=null] : ( ( (lv_property_0_0= RULE_ID ) ) ( (lv_subProperties_1_0= rulePhSubProperty ) )* ) ;
    public final EObject rulePhProperty() throws RecognitionException {
        EObject current = null;

        Token lv_property_0_0=null;
        EObject lv_subProperties_1_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:1552:2: ( ( ( (lv_property_0_0= RULE_ID ) ) ( (lv_subProperties_1_0= rulePhSubProperty ) )* ) )
            // InternalMetaTemplating.g:1553:2: ( ( (lv_property_0_0= RULE_ID ) ) ( (lv_subProperties_1_0= rulePhSubProperty ) )* )
            {
            // InternalMetaTemplating.g:1553:2: ( ( (lv_property_0_0= RULE_ID ) ) ( (lv_subProperties_1_0= rulePhSubProperty ) )* )
            // InternalMetaTemplating.g:1554:3: ( (lv_property_0_0= RULE_ID ) ) ( (lv_subProperties_1_0= rulePhSubProperty ) )*
            {
            // InternalMetaTemplating.g:1554:3: ( (lv_property_0_0= RULE_ID ) )
            // InternalMetaTemplating.g:1555:4: (lv_property_0_0= RULE_ID )
            {
            // InternalMetaTemplating.g:1555:4: (lv_property_0_0= RULE_ID )
            // InternalMetaTemplating.g:1556:5: lv_property_0_0= RULE_ID
            {
            lv_property_0_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_property_0_0, grammarAccess.getPhPropertyAccess().getPropertyIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"property",
            						lv_property_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMetaTemplating.g:1572:3: ( (lv_subProperties_1_0= rulePhSubProperty ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==27||LA25_0==35) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMetaTemplating.g:1573:4: (lv_subProperties_1_0= rulePhSubProperty )
            	    {
            	    // InternalMetaTemplating.g:1573:4: (lv_subProperties_1_0= rulePhSubProperty )
            	    // InternalMetaTemplating.g:1574:5: lv_subProperties_1_0= rulePhSubProperty
            	    {

            	    					newCompositeNode(grammarAccess.getPhPropertyAccess().getSubPropertiesPhSubPropertyParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_subProperties_1_0=rulePhSubProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPhPropertyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"subProperties",
            	    						lv_subProperties_1_0,
            	    						"org.xtext.example.mydsl.MetaTemplating.PhSubProperty");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // $ANTLR end "rulePhProperty"


    // $ANTLR start "entryRulePhSubProperty"
    // InternalMetaTemplating.g:1595:1: entryRulePhSubProperty returns [EObject current=null] : iv_rulePhSubProperty= rulePhSubProperty EOF ;
    public final EObject entryRulePhSubProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhSubProperty = null;


        try {
            // InternalMetaTemplating.g:1595:54: (iv_rulePhSubProperty= rulePhSubProperty EOF )
            // InternalMetaTemplating.g:1596:2: iv_rulePhSubProperty= rulePhSubProperty EOF
            {
             newCompositeNode(grammarAccess.getPhSubPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhSubProperty=rulePhSubProperty();

            state._fsp--;

             current =iv_rulePhSubProperty; 
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
    // $ANTLR end "entryRulePhSubProperty"


    // $ANTLR start "rulePhSubProperty"
    // InternalMetaTemplating.g:1602:1: rulePhSubProperty returns [EObject current=null] : ( (otherlv_0= '.' ( (lv_method_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )? otherlv_4= ')' ) | (otherlv_5= '.' ( (lv_property_6_0= RULE_ID ) ) ) | (otherlv_7= '.{' ( (lv_metaProperty_8_0= ruleProperty ) ) otherlv_9= '}' ) ) ;
    public final EObject rulePhSubProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_method_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_property_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_params_3_0 = null;

        EObject lv_metaProperty_8_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:1608:2: ( ( (otherlv_0= '.' ( (lv_method_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )? otherlv_4= ')' ) | (otherlv_5= '.' ( (lv_property_6_0= RULE_ID ) ) ) | (otherlv_7= '.{' ( (lv_metaProperty_8_0= ruleProperty ) ) otherlv_9= '}' ) ) )
            // InternalMetaTemplating.g:1609:2: ( (otherlv_0= '.' ( (lv_method_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )? otherlv_4= ')' ) | (otherlv_5= '.' ( (lv_property_6_0= RULE_ID ) ) ) | (otherlv_7= '.{' ( (lv_metaProperty_8_0= ruleProperty ) ) otherlv_9= '}' ) )
            {
            // InternalMetaTemplating.g:1609:2: ( (otherlv_0= '.' ( (lv_method_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )? otherlv_4= ')' ) | (otherlv_5= '.' ( (lv_property_6_0= RULE_ID ) ) ) | (otherlv_7= '.{' ( (lv_metaProperty_8_0= ruleProperty ) ) otherlv_9= '}' ) )
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==27) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==RULE_ID) ) {
                    int LA27_3 = input.LA(3);

                    if ( (LA27_3==17) ) {
                        alt27=1;
                    }
                    else if ( (LA27_3==EOF||LA27_3==27||LA27_3==31||LA27_3==35) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA27_0==35) ) {
                alt27=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalMetaTemplating.g:1610:3: (otherlv_0= '.' ( (lv_method_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )? otherlv_4= ')' )
                    {
                    // InternalMetaTemplating.g:1610:3: (otherlv_0= '.' ( (lv_method_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )? otherlv_4= ')' )
                    // InternalMetaTemplating.g:1611:4: otherlv_0= '.' ( (lv_method_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getPhSubPropertyAccess().getFullStopKeyword_0_0());
                    			
                    // InternalMetaTemplating.g:1615:4: ( (lv_method_1_0= RULE_ID ) )
                    // InternalMetaTemplating.g:1616:5: (lv_method_1_0= RULE_ID )
                    {
                    // InternalMetaTemplating.g:1616:5: (lv_method_1_0= RULE_ID )
                    // InternalMetaTemplating.g:1617:6: lv_method_1_0= RULE_ID
                    {
                    lv_method_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_method_1_0, grammarAccess.getPhSubPropertyAccess().getMethodIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPhSubPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"method",
                    							lv_method_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,17,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getPhSubPropertyAccess().getLeftParenthesisKeyword_0_2());
                    			
                    // InternalMetaTemplating.g:1637:4: ( (lv_params_3_0= ruleParameter ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==RULE_ID) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalMetaTemplating.g:1638:5: (lv_params_3_0= ruleParameter )
                            {
                            // InternalMetaTemplating.g:1638:5: (lv_params_3_0= ruleParameter )
                            // InternalMetaTemplating.g:1639:6: lv_params_3_0= ruleParameter
                            {

                            						newCompositeNode(grammarAccess.getPhSubPropertyAccess().getParamsParameterParserRuleCall_0_3_0());
                            					
                            pushFollow(FOLLOW_11);
                            lv_params_3_0=ruleParameter();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPhSubPropertyRule());
                            						}
                            						set(
                            							current,
                            							"params",
                            							lv_params_3_0,
                            							"org.xtext.example.mydsl.MetaTemplating.Parameter");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPhSubPropertyAccess().getRightParenthesisKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:1662:3: (otherlv_5= '.' ( (lv_property_6_0= RULE_ID ) ) )
                    {
                    // InternalMetaTemplating.g:1662:3: (otherlv_5= '.' ( (lv_property_6_0= RULE_ID ) ) )
                    // InternalMetaTemplating.g:1663:4: otherlv_5= '.' ( (lv_property_6_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getPhSubPropertyAccess().getFullStopKeyword_1_0());
                    			
                    // InternalMetaTemplating.g:1667:4: ( (lv_property_6_0= RULE_ID ) )
                    // InternalMetaTemplating.g:1668:5: (lv_property_6_0= RULE_ID )
                    {
                    // InternalMetaTemplating.g:1668:5: (lv_property_6_0= RULE_ID )
                    // InternalMetaTemplating.g:1669:6: lv_property_6_0= RULE_ID
                    {
                    lv_property_6_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_property_6_0, grammarAccess.getPhSubPropertyAccess().getPropertyIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPhSubPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"property",
                    							lv_property_6_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMetaTemplating.g:1687:3: (otherlv_7= '.{' ( (lv_metaProperty_8_0= ruleProperty ) ) otherlv_9= '}' )
                    {
                    // InternalMetaTemplating.g:1687:3: (otherlv_7= '.{' ( (lv_metaProperty_8_0= ruleProperty ) ) otherlv_9= '}' )
                    // InternalMetaTemplating.g:1688:4: otherlv_7= '.{' ( (lv_metaProperty_8_0= ruleProperty ) ) otherlv_9= '}'
                    {
                    otherlv_7=(Token)match(input,35,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getPhSubPropertyAccess().getFullStopLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalMetaTemplating.g:1692:4: ( (lv_metaProperty_8_0= ruleProperty ) )
                    // InternalMetaTemplating.g:1693:5: (lv_metaProperty_8_0= ruleProperty )
                    {
                    // InternalMetaTemplating.g:1693:5: (lv_metaProperty_8_0= ruleProperty )
                    // InternalMetaTemplating.g:1694:6: lv_metaProperty_8_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getPhSubPropertyAccess().getMetaPropertyPropertyParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_metaProperty_8_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPhSubPropertyRule());
                    						}
                    						set(
                    							current,
                    							"metaProperty",
                    							lv_metaProperty_8_0,
                    							"org.xtext.example.mydsl.MetaTemplating.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getPhSubPropertyAccess().getRightCurlyBracketKeyword_2_2());
                    			

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
    // $ANTLR end "rulePhSubProperty"


    // $ANTLR start "entryRuleParameter"
    // InternalMetaTemplating.g:1720:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalMetaTemplating.g:1720:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalMetaTemplating.g:1721:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalMetaTemplating.g:1727:1: ruleParameter returns [EObject current=null] : ( ( (lv_par_0_0= RULE_ID ) ) ( (lv_params_1_0= ruleSubParameter ) )* ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_par_0_0=null;
        EObject lv_params_1_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:1733:2: ( ( ( (lv_par_0_0= RULE_ID ) ) ( (lv_params_1_0= ruleSubParameter ) )* ) )
            // InternalMetaTemplating.g:1734:2: ( ( (lv_par_0_0= RULE_ID ) ) ( (lv_params_1_0= ruleSubParameter ) )* )
            {
            // InternalMetaTemplating.g:1734:2: ( ( (lv_par_0_0= RULE_ID ) ) ( (lv_params_1_0= ruleSubParameter ) )* )
            // InternalMetaTemplating.g:1735:3: ( (lv_par_0_0= RULE_ID ) ) ( (lv_params_1_0= ruleSubParameter ) )*
            {
            // InternalMetaTemplating.g:1735:3: ( (lv_par_0_0= RULE_ID ) )
            // InternalMetaTemplating.g:1736:4: (lv_par_0_0= RULE_ID )
            {
            // InternalMetaTemplating.g:1736:4: (lv_par_0_0= RULE_ID )
            // InternalMetaTemplating.g:1737:5: lv_par_0_0= RULE_ID
            {
            lv_par_0_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_par_0_0, grammarAccess.getParameterAccess().getParIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"par",
            						lv_par_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMetaTemplating.g:1753:3: ( (lv_params_1_0= ruleSubParameter ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==36) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMetaTemplating.g:1754:4: (lv_params_1_0= ruleSubParameter )
            	    {
            	    // InternalMetaTemplating.g:1754:4: (lv_params_1_0= ruleSubParameter )
            	    // InternalMetaTemplating.g:1755:5: lv_params_1_0= ruleSubParameter
            	    {

            	    					newCompositeNode(grammarAccess.getParameterAccess().getParamsSubParameterParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_params_1_0=ruleSubParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParameterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"params",
            	    						lv_params_1_0,
            	    						"org.xtext.example.mydsl.MetaTemplating.SubParameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleSubParameter"
    // InternalMetaTemplating.g:1776:1: entryRuleSubParameter returns [EObject current=null] : iv_ruleSubParameter= ruleSubParameter EOF ;
    public final EObject entryRuleSubParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubParameter = null;


        try {
            // InternalMetaTemplating.g:1776:53: (iv_ruleSubParameter= ruleSubParameter EOF )
            // InternalMetaTemplating.g:1777:2: iv_ruleSubParameter= ruleSubParameter EOF
            {
             newCompositeNode(grammarAccess.getSubParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubParameter=ruleSubParameter();

            state._fsp--;

             current =iv_ruleSubParameter; 
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
    // $ANTLR end "entryRuleSubParameter"


    // $ANTLR start "ruleSubParameter"
    // InternalMetaTemplating.g:1783:1: ruleSubParameter returns [EObject current=null] : (otherlv_0= ',' ( (lv_par_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSubParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_par_1_0=null;


        	enterRule();

        try {
            // InternalMetaTemplating.g:1789:2: ( (otherlv_0= ',' ( (lv_par_1_0= RULE_ID ) ) ) )
            // InternalMetaTemplating.g:1790:2: (otherlv_0= ',' ( (lv_par_1_0= RULE_ID ) ) )
            {
            // InternalMetaTemplating.g:1790:2: (otherlv_0= ',' ( (lv_par_1_0= RULE_ID ) ) )
            // InternalMetaTemplating.g:1791:3: otherlv_0= ',' ( (lv_par_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSubParameterAccess().getCommaKeyword_0());
            		
            // InternalMetaTemplating.g:1795:3: ( (lv_par_1_0= RULE_ID ) )
            // InternalMetaTemplating.g:1796:4: (lv_par_1_0= RULE_ID )
            {
            // InternalMetaTemplating.g:1796:4: (lv_par_1_0= RULE_ID )
            // InternalMetaTemplating.g:1797:5: lv_par_1_0= RULE_ID
            {
            lv_par_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_par_1_0, grammarAccess.getSubParameterAccess().getParIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"par",
            						lv_par_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleSubParameter"


    // $ANTLR start "entryRuleInject"
    // InternalMetaTemplating.g:1817:1: entryRuleInject returns [EObject current=null] : iv_ruleInject= ruleInject EOF ;
    public final EObject entryRuleInject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInject = null;


        try {
            // InternalMetaTemplating.g:1817:47: (iv_ruleInject= ruleInject EOF )
            // InternalMetaTemplating.g:1818:2: iv_ruleInject= ruleInject EOF
            {
             newCompositeNode(grammarAccess.getInjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInject=ruleInject();

            state._fsp--;

             current =iv_ruleInject; 
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
    // $ANTLR end "entryRuleInject"


    // $ANTLR start "ruleInject"
    // InternalMetaTemplating.g:1824:1: ruleInject returns [EObject current=null] : (otherlv_0= '@[[' ( (lv_code_1_0= RULE_STRING ) ) otherlv_2= ']]@' ) ;
    public final EObject ruleInject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_code_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMetaTemplating.g:1830:2: ( (otherlv_0= '@[[' ( (lv_code_1_0= RULE_STRING ) ) otherlv_2= ']]@' ) )
            // InternalMetaTemplating.g:1831:2: (otherlv_0= '@[[' ( (lv_code_1_0= RULE_STRING ) ) otherlv_2= ']]@' )
            {
            // InternalMetaTemplating.g:1831:2: (otherlv_0= '@[[' ( (lv_code_1_0= RULE_STRING ) ) otherlv_2= ']]@' )
            // InternalMetaTemplating.g:1832:3: otherlv_0= '@[[' ( (lv_code_1_0= RULE_STRING ) ) otherlv_2= ']]@'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getInjectAccess().getCommercialAtLeftSquareBracketLeftSquareBracketKeyword_0());
            		
            // InternalMetaTemplating.g:1836:3: ( (lv_code_1_0= RULE_STRING ) )
            // InternalMetaTemplating.g:1837:4: (lv_code_1_0= RULE_STRING )
            {
            // InternalMetaTemplating.g:1837:4: (lv_code_1_0= RULE_STRING )
            // InternalMetaTemplating.g:1838:5: lv_code_1_0= RULE_STRING
            {
            lv_code_1_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_code_1_0, grammarAccess.getInjectAccess().getCodeSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"code",
            						lv_code_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getInjectAccess().getRightSquareBracketRightSquareBracketCommercialAtKeyword_2());
            		

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
    // $ANTLR end "ruleInject"


    // $ANTLR start "entryRuleMetaInject"
    // InternalMetaTemplating.g:1862:1: entryRuleMetaInject returns [EObject current=null] : iv_ruleMetaInject= ruleMetaInject EOF ;
    public final EObject entryRuleMetaInject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaInject = null;


        try {
            // InternalMetaTemplating.g:1862:51: (iv_ruleMetaInject= ruleMetaInject EOF )
            // InternalMetaTemplating.g:1863:2: iv_ruleMetaInject= ruleMetaInject EOF
            {
             newCompositeNode(grammarAccess.getMetaInjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetaInject=ruleMetaInject();

            state._fsp--;

             current =iv_ruleMetaInject; 
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
    // $ANTLR end "entryRuleMetaInject"


    // $ANTLR start "ruleMetaInject"
    // InternalMetaTemplating.g:1869:1: ruleMetaInject returns [EObject current=null] : (otherlv_0= '@[' ( (lv_code_1_0= RULE_STRING ) ) otherlv_2= ']@' ) ;
    public final EObject ruleMetaInject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_code_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMetaTemplating.g:1875:2: ( (otherlv_0= '@[' ( (lv_code_1_0= RULE_STRING ) ) otherlv_2= ']@' ) )
            // InternalMetaTemplating.g:1876:2: (otherlv_0= '@[' ( (lv_code_1_0= RULE_STRING ) ) otherlv_2= ']@' )
            {
            // InternalMetaTemplating.g:1876:2: (otherlv_0= '@[' ( (lv_code_1_0= RULE_STRING ) ) otherlv_2= ']@' )
            // InternalMetaTemplating.g:1877:3: otherlv_0= '@[' ( (lv_code_1_0= RULE_STRING ) ) otherlv_2= ']@'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMetaInjectAccess().getCommercialAtLeftSquareBracketKeyword_0());
            		
            // InternalMetaTemplating.g:1881:3: ( (lv_code_1_0= RULE_STRING ) )
            // InternalMetaTemplating.g:1882:4: (lv_code_1_0= RULE_STRING )
            {
            // InternalMetaTemplating.g:1882:4: (lv_code_1_0= RULE_STRING )
            // InternalMetaTemplating.g:1883:5: lv_code_1_0= RULE_STRING
            {
            lv_code_1_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

            					newLeafNode(lv_code_1_0, grammarAccess.getMetaInjectAccess().getCodeSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetaInjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"code",
            						lv_code_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getMetaInjectAccess().getRightSquareBracketCommercialAtKeyword_2());
            		

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
    // $ANTLR end "ruleMetaInject"


    // $ANTLR start "entryRuleEscapedString"
    // InternalMetaTemplating.g:1907:1: entryRuleEscapedString returns [EObject current=null] : iv_ruleEscapedString= ruleEscapedString EOF ;
    public final EObject entryRuleEscapedString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscapedString = null;


        try {
            // InternalMetaTemplating.g:1907:54: (iv_ruleEscapedString= ruleEscapedString EOF )
            // InternalMetaTemplating.g:1908:2: iv_ruleEscapedString= ruleEscapedString EOF
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
    // InternalMetaTemplating.g:1914:1: ruleEscapedString returns [EObject current=null] : (otherlv_0= '@{' ( (lv_str_1_0= RULE_STRING ) ) otherlv_2= '}@' ) ;
    public final EObject ruleEscapedString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_str_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMetaTemplating.g:1920:2: ( (otherlv_0= '@{' ( (lv_str_1_0= RULE_STRING ) ) otherlv_2= '}@' ) )
            // InternalMetaTemplating.g:1921:2: (otherlv_0= '@{' ( (lv_str_1_0= RULE_STRING ) ) otherlv_2= '}@' )
            {
            // InternalMetaTemplating.g:1921:2: (otherlv_0= '@{' ( (lv_str_1_0= RULE_STRING ) ) otherlv_2= '}@' )
            // InternalMetaTemplating.g:1922:3: otherlv_0= '@{' ( (lv_str_1_0= RULE_STRING ) ) otherlv_2= '}@'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getEscapedStringAccess().getCommercialAtLeftCurlyBracketKeyword_0());
            		
            // InternalMetaTemplating.g:1926:3: ( (lv_str_1_0= RULE_STRING ) )
            // InternalMetaTemplating.g:1927:4: (lv_str_1_0= RULE_STRING )
            {
            // InternalMetaTemplating.g:1927:4: (lv_str_1_0= RULE_STRING )
            // InternalMetaTemplating.g:1928:5: lv_str_1_0= RULE_STRING
            {
            lv_str_1_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

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

            otherlv_2=(Token)match(input,42,FOLLOW_2); 

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
    // InternalMetaTemplating.g:1952:1: entryRuleEscaped returns [EObject current=null] : iv_ruleEscaped= ruleEscaped EOF ;
    public final EObject entryRuleEscaped() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscaped = null;


        try {
            // InternalMetaTemplating.g:1952:48: (iv_ruleEscaped= ruleEscaped EOF )
            // InternalMetaTemplating.g:1953:2: iv_ruleEscaped= ruleEscaped EOF
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
    // InternalMetaTemplating.g:1959:1: ruleEscaped returns [EObject current=null] : (otherlv_0= '#' ( ( (lv_char_1_1= 'n' | lv_char_1_2= 's' | lv_char_1_3= 't' | lv_char_1_4= '#' | lv_char_1_5= '{' | lv_char_1_6= '}' | lv_char_1_7= '[' | lv_char_1_8= ']' | lv_char_1_9= ',' | lv_char_1_10= '.' | lv_char_1_11= ';' | lv_char_1_12= '(' | lv_char_1_13= ')' | lv_char_1_14= ':' | lv_char_1_15= '<' | lv_char_1_16= '>' | lv_char_1_17= '\\'' ) ) ) ) ;
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
        Token lv_char_1_14=null;
        Token lv_char_1_15=null;
        Token lv_char_1_16=null;
        Token lv_char_1_17=null;


        	enterRule();

        try {
            // InternalMetaTemplating.g:1965:2: ( (otherlv_0= '#' ( ( (lv_char_1_1= 'n' | lv_char_1_2= 's' | lv_char_1_3= 't' | lv_char_1_4= '#' | lv_char_1_5= '{' | lv_char_1_6= '}' | lv_char_1_7= '[' | lv_char_1_8= ']' | lv_char_1_9= ',' | lv_char_1_10= '.' | lv_char_1_11= ';' | lv_char_1_12= '(' | lv_char_1_13= ')' | lv_char_1_14= ':' | lv_char_1_15= '<' | lv_char_1_16= '>' | lv_char_1_17= '\\'' ) ) ) ) )
            // InternalMetaTemplating.g:1966:2: (otherlv_0= '#' ( ( (lv_char_1_1= 'n' | lv_char_1_2= 's' | lv_char_1_3= 't' | lv_char_1_4= '#' | lv_char_1_5= '{' | lv_char_1_6= '}' | lv_char_1_7= '[' | lv_char_1_8= ']' | lv_char_1_9= ',' | lv_char_1_10= '.' | lv_char_1_11= ';' | lv_char_1_12= '(' | lv_char_1_13= ')' | lv_char_1_14= ':' | lv_char_1_15= '<' | lv_char_1_16= '>' | lv_char_1_17= '\\'' ) ) ) )
            {
            // InternalMetaTemplating.g:1966:2: (otherlv_0= '#' ( ( (lv_char_1_1= 'n' | lv_char_1_2= 's' | lv_char_1_3= 't' | lv_char_1_4= '#' | lv_char_1_5= '{' | lv_char_1_6= '}' | lv_char_1_7= '[' | lv_char_1_8= ']' | lv_char_1_9= ',' | lv_char_1_10= '.' | lv_char_1_11= ';' | lv_char_1_12= '(' | lv_char_1_13= ')' | lv_char_1_14= ':' | lv_char_1_15= '<' | lv_char_1_16= '>' | lv_char_1_17= '\\'' ) ) ) )
            // InternalMetaTemplating.g:1967:3: otherlv_0= '#' ( ( (lv_char_1_1= 'n' | lv_char_1_2= 's' | lv_char_1_3= 't' | lv_char_1_4= '#' | lv_char_1_5= '{' | lv_char_1_6= '}' | lv_char_1_7= '[' | lv_char_1_8= ']' | lv_char_1_9= ',' | lv_char_1_10= '.' | lv_char_1_11= ';' | lv_char_1_12= '(' | lv_char_1_13= ')' | lv_char_1_14= ':' | lv_char_1_15= '<' | lv_char_1_16= '>' | lv_char_1_17= '\\'' ) ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getEscapedAccess().getNumberSignKeyword_0());
            		
            // InternalMetaTemplating.g:1971:3: ( ( (lv_char_1_1= 'n' | lv_char_1_2= 's' | lv_char_1_3= 't' | lv_char_1_4= '#' | lv_char_1_5= '{' | lv_char_1_6= '}' | lv_char_1_7= '[' | lv_char_1_8= ']' | lv_char_1_9= ',' | lv_char_1_10= '.' | lv_char_1_11= ';' | lv_char_1_12= '(' | lv_char_1_13= ')' | lv_char_1_14= ':' | lv_char_1_15= '<' | lv_char_1_16= '>' | lv_char_1_17= '\\'' ) ) )
            // InternalMetaTemplating.g:1972:4: ( (lv_char_1_1= 'n' | lv_char_1_2= 's' | lv_char_1_3= 't' | lv_char_1_4= '#' | lv_char_1_5= '{' | lv_char_1_6= '}' | lv_char_1_7= '[' | lv_char_1_8= ']' | lv_char_1_9= ',' | lv_char_1_10= '.' | lv_char_1_11= ';' | lv_char_1_12= '(' | lv_char_1_13= ')' | lv_char_1_14= ':' | lv_char_1_15= '<' | lv_char_1_16= '>' | lv_char_1_17= '\\'' ) )
            {
            // InternalMetaTemplating.g:1972:4: ( (lv_char_1_1= 'n' | lv_char_1_2= 's' | lv_char_1_3= 't' | lv_char_1_4= '#' | lv_char_1_5= '{' | lv_char_1_6= '}' | lv_char_1_7= '[' | lv_char_1_8= ']' | lv_char_1_9= ',' | lv_char_1_10= '.' | lv_char_1_11= ';' | lv_char_1_12= '(' | lv_char_1_13= ')' | lv_char_1_14= ':' | lv_char_1_15= '<' | lv_char_1_16= '>' | lv_char_1_17= '\\'' ) )
            // InternalMetaTemplating.g:1973:5: (lv_char_1_1= 'n' | lv_char_1_2= 's' | lv_char_1_3= 't' | lv_char_1_4= '#' | lv_char_1_5= '{' | lv_char_1_6= '}' | lv_char_1_7= '[' | lv_char_1_8= ']' | lv_char_1_9= ',' | lv_char_1_10= '.' | lv_char_1_11= ';' | lv_char_1_12= '(' | lv_char_1_13= ')' | lv_char_1_14= ':' | lv_char_1_15= '<' | lv_char_1_16= '>' | lv_char_1_17= '\\'' )
            {
            // InternalMetaTemplating.g:1973:5: (lv_char_1_1= 'n' | lv_char_1_2= 's' | lv_char_1_3= 't' | lv_char_1_4= '#' | lv_char_1_5= '{' | lv_char_1_6= '}' | lv_char_1_7= '[' | lv_char_1_8= ']' | lv_char_1_9= ',' | lv_char_1_10= '.' | lv_char_1_11= ';' | lv_char_1_12= '(' | lv_char_1_13= ')' | lv_char_1_14= ':' | lv_char_1_15= '<' | lv_char_1_16= '>' | lv_char_1_17= '\\'' )
            int alt29=17;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt29=1;
                }
                break;
            case 45:
                {
                alt29=2;
                }
                break;
            case 46:
                {
                alt29=3;
                }
                break;
            case 43:
                {
                alt29=4;
                }
                break;
            case 19:
                {
                alt29=5;
                }
                break;
            case 20:
                {
                alt29=6;
                }
                break;
            case 32:
                {
                alt29=7;
                }
                break;
            case 34:
                {
                alt29=8;
                }
                break;
            case 36:
                {
                alt29=9;
                }
                break;
            case 27:
                {
                alt29=10;
                }
                break;
            case 12:
                {
                alt29=11;
                }
                break;
            case 17:
                {
                alt29=12;
                }
                break;
            case 18:
                {
                alt29=13;
                }
                break;
            case 25:
                {
                alt29=14;
                }
                break;
            case 47:
                {
                alt29=15;
                }
                break;
            case 48:
                {
                alt29=16;
                }
                break;
            case 49:
                {
                alt29=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalMetaTemplating.g:1974:6: lv_char_1_1= 'n'
                    {
                    lv_char_1_1=(Token)match(input,44,FOLLOW_2); 

                    						newLeafNode(lv_char_1_1, grammarAccess.getEscapedAccess().getCharNKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:1985:6: lv_char_1_2= 's'
                    {
                    lv_char_1_2=(Token)match(input,45,FOLLOW_2); 

                    						newLeafNode(lv_char_1_2, grammarAccess.getEscapedAccess().getCharSKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalMetaTemplating.g:1996:6: lv_char_1_3= 't'
                    {
                    lv_char_1_3=(Token)match(input,46,FOLLOW_2); 

                    						newLeafNode(lv_char_1_3, grammarAccess.getEscapedAccess().getCharTKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalMetaTemplating.g:2007:6: lv_char_1_4= '#'
                    {
                    lv_char_1_4=(Token)match(input,43,FOLLOW_2); 

                    						newLeafNode(lv_char_1_4, grammarAccess.getEscapedAccess().getCharNumberSignKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalMetaTemplating.g:2018:6: lv_char_1_5= '{'
                    {
                    lv_char_1_5=(Token)match(input,19,FOLLOW_2); 

                    						newLeafNode(lv_char_1_5, grammarAccess.getEscapedAccess().getCharLeftCurlyBracketKeyword_1_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalMetaTemplating.g:2029:6: lv_char_1_6= '}'
                    {
                    lv_char_1_6=(Token)match(input,20,FOLLOW_2); 

                    						newLeafNode(lv_char_1_6, grammarAccess.getEscapedAccess().getCharRightCurlyBracketKeyword_1_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_6, null);
                    					

                    }
                    break;
                case 7 :
                    // InternalMetaTemplating.g:2040:6: lv_char_1_7= '['
                    {
                    lv_char_1_7=(Token)match(input,32,FOLLOW_2); 

                    						newLeafNode(lv_char_1_7, grammarAccess.getEscapedAccess().getCharLeftSquareBracketKeyword_1_0_6());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_7, null);
                    					

                    }
                    break;
                case 8 :
                    // InternalMetaTemplating.g:2051:6: lv_char_1_8= ']'
                    {
                    lv_char_1_8=(Token)match(input,34,FOLLOW_2); 

                    						newLeafNode(lv_char_1_8, grammarAccess.getEscapedAccess().getCharRightSquareBracketKeyword_1_0_7());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_8, null);
                    					

                    }
                    break;
                case 9 :
                    // InternalMetaTemplating.g:2062:6: lv_char_1_9= ','
                    {
                    lv_char_1_9=(Token)match(input,36,FOLLOW_2); 

                    						newLeafNode(lv_char_1_9, grammarAccess.getEscapedAccess().getCharCommaKeyword_1_0_8());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_9, null);
                    					

                    }
                    break;
                case 10 :
                    // InternalMetaTemplating.g:2073:6: lv_char_1_10= '.'
                    {
                    lv_char_1_10=(Token)match(input,27,FOLLOW_2); 

                    						newLeafNode(lv_char_1_10, grammarAccess.getEscapedAccess().getCharFullStopKeyword_1_0_9());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_10, null);
                    					

                    }
                    break;
                case 11 :
                    // InternalMetaTemplating.g:2084:6: lv_char_1_11= ';'
                    {
                    lv_char_1_11=(Token)match(input,12,FOLLOW_2); 

                    						newLeafNode(lv_char_1_11, grammarAccess.getEscapedAccess().getCharSemicolonKeyword_1_0_10());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_11, null);
                    					

                    }
                    break;
                case 12 :
                    // InternalMetaTemplating.g:2095:6: lv_char_1_12= '('
                    {
                    lv_char_1_12=(Token)match(input,17,FOLLOW_2); 

                    						newLeafNode(lv_char_1_12, grammarAccess.getEscapedAccess().getCharLeftParenthesisKeyword_1_0_11());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_12, null);
                    					

                    }
                    break;
                case 13 :
                    // InternalMetaTemplating.g:2106:6: lv_char_1_13= ')'
                    {
                    lv_char_1_13=(Token)match(input,18,FOLLOW_2); 

                    						newLeafNode(lv_char_1_13, grammarAccess.getEscapedAccess().getCharRightParenthesisKeyword_1_0_12());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_13, null);
                    					

                    }
                    break;
                case 14 :
                    // InternalMetaTemplating.g:2117:6: lv_char_1_14= ':'
                    {
                    lv_char_1_14=(Token)match(input,25,FOLLOW_2); 

                    						newLeafNode(lv_char_1_14, grammarAccess.getEscapedAccess().getCharColonKeyword_1_0_13());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_14, null);
                    					

                    }
                    break;
                case 15 :
                    // InternalMetaTemplating.g:2128:6: lv_char_1_15= '<'
                    {
                    lv_char_1_15=(Token)match(input,47,FOLLOW_2); 

                    						newLeafNode(lv_char_1_15, grammarAccess.getEscapedAccess().getCharLessThanSignKeyword_1_0_14());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_15, null);
                    					

                    }
                    break;
                case 16 :
                    // InternalMetaTemplating.g:2139:6: lv_char_1_16= '>'
                    {
                    lv_char_1_16=(Token)match(input,48,FOLLOW_2); 

                    						newLeafNode(lv_char_1_16, grammarAccess.getEscapedAccess().getCharGreaterThanSignKeyword_1_0_15());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_16, null);
                    					

                    }
                    break;
                case 17 :
                    // InternalMetaTemplating.g:2150:6: lv_char_1_17= '\\''
                    {
                    lv_char_1_17=(Token)match(input,49,FOLLOW_2); 

                    						newLeafNode(lv_char_1_17, grammarAccess.getEscapedAccess().getCharApostropheKeyword_1_0_16());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_17, null);
                    					

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


    protected DFA23 dfa23 = new DFA23(this);
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\2\uffff\1\4\6\uffff\1\4\7\uffff";
    static final String dfa_3s = "\1\33\1\5\1\21\1\5\2\uffff\1\33\2\5\2\21\1\42\1\5\1\22\1\33\1\5\1\22";
    static final String dfa_4s = "\1\33\1\40\1\33\1\5\2\uffff\1\42\2\5\1\33\2\42\1\22\1\44\1\42\1\5\1\44";
    static final String dfa_5s = "\4\uffff\1\2\1\1\13\uffff";
    static final String dfa_6s = "\21\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2\32\uffff\1\3",
            "\1\5\1\4\10\uffff\1\4",
            "\1\6",
            "",
            "",
            "\1\7\5\uffff\1\10\1\11",
            "\1\12",
            "\1\13",
            "\1\5\1\4\10\uffff\1\4",
            "\1\14\11\uffff\1\7\5\uffff\1\10\1\11",
            "\1\11",
            "\1\15\14\uffff\1\16",
            "\1\16\21\uffff\1\17",
            "\1\7\5\uffff\1\10\1\11",
            "\1\20",
            "\1\16\21\uffff\1\17"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1298:2: ( (otherlv_0= '.' ( ( (lv_methItem_1_0= RULE_ID ) ) | ( (lv_methRef_2_0= ruleMetaPh ) ) ) otherlv_3= '(' ( (lv_params_4_0= ruleParameter ) )? otherlv_5= ')' ) | (otherlv_6= '.' ( ( (lv_item_7_0= RULE_ID ) ) | ( (lv_ref_8_0= ruleMetaPh ) ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000AA151414022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000AA151514020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000AA140000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000808000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0003F8150A1E1000L});

}