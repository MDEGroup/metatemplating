package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MetaTemplatingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMetaTemplatingParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#'", "'{'", "'}'", "'['", "']'", "','", "';'", "'('", "')'", "':'", "'<'", "'>'", "'\\''", "'import'", "'IMPORT'", "'//'", "'/*'", "'*/'", "'FORALL'", "'TAGGED'", "'foreach'", "'in'", "'.'", "'()'", "'[['", "']]'", "'TAGINFO'", "'.{'", "'@{'", "'}@'"
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

    	public void setGrammarAccess(MetaTemplatingGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMetaTemplating.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:54:1: ( ruleModel EOF )
            // InternalMetaTemplating.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMetaTemplating.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMetaTemplating.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMetaTemplating.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalMetaTemplating.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMetaTemplating.g:69:3: ( rule__Model__Group__0 )
            // InternalMetaTemplating.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleHeader"
    // InternalMetaTemplating.g:78:1: entryRuleHeader : ruleHeader EOF ;
    public final void entryRuleHeader() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:79:1: ( ruleHeader EOF )
            // InternalMetaTemplating.g:80:1: ruleHeader EOF
            {
             before(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getHeaderRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalMetaTemplating.g:87:1: ruleHeader : ( ( rule__Header__Group__0 ) ) ;
    public final void ruleHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:91:2: ( ( ( rule__Header__Group__0 ) ) )
            // InternalMetaTemplating.g:92:2: ( ( rule__Header__Group__0 ) )
            {
            // InternalMetaTemplating.g:92:2: ( ( rule__Header__Group__0 ) )
            // InternalMetaTemplating.g:93:3: ( rule__Header__Group__0 )
            {
             before(grammarAccess.getHeaderAccess().getGroup()); 
            // InternalMetaTemplating.g:94:3: ( rule__Header__Group__0 )
            // InternalMetaTemplating.g:94:4: rule__Header__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Header__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleImport"
    // InternalMetaTemplating.g:103:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:104:1: ( ruleImport EOF )
            // InternalMetaTemplating.g:105:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalMetaTemplating.g:112:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:116:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalMetaTemplating.g:117:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalMetaTemplating.g:117:2: ( ( rule__Import__Group__0 ) )
            // InternalMetaTemplating.g:118:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalMetaTemplating.g:119:3: ( rule__Import__Group__0 )
            // InternalMetaTemplating.g:119:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleLibraries"
    // InternalMetaTemplating.g:128:1: entryRuleLibraries : ruleLibraries EOF ;
    public final void entryRuleLibraries() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:129:1: ( ruleLibraries EOF )
            // InternalMetaTemplating.g:130:1: ruleLibraries EOF
            {
             before(grammarAccess.getLibrariesRule()); 
            pushFollow(FOLLOW_1);
            ruleLibraries();

            state._fsp--;

             after(grammarAccess.getLibrariesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLibraries"


    // $ANTLR start "ruleLibraries"
    // InternalMetaTemplating.g:137:1: ruleLibraries : ( ( rule__Libraries__Group__0 ) ) ;
    public final void ruleLibraries() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:141:2: ( ( ( rule__Libraries__Group__0 ) ) )
            // InternalMetaTemplating.g:142:2: ( ( rule__Libraries__Group__0 ) )
            {
            // InternalMetaTemplating.g:142:2: ( ( rule__Libraries__Group__0 ) )
            // InternalMetaTemplating.g:143:3: ( rule__Libraries__Group__0 )
            {
             before(grammarAccess.getLibrariesAccess().getGroup()); 
            // InternalMetaTemplating.g:144:3: ( rule__Libraries__Group__0 )
            // InternalMetaTemplating.g:144:4: rule__Libraries__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Libraries__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLibrariesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLibraries"


    // $ANTLR start "entryRuleComment"
    // InternalMetaTemplating.g:153:1: entryRuleComment : ruleComment EOF ;
    public final void entryRuleComment() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:154:1: ( ruleComment EOF )
            // InternalMetaTemplating.g:155:1: ruleComment EOF
            {
             before(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getCommentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // InternalMetaTemplating.g:162:1: ruleComment : ( ( rule__Comment__Alternatives ) ) ;
    public final void ruleComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:166:2: ( ( ( rule__Comment__Alternatives ) ) )
            // InternalMetaTemplating.g:167:2: ( ( rule__Comment__Alternatives ) )
            {
            // InternalMetaTemplating.g:167:2: ( ( rule__Comment__Alternatives ) )
            // InternalMetaTemplating.g:168:3: ( rule__Comment__Alternatives )
            {
             before(grammarAccess.getCommentAccess().getAlternatives()); 
            // InternalMetaTemplating.g:169:3: ( rule__Comment__Alternatives )
            // InternalMetaTemplating.g:169:4: rule__Comment__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Comment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleInstructions"
    // InternalMetaTemplating.g:178:1: entryRuleInstructions : ruleInstructions EOF ;
    public final void entryRuleInstructions() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:179:1: ( ruleInstructions EOF )
            // InternalMetaTemplating.g:180:1: ruleInstructions EOF
            {
             before(grammarAccess.getInstructionsRule()); 
            pushFollow(FOLLOW_1);
            ruleInstructions();

            state._fsp--;

             after(grammarAccess.getInstructionsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstructions"


    // $ANTLR start "ruleInstructions"
    // InternalMetaTemplating.g:187:1: ruleInstructions : ( ( rule__Instructions__Alternatives ) ) ;
    public final void ruleInstructions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:191:2: ( ( ( rule__Instructions__Alternatives ) ) )
            // InternalMetaTemplating.g:192:2: ( ( rule__Instructions__Alternatives ) )
            {
            // InternalMetaTemplating.g:192:2: ( ( rule__Instructions__Alternatives ) )
            // InternalMetaTemplating.g:193:3: ( rule__Instructions__Alternatives )
            {
             before(grammarAccess.getInstructionsAccess().getAlternatives()); 
            // InternalMetaTemplating.g:194:3: ( rule__Instructions__Alternatives )
            // InternalMetaTemplating.g:194:4: rule__Instructions__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Instructions__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstructionsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstructions"


    // $ANTLR start "entryRuleStatement"
    // InternalMetaTemplating.g:203:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:204:1: ( ruleStatement EOF )
            // InternalMetaTemplating.g:205:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMetaTemplating.g:212:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:216:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalMetaTemplating.g:217:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalMetaTemplating.g:217:2: ( ( rule__Statement__Alternatives ) )
            // InternalMetaTemplating.g:218:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalMetaTemplating.g:219:3: ( rule__Statement__Alternatives )
            // InternalMetaTemplating.g:219:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleRule"
    // InternalMetaTemplating.g:228:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:229:1: ( ruleRule EOF )
            // InternalMetaTemplating.g:230:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalMetaTemplating.g:237:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:241:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalMetaTemplating.g:242:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalMetaTemplating.g:242:2: ( ( rule__Rule__Group__0 ) )
            // InternalMetaTemplating.g:243:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalMetaTemplating.g:244:3: ( rule__Rule__Group__0 )
            // InternalMetaTemplating.g:244:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleIterator"
    // InternalMetaTemplating.g:253:1: entryRuleIterator : ruleIterator EOF ;
    public final void entryRuleIterator() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:254:1: ( ruleIterator EOF )
            // InternalMetaTemplating.g:255:1: ruleIterator EOF
            {
             before(grammarAccess.getIteratorRule()); 
            pushFollow(FOLLOW_1);
            ruleIterator();

            state._fsp--;

             after(grammarAccess.getIteratorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIterator"


    // $ANTLR start "ruleIterator"
    // InternalMetaTemplating.g:262:1: ruleIterator : ( ( rule__Iterator__Group__0 ) ) ;
    public final void ruleIterator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:266:2: ( ( ( rule__Iterator__Group__0 ) ) )
            // InternalMetaTemplating.g:267:2: ( ( rule__Iterator__Group__0 ) )
            {
            // InternalMetaTemplating.g:267:2: ( ( rule__Iterator__Group__0 ) )
            // InternalMetaTemplating.g:268:3: ( rule__Iterator__Group__0 )
            {
             before(grammarAccess.getIteratorAccess().getGroup()); 
            // InternalMetaTemplating.g:269:3: ( rule__Iterator__Group__0 )
            // InternalMetaTemplating.g:269:4: rule__Iterator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Iterator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIteratorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIterator"


    // $ANTLR start "entryRuleQuery"
    // InternalMetaTemplating.g:278:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:279:1: ( ruleQuery EOF )
            // InternalMetaTemplating.g:280:1: ruleQuery EOF
            {
             before(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getQueryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalMetaTemplating.g:287:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:291:2: ( ( ( rule__Query__Group__0 ) ) )
            // InternalMetaTemplating.g:292:2: ( ( rule__Query__Group__0 ) )
            {
            // InternalMetaTemplating.g:292:2: ( ( rule__Query__Group__0 ) )
            // InternalMetaTemplating.g:293:3: ( rule__Query__Group__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup()); 
            // InternalMetaTemplating.g:294:3: ( rule__Query__Group__0 )
            // InternalMetaTemplating.g:294:4: rule__Query__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleSubQuery"
    // InternalMetaTemplating.g:303:1: entryRuleSubQuery : ruleSubQuery EOF ;
    public final void entryRuleSubQuery() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:304:1: ( ruleSubQuery EOF )
            // InternalMetaTemplating.g:305:1: ruleSubQuery EOF
            {
             before(grammarAccess.getSubQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleSubQuery();

            state._fsp--;

             after(grammarAccess.getSubQueryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubQuery"


    // $ANTLR start "ruleSubQuery"
    // InternalMetaTemplating.g:312:1: ruleSubQuery : ( ( rule__SubQuery__Group__0 ) ) ;
    public final void ruleSubQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:316:2: ( ( ( rule__SubQuery__Group__0 ) ) )
            // InternalMetaTemplating.g:317:2: ( ( rule__SubQuery__Group__0 ) )
            {
            // InternalMetaTemplating.g:317:2: ( ( rule__SubQuery__Group__0 ) )
            // InternalMetaTemplating.g:318:3: ( rule__SubQuery__Group__0 )
            {
             before(grammarAccess.getSubQueryAccess().getGroup()); 
            // InternalMetaTemplating.g:319:3: ( rule__SubQuery__Group__0 )
            // InternalMetaTemplating.g:319:4: rule__SubQuery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubQuery__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubQueryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubQuery"


    // $ANTLR start "entryRulePh"
    // InternalMetaTemplating.g:328:1: entryRulePh : rulePh EOF ;
    public final void entryRulePh() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:329:1: ( rulePh EOF )
            // InternalMetaTemplating.g:330:1: rulePh EOF
            {
             before(grammarAccess.getPhRule()); 
            pushFollow(FOLLOW_1);
            rulePh();

            state._fsp--;

             after(grammarAccess.getPhRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePh"


    // $ANTLR start "rulePh"
    // InternalMetaTemplating.g:337:1: rulePh : ( ( rule__Ph__Group__0 ) ) ;
    public final void rulePh() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:341:2: ( ( ( rule__Ph__Group__0 ) ) )
            // InternalMetaTemplating.g:342:2: ( ( rule__Ph__Group__0 ) )
            {
            // InternalMetaTemplating.g:342:2: ( ( rule__Ph__Group__0 ) )
            // InternalMetaTemplating.g:343:3: ( rule__Ph__Group__0 )
            {
             before(grammarAccess.getPhAccess().getGroup()); 
            // InternalMetaTemplating.g:344:3: ( rule__Ph__Group__0 )
            // InternalMetaTemplating.g:344:4: rule__Ph__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ph__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPhAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePh"


    // $ANTLR start "entryRuleMetaPh"
    // InternalMetaTemplating.g:353:1: entryRuleMetaPh : ruleMetaPh EOF ;
    public final void entryRuleMetaPh() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:354:1: ( ruleMetaPh EOF )
            // InternalMetaTemplating.g:355:1: ruleMetaPh EOF
            {
             before(grammarAccess.getMetaPhRule()); 
            pushFollow(FOLLOW_1);
            ruleMetaPh();

            state._fsp--;

             after(grammarAccess.getMetaPhRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMetaPh"


    // $ANTLR start "ruleMetaPh"
    // InternalMetaTemplating.g:362:1: ruleMetaPh : ( ( rule__MetaPh__Group__0 ) ) ;
    public final void ruleMetaPh() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:366:2: ( ( ( rule__MetaPh__Group__0 ) ) )
            // InternalMetaTemplating.g:367:2: ( ( rule__MetaPh__Group__0 ) )
            {
            // InternalMetaTemplating.g:367:2: ( ( rule__MetaPh__Group__0 ) )
            // InternalMetaTemplating.g:368:3: ( rule__MetaPh__Group__0 )
            {
             before(grammarAccess.getMetaPhAccess().getGroup()); 
            // InternalMetaTemplating.g:369:3: ( rule__MetaPh__Group__0 )
            // InternalMetaTemplating.g:369:4: rule__MetaPh__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MetaPh__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetaPhAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetaPh"


    // $ANTLR start "entryRuleMetaProperty"
    // InternalMetaTemplating.g:378:1: entryRuleMetaProperty : ruleMetaProperty EOF ;
    public final void entryRuleMetaProperty() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:379:1: ( ruleMetaProperty EOF )
            // InternalMetaTemplating.g:380:1: ruleMetaProperty EOF
            {
             before(grammarAccess.getMetaPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleMetaProperty();

            state._fsp--;

             after(grammarAccess.getMetaPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMetaProperty"


    // $ANTLR start "ruleMetaProperty"
    // InternalMetaTemplating.g:387:1: ruleMetaProperty : ( ( rule__MetaProperty__Group__0 ) ) ;
    public final void ruleMetaProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:391:2: ( ( ( rule__MetaProperty__Group__0 ) ) )
            // InternalMetaTemplating.g:392:2: ( ( rule__MetaProperty__Group__0 ) )
            {
            // InternalMetaTemplating.g:392:2: ( ( rule__MetaProperty__Group__0 ) )
            // InternalMetaTemplating.g:393:3: ( rule__MetaProperty__Group__0 )
            {
             before(grammarAccess.getMetaPropertyAccess().getGroup()); 
            // InternalMetaTemplating.g:394:3: ( rule__MetaProperty__Group__0 )
            // InternalMetaTemplating.g:394:4: rule__MetaProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MetaProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetaPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetaProperty"


    // $ANTLR start "entryRuleProperty"
    // InternalMetaTemplating.g:403:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:404:1: ( ruleProperty EOF )
            // InternalMetaTemplating.g:405:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalMetaTemplating.g:412:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:416:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalMetaTemplating.g:417:2: ( ( rule__Property__Group__0 ) )
            {
            // InternalMetaTemplating.g:417:2: ( ( rule__Property__Group__0 ) )
            // InternalMetaTemplating.g:418:3: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // InternalMetaTemplating.g:419:3: ( rule__Property__Group__0 )
            // InternalMetaTemplating.g:419:4: rule__Property__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleSubProperty"
    // InternalMetaTemplating.g:428:1: entryRuleSubProperty : ruleSubProperty EOF ;
    public final void entryRuleSubProperty() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:429:1: ( ruleSubProperty EOF )
            // InternalMetaTemplating.g:430:1: ruleSubProperty EOF
            {
             before(grammarAccess.getSubPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleSubProperty();

            state._fsp--;

             after(grammarAccess.getSubPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubProperty"


    // $ANTLR start "ruleSubProperty"
    // InternalMetaTemplating.g:437:1: ruleSubProperty : ( ( rule__SubProperty__Group__0 ) ) ;
    public final void ruleSubProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:441:2: ( ( ( rule__SubProperty__Group__0 ) ) )
            // InternalMetaTemplating.g:442:2: ( ( rule__SubProperty__Group__0 ) )
            {
            // InternalMetaTemplating.g:442:2: ( ( rule__SubProperty__Group__0 ) )
            // InternalMetaTemplating.g:443:3: ( rule__SubProperty__Group__0 )
            {
             before(grammarAccess.getSubPropertyAccess().getGroup()); 
            // InternalMetaTemplating.g:444:3: ( rule__SubProperty__Group__0 )
            // InternalMetaTemplating.g:444:4: rule__SubProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubProperty"


    // $ANTLR start "entryRuleEscapedString"
    // InternalMetaTemplating.g:453:1: entryRuleEscapedString : ruleEscapedString EOF ;
    public final void entryRuleEscapedString() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:454:1: ( ruleEscapedString EOF )
            // InternalMetaTemplating.g:455:1: ruleEscapedString EOF
            {
             before(grammarAccess.getEscapedStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEscapedString();

            state._fsp--;

             after(grammarAccess.getEscapedStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEscapedString"


    // $ANTLR start "ruleEscapedString"
    // InternalMetaTemplating.g:462:1: ruleEscapedString : ( ( rule__EscapedString__Group__0 ) ) ;
    public final void ruleEscapedString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:466:2: ( ( ( rule__EscapedString__Group__0 ) ) )
            // InternalMetaTemplating.g:467:2: ( ( rule__EscapedString__Group__0 ) )
            {
            // InternalMetaTemplating.g:467:2: ( ( rule__EscapedString__Group__0 ) )
            // InternalMetaTemplating.g:468:3: ( rule__EscapedString__Group__0 )
            {
             before(grammarAccess.getEscapedStringAccess().getGroup()); 
            // InternalMetaTemplating.g:469:3: ( rule__EscapedString__Group__0 )
            // InternalMetaTemplating.g:469:4: rule__EscapedString__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EscapedString__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEscapedStringAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEscapedString"


    // $ANTLR start "entryRuleEscaped"
    // InternalMetaTemplating.g:478:1: entryRuleEscaped : ruleEscaped EOF ;
    public final void entryRuleEscaped() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:479:1: ( ruleEscaped EOF )
            // InternalMetaTemplating.g:480:1: ruleEscaped EOF
            {
             before(grammarAccess.getEscapedRule()); 
            pushFollow(FOLLOW_1);
            ruleEscaped();

            state._fsp--;

             after(grammarAccess.getEscapedRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEscaped"


    // $ANTLR start "ruleEscaped"
    // InternalMetaTemplating.g:487:1: ruleEscaped : ( ( rule__Escaped__Group__0 ) ) ;
    public final void ruleEscaped() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:491:2: ( ( ( rule__Escaped__Group__0 ) ) )
            // InternalMetaTemplating.g:492:2: ( ( rule__Escaped__Group__0 ) )
            {
            // InternalMetaTemplating.g:492:2: ( ( rule__Escaped__Group__0 ) )
            // InternalMetaTemplating.g:493:3: ( rule__Escaped__Group__0 )
            {
             before(grammarAccess.getEscapedAccess().getGroup()); 
            // InternalMetaTemplating.g:494:3: ( rule__Escaped__Group__0 )
            // InternalMetaTemplating.g:494:4: rule__Escaped__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Escaped__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEscapedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEscaped"


    // $ANTLR start "rule__Comment__Alternatives"
    // InternalMetaTemplating.g:502:1: rule__Comment__Alternatives : ( ( ( rule__Comment__Group_0__0 ) ) | ( ( rule__Comment__Group_1__0 ) ) );
    public final void rule__Comment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:506:1: ( ( ( rule__Comment__Group_0__0 ) ) | ( ( rule__Comment__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==26) ) {
                alt1=1;
            }
            else if ( (LA1_0==27) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMetaTemplating.g:507:2: ( ( rule__Comment__Group_0__0 ) )
                    {
                    // InternalMetaTemplating.g:507:2: ( ( rule__Comment__Group_0__0 ) )
                    // InternalMetaTemplating.g:508:3: ( rule__Comment__Group_0__0 )
                    {
                     before(grammarAccess.getCommentAccess().getGroup_0()); 
                    // InternalMetaTemplating.g:509:3: ( rule__Comment__Group_0__0 )
                    // InternalMetaTemplating.g:509:4: rule__Comment__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comment__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCommentAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:513:2: ( ( rule__Comment__Group_1__0 ) )
                    {
                    // InternalMetaTemplating.g:513:2: ( ( rule__Comment__Group_1__0 ) )
                    // InternalMetaTemplating.g:514:3: ( rule__Comment__Group_1__0 )
                    {
                     before(grammarAccess.getCommentAccess().getGroup_1()); 
                    // InternalMetaTemplating.g:515:3: ( rule__Comment__Group_1__0 )
                    // InternalMetaTemplating.g:515:4: rule__Comment__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comment__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCommentAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Alternatives"


    // $ANTLR start "rule__Instructions__Alternatives"
    // InternalMetaTemplating.g:523:1: rule__Instructions__Alternatives : ( ( ( rule__Instructions__StatementAssignment_0 ) ) | ( ( rule__Instructions__IteratorAssignment_1 ) ) | ( ( rule__Instructions__RuleAssignment_2 ) ) | ( ( rule__Instructions__CommentAssignment_3 ) ) );
    public final void rule__Instructions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:527:1: ( ( ( rule__Instructions__StatementAssignment_0 ) ) | ( ( rule__Instructions__IteratorAssignment_1 ) ) | ( ( rule__Instructions__RuleAssignment_2 ) ) | ( ( rule__Instructions__CommentAssignment_3 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 11:
            case 14:
            case 35:
            case 39:
                {
                alt2=1;
                }
                break;
            case 31:
                {
                alt2=2;
                }
                break;
            case 29:
                {
                alt2=3;
                }
                break;
            case 26:
            case 27:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMetaTemplating.g:528:2: ( ( rule__Instructions__StatementAssignment_0 ) )
                    {
                    // InternalMetaTemplating.g:528:2: ( ( rule__Instructions__StatementAssignment_0 ) )
                    // InternalMetaTemplating.g:529:3: ( rule__Instructions__StatementAssignment_0 )
                    {
                     before(grammarAccess.getInstructionsAccess().getStatementAssignment_0()); 
                    // InternalMetaTemplating.g:530:3: ( rule__Instructions__StatementAssignment_0 )
                    // InternalMetaTemplating.g:530:4: rule__Instructions__StatementAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instructions__StatementAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstructionsAccess().getStatementAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:534:2: ( ( rule__Instructions__IteratorAssignment_1 ) )
                    {
                    // InternalMetaTemplating.g:534:2: ( ( rule__Instructions__IteratorAssignment_1 ) )
                    // InternalMetaTemplating.g:535:3: ( rule__Instructions__IteratorAssignment_1 )
                    {
                     before(grammarAccess.getInstructionsAccess().getIteratorAssignment_1()); 
                    // InternalMetaTemplating.g:536:3: ( rule__Instructions__IteratorAssignment_1 )
                    // InternalMetaTemplating.g:536:4: rule__Instructions__IteratorAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instructions__IteratorAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstructionsAccess().getIteratorAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMetaTemplating.g:540:2: ( ( rule__Instructions__RuleAssignment_2 ) )
                    {
                    // InternalMetaTemplating.g:540:2: ( ( rule__Instructions__RuleAssignment_2 ) )
                    // InternalMetaTemplating.g:541:3: ( rule__Instructions__RuleAssignment_2 )
                    {
                     before(grammarAccess.getInstructionsAccess().getRuleAssignment_2()); 
                    // InternalMetaTemplating.g:542:3: ( rule__Instructions__RuleAssignment_2 )
                    // InternalMetaTemplating.g:542:4: rule__Instructions__RuleAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instructions__RuleAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstructionsAccess().getRuleAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMetaTemplating.g:546:2: ( ( rule__Instructions__CommentAssignment_3 ) )
                    {
                    // InternalMetaTemplating.g:546:2: ( ( rule__Instructions__CommentAssignment_3 ) )
                    // InternalMetaTemplating.g:547:3: ( rule__Instructions__CommentAssignment_3 )
                    {
                     before(grammarAccess.getInstructionsAccess().getCommentAssignment_3()); 
                    // InternalMetaTemplating.g:548:3: ( rule__Instructions__CommentAssignment_3 )
                    // InternalMetaTemplating.g:548:4: rule__Instructions__CommentAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instructions__CommentAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstructionsAccess().getCommentAssignment_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__Alternatives"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalMetaTemplating.g:556:1: rule__Statement__Alternatives : ( ( ( rule__Statement__TextAssignment_0 ) ) | ( ( rule__Statement__CharAssignment_1 ) ) | ( ( rule__Statement__StringAssignment_2 ) ) | ( ( rule__Statement__PlaceholderAssignment_3 ) ) | ( ( rule__Statement__MetaPlaceholderAssignment_4 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:560:1: ( ( ( rule__Statement__TextAssignment_0 ) ) | ( ( rule__Statement__CharAssignment_1 ) ) | ( ( rule__Statement__StringAssignment_2 ) ) | ( ( rule__Statement__PlaceholderAssignment_3 ) ) | ( ( rule__Statement__MetaPlaceholderAssignment_4 ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 11:
                {
                alt3=2;
                }
                break;
            case 39:
                {
                alt3=3;
                }
                break;
            case 35:
                {
                alt3=4;
                }
                break;
            case 14:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMetaTemplating.g:561:2: ( ( rule__Statement__TextAssignment_0 ) )
                    {
                    // InternalMetaTemplating.g:561:2: ( ( rule__Statement__TextAssignment_0 ) )
                    // InternalMetaTemplating.g:562:3: ( rule__Statement__TextAssignment_0 )
                    {
                     before(grammarAccess.getStatementAccess().getTextAssignment_0()); 
                    // InternalMetaTemplating.g:563:3: ( rule__Statement__TextAssignment_0 )
                    // InternalMetaTemplating.g:563:4: rule__Statement__TextAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__TextAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getTextAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:567:2: ( ( rule__Statement__CharAssignment_1 ) )
                    {
                    // InternalMetaTemplating.g:567:2: ( ( rule__Statement__CharAssignment_1 ) )
                    // InternalMetaTemplating.g:568:3: ( rule__Statement__CharAssignment_1 )
                    {
                     before(grammarAccess.getStatementAccess().getCharAssignment_1()); 
                    // InternalMetaTemplating.g:569:3: ( rule__Statement__CharAssignment_1 )
                    // InternalMetaTemplating.g:569:4: rule__Statement__CharAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__CharAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getCharAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMetaTemplating.g:573:2: ( ( rule__Statement__StringAssignment_2 ) )
                    {
                    // InternalMetaTemplating.g:573:2: ( ( rule__Statement__StringAssignment_2 ) )
                    // InternalMetaTemplating.g:574:3: ( rule__Statement__StringAssignment_2 )
                    {
                     before(grammarAccess.getStatementAccess().getStringAssignment_2()); 
                    // InternalMetaTemplating.g:575:3: ( rule__Statement__StringAssignment_2 )
                    // InternalMetaTemplating.g:575:4: rule__Statement__StringAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__StringAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getStringAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMetaTemplating.g:579:2: ( ( rule__Statement__PlaceholderAssignment_3 ) )
                    {
                    // InternalMetaTemplating.g:579:2: ( ( rule__Statement__PlaceholderAssignment_3 ) )
                    // InternalMetaTemplating.g:580:3: ( rule__Statement__PlaceholderAssignment_3 )
                    {
                     before(grammarAccess.getStatementAccess().getPlaceholderAssignment_3()); 
                    // InternalMetaTemplating.g:581:3: ( rule__Statement__PlaceholderAssignment_3 )
                    // InternalMetaTemplating.g:581:4: rule__Statement__PlaceholderAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__PlaceholderAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getPlaceholderAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMetaTemplating.g:585:2: ( ( rule__Statement__MetaPlaceholderAssignment_4 ) )
                    {
                    // InternalMetaTemplating.g:585:2: ( ( rule__Statement__MetaPlaceholderAssignment_4 ) )
                    // InternalMetaTemplating.g:586:3: ( rule__Statement__MetaPlaceholderAssignment_4 )
                    {
                     before(grammarAccess.getStatementAccess().getMetaPlaceholderAssignment_4()); 
                    // InternalMetaTemplating.g:587:3: ( rule__Statement__MetaPlaceholderAssignment_4 )
                    // InternalMetaTemplating.g:587:4: rule__Statement__MetaPlaceholderAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__MetaPlaceholderAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getMetaPlaceholderAssignment_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Query__Alternatives_0"
    // InternalMetaTemplating.g:595:1: rule__Query__Alternatives_0 : ( ( ( rule__Query__ItemAssignment_0_0 ) ) | ( ( rule__Query__RefAssignment_0_1 ) ) );
    public final void rule__Query__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:599:1: ( ( ( rule__Query__ItemAssignment_0_0 ) ) | ( ( rule__Query__RefAssignment_0_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMetaTemplating.g:600:2: ( ( rule__Query__ItemAssignment_0_0 ) )
                    {
                    // InternalMetaTemplating.g:600:2: ( ( rule__Query__ItemAssignment_0_0 ) )
                    // InternalMetaTemplating.g:601:3: ( rule__Query__ItemAssignment_0_0 )
                    {
                     before(grammarAccess.getQueryAccess().getItemAssignment_0_0()); 
                    // InternalMetaTemplating.g:602:3: ( rule__Query__ItemAssignment_0_0 )
                    // InternalMetaTemplating.g:602:4: rule__Query__ItemAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query__ItemAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQueryAccess().getItemAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:606:2: ( ( rule__Query__RefAssignment_0_1 ) )
                    {
                    // InternalMetaTemplating.g:606:2: ( ( rule__Query__RefAssignment_0_1 ) )
                    // InternalMetaTemplating.g:607:3: ( rule__Query__RefAssignment_0_1 )
                    {
                     before(grammarAccess.getQueryAccess().getRefAssignment_0_1()); 
                    // InternalMetaTemplating.g:608:3: ( rule__Query__RefAssignment_0_1 )
                    // InternalMetaTemplating.g:608:4: rule__Query__RefAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query__RefAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getQueryAccess().getRefAssignment_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Alternatives_0"


    // $ANTLR start "rule__SubQuery__Alternatives_1"
    // InternalMetaTemplating.g:616:1: rule__SubQuery__Alternatives_1 : ( ( ( rule__SubQuery__ItemAssignment_1_0 ) ) | ( ( rule__SubQuery__RefAssignment_1_1 ) ) );
    public final void rule__SubQuery__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:620:1: ( ( ( rule__SubQuery__ItemAssignment_1_0 ) ) | ( ( rule__SubQuery__RefAssignment_1_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMetaTemplating.g:621:2: ( ( rule__SubQuery__ItemAssignment_1_0 ) )
                    {
                    // InternalMetaTemplating.g:621:2: ( ( rule__SubQuery__ItemAssignment_1_0 ) )
                    // InternalMetaTemplating.g:622:3: ( rule__SubQuery__ItemAssignment_1_0 )
                    {
                     before(grammarAccess.getSubQueryAccess().getItemAssignment_1_0()); 
                    // InternalMetaTemplating.g:623:3: ( rule__SubQuery__ItemAssignment_1_0 )
                    // InternalMetaTemplating.g:623:4: rule__SubQuery__ItemAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubQuery__ItemAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubQueryAccess().getItemAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:627:2: ( ( rule__SubQuery__RefAssignment_1_1 ) )
                    {
                    // InternalMetaTemplating.g:627:2: ( ( rule__SubQuery__RefAssignment_1_1 ) )
                    // InternalMetaTemplating.g:628:3: ( rule__SubQuery__RefAssignment_1_1 )
                    {
                     before(grammarAccess.getSubQueryAccess().getRefAssignment_1_1()); 
                    // InternalMetaTemplating.g:629:3: ( rule__SubQuery__RefAssignment_1_1 )
                    // InternalMetaTemplating.g:629:4: rule__SubQuery__RefAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubQuery__RefAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubQueryAccess().getRefAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubQuery__Alternatives_1"


    // $ANTLR start "rule__Escaped__CharAlternatives_1_0"
    // InternalMetaTemplating.g:637:1: rule__Escaped__CharAlternatives_1_0 : ( ( '#' ) | ( '{' ) | ( '}' ) | ( '[' ) | ( ']' ) | ( ',' ) | ( ';' ) | ( '(' ) | ( ')' ) | ( ':' ) | ( '<' ) | ( '>' ) | ( '\\'' ) );
    public final void rule__Escaped__CharAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:641:1: ( ( '#' ) | ( '{' ) | ( '}' ) | ( '[' ) | ( ']' ) | ( ',' ) | ( ';' ) | ( '(' ) | ( ')' ) | ( ':' ) | ( '<' ) | ( '>' ) | ( '\\'' ) )
            int alt6=13;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            case 14:
                {
                alt6=4;
                }
                break;
            case 15:
                {
                alt6=5;
                }
                break;
            case 16:
                {
                alt6=6;
                }
                break;
            case 17:
                {
                alt6=7;
                }
                break;
            case 18:
                {
                alt6=8;
                }
                break;
            case 19:
                {
                alt6=9;
                }
                break;
            case 20:
                {
                alt6=10;
                }
                break;
            case 21:
                {
                alt6=11;
                }
                break;
            case 22:
                {
                alt6=12;
                }
                break;
            case 23:
                {
                alt6=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMetaTemplating.g:642:2: ( '#' )
                    {
                    // InternalMetaTemplating.g:642:2: ( '#' )
                    // InternalMetaTemplating.g:643:3: '#'
                    {
                     before(grammarAccess.getEscapedAccess().getCharNumberSignKeyword_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharNumberSignKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:648:2: ( '{' )
                    {
                    // InternalMetaTemplating.g:648:2: ( '{' )
                    // InternalMetaTemplating.g:649:3: '{'
                    {
                     before(grammarAccess.getEscapedAccess().getCharLeftCurlyBracketKeyword_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharLeftCurlyBracketKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMetaTemplating.g:654:2: ( '}' )
                    {
                    // InternalMetaTemplating.g:654:2: ( '}' )
                    // InternalMetaTemplating.g:655:3: '}'
                    {
                     before(grammarAccess.getEscapedAccess().getCharRightCurlyBracketKeyword_1_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharRightCurlyBracketKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMetaTemplating.g:660:2: ( '[' )
                    {
                    // InternalMetaTemplating.g:660:2: ( '[' )
                    // InternalMetaTemplating.g:661:3: '['
                    {
                     before(grammarAccess.getEscapedAccess().getCharLeftSquareBracketKeyword_1_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharLeftSquareBracketKeyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMetaTemplating.g:666:2: ( ']' )
                    {
                    // InternalMetaTemplating.g:666:2: ( ']' )
                    // InternalMetaTemplating.g:667:3: ']'
                    {
                     before(grammarAccess.getEscapedAccess().getCharRightSquareBracketKeyword_1_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharRightSquareBracketKeyword_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMetaTemplating.g:672:2: ( ',' )
                    {
                    // InternalMetaTemplating.g:672:2: ( ',' )
                    // InternalMetaTemplating.g:673:3: ','
                    {
                     before(grammarAccess.getEscapedAccess().getCharCommaKeyword_1_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharCommaKeyword_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMetaTemplating.g:678:2: ( ';' )
                    {
                    // InternalMetaTemplating.g:678:2: ( ';' )
                    // InternalMetaTemplating.g:679:3: ';'
                    {
                     before(grammarAccess.getEscapedAccess().getCharSemicolonKeyword_1_0_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharSemicolonKeyword_1_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMetaTemplating.g:684:2: ( '(' )
                    {
                    // InternalMetaTemplating.g:684:2: ( '(' )
                    // InternalMetaTemplating.g:685:3: '('
                    {
                     before(grammarAccess.getEscapedAccess().getCharLeftParenthesisKeyword_1_0_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharLeftParenthesisKeyword_1_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMetaTemplating.g:690:2: ( ')' )
                    {
                    // InternalMetaTemplating.g:690:2: ( ')' )
                    // InternalMetaTemplating.g:691:3: ')'
                    {
                     before(grammarAccess.getEscapedAccess().getCharRightParenthesisKeyword_1_0_8()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharRightParenthesisKeyword_1_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMetaTemplating.g:696:2: ( ':' )
                    {
                    // InternalMetaTemplating.g:696:2: ( ':' )
                    // InternalMetaTemplating.g:697:3: ':'
                    {
                     before(grammarAccess.getEscapedAccess().getCharColonKeyword_1_0_9()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharColonKeyword_1_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMetaTemplating.g:702:2: ( '<' )
                    {
                    // InternalMetaTemplating.g:702:2: ( '<' )
                    // InternalMetaTemplating.g:703:3: '<'
                    {
                     before(grammarAccess.getEscapedAccess().getCharLessThanSignKeyword_1_0_10()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharLessThanSignKeyword_1_0_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMetaTemplating.g:708:2: ( '>' )
                    {
                    // InternalMetaTemplating.g:708:2: ( '>' )
                    // InternalMetaTemplating.g:709:3: '>'
                    {
                     before(grammarAccess.getEscapedAccess().getCharGreaterThanSignKeyword_1_0_11()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharGreaterThanSignKeyword_1_0_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMetaTemplating.g:714:2: ( '\\'' )
                    {
                    // InternalMetaTemplating.g:714:2: ( '\\'' )
                    // InternalMetaTemplating.g:715:3: '\\''
                    {
                     before(grammarAccess.getEscapedAccess().getCharApostropheKeyword_1_0_12()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharApostropheKeyword_1_0_12()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escaped__CharAlternatives_1_0"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMetaTemplating.g:724:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:728:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMetaTemplating.g:729:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalMetaTemplating.g:736:1: rule__Model__Group__0__Impl : ( ( rule__Model__HeaderAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:740:1: ( ( ( rule__Model__HeaderAssignment_0 ) ) )
            // InternalMetaTemplating.g:741:1: ( ( rule__Model__HeaderAssignment_0 ) )
            {
            // InternalMetaTemplating.g:741:1: ( ( rule__Model__HeaderAssignment_0 ) )
            // InternalMetaTemplating.g:742:2: ( rule__Model__HeaderAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getHeaderAssignment_0()); 
            // InternalMetaTemplating.g:743:2: ( rule__Model__HeaderAssignment_0 )
            // InternalMetaTemplating.g:743:3: rule__Model__HeaderAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__HeaderAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getHeaderAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalMetaTemplating.g:751:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:755:1: ( rule__Model__Group__1__Impl )
            // InternalMetaTemplating.g:756:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalMetaTemplating.g:762:1: rule__Model__Group__1__Impl : ( ( rule__Model__ContentAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:766:1: ( ( ( rule__Model__ContentAssignment_1 )* ) )
            // InternalMetaTemplating.g:767:1: ( ( rule__Model__ContentAssignment_1 )* )
            {
            // InternalMetaTemplating.g:767:1: ( ( rule__Model__ContentAssignment_1 )* )
            // InternalMetaTemplating.g:768:2: ( rule__Model__ContentAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getContentAssignment_1()); 
            // InternalMetaTemplating.g:769:2: ( rule__Model__ContentAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==11||LA7_0==14||(LA7_0>=26 && LA7_0<=27)||LA7_0==29||LA7_0==31||LA7_0==35||LA7_0==39) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMetaTemplating.g:769:3: rule__Model__ContentAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ContentAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getContentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Header__Group__0"
    // InternalMetaTemplating.g:778:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:782:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // InternalMetaTemplating.g:783:2: rule__Header__Group__0__Impl rule__Header__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Header__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__0"


    // $ANTLR start "rule__Header__Group__0__Impl"
    // InternalMetaTemplating.g:790:1: rule__Header__Group__0__Impl : ( () ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:794:1: ( ( () ) )
            // InternalMetaTemplating.g:795:1: ( () )
            {
            // InternalMetaTemplating.g:795:1: ( () )
            // InternalMetaTemplating.g:796:2: ()
            {
             before(grammarAccess.getHeaderAccess().getHeaderAction_0()); 
            // InternalMetaTemplating.g:797:2: ()
            // InternalMetaTemplating.g:797:3: 
            {
            }

             after(grammarAccess.getHeaderAccess().getHeaderAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__0__Impl"


    // $ANTLR start "rule__Header__Group__1"
    // InternalMetaTemplating.g:805:1: rule__Header__Group__1 : rule__Header__Group__1__Impl rule__Header__Group__2 ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:809:1: ( rule__Header__Group__1__Impl rule__Header__Group__2 )
            // InternalMetaTemplating.g:810:2: rule__Header__Group__1__Impl rule__Header__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Header__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__1"


    // $ANTLR start "rule__Header__Group__1__Impl"
    // InternalMetaTemplating.g:817:1: rule__Header__Group__1__Impl : ( ( rule__Header__LibsAssignment_1 )* ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:821:1: ( ( ( rule__Header__LibsAssignment_1 )* ) )
            // InternalMetaTemplating.g:822:1: ( ( rule__Header__LibsAssignment_1 )* )
            {
            // InternalMetaTemplating.g:822:1: ( ( rule__Header__LibsAssignment_1 )* )
            // InternalMetaTemplating.g:823:2: ( rule__Header__LibsAssignment_1 )*
            {
             before(grammarAccess.getHeaderAccess().getLibsAssignment_1()); 
            // InternalMetaTemplating.g:824:2: ( rule__Header__LibsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMetaTemplating.g:824:3: rule__Header__LibsAssignment_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Header__LibsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getHeaderAccess().getLibsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__1__Impl"


    // $ANTLR start "rule__Header__Group__2"
    // InternalMetaTemplating.g:832:1: rule__Header__Group__2 : rule__Header__Group__2__Impl ;
    public final void rule__Header__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:836:1: ( rule__Header__Group__2__Impl )
            // InternalMetaTemplating.g:837:2: rule__Header__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Header__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__2"


    // $ANTLR start "rule__Header__Group__2__Impl"
    // InternalMetaTemplating.g:843:1: rule__Header__Group__2__Impl : ( ( rule__Header__ImportsAssignment_2 )* ) ;
    public final void rule__Header__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:847:1: ( ( ( rule__Header__ImportsAssignment_2 )* ) )
            // InternalMetaTemplating.g:848:1: ( ( rule__Header__ImportsAssignment_2 )* )
            {
            // InternalMetaTemplating.g:848:1: ( ( rule__Header__ImportsAssignment_2 )* )
            // InternalMetaTemplating.g:849:2: ( rule__Header__ImportsAssignment_2 )*
            {
             before(grammarAccess.getHeaderAccess().getImportsAssignment_2()); 
            // InternalMetaTemplating.g:850:2: ( rule__Header__ImportsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMetaTemplating.g:850:3: rule__Header__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Header__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getHeaderAccess().getImportsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalMetaTemplating.g:859:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:863:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMetaTemplating.g:864:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalMetaTemplating.g:871:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:875:1: ( ( 'import' ) )
            // InternalMetaTemplating.g:876:1: ( 'import' )
            {
            // InternalMetaTemplating.g:876:1: ( 'import' )
            // InternalMetaTemplating.g:877:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalMetaTemplating.g:886:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:890:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalMetaTemplating.g:891:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Import__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalMetaTemplating.g:898:1: rule__Import__Group__1__Impl : ( ( rule__Import__PathAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:902:1: ( ( ( rule__Import__PathAssignment_1 ) ) )
            // InternalMetaTemplating.g:903:1: ( ( rule__Import__PathAssignment_1 ) )
            {
            // InternalMetaTemplating.g:903:1: ( ( rule__Import__PathAssignment_1 ) )
            // InternalMetaTemplating.g:904:2: ( rule__Import__PathAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getPathAssignment_1()); 
            // InternalMetaTemplating.g:905:2: ( rule__Import__PathAssignment_1 )
            // InternalMetaTemplating.g:905:3: rule__Import__PathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__PathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getPathAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // InternalMetaTemplating.g:913:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:917:1: ( rule__Import__Group__2__Impl )
            // InternalMetaTemplating.g:918:2: rule__Import__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // InternalMetaTemplating.g:924:1: rule__Import__Group__2__Impl : ( ';' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:928:1: ( ( ';' ) )
            // InternalMetaTemplating.g:929:1: ( ';' )
            {
            // InternalMetaTemplating.g:929:1: ( ';' )
            // InternalMetaTemplating.g:930:2: ';'
            {
             before(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__Libraries__Group__0"
    // InternalMetaTemplating.g:940:1: rule__Libraries__Group__0 : rule__Libraries__Group__0__Impl rule__Libraries__Group__1 ;
    public final void rule__Libraries__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:944:1: ( rule__Libraries__Group__0__Impl rule__Libraries__Group__1 )
            // InternalMetaTemplating.g:945:2: rule__Libraries__Group__0__Impl rule__Libraries__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Libraries__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Libraries__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Libraries__Group__0"


    // $ANTLR start "rule__Libraries__Group__0__Impl"
    // InternalMetaTemplating.g:952:1: rule__Libraries__Group__0__Impl : ( 'IMPORT' ) ;
    public final void rule__Libraries__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:956:1: ( ( 'IMPORT' ) )
            // InternalMetaTemplating.g:957:1: ( 'IMPORT' )
            {
            // InternalMetaTemplating.g:957:1: ( 'IMPORT' )
            // InternalMetaTemplating.g:958:2: 'IMPORT'
            {
             before(grammarAccess.getLibrariesAccess().getIMPORTKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLibrariesAccess().getIMPORTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Libraries__Group__0__Impl"


    // $ANTLR start "rule__Libraries__Group__1"
    // InternalMetaTemplating.g:967:1: rule__Libraries__Group__1 : rule__Libraries__Group__1__Impl rule__Libraries__Group__2 ;
    public final void rule__Libraries__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:971:1: ( rule__Libraries__Group__1__Impl rule__Libraries__Group__2 )
            // InternalMetaTemplating.g:972:2: rule__Libraries__Group__1__Impl rule__Libraries__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Libraries__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Libraries__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Libraries__Group__1"


    // $ANTLR start "rule__Libraries__Group__1__Impl"
    // InternalMetaTemplating.g:979:1: rule__Libraries__Group__1__Impl : ( ( rule__Libraries__PathAssignment_1 ) ) ;
    public final void rule__Libraries__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:983:1: ( ( ( rule__Libraries__PathAssignment_1 ) ) )
            // InternalMetaTemplating.g:984:1: ( ( rule__Libraries__PathAssignment_1 ) )
            {
            // InternalMetaTemplating.g:984:1: ( ( rule__Libraries__PathAssignment_1 ) )
            // InternalMetaTemplating.g:985:2: ( rule__Libraries__PathAssignment_1 )
            {
             before(grammarAccess.getLibrariesAccess().getPathAssignment_1()); 
            // InternalMetaTemplating.g:986:2: ( rule__Libraries__PathAssignment_1 )
            // InternalMetaTemplating.g:986:3: rule__Libraries__PathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Libraries__PathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLibrariesAccess().getPathAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Libraries__Group__1__Impl"


    // $ANTLR start "rule__Libraries__Group__2"
    // InternalMetaTemplating.g:994:1: rule__Libraries__Group__2 : rule__Libraries__Group__2__Impl ;
    public final void rule__Libraries__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:998:1: ( rule__Libraries__Group__2__Impl )
            // InternalMetaTemplating.g:999:2: rule__Libraries__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Libraries__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Libraries__Group__2"


    // $ANTLR start "rule__Libraries__Group__2__Impl"
    // InternalMetaTemplating.g:1005:1: rule__Libraries__Group__2__Impl : ( ';' ) ;
    public final void rule__Libraries__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1009:1: ( ( ';' ) )
            // InternalMetaTemplating.g:1010:1: ( ';' )
            {
            // InternalMetaTemplating.g:1010:1: ( ';' )
            // InternalMetaTemplating.g:1011:2: ';'
            {
             before(grammarAccess.getLibrariesAccess().getSemicolonKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLibrariesAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Libraries__Group__2__Impl"


    // $ANTLR start "rule__Comment__Group_0__0"
    // InternalMetaTemplating.g:1021:1: rule__Comment__Group_0__0 : rule__Comment__Group_0__0__Impl rule__Comment__Group_0__1 ;
    public final void rule__Comment__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1025:1: ( rule__Comment__Group_0__0__Impl rule__Comment__Group_0__1 )
            // InternalMetaTemplating.g:1026:2: rule__Comment__Group_0__0__Impl rule__Comment__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__Comment__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comment__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group_0__0"


    // $ANTLR start "rule__Comment__Group_0__0__Impl"
    // InternalMetaTemplating.g:1033:1: rule__Comment__Group_0__0__Impl : ( '//' ) ;
    public final void rule__Comment__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1037:1: ( ( '//' ) )
            // InternalMetaTemplating.g:1038:1: ( '//' )
            {
            // InternalMetaTemplating.g:1038:1: ( '//' )
            // InternalMetaTemplating.g:1039:2: '//'
            {
             before(grammarAccess.getCommentAccess().getSolidusSolidusKeyword_0_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getSolidusSolidusKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group_0__0__Impl"


    // $ANTLR start "rule__Comment__Group_0__1"
    // InternalMetaTemplating.g:1048:1: rule__Comment__Group_0__1 : rule__Comment__Group_0__1__Impl ;
    public final void rule__Comment__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1052:1: ( rule__Comment__Group_0__1__Impl )
            // InternalMetaTemplating.g:1053:2: rule__Comment__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comment__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group_0__1"


    // $ANTLR start "rule__Comment__Group_0__1__Impl"
    // InternalMetaTemplating.g:1059:1: rule__Comment__Group_0__1__Impl : ( ( rule__Comment__WordAssignment_0_1 ) ) ;
    public final void rule__Comment__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1063:1: ( ( ( rule__Comment__WordAssignment_0_1 ) ) )
            // InternalMetaTemplating.g:1064:1: ( ( rule__Comment__WordAssignment_0_1 ) )
            {
            // InternalMetaTemplating.g:1064:1: ( ( rule__Comment__WordAssignment_0_1 ) )
            // InternalMetaTemplating.g:1065:2: ( rule__Comment__WordAssignment_0_1 )
            {
             before(grammarAccess.getCommentAccess().getWordAssignment_0_1()); 
            // InternalMetaTemplating.g:1066:2: ( rule__Comment__WordAssignment_0_1 )
            // InternalMetaTemplating.g:1066:3: rule__Comment__WordAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Comment__WordAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getWordAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group_0__1__Impl"


    // $ANTLR start "rule__Comment__Group_1__0"
    // InternalMetaTemplating.g:1075:1: rule__Comment__Group_1__0 : rule__Comment__Group_1__0__Impl rule__Comment__Group_1__1 ;
    public final void rule__Comment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1079:1: ( rule__Comment__Group_1__0__Impl rule__Comment__Group_1__1 )
            // InternalMetaTemplating.g:1080:2: rule__Comment__Group_1__0__Impl rule__Comment__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Comment__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comment__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group_1__0"


    // $ANTLR start "rule__Comment__Group_1__0__Impl"
    // InternalMetaTemplating.g:1087:1: rule__Comment__Group_1__0__Impl : ( '/*' ) ;
    public final void rule__Comment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1091:1: ( ( '/*' ) )
            // InternalMetaTemplating.g:1092:1: ( '/*' )
            {
            // InternalMetaTemplating.g:1092:1: ( '/*' )
            // InternalMetaTemplating.g:1093:2: '/*'
            {
             before(grammarAccess.getCommentAccess().getSolidusAsteriskKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getSolidusAsteriskKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group_1__0__Impl"


    // $ANTLR start "rule__Comment__Group_1__1"
    // InternalMetaTemplating.g:1102:1: rule__Comment__Group_1__1 : rule__Comment__Group_1__1__Impl rule__Comment__Group_1__2 ;
    public final void rule__Comment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1106:1: ( rule__Comment__Group_1__1__Impl rule__Comment__Group_1__2 )
            // InternalMetaTemplating.g:1107:2: rule__Comment__Group_1__1__Impl rule__Comment__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__Comment__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comment__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group_1__1"


    // $ANTLR start "rule__Comment__Group_1__1__Impl"
    // InternalMetaTemplating.g:1114:1: rule__Comment__Group_1__1__Impl : ( ( rule__Comment__WordAssignment_1_1 ) ) ;
    public final void rule__Comment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1118:1: ( ( ( rule__Comment__WordAssignment_1_1 ) ) )
            // InternalMetaTemplating.g:1119:1: ( ( rule__Comment__WordAssignment_1_1 ) )
            {
            // InternalMetaTemplating.g:1119:1: ( ( rule__Comment__WordAssignment_1_1 ) )
            // InternalMetaTemplating.g:1120:2: ( rule__Comment__WordAssignment_1_1 )
            {
             before(grammarAccess.getCommentAccess().getWordAssignment_1_1()); 
            // InternalMetaTemplating.g:1121:2: ( rule__Comment__WordAssignment_1_1 )
            // InternalMetaTemplating.g:1121:3: rule__Comment__WordAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Comment__WordAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getWordAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group_1__1__Impl"


    // $ANTLR start "rule__Comment__Group_1__2"
    // InternalMetaTemplating.g:1129:1: rule__Comment__Group_1__2 : rule__Comment__Group_1__2__Impl ;
    public final void rule__Comment__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1133:1: ( rule__Comment__Group_1__2__Impl )
            // InternalMetaTemplating.g:1134:2: rule__Comment__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comment__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group_1__2"


    // $ANTLR start "rule__Comment__Group_1__2__Impl"
    // InternalMetaTemplating.g:1140:1: rule__Comment__Group_1__2__Impl : ( '*/' ) ;
    public final void rule__Comment__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1144:1: ( ( '*/' ) )
            // InternalMetaTemplating.g:1145:1: ( '*/' )
            {
            // InternalMetaTemplating.g:1145:1: ( '*/' )
            // InternalMetaTemplating.g:1146:2: '*/'
            {
             before(grammarAccess.getCommentAccess().getAsteriskSolidusKeyword_1_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getAsteriskSolidusKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group_1__2__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalMetaTemplating.g:1156:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1160:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalMetaTemplating.g:1161:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalMetaTemplating.g:1168:1: rule__Rule__Group__0__Impl : ( 'FORALL' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1172:1: ( ( 'FORALL' ) )
            // InternalMetaTemplating.g:1173:1: ( 'FORALL' )
            {
            // InternalMetaTemplating.g:1173:1: ( 'FORALL' )
            // InternalMetaTemplating.g:1174:2: 'FORALL'
            {
             before(grammarAccess.getRuleAccess().getFORALLKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getFORALLKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalMetaTemplating.g:1183:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1187:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalMetaTemplating.g:1188:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalMetaTemplating.g:1195:1: rule__Rule__Group__1__Impl : ( '(' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1199:1: ( ( '(' ) )
            // InternalMetaTemplating.g:1200:1: ( '(' )
            {
            // InternalMetaTemplating.g:1200:1: ( '(' )
            // InternalMetaTemplating.g:1201:2: '('
            {
             before(grammarAccess.getRuleAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalMetaTemplating.g:1210:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1214:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalMetaTemplating.g:1215:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalMetaTemplating.g:1222:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__ElementAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1226:1: ( ( ( rule__Rule__ElementAssignment_2 ) ) )
            // InternalMetaTemplating.g:1227:1: ( ( rule__Rule__ElementAssignment_2 ) )
            {
            // InternalMetaTemplating.g:1227:1: ( ( rule__Rule__ElementAssignment_2 ) )
            // InternalMetaTemplating.g:1228:2: ( rule__Rule__ElementAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getElementAssignment_2()); 
            // InternalMetaTemplating.g:1229:2: ( rule__Rule__ElementAssignment_2 )
            // InternalMetaTemplating.g:1229:3: rule__Rule__ElementAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ElementAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getElementAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalMetaTemplating.g:1237:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1241:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalMetaTemplating.g:1242:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalMetaTemplating.g:1249:1: rule__Rule__Group__3__Impl : ( ':' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1253:1: ( ( ':' ) )
            // InternalMetaTemplating.g:1254:1: ( ':' )
            {
            // InternalMetaTemplating.g:1254:1: ( ':' )
            // InternalMetaTemplating.g:1255:2: ':'
            {
             before(grammarAccess.getRuleAccess().getColonKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalMetaTemplating.g:1264:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1268:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalMetaTemplating.g:1269:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalMetaTemplating.g:1276:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__PropertyAssignment_4 ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1280:1: ( ( ( rule__Rule__PropertyAssignment_4 ) ) )
            // InternalMetaTemplating.g:1281:1: ( ( rule__Rule__PropertyAssignment_4 ) )
            {
            // InternalMetaTemplating.g:1281:1: ( ( rule__Rule__PropertyAssignment_4 ) )
            // InternalMetaTemplating.g:1282:2: ( rule__Rule__PropertyAssignment_4 )
            {
             before(grammarAccess.getRuleAccess().getPropertyAssignment_4()); 
            // InternalMetaTemplating.g:1283:2: ( rule__Rule__PropertyAssignment_4 )
            // InternalMetaTemplating.g:1283:3: rule__Rule__PropertyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Rule__PropertyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPropertyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // InternalMetaTemplating.g:1291:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1295:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalMetaTemplating.g:1296:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Rule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // InternalMetaTemplating.g:1303:1: rule__Rule__Group__5__Impl : ( 'TAGGED' ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1307:1: ( ( 'TAGGED' ) )
            // InternalMetaTemplating.g:1308:1: ( 'TAGGED' )
            {
            // InternalMetaTemplating.g:1308:1: ( 'TAGGED' )
            // InternalMetaTemplating.g:1309:2: 'TAGGED'
            {
             before(grammarAccess.getRuleAccess().getTAGGEDKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getTAGGEDKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group__6"
    // InternalMetaTemplating.g:1318:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1322:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // InternalMetaTemplating.g:1323:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__Rule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6"


    // $ANTLR start "rule__Rule__Group__6__Impl"
    // InternalMetaTemplating.g:1330:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__TagAssignment_6 ) ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1334:1: ( ( ( rule__Rule__TagAssignment_6 ) ) )
            // InternalMetaTemplating.g:1335:1: ( ( rule__Rule__TagAssignment_6 ) )
            {
            // InternalMetaTemplating.g:1335:1: ( ( rule__Rule__TagAssignment_6 ) )
            // InternalMetaTemplating.g:1336:2: ( rule__Rule__TagAssignment_6 )
            {
             before(grammarAccess.getRuleAccess().getTagAssignment_6()); 
            // InternalMetaTemplating.g:1337:2: ( rule__Rule__TagAssignment_6 )
            // InternalMetaTemplating.g:1337:3: rule__Rule__TagAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Rule__TagAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getTagAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6__Impl"


    // $ANTLR start "rule__Rule__Group__7"
    // InternalMetaTemplating.g:1345:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl rule__Rule__Group__8 ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1349:1: ( rule__Rule__Group__7__Impl rule__Rule__Group__8 )
            // InternalMetaTemplating.g:1350:2: rule__Rule__Group__7__Impl rule__Rule__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Rule__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__7"


    // $ANTLR start "rule__Rule__Group__7__Impl"
    // InternalMetaTemplating.g:1357:1: rule__Rule__Group__7__Impl : ( ')' ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1361:1: ( ( ')' ) )
            // InternalMetaTemplating.g:1362:1: ( ')' )
            {
            // InternalMetaTemplating.g:1362:1: ( ')' )
            // InternalMetaTemplating.g:1363:2: ')'
            {
             before(grammarAccess.getRuleAccess().getRightParenthesisKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__7__Impl"


    // $ANTLR start "rule__Rule__Group__8"
    // InternalMetaTemplating.g:1372:1: rule__Rule__Group__8 : rule__Rule__Group__8__Impl rule__Rule__Group__9 ;
    public final void rule__Rule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1376:1: ( rule__Rule__Group__8__Impl rule__Rule__Group__9 )
            // InternalMetaTemplating.g:1377:2: rule__Rule__Group__8__Impl rule__Rule__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__Rule__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__8"


    // $ANTLR start "rule__Rule__Group__8__Impl"
    // InternalMetaTemplating.g:1384:1: rule__Rule__Group__8__Impl : ( '{' ) ;
    public final void rule__Rule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1388:1: ( ( '{' ) )
            // InternalMetaTemplating.g:1389:1: ( '{' )
            {
            // InternalMetaTemplating.g:1389:1: ( '{' )
            // InternalMetaTemplating.g:1390:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__8__Impl"


    // $ANTLR start "rule__Rule__Group__9"
    // InternalMetaTemplating.g:1399:1: rule__Rule__Group__9 : rule__Rule__Group__9__Impl rule__Rule__Group__10 ;
    public final void rule__Rule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1403:1: ( rule__Rule__Group__9__Impl rule__Rule__Group__10 )
            // InternalMetaTemplating.g:1404:2: rule__Rule__Group__9__Impl rule__Rule__Group__10
            {
            pushFollow(FOLLOW_17);
            rule__Rule__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__9"


    // $ANTLR start "rule__Rule__Group__9__Impl"
    // InternalMetaTemplating.g:1411:1: rule__Rule__Group__9__Impl : ( ( rule__Rule__BodyAssignment_9 )* ) ;
    public final void rule__Rule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1415:1: ( ( ( rule__Rule__BodyAssignment_9 )* ) )
            // InternalMetaTemplating.g:1416:1: ( ( rule__Rule__BodyAssignment_9 )* )
            {
            // InternalMetaTemplating.g:1416:1: ( ( rule__Rule__BodyAssignment_9 )* )
            // InternalMetaTemplating.g:1417:2: ( rule__Rule__BodyAssignment_9 )*
            {
             before(grammarAccess.getRuleAccess().getBodyAssignment_9()); 
            // InternalMetaTemplating.g:1418:2: ( rule__Rule__BodyAssignment_9 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==11||LA10_0==14||(LA10_0>=26 && LA10_0<=27)||LA10_0==29||LA10_0==31||LA10_0==35||LA10_0==39) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMetaTemplating.g:1418:3: rule__Rule__BodyAssignment_9
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Rule__BodyAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getBodyAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__9__Impl"


    // $ANTLR start "rule__Rule__Group__10"
    // InternalMetaTemplating.g:1426:1: rule__Rule__Group__10 : rule__Rule__Group__10__Impl ;
    public final void rule__Rule__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1430:1: ( rule__Rule__Group__10__Impl )
            // InternalMetaTemplating.g:1431:2: rule__Rule__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__10"


    // $ANTLR start "rule__Rule__Group__10__Impl"
    // InternalMetaTemplating.g:1437:1: rule__Rule__Group__10__Impl : ( '}' ) ;
    public final void rule__Rule__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1441:1: ( ( '}' ) )
            // InternalMetaTemplating.g:1442:1: ( '}' )
            {
            // InternalMetaTemplating.g:1442:1: ( '}' )
            // InternalMetaTemplating.g:1443:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_10()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__10__Impl"


    // $ANTLR start "rule__Iterator__Group__0"
    // InternalMetaTemplating.g:1453:1: rule__Iterator__Group__0 : rule__Iterator__Group__0__Impl rule__Iterator__Group__1 ;
    public final void rule__Iterator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1457:1: ( rule__Iterator__Group__0__Impl rule__Iterator__Group__1 )
            // InternalMetaTemplating.g:1458:2: rule__Iterator__Group__0__Impl rule__Iterator__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Iterator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Iterator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iterator__Group__0"


    // $ANTLR start "rule__Iterator__Group__0__Impl"
    // InternalMetaTemplating.g:1465:1: rule__Iterator__Group__0__Impl : ( 'foreach' ) ;
    public final void rule__Iterator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1469:1: ( ( 'foreach' ) )
            // InternalMetaTemplating.g:1470:1: ( 'foreach' )
            {
            // InternalMetaTemplating.g:1470:1: ( 'foreach' )
            // InternalMetaTemplating.g:1471:2: 'foreach'
            {
             before(grammarAccess.getIteratorAccess().getForeachKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getIteratorAccess().getForeachKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iterator__Group__0__Impl"


    // $ANTLR start "rule__Iterator__Group__1"
    // InternalMetaTemplating.g:1480:1: rule__Iterator__Group__1 : rule__Iterator__Group__1__Impl rule__Iterator__Group__2 ;
    public final void rule__Iterator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1484:1: ( rule__Iterator__Group__1__Impl rule__Iterator__Group__2 )
            // InternalMetaTemplating.g:1485:2: rule__Iterator__Group__1__Impl rule__Iterator__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Iterator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Iterator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iterator__Group__1"


    // $ANTLR start "rule__Iterator__Group__1__Impl"
    // InternalMetaTemplating.g:1492:1: rule__Iterator__Group__1__Impl : ( '(' ) ;
    public final void rule__Iterator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1496:1: ( ( '(' ) )
            // InternalMetaTemplating.g:1497:1: ( '(' )
            {
            // InternalMetaTemplating.g:1497:1: ( '(' )
            // InternalMetaTemplating.g:1498:2: '('
            {
             before(grammarAccess.getIteratorAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getIteratorAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iterator__Group__1__Impl"


    // $ANTLR start "rule__Iterator__Group__2"
    // InternalMetaTemplating.g:1507:1: rule__Iterator__Group__2 : rule__Iterator__Group__2__Impl rule__Iterator__Group__3 ;
    public final void rule__Iterator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1511:1: ( rule__Iterator__Group__2__Impl rule__Iterator__Group__3 )
            // InternalMetaTemplating.g:1512:2: rule__Iterator__Group__2__Impl rule__Iterator__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Iterator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Iterator__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iterator__Group__2"


    // $ANTLR start "rule__Iterator__Group__2__Impl"
    // InternalMetaTemplating.g:1519:1: rule__Iterator__Group__2__Impl : ( ( rule__Iterator__ElementAssignment_2 ) ) ;
    public final void rule__Iterator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1523:1: ( ( ( rule__Iterator__ElementAssignment_2 ) ) )
            // InternalMetaTemplating.g:1524:1: ( ( rule__Iterator__ElementAssignment_2 ) )
            {
            // InternalMetaTemplating.g:1524:1: ( ( rule__Iterator__ElementAssignment_2 ) )
            // InternalMetaTemplating.g:1525:2: ( rule__Iterator__ElementAssignment_2 )
            {
             before(grammarAccess.getIteratorAccess().getElementAssignment_2()); 
            // InternalMetaTemplating.g:1526:2: ( rule__Iterator__ElementAssignment_2 )
            // InternalMetaTemplating.g:1526:3: rule__Iterator__ElementAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Iterator__ElementAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIteratorAccess().getElementAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iterator__Group__2__Impl"


    // $ANTLR start "rule__Iterator__Group__3"
    // InternalMetaTemplating.g:1534:1: rule__Iterator__Group__3 : rule__Iterator__Group__3__Impl rule__Iterator__Group__4 ;
    public final void rule__Iterator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1538:1: ( rule__Iterator__Group__3__Impl rule__Iterator__Group__4 )
            // InternalMetaTemplating.g:1539:2: rule__Iterator__Group__3__Impl rule__Iterator__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Iterator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Iterator__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iterator__Group__3"


    // $ANTLR start "rule__Iterator__Group__3__Impl"
    // InternalMetaTemplating.g:1546:1: rule__Iterator__Group__3__Impl : ( 'in' ) ;
    public final void rule__Iterator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1550:1: ( ( 'in' ) )
            // InternalMetaTemplating.g:1551:1: ( 'in' )
            {
            // InternalMetaTemplating.g:1551:1: ( 'in' )
            // InternalMetaTemplating.g:1552:2: 'in'
            {
             before(grammarAccess.getIteratorAccess().getInKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getIteratorAccess().getInKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iterator__Group__3__Impl"


    // $ANTLR start "rule__Iterator__Group__4"
    // InternalMetaTemplating.g:1561:1: rule__Iterator__Group__4 : rule__Iterator__Group__4__Impl rule__Iterator__Group__5 ;
    public final void rule__Iterator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1565:1: ( rule__Iterator__Group__4__Impl rule__Iterator__Group__5 )
            // InternalMetaTemplating.g:1566:2: rule__Iterator__Group__4__Impl rule__Iterator__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Iterator__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Iterator__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iterator__Group__4"


    // $ANTLR start "rule__Iterator__Group__4__Impl"
    // InternalMetaTemplating.g:1573:1: rule__Iterator__Group__4__Impl : ( ( rule__Iterator__QueryAssignment_4 ) ) ;
    public final void rule__Iterator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1577:1: ( ( ( rule__Iterator__QueryAssignment_4 ) ) )
            // InternalMetaTemplating.g:1578:1: ( ( rule__Iterator__QueryAssignment_4 ) )
            {
            // InternalMetaTemplating.g:1578:1: ( ( rule__Iterator__QueryAssignment_4 ) )
            // InternalMetaTemplating.g:1579:2: ( rule__Iterator__QueryAssignment_4 )
            {
             before(grammarAccess.getIteratorAccess().getQueryAssignment_4()); 
            // InternalMetaTemplating.g:1580:2: ( rule__Iterator__QueryAssignment_4 )
            // InternalMetaTemplating.g:1580:3: rule__Iterator__QueryAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Iterator__QueryAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIteratorAccess().getQueryAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iterator__Group__4__Impl"


    // $ANTLR start "rule__Iterator__Group__5"
    // InternalMetaTemplating.g:1588:1: rule__Iterator__Group__5 : rule__Iterator__Group__5__Impl rule__Iterator__Group__6 ;
    public final void rule__Iterator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1592:1: ( rule__Iterator__Group__5__Impl rule__Iterator__Group__6 )
            // InternalMetaTemplating.g:1593:2: rule__Iterator__Group__5__Impl rule__Iterator__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Iterator__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Iterator__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iterator__Group__5"


    // $ANTLR start "rule__Iterator__Group__5__Impl"
    // InternalMetaTemplating.g:1600:1: rule__Iterator__Group__5__Impl : ( ')' ) ;
    public final void rule__Iterator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1604:1: ( ( ')' ) )
            // InternalMetaTemplating.g:1605:1: ( ')' )
            {
            // InternalMetaTemplating.g:1605:1: ( ')' )
            // InternalMetaTemplating.g:1606:2: ')'
            {
             before(grammarAccess.getIteratorAccess().getRightParenthesisKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getIteratorAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iterator__Group__5__Impl"


    // $ANTLR start "rule__Iterator__Group__6"
    // InternalMetaTemplating.g:1615:1: rule__Iterator__Group__6 : rule__Iterator__Group__6__Impl rule__Iterator__Group__7 ;
    public final void rule__Iterator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1619:1: ( rule__Iterator__Group__6__Impl rule__Iterator__Group__7 )
            // InternalMetaTemplating.g:1620:2: rule__Iterator__Group__6__Impl rule__Iterator__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Iterator__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Iterator__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iterator__Group__6"


    // $ANTLR start "rule__Iterator__Group__6__Impl"
    // InternalMetaTemplating.g:1627:1: rule__Iterator__Group__6__Impl : ( '{' ) ;
    public final void rule__Iterator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1631:1: ( ( '{' ) )
            // InternalMetaTemplating.g:1632:1: ( '{' )
            {
            // InternalMetaTemplating.g:1632:1: ( '{' )
            // InternalMetaTemplating.g:1633:2: '{'
            {
             before(grammarAccess.getIteratorAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getIteratorAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iterator__Group__6__Impl"


    // $ANTLR start "rule__Iterator__Group__7"
    // InternalMetaTemplating.g:1642:1: rule__Iterator__Group__7 : rule__Iterator__Group__7__Impl rule__Iterator__Group__8 ;
    public final void rule__Iterator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1646:1: ( rule__Iterator__Group__7__Impl rule__Iterator__Group__8 )
            // InternalMetaTemplating.g:1647:2: rule__Iterator__Group__7__Impl rule__Iterator__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__Iterator__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Iterator__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iterator__Group__7"


    // $ANTLR start "rule__Iterator__Group__7__Impl"
    // InternalMetaTemplating.g:1654:1: rule__Iterator__Group__7__Impl : ( ( rule__Iterator__BodyAssignment_7 )* ) ;
    public final void rule__Iterator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1658:1: ( ( ( rule__Iterator__BodyAssignment_7 )* ) )
            // InternalMetaTemplating.g:1659:1: ( ( rule__Iterator__BodyAssignment_7 )* )
            {
            // InternalMetaTemplating.g:1659:1: ( ( rule__Iterator__BodyAssignment_7 )* )
            // InternalMetaTemplating.g:1660:2: ( rule__Iterator__BodyAssignment_7 )*
            {
             before(grammarAccess.getIteratorAccess().getBodyAssignment_7()); 
            // InternalMetaTemplating.g:1661:2: ( rule__Iterator__BodyAssignment_7 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==11||LA11_0==14||(LA11_0>=26 && LA11_0<=27)||LA11_0==29||LA11_0==31||LA11_0==35||LA11_0==39) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMetaTemplating.g:1661:3: rule__Iterator__BodyAssignment_7
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Iterator__BodyAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getIteratorAccess().getBodyAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iterator__Group__7__Impl"


    // $ANTLR start "rule__Iterator__Group__8"
    // InternalMetaTemplating.g:1669:1: rule__Iterator__Group__8 : rule__Iterator__Group__8__Impl ;
    public final void rule__Iterator__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1673:1: ( rule__Iterator__Group__8__Impl )
            // InternalMetaTemplating.g:1674:2: rule__Iterator__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Iterator__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iterator__Group__8"


    // $ANTLR start "rule__Iterator__Group__8__Impl"
    // InternalMetaTemplating.g:1680:1: rule__Iterator__Group__8__Impl : ( '}' ) ;
    public final void rule__Iterator__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1684:1: ( ( '}' ) )
            // InternalMetaTemplating.g:1685:1: ( '}' )
            {
            // InternalMetaTemplating.g:1685:1: ( '}' )
            // InternalMetaTemplating.g:1686:2: '}'
            {
             before(grammarAccess.getIteratorAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getIteratorAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iterator__Group__8__Impl"


    // $ANTLR start "rule__Query__Group__0"
    // InternalMetaTemplating.g:1696:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1700:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // InternalMetaTemplating.g:1701:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Query__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__0"


    // $ANTLR start "rule__Query__Group__0__Impl"
    // InternalMetaTemplating.g:1708:1: rule__Query__Group__0__Impl : ( ( rule__Query__Alternatives_0 ) ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1712:1: ( ( ( rule__Query__Alternatives_0 ) ) )
            // InternalMetaTemplating.g:1713:1: ( ( rule__Query__Alternatives_0 ) )
            {
            // InternalMetaTemplating.g:1713:1: ( ( rule__Query__Alternatives_0 ) )
            // InternalMetaTemplating.g:1714:2: ( rule__Query__Alternatives_0 )
            {
             before(grammarAccess.getQueryAccess().getAlternatives_0()); 
            // InternalMetaTemplating.g:1715:2: ( rule__Query__Alternatives_0 )
            // InternalMetaTemplating.g:1715:3: rule__Query__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Query__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__0__Impl"


    // $ANTLR start "rule__Query__Group__1"
    // InternalMetaTemplating.g:1723:1: rule__Query__Group__1 : rule__Query__Group__1__Impl ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1727:1: ( rule__Query__Group__1__Impl )
            // InternalMetaTemplating.g:1728:2: rule__Query__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__1"


    // $ANTLR start "rule__Query__Group__1__Impl"
    // InternalMetaTemplating.g:1734:1: rule__Query__Group__1__Impl : ( ( rule__Query__SubQueryAssignment_1 )* ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1738:1: ( ( ( rule__Query__SubQueryAssignment_1 )* ) )
            // InternalMetaTemplating.g:1739:1: ( ( rule__Query__SubQueryAssignment_1 )* )
            {
            // InternalMetaTemplating.g:1739:1: ( ( rule__Query__SubQueryAssignment_1 )* )
            // InternalMetaTemplating.g:1740:2: ( rule__Query__SubQueryAssignment_1 )*
            {
             before(grammarAccess.getQueryAccess().getSubQueryAssignment_1()); 
            // InternalMetaTemplating.g:1741:2: ( rule__Query__SubQueryAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMetaTemplating.g:1741:3: rule__Query__SubQueryAssignment_1
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Query__SubQueryAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getQueryAccess().getSubQueryAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__1__Impl"


    // $ANTLR start "rule__SubQuery__Group__0"
    // InternalMetaTemplating.g:1750:1: rule__SubQuery__Group__0 : rule__SubQuery__Group__0__Impl rule__SubQuery__Group__1 ;
    public final void rule__SubQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1754:1: ( rule__SubQuery__Group__0__Impl rule__SubQuery__Group__1 )
            // InternalMetaTemplating.g:1755:2: rule__SubQuery__Group__0__Impl rule__SubQuery__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__SubQuery__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubQuery__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubQuery__Group__0"


    // $ANTLR start "rule__SubQuery__Group__0__Impl"
    // InternalMetaTemplating.g:1762:1: rule__SubQuery__Group__0__Impl : ( '.' ) ;
    public final void rule__SubQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1766:1: ( ( '.' ) )
            // InternalMetaTemplating.g:1767:1: ( '.' )
            {
            // InternalMetaTemplating.g:1767:1: ( '.' )
            // InternalMetaTemplating.g:1768:2: '.'
            {
             before(grammarAccess.getSubQueryAccess().getFullStopKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSubQueryAccess().getFullStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubQuery__Group__0__Impl"


    // $ANTLR start "rule__SubQuery__Group__1"
    // InternalMetaTemplating.g:1777:1: rule__SubQuery__Group__1 : rule__SubQuery__Group__1__Impl rule__SubQuery__Group__2 ;
    public final void rule__SubQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1781:1: ( rule__SubQuery__Group__1__Impl rule__SubQuery__Group__2 )
            // InternalMetaTemplating.g:1782:2: rule__SubQuery__Group__1__Impl rule__SubQuery__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__SubQuery__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubQuery__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubQuery__Group__1"


    // $ANTLR start "rule__SubQuery__Group__1__Impl"
    // InternalMetaTemplating.g:1789:1: rule__SubQuery__Group__1__Impl : ( ( rule__SubQuery__Alternatives_1 ) ) ;
    public final void rule__SubQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1793:1: ( ( ( rule__SubQuery__Alternatives_1 ) ) )
            // InternalMetaTemplating.g:1794:1: ( ( rule__SubQuery__Alternatives_1 ) )
            {
            // InternalMetaTemplating.g:1794:1: ( ( rule__SubQuery__Alternatives_1 ) )
            // InternalMetaTemplating.g:1795:2: ( rule__SubQuery__Alternatives_1 )
            {
             before(grammarAccess.getSubQueryAccess().getAlternatives_1()); 
            // InternalMetaTemplating.g:1796:2: ( rule__SubQuery__Alternatives_1 )
            // InternalMetaTemplating.g:1796:3: rule__SubQuery__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__SubQuery__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getSubQueryAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubQuery__Group__1__Impl"


    // $ANTLR start "rule__SubQuery__Group__2"
    // InternalMetaTemplating.g:1804:1: rule__SubQuery__Group__2 : rule__SubQuery__Group__2__Impl ;
    public final void rule__SubQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1808:1: ( rule__SubQuery__Group__2__Impl )
            // InternalMetaTemplating.g:1809:2: rule__SubQuery__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubQuery__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubQuery__Group__2"


    // $ANTLR start "rule__SubQuery__Group__2__Impl"
    // InternalMetaTemplating.g:1815:1: rule__SubQuery__Group__2__Impl : ( ( '()' )? ) ;
    public final void rule__SubQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1819:1: ( ( ( '()' )? ) )
            // InternalMetaTemplating.g:1820:1: ( ( '()' )? )
            {
            // InternalMetaTemplating.g:1820:1: ( ( '()' )? )
            // InternalMetaTemplating.g:1821:2: ( '()' )?
            {
             before(grammarAccess.getSubQueryAccess().getLeftParenthesisRightParenthesisKeyword_2()); 
            // InternalMetaTemplating.g:1822:2: ( '()' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMetaTemplating.g:1822:3: '()'
                    {
                    match(input,34,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSubQueryAccess().getLeftParenthesisRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubQuery__Group__2__Impl"


    // $ANTLR start "rule__Ph__Group__0"
    // InternalMetaTemplating.g:1831:1: rule__Ph__Group__0 : rule__Ph__Group__0__Impl rule__Ph__Group__1 ;
    public final void rule__Ph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1835:1: ( rule__Ph__Group__0__Impl rule__Ph__Group__1 )
            // InternalMetaTemplating.g:1836:2: rule__Ph__Group__0__Impl rule__Ph__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Ph__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ph__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ph__Group__0"


    // $ANTLR start "rule__Ph__Group__0__Impl"
    // InternalMetaTemplating.g:1843:1: rule__Ph__Group__0__Impl : ( '[[' ) ;
    public final void rule__Ph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1847:1: ( ( '[[' ) )
            // InternalMetaTemplating.g:1848:1: ( '[[' )
            {
            // InternalMetaTemplating.g:1848:1: ( '[[' )
            // InternalMetaTemplating.g:1849:2: '[['
            {
             before(grammarAccess.getPhAccess().getLeftSquareBracketLeftSquareBracketKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPhAccess().getLeftSquareBracketLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ph__Group__0__Impl"


    // $ANTLR start "rule__Ph__Group__1"
    // InternalMetaTemplating.g:1858:1: rule__Ph__Group__1 : rule__Ph__Group__1__Impl rule__Ph__Group__2 ;
    public final void rule__Ph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1862:1: ( rule__Ph__Group__1__Impl rule__Ph__Group__2 )
            // InternalMetaTemplating.g:1863:2: rule__Ph__Group__1__Impl rule__Ph__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Ph__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ph__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ph__Group__1"


    // $ANTLR start "rule__Ph__Group__1__Impl"
    // InternalMetaTemplating.g:1870:1: rule__Ph__Group__1__Impl : ( ( rule__Ph__PropertyAssignment_1 ) ) ;
    public final void rule__Ph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1874:1: ( ( ( rule__Ph__PropertyAssignment_1 ) ) )
            // InternalMetaTemplating.g:1875:1: ( ( rule__Ph__PropertyAssignment_1 ) )
            {
            // InternalMetaTemplating.g:1875:1: ( ( rule__Ph__PropertyAssignment_1 ) )
            // InternalMetaTemplating.g:1876:2: ( rule__Ph__PropertyAssignment_1 )
            {
             before(grammarAccess.getPhAccess().getPropertyAssignment_1()); 
            // InternalMetaTemplating.g:1877:2: ( rule__Ph__PropertyAssignment_1 )
            // InternalMetaTemplating.g:1877:3: rule__Ph__PropertyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ph__PropertyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPhAccess().getPropertyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ph__Group__1__Impl"


    // $ANTLR start "rule__Ph__Group__2"
    // InternalMetaTemplating.g:1885:1: rule__Ph__Group__2 : rule__Ph__Group__2__Impl rule__Ph__Group__3 ;
    public final void rule__Ph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1889:1: ( rule__Ph__Group__2__Impl rule__Ph__Group__3 )
            // InternalMetaTemplating.g:1890:2: rule__Ph__Group__2__Impl rule__Ph__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Ph__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ph__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ph__Group__2"


    // $ANTLR start "rule__Ph__Group__2__Impl"
    // InternalMetaTemplating.g:1897:1: rule__Ph__Group__2__Impl : ( ( rule__Ph__MetaPropertyAssignment_2 )? ) ;
    public final void rule__Ph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1901:1: ( ( ( rule__Ph__MetaPropertyAssignment_2 )? ) )
            // InternalMetaTemplating.g:1902:1: ( ( rule__Ph__MetaPropertyAssignment_2 )? )
            {
            // InternalMetaTemplating.g:1902:1: ( ( rule__Ph__MetaPropertyAssignment_2 )? )
            // InternalMetaTemplating.g:1903:2: ( rule__Ph__MetaPropertyAssignment_2 )?
            {
             before(grammarAccess.getPhAccess().getMetaPropertyAssignment_2()); 
            // InternalMetaTemplating.g:1904:2: ( rule__Ph__MetaPropertyAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMetaTemplating.g:1904:3: rule__Ph__MetaPropertyAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ph__MetaPropertyAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhAccess().getMetaPropertyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ph__Group__2__Impl"


    // $ANTLR start "rule__Ph__Group__3"
    // InternalMetaTemplating.g:1912:1: rule__Ph__Group__3 : rule__Ph__Group__3__Impl ;
    public final void rule__Ph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1916:1: ( rule__Ph__Group__3__Impl )
            // InternalMetaTemplating.g:1917:2: rule__Ph__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ph__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ph__Group__3"


    // $ANTLR start "rule__Ph__Group__3__Impl"
    // InternalMetaTemplating.g:1923:1: rule__Ph__Group__3__Impl : ( ']]' ) ;
    public final void rule__Ph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1927:1: ( ( ']]' ) )
            // InternalMetaTemplating.g:1928:1: ( ']]' )
            {
            // InternalMetaTemplating.g:1928:1: ( ']]' )
            // InternalMetaTemplating.g:1929:2: ']]'
            {
             before(grammarAccess.getPhAccess().getRightSquareBracketRightSquareBracketKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPhAccess().getRightSquareBracketRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ph__Group__3__Impl"


    // $ANTLR start "rule__MetaPh__Group__0"
    // InternalMetaTemplating.g:1939:1: rule__MetaPh__Group__0 : rule__MetaPh__Group__0__Impl rule__MetaPh__Group__1 ;
    public final void rule__MetaPh__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1943:1: ( rule__MetaPh__Group__0__Impl rule__MetaPh__Group__1 )
            // InternalMetaTemplating.g:1944:2: rule__MetaPh__Group__0__Impl rule__MetaPh__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__MetaPh__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaPh__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaPh__Group__0"


    // $ANTLR start "rule__MetaPh__Group__0__Impl"
    // InternalMetaTemplating.g:1951:1: rule__MetaPh__Group__0__Impl : ( '[' ) ;
    public final void rule__MetaPh__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1955:1: ( ( '[' ) )
            // InternalMetaTemplating.g:1956:1: ( '[' )
            {
            // InternalMetaTemplating.g:1956:1: ( '[' )
            // InternalMetaTemplating.g:1957:2: '['
            {
             before(grammarAccess.getMetaPhAccess().getLeftSquareBracketKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMetaPhAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaPh__Group__0__Impl"


    // $ANTLR start "rule__MetaPh__Group__1"
    // InternalMetaTemplating.g:1966:1: rule__MetaPh__Group__1 : rule__MetaPh__Group__1__Impl rule__MetaPh__Group__2 ;
    public final void rule__MetaPh__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1970:1: ( rule__MetaPh__Group__1__Impl rule__MetaPh__Group__2 )
            // InternalMetaTemplating.g:1971:2: rule__MetaPh__Group__1__Impl rule__MetaPh__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__MetaPh__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaPh__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaPh__Group__1"


    // $ANTLR start "rule__MetaPh__Group__1__Impl"
    // InternalMetaTemplating.g:1978:1: rule__MetaPh__Group__1__Impl : ( ( rule__MetaPh__PropertyAssignment_1 ) ) ;
    public final void rule__MetaPh__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1982:1: ( ( ( rule__MetaPh__PropertyAssignment_1 ) ) )
            // InternalMetaTemplating.g:1983:1: ( ( rule__MetaPh__PropertyAssignment_1 ) )
            {
            // InternalMetaTemplating.g:1983:1: ( ( rule__MetaPh__PropertyAssignment_1 ) )
            // InternalMetaTemplating.g:1984:2: ( rule__MetaPh__PropertyAssignment_1 )
            {
             before(grammarAccess.getMetaPhAccess().getPropertyAssignment_1()); 
            // InternalMetaTemplating.g:1985:2: ( rule__MetaPh__PropertyAssignment_1 )
            // InternalMetaTemplating.g:1985:3: rule__MetaPh__PropertyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MetaPh__PropertyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMetaPhAccess().getPropertyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaPh__Group__1__Impl"


    // $ANTLR start "rule__MetaPh__Group__2"
    // InternalMetaTemplating.g:1993:1: rule__MetaPh__Group__2 : rule__MetaPh__Group__2__Impl rule__MetaPh__Group__3 ;
    public final void rule__MetaPh__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1997:1: ( rule__MetaPh__Group__2__Impl rule__MetaPh__Group__3 )
            // InternalMetaTemplating.g:1998:2: rule__MetaPh__Group__2__Impl rule__MetaPh__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__MetaPh__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaPh__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaPh__Group__2"


    // $ANTLR start "rule__MetaPh__Group__2__Impl"
    // InternalMetaTemplating.g:2005:1: rule__MetaPh__Group__2__Impl : ( ( rule__MetaPh__Group_2__0 )? ) ;
    public final void rule__MetaPh__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2009:1: ( ( ( rule__MetaPh__Group_2__0 )? ) )
            // InternalMetaTemplating.g:2010:1: ( ( rule__MetaPh__Group_2__0 )? )
            {
            // InternalMetaTemplating.g:2010:1: ( ( rule__MetaPh__Group_2__0 )? )
            // InternalMetaTemplating.g:2011:2: ( rule__MetaPh__Group_2__0 )?
            {
             before(grammarAccess.getMetaPhAccess().getGroup_2()); 
            // InternalMetaTemplating.g:2012:2: ( rule__MetaPh__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMetaTemplating.g:2012:3: rule__MetaPh__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MetaPh__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMetaPhAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaPh__Group__2__Impl"


    // $ANTLR start "rule__MetaPh__Group__3"
    // InternalMetaTemplating.g:2020:1: rule__MetaPh__Group__3 : rule__MetaPh__Group__3__Impl ;
    public final void rule__MetaPh__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2024:1: ( rule__MetaPh__Group__3__Impl )
            // InternalMetaTemplating.g:2025:2: rule__MetaPh__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MetaPh__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaPh__Group__3"


    // $ANTLR start "rule__MetaPh__Group__3__Impl"
    // InternalMetaTemplating.g:2031:1: rule__MetaPh__Group__3__Impl : ( ']' ) ;
    public final void rule__MetaPh__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2035:1: ( ( ']' ) )
            // InternalMetaTemplating.g:2036:1: ( ']' )
            {
            // InternalMetaTemplating.g:2036:1: ( ']' )
            // InternalMetaTemplating.g:2037:2: ']'
            {
             before(grammarAccess.getMetaPhAccess().getRightSquareBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMetaPhAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaPh__Group__3__Impl"


    // $ANTLR start "rule__MetaPh__Group_2__0"
    // InternalMetaTemplating.g:2047:1: rule__MetaPh__Group_2__0 : rule__MetaPh__Group_2__0__Impl rule__MetaPh__Group_2__1 ;
    public final void rule__MetaPh__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2051:1: ( rule__MetaPh__Group_2__0__Impl rule__MetaPh__Group_2__1 )
            // InternalMetaTemplating.g:2052:2: rule__MetaPh__Group_2__0__Impl rule__MetaPh__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__MetaPh__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaPh__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaPh__Group_2__0"


    // $ANTLR start "rule__MetaPh__Group_2__0__Impl"
    // InternalMetaTemplating.g:2059:1: rule__MetaPh__Group_2__0__Impl : ( 'TAGINFO' ) ;
    public final void rule__MetaPh__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2063:1: ( ( 'TAGINFO' ) )
            // InternalMetaTemplating.g:2064:1: ( 'TAGINFO' )
            {
            // InternalMetaTemplating.g:2064:1: ( 'TAGINFO' )
            // InternalMetaTemplating.g:2065:2: 'TAGINFO'
            {
             before(grammarAccess.getMetaPhAccess().getTAGINFOKeyword_2_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMetaPhAccess().getTAGINFOKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaPh__Group_2__0__Impl"


    // $ANTLR start "rule__MetaPh__Group_2__1"
    // InternalMetaTemplating.g:2074:1: rule__MetaPh__Group_2__1 : rule__MetaPh__Group_2__1__Impl ;
    public final void rule__MetaPh__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2078:1: ( rule__MetaPh__Group_2__1__Impl )
            // InternalMetaTemplating.g:2079:2: rule__MetaPh__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MetaPh__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaPh__Group_2__1"


    // $ANTLR start "rule__MetaPh__Group_2__1__Impl"
    // InternalMetaTemplating.g:2085:1: rule__MetaPh__Group_2__1__Impl : ( ( rule__MetaPh__TagAssignment_2_1 ) ) ;
    public final void rule__MetaPh__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2089:1: ( ( ( rule__MetaPh__TagAssignment_2_1 ) ) )
            // InternalMetaTemplating.g:2090:1: ( ( rule__MetaPh__TagAssignment_2_1 ) )
            {
            // InternalMetaTemplating.g:2090:1: ( ( rule__MetaPh__TagAssignment_2_1 ) )
            // InternalMetaTemplating.g:2091:2: ( rule__MetaPh__TagAssignment_2_1 )
            {
             before(grammarAccess.getMetaPhAccess().getTagAssignment_2_1()); 
            // InternalMetaTemplating.g:2092:2: ( rule__MetaPh__TagAssignment_2_1 )
            // InternalMetaTemplating.g:2092:3: rule__MetaPh__TagAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MetaPh__TagAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMetaPhAccess().getTagAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaPh__Group_2__1__Impl"


    // $ANTLR start "rule__MetaProperty__Group__0"
    // InternalMetaTemplating.g:2101:1: rule__MetaProperty__Group__0 : rule__MetaProperty__Group__0__Impl rule__MetaProperty__Group__1 ;
    public final void rule__MetaProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2105:1: ( rule__MetaProperty__Group__0__Impl rule__MetaProperty__Group__1 )
            // InternalMetaTemplating.g:2106:2: rule__MetaProperty__Group__0__Impl rule__MetaProperty__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__MetaProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaProperty__Group__0"


    // $ANTLR start "rule__MetaProperty__Group__0__Impl"
    // InternalMetaTemplating.g:2113:1: rule__MetaProperty__Group__0__Impl : ( '.{' ) ;
    public final void rule__MetaProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2117:1: ( ( '.{' ) )
            // InternalMetaTemplating.g:2118:1: ( '.{' )
            {
            // InternalMetaTemplating.g:2118:1: ( '.{' )
            // InternalMetaTemplating.g:2119:2: '.{'
            {
             before(grammarAccess.getMetaPropertyAccess().getFullStopLeftCurlyBracketKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMetaPropertyAccess().getFullStopLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaProperty__Group__0__Impl"


    // $ANTLR start "rule__MetaProperty__Group__1"
    // InternalMetaTemplating.g:2128:1: rule__MetaProperty__Group__1 : rule__MetaProperty__Group__1__Impl rule__MetaProperty__Group__2 ;
    public final void rule__MetaProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2132:1: ( rule__MetaProperty__Group__1__Impl rule__MetaProperty__Group__2 )
            // InternalMetaTemplating.g:2133:2: rule__MetaProperty__Group__1__Impl rule__MetaProperty__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__MetaProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaProperty__Group__1"


    // $ANTLR start "rule__MetaProperty__Group__1__Impl"
    // InternalMetaTemplating.g:2140:1: rule__MetaProperty__Group__1__Impl : ( ( rule__MetaProperty__PropertyAssignment_1 ) ) ;
    public final void rule__MetaProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2144:1: ( ( ( rule__MetaProperty__PropertyAssignment_1 ) ) )
            // InternalMetaTemplating.g:2145:1: ( ( rule__MetaProperty__PropertyAssignment_1 ) )
            {
            // InternalMetaTemplating.g:2145:1: ( ( rule__MetaProperty__PropertyAssignment_1 ) )
            // InternalMetaTemplating.g:2146:2: ( rule__MetaProperty__PropertyAssignment_1 )
            {
             before(grammarAccess.getMetaPropertyAccess().getPropertyAssignment_1()); 
            // InternalMetaTemplating.g:2147:2: ( rule__MetaProperty__PropertyAssignment_1 )
            // InternalMetaTemplating.g:2147:3: rule__MetaProperty__PropertyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MetaProperty__PropertyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMetaPropertyAccess().getPropertyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaProperty__Group__1__Impl"


    // $ANTLR start "rule__MetaProperty__Group__2"
    // InternalMetaTemplating.g:2155:1: rule__MetaProperty__Group__2 : rule__MetaProperty__Group__2__Impl ;
    public final void rule__MetaProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2159:1: ( rule__MetaProperty__Group__2__Impl )
            // InternalMetaTemplating.g:2160:2: rule__MetaProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MetaProperty__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaProperty__Group__2"


    // $ANTLR start "rule__MetaProperty__Group__2__Impl"
    // InternalMetaTemplating.g:2166:1: rule__MetaProperty__Group__2__Impl : ( '}' ) ;
    public final void rule__MetaProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2170:1: ( ( '}' ) )
            // InternalMetaTemplating.g:2171:1: ( '}' )
            {
            // InternalMetaTemplating.g:2171:1: ( '}' )
            // InternalMetaTemplating.g:2172:2: '}'
            {
             before(grammarAccess.getMetaPropertyAccess().getRightCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMetaPropertyAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaProperty__Group__2__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // InternalMetaTemplating.g:2182:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2186:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalMetaTemplating.g:2187:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // InternalMetaTemplating.g:2194:1: rule__Property__Group__0__Impl : ( ( rule__Property__PropertyAssignment_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2198:1: ( ( ( rule__Property__PropertyAssignment_0 ) ) )
            // InternalMetaTemplating.g:2199:1: ( ( rule__Property__PropertyAssignment_0 ) )
            {
            // InternalMetaTemplating.g:2199:1: ( ( rule__Property__PropertyAssignment_0 ) )
            // InternalMetaTemplating.g:2200:2: ( rule__Property__PropertyAssignment_0 )
            {
             before(grammarAccess.getPropertyAccess().getPropertyAssignment_0()); 
            // InternalMetaTemplating.g:2201:2: ( rule__Property__PropertyAssignment_0 )
            // InternalMetaTemplating.g:2201:3: rule__Property__PropertyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Property__PropertyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getPropertyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // InternalMetaTemplating.g:2209:1: rule__Property__Group__1 : rule__Property__Group__1__Impl ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2213:1: ( rule__Property__Group__1__Impl )
            // InternalMetaTemplating.g:2214:2: rule__Property__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // InternalMetaTemplating.g:2220:1: rule__Property__Group__1__Impl : ( ( rule__Property__SubPropertiesAssignment_1 )* ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2224:1: ( ( ( rule__Property__SubPropertiesAssignment_1 )* ) )
            // InternalMetaTemplating.g:2225:1: ( ( rule__Property__SubPropertiesAssignment_1 )* )
            {
            // InternalMetaTemplating.g:2225:1: ( ( rule__Property__SubPropertiesAssignment_1 )* )
            // InternalMetaTemplating.g:2226:2: ( rule__Property__SubPropertiesAssignment_1 )*
            {
             before(grammarAccess.getPropertyAccess().getSubPropertiesAssignment_1()); 
            // InternalMetaTemplating.g:2227:2: ( rule__Property__SubPropertiesAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==33) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMetaTemplating.g:2227:3: rule__Property__SubPropertiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Property__SubPropertiesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getPropertyAccess().getSubPropertiesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__SubProperty__Group__0"
    // InternalMetaTemplating.g:2236:1: rule__SubProperty__Group__0 : rule__SubProperty__Group__0__Impl rule__SubProperty__Group__1 ;
    public final void rule__SubProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2240:1: ( rule__SubProperty__Group__0__Impl rule__SubProperty__Group__1 )
            // InternalMetaTemplating.g:2241:2: rule__SubProperty__Group__0__Impl rule__SubProperty__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__SubProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubProperty__Group__0"


    // $ANTLR start "rule__SubProperty__Group__0__Impl"
    // InternalMetaTemplating.g:2248:1: rule__SubProperty__Group__0__Impl : ( '.' ) ;
    public final void rule__SubProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2252:1: ( ( '.' ) )
            // InternalMetaTemplating.g:2253:1: ( '.' )
            {
            // InternalMetaTemplating.g:2253:1: ( '.' )
            // InternalMetaTemplating.g:2254:2: '.'
            {
             before(grammarAccess.getSubPropertyAccess().getFullStopKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSubPropertyAccess().getFullStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubProperty__Group__0__Impl"


    // $ANTLR start "rule__SubProperty__Group__1"
    // InternalMetaTemplating.g:2263:1: rule__SubProperty__Group__1 : rule__SubProperty__Group__1__Impl rule__SubProperty__Group__2 ;
    public final void rule__SubProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2267:1: ( rule__SubProperty__Group__1__Impl rule__SubProperty__Group__2 )
            // InternalMetaTemplating.g:2268:2: rule__SubProperty__Group__1__Impl rule__SubProperty__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__SubProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubProperty__Group__1"


    // $ANTLR start "rule__SubProperty__Group__1__Impl"
    // InternalMetaTemplating.g:2275:1: rule__SubProperty__Group__1__Impl : ( ( rule__SubProperty__PropertyAssignment_1 ) ) ;
    public final void rule__SubProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2279:1: ( ( ( rule__SubProperty__PropertyAssignment_1 ) ) )
            // InternalMetaTemplating.g:2280:1: ( ( rule__SubProperty__PropertyAssignment_1 ) )
            {
            // InternalMetaTemplating.g:2280:1: ( ( rule__SubProperty__PropertyAssignment_1 ) )
            // InternalMetaTemplating.g:2281:2: ( rule__SubProperty__PropertyAssignment_1 )
            {
             before(grammarAccess.getSubPropertyAccess().getPropertyAssignment_1()); 
            // InternalMetaTemplating.g:2282:2: ( rule__SubProperty__PropertyAssignment_1 )
            // InternalMetaTemplating.g:2282:3: rule__SubProperty__PropertyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SubProperty__PropertyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubPropertyAccess().getPropertyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubProperty__Group__1__Impl"


    // $ANTLR start "rule__SubProperty__Group__2"
    // InternalMetaTemplating.g:2290:1: rule__SubProperty__Group__2 : rule__SubProperty__Group__2__Impl ;
    public final void rule__SubProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2294:1: ( rule__SubProperty__Group__2__Impl )
            // InternalMetaTemplating.g:2295:2: rule__SubProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubProperty__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubProperty__Group__2"


    // $ANTLR start "rule__SubProperty__Group__2__Impl"
    // InternalMetaTemplating.g:2301:1: rule__SubProperty__Group__2__Impl : ( ( '()' )? ) ;
    public final void rule__SubProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2305:1: ( ( ( '()' )? ) )
            // InternalMetaTemplating.g:2306:1: ( ( '()' )? )
            {
            // InternalMetaTemplating.g:2306:1: ( ( '()' )? )
            // InternalMetaTemplating.g:2307:2: ( '()' )?
            {
             before(grammarAccess.getSubPropertyAccess().getLeftParenthesisRightParenthesisKeyword_2()); 
            // InternalMetaTemplating.g:2308:2: ( '()' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMetaTemplating.g:2308:3: '()'
                    {
                    match(input,34,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSubPropertyAccess().getLeftParenthesisRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubProperty__Group__2__Impl"


    // $ANTLR start "rule__EscapedString__Group__0"
    // InternalMetaTemplating.g:2317:1: rule__EscapedString__Group__0 : rule__EscapedString__Group__0__Impl rule__EscapedString__Group__1 ;
    public final void rule__EscapedString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2321:1: ( rule__EscapedString__Group__0__Impl rule__EscapedString__Group__1 )
            // InternalMetaTemplating.g:2322:2: rule__EscapedString__Group__0__Impl rule__EscapedString__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__EscapedString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EscapedString__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedString__Group__0"


    // $ANTLR start "rule__EscapedString__Group__0__Impl"
    // InternalMetaTemplating.g:2329:1: rule__EscapedString__Group__0__Impl : ( '@{' ) ;
    public final void rule__EscapedString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2333:1: ( ( '@{' ) )
            // InternalMetaTemplating.g:2334:1: ( '@{' )
            {
            // InternalMetaTemplating.g:2334:1: ( '@{' )
            // InternalMetaTemplating.g:2335:2: '@{'
            {
             before(grammarAccess.getEscapedStringAccess().getCommercialAtLeftCurlyBracketKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEscapedStringAccess().getCommercialAtLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedString__Group__0__Impl"


    // $ANTLR start "rule__EscapedString__Group__1"
    // InternalMetaTemplating.g:2344:1: rule__EscapedString__Group__1 : rule__EscapedString__Group__1__Impl rule__EscapedString__Group__2 ;
    public final void rule__EscapedString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2348:1: ( rule__EscapedString__Group__1__Impl rule__EscapedString__Group__2 )
            // InternalMetaTemplating.g:2349:2: rule__EscapedString__Group__1__Impl rule__EscapedString__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__EscapedString__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EscapedString__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedString__Group__1"


    // $ANTLR start "rule__EscapedString__Group__1__Impl"
    // InternalMetaTemplating.g:2356:1: rule__EscapedString__Group__1__Impl : ( ( rule__EscapedString__StrAssignment_1 ) ) ;
    public final void rule__EscapedString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2360:1: ( ( ( rule__EscapedString__StrAssignment_1 ) ) )
            // InternalMetaTemplating.g:2361:1: ( ( rule__EscapedString__StrAssignment_1 ) )
            {
            // InternalMetaTemplating.g:2361:1: ( ( rule__EscapedString__StrAssignment_1 ) )
            // InternalMetaTemplating.g:2362:2: ( rule__EscapedString__StrAssignment_1 )
            {
             before(grammarAccess.getEscapedStringAccess().getStrAssignment_1()); 
            // InternalMetaTemplating.g:2363:2: ( rule__EscapedString__StrAssignment_1 )
            // InternalMetaTemplating.g:2363:3: rule__EscapedString__StrAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EscapedString__StrAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEscapedStringAccess().getStrAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedString__Group__1__Impl"


    // $ANTLR start "rule__EscapedString__Group__2"
    // InternalMetaTemplating.g:2371:1: rule__EscapedString__Group__2 : rule__EscapedString__Group__2__Impl ;
    public final void rule__EscapedString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2375:1: ( rule__EscapedString__Group__2__Impl )
            // InternalMetaTemplating.g:2376:2: rule__EscapedString__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EscapedString__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedString__Group__2"


    // $ANTLR start "rule__EscapedString__Group__2__Impl"
    // InternalMetaTemplating.g:2382:1: rule__EscapedString__Group__2__Impl : ( '}@' ) ;
    public final void rule__EscapedString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2386:1: ( ( '}@' ) )
            // InternalMetaTemplating.g:2387:1: ( '}@' )
            {
            // InternalMetaTemplating.g:2387:1: ( '}@' )
            // InternalMetaTemplating.g:2388:2: '}@'
            {
             before(grammarAccess.getEscapedStringAccess().getRightCurlyBracketCommercialAtKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEscapedStringAccess().getRightCurlyBracketCommercialAtKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedString__Group__2__Impl"


    // $ANTLR start "rule__Escaped__Group__0"
    // InternalMetaTemplating.g:2398:1: rule__Escaped__Group__0 : rule__Escaped__Group__0__Impl rule__Escaped__Group__1 ;
    public final void rule__Escaped__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2402:1: ( rule__Escaped__Group__0__Impl rule__Escaped__Group__1 )
            // InternalMetaTemplating.g:2403:2: rule__Escaped__Group__0__Impl rule__Escaped__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Escaped__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Escaped__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escaped__Group__0"


    // $ANTLR start "rule__Escaped__Group__0__Impl"
    // InternalMetaTemplating.g:2410:1: rule__Escaped__Group__0__Impl : ( '#' ) ;
    public final void rule__Escaped__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2414:1: ( ( '#' ) )
            // InternalMetaTemplating.g:2415:1: ( '#' )
            {
            // InternalMetaTemplating.g:2415:1: ( '#' )
            // InternalMetaTemplating.g:2416:2: '#'
            {
             before(grammarAccess.getEscapedAccess().getNumberSignKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getEscapedAccess().getNumberSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escaped__Group__0__Impl"


    // $ANTLR start "rule__Escaped__Group__1"
    // InternalMetaTemplating.g:2425:1: rule__Escaped__Group__1 : rule__Escaped__Group__1__Impl ;
    public final void rule__Escaped__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2429:1: ( rule__Escaped__Group__1__Impl )
            // InternalMetaTemplating.g:2430:2: rule__Escaped__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Escaped__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escaped__Group__1"


    // $ANTLR start "rule__Escaped__Group__1__Impl"
    // InternalMetaTemplating.g:2436:1: rule__Escaped__Group__1__Impl : ( ( rule__Escaped__CharAssignment_1 ) ) ;
    public final void rule__Escaped__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2440:1: ( ( ( rule__Escaped__CharAssignment_1 ) ) )
            // InternalMetaTemplating.g:2441:1: ( ( rule__Escaped__CharAssignment_1 ) )
            {
            // InternalMetaTemplating.g:2441:1: ( ( rule__Escaped__CharAssignment_1 ) )
            // InternalMetaTemplating.g:2442:2: ( rule__Escaped__CharAssignment_1 )
            {
             before(grammarAccess.getEscapedAccess().getCharAssignment_1()); 
            // InternalMetaTemplating.g:2443:2: ( rule__Escaped__CharAssignment_1 )
            // InternalMetaTemplating.g:2443:3: rule__Escaped__CharAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Escaped__CharAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEscapedAccess().getCharAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escaped__Group__1__Impl"


    // $ANTLR start "rule__Model__HeaderAssignment_0"
    // InternalMetaTemplating.g:2452:1: rule__Model__HeaderAssignment_0 : ( ruleHeader ) ;
    public final void rule__Model__HeaderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2456:1: ( ( ruleHeader ) )
            // InternalMetaTemplating.g:2457:2: ( ruleHeader )
            {
            // InternalMetaTemplating.g:2457:2: ( ruleHeader )
            // InternalMetaTemplating.g:2458:3: ruleHeader
            {
             before(grammarAccess.getModelAccess().getHeaderHeaderParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getModelAccess().getHeaderHeaderParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__HeaderAssignment_0"


    // $ANTLR start "rule__Model__ContentAssignment_1"
    // InternalMetaTemplating.g:2467:1: rule__Model__ContentAssignment_1 : ( ruleInstructions ) ;
    public final void rule__Model__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2471:1: ( ( ruleInstructions ) )
            // InternalMetaTemplating.g:2472:2: ( ruleInstructions )
            {
            // InternalMetaTemplating.g:2472:2: ( ruleInstructions )
            // InternalMetaTemplating.g:2473:3: ruleInstructions
            {
             before(grammarAccess.getModelAccess().getContentInstructionsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInstructions();

            state._fsp--;

             after(grammarAccess.getModelAccess().getContentInstructionsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ContentAssignment_1"


    // $ANTLR start "rule__Header__LibsAssignment_1"
    // InternalMetaTemplating.g:2482:1: rule__Header__LibsAssignment_1 : ( ruleLibraries ) ;
    public final void rule__Header__LibsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2486:1: ( ( ruleLibraries ) )
            // InternalMetaTemplating.g:2487:2: ( ruleLibraries )
            {
            // InternalMetaTemplating.g:2487:2: ( ruleLibraries )
            // InternalMetaTemplating.g:2488:3: ruleLibraries
            {
             before(grammarAccess.getHeaderAccess().getLibsLibrariesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLibraries();

            state._fsp--;

             after(grammarAccess.getHeaderAccess().getLibsLibrariesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__LibsAssignment_1"


    // $ANTLR start "rule__Header__ImportsAssignment_2"
    // InternalMetaTemplating.g:2497:1: rule__Header__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__Header__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2501:1: ( ( ruleImport ) )
            // InternalMetaTemplating.g:2502:2: ( ruleImport )
            {
            // InternalMetaTemplating.g:2502:2: ( ruleImport )
            // InternalMetaTemplating.g:2503:3: ruleImport
            {
             before(grammarAccess.getHeaderAccess().getImportsImportParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getHeaderAccess().getImportsImportParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__ImportsAssignment_2"


    // $ANTLR start "rule__Import__PathAssignment_1"
    // InternalMetaTemplating.g:2512:1: rule__Import__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2516:1: ( ( RULE_STRING ) )
            // InternalMetaTemplating.g:2517:2: ( RULE_STRING )
            {
            // InternalMetaTemplating.g:2517:2: ( RULE_STRING )
            // InternalMetaTemplating.g:2518:3: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getPathSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getPathSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__PathAssignment_1"


    // $ANTLR start "rule__Libraries__PathAssignment_1"
    // InternalMetaTemplating.g:2527:1: rule__Libraries__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Libraries__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2531:1: ( ( RULE_STRING ) )
            // InternalMetaTemplating.g:2532:2: ( RULE_STRING )
            {
            // InternalMetaTemplating.g:2532:2: ( RULE_STRING )
            // InternalMetaTemplating.g:2533:3: RULE_STRING
            {
             before(grammarAccess.getLibrariesAccess().getPathSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLibrariesAccess().getPathSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Libraries__PathAssignment_1"


    // $ANTLR start "rule__Comment__WordAssignment_0_1"
    // InternalMetaTemplating.g:2542:1: rule__Comment__WordAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Comment__WordAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2546:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:2547:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:2547:2: ( RULE_ID )
            // InternalMetaTemplating.g:2548:3: RULE_ID
            {
             before(grammarAccess.getCommentAccess().getWordIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getWordIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__WordAssignment_0_1"


    // $ANTLR start "rule__Comment__WordAssignment_1_1"
    // InternalMetaTemplating.g:2557:1: rule__Comment__WordAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Comment__WordAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2561:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:2562:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:2562:2: ( RULE_ID )
            // InternalMetaTemplating.g:2563:3: RULE_ID
            {
             before(grammarAccess.getCommentAccess().getWordIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getWordIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__WordAssignment_1_1"


    // $ANTLR start "rule__Instructions__StatementAssignment_0"
    // InternalMetaTemplating.g:2572:1: rule__Instructions__StatementAssignment_0 : ( ruleStatement ) ;
    public final void rule__Instructions__StatementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2576:1: ( ( ruleStatement ) )
            // InternalMetaTemplating.g:2577:2: ( ruleStatement )
            {
            // InternalMetaTemplating.g:2577:2: ( ruleStatement )
            // InternalMetaTemplating.g:2578:3: ruleStatement
            {
             before(grammarAccess.getInstructionsAccess().getStatementStatementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getInstructionsAccess().getStatementStatementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__StatementAssignment_0"


    // $ANTLR start "rule__Instructions__IteratorAssignment_1"
    // InternalMetaTemplating.g:2587:1: rule__Instructions__IteratorAssignment_1 : ( ruleIterator ) ;
    public final void rule__Instructions__IteratorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2591:1: ( ( ruleIterator ) )
            // InternalMetaTemplating.g:2592:2: ( ruleIterator )
            {
            // InternalMetaTemplating.g:2592:2: ( ruleIterator )
            // InternalMetaTemplating.g:2593:3: ruleIterator
            {
             before(grammarAccess.getInstructionsAccess().getIteratorIteratorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIterator();

            state._fsp--;

             after(grammarAccess.getInstructionsAccess().getIteratorIteratorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__IteratorAssignment_1"


    // $ANTLR start "rule__Instructions__RuleAssignment_2"
    // InternalMetaTemplating.g:2602:1: rule__Instructions__RuleAssignment_2 : ( ruleRule ) ;
    public final void rule__Instructions__RuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2606:1: ( ( ruleRule ) )
            // InternalMetaTemplating.g:2607:2: ( ruleRule )
            {
            // InternalMetaTemplating.g:2607:2: ( ruleRule )
            // InternalMetaTemplating.g:2608:3: ruleRule
            {
             before(grammarAccess.getInstructionsAccess().getRuleRuleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getInstructionsAccess().getRuleRuleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__RuleAssignment_2"


    // $ANTLR start "rule__Instructions__CommentAssignment_3"
    // InternalMetaTemplating.g:2617:1: rule__Instructions__CommentAssignment_3 : ( ruleComment ) ;
    public final void rule__Instructions__CommentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2621:1: ( ( ruleComment ) )
            // InternalMetaTemplating.g:2622:2: ( ruleComment )
            {
            // InternalMetaTemplating.g:2622:2: ( ruleComment )
            // InternalMetaTemplating.g:2623:3: ruleComment
            {
             before(grammarAccess.getInstructionsAccess().getCommentCommentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getInstructionsAccess().getCommentCommentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__CommentAssignment_3"


    // $ANTLR start "rule__Statement__TextAssignment_0"
    // InternalMetaTemplating.g:2632:1: rule__Statement__TextAssignment_0 : ( RULE_ID ) ;
    public final void rule__Statement__TextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2636:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:2637:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:2637:2: ( RULE_ID )
            // InternalMetaTemplating.g:2638:3: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getTextIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getTextIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__TextAssignment_0"


    // $ANTLR start "rule__Statement__CharAssignment_1"
    // InternalMetaTemplating.g:2647:1: rule__Statement__CharAssignment_1 : ( ruleEscaped ) ;
    public final void rule__Statement__CharAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2651:1: ( ( ruleEscaped ) )
            // InternalMetaTemplating.g:2652:2: ( ruleEscaped )
            {
            // InternalMetaTemplating.g:2652:2: ( ruleEscaped )
            // InternalMetaTemplating.g:2653:3: ruleEscaped
            {
             before(grammarAccess.getStatementAccess().getCharEscapedParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEscaped();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getCharEscapedParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__CharAssignment_1"


    // $ANTLR start "rule__Statement__StringAssignment_2"
    // InternalMetaTemplating.g:2662:1: rule__Statement__StringAssignment_2 : ( ruleEscapedString ) ;
    public final void rule__Statement__StringAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2666:1: ( ( ruleEscapedString ) )
            // InternalMetaTemplating.g:2667:2: ( ruleEscapedString )
            {
            // InternalMetaTemplating.g:2667:2: ( ruleEscapedString )
            // InternalMetaTemplating.g:2668:3: ruleEscapedString
            {
             before(grammarAccess.getStatementAccess().getStringEscapedStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEscapedString();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getStringEscapedStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StringAssignment_2"


    // $ANTLR start "rule__Statement__PlaceholderAssignment_3"
    // InternalMetaTemplating.g:2677:1: rule__Statement__PlaceholderAssignment_3 : ( rulePh ) ;
    public final void rule__Statement__PlaceholderAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2681:1: ( ( rulePh ) )
            // InternalMetaTemplating.g:2682:2: ( rulePh )
            {
            // InternalMetaTemplating.g:2682:2: ( rulePh )
            // InternalMetaTemplating.g:2683:3: rulePh
            {
             before(grammarAccess.getStatementAccess().getPlaceholderPhParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePh();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getPlaceholderPhParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__PlaceholderAssignment_3"


    // $ANTLR start "rule__Statement__MetaPlaceholderAssignment_4"
    // InternalMetaTemplating.g:2692:1: rule__Statement__MetaPlaceholderAssignment_4 : ( ruleMetaPh ) ;
    public final void rule__Statement__MetaPlaceholderAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2696:1: ( ( ruleMetaPh ) )
            // InternalMetaTemplating.g:2697:2: ( ruleMetaPh )
            {
            // InternalMetaTemplating.g:2697:2: ( ruleMetaPh )
            // InternalMetaTemplating.g:2698:3: ruleMetaPh
            {
             before(grammarAccess.getStatementAccess().getMetaPlaceholderMetaPhParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaPh();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getMetaPlaceholderMetaPhParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__MetaPlaceholderAssignment_4"


    // $ANTLR start "rule__Rule__ElementAssignment_2"
    // InternalMetaTemplating.g:2707:1: rule__Rule__ElementAssignment_2 : ( RULE_ID ) ;
    public final void rule__Rule__ElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2711:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:2712:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:2712:2: ( RULE_ID )
            // InternalMetaTemplating.g:2713:3: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getElementIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getElementIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ElementAssignment_2"


    // $ANTLR start "rule__Rule__PropertyAssignment_4"
    // InternalMetaTemplating.g:2722:1: rule__Rule__PropertyAssignment_4 : ( ruleProperty ) ;
    public final void rule__Rule__PropertyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2726:1: ( ( ruleProperty ) )
            // InternalMetaTemplating.g:2727:2: ( ruleProperty )
            {
            // InternalMetaTemplating.g:2727:2: ( ruleProperty )
            // InternalMetaTemplating.g:2728:3: ruleProperty
            {
             before(grammarAccess.getRuleAccess().getPropertyPropertyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getPropertyPropertyParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__PropertyAssignment_4"


    // $ANTLR start "rule__Rule__TagAssignment_6"
    // InternalMetaTemplating.g:2737:1: rule__Rule__TagAssignment_6 : ( RULE_ID ) ;
    public final void rule__Rule__TagAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2741:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:2742:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:2742:2: ( RULE_ID )
            // InternalMetaTemplating.g:2743:3: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getTagIDTerminalRuleCall_6_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getTagIDTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__TagAssignment_6"


    // $ANTLR start "rule__Rule__BodyAssignment_9"
    // InternalMetaTemplating.g:2752:1: rule__Rule__BodyAssignment_9 : ( ruleInstructions ) ;
    public final void rule__Rule__BodyAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2756:1: ( ( ruleInstructions ) )
            // InternalMetaTemplating.g:2757:2: ( ruleInstructions )
            {
            // InternalMetaTemplating.g:2757:2: ( ruleInstructions )
            // InternalMetaTemplating.g:2758:3: ruleInstructions
            {
             before(grammarAccess.getRuleAccess().getBodyInstructionsParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleInstructions();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getBodyInstructionsParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__BodyAssignment_9"


    // $ANTLR start "rule__Iterator__ElementAssignment_2"
    // InternalMetaTemplating.g:2767:1: rule__Iterator__ElementAssignment_2 : ( RULE_ID ) ;
    public final void rule__Iterator__ElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2771:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:2772:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:2772:2: ( RULE_ID )
            // InternalMetaTemplating.g:2773:3: RULE_ID
            {
             before(grammarAccess.getIteratorAccess().getElementIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIteratorAccess().getElementIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iterator__ElementAssignment_2"


    // $ANTLR start "rule__Iterator__QueryAssignment_4"
    // InternalMetaTemplating.g:2782:1: rule__Iterator__QueryAssignment_4 : ( ruleQuery ) ;
    public final void rule__Iterator__QueryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2786:1: ( ( ruleQuery ) )
            // InternalMetaTemplating.g:2787:2: ( ruleQuery )
            {
            // InternalMetaTemplating.g:2787:2: ( ruleQuery )
            // InternalMetaTemplating.g:2788:3: ruleQuery
            {
             before(grammarAccess.getIteratorAccess().getQueryQueryParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getIteratorAccess().getQueryQueryParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iterator__QueryAssignment_4"


    // $ANTLR start "rule__Iterator__BodyAssignment_7"
    // InternalMetaTemplating.g:2797:1: rule__Iterator__BodyAssignment_7 : ( ruleInstructions ) ;
    public final void rule__Iterator__BodyAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2801:1: ( ( ruleInstructions ) )
            // InternalMetaTemplating.g:2802:2: ( ruleInstructions )
            {
            // InternalMetaTemplating.g:2802:2: ( ruleInstructions )
            // InternalMetaTemplating.g:2803:3: ruleInstructions
            {
             before(grammarAccess.getIteratorAccess().getBodyInstructionsParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleInstructions();

            state._fsp--;

             after(grammarAccess.getIteratorAccess().getBodyInstructionsParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iterator__BodyAssignment_7"


    // $ANTLR start "rule__Query__ItemAssignment_0_0"
    // InternalMetaTemplating.g:2812:1: rule__Query__ItemAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Query__ItemAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2816:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:2817:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:2817:2: ( RULE_ID )
            // InternalMetaTemplating.g:2818:3: RULE_ID
            {
             before(grammarAccess.getQueryAccess().getItemIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getItemIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__ItemAssignment_0_0"


    // $ANTLR start "rule__Query__RefAssignment_0_1"
    // InternalMetaTemplating.g:2827:1: rule__Query__RefAssignment_0_1 : ( ruleMetaPh ) ;
    public final void rule__Query__RefAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2831:1: ( ( ruleMetaPh ) )
            // InternalMetaTemplating.g:2832:2: ( ruleMetaPh )
            {
            // InternalMetaTemplating.g:2832:2: ( ruleMetaPh )
            // InternalMetaTemplating.g:2833:3: ruleMetaPh
            {
             before(grammarAccess.getQueryAccess().getRefMetaPhParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaPh();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getRefMetaPhParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__RefAssignment_0_1"


    // $ANTLR start "rule__Query__SubQueryAssignment_1"
    // InternalMetaTemplating.g:2842:1: rule__Query__SubQueryAssignment_1 : ( ruleSubQuery ) ;
    public final void rule__Query__SubQueryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2846:1: ( ( ruleSubQuery ) )
            // InternalMetaTemplating.g:2847:2: ( ruleSubQuery )
            {
            // InternalMetaTemplating.g:2847:2: ( ruleSubQuery )
            // InternalMetaTemplating.g:2848:3: ruleSubQuery
            {
             before(grammarAccess.getQueryAccess().getSubQuerySubQueryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSubQuery();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getSubQuerySubQueryParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__SubQueryAssignment_1"


    // $ANTLR start "rule__SubQuery__ItemAssignment_1_0"
    // InternalMetaTemplating.g:2857:1: rule__SubQuery__ItemAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__SubQuery__ItemAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2861:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:2862:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:2862:2: ( RULE_ID )
            // InternalMetaTemplating.g:2863:3: RULE_ID
            {
             before(grammarAccess.getSubQueryAccess().getItemIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSubQueryAccess().getItemIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubQuery__ItemAssignment_1_0"


    // $ANTLR start "rule__SubQuery__RefAssignment_1_1"
    // InternalMetaTemplating.g:2872:1: rule__SubQuery__RefAssignment_1_1 : ( ruleMetaPh ) ;
    public final void rule__SubQuery__RefAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2876:1: ( ( ruleMetaPh ) )
            // InternalMetaTemplating.g:2877:2: ( ruleMetaPh )
            {
            // InternalMetaTemplating.g:2877:2: ( ruleMetaPh )
            // InternalMetaTemplating.g:2878:3: ruleMetaPh
            {
             before(grammarAccess.getSubQueryAccess().getRefMetaPhParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaPh();

            state._fsp--;

             after(grammarAccess.getSubQueryAccess().getRefMetaPhParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubQuery__RefAssignment_1_1"


    // $ANTLR start "rule__Ph__PropertyAssignment_1"
    // InternalMetaTemplating.g:2887:1: rule__Ph__PropertyAssignment_1 : ( ruleProperty ) ;
    public final void rule__Ph__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2891:1: ( ( ruleProperty ) )
            // InternalMetaTemplating.g:2892:2: ( ruleProperty )
            {
            // InternalMetaTemplating.g:2892:2: ( ruleProperty )
            // InternalMetaTemplating.g:2893:3: ruleProperty
            {
             before(grammarAccess.getPhAccess().getPropertyPropertyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPhAccess().getPropertyPropertyParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ph__PropertyAssignment_1"


    // $ANTLR start "rule__Ph__MetaPropertyAssignment_2"
    // InternalMetaTemplating.g:2902:1: rule__Ph__MetaPropertyAssignment_2 : ( ruleMetaProperty ) ;
    public final void rule__Ph__MetaPropertyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2906:1: ( ( ruleMetaProperty ) )
            // InternalMetaTemplating.g:2907:2: ( ruleMetaProperty )
            {
            // InternalMetaTemplating.g:2907:2: ( ruleMetaProperty )
            // InternalMetaTemplating.g:2908:3: ruleMetaProperty
            {
             before(grammarAccess.getPhAccess().getMetaPropertyMetaPropertyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaProperty();

            state._fsp--;

             after(grammarAccess.getPhAccess().getMetaPropertyMetaPropertyParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ph__MetaPropertyAssignment_2"


    // $ANTLR start "rule__MetaPh__PropertyAssignment_1"
    // InternalMetaTemplating.g:2917:1: rule__MetaPh__PropertyAssignment_1 : ( ruleProperty ) ;
    public final void rule__MetaPh__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2921:1: ( ( ruleProperty ) )
            // InternalMetaTemplating.g:2922:2: ( ruleProperty )
            {
            // InternalMetaTemplating.g:2922:2: ( ruleProperty )
            // InternalMetaTemplating.g:2923:3: ruleProperty
            {
             before(grammarAccess.getMetaPhAccess().getPropertyPropertyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getMetaPhAccess().getPropertyPropertyParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaPh__PropertyAssignment_1"


    // $ANTLR start "rule__MetaPh__TagAssignment_2_1"
    // InternalMetaTemplating.g:2932:1: rule__MetaPh__TagAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__MetaPh__TagAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2936:1: ( ( RULE_STRING ) )
            // InternalMetaTemplating.g:2937:2: ( RULE_STRING )
            {
            // InternalMetaTemplating.g:2937:2: ( RULE_STRING )
            // InternalMetaTemplating.g:2938:3: RULE_STRING
            {
             before(grammarAccess.getMetaPhAccess().getTagSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMetaPhAccess().getTagSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaPh__TagAssignment_2_1"


    // $ANTLR start "rule__MetaProperty__PropertyAssignment_1"
    // InternalMetaTemplating.g:2947:1: rule__MetaProperty__PropertyAssignment_1 : ( ruleProperty ) ;
    public final void rule__MetaProperty__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2951:1: ( ( ruleProperty ) )
            // InternalMetaTemplating.g:2952:2: ( ruleProperty )
            {
            // InternalMetaTemplating.g:2952:2: ( ruleProperty )
            // InternalMetaTemplating.g:2953:3: ruleProperty
            {
             before(grammarAccess.getMetaPropertyAccess().getPropertyPropertyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getMetaPropertyAccess().getPropertyPropertyParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaProperty__PropertyAssignment_1"


    // $ANTLR start "rule__Property__PropertyAssignment_0"
    // InternalMetaTemplating.g:2962:1: rule__Property__PropertyAssignment_0 : ( RULE_ID ) ;
    public final void rule__Property__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2966:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:2967:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:2967:2: ( RULE_ID )
            // InternalMetaTemplating.g:2968:3: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getPropertyIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getPropertyIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__PropertyAssignment_0"


    // $ANTLR start "rule__Property__SubPropertiesAssignment_1"
    // InternalMetaTemplating.g:2977:1: rule__Property__SubPropertiesAssignment_1 : ( ruleSubProperty ) ;
    public final void rule__Property__SubPropertiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2981:1: ( ( ruleSubProperty ) )
            // InternalMetaTemplating.g:2982:2: ( ruleSubProperty )
            {
            // InternalMetaTemplating.g:2982:2: ( ruleSubProperty )
            // InternalMetaTemplating.g:2983:3: ruleSubProperty
            {
             before(grammarAccess.getPropertyAccess().getSubPropertiesSubPropertyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSubProperty();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getSubPropertiesSubPropertyParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__SubPropertiesAssignment_1"


    // $ANTLR start "rule__SubProperty__PropertyAssignment_1"
    // InternalMetaTemplating.g:2992:1: rule__SubProperty__PropertyAssignment_1 : ( RULE_ID ) ;
    public final void rule__SubProperty__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2996:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:2997:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:2997:2: ( RULE_ID )
            // InternalMetaTemplating.g:2998:3: RULE_ID
            {
             before(grammarAccess.getSubPropertyAccess().getPropertyIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSubPropertyAccess().getPropertyIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubProperty__PropertyAssignment_1"


    // $ANTLR start "rule__EscapedString__StrAssignment_1"
    // InternalMetaTemplating.g:3007:1: rule__EscapedString__StrAssignment_1 : ( RULE_STRING ) ;
    public final void rule__EscapedString__StrAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3011:1: ( ( RULE_STRING ) )
            // InternalMetaTemplating.g:3012:2: ( RULE_STRING )
            {
            // InternalMetaTemplating.g:3012:2: ( RULE_STRING )
            // InternalMetaTemplating.g:3013:3: RULE_STRING
            {
             before(grammarAccess.getEscapedStringAccess().getStrSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEscapedStringAccess().getStrSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedString__StrAssignment_1"


    // $ANTLR start "rule__Escaped__CharAssignment_1"
    // InternalMetaTemplating.g:3022:1: rule__Escaped__CharAssignment_1 : ( ( rule__Escaped__CharAlternatives_1_0 ) ) ;
    public final void rule__Escaped__CharAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3026:1: ( ( ( rule__Escaped__CharAlternatives_1_0 ) ) )
            // InternalMetaTemplating.g:3027:2: ( ( rule__Escaped__CharAlternatives_1_0 ) )
            {
            // InternalMetaTemplating.g:3027:2: ( ( rule__Escaped__CharAlternatives_1_0 ) )
            // InternalMetaTemplating.g:3028:3: ( rule__Escaped__CharAlternatives_1_0 )
            {
             before(grammarAccess.getEscapedAccess().getCharAlternatives_1_0()); 
            // InternalMetaTemplating.g:3029:3: ( rule__Escaped__CharAlternatives_1_0 )
            // InternalMetaTemplating.g:3029:4: rule__Escaped__CharAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Escaped__CharAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEscapedAccess().getCharAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escaped__CharAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000088AC004820L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000088AC004822L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000088AC006820L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008800004820L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000FFF800L});

}