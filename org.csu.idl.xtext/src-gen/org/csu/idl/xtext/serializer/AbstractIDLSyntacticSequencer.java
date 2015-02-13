package org.csu.idl.xtext.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.csu.idl.xtext.services.IDLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractIDLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected IDLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_case_stmt___DefaultKeyword_0_0_1_0_ColonKeyword_0_0_1_1__a;
	protected AbstractElementAlias match_case_stmt___DefaultKeyword_0_0_1_0_ColonKeyword_0_0_1_1__p;
	protected AbstractElementAlias match_case_stmt___DefaultKeyword_1_0_1_0_ColonKeyword_1_0_1_1__a;
	protected AbstractElementAlias match_case_stmt___DefaultKeyword_1_0_1_0_ColonKeyword_1_0_1_1__p;
	protected AbstractElementAlias match_interface_decl_SemicolonKeyword_5_1_a;
	protected AbstractElementAlias match_interface_fwd___AbstractKeyword_0_0_or_LocalKeyword_0_1__q;
	protected AbstractElementAlias match_module_SemicolonKeyword_3_1_a;
	protected AbstractElementAlias match_primary_expr_LeftParenthesisKeyword_2_0_a;
	protected AbstractElementAlias match_primary_expr_LeftParenthesisKeyword_2_0_p;
	protected AbstractElementAlias match_type_decl_Constr_forward_declParserRuleCall_5_or___NativeKeyword_4_0_IDTerminalRuleCall_4_1__;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (IDLGrammarAccess) access;
		match_case_stmt___DefaultKeyword_0_0_1_0_ColonKeyword_0_0_1_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getCase_stmtAccess().getDefaultKeyword_0_0_1_0()), new TokenAlias(false, false, grammarAccess.getCase_stmtAccess().getColonKeyword_0_0_1_1()));
		match_case_stmt___DefaultKeyword_0_0_1_0_ColonKeyword_0_0_1_1__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getCase_stmtAccess().getDefaultKeyword_0_0_1_0()), new TokenAlias(false, false, grammarAccess.getCase_stmtAccess().getColonKeyword_0_0_1_1()));
		match_case_stmt___DefaultKeyword_1_0_1_0_ColonKeyword_1_0_1_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getCase_stmtAccess().getDefaultKeyword_1_0_1_0()), new TokenAlias(false, false, grammarAccess.getCase_stmtAccess().getColonKeyword_1_0_1_1()));
		match_case_stmt___DefaultKeyword_1_0_1_0_ColonKeyword_1_0_1_1__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getCase_stmtAccess().getDefaultKeyword_1_0_1_0()), new TokenAlias(false, false, grammarAccess.getCase_stmtAccess().getColonKeyword_1_0_1_1()));
		match_interface_decl_SemicolonKeyword_5_1_a = new TokenAlias(true, true, grammarAccess.getInterface_declAccess().getSemicolonKeyword_5_1());
		match_interface_fwd___AbstractKeyword_0_0_or_LocalKeyword_0_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getInterface_fwdAccess().getAbstractKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getInterface_fwdAccess().getLocalKeyword_0_1()));
		match_module_SemicolonKeyword_3_1_a = new TokenAlias(true, true, grammarAccess.getModuleAccess().getSemicolonKeyword_3_1());
		match_primary_expr_LeftParenthesisKeyword_2_0_a = new TokenAlias(true, true, grammarAccess.getPrimary_exprAccess().getLeftParenthesisKeyword_2_0());
		match_primary_expr_LeftParenthesisKeyword_2_0_p = new TokenAlias(true, false, grammarAccess.getPrimary_exprAccess().getLeftParenthesisKeyword_2_0());
		match_type_decl_Constr_forward_declParserRuleCall_5_or___NativeKeyword_4_0_IDTerminalRuleCall_4_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getType_declAccess().getNativeKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getType_declAccess().getIDTerminalRuleCall_4_1())), new TokenAlias(false, false, grammarAccess.getType_declAccess().getConstr_forward_declParserRuleCall_5()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getConstr_forward_declRule())
			return getconstr_forward_declToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ID :
	 * 	('a'..'z'|'A'..'Z'|'_'|'::') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'::')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * constr_forward_decl
	 * 	:	'struct' ID
	 * 	|	'union' ID
	 * 	;
	 */
	protected String getconstr_forward_declToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "struct";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_case_stmt___DefaultKeyword_0_0_1_0_ColonKeyword_0_0_1_1__a.equals(syntax))
				emit_case_stmt___DefaultKeyword_0_0_1_0_ColonKeyword_0_0_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_case_stmt___DefaultKeyword_0_0_1_0_ColonKeyword_0_0_1_1__p.equals(syntax))
				emit_case_stmt___DefaultKeyword_0_0_1_0_ColonKeyword_0_0_1_1__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_case_stmt___DefaultKeyword_1_0_1_0_ColonKeyword_1_0_1_1__a.equals(syntax))
				emit_case_stmt___DefaultKeyword_1_0_1_0_ColonKeyword_1_0_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_case_stmt___DefaultKeyword_1_0_1_0_ColonKeyword_1_0_1_1__p.equals(syntax))
				emit_case_stmt___DefaultKeyword_1_0_1_0_ColonKeyword_1_0_1_1__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_interface_decl_SemicolonKeyword_5_1_a.equals(syntax))
				emit_interface_decl_SemicolonKeyword_5_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_interface_fwd___AbstractKeyword_0_0_or_LocalKeyword_0_1__q.equals(syntax))
				emit_interface_fwd___AbstractKeyword_0_0_or_LocalKeyword_0_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_module_SemicolonKeyword_3_1_a.equals(syntax))
				emit_module_SemicolonKeyword_3_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_primary_expr_LeftParenthesisKeyword_2_0_a.equals(syntax))
				emit_primary_expr_LeftParenthesisKeyword_2_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_primary_expr_LeftParenthesisKeyword_2_0_p.equals(syntax))
				emit_primary_expr_LeftParenthesisKeyword_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_type_decl_Constr_forward_declParserRuleCall_5_or___NativeKeyword_4_0_IDTerminalRuleCall_4_1__.equals(syntax))
				emit_type_decl_Constr_forward_declParserRuleCall_5_or___NativeKeyword_4_0_IDTerminalRuleCall_4_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('default' ':')*
	 */
	protected void emit_case_stmt___DefaultKeyword_0_0_1_0_ColonKeyword_0_0_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('default' ':')+
	 */
	protected void emit_case_stmt___DefaultKeyword_0_0_1_0_ColonKeyword_0_0_1_1__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('default' ':')*
	 */
	protected void emit_case_stmt___DefaultKeyword_1_0_1_0_ColonKeyword_1_0_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('default' ':')+
	 */
	protected void emit_case_stmt___DefaultKeyword_1_0_1_0_ColonKeyword_1_0_1_1__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'*
	 */
	protected void emit_interface_decl_SemicolonKeyword_5_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('abstract' | 'local')?
	 */
	protected void emit_interface_fwd___AbstractKeyword_0_0_or_LocalKeyword_0_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'*
	 */
	protected void emit_module_SemicolonKeyword_3_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_primary_expr_LeftParenthesisKeyword_2_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_primary_expr_LeftParenthesisKeyword_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     constr_forward_decl | ('native' ID)
	 */
	protected void emit_type_decl_Constr_forward_declParserRuleCall_5_or___NativeKeyword_4_0_IDTerminalRuleCall_4_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
