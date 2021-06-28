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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'IMPORT'", "'#*'", "'*#'", "'IF'", "'('", "')'", "'{'", "'}'", "'ELSE'", "'if'", "'else'", "'FORALL'", "':'", "'TAGGED'", "'foreach'", "'in'", "'.'", "'()'", "'[['", "']]'", "'['", "'TAGINFO'", "']'", "'.{'", "'@{'", "'}@'", "'#'", "'n'", "'s'", "'t'", "','", "'<'", "'>'", "'\\''"
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
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
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

                if ( (LA1_0==RULE_ID||LA1_0==14||LA1_0==16||LA1_0==22||LA1_0==24||LA1_0==27||LA1_0==31||LA1_0==33||LA1_0==37||LA1_0==39) ) {
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
            case 31:
            case 33:
            case 37:
            case 39:
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
            case 27:
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
    // InternalMetaTemplating.g:465:1: ruleStatement returns [EObject current=null] : ( ( (lv_text_0_0= RULE_ID ) ) | ( (lv_char_1_0= ruleEscaped ) ) | ( (lv_string_2_0= ruleEscapedString ) ) | ( (lv_placeholder_3_0= rulePh ) ) | ( (lv_metaPlaceholder_4_0= ruleMetaPh ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;
        EObject lv_char_1_0 = null;

        EObject lv_string_2_0 = null;

        EObject lv_placeholder_3_0 = null;

        EObject lv_metaPlaceholder_4_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:471:2: ( ( ( (lv_text_0_0= RULE_ID ) ) | ( (lv_char_1_0= ruleEscaped ) ) | ( (lv_string_2_0= ruleEscapedString ) ) | ( (lv_placeholder_3_0= rulePh ) ) | ( (lv_metaPlaceholder_4_0= ruleMetaPh ) ) ) )
            // InternalMetaTemplating.g:472:2: ( ( (lv_text_0_0= RULE_ID ) ) | ( (lv_char_1_0= ruleEscaped ) ) | ( (lv_string_2_0= ruleEscapedString ) ) | ( (lv_placeholder_3_0= rulePh ) ) | ( (lv_metaPlaceholder_4_0= ruleMetaPh ) ) )
            {
            // InternalMetaTemplating.g:472:2: ( ( (lv_text_0_0= RULE_ID ) ) | ( (lv_char_1_0= ruleEscaped ) ) | ( (lv_string_2_0= ruleEscapedString ) ) | ( (lv_placeholder_3_0= rulePh ) ) | ( (lv_metaPlaceholder_4_0= ruleMetaPh ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 39:
                {
                alt6=2;
                }
                break;
            case 37:
                {
                alt6=3;
                }
                break;
            case 31:
                {
                alt6=4;
                }
                break;
            case 33:
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
                    // InternalMetaTemplating.g:532:3: ( (lv_placeholder_3_0= rulePh ) )
                    {
                    // InternalMetaTemplating.g:532:3: ( (lv_placeholder_3_0= rulePh ) )
                    // InternalMetaTemplating.g:533:4: (lv_placeholder_3_0= rulePh )
                    {
                    // InternalMetaTemplating.g:533:4: (lv_placeholder_3_0= rulePh )
                    // InternalMetaTemplating.g:534:5: lv_placeholder_3_0= rulePh
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
                    // InternalMetaTemplating.g:552:3: ( (lv_metaPlaceholder_4_0= ruleMetaPh ) )
                    {
                    // InternalMetaTemplating.g:552:3: ( (lv_metaPlaceholder_4_0= ruleMetaPh ) )
                    // InternalMetaTemplating.g:553:4: (lv_metaPlaceholder_4_0= ruleMetaPh )
                    {
                    // InternalMetaTemplating.g:553:4: (lv_metaPlaceholder_4_0= ruleMetaPh )
                    // InternalMetaTemplating.g:554:5: lv_metaPlaceholder_4_0= ruleMetaPh
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


    // $ANTLR start "entryRuleMetaFilter"
    // InternalMetaTemplating.g:575:1: entryRuleMetaFilter returns [EObject current=null] : iv_ruleMetaFilter= ruleMetaFilter EOF ;
    public final EObject entryRuleMetaFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaFilter = null;


        try {
            // InternalMetaTemplating.g:575:51: (iv_ruleMetaFilter= ruleMetaFilter EOF )
            // InternalMetaTemplating.g:576:2: iv_ruleMetaFilter= ruleMetaFilter EOF
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
    // InternalMetaTemplating.g:582:1: ruleMetaFilter returns [EObject current=null] : (otherlv_0= 'IF' otherlv_1= '(' ( (lv_condition_2_0= ruleProperty ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_truebody_5_0= ruleInstructions ) )* otherlv_6= '}' (otherlv_7= 'ELSE' otherlv_8= '{' ( (lv_falsebody_9_0= ruleInstructions ) )* otherlv_10= '}' )? ) ;
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
            // InternalMetaTemplating.g:588:2: ( (otherlv_0= 'IF' otherlv_1= '(' ( (lv_condition_2_0= ruleProperty ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_truebody_5_0= ruleInstructions ) )* otherlv_6= '}' (otherlv_7= 'ELSE' otherlv_8= '{' ( (lv_falsebody_9_0= ruleInstructions ) )* otherlv_10= '}' )? ) )
            // InternalMetaTemplating.g:589:2: (otherlv_0= 'IF' otherlv_1= '(' ( (lv_condition_2_0= ruleProperty ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_truebody_5_0= ruleInstructions ) )* otherlv_6= '}' (otherlv_7= 'ELSE' otherlv_8= '{' ( (lv_falsebody_9_0= ruleInstructions ) )* otherlv_10= '}' )? )
            {
            // InternalMetaTemplating.g:589:2: (otherlv_0= 'IF' otherlv_1= '(' ( (lv_condition_2_0= ruleProperty ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_truebody_5_0= ruleInstructions ) )* otherlv_6= '}' (otherlv_7= 'ELSE' otherlv_8= '{' ( (lv_falsebody_9_0= ruleInstructions ) )* otherlv_10= '}' )? )
            // InternalMetaTemplating.g:590:3: otherlv_0= 'IF' otherlv_1= '(' ( (lv_condition_2_0= ruleProperty ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_truebody_5_0= ruleInstructions ) )* otherlv_6= '}' (otherlv_7= 'ELSE' otherlv_8= '{' ( (lv_falsebody_9_0= ruleInstructions ) )* otherlv_10= '}' )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getMetaFilterAccess().getIFKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getMetaFilterAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMetaTemplating.g:598:3: ( (lv_condition_2_0= ruleProperty ) )
            // InternalMetaTemplating.g:599:4: (lv_condition_2_0= ruleProperty )
            {
            // InternalMetaTemplating.g:599:4: (lv_condition_2_0= ruleProperty )
            // InternalMetaTemplating.g:600:5: lv_condition_2_0= ruleProperty
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
            		
            // InternalMetaTemplating.g:625:3: ( (lv_truebody_5_0= ruleInstructions ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==14||LA7_0==16||LA7_0==22||LA7_0==24||LA7_0==27||LA7_0==31||LA7_0==33||LA7_0==37||LA7_0==39) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMetaTemplating.g:626:4: (lv_truebody_5_0= ruleInstructions )
            	    {
            	    // InternalMetaTemplating.g:626:4: (lv_truebody_5_0= ruleInstructions )
            	    // InternalMetaTemplating.g:627:5: lv_truebody_5_0= ruleInstructions
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
            		
            // InternalMetaTemplating.g:648:3: (otherlv_7= 'ELSE' otherlv_8= '{' ( (lv_falsebody_9_0= ruleInstructions ) )* otherlv_10= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMetaTemplating.g:649:4: otherlv_7= 'ELSE' otherlv_8= '{' ( (lv_falsebody_9_0= ruleInstructions ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getMetaFilterAccess().getELSEKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getMetaFilterAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalMetaTemplating.g:657:4: ( (lv_falsebody_9_0= ruleInstructions ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID||LA8_0==14||LA8_0==16||LA8_0==22||LA8_0==24||LA8_0==27||LA8_0==31||LA8_0==33||LA8_0==37||LA8_0==39) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMetaTemplating.g:658:5: (lv_falsebody_9_0= ruleInstructions )
                    	    {
                    	    // InternalMetaTemplating.g:658:5: (lv_falsebody_9_0= ruleInstructions )
                    	    // InternalMetaTemplating.g:659:6: lv_falsebody_9_0= ruleInstructions
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
    // InternalMetaTemplating.g:685:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalMetaTemplating.g:685:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalMetaTemplating.g:686:2: iv_ruleFilter= ruleFilter EOF
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
    // InternalMetaTemplating.g:692:1: ruleFilter returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleQuery ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_truebody_5_0= ruleInstructions ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_falsebody_9_0= ruleInstructions ) )* otherlv_10= '}' )? ) ;
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
            // InternalMetaTemplating.g:698:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleQuery ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_truebody_5_0= ruleInstructions ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_falsebody_9_0= ruleInstructions ) )* otherlv_10= '}' )? ) )
            // InternalMetaTemplating.g:699:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleQuery ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_truebody_5_0= ruleInstructions ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_falsebody_9_0= ruleInstructions ) )* otherlv_10= '}' )? )
            {
            // InternalMetaTemplating.g:699:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleQuery ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_truebody_5_0= ruleInstructions ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_falsebody_9_0= ruleInstructions ) )* otherlv_10= '}' )? )
            // InternalMetaTemplating.g:700:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleQuery ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_truebody_5_0= ruleInstructions ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_falsebody_9_0= ruleInstructions ) )* otherlv_10= '}' )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getFilterAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getFilterAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMetaTemplating.g:708:3: ( (lv_condition_2_0= ruleQuery ) )
            // InternalMetaTemplating.g:709:4: (lv_condition_2_0= ruleQuery )
            {
            // InternalMetaTemplating.g:709:4: (lv_condition_2_0= ruleQuery )
            // InternalMetaTemplating.g:710:5: lv_condition_2_0= ruleQuery
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
            		
            // InternalMetaTemplating.g:735:3: ( (lv_truebody_5_0= ruleInstructions ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==14||LA10_0==16||LA10_0==22||LA10_0==24||LA10_0==27||LA10_0==31||LA10_0==33||LA10_0==37||LA10_0==39) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMetaTemplating.g:736:4: (lv_truebody_5_0= ruleInstructions )
            	    {
            	    // InternalMetaTemplating.g:736:4: (lv_truebody_5_0= ruleInstructions )
            	    // InternalMetaTemplating.g:737:5: lv_truebody_5_0= ruleInstructions
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
            		
            // InternalMetaTemplating.g:758:3: (otherlv_7= 'else' otherlv_8= '{' ( (lv_falsebody_9_0= ruleInstructions ) )* otherlv_10= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMetaTemplating.g:759:4: otherlv_7= 'else' otherlv_8= '{' ( (lv_falsebody_9_0= ruleInstructions ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getFilterAccess().getElseKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getFilterAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalMetaTemplating.g:767:4: ( (lv_falsebody_9_0= ruleInstructions ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID||LA11_0==14||LA11_0==16||LA11_0==22||LA11_0==24||LA11_0==27||LA11_0==31||LA11_0==33||LA11_0==37||LA11_0==39) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMetaTemplating.g:768:5: (lv_falsebody_9_0= ruleInstructions )
                    	    {
                    	    // InternalMetaTemplating.g:768:5: (lv_falsebody_9_0= ruleInstructions )
                    	    // InternalMetaTemplating.g:769:6: lv_falsebody_9_0= ruleInstructions
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
    // InternalMetaTemplating.g:795:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalMetaTemplating.g:795:45: (iv_ruleRule= ruleRule EOF )
            // InternalMetaTemplating.g:796:2: iv_ruleRule= ruleRule EOF
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
    // InternalMetaTemplating.g:802:1: ruleRule returns [EObject current=null] : (otherlv_0= 'FORALL' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_property_4_0= ruleProperty ) ) otherlv_5= 'TAGGED' ( (lv_tag_6_0= RULE_ID ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_body_9_0= ruleInstructions ) )* otherlv_10= '}' ) ;
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
            // InternalMetaTemplating.g:808:2: ( (otherlv_0= 'FORALL' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_property_4_0= ruleProperty ) ) otherlv_5= 'TAGGED' ( (lv_tag_6_0= RULE_ID ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_body_9_0= ruleInstructions ) )* otherlv_10= '}' ) )
            // InternalMetaTemplating.g:809:2: (otherlv_0= 'FORALL' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_property_4_0= ruleProperty ) ) otherlv_5= 'TAGGED' ( (lv_tag_6_0= RULE_ID ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_body_9_0= ruleInstructions ) )* otherlv_10= '}' )
            {
            // InternalMetaTemplating.g:809:2: (otherlv_0= 'FORALL' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_property_4_0= ruleProperty ) ) otherlv_5= 'TAGGED' ( (lv_tag_6_0= RULE_ID ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_body_9_0= ruleInstructions ) )* otherlv_10= '}' )
            // InternalMetaTemplating.g:810:3: otherlv_0= 'FORALL' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_property_4_0= ruleProperty ) ) otherlv_5= 'TAGGED' ( (lv_tag_6_0= RULE_ID ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_body_9_0= ruleInstructions ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getFORALLKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMetaTemplating.g:818:3: ( (lv_element_2_0= RULE_ID ) )
            // InternalMetaTemplating.g:819:4: (lv_element_2_0= RULE_ID )
            {
            // InternalMetaTemplating.g:819:4: (lv_element_2_0= RULE_ID )
            // InternalMetaTemplating.g:820:5: lv_element_2_0= RULE_ID
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
            		
            // InternalMetaTemplating.g:840:3: ( (lv_property_4_0= ruleProperty ) )
            // InternalMetaTemplating.g:841:4: (lv_property_4_0= ruleProperty )
            {
            // InternalMetaTemplating.g:841:4: (lv_property_4_0= ruleProperty )
            // InternalMetaTemplating.g:842:5: lv_property_4_0= ruleProperty
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
            		
            // InternalMetaTemplating.g:863:3: ( (lv_tag_6_0= RULE_ID ) )
            // InternalMetaTemplating.g:864:4: (lv_tag_6_0= RULE_ID )
            {
            // InternalMetaTemplating.g:864:4: (lv_tag_6_0= RULE_ID )
            // InternalMetaTemplating.g:865:5: lv_tag_6_0= RULE_ID
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
            		
            // InternalMetaTemplating.g:889:3: ( (lv_body_9_0= ruleInstructions ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==14||LA13_0==16||LA13_0==22||LA13_0==24||LA13_0==27||LA13_0==31||LA13_0==33||LA13_0==37||LA13_0==39) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMetaTemplating.g:890:4: (lv_body_9_0= ruleInstructions )
            	    {
            	    // InternalMetaTemplating.g:890:4: (lv_body_9_0= ruleInstructions )
            	    // InternalMetaTemplating.g:891:5: lv_body_9_0= ruleInstructions
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


    // $ANTLR start "entryRuleIterator"
    // InternalMetaTemplating.g:916:1: entryRuleIterator returns [EObject current=null] : iv_ruleIterator= ruleIterator EOF ;
    public final EObject entryRuleIterator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterator = null;


        try {
            // InternalMetaTemplating.g:916:49: (iv_ruleIterator= ruleIterator EOF )
            // InternalMetaTemplating.g:917:2: iv_ruleIterator= ruleIterator EOF
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
    // InternalMetaTemplating.g:923:1: ruleIterator returns [EObject current=null] : (otherlv_0= 'foreach' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= 'in' ( (lv_query_4_0= ruleQuery ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_body_7_0= ruleInstructions ) )* otherlv_8= '}' ) ;
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
            // InternalMetaTemplating.g:929:2: ( (otherlv_0= 'foreach' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= 'in' ( (lv_query_4_0= ruleQuery ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_body_7_0= ruleInstructions ) )* otherlv_8= '}' ) )
            // InternalMetaTemplating.g:930:2: (otherlv_0= 'foreach' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= 'in' ( (lv_query_4_0= ruleQuery ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_body_7_0= ruleInstructions ) )* otherlv_8= '}' )
            {
            // InternalMetaTemplating.g:930:2: (otherlv_0= 'foreach' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= 'in' ( (lv_query_4_0= ruleQuery ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_body_7_0= ruleInstructions ) )* otherlv_8= '}' )
            // InternalMetaTemplating.g:931:3: otherlv_0= 'foreach' otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= 'in' ( (lv_query_4_0= ruleQuery ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_body_7_0= ruleInstructions ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getIteratorAccess().getForeachKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getIteratorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMetaTemplating.g:939:3: ( (lv_element_2_0= RULE_ID ) )
            // InternalMetaTemplating.g:940:4: (lv_element_2_0= RULE_ID )
            {
            // InternalMetaTemplating.g:940:4: (lv_element_2_0= RULE_ID )
            // InternalMetaTemplating.g:941:5: lv_element_2_0= RULE_ID
            {
            lv_element_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            otherlv_3=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getIteratorAccess().getInKeyword_3());
            		
            // InternalMetaTemplating.g:961:3: ( (lv_query_4_0= ruleQuery ) )
            // InternalMetaTemplating.g:962:4: (lv_query_4_0= ruleQuery )
            {
            // InternalMetaTemplating.g:962:4: (lv_query_4_0= ruleQuery )
            // InternalMetaTemplating.g:963:5: lv_query_4_0= ruleQuery
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
            		
            // InternalMetaTemplating.g:988:3: ( (lv_body_7_0= ruleInstructions ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==14||LA14_0==16||LA14_0==22||LA14_0==24||LA14_0==27||LA14_0==31||LA14_0==33||LA14_0==37||LA14_0==39) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMetaTemplating.g:989:4: (lv_body_7_0= ruleInstructions )
            	    {
            	    // InternalMetaTemplating.g:989:4: (lv_body_7_0= ruleInstructions )
            	    // InternalMetaTemplating.g:990:5: lv_body_7_0= ruleInstructions
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
            	    break loop14;
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
    // InternalMetaTemplating.g:1015:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalMetaTemplating.g:1015:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalMetaTemplating.g:1016:2: iv_ruleQuery= ruleQuery EOF
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
    // InternalMetaTemplating.g:1022:1: ruleQuery returns [EObject current=null] : ( ( ( (lv_item_0_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleMetaPh ) ) ) ( (lv_subQuery_2_0= ruleSubQuery ) )* ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token lv_item_0_0=null;
        EObject lv_ref_1_0 = null;

        EObject lv_subQuery_2_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:1028:2: ( ( ( ( (lv_item_0_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleMetaPh ) ) ) ( (lv_subQuery_2_0= ruleSubQuery ) )* ) )
            // InternalMetaTemplating.g:1029:2: ( ( ( (lv_item_0_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleMetaPh ) ) ) ( (lv_subQuery_2_0= ruleSubQuery ) )* )
            {
            // InternalMetaTemplating.g:1029:2: ( ( ( (lv_item_0_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleMetaPh ) ) ) ( (lv_subQuery_2_0= ruleSubQuery ) )* )
            // InternalMetaTemplating.g:1030:3: ( ( (lv_item_0_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleMetaPh ) ) ) ( (lv_subQuery_2_0= ruleSubQuery ) )*
            {
            // InternalMetaTemplating.g:1030:3: ( ( (lv_item_0_0= RULE_ID ) ) | ( (lv_ref_1_0= ruleMetaPh ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==33) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMetaTemplating.g:1031:4: ( (lv_item_0_0= RULE_ID ) )
                    {
                    // InternalMetaTemplating.g:1031:4: ( (lv_item_0_0= RULE_ID ) )
                    // InternalMetaTemplating.g:1032:5: (lv_item_0_0= RULE_ID )
                    {
                    // InternalMetaTemplating.g:1032:5: (lv_item_0_0= RULE_ID )
                    // InternalMetaTemplating.g:1033:6: lv_item_0_0= RULE_ID
                    {
                    lv_item_0_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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
                    // InternalMetaTemplating.g:1050:4: ( (lv_ref_1_0= ruleMetaPh ) )
                    {
                    // InternalMetaTemplating.g:1050:4: ( (lv_ref_1_0= ruleMetaPh ) )
                    // InternalMetaTemplating.g:1051:5: (lv_ref_1_0= ruleMetaPh )
                    {
                    // InternalMetaTemplating.g:1051:5: (lv_ref_1_0= ruleMetaPh )
                    // InternalMetaTemplating.g:1052:6: lv_ref_1_0= ruleMetaPh
                    {

                    						newCompositeNode(grammarAccess.getQueryAccess().getRefMetaPhParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_20);
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

            // InternalMetaTemplating.g:1070:3: ( (lv_subQuery_2_0= ruleSubQuery ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMetaTemplating.g:1071:4: (lv_subQuery_2_0= ruleSubQuery )
            	    {
            	    // InternalMetaTemplating.g:1071:4: (lv_subQuery_2_0= ruleSubQuery )
            	    // InternalMetaTemplating.g:1072:5: lv_subQuery_2_0= ruleSubQuery
            	    {

            	    					newCompositeNode(grammarAccess.getQueryAccess().getSubQuerySubQueryParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    break loop16;
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
    // InternalMetaTemplating.g:1093:1: entryRuleSubQuery returns [EObject current=null] : iv_ruleSubQuery= ruleSubQuery EOF ;
    public final EObject entryRuleSubQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubQuery = null;


        try {
            // InternalMetaTemplating.g:1093:49: (iv_ruleSubQuery= ruleSubQuery EOF )
            // InternalMetaTemplating.g:1094:2: iv_ruleSubQuery= ruleSubQuery EOF
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
    // InternalMetaTemplating.g:1100:1: ruleSubQuery returns [EObject current=null] : ( (otherlv_0= '.' ( ( (lv_methItem_1_0= RULE_ID ) ) | ( (lv_methRef_2_0= ruleMetaPh ) ) ) otherlv_3= '()' ) | (otherlv_4= '.' ( ( (lv_item_5_0= RULE_ID ) ) | ( (lv_ref_6_0= ruleMetaPh ) ) ) ) ) ;
    public final EObject ruleSubQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_methItem_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_item_5_0=null;
        EObject lv_methRef_2_0 = null;

        EObject lv_ref_6_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:1106:2: ( ( (otherlv_0= '.' ( ( (lv_methItem_1_0= RULE_ID ) ) | ( (lv_methRef_2_0= ruleMetaPh ) ) ) otherlv_3= '()' ) | (otherlv_4= '.' ( ( (lv_item_5_0= RULE_ID ) ) | ( (lv_ref_6_0= ruleMetaPh ) ) ) ) ) )
            // InternalMetaTemplating.g:1107:2: ( (otherlv_0= '.' ( ( (lv_methItem_1_0= RULE_ID ) ) | ( (lv_methRef_2_0= ruleMetaPh ) ) ) otherlv_3= '()' ) | (otherlv_4= '.' ( ( (lv_item_5_0= RULE_ID ) ) | ( (lv_ref_6_0= ruleMetaPh ) ) ) ) )
            {
            // InternalMetaTemplating.g:1107:2: ( (otherlv_0= '.' ( ( (lv_methItem_1_0= RULE_ID ) ) | ( (lv_methRef_2_0= ruleMetaPh ) ) ) otherlv_3= '()' ) | (otherlv_4= '.' ( ( (lv_item_5_0= RULE_ID ) ) | ( (lv_ref_6_0= ruleMetaPh ) ) ) ) )
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalMetaTemplating.g:1108:3: (otherlv_0= '.' ( ( (lv_methItem_1_0= RULE_ID ) ) | ( (lv_methRef_2_0= ruleMetaPh ) ) ) otherlv_3= '()' )
                    {
                    // InternalMetaTemplating.g:1108:3: (otherlv_0= '.' ( ( (lv_methItem_1_0= RULE_ID ) ) | ( (lv_methRef_2_0= ruleMetaPh ) ) ) otherlv_3= '()' )
                    // InternalMetaTemplating.g:1109:4: otherlv_0= '.' ( ( (lv_methItem_1_0= RULE_ID ) ) | ( (lv_methRef_2_0= ruleMetaPh ) ) ) otherlv_3= '()'
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_15); 

                    				newLeafNode(otherlv_0, grammarAccess.getSubQueryAccess().getFullStopKeyword_0_0());
                    			
                    // InternalMetaTemplating.g:1113:4: ( ( (lv_methItem_1_0= RULE_ID ) ) | ( (lv_methRef_2_0= ruleMetaPh ) ) )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_ID) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==33) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalMetaTemplating.g:1114:5: ( (lv_methItem_1_0= RULE_ID ) )
                            {
                            // InternalMetaTemplating.g:1114:5: ( (lv_methItem_1_0= RULE_ID ) )
                            // InternalMetaTemplating.g:1115:6: (lv_methItem_1_0= RULE_ID )
                            {
                            // InternalMetaTemplating.g:1115:6: (lv_methItem_1_0= RULE_ID )
                            // InternalMetaTemplating.g:1116:7: lv_methItem_1_0= RULE_ID
                            {
                            lv_methItem_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

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
                            // InternalMetaTemplating.g:1133:5: ( (lv_methRef_2_0= ruleMetaPh ) )
                            {
                            // InternalMetaTemplating.g:1133:5: ( (lv_methRef_2_0= ruleMetaPh ) )
                            // InternalMetaTemplating.g:1134:6: (lv_methRef_2_0= ruleMetaPh )
                            {
                            // InternalMetaTemplating.g:1134:6: (lv_methRef_2_0= ruleMetaPh )
                            // InternalMetaTemplating.g:1135:7: lv_methRef_2_0= ruleMetaPh
                            {

                            							newCompositeNode(grammarAccess.getSubQueryAccess().getMethRefMetaPhParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_21);
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

                    otherlv_3=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getSubQueryAccess().getLeftParenthesisRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:1159:3: (otherlv_4= '.' ( ( (lv_item_5_0= RULE_ID ) ) | ( (lv_ref_6_0= ruleMetaPh ) ) ) )
                    {
                    // InternalMetaTemplating.g:1159:3: (otherlv_4= '.' ( ( (lv_item_5_0= RULE_ID ) ) | ( (lv_ref_6_0= ruleMetaPh ) ) ) )
                    // InternalMetaTemplating.g:1160:4: otherlv_4= '.' ( ( (lv_item_5_0= RULE_ID ) ) | ( (lv_ref_6_0= ruleMetaPh ) ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getSubQueryAccess().getFullStopKeyword_1_0());
                    			
                    // InternalMetaTemplating.g:1164:4: ( ( (lv_item_5_0= RULE_ID ) ) | ( (lv_ref_6_0= ruleMetaPh ) ) )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_ID) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==33) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalMetaTemplating.g:1165:5: ( (lv_item_5_0= RULE_ID ) )
                            {
                            // InternalMetaTemplating.g:1165:5: ( (lv_item_5_0= RULE_ID ) )
                            // InternalMetaTemplating.g:1166:6: (lv_item_5_0= RULE_ID )
                            {
                            // InternalMetaTemplating.g:1166:6: (lv_item_5_0= RULE_ID )
                            // InternalMetaTemplating.g:1167:7: lv_item_5_0= RULE_ID
                            {
                            lv_item_5_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(lv_item_5_0, grammarAccess.getSubQueryAccess().getItemIDTerminalRuleCall_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSubQueryRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"item",
                            								lv_item_5_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMetaTemplating.g:1184:5: ( (lv_ref_6_0= ruleMetaPh ) )
                            {
                            // InternalMetaTemplating.g:1184:5: ( (lv_ref_6_0= ruleMetaPh ) )
                            // InternalMetaTemplating.g:1185:6: (lv_ref_6_0= ruleMetaPh )
                            {
                            // InternalMetaTemplating.g:1185:6: (lv_ref_6_0= ruleMetaPh )
                            // InternalMetaTemplating.g:1186:7: lv_ref_6_0= ruleMetaPh
                            {

                            							newCompositeNode(grammarAccess.getSubQueryAccess().getRefMetaPhParserRuleCall_1_1_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_ref_6_0=ruleMetaPh();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getSubQueryRule());
                            							}
                            							set(
                            								current,
                            								"ref",
                            								lv_ref_6_0,
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
    // InternalMetaTemplating.g:1209:1: entryRulePh returns [EObject current=null] : iv_rulePh= rulePh EOF ;
    public final EObject entryRulePh() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePh = null;


        try {
            // InternalMetaTemplating.g:1209:43: (iv_rulePh= rulePh EOF )
            // InternalMetaTemplating.g:1210:2: iv_rulePh= rulePh EOF
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
    // InternalMetaTemplating.g:1216:1: rulePh returns [EObject current=null] : (otherlv_0= '[[' ( (lv_property_1_0= ruleProperty ) ) ( (lv_metaProperty_2_0= ruleMetaProperty ) )? otherlv_3= ']]' ) ;
    public final EObject rulePh() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_property_1_0 = null;

        EObject lv_metaProperty_2_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:1222:2: ( (otherlv_0= '[[' ( (lv_property_1_0= ruleProperty ) ) ( (lv_metaProperty_2_0= ruleMetaProperty ) )? otherlv_3= ']]' ) )
            // InternalMetaTemplating.g:1223:2: (otherlv_0= '[[' ( (lv_property_1_0= ruleProperty ) ) ( (lv_metaProperty_2_0= ruleMetaProperty ) )? otherlv_3= ']]' )
            {
            // InternalMetaTemplating.g:1223:2: (otherlv_0= '[[' ( (lv_property_1_0= ruleProperty ) ) ( (lv_metaProperty_2_0= ruleMetaProperty ) )? otherlv_3= ']]' )
            // InternalMetaTemplating.g:1224:3: otherlv_0= '[[' ( (lv_property_1_0= ruleProperty ) ) ( (lv_metaProperty_2_0= ruleMetaProperty ) )? otherlv_3= ']]'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPhAccess().getLeftSquareBracketLeftSquareBracketKeyword_0());
            		
            // InternalMetaTemplating.g:1228:3: ( (lv_property_1_0= ruleProperty ) )
            // InternalMetaTemplating.g:1229:4: (lv_property_1_0= ruleProperty )
            {
            // InternalMetaTemplating.g:1229:4: (lv_property_1_0= ruleProperty )
            // InternalMetaTemplating.g:1230:5: lv_property_1_0= ruleProperty
            {

            					newCompositeNode(grammarAccess.getPhAccess().getPropertyPropertyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
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

            // InternalMetaTemplating.g:1247:3: ( (lv_metaProperty_2_0= ruleMetaProperty ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMetaTemplating.g:1248:4: (lv_metaProperty_2_0= ruleMetaProperty )
                    {
                    // InternalMetaTemplating.g:1248:4: (lv_metaProperty_2_0= ruleMetaProperty )
                    // InternalMetaTemplating.g:1249:5: lv_metaProperty_2_0= ruleMetaProperty
                    {

                    					newCompositeNode(grammarAccess.getPhAccess().getMetaPropertyMetaPropertyParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_23);
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

            otherlv_3=(Token)match(input,32,FOLLOW_2); 

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
    // InternalMetaTemplating.g:1274:1: entryRuleMetaPh returns [EObject current=null] : iv_ruleMetaPh= ruleMetaPh EOF ;
    public final EObject entryRuleMetaPh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaPh = null;


        try {
            // InternalMetaTemplating.g:1274:47: (iv_ruleMetaPh= ruleMetaPh EOF )
            // InternalMetaTemplating.g:1275:2: iv_ruleMetaPh= ruleMetaPh EOF
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
    // InternalMetaTemplating.g:1281:1: ruleMetaPh returns [EObject current=null] : (otherlv_0= '[' ( (lv_property_1_0= ruleProperty ) ) (otherlv_2= 'TAGINFO' ( (lv_tag_3_0= RULE_STRING ) ) )? otherlv_4= ']' ) ;
    public final EObject ruleMetaPh() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_tag_3_0=null;
        Token otherlv_4=null;
        EObject lv_property_1_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:1287:2: ( (otherlv_0= '[' ( (lv_property_1_0= ruleProperty ) ) (otherlv_2= 'TAGINFO' ( (lv_tag_3_0= RULE_STRING ) ) )? otherlv_4= ']' ) )
            // InternalMetaTemplating.g:1288:2: (otherlv_0= '[' ( (lv_property_1_0= ruleProperty ) ) (otherlv_2= 'TAGINFO' ( (lv_tag_3_0= RULE_STRING ) ) )? otherlv_4= ']' )
            {
            // InternalMetaTemplating.g:1288:2: (otherlv_0= '[' ( (lv_property_1_0= ruleProperty ) ) (otherlv_2= 'TAGINFO' ( (lv_tag_3_0= RULE_STRING ) ) )? otherlv_4= ']' )
            // InternalMetaTemplating.g:1289:3: otherlv_0= '[' ( (lv_property_1_0= ruleProperty ) ) (otherlv_2= 'TAGINFO' ( (lv_tag_3_0= RULE_STRING ) ) )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMetaPhAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalMetaTemplating.g:1293:3: ( (lv_property_1_0= ruleProperty ) )
            // InternalMetaTemplating.g:1294:4: (lv_property_1_0= ruleProperty )
            {
            // InternalMetaTemplating.g:1294:4: (lv_property_1_0= ruleProperty )
            // InternalMetaTemplating.g:1295:5: lv_property_1_0= ruleProperty
            {

            					newCompositeNode(grammarAccess.getMetaPhAccess().getPropertyPropertyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalMetaTemplating.g:1312:3: (otherlv_2= 'TAGINFO' ( (lv_tag_3_0= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMetaTemplating.g:1313:4: otherlv_2= 'TAGINFO' ( (lv_tag_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getMetaPhAccess().getTAGINFOKeyword_2_0());
                    			
                    // InternalMetaTemplating.g:1317:4: ( (lv_tag_3_0= RULE_STRING ) )
                    // InternalMetaTemplating.g:1318:5: (lv_tag_3_0= RULE_STRING )
                    {
                    // InternalMetaTemplating.g:1318:5: (lv_tag_3_0= RULE_STRING )
                    // InternalMetaTemplating.g:1319:6: lv_tag_3_0= RULE_STRING
                    {
                    lv_tag_3_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

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

            otherlv_4=(Token)match(input,35,FOLLOW_2); 

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
    // InternalMetaTemplating.g:1344:1: entryRuleMetaProperty returns [EObject current=null] : iv_ruleMetaProperty= ruleMetaProperty EOF ;
    public final EObject entryRuleMetaProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaProperty = null;


        try {
            // InternalMetaTemplating.g:1344:53: (iv_ruleMetaProperty= ruleMetaProperty EOF )
            // InternalMetaTemplating.g:1345:2: iv_ruleMetaProperty= ruleMetaProperty EOF
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
    // InternalMetaTemplating.g:1351:1: ruleMetaProperty returns [EObject current=null] : (otherlv_0= '.{' ( (lv_property_1_0= ruleProperty ) ) otherlv_2= '}' ) ;
    public final EObject ruleMetaProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_property_1_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:1357:2: ( (otherlv_0= '.{' ( (lv_property_1_0= ruleProperty ) ) otherlv_2= '}' ) )
            // InternalMetaTemplating.g:1358:2: (otherlv_0= '.{' ( (lv_property_1_0= ruleProperty ) ) otherlv_2= '}' )
            {
            // InternalMetaTemplating.g:1358:2: (otherlv_0= '.{' ( (lv_property_1_0= ruleProperty ) ) otherlv_2= '}' )
            // InternalMetaTemplating.g:1359:3: otherlv_0= '.{' ( (lv_property_1_0= ruleProperty ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMetaPropertyAccess().getFullStopLeftCurlyBracketKeyword_0());
            		
            // InternalMetaTemplating.g:1363:3: ( (lv_property_1_0= ruleProperty ) )
            // InternalMetaTemplating.g:1364:4: (lv_property_1_0= ruleProperty )
            {
            // InternalMetaTemplating.g:1364:4: (lv_property_1_0= ruleProperty )
            // InternalMetaTemplating.g:1365:5: lv_property_1_0= ruleProperty
            {

            					newCompositeNode(grammarAccess.getMetaPropertyAccess().getPropertyPropertyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_2=(Token)match(input,20,FOLLOW_2); 

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
    // InternalMetaTemplating.g:1390:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalMetaTemplating.g:1390:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalMetaTemplating.g:1391:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalMetaTemplating.g:1397:1: ruleProperty returns [EObject current=null] : ( ( (lv_property_0_0= RULE_ID ) ) ( (lv_subProperties_1_0= ruleSubProperty ) )* ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_property_0_0=null;
        EObject lv_subProperties_1_0 = null;



        	enterRule();

        try {
            // InternalMetaTemplating.g:1403:2: ( ( ( (lv_property_0_0= RULE_ID ) ) ( (lv_subProperties_1_0= ruleSubProperty ) )* ) )
            // InternalMetaTemplating.g:1404:2: ( ( (lv_property_0_0= RULE_ID ) ) ( (lv_subProperties_1_0= ruleSubProperty ) )* )
            {
            // InternalMetaTemplating.g:1404:2: ( ( (lv_property_0_0= RULE_ID ) ) ( (lv_subProperties_1_0= ruleSubProperty ) )* )
            // InternalMetaTemplating.g:1405:3: ( (lv_property_0_0= RULE_ID ) ) ( (lv_subProperties_1_0= ruleSubProperty ) )*
            {
            // InternalMetaTemplating.g:1405:3: ( (lv_property_0_0= RULE_ID ) )
            // InternalMetaTemplating.g:1406:4: (lv_property_0_0= RULE_ID )
            {
            // InternalMetaTemplating.g:1406:4: (lv_property_0_0= RULE_ID )
            // InternalMetaTemplating.g:1407:5: lv_property_0_0= RULE_ID
            {
            lv_property_0_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            // InternalMetaTemplating.g:1423:3: ( (lv_subProperties_1_0= ruleSubProperty ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==29) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMetaTemplating.g:1424:4: (lv_subProperties_1_0= ruleSubProperty )
            	    {
            	    // InternalMetaTemplating.g:1424:4: (lv_subProperties_1_0= ruleSubProperty )
            	    // InternalMetaTemplating.g:1425:5: lv_subProperties_1_0= ruleSubProperty
            	    {

            	    					newCompositeNode(grammarAccess.getPropertyAccess().getSubPropertiesSubPropertyParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    break loop22;
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
    // InternalMetaTemplating.g:1446:1: entryRuleSubProperty returns [EObject current=null] : iv_ruleSubProperty= ruleSubProperty EOF ;
    public final EObject entryRuleSubProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubProperty = null;


        try {
            // InternalMetaTemplating.g:1446:52: (iv_ruleSubProperty= ruleSubProperty EOF )
            // InternalMetaTemplating.g:1447:2: iv_ruleSubProperty= ruleSubProperty EOF
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
    // InternalMetaTemplating.g:1453:1: ruleSubProperty returns [EObject current=null] : ( (otherlv_0= '.' ( (lv_method_1_0= RULE_ID ) ) otherlv_2= '()' ) | (otherlv_3= '.' ( (lv_property_4_0= RULE_ID ) ) ) ) ;
    public final EObject ruleSubProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_method_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_property_4_0=null;


        	enterRule();

        try {
            // InternalMetaTemplating.g:1459:2: ( ( (otherlv_0= '.' ( (lv_method_1_0= RULE_ID ) ) otherlv_2= '()' ) | (otherlv_3= '.' ( (lv_property_4_0= RULE_ID ) ) ) ) )
            // InternalMetaTemplating.g:1460:2: ( (otherlv_0= '.' ( (lv_method_1_0= RULE_ID ) ) otherlv_2= '()' ) | (otherlv_3= '.' ( (lv_property_4_0= RULE_ID ) ) ) )
            {
            // InternalMetaTemplating.g:1460:2: ( (otherlv_0= '.' ( (lv_method_1_0= RULE_ID ) ) otherlv_2= '()' ) | (otherlv_3= '.' ( (lv_property_4_0= RULE_ID ) ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==RULE_ID) ) {
                    int LA23_2 = input.LA(3);

                    if ( (LA23_2==EOF||LA23_2==18||LA23_2==20||LA23_2==26||LA23_2==29||LA23_2==32||(LA23_2>=34 && LA23_2<=36)) ) {
                        alt23=2;
                    }
                    else if ( (LA23_2==30) ) {
                        alt23=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalMetaTemplating.g:1461:3: (otherlv_0= '.' ( (lv_method_1_0= RULE_ID ) ) otherlv_2= '()' )
                    {
                    // InternalMetaTemplating.g:1461:3: (otherlv_0= '.' ( (lv_method_1_0= RULE_ID ) ) otherlv_2= '()' )
                    // InternalMetaTemplating.g:1462:4: otherlv_0= '.' ( (lv_method_1_0= RULE_ID ) ) otherlv_2= '()'
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getSubPropertyAccess().getFullStopKeyword_0_0());
                    			
                    // InternalMetaTemplating.g:1466:4: ( (lv_method_1_0= RULE_ID ) )
                    // InternalMetaTemplating.g:1467:5: (lv_method_1_0= RULE_ID )
                    {
                    // InternalMetaTemplating.g:1467:5: (lv_method_1_0= RULE_ID )
                    // InternalMetaTemplating.g:1468:6: lv_method_1_0= RULE_ID
                    {
                    lv_method_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

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

                    otherlv_2=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getSubPropertyAccess().getLeftParenthesisRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:1490:3: (otherlv_3= '.' ( (lv_property_4_0= RULE_ID ) ) )
                    {
                    // InternalMetaTemplating.g:1490:3: (otherlv_3= '.' ( (lv_property_4_0= RULE_ID ) ) )
                    // InternalMetaTemplating.g:1491:4: otherlv_3= '.' ( (lv_property_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getSubPropertyAccess().getFullStopKeyword_1_0());
                    			
                    // InternalMetaTemplating.g:1495:4: ( (lv_property_4_0= RULE_ID ) )
                    // InternalMetaTemplating.g:1496:5: (lv_property_4_0= RULE_ID )
                    {
                    // InternalMetaTemplating.g:1496:5: (lv_property_4_0= RULE_ID )
                    // InternalMetaTemplating.g:1497:6: lv_property_4_0= RULE_ID
                    {
                    lv_property_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_property_4_0, grammarAccess.getSubPropertyAccess().getPropertyIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSubPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"property",
                    							lv_property_4_0,
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


    // $ANTLR start "entryRuleEscapedString"
    // InternalMetaTemplating.g:1518:1: entryRuleEscapedString returns [EObject current=null] : iv_ruleEscapedString= ruleEscapedString EOF ;
    public final EObject entryRuleEscapedString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscapedString = null;


        try {
            // InternalMetaTemplating.g:1518:54: (iv_ruleEscapedString= ruleEscapedString EOF )
            // InternalMetaTemplating.g:1519:2: iv_ruleEscapedString= ruleEscapedString EOF
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
    // InternalMetaTemplating.g:1525:1: ruleEscapedString returns [EObject current=null] : (otherlv_0= '@{' ( (lv_str_1_0= RULE_STRING ) ) otherlv_2= '}@' ) ;
    public final EObject ruleEscapedString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_str_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMetaTemplating.g:1531:2: ( (otherlv_0= '@{' ( (lv_str_1_0= RULE_STRING ) ) otherlv_2= '}@' ) )
            // InternalMetaTemplating.g:1532:2: (otherlv_0= '@{' ( (lv_str_1_0= RULE_STRING ) ) otherlv_2= '}@' )
            {
            // InternalMetaTemplating.g:1532:2: (otherlv_0= '@{' ( (lv_str_1_0= RULE_STRING ) ) otherlv_2= '}@' )
            // InternalMetaTemplating.g:1533:3: otherlv_0= '@{' ( (lv_str_1_0= RULE_STRING ) ) otherlv_2= '}@'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getEscapedStringAccess().getCommercialAtLeftCurlyBracketKeyword_0());
            		
            // InternalMetaTemplating.g:1537:3: ( (lv_str_1_0= RULE_STRING ) )
            // InternalMetaTemplating.g:1538:4: (lv_str_1_0= RULE_STRING )
            {
            // InternalMetaTemplating.g:1538:4: (lv_str_1_0= RULE_STRING )
            // InternalMetaTemplating.g:1539:5: lv_str_1_0= RULE_STRING
            {
            lv_str_1_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

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

            otherlv_2=(Token)match(input,38,FOLLOW_2); 

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
    // InternalMetaTemplating.g:1563:1: entryRuleEscaped returns [EObject current=null] : iv_ruleEscaped= ruleEscaped EOF ;
    public final EObject entryRuleEscaped() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscaped = null;


        try {
            // InternalMetaTemplating.g:1563:48: (iv_ruleEscaped= ruleEscaped EOF )
            // InternalMetaTemplating.g:1564:2: iv_ruleEscaped= ruleEscaped EOF
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
    // InternalMetaTemplating.g:1570:1: ruleEscaped returns [EObject current=null] : (otherlv_0= '#' ( ( (lv_char_1_1= 'n' | lv_char_1_2= 's' | lv_char_1_3= 't' | lv_char_1_4= '#' | lv_char_1_5= '{' | lv_char_1_6= '}' | lv_char_1_7= '[' | lv_char_1_8= ']' | lv_char_1_9= ',' | lv_char_1_10= ';' | lv_char_1_11= '(' | lv_char_1_12= ')' | lv_char_1_13= ':' | lv_char_1_14= '<' | lv_char_1_15= '>' | lv_char_1_16= '\\'' ) ) ) ) ;
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


        	enterRule();

        try {
            // InternalMetaTemplating.g:1576:2: ( (otherlv_0= '#' ( ( (lv_char_1_1= 'n' | lv_char_1_2= 's' | lv_char_1_3= 't' | lv_char_1_4= '#' | lv_char_1_5= '{' | lv_char_1_6= '}' | lv_char_1_7= '[' | lv_char_1_8= ']' | lv_char_1_9= ',' | lv_char_1_10= ';' | lv_char_1_11= '(' | lv_char_1_12= ')' | lv_char_1_13= ':' | lv_char_1_14= '<' | lv_char_1_15= '>' | lv_char_1_16= '\\'' ) ) ) ) )
            // InternalMetaTemplating.g:1577:2: (otherlv_0= '#' ( ( (lv_char_1_1= 'n' | lv_char_1_2= 's' | lv_char_1_3= 't' | lv_char_1_4= '#' | lv_char_1_5= '{' | lv_char_1_6= '}' | lv_char_1_7= '[' | lv_char_1_8= ']' | lv_char_1_9= ',' | lv_char_1_10= ';' | lv_char_1_11= '(' | lv_char_1_12= ')' | lv_char_1_13= ':' | lv_char_1_14= '<' | lv_char_1_15= '>' | lv_char_1_16= '\\'' ) ) ) )
            {
            // InternalMetaTemplating.g:1577:2: (otherlv_0= '#' ( ( (lv_char_1_1= 'n' | lv_char_1_2= 's' | lv_char_1_3= 't' | lv_char_1_4= '#' | lv_char_1_5= '{' | lv_char_1_6= '}' | lv_char_1_7= '[' | lv_char_1_8= ']' | lv_char_1_9= ',' | lv_char_1_10= ';' | lv_char_1_11= '(' | lv_char_1_12= ')' | lv_char_1_13= ':' | lv_char_1_14= '<' | lv_char_1_15= '>' | lv_char_1_16= '\\'' ) ) ) )
            // InternalMetaTemplating.g:1578:3: otherlv_0= '#' ( ( (lv_char_1_1= 'n' | lv_char_1_2= 's' | lv_char_1_3= 't' | lv_char_1_4= '#' | lv_char_1_5= '{' | lv_char_1_6= '}' | lv_char_1_7= '[' | lv_char_1_8= ']' | lv_char_1_9= ',' | lv_char_1_10= ';' | lv_char_1_11= '(' | lv_char_1_12= ')' | lv_char_1_13= ':' | lv_char_1_14= '<' | lv_char_1_15= '>' | lv_char_1_16= '\\'' ) ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getEscapedAccess().getNumberSignKeyword_0());
            		
            // InternalMetaTemplating.g:1582:3: ( ( (lv_char_1_1= 'n' | lv_char_1_2= 's' | lv_char_1_3= 't' | lv_char_1_4= '#' | lv_char_1_5= '{' | lv_char_1_6= '}' | lv_char_1_7= '[' | lv_char_1_8= ']' | lv_char_1_9= ',' | lv_char_1_10= ';' | lv_char_1_11= '(' | lv_char_1_12= ')' | lv_char_1_13= ':' | lv_char_1_14= '<' | lv_char_1_15= '>' | lv_char_1_16= '\\'' ) ) )
            // InternalMetaTemplating.g:1583:4: ( (lv_char_1_1= 'n' | lv_char_1_2= 's' | lv_char_1_3= 't' | lv_char_1_4= '#' | lv_char_1_5= '{' | lv_char_1_6= '}' | lv_char_1_7= '[' | lv_char_1_8= ']' | lv_char_1_9= ',' | lv_char_1_10= ';' | lv_char_1_11= '(' | lv_char_1_12= ')' | lv_char_1_13= ':' | lv_char_1_14= '<' | lv_char_1_15= '>' | lv_char_1_16= '\\'' ) )
            {
            // InternalMetaTemplating.g:1583:4: ( (lv_char_1_1= 'n' | lv_char_1_2= 's' | lv_char_1_3= 't' | lv_char_1_4= '#' | lv_char_1_5= '{' | lv_char_1_6= '}' | lv_char_1_7= '[' | lv_char_1_8= ']' | lv_char_1_9= ',' | lv_char_1_10= ';' | lv_char_1_11= '(' | lv_char_1_12= ')' | lv_char_1_13= ':' | lv_char_1_14= '<' | lv_char_1_15= '>' | lv_char_1_16= '\\'' ) )
            // InternalMetaTemplating.g:1584:5: (lv_char_1_1= 'n' | lv_char_1_2= 's' | lv_char_1_3= 't' | lv_char_1_4= '#' | lv_char_1_5= '{' | lv_char_1_6= '}' | lv_char_1_7= '[' | lv_char_1_8= ']' | lv_char_1_9= ',' | lv_char_1_10= ';' | lv_char_1_11= '(' | lv_char_1_12= ')' | lv_char_1_13= ':' | lv_char_1_14= '<' | lv_char_1_15= '>' | lv_char_1_16= '\\'' )
            {
            // InternalMetaTemplating.g:1584:5: (lv_char_1_1= 'n' | lv_char_1_2= 's' | lv_char_1_3= 't' | lv_char_1_4= '#' | lv_char_1_5= '{' | lv_char_1_6= '}' | lv_char_1_7= '[' | lv_char_1_8= ']' | lv_char_1_9= ',' | lv_char_1_10= ';' | lv_char_1_11= '(' | lv_char_1_12= ')' | lv_char_1_13= ':' | lv_char_1_14= '<' | lv_char_1_15= '>' | lv_char_1_16= '\\'' )
            int alt24=16;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt24=1;
                }
                break;
            case 41:
                {
                alt24=2;
                }
                break;
            case 42:
                {
                alt24=3;
                }
                break;
            case 39:
                {
                alt24=4;
                }
                break;
            case 19:
                {
                alt24=5;
                }
                break;
            case 20:
                {
                alt24=6;
                }
                break;
            case 33:
                {
                alt24=7;
                }
                break;
            case 35:
                {
                alt24=8;
                }
                break;
            case 43:
                {
                alt24=9;
                }
                break;
            case 12:
                {
                alt24=10;
                }
                break;
            case 17:
                {
                alt24=11;
                }
                break;
            case 18:
                {
                alt24=12;
                }
                break;
            case 25:
                {
                alt24=13;
                }
                break;
            case 44:
                {
                alt24=14;
                }
                break;
            case 45:
                {
                alt24=15;
                }
                break;
            case 46:
                {
                alt24=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalMetaTemplating.g:1585:6: lv_char_1_1= 'n'
                    {
                    lv_char_1_1=(Token)match(input,40,FOLLOW_2); 

                    						newLeafNode(lv_char_1_1, grammarAccess.getEscapedAccess().getCharNKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:1596:6: lv_char_1_2= 's'
                    {
                    lv_char_1_2=(Token)match(input,41,FOLLOW_2); 

                    						newLeafNode(lv_char_1_2, grammarAccess.getEscapedAccess().getCharSKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalMetaTemplating.g:1607:6: lv_char_1_3= 't'
                    {
                    lv_char_1_3=(Token)match(input,42,FOLLOW_2); 

                    						newLeafNode(lv_char_1_3, grammarAccess.getEscapedAccess().getCharTKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalMetaTemplating.g:1618:6: lv_char_1_4= '#'
                    {
                    lv_char_1_4=(Token)match(input,39,FOLLOW_2); 

                    						newLeafNode(lv_char_1_4, grammarAccess.getEscapedAccess().getCharNumberSignKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalMetaTemplating.g:1629:6: lv_char_1_5= '{'
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
                    // InternalMetaTemplating.g:1640:6: lv_char_1_6= '}'
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
                    // InternalMetaTemplating.g:1651:6: lv_char_1_7= '['
                    {
                    lv_char_1_7=(Token)match(input,33,FOLLOW_2); 

                    						newLeafNode(lv_char_1_7, grammarAccess.getEscapedAccess().getCharLeftSquareBracketKeyword_1_0_6());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_7, null);
                    					

                    }
                    break;
                case 8 :
                    // InternalMetaTemplating.g:1662:6: lv_char_1_8= ']'
                    {
                    lv_char_1_8=(Token)match(input,35,FOLLOW_2); 

                    						newLeafNode(lv_char_1_8, grammarAccess.getEscapedAccess().getCharRightSquareBracketKeyword_1_0_7());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_8, null);
                    					

                    }
                    break;
                case 9 :
                    // InternalMetaTemplating.g:1673:6: lv_char_1_9= ','
                    {
                    lv_char_1_9=(Token)match(input,43,FOLLOW_2); 

                    						newLeafNode(lv_char_1_9, grammarAccess.getEscapedAccess().getCharCommaKeyword_1_0_8());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_9, null);
                    					

                    }
                    break;
                case 10 :
                    // InternalMetaTemplating.g:1684:6: lv_char_1_10= ';'
                    {
                    lv_char_1_10=(Token)match(input,12,FOLLOW_2); 

                    						newLeafNode(lv_char_1_10, grammarAccess.getEscapedAccess().getCharSemicolonKeyword_1_0_9());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_10, null);
                    					

                    }
                    break;
                case 11 :
                    // InternalMetaTemplating.g:1695:6: lv_char_1_11= '('
                    {
                    lv_char_1_11=(Token)match(input,17,FOLLOW_2); 

                    						newLeafNode(lv_char_1_11, grammarAccess.getEscapedAccess().getCharLeftParenthesisKeyword_1_0_10());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_11, null);
                    					

                    }
                    break;
                case 12 :
                    // InternalMetaTemplating.g:1706:6: lv_char_1_12= ')'
                    {
                    lv_char_1_12=(Token)match(input,18,FOLLOW_2); 

                    						newLeafNode(lv_char_1_12, grammarAccess.getEscapedAccess().getCharRightParenthesisKeyword_1_0_11());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_12, null);
                    					

                    }
                    break;
                case 13 :
                    // InternalMetaTemplating.g:1717:6: lv_char_1_13= ':'
                    {
                    lv_char_1_13=(Token)match(input,25,FOLLOW_2); 

                    						newLeafNode(lv_char_1_13, grammarAccess.getEscapedAccess().getCharColonKeyword_1_0_12());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_13, null);
                    					

                    }
                    break;
                case 14 :
                    // InternalMetaTemplating.g:1728:6: lv_char_1_14= '<'
                    {
                    lv_char_1_14=(Token)match(input,44,FOLLOW_2); 

                    						newLeafNode(lv_char_1_14, grammarAccess.getEscapedAccess().getCharLessThanSignKeyword_1_0_13());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_14, null);
                    					

                    }
                    break;
                case 15 :
                    // InternalMetaTemplating.g:1739:6: lv_char_1_15= '>'
                    {
                    lv_char_1_15=(Token)match(input,45,FOLLOW_2); 

                    						newLeafNode(lv_char_1_15, grammarAccess.getEscapedAccess().getCharGreaterThanSignKeyword_1_0_14());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_15, null);
                    					

                    }
                    break;
                case 16 :
                    // InternalMetaTemplating.g:1750:6: lv_char_1_16= '\\''
                    {
                    lv_char_1_16=(Token)match(input,46,FOLLOW_2); 

                    						newLeafNode(lv_char_1_16, grammarAccess.getEscapedAccess().getCharApostropheKeyword_1_0_15());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscapedRule());
                    						}
                    						setWithLastConsumed(current, "char", lv_char_1_16, null);
                    					

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


    protected DFA19 dfa19 = new DFA19(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\2\uffff\1\4\6\uffff\1\4\3\uffff";
    static final String dfa_3s = "\1\35\1\5\1\22\1\5\2\uffff\1\35\1\5\1\4\1\22\1\35\1\43\1\35";
    static final String dfa_4s = "\1\35\1\41\1\36\1\5\2\uffff\1\43\1\5\1\4\1\36\3\43";
    static final String dfa_5s = "\4\uffff\1\2\1\1\7\uffff";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2\33\uffff\1\3",
            "\1\4\12\uffff\1\4\1\5",
            "\1\6",
            "",
            "",
            "\1\7\4\uffff\1\10\1\11",
            "\1\12",
            "\1\13",
            "\1\4\12\uffff\1\4\1\5",
            "\1\7\1\14\3\uffff\1\10\1\11",
            "\1\11",
            "\1\7\4\uffff\1\10\1\11"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1107:2: ( (otherlv_0= '.' ( ( (lv_methItem_1_0= RULE_ID ) ) | ( (lv_methRef_2_0= ruleMetaPh ) ) ) otherlv_3= '()' ) | (otherlv_4= '.' ( ( (lv_item_5_0= RULE_ID ) ) | ( (lv_ref_6_0= ruleMetaPh ) ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000A289414022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000A289514020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000A280000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00007F8A021E1000L});

}