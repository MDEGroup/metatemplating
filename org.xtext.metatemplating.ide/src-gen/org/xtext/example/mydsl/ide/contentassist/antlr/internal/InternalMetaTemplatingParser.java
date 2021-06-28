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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'n'", "'s'", "'t'", "'#'", "'{'", "'}'", "'['", "']'", "','", "';'", "'('", "')'", "':'", "'<'", "'>'", "'\\''", "'import'", "'IMPORT'", "'#*'", "'*#'", "'IF'", "'ELSE'", "'if'", "'else'", "'FORALL'", "'TAGGED'", "'foreach'", "'in'", "'.'", "'()'", "'[['", "']]'", "'TAGINFO'", "'.{'", "'@{'", "'}@'"
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


    // $ANTLR start "entryRuleMetaFilter"
    // InternalMetaTemplating.g:228:1: entryRuleMetaFilter : ruleMetaFilter EOF ;
    public final void entryRuleMetaFilter() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:229:1: ( ruleMetaFilter EOF )
            // InternalMetaTemplating.g:230:1: ruleMetaFilter EOF
            {
             before(grammarAccess.getMetaFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleMetaFilter();

            state._fsp--;

             after(grammarAccess.getMetaFilterRule()); 
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
    // $ANTLR end "entryRuleMetaFilter"


    // $ANTLR start "ruleMetaFilter"
    // InternalMetaTemplating.g:237:1: ruleMetaFilter : ( ( rule__MetaFilter__Group__0 ) ) ;
    public final void ruleMetaFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:241:2: ( ( ( rule__MetaFilter__Group__0 ) ) )
            // InternalMetaTemplating.g:242:2: ( ( rule__MetaFilter__Group__0 ) )
            {
            // InternalMetaTemplating.g:242:2: ( ( rule__MetaFilter__Group__0 ) )
            // InternalMetaTemplating.g:243:3: ( rule__MetaFilter__Group__0 )
            {
             before(grammarAccess.getMetaFilterAccess().getGroup()); 
            // InternalMetaTemplating.g:244:3: ( rule__MetaFilter__Group__0 )
            // InternalMetaTemplating.g:244:4: rule__MetaFilter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MetaFilter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetaFilterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetaFilter"


    // $ANTLR start "entryRuleFilter"
    // InternalMetaTemplating.g:253:1: entryRuleFilter : ruleFilter EOF ;
    public final void entryRuleFilter() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:254:1: ( ruleFilter EOF )
            // InternalMetaTemplating.g:255:1: ruleFilter EOF
            {
             before(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getFilterRule()); 
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
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalMetaTemplating.g:262:1: ruleFilter : ( ( rule__Filter__Group__0 ) ) ;
    public final void ruleFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:266:2: ( ( ( rule__Filter__Group__0 ) ) )
            // InternalMetaTemplating.g:267:2: ( ( rule__Filter__Group__0 ) )
            {
            // InternalMetaTemplating.g:267:2: ( ( rule__Filter__Group__0 ) )
            // InternalMetaTemplating.g:268:3: ( rule__Filter__Group__0 )
            {
             before(grammarAccess.getFilterAccess().getGroup()); 
            // InternalMetaTemplating.g:269:3: ( rule__Filter__Group__0 )
            // InternalMetaTemplating.g:269:4: rule__Filter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleRule"
    // InternalMetaTemplating.g:278:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:279:1: ( ruleRule EOF )
            // InternalMetaTemplating.g:280:1: ruleRule EOF
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
    // InternalMetaTemplating.g:287:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:291:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalMetaTemplating.g:292:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalMetaTemplating.g:292:2: ( ( rule__Rule__Group__0 ) )
            // InternalMetaTemplating.g:293:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalMetaTemplating.g:294:3: ( rule__Rule__Group__0 )
            // InternalMetaTemplating.g:294:4: rule__Rule__Group__0
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
    // InternalMetaTemplating.g:303:1: entryRuleIterator : ruleIterator EOF ;
    public final void entryRuleIterator() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:304:1: ( ruleIterator EOF )
            // InternalMetaTemplating.g:305:1: ruleIterator EOF
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
    // InternalMetaTemplating.g:312:1: ruleIterator : ( ( rule__Iterator__Group__0 ) ) ;
    public final void ruleIterator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:316:2: ( ( ( rule__Iterator__Group__0 ) ) )
            // InternalMetaTemplating.g:317:2: ( ( rule__Iterator__Group__0 ) )
            {
            // InternalMetaTemplating.g:317:2: ( ( rule__Iterator__Group__0 ) )
            // InternalMetaTemplating.g:318:3: ( rule__Iterator__Group__0 )
            {
             before(grammarAccess.getIteratorAccess().getGroup()); 
            // InternalMetaTemplating.g:319:3: ( rule__Iterator__Group__0 )
            // InternalMetaTemplating.g:319:4: rule__Iterator__Group__0
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
    // InternalMetaTemplating.g:328:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:329:1: ( ruleQuery EOF )
            // InternalMetaTemplating.g:330:1: ruleQuery EOF
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
    // InternalMetaTemplating.g:337:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:341:2: ( ( ( rule__Query__Group__0 ) ) )
            // InternalMetaTemplating.g:342:2: ( ( rule__Query__Group__0 ) )
            {
            // InternalMetaTemplating.g:342:2: ( ( rule__Query__Group__0 ) )
            // InternalMetaTemplating.g:343:3: ( rule__Query__Group__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup()); 
            // InternalMetaTemplating.g:344:3: ( rule__Query__Group__0 )
            // InternalMetaTemplating.g:344:4: rule__Query__Group__0
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
    // InternalMetaTemplating.g:353:1: entryRuleSubQuery : ruleSubQuery EOF ;
    public final void entryRuleSubQuery() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:354:1: ( ruleSubQuery EOF )
            // InternalMetaTemplating.g:355:1: ruleSubQuery EOF
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
    // InternalMetaTemplating.g:362:1: ruleSubQuery : ( ( rule__SubQuery__Alternatives ) ) ;
    public final void ruleSubQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:366:2: ( ( ( rule__SubQuery__Alternatives ) ) )
            // InternalMetaTemplating.g:367:2: ( ( rule__SubQuery__Alternatives ) )
            {
            // InternalMetaTemplating.g:367:2: ( ( rule__SubQuery__Alternatives ) )
            // InternalMetaTemplating.g:368:3: ( rule__SubQuery__Alternatives )
            {
             before(grammarAccess.getSubQueryAccess().getAlternatives()); 
            // InternalMetaTemplating.g:369:3: ( rule__SubQuery__Alternatives )
            // InternalMetaTemplating.g:369:4: rule__SubQuery__Alternatives
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
    // InternalMetaTemplating.g:378:1: entryRulePh : rulePh EOF ;
    public final void entryRulePh() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:379:1: ( rulePh EOF )
            // InternalMetaTemplating.g:380:1: rulePh EOF
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
    // InternalMetaTemplating.g:387:1: rulePh : ( ( rule__Ph__Group__0 ) ) ;
    public final void rulePh() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:391:2: ( ( ( rule__Ph__Group__0 ) ) )
            // InternalMetaTemplating.g:392:2: ( ( rule__Ph__Group__0 ) )
            {
            // InternalMetaTemplating.g:392:2: ( ( rule__Ph__Group__0 ) )
            // InternalMetaTemplating.g:393:3: ( rule__Ph__Group__0 )
            {
             before(grammarAccess.getPhAccess().getGroup()); 
            // InternalMetaTemplating.g:394:3: ( rule__Ph__Group__0 )
            // InternalMetaTemplating.g:394:4: rule__Ph__Group__0
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
    // InternalMetaTemplating.g:403:1: entryRuleMetaPh : ruleMetaPh EOF ;
    public final void entryRuleMetaPh() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:404:1: ( ruleMetaPh EOF )
            // InternalMetaTemplating.g:405:1: ruleMetaPh EOF
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
    // InternalMetaTemplating.g:412:1: ruleMetaPh : ( ( rule__MetaPh__Group__0 ) ) ;
    public final void ruleMetaPh() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:416:2: ( ( ( rule__MetaPh__Group__0 ) ) )
            // InternalMetaTemplating.g:417:2: ( ( rule__MetaPh__Group__0 ) )
            {
            // InternalMetaTemplating.g:417:2: ( ( rule__MetaPh__Group__0 ) )
            // InternalMetaTemplating.g:418:3: ( rule__MetaPh__Group__0 )
            {
             before(grammarAccess.getMetaPhAccess().getGroup()); 
            // InternalMetaTemplating.g:419:3: ( rule__MetaPh__Group__0 )
            // InternalMetaTemplating.g:419:4: rule__MetaPh__Group__0
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
    // InternalMetaTemplating.g:428:1: entryRuleMetaProperty : ruleMetaProperty EOF ;
    public final void entryRuleMetaProperty() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:429:1: ( ruleMetaProperty EOF )
            // InternalMetaTemplating.g:430:1: ruleMetaProperty EOF
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
    // InternalMetaTemplating.g:437:1: ruleMetaProperty : ( ( rule__MetaProperty__Group__0 ) ) ;
    public final void ruleMetaProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:441:2: ( ( ( rule__MetaProperty__Group__0 ) ) )
            // InternalMetaTemplating.g:442:2: ( ( rule__MetaProperty__Group__0 ) )
            {
            // InternalMetaTemplating.g:442:2: ( ( rule__MetaProperty__Group__0 ) )
            // InternalMetaTemplating.g:443:3: ( rule__MetaProperty__Group__0 )
            {
             before(grammarAccess.getMetaPropertyAccess().getGroup()); 
            // InternalMetaTemplating.g:444:3: ( rule__MetaProperty__Group__0 )
            // InternalMetaTemplating.g:444:4: rule__MetaProperty__Group__0
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
    // InternalMetaTemplating.g:453:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:454:1: ( ruleProperty EOF )
            // InternalMetaTemplating.g:455:1: ruleProperty EOF
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
    // InternalMetaTemplating.g:462:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:466:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalMetaTemplating.g:467:2: ( ( rule__Property__Group__0 ) )
            {
            // InternalMetaTemplating.g:467:2: ( ( rule__Property__Group__0 ) )
            // InternalMetaTemplating.g:468:3: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // InternalMetaTemplating.g:469:3: ( rule__Property__Group__0 )
            // InternalMetaTemplating.g:469:4: rule__Property__Group__0
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
    // InternalMetaTemplating.g:478:1: entryRuleSubProperty : ruleSubProperty EOF ;
    public final void entryRuleSubProperty() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:479:1: ( ruleSubProperty EOF )
            // InternalMetaTemplating.g:480:1: ruleSubProperty EOF
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
    // InternalMetaTemplating.g:487:1: ruleSubProperty : ( ( rule__SubProperty__Alternatives ) ) ;
    public final void ruleSubProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:491:2: ( ( ( rule__SubProperty__Alternatives ) ) )
            // InternalMetaTemplating.g:492:2: ( ( rule__SubProperty__Alternatives ) )
            {
            // InternalMetaTemplating.g:492:2: ( ( rule__SubProperty__Alternatives ) )
            // InternalMetaTemplating.g:493:3: ( rule__SubProperty__Alternatives )
            {
             before(grammarAccess.getSubPropertyAccess().getAlternatives()); 
            // InternalMetaTemplating.g:494:3: ( rule__SubProperty__Alternatives )
            // InternalMetaTemplating.g:494:4: rule__SubProperty__Alternatives
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
    // InternalMetaTemplating.g:503:1: entryRuleEscapedString : ruleEscapedString EOF ;
    public final void entryRuleEscapedString() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:504:1: ( ruleEscapedString EOF )
            // InternalMetaTemplating.g:505:1: ruleEscapedString EOF
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
    // InternalMetaTemplating.g:512:1: ruleEscapedString : ( ( rule__EscapedString__Group__0 ) ) ;
    public final void ruleEscapedString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:516:2: ( ( ( rule__EscapedString__Group__0 ) ) )
            // InternalMetaTemplating.g:517:2: ( ( rule__EscapedString__Group__0 ) )
            {
            // InternalMetaTemplating.g:517:2: ( ( rule__EscapedString__Group__0 ) )
            // InternalMetaTemplating.g:518:3: ( rule__EscapedString__Group__0 )
            {
             before(grammarAccess.getEscapedStringAccess().getGroup()); 
            // InternalMetaTemplating.g:519:3: ( rule__EscapedString__Group__0 )
            // InternalMetaTemplating.g:519:4: rule__EscapedString__Group__0
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
    // InternalMetaTemplating.g:528:1: entryRuleEscaped : ruleEscaped EOF ;
    public final void entryRuleEscaped() throws RecognitionException {
        try {
            // InternalMetaTemplating.g:529:1: ( ruleEscaped EOF )
            // InternalMetaTemplating.g:530:1: ruleEscaped EOF
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
    // InternalMetaTemplating.g:537:1: ruleEscaped : ( ( rule__Escaped__Group__0 ) ) ;
    public final void ruleEscaped() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:541:2: ( ( ( rule__Escaped__Group__0 ) ) )
            // InternalMetaTemplating.g:542:2: ( ( rule__Escaped__Group__0 ) )
            {
            // InternalMetaTemplating.g:542:2: ( ( rule__Escaped__Group__0 ) )
            // InternalMetaTemplating.g:543:3: ( rule__Escaped__Group__0 )
            {
             before(grammarAccess.getEscapedAccess().getGroup()); 
            // InternalMetaTemplating.g:544:3: ( rule__Escaped__Group__0 )
            // InternalMetaTemplating.g:544:4: rule__Escaped__Group__0
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
    // InternalMetaTemplating.g:552:1: rule__Instructions__Alternatives : ( ( ( rule__Instructions__NoteAssignment_0 ) ) | ( ( rule__Instructions__StatementAssignment_1 ) ) | ( ( rule__Instructions__FilterAssignment_2 ) ) | ( ( rule__Instructions__MetaFilterAssignment_3 ) ) | ( ( rule__Instructions__IteratorAssignment_4 ) ) | ( ( rule__Instructions__RuleAssignment_5 ) ) );
    public final void rule__Instructions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:556:1: ( ( ( rule__Instructions__NoteAssignment_0 ) ) | ( ( rule__Instructions__StatementAssignment_1 ) ) | ( ( rule__Instructions__FilterAssignment_2 ) ) | ( ( rule__Instructions__MetaFilterAssignment_3 ) ) | ( ( rule__Instructions__IteratorAssignment_4 ) ) | ( ( rule__Instructions__RuleAssignment_5 ) ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt1=1;
                }
                break;
            case RULE_ID:
            case 14:
            case 17:
            case 41:
            case 45:
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
            case 37:
                {
                alt1=5;
                }
                break;
            case 35:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMetaTemplating.g:557:2: ( ( rule__Instructions__NoteAssignment_0 ) )
                    {
                    // InternalMetaTemplating.g:557:2: ( ( rule__Instructions__NoteAssignment_0 ) )
                    // InternalMetaTemplating.g:558:3: ( rule__Instructions__NoteAssignment_0 )
                    {
                     before(grammarAccess.getInstructionsAccess().getNoteAssignment_0()); 
                    // InternalMetaTemplating.g:559:3: ( rule__Instructions__NoteAssignment_0 )
                    // InternalMetaTemplating.g:559:4: rule__Instructions__NoteAssignment_0
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
                    // InternalMetaTemplating.g:563:2: ( ( rule__Instructions__StatementAssignment_1 ) )
                    {
                    // InternalMetaTemplating.g:563:2: ( ( rule__Instructions__StatementAssignment_1 ) )
                    // InternalMetaTemplating.g:564:3: ( rule__Instructions__StatementAssignment_1 )
                    {
                     before(grammarAccess.getInstructionsAccess().getStatementAssignment_1()); 
                    // InternalMetaTemplating.g:565:3: ( rule__Instructions__StatementAssignment_1 )
                    // InternalMetaTemplating.g:565:4: rule__Instructions__StatementAssignment_1
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
                    // InternalMetaTemplating.g:569:2: ( ( rule__Instructions__FilterAssignment_2 ) )
                    {
                    // InternalMetaTemplating.g:569:2: ( ( rule__Instructions__FilterAssignment_2 ) )
                    // InternalMetaTemplating.g:570:3: ( rule__Instructions__FilterAssignment_2 )
                    {
                     before(grammarAccess.getInstructionsAccess().getFilterAssignment_2()); 
                    // InternalMetaTemplating.g:571:3: ( rule__Instructions__FilterAssignment_2 )
                    // InternalMetaTemplating.g:571:4: rule__Instructions__FilterAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instructions__FilterAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstructionsAccess().getFilterAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMetaTemplating.g:575:2: ( ( rule__Instructions__MetaFilterAssignment_3 ) )
                    {
                    // InternalMetaTemplating.g:575:2: ( ( rule__Instructions__MetaFilterAssignment_3 ) )
                    // InternalMetaTemplating.g:576:3: ( rule__Instructions__MetaFilterAssignment_3 )
                    {
                     before(grammarAccess.getInstructionsAccess().getMetaFilterAssignment_3()); 
                    // InternalMetaTemplating.g:577:3: ( rule__Instructions__MetaFilterAssignment_3 )
                    // InternalMetaTemplating.g:577:4: rule__Instructions__MetaFilterAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instructions__MetaFilterAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstructionsAccess().getMetaFilterAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMetaTemplating.g:581:2: ( ( rule__Instructions__IteratorAssignment_4 ) )
                    {
                    // InternalMetaTemplating.g:581:2: ( ( rule__Instructions__IteratorAssignment_4 ) )
                    // InternalMetaTemplating.g:582:3: ( rule__Instructions__IteratorAssignment_4 )
                    {
                     before(grammarAccess.getInstructionsAccess().getIteratorAssignment_4()); 
                    // InternalMetaTemplating.g:583:3: ( rule__Instructions__IteratorAssignment_4 )
                    // InternalMetaTemplating.g:583:4: rule__Instructions__IteratorAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instructions__IteratorAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstructionsAccess().getIteratorAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMetaTemplating.g:587:2: ( ( rule__Instructions__RuleAssignment_5 ) )
                    {
                    // InternalMetaTemplating.g:587:2: ( ( rule__Instructions__RuleAssignment_5 ) )
                    // InternalMetaTemplating.g:588:3: ( rule__Instructions__RuleAssignment_5 )
                    {
                     before(grammarAccess.getInstructionsAccess().getRuleAssignment_5()); 
                    // InternalMetaTemplating.g:589:3: ( rule__Instructions__RuleAssignment_5 )
                    // InternalMetaTemplating.g:589:4: rule__Instructions__RuleAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instructions__RuleAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstructionsAccess().getRuleAssignment_5()); 

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
    // InternalMetaTemplating.g:597:1: rule__Statement__Alternatives : ( ( ( rule__Statement__TextAssignment_0 ) ) | ( ( rule__Statement__CharAssignment_1 ) ) | ( ( rule__Statement__StringAssignment_2 ) ) | ( ( rule__Statement__PlaceholderAssignment_3 ) ) | ( ( rule__Statement__MetaPlaceholderAssignment_4 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:601:1: ( ( ( rule__Statement__TextAssignment_0 ) ) | ( ( rule__Statement__CharAssignment_1 ) ) | ( ( rule__Statement__StringAssignment_2 ) ) | ( ( rule__Statement__PlaceholderAssignment_3 ) ) | ( ( rule__Statement__MetaPlaceholderAssignment_4 ) ) )
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
            case 45:
                {
                alt2=3;
                }
                break;
            case 41:
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
                    // InternalMetaTemplating.g:602:2: ( ( rule__Statement__TextAssignment_0 ) )
                    {
                    // InternalMetaTemplating.g:602:2: ( ( rule__Statement__TextAssignment_0 ) )
                    // InternalMetaTemplating.g:603:3: ( rule__Statement__TextAssignment_0 )
                    {
                     before(grammarAccess.getStatementAccess().getTextAssignment_0()); 
                    // InternalMetaTemplating.g:604:3: ( rule__Statement__TextAssignment_0 )
                    // InternalMetaTemplating.g:604:4: rule__Statement__TextAssignment_0
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
                    // InternalMetaTemplating.g:608:2: ( ( rule__Statement__CharAssignment_1 ) )
                    {
                    // InternalMetaTemplating.g:608:2: ( ( rule__Statement__CharAssignment_1 ) )
                    // InternalMetaTemplating.g:609:3: ( rule__Statement__CharAssignment_1 )
                    {
                     before(grammarAccess.getStatementAccess().getCharAssignment_1()); 
                    // InternalMetaTemplating.g:610:3: ( rule__Statement__CharAssignment_1 )
                    // InternalMetaTemplating.g:610:4: rule__Statement__CharAssignment_1
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
                    // InternalMetaTemplating.g:614:2: ( ( rule__Statement__StringAssignment_2 ) )
                    {
                    // InternalMetaTemplating.g:614:2: ( ( rule__Statement__StringAssignment_2 ) )
                    // InternalMetaTemplating.g:615:3: ( rule__Statement__StringAssignment_2 )
                    {
                     before(grammarAccess.getStatementAccess().getStringAssignment_2()); 
                    // InternalMetaTemplating.g:616:3: ( rule__Statement__StringAssignment_2 )
                    // InternalMetaTemplating.g:616:4: rule__Statement__StringAssignment_2
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
                    // InternalMetaTemplating.g:620:2: ( ( rule__Statement__PlaceholderAssignment_3 ) )
                    {
                    // InternalMetaTemplating.g:620:2: ( ( rule__Statement__PlaceholderAssignment_3 ) )
                    // InternalMetaTemplating.g:621:3: ( rule__Statement__PlaceholderAssignment_3 )
                    {
                     before(grammarAccess.getStatementAccess().getPlaceholderAssignment_3()); 
                    // InternalMetaTemplating.g:622:3: ( rule__Statement__PlaceholderAssignment_3 )
                    // InternalMetaTemplating.g:622:4: rule__Statement__PlaceholderAssignment_3
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
                    // InternalMetaTemplating.g:626:2: ( ( rule__Statement__MetaPlaceholderAssignment_4 ) )
                    {
                    // InternalMetaTemplating.g:626:2: ( ( rule__Statement__MetaPlaceholderAssignment_4 ) )
                    // InternalMetaTemplating.g:627:3: ( rule__Statement__MetaPlaceholderAssignment_4 )
                    {
                     before(grammarAccess.getStatementAccess().getMetaPlaceholderAssignment_4()); 
                    // InternalMetaTemplating.g:628:3: ( rule__Statement__MetaPlaceholderAssignment_4 )
                    // InternalMetaTemplating.g:628:4: rule__Statement__MetaPlaceholderAssignment_4
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
    // InternalMetaTemplating.g:636:1: rule__Query__Alternatives_0 : ( ( ( rule__Query__ItemAssignment_0_0 ) ) | ( ( rule__Query__RefAssignment_0_1 ) ) );
    public final void rule__Query__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:640:1: ( ( ( rule__Query__ItemAssignment_0_0 ) ) | ( ( rule__Query__RefAssignment_0_1 ) ) )
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
                    // InternalMetaTemplating.g:641:2: ( ( rule__Query__ItemAssignment_0_0 ) )
                    {
                    // InternalMetaTemplating.g:641:2: ( ( rule__Query__ItemAssignment_0_0 ) )
                    // InternalMetaTemplating.g:642:3: ( rule__Query__ItemAssignment_0_0 )
                    {
                     before(grammarAccess.getQueryAccess().getItemAssignment_0_0()); 
                    // InternalMetaTemplating.g:643:3: ( rule__Query__ItemAssignment_0_0 )
                    // InternalMetaTemplating.g:643:4: rule__Query__ItemAssignment_0_0
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
                    // InternalMetaTemplating.g:647:2: ( ( rule__Query__RefAssignment_0_1 ) )
                    {
                    // InternalMetaTemplating.g:647:2: ( ( rule__Query__RefAssignment_0_1 ) )
                    // InternalMetaTemplating.g:648:3: ( rule__Query__RefAssignment_0_1 )
                    {
                     before(grammarAccess.getQueryAccess().getRefAssignment_0_1()); 
                    // InternalMetaTemplating.g:649:3: ( rule__Query__RefAssignment_0_1 )
                    // InternalMetaTemplating.g:649:4: rule__Query__RefAssignment_0_1
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
    // InternalMetaTemplating.g:657:1: rule__SubQuery__Alternatives : ( ( ( rule__SubQuery__Group_0__0 ) ) | ( ( rule__SubQuery__Group_1__0 ) ) );
    public final void rule__SubQuery__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:661:1: ( ( ( rule__SubQuery__Group_0__0 ) ) | ( ( rule__SubQuery__Group_1__0 ) ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalMetaTemplating.g:662:2: ( ( rule__SubQuery__Group_0__0 ) )
                    {
                    // InternalMetaTemplating.g:662:2: ( ( rule__SubQuery__Group_0__0 ) )
                    // InternalMetaTemplating.g:663:3: ( rule__SubQuery__Group_0__0 )
                    {
                     before(grammarAccess.getSubQueryAccess().getGroup_0()); 
                    // InternalMetaTemplating.g:664:3: ( rule__SubQuery__Group_0__0 )
                    // InternalMetaTemplating.g:664:4: rule__SubQuery__Group_0__0
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
                    // InternalMetaTemplating.g:668:2: ( ( rule__SubQuery__Group_1__0 ) )
                    {
                    // InternalMetaTemplating.g:668:2: ( ( rule__SubQuery__Group_1__0 ) )
                    // InternalMetaTemplating.g:669:3: ( rule__SubQuery__Group_1__0 )
                    {
                     before(grammarAccess.getSubQueryAccess().getGroup_1()); 
                    // InternalMetaTemplating.g:670:3: ( rule__SubQuery__Group_1__0 )
                    // InternalMetaTemplating.g:670:4: rule__SubQuery__Group_1__0
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
    // InternalMetaTemplating.g:678:1: rule__SubQuery__Alternatives_0_1 : ( ( ( rule__SubQuery__MethItemAssignment_0_1_0 ) ) | ( ( rule__SubQuery__MethRefAssignment_0_1_1 ) ) );
    public final void rule__SubQuery__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:682:1: ( ( ( rule__SubQuery__MethItemAssignment_0_1_0 ) ) | ( ( rule__SubQuery__MethRefAssignment_0_1_1 ) ) )
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
                    // InternalMetaTemplating.g:683:2: ( ( rule__SubQuery__MethItemAssignment_0_1_0 ) )
                    {
                    // InternalMetaTemplating.g:683:2: ( ( rule__SubQuery__MethItemAssignment_0_1_0 ) )
                    // InternalMetaTemplating.g:684:3: ( rule__SubQuery__MethItemAssignment_0_1_0 )
                    {
                     before(grammarAccess.getSubQueryAccess().getMethItemAssignment_0_1_0()); 
                    // InternalMetaTemplating.g:685:3: ( rule__SubQuery__MethItemAssignment_0_1_0 )
                    // InternalMetaTemplating.g:685:4: rule__SubQuery__MethItemAssignment_0_1_0
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
                    // InternalMetaTemplating.g:689:2: ( ( rule__SubQuery__MethRefAssignment_0_1_1 ) )
                    {
                    // InternalMetaTemplating.g:689:2: ( ( rule__SubQuery__MethRefAssignment_0_1_1 ) )
                    // InternalMetaTemplating.g:690:3: ( rule__SubQuery__MethRefAssignment_0_1_1 )
                    {
                     before(grammarAccess.getSubQueryAccess().getMethRefAssignment_0_1_1()); 
                    // InternalMetaTemplating.g:691:3: ( rule__SubQuery__MethRefAssignment_0_1_1 )
                    // InternalMetaTemplating.g:691:4: rule__SubQuery__MethRefAssignment_0_1_1
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
    // InternalMetaTemplating.g:699:1: rule__SubQuery__Alternatives_1_1 : ( ( ( rule__SubQuery__ItemAssignment_1_1_0 ) ) | ( ( rule__SubQuery__RefAssignment_1_1_1 ) ) );
    public final void rule__SubQuery__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:703:1: ( ( ( rule__SubQuery__ItemAssignment_1_1_0 ) ) | ( ( rule__SubQuery__RefAssignment_1_1_1 ) ) )
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
                    // InternalMetaTemplating.g:704:2: ( ( rule__SubQuery__ItemAssignment_1_1_0 ) )
                    {
                    // InternalMetaTemplating.g:704:2: ( ( rule__SubQuery__ItemAssignment_1_1_0 ) )
                    // InternalMetaTemplating.g:705:3: ( rule__SubQuery__ItemAssignment_1_1_0 )
                    {
                     before(grammarAccess.getSubQueryAccess().getItemAssignment_1_1_0()); 
                    // InternalMetaTemplating.g:706:3: ( rule__SubQuery__ItemAssignment_1_1_0 )
                    // InternalMetaTemplating.g:706:4: rule__SubQuery__ItemAssignment_1_1_0
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
                    // InternalMetaTemplating.g:710:2: ( ( rule__SubQuery__RefAssignment_1_1_1 ) )
                    {
                    // InternalMetaTemplating.g:710:2: ( ( rule__SubQuery__RefAssignment_1_1_1 ) )
                    // InternalMetaTemplating.g:711:3: ( rule__SubQuery__RefAssignment_1_1_1 )
                    {
                     before(grammarAccess.getSubQueryAccess().getRefAssignment_1_1_1()); 
                    // InternalMetaTemplating.g:712:3: ( rule__SubQuery__RefAssignment_1_1_1 )
                    // InternalMetaTemplating.g:712:4: rule__SubQuery__RefAssignment_1_1_1
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
    // InternalMetaTemplating.g:720:1: rule__SubProperty__Alternatives : ( ( ( rule__SubProperty__Group_0__0 ) ) | ( ( rule__SubProperty__Group_1__0 ) ) );
    public final void rule__SubProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:724:1: ( ( ( rule__SubProperty__Group_0__0 ) ) | ( ( rule__SubProperty__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==39) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==40) ) {
                        alt7=1;
                    }
                    else if ( (LA7_2==EOF||LA7_2==16||LA7_2==18||LA7_2==22||LA7_2==36||LA7_2==39||(LA7_2>=42 && LA7_2<=44)) ) {
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
                    // InternalMetaTemplating.g:725:2: ( ( rule__SubProperty__Group_0__0 ) )
                    {
                    // InternalMetaTemplating.g:725:2: ( ( rule__SubProperty__Group_0__0 ) )
                    // InternalMetaTemplating.g:726:3: ( rule__SubProperty__Group_0__0 )
                    {
                     before(grammarAccess.getSubPropertyAccess().getGroup_0()); 
                    // InternalMetaTemplating.g:727:3: ( rule__SubProperty__Group_0__0 )
                    // InternalMetaTemplating.g:727:4: rule__SubProperty__Group_0__0
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
                    // InternalMetaTemplating.g:731:2: ( ( rule__SubProperty__Group_1__0 ) )
                    {
                    // InternalMetaTemplating.g:731:2: ( ( rule__SubProperty__Group_1__0 ) )
                    // InternalMetaTemplating.g:732:3: ( rule__SubProperty__Group_1__0 )
                    {
                     before(grammarAccess.getSubPropertyAccess().getGroup_1()); 
                    // InternalMetaTemplating.g:733:3: ( rule__SubProperty__Group_1__0 )
                    // InternalMetaTemplating.g:733:4: rule__SubProperty__Group_1__0
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
    // InternalMetaTemplating.g:741:1: rule__Escaped__CharAlternatives_1_0 : ( ( 'n' ) | ( 's' ) | ( 't' ) | ( '#' ) | ( '{' ) | ( '}' ) | ( '[' ) | ( ']' ) | ( ',' ) | ( ';' ) | ( '(' ) | ( ')' ) | ( ':' ) | ( '<' ) | ( '>' ) | ( '\\'' ) );
    public final void rule__Escaped__CharAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:745:1: ( ( 'n' ) | ( 's' ) | ( 't' ) | ( '#' ) | ( '{' ) | ( '}' ) | ( '[' ) | ( ']' ) | ( ',' ) | ( ';' ) | ( '(' ) | ( ')' ) | ( ':' ) | ( '<' ) | ( '>' ) | ( '\\'' ) )
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
                    // InternalMetaTemplating.g:746:2: ( 'n' )
                    {
                    // InternalMetaTemplating.g:746:2: ( 'n' )
                    // InternalMetaTemplating.g:747:3: 'n'
                    {
                     before(grammarAccess.getEscapedAccess().getCharNKeyword_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharNKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaTemplating.g:752:2: ( 's' )
                    {
                    // InternalMetaTemplating.g:752:2: ( 's' )
                    // InternalMetaTemplating.g:753:3: 's'
                    {
                     before(grammarAccess.getEscapedAccess().getCharSKeyword_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharSKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMetaTemplating.g:758:2: ( 't' )
                    {
                    // InternalMetaTemplating.g:758:2: ( 't' )
                    // InternalMetaTemplating.g:759:3: 't'
                    {
                     before(grammarAccess.getEscapedAccess().getCharTKeyword_1_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharTKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMetaTemplating.g:764:2: ( '#' )
                    {
                    // InternalMetaTemplating.g:764:2: ( '#' )
                    // InternalMetaTemplating.g:765:3: '#'
                    {
                     before(grammarAccess.getEscapedAccess().getCharNumberSignKeyword_1_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharNumberSignKeyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMetaTemplating.g:770:2: ( '{' )
                    {
                    // InternalMetaTemplating.g:770:2: ( '{' )
                    // InternalMetaTemplating.g:771:3: '{'
                    {
                     before(grammarAccess.getEscapedAccess().getCharLeftCurlyBracketKeyword_1_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharLeftCurlyBracketKeyword_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMetaTemplating.g:776:2: ( '}' )
                    {
                    // InternalMetaTemplating.g:776:2: ( '}' )
                    // InternalMetaTemplating.g:777:3: '}'
                    {
                     before(grammarAccess.getEscapedAccess().getCharRightCurlyBracketKeyword_1_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharRightCurlyBracketKeyword_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMetaTemplating.g:782:2: ( '[' )
                    {
                    // InternalMetaTemplating.g:782:2: ( '[' )
                    // InternalMetaTemplating.g:783:3: '['
                    {
                     before(grammarAccess.getEscapedAccess().getCharLeftSquareBracketKeyword_1_0_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharLeftSquareBracketKeyword_1_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMetaTemplating.g:788:2: ( ']' )
                    {
                    // InternalMetaTemplating.g:788:2: ( ']' )
                    // InternalMetaTemplating.g:789:3: ']'
                    {
                     before(grammarAccess.getEscapedAccess().getCharRightSquareBracketKeyword_1_0_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharRightSquareBracketKeyword_1_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMetaTemplating.g:794:2: ( ',' )
                    {
                    // InternalMetaTemplating.g:794:2: ( ',' )
                    // InternalMetaTemplating.g:795:3: ','
                    {
                     before(grammarAccess.getEscapedAccess().getCharCommaKeyword_1_0_8()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharCommaKeyword_1_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMetaTemplating.g:800:2: ( ';' )
                    {
                    // InternalMetaTemplating.g:800:2: ( ';' )
                    // InternalMetaTemplating.g:801:3: ';'
                    {
                     before(grammarAccess.getEscapedAccess().getCharSemicolonKeyword_1_0_9()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharSemicolonKeyword_1_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMetaTemplating.g:806:2: ( '(' )
                    {
                    // InternalMetaTemplating.g:806:2: ( '(' )
                    // InternalMetaTemplating.g:807:3: '('
                    {
                     before(grammarAccess.getEscapedAccess().getCharLeftParenthesisKeyword_1_0_10()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharLeftParenthesisKeyword_1_0_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMetaTemplating.g:812:2: ( ')' )
                    {
                    // InternalMetaTemplating.g:812:2: ( ')' )
                    // InternalMetaTemplating.g:813:3: ')'
                    {
                     before(grammarAccess.getEscapedAccess().getCharRightParenthesisKeyword_1_0_11()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharRightParenthesisKeyword_1_0_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMetaTemplating.g:818:2: ( ':' )
                    {
                    // InternalMetaTemplating.g:818:2: ( ':' )
                    // InternalMetaTemplating.g:819:3: ':'
                    {
                     before(grammarAccess.getEscapedAccess().getCharColonKeyword_1_0_12()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharColonKeyword_1_0_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalMetaTemplating.g:824:2: ( '<' )
                    {
                    // InternalMetaTemplating.g:824:2: ( '<' )
                    // InternalMetaTemplating.g:825:3: '<'
                    {
                     before(grammarAccess.getEscapedAccess().getCharLessThanSignKeyword_1_0_13()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharLessThanSignKeyword_1_0_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalMetaTemplating.g:830:2: ( '>' )
                    {
                    // InternalMetaTemplating.g:830:2: ( '>' )
                    // InternalMetaTemplating.g:831:3: '>'
                    {
                     before(grammarAccess.getEscapedAccess().getCharGreaterThanSignKeyword_1_0_14()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getEscapedAccess().getCharGreaterThanSignKeyword_1_0_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalMetaTemplating.g:836:2: ( '\\'' )
                    {
                    // InternalMetaTemplating.g:836:2: ( '\\'' )
                    // InternalMetaTemplating.g:837:3: '\\''
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
    // InternalMetaTemplating.g:846:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:850:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMetaTemplating.g:851:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalMetaTemplating.g:858:1: rule__Model__Group__0__Impl : ( ( rule__Model__HeaderAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:862:1: ( ( ( rule__Model__HeaderAssignment_0 ) ) )
            // InternalMetaTemplating.g:863:1: ( ( rule__Model__HeaderAssignment_0 ) )
            {
            // InternalMetaTemplating.g:863:1: ( ( rule__Model__HeaderAssignment_0 ) )
            // InternalMetaTemplating.g:864:2: ( rule__Model__HeaderAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getHeaderAssignment_0()); 
            // InternalMetaTemplating.g:865:2: ( rule__Model__HeaderAssignment_0 )
            // InternalMetaTemplating.g:865:3: rule__Model__HeaderAssignment_0
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
    // InternalMetaTemplating.g:873:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:877:1: ( rule__Model__Group__1__Impl )
            // InternalMetaTemplating.g:878:2: rule__Model__Group__1__Impl
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
    // InternalMetaTemplating.g:884:1: rule__Model__Group__1__Impl : ( ( rule__Model__ContentAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:888:1: ( ( ( rule__Model__ContentAssignment_1 )* ) )
            // InternalMetaTemplating.g:889:1: ( ( rule__Model__ContentAssignment_1 )* )
            {
            // InternalMetaTemplating.g:889:1: ( ( rule__Model__ContentAssignment_1 )* )
            // InternalMetaTemplating.g:890:2: ( rule__Model__ContentAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getContentAssignment_1()); 
            // InternalMetaTemplating.g:891:2: ( rule__Model__ContentAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==14||LA9_0==17||LA9_0==29||LA9_0==31||LA9_0==33||LA9_0==35||LA9_0==37||LA9_0==41||LA9_0==45) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMetaTemplating.g:891:3: rule__Model__ContentAssignment_1
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
    // InternalMetaTemplating.g:900:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:904:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // InternalMetaTemplating.g:905:2: rule__Header__Group__0__Impl rule__Header__Group__1
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
    // InternalMetaTemplating.g:912:1: rule__Header__Group__0__Impl : ( () ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:916:1: ( ( () ) )
            // InternalMetaTemplating.g:917:1: ( () )
            {
            // InternalMetaTemplating.g:917:1: ( () )
            // InternalMetaTemplating.g:918:2: ()
            {
             before(grammarAccess.getHeaderAccess().getHeaderAction_0()); 
            // InternalMetaTemplating.g:919:2: ()
            // InternalMetaTemplating.g:919:3: 
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
    // InternalMetaTemplating.g:927:1: rule__Header__Group__1 : rule__Header__Group__1__Impl rule__Header__Group__2 ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:931:1: ( rule__Header__Group__1__Impl rule__Header__Group__2 )
            // InternalMetaTemplating.g:932:2: rule__Header__Group__1__Impl rule__Header__Group__2
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
    // InternalMetaTemplating.g:939:1: rule__Header__Group__1__Impl : ( ( rule__Header__LibsAssignment_1 )* ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:943:1: ( ( ( rule__Header__LibsAssignment_1 )* ) )
            // InternalMetaTemplating.g:944:1: ( ( rule__Header__LibsAssignment_1 )* )
            {
            // InternalMetaTemplating.g:944:1: ( ( rule__Header__LibsAssignment_1 )* )
            // InternalMetaTemplating.g:945:2: ( rule__Header__LibsAssignment_1 )*
            {
             before(grammarAccess.getHeaderAccess().getLibsAssignment_1()); 
            // InternalMetaTemplating.g:946:2: ( rule__Header__LibsAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMetaTemplating.g:946:3: rule__Header__LibsAssignment_1
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
    // InternalMetaTemplating.g:954:1: rule__Header__Group__2 : rule__Header__Group__2__Impl ;
    public final void rule__Header__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:958:1: ( rule__Header__Group__2__Impl )
            // InternalMetaTemplating.g:959:2: rule__Header__Group__2__Impl
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
    // InternalMetaTemplating.g:965:1: rule__Header__Group__2__Impl : ( ( rule__Header__ImportsAssignment_2 )* ) ;
    public final void rule__Header__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:969:1: ( ( ( rule__Header__ImportsAssignment_2 )* ) )
            // InternalMetaTemplating.g:970:1: ( ( rule__Header__ImportsAssignment_2 )* )
            {
            // InternalMetaTemplating.g:970:1: ( ( rule__Header__ImportsAssignment_2 )* )
            // InternalMetaTemplating.g:971:2: ( rule__Header__ImportsAssignment_2 )*
            {
             before(grammarAccess.getHeaderAccess().getImportsAssignment_2()); 
            // InternalMetaTemplating.g:972:2: ( rule__Header__ImportsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMetaTemplating.g:972:3: rule__Header__ImportsAssignment_2
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
    // InternalMetaTemplating.g:981:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:985:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMetaTemplating.g:986:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalMetaTemplating.g:993:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:997:1: ( ( 'import' ) )
            // InternalMetaTemplating.g:998:1: ( 'import' )
            {
            // InternalMetaTemplating.g:998:1: ( 'import' )
            // InternalMetaTemplating.g:999:2: 'import'
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
    // InternalMetaTemplating.g:1008:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1012:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalMetaTemplating.g:1013:2: rule__Import__Group__1__Impl rule__Import__Group__2
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
    // InternalMetaTemplating.g:1020:1: rule__Import__Group__1__Impl : ( ( rule__Import__PathAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1024:1: ( ( ( rule__Import__PathAssignment_1 ) ) )
            // InternalMetaTemplating.g:1025:1: ( ( rule__Import__PathAssignment_1 ) )
            {
            // InternalMetaTemplating.g:1025:1: ( ( rule__Import__PathAssignment_1 ) )
            // InternalMetaTemplating.g:1026:2: ( rule__Import__PathAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getPathAssignment_1()); 
            // InternalMetaTemplating.g:1027:2: ( rule__Import__PathAssignment_1 )
            // InternalMetaTemplating.g:1027:3: rule__Import__PathAssignment_1
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
    // InternalMetaTemplating.g:1035:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1039:1: ( rule__Import__Group__2__Impl )
            // InternalMetaTemplating.g:1040:2: rule__Import__Group__2__Impl
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
    // InternalMetaTemplating.g:1046:1: rule__Import__Group__2__Impl : ( ';' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1050:1: ( ( ';' ) )
            // InternalMetaTemplating.g:1051:1: ( ';' )
            {
            // InternalMetaTemplating.g:1051:1: ( ';' )
            // InternalMetaTemplating.g:1052:2: ';'
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
    // InternalMetaTemplating.g:1062:1: rule__Libraries__Group__0 : rule__Libraries__Group__0__Impl rule__Libraries__Group__1 ;
    public final void rule__Libraries__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1066:1: ( rule__Libraries__Group__0__Impl rule__Libraries__Group__1 )
            // InternalMetaTemplating.g:1067:2: rule__Libraries__Group__0__Impl rule__Libraries__Group__1
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
    // InternalMetaTemplating.g:1074:1: rule__Libraries__Group__0__Impl : ( 'IMPORT' ) ;
    public final void rule__Libraries__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1078:1: ( ( 'IMPORT' ) )
            // InternalMetaTemplating.g:1079:1: ( 'IMPORT' )
            {
            // InternalMetaTemplating.g:1079:1: ( 'IMPORT' )
            // InternalMetaTemplating.g:1080:2: 'IMPORT'
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
    // InternalMetaTemplating.g:1089:1: rule__Libraries__Group__1 : rule__Libraries__Group__1__Impl rule__Libraries__Group__2 ;
    public final void rule__Libraries__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1093:1: ( rule__Libraries__Group__1__Impl rule__Libraries__Group__2 )
            // InternalMetaTemplating.g:1094:2: rule__Libraries__Group__1__Impl rule__Libraries__Group__2
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
    // InternalMetaTemplating.g:1101:1: rule__Libraries__Group__1__Impl : ( ( rule__Libraries__PathAssignment_1 ) ) ;
    public final void rule__Libraries__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1105:1: ( ( ( rule__Libraries__PathAssignment_1 ) ) )
            // InternalMetaTemplating.g:1106:1: ( ( rule__Libraries__PathAssignment_1 ) )
            {
            // InternalMetaTemplating.g:1106:1: ( ( rule__Libraries__PathAssignment_1 ) )
            // InternalMetaTemplating.g:1107:2: ( rule__Libraries__PathAssignment_1 )
            {
             before(grammarAccess.getLibrariesAccess().getPathAssignment_1()); 
            // InternalMetaTemplating.g:1108:2: ( rule__Libraries__PathAssignment_1 )
            // InternalMetaTemplating.g:1108:3: rule__Libraries__PathAssignment_1
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
    // InternalMetaTemplating.g:1116:1: rule__Libraries__Group__2 : rule__Libraries__Group__2__Impl ;
    public final void rule__Libraries__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1120:1: ( rule__Libraries__Group__2__Impl )
            // InternalMetaTemplating.g:1121:2: rule__Libraries__Group__2__Impl
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
    // InternalMetaTemplating.g:1127:1: rule__Libraries__Group__2__Impl : ( ';' ) ;
    public final void rule__Libraries__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1131:1: ( ( ';' ) )
            // InternalMetaTemplating.g:1132:1: ( ';' )
            {
            // InternalMetaTemplating.g:1132:1: ( ';' )
            // InternalMetaTemplating.g:1133:2: ';'
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
    // InternalMetaTemplating.g:1143:1: rule__Note__Group__0 : rule__Note__Group__0__Impl rule__Note__Group__1 ;
    public final void rule__Note__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1147:1: ( rule__Note__Group__0__Impl rule__Note__Group__1 )
            // InternalMetaTemplating.g:1148:2: rule__Note__Group__0__Impl rule__Note__Group__1
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
    // InternalMetaTemplating.g:1155:1: rule__Note__Group__0__Impl : ( '#*' ) ;
    public final void rule__Note__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1159:1: ( ( '#*' ) )
            // InternalMetaTemplating.g:1160:1: ( '#*' )
            {
            // InternalMetaTemplating.g:1160:1: ( '#*' )
            // InternalMetaTemplating.g:1161:2: '#*'
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
    // InternalMetaTemplating.g:1170:1: rule__Note__Group__1 : rule__Note__Group__1__Impl rule__Note__Group__2 ;
    public final void rule__Note__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1174:1: ( rule__Note__Group__1__Impl rule__Note__Group__2 )
            // InternalMetaTemplating.g:1175:2: rule__Note__Group__1__Impl rule__Note__Group__2
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
    // InternalMetaTemplating.g:1182:1: rule__Note__Group__1__Impl : ( ( ( rule__Note__WordAssignment_1 ) ) ( ( rule__Note__WordAssignment_1 )* ) ) ;
    public final void rule__Note__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1186:1: ( ( ( ( rule__Note__WordAssignment_1 ) ) ( ( rule__Note__WordAssignment_1 )* ) ) )
            // InternalMetaTemplating.g:1187:1: ( ( ( rule__Note__WordAssignment_1 ) ) ( ( rule__Note__WordAssignment_1 )* ) )
            {
            // InternalMetaTemplating.g:1187:1: ( ( ( rule__Note__WordAssignment_1 ) ) ( ( rule__Note__WordAssignment_1 )* ) )
            // InternalMetaTemplating.g:1188:2: ( ( rule__Note__WordAssignment_1 ) ) ( ( rule__Note__WordAssignment_1 )* )
            {
            // InternalMetaTemplating.g:1188:2: ( ( rule__Note__WordAssignment_1 ) )
            // InternalMetaTemplating.g:1189:3: ( rule__Note__WordAssignment_1 )
            {
             before(grammarAccess.getNoteAccess().getWordAssignment_1()); 
            // InternalMetaTemplating.g:1190:3: ( rule__Note__WordAssignment_1 )
            // InternalMetaTemplating.g:1190:4: rule__Note__WordAssignment_1
            {
            pushFollow(FOLLOW_12);
            rule__Note__WordAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getWordAssignment_1()); 

            }

            // InternalMetaTemplating.g:1193:2: ( ( rule__Note__WordAssignment_1 )* )
            // InternalMetaTemplating.g:1194:3: ( rule__Note__WordAssignment_1 )*
            {
             before(grammarAccess.getNoteAccess().getWordAssignment_1()); 
            // InternalMetaTemplating.g:1195:3: ( rule__Note__WordAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMetaTemplating.g:1195:4: rule__Note__WordAssignment_1
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
    // InternalMetaTemplating.g:1204:1: rule__Note__Group__2 : rule__Note__Group__2__Impl ;
    public final void rule__Note__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1208:1: ( rule__Note__Group__2__Impl )
            // InternalMetaTemplating.g:1209:2: rule__Note__Group__2__Impl
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
    // InternalMetaTemplating.g:1215:1: rule__Note__Group__2__Impl : ( '*#' ) ;
    public final void rule__Note__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1219:1: ( ( '*#' ) )
            // InternalMetaTemplating.g:1220:1: ( '*#' )
            {
            // InternalMetaTemplating.g:1220:1: ( '*#' )
            // InternalMetaTemplating.g:1221:2: '*#'
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


    // $ANTLR start "rule__MetaFilter__Group__0"
    // InternalMetaTemplating.g:1231:1: rule__MetaFilter__Group__0 : rule__MetaFilter__Group__0__Impl rule__MetaFilter__Group__1 ;
    public final void rule__MetaFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1235:1: ( rule__MetaFilter__Group__0__Impl rule__MetaFilter__Group__1 )
            // InternalMetaTemplating.g:1236:2: rule__MetaFilter__Group__0__Impl rule__MetaFilter__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__MetaFilter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaFilter__Group__1();

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
    // $ANTLR end "rule__MetaFilter__Group__0"


    // $ANTLR start "rule__MetaFilter__Group__0__Impl"
    // InternalMetaTemplating.g:1243:1: rule__MetaFilter__Group__0__Impl : ( 'IF' ) ;
    public final void rule__MetaFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1247:1: ( ( 'IF' ) )
            // InternalMetaTemplating.g:1248:1: ( 'IF' )
            {
            // InternalMetaTemplating.g:1248:1: ( 'IF' )
            // InternalMetaTemplating.g:1249:2: 'IF'
            {
             before(grammarAccess.getMetaFilterAccess().getIFKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMetaFilterAccess().getIFKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaFilter__Group__0__Impl"


    // $ANTLR start "rule__MetaFilter__Group__1"
    // InternalMetaTemplating.g:1258:1: rule__MetaFilter__Group__1 : rule__MetaFilter__Group__1__Impl rule__MetaFilter__Group__2 ;
    public final void rule__MetaFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1262:1: ( rule__MetaFilter__Group__1__Impl rule__MetaFilter__Group__2 )
            // InternalMetaTemplating.g:1263:2: rule__MetaFilter__Group__1__Impl rule__MetaFilter__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__MetaFilter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaFilter__Group__2();

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
    // $ANTLR end "rule__MetaFilter__Group__1"


    // $ANTLR start "rule__MetaFilter__Group__1__Impl"
    // InternalMetaTemplating.g:1270:1: rule__MetaFilter__Group__1__Impl : ( '(' ) ;
    public final void rule__MetaFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1274:1: ( ( '(' ) )
            // InternalMetaTemplating.g:1275:1: ( '(' )
            {
            // InternalMetaTemplating.g:1275:1: ( '(' )
            // InternalMetaTemplating.g:1276:2: '('
            {
             before(grammarAccess.getMetaFilterAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMetaFilterAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaFilter__Group__1__Impl"


    // $ANTLR start "rule__MetaFilter__Group__2"
    // InternalMetaTemplating.g:1285:1: rule__MetaFilter__Group__2 : rule__MetaFilter__Group__2__Impl rule__MetaFilter__Group__3 ;
    public final void rule__MetaFilter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1289:1: ( rule__MetaFilter__Group__2__Impl rule__MetaFilter__Group__3 )
            // InternalMetaTemplating.g:1290:2: rule__MetaFilter__Group__2__Impl rule__MetaFilter__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__MetaFilter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaFilter__Group__3();

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
    // $ANTLR end "rule__MetaFilter__Group__2"


    // $ANTLR start "rule__MetaFilter__Group__2__Impl"
    // InternalMetaTemplating.g:1297:1: rule__MetaFilter__Group__2__Impl : ( ( rule__MetaFilter__ConditionAssignment_2 ) ) ;
    public final void rule__MetaFilter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1301:1: ( ( ( rule__MetaFilter__ConditionAssignment_2 ) ) )
            // InternalMetaTemplating.g:1302:1: ( ( rule__MetaFilter__ConditionAssignment_2 ) )
            {
            // InternalMetaTemplating.g:1302:1: ( ( rule__MetaFilter__ConditionAssignment_2 ) )
            // InternalMetaTemplating.g:1303:2: ( rule__MetaFilter__ConditionAssignment_2 )
            {
             before(grammarAccess.getMetaFilterAccess().getConditionAssignment_2()); 
            // InternalMetaTemplating.g:1304:2: ( rule__MetaFilter__ConditionAssignment_2 )
            // InternalMetaTemplating.g:1304:3: rule__MetaFilter__ConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MetaFilter__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMetaFilterAccess().getConditionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaFilter__Group__2__Impl"


    // $ANTLR start "rule__MetaFilter__Group__3"
    // InternalMetaTemplating.g:1312:1: rule__MetaFilter__Group__3 : rule__MetaFilter__Group__3__Impl rule__MetaFilter__Group__4 ;
    public final void rule__MetaFilter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1316:1: ( rule__MetaFilter__Group__3__Impl rule__MetaFilter__Group__4 )
            // InternalMetaTemplating.g:1317:2: rule__MetaFilter__Group__3__Impl rule__MetaFilter__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__MetaFilter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaFilter__Group__4();

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
    // $ANTLR end "rule__MetaFilter__Group__3"


    // $ANTLR start "rule__MetaFilter__Group__3__Impl"
    // InternalMetaTemplating.g:1324:1: rule__MetaFilter__Group__3__Impl : ( ')' ) ;
    public final void rule__MetaFilter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1328:1: ( ( ')' ) )
            // InternalMetaTemplating.g:1329:1: ( ')' )
            {
            // InternalMetaTemplating.g:1329:1: ( ')' )
            // InternalMetaTemplating.g:1330:2: ')'
            {
             before(grammarAccess.getMetaFilterAccess().getRightParenthesisKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMetaFilterAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaFilter__Group__3__Impl"


    // $ANTLR start "rule__MetaFilter__Group__4"
    // InternalMetaTemplating.g:1339:1: rule__MetaFilter__Group__4 : rule__MetaFilter__Group__4__Impl rule__MetaFilter__Group__5 ;
    public final void rule__MetaFilter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1343:1: ( rule__MetaFilter__Group__4__Impl rule__MetaFilter__Group__5 )
            // InternalMetaTemplating.g:1344:2: rule__MetaFilter__Group__4__Impl rule__MetaFilter__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__MetaFilter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaFilter__Group__5();

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
    // $ANTLR end "rule__MetaFilter__Group__4"


    // $ANTLR start "rule__MetaFilter__Group__4__Impl"
    // InternalMetaTemplating.g:1351:1: rule__MetaFilter__Group__4__Impl : ( '{' ) ;
    public final void rule__MetaFilter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1355:1: ( ( '{' ) )
            // InternalMetaTemplating.g:1356:1: ( '{' )
            {
            // InternalMetaTemplating.g:1356:1: ( '{' )
            // InternalMetaTemplating.g:1357:2: '{'
            {
             before(grammarAccess.getMetaFilterAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMetaFilterAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaFilter__Group__4__Impl"


    // $ANTLR start "rule__MetaFilter__Group__5"
    // InternalMetaTemplating.g:1366:1: rule__MetaFilter__Group__5 : rule__MetaFilter__Group__5__Impl rule__MetaFilter__Group__6 ;
    public final void rule__MetaFilter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1370:1: ( rule__MetaFilter__Group__5__Impl rule__MetaFilter__Group__6 )
            // InternalMetaTemplating.g:1371:2: rule__MetaFilter__Group__5__Impl rule__MetaFilter__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__MetaFilter__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaFilter__Group__6();

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
    // $ANTLR end "rule__MetaFilter__Group__5"


    // $ANTLR start "rule__MetaFilter__Group__5__Impl"
    // InternalMetaTemplating.g:1378:1: rule__MetaFilter__Group__5__Impl : ( ( rule__MetaFilter__TruebodyAssignment_5 )* ) ;
    public final void rule__MetaFilter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1382:1: ( ( ( rule__MetaFilter__TruebodyAssignment_5 )* ) )
            // InternalMetaTemplating.g:1383:1: ( ( rule__MetaFilter__TruebodyAssignment_5 )* )
            {
            // InternalMetaTemplating.g:1383:1: ( ( rule__MetaFilter__TruebodyAssignment_5 )* )
            // InternalMetaTemplating.g:1384:2: ( rule__MetaFilter__TruebodyAssignment_5 )*
            {
             before(grammarAccess.getMetaFilterAccess().getTruebodyAssignment_5()); 
            // InternalMetaTemplating.g:1385:2: ( rule__MetaFilter__TruebodyAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==14||LA13_0==17||LA13_0==29||LA13_0==31||LA13_0==33||LA13_0==35||LA13_0==37||LA13_0==41||LA13_0==45) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMetaTemplating.g:1385:3: rule__MetaFilter__TruebodyAssignment_5
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__MetaFilter__TruebodyAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMetaFilterAccess().getTruebodyAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaFilter__Group__5__Impl"


    // $ANTLR start "rule__MetaFilter__Group__6"
    // InternalMetaTemplating.g:1393:1: rule__MetaFilter__Group__6 : rule__MetaFilter__Group__6__Impl rule__MetaFilter__Group__7 ;
    public final void rule__MetaFilter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1397:1: ( rule__MetaFilter__Group__6__Impl rule__MetaFilter__Group__7 )
            // InternalMetaTemplating.g:1398:2: rule__MetaFilter__Group__6__Impl rule__MetaFilter__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__MetaFilter__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaFilter__Group__7();

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
    // $ANTLR end "rule__MetaFilter__Group__6"


    // $ANTLR start "rule__MetaFilter__Group__6__Impl"
    // InternalMetaTemplating.g:1405:1: rule__MetaFilter__Group__6__Impl : ( '}' ) ;
    public final void rule__MetaFilter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1409:1: ( ( '}' ) )
            // InternalMetaTemplating.g:1410:1: ( '}' )
            {
            // InternalMetaTemplating.g:1410:1: ( '}' )
            // InternalMetaTemplating.g:1411:2: '}'
            {
             before(grammarAccess.getMetaFilterAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMetaFilterAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaFilter__Group__6__Impl"


    // $ANTLR start "rule__MetaFilter__Group__7"
    // InternalMetaTemplating.g:1420:1: rule__MetaFilter__Group__7 : rule__MetaFilter__Group__7__Impl ;
    public final void rule__MetaFilter__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1424:1: ( rule__MetaFilter__Group__7__Impl )
            // InternalMetaTemplating.g:1425:2: rule__MetaFilter__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MetaFilter__Group__7__Impl();

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
    // $ANTLR end "rule__MetaFilter__Group__7"


    // $ANTLR start "rule__MetaFilter__Group__7__Impl"
    // InternalMetaTemplating.g:1431:1: rule__MetaFilter__Group__7__Impl : ( ( rule__MetaFilter__Group_7__0 )? ) ;
    public final void rule__MetaFilter__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1435:1: ( ( ( rule__MetaFilter__Group_7__0 )? ) )
            // InternalMetaTemplating.g:1436:1: ( ( rule__MetaFilter__Group_7__0 )? )
            {
            // InternalMetaTemplating.g:1436:1: ( ( rule__MetaFilter__Group_7__0 )? )
            // InternalMetaTemplating.g:1437:2: ( rule__MetaFilter__Group_7__0 )?
            {
             before(grammarAccess.getMetaFilterAccess().getGroup_7()); 
            // InternalMetaTemplating.g:1438:2: ( rule__MetaFilter__Group_7__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMetaTemplating.g:1438:3: rule__MetaFilter__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MetaFilter__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMetaFilterAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaFilter__Group__7__Impl"


    // $ANTLR start "rule__MetaFilter__Group_7__0"
    // InternalMetaTemplating.g:1447:1: rule__MetaFilter__Group_7__0 : rule__MetaFilter__Group_7__0__Impl rule__MetaFilter__Group_7__1 ;
    public final void rule__MetaFilter__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1451:1: ( rule__MetaFilter__Group_7__0__Impl rule__MetaFilter__Group_7__1 )
            // InternalMetaTemplating.g:1452:2: rule__MetaFilter__Group_7__0__Impl rule__MetaFilter__Group_7__1
            {
            pushFollow(FOLLOW_15);
            rule__MetaFilter__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaFilter__Group_7__1();

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
    // $ANTLR end "rule__MetaFilter__Group_7__0"


    // $ANTLR start "rule__MetaFilter__Group_7__0__Impl"
    // InternalMetaTemplating.g:1459:1: rule__MetaFilter__Group_7__0__Impl : ( 'ELSE' ) ;
    public final void rule__MetaFilter__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1463:1: ( ( 'ELSE' ) )
            // InternalMetaTemplating.g:1464:1: ( 'ELSE' )
            {
            // InternalMetaTemplating.g:1464:1: ( 'ELSE' )
            // InternalMetaTemplating.g:1465:2: 'ELSE'
            {
             before(grammarAccess.getMetaFilterAccess().getELSEKeyword_7_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMetaFilterAccess().getELSEKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaFilter__Group_7__0__Impl"


    // $ANTLR start "rule__MetaFilter__Group_7__1"
    // InternalMetaTemplating.g:1474:1: rule__MetaFilter__Group_7__1 : rule__MetaFilter__Group_7__1__Impl rule__MetaFilter__Group_7__2 ;
    public final void rule__MetaFilter__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1478:1: ( rule__MetaFilter__Group_7__1__Impl rule__MetaFilter__Group_7__2 )
            // InternalMetaTemplating.g:1479:2: rule__MetaFilter__Group_7__1__Impl rule__MetaFilter__Group_7__2
            {
            pushFollow(FOLLOW_16);
            rule__MetaFilter__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaFilter__Group_7__2();

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
    // $ANTLR end "rule__MetaFilter__Group_7__1"


    // $ANTLR start "rule__MetaFilter__Group_7__1__Impl"
    // InternalMetaTemplating.g:1486:1: rule__MetaFilter__Group_7__1__Impl : ( '{' ) ;
    public final void rule__MetaFilter__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1490:1: ( ( '{' ) )
            // InternalMetaTemplating.g:1491:1: ( '{' )
            {
            // InternalMetaTemplating.g:1491:1: ( '{' )
            // InternalMetaTemplating.g:1492:2: '{'
            {
             before(grammarAccess.getMetaFilterAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMetaFilterAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaFilter__Group_7__1__Impl"


    // $ANTLR start "rule__MetaFilter__Group_7__2"
    // InternalMetaTemplating.g:1501:1: rule__MetaFilter__Group_7__2 : rule__MetaFilter__Group_7__2__Impl rule__MetaFilter__Group_7__3 ;
    public final void rule__MetaFilter__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1505:1: ( rule__MetaFilter__Group_7__2__Impl rule__MetaFilter__Group_7__3 )
            // InternalMetaTemplating.g:1506:2: rule__MetaFilter__Group_7__2__Impl rule__MetaFilter__Group_7__3
            {
            pushFollow(FOLLOW_16);
            rule__MetaFilter__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaFilter__Group_7__3();

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
    // $ANTLR end "rule__MetaFilter__Group_7__2"


    // $ANTLR start "rule__MetaFilter__Group_7__2__Impl"
    // InternalMetaTemplating.g:1513:1: rule__MetaFilter__Group_7__2__Impl : ( ( rule__MetaFilter__FalsebodyAssignment_7_2 )* ) ;
    public final void rule__MetaFilter__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1517:1: ( ( ( rule__MetaFilter__FalsebodyAssignment_7_2 )* ) )
            // InternalMetaTemplating.g:1518:1: ( ( rule__MetaFilter__FalsebodyAssignment_7_2 )* )
            {
            // InternalMetaTemplating.g:1518:1: ( ( rule__MetaFilter__FalsebodyAssignment_7_2 )* )
            // InternalMetaTemplating.g:1519:2: ( rule__MetaFilter__FalsebodyAssignment_7_2 )*
            {
             before(grammarAccess.getMetaFilterAccess().getFalsebodyAssignment_7_2()); 
            // InternalMetaTemplating.g:1520:2: ( rule__MetaFilter__FalsebodyAssignment_7_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==14||LA15_0==17||LA15_0==29||LA15_0==31||LA15_0==33||LA15_0==35||LA15_0==37||LA15_0==41||LA15_0==45) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMetaTemplating.g:1520:3: rule__MetaFilter__FalsebodyAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__MetaFilter__FalsebodyAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getMetaFilterAccess().getFalsebodyAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaFilter__Group_7__2__Impl"


    // $ANTLR start "rule__MetaFilter__Group_7__3"
    // InternalMetaTemplating.g:1528:1: rule__MetaFilter__Group_7__3 : rule__MetaFilter__Group_7__3__Impl ;
    public final void rule__MetaFilter__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1532:1: ( rule__MetaFilter__Group_7__3__Impl )
            // InternalMetaTemplating.g:1533:2: rule__MetaFilter__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MetaFilter__Group_7__3__Impl();

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
    // $ANTLR end "rule__MetaFilter__Group_7__3"


    // $ANTLR start "rule__MetaFilter__Group_7__3__Impl"
    // InternalMetaTemplating.g:1539:1: rule__MetaFilter__Group_7__3__Impl : ( '}' ) ;
    public final void rule__MetaFilter__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1543:1: ( ( '}' ) )
            // InternalMetaTemplating.g:1544:1: ( '}' )
            {
            // InternalMetaTemplating.g:1544:1: ( '}' )
            // InternalMetaTemplating.g:1545:2: '}'
            {
             before(grammarAccess.getMetaFilterAccess().getRightCurlyBracketKeyword_7_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMetaFilterAccess().getRightCurlyBracketKeyword_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaFilter__Group_7__3__Impl"


    // $ANTLR start "rule__Filter__Group__0"
    // InternalMetaTemplating.g:1555:1: rule__Filter__Group__0 : rule__Filter__Group__0__Impl rule__Filter__Group__1 ;
    public final void rule__Filter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1559:1: ( rule__Filter__Group__0__Impl rule__Filter__Group__1 )
            // InternalMetaTemplating.g:1560:2: rule__Filter__Group__0__Impl rule__Filter__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Filter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__1();

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
    // $ANTLR end "rule__Filter__Group__0"


    // $ANTLR start "rule__Filter__Group__0__Impl"
    // InternalMetaTemplating.g:1567:1: rule__Filter__Group__0__Impl : ( 'if' ) ;
    public final void rule__Filter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1571:1: ( ( 'if' ) )
            // InternalMetaTemplating.g:1572:1: ( 'if' )
            {
            // InternalMetaTemplating.g:1572:1: ( 'if' )
            // InternalMetaTemplating.g:1573:2: 'if'
            {
             before(grammarAccess.getFilterAccess().getIfKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__0__Impl"


    // $ANTLR start "rule__Filter__Group__1"
    // InternalMetaTemplating.g:1582:1: rule__Filter__Group__1 : rule__Filter__Group__1__Impl rule__Filter__Group__2 ;
    public final void rule__Filter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1586:1: ( rule__Filter__Group__1__Impl rule__Filter__Group__2 )
            // InternalMetaTemplating.g:1587:2: rule__Filter__Group__1__Impl rule__Filter__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Filter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__2();

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
    // $ANTLR end "rule__Filter__Group__1"


    // $ANTLR start "rule__Filter__Group__1__Impl"
    // InternalMetaTemplating.g:1594:1: rule__Filter__Group__1__Impl : ( '(' ) ;
    public final void rule__Filter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1598:1: ( ( '(' ) )
            // InternalMetaTemplating.g:1599:1: ( '(' )
            {
            // InternalMetaTemplating.g:1599:1: ( '(' )
            // InternalMetaTemplating.g:1600:2: '('
            {
             before(grammarAccess.getFilterAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__1__Impl"


    // $ANTLR start "rule__Filter__Group__2"
    // InternalMetaTemplating.g:1609:1: rule__Filter__Group__2 : rule__Filter__Group__2__Impl rule__Filter__Group__3 ;
    public final void rule__Filter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1613:1: ( rule__Filter__Group__2__Impl rule__Filter__Group__3 )
            // InternalMetaTemplating.g:1614:2: rule__Filter__Group__2__Impl rule__Filter__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Filter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__3();

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
    // $ANTLR end "rule__Filter__Group__2"


    // $ANTLR start "rule__Filter__Group__2__Impl"
    // InternalMetaTemplating.g:1621:1: rule__Filter__Group__2__Impl : ( ( rule__Filter__ConditionAssignment_2 ) ) ;
    public final void rule__Filter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1625:1: ( ( ( rule__Filter__ConditionAssignment_2 ) ) )
            // InternalMetaTemplating.g:1626:1: ( ( rule__Filter__ConditionAssignment_2 ) )
            {
            // InternalMetaTemplating.g:1626:1: ( ( rule__Filter__ConditionAssignment_2 ) )
            // InternalMetaTemplating.g:1627:2: ( rule__Filter__ConditionAssignment_2 )
            {
             before(grammarAccess.getFilterAccess().getConditionAssignment_2()); 
            // InternalMetaTemplating.g:1628:2: ( rule__Filter__ConditionAssignment_2 )
            // InternalMetaTemplating.g:1628:3: rule__Filter__ConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Filter__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getConditionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__2__Impl"


    // $ANTLR start "rule__Filter__Group__3"
    // InternalMetaTemplating.g:1636:1: rule__Filter__Group__3 : rule__Filter__Group__3__Impl rule__Filter__Group__4 ;
    public final void rule__Filter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1640:1: ( rule__Filter__Group__3__Impl rule__Filter__Group__4 )
            // InternalMetaTemplating.g:1641:2: rule__Filter__Group__3__Impl rule__Filter__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Filter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__4();

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
    // $ANTLR end "rule__Filter__Group__3"


    // $ANTLR start "rule__Filter__Group__3__Impl"
    // InternalMetaTemplating.g:1648:1: rule__Filter__Group__3__Impl : ( ')' ) ;
    public final void rule__Filter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1652:1: ( ( ')' ) )
            // InternalMetaTemplating.g:1653:1: ( ')' )
            {
            // InternalMetaTemplating.g:1653:1: ( ')' )
            // InternalMetaTemplating.g:1654:2: ')'
            {
             before(grammarAccess.getFilterAccess().getRightParenthesisKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__3__Impl"


    // $ANTLR start "rule__Filter__Group__4"
    // InternalMetaTemplating.g:1663:1: rule__Filter__Group__4 : rule__Filter__Group__4__Impl rule__Filter__Group__5 ;
    public final void rule__Filter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1667:1: ( rule__Filter__Group__4__Impl rule__Filter__Group__5 )
            // InternalMetaTemplating.g:1668:2: rule__Filter__Group__4__Impl rule__Filter__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Filter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__5();

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
    // $ANTLR end "rule__Filter__Group__4"


    // $ANTLR start "rule__Filter__Group__4__Impl"
    // InternalMetaTemplating.g:1675:1: rule__Filter__Group__4__Impl : ( '{' ) ;
    public final void rule__Filter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1679:1: ( ( '{' ) )
            // InternalMetaTemplating.g:1680:1: ( '{' )
            {
            // InternalMetaTemplating.g:1680:1: ( '{' )
            // InternalMetaTemplating.g:1681:2: '{'
            {
             before(grammarAccess.getFilterAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__4__Impl"


    // $ANTLR start "rule__Filter__Group__5"
    // InternalMetaTemplating.g:1690:1: rule__Filter__Group__5 : rule__Filter__Group__5__Impl rule__Filter__Group__6 ;
    public final void rule__Filter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1694:1: ( rule__Filter__Group__5__Impl rule__Filter__Group__6 )
            // InternalMetaTemplating.g:1695:2: rule__Filter__Group__5__Impl rule__Filter__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Filter__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__6();

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
    // $ANTLR end "rule__Filter__Group__5"


    // $ANTLR start "rule__Filter__Group__5__Impl"
    // InternalMetaTemplating.g:1702:1: rule__Filter__Group__5__Impl : ( ( rule__Filter__TruebodyAssignment_5 )* ) ;
    public final void rule__Filter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1706:1: ( ( ( rule__Filter__TruebodyAssignment_5 )* ) )
            // InternalMetaTemplating.g:1707:1: ( ( rule__Filter__TruebodyAssignment_5 )* )
            {
            // InternalMetaTemplating.g:1707:1: ( ( rule__Filter__TruebodyAssignment_5 )* )
            // InternalMetaTemplating.g:1708:2: ( rule__Filter__TruebodyAssignment_5 )*
            {
             before(grammarAccess.getFilterAccess().getTruebodyAssignment_5()); 
            // InternalMetaTemplating.g:1709:2: ( rule__Filter__TruebodyAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==14||LA16_0==17||LA16_0==29||LA16_0==31||LA16_0==33||LA16_0==35||LA16_0==37||LA16_0==41||LA16_0==45) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMetaTemplating.g:1709:3: rule__Filter__TruebodyAssignment_5
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Filter__TruebodyAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getFilterAccess().getTruebodyAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__5__Impl"


    // $ANTLR start "rule__Filter__Group__6"
    // InternalMetaTemplating.g:1717:1: rule__Filter__Group__6 : rule__Filter__Group__6__Impl rule__Filter__Group__7 ;
    public final void rule__Filter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1721:1: ( rule__Filter__Group__6__Impl rule__Filter__Group__7 )
            // InternalMetaTemplating.g:1722:2: rule__Filter__Group__6__Impl rule__Filter__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__Filter__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__7();

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
    // $ANTLR end "rule__Filter__Group__6"


    // $ANTLR start "rule__Filter__Group__6__Impl"
    // InternalMetaTemplating.g:1729:1: rule__Filter__Group__6__Impl : ( '}' ) ;
    public final void rule__Filter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1733:1: ( ( '}' ) )
            // InternalMetaTemplating.g:1734:1: ( '}' )
            {
            // InternalMetaTemplating.g:1734:1: ( '}' )
            // InternalMetaTemplating.g:1735:2: '}'
            {
             before(grammarAccess.getFilterAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__6__Impl"


    // $ANTLR start "rule__Filter__Group__7"
    // InternalMetaTemplating.g:1744:1: rule__Filter__Group__7 : rule__Filter__Group__7__Impl ;
    public final void rule__Filter__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1748:1: ( rule__Filter__Group__7__Impl )
            // InternalMetaTemplating.g:1749:2: rule__Filter__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Group__7__Impl();

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
    // $ANTLR end "rule__Filter__Group__7"


    // $ANTLR start "rule__Filter__Group__7__Impl"
    // InternalMetaTemplating.g:1755:1: rule__Filter__Group__7__Impl : ( ( rule__Filter__Group_7__0 )? ) ;
    public final void rule__Filter__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1759:1: ( ( ( rule__Filter__Group_7__0 )? ) )
            // InternalMetaTemplating.g:1760:1: ( ( rule__Filter__Group_7__0 )? )
            {
            // InternalMetaTemplating.g:1760:1: ( ( rule__Filter__Group_7__0 )? )
            // InternalMetaTemplating.g:1761:2: ( rule__Filter__Group_7__0 )?
            {
             before(grammarAccess.getFilterAccess().getGroup_7()); 
            // InternalMetaTemplating.g:1762:2: ( rule__Filter__Group_7__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMetaTemplating.g:1762:3: rule__Filter__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Filter__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilterAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__7__Impl"


    // $ANTLR start "rule__Filter__Group_7__0"
    // InternalMetaTemplating.g:1771:1: rule__Filter__Group_7__0 : rule__Filter__Group_7__0__Impl rule__Filter__Group_7__1 ;
    public final void rule__Filter__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1775:1: ( rule__Filter__Group_7__0__Impl rule__Filter__Group_7__1 )
            // InternalMetaTemplating.g:1776:2: rule__Filter__Group_7__0__Impl rule__Filter__Group_7__1
            {
            pushFollow(FOLLOW_15);
            rule__Filter__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group_7__1();

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
    // $ANTLR end "rule__Filter__Group_7__0"


    // $ANTLR start "rule__Filter__Group_7__0__Impl"
    // InternalMetaTemplating.g:1783:1: rule__Filter__Group_7__0__Impl : ( 'else' ) ;
    public final void rule__Filter__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1787:1: ( ( 'else' ) )
            // InternalMetaTemplating.g:1788:1: ( 'else' )
            {
            // InternalMetaTemplating.g:1788:1: ( 'else' )
            // InternalMetaTemplating.g:1789:2: 'else'
            {
             before(grammarAccess.getFilterAccess().getElseKeyword_7_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getElseKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group_7__0__Impl"


    // $ANTLR start "rule__Filter__Group_7__1"
    // InternalMetaTemplating.g:1798:1: rule__Filter__Group_7__1 : rule__Filter__Group_7__1__Impl rule__Filter__Group_7__2 ;
    public final void rule__Filter__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1802:1: ( rule__Filter__Group_7__1__Impl rule__Filter__Group_7__2 )
            // InternalMetaTemplating.g:1803:2: rule__Filter__Group_7__1__Impl rule__Filter__Group_7__2
            {
            pushFollow(FOLLOW_16);
            rule__Filter__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group_7__2();

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
    // $ANTLR end "rule__Filter__Group_7__1"


    // $ANTLR start "rule__Filter__Group_7__1__Impl"
    // InternalMetaTemplating.g:1810:1: rule__Filter__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Filter__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1814:1: ( ( '{' ) )
            // InternalMetaTemplating.g:1815:1: ( '{' )
            {
            // InternalMetaTemplating.g:1815:1: ( '{' )
            // InternalMetaTemplating.g:1816:2: '{'
            {
             before(grammarAccess.getFilterAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group_7__1__Impl"


    // $ANTLR start "rule__Filter__Group_7__2"
    // InternalMetaTemplating.g:1825:1: rule__Filter__Group_7__2 : rule__Filter__Group_7__2__Impl rule__Filter__Group_7__3 ;
    public final void rule__Filter__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1829:1: ( rule__Filter__Group_7__2__Impl rule__Filter__Group_7__3 )
            // InternalMetaTemplating.g:1830:2: rule__Filter__Group_7__2__Impl rule__Filter__Group_7__3
            {
            pushFollow(FOLLOW_16);
            rule__Filter__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group_7__3();

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
    // $ANTLR end "rule__Filter__Group_7__2"


    // $ANTLR start "rule__Filter__Group_7__2__Impl"
    // InternalMetaTemplating.g:1837:1: rule__Filter__Group_7__2__Impl : ( ( rule__Filter__FalsebodyAssignment_7_2 )* ) ;
    public final void rule__Filter__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1841:1: ( ( ( rule__Filter__FalsebodyAssignment_7_2 )* ) )
            // InternalMetaTemplating.g:1842:1: ( ( rule__Filter__FalsebodyAssignment_7_2 )* )
            {
            // InternalMetaTemplating.g:1842:1: ( ( rule__Filter__FalsebodyAssignment_7_2 )* )
            // InternalMetaTemplating.g:1843:2: ( rule__Filter__FalsebodyAssignment_7_2 )*
            {
             before(grammarAccess.getFilterAccess().getFalsebodyAssignment_7_2()); 
            // InternalMetaTemplating.g:1844:2: ( rule__Filter__FalsebodyAssignment_7_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||LA18_0==14||LA18_0==17||LA18_0==29||LA18_0==31||LA18_0==33||LA18_0==35||LA18_0==37||LA18_0==41||LA18_0==45) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMetaTemplating.g:1844:3: rule__Filter__FalsebodyAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Filter__FalsebodyAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getFilterAccess().getFalsebodyAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group_7__2__Impl"


    // $ANTLR start "rule__Filter__Group_7__3"
    // InternalMetaTemplating.g:1852:1: rule__Filter__Group_7__3 : rule__Filter__Group_7__3__Impl ;
    public final void rule__Filter__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1856:1: ( rule__Filter__Group_7__3__Impl )
            // InternalMetaTemplating.g:1857:2: rule__Filter__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Group_7__3__Impl();

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
    // $ANTLR end "rule__Filter__Group_7__3"


    // $ANTLR start "rule__Filter__Group_7__3__Impl"
    // InternalMetaTemplating.g:1863:1: rule__Filter__Group_7__3__Impl : ( '}' ) ;
    public final void rule__Filter__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1867:1: ( ( '}' ) )
            // InternalMetaTemplating.g:1868:1: ( '}' )
            {
            // InternalMetaTemplating.g:1868:1: ( '}' )
            // InternalMetaTemplating.g:1869:2: '}'
            {
             before(grammarAccess.getFilterAccess().getRightCurlyBracketKeyword_7_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getRightCurlyBracketKeyword_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group_7__3__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalMetaTemplating.g:1879:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1883:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalMetaTemplating.g:1884:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalMetaTemplating.g:1891:1: rule__Rule__Group__0__Impl : ( 'FORALL' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1895:1: ( ( 'FORALL' ) )
            // InternalMetaTemplating.g:1896:1: ( 'FORALL' )
            {
            // InternalMetaTemplating.g:1896:1: ( 'FORALL' )
            // InternalMetaTemplating.g:1897:2: 'FORALL'
            {
             before(grammarAccess.getRuleAccess().getFORALLKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMetaTemplating.g:1906:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1910:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalMetaTemplating.g:1911:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalMetaTemplating.g:1918:1: rule__Rule__Group__1__Impl : ( '(' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1922:1: ( ( '(' ) )
            // InternalMetaTemplating.g:1923:1: ( '(' )
            {
            // InternalMetaTemplating.g:1923:1: ( '(' )
            // InternalMetaTemplating.g:1924:2: '('
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
    // InternalMetaTemplating.g:1933:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1937:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalMetaTemplating.g:1938:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalMetaTemplating.g:1945:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__ElementAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1949:1: ( ( ( rule__Rule__ElementAssignment_2 ) ) )
            // InternalMetaTemplating.g:1950:1: ( ( rule__Rule__ElementAssignment_2 ) )
            {
            // InternalMetaTemplating.g:1950:1: ( ( rule__Rule__ElementAssignment_2 ) )
            // InternalMetaTemplating.g:1951:2: ( rule__Rule__ElementAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getElementAssignment_2()); 
            // InternalMetaTemplating.g:1952:2: ( rule__Rule__ElementAssignment_2 )
            // InternalMetaTemplating.g:1952:3: rule__Rule__ElementAssignment_2
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
    // InternalMetaTemplating.g:1960:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1964:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalMetaTemplating.g:1965:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
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
    // InternalMetaTemplating.g:1972:1: rule__Rule__Group__3__Impl : ( ':' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1976:1: ( ( ':' ) )
            // InternalMetaTemplating.g:1977:1: ( ':' )
            {
            // InternalMetaTemplating.g:1977:1: ( ':' )
            // InternalMetaTemplating.g:1978:2: ':'
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
    // InternalMetaTemplating.g:1987:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:1991:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalMetaTemplating.g:1992:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalMetaTemplating.g:1999:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__PropertyAssignment_4 ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2003:1: ( ( ( rule__Rule__PropertyAssignment_4 ) ) )
            // InternalMetaTemplating.g:2004:1: ( ( rule__Rule__PropertyAssignment_4 ) )
            {
            // InternalMetaTemplating.g:2004:1: ( ( rule__Rule__PropertyAssignment_4 ) )
            // InternalMetaTemplating.g:2005:2: ( rule__Rule__PropertyAssignment_4 )
            {
             before(grammarAccess.getRuleAccess().getPropertyAssignment_4()); 
            // InternalMetaTemplating.g:2006:2: ( rule__Rule__PropertyAssignment_4 )
            // InternalMetaTemplating.g:2006:3: rule__Rule__PropertyAssignment_4
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
    // InternalMetaTemplating.g:2014:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2018:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalMetaTemplating.g:2019:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
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
    // InternalMetaTemplating.g:2026:1: rule__Rule__Group__5__Impl : ( 'TAGGED' ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2030:1: ( ( 'TAGGED' ) )
            // InternalMetaTemplating.g:2031:1: ( 'TAGGED' )
            {
            // InternalMetaTemplating.g:2031:1: ( 'TAGGED' )
            // InternalMetaTemplating.g:2032:2: 'TAGGED'
            {
             before(grammarAccess.getRuleAccess().getTAGGEDKeyword_5()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMetaTemplating.g:2041:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2045:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // InternalMetaTemplating.g:2046:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_14);
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
    // InternalMetaTemplating.g:2053:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__TagAssignment_6 ) ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2057:1: ( ( ( rule__Rule__TagAssignment_6 ) ) )
            // InternalMetaTemplating.g:2058:1: ( ( rule__Rule__TagAssignment_6 ) )
            {
            // InternalMetaTemplating.g:2058:1: ( ( rule__Rule__TagAssignment_6 ) )
            // InternalMetaTemplating.g:2059:2: ( rule__Rule__TagAssignment_6 )
            {
             before(grammarAccess.getRuleAccess().getTagAssignment_6()); 
            // InternalMetaTemplating.g:2060:2: ( rule__Rule__TagAssignment_6 )
            // InternalMetaTemplating.g:2060:3: rule__Rule__TagAssignment_6
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
    // InternalMetaTemplating.g:2068:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl rule__Rule__Group__8 ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2072:1: ( rule__Rule__Group__7__Impl rule__Rule__Group__8 )
            // InternalMetaTemplating.g:2073:2: rule__Rule__Group__7__Impl rule__Rule__Group__8
            {
            pushFollow(FOLLOW_15);
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
    // InternalMetaTemplating.g:2080:1: rule__Rule__Group__7__Impl : ( ')' ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2084:1: ( ( ')' ) )
            // InternalMetaTemplating.g:2085:1: ( ')' )
            {
            // InternalMetaTemplating.g:2085:1: ( ')' )
            // InternalMetaTemplating.g:2086:2: ')'
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
    // InternalMetaTemplating.g:2095:1: rule__Rule__Group__8 : rule__Rule__Group__8__Impl rule__Rule__Group__9 ;
    public final void rule__Rule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2099:1: ( rule__Rule__Group__8__Impl rule__Rule__Group__9 )
            // InternalMetaTemplating.g:2100:2: rule__Rule__Group__8__Impl rule__Rule__Group__9
            {
            pushFollow(FOLLOW_16);
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
    // InternalMetaTemplating.g:2107:1: rule__Rule__Group__8__Impl : ( '{' ) ;
    public final void rule__Rule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2111:1: ( ( '{' ) )
            // InternalMetaTemplating.g:2112:1: ( '{' )
            {
            // InternalMetaTemplating.g:2112:1: ( '{' )
            // InternalMetaTemplating.g:2113:2: '{'
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
    // InternalMetaTemplating.g:2122:1: rule__Rule__Group__9 : rule__Rule__Group__9__Impl rule__Rule__Group__10 ;
    public final void rule__Rule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2126:1: ( rule__Rule__Group__9__Impl rule__Rule__Group__10 )
            // InternalMetaTemplating.g:2127:2: rule__Rule__Group__9__Impl rule__Rule__Group__10
            {
            pushFollow(FOLLOW_16);
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
    // InternalMetaTemplating.g:2134:1: rule__Rule__Group__9__Impl : ( ( rule__Rule__BodyAssignment_9 )* ) ;
    public final void rule__Rule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2138:1: ( ( ( rule__Rule__BodyAssignment_9 )* ) )
            // InternalMetaTemplating.g:2139:1: ( ( rule__Rule__BodyAssignment_9 )* )
            {
            // InternalMetaTemplating.g:2139:1: ( ( rule__Rule__BodyAssignment_9 )* )
            // InternalMetaTemplating.g:2140:2: ( rule__Rule__BodyAssignment_9 )*
            {
             before(grammarAccess.getRuleAccess().getBodyAssignment_9()); 
            // InternalMetaTemplating.g:2141:2: ( rule__Rule__BodyAssignment_9 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||LA19_0==14||LA19_0==17||LA19_0==29||LA19_0==31||LA19_0==33||LA19_0==35||LA19_0==37||LA19_0==41||LA19_0==45) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMetaTemplating.g:2141:3: rule__Rule__BodyAssignment_9
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Rule__BodyAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalMetaTemplating.g:2149:1: rule__Rule__Group__10 : rule__Rule__Group__10__Impl ;
    public final void rule__Rule__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2153:1: ( rule__Rule__Group__10__Impl )
            // InternalMetaTemplating.g:2154:2: rule__Rule__Group__10__Impl
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
    // InternalMetaTemplating.g:2160:1: rule__Rule__Group__10__Impl : ( '}' ) ;
    public final void rule__Rule__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2164:1: ( ( '}' ) )
            // InternalMetaTemplating.g:2165:1: ( '}' )
            {
            // InternalMetaTemplating.g:2165:1: ( '}' )
            // InternalMetaTemplating.g:2166:2: '}'
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
    // InternalMetaTemplating.g:2176:1: rule__Iterator__Group__0 : rule__Iterator__Group__0__Impl rule__Iterator__Group__1 ;
    public final void rule__Iterator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2180:1: ( rule__Iterator__Group__0__Impl rule__Iterator__Group__1 )
            // InternalMetaTemplating.g:2181:2: rule__Iterator__Group__0__Impl rule__Iterator__Group__1
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
    // InternalMetaTemplating.g:2188:1: rule__Iterator__Group__0__Impl : ( 'foreach' ) ;
    public final void rule__Iterator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2192:1: ( ( 'foreach' ) )
            // InternalMetaTemplating.g:2193:1: ( 'foreach' )
            {
            // InternalMetaTemplating.g:2193:1: ( 'foreach' )
            // InternalMetaTemplating.g:2194:2: 'foreach'
            {
             before(grammarAccess.getIteratorAccess().getForeachKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMetaTemplating.g:2203:1: rule__Iterator__Group__1 : rule__Iterator__Group__1__Impl rule__Iterator__Group__2 ;
    public final void rule__Iterator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2207:1: ( rule__Iterator__Group__1__Impl rule__Iterator__Group__2 )
            // InternalMetaTemplating.g:2208:2: rule__Iterator__Group__1__Impl rule__Iterator__Group__2
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
    // InternalMetaTemplating.g:2215:1: rule__Iterator__Group__1__Impl : ( '(' ) ;
    public final void rule__Iterator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2219:1: ( ( '(' ) )
            // InternalMetaTemplating.g:2220:1: ( '(' )
            {
            // InternalMetaTemplating.g:2220:1: ( '(' )
            // InternalMetaTemplating.g:2221:2: '('
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
    // InternalMetaTemplating.g:2230:1: rule__Iterator__Group__2 : rule__Iterator__Group__2__Impl rule__Iterator__Group__3 ;
    public final void rule__Iterator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2234:1: ( rule__Iterator__Group__2__Impl rule__Iterator__Group__3 )
            // InternalMetaTemplating.g:2235:2: rule__Iterator__Group__2__Impl rule__Iterator__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalMetaTemplating.g:2242:1: rule__Iterator__Group__2__Impl : ( ( rule__Iterator__ElementAssignment_2 ) ) ;
    public final void rule__Iterator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2246:1: ( ( ( rule__Iterator__ElementAssignment_2 ) ) )
            // InternalMetaTemplating.g:2247:1: ( ( rule__Iterator__ElementAssignment_2 ) )
            {
            // InternalMetaTemplating.g:2247:1: ( ( rule__Iterator__ElementAssignment_2 ) )
            // InternalMetaTemplating.g:2248:2: ( rule__Iterator__ElementAssignment_2 )
            {
             before(grammarAccess.getIteratorAccess().getElementAssignment_2()); 
            // InternalMetaTemplating.g:2249:2: ( rule__Iterator__ElementAssignment_2 )
            // InternalMetaTemplating.g:2249:3: rule__Iterator__ElementAssignment_2
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
    // InternalMetaTemplating.g:2257:1: rule__Iterator__Group__3 : rule__Iterator__Group__3__Impl rule__Iterator__Group__4 ;
    public final void rule__Iterator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2261:1: ( rule__Iterator__Group__3__Impl rule__Iterator__Group__4 )
            // InternalMetaTemplating.g:2262:2: rule__Iterator__Group__3__Impl rule__Iterator__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalMetaTemplating.g:2269:1: rule__Iterator__Group__3__Impl : ( 'in' ) ;
    public final void rule__Iterator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2273:1: ( ( 'in' ) )
            // InternalMetaTemplating.g:2274:1: ( 'in' )
            {
            // InternalMetaTemplating.g:2274:1: ( 'in' )
            // InternalMetaTemplating.g:2275:2: 'in'
            {
             before(grammarAccess.getIteratorAccess().getInKeyword_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMetaTemplating.g:2284:1: rule__Iterator__Group__4 : rule__Iterator__Group__4__Impl rule__Iterator__Group__5 ;
    public final void rule__Iterator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2288:1: ( rule__Iterator__Group__4__Impl rule__Iterator__Group__5 )
            // InternalMetaTemplating.g:2289:2: rule__Iterator__Group__4__Impl rule__Iterator__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalMetaTemplating.g:2296:1: rule__Iterator__Group__4__Impl : ( ( rule__Iterator__QueryAssignment_4 ) ) ;
    public final void rule__Iterator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2300:1: ( ( ( rule__Iterator__QueryAssignment_4 ) ) )
            // InternalMetaTemplating.g:2301:1: ( ( rule__Iterator__QueryAssignment_4 ) )
            {
            // InternalMetaTemplating.g:2301:1: ( ( rule__Iterator__QueryAssignment_4 ) )
            // InternalMetaTemplating.g:2302:2: ( rule__Iterator__QueryAssignment_4 )
            {
             before(grammarAccess.getIteratorAccess().getQueryAssignment_4()); 
            // InternalMetaTemplating.g:2303:2: ( rule__Iterator__QueryAssignment_4 )
            // InternalMetaTemplating.g:2303:3: rule__Iterator__QueryAssignment_4
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
    // InternalMetaTemplating.g:2311:1: rule__Iterator__Group__5 : rule__Iterator__Group__5__Impl rule__Iterator__Group__6 ;
    public final void rule__Iterator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2315:1: ( rule__Iterator__Group__5__Impl rule__Iterator__Group__6 )
            // InternalMetaTemplating.g:2316:2: rule__Iterator__Group__5__Impl rule__Iterator__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalMetaTemplating.g:2323:1: rule__Iterator__Group__5__Impl : ( ')' ) ;
    public final void rule__Iterator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2327:1: ( ( ')' ) )
            // InternalMetaTemplating.g:2328:1: ( ')' )
            {
            // InternalMetaTemplating.g:2328:1: ( ')' )
            // InternalMetaTemplating.g:2329:2: ')'
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
    // InternalMetaTemplating.g:2338:1: rule__Iterator__Group__6 : rule__Iterator__Group__6__Impl rule__Iterator__Group__7 ;
    public final void rule__Iterator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2342:1: ( rule__Iterator__Group__6__Impl rule__Iterator__Group__7 )
            // InternalMetaTemplating.g:2343:2: rule__Iterator__Group__6__Impl rule__Iterator__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalMetaTemplating.g:2350:1: rule__Iterator__Group__6__Impl : ( '{' ) ;
    public final void rule__Iterator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2354:1: ( ( '{' ) )
            // InternalMetaTemplating.g:2355:1: ( '{' )
            {
            // InternalMetaTemplating.g:2355:1: ( '{' )
            // InternalMetaTemplating.g:2356:2: '{'
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
    // InternalMetaTemplating.g:2365:1: rule__Iterator__Group__7 : rule__Iterator__Group__7__Impl rule__Iterator__Group__8 ;
    public final void rule__Iterator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2369:1: ( rule__Iterator__Group__7__Impl rule__Iterator__Group__8 )
            // InternalMetaTemplating.g:2370:2: rule__Iterator__Group__7__Impl rule__Iterator__Group__8
            {
            pushFollow(FOLLOW_16);
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
    // InternalMetaTemplating.g:2377:1: rule__Iterator__Group__7__Impl : ( ( rule__Iterator__BodyAssignment_7 )* ) ;
    public final void rule__Iterator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2381:1: ( ( ( rule__Iterator__BodyAssignment_7 )* ) )
            // InternalMetaTemplating.g:2382:1: ( ( rule__Iterator__BodyAssignment_7 )* )
            {
            // InternalMetaTemplating.g:2382:1: ( ( rule__Iterator__BodyAssignment_7 )* )
            // InternalMetaTemplating.g:2383:2: ( rule__Iterator__BodyAssignment_7 )*
            {
             before(grammarAccess.getIteratorAccess().getBodyAssignment_7()); 
            // InternalMetaTemplating.g:2384:2: ( rule__Iterator__BodyAssignment_7 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==14||LA20_0==17||LA20_0==29||LA20_0==31||LA20_0==33||LA20_0==35||LA20_0==37||LA20_0==41||LA20_0==45) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMetaTemplating.g:2384:3: rule__Iterator__BodyAssignment_7
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Iterator__BodyAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalMetaTemplating.g:2392:1: rule__Iterator__Group__8 : rule__Iterator__Group__8__Impl ;
    public final void rule__Iterator__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2396:1: ( rule__Iterator__Group__8__Impl )
            // InternalMetaTemplating.g:2397:2: rule__Iterator__Group__8__Impl
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
    // InternalMetaTemplating.g:2403:1: rule__Iterator__Group__8__Impl : ( '}' ) ;
    public final void rule__Iterator__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2407:1: ( ( '}' ) )
            // InternalMetaTemplating.g:2408:1: ( '}' )
            {
            // InternalMetaTemplating.g:2408:1: ( '}' )
            // InternalMetaTemplating.g:2409:2: '}'
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
    // InternalMetaTemplating.g:2419:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2423:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // InternalMetaTemplating.g:2424:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMetaTemplating.g:2431:1: rule__Query__Group__0__Impl : ( ( rule__Query__Alternatives_0 ) ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2435:1: ( ( ( rule__Query__Alternatives_0 ) ) )
            // InternalMetaTemplating.g:2436:1: ( ( rule__Query__Alternatives_0 ) )
            {
            // InternalMetaTemplating.g:2436:1: ( ( rule__Query__Alternatives_0 ) )
            // InternalMetaTemplating.g:2437:2: ( rule__Query__Alternatives_0 )
            {
             before(grammarAccess.getQueryAccess().getAlternatives_0()); 
            // InternalMetaTemplating.g:2438:2: ( rule__Query__Alternatives_0 )
            // InternalMetaTemplating.g:2438:3: rule__Query__Alternatives_0
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
    // InternalMetaTemplating.g:2446:1: rule__Query__Group__1 : rule__Query__Group__1__Impl ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2450:1: ( rule__Query__Group__1__Impl )
            // InternalMetaTemplating.g:2451:2: rule__Query__Group__1__Impl
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
    // InternalMetaTemplating.g:2457:1: rule__Query__Group__1__Impl : ( ( rule__Query__SubQueryAssignment_1 )* ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2461:1: ( ( ( rule__Query__SubQueryAssignment_1 )* ) )
            // InternalMetaTemplating.g:2462:1: ( ( rule__Query__SubQueryAssignment_1 )* )
            {
            // InternalMetaTemplating.g:2462:1: ( ( rule__Query__SubQueryAssignment_1 )* )
            // InternalMetaTemplating.g:2463:2: ( rule__Query__SubQueryAssignment_1 )*
            {
             before(grammarAccess.getQueryAccess().getSubQueryAssignment_1()); 
            // InternalMetaTemplating.g:2464:2: ( rule__Query__SubQueryAssignment_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==39) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMetaTemplating.g:2464:3: rule__Query__SubQueryAssignment_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Query__SubQueryAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalMetaTemplating.g:2473:1: rule__SubQuery__Group_0__0 : rule__SubQuery__Group_0__0__Impl rule__SubQuery__Group_0__1 ;
    public final void rule__SubQuery__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2477:1: ( rule__SubQuery__Group_0__0__Impl rule__SubQuery__Group_0__1 )
            // InternalMetaTemplating.g:2478:2: rule__SubQuery__Group_0__0__Impl rule__SubQuery__Group_0__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMetaTemplating.g:2485:1: rule__SubQuery__Group_0__0__Impl : ( '.' ) ;
    public final void rule__SubQuery__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2489:1: ( ( '.' ) )
            // InternalMetaTemplating.g:2490:1: ( '.' )
            {
            // InternalMetaTemplating.g:2490:1: ( '.' )
            // InternalMetaTemplating.g:2491:2: '.'
            {
             before(grammarAccess.getSubQueryAccess().getFullStopKeyword_0_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMetaTemplating.g:2500:1: rule__SubQuery__Group_0__1 : rule__SubQuery__Group_0__1__Impl rule__SubQuery__Group_0__2 ;
    public final void rule__SubQuery__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2504:1: ( rule__SubQuery__Group_0__1__Impl rule__SubQuery__Group_0__2 )
            // InternalMetaTemplating.g:2505:2: rule__SubQuery__Group_0__1__Impl rule__SubQuery__Group_0__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalMetaTemplating.g:2512:1: rule__SubQuery__Group_0__1__Impl : ( ( rule__SubQuery__Alternatives_0_1 ) ) ;
    public final void rule__SubQuery__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2516:1: ( ( ( rule__SubQuery__Alternatives_0_1 ) ) )
            // InternalMetaTemplating.g:2517:1: ( ( rule__SubQuery__Alternatives_0_1 ) )
            {
            // InternalMetaTemplating.g:2517:1: ( ( rule__SubQuery__Alternatives_0_1 ) )
            // InternalMetaTemplating.g:2518:2: ( rule__SubQuery__Alternatives_0_1 )
            {
             before(grammarAccess.getSubQueryAccess().getAlternatives_0_1()); 
            // InternalMetaTemplating.g:2519:2: ( rule__SubQuery__Alternatives_0_1 )
            // InternalMetaTemplating.g:2519:3: rule__SubQuery__Alternatives_0_1
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
    // InternalMetaTemplating.g:2527:1: rule__SubQuery__Group_0__2 : rule__SubQuery__Group_0__2__Impl ;
    public final void rule__SubQuery__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2531:1: ( rule__SubQuery__Group_0__2__Impl )
            // InternalMetaTemplating.g:2532:2: rule__SubQuery__Group_0__2__Impl
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
    // InternalMetaTemplating.g:2538:1: rule__SubQuery__Group_0__2__Impl : ( '()' ) ;
    public final void rule__SubQuery__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2542:1: ( ( '()' ) )
            // InternalMetaTemplating.g:2543:1: ( '()' )
            {
            // InternalMetaTemplating.g:2543:1: ( '()' )
            // InternalMetaTemplating.g:2544:2: '()'
            {
             before(grammarAccess.getSubQueryAccess().getLeftParenthesisRightParenthesisKeyword_0_2()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMetaTemplating.g:2554:1: rule__SubQuery__Group_1__0 : rule__SubQuery__Group_1__0__Impl rule__SubQuery__Group_1__1 ;
    public final void rule__SubQuery__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2558:1: ( rule__SubQuery__Group_1__0__Impl rule__SubQuery__Group_1__1 )
            // InternalMetaTemplating.g:2559:2: rule__SubQuery__Group_1__0__Impl rule__SubQuery__Group_1__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMetaTemplating.g:2566:1: rule__SubQuery__Group_1__0__Impl : ( '.' ) ;
    public final void rule__SubQuery__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2570:1: ( ( '.' ) )
            // InternalMetaTemplating.g:2571:1: ( '.' )
            {
            // InternalMetaTemplating.g:2571:1: ( '.' )
            // InternalMetaTemplating.g:2572:2: '.'
            {
             before(grammarAccess.getSubQueryAccess().getFullStopKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMetaTemplating.g:2581:1: rule__SubQuery__Group_1__1 : rule__SubQuery__Group_1__1__Impl ;
    public final void rule__SubQuery__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2585:1: ( rule__SubQuery__Group_1__1__Impl )
            // InternalMetaTemplating.g:2586:2: rule__SubQuery__Group_1__1__Impl
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
    // InternalMetaTemplating.g:2592:1: rule__SubQuery__Group_1__1__Impl : ( ( rule__SubQuery__Alternatives_1_1 ) ) ;
    public final void rule__SubQuery__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2596:1: ( ( ( rule__SubQuery__Alternatives_1_1 ) ) )
            // InternalMetaTemplating.g:2597:1: ( ( rule__SubQuery__Alternatives_1_1 ) )
            {
            // InternalMetaTemplating.g:2597:1: ( ( rule__SubQuery__Alternatives_1_1 ) )
            // InternalMetaTemplating.g:2598:2: ( rule__SubQuery__Alternatives_1_1 )
            {
             before(grammarAccess.getSubQueryAccess().getAlternatives_1_1()); 
            // InternalMetaTemplating.g:2599:2: ( rule__SubQuery__Alternatives_1_1 )
            // InternalMetaTemplating.g:2599:3: rule__SubQuery__Alternatives_1_1
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
    // InternalMetaTemplating.g:2608:1: rule__Ph__Group__0 : rule__Ph__Group__0__Impl rule__Ph__Group__1 ;
    public final void rule__Ph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2612:1: ( rule__Ph__Group__0__Impl rule__Ph__Group__1 )
            // InternalMetaTemplating.g:2613:2: rule__Ph__Group__0__Impl rule__Ph__Group__1
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
    // InternalMetaTemplating.g:2620:1: rule__Ph__Group__0__Impl : ( '[[' ) ;
    public final void rule__Ph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2624:1: ( ( '[[' ) )
            // InternalMetaTemplating.g:2625:1: ( '[[' )
            {
            // InternalMetaTemplating.g:2625:1: ( '[[' )
            // InternalMetaTemplating.g:2626:2: '[['
            {
             before(grammarAccess.getPhAccess().getLeftSquareBracketLeftSquareBracketKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMetaTemplating.g:2635:1: rule__Ph__Group__1 : rule__Ph__Group__1__Impl rule__Ph__Group__2 ;
    public final void rule__Ph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2639:1: ( rule__Ph__Group__1__Impl rule__Ph__Group__2 )
            // InternalMetaTemplating.g:2640:2: rule__Ph__Group__1__Impl rule__Ph__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMetaTemplating.g:2647:1: rule__Ph__Group__1__Impl : ( ( rule__Ph__PropertyAssignment_1 ) ) ;
    public final void rule__Ph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2651:1: ( ( ( rule__Ph__PropertyAssignment_1 ) ) )
            // InternalMetaTemplating.g:2652:1: ( ( rule__Ph__PropertyAssignment_1 ) )
            {
            // InternalMetaTemplating.g:2652:1: ( ( rule__Ph__PropertyAssignment_1 ) )
            // InternalMetaTemplating.g:2653:2: ( rule__Ph__PropertyAssignment_1 )
            {
             before(grammarAccess.getPhAccess().getPropertyAssignment_1()); 
            // InternalMetaTemplating.g:2654:2: ( rule__Ph__PropertyAssignment_1 )
            // InternalMetaTemplating.g:2654:3: rule__Ph__PropertyAssignment_1
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
    // InternalMetaTemplating.g:2662:1: rule__Ph__Group__2 : rule__Ph__Group__2__Impl rule__Ph__Group__3 ;
    public final void rule__Ph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2666:1: ( rule__Ph__Group__2__Impl rule__Ph__Group__3 )
            // InternalMetaTemplating.g:2667:2: rule__Ph__Group__2__Impl rule__Ph__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalMetaTemplating.g:2674:1: rule__Ph__Group__2__Impl : ( ( rule__Ph__MetaPropertyAssignment_2 )? ) ;
    public final void rule__Ph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2678:1: ( ( ( rule__Ph__MetaPropertyAssignment_2 )? ) )
            // InternalMetaTemplating.g:2679:1: ( ( rule__Ph__MetaPropertyAssignment_2 )? )
            {
            // InternalMetaTemplating.g:2679:1: ( ( rule__Ph__MetaPropertyAssignment_2 )? )
            // InternalMetaTemplating.g:2680:2: ( rule__Ph__MetaPropertyAssignment_2 )?
            {
             before(grammarAccess.getPhAccess().getMetaPropertyAssignment_2()); 
            // InternalMetaTemplating.g:2681:2: ( rule__Ph__MetaPropertyAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==44) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMetaTemplating.g:2681:3: rule__Ph__MetaPropertyAssignment_2
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
    // InternalMetaTemplating.g:2689:1: rule__Ph__Group__3 : rule__Ph__Group__3__Impl ;
    public final void rule__Ph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2693:1: ( rule__Ph__Group__3__Impl )
            // InternalMetaTemplating.g:2694:2: rule__Ph__Group__3__Impl
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
    // InternalMetaTemplating.g:2700:1: rule__Ph__Group__3__Impl : ( ']]' ) ;
    public final void rule__Ph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2704:1: ( ( ']]' ) )
            // InternalMetaTemplating.g:2705:1: ( ']]' )
            {
            // InternalMetaTemplating.g:2705:1: ( ']]' )
            // InternalMetaTemplating.g:2706:2: ']]'
            {
             before(grammarAccess.getPhAccess().getRightSquareBracketRightSquareBracketKeyword_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalMetaTemplating.g:2716:1: rule__MetaPh__Group__0 : rule__MetaPh__Group__0__Impl rule__MetaPh__Group__1 ;
    public final void rule__MetaPh__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2720:1: ( rule__MetaPh__Group__0__Impl rule__MetaPh__Group__1 )
            // InternalMetaTemplating.g:2721:2: rule__MetaPh__Group__0__Impl rule__MetaPh__Group__1
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
    // InternalMetaTemplating.g:2728:1: rule__MetaPh__Group__0__Impl : ( '[' ) ;
    public final void rule__MetaPh__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2732:1: ( ( '[' ) )
            // InternalMetaTemplating.g:2733:1: ( '[' )
            {
            // InternalMetaTemplating.g:2733:1: ( '[' )
            // InternalMetaTemplating.g:2734:2: '['
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
    // InternalMetaTemplating.g:2743:1: rule__MetaPh__Group__1 : rule__MetaPh__Group__1__Impl rule__MetaPh__Group__2 ;
    public final void rule__MetaPh__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2747:1: ( rule__MetaPh__Group__1__Impl rule__MetaPh__Group__2 )
            // InternalMetaTemplating.g:2748:2: rule__MetaPh__Group__1__Impl rule__MetaPh__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMetaTemplating.g:2755:1: rule__MetaPh__Group__1__Impl : ( ( rule__MetaPh__PropertyAssignment_1 ) ) ;
    public final void rule__MetaPh__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2759:1: ( ( ( rule__MetaPh__PropertyAssignment_1 ) ) )
            // InternalMetaTemplating.g:2760:1: ( ( rule__MetaPh__PropertyAssignment_1 ) )
            {
            // InternalMetaTemplating.g:2760:1: ( ( rule__MetaPh__PropertyAssignment_1 ) )
            // InternalMetaTemplating.g:2761:2: ( rule__MetaPh__PropertyAssignment_1 )
            {
             before(grammarAccess.getMetaPhAccess().getPropertyAssignment_1()); 
            // InternalMetaTemplating.g:2762:2: ( rule__MetaPh__PropertyAssignment_1 )
            // InternalMetaTemplating.g:2762:3: rule__MetaPh__PropertyAssignment_1
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
    // InternalMetaTemplating.g:2770:1: rule__MetaPh__Group__2 : rule__MetaPh__Group__2__Impl rule__MetaPh__Group__3 ;
    public final void rule__MetaPh__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2774:1: ( rule__MetaPh__Group__2__Impl rule__MetaPh__Group__3 )
            // InternalMetaTemplating.g:2775:2: rule__MetaPh__Group__2__Impl rule__MetaPh__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalMetaTemplating.g:2782:1: rule__MetaPh__Group__2__Impl : ( ( rule__MetaPh__Group_2__0 )? ) ;
    public final void rule__MetaPh__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2786:1: ( ( ( rule__MetaPh__Group_2__0 )? ) )
            // InternalMetaTemplating.g:2787:1: ( ( rule__MetaPh__Group_2__0 )? )
            {
            // InternalMetaTemplating.g:2787:1: ( ( rule__MetaPh__Group_2__0 )? )
            // InternalMetaTemplating.g:2788:2: ( rule__MetaPh__Group_2__0 )?
            {
             before(grammarAccess.getMetaPhAccess().getGroup_2()); 
            // InternalMetaTemplating.g:2789:2: ( rule__MetaPh__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==43) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMetaTemplating.g:2789:3: rule__MetaPh__Group_2__0
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
    // InternalMetaTemplating.g:2797:1: rule__MetaPh__Group__3 : rule__MetaPh__Group__3__Impl ;
    public final void rule__MetaPh__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2801:1: ( rule__MetaPh__Group__3__Impl )
            // InternalMetaTemplating.g:2802:2: rule__MetaPh__Group__3__Impl
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
    // InternalMetaTemplating.g:2808:1: rule__MetaPh__Group__3__Impl : ( ']' ) ;
    public final void rule__MetaPh__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2812:1: ( ( ']' ) )
            // InternalMetaTemplating.g:2813:1: ( ']' )
            {
            // InternalMetaTemplating.g:2813:1: ( ']' )
            // InternalMetaTemplating.g:2814:2: ']'
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
    // InternalMetaTemplating.g:2824:1: rule__MetaPh__Group_2__0 : rule__MetaPh__Group_2__0__Impl rule__MetaPh__Group_2__1 ;
    public final void rule__MetaPh__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2828:1: ( rule__MetaPh__Group_2__0__Impl rule__MetaPh__Group_2__1 )
            // InternalMetaTemplating.g:2829:2: rule__MetaPh__Group_2__0__Impl rule__MetaPh__Group_2__1
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
    // InternalMetaTemplating.g:2836:1: rule__MetaPh__Group_2__0__Impl : ( 'TAGINFO' ) ;
    public final void rule__MetaPh__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2840:1: ( ( 'TAGINFO' ) )
            // InternalMetaTemplating.g:2841:1: ( 'TAGINFO' )
            {
            // InternalMetaTemplating.g:2841:1: ( 'TAGINFO' )
            // InternalMetaTemplating.g:2842:2: 'TAGINFO'
            {
             before(grammarAccess.getMetaPhAccess().getTAGINFOKeyword_2_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMetaTemplating.g:2851:1: rule__MetaPh__Group_2__1 : rule__MetaPh__Group_2__1__Impl ;
    public final void rule__MetaPh__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2855:1: ( rule__MetaPh__Group_2__1__Impl )
            // InternalMetaTemplating.g:2856:2: rule__MetaPh__Group_2__1__Impl
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
    // InternalMetaTemplating.g:2862:1: rule__MetaPh__Group_2__1__Impl : ( ( rule__MetaPh__TagAssignment_2_1 ) ) ;
    public final void rule__MetaPh__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2866:1: ( ( ( rule__MetaPh__TagAssignment_2_1 ) ) )
            // InternalMetaTemplating.g:2867:1: ( ( rule__MetaPh__TagAssignment_2_1 ) )
            {
            // InternalMetaTemplating.g:2867:1: ( ( rule__MetaPh__TagAssignment_2_1 ) )
            // InternalMetaTemplating.g:2868:2: ( rule__MetaPh__TagAssignment_2_1 )
            {
             before(grammarAccess.getMetaPhAccess().getTagAssignment_2_1()); 
            // InternalMetaTemplating.g:2869:2: ( rule__MetaPh__TagAssignment_2_1 )
            // InternalMetaTemplating.g:2869:3: rule__MetaPh__TagAssignment_2_1
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
    // InternalMetaTemplating.g:2878:1: rule__MetaProperty__Group__0 : rule__MetaProperty__Group__0__Impl rule__MetaProperty__Group__1 ;
    public final void rule__MetaProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2882:1: ( rule__MetaProperty__Group__0__Impl rule__MetaProperty__Group__1 )
            // InternalMetaTemplating.g:2883:2: rule__MetaProperty__Group__0__Impl rule__MetaProperty__Group__1
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
    // InternalMetaTemplating.g:2890:1: rule__MetaProperty__Group__0__Impl : ( '.{' ) ;
    public final void rule__MetaProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2894:1: ( ( '.{' ) )
            // InternalMetaTemplating.g:2895:1: ( '.{' )
            {
            // InternalMetaTemplating.g:2895:1: ( '.{' )
            // InternalMetaTemplating.g:2896:2: '.{'
            {
             before(grammarAccess.getMetaPropertyAccess().getFullStopLeftCurlyBracketKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalMetaTemplating.g:2905:1: rule__MetaProperty__Group__1 : rule__MetaProperty__Group__1__Impl rule__MetaProperty__Group__2 ;
    public final void rule__MetaProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2909:1: ( rule__MetaProperty__Group__1__Impl rule__MetaProperty__Group__2 )
            // InternalMetaTemplating.g:2910:2: rule__MetaProperty__Group__1__Impl rule__MetaProperty__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalMetaTemplating.g:2917:1: rule__MetaProperty__Group__1__Impl : ( ( rule__MetaProperty__PropertyAssignment_1 ) ) ;
    public final void rule__MetaProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2921:1: ( ( ( rule__MetaProperty__PropertyAssignment_1 ) ) )
            // InternalMetaTemplating.g:2922:1: ( ( rule__MetaProperty__PropertyAssignment_1 ) )
            {
            // InternalMetaTemplating.g:2922:1: ( ( rule__MetaProperty__PropertyAssignment_1 ) )
            // InternalMetaTemplating.g:2923:2: ( rule__MetaProperty__PropertyAssignment_1 )
            {
             before(grammarAccess.getMetaPropertyAccess().getPropertyAssignment_1()); 
            // InternalMetaTemplating.g:2924:2: ( rule__MetaProperty__PropertyAssignment_1 )
            // InternalMetaTemplating.g:2924:3: rule__MetaProperty__PropertyAssignment_1
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
    // InternalMetaTemplating.g:2932:1: rule__MetaProperty__Group__2 : rule__MetaProperty__Group__2__Impl ;
    public final void rule__MetaProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2936:1: ( rule__MetaProperty__Group__2__Impl )
            // InternalMetaTemplating.g:2937:2: rule__MetaProperty__Group__2__Impl
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
    // InternalMetaTemplating.g:2943:1: rule__MetaProperty__Group__2__Impl : ( '}' ) ;
    public final void rule__MetaProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2947:1: ( ( '}' ) )
            // InternalMetaTemplating.g:2948:1: ( '}' )
            {
            // InternalMetaTemplating.g:2948:1: ( '}' )
            // InternalMetaTemplating.g:2949:2: '}'
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
    // InternalMetaTemplating.g:2959:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2963:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalMetaTemplating.g:2964:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMetaTemplating.g:2971:1: rule__Property__Group__0__Impl : ( ( rule__Property__PropertyAssignment_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2975:1: ( ( ( rule__Property__PropertyAssignment_0 ) ) )
            // InternalMetaTemplating.g:2976:1: ( ( rule__Property__PropertyAssignment_0 ) )
            {
            // InternalMetaTemplating.g:2976:1: ( ( rule__Property__PropertyAssignment_0 ) )
            // InternalMetaTemplating.g:2977:2: ( rule__Property__PropertyAssignment_0 )
            {
             before(grammarAccess.getPropertyAccess().getPropertyAssignment_0()); 
            // InternalMetaTemplating.g:2978:2: ( rule__Property__PropertyAssignment_0 )
            // InternalMetaTemplating.g:2978:3: rule__Property__PropertyAssignment_0
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
    // InternalMetaTemplating.g:2986:1: rule__Property__Group__1 : rule__Property__Group__1__Impl ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:2990:1: ( rule__Property__Group__1__Impl )
            // InternalMetaTemplating.g:2991:2: rule__Property__Group__1__Impl
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
    // InternalMetaTemplating.g:2997:1: rule__Property__Group__1__Impl : ( ( rule__Property__SubPropertiesAssignment_1 )* ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3001:1: ( ( ( rule__Property__SubPropertiesAssignment_1 )* ) )
            // InternalMetaTemplating.g:3002:1: ( ( rule__Property__SubPropertiesAssignment_1 )* )
            {
            // InternalMetaTemplating.g:3002:1: ( ( rule__Property__SubPropertiesAssignment_1 )* )
            // InternalMetaTemplating.g:3003:2: ( rule__Property__SubPropertiesAssignment_1 )*
            {
             before(grammarAccess.getPropertyAccess().getSubPropertiesAssignment_1()); 
            // InternalMetaTemplating.g:3004:2: ( rule__Property__SubPropertiesAssignment_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==39) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMetaTemplating.g:3004:3: rule__Property__SubPropertiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Property__SubPropertiesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalMetaTemplating.g:3013:1: rule__SubProperty__Group_0__0 : rule__SubProperty__Group_0__0__Impl rule__SubProperty__Group_0__1 ;
    public final void rule__SubProperty__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3017:1: ( rule__SubProperty__Group_0__0__Impl rule__SubProperty__Group_0__1 )
            // InternalMetaTemplating.g:3018:2: rule__SubProperty__Group_0__0__Impl rule__SubProperty__Group_0__1
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
    // InternalMetaTemplating.g:3025:1: rule__SubProperty__Group_0__0__Impl : ( '.' ) ;
    public final void rule__SubProperty__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3029:1: ( ( '.' ) )
            // InternalMetaTemplating.g:3030:1: ( '.' )
            {
            // InternalMetaTemplating.g:3030:1: ( '.' )
            // InternalMetaTemplating.g:3031:2: '.'
            {
             before(grammarAccess.getSubPropertyAccess().getFullStopKeyword_0_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMetaTemplating.g:3040:1: rule__SubProperty__Group_0__1 : rule__SubProperty__Group_0__1__Impl rule__SubProperty__Group_0__2 ;
    public final void rule__SubProperty__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3044:1: ( rule__SubProperty__Group_0__1__Impl rule__SubProperty__Group_0__2 )
            // InternalMetaTemplating.g:3045:2: rule__SubProperty__Group_0__1__Impl rule__SubProperty__Group_0__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalMetaTemplating.g:3052:1: rule__SubProperty__Group_0__1__Impl : ( ( rule__SubProperty__MethodAssignment_0_1 ) ) ;
    public final void rule__SubProperty__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3056:1: ( ( ( rule__SubProperty__MethodAssignment_0_1 ) ) )
            // InternalMetaTemplating.g:3057:1: ( ( rule__SubProperty__MethodAssignment_0_1 ) )
            {
            // InternalMetaTemplating.g:3057:1: ( ( rule__SubProperty__MethodAssignment_0_1 ) )
            // InternalMetaTemplating.g:3058:2: ( rule__SubProperty__MethodAssignment_0_1 )
            {
             before(grammarAccess.getSubPropertyAccess().getMethodAssignment_0_1()); 
            // InternalMetaTemplating.g:3059:2: ( rule__SubProperty__MethodAssignment_0_1 )
            // InternalMetaTemplating.g:3059:3: rule__SubProperty__MethodAssignment_0_1
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
    // InternalMetaTemplating.g:3067:1: rule__SubProperty__Group_0__2 : rule__SubProperty__Group_0__2__Impl ;
    public final void rule__SubProperty__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3071:1: ( rule__SubProperty__Group_0__2__Impl )
            // InternalMetaTemplating.g:3072:2: rule__SubProperty__Group_0__2__Impl
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
    // InternalMetaTemplating.g:3078:1: rule__SubProperty__Group_0__2__Impl : ( '()' ) ;
    public final void rule__SubProperty__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3082:1: ( ( '()' ) )
            // InternalMetaTemplating.g:3083:1: ( '()' )
            {
            // InternalMetaTemplating.g:3083:1: ( '()' )
            // InternalMetaTemplating.g:3084:2: '()'
            {
             before(grammarAccess.getSubPropertyAccess().getLeftParenthesisRightParenthesisKeyword_0_2()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMetaTemplating.g:3094:1: rule__SubProperty__Group_1__0 : rule__SubProperty__Group_1__0__Impl rule__SubProperty__Group_1__1 ;
    public final void rule__SubProperty__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3098:1: ( rule__SubProperty__Group_1__0__Impl rule__SubProperty__Group_1__1 )
            // InternalMetaTemplating.g:3099:2: rule__SubProperty__Group_1__0__Impl rule__SubProperty__Group_1__1
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
    // InternalMetaTemplating.g:3106:1: rule__SubProperty__Group_1__0__Impl : ( '.' ) ;
    public final void rule__SubProperty__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3110:1: ( ( '.' ) )
            // InternalMetaTemplating.g:3111:1: ( '.' )
            {
            // InternalMetaTemplating.g:3111:1: ( '.' )
            // InternalMetaTemplating.g:3112:2: '.'
            {
             before(grammarAccess.getSubPropertyAccess().getFullStopKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMetaTemplating.g:3121:1: rule__SubProperty__Group_1__1 : rule__SubProperty__Group_1__1__Impl ;
    public final void rule__SubProperty__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3125:1: ( rule__SubProperty__Group_1__1__Impl )
            // InternalMetaTemplating.g:3126:2: rule__SubProperty__Group_1__1__Impl
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
    // InternalMetaTemplating.g:3132:1: rule__SubProperty__Group_1__1__Impl : ( ( rule__SubProperty__PropertyAssignment_1_1 ) ) ;
    public final void rule__SubProperty__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3136:1: ( ( ( rule__SubProperty__PropertyAssignment_1_1 ) ) )
            // InternalMetaTemplating.g:3137:1: ( ( rule__SubProperty__PropertyAssignment_1_1 ) )
            {
            // InternalMetaTemplating.g:3137:1: ( ( rule__SubProperty__PropertyAssignment_1_1 ) )
            // InternalMetaTemplating.g:3138:2: ( rule__SubProperty__PropertyAssignment_1_1 )
            {
             before(grammarAccess.getSubPropertyAccess().getPropertyAssignment_1_1()); 
            // InternalMetaTemplating.g:3139:2: ( rule__SubProperty__PropertyAssignment_1_1 )
            // InternalMetaTemplating.g:3139:3: rule__SubProperty__PropertyAssignment_1_1
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
    // InternalMetaTemplating.g:3148:1: rule__EscapedString__Group__0 : rule__EscapedString__Group__0__Impl rule__EscapedString__Group__1 ;
    public final void rule__EscapedString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3152:1: ( rule__EscapedString__Group__0__Impl rule__EscapedString__Group__1 )
            // InternalMetaTemplating.g:3153:2: rule__EscapedString__Group__0__Impl rule__EscapedString__Group__1
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
    // InternalMetaTemplating.g:3160:1: rule__EscapedString__Group__0__Impl : ( '@{' ) ;
    public final void rule__EscapedString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3164:1: ( ( '@{' ) )
            // InternalMetaTemplating.g:3165:1: ( '@{' )
            {
            // InternalMetaTemplating.g:3165:1: ( '@{' )
            // InternalMetaTemplating.g:3166:2: '@{'
            {
             before(grammarAccess.getEscapedStringAccess().getCommercialAtLeftCurlyBracketKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMetaTemplating.g:3175:1: rule__EscapedString__Group__1 : rule__EscapedString__Group__1__Impl rule__EscapedString__Group__2 ;
    public final void rule__EscapedString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3179:1: ( rule__EscapedString__Group__1__Impl rule__EscapedString__Group__2 )
            // InternalMetaTemplating.g:3180:2: rule__EscapedString__Group__1__Impl rule__EscapedString__Group__2
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
    // InternalMetaTemplating.g:3187:1: rule__EscapedString__Group__1__Impl : ( ( rule__EscapedString__StrAssignment_1 ) ) ;
    public final void rule__EscapedString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3191:1: ( ( ( rule__EscapedString__StrAssignment_1 ) ) )
            // InternalMetaTemplating.g:3192:1: ( ( rule__EscapedString__StrAssignment_1 ) )
            {
            // InternalMetaTemplating.g:3192:1: ( ( rule__EscapedString__StrAssignment_1 ) )
            // InternalMetaTemplating.g:3193:2: ( rule__EscapedString__StrAssignment_1 )
            {
             before(grammarAccess.getEscapedStringAccess().getStrAssignment_1()); 
            // InternalMetaTemplating.g:3194:2: ( rule__EscapedString__StrAssignment_1 )
            // InternalMetaTemplating.g:3194:3: rule__EscapedString__StrAssignment_1
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
    // InternalMetaTemplating.g:3202:1: rule__EscapedString__Group__2 : rule__EscapedString__Group__2__Impl ;
    public final void rule__EscapedString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3206:1: ( rule__EscapedString__Group__2__Impl )
            // InternalMetaTemplating.g:3207:2: rule__EscapedString__Group__2__Impl
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
    // InternalMetaTemplating.g:3213:1: rule__EscapedString__Group__2__Impl : ( '}@' ) ;
    public final void rule__EscapedString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3217:1: ( ( '}@' ) )
            // InternalMetaTemplating.g:3218:1: ( '}@' )
            {
            // InternalMetaTemplating.g:3218:1: ( '}@' )
            // InternalMetaTemplating.g:3219:2: '}@'
            {
             before(grammarAccess.getEscapedStringAccess().getRightCurlyBracketCommercialAtKeyword_2()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMetaTemplating.g:3229:1: rule__Escaped__Group__0 : rule__Escaped__Group__0__Impl rule__Escaped__Group__1 ;
    public final void rule__Escaped__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3233:1: ( rule__Escaped__Group__0__Impl rule__Escaped__Group__1 )
            // InternalMetaTemplating.g:3234:2: rule__Escaped__Group__0__Impl rule__Escaped__Group__1
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
    // InternalMetaTemplating.g:3241:1: rule__Escaped__Group__0__Impl : ( '#' ) ;
    public final void rule__Escaped__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3245:1: ( ( '#' ) )
            // InternalMetaTemplating.g:3246:1: ( '#' )
            {
            // InternalMetaTemplating.g:3246:1: ( '#' )
            // InternalMetaTemplating.g:3247:2: '#'
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
    // InternalMetaTemplating.g:3256:1: rule__Escaped__Group__1 : rule__Escaped__Group__1__Impl ;
    public final void rule__Escaped__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3260:1: ( rule__Escaped__Group__1__Impl )
            // InternalMetaTemplating.g:3261:2: rule__Escaped__Group__1__Impl
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
    // InternalMetaTemplating.g:3267:1: rule__Escaped__Group__1__Impl : ( ( rule__Escaped__CharAssignment_1 ) ) ;
    public final void rule__Escaped__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3271:1: ( ( ( rule__Escaped__CharAssignment_1 ) ) )
            // InternalMetaTemplating.g:3272:1: ( ( rule__Escaped__CharAssignment_1 ) )
            {
            // InternalMetaTemplating.g:3272:1: ( ( rule__Escaped__CharAssignment_1 ) )
            // InternalMetaTemplating.g:3273:2: ( rule__Escaped__CharAssignment_1 )
            {
             before(grammarAccess.getEscapedAccess().getCharAssignment_1()); 
            // InternalMetaTemplating.g:3274:2: ( rule__Escaped__CharAssignment_1 )
            // InternalMetaTemplating.g:3274:3: rule__Escaped__CharAssignment_1
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
    // InternalMetaTemplating.g:3283:1: rule__Model__HeaderAssignment_0 : ( ruleHeader ) ;
    public final void rule__Model__HeaderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3287:1: ( ( ruleHeader ) )
            // InternalMetaTemplating.g:3288:2: ( ruleHeader )
            {
            // InternalMetaTemplating.g:3288:2: ( ruleHeader )
            // InternalMetaTemplating.g:3289:3: ruleHeader
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
    // InternalMetaTemplating.g:3298:1: rule__Model__ContentAssignment_1 : ( ruleInstructions ) ;
    public final void rule__Model__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3302:1: ( ( ruleInstructions ) )
            // InternalMetaTemplating.g:3303:2: ( ruleInstructions )
            {
            // InternalMetaTemplating.g:3303:2: ( ruleInstructions )
            // InternalMetaTemplating.g:3304:3: ruleInstructions
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
    // InternalMetaTemplating.g:3313:1: rule__Header__LibsAssignment_1 : ( ruleLibraries ) ;
    public final void rule__Header__LibsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3317:1: ( ( ruleLibraries ) )
            // InternalMetaTemplating.g:3318:2: ( ruleLibraries )
            {
            // InternalMetaTemplating.g:3318:2: ( ruleLibraries )
            // InternalMetaTemplating.g:3319:3: ruleLibraries
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
    // InternalMetaTemplating.g:3328:1: rule__Header__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__Header__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3332:1: ( ( ruleImport ) )
            // InternalMetaTemplating.g:3333:2: ( ruleImport )
            {
            // InternalMetaTemplating.g:3333:2: ( ruleImport )
            // InternalMetaTemplating.g:3334:3: ruleImport
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
    // InternalMetaTemplating.g:3343:1: rule__Import__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3347:1: ( ( RULE_STRING ) )
            // InternalMetaTemplating.g:3348:2: ( RULE_STRING )
            {
            // InternalMetaTemplating.g:3348:2: ( RULE_STRING )
            // InternalMetaTemplating.g:3349:3: RULE_STRING
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
    // InternalMetaTemplating.g:3358:1: rule__Libraries__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Libraries__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3362:1: ( ( RULE_STRING ) )
            // InternalMetaTemplating.g:3363:2: ( RULE_STRING )
            {
            // InternalMetaTemplating.g:3363:2: ( RULE_STRING )
            // InternalMetaTemplating.g:3364:3: RULE_STRING
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
    // InternalMetaTemplating.g:3373:1: rule__Note__WordAssignment_1 : ( RULE_ID ) ;
    public final void rule__Note__WordAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3377:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:3378:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:3378:2: ( RULE_ID )
            // InternalMetaTemplating.g:3379:3: RULE_ID
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
    // InternalMetaTemplating.g:3388:1: rule__Instructions__NoteAssignment_0 : ( ruleNote ) ;
    public final void rule__Instructions__NoteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3392:1: ( ( ruleNote ) )
            // InternalMetaTemplating.g:3393:2: ( ruleNote )
            {
            // InternalMetaTemplating.g:3393:2: ( ruleNote )
            // InternalMetaTemplating.g:3394:3: ruleNote
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
    // InternalMetaTemplating.g:3403:1: rule__Instructions__StatementAssignment_1 : ( ruleStatement ) ;
    public final void rule__Instructions__StatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3407:1: ( ( ruleStatement ) )
            // InternalMetaTemplating.g:3408:2: ( ruleStatement )
            {
            // InternalMetaTemplating.g:3408:2: ( ruleStatement )
            // InternalMetaTemplating.g:3409:3: ruleStatement
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


    // $ANTLR start "rule__Instructions__FilterAssignment_2"
    // InternalMetaTemplating.g:3418:1: rule__Instructions__FilterAssignment_2 : ( ruleFilter ) ;
    public final void rule__Instructions__FilterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3422:1: ( ( ruleFilter ) )
            // InternalMetaTemplating.g:3423:2: ( ruleFilter )
            {
            // InternalMetaTemplating.g:3423:2: ( ruleFilter )
            // InternalMetaTemplating.g:3424:3: ruleFilter
            {
             before(grammarAccess.getInstructionsAccess().getFilterFilterParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getInstructionsAccess().getFilterFilterParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__FilterAssignment_2"


    // $ANTLR start "rule__Instructions__MetaFilterAssignment_3"
    // InternalMetaTemplating.g:3433:1: rule__Instructions__MetaFilterAssignment_3 : ( ruleMetaFilter ) ;
    public final void rule__Instructions__MetaFilterAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3437:1: ( ( ruleMetaFilter ) )
            // InternalMetaTemplating.g:3438:2: ( ruleMetaFilter )
            {
            // InternalMetaTemplating.g:3438:2: ( ruleMetaFilter )
            // InternalMetaTemplating.g:3439:3: ruleMetaFilter
            {
             before(grammarAccess.getInstructionsAccess().getMetaFilterMetaFilterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaFilter();

            state._fsp--;

             after(grammarAccess.getInstructionsAccess().getMetaFilterMetaFilterParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__MetaFilterAssignment_3"


    // $ANTLR start "rule__Instructions__IteratorAssignment_4"
    // InternalMetaTemplating.g:3448:1: rule__Instructions__IteratorAssignment_4 : ( ruleIterator ) ;
    public final void rule__Instructions__IteratorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3452:1: ( ( ruleIterator ) )
            // InternalMetaTemplating.g:3453:2: ( ruleIterator )
            {
            // InternalMetaTemplating.g:3453:2: ( ruleIterator )
            // InternalMetaTemplating.g:3454:3: ruleIterator
            {
             before(grammarAccess.getInstructionsAccess().getIteratorIteratorParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleIterator();

            state._fsp--;

             after(grammarAccess.getInstructionsAccess().getIteratorIteratorParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__IteratorAssignment_4"


    // $ANTLR start "rule__Instructions__RuleAssignment_5"
    // InternalMetaTemplating.g:3463:1: rule__Instructions__RuleAssignment_5 : ( ruleRule ) ;
    public final void rule__Instructions__RuleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3467:1: ( ( ruleRule ) )
            // InternalMetaTemplating.g:3468:2: ( ruleRule )
            {
            // InternalMetaTemplating.g:3468:2: ( ruleRule )
            // InternalMetaTemplating.g:3469:3: ruleRule
            {
             before(grammarAccess.getInstructionsAccess().getRuleRuleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getInstructionsAccess().getRuleRuleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__RuleAssignment_5"


    // $ANTLR start "rule__Statement__TextAssignment_0"
    // InternalMetaTemplating.g:3478:1: rule__Statement__TextAssignment_0 : ( RULE_ID ) ;
    public final void rule__Statement__TextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3482:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:3483:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:3483:2: ( RULE_ID )
            // InternalMetaTemplating.g:3484:3: RULE_ID
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
    // InternalMetaTemplating.g:3493:1: rule__Statement__CharAssignment_1 : ( ruleEscaped ) ;
    public final void rule__Statement__CharAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3497:1: ( ( ruleEscaped ) )
            // InternalMetaTemplating.g:3498:2: ( ruleEscaped )
            {
            // InternalMetaTemplating.g:3498:2: ( ruleEscaped )
            // InternalMetaTemplating.g:3499:3: ruleEscaped
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
    // InternalMetaTemplating.g:3508:1: rule__Statement__StringAssignment_2 : ( ruleEscapedString ) ;
    public final void rule__Statement__StringAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3512:1: ( ( ruleEscapedString ) )
            // InternalMetaTemplating.g:3513:2: ( ruleEscapedString )
            {
            // InternalMetaTemplating.g:3513:2: ( ruleEscapedString )
            // InternalMetaTemplating.g:3514:3: ruleEscapedString
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
    // InternalMetaTemplating.g:3523:1: rule__Statement__PlaceholderAssignment_3 : ( rulePh ) ;
    public final void rule__Statement__PlaceholderAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3527:1: ( ( rulePh ) )
            // InternalMetaTemplating.g:3528:2: ( rulePh )
            {
            // InternalMetaTemplating.g:3528:2: ( rulePh )
            // InternalMetaTemplating.g:3529:3: rulePh
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
    // InternalMetaTemplating.g:3538:1: rule__Statement__MetaPlaceholderAssignment_4 : ( ruleMetaPh ) ;
    public final void rule__Statement__MetaPlaceholderAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3542:1: ( ( ruleMetaPh ) )
            // InternalMetaTemplating.g:3543:2: ( ruleMetaPh )
            {
            // InternalMetaTemplating.g:3543:2: ( ruleMetaPh )
            // InternalMetaTemplating.g:3544:3: ruleMetaPh
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


    // $ANTLR start "rule__MetaFilter__ConditionAssignment_2"
    // InternalMetaTemplating.g:3553:1: rule__MetaFilter__ConditionAssignment_2 : ( ruleProperty ) ;
    public final void rule__MetaFilter__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3557:1: ( ( ruleProperty ) )
            // InternalMetaTemplating.g:3558:2: ( ruleProperty )
            {
            // InternalMetaTemplating.g:3558:2: ( ruleProperty )
            // InternalMetaTemplating.g:3559:3: ruleProperty
            {
             before(grammarAccess.getMetaFilterAccess().getConditionPropertyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getMetaFilterAccess().getConditionPropertyParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaFilter__ConditionAssignment_2"


    // $ANTLR start "rule__MetaFilter__TruebodyAssignment_5"
    // InternalMetaTemplating.g:3568:1: rule__MetaFilter__TruebodyAssignment_5 : ( ruleInstructions ) ;
    public final void rule__MetaFilter__TruebodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3572:1: ( ( ruleInstructions ) )
            // InternalMetaTemplating.g:3573:2: ( ruleInstructions )
            {
            // InternalMetaTemplating.g:3573:2: ( ruleInstructions )
            // InternalMetaTemplating.g:3574:3: ruleInstructions
            {
             before(grammarAccess.getMetaFilterAccess().getTruebodyInstructionsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleInstructions();

            state._fsp--;

             after(grammarAccess.getMetaFilterAccess().getTruebodyInstructionsParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaFilter__TruebodyAssignment_5"


    // $ANTLR start "rule__MetaFilter__FalsebodyAssignment_7_2"
    // InternalMetaTemplating.g:3583:1: rule__MetaFilter__FalsebodyAssignment_7_2 : ( ruleInstructions ) ;
    public final void rule__MetaFilter__FalsebodyAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3587:1: ( ( ruleInstructions ) )
            // InternalMetaTemplating.g:3588:2: ( ruleInstructions )
            {
            // InternalMetaTemplating.g:3588:2: ( ruleInstructions )
            // InternalMetaTemplating.g:3589:3: ruleInstructions
            {
             before(grammarAccess.getMetaFilterAccess().getFalsebodyInstructionsParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInstructions();

            state._fsp--;

             after(grammarAccess.getMetaFilterAccess().getFalsebodyInstructionsParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaFilter__FalsebodyAssignment_7_2"


    // $ANTLR start "rule__Filter__ConditionAssignment_2"
    // InternalMetaTemplating.g:3598:1: rule__Filter__ConditionAssignment_2 : ( ruleQuery ) ;
    public final void rule__Filter__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3602:1: ( ( ruleQuery ) )
            // InternalMetaTemplating.g:3603:2: ( ruleQuery )
            {
            // InternalMetaTemplating.g:3603:2: ( ruleQuery )
            // InternalMetaTemplating.g:3604:3: ruleQuery
            {
             before(grammarAccess.getFilterAccess().getConditionQueryParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getFilterAccess().getConditionQueryParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__ConditionAssignment_2"


    // $ANTLR start "rule__Filter__TruebodyAssignment_5"
    // InternalMetaTemplating.g:3613:1: rule__Filter__TruebodyAssignment_5 : ( ruleInstructions ) ;
    public final void rule__Filter__TruebodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3617:1: ( ( ruleInstructions ) )
            // InternalMetaTemplating.g:3618:2: ( ruleInstructions )
            {
            // InternalMetaTemplating.g:3618:2: ( ruleInstructions )
            // InternalMetaTemplating.g:3619:3: ruleInstructions
            {
             before(grammarAccess.getFilterAccess().getTruebodyInstructionsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleInstructions();

            state._fsp--;

             after(grammarAccess.getFilterAccess().getTruebodyInstructionsParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__TruebodyAssignment_5"


    // $ANTLR start "rule__Filter__FalsebodyAssignment_7_2"
    // InternalMetaTemplating.g:3628:1: rule__Filter__FalsebodyAssignment_7_2 : ( ruleInstructions ) ;
    public final void rule__Filter__FalsebodyAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3632:1: ( ( ruleInstructions ) )
            // InternalMetaTemplating.g:3633:2: ( ruleInstructions )
            {
            // InternalMetaTemplating.g:3633:2: ( ruleInstructions )
            // InternalMetaTemplating.g:3634:3: ruleInstructions
            {
             before(grammarAccess.getFilterAccess().getFalsebodyInstructionsParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInstructions();

            state._fsp--;

             after(grammarAccess.getFilterAccess().getFalsebodyInstructionsParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__FalsebodyAssignment_7_2"


    // $ANTLR start "rule__Rule__ElementAssignment_2"
    // InternalMetaTemplating.g:3643:1: rule__Rule__ElementAssignment_2 : ( RULE_ID ) ;
    public final void rule__Rule__ElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3647:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:3648:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:3648:2: ( RULE_ID )
            // InternalMetaTemplating.g:3649:3: RULE_ID
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
    // InternalMetaTemplating.g:3658:1: rule__Rule__PropertyAssignment_4 : ( ruleProperty ) ;
    public final void rule__Rule__PropertyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3662:1: ( ( ruleProperty ) )
            // InternalMetaTemplating.g:3663:2: ( ruleProperty )
            {
            // InternalMetaTemplating.g:3663:2: ( ruleProperty )
            // InternalMetaTemplating.g:3664:3: ruleProperty
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
    // InternalMetaTemplating.g:3673:1: rule__Rule__TagAssignment_6 : ( RULE_ID ) ;
    public final void rule__Rule__TagAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3677:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:3678:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:3678:2: ( RULE_ID )
            // InternalMetaTemplating.g:3679:3: RULE_ID
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
    // InternalMetaTemplating.g:3688:1: rule__Rule__BodyAssignment_9 : ( ruleInstructions ) ;
    public final void rule__Rule__BodyAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3692:1: ( ( ruleInstructions ) )
            // InternalMetaTemplating.g:3693:2: ( ruleInstructions )
            {
            // InternalMetaTemplating.g:3693:2: ( ruleInstructions )
            // InternalMetaTemplating.g:3694:3: ruleInstructions
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
    // InternalMetaTemplating.g:3703:1: rule__Iterator__ElementAssignment_2 : ( RULE_ID ) ;
    public final void rule__Iterator__ElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3707:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:3708:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:3708:2: ( RULE_ID )
            // InternalMetaTemplating.g:3709:3: RULE_ID
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
    // InternalMetaTemplating.g:3718:1: rule__Iterator__QueryAssignment_4 : ( ruleQuery ) ;
    public final void rule__Iterator__QueryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3722:1: ( ( ruleQuery ) )
            // InternalMetaTemplating.g:3723:2: ( ruleQuery )
            {
            // InternalMetaTemplating.g:3723:2: ( ruleQuery )
            // InternalMetaTemplating.g:3724:3: ruleQuery
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
    // InternalMetaTemplating.g:3733:1: rule__Iterator__BodyAssignment_7 : ( ruleInstructions ) ;
    public final void rule__Iterator__BodyAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3737:1: ( ( ruleInstructions ) )
            // InternalMetaTemplating.g:3738:2: ( ruleInstructions )
            {
            // InternalMetaTemplating.g:3738:2: ( ruleInstructions )
            // InternalMetaTemplating.g:3739:3: ruleInstructions
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
    // InternalMetaTemplating.g:3748:1: rule__Query__ItemAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Query__ItemAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3752:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:3753:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:3753:2: ( RULE_ID )
            // InternalMetaTemplating.g:3754:3: RULE_ID
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
    // InternalMetaTemplating.g:3763:1: rule__Query__RefAssignment_0_1 : ( ruleMetaPh ) ;
    public final void rule__Query__RefAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3767:1: ( ( ruleMetaPh ) )
            // InternalMetaTemplating.g:3768:2: ( ruleMetaPh )
            {
            // InternalMetaTemplating.g:3768:2: ( ruleMetaPh )
            // InternalMetaTemplating.g:3769:3: ruleMetaPh
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
    // InternalMetaTemplating.g:3778:1: rule__Query__SubQueryAssignment_1 : ( ruleSubQuery ) ;
    public final void rule__Query__SubQueryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3782:1: ( ( ruleSubQuery ) )
            // InternalMetaTemplating.g:3783:2: ( ruleSubQuery )
            {
            // InternalMetaTemplating.g:3783:2: ( ruleSubQuery )
            // InternalMetaTemplating.g:3784:3: ruleSubQuery
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
    // InternalMetaTemplating.g:3793:1: rule__SubQuery__MethItemAssignment_0_1_0 : ( RULE_ID ) ;
    public final void rule__SubQuery__MethItemAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3797:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:3798:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:3798:2: ( RULE_ID )
            // InternalMetaTemplating.g:3799:3: RULE_ID
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
    // InternalMetaTemplating.g:3808:1: rule__SubQuery__MethRefAssignment_0_1_1 : ( ruleMetaPh ) ;
    public final void rule__SubQuery__MethRefAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3812:1: ( ( ruleMetaPh ) )
            // InternalMetaTemplating.g:3813:2: ( ruleMetaPh )
            {
            // InternalMetaTemplating.g:3813:2: ( ruleMetaPh )
            // InternalMetaTemplating.g:3814:3: ruleMetaPh
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
    // InternalMetaTemplating.g:3823:1: rule__SubQuery__ItemAssignment_1_1_0 : ( RULE_ID ) ;
    public final void rule__SubQuery__ItemAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3827:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:3828:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:3828:2: ( RULE_ID )
            // InternalMetaTemplating.g:3829:3: RULE_ID
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
    // InternalMetaTemplating.g:3838:1: rule__SubQuery__RefAssignment_1_1_1 : ( ruleMetaPh ) ;
    public final void rule__SubQuery__RefAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3842:1: ( ( ruleMetaPh ) )
            // InternalMetaTemplating.g:3843:2: ( ruleMetaPh )
            {
            // InternalMetaTemplating.g:3843:2: ( ruleMetaPh )
            // InternalMetaTemplating.g:3844:3: ruleMetaPh
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
    // InternalMetaTemplating.g:3853:1: rule__Ph__PropertyAssignment_1 : ( ruleProperty ) ;
    public final void rule__Ph__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3857:1: ( ( ruleProperty ) )
            // InternalMetaTemplating.g:3858:2: ( ruleProperty )
            {
            // InternalMetaTemplating.g:3858:2: ( ruleProperty )
            // InternalMetaTemplating.g:3859:3: ruleProperty
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
    // InternalMetaTemplating.g:3868:1: rule__Ph__MetaPropertyAssignment_2 : ( ruleMetaProperty ) ;
    public final void rule__Ph__MetaPropertyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3872:1: ( ( ruleMetaProperty ) )
            // InternalMetaTemplating.g:3873:2: ( ruleMetaProperty )
            {
            // InternalMetaTemplating.g:3873:2: ( ruleMetaProperty )
            // InternalMetaTemplating.g:3874:3: ruleMetaProperty
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
    // InternalMetaTemplating.g:3883:1: rule__MetaPh__PropertyAssignment_1 : ( ruleProperty ) ;
    public final void rule__MetaPh__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3887:1: ( ( ruleProperty ) )
            // InternalMetaTemplating.g:3888:2: ( ruleProperty )
            {
            // InternalMetaTemplating.g:3888:2: ( ruleProperty )
            // InternalMetaTemplating.g:3889:3: ruleProperty
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
    // InternalMetaTemplating.g:3898:1: rule__MetaPh__TagAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__MetaPh__TagAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3902:1: ( ( RULE_STRING ) )
            // InternalMetaTemplating.g:3903:2: ( RULE_STRING )
            {
            // InternalMetaTemplating.g:3903:2: ( RULE_STRING )
            // InternalMetaTemplating.g:3904:3: RULE_STRING
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
    // InternalMetaTemplating.g:3913:1: rule__MetaProperty__PropertyAssignment_1 : ( ruleProperty ) ;
    public final void rule__MetaProperty__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3917:1: ( ( ruleProperty ) )
            // InternalMetaTemplating.g:3918:2: ( ruleProperty )
            {
            // InternalMetaTemplating.g:3918:2: ( ruleProperty )
            // InternalMetaTemplating.g:3919:3: ruleProperty
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
    // InternalMetaTemplating.g:3928:1: rule__Property__PropertyAssignment_0 : ( RULE_ID ) ;
    public final void rule__Property__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3932:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:3933:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:3933:2: ( RULE_ID )
            // InternalMetaTemplating.g:3934:3: RULE_ID
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
    // InternalMetaTemplating.g:3943:1: rule__Property__SubPropertiesAssignment_1 : ( ruleSubProperty ) ;
    public final void rule__Property__SubPropertiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3947:1: ( ( ruleSubProperty ) )
            // InternalMetaTemplating.g:3948:2: ( ruleSubProperty )
            {
            // InternalMetaTemplating.g:3948:2: ( ruleSubProperty )
            // InternalMetaTemplating.g:3949:3: ruleSubProperty
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
    // InternalMetaTemplating.g:3958:1: rule__SubProperty__MethodAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__SubProperty__MethodAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3962:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:3963:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:3963:2: ( RULE_ID )
            // InternalMetaTemplating.g:3964:3: RULE_ID
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
    // InternalMetaTemplating.g:3973:1: rule__SubProperty__PropertyAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SubProperty__PropertyAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3977:1: ( ( RULE_ID ) )
            // InternalMetaTemplating.g:3978:2: ( RULE_ID )
            {
            // InternalMetaTemplating.g:3978:2: ( RULE_ID )
            // InternalMetaTemplating.g:3979:3: RULE_ID
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
    // InternalMetaTemplating.g:3988:1: rule__EscapedString__StrAssignment_1 : ( RULE_STRING ) ;
    public final void rule__EscapedString__StrAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:3992:1: ( ( RULE_STRING ) )
            // InternalMetaTemplating.g:3993:2: ( RULE_STRING )
            {
            // InternalMetaTemplating.g:3993:2: ( RULE_STRING )
            // InternalMetaTemplating.g:3994:3: RULE_STRING
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
    // InternalMetaTemplating.g:4003:1: rule__Escaped__CharAssignment_1 : ( ( rule__Escaped__CharAlternatives_1_0 ) ) ;
    public final void rule__Escaped__CharAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaTemplating.g:4007:1: ( ( ( rule__Escaped__CharAlternatives_1_0 ) ) )
            // InternalMetaTemplating.g:4008:2: ( ( rule__Escaped__CharAlternatives_1_0 ) )
            {
            // InternalMetaTemplating.g:4008:2: ( ( rule__Escaped__CharAlternatives_1_0 ) )
            // InternalMetaTemplating.g:4009:3: ( rule__Escaped__CharAlternatives_1_0 )
            {
             before(grammarAccess.getEscapedAccess().getCharAlternatives_1_0()); 
            // InternalMetaTemplating.g:4010:3: ( rule__Escaped__CharAlternatives_1_0 )
            // InternalMetaTemplating.g:4010:4: rule__Escaped__CharAlternatives_1_0
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
    static final String dfa_3s = "\1\47\1\5\1\26\1\5\2\uffff\1\22\1\5\1\4\1\26\3\22";
    static final String dfa_4s = "\1\47\1\21\1\50\1\5\2\uffff\1\53\1\5\1\4\1\50\1\53\1\22\1\53";
    static final String dfa_5s = "\4\uffff\1\2\1\1\7\uffff";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2\13\uffff\1\3",
            "\1\4\20\uffff\1\4\1\5",
            "\1\6",
            "",
            "",
            "\1\11\24\uffff\1\7\3\uffff\1\10",
            "\1\12",
            "\1\13",
            "\1\4\20\uffff\1\4\1\5",
            "\1\11\24\uffff\1\7\1\14\2\uffff\1\10",
            "\1\11",
            "\1\11\24\uffff\1\7\3\uffff\1\10"
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
            return "657:1: rule__SubQuery__Alternatives : ( ( ( rule__SubQuery__Group_0__0 ) ) | ( ( rule__SubQuery__Group_1__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000222AA0024020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000222AA0024022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000222AA0034020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000220000024020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000080000040000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000007FFF800L});

}