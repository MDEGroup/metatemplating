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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'n'", "'s'", "'t'", "'#'", "'{'", "'}'", "'['", "']'", "','", "';'", "'('", "')'", "':'", "'<'", "'>'", "'\\''", "'import'", "'IMPORT'", "'#*'", "'*#'", "'FORALL'", "'TAGGED'", "'foreach'", "'in'", "'.'", "'()'", "'[['", "']]'", "'TAGINFO'", "'.{'", "'@{'", "'}@'"
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
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
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


    // $ANTLR start "entryRuleNote"
    // InternalMetaTemplating.g:153:1: entryRuleNote : ruleNote EOF ;
    public final void entryRuleNote() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:154:1: ( ruleNote EOF )
            // InternalMetaTemplating.g:155:1: ruleNote EOF
            {
             before(grammarAccess.getNoteRule()); 
            pushFollow(FOLLOW_1);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getNoteRule()); 
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
    // $ANTLR end "entryRuleNote"


    // $ANTLR start "ruleNote"
    // InternalMetaTemplating.g:162:1: ruleNote : ( ( rule__Note__Group__0 ) ) ;
    public final void ruleNote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:166:2: ( ( ( rule__Note__Group__0 ) ) )
            // InternalMetaTemplating.g:167:2: ( ( rule__Note__Group__0 ) )
            {
            // InternalMetaTemplating.g:167:2: ( ( rule__Note__Group__0 ) )
            // InternalMetaTemplating.g:168:3: ( rule__Note__Group__0 )
            {
             before(grammarAccess.getNoteAccess().getGroup()); 
            // InternalMetaTemplating.g:169:3: ( rule__Note__Group__0 )
            // InternalMetaTemplating.g:169:4: rule__Note__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Note__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getGroup()); 

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
    // $ANTLR end "ruleNote"


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
    // InternalMetaTemplating.g:312:1: ruleSubQuery : ( ( rule__SubQuery__Alternatives ) ) ;
    public final void ruleSubQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:316:2: ( ( ( rule__SubQuery__Alternatives ) ) )
            // InternalMetaTemplating.g:317:2: ( ( rule__SubQuery__Alternatives ) )
            {
            // InternalMetaTemplating.g:317:2: ( ( rule__SubQuery__Alternatives ) )
            // InternalMetaTemplating.g:318:3: ( rule__SubQuery__Alternatives )
            {
             before(grammarAccess.getSubQueryAccess().getAlternatives()); 
            // InternalMetaTemplating.g:319:3: ( rule__SubQuery__Alternatives )
            // InternalMetaTemplating.g:319:4: rule__SubQuery__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SubQuery__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSubQueryAccess().getAlternatives()); 

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
    // InternalMetaTemplating.g:437:1: ruleSubProperty : ( ( rule__SubProperty__Alternatives ) ) ;
    public final void ruleSubProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:441:2: ( ( ( rule__SubProperty__Alternatives ) ) )
            // InternalMetaTemplating.g:442:2: ( ( rule__SubProperty__Alternatives ) )
            {
            // InternalMetaTemplating.g:442:2: ( ( rule__SubProperty__Alternatives ) )
            // InternalMetaTemplating.g:443:3: ( rule__SubProperty__Alternatives )
            {
             before(grammarAccess.getSubPropertyAccess().getAlternatives()); 
            // InternalMetaTemplating.g:444:3: ( rule__SubProperty__Alternatives )
            // InternalMetaTemplating.g:444:4: rule__SubProperty__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SubProperty__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSubPropertyAccess().getAlternatives()); 

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


    // $ANTLR start "rule__Instructions__Alternatives"
    // InternalMetaTemplating.g:502:1: rule__Instructions__Alternatives : ( ( ( rule__Instructions__NoteAssignment_0 ) ) | ( ( rule__Instructions__StatementAssignment_1 ) ) | ( ( rule__Instructions__IteratorAssignment_2 ) ) | ( ( rule__Instructions__RuleAssignment_3 ) ) );
    public final void rule__Instructions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:506:1: ( ( ( rule__Instructions__NoteAssignment_0 ) ) | ( ( rule__Instructions__StatementAssignment_1 ) ) | ( ( rule__Instructions__IteratorAssignment_2 ) ) | ( ( rule__Instructions__RuleAssignment_3 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt1=1;
                }
                break;
            case RULE_ID:
            case 14:
            case 17:
            case 37:
            case 41:
                {
                alt1=2;
                }
                break;
            case 33:
                {
                alt1=3;
                }
                break;
            case 31:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMetaTemplating.g:507:2: ( ( rule__Instructions__NoteAssignment_0 ) )
                    {
                    // InternalMetaTemplating.g:507:2: ( ( rule__Instructions__NoteAssignment_0 ) )
                    // InternalMetaTemplating.g:508:3: ( rule__Instructions__NoteAssignment_0 )
                    {
                     before(grammarAccess.getInstructionsAccess().getNoteAssignment_0()); 
                    // InternalMetaTemplating.g:509:3: ( rule__Instructions__NoteAssignment_0 )
                    // InternalMetaTemplating.g:509:4: rule__Instructions__NoteAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instructions__NoteAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstructionsAccess().getNoteAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:513:2: ( ( rule__Instructions__StatementAssignment_1 ) )
                    {
                    // InternalMetaTemplating.g:513:2: ( ( rule__Instructions__StatementAssignment_1 ) )
                    // InternalMetaTemplating.g:514:3: ( rule__Instructions__StatementAssignment_1 )
                    {
                     before(grammarAccess.getInstructionsAccess().getStatementAssignment_1()); 
                    // InternalMetaTemplating.g:515:3: ( rule__Instructions__StatementAssignment_1 )
                    // InternalMetaTemplating.g:515:4: rule__Instructions__StatementAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instructions__StatementAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstructionsAccess().getStatementAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMetaTemplating.g:519:2: ( ( rule__Instructions__IteratorAssignment_2 ) )
                    {
                    // InternalMetaTemplating.g:519:2: ( ( rule__Instructions__IteratorAssignment_2 ) )
                    // InternalMetaTemplating.g:520:3: ( rule__Instructions__IteratorAssignment_2 )
                    {
                     before(grammarAccess.getInstructionsAccess().getIteratorAssignment_2()); 
                    // InternalMetaTemplating.g:521:3: ( rule__Instructions__IteratorAssignment_2 )
                    // InternalMetaTemplating.g:521:4: rule__Instructions__IteratorAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instructions__IteratorAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstructionsAccess().getIteratorAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMetaTemplating.g:525:2: ( ( rule__Instructions__RuleAssignment_3 ) )
                    {
                    // InternalMetaTemplating.g:525:2: ( ( rule__Instructions__RuleAssignment_3 ) )
                    // InternalMetaTemplating.g:526:3: ( rule__Instructions__RuleAssignment_3 )
                    {
                     before(grammarAccess.getInstructionsAccess().getRuleAssignment_3()); 
                    // InternalMetaTemplating.g:527:3: ( rule__Instructions__RuleAssignment_3 )
                    // InternalMetaTemplating.g:527:4: rule__Instructions__RuleAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instructions__RuleAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstructionsAccess().getRuleAssignment_3()); 

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
    // InternalMetaTemplating.g:535:1: rule__Statement__Alternatives : ( ( ( rule__Statement__TextAssignment_0 ) ) | ( ( rule__Statement__CharAssignment_1 ) ) | ( ( rule__Statement__StringAssignment_2 ) ) | ( ( rule__Statement__PlaceholderAssignment_3 ) ) | ( ( rule__Statement__MetaPlaceholderAssignment_4 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:539:1: ( ( ( rule__Statement__TextAssignment_0 ) ) | ( ( rule__Statement__CharAssignment_1 ) ) | ( ( rule__Statement__StringAssignment_2 ) ) | ( ( rule__Statement__PlaceholderAssignment_3 ) ) | ( ( rule__Statement__MetaPlaceholderAssignment_4 ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 41:
                {
                alt2=3;
                }
                break;
            case 37:
                {
                alt2=4;
                }
                break;
            case 17:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMetaTemplating.g:540:2: ( ( rule__Statement__TextAssignment_0 ) )
                    {
                    // InternalMetaTemplating.g:540:2: ( ( rule__Statement__TextAssignment_0 ) )
                    // InternalMetaTemplating.g:541:3: ( rule__Statement__TextAssignment_0 )
                    {
                     before(grammarAccess.getStatementAccess().getTextAssignment_0()); 
                    // InternalMetaTemplating.g:542:3: ( rule__Statement__TextAssignment_0 )
                    // InternalMetaTemplating.g:542:4: rule__Statement__TextAssignment_0
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
                    // InternalMetaTemplating.g:546:2: ( ( rule__Statement__CharAssignment_1 ) )
                    {
                    // InternalMetaTemplating.g:546:2: ( ( rule__Statement__CharAssignment_1 ) )
                    // InternalMetaTemplating.g:547:3: ( rule__Statement__CharAssignment_1 )
                    {
                     before(grammarAccess.getStatementAccess().getCharAssignment_1()); 
                    // InternalMetaTemplating.g:548:3: ( rule__Statement__CharAssignment_1 )
                    // InternalMetaTemplating.g:548:4: rule__Statement__CharAssignment_1
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
                    // InternalMetaTemplating.g:552:2: ( ( rule__Statement__StringAssignment_2 ) )
                    {
                    // InternalMetaTemplating.g:552:2: ( ( rule__Statement__StringAssignment_2 ) )
                    // InternalMetaTemplating.g:553:3: ( rule__Statement__StringAssignment_2 )
                    {
                     before(grammarAccess.getStatementAccess().getStringAssignment_2()); 
                    // InternalMetaTemplating.g:554:3: ( rule__Statement__StringAssignment_2 )
                    // InternalMetaTemplating.g:554:4: rule__Statement__StringAssignment_2
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
                    // InternalMetaTemplating.g:558:2: ( ( rule__Statement__PlaceholderAssignment_3 ) )
                    {
                    // InternalMetaTemplating.g:558:2: ( ( rule__Statement__PlaceholderAssignment_3 ) )
                    // InternalMetaTemplating.g:559:3: ( rule__Statement__PlaceholderAssignment_3 )
                    {
                     before(grammarAccess.getStatementAccess().getPlaceholderAssignment_3()); 
                    // InternalMetaTemplating.g:560:3: ( rule__Statement__PlaceholderAssignment_3 )
                    // InternalMetaTemplating.g:560:4: rule__Statement__PlaceholderAssignment_3
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
                    // InternalMetaTemplating.g:564:2: ( ( rule__Statement__MetaPlaceholderAssignment_4 ) )
                    {
                    // InternalMetaTemplating.g:564:2: ( ( rule__Statement__MetaPlaceholderAssignment_4 ) )
                    // InternalMetaTemplating.g:565:3: ( rule__Statement__MetaPlaceholderAssignment_4 )
                    {
                     before(grammarAccess.getStatementAccess().getMetaPlaceholderAssignment_4()); 
                    // InternalMetaTemplating.g:566:3: ( rule__Statement__MetaPlaceholderAssignment_4 )
                    // InternalMetaTemplating.g:566:4: rule__Statement__MetaPlaceholderAssignment_4
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
    // InternalMetaTemplating.g:574:1: rule__Query__Alternatives_0 : ( ( ( rule__Query__ItemAssignment_0_0 ) ) | ( ( rule__Query__RefAssignment_0_1 ) ) );
    public final void rule__Query__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:578:1: ( ( ( rule__Query__ItemAssignment_0_0 ) ) | ( ( rule__Query__RefAssignment_0_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMetaTemplating.g:579:2: ( ( rule__Query__ItemAssignment_0_0 ) )
                    {
                    // InternalMetaTemplating.g:579:2: ( ( rule__Query__ItemAssignment_0_0 ) )
                    // InternalMetaTemplating.g:580:3: ( rule__Query__ItemAssignment_0_0 )
                    {
                     before(grammarAccess.getQueryAccess().getItemAssignment_0_0()); 
                    // InternalMetaTemplating.g:581:3: ( rule__Query__ItemAssignment_0_0 )
                    // InternalMetaTemplating.g:581:4: rule__Query__ItemAssignment_0_0
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
                    // InternalMetaTemplating.g:585:2: ( ( rule__Query__RefAssignment_0_1 ) )
                    {
                    // InternalMetaTemplating.g:585:2: ( ( rule__Query__RefAssignment_0_1 ) )
                    // InternalMetaTemplating.g:586:3: ( rule__Query__RefAssignment_0_1 )
                    {
                     before(grammarAccess.getQueryAccess().getRefAssignment_0_1()); 
                    // InternalMetaTemplating.g:587:3: ( rule__Query__RefAssignment_0_1 )
                    // InternalMetaTemplating.g:587:4: rule__Query__RefAssignment_0_1
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


    // $ANTLR start "rule__SubQuery__Alternatives"
    // InternalMetaTemplating.g:595:1: rule__SubQuery__Alternatives : ( ( ( rule__SubQuery__Group_0__0 ) ) | ( ( rule__SubQuery__Group_1__0 ) ) );
    public final void rule__SubQuery__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:599:1: ( ( ( rule__SubQuery__Group_0__0 ) ) | ( ( rule__SubQuery__Group_1__0 ) ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalMetaTemplating.g:600:2: ( ( rule__SubQuery__Group_0__0 ) )
                    {
                    // InternalMetaTemplating.g:600:2: ( ( rule__SubQuery__Group_0__0 ) )
                    // InternalMetaTemplating.g:601:3: ( rule__SubQuery__Group_0__0 )
                    {
                     before(grammarAccess.getSubQueryAccess().getGroup_0()); 
                    // InternalMetaTemplating.g:602:3: ( rule__SubQuery__Group_0__0 )
                    // InternalMetaTemplating.g:602:4: rule__SubQuery__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubQuery__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubQueryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:606:2: ( ( rule__SubQuery__Group_1__0 ) )
                    {
                    // InternalMetaTemplating.g:606:2: ( ( rule__SubQuery__Group_1__0 ) )
                    // InternalMetaTemplating.g:607:3: ( rule__SubQuery__Group_1__0 )
                    {
                     before(grammarAccess.getSubQueryAccess().getGroup_1()); 
                    // InternalMetaTemplating.g:608:3: ( rule__SubQuery__Group_1__0 )
                    // InternalMetaTemplating.g:608:4: rule__SubQuery__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubQuery__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubQueryAccess().getGroup_1()); 

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
    // $ANTLR end "rule__SubQuery__Alternatives"


    // $ANTLR start "rule__SubQuery__Alternatives_0_1"
    // InternalMetaTemplating.g:616:1: rule__SubQuery__Alternatives_0_1 : ( ( ( rule__SubQuery__MethItemAssignment_0_1_0 ) ) | ( ( rule__SubQuery__MethRefAssignment_0_1_1 ) ) );
    public final void rule__SubQuery__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:620:1: ( ( ( rule__SubQuery__MethItemAssignment_0_1_0 ) ) | ( ( rule__SubQuery__MethRefAssignment_0_1_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMetaTemplating.g:621:2: ( ( rule__SubQuery__MethItemAssignment_0_1_0 ) )
                    {
                    // InternalMetaTemplating.g:621:2: ( ( rule__SubQuery__MethItemAssignment_0_1_0 ) )
                    // InternalMetaTemplating.g:622:3: ( rule__SubQuery__MethItemAssignment_0_1_0 )
                    {
                     before(grammarAccess.getSubQueryAccess().getMethItemAssignment_0_1_0()); 
                    // InternalMetaTemplating.g:623:3: ( rule__SubQuery__MethItemAssignment_0_1_0 )
                    // InternalMetaTemplating.g:623:4: rule__SubQuery__MethItemAssignment_0_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubQuery__MethItemAssignment_0_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubQueryAccess().getMethItemAssignment_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:627:2: ( ( rule__SubQuery__MethRefAssignment_0_1_1 ) )
                    {
                    // InternalMetaTemplating.g:627:2: ( ( rule__SubQuery__MethRefAssignment_0_1_1 ) )
                    // InternalMetaTemplating.g:628:3: ( rule__SubQuery__MethRefAssignment_0_1_1 )
                    {
                     before(grammarAccess.getSubQueryAccess().getMethRefAssignment_0_1_1()); 
                    // InternalMetaTemplating.g:629:3: ( rule__SubQuery__MethRefAssignment_0_1_1 )
                    // InternalMetaTemplating.g:629:4: rule__SubQuery__MethRefAssignment_0_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubQuery__MethRefAssignment_0_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubQueryAccess().getMethRefAssignment_0_1_1()); 

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
    // $ANTLR end "rule__SubQuery__Alternatives_0_1"


    // $ANTLR start "rule__SubQuery__Alternatives_1_1"
    // InternalMetaTemplating.g:637:1: rule__SubQuery__Alternatives_1_1 : ( ( ( rule__SubQuery__ItemAssignment_1_1_0 ) ) | ( ( rule__SubQuery__RefAssignment_1_1_1 ) ) );
    public final void rule__SubQuery__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:641:1: ( ( ( rule__SubQuery__ItemAssignment_1_1_0 ) ) | ( ( rule__SubQuery__RefAssignment_1_1_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMetaTemplating.g:642:2: ( ( rule__SubQuery__ItemAssignment_1_1_0 ) )
                    {
                    // InternalMetaTemplating.g:642:2: ( ( rule__SubQuery__ItemAssignment_1_1_0 ) )
                    // InternalMetaTemplating.g:643:3: ( rule__SubQuery__ItemAssignment_1_1_0 )
                    {
                     before(grammarAccess.getSubQueryAccess().getItemAssignment_1_1_0()); 
                    // InternalMetaTemplating.g:644:3: ( rule__SubQuery__ItemAssignment_1_1_0 )
                    // InternalMetaTemplating.g:644:4: rule__SubQuery__ItemAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubQuery__ItemAssignment_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubQueryAccess().getItemAssignment_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:648:2: ( ( rule__SubQuery__RefAssignment_1_1_1 ) )
                    {
                    // InternalMetaTemplating.g:648:2: ( ( rule__SubQuery__RefAssignment_1_1_1 ) )
                    // InternalMetaTemplating.g:649:3: ( rule__SubQuery__RefAssignment_1_1_1 )
                    {
                     before(grammarAccess.getSubQueryAccess().getRefAssignment_1_1_1()); 
                    // InternalMetaTemplating.g:650:3: ( rule__SubQuery__RefAssignment_1_1_1 )
                    // InternalMetaTemplating.g:650:4: rule__SubQuery__RefAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubQuery__RefAssignment_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubQueryAccess().getRefAssignment_1_1_1()); 

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
    // $ANTLR end "rule__SubQuery__Alternatives_1_1"


    // $ANTLR start "rule__SubProperty__Alternatives"
    // InternalMetaTemplating.g:658:1: rule__SubProperty__Alternatives : ( ( ( rule__SubProperty__Group_0__0 ) ) | ( ( rule__SubProperty__Group_1__0 ) ) );
    public final void rule__SubProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:662:1: ( ( ( rule__SubProperty__Group_0__0 ) ) | ( ( rule__SubProperty__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==35) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==36) ) {
                        alt7=1;
                    }
                    else if ( (LA7_2==EOF||LA7_2==16||LA7_2==18||LA7_2==32||LA7_2==35||(LA7_2>=38 && LA7_2<=40)) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMetaTemplating.g:663:2: ( ( rule__SubProperty__Group_0__0 ) )
                    {
                    // InternalMetaTemplating.g:663:2: ( ( rule__SubProperty__Group_0__0 ) )
                    // InternalMetaTemplating.g:664:3: ( rule__SubProperty__Group_0__0 )
                    {
                     before(grammarAccess.getSubPropertyAccess().getGroup_0()); 
                    // InternalMetaTemplating.g:665:3: ( rule__SubProperty__Group_0__0 )
                    // InternalMetaTemplating.g:665:4: rule__SubProperty__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubProperty__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubPropertyAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:669:2: ( ( rule__SubProperty__Group_1__0 ) )
                    {
                    // InternalMetaTemplating.g:669:2: ( ( rule__SubProperty__Group_1__0 ) )
                    // InternalMetaTemplating.g:670:3: ( rule__SubProperty__Group_1__0 )
                    {
                     before(grammarAccess.getSubPropertyAccess().getGroup_1()); 
                    // InternalMetaTemplating.g:671:3: ( rule__SubProperty__Group_1__0 )
                    // InternalMetaTemplating.g:671:4: rule__SubProperty__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubProperty__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubPropertyAccess().getGroup_1()); 

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
    // $ANTLR end "rule__SubProperty__Alternatives"


    // $ANTLR start "rule__Escaped__CharAlternatives_1_0"
    // InternalMetaTemplating.g:679:1: rule__Escaped__CharAlternatives_1_0 : ( ( 'n' ) | ( 's' ) | ( 't' ) | ( '#' ) | ( '{' ) | ( '}' ) | ( '[' ) | ( ']' ) | ( ',' ) | ( ';' ) | ( '(' ) | ( ')' ) | ( ':' ) | ( '<' ) | ( '>' ) | ( '\\'' ) );
    public final void rule__Escaped__CharAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:683:1: ( ( 'n' ) | ( 's' ) | ( 't' ) | ( '#' ) | ( '{' ) | ( '}' ) | ( '[' ) | ( ']' ) | ( ',' ) | ( ';' ) | ( '(' ) | ( ')' ) | ( ':' ) | ( '<' ) | ( '>' ) | ( '\\'' ) )
            int alt8=16;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt8=1;
                }
                break;
            case 12:
                {
                alt8=2;
                }
                break;
            case 13:
                {
                alt8=3;
                }
                break;
            case 14:
                {
                alt8=4;
                }
                break;
            case 15:
                {
                alt8=5;
                }
                break;
            case 16:
                {
                alt8=6;
                }
                break;
            case 17:
                {
                alt8=7;
                }
                break;
            case 18:
                {
                alt8=8;
                }
                break;
            case 19:
                {
                alt8=9;
                }
                break;
            case 20:
                {
                alt8=10;
                }
                break;
            case 21:
                {
                alt8=11;
                }
                break;
            case 22:
                {
                alt8=12;
                }
                break;
            case 23:
                {
                alt8=13;
                }
                break;
            case 24:
                {
                alt8=14;
                }
                break;
            case 25:
                {
                alt8=15;
                }
                break;
            case 26:
                {
                alt8=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMetaTemplating.g:684:2: ( 'n' )
                    {
                    // InternalMetaTemplating.g:684:2: ( 'n' )
                    // InternalMetaTemplating.g:685:3: 'n'
                    {
                     before(grammarAccess.getEscapedAccess().getCharNKeyword_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharNKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:690:2: ( 's' )
                    {
                    // InternalMetaTemplating.g:690:2: ( 's' )
                    // InternalMetaTemplating.g:691:3: 's'
                    {
                     before(grammarAccess.getEscapedAccess().getCharSKeyword_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharSKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMetaTemplating.g:696:2: ( 't' )
                    {
                    // InternalMetaTemplating.g:696:2: ( 't' )
                    // InternalMetaTemplating.g:697:3: 't'
                    {
                     before(grammarAccess.getEscapedAccess().getCharTKeyword_1_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharTKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMetaTemplating.g:702:2: ( '#' )
                    {
                    // InternalMetaTemplating.g:702:2: ( '#' )
                    // InternalMetaTemplating.g:703:3: '#'
                    {
                     before(grammarAccess.getEscapedAccess().getCharNumberSignKeyword_1_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharNumberSignKeyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMetaTemplating.g:708:2: ( '{' )
                    {
                    // InternalMetaTemplating.g:708:2: ( '{' )
                    // InternalMetaTemplating.g:709:3: '{'
                    {
                     before(grammarAccess.getEscapedAccess().getCharLeftCurlyBracketKeyword_1_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharLeftCurlyBracketKeyword_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMetaTemplating.g:714:2: ( '}' )
                    {
                    // InternalMetaTemplating.g:714:2: ( '}' )
                    // InternalMetaTemplating.g:715:3: '}'
                    {
                     before(grammarAccess.getEscapedAccess().getCharRightCurlyBracketKeyword_1_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharRightCurlyBracketKeyword_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMetaTemplating.g:720:2: ( '[' )
                    {
                    // InternalMetaTemplating.g:720:2: ( '[' )
                    // InternalMetaTemplating.g:721:3: '['
                    {
                     before(grammarAccess.getEscapedAccess().getCharLeftSquareBracketKeyword_1_0_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharLeftSquareBracketKeyword_1_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMetaTemplating.g:726:2: ( ']' )
                    {
                    // InternalMetaTemplating.g:726:2: ( ']' )
                    // InternalMetaTemplating.g:727:3: ']'
                    {
                     before(grammarAccess.getEscapedAccess().getCharRightSquareBracketKeyword_1_0_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharRightSquareBracketKeyword_1_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMetaTemplating.g:732:2: ( ',' )
                    {
                    // InternalMetaTemplating.g:732:2: ( ',' )
                    // InternalMetaTemplating.g:733:3: ','
                    {
                     before(grammarAccess.getEscapedAccess().getCharCommaKeyword_1_0_8()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharCommaKeyword_1_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMetaTemplating.g:738:2: ( ';' )
                    {
                    // InternalMetaTemplating.g:738:2: ( ';' )
                    // InternalMetaTemplating.g:739:3: ';'
                    {
                     before(grammarAccess.getEscapedAccess().getCharSemicolonKeyword_1_0_9()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharSemicolonKeyword_1_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMetaTemplating.g:744:2: ( '(' )
                    {
                    // InternalMetaTemplating.g:744:2: ( '(' )
                    // InternalMetaTemplating.g:745:3: '('
                    {
                     before(grammarAccess.getEscapedAccess().getCharLeftParenthesisKeyword_1_0_10()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharLeftParenthesisKeyword_1_0_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMetaTemplating.g:750:2: ( ')' )
                    {
                    // InternalMetaTemplating.g:750:2: ( ')' )
                    // InternalMetaTemplating.g:751:3: ')'
                    {
                     before(grammarAccess.getEscapedAccess().getCharRightParenthesisKeyword_1_0_11()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharRightParenthesisKeyword_1_0_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMetaTemplating.g:756:2: ( ':' )
                    {
                    // InternalMetaTemplating.g:756:2: ( ':' )
                    // InternalMetaTemplating.g:757:3: ':'
                    {
                     before(grammarAccess.getEscapedAccess().getCharColonKeyword_1_0_12()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharColonKeyword_1_0_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalMetaTemplating.g:762:2: ( '<' )
                    {
                    // InternalMetaTemplating.g:762:2: ( '<' )
                    // InternalMetaTemplating.g:763:3: '<'
                    {
                     before(grammarAccess.getEscapedAccess().getCharLessThanSignKeyword_1_0_13()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharLessThanSignKeyword_1_0_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalMetaTemplating.g:768:2: ( '>' )
                    {
                    // InternalMetaTemplating.g:768:2: ( '>' )
                    // InternalMetaTemplating.g:769:3: '>'
                    {
                     before(grammarAccess.getEscapedAccess().getCharGreaterThanSignKeyword_1_0_14()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharGreaterThanSignKeyword_1_0_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalMetaTemplating.g:774:2: ( '\\'' )
                    {
                    // InternalMetaTemplating.g:774:2: ( '\\'' )
                    // InternalMetaTemplating.g:775:3: '\\''
                    {
                     before(grammarAccess.getEscapedAccess().getCharApostropheKeyword_1_0_15()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharApostropheKeyword_1_0_15()); 

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
    // InternalMetaTemplating.g:784:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:788:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMetaTemplating.g:789:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalMetaTemplating.g:796:1: rule__Model__Group__0__Impl : ( ( rule__Model__HeaderAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:800:1: ( ( ( rule__Model__HeaderAssignment_0 ) ) )
            // InternalMetaTemplating.g:801:1: ( ( rule__Model__HeaderAssignment_0 ) )
            {
            // InternalMetaTemplating.g:801:1: ( ( rule__Model__HeaderAssignment_0 ) )
            // InternalMetaTemplating.g:802:2: ( rule__Model__HeaderAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getHeaderAssignment_0()); 
            // InternalMetaTemplating.g:803:2: ( rule__Model__HeaderAssignment_0 )
            // InternalMetaTemplating.g:803:3: rule__Model__HeaderAssignment_0
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
    // InternalMetaTemplating.g:811:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:815:1: ( rule__Model__Group__1__Impl )
            // InternalMetaTemplating.g:816:2: rule__Model__Group__1__Impl
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
    // InternalMetaTemplating.g:822:1: rule__Model__Group__1__Impl : ( ( rule__Model__ContentAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:826:1: ( ( ( rule__Model__ContentAssignment_1 )* ) )
            // InternalMetaTemplating.g:827:1: ( ( rule__Model__ContentAssignment_1 )* )
            {
            // InternalMetaTemplating.g:827:1: ( ( rule__Model__ContentAssignment_1 )* )
            // InternalMetaTemplating.g:828:2: ( rule__Model__ContentAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getContentAssignment_1()); 
            // InternalMetaTemplating.g:829:2: ( rule__Model__ContentAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==14||LA9_0==17||LA9_0==29||LA9_0==31||LA9_0==33||LA9_0==37||LA9_0==41) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMetaTemplating.g:829:3: rule__Model__ContentAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ContentAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalMetaTemplating.g:838:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:842:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // InternalMetaTemplating.g:843:2: rule__Header__Group__0__Impl rule__Header__Group__1
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
    // InternalMetaTemplating.g:850:1: rule__Header__Group__0__Impl : ( () ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:854:1: ( ( () ) )
            // InternalMetaTemplating.g:855:1: ( () )
            {
            // InternalMetaTemplating.g:855:1: ( () )
            // InternalMetaTemplating.g:856:2: ()
            {
             before(grammarAccess.getHeaderAccess().getHeaderAction_0()); 
            // InternalMetaTemplating.g:857:2: ()
            // InternalMetaTemplating.g:857:3: 
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
    // InternalMetaTemplating.g:865:1: rule__Header__Group__1 : rule__Header__Group__1__Impl rule__Header__Group__2 ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:869:1: ( rule__Header__Group__1__Impl rule__Header__Group__2 )
            // InternalMetaTemplating.g:870:2: rule__Header__Group__1__Impl rule__Header__Group__2
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
    // InternalMetaTemplating.g:877:1: rule__Header__Group__1__Impl : ( ( rule__Header__LibsAssignment_1 )* ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:881:1: ( ( ( rule__Header__LibsAssignment_1 )* ) )
            // InternalMetaTemplating.g:882:1: ( ( rule__Header__LibsAssignment_1 )* )
            {
            // InternalMetaTemplating.g:882:1: ( ( rule__Header__LibsAssignment_1 )* )
            // InternalMetaTemplating.g:883:2: ( rule__Header__LibsAssignment_1 )*
            {
             before(grammarAccess.getHeaderAccess().getLibsAssignment_1()); 
            // InternalMetaTemplating.g:884:2: ( rule__Header__LibsAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMetaTemplating.g:884:3: rule__Header__LibsAssignment_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Header__LibsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalMetaTemplating.g:892:1: rule__Header__Group__2 : rule__Header__Group__2__Impl ;
    public final void rule__Header__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:896:1: ( rule__Header__Group__2__Impl )
            // InternalMetaTemplating.g:897:2: rule__Header__Group__2__Impl
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
    // InternalMetaTemplating.g:903:1: rule__Header__Group__2__Impl : ( ( rule__Header__ImportsAssignment_2 )* ) ;
    public final void rule__Header__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:907:1: ( ( ( rule__Header__ImportsAssignment_2 )* ) )
            // InternalMetaTemplating.g:908:1: ( ( rule__Header__ImportsAssignment_2 )* )
            {
            // InternalMetaTemplating.g:908:1: ( ( rule__Header__ImportsAssignment_2 )* )
            // InternalMetaTemplating.g:909:2: ( rule__Header__ImportsAssignment_2 )*
            {
             before(grammarAccess.getHeaderAccess().getImportsAssignment_2()); 
            // InternalMetaTemplating.g:910:2: ( rule__Header__ImportsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMetaTemplating.g:910:3: rule__Header__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Header__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalMetaTemplating.g:919:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:923:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMetaTemplating.g:924:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalMetaTemplating.g:931:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:935:1: ( ( 'import' ) )
            // InternalMetaTemplating.g:936:1: ( 'import' )
            {
            // InternalMetaTemplating.g:936:1: ( 'import' )
            // InternalMetaTemplating.g:937:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMetaTemplating.g:946:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:950:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalMetaTemplating.g:951:2: rule__Import__Group__1__Impl rule__Import__Group__2
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
    // InternalMetaTemplating.g:958:1: rule__Import__Group__1__Impl : ( ( rule__Import__PathAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:962:1: ( ( ( rule__Import__PathAssignment_1 ) ) )
            // InternalMetaTemplating.g:963:1: ( ( rule__Import__PathAssignment_1 ) )
            {
            // InternalMetaTemplating.g:963:1: ( ( rule__Import__PathAssignment_1 ) )
            // InternalMetaTemplating.g:964:2: ( rule__Import__PathAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getPathAssignment_1()); 
            // InternalMetaTemplating.g:965:2: ( rule__Import__PathAssignment_1 )
            // InternalMetaTemplating.g:965:3: rule__Import__PathAssignment_1
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
    // InternalMetaTemplating.g:973:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:977:1: ( rule__Import__Group__2__Impl )
            // InternalMetaTemplating.g:978:2: rule__Import__Group__2__Impl
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
    // InternalMetaTemplating.g:984:1: rule__Import__Group__2__Impl : ( ';' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:988:1: ( ( ';' ) )
            // InternalMetaTemplating.g:989:1: ( ';' )
            {
            // InternalMetaTemplating.g:989:1: ( ';' )
            // InternalMetaTemplating.g:990:2: ';'
            {
             before(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMetaTemplating.g:1000:1: rule__Libraries__Group__0 : rule__Libraries__Group__0__Impl rule__Libraries__Group__1 ;
    public final void rule__Libraries__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1004:1: ( rule__Libraries__Group__0__Impl rule__Libraries__Group__1 )
            // InternalMetaTemplating.g:1005:2: rule__Libraries__Group__0__Impl rule__Libraries__Group__1
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
    // InternalMetaTemplating.g:1012:1: rule__Libraries__Group__0__Impl : ( 'IMPORT' ) ;
    public final void rule__Libraries__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1016:1: ( ( 'IMPORT' ) )
            // InternalMetaTemplating.g:1017:1: ( 'IMPORT' )
            {
            // InternalMetaTemplating.g:1017:1: ( 'IMPORT' )
            // InternalMetaTemplating.g:1018:2: 'IMPORT'
            {
             before(grammarAccess.getLibrariesAccess().getIMPORTKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMetaTemplating.g:1027:1: rule__Libraries__Group__1 : rule__Libraries__Group__1__Impl rule__Libraries__Group__2 ;
    public final void rule__Libraries__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1031:1: ( rule__Libraries__Group__1__Impl rule__Libraries__Group__2 )
            // InternalMetaTemplating.g:1032:2: rule__Libraries__Group__1__Impl rule__Libraries__Group__2
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
    // InternalMetaTemplating.g:1039:1: rule__Libraries__Group__1__Impl : ( ( rule__Libraries__PathAssignment_1 ) ) ;
    public final void rule__Libraries__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1043:1: ( ( ( rule__Libraries__PathAssignment_1 ) ) )
            // InternalMetaTemplating.g:1044:1: ( ( rule__Libraries__PathAssignment_1 ) )
            {
            // InternalMetaTemplating.g:1044:1: ( ( rule__Libraries__PathAssignment_1 ) )
            // InternalMetaTemplating.g:1045:2: ( rule__Libraries__PathAssignment_1 )
            {
             before(grammarAccess.getLibrariesAccess().getPathAssignment_1()); 
            // InternalMetaTemplating.g:1046:2: ( rule__Libraries__PathAssignment_1 )
            // InternalMetaTemplating.g:1046:3: rule__Libraries__PathAssignment_1
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
    // InternalMetaTemplating.g:1054:1: rule__Libraries__Group__2 : rule__Libraries__Group__2__Impl ;
    public final void rule__Libraries__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1058:1: ( rule__Libraries__Group__2__Impl )
            // InternalMetaTemplating.g:1059:2: rule__Libraries__Group__2__Impl
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
    // InternalMetaTemplating.g:1065:1: rule__Libraries__Group__2__Impl : ( ';' ) ;
    public final void rule__Libraries__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1069:1: ( ( ';' ) )
            // InternalMetaTemplating.g:1070:1: ( ';' )
            {
            // InternalMetaTemplating.g:1070:1: ( ';' )
            // InternalMetaTemplating.g:1071:2: ';'
            {
             before(grammarAccess.getLibrariesAccess().getSemicolonKeyword_2()); 
            match(input,20,FOLLOW_2); 
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


    // $ANTLR start "rule__Note__Group__0"
    // InternalMetaTemplating.g:1081:1: rule__Note__Group__0 : rule__Note__Group__0__Impl rule__Note__Group__1 ;
    public final void rule__Note__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1085:1: ( rule__Note__Group__0__Impl rule__Note__Group__1 )
            // InternalMetaTemplating.g:1086:2: rule__Note__Group__0__Impl rule__Note__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Note__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__1();

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
    // $ANTLR end "rule__Note__Group__0"


    // $ANTLR start "rule__Note__Group__0__Impl"
    // InternalMetaTemplating.g:1093:1: rule__Note__Group__0__Impl : ( '#*' ) ;
    public final void rule__Note__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1097:1: ( ( '#*' ) )
            // InternalMetaTemplating.g:1098:1: ( '#*' )
            {
            // InternalMetaTemplating.g:1098:1: ( '#*' )
            // InternalMetaTemplating.g:1099:2: '#*'
            {
             before(grammarAccess.getNoteAccess().getNumberSignAsteriskKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getNumberSignAsteriskKeyword_0()); 

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
    // $ANTLR end "rule__Note__Group__0__Impl"


    // $ANTLR start "rule__Note__Group__1"
    // InternalMetaTemplating.g:1108:1: rule__Note__Group__1 : rule__Note__Group__1__Impl rule__Note__Group__2 ;
    public final void rule__Note__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1112:1: ( rule__Note__Group__1__Impl rule__Note__Group__2 )
            // InternalMetaTemplating.g:1113:2: rule__Note__Group__1__Impl rule__Note__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Note__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__2();

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
    // $ANTLR end "rule__Note__Group__1"


    // $ANTLR start "rule__Note__Group__1__Impl"
    // InternalMetaTemplating.g:1120:1: rule__Note__Group__1__Impl : ( ( ( rule__Note__WordAssignment_1 ) ) ( ( rule__Note__WordAssignment_1 )* ) ) ;
    public final void rule__Note__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1124:1: ( ( ( ( rule__Note__WordAssignment_1 ) ) ( ( rule__Note__WordAssignment_1 )* ) ) )
            // InternalMetaTemplating.g:1125:1: ( ( ( rule__Note__WordAssignment_1 ) ) ( ( rule__Note__WordAssignment_1 )* ) )
            {
            // InternalMetaTemplating.g:1125:1: ( ( ( rule__Note__WordAssignment_1 ) ) ( ( rule__Note__WordAssignment_1 )* ) )
            // InternalMetaTemplating.g:1126:2: ( ( rule__Note__WordAssignment_1 ) ) ( ( rule__Note__WordAssignment_1 )* )
            {
            // InternalMetaTemplating.g:1126:2: ( ( rule__Note__WordAssignment_1 ) )
            // InternalMetaTemplating.g:1127:3: ( rule__Note__WordAssignment_1 )
            {
             before(grammarAccess.getNoteAccess().getWordAssignment_1()); 
            // InternalMetaTemplating.g:1128:3: ( rule__Note__WordAssignment_1 )
            // InternalMetaTemplating.g:1128:4: rule__Note__WordAssignment_1
            {
            pushFollow(FOLLOW_12);
            rule__Note__WordAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getWordAssignment_1()); 

            }

            // InternalMetaTemplating.g:1131:2: ( ( rule__Note__WordAssignment_1 )* )
            // InternalMetaTemplating.g:1132:3: ( rule__Note__WordAssignment_1 )*
            {
             before(grammarAccess.getNoteAccess().getWordAssignment_1()); 
            // InternalMetaTemplating.g:1133:3: ( rule__Note__WordAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMetaTemplating.g:1133:4: rule__Note__WordAssignment_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Note__WordAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getNoteAccess().getWordAssignment_1()); 

            }


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
    // $ANTLR end "rule__Note__Group__1__Impl"


    // $ANTLR start "rule__Note__Group__2"
    // InternalMetaTemplating.g:1142:1: rule__Note__Group__2 : rule__Note__Group__2__Impl ;
    public final void rule__Note__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1146:1: ( rule__Note__Group__2__Impl )
            // InternalMetaTemplating.g:1147:2: rule__Note__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Note__Group__2__Impl();

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
    // $ANTLR end "rule__Note__Group__2"


    // $ANTLR start "rule__Note__Group__2__Impl"
    // InternalMetaTemplating.g:1153:1: rule__Note__Group__2__Impl : ( '*#' ) ;
    public final void rule__Note__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1157:1: ( ( '*#' ) )
            // InternalMetaTemplating.g:1158:1: ( '*#' )
            {
            // InternalMetaTemplating.g:1158:1: ( '*#' )
            // InternalMetaTemplating.g:1159:2: '*#'
            {
             before(grammarAccess.getNoteAccess().getAsteriskNumberSignKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getAsteriskNumberSignKeyword_2()); 

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
    // $ANTLR end "rule__Note__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalMetaTemplating.g:1169:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1173:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalMetaTemplating.g:1174:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMetaTemplating.g:1181:1: rule__Rule__Group__0__Impl : ( 'FORALL' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1185:1: ( ( 'FORALL' ) )
            // InternalMetaTemplating.g:1186:1: ( 'FORALL' )
            {
            // InternalMetaTemplating.g:1186:1: ( 'FORALL' )
            // InternalMetaTemplating.g:1187:2: 'FORALL'
            {
             before(grammarAccess.getRuleAccess().getFORALLKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMetaTemplating.g:1196:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1200:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalMetaTemplating.g:1201:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalMetaTemplating.g:1208:1: rule__Rule__Group__1__Impl : ( '(' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1212:1: ( ( '(' ) )
            // InternalMetaTemplating.g:1213:1: ( '(' )
            {
            // InternalMetaTemplating.g:1213:1: ( '(' )
            // InternalMetaTemplating.g:1214:2: '('
            {
             before(grammarAccess.getRuleAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMetaTemplating.g:1223:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1227:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalMetaTemplating.g:1228:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalMetaTemplating.g:1235:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__ElementAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1239:1: ( ( ( rule__Rule__ElementAssignment_2 ) ) )
            // InternalMetaTemplating.g:1240:1: ( ( rule__Rule__ElementAssignment_2 ) )
            {
            // InternalMetaTemplating.g:1240:1: ( ( rule__Rule__ElementAssignment_2 ) )
            // InternalMetaTemplating.g:1241:2: ( rule__Rule__ElementAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getElementAssignment_2()); 
            // InternalMetaTemplating.g:1242:2: ( rule__Rule__ElementAssignment_2 )
            // InternalMetaTemplating.g:1242:3: rule__Rule__ElementAssignment_2
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
    // InternalMetaTemplating.g:1250:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1254:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalMetaTemplating.g:1255:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
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
    // InternalMetaTemplating.g:1262:1: rule__Rule__Group__3__Impl : ( ':' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1266:1: ( ( ':' ) )
            // InternalMetaTemplating.g:1267:1: ( ':' )
            {
            // InternalMetaTemplating.g:1267:1: ( ':' )
            // InternalMetaTemplating.g:1268:2: ':'
            {
             before(grammarAccess.getRuleAccess().getColonKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMetaTemplating.g:1277:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1281:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalMetaTemplating.g:1282:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalMetaTemplating.g:1289:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__PropertyAssignment_4 ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1293:1: ( ( ( rule__Rule__PropertyAssignment_4 ) ) )
            // InternalMetaTemplating.g:1294:1: ( ( rule__Rule__PropertyAssignment_4 ) )
            {
            // InternalMetaTemplating.g:1294:1: ( ( rule__Rule__PropertyAssignment_4 ) )
            // InternalMetaTemplating.g:1295:2: ( rule__Rule__PropertyAssignment_4 )
            {
             before(grammarAccess.getRuleAccess().getPropertyAssignment_4()); 
            // InternalMetaTemplating.g:1296:2: ( rule__Rule__PropertyAssignment_4 )
            // InternalMetaTemplating.g:1296:3: rule__Rule__PropertyAssignment_4
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
    // InternalMetaTemplating.g:1304:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1308:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalMetaTemplating.g:1309:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
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
    // InternalMetaTemplating.g:1316:1: rule__Rule__Group__5__Impl : ( 'TAGGED' ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1320:1: ( ( 'TAGGED' ) )
            // InternalMetaTemplating.g:1321:1: ( 'TAGGED' )
            {
            // InternalMetaTemplating.g:1321:1: ( 'TAGGED' )
            // InternalMetaTemplating.g:1322:2: 'TAGGED'
            {
             before(grammarAccess.getRuleAccess().getTAGGEDKeyword_5()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMetaTemplating.g:1331:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1335:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // InternalMetaTemplating.g:1336:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalMetaTemplating.g:1343:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__TagAssignment_6 ) ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1347:1: ( ( ( rule__Rule__TagAssignment_6 ) ) )
            // InternalMetaTemplating.g:1348:1: ( ( rule__Rule__TagAssignment_6 ) )
            {
            // InternalMetaTemplating.g:1348:1: ( ( rule__Rule__TagAssignment_6 ) )
            // InternalMetaTemplating.g:1349:2: ( rule__Rule__TagAssignment_6 )
            {
             before(grammarAccess.getRuleAccess().getTagAssignment_6()); 
            // InternalMetaTemplating.g:1350:2: ( rule__Rule__TagAssignment_6 )
            // InternalMetaTemplating.g:1350:3: rule__Rule__TagAssignment_6
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
    // InternalMetaTemplating.g:1358:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl rule__Rule__Group__8 ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1362:1: ( rule__Rule__Group__7__Impl rule__Rule__Group__8 )
            // InternalMetaTemplating.g:1363:2: rule__Rule__Group__7__Impl rule__Rule__Group__8
            {
            pushFollow(FOLLOW_17);
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
    // InternalMetaTemplating.g:1370:1: rule__Rule__Group__7__Impl : ( ')' ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1374:1: ( ( ')' ) )
            // InternalMetaTemplating.g:1375:1: ( ')' )
            {
            // InternalMetaTemplating.g:1375:1: ( ')' )
            // InternalMetaTemplating.g:1376:2: ')'
            {
             before(grammarAccess.getRuleAccess().getRightParenthesisKeyword_7()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMetaTemplating.g:1385:1: rule__Rule__Group__8 : rule__Rule__Group__8__Impl rule__Rule__Group__9 ;
    public final void rule__Rule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1389:1: ( rule__Rule__Group__8__Impl rule__Rule__Group__9 )
            // InternalMetaTemplating.g:1390:2: rule__Rule__Group__8__Impl rule__Rule__Group__9
            {
            pushFollow(FOLLOW_18);
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
    // InternalMetaTemplating.g:1397:1: rule__Rule__Group__8__Impl : ( '{' ) ;
    public final void rule__Rule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1401:1: ( ( '{' ) )
            // InternalMetaTemplating.g:1402:1: ( '{' )
            {
            // InternalMetaTemplating.g:1402:1: ( '{' )
            // InternalMetaTemplating.g:1403:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMetaTemplating.g:1412:1: rule__Rule__Group__9 : rule__Rule__Group__9__Impl rule__Rule__Group__10 ;
    public final void rule__Rule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1416:1: ( rule__Rule__Group__9__Impl rule__Rule__Group__10 )
            // InternalMetaTemplating.g:1417:2: rule__Rule__Group__9__Impl rule__Rule__Group__10
            {
            pushFollow(FOLLOW_18);
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
    // InternalMetaTemplating.g:1424:1: rule__Rule__Group__9__Impl : ( ( rule__Rule__BodyAssignment_9 )* ) ;
    public final void rule__Rule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1428:1: ( ( ( rule__Rule__BodyAssignment_9 )* ) )
            // InternalMetaTemplating.g:1429:1: ( ( rule__Rule__BodyAssignment_9 )* )
            {
            // InternalMetaTemplating.g:1429:1: ( ( rule__Rule__BodyAssignment_9 )* )
            // InternalMetaTemplating.g:1430:2: ( rule__Rule__BodyAssignment_9 )*
            {
             before(grammarAccess.getRuleAccess().getBodyAssignment_9()); 
            // InternalMetaTemplating.g:1431:2: ( rule__Rule__BodyAssignment_9 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==14||LA13_0==17||LA13_0==29||LA13_0==31||LA13_0==33||LA13_0==37||LA13_0==41) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMetaTemplating.g:1431:3: rule__Rule__BodyAssignment_9
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Rule__BodyAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalMetaTemplating.g:1439:1: rule__Rule__Group__10 : rule__Rule__Group__10__Impl ;
    public final void rule__Rule__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1443:1: ( rule__Rule__Group__10__Impl )
            // InternalMetaTemplating.g:1444:2: rule__Rule__Group__10__Impl
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
    // InternalMetaTemplating.g:1450:1: rule__Rule__Group__10__Impl : ( '}' ) ;
    public final void rule__Rule__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1454:1: ( ( '}' ) )
            // InternalMetaTemplating.g:1455:1: ( '}' )
            {
            // InternalMetaTemplating.g:1455:1: ( '}' )
            // InternalMetaTemplating.g:1456:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_10()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMetaTemplating.g:1466:1: rule__Iterator__Group__0 : rule__Iterator__Group__0__Impl rule__Iterator__Group__1 ;
    public final void rule__Iterator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1470:1: ( rule__Iterator__Group__0__Impl rule__Iterator__Group__1 )
            // InternalMetaTemplating.g:1471:2: rule__Iterator__Group__0__Impl rule__Iterator__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMetaTemplating.g:1478:1: rule__Iterator__Group__0__Impl : ( 'foreach' ) ;
    public final void rule__Iterator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1482:1: ( ( 'foreach' ) )
            // InternalMetaTemplating.g:1483:1: ( 'foreach' )
            {
            // InternalMetaTemplating.g:1483:1: ( 'foreach' )
            // InternalMetaTemplating.g:1484:2: 'foreach'
            {
             before(grammarAccess.getIteratorAccess().getForeachKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMetaTemplating.g:1493:1: rule__Iterator__Group__1 : rule__Iterator__Group__1__Impl rule__Iterator__Group__2 ;
    public final void rule__Iterator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1497:1: ( rule__Iterator__Group__1__Impl rule__Iterator__Group__2 )
            // InternalMetaTemplating.g:1498:2: rule__Iterator__Group__1__Impl rule__Iterator__Group__2
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
    // InternalMetaTemplating.g:1505:1: rule__Iterator__Group__1__Impl : ( '(' ) ;
    public final void rule__Iterator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1509:1: ( ( '(' ) )
            // InternalMetaTemplating.g:1510:1: ( '(' )
            {
            // InternalMetaTemplating.g:1510:1: ( '(' )
            // InternalMetaTemplating.g:1511:2: '('
            {
             before(grammarAccess.getIteratorAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMetaTemplating.g:1520:1: rule__Iterator__Group__2 : rule__Iterator__Group__2__Impl rule__Iterator__Group__3 ;
    public final void rule__Iterator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1524:1: ( rule__Iterator__Group__2__Impl rule__Iterator__Group__3 )
            // InternalMetaTemplating.g:1525:2: rule__Iterator__Group__2__Impl rule__Iterator__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalMetaTemplating.g:1532:1: rule__Iterator__Group__2__Impl : ( ( rule__Iterator__ElementAssignment_2 ) ) ;
    public final void rule__Iterator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1536:1: ( ( ( rule__Iterator__ElementAssignment_2 ) ) )
            // InternalMetaTemplating.g:1537:1: ( ( rule__Iterator__ElementAssignment_2 ) )
            {
            // InternalMetaTemplating.g:1537:1: ( ( rule__Iterator__ElementAssignment_2 ) )
            // InternalMetaTemplating.g:1538:2: ( rule__Iterator__ElementAssignment_2 )
            {
             before(grammarAccess.getIteratorAccess().getElementAssignment_2()); 
            // InternalMetaTemplating.g:1539:2: ( rule__Iterator__ElementAssignment_2 )
            // InternalMetaTemplating.g:1539:3: rule__Iterator__ElementAssignment_2
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
    // InternalMetaTemplating.g:1547:1: rule__Iterator__Group__3 : rule__Iterator__Group__3__Impl rule__Iterator__Group__4 ;
    public final void rule__Iterator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1551:1: ( rule__Iterator__Group__3__Impl rule__Iterator__Group__4 )
            // InternalMetaTemplating.g:1552:2: rule__Iterator__Group__3__Impl rule__Iterator__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalMetaTemplating.g:1559:1: rule__Iterator__Group__3__Impl : ( 'in' ) ;
    public final void rule__Iterator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1563:1: ( ( 'in' ) )
            // InternalMetaTemplating.g:1564:1: ( 'in' )
            {
            // InternalMetaTemplating.g:1564:1: ( 'in' )
            // InternalMetaTemplating.g:1565:2: 'in'
            {
             before(grammarAccess.getIteratorAccess().getInKeyword_3()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMetaTemplating.g:1574:1: rule__Iterator__Group__4 : rule__Iterator__Group__4__Impl rule__Iterator__Group__5 ;
    public final void rule__Iterator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1578:1: ( rule__Iterator__Group__4__Impl rule__Iterator__Group__5 )
            // InternalMetaTemplating.g:1579:2: rule__Iterator__Group__4__Impl rule__Iterator__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalMetaTemplating.g:1586:1: rule__Iterator__Group__4__Impl : ( ( rule__Iterator__QueryAssignment_4 ) ) ;
    public final void rule__Iterator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1590:1: ( ( ( rule__Iterator__QueryAssignment_4 ) ) )
            // InternalMetaTemplating.g:1591:1: ( ( rule__Iterator__QueryAssignment_4 ) )
            {
            // InternalMetaTemplating.g:1591:1: ( ( rule__Iterator__QueryAssignment_4 ) )
            // InternalMetaTemplating.g:1592:2: ( rule__Iterator__QueryAssignment_4 )
            {
             before(grammarAccess.getIteratorAccess().getQueryAssignment_4()); 
            // InternalMetaTemplating.g:1593:2: ( rule__Iterator__QueryAssignment_4 )
            // InternalMetaTemplating.g:1593:3: rule__Iterator__QueryAssignment_4
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
    // InternalMetaTemplating.g:1601:1: rule__Iterator__Group__5 : rule__Iterator__Group__5__Impl rule__Iterator__Group__6 ;
    public final void rule__Iterator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1605:1: ( rule__Iterator__Group__5__Impl rule__Iterator__Group__6 )
            // InternalMetaTemplating.g:1606:2: rule__Iterator__Group__5__Impl rule__Iterator__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalMetaTemplating.g:1613:1: rule__Iterator__Group__5__Impl : ( ')' ) ;
    public final void rule__Iterator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1617:1: ( ( ')' ) )
            // InternalMetaTemplating.g:1618:1: ( ')' )
            {
            // InternalMetaTemplating.g:1618:1: ( ')' )
            // InternalMetaTemplating.g:1619:2: ')'
            {
             before(grammarAccess.getIteratorAccess().getRightParenthesisKeyword_5()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMetaTemplating.g:1628:1: rule__Iterator__Group__6 : rule__Iterator__Group__6__Impl rule__Iterator__Group__7 ;
    public final void rule__Iterator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1632:1: ( rule__Iterator__Group__6__Impl rule__Iterator__Group__7 )
            // InternalMetaTemplating.g:1633:2: rule__Iterator__Group__6__Impl rule__Iterator__Group__7
            {
            pushFollow(FOLLOW_18);
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
    // InternalMetaTemplating.g:1640:1: rule__Iterator__Group__6__Impl : ( '{' ) ;
    public final void rule__Iterator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1644:1: ( ( '{' ) )
            // InternalMetaTemplating.g:1645:1: ( '{' )
            {
            // InternalMetaTemplating.g:1645:1: ( '{' )
            // InternalMetaTemplating.g:1646:2: '{'
            {
             before(grammarAccess.getIteratorAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMetaTemplating.g:1655:1: rule__Iterator__Group__7 : rule__Iterator__Group__7__Impl rule__Iterator__Group__8 ;
    public final void rule__Iterator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1659:1: ( rule__Iterator__Group__7__Impl rule__Iterator__Group__8 )
            // InternalMetaTemplating.g:1660:2: rule__Iterator__Group__7__Impl rule__Iterator__Group__8
            {
            pushFollow(FOLLOW_18);
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
    // InternalMetaTemplating.g:1667:1: rule__Iterator__Group__7__Impl : ( ( rule__Iterator__BodyAssignment_7 )* ) ;
    public final void rule__Iterator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1671:1: ( ( ( rule__Iterator__BodyAssignment_7 )* ) )
            // InternalMetaTemplating.g:1672:1: ( ( rule__Iterator__BodyAssignment_7 )* )
            {
            // InternalMetaTemplating.g:1672:1: ( ( rule__Iterator__BodyAssignment_7 )* )
            // InternalMetaTemplating.g:1673:2: ( rule__Iterator__BodyAssignment_7 )*
            {
             before(grammarAccess.getIteratorAccess().getBodyAssignment_7()); 
            // InternalMetaTemplating.g:1674:2: ( rule__Iterator__BodyAssignment_7 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==14||LA14_0==17||LA14_0==29||LA14_0==31||LA14_0==33||LA14_0==37||LA14_0==41) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMetaTemplating.g:1674:3: rule__Iterator__BodyAssignment_7
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Iterator__BodyAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalMetaTemplating.g:1682:1: rule__Iterator__Group__8 : rule__Iterator__Group__8__Impl ;
    public final void rule__Iterator__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1686:1: ( rule__Iterator__Group__8__Impl )
            // InternalMetaTemplating.g:1687:2: rule__Iterator__Group__8__Impl
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
    // InternalMetaTemplating.g:1693:1: rule__Iterator__Group__8__Impl : ( '}' ) ;
    public final void rule__Iterator__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1697:1: ( ( '}' ) )
            // InternalMetaTemplating.g:1698:1: ( '}' )
            {
            // InternalMetaTemplating.g:1698:1: ( '}' )
            // InternalMetaTemplating.g:1699:2: '}'
            {
             before(grammarAccess.getIteratorAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMetaTemplating.g:1709:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1713:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // InternalMetaTemplating.g:1714:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMetaTemplating.g:1721:1: rule__Query__Group__0__Impl : ( ( rule__Query__Alternatives_0 ) ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1725:1: ( ( ( rule__Query__Alternatives_0 ) ) )
            // InternalMetaTemplating.g:1726:1: ( ( rule__Query__Alternatives_0 ) )
            {
            // InternalMetaTemplating.g:1726:1: ( ( rule__Query__Alternatives_0 ) )
            // InternalMetaTemplating.g:1727:2: ( rule__Query__Alternatives_0 )
            {
             before(grammarAccess.getQueryAccess().getAlternatives_0()); 
            // InternalMetaTemplating.g:1728:2: ( rule__Query__Alternatives_0 )
            // InternalMetaTemplating.g:1728:3: rule__Query__Alternatives_0
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
    // InternalMetaTemplating.g:1736:1: rule__Query__Group__1 : rule__Query__Group__1__Impl ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1740:1: ( rule__Query__Group__1__Impl )
            // InternalMetaTemplating.g:1741:2: rule__Query__Group__1__Impl
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
    // InternalMetaTemplating.g:1747:1: rule__Query__Group__1__Impl : ( ( rule__Query__SubQueryAssignment_1 )* ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1751:1: ( ( ( rule__Query__SubQueryAssignment_1 )* ) )
            // InternalMetaTemplating.g:1752:1: ( ( rule__Query__SubQueryAssignment_1 )* )
            {
            // InternalMetaTemplating.g:1752:1: ( ( rule__Query__SubQueryAssignment_1 )* )
            // InternalMetaTemplating.g:1753:2: ( rule__Query__SubQueryAssignment_1 )*
            {
             before(grammarAccess.getQueryAccess().getSubQueryAssignment_1()); 
            // InternalMetaTemplating.g:1754:2: ( rule__Query__SubQueryAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==35) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMetaTemplating.g:1754:3: rule__Query__SubQueryAssignment_1
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Query__SubQueryAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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


    // $ANTLR start "rule__SubQuery__Group_0__0"
    // InternalMetaTemplating.g:1763:1: rule__SubQuery__Group_0__0 : rule__SubQuery__Group_0__0__Impl rule__SubQuery__Group_0__1 ;
    public final void rule__SubQuery__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1767:1: ( rule__SubQuery__Group_0__0__Impl rule__SubQuery__Group_0__1 )
            // InternalMetaTemplating.g:1768:2: rule__SubQuery__Group_0__0__Impl rule__SubQuery__Group_0__1
            {
            pushFollow(FOLLOW_20);
            rule__SubQuery__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubQuery__Group_0__1();

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
    // $ANTLR end "rule__SubQuery__Group_0__0"


    // $ANTLR start "rule__SubQuery__Group_0__0__Impl"
    // InternalMetaTemplating.g:1775:1: rule__SubQuery__Group_0__0__Impl : ( '.' ) ;
    public final void rule__SubQuery__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1779:1: ( ( '.' ) )
            // InternalMetaTemplating.g:1780:1: ( '.' )
            {
            // InternalMetaTemplating.g:1780:1: ( '.' )
            // InternalMetaTemplating.g:1781:2: '.'
            {
             before(grammarAccess.getSubQueryAccess().getFullStopKeyword_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSubQueryAccess().getFullStopKeyword_0_0()); 

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
    // $ANTLR end "rule__SubQuery__Group_0__0__Impl"


    // $ANTLR start "rule__SubQuery__Group_0__1"
    // InternalMetaTemplating.g:1790:1: rule__SubQuery__Group_0__1 : rule__SubQuery__Group_0__1__Impl rule__SubQuery__Group_0__2 ;
    public final void rule__SubQuery__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1794:1: ( rule__SubQuery__Group_0__1__Impl rule__SubQuery__Group_0__2 )
            // InternalMetaTemplating.g:1795:2: rule__SubQuery__Group_0__1__Impl rule__SubQuery__Group_0__2
            {
            pushFollow(FOLLOW_23);
            rule__SubQuery__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubQuery__Group_0__2();

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
    // $ANTLR end "rule__SubQuery__Group_0__1"


    // $ANTLR start "rule__SubQuery__Group_0__1__Impl"
    // InternalMetaTemplating.g:1802:1: rule__SubQuery__Group_0__1__Impl : ( ( rule__SubQuery__Alternatives_0_1 ) ) ;
    public final void rule__SubQuery__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1806:1: ( ( ( rule__SubQuery__Alternatives_0_1 ) ) )
            // InternalMetaTemplating.g:1807:1: ( ( rule__SubQuery__Alternatives_0_1 ) )
            {
            // InternalMetaTemplating.g:1807:1: ( ( rule__SubQuery__Alternatives_0_1 ) )
            // InternalMetaTemplating.g:1808:2: ( rule__SubQuery__Alternatives_0_1 )
            {
             before(grammarAccess.getSubQueryAccess().getAlternatives_0_1()); 
            // InternalMetaTemplating.g:1809:2: ( rule__SubQuery__Alternatives_0_1 )
            // InternalMetaTemplating.g:1809:3: rule__SubQuery__Alternatives_0_1
            {
            pushFollow(FOLLOW_2);
            rule__SubQuery__Alternatives_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSubQueryAccess().getAlternatives_0_1()); 

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
    // $ANTLR end "rule__SubQuery__Group_0__1__Impl"


    // $ANTLR start "rule__SubQuery__Group_0__2"
    // InternalMetaTemplating.g:1817:1: rule__SubQuery__Group_0__2 : rule__SubQuery__Group_0__2__Impl ;
    public final void rule__SubQuery__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1821:1: ( rule__SubQuery__Group_0__2__Impl )
            // InternalMetaTemplating.g:1822:2: rule__SubQuery__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubQuery__Group_0__2__Impl();

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
    // $ANTLR end "rule__SubQuery__Group_0__2"


    // $ANTLR start "rule__SubQuery__Group_0__2__Impl"
    // InternalMetaTemplating.g:1828:1: rule__SubQuery__Group_0__2__Impl : ( '()' ) ;
    public final void rule__SubQuery__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1832:1: ( ( '()' ) )
            // InternalMetaTemplating.g:1833:1: ( '()' )
            {
            // InternalMetaTemplating.g:1833:1: ( '()' )
            // InternalMetaTemplating.g:1834:2: '()'
            {
             before(grammarAccess.getSubQueryAccess().getLeftParenthesisRightParenthesisKeyword_0_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSubQueryAccess().getLeftParenthesisRightParenthesisKeyword_0_2()); 

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
    // $ANTLR end "rule__SubQuery__Group_0__2__Impl"


    // $ANTLR start "rule__SubQuery__Group_1__0"
    // InternalMetaTemplating.g:1844:1: rule__SubQuery__Group_1__0 : rule__SubQuery__Group_1__0__Impl rule__SubQuery__Group_1__1 ;
    public final void rule__SubQuery__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1848:1: ( rule__SubQuery__Group_1__0__Impl rule__SubQuery__Group_1__1 )
            // InternalMetaTemplating.g:1849:2: rule__SubQuery__Group_1__0__Impl rule__SubQuery__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__SubQuery__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubQuery__Group_1__1();

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
    // $ANTLR end "rule__SubQuery__Group_1__0"


    // $ANTLR start "rule__SubQuery__Group_1__0__Impl"
    // InternalMetaTemplating.g:1856:1: rule__SubQuery__Group_1__0__Impl : ( '.' ) ;
    public final void rule__SubQuery__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1860:1: ( ( '.' ) )
            // InternalMetaTemplating.g:1861:1: ( '.' )
            {
            // InternalMetaTemplating.g:1861:1: ( '.' )
            // InternalMetaTemplating.g:1862:2: '.'
            {
             before(grammarAccess.getSubQueryAccess().getFullStopKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSubQueryAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__SubQuery__Group_1__0__Impl"


    // $ANTLR start "rule__SubQuery__Group_1__1"
    // InternalMetaTemplating.g:1871:1: rule__SubQuery__Group_1__1 : rule__SubQuery__Group_1__1__Impl ;
    public final void rule__SubQuery__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1875:1: ( rule__SubQuery__Group_1__1__Impl )
            // InternalMetaTemplating.g:1876:2: rule__SubQuery__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubQuery__Group_1__1__Impl();

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
    // $ANTLR end "rule__SubQuery__Group_1__1"


    // $ANTLR start "rule__SubQuery__Group_1__1__Impl"
    // InternalMetaTemplating.g:1882:1: rule__SubQuery__Group_1__1__Impl : ( ( rule__SubQuery__Alternatives_1_1 ) ) ;
    public final void rule__SubQuery__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1886:1: ( ( ( rule__SubQuery__Alternatives_1_1 ) ) )
            // InternalMetaTemplating.g:1887:1: ( ( rule__SubQuery__Alternatives_1_1 ) )
            {
            // InternalMetaTemplating.g:1887:1: ( ( rule__SubQuery__Alternatives_1_1 ) )
            // InternalMetaTemplating.g:1888:2: ( rule__SubQuery__Alternatives_1_1 )
            {
             before(grammarAccess.getSubQueryAccess().getAlternatives_1_1()); 
            // InternalMetaTemplating.g:1889:2: ( rule__SubQuery__Alternatives_1_1 )
            // InternalMetaTemplating.g:1889:3: rule__SubQuery__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SubQuery__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSubQueryAccess().getAlternatives_1_1()); 

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
    // $ANTLR end "rule__SubQuery__Group_1__1__Impl"


    // $ANTLR start "rule__Ph__Group__0"
    // InternalMetaTemplating.g:1898:1: rule__Ph__Group__0 : rule__Ph__Group__0__Impl rule__Ph__Group__1 ;
    public final void rule__Ph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1902:1: ( rule__Ph__Group__0__Impl rule__Ph__Group__1 )
            // InternalMetaTemplating.g:1903:2: rule__Ph__Group__0__Impl rule__Ph__Group__1
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
    // InternalMetaTemplating.g:1910:1: rule__Ph__Group__0__Impl : ( '[[' ) ;
    public final void rule__Ph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1914:1: ( ( '[[' ) )
            // InternalMetaTemplating.g:1915:1: ( '[[' )
            {
            // InternalMetaTemplating.g:1915:1: ( '[[' )
            // InternalMetaTemplating.g:1916:2: '[['
            {
             before(grammarAccess.getPhAccess().getLeftSquareBracketLeftSquareBracketKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMetaTemplating.g:1925:1: rule__Ph__Group__1 : rule__Ph__Group__1__Impl rule__Ph__Group__2 ;
    public final void rule__Ph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1929:1: ( rule__Ph__Group__1__Impl rule__Ph__Group__2 )
            // InternalMetaTemplating.g:1930:2: rule__Ph__Group__1__Impl rule__Ph__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalMetaTemplating.g:1937:1: rule__Ph__Group__1__Impl : ( ( rule__Ph__PropertyAssignment_1 ) ) ;
    public final void rule__Ph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1941:1: ( ( ( rule__Ph__PropertyAssignment_1 ) ) )
            // InternalMetaTemplating.g:1942:1: ( ( rule__Ph__PropertyAssignment_1 ) )
            {
            // InternalMetaTemplating.g:1942:1: ( ( rule__Ph__PropertyAssignment_1 ) )
            // InternalMetaTemplating.g:1943:2: ( rule__Ph__PropertyAssignment_1 )
            {
             before(grammarAccess.getPhAccess().getPropertyAssignment_1()); 
            // InternalMetaTemplating.g:1944:2: ( rule__Ph__PropertyAssignment_1 )
            // InternalMetaTemplating.g:1944:3: rule__Ph__PropertyAssignment_1
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
    // InternalMetaTemplating.g:1952:1: rule__Ph__Group__2 : rule__Ph__Group__2__Impl rule__Ph__Group__3 ;
    public final void rule__Ph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1956:1: ( rule__Ph__Group__2__Impl rule__Ph__Group__3 )
            // InternalMetaTemplating.g:1957:2: rule__Ph__Group__2__Impl rule__Ph__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalMetaTemplating.g:1964:1: rule__Ph__Group__2__Impl : ( ( rule__Ph__MetaPropertyAssignment_2 )? ) ;
    public final void rule__Ph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1968:1: ( ( ( rule__Ph__MetaPropertyAssignment_2 )? ) )
            // InternalMetaTemplating.g:1969:1: ( ( rule__Ph__MetaPropertyAssignment_2 )? )
            {
            // InternalMetaTemplating.g:1969:1: ( ( rule__Ph__MetaPropertyAssignment_2 )? )
            // InternalMetaTemplating.g:1970:2: ( rule__Ph__MetaPropertyAssignment_2 )?
            {
             before(grammarAccess.getPhAccess().getMetaPropertyAssignment_2()); 
            // InternalMetaTemplating.g:1971:2: ( rule__Ph__MetaPropertyAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==40) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMetaTemplating.g:1971:3: rule__Ph__MetaPropertyAssignment_2
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
    // InternalMetaTemplating.g:1979:1: rule__Ph__Group__3 : rule__Ph__Group__3__Impl ;
    public final void rule__Ph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1983:1: ( rule__Ph__Group__3__Impl )
            // InternalMetaTemplating.g:1984:2: rule__Ph__Group__3__Impl
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
    // InternalMetaTemplating.g:1990:1: rule__Ph__Group__3__Impl : ( ']]' ) ;
    public final void rule__Ph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1994:1: ( ( ']]' ) )
            // InternalMetaTemplating.g:1995:1: ( ']]' )
            {
            // InternalMetaTemplating.g:1995:1: ( ']]' )
            // InternalMetaTemplating.g:1996:2: ']]'
            {
             before(grammarAccess.getPhAccess().getRightSquareBracketRightSquareBracketKeyword_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMetaTemplating.g:2006:1: rule__MetaPh__Group__0 : rule__MetaPh__Group__0__Impl rule__MetaPh__Group__1 ;
    public final void rule__MetaPh__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2010:1: ( rule__MetaPh__Group__0__Impl rule__MetaPh__Group__1 )
            // InternalMetaTemplating.g:2011:2: rule__MetaPh__Group__0__Impl rule__MetaPh__Group__1
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
    // InternalMetaTemplating.g:2018:1: rule__MetaPh__Group__0__Impl : ( '[' ) ;
    public final void rule__MetaPh__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2022:1: ( ( '[' ) )
            // InternalMetaTemplating.g:2023:1: ( '[' )
            {
            // InternalMetaTemplating.g:2023:1: ( '[' )
            // InternalMetaTemplating.g:2024:2: '['
            {
             before(grammarAccess.getMetaPhAccess().getLeftSquareBracketKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMetaTemplating.g:2033:1: rule__MetaPh__Group__1 : rule__MetaPh__Group__1__Impl rule__MetaPh__Group__2 ;
    public final void rule__MetaPh__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2037:1: ( rule__MetaPh__Group__1__Impl rule__MetaPh__Group__2 )
            // InternalMetaTemplating.g:2038:2: rule__MetaPh__Group__1__Impl rule__MetaPh__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalMetaTemplating.g:2045:1: rule__MetaPh__Group__1__Impl : ( ( rule__MetaPh__PropertyAssignment_1 ) ) ;
    public final void rule__MetaPh__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2049:1: ( ( ( rule__MetaPh__PropertyAssignment_1 ) ) )
            // InternalMetaTemplating.g:2050:1: ( ( rule__MetaPh__PropertyAssignment_1 ) )
            {
            // InternalMetaTemplating.g:2050:1: ( ( rule__MetaPh__PropertyAssignment_1 ) )
            // InternalMetaTemplating.g:2051:2: ( rule__MetaPh__PropertyAssignment_1 )
            {
             before(grammarAccess.getMetaPhAccess().getPropertyAssignment_1()); 
            // InternalMetaTemplating.g:2052:2: ( rule__MetaPh__PropertyAssignment_1 )
            // InternalMetaTemplating.g:2052:3: rule__MetaPh__PropertyAssignment_1
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
    // InternalMetaTemplating.g:2060:1: rule__MetaPh__Group__2 : rule__MetaPh__Group__2__Impl rule__MetaPh__Group__3 ;
    public final void rule__MetaPh__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2064:1: ( rule__MetaPh__Group__2__Impl rule__MetaPh__Group__3 )
            // InternalMetaTemplating.g:2065:2: rule__MetaPh__Group__2__Impl rule__MetaPh__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalMetaTemplating.g:2072:1: rule__MetaPh__Group__2__Impl : ( ( rule__MetaPh__Group_2__0 )? ) ;
    public final void rule__MetaPh__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2076:1: ( ( ( rule__MetaPh__Group_2__0 )? ) )
            // InternalMetaTemplating.g:2077:1: ( ( rule__MetaPh__Group_2__0 )? )
            {
            // InternalMetaTemplating.g:2077:1: ( ( rule__MetaPh__Group_2__0 )? )
            // InternalMetaTemplating.g:2078:2: ( rule__MetaPh__Group_2__0 )?
            {
             before(grammarAccess.getMetaPhAccess().getGroup_2()); 
            // InternalMetaTemplating.g:2079:2: ( rule__MetaPh__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMetaTemplating.g:2079:3: rule__MetaPh__Group_2__0
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
    // InternalMetaTemplating.g:2087:1: rule__MetaPh__Group__3 : rule__MetaPh__Group__3__Impl ;
    public final void rule__MetaPh__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2091:1: ( rule__MetaPh__Group__3__Impl )
            // InternalMetaTemplating.g:2092:2: rule__MetaPh__Group__3__Impl
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
    // InternalMetaTemplating.g:2098:1: rule__MetaPh__Group__3__Impl : ( ']' ) ;
    public final void rule__MetaPh__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2102:1: ( ( ']' ) )
            // InternalMetaTemplating.g:2103:1: ( ']' )
            {
            // InternalMetaTemplating.g:2103:1: ( ']' )
            // InternalMetaTemplating.g:2104:2: ']'
            {
             before(grammarAccess.getMetaPhAccess().getRightSquareBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMetaTemplating.g:2114:1: rule__MetaPh__Group_2__0 : rule__MetaPh__Group_2__0__Impl rule__MetaPh__Group_2__1 ;
    public final void rule__MetaPh__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2118:1: ( rule__MetaPh__Group_2__0__Impl rule__MetaPh__Group_2__1 )
            // InternalMetaTemplating.g:2119:2: rule__MetaPh__Group_2__0__Impl rule__MetaPh__Group_2__1
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
    // InternalMetaTemplating.g:2126:1: rule__MetaPh__Group_2__0__Impl : ( 'TAGINFO' ) ;
    public final void rule__MetaPh__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2130:1: ( ( 'TAGINFO' ) )
            // InternalMetaTemplating.g:2131:1: ( 'TAGINFO' )
            {
            // InternalMetaTemplating.g:2131:1: ( 'TAGINFO' )
            // InternalMetaTemplating.g:2132:2: 'TAGINFO'
            {
             before(grammarAccess.getMetaPhAccess().getTAGINFOKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMetaTemplating.g:2141:1: rule__MetaPh__Group_2__1 : rule__MetaPh__Group_2__1__Impl ;
    public final void rule__MetaPh__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2145:1: ( rule__MetaPh__Group_2__1__Impl )
            // InternalMetaTemplating.g:2146:2: rule__MetaPh__Group_2__1__Impl
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
    // InternalMetaTemplating.g:2152:1: rule__MetaPh__Group_2__1__Impl : ( ( rule__MetaPh__TagAssignment_2_1 ) ) ;
    public final void rule__MetaPh__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2156:1: ( ( ( rule__MetaPh__TagAssignment_2_1 ) ) )
            // InternalMetaTemplating.g:2157:1: ( ( rule__MetaPh__TagAssignment_2_1 ) )
            {
            // InternalMetaTemplating.g:2157:1: ( ( rule__MetaPh__TagAssignment_2_1 ) )
            // InternalMetaTemplating.g:2158:2: ( rule__MetaPh__TagAssignment_2_1 )
            {
             before(grammarAccess.getMetaPhAccess().getTagAssignment_2_1()); 
            // InternalMetaTemplating.g:2159:2: ( rule__MetaPh__TagAssignment_2_1 )
            // InternalMetaTemplating.g:2159:3: rule__MetaPh__TagAssignment_2_1
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
    // InternalMetaTemplating.g:2168:1: rule__MetaProperty__Group__0 : rule__MetaProperty__Group__0__Impl rule__MetaProperty__Group__1 ;
    public final void rule__MetaProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2172:1: ( rule__MetaProperty__Group__0__Impl rule__MetaProperty__Group__1 )
            // InternalMetaTemplating.g:2173:2: rule__MetaProperty__Group__0__Impl rule__MetaProperty__Group__1
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
    // InternalMetaTemplating.g:2180:1: rule__MetaProperty__Group__0__Impl : ( '.{' ) ;
    public final void rule__MetaProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2184:1: ( ( '.{' ) )
            // InternalMetaTemplating.g:2185:1: ( '.{' )
            {
            // InternalMetaTemplating.g:2185:1: ( '.{' )
            // InternalMetaTemplating.g:2186:2: '.{'
            {
             before(grammarAccess.getMetaPropertyAccess().getFullStopLeftCurlyBracketKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMetaTemplating.g:2195:1: rule__MetaProperty__Group__1 : rule__MetaProperty__Group__1__Impl rule__MetaProperty__Group__2 ;
    public final void rule__MetaProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2199:1: ( rule__MetaProperty__Group__1__Impl rule__MetaProperty__Group__2 )
            // InternalMetaTemplating.g:2200:2: rule__MetaProperty__Group__1__Impl rule__MetaProperty__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMetaTemplating.g:2207:1: rule__MetaProperty__Group__1__Impl : ( ( rule__MetaProperty__PropertyAssignment_1 ) ) ;
    public final void rule__MetaProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2211:1: ( ( ( rule__MetaProperty__PropertyAssignment_1 ) ) )
            // InternalMetaTemplating.g:2212:1: ( ( rule__MetaProperty__PropertyAssignment_1 ) )
            {
            // InternalMetaTemplating.g:2212:1: ( ( rule__MetaProperty__PropertyAssignment_1 ) )
            // InternalMetaTemplating.g:2213:2: ( rule__MetaProperty__PropertyAssignment_1 )
            {
             before(grammarAccess.getMetaPropertyAccess().getPropertyAssignment_1()); 
            // InternalMetaTemplating.g:2214:2: ( rule__MetaProperty__PropertyAssignment_1 )
            // InternalMetaTemplating.g:2214:3: rule__MetaProperty__PropertyAssignment_1
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
    // InternalMetaTemplating.g:2222:1: rule__MetaProperty__Group__2 : rule__MetaProperty__Group__2__Impl ;
    public final void rule__MetaProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2226:1: ( rule__MetaProperty__Group__2__Impl )
            // InternalMetaTemplating.g:2227:2: rule__MetaProperty__Group__2__Impl
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
    // InternalMetaTemplating.g:2233:1: rule__MetaProperty__Group__2__Impl : ( '}' ) ;
    public final void rule__MetaProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2237:1: ( ( '}' ) )
            // InternalMetaTemplating.g:2238:1: ( '}' )
            {
            // InternalMetaTemplating.g:2238:1: ( '}' )
            // InternalMetaTemplating.g:2239:2: '}'
            {
             before(grammarAccess.getMetaPropertyAccess().getRightCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMetaTemplating.g:2249:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2253:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalMetaTemplating.g:2254:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMetaTemplating.g:2261:1: rule__Property__Group__0__Impl : ( ( rule__Property__PropertyAssignment_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2265:1: ( ( ( rule__Property__PropertyAssignment_0 ) ) )
            // InternalMetaTemplating.g:2266:1: ( ( rule__Property__PropertyAssignment_0 ) )
            {
            // InternalMetaTemplating.g:2266:1: ( ( rule__Property__PropertyAssignment_0 ) )
            // InternalMetaTemplating.g:2267:2: ( rule__Property__PropertyAssignment_0 )
            {
             before(grammarAccess.getPropertyAccess().getPropertyAssignment_0()); 
            // InternalMetaTemplating.g:2268:2: ( rule__Property__PropertyAssignment_0 )
            // InternalMetaTemplating.g:2268:3: rule__Property__PropertyAssignment_0
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
    // InternalMetaTemplating.g:2276:1: rule__Property__Group__1 : rule__Property__Group__1__Impl ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2280:1: ( rule__Property__Group__1__Impl )
            // InternalMetaTemplating.g:2281:2: rule__Property__Group__1__Impl
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
    // InternalMetaTemplating.g:2287:1: rule__Property__Group__1__Impl : ( ( rule__Property__SubPropertiesAssignment_1 )* ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2291:1: ( ( ( rule__Property__SubPropertiesAssignment_1 )* ) )
            // InternalMetaTemplating.g:2292:1: ( ( rule__Property__SubPropertiesAssignment_1 )* )
            {
            // InternalMetaTemplating.g:2292:1: ( ( rule__Property__SubPropertiesAssignment_1 )* )
            // InternalMetaTemplating.g:2293:2: ( rule__Property__SubPropertiesAssignment_1 )*
            {
             before(grammarAccess.getPropertyAccess().getSubPropertiesAssignment_1()); 
            // InternalMetaTemplating.g:2294:2: ( rule__Property__SubPropertiesAssignment_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==35) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMetaTemplating.g:2294:3: rule__Property__SubPropertiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Property__SubPropertiesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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


    // $ANTLR start "rule__SubProperty__Group_0__0"
    // InternalMetaTemplating.g:2303:1: rule__SubProperty__Group_0__0 : rule__SubProperty__Group_0__0__Impl rule__SubProperty__Group_0__1 ;
    public final void rule__SubProperty__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2307:1: ( rule__SubProperty__Group_0__0__Impl rule__SubProperty__Group_0__1 )
            // InternalMetaTemplating.g:2308:2: rule__SubProperty__Group_0__0__Impl rule__SubProperty__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__SubProperty__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubProperty__Group_0__1();

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
    // $ANTLR end "rule__SubProperty__Group_0__0"


    // $ANTLR start "rule__SubProperty__Group_0__0__Impl"
    // InternalMetaTemplating.g:2315:1: rule__SubProperty__Group_0__0__Impl : ( '.' ) ;
    public final void rule__SubProperty__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2319:1: ( ( '.' ) )
            // InternalMetaTemplating.g:2320:1: ( '.' )
            {
            // InternalMetaTemplating.g:2320:1: ( '.' )
            // InternalMetaTemplating.g:2321:2: '.'
            {
             before(grammarAccess.getSubPropertyAccess().getFullStopKeyword_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSubPropertyAccess().getFullStopKeyword_0_0()); 

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
    // $ANTLR end "rule__SubProperty__Group_0__0__Impl"


    // $ANTLR start "rule__SubProperty__Group_0__1"
    // InternalMetaTemplating.g:2330:1: rule__SubProperty__Group_0__1 : rule__SubProperty__Group_0__1__Impl rule__SubProperty__Group_0__2 ;
    public final void rule__SubProperty__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2334:1: ( rule__SubProperty__Group_0__1__Impl rule__SubProperty__Group_0__2 )
            // InternalMetaTemplating.g:2335:2: rule__SubProperty__Group_0__1__Impl rule__SubProperty__Group_0__2
            {
            pushFollow(FOLLOW_23);
            rule__SubProperty__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubProperty__Group_0__2();

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
    // $ANTLR end "rule__SubProperty__Group_0__1"


    // $ANTLR start "rule__SubProperty__Group_0__1__Impl"
    // InternalMetaTemplating.g:2342:1: rule__SubProperty__Group_0__1__Impl : ( ( rule__SubProperty__MethodAssignment_0_1 ) ) ;
    public final void rule__SubProperty__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2346:1: ( ( ( rule__SubProperty__MethodAssignment_0_1 ) ) )
            // InternalMetaTemplating.g:2347:1: ( ( rule__SubProperty__MethodAssignment_0_1 ) )
            {
            // InternalMetaTemplating.g:2347:1: ( ( rule__SubProperty__MethodAssignment_0_1 ) )
            // InternalMetaTemplating.g:2348:2: ( rule__SubProperty__MethodAssignment_0_1 )
            {
             before(grammarAccess.getSubPropertyAccess().getMethodAssignment_0_1()); 
            // InternalMetaTemplating.g:2349:2: ( rule__SubProperty__MethodAssignment_0_1 )
            // InternalMetaTemplating.g:2349:3: rule__SubProperty__MethodAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__SubProperty__MethodAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSubPropertyAccess().getMethodAssignment_0_1()); 

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
    // $ANTLR end "rule__SubProperty__Group_0__1__Impl"


    // $ANTLR start "rule__SubProperty__Group_0__2"
    // InternalMetaTemplating.g:2357:1: rule__SubProperty__Group_0__2 : rule__SubProperty__Group_0__2__Impl ;
    public final void rule__SubProperty__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2361:1: ( rule__SubProperty__Group_0__2__Impl )
            // InternalMetaTemplating.g:2362:2: rule__SubProperty__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubProperty__Group_0__2__Impl();

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
    // $ANTLR end "rule__SubProperty__Group_0__2"


    // $ANTLR start "rule__SubProperty__Group_0__2__Impl"
    // InternalMetaTemplating.g:2368:1: rule__SubProperty__Group_0__2__Impl : ( '()' ) ;
    public final void rule__SubProperty__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2372:1: ( ( '()' ) )
            // InternalMetaTemplating.g:2373:1: ( '()' )
            {
            // InternalMetaTemplating.g:2373:1: ( '()' )
            // InternalMetaTemplating.g:2374:2: '()'
            {
             before(grammarAccess.getSubPropertyAccess().getLeftParenthesisRightParenthesisKeyword_0_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSubPropertyAccess().getLeftParenthesisRightParenthesisKeyword_0_2()); 

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
    // $ANTLR end "rule__SubProperty__Group_0__2__Impl"


    // $ANTLR start "rule__SubProperty__Group_1__0"
    // InternalMetaTemplating.g:2384:1: rule__SubProperty__Group_1__0 : rule__SubProperty__Group_1__0__Impl rule__SubProperty__Group_1__1 ;
    public final void rule__SubProperty__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2388:1: ( rule__SubProperty__Group_1__0__Impl rule__SubProperty__Group_1__1 )
            // InternalMetaTemplating.g:2389:2: rule__SubProperty__Group_1__0__Impl rule__SubProperty__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__SubProperty__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubProperty__Group_1__1();

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
    // $ANTLR end "rule__SubProperty__Group_1__0"


    // $ANTLR start "rule__SubProperty__Group_1__0__Impl"
    // InternalMetaTemplating.g:2396:1: rule__SubProperty__Group_1__0__Impl : ( '.' ) ;
    public final void rule__SubProperty__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2400:1: ( ( '.' ) )
            // InternalMetaTemplating.g:2401:1: ( '.' )
            {
            // InternalMetaTemplating.g:2401:1: ( '.' )
            // InternalMetaTemplating.g:2402:2: '.'
            {
             before(grammarAccess.getSubPropertyAccess().getFullStopKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSubPropertyAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__SubProperty__Group_1__0__Impl"


    // $ANTLR start "rule__SubProperty__Group_1__1"
    // InternalMetaTemplating.g:2411:1: rule__SubProperty__Group_1__1 : rule__SubProperty__Group_1__1__Impl ;
    public final void rule__SubProperty__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2415:1: ( rule__SubProperty__Group_1__1__Impl )
            // InternalMetaTemplating.g:2416:2: rule__SubProperty__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubProperty__Group_1__1__Impl();

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
    // $ANTLR end "rule__SubProperty__Group_1__1"


    // $ANTLR start "rule__SubProperty__Group_1__1__Impl"
    // InternalMetaTemplating.g:2422:1: rule__SubProperty__Group_1__1__Impl : ( ( rule__SubProperty__PropertyAssignment_1_1 ) ) ;
    public final void rule__SubProperty__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2426:1: ( ( ( rule__SubProperty__PropertyAssignment_1_1 ) ) )
            // InternalMetaTemplating.g:2427:1: ( ( rule__SubProperty__PropertyAssignment_1_1 ) )
            {
            // InternalMetaTemplating.g:2427:1: ( ( rule__SubProperty__PropertyAssignment_1_1 ) )
            // InternalMetaTemplating.g:2428:2: ( rule__SubProperty__PropertyAssignment_1_1 )
            {
             before(grammarAccess.getSubPropertyAccess().getPropertyAssignment_1_1()); 
            // InternalMetaTemplating.g:2429:2: ( rule__SubProperty__PropertyAssignment_1_1 )
            // InternalMetaTemplating.g:2429:3: rule__SubProperty__PropertyAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SubProperty__PropertyAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSubPropertyAccess().getPropertyAssignment_1_1()); 

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
    // $ANTLR end "rule__SubProperty__Group_1__1__Impl"


    // $ANTLR start "rule__EscapedString__Group__0"
    // InternalMetaTemplating.g:2438:1: rule__EscapedString__Group__0 : rule__EscapedString__Group__0__Impl rule__EscapedString__Group__1 ;
    public final void rule__EscapedString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2442:1: ( rule__EscapedString__Group__0__Impl rule__EscapedString__Group__1 )
            // InternalMetaTemplating.g:2443:2: rule__EscapedString__Group__0__Impl rule__EscapedString__Group__1
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
    // InternalMetaTemplating.g:2450:1: rule__EscapedString__Group__0__Impl : ( '@{' ) ;
    public final void rule__EscapedString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2454:1: ( ( '@{' ) )
            // InternalMetaTemplating.g:2455:1: ( '@{' )
            {
            // InternalMetaTemplating.g:2455:1: ( '@{' )
            // InternalMetaTemplating.g:2456:2: '@{'
            {
             before(grammarAccess.getEscapedStringAccess().getCommercialAtLeftCurlyBracketKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMetaTemplating.g:2465:1: rule__EscapedString__Group__1 : rule__EscapedString__Group__1__Impl rule__EscapedString__Group__2 ;
    public final void rule__EscapedString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2469:1: ( rule__EscapedString__Group__1__Impl rule__EscapedString__Group__2 )
            // InternalMetaTemplating.g:2470:2: rule__EscapedString__Group__1__Impl rule__EscapedString__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMetaTemplating.g:2477:1: rule__EscapedString__Group__1__Impl : ( ( rule__EscapedString__StrAssignment_1 ) ) ;
    public final void rule__EscapedString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2481:1: ( ( ( rule__EscapedString__StrAssignment_1 ) ) )
            // InternalMetaTemplating.g:2482:1: ( ( rule__EscapedString__StrAssignment_1 ) )
            {
            // InternalMetaTemplating.g:2482:1: ( ( rule__EscapedString__StrAssignment_1 ) )
            // InternalMetaTemplating.g:2483:2: ( rule__EscapedString__StrAssignment_1 )
            {
             before(grammarAccess.getEscapedStringAccess().getStrAssignment_1()); 
            // InternalMetaTemplating.g:2484:2: ( rule__EscapedString__StrAssignment_1 )
            // InternalMetaTemplating.g:2484:3: rule__EscapedString__StrAssignment_1
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
    // InternalMetaTemplating.g:2492:1: rule__EscapedString__Group__2 : rule__EscapedString__Group__2__Impl ;
    public final void rule__EscapedString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2496:1: ( rule__EscapedString__Group__2__Impl )
            // InternalMetaTemplating.g:2497:2: rule__EscapedString__Group__2__Impl
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
    // InternalMetaTemplating.g:2503:1: rule__EscapedString__Group__2__Impl : ( '}@' ) ;
    public final void rule__EscapedString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2507:1: ( ( '}@' ) )
            // InternalMetaTemplating.g:2508:1: ( '}@' )
            {
            // InternalMetaTemplating.g:2508:1: ( '}@' )
            // InternalMetaTemplating.g:2509:2: '}@'
            {
             before(grammarAccess.getEscapedStringAccess().getRightCurlyBracketCommercialAtKeyword_2()); 
            match(input,42,FOLLOW_2); 
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
    // InternalMetaTemplating.g:2519:1: rule__Escaped__Group__0 : rule__Escaped__Group__0__Impl rule__Escaped__Group__1 ;
    public final void rule__Escaped__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2523:1: ( rule__Escaped__Group__0__Impl rule__Escaped__Group__1 )
            // InternalMetaTemplating.g:2524:2: rule__Escaped__Group__0__Impl rule__Escaped__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalMetaTemplating.g:2531:1: rule__Escaped__Group__0__Impl : ( '#' ) ;
    public final void rule__Escaped__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2535:1: ( ( '#' ) )
            // InternalMetaTemplating.g:2536:1: ( '#' )
            {
            // InternalMetaTemplating.g:2536:1: ( '#' )
            // InternalMetaTemplating.g:2537:2: '#'
            {
             before(grammarAccess.getEscapedAccess().getNumberSignKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMetaTemplating.g:2546:1: rule__Escaped__Group__1 : rule__Escaped__Group__1__Impl ;
    public final void rule__Escaped__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2550:1: ( rule__Escaped__Group__1__Impl )
            // InternalMetaTemplating.g:2551:2: rule__Escaped__Group__1__Impl
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
    // InternalMetaTemplating.g:2557:1: rule__Escaped__Group__1__Impl : ( ( rule__Escaped__CharAssignment_1 ) ) ;
    public final void rule__Escaped__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2561:1: ( ( ( rule__Escaped__CharAssignment_1 ) ) )
            // InternalMetaTemplating.g:2562:1: ( ( rule__Escaped__CharAssignment_1 ) )
            {
            // InternalMetaTemplating.g:2562:1: ( ( rule__Escaped__CharAssignment_1 ) )
            // InternalMetaTemplating.g:2563:2: ( rule__Escaped__CharAssignment_1 )
            {
             before(grammarAccess.getEscapedAccess().getCharAssignment_1()); 
            // InternalMetaTemplating.g:2564:2: ( rule__Escaped__CharAssignment_1 )
            // InternalMetaTemplating.g:2564:3: rule__Escaped__CharAssignment_1
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
    // InternalMetaTemplating.g:2573:1: rule__Model__HeaderAssignment_0 : ( ruleHeader ) ;
    public final void rule__Model__HeaderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2577:1: ( ( ruleHeader ) )
            // InternalMetaTemplating.g:2578:2: ( ruleHeader )
            {
            // InternalMetaTemplating.g:2578:2: ( ruleHeader )
            // InternalMetaTemplating.g:2579:3: ruleHeader
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
    // InternalMetaTemplating.g:2588:1: rule__Model__ContentAssignment_1 : ( ruleInstructions ) ;
    public final void rule__Model__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2592:1: ( ( ruleInstructions ) )
            // InternalMetaTemplating.g:2593:2: ( ruleInstructions )
            {
            // InternalMetaTemplating.g:2593:2: ( ruleInstructions )
            // InternalMetaTemplating.g:2594:3: ruleInstructions
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
    // InternalMetaTemplating.g:2603:1: rule__Header__LibsAssignment_1 : ( ruleLibraries ) ;
    public final void rule__Header__LibsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2607:1: ( ( ruleLibraries ) )
            // InternalMetaTemplating.g:2608:2: ( ruleLibraries )
            {
            // InternalMetaTemplating.g:2608:2: ( ruleLibraries )
            // InternalMetaTemplating.g:2609:3: ruleLibraries
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
    // InternalMetaTemplating.g:2618:1: rule__Header__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__Header__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2622:1: ( ( ruleImport ) )
            // InternalMetaTemplating.g:2623:2: ( ruleImport )
            {
            // InternalMetaTemplating.g:2623:2: ( ruleImport )
            // InternalMetaTemplating.g:2624:3: ruleImport
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
    // InternalMetaTemplating.g:2633:1: rule__Import__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2637:1: ( ( RULE_STRING ) )
            // InternalMetaTemplating.g:2638:2: ( RULE_STRING )
            {
            // InternalMetaTemplating.g:2638:2: ( RULE_STRING )
            // InternalMetaTemplating.g:2639:3: RULE_STRING
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
    // InternalMetaTemplating.g:2648:1: rule__Libraries__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Libraries__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2652:1: ( ( RULE_STRING ) )
            // InternalMetaTemplating.g:2653:2: ( RULE_STRING )
            {
            // InternalMetaTemplating.g:2653:2: ( RULE_STRING )
            // InternalMetaTemplating.g:2654:3: RULE_STRING
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


    // $ANTLR start "rule__Note__WordAssignment_1"
    // InternalMetaTemplating.g:2663:1: rule__Note__WordAssignment_1 : ( RULE_ID ) ;
    public final void rule__Note__WordAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2667:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:2668:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:2668:2: ( RULE_ID )
            // InternalMetaTemplating.g:2669:3: RULE_ID
            {
             before(grammarAccess.getNoteAccess().getWordIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getWordIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Note__WordAssignment_1"


    // $ANTLR start "rule__Instructions__NoteAssignment_0"
    // InternalMetaTemplating.g:2678:1: rule__Instructions__NoteAssignment_0 : ( ruleNote ) ;
    public final void rule__Instructions__NoteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2682:1: ( ( ruleNote ) )
            // InternalMetaTemplating.g:2683:2: ( ruleNote )
            {
            // InternalMetaTemplating.g:2683:2: ( ruleNote )
            // InternalMetaTemplating.g:2684:3: ruleNote
            {
             before(grammarAccess.getInstructionsAccess().getNoteNoteParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getInstructionsAccess().getNoteNoteParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Instructions__NoteAssignment_0"


    // $ANTLR start "rule__Instructions__StatementAssignment_1"
    // InternalMetaTemplating.g:2693:1: rule__Instructions__StatementAssignment_1 : ( ruleStatement ) ;
    public final void rule__Instructions__StatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2697:1: ( ( ruleStatement ) )
            // InternalMetaTemplating.g:2698:2: ( ruleStatement )
            {
            // InternalMetaTemplating.g:2698:2: ( ruleStatement )
            // InternalMetaTemplating.g:2699:3: ruleStatement
            {
             before(grammarAccess.getInstructionsAccess().getStatementStatementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getInstructionsAccess().getStatementStatementParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Instructions__StatementAssignment_1"


    // $ANTLR start "rule__Instructions__IteratorAssignment_2"
    // InternalMetaTemplating.g:2708:1: rule__Instructions__IteratorAssignment_2 : ( ruleIterator ) ;
    public final void rule__Instructions__IteratorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2712:1: ( ( ruleIterator ) )
            // InternalMetaTemplating.g:2713:2: ( ruleIterator )
            {
            // InternalMetaTemplating.g:2713:2: ( ruleIterator )
            // InternalMetaTemplating.g:2714:3: ruleIterator
            {
             before(grammarAccess.getInstructionsAccess().getIteratorIteratorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIterator();

            state._fsp--;

             after(grammarAccess.getInstructionsAccess().getIteratorIteratorParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Instructions__IteratorAssignment_2"


    // $ANTLR start "rule__Instructions__RuleAssignment_3"
    // InternalMetaTemplating.g:2723:1: rule__Instructions__RuleAssignment_3 : ( ruleRule ) ;
    public final void rule__Instructions__RuleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2727:1: ( ( ruleRule ) )
            // InternalMetaTemplating.g:2728:2: ( ruleRule )
            {
            // InternalMetaTemplating.g:2728:2: ( ruleRule )
            // InternalMetaTemplating.g:2729:3: ruleRule
            {
             before(grammarAccess.getInstructionsAccess().getRuleRuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getInstructionsAccess().getRuleRuleParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Instructions__RuleAssignment_3"


    // $ANTLR start "rule__Statement__TextAssignment_0"
    // InternalMetaTemplating.g:2738:1: rule__Statement__TextAssignment_0 : ( RULE_ID ) ;
    public final void rule__Statement__TextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2742:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:2743:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:2743:2: ( RULE_ID )
            // InternalMetaTemplating.g:2744:3: RULE_ID
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
    // InternalMetaTemplating.g:2753:1: rule__Statement__CharAssignment_1 : ( ruleEscaped ) ;
    public final void rule__Statement__CharAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2757:1: ( ( ruleEscaped ) )
            // InternalMetaTemplating.g:2758:2: ( ruleEscaped )
            {
            // InternalMetaTemplating.g:2758:2: ( ruleEscaped )
            // InternalMetaTemplating.g:2759:3: ruleEscaped
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
    // InternalMetaTemplating.g:2768:1: rule__Statement__StringAssignment_2 : ( ruleEscapedString ) ;
    public final void rule__Statement__StringAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2772:1: ( ( ruleEscapedString ) )
            // InternalMetaTemplating.g:2773:2: ( ruleEscapedString )
            {
            // InternalMetaTemplating.g:2773:2: ( ruleEscapedString )
            // InternalMetaTemplating.g:2774:3: ruleEscapedString
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
    // InternalMetaTemplating.g:2783:1: rule__Statement__PlaceholderAssignment_3 : ( rulePh ) ;
    public final void rule__Statement__PlaceholderAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2787:1: ( ( rulePh ) )
            // InternalMetaTemplating.g:2788:2: ( rulePh )
            {
            // InternalMetaTemplating.g:2788:2: ( rulePh )
            // InternalMetaTemplating.g:2789:3: rulePh
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
    // InternalMetaTemplating.g:2798:1: rule__Statement__MetaPlaceholderAssignment_4 : ( ruleMetaPh ) ;
    public final void rule__Statement__MetaPlaceholderAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2802:1: ( ( ruleMetaPh ) )
            // InternalMetaTemplating.g:2803:2: ( ruleMetaPh )
            {
            // InternalMetaTemplating.g:2803:2: ( ruleMetaPh )
            // InternalMetaTemplating.g:2804:3: ruleMetaPh
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
    // InternalMetaTemplating.g:2813:1: rule__Rule__ElementAssignment_2 : ( RULE_ID ) ;
    public final void rule__Rule__ElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2817:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:2818:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:2818:2: ( RULE_ID )
            // InternalMetaTemplating.g:2819:3: RULE_ID
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
    // InternalMetaTemplating.g:2828:1: rule__Rule__PropertyAssignment_4 : ( ruleProperty ) ;
    public final void rule__Rule__PropertyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2832:1: ( ( ruleProperty ) )
            // InternalMetaTemplating.g:2833:2: ( ruleProperty )
            {
            // InternalMetaTemplating.g:2833:2: ( ruleProperty )
            // InternalMetaTemplating.g:2834:3: ruleProperty
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
    // InternalMetaTemplating.g:2843:1: rule__Rule__TagAssignment_6 : ( RULE_ID ) ;
    public final void rule__Rule__TagAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2847:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:2848:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:2848:2: ( RULE_ID )
            // InternalMetaTemplating.g:2849:3: RULE_ID
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
    // InternalMetaTemplating.g:2858:1: rule__Rule__BodyAssignment_9 : ( ruleInstructions ) ;
    public final void rule__Rule__BodyAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2862:1: ( ( ruleInstructions ) )
            // InternalMetaTemplating.g:2863:2: ( ruleInstructions )
            {
            // InternalMetaTemplating.g:2863:2: ( ruleInstructions )
            // InternalMetaTemplating.g:2864:3: ruleInstructions
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
    // InternalMetaTemplating.g:2873:1: rule__Iterator__ElementAssignment_2 : ( RULE_ID ) ;
    public final void rule__Iterator__ElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2877:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:2878:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:2878:2: ( RULE_ID )
            // InternalMetaTemplating.g:2879:3: RULE_ID
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
    // InternalMetaTemplating.g:2888:1: rule__Iterator__QueryAssignment_4 : ( ruleQuery ) ;
    public final void rule__Iterator__QueryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2892:1: ( ( ruleQuery ) )
            // InternalMetaTemplating.g:2893:2: ( ruleQuery )
            {
            // InternalMetaTemplating.g:2893:2: ( ruleQuery )
            // InternalMetaTemplating.g:2894:3: ruleQuery
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
    // InternalMetaTemplating.g:2903:1: rule__Iterator__BodyAssignment_7 : ( ruleInstructions ) ;
    public final void rule__Iterator__BodyAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2907:1: ( ( ruleInstructions ) )
            // InternalMetaTemplating.g:2908:2: ( ruleInstructions )
            {
            // InternalMetaTemplating.g:2908:2: ( ruleInstructions )
            // InternalMetaTemplating.g:2909:3: ruleInstructions
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
    // InternalMetaTemplating.g:2918:1: rule__Query__ItemAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Query__ItemAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2922:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:2923:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:2923:2: ( RULE_ID )
            // InternalMetaTemplating.g:2924:3: RULE_ID
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
    // InternalMetaTemplating.g:2933:1: rule__Query__RefAssignment_0_1 : ( ruleMetaPh ) ;
    public final void rule__Query__RefAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2937:1: ( ( ruleMetaPh ) )
            // InternalMetaTemplating.g:2938:2: ( ruleMetaPh )
            {
            // InternalMetaTemplating.g:2938:2: ( ruleMetaPh )
            // InternalMetaTemplating.g:2939:3: ruleMetaPh
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
    // InternalMetaTemplating.g:2948:1: rule__Query__SubQueryAssignment_1 : ( ruleSubQuery ) ;
    public final void rule__Query__SubQueryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2952:1: ( ( ruleSubQuery ) )
            // InternalMetaTemplating.g:2953:2: ( ruleSubQuery )
            {
            // InternalMetaTemplating.g:2953:2: ( ruleSubQuery )
            // InternalMetaTemplating.g:2954:3: ruleSubQuery
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


    // $ANTLR start "rule__SubQuery__MethItemAssignment_0_1_0"
    // InternalMetaTemplating.g:2963:1: rule__SubQuery__MethItemAssignment_0_1_0 : ( RULE_ID ) ;
    public final void rule__SubQuery__MethItemAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2967:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:2968:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:2968:2: ( RULE_ID )
            // InternalMetaTemplating.g:2969:3: RULE_ID
            {
             before(grammarAccess.getSubQueryAccess().getMethItemIDTerminalRuleCall_0_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSubQueryAccess().getMethItemIDTerminalRuleCall_0_1_0_0()); 

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
    // $ANTLR end "rule__SubQuery__MethItemAssignment_0_1_0"


    // $ANTLR start "rule__SubQuery__MethRefAssignment_0_1_1"
    // InternalMetaTemplating.g:2978:1: rule__SubQuery__MethRefAssignment_0_1_1 : ( ruleMetaPh ) ;
    public final void rule__SubQuery__MethRefAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2982:1: ( ( ruleMetaPh ) )
            // InternalMetaTemplating.g:2983:2: ( ruleMetaPh )
            {
            // InternalMetaTemplating.g:2983:2: ( ruleMetaPh )
            // InternalMetaTemplating.g:2984:3: ruleMetaPh
            {
             before(grammarAccess.getSubQueryAccess().getMethRefMetaPhParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaPh();

            state._fsp--;

             after(grammarAccess.getSubQueryAccess().getMethRefMetaPhParserRuleCall_0_1_1_0()); 

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
    // $ANTLR end "rule__SubQuery__MethRefAssignment_0_1_1"


    // $ANTLR start "rule__SubQuery__ItemAssignment_1_1_0"
    // InternalMetaTemplating.g:2993:1: rule__SubQuery__ItemAssignment_1_1_0 : ( RULE_ID ) ;
    public final void rule__SubQuery__ItemAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2997:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:2998:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:2998:2: ( RULE_ID )
            // InternalMetaTemplating.g:2999:3: RULE_ID
            {
             before(grammarAccess.getSubQueryAccess().getItemIDTerminalRuleCall_1_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSubQueryAccess().getItemIDTerminalRuleCall_1_1_0_0()); 

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
    // $ANTLR end "rule__SubQuery__ItemAssignment_1_1_0"


    // $ANTLR start "rule__SubQuery__RefAssignment_1_1_1"
    // InternalMetaTemplating.g:3008:1: rule__SubQuery__RefAssignment_1_1_1 : ( ruleMetaPh ) ;
    public final void rule__SubQuery__RefAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3012:1: ( ( ruleMetaPh ) )
            // InternalMetaTemplating.g:3013:2: ( ruleMetaPh )
            {
            // InternalMetaTemplating.g:3013:2: ( ruleMetaPh )
            // InternalMetaTemplating.g:3014:3: ruleMetaPh
            {
             before(grammarAccess.getSubQueryAccess().getRefMetaPhParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaPh();

            state._fsp--;

             after(grammarAccess.getSubQueryAccess().getRefMetaPhParserRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__SubQuery__RefAssignment_1_1_1"


    // $ANTLR start "rule__Ph__PropertyAssignment_1"
    // InternalMetaTemplating.g:3023:1: rule__Ph__PropertyAssignment_1 : ( ruleProperty ) ;
    public final void rule__Ph__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3027:1: ( ( ruleProperty ) )
            // InternalMetaTemplating.g:3028:2: ( ruleProperty )
            {
            // InternalMetaTemplating.g:3028:2: ( ruleProperty )
            // InternalMetaTemplating.g:3029:3: ruleProperty
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
    // InternalMetaTemplating.g:3038:1: rule__Ph__MetaPropertyAssignment_2 : ( ruleMetaProperty ) ;
    public final void rule__Ph__MetaPropertyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3042:1: ( ( ruleMetaProperty ) )
            // InternalMetaTemplating.g:3043:2: ( ruleMetaProperty )
            {
            // InternalMetaTemplating.g:3043:2: ( ruleMetaProperty )
            // InternalMetaTemplating.g:3044:3: ruleMetaProperty
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
    // InternalMetaTemplating.g:3053:1: rule__MetaPh__PropertyAssignment_1 : ( ruleProperty ) ;
    public final void rule__MetaPh__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3057:1: ( ( ruleProperty ) )
            // InternalMetaTemplating.g:3058:2: ( ruleProperty )
            {
            // InternalMetaTemplating.g:3058:2: ( ruleProperty )
            // InternalMetaTemplating.g:3059:3: ruleProperty
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
    // InternalMetaTemplating.g:3068:1: rule__MetaPh__TagAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__MetaPh__TagAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3072:1: ( ( RULE_STRING ) )
            // InternalMetaTemplating.g:3073:2: ( RULE_STRING )
            {
            // InternalMetaTemplating.g:3073:2: ( RULE_STRING )
            // InternalMetaTemplating.g:3074:3: RULE_STRING
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
    // InternalMetaTemplating.g:3083:1: rule__MetaProperty__PropertyAssignment_1 : ( ruleProperty ) ;
    public final void rule__MetaProperty__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3087:1: ( ( ruleProperty ) )
            // InternalMetaTemplating.g:3088:2: ( ruleProperty )
            {
            // InternalMetaTemplating.g:3088:2: ( ruleProperty )
            // InternalMetaTemplating.g:3089:3: ruleProperty
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
    // InternalMetaTemplating.g:3098:1: rule__Property__PropertyAssignment_0 : ( RULE_ID ) ;
    public final void rule__Property__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3102:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:3103:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:3103:2: ( RULE_ID )
            // InternalMetaTemplating.g:3104:3: RULE_ID
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
    // InternalMetaTemplating.g:3113:1: rule__Property__SubPropertiesAssignment_1 : ( ruleSubProperty ) ;
    public final void rule__Property__SubPropertiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3117:1: ( ( ruleSubProperty ) )
            // InternalMetaTemplating.g:3118:2: ( ruleSubProperty )
            {
            // InternalMetaTemplating.g:3118:2: ( ruleSubProperty )
            // InternalMetaTemplating.g:3119:3: ruleSubProperty
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


    // $ANTLR start "rule__SubProperty__MethodAssignment_0_1"
    // InternalMetaTemplating.g:3128:1: rule__SubProperty__MethodAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__SubProperty__MethodAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3132:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:3133:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:3133:2: ( RULE_ID )
            // InternalMetaTemplating.g:3134:3: RULE_ID
            {
             before(grammarAccess.getSubPropertyAccess().getMethodIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSubPropertyAccess().getMethodIDTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__SubProperty__MethodAssignment_0_1"


    // $ANTLR start "rule__SubProperty__PropertyAssignment_1_1"
    // InternalMetaTemplating.g:3143:1: rule__SubProperty__PropertyAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SubProperty__PropertyAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3147:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:3148:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:3148:2: ( RULE_ID )
            // InternalMetaTemplating.g:3149:3: RULE_ID
            {
             before(grammarAccess.getSubPropertyAccess().getPropertyIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSubPropertyAccess().getPropertyIDTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__SubProperty__PropertyAssignment_1_1"


    // $ANTLR start "rule__EscapedString__StrAssignment_1"
    // InternalMetaTemplating.g:3158:1: rule__EscapedString__StrAssignment_1 : ( RULE_STRING ) ;
    public final void rule__EscapedString__StrAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3162:1: ( ( RULE_STRING ) )
            // InternalMetaTemplating.g:3163:2: ( RULE_STRING )
            {
            // InternalMetaTemplating.g:3163:2: ( RULE_STRING )
            // InternalMetaTemplating.g:3164:3: RULE_STRING
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
    // InternalMetaTemplating.g:3173:1: rule__Escaped__CharAssignment_1 : ( ( rule__Escaped__CharAlternatives_1_0 ) ) ;
    public final void rule__Escaped__CharAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3177:1: ( ( ( rule__Escaped__CharAlternatives_1_0 ) ) )
            // InternalMetaTemplating.g:3178:2: ( ( rule__Escaped__CharAlternatives_1_0 ) )
            {
            // InternalMetaTemplating.g:3178:2: ( ( rule__Escaped__CharAlternatives_1_0 ) )
            // InternalMetaTemplating.g:3179:3: ( rule__Escaped__CharAlternatives_1_0 )
            {
             before(grammarAccess.getEscapedAccess().getCharAlternatives_1_0()); 
            // InternalMetaTemplating.g:3180:3: ( rule__Escaped__CharAlternatives_1_0 )
            // InternalMetaTemplating.g:3180:4: rule__Escaped__CharAlternatives_1_0
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


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\2\uffff\1\4\6\uffff\1\4\3\uffff";
    static final String dfa_3s = "\1\43\1\5\1\26\1\5\2\uffff\1\22\1\5\1\4\1\26\3\22";
    static final String dfa_4s = "\1\43\1\21\1\44\1\5\2\uffff\1\47\1\5\1\4\1\44\1\47\1\22\1\47";
    static final String dfa_5s = "\4\uffff\1\2\1\1\7\uffff";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2\13\uffff\1\3",
            "\1\4\14\uffff\1\4\1\5",
            "\1\6",
            "",
            "",
            "\1\11\20\uffff\1\7\3\uffff\1\10",
            "\1\12",
            "\1\13",
            "\1\4\14\uffff\1\4\1\5",
            "\1\11\20\uffff\1\7\1\14\2\uffff\1\10",
            "\1\11",
            "\1\11\20\uffff\1\7\3\uffff\1\10"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "595:1: rule__SubQuery__Alternatives : ( ( ( rule__SubQuery__Group_0__0 ) ) | ( ( rule__SubQuery__Group_1__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000222A0024020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000222A0024022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000222A0034020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000022000024020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000014000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000040000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000007FFF800L});

}