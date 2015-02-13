package org.csu.idl.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.csu.idl.idlmm.AliasDef;
import org.csu.idl.idlmm.ArrayDef;
import org.csu.idl.idlmm.AttributeDef;
import org.csu.idl.idlmm.BinaryExpression;
import org.csu.idl.idlmm.ConstantDef;
import org.csu.idl.idlmm.ConstantDefRef;
import org.csu.idl.idlmm.EnumDef;
import org.csu.idl.idlmm.EnumMember;
import org.csu.idl.idlmm.ExceptionDef;
import org.csu.idl.idlmm.Field;
import org.csu.idl.idlmm.FixedDef;
import org.csu.idl.idlmm.ForwardDef;
import org.csu.idl.idlmm.IdlmmPackage;
import org.csu.idl.idlmm.Include;
import org.csu.idl.idlmm.InterfaceDef;
import org.csu.idl.idlmm.ModuleDef;
import org.csu.idl.idlmm.OperationDef;
import org.csu.idl.idlmm.ParameterDef;
import org.csu.idl.idlmm.PrimitiveDef;
import org.csu.idl.idlmm.SequenceDef;
import org.csu.idl.idlmm.StringDef;
import org.csu.idl.idlmm.StructDef;
import org.csu.idl.idlmm.TranslationUnit;
import org.csu.idl.idlmm.UnaryExpression;
import org.csu.idl.idlmm.UnionDef;
import org.csu.idl.idlmm.UnionField;
import org.csu.idl.idlmm.ValueExpression;
import org.csu.idl.idlmm.WstringDef;
import org.csu.idl.xtext.services.IDLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractIDLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private IDLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == IdlmmPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case IdlmmPackage.ALIAS_DEF:
				if(context == grammarAccess.getAlias_typeRule() ||
				   context == grammarAccess.getDefinitionRule() ||
				   context == grammarAccess.getExportRule() ||
				   context == grammarAccess.getType_declRule()) {
					sequence_alias_type(context, (AliasDef) semanticObject); 
					return; 
				}
				else break;
			case IdlmmPackage.ARRAY_DEF:
				if(context == grammarAccess.getArray_type_specRule()) {
					sequence_array_type_spec(context, (ArrayDef) semanticObject); 
					return; 
				}
				else break;
			case IdlmmPackage.ATTRIBUTE_DEF:
				if(context == grammarAccess.getAttr_declRule() ||
				   context == grammarAccess.getExportRule()) {
					sequence_attr_decl_attr_spec_readonly_attr_spec(context, (AttributeDef) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAttr_specRule()) {
					sequence_attr_spec(context, (AttributeDef) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getReadonly_attr_specRule()) {
					sequence_readonly_attr_spec(context, (AttributeDef) semanticObject); 
					return; 
				}
				else break;
			case IdlmmPackage.BINARY_EXPRESSION:
				if(context == grammarAccess.getAdd_exprRule() ||
				   context == grammarAccess.getAdd_exprAccess().getBinaryExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAnd_exprRule() ||
				   context == grammarAccess.getAnd_exprAccess().getBinaryExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConst_expRule() ||
				   context == grammarAccess.getMult_exprRule() ||
				   context == grammarAccess.getMult_exprAccess().getBinaryExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOr_exprRule() ||
				   context == grammarAccess.getOr_exprAccess().getBinaryExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPrimary_exprRule() ||
				   context == grammarAccess.getShift_exprRule() ||
				   context == grammarAccess.getShift_exprAccess().getBinaryExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUnary_exprRule() ||
				   context == grammarAccess.getXor_exprRule() ||
				   context == grammarAccess.getXor_exprAccess().getBinaryExpressionLeftAction_1_0()) {
					sequence_add_expr_and_expr_mult_expr_or_expr_shift_expr_xor_expr(context, (BinaryExpression) semanticObject); 
					return; 
				}
				else break;
			case IdlmmPackage.CONSTANT_DEF:
				if(context == grammarAccess.getConst_declRule() ||
				   context == grammarAccess.getDefinitionRule() ||
				   context == grammarAccess.getExportRule()) {
					sequence_const_decl(context, (ConstantDef) semanticObject); 
					return; 
				}
				else break;
			case IdlmmPackage.CONSTANT_DEF_REF:
				if(context == grammarAccess.getAdd_exprRule() ||
				   context == grammarAccess.getAdd_exprAccess().getBinaryExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAnd_exprRule() ||
				   context == grammarAccess.getAnd_exprAccess().getBinaryExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConst_expRule() ||
				   context == grammarAccess.getConstantDefRefRule() ||
				   context == grammarAccess.getMult_exprRule() ||
				   context == grammarAccess.getMult_exprAccess().getBinaryExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOr_exprRule() ||
				   context == grammarAccess.getOr_exprAccess().getBinaryExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPrimary_exprRule() ||
				   context == grammarAccess.getShift_exprRule() ||
				   context == grammarAccess.getShift_exprAccess().getBinaryExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUnary_exprRule() ||
				   context == grammarAccess.getXor_exprRule() ||
				   context == grammarAccess.getXor_exprAccess().getBinaryExpressionLeftAction_1_0()) {
					sequence_constantDefRef(context, (ConstantDefRef) semanticObject); 
					return; 
				}
				else break;
			case IdlmmPackage.ENUM_DEF:
				if(context == grammarAccess.getConstr_type_specRule() ||
				   context == grammarAccess.getDefinitionRule() ||
				   context == grammarAccess.getEnum_typeRule() ||
				   context == grammarAccess.getExportRule() ||
				   context == grammarAccess.getSwitch_type_spec_contRule() ||
				   context == grammarAccess.getType_declRule()) {
					sequence_enum_type(context, (EnumDef) semanticObject); 
					return; 
				}
				else break;
			case IdlmmPackage.ENUM_MEMBER:
				if(context == grammarAccess.getEnum_memberRule()) {
					sequence_enum_member(context, (EnumMember) semanticObject); 
					return; 
				}
				else break;
			case IdlmmPackage.EXCEPTION_DEF:
				if(context == grammarAccess.getDefinitionRule() ||
				   context == grammarAccess.getExcept_declRule() ||
				   context == grammarAccess.getExportRule()) {
					sequence_except_decl(context, (ExceptionDef) semanticObject); 
					return; 
				}
				else break;
			case IdlmmPackage.FIELD:
				if(context == grammarAccess.getMemberRule()) {
					sequence_member(context, (Field) semanticObject); 
					return; 
				}
				else break;
			case IdlmmPackage.FIXED_DEF:
				if(context == grammarAccess.getConst_typeRule() ||
				   context == grammarAccess.getFixed_pt_const_typeRule()) {
					sequence_fixed_pt_const_type(context, (FixedDef) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFixed_pt_typeRule() ||
				   context == grammarAccess.getSimple_type_specRule() ||
				   context == grammarAccess.getTemplate_type_specRule()) {
					sequence_fixed_pt_type(context, (FixedDef) semanticObject); 
					return; 
				}
				else break;
			case IdlmmPackage.FORWARD_DEF:
				if(context == grammarAccess.getDefinitionRule() ||
				   context == grammarAccess.getInterface_fwdRule()) {
					sequence_interface_fwd(context, (ForwardDef) semanticObject); 
					return; 
				}
				else break;
			case IdlmmPackage.INCLUDE:
				if(context == grammarAccess.getInclude_declRule()) {
					sequence_include_decl(context, (Include) semanticObject); 
					return; 
				}
				else break;
			case IdlmmPackage.INTERFACE_DEF:
				if(context == grammarAccess.getDefinitionRule() ||
				   context == grammarAccess.getInterface_declRule()) {
					sequence_interface_decl(context, (InterfaceDef) semanticObject); 
					return; 
				}
				else break;
			case IdlmmPackage.MODULE_DEF:
				if(context == grammarAccess.getDefinitionRule() ||
				   context == grammarAccess.getModuleRule()) {
					sequence_module(context, (ModuleDef) semanticObject); 
					return; 
				}
				else break;
			case IdlmmPackage.OPERATION_DEF:
				if(context == grammarAccess.getExportRule() ||
				   context == grammarAccess.getOp_declRule()) {
					sequence_op_decl(context, (OperationDef) semanticObject); 
					return; 
				}
				else break;
			case IdlmmPackage.PARAMETER_DEF:
				if(context == grammarAccess.getParam_declRule()) {
					sequence_param_decl(context, (ParameterDef) semanticObject); 
					return; 
				}
				else break;
			case IdlmmPackage.PRIMITIVE_DEF:
				if(context == grammarAccess.getCharstr_typeRule()) {
					sequence_charstr_type(context, (PrimitiveDef) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getOp_type_specRule()) {
					sequence_charstr_type_floating_pt_type_integer_type_op_type_spec_other_type(context, (PrimitiveDef) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getBase_type_specRule() ||
				   context == grammarAccess.getConst_typeRule() ||
				   context == grammarAccess.getPrimitive_defRule() ||
				   context == grammarAccess.getSimple_type_specRule()) {
					sequence_charstr_type_floating_pt_type_integer_type_other_type_primitive_def(context, (PrimitiveDef) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFloating_pt_typeRule()) {
					sequence_floating_pt_type(context, (PrimitiveDef) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getInteger_typeRule()) {
					sequence_integer_type(context, (PrimitiveDef) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSwitch_type_spec_contRule()) {
					sequence_integer_type_switch_type_spec_cont(context, (PrimitiveDef) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getOther_typeRule()) {
					sequence_other_type(context, (PrimitiveDef) semanticObject); 
					return; 
				}
				else break;
			case IdlmmPackage.SEQUENCE_DEF:
				if(context == grammarAccess.getSequence_typeRule() ||
				   context == grammarAccess.getSimple_type_specRule() ||
				   context == grammarAccess.getTemplate_type_specRule()) {
					sequence_sequence_type(context, (SequenceDef) semanticObject); 
					return; 
				}
				else break;
			case IdlmmPackage.STRING_DEF:
				if(context == grammarAccess.getConst_typeRule() ||
				   context == grammarAccess.getSimple_type_specRule() ||
				   context == grammarAccess.getStringdef_typeRule() ||
				   context == grammarAccess.getTemplate_type_specRule()) {
					sequence_stringdef_type(context, (StringDef) semanticObject); 
					return; 
				}
				else break;
			case IdlmmPackage.STRUCT_DEF:
				if(context == grammarAccess.getConstr_type_specRule() ||
				   context == grammarAccess.getDefinitionRule() ||
				   context == grammarAccess.getExportRule() ||
				   context == grammarAccess.getStruct_typeRule() ||
				   context == grammarAccess.getType_declRule()) {
					sequence_struct_type(context, (StructDef) semanticObject); 
					return; 
				}
				else break;
			case IdlmmPackage.TRANSLATION_UNIT:
				if(context == grammarAccess.getSpecificationRule()) {
					sequence_specification(context, (TranslationUnit) semanticObject); 
					return; 
				}
				else break;
			case IdlmmPackage.UNARY_EXPRESSION:
				if(context == grammarAccess.getAdd_exprRule() ||
				   context == grammarAccess.getAdd_exprAccess().getBinaryExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAnd_exprRule() ||
				   context == grammarAccess.getAnd_exprAccess().getBinaryExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConst_expRule() ||
				   context == grammarAccess.getMult_exprRule() ||
				   context == grammarAccess.getMult_exprAccess().getBinaryExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOr_exprRule() ||
				   context == grammarAccess.getOr_exprAccess().getBinaryExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPrimary_exprRule() ||
				   context == grammarAccess.getShift_exprRule() ||
				   context == grammarAccess.getShift_exprAccess().getBinaryExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUnary_exprRule() ||
				   context == grammarAccess.getXor_exprRule() ||
				   context == grammarAccess.getXor_exprAccess().getBinaryExpressionLeftAction_1_0()) {
					sequence_unary_expr(context, (UnaryExpression) semanticObject); 
					return; 
				}
				else break;
			case IdlmmPackage.UNION_DEF:
				if(context == grammarAccess.getConstr_type_specRule() ||
				   context == grammarAccess.getDefinitionRule() ||
				   context == grammarAccess.getExportRule() ||
				   context == grammarAccess.getType_declRule() ||
				   context == grammarAccess.getUnion_typeRule()) {
					sequence_union_type(context, (UnionDef) semanticObject); 
					return; 
				}
				else break;
			case IdlmmPackage.UNION_FIELD:
				if(context == grammarAccess.getCase_stmtRule()) {
					sequence_case_stmt(context, (UnionField) semanticObject); 
					return; 
				}
				else break;
			case IdlmmPackage.VALUE_EXPRESSION:
				if(context == grammarAccess.getAdd_exprRule() ||
				   context == grammarAccess.getAdd_exprAccess().getBinaryExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAnd_exprRule() ||
				   context == grammarAccess.getAnd_exprAccess().getBinaryExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConst_expRule() ||
				   context == grammarAccess.getMult_exprRule() ||
				   context == grammarAccess.getMult_exprAccess().getBinaryExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOr_exprRule() ||
				   context == grammarAccess.getOr_exprAccess().getBinaryExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPrimary_exprRule() ||
				   context == grammarAccess.getShift_exprRule() ||
				   context == grammarAccess.getShift_exprAccess().getBinaryExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUnary_exprRule() ||
				   context == grammarAccess.getValueExpressionRule() ||
				   context == grammarAccess.getXor_exprRule() ||
				   context == grammarAccess.getXor_exprAccess().getBinaryExpressionLeftAction_1_0()) {
					sequence_valueExpression(context, (ValueExpression) semanticObject); 
					return; 
				}
				else break;
			case IdlmmPackage.WSTRING_DEF:
				if(context == grammarAccess.getConst_typeRule() ||
				   context == grammarAccess.getSimple_type_specRule() ||
				   context == grammarAccess.getTemplate_type_specRule() ||
				   context == grammarAccess.getWide_stringdef_typeRule()) {
					sequence_wide_stringdef_type(context, (WstringDef) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         (left=add_expr_BinaryExpression_1_0 (operator='+' | operator='-') right=mult_expr) | 
	 *         (left=mult_expr_BinaryExpression_1_0 (operator='*' | operator='/' | operator='%') right=unary_expr) | 
	 *         (left=shift_expr_BinaryExpression_1_0 (operator='>>' | operator='<<') right=add_expr) | 
	 *         (left=and_expr_BinaryExpression_1_0 operator='&' right=shift_expr) | 
	 *         (left=xor_expr_BinaryExpression_1_0 operator='^' right=and_expr) | 
	 *         (left=or_expr_BinaryExpression_1_0 operator='|' right=xor_expr)
	 *     )
	 */
	protected void sequence_add_expr_and_expr_mult_expr_or_expr_shift_expr_xor_expr(EObject context, BinaryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (containedType=array_type_spec | ((containedType=simple_type_spec | sharedType=[TypedefDef|ID]) identifier=ID))
	 */
	protected void sequence_alias_type(EObject context, AliasDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((containedType=simple_type_spec | sharedType=[TypedefDef|ID]) name=ID bounds+=const_exp+)
	 */
	protected void sequence_array_type_spec(EObject context, ArrayDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             isReadonly?='readonly' 
	 *             (containedType=base_type_spec | sharedType=[TypedefDef|ID]) 
	 *             identifier=ID 
	 *             getRaises+=[ExceptionDef|ID] 
	 *             getRaises+=[ExceptionDef|ID]*
	 *         ) | 
	 *         (isReadonly?='readonly' (containedType=base_type_spec | sharedType=[TypedefDef|ID]) identifier=ID) | 
	 *         (
	 *             (containedType=base_type_spec | sharedType=[TypedefDef|ID]) 
	 *             identifier=ID 
	 *             (
	 *                 (getRaises+=[ExceptionDef|ID] getRaises+=[ExceptionDef|ID]* (setRaises+=[ExceptionDef|ID] setRaises+=[ExceptionDef|ID]*)?) | 
	 *                 (setRaises+=[ExceptionDef|ID] setRaises+=[ExceptionDef|ID]*)
	 *             )
	 *         ) | 
	 *         ((containedType=base_type_spec | sharedType=[TypedefDef|ID]) identifier=ID)
	 *     )
	 */
	protected void sequence_attr_decl_attr_spec_readonly_attr_spec(EObject context, AttributeDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             (containedType=base_type_spec | sharedType=[TypedefDef|ID]) 
	 *             identifier=ID 
	 *             (
	 *                 (getRaises+=[ExceptionDef|ID] getRaises+=[ExceptionDef|ID]* (setRaises+=[ExceptionDef|ID] setRaises+=[ExceptionDef|ID]*)?) | 
	 *                 (setRaises+=[ExceptionDef|ID] setRaises+=[ExceptionDef|ID]*)
	 *             )
	 *         ) | 
	 *         ((containedType=base_type_spec | sharedType=[TypedefDef|ID]) identifier=ID)
	 *     )
	 */
	protected void sequence_attr_spec(EObject context, AttributeDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         ((label+=const_exp | isDefault?='default')+ containedType=array_type_spec) | 
	 *         ((label+=const_exp | isDefault?='default')+ (containedType=simple_type_spec | sharedType=[TypedefDef|ID]) identifier=ID)
	 *     )
	 */
	protected void sequence_case_stmt(EObject context, UnionField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (kind=char_type | kind=wide_char_type | kind=string_type | kind=wide_string_type)
	 */
	protected void sequence_charstr_type(EObject context, PrimitiveDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         kind=short_type | 
	 *         kind=long_type | 
	 *         kind=longlong_type | 
	 *         kind=ushort_type | 
	 *         kind=ulong_type | 
	 *         kind=ulonglong_type | 
	 *         kind=float_type | 
	 *         kind=double_type | 
	 *         kind=longdouble_type | 
	 *         kind=char_type | 
	 *         kind=wide_char_type | 
	 *         kind=string_type | 
	 *         kind=wide_string_type | 
	 *         kind=boolean_type | 
	 *         kind=octet_type | 
	 *         kind=any_type | 
	 *         kind=void_type
	 *     )
	 */
	protected void sequence_charstr_type_floating_pt_type_integer_type_op_type_spec_other_type(EObject context, PrimitiveDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         kind=short_type | 
	 *         kind=long_type | 
	 *         kind=longlong_type | 
	 *         kind=ushort_type | 
	 *         kind=ulong_type | 
	 *         kind=ulonglong_type | 
	 *         kind=float_type | 
	 *         kind=double_type | 
	 *         kind=longdouble_type | 
	 *         kind=char_type | 
	 *         kind=wide_char_type | 
	 *         kind=string_type | 
	 *         kind=wide_string_type | 
	 *         kind=boolean_type | 
	 *         kind=octet_type | 
	 *         kind=any_type
	 *     )
	 */
	protected void sequence_charstr_type_floating_pt_type_integer_type_other_type_primitive_def(EObject context, PrimitiveDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((containedType=const_type | sharedType=[AliasDef|ID]) identifier=ID constValue=const_exp)
	 */
	protected void sequence_const_decl(EObject context, ConstantDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     constant=[Constant|ID]
	 */
	protected void sequence_constantDefRef(EObject context, ConstantDefRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IdlmmPackage.Literals.CONSTANT_DEF_REF__CONSTANT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IdlmmPackage.Literals.CONSTANT_DEF_REF__CONSTANT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstantDefRefAccess().getConstantConstantIDTerminalRuleCall_0_1(), semanticObject.getConstant());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     identifier=ID
	 */
	protected void sequence_enum_member(EObject context, EnumMember semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (identifier=ID members+=enum_member members+=enum_member*)
	 */
	protected void sequence_enum_type(EObject context, EnumDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (identifier=ID members+=member*)
	 */
	protected void sequence_except_decl(EObject context, ExceptionDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {FixedDef}
	 */
	protected void sequence_fixed_pt_const_type(EObject context, FixedDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (digits=const_exp scale=const_exp)
	 */
	protected void sequence_fixed_pt_type(EObject context, FixedDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (kind=float_type | kind=double_type | kind=longdouble_type)
	 */
	protected void sequence_floating_pt_type(EObject context, PrimitiveDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_include_decl(EObject context, Include semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         kind=short_type | 
	 *         kind=long_type | 
	 *         kind=longlong_type | 
	 *         kind=ushort_type | 
	 *         kind=ulong_type | 
	 *         kind=ulonglong_type
	 *     )
	 */
	protected void sequence_integer_type(EObject context, PrimitiveDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         kind=short_type | 
	 *         kind=long_type | 
	 *         kind=longlong_type | 
	 *         kind=ushort_type | 
	 *         kind=ulong_type | 
	 *         kind=ulonglong_type | 
	 *         kind=char_type | 
	 *         kind=boolean_type
	 *     )
	 */
	protected void sequence_integer_type_switch_type_spec_cont(EObject context, PrimitiveDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((isAbstract?='abstract' | isCustom?='local')? identifier=ID (derivesFrom+=[InterfaceDef|ID] derivesFrom+=[InterfaceDef|ID]*)? contains+=export*)
	 */
	protected void sequence_interface_decl(EObject context, InterfaceDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     identifier=ID
	 */
	protected void sequence_interface_fwd(EObject context, ForwardDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         containedType=array_type_spec | 
	 *         (containedType=simple_type_spec identifier=ID) | 
	 *         (containedType=struct_type identifier=ID) | 
	 *         (sharedType=[TypedefDef|ID] identifier=ID)
	 *     )
	 */
	protected void sequence_member(EObject context, Field semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (identifier=ID contains+=definition*)
	 */
	protected void sequence_module(EObject context, ModuleDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         isOneway?='oneway'? 
	 *         (containedType=op_type_spec | sharedType=[TypedefDef|ID]) 
	 *         identifier=ID 
	 *         (parameters+=param_decl parameters+=param_decl*)? 
	 *         (canRaise+=[ExceptionDef|ID] canRaise+=[ExceptionDef|ID]*)? 
	 *         (contexts+=STRING contexts+=STRING*)?
	 *     )
	 */
	protected void sequence_op_decl(EObject context, OperationDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (kind=boolean_type | kind=octet_type | kind=any_type)
	 */
	protected void sequence_other_type(EObject context, PrimitiveDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (direction=param_attribute (containedType=base_type_spec | sharedType=[TypedefDef|ID]) identifier=ID)
	 */
	protected void sequence_param_decl(EObject context, ParameterDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             isReadonly?='readonly' 
	 *             (containedType=base_type_spec | sharedType=[TypedefDef|ID]) 
	 *             identifier=ID 
	 *             getRaises+=[ExceptionDef|ID] 
	 *             getRaises+=[ExceptionDef|ID]*
	 *         ) | 
	 *         (isReadonly?='readonly' (containedType=base_type_spec | sharedType=[TypedefDef|ID]) identifier=ID)
	 *     )
	 */
	protected void sequence_readonly_attr_spec(EObject context, AttributeDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((containedType=simple_type_spec | sharedType=[TypedefDef|ID]) bound=const_exp?)
	 */
	protected void sequence_sequence_type(EObject context, SequenceDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (includes+=include_decl* contains+=definition*)
	 */
	protected void sequence_specification(EObject context, TranslationUnit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     bound=const_exp
	 */
	protected void sequence_stringdef_type(EObject context, StringDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (identifier=ID members+=member+)
	 */
	protected void sequence_struct_type(EObject context, StructDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operator=unary_operator expression=primary_expr)
	 */
	protected void sequence_unary_expr(EObject context, UnaryExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IdlmmPackage.Literals.UNARY_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IdlmmPackage.Literals.UNARY_EXPRESSION__EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, IdlmmPackage.Literals.UNARY_EXPRESSION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IdlmmPackage.Literals.UNARY_EXPRESSION__OPERATOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUnary_exprAccess().getOperatorUnary_operatorParserRuleCall_0_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getUnary_exprAccess().getExpressionPrimary_exprParserRuleCall_0_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (identifier=ID (containedDiscrim=switch_type_spec_cont | sharedDiscrim=[EnumDef|ID]) unionMembers+=case_stmt+)
	 */
	protected void sequence_union_type(EObject context, UnionDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=literal
	 */
	protected void sequence_valueExpression(EObject context, ValueExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IdlmmPackage.Literals.VALUE_EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IdlmmPackage.Literals.VALUE_EXPRESSION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getValueExpressionAccess().getValueLiteralParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     bound=const_exp
	 */
	protected void sequence_wide_stringdef_type(EObject context, WstringDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
