/*
 * generated by Xtext 2.24.0
 */
grammar InternalMetaTemplating;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getHeaderHeaderParserRuleCall_0_0());
				}
				lv_header_0_0=ruleHeader
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"header",
						lv_header_0_0,
						"org.xtext.example.mydsl.MetaTemplating.Header");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getContentInstructionsParserRuleCall_1_0());
				}
				lv_content_1_0=ruleInstructions
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"content",
						lv_content_1_0,
						"org.xtext.example.mydsl.MetaTemplating.Instructions");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleHeader
entryRuleHeader returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHeaderRule()); }
	iv_ruleHeader=ruleHeader
	{ $current=$iv_ruleHeader.current; }
	EOF;

// Rule Header
ruleHeader returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getHeaderAccess().getHeaderAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getHeaderAccess().getLibsLibrariesParserRuleCall_1_0());
				}
				lv_libs_1_0=ruleLibraries
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHeaderRule());
					}
					add(
						$current,
						"libs",
						lv_libs_1_0,
						"org.xtext.example.mydsl.MetaTemplating.Libraries");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getHeaderAccess().getImportsImportParserRuleCall_2_0());
				}
				lv_imports_2_0=ruleImport
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHeaderRule());
					}
					add(
						$current,
						"imports",
						lv_imports_2_0,
						"org.xtext.example.mydsl.MetaTemplating.Import");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImportRule()); }
	iv_ruleImport=ruleImport
	{ $current=$iv_ruleImport.current; }
	EOF;

// Rule Import
ruleImport returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='import'
		{
			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
		}
		(
			(
				lv_path_1_0=RULE_STRING
				{
					newLeafNode(lv_path_1_0, grammarAccess.getImportAccess().getPathSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getImportRule());
					}
					setWithLastConsumed(
						$current,
						"path",
						lv_path_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getImportAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRuleLibraries
entryRuleLibraries returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLibrariesRule()); }
	iv_ruleLibraries=ruleLibraries
	{ $current=$iv_ruleLibraries.current; }
	EOF;

// Rule Libraries
ruleLibraries returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='IMPORT'
		{
			newLeafNode(otherlv_0, grammarAccess.getLibrariesAccess().getIMPORTKeyword_0());
		}
		(
			(
				lv_path_1_0=RULE_STRING
				{
					newLeafNode(lv_path_1_0, grammarAccess.getLibrariesAccess().getPathSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLibrariesRule());
					}
					setWithLastConsumed(
						$current,
						"path",
						lv_path_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getLibrariesAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRuleComment
entryRuleComment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommentRule()); }
	iv_ruleComment=ruleComment
	{ $current=$iv_ruleComment.current; }
	EOF;

// Rule Comment
ruleComment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='//'
			{
				newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getSolidusSolidusKeyword_0_0());
			}
			(
				(
					lv_word_1_0=RULE_ID
					{
						newLeafNode(lv_word_1_0, grammarAccess.getCommentAccess().getWordIDTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCommentRule());
						}
						addWithLastConsumed(
							$current,
							"word",
							lv_word_1_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
		    |
		(
			otherlv_2='/*'
			{
				newLeafNode(otherlv_2, grammarAccess.getCommentAccess().getSolidusAsteriskKeyword_1_0());
			}
			(
				(
					lv_word_3_0=RULE_ID
					{
						newLeafNode(lv_word_3_0, grammarAccess.getCommentAccess().getWordIDTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCommentRule());
						}
						addWithLastConsumed(
							$current,
							"word",
							lv_word_3_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_4='*/'
			{
				newLeafNode(otherlv_4, grammarAccess.getCommentAccess().getAsteriskSolidusKeyword_1_2());
			}
		)
	)
;

// Entry rule entryRuleInstructions
entryRuleInstructions returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstructionsRule()); }
	iv_ruleInstructions=ruleInstructions
	{ $current=$iv_ruleInstructions.current; }
	EOF;

// Rule Instructions
ruleInstructions returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getInstructionsAccess().getStatementStatementParserRuleCall_0_0());
				}
				lv_statement_0_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstructionsRule());
					}
					set(
						$current,
						"statement",
						lv_statement_0_0,
						"org.xtext.example.mydsl.MetaTemplating.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getInstructionsAccess().getIteratorIteratorParserRuleCall_1_0());
				}
				lv_iterator_1_0=ruleIterator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstructionsRule());
					}
					set(
						$current,
						"iterator",
						lv_iterator_1_0,
						"org.xtext.example.mydsl.MetaTemplating.Iterator");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getInstructionsAccess().getRuleRuleParserRuleCall_2_0());
				}
				lv_rule_2_0=ruleRule
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstructionsRule());
					}
					set(
						$current,
						"rule",
						lv_rule_2_0,
						"org.xtext.example.mydsl.MetaTemplating.Rule");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getInstructionsAccess().getCommentCommentParserRuleCall_3_0());
				}
				lv_comment_3_0=ruleComment
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstructionsRule());
					}
					set(
						$current,
						"comment",
						lv_comment_3_0,
						"org.xtext.example.mydsl.MetaTemplating.Comment");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_text_0_0=RULE_ID
				{
					newLeafNode(lv_text_0_0, grammarAccess.getStatementAccess().getTextIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStatementRule());
					}
					setWithLastConsumed(
						$current,
						"text",
						lv_text_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getStatementAccess().getCharEscapedParserRuleCall_1_0());
				}
				lv_char_1_0=ruleEscaped
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStatementRule());
					}
					set(
						$current,
						"char",
						lv_char_1_0,
						"org.xtext.example.mydsl.MetaTemplating.Escaped");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getStatementAccess().getStringEscapedStringParserRuleCall_2_0());
				}
				lv_string_2_0=ruleEscapedString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStatementRule());
					}
					set(
						$current,
						"string",
						lv_string_2_0,
						"org.xtext.example.mydsl.MetaTemplating.EscapedString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getStatementAccess().getPlaceholderPhParserRuleCall_3_0());
				}
				lv_placeholder_3_0=rulePh
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStatementRule());
					}
					set(
						$current,
						"placeholder",
						lv_placeholder_3_0,
						"org.xtext.example.mydsl.MetaTemplating.Ph");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getStatementAccess().getMetaPlaceholderMetaPhParserRuleCall_4_0());
				}
				lv_metaPlaceholder_4_0=ruleMetaPh
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStatementRule());
					}
					set(
						$current,
						"metaPlaceholder",
						lv_metaPlaceholder_4_0,
						"org.xtext.example.mydsl.MetaTemplating.MetaPh");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleRule
entryRuleRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRuleRule()); }
	iv_ruleRule=ruleRule
	{ $current=$iv_ruleRule.current; }
	EOF;

// Rule Rule
ruleRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='FORALL'
		{
			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getFORALLKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				lv_element_2_0=RULE_ID
				{
					newLeafNode(lv_element_2_0, grammarAccess.getRuleAccess().getElementIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRuleRule());
					}
					setWithLastConsumed(
						$current,
						"element",
						lv_element_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getColonKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleAccess().getPropertyPropertyParserRuleCall_4_0());
				}
				lv_property_4_0=ruleProperty
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleRule());
					}
					set(
						$current,
						"property",
						lv_property_4_0,
						"org.xtext.example.mydsl.MetaTemplating.Property");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='TAGGED'
		{
			newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getTAGGEDKeyword_5());
		}
		(
			(
				lv_tag_6_0=RULE_ID
				{
					newLeafNode(lv_tag_6_0, grammarAccess.getRuleAccess().getTagIDTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRuleRule());
					}
					setWithLastConsumed(
						$current,
						"tag",
						lv_tag_6_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_7=')'
		{
			newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getRightParenthesisKeyword_7());
		}
		otherlv_8='{'
		{
			newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleAccess().getBodyInstructionsParserRuleCall_9_0());
				}
				lv_body_9_0=ruleInstructions
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleRule());
					}
					add(
						$current,
						"body",
						lv_body_9_0,
						"org.xtext.example.mydsl.MetaTemplating.Instructions");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_10());
		}
	)
;

// Entry rule entryRuleIterator
entryRuleIterator returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIteratorRule()); }
	iv_ruleIterator=ruleIterator
	{ $current=$iv_ruleIterator.current; }
	EOF;

// Rule Iterator
ruleIterator returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='foreach'
		{
			newLeafNode(otherlv_0, grammarAccess.getIteratorAccess().getForeachKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getIteratorAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				lv_element_2_0=RULE_ID
				{
					newLeafNode(lv_element_2_0, grammarAccess.getIteratorAccess().getElementIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIteratorRule());
					}
					setWithLastConsumed(
						$current,
						"element",
						lv_element_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='in'
		{
			newLeafNode(otherlv_3, grammarAccess.getIteratorAccess().getInKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIteratorAccess().getQueryQueryParserRuleCall_4_0());
				}
				lv_query_4_0=ruleQuery
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIteratorRule());
					}
					set(
						$current,
						"query",
						lv_query_4_0,
						"org.xtext.example.mydsl.MetaTemplating.Query");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getIteratorAccess().getRightParenthesisKeyword_5());
		}
		otherlv_6='{'
		{
			newLeafNode(otherlv_6, grammarAccess.getIteratorAccess().getLeftCurlyBracketKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIteratorAccess().getBodyInstructionsParserRuleCall_7_0());
				}
				lv_body_7_0=ruleInstructions
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIteratorRule());
					}
					add(
						$current,
						"body",
						lv_body_7_0,
						"org.xtext.example.mydsl.MetaTemplating.Instructions");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getIteratorAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleQuery
entryRuleQuery returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getQueryRule()); }
	iv_ruleQuery=ruleQuery
	{ $current=$iv_ruleQuery.current; }
	EOF;

// Rule Query
ruleQuery returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					lv_item_0_0=RULE_ID
					{
						newLeafNode(lv_item_0_0, grammarAccess.getQueryAccess().getItemIDTerminalRuleCall_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getQueryRule());
						}
						setWithLastConsumed(
							$current,
							"item",
							lv_item_0_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getQueryAccess().getRefMetaPhParserRuleCall_0_1_0());
					}
					lv_ref_1_0=ruleMetaPh
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getQueryRule());
						}
						set(
							$current,
							"ref",
							lv_ref_1_0,
							"org.xtext.example.mydsl.MetaTemplating.MetaPh");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getQueryAccess().getSubQuerySubQueryParserRuleCall_1_0());
				}
				lv_subQuery_2_0=ruleSubQuery
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getQueryRule());
					}
					add(
						$current,
						"subQuery",
						lv_subQuery_2_0,
						"org.xtext.example.mydsl.MetaTemplating.SubQuery");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleSubQuery
entryRuleSubQuery returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSubQueryRule()); }
	iv_ruleSubQuery=ruleSubQuery
	{ $current=$iv_ruleSubQuery.current; }
	EOF;

// Rule SubQuery
ruleSubQuery returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='.'
		{
			newLeafNode(otherlv_0, grammarAccess.getSubQueryAccess().getFullStopKeyword_0());
		}
		(
			(
				(
					lv_item_1_0=RULE_ID
					{
						newLeafNode(lv_item_1_0, grammarAccess.getSubQueryAccess().getItemIDTerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSubQueryRule());
						}
						setWithLastConsumed(
							$current,
							"item",
							lv_item_1_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getSubQueryAccess().getRefMetaPhParserRuleCall_1_1_0());
					}
					lv_ref_2_0=ruleMetaPh
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSubQueryRule());
						}
						set(
							$current,
							"ref",
							lv_ref_2_0,
							"org.xtext.example.mydsl.MetaTemplating.MetaPh");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		(
			otherlv_3='()'
			{
				newLeafNode(otherlv_3, grammarAccess.getSubQueryAccess().getLeftParenthesisRightParenthesisKeyword_2());
			}
		)?
	)
;

// Entry rule entryRulePh
entryRulePh returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPhRule()); }
	iv_rulePh=rulePh
	{ $current=$iv_rulePh.current; }
	EOF;

// Rule Ph
rulePh returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='[['
		{
			newLeafNode(otherlv_0, grammarAccess.getPhAccess().getLeftSquareBracketLeftSquareBracketKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPhAccess().getPropertyPropertyParserRuleCall_1_0());
				}
				lv_property_1_0=ruleProperty
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPhRule());
					}
					set(
						$current,
						"property",
						lv_property_1_0,
						"org.xtext.example.mydsl.MetaTemplating.Property");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPhAccess().getMetaPropertyMetaPropertyParserRuleCall_2_0());
				}
				lv_metaProperty_2_0=ruleMetaProperty
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPhRule());
					}
					set(
						$current,
						"metaProperty",
						lv_metaProperty_2_0,
						"org.xtext.example.mydsl.MetaTemplating.MetaProperty");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_3=']]'
		{
			newLeafNode(otherlv_3, grammarAccess.getPhAccess().getRightSquareBracketRightSquareBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleMetaPh
entryRuleMetaPh returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMetaPhRule()); }
	iv_ruleMetaPh=ruleMetaPh
	{ $current=$iv_ruleMetaPh.current; }
	EOF;

// Rule MetaPh
ruleMetaPh returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='['
		{
			newLeafNode(otherlv_0, grammarAccess.getMetaPhAccess().getLeftSquareBracketKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMetaPhAccess().getPropertyPropertyParserRuleCall_1_0());
				}
				lv_property_1_0=ruleProperty
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMetaPhRule());
					}
					set(
						$current,
						"property",
						lv_property_1_0,
						"org.xtext.example.mydsl.MetaTemplating.Property");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2='TAGINFO'
			{
				newLeafNode(otherlv_2, grammarAccess.getMetaPhAccess().getTAGINFOKeyword_2_0());
			}
			(
				(
					lv_tag_3_0=RULE_STRING
					{
						newLeafNode(lv_tag_3_0, grammarAccess.getMetaPhAccess().getTagSTRINGTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMetaPhRule());
						}
						setWithLastConsumed(
							$current,
							"tag",
							lv_tag_3_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		otherlv_4=']'
		{
			newLeafNode(otherlv_4, grammarAccess.getMetaPhAccess().getRightSquareBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleMetaProperty
entryRuleMetaProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMetaPropertyRule()); }
	iv_ruleMetaProperty=ruleMetaProperty
	{ $current=$iv_ruleMetaProperty.current; }
	EOF;

// Rule MetaProperty
ruleMetaProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='.{'
		{
			newLeafNode(otherlv_0, grammarAccess.getMetaPropertyAccess().getFullStopLeftCurlyBracketKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMetaPropertyAccess().getPropertyPropertyParserRuleCall_1_0());
				}
				lv_property_1_0=ruleProperty
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMetaPropertyRule());
					}
					set(
						$current,
						"property",
						lv_property_1_0,
						"org.xtext.example.mydsl.MetaTemplating.Property");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='}'
		{
			newLeafNode(otherlv_2, grammarAccess.getMetaPropertyAccess().getRightCurlyBracketKeyword_2());
		}
	)
;

// Entry rule entryRuleProperty
entryRuleProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyRule()); }
	iv_ruleProperty=ruleProperty
	{ $current=$iv_ruleProperty.current; }
	EOF;

// Rule Property
ruleProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_property_0_0=RULE_ID
				{
					newLeafNode(lv_property_0_0, grammarAccess.getPropertyAccess().getPropertyIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertyRule());
					}
					setWithLastConsumed(
						$current,
						"property",
						lv_property_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPropertyAccess().getSubPropertiesSubPropertyParserRuleCall_1_0());
				}
				lv_subProperties_1_0=ruleSubProperty
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPropertyRule());
					}
					add(
						$current,
						"subProperties",
						lv_subProperties_1_0,
						"org.xtext.example.mydsl.MetaTemplating.SubProperty");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleSubProperty
entryRuleSubProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSubPropertyRule()); }
	iv_ruleSubProperty=ruleSubProperty
	{ $current=$iv_ruleSubProperty.current; }
	EOF;

// Rule SubProperty
ruleSubProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='.'
		{
			newLeafNode(otherlv_0, grammarAccess.getSubPropertyAccess().getFullStopKeyword_0());
		}
		(
			(
				lv_property_1_0=RULE_ID
				{
					newLeafNode(lv_property_1_0, grammarAccess.getSubPropertyAccess().getPropertyIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSubPropertyRule());
					}
					setWithLastConsumed(
						$current,
						"property",
						lv_property_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='()'
			{
				newLeafNode(otherlv_2, grammarAccess.getSubPropertyAccess().getLeftParenthesisRightParenthesisKeyword_2());
			}
		)?
	)
;

// Entry rule entryRuleEscapedString
entryRuleEscapedString returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEscapedStringRule()); }
	iv_ruleEscapedString=ruleEscapedString
	{ $current=$iv_ruleEscapedString.current; }
	EOF;

// Rule EscapedString
ruleEscapedString returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='@{'
		{
			newLeafNode(otherlv_0, grammarAccess.getEscapedStringAccess().getCommercialAtLeftCurlyBracketKeyword_0());
		}
		(
			(
				lv_str_1_0=RULE_STRING
				{
					newLeafNode(lv_str_1_0, grammarAccess.getEscapedStringAccess().getStrSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEscapedStringRule());
					}
					setWithLastConsumed(
						$current,
						"str",
						lv_str_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2='}@'
		{
			newLeafNode(otherlv_2, grammarAccess.getEscapedStringAccess().getRightCurlyBracketCommercialAtKeyword_2());
		}
	)
;

// Entry rule entryRuleEscaped
entryRuleEscaped returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEscapedRule()); }
	iv_ruleEscaped=ruleEscaped
	{ $current=$iv_ruleEscaped.current; }
	EOF;

// Rule Escaped
ruleEscaped returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#'
		{
			newLeafNode(otherlv_0, grammarAccess.getEscapedAccess().getNumberSignKeyword_0());
		}
		(
			(
				(
					lv_char_1_1='#'
					{
						newLeafNode(lv_char_1_1, grammarAccess.getEscapedAccess().getCharNumberSignKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEscapedRule());
						}
						setWithLastConsumed($current, "char", lv_char_1_1, null);
					}
					    |
					lv_char_1_2='{'
					{
						newLeafNode(lv_char_1_2, grammarAccess.getEscapedAccess().getCharLeftCurlyBracketKeyword_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEscapedRule());
						}
						setWithLastConsumed($current, "char", lv_char_1_2, null);
					}
					    |
					lv_char_1_3='}'
					{
						newLeafNode(lv_char_1_3, grammarAccess.getEscapedAccess().getCharRightCurlyBracketKeyword_1_0_2());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEscapedRule());
						}
						setWithLastConsumed($current, "char", lv_char_1_3, null);
					}
					    |
					lv_char_1_4='['
					{
						newLeafNode(lv_char_1_4, grammarAccess.getEscapedAccess().getCharLeftSquareBracketKeyword_1_0_3());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEscapedRule());
						}
						setWithLastConsumed($current, "char", lv_char_1_4, null);
					}
					    |
					lv_char_1_5=']'
					{
						newLeafNode(lv_char_1_5, grammarAccess.getEscapedAccess().getCharRightSquareBracketKeyword_1_0_4());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEscapedRule());
						}
						setWithLastConsumed($current, "char", lv_char_1_5, null);
					}
					    |
					lv_char_1_6=','
					{
						newLeafNode(lv_char_1_6, grammarAccess.getEscapedAccess().getCharCommaKeyword_1_0_5());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEscapedRule());
						}
						setWithLastConsumed($current, "char", lv_char_1_6, null);
					}
					    |
					lv_char_1_7=';'
					{
						newLeafNode(lv_char_1_7, grammarAccess.getEscapedAccess().getCharSemicolonKeyword_1_0_6());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEscapedRule());
						}
						setWithLastConsumed($current, "char", lv_char_1_7, null);
					}
					    |
					lv_char_1_8='('
					{
						newLeafNode(lv_char_1_8, grammarAccess.getEscapedAccess().getCharLeftParenthesisKeyword_1_0_7());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEscapedRule());
						}
						setWithLastConsumed($current, "char", lv_char_1_8, null);
					}
					    |
					lv_char_1_9=')'
					{
						newLeafNode(lv_char_1_9, grammarAccess.getEscapedAccess().getCharRightParenthesisKeyword_1_0_8());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEscapedRule());
						}
						setWithLastConsumed($current, "char", lv_char_1_9, null);
					}
					    |
					lv_char_1_10=':'
					{
						newLeafNode(lv_char_1_10, grammarAccess.getEscapedAccess().getCharColonKeyword_1_0_9());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEscapedRule());
						}
						setWithLastConsumed($current, "char", lv_char_1_10, null);
					}
					    |
					lv_char_1_11='<'
					{
						newLeafNode(lv_char_1_11, grammarAccess.getEscapedAccess().getCharLessThanSignKeyword_1_0_10());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEscapedRule());
						}
						setWithLastConsumed($current, "char", lv_char_1_11, null);
					}
					    |
					lv_char_1_12='>'
					{
						newLeafNode(lv_char_1_12, grammarAccess.getEscapedAccess().getCharGreaterThanSignKeyword_1_0_11());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEscapedRule());
						}
						setWithLastConsumed($current, "char", lv_char_1_12, null);
					}
					    |
					lv_char_1_13='\''
					{
						newLeafNode(lv_char_1_13, grammarAccess.getEscapedAccess().getCharApostropheKeyword_1_0_12());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEscapedRule());
						}
						setWithLastConsumed($current, "char", lv_char_1_13, null);
					}
				)
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
