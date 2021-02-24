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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#'", "'{'", "'}'", "'['", "']'", "','", "';'", "'('", "')'", "':'", "'<'", "'>'", "'\\''", "'import'", "'IMPORT'", "'//'", "'/*'", "'*/'", "'[['", "']]'", "'FORALL'", "'TAGGED'", "'foreach'", "'in'", "'TAGINFO'", "'.{'", "'.'", "'()'", "'@{'", "'}@'"
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


    // $ANTLR start "entryRulePh"
    // InternalMetaTemplating.g:228:1: entryRulePh : rulePh EOF ;
    public final void entryRulePh() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:229:1: ( rulePh EOF )
            // InternalMetaTemplating.g:230:1: rulePh EOF
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
    // InternalMetaTemplating.g:237:1: rulePh : ( ( rule__Ph__Alternatives ) ) ;
    public final void rulePh() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:241:2: ( ( ( rule__Ph__Alternatives ) ) )
            // InternalMetaTemplating.g:242:2: ( ( rule__Ph__Alternatives ) )
            {
            // InternalMetaTemplating.g:242:2: ( ( rule__Ph__Alternatives ) )
            // InternalMetaTemplating.g:243:3: ( rule__Ph__Alternatives )
            {
             before(grammarAccess.getPhAccess().getAlternatives()); 
            // InternalMetaTemplating.g:244:3: ( rule__Ph__Alternatives )
            // InternalMetaTemplating.g:244:4: rule__Ph__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Ph__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPhAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleRule"
    // InternalMetaTemplating.g:253:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:254:1: ( ruleRule EOF )
            // InternalMetaTemplating.g:255:1: ruleRule EOF
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
    // InternalMetaTemplating.g:262:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:266:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalMetaTemplating.g:267:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalMetaTemplating.g:267:2: ( ( rule__Rule__Group__0 ) )
            // InternalMetaTemplating.g:268:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalMetaTemplating.g:269:3: ( rule__Rule__Group__0 )
            // InternalMetaTemplating.g:269:4: rule__Rule__Group__0
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
    // InternalMetaTemplating.g:278:1: entryRuleIterator : ruleIterator EOF ;
    public final void entryRuleIterator() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:279:1: ( ruleIterator EOF )
            // InternalMetaTemplating.g:280:1: ruleIterator EOF
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
    // InternalMetaTemplating.g:287:1: ruleIterator : ( ( rule__Iterator__Group__0 ) ) ;
    public final void ruleIterator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:291:2: ( ( ( rule__Iterator__Group__0 ) ) )
            // InternalMetaTemplating.g:292:2: ( ( rule__Iterator__Group__0 ) )
            {
            // InternalMetaTemplating.g:292:2: ( ( rule__Iterator__Group__0 ) )
            // InternalMetaTemplating.g:293:3: ( rule__Iterator__Group__0 )
            {
             before(grammarAccess.getIteratorAccess().getGroup()); 
            // InternalMetaTemplating.g:294:3: ( rule__Iterator__Group__0 )
            // InternalMetaTemplating.g:294:4: rule__Iterator__Group__0
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


    // $ANTLR start "entryRuleMetaPh"
    // InternalMetaTemplating.g:303:1: entryRuleMetaPh : ruleMetaPh EOF ;
    public final void entryRuleMetaPh() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:304:1: ( ruleMetaPh EOF )
            // InternalMetaTemplating.g:305:1: ruleMetaPh EOF
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
    // InternalMetaTemplating.g:312:1: ruleMetaPh : ( ( rule__MetaPh__Alternatives ) ) ;
    public final void ruleMetaPh() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:316:2: ( ( ( rule__MetaPh__Alternatives ) ) )
            // InternalMetaTemplating.g:317:2: ( ( rule__MetaPh__Alternatives ) )
            {
            // InternalMetaTemplating.g:317:2: ( ( rule__MetaPh__Alternatives ) )
            // InternalMetaTemplating.g:318:3: ( rule__MetaPh__Alternatives )
            {
             before(grammarAccess.getMetaPhAccess().getAlternatives()); 
            // InternalMetaTemplating.g:319:3: ( rule__MetaPh__Alternatives )
            // InternalMetaTemplating.g:319:4: rule__MetaPh__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MetaPh__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMetaPhAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleTagInfo"
    // InternalMetaTemplating.g:328:1: entryRuleTagInfo : ruleTagInfo EOF ;
    public final void entryRuleTagInfo() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:329:1: ( ruleTagInfo EOF )
            // InternalMetaTemplating.g:330:1: ruleTagInfo EOF
            {
             before(grammarAccess.getTagInfoRule()); 
            pushFollow(FOLLOW_1);
            ruleTagInfo();

            state._fsp--;

             after(grammarAccess.getTagInfoRule()); 
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
    // $ANTLR end "entryRuleTagInfo"


    // $ANTLR start "ruleTagInfo"
    // InternalMetaTemplating.g:337:1: ruleTagInfo : ( ( rule__TagInfo__Group__0 ) ) ;
    public final void ruleTagInfo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:341:2: ( ( ( rule__TagInfo__Group__0 ) ) )
            // InternalMetaTemplating.g:342:2: ( ( rule__TagInfo__Group__0 ) )
            {
            // InternalMetaTemplating.g:342:2: ( ( rule__TagInfo__Group__0 ) )
            // InternalMetaTemplating.g:343:3: ( rule__TagInfo__Group__0 )
            {
             before(grammarAccess.getTagInfoAccess().getGroup()); 
            // InternalMetaTemplating.g:344:3: ( rule__TagInfo__Group__0 )
            // InternalMetaTemplating.g:344:4: rule__TagInfo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TagInfo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTagInfoAccess().getGroup()); 

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
    // $ANTLR end "ruleTagInfo"


    // $ANTLR start "entryRuleMetaProperty"
    // InternalMetaTemplating.g:353:1: entryRuleMetaProperty : ruleMetaProperty EOF ;
    public final void entryRuleMetaProperty() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:354:1: ( ruleMetaProperty EOF )
            // InternalMetaTemplating.g:355:1: ruleMetaProperty EOF
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
    // InternalMetaTemplating.g:362:1: ruleMetaProperty : ( ( rule__MetaProperty__Group__0 ) ) ;
    public final void ruleMetaProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:366:2: ( ( ( rule__MetaProperty__Group__0 ) ) )
            // InternalMetaTemplating.g:367:2: ( ( rule__MetaProperty__Group__0 ) )
            {
            // InternalMetaTemplating.g:367:2: ( ( rule__MetaProperty__Group__0 ) )
            // InternalMetaTemplating.g:368:3: ( rule__MetaProperty__Group__0 )
            {
             before(grammarAccess.getMetaPropertyAccess().getGroup()); 
            // InternalMetaTemplating.g:369:3: ( rule__MetaProperty__Group__0 )
            // InternalMetaTemplating.g:369:4: rule__MetaProperty__Group__0
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
    // InternalMetaTemplating.g:378:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:379:1: ( ruleProperty EOF )
            // InternalMetaTemplating.g:380:1: ruleProperty EOF
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
    // InternalMetaTemplating.g:387:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:391:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalMetaTemplating.g:392:2: ( ( rule__Property__Group__0 ) )
            {
            // InternalMetaTemplating.g:392:2: ( ( rule__Property__Group__0 ) )
            // InternalMetaTemplating.g:393:3: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // InternalMetaTemplating.g:394:3: ( rule__Property__Group__0 )
            // InternalMetaTemplating.g:394:4: rule__Property__Group__0
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
    // InternalMetaTemplating.g:403:1: entryRuleSubProperty : ruleSubProperty EOF ;
    public final void entryRuleSubProperty() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:404:1: ( ruleSubProperty EOF )
            // InternalMetaTemplating.g:405:1: ruleSubProperty EOF
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
    // InternalMetaTemplating.g:412:1: ruleSubProperty : ( ( rule__SubProperty__Alternatives ) ) ;
    public final void ruleSubProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:416:2: ( ( ( rule__SubProperty__Alternatives ) ) )
            // InternalMetaTemplating.g:417:2: ( ( rule__SubProperty__Alternatives ) )
            {
            // InternalMetaTemplating.g:417:2: ( ( rule__SubProperty__Alternatives ) )
            // InternalMetaTemplating.g:418:3: ( rule__SubProperty__Alternatives )
            {
             before(grammarAccess.getSubPropertyAccess().getAlternatives()); 
            // InternalMetaTemplating.g:419:3: ( rule__SubProperty__Alternatives )
            // InternalMetaTemplating.g:419:4: rule__SubProperty__Alternatives
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
    // InternalMetaTemplating.g:428:1: entryRuleEscapedString : ruleEscapedString EOF ;
    public final void entryRuleEscapedString() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:429:1: ( ruleEscapedString EOF )
            // InternalMetaTemplating.g:430:1: ruleEscapedString EOF
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
    // InternalMetaTemplating.g:437:1: ruleEscapedString : ( ( rule__EscapedString__Group__0 ) ) ;
    public final void ruleEscapedString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:441:2: ( ( ( rule__EscapedString__Group__0 ) ) )
            // InternalMetaTemplating.g:442:2: ( ( rule__EscapedString__Group__0 ) )
            {
            // InternalMetaTemplating.g:442:2: ( ( rule__EscapedString__Group__0 ) )
            // InternalMetaTemplating.g:443:3: ( rule__EscapedString__Group__0 )
            {
             before(grammarAccess.getEscapedStringAccess().getGroup()); 
            // InternalMetaTemplating.g:444:3: ( rule__EscapedString__Group__0 )
            // InternalMetaTemplating.g:444:4: rule__EscapedString__Group__0
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
    // InternalMetaTemplating.g:453:1: entryRuleEscaped : ruleEscaped EOF ;
    public final void entryRuleEscaped() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:454:1: ( ruleEscaped EOF )
            // InternalMetaTemplating.g:455:1: ruleEscaped EOF
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
    // InternalMetaTemplating.g:462:1: ruleEscaped : ( ( rule__Escaped__Group__0 ) ) ;
    public final void ruleEscaped() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:466:2: ( ( ( rule__Escaped__Group__0 ) ) )
            // InternalMetaTemplating.g:467:2: ( ( rule__Escaped__Group__0 ) )
            {
            // InternalMetaTemplating.g:467:2: ( ( rule__Escaped__Group__0 ) )
            // InternalMetaTemplating.g:468:3: ( rule__Escaped__Group__0 )
            {
             before(grammarAccess.getEscapedAccess().getGroup()); 
            // InternalMetaTemplating.g:469:3: ( rule__Escaped__Group__0 )
            // InternalMetaTemplating.g:469:4: rule__Escaped__Group__0
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
    // InternalMetaTemplating.g:477:1: rule__Comment__Alternatives : ( ( ( rule__Comment__Group_0__0 ) ) | ( ( rule__Comment__Group_1__0 ) ) );
    public final void rule__Comment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:481:1: ( ( ( rule__Comment__Group_0__0 ) ) | ( ( rule__Comment__Group_1__0 ) ) )
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
                    // InternalMetaTemplating.g:482:2: ( ( rule__Comment__Group_0__0 ) )
                    {
                    // InternalMetaTemplating.g:482:2: ( ( rule__Comment__Group_0__0 ) )
                    // InternalMetaTemplating.g:483:3: ( rule__Comment__Group_0__0 )
                    {
                     before(grammarAccess.getCommentAccess().getGroup_0()); 
                    // InternalMetaTemplating.g:484:3: ( rule__Comment__Group_0__0 )
                    // InternalMetaTemplating.g:484:4: rule__Comment__Group_0__0
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
                    // InternalMetaTemplating.g:488:2: ( ( rule__Comment__Group_1__0 ) )
                    {
                    // InternalMetaTemplating.g:488:2: ( ( rule__Comment__Group_1__0 ) )
                    // InternalMetaTemplating.g:489:3: ( rule__Comment__Group_1__0 )
                    {
                     before(grammarAccess.getCommentAccess().getGroup_1()); 
                    // InternalMetaTemplating.g:490:3: ( rule__Comment__Group_1__0 )
                    // InternalMetaTemplating.g:490:4: rule__Comment__Group_1__0
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
    // InternalMetaTemplating.g:498:1: rule__Instructions__Alternatives : ( ( ( rule__Instructions__StatementAssignment_0 ) ) | ( ( rule__Instructions__IteratorAssignment_1 ) ) | ( ( rule__Instructions__RuleAssignment_2 ) ) | ( ( rule__Instructions__CommentAssignment_3 ) ) );
    public final void rule__Instructions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:502:1: ( ( ( rule__Instructions__StatementAssignment_0 ) ) | ( ( rule__Instructions__IteratorAssignment_1 ) ) | ( ( rule__Instructions__RuleAssignment_2 ) ) | ( ( rule__Instructions__CommentAssignment_3 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 11:
            case 14:
            case 29:
            case 39:
                {
                alt2=1;
                }
                break;
            case 33:
                {
                alt2=2;
                }
                break;
            case 31:
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
                    // InternalMetaTemplating.g:503:2: ( ( rule__Instructions__StatementAssignment_0 ) )
                    {
                    // InternalMetaTemplating.g:503:2: ( ( rule__Instructions__StatementAssignment_0 ) )
                    // InternalMetaTemplating.g:504:3: ( rule__Instructions__StatementAssignment_0 )
                    {
                     before(grammarAccess.getInstructionsAccess().getStatementAssignment_0()); 
                    // InternalMetaTemplating.g:505:3: ( rule__Instructions__StatementAssignment_0 )
                    // InternalMetaTemplating.g:505:4: rule__Instructions__StatementAssignment_0
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
                    // InternalMetaTemplating.g:509:2: ( ( rule__Instructions__IteratorAssignment_1 ) )
                    {
                    // InternalMetaTemplating.g:509:2: ( ( rule__Instructions__IteratorAssignment_1 ) )
                    // InternalMetaTemplating.g:510:3: ( rule__Instructions__IteratorAssignment_1 )
                    {
                     before(grammarAccess.getInstructionsAccess().getIteratorAssignment_1()); 
                    // InternalMetaTemplating.g:511:3: ( rule__Instructions__IteratorAssignment_1 )
                    // InternalMetaTemplating.g:511:4: rule__Instructions__IteratorAssignment_1
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
                    // InternalMetaTemplating.g:515:2: ( ( rule__Instructions__RuleAssignment_2 ) )
                    {
                    // InternalMetaTemplating.g:515:2: ( ( rule__Instructions__RuleAssignment_2 ) )
                    // InternalMetaTemplating.g:516:3: ( rule__Instructions__RuleAssignment_2 )
                    {
                     before(grammarAccess.getInstructionsAccess().getRuleAssignment_2()); 
                    // InternalMetaTemplating.g:517:3: ( rule__Instructions__RuleAssignment_2 )
                    // InternalMetaTemplating.g:517:4: rule__Instructions__RuleAssignment_2
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
                    // InternalMetaTemplating.g:521:2: ( ( rule__Instructions__CommentAssignment_3 ) )
                    {
                    // InternalMetaTemplating.g:521:2: ( ( rule__Instructions__CommentAssignment_3 ) )
                    // InternalMetaTemplating.g:522:3: ( rule__Instructions__CommentAssignment_3 )
                    {
                     before(grammarAccess.getInstructionsAccess().getCommentAssignment_3()); 
                    // InternalMetaTemplating.g:523:3: ( rule__Instructions__CommentAssignment_3 )
                    // InternalMetaTemplating.g:523:4: rule__Instructions__CommentAssignment_3
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
    // InternalMetaTemplating.g:531:1: rule__Statement__Alternatives : ( ( ( rule__Statement__TextAssignment_0 ) ) | ( ( rule__Statement__CharAssignment_1 ) ) | ( ( rule__Statement__StringAssignment_2 ) ) | ( ( rule__Statement__PlaceholderAssignment_3 ) ) | ( ( rule__Statement__MetaPlaceholderAssignment_4 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:535:1: ( ( ( rule__Statement__TextAssignment_0 ) ) | ( ( rule__Statement__CharAssignment_1 ) ) | ( ( rule__Statement__StringAssignment_2 ) ) | ( ( rule__Statement__PlaceholderAssignment_3 ) ) | ( ( rule__Statement__MetaPlaceholderAssignment_4 ) ) )
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
            case 29:
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
                    // InternalMetaTemplating.g:536:2: ( ( rule__Statement__TextAssignment_0 ) )
                    {
                    // InternalMetaTemplating.g:536:2: ( ( rule__Statement__TextAssignment_0 ) )
                    // InternalMetaTemplating.g:537:3: ( rule__Statement__TextAssignment_0 )
                    {
                     before(grammarAccess.getStatementAccess().getTextAssignment_0()); 
                    // InternalMetaTemplating.g:538:3: ( rule__Statement__TextAssignment_0 )
                    // InternalMetaTemplating.g:538:4: rule__Statement__TextAssignment_0
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
                    // InternalMetaTemplating.g:542:2: ( ( rule__Statement__CharAssignment_1 ) )
                    {
                    // InternalMetaTemplating.g:542:2: ( ( rule__Statement__CharAssignment_1 ) )
                    // InternalMetaTemplating.g:543:3: ( rule__Statement__CharAssignment_1 )
                    {
                     before(grammarAccess.getStatementAccess().getCharAssignment_1()); 
                    // InternalMetaTemplating.g:544:3: ( rule__Statement__CharAssignment_1 )
                    // InternalMetaTemplating.g:544:4: rule__Statement__CharAssignment_1
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
                    // InternalMetaTemplating.g:548:2: ( ( rule__Statement__StringAssignment_2 ) )
                    {
                    // InternalMetaTemplating.g:548:2: ( ( rule__Statement__StringAssignment_2 ) )
                    // InternalMetaTemplating.g:549:3: ( rule__Statement__StringAssignment_2 )
                    {
                     before(grammarAccess.getStatementAccess().getStringAssignment_2()); 
                    // InternalMetaTemplating.g:550:3: ( rule__Statement__StringAssignment_2 )
                    // InternalMetaTemplating.g:550:4: rule__Statement__StringAssignment_2
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
                    // InternalMetaTemplating.g:554:2: ( ( rule__Statement__PlaceholderAssignment_3 ) )
                    {
                    // InternalMetaTemplating.g:554:2: ( ( rule__Statement__PlaceholderAssignment_3 ) )
                    // InternalMetaTemplating.g:555:3: ( rule__Statement__PlaceholderAssignment_3 )
                    {
                     before(grammarAccess.getStatementAccess().getPlaceholderAssignment_3()); 
                    // InternalMetaTemplating.g:556:3: ( rule__Statement__PlaceholderAssignment_3 )
                    // InternalMetaTemplating.g:556:4: rule__Statement__PlaceholderAssignment_3
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
                    // InternalMetaTemplating.g:560:2: ( ( rule__Statement__MetaPlaceholderAssignment_4 ) )
                    {
                    // InternalMetaTemplating.g:560:2: ( ( rule__Statement__MetaPlaceholderAssignment_4 ) )
                    // InternalMetaTemplating.g:561:3: ( rule__Statement__MetaPlaceholderAssignment_4 )
                    {
                     before(grammarAccess.getStatementAccess().getMetaPlaceholderAssignment_4()); 
                    // InternalMetaTemplating.g:562:3: ( rule__Statement__MetaPlaceholderAssignment_4 )
                    // InternalMetaTemplating.g:562:4: rule__Statement__MetaPlaceholderAssignment_4
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


    // $ANTLR start "rule__Ph__Alternatives"
    // InternalMetaTemplating.g:570:1: rule__Ph__Alternatives : ( ( ( rule__Ph__Group_0__0 ) ) | ( ( rule__Ph__Group_1__0 ) ) );
    public final void rule__Ph__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:574:1: ( ( ( rule__Ph__Group_0__0 ) ) | ( ( rule__Ph__Group_1__0 ) ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalMetaTemplating.g:575:2: ( ( rule__Ph__Group_0__0 ) )
                    {
                    // InternalMetaTemplating.g:575:2: ( ( rule__Ph__Group_0__0 ) )
                    // InternalMetaTemplating.g:576:3: ( rule__Ph__Group_0__0 )
                    {
                     before(grammarAccess.getPhAccess().getGroup_0()); 
                    // InternalMetaTemplating.g:577:3: ( rule__Ph__Group_0__0 )
                    // InternalMetaTemplating.g:577:4: rule__Ph__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ph__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPhAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:581:2: ( ( rule__Ph__Group_1__0 ) )
                    {
                    // InternalMetaTemplating.g:581:2: ( ( rule__Ph__Group_1__0 ) )
                    // InternalMetaTemplating.g:582:3: ( rule__Ph__Group_1__0 )
                    {
                     before(grammarAccess.getPhAccess().getGroup_1()); 
                    // InternalMetaTemplating.g:583:3: ( rule__Ph__Group_1__0 )
                    // InternalMetaTemplating.g:583:4: rule__Ph__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ph__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPhAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Ph__Alternatives"


    // $ANTLR start "rule__MetaPh__Alternatives"
    // InternalMetaTemplating.g:591:1: rule__MetaPh__Alternatives : ( ( ( rule__MetaPh__Group_0__0 ) ) | ( ( rule__MetaPh__Group_1__0 ) ) );
    public final void rule__MetaPh__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:595:1: ( ( ( rule__MetaPh__Group_0__0 ) ) | ( ( rule__MetaPh__Group_1__0 ) ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalMetaTemplating.g:596:2: ( ( rule__MetaPh__Group_0__0 ) )
                    {
                    // InternalMetaTemplating.g:596:2: ( ( rule__MetaPh__Group_0__0 ) )
                    // InternalMetaTemplating.g:597:3: ( rule__MetaPh__Group_0__0 )
                    {
                     before(grammarAccess.getMetaPhAccess().getGroup_0()); 
                    // InternalMetaTemplating.g:598:3: ( rule__MetaPh__Group_0__0 )
                    // InternalMetaTemplating.g:598:4: rule__MetaPh__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MetaPh__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMetaPhAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:602:2: ( ( rule__MetaPh__Group_1__0 ) )
                    {
                    // InternalMetaTemplating.g:602:2: ( ( rule__MetaPh__Group_1__0 ) )
                    // InternalMetaTemplating.g:603:3: ( rule__MetaPh__Group_1__0 )
                    {
                     before(grammarAccess.getMetaPhAccess().getGroup_1()); 
                    // InternalMetaTemplating.g:604:3: ( rule__MetaPh__Group_1__0 )
                    // InternalMetaTemplating.g:604:4: rule__MetaPh__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MetaPh__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMetaPhAccess().getGroup_1()); 

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
    // $ANTLR end "rule__MetaPh__Alternatives"


    // $ANTLR start "rule__SubProperty__Alternatives"
    // InternalMetaTemplating.g:612:1: rule__SubProperty__Alternatives : ( ( ( rule__SubProperty__Group_0__0 ) ) | ( ( rule__SubProperty__Group_1__0 ) ) );
    public final void rule__SubProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:616:1: ( ( ( rule__SubProperty__Group_0__0 ) ) | ( ( rule__SubProperty__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==37) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_ID) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==38) ) {
                        alt6=2;
                    }
                    else if ( (LA6_2==EOF||LA6_2==13||LA6_2==15||LA6_2==19||LA6_2==30||LA6_2==32||(LA6_2>=35 && LA6_2<=37)) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMetaTemplating.g:617:2: ( ( rule__SubProperty__Group_0__0 ) )
                    {
                    // InternalMetaTemplating.g:617:2: ( ( rule__SubProperty__Group_0__0 ) )
                    // InternalMetaTemplating.g:618:3: ( rule__SubProperty__Group_0__0 )
                    {
                     before(grammarAccess.getSubPropertyAccess().getGroup_0()); 
                    // InternalMetaTemplating.g:619:3: ( rule__SubProperty__Group_0__0 )
                    // InternalMetaTemplating.g:619:4: rule__SubProperty__Group_0__0
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
                    // InternalMetaTemplating.g:623:2: ( ( rule__SubProperty__Group_1__0 ) )
                    {
                    // InternalMetaTemplating.g:623:2: ( ( rule__SubProperty__Group_1__0 ) )
                    // InternalMetaTemplating.g:624:3: ( rule__SubProperty__Group_1__0 )
                    {
                     before(grammarAccess.getSubPropertyAccess().getGroup_1()); 
                    // InternalMetaTemplating.g:625:3: ( rule__SubProperty__Group_1__0 )
                    // InternalMetaTemplating.g:625:4: rule__SubProperty__Group_1__0
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
    // InternalMetaTemplating.g:633:1: rule__Escaped__CharAlternatives_1_0 : ( ( '#' ) | ( '{' ) | ( '}' ) | ( '[' ) | ( ']' ) | ( ',' ) | ( ';' ) | ( '(' ) | ( ')' ) | ( ':' ) | ( '<' ) | ( '>' ) | ( '\\'' ) );
    public final void rule__Escaped__CharAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:637:1: ( ( '#' ) | ( '{' ) | ( '}' ) | ( '[' ) | ( ']' ) | ( ',' ) | ( ';' ) | ( '(' ) | ( ')' ) | ( ':' ) | ( '<' ) | ( '>' ) | ( '\\'' ) )
            int alt7=13;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt7=1;
                }
                break;
            case 12:
                {
                alt7=2;
                }
                break;
            case 13:
                {
                alt7=3;
                }
                break;
            case 14:
                {
                alt7=4;
                }
                break;
            case 15:
                {
                alt7=5;
                }
                break;
            case 16:
                {
                alt7=6;
                }
                break;
            case 17:
                {
                alt7=7;
                }
                break;
            case 18:
                {
                alt7=8;
                }
                break;
            case 19:
                {
                alt7=9;
                }
                break;
            case 20:
                {
                alt7=10;
                }
                break;
            case 21:
                {
                alt7=11;
                }
                break;
            case 22:
                {
                alt7=12;
                }
                break;
            case 23:
                {
                alt7=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMetaTemplating.g:638:2: ( '#' )
                    {
                    // InternalMetaTemplating.g:638:2: ( '#' )
                    // InternalMetaTemplating.g:639:3: '#'
                    {
                     before(grammarAccess.getEscapedAccess().getCharNumberSignKeyword_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharNumberSignKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:644:2: ( '{' )
                    {
                    // InternalMetaTemplating.g:644:2: ( '{' )
                    // InternalMetaTemplating.g:645:3: '{'
                    {
                     before(grammarAccess.getEscapedAccess().getCharLeftCurlyBracketKeyword_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharLeftCurlyBracketKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMetaTemplating.g:650:2: ( '}' )
                    {
                    // InternalMetaTemplating.g:650:2: ( '}' )
                    // InternalMetaTemplating.g:651:3: '}'
                    {
                     before(grammarAccess.getEscapedAccess().getCharRightCurlyBracketKeyword_1_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharRightCurlyBracketKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMetaTemplating.g:656:2: ( '[' )
                    {
                    // InternalMetaTemplating.g:656:2: ( '[' )
                    // InternalMetaTemplating.g:657:3: '['
                    {
                     before(grammarAccess.getEscapedAccess().getCharLeftSquareBracketKeyword_1_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharLeftSquareBracketKeyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMetaTemplating.g:662:2: ( ']' )
                    {
                    // InternalMetaTemplating.g:662:2: ( ']' )
                    // InternalMetaTemplating.g:663:3: ']'
                    {
                     before(grammarAccess.getEscapedAccess().getCharRightSquareBracketKeyword_1_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharRightSquareBracketKeyword_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMetaTemplating.g:668:2: ( ',' )
                    {
                    // InternalMetaTemplating.g:668:2: ( ',' )
                    // InternalMetaTemplating.g:669:3: ','
                    {
                     before(grammarAccess.getEscapedAccess().getCharCommaKeyword_1_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharCommaKeyword_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMetaTemplating.g:674:2: ( ';' )
                    {
                    // InternalMetaTemplating.g:674:2: ( ';' )
                    // InternalMetaTemplating.g:675:3: ';'
                    {
                     before(grammarAccess.getEscapedAccess().getCharSemicolonKeyword_1_0_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharSemicolonKeyword_1_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMetaTemplating.g:680:2: ( '(' )
                    {
                    // InternalMetaTemplating.g:680:2: ( '(' )
                    // InternalMetaTemplating.g:681:3: '('
                    {
                     before(grammarAccess.getEscapedAccess().getCharLeftParenthesisKeyword_1_0_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharLeftParenthesisKeyword_1_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMetaTemplating.g:686:2: ( ')' )
                    {
                    // InternalMetaTemplating.g:686:2: ( ')' )
                    // InternalMetaTemplating.g:687:3: ')'
                    {
                     before(grammarAccess.getEscapedAccess().getCharRightParenthesisKeyword_1_0_8()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharRightParenthesisKeyword_1_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMetaTemplating.g:692:2: ( ':' )
                    {
                    // InternalMetaTemplating.g:692:2: ( ':' )
                    // InternalMetaTemplating.g:693:3: ':'
                    {
                     before(grammarAccess.getEscapedAccess().getCharColonKeyword_1_0_9()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharColonKeyword_1_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMetaTemplating.g:698:2: ( '<' )
                    {
                    // InternalMetaTemplating.g:698:2: ( '<' )
                    // InternalMetaTemplating.g:699:3: '<'
                    {
                     before(grammarAccess.getEscapedAccess().getCharLessThanSignKeyword_1_0_10()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharLessThanSignKeyword_1_0_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMetaTemplating.g:704:2: ( '>' )
                    {
                    // InternalMetaTemplating.g:704:2: ( '>' )
                    // InternalMetaTemplating.g:705:3: '>'
                    {
                     before(grammarAccess.getEscapedAccess().getCharGreaterThanSignKeyword_1_0_11()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharGreaterThanSignKeyword_1_0_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMetaTemplating.g:710:2: ( '\\'' )
                    {
                    // InternalMetaTemplating.g:710:2: ( '\\'' )
                    // InternalMetaTemplating.g:711:3: '\\''
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
    // InternalMetaTemplating.g:720:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:724:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMetaTemplating.g:725:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalMetaTemplating.g:732:1: rule__Model__Group__0__Impl : ( ( rule__Model__HeaderAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:736:1: ( ( ( rule__Model__HeaderAssignment_0 ) ) )
            // InternalMetaTemplating.g:737:1: ( ( rule__Model__HeaderAssignment_0 ) )
            {
            // InternalMetaTemplating.g:737:1: ( ( rule__Model__HeaderAssignment_0 ) )
            // InternalMetaTemplating.g:738:2: ( rule__Model__HeaderAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getHeaderAssignment_0()); 
            // InternalMetaTemplating.g:739:2: ( rule__Model__HeaderAssignment_0 )
            // InternalMetaTemplating.g:739:3: rule__Model__HeaderAssignment_0
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
    // InternalMetaTemplating.g:747:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:751:1: ( rule__Model__Group__1__Impl )
            // InternalMetaTemplating.g:752:2: rule__Model__Group__1__Impl
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
    // InternalMetaTemplating.g:758:1: rule__Model__Group__1__Impl : ( ( rule__Model__ContentAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:762:1: ( ( ( rule__Model__ContentAssignment_1 )* ) )
            // InternalMetaTemplating.g:763:1: ( ( rule__Model__ContentAssignment_1 )* )
            {
            // InternalMetaTemplating.g:763:1: ( ( rule__Model__ContentAssignment_1 )* )
            // InternalMetaTemplating.g:764:2: ( rule__Model__ContentAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getContentAssignment_1()); 
            // InternalMetaTemplating.g:765:2: ( rule__Model__ContentAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==11||LA8_0==14||(LA8_0>=26 && LA8_0<=27)||LA8_0==29||LA8_0==31||LA8_0==33||LA8_0==39) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMetaTemplating.g:765:3: rule__Model__ContentAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ContentAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalMetaTemplating.g:774:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:778:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // InternalMetaTemplating.g:779:2: rule__Header__Group__0__Impl rule__Header__Group__1
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
    // InternalMetaTemplating.g:786:1: rule__Header__Group__0__Impl : ( () ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:790:1: ( ( () ) )
            // InternalMetaTemplating.g:791:1: ( () )
            {
            // InternalMetaTemplating.g:791:1: ( () )
            // InternalMetaTemplating.g:792:2: ()
            {
             before(grammarAccess.getHeaderAccess().getHeaderAction_0()); 
            // InternalMetaTemplating.g:793:2: ()
            // InternalMetaTemplating.g:793:3: 
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
    // InternalMetaTemplating.g:801:1: rule__Header__Group__1 : rule__Header__Group__1__Impl rule__Header__Group__2 ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:805:1: ( rule__Header__Group__1__Impl rule__Header__Group__2 )
            // InternalMetaTemplating.g:806:2: rule__Header__Group__1__Impl rule__Header__Group__2
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
    // InternalMetaTemplating.g:813:1: rule__Header__Group__1__Impl : ( ( rule__Header__LibsAssignment_1 )* ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:817:1: ( ( ( rule__Header__LibsAssignment_1 )* ) )
            // InternalMetaTemplating.g:818:1: ( ( rule__Header__LibsAssignment_1 )* )
            {
            // InternalMetaTemplating.g:818:1: ( ( rule__Header__LibsAssignment_1 )* )
            // InternalMetaTemplating.g:819:2: ( rule__Header__LibsAssignment_1 )*
            {
             before(grammarAccess.getHeaderAccess().getLibsAssignment_1()); 
            // InternalMetaTemplating.g:820:2: ( rule__Header__LibsAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMetaTemplating.g:820:3: rule__Header__LibsAssignment_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Header__LibsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalMetaTemplating.g:828:1: rule__Header__Group__2 : rule__Header__Group__2__Impl ;
    public final void rule__Header__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:832:1: ( rule__Header__Group__2__Impl )
            // InternalMetaTemplating.g:833:2: rule__Header__Group__2__Impl
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
    // InternalMetaTemplating.g:839:1: rule__Header__Group__2__Impl : ( ( rule__Header__ImportsAssignment_2 )* ) ;
    public final void rule__Header__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:843:1: ( ( ( rule__Header__ImportsAssignment_2 )* ) )
            // InternalMetaTemplating.g:844:1: ( ( rule__Header__ImportsAssignment_2 )* )
            {
            // InternalMetaTemplating.g:844:1: ( ( rule__Header__ImportsAssignment_2 )* )
            // InternalMetaTemplating.g:845:2: ( rule__Header__ImportsAssignment_2 )*
            {
             before(grammarAccess.getHeaderAccess().getImportsAssignment_2()); 
            // InternalMetaTemplating.g:846:2: ( rule__Header__ImportsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMetaTemplating.g:846:3: rule__Header__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Header__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalMetaTemplating.g:855:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:859:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMetaTemplating.g:860:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalMetaTemplating.g:867:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:871:1: ( ( 'import' ) )
            // InternalMetaTemplating.g:872:1: ( 'import' )
            {
            // InternalMetaTemplating.g:872:1: ( 'import' )
            // InternalMetaTemplating.g:873:2: 'import'
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
    // InternalMetaTemplating.g:882:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:886:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalMetaTemplating.g:887:2: rule__Import__Group__1__Impl rule__Import__Group__2
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
    // InternalMetaTemplating.g:894:1: rule__Import__Group__1__Impl : ( ( rule__Import__PathAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:898:1: ( ( ( rule__Import__PathAssignment_1 ) ) )
            // InternalMetaTemplating.g:899:1: ( ( rule__Import__PathAssignment_1 ) )
            {
            // InternalMetaTemplating.g:899:1: ( ( rule__Import__PathAssignment_1 ) )
            // InternalMetaTemplating.g:900:2: ( rule__Import__PathAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getPathAssignment_1()); 
            // InternalMetaTemplating.g:901:2: ( rule__Import__PathAssignment_1 )
            // InternalMetaTemplating.g:901:3: rule__Import__PathAssignment_1
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
    // InternalMetaTemplating.g:909:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:913:1: ( rule__Import__Group__2__Impl )
            // InternalMetaTemplating.g:914:2: rule__Import__Group__2__Impl
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
    // InternalMetaTemplating.g:920:1: rule__Import__Group__2__Impl : ( ';' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:924:1: ( ( ';' ) )
            // InternalMetaTemplating.g:925:1: ( ';' )
            {
            // InternalMetaTemplating.g:925:1: ( ';' )
            // InternalMetaTemplating.g:926:2: ';'
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
    // InternalMetaTemplating.g:936:1: rule__Libraries__Group__0 : rule__Libraries__Group__0__Impl rule__Libraries__Group__1 ;
    public final void rule__Libraries__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:940:1: ( rule__Libraries__Group__0__Impl rule__Libraries__Group__1 )
            // InternalMetaTemplating.g:941:2: rule__Libraries__Group__0__Impl rule__Libraries__Group__1
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
    // InternalMetaTemplating.g:948:1: rule__Libraries__Group__0__Impl : ( 'IMPORT' ) ;
    public final void rule__Libraries__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:952:1: ( ( 'IMPORT' ) )
            // InternalMetaTemplating.g:953:1: ( 'IMPORT' )
            {
            // InternalMetaTemplating.g:953:1: ( 'IMPORT' )
            // InternalMetaTemplating.g:954:2: 'IMPORT'
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
    // InternalMetaTemplating.g:963:1: rule__Libraries__Group__1 : rule__Libraries__Group__1__Impl rule__Libraries__Group__2 ;
    public final void rule__Libraries__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:967:1: ( rule__Libraries__Group__1__Impl rule__Libraries__Group__2 )
            // InternalMetaTemplating.g:968:2: rule__Libraries__Group__1__Impl rule__Libraries__Group__2
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
    // InternalMetaTemplating.g:975:1: rule__Libraries__Group__1__Impl : ( ( rule__Libraries__PathAssignment_1 ) ) ;
    public final void rule__Libraries__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:979:1: ( ( ( rule__Libraries__PathAssignment_1 ) ) )
            // InternalMetaTemplating.g:980:1: ( ( rule__Libraries__PathAssignment_1 ) )
            {
            // InternalMetaTemplating.g:980:1: ( ( rule__Libraries__PathAssignment_1 ) )
            // InternalMetaTemplating.g:981:2: ( rule__Libraries__PathAssignment_1 )
            {
             before(grammarAccess.getLibrariesAccess().getPathAssignment_1()); 
            // InternalMetaTemplating.g:982:2: ( rule__Libraries__PathAssignment_1 )
            // InternalMetaTemplating.g:982:3: rule__Libraries__PathAssignment_1
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
    // InternalMetaTemplating.g:990:1: rule__Libraries__Group__2 : rule__Libraries__Group__2__Impl ;
    public final void rule__Libraries__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:994:1: ( rule__Libraries__Group__2__Impl )
            // InternalMetaTemplating.g:995:2: rule__Libraries__Group__2__Impl
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
    // InternalMetaTemplating.g:1001:1: rule__Libraries__Group__2__Impl : ( ';' ) ;
    public final void rule__Libraries__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1005:1: ( ( ';' ) )
            // InternalMetaTemplating.g:1006:1: ( ';' )
            {
            // InternalMetaTemplating.g:1006:1: ( ';' )
            // InternalMetaTemplating.g:1007:2: ';'
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
    // InternalMetaTemplating.g:1017:1: rule__Comment__Group_0__0 : rule__Comment__Group_0__0__Impl rule__Comment__Group_0__1 ;
    public final void rule__Comment__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1021:1: ( rule__Comment__Group_0__0__Impl rule__Comment__Group_0__1 )
            // InternalMetaTemplating.g:1022:2: rule__Comment__Group_0__0__Impl rule__Comment__Group_0__1
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
    // InternalMetaTemplating.g:1029:1: rule__Comment__Group_0__0__Impl : ( '//' ) ;
    public final void rule__Comment__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1033:1: ( ( '//' ) )
            // InternalMetaTemplating.g:1034:1: ( '//' )
            {
            // InternalMetaTemplating.g:1034:1: ( '//' )
            // InternalMetaTemplating.g:1035:2: '//'
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
    // InternalMetaTemplating.g:1044:1: rule__Comment__Group_0__1 : rule__Comment__Group_0__1__Impl ;
    public final void rule__Comment__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1048:1: ( rule__Comment__Group_0__1__Impl )
            // InternalMetaTemplating.g:1049:2: rule__Comment__Group_0__1__Impl
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
    // InternalMetaTemplating.g:1055:1: rule__Comment__Group_0__1__Impl : ( ( rule__Comment__WordAssignment_0_1 ) ) ;
    public final void rule__Comment__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1059:1: ( ( ( rule__Comment__WordAssignment_0_1 ) ) )
            // InternalMetaTemplating.g:1060:1: ( ( rule__Comment__WordAssignment_0_1 ) )
            {
            // InternalMetaTemplating.g:1060:1: ( ( rule__Comment__WordAssignment_0_1 ) )
            // InternalMetaTemplating.g:1061:2: ( rule__Comment__WordAssignment_0_1 )
            {
             before(grammarAccess.getCommentAccess().getWordAssignment_0_1()); 
            // InternalMetaTemplating.g:1062:2: ( rule__Comment__WordAssignment_0_1 )
            // InternalMetaTemplating.g:1062:3: rule__Comment__WordAssignment_0_1
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
    // InternalMetaTemplating.g:1071:1: rule__Comment__Group_1__0 : rule__Comment__Group_1__0__Impl rule__Comment__Group_1__1 ;
    public final void rule__Comment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1075:1: ( rule__Comment__Group_1__0__Impl rule__Comment__Group_1__1 )
            // InternalMetaTemplating.g:1076:2: rule__Comment__Group_1__0__Impl rule__Comment__Group_1__1
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
    // InternalMetaTemplating.g:1083:1: rule__Comment__Group_1__0__Impl : ( '/*' ) ;
    public final void rule__Comment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1087:1: ( ( '/*' ) )
            // InternalMetaTemplating.g:1088:1: ( '/*' )
            {
            // InternalMetaTemplating.g:1088:1: ( '/*' )
            // InternalMetaTemplating.g:1089:2: '/*'
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
    // InternalMetaTemplating.g:1098:1: rule__Comment__Group_1__1 : rule__Comment__Group_1__1__Impl rule__Comment__Group_1__2 ;
    public final void rule__Comment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1102:1: ( rule__Comment__Group_1__1__Impl rule__Comment__Group_1__2 )
            // InternalMetaTemplating.g:1103:2: rule__Comment__Group_1__1__Impl rule__Comment__Group_1__2
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
    // InternalMetaTemplating.g:1110:1: rule__Comment__Group_1__1__Impl : ( ( rule__Comment__WordAssignment_1_1 ) ) ;
    public final void rule__Comment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1114:1: ( ( ( rule__Comment__WordAssignment_1_1 ) ) )
            // InternalMetaTemplating.g:1115:1: ( ( rule__Comment__WordAssignment_1_1 ) )
            {
            // InternalMetaTemplating.g:1115:1: ( ( rule__Comment__WordAssignment_1_1 ) )
            // InternalMetaTemplating.g:1116:2: ( rule__Comment__WordAssignment_1_1 )
            {
             before(grammarAccess.getCommentAccess().getWordAssignment_1_1()); 
            // InternalMetaTemplating.g:1117:2: ( rule__Comment__WordAssignment_1_1 )
            // InternalMetaTemplating.g:1117:3: rule__Comment__WordAssignment_1_1
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
    // InternalMetaTemplating.g:1125:1: rule__Comment__Group_1__2 : rule__Comment__Group_1__2__Impl ;
    public final void rule__Comment__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1129:1: ( rule__Comment__Group_1__2__Impl )
            // InternalMetaTemplating.g:1130:2: rule__Comment__Group_1__2__Impl
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
    // InternalMetaTemplating.g:1136:1: rule__Comment__Group_1__2__Impl : ( '*/' ) ;
    public final void rule__Comment__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1140:1: ( ( '*/' ) )
            // InternalMetaTemplating.g:1141:1: ( '*/' )
            {
            // InternalMetaTemplating.g:1141:1: ( '*/' )
            // InternalMetaTemplating.g:1142:2: '*/'
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


    // $ANTLR start "rule__Ph__Group_0__0"
    // InternalMetaTemplating.g:1152:1: rule__Ph__Group_0__0 : rule__Ph__Group_0__0__Impl rule__Ph__Group_0__1 ;
    public final void rule__Ph__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1156:1: ( rule__Ph__Group_0__0__Impl rule__Ph__Group_0__1 )
            // InternalMetaTemplating.g:1157:2: rule__Ph__Group_0__0__Impl rule__Ph__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__Ph__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ph__Group_0__1();

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
    // $ANTLR end "rule__Ph__Group_0__0"


    // $ANTLR start "rule__Ph__Group_0__0__Impl"
    // InternalMetaTemplating.g:1164:1: rule__Ph__Group_0__0__Impl : ( '[[' ) ;
    public final void rule__Ph__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1168:1: ( ( '[[' ) )
            // InternalMetaTemplating.g:1169:1: ( '[[' )
            {
            // InternalMetaTemplating.g:1169:1: ( '[[' )
            // InternalMetaTemplating.g:1170:2: '[['
            {
             before(grammarAccess.getPhAccess().getLeftSquareBracketLeftSquareBracketKeyword_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPhAccess().getLeftSquareBracketLeftSquareBracketKeyword_0_0()); 

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
    // $ANTLR end "rule__Ph__Group_0__0__Impl"


    // $ANTLR start "rule__Ph__Group_0__1"
    // InternalMetaTemplating.g:1179:1: rule__Ph__Group_0__1 : rule__Ph__Group_0__1__Impl rule__Ph__Group_0__2 ;
    public final void rule__Ph__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1183:1: ( rule__Ph__Group_0__1__Impl rule__Ph__Group_0__2 )
            // InternalMetaTemplating.g:1184:2: rule__Ph__Group_0__1__Impl rule__Ph__Group_0__2
            {
            pushFollow(FOLLOW_12);
            rule__Ph__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ph__Group_0__2();

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
    // $ANTLR end "rule__Ph__Group_0__1"


    // $ANTLR start "rule__Ph__Group_0__1__Impl"
    // InternalMetaTemplating.g:1191:1: rule__Ph__Group_0__1__Impl : ( ( rule__Ph__PropertyAssignment_0_1 ) ) ;
    public final void rule__Ph__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1195:1: ( ( ( rule__Ph__PropertyAssignment_0_1 ) ) )
            // InternalMetaTemplating.g:1196:1: ( ( rule__Ph__PropertyAssignment_0_1 ) )
            {
            // InternalMetaTemplating.g:1196:1: ( ( rule__Ph__PropertyAssignment_0_1 ) )
            // InternalMetaTemplating.g:1197:2: ( rule__Ph__PropertyAssignment_0_1 )
            {
             before(grammarAccess.getPhAccess().getPropertyAssignment_0_1()); 
            // InternalMetaTemplating.g:1198:2: ( rule__Ph__PropertyAssignment_0_1 )
            // InternalMetaTemplating.g:1198:3: rule__Ph__PropertyAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Ph__PropertyAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPhAccess().getPropertyAssignment_0_1()); 

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
    // $ANTLR end "rule__Ph__Group_0__1__Impl"


    // $ANTLR start "rule__Ph__Group_0__2"
    // InternalMetaTemplating.g:1206:1: rule__Ph__Group_0__2 : rule__Ph__Group_0__2__Impl ;
    public final void rule__Ph__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1210:1: ( rule__Ph__Group_0__2__Impl )
            // InternalMetaTemplating.g:1211:2: rule__Ph__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ph__Group_0__2__Impl();

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
    // $ANTLR end "rule__Ph__Group_0__2"


    // $ANTLR start "rule__Ph__Group_0__2__Impl"
    // InternalMetaTemplating.g:1217:1: rule__Ph__Group_0__2__Impl : ( ']]' ) ;
    public final void rule__Ph__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1221:1: ( ( ']]' ) )
            // InternalMetaTemplating.g:1222:1: ( ']]' )
            {
            // InternalMetaTemplating.g:1222:1: ( ']]' )
            // InternalMetaTemplating.g:1223:2: ']]'
            {
             before(grammarAccess.getPhAccess().getRightSquareBracketRightSquareBracketKeyword_0_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPhAccess().getRightSquareBracketRightSquareBracketKeyword_0_2()); 

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
    // $ANTLR end "rule__Ph__Group_0__2__Impl"


    // $ANTLR start "rule__Ph__Group_1__0"
    // InternalMetaTemplating.g:1233:1: rule__Ph__Group_1__0 : rule__Ph__Group_1__0__Impl rule__Ph__Group_1__1 ;
    public final void rule__Ph__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1237:1: ( rule__Ph__Group_1__0__Impl rule__Ph__Group_1__1 )
            // InternalMetaTemplating.g:1238:2: rule__Ph__Group_1__0__Impl rule__Ph__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Ph__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ph__Group_1__1();

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
    // $ANTLR end "rule__Ph__Group_1__0"


    // $ANTLR start "rule__Ph__Group_1__0__Impl"
    // InternalMetaTemplating.g:1245:1: rule__Ph__Group_1__0__Impl : ( '[[' ) ;
    public final void rule__Ph__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1249:1: ( ( '[[' ) )
            // InternalMetaTemplating.g:1250:1: ( '[[' )
            {
            // InternalMetaTemplating.g:1250:1: ( '[[' )
            // InternalMetaTemplating.g:1251:2: '[['
            {
             before(grammarAccess.getPhAccess().getLeftSquareBracketLeftSquareBracketKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPhAccess().getLeftSquareBracketLeftSquareBracketKeyword_1_0()); 

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
    // $ANTLR end "rule__Ph__Group_1__0__Impl"


    // $ANTLR start "rule__Ph__Group_1__1"
    // InternalMetaTemplating.g:1260:1: rule__Ph__Group_1__1 : rule__Ph__Group_1__1__Impl rule__Ph__Group_1__2 ;
    public final void rule__Ph__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1264:1: ( rule__Ph__Group_1__1__Impl rule__Ph__Group_1__2 )
            // InternalMetaTemplating.g:1265:2: rule__Ph__Group_1__1__Impl rule__Ph__Group_1__2
            {
            pushFollow(FOLLOW_13);
            rule__Ph__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ph__Group_1__2();

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
    // $ANTLR end "rule__Ph__Group_1__1"


    // $ANTLR start "rule__Ph__Group_1__1__Impl"
    // InternalMetaTemplating.g:1272:1: rule__Ph__Group_1__1__Impl : ( ( rule__Ph__PropertyAssignment_1_1 ) ) ;
    public final void rule__Ph__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1276:1: ( ( ( rule__Ph__PropertyAssignment_1_1 ) ) )
            // InternalMetaTemplating.g:1277:1: ( ( rule__Ph__PropertyAssignment_1_1 ) )
            {
            // InternalMetaTemplating.g:1277:1: ( ( rule__Ph__PropertyAssignment_1_1 ) )
            // InternalMetaTemplating.g:1278:2: ( rule__Ph__PropertyAssignment_1_1 )
            {
             before(grammarAccess.getPhAccess().getPropertyAssignment_1_1()); 
            // InternalMetaTemplating.g:1279:2: ( rule__Ph__PropertyAssignment_1_1 )
            // InternalMetaTemplating.g:1279:3: rule__Ph__PropertyAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Ph__PropertyAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPhAccess().getPropertyAssignment_1_1()); 

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
    // $ANTLR end "rule__Ph__Group_1__1__Impl"


    // $ANTLR start "rule__Ph__Group_1__2"
    // InternalMetaTemplating.g:1287:1: rule__Ph__Group_1__2 : rule__Ph__Group_1__2__Impl rule__Ph__Group_1__3 ;
    public final void rule__Ph__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1291:1: ( rule__Ph__Group_1__2__Impl rule__Ph__Group_1__3 )
            // InternalMetaTemplating.g:1292:2: rule__Ph__Group_1__2__Impl rule__Ph__Group_1__3
            {
            pushFollow(FOLLOW_12);
            rule__Ph__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ph__Group_1__3();

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
    // $ANTLR end "rule__Ph__Group_1__2"


    // $ANTLR start "rule__Ph__Group_1__2__Impl"
    // InternalMetaTemplating.g:1299:1: rule__Ph__Group_1__2__Impl : ( ( rule__Ph__MetaPropertyAssignment_1_2 ) ) ;
    public final void rule__Ph__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1303:1: ( ( ( rule__Ph__MetaPropertyAssignment_1_2 ) ) )
            // InternalMetaTemplating.g:1304:1: ( ( rule__Ph__MetaPropertyAssignment_1_2 ) )
            {
            // InternalMetaTemplating.g:1304:1: ( ( rule__Ph__MetaPropertyAssignment_1_2 ) )
            // InternalMetaTemplating.g:1305:2: ( rule__Ph__MetaPropertyAssignment_1_2 )
            {
             before(grammarAccess.getPhAccess().getMetaPropertyAssignment_1_2()); 
            // InternalMetaTemplating.g:1306:2: ( rule__Ph__MetaPropertyAssignment_1_2 )
            // InternalMetaTemplating.g:1306:3: rule__Ph__MetaPropertyAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Ph__MetaPropertyAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPhAccess().getMetaPropertyAssignment_1_2()); 

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
    // $ANTLR end "rule__Ph__Group_1__2__Impl"


    // $ANTLR start "rule__Ph__Group_1__3"
    // InternalMetaTemplating.g:1314:1: rule__Ph__Group_1__3 : rule__Ph__Group_1__3__Impl ;
    public final void rule__Ph__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1318:1: ( rule__Ph__Group_1__3__Impl )
            // InternalMetaTemplating.g:1319:2: rule__Ph__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ph__Group_1__3__Impl();

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
    // $ANTLR end "rule__Ph__Group_1__3"


    // $ANTLR start "rule__Ph__Group_1__3__Impl"
    // InternalMetaTemplating.g:1325:1: rule__Ph__Group_1__3__Impl : ( ']]' ) ;
    public final void rule__Ph__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1329:1: ( ( ']]' ) )
            // InternalMetaTemplating.g:1330:1: ( ']]' )
            {
            // InternalMetaTemplating.g:1330:1: ( ']]' )
            // InternalMetaTemplating.g:1331:2: ']]'
            {
             before(grammarAccess.getPhAccess().getRightSquareBracketRightSquareBracketKeyword_1_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPhAccess().getRightSquareBracketRightSquareBracketKeyword_1_3()); 

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
    // $ANTLR end "rule__Ph__Group_1__3__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalMetaTemplating.g:1341:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1345:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalMetaTemplating.g:1346:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMetaTemplating.g:1353:1: rule__Rule__Group__0__Impl : ( 'FORALL' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1357:1: ( ( 'FORALL' ) )
            // InternalMetaTemplating.g:1358:1: ( 'FORALL' )
            {
            // InternalMetaTemplating.g:1358:1: ( 'FORALL' )
            // InternalMetaTemplating.g:1359:2: 'FORALL'
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
    // InternalMetaTemplating.g:1368:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1372:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalMetaTemplating.g:1373:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalMetaTemplating.g:1380:1: rule__Rule__Group__1__Impl : ( '(' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1384:1: ( ( '(' ) )
            // InternalMetaTemplating.g:1385:1: ( '(' )
            {
            // InternalMetaTemplating.g:1385:1: ( '(' )
            // InternalMetaTemplating.g:1386:2: '('
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
    // InternalMetaTemplating.g:1395:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1399:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalMetaTemplating.g:1400:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMetaTemplating.g:1407:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__ElementAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1411:1: ( ( ( rule__Rule__ElementAssignment_2 ) ) )
            // InternalMetaTemplating.g:1412:1: ( ( rule__Rule__ElementAssignment_2 ) )
            {
            // InternalMetaTemplating.g:1412:1: ( ( rule__Rule__ElementAssignment_2 ) )
            // InternalMetaTemplating.g:1413:2: ( rule__Rule__ElementAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getElementAssignment_2()); 
            // InternalMetaTemplating.g:1414:2: ( rule__Rule__ElementAssignment_2 )
            // InternalMetaTemplating.g:1414:3: rule__Rule__ElementAssignment_2
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
    // InternalMetaTemplating.g:1422:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1426:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalMetaTemplating.g:1427:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
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
    // InternalMetaTemplating.g:1434:1: rule__Rule__Group__3__Impl : ( ':' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1438:1: ( ( ':' ) )
            // InternalMetaTemplating.g:1439:1: ( ':' )
            {
            // InternalMetaTemplating.g:1439:1: ( ':' )
            // InternalMetaTemplating.g:1440:2: ':'
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
    // InternalMetaTemplating.g:1449:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1453:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalMetaTemplating.g:1454:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalMetaTemplating.g:1461:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__PropertyAssignment_4 ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1465:1: ( ( ( rule__Rule__PropertyAssignment_4 ) ) )
            // InternalMetaTemplating.g:1466:1: ( ( rule__Rule__PropertyAssignment_4 ) )
            {
            // InternalMetaTemplating.g:1466:1: ( ( rule__Rule__PropertyAssignment_4 ) )
            // InternalMetaTemplating.g:1467:2: ( rule__Rule__PropertyAssignment_4 )
            {
             before(grammarAccess.getRuleAccess().getPropertyAssignment_4()); 
            // InternalMetaTemplating.g:1468:2: ( rule__Rule__PropertyAssignment_4 )
            // InternalMetaTemplating.g:1468:3: rule__Rule__PropertyAssignment_4
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
    // InternalMetaTemplating.g:1476:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1480:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalMetaTemplating.g:1481:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
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
    // InternalMetaTemplating.g:1488:1: rule__Rule__Group__5__Impl : ( 'TAGGED' ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1492:1: ( ( 'TAGGED' ) )
            // InternalMetaTemplating.g:1493:1: ( 'TAGGED' )
            {
            // InternalMetaTemplating.g:1493:1: ( 'TAGGED' )
            // InternalMetaTemplating.g:1494:2: 'TAGGED'
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
    // InternalMetaTemplating.g:1503:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1507:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // InternalMetaTemplating.g:1508:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalMetaTemplating.g:1515:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__TagAssignment_6 ) ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1519:1: ( ( ( rule__Rule__TagAssignment_6 ) ) )
            // InternalMetaTemplating.g:1520:1: ( ( rule__Rule__TagAssignment_6 ) )
            {
            // InternalMetaTemplating.g:1520:1: ( ( rule__Rule__TagAssignment_6 ) )
            // InternalMetaTemplating.g:1521:2: ( rule__Rule__TagAssignment_6 )
            {
             before(grammarAccess.getRuleAccess().getTagAssignment_6()); 
            // InternalMetaTemplating.g:1522:2: ( rule__Rule__TagAssignment_6 )
            // InternalMetaTemplating.g:1522:3: rule__Rule__TagAssignment_6
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
    // InternalMetaTemplating.g:1530:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl rule__Rule__Group__8 ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1534:1: ( rule__Rule__Group__7__Impl rule__Rule__Group__8 )
            // InternalMetaTemplating.g:1535:2: rule__Rule__Group__7__Impl rule__Rule__Group__8
            {
            pushFollow(FOLLOW_18);
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
    // InternalMetaTemplating.g:1542:1: rule__Rule__Group__7__Impl : ( ')' ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1546:1: ( ( ')' ) )
            // InternalMetaTemplating.g:1547:1: ( ')' )
            {
            // InternalMetaTemplating.g:1547:1: ( ')' )
            // InternalMetaTemplating.g:1548:2: ')'
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
    // InternalMetaTemplating.g:1557:1: rule__Rule__Group__8 : rule__Rule__Group__8__Impl rule__Rule__Group__9 ;
    public final void rule__Rule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1561:1: ( rule__Rule__Group__8__Impl rule__Rule__Group__9 )
            // InternalMetaTemplating.g:1562:2: rule__Rule__Group__8__Impl rule__Rule__Group__9
            {
            pushFollow(FOLLOW_19);
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
    // InternalMetaTemplating.g:1569:1: rule__Rule__Group__8__Impl : ( '{' ) ;
    public final void rule__Rule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1573:1: ( ( '{' ) )
            // InternalMetaTemplating.g:1574:1: ( '{' )
            {
            // InternalMetaTemplating.g:1574:1: ( '{' )
            // InternalMetaTemplating.g:1575:2: '{'
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
    // InternalMetaTemplating.g:1584:1: rule__Rule__Group__9 : rule__Rule__Group__9__Impl rule__Rule__Group__10 ;
    public final void rule__Rule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1588:1: ( rule__Rule__Group__9__Impl rule__Rule__Group__10 )
            // InternalMetaTemplating.g:1589:2: rule__Rule__Group__9__Impl rule__Rule__Group__10
            {
            pushFollow(FOLLOW_19);
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
    // InternalMetaTemplating.g:1596:1: rule__Rule__Group__9__Impl : ( ( rule__Rule__BodyAssignment_9 )* ) ;
    public final void rule__Rule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1600:1: ( ( ( rule__Rule__BodyAssignment_9 )* ) )
            // InternalMetaTemplating.g:1601:1: ( ( rule__Rule__BodyAssignment_9 )* )
            {
            // InternalMetaTemplating.g:1601:1: ( ( rule__Rule__BodyAssignment_9 )* )
            // InternalMetaTemplating.g:1602:2: ( rule__Rule__BodyAssignment_9 )*
            {
             before(grammarAccess.getRuleAccess().getBodyAssignment_9()); 
            // InternalMetaTemplating.g:1603:2: ( rule__Rule__BodyAssignment_9 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==11||LA11_0==14||(LA11_0>=26 && LA11_0<=27)||LA11_0==29||LA11_0==31||LA11_0==33||LA11_0==39) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMetaTemplating.g:1603:3: rule__Rule__BodyAssignment_9
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Rule__BodyAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalMetaTemplating.g:1611:1: rule__Rule__Group__10 : rule__Rule__Group__10__Impl ;
    public final void rule__Rule__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1615:1: ( rule__Rule__Group__10__Impl )
            // InternalMetaTemplating.g:1616:2: rule__Rule__Group__10__Impl
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
    // InternalMetaTemplating.g:1622:1: rule__Rule__Group__10__Impl : ( '}' ) ;
    public final void rule__Rule__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1626:1: ( ( '}' ) )
            // InternalMetaTemplating.g:1627:1: ( '}' )
            {
            // InternalMetaTemplating.g:1627:1: ( '}' )
            // InternalMetaTemplating.g:1628:2: '}'
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
    // InternalMetaTemplating.g:1638:1: rule__Iterator__Group__0 : rule__Iterator__Group__0__Impl rule__Iterator__Group__1 ;
    public final void rule__Iterator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1642:1: ( rule__Iterator__Group__0__Impl rule__Iterator__Group__1 )
            // InternalMetaTemplating.g:1643:2: rule__Iterator__Group__0__Impl rule__Iterator__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMetaTemplating.g:1650:1: rule__Iterator__Group__0__Impl : ( 'foreach' ) ;
    public final void rule__Iterator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1654:1: ( ( 'foreach' ) )
            // InternalMetaTemplating.g:1655:1: ( 'foreach' )
            {
            // InternalMetaTemplating.g:1655:1: ( 'foreach' )
            // InternalMetaTemplating.g:1656:2: 'foreach'
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
    // InternalMetaTemplating.g:1665:1: rule__Iterator__Group__1 : rule__Iterator__Group__1__Impl rule__Iterator__Group__2 ;
    public final void rule__Iterator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1669:1: ( rule__Iterator__Group__1__Impl rule__Iterator__Group__2 )
            // InternalMetaTemplating.g:1670:2: rule__Iterator__Group__1__Impl rule__Iterator__Group__2
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
    // InternalMetaTemplating.g:1677:1: rule__Iterator__Group__1__Impl : ( '(' ) ;
    public final void rule__Iterator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1681:1: ( ( '(' ) )
            // InternalMetaTemplating.g:1682:1: ( '(' )
            {
            // InternalMetaTemplating.g:1682:1: ( '(' )
            // InternalMetaTemplating.g:1683:2: '('
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
    // InternalMetaTemplating.g:1692:1: rule__Iterator__Group__2 : rule__Iterator__Group__2__Impl rule__Iterator__Group__3 ;
    public final void rule__Iterator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1696:1: ( rule__Iterator__Group__2__Impl rule__Iterator__Group__3 )
            // InternalMetaTemplating.g:1697:2: rule__Iterator__Group__2__Impl rule__Iterator__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalMetaTemplating.g:1704:1: rule__Iterator__Group__2__Impl : ( ( rule__Iterator__ElementAssignment_2 ) ) ;
    public final void rule__Iterator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1708:1: ( ( ( rule__Iterator__ElementAssignment_2 ) ) )
            // InternalMetaTemplating.g:1709:1: ( ( rule__Iterator__ElementAssignment_2 ) )
            {
            // InternalMetaTemplating.g:1709:1: ( ( rule__Iterator__ElementAssignment_2 ) )
            // InternalMetaTemplating.g:1710:2: ( rule__Iterator__ElementAssignment_2 )
            {
             before(grammarAccess.getIteratorAccess().getElementAssignment_2()); 
            // InternalMetaTemplating.g:1711:2: ( rule__Iterator__ElementAssignment_2 )
            // InternalMetaTemplating.g:1711:3: rule__Iterator__ElementAssignment_2
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
    // InternalMetaTemplating.g:1719:1: rule__Iterator__Group__3 : rule__Iterator__Group__3__Impl rule__Iterator__Group__4 ;
    public final void rule__Iterator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1723:1: ( rule__Iterator__Group__3__Impl rule__Iterator__Group__4 )
            // InternalMetaTemplating.g:1724:2: rule__Iterator__Group__3__Impl rule__Iterator__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalMetaTemplating.g:1731:1: rule__Iterator__Group__3__Impl : ( 'in' ) ;
    public final void rule__Iterator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1735:1: ( ( 'in' ) )
            // InternalMetaTemplating.g:1736:1: ( 'in' )
            {
            // InternalMetaTemplating.g:1736:1: ( 'in' )
            // InternalMetaTemplating.g:1737:2: 'in'
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
    // InternalMetaTemplating.g:1746:1: rule__Iterator__Group__4 : rule__Iterator__Group__4__Impl rule__Iterator__Group__5 ;
    public final void rule__Iterator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1750:1: ( rule__Iterator__Group__4__Impl rule__Iterator__Group__5 )
            // InternalMetaTemplating.g:1751:2: rule__Iterator__Group__4__Impl rule__Iterator__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalMetaTemplating.g:1758:1: rule__Iterator__Group__4__Impl : ( ( rule__Iterator__MetaElementAssignment_4 ) ) ;
    public final void rule__Iterator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1762:1: ( ( ( rule__Iterator__MetaElementAssignment_4 ) ) )
            // InternalMetaTemplating.g:1763:1: ( ( rule__Iterator__MetaElementAssignment_4 ) )
            {
            // InternalMetaTemplating.g:1763:1: ( ( rule__Iterator__MetaElementAssignment_4 ) )
            // InternalMetaTemplating.g:1764:2: ( rule__Iterator__MetaElementAssignment_4 )
            {
             before(grammarAccess.getIteratorAccess().getMetaElementAssignment_4()); 
            // InternalMetaTemplating.g:1765:2: ( rule__Iterator__MetaElementAssignment_4 )
            // InternalMetaTemplating.g:1765:3: rule__Iterator__MetaElementAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Iterator__MetaElementAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIteratorAccess().getMetaElementAssignment_4()); 

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
    // InternalMetaTemplating.g:1773:1: rule__Iterator__Group__5 : rule__Iterator__Group__5__Impl rule__Iterator__Group__6 ;
    public final void rule__Iterator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1777:1: ( rule__Iterator__Group__5__Impl rule__Iterator__Group__6 )
            // InternalMetaTemplating.g:1778:2: rule__Iterator__Group__5__Impl rule__Iterator__Group__6
            {
            pushFollow(FOLLOW_22);
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
    // InternalMetaTemplating.g:1785:1: rule__Iterator__Group__5__Impl : ( ( rule__Iterator__SubPropertiesAssignment_5 )* ) ;
    public final void rule__Iterator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1789:1: ( ( ( rule__Iterator__SubPropertiesAssignment_5 )* ) )
            // InternalMetaTemplating.g:1790:1: ( ( rule__Iterator__SubPropertiesAssignment_5 )* )
            {
            // InternalMetaTemplating.g:1790:1: ( ( rule__Iterator__SubPropertiesAssignment_5 )* )
            // InternalMetaTemplating.g:1791:2: ( rule__Iterator__SubPropertiesAssignment_5 )*
            {
             before(grammarAccess.getIteratorAccess().getSubPropertiesAssignment_5()); 
            // InternalMetaTemplating.g:1792:2: ( rule__Iterator__SubPropertiesAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==37) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMetaTemplating.g:1792:3: rule__Iterator__SubPropertiesAssignment_5
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Iterator__SubPropertiesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getIteratorAccess().getSubPropertiesAssignment_5()); 

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
    // InternalMetaTemplating.g:1800:1: rule__Iterator__Group__6 : rule__Iterator__Group__6__Impl rule__Iterator__Group__7 ;
    public final void rule__Iterator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1804:1: ( rule__Iterator__Group__6__Impl rule__Iterator__Group__7 )
            // InternalMetaTemplating.g:1805:2: rule__Iterator__Group__6__Impl rule__Iterator__Group__7
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
    // InternalMetaTemplating.g:1812:1: rule__Iterator__Group__6__Impl : ( ')' ) ;
    public final void rule__Iterator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1816:1: ( ( ')' ) )
            // InternalMetaTemplating.g:1817:1: ( ')' )
            {
            // InternalMetaTemplating.g:1817:1: ( ')' )
            // InternalMetaTemplating.g:1818:2: ')'
            {
             before(grammarAccess.getIteratorAccess().getRightParenthesisKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getIteratorAccess().getRightParenthesisKeyword_6()); 

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
    // InternalMetaTemplating.g:1827:1: rule__Iterator__Group__7 : rule__Iterator__Group__7__Impl rule__Iterator__Group__8 ;
    public final void rule__Iterator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1831:1: ( rule__Iterator__Group__7__Impl rule__Iterator__Group__8 )
            // InternalMetaTemplating.g:1832:2: rule__Iterator__Group__7__Impl rule__Iterator__Group__8
            {
            pushFollow(FOLLOW_19);
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
    // InternalMetaTemplating.g:1839:1: rule__Iterator__Group__7__Impl : ( '{' ) ;
    public final void rule__Iterator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1843:1: ( ( '{' ) )
            // InternalMetaTemplating.g:1844:1: ( '{' )
            {
            // InternalMetaTemplating.g:1844:1: ( '{' )
            // InternalMetaTemplating.g:1845:2: '{'
            {
             before(grammarAccess.getIteratorAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getIteratorAccess().getLeftCurlyBracketKeyword_7()); 

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
    // InternalMetaTemplating.g:1854:1: rule__Iterator__Group__8 : rule__Iterator__Group__8__Impl rule__Iterator__Group__9 ;
    public final void rule__Iterator__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1858:1: ( rule__Iterator__Group__8__Impl rule__Iterator__Group__9 )
            // InternalMetaTemplating.g:1859:2: rule__Iterator__Group__8__Impl rule__Iterator__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__Iterator__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Iterator__Group__9();

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
    // InternalMetaTemplating.g:1866:1: rule__Iterator__Group__8__Impl : ( ( rule__Iterator__BodyAssignment_8 )* ) ;
    public final void rule__Iterator__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1870:1: ( ( ( rule__Iterator__BodyAssignment_8 )* ) )
            // InternalMetaTemplating.g:1871:1: ( ( rule__Iterator__BodyAssignment_8 )* )
            {
            // InternalMetaTemplating.g:1871:1: ( ( rule__Iterator__BodyAssignment_8 )* )
            // InternalMetaTemplating.g:1872:2: ( rule__Iterator__BodyAssignment_8 )*
            {
             before(grammarAccess.getIteratorAccess().getBodyAssignment_8()); 
            // InternalMetaTemplating.g:1873:2: ( rule__Iterator__BodyAssignment_8 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==11||LA13_0==14||(LA13_0>=26 && LA13_0<=27)||LA13_0==29||LA13_0==31||LA13_0==33||LA13_0==39) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMetaTemplating.g:1873:3: rule__Iterator__BodyAssignment_8
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Iterator__BodyAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getIteratorAccess().getBodyAssignment_8()); 

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


    // $ANTLR start "rule__Iterator__Group__9"
    // InternalMetaTemplating.g:1881:1: rule__Iterator__Group__9 : rule__Iterator__Group__9__Impl ;
    public final void rule__Iterator__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1885:1: ( rule__Iterator__Group__9__Impl )
            // InternalMetaTemplating.g:1886:2: rule__Iterator__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Iterator__Group__9__Impl();

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
    // $ANTLR end "rule__Iterator__Group__9"


    // $ANTLR start "rule__Iterator__Group__9__Impl"
    // InternalMetaTemplating.g:1892:1: rule__Iterator__Group__9__Impl : ( '}' ) ;
    public final void rule__Iterator__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1896:1: ( ( '}' ) )
            // InternalMetaTemplating.g:1897:1: ( '}' )
            {
            // InternalMetaTemplating.g:1897:1: ( '}' )
            // InternalMetaTemplating.g:1898:2: '}'
            {
             before(grammarAccess.getIteratorAccess().getRightCurlyBracketKeyword_9()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getIteratorAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Iterator__Group__9__Impl"


    // $ANTLR start "rule__MetaPh__Group_0__0"
    // InternalMetaTemplating.g:1908:1: rule__MetaPh__Group_0__0 : rule__MetaPh__Group_0__0__Impl rule__MetaPh__Group_0__1 ;
    public final void rule__MetaPh__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1912:1: ( rule__MetaPh__Group_0__0__Impl rule__MetaPh__Group_0__1 )
            // InternalMetaTemplating.g:1913:2: rule__MetaPh__Group_0__0__Impl rule__MetaPh__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__MetaPh__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaPh__Group_0__1();

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
    // $ANTLR end "rule__MetaPh__Group_0__0"


    // $ANTLR start "rule__MetaPh__Group_0__0__Impl"
    // InternalMetaTemplating.g:1920:1: rule__MetaPh__Group_0__0__Impl : ( '[' ) ;
    public final void rule__MetaPh__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1924:1: ( ( '[' ) )
            // InternalMetaTemplating.g:1925:1: ( '[' )
            {
            // InternalMetaTemplating.g:1925:1: ( '[' )
            // InternalMetaTemplating.g:1926:2: '['
            {
             before(grammarAccess.getMetaPhAccess().getLeftSquareBracketKeyword_0_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMetaPhAccess().getLeftSquareBracketKeyword_0_0()); 

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
    // $ANTLR end "rule__MetaPh__Group_0__0__Impl"


    // $ANTLR start "rule__MetaPh__Group_0__1"
    // InternalMetaTemplating.g:1935:1: rule__MetaPh__Group_0__1 : rule__MetaPh__Group_0__1__Impl rule__MetaPh__Group_0__2 ;
    public final void rule__MetaPh__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1939:1: ( rule__MetaPh__Group_0__1__Impl rule__MetaPh__Group_0__2 )
            // InternalMetaTemplating.g:1940:2: rule__MetaPh__Group_0__1__Impl rule__MetaPh__Group_0__2
            {
            pushFollow(FOLLOW_24);
            rule__MetaPh__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaPh__Group_0__2();

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
    // $ANTLR end "rule__MetaPh__Group_0__1"


    // $ANTLR start "rule__MetaPh__Group_0__1__Impl"
    // InternalMetaTemplating.g:1947:1: rule__MetaPh__Group_0__1__Impl : ( ( rule__MetaPh__PropertyAssignment_0_1 ) ) ;
    public final void rule__MetaPh__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1951:1: ( ( ( rule__MetaPh__PropertyAssignment_0_1 ) ) )
            // InternalMetaTemplating.g:1952:1: ( ( rule__MetaPh__PropertyAssignment_0_1 ) )
            {
            // InternalMetaTemplating.g:1952:1: ( ( rule__MetaPh__PropertyAssignment_0_1 ) )
            // InternalMetaTemplating.g:1953:2: ( rule__MetaPh__PropertyAssignment_0_1 )
            {
             before(grammarAccess.getMetaPhAccess().getPropertyAssignment_0_1()); 
            // InternalMetaTemplating.g:1954:2: ( rule__MetaPh__PropertyAssignment_0_1 )
            // InternalMetaTemplating.g:1954:3: rule__MetaPh__PropertyAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__MetaPh__PropertyAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMetaPhAccess().getPropertyAssignment_0_1()); 

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
    // $ANTLR end "rule__MetaPh__Group_0__1__Impl"


    // $ANTLR start "rule__MetaPh__Group_0__2"
    // InternalMetaTemplating.g:1962:1: rule__MetaPh__Group_0__2 : rule__MetaPh__Group_0__2__Impl ;
    public final void rule__MetaPh__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1966:1: ( rule__MetaPh__Group_0__2__Impl )
            // InternalMetaTemplating.g:1967:2: rule__MetaPh__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MetaPh__Group_0__2__Impl();

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
    // $ANTLR end "rule__MetaPh__Group_0__2"


    // $ANTLR start "rule__MetaPh__Group_0__2__Impl"
    // InternalMetaTemplating.g:1973:1: rule__MetaPh__Group_0__2__Impl : ( ']' ) ;
    public final void rule__MetaPh__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1977:1: ( ( ']' ) )
            // InternalMetaTemplating.g:1978:1: ( ']' )
            {
            // InternalMetaTemplating.g:1978:1: ( ']' )
            // InternalMetaTemplating.g:1979:2: ']'
            {
             before(grammarAccess.getMetaPhAccess().getRightSquareBracketKeyword_0_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMetaPhAccess().getRightSquareBracketKeyword_0_2()); 

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
    // $ANTLR end "rule__MetaPh__Group_0__2__Impl"


    // $ANTLR start "rule__MetaPh__Group_1__0"
    // InternalMetaTemplating.g:1989:1: rule__MetaPh__Group_1__0 : rule__MetaPh__Group_1__0__Impl rule__MetaPh__Group_1__1 ;
    public final void rule__MetaPh__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1993:1: ( rule__MetaPh__Group_1__0__Impl rule__MetaPh__Group_1__1 )
            // InternalMetaTemplating.g:1994:2: rule__MetaPh__Group_1__0__Impl rule__MetaPh__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__MetaPh__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaPh__Group_1__1();

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
    // $ANTLR end "rule__MetaPh__Group_1__0"


    // $ANTLR start "rule__MetaPh__Group_1__0__Impl"
    // InternalMetaTemplating.g:2001:1: rule__MetaPh__Group_1__0__Impl : ( '[' ) ;
    public final void rule__MetaPh__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2005:1: ( ( '[' ) )
            // InternalMetaTemplating.g:2006:1: ( '[' )
            {
            // InternalMetaTemplating.g:2006:1: ( '[' )
            // InternalMetaTemplating.g:2007:2: '['
            {
             before(grammarAccess.getMetaPhAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMetaPhAccess().getLeftSquareBracketKeyword_1_0()); 

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
    // $ANTLR end "rule__MetaPh__Group_1__0__Impl"


    // $ANTLR start "rule__MetaPh__Group_1__1"
    // InternalMetaTemplating.g:2016:1: rule__MetaPh__Group_1__1 : rule__MetaPh__Group_1__1__Impl rule__MetaPh__Group_1__2 ;
    public final void rule__MetaPh__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2020:1: ( rule__MetaPh__Group_1__1__Impl rule__MetaPh__Group_1__2 )
            // InternalMetaTemplating.g:2021:2: rule__MetaPh__Group_1__1__Impl rule__MetaPh__Group_1__2
            {
            pushFollow(FOLLOW_25);
            rule__MetaPh__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaPh__Group_1__2();

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
    // $ANTLR end "rule__MetaPh__Group_1__1"


    // $ANTLR start "rule__MetaPh__Group_1__1__Impl"
    // InternalMetaTemplating.g:2028:1: rule__MetaPh__Group_1__1__Impl : ( ( rule__MetaPh__PropertyAssignment_1_1 ) ) ;
    public final void rule__MetaPh__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2032:1: ( ( ( rule__MetaPh__PropertyAssignment_1_1 ) ) )
            // InternalMetaTemplating.g:2033:1: ( ( rule__MetaPh__PropertyAssignment_1_1 ) )
            {
            // InternalMetaTemplating.g:2033:1: ( ( rule__MetaPh__PropertyAssignment_1_1 ) )
            // InternalMetaTemplating.g:2034:2: ( rule__MetaPh__PropertyAssignment_1_1 )
            {
             before(grammarAccess.getMetaPhAccess().getPropertyAssignment_1_1()); 
            // InternalMetaTemplating.g:2035:2: ( rule__MetaPh__PropertyAssignment_1_1 )
            // InternalMetaTemplating.g:2035:3: rule__MetaPh__PropertyAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MetaPh__PropertyAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMetaPhAccess().getPropertyAssignment_1_1()); 

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
    // $ANTLR end "rule__MetaPh__Group_1__1__Impl"


    // $ANTLR start "rule__MetaPh__Group_1__2"
    // InternalMetaTemplating.g:2043:1: rule__MetaPh__Group_1__2 : rule__MetaPh__Group_1__2__Impl rule__MetaPh__Group_1__3 ;
    public final void rule__MetaPh__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2047:1: ( rule__MetaPh__Group_1__2__Impl rule__MetaPh__Group_1__3 )
            // InternalMetaTemplating.g:2048:2: rule__MetaPh__Group_1__2__Impl rule__MetaPh__Group_1__3
            {
            pushFollow(FOLLOW_24);
            rule__MetaPh__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaPh__Group_1__3();

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
    // $ANTLR end "rule__MetaPh__Group_1__2"


    // $ANTLR start "rule__MetaPh__Group_1__2__Impl"
    // InternalMetaTemplating.g:2055:1: rule__MetaPh__Group_1__2__Impl : ( ( rule__MetaPh__InfoAssignment_1_2 ) ) ;
    public final void rule__MetaPh__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2059:1: ( ( ( rule__MetaPh__InfoAssignment_1_2 ) ) )
            // InternalMetaTemplating.g:2060:1: ( ( rule__MetaPh__InfoAssignment_1_2 ) )
            {
            // InternalMetaTemplating.g:2060:1: ( ( rule__MetaPh__InfoAssignment_1_2 ) )
            // InternalMetaTemplating.g:2061:2: ( rule__MetaPh__InfoAssignment_1_2 )
            {
             before(grammarAccess.getMetaPhAccess().getInfoAssignment_1_2()); 
            // InternalMetaTemplating.g:2062:2: ( rule__MetaPh__InfoAssignment_1_2 )
            // InternalMetaTemplating.g:2062:3: rule__MetaPh__InfoAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MetaPh__InfoAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMetaPhAccess().getInfoAssignment_1_2()); 

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
    // $ANTLR end "rule__MetaPh__Group_1__2__Impl"


    // $ANTLR start "rule__MetaPh__Group_1__3"
    // InternalMetaTemplating.g:2070:1: rule__MetaPh__Group_1__3 : rule__MetaPh__Group_1__3__Impl ;
    public final void rule__MetaPh__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2074:1: ( rule__MetaPh__Group_1__3__Impl )
            // InternalMetaTemplating.g:2075:2: rule__MetaPh__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MetaPh__Group_1__3__Impl();

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
    // $ANTLR end "rule__MetaPh__Group_1__3"


    // $ANTLR start "rule__MetaPh__Group_1__3__Impl"
    // InternalMetaTemplating.g:2081:1: rule__MetaPh__Group_1__3__Impl : ( ']' ) ;
    public final void rule__MetaPh__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2085:1: ( ( ']' ) )
            // InternalMetaTemplating.g:2086:1: ( ']' )
            {
            // InternalMetaTemplating.g:2086:1: ( ']' )
            // InternalMetaTemplating.g:2087:2: ']'
            {
             before(grammarAccess.getMetaPhAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMetaPhAccess().getRightSquareBracketKeyword_1_3()); 

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
    // $ANTLR end "rule__MetaPh__Group_1__3__Impl"


    // $ANTLR start "rule__TagInfo__Group__0"
    // InternalMetaTemplating.g:2097:1: rule__TagInfo__Group__0 : rule__TagInfo__Group__0__Impl rule__TagInfo__Group__1 ;
    public final void rule__TagInfo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2101:1: ( rule__TagInfo__Group__0__Impl rule__TagInfo__Group__1 )
            // InternalMetaTemplating.g:2102:2: rule__TagInfo__Group__0__Impl rule__TagInfo__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__TagInfo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TagInfo__Group__1();

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
    // $ANTLR end "rule__TagInfo__Group__0"


    // $ANTLR start "rule__TagInfo__Group__0__Impl"
    // InternalMetaTemplating.g:2109:1: rule__TagInfo__Group__0__Impl : ( 'TAGINFO' ) ;
    public final void rule__TagInfo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2113:1: ( ( 'TAGINFO' ) )
            // InternalMetaTemplating.g:2114:1: ( 'TAGINFO' )
            {
            // InternalMetaTemplating.g:2114:1: ( 'TAGINFO' )
            // InternalMetaTemplating.g:2115:2: 'TAGINFO'
            {
             before(grammarAccess.getTagInfoAccess().getTAGINFOKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTagInfoAccess().getTAGINFOKeyword_0()); 

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
    // $ANTLR end "rule__TagInfo__Group__0__Impl"


    // $ANTLR start "rule__TagInfo__Group__1"
    // InternalMetaTemplating.g:2124:1: rule__TagInfo__Group__1 : rule__TagInfo__Group__1__Impl ;
    public final void rule__TagInfo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2128:1: ( rule__TagInfo__Group__1__Impl )
            // InternalMetaTemplating.g:2129:2: rule__TagInfo__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TagInfo__Group__1__Impl();

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
    // $ANTLR end "rule__TagInfo__Group__1"


    // $ANTLR start "rule__TagInfo__Group__1__Impl"
    // InternalMetaTemplating.g:2135:1: rule__TagInfo__Group__1__Impl : ( ( rule__TagInfo__TagAssignment_1 ) ) ;
    public final void rule__TagInfo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2139:1: ( ( ( rule__TagInfo__TagAssignment_1 ) ) )
            // InternalMetaTemplating.g:2140:1: ( ( rule__TagInfo__TagAssignment_1 ) )
            {
            // InternalMetaTemplating.g:2140:1: ( ( rule__TagInfo__TagAssignment_1 ) )
            // InternalMetaTemplating.g:2141:2: ( rule__TagInfo__TagAssignment_1 )
            {
             before(grammarAccess.getTagInfoAccess().getTagAssignment_1()); 
            // InternalMetaTemplating.g:2142:2: ( rule__TagInfo__TagAssignment_1 )
            // InternalMetaTemplating.g:2142:3: rule__TagInfo__TagAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TagInfo__TagAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTagInfoAccess().getTagAssignment_1()); 

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
    // $ANTLR end "rule__TagInfo__Group__1__Impl"


    // $ANTLR start "rule__MetaProperty__Group__0"
    // InternalMetaTemplating.g:2151:1: rule__MetaProperty__Group__0 : rule__MetaProperty__Group__0__Impl rule__MetaProperty__Group__1 ;
    public final void rule__MetaProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2155:1: ( rule__MetaProperty__Group__0__Impl rule__MetaProperty__Group__1 )
            // InternalMetaTemplating.g:2156:2: rule__MetaProperty__Group__0__Impl rule__MetaProperty__Group__1
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
    // InternalMetaTemplating.g:2163:1: rule__MetaProperty__Group__0__Impl : ( '.{' ) ;
    public final void rule__MetaProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2167:1: ( ( '.{' ) )
            // InternalMetaTemplating.g:2168:1: ( '.{' )
            {
            // InternalMetaTemplating.g:2168:1: ( '.{' )
            // InternalMetaTemplating.g:2169:2: '.{'
            {
             before(grammarAccess.getMetaPropertyAccess().getFullStopLeftCurlyBracketKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMetaTemplating.g:2178:1: rule__MetaProperty__Group__1 : rule__MetaProperty__Group__1__Impl rule__MetaProperty__Group__2 ;
    public final void rule__MetaProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2182:1: ( rule__MetaProperty__Group__1__Impl rule__MetaProperty__Group__2 )
            // InternalMetaTemplating.g:2183:2: rule__MetaProperty__Group__1__Impl rule__MetaProperty__Group__2
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
    // InternalMetaTemplating.g:2190:1: rule__MetaProperty__Group__1__Impl : ( ( rule__MetaProperty__PropertyAssignment_1 ) ) ;
    public final void rule__MetaProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2194:1: ( ( ( rule__MetaProperty__PropertyAssignment_1 ) ) )
            // InternalMetaTemplating.g:2195:1: ( ( rule__MetaProperty__PropertyAssignment_1 ) )
            {
            // InternalMetaTemplating.g:2195:1: ( ( rule__MetaProperty__PropertyAssignment_1 ) )
            // InternalMetaTemplating.g:2196:2: ( rule__MetaProperty__PropertyAssignment_1 )
            {
             before(grammarAccess.getMetaPropertyAccess().getPropertyAssignment_1()); 
            // InternalMetaTemplating.g:2197:2: ( rule__MetaProperty__PropertyAssignment_1 )
            // InternalMetaTemplating.g:2197:3: rule__MetaProperty__PropertyAssignment_1
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
    // InternalMetaTemplating.g:2205:1: rule__MetaProperty__Group__2 : rule__MetaProperty__Group__2__Impl ;
    public final void rule__MetaProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2209:1: ( rule__MetaProperty__Group__2__Impl )
            // InternalMetaTemplating.g:2210:2: rule__MetaProperty__Group__2__Impl
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
    // InternalMetaTemplating.g:2216:1: rule__MetaProperty__Group__2__Impl : ( '}' ) ;
    public final void rule__MetaProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2220:1: ( ( '}' ) )
            // InternalMetaTemplating.g:2221:1: ( '}' )
            {
            // InternalMetaTemplating.g:2221:1: ( '}' )
            // InternalMetaTemplating.g:2222:2: '}'
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
    // InternalMetaTemplating.g:2232:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2236:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalMetaTemplating.g:2237:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalMetaTemplating.g:2244:1: rule__Property__Group__0__Impl : ( ( rule__Property__PropertyAssignment_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2248:1: ( ( ( rule__Property__PropertyAssignment_0 ) ) )
            // InternalMetaTemplating.g:2249:1: ( ( rule__Property__PropertyAssignment_0 ) )
            {
            // InternalMetaTemplating.g:2249:1: ( ( rule__Property__PropertyAssignment_0 ) )
            // InternalMetaTemplating.g:2250:2: ( rule__Property__PropertyAssignment_0 )
            {
             before(grammarAccess.getPropertyAccess().getPropertyAssignment_0()); 
            // InternalMetaTemplating.g:2251:2: ( rule__Property__PropertyAssignment_0 )
            // InternalMetaTemplating.g:2251:3: rule__Property__PropertyAssignment_0
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
    // InternalMetaTemplating.g:2259:1: rule__Property__Group__1 : rule__Property__Group__1__Impl ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2263:1: ( rule__Property__Group__1__Impl )
            // InternalMetaTemplating.g:2264:2: rule__Property__Group__1__Impl
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
    // InternalMetaTemplating.g:2270:1: rule__Property__Group__1__Impl : ( ( rule__Property__SubPropertiesAssignment_1 )* ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2274:1: ( ( ( rule__Property__SubPropertiesAssignment_1 )* ) )
            // InternalMetaTemplating.g:2275:1: ( ( rule__Property__SubPropertiesAssignment_1 )* )
            {
            // InternalMetaTemplating.g:2275:1: ( ( rule__Property__SubPropertiesAssignment_1 )* )
            // InternalMetaTemplating.g:2276:2: ( rule__Property__SubPropertiesAssignment_1 )*
            {
             before(grammarAccess.getPropertyAccess().getSubPropertiesAssignment_1()); 
            // InternalMetaTemplating.g:2277:2: ( rule__Property__SubPropertiesAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==37) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMetaTemplating.g:2277:3: rule__Property__SubPropertiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Property__SubPropertiesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalMetaTemplating.g:2286:1: rule__SubProperty__Group_0__0 : rule__SubProperty__Group_0__0__Impl rule__SubProperty__Group_0__1 ;
    public final void rule__SubProperty__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2290:1: ( rule__SubProperty__Group_0__0__Impl rule__SubProperty__Group_0__1 )
            // InternalMetaTemplating.g:2291:2: rule__SubProperty__Group_0__0__Impl rule__SubProperty__Group_0__1
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
    // InternalMetaTemplating.g:2298:1: rule__SubProperty__Group_0__0__Impl : ( '.' ) ;
    public final void rule__SubProperty__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2302:1: ( ( '.' ) )
            // InternalMetaTemplating.g:2303:1: ( '.' )
            {
            // InternalMetaTemplating.g:2303:1: ( '.' )
            // InternalMetaTemplating.g:2304:2: '.'
            {
             before(grammarAccess.getSubPropertyAccess().getFullStopKeyword_0_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMetaTemplating.g:2313:1: rule__SubProperty__Group_0__1 : rule__SubProperty__Group_0__1__Impl ;
    public final void rule__SubProperty__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2317:1: ( rule__SubProperty__Group_0__1__Impl )
            // InternalMetaTemplating.g:2318:2: rule__SubProperty__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubProperty__Group_0__1__Impl();

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
    // InternalMetaTemplating.g:2324:1: rule__SubProperty__Group_0__1__Impl : ( ( rule__SubProperty__PropertyAssignment_0_1 ) ) ;
    public final void rule__SubProperty__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2328:1: ( ( ( rule__SubProperty__PropertyAssignment_0_1 ) ) )
            // InternalMetaTemplating.g:2329:1: ( ( rule__SubProperty__PropertyAssignment_0_1 ) )
            {
            // InternalMetaTemplating.g:2329:1: ( ( rule__SubProperty__PropertyAssignment_0_1 ) )
            // InternalMetaTemplating.g:2330:2: ( rule__SubProperty__PropertyAssignment_0_1 )
            {
             before(grammarAccess.getSubPropertyAccess().getPropertyAssignment_0_1()); 
            // InternalMetaTemplating.g:2331:2: ( rule__SubProperty__PropertyAssignment_0_1 )
            // InternalMetaTemplating.g:2331:3: rule__SubProperty__PropertyAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__SubProperty__PropertyAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSubPropertyAccess().getPropertyAssignment_0_1()); 

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


    // $ANTLR start "rule__SubProperty__Group_1__0"
    // InternalMetaTemplating.g:2340:1: rule__SubProperty__Group_1__0 : rule__SubProperty__Group_1__0__Impl rule__SubProperty__Group_1__1 ;
    public final void rule__SubProperty__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2344:1: ( rule__SubProperty__Group_1__0__Impl rule__SubProperty__Group_1__1 )
            // InternalMetaTemplating.g:2345:2: rule__SubProperty__Group_1__0__Impl rule__SubProperty__Group_1__1
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
    // InternalMetaTemplating.g:2352:1: rule__SubProperty__Group_1__0__Impl : ( '.' ) ;
    public final void rule__SubProperty__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2356:1: ( ( '.' ) )
            // InternalMetaTemplating.g:2357:1: ( '.' )
            {
            // InternalMetaTemplating.g:2357:1: ( '.' )
            // InternalMetaTemplating.g:2358:2: '.'
            {
             before(grammarAccess.getSubPropertyAccess().getFullStopKeyword_1_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMetaTemplating.g:2367:1: rule__SubProperty__Group_1__1 : rule__SubProperty__Group_1__1__Impl rule__SubProperty__Group_1__2 ;
    public final void rule__SubProperty__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2371:1: ( rule__SubProperty__Group_1__1__Impl rule__SubProperty__Group_1__2 )
            // InternalMetaTemplating.g:2372:2: rule__SubProperty__Group_1__1__Impl rule__SubProperty__Group_1__2
            {
            pushFollow(FOLLOW_28);
            rule__SubProperty__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubProperty__Group_1__2();

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
    // InternalMetaTemplating.g:2379:1: rule__SubProperty__Group_1__1__Impl : ( ( rule__SubProperty__PropertyAssignment_1_1 ) ) ;
    public final void rule__SubProperty__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2383:1: ( ( ( rule__SubProperty__PropertyAssignment_1_1 ) ) )
            // InternalMetaTemplating.g:2384:1: ( ( rule__SubProperty__PropertyAssignment_1_1 ) )
            {
            // InternalMetaTemplating.g:2384:1: ( ( rule__SubProperty__PropertyAssignment_1_1 ) )
            // InternalMetaTemplating.g:2385:2: ( rule__SubProperty__PropertyAssignment_1_1 )
            {
             before(grammarAccess.getSubPropertyAccess().getPropertyAssignment_1_1()); 
            // InternalMetaTemplating.g:2386:2: ( rule__SubProperty__PropertyAssignment_1_1 )
            // InternalMetaTemplating.g:2386:3: rule__SubProperty__PropertyAssignment_1_1
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


    // $ANTLR start "rule__SubProperty__Group_1__2"
    // InternalMetaTemplating.g:2394:1: rule__SubProperty__Group_1__2 : rule__SubProperty__Group_1__2__Impl ;
    public final void rule__SubProperty__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2398:1: ( rule__SubProperty__Group_1__2__Impl )
            // InternalMetaTemplating.g:2399:2: rule__SubProperty__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubProperty__Group_1__2__Impl();

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
    // $ANTLR end "rule__SubProperty__Group_1__2"


    // $ANTLR start "rule__SubProperty__Group_1__2__Impl"
    // InternalMetaTemplating.g:2405:1: rule__SubProperty__Group_1__2__Impl : ( '()' ) ;
    public final void rule__SubProperty__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2409:1: ( ( '()' ) )
            // InternalMetaTemplating.g:2410:1: ( '()' )
            {
            // InternalMetaTemplating.g:2410:1: ( '()' )
            // InternalMetaTemplating.g:2411:2: '()'
            {
             before(grammarAccess.getSubPropertyAccess().getLeftParenthesisRightParenthesisKeyword_1_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSubPropertyAccess().getLeftParenthesisRightParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__SubProperty__Group_1__2__Impl"


    // $ANTLR start "rule__EscapedString__Group__0"
    // InternalMetaTemplating.g:2421:1: rule__EscapedString__Group__0 : rule__EscapedString__Group__0__Impl rule__EscapedString__Group__1 ;
    public final void rule__EscapedString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2425:1: ( rule__EscapedString__Group__0__Impl rule__EscapedString__Group__1 )
            // InternalMetaTemplating.g:2426:2: rule__EscapedString__Group__0__Impl rule__EscapedString__Group__1
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
    // InternalMetaTemplating.g:2433:1: rule__EscapedString__Group__0__Impl : ( '@{' ) ;
    public final void rule__EscapedString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2437:1: ( ( '@{' ) )
            // InternalMetaTemplating.g:2438:1: ( '@{' )
            {
            // InternalMetaTemplating.g:2438:1: ( '@{' )
            // InternalMetaTemplating.g:2439:2: '@{'
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
    // InternalMetaTemplating.g:2448:1: rule__EscapedString__Group__1 : rule__EscapedString__Group__1__Impl rule__EscapedString__Group__2 ;
    public final void rule__EscapedString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2452:1: ( rule__EscapedString__Group__1__Impl rule__EscapedString__Group__2 )
            // InternalMetaTemplating.g:2453:2: rule__EscapedString__Group__1__Impl rule__EscapedString__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalMetaTemplating.g:2460:1: rule__EscapedString__Group__1__Impl : ( ( rule__EscapedString__StrAssignment_1 ) ) ;
    public final void rule__EscapedString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2464:1: ( ( ( rule__EscapedString__StrAssignment_1 ) ) )
            // InternalMetaTemplating.g:2465:1: ( ( rule__EscapedString__StrAssignment_1 ) )
            {
            // InternalMetaTemplating.g:2465:1: ( ( rule__EscapedString__StrAssignment_1 ) )
            // InternalMetaTemplating.g:2466:2: ( rule__EscapedString__StrAssignment_1 )
            {
             before(grammarAccess.getEscapedStringAccess().getStrAssignment_1()); 
            // InternalMetaTemplating.g:2467:2: ( rule__EscapedString__StrAssignment_1 )
            // InternalMetaTemplating.g:2467:3: rule__EscapedString__StrAssignment_1
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
    // InternalMetaTemplating.g:2475:1: rule__EscapedString__Group__2 : rule__EscapedString__Group__2__Impl ;
    public final void rule__EscapedString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2479:1: ( rule__EscapedString__Group__2__Impl )
            // InternalMetaTemplating.g:2480:2: rule__EscapedString__Group__2__Impl
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
    // InternalMetaTemplating.g:2486:1: rule__EscapedString__Group__2__Impl : ( '}@' ) ;
    public final void rule__EscapedString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2490:1: ( ( '}@' ) )
            // InternalMetaTemplating.g:2491:1: ( '}@' )
            {
            // InternalMetaTemplating.g:2491:1: ( '}@' )
            // InternalMetaTemplating.g:2492:2: '}@'
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
    // InternalMetaTemplating.g:2502:1: rule__Escaped__Group__0 : rule__Escaped__Group__0__Impl rule__Escaped__Group__1 ;
    public final void rule__Escaped__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2506:1: ( rule__Escaped__Group__0__Impl rule__Escaped__Group__1 )
            // InternalMetaTemplating.g:2507:2: rule__Escaped__Group__0__Impl rule__Escaped__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalMetaTemplating.g:2514:1: rule__Escaped__Group__0__Impl : ( '#' ) ;
    public final void rule__Escaped__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2518:1: ( ( '#' ) )
            // InternalMetaTemplating.g:2519:1: ( '#' )
            {
            // InternalMetaTemplating.g:2519:1: ( '#' )
            // InternalMetaTemplating.g:2520:2: '#'
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
    // InternalMetaTemplating.g:2529:1: rule__Escaped__Group__1 : rule__Escaped__Group__1__Impl ;
    public final void rule__Escaped__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2533:1: ( rule__Escaped__Group__1__Impl )
            // InternalMetaTemplating.g:2534:2: rule__Escaped__Group__1__Impl
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
    // InternalMetaTemplating.g:2540:1: rule__Escaped__Group__1__Impl : ( ( rule__Escaped__CharAssignment_1 ) ) ;
    public final void rule__Escaped__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2544:1: ( ( ( rule__Escaped__CharAssignment_1 ) ) )
            // InternalMetaTemplating.g:2545:1: ( ( rule__Escaped__CharAssignment_1 ) )
            {
            // InternalMetaTemplating.g:2545:1: ( ( rule__Escaped__CharAssignment_1 ) )
            // InternalMetaTemplating.g:2546:2: ( rule__Escaped__CharAssignment_1 )
            {
             before(grammarAccess.getEscapedAccess().getCharAssignment_1()); 
            // InternalMetaTemplating.g:2547:2: ( rule__Escaped__CharAssignment_1 )
            // InternalMetaTemplating.g:2547:3: rule__Escaped__CharAssignment_1
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
    // InternalMetaTemplating.g:2556:1: rule__Model__HeaderAssignment_0 : ( ruleHeader ) ;
    public final void rule__Model__HeaderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2560:1: ( ( ruleHeader ) )
            // InternalMetaTemplating.g:2561:2: ( ruleHeader )
            {
            // InternalMetaTemplating.g:2561:2: ( ruleHeader )
            // InternalMetaTemplating.g:2562:3: ruleHeader
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
    // InternalMetaTemplating.g:2571:1: rule__Model__ContentAssignment_1 : ( ruleInstructions ) ;
    public final void rule__Model__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2575:1: ( ( ruleInstructions ) )
            // InternalMetaTemplating.g:2576:2: ( ruleInstructions )
            {
            // InternalMetaTemplating.g:2576:2: ( ruleInstructions )
            // InternalMetaTemplating.g:2577:3: ruleInstructions
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
    // InternalMetaTemplating.g:2586:1: rule__Header__LibsAssignment_1 : ( ruleLibraries ) ;
    public final void rule__Header__LibsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2590:1: ( ( ruleLibraries ) )
            // InternalMetaTemplating.g:2591:2: ( ruleLibraries )
            {
            // InternalMetaTemplating.g:2591:2: ( ruleLibraries )
            // InternalMetaTemplating.g:2592:3: ruleLibraries
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
    // InternalMetaTemplating.g:2601:1: rule__Header__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__Header__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2605:1: ( ( ruleImport ) )
            // InternalMetaTemplating.g:2606:2: ( ruleImport )
            {
            // InternalMetaTemplating.g:2606:2: ( ruleImport )
            // InternalMetaTemplating.g:2607:3: ruleImport
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
    // InternalMetaTemplating.g:2616:1: rule__Import__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2620:1: ( ( RULE_STRING ) )
            // InternalMetaTemplating.g:2621:2: ( RULE_STRING )
            {
            // InternalMetaTemplating.g:2621:2: ( RULE_STRING )
            // InternalMetaTemplating.g:2622:3: RULE_STRING
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
    // InternalMetaTemplating.g:2631:1: rule__Libraries__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Libraries__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2635:1: ( ( RULE_STRING ) )
            // InternalMetaTemplating.g:2636:2: ( RULE_STRING )
            {
            // InternalMetaTemplating.g:2636:2: ( RULE_STRING )
            // InternalMetaTemplating.g:2637:3: RULE_STRING
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
    // InternalMetaTemplating.g:2646:1: rule__Comment__WordAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Comment__WordAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2650:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:2651:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:2651:2: ( RULE_ID )
            // InternalMetaTemplating.g:2652:3: RULE_ID
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
    // InternalMetaTemplating.g:2661:1: rule__Comment__WordAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Comment__WordAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2665:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:2666:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:2666:2: ( RULE_ID )
            // InternalMetaTemplating.g:2667:3: RULE_ID
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
    // InternalMetaTemplating.g:2676:1: rule__Instructions__StatementAssignment_0 : ( ruleStatement ) ;
    public final void rule__Instructions__StatementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2680:1: ( ( ruleStatement ) )
            // InternalMetaTemplating.g:2681:2: ( ruleStatement )
            {
            // InternalMetaTemplating.g:2681:2: ( ruleStatement )
            // InternalMetaTemplating.g:2682:3: ruleStatement
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
    // InternalMetaTemplating.g:2691:1: rule__Instructions__IteratorAssignment_1 : ( ruleIterator ) ;
    public final void rule__Instructions__IteratorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2695:1: ( ( ruleIterator ) )
            // InternalMetaTemplating.g:2696:2: ( ruleIterator )
            {
            // InternalMetaTemplating.g:2696:2: ( ruleIterator )
            // InternalMetaTemplating.g:2697:3: ruleIterator
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
    // InternalMetaTemplating.g:2706:1: rule__Instructions__RuleAssignment_2 : ( ruleRule ) ;
    public final void rule__Instructions__RuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2710:1: ( ( ruleRule ) )
            // InternalMetaTemplating.g:2711:2: ( ruleRule )
            {
            // InternalMetaTemplating.g:2711:2: ( ruleRule )
            // InternalMetaTemplating.g:2712:3: ruleRule
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
    // InternalMetaTemplating.g:2721:1: rule__Instructions__CommentAssignment_3 : ( ruleComment ) ;
    public final void rule__Instructions__CommentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2725:1: ( ( ruleComment ) )
            // InternalMetaTemplating.g:2726:2: ( ruleComment )
            {
            // InternalMetaTemplating.g:2726:2: ( ruleComment )
            // InternalMetaTemplating.g:2727:3: ruleComment
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
    // InternalMetaTemplating.g:2736:1: rule__Statement__TextAssignment_0 : ( RULE_ID ) ;
    public final void rule__Statement__TextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2740:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:2741:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:2741:2: ( RULE_ID )
            // InternalMetaTemplating.g:2742:3: RULE_ID
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
    // InternalMetaTemplating.g:2751:1: rule__Statement__CharAssignment_1 : ( ruleEscaped ) ;
    public final void rule__Statement__CharAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2755:1: ( ( ruleEscaped ) )
            // InternalMetaTemplating.g:2756:2: ( ruleEscaped )
            {
            // InternalMetaTemplating.g:2756:2: ( ruleEscaped )
            // InternalMetaTemplating.g:2757:3: ruleEscaped
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
    // InternalMetaTemplating.g:2766:1: rule__Statement__StringAssignment_2 : ( ruleEscapedString ) ;
    public final void rule__Statement__StringAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2770:1: ( ( ruleEscapedString ) )
            // InternalMetaTemplating.g:2771:2: ( ruleEscapedString )
            {
            // InternalMetaTemplating.g:2771:2: ( ruleEscapedString )
            // InternalMetaTemplating.g:2772:3: ruleEscapedString
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
    // InternalMetaTemplating.g:2781:1: rule__Statement__PlaceholderAssignment_3 : ( rulePh ) ;
    public final void rule__Statement__PlaceholderAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2785:1: ( ( rulePh ) )
            // InternalMetaTemplating.g:2786:2: ( rulePh )
            {
            // InternalMetaTemplating.g:2786:2: ( rulePh )
            // InternalMetaTemplating.g:2787:3: rulePh
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
    // InternalMetaTemplating.g:2796:1: rule__Statement__MetaPlaceholderAssignment_4 : ( ruleMetaPh ) ;
    public final void rule__Statement__MetaPlaceholderAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2800:1: ( ( ruleMetaPh ) )
            // InternalMetaTemplating.g:2801:2: ( ruleMetaPh )
            {
            // InternalMetaTemplating.g:2801:2: ( ruleMetaPh )
            // InternalMetaTemplating.g:2802:3: ruleMetaPh
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


    // $ANTLR start "rule__Ph__PropertyAssignment_0_1"
    // InternalMetaTemplating.g:2811:1: rule__Ph__PropertyAssignment_0_1 : ( ruleProperty ) ;
    public final void rule__Ph__PropertyAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2815:1: ( ( ruleProperty ) )
            // InternalMetaTemplating.g:2816:2: ( ruleProperty )
            {
            // InternalMetaTemplating.g:2816:2: ( ruleProperty )
            // InternalMetaTemplating.g:2817:3: ruleProperty
            {
             before(grammarAccess.getPhAccess().getPropertyPropertyParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPhAccess().getPropertyPropertyParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Ph__PropertyAssignment_0_1"


    // $ANTLR start "rule__Ph__PropertyAssignment_1_1"
    // InternalMetaTemplating.g:2826:1: rule__Ph__PropertyAssignment_1_1 : ( ruleProperty ) ;
    public final void rule__Ph__PropertyAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2830:1: ( ( ruleProperty ) )
            // InternalMetaTemplating.g:2831:2: ( ruleProperty )
            {
            // InternalMetaTemplating.g:2831:2: ( ruleProperty )
            // InternalMetaTemplating.g:2832:3: ruleProperty
            {
             before(grammarAccess.getPhAccess().getPropertyPropertyParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPhAccess().getPropertyPropertyParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Ph__PropertyAssignment_1_1"


    // $ANTLR start "rule__Ph__MetaPropertyAssignment_1_2"
    // InternalMetaTemplating.g:2841:1: rule__Ph__MetaPropertyAssignment_1_2 : ( ruleMetaProperty ) ;
    public final void rule__Ph__MetaPropertyAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2845:1: ( ( ruleMetaProperty ) )
            // InternalMetaTemplating.g:2846:2: ( ruleMetaProperty )
            {
            // InternalMetaTemplating.g:2846:2: ( ruleMetaProperty )
            // InternalMetaTemplating.g:2847:3: ruleMetaProperty
            {
             before(grammarAccess.getPhAccess().getMetaPropertyMetaPropertyParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaProperty();

            state._fsp--;

             after(grammarAccess.getPhAccess().getMetaPropertyMetaPropertyParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Ph__MetaPropertyAssignment_1_2"


    // $ANTLR start "rule__Rule__ElementAssignment_2"
    // InternalMetaTemplating.g:2856:1: rule__Rule__ElementAssignment_2 : ( RULE_ID ) ;
    public final void rule__Rule__ElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2860:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:2861:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:2861:2: ( RULE_ID )
            // InternalMetaTemplating.g:2862:3: RULE_ID
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
    // InternalMetaTemplating.g:2871:1: rule__Rule__PropertyAssignment_4 : ( ruleProperty ) ;
    public final void rule__Rule__PropertyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2875:1: ( ( ruleProperty ) )
            // InternalMetaTemplating.g:2876:2: ( ruleProperty )
            {
            // InternalMetaTemplating.g:2876:2: ( ruleProperty )
            // InternalMetaTemplating.g:2877:3: ruleProperty
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
    // InternalMetaTemplating.g:2886:1: rule__Rule__TagAssignment_6 : ( RULE_ID ) ;
    public final void rule__Rule__TagAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2890:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:2891:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:2891:2: ( RULE_ID )
            // InternalMetaTemplating.g:2892:3: RULE_ID
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
    // InternalMetaTemplating.g:2901:1: rule__Rule__BodyAssignment_9 : ( ruleInstructions ) ;
    public final void rule__Rule__BodyAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2905:1: ( ( ruleInstructions ) )
            // InternalMetaTemplating.g:2906:2: ( ruleInstructions )
            {
            // InternalMetaTemplating.g:2906:2: ( ruleInstructions )
            // InternalMetaTemplating.g:2907:3: ruleInstructions
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
    // InternalMetaTemplating.g:2916:1: rule__Iterator__ElementAssignment_2 : ( RULE_ID ) ;
    public final void rule__Iterator__ElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2920:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:2921:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:2921:2: ( RULE_ID )
            // InternalMetaTemplating.g:2922:3: RULE_ID
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


    // $ANTLR start "rule__Iterator__MetaElementAssignment_4"
    // InternalMetaTemplating.g:2931:1: rule__Iterator__MetaElementAssignment_4 : ( ruleMetaPh ) ;
    public final void rule__Iterator__MetaElementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2935:1: ( ( ruleMetaPh ) )
            // InternalMetaTemplating.g:2936:2: ( ruleMetaPh )
            {
            // InternalMetaTemplating.g:2936:2: ( ruleMetaPh )
            // InternalMetaTemplating.g:2937:3: ruleMetaPh
            {
             before(grammarAccess.getIteratorAccess().getMetaElementMetaPhParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaPh();

            state._fsp--;

             after(grammarAccess.getIteratorAccess().getMetaElementMetaPhParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Iterator__MetaElementAssignment_4"


    // $ANTLR start "rule__Iterator__SubPropertiesAssignment_5"
    // InternalMetaTemplating.g:2946:1: rule__Iterator__SubPropertiesAssignment_5 : ( ruleSubProperty ) ;
    public final void rule__Iterator__SubPropertiesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2950:1: ( ( ruleSubProperty ) )
            // InternalMetaTemplating.g:2951:2: ( ruleSubProperty )
            {
            // InternalMetaTemplating.g:2951:2: ( ruleSubProperty )
            // InternalMetaTemplating.g:2952:3: ruleSubProperty
            {
             before(grammarAccess.getIteratorAccess().getSubPropertiesSubPropertyParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSubProperty();

            state._fsp--;

             after(grammarAccess.getIteratorAccess().getSubPropertiesSubPropertyParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Iterator__SubPropertiesAssignment_5"


    // $ANTLR start "rule__Iterator__BodyAssignment_8"
    // InternalMetaTemplating.g:2961:1: rule__Iterator__BodyAssignment_8 : ( ruleInstructions ) ;
    public final void rule__Iterator__BodyAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2965:1: ( ( ruleInstructions ) )
            // InternalMetaTemplating.g:2966:2: ( ruleInstructions )
            {
            // InternalMetaTemplating.g:2966:2: ( ruleInstructions )
            // InternalMetaTemplating.g:2967:3: ruleInstructions
            {
             before(grammarAccess.getIteratorAccess().getBodyInstructionsParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleInstructions();

            state._fsp--;

             after(grammarAccess.getIteratorAccess().getBodyInstructionsParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Iterator__BodyAssignment_8"


    // $ANTLR start "rule__MetaPh__PropertyAssignment_0_1"
    // InternalMetaTemplating.g:2976:1: rule__MetaPh__PropertyAssignment_0_1 : ( ruleProperty ) ;
    public final void rule__MetaPh__PropertyAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2980:1: ( ( ruleProperty ) )
            // InternalMetaTemplating.g:2981:2: ( ruleProperty )
            {
            // InternalMetaTemplating.g:2981:2: ( ruleProperty )
            // InternalMetaTemplating.g:2982:3: ruleProperty
            {
             before(grammarAccess.getMetaPhAccess().getPropertyPropertyParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getMetaPhAccess().getPropertyPropertyParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__MetaPh__PropertyAssignment_0_1"


    // $ANTLR start "rule__MetaPh__PropertyAssignment_1_1"
    // InternalMetaTemplating.g:2991:1: rule__MetaPh__PropertyAssignment_1_1 : ( ruleProperty ) ;
    public final void rule__MetaPh__PropertyAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2995:1: ( ( ruleProperty ) )
            // InternalMetaTemplating.g:2996:2: ( ruleProperty )
            {
            // InternalMetaTemplating.g:2996:2: ( ruleProperty )
            // InternalMetaTemplating.g:2997:3: ruleProperty
            {
             before(grammarAccess.getMetaPhAccess().getPropertyPropertyParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getMetaPhAccess().getPropertyPropertyParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__MetaPh__PropertyAssignment_1_1"


    // $ANTLR start "rule__MetaPh__InfoAssignment_1_2"
    // InternalMetaTemplating.g:3006:1: rule__MetaPh__InfoAssignment_1_2 : ( ruleTagInfo ) ;
    public final void rule__MetaPh__InfoAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3010:1: ( ( ruleTagInfo ) )
            // InternalMetaTemplating.g:3011:2: ( ruleTagInfo )
            {
            // InternalMetaTemplating.g:3011:2: ( ruleTagInfo )
            // InternalMetaTemplating.g:3012:3: ruleTagInfo
            {
             before(grammarAccess.getMetaPhAccess().getInfoTagInfoParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTagInfo();

            state._fsp--;

             after(grammarAccess.getMetaPhAccess().getInfoTagInfoParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__MetaPh__InfoAssignment_1_2"


    // $ANTLR start "rule__TagInfo__TagAssignment_1"
    // InternalMetaTemplating.g:3021:1: rule__TagInfo__TagAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TagInfo__TagAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3025:1: ( ( RULE_STRING ) )
            // InternalMetaTemplating.g:3026:2: ( RULE_STRING )
            {
            // InternalMetaTemplating.g:3026:2: ( RULE_STRING )
            // InternalMetaTemplating.g:3027:3: RULE_STRING
            {
             before(grammarAccess.getTagInfoAccess().getTagSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTagInfoAccess().getTagSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__TagInfo__TagAssignment_1"


    // $ANTLR start "rule__MetaProperty__PropertyAssignment_1"
    // InternalMetaTemplating.g:3036:1: rule__MetaProperty__PropertyAssignment_1 : ( ruleProperty ) ;
    public final void rule__MetaProperty__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3040:1: ( ( ruleProperty ) )
            // InternalMetaTemplating.g:3041:2: ( ruleProperty )
            {
            // InternalMetaTemplating.g:3041:2: ( ruleProperty )
            // InternalMetaTemplating.g:3042:3: ruleProperty
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
    // InternalMetaTemplating.g:3051:1: rule__Property__PropertyAssignment_0 : ( RULE_ID ) ;
    public final void rule__Property__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3055:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:3056:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:3056:2: ( RULE_ID )
            // InternalMetaTemplating.g:3057:3: RULE_ID
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
    // InternalMetaTemplating.g:3066:1: rule__Property__SubPropertiesAssignment_1 : ( ruleSubProperty ) ;
    public final void rule__Property__SubPropertiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3070:1: ( ( ruleSubProperty ) )
            // InternalMetaTemplating.g:3071:2: ( ruleSubProperty )
            {
            // InternalMetaTemplating.g:3071:2: ( ruleSubProperty )
            // InternalMetaTemplating.g:3072:3: ruleSubProperty
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


    // $ANTLR start "rule__SubProperty__PropertyAssignment_0_1"
    // InternalMetaTemplating.g:3081:1: rule__SubProperty__PropertyAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__SubProperty__PropertyAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3085:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:3086:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:3086:2: ( RULE_ID )
            // InternalMetaTemplating.g:3087:3: RULE_ID
            {
             before(grammarAccess.getSubPropertyAccess().getPropertyIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSubPropertyAccess().getPropertyIDTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__SubProperty__PropertyAssignment_0_1"


    // $ANTLR start "rule__SubProperty__PropertyAssignment_1_1"
    // InternalMetaTemplating.g:3096:1: rule__SubProperty__PropertyAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SubProperty__PropertyAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3100:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:3101:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:3101:2: ( RULE_ID )
            // InternalMetaTemplating.g:3102:3: RULE_ID
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
    // InternalMetaTemplating.g:3111:1: rule__EscapedString__StrAssignment_1 : ( RULE_STRING ) ;
    public final void rule__EscapedString__StrAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3115:1: ( ( RULE_STRING ) )
            // InternalMetaTemplating.g:3116:2: ( RULE_STRING )
            {
            // InternalMetaTemplating.g:3116:2: ( RULE_STRING )
            // InternalMetaTemplating.g:3117:3: RULE_STRING
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
    // InternalMetaTemplating.g:3126:1: rule__Escaped__CharAssignment_1 : ( ( rule__Escaped__CharAlternatives_1_0 ) ) ;
    public final void rule__Escaped__CharAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3130:1: ( ( ( rule__Escaped__CharAlternatives_1_0 ) ) )
            // InternalMetaTemplating.g:3131:2: ( ( rule__Escaped__CharAlternatives_1_0 ) )
            {
            // InternalMetaTemplating.g:3131:2: ( ( rule__Escaped__CharAlternatives_1_0 ) )
            // InternalMetaTemplating.g:3132:3: ( rule__Escaped__CharAlternatives_1_0 )
            {
             before(grammarAccess.getEscapedAccess().getCharAlternatives_1_0()); 
            // InternalMetaTemplating.g:3133:3: ( rule__Escaped__CharAlternatives_1_0 )
            // InternalMetaTemplating.g:3133:4: rule__Escaped__CharAlternatives_1_0
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
    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\1\35\1\5\1\36\1\5\2\uffff\2\36";
    static final String dfa_3s = "\1\35\1\5\1\45\1\5\2\uffff\1\46\1\45";
    static final String dfa_4s = "\4\uffff\1\1\1\2\2\uffff";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\4\5\uffff\1\5\1\3",
            "\1\6",
            "",
            "",
            "\1\4\5\uffff\1\5\1\3\1\7",
            "\1\4\5\uffff\1\5\1\3"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "570:1: rule__Ph__Alternatives : ( ( ( rule__Ph__Group_0__0 ) ) | ( ( rule__Ph__Group_1__0 ) ) );";
        }
    }
    static final String dfa_7s = "\1\16\1\5\1\17\1\5\2\uffff\2\17";
    static final String dfa_8s = "\1\16\1\5\1\45\1\5\2\uffff\1\46\1\45";
    static final String[] dfa_9s = {
            "\1\1",
            "\1\2",
            "\1\4\23\uffff\1\5\1\uffff\1\3",
            "\1\6",
            "",
            "",
            "\1\4\23\uffff\1\5\1\uffff\1\3\1\7",
            "\1\4\23\uffff\1\5\1\uffff\1\3"
    };
    static final char[] dfa_7 = DFA.unpackEncodedStringToUnsignedChars(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final short[][] dfa_9 = unpackEncodedStringArray(dfa_9s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_7;
            this.max = dfa_8;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_9;
        }
        public String getDescription() {
            return "591:1: rule__MetaPh__Alternatives : ( ( ( rule__MetaPh__Group_0__0 ) ) | ( ( rule__MetaPh__Group_1__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000082AC004820L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000082AC004822L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000082AC006820L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008020004820L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000FFF800L});

}