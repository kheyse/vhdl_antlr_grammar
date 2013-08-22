// Generated from Vhdl.g by ANTLR 4.1


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VhdlParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, QUOTE=3, POUND=4, AND=5, STAR=6, STAR2=7, PLUS=8, 
		COMMA=9, MINUS=10, DOT=11, SLASH=12, SLASHEQ=13, COLON=14, SEMI=15, LST=16, 
		LSTEQ=17, LSTGRT=18, EQ=19, GRT=20, GRTEQ=21, EQGRT=22, LBRACK=23, RBRACK=24, 
		USCORE=25, BAR=26, EXCL=27, DOLLAR=28, PCNT=29, AT=30, QMARK=31, BSLASH=32, 
		CARET=33, BTIC=34, LCURLY=35, RCURLY=36, TILDE=37, COLONEQ=38, K_ABS=39, 
		K_ACCESS=40, K_AFTER=41, K_ALIAS=42, K_ALL=43, K_AND=44, K_ARCHITECTURE=45, 
		K_ARRAY=46, K_ASSERT=47, K_ATTRIBUTE=48, K_BEGIN=49, K_BLOCK=50, K_BODY=51, 
		K_BUFFER=52, K_BUS=53, K_CASE=54, K_COMPONENT=55, K_CONFIGURATION=56, 
		K_CONSTANT=57, K_DISCONNECT=58, K_DOWNTO=59, K_ELSE=60, K_ELSIF=61, K_END=62, 
		K_ENTITY=63, K_EXIT=64, K_FILE=65, K_FOR=66, K_FUNCTION=67, K_GENERATE=68, 
		K_GENERIC=69, K_GROUP=70, K_GUARDED=71, K_IF=72, K_IMPURE=73, K_IN=74, 
		K_INERTIAL=75, K_INOUT=76, K_IS=77, K_LABEL=78, K_LIBRARY=79, K_LINKAGE=80, 
		K_LITERAL=81, K_LOOP=82, K_MAP=83, K_MOD=84, K_NAND=85, K_NEW=86, K_NEXT=87, 
		K_NOR=88, K_NOT=89, K_NULL=90, K_OF=91, K_ON=92, K_OPEN=93, K_OR=94, K_OTHERS=95, 
		K_OUT=96, K_PACKAGE=97, K_PORT=98, K_POSTPONED=99, K_PROCEDURE=100, K_PROCESS=101, 
		K_PROTECTED=102, K_PURE=103, K_RANGE=104, K_RECORD=105, K_REGISTER=106, 
		K_REJECT=107, K_REM=108, K_REPORT=109, K_RETURN=110, K_ROL=111, K_ROR=112, 
		K_SELECT=113, K_SEVERITY=114, K_SHARED=115, K_SIGNAL=116, K_SLA=117, K_SLL=118, 
		K_SRA=119, K_SRL=120, K_SUBTYPE=121, K_THEN=122, K_TO=123, K_TRANSPORT=124, 
		K_TYPE=125, K_UNAFFECTED=126, K_UNITS=127, K_UNTIL=128, K_USE=129, K_VARIABLE=130, 
		K_WAIT=131, K_WHEN=132, K_WHILE=133, K_WITH=134, K_XNOR=135, K_XOR=136, 
		WS=137, NEWLINE=138, COMMENT=139, BASIC_IDENTIFIER=140, BIT_STRING_LITERAL=141, 
		TIC=142, TIC_SIMPLE_NAME=143, CHARACTER_LITERAL=144, EXTENDED_IDENTIFIER=145, 
		STRING_LITERAL=146, DECIMAL_LITERAL=147, BASED_LITERAL=148;
	public static final String[] tokenNames = {
		"<INVALID>", "'('", "')'", "'\"'", "'#'", "'&'", "'*'", "'**'", "'+'", 
		"','", "'-'", "'.'", "'/'", "'/='", "':'", "';'", "'<'", "'<='", "'<>'", 
		"'='", "'>'", "'>='", "'=>'", "'['", "']'", "'_'", "'|'", "'!'", "'$'", 
		"'%'", "'@'", "'?'", "'\\'", "'^'", "'`'", "'{'", "'}'", "'~'", "':='", 
		"'abs'", "'access'", "'after'", "'alias'", "'all'", "'and'", "'architecture'", 
		"'array'", "'assert'", "'attribute'", "'begin'", "'block'", "'body'", 
		"'buffer'", "'bus'", "'case'", "'component'", "'configuration'", "'constant'", 
		"'disconnect'", "'downto'", "'else'", "'elsif'", "'end'", "'entity'", 
		"'exit'", "'file'", "'for'", "'function'", "'generate'", "'generic'", 
		"'group'", "'guarded'", "'if'", "'impure'", "'in'", "'inertial'", "'inout'", 
		"'is'", "'label'", "'library'", "'linkage'", "'literal'", "'loop'", "'map'", 
		"'mod'", "'nand'", "'new'", "'next'", "'nor'", "'not'", "'null'", "'of'", 
		"'on'", "'open'", "'or'", "'others'", "'out'", "'package'", "'port'", 
		"'postponed'", "'procedure'", "'process'", "'protected'", "'pure'", "'range'", 
		"'record'", "'register'", "'reject'", "'rem'", "'report'", "'return'", 
		"'rol'", "'ror'", "'select'", "'severity'", "'shared'", "'signal'", "'sla'", 
		"'sll'", "'sra'", "'srl'", "'subtype'", "'then'", "'to'", "'transport'", 
		"'type'", "'unaffected'", "'units'", "'until'", "'use'", "'variable'", 
		"'wait'", "'when'", "'while'", "'with'", "'xnor'", "'xor'", "WS", "'\n'", 
		"COMMENT", "BASIC_IDENTIFIER", "BIT_STRING_LITERAL", "'''", "TIC_SIMPLE_NAME", 
		"CHARACTER_LITERAL", "EXTENDED_IDENTIFIER", "STRING_LITERAL", "DECIMAL_LITERAL", 
		"BASED_LITERAL"
	};
	public static final int
		RULE_abstract_literal = 0, RULE_access_type_definition = 1, RULE_actual_designator = 2, 
		RULE_actual_parameter_part = 3, RULE_actual_part = 4, RULE_adding_operator = 5, 
		RULE_aggregate = 6, RULE_alias_declaration = 7, RULE_alias_designator = 8, 
		RULE_allocator = 9, RULE_architecture_body = 10, RULE_architecture_declarative_part = 11, 
		RULE_architecture_statement_part = 12, RULE_array_type_definition = 13, 
		RULE_assertion = 14, RULE_assertion_statement = 15, RULE_association_element = 16, 
		RULE_association_list = 17, RULE_attribute_declaration = 18, RULE_attribute_designator = 19, 
		RULE_tic_attribute_designator = 20, RULE_attribute_specification = 21, 
		RULE_base_unit_declaration = 22, RULE_based_literal = 23, RULE_binding_indication = 24, 
		RULE_bit_string_literal = 25, RULE_block_configuration = 26, RULE_block_declarative_item = 27, 
		RULE_block_declarative_part = 28, RULE_block_header = 29, RULE_block_specification = 30, 
		RULE_block_statement = 31, RULE_block_statement_part = 32, RULE_case_statement = 33, 
		RULE_case_statement_alternative = 34, RULE_character_literal = 35, RULE_choice = 36, 
		RULE_choices = 37, RULE_component_configuration = 38, RULE_component_declaration = 39, 
		RULE_component_instantiation_statement = 40, RULE_component_specification = 41, 
		RULE_composite_type_definition = 42, RULE_concurrent_assertion_statement = 43, 
		RULE_concurrent_procedure_call_statement = 44, RULE_concurrent_signal_assignment_statement = 45, 
		RULE_concurrent_signal_assignment_statement_2 = 46, RULE_concurrent_statement = 47, 
		RULE_condition = 48, RULE_condition_clause = 49, RULE_conditional_signal_assignment = 50, 
		RULE_conditional_waveforms = 51, RULE_conditional_waveforms_2 = 52, RULE_configuration_declaration = 53, 
		RULE_configuration_declarative_item = 54, RULE_configuration_declarative_part = 55, 
		RULE_configuration_item = 56, RULE_configuration_specification = 57, RULE_constant_declaration = 58, 
		RULE_constrained_array_definition = 59, RULE_constraint = 60, RULE_context_clause = 61, 
		RULE_context_item = 62, RULE_decimal_literal = 63, RULE_declaration = 64, 
		RULE_delay_mechanism = 65, RULE_design_file = 66, RULE_design_unit = 67, 
		RULE_designator = 68, RULE_direction = 69, RULE_disconnection_specification = 70, 
		RULE_discrete_range = 71, RULE_element_association = 72, RULE_element_declaration = 73, 
		RULE_element_subtype_definition = 74, RULE_entity_aspect = 75, RULE_entity_class = 76, 
		RULE_entity_class_entry = 77, RULE_entity_class_entry_list = 78, RULE_entity_declaration = 79, 
		RULE_entity_declarative_item = 80, RULE_entity_declarative_part = 81, 
		RULE_entity_designator = 82, RULE_entity_header = 83, RULE_entity_name_list = 84, 
		RULE_entity_specification = 85, RULE_entity_statement = 86, RULE_entity_statement_part = 87, 
		RULE_entity_tag = 88, RULE_enumeration_literal = 89, RULE_enumeration_type_definition = 90, 
		RULE_exit_statement = 91, RULE_expression = 92, RULE_logical_op = 93, 
		RULE_factor = 94, RULE_file_declaration = 95, RULE_file_logical_name = 96, 
		RULE_file_open_information = 97, RULE_file_type_definition = 98, RULE_floating_type_definition = 99, 
		RULE_formal_parameter_list = 100, RULE_formal_part = 101, RULE_full_type_declaration = 102, 
		RULE_function_call = 103, RULE_generate_statement = 104, RULE_generation_scheme = 105, 
		RULE_generic_clause = 106, RULE_generic_list = 107, RULE_generic_map_aspect = 108, 
		RULE_group_constituent = 109, RULE_group_constituent_list = 110, RULE_group_declaration = 111, 
		RULE_group_template_declaration = 112, RULE_guarded_signal_specification = 113, 
		RULE_identifier = 114, RULE_identifier_list = 115, RULE_if_statement = 116, 
		RULE_incomplete_type_declaration = 117, RULE_index_constraint = 118, RULE_index_specification = 119, 
		RULE_index_subtype_definition = 120, RULE_instantiated_unit = 121, RULE_instantiation_list = 122, 
		RULE_interface_constant_declaration = 123, RULE_interface_declaration = 124, 
		RULE_interface_element = 125, RULE_interface_file_declaration = 126, RULE_interface_list = 127, 
		RULE_interface_signal_declaration = 128, RULE_interface_variable_declaration = 129, 
		RULE_iteration_scheme = 130, RULE_label = 131, RULE_label_colon = 132, 
		RULE_library_clause = 133, RULE_library_unit = 134, RULE_literal = 135, 
		RULE_logical_name = 136, RULE_logical_name_list = 137, RULE_logical_operator = 138, 
		RULE_loop_statement = 139, RULE_miscellaneous_operator = 140, RULE_vmode = 141, 
		RULE_multiplying_operator = 142, RULE_name = 143, RULE_next_statement = 144, 
		RULE_null_statement = 145, RULE_numeric_literal = 146, RULE_object_declaration = 147, 
		RULE_operator_symbol = 148, RULE_package_body = 149, RULE_package_body_declarative_item = 150, 
		RULE_package_body_declarative_part = 151, RULE_package_declaration = 152, 
		RULE_package_declarative_item = 153, RULE_package_declarative_part = 154, 
		RULE_parameter_specification = 155, RULE_physical_literal = 156, RULE_physical_type_definition = 157, 
		RULE_port_clause = 158, RULE_port_list = 159, RULE_port_map_aspect = 160, 
		RULE_primary = 161, RULE_primary_unit = 162, RULE_procedure_call = 163, 
		RULE_procedure_call_statement = 164, RULE_process_declarative_item = 165, 
		RULE_process_declarative_part = 166, RULE_process_statement = 167, RULE_process_statement_part = 168, 
		RULE_protected_type_body = 169, RULE_protected_type_body_declarative_item = 170, 
		RULE_protected_type_body_declarative_part = 171, RULE_protected_type_declaration = 172, 
		RULE_protected_type_declarative_item = 173, RULE_protected_type_declarative_part = 174, 
		RULE_protected_type_definition = 175, RULE_qualified_expression = 176, 
		RULE_range = 177, RULE_range_constraint = 178, RULE_record_type_definition = 179, 
		RULE_relation = 180, RULE_relational_operator = 181, RULE_report_statement = 182, 
		RULE_return_statement = 183, RULE_scalar_type_definition = 184, RULE_secondary_unit = 185, 
		RULE_secondary_unit_declaration = 186, RULE_selected_signal_assignment = 187, 
		RULE_selected_waveforms = 188, RULE_sensitivity_clause = 189, RULE_sensitivity_list = 190, 
		RULE_sequence_of_statements = 191, RULE_sequential_statement = 192, RULE_shift_expression = 193, 
		RULE_shift_operator = 194, RULE_sign = 195, RULE_signal_assignment_statement = 196, 
		RULE_signal_declaration = 197, RULE_signal_kind = 198, RULE_signal_list = 199, 
		RULE_signature = 200, RULE_simple_expression = 201, RULE_simple_name = 202, 
		RULE_string_literal = 203, RULE_subprogram_body = 204, RULE_subprogram_declaration = 205, 
		RULE_subprogram_declarative_item = 206, RULE_subprogram_declarative_part = 207, 
		RULE_subprogram_kind = 208, RULE_subprogram_specification = 209, RULE_subprogram_statement_part = 210, 
		RULE_subtype_declaration = 211, RULE_subtype_indication = 212, RULE_suffix = 213, 
		RULE_target = 214, RULE_term = 215, RULE_timeout_clause = 216, RULE_type_declaration = 217, 
		RULE_type_definition = 218, RULE_unconstrained_array_definition = 219, 
		RULE_use_clause = 220, RULE_variable_assignment_statement = 221, RULE_variable_declaration = 222, 
		RULE_wait_statement = 223, RULE_waveform = 224, RULE_waveform_element = 225, 
		RULE_voptions = 226;
	public static final String[] ruleNames = {
		"abstract_literal", "access_type_definition", "actual_designator", "actual_parameter_part", 
		"actual_part", "adding_operator", "aggregate", "alias_declaration", "alias_designator", 
		"allocator", "architecture_body", "architecture_declarative_part", "architecture_statement_part", 
		"array_type_definition", "assertion", "assertion_statement", "association_element", 
		"association_list", "attribute_declaration", "attribute_designator", "tic_attribute_designator", 
		"attribute_specification", "base_unit_declaration", "based_literal", "binding_indication", 
		"bit_string_literal", "block_configuration", "block_declarative_item", 
		"block_declarative_part", "block_header", "block_specification", "block_statement", 
		"block_statement_part", "case_statement", "case_statement_alternative", 
		"character_literal", "choice", "choices", "component_configuration", "component_declaration", 
		"component_instantiation_statement", "component_specification", "composite_type_definition", 
		"concurrent_assertion_statement", "concurrent_procedure_call_statement", 
		"concurrent_signal_assignment_statement", "concurrent_signal_assignment_statement_2", 
		"concurrent_statement", "condition", "condition_clause", "conditional_signal_assignment", 
		"conditional_waveforms", "conditional_waveforms_2", "configuration_declaration", 
		"configuration_declarative_item", "configuration_declarative_part", "configuration_item", 
		"configuration_specification", "constant_declaration", "constrained_array_definition", 
		"constraint", "context_clause", "context_item", "decimal_literal", "declaration", 
		"delay_mechanism", "design_file", "design_unit", "designator", "direction", 
		"disconnection_specification", "discrete_range", "element_association", 
		"element_declaration", "element_subtype_definition", "entity_aspect", 
		"entity_class", "entity_class_entry", "entity_class_entry_list", "entity_declaration", 
		"entity_declarative_item", "entity_declarative_part", "entity_designator", 
		"entity_header", "entity_name_list", "entity_specification", "entity_statement", 
		"entity_statement_part", "entity_tag", "enumeration_literal", "enumeration_type_definition", 
		"exit_statement", "expression", "logical_op", "factor", "file_declaration", 
		"file_logical_name", "file_open_information", "file_type_definition", 
		"floating_type_definition", "formal_parameter_list", "formal_part", "full_type_declaration", 
		"function_call", "generate_statement", "generation_scheme", "generic_clause", 
		"generic_list", "generic_map_aspect", "group_constituent", "group_constituent_list", 
		"group_declaration", "group_template_declaration", "guarded_signal_specification", 
		"identifier", "identifier_list", "if_statement", "incomplete_type_declaration", 
		"index_constraint", "index_specification", "index_subtype_definition", 
		"instantiated_unit", "instantiation_list", "interface_constant_declaration", 
		"interface_declaration", "interface_element", "interface_file_declaration", 
		"interface_list", "interface_signal_declaration", "interface_variable_declaration", 
		"iteration_scheme", "label", "label_colon", "library_clause", "library_unit", 
		"literal", "logical_name", "logical_name_list", "logical_operator", "loop_statement", 
		"miscellaneous_operator", "vmode", "multiplying_operator", "name", "next_statement", 
		"null_statement", "numeric_literal", "object_declaration", "operator_symbol", 
		"package_body", "package_body_declarative_item", "package_body_declarative_part", 
		"package_declaration", "package_declarative_item", "package_declarative_part", 
		"parameter_specification", "physical_literal", "physical_type_definition", 
		"port_clause", "port_list", "port_map_aspect", "primary", "primary_unit", 
		"procedure_call", "procedure_call_statement", "process_declarative_item", 
		"process_declarative_part", "process_statement", "process_statement_part", 
		"protected_type_body", "protected_type_body_declarative_item", "protected_type_body_declarative_part", 
		"protected_type_declaration", "protected_type_declarative_item", "protected_type_declarative_part", 
		"protected_type_definition", "qualified_expression", "range", "range_constraint", 
		"record_type_definition", "relation", "relational_operator", "report_statement", 
		"return_statement", "scalar_type_definition", "secondary_unit", "secondary_unit_declaration", 
		"selected_signal_assignment", "selected_waveforms", "sensitivity_clause", 
		"sensitivity_list", "sequence_of_statements", "sequential_statement", 
		"shift_expression", "shift_operator", "sign", "signal_assignment_statement", 
		"signal_declaration", "signal_kind", "signal_list", "signature", "simple_expression", 
		"simple_name", "string_literal", "subprogram_body", "subprogram_declaration", 
		"subprogram_declarative_item", "subprogram_declarative_part", "subprogram_kind", 
		"subprogram_specification", "subprogram_statement_part", "subtype_declaration", 
		"subtype_indication", "suffix", "target", "term", "timeout_clause", "type_declaration", 
		"type_definition", "unconstrained_array_definition", "use_clause", "variable_assignment_statement", 
		"variable_declaration", "wait_statement", "waveform", "waveform_element", 
		"voptions"
	};

	@Override
	public String getGrammarFileName() { return "Vhdl.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }



	public VhdlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Abstract_literalContext extends ParserRuleContext {
		public Decimal_literalContext decimal_literal() {
			return getRuleContext(Decimal_literalContext.class,0);
		}
		public Based_literalContext based_literal() {
			return getRuleContext(Based_literalContext.class,0);
		}
		public Abstract_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstract_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterAbstract_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitAbstract_literal(this);
		}
	}

	public final Abstract_literalContext abstract_literal() throws RecognitionException {
		Abstract_literalContext _localctx = new Abstract_literalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_abstract_literal);
		try {
			setState(456);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(454); decimal_literal();
				}
				break;
			case BASED_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(455); based_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Access_type_definitionContext extends ParserRuleContext {
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode K_ACCESS() { return getToken(VhdlParser.K_ACCESS, 0); }
		public Access_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterAccess_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitAccess_type_definition(this);
		}
	}

	public final Access_type_definitionContext access_type_definition() throws RecognitionException {
		Access_type_definitionContext _localctx = new Access_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_access_type_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458); match(K_ACCESS);
			setState(459); subtype_indication();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Actual_designatorContext extends ParserRuleContext {
		public TerminalNode K_OPEN() { return getToken(VhdlParser.K_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Actual_designatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterActual_designator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitActual_designator(this);
		}
	}

	public final Actual_designatorContext actual_designator() throws RecognitionException {
		Actual_designatorContext _localctx = new Actual_designatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_actual_designator);
		try {
			setState(463);
			switch (_input.LA(1)) {
			case LPAREN:
			case PLUS:
			case MINUS:
			case K_ABS:
			case K_NEW:
			case K_NOT:
			case K_NULL:
			case BASIC_IDENTIFIER:
			case BIT_STRING_LITERAL:
			case CHARACTER_LITERAL:
			case EXTENDED_IDENTIFIER:
			case STRING_LITERAL:
			case DECIMAL_LITERAL:
			case BASED_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(461); expression();
				}
				break;
			case K_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(462); match(K_OPEN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Actual_parameter_partContext extends ParserRuleContext {
		public Association_listContext association_list() {
			return getRuleContext(Association_listContext.class,0);
		}
		public Actual_parameter_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_parameter_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterActual_parameter_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitActual_parameter_part(this);
		}
	}

	public final Actual_parameter_partContext actual_parameter_part() throws RecognitionException {
		Actual_parameter_partContext _localctx = new Actual_parameter_partContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_actual_parameter_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465); association_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Actual_partContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(VhdlParser.RPAREN, 0); }
		public Actual_designatorContext actual_designator() {
			return getRuleContext(Actual_designatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VhdlParser.LPAREN, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Actual_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterActual_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitActual_part(this);
		}
	}

	public final Actual_partContext actual_part() throws RecognitionException {
		Actual_partContext _localctx = new Actual_partContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_actual_part);
		try {
			setState(473);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(467); name();
				setState(468); match(LPAREN);
				setState(469); actual_designator();
				setState(470); match(RPAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(472); actual_designator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Adding_operatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(VhdlParser.AND, 0); }
		public TerminalNode MINUS() { return getToken(VhdlParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(VhdlParser.PLUS, 0); }
		public Adding_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adding_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterAdding_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitAdding_operator(this);
		}
	}

	public final Adding_operatorContext adding_operator() throws RecognitionException {
		Adding_operatorContext _localctx = new Adding_operatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_adding_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregateContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(VhdlParser.COMMA); }
		public Element_associationContext element_association(int i) {
			return getRuleContext(Element_associationContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(VhdlParser.RPAREN, 0); }
		public List<Element_associationContext> element_association() {
			return getRuleContexts(Element_associationContext.class);
		}
		public TerminalNode LPAREN() { return getToken(VhdlParser.LPAREN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(VhdlParser.COMMA, i);
		}
		public AggregateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterAggregate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitAggregate(this);
		}
	}

	public final AggregateContext aggregate() throws RecognitionException {
		AggregateContext _localctx = new AggregateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_aggregate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477); match(LPAREN);
			setState(478); element_association();
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(479); match(COMMA);
				setState(480); element_association();
				}
				}
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(486); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alias_declarationContext extends ParserRuleContext {
		public Alias_designatorContext alias_designator() {
			return getRuleContext(Alias_designatorContext.class,0);
		}
		public TerminalNode K_ALIAS() { return getToken(VhdlParser.K_ALIAS, 0); }
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VhdlParser.COLON, 0); }
		public TerminalNode K_IS() { return getToken(VhdlParser.K_IS, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Alias_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterAlias_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitAlias_declaration(this);
		}
	}

	public final Alias_declarationContext alias_declaration() throws RecognitionException {
		Alias_declarationContext _localctx = new Alias_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_alias_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488); match(K_ALIAS);
			setState(489); alias_designator();
			setState(492);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(490); match(COLON);
				setState(491); subtype_indication();
				}
			}

			setState(494); match(K_IS);
			setState(495); name();
			setState(497);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(496); signature();
				}
			}

			setState(499); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alias_designatorContext extends ParserRuleContext {
		public Operator_symbolContext operator_symbol() {
			return getRuleContext(Operator_symbolContext.class,0);
		}
		public Character_literalContext character_literal() {
			return getRuleContext(Character_literalContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Alias_designatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterAlias_designator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitAlias_designator(this);
		}
	}

	public final Alias_designatorContext alias_designator() throws RecognitionException {
		Alias_designatorContext _localctx = new Alias_designatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_alias_designator);
		try {
			setState(504);
			switch (_input.LA(1)) {
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(501); identifier();
				}
				break;
			case CHARACTER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(502); character_literal();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(503); operator_symbol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AllocatorContext extends ParserRuleContext {
		public TerminalNode K_NEW() { return getToken(VhdlParser.K_NEW, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public Qualified_expressionContext qualified_expression() {
			return getRuleContext(Qualified_expressionContext.class,0);
		}
		public AllocatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allocator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterAllocator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitAllocator(this);
		}
	}

	public final AllocatorContext allocator() throws RecognitionException {
		AllocatorContext _localctx = new AllocatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_allocator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506); match(K_NEW);
			setState(509);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(507); subtype_indication();
				}
				break;

			case 2:
				{
				setState(508); qualified_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Architecture_bodyContext extends ParserRuleContext {
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public Architecture_declarative_partContext architecture_declarative_part() {
			return getRuleContext(Architecture_declarative_partContext.class,0);
		}
		public List<TerminalNode> K_ARCHITECTURE() { return getTokens(VhdlParser.K_ARCHITECTURE); }
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public TerminalNode K_BEGIN() { return getToken(VhdlParser.K_BEGIN, 0); }
		public TerminalNode K_END() { return getToken(VhdlParser.K_END, 0); }
		public TerminalNode K_ARCHITECTURE(int i) {
			return getToken(VhdlParser.K_ARCHITECTURE, i);
		}
		public Architecture_statement_partContext architecture_statement_part() {
			return getRuleContext(Architecture_statement_partContext.class,0);
		}
		public TerminalNode K_IS() { return getToken(VhdlParser.K_IS, 0); }
		public TerminalNode K_OF() { return getToken(VhdlParser.K_OF, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Architecture_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_architecture_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterArchitecture_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitArchitecture_body(this);
		}
	}

	public final Architecture_bodyContext architecture_body() throws RecognitionException {
		Architecture_bodyContext _localctx = new Architecture_bodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_architecture_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511); match(K_ARCHITECTURE);
			setState(512); identifier();
			setState(513); match(K_OF);
			setState(514); name();
			setState(515); match(K_IS);
			setState(516); architecture_declarative_part();
			setState(517); match(K_BEGIN);
			setState(518); architecture_statement_part();
			setState(519); match(K_END);
			setState(521);
			_la = _input.LA(1);
			if (_la==K_ARCHITECTURE) {
				{
				setState(520); match(K_ARCHITECTURE);
				}
			}

			setState(524);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(523); simple_name();
				}
			}

			setState(526); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Architecture_declarative_partContext extends ParserRuleContext {
		public List<Block_declarative_itemContext> block_declarative_item() {
			return getRuleContexts(Block_declarative_itemContext.class);
		}
		public Block_declarative_itemContext block_declarative_item(int i) {
			return getRuleContext(Block_declarative_itemContext.class,i);
		}
		public Architecture_declarative_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_architecture_declarative_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterArchitecture_declarative_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitArchitecture_declarative_part(this);
		}
	}

	public final Architecture_declarative_partContext architecture_declarative_part() throws RecognitionException {
		Architecture_declarative_partContext _localctx = new Architecture_declarative_partContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_architecture_declarative_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (K_ALIAS - 42)) | (1L << (K_ATTRIBUTE - 42)) | (1L << (K_COMPONENT - 42)) | (1L << (K_CONSTANT - 42)) | (1L << (K_DISCONNECT - 42)) | (1L << (K_FILE - 42)) | (1L << (K_FOR - 42)) | (1L << (K_FUNCTION - 42)) | (1L << (K_GROUP - 42)) | (1L << (K_IMPURE - 42)) | (1L << (K_PROCEDURE - 42)) | (1L << (K_PURE - 42)))) != 0) || ((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (K_SHARED - 115)) | (1L << (K_SIGNAL - 115)) | (1L << (K_SUBTYPE - 115)) | (1L << (K_TYPE - 115)) | (1L << (K_USE - 115)) | (1L << (K_VARIABLE - 115)))) != 0)) {
				{
				{
				setState(528); block_declarative_item();
				}
				}
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Architecture_statement_partContext extends ParserRuleContext {
		public List<Concurrent_statementContext> concurrent_statement() {
			return getRuleContexts(Concurrent_statementContext.class);
		}
		public Concurrent_statementContext concurrent_statement(int i) {
			return getRuleContext(Concurrent_statementContext.class,i);
		}
		public Architecture_statement_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_architecture_statement_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterArchitecture_statement_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitArchitecture_statement_part(this);
		}
	}

	public final Architecture_statement_partContext architecture_statement_part() throws RecognitionException {
		Architecture_statement_partContext _localctx = new Architecture_statement_partContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_architecture_statement_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN || _la==K_ASSERT || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (K_POSTPONED - 99)) | (1L << (K_PROCESS - 99)) | (1L << (K_WITH - 99)) | (1L << (BASIC_IDENTIFIER - 99)) | (1L << (EXTENDED_IDENTIFIER - 99)) | (1L << (STRING_LITERAL - 99)))) != 0)) {
				{
				{
				setState(534); concurrent_statement();
				}
				}
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_type_definitionContext extends ParserRuleContext {
		public Constrained_array_definitionContext constrained_array_definition() {
			return getRuleContext(Constrained_array_definitionContext.class,0);
		}
		public Unconstrained_array_definitionContext unconstrained_array_definition() {
			return getRuleContext(Unconstrained_array_definitionContext.class,0);
		}
		public Array_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterArray_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitArray_type_definition(this);
		}
	}

	public final Array_type_definitionContext array_type_definition() throws RecognitionException {
		Array_type_definitionContext _localctx = new Array_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_array_type_definition);
		try {
			setState(542);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(540); unconstrained_array_definition();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(541); constrained_array_definition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertionContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode K_REPORT() { return getToken(VhdlParser.K_REPORT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode K_SEVERITY() { return getToken(VhdlParser.K_SEVERITY, 0); }
		public TerminalNode K_ASSERT() { return getToken(VhdlParser.K_ASSERT, 0); }
		public AssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterAssertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitAssertion(this);
		}
	}

	public final AssertionContext assertion() throws RecognitionException {
		AssertionContext _localctx = new AssertionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assertion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544); match(K_ASSERT);
			setState(545); condition();
			setState(548);
			_la = _input.LA(1);
			if (_la==K_REPORT) {
				{
				setState(546); match(K_REPORT);
				setState(547); expression();
				}
			}

			setState(552);
			_la = _input.LA(1);
			if (_la==K_SEVERITY) {
				{
				setState(550); match(K_SEVERITY);
				setState(551); expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assertion_statementContext extends ParserRuleContext {
		public AssertionContext assertion() {
			return getRuleContext(AssertionContext.class,0);
		}
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public Assertion_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertion_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterAssertion_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitAssertion_statement(this);
		}
	}

	public final Assertion_statementContext assertion_statement() throws RecognitionException {
		Assertion_statementContext _localctx = new Assertion_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assertion_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(554); label_colon();
				}
			}

			setState(557); assertion();
			setState(558); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Association_elementContext extends ParserRuleContext {
		public Formal_partContext formal_part() {
			return getRuleContext(Formal_partContext.class,0);
		}
		public Actual_partContext actual_part() {
			return getRuleContext(Actual_partContext.class,0);
		}
		public TerminalNode EQGRT() { return getToken(VhdlParser.EQGRT, 0); }
		public Association_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_association_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterAssociation_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitAssociation_element(this);
		}
	}

	public final Association_elementContext association_element() throws RecognitionException {
		Association_elementContext _localctx = new Association_elementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_association_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(560); formal_part();
				setState(561); match(EQGRT);
				}
				break;
			}
			setState(565); actual_part();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Association_listContext extends ParserRuleContext {
		public Association_elementContext association_element(int i) {
			return getRuleContext(Association_elementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VhdlParser.COMMA); }
		public List<Association_elementContext> association_element() {
			return getRuleContexts(Association_elementContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(VhdlParser.COMMA, i);
		}
		public Association_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_association_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterAssociation_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitAssociation_list(this);
		}
	}

	public final Association_listContext association_list() throws RecognitionException {
		Association_listContext _localctx = new Association_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_association_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567); association_element();
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(568); match(COMMA);
				setState(569); association_element();
				}
				}
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_declarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public TerminalNode K_ATTRIBUTE() { return getToken(VhdlParser.K_ATTRIBUTE, 0); }
		public TerminalNode COLON() { return getToken(VhdlParser.COLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Attribute_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterAttribute_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitAttribute_declaration(this);
		}
	}

	public final Attribute_declarationContext attribute_declaration() throws RecognitionException {
		Attribute_declarationContext _localctx = new Attribute_declarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_attribute_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575); match(K_ATTRIBUTE);
			setState(576); identifier();
			setState(577); match(COLON);
			setState(578); name();
			setState(579); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_designatorContext extends ParserRuleContext {
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public Attribute_designatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterAttribute_designator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitAttribute_designator(this);
		}
	}

	public final Attribute_designatorContext attribute_designator() throws RecognitionException {
		Attribute_designatorContext _localctx = new Attribute_designatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_attribute_designator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581); simple_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tic_attribute_designatorContext extends ParserRuleContext {
		public TerminalNode TIC_SIMPLE_NAME() { return getToken(VhdlParser.TIC_SIMPLE_NAME, 0); }
		public Tic_attribute_designatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tic_attribute_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterTic_attribute_designator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitTic_attribute_designator(this);
		}
	}

	public final Tic_attribute_designatorContext tic_attribute_designator() throws RecognitionException {
		Tic_attribute_designatorContext _localctx = new Tic_attribute_designatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tic_attribute_designator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583); match(TIC_SIMPLE_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_specificationContext extends ParserRuleContext {
		public Attribute_designatorContext attribute_designator() {
			return getRuleContext(Attribute_designatorContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public Entity_specificationContext entity_specification() {
			return getRuleContext(Entity_specificationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode K_ATTRIBUTE() { return getToken(VhdlParser.K_ATTRIBUTE, 0); }
		public TerminalNode K_IS() { return getToken(VhdlParser.K_IS, 0); }
		public TerminalNode K_OF() { return getToken(VhdlParser.K_OF, 0); }
		public Attribute_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterAttribute_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitAttribute_specification(this);
		}
	}

	public final Attribute_specificationContext attribute_specification() throws RecognitionException {
		Attribute_specificationContext _localctx = new Attribute_specificationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_attribute_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585); match(K_ATTRIBUTE);
			setState(586); attribute_designator();
			setState(587); match(K_OF);
			setState(588); entity_specification();
			setState(589); match(K_IS);
			setState(590); expression();
			setState(591); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_unit_declarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Base_unit_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_unit_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterBase_unit_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitBase_unit_declaration(this);
		}
	}

	public final Base_unit_declarationContext base_unit_declaration() throws RecognitionException {
		Base_unit_declarationContext _localctx = new Base_unit_declarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_base_unit_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Based_literalContext extends ParserRuleContext {
		public TerminalNode BASED_LITERAL() { return getToken(VhdlParser.BASED_LITERAL, 0); }
		public Based_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_based_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterBased_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitBased_literal(this);
		}
	}

	public final Based_literalContext based_literal() throws RecognitionException {
		Based_literalContext _localctx = new Based_literalContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_based_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595); match(BASED_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binding_indicationContext extends ParserRuleContext {
		public TerminalNode K_USE() { return getToken(VhdlParser.K_USE, 0); }
		public Entity_aspectContext entity_aspect() {
			return getRuleContext(Entity_aspectContext.class,0);
		}
		public Port_map_aspectContext port_map_aspect() {
			return getRuleContext(Port_map_aspectContext.class,0);
		}
		public Generic_map_aspectContext generic_map_aspect() {
			return getRuleContext(Generic_map_aspectContext.class,0);
		}
		public Binding_indicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binding_indication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterBinding_indication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitBinding_indication(this);
		}
	}

	public final Binding_indicationContext binding_indication() throws RecognitionException {
		Binding_indicationContext _localctx = new Binding_indicationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_binding_indication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			_la = _input.LA(1);
			if (_la==K_USE) {
				{
				setState(597); match(K_USE);
				setState(598); entity_aspect();
				}
			}

			setState(602);
			_la = _input.LA(1);
			if (_la==K_GENERIC) {
				{
				setState(601); generic_map_aspect();
				}
			}

			setState(605);
			_la = _input.LA(1);
			if (_la==K_PORT) {
				{
				setState(604); port_map_aspect();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_string_literalContext extends ParserRuleContext {
		public TerminalNode BIT_STRING_LITERAL() { return getToken(VhdlParser.BIT_STRING_LITERAL, 0); }
		public Bit_string_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterBit_string_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitBit_string_literal(this);
		}
	}

	public final Bit_string_literalContext bit_string_literal() throws RecognitionException {
		Bit_string_literalContext _localctx = new Bit_string_literalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_bit_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607); match(BIT_STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_configurationContext extends ParserRuleContext {
		public Configuration_itemContext configuration_item(int i) {
			return getRuleContext(Configuration_itemContext.class,i);
		}
		public TerminalNode K_FOR(int i) {
			return getToken(VhdlParser.K_FOR, i);
		}
		public List<Configuration_itemContext> configuration_item() {
			return getRuleContexts(Configuration_itemContext.class);
		}
		public List<TerminalNode> K_FOR() { return getTokens(VhdlParser.K_FOR); }
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public TerminalNode K_END() { return getToken(VhdlParser.K_END, 0); }
		public List<Use_clauseContext> use_clause() {
			return getRuleContexts(Use_clauseContext.class);
		}
		public Block_specificationContext block_specification() {
			return getRuleContext(Block_specificationContext.class,0);
		}
		public Use_clauseContext use_clause(int i) {
			return getRuleContext(Use_clauseContext.class,i);
		}
		public Block_configurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_configuration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterBlock_configuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitBlock_configuration(this);
		}
	}

	public final Block_configurationContext block_configuration() throws RecognitionException {
		Block_configurationContext _localctx = new Block_configurationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_block_configuration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609); match(K_FOR);
			setState(610); block_specification();
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_USE) {
				{
				{
				setState(611); use_clause();
				}
				}
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_FOR) {
				{
				{
				setState(617); configuration_item();
				}
				}
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(623); match(K_END);
			setState(624); match(K_FOR);
			setState(625); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_declarative_itemContext extends ParserRuleContext {
		public Group_template_declarationContext group_template_declaration() {
			return getRuleContext(Group_template_declarationContext.class,0);
		}
		public Signal_declarationContext signal_declaration() {
			return getRuleContext(Signal_declarationContext.class,0);
		}
		public Configuration_specificationContext configuration_specification() {
			return getRuleContext(Configuration_specificationContext.class,0);
		}
		public Subprogram_bodyContext subprogram_body() {
			return getRuleContext(Subprogram_bodyContext.class,0);
		}
		public Use_clauseContext use_clause() {
			return getRuleContext(Use_clauseContext.class,0);
		}
		public Subprogram_declarationContext subprogram_declaration() {
			return getRuleContext(Subprogram_declarationContext.class,0);
		}
		public Attribute_specificationContext attribute_specification() {
			return getRuleContext(Attribute_specificationContext.class,0);
		}
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public File_declarationContext file_declaration() {
			return getRuleContext(File_declarationContext.class,0);
		}
		public Component_declarationContext component_declaration() {
			return getRuleContext(Component_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Subtype_declarationContext subtype_declaration() {
			return getRuleContext(Subtype_declarationContext.class,0);
		}
		public Group_declarationContext group_declaration() {
			return getRuleContext(Group_declarationContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Attribute_declarationContext attribute_declaration() {
			return getRuleContext(Attribute_declarationContext.class,0);
		}
		public Disconnection_specificationContext disconnection_specification() {
			return getRuleContext(Disconnection_specificationContext.class,0);
		}
		public Alias_declarationContext alias_declaration() {
			return getRuleContext(Alias_declarationContext.class,0);
		}
		public Block_declarative_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_declarative_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterBlock_declarative_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitBlock_declarative_item(this);
		}
	}

	public final Block_declarative_itemContext block_declarative_item() throws RecognitionException {
		Block_declarative_itemContext _localctx = new Block_declarative_itemContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_block_declarative_item);
		try {
			setState(644);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(627); subprogram_declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(628); subprogram_body();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(629); type_declaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(630); subtype_declaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(631); constant_declaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(632); signal_declaration();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(633); variable_declaration();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(634); file_declaration();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(635); alias_declaration();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(636); component_declaration();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(637); attribute_specification();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(638); attribute_declaration();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(639); configuration_specification();
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(640); disconnection_specification();
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(641); use_clause();
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(642); group_declaration();
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(643); group_template_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_declarative_partContext extends ParserRuleContext {
		public List<Block_declarative_itemContext> block_declarative_item() {
			return getRuleContexts(Block_declarative_itemContext.class);
		}
		public Block_declarative_itemContext block_declarative_item(int i) {
			return getRuleContext(Block_declarative_itemContext.class,i);
		}
		public Block_declarative_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_declarative_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterBlock_declarative_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitBlock_declarative_part(this);
		}
	}

	public final Block_declarative_partContext block_declarative_part() throws RecognitionException {
		Block_declarative_partContext _localctx = new Block_declarative_partContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_block_declarative_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (K_ALIAS - 42)) | (1L << (K_ATTRIBUTE - 42)) | (1L << (K_COMPONENT - 42)) | (1L << (K_CONSTANT - 42)) | (1L << (K_DISCONNECT - 42)) | (1L << (K_FILE - 42)) | (1L << (K_FOR - 42)) | (1L << (K_FUNCTION - 42)) | (1L << (K_GROUP - 42)) | (1L << (K_IMPURE - 42)) | (1L << (K_PROCEDURE - 42)) | (1L << (K_PURE - 42)))) != 0) || ((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (K_SHARED - 115)) | (1L << (K_SIGNAL - 115)) | (1L << (K_SUBTYPE - 115)) | (1L << (K_TYPE - 115)) | (1L << (K_USE - 115)) | (1L << (K_VARIABLE - 115)))) != 0)) {
				{
				{
				setState(646); block_declarative_item();
				}
				}
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_headerContext extends ParserRuleContext {
		public Generic_clauseContext generic_clause() {
			return getRuleContext(Generic_clauseContext.class,0);
		}
		public Port_map_aspectContext port_map_aspect() {
			return getRuleContext(Port_map_aspectContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(VhdlParser.SEMI); }
		public Port_clauseContext port_clause() {
			return getRuleContext(Port_clauseContext.class,0);
		}
		public TerminalNode SEMI(int i) {
			return getToken(VhdlParser.SEMI, i);
		}
		public Generic_map_aspectContext generic_map_aspect() {
			return getRuleContext(Generic_map_aspectContext.class,0);
		}
		public Block_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterBlock_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitBlock_header(this);
		}
	}

	public final Block_headerContext block_header() throws RecognitionException {
		Block_headerContext _localctx = new Block_headerContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_block_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			_la = _input.LA(1);
			if (_la==K_GENERIC) {
				{
				setState(652); generic_clause();
				setState(656);
				_la = _input.LA(1);
				if (_la==K_GENERIC) {
					{
					setState(653); generic_map_aspect();
					setState(654); match(SEMI);
					}
				}

				}
			}

			setState(666);
			_la = _input.LA(1);
			if (_la==K_PORT) {
				{
				setState(660); port_clause();
				setState(664);
				_la = _input.LA(1);
				if (_la==K_PORT) {
					{
					setState(661); port_map_aspect();
					setState(662); match(SEMI);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_specificationContext extends ParserRuleContext {
		public Index_specificationContext index_specification() {
			return getRuleContext(Index_specificationContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VhdlParser.RPAREN, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VhdlParser.LPAREN, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Block_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterBlock_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitBlock_specification(this);
		}
	}

	public final Block_specificationContext block_specification() throws RecognitionException {
		Block_specificationContext _localctx = new Block_specificationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_block_specification);
		try {
			setState(674);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(668); label();
				setState(669); match(LPAREN);
				setState(670); index_specification();
				setState(671); match(RPAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(673); name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_statementContext extends ParserRuleContext {
		public List<TerminalNode> K_BLOCK() { return getTokens(VhdlParser.K_BLOCK); }
		public Block_declarative_partContext block_declarative_part() {
			return getRuleContext(Block_declarative_partContext.class,0);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public TerminalNode K_END() { return getToken(VhdlParser.K_END, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VhdlParser.LPAREN, 0); }
		public TerminalNode K_IS() { return getToken(VhdlParser.K_IS, 0); }
		public Block_statement_partContext block_statement_part() {
			return getRuleContext(Block_statement_partContext.class,0);
		}
		public Block_headerContext block_header() {
			return getRuleContext(Block_headerContext.class,0);
		}
		public TerminalNode K_BLOCK(int i) {
			return getToken(VhdlParser.K_BLOCK, i);
		}
		public TerminalNode K_BEGIN() { return getToken(VhdlParser.K_BEGIN, 0); }
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public TerminalNode RPAREN() { return getToken(VhdlParser.RPAREN, 0); }
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public TerminalNode COLON() { return getToken(VhdlParser.COLON, 0); }
		public Block_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterBlock_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitBlock_statement(this);
		}
	}

	public final Block_statementContext block_statement() throws RecognitionException {
		Block_statementContext _localctx = new Block_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_block_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676); label();
			setState(677); match(COLON);
			setState(678); match(K_BLOCK);
			setState(683);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(679); match(LPAREN);
				setState(680); expression();
				setState(681); match(RPAREN);
				}
			}

			setState(686);
			_la = _input.LA(1);
			if (_la==K_IS) {
				{
				setState(685); match(K_IS);
				}
			}

			setState(688); block_header();
			setState(689); block_declarative_part();
			setState(690); match(K_BEGIN);
			setState(691); block_statement_part();
			setState(692); match(K_END);
			setState(693); match(K_BLOCK);
			setState(695);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(694); label();
				}
			}

			setState(697); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_statement_partContext extends ParserRuleContext {
		public List<Concurrent_statementContext> concurrent_statement() {
			return getRuleContexts(Concurrent_statementContext.class);
		}
		public Concurrent_statementContext concurrent_statement(int i) {
			return getRuleContext(Concurrent_statementContext.class,i);
		}
		public Block_statement_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_statement_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterBlock_statement_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitBlock_statement_part(this);
		}
	}

	public final Block_statement_partContext block_statement_part() throws RecognitionException {
		Block_statement_partContext _localctx = new Block_statement_partContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_block_statement_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN || _la==K_ASSERT || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (K_POSTPONED - 99)) | (1L << (K_PROCESS - 99)) | (1L << (K_WITH - 99)) | (1L << (BASIC_IDENTIFIER - 99)) | (1L << (EXTENDED_IDENTIFIER - 99)) | (1L << (STRING_LITERAL - 99)))) != 0)) {
				{
				{
				setState(699); concurrent_statement();
				}
				}
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_statementContext extends ParserRuleContext {
		public Case_statement_alternativeContext case_statement_alternative(int i) {
			return getRuleContext(Case_statement_alternativeContext.class,i);
		}
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode K_END() { return getToken(VhdlParser.K_END, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> K_CASE() { return getTokens(VhdlParser.K_CASE); }
		public List<Case_statement_alternativeContext> case_statement_alternative() {
			return getRuleContexts(Case_statement_alternativeContext.class);
		}
		public TerminalNode K_CASE(int i) {
			return getToken(VhdlParser.K_CASE, i);
		}
		public TerminalNode K_IS() { return getToken(VhdlParser.K_IS, 0); }
		public Case_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterCase_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitCase_statement(this);
		}
	}

	public final Case_statementContext case_statement() throws RecognitionException {
		Case_statementContext _localctx = new Case_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_case_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(705); label_colon();
				}
			}

			setState(708); match(K_CASE);
			setState(709); expression();
			setState(710); match(K_IS);
			setState(712); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(711); case_statement_alternative();
				}
				}
				setState(714); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_WHEN );
			setState(716); match(K_END);
			setState(717); match(K_CASE);
			setState(719);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(718); label();
				}
			}

			setState(721); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_statement_alternativeContext extends ParserRuleContext {
		public Sequence_of_statementsContext sequence_of_statements() {
			return getRuleContext(Sequence_of_statementsContext.class,0);
		}
		public TerminalNode K_WHEN() { return getToken(VhdlParser.K_WHEN, 0); }
		public ChoicesContext choices() {
			return getRuleContext(ChoicesContext.class,0);
		}
		public TerminalNode EQGRT() { return getToken(VhdlParser.EQGRT, 0); }
		public Case_statement_alternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_statement_alternative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterCase_statement_alternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitCase_statement_alternative(this);
		}
	}

	public final Case_statement_alternativeContext case_statement_alternative() throws RecognitionException {
		Case_statement_alternativeContext _localctx = new Case_statement_alternativeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_case_statement_alternative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723); match(K_WHEN);
			setState(724); choices();
			setState(725); match(EQGRT);
			setState(726); sequence_of_statements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Character_literalContext extends ParserRuleContext {
		public TerminalNode CHARACTER_LITERAL() { return getToken(VhdlParser.CHARACTER_LITERAL, 0); }
		public Character_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterCharacter_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitCharacter_literal(this);
		}
	}

	public final Character_literalContext character_literal() throws RecognitionException {
		Character_literalContext _localctx = new Character_literalContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_character_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728); match(CHARACTER_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChoiceContext extends ParserRuleContext {
		public TerminalNode K_OTHERS() { return getToken(VhdlParser.K_OTHERS, 0); }
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
		public Discrete_rangeContext discrete_range() {
			return getRuleContext(Discrete_rangeContext.class,0);
		}
		public ChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitChoice(this);
		}
	}

	public final ChoiceContext choice() throws RecognitionException {
		ChoiceContext _localctx = new ChoiceContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_choice);
		try {
			setState(734);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(730); simple_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(731); simple_name();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(732); discrete_range();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(733); match(K_OTHERS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChoicesContext extends ParserRuleContext {
		public ChoiceContext choice(int i) {
			return getRuleContext(ChoiceContext.class,i);
		}
		public TerminalNode BAR(int i) {
			return getToken(VhdlParser.BAR, i);
		}
		public List<TerminalNode> BAR() { return getTokens(VhdlParser.BAR); }
		public List<ChoiceContext> choice() {
			return getRuleContexts(ChoiceContext.class);
		}
		public ChoicesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choices; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterChoices(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitChoices(this);
		}
	}

	public final ChoicesContext choices() throws RecognitionException {
		ChoicesContext _localctx = new ChoicesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_choices);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736); choice();
			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BAR) {
				{
				{
				setState(737); match(BAR);
				setState(738); choice();
				}
				}
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Component_configurationContext extends ParserRuleContext {
		public Binding_indicationContext binding_indication() {
			return getRuleContext(Binding_indicationContext.class,0);
		}
		public TerminalNode K_FOR(int i) {
			return getToken(VhdlParser.K_FOR, i);
		}
		public List<TerminalNode> K_FOR() { return getTokens(VhdlParser.K_FOR); }
		public Component_specificationContext component_specification() {
			return getRuleContext(Component_specificationContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(VhdlParser.SEMI); }
		public TerminalNode K_END() { return getToken(VhdlParser.K_END, 0); }
		public Block_configurationContext block_configuration() {
			return getRuleContext(Block_configurationContext.class,0);
		}
		public TerminalNode SEMI(int i) {
			return getToken(VhdlParser.SEMI, i);
		}
		public Component_configurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_configuration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterComponent_configuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitComponent_configuration(this);
		}
	}

	public final Component_configurationContext component_configuration() throws RecognitionException {
		Component_configurationContext _localctx = new Component_configurationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_component_configuration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744); match(K_FOR);
			setState(745); component_specification();
			setState(749);
			_la = _input.LA(1);
			if (_la==SEMI || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (K_GENERIC - 69)) | (1L << (K_PORT - 69)) | (1L << (K_USE - 69)))) != 0)) {
				{
				setState(746); binding_indication();
				setState(747); match(SEMI);
				}
			}

			setState(752);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(751); block_configuration();
				}
			}

			setState(754); match(K_END);
			setState(755); match(K_FOR);
			setState(756); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Component_declarationContext extends ParserRuleContext {
		public Generic_clauseContext generic_clause() {
			return getRuleContext(Generic_clauseContext.class,0);
		}
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public TerminalNode K_COMPONENT(int i) {
			return getToken(VhdlParser.K_COMPONENT, i);
		}
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public Port_clauseContext port_clause() {
			return getRuleContext(Port_clauseContext.class,0);
		}
		public TerminalNode K_END() { return getToken(VhdlParser.K_END, 0); }
		public List<TerminalNode> K_COMPONENT() { return getTokens(VhdlParser.K_COMPONENT); }
		public TerminalNode K_IS() { return getToken(VhdlParser.K_IS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Component_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterComponent_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitComponent_declaration(this);
		}
	}

	public final Component_declarationContext component_declaration() throws RecognitionException {
		Component_declarationContext _localctx = new Component_declarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_component_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758); match(K_COMPONENT);
			setState(759); identifier();
			setState(761);
			_la = _input.LA(1);
			if (_la==K_IS) {
				{
				setState(760); match(K_IS);
				}
			}

			setState(764);
			_la = _input.LA(1);
			if (_la==K_GENERIC) {
				{
				setState(763); generic_clause();
				}
			}

			setState(767);
			_la = _input.LA(1);
			if (_la==K_PORT) {
				{
				setState(766); port_clause();
				}
			}

			setState(769); match(K_END);
			setState(770); match(K_COMPONENT);
			setState(772);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(771); simple_name();
				}
			}

			setState(774); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Component_instantiation_statementContext extends ParserRuleContext {
		public LabelContext instNm;
		public Instantiated_unitContext refNm;
		public Instantiated_unitContext instantiated_unit() {
			return getRuleContext(Instantiated_unitContext.class,0);
		}
		public Port_map_aspectContext port_map_aspect() {
			return getRuleContext(Port_map_aspectContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Generic_map_aspectContext generic_map_aspect() {
			return getRuleContext(Generic_map_aspectContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VhdlParser.COLON, 0); }
		public Component_instantiation_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_instantiation_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterComponent_instantiation_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitComponent_instantiation_statement(this);
		}
	}

	public final Component_instantiation_statementContext component_instantiation_statement() throws RecognitionException {
		Component_instantiation_statementContext _localctx = new Component_instantiation_statementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_component_instantiation_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776); ((Component_instantiation_statementContext)_localctx).instNm = label();
			setState(777); match(COLON);
			setState(778); ((Component_instantiation_statementContext)_localctx).refNm = instantiated_unit();
			setState(780);
			_la = _input.LA(1);
			if (_la==K_GENERIC) {
				{
				setState(779); generic_map_aspect();
				}
			}

			setState(783);
			_la = _input.LA(1);
			if (_la==K_PORT) {
				{
				setState(782); port_map_aspect();
				}
			}

			setState(785); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Component_specificationContext extends ParserRuleContext {
		public Instantiation_listContext instantiation_list() {
			return getRuleContext(Instantiation_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VhdlParser.COLON, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Component_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterComponent_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitComponent_specification(this);
		}
	}

	public final Component_specificationContext component_specification() throws RecognitionException {
		Component_specificationContext _localctx = new Component_specificationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_component_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787); instantiation_list();
			setState(788); match(COLON);
			setState(789); name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Composite_type_definitionContext extends ParserRuleContext {
		public Record_type_definitionContext record_type_definition() {
			return getRuleContext(Record_type_definitionContext.class,0);
		}
		public Array_type_definitionContext array_type_definition() {
			return getRuleContext(Array_type_definitionContext.class,0);
		}
		public Composite_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_composite_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterComposite_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitComposite_type_definition(this);
		}
	}

	public final Composite_type_definitionContext composite_type_definition() throws RecognitionException {
		Composite_type_definitionContext _localctx = new Composite_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_composite_type_definition);
		try {
			setState(793);
			switch (_input.LA(1)) {
			case K_ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(791); array_type_definition();
				}
				break;
			case K_RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(792); record_type_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Concurrent_assertion_statementContext extends ParserRuleContext {
		public AssertionContext assertion() {
			return getRuleContext(AssertionContext.class,0);
		}
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public TerminalNode K_POSTPONED() { return getToken(VhdlParser.K_POSTPONED, 0); }
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public Concurrent_assertion_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concurrent_assertion_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterConcurrent_assertion_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitConcurrent_assertion_statement(this);
		}
	}

	public final Concurrent_assertion_statementContext concurrent_assertion_statement() throws RecognitionException {
		Concurrent_assertion_statementContext _localctx = new Concurrent_assertion_statementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_concurrent_assertion_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(795); label_colon();
				}
			}

			setState(799);
			_la = _input.LA(1);
			if (_la==K_POSTPONED) {
				{
				setState(798); match(K_POSTPONED);
				}
			}

			setState(801); assertion();
			setState(802); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Concurrent_procedure_call_statementContext extends ParserRuleContext {
		public Procedure_callContext procedure_call() {
			return getRuleContext(Procedure_callContext.class,0);
		}
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public TerminalNode K_POSTPONED() { return getToken(VhdlParser.K_POSTPONED, 0); }
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public Concurrent_procedure_call_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concurrent_procedure_call_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterConcurrent_procedure_call_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitConcurrent_procedure_call_statement(this);
		}
	}

	public final Concurrent_procedure_call_statementContext concurrent_procedure_call_statement() throws RecognitionException {
		Concurrent_procedure_call_statementContext _localctx = new Concurrent_procedure_call_statementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_concurrent_procedure_call_statement);
		int _la;
		try {
			setState(817);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(804); label_colon();
				setState(806);
				_la = _input.LA(1);
				if (_la==K_POSTPONED) {
					{
					setState(805); match(K_POSTPONED);
					}
				}

				setState(808); procedure_call();
				setState(809); match(SEMI);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(812);
				_la = _input.LA(1);
				if (_la==K_POSTPONED) {
					{
					setState(811); match(K_POSTPONED);
					}
				}

				setState(814); procedure_call();
				setState(815); match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Concurrent_signal_assignment_statementContext extends ParserRuleContext {
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public TerminalNode K_POSTPONED() { return getToken(VhdlParser.K_POSTPONED, 0); }
		public Concurrent_signal_assignment_statement_2Context concurrent_signal_assignment_statement_2() {
			return getRuleContext(Concurrent_signal_assignment_statement_2Context.class,0);
		}
		public Concurrent_signal_assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concurrent_signal_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterConcurrent_signal_assignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitConcurrent_signal_assignment_statement(this);
		}
	}

	public final Concurrent_signal_assignment_statementContext concurrent_signal_assignment_statement() throws RecognitionException {
		Concurrent_signal_assignment_statementContext _localctx = new Concurrent_signal_assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_concurrent_signal_assignment_statement);
		int _la;
		try {
			setState(829);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(819); label_colon();
				setState(821);
				_la = _input.LA(1);
				if (_la==K_POSTPONED) {
					{
					setState(820); match(K_POSTPONED);
					}
				}

				setState(823); concurrent_signal_assignment_statement_2();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(826);
				_la = _input.LA(1);
				if (_la==K_POSTPONED) {
					{
					setState(825); match(K_POSTPONED);
					}
				}

				setState(828); concurrent_signal_assignment_statement_2();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Concurrent_signal_assignment_statement_2Context extends ParserRuleContext {
		public Conditional_signal_assignmentContext conditional_signal_assignment() {
			return getRuleContext(Conditional_signal_assignmentContext.class,0);
		}
		public Selected_signal_assignmentContext selected_signal_assignment() {
			return getRuleContext(Selected_signal_assignmentContext.class,0);
		}
		public Concurrent_signal_assignment_statement_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concurrent_signal_assignment_statement_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterConcurrent_signal_assignment_statement_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitConcurrent_signal_assignment_statement_2(this);
		}
	}

	public final Concurrent_signal_assignment_statement_2Context concurrent_signal_assignment_statement_2() throws RecognitionException {
		Concurrent_signal_assignment_statement_2Context _localctx = new Concurrent_signal_assignment_statement_2Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_concurrent_signal_assignment_statement_2);
		try {
			setState(833);
			switch (_input.LA(1)) {
			case LPAREN:
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(831); conditional_signal_assignment();
				}
				break;
			case K_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(832); selected_signal_assignment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Concurrent_statementContext extends ParserRuleContext {
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public Generate_statementContext generate_statement() {
			return getRuleContext(Generate_statementContext.class,0);
		}
		public Component_instantiation_statementContext component_instantiation_statement() {
			return getRuleContext(Component_instantiation_statementContext.class,0);
		}
		public Concurrent_assertion_statementContext concurrent_assertion_statement() {
			return getRuleContext(Concurrent_assertion_statementContext.class,0);
		}
		public Concurrent_procedure_call_statementContext concurrent_procedure_call_statement() {
			return getRuleContext(Concurrent_procedure_call_statementContext.class,0);
		}
		public Concurrent_signal_assignment_statementContext concurrent_signal_assignment_statement() {
			return getRuleContext(Concurrent_signal_assignment_statementContext.class,0);
		}
		public Process_statementContext process_statement() {
			return getRuleContext(Process_statementContext.class,0);
		}
		public Concurrent_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concurrent_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterConcurrent_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitConcurrent_statement(this);
		}
	}

	public final Concurrent_statementContext concurrent_statement() throws RecognitionException {
		Concurrent_statementContext _localctx = new Concurrent_statementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_concurrent_statement);
		try {
			setState(842);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(835); block_statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(836); process_statement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(837); concurrent_procedure_call_statement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(838); concurrent_assertion_statement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(839); concurrent_signal_assignment_statement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(840); component_instantiation_statement();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(841); generate_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_clauseContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode K_UNTIL() { return getToken(VhdlParser.K_UNTIL, 0); }
		public Condition_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterCondition_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitCondition_clause(this);
		}
	}

	public final Condition_clauseContext condition_clause() throws RecognitionException {
		Condition_clauseContext _localctx = new Condition_clauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_condition_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846); match(K_UNTIL);
			setState(847); condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_signal_assignmentContext extends ParserRuleContext {
		public Conditional_waveformsContext conditional_waveforms() {
			return getRuleContext(Conditional_waveformsContext.class,0);
		}
		public TerminalNode LSTEQ() { return getToken(VhdlParser.LSTEQ, 0); }
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public VoptionsContext voptions() {
			return getRuleContext(VoptionsContext.class,0);
		}
		public Conditional_signal_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_signal_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterConditional_signal_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitConditional_signal_assignment(this);
		}
	}

	public final Conditional_signal_assignmentContext conditional_signal_assignment() throws RecognitionException {
		Conditional_signal_assignmentContext _localctx = new Conditional_signal_assignmentContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_conditional_signal_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849); target();
			setState(850); match(LSTEQ);
			setState(851); voptions();
			setState(852); conditional_waveforms();
			setState(853); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_waveformsContext extends ParserRuleContext {
		public WaveformContext waveform() {
			return getRuleContext(WaveformContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode K_WHEN() { return getToken(VhdlParser.K_WHEN, 0); }
		public Conditional_waveforms_2Context conditional_waveforms_2() {
			return getRuleContext(Conditional_waveforms_2Context.class,0);
		}
		public Conditional_waveformsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_waveforms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterConditional_waveforms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitConditional_waveforms(this);
		}
	}

	public final Conditional_waveformsContext conditional_waveforms() throws RecognitionException {
		Conditional_waveformsContext _localctx = new Conditional_waveformsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_conditional_waveforms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855); waveform();
			setState(857);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(856); conditional_waveforms_2();
				}
				break;
			}
			setState(861);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(859); match(K_WHEN);
				setState(860); condition();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_waveforms_2Context extends ParserRuleContext {
		public WaveformContext waveform() {
			return getRuleContext(WaveformContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode K_WHEN() { return getToken(VhdlParser.K_WHEN, 0); }
		public TerminalNode K_ELSE() { return getToken(VhdlParser.K_ELSE, 0); }
		public Conditional_waveforms_2Context conditional_waveforms_2() {
			return getRuleContext(Conditional_waveforms_2Context.class,0);
		}
		public Conditional_waveforms_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_waveforms_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterConditional_waveforms_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitConditional_waveforms_2(this);
		}
	}

	public final Conditional_waveforms_2Context conditional_waveforms_2() throws RecognitionException {
		Conditional_waveforms_2Context _localctx = new Conditional_waveforms_2Context(_ctx, getState());
		enterRule(_localctx, 104, RULE_conditional_waveforms_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863); match(K_WHEN);
			setState(864); condition();
			setState(865); match(K_ELSE);
			setState(866); waveform();
			setState(868);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(867); conditional_waveforms_2();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Configuration_declarationContext extends ParserRuleContext {
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public TerminalNode K_CONFIGURATION(int i) {
			return getToken(VhdlParser.K_CONFIGURATION, i);
		}
		public List<TerminalNode> K_CONFIGURATION() { return getTokens(VhdlParser.K_CONFIGURATION); }
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public TerminalNode K_END() { return getToken(VhdlParser.K_END, 0); }
		public Block_configurationContext block_configuration() {
			return getRuleContext(Block_configurationContext.class,0);
		}
		public Configuration_declarative_partContext configuration_declarative_part() {
			return getRuleContext(Configuration_declarative_partContext.class,0);
		}
		public TerminalNode K_IS() { return getToken(VhdlParser.K_IS, 0); }
		public TerminalNode K_OF() { return getToken(VhdlParser.K_OF, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Configuration_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configuration_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterConfiguration_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitConfiguration_declaration(this);
		}
	}

	public final Configuration_declarationContext configuration_declaration() throws RecognitionException {
		Configuration_declarationContext _localctx = new Configuration_declarationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_configuration_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870); match(K_CONFIGURATION);
			setState(871); identifier();
			setState(872); match(K_OF);
			setState(873); name();
			setState(874); match(K_IS);
			setState(875); configuration_declarative_part();
			setState(876); block_configuration();
			setState(877); match(K_END);
			setState(879);
			_la = _input.LA(1);
			if (_la==K_CONFIGURATION) {
				{
				setState(878); match(K_CONFIGURATION);
				}
			}

			setState(882);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(881); simple_name();
				}
			}

			setState(884); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Configuration_declarative_itemContext extends ParserRuleContext {
		public Group_declarationContext group_declaration() {
			return getRuleContext(Group_declarationContext.class,0);
		}
		public Attribute_specificationContext attribute_specification() {
			return getRuleContext(Attribute_specificationContext.class,0);
		}
		public Use_clauseContext use_clause() {
			return getRuleContext(Use_clauseContext.class,0);
		}
		public Configuration_declarative_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configuration_declarative_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterConfiguration_declarative_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitConfiguration_declarative_item(this);
		}
	}

	public final Configuration_declarative_itemContext configuration_declarative_item() throws RecognitionException {
		Configuration_declarative_itemContext _localctx = new Configuration_declarative_itemContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_configuration_declarative_item);
		try {
			setState(889);
			switch (_input.LA(1)) {
			case K_USE:
				enterOuterAlt(_localctx, 1);
				{
				setState(886); use_clause();
				}
				break;
			case K_ATTRIBUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(887); attribute_specification();
				}
				break;
			case K_GROUP:
				enterOuterAlt(_localctx, 3);
				{
				setState(888); group_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Configuration_declarative_partContext extends ParserRuleContext {
		public Configuration_declarative_itemContext configuration_declarative_item(int i) {
			return getRuleContext(Configuration_declarative_itemContext.class,i);
		}
		public List<Configuration_declarative_itemContext> configuration_declarative_item() {
			return getRuleContexts(Configuration_declarative_itemContext.class);
		}
		public Configuration_declarative_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configuration_declarative_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterConfiguration_declarative_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitConfiguration_declarative_part(this);
		}
	}

	public final Configuration_declarative_partContext configuration_declarative_part() throws RecognitionException {
		Configuration_declarative_partContext _localctx = new Configuration_declarative_partContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_configuration_declarative_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_ATTRIBUTE || _la==K_GROUP || _la==K_USE) {
				{
				{
				setState(891); configuration_declarative_item();
				}
				}
				setState(896);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Configuration_itemContext extends ParserRuleContext {
		public Block_configurationContext block_configuration() {
			return getRuleContext(Block_configurationContext.class,0);
		}
		public Component_configurationContext component_configuration() {
			return getRuleContext(Component_configurationContext.class,0);
		}
		public Configuration_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configuration_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterConfiguration_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitConfiguration_item(this);
		}
	}

	public final Configuration_itemContext configuration_item() throws RecognitionException {
		Configuration_itemContext _localctx = new Configuration_itemContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_configuration_item);
		try {
			setState(899);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(897); block_configuration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(898); component_configuration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Configuration_specificationContext extends ParserRuleContext {
		public Binding_indicationContext binding_indication() {
			return getRuleContext(Binding_indicationContext.class,0);
		}
		public TerminalNode K_FOR() { return getToken(VhdlParser.K_FOR, 0); }
		public Component_specificationContext component_specification() {
			return getRuleContext(Component_specificationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public Configuration_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configuration_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterConfiguration_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitConfiguration_specification(this);
		}
	}

	public final Configuration_specificationContext configuration_specification() throws RecognitionException {
		Configuration_specificationContext _localctx = new Configuration_specificationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_configuration_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901); match(K_FOR);
			setState(902); component_specification();
			setState(903); binding_indication();
			setState(904); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_declarationContext extends ParserRuleContext {
		public TerminalNode COLONEQ() { return getToken(VhdlParser.COLONEQ, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode K_CONSTANT() { return getToken(VhdlParser.K_CONSTANT, 0); }
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VhdlParser.COLON, 0); }
		public Constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterConstant_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitConstant_declaration(this);
		}
	}

	public final Constant_declarationContext constant_declaration() throws RecognitionException {
		Constant_declarationContext _localctx = new Constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_constant_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906); match(K_CONSTANT);
			setState(907); identifier_list();
			setState(908); match(COLON);
			setState(909); subtype_indication();
			setState(912);
			_la = _input.LA(1);
			if (_la==COLONEQ) {
				{
				setState(910); match(COLONEQ);
				setState(911); expression();
				}
			}

			setState(914); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constrained_array_definitionContext extends ParserRuleContext {
		public Index_constraintContext index_constraint() {
			return getRuleContext(Index_constraintContext.class,0);
		}
		public TerminalNode K_ARRAY() { return getToken(VhdlParser.K_ARRAY, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode K_OF() { return getToken(VhdlParser.K_OF, 0); }
		public Constrained_array_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constrained_array_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterConstrained_array_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitConstrained_array_definition(this);
		}
	}

	public final Constrained_array_definitionContext constrained_array_definition() throws RecognitionException {
		Constrained_array_definitionContext _localctx = new Constrained_array_definitionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_constrained_array_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916); match(K_ARRAY);
			setState(917); index_constraint();
			setState(918); match(K_OF);
			setState(919); subtype_indication();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintContext extends ParserRuleContext {
		public Index_constraintContext index_constraint() {
			return getRuleContext(Index_constraintContext.class,0);
		}
		public Range_constraintContext range_constraint() {
			return getRuleContext(Range_constraintContext.class,0);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitConstraint(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_constraint);
		try {
			setState(923);
			switch (_input.LA(1)) {
			case K_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(921); range_constraint();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(922); index_constraint();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Context_clauseContext extends ParserRuleContext {
		public Context_itemContext context_item(int i) {
			return getRuleContext(Context_itemContext.class,i);
		}
		public List<Context_itemContext> context_item() {
			return getRuleContexts(Context_itemContext.class);
		}
		public Context_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_context_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterContext_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitContext_clause(this);
		}
	}

	public final Context_clauseContext context_clause() throws RecognitionException {
		Context_clauseContext _localctx = new Context_clauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_context_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_LIBRARY || _la==K_USE) {
				{
				{
				setState(925); context_item();
				}
				}
				setState(930);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Context_itemContext extends ParserRuleContext {
		public Use_clauseContext use_clause() {
			return getRuleContext(Use_clauseContext.class,0);
		}
		public Library_clauseContext library_clause() {
			return getRuleContext(Library_clauseContext.class,0);
		}
		public Context_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_context_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterContext_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitContext_item(this);
		}
	}

	public final Context_itemContext context_item() throws RecognitionException {
		Context_itemContext _localctx = new Context_itemContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_context_item);
		try {
			setState(933);
			switch (_input.LA(1)) {
			case K_LIBRARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(931); library_clause();
				}
				break;
			case K_USE:
				enterOuterAlt(_localctx, 2);
				{
				setState(932); use_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decimal_literalContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(VhdlParser.DECIMAL_LITERAL, 0); }
		public Decimal_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterDecimal_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitDecimal_literal(this);
		}
	}

	public final Decimal_literalContext decimal_literal() throws RecognitionException {
		Decimal_literalContext _localctx = new Decimal_literalContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_decimal_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935); match(DECIMAL_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public Group_template_declarationContext group_template_declaration() {
			return getRuleContext(Group_template_declarationContext.class,0);
		}
		public Entity_declarationContext entity_declaration() {
			return getRuleContext(Entity_declarationContext.class,0);
		}
		public Configuration_declarationContext configuration_declaration() {
			return getRuleContext(Configuration_declarationContext.class,0);
		}
		public Component_declarationContext component_declaration() {
			return getRuleContext(Component_declarationContext.class,0);
		}
		public Interface_declarationContext interface_declaration() {
			return getRuleContext(Interface_declarationContext.class,0);
		}
		public Subtype_declarationContext subtype_declaration() {
			return getRuleContext(Subtype_declarationContext.class,0);
		}
		public Group_declarationContext group_declaration() {
			return getRuleContext(Group_declarationContext.class,0);
		}
		public Object_declarationContext object_declaration() {
			return getRuleContext(Object_declarationContext.class,0);
		}
		public Subprogram_declarationContext subprogram_declaration() {
			return getRuleContext(Subprogram_declarationContext.class,0);
		}
		public Attribute_declarationContext attribute_declaration() {
			return getRuleContext(Attribute_declarationContext.class,0);
		}
		public Alias_declarationContext alias_declaration() {
			return getRuleContext(Alias_declarationContext.class,0);
		}
		public Package_declarationContext package_declaration() {
			return getRuleContext(Package_declarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_declaration);
		try {
			setState(950);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(937); type_declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(938); subtype_declaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(939); object_declaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(940); interface_declaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(941); alias_declaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(942); attribute_declaration();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(943); component_declaration();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(944); group_declaration();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(945); group_template_declaration();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(946); entity_declaration();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(947); configuration_declaration();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(948); subprogram_declaration();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(949); package_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delay_mechanismContext extends ParserRuleContext {
		public TerminalNode K_INERTIAL() { return getToken(VhdlParser.K_INERTIAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode K_REJECT() { return getToken(VhdlParser.K_REJECT, 0); }
		public TerminalNode K_TRANSPORT() { return getToken(VhdlParser.K_TRANSPORT, 0); }
		public Delay_mechanismContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delay_mechanism; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterDelay_mechanism(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitDelay_mechanism(this);
		}
	}

	public final Delay_mechanismContext delay_mechanism() throws RecognitionException {
		Delay_mechanismContext _localctx = new Delay_mechanismContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_delay_mechanism);
		int _la;
		try {
			setState(958);
			switch (_input.LA(1)) {
			case K_TRANSPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(952); match(K_TRANSPORT);
				}
				break;
			case K_INERTIAL:
			case K_REJECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(955);
				_la = _input.LA(1);
				if (_la==K_REJECT) {
					{
					setState(953); match(K_REJECT);
					setState(954); expression();
					}
				}

				setState(957); match(K_INERTIAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Design_fileContext extends ParserRuleContext {
		public List<Design_unitContext> design_unit() {
			return getRuleContexts(Design_unitContext.class);
		}
		public Design_unitContext design_unit(int i) {
			return getRuleContext(Design_unitContext.class,i);
		}
		public Design_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_design_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterDesign_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitDesign_file(this);
		}
	}

	public final Design_fileContext design_file() throws RecognitionException {
		Design_fileContext _localctx = new Design_fileContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_design_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(960); design_unit();
				}
				}
				setState(963); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ARCHITECTURE) | (1L << K_CONFIGURATION) | (1L << K_ENTITY))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (K_LIBRARY - 79)) | (1L << (K_PACKAGE - 79)) | (1L << (K_USE - 79)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Design_unitContext extends ParserRuleContext {
		public Context_clauseContext context_clause() {
			return getRuleContext(Context_clauseContext.class,0);
		}
		public Library_unitContext library_unit() {
			return getRuleContext(Library_unitContext.class,0);
		}
		public Design_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_design_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterDesign_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitDesign_unit(this);
		}
	}

	public final Design_unitContext design_unit() throws RecognitionException {
		Design_unitContext _localctx = new Design_unitContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_design_unit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965); context_clause();
			setState(966); library_unit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignatorContext extends ParserRuleContext {
		public Operator_symbolContext operator_symbol() {
			return getRuleContext(Operator_symbolContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitDesignator(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_designator);
		try {
			setState(970);
			switch (_input.LA(1)) {
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(968); identifier();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(969); operator_symbol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectionContext extends ParserRuleContext {
		public TerminalNode K_DOWNTO() { return getToken(VhdlParser.K_DOWNTO, 0); }
		public TerminalNode K_TO() { return getToken(VhdlParser.K_TO, 0); }
		public DirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterDirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitDirection(this);
		}
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
			_la = _input.LA(1);
			if ( !(_la==K_DOWNTO || _la==K_TO) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Disconnection_specificationContext extends ParserRuleContext {
		public Guarded_signal_specificationContext guarded_signal_specification() {
			return getRuleContext(Guarded_signal_specificationContext.class,0);
		}
		public TerminalNode K_DISCONNECT() { return getToken(VhdlParser.K_DISCONNECT, 0); }
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode K_AFTER() { return getToken(VhdlParser.K_AFTER, 0); }
		public Disconnection_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disconnection_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterDisconnection_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitDisconnection_specification(this);
		}
	}

	public final Disconnection_specificationContext disconnection_specification() throws RecognitionException {
		Disconnection_specificationContext _localctx = new Disconnection_specificationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_disconnection_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974); match(K_DISCONNECT);
			setState(975); guarded_signal_specification();
			setState(976); match(K_AFTER);
			setState(977); expression();
			setState(978); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Discrete_rangeContext extends ParserRuleContext {
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public Discrete_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discrete_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterDiscrete_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitDiscrete_range(this);
		}
	}

	public final Discrete_rangeContext discrete_range() throws RecognitionException {
		Discrete_rangeContext _localctx = new Discrete_rangeContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_discrete_range);
		try {
			setState(982);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(980); range();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(981); subtype_indication();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Element_associationContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ChoicesContext choices() {
			return getRuleContext(ChoicesContext.class,0);
		}
		public TerminalNode EQGRT() { return getToken(VhdlParser.EQGRT, 0); }
		public Element_associationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_association; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterElement_association(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitElement_association(this);
		}
	}

	public final Element_associationContext element_association() throws RecognitionException {
		Element_associationContext _localctx = new Element_associationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_element_association);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(984); choices();
				setState(985); match(EQGRT);
				}
				break;
			}
			setState(989); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Element_declarationContext extends ParserRuleContext {
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public Element_subtype_definitionContext element_subtype_definition() {
			return getRuleContext(Element_subtype_definitionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VhdlParser.COLON, 0); }
		public Element_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterElement_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitElement_declaration(this);
		}
	}

	public final Element_declarationContext element_declaration() throws RecognitionException {
		Element_declarationContext _localctx = new Element_declarationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_element_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(991); identifier_list();
			setState(992); match(COLON);
			setState(993); element_subtype_definition();
			setState(994); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Element_subtype_definitionContext extends ParserRuleContext {
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public Element_subtype_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_subtype_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterElement_subtype_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitElement_subtype_definition(this);
		}
	}

	public final Element_subtype_definitionContext element_subtype_definition() throws RecognitionException {
		Element_subtype_definitionContext _localctx = new Element_subtype_definitionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_element_subtype_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996); subtype_indication();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_aspectContext extends ParserRuleContext {
		public TerminalNode K_OPEN() { return getToken(VhdlParser.K_OPEN, 0); }
		public TerminalNode K_CONFIGURATION() { return getToken(VhdlParser.K_CONFIGURATION, 0); }
		public TerminalNode RPAREN() { return getToken(VhdlParser.RPAREN, 0); }
		public TerminalNode K_ENTITY() { return getToken(VhdlParser.K_ENTITY, 0); }
		public TerminalNode LPAREN() { return getToken(VhdlParser.LPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Entity_aspectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_aspect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterEntity_aspect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitEntity_aspect(this);
		}
	}

	public final Entity_aspectContext entity_aspect() throws RecognitionException {
		Entity_aspectContext _localctx = new Entity_aspectContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_entity_aspect);
		int _la;
		try {
			setState(1009);
			switch (_input.LA(1)) {
			case K_ENTITY:
				enterOuterAlt(_localctx, 1);
				{
				setState(998); match(K_ENTITY);
				setState(999); name();
				setState(1004);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1000); match(LPAREN);
					setState(1001); identifier();
					setState(1002); match(RPAREN);
					}
				}

				}
				break;
			case K_CONFIGURATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1006); match(K_CONFIGURATION);
				setState(1007); name();
				}
				break;
			case K_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(1008); match(K_OPEN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_classContext extends ParserRuleContext {
		public TerminalNode K_PROCEDURE() { return getToken(VhdlParser.K_PROCEDURE, 0); }
		public TerminalNode K_SUBTYPE() { return getToken(VhdlParser.K_SUBTYPE, 0); }
		public TerminalNode K_LITERAL() { return getToken(VhdlParser.K_LITERAL, 0); }
		public TerminalNode K_TYPE() { return getToken(VhdlParser.K_TYPE, 0); }
		public TerminalNode K_ARCHITECTURE() { return getToken(VhdlParser.K_ARCHITECTURE, 0); }
		public TerminalNode K_VARIABLE() { return getToken(VhdlParser.K_VARIABLE, 0); }
		public TerminalNode K_FUNCTION() { return getToken(VhdlParser.K_FUNCTION, 0); }
		public TerminalNode K_CONSTANT() { return getToken(VhdlParser.K_CONSTANT, 0); }
		public TerminalNode K_CONFIGURATION() { return getToken(VhdlParser.K_CONFIGURATION, 0); }
		public TerminalNode K_UNITS() { return getToken(VhdlParser.K_UNITS, 0); }
		public TerminalNode K_LABEL() { return getToken(VhdlParser.K_LABEL, 0); }
		public TerminalNode K_SIGNAL() { return getToken(VhdlParser.K_SIGNAL, 0); }
		public TerminalNode K_COMPONENT() { return getToken(VhdlParser.K_COMPONENT, 0); }
		public TerminalNode K_ENTITY() { return getToken(VhdlParser.K_ENTITY, 0); }
		public TerminalNode K_PACKAGE() { return getToken(VhdlParser.K_PACKAGE, 0); }
		public Entity_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterEntity_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitEntity_class(this);
		}
	}

	public final Entity_classContext entity_class() throws RecognitionException {
		Entity_classContext _localctx = new Entity_classContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_entity_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ARCHITECTURE) | (1L << K_COMPONENT) | (1L << K_CONFIGURATION) | (1L << K_CONSTANT) | (1L << K_ENTITY))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (K_FUNCTION - 67)) | (1L << (K_LABEL - 67)) | (1L << (K_LITERAL - 67)) | (1L << (K_PACKAGE - 67)) | (1L << (K_PROCEDURE - 67)) | (1L << (K_SIGNAL - 67)) | (1L << (K_SUBTYPE - 67)) | (1L << (K_TYPE - 67)) | (1L << (K_UNITS - 67)) | (1L << (K_VARIABLE - 67)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_class_entryContext extends ParserRuleContext {
		public TerminalNode LSTGRT() { return getToken(VhdlParser.LSTGRT, 0); }
		public Entity_classContext entity_class() {
			return getRuleContext(Entity_classContext.class,0);
		}
		public Entity_class_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_class_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterEntity_class_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitEntity_class_entry(this);
		}
	}

	public final Entity_class_entryContext entity_class_entry() throws RecognitionException {
		Entity_class_entryContext _localctx = new Entity_class_entryContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_entity_class_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013); entity_class();
			setState(1015);
			_la = _input.LA(1);
			if (_la==LSTGRT) {
				{
				setState(1014); match(LSTGRT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_class_entry_listContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(VhdlParser.COMMA); }
		public List<Entity_class_entryContext> entity_class_entry() {
			return getRuleContexts(Entity_class_entryContext.class);
		}
		public Entity_class_entryContext entity_class_entry(int i) {
			return getRuleContext(Entity_class_entryContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(VhdlParser.COMMA, i);
		}
		public Entity_class_entry_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_class_entry_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterEntity_class_entry_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitEntity_class_entry_list(this);
		}
	}

	public final Entity_class_entry_listContext entity_class_entry_list() throws RecognitionException {
		Entity_class_entry_listContext _localctx = new Entity_class_entry_listContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_entity_class_entry_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017); entity_class_entry();
			setState(1022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1018); match(COMMA);
				setState(1019); entity_class_entry();
				}
				}
				setState(1024);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_declarationContext extends ParserRuleContext {
		public Entity_statement_partContext entity_statement_part() {
			return getRuleContext(Entity_statement_partContext.class,0);
		}
		public Entity_declarative_partContext entity_declarative_part() {
			return getRuleContext(Entity_declarative_partContext.class,0);
		}
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public TerminalNode K_ENTITY(int i) {
			return getToken(VhdlParser.K_ENTITY, i);
		}
		public TerminalNode K_BEGIN() { return getToken(VhdlParser.K_BEGIN, 0); }
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public TerminalNode K_END() { return getToken(VhdlParser.K_END, 0); }
		public List<TerminalNode> K_ENTITY() { return getTokens(VhdlParser.K_ENTITY); }
		public Entity_headerContext entity_header() {
			return getRuleContext(Entity_headerContext.class,0);
		}
		public TerminalNode K_IS() { return getToken(VhdlParser.K_IS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Entity_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterEntity_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitEntity_declaration(this);
		}
	}

	public final Entity_declarationContext entity_declaration() throws RecognitionException {
		Entity_declarationContext _localctx = new Entity_declarationContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_entity_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025); match(K_ENTITY);
			setState(1026); identifier();
			setState(1027); match(K_IS);
			setState(1028); entity_header();
			setState(1029); entity_declarative_part();
			setState(1032);
			_la = _input.LA(1);
			if (_la==K_BEGIN) {
				{
				setState(1030); match(K_BEGIN);
				setState(1031); entity_statement_part();
				}
			}

			setState(1034); match(K_END);
			setState(1036);
			_la = _input.LA(1);
			if (_la==K_ENTITY) {
				{
				setState(1035); match(K_ENTITY);
				}
			}

			setState(1039);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1038); simple_name();
				}
			}

			setState(1041); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_declarative_itemContext extends ParserRuleContext {
		public Group_template_declarationContext group_template_declaration() {
			return getRuleContext(Group_template_declarationContext.class,0);
		}
		public Signal_declarationContext signal_declaration() {
			return getRuleContext(Signal_declarationContext.class,0);
		}
		public Subprogram_bodyContext subprogram_body() {
			return getRuleContext(Subprogram_bodyContext.class,0);
		}
		public Use_clauseContext use_clause() {
			return getRuleContext(Use_clauseContext.class,0);
		}
		public Subprogram_declarationContext subprogram_declaration() {
			return getRuleContext(Subprogram_declarationContext.class,0);
		}
		public Attribute_specificationContext attribute_specification() {
			return getRuleContext(Attribute_specificationContext.class,0);
		}
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public File_declarationContext file_declaration() {
			return getRuleContext(File_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Subtype_declarationContext subtype_declaration() {
			return getRuleContext(Subtype_declarationContext.class,0);
		}
		public Group_declarationContext group_declaration() {
			return getRuleContext(Group_declarationContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Attribute_declarationContext attribute_declaration() {
			return getRuleContext(Attribute_declarationContext.class,0);
		}
		public Alias_declarationContext alias_declaration() {
			return getRuleContext(Alias_declarationContext.class,0);
		}
		public Disconnection_specificationContext disconnection_specification() {
			return getRuleContext(Disconnection_specificationContext.class,0);
		}
		public Entity_declarative_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_declarative_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterEntity_declarative_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitEntity_declarative_item(this);
		}
	}

	public final Entity_declarative_itemContext entity_declarative_item() throws RecognitionException {
		Entity_declarative_itemContext _localctx = new Entity_declarative_itemContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_entity_declarative_item);
		try {
			setState(1058);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1043); subprogram_declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1044); subprogram_body();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1045); type_declaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1046); subtype_declaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1047); constant_declaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1048); signal_declaration();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1049); variable_declaration();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1050); file_declaration();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1051); alias_declaration();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1052); attribute_specification();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1053); attribute_declaration();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1054); disconnection_specification();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1055); use_clause();
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1056); group_declaration();
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1057); group_template_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_declarative_partContext extends ParserRuleContext {
		public List<Entity_declarative_itemContext> entity_declarative_item() {
			return getRuleContexts(Entity_declarative_itemContext.class);
		}
		public Entity_declarative_itemContext entity_declarative_item(int i) {
			return getRuleContext(Entity_declarative_itemContext.class,i);
		}
		public Entity_declarative_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_declarative_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterEntity_declarative_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitEntity_declarative_part(this);
		}
	}

	public final Entity_declarative_partContext entity_declarative_part() throws RecognitionException {
		Entity_declarative_partContext _localctx = new Entity_declarative_partContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_entity_declarative_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1063);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (K_ALIAS - 42)) | (1L << (K_ATTRIBUTE - 42)) | (1L << (K_CONSTANT - 42)) | (1L << (K_DISCONNECT - 42)) | (1L << (K_FILE - 42)) | (1L << (K_FUNCTION - 42)) | (1L << (K_GROUP - 42)) | (1L << (K_IMPURE - 42)) | (1L << (K_PROCEDURE - 42)) | (1L << (K_PURE - 42)))) != 0) || ((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (K_SHARED - 115)) | (1L << (K_SIGNAL - 115)) | (1L << (K_SUBTYPE - 115)) | (1L << (K_TYPE - 115)) | (1L << (K_USE - 115)) | (1L << (K_VARIABLE - 115)))) != 0)) {
				{
				{
				setState(1060); entity_declarative_item();
				}
				}
				setState(1065);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_designatorContext extends ParserRuleContext {
		public Entity_tagContext entity_tag() {
			return getRuleContext(Entity_tagContext.class,0);
		}
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public Entity_designatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterEntity_designator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitEntity_designator(this);
		}
	}

	public final Entity_designatorContext entity_designator() throws RecognitionException {
		Entity_designatorContext _localctx = new Entity_designatorContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_entity_designator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066); entity_tag();
			setState(1068);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(1067); signature();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_headerContext extends ParserRuleContext {
		public Generic_clauseContext generic_clause() {
			return getRuleContext(Generic_clauseContext.class,0);
		}
		public Port_clauseContext port_clause() {
			return getRuleContext(Port_clauseContext.class,0);
		}
		public Entity_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterEntity_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitEntity_header(this);
		}
	}

	public final Entity_headerContext entity_header() throws RecognitionException {
		Entity_headerContext _localctx = new Entity_headerContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_entity_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1071);
			_la = _input.LA(1);
			if (_la==K_GENERIC) {
				{
				setState(1070); generic_clause();
				}
			}

			setState(1074);
			_la = _input.LA(1);
			if (_la==K_PORT) {
				{
				setState(1073); port_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_name_listContext extends ParserRuleContext {
		public TerminalNode K_OTHERS() { return getToken(VhdlParser.K_OTHERS, 0); }
		public List<Entity_designatorContext> entity_designator() {
			return getRuleContexts(Entity_designatorContext.class);
		}
		public TerminalNode K_ALL() { return getToken(VhdlParser.K_ALL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(VhdlParser.COMMA); }
		public Entity_designatorContext entity_designator(int i) {
			return getRuleContext(Entity_designatorContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(VhdlParser.COMMA, i);
		}
		public Entity_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_name_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterEntity_name_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitEntity_name_list(this);
		}
	}

	public final Entity_name_listContext entity_name_list() throws RecognitionException {
		Entity_name_listContext _localctx = new Entity_name_listContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_entity_name_list);
		int _la;
		try {
			setState(1086);
			switch (_input.LA(1)) {
			case BASIC_IDENTIFIER:
			case CHARACTER_LITERAL:
			case EXTENDED_IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1076); entity_designator();
				setState(1081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1077); match(COMMA);
					setState(1078); entity_designator();
					}
					}
					setState(1083);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case K_OTHERS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1084); match(K_OTHERS);
				}
				break;
			case K_ALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1085); match(K_ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_specificationContext extends ParserRuleContext {
		public Entity_name_listContext entity_name_list() {
			return getRuleContext(Entity_name_listContext.class,0);
		}
		public Entity_classContext entity_class() {
			return getRuleContext(Entity_classContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VhdlParser.COLON, 0); }
		public Entity_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterEntity_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitEntity_specification(this);
		}
	}

	public final Entity_specificationContext entity_specification() throws RecognitionException {
		Entity_specificationContext _localctx = new Entity_specificationContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_entity_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1088); entity_name_list();
			setState(1089); match(COLON);
			setState(1090); entity_class();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_statementContext extends ParserRuleContext {
		public Concurrent_assertion_statementContext concurrent_assertion_statement() {
			return getRuleContext(Concurrent_assertion_statementContext.class,0);
		}
		public Concurrent_procedure_call_statementContext concurrent_procedure_call_statement() {
			return getRuleContext(Concurrent_procedure_call_statementContext.class,0);
		}
		public Process_statementContext process_statement() {
			return getRuleContext(Process_statementContext.class,0);
		}
		public Entity_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterEntity_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitEntity_statement(this);
		}
	}

	public final Entity_statementContext entity_statement() throws RecognitionException {
		Entity_statementContext _localctx = new Entity_statementContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_entity_statement);
		try {
			setState(1095);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1092); concurrent_assertion_statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1093); concurrent_procedure_call_statement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1094); process_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_statement_partContext extends ParserRuleContext {
		public Entity_statementContext entity_statement(int i) {
			return getRuleContext(Entity_statementContext.class,i);
		}
		public List<Entity_statementContext> entity_statement() {
			return getRuleContexts(Entity_statementContext.class);
		}
		public Entity_statement_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_statement_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterEntity_statement_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitEntity_statement_part(this);
		}
	}

	public final Entity_statement_partContext entity_statement_part() throws RecognitionException {
		Entity_statement_partContext _localctx = new Entity_statement_partContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_entity_statement_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_ASSERT || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (K_POSTPONED - 99)) | (1L << (K_PROCESS - 99)) | (1L << (BASIC_IDENTIFIER - 99)) | (1L << (EXTENDED_IDENTIFIER - 99)) | (1L << (STRING_LITERAL - 99)))) != 0)) {
				{
				{
				setState(1097); entity_statement();
				}
				}
				setState(1102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_tagContext extends ParserRuleContext {
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public Operator_symbolContext operator_symbol() {
			return getRuleContext(Operator_symbolContext.class,0);
		}
		public Character_literalContext character_literal() {
			return getRuleContext(Character_literalContext.class,0);
		}
		public Entity_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterEntity_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitEntity_tag(this);
		}
	}

	public final Entity_tagContext entity_tag() throws RecognitionException {
		Entity_tagContext _localctx = new Entity_tagContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_entity_tag);
		try {
			setState(1106);
			switch (_input.LA(1)) {
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1103); simple_name();
				}
				break;
			case CHARACTER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1104); character_literal();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1105); operator_symbol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enumeration_literalContext extends ParserRuleContext {
		public Character_literalContext character_literal() {
			return getRuleContext(Character_literalContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Enumeration_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeration_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterEnumeration_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitEnumeration_literal(this);
		}
	}

	public final Enumeration_literalContext enumeration_literal() throws RecognitionException {
		Enumeration_literalContext _localctx = new Enumeration_literalContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_enumeration_literal);
		try {
			setState(1110);
			switch (_input.LA(1)) {
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1108); identifier();
				}
				break;
			case CHARACTER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1109); character_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enumeration_type_definitionContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(VhdlParser.COMMA); }
		public Enumeration_literalContext enumeration_literal(int i) {
			return getRuleContext(Enumeration_literalContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(VhdlParser.RPAREN, 0); }
		public List<Enumeration_literalContext> enumeration_literal() {
			return getRuleContexts(Enumeration_literalContext.class);
		}
		public TerminalNode LPAREN() { return getToken(VhdlParser.LPAREN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(VhdlParser.COMMA, i);
		}
		public Enumeration_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeration_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterEnumeration_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitEnumeration_type_definition(this);
		}
	}

	public final Enumeration_type_definitionContext enumeration_type_definition() throws RecognitionException {
		Enumeration_type_definitionContext _localctx = new Enumeration_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_enumeration_type_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112); match(LPAREN);
			setState(1113); enumeration_literal();
			setState(1118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1114); match(COMMA);
				setState(1115); enumeration_literal();
				}
				}
				setState(1120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1121); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exit_statementContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public TerminalNode K_EXIT() { return getToken(VhdlParser.K_EXIT, 0); }
		public TerminalNode K_WHEN() { return getToken(VhdlParser.K_WHEN, 0); }
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Exit_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterExit_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitExit_statement(this);
		}
	}

	public final Exit_statementContext exit_statement() throws RecognitionException {
		Exit_statementContext _localctx = new Exit_statementContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_exit_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1123); label_colon();
				}
			}

			setState(1126); match(K_EXIT);
			setState(1128);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1127); label();
				}
			}

			setState(1132);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(1130); match(K_WHEN);
				setState(1131); condition();
				}
			}

			setState(1134); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<Logical_opContext> logical_op() {
			return getRuleContexts(Logical_opContext.class);
		}
		public Logical_opContext logical_op(int i) {
			return getRuleContext(Logical_opContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1136); relation();
			setState(1142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (K_NAND - 85)) | (1L << (K_NOR - 85)) | (1L << (K_OR - 85)) | (1L << (K_XNOR - 85)) | (1L << (K_XOR - 85)))) != 0)) {
				{
				{
				setState(1137); logical_op();
				setState(1138); relation();
				}
				}
				setState(1144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_opContext extends ParserRuleContext {
		public TerminalNode K_XNOR() { return getToken(VhdlParser.K_XNOR, 0); }
		public TerminalNode K_XOR() { return getToken(VhdlParser.K_XOR, 0); }
		public TerminalNode K_OR() { return getToken(VhdlParser.K_OR, 0); }
		public TerminalNode K_AND() { return getToken(VhdlParser.K_AND, 0); }
		public TerminalNode K_NAND() { return getToken(VhdlParser.K_NAND, 0); }
		public TerminalNode K_NOR() { return getToken(VhdlParser.K_NOR, 0); }
		public Logical_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterLogical_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitLogical_op(this);
		}
	}

	public final Logical_opContext logical_op() throws RecognitionException {
		Logical_opContext _localctx = new Logical_opContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_logical_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1145);
			_la = _input.LA(1);
			if ( !(_la==K_AND || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (K_NAND - 85)) | (1L << (K_NOR - 85)) | (1L << (K_OR - 85)) | (1L << (K_XNOR - 85)) | (1L << (K_XOR - 85)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public TerminalNode K_ABS() { return getToken(VhdlParser.K_ABS, 0); }
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public TerminalNode K_NOT() { return getToken(VhdlParser.K_NOT, 0); }
		public TerminalNode STAR2() { return getToken(VhdlParser.STAR2, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_factor);
		try {
			setState(1156);
			switch (_input.LA(1)) {
			case LPAREN:
			case K_NEW:
			case K_NULL:
			case BASIC_IDENTIFIER:
			case BIT_STRING_LITERAL:
			case CHARACTER_LITERAL:
			case EXTENDED_IDENTIFIER:
			case STRING_LITERAL:
			case DECIMAL_LITERAL:
			case BASED_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1147); primary();
				setState(1150);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(1148); match(STAR2);
					setState(1149); primary();
					}
					break;
				}
				}
				break;
			case K_ABS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1152); match(K_ABS);
				setState(1153); primary();
				}
				break;
			case K_NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1154); match(K_NOT);
				setState(1155); primary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class File_declarationContext extends ParserRuleContext {
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public File_open_informationContext file_open_information() {
			return getRuleContext(File_open_informationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public TerminalNode K_FILE() { return getToken(VhdlParser.K_FILE, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VhdlParser.COLON, 0); }
		public File_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterFile_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitFile_declaration(this);
		}
	}

	public final File_declarationContext file_declaration() throws RecognitionException {
		File_declarationContext _localctx = new File_declarationContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_file_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1158); match(K_FILE);
			setState(1159); identifier_list();
			setState(1160); match(COLON);
			setState(1161); subtype_indication();
			setState(1163);
			_la = _input.LA(1);
			if (_la==K_IS || _la==K_OPEN) {
				{
				setState(1162); file_open_information();
				}
			}

			setState(1165); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class File_logical_nameContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public File_logical_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_logical_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterFile_logical_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitFile_logical_name(this);
		}
	}

	public final File_logical_nameContext file_logical_name() throws RecognitionException {
		File_logical_nameContext _localctx = new File_logical_nameContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_file_logical_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1167); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class File_open_informationContext extends ParserRuleContext {
		public File_logical_nameContext file_logical_name() {
			return getRuleContext(File_logical_nameContext.class,0);
		}
		public TerminalNode K_OPEN() { return getToken(VhdlParser.K_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode K_IS() { return getToken(VhdlParser.K_IS, 0); }
		public File_open_informationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_open_information; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterFile_open_information(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitFile_open_information(this);
		}
	}

	public final File_open_informationContext file_open_information() throws RecognitionException {
		File_open_informationContext _localctx = new File_open_informationContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_file_open_information);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1171);
			_la = _input.LA(1);
			if (_la==K_OPEN) {
				{
				setState(1169); match(K_OPEN);
				setState(1170); expression();
				}
			}

			setState(1173); match(K_IS);
			setState(1174); file_logical_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class File_type_definitionContext extends ParserRuleContext {
		public TerminalNode K_FILE() { return getToken(VhdlParser.K_FILE, 0); }
		public TerminalNode K_OF() { return getToken(VhdlParser.K_OF, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public File_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterFile_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitFile_type_definition(this);
		}
	}

	public final File_type_definitionContext file_type_definition() throws RecognitionException {
		File_type_definitionContext _localctx = new File_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_file_type_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176); match(K_FILE);
			setState(1177); match(K_OF);
			setState(1178); name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Floating_type_definitionContext extends ParserRuleContext {
		public Range_constraintContext range_constraint() {
			return getRuleContext(Range_constraintContext.class,0);
		}
		public Floating_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floating_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterFloating_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitFloating_type_definition(this);
		}
	}

	public final Floating_type_definitionContext floating_type_definition() throws RecognitionException {
		Floating_type_definitionContext _localctx = new Floating_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_floating_type_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1180); range_constraint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_parameter_listContext extends ParserRuleContext {
		public Interface_listContext interface_list() {
			return getRuleContext(Interface_listContext.class,0);
		}
		public Formal_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterFormal_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitFormal_parameter_list(this);
		}
	}

	public final Formal_parameter_listContext formal_parameter_list() throws RecognitionException {
		Formal_parameter_listContext _localctx = new Formal_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_formal_parameter_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182); interface_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_partContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(VhdlParser.RPAREN, 0); }
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(VhdlParser.LPAREN, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public Formal_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterFormal_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitFormal_part(this);
		}
	}

	public final Formal_partContext formal_part() throws RecognitionException {
		Formal_partContext _localctx = new Formal_partContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_formal_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1184); name();
			setState(1189);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1185); match(LPAREN);
				setState(1186); name();
				setState(1187); match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Full_type_declarationContext extends ParserRuleContext {
		public TerminalNode K_TYPE() { return getToken(VhdlParser.K_TYPE, 0); }
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public Type_definitionContext type_definition() {
			return getRuleContext(Type_definitionContext.class,0);
		}
		public TerminalNode K_IS() { return getToken(VhdlParser.K_IS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Full_type_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_full_type_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterFull_type_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitFull_type_declaration(this);
		}
	}

	public final Full_type_declarationContext full_type_declaration() throws RecognitionException {
		Full_type_declarationContext _localctx = new Full_type_declarationContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_full_type_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1191); match(K_TYPE);
			setState(1192); identifier();
			setState(1193); match(K_IS);
			setState(1194); type_definition();
			setState(1195); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(VhdlParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(VhdlParser.LPAREN, 0); }
		public Actual_parameter_partContext actual_parameter_part() {
			return getRuleContext(Actual_parameter_partContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1197); name();
			setState(1202);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1198); match(LPAREN);
				setState(1199); actual_parameter_part();
				setState(1200); match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generate_statementContext extends ParserRuleContext {
		public TerminalNode K_GENERATE(int i) {
			return getToken(VhdlParser.K_GENERATE, i);
		}
		public List<TerminalNode> K_GENERATE() { return getTokens(VhdlParser.K_GENERATE); }
		public List<Concurrent_statementContext> concurrent_statement() {
			return getRuleContexts(Concurrent_statementContext.class);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public Generation_schemeContext generation_scheme() {
			return getRuleContext(Generation_schemeContext.class,0);
		}
		public TerminalNode K_END() { return getToken(VhdlParser.K_END, 0); }
		public List<Block_declarative_itemContext> block_declarative_item() {
			return getRuleContexts(Block_declarative_itemContext.class);
		}
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public TerminalNode K_BEGIN() { return getToken(VhdlParser.K_BEGIN, 0); }
		public Block_declarative_itemContext block_declarative_item(int i) {
			return getRuleContext(Block_declarative_itemContext.class,i);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public Concurrent_statementContext concurrent_statement(int i) {
			return getRuleContext(Concurrent_statementContext.class,i);
		}
		public TerminalNode COLON() { return getToken(VhdlParser.COLON, 0); }
		public Generate_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generate_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterGenerate_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitGenerate_statement(this);
		}
	}

	public final Generate_statementContext generate_statement() throws RecognitionException {
		Generate_statementContext _localctx = new Generate_statementContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_generate_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1204); label();
			setState(1205); match(COLON);
			setState(1206); generation_scheme();
			setState(1207); match(K_GENERATE);
			setState(1215);
			_la = _input.LA(1);
			if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (K_ALIAS - 42)) | (1L << (K_ATTRIBUTE - 42)) | (1L << (K_BEGIN - 42)) | (1L << (K_COMPONENT - 42)) | (1L << (K_CONSTANT - 42)) | (1L << (K_DISCONNECT - 42)) | (1L << (K_FILE - 42)) | (1L << (K_FOR - 42)) | (1L << (K_FUNCTION - 42)) | (1L << (K_GROUP - 42)) | (1L << (K_IMPURE - 42)) | (1L << (K_PROCEDURE - 42)) | (1L << (K_PURE - 42)))) != 0) || ((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (K_SHARED - 115)) | (1L << (K_SIGNAL - 115)) | (1L << (K_SUBTYPE - 115)) | (1L << (K_TYPE - 115)) | (1L << (K_USE - 115)) | (1L << (K_VARIABLE - 115)))) != 0)) {
				{
				setState(1211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (K_ALIAS - 42)) | (1L << (K_ATTRIBUTE - 42)) | (1L << (K_COMPONENT - 42)) | (1L << (K_CONSTANT - 42)) | (1L << (K_DISCONNECT - 42)) | (1L << (K_FILE - 42)) | (1L << (K_FOR - 42)) | (1L << (K_FUNCTION - 42)) | (1L << (K_GROUP - 42)) | (1L << (K_IMPURE - 42)) | (1L << (K_PROCEDURE - 42)) | (1L << (K_PURE - 42)))) != 0) || ((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (K_SHARED - 115)) | (1L << (K_SIGNAL - 115)) | (1L << (K_SUBTYPE - 115)) | (1L << (K_TYPE - 115)) | (1L << (K_USE - 115)) | (1L << (K_VARIABLE - 115)))) != 0)) {
					{
					{
					setState(1208); block_declarative_item();
					}
					}
					setState(1213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1214); match(K_BEGIN);
				}
			}

			setState(1220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN || _la==K_ASSERT || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (K_POSTPONED - 99)) | (1L << (K_PROCESS - 99)) | (1L << (K_WITH - 99)) | (1L << (BASIC_IDENTIFIER - 99)) | (1L << (EXTENDED_IDENTIFIER - 99)) | (1L << (STRING_LITERAL - 99)))) != 0)) {
				{
				{
				setState(1217); concurrent_statement();
				}
				}
				setState(1222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1223); match(K_END);
			setState(1224); match(K_GENERATE);
			setState(1226);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1225); label();
				}
			}

			setState(1228); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generation_schemeContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode K_FOR() { return getToken(VhdlParser.K_FOR, 0); }
		public TerminalNode K_IF() { return getToken(VhdlParser.K_IF, 0); }
		public Parameter_specificationContext parameter_specification() {
			return getRuleContext(Parameter_specificationContext.class,0);
		}
		public Generation_schemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generation_scheme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterGeneration_scheme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitGeneration_scheme(this);
		}
	}

	public final Generation_schemeContext generation_scheme() throws RecognitionException {
		Generation_schemeContext _localctx = new Generation_schemeContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_generation_scheme);
		try {
			setState(1234);
			switch (_input.LA(1)) {
			case K_FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1230); match(K_FOR);
				setState(1231); parameter_specification();
				}
				break;
			case K_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(1232); match(K_IF);
				setState(1233); condition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_clauseContext extends ParserRuleContext {
		public TerminalNode K_GENERIC() { return getToken(VhdlParser.K_GENERIC, 0); }
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public Generic_listContext generic_list() {
			return getRuleContext(Generic_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VhdlParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(VhdlParser.LPAREN, 0); }
		public Generic_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterGeneric_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitGeneric_clause(this);
		}
	}

	public final Generic_clauseContext generic_clause() throws RecognitionException {
		Generic_clauseContext _localctx = new Generic_clauseContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_generic_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1236); match(K_GENERIC);
			setState(1237); match(LPAREN);
			setState(1238); generic_list();
			setState(1239); match(RPAREN);
			setState(1240); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_listContext extends ParserRuleContext {
		public Interface_listContext interface_list() {
			return getRuleContext(Interface_listContext.class,0);
		}
		public Generic_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterGeneric_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitGeneric_list(this);
		}
	}

	public final Generic_listContext generic_list() throws RecognitionException {
		Generic_listContext _localctx = new Generic_listContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_generic_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1242); interface_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_map_aspectContext extends ParserRuleContext {
		public Association_listContext association_list() {
			return getRuleContext(Association_listContext.class,0);
		}
		public TerminalNode K_GENERIC() { return getToken(VhdlParser.K_GENERIC, 0); }
		public TerminalNode RPAREN() { return getToken(VhdlParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(VhdlParser.LPAREN, 0); }
		public TerminalNode K_MAP() { return getToken(VhdlParser.K_MAP, 0); }
		public Generic_map_aspectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_map_aspect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterGeneric_map_aspect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitGeneric_map_aspect(this);
		}
	}

	public final Generic_map_aspectContext generic_map_aspect() throws RecognitionException {
		Generic_map_aspectContext _localctx = new Generic_map_aspectContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_generic_map_aspect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1244); match(K_GENERIC);
			setState(1245); match(K_MAP);
			setState(1246); match(LPAREN);
			setState(1247); association_list();
			setState(1248); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_constituentContext extends ParserRuleContext {
		public Character_literalContext character_literal() {
			return getRuleContext(Character_literalContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Group_constituentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_constituent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterGroup_constituent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitGroup_constituent(this);
		}
	}

	public final Group_constituentContext group_constituent() throws RecognitionException {
		Group_constituentContext _localctx = new Group_constituentContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_group_constituent);
		try {
			setState(1252);
			switch (_input.LA(1)) {
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1250); name();
				}
				break;
			case CHARACTER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1251); character_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_constituent_listContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(VhdlParser.COMMA); }
		public Group_constituentContext group_constituent(int i) {
			return getRuleContext(Group_constituentContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(VhdlParser.COMMA, i);
		}
		public List<Group_constituentContext> group_constituent() {
			return getRuleContexts(Group_constituentContext.class);
		}
		public Group_constituent_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_constituent_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterGroup_constituent_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitGroup_constituent_list(this);
		}
	}

	public final Group_constituent_listContext group_constituent_list() throws RecognitionException {
		Group_constituent_listContext _localctx = new Group_constituent_listContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_group_constituent_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254); group_constituent();
			setState(1259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1255); match(COMMA);
				setState(1256); group_constituent();
				}
				}
				setState(1261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_declarationContext extends ParserRuleContext {
		public TerminalNode K_GROUP() { return getToken(VhdlParser.K_GROUP, 0); }
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public TerminalNode RPAREN() { return getToken(VhdlParser.RPAREN, 0); }
		public Group_constituent_listContext group_constituent_list() {
			return getRuleContext(Group_constituent_listContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VhdlParser.LPAREN, 0); }
		public TerminalNode COLON() { return getToken(VhdlParser.COLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Group_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterGroup_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitGroup_declaration(this);
		}
	}

	public final Group_declarationContext group_declaration() throws RecognitionException {
		Group_declarationContext _localctx = new Group_declarationContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_group_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1262); match(K_GROUP);
			setState(1263); identifier();
			setState(1264); match(COLON);
			setState(1265); name();
			setState(1266); match(LPAREN);
			setState(1267); group_constituent_list();
			setState(1268); match(RPAREN);
			setState(1269); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_template_declarationContext extends ParserRuleContext {
		public TerminalNode K_GROUP() { return getToken(VhdlParser.K_GROUP, 0); }
		public Entity_class_entry_listContext entity_class_entry_list() {
			return getRuleContext(Entity_class_entry_listContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public TerminalNode RPAREN() { return getToken(VhdlParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(VhdlParser.LPAREN, 0); }
		public TerminalNode K_IS() { return getToken(VhdlParser.K_IS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Group_template_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_template_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterGroup_template_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitGroup_template_declaration(this);
		}
	}

	public final Group_template_declarationContext group_template_declaration() throws RecognitionException {
		Group_template_declarationContext _localctx = new Group_template_declarationContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_group_template_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271); match(K_GROUP);
			setState(1272); identifier();
			setState(1273); match(K_IS);
			setState(1274); match(LPAREN);
			setState(1275); entity_class_entry_list();
			setState(1276); match(RPAREN);
			setState(1277); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Guarded_signal_specificationContext extends ParserRuleContext {
		public Signal_listContext signal_list() {
			return getRuleContext(Signal_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VhdlParser.COLON, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Guarded_signal_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guarded_signal_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterGuarded_signal_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitGuarded_signal_specification(this);
		}
	}

	public final Guarded_signal_specificationContext guarded_signal_specification() throws RecognitionException {
		Guarded_signal_specificationContext _localctx = new Guarded_signal_specificationContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_guarded_signal_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279); signal_list();
			setState(1280); match(COLON);
			setState(1281); name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode BASIC_IDENTIFIER() { return getToken(VhdlParser.BASIC_IDENTIFIER, 0); }
		public TerminalNode EXTENDED_IDENTIFIER() { return getToken(VhdlParser.EXTENDED_IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1283);
			_la = _input.LA(1);
			if ( !(_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identifier_listContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(VhdlParser.COMMA); }
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(VhdlParser.COMMA, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public Identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterIdentifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitIdentifier_list(this);
		}
	}

	public final Identifier_listContext identifier_list() throws RecognitionException {
		Identifier_listContext _localctx = new Identifier_listContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1285); identifier();
			setState(1290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1286); match(COMMA);
				setState(1287); identifier();
				}
				}
				setState(1292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public List<TerminalNode> K_ELSIF() { return getTokens(VhdlParser.K_ELSIF); }
		public TerminalNode K_ELSIF(int i) {
			return getToken(VhdlParser.K_ELSIF, i);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode K_ELSE() { return getToken(VhdlParser.K_ELSE, 0); }
		public TerminalNode K_END() { return getToken(VhdlParser.K_END, 0); }
		public List<TerminalNode> K_THEN() { return getTokens(VhdlParser.K_THEN); }
		public Sequence_of_statementsContext sequence_of_statements(int i) {
			return getRuleContext(Sequence_of_statementsContext.class,i);
		}
		public List<TerminalNode> K_IF() { return getTokens(VhdlParser.K_IF); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public TerminalNode K_THEN(int i) {
			return getToken(VhdlParser.K_THEN, i);
		}
		public List<Sequence_of_statementsContext> sequence_of_statements() {
			return getRuleContexts(Sequence_of_statementsContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public TerminalNode K_IF(int i) {
			return getToken(VhdlParser.K_IF, i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1293); label_colon();
				}
			}

			setState(1296); match(K_IF);
			setState(1297); condition();
			setState(1298); match(K_THEN);
			setState(1299); sequence_of_statements();
			setState(1307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_ELSIF) {
				{
				{
				setState(1300); match(K_ELSIF);
				setState(1301); condition();
				setState(1302); match(K_THEN);
				setState(1303); sequence_of_statements();
				}
				}
				setState(1309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1312);
			_la = _input.LA(1);
			if (_la==K_ELSE) {
				{
				setState(1310); match(K_ELSE);
				setState(1311); sequence_of_statements();
				}
			}

			setState(1314); match(K_END);
			setState(1315); match(K_IF);
			setState(1317);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1316); label();
				}
			}

			setState(1319); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Incomplete_type_declarationContext extends ParserRuleContext {
		public TerminalNode K_TYPE() { return getToken(VhdlParser.K_TYPE, 0); }
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Incomplete_type_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incomplete_type_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterIncomplete_type_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitIncomplete_type_declaration(this);
		}
	}

	public final Incomplete_type_declarationContext incomplete_type_declaration() throws RecognitionException {
		Incomplete_type_declarationContext _localctx = new Incomplete_type_declarationContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_incomplete_type_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1321); match(K_TYPE);
			setState(1322); identifier();
			setState(1323); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_constraintContext extends ParserRuleContext {
		public List<Discrete_rangeContext> discrete_range() {
			return getRuleContexts(Discrete_rangeContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(VhdlParser.COMMA); }
		public TerminalNode RPAREN() { return getToken(VhdlParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(VhdlParser.LPAREN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(VhdlParser.COMMA, i);
		}
		public Discrete_rangeContext discrete_range(int i) {
			return getRuleContext(Discrete_rangeContext.class,i);
		}
		public Index_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterIndex_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitIndex_constraint(this);
		}
	}

	public final Index_constraintContext index_constraint() throws RecognitionException {
		Index_constraintContext _localctx = new Index_constraintContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_index_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1325); match(LPAREN);
			setState(1326); discrete_range();
			setState(1331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1327); match(COMMA);
				setState(1328); discrete_range();
				}
				}
				setState(1333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1334); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_specificationContext extends ParserRuleContext {
		public Discrete_rangeContext discrete_range() {
			return getRuleContext(Discrete_rangeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Index_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterIndex_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitIndex_specification(this);
		}
	}

	public final Index_specificationContext index_specification() throws RecognitionException {
		Index_specificationContext _localctx = new Index_specificationContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_index_specification);
		try {
			setState(1338);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1336); discrete_range();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1337); expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_subtype_definitionContext extends ParserRuleContext {
		public TerminalNode K_RANGE() { return getToken(VhdlParser.K_RANGE, 0); }
		public TerminalNode LSTGRT() { return getToken(VhdlParser.LSTGRT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Index_subtype_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_subtype_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterIndex_subtype_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitIndex_subtype_definition(this);
		}
	}

	public final Index_subtype_definitionContext index_subtype_definition() throws RecognitionException {
		Index_subtype_definitionContext _localctx = new Index_subtype_definitionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_index_subtype_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1340); name();
			setState(1341); match(K_RANGE);
			setState(1342); match(LSTGRT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instantiated_unitContext extends ParserRuleContext {
		public TerminalNode K_CONFIGURATION() { return getToken(VhdlParser.K_CONFIGURATION, 0); }
		public TerminalNode RPAREN() { return getToken(VhdlParser.RPAREN, 0); }
		public TerminalNode K_COMPONENT() { return getToken(VhdlParser.K_COMPONENT, 0); }
		public TerminalNode K_ENTITY() { return getToken(VhdlParser.K_ENTITY, 0); }
		public TerminalNode LPAREN() { return getToken(VhdlParser.LPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Instantiated_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instantiated_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterInstantiated_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitInstantiated_unit(this);
		}
	}

	public final Instantiated_unitContext instantiated_unit() throws RecognitionException {
		Instantiated_unitContext _localctx = new Instantiated_unitContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_instantiated_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1358);
			switch (_input.LA(1)) {
			case K_COMPONENT:
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(1345);
				_la = _input.LA(1);
				if (_la==K_COMPONENT) {
					{
					setState(1344); match(K_COMPONENT);
					}
				}

				setState(1347); name();
				}
				break;
			case K_ENTITY:
				{
				setState(1348); match(K_ENTITY);
				setState(1349); name();
				setState(1354);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1350); match(LPAREN);
					setState(1351); identifier();
					setState(1352); match(RPAREN);
					}
				}

				}
				break;
			case K_CONFIGURATION:
				{
				setState(1356); match(K_CONFIGURATION);
				setState(1357); name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instantiation_listContext extends ParserRuleContext {
		public TerminalNode K_OTHERS() { return getToken(VhdlParser.K_OTHERS, 0); }
		public TerminalNode K_ALL() { return getToken(VhdlParser.K_ALL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(VhdlParser.COMMA); }
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(VhdlParser.COMMA, i);
		}
		public Instantiation_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instantiation_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterInstantiation_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitInstantiation_list(this);
		}
	}

	public final Instantiation_listContext instantiation_list() throws RecognitionException {
		Instantiation_listContext _localctx = new Instantiation_listContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_instantiation_list);
		int _la;
		try {
			setState(1370);
			switch (_input.LA(1)) {
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1360); label();
				setState(1365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1361); match(COMMA);
					setState(1362); label();
					}
					}
					setState(1367);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case K_OTHERS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1368); match(K_OTHERS);
				}
				break;
			case K_ALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1369); match(K_ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_constant_declarationContext extends ParserRuleContext {
		public TerminalNode COLONEQ() { return getToken(VhdlParser.COLONEQ, 0); }
		public TerminalNode K_CONSTANT() { return getToken(VhdlParser.K_CONSTANT, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VhdlParser.COLON, 0); }
		public TerminalNode K_IN() { return getToken(VhdlParser.K_IN, 0); }
		public Interface_constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_constant_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterInterface_constant_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitInterface_constant_declaration(this);
		}
	}

	public final Interface_constant_declarationContext interface_constant_declaration() throws RecognitionException {
		Interface_constant_declarationContext _localctx = new Interface_constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_interface_constant_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1373);
			_la = _input.LA(1);
			if (_la==K_CONSTANT) {
				{
				setState(1372); match(K_CONSTANT);
				}
			}

			setState(1375); identifier_list();
			setState(1376); match(COLON);
			setState(1378);
			_la = _input.LA(1);
			if (_la==K_IN) {
				{
				setState(1377); match(K_IN);
				}
			}

			setState(1380); subtype_indication();
			setState(1383);
			_la = _input.LA(1);
			if (_la==COLONEQ) {
				{
				setState(1381); match(COLONEQ);
				setState(1382); expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_declarationContext extends ParserRuleContext {
		public Interface_variable_declarationContext interface_variable_declaration() {
			return getRuleContext(Interface_variable_declarationContext.class,0);
		}
		public Interface_constant_declarationContext interface_constant_declaration() {
			return getRuleContext(Interface_constant_declarationContext.class,0);
		}
		public Interface_signal_declarationContext interface_signal_declaration() {
			return getRuleContext(Interface_signal_declarationContext.class,0);
		}
		public Interface_file_declarationContext interface_file_declaration() {
			return getRuleContext(Interface_file_declarationContext.class,0);
		}
		public Interface_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterInterface_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitInterface_declaration(this);
		}
	}

	public final Interface_declarationContext interface_declaration() throws RecognitionException {
		Interface_declarationContext _localctx = new Interface_declarationContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_interface_declaration);
		try {
			setState(1389);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1385); interface_constant_declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1386); interface_signal_declaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1387); interface_variable_declaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1388); interface_file_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_elementContext extends ParserRuleContext {
		public Interface_declarationContext interface_declaration() {
			return getRuleContext(Interface_declarationContext.class,0);
		}
		public Interface_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterInterface_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitInterface_element(this);
		}
	}

	public final Interface_elementContext interface_element() throws RecognitionException {
		Interface_elementContext _localctx = new Interface_elementContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_interface_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1391); interface_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_file_declarationContext extends ParserRuleContext {
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode K_FILE() { return getToken(VhdlParser.K_FILE, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VhdlParser.COLON, 0); }
		public Interface_file_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_file_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterInterface_file_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitInterface_file_declaration(this);
		}
	}

	public final Interface_file_declarationContext interface_file_declaration() throws RecognitionException {
		Interface_file_declarationContext _localctx = new Interface_file_declarationContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_interface_file_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1393); match(K_FILE);
			setState(1394); identifier_list();
			setState(1395); match(COLON);
			setState(1396); subtype_indication();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_listContext extends ParserRuleContext {
		public List<TerminalNode> SEMI() { return getTokens(VhdlParser.SEMI); }
		public List<Interface_elementContext> interface_element() {
			return getRuleContexts(Interface_elementContext.class);
		}
		public Interface_elementContext interface_element(int i) {
			return getRuleContext(Interface_elementContext.class,i);
		}
		public TerminalNode SEMI(int i) {
			return getToken(VhdlParser.SEMI, i);
		}
		public Interface_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterInterface_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitInterface_list(this);
		}
	}

	public final Interface_listContext interface_list() throws RecognitionException {
		Interface_listContext _localctx = new Interface_listContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_interface_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1398); interface_element();
			setState(1403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(1399); match(SEMI);
				setState(1400); interface_element();
				}
				}
				setState(1405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_signal_declarationContext extends ParserRuleContext {
		public VmodeContext vmode() {
			return getRuleContext(VmodeContext.class,0);
		}
		public TerminalNode COLONEQ() { return getToken(VhdlParser.COLONEQ, 0); }
		public TerminalNode K_SIGNAL() { return getToken(VhdlParser.K_SIGNAL, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode K_BUS() { return getToken(VhdlParser.K_BUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VhdlParser.COLON, 0); }
		public Interface_signal_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_signal_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterInterface_signal_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitInterface_signal_declaration(this);
		}
	}

	public final Interface_signal_declarationContext interface_signal_declaration() throws RecognitionException {
		Interface_signal_declarationContext _localctx = new Interface_signal_declarationContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_interface_signal_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1407);
			_la = _input.LA(1);
			if (_la==K_SIGNAL) {
				{
				setState(1406); match(K_SIGNAL);
				}
			}

			setState(1409); identifier_list();
			setState(1410); match(COLON);
			setState(1412);
			_la = _input.LA(1);
			if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (K_BUFFER - 52)) | (1L << (K_IN - 52)) | (1L << (K_INOUT - 52)) | (1L << (K_LINKAGE - 52)) | (1L << (K_OUT - 52)))) != 0)) {
				{
				setState(1411); vmode();
				}
			}

			setState(1414); subtype_indication();
			setState(1416);
			_la = _input.LA(1);
			if (_la==K_BUS) {
				{
				setState(1415); match(K_BUS);
				}
			}

			setState(1420);
			_la = _input.LA(1);
			if (_la==COLONEQ) {
				{
				setState(1418); match(COLONEQ);
				setState(1419); expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_variable_declarationContext extends ParserRuleContext {
		public VmodeContext vmode() {
			return getRuleContext(VmodeContext.class,0);
		}
		public TerminalNode COLONEQ() { return getToken(VhdlParser.COLONEQ, 0); }
		public TerminalNode K_VARIABLE() { return getToken(VhdlParser.K_VARIABLE, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VhdlParser.COLON, 0); }
		public Interface_variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterInterface_variable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitInterface_variable_declaration(this);
		}
	}

	public final Interface_variable_declarationContext interface_variable_declaration() throws RecognitionException {
		Interface_variable_declarationContext _localctx = new Interface_variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_interface_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1423);
			_la = _input.LA(1);
			if (_la==K_VARIABLE) {
				{
				setState(1422); match(K_VARIABLE);
				}
			}

			setState(1425); identifier_list();
			setState(1426); match(COLON);
			setState(1428);
			_la = _input.LA(1);
			if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (K_BUFFER - 52)) | (1L << (K_IN - 52)) | (1L << (K_INOUT - 52)) | (1L << (K_LINKAGE - 52)) | (1L << (K_OUT - 52)))) != 0)) {
				{
				setState(1427); vmode();
				}
			}

			setState(1430); subtype_indication();
			setState(1433);
			_la = _input.LA(1);
			if (_la==COLONEQ) {
				{
				setState(1431); match(COLONEQ);
				setState(1432); expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Iteration_schemeContext extends ParserRuleContext {
		public TerminalNode K_WHILE() { return getToken(VhdlParser.K_WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode K_FOR() { return getToken(VhdlParser.K_FOR, 0); }
		public Parameter_specificationContext parameter_specification() {
			return getRuleContext(Parameter_specificationContext.class,0);
		}
		public Iteration_schemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_scheme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterIteration_scheme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitIteration_scheme(this);
		}
	}

	public final Iteration_schemeContext iteration_scheme() throws RecognitionException {
		Iteration_schemeContext _localctx = new Iteration_schemeContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_iteration_scheme);
		try {
			setState(1439);
			switch (_input.LA(1)) {
			case K_WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1435); match(K_WHILE);
				setState(1436); condition();
				}
				break;
			case K_FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1437); match(K_FOR);
				setState(1438); parameter_specification();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1441); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Label_colonContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VhdlParser.COLON, 0); }
		public Label_colonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_colon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterLabel_colon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitLabel_colon(this);
		}
	}

	public final Label_colonContext label_colon() throws RecognitionException {
		Label_colonContext _localctx = new Label_colonContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_label_colon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1443); label();
			setState(1444); match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Library_clauseContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public Logical_name_listContext logical_name_list() {
			return getRuleContext(Logical_name_listContext.class,0);
		}
		public TerminalNode K_LIBRARY() { return getToken(VhdlParser.K_LIBRARY, 0); }
		public Library_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_library_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterLibrary_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitLibrary_clause(this);
		}
	}

	public final Library_clauseContext library_clause() throws RecognitionException {
		Library_clauseContext _localctx = new Library_clauseContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_library_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1446); match(K_LIBRARY);
			setState(1447); logical_name_list();
			setState(1448); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Library_unitContext extends ParserRuleContext {
		public Primary_unitContext primary_unit() {
			return getRuleContext(Primary_unitContext.class,0);
		}
		public Secondary_unitContext secondary_unit() {
			return getRuleContext(Secondary_unitContext.class,0);
		}
		public Library_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_library_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterLibrary_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitLibrary_unit(this);
		}
	}

	public final Library_unitContext library_unit() throws RecognitionException {
		Library_unitContext _localctx = new Library_unitContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_library_unit);
		try {
			setState(1452);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1450); secondary_unit();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1451); primary_unit();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public Bit_string_literalContext bit_string_literal() {
			return getRuleContext(Bit_string_literalContext.class,0);
		}
		public Enumeration_literalContext enumeration_literal() {
			return getRuleContext(Enumeration_literalContext.class,0);
		}
		public TerminalNode K_NULL() { return getToken(VhdlParser.K_NULL, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_literal);
		try {
			setState(1459);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1454); numeric_literal();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1455); enumeration_literal();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1456); string_literal();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1457); bit_string_literal();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1458); match(K_NULL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Logical_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterLogical_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitLogical_name(this);
		}
	}

	public final Logical_nameContext logical_name() throws RecognitionException {
		Logical_nameContext _localctx = new Logical_nameContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_logical_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1461); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_name_listContext extends ParserRuleContext {
		public List<Logical_nameContext> logical_name() {
			return getRuleContexts(Logical_nameContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(VhdlParser.COMMA); }
		public Logical_nameContext logical_name(int i) {
			return getRuleContext(Logical_nameContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(VhdlParser.COMMA, i);
		}
		public Logical_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_name_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterLogical_name_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitLogical_name_list(this);
		}
	}

	public final Logical_name_listContext logical_name_list() throws RecognitionException {
		Logical_name_listContext _localctx = new Logical_name_listContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_logical_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1463); logical_name();
			setState(1468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1464); match(COMMA);
				setState(1465); logical_name();
				}
				}
				setState(1470);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_operatorContext extends ParserRuleContext {
		public TerminalNode K_XNOR() { return getToken(VhdlParser.K_XNOR, 0); }
		public TerminalNode K_XOR() { return getToken(VhdlParser.K_XOR, 0); }
		public TerminalNode K_OR() { return getToken(VhdlParser.K_OR, 0); }
		public TerminalNode K_AND() { return getToken(VhdlParser.K_AND, 0); }
		public TerminalNode K_NAND() { return getToken(VhdlParser.K_NAND, 0); }
		public TerminalNode K_NOR() { return getToken(VhdlParser.K_NOR, 0); }
		public Logical_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterLogical_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitLogical_operator(this);
		}
	}

	public final Logical_operatorContext logical_operator() throws RecognitionException {
		Logical_operatorContext _localctx = new Logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1471);
			_la = _input.LA(1);
			if ( !(_la==K_AND || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (K_NAND - 85)) | (1L << (K_NOR - 85)) | (1L << (K_OR - 85)) | (1L << (K_XNOR - 85)) | (1L << (K_XOR - 85)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Loop_statementContext extends ParserRuleContext {
		public TerminalNode K_LOOP(int i) {
			return getToken(VhdlParser.K_LOOP, i);
		}
		public Iteration_schemeContext iteration_scheme() {
			return getRuleContext(Iteration_schemeContext.class,0);
		}
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public Sequence_of_statementsContext sequence_of_statements() {
			return getRuleContext(Sequence_of_statementsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode K_END() { return getToken(VhdlParser.K_END, 0); }
		public List<TerminalNode> K_LOOP() { return getTokens(VhdlParser.K_LOOP); }
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterLoop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitLoop_statement(this);
		}
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_loop_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1474);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1473); label_colon();
				}
			}

			setState(1477);
			_la = _input.LA(1);
			if (_la==K_FOR || _la==K_WHILE) {
				{
				setState(1476); iteration_scheme();
				}
			}

			setState(1479); match(K_LOOP);
			setState(1480); sequence_of_statements();
			setState(1481); match(K_END);
			setState(1482); match(K_LOOP);
			setState(1484);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1483); label();
				}
			}

			setState(1486); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Miscellaneous_operatorContext extends ParserRuleContext {
		public TerminalNode K_ABS() { return getToken(VhdlParser.K_ABS, 0); }
		public TerminalNode K_NOT() { return getToken(VhdlParser.K_NOT, 0); }
		public TerminalNode STAR2() { return getToken(VhdlParser.STAR2, 0); }
		public Miscellaneous_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_miscellaneous_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterMiscellaneous_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitMiscellaneous_operator(this);
		}
	}

	public final Miscellaneous_operatorContext miscellaneous_operator() throws RecognitionException {
		Miscellaneous_operatorContext _localctx = new Miscellaneous_operatorContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_miscellaneous_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1488);
			_la = _input.LA(1);
			if ( !(_la==STAR2 || _la==K_ABS || _la==K_NOT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VmodeContext extends ParserRuleContext {
		public TerminalNode K_BUFFER() { return getToken(VhdlParser.K_BUFFER, 0); }
		public TerminalNode K_LINKAGE() { return getToken(VhdlParser.K_LINKAGE, 0); }
		public TerminalNode K_INOUT() { return getToken(VhdlParser.K_INOUT, 0); }
		public TerminalNode K_IN() { return getToken(VhdlParser.K_IN, 0); }
		public TerminalNode K_OUT() { return getToken(VhdlParser.K_OUT, 0); }
		public VmodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vmode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterVmode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitVmode(this);
		}
	}

	public final VmodeContext vmode() throws RecognitionException {
		VmodeContext _localctx = new VmodeContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_vmode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1490);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (K_BUFFER - 52)) | (1L << (K_IN - 52)) | (1L << (K_INOUT - 52)) | (1L << (K_LINKAGE - 52)) | (1L << (K_OUT - 52)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiplying_operatorContext extends ParserRuleContext {
		public TerminalNode K_MOD() { return getToken(VhdlParser.K_MOD, 0); }
		public TerminalNode STAR() { return getToken(VhdlParser.STAR, 0); }
		public TerminalNode K_REM() { return getToken(VhdlParser.K_REM, 0); }
		public TerminalNode SLASH() { return getToken(VhdlParser.SLASH, 0); }
		public Multiplying_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplying_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterMultiplying_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitMultiplying_operator(this);
		}
	}

	public final Multiplying_operatorContext multiplying_operator() throws RecognitionException {
		Multiplying_operatorContext _localctx = new Multiplying_operatorContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_multiplying_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1492);
			_la = _input.LA(1);
			if ( !(_la==STAR || _la==SLASH || _la==K_MOD || _la==K_REM) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode TIC(int i) {
			return getToken(VhdlParser.TIC, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public SignatureContext signature(int i) {
			return getRuleContext(SignatureContext.class,i);
		}
		public List<AggregateContext> aggregate() {
			return getRuleContexts(AggregateContext.class);
		}
		public SuffixContext suffix(int i) {
			return getRuleContext(SuffixContext.class,i);
		}
		public List<SignatureContext> signature() {
			return getRuleContexts(SignatureContext.class);
		}
		public Actual_parameter_partContext actual_parameter_part(int i) {
			return getRuleContext(Actual_parameter_partContext.class,i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public List<Discrete_rangeContext> discrete_range() {
			return getRuleContexts(Discrete_rangeContext.class);
		}
		public Tic_attribute_designatorContext tic_attribute_designator(int i) {
			return getRuleContext(Tic_attribute_designatorContext.class,i);
		}
		public List<Tic_attribute_designatorContext> tic_attribute_designator() {
			return getRuleContexts(Tic_attribute_designatorContext.class);
		}
		public Discrete_rangeContext discrete_range(int i) {
			return getRuleContext(Discrete_rangeContext.class,i);
		}
		public List<Actual_parameter_partContext> actual_parameter_part() {
			return getRuleContexts(Actual_parameter_partContext.class);
		}
		public List<SuffixContext> suffix() {
			return getRuleContexts(SuffixContext.class);
		}
		public TerminalNode RPAREN(int i) {
			return getToken(VhdlParser.RPAREN, i);
		}
		public AggregateContext aggregate(int i) {
			return getRuleContext(AggregateContext.class,i);
		}
		public List<TerminalNode> TIC() { return getTokens(VhdlParser.TIC); }
		public Operator_symbolContext operator_symbol() {
			return getRuleContext(Operator_symbolContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(VhdlParser.LPAREN); }
		public TerminalNode COMMA(int i) {
			return getToken(VhdlParser.COMMA, i);
		}
		public TerminalNode DOT(int i) {
			return getToken(VhdlParser.DOT, i);
		}
		public TerminalNode LPAREN(int i) {
			return getToken(VhdlParser.LPAREN, i);
		}
		public List<TerminalNode> DOT() { return getTokens(VhdlParser.DOT); }
		public List<TerminalNode> COMMA() { return getTokens(VhdlParser.COMMA); }
		public List<TerminalNode> RPAREN() { return getTokens(VhdlParser.RPAREN); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_name);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1496);
			switch (_input.LA(1)) {
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
				{
				setState(1494); simple_name();
				}
				break;
			case STRING_LITERAL:
				{
				setState(1495); operator_symbol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1529);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1525);
					switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
					case 1:
						{
						setState(1498); match(DOT);
						setState(1499); suffix();
						}
						break;

					case 2:
						{
						setState(1500); match(TIC);
						setState(1501); aggregate();
						}
						break;

					case 3:
						{
						setState(1503);
						_la = _input.LA(1);
						if (_la==LBRACK) {
							{
							setState(1502); signature();
							}
						}

						setState(1505); tic_attribute_designator();
						}
						break;

					case 4:
						{
						setState(1506); match(LPAREN);
						setState(1507); expression();
						setState(1512);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1508); match(COMMA);
							setState(1509); expression();
							}
							}
							setState(1514);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1515); match(RPAREN);
						}
						break;

					case 5:
						{
						setState(1517); match(LPAREN);
						setState(1518); actual_parameter_part();
						setState(1519); match(RPAREN);
						}
						break;

					case 6:
						{
						setState(1521); match(LPAREN);
						setState(1522); discrete_range();
						setState(1523); match(RPAREN);
						}
						break;
					}
					}
					} 
				}
				setState(1531);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Next_statementContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public TerminalNode K_NEXT() { return getToken(VhdlParser.K_NEXT, 0); }
		public TerminalNode K_WHEN() { return getToken(VhdlParser.K_WHEN, 0); }
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Next_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterNext_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitNext_statement(this);
		}
	}

	public final Next_statementContext next_statement() throws RecognitionException {
		Next_statementContext _localctx = new Next_statementContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_next_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1533);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1532); label_colon();
				}
			}

			setState(1535); match(K_NEXT);
			setState(1537);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1536); label();
				}
			}

			setState(1541);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(1539); match(K_WHEN);
				setState(1540); condition();
				}
			}

			setState(1543); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_statementContext extends ParserRuleContext {
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public TerminalNode K_NULL() { return getToken(VhdlParser.K_NULL, 0); }
		public Null_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterNull_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitNull_statement(this);
		}
	}

	public final Null_statementContext null_statement() throws RecognitionException {
		Null_statementContext _localctx = new Null_statementContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_null_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1546);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1545); label_colon();
				}
			}

			setState(1548); match(K_NULL);
			setState(1549); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numeric_literalContext extends ParserRuleContext {
		public Abstract_literalContext abstract_literal() {
			return getRuleContext(Abstract_literalContext.class,0);
		}
		public Physical_literalContext physical_literal() {
			return getRuleContext(Physical_literalContext.class,0);
		}
		public Numeric_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterNumeric_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitNumeric_literal(this);
		}
	}

	public final Numeric_literalContext numeric_literal() throws RecognitionException {
		Numeric_literalContext _localctx = new Numeric_literalContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_numeric_literal);
		try {
			setState(1553);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1551); abstract_literal();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1552); physical_literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Object_declarationContext extends ParserRuleContext {
		public Signal_declarationContext signal_declaration() {
			return getRuleContext(Signal_declarationContext.class,0);
		}
		public File_declarationContext file_declaration() {
			return getRuleContext(File_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Object_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterObject_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitObject_declaration(this);
		}
	}

	public final Object_declarationContext object_declaration() throws RecognitionException {
		Object_declarationContext _localctx = new Object_declarationContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_object_declaration);
		try {
			setState(1559);
			switch (_input.LA(1)) {
			case K_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1555); constant_declaration();
				}
				break;
			case K_SIGNAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1556); signal_declaration();
				}
				break;
			case K_SHARED:
			case K_VARIABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1557); variable_declaration();
				}
				break;
			case K_FILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1558); file_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operator_symbolContext extends ParserRuleContext {
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Operator_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterOperator_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitOperator_symbol(this);
		}
	}

	public final Operator_symbolContext operator_symbol() throws RecognitionException {
		Operator_symbolContext _localctx = new Operator_symbolContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_operator_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1561); string_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_bodyContext extends ParserRuleContext {
		public Simple_nameContext simple_name(int i) {
			return getRuleContext(Simple_nameContext.class,i);
		}
		public List<Simple_nameContext> simple_name() {
			return getRuleContexts(Simple_nameContext.class);
		}
		public List<TerminalNode> K_BODY() { return getTokens(VhdlParser.K_BODY); }
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public TerminalNode K_END() { return getToken(VhdlParser.K_END, 0); }
		public TerminalNode K_PACKAGE(int i) {
			return getToken(VhdlParser.K_PACKAGE, i);
		}
		public Package_body_declarative_partContext package_body_declarative_part() {
			return getRuleContext(Package_body_declarative_partContext.class,0);
		}
		public TerminalNode K_BODY(int i) {
			return getToken(VhdlParser.K_BODY, i);
		}
		public List<TerminalNode> K_PACKAGE() { return getTokens(VhdlParser.K_PACKAGE); }
		public TerminalNode K_IS() { return getToken(VhdlParser.K_IS, 0); }
		public Package_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterPackage_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitPackage_body(this);
		}
	}

	public final Package_bodyContext package_body() throws RecognitionException {
		Package_bodyContext _localctx = new Package_bodyContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_package_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1563); match(K_PACKAGE);
			setState(1564); match(K_BODY);
			setState(1565); simple_name();
			setState(1566); match(K_IS);
			setState(1567); package_body_declarative_part();
			setState(1568); match(K_END);
			setState(1571);
			_la = _input.LA(1);
			if (_la==K_PACKAGE) {
				{
				setState(1569); match(K_PACKAGE);
				setState(1570); match(K_BODY);
				}
			}

			setState(1574);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1573); simple_name();
				}
			}

			setState(1576); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_body_declarative_itemContext extends ParserRuleContext {
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public Group_template_declarationContext group_template_declaration() {
			return getRuleContext(Group_template_declarationContext.class,0);
		}
		public File_declarationContext file_declaration() {
			return getRuleContext(File_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Subprogram_bodyContext subprogram_body() {
			return getRuleContext(Subprogram_bodyContext.class,0);
		}
		public Subtype_declarationContext subtype_declaration() {
			return getRuleContext(Subtype_declarationContext.class,0);
		}
		public Group_declarationContext group_declaration() {
			return getRuleContext(Group_declarationContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Use_clauseContext use_clause() {
			return getRuleContext(Use_clauseContext.class,0);
		}
		public Subprogram_declarationContext subprogram_declaration() {
			return getRuleContext(Subprogram_declarationContext.class,0);
		}
		public Alias_declarationContext alias_declaration() {
			return getRuleContext(Alias_declarationContext.class,0);
		}
		public Package_body_declarative_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body_declarative_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterPackage_body_declarative_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitPackage_body_declarative_item(this);
		}
	}

	public final Package_body_declarative_itemContext package_body_declarative_item() throws RecognitionException {
		Package_body_declarative_itemContext _localctx = new Package_body_declarative_itemContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_package_body_declarative_item);
		try {
			setState(1589);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1578); subprogram_declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1579); subprogram_body();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1580); type_declaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1581); subtype_declaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1582); constant_declaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1583); variable_declaration();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1584); file_declaration();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1585); alias_declaration();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1586); use_clause();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1587); group_declaration();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1588); group_template_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_body_declarative_partContext extends ParserRuleContext {
		public List<Package_body_declarative_itemContext> package_body_declarative_item() {
			return getRuleContexts(Package_body_declarative_itemContext.class);
		}
		public Package_body_declarative_itemContext package_body_declarative_item(int i) {
			return getRuleContext(Package_body_declarative_itemContext.class,i);
		}
		public Package_body_declarative_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body_declarative_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterPackage_body_declarative_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitPackage_body_declarative_part(this);
		}
	}

	public final Package_body_declarative_partContext package_body_declarative_part() throws RecognitionException {
		Package_body_declarative_partContext _localctx = new Package_body_declarative_partContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_package_body_declarative_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (K_ALIAS - 42)) | (1L << (K_CONSTANT - 42)) | (1L << (K_FILE - 42)) | (1L << (K_FUNCTION - 42)) | (1L << (K_GROUP - 42)) | (1L << (K_IMPURE - 42)) | (1L << (K_PROCEDURE - 42)) | (1L << (K_PURE - 42)))) != 0) || ((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (K_SHARED - 115)) | (1L << (K_SUBTYPE - 115)) | (1L << (K_TYPE - 115)) | (1L << (K_USE - 115)) | (1L << (K_VARIABLE - 115)))) != 0)) {
				{
				{
				setState(1591); package_body_declarative_item();
				}
				}
				setState(1596);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_declarationContext extends ParserRuleContext {
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public TerminalNode K_END() { return getToken(VhdlParser.K_END, 0); }
		public TerminalNode K_PACKAGE(int i) {
			return getToken(VhdlParser.K_PACKAGE, i);
		}
		public Package_declarative_partContext package_declarative_part() {
			return getRuleContext(Package_declarative_partContext.class,0);
		}
		public List<TerminalNode> K_PACKAGE() { return getTokens(VhdlParser.K_PACKAGE); }
		public TerminalNode K_IS() { return getToken(VhdlParser.K_IS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Package_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterPackage_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitPackage_declaration(this);
		}
	}

	public final Package_declarationContext package_declaration() throws RecognitionException {
		Package_declarationContext _localctx = new Package_declarationContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_package_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1597); match(K_PACKAGE);
			setState(1598); identifier();
			setState(1599); match(K_IS);
			setState(1600); package_declarative_part();
			setState(1601); match(K_END);
			setState(1603);
			_la = _input.LA(1);
			if (_la==K_PACKAGE) {
				{
				setState(1602); match(K_PACKAGE);
				}
			}

			setState(1606);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1605); simple_name();
				}
			}

			setState(1608); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_declarative_itemContext extends ParserRuleContext {
		public Group_template_declarationContext group_template_declaration() {
			return getRuleContext(Group_template_declarationContext.class,0);
		}
		public Signal_declarationContext signal_declaration() {
			return getRuleContext(Signal_declarationContext.class,0);
		}
		public Use_clauseContext use_clause() {
			return getRuleContext(Use_clauseContext.class,0);
		}
		public Subprogram_declarationContext subprogram_declaration() {
			return getRuleContext(Subprogram_declarationContext.class,0);
		}
		public Attribute_specificationContext attribute_specification() {
			return getRuleContext(Attribute_specificationContext.class,0);
		}
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public File_declarationContext file_declaration() {
			return getRuleContext(File_declarationContext.class,0);
		}
		public Component_declarationContext component_declaration() {
			return getRuleContext(Component_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Subtype_declarationContext subtype_declaration() {
			return getRuleContext(Subtype_declarationContext.class,0);
		}
		public Group_declarationContext group_declaration() {
			return getRuleContext(Group_declarationContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Attribute_declarationContext attribute_declaration() {
			return getRuleContext(Attribute_declarationContext.class,0);
		}
		public Alias_declarationContext alias_declaration() {
			return getRuleContext(Alias_declarationContext.class,0);
		}
		public Disconnection_specificationContext disconnection_specification() {
			return getRuleContext(Disconnection_specificationContext.class,0);
		}
		public Package_declarative_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_declarative_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterPackage_declarative_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitPackage_declarative_item(this);
		}
	}

	public final Package_declarative_itemContext package_declarative_item() throws RecognitionException {
		Package_declarative_itemContext _localctx = new Package_declarative_itemContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_package_declarative_item);
		try {
			setState(1625);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1610); subprogram_declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1611); type_declaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1612); subtype_declaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1613); constant_declaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1614); signal_declaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1615); variable_declaration();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1616); file_declaration();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1617); alias_declaration();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1618); component_declaration();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1619); attribute_specification();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1620); attribute_declaration();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1621); disconnection_specification();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1622); use_clause();
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1623); group_declaration();
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1624); group_template_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_declarative_partContext extends ParserRuleContext {
		public Package_declarative_itemContext package_declarative_item(int i) {
			return getRuleContext(Package_declarative_itemContext.class,i);
		}
		public List<Package_declarative_itemContext> package_declarative_item() {
			return getRuleContexts(Package_declarative_itemContext.class);
		}
		public Package_declarative_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_declarative_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterPackage_declarative_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitPackage_declarative_part(this);
		}
	}

	public final Package_declarative_partContext package_declarative_part() throws RecognitionException {
		Package_declarative_partContext _localctx = new Package_declarative_partContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_package_declarative_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (K_ALIAS - 42)) | (1L << (K_ATTRIBUTE - 42)) | (1L << (K_COMPONENT - 42)) | (1L << (K_CONSTANT - 42)) | (1L << (K_DISCONNECT - 42)) | (1L << (K_FILE - 42)) | (1L << (K_FUNCTION - 42)) | (1L << (K_GROUP - 42)) | (1L << (K_IMPURE - 42)) | (1L << (K_PROCEDURE - 42)) | (1L << (K_PURE - 42)))) != 0) || ((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (K_SHARED - 115)) | (1L << (K_SIGNAL - 115)) | (1L << (K_SUBTYPE - 115)) | (1L << (K_TYPE - 115)) | (1L << (K_USE - 115)) | (1L << (K_VARIABLE - 115)))) != 0)) {
				{
				{
				setState(1627); package_declarative_item();
				}
				}
				setState(1632);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_specificationContext extends ParserRuleContext {
		public Discrete_rangeContext discrete_range() {
			return getRuleContext(Discrete_rangeContext.class,0);
		}
		public TerminalNode K_IN() { return getToken(VhdlParser.K_IN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Parameter_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterParameter_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitParameter_specification(this);
		}
	}

	public final Parameter_specificationContext parameter_specification() throws RecognitionException {
		Parameter_specificationContext _localctx = new Parameter_specificationContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_parameter_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1633); identifier();
			setState(1634); match(K_IN);
			setState(1635); discrete_range();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Physical_literalContext extends ParserRuleContext {
		public Abstract_literalContext abstract_literal() {
			return getRuleContext(Abstract_literalContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Physical_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_physical_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterPhysical_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitPhysical_literal(this);
		}
	}

	public final Physical_literalContext physical_literal() throws RecognitionException {
		Physical_literalContext _localctx = new Physical_literalContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_physical_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1638);
			_la = _input.LA(1);
			if (_la==DECIMAL_LITERAL || _la==BASED_LITERAL) {
				{
				setState(1637); abstract_literal();
				}
			}

			setState(1640); name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Physical_type_definitionContext extends ParserRuleContext {
		public TerminalNode K_UNITS(int i) {
			return getToken(VhdlParser.K_UNITS, i);
		}
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public Range_constraintContext range_constraint() {
			return getRuleContext(Range_constraintContext.class,0);
		}
		public Secondary_unit_declarationContext secondary_unit_declaration() {
			return getRuleContext(Secondary_unit_declarationContext.class,0);
		}
		public TerminalNode K_END() { return getToken(VhdlParser.K_END, 0); }
		public List<TerminalNode> K_UNITS() { return getTokens(VhdlParser.K_UNITS); }
		public Base_unit_declarationContext base_unit_declaration() {
			return getRuleContext(Base_unit_declarationContext.class,0);
		}
		public Physical_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_physical_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterPhysical_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitPhysical_type_definition(this);
		}
	}

	public final Physical_type_definitionContext physical_type_definition() throws RecognitionException {
		Physical_type_definitionContext _localctx = new Physical_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_physical_type_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1642); range_constraint();
			setState(1643); match(K_UNITS);
			setState(1644); base_unit_declaration();
			setState(1646);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1645); secondary_unit_declaration();
				}
			}

			setState(1648); match(K_END);
			setState(1649); match(K_UNITS);
			setState(1651);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1650); simple_name();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Port_clauseContext extends ParserRuleContext {
		public Port_listContext port_list() {
			return getRuleContext(Port_listContext.class,0);
		}
		public TerminalNode K_PORT() { return getToken(VhdlParser.K_PORT, 0); }
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public TerminalNode RPAREN() { return getToken(VhdlParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(VhdlParser.LPAREN, 0); }
		public Port_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterPort_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitPort_clause(this);
		}
	}

	public final Port_clauseContext port_clause() throws RecognitionException {
		Port_clauseContext _localctx = new Port_clauseContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_port_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1653); match(K_PORT);
			setState(1654); match(LPAREN);
			setState(1655); port_list();
			setState(1656); match(RPAREN);
			setState(1657); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Port_listContext extends ParserRuleContext {
		public Interface_listContext interface_list() {
			return getRuleContext(Interface_listContext.class,0);
		}
		public Port_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterPort_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitPort_list(this);
		}
	}

	public final Port_listContext port_list() throws RecognitionException {
		Port_listContext _localctx = new Port_listContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_port_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1659); interface_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Port_map_aspectContext extends ParserRuleContext {
		public Association_listContext association_list() {
			return getRuleContext(Association_listContext.class,0);
		}
		public TerminalNode K_PORT() { return getToken(VhdlParser.K_PORT, 0); }
		public TerminalNode RPAREN() { return getToken(VhdlParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(VhdlParser.LPAREN, 0); }
		public TerminalNode K_MAP() { return getToken(VhdlParser.K_MAP, 0); }
		public Port_map_aspectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port_map_aspect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterPort_map_aspect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitPort_map_aspect(this);
		}
	}

	public final Port_map_aspectContext port_map_aspect() throws RecognitionException {
		Port_map_aspectContext _localctx = new Port_map_aspectContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_port_map_aspect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1661); match(K_PORT);
			setState(1662); match(K_MAP);
			setState(1663); match(LPAREN);
			setState(1664); association_list();
			setState(1665); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public AllocatorContext allocator() {
			return getRuleContext(AllocatorContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VhdlParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VhdlParser.LPAREN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Tic_attribute_designatorContext tic_attribute_designator() {
			return getRuleContext(Tic_attribute_designatorContext.class,0);
		}
		public Qualified_expressionContext qualified_expression() {
			return getRuleContext(Qualified_expressionContext.class,0);
		}
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_primary);
		int _la;
		try {
			setState(1681);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1667); name();
				setState(1669);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(1668); signature();
					}
				}

				setState(1671); tic_attribute_designator();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1673); qualified_expression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1674); match(LPAREN);
				setState(1675); expression();
				setState(1676); match(RPAREN);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1678); literal();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1679); allocator();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1680); aggregate();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_unitContext extends ParserRuleContext {
		public Entity_declarationContext entity_declaration() {
			return getRuleContext(Entity_declarationContext.class,0);
		}
		public Configuration_declarationContext configuration_declaration() {
			return getRuleContext(Configuration_declarationContext.class,0);
		}
		public Package_declarationContext package_declaration() {
			return getRuleContext(Package_declarationContext.class,0);
		}
		public Primary_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterPrimary_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitPrimary_unit(this);
		}
	}

	public final Primary_unitContext primary_unit() throws RecognitionException {
		Primary_unitContext _localctx = new Primary_unitContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_primary_unit);
		try {
			setState(1686);
			switch (_input.LA(1)) {
			case K_ENTITY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1683); entity_declaration();
				}
				break;
			case K_CONFIGURATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1684); configuration_declaration();
				}
				break;
			case K_PACKAGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1685); package_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Procedure_callContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(VhdlParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(VhdlParser.LPAREN, 0); }
		public Actual_parameter_partContext actual_parameter_part() {
			return getRuleContext(Actual_parameter_partContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Procedure_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterProcedure_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitProcedure_call(this);
		}
	}

	public final Procedure_callContext procedure_call() throws RecognitionException {
		Procedure_callContext _localctx = new Procedure_callContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_procedure_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1688); name();
			setState(1693);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1689); match(LPAREN);
				setState(1690); actual_parameter_part();
				setState(1691); match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Procedure_call_statementContext extends ParserRuleContext {
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public Procedure_callContext procedure_call() {
			return getRuleContext(Procedure_callContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public Procedure_call_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_call_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterProcedure_call_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitProcedure_call_statement(this);
		}
	}

	public final Procedure_call_statementContext procedure_call_statement() throws RecognitionException {
		Procedure_call_statementContext _localctx = new Procedure_call_statementContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_procedure_call_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1696);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1695); label_colon();
				}
				break;
			}
			setState(1698); procedure_call();
			setState(1699); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Process_declarative_itemContext extends ParserRuleContext {
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public Group_template_declarationContext group_template_declaration() {
			return getRuleContext(Group_template_declarationContext.class,0);
		}
		public File_declarationContext file_declaration() {
			return getRuleContext(File_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Subprogram_bodyContext subprogram_body() {
			return getRuleContext(Subprogram_bodyContext.class,0);
		}
		public Subtype_declarationContext subtype_declaration() {
			return getRuleContext(Subtype_declarationContext.class,0);
		}
		public Group_declarationContext group_declaration() {
			return getRuleContext(Group_declarationContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Use_clauseContext use_clause() {
			return getRuleContext(Use_clauseContext.class,0);
		}
		public Attribute_declarationContext attribute_declaration() {
			return getRuleContext(Attribute_declarationContext.class,0);
		}
		public Attribute_specificationContext attribute_specification() {
			return getRuleContext(Attribute_specificationContext.class,0);
		}
		public Subprogram_declarationContext subprogram_declaration() {
			return getRuleContext(Subprogram_declarationContext.class,0);
		}
		public Alias_declarationContext alias_declaration() {
			return getRuleContext(Alias_declarationContext.class,0);
		}
		public Process_declarative_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process_declarative_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterProcess_declarative_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitProcess_declarative_item(this);
		}
	}

	public final Process_declarative_itemContext process_declarative_item() throws RecognitionException {
		Process_declarative_itemContext _localctx = new Process_declarative_itemContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_process_declarative_item);
		try {
			setState(1714);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1701); subprogram_declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1702); subprogram_body();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1703); type_declaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1704); subtype_declaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1705); constant_declaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1706); variable_declaration();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1707); file_declaration();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1708); alias_declaration();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1709); attribute_specification();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1710); attribute_declaration();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1711); use_clause();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1712); group_declaration();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1713); group_template_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Process_declarative_partContext extends ParserRuleContext {
		public List<Process_declarative_itemContext> process_declarative_item() {
			return getRuleContexts(Process_declarative_itemContext.class);
		}
		public Process_declarative_itemContext process_declarative_item(int i) {
			return getRuleContext(Process_declarative_itemContext.class,i);
		}
		public Process_declarative_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process_declarative_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterProcess_declarative_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitProcess_declarative_part(this);
		}
	}

	public final Process_declarative_partContext process_declarative_part() throws RecognitionException {
		Process_declarative_partContext _localctx = new Process_declarative_partContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_process_declarative_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (K_ALIAS - 42)) | (1L << (K_ATTRIBUTE - 42)) | (1L << (K_CONSTANT - 42)) | (1L << (K_FILE - 42)) | (1L << (K_FUNCTION - 42)) | (1L << (K_GROUP - 42)) | (1L << (K_IMPURE - 42)) | (1L << (K_PROCEDURE - 42)) | (1L << (K_PURE - 42)))) != 0) || ((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (K_SHARED - 115)) | (1L << (K_SUBTYPE - 115)) | (1L << (K_TYPE - 115)) | (1L << (K_USE - 115)) | (1L << (K_VARIABLE - 115)))) != 0)) {
				{
				{
				setState(1716); process_declarative_item();
				}
				}
				setState(1721);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Process_statementContext extends ParserRuleContext {
		public List<TerminalNode> K_PROCESS() { return getTokens(VhdlParser.K_PROCESS); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Process_statement_partContext process_statement_part() {
			return getRuleContext(Process_statement_partContext.class,0);
		}
		public TerminalNode K_END() { return getToken(VhdlParser.K_END, 0); }
		public TerminalNode LPAREN() { return getToken(VhdlParser.LPAREN, 0); }
		public TerminalNode K_IS() { return getToken(VhdlParser.K_IS, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public List<TerminalNode> K_POSTPONED() { return getTokens(VhdlParser.K_POSTPONED); }
		public TerminalNode K_PROCESS(int i) {
			return getToken(VhdlParser.K_PROCESS, i);
		}
		public TerminalNode K_BEGIN() { return getToken(VhdlParser.K_BEGIN, 0); }
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public TerminalNode K_POSTPONED(int i) {
			return getToken(VhdlParser.K_POSTPONED, i);
		}
		public TerminalNode RPAREN() { return getToken(VhdlParser.RPAREN, 0); }
		public Sensitivity_listContext sensitivity_list() {
			return getRuleContext(Sensitivity_listContext.class,0);
		}
		public Process_declarative_partContext process_declarative_part() {
			return getRuleContext(Process_declarative_partContext.class,0);
		}
		public Process_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterProcess_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitProcess_statement(this);
		}
	}

	public final Process_statementContext process_statement() throws RecognitionException {
		Process_statementContext _localctx = new Process_statementContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_process_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1723);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1722); label_colon();
				}
			}

			setState(1726);
			_la = _input.LA(1);
			if (_la==K_POSTPONED) {
				{
				setState(1725); match(K_POSTPONED);
				}
			}

			setState(1728); match(K_PROCESS);
			setState(1733);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1729); match(LPAREN);
				setState(1730); sensitivity_list();
				setState(1731); match(RPAREN);
				}
			}

			setState(1736);
			_la = _input.LA(1);
			if (_la==K_IS) {
				{
				setState(1735); match(K_IS);
				}
			}

			setState(1738); process_declarative_part();
			setState(1739); match(K_BEGIN);
			setState(1740); process_statement_part();
			setState(1741); match(K_END);
			setState(1743);
			_la = _input.LA(1);
			if (_la==K_POSTPONED) {
				{
				setState(1742); match(K_POSTPONED);
				}
			}

			setState(1745); match(K_PROCESS);
			setState(1747);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1746); label();
				}
			}

			setState(1749); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Process_statement_partContext extends ParserRuleContext {
		public List<Sequential_statementContext> sequential_statement() {
			return getRuleContexts(Sequential_statementContext.class);
		}
		public Sequential_statementContext sequential_statement(int i) {
			return getRuleContext(Sequential_statementContext.class,i);
		}
		public Process_statement_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process_statement_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterProcess_statement_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitProcess_statement_part(this);
		}
	}

	public final Process_statement_partContext process_statement_part() throws RecognitionException {
		Process_statement_partContext _localctx = new Process_statement_partContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_process_statement_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << K_ASSERT) | (1L << K_CASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_EXIT - 64)) | (1L << (K_FOR - 64)) | (1L << (K_IF - 64)) | (1L << (K_LOOP - 64)) | (1L << (K_NEXT - 64)) | (1L << (K_NULL - 64)) | (1L << (K_REPORT - 64)) | (1L << (K_RETURN - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (K_WAIT - 131)) | (1L << (K_WHILE - 131)) | (1L << (BASIC_IDENTIFIER - 131)) | (1L << (EXTENDED_IDENTIFIER - 131)) | (1L << (STRING_LITERAL - 131)))) != 0)) {
				{
				{
				setState(1751); sequential_statement();
				}
				}
				setState(1756);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protected_type_bodyContext extends ParserRuleContext {
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public List<TerminalNode> K_BODY() { return getTokens(VhdlParser.K_BODY); }
		public TerminalNode K_END() { return getToken(VhdlParser.K_END, 0); }
		public List<TerminalNode> K_PROTECTED() { return getTokens(VhdlParser.K_PROTECTED); }
		public TerminalNode K_BODY(int i) {
			return getToken(VhdlParser.K_BODY, i);
		}
		public TerminalNode K_PROTECTED(int i) {
			return getToken(VhdlParser.K_PROTECTED, i);
		}
		public Protected_type_body_declarative_partContext protected_type_body_declarative_part() {
			return getRuleContext(Protected_type_body_declarative_partContext.class,0);
		}
		public Protected_type_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protected_type_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterProtected_type_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitProtected_type_body(this);
		}
	}

	public final Protected_type_bodyContext protected_type_body() throws RecognitionException {
		Protected_type_bodyContext _localctx = new Protected_type_bodyContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_protected_type_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1757); match(K_PROTECTED);
			setState(1758); match(K_BODY);
			setState(1759); protected_type_body_declarative_part();
			setState(1760); match(K_END);
			setState(1761); match(K_PROTECTED);
			setState(1762); match(K_BODY);
			setState(1764);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1763); simple_name();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protected_type_body_declarative_itemContext extends ParserRuleContext {
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public Group_template_declarationContext group_template_declaration() {
			return getRuleContext(Group_template_declarationContext.class,0);
		}
		public File_declarationContext file_declaration() {
			return getRuleContext(File_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Subprogram_bodyContext subprogram_body() {
			return getRuleContext(Subprogram_bodyContext.class,0);
		}
		public Subtype_declarationContext subtype_declaration() {
			return getRuleContext(Subtype_declarationContext.class,0);
		}
		public Group_declarationContext group_declaration() {
			return getRuleContext(Group_declarationContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Use_clauseContext use_clause() {
			return getRuleContext(Use_clauseContext.class,0);
		}
		public Attribute_declarationContext attribute_declaration() {
			return getRuleContext(Attribute_declarationContext.class,0);
		}
		public Attribute_specificationContext attribute_specification() {
			return getRuleContext(Attribute_specificationContext.class,0);
		}
		public Subprogram_declarationContext subprogram_declaration() {
			return getRuleContext(Subprogram_declarationContext.class,0);
		}
		public Alias_declarationContext alias_declaration() {
			return getRuleContext(Alias_declarationContext.class,0);
		}
		public Protected_type_body_declarative_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protected_type_body_declarative_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterProtected_type_body_declarative_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitProtected_type_body_declarative_item(this);
		}
	}

	public final Protected_type_body_declarative_itemContext protected_type_body_declarative_item() throws RecognitionException {
		Protected_type_body_declarative_itemContext _localctx = new Protected_type_body_declarative_itemContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_protected_type_body_declarative_item);
		try {
			setState(1779);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1766); subprogram_declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1767); subprogram_body();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1768); type_declaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1769); subtype_declaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1770); constant_declaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1771); variable_declaration();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1772); file_declaration();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1773); alias_declaration();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1774); attribute_specification();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1775); attribute_declaration();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1776); use_clause();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1777); group_declaration();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1778); group_template_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protected_type_body_declarative_partContext extends ParserRuleContext {
		public Protected_type_body_declarative_itemContext protected_type_body_declarative_item(int i) {
			return getRuleContext(Protected_type_body_declarative_itemContext.class,i);
		}
		public List<Protected_type_body_declarative_itemContext> protected_type_body_declarative_item() {
			return getRuleContexts(Protected_type_body_declarative_itemContext.class);
		}
		public Protected_type_body_declarative_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protected_type_body_declarative_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterProtected_type_body_declarative_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitProtected_type_body_declarative_part(this);
		}
	}

	public final Protected_type_body_declarative_partContext protected_type_body_declarative_part() throws RecognitionException {
		Protected_type_body_declarative_partContext _localctx = new Protected_type_body_declarative_partContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_protected_type_body_declarative_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (K_ALIAS - 42)) | (1L << (K_ATTRIBUTE - 42)) | (1L << (K_CONSTANT - 42)) | (1L << (K_FILE - 42)) | (1L << (K_FUNCTION - 42)) | (1L << (K_GROUP - 42)) | (1L << (K_IMPURE - 42)) | (1L << (K_PROCEDURE - 42)) | (1L << (K_PURE - 42)))) != 0) || ((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (K_SHARED - 115)) | (1L << (K_SUBTYPE - 115)) | (1L << (K_TYPE - 115)) | (1L << (K_USE - 115)) | (1L << (K_VARIABLE - 115)))) != 0)) {
				{
				{
				setState(1781); protected_type_body_declarative_item();
				}
				}
				setState(1786);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protected_type_declarationContext extends ParserRuleContext {
		public Protected_type_declarative_partContext protected_type_declarative_part() {
			return getRuleContext(Protected_type_declarative_partContext.class,0);
		}
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public TerminalNode K_END() { return getToken(VhdlParser.K_END, 0); }
		public List<TerminalNode> K_PROTECTED() { return getTokens(VhdlParser.K_PROTECTED); }
		public TerminalNode K_PROTECTED(int i) {
			return getToken(VhdlParser.K_PROTECTED, i);
		}
		public Protected_type_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protected_type_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterProtected_type_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitProtected_type_declaration(this);
		}
	}

	public final Protected_type_declarationContext protected_type_declaration() throws RecognitionException {
		Protected_type_declarationContext _localctx = new Protected_type_declarationContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_protected_type_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1787); match(K_PROTECTED);
			setState(1788); protected_type_declarative_part();
			setState(1789); match(K_END);
			setState(1790); match(K_PROTECTED);
			setState(1792);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1791); simple_name();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protected_type_declarative_itemContext extends ParserRuleContext {
		public Subprogram_specificationContext subprogram_specification() {
			return getRuleContext(Subprogram_specificationContext.class,0);
		}
		public Use_clauseContext use_clause() {
			return getRuleContext(Use_clauseContext.class,0);
		}
		public Attribute_specificationContext attribute_specification() {
			return getRuleContext(Attribute_specificationContext.class,0);
		}
		public Protected_type_declarative_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protected_type_declarative_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterProtected_type_declarative_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitProtected_type_declarative_item(this);
		}
	}

	public final Protected_type_declarative_itemContext protected_type_declarative_item() throws RecognitionException {
		Protected_type_declarative_itemContext _localctx = new Protected_type_declarative_itemContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_protected_type_declarative_item);
		try {
			setState(1797);
			switch (_input.LA(1)) {
			case K_FUNCTION:
			case K_IMPURE:
			case K_PROCEDURE:
			case K_PURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1794); subprogram_specification();
				}
				break;
			case K_ATTRIBUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1795); attribute_specification();
				}
				break;
			case K_USE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1796); use_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protected_type_declarative_partContext extends ParserRuleContext {
		public Protected_type_declarative_itemContext protected_type_declarative_item(int i) {
			return getRuleContext(Protected_type_declarative_itemContext.class,i);
		}
		public List<Protected_type_declarative_itemContext> protected_type_declarative_item() {
			return getRuleContexts(Protected_type_declarative_itemContext.class);
		}
		public Protected_type_declarative_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protected_type_declarative_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterProtected_type_declarative_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitProtected_type_declarative_part(this);
		}
	}

	public final Protected_type_declarative_partContext protected_type_declarative_part() throws RecognitionException {
		Protected_type_declarative_partContext _localctx = new Protected_type_declarative_partContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_protected_type_declarative_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_ATTRIBUTE || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (K_FUNCTION - 67)) | (1L << (K_IMPURE - 67)) | (1L << (K_PROCEDURE - 67)) | (1L << (K_PURE - 67)) | (1L << (K_USE - 67)))) != 0)) {
				{
				{
				setState(1799); protected_type_declarative_item();
				}
				}
				setState(1804);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protected_type_definitionContext extends ParserRuleContext {
		public Protected_type_declarationContext protected_type_declaration() {
			return getRuleContext(Protected_type_declarationContext.class,0);
		}
		public Protected_type_bodyContext protected_type_body() {
			return getRuleContext(Protected_type_bodyContext.class,0);
		}
		public Protected_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protected_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterProtected_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitProtected_type_definition(this);
		}
	}

	public final Protected_type_definitionContext protected_type_definition() throws RecognitionException {
		Protected_type_definitionContext _localctx = new Protected_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_protected_type_definition);
		try {
			setState(1807);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1805); protected_type_declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1806); protected_type_body();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_expressionContext extends ParserRuleContext {
		public TerminalNode TIC() { return getToken(VhdlParser.TIC, 0); }
		public TerminalNode RPAREN() { return getToken(VhdlParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VhdlParser.LPAREN, 0); }
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Qualified_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterQualified_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitQualified_expression(this);
		}
	}

	public final Qualified_expressionContext qualified_expression() throws RecognitionException {
		Qualified_expressionContext _localctx = new Qualified_expressionContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_qualified_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1809); name();
			setState(1810); match(TIC);
			setState(1816);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1811); aggregate();
				}
				break;

			case 2:
				{
				setState(1812); match(LPAREN);
				setState(1813); expression();
				setState(1814); match(RPAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeContext extends ParserRuleContext {
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitRange(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_range);
		try {
			setState(1823);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1818); simple_expression();
				setState(1819); direction();
				setState(1820); simple_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1822); name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Range_constraintContext extends ParserRuleContext {
		public TerminalNode K_RANGE() { return getToken(VhdlParser.K_RANGE, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public Range_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterRange_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitRange_constraint(this);
		}
	}

	public final Range_constraintContext range_constraint() throws RecognitionException {
		Range_constraintContext _localctx = new Range_constraintContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_range_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1825); match(K_RANGE);
			setState(1826); range();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Record_type_definitionContext extends ParserRuleContext {
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public Element_declarationContext element_declaration(int i) {
			return getRuleContext(Element_declarationContext.class,i);
		}
		public List<Element_declarationContext> element_declaration() {
			return getRuleContexts(Element_declarationContext.class);
		}
		public List<TerminalNode> K_RECORD() { return getTokens(VhdlParser.K_RECORD); }
		public TerminalNode K_END() { return getToken(VhdlParser.K_END, 0); }
		public TerminalNode K_RECORD(int i) {
			return getToken(VhdlParser.K_RECORD, i);
		}
		public Record_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterRecord_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitRecord_type_definition(this);
		}
	}

	public final Record_type_definitionContext record_type_definition() throws RecognitionException {
		Record_type_definitionContext _localctx = new Record_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_record_type_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1828); match(K_RECORD);
			setState(1830); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1829); element_declaration();
				}
				}
				setState(1832); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER );
			setState(1834); match(K_END);
			setState(1835); match(K_RECORD);
			setState(1837);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1836); simple_name();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public List<Shift_expressionContext> shift_expression() {
			return getRuleContexts(Shift_expressionContext.class);
		}
		public Shift_expressionContext shift_expression(int i) {
			return getRuleContext(Shift_expressionContext.class,i);
		}
		public Relational_operatorContext relational_operator() {
			return getRuleContext(Relational_operatorContext.class,0);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitRelation(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1839); shift_expression();
			setState(1843);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SLASHEQ) | (1L << LST) | (1L << LSTEQ) | (1L << EQ) | (1L << GRT) | (1L << GRTEQ))) != 0)) {
				{
				setState(1840); relational_operator();
				setState(1841); shift_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relational_operatorContext extends ParserRuleContext {
		public TerminalNode GRTEQ() { return getToken(VhdlParser.GRTEQ, 0); }
		public TerminalNode SLASHEQ() { return getToken(VhdlParser.SLASHEQ, 0); }
		public TerminalNode LSTEQ() { return getToken(VhdlParser.LSTEQ, 0); }
		public TerminalNode LST() { return getToken(VhdlParser.LST, 0); }
		public TerminalNode GRT() { return getToken(VhdlParser.GRT, 0); }
		public TerminalNode EQ() { return getToken(VhdlParser.EQ, 0); }
		public Relational_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterRelational_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitRelational_operator(this);
		}
	}

	public final Relational_operatorContext relational_operator() throws RecognitionException {
		Relational_operatorContext _localctx = new Relational_operatorContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_relational_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1845);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SLASHEQ) | (1L << LST) | (1L << LSTEQ) | (1L << EQ) | (1L << GRT) | (1L << GRTEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Report_statementContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public TerminalNode K_REPORT() { return getToken(VhdlParser.K_REPORT, 0); }
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode K_SEVERITY() { return getToken(VhdlParser.K_SEVERITY, 0); }
		public Report_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_report_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterReport_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitReport_statement(this);
		}
	}

	public final Report_statementContext report_statement() throws RecognitionException {
		Report_statementContext _localctx = new Report_statementContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_report_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1848);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1847); label_colon();
				}
			}

			setState(1850); match(K_REPORT);
			setState(1851); expression();
			setState(1854);
			_la = _input.LA(1);
			if (_la==K_SEVERITY) {
				{
				setState(1852); match(K_SEVERITY);
				setState(1853); expression();
				}
			}

			setState(1856); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode K_RETURN() { return getToken(VhdlParser.K_RETURN, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitReturn_statement(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1859);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1858); label_colon();
				}
			}

			setState(1861); match(K_RETURN);
			setState(1863);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << K_ABS))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (K_NEW - 86)) | (1L << (K_NOT - 86)) | (1L << (K_NULL - 86)) | (1L << (BASIC_IDENTIFIER - 86)) | (1L << (BIT_STRING_LITERAL - 86)) | (1L << (CHARACTER_LITERAL - 86)) | (1L << (EXTENDED_IDENTIFIER - 86)) | (1L << (STRING_LITERAL - 86)) | (1L << (DECIMAL_LITERAL - 86)) | (1L << (BASED_LITERAL - 86)))) != 0)) {
				{
				setState(1862); expression();
				}
			}

			setState(1865); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Scalar_type_definitionContext extends ParserRuleContext {
		public Physical_type_definitionContext physical_type_definition() {
			return getRuleContext(Physical_type_definitionContext.class,0);
		}
		public Range_constraintContext range_constraint() {
			return getRuleContext(Range_constraintContext.class,0);
		}
		public Enumeration_type_definitionContext enumeration_type_definition() {
			return getRuleContext(Enumeration_type_definitionContext.class,0);
		}
		public Scalar_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterScalar_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitScalar_type_definition(this);
		}
	}

	public final Scalar_type_definitionContext scalar_type_definition() throws RecognitionException {
		Scalar_type_definitionContext _localctx = new Scalar_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_scalar_type_definition);
		try {
			setState(1870);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1867); enumeration_type_definition();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1868); range_constraint();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1869); physical_type_definition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Secondary_unitContext extends ParserRuleContext {
		public Package_bodyContext package_body() {
			return getRuleContext(Package_bodyContext.class,0);
		}
		public Architecture_bodyContext architecture_body() {
			return getRuleContext(Architecture_bodyContext.class,0);
		}
		public Secondary_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondary_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterSecondary_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitSecondary_unit(this);
		}
	}

	public final Secondary_unitContext secondary_unit() throws RecognitionException {
		Secondary_unitContext _localctx = new Secondary_unitContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_secondary_unit);
		try {
			setState(1874);
			switch (_input.LA(1)) {
			case K_ARCHITECTURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1872); architecture_body();
				}
				break;
			case K_PACKAGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1873); package_body();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Secondary_unit_declarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public Physical_literalContext physical_literal() {
			return getRuleContext(Physical_literalContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(VhdlParser.EQ, 0); }
		public Secondary_unit_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondary_unit_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterSecondary_unit_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitSecondary_unit_declaration(this);
		}
	}

	public final Secondary_unit_declarationContext secondary_unit_declaration() throws RecognitionException {
		Secondary_unit_declarationContext _localctx = new Secondary_unit_declarationContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_secondary_unit_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1876); identifier();
			setState(1877); match(EQ);
			setState(1878); physical_literal();
			setState(1879); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selected_signal_assignmentContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(VhdlParser.K_SELECT, 0); }
		public Selected_waveformsContext selected_waveforms() {
			return getRuleContext(Selected_waveformsContext.class,0);
		}
		public TerminalNode LSTEQ() { return getToken(VhdlParser.LSTEQ, 0); }
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VoptionsContext voptions() {
			return getRuleContext(VoptionsContext.class,0);
		}
		public TerminalNode K_WITH() { return getToken(VhdlParser.K_WITH, 0); }
		public Selected_signal_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selected_signal_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterSelected_signal_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitSelected_signal_assignment(this);
		}
	}

	public final Selected_signal_assignmentContext selected_signal_assignment() throws RecognitionException {
		Selected_signal_assignmentContext _localctx = new Selected_signal_assignmentContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_selected_signal_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1881); match(K_WITH);
			setState(1882); expression();
			setState(1883); match(K_SELECT);
			setState(1884); target();
			setState(1885); match(LSTEQ);
			setState(1886); voptions();
			setState(1887); selected_waveforms();
			setState(1888); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selected_waveformsContext extends ParserRuleContext {
		public List<WaveformContext> waveform() {
			return getRuleContexts(WaveformContext.class);
		}
		public ChoicesContext choices(int i) {
			return getRuleContext(ChoicesContext.class,i);
		}
		public List<TerminalNode> K_WHEN() { return getTokens(VhdlParser.K_WHEN); }
		public WaveformContext waveform(int i) {
			return getRuleContext(WaveformContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VhdlParser.COMMA); }
		public List<ChoicesContext> choices() {
			return getRuleContexts(ChoicesContext.class);
		}
		public TerminalNode K_WHEN(int i) {
			return getToken(VhdlParser.K_WHEN, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(VhdlParser.COMMA, i);
		}
		public Selected_waveformsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selected_waveforms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterSelected_waveforms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitSelected_waveforms(this);
		}
	}

	public final Selected_waveformsContext selected_waveforms() throws RecognitionException {
		Selected_waveformsContext _localctx = new Selected_waveformsContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_selected_waveforms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1890); waveform();
			setState(1891); match(K_WHEN);
			setState(1892); choices();
			setState(1900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1893); match(COMMA);
				setState(1894); waveform();
				setState(1895); match(K_WHEN);
				setState(1896); choices();
				}
				}
				setState(1902);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sensitivity_clauseContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(VhdlParser.K_ON, 0); }
		public Sensitivity_listContext sensitivity_list() {
			return getRuleContext(Sensitivity_listContext.class,0);
		}
		public Sensitivity_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sensitivity_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterSensitivity_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitSensitivity_clause(this);
		}
	}

	public final Sensitivity_clauseContext sensitivity_clause() throws RecognitionException {
		Sensitivity_clauseContext _localctx = new Sensitivity_clauseContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_sensitivity_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1903); match(K_ON);
			setState(1904); sensitivity_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sensitivity_listContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(VhdlParser.COMMA); }
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(VhdlParser.COMMA, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public Sensitivity_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sensitivity_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterSensitivity_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitSensitivity_list(this);
		}
	}

	public final Sensitivity_listContext sensitivity_list() throws RecognitionException {
		Sensitivity_listContext _localctx = new Sensitivity_listContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_sensitivity_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1906); name();
			setState(1911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1907); match(COMMA);
				setState(1908); name();
				}
				}
				setState(1913);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sequence_of_statementsContext extends ParserRuleContext {
		public List<Sequential_statementContext> sequential_statement() {
			return getRuleContexts(Sequential_statementContext.class);
		}
		public Sequential_statementContext sequential_statement(int i) {
			return getRuleContext(Sequential_statementContext.class,i);
		}
		public Sequence_of_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence_of_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterSequence_of_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitSequence_of_statements(this);
		}
	}

	public final Sequence_of_statementsContext sequence_of_statements() throws RecognitionException {
		Sequence_of_statementsContext _localctx = new Sequence_of_statementsContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_sequence_of_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << K_ASSERT) | (1L << K_CASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_EXIT - 64)) | (1L << (K_FOR - 64)) | (1L << (K_IF - 64)) | (1L << (K_LOOP - 64)) | (1L << (K_NEXT - 64)) | (1L << (K_NULL - 64)) | (1L << (K_REPORT - 64)) | (1L << (K_RETURN - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (K_WAIT - 131)) | (1L << (K_WHILE - 131)) | (1L << (BASIC_IDENTIFIER - 131)) | (1L << (EXTENDED_IDENTIFIER - 131)) | (1L << (STRING_LITERAL - 131)))) != 0)) {
				{
				{
				setState(1914); sequential_statement();
				}
				}
				setState(1919);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sequential_statementContext extends ParserRuleContext {
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public Wait_statementContext wait_statement() {
			return getRuleContext(Wait_statementContext.class,0);
		}
		public Variable_assignment_statementContext variable_assignment_statement() {
			return getRuleContext(Variable_assignment_statementContext.class,0);
		}
		public Null_statementContext null_statement() {
			return getRuleContext(Null_statementContext.class,0);
		}
		public Exit_statementContext exit_statement() {
			return getRuleContext(Exit_statementContext.class,0);
		}
		public Case_statementContext case_statement() {
			return getRuleContext(Case_statementContext.class,0);
		}
		public Assertion_statementContext assertion_statement() {
			return getRuleContext(Assertion_statementContext.class,0);
		}
		public Report_statementContext report_statement() {
			return getRuleContext(Report_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Signal_assignment_statementContext signal_assignment_statement() {
			return getRuleContext(Signal_assignment_statementContext.class,0);
		}
		public Next_statementContext next_statement() {
			return getRuleContext(Next_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Procedure_call_statementContext procedure_call_statement() {
			return getRuleContext(Procedure_call_statementContext.class,0);
		}
		public Sequential_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequential_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterSequential_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitSequential_statement(this);
		}
	}

	public final Sequential_statementContext sequential_statement() throws RecognitionException {
		Sequential_statementContext _localctx = new Sequential_statementContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_sequential_statement);
		try {
			setState(1933);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1920); wait_statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1921); assertion_statement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1922); report_statement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1923); if_statement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1924); case_statement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1925); next_statement();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1926); exit_statement();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1927); return_statement();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1928); null_statement();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1929); loop_statement();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1930); procedure_call_statement();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1931); variable_assignment_statement();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1932); signal_assignment_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shift_expressionContext extends ParserRuleContext {
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Shift_operatorContext shift_operator() {
			return getRuleContext(Shift_operatorContext.class,0);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitShift_expression(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1935); simple_expression();
			setState(1939);
			_la = _input.LA(1);
			if (((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (K_ROL - 111)) | (1L << (K_ROR - 111)) | (1L << (K_SLA - 111)) | (1L << (K_SLL - 111)) | (1L << (K_SRA - 111)) | (1L << (K_SRL - 111)))) != 0)) {
				{
				setState(1936); shift_operator();
				setState(1937); simple_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shift_operatorContext extends ParserRuleContext {
		public TerminalNode K_SLL() { return getToken(VhdlParser.K_SLL, 0); }
		public TerminalNode K_SRL() { return getToken(VhdlParser.K_SRL, 0); }
		public TerminalNode K_ROL() { return getToken(VhdlParser.K_ROL, 0); }
		public TerminalNode K_ROR() { return getToken(VhdlParser.K_ROR, 0); }
		public TerminalNode K_SLA() { return getToken(VhdlParser.K_SLA, 0); }
		public TerminalNode K_SRA() { return getToken(VhdlParser.K_SRA, 0); }
		public Shift_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterShift_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitShift_operator(this);
		}
	}

	public final Shift_operatorContext shift_operator() throws RecognitionException {
		Shift_operatorContext _localctx = new Shift_operatorContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_shift_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1941);
			_la = _input.LA(1);
			if ( !(((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (K_ROL - 111)) | (1L << (K_ROR - 111)) | (1L << (K_SLA - 111)) | (1L << (K_SLL - 111)) | (1L << (K_SRA - 111)) | (1L << (K_SRL - 111)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(VhdlParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(VhdlParser.PLUS, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitSign(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1943);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signal_assignment_statementContext extends ParserRuleContext {
		public WaveformContext waveform() {
			return getRuleContext(WaveformContext.class,0);
		}
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public TerminalNode LSTEQ() { return getToken(VhdlParser.LSTEQ, 0); }
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public Delay_mechanismContext delay_mechanism() {
			return getRuleContext(Delay_mechanismContext.class,0);
		}
		public Signal_assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signal_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterSignal_assignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitSignal_assignment_statement(this);
		}
	}

	public final Signal_assignment_statementContext signal_assignment_statement() throws RecognitionException {
		Signal_assignment_statementContext _localctx = new Signal_assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_signal_assignment_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1946);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1945); label_colon();
				}
				break;
			}
			setState(1948); target();
			setState(1949); match(LSTEQ);
			setState(1951);
			_la = _input.LA(1);
			if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (K_INERTIAL - 75)) | (1L << (K_REJECT - 75)) | (1L << (K_TRANSPORT - 75)))) != 0)) {
				{
				setState(1950); delay_mechanism();
				}
			}

			setState(1953); waveform();
			setState(1954); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signal_declarationContext extends ParserRuleContext {
		public TerminalNode COLONEQ() { return getToken(VhdlParser.COLONEQ, 0); }
		public TerminalNode K_SIGNAL() { return getToken(VhdlParser.K_SIGNAL, 0); }
		public Signal_kindContext signal_kind() {
			return getRuleContext(Signal_kindContext.class,0);
		}
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VhdlParser.COLON, 0); }
		public Signal_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signal_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterSignal_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitSignal_declaration(this);
		}
	}

	public final Signal_declarationContext signal_declaration() throws RecognitionException {
		Signal_declarationContext _localctx = new Signal_declarationContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_signal_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1956); match(K_SIGNAL);
			setState(1957); identifier_list();
			setState(1958); match(COLON);
			setState(1959); subtype_indication();
			setState(1961);
			_la = _input.LA(1);
			if (_la==K_BUS || _la==K_REGISTER) {
				{
				setState(1960); signal_kind();
				}
			}

			setState(1965);
			_la = _input.LA(1);
			if (_la==COLONEQ) {
				{
				setState(1963); match(COLONEQ);
				setState(1964); expression();
				}
			}

			setState(1967); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signal_kindContext extends ParserRuleContext {
		public TerminalNode K_BUS() { return getToken(VhdlParser.K_BUS, 0); }
		public TerminalNode K_REGISTER() { return getToken(VhdlParser.K_REGISTER, 0); }
		public Signal_kindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signal_kind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterSignal_kind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitSignal_kind(this);
		}
	}

	public final Signal_kindContext signal_kind() throws RecognitionException {
		Signal_kindContext _localctx = new Signal_kindContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_signal_kind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1969);
			_la = _input.LA(1);
			if ( !(_la==K_BUS || _la==K_REGISTER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signal_listContext extends ParserRuleContext {
		public TerminalNode K_OTHERS() { return getToken(VhdlParser.K_OTHERS, 0); }
		public TerminalNode K_ALL() { return getToken(VhdlParser.K_ALL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(VhdlParser.COMMA); }
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(VhdlParser.COMMA, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public Signal_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signal_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterSignal_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitSignal_list(this);
		}
	}

	public final Signal_listContext signal_list() throws RecognitionException {
		Signal_listContext _localctx = new Signal_listContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_signal_list);
		int _la;
		try {
			setState(1981);
			switch (_input.LA(1)) {
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1971); name();
				setState(1976);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1972); match(COMMA);
					setState(1973); name();
					}
					}
					setState(1978);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case K_OTHERS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1979); match(K_OTHERS);
				}
				break;
			case K_ALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1980); match(K_ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignatureContext extends ParserRuleContext {
		public TerminalNode RBRACK() { return getToken(VhdlParser.RBRACK, 0); }
		public TerminalNode K_RETURN() { return getToken(VhdlParser.K_RETURN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(VhdlParser.COMMA); }
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(VhdlParser.COMMA, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public TerminalNode LBRACK() { return getToken(VhdlParser.LBRACK, 0); }
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitSignature(this);
		}
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1983); match(LBRACK);
			setState(1992);
			_la = _input.LA(1);
			if (((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (BASIC_IDENTIFIER - 140)) | (1L << (EXTENDED_IDENTIFIER - 140)) | (1L << (STRING_LITERAL - 140)))) != 0)) {
				{
				setState(1984); name();
				setState(1989);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1985); match(COMMA);
					setState(1986); name();
					}
					}
					setState(1991);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1996);
			_la = _input.LA(1);
			if (_la==K_RETURN) {
				{
				setState(1994); match(K_RETURN);
				setState(1995); name();
				}
			}

			setState(1998); match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_expressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public List<Adding_operatorContext> adding_operator() {
			return getRuleContexts(Adding_operatorContext.class);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public Adding_operatorContext adding_operator(int i) {
			return getRuleContext(Adding_operatorContext.class,i);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public Simple_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterSimple_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitSimple_expression(this);
		}
	}

	public final Simple_expressionContext simple_expression() throws RecognitionException {
		Simple_expressionContext _localctx = new Simple_expressionContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_simple_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2001);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(2000); sign();
				}
			}

			setState(2003); term();
			setState(2009);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(2004); adding_operator();
					setState(2005); term();
					}
					} 
				}
				setState(2011);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Simple_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterSimple_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitSimple_name(this);
		}
	}

	public final Simple_nameContext simple_name() throws RecognitionException {
		Simple_nameContext _localctx = new Simple_nameContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_simple_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2012); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(VhdlParser.STRING_LITERAL, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitString_literal(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2014); match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subprogram_bodyContext extends ParserRuleContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public Subprogram_specificationContext subprogram_specification() {
			return getRuleContext(Subprogram_specificationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public TerminalNode K_BEGIN() { return getToken(VhdlParser.K_BEGIN, 0); }
		public Subprogram_declarative_partContext subprogram_declarative_part() {
			return getRuleContext(Subprogram_declarative_partContext.class,0);
		}
		public TerminalNode K_END() { return getToken(VhdlParser.K_END, 0); }
		public Subprogram_statement_partContext subprogram_statement_part() {
			return getRuleContext(Subprogram_statement_partContext.class,0);
		}
		public TerminalNode K_IS() { return getToken(VhdlParser.K_IS, 0); }
		public Subprogram_kindContext subprogram_kind() {
			return getRuleContext(Subprogram_kindContext.class,0);
		}
		public Subprogram_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterSubprogram_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitSubprogram_body(this);
		}
	}

	public final Subprogram_bodyContext subprogram_body() throws RecognitionException {
		Subprogram_bodyContext _localctx = new Subprogram_bodyContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_subprogram_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2016); subprogram_specification();
			setState(2017); match(K_IS);
			setState(2018); subprogram_declarative_part();
			setState(2019); match(K_BEGIN);
			setState(2020); subprogram_statement_part();
			setState(2021); match(K_END);
			setState(2023);
			_la = _input.LA(1);
			if (_la==K_FUNCTION || _la==K_PROCEDURE) {
				{
				setState(2022); subprogram_kind();
				}
			}

			setState(2026);
			_la = _input.LA(1);
			if (((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (BASIC_IDENTIFIER - 140)) | (1L << (EXTENDED_IDENTIFIER - 140)) | (1L << (STRING_LITERAL - 140)))) != 0)) {
				{
				setState(2025); designator();
				}
			}

			setState(2028); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subprogram_declarationContext extends ParserRuleContext {
		public Subprogram_specificationContext subprogram_specification() {
			return getRuleContext(Subprogram_specificationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public Subprogram_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterSubprogram_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitSubprogram_declaration(this);
		}
	}

	public final Subprogram_declarationContext subprogram_declaration() throws RecognitionException {
		Subprogram_declarationContext _localctx = new Subprogram_declarationContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_subprogram_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2030); subprogram_specification();
			setState(2031); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subprogram_declarative_itemContext extends ParserRuleContext {
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public Group_template_declarationContext group_template_declaration() {
			return getRuleContext(Group_template_declarationContext.class,0);
		}
		public File_declarationContext file_declaration() {
			return getRuleContext(File_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Subprogram_bodyContext subprogram_body() {
			return getRuleContext(Subprogram_bodyContext.class,0);
		}
		public Subtype_declarationContext subtype_declaration() {
			return getRuleContext(Subtype_declarationContext.class,0);
		}
		public Group_declarationContext group_declaration() {
			return getRuleContext(Group_declarationContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Use_clauseContext use_clause() {
			return getRuleContext(Use_clauseContext.class,0);
		}
		public Attribute_declarationContext attribute_declaration() {
			return getRuleContext(Attribute_declarationContext.class,0);
		}
		public Attribute_specificationContext attribute_specification() {
			return getRuleContext(Attribute_specificationContext.class,0);
		}
		public Subprogram_declarationContext subprogram_declaration() {
			return getRuleContext(Subprogram_declarationContext.class,0);
		}
		public Alias_declarationContext alias_declaration() {
			return getRuleContext(Alias_declarationContext.class,0);
		}
		public Subprogram_declarative_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_declarative_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterSubprogram_declarative_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitSubprogram_declarative_item(this);
		}
	}

	public final Subprogram_declarative_itemContext subprogram_declarative_item() throws RecognitionException {
		Subprogram_declarative_itemContext _localctx = new Subprogram_declarative_itemContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_subprogram_declarative_item);
		try {
			setState(2046);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2033); subprogram_declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2034); subprogram_body();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2035); type_declaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2036); subtype_declaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2037); constant_declaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2038); variable_declaration();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2039); file_declaration();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2040); alias_declaration();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2041); attribute_specification();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2042); attribute_declaration();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2043); use_clause();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2044); group_declaration();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2045); group_template_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subprogram_declarative_partContext extends ParserRuleContext {
		public Subprogram_declarative_itemContext subprogram_declarative_item(int i) {
			return getRuleContext(Subprogram_declarative_itemContext.class,i);
		}
		public List<Subprogram_declarative_itemContext> subprogram_declarative_item() {
			return getRuleContexts(Subprogram_declarative_itemContext.class);
		}
		public Subprogram_declarative_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_declarative_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterSubprogram_declarative_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitSubprogram_declarative_part(this);
		}
	}

	public final Subprogram_declarative_partContext subprogram_declarative_part() throws RecognitionException {
		Subprogram_declarative_partContext _localctx = new Subprogram_declarative_partContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_subprogram_declarative_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2051);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (K_ALIAS - 42)) | (1L << (K_ATTRIBUTE - 42)) | (1L << (K_CONSTANT - 42)) | (1L << (K_FILE - 42)) | (1L << (K_FUNCTION - 42)) | (1L << (K_GROUP - 42)) | (1L << (K_IMPURE - 42)) | (1L << (K_PROCEDURE - 42)) | (1L << (K_PURE - 42)))) != 0) || ((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (K_SHARED - 115)) | (1L << (K_SUBTYPE - 115)) | (1L << (K_TYPE - 115)) | (1L << (K_USE - 115)) | (1L << (K_VARIABLE - 115)))) != 0)) {
				{
				{
				setState(2048); subprogram_declarative_item();
				}
				}
				setState(2053);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subprogram_kindContext extends ParserRuleContext {
		public TerminalNode K_PROCEDURE() { return getToken(VhdlParser.K_PROCEDURE, 0); }
		public TerminalNode K_FUNCTION() { return getToken(VhdlParser.K_FUNCTION, 0); }
		public Subprogram_kindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_kind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterSubprogram_kind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitSubprogram_kind(this);
		}
	}

	public final Subprogram_kindContext subprogram_kind() throws RecognitionException {
		Subprogram_kindContext _localctx = new Subprogram_kindContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_subprogram_kind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2054);
			_la = _input.LA(1);
			if ( !(_la==K_FUNCTION || _la==K_PROCEDURE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subprogram_specificationContext extends ParserRuleContext {
		public TerminalNode K_PROCEDURE() { return getToken(VhdlParser.K_PROCEDURE, 0); }
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode K_RETURN() { return getToken(VhdlParser.K_RETURN, 0); }
		public TerminalNode K_FUNCTION() { return getToken(VhdlParser.K_FUNCTION, 0); }
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VhdlParser.RPAREN, 0); }
		public TerminalNode K_PURE() { return getToken(VhdlParser.K_PURE, 0); }
		public TerminalNode K_IMPURE() { return getToken(VhdlParser.K_IMPURE, 0); }
		public TerminalNode LPAREN() { return getToken(VhdlParser.LPAREN, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Subprogram_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterSubprogram_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitSubprogram_specification(this);
		}
	}

	public final Subprogram_specificationContext subprogram_specification() throws RecognitionException {
		Subprogram_specificationContext _localctx = new Subprogram_specificationContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_subprogram_specification);
		int _la;
		try {
			setState(2078);
			switch (_input.LA(1)) {
			case K_PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2056); match(K_PROCEDURE);
				setState(2057); designator();
				setState(2062);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(2058); match(LPAREN);
					setState(2059); formal_parameter_list();
					setState(2060); match(RPAREN);
					}
				}

				}
				break;
			case K_FUNCTION:
			case K_IMPURE:
			case K_PURE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2065);
				_la = _input.LA(1);
				if (_la==K_IMPURE || _la==K_PURE) {
					{
					setState(2064);
					_la = _input.LA(1);
					if ( !(_la==K_IMPURE || _la==K_PURE) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(2067); match(K_FUNCTION);
				setState(2068); designator();
				setState(2073);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(2069); match(LPAREN);
					setState(2070); formal_parameter_list();
					setState(2071); match(RPAREN);
					}
				}

				setState(2075); match(K_RETURN);
				setState(2076); name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subprogram_statement_partContext extends ParserRuleContext {
		public List<Sequential_statementContext> sequential_statement() {
			return getRuleContexts(Sequential_statementContext.class);
		}
		public Sequential_statementContext sequential_statement(int i) {
			return getRuleContext(Sequential_statementContext.class,i);
		}
		public Subprogram_statement_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_statement_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterSubprogram_statement_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitSubprogram_statement_part(this);
		}
	}

	public final Subprogram_statement_partContext subprogram_statement_part() throws RecognitionException {
		Subprogram_statement_partContext _localctx = new Subprogram_statement_partContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_subprogram_statement_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2083);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << K_ASSERT) | (1L << K_CASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_EXIT - 64)) | (1L << (K_FOR - 64)) | (1L << (K_IF - 64)) | (1L << (K_LOOP - 64)) | (1L << (K_NEXT - 64)) | (1L << (K_NULL - 64)) | (1L << (K_REPORT - 64)) | (1L << (K_RETURN - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (K_WAIT - 131)) | (1L << (K_WHILE - 131)) | (1L << (BASIC_IDENTIFIER - 131)) | (1L << (EXTENDED_IDENTIFIER - 131)) | (1L << (STRING_LITERAL - 131)))) != 0)) {
				{
				{
				setState(2080); sequential_statement();
				}
				}
				setState(2085);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subtype_declarationContext extends ParserRuleContext {
		public TerminalNode K_SUBTYPE() { return getToken(VhdlParser.K_SUBTYPE, 0); }
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode K_IS() { return getToken(VhdlParser.K_IS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Subtype_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtype_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterSubtype_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitSubtype_declaration(this);
		}
	}

	public final Subtype_declarationContext subtype_declaration() throws RecognitionException {
		Subtype_declarationContext _localctx = new Subtype_declarationContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_subtype_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2086); match(K_SUBTYPE);
			setState(2087); identifier();
			setState(2088); match(K_IS);
			setState(2089); subtype_indication();
			setState(2090); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subtype_indicationContext extends ParserRuleContext {
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public Subtype_indicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtype_indication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterSubtype_indication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitSubtype_indication(this);
		}
	}

	public final Subtype_indicationContext subtype_indication() throws RecognitionException {
		Subtype_indicationContext _localctx = new Subtype_indicationContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_subtype_indication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2092); name();
			setState(2094);
			_la = _input.LA(1);
			if (((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (BASIC_IDENTIFIER - 140)) | (1L << (EXTENDED_IDENTIFIER - 140)) | (1L << (STRING_LITERAL - 140)))) != 0)) {
				{
				setState(2093); name();
				}
			}

			setState(2097);
			_la = _input.LA(1);
			if (_la==LPAREN || _la==K_RANGE) {
				{
				setState(2096); constraint();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuffixContext extends ParserRuleContext {
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public TerminalNode K_ALL() { return getToken(VhdlParser.K_ALL, 0); }
		public Operator_symbolContext operator_symbol() {
			return getRuleContext(Operator_symbolContext.class,0);
		}
		public Character_literalContext character_literal() {
			return getRuleContext(Character_literalContext.class,0);
		}
		public SuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitSuffix(this);
		}
	}

	public final SuffixContext suffix() throws RecognitionException {
		SuffixContext _localctx = new SuffixContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_suffix);
		try {
			setState(2103);
			switch (_input.LA(1)) {
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2099); simple_name();
				}
				break;
			case CHARACTER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2100); character_literal();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2101); operator_symbol();
				}
				break;
			case K_ALL:
				enterOuterAlt(_localctx, 4);
				{
				setState(2102); match(K_ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TargetContext extends ParserRuleContext {
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitTarget(this);
		}
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_target);
		try {
			setState(2107);
			switch (_input.LA(1)) {
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2105); name();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2106); aggregate();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<Multiplying_operatorContext> multiplying_operator() {
			return getRuleContexts(Multiplying_operatorContext.class);
		}
		public Multiplying_operatorContext multiplying_operator(int i) {
			return getRuleContext(Multiplying_operatorContext.class,i);
		}
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_term);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2109); factor();
			setState(2115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(2110); multiplying_operator();
					setState(2111); factor();
					}
					} 
				}
				setState(2117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Timeout_clauseContext extends ParserRuleContext {
		public TerminalNode K_FOR() { return getToken(VhdlParser.K_FOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Timeout_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeout_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterTimeout_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitTimeout_clause(this);
		}
	}

	public final Timeout_clauseContext timeout_clause() throws RecognitionException {
		Timeout_clauseContext _localctx = new Timeout_clauseContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_timeout_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2118); match(K_FOR);
			setState(2119); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_declarationContext extends ParserRuleContext {
		public Full_type_declarationContext full_type_declaration() {
			return getRuleContext(Full_type_declarationContext.class,0);
		}
		public Incomplete_type_declarationContext incomplete_type_declaration() {
			return getRuleContext(Incomplete_type_declarationContext.class,0);
		}
		public Type_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterType_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitType_declaration(this);
		}
	}

	public final Type_declarationContext type_declaration() throws RecognitionException {
		Type_declarationContext _localctx = new Type_declarationContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_type_declaration);
		try {
			setState(2123);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2121); full_type_declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2122); incomplete_type_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_definitionContext extends ParserRuleContext {
		public Scalar_type_definitionContext scalar_type_definition() {
			return getRuleContext(Scalar_type_definitionContext.class,0);
		}
		public Access_type_definitionContext access_type_definition() {
			return getRuleContext(Access_type_definitionContext.class,0);
		}
		public Protected_type_definitionContext protected_type_definition() {
			return getRuleContext(Protected_type_definitionContext.class,0);
		}
		public Composite_type_definitionContext composite_type_definition() {
			return getRuleContext(Composite_type_definitionContext.class,0);
		}
		public File_type_definitionContext file_type_definition() {
			return getRuleContext(File_type_definitionContext.class,0);
		}
		public Type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterType_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitType_definition(this);
		}
	}

	public final Type_definitionContext type_definition() throws RecognitionException {
		Type_definitionContext _localctx = new Type_definitionContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_type_definition);
		try {
			setState(2130);
			switch (_input.LA(1)) {
			case LPAREN:
			case K_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2125); scalar_type_definition();
				}
				break;
			case K_ARRAY:
			case K_RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(2126); composite_type_definition();
				}
				break;
			case K_ACCESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(2127); access_type_definition();
				}
				break;
			case K_FILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2128); file_type_definition();
				}
				break;
			case K_PROTECTED:
				enterOuterAlt(_localctx, 5);
				{
				setState(2129); protected_type_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unconstrained_array_definitionContext extends ParserRuleContext {
		public TerminalNode K_ARRAY() { return getToken(VhdlParser.K_ARRAY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(VhdlParser.COMMA); }
		public TerminalNode RPAREN() { return getToken(VhdlParser.RPAREN, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public List<Index_subtype_definitionContext> index_subtype_definition() {
			return getRuleContexts(Index_subtype_definitionContext.class);
		}
		public TerminalNode LPAREN() { return getToken(VhdlParser.LPAREN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(VhdlParser.COMMA, i);
		}
		public TerminalNode K_OF() { return getToken(VhdlParser.K_OF, 0); }
		public Index_subtype_definitionContext index_subtype_definition(int i) {
			return getRuleContext(Index_subtype_definitionContext.class,i);
		}
		public Unconstrained_array_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unconstrained_array_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterUnconstrained_array_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitUnconstrained_array_definition(this);
		}
	}

	public final Unconstrained_array_definitionContext unconstrained_array_definition() throws RecognitionException {
		Unconstrained_array_definitionContext _localctx = new Unconstrained_array_definitionContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_unconstrained_array_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2132); match(K_ARRAY);
			setState(2133); match(LPAREN);
			setState(2134); index_subtype_definition();
			setState(2139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2135); match(COMMA);
				setState(2136); index_subtype_definition();
				}
				}
				setState(2141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2142); match(RPAREN);
			setState(2143); match(K_OF);
			setState(2144); subtype_indication();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Use_clauseContext extends ParserRuleContext {
		public TerminalNode K_USE() { return getToken(VhdlParser.K_USE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(VhdlParser.COMMA); }
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(VhdlParser.COMMA, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public Use_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterUse_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitUse_clause(this);
		}
	}

	public final Use_clauseContext use_clause() throws RecognitionException {
		Use_clauseContext _localctx = new Use_clauseContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_use_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2146); match(K_USE);
			setState(2147); name();
			setState(2152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2148); match(COMMA);
				setState(2149); name();
				}
				}
				setState(2154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2155); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_assignment_statementContext extends ParserRuleContext {
		public TerminalNode COLONEQ() { return getToken(VhdlParser.COLONEQ, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterVariable_assignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitVariable_assignment_statement(this);
		}
	}

	public final Variable_assignment_statementContext variable_assignment_statement() throws RecognitionException {
		Variable_assignment_statementContext _localctx = new Variable_assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_variable_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2158);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				{
				setState(2157); label_colon();
				}
				break;
			}
			setState(2160); target();
			setState(2161); match(COLONEQ);
			setState(2162); expression();
			setState(2163); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declarationContext extends ParserRuleContext {
		public TerminalNode COLONEQ() { return getToken(VhdlParser.COLONEQ, 0); }
		public TerminalNode K_VARIABLE() { return getToken(VhdlParser.K_VARIABLE, 0); }
		public TerminalNode K_SHARED() { return getToken(VhdlParser.K_SHARED, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VhdlParser.COLON, 0); }
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitVariable_declaration(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2166);
			_la = _input.LA(1);
			if (_la==K_SHARED) {
				{
				setState(2165); match(K_SHARED);
				}
			}

			setState(2168); match(K_VARIABLE);
			setState(2169); identifier_list();
			setState(2170); match(COLON);
			setState(2171); subtype_indication();
			setState(2174);
			_la = _input.LA(1);
			if (_la==COLONEQ) {
				{
				setState(2172); match(COLONEQ);
				setState(2173); expression();
				}
			}

			setState(2176); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Wait_statementContext extends ParserRuleContext {
		public Timeout_clauseContext timeout_clause() {
			return getRuleContext(Timeout_clauseContext.class,0);
		}
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public Sensitivity_clauseContext sensitivity_clause() {
			return getRuleContext(Sensitivity_clauseContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VhdlParser.SEMI, 0); }
		public Condition_clauseContext condition_clause() {
			return getRuleContext(Condition_clauseContext.class,0);
		}
		public TerminalNode K_WAIT() { return getToken(VhdlParser.K_WAIT, 0); }
		public Wait_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wait_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterWait_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitWait_statement(this);
		}
	}

	public final Wait_statementContext wait_statement() throws RecognitionException {
		Wait_statementContext _localctx = new Wait_statementContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_wait_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2179);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(2178); label_colon();
				}
			}

			setState(2181); match(K_WAIT);
			setState(2183);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(2182); sensitivity_clause();
				}
			}

			setState(2186);
			_la = _input.LA(1);
			if (_la==K_UNTIL) {
				{
				setState(2185); condition_clause();
				}
			}

			setState(2189);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(2188); timeout_clause();
				}
			}

			setState(2191); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WaveformContext extends ParserRuleContext {
		public TerminalNode K_UNAFFECTED() { return getToken(VhdlParser.K_UNAFFECTED, 0); }
		public List<TerminalNode> COMMA() { return getTokens(VhdlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VhdlParser.COMMA, i);
		}
		public Waveform_elementContext waveform_element(int i) {
			return getRuleContext(Waveform_elementContext.class,i);
		}
		public List<Waveform_elementContext> waveform_element() {
			return getRuleContexts(Waveform_elementContext.class);
		}
		public WaveformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_waveform; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterWaveform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitWaveform(this);
		}
	}

	public final WaveformContext waveform() throws RecognitionException {
		WaveformContext _localctx = new WaveformContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_waveform);
		int _la;
		try {
			setState(2202);
			switch (_input.LA(1)) {
			case LPAREN:
			case PLUS:
			case MINUS:
			case K_ABS:
			case K_NEW:
			case K_NOT:
			case K_NULL:
			case BASIC_IDENTIFIER:
			case BIT_STRING_LITERAL:
			case CHARACTER_LITERAL:
			case EXTENDED_IDENTIFIER:
			case STRING_LITERAL:
			case DECIMAL_LITERAL:
			case BASED_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2193); waveform_element();
				setState(2198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2194); match(COMMA);
					setState(2195); waveform_element();
					}
					}
					setState(2200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case K_UNAFFECTED:
				enterOuterAlt(_localctx, 2);
				{
				setState(2201); match(K_UNAFFECTED);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Waveform_elementContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode K_AFTER() { return getToken(VhdlParser.K_AFTER, 0); }
		public Waveform_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_waveform_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterWaveform_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitWaveform_element(this);
		}
	}

	public final Waveform_elementContext waveform_element() throws RecognitionException {
		Waveform_elementContext _localctx = new Waveform_elementContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_waveform_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2204); expression();
			setState(2207);
			_la = _input.LA(1);
			if (_la==K_AFTER) {
				{
				setState(2205); match(K_AFTER);
				setState(2206); expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VoptionsContext extends ParserRuleContext {
		public TerminalNode K_GUARDED() { return getToken(VhdlParser.K_GUARDED, 0); }
		public Delay_mechanismContext delay_mechanism() {
			return getRuleContext(Delay_mechanismContext.class,0);
		}
		public VoptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).enterVoptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VhdlListener ) ((VhdlListener)listener).exitVoptions(this);
		}
	}

	public final VoptionsContext voptions() throws RecognitionException {
		VoptionsContext _localctx = new VoptionsContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_voptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2210);
			_la = _input.LA(1);
			if (_la==K_GUARDED) {
				{
				setState(2209); match(K_GUARDED);
				}
			}

			setState(2213);
			_la = _input.LA(1);
			if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (K_INERTIAL - 75)) | (1L << (K_REJECT - 75)) | (1L << (K_TRANSPORT - 75)))) != 0)) {
				{
				setState(2212); delay_mechanism();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\u0096\u08aa\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\3\2\3\2\5\2\u01cb\n\2\3\3\3\3\3\3\3\4\3\4\5\4\u01d2\n"+
		"\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01dc\n\6\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\7\b\u01e4\n\b\f\b\16\b\u01e7\13\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u01ef"+
		"\n\t\3\t\3\t\3\t\5\t\u01f4\n\t\3\t\3\t\3\n\3\n\3\n\5\n\u01fb\n\n\3\13"+
		"\3\13\3\13\5\13\u0200\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u020c\n\f\3\f\5\f\u020f\n\f\3\f\3\f\3\r\7\r\u0214\n\r\f\r\16\r\u0217"+
		"\13\r\3\16\7\16\u021a\n\16\f\16\16\16\u021d\13\16\3\17\3\17\5\17\u0221"+
		"\n\17\3\20\3\20\3\20\3\20\5\20\u0227\n\20\3\20\3\20\5\20\u022b\n\20\3"+
		"\21\5\21\u022e\n\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u0236\n\22\3\22"+
		"\3\22\3\23\3\23\3\23\7\23\u023d\n\23\f\23\16\23\u0240\13\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\5\32\u025a\n\32\3\32\5\32\u025d"+
		"\n\32\3\32\5\32\u0260\n\32\3\33\3\33\3\34\3\34\3\34\7\34\u0267\n\34\f"+
		"\34\16\34\u026a\13\34\3\34\7\34\u026d\n\34\f\34\16\34\u0270\13\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0287\n\35\3\36\7\36\u028a\n\36\f"+
		"\36\16\36\u028d\13\36\3\37\3\37\3\37\3\37\5\37\u0293\n\37\5\37\u0295\n"+
		"\37\3\37\3\37\3\37\3\37\5\37\u029b\n\37\5\37\u029d\n\37\3 \3 \3 \3 \3"+
		" \3 \5 \u02a5\n \3!\3!\3!\3!\3!\3!\3!\5!\u02ae\n!\3!\5!\u02b1\n!\3!\3"+
		"!\3!\3!\3!\3!\3!\5!\u02ba\n!\3!\3!\3\"\7\"\u02bf\n\"\f\"\16\"\u02c2\13"+
		"\"\3#\5#\u02c5\n#\3#\3#\3#\3#\6#\u02cb\n#\r#\16#\u02cc\3#\3#\3#\5#\u02d2"+
		"\n#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3&\3&\3&\3&\5&\u02e1\n&\3\'\3\'\3\'\7\'"+
		"\u02e6\n\'\f\'\16\'\u02e9\13\'\3(\3(\3(\3(\3(\5(\u02f0\n(\3(\5(\u02f3"+
		"\n(\3(\3(\3(\3(\3)\3)\3)\5)\u02fc\n)\3)\5)\u02ff\n)\3)\5)\u0302\n)\3)"+
		"\3)\3)\5)\u0307\n)\3)\3)\3*\3*\3*\3*\5*\u030f\n*\3*\5*\u0312\n*\3*\3*"+
		"\3+\3+\3+\3+\3,\3,\5,\u031c\n,\3-\5-\u031f\n-\3-\5-\u0322\n-\3-\3-\3-"+
		"\3.\3.\5.\u0329\n.\3.\3.\3.\3.\5.\u032f\n.\3.\3.\3.\5.\u0334\n.\3/\3/"+
		"\5/\u0338\n/\3/\3/\3/\5/\u033d\n/\3/\5/\u0340\n/\3\60\3\60\5\60\u0344"+
		"\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u034d\n\61\3\62\3\62\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\5\65\u035c\n\65\3\65"+
		"\3\65\5\65\u0360\n\65\3\66\3\66\3\66\3\66\3\66\5\66\u0367\n\66\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0372\n\67\3\67\5\67\u0375"+
		"\n\67\3\67\3\67\38\38\38\58\u037c\n8\39\79\u037f\n9\f9\169\u0382\139\3"+
		":\3:\5:\u0386\n:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\5<\u0393\n<\3<\3<\3"+
		"=\3=\3=\3=\3=\3>\3>\5>\u039e\n>\3?\7?\u03a1\n?\f?\16?\u03a4\13?\3@\3@"+
		"\5@\u03a8\n@\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u03b9\nB"+
		"\3C\3C\3C\5C\u03be\nC\3C\5C\u03c1\nC\3D\6D\u03c4\nD\rD\16D\u03c5\3E\3"+
		"E\3E\3F\3F\5F\u03cd\nF\3G\3G\3H\3H\3H\3H\3H\3H\3I\3I\5I\u03d9\nI\3J\3"+
		"J\3J\5J\u03de\nJ\3J\3J\3K\3K\3K\3K\3K\3L\3L\3M\3M\3M\3M\3M\3M\5M\u03ef"+
		"\nM\3M\3M\3M\5M\u03f4\nM\3N\3N\3O\3O\5O\u03fa\nO\3P\3P\3P\7P\u03ff\nP"+
		"\fP\16P\u0402\13P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u040b\nQ\3Q\3Q\5Q\u040f\nQ\3"+
		"Q\5Q\u0412\nQ\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u0425"+
		"\nR\3S\7S\u0428\nS\fS\16S\u042b\13S\3T\3T\5T\u042f\nT\3U\5U\u0432\nU\3"+
		"U\5U\u0435\nU\3V\3V\3V\7V\u043a\nV\fV\16V\u043d\13V\3V\3V\5V\u0441\nV"+
		"\3W\3W\3W\3W\3X\3X\3X\5X\u044a\nX\3Y\7Y\u044d\nY\fY\16Y\u0450\13Y\3Z\3"+
		"Z\3Z\5Z\u0455\nZ\3[\3[\5[\u0459\n[\3\\\3\\\3\\\3\\\7\\\u045f\n\\\f\\\16"+
		"\\\u0462\13\\\3\\\3\\\3]\5]\u0467\n]\3]\3]\5]\u046b\n]\3]\3]\5]\u046f"+
		"\n]\3]\3]\3^\3^\3^\3^\7^\u0477\n^\f^\16^\u047a\13^\3_\3_\3`\3`\3`\5`\u0481"+
		"\n`\3`\3`\3`\3`\5`\u0487\n`\3a\3a\3a\3a\3a\5a\u048e\na\3a\3a\3b\3b\3c"+
		"\3c\5c\u0496\nc\3c\3c\3c\3d\3d\3d\3d\3e\3e\3f\3f\3g\3g\3g\3g\3g\5g\u04a8"+
		"\ng\3h\3h\3h\3h\3h\3h\3i\3i\3i\3i\3i\5i\u04b5\ni\3j\3j\3j\3j\3j\7j\u04bc"+
		"\nj\fj\16j\u04bf\13j\3j\5j\u04c2\nj\3j\7j\u04c5\nj\fj\16j\u04c8\13j\3"+
		"j\3j\3j\5j\u04cd\nj\3j\3j\3k\3k\3k\3k\5k\u04d5\nk\3l\3l\3l\3l\3l\3l\3"+
		"m\3m\3n\3n\3n\3n\3n\3n\3o\3o\5o\u04e7\no\3p\3p\3p\7p\u04ec\np\fp\16p\u04ef"+
		"\13p\3q\3q\3q\3q\3q\3q\3q\3q\3q\3r\3r\3r\3r\3r\3r\3r\3r\3s\3s\3s\3s\3"+
		"t\3t\3u\3u\3u\7u\u050b\nu\fu\16u\u050e\13u\3v\5v\u0511\nv\3v\3v\3v\3v"+
		"\3v\3v\3v\3v\3v\7v\u051c\nv\fv\16v\u051f\13v\3v\3v\5v\u0523\nv\3v\3v\3"+
		"v\5v\u0528\nv\3v\3v\3w\3w\3w\3w\3x\3x\3x\3x\7x\u0534\nx\fx\16x\u0537\13"+
		"x\3x\3x\3y\3y\5y\u053d\ny\3z\3z\3z\3z\3{\5{\u0544\n{\3{\3{\3{\3{\3{\3"+
		"{\3{\5{\u054d\n{\3{\3{\5{\u0551\n{\3|\3|\3|\7|\u0556\n|\f|\16|\u0559\13"+
		"|\3|\3|\5|\u055d\n|\3}\5}\u0560\n}\3}\3}\3}\5}\u0565\n}\3}\3}\3}\5}\u056a"+
		"\n}\3~\3~\3~\3~\5~\u0570\n~\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0081\3\u0081\3\u0081\7\u0081\u057c\n\u0081\f\u0081\16\u0081"+
		"\u057f\13\u0081\3\u0082\5\u0082\u0582\n\u0082\3\u0082\3\u0082\3\u0082"+
		"\5\u0082\u0587\n\u0082\3\u0082\3\u0082\5\u0082\u058b\n\u0082\3\u0082\3"+
		"\u0082\5\u0082\u058f\n\u0082\3\u0083\5\u0083\u0592\n\u0083\3\u0083\3\u0083"+
		"\3\u0083\5\u0083\u0597\n\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u059c\n"+
		"\u0083\3\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u05a2\n\u0084\3\u0085\3"+
		"\u0085\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0088"+
		"\3\u0088\5\u0088\u05af\n\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\5\u0089\u05b6\n\u0089\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\7\u008b"+
		"\u05bd\n\u008b\f\u008b\16\u008b\u05c0\13\u008b\3\u008c\3\u008c\3\u008d"+
		"\5\u008d\u05c5\n\u008d\3\u008d\5\u008d\u05c8\n\u008d\3\u008d\3\u008d\3"+
		"\u008d\3\u008d\3\u008d\5\u008d\u05cf\n\u008d\3\u008d\3\u008d\3\u008e\3"+
		"\u008e\3\u008f\3\u008f\3\u0090\3\u0090\3\u0091\3\u0091\5\u0091\u05db\n"+
		"\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u05e2\n\u0091\3"+
		"\u0091\3\u0091\3\u0091\3\u0091\3\u0091\7\u0091\u05e9\n\u0091\f\u0091\16"+
		"\u0091\u05ec\13\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u05f8\n\u0091\7\u0091\u05fa\n"+
		"\u0091\f\u0091\16\u0091\u05fd\13\u0091\3\u0092\5\u0092\u0600\n\u0092\3"+
		"\u0092\3\u0092\5\u0092\u0604\n\u0092\3\u0092\3\u0092\5\u0092\u0608\n\u0092"+
		"\3\u0092\3\u0092\3\u0093\5\u0093\u060d\n\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0094\3\u0094\5\u0094\u0614\n\u0094\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\5\u0095\u061a\n\u0095\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0097\3\u0097\3\u0097\5\u0097\u0626\n\u0097\3\u0097\5\u0097"+
		"\u0629\n\u0097\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\5\u0098\u0638\n\u0098"+
		"\3\u0099\7\u0099\u063b\n\u0099\f\u0099\16\u0099\u063e\13\u0099\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u0646\n\u009a\3\u009a"+
		"\5\u009a\u0649\n\u009a\3\u009a\3\u009a\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\5\u009b\u065c\n\u009b\3\u009c\7\u009c\u065f\n\u009c\f"+
		"\u009c\16\u009c\u0662\13\u009c\3\u009d\3\u009d\3\u009d\3\u009d\3\u009e"+
		"\5\u009e\u0669\n\u009e\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f\3\u009f"+
		"\5\u009f\u0671\n\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u0676\n\u009f\3"+
		"\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\5\u00a3\u0688"+
		"\n\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\5\u00a3\u0694\n\u00a3\3\u00a4\3\u00a4\3\u00a4\5\u00a4"+
		"\u0699\n\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u06a0\n"+
		"\u00a5\3\u00a6\5\u00a6\u06a3\n\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3"+
		"\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u06b5\n\u00a7\3\u00a8\7\u00a8\u06b8\n"+
		"\u00a8\f\u00a8\16\u00a8\u06bb\13\u00a8\3\u00a9\5\u00a9\u06be\n\u00a9\3"+
		"\u00a9\5\u00a9\u06c1\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5"+
		"\u00a9\u06c8\n\u00a9\3\u00a9\5\u00a9\u06cb\n\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\5\u00a9\u06d2\n\u00a9\3\u00a9\3\u00a9\5\u00a9\u06d6\n"+
		"\u00a9\3\u00a9\3\u00a9\3\u00aa\7\u00aa\u06db\n\u00aa\f\u00aa\16\u00aa"+
		"\u06de\13\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\5\u00ab\u06e7\n\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u06f6"+
		"\n\u00ac\3\u00ad\7\u00ad\u06f9\n\u00ad\f\u00ad\16\u00ad\u06fc\13\u00ad"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u0703\n\u00ae\3\u00af"+
		"\3\u00af\3\u00af\5\u00af\u0708\n\u00af\3\u00b0\7\u00b0\u070b\n\u00b0\f"+
		"\u00b0\16\u00b0\u070e\13\u00b0\3\u00b1\3\u00b1\5\u00b1\u0712\n\u00b1\3"+
		"\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u071b\n"+
		"\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u0722\n\u00b3\3"+
		"\u00b4\3\u00b4\3\u00b4\3\u00b5\3\u00b5\6\u00b5\u0729\n\u00b5\r\u00b5\16"+
		"\u00b5\u072a\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u0730\n\u00b5\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\5\u00b6\u0736\n\u00b6\3\u00b7\3\u00b7\3\u00b8\5\u00b8"+
		"\u073b\n\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u0741\n\u00b8\3"+
		"\u00b8\3\u00b8\3\u00b9\5\u00b9\u0746\n\u00b9\3\u00b9\3\u00b9\5\u00b9\u074a"+
		"\n\u00b9\3\u00b9\3\u00b9\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u0751\n\u00ba"+
		"\3\u00bb\3\u00bb\5\u00bb\u0755\n\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\7\u00be\u076d\n\u00be\f\u00be\16\u00be\u0770\13\u00be\3\u00bf\3\u00bf"+
		"\3\u00bf\3\u00c0\3\u00c0\3\u00c0\7\u00c0\u0778\n\u00c0\f\u00c0\16\u00c0"+
		"\u077b\13\u00c0\3\u00c1\7\u00c1\u077e\n\u00c1\f\u00c1\16\u00c1\u0781\13"+
		"\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u0790\n\u00c2\3\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u0796\n\u00c3\3\u00c4\3\u00c4\3\u00c5"+
		"\3\u00c5\3\u00c6\5\u00c6\u079d\n\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6"+
		"\u07a2\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\5\u00c7\u07ac\n\u00c7\3\u00c7\3\u00c7\5\u00c7\u07b0\n\u00c7\3"+
		"\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00c9\7\u00c9\u07b9\n"+
		"\u00c9\f\u00c9\16\u00c9\u07bc\13\u00c9\3\u00c9\3\u00c9\5\u00c9\u07c0\n"+
		"\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00ca\7\u00ca\u07c6\n\u00ca\f\u00ca\16"+
		"\u00ca\u07c9\13\u00ca\5\u00ca\u07cb\n\u00ca\3\u00ca\3\u00ca\5\u00ca\u07cf"+
		"\n\u00ca\3\u00ca\3\u00ca\3\u00cb\5\u00cb\u07d4\n\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\7\u00cb\u07da\n\u00cb\f\u00cb\16\u00cb\u07dd\13\u00cb"+
		"\3\u00cc\3\u00cc\3\u00cd\3\u00cd\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\5\u00ce\u07ea\n\u00ce\3\u00ce\5\u00ce\u07ed\n\u00ce\3"+
		"\u00ce\3\u00ce\3\u00cf\3\u00cf\3\u00cf\3\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\5\u00d0\u0801\n\u00d0\3\u00d1\7\u00d1\u0804\n\u00d1\f\u00d1\16\u00d1"+
		"\u0807\13\u00d1\3\u00d2\3\u00d2\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3"+
		"\3\u00d3\5\u00d3\u0811\n\u00d3\3\u00d3\5\u00d3\u0814\n\u00d3\3\u00d3\3"+
		"\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\5\u00d3\u081c\n\u00d3\3\u00d3\3"+
		"\u00d3\3\u00d3\5\u00d3\u0821\n\u00d3\3\u00d4\7\u00d4\u0824\n\u00d4\f\u00d4"+
		"\16\u00d4\u0827\13\u00d4\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5"+
		"\3\u00d6\3\u00d6\5\u00d6\u0831\n\u00d6\3\u00d6\5\u00d6\u0834\n\u00d6\3"+
		"\u00d7\3\u00d7\3\u00d7\3\u00d7\5\u00d7\u083a\n\u00d7\3\u00d8\3\u00d8\5"+
		"\u00d8\u083e\n\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9\7\u00d9\u0844\n\u00d9"+
		"\f\u00d9\16\u00d9\u0847\13\u00d9\3\u00da\3\u00da\3\u00da\3\u00db\3\u00db"+
		"\5\u00db\u084e\n\u00db\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\5\u00dc"+
		"\u0855\n\u00dc\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\7\u00dd\u085c\n"+
		"\u00dd\f\u00dd\16\u00dd\u085f\13\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00de\3\u00de\3\u00de\3\u00de\7\u00de\u0869\n\u00de\f\u00de\16\u00de"+
		"\u086c\13\u00de\3\u00de\3\u00de\3\u00df\5\u00df\u0871\n\u00df\3\u00df"+
		"\3\u00df\3\u00df\3\u00df\3\u00df\3\u00e0\5\u00e0\u0879\n\u00e0\3\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\5\u00e0\u0881\n\u00e0\3\u00e0"+
		"\3\u00e0\3\u00e1\5\u00e1\u0886\n\u00e1\3\u00e1\3\u00e1\5\u00e1\u088a\n"+
		"\u00e1\3\u00e1\5\u00e1\u088d\n\u00e1\3\u00e1\5\u00e1\u0890\n\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e2\3\u00e2\3\u00e2\7\u00e2\u0897\n\u00e2\f\u00e2\16\u00e2"+
		"\u089a\13\u00e2\3\u00e2\5\u00e2\u089d\n\u00e2\3\u00e3\3\u00e3\3\u00e3"+
		"\5\u00e3\u08a2\n\u00e3\3\u00e4\5\u00e4\u08a5\n\u00e4\3\u00e4\5\u00e4\u08a8"+
		"\n\u00e4\3\u00e4\2\u00e5\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114"+
		"\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c"+
		"\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144"+
		"\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c"+
		"\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174"+
		"\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c"+
		"\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4"+
		"\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc"+
		"\u01be\u01c0\u01c2\u01c4\u01c6\2\20\5\2\7\7\n\n\f\f\4\2==}}\17\2//9;A"+
		"AEEPPSSccffvv{{\177\177\u0081\u0081\u0084\u0084\7\2..WWZZ``\u0089\u008a"+
		"\4\2\u008e\u008e\u0093\u0093\5\2\t\t))[[\7\2\66\66LLNNRRbb\6\2\b\b\16"+
		"\16VVnn\5\2\17\17\22\23\25\27\4\2qrwz\4\2\n\n\f\f\4\2\67\67ll\4\2EEff"+
		"\4\2KKii\u094b\2\u01ca\3\2\2\2\4\u01cc\3\2\2\2\6\u01d1\3\2\2\2\b\u01d3"+
		"\3\2\2\2\n\u01db\3\2\2\2\f\u01dd\3\2\2\2\16\u01df\3\2\2\2\20\u01ea\3\2"+
		"\2\2\22\u01fa\3\2\2\2\24\u01fc\3\2\2\2\26\u0201\3\2\2\2\30\u0215\3\2\2"+
		"\2\32\u021b\3\2\2\2\34\u0220\3\2\2\2\36\u0222\3\2\2\2 \u022d\3\2\2\2\""+
		"\u0235\3\2\2\2$\u0239\3\2\2\2&\u0241\3\2\2\2(\u0247\3\2\2\2*\u0249\3\2"+
		"\2\2,\u024b\3\2\2\2.\u0253\3\2\2\2\60\u0255\3\2\2\2\62\u0259\3\2\2\2\64"+
		"\u0261\3\2\2\2\66\u0263\3\2\2\28\u0286\3\2\2\2:\u028b\3\2\2\2<\u0294\3"+
		"\2\2\2>\u02a4\3\2\2\2@\u02a6\3\2\2\2B\u02c0\3\2\2\2D\u02c4\3\2\2\2F\u02d5"+
		"\3\2\2\2H\u02da\3\2\2\2J\u02e0\3\2\2\2L\u02e2\3\2\2\2N\u02ea\3\2\2\2P"+
		"\u02f8\3\2\2\2R\u030a\3\2\2\2T\u0315\3\2\2\2V\u031b\3\2\2\2X\u031e\3\2"+
		"\2\2Z\u0333\3\2\2\2\\\u033f\3\2\2\2^\u0343\3\2\2\2`\u034c\3\2\2\2b\u034e"+
		"\3\2\2\2d\u0350\3\2\2\2f\u0353\3\2\2\2h\u0359\3\2\2\2j\u0361\3\2\2\2l"+
		"\u0368\3\2\2\2n\u037b\3\2\2\2p\u0380\3\2\2\2r\u0385\3\2\2\2t\u0387\3\2"+
		"\2\2v\u038c\3\2\2\2x\u0396\3\2\2\2z\u039d\3\2\2\2|\u03a2\3\2\2\2~\u03a7"+
		"\3\2\2\2\u0080\u03a9\3\2\2\2\u0082\u03b8\3\2\2\2\u0084\u03c0\3\2\2\2\u0086"+
		"\u03c3\3\2\2\2\u0088\u03c7\3\2\2\2\u008a\u03cc\3\2\2\2\u008c\u03ce\3\2"+
		"\2\2\u008e\u03d0\3\2\2\2\u0090\u03d8\3\2\2\2\u0092\u03dd\3\2\2\2\u0094"+
		"\u03e1\3\2\2\2\u0096\u03e6\3\2\2\2\u0098\u03f3\3\2\2\2\u009a\u03f5\3\2"+
		"\2\2\u009c\u03f7\3\2\2\2\u009e\u03fb\3\2\2\2\u00a0\u0403\3\2\2\2\u00a2"+
		"\u0424\3\2\2\2\u00a4\u0429\3\2\2\2\u00a6\u042c\3\2\2\2\u00a8\u0431\3\2"+
		"\2\2\u00aa\u0440\3\2\2\2\u00ac\u0442\3\2\2\2\u00ae\u0449\3\2\2\2\u00b0"+
		"\u044e\3\2\2\2\u00b2\u0454\3\2\2\2\u00b4\u0458\3\2\2\2\u00b6\u045a\3\2"+
		"\2\2\u00b8\u0466\3\2\2\2\u00ba\u0472\3\2\2\2\u00bc\u047b\3\2\2\2\u00be"+
		"\u0486\3\2\2\2\u00c0\u0488\3\2\2\2\u00c2\u0491\3\2\2\2\u00c4\u0495\3\2"+
		"\2\2\u00c6\u049a\3\2\2\2\u00c8\u049e\3\2\2\2\u00ca\u04a0\3\2\2\2\u00cc"+
		"\u04a2\3\2\2\2\u00ce\u04a9\3\2\2\2\u00d0\u04af\3\2\2\2\u00d2\u04b6\3\2"+
		"\2\2\u00d4\u04d4\3\2\2\2\u00d6\u04d6\3\2\2\2\u00d8\u04dc\3\2\2\2\u00da"+
		"\u04de\3\2\2\2\u00dc\u04e6\3\2\2\2\u00de\u04e8\3\2\2\2\u00e0\u04f0\3\2"+
		"\2\2\u00e2\u04f9\3\2\2\2\u00e4\u0501\3\2\2\2\u00e6\u0505\3\2\2\2\u00e8"+
		"\u0507\3\2\2\2\u00ea\u0510\3\2\2\2\u00ec\u052b\3\2\2\2\u00ee\u052f\3\2"+
		"\2\2\u00f0\u053c\3\2\2\2\u00f2\u053e\3\2\2\2\u00f4\u0550\3\2\2\2\u00f6"+
		"\u055c\3\2\2\2\u00f8\u055f\3\2\2\2\u00fa\u056f\3\2\2\2\u00fc\u0571\3\2"+
		"\2\2\u00fe\u0573\3\2\2\2\u0100\u0578\3\2\2\2\u0102\u0581\3\2\2\2\u0104"+
		"\u0591\3\2\2\2\u0106\u05a1\3\2\2\2\u0108\u05a3\3\2\2\2\u010a\u05a5\3\2"+
		"\2\2\u010c\u05a8\3\2\2\2\u010e\u05ae\3\2\2\2\u0110\u05b5\3\2\2\2\u0112"+
		"\u05b7\3\2\2\2\u0114\u05b9\3\2\2\2\u0116\u05c1\3\2\2\2\u0118\u05c4\3\2"+
		"\2\2\u011a\u05d2\3\2\2\2\u011c\u05d4\3\2\2\2\u011e\u05d6\3\2\2\2\u0120"+
		"\u05da\3\2\2\2\u0122\u05ff\3\2\2\2\u0124\u060c\3\2\2\2\u0126\u0613\3\2"+
		"\2\2\u0128\u0619\3\2\2\2\u012a\u061b\3\2\2\2\u012c\u061d\3\2\2\2\u012e"+
		"\u0637\3\2\2\2\u0130\u063c\3\2\2\2\u0132\u063f\3\2\2\2\u0134\u065b\3\2"+
		"\2\2\u0136\u0660\3\2\2\2\u0138\u0663\3\2\2\2\u013a\u0668\3\2\2\2\u013c"+
		"\u066c\3\2\2\2\u013e\u0677\3\2\2\2\u0140\u067d\3\2\2\2\u0142\u067f\3\2"+
		"\2\2\u0144\u0693\3\2\2\2\u0146\u0698\3\2\2\2\u0148\u069a\3\2\2\2\u014a"+
		"\u06a2\3\2\2\2\u014c\u06b4\3\2\2\2\u014e\u06b9\3\2\2\2\u0150\u06bd\3\2"+
		"\2\2\u0152\u06dc\3\2\2\2\u0154\u06df\3\2\2\2\u0156\u06f5\3\2\2\2\u0158"+
		"\u06fa\3\2\2\2\u015a\u06fd\3\2\2\2\u015c\u0707\3\2\2\2\u015e\u070c\3\2"+
		"\2\2\u0160\u0711\3\2\2\2\u0162\u0713\3\2\2\2\u0164\u0721\3\2\2\2\u0166"+
		"\u0723\3\2\2\2\u0168\u0726\3\2\2\2\u016a\u0731\3\2\2\2\u016c\u0737\3\2"+
		"\2\2\u016e\u073a\3\2\2\2\u0170\u0745\3\2\2\2\u0172\u0750\3\2\2\2\u0174"+
		"\u0754\3\2\2\2\u0176\u0756\3\2\2\2\u0178\u075b\3\2\2\2\u017a\u0764\3\2"+
		"\2\2\u017c\u0771\3\2\2\2\u017e\u0774\3\2\2\2\u0180\u077f\3\2\2\2\u0182"+
		"\u078f\3\2\2\2\u0184\u0791\3\2\2\2\u0186\u0797\3\2\2\2\u0188\u0799\3\2"+
		"\2\2\u018a\u079c\3\2\2\2\u018c\u07a6\3\2\2\2\u018e\u07b3\3\2\2\2\u0190"+
		"\u07bf\3\2\2\2\u0192\u07c1\3\2\2\2\u0194\u07d3\3\2\2\2\u0196\u07de\3\2"+
		"\2\2\u0198\u07e0\3\2\2\2\u019a\u07e2\3\2\2\2\u019c\u07f0\3\2\2\2\u019e"+
		"\u0800\3\2\2\2\u01a0\u0805\3\2\2\2\u01a2\u0808\3\2\2\2\u01a4\u0820\3\2"+
		"\2\2\u01a6\u0825\3\2\2\2\u01a8\u0828\3\2\2\2\u01aa\u082e\3\2\2\2\u01ac"+
		"\u0839\3\2\2\2\u01ae\u083d\3\2\2\2\u01b0\u083f\3\2\2\2\u01b2\u0848\3\2"+
		"\2\2\u01b4\u084d\3\2\2\2\u01b6\u0854\3\2\2\2\u01b8\u0856\3\2\2\2\u01ba"+
		"\u0864\3\2\2\2\u01bc\u0870\3\2\2\2\u01be\u0878\3\2\2\2\u01c0\u0885\3\2"+
		"\2\2\u01c2\u089c\3\2\2\2\u01c4\u089e\3\2\2\2\u01c6\u08a4\3\2\2\2\u01c8"+
		"\u01cb\5\u0080A\2\u01c9\u01cb\5\60\31\2\u01ca\u01c8\3\2\2\2\u01ca\u01c9"+
		"\3\2\2\2\u01cb\3\3\2\2\2\u01cc\u01cd\7*\2\2\u01cd\u01ce\5\u01aa\u00d6"+
		"\2\u01ce\5\3\2\2\2\u01cf\u01d2\5\u00ba^\2\u01d0\u01d2\7_\2\2\u01d1\u01cf"+
		"\3\2\2\2\u01d1\u01d0\3\2\2\2\u01d2\7\3\2\2\2\u01d3\u01d4\5$\23\2\u01d4"+
		"\t\3\2\2\2\u01d5\u01d6\5\u0120\u0091\2\u01d6\u01d7\7\3\2\2\u01d7\u01d8"+
		"\5\6\4\2\u01d8\u01d9\7\4\2\2\u01d9\u01dc\3\2\2\2\u01da\u01dc\5\6\4\2\u01db"+
		"\u01d5\3\2\2\2\u01db\u01da\3\2\2\2\u01dc\13\3\2\2\2\u01dd\u01de\t\2\2"+
		"\2\u01de\r\3\2\2\2\u01df\u01e0\7\3\2\2\u01e0\u01e5\5\u0092J\2\u01e1\u01e2"+
		"\7\13\2\2\u01e2\u01e4\5\u0092J\2\u01e3\u01e1\3\2\2\2\u01e4\u01e7\3\2\2"+
		"\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01e5"+
		"\3\2\2\2\u01e8\u01e9\7\4\2\2\u01e9\17\3\2\2\2\u01ea\u01eb\7,\2\2\u01eb"+
		"\u01ee\5\22\n\2\u01ec\u01ed\7\20\2\2\u01ed\u01ef\5\u01aa\u00d6\2\u01ee"+
		"\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\7O"+
		"\2\2\u01f1\u01f3\5\u0120\u0091\2\u01f2\u01f4\5\u0192\u00ca\2\u01f3\u01f2"+
		"\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\7\21\2\2"+
		"\u01f6\21\3\2\2\2\u01f7\u01fb\5\u00e6t\2\u01f8\u01fb\5H%\2\u01f9\u01fb"+
		"\5\u012a\u0096\2\u01fa\u01f7\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01f9\3"+
		"\2\2\2\u01fb\23\3\2\2\2\u01fc\u01ff\7X\2\2\u01fd\u0200\5\u01aa\u00d6\2"+
		"\u01fe\u0200\5\u0162\u00b2\2\u01ff\u01fd\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200"+
		"\25\3\2\2\2\u0201\u0202\7/\2\2\u0202\u0203\5\u00e6t\2\u0203\u0204\7]\2"+
		"\2\u0204\u0205\5\u0120\u0091\2\u0205\u0206\7O\2\2\u0206\u0207\5\30\r\2"+
		"\u0207\u0208\7\63\2\2\u0208\u0209\5\32\16\2\u0209\u020b\7@\2\2\u020a\u020c"+
		"\7/\2\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e\3\2\2\2\u020d"+
		"\u020f\5\u0196\u00cc\2\u020e\u020d\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210"+
		"\3\2\2\2\u0210\u0211\7\21\2\2\u0211\27\3\2\2\2\u0212\u0214\58\35\2\u0213"+
		"\u0212\3\2\2\2\u0214\u0217\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2"+
		"\2\2\u0216\31\3\2\2\2\u0217\u0215\3\2\2\2\u0218\u021a\5`\61\2\u0219\u0218"+
		"\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c"+
		"\33\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u0221\5\u01b8\u00dd\2\u021f\u0221"+
		"\5x=\2\u0220\u021e\3\2\2\2\u0220\u021f\3\2\2\2\u0221\35\3\2\2\2\u0222"+
		"\u0223\7\61\2\2\u0223\u0226\5b\62\2\u0224\u0225\7o\2\2\u0225\u0227\5\u00ba"+
		"^\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u022a\3\2\2\2\u0228"+
		"\u0229\7t\2\2\u0229\u022b\5\u00ba^\2\u022a\u0228\3\2\2\2\u022a\u022b\3"+
		"\2\2\2\u022b\37\3\2\2\2\u022c\u022e\5\u010a\u0086\2\u022d\u022c\3\2\2"+
		"\2\u022d\u022e\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\5\36\20\2\u0230"+
		"\u0231\7\21\2\2\u0231!\3\2\2\2\u0232\u0233\5\u00ccg\2\u0233\u0234\7\30"+
		"\2\2\u0234\u0236\3\2\2\2\u0235\u0232\3\2\2\2\u0235\u0236\3\2\2\2\u0236"+
		"\u0237\3\2\2\2\u0237\u0238\5\n\6\2\u0238#\3\2\2\2\u0239\u023e\5\"\22\2"+
		"\u023a\u023b\7\13\2\2\u023b\u023d\5\"\22\2\u023c\u023a\3\2\2\2\u023d\u0240"+
		"\3\2\2\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f%\3\2\2\2\u0240"+
		"\u023e\3\2\2\2\u0241\u0242\7\62\2\2\u0242\u0243\5\u00e6t\2\u0243\u0244"+
		"\7\20\2\2\u0244\u0245\5\u0120\u0091\2\u0245\u0246\7\21\2\2\u0246\'\3\2"+
		"\2\2\u0247\u0248\5\u0196\u00cc\2\u0248)\3\2\2\2\u0249\u024a\7\u0091\2"+
		"\2\u024a+\3\2\2\2\u024b\u024c\7\62\2\2\u024c\u024d\5(\25\2\u024d\u024e"+
		"\7]\2\2\u024e\u024f\5\u00acW\2\u024f\u0250\7O\2\2\u0250\u0251\5\u00ba"+
		"^\2\u0251\u0252\7\21\2\2\u0252-\3\2\2\2\u0253\u0254\5\u00e6t\2\u0254/"+
		"\3\2\2\2\u0255\u0256\7\u0096\2\2\u0256\61\3\2\2\2\u0257\u0258\7\u0083"+
		"\2\2\u0258\u025a\5\u0098M\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a"+
		"\u025c\3\2\2\2\u025b\u025d\5\u00dan\2\u025c\u025b\3\2\2\2\u025c\u025d"+
		"\3\2\2\2\u025d\u025f\3\2\2\2\u025e\u0260\5\u0142\u00a2\2\u025f\u025e\3"+
		"\2\2\2\u025f\u0260\3\2\2\2\u0260\63\3\2\2\2\u0261\u0262\7\u008f\2\2\u0262"+
		"\65\3\2\2\2\u0263\u0264\7D\2\2\u0264\u0268\5> \2\u0265\u0267\5\u01ba\u00de"+
		"\2\u0266\u0265\3\2\2\2\u0267\u026a\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0269"+
		"\3\2\2\2\u0269\u026e\3\2\2\2\u026a\u0268\3\2\2\2\u026b\u026d\5r:\2\u026c"+
		"\u026b\3\2\2\2\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2"+
		"\2\2\u026f\u0271\3\2\2\2\u0270\u026e\3\2\2\2\u0271\u0272\7@\2\2\u0272"+
		"\u0273\7D\2\2\u0273\u0274\7\21\2\2\u0274\67\3\2\2\2\u0275\u0287\5\u019c"+
		"\u00cf\2\u0276\u0287\5\u019a\u00ce\2\u0277\u0287\5\u01b4\u00db\2\u0278"+
		"\u0287\5\u01a8\u00d5\2\u0279\u0287\5v<\2\u027a\u0287\5\u018c\u00c7\2\u027b"+
		"\u0287\5\u01be\u00e0\2\u027c\u0287\5\u00c0a\2\u027d\u0287\5\20\t\2\u027e"+
		"\u0287\5P)\2\u027f\u0287\5,\27\2\u0280\u0287\5&\24\2\u0281\u0287\5t;\2"+
		"\u0282\u0287\5\u008eH\2\u0283\u0287\5\u01ba\u00de\2\u0284\u0287\5\u00e0"+
		"q\2\u0285\u0287\5\u00e2r\2\u0286\u0275\3\2\2\2\u0286\u0276\3\2\2\2\u0286"+
		"\u0277\3\2\2\2\u0286\u0278\3\2\2\2\u0286\u0279\3\2\2\2\u0286\u027a\3\2"+
		"\2\2\u0286\u027b\3\2\2\2\u0286\u027c\3\2\2\2\u0286\u027d\3\2\2\2\u0286"+
		"\u027e\3\2\2\2\u0286\u027f\3\2\2\2\u0286\u0280\3\2\2\2\u0286\u0281\3\2"+
		"\2\2\u0286\u0282\3\2\2\2\u0286\u0283\3\2\2\2\u0286\u0284\3\2\2\2\u0286"+
		"\u0285\3\2\2\2\u02879\3\2\2\2\u0288\u028a\58\35\2\u0289\u0288\3\2\2\2"+
		"\u028a\u028d\3\2\2\2\u028b\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028c;\3"+
		"\2\2\2\u028d\u028b\3\2\2\2\u028e\u0292\5\u00d6l\2\u028f\u0290\5\u00da"+
		"n\2\u0290\u0291\7\21\2\2\u0291\u0293\3\2\2\2\u0292\u028f\3\2\2\2\u0292"+
		"\u0293\3\2\2\2\u0293\u0295\3\2\2\2\u0294\u028e\3\2\2\2\u0294\u0295\3\2"+
		"\2\2\u0295\u029c\3\2\2\2\u0296\u029a\5\u013e\u00a0\2\u0297\u0298\5\u0142"+
		"\u00a2\2\u0298\u0299\7\21\2\2\u0299\u029b\3\2\2\2\u029a\u0297\3\2\2\2"+
		"\u029a\u029b\3\2\2\2\u029b\u029d\3\2\2\2\u029c\u0296\3\2\2\2\u029c\u029d"+
		"\3\2\2\2\u029d=\3\2\2\2\u029e\u029f\5\u0108\u0085\2\u029f\u02a0\7\3\2"+
		"\2\u02a0\u02a1\5\u00f0y\2\u02a1\u02a2\7\4\2\2\u02a2\u02a5\3\2\2\2\u02a3"+
		"\u02a5\5\u0120\u0091\2\u02a4\u029e\3\2\2\2\u02a4\u02a3\3\2\2\2\u02a5?"+
		"\3\2\2\2\u02a6\u02a7\5\u0108\u0085\2\u02a7\u02a8\7\20\2\2\u02a8\u02ad"+
		"\7\64\2\2\u02a9\u02aa\7\3\2\2\u02aa\u02ab\5\u00ba^\2\u02ab\u02ac\7\4\2"+
		"\2\u02ac\u02ae\3\2\2\2\u02ad\u02a9\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02b0"+
		"\3\2\2\2\u02af\u02b1\7O\2\2\u02b0\u02af\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1"+
		"\u02b2\3\2\2\2\u02b2\u02b3\5<\37\2\u02b3\u02b4\5:\36\2\u02b4\u02b5\7\63"+
		"\2\2\u02b5\u02b6\5B\"\2\u02b6\u02b7\7@\2\2\u02b7\u02b9\7\64\2\2\u02b8"+
		"\u02ba\5\u0108\u0085\2\u02b9\u02b8\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bb"+
		"\3\2\2\2\u02bb\u02bc\7\21\2\2\u02bcA\3\2\2\2\u02bd\u02bf\5`\61\2\u02be"+
		"\u02bd\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2"+
		"\2\2\u02c1C\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c5\5\u010a\u0086\2\u02c4"+
		"\u02c3\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\78"+
		"\2\2\u02c7\u02c8\5\u00ba^\2\u02c8\u02ca\7O\2\2\u02c9\u02cb\5F$\2\u02ca"+
		"\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd\3\2"+
		"\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02cf\7@\2\2\u02cf\u02d1\78\2\2\u02d0\u02d2"+
		"\5\u0108\u0085\2\u02d1\u02d0\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d3\3"+
		"\2\2\2\u02d3\u02d4\7\21\2\2\u02d4E\3\2\2\2\u02d5\u02d6\7\u0086\2\2\u02d6"+
		"\u02d7\5L\'\2\u02d7\u02d8\7\30\2\2\u02d8\u02d9\5\u0180\u00c1\2\u02d9G"+
		"\3\2\2\2\u02da\u02db\7\u0092\2\2\u02dbI\3\2\2\2\u02dc\u02e1\5\u0194\u00cb"+
		"\2\u02dd\u02e1\5\u0196\u00cc\2\u02de\u02e1\5\u0090I\2\u02df\u02e1\7a\2"+
		"\2\u02e0\u02dc\3\2\2\2\u02e0\u02dd\3\2\2\2\u02e0\u02de\3\2\2\2\u02e0\u02df"+
		"\3\2\2\2\u02e1K\3\2\2\2\u02e2\u02e7\5J&\2\u02e3\u02e4\7\34\2\2\u02e4\u02e6"+
		"\5J&\2\u02e5\u02e3\3\2\2\2\u02e6\u02e9\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e7"+
		"\u02e8\3\2\2\2\u02e8M\3\2\2\2\u02e9\u02e7\3\2\2\2\u02ea\u02eb\7D\2\2\u02eb"+
		"\u02ef\5T+\2\u02ec\u02ed\5\62\32\2\u02ed\u02ee\7\21\2\2\u02ee\u02f0\3"+
		"\2\2\2\u02ef\u02ec\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f2\3\2\2\2\u02f1"+
		"\u02f3\5\66\34\2\u02f2\u02f1\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f4\3"+
		"\2\2\2\u02f4\u02f5\7@\2\2\u02f5\u02f6\7D\2\2\u02f6\u02f7\7\21\2\2\u02f7"+
		"O\3\2\2\2\u02f8\u02f9\79\2\2\u02f9\u02fb\5\u00e6t\2\u02fa\u02fc\7O\2\2"+
		"\u02fb\u02fa\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fe\3\2\2\2\u02fd\u02ff"+
		"\5\u00d6l\2\u02fe\u02fd\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0301\3\2\2"+
		"\2\u0300\u0302\5\u013e\u00a0\2\u0301\u0300\3\2\2\2\u0301\u0302\3\2\2\2"+
		"\u0302\u0303\3\2\2\2\u0303\u0304\7@\2\2\u0304\u0306\79\2\2\u0305\u0307"+
		"\5\u0196\u00cc\2\u0306\u0305\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0308\3"+
		"\2\2\2\u0308\u0309\7\21\2\2\u0309Q\3\2\2\2\u030a\u030b\5\u0108\u0085\2"+
		"\u030b\u030c\7\20\2\2\u030c\u030e\5\u00f4{\2\u030d\u030f\5\u00dan\2\u030e"+
		"\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0311\3\2\2\2\u0310\u0312\5\u0142"+
		"\u00a2\2\u0311\u0310\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0313\3\2\2\2\u0313"+
		"\u0314\7\21\2\2\u0314S\3\2\2\2\u0315\u0316\5\u00f6|\2\u0316\u0317\7\20"+
		"\2\2\u0317\u0318\5\u0120\u0091\2\u0318U\3\2\2\2\u0319\u031c\5\34\17\2"+
		"\u031a\u031c\5\u0168\u00b5\2\u031b\u0319\3\2\2\2\u031b\u031a\3\2\2\2\u031c"+
		"W\3\2\2\2\u031d\u031f\5\u010a\u0086\2\u031e\u031d\3\2\2\2\u031e\u031f"+
		"\3\2\2\2\u031f\u0321\3\2\2\2\u0320\u0322\7e\2\2\u0321\u0320\3\2\2\2\u0321"+
		"\u0322\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0324\5\36\20\2\u0324\u0325\7"+
		"\21\2\2\u0325Y\3\2\2\2\u0326\u0328\5\u010a\u0086\2\u0327\u0329\7e\2\2"+
		"\u0328\u0327\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u032b"+
		"\5\u0148\u00a5\2\u032b\u032c\7\21\2\2\u032c\u0334\3\2\2\2\u032d\u032f"+
		"\7e\2\2\u032e\u032d\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0330\3\2\2\2\u0330"+
		"\u0331\5\u0148\u00a5\2\u0331\u0332\7\21\2\2\u0332\u0334\3\2\2\2\u0333"+
		"\u0326\3\2\2\2\u0333\u032e\3\2\2\2\u0334[\3\2\2\2\u0335\u0337\5\u010a"+
		"\u0086\2\u0336\u0338\7e\2\2\u0337\u0336\3\2\2\2\u0337\u0338\3\2\2\2\u0338"+
		"\u0339\3\2\2\2\u0339\u033a\5^\60\2\u033a\u0340\3\2\2\2\u033b\u033d\7e"+
		"\2\2\u033c\u033b\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033e\3\2\2\2\u033e"+
		"\u0340\5^\60\2\u033f\u0335\3\2\2\2\u033f\u033c\3\2\2\2\u0340]\3\2\2\2"+
		"\u0341\u0344\5f\64\2\u0342\u0344\5\u0178\u00bd\2\u0343\u0341\3\2\2\2\u0343"+
		"\u0342\3\2\2\2\u0344_\3\2\2\2\u0345\u034d\5@!\2\u0346\u034d\5\u0150\u00a9"+
		"\2\u0347\u034d\5Z.\2\u0348\u034d\5X-\2\u0349\u034d\5\\/\2\u034a\u034d"+
		"\5R*\2\u034b\u034d\5\u00d2j\2\u034c\u0345\3\2\2\2\u034c\u0346\3\2\2\2"+
		"\u034c\u0347\3\2\2\2\u034c\u0348\3\2\2\2\u034c\u0349\3\2\2\2\u034c\u034a"+
		"\3\2\2\2\u034c\u034b\3\2\2\2\u034da\3\2\2\2\u034e\u034f\5\u00ba^\2\u034f"+
		"c\3\2\2\2\u0350\u0351\7\u0082\2\2\u0351\u0352\5b\62\2\u0352e\3\2\2\2\u0353"+
		"\u0354\5\u01ae\u00d8\2\u0354\u0355\7\23\2\2\u0355\u0356\5\u01c6\u00e4"+
		"\2\u0356\u0357\5h\65\2\u0357\u0358\7\21\2\2\u0358g\3\2\2\2\u0359\u035b"+
		"\5\u01c2\u00e2\2\u035a\u035c\5j\66\2\u035b\u035a\3\2\2\2\u035b\u035c\3"+
		"\2\2\2\u035c\u035f\3\2\2\2\u035d\u035e\7\u0086\2\2\u035e\u0360\5b\62\2"+
		"\u035f\u035d\3\2\2\2\u035f\u0360\3\2\2\2\u0360i\3\2\2\2\u0361\u0362\7"+
		"\u0086\2\2\u0362\u0363\5b\62\2\u0363\u0364\7>\2\2\u0364\u0366\5\u01c2"+
		"\u00e2\2\u0365\u0367\5j\66\2\u0366\u0365\3\2\2\2\u0366\u0367\3\2\2\2\u0367"+
		"k\3\2\2\2\u0368\u0369\7:\2\2\u0369\u036a\5\u00e6t\2\u036a\u036b\7]\2\2"+
		"\u036b\u036c\5\u0120\u0091\2\u036c\u036d\7O\2\2\u036d\u036e\5p9\2\u036e"+
		"\u036f\5\66\34\2\u036f\u0371\7@\2\2\u0370\u0372\7:\2\2\u0371\u0370\3\2"+
		"\2\2\u0371\u0372\3\2\2\2\u0372\u0374\3\2\2\2\u0373\u0375\5\u0196\u00cc"+
		"\2\u0374\u0373\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0377"+
		"\7\21\2\2\u0377m\3\2\2\2\u0378\u037c\5\u01ba\u00de\2\u0379\u037c\5,\27"+
		"\2\u037a\u037c\5\u00e0q\2\u037b\u0378\3\2\2\2\u037b\u0379\3\2\2\2\u037b"+
		"\u037a\3\2\2\2\u037co\3\2\2\2\u037d\u037f\5n8\2\u037e\u037d\3\2\2\2\u037f"+
		"\u0382\3\2\2\2\u0380\u037e\3\2\2\2\u0380\u0381\3\2\2\2\u0381q\3\2\2\2"+
		"\u0382\u0380\3\2\2\2\u0383\u0386\5\66\34\2\u0384\u0386\5N(\2\u0385\u0383"+
		"\3\2\2\2\u0385\u0384\3\2\2\2\u0386s\3\2\2\2\u0387\u0388\7D\2\2\u0388\u0389"+
		"\5T+\2\u0389\u038a\5\62\32\2\u038a\u038b\7\21\2\2\u038bu\3\2\2\2\u038c"+
		"\u038d\7;\2\2\u038d\u038e\5\u00e8u\2\u038e\u038f\7\20\2\2\u038f\u0392"+
		"\5\u01aa\u00d6\2\u0390\u0391\7(\2\2\u0391\u0393\5\u00ba^\2\u0392\u0390"+
		"\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0395\7\21\2\2"+
		"\u0395w\3\2\2\2\u0396\u0397\7\60\2\2\u0397\u0398\5\u00eex\2\u0398\u0399"+
		"\7]\2\2\u0399\u039a\5\u01aa\u00d6\2\u039ay\3\2\2\2\u039b\u039e\5\u0166"+
		"\u00b4\2\u039c\u039e\5\u00eex\2\u039d\u039b\3\2\2\2\u039d\u039c\3\2\2"+
		"\2\u039e{\3\2\2\2\u039f\u03a1\5~@\2\u03a0\u039f\3\2\2\2\u03a1\u03a4\3"+
		"\2\2\2\u03a2\u03a0\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3}\3\2\2\2\u03a4\u03a2"+
		"\3\2\2\2\u03a5\u03a8\5\u010c\u0087\2\u03a6\u03a8\5\u01ba\u00de\2\u03a7"+
		"\u03a5\3\2\2\2\u03a7\u03a6\3\2\2\2\u03a8\177\3\2\2\2\u03a9\u03aa\7\u0095"+
		"\2\2\u03aa\u0081\3\2\2\2\u03ab\u03b9\5\u01b4\u00db\2\u03ac\u03b9\5\u01a8"+
		"\u00d5\2\u03ad\u03b9\5\u0128\u0095\2\u03ae\u03b9\5\u00fa~\2\u03af\u03b9"+
		"\5\20\t\2\u03b0\u03b9\5&\24\2\u03b1\u03b9\5P)\2\u03b2\u03b9\5\u00e0q\2"+
		"\u03b3\u03b9\5\u00e2r\2\u03b4\u03b9\5\u00a0Q\2\u03b5\u03b9\5l\67\2\u03b6"+
		"\u03b9\5\u019c\u00cf\2\u03b7\u03b9\5\u0132\u009a\2\u03b8\u03ab\3\2\2\2"+
		"\u03b8\u03ac\3\2\2\2\u03b8\u03ad\3\2\2\2\u03b8\u03ae\3\2\2\2\u03b8\u03af"+
		"\3\2\2\2\u03b8\u03b0\3\2\2\2\u03b8\u03b1\3\2\2\2\u03b8\u03b2\3\2\2\2\u03b8"+
		"\u03b3\3\2\2\2\u03b8\u03b4\3\2\2\2\u03b8\u03b5\3\2\2\2\u03b8\u03b6\3\2"+
		"\2\2\u03b8\u03b7\3\2\2\2\u03b9\u0083\3\2\2\2\u03ba\u03c1\7~\2\2\u03bb"+
		"\u03bc\7m\2\2\u03bc\u03be\5\u00ba^\2\u03bd\u03bb\3\2\2\2\u03bd\u03be\3"+
		"\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c1\7M\2\2\u03c0\u03ba\3\2\2\2\u03c0"+
		"\u03bd\3\2\2\2\u03c1\u0085\3\2\2\2\u03c2\u03c4\5\u0088E\2\u03c3\u03c2"+
		"\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6"+
		"\u0087\3\2\2\2\u03c7\u03c8\5|?\2\u03c8\u03c9\5\u010e\u0088\2\u03c9\u0089"+
		"\3\2\2\2\u03ca\u03cd\5\u00e6t\2\u03cb\u03cd\5\u012a\u0096\2\u03cc\u03ca"+
		"\3\2\2\2\u03cc\u03cb\3\2\2\2\u03cd\u008b\3\2\2\2\u03ce\u03cf\t\3\2\2\u03cf"+
		"\u008d\3\2\2\2\u03d0\u03d1\7<\2\2\u03d1\u03d2\5\u00e4s\2\u03d2\u03d3\7"+
		"+\2\2\u03d3\u03d4\5\u00ba^\2\u03d4\u03d5\7\21\2\2\u03d5\u008f\3\2\2\2"+
		"\u03d6\u03d9\5\u0164\u00b3\2\u03d7\u03d9\5\u01aa\u00d6\2\u03d8\u03d6\3"+
		"\2\2\2\u03d8\u03d7\3\2\2\2\u03d9\u0091\3\2\2\2\u03da\u03db\5L\'\2\u03db"+
		"\u03dc\7\30\2\2\u03dc\u03de\3\2\2\2\u03dd\u03da\3\2\2\2\u03dd\u03de\3"+
		"\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e0\5\u00ba^\2\u03e0\u0093\3\2\2\2"+
		"\u03e1\u03e2\5\u00e8u\2\u03e2\u03e3\7\20\2\2\u03e3\u03e4\5\u0096L\2\u03e4"+
		"\u03e5\7\21\2\2\u03e5\u0095\3\2\2\2\u03e6\u03e7\5\u01aa\u00d6\2\u03e7"+
		"\u0097\3\2\2\2\u03e8\u03e9\7A\2\2\u03e9\u03ee\5\u0120\u0091\2\u03ea\u03eb"+
		"\7\3\2\2\u03eb\u03ec\5\u00e6t\2\u03ec\u03ed\7\4\2\2\u03ed\u03ef\3\2\2"+
		"\2\u03ee\u03ea\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f4\3\2\2\2\u03f0\u03f1"+
		"\7:\2\2\u03f1\u03f4\5\u0120\u0091\2\u03f2\u03f4\7_\2\2\u03f3\u03e8\3\2"+
		"\2\2\u03f3\u03f0\3\2\2\2\u03f3\u03f2\3\2\2\2\u03f4\u0099\3\2\2\2\u03f5"+
		"\u03f6\t\4\2\2\u03f6\u009b\3\2\2\2\u03f7\u03f9\5\u009aN\2\u03f8\u03fa"+
		"\7\24\2\2\u03f9\u03f8\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u009d\3\2\2\2"+
		"\u03fb\u0400\5\u009cO\2\u03fc\u03fd\7\13\2\2\u03fd\u03ff\5\u009cO\2\u03fe"+
		"\u03fc\3\2\2\2\u03ff\u0402\3\2\2\2\u0400\u03fe\3\2\2\2\u0400\u0401\3\2"+
		"\2\2\u0401\u009f\3\2\2\2\u0402\u0400\3\2\2\2\u0403\u0404\7A\2\2\u0404"+
		"\u0405\5\u00e6t\2\u0405\u0406\7O\2\2\u0406\u0407\5\u00a8U\2\u0407\u040a"+
		"\5\u00a4S\2\u0408\u0409\7\63\2\2\u0409\u040b\5\u00b0Y\2\u040a\u0408\3"+
		"\2\2\2\u040a\u040b\3\2\2\2\u040b\u040c\3\2\2\2\u040c\u040e\7@\2\2\u040d"+
		"\u040f\7A\2\2\u040e\u040d\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0411\3\2"+
		"\2\2\u0410\u0412\5\u0196\u00cc\2\u0411\u0410\3\2\2\2\u0411\u0412\3\2\2"+
		"\2\u0412\u0413\3\2\2\2\u0413\u0414\7\21\2\2\u0414\u00a1\3\2\2\2\u0415"+
		"\u0425\5\u019c\u00cf\2\u0416\u0425\5\u019a\u00ce\2\u0417\u0425\5\u01b4"+
		"\u00db\2\u0418\u0425\5\u01a8\u00d5\2\u0419\u0425\5v<\2\u041a\u0425\5\u018c"+
		"\u00c7\2\u041b\u0425\5\u01be\u00e0\2\u041c\u0425\5\u00c0a\2\u041d\u0425"+
		"\5\20\t\2\u041e\u0425\5,\27\2\u041f\u0425\5&\24\2\u0420\u0425\5\u008e"+
		"H\2\u0421\u0425\5\u01ba\u00de\2\u0422\u0425\5\u00e0q\2\u0423\u0425\5\u00e2"+
		"r\2\u0424\u0415\3\2\2\2\u0424\u0416\3\2\2\2\u0424\u0417\3\2\2\2\u0424"+
		"\u0418\3\2\2\2\u0424\u0419\3\2\2\2\u0424\u041a\3\2\2\2\u0424\u041b\3\2"+
		"\2\2\u0424\u041c\3\2\2\2\u0424\u041d\3\2\2\2\u0424\u041e\3\2\2\2\u0424"+
		"\u041f\3\2\2\2\u0424\u0420\3\2\2\2\u0424\u0421\3\2\2\2\u0424\u0422\3\2"+
		"\2\2\u0424\u0423\3\2\2\2\u0425\u00a3\3\2\2\2\u0426\u0428\5\u00a2R\2\u0427"+
		"\u0426\3\2\2\2\u0428\u042b\3\2\2\2\u0429\u0427\3\2\2\2\u0429\u042a\3\2"+
		"\2\2\u042a\u00a5\3\2\2\2\u042b\u0429\3\2\2\2\u042c\u042e\5\u00b2Z\2\u042d"+
		"\u042f\5\u0192\u00ca\2\u042e\u042d\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u00a7"+
		"\3\2\2\2\u0430\u0432\5\u00d6l\2\u0431\u0430\3\2\2\2\u0431\u0432\3\2\2"+
		"\2\u0432\u0434\3\2\2\2\u0433\u0435\5\u013e\u00a0\2\u0434\u0433\3\2\2\2"+
		"\u0434\u0435\3\2\2\2\u0435\u00a9\3\2\2\2\u0436\u043b\5\u00a6T\2\u0437"+
		"\u0438\7\13\2\2\u0438\u043a\5\u00a6T\2\u0439\u0437\3\2\2\2\u043a\u043d"+
		"\3\2\2\2\u043b\u0439\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u0441\3\2\2\2\u043d"+
		"\u043b\3\2\2\2\u043e\u0441\7a\2\2\u043f\u0441\7-\2\2\u0440\u0436\3\2\2"+
		"\2\u0440\u043e\3\2\2\2\u0440\u043f\3\2\2\2\u0441\u00ab\3\2\2\2\u0442\u0443"+
		"\5\u00aaV\2\u0443\u0444\7\20\2\2\u0444\u0445\5\u009aN\2\u0445\u00ad\3"+
		"\2\2\2\u0446\u044a\5X-\2\u0447\u044a\5Z.\2\u0448\u044a\5\u0150\u00a9\2"+
		"\u0449\u0446\3\2\2\2\u0449\u0447\3\2\2\2\u0449\u0448\3\2\2\2\u044a\u00af"+
		"\3\2\2\2\u044b\u044d\5\u00aeX\2\u044c\u044b\3\2\2\2\u044d\u0450\3\2\2"+
		"\2\u044e\u044c\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u00b1\3\2\2\2\u0450\u044e"+
		"\3\2\2\2\u0451\u0455\5\u0196\u00cc\2\u0452\u0455\5H%\2\u0453\u0455\5\u012a"+
		"\u0096\2\u0454\u0451\3\2\2\2\u0454\u0452\3\2\2\2\u0454\u0453\3\2\2\2\u0455"+
		"\u00b3\3\2\2\2\u0456\u0459\5\u00e6t\2\u0457\u0459\5H%\2\u0458\u0456\3"+
		"\2\2\2\u0458\u0457\3\2\2\2\u0459\u00b5\3\2\2\2\u045a\u045b\7\3\2\2\u045b"+
		"\u0460\5\u00b4[\2\u045c\u045d\7\13\2\2\u045d\u045f\5\u00b4[\2\u045e\u045c"+
		"\3\2\2\2\u045f\u0462\3\2\2\2\u0460\u045e\3\2\2\2\u0460\u0461\3\2\2\2\u0461"+
		"\u0463\3\2\2\2\u0462\u0460\3\2\2\2\u0463\u0464\7\4\2\2\u0464\u00b7\3\2"+
		"\2\2\u0465\u0467\5\u010a\u0086\2\u0466\u0465\3\2\2\2\u0466\u0467\3\2\2"+
		"\2\u0467\u0468\3\2\2\2\u0468\u046a\7B\2\2\u0469\u046b\5\u0108\u0085\2"+
		"\u046a\u0469\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046e\3\2\2\2\u046c\u046d"+
		"\7\u0086\2\2\u046d\u046f\5b\62\2\u046e\u046c\3\2\2\2\u046e\u046f\3\2\2"+
		"\2\u046f\u0470\3\2\2\2\u0470\u0471\7\21\2\2\u0471\u00b9\3\2\2\2\u0472"+
		"\u0478\5\u016a\u00b6\2\u0473\u0474\5\u00bc_\2\u0474\u0475\5\u016a\u00b6"+
		"\2\u0475\u0477\3\2\2\2\u0476\u0473\3\2\2\2\u0477\u047a\3\2\2\2\u0478\u0476"+
		"\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u00bb\3\2\2\2\u047a\u0478\3\2\2\2\u047b"+
		"\u047c\t\5\2\2\u047c\u00bd\3\2\2\2\u047d\u0480\5\u0144\u00a3\2\u047e\u047f"+
		"\7\t\2\2\u047f\u0481\5\u0144\u00a3\2\u0480\u047e\3\2\2\2\u0480\u0481\3"+
		"\2\2\2\u0481\u0487\3\2\2\2\u0482\u0483\7)\2\2\u0483\u0487\5\u0144\u00a3"+
		"\2\u0484\u0485\7[\2\2\u0485\u0487\5\u0144\u00a3\2\u0486\u047d\3\2\2\2"+
		"\u0486\u0482\3\2\2\2\u0486\u0484\3\2\2\2\u0487\u00bf\3\2\2\2\u0488\u0489"+
		"\7C\2\2\u0489\u048a\5\u00e8u\2\u048a\u048b\7\20\2\2\u048b\u048d\5\u01aa"+
		"\u00d6\2\u048c\u048e\5\u00c4c\2\u048d\u048c\3\2\2\2\u048d\u048e\3\2\2"+
		"\2\u048e\u048f\3\2\2\2\u048f\u0490\7\21\2\2\u0490\u00c1\3\2\2\2\u0491"+
		"\u0492\5\u00ba^\2\u0492\u00c3\3\2\2\2\u0493\u0494\7_\2\2\u0494\u0496\5"+
		"\u00ba^\2\u0495\u0493\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u0497\3\2\2\2"+
		"\u0497\u0498\7O\2\2\u0498\u0499\5\u00c2b\2\u0499\u00c5\3\2\2\2\u049a\u049b"+
		"\7C\2\2\u049b\u049c\7]\2\2\u049c\u049d\5\u0120\u0091\2\u049d\u00c7\3\2"+
		"\2\2\u049e\u049f\5\u0166\u00b4\2\u049f\u00c9\3\2\2\2\u04a0\u04a1\5\u0100"+
		"\u0081\2\u04a1\u00cb\3\2\2\2\u04a2\u04a7\5\u0120\u0091\2\u04a3\u04a4\7"+
		"\3\2\2\u04a4\u04a5\5\u0120\u0091\2\u04a5\u04a6\7\4\2\2\u04a6\u04a8\3\2"+
		"\2\2\u04a7\u04a3\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u00cd\3\2\2\2\u04a9"+
		"\u04aa\7\177\2\2\u04aa\u04ab\5\u00e6t\2\u04ab\u04ac\7O\2\2\u04ac\u04ad"+
		"\5\u01b6\u00dc\2\u04ad\u04ae\7\21\2\2\u04ae\u00cf\3\2\2\2\u04af\u04b4"+
		"\5\u0120\u0091\2\u04b0\u04b1\7\3\2\2\u04b1\u04b2\5\b\5\2\u04b2\u04b3\7"+
		"\4\2\2\u04b3\u04b5\3\2\2\2\u04b4\u04b0\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5"+
		"\u00d1\3\2\2\2\u04b6\u04b7\5\u0108\u0085\2\u04b7\u04b8\7\20\2\2\u04b8"+
		"\u04b9\5\u00d4k\2\u04b9\u04c1\7F\2\2\u04ba\u04bc\58\35\2\u04bb\u04ba\3"+
		"\2\2\2\u04bc\u04bf\3\2\2\2\u04bd\u04bb\3\2\2\2\u04bd\u04be\3\2\2\2\u04be"+
		"\u04c0\3\2\2\2\u04bf\u04bd\3\2\2\2\u04c0\u04c2\7\63\2\2\u04c1\u04bd\3"+
		"\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c6\3\2\2\2\u04c3\u04c5\5`\61\2\u04c4"+
		"\u04c3\3\2\2\2\u04c5\u04c8\3\2\2\2\u04c6\u04c4\3\2\2\2\u04c6\u04c7\3\2"+
		"\2\2\u04c7\u04c9\3\2\2\2\u04c8\u04c6\3\2\2\2\u04c9\u04ca\7@\2\2\u04ca"+
		"\u04cc\7F\2\2\u04cb\u04cd\5\u0108\u0085\2\u04cc\u04cb\3\2\2\2\u04cc\u04cd"+
		"\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04cf\7\21\2\2\u04cf\u00d3\3\2\2\2"+
		"\u04d0\u04d1\7D\2\2\u04d1\u04d5\5\u0138\u009d\2\u04d2\u04d3\7J\2\2\u04d3"+
		"\u04d5\5b\62\2\u04d4\u04d0\3\2\2\2\u04d4\u04d2\3\2\2\2\u04d5\u00d5\3\2"+
		"\2\2\u04d6\u04d7\7G\2\2\u04d7\u04d8\7\3\2\2\u04d8\u04d9\5\u00d8m\2\u04d9"+
		"\u04da\7\4\2\2\u04da\u04db\7\21\2\2\u04db\u00d7\3\2\2\2\u04dc\u04dd\5"+
		"\u0100\u0081\2\u04dd\u00d9\3\2\2\2\u04de\u04df\7G\2\2\u04df\u04e0\7U\2"+
		"\2\u04e0\u04e1\7\3\2\2\u04e1\u04e2\5$\23\2\u04e2\u04e3\7\4\2\2\u04e3\u00db"+
		"\3\2\2\2\u04e4\u04e7\5\u0120\u0091\2\u04e5\u04e7\5H%\2\u04e6\u04e4\3\2"+
		"\2\2\u04e6\u04e5\3\2\2\2\u04e7\u00dd\3\2\2\2\u04e8\u04ed\5\u00dco\2\u04e9"+
		"\u04ea\7\13\2\2\u04ea\u04ec\5\u00dco\2\u04eb\u04e9\3\2\2\2\u04ec\u04ef"+
		"\3\2\2\2\u04ed\u04eb\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u00df\3\2\2\2\u04ef"+
		"\u04ed\3\2\2\2\u04f0\u04f1\7H\2\2\u04f1\u04f2\5\u00e6t\2\u04f2\u04f3\7"+
		"\20\2\2\u04f3\u04f4\5\u0120\u0091\2\u04f4\u04f5\7\3\2\2\u04f5\u04f6\5"+
		"\u00dep\2\u04f6\u04f7\7\4\2\2\u04f7\u04f8\7\21\2\2\u04f8\u00e1\3\2\2\2"+
		"\u04f9\u04fa\7H\2\2\u04fa\u04fb\5\u00e6t\2\u04fb\u04fc\7O\2\2\u04fc\u04fd"+
		"\7\3\2\2\u04fd\u04fe\5\u009eP\2\u04fe\u04ff\7\4\2\2\u04ff\u0500\7\21\2"+
		"\2\u0500\u00e3\3\2\2\2\u0501\u0502\5\u0190\u00c9\2\u0502\u0503\7\20\2"+
		"\2\u0503\u0504\5\u0120\u0091\2\u0504\u00e5\3\2\2\2\u0505\u0506\t\6\2\2"+
		"\u0506\u00e7\3\2\2\2\u0507\u050c\5\u00e6t\2\u0508\u0509\7\13\2\2\u0509"+
		"\u050b\5\u00e6t\2\u050a\u0508\3\2\2\2\u050b\u050e\3\2\2\2\u050c\u050a"+
		"\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u00e9\3\2\2\2\u050e\u050c\3\2\2\2\u050f"+
		"\u0511\5\u010a\u0086\2\u0510\u050f\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0512"+
		"\3\2\2\2\u0512\u0513\7J\2\2\u0513\u0514\5b\62\2\u0514\u0515\7|\2\2\u0515"+
		"\u051d\5\u0180\u00c1\2\u0516\u0517\7?\2\2\u0517\u0518\5b\62\2\u0518\u0519"+
		"\7|\2\2\u0519\u051a\5\u0180\u00c1\2\u051a\u051c\3\2\2\2\u051b\u0516\3"+
		"\2\2\2\u051c\u051f\3\2\2\2\u051d\u051b\3\2\2\2\u051d\u051e\3\2\2\2\u051e"+
		"\u0522\3\2\2\2\u051f\u051d\3\2\2\2\u0520\u0521\7>\2\2\u0521\u0523\5\u0180"+
		"\u00c1\2\u0522\u0520\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u0524\3\2\2\2\u0524"+
		"\u0525\7@\2\2\u0525\u0527\7J\2\2\u0526\u0528\5\u0108\u0085\2\u0527\u0526"+
		"\3\2\2\2\u0527\u0528\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u052a\7\21\2\2"+
		"\u052a\u00eb\3\2\2\2\u052b\u052c\7\177\2\2\u052c\u052d\5\u00e6t\2\u052d"+
		"\u052e\7\21\2\2\u052e\u00ed\3\2\2\2\u052f\u0530\7\3\2\2\u0530\u0535\5"+
		"\u0090I\2\u0531\u0532\7\13\2\2\u0532\u0534\5\u0090I\2\u0533\u0531\3\2"+
		"\2\2\u0534\u0537\3\2\2\2\u0535\u0533\3\2\2\2\u0535\u0536\3\2\2\2\u0536"+
		"\u0538\3\2\2\2\u0537\u0535\3\2\2\2\u0538\u0539\7\4\2\2\u0539\u00ef\3\2"+
		"\2\2\u053a\u053d\5\u0090I\2\u053b\u053d\5\u00ba^\2\u053c\u053a\3\2\2\2"+
		"\u053c\u053b\3\2\2\2\u053d\u00f1\3\2\2\2\u053e\u053f\5\u0120\u0091\2\u053f"+
		"\u0540\7j\2\2\u0540\u0541\7\24\2\2\u0541\u00f3\3\2\2\2\u0542\u0544\79"+
		"\2\2\u0543\u0542\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u0545\3\2\2\2\u0545"+
		"\u0551\5\u0120\u0091\2\u0546\u0547\7A\2\2\u0547\u054c\5\u0120\u0091\2"+
		"\u0548\u0549\7\3\2\2\u0549\u054a\5\u00e6t\2\u054a\u054b\7\4\2\2\u054b"+
		"\u054d\3\2\2\2\u054c\u0548\3\2\2\2\u054c\u054d\3\2\2\2\u054d\u0551\3\2"+
		"\2\2\u054e\u054f\7:\2\2\u054f\u0551\5\u0120\u0091\2\u0550\u0543\3\2\2"+
		"\2\u0550\u0546\3\2\2\2\u0550\u054e\3\2\2\2\u0551\u00f5\3\2\2\2\u0552\u0557"+
		"\5\u0108\u0085\2\u0553\u0554\7\13\2\2\u0554\u0556\5\u0108\u0085\2\u0555"+
		"\u0553\3\2\2\2\u0556\u0559\3\2\2\2\u0557\u0555\3\2\2\2\u0557\u0558\3\2"+
		"\2\2\u0558\u055d\3\2\2\2\u0559\u0557\3\2\2\2\u055a\u055d\7a\2\2\u055b"+
		"\u055d\7-\2\2\u055c\u0552\3\2\2\2\u055c\u055a\3\2\2\2\u055c\u055b\3\2"+
		"\2\2\u055d\u00f7\3\2\2\2\u055e\u0560\7;\2\2\u055f\u055e\3\2\2\2\u055f"+
		"\u0560\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u0562\5\u00e8u\2\u0562\u0564"+
		"\7\20\2\2\u0563\u0565\7L\2\2\u0564\u0563\3\2\2\2\u0564\u0565\3\2\2\2\u0565"+
		"\u0566\3\2\2\2\u0566\u0569\5\u01aa\u00d6\2\u0567\u0568\7(\2\2\u0568\u056a"+
		"\5\u00ba^\2\u0569\u0567\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u00f9\3\2\2"+
		"\2\u056b\u0570\5\u00f8}\2\u056c\u0570\5\u0102\u0082\2\u056d\u0570\5\u0104"+
		"\u0083\2\u056e\u0570\5\u00fe\u0080\2\u056f\u056b\3\2\2\2\u056f\u056c\3"+
		"\2\2\2\u056f\u056d\3\2\2\2\u056f\u056e\3\2\2\2\u0570\u00fb\3\2\2\2\u0571"+
		"\u0572\5\u00fa~\2\u0572\u00fd\3\2\2\2\u0573\u0574\7C\2\2\u0574\u0575\5"+
		"\u00e8u\2\u0575\u0576\7\20\2\2\u0576\u0577\5\u01aa\u00d6\2\u0577\u00ff"+
		"\3\2\2\2\u0578\u057d\5\u00fc\177\2\u0579\u057a\7\21\2\2\u057a\u057c\5"+
		"\u00fc\177\2\u057b\u0579\3\2\2\2\u057c\u057f\3\2\2\2\u057d\u057b\3\2\2"+
		"\2\u057d\u057e\3\2\2\2\u057e\u0101\3\2\2\2\u057f\u057d\3\2\2\2\u0580\u0582"+
		"\7v\2\2\u0581\u0580\3\2\2\2\u0581\u0582\3\2\2\2\u0582\u0583\3\2\2\2\u0583"+
		"\u0584\5\u00e8u\2\u0584\u0586\7\20\2\2\u0585\u0587\5\u011c\u008f\2\u0586"+
		"\u0585\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u058a\5\u01aa"+
		"\u00d6\2\u0589\u058b\7\67\2\2\u058a\u0589\3\2\2\2\u058a\u058b\3\2\2\2"+
		"\u058b\u058e\3\2\2\2\u058c\u058d\7(\2\2\u058d\u058f\5\u00ba^\2\u058e\u058c"+
		"\3\2\2\2\u058e\u058f\3\2\2\2\u058f\u0103\3\2\2\2\u0590\u0592\7\u0084\2"+
		"\2\u0591\u0590\3\2\2\2\u0591\u0592\3\2\2\2\u0592\u0593\3\2\2\2\u0593\u0594"+
		"\5\u00e8u\2\u0594\u0596\7\20\2\2\u0595\u0597\5\u011c\u008f\2\u0596\u0595"+
		"\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u059b\5\u01aa\u00d6"+
		"\2\u0599\u059a\7(\2\2\u059a\u059c\5\u00ba^\2\u059b\u0599\3\2\2\2\u059b"+
		"\u059c\3\2\2\2\u059c\u0105\3\2\2\2\u059d\u059e\7\u0087\2\2\u059e\u05a2"+
		"\5b\62\2\u059f\u05a0\7D\2\2\u05a0\u05a2\5\u0138\u009d\2\u05a1\u059d\3"+
		"\2\2\2\u05a1\u059f\3\2\2\2\u05a2\u0107\3\2\2\2\u05a3\u05a4\5\u00e6t\2"+
		"\u05a4\u0109\3\2\2\2\u05a5\u05a6\5\u0108\u0085\2\u05a6\u05a7\7\20\2\2"+
		"\u05a7\u010b\3\2\2\2\u05a8\u05a9\7Q\2\2\u05a9\u05aa\5\u0114\u008b\2\u05aa"+
		"\u05ab\7\21\2\2\u05ab\u010d\3\2\2\2\u05ac\u05af\5\u0174\u00bb\2\u05ad"+
		"\u05af\5\u0146\u00a4\2\u05ae\u05ac\3\2\2\2\u05ae\u05ad\3\2\2\2\u05af\u010f"+
		"\3\2\2\2\u05b0\u05b6\5\u0126\u0094\2\u05b1\u05b6\5\u00b4[\2\u05b2\u05b6"+
		"\5\u0198\u00cd\2\u05b3\u05b6\5\64\33\2\u05b4\u05b6\7\\\2\2\u05b5\u05b0"+
		"\3\2\2\2\u05b5\u05b1\3\2\2\2\u05b5\u05b2\3\2\2\2\u05b5\u05b3\3\2\2\2\u05b5"+
		"\u05b4\3\2\2\2\u05b6\u0111\3\2\2\2\u05b7\u05b8\5\u00e6t\2\u05b8\u0113"+
		"\3\2\2\2\u05b9\u05be\5\u0112\u008a\2\u05ba\u05bb\7\13\2\2\u05bb\u05bd"+
		"\5\u0112\u008a\2\u05bc\u05ba\3\2\2\2\u05bd\u05c0\3\2\2\2\u05be\u05bc\3"+
		"\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u0115\3\2\2\2\u05c0\u05be\3\2\2\2\u05c1"+
		"\u05c2\t\5\2\2\u05c2\u0117\3\2\2\2\u05c3\u05c5\5\u010a\u0086\2\u05c4\u05c3"+
		"\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05c7\3\2\2\2\u05c6\u05c8\5\u0106\u0084"+
		"\2\u05c7\u05c6\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05ca"+
		"\7T\2\2\u05ca\u05cb\5\u0180\u00c1\2\u05cb\u05cc\7@\2\2\u05cc\u05ce\7T"+
		"\2\2\u05cd\u05cf\5\u0108\u0085\2\u05ce\u05cd\3\2\2\2\u05ce\u05cf\3\2\2"+
		"\2\u05cf\u05d0\3\2\2\2\u05d0\u05d1\7\21\2\2\u05d1\u0119\3\2\2\2\u05d2"+
		"\u05d3\t\7\2\2\u05d3\u011b\3\2\2\2\u05d4\u05d5\t\b\2\2\u05d5\u011d\3\2"+
		"\2\2\u05d6\u05d7\t\t\2\2\u05d7\u011f\3\2\2\2\u05d8\u05db\5\u0196\u00cc"+
		"\2\u05d9\u05db\5\u012a\u0096\2\u05da\u05d8\3\2\2\2\u05da\u05d9\3\2\2\2"+
		"\u05db\u05fb\3\2\2\2\u05dc\u05dd\7\r\2\2\u05dd\u05f8\5\u01ac\u00d7\2\u05de"+
		"\u05df\7\u0090\2\2\u05df\u05f8\5\16\b\2\u05e0\u05e2\5\u0192\u00ca\2\u05e1"+
		"\u05e0\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u05f8\5*"+
		"\26\2\u05e4\u05e5\7\3\2\2\u05e5\u05ea\5\u00ba^\2\u05e6\u05e7\7\13\2\2"+
		"\u05e7\u05e9\5\u00ba^\2\u05e8\u05e6\3\2\2\2\u05e9\u05ec\3\2\2\2\u05ea"+
		"\u05e8\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u05ed\3\2\2\2\u05ec\u05ea\3\2"+
		"\2\2\u05ed\u05ee\7\4\2\2\u05ee\u05f8\3\2\2\2\u05ef\u05f0\7\3\2\2\u05f0"+
		"\u05f1\5\b\5\2\u05f1\u05f2\7\4\2\2\u05f2\u05f8\3\2\2\2\u05f3\u05f4\7\3"+
		"\2\2\u05f4\u05f5\5\u0090I\2\u05f5\u05f6\7\4\2\2\u05f6\u05f8\3\2\2\2\u05f7"+
		"\u05dc\3\2\2\2\u05f7\u05de\3\2\2\2\u05f7\u05e1\3\2\2\2\u05f7\u05e4\3\2"+
		"\2\2\u05f7\u05ef\3\2\2\2\u05f7\u05f3\3\2\2\2\u05f8\u05fa\3\2\2\2\u05f9"+
		"\u05f7\3\2\2\2\u05fa\u05fd\3\2\2\2\u05fb\u05f9\3\2\2\2\u05fb\u05fc\3\2"+
		"\2\2\u05fc\u0121\3\2\2\2\u05fd\u05fb\3\2\2\2\u05fe\u0600\5\u010a\u0086"+
		"\2\u05ff\u05fe\3\2\2\2\u05ff\u0600\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u0603"+
		"\7Y\2\2\u0602\u0604\5\u0108\u0085\2\u0603\u0602\3\2\2\2\u0603\u0604\3"+
		"\2\2\2\u0604\u0607\3\2\2\2\u0605\u0606\7\u0086\2\2\u0606\u0608\5b\62\2"+
		"\u0607\u0605\3\2\2\2\u0607\u0608\3\2\2\2\u0608\u0609\3\2\2\2\u0609\u060a"+
		"\7\21\2\2\u060a\u0123\3\2\2\2\u060b\u060d\5\u010a\u0086\2\u060c\u060b"+
		"\3\2\2\2\u060c\u060d\3\2\2\2\u060d\u060e\3\2\2\2\u060e\u060f\7\\\2\2\u060f"+
		"\u0610\7\21\2\2\u0610\u0125\3\2\2\2\u0611\u0614\5\2\2\2\u0612\u0614\5"+
		"\u013a\u009e\2\u0613\u0611\3\2\2\2\u0613\u0612\3\2\2\2\u0614\u0127\3\2"+
		"\2\2\u0615\u061a\5v<\2\u0616\u061a\5\u018c\u00c7\2\u0617\u061a\5\u01be"+
		"\u00e0\2\u0618\u061a\5\u00c0a\2\u0619\u0615\3\2\2\2\u0619\u0616\3\2\2"+
		"\2\u0619\u0617\3\2\2\2\u0619\u0618\3\2\2\2\u061a\u0129\3\2\2\2\u061b\u061c"+
		"\5\u0198\u00cd\2\u061c\u012b\3\2\2\2\u061d\u061e\7c\2\2\u061e\u061f\7"+
		"\65\2\2\u061f\u0620\5\u0196\u00cc\2\u0620\u0621\7O\2\2\u0621\u0622\5\u0130"+
		"\u0099\2\u0622\u0625\7@\2\2\u0623\u0624\7c\2\2\u0624\u0626\7\65\2\2\u0625"+
		"\u0623\3\2\2\2\u0625\u0626\3\2\2\2\u0626\u0628\3\2\2\2\u0627\u0629\5\u0196"+
		"\u00cc\2\u0628\u0627\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u062a\3\2\2\2\u062a"+
		"\u062b\7\21\2\2\u062b\u012d\3\2\2\2\u062c\u0638\5\u019c\u00cf\2\u062d"+
		"\u0638\5\u019a\u00ce\2\u062e\u0638\5\u01b4\u00db\2\u062f\u0638\5\u01a8"+
		"\u00d5\2\u0630\u0638\5v<\2\u0631\u0638\5\u01be\u00e0\2\u0632\u0638\5\u00c0"+
		"a\2\u0633\u0638\5\20\t\2\u0634\u0638\5\u01ba\u00de\2\u0635\u0638\5\u00e0"+
		"q\2\u0636\u0638\5\u00e2r\2\u0637\u062c\3\2\2\2\u0637\u062d\3\2\2\2\u0637"+
		"\u062e\3\2\2\2\u0637\u062f\3\2\2\2\u0637\u0630\3\2\2\2\u0637\u0631\3\2"+
		"\2\2\u0637\u0632\3\2\2\2\u0637\u0633\3\2\2\2\u0637\u0634\3\2\2\2\u0637"+
		"\u0635\3\2\2\2\u0637\u0636\3\2\2\2\u0638\u012f\3\2\2\2\u0639\u063b\5\u012e"+
		"\u0098\2\u063a\u0639\3\2\2\2\u063b\u063e\3\2\2\2\u063c\u063a\3\2\2\2\u063c"+
		"\u063d\3\2\2\2\u063d\u0131\3\2\2\2\u063e\u063c\3\2\2\2\u063f\u0640\7c"+
		"\2\2\u0640\u0641\5\u00e6t\2\u0641\u0642\7O\2\2\u0642\u0643\5\u0136\u009c"+
		"\2\u0643\u0645\7@\2\2\u0644\u0646\7c\2\2\u0645\u0644\3\2\2\2\u0645\u0646"+
		"\3\2\2\2\u0646\u0648\3\2\2\2\u0647\u0649\5\u0196\u00cc\2\u0648\u0647\3"+
		"\2\2\2\u0648\u0649\3\2\2\2\u0649\u064a\3\2\2\2\u064a\u064b\7\21\2\2\u064b"+
		"\u0133\3\2\2\2\u064c\u065c\5\u019c\u00cf\2\u064d\u065c\5\u01b4\u00db\2"+
		"\u064e\u065c\5\u01a8\u00d5\2\u064f\u065c\5v<\2\u0650\u065c\5\u018c\u00c7"+
		"\2\u0651\u065c\5\u01be\u00e0\2\u0652\u065c\5\u00c0a\2\u0653\u065c\5\20"+
		"\t\2\u0654\u065c\5P)\2\u0655\u065c\5,\27\2\u0656\u065c\5&\24\2\u0657\u065c"+
		"\5\u008eH\2\u0658\u065c\5\u01ba\u00de\2\u0659\u065c\5\u00e0q\2\u065a\u065c"+
		"\5\u00e2r\2\u065b\u064c\3\2\2\2\u065b\u064d\3\2\2\2\u065b\u064e\3\2\2"+
		"\2\u065b\u064f\3\2\2\2\u065b\u0650\3\2\2\2\u065b\u0651\3\2\2\2\u065b\u0652"+
		"\3\2\2\2\u065b\u0653\3\2\2\2\u065b\u0654\3\2\2\2\u065b\u0655\3\2\2\2\u065b"+
		"\u0656\3\2\2\2\u065b\u0657\3\2\2\2\u065b\u0658\3\2\2\2\u065b\u0659\3\2"+
		"\2\2\u065b\u065a\3\2\2\2\u065c\u0135\3\2\2\2\u065d\u065f\5\u0134\u009b"+
		"\2\u065e\u065d\3\2\2\2\u065f\u0662\3\2\2\2\u0660\u065e\3\2\2\2\u0660\u0661"+
		"\3\2\2\2\u0661\u0137\3\2\2\2\u0662\u0660\3\2\2\2\u0663\u0664\5\u00e6t"+
		"\2\u0664\u0665\7L\2\2\u0665\u0666\5\u0090I\2\u0666\u0139\3\2\2\2\u0667"+
		"\u0669\5\2\2\2\u0668\u0667\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u066a\3\2"+
		"\2\2\u066a\u066b\5\u0120\u0091\2\u066b\u013b\3\2\2\2\u066c\u066d\5\u0166"+
		"\u00b4\2\u066d\u066e\7\u0081\2\2\u066e\u0670\5.\30\2\u066f\u0671\5\u0176"+
		"\u00bc\2\u0670\u066f\3\2\2\2\u0670\u0671\3\2\2\2\u0671\u0672\3\2\2\2\u0672"+
		"\u0673\7@\2\2\u0673\u0675\7\u0081\2\2\u0674\u0676\5\u0196\u00cc\2\u0675"+
		"\u0674\3\2\2\2\u0675\u0676\3\2\2\2\u0676\u013d\3\2\2\2\u0677\u0678\7d"+
		"\2\2\u0678\u0679\7\3\2\2\u0679\u067a\5\u0140\u00a1\2\u067a\u067b\7\4\2"+
		"\2\u067b\u067c\7\21\2\2\u067c\u013f\3\2\2\2\u067d\u067e\5\u0100\u0081"+
		"\2\u067e\u0141\3\2\2\2\u067f\u0680\7d\2\2\u0680\u0681\7U\2\2\u0681\u0682"+
		"\7\3\2\2\u0682\u0683\5$\23\2\u0683\u0684\7\4\2\2\u0684\u0143\3\2\2\2\u0685"+
		"\u0687\5\u0120\u0091\2\u0686\u0688\5\u0192\u00ca\2\u0687\u0686\3\2\2\2"+
		"\u0687\u0688\3\2\2\2\u0688\u0689\3\2\2\2\u0689\u068a\5*\26\2\u068a\u0694"+
		"\3\2\2\2\u068b\u0694\5\u0162\u00b2\2\u068c\u068d\7\3\2\2\u068d\u068e\5"+
		"\u00ba^\2\u068e\u068f\7\4\2\2\u068f\u0694\3\2\2\2\u0690\u0694\5\u0110"+
		"\u0089\2\u0691\u0694\5\24\13\2\u0692\u0694\5\16\b\2\u0693\u0685\3\2\2"+
		"\2\u0693\u068b\3\2\2\2\u0693\u068c\3\2\2\2\u0693\u0690\3\2\2\2\u0693\u0691"+
		"\3\2\2\2\u0693\u0692\3\2\2\2\u0694\u0145\3\2\2\2\u0695\u0699\5\u00a0Q"+
		"\2\u0696\u0699\5l\67\2\u0697\u0699\5\u0132\u009a\2\u0698\u0695\3\2\2\2"+
		"\u0698\u0696\3\2\2\2\u0698\u0697\3\2\2\2\u0699\u0147\3\2\2\2\u069a\u069f"+
		"\5\u0120\u0091\2\u069b\u069c\7\3\2\2\u069c\u069d\5\b\5\2\u069d\u069e\7"+
		"\4\2\2\u069e\u06a0\3\2\2\2\u069f\u069b\3\2\2\2\u069f\u06a0\3\2\2\2\u06a0"+
		"\u0149\3\2\2\2\u06a1\u06a3\5\u010a\u0086\2\u06a2\u06a1\3\2\2\2\u06a2\u06a3"+
		"\3\2\2\2\u06a3\u06a4\3\2\2\2\u06a4\u06a5\5\u0148\u00a5\2\u06a5\u06a6\7"+
		"\21\2\2\u06a6\u014b\3\2\2\2\u06a7\u06b5\5\u019c\u00cf\2\u06a8\u06b5\5"+
		"\u019a\u00ce\2\u06a9\u06b5\5\u01b4\u00db\2\u06aa\u06b5\5\u01a8\u00d5\2"+
		"\u06ab\u06b5\5v<\2\u06ac\u06b5\5\u01be\u00e0\2\u06ad\u06b5\5\u00c0a\2"+
		"\u06ae\u06b5\5\20\t\2\u06af\u06b5\5,\27\2\u06b0\u06b5\5&\24\2\u06b1\u06b5"+
		"\5\u01ba\u00de\2\u06b2\u06b5\5\u00e0q\2\u06b3\u06b5\5\u00e2r\2\u06b4\u06a7"+
		"\3\2\2\2\u06b4\u06a8\3\2\2\2\u06b4\u06a9\3\2\2\2\u06b4\u06aa\3\2\2\2\u06b4"+
		"\u06ab\3\2\2\2\u06b4\u06ac\3\2\2\2\u06b4\u06ad\3\2\2\2\u06b4\u06ae\3\2"+
		"\2\2\u06b4\u06af\3\2\2\2\u06b4\u06b0\3\2\2\2\u06b4\u06b1\3\2\2\2\u06b4"+
		"\u06b2\3\2\2\2\u06b4\u06b3\3\2\2\2\u06b5\u014d\3\2\2\2\u06b6\u06b8\5\u014c"+
		"\u00a7\2\u06b7\u06b6\3\2\2\2\u06b8\u06bb\3\2\2\2\u06b9\u06b7\3\2\2\2\u06b9"+
		"\u06ba\3\2\2\2\u06ba\u014f\3\2\2\2\u06bb\u06b9\3\2\2\2\u06bc\u06be\5\u010a"+
		"\u0086\2\u06bd\u06bc\3\2\2\2\u06bd\u06be\3\2\2\2\u06be\u06c0\3\2\2\2\u06bf"+
		"\u06c1\7e\2\2\u06c0\u06bf\3\2\2\2\u06c0\u06c1\3\2\2\2\u06c1\u06c2\3\2"+
		"\2\2\u06c2\u06c7\7g\2\2\u06c3\u06c4\7\3\2\2\u06c4\u06c5\5\u017e\u00c0"+
		"\2\u06c5\u06c6\7\4\2\2\u06c6\u06c8\3\2\2\2\u06c7\u06c3\3\2\2\2\u06c7\u06c8"+
		"\3\2\2\2\u06c8\u06ca\3\2\2\2\u06c9\u06cb\7O\2\2\u06ca\u06c9\3\2\2\2\u06ca"+
		"\u06cb\3\2\2\2\u06cb\u06cc\3\2\2\2\u06cc\u06cd\5\u014e\u00a8\2\u06cd\u06ce"+
		"\7\63\2\2\u06ce\u06cf\5\u0152\u00aa\2\u06cf\u06d1\7@\2\2\u06d0\u06d2\7"+
		"e\2\2\u06d1\u06d0\3\2\2\2\u06d1\u06d2\3\2\2\2\u06d2\u06d3\3\2\2\2\u06d3"+
		"\u06d5\7g\2\2\u06d4\u06d6\5\u0108\u0085\2\u06d5\u06d4\3\2\2\2\u06d5\u06d6"+
		"\3\2\2\2\u06d6\u06d7\3\2\2\2\u06d7\u06d8\7\21\2\2\u06d8\u0151\3\2\2\2"+
		"\u06d9\u06db\5\u0182\u00c2\2\u06da\u06d9\3\2\2\2\u06db\u06de\3\2\2\2\u06dc"+
		"\u06da\3\2\2\2\u06dc\u06dd\3\2\2\2\u06dd\u0153\3\2\2\2\u06de\u06dc\3\2"+
		"\2\2\u06df\u06e0\7h\2\2\u06e0\u06e1\7\65\2\2\u06e1\u06e2\5\u0158\u00ad"+
		"\2\u06e2\u06e3\7@\2\2\u06e3\u06e4\7h\2\2\u06e4\u06e6\7\65\2\2\u06e5\u06e7"+
		"\5\u0196\u00cc\2\u06e6\u06e5\3\2\2\2\u06e6\u06e7\3\2\2\2\u06e7\u0155\3"+
		"\2\2\2\u06e8\u06f6\5\u019c\u00cf\2\u06e9\u06f6\5\u019a\u00ce\2\u06ea\u06f6"+
		"\5\u01b4\u00db\2\u06eb\u06f6\5\u01a8\u00d5\2\u06ec\u06f6\5v<\2\u06ed\u06f6"+
		"\5\u01be\u00e0\2\u06ee\u06f6\5\u00c0a\2\u06ef\u06f6\5\20\t\2\u06f0\u06f6"+
		"\5,\27\2\u06f1\u06f6\5&\24\2\u06f2\u06f6\5\u01ba\u00de\2\u06f3\u06f6\5"+
		"\u00e0q\2\u06f4\u06f6\5\u00e2r\2\u06f5\u06e8\3\2\2\2\u06f5\u06e9\3\2\2"+
		"\2\u06f5\u06ea\3\2\2\2\u06f5\u06eb\3\2\2\2\u06f5\u06ec\3\2\2\2\u06f5\u06ed"+
		"\3\2\2\2\u06f5\u06ee\3\2\2\2\u06f5\u06ef\3\2\2\2\u06f5\u06f0\3\2\2\2\u06f5"+
		"\u06f1\3\2\2\2\u06f5\u06f2\3\2\2\2\u06f5\u06f3\3\2\2\2\u06f5\u06f4\3\2"+
		"\2\2\u06f6\u0157\3\2\2\2\u06f7\u06f9\5\u0156\u00ac\2\u06f8\u06f7\3\2\2"+
		"\2\u06f9\u06fc\3\2\2\2\u06fa\u06f8\3\2\2\2\u06fa\u06fb\3\2\2\2\u06fb\u0159"+
		"\3\2\2\2\u06fc\u06fa\3\2\2\2\u06fd\u06fe\7h\2\2\u06fe\u06ff\5\u015e\u00b0"+
		"\2\u06ff\u0700\7@\2\2\u0700\u0702\7h\2\2\u0701\u0703\5\u0196\u00cc\2\u0702"+
		"\u0701\3\2\2\2\u0702\u0703\3\2\2\2\u0703\u015b\3\2\2\2\u0704\u0708\5\u01a4"+
		"\u00d3\2\u0705\u0708\5,\27\2\u0706\u0708\5\u01ba\u00de\2\u0707\u0704\3"+
		"\2\2\2\u0707\u0705\3\2\2\2\u0707\u0706\3\2\2\2\u0708\u015d\3\2\2\2\u0709"+
		"\u070b\5\u015c\u00af\2\u070a\u0709\3\2\2\2\u070b\u070e\3\2\2\2\u070c\u070a"+
		"\3\2\2\2\u070c\u070d\3\2\2\2\u070d\u015f\3\2\2\2\u070e\u070c\3\2\2\2\u070f"+
		"\u0712\5\u015a\u00ae\2\u0710\u0712\5\u0154\u00ab\2\u0711\u070f\3\2\2\2"+
		"\u0711\u0710\3\2\2\2\u0712\u0161\3\2\2\2\u0713\u0714\5\u0120\u0091\2\u0714"+
		"\u071a\7\u0090\2\2\u0715\u071b\5\16\b\2\u0716\u0717\7\3\2\2\u0717\u0718"+
		"\5\u00ba^\2\u0718\u0719\7\4\2\2\u0719\u071b\3\2\2\2\u071a\u0715\3\2\2"+
		"\2\u071a\u0716\3\2\2\2\u071b\u0163\3\2\2\2\u071c\u071d\5\u0194\u00cb\2"+
		"\u071d\u071e\5\u008cG\2\u071e\u071f\5\u0194\u00cb\2\u071f\u0722\3\2\2"+
		"\2\u0720\u0722\5\u0120\u0091\2\u0721\u071c\3\2\2\2\u0721\u0720\3\2\2\2"+
		"\u0722\u0165\3\2\2\2\u0723\u0724\7j\2\2\u0724\u0725\5\u0164\u00b3\2\u0725"+
		"\u0167\3\2\2\2\u0726\u0728\7k\2\2\u0727\u0729\5\u0094K\2\u0728\u0727\3"+
		"\2\2\2\u0729\u072a\3\2\2\2\u072a\u0728\3\2\2\2\u072a\u072b\3\2\2\2\u072b"+
		"\u072c\3\2\2\2\u072c\u072d\7@\2\2\u072d\u072f\7k\2\2\u072e\u0730\5\u0196"+
		"\u00cc\2\u072f\u072e\3\2\2\2\u072f\u0730\3\2\2\2\u0730\u0169\3\2\2\2\u0731"+
		"\u0735\5\u0184\u00c3\2\u0732\u0733\5\u016c\u00b7\2\u0733\u0734\5\u0184"+
		"\u00c3\2\u0734\u0736\3\2\2\2\u0735\u0732\3\2\2\2\u0735\u0736\3\2\2\2\u0736"+
		"\u016b\3\2\2\2\u0737\u0738\t\n\2\2\u0738\u016d\3\2\2\2\u0739\u073b\5\u010a"+
		"\u0086\2\u073a\u0739\3\2\2\2\u073a\u073b\3\2\2\2\u073b\u073c\3\2\2\2\u073c"+
		"\u073d\7o\2\2\u073d\u0740\5\u00ba^\2\u073e\u073f\7t\2\2\u073f\u0741\5"+
		"\u00ba^\2\u0740\u073e\3\2\2\2\u0740\u0741\3\2\2\2\u0741\u0742\3\2\2\2"+
		"\u0742\u0743\7\21\2\2\u0743\u016f\3\2\2\2\u0744\u0746\5\u010a\u0086\2"+
		"\u0745\u0744\3\2\2\2\u0745\u0746\3\2\2\2\u0746\u0747\3\2\2\2\u0747\u0749"+
		"\7p\2\2\u0748\u074a\5\u00ba^\2\u0749\u0748\3\2\2\2\u0749\u074a\3\2\2\2"+
		"\u074a\u074b\3\2\2\2\u074b\u074c\7\21\2\2\u074c\u0171\3\2\2\2\u074d\u0751"+
		"\5\u00b6\\\2\u074e\u0751\5\u0166\u00b4\2\u074f\u0751\5\u013c\u009f\2\u0750"+
		"\u074d\3\2\2\2\u0750\u074e\3\2\2\2\u0750\u074f\3\2\2\2\u0751\u0173\3\2"+
		"\2\2\u0752\u0755\5\26\f\2\u0753\u0755\5\u012c\u0097\2\u0754\u0752\3\2"+
		"\2\2\u0754\u0753\3\2\2\2\u0755\u0175\3\2\2\2\u0756\u0757\5\u00e6t\2\u0757"+
		"\u0758\7\25\2\2\u0758\u0759\5\u013a\u009e\2\u0759\u075a\7\21\2\2\u075a"+
		"\u0177\3\2\2\2\u075b\u075c\7\u0088\2\2\u075c\u075d\5\u00ba^\2\u075d\u075e"+
		"\7s\2\2\u075e\u075f\5\u01ae\u00d8\2\u075f\u0760\7\23\2\2\u0760\u0761\5"+
		"\u01c6\u00e4\2\u0761\u0762\5\u017a\u00be\2\u0762\u0763\7\21\2\2\u0763"+
		"\u0179\3\2\2\2\u0764\u0765\5\u01c2\u00e2\2\u0765\u0766\7\u0086\2\2\u0766"+
		"\u076e\5L\'\2\u0767\u0768\7\13\2\2\u0768\u0769\5\u01c2\u00e2\2\u0769\u076a"+
		"\7\u0086\2\2\u076a\u076b\5L\'\2\u076b\u076d\3\2\2\2\u076c\u0767\3\2\2"+
		"\2\u076d\u0770\3\2\2\2\u076e\u076c\3\2\2\2\u076e\u076f\3\2\2\2\u076f\u017b"+
		"\3\2\2\2\u0770\u076e\3\2\2\2\u0771\u0772\7^\2\2\u0772\u0773\5\u017e\u00c0"+
		"\2\u0773\u017d\3\2\2\2\u0774\u0779\5\u0120\u0091\2\u0775\u0776\7\13\2"+
		"\2\u0776\u0778\5\u0120\u0091\2\u0777\u0775\3\2\2\2\u0778\u077b\3\2\2\2"+
		"\u0779\u0777\3\2\2\2\u0779\u077a\3\2\2\2\u077a\u017f\3\2\2\2\u077b\u0779"+
		"\3\2\2\2\u077c\u077e\5\u0182\u00c2\2\u077d\u077c\3\2\2\2\u077e\u0781\3"+
		"\2\2\2\u077f\u077d\3\2\2\2\u077f\u0780\3\2\2\2\u0780\u0181\3\2\2\2\u0781"+
		"\u077f\3\2\2\2\u0782\u0790\5\u01c0\u00e1\2\u0783\u0790\5 \21\2\u0784\u0790"+
		"\5\u016e\u00b8\2\u0785\u0790\5\u00eav\2\u0786\u0790\5D#\2\u0787\u0790"+
		"\5\u0122\u0092\2\u0788\u0790\5\u00b8]\2\u0789\u0790\5\u0170\u00b9\2\u078a"+
		"\u0790\5\u0124\u0093\2\u078b\u0790\5\u0118\u008d\2\u078c\u0790\5\u014a"+
		"\u00a6\2\u078d\u0790\5\u01bc\u00df\2\u078e\u0790\5\u018a\u00c6\2\u078f"+
		"\u0782\3\2\2\2\u078f\u0783\3\2\2\2\u078f\u0784\3\2\2\2\u078f\u0785\3\2"+
		"\2\2\u078f\u0786\3\2\2\2\u078f\u0787\3\2\2\2\u078f\u0788\3\2\2\2\u078f"+
		"\u0789\3\2\2\2\u078f\u078a\3\2\2\2\u078f\u078b\3\2\2\2\u078f\u078c\3\2"+
		"\2\2\u078f\u078d\3\2\2\2\u078f\u078e\3\2\2\2\u0790\u0183\3\2\2\2\u0791"+
		"\u0795\5\u0194\u00cb\2\u0792\u0793\5\u0186\u00c4\2\u0793\u0794\5\u0194"+
		"\u00cb\2\u0794\u0796\3\2\2\2\u0795\u0792\3\2\2\2\u0795\u0796\3\2\2\2\u0796"+
		"\u0185\3\2\2\2\u0797\u0798\t\13\2\2\u0798\u0187\3\2\2\2\u0799\u079a\t"+
		"\f\2\2\u079a\u0189\3\2\2\2\u079b\u079d\5\u010a\u0086\2\u079c\u079b\3\2"+
		"\2\2\u079c\u079d\3\2\2\2\u079d\u079e\3\2\2\2\u079e\u079f\5\u01ae\u00d8"+
		"\2\u079f\u07a1\7\23\2\2\u07a0\u07a2\5\u0084C\2\u07a1\u07a0\3\2\2\2\u07a1"+
		"\u07a2\3\2\2\2\u07a2\u07a3\3\2\2\2\u07a3\u07a4\5\u01c2\u00e2\2\u07a4\u07a5"+
		"\7\21\2\2\u07a5\u018b\3\2\2\2\u07a6\u07a7\7v\2\2\u07a7\u07a8\5\u00e8u"+
		"\2\u07a8\u07a9\7\20\2\2\u07a9\u07ab\5\u01aa\u00d6\2\u07aa\u07ac\5\u018e"+
		"\u00c8\2\u07ab\u07aa\3\2\2\2\u07ab\u07ac\3\2\2\2\u07ac\u07af\3\2\2\2\u07ad"+
		"\u07ae\7(\2\2\u07ae\u07b0\5\u00ba^\2\u07af\u07ad\3\2\2\2\u07af\u07b0\3"+
		"\2\2\2\u07b0\u07b1\3\2\2\2\u07b1\u07b2\7\21\2\2\u07b2\u018d\3\2\2\2\u07b3"+
		"\u07b4\t\r\2\2\u07b4\u018f\3\2\2\2\u07b5\u07ba\5\u0120\u0091\2\u07b6\u07b7"+
		"\7\13\2\2\u07b7\u07b9\5\u0120\u0091\2\u07b8\u07b6\3\2\2\2\u07b9\u07bc"+
		"\3\2\2\2\u07ba\u07b8\3\2\2\2\u07ba\u07bb\3\2\2\2\u07bb\u07c0\3\2\2\2\u07bc"+
		"\u07ba\3\2\2\2\u07bd\u07c0\7a\2\2\u07be\u07c0\7-\2\2\u07bf\u07b5\3\2\2"+
		"\2\u07bf\u07bd\3\2\2\2\u07bf\u07be\3\2\2\2\u07c0\u0191\3\2\2\2\u07c1\u07ca"+
		"\7\31\2\2\u07c2\u07c7\5\u0120\u0091\2\u07c3\u07c4\7\13\2\2\u07c4\u07c6"+
		"\5\u0120\u0091\2\u07c5\u07c3\3\2\2\2\u07c6\u07c9\3\2\2\2\u07c7\u07c5\3"+
		"\2\2\2\u07c7\u07c8\3\2\2\2\u07c8\u07cb\3\2\2\2\u07c9\u07c7\3\2\2\2\u07ca"+
		"\u07c2\3\2\2\2\u07ca\u07cb\3\2\2\2\u07cb\u07ce\3\2\2\2\u07cc\u07cd\7p"+
		"\2\2\u07cd\u07cf\5\u0120\u0091\2\u07ce\u07cc\3\2\2\2\u07ce\u07cf\3\2\2"+
		"\2\u07cf\u07d0\3\2\2\2\u07d0\u07d1\7\32\2\2\u07d1\u0193\3\2\2\2\u07d2"+
		"\u07d4\5\u0188\u00c5\2\u07d3\u07d2\3\2\2\2\u07d3\u07d4\3\2\2\2\u07d4\u07d5"+
		"\3\2\2\2\u07d5\u07db\5\u01b0\u00d9\2\u07d6\u07d7\5\f\7\2\u07d7\u07d8\5"+
		"\u01b0\u00d9\2\u07d8\u07da\3\2\2\2\u07d9\u07d6\3\2\2\2\u07da\u07dd\3\2"+
		"\2\2\u07db\u07d9\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc\u0195\3\2\2\2\u07dd"+
		"\u07db\3\2\2\2\u07de\u07df\5\u00e6t\2\u07df\u0197\3\2\2\2\u07e0\u07e1"+
		"\7\u0094\2\2\u07e1\u0199\3\2\2\2\u07e2\u07e3\5\u01a4\u00d3\2\u07e3\u07e4"+
		"\7O\2\2\u07e4\u07e5\5\u01a0\u00d1\2\u07e5\u07e6\7\63\2\2\u07e6\u07e7\5"+
		"\u01a6\u00d4\2\u07e7\u07e9\7@\2\2\u07e8\u07ea\5\u01a2\u00d2\2\u07e9\u07e8"+
		"\3\2\2\2\u07e9\u07ea\3\2\2\2\u07ea\u07ec\3\2\2\2\u07eb\u07ed\5\u008aF"+
		"\2\u07ec\u07eb\3\2\2\2\u07ec\u07ed\3\2\2\2\u07ed\u07ee\3\2\2\2\u07ee\u07ef"+
		"\7\21\2\2\u07ef\u019b\3\2\2\2\u07f0\u07f1\5\u01a4\u00d3\2\u07f1\u07f2"+
		"\7\21\2\2\u07f2\u019d\3\2\2\2\u07f3\u0801\5\u019c\u00cf\2\u07f4\u0801"+
		"\5\u019a\u00ce\2\u07f5\u0801\5\u01b4\u00db\2\u07f6\u0801\5\u01a8\u00d5"+
		"\2\u07f7\u0801\5v<\2\u07f8\u0801\5\u01be\u00e0\2\u07f9\u0801\5\u00c0a"+
		"\2\u07fa\u0801\5\20\t\2\u07fb\u0801\5,\27\2\u07fc\u0801\5&\24\2\u07fd"+
		"\u0801\5\u01ba\u00de\2\u07fe\u0801\5\u00e0q\2\u07ff\u0801\5\u00e2r\2\u0800"+
		"\u07f3\3\2\2\2\u0800\u07f4\3\2\2\2\u0800\u07f5\3\2\2\2\u0800\u07f6\3\2"+
		"\2\2\u0800\u07f7\3\2\2\2\u0800\u07f8\3\2\2\2\u0800\u07f9\3\2\2\2\u0800"+
		"\u07fa\3\2\2\2\u0800\u07fb\3\2\2\2\u0800\u07fc\3\2\2\2\u0800\u07fd\3\2"+
		"\2\2\u0800\u07fe\3\2\2\2\u0800\u07ff\3\2\2\2\u0801\u019f\3\2\2\2\u0802"+
		"\u0804\5\u019e\u00d0\2\u0803\u0802\3\2\2\2\u0804\u0807\3\2\2\2\u0805\u0803"+
		"\3\2\2\2\u0805\u0806\3\2\2\2\u0806\u01a1\3\2\2\2\u0807\u0805\3\2\2\2\u0808"+
		"\u0809\t\16\2\2\u0809\u01a3\3\2\2\2\u080a\u080b\7f\2\2\u080b\u0810\5\u008a"+
		"F\2\u080c\u080d\7\3\2\2\u080d\u080e\5\u00caf\2\u080e\u080f\7\4\2\2\u080f"+
		"\u0811\3\2\2\2\u0810\u080c\3\2\2\2\u0810\u0811\3\2\2\2\u0811\u0821\3\2"+
		"\2\2\u0812\u0814\t\17\2\2\u0813\u0812\3\2\2\2\u0813\u0814\3\2\2\2\u0814"+
		"\u0815\3\2\2\2\u0815\u0816\7E\2\2\u0816\u081b\5\u008aF\2\u0817\u0818\7"+
		"\3\2\2\u0818\u0819\5\u00caf\2\u0819\u081a\7\4\2\2\u081a\u081c\3\2\2\2"+
		"\u081b\u0817\3\2\2\2\u081b\u081c\3\2\2\2\u081c\u081d\3\2\2\2\u081d\u081e"+
		"\7p\2\2\u081e\u081f\5\u0120\u0091\2\u081f\u0821\3\2\2\2\u0820\u080a\3"+
		"\2\2\2\u0820\u0813\3\2\2\2\u0821\u01a5\3\2\2\2\u0822\u0824\5\u0182\u00c2"+
		"\2\u0823\u0822\3\2\2\2\u0824\u0827\3\2\2\2\u0825\u0823\3\2\2\2\u0825\u0826"+
		"\3\2\2\2\u0826\u01a7\3\2\2\2\u0827\u0825\3\2\2\2\u0828\u0829\7{\2\2\u0829"+
		"\u082a\5\u00e6t\2\u082a\u082b\7O\2\2\u082b\u082c\5\u01aa\u00d6\2\u082c"+
		"\u082d\7\21\2\2\u082d\u01a9\3\2\2\2\u082e\u0830\5\u0120\u0091\2\u082f"+
		"\u0831\5\u0120\u0091\2\u0830\u082f\3\2\2\2\u0830\u0831\3\2\2\2\u0831\u0833"+
		"\3\2\2\2\u0832\u0834\5z>\2\u0833\u0832\3\2\2\2\u0833\u0834\3\2\2\2\u0834"+
		"\u01ab\3\2\2\2\u0835\u083a\5\u0196\u00cc\2\u0836\u083a\5H%\2\u0837\u083a"+
		"\5\u012a\u0096\2\u0838\u083a\7-\2\2\u0839\u0835\3\2\2\2\u0839\u0836\3"+
		"\2\2\2\u0839\u0837\3\2\2\2\u0839\u0838\3\2\2\2\u083a\u01ad\3\2\2\2\u083b"+
		"\u083e\5\u0120\u0091\2\u083c\u083e\5\16\b\2\u083d\u083b\3\2\2\2\u083d"+
		"\u083c\3\2\2\2\u083e\u01af\3\2\2\2\u083f\u0845\5\u00be`\2\u0840\u0841"+
		"\5\u011e\u0090\2\u0841\u0842\5\u00be`\2\u0842\u0844\3\2\2\2\u0843\u0840"+
		"\3\2\2\2\u0844\u0847\3\2\2\2\u0845\u0843\3\2\2\2\u0845\u0846\3\2\2\2\u0846"+
		"\u01b1\3\2\2\2\u0847\u0845\3\2\2\2\u0848\u0849\7D\2\2\u0849\u084a\5\u00ba"+
		"^\2\u084a\u01b3\3\2\2\2\u084b\u084e\5\u00ceh\2\u084c\u084e\5\u00ecw\2"+
		"\u084d\u084b\3\2\2\2\u084d\u084c\3\2\2\2\u084e\u01b5\3\2\2\2\u084f\u0855"+
		"\5\u0172\u00ba\2\u0850\u0855\5V,\2\u0851\u0855\5\4\3\2\u0852\u0855\5\u00c6"+
		"d\2\u0853\u0855\5\u0160\u00b1\2\u0854\u084f\3\2\2\2\u0854\u0850\3\2\2"+
		"\2\u0854\u0851\3\2\2\2\u0854\u0852\3\2\2\2\u0854\u0853\3\2\2\2\u0855\u01b7"+
		"\3\2\2\2\u0856\u0857\7\60\2\2\u0857\u0858\7\3\2\2\u0858\u085d\5\u00f2"+
		"z\2\u0859\u085a\7\13\2\2\u085a\u085c\5\u00f2z\2\u085b\u0859\3\2\2\2\u085c"+
		"\u085f\3\2\2\2\u085d\u085b\3\2\2\2\u085d\u085e\3\2\2\2\u085e\u0860\3\2"+
		"\2\2\u085f\u085d\3\2\2\2\u0860\u0861\7\4\2\2\u0861\u0862\7]\2\2\u0862"+
		"\u0863\5\u01aa\u00d6\2\u0863\u01b9\3\2\2\2\u0864\u0865\7\u0083\2\2\u0865"+
		"\u086a\5\u0120\u0091\2\u0866\u0867\7\13\2\2\u0867\u0869\5\u0120\u0091"+
		"\2\u0868\u0866\3\2\2\2\u0869\u086c\3\2\2\2\u086a\u0868\3\2\2\2\u086a\u086b"+
		"\3\2\2\2\u086b\u086d\3\2\2\2\u086c\u086a\3\2\2\2\u086d\u086e\7\21\2\2"+
		"\u086e\u01bb\3\2\2\2\u086f\u0871\5\u010a\u0086\2\u0870\u086f\3\2\2\2\u0870"+
		"\u0871\3\2\2\2\u0871\u0872\3\2\2\2\u0872\u0873\5\u01ae\u00d8\2\u0873\u0874"+
		"\7(\2\2\u0874\u0875\5\u00ba^\2\u0875\u0876\7\21\2\2\u0876\u01bd\3\2\2"+
		"\2\u0877\u0879\7u\2\2\u0878\u0877\3\2\2\2\u0878\u0879\3\2\2\2\u0879\u087a"+
		"\3\2\2\2\u087a\u087b\7\u0084\2\2\u087b\u087c\5\u00e8u\2\u087c\u087d\7"+
		"\20\2\2\u087d\u0880\5\u01aa\u00d6\2\u087e\u087f\7(\2\2\u087f\u0881\5\u00ba"+
		"^\2\u0880\u087e\3\2\2\2\u0880\u0881\3\2\2\2\u0881\u0882\3\2\2\2\u0882"+
		"\u0883\7\21\2\2\u0883\u01bf\3\2\2\2\u0884\u0886\5\u010a\u0086\2\u0885"+
		"\u0884\3\2\2\2\u0885\u0886\3\2\2\2\u0886\u0887\3\2\2\2\u0887\u0889\7\u0085"+
		"\2\2\u0888\u088a\5\u017c\u00bf\2\u0889\u0888\3\2\2\2\u0889\u088a\3\2\2"+
		"\2\u088a\u088c\3\2\2\2\u088b\u088d\5d\63\2\u088c\u088b\3\2\2\2\u088c\u088d"+
		"\3\2\2\2\u088d\u088f\3\2\2\2\u088e\u0890\5\u01b2\u00da\2\u088f\u088e\3"+
		"\2\2\2\u088f\u0890\3\2\2\2\u0890\u0891\3\2\2\2\u0891\u0892\7\21\2\2\u0892"+
		"\u01c1\3\2\2\2\u0893\u0898\5\u01c4\u00e3\2\u0894\u0895\7\13\2\2\u0895"+
		"\u0897\5\u01c4\u00e3\2\u0896\u0894\3\2\2\2\u0897\u089a\3\2\2\2\u0898\u0896"+
		"\3\2\2\2\u0898\u0899\3\2\2\2\u0899\u089d\3\2\2\2\u089a\u0898\3\2\2\2\u089b"+
		"\u089d\7\u0080\2\2\u089c\u0893\3\2\2\2\u089c\u089b\3\2\2\2\u089d\u01c3"+
		"\3\2\2\2\u089e\u08a1\5\u00ba^\2\u089f\u08a0\7+\2\2\u08a0\u08a2\5\u00ba"+
		"^\2\u08a1\u089f\3\2\2\2\u08a1\u08a2\3\2\2\2\u08a2\u01c5\3\2\2\2\u08a3"+
		"\u08a5\7I\2\2\u08a4\u08a3\3\2\2\2\u08a4\u08a5\3\2\2\2\u08a5\u08a7\3\2"+
		"\2\2\u08a6\u08a8\5\u0084C\2\u08a7\u08a6\3\2\2\2\u08a7\u08a8\3\2\2\2\u08a8"+
		"\u01c7\3\2\2\2\u00f6\u01ca\u01d1\u01db\u01e5\u01ee\u01f3\u01fa\u01ff\u020b"+
		"\u020e\u0215\u021b\u0220\u0226\u022a\u022d\u0235\u023e\u0259\u025c\u025f"+
		"\u0268\u026e\u0286\u028b\u0292\u0294\u029a\u029c\u02a4\u02ad\u02b0\u02b9"+
		"\u02c0\u02c4\u02cc\u02d1\u02e0\u02e7\u02ef\u02f2\u02fb\u02fe\u0301\u0306"+
		"\u030e\u0311\u031b\u031e\u0321\u0328\u032e\u0333\u0337\u033c\u033f\u0343"+
		"\u034c\u035b\u035f\u0366\u0371\u0374\u037b\u0380\u0385\u0392\u039d\u03a2"+
		"\u03a7\u03b8\u03bd\u03c0\u03c5\u03cc\u03d8\u03dd\u03ee\u03f3\u03f9\u0400"+
		"\u040a\u040e\u0411\u0424\u0429\u042e\u0431\u0434\u043b\u0440\u0449\u044e"+
		"\u0454\u0458\u0460\u0466\u046a\u046e\u0478\u0480\u0486\u048d\u0495\u04a7"+
		"\u04b4\u04bd\u04c1\u04c6\u04cc\u04d4\u04e6\u04ed\u050c\u0510\u051d\u0522"+
		"\u0527\u0535\u053c\u0543\u054c\u0550\u0557\u055c\u055f\u0564\u0569\u056f"+
		"\u057d\u0581\u0586\u058a\u058e\u0591\u0596\u059b\u05a1\u05ae\u05b5\u05be"+
		"\u05c4\u05c7\u05ce\u05da\u05e1\u05ea\u05f7\u05fb\u05ff\u0603\u0607\u060c"+
		"\u0613\u0619\u0625\u0628\u0637\u063c\u0645\u0648\u065b\u0660\u0668\u0670"+
		"\u0675\u0687\u0693\u0698\u069f\u06a2\u06b4\u06b9\u06bd\u06c0\u06c7\u06ca"+
		"\u06d1\u06d5\u06dc\u06e6\u06f5\u06fa\u0702\u0707\u070c\u0711\u071a\u0721"+
		"\u072a\u072f\u0735\u073a\u0740\u0745\u0749\u0750\u0754\u076e\u0779\u077f"+
		"\u078f\u0795\u079c\u07a1\u07ab\u07af\u07ba\u07bf\u07c7\u07ca\u07ce\u07d3"+
		"\u07db\u07e9\u07ec\u0800\u0805\u0810\u0813\u081b\u0820\u0825\u0830\u0833"+
		"\u0839\u083d\u0845\u084d\u0854\u085d\u086a\u0870\u0878\u0880\u0885\u0889"+
		"\u088c\u088f\u0898\u089c\u08a1\u08a4\u08a7";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}