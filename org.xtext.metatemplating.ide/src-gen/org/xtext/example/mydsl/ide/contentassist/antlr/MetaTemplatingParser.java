/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMetaTemplatingParser;
import org.xtext.example.mydsl.services.MetaTemplatingGrammarAccess;

public class MetaTemplatingParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MetaTemplatingGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MetaTemplatingGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getInstructionsAccess().getAlternatives(), "rule__Instructions__Alternatives");
			builder.put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
			builder.put(grammarAccess.getQueryAccess().getAlternatives_0(), "rule__Query__Alternatives_0");
			builder.put(grammarAccess.getSubQueryAccess().getAlternatives(), "rule__SubQuery__Alternatives");
			builder.put(grammarAccess.getSubQueryAccess().getAlternatives_0_1(), "rule__SubQuery__Alternatives_0_1");
			builder.put(grammarAccess.getSubQueryAccess().getAlternatives_1_1(), "rule__SubQuery__Alternatives_1_1");
			builder.put(grammarAccess.getSubPropertyAccess().getAlternatives(), "rule__SubProperty__Alternatives");
			builder.put(grammarAccess.getEscapedAccess().getCharAlternatives_1_0(), "rule__Escaped__CharAlternatives_1_0");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getHeaderAccess().getGroup(), "rule__Header__Group__0");
			builder.put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
			builder.put(grammarAccess.getLibrariesAccess().getGroup(), "rule__Libraries__Group__0");
			builder.put(grammarAccess.getNoteAccess().getGroup(), "rule__Note__Group__0");
			builder.put(grammarAccess.getMetaFilterAccess().getGroup(), "rule__MetaFilter__Group__0");
			builder.put(grammarAccess.getMetaFilterAccess().getGroup_7(), "rule__MetaFilter__Group_7__0");
			builder.put(grammarAccess.getFilterAccess().getGroup(), "rule__Filter__Group__0");
			builder.put(grammarAccess.getFilterAccess().getGroup_7(), "rule__Filter__Group_7__0");
			builder.put(grammarAccess.getRuleAccess().getGroup(), "rule__Rule__Group__0");
			builder.put(grammarAccess.getIteratorAccess().getGroup(), "rule__Iterator__Group__0");
			builder.put(grammarAccess.getQueryAccess().getGroup(), "rule__Query__Group__0");
			builder.put(grammarAccess.getSubQueryAccess().getGroup_0(), "rule__SubQuery__Group_0__0");
			builder.put(grammarAccess.getSubQueryAccess().getGroup_1(), "rule__SubQuery__Group_1__0");
			builder.put(grammarAccess.getPhAccess().getGroup(), "rule__Ph__Group__0");
			builder.put(grammarAccess.getMetaPhAccess().getGroup(), "rule__MetaPh__Group__0");
			builder.put(grammarAccess.getMetaPhAccess().getGroup_2(), "rule__MetaPh__Group_2__0");
			builder.put(grammarAccess.getMetaPropertyAccess().getGroup(), "rule__MetaProperty__Group__0");
			builder.put(grammarAccess.getPropertyAccess().getGroup(), "rule__Property__Group__0");
			builder.put(grammarAccess.getSubPropertyAccess().getGroup_0(), "rule__SubProperty__Group_0__0");
			builder.put(grammarAccess.getSubPropertyAccess().getGroup_1(), "rule__SubProperty__Group_1__0");
			builder.put(grammarAccess.getEscapedStringAccess().getGroup(), "rule__EscapedString__Group__0");
			builder.put(grammarAccess.getEscapedAccess().getGroup(), "rule__Escaped__Group__0");
			builder.put(grammarAccess.getModelAccess().getHeaderAssignment_0(), "rule__Model__HeaderAssignment_0");
			builder.put(grammarAccess.getModelAccess().getContentAssignment_1(), "rule__Model__ContentAssignment_1");
			builder.put(grammarAccess.getHeaderAccess().getLibsAssignment_1(), "rule__Header__LibsAssignment_1");
			builder.put(grammarAccess.getHeaderAccess().getImportsAssignment_2(), "rule__Header__ImportsAssignment_2");
			builder.put(grammarAccess.getImportAccess().getPathAssignment_1(), "rule__Import__PathAssignment_1");
			builder.put(grammarAccess.getLibrariesAccess().getPathAssignment_1(), "rule__Libraries__PathAssignment_1");
			builder.put(grammarAccess.getNoteAccess().getWordAssignment_1(), "rule__Note__WordAssignment_1");
			builder.put(grammarAccess.getInstructionsAccess().getNoteAssignment_0(), "rule__Instructions__NoteAssignment_0");
			builder.put(grammarAccess.getInstructionsAccess().getStatementAssignment_1(), "rule__Instructions__StatementAssignment_1");
			builder.put(grammarAccess.getInstructionsAccess().getFilterAssignment_2(), "rule__Instructions__FilterAssignment_2");
			builder.put(grammarAccess.getInstructionsAccess().getMetaFilterAssignment_3(), "rule__Instructions__MetaFilterAssignment_3");
			builder.put(grammarAccess.getInstructionsAccess().getIteratorAssignment_4(), "rule__Instructions__IteratorAssignment_4");
			builder.put(grammarAccess.getInstructionsAccess().getRuleAssignment_5(), "rule__Instructions__RuleAssignment_5");
			builder.put(grammarAccess.getStatementAccess().getTextAssignment_0(), "rule__Statement__TextAssignment_0");
			builder.put(grammarAccess.getStatementAccess().getCharAssignment_1(), "rule__Statement__CharAssignment_1");
			builder.put(grammarAccess.getStatementAccess().getStringAssignment_2(), "rule__Statement__StringAssignment_2");
			builder.put(grammarAccess.getStatementAccess().getPlaceholderAssignment_3(), "rule__Statement__PlaceholderAssignment_3");
			builder.put(grammarAccess.getStatementAccess().getMetaPlaceholderAssignment_4(), "rule__Statement__MetaPlaceholderAssignment_4");
			builder.put(grammarAccess.getMetaFilterAccess().getConditionAssignment_2(), "rule__MetaFilter__ConditionAssignment_2");
			builder.put(grammarAccess.getMetaFilterAccess().getTruebodyAssignment_5(), "rule__MetaFilter__TruebodyAssignment_5");
			builder.put(grammarAccess.getMetaFilterAccess().getFalsebodyAssignment_7_2(), "rule__MetaFilter__FalsebodyAssignment_7_2");
			builder.put(grammarAccess.getFilterAccess().getConditionAssignment_2(), "rule__Filter__ConditionAssignment_2");
			builder.put(grammarAccess.getFilterAccess().getTruebodyAssignment_5(), "rule__Filter__TruebodyAssignment_5");
			builder.put(grammarAccess.getFilterAccess().getFalsebodyAssignment_7_2(), "rule__Filter__FalsebodyAssignment_7_2");
			builder.put(grammarAccess.getRuleAccess().getElementAssignment_2(), "rule__Rule__ElementAssignment_2");
			builder.put(grammarAccess.getRuleAccess().getPropertyAssignment_4(), "rule__Rule__PropertyAssignment_4");
			builder.put(grammarAccess.getRuleAccess().getTagAssignment_6(), "rule__Rule__TagAssignment_6");
			builder.put(grammarAccess.getRuleAccess().getBodyAssignment_9(), "rule__Rule__BodyAssignment_9");
			builder.put(grammarAccess.getIteratorAccess().getElementAssignment_2(), "rule__Iterator__ElementAssignment_2");
			builder.put(grammarAccess.getIteratorAccess().getQueryAssignment_4(), "rule__Iterator__QueryAssignment_4");
			builder.put(grammarAccess.getIteratorAccess().getBodyAssignment_7(), "rule__Iterator__BodyAssignment_7");
			builder.put(grammarAccess.getQueryAccess().getItemAssignment_0_0(), "rule__Query__ItemAssignment_0_0");
			builder.put(grammarAccess.getQueryAccess().getRefAssignment_0_1(), "rule__Query__RefAssignment_0_1");
			builder.put(grammarAccess.getQueryAccess().getSubQueryAssignment_1(), "rule__Query__SubQueryAssignment_1");
			builder.put(grammarAccess.getSubQueryAccess().getMethItemAssignment_0_1_0(), "rule__SubQuery__MethItemAssignment_0_1_0");
			builder.put(grammarAccess.getSubQueryAccess().getMethRefAssignment_0_1_1(), "rule__SubQuery__MethRefAssignment_0_1_1");
			builder.put(grammarAccess.getSubQueryAccess().getItemAssignment_1_1_0(), "rule__SubQuery__ItemAssignment_1_1_0");
			builder.put(grammarAccess.getSubQueryAccess().getRefAssignment_1_1_1(), "rule__SubQuery__RefAssignment_1_1_1");
			builder.put(grammarAccess.getPhAccess().getPropertyAssignment_1(), "rule__Ph__PropertyAssignment_1");
			builder.put(grammarAccess.getPhAccess().getMetaPropertyAssignment_2(), "rule__Ph__MetaPropertyAssignment_2");
			builder.put(grammarAccess.getMetaPhAccess().getPropertyAssignment_1(), "rule__MetaPh__PropertyAssignment_1");
			builder.put(grammarAccess.getMetaPhAccess().getTagAssignment_2_1(), "rule__MetaPh__TagAssignment_2_1");
			builder.put(grammarAccess.getMetaPropertyAccess().getPropertyAssignment_1(), "rule__MetaProperty__PropertyAssignment_1");
			builder.put(grammarAccess.getPropertyAccess().getPropertyAssignment_0(), "rule__Property__PropertyAssignment_0");
			builder.put(grammarAccess.getPropertyAccess().getSubPropertiesAssignment_1(), "rule__Property__SubPropertiesAssignment_1");
			builder.put(grammarAccess.getSubPropertyAccess().getMethodAssignment_0_1(), "rule__SubProperty__MethodAssignment_0_1");
			builder.put(grammarAccess.getSubPropertyAccess().getPropertyAssignment_1_1(), "rule__SubProperty__PropertyAssignment_1_1");
			builder.put(grammarAccess.getEscapedStringAccess().getStrAssignment_1(), "rule__EscapedString__StrAssignment_1");
			builder.put(grammarAccess.getEscapedAccess().getCharAssignment_1(), "rule__Escaped__CharAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MetaTemplatingGrammarAccess grammarAccess;

	@Override
	protected InternalMetaTemplatingParser createParser() {
		InternalMetaTemplatingParser result = new InternalMetaTemplatingParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MetaTemplatingGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MetaTemplatingGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
