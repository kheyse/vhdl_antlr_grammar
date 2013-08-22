// Generated from Vhdl.g by ANTLR 4.1


import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VhdlParser}.
 */
public interface VhdlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VhdlParser#assertion_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssertion_statement(@NotNull VhdlParser.Assertion_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#assertion_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssertion_statement(@NotNull VhdlParser.Assertion_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#subprogram_kind}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_kind(@NotNull VhdlParser.Subprogram_kindContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#subprogram_kind}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_kind(@NotNull VhdlParser.Subprogram_kindContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#association_list}.
	 * @param ctx the parse tree
	 */
	void enterAssociation_list(@NotNull VhdlParser.Association_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#association_list}.
	 * @param ctx the parse tree
	 */
	void exitAssociation_list(@NotNull VhdlParser.Association_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#entity_header}.
	 * @param ctx the parse tree
	 */
	void enterEntity_header(@NotNull VhdlParser.Entity_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#entity_header}.
	 * @param ctx the parse tree
	 */
	void exitEntity_header(@NotNull VhdlParser.Entity_headerContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#sensitivity_list}.
	 * @param ctx the parse tree
	 */
	void enterSensitivity_list(@NotNull VhdlParser.Sensitivity_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#sensitivity_list}.
	 * @param ctx the parse tree
	 */
	void exitSensitivity_list(@NotNull VhdlParser.Sensitivity_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#conditional_waveforms}.
	 * @param ctx the parse tree
	 */
	void enterConditional_waveforms(@NotNull VhdlParser.Conditional_waveformsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#conditional_waveforms}.
	 * @param ctx the parse tree
	 */
	void exitConditional_waveforms(@NotNull VhdlParser.Conditional_waveformsContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#full_type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFull_type_declaration(@NotNull VhdlParser.Full_type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#full_type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFull_type_declaration(@NotNull VhdlParser.Full_type_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#sequential_statement}.
	 * @param ctx the parse tree
	 */
	void enterSequential_statement(@NotNull VhdlParser.Sequential_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#sequential_statement}.
	 * @param ctx the parse tree
	 */
	void exitSequential_statement(@NotNull VhdlParser.Sequential_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#logical_op}.
	 * @param ctx the parse tree
	 */
	void enterLogical_op(@NotNull VhdlParser.Logical_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#logical_op}.
	 * @param ctx the parse tree
	 */
	void exitLogical_op(@NotNull VhdlParser.Logical_opContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#signature}.
	 * @param ctx the parse tree
	 */
	void enterSignature(@NotNull VhdlParser.SignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#signature}.
	 * @param ctx the parse tree
	 */
	void exitSignature(@NotNull VhdlParser.SignatureContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#port_list}.
	 * @param ctx the parse tree
	 */
	void enterPort_list(@NotNull VhdlParser.Port_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#port_list}.
	 * @param ctx the parse tree
	 */
	void exitPort_list(@NotNull VhdlParser.Port_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#instantiation_list}.
	 * @param ctx the parse tree
	 */
	void enterInstantiation_list(@NotNull VhdlParser.Instantiation_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#instantiation_list}.
	 * @param ctx the parse tree
	 */
	void exitInstantiation_list(@NotNull VhdlParser.Instantiation_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#parameter_specification}.
	 * @param ctx the parse tree
	 */
	void enterParameter_specification(@NotNull VhdlParser.Parameter_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#parameter_specification}.
	 * @param ctx the parse tree
	 */
	void exitParameter_specification(@NotNull VhdlParser.Parameter_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_list(@NotNull VhdlParser.Identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_list(@NotNull VhdlParser.Identifier_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#block_declarative_part}.
	 * @param ctx the parse tree
	 */
	void enterBlock_declarative_part(@NotNull VhdlParser.Block_declarative_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#block_declarative_part}.
	 * @param ctx the parse tree
	 */
	void exitBlock_declarative_part(@NotNull VhdlParser.Block_declarative_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#protected_type_body}.
	 * @param ctx the parse tree
	 */
	void enterProtected_type_body(@NotNull VhdlParser.Protected_type_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#protected_type_body}.
	 * @param ctx the parse tree
	 */
	void exitProtected_type_body(@NotNull VhdlParser.Protected_type_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#record_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterRecord_type_definition(@NotNull VhdlParser.Record_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#record_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitRecord_type_definition(@NotNull VhdlParser.Record_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#multiplying_operator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplying_operator(@NotNull VhdlParser.Multiplying_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#multiplying_operator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplying_operator(@NotNull VhdlParser.Multiplying_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#generic_map_aspect}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_map_aspect(@NotNull VhdlParser.Generic_map_aspectContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#generic_map_aspect}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_map_aspect(@NotNull VhdlParser.Generic_map_aspectContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#signal_list}.
	 * @param ctx the parse tree
	 */
	void enterSignal_list(@NotNull VhdlParser.Signal_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#signal_list}.
	 * @param ctx the parse tree
	 */
	void exitSignal_list(@NotNull VhdlParser.Signal_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(@NotNull VhdlParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(@NotNull VhdlParser.Function_callContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#incomplete_type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterIncomplete_type_declaration(@NotNull VhdlParser.Incomplete_type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#incomplete_type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitIncomplete_type_declaration(@NotNull VhdlParser.Incomplete_type_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#timeout_clause}.
	 * @param ctx the parse tree
	 */
	void enterTimeout_clause(@NotNull VhdlParser.Timeout_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#timeout_clause}.
	 * @param ctx the parse tree
	 */
	void exitTimeout_clause(@NotNull VhdlParser.Timeout_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#entity_name_list}.
	 * @param ctx the parse tree
	 */
	void enterEntity_name_list(@NotNull VhdlParser.Entity_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#entity_name_list}.
	 * @param ctx the parse tree
	 */
	void exitEntity_name_list(@NotNull VhdlParser.Entity_name_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#object_declaration}.
	 * @param ctx the parse tree
	 */
	void enterObject_declaration(@NotNull VhdlParser.Object_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#object_declaration}.
	 * @param ctx the parse tree
	 */
	void exitObject_declaration(@NotNull VhdlParser.Object_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#choice}.
	 * @param ctx the parse tree
	 */
	void enterChoice(@NotNull VhdlParser.ChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#choice}.
	 * @param ctx the parse tree
	 */
	void exitChoice(@NotNull VhdlParser.ChoiceContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#generate_statement}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_statement(@NotNull VhdlParser.Generate_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#generate_statement}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_statement(@NotNull VhdlParser.Generate_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#alias_designator}.
	 * @param ctx the parse tree
	 */
	void enterAlias_designator(@NotNull VhdlParser.Alias_designatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#alias_designator}.
	 * @param ctx the parse tree
	 */
	void exitAlias_designator(@NotNull VhdlParser.Alias_designatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#entity_statement}.
	 * @param ctx the parse tree
	 */
	void enterEntity_statement(@NotNull VhdlParser.Entity_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#entity_statement}.
	 * @param ctx the parse tree
	 */
	void exitEntity_statement(@NotNull VhdlParser.Entity_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#sensitivity_clause}.
	 * @param ctx the parse tree
	 */
	void enterSensitivity_clause(@NotNull VhdlParser.Sensitivity_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#sensitivity_clause}.
	 * @param ctx the parse tree
	 */
	void exitSensitivity_clause(@NotNull VhdlParser.Sensitivity_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#alias_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAlias_declaration(@NotNull VhdlParser.Alias_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#alias_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAlias_declaration(@NotNull VhdlParser.Alias_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#attribute_designator}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_designator(@NotNull VhdlParser.Attribute_designatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#attribute_designator}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_designator(@NotNull VhdlParser.Attribute_designatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#architecture_body}.
	 * @param ctx the parse tree
	 */
	void enterArchitecture_body(@NotNull VhdlParser.Architecture_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#architecture_body}.
	 * @param ctx the parse tree
	 */
	void exitArchitecture_body(@NotNull VhdlParser.Architecture_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#entity_tag}.
	 * @param ctx the parse tree
	 */
	void enterEntity_tag(@NotNull VhdlParser.Entity_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#entity_tag}.
	 * @param ctx the parse tree
	 */
	void exitEntity_tag(@NotNull VhdlParser.Entity_tagContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#subtype_indication}.
	 * @param ctx the parse tree
	 */
	void enterSubtype_indication(@NotNull VhdlParser.Subtype_indicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#subtype_indication}.
	 * @param ctx the parse tree
	 */
	void exitSubtype_indication(@NotNull VhdlParser.Subtype_indicationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#process_statement}.
	 * @param ctx the parse tree
	 */
	void enterProcess_statement(@NotNull VhdlParser.Process_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#process_statement}.
	 * @param ctx the parse tree
	 */
	void exitProcess_statement(@NotNull VhdlParser.Process_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#entity_aspect}.
	 * @param ctx the parse tree
	 */
	void enterEntity_aspect(@NotNull VhdlParser.Entity_aspectContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#entity_aspect}.
	 * @param ctx the parse tree
	 */
	void exitEntity_aspect(@NotNull VhdlParser.Entity_aspectContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#choices}.
	 * @param ctx the parse tree
	 */
	void enterChoices(@NotNull VhdlParser.ChoicesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#choices}.
	 * @param ctx the parse tree
	 */
	void exitChoices(@NotNull VhdlParser.ChoicesContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#design_unit}.
	 * @param ctx the parse tree
	 */
	void enterDesign_unit(@NotNull VhdlParser.Design_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#design_unit}.
	 * @param ctx the parse tree
	 */
	void exitDesign_unit(@NotNull VhdlParser.Design_unitContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull VhdlParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull VhdlParser.FactorContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void enterRelational_operator(@NotNull VhdlParser.Relational_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void exitRelational_operator(@NotNull VhdlParser.Relational_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#index_subtype_definition}.
	 * @param ctx the parse tree
	 */
	void enterIndex_subtype_definition(@NotNull VhdlParser.Index_subtype_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#index_subtype_definition}.
	 * @param ctx the parse tree
	 */
	void exitIndex_subtype_definition(@NotNull VhdlParser.Index_subtype_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#subprogram_body}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_body(@NotNull VhdlParser.Subprogram_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#subprogram_body}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_body(@NotNull VhdlParser.Subprogram_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#delay_mechanism}.
	 * @param ctx the parse tree
	 */
	void enterDelay_mechanism(@NotNull VhdlParser.Delay_mechanismContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#delay_mechanism}.
	 * @param ctx the parse tree
	 */
	void exitDelay_mechanism(@NotNull VhdlParser.Delay_mechanismContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#process_declarative_item}.
	 * @param ctx the parse tree
	 */
	void enterProcess_declarative_item(@NotNull VhdlParser.Process_declarative_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#process_declarative_item}.
	 * @param ctx the parse tree
	 */
	void exitProcess_declarative_item(@NotNull VhdlParser.Process_declarative_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#group_template_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGroup_template_declaration(@NotNull VhdlParser.Group_template_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#group_template_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGroup_template_declaration(@NotNull VhdlParser.Group_template_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#package_body}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body(@NotNull VhdlParser.Package_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#package_body}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body(@NotNull VhdlParser.Package_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#range_constraint}.
	 * @param ctx the parse tree
	 */
	void enterRange_constraint(@NotNull VhdlParser.Range_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#range_constraint}.
	 * @param ctx the parse tree
	 */
	void exitRange_constraint(@NotNull VhdlParser.Range_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#secondary_unit_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSecondary_unit_declaration(@NotNull VhdlParser.Secondary_unit_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#secondary_unit_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSecondary_unit_declaration(@NotNull VhdlParser.Secondary_unit_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#package_body_declarative_part}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body_declarative_part(@NotNull VhdlParser.Package_body_declarative_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#package_body_declarative_part}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body_declarative_part(@NotNull VhdlParser.Package_body_declarative_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#procedure_call_statement}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_call_statement(@NotNull VhdlParser.Procedure_call_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#procedure_call_statement}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_call_statement(@NotNull VhdlParser.Procedure_call_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull VhdlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull VhdlParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#abstract_literal}.
	 * @param ctx the parse tree
	 */
	void enterAbstract_literal(@NotNull VhdlParser.Abstract_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#abstract_literal}.
	 * @param ctx the parse tree
	 */
	void exitAbstract_literal(@NotNull VhdlParser.Abstract_literalContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#interface_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_variable_declaration(@NotNull VhdlParser.Interface_variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#interface_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_variable_declaration(@NotNull VhdlParser.Interface_variable_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#next_statement}.
	 * @param ctx the parse tree
	 */
	void enterNext_statement(@NotNull VhdlParser.Next_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#next_statement}.
	 * @param ctx the parse tree
	 */
	void exitNext_statement(@NotNull VhdlParser.Next_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#decimal_literal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal_literal(@NotNull VhdlParser.Decimal_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#decimal_literal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal_literal(@NotNull VhdlParser.Decimal_literalContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#scalar_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterScalar_type_definition(@NotNull VhdlParser.Scalar_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#scalar_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitScalar_type_definition(@NotNull VhdlParser.Scalar_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declaration(@NotNull VhdlParser.Constant_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declaration(@NotNull VhdlParser.Constant_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#component_declaration}.
	 * @param ctx the parse tree
	 */
	void enterComponent_declaration(@NotNull VhdlParser.Component_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#component_declaration}.
	 * @param ctx the parse tree
	 */
	void exitComponent_declaration(@NotNull VhdlParser.Component_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#interface_file_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_file_declaration(@NotNull VhdlParser.Interface_file_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#interface_file_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_file_declaration(@NotNull VhdlParser.Interface_file_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#context_item}.
	 * @param ctx the parse tree
	 */
	void enterContext_item(@NotNull VhdlParser.Context_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#context_item}.
	 * @param ctx the parse tree
	 */
	void exitContext_item(@NotNull VhdlParser.Context_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#configuration_specification}.
	 * @param ctx the parse tree
	 */
	void enterConfiguration_specification(@NotNull VhdlParser.Configuration_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#configuration_specification}.
	 * @param ctx the parse tree
	 */
	void exitConfiguration_specification(@NotNull VhdlParser.Configuration_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#association_element}.
	 * @param ctx the parse tree
	 */
	void enterAssociation_element(@NotNull VhdlParser.Association_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#association_element}.
	 * @param ctx the parse tree
	 */
	void exitAssociation_element(@NotNull VhdlParser.Association_elementContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull VhdlParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull VhdlParser.DeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull VhdlParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull VhdlParser.ConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#concurrent_statement}.
	 * @param ctx the parse tree
	 */
	void enterConcurrent_statement(@NotNull VhdlParser.Concurrent_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#concurrent_statement}.
	 * @param ctx the parse tree
	 */
	void exitConcurrent_statement(@NotNull VhdlParser.Concurrent_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement(@NotNull VhdlParser.Case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement(@NotNull VhdlParser.Case_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#logical_name_list}.
	 * @param ctx the parse tree
	 */
	void enterLogical_name_list(@NotNull VhdlParser.Logical_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#logical_name_list}.
	 * @param ctx the parse tree
	 */
	void exitLogical_name_list(@NotNull VhdlParser.Logical_name_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(@NotNull VhdlParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(@NotNull VhdlParser.RelationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#conditional_signal_assignment}.
	 * @param ctx the parse tree
	 */
	void enterConditional_signal_assignment(@NotNull VhdlParser.Conditional_signal_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#conditional_signal_assignment}.
	 * @param ctx the parse tree
	 */
	void exitConditional_signal_assignment(@NotNull VhdlParser.Conditional_signal_assignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(@NotNull VhdlParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(@NotNull VhdlParser.LabelContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#process_declarative_part}.
	 * @param ctx the parse tree
	 */
	void enterProcess_declarative_part(@NotNull VhdlParser.Process_declarative_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#process_declarative_part}.
	 * @param ctx the parse tree
	 */
	void exitProcess_declarative_part(@NotNull VhdlParser.Process_declarative_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#waveform}.
	 * @param ctx the parse tree
	 */
	void enterWaveform(@NotNull VhdlParser.WaveformContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#waveform}.
	 * @param ctx the parse tree
	 */
	void exitWaveform(@NotNull VhdlParser.WaveformContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#port_map_aspect}.
	 * @param ctx the parse tree
	 */
	void enterPort_map_aspect(@NotNull VhdlParser.Port_map_aspectContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#port_map_aspect}.
	 * @param ctx the parse tree
	 */
	void exitPort_map_aspect(@NotNull VhdlParser.Port_map_aspectContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(@NotNull VhdlParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(@NotNull VhdlParser.SignContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#tic_attribute_designator}.
	 * @param ctx the parse tree
	 */
	void enterTic_attribute_designator(@NotNull VhdlParser.Tic_attribute_designatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#tic_attribute_designator}.
	 * @param ctx the parse tree
	 */
	void exitTic_attribute_designator(@NotNull VhdlParser.Tic_attribute_designatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#component_specification}.
	 * @param ctx the parse tree
	 */
	void enterComponent_specification(@NotNull VhdlParser.Component_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#component_specification}.
	 * @param ctx the parse tree
	 */
	void exitComponent_specification(@NotNull VhdlParser.Component_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#logical_operator}.
	 * @param ctx the parse tree
	 */
	void enterLogical_operator(@NotNull VhdlParser.Logical_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#logical_operator}.
	 * @param ctx the parse tree
	 */
	void exitLogical_operator(@NotNull VhdlParser.Logical_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#protected_type_declarative_item}.
	 * @param ctx the parse tree
	 */
	void enterProtected_type_declarative_item(@NotNull VhdlParser.Protected_type_declarative_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#protected_type_declarative_item}.
	 * @param ctx the parse tree
	 */
	void exitProtected_type_declarative_item(@NotNull VhdlParser.Protected_type_declarative_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull VhdlParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull VhdlParser.IdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#composite_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterComposite_type_definition(@NotNull VhdlParser.Composite_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#composite_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitComposite_type_definition(@NotNull VhdlParser.Composite_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#entity_declarative_part}.
	 * @param ctx the parse tree
	 */
	void enterEntity_declarative_part(@NotNull VhdlParser.Entity_declarative_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#entity_declarative_part}.
	 * @param ctx the parse tree
	 */
	void exitEntity_declarative_part(@NotNull VhdlParser.Entity_declarative_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#simple_name}.
	 * @param ctx the parse tree
	 */
	void enterSimple_name(@NotNull VhdlParser.Simple_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#simple_name}.
	 * @param ctx the parse tree
	 */
	void exitSimple_name(@NotNull VhdlParser.Simple_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#block_configuration}.
	 * @param ctx the parse tree
	 */
	void enterBlock_configuration(@NotNull VhdlParser.Block_configurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#block_configuration}.
	 * @param ctx the parse tree
	 */
	void exitBlock_configuration(@NotNull VhdlParser.Block_configurationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#physical_literal}.
	 * @param ctx the parse tree
	 */
	void enterPhysical_literal(@NotNull VhdlParser.Physical_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#physical_literal}.
	 * @param ctx the parse tree
	 */
	void exitPhysical_literal(@NotNull VhdlParser.Physical_literalContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#based_literal}.
	 * @param ctx the parse tree
	 */
	void enterBased_literal(@NotNull VhdlParser.Based_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#based_literal}.
	 * @param ctx the parse tree
	 */
	void exitBased_literal(@NotNull VhdlParser.Based_literalContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#enumeration_literal}.
	 * @param ctx the parse tree
	 */
	void enterEnumeration_literal(@NotNull VhdlParser.Enumeration_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#enumeration_literal}.
	 * @param ctx the parse tree
	 */
	void exitEnumeration_literal(@NotNull VhdlParser.Enumeration_literalContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#protected_type_body_declarative_item}.
	 * @param ctx the parse tree
	 */
	void enterProtected_type_body_declarative_item(@NotNull VhdlParser.Protected_type_body_declarative_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#protected_type_body_declarative_item}.
	 * @param ctx the parse tree
	 */
	void exitProtected_type_body_declarative_item(@NotNull VhdlParser.Protected_type_body_declarative_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#interface_constant_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_constant_declaration(@NotNull VhdlParser.Interface_constant_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#interface_constant_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_constant_declaration(@NotNull VhdlParser.Interface_constant_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull VhdlParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull VhdlParser.NameContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#package_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPackage_declaration(@NotNull VhdlParser.Package_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#package_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPackage_declaration(@NotNull VhdlParser.Package_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#entity_class_entry}.
	 * @param ctx the parse tree
	 */
	void enterEntity_class_entry(@NotNull VhdlParser.Entity_class_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#entity_class_entry}.
	 * @param ctx the parse tree
	 */
	void exitEntity_class_entry(@NotNull VhdlParser.Entity_class_entryContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#group_constituent}.
	 * @param ctx the parse tree
	 */
	void enterGroup_constituent(@NotNull VhdlParser.Group_constituentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#group_constituent}.
	 * @param ctx the parse tree
	 */
	void exitGroup_constituent(@NotNull VhdlParser.Group_constituentContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#unconstrained_array_definition}.
	 * @param ctx the parse tree
	 */
	void enterUnconstrained_array_definition(@NotNull VhdlParser.Unconstrained_array_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#unconstrained_array_definition}.
	 * @param ctx the parse tree
	 */
	void exitUnconstrained_array_definition(@NotNull VhdlParser.Unconstrained_array_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#bit_string_literal}.
	 * @param ctx the parse tree
	 */
	void enterBit_string_literal(@NotNull VhdlParser.Bit_string_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#bit_string_literal}.
	 * @param ctx the parse tree
	 */
	void exitBit_string_literal(@NotNull VhdlParser.Bit_string_literalContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#block_header}.
	 * @param ctx the parse tree
	 */
	void enterBlock_header(@NotNull VhdlParser.Block_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#block_header}.
	 * @param ctx the parse tree
	 */
	void exitBlock_header(@NotNull VhdlParser.Block_headerContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#vmode}.
	 * @param ctx the parse tree
	 */
	void enterVmode(@NotNull VhdlParser.VmodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#vmode}.
	 * @param ctx the parse tree
	 */
	void exitVmode(@NotNull VhdlParser.VmodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#null_statement}.
	 * @param ctx the parse tree
	 */
	void enterNull_statement(@NotNull VhdlParser.Null_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#null_statement}.
	 * @param ctx the parse tree
	 */
	void exitNull_statement(@NotNull VhdlParser.Null_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#signal_kind}.
	 * @param ctx the parse tree
	 */
	void enterSignal_kind(@NotNull VhdlParser.Signal_kindContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#signal_kind}.
	 * @param ctx the parse tree
	 */
	void exitSignal_kind(@NotNull VhdlParser.Signal_kindContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#file_logical_name}.
	 * @param ctx the parse tree
	 */
	void enterFile_logical_name(@NotNull VhdlParser.File_logical_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#file_logical_name}.
	 * @param ctx the parse tree
	 */
	void exitFile_logical_name(@NotNull VhdlParser.File_logical_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#assertion}.
	 * @param ctx the parse tree
	 */
	void enterAssertion(@NotNull VhdlParser.AssertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#assertion}.
	 * @param ctx the parse tree
	 */
	void exitAssertion(@NotNull VhdlParser.AssertionContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#package_body_declarative_item}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body_declarative_item(@NotNull VhdlParser.Package_body_declarative_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#package_body_declarative_item}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body_declarative_item(@NotNull VhdlParser.Package_body_declarative_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#group_constituent_list}.
	 * @param ctx the parse tree
	 */
	void enterGroup_constituent_list(@NotNull VhdlParser.Group_constituent_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#group_constituent_list}.
	 * @param ctx the parse tree
	 */
	void exitGroup_constituent_list(@NotNull VhdlParser.Group_constituent_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#subprogram_declarative_item}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_declarative_item(@NotNull VhdlParser.Subprogram_declarative_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#subprogram_declarative_item}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_declarative_item(@NotNull VhdlParser.Subprogram_declarative_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#array_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterArray_type_definition(@NotNull VhdlParser.Array_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#array_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitArray_type_definition(@NotNull VhdlParser.Array_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#entity_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEntity_declaration(@NotNull VhdlParser.Entity_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#entity_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEntity_declaration(@NotNull VhdlParser.Entity_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#aggregate}.
	 * @param ctx the parse tree
	 */
	void enterAggregate(@NotNull VhdlParser.AggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#aggregate}.
	 * @param ctx the parse tree
	 */
	void exitAggregate(@NotNull VhdlParser.AggregateContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#entity_designator}.
	 * @param ctx the parse tree
	 */
	void enterEntity_designator(@NotNull VhdlParser.Entity_designatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#entity_designator}.
	 * @param ctx the parse tree
	 */
	void exitEntity_designator(@NotNull VhdlParser.Entity_designatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#case_statement_alternative}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement_alternative(@NotNull VhdlParser.Case_statement_alternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#case_statement_alternative}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement_alternative(@NotNull VhdlParser.Case_statement_alternativeContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#protected_type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtected_type_declaration(@NotNull VhdlParser.Protected_type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#protected_type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtected_type_declaration(@NotNull VhdlParser.Protected_type_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#binding_indication}.
	 * @param ctx the parse tree
	 */
	void enterBinding_indication(@NotNull VhdlParser.Binding_indicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#binding_indication}.
	 * @param ctx the parse tree
	 */
	void exitBinding_indication(@NotNull VhdlParser.Binding_indicationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#component_configuration}.
	 * @param ctx the parse tree
	 */
	void enterComponent_configuration(@NotNull VhdlParser.Component_configurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#component_configuration}.
	 * @param ctx the parse tree
	 */
	void exitComponent_configuration(@NotNull VhdlParser.Component_configurationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#protected_type_declarative_part}.
	 * @param ctx the parse tree
	 */
	void enterProtected_type_declarative_part(@NotNull VhdlParser.Protected_type_declarative_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#protected_type_declarative_part}.
	 * @param ctx the parse tree
	 */
	void exitProtected_type_declarative_part(@NotNull VhdlParser.Protected_type_declarative_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#voptions}.
	 * @param ctx the parse tree
	 */
	void enterVoptions(@NotNull VhdlParser.VoptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#voptions}.
	 * @param ctx the parse tree
	 */
	void exitVoptions(@NotNull VhdlParser.VoptionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(@NotNull VhdlParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(@NotNull VhdlParser.DesignatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#interface_element}.
	 * @param ctx the parse tree
	 */
	void enterInterface_element(@NotNull VhdlParser.Interface_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#interface_element}.
	 * @param ctx the parse tree
	 */
	void exitInterface_element(@NotNull VhdlParser.Interface_elementContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#protected_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterProtected_type_definition(@NotNull VhdlParser.Protected_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#protected_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitProtected_type_definition(@NotNull VhdlParser.Protected_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#architecture_statement_part}.
	 * @param ctx the parse tree
	 */
	void enterArchitecture_statement_part(@NotNull VhdlParser.Architecture_statement_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#architecture_statement_part}.
	 * @param ctx the parse tree
	 */
	void exitArchitecture_statement_part(@NotNull VhdlParser.Architecture_statement_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#block_declarative_item}.
	 * @param ctx the parse tree
	 */
	void enterBlock_declarative_item(@NotNull VhdlParser.Block_declarative_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#block_declarative_item}.
	 * @param ctx the parse tree
	 */
	void exitBlock_declarative_item(@NotNull VhdlParser.Block_declarative_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#signal_assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterSignal_assignment_statement(@NotNull VhdlParser.Signal_assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#signal_assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitSignal_assignment_statement(@NotNull VhdlParser.Signal_assignment_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#element_subtype_definition}.
	 * @param ctx the parse tree
	 */
	void enterElement_subtype_definition(@NotNull VhdlParser.Element_subtype_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#element_subtype_definition}.
	 * @param ctx the parse tree
	 */
	void exitElement_subtype_definition(@NotNull VhdlParser.Element_subtype_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#component_instantiation_statement}.
	 * @param ctx the parse tree
	 */
	void enterComponent_instantiation_statement(@NotNull VhdlParser.Component_instantiation_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#component_instantiation_statement}.
	 * @param ctx the parse tree
	 */
	void exitComponent_instantiation_statement(@NotNull VhdlParser.Component_instantiation_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#block_specification}.
	 * @param ctx the parse tree
	 */
	void enterBlock_specification(@NotNull VhdlParser.Block_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#block_specification}.
	 * @param ctx the parse tree
	 */
	void exitBlock_specification(@NotNull VhdlParser.Block_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#formal_part}.
	 * @param ctx the parse tree
	 */
	void enterFormal_part(@NotNull VhdlParser.Formal_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#formal_part}.
	 * @param ctx the parse tree
	 */
	void exitFormal_part(@NotNull VhdlParser.Formal_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#protected_type_body_declarative_part}.
	 * @param ctx the parse tree
	 */
	void enterProtected_type_body_declarative_part(@NotNull VhdlParser.Protected_type_body_declarative_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#protected_type_body_declarative_part}.
	 * @param ctx the parse tree
	 */
	void exitProtected_type_body_declarative_part(@NotNull VhdlParser.Protected_type_body_declarative_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#primary_unit}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_unit(@NotNull VhdlParser.Primary_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#primary_unit}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_unit(@NotNull VhdlParser.Primary_unitContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#configuration_declarative_part}.
	 * @param ctx the parse tree
	 */
	void enterConfiguration_declarative_part(@NotNull VhdlParser.Configuration_declarative_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#configuration_declarative_part}.
	 * @param ctx the parse tree
	 */
	void exitConfiguration_declarative_part(@NotNull VhdlParser.Configuration_declarative_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#package_declarative_part}.
	 * @param ctx the parse tree
	 */
	void enterPackage_declarative_part(@NotNull VhdlParser.Package_declarative_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#package_declarative_part}.
	 * @param ctx the parse tree
	 */
	void exitPackage_declarative_part(@NotNull VhdlParser.Package_declarative_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void enterShift_expression(@NotNull VhdlParser.Shift_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void exitShift_expression(@NotNull VhdlParser.Shift_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#miscellaneous_operator}.
	 * @param ctx the parse tree
	 */
	void enterMiscellaneous_operator(@NotNull VhdlParser.Miscellaneous_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#miscellaneous_operator}.
	 * @param ctx the parse tree
	 */
	void exitMiscellaneous_operator(@NotNull VhdlParser.Miscellaneous_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#iteration_scheme}.
	 * @param ctx the parse tree
	 */
	void enterIteration_scheme(@NotNull VhdlParser.Iteration_schemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#iteration_scheme}.
	 * @param ctx the parse tree
	 */
	void exitIteration_scheme(@NotNull VhdlParser.Iteration_schemeContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#concurrent_procedure_call_statement}.
	 * @param ctx the parse tree
	 */
	void enterConcurrent_procedure_call_statement(@NotNull VhdlParser.Concurrent_procedure_call_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#concurrent_procedure_call_statement}.
	 * @param ctx the parse tree
	 */
	void exitConcurrent_procedure_call_statement(@NotNull VhdlParser.Concurrent_procedure_call_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#discrete_range}.
	 * @param ctx the parse tree
	 */
	void enterDiscrete_range(@NotNull VhdlParser.Discrete_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#discrete_range}.
	 * @param ctx the parse tree
	 */
	void exitDiscrete_range(@NotNull VhdlParser.Discrete_rangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#element_association}.
	 * @param ctx the parse tree
	 */
	void enterElement_association(@NotNull VhdlParser.Element_associationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#element_association}.
	 * @param ctx the parse tree
	 */
	void exitElement_association(@NotNull VhdlParser.Element_associationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#subtype_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSubtype_declaration(@NotNull VhdlParser.Subtype_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#subtype_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSubtype_declaration(@NotNull VhdlParser.Subtype_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#subprogram_specification}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_specification(@NotNull VhdlParser.Subprogram_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#subprogram_specification}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_specification(@NotNull VhdlParser.Subprogram_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(@NotNull VhdlParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(@NotNull VhdlParser.RangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#variable_assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterVariable_assignment_statement(@NotNull VhdlParser.Variable_assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#variable_assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitVariable_assignment_statement(@NotNull VhdlParser.Variable_assignment_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(@NotNull VhdlParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(@NotNull VhdlParser.If_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(@NotNull VhdlParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(@NotNull VhdlParser.ConstraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#configuration_item}.
	 * @param ctx the parse tree
	 */
	void enterConfiguration_item(@NotNull VhdlParser.Configuration_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#configuration_item}.
	 * @param ctx the parse tree
	 */
	void exitConfiguration_item(@NotNull VhdlParser.Configuration_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#block_statement_part}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement_part(@NotNull VhdlParser.Block_statement_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#block_statement_part}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement_part(@NotNull VhdlParser.Block_statement_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#operator_symbol}.
	 * @param ctx the parse tree
	 */
	void enterOperator_symbol(@NotNull VhdlParser.Operator_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#operator_symbol}.
	 * @param ctx the parse tree
	 */
	void exitOperator_symbol(@NotNull VhdlParser.Operator_symbolContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#physical_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterPhysical_type_definition(@NotNull VhdlParser.Physical_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#physical_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitPhysical_type_definition(@NotNull VhdlParser.Physical_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#configuration_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConfiguration_declaration(@NotNull VhdlParser.Configuration_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#configuration_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConfiguration_declaration(@NotNull VhdlParser.Configuration_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#logical_name}.
	 * @param ctx the parse tree
	 */
	void enterLogical_name(@NotNull VhdlParser.Logical_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#logical_name}.
	 * @param ctx the parse tree
	 */
	void exitLogical_name(@NotNull VhdlParser.Logical_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(@NotNull VhdlParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(@NotNull VhdlParser.Variable_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#base_unit_declaration}.
	 * @param ctx the parse tree
	 */
	void enterBase_unit_declaration(@NotNull VhdlParser.Base_unit_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#base_unit_declaration}.
	 * @param ctx the parse tree
	 */
	void exitBase_unit_declaration(@NotNull VhdlParser.Base_unit_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#signal_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSignal_declaration(@NotNull VhdlParser.Signal_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#signal_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSignal_declaration(@NotNull VhdlParser.Signal_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expression(@NotNull VhdlParser.Simple_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expression(@NotNull VhdlParser.Simple_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#actual_parameter_part}.
	 * @param ctx the parse tree
	 */
	void enterActual_parameter_part(@NotNull VhdlParser.Actual_parameter_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#actual_parameter_part}.
	 * @param ctx the parse tree
	 */
	void exitActual_parameter_part(@NotNull VhdlParser.Actual_parameter_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#instantiated_unit}.
	 * @param ctx the parse tree
	 */
	void enterInstantiated_unit(@NotNull VhdlParser.Instantiated_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#instantiated_unit}.
	 * @param ctx the parse tree
	 */
	void exitInstantiated_unit(@NotNull VhdlParser.Instantiated_unitContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#entity_class_entry_list}.
	 * @param ctx the parse tree
	 */
	void enterEntity_class_entry_list(@NotNull VhdlParser.Entity_class_entry_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#entity_class_entry_list}.
	 * @param ctx the parse tree
	 */
	void exitEntity_class_entry_list(@NotNull VhdlParser.Entity_class_entry_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#adding_operator}.
	 * @param ctx the parse tree
	 */
	void enterAdding_operator(@NotNull VhdlParser.Adding_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#adding_operator}.
	 * @param ctx the parse tree
	 */
	void exitAdding_operator(@NotNull VhdlParser.Adding_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#use_clause}.
	 * @param ctx the parse tree
	 */
	void enterUse_clause(@NotNull VhdlParser.Use_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#use_clause}.
	 * @param ctx the parse tree
	 */
	void exitUse_clause(@NotNull VhdlParser.Use_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(@NotNull VhdlParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(@NotNull VhdlParser.Return_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#enumeration_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterEnumeration_type_definition(@NotNull VhdlParser.Enumeration_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#enumeration_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitEnumeration_type_definition(@NotNull VhdlParser.Enumeration_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#port_clause}.
	 * @param ctx the parse tree
	 */
	void enterPort_clause(@NotNull VhdlParser.Port_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#port_clause}.
	 * @param ctx the parse tree
	 */
	void exitPort_clause(@NotNull VhdlParser.Port_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#constrained_array_definition}.
	 * @param ctx the parse tree
	 */
	void enterConstrained_array_definition(@NotNull VhdlParser.Constrained_array_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#constrained_array_definition}.
	 * @param ctx the parse tree
	 */
	void exitConstrained_array_definition(@NotNull VhdlParser.Constrained_array_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#index_specification}.
	 * @param ctx the parse tree
	 */
	void enterIndex_specification(@NotNull VhdlParser.Index_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#index_specification}.
	 * @param ctx the parse tree
	 */
	void exitIndex_specification(@NotNull VhdlParser.Index_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#allocator}.
	 * @param ctx the parse tree
	 */
	void enterAllocator(@NotNull VhdlParser.AllocatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#allocator}.
	 * @param ctx the parse tree
	 */
	void exitAllocator(@NotNull VhdlParser.AllocatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_literal(@NotNull VhdlParser.Numeric_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_literal(@NotNull VhdlParser.Numeric_literalContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#index_constraint}.
	 * @param ctx the parse tree
	 */
	void enterIndex_constraint(@NotNull VhdlParser.Index_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#index_constraint}.
	 * @param ctx the parse tree
	 */
	void exitIndex_constraint(@NotNull VhdlParser.Index_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#design_file}.
	 * @param ctx the parse tree
	 */
	void enterDesign_file(@NotNull VhdlParser.Design_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#design_file}.
	 * @param ctx the parse tree
	 */
	void exitDesign_file(@NotNull VhdlParser.Design_fileContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void enterExit_statement(@NotNull VhdlParser.Exit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void exitExit_statement(@NotNull VhdlParser.Exit_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(@NotNull VhdlParser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(@NotNull VhdlParser.Block_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#actual_designator}.
	 * @param ctx the parse tree
	 */
	void enterActual_designator(@NotNull VhdlParser.Actual_designatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#actual_designator}.
	 * @param ctx the parse tree
	 */
	void exitActual_designator(@NotNull VhdlParser.Actual_designatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#group_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGroup_declaration(@NotNull VhdlParser.Group_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#group_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGroup_declaration(@NotNull VhdlParser.Group_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#secondary_unit}.
	 * @param ctx the parse tree
	 */
	void enterSecondary_unit(@NotNull VhdlParser.Secondary_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#secondary_unit}.
	 * @param ctx the parse tree
	 */
	void exitSecondary_unit(@NotNull VhdlParser.Secondary_unitContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#generic_clause}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_clause(@NotNull VhdlParser.Generic_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#generic_clause}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_clause(@NotNull VhdlParser.Generic_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#entity_declarative_item}.
	 * @param ctx the parse tree
	 */
	void enterEntity_declarative_item(@NotNull VhdlParser.Entity_declarative_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#entity_declarative_item}.
	 * @param ctx the parse tree
	 */
	void exitEntity_declarative_item(@NotNull VhdlParser.Entity_declarative_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#interface_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_declaration(@NotNull VhdlParser.Interface_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#interface_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_declaration(@NotNull VhdlParser.Interface_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#label_colon}.
	 * @param ctx the parse tree
	 */
	void enterLabel_colon(@NotNull VhdlParser.Label_colonContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#label_colon}.
	 * @param ctx the parse tree
	 */
	void exitLabel_colon(@NotNull VhdlParser.Label_colonContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#subprogram_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_declaration(@NotNull VhdlParser.Subprogram_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#subprogram_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_declaration(@NotNull VhdlParser.Subprogram_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#selected_signal_assignment}.
	 * @param ctx the parse tree
	 */
	void enterSelected_signal_assignment(@NotNull VhdlParser.Selected_signal_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#selected_signal_assignment}.
	 * @param ctx the parse tree
	 */
	void exitSelected_signal_assignment(@NotNull VhdlParser.Selected_signal_assignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void enterType_definition(@NotNull VhdlParser.Type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void exitType_definition(@NotNull VhdlParser.Type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull VhdlParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull VhdlParser.PrimaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#disconnection_specification}.
	 * @param ctx the parse tree
	 */
	void enterDisconnection_specification(@NotNull VhdlParser.Disconnection_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#disconnection_specification}.
	 * @param ctx the parse tree
	 */
	void exitDisconnection_specification(@NotNull VhdlParser.Disconnection_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#library_clause}.
	 * @param ctx the parse tree
	 */
	void enterLibrary_clause(@NotNull VhdlParser.Library_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#library_clause}.
	 * @param ctx the parse tree
	 */
	void exitLibrary_clause(@NotNull VhdlParser.Library_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#architecture_declarative_part}.
	 * @param ctx the parse tree
	 */
	void enterArchitecture_declarative_part(@NotNull VhdlParser.Architecture_declarative_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#architecture_declarative_part}.
	 * @param ctx the parse tree
	 */
	void exitArchitecture_declarative_part(@NotNull VhdlParser.Architecture_declarative_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#conditional_waveforms_2}.
	 * @param ctx the parse tree
	 */
	void enterConditional_waveforms_2(@NotNull VhdlParser.Conditional_waveforms_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#conditional_waveforms_2}.
	 * @param ctx the parse tree
	 */
	void exitConditional_waveforms_2(@NotNull VhdlParser.Conditional_waveforms_2Context ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#condition_clause}.
	 * @param ctx the parse tree
	 */
	void enterCondition_clause(@NotNull VhdlParser.Condition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#condition_clause}.
	 * @param ctx the parse tree
	 */
	void exitCondition_clause(@NotNull VhdlParser.Condition_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#floating_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterFloating_type_definition(@NotNull VhdlParser.Floating_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#floating_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitFloating_type_definition(@NotNull VhdlParser.Floating_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#qualified_expression}.
	 * @param ctx the parse tree
	 */
	void enterQualified_expression(@NotNull VhdlParser.Qualified_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#qualified_expression}.
	 * @param ctx the parse tree
	 */
	void exitQualified_expression(@NotNull VhdlParser.Qualified_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#selected_waveforms}.
	 * @param ctx the parse tree
	 */
	void enterSelected_waveforms(@NotNull VhdlParser.Selected_waveformsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#selected_waveforms}.
	 * @param ctx the parse tree
	 */
	void exitSelected_waveforms(@NotNull VhdlParser.Selected_waveformsContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#concurrent_signal_assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterConcurrent_signal_assignment_statement(@NotNull VhdlParser.Concurrent_signal_assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#concurrent_signal_assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitConcurrent_signal_assignment_statement(@NotNull VhdlParser.Concurrent_signal_assignment_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#package_declarative_item}.
	 * @param ctx the parse tree
	 */
	void enterPackage_declarative_item(@NotNull VhdlParser.Package_declarative_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#package_declarative_item}.
	 * @param ctx the parse tree
	 */
	void exitPackage_declarative_item(@NotNull VhdlParser.Package_declarative_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#library_unit}.
	 * @param ctx the parse tree
	 */
	void enterLibrary_unit(@NotNull VhdlParser.Library_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#library_unit}.
	 * @param ctx the parse tree
	 */
	void exitLibrary_unit(@NotNull VhdlParser.Library_unitContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#context_clause}.
	 * @param ctx the parse tree
	 */
	void enterContext_clause(@NotNull VhdlParser.Context_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#context_clause}.
	 * @param ctx the parse tree
	 */
	void exitContext_clause(@NotNull VhdlParser.Context_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#shift_operator}.
	 * @param ctx the parse tree
	 */
	void enterShift_operator(@NotNull VhdlParser.Shift_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#shift_operator}.
	 * @param ctx the parse tree
	 */
	void exitShift_operator(@NotNull VhdlParser.Shift_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#sequence_of_statements}.
	 * @param ctx the parse tree
	 */
	void enterSequence_of_statements(@NotNull VhdlParser.Sequence_of_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#sequence_of_statements}.
	 * @param ctx the parse tree
	 */
	void exitSequence_of_statements(@NotNull VhdlParser.Sequence_of_statementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#subprogram_declarative_part}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_declarative_part(@NotNull VhdlParser.Subprogram_declarative_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#subprogram_declarative_part}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_declarative_part(@NotNull VhdlParser.Subprogram_declarative_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#element_declaration}.
	 * @param ctx the parse tree
	 */
	void enterElement_declaration(@NotNull VhdlParser.Element_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#element_declaration}.
	 * @param ctx the parse tree
	 */
	void exitElement_declaration(@NotNull VhdlParser.Element_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#attribute_specification}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_specification(@NotNull VhdlParser.Attribute_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#attribute_specification}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_specification(@NotNull VhdlParser.Attribute_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#generic_list}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_list(@NotNull VhdlParser.Generic_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#generic_list}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_list(@NotNull VhdlParser.Generic_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#concurrent_assertion_statement}.
	 * @param ctx the parse tree
	 */
	void enterConcurrent_assertion_statement(@NotNull VhdlParser.Concurrent_assertion_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#concurrent_assertion_statement}.
	 * @param ctx the parse tree
	 */
	void exitConcurrent_assertion_statement(@NotNull VhdlParser.Concurrent_assertion_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(@NotNull VhdlParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(@NotNull VhdlParser.String_literalContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#entity_class}.
	 * @param ctx the parse tree
	 */
	void enterEntity_class(@NotNull VhdlParser.Entity_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#entity_class}.
	 * @param ctx the parse tree
	 */
	void exitEntity_class(@NotNull VhdlParser.Entity_classContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#configuration_declarative_item}.
	 * @param ctx the parse tree
	 */
	void enterConfiguration_declarative_item(@NotNull VhdlParser.Configuration_declarative_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#configuration_declarative_item}.
	 * @param ctx the parse tree
	 */
	void exitConfiguration_declarative_item(@NotNull VhdlParser.Configuration_declarative_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#file_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterFile_type_definition(@NotNull VhdlParser.File_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#file_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitFile_type_definition(@NotNull VhdlParser.File_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#generation_scheme}.
	 * @param ctx the parse tree
	 */
	void enterGeneration_scheme(@NotNull VhdlParser.Generation_schemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#generation_scheme}.
	 * @param ctx the parse tree
	 */
	void exitGeneration_scheme(@NotNull VhdlParser.Generation_schemeContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection(@NotNull VhdlParser.DirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection(@NotNull VhdlParser.DirectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#wait_statement}.
	 * @param ctx the parse tree
	 */
	void enterWait_statement(@NotNull VhdlParser.Wait_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#wait_statement}.
	 * @param ctx the parse tree
	 */
	void exitWait_statement(@NotNull VhdlParser.Wait_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#formal_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterFormal_parameter_list(@NotNull VhdlParser.Formal_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#formal_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitFormal_parameter_list(@NotNull VhdlParser.Formal_parameter_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(@NotNull VhdlParser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(@NotNull VhdlParser.Loop_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#actual_part}.
	 * @param ctx the parse tree
	 */
	void enterActual_part(@NotNull VhdlParser.Actual_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#actual_part}.
	 * @param ctx the parse tree
	 */
	void exitActual_part(@NotNull VhdlParser.Actual_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#entity_statement_part}.
	 * @param ctx the parse tree
	 */
	void enterEntity_statement_part(@NotNull VhdlParser.Entity_statement_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#entity_statement_part}.
	 * @param ctx the parse tree
	 */
	void exitEntity_statement_part(@NotNull VhdlParser.Entity_statement_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#file_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFile_declaration(@NotNull VhdlParser.File_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#file_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFile_declaration(@NotNull VhdlParser.File_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#interface_signal_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_signal_declaration(@NotNull VhdlParser.Interface_signal_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#interface_signal_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_signal_declaration(@NotNull VhdlParser.Interface_signal_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#access_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterAccess_type_definition(@NotNull VhdlParser.Access_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#access_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitAccess_type_definition(@NotNull VhdlParser.Access_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#report_statement}.
	 * @param ctx the parse tree
	 */
	void enterReport_statement(@NotNull VhdlParser.Report_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#report_statement}.
	 * @param ctx the parse tree
	 */
	void exitReport_statement(@NotNull VhdlParser.Report_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#procedure_call}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_call(@NotNull VhdlParser.Procedure_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#procedure_call}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_call(@NotNull VhdlParser.Procedure_callContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#concurrent_signal_assignment_statement_2}.
	 * @param ctx the parse tree
	 */
	void enterConcurrent_signal_assignment_statement_2(@NotNull VhdlParser.Concurrent_signal_assignment_statement_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#concurrent_signal_assignment_statement_2}.
	 * @param ctx the parse tree
	 */
	void exitConcurrent_signal_assignment_statement_2(@NotNull VhdlParser.Concurrent_signal_assignment_statement_2Context ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#file_open_information}.
	 * @param ctx the parse tree
	 */
	void enterFile_open_information(@NotNull VhdlParser.File_open_informationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#file_open_information}.
	 * @param ctx the parse tree
	 */
	void exitFile_open_information(@NotNull VhdlParser.File_open_informationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#character_literal}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_literal(@NotNull VhdlParser.Character_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#character_literal}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_literal(@NotNull VhdlParser.Character_literalContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#entity_specification}.
	 * @param ctx the parse tree
	 */
	void enterEntity_specification(@NotNull VhdlParser.Entity_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#entity_specification}.
	 * @param ctx the parse tree
	 */
	void exitEntity_specification(@NotNull VhdlParser.Entity_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#interface_list}.
	 * @param ctx the parse tree
	 */
	void enterInterface_list(@NotNull VhdlParser.Interface_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#interface_list}.
	 * @param ctx the parse tree
	 */
	void exitInterface_list(@NotNull VhdlParser.Interface_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#process_statement_part}.
	 * @param ctx the parse tree
	 */
	void enterProcess_statement_part(@NotNull VhdlParser.Process_statement_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#process_statement_part}.
	 * @param ctx the parse tree
	 */
	void exitProcess_statement_part(@NotNull VhdlParser.Process_statement_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#waveform_element}.
	 * @param ctx the parse tree
	 */
	void enterWaveform_element(@NotNull VhdlParser.Waveform_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#waveform_element}.
	 * @param ctx the parse tree
	 */
	void exitWaveform_element(@NotNull VhdlParser.Waveform_elementContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#subprogram_statement_part}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_statement_part(@NotNull VhdlParser.Subprogram_statement_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#subprogram_statement_part}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_statement_part(@NotNull VhdlParser.Subprogram_statement_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#suffix}.
	 * @param ctx the parse tree
	 */
	void enterSuffix(@NotNull VhdlParser.SuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#suffix}.
	 * @param ctx the parse tree
	 */
	void exitSuffix(@NotNull VhdlParser.SuffixContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterType_declaration(@NotNull VhdlParser.Type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitType_declaration(@NotNull VhdlParser.Type_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#attribute_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_declaration(@NotNull VhdlParser.Attribute_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#attribute_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_declaration(@NotNull VhdlParser.Attribute_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull VhdlParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull VhdlParser.TermContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#guarded_signal_specification}.
	 * @param ctx the parse tree
	 */
	void enterGuarded_signal_specification(@NotNull VhdlParser.Guarded_signal_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#guarded_signal_specification}.
	 * @param ctx the parse tree
	 */
	void exitGuarded_signal_specification(@NotNull VhdlParser.Guarded_signal_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(@NotNull VhdlParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(@NotNull VhdlParser.TargetContext ctx);

	/**
	 * Enter a parse tree produced by {@link VhdlParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull VhdlParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link VhdlParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull VhdlParser.LiteralContext ctx);
}