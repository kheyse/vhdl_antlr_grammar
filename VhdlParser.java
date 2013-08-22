// $ANTLR 3.5 Vhdl.g 2013-08-22 10:11:53



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class VhdlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "AT", "BAR", "BASED_INTEGER", 
		"BASED_LITERAL", "BASE_SPECIFIER", "BASIC_GRAPHIC_CHARACTER_BASE", "BASIC_IDENTIFIER", 
		"BIT_STRING_LITERAL", "BIT_VALUE", "BSLASH", "BTIC", "CARET", "CHARACTER_LITERAL", 
		"COLON", "COLONEQ", "COMMA", "COMMENT", "DECIMAL_LITERAL", "DIGIT", "DOLLAR", 
		"DOT", "EQ", "EQGRT", "EXCL", "EXPONENT", "EXTENDED_DIGIT", "EXTENDED_IDENTIFIER", 
		"GRAPHIC_CHARACTER", "GRAPHIC_CHARACTER_BASE", "GRT", "GRTEQ", "INTEGER", 
		"K_ABS", "K_ACCESS", "K_AFTER", "K_ALIAS", "K_ALL", "K_AND", "K_ARCHITECTURE", 
		"K_ARRAY", "K_ASSERT", "K_ATTRIBUTE", "K_BEGIN", "K_BLOCK", "K_BODY", 
		"K_BUFFER", "K_BUS", "K_CASE", "K_COMPONENT", "K_CONFIGURATION", "K_CONSTANT", 
		"K_DISCONNECT", "K_DOWNTO", "K_ELSE", "K_ELSIF", "K_END", "K_ENTITY", 
		"K_EXIT", "K_FILE", "K_FOR", "K_FUNCTION", "K_GENERATE", "K_GENERIC", 
		"K_GROUP", "K_GUARDED", "K_IF", "K_IMPURE", "K_IN", "K_INERTIAL", "K_INOUT", 
		"K_IS", "K_LABEL", "K_LIBRARY", "K_LINKAGE", "K_LITERAL", "K_LOOP", "K_MAP", 
		"K_MOD", "K_NAND", "K_NEW", "K_NEXT", "K_NOR", "K_NOT", "K_NULL", "K_OF", 
		"K_ON", "K_OPEN", "K_OR", "K_OTHERS", "K_OUT", "K_PACKAGE", "K_PORT", 
		"K_POSTPONED", "K_PROCEDURE", "K_PROCESS", "K_PROTECTED", "K_PURE", "K_RANGE", 
		"K_RECORD", "K_REGISTER", "K_REJECT", "K_REM", "K_REPORT", "K_RETURN", 
		"K_ROL", "K_ROR", "K_SELECT", "K_SEVERITY", "K_SHARED", "K_SIGNAL", "K_SLA", 
		"K_SLL", "K_SRA", "K_SRL", "K_SUBTYPE", "K_THEN", "K_TO", "K_TRANSPORT", 
		"K_TYPE", "K_UNAFFECTED", "K_UNITS", "K_UNTIL", "K_USE", "K_VARIABLE", 
		"K_WAIT", "K_WHEN", "K_WHILE", "K_WITH", "K_XNOR", "K_XOR", "LBRACK", 
		"LCURLY", "LETTER", "LOWER_CASE_LETTER", "LPAREN", "LST", "LSTEQ", "LSTGRT", 
		"MINUS", "NEWLINE", "PCNT", "PLUS", "POUND", "QMARK", "QUOTE", "RBRACK", 
		"RCURLY", "RPAREN", "SEMI", "SLASH", "SLASHEQ", "STAR", "STAR2", "STRING_LITERAL", 
		"TIC", "TIC_SIMPLE_NAME", "TILDE", "USCORE", "WS"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int AT=5;
	public static final int BAR=6;
	public static final int BASED_INTEGER=7;
	public static final int BASED_LITERAL=8;
	public static final int BASE_SPECIFIER=9;
	public static final int BASIC_GRAPHIC_CHARACTER_BASE=10;
	public static final int BASIC_IDENTIFIER=11;
	public static final int BIT_STRING_LITERAL=12;
	public static final int BIT_VALUE=13;
	public static final int BSLASH=14;
	public static final int BTIC=15;
	public static final int CARET=16;
	public static final int CHARACTER_LITERAL=17;
	public static final int COLON=18;
	public static final int COLONEQ=19;
	public static final int COMMA=20;
	public static final int COMMENT=21;
	public static final int DECIMAL_LITERAL=22;
	public static final int DIGIT=23;
	public static final int DOLLAR=24;
	public static final int DOT=25;
	public static final int EQ=26;
	public static final int EQGRT=27;
	public static final int EXCL=28;
	public static final int EXPONENT=29;
	public static final int EXTENDED_DIGIT=30;
	public static final int EXTENDED_IDENTIFIER=31;
	public static final int GRAPHIC_CHARACTER=32;
	public static final int GRAPHIC_CHARACTER_BASE=33;
	public static final int GRT=34;
	public static final int GRTEQ=35;
	public static final int INTEGER=36;
	public static final int K_ABS=37;
	public static final int K_ACCESS=38;
	public static final int K_AFTER=39;
	public static final int K_ALIAS=40;
	public static final int K_ALL=41;
	public static final int K_AND=42;
	public static final int K_ARCHITECTURE=43;
	public static final int K_ARRAY=44;
	public static final int K_ASSERT=45;
	public static final int K_ATTRIBUTE=46;
	public static final int K_BEGIN=47;
	public static final int K_BLOCK=48;
	public static final int K_BODY=49;
	public static final int K_BUFFER=50;
	public static final int K_BUS=51;
	public static final int K_CASE=52;
	public static final int K_COMPONENT=53;
	public static final int K_CONFIGURATION=54;
	public static final int K_CONSTANT=55;
	public static final int K_DISCONNECT=56;
	public static final int K_DOWNTO=57;
	public static final int K_ELSE=58;
	public static final int K_ELSIF=59;
	public static final int K_END=60;
	public static final int K_ENTITY=61;
	public static final int K_EXIT=62;
	public static final int K_FILE=63;
	public static final int K_FOR=64;
	public static final int K_FUNCTION=65;
	public static final int K_GENERATE=66;
	public static final int K_GENERIC=67;
	public static final int K_GROUP=68;
	public static final int K_GUARDED=69;
	public static final int K_IF=70;
	public static final int K_IMPURE=71;
	public static final int K_IN=72;
	public static final int K_INERTIAL=73;
	public static final int K_INOUT=74;
	public static final int K_IS=75;
	public static final int K_LABEL=76;
	public static final int K_LIBRARY=77;
	public static final int K_LINKAGE=78;
	public static final int K_LITERAL=79;
	public static final int K_LOOP=80;
	public static final int K_MAP=81;
	public static final int K_MOD=82;
	public static final int K_NAND=83;
	public static final int K_NEW=84;
	public static final int K_NEXT=85;
	public static final int K_NOR=86;
	public static final int K_NOT=87;
	public static final int K_NULL=88;
	public static final int K_OF=89;
	public static final int K_ON=90;
	public static final int K_OPEN=91;
	public static final int K_OR=92;
	public static final int K_OTHERS=93;
	public static final int K_OUT=94;
	public static final int K_PACKAGE=95;
	public static final int K_PORT=96;
	public static final int K_POSTPONED=97;
	public static final int K_PROCEDURE=98;
	public static final int K_PROCESS=99;
	public static final int K_PROTECTED=100;
	public static final int K_PURE=101;
	public static final int K_RANGE=102;
	public static final int K_RECORD=103;
	public static final int K_REGISTER=104;
	public static final int K_REJECT=105;
	public static final int K_REM=106;
	public static final int K_REPORT=107;
	public static final int K_RETURN=108;
	public static final int K_ROL=109;
	public static final int K_ROR=110;
	public static final int K_SELECT=111;
	public static final int K_SEVERITY=112;
	public static final int K_SHARED=113;
	public static final int K_SIGNAL=114;
	public static final int K_SLA=115;
	public static final int K_SLL=116;
	public static final int K_SRA=117;
	public static final int K_SRL=118;
	public static final int K_SUBTYPE=119;
	public static final int K_THEN=120;
	public static final int K_TO=121;
	public static final int K_TRANSPORT=122;
	public static final int K_TYPE=123;
	public static final int K_UNAFFECTED=124;
	public static final int K_UNITS=125;
	public static final int K_UNTIL=126;
	public static final int K_USE=127;
	public static final int K_VARIABLE=128;
	public static final int K_WAIT=129;
	public static final int K_WHEN=130;
	public static final int K_WHILE=131;
	public static final int K_WITH=132;
	public static final int K_XNOR=133;
	public static final int K_XOR=134;
	public static final int LBRACK=135;
	public static final int LCURLY=136;
	public static final int LETTER=137;
	public static final int LOWER_CASE_LETTER=138;
	public static final int LPAREN=139;
	public static final int LST=140;
	public static final int LSTEQ=141;
	public static final int LSTGRT=142;
	public static final int MINUS=143;
	public static final int NEWLINE=144;
	public static final int PCNT=145;
	public static final int PLUS=146;
	public static final int POUND=147;
	public static final int QMARK=148;
	public static final int QUOTE=149;
	public static final int RBRACK=150;
	public static final int RCURLY=151;
	public static final int RPAREN=152;
	public static final int SEMI=153;
	public static final int SLASH=154;
	public static final int SLASHEQ=155;
	public static final int STAR=156;
	public static final int STAR2=157;
	public static final int STRING_LITERAL=158;
	public static final int TIC=159;
	public static final int TIC_SIMPLE_NAME=160;
	public static final int TILDE=161;
	public static final int USCORE=162;
	public static final int WS=163;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public VhdlParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public VhdlParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return VhdlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Vhdl.g"; }





	// $ANTLR start "abstract_literal"
	// Vhdl.g:144:1: abstract_literal : ( decimal_literal | based_literal );
	public final void abstract_literal() throws RecognitionException {
		try {
			// Vhdl.g:145:5: ( decimal_literal | based_literal )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==DECIMAL_LITERAL) ) {
				alt1=1;
			}
			else if ( (LA1_0==BASED_LITERAL) ) {
				alt1=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// Vhdl.g:145:5: decimal_literal
					{
					pushFollow(FOLLOW_decimal_literal_in_abstract_literal993);
					decimal_literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:146:5: based_literal
					{
					pushFollow(FOLLOW_based_literal_in_abstract_literal999);
					based_literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "abstract_literal"



	// $ANTLR start "access_type_definition"
	// Vhdl.g:149:1: access_type_definition : K_ACCESS subtype_indication ;
	public final void access_type_definition() throws RecognitionException {
		try {
			// Vhdl.g:150:5: ( K_ACCESS subtype_indication )
			// Vhdl.g:150:5: K_ACCESS subtype_indication
			{
			match(input,K_ACCESS,FOLLOW_K_ACCESS_in_access_type_definition1010); if (state.failed) return;
			pushFollow(FOLLOW_subtype_indication_in_access_type_definition1012);
			subtype_indication();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "access_type_definition"



	// $ANTLR start "actual_designator"
	// Vhdl.g:153:1: actual_designator : ( expression | K_OPEN );
	public final void actual_designator() throws RecognitionException {
		try {
			// Vhdl.g:154:5: ( expression | K_OPEN )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==BASED_LITERAL||(LA2_0 >= BASIC_IDENTIFIER && LA2_0 <= BIT_STRING_LITERAL)||LA2_0==CHARACTER_LITERAL||LA2_0==DECIMAL_LITERAL||LA2_0==EXTENDED_IDENTIFIER||LA2_0==K_ABS||LA2_0==K_NEW||(LA2_0 >= K_NOT && LA2_0 <= K_NULL)||LA2_0==LPAREN||LA2_0==MINUS||LA2_0==PLUS||LA2_0==STRING_LITERAL) ) {
				alt2=1;
			}
			else if ( (LA2_0==K_OPEN) ) {
				alt2=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// Vhdl.g:154:5: expression
					{
					pushFollow(FOLLOW_expression_in_actual_designator1023);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:155:5: K_OPEN
					{
					match(input,K_OPEN,FOLLOW_K_OPEN_in_actual_designator1029); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "actual_designator"



	// $ANTLR start "actual_parameter_part"
	// Vhdl.g:158:1: actual_parameter_part : association_list ;
	public final void actual_parameter_part() throws RecognitionException {
		try {
			// Vhdl.g:159:5: ( association_list )
			// Vhdl.g:159:5: association_list
			{
			pushFollow(FOLLOW_association_list_in_actual_parameter_part1040);
			association_list();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "actual_parameter_part"



	// $ANTLR start "actual_part"
	// Vhdl.g:162:1: actual_part : ( ( name LPAREN )=> name LPAREN actual_designator RPAREN | actual_designator );
	public final void actual_part() throws RecognitionException {
		try {
			// Vhdl.g:163:5: ( ( name LPAREN )=> name LPAREN actual_designator RPAREN | actual_designator )
			int alt3=2;
			switch ( input.LA(1) ) {
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
				{
				switch ( input.LA(2) ) {
				case DOT:
					{
					int LA3_14 = input.LA(3);
					if ( (synpred1_Vhdl()) ) {
						alt3=1;
					}
					else if ( (true) ) {
						alt3=2;
					}

					}
					break;
				case TIC:
					{
					int LA3_15 = input.LA(3);
					if ( (synpred1_Vhdl()) ) {
						alt3=1;
					}
					else if ( (true) ) {
						alt3=2;
					}

					}
					break;
				case LBRACK:
					{
					int LA3_16 = input.LA(3);
					if ( (synpred1_Vhdl()) ) {
						alt3=1;
					}
					else if ( (true) ) {
						alt3=2;
					}

					}
					break;
				case TIC_SIMPLE_NAME:
					{
					int LA3_17 = input.LA(3);
					if ( (synpred1_Vhdl()) ) {
						alt3=1;
					}
					else if ( (true) ) {
						alt3=2;
					}

					}
					break;
				case LPAREN:
					{
					int LA3_18 = input.LA(3);
					if ( (synpred1_Vhdl()) ) {
						alt3=1;
					}
					else if ( (true) ) {
						alt3=2;
					}

					}
					break;
				case AND:
				case COMMA:
				case EQ:
				case GRT:
				case GRTEQ:
				case K_AND:
				case K_MOD:
				case K_NAND:
				case K_NOR:
				case K_OR:
				case K_REM:
				case K_ROL:
				case K_ROR:
				case K_SLA:
				case K_SLL:
				case K_SRA:
				case K_SRL:
				case K_XNOR:
				case K_XOR:
				case LST:
				case LSTEQ:
				case MINUS:
				case PLUS:
				case RPAREN:
				case SLASH:
				case SLASHEQ:
				case STAR:
				case STAR2:
					{
					alt3=2;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case STRING_LITERAL:
				{
				switch ( input.LA(2) ) {
				case DOT:
					{
					int LA3_27 = input.LA(3);
					if ( (synpred1_Vhdl()) ) {
						alt3=1;
					}
					else if ( (true) ) {
						alt3=2;
					}

					}
					break;
				case TIC:
					{
					int LA3_28 = input.LA(3);
					if ( (synpred1_Vhdl()) ) {
						alt3=1;
					}
					else if ( (true) ) {
						alt3=2;
					}

					}
					break;
				case LBRACK:
					{
					int LA3_29 = input.LA(3);
					if ( (synpred1_Vhdl()) ) {
						alt3=1;
					}
					else if ( (true) ) {
						alt3=2;
					}

					}
					break;
				case TIC_SIMPLE_NAME:
					{
					int LA3_30 = input.LA(3);
					if ( (synpred1_Vhdl()) ) {
						alt3=1;
					}
					else if ( (true) ) {
						alt3=2;
					}

					}
					break;
				case LPAREN:
					{
					int LA3_31 = input.LA(3);
					if ( (synpred1_Vhdl()) ) {
						alt3=1;
					}
					else if ( (true) ) {
						alt3=2;
					}

					}
					break;
				case AND:
				case COMMA:
				case EQ:
				case GRT:
				case GRTEQ:
				case K_AND:
				case K_MOD:
				case K_NAND:
				case K_NOR:
				case K_OR:
				case K_REM:
				case K_ROL:
				case K_ROR:
				case K_SLA:
				case K_SLL:
				case K_SRA:
				case K_SRL:
				case K_XNOR:
				case K_XOR:
				case LST:
				case LSTEQ:
				case MINUS:
				case PLUS:
				case RPAREN:
				case SLASH:
				case SLASHEQ:
				case STAR:
				case STAR2:
					{
					alt3=2;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case BASED_LITERAL:
			case BIT_STRING_LITERAL:
			case CHARACTER_LITERAL:
			case DECIMAL_LITERAL:
			case K_ABS:
			case K_NEW:
			case K_NOT:
			case K_NULL:
			case K_OPEN:
			case LPAREN:
			case MINUS:
			case PLUS:
				{
				alt3=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// Vhdl.g:163:5: ( name LPAREN )=> name LPAREN actual_designator RPAREN
					{
					pushFollow(FOLLOW_name_in_actual_part1058);
					name();
					state._fsp--;
					if (state.failed) return;
					match(input,LPAREN,FOLLOW_LPAREN_in_actual_part1060); if (state.failed) return;
					pushFollow(FOLLOW_actual_designator_in_actual_part1062);
					actual_designator();
					state._fsp--;
					if (state.failed) return;
					match(input,RPAREN,FOLLOW_RPAREN_in_actual_part1064); if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:164:5: actual_designator
					{
					pushFollow(FOLLOW_actual_designator_in_actual_part1070);
					actual_designator();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "actual_part"



	// $ANTLR start "adding_operator"
	// Vhdl.g:167:1: adding_operator : ( PLUS | MINUS | AND );
	public final void adding_operator() throws RecognitionException {
		try {
			// Vhdl.g:168:5: ( PLUS | MINUS | AND )
			// Vhdl.g:
			{
			if ( input.LA(1)==AND||input.LA(1)==MINUS||input.LA(1)==PLUS ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "adding_operator"



	// $ANTLR start "aggregate"
	// Vhdl.g:173:1: aggregate : LPAREN element_association ( COMMA element_association )* RPAREN ;
	public final void aggregate() throws RecognitionException {
		try {
			// Vhdl.g:174:5: ( LPAREN element_association ( COMMA element_association )* RPAREN )
			// Vhdl.g:174:5: LPAREN element_association ( COMMA element_association )* RPAREN
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_aggregate1104); if (state.failed) return;
			pushFollow(FOLLOW_element_association_in_aggregate1106);
			element_association();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:174:32: ( COMMA element_association )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==COMMA) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Vhdl.g:174:33: COMMA element_association
					{
					match(input,COMMA,FOLLOW_COMMA_in_aggregate1109); if (state.failed) return;
					pushFollow(FOLLOW_element_association_in_aggregate1111);
					element_association();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop4;
				}
			}

			match(input,RPAREN,FOLLOW_RPAREN_in_aggregate1115); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "aggregate"



	// $ANTLR start "alias_declaration"
	// Vhdl.g:177:1: alias_declaration : K_ALIAS alias_designator ( COLON subtype_indication )? K_IS name ( signature )? SEMI ;
	public final void alias_declaration() throws RecognitionException {
		try {
			// Vhdl.g:178:5: ( K_ALIAS alias_designator ( COLON subtype_indication )? K_IS name ( signature )? SEMI )
			// Vhdl.g:178:5: K_ALIAS alias_designator ( COLON subtype_indication )? K_IS name ( signature )? SEMI
			{
			match(input,K_ALIAS,FOLLOW_K_ALIAS_in_alias_declaration1126); if (state.failed) return;
			pushFollow(FOLLOW_alias_designator_in_alias_declaration1128);
			alias_designator();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:178:30: ( COLON subtype_indication )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==COLON) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// Vhdl.g:178:31: COLON subtype_indication
					{
					match(input,COLON,FOLLOW_COLON_in_alias_declaration1131); if (state.failed) return;
					pushFollow(FOLLOW_subtype_indication_in_alias_declaration1133);
					subtype_indication();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,K_IS,FOLLOW_K_IS_in_alias_declaration1146); if (state.failed) return;
			pushFollow(FOLLOW_name_in_alias_declaration1148);
			name();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:179:19: ( signature )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==LBRACK) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// Vhdl.g:179:20: signature
					{
					pushFollow(FOLLOW_signature_in_alias_declaration1151);
					signature();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,SEMI,FOLLOW_SEMI_in_alias_declaration1155); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "alias_declaration"



	// $ANTLR start "alias_designator"
	// Vhdl.g:182:1: alias_designator : ( identifier | character_literal | operator_symbol );
	public final void alias_designator() throws RecognitionException {
		try {
			// Vhdl.g:183:5: ( identifier | character_literal | operator_symbol )
			int alt7=3;
			switch ( input.LA(1) ) {
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
				{
				alt7=1;
				}
				break;
			case CHARACTER_LITERAL:
				{
				alt7=2;
				}
				break;
			case STRING_LITERAL:
				{
				alt7=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// Vhdl.g:183:5: identifier
					{
					pushFollow(FOLLOW_identifier_in_alias_designator1166);
					identifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:184:5: character_literal
					{
					pushFollow(FOLLOW_character_literal_in_alias_designator1172);
					character_literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Vhdl.g:185:5: operator_symbol
					{
					pushFollow(FOLLOW_operator_symbol_in_alias_designator1178);
					operator_symbol();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "alias_designator"



	// $ANTLR start "allocator"
	// Vhdl.g:188:1: allocator : K_NEW ( ( subtype_indication )=> subtype_indication | qualified_expression ) ;
	public final void allocator() throws RecognitionException {
		try {
			// Vhdl.g:189:5: ( K_NEW ( ( subtype_indication )=> subtype_indication | qualified_expression ) )
			// Vhdl.g:189:5: K_NEW ( ( subtype_indication )=> subtype_indication | qualified_expression )
			{
			match(input,K_NEW,FOLLOW_K_NEW_in_allocator1189); if (state.failed) return;
			// Vhdl.g:190:9: ( ( subtype_indication )=> subtype_indication | qualified_expression )
			int alt8=2;
			alt8 = dfa8.predict(input);
			switch (alt8) {
				case 1 :
					// Vhdl.g:190:13: ( subtype_indication )=> subtype_indication
					{
					pushFollow(FOLLOW_subtype_indication_in_allocator1209);
					subtype_indication();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:191:13: qualified_expression
					{
					pushFollow(FOLLOW_qualified_expression_in_allocator1223);
					qualified_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "allocator"



	// $ANTLR start "architecture_body"
	// Vhdl.g:195:1: architecture_body : K_ARCHITECTURE identifier K_OF name K_IS architecture_declarative_part K_BEGIN architecture_statement_part K_END ( K_ARCHITECTURE )? ( simple_name )? SEMI ;
	public final void architecture_body() throws RecognitionException {
		try {
			// Vhdl.g:196:5: ( K_ARCHITECTURE identifier K_OF name K_IS architecture_declarative_part K_BEGIN architecture_statement_part K_END ( K_ARCHITECTURE )? ( simple_name )? SEMI )
			// Vhdl.g:196:5: K_ARCHITECTURE identifier K_OF name K_IS architecture_declarative_part K_BEGIN architecture_statement_part K_END ( K_ARCHITECTURE )? ( simple_name )? SEMI
			{
			match(input,K_ARCHITECTURE,FOLLOW_K_ARCHITECTURE_in_architecture_body1244); if (state.failed) return;
			pushFollow(FOLLOW_identifier_in_architecture_body1246);
			identifier();
			state._fsp--;
			if (state.failed) return;
			match(input,K_OF,FOLLOW_K_OF_in_architecture_body1248); if (state.failed) return;
			pushFollow(FOLLOW_name_in_architecture_body1250);
			name();
			state._fsp--;
			if (state.failed) return;
			match(input,K_IS,FOLLOW_K_IS_in_architecture_body1252); if (state.failed) return;
			pushFollow(FOLLOW_architecture_declarative_part_in_architecture_body1262);
			architecture_declarative_part();
			state._fsp--;
			if (state.failed) return;
			match(input,K_BEGIN,FOLLOW_K_BEGIN_in_architecture_body1272); if (state.failed) return;
			pushFollow(FOLLOW_architecture_statement_part_in_architecture_body1274);
			architecture_statement_part();
			state._fsp--;
			if (state.failed) return;
			match(input,K_END,FOLLOW_K_END_in_architecture_body1276); if (state.failed) return;
			// Vhdl.g:199:9: ( K_ARCHITECTURE )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==K_ARCHITECTURE) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// Vhdl.g:199:10: K_ARCHITECTURE
					{
					match(input,K_ARCHITECTURE,FOLLOW_K_ARCHITECTURE_in_architecture_body1287); if (state.failed) return;
					}
					break;

			}

			// Vhdl.g:199:27: ( simple_name )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==BASIC_IDENTIFIER||LA10_0==EXTENDED_IDENTIFIER) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// Vhdl.g:199:28: simple_name
					{
					pushFollow(FOLLOW_simple_name_in_architecture_body1292);
					simple_name();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,SEMI,FOLLOW_SEMI_in_architecture_body1296); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "architecture_body"



	// $ANTLR start "architecture_declarative_part"
	// Vhdl.g:202:1: architecture_declarative_part : ( block_declarative_item )* ;
	public final void architecture_declarative_part() throws RecognitionException {
		try {
			// Vhdl.g:203:5: ( ( block_declarative_item )* )
			// Vhdl.g:203:5: ( block_declarative_item )*
			{
			// Vhdl.g:203:5: ( block_declarative_item )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==K_ALIAS||LA11_0==K_ATTRIBUTE||LA11_0==K_COMPONENT||(LA11_0 >= K_CONSTANT && LA11_0 <= K_DISCONNECT)||(LA11_0 >= K_FILE && LA11_0 <= K_FUNCTION)||LA11_0==K_GROUP||LA11_0==K_IMPURE||LA11_0==K_PROCEDURE||LA11_0==K_PURE||(LA11_0 >= K_SHARED && LA11_0 <= K_SIGNAL)||LA11_0==K_SUBTYPE||LA11_0==K_TYPE||(LA11_0 >= K_USE && LA11_0 <= K_VARIABLE)) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// Vhdl.g:203:6: block_declarative_item
					{
					pushFollow(FOLLOW_block_declarative_item_in_architecture_declarative_part1308);
					block_declarative_item();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop11;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "architecture_declarative_part"



	// $ANTLR start "architecture_statement_part"
	// Vhdl.g:206:1: architecture_statement_part : ( concurrent_statement )* ;
	public final void architecture_statement_part() throws RecognitionException {
		try {
			// Vhdl.g:207:5: ( ( concurrent_statement )* )
			// Vhdl.g:207:5: ( concurrent_statement )*
			{
			// Vhdl.g:207:5: ( concurrent_statement )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==BASIC_IDENTIFIER||LA12_0==EXTENDED_IDENTIFIER||LA12_0==K_ASSERT||LA12_0==K_POSTPONED||LA12_0==K_PROCESS||LA12_0==K_WITH||LA12_0==LPAREN||LA12_0==STRING_LITERAL) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// Vhdl.g:207:6: concurrent_statement
					{
					pushFollow(FOLLOW_concurrent_statement_in_architecture_statement_part1322);
					concurrent_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop12;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "architecture_statement_part"



	// $ANTLR start "array_type_definition"
	// Vhdl.g:210:1: array_type_definition : ( ( unconstrained_array_definition )=> unconstrained_array_definition | constrained_array_definition );
	public final void array_type_definition() throws RecognitionException {
		try {
			// Vhdl.g:211:5: ( ( unconstrained_array_definition )=> unconstrained_array_definition | constrained_array_definition )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==K_ARRAY) ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1==LPAREN) ) {
					int LA13_2 = input.LA(3);
					if ( (synpred3_Vhdl()) ) {
						alt13=1;
					}
					else if ( (true) ) {
						alt13=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// Vhdl.g:211:5: ( unconstrained_array_definition )=> unconstrained_array_definition
					{
					pushFollow(FOLLOW_unconstrained_array_definition_in_array_type_definition1340);
					unconstrained_array_definition();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:212:5: constrained_array_definition
					{
					pushFollow(FOLLOW_constrained_array_definition_in_array_type_definition1346);
					constrained_array_definition();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "array_type_definition"



	// $ANTLR start "assertion"
	// Vhdl.g:215:1: assertion : K_ASSERT condition ( K_REPORT expression )? ( K_SEVERITY expression )? ;
	public final void assertion() throws RecognitionException {
		try {
			// Vhdl.g:216:5: ( K_ASSERT condition ( K_REPORT expression )? ( K_SEVERITY expression )? )
			// Vhdl.g:216:5: K_ASSERT condition ( K_REPORT expression )? ( K_SEVERITY expression )?
			{
			match(input,K_ASSERT,FOLLOW_K_ASSERT_in_assertion1357); if (state.failed) return;
			pushFollow(FOLLOW_condition_in_assertion1359);
			condition();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:217:9: ( K_REPORT expression )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==K_REPORT) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// Vhdl.g:217:10: K_REPORT expression
					{
					match(input,K_REPORT,FOLLOW_K_REPORT_in_assertion1370); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_assertion1372);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// Vhdl.g:218:9: ( K_SEVERITY expression )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==K_SEVERITY) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// Vhdl.g:218:10: K_SEVERITY expression
					{
					match(input,K_SEVERITY,FOLLOW_K_SEVERITY_in_assertion1385); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_assertion1387);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assertion"



	// $ANTLR start "assertion_statement"
	// Vhdl.g:221:1: assertion_statement : ( label_colon )? assertion SEMI ;
	public final void assertion_statement() throws RecognitionException {
		try {
			// Vhdl.g:222:5: ( ( label_colon )? assertion SEMI )
			// Vhdl.g:222:5: ( label_colon )? assertion SEMI
			{
			// Vhdl.g:222:5: ( label_colon )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==BASIC_IDENTIFIER||LA16_0==EXTENDED_IDENTIFIER) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// Vhdl.g:222:6: label_colon
					{
					pushFollow(FOLLOW_label_colon_in_assertion_statement1401);
					label_colon();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_assertion_in_assertion_statement1405);
			assertion();
			state._fsp--;
			if (state.failed) return;
			match(input,SEMI,FOLLOW_SEMI_in_assertion_statement1407); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assertion_statement"



	// $ANTLR start "association_element"
	// Vhdl.g:225:1: association_element : ( ( formal_part EQGRT )=> formal_part EQGRT )? actual_part ;
	public final void association_element() throws RecognitionException {
		try {
			// Vhdl.g:226:5: ( ( ( formal_part EQGRT )=> formal_part EQGRT )? actual_part )
			// Vhdl.g:226:5: ( ( formal_part EQGRT )=> formal_part EQGRT )? actual_part
			{
			// Vhdl.g:226:5: ( ( formal_part EQGRT )=> formal_part EQGRT )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==BASIC_IDENTIFIER||LA17_0==EXTENDED_IDENTIFIER) ) {
				int LA17_1 = input.LA(2);
				if ( (LA17_1==DOT) ) {
					int LA17_14 = input.LA(3);
					if ( (synpred4_Vhdl()) ) {
						alt17=1;
					}
				}
				else if ( (LA17_1==TIC) ) {
					int LA17_15 = input.LA(3);
					if ( (synpred4_Vhdl()) ) {
						alt17=1;
					}
				}
				else if ( (LA17_1==LBRACK) ) {
					int LA17_16 = input.LA(3);
					if ( (synpred4_Vhdl()) ) {
						alt17=1;
					}
				}
				else if ( (LA17_1==TIC_SIMPLE_NAME) ) {
					int LA17_17 = input.LA(3);
					if ( (synpred4_Vhdl()) ) {
						alt17=1;
					}
				}
				else if ( (LA17_1==LPAREN) ) {
					int LA17_18 = input.LA(3);
					if ( (synpred4_Vhdl()) ) {
						alt17=1;
					}
				}
				else if ( (LA17_1==EQGRT) && (synpred4_Vhdl())) {
					alt17=1;
				}
			}
			else if ( (LA17_0==STRING_LITERAL) ) {
				int LA17_2 = input.LA(2);
				if ( (LA17_2==DOT) ) {
					int LA17_28 = input.LA(3);
					if ( (synpred4_Vhdl()) ) {
						alt17=1;
					}
				}
				else if ( (LA17_2==TIC) ) {
					int LA17_29 = input.LA(3);
					if ( (synpred4_Vhdl()) ) {
						alt17=1;
					}
				}
				else if ( (LA17_2==LBRACK) ) {
					int LA17_30 = input.LA(3);
					if ( (synpred4_Vhdl()) ) {
						alt17=1;
					}
				}
				else if ( (LA17_2==TIC_SIMPLE_NAME) ) {
					int LA17_31 = input.LA(3);
					if ( (synpred4_Vhdl()) ) {
						alt17=1;
					}
				}
				else if ( (LA17_2==LPAREN) ) {
					int LA17_32 = input.LA(3);
					if ( (synpred4_Vhdl()) ) {
						alt17=1;
					}
				}
				else if ( (LA17_2==EQGRT) && (synpred4_Vhdl())) {
					alt17=1;
				}
			}
			switch (alt17) {
				case 1 :
					// Vhdl.g:226:6: ( formal_part EQGRT )=> formal_part EQGRT
					{
					pushFollow(FOLLOW_formal_part_in_association_element1426);
					formal_part();
					state._fsp--;
					if (state.failed) return;
					match(input,EQGRT,FOLLOW_EQGRT_in_association_element1428); if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_actual_part_in_association_element1432);
			actual_part();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "association_element"



	// $ANTLR start "association_list"
	// Vhdl.g:229:1: association_list : association_element ( COMMA association_element )* ;
	public final void association_list() throws RecognitionException {
		try {
			// Vhdl.g:230:5: ( association_element ( COMMA association_element )* )
			// Vhdl.g:230:5: association_element ( COMMA association_element )*
			{
			pushFollow(FOLLOW_association_element_in_association_list1443);
			association_element();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:230:25: ( COMMA association_element )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==COMMA) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// Vhdl.g:230:26: COMMA association_element
					{
					match(input,COMMA,FOLLOW_COMMA_in_association_list1446); if (state.failed) return;
					pushFollow(FOLLOW_association_element_in_association_list1448);
					association_element();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop18;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "association_list"



	// $ANTLR start "attribute_declaration"
	// Vhdl.g:233:1: attribute_declaration : K_ATTRIBUTE identifier COLON name SEMI ;
	public final void attribute_declaration() throws RecognitionException {
		try {
			// Vhdl.g:234:5: ( K_ATTRIBUTE identifier COLON name SEMI )
			// Vhdl.g:234:5: K_ATTRIBUTE identifier COLON name SEMI
			{
			match(input,K_ATTRIBUTE,FOLLOW_K_ATTRIBUTE_in_attribute_declaration1461); if (state.failed) return;
			pushFollow(FOLLOW_identifier_in_attribute_declaration1463);
			identifier();
			state._fsp--;
			if (state.failed) return;
			match(input,COLON,FOLLOW_COLON_in_attribute_declaration1465); if (state.failed) return;
			pushFollow(FOLLOW_name_in_attribute_declaration1467);
			name();
			state._fsp--;
			if (state.failed) return;
			match(input,SEMI,FOLLOW_SEMI_in_attribute_declaration1469); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "attribute_declaration"



	// $ANTLR start "attribute_designator"
	// Vhdl.g:237:1: attribute_designator : simple_name ;
	public final void attribute_designator() throws RecognitionException {
		try {
			// Vhdl.g:238:5: ( simple_name )
			// Vhdl.g:238:5: simple_name
			{
			pushFollow(FOLLOW_simple_name_in_attribute_designator1480);
			simple_name();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "attribute_designator"



	// $ANTLR start "tic_attribute_designator"
	// Vhdl.g:241:1: tic_attribute_designator : TIC_SIMPLE_NAME ;
	public final void tic_attribute_designator() throws RecognitionException {
		try {
			// Vhdl.g:242:3: ( TIC_SIMPLE_NAME )
			// Vhdl.g:242:3: TIC_SIMPLE_NAME
			{
			match(input,TIC_SIMPLE_NAME,FOLLOW_TIC_SIMPLE_NAME_in_tic_attribute_designator1489); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tic_attribute_designator"



	// $ANTLR start "attribute_specification"
	// Vhdl.g:245:1: attribute_specification : K_ATTRIBUTE attribute_designator K_OF entity_specification K_IS expression SEMI ;
	public final void attribute_specification() throws RecognitionException {
		try {
			// Vhdl.g:246:5: ( K_ATTRIBUTE attribute_designator K_OF entity_specification K_IS expression SEMI )
			// Vhdl.g:246:5: K_ATTRIBUTE attribute_designator K_OF entity_specification K_IS expression SEMI
			{
			match(input,K_ATTRIBUTE,FOLLOW_K_ATTRIBUTE_in_attribute_specification1500); if (state.failed) return;
			pushFollow(FOLLOW_attribute_designator_in_attribute_specification1502);
			attribute_designator();
			state._fsp--;
			if (state.failed) return;
			match(input,K_OF,FOLLOW_K_OF_in_attribute_specification1513); if (state.failed) return;
			pushFollow(FOLLOW_entity_specification_in_attribute_specification1515);
			entity_specification();
			state._fsp--;
			if (state.failed) return;
			match(input,K_IS,FOLLOW_K_IS_in_attribute_specification1517); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_attribute_specification1519);
			expression();
			state._fsp--;
			if (state.failed) return;
			match(input,SEMI,FOLLOW_SEMI_in_attribute_specification1521); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "attribute_specification"



	// $ANTLR start "base_unit_declaration"
	// Vhdl.g:250:1: base_unit_declaration : identifier ;
	public final void base_unit_declaration() throws RecognitionException {
		try {
			// Vhdl.g:251:5: ( identifier )
			// Vhdl.g:251:5: identifier
			{
			pushFollow(FOLLOW_identifier_in_base_unit_declaration1532);
			identifier();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "base_unit_declaration"



	// $ANTLR start "based_literal"
	// Vhdl.g:254:1: based_literal : BASED_LITERAL ;
	public final void based_literal() throws RecognitionException {
		try {
			// Vhdl.g:255:5: ( BASED_LITERAL )
			// Vhdl.g:255:5: BASED_LITERAL
			{
			match(input,BASED_LITERAL,FOLLOW_BASED_LITERAL_in_based_literal1543); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "based_literal"



	// $ANTLR start "binding_indication"
	// Vhdl.g:258:1: binding_indication : ( K_USE entity_aspect )? ( generic_map_aspect )? ( port_map_aspect )? ;
	public final void binding_indication() throws RecognitionException {
		try {
			// Vhdl.g:259:5: ( ( K_USE entity_aspect )? ( generic_map_aspect )? ( port_map_aspect )? )
			// Vhdl.g:259:5: ( K_USE entity_aspect )? ( generic_map_aspect )? ( port_map_aspect )?
			{
			// Vhdl.g:259:5: ( K_USE entity_aspect )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==K_USE) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// Vhdl.g:259:6: K_USE entity_aspect
					{
					match(input,K_USE,FOLLOW_K_USE_in_binding_indication1555); if (state.failed) return;
					pushFollow(FOLLOW_entity_aspect_in_binding_indication1557);
					entity_aspect();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// Vhdl.g:259:29: ( generic_map_aspect )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==K_GENERIC) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// Vhdl.g:259:30: generic_map_aspect
					{
					pushFollow(FOLLOW_generic_map_aspect_in_binding_indication1563);
					generic_map_aspect();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// Vhdl.g:259:51: ( port_map_aspect )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==K_PORT) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// Vhdl.g:259:52: port_map_aspect
					{
					pushFollow(FOLLOW_port_map_aspect_in_binding_indication1568);
					port_map_aspect();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "binding_indication"



	// $ANTLR start "bit_string_literal"
	// Vhdl.g:262:1: bit_string_literal : BIT_STRING_LITERAL ;
	public final void bit_string_literal() throws RecognitionException {
		try {
			// Vhdl.g:263:5: ( BIT_STRING_LITERAL )
			// Vhdl.g:263:5: BIT_STRING_LITERAL
			{
			match(input,BIT_STRING_LITERAL,FOLLOW_BIT_STRING_LITERAL_in_bit_string_literal1583); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "bit_string_literal"



	// $ANTLR start "block_configuration"
	// Vhdl.g:266:1: block_configuration : K_FOR block_specification ( use_clause )* ( configuration_item )* K_END K_FOR SEMI ;
	public final void block_configuration() throws RecognitionException {
		try {
			// Vhdl.g:267:5: ( K_FOR block_specification ( use_clause )* ( configuration_item )* K_END K_FOR SEMI )
			// Vhdl.g:267:5: K_FOR block_specification ( use_clause )* ( configuration_item )* K_END K_FOR SEMI
			{
			match(input,K_FOR,FOLLOW_K_FOR_in_block_configuration1594); if (state.failed) return;
			pushFollow(FOLLOW_block_specification_in_block_configuration1596);
			block_specification();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:267:31: ( use_clause )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==K_USE) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// Vhdl.g:267:32: use_clause
					{
					pushFollow(FOLLOW_use_clause_in_block_configuration1599);
					use_clause();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop22;
				}
			}

			// Vhdl.g:267:45: ( configuration_item )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==K_FOR) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// Vhdl.g:267:46: configuration_item
					{
					pushFollow(FOLLOW_configuration_item_in_block_configuration1604);
					configuration_item();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop23;
				}
			}

			match(input,K_END,FOLLOW_K_END_in_block_configuration1616); if (state.failed) return;
			match(input,K_FOR,FOLLOW_K_FOR_in_block_configuration1618); if (state.failed) return;
			match(input,SEMI,FOLLOW_SEMI_in_block_configuration1620); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "block_configuration"



	// $ANTLR start "block_declarative_item"
	// Vhdl.g:271:1: block_declarative_item : ( ( subprogram_declaration )=> subprogram_declaration | subprogram_body | type_declaration | subtype_declaration | constant_declaration | signal_declaration | variable_declaration | file_declaration | alias_declaration | component_declaration | ( attribute_specification )=> attribute_specification | attribute_declaration | configuration_specification | disconnection_specification | use_clause | ( K_GROUP identifier COLON )=> group_declaration | group_template_declaration );
	public final void block_declarative_item() throws RecognitionException {
		try {
			// Vhdl.g:272:5: ( ( subprogram_declaration )=> subprogram_declaration | subprogram_body | type_declaration | subtype_declaration | constant_declaration | signal_declaration | variable_declaration | file_declaration | alias_declaration | component_declaration | ( attribute_specification )=> attribute_specification | attribute_declaration | configuration_specification | disconnection_specification | use_clause | ( K_GROUP identifier COLON )=> group_declaration | group_template_declaration )
			int alt24=17;
			switch ( input.LA(1) ) {
			case K_PROCEDURE:
				{
				int LA24_1 = input.LA(2);
				if ( (LA24_1==BASIC_IDENTIFIER||LA24_1==EXTENDED_IDENTIFIER) ) {
					int LA24_18 = input.LA(3);
					if ( (synpred5_Vhdl()) ) {
						alt24=1;
					}
					else if ( (true) ) {
						alt24=2;
					}

				}
				else if ( (LA24_1==STRING_LITERAL) ) {
					int LA24_19 = input.LA(3);
					if ( (synpred5_Vhdl()) ) {
						alt24=1;
					}
					else if ( (true) ) {
						alt24=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_IMPURE:
			case K_PURE:
				{
				int LA24_2 = input.LA(2);
				if ( (LA24_2==K_FUNCTION) ) {
					int LA24_20 = input.LA(3);
					if ( (synpred5_Vhdl()) ) {
						alt24=1;
					}
					else if ( (true) ) {
						alt24=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_FUNCTION:
				{
				int LA24_3 = input.LA(2);
				if ( (LA24_3==BASIC_IDENTIFIER||LA24_3==EXTENDED_IDENTIFIER) ) {
					int LA24_21 = input.LA(3);
					if ( (synpred5_Vhdl()) ) {
						alt24=1;
					}
					else if ( (true) ) {
						alt24=2;
					}

				}
				else if ( (LA24_3==STRING_LITERAL) ) {
					int LA24_22 = input.LA(3);
					if ( (synpred5_Vhdl()) ) {
						alt24=1;
					}
					else if ( (true) ) {
						alt24=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_TYPE:
				{
				alt24=3;
				}
				break;
			case K_SUBTYPE:
				{
				alt24=4;
				}
				break;
			case K_CONSTANT:
				{
				alt24=5;
				}
				break;
			case K_SIGNAL:
				{
				alt24=6;
				}
				break;
			case K_SHARED:
			case K_VARIABLE:
				{
				alt24=7;
				}
				break;
			case K_FILE:
				{
				alt24=8;
				}
				break;
			case K_ALIAS:
				{
				alt24=9;
				}
				break;
			case K_COMPONENT:
				{
				alt24=10;
				}
				break;
			case K_ATTRIBUTE:
				{
				int LA24_13 = input.LA(2);
				if ( (LA24_13==BASIC_IDENTIFIER||LA24_13==EXTENDED_IDENTIFIER) ) {
					int LA24_23 = input.LA(3);
					if ( (synpred6_Vhdl()) ) {
						alt24=11;
					}
					else if ( (true) ) {
						alt24=12;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_FOR:
				{
				alt24=13;
				}
				break;
			case K_DISCONNECT:
				{
				alt24=14;
				}
				break;
			case K_USE:
				{
				alt24=15;
				}
				break;
			case K_GROUP:
				{
				int LA24_17 = input.LA(2);
				if ( (LA24_17==BASIC_IDENTIFIER||LA24_17==EXTENDED_IDENTIFIER) ) {
					int LA24_24 = input.LA(3);
					if ( (synpred7_Vhdl()) ) {
						alt24=16;
					}
					else if ( (true) ) {
						alt24=17;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 17, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// Vhdl.g:272:5: ( subprogram_declaration )=> subprogram_declaration
					{
					pushFollow(FOLLOW_subprogram_declaration_in_block_declarative_item1636);
					subprogram_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:273:5: subprogram_body
					{
					pushFollow(FOLLOW_subprogram_body_in_block_declarative_item1642);
					subprogram_body();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Vhdl.g:274:5: type_declaration
					{
					pushFollow(FOLLOW_type_declaration_in_block_declarative_item1648);
					type_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// Vhdl.g:275:5: subtype_declaration
					{
					pushFollow(FOLLOW_subtype_declaration_in_block_declarative_item1654);
					subtype_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// Vhdl.g:276:5: constant_declaration
					{
					pushFollow(FOLLOW_constant_declaration_in_block_declarative_item1660);
					constant_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// Vhdl.g:277:5: signal_declaration
					{
					pushFollow(FOLLOW_signal_declaration_in_block_declarative_item1666);
					signal_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// Vhdl.g:278:5: variable_declaration
					{
					pushFollow(FOLLOW_variable_declaration_in_block_declarative_item1672);
					variable_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// Vhdl.g:279:5: file_declaration
					{
					pushFollow(FOLLOW_file_declaration_in_block_declarative_item1678);
					file_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 9 :
					// Vhdl.g:280:5: alias_declaration
					{
					pushFollow(FOLLOW_alias_declaration_in_block_declarative_item1684);
					alias_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 10 :
					// Vhdl.g:281:5: component_declaration
					{
					pushFollow(FOLLOW_component_declaration_in_block_declarative_item1690);
					component_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 11 :
					// Vhdl.g:282:5: ( attribute_specification )=> attribute_specification
					{
					pushFollow(FOLLOW_attribute_specification_in_block_declarative_item1701);
					attribute_specification();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 12 :
					// Vhdl.g:283:5: attribute_declaration
					{
					pushFollow(FOLLOW_attribute_declaration_in_block_declarative_item1707);
					attribute_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 13 :
					// Vhdl.g:284:5: configuration_specification
					{
					pushFollow(FOLLOW_configuration_specification_in_block_declarative_item1713);
					configuration_specification();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 14 :
					// Vhdl.g:285:5: disconnection_specification
					{
					pushFollow(FOLLOW_disconnection_specification_in_block_declarative_item1719);
					disconnection_specification();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 15 :
					// Vhdl.g:286:5: use_clause
					{
					pushFollow(FOLLOW_use_clause_in_block_declarative_item1725);
					use_clause();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 16 :
					// Vhdl.g:287:5: ( K_GROUP identifier COLON )=> group_declaration
					{
					pushFollow(FOLLOW_group_declaration_in_block_declarative_item1740);
					group_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 17 :
					// Vhdl.g:288:5: group_template_declaration
					{
					pushFollow(FOLLOW_group_template_declaration_in_block_declarative_item1746);
					group_template_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "block_declarative_item"



	// $ANTLR start "block_declarative_part"
	// Vhdl.g:291:1: block_declarative_part : ( block_declarative_item )* ;
	public final void block_declarative_part() throws RecognitionException {
		try {
			// Vhdl.g:292:5: ( ( block_declarative_item )* )
			// Vhdl.g:292:5: ( block_declarative_item )*
			{
			// Vhdl.g:292:5: ( block_declarative_item )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==K_ALIAS||LA25_0==K_ATTRIBUTE||LA25_0==K_COMPONENT||(LA25_0 >= K_CONSTANT && LA25_0 <= K_DISCONNECT)||(LA25_0 >= K_FILE && LA25_0 <= K_FUNCTION)||LA25_0==K_GROUP||LA25_0==K_IMPURE||LA25_0==K_PROCEDURE||LA25_0==K_PURE||(LA25_0 >= K_SHARED && LA25_0 <= K_SIGNAL)||LA25_0==K_SUBTYPE||LA25_0==K_TYPE||(LA25_0 >= K_USE && LA25_0 <= K_VARIABLE)) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// Vhdl.g:292:6: block_declarative_item
					{
					pushFollow(FOLLOW_block_declarative_item_in_block_declarative_part1758);
					block_declarative_item();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop25;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "block_declarative_part"



	// $ANTLR start "block_header"
	// Vhdl.g:295:1: block_header : ( generic_clause ( generic_map_aspect SEMI )? )? ( port_clause ( port_map_aspect SEMI )? )? ;
	public final void block_header() throws RecognitionException {
		try {
			// Vhdl.g:296:5: ( ( generic_clause ( generic_map_aspect SEMI )? )? ( port_clause ( port_map_aspect SEMI )? )? )
			// Vhdl.g:296:5: ( generic_clause ( generic_map_aspect SEMI )? )? ( port_clause ( port_map_aspect SEMI )? )?
			{
			// Vhdl.g:296:5: ( generic_clause ( generic_map_aspect SEMI )? )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==K_GENERIC) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// Vhdl.g:296:6: generic_clause ( generic_map_aspect SEMI )?
					{
					pushFollow(FOLLOW_generic_clause_in_block_header1772);
					generic_clause();
					state._fsp--;
					if (state.failed) return;
					// Vhdl.g:296:21: ( generic_map_aspect SEMI )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==K_GENERIC) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// Vhdl.g:296:22: generic_map_aspect SEMI
							{
							pushFollow(FOLLOW_generic_map_aspect_in_block_header1775);
							generic_map_aspect();
							state._fsp--;
							if (state.failed) return;
							match(input,SEMI,FOLLOW_SEMI_in_block_header1777); if (state.failed) return;
							}
							break;

					}

					}
					break;

			}

			// Vhdl.g:297:9: ( port_clause ( port_map_aspect SEMI )? )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==K_PORT) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// Vhdl.g:297:10: port_clause ( port_map_aspect SEMI )?
					{
					pushFollow(FOLLOW_port_clause_in_block_header1793);
					port_clause();
					state._fsp--;
					if (state.failed) return;
					// Vhdl.g:297:22: ( port_map_aspect SEMI )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==K_PORT) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// Vhdl.g:297:23: port_map_aspect SEMI
							{
							pushFollow(FOLLOW_port_map_aspect_in_block_header1796);
							port_map_aspect();
							state._fsp--;
							if (state.failed) return;
							match(input,SEMI,FOLLOW_SEMI_in_block_header1798); if (state.failed) return;
							}
							break;

					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "block_header"



	// $ANTLR start "block_specification"
	// Vhdl.g:300:1: block_specification : ( ( label LPAREN )=> label LPAREN index_specification RPAREN | name );
	public final void block_specification() throws RecognitionException {
		try {
			// Vhdl.g:301:5: ( ( label LPAREN )=> label LPAREN index_specification RPAREN | name )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==BASIC_IDENTIFIER||LA30_0==EXTENDED_IDENTIFIER) ) {
				int LA30_1 = input.LA(2);
				if ( (LA30_1==LPAREN) ) {
					int LA30_3 = input.LA(3);
					if ( (synpred8_Vhdl()) ) {
						alt30=1;
					}
					else if ( (true) ) {
						alt30=2;
					}

				}
				else if ( (LA30_1==DOT||LA30_1==K_END||LA30_1==K_FOR||LA30_1==K_USE||LA30_1==LBRACK||(LA30_1 >= TIC && LA30_1 <= TIC_SIMPLE_NAME)) ) {
					alt30=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 30, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA30_0==STRING_LITERAL) ) {
				alt30=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// Vhdl.g:301:5: ( label LPAREN )=> label LPAREN index_specification RPAREN
					{
					pushFollow(FOLLOW_label_in_block_specification1821);
					label();
					state._fsp--;
					if (state.failed) return;
					match(input,LPAREN,FOLLOW_LPAREN_in_block_specification1823); if (state.failed) return;
					pushFollow(FOLLOW_index_specification_in_block_specification1825);
					index_specification();
					state._fsp--;
					if (state.failed) return;
					match(input,RPAREN,FOLLOW_RPAREN_in_block_specification1827); if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:302:5: name
					{
					pushFollow(FOLLOW_name_in_block_specification1833);
					name();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "block_specification"



	// $ANTLR start "block_statement"
	// Vhdl.g:305:1: block_statement : label COLON K_BLOCK ( LPAREN expression RPAREN )? ( K_IS )? block_header block_declarative_part K_BEGIN block_statement_part K_END K_BLOCK ( label )? SEMI ;
	public final void block_statement() throws RecognitionException {
		try {
			// Vhdl.g:306:5: ( label COLON K_BLOCK ( LPAREN expression RPAREN )? ( K_IS )? block_header block_declarative_part K_BEGIN block_statement_part K_END K_BLOCK ( label )? SEMI )
			// Vhdl.g:306:5: label COLON K_BLOCK ( LPAREN expression RPAREN )? ( K_IS )? block_header block_declarative_part K_BEGIN block_statement_part K_END K_BLOCK ( label )? SEMI
			{
			pushFollow(FOLLOW_label_in_block_statement1844);
			label();
			state._fsp--;
			if (state.failed) return;
			match(input,COLON,FOLLOW_COLON_in_block_statement1846); if (state.failed) return;
			match(input,K_BLOCK,FOLLOW_K_BLOCK_in_block_statement1848); if (state.failed) return;
			// Vhdl.g:306:25: ( LPAREN expression RPAREN )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==LPAREN) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// Vhdl.g:306:26: LPAREN expression RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_block_statement1851); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_block_statement1853);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,RPAREN,FOLLOW_RPAREN_in_block_statement1855); if (state.failed) return;
					}
					break;

			}

			// Vhdl.g:306:53: ( K_IS )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==K_IS) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// Vhdl.g:306:54: K_IS
					{
					match(input,K_IS,FOLLOW_K_IS_in_block_statement1860); if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_block_header_in_block_statement1872);
			block_header();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_block_declarative_part_in_block_statement1874);
			block_declarative_part();
			state._fsp--;
			if (state.failed) return;
			match(input,K_BEGIN,FOLLOW_K_BEGIN_in_block_statement1884); if (state.failed) return;
			pushFollow(FOLLOW_block_statement_part_in_block_statement1886);
			block_statement_part();
			state._fsp--;
			if (state.failed) return;
			match(input,K_END,FOLLOW_K_END_in_block_statement1888); if (state.failed) return;
			match(input,K_BLOCK,FOLLOW_K_BLOCK_in_block_statement1890); if (state.failed) return;
			// Vhdl.g:308:52: ( label )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==BASIC_IDENTIFIER||LA33_0==EXTENDED_IDENTIFIER) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// Vhdl.g:308:53: label
					{
					pushFollow(FOLLOW_label_in_block_statement1893);
					label();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,SEMI,FOLLOW_SEMI_in_block_statement1897); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "block_statement"



	// $ANTLR start "block_statement_part"
	// Vhdl.g:311:1: block_statement_part : ( concurrent_statement )* ;
	public final void block_statement_part() throws RecognitionException {
		try {
			// Vhdl.g:312:5: ( ( concurrent_statement )* )
			// Vhdl.g:312:5: ( concurrent_statement )*
			{
			// Vhdl.g:312:5: ( concurrent_statement )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==BASIC_IDENTIFIER||LA34_0==EXTENDED_IDENTIFIER||LA34_0==K_ASSERT||LA34_0==K_POSTPONED||LA34_0==K_PROCESS||LA34_0==K_WITH||LA34_0==LPAREN||LA34_0==STRING_LITERAL) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// Vhdl.g:312:6: concurrent_statement
					{
					pushFollow(FOLLOW_concurrent_statement_in_block_statement_part1909);
					concurrent_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop34;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "block_statement_part"



	// $ANTLR start "case_statement"
	// Vhdl.g:315:1: case_statement : ( label_colon )? K_CASE expression K_IS ( case_statement_alternative )+ K_END K_CASE ( label )? SEMI ;
	public final void case_statement() throws RecognitionException {
		try {
			// Vhdl.g:316:5: ( ( label_colon )? K_CASE expression K_IS ( case_statement_alternative )+ K_END K_CASE ( label )? SEMI )
			// Vhdl.g:316:5: ( label_colon )? K_CASE expression K_IS ( case_statement_alternative )+ K_END K_CASE ( label )? SEMI
			{
			// Vhdl.g:316:5: ( label_colon )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==BASIC_IDENTIFIER||LA35_0==EXTENDED_IDENTIFIER) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// Vhdl.g:316:6: label_colon
					{
					pushFollow(FOLLOW_label_colon_in_case_statement1923);
					label_colon();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,K_CASE,FOLLOW_K_CASE_in_case_statement1927); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_case_statement1929);
			expression();
			state._fsp--;
			if (state.failed) return;
			match(input,K_IS,FOLLOW_K_IS_in_case_statement1931); if (state.failed) return;
			// Vhdl.g:317:9: ( case_statement_alternative )+
			int cnt36=0;
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==K_WHEN) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// Vhdl.g:317:10: case_statement_alternative
					{
					pushFollow(FOLLOW_case_statement_alternative_in_case_statement1942);
					case_statement_alternative();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt36 >= 1 ) break loop36;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(36, input);
					throw eee;
				}
				cnt36++;
			}

			match(input,K_END,FOLLOW_K_END_in_case_statement1954); if (state.failed) return;
			match(input,K_CASE,FOLLOW_K_CASE_in_case_statement1956); if (state.failed) return;
			// Vhdl.g:318:22: ( label )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==BASIC_IDENTIFIER||LA37_0==EXTENDED_IDENTIFIER) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// Vhdl.g:318:23: label
					{
					pushFollow(FOLLOW_label_in_case_statement1959);
					label();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,SEMI,FOLLOW_SEMI_in_case_statement1963); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "case_statement"



	// $ANTLR start "case_statement_alternative"
	// Vhdl.g:321:1: case_statement_alternative : K_WHEN choices EQGRT sequence_of_statements ;
	public final void case_statement_alternative() throws RecognitionException {
		try {
			// Vhdl.g:322:5: ( K_WHEN choices EQGRT sequence_of_statements )
			// Vhdl.g:322:5: K_WHEN choices EQGRT sequence_of_statements
			{
			match(input,K_WHEN,FOLLOW_K_WHEN_in_case_statement_alternative1974); if (state.failed) return;
			pushFollow(FOLLOW_choices_in_case_statement_alternative1976);
			choices();
			state._fsp--;
			if (state.failed) return;
			match(input,EQGRT,FOLLOW_EQGRT_in_case_statement_alternative1978); if (state.failed) return;
			pushFollow(FOLLOW_sequence_of_statements_in_case_statement_alternative1980);
			sequence_of_statements();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "case_statement_alternative"



	// $ANTLR start "character_literal"
	// Vhdl.g:325:1: character_literal : CHARACTER_LITERAL ;
	public final void character_literal() throws RecognitionException {
		try {
			// Vhdl.g:326:3: ( CHARACTER_LITERAL )
			// Vhdl.g:326:3: CHARACTER_LITERAL
			{
			match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_character_literal1989); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "character_literal"



	// $ANTLR start "choice"
	// Vhdl.g:329:1: choice : ( ( simple_expression )=> simple_expression | ( simple_name )=> simple_name | discrete_range | K_OTHERS );
	public final void choice() throws RecognitionException {
		try {
			// Vhdl.g:330:5: ( ( simple_expression )=> simple_expression | ( simple_name )=> simple_name | discrete_range | K_OTHERS )
			int alt38=4;
			alt38 = dfa38.predict(input);
			switch (alt38) {
				case 1 :
					// Vhdl.g:330:5: ( simple_expression )=> simple_expression
					{
					pushFollow(FOLLOW_simple_expression_in_choice2005);
					simple_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:331:5: ( simple_name )=> simple_name
					{
					pushFollow(FOLLOW_simple_name_in_choice2016);
					simple_name();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Vhdl.g:332:5: discrete_range
					{
					pushFollow(FOLLOW_discrete_range_in_choice2022);
					discrete_range();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// Vhdl.g:333:5: K_OTHERS
					{
					match(input,K_OTHERS,FOLLOW_K_OTHERS_in_choice2028); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "choice"



	// $ANTLR start "choices"
	// Vhdl.g:336:1: choices : choice ( BAR choice )* ;
	public final void choices() throws RecognitionException {
		try {
			// Vhdl.g:337:5: ( choice ( BAR choice )* )
			// Vhdl.g:337:5: choice ( BAR choice )*
			{
			pushFollow(FOLLOW_choice_in_choices2039);
			choice();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:337:12: ( BAR choice )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==BAR) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// Vhdl.g:337:13: BAR choice
					{
					match(input,BAR,FOLLOW_BAR_in_choices2042); if (state.failed) return;
					pushFollow(FOLLOW_choice_in_choices2044);
					choice();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop39;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "choices"



	// $ANTLR start "component_configuration"
	// Vhdl.g:340:1: component_configuration : K_FOR component_specification ( binding_indication SEMI )? ( block_configuration )? K_END K_FOR SEMI ;
	public final void component_configuration() throws RecognitionException {
		try {
			// Vhdl.g:341:5: ( K_FOR component_specification ( binding_indication SEMI )? ( block_configuration )? K_END K_FOR SEMI )
			// Vhdl.g:341:5: K_FOR component_specification ( binding_indication SEMI )? ( block_configuration )? K_END K_FOR SEMI
			{
			match(input,K_FOR,FOLLOW_K_FOR_in_component_configuration2057); if (state.failed) return;
			pushFollow(FOLLOW_component_specification_in_component_configuration2059);
			component_specification();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:341:35: ( binding_indication SEMI )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==K_GENERIC||LA40_0==K_PORT||LA40_0==K_USE||LA40_0==SEMI) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// Vhdl.g:341:36: binding_indication SEMI
					{
					pushFollow(FOLLOW_binding_indication_in_component_configuration2062);
					binding_indication();
					state._fsp--;
					if (state.failed) return;
					match(input,SEMI,FOLLOW_SEMI_in_component_configuration2064); if (state.failed) return;
					}
					break;

			}

			// Vhdl.g:342:9: ( block_configuration )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==K_FOR) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// Vhdl.g:342:10: block_configuration
					{
					pushFollow(FOLLOW_block_configuration_in_component_configuration2077);
					block_configuration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,K_END,FOLLOW_K_END_in_component_configuration2081); if (state.failed) return;
			match(input,K_FOR,FOLLOW_K_FOR_in_component_configuration2083); if (state.failed) return;
			match(input,SEMI,FOLLOW_SEMI_in_component_configuration2085); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "component_configuration"



	// $ANTLR start "component_declaration"
	// Vhdl.g:345:1: component_declaration : K_COMPONENT identifier ( K_IS )? ( generic_clause )? ( port_clause )? K_END K_COMPONENT ( simple_name )? SEMI ;
	public final void component_declaration() throws RecognitionException {
		try {
			// Vhdl.g:346:5: ( K_COMPONENT identifier ( K_IS )? ( generic_clause )? ( port_clause )? K_END K_COMPONENT ( simple_name )? SEMI )
			// Vhdl.g:346:5: K_COMPONENT identifier ( K_IS )? ( generic_clause )? ( port_clause )? K_END K_COMPONENT ( simple_name )? SEMI
			{
			match(input,K_COMPONENT,FOLLOW_K_COMPONENT_in_component_declaration2096); if (state.failed) return;
			pushFollow(FOLLOW_identifier_in_component_declaration2098);
			identifier();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:346:28: ( K_IS )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==K_IS) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// Vhdl.g:346:29: K_IS
					{
					match(input,K_IS,FOLLOW_K_IS_in_component_declaration2101); if (state.failed) return;
					}
					break;

			}

			// Vhdl.g:347:9: ( generic_clause )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==K_GENERIC) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// Vhdl.g:347:10: generic_clause
					{
					pushFollow(FOLLOW_generic_clause_in_component_declaration2114);
					generic_clause();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// Vhdl.g:347:27: ( port_clause )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==K_PORT) ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// Vhdl.g:347:28: port_clause
					{
					pushFollow(FOLLOW_port_clause_in_component_declaration2119);
					port_clause();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,K_END,FOLLOW_K_END_in_component_declaration2131); if (state.failed) return;
			match(input,K_COMPONENT,FOLLOW_K_COMPONENT_in_component_declaration2133); if (state.failed) return;
			// Vhdl.g:348:27: ( simple_name )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==BASIC_IDENTIFIER||LA45_0==EXTENDED_IDENTIFIER) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// Vhdl.g:348:28: simple_name
					{
					pushFollow(FOLLOW_simple_name_in_component_declaration2136);
					simple_name();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,SEMI,FOLLOW_SEMI_in_component_declaration2140); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "component_declaration"



	// $ANTLR start "component_instantiation_statement"
	// Vhdl.g:351:1: component_instantiation_statement : instNm= label COLON refNm= instantiated_unit ( generic_map_aspect )? ( port_map_aspect )? SEMI ;
	public final void component_instantiation_statement() throws RecognitionException {
		try {
			// Vhdl.g:352:5: (instNm= label COLON refNm= instantiated_unit ( generic_map_aspect )? ( port_map_aspect )? SEMI )
			// Vhdl.g:352:5: instNm= label COLON refNm= instantiated_unit ( generic_map_aspect )? ( port_map_aspect )? SEMI
			{
			pushFollow(FOLLOW_label_in_component_instantiation_statement2153);
			label();
			state._fsp--;
			if (state.failed) return;
			match(input,COLON,FOLLOW_COLON_in_component_instantiation_statement2155); if (state.failed) return;
			pushFollow(FOLLOW_instantiated_unit_in_component_instantiation_statement2159);
			instantiated_unit();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:353:3: ( generic_map_aspect )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==K_GENERIC) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// Vhdl.g:353:4: generic_map_aspect
					{
					pushFollow(FOLLOW_generic_map_aspect_in_component_instantiation_statement2165);
					generic_map_aspect();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// Vhdl.g:353:25: ( port_map_aspect )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==K_PORT) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// Vhdl.g:353:26: port_map_aspect
					{
					pushFollow(FOLLOW_port_map_aspect_in_component_instantiation_statement2170);
					port_map_aspect();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,SEMI,FOLLOW_SEMI_in_component_instantiation_statement2174); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "component_instantiation_statement"



	// $ANTLR start "component_specification"
	// Vhdl.g:356:1: component_specification : instantiation_list COLON name ;
	public final void component_specification() throws RecognitionException {
		try {
			// Vhdl.g:357:5: ( instantiation_list COLON name )
			// Vhdl.g:357:5: instantiation_list COLON name
			{
			pushFollow(FOLLOW_instantiation_list_in_component_specification2185);
			instantiation_list();
			state._fsp--;
			if (state.failed) return;
			match(input,COLON,FOLLOW_COLON_in_component_specification2187); if (state.failed) return;
			pushFollow(FOLLOW_name_in_component_specification2189);
			name();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "component_specification"



	// $ANTLR start "composite_type_definition"
	// Vhdl.g:360:1: composite_type_definition : ( array_type_definition | record_type_definition );
	public final void composite_type_definition() throws RecognitionException {
		try {
			// Vhdl.g:361:5: ( array_type_definition | record_type_definition )
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==K_ARRAY) ) {
				alt48=1;
			}
			else if ( (LA48_0==K_RECORD) ) {
				alt48=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}

			switch (alt48) {
				case 1 :
					// Vhdl.g:361:5: array_type_definition
					{
					pushFollow(FOLLOW_array_type_definition_in_composite_type_definition2200);
					array_type_definition();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:362:5: record_type_definition
					{
					pushFollow(FOLLOW_record_type_definition_in_composite_type_definition2206);
					record_type_definition();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "composite_type_definition"



	// $ANTLR start "concurrent_assertion_statement"
	// Vhdl.g:365:1: concurrent_assertion_statement : ( label_colon )? ( K_POSTPONED )? assertion SEMI ;
	public final void concurrent_assertion_statement() throws RecognitionException {
		try {
			// Vhdl.g:366:5: ( ( label_colon )? ( K_POSTPONED )? assertion SEMI )
			// Vhdl.g:366:5: ( label_colon )? ( K_POSTPONED )? assertion SEMI
			{
			// Vhdl.g:366:5: ( label_colon )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==BASIC_IDENTIFIER||LA49_0==EXTENDED_IDENTIFIER) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// Vhdl.g:366:6: label_colon
					{
					pushFollow(FOLLOW_label_colon_in_concurrent_assertion_statement2218);
					label_colon();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// Vhdl.g:366:20: ( K_POSTPONED )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==K_POSTPONED) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// Vhdl.g:366:21: K_POSTPONED
					{
					match(input,K_POSTPONED,FOLLOW_K_POSTPONED_in_concurrent_assertion_statement2223); if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_assertion_in_concurrent_assertion_statement2227);
			assertion();
			state._fsp--;
			if (state.failed) return;
			match(input,SEMI,FOLLOW_SEMI_in_concurrent_assertion_statement2229); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "concurrent_assertion_statement"



	// $ANTLR start "concurrent_procedure_call_statement"
	// Vhdl.g:369:1: concurrent_procedure_call_statement : ( ( label_colon )=> label_colon ( K_POSTPONED )? procedure_call SEMI | ( K_POSTPONED )? procedure_call SEMI );
	public final void concurrent_procedure_call_statement() throws RecognitionException {
		try {
			// Vhdl.g:370:5: ( ( label_colon )=> label_colon ( K_POSTPONED )? procedure_call SEMI | ( K_POSTPONED )? procedure_call SEMI )
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==BASIC_IDENTIFIER||LA53_0==EXTENDED_IDENTIFIER) ) {
				int LA53_1 = input.LA(2);
				if ( (LA53_1==COLON) && (synpred11_Vhdl())) {
					alt53=1;
				}
				else if ( (LA53_1==DOT||LA53_1==LBRACK||LA53_1==LPAREN||LA53_1==SEMI||(LA53_1 >= TIC && LA53_1 <= TIC_SIMPLE_NAME)) ) {
					alt53=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 53, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA53_0==K_POSTPONED||LA53_0==STRING_LITERAL) ) {
				alt53=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				throw nvae;
			}

			switch (alt53) {
				case 1 :
					// Vhdl.g:370:5: ( label_colon )=> label_colon ( K_POSTPONED )? procedure_call SEMI
					{
					pushFollow(FOLLOW_label_colon_in_concurrent_procedure_call_statement2245);
					label_colon();
					state._fsp--;
					if (state.failed) return;
					// Vhdl.g:370:33: ( K_POSTPONED )?
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( (LA51_0==K_POSTPONED) ) {
						alt51=1;
					}
					switch (alt51) {
						case 1 :
							// Vhdl.g:370:34: K_POSTPONED
							{
							match(input,K_POSTPONED,FOLLOW_K_POSTPONED_in_concurrent_procedure_call_statement2248); if (state.failed) return;
							}
							break;

					}

					pushFollow(FOLLOW_procedure_call_in_concurrent_procedure_call_statement2252);
					procedure_call();
					state._fsp--;
					if (state.failed) return;
					match(input,SEMI,FOLLOW_SEMI_in_concurrent_procedure_call_statement2254); if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:371:5: ( K_POSTPONED )? procedure_call SEMI
					{
					// Vhdl.g:371:5: ( K_POSTPONED )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==K_POSTPONED) ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// Vhdl.g:371:6: K_POSTPONED
							{
							match(input,K_POSTPONED,FOLLOW_K_POSTPONED_in_concurrent_procedure_call_statement2261); if (state.failed) return;
							}
							break;

					}

					pushFollow(FOLLOW_procedure_call_in_concurrent_procedure_call_statement2265);
					procedure_call();
					state._fsp--;
					if (state.failed) return;
					match(input,SEMI,FOLLOW_SEMI_in_concurrent_procedure_call_statement2267); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "concurrent_procedure_call_statement"



	// $ANTLR start "concurrent_signal_assignment_statement"
	// Vhdl.g:374:1: concurrent_signal_assignment_statement : ( ( label_colon )=> label_colon ( K_POSTPONED )? concurrent_signal_assignment_statement_2 | ( K_POSTPONED )? concurrent_signal_assignment_statement_2 );
	public final void concurrent_signal_assignment_statement() throws RecognitionException {
		try {
			// Vhdl.g:375:5: ( ( label_colon )=> label_colon ( K_POSTPONED )? concurrent_signal_assignment_statement_2 | ( K_POSTPONED )? concurrent_signal_assignment_statement_2 )
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==BASIC_IDENTIFIER||LA56_0==EXTENDED_IDENTIFIER) ) {
				int LA56_1 = input.LA(2);
				if ( (LA56_1==COLON) && (synpred12_Vhdl())) {
					alt56=1;
				}
				else if ( (LA56_1==DOT||LA56_1==LBRACK||LA56_1==LPAREN||LA56_1==LSTEQ||(LA56_1 >= TIC && LA56_1 <= TIC_SIMPLE_NAME)) ) {
					alt56=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 56, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA56_0==K_POSTPONED||LA56_0==K_WITH||LA56_0==LPAREN||LA56_0==STRING_LITERAL) ) {
				alt56=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				throw nvae;
			}

			switch (alt56) {
				case 1 :
					// Vhdl.g:375:5: ( label_colon )=> label_colon ( K_POSTPONED )? concurrent_signal_assignment_statement_2
					{
					pushFollow(FOLLOW_label_colon_in_concurrent_signal_assignment_statement2286);
					label_colon();
					state._fsp--;
					if (state.failed) return;
					// Vhdl.g:376:15: ( K_POSTPONED )?
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==K_POSTPONED) ) {
						alt54=1;
					}
					switch (alt54) {
						case 1 :
							// Vhdl.g:376:16: K_POSTPONED
							{
							match(input,K_POSTPONED,FOLLOW_K_POSTPONED_in_concurrent_signal_assignment_statement2289); if (state.failed) return;
							}
							break;

					}

					pushFollow(FOLLOW_concurrent_signal_assignment_statement_2_in_concurrent_signal_assignment_statement2293);
					concurrent_signal_assignment_statement_2();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:377:5: ( K_POSTPONED )? concurrent_signal_assignment_statement_2
					{
					// Vhdl.g:377:5: ( K_POSTPONED )?
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==K_POSTPONED) ) {
						alt55=1;
					}
					switch (alt55) {
						case 1 :
							// Vhdl.g:377:6: K_POSTPONED
							{
							match(input,K_POSTPONED,FOLLOW_K_POSTPONED_in_concurrent_signal_assignment_statement2300); if (state.failed) return;
							}
							break;

					}

					pushFollow(FOLLOW_concurrent_signal_assignment_statement_2_in_concurrent_signal_assignment_statement2304);
					concurrent_signal_assignment_statement_2();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "concurrent_signal_assignment_statement"



	// $ANTLR start "concurrent_signal_assignment_statement_2"
	// Vhdl.g:380:1: concurrent_signal_assignment_statement_2 : ( conditional_signal_assignment | selected_signal_assignment );
	public final void concurrent_signal_assignment_statement_2() throws RecognitionException {
		try {
			// Vhdl.g:381:3: ( conditional_signal_assignment | selected_signal_assignment )
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==BASIC_IDENTIFIER||LA57_0==EXTENDED_IDENTIFIER||LA57_0==LPAREN||LA57_0==STRING_LITERAL) ) {
				alt57=1;
			}
			else if ( (LA57_0==K_WITH) ) {
				alt57=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}

			switch (alt57) {
				case 1 :
					// Vhdl.g:381:3: conditional_signal_assignment
					{
					pushFollow(FOLLOW_conditional_signal_assignment_in_concurrent_signal_assignment_statement_22313);
					conditional_signal_assignment();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:382:5: selected_signal_assignment
					{
					pushFollow(FOLLOW_selected_signal_assignment_in_concurrent_signal_assignment_statement_22319);
					selected_signal_assignment();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "concurrent_signal_assignment_statement_2"



	// $ANTLR start "concurrent_statement"
	// Vhdl.g:385:1: concurrent_statement : ( ( block_statement )=> block_statement | ( process_statement )=> process_statement | ( concurrent_procedure_call_statement )=> concurrent_procedure_call_statement | ( concurrent_assertion_statement )=> concurrent_assertion_statement | ( concurrent_signal_assignment_statement )=> concurrent_signal_assignment_statement | ( component_instantiation_statement )=> component_instantiation_statement | generate_statement );
	public final void concurrent_statement() throws RecognitionException {
		try {
			// Vhdl.g:386:5: ( ( block_statement )=> block_statement | ( process_statement )=> process_statement | ( concurrent_procedure_call_statement )=> concurrent_procedure_call_statement | ( concurrent_assertion_statement )=> concurrent_assertion_statement | ( concurrent_signal_assignment_statement )=> concurrent_signal_assignment_statement | ( component_instantiation_statement )=> component_instantiation_statement | generate_statement )
			int alt58=7;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==BASIC_IDENTIFIER||LA58_0==EXTENDED_IDENTIFIER) ) {
				int LA58_1 = input.LA(2);
				if ( (LA58_1==COLON) ) {
					int LA58_8 = input.LA(3);
					if ( (synpred13_Vhdl()) ) {
						alt58=1;
					}
					else if ( (synpred14_Vhdl()) ) {
						alt58=2;
					}
					else if ( (synpred15_Vhdl()) ) {
						alt58=3;
					}
					else if ( (synpred16_Vhdl()) ) {
						alt58=4;
					}
					else if ( (synpred17_Vhdl()) ) {
						alt58=5;
					}
					else if ( (synpred18_Vhdl()) ) {
						alt58=6;
					}
					else if ( (true) ) {
						alt58=7;
					}

				}
				else if ( (LA58_1==DOT) ) {
					int LA58_9 = input.LA(3);
					if ( (synpred15_Vhdl()) ) {
						alt58=3;
					}
					else if ( (synpred17_Vhdl()) ) {
						alt58=5;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 58, 9, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA58_1==TIC) ) {
					int LA58_10 = input.LA(3);
					if ( (synpred15_Vhdl()) ) {
						alt58=3;
					}
					else if ( (synpred17_Vhdl()) ) {
						alt58=5;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 58, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA58_1==LBRACK) ) {
					int LA58_11 = input.LA(3);
					if ( (synpred15_Vhdl()) ) {
						alt58=3;
					}
					else if ( (synpred17_Vhdl()) ) {
						alt58=5;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 58, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA58_1==TIC_SIMPLE_NAME) ) {
					int LA58_12 = input.LA(3);
					if ( (synpred15_Vhdl()) ) {
						alt58=3;
					}
					else if ( (synpred17_Vhdl()) ) {
						alt58=5;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 58, 12, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA58_1==LPAREN) ) {
					int LA58_13 = input.LA(3);
					if ( (synpred15_Vhdl()) ) {
						alt58=3;
					}
					else if ( (synpred17_Vhdl()) ) {
						alt58=5;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 58, 13, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA58_1==SEMI) && (synpred15_Vhdl())) {
					alt58=3;
				}
				else if ( (LA58_1==LSTEQ) && (synpred17_Vhdl())) {
					alt58=5;
				}

			}
			else if ( (LA58_0==K_POSTPONED) ) {
				int LA58_2 = input.LA(2);
				if ( (LA58_2==K_PROCESS) && (synpred14_Vhdl())) {
					alt58=2;
				}
				else if ( (LA58_2==BASIC_IDENTIFIER||LA58_2==EXTENDED_IDENTIFIER) ) {
					int LA58_17 = input.LA(3);
					if ( (synpred15_Vhdl()) ) {
						alt58=3;
					}
					else if ( (synpred17_Vhdl()) ) {
						alt58=5;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 58, 17, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA58_2==STRING_LITERAL) ) {
					int LA58_18 = input.LA(3);
					if ( (synpred15_Vhdl()) ) {
						alt58=3;
					}
					else if ( (synpred17_Vhdl()) ) {
						alt58=5;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 58, 18, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA58_2==K_ASSERT) && (synpred16_Vhdl())) {
					alt58=4;
				}
				else if ( (LA58_2==LPAREN) && (synpred17_Vhdl())) {
					alt58=5;
				}
				else if ( (LA58_2==K_WITH) && (synpred17_Vhdl())) {
					alt58=5;
				}

			}
			else if ( (LA58_0==K_PROCESS) && (synpred14_Vhdl())) {
				alt58=2;
			}
			else if ( (LA58_0==STRING_LITERAL) ) {
				int LA58_4 = input.LA(2);
				if ( (LA58_4==DOT) ) {
					int LA58_22 = input.LA(3);
					if ( (synpred15_Vhdl()) ) {
						alt58=3;
					}
					else if ( (synpred17_Vhdl()) ) {
						alt58=5;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 58, 22, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA58_4==TIC) ) {
					int LA58_23 = input.LA(3);
					if ( (synpred15_Vhdl()) ) {
						alt58=3;
					}
					else if ( (synpred17_Vhdl()) ) {
						alt58=5;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 58, 23, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA58_4==LBRACK) ) {
					int LA58_24 = input.LA(3);
					if ( (synpred15_Vhdl()) ) {
						alt58=3;
					}
					else if ( (synpred17_Vhdl()) ) {
						alt58=5;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 58, 24, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA58_4==TIC_SIMPLE_NAME) ) {
					int LA58_25 = input.LA(3);
					if ( (synpred15_Vhdl()) ) {
						alt58=3;
					}
					else if ( (synpred17_Vhdl()) ) {
						alt58=5;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 58, 25, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA58_4==LPAREN) ) {
					int LA58_26 = input.LA(3);
					if ( (synpred15_Vhdl()) ) {
						alt58=3;
					}
					else if ( (synpred17_Vhdl()) ) {
						alt58=5;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 58, 26, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA58_4==SEMI) && (synpred15_Vhdl())) {
					alt58=3;
				}
				else if ( (LA58_4==LSTEQ) && (synpred17_Vhdl())) {
					alt58=5;
				}

			}
			else if ( (LA58_0==K_ASSERT) && (synpred16_Vhdl())) {
				alt58=4;
			}
			else if ( (LA58_0==LPAREN) && (synpred17_Vhdl())) {
				alt58=5;
			}
			else if ( (LA58_0==K_WITH) && (synpred17_Vhdl())) {
				alt58=5;
			}

			switch (alt58) {
				case 1 :
					// Vhdl.g:386:5: ( block_statement )=> block_statement
					{
					pushFollow(FOLLOW_block_statement_in_concurrent_statement2335);
					block_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:387:5: ( process_statement )=> process_statement
					{
					pushFollow(FOLLOW_process_statement_in_concurrent_statement2346);
					process_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Vhdl.g:388:5: ( concurrent_procedure_call_statement )=> concurrent_procedure_call_statement
					{
					pushFollow(FOLLOW_concurrent_procedure_call_statement_in_concurrent_statement2360);
					concurrent_procedure_call_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// Vhdl.g:390:5: ( concurrent_assertion_statement )=> concurrent_assertion_statement
					{
					pushFollow(FOLLOW_concurrent_assertion_statement_in_concurrent_statement2371);
					concurrent_assertion_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// Vhdl.g:391:5: ( concurrent_signal_assignment_statement )=> concurrent_signal_assignment_statement
					{
					pushFollow(FOLLOW_concurrent_signal_assignment_statement_in_concurrent_statement2384);
					concurrent_signal_assignment_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// Vhdl.g:393:5: ( component_instantiation_statement )=> component_instantiation_statement
					{
					pushFollow(FOLLOW_component_instantiation_statement_in_concurrent_statement2397);
					component_instantiation_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// Vhdl.g:395:5: generate_statement
					{
					pushFollow(FOLLOW_generate_statement_in_concurrent_statement2403);
					generate_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "concurrent_statement"



	// $ANTLR start "condition"
	// Vhdl.g:398:1: condition : expression ;
	public final void condition() throws RecognitionException {
		try {
			// Vhdl.g:399:5: ( expression )
			// Vhdl.g:399:5: expression
			{
			pushFollow(FOLLOW_expression_in_condition2414);
			expression();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "condition"



	// $ANTLR start "condition_clause"
	// Vhdl.g:402:1: condition_clause : K_UNTIL condition ;
	public final void condition_clause() throws RecognitionException {
		try {
			// Vhdl.g:403:5: ( K_UNTIL condition )
			// Vhdl.g:403:5: K_UNTIL condition
			{
			match(input,K_UNTIL,FOLLOW_K_UNTIL_in_condition_clause2425); if (state.failed) return;
			pushFollow(FOLLOW_condition_in_condition_clause2427);
			condition();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "condition_clause"



	// $ANTLR start "conditional_signal_assignment"
	// Vhdl.g:408:1: conditional_signal_assignment : target LSTEQ voptions conditional_waveforms SEMI ;
	public final void conditional_signal_assignment() throws RecognitionException {
		try {
			// Vhdl.g:409:5: ( target LSTEQ voptions conditional_waveforms SEMI )
			// Vhdl.g:409:5: target LSTEQ voptions conditional_waveforms SEMI
			{
			pushFollow(FOLLOW_target_in_conditional_signal_assignment2440);
			target();
			state._fsp--;
			if (state.failed) return;
			match(input,LSTEQ,FOLLOW_LSTEQ_in_conditional_signal_assignment2442); if (state.failed) return;
			pushFollow(FOLLOW_voptions_in_conditional_signal_assignment2444);
			voptions();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_conditional_waveforms_in_conditional_signal_assignment2446);
			conditional_waveforms();
			state._fsp--;
			if (state.failed) return;
			match(input,SEMI,FOLLOW_SEMI_in_conditional_signal_assignment2448); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "conditional_signal_assignment"



	// $ANTLR start "conditional_waveforms"
	// Vhdl.g:412:1: conditional_waveforms : waveform ( ( K_WHEN condition K_ELSE )=> conditional_waveforms_2 )? ( K_WHEN condition )? ;
	public final void conditional_waveforms() throws RecognitionException {
		try {
			// Vhdl.g:413:3: ( waveform ( ( K_WHEN condition K_ELSE )=> conditional_waveforms_2 )? ( K_WHEN condition )? )
			// Vhdl.g:413:3: waveform ( ( K_WHEN condition K_ELSE )=> conditional_waveforms_2 )? ( K_WHEN condition )?
			{
			pushFollow(FOLLOW_waveform_in_conditional_waveforms2457);
			waveform();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:413:12: ( ( K_WHEN condition K_ELSE )=> conditional_waveforms_2 )?
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==K_WHEN) ) {
				switch ( input.LA(2) ) {
					case MINUS:
					case PLUS:
						{
						int LA59_3 = input.LA(3);
						if ( (synpred19_Vhdl()) ) {
							alt59=1;
						}
						}
						break;
					case BASIC_IDENTIFIER:
					case EXTENDED_IDENTIFIER:
						{
						int LA59_4 = input.LA(3);
						if ( (synpred19_Vhdl()) ) {
							alt59=1;
						}
						}
						break;
					case STRING_LITERAL:
						{
						int LA59_5 = input.LA(3);
						if ( (synpred19_Vhdl()) ) {
							alt59=1;
						}
						}
						break;
					case LPAREN:
						{
						int LA59_6 = input.LA(3);
						if ( (synpred19_Vhdl()) ) {
							alt59=1;
						}
						}
						break;
					case DECIMAL_LITERAL:
						{
						int LA59_7 = input.LA(3);
						if ( (synpred19_Vhdl()) ) {
							alt59=1;
						}
						}
						break;
					case BASED_LITERAL:
						{
						int LA59_8 = input.LA(3);
						if ( (synpred19_Vhdl()) ) {
							alt59=1;
						}
						}
						break;
					case CHARACTER_LITERAL:
						{
						int LA59_9 = input.LA(3);
						if ( (synpred19_Vhdl()) ) {
							alt59=1;
						}
						}
						break;
					case BIT_STRING_LITERAL:
						{
						int LA59_10 = input.LA(3);
						if ( (synpred19_Vhdl()) ) {
							alt59=1;
						}
						}
						break;
					case K_NULL:
						{
						int LA59_11 = input.LA(3);
						if ( (synpred19_Vhdl()) ) {
							alt59=1;
						}
						}
						break;
					case K_NEW:
						{
						int LA59_12 = input.LA(3);
						if ( (synpred19_Vhdl()) ) {
							alt59=1;
						}
						}
						break;
					case K_ABS:
						{
						int LA59_13 = input.LA(3);
						if ( (synpred19_Vhdl()) ) {
							alt59=1;
						}
						}
						break;
					case K_NOT:
						{
						int LA59_14 = input.LA(3);
						if ( (synpred19_Vhdl()) ) {
							alt59=1;
						}
						}
						break;
				}
			}
			switch (alt59) {
				case 1 :
					// Vhdl.g:413:13: ( K_WHEN condition K_ELSE )=> conditional_waveforms_2
					{
					pushFollow(FOLLOW_conditional_waveforms_2_in_conditional_waveforms2469);
					conditional_waveforms_2();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// Vhdl.g:414:6: ( K_WHEN condition )?
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==K_WHEN) ) {
				alt60=1;
			}
			switch (alt60) {
				case 1 :
					// Vhdl.g:414:7: K_WHEN condition
					{
					match(input,K_WHEN,FOLLOW_K_WHEN_in_conditional_waveforms2479); if (state.failed) return;
					pushFollow(FOLLOW_condition_in_conditional_waveforms2481);
					condition();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "conditional_waveforms"



	// $ANTLR start "conditional_waveforms_2"
	// Vhdl.g:417:1: conditional_waveforms_2 : K_WHEN condition K_ELSE waveform ( ( K_WHEN condition K_ELSE )=> conditional_waveforms_2 )? ;
	public final void conditional_waveforms_2() throws RecognitionException {
		try {
			// Vhdl.g:418:3: ( K_WHEN condition K_ELSE waveform ( ( K_WHEN condition K_ELSE )=> conditional_waveforms_2 )? )
			// Vhdl.g:418:3: K_WHEN condition K_ELSE waveform ( ( K_WHEN condition K_ELSE )=> conditional_waveforms_2 )?
			{
			match(input,K_WHEN,FOLLOW_K_WHEN_in_conditional_waveforms_22492); if (state.failed) return;
			pushFollow(FOLLOW_condition_in_conditional_waveforms_22494);
			condition();
			state._fsp--;
			if (state.failed) return;
			match(input,K_ELSE,FOLLOW_K_ELSE_in_conditional_waveforms_22496); if (state.failed) return;
			pushFollow(FOLLOW_waveform_in_conditional_waveforms_22498);
			waveform();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:419:6: ( ( K_WHEN condition K_ELSE )=> conditional_waveforms_2 )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==K_WHEN) ) {
				switch ( input.LA(2) ) {
					case MINUS:
					case PLUS:
						{
						int LA61_3 = input.LA(3);
						if ( (synpred20_Vhdl()) ) {
							alt61=1;
						}
						}
						break;
					case BASIC_IDENTIFIER:
					case EXTENDED_IDENTIFIER:
						{
						int LA61_4 = input.LA(3);
						if ( (synpred20_Vhdl()) ) {
							alt61=1;
						}
						}
						break;
					case STRING_LITERAL:
						{
						int LA61_5 = input.LA(3);
						if ( (synpred20_Vhdl()) ) {
							alt61=1;
						}
						}
						break;
					case LPAREN:
						{
						int LA61_6 = input.LA(3);
						if ( (synpred20_Vhdl()) ) {
							alt61=1;
						}
						}
						break;
					case DECIMAL_LITERAL:
						{
						int LA61_7 = input.LA(3);
						if ( (synpred20_Vhdl()) ) {
							alt61=1;
						}
						}
						break;
					case BASED_LITERAL:
						{
						int LA61_8 = input.LA(3);
						if ( (synpred20_Vhdl()) ) {
							alt61=1;
						}
						}
						break;
					case CHARACTER_LITERAL:
						{
						int LA61_9 = input.LA(3);
						if ( (synpred20_Vhdl()) ) {
							alt61=1;
						}
						}
						break;
					case BIT_STRING_LITERAL:
						{
						int LA61_10 = input.LA(3);
						if ( (synpred20_Vhdl()) ) {
							alt61=1;
						}
						}
						break;
					case K_NULL:
						{
						int LA61_11 = input.LA(3);
						if ( (synpred20_Vhdl()) ) {
							alt61=1;
						}
						}
						break;
					case K_NEW:
						{
						int LA61_12 = input.LA(3);
						if ( (synpred20_Vhdl()) ) {
							alt61=1;
						}
						}
						break;
					case K_ABS:
						{
						int LA61_13 = input.LA(3);
						if ( (synpred20_Vhdl()) ) {
							alt61=1;
						}
						}
						break;
					case K_NOT:
						{
						int LA61_14 = input.LA(3);
						if ( (synpred20_Vhdl()) ) {
							alt61=1;
						}
						}
						break;
				}
			}
			switch (alt61) {
				case 1 :
					// Vhdl.g:419:7: ( K_WHEN condition K_ELSE )=> conditional_waveforms_2
					{
					pushFollow(FOLLOW_conditional_waveforms_2_in_conditional_waveforms_22515);
					conditional_waveforms_2();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "conditional_waveforms_2"



	// $ANTLR start "configuration_declaration"
	// Vhdl.g:422:1: configuration_declaration : K_CONFIGURATION identifier K_OF name K_IS configuration_declarative_part block_configuration K_END ( K_CONFIGURATION )? ( simple_name )? SEMI ;
	public final void configuration_declaration() throws RecognitionException {
		try {
			// Vhdl.g:423:5: ( K_CONFIGURATION identifier K_OF name K_IS configuration_declarative_part block_configuration K_END ( K_CONFIGURATION )? ( simple_name )? SEMI )
			// Vhdl.g:423:5: K_CONFIGURATION identifier K_OF name K_IS configuration_declarative_part block_configuration K_END ( K_CONFIGURATION )? ( simple_name )? SEMI
			{
			match(input,K_CONFIGURATION,FOLLOW_K_CONFIGURATION_in_configuration_declaration2528); if (state.failed) return;
			pushFollow(FOLLOW_identifier_in_configuration_declaration2530);
			identifier();
			state._fsp--;
			if (state.failed) return;
			match(input,K_OF,FOLLOW_K_OF_in_configuration_declaration2532); if (state.failed) return;
			pushFollow(FOLLOW_name_in_configuration_declaration2534);
			name();
			state._fsp--;
			if (state.failed) return;
			match(input,K_IS,FOLLOW_K_IS_in_configuration_declaration2536); if (state.failed) return;
			pushFollow(FOLLOW_configuration_declarative_part_in_configuration_declaration2546);
			configuration_declarative_part();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_block_configuration_in_configuration_declaration2548);
			block_configuration();
			state._fsp--;
			if (state.failed) return;
			match(input,K_END,FOLLOW_K_END_in_configuration_declaration2558); if (state.failed) return;
			// Vhdl.g:425:15: ( K_CONFIGURATION )?
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==K_CONFIGURATION) ) {
				alt62=1;
			}
			switch (alt62) {
				case 1 :
					// Vhdl.g:425:16: K_CONFIGURATION
					{
					match(input,K_CONFIGURATION,FOLLOW_K_CONFIGURATION_in_configuration_declaration2561); if (state.failed) return;
					}
					break;

			}

			// Vhdl.g:425:34: ( simple_name )?
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==BASIC_IDENTIFIER||LA63_0==EXTENDED_IDENTIFIER) ) {
				alt63=1;
			}
			switch (alt63) {
				case 1 :
					// Vhdl.g:425:35: simple_name
					{
					pushFollow(FOLLOW_simple_name_in_configuration_declaration2566);
					simple_name();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,SEMI,FOLLOW_SEMI_in_configuration_declaration2570); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "configuration_declaration"



	// $ANTLR start "configuration_declarative_item"
	// Vhdl.g:428:1: configuration_declarative_item : ( use_clause | attribute_specification | group_declaration );
	public final void configuration_declarative_item() throws RecognitionException {
		try {
			// Vhdl.g:429:5: ( use_clause | attribute_specification | group_declaration )
			int alt64=3;
			switch ( input.LA(1) ) {
			case K_USE:
				{
				alt64=1;
				}
				break;
			case K_ATTRIBUTE:
				{
				alt64=2;
				}
				break;
			case K_GROUP:
				{
				alt64=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				throw nvae;
			}
			switch (alt64) {
				case 1 :
					// Vhdl.g:429:5: use_clause
					{
					pushFollow(FOLLOW_use_clause_in_configuration_declarative_item2581);
					use_clause();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:430:5: attribute_specification
					{
					pushFollow(FOLLOW_attribute_specification_in_configuration_declarative_item2587);
					attribute_specification();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Vhdl.g:431:5: group_declaration
					{
					pushFollow(FOLLOW_group_declaration_in_configuration_declarative_item2593);
					group_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "configuration_declarative_item"



	// $ANTLR start "configuration_declarative_part"
	// Vhdl.g:434:1: configuration_declarative_part : ( configuration_declarative_item )* ;
	public final void configuration_declarative_part() throws RecognitionException {
		try {
			// Vhdl.g:435:5: ( ( configuration_declarative_item )* )
			// Vhdl.g:435:5: ( configuration_declarative_item )*
			{
			// Vhdl.g:435:5: ( configuration_declarative_item )*
			loop65:
			while (true) {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==K_ATTRIBUTE||LA65_0==K_GROUP||LA65_0==K_USE) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// Vhdl.g:435:6: configuration_declarative_item
					{
					pushFollow(FOLLOW_configuration_declarative_item_in_configuration_declarative_part2605);
					configuration_declarative_item();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop65;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "configuration_declarative_part"



	// $ANTLR start "configuration_item"
	// Vhdl.g:438:1: configuration_item : ( ( block_configuration )=> block_configuration | component_configuration );
	public final void configuration_item() throws RecognitionException {
		try {
			// Vhdl.g:439:5: ( ( block_configuration )=> block_configuration | component_configuration )
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==K_FOR) ) {
				int LA66_1 = input.LA(2);
				if ( (LA66_1==BASIC_IDENTIFIER||LA66_1==EXTENDED_IDENTIFIER) ) {
					int LA66_2 = input.LA(3);
					if ( (synpred21_Vhdl()) ) {
						alt66=1;
					}
					else if ( (true) ) {
						alt66=2;
					}

				}
				else if ( (LA66_1==STRING_LITERAL) && (synpred21_Vhdl())) {
					alt66=1;
				}
				else if ( (LA66_1==K_ALL||LA66_1==K_OTHERS) ) {
					alt66=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 66, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				throw nvae;
			}

			switch (alt66) {
				case 1 :
					// Vhdl.g:439:5: ( block_configuration )=> block_configuration
					{
					pushFollow(FOLLOW_block_configuration_in_configuration_item2623);
					block_configuration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:440:5: component_configuration
					{
					pushFollow(FOLLOW_component_configuration_in_configuration_item2629);
					component_configuration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "configuration_item"



	// $ANTLR start "configuration_specification"
	// Vhdl.g:443:1: configuration_specification : K_FOR component_specification binding_indication SEMI ;
	public final void configuration_specification() throws RecognitionException {
		try {
			// Vhdl.g:444:5: ( K_FOR component_specification binding_indication SEMI )
			// Vhdl.g:444:5: K_FOR component_specification binding_indication SEMI
			{
			match(input,K_FOR,FOLLOW_K_FOR_in_configuration_specification2640); if (state.failed) return;
			pushFollow(FOLLOW_component_specification_in_configuration_specification2642);
			component_specification();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_binding_indication_in_configuration_specification2644);
			binding_indication();
			state._fsp--;
			if (state.failed) return;
			match(input,SEMI,FOLLOW_SEMI_in_configuration_specification2646); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "configuration_specification"



	// $ANTLR start "constant_declaration"
	// Vhdl.g:447:1: constant_declaration : K_CONSTANT identifier_list COLON subtype_indication ( COLONEQ expression )? SEMI ;
	public final void constant_declaration() throws RecognitionException {
		try {
			// Vhdl.g:448:5: ( K_CONSTANT identifier_list COLON subtype_indication ( COLONEQ expression )? SEMI )
			// Vhdl.g:448:5: K_CONSTANT identifier_list COLON subtype_indication ( COLONEQ expression )? SEMI
			{
			match(input,K_CONSTANT,FOLLOW_K_CONSTANT_in_constant_declaration2657); if (state.failed) return;
			pushFollow(FOLLOW_identifier_list_in_constant_declaration2659);
			identifier_list();
			state._fsp--;
			if (state.failed) return;
			match(input,COLON,FOLLOW_COLON_in_constant_declaration2661); if (state.failed) return;
			pushFollow(FOLLOW_subtype_indication_in_constant_declaration2663);
			subtype_indication();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:448:57: ( COLONEQ expression )?
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==COLONEQ) ) {
				alt67=1;
			}
			switch (alt67) {
				case 1 :
					// Vhdl.g:448:58: COLONEQ expression
					{
					match(input,COLONEQ,FOLLOW_COLONEQ_in_constant_declaration2666); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_constant_declaration2668);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,SEMI,FOLLOW_SEMI_in_constant_declaration2672); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "constant_declaration"



	// $ANTLR start "constrained_array_definition"
	// Vhdl.g:451:1: constrained_array_definition : K_ARRAY index_constraint K_OF subtype_indication ;
	public final void constrained_array_definition() throws RecognitionException {
		try {
			// Vhdl.g:452:5: ( K_ARRAY index_constraint K_OF subtype_indication )
			// Vhdl.g:452:5: K_ARRAY index_constraint K_OF subtype_indication
			{
			match(input,K_ARRAY,FOLLOW_K_ARRAY_in_constrained_array_definition2683); if (state.failed) return;
			pushFollow(FOLLOW_index_constraint_in_constrained_array_definition2685);
			index_constraint();
			state._fsp--;
			if (state.failed) return;
			match(input,K_OF,FOLLOW_K_OF_in_constrained_array_definition2687); if (state.failed) return;
			pushFollow(FOLLOW_subtype_indication_in_constrained_array_definition2689);
			subtype_indication();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "constrained_array_definition"



	// $ANTLR start "constraint"
	// Vhdl.g:455:1: constraint : ( range_constraint | index_constraint );
	public final void constraint() throws RecognitionException {
		try {
			// Vhdl.g:456:5: ( range_constraint | index_constraint )
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==K_RANGE) ) {
				alt68=1;
			}
			else if ( (LA68_0==LPAREN) ) {
				alt68=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 68, 0, input);
				throw nvae;
			}

			switch (alt68) {
				case 1 :
					// Vhdl.g:456:5: range_constraint
					{
					pushFollow(FOLLOW_range_constraint_in_constraint2700);
					range_constraint();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:457:5: index_constraint
					{
					pushFollow(FOLLOW_index_constraint_in_constraint2706);
					index_constraint();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "constraint"



	// $ANTLR start "context_clause"
	// Vhdl.g:460:1: context_clause : ( context_item )* ;
	public final void context_clause() throws RecognitionException {
		try {
			// Vhdl.g:461:5: ( ( context_item )* )
			// Vhdl.g:461:5: ( context_item )*
			{
			// Vhdl.g:461:5: ( context_item )*
			loop69:
			while (true) {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==K_LIBRARY||LA69_0==K_USE) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// Vhdl.g:461:6: context_item
					{
					pushFollow(FOLLOW_context_item_in_context_clause2718);
					context_item();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop69;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "context_clause"



	// $ANTLR start "context_item"
	// Vhdl.g:464:1: context_item : ( library_clause | use_clause );
	public final void context_item() throws RecognitionException {
		try {
			// Vhdl.g:465:5: ( library_clause | use_clause )
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==K_LIBRARY) ) {
				alt70=1;
			}
			else if ( (LA70_0==K_USE) ) {
				alt70=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 70, 0, input);
				throw nvae;
			}

			switch (alt70) {
				case 1 :
					// Vhdl.g:465:5: library_clause
					{
					pushFollow(FOLLOW_library_clause_in_context_item2731);
					library_clause();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:466:5: use_clause
					{
					pushFollow(FOLLOW_use_clause_in_context_item2737);
					use_clause();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "context_item"



	// $ANTLR start "decimal_literal"
	// Vhdl.g:469:1: decimal_literal : DECIMAL_LITERAL ;
	public final void decimal_literal() throws RecognitionException {
		try {
			// Vhdl.g:470:5: ( DECIMAL_LITERAL )
			// Vhdl.g:470:5: DECIMAL_LITERAL
			{
			match(input,DECIMAL_LITERAL,FOLLOW_DECIMAL_LITERAL_in_decimal_literal2748); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "decimal_literal"



	// $ANTLR start "declaration"
	// Vhdl.g:473:1: declaration : ( type_declaration | subtype_declaration | ( object_declaration )=> object_declaration | interface_declaration | alias_declaration | attribute_declaration | component_declaration | ( K_GROUP identifier COLON )=> group_declaration | group_template_declaration | entity_declaration | configuration_declaration | subprogram_declaration | package_declaration );
	public final void declaration() throws RecognitionException {
		try {
			// Vhdl.g:474:5: ( type_declaration | subtype_declaration | ( object_declaration )=> object_declaration | interface_declaration | alias_declaration | attribute_declaration | component_declaration | ( K_GROUP identifier COLON )=> group_declaration | group_template_declaration | entity_declaration | configuration_declaration | subprogram_declaration | package_declaration )
			int alt71=13;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==K_TYPE) ) {
				alt71=1;
			}
			else if ( (LA71_0==K_SUBTYPE) ) {
				alt71=2;
			}
			else if ( (LA71_0==K_CONSTANT) ) {
				int LA71_3 = input.LA(2);
				if ( (LA71_3==BASIC_IDENTIFIER||LA71_3==EXTENDED_IDENTIFIER) ) {
					int LA71_19 = input.LA(3);
					if ( (synpred22_Vhdl()) ) {
						alt71=3;
					}
					else if ( (true) ) {
						alt71=4;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 71, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA71_0==K_SIGNAL) ) {
				int LA71_4 = input.LA(2);
				if ( (LA71_4==BASIC_IDENTIFIER||LA71_4==EXTENDED_IDENTIFIER) ) {
					int LA71_20 = input.LA(3);
					if ( (synpred22_Vhdl()) ) {
						alt71=3;
					}
					else if ( (true) ) {
						alt71=4;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 71, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA71_0==K_SHARED) && (synpred22_Vhdl())) {
				alt71=3;
			}
			else if ( (LA71_0==K_VARIABLE) ) {
				int LA71_6 = input.LA(2);
				if ( (LA71_6==BASIC_IDENTIFIER||LA71_6==EXTENDED_IDENTIFIER) ) {
					int LA71_21 = input.LA(3);
					if ( (synpred22_Vhdl()) ) {
						alt71=3;
					}
					else if ( (true) ) {
						alt71=4;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 71, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA71_0==K_FILE) ) {
				int LA71_7 = input.LA(2);
				if ( (LA71_7==BASIC_IDENTIFIER||LA71_7==EXTENDED_IDENTIFIER) ) {
					int LA71_22 = input.LA(3);
					if ( (synpred22_Vhdl()) ) {
						alt71=3;
					}
					else if ( (true) ) {
						alt71=4;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 71, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA71_0==BASIC_IDENTIFIER||LA71_0==EXTENDED_IDENTIFIER) ) {
				alt71=4;
			}
			else if ( (LA71_0==K_ALIAS) ) {
				alt71=5;
			}
			else if ( (LA71_0==K_ATTRIBUTE) ) {
				alt71=6;
			}
			else if ( (LA71_0==K_COMPONENT) ) {
				alt71=7;
			}
			else if ( (LA71_0==K_GROUP) ) {
				int LA71_12 = input.LA(2);
				if ( (LA71_12==BASIC_IDENTIFIER||LA71_12==EXTENDED_IDENTIFIER) ) {
					int LA71_23 = input.LA(3);
					if ( (synpred23_Vhdl()) ) {
						alt71=8;
					}
					else if ( (true) ) {
						alt71=9;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 71, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA71_0==K_ENTITY) ) {
				alt71=10;
			}
			else if ( (LA71_0==K_CONFIGURATION) ) {
				alt71=11;
			}
			else if ( (LA71_0==K_FUNCTION||LA71_0==K_IMPURE||LA71_0==K_PROCEDURE||LA71_0==K_PURE) ) {
				alt71=12;
			}
			else if ( (LA71_0==K_PACKAGE) ) {
				alt71=13;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 71, 0, input);
				throw nvae;
			}

			switch (alt71) {
				case 1 :
					// Vhdl.g:474:5: type_declaration
					{
					pushFollow(FOLLOW_type_declaration_in_declaration2759);
					type_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:475:5: subtype_declaration
					{
					pushFollow(FOLLOW_subtype_declaration_in_declaration2765);
					subtype_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Vhdl.g:476:5: ( object_declaration )=> object_declaration
					{
					pushFollow(FOLLOW_object_declaration_in_declaration2777);
					object_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// Vhdl.g:477:5: interface_declaration
					{
					pushFollow(FOLLOW_interface_declaration_in_declaration2784);
					interface_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// Vhdl.g:478:5: alias_declaration
					{
					pushFollow(FOLLOW_alias_declaration_in_declaration2791);
					alias_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// Vhdl.g:479:5: attribute_declaration
					{
					pushFollow(FOLLOW_attribute_declaration_in_declaration2797);
					attribute_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// Vhdl.g:480:5: component_declaration
					{
					pushFollow(FOLLOW_component_declaration_in_declaration2804);
					component_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// Vhdl.g:481:5: ( K_GROUP identifier COLON )=> group_declaration
					{
					pushFollow(FOLLOW_group_declaration_in_declaration2820);
					group_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 9 :
					// Vhdl.g:482:5: group_template_declaration
					{
					pushFollow(FOLLOW_group_template_declaration_in_declaration2826);
					group_template_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 10 :
					// Vhdl.g:483:5: entity_declaration
					{
					pushFollow(FOLLOW_entity_declaration_in_declaration2832);
					entity_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 11 :
					// Vhdl.g:484:5: configuration_declaration
					{
					pushFollow(FOLLOW_configuration_declaration_in_declaration2839);
					configuration_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 12 :
					// Vhdl.g:485:5: subprogram_declaration
					{
					pushFollow(FOLLOW_subprogram_declaration_in_declaration2846);
					subprogram_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 13 :
					// Vhdl.g:486:5: package_declaration
					{
					pushFollow(FOLLOW_package_declaration_in_declaration2853);
					package_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declaration"



	// $ANTLR start "delay_mechanism"
	// Vhdl.g:489:1: delay_mechanism : ( K_TRANSPORT | ( K_REJECT expression )? K_INERTIAL );
	public final void delay_mechanism() throws RecognitionException {
		try {
			// Vhdl.g:490:5: ( K_TRANSPORT | ( K_REJECT expression )? K_INERTIAL )
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==K_TRANSPORT) ) {
				alt73=1;
			}
			else if ( (LA73_0==K_INERTIAL||LA73_0==K_REJECT) ) {
				alt73=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}

			switch (alt73) {
				case 1 :
					// Vhdl.g:490:5: K_TRANSPORT
					{
					match(input,K_TRANSPORT,FOLLOW_K_TRANSPORT_in_delay_mechanism2864); if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:491:5: ( K_REJECT expression )? K_INERTIAL
					{
					// Vhdl.g:491:5: ( K_REJECT expression )?
					int alt72=2;
					int LA72_0 = input.LA(1);
					if ( (LA72_0==K_REJECT) ) {
						alt72=1;
					}
					switch (alt72) {
						case 1 :
							// Vhdl.g:491:6: K_REJECT expression
							{
							match(input,K_REJECT,FOLLOW_K_REJECT_in_delay_mechanism2871); if (state.failed) return;
							pushFollow(FOLLOW_expression_in_delay_mechanism2873);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,K_INERTIAL,FOLLOW_K_INERTIAL_in_delay_mechanism2877); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "delay_mechanism"



	// $ANTLR start "design_file"
	// Vhdl.g:494:1: design_file : ( design_unit )+ ;
	public final void design_file() throws RecognitionException {
		try {
			// Vhdl.g:495:6: ( ( design_unit )+ )
			// Vhdl.g:495:6: ( design_unit )+
			{
			// Vhdl.g:495:6: ( design_unit )+
			int cnt74=0;
			loop74:
			while (true) {
				int alt74=2;
				int LA74_0 = input.LA(1);
				if ( (LA74_0==K_ARCHITECTURE||LA74_0==K_CONFIGURATION||LA74_0==K_ENTITY||LA74_0==K_LIBRARY||LA74_0==K_PACKAGE||LA74_0==K_USE) ) {
					alt74=1;
				}

				switch (alt74) {
				case 1 :
					// Vhdl.g:495:7: design_unit
					{
					pushFollow(FOLLOW_design_unit_in_design_file2890);
					design_unit();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt74 >= 1 ) break loop74;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(74, input);
					throw eee;
				}
				cnt74++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "design_file"



	// $ANTLR start "design_unit"
	// Vhdl.g:498:1: design_unit : context_clause library_unit ;
	public final void design_unit() throws RecognitionException {
		try {
			// Vhdl.g:499:5: ( context_clause library_unit )
			// Vhdl.g:499:5: context_clause library_unit
			{
			pushFollow(FOLLOW_context_clause_in_design_unit2903);
			context_clause();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_library_unit_in_design_unit2905);
			library_unit();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "design_unit"



	// $ANTLR start "designator"
	// Vhdl.g:502:1: designator : ( identifier | operator_symbol );
	public final void designator() throws RecognitionException {
		try {
			// Vhdl.g:503:5: ( identifier | operator_symbol )
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==BASIC_IDENTIFIER||LA75_0==EXTENDED_IDENTIFIER) ) {
				alt75=1;
			}
			else if ( (LA75_0==STRING_LITERAL) ) {
				alt75=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 75, 0, input);
				throw nvae;
			}

			switch (alt75) {
				case 1 :
					// Vhdl.g:503:5: identifier
					{
					pushFollow(FOLLOW_identifier_in_designator2916);
					identifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:504:5: operator_symbol
					{
					pushFollow(FOLLOW_operator_symbol_in_designator2923);
					operator_symbol();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "designator"



	// $ANTLR start "direction"
	// Vhdl.g:507:1: direction : ( K_TO | K_DOWNTO );
	public final void direction() throws RecognitionException {
		try {
			// Vhdl.g:508:5: ( K_TO | K_DOWNTO )
			// Vhdl.g:
			{
			if ( input.LA(1)==K_DOWNTO||input.LA(1)==K_TO ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "direction"



	// $ANTLR start "disconnection_specification"
	// Vhdl.g:512:1: disconnection_specification : K_DISCONNECT guarded_signal_specification K_AFTER expression SEMI ;
	public final void disconnection_specification() throws RecognitionException {
		try {
			// Vhdl.g:513:5: ( K_DISCONNECT guarded_signal_specification K_AFTER expression SEMI )
			// Vhdl.g:513:5: K_DISCONNECT guarded_signal_specification K_AFTER expression SEMI
			{
			match(input,K_DISCONNECT,FOLLOW_K_DISCONNECT_in_disconnection_specification2952); if (state.failed) return;
			pushFollow(FOLLOW_guarded_signal_specification_in_disconnection_specification2954);
			guarded_signal_specification();
			state._fsp--;
			if (state.failed) return;
			match(input,K_AFTER,FOLLOW_K_AFTER_in_disconnection_specification2956); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_disconnection_specification2958);
			expression();
			state._fsp--;
			if (state.failed) return;
			match(input,SEMI,FOLLOW_SEMI_in_disconnection_specification2960); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "disconnection_specification"



	// $ANTLR start "discrete_range"
	// Vhdl.g:516:1: discrete_range : ( ( range )=> range | subtype_indication );
	public final void discrete_range() throws RecognitionException {
		try {
			// Vhdl.g:517:5: ( ( range )=> range | subtype_indication )
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==MINUS||LA76_0==PLUS) && (synpred24_Vhdl())) {
				alt76=1;
			}
			else if ( (LA76_0==BASIC_IDENTIFIER||LA76_0==EXTENDED_IDENTIFIER) ) {
				int LA76_2 = input.LA(2);
				if ( (synpred24_Vhdl()) ) {
					alt76=1;
				}
				else if ( (true) ) {
					alt76=2;
				}

			}
			else if ( (LA76_0==STRING_LITERAL) ) {
				int LA76_3 = input.LA(2);
				if ( (synpred24_Vhdl()) ) {
					alt76=1;
				}
				else if ( (true) ) {
					alt76=2;
				}

			}
			else if ( (LA76_0==LPAREN) && (synpred24_Vhdl())) {
				alt76=1;
			}
			else if ( (LA76_0==DECIMAL_LITERAL) && (synpred24_Vhdl())) {
				alt76=1;
			}
			else if ( (LA76_0==BASED_LITERAL) && (synpred24_Vhdl())) {
				alt76=1;
			}
			else if ( (LA76_0==CHARACTER_LITERAL) && (synpred24_Vhdl())) {
				alt76=1;
			}
			else if ( (LA76_0==BIT_STRING_LITERAL) && (synpred24_Vhdl())) {
				alt76=1;
			}
			else if ( (LA76_0==K_NULL) && (synpred24_Vhdl())) {
				alt76=1;
			}
			else if ( (LA76_0==K_NEW) && (synpred24_Vhdl())) {
				alt76=1;
			}
			else if ( (LA76_0==K_ABS) && (synpred24_Vhdl())) {
				alt76=1;
			}
			else if ( (LA76_0==K_NOT) && (synpred24_Vhdl())) {
				alt76=1;
			}

			switch (alt76) {
				case 1 :
					// Vhdl.g:517:5: ( range )=> range
					{
					pushFollow(FOLLOW_range_in_discrete_range2976);
					range();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:518:5: subtype_indication
					{
					pushFollow(FOLLOW_subtype_indication_in_discrete_range2982);
					subtype_indication();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "discrete_range"



	// $ANTLR start "element_association"
	// Vhdl.g:521:1: element_association : ( ( choices EQGRT )=> choices EQGRT )? expression ;
	public final void element_association() throws RecognitionException {
		try {
			// Vhdl.g:522:5: ( ( ( choices EQGRT )=> choices EQGRT )? expression )
			// Vhdl.g:522:5: ( ( choices EQGRT )=> choices EQGRT )? expression
			{
			// Vhdl.g:522:5: ( ( choices EQGRT )=> choices EQGRT )?
			int alt77=2;
			alt77 = dfa77.predict(input);
			switch (alt77) {
				case 1 :
					// Vhdl.g:522:6: ( choices EQGRT )=> choices EQGRT
					{
					pushFollow(FOLLOW_choices_in_element_association3001);
					choices();
					state._fsp--;
					if (state.failed) return;
					match(input,EQGRT,FOLLOW_EQGRT_in_element_association3003); if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_expression_in_element_association3007);
			expression();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "element_association"



	// $ANTLR start "element_declaration"
	// Vhdl.g:525:1: element_declaration : identifier_list COLON element_subtype_definition SEMI ;
	public final void element_declaration() throws RecognitionException {
		try {
			// Vhdl.g:526:5: ( identifier_list COLON element_subtype_definition SEMI )
			// Vhdl.g:526:5: identifier_list COLON element_subtype_definition SEMI
			{
			pushFollow(FOLLOW_identifier_list_in_element_declaration3018);
			identifier_list();
			state._fsp--;
			if (state.failed) return;
			match(input,COLON,FOLLOW_COLON_in_element_declaration3020); if (state.failed) return;
			pushFollow(FOLLOW_element_subtype_definition_in_element_declaration3022);
			element_subtype_definition();
			state._fsp--;
			if (state.failed) return;
			match(input,SEMI,FOLLOW_SEMI_in_element_declaration3024); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "element_declaration"



	// $ANTLR start "element_subtype_definition"
	// Vhdl.g:529:1: element_subtype_definition : subtype_indication ;
	public final void element_subtype_definition() throws RecognitionException {
		try {
			// Vhdl.g:530:5: ( subtype_indication )
			// Vhdl.g:530:5: subtype_indication
			{
			pushFollow(FOLLOW_subtype_indication_in_element_subtype_definition3035);
			subtype_indication();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "element_subtype_definition"



	// $ANTLR start "entity_aspect"
	// Vhdl.g:533:1: entity_aspect : ( K_ENTITY name ( LPAREN identifier RPAREN )? | K_CONFIGURATION name | K_OPEN );
	public final void entity_aspect() throws RecognitionException {
		try {
			// Vhdl.g:534:5: ( K_ENTITY name ( LPAREN identifier RPAREN )? | K_CONFIGURATION name | K_OPEN )
			int alt79=3;
			switch ( input.LA(1) ) {
			case K_ENTITY:
				{
				alt79=1;
				}
				break;
			case K_CONFIGURATION:
				{
				alt79=2;
				}
				break;
			case K_OPEN:
				{
				alt79=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 79, 0, input);
				throw nvae;
			}
			switch (alt79) {
				case 1 :
					// Vhdl.g:534:5: K_ENTITY name ( LPAREN identifier RPAREN )?
					{
					match(input,K_ENTITY,FOLLOW_K_ENTITY_in_entity_aspect3046); if (state.failed) return;
					pushFollow(FOLLOW_name_in_entity_aspect3048);
					name();
					state._fsp--;
					if (state.failed) return;
					// Vhdl.g:534:19: ( LPAREN identifier RPAREN )?
					int alt78=2;
					int LA78_0 = input.LA(1);
					if ( (LA78_0==LPAREN) ) {
						alt78=1;
					}
					switch (alt78) {
						case 1 :
							// Vhdl.g:534:20: LPAREN identifier RPAREN
							{
							match(input,LPAREN,FOLLOW_LPAREN_in_entity_aspect3051); if (state.failed) return;
							pushFollow(FOLLOW_identifier_in_entity_aspect3053);
							identifier();
							state._fsp--;
							if (state.failed) return;
							match(input,RPAREN,FOLLOW_RPAREN_in_entity_aspect3055); if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 2 :
					// Vhdl.g:535:5: K_CONFIGURATION name
					{
					match(input,K_CONFIGURATION,FOLLOW_K_CONFIGURATION_in_entity_aspect3063); if (state.failed) return;
					pushFollow(FOLLOW_name_in_entity_aspect3065);
					name();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Vhdl.g:536:5: K_OPEN
					{
					match(input,K_OPEN,FOLLOW_K_OPEN_in_entity_aspect3071); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entity_aspect"



	// $ANTLR start "entity_class"
	// Vhdl.g:539:1: entity_class : ( K_ENTITY | K_PROCEDURE | K_TYPE | K_SIGNAL | K_LABEL | K_ARCHITECTURE | K_FUNCTION | K_SUBTYPE | K_VARIABLE | K_LITERAL | K_CONFIGURATION | K_PACKAGE | K_CONSTANT | K_COMPONENT | K_UNITS );
	public final void entity_class() throws RecognitionException {
		try {
			// Vhdl.g:540:5: ( K_ENTITY | K_PROCEDURE | K_TYPE | K_SIGNAL | K_LABEL | K_ARCHITECTURE | K_FUNCTION | K_SUBTYPE | K_VARIABLE | K_LITERAL | K_CONFIGURATION | K_PACKAGE | K_CONSTANT | K_COMPONENT | K_UNITS )
			// Vhdl.g:
			{
			if ( input.LA(1)==K_ARCHITECTURE||(input.LA(1) >= K_COMPONENT && input.LA(1) <= K_CONSTANT)||input.LA(1)==K_ENTITY||input.LA(1)==K_FUNCTION||input.LA(1)==K_LABEL||input.LA(1)==K_LITERAL||input.LA(1)==K_PACKAGE||input.LA(1)==K_PROCEDURE||input.LA(1)==K_SIGNAL||input.LA(1)==K_SUBTYPE||input.LA(1)==K_TYPE||input.LA(1)==K_UNITS||input.LA(1)==K_VARIABLE ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entity_class"



	// $ANTLR start "entity_class_entry"
	// Vhdl.g:557:1: entity_class_entry : entity_class ( LSTGRT )? ;
	public final void entity_class_entry() throws RecognitionException {
		try {
			// Vhdl.g:558:5: ( entity_class ( LSTGRT )? )
			// Vhdl.g:558:5: entity_class ( LSTGRT )?
			{
			pushFollow(FOLLOW_entity_class_in_entity_class_entry3180);
			entity_class();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:558:18: ( LSTGRT )?
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==LSTGRT) ) {
				alt80=1;
			}
			switch (alt80) {
				case 1 :
					// Vhdl.g:558:19: LSTGRT
					{
					match(input,LSTGRT,FOLLOW_LSTGRT_in_entity_class_entry3183); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entity_class_entry"



	// $ANTLR start "entity_class_entry_list"
	// Vhdl.g:561:1: entity_class_entry_list : entity_class_entry ( COMMA entity_class_entry )* ;
	public final void entity_class_entry_list() throws RecognitionException {
		try {
			// Vhdl.g:562:5: ( entity_class_entry ( COMMA entity_class_entry )* )
			// Vhdl.g:562:5: entity_class_entry ( COMMA entity_class_entry )*
			{
			pushFollow(FOLLOW_entity_class_entry_in_entity_class_entry_list3196);
			entity_class_entry();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:562:24: ( COMMA entity_class_entry )*
			loop81:
			while (true) {
				int alt81=2;
				int LA81_0 = input.LA(1);
				if ( (LA81_0==COMMA) ) {
					alt81=1;
				}

				switch (alt81) {
				case 1 :
					// Vhdl.g:562:25: COMMA entity_class_entry
					{
					match(input,COMMA,FOLLOW_COMMA_in_entity_class_entry_list3199); if (state.failed) return;
					pushFollow(FOLLOW_entity_class_entry_in_entity_class_entry_list3201);
					entity_class_entry();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop81;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entity_class_entry_list"



	// $ANTLR start "entity_declaration"
	// Vhdl.g:565:1: entity_declaration : K_ENTITY identifier K_IS entity_header entity_declarative_part ( K_BEGIN entity_statement_part )? K_END ( K_ENTITY )? ( simple_name )? SEMI ;
	public final void entity_declaration() throws RecognitionException {
		try {
			// Vhdl.g:566:5: ( K_ENTITY identifier K_IS entity_header entity_declarative_part ( K_BEGIN entity_statement_part )? K_END ( K_ENTITY )? ( simple_name )? SEMI )
			// Vhdl.g:566:5: K_ENTITY identifier K_IS entity_header entity_declarative_part ( K_BEGIN entity_statement_part )? K_END ( K_ENTITY )? ( simple_name )? SEMI
			{
			match(input,K_ENTITY,FOLLOW_K_ENTITY_in_entity_declaration3214); if (state.failed) return;
			pushFollow(FOLLOW_identifier_in_entity_declaration3216);
			identifier();
			state._fsp--;
			if (state.failed) return;
			match(input,K_IS,FOLLOW_K_IS_in_entity_declaration3220); if (state.failed) return;
			pushFollow(FOLLOW_entity_header_in_entity_declaration3222);
			entity_header();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_entity_declarative_part_in_entity_declaration3224);
			entity_declarative_part();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:568:9: ( K_BEGIN entity_statement_part )?
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==K_BEGIN) ) {
				alt82=1;
			}
			switch (alt82) {
				case 1 :
					// Vhdl.g:568:10: K_BEGIN entity_statement_part
					{
					match(input,K_BEGIN,FOLLOW_K_BEGIN_in_entity_declaration3235); if (state.failed) return;
					pushFollow(FOLLOW_entity_statement_part_in_entity_declaration3237);
					entity_statement_part();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,K_END,FOLLOW_K_END_in_entity_declaration3249); if (state.failed) return;
			// Vhdl.g:569:15: ( K_ENTITY )?
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==K_ENTITY) ) {
				alt83=1;
			}
			switch (alt83) {
				case 1 :
					// Vhdl.g:569:16: K_ENTITY
					{
					match(input,K_ENTITY,FOLLOW_K_ENTITY_in_entity_declaration3252); if (state.failed) return;
					}
					break;

			}

			// Vhdl.g:569:27: ( simple_name )?
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==BASIC_IDENTIFIER||LA84_0==EXTENDED_IDENTIFIER) ) {
				alt84=1;
			}
			switch (alt84) {
				case 1 :
					// Vhdl.g:569:28: simple_name
					{
					pushFollow(FOLLOW_simple_name_in_entity_declaration3257);
					simple_name();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,SEMI,FOLLOW_SEMI_in_entity_declaration3261); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entity_declaration"



	// $ANTLR start "entity_declarative_item"
	// Vhdl.g:572:1: entity_declarative_item : ( ( subprogram_declaration )=> subprogram_declaration | subprogram_body | type_declaration | subtype_declaration | constant_declaration | signal_declaration | variable_declaration | file_declaration | alias_declaration | ( attribute_specification )=> attribute_specification | attribute_declaration | disconnection_specification | use_clause | ( K_GROUP identifier COLON )=> group_declaration | group_template_declaration );
	public final void entity_declarative_item() throws RecognitionException {
		try {
			// Vhdl.g:573:5: ( ( subprogram_declaration )=> subprogram_declaration | subprogram_body | type_declaration | subtype_declaration | constant_declaration | signal_declaration | variable_declaration | file_declaration | alias_declaration | ( attribute_specification )=> attribute_specification | attribute_declaration | disconnection_specification | use_clause | ( K_GROUP identifier COLON )=> group_declaration | group_template_declaration )
			int alt85=15;
			switch ( input.LA(1) ) {
			case K_PROCEDURE:
				{
				int LA85_1 = input.LA(2);
				if ( (LA85_1==BASIC_IDENTIFIER||LA85_1==EXTENDED_IDENTIFIER) ) {
					int LA85_16 = input.LA(3);
					if ( (synpred26_Vhdl()) ) {
						alt85=1;
					}
					else if ( (true) ) {
						alt85=2;
					}

				}
				else if ( (LA85_1==STRING_LITERAL) ) {
					int LA85_17 = input.LA(3);
					if ( (synpred26_Vhdl()) ) {
						alt85=1;
					}
					else if ( (true) ) {
						alt85=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 85, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_IMPURE:
			case K_PURE:
				{
				int LA85_2 = input.LA(2);
				if ( (LA85_2==K_FUNCTION) ) {
					int LA85_18 = input.LA(3);
					if ( (synpred26_Vhdl()) ) {
						alt85=1;
					}
					else if ( (true) ) {
						alt85=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 85, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_FUNCTION:
				{
				int LA85_3 = input.LA(2);
				if ( (LA85_3==BASIC_IDENTIFIER||LA85_3==EXTENDED_IDENTIFIER) ) {
					int LA85_19 = input.LA(3);
					if ( (synpred26_Vhdl()) ) {
						alt85=1;
					}
					else if ( (true) ) {
						alt85=2;
					}

				}
				else if ( (LA85_3==STRING_LITERAL) ) {
					int LA85_20 = input.LA(3);
					if ( (synpred26_Vhdl()) ) {
						alt85=1;
					}
					else if ( (true) ) {
						alt85=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 85, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_TYPE:
				{
				alt85=3;
				}
				break;
			case K_SUBTYPE:
				{
				alt85=4;
				}
				break;
			case K_CONSTANT:
				{
				alt85=5;
				}
				break;
			case K_SIGNAL:
				{
				alt85=6;
				}
				break;
			case K_SHARED:
			case K_VARIABLE:
				{
				alt85=7;
				}
				break;
			case K_FILE:
				{
				alt85=8;
				}
				break;
			case K_ALIAS:
				{
				alt85=9;
				}
				break;
			case K_ATTRIBUTE:
				{
				int LA85_12 = input.LA(2);
				if ( (LA85_12==BASIC_IDENTIFIER||LA85_12==EXTENDED_IDENTIFIER) ) {
					int LA85_21 = input.LA(3);
					if ( (synpred27_Vhdl()) ) {
						alt85=10;
					}
					else if ( (true) ) {
						alt85=11;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 85, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_DISCONNECT:
				{
				alt85=12;
				}
				break;
			case K_USE:
				{
				alt85=13;
				}
				break;
			case K_GROUP:
				{
				int LA85_15 = input.LA(2);
				if ( (LA85_15==BASIC_IDENTIFIER||LA85_15==EXTENDED_IDENTIFIER) ) {
					int LA85_22 = input.LA(3);
					if ( (synpred28_Vhdl()) ) {
						alt85=14;
					}
					else if ( (true) ) {
						alt85=15;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 85, 15, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 85, 0, input);
				throw nvae;
			}
			switch (alt85) {
				case 1 :
					// Vhdl.g:573:5: ( subprogram_declaration )=> subprogram_declaration
					{
					pushFollow(FOLLOW_subprogram_declaration_in_entity_declarative_item3277);
					subprogram_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:574:5: subprogram_body
					{
					pushFollow(FOLLOW_subprogram_body_in_entity_declarative_item3283);
					subprogram_body();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Vhdl.g:575:5: type_declaration
					{
					pushFollow(FOLLOW_type_declaration_in_entity_declarative_item3290);
					type_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// Vhdl.g:576:5: subtype_declaration
					{
					pushFollow(FOLLOW_subtype_declaration_in_entity_declarative_item3297);
					subtype_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// Vhdl.g:577:5: constant_declaration
					{
					pushFollow(FOLLOW_constant_declaration_in_entity_declarative_item3304);
					constant_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// Vhdl.g:578:5: signal_declaration
					{
					pushFollow(FOLLOW_signal_declaration_in_entity_declarative_item3311);
					signal_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// Vhdl.g:579:5: variable_declaration
					{
					pushFollow(FOLLOW_variable_declaration_in_entity_declarative_item3318);
					variable_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// Vhdl.g:580:5: file_declaration
					{
					pushFollow(FOLLOW_file_declaration_in_entity_declarative_item3325);
					file_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 9 :
					// Vhdl.g:581:5: alias_declaration
					{
					pushFollow(FOLLOW_alias_declaration_in_entity_declarative_item3332);
					alias_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 10 :
					// Vhdl.g:582:5: ( attribute_specification )=> attribute_specification
					{
					pushFollow(FOLLOW_attribute_specification_in_entity_declarative_item3344);
					attribute_specification();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 11 :
					// Vhdl.g:583:5: attribute_declaration
					{
					pushFollow(FOLLOW_attribute_declaration_in_entity_declarative_item3350);
					attribute_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 12 :
					// Vhdl.g:584:5: disconnection_specification
					{
					pushFollow(FOLLOW_disconnection_specification_in_entity_declarative_item3356);
					disconnection_specification();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 13 :
					// Vhdl.g:585:5: use_clause
					{
					pushFollow(FOLLOW_use_clause_in_entity_declarative_item3363);
					use_clause();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 14 :
					// Vhdl.g:586:5: ( K_GROUP identifier COLON )=> group_declaration
					{
					pushFollow(FOLLOW_group_declaration_in_entity_declarative_item3379);
					group_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 15 :
					// Vhdl.g:587:5: group_template_declaration
					{
					pushFollow(FOLLOW_group_template_declaration_in_entity_declarative_item3385);
					group_template_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entity_declarative_item"



	// $ANTLR start "entity_declarative_part"
	// Vhdl.g:590:1: entity_declarative_part : ( entity_declarative_item )* ;
	public final void entity_declarative_part() throws RecognitionException {
		try {
			// Vhdl.g:591:5: ( ( entity_declarative_item )* )
			// Vhdl.g:591:5: ( entity_declarative_item )*
			{
			// Vhdl.g:591:5: ( entity_declarative_item )*
			loop86:
			while (true) {
				int alt86=2;
				int LA86_0 = input.LA(1);
				if ( (LA86_0==K_ALIAS||LA86_0==K_ATTRIBUTE||(LA86_0 >= K_CONSTANT && LA86_0 <= K_DISCONNECT)||LA86_0==K_FILE||LA86_0==K_FUNCTION||LA86_0==K_GROUP||LA86_0==K_IMPURE||LA86_0==K_PROCEDURE||LA86_0==K_PURE||(LA86_0 >= K_SHARED && LA86_0 <= K_SIGNAL)||LA86_0==K_SUBTYPE||LA86_0==K_TYPE||(LA86_0 >= K_USE && LA86_0 <= K_VARIABLE)) ) {
					alt86=1;
				}

				switch (alt86) {
				case 1 :
					// Vhdl.g:591:6: entity_declarative_item
					{
					pushFollow(FOLLOW_entity_declarative_item_in_entity_declarative_part3397);
					entity_declarative_item();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop86;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entity_declarative_part"



	// $ANTLR start "entity_designator"
	// Vhdl.g:594:1: entity_designator : entity_tag ( signature )? ;
	public final void entity_designator() throws RecognitionException {
		try {
			// Vhdl.g:595:5: ( entity_tag ( signature )? )
			// Vhdl.g:595:5: entity_tag ( signature )?
			{
			pushFollow(FOLLOW_entity_tag_in_entity_designator3410);
			entity_tag();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:595:16: ( signature )?
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( (LA87_0==LBRACK) ) {
				alt87=1;
			}
			switch (alt87) {
				case 1 :
					// Vhdl.g:595:17: signature
					{
					pushFollow(FOLLOW_signature_in_entity_designator3413);
					signature();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entity_designator"



	// $ANTLR start "entity_header"
	// Vhdl.g:598:1: entity_header : ( generic_clause )? ( port_clause )? ;
	public final void entity_header() throws RecognitionException {
		try {
			// Vhdl.g:599:5: ( ( generic_clause )? ( port_clause )? )
			// Vhdl.g:599:5: ( generic_clause )? ( port_clause )?
			{
			// Vhdl.g:599:5: ( generic_clause )?
			int alt88=2;
			int LA88_0 = input.LA(1);
			if ( (LA88_0==K_GENERIC) ) {
				alt88=1;
			}
			switch (alt88) {
				case 1 :
					// Vhdl.g:599:6: generic_clause
					{
					pushFollow(FOLLOW_generic_clause_in_entity_header3427);
					generic_clause();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// Vhdl.g:599:24: ( port_clause )?
			int alt89=2;
			int LA89_0 = input.LA(1);
			if ( (LA89_0==K_PORT) ) {
				alt89=1;
			}
			switch (alt89) {
				case 1 :
					// Vhdl.g:599:25: port_clause
					{
					pushFollow(FOLLOW_port_clause_in_entity_header3433);
					port_clause();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entity_header"



	// $ANTLR start "entity_name_list"
	// Vhdl.g:602:1: entity_name_list : ( entity_designator ( COMMA entity_designator )* | K_OTHERS | K_ALL );
	public final void entity_name_list() throws RecognitionException {
		try {
			// Vhdl.g:603:5: ( entity_designator ( COMMA entity_designator )* | K_OTHERS | K_ALL )
			int alt91=3;
			switch ( input.LA(1) ) {
			case BASIC_IDENTIFIER:
			case CHARACTER_LITERAL:
			case EXTENDED_IDENTIFIER:
			case STRING_LITERAL:
				{
				alt91=1;
				}
				break;
			case K_OTHERS:
				{
				alt91=2;
				}
				break;
			case K_ALL:
				{
				alt91=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 91, 0, input);
				throw nvae;
			}
			switch (alt91) {
				case 1 :
					// Vhdl.g:603:5: entity_designator ( COMMA entity_designator )*
					{
					pushFollow(FOLLOW_entity_designator_in_entity_name_list3446);
					entity_designator();
					state._fsp--;
					if (state.failed) return;
					// Vhdl.g:603:23: ( COMMA entity_designator )*
					loop90:
					while (true) {
						int alt90=2;
						int LA90_0 = input.LA(1);
						if ( (LA90_0==COMMA) ) {
							alt90=1;
						}

						switch (alt90) {
						case 1 :
							// Vhdl.g:603:24: COMMA entity_designator
							{
							match(input,COMMA,FOLLOW_COMMA_in_entity_name_list3449); if (state.failed) return;
							pushFollow(FOLLOW_entity_designator_in_entity_name_list3451);
							entity_designator();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop90;
						}
					}

					}
					break;
				case 2 :
					// Vhdl.g:604:5: K_OTHERS
					{
					match(input,K_OTHERS,FOLLOW_K_OTHERS_in_entity_name_list3459); if (state.failed) return;
					}
					break;
				case 3 :
					// Vhdl.g:605:5: K_ALL
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_entity_name_list3465); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entity_name_list"



	// $ANTLR start "entity_specification"
	// Vhdl.g:608:1: entity_specification : entity_name_list COLON entity_class ;
	public final void entity_specification() throws RecognitionException {
		try {
			// Vhdl.g:609:5: ( entity_name_list COLON entity_class )
			// Vhdl.g:609:5: entity_name_list COLON entity_class
			{
			pushFollow(FOLLOW_entity_name_list_in_entity_specification3476);
			entity_name_list();
			state._fsp--;
			if (state.failed) return;
			match(input,COLON,FOLLOW_COLON_in_entity_specification3478); if (state.failed) return;
			pushFollow(FOLLOW_entity_class_in_entity_specification3480);
			entity_class();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entity_specification"



	// $ANTLR start "entity_statement"
	// Vhdl.g:612:1: entity_statement : ( ( concurrent_assertion_statement )=> concurrent_assertion_statement | ( concurrent_procedure_call_statement )=> concurrent_procedure_call_statement | process_statement );
	public final void entity_statement() throws RecognitionException {
		try {
			// Vhdl.g:613:5: ( ( concurrent_assertion_statement )=> concurrent_assertion_statement | ( concurrent_procedure_call_statement )=> concurrent_procedure_call_statement | process_statement )
			int alt92=3;
			int LA92_0 = input.LA(1);
			if ( (LA92_0==BASIC_IDENTIFIER||LA92_0==EXTENDED_IDENTIFIER) ) {
				int LA92_1 = input.LA(2);
				if ( (LA92_1==COLON) ) {
					int LA92_6 = input.LA(3);
					if ( (synpred29_Vhdl()) ) {
						alt92=1;
					}
					else if ( (synpred30_Vhdl()) ) {
						alt92=2;
					}
					else if ( (true) ) {
						alt92=3;
					}

				}
				else if ( (LA92_1==DOT) && (synpred30_Vhdl())) {
					alt92=2;
				}
				else if ( (LA92_1==TIC) && (synpred30_Vhdl())) {
					alt92=2;
				}
				else if ( (LA92_1==LBRACK) && (synpred30_Vhdl())) {
					alt92=2;
				}
				else if ( (LA92_1==TIC_SIMPLE_NAME) && (synpred30_Vhdl())) {
					alt92=2;
				}
				else if ( (LA92_1==LPAREN) && (synpred30_Vhdl())) {
					alt92=2;
				}
				else if ( (LA92_1==SEMI) && (synpred30_Vhdl())) {
					alt92=2;
				}

			}
			else if ( (LA92_0==K_POSTPONED) ) {
				int LA92_2 = input.LA(2);
				if ( (LA92_2==K_ASSERT) && (synpred29_Vhdl())) {
					alt92=1;
				}
				else if ( (LA92_2==BASIC_IDENTIFIER||LA92_2==EXTENDED_IDENTIFIER) && (synpred30_Vhdl())) {
					alt92=2;
				}
				else if ( (LA92_2==STRING_LITERAL) && (synpred30_Vhdl())) {
					alt92=2;
				}
				else if ( (LA92_2==K_PROCESS) ) {
					alt92=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA92_0==K_ASSERT) && (synpred29_Vhdl())) {
				alt92=1;
			}
			else if ( (LA92_0==STRING_LITERAL) && (synpred30_Vhdl())) {
				alt92=2;
			}
			else if ( (LA92_0==K_PROCESS) ) {
				alt92=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 92, 0, input);
				throw nvae;
			}

			switch (alt92) {
				case 1 :
					// Vhdl.g:613:5: ( concurrent_assertion_statement )=> concurrent_assertion_statement
					{
					pushFollow(FOLLOW_concurrent_assertion_statement_in_entity_statement3496);
					concurrent_assertion_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:614:5: ( concurrent_procedure_call_statement )=> concurrent_procedure_call_statement
					{
					pushFollow(FOLLOW_concurrent_procedure_call_statement_in_entity_statement3510);
					concurrent_procedure_call_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Vhdl.g:616:5: process_statement
					{
					pushFollow(FOLLOW_process_statement_in_entity_statement3517);
					process_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entity_statement"



	// $ANTLR start "entity_statement_part"
	// Vhdl.g:619:1: entity_statement_part : ( entity_statement )* ;
	public final void entity_statement_part() throws RecognitionException {
		try {
			// Vhdl.g:620:5: ( ( entity_statement )* )
			// Vhdl.g:620:5: ( entity_statement )*
			{
			// Vhdl.g:620:5: ( entity_statement )*
			loop93:
			while (true) {
				int alt93=2;
				int LA93_0 = input.LA(1);
				if ( (LA93_0==BASIC_IDENTIFIER||LA93_0==EXTENDED_IDENTIFIER||LA93_0==K_ASSERT||LA93_0==K_POSTPONED||LA93_0==K_PROCESS||LA93_0==STRING_LITERAL) ) {
					alt93=1;
				}

				switch (alt93) {
				case 1 :
					// Vhdl.g:620:6: entity_statement
					{
					pushFollow(FOLLOW_entity_statement_in_entity_statement_part3529);
					entity_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop93;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entity_statement_part"



	// $ANTLR start "entity_tag"
	// Vhdl.g:623:1: entity_tag : ( simple_name | character_literal | operator_symbol );
	public final void entity_tag() throws RecognitionException {
		try {
			// Vhdl.g:624:5: ( simple_name | character_literal | operator_symbol )
			int alt94=3;
			switch ( input.LA(1) ) {
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
				{
				alt94=1;
				}
				break;
			case CHARACTER_LITERAL:
				{
				alt94=2;
				}
				break;
			case STRING_LITERAL:
				{
				alt94=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 94, 0, input);
				throw nvae;
			}
			switch (alt94) {
				case 1 :
					// Vhdl.g:624:5: simple_name
					{
					pushFollow(FOLLOW_simple_name_in_entity_tag3542);
					simple_name();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:625:5: character_literal
					{
					pushFollow(FOLLOW_character_literal_in_entity_tag3549);
					character_literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Vhdl.g:626:5: operator_symbol
					{
					pushFollow(FOLLOW_operator_symbol_in_entity_tag3556);
					operator_symbol();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entity_tag"



	// $ANTLR start "enumeration_literal"
	// Vhdl.g:629:1: enumeration_literal : ( identifier | character_literal );
	public final void enumeration_literal() throws RecognitionException {
		try {
			// Vhdl.g:630:5: ( identifier | character_literal )
			int alt95=2;
			int LA95_0 = input.LA(1);
			if ( (LA95_0==BASIC_IDENTIFIER||LA95_0==EXTENDED_IDENTIFIER) ) {
				alt95=1;
			}
			else if ( (LA95_0==CHARACTER_LITERAL) ) {
				alt95=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 95, 0, input);
				throw nvae;
			}

			switch (alt95) {
				case 1 :
					// Vhdl.g:630:5: identifier
					{
					pushFollow(FOLLOW_identifier_in_enumeration_literal3567);
					identifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:631:5: character_literal
					{
					pushFollow(FOLLOW_character_literal_in_enumeration_literal3574);
					character_literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "enumeration_literal"



	// $ANTLR start "enumeration_type_definition"
	// Vhdl.g:634:1: enumeration_type_definition : LPAREN enumeration_literal ( COMMA enumeration_literal )* RPAREN ;
	public final void enumeration_type_definition() throws RecognitionException {
		try {
			// Vhdl.g:635:5: ( LPAREN enumeration_literal ( COMMA enumeration_literal )* RPAREN )
			// Vhdl.g:635:5: LPAREN enumeration_literal ( COMMA enumeration_literal )* RPAREN
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_enumeration_type_definition3585); if (state.failed) return;
			pushFollow(FOLLOW_enumeration_literal_in_enumeration_type_definition3587);
			enumeration_literal();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:635:32: ( COMMA enumeration_literal )*
			loop96:
			while (true) {
				int alt96=2;
				int LA96_0 = input.LA(1);
				if ( (LA96_0==COMMA) ) {
					alt96=1;
				}

				switch (alt96) {
				case 1 :
					// Vhdl.g:635:33: COMMA enumeration_literal
					{
					match(input,COMMA,FOLLOW_COMMA_in_enumeration_type_definition3590); if (state.failed) return;
					pushFollow(FOLLOW_enumeration_literal_in_enumeration_type_definition3592);
					enumeration_literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop96;
				}
			}

			match(input,RPAREN,FOLLOW_RPAREN_in_enumeration_type_definition3596); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "enumeration_type_definition"



	// $ANTLR start "exit_statement"
	// Vhdl.g:638:1: exit_statement : ( label_colon )? K_EXIT ( label )? ( K_WHEN condition )? SEMI ;
	public final void exit_statement() throws RecognitionException {
		try {
			// Vhdl.g:639:5: ( ( label_colon )? K_EXIT ( label )? ( K_WHEN condition )? SEMI )
			// Vhdl.g:639:5: ( label_colon )? K_EXIT ( label )? ( K_WHEN condition )? SEMI
			{
			// Vhdl.g:639:5: ( label_colon )?
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==BASIC_IDENTIFIER||LA97_0==EXTENDED_IDENTIFIER) ) {
				alt97=1;
			}
			switch (alt97) {
				case 1 :
					// Vhdl.g:639:6: label_colon
					{
					pushFollow(FOLLOW_label_colon_in_exit_statement3608);
					label_colon();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,K_EXIT,FOLLOW_K_EXIT_in_exit_statement3612); if (state.failed) return;
			// Vhdl.g:639:27: ( label )?
			int alt98=2;
			int LA98_0 = input.LA(1);
			if ( (LA98_0==BASIC_IDENTIFIER||LA98_0==EXTENDED_IDENTIFIER) ) {
				alt98=1;
			}
			switch (alt98) {
				case 1 :
					// Vhdl.g:639:28: label
					{
					pushFollow(FOLLOW_label_in_exit_statement3615);
					label();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// Vhdl.g:639:36: ( K_WHEN condition )?
			int alt99=2;
			int LA99_0 = input.LA(1);
			if ( (LA99_0==K_WHEN) ) {
				alt99=1;
			}
			switch (alt99) {
				case 1 :
					// Vhdl.g:639:37: K_WHEN condition
					{
					match(input,K_WHEN,FOLLOW_K_WHEN_in_exit_statement3620); if (state.failed) return;
					pushFollow(FOLLOW_condition_in_exit_statement3622);
					condition();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,SEMI,FOLLOW_SEMI_in_exit_statement3626); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "exit_statement"



	// $ANTLR start "expression"
	// Vhdl.g:642:1: expression : relation ( logical_op relation )* ;
	public final void expression() throws RecognitionException {
		try {
			// Vhdl.g:643:5: ( relation ( logical_op relation )* )
			// Vhdl.g:643:5: relation ( logical_op relation )*
			{
			pushFollow(FOLLOW_relation_in_expression3637);
			relation();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:643:14: ( logical_op relation )*
			loop100:
			while (true) {
				int alt100=2;
				int LA100_0 = input.LA(1);
				if ( (LA100_0==K_AND||LA100_0==K_NAND||LA100_0==K_NOR||LA100_0==K_OR||(LA100_0 >= K_XNOR && LA100_0 <= K_XOR)) ) {
					alt100=1;
				}

				switch (alt100) {
				case 1 :
					// Vhdl.g:643:15: logical_op relation
					{
					pushFollow(FOLLOW_logical_op_in_expression3640);
					logical_op();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_relation_in_expression3642);
					relation();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop100;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expression"



	// $ANTLR start "logical_op"
	// Vhdl.g:646:1: logical_op : ( K_AND | K_OR | K_XOR | K_NAND | K_NOR | K_XNOR );
	public final void logical_op() throws RecognitionException {
		try {
			// Vhdl.g:647:3: ( K_AND | K_OR | K_XOR | K_NAND | K_NOR | K_XNOR )
			// Vhdl.g:
			{
			if ( input.LA(1)==K_AND||input.LA(1)==K_NAND||input.LA(1)==K_NOR||input.LA(1)==K_OR||(input.LA(1) >= K_XNOR && input.LA(1) <= K_XOR) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "logical_op"



	// $ANTLR start "factor"
	// Vhdl.g:655:1: factor : ( primary ( options {greedy=true; } : STAR2 primary )? | K_ABS primary | K_NOT primary );
	public final void factor() throws RecognitionException {
		try {
			// Vhdl.g:656:5: ( primary ( options {greedy=true; } : STAR2 primary )? | K_ABS primary | K_NOT primary )
			int alt102=3;
			switch ( input.LA(1) ) {
			case BASED_LITERAL:
			case BASIC_IDENTIFIER:
			case BIT_STRING_LITERAL:
			case CHARACTER_LITERAL:
			case DECIMAL_LITERAL:
			case EXTENDED_IDENTIFIER:
			case K_NEW:
			case K_NULL:
			case LPAREN:
			case STRING_LITERAL:
				{
				alt102=1;
				}
				break;
			case K_ABS:
				{
				alt102=2;
				}
				break;
			case K_NOT:
				{
				alt102=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 102, 0, input);
				throw nvae;
			}
			switch (alt102) {
				case 1 :
					// Vhdl.g:656:5: primary ( options {greedy=true; } : STAR2 primary )?
					{
					pushFollow(FOLLOW_primary_in_factor3684);
					primary();
					state._fsp--;
					if (state.failed) return;
					// Vhdl.g:656:13: ( options {greedy=true; } : STAR2 primary )?
					int alt101=2;
					int LA101_0 = input.LA(1);
					if ( (LA101_0==STAR2) ) {
						alt101=1;
					}
					switch (alt101) {
						case 1 :
							// Vhdl.g:656:37: STAR2 primary
							{
							match(input,STAR2,FOLLOW_STAR2_in_factor3695); if (state.failed) return;
							pushFollow(FOLLOW_primary_in_factor3697);
							primary();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 2 :
					// Vhdl.g:657:5: K_ABS primary
					{
					match(input,K_ABS,FOLLOW_K_ABS_in_factor3705); if (state.failed) return;
					pushFollow(FOLLOW_primary_in_factor3707);
					primary();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Vhdl.g:658:5: K_NOT primary
					{
					match(input,K_NOT,FOLLOW_K_NOT_in_factor3713); if (state.failed) return;
					pushFollow(FOLLOW_primary_in_factor3715);
					primary();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "factor"



	// $ANTLR start "file_declaration"
	// Vhdl.g:661:1: file_declaration : K_FILE identifier_list COLON subtype_indication ( file_open_information )? SEMI ;
	public final void file_declaration() throws RecognitionException {
		try {
			// Vhdl.g:662:5: ( K_FILE identifier_list COLON subtype_indication ( file_open_information )? SEMI )
			// Vhdl.g:662:5: K_FILE identifier_list COLON subtype_indication ( file_open_information )? SEMI
			{
			match(input,K_FILE,FOLLOW_K_FILE_in_file_declaration3726); if (state.failed) return;
			pushFollow(FOLLOW_identifier_list_in_file_declaration3728);
			identifier_list();
			state._fsp--;
			if (state.failed) return;
			match(input,COLON,FOLLOW_COLON_in_file_declaration3730); if (state.failed) return;
			pushFollow(FOLLOW_subtype_indication_in_file_declaration3735);
			subtype_indication();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:663:22: ( file_open_information )?
			int alt103=2;
			int LA103_0 = input.LA(1);
			if ( (LA103_0==K_IS||LA103_0==K_OPEN) ) {
				alt103=1;
			}
			switch (alt103) {
				case 1 :
					// Vhdl.g:663:23: file_open_information
					{
					pushFollow(FOLLOW_file_open_information_in_file_declaration3738);
					file_open_information();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,SEMI,FOLLOW_SEMI_in_file_declaration3742); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "file_declaration"



	// $ANTLR start "file_logical_name"
	// Vhdl.g:666:1: file_logical_name : expression ;
	public final void file_logical_name() throws RecognitionException {
		try {
			// Vhdl.g:667:5: ( expression )
			// Vhdl.g:667:5: expression
			{
			pushFollow(FOLLOW_expression_in_file_logical_name3753);
			expression();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "file_logical_name"



	// $ANTLR start "file_open_information"
	// Vhdl.g:670:1: file_open_information : ( K_OPEN expression )? K_IS file_logical_name ;
	public final void file_open_information() throws RecognitionException {
		try {
			// Vhdl.g:671:5: ( ( K_OPEN expression )? K_IS file_logical_name )
			// Vhdl.g:671:5: ( K_OPEN expression )? K_IS file_logical_name
			{
			// Vhdl.g:671:5: ( K_OPEN expression )?
			int alt104=2;
			int LA104_0 = input.LA(1);
			if ( (LA104_0==K_OPEN) ) {
				alt104=1;
			}
			switch (alt104) {
				case 1 :
					// Vhdl.g:671:6: K_OPEN expression
					{
					match(input,K_OPEN,FOLLOW_K_OPEN_in_file_open_information3766); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_file_open_information3768);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,K_IS,FOLLOW_K_IS_in_file_open_information3772); if (state.failed) return;
			pushFollow(FOLLOW_file_logical_name_in_file_open_information3774);
			file_logical_name();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "file_open_information"



	// $ANTLR start "file_type_definition"
	// Vhdl.g:674:1: file_type_definition : K_FILE K_OF name ;
	public final void file_type_definition() throws RecognitionException {
		try {
			// Vhdl.g:675:5: ( K_FILE K_OF name )
			// Vhdl.g:675:5: K_FILE K_OF name
			{
			match(input,K_FILE,FOLLOW_K_FILE_in_file_type_definition3786); if (state.failed) return;
			match(input,K_OF,FOLLOW_K_OF_in_file_type_definition3788); if (state.failed) return;
			pushFollow(FOLLOW_name_in_file_type_definition3790);
			name();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "file_type_definition"



	// $ANTLR start "floating_type_definition"
	// Vhdl.g:678:1: floating_type_definition : range_constraint ;
	public final void floating_type_definition() throws RecognitionException {
		try {
			// Vhdl.g:679:5: ( range_constraint )
			// Vhdl.g:679:5: range_constraint
			{
			pushFollow(FOLLOW_range_constraint_in_floating_type_definition3801);
			range_constraint();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "floating_type_definition"



	// $ANTLR start "formal_parameter_list"
	// Vhdl.g:682:1: formal_parameter_list : interface_list ;
	public final void formal_parameter_list() throws RecognitionException {
		try {
			// Vhdl.g:683:5: ( interface_list )
			// Vhdl.g:683:5: interface_list
			{
			pushFollow(FOLLOW_interface_list_in_formal_parameter_list3812);
			interface_list();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "formal_parameter_list"



	// $ANTLR start "formal_part"
	// Vhdl.g:686:1: formal_part : name ( LPAREN name RPAREN )? ;
	public final void formal_part() throws RecognitionException {
		try {
			// Vhdl.g:687:5: ( name ( LPAREN name RPAREN )? )
			// Vhdl.g:687:5: name ( LPAREN name RPAREN )?
			{
			pushFollow(FOLLOW_name_in_formal_part3823);
			name();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:687:10: ( LPAREN name RPAREN )?
			int alt105=2;
			int LA105_0 = input.LA(1);
			if ( (LA105_0==LPAREN) ) {
				alt105=1;
			}
			switch (alt105) {
				case 1 :
					// Vhdl.g:687:11: LPAREN name RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_formal_part3826); if (state.failed) return;
					pushFollow(FOLLOW_name_in_formal_part3828);
					name();
					state._fsp--;
					if (state.failed) return;
					match(input,RPAREN,FOLLOW_RPAREN_in_formal_part3830); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "formal_part"



	// $ANTLR start "full_type_declaration"
	// Vhdl.g:690:1: full_type_declaration : K_TYPE identifier K_IS type_definition SEMI ;
	public final void full_type_declaration() throws RecognitionException {
		try {
			// Vhdl.g:691:5: ( K_TYPE identifier K_IS type_definition SEMI )
			// Vhdl.g:691:5: K_TYPE identifier K_IS type_definition SEMI
			{
			match(input,K_TYPE,FOLLOW_K_TYPE_in_full_type_declaration3844); if (state.failed) return;
			pushFollow(FOLLOW_identifier_in_full_type_declaration3846);
			identifier();
			state._fsp--;
			if (state.failed) return;
			match(input,K_IS,FOLLOW_K_IS_in_full_type_declaration3848); if (state.failed) return;
			pushFollow(FOLLOW_type_definition_in_full_type_declaration3850);
			type_definition();
			state._fsp--;
			if (state.failed) return;
			match(input,SEMI,FOLLOW_SEMI_in_full_type_declaration3852); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "full_type_declaration"



	// $ANTLR start "function_call"
	// Vhdl.g:694:1: function_call : name ( LPAREN actual_parameter_part RPAREN )? ;
	public final void function_call() throws RecognitionException {
		try {
			// Vhdl.g:695:4: ( name ( LPAREN actual_parameter_part RPAREN )? )
			// Vhdl.g:695:4: name ( LPAREN actual_parameter_part RPAREN )?
			{
			pushFollow(FOLLOW_name_in_function_call3862);
			name();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:695:9: ( LPAREN actual_parameter_part RPAREN )?
			int alt106=2;
			int LA106_0 = input.LA(1);
			if ( (LA106_0==LPAREN) ) {
				alt106=1;
			}
			switch (alt106) {
				case 1 :
					// Vhdl.g:695:10: LPAREN actual_parameter_part RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_function_call3865); if (state.failed) return;
					pushFollow(FOLLOW_actual_parameter_part_in_function_call3867);
					actual_parameter_part();
					state._fsp--;
					if (state.failed) return;
					match(input,RPAREN,FOLLOW_RPAREN_in_function_call3869); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "function_call"



	// $ANTLR start "generate_statement"
	// Vhdl.g:698:1: generate_statement : label COLON generation_scheme K_GENERATE ( ( block_declarative_item )* K_BEGIN )? ( concurrent_statement )* K_END K_GENERATE ( label )? SEMI ;
	public final void generate_statement() throws RecognitionException {
		try {
			// Vhdl.g:699:5: ( label COLON generation_scheme K_GENERATE ( ( block_declarative_item )* K_BEGIN )? ( concurrent_statement )* K_END K_GENERATE ( label )? SEMI )
			// Vhdl.g:699:5: label COLON generation_scheme K_GENERATE ( ( block_declarative_item )* K_BEGIN )? ( concurrent_statement )* K_END K_GENERATE ( label )? SEMI
			{
			pushFollow(FOLLOW_label_in_generate_statement3882);
			label();
			state._fsp--;
			if (state.failed) return;
			match(input,COLON,FOLLOW_COLON_in_generate_statement3884); if (state.failed) return;
			pushFollow(FOLLOW_generation_scheme_in_generate_statement3886);
			generation_scheme();
			state._fsp--;
			if (state.failed) return;
			match(input,K_GENERATE,FOLLOW_K_GENERATE_in_generate_statement3888); if (state.failed) return;
			// Vhdl.g:700:9: ( ( block_declarative_item )* K_BEGIN )?
			int alt108=2;
			int LA108_0 = input.LA(1);
			if ( (LA108_0==K_ALIAS||(LA108_0 >= K_ATTRIBUTE && LA108_0 <= K_BEGIN)||LA108_0==K_COMPONENT||(LA108_0 >= K_CONSTANT && LA108_0 <= K_DISCONNECT)||(LA108_0 >= K_FILE && LA108_0 <= K_FUNCTION)||LA108_0==K_GROUP||LA108_0==K_IMPURE||LA108_0==K_PROCEDURE||LA108_0==K_PURE||(LA108_0 >= K_SHARED && LA108_0 <= K_SIGNAL)||LA108_0==K_SUBTYPE||LA108_0==K_TYPE||(LA108_0 >= K_USE && LA108_0 <= K_VARIABLE)) ) {
				alt108=1;
			}
			switch (alt108) {
				case 1 :
					// Vhdl.g:700:10: ( block_declarative_item )* K_BEGIN
					{
					// Vhdl.g:700:10: ( block_declarative_item )*
					loop107:
					while (true) {
						int alt107=2;
						int LA107_0 = input.LA(1);
						if ( (LA107_0==K_ALIAS||LA107_0==K_ATTRIBUTE||LA107_0==K_COMPONENT||(LA107_0 >= K_CONSTANT && LA107_0 <= K_DISCONNECT)||(LA107_0 >= K_FILE && LA107_0 <= K_FUNCTION)||LA107_0==K_GROUP||LA107_0==K_IMPURE||LA107_0==K_PROCEDURE||LA107_0==K_PURE||(LA107_0 >= K_SHARED && LA107_0 <= K_SIGNAL)||LA107_0==K_SUBTYPE||LA107_0==K_TYPE||(LA107_0 >= K_USE && LA107_0 <= K_VARIABLE)) ) {
							alt107=1;
						}

						switch (alt107) {
						case 1 :
							// Vhdl.g:700:11: block_declarative_item
							{
							pushFollow(FOLLOW_block_declarative_item_in_generate_statement3900);
							block_declarative_item();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop107;
						}
					}

					match(input,K_BEGIN,FOLLOW_K_BEGIN_in_generate_statement3904); if (state.failed) return;
					}
					break;

			}

			// Vhdl.g:701:9: ( concurrent_statement )*
			loop109:
			while (true) {
				int alt109=2;
				int LA109_0 = input.LA(1);
				if ( (LA109_0==BASIC_IDENTIFIER||LA109_0==EXTENDED_IDENTIFIER||LA109_0==K_ASSERT||LA109_0==K_POSTPONED||LA109_0==K_PROCESS||LA109_0==K_WITH||LA109_0==LPAREN||LA109_0==STRING_LITERAL) ) {
					alt109=1;
				}

				switch (alt109) {
				case 1 :
					// Vhdl.g:701:10: concurrent_statement
					{
					pushFollow(FOLLOW_concurrent_statement_in_generate_statement3917);
					concurrent_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop109;
				}
			}

			match(input,K_END,FOLLOW_K_END_in_generate_statement3929); if (state.failed) return;
			match(input,K_GENERATE,FOLLOW_K_GENERATE_in_generate_statement3931); if (state.failed) return;
			// Vhdl.g:702:26: ( label )?
			int alt110=2;
			int LA110_0 = input.LA(1);
			if ( (LA110_0==BASIC_IDENTIFIER||LA110_0==EXTENDED_IDENTIFIER) ) {
				alt110=1;
			}
			switch (alt110) {
				case 1 :
					// Vhdl.g:702:27: label
					{
					pushFollow(FOLLOW_label_in_generate_statement3934);
					label();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,SEMI,FOLLOW_SEMI_in_generate_statement3938); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "generate_statement"



	// $ANTLR start "generation_scheme"
	// Vhdl.g:705:1: generation_scheme : ( K_FOR parameter_specification | K_IF condition );
	public final void generation_scheme() throws RecognitionException {
		try {
			// Vhdl.g:706:5: ( K_FOR parameter_specification | K_IF condition )
			int alt111=2;
			int LA111_0 = input.LA(1);
			if ( (LA111_0==K_FOR) ) {
				alt111=1;
			}
			else if ( (LA111_0==K_IF) ) {
				alt111=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 111, 0, input);
				throw nvae;
			}

			switch (alt111) {
				case 1 :
					// Vhdl.g:706:5: K_FOR parameter_specification
					{
					match(input,K_FOR,FOLLOW_K_FOR_in_generation_scheme3949); if (state.failed) return;
					pushFollow(FOLLOW_parameter_specification_in_generation_scheme3951);
					parameter_specification();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:707:5: K_IF condition
					{
					match(input,K_IF,FOLLOW_K_IF_in_generation_scheme3957); if (state.failed) return;
					pushFollow(FOLLOW_condition_in_generation_scheme3959);
					condition();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "generation_scheme"



	// $ANTLR start "generic_clause"
	// Vhdl.g:710:1: generic_clause : K_GENERIC LPAREN generic_list RPAREN SEMI ;
	public final void generic_clause() throws RecognitionException {
		try {
			// Vhdl.g:711:5: ( K_GENERIC LPAREN generic_list RPAREN SEMI )
			// Vhdl.g:711:5: K_GENERIC LPAREN generic_list RPAREN SEMI
			{
			match(input,K_GENERIC,FOLLOW_K_GENERIC_in_generic_clause3970); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_generic_clause3972); if (state.failed) return;
			pushFollow(FOLLOW_generic_list_in_generic_clause3974);
			generic_list();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_generic_clause3976); if (state.failed) return;
			match(input,SEMI,FOLLOW_SEMI_in_generic_clause3978); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "generic_clause"



	// $ANTLR start "generic_list"
	// Vhdl.g:714:1: generic_list : interface_list ;
	public final void generic_list() throws RecognitionException {
		try {
			// Vhdl.g:715:5: ( interface_list )
			// Vhdl.g:715:5: interface_list
			{
			pushFollow(FOLLOW_interface_list_in_generic_list3989);
			interface_list();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "generic_list"



	// $ANTLR start "generic_map_aspect"
	// Vhdl.g:718:1: generic_map_aspect : K_GENERIC K_MAP LPAREN association_list RPAREN ;
	public final void generic_map_aspect() throws RecognitionException {
		try {
			// Vhdl.g:719:5: ( K_GENERIC K_MAP LPAREN association_list RPAREN )
			// Vhdl.g:719:5: K_GENERIC K_MAP LPAREN association_list RPAREN
			{
			match(input,K_GENERIC,FOLLOW_K_GENERIC_in_generic_map_aspect4000); if (state.failed) return;
			match(input,K_MAP,FOLLOW_K_MAP_in_generic_map_aspect4002); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_generic_map_aspect4004); if (state.failed) return;
			pushFollow(FOLLOW_association_list_in_generic_map_aspect4006);
			association_list();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_generic_map_aspect4008); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "generic_map_aspect"



	// $ANTLR start "group_constituent"
	// Vhdl.g:722:1: group_constituent : ( name | character_literal );
	public final void group_constituent() throws RecognitionException {
		try {
			// Vhdl.g:723:5: ( name | character_literal )
			int alt112=2;
			int LA112_0 = input.LA(1);
			if ( (LA112_0==BASIC_IDENTIFIER||LA112_0==EXTENDED_IDENTIFIER||LA112_0==STRING_LITERAL) ) {
				alt112=1;
			}
			else if ( (LA112_0==CHARACTER_LITERAL) ) {
				alt112=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 112, 0, input);
				throw nvae;
			}

			switch (alt112) {
				case 1 :
					// Vhdl.g:723:5: name
					{
					pushFollow(FOLLOW_name_in_group_constituent4019);
					name();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:724:5: character_literal
					{
					pushFollow(FOLLOW_character_literal_in_group_constituent4026);
					character_literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "group_constituent"



	// $ANTLR start "group_constituent_list"
	// Vhdl.g:727:1: group_constituent_list : group_constituent ( COMMA group_constituent )* ;
	public final void group_constituent_list() throws RecognitionException {
		try {
			// Vhdl.g:728:5: ( group_constituent ( COMMA group_constituent )* )
			// Vhdl.g:728:5: group_constituent ( COMMA group_constituent )*
			{
			pushFollow(FOLLOW_group_constituent_in_group_constituent_list4037);
			group_constituent();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:728:23: ( COMMA group_constituent )*
			loop113:
			while (true) {
				int alt113=2;
				int LA113_0 = input.LA(1);
				if ( (LA113_0==COMMA) ) {
					alt113=1;
				}

				switch (alt113) {
				case 1 :
					// Vhdl.g:728:24: COMMA group_constituent
					{
					match(input,COMMA,FOLLOW_COMMA_in_group_constituent_list4040); if (state.failed) return;
					pushFollow(FOLLOW_group_constituent_in_group_constituent_list4042);
					group_constituent();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop113;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "group_constituent_list"



	// $ANTLR start "group_declaration"
	// Vhdl.g:731:1: group_declaration : K_GROUP identifier COLON name LPAREN group_constituent_list RPAREN SEMI ;
	public final void group_declaration() throws RecognitionException {
		try {
			// Vhdl.g:732:5: ( K_GROUP identifier COLON name LPAREN group_constituent_list RPAREN SEMI )
			// Vhdl.g:732:5: K_GROUP identifier COLON name LPAREN group_constituent_list RPAREN SEMI
			{
			match(input,K_GROUP,FOLLOW_K_GROUP_in_group_declaration4055); if (state.failed) return;
			pushFollow(FOLLOW_identifier_in_group_declaration4057);
			identifier();
			state._fsp--;
			if (state.failed) return;
			match(input,COLON,FOLLOW_COLON_in_group_declaration4059); if (state.failed) return;
			pushFollow(FOLLOW_name_in_group_declaration4061);
			name();
			state._fsp--;
			if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_group_declaration4063); if (state.failed) return;
			pushFollow(FOLLOW_group_constituent_list_in_group_declaration4065);
			group_constituent_list();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_group_declaration4067); if (state.failed) return;
			match(input,SEMI,FOLLOW_SEMI_in_group_declaration4069); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "group_declaration"



	// $ANTLR start "group_template_declaration"
	// Vhdl.g:735:1: group_template_declaration : K_GROUP identifier K_IS LPAREN entity_class_entry_list RPAREN SEMI ;
	public final void group_template_declaration() throws RecognitionException {
		try {
			// Vhdl.g:736:5: ( K_GROUP identifier K_IS LPAREN entity_class_entry_list RPAREN SEMI )
			// Vhdl.g:736:5: K_GROUP identifier K_IS LPAREN entity_class_entry_list RPAREN SEMI
			{
			match(input,K_GROUP,FOLLOW_K_GROUP_in_group_template_declaration4080); if (state.failed) return;
			pushFollow(FOLLOW_identifier_in_group_template_declaration4082);
			identifier();
			state._fsp--;
			if (state.failed) return;
			match(input,K_IS,FOLLOW_K_IS_in_group_template_declaration4084); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_group_template_declaration4086); if (state.failed) return;
			pushFollow(FOLLOW_entity_class_entry_list_in_group_template_declaration4088);
			entity_class_entry_list();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_group_template_declaration4090); if (state.failed) return;
			match(input,SEMI,FOLLOW_SEMI_in_group_template_declaration4092); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "group_template_declaration"



	// $ANTLR start "guarded_signal_specification"
	// Vhdl.g:739:1: guarded_signal_specification : signal_list COLON name ;
	public final void guarded_signal_specification() throws RecognitionException {
		try {
			// Vhdl.g:740:5: ( signal_list COLON name )
			// Vhdl.g:740:5: signal_list COLON name
			{
			pushFollow(FOLLOW_signal_list_in_guarded_signal_specification4103);
			signal_list();
			state._fsp--;
			if (state.failed) return;
			match(input,COLON,FOLLOW_COLON_in_guarded_signal_specification4105); if (state.failed) return;
			pushFollow(FOLLOW_name_in_guarded_signal_specification4107);
			name();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "guarded_signal_specification"



	// $ANTLR start "identifier"
	// Vhdl.g:743:1: identifier : ( BASIC_IDENTIFIER | EXTENDED_IDENTIFIER ) ;
	public final void identifier() throws RecognitionException {
		try {
			// Vhdl.g:744:5: ( ( BASIC_IDENTIFIER | EXTENDED_IDENTIFIER ) )
			// Vhdl.g:
			{
			if ( input.LA(1)==BASIC_IDENTIFIER||input.LA(1)==EXTENDED_IDENTIFIER ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "identifier"



	// $ANTLR start "identifier_list"
	// Vhdl.g:748:1: identifier_list : identifier ( COMMA identifier )* ;
	public final void identifier_list() throws RecognitionException {
		try {
			// Vhdl.g:749:5: ( identifier ( COMMA identifier )* )
			// Vhdl.g:749:5: identifier ( COMMA identifier )*
			{
			pushFollow(FOLLOW_identifier_in_identifier_list4139);
			identifier();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:749:16: ( COMMA identifier )*
			loop114:
			while (true) {
				int alt114=2;
				int LA114_0 = input.LA(1);
				if ( (LA114_0==COMMA) ) {
					alt114=1;
				}

				switch (alt114) {
				case 1 :
					// Vhdl.g:749:17: COMMA identifier
					{
					match(input,COMMA,FOLLOW_COMMA_in_identifier_list4142); if (state.failed) return;
					pushFollow(FOLLOW_identifier_in_identifier_list4144);
					identifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop114;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "identifier_list"



	// $ANTLR start "if_statement"
	// Vhdl.g:752:1: if_statement : ( label_colon )? K_IF condition K_THEN sequence_of_statements ( K_ELSIF condition K_THEN sequence_of_statements )* ( K_ELSE sequence_of_statements )? K_END K_IF ( label )? SEMI ;
	public final void if_statement() throws RecognitionException {
		try {
			// Vhdl.g:753:5: ( ( label_colon )? K_IF condition K_THEN sequence_of_statements ( K_ELSIF condition K_THEN sequence_of_statements )* ( K_ELSE sequence_of_statements )? K_END K_IF ( label )? SEMI )
			// Vhdl.g:753:5: ( label_colon )? K_IF condition K_THEN sequence_of_statements ( K_ELSIF condition K_THEN sequence_of_statements )* ( K_ELSE sequence_of_statements )? K_END K_IF ( label )? SEMI
			{
			// Vhdl.g:753:5: ( label_colon )?
			int alt115=2;
			int LA115_0 = input.LA(1);
			if ( (LA115_0==BASIC_IDENTIFIER||LA115_0==EXTENDED_IDENTIFIER) ) {
				alt115=1;
			}
			switch (alt115) {
				case 1 :
					// Vhdl.g:753:6: label_colon
					{
					pushFollow(FOLLOW_label_colon_in_if_statement4158);
					label_colon();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,K_IF,FOLLOW_K_IF_in_if_statement4170); if (state.failed) return;
			pushFollow(FOLLOW_condition_in_if_statement4172);
			condition();
			state._fsp--;
			if (state.failed) return;
			match(input,K_THEN,FOLLOW_K_THEN_in_if_statement4174); if (state.failed) return;
			pushFollow(FOLLOW_sequence_of_statements_in_if_statement4176);
			sequence_of_statements();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:755:9: ( K_ELSIF condition K_THEN sequence_of_statements )*
			loop116:
			while (true) {
				int alt116=2;
				int LA116_0 = input.LA(1);
				if ( (LA116_0==K_ELSIF) ) {
					alt116=1;
				}

				switch (alt116) {
				case 1 :
					// Vhdl.g:755:10: K_ELSIF condition K_THEN sequence_of_statements
					{
					match(input,K_ELSIF,FOLLOW_K_ELSIF_in_if_statement4187); if (state.failed) return;
					pushFollow(FOLLOW_condition_in_if_statement4189);
					condition();
					state._fsp--;
					if (state.failed) return;
					match(input,K_THEN,FOLLOW_K_THEN_in_if_statement4191); if (state.failed) return;
					pushFollow(FOLLOW_sequence_of_statements_in_if_statement4193);
					sequence_of_statements();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop116;
				}
			}

			// Vhdl.g:756:9: ( K_ELSE sequence_of_statements )?
			int alt117=2;
			int LA117_0 = input.LA(1);
			if ( (LA117_0==K_ELSE) ) {
				alt117=1;
			}
			switch (alt117) {
				case 1 :
					// Vhdl.g:756:10: K_ELSE sequence_of_statements
					{
					match(input,K_ELSE,FOLLOW_K_ELSE_in_if_statement4206); if (state.failed) return;
					pushFollow(FOLLOW_sequence_of_statements_in_if_statement4208);
					sequence_of_statements();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,K_END,FOLLOW_K_END_in_if_statement4212); if (state.failed) return;
			match(input,K_IF,FOLLOW_K_IF_in_if_statement4214); if (state.failed) return;
			// Vhdl.g:756:53: ( label )?
			int alt118=2;
			int LA118_0 = input.LA(1);
			if ( (LA118_0==BASIC_IDENTIFIER||LA118_0==EXTENDED_IDENTIFIER) ) {
				alt118=1;
			}
			switch (alt118) {
				case 1 :
					// Vhdl.g:756:54: label
					{
					pushFollow(FOLLOW_label_in_if_statement4217);
					label();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,SEMI,FOLLOW_SEMI_in_if_statement4221); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "if_statement"



	// $ANTLR start "incomplete_type_declaration"
	// Vhdl.g:759:1: incomplete_type_declaration : K_TYPE identifier SEMI ;
	public final void incomplete_type_declaration() throws RecognitionException {
		try {
			// Vhdl.g:760:5: ( K_TYPE identifier SEMI )
			// Vhdl.g:760:5: K_TYPE identifier SEMI
			{
			match(input,K_TYPE,FOLLOW_K_TYPE_in_incomplete_type_declaration4232); if (state.failed) return;
			pushFollow(FOLLOW_identifier_in_incomplete_type_declaration4234);
			identifier();
			state._fsp--;
			if (state.failed) return;
			match(input,SEMI,FOLLOW_SEMI_in_incomplete_type_declaration4236); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "incomplete_type_declaration"



	// $ANTLR start "index_constraint"
	// Vhdl.g:763:1: index_constraint : LPAREN discrete_range ( COMMA discrete_range )* RPAREN ;
	public final void index_constraint() throws RecognitionException {
		try {
			// Vhdl.g:764:5: ( LPAREN discrete_range ( COMMA discrete_range )* RPAREN )
			// Vhdl.g:764:5: LPAREN discrete_range ( COMMA discrete_range )* RPAREN
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_index_constraint4247); if (state.failed) return;
			pushFollow(FOLLOW_discrete_range_in_index_constraint4249);
			discrete_range();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:764:27: ( COMMA discrete_range )*
			loop119:
			while (true) {
				int alt119=2;
				int LA119_0 = input.LA(1);
				if ( (LA119_0==COMMA) ) {
					alt119=1;
				}

				switch (alt119) {
				case 1 :
					// Vhdl.g:764:28: COMMA discrete_range
					{
					match(input,COMMA,FOLLOW_COMMA_in_index_constraint4252); if (state.failed) return;
					pushFollow(FOLLOW_discrete_range_in_index_constraint4254);
					discrete_range();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop119;
				}
			}

			match(input,RPAREN,FOLLOW_RPAREN_in_index_constraint4258); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "index_constraint"



	// $ANTLR start "index_specification"
	// Vhdl.g:767:1: index_specification : ( ( discrete_range )=> discrete_range | expression );
	public final void index_specification() throws RecognitionException {
		try {
			// Vhdl.g:768:5: ( ( discrete_range )=> discrete_range | expression )
			int alt120=2;
			alt120 = dfa120.predict(input);
			switch (alt120) {
				case 1 :
					// Vhdl.g:768:5: ( discrete_range )=> discrete_range
					{
					pushFollow(FOLLOW_discrete_range_in_index_specification4274);
					discrete_range();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:769:5: expression
					{
					pushFollow(FOLLOW_expression_in_index_specification4280);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "index_specification"



	// $ANTLR start "index_subtype_definition"
	// Vhdl.g:772:1: index_subtype_definition : name K_RANGE LSTGRT ;
	public final void index_subtype_definition() throws RecognitionException {
		try {
			// Vhdl.g:773:5: ( name K_RANGE LSTGRT )
			// Vhdl.g:773:5: name K_RANGE LSTGRT
			{
			pushFollow(FOLLOW_name_in_index_subtype_definition4291);
			name();
			state._fsp--;
			if (state.failed) return;
			match(input,K_RANGE,FOLLOW_K_RANGE_in_index_subtype_definition4293); if (state.failed) return;
			match(input,LSTGRT,FOLLOW_LSTGRT_in_index_subtype_definition4295); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "index_subtype_definition"



	// $ANTLR start "instantiated_unit"
	// Vhdl.g:776:1: instantiated_unit : ( ( K_COMPONENT )? name | K_ENTITY name ( LPAREN identifier RPAREN )? | K_CONFIGURATION name ) ;
	public final void instantiated_unit() throws RecognitionException {
		try {
			// Vhdl.g:777:5: ( ( ( K_COMPONENT )? name | K_ENTITY name ( LPAREN identifier RPAREN )? | K_CONFIGURATION name ) )
			// Vhdl.g:777:5: ( ( K_COMPONENT )? name | K_ENTITY name ( LPAREN identifier RPAREN )? | K_CONFIGURATION name )
			{
			// Vhdl.g:777:5: ( ( K_COMPONENT )? name | K_ENTITY name ( LPAREN identifier RPAREN )? | K_CONFIGURATION name )
			int alt123=3;
			switch ( input.LA(1) ) {
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
			case K_COMPONENT:
			case STRING_LITERAL:
				{
				alt123=1;
				}
				break;
			case K_ENTITY:
				{
				alt123=2;
				}
				break;
			case K_CONFIGURATION:
				{
				alt123=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 123, 0, input);
				throw nvae;
			}
			switch (alt123) {
				case 1 :
					// Vhdl.g:777:6: ( K_COMPONENT )? name
					{
					// Vhdl.g:777:6: ( K_COMPONENT )?
					int alt121=2;
					int LA121_0 = input.LA(1);
					if ( (LA121_0==K_COMPONENT) ) {
						alt121=1;
					}
					switch (alt121) {
						case 1 :
							// Vhdl.g:777:7: K_COMPONENT
							{
							match(input,K_COMPONENT,FOLLOW_K_COMPONENT_in_instantiated_unit4308); if (state.failed) return;
							}
							break;

					}

					pushFollow(FOLLOW_name_in_instantiated_unit4312);
					name();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:778:5: K_ENTITY name ( LPAREN identifier RPAREN )?
					{
					match(input,K_ENTITY,FOLLOW_K_ENTITY_in_instantiated_unit4318); if (state.failed) return;
					pushFollow(FOLLOW_name_in_instantiated_unit4320);
					name();
					state._fsp--;
					if (state.failed) return;
					// Vhdl.g:778:19: ( LPAREN identifier RPAREN )?
					int alt122=2;
					int LA122_0 = input.LA(1);
					if ( (LA122_0==LPAREN) ) {
						alt122=1;
					}
					switch (alt122) {
						case 1 :
							// Vhdl.g:778:20: LPAREN identifier RPAREN
							{
							match(input,LPAREN,FOLLOW_LPAREN_in_instantiated_unit4323); if (state.failed) return;
							pushFollow(FOLLOW_identifier_in_instantiated_unit4325);
							identifier();
							state._fsp--;
							if (state.failed) return;
							match(input,RPAREN,FOLLOW_RPAREN_in_instantiated_unit4327); if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 3 :
					// Vhdl.g:779:5: K_CONFIGURATION name
					{
					match(input,K_CONFIGURATION,FOLLOW_K_CONFIGURATION_in_instantiated_unit4336); if (state.failed) return;
					pushFollow(FOLLOW_name_in_instantiated_unit4338);
					name();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "instantiated_unit"



	// $ANTLR start "instantiation_list"
	// Vhdl.g:782:1: instantiation_list : ( label ( COMMA label )* | K_OTHERS | K_ALL );
	public final void instantiation_list() throws RecognitionException {
		try {
			// Vhdl.g:783:5: ( label ( COMMA label )* | K_OTHERS | K_ALL )
			int alt125=3;
			switch ( input.LA(1) ) {
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
				{
				alt125=1;
				}
				break;
			case K_OTHERS:
				{
				alt125=2;
				}
				break;
			case K_ALL:
				{
				alt125=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 125, 0, input);
				throw nvae;
			}
			switch (alt125) {
				case 1 :
					// Vhdl.g:783:5: label ( COMMA label )*
					{
					pushFollow(FOLLOW_label_in_instantiation_list4350);
					label();
					state._fsp--;
					if (state.failed) return;
					// Vhdl.g:783:11: ( COMMA label )*
					loop124:
					while (true) {
						int alt124=2;
						int LA124_0 = input.LA(1);
						if ( (LA124_0==COMMA) ) {
							alt124=1;
						}

						switch (alt124) {
						case 1 :
							// Vhdl.g:783:12: COMMA label
							{
							match(input,COMMA,FOLLOW_COMMA_in_instantiation_list4353); if (state.failed) return;
							pushFollow(FOLLOW_label_in_instantiation_list4355);
							label();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop124;
						}
					}

					}
					break;
				case 2 :
					// Vhdl.g:784:5: K_OTHERS
					{
					match(input,K_OTHERS,FOLLOW_K_OTHERS_in_instantiation_list4363); if (state.failed) return;
					}
					break;
				case 3 :
					// Vhdl.g:785:5: K_ALL
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_instantiation_list4370); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "instantiation_list"



	// $ANTLR start "interface_constant_declaration"
	// Vhdl.g:788:1: interface_constant_declaration : ( K_CONSTANT )? identifier_list COLON ( K_IN )? subtype_indication ( COLONEQ expression )? ;
	public final void interface_constant_declaration() throws RecognitionException {
		try {
			// Vhdl.g:789:5: ( ( K_CONSTANT )? identifier_list COLON ( K_IN )? subtype_indication ( COLONEQ expression )? )
			// Vhdl.g:789:5: ( K_CONSTANT )? identifier_list COLON ( K_IN )? subtype_indication ( COLONEQ expression )?
			{
			// Vhdl.g:789:5: ( K_CONSTANT )?
			int alt126=2;
			int LA126_0 = input.LA(1);
			if ( (LA126_0==K_CONSTANT) ) {
				alt126=1;
			}
			switch (alt126) {
				case 1 :
					// Vhdl.g:789:6: K_CONSTANT
					{
					match(input,K_CONSTANT,FOLLOW_K_CONSTANT_in_interface_constant_declaration4382); if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_identifier_list_in_interface_constant_declaration4386);
			identifier_list();
			state._fsp--;
			if (state.failed) return;
			match(input,COLON,FOLLOW_COLON_in_interface_constant_declaration4388); if (state.failed) return;
			// Vhdl.g:789:41: ( K_IN )?
			int alt127=2;
			int LA127_0 = input.LA(1);
			if ( (LA127_0==K_IN) ) {
				alt127=1;
			}
			switch (alt127) {
				case 1 :
					// Vhdl.g:789:42: K_IN
					{
					match(input,K_IN,FOLLOW_K_IN_in_interface_constant_declaration4391); if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_subtype_indication_in_interface_constant_declaration4395);
			subtype_indication();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:790:9: ( COLONEQ expression )?
			int alt128=2;
			int LA128_0 = input.LA(1);
			if ( (LA128_0==COLONEQ) ) {
				alt128=1;
			}
			switch (alt128) {
				case 1 :
					// Vhdl.g:790:10: COLONEQ expression
					{
					match(input,COLONEQ,FOLLOW_COLONEQ_in_interface_constant_declaration4406); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_interface_constant_declaration4408);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "interface_constant_declaration"



	// $ANTLR start "interface_declaration"
	// Vhdl.g:793:1: interface_declaration : ( ( interface_constant_declaration )=> interface_constant_declaration | ( interface_signal_declaration )=> interface_signal_declaration | interface_variable_declaration | interface_file_declaration );
	public final void interface_declaration() throws RecognitionException {
		try {
			// Vhdl.g:794:5: ( ( interface_constant_declaration )=> interface_constant_declaration | ( interface_signal_declaration )=> interface_signal_declaration | interface_variable_declaration | interface_file_declaration )
			int alt129=4;
			int LA129_0 = input.LA(1);
			if ( (LA129_0==K_CONSTANT) && (synpred32_Vhdl())) {
				alt129=1;
			}
			else if ( (LA129_0==BASIC_IDENTIFIER||LA129_0==EXTENDED_IDENTIFIER) ) {
				int LA129_2 = input.LA(2);
				if ( (LA129_2==COMMA) ) {
					int LA129_6 = input.LA(3);
					if ( (synpred32_Vhdl()) ) {
						alt129=1;
					}
					else if ( (synpred33_Vhdl()) ) {
						alt129=2;
					}
					else if ( (true) ) {
						alt129=3;
					}

				}
				else if ( (LA129_2==COLON) ) {
					int LA129_7 = input.LA(3);
					if ( (synpred32_Vhdl()) ) {
						alt129=1;
					}
					else if ( (synpred33_Vhdl()) ) {
						alt129=2;
					}
					else if ( (true) ) {
						alt129=3;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 129, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA129_0==K_SIGNAL) && (synpred33_Vhdl())) {
				alt129=2;
			}
			else if ( (LA129_0==K_VARIABLE) ) {
				alt129=3;
			}
			else if ( (LA129_0==K_FILE) ) {
				alt129=4;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 129, 0, input);
				throw nvae;
			}

			switch (alt129) {
				case 1 :
					// Vhdl.g:794:5: ( interface_constant_declaration )=> interface_constant_declaration
					{
					pushFollow(FOLLOW_interface_constant_declaration_in_interface_declaration4426);
					interface_constant_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:795:5: ( interface_signal_declaration )=> interface_signal_declaration
					{
					pushFollow(FOLLOW_interface_signal_declaration_in_interface_declaration4438);
					interface_signal_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Vhdl.g:796:5: interface_variable_declaration
					{
					pushFollow(FOLLOW_interface_variable_declaration_in_interface_declaration4445);
					interface_variable_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// Vhdl.g:797:5: interface_file_declaration
					{
					pushFollow(FOLLOW_interface_file_declaration_in_interface_declaration4452);
					interface_file_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "interface_declaration"



	// $ANTLR start "interface_element"
	// Vhdl.g:800:1: interface_element : interface_declaration ;
	public final void interface_element() throws RecognitionException {
		try {
			// Vhdl.g:801:5: ( interface_declaration )
			// Vhdl.g:801:5: interface_declaration
			{
			pushFollow(FOLLOW_interface_declaration_in_interface_element4463);
			interface_declaration();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "interface_element"



	// $ANTLR start "interface_file_declaration"
	// Vhdl.g:804:1: interface_file_declaration : K_FILE identifier_list COLON subtype_indication ;
	public final void interface_file_declaration() throws RecognitionException {
		try {
			// Vhdl.g:805:5: ( K_FILE identifier_list COLON subtype_indication )
			// Vhdl.g:805:5: K_FILE identifier_list COLON subtype_indication
			{
			match(input,K_FILE,FOLLOW_K_FILE_in_interface_file_declaration4474); if (state.failed) return;
			pushFollow(FOLLOW_identifier_list_in_interface_file_declaration4476);
			identifier_list();
			state._fsp--;
			if (state.failed) return;
			match(input,COLON,FOLLOW_COLON_in_interface_file_declaration4478); if (state.failed) return;
			pushFollow(FOLLOW_subtype_indication_in_interface_file_declaration4480);
			subtype_indication();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "interface_file_declaration"



	// $ANTLR start "interface_list"
	// Vhdl.g:808:1: interface_list : interface_element ( SEMI interface_element )* ;
	public final void interface_list() throws RecognitionException {
		try {
			// Vhdl.g:809:5: ( interface_element ( SEMI interface_element )* )
			// Vhdl.g:809:5: interface_element ( SEMI interface_element )*
			{
			pushFollow(FOLLOW_interface_element_in_interface_list4491);
			interface_element();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:809:23: ( SEMI interface_element )*
			loop130:
			while (true) {
				int alt130=2;
				int LA130_0 = input.LA(1);
				if ( (LA130_0==SEMI) ) {
					alt130=1;
				}

				switch (alt130) {
				case 1 :
					// Vhdl.g:809:24: SEMI interface_element
					{
					match(input,SEMI,FOLLOW_SEMI_in_interface_list4494); if (state.failed) return;
					pushFollow(FOLLOW_interface_element_in_interface_list4496);
					interface_element();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop130;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "interface_list"



	// $ANTLR start "interface_signal_declaration"
	// Vhdl.g:812:1: interface_signal_declaration : ( K_SIGNAL )? identifier_list COLON ( mode )? subtype_indication ( K_BUS )? ( COLONEQ expression )? ;
	public final void interface_signal_declaration() throws RecognitionException {
		try {
			// Vhdl.g:813:5: ( ( K_SIGNAL )? identifier_list COLON ( mode )? subtype_indication ( K_BUS )? ( COLONEQ expression )? )
			// Vhdl.g:813:5: ( K_SIGNAL )? identifier_list COLON ( mode )? subtype_indication ( K_BUS )? ( COLONEQ expression )?
			{
			// Vhdl.g:813:5: ( K_SIGNAL )?
			int alt131=2;
			int LA131_0 = input.LA(1);
			if ( (LA131_0==K_SIGNAL) ) {
				alt131=1;
			}
			switch (alt131) {
				case 1 :
					// Vhdl.g:813:6: K_SIGNAL
					{
					match(input,K_SIGNAL,FOLLOW_K_SIGNAL_in_interface_signal_declaration4510); if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_identifier_list_in_interface_signal_declaration4514);
			identifier_list();
			state._fsp--;
			if (state.failed) return;
			match(input,COLON,FOLLOW_COLON_in_interface_signal_declaration4516); if (state.failed) return;
			// Vhdl.g:813:39: ( mode )?
			int alt132=2;
			int LA132_0 = input.LA(1);
			if ( (LA132_0==K_BUFFER||LA132_0==K_IN||LA132_0==K_INOUT||LA132_0==K_LINKAGE||LA132_0==K_OUT) ) {
				alt132=1;
			}
			switch (alt132) {
				case 1 :
					// Vhdl.g:813:40: mode
					{
					pushFollow(FOLLOW_mode_in_interface_signal_declaration4519);
					mode();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_subtype_indication_in_interface_signal_declaration4523);
			subtype_indication();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:813:66: ( K_BUS )?
			int alt133=2;
			int LA133_0 = input.LA(1);
			if ( (LA133_0==K_BUS) ) {
				alt133=1;
			}
			switch (alt133) {
				case 1 :
					// Vhdl.g:813:67: K_BUS
					{
					match(input,K_BUS,FOLLOW_K_BUS_in_interface_signal_declaration4526); if (state.failed) return;
					}
					break;

			}

			// Vhdl.g:814:9: ( COLONEQ expression )?
			int alt134=2;
			int LA134_0 = input.LA(1);
			if ( (LA134_0==COLONEQ) ) {
				alt134=1;
			}
			switch (alt134) {
				case 1 :
					// Vhdl.g:814:10: COLONEQ expression
					{
					match(input,COLONEQ,FOLLOW_COLONEQ_in_interface_signal_declaration4540); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_interface_signal_declaration4542);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "interface_signal_declaration"



	// $ANTLR start "interface_variable_declaration"
	// Vhdl.g:817:1: interface_variable_declaration : ( K_VARIABLE )? identifier_list COLON ( mode )? subtype_indication ( COLONEQ expression )? ;
	public final void interface_variable_declaration() throws RecognitionException {
		try {
			// Vhdl.g:818:5: ( ( K_VARIABLE )? identifier_list COLON ( mode )? subtype_indication ( COLONEQ expression )? )
			// Vhdl.g:818:5: ( K_VARIABLE )? identifier_list COLON ( mode )? subtype_indication ( COLONEQ expression )?
			{
			// Vhdl.g:818:5: ( K_VARIABLE )?
			int alt135=2;
			int LA135_0 = input.LA(1);
			if ( (LA135_0==K_VARIABLE) ) {
				alt135=1;
			}
			switch (alt135) {
				case 1 :
					// Vhdl.g:818:6: K_VARIABLE
					{
					match(input,K_VARIABLE,FOLLOW_K_VARIABLE_in_interface_variable_declaration4556); if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_identifier_list_in_interface_variable_declaration4560);
			identifier_list();
			state._fsp--;
			if (state.failed) return;
			match(input,COLON,FOLLOW_COLON_in_interface_variable_declaration4562); if (state.failed) return;
			// Vhdl.g:818:41: ( mode )?
			int alt136=2;
			int LA136_0 = input.LA(1);
			if ( (LA136_0==K_BUFFER||LA136_0==K_IN||LA136_0==K_INOUT||LA136_0==K_LINKAGE||LA136_0==K_OUT) ) {
				alt136=1;
			}
			switch (alt136) {
				case 1 :
					// Vhdl.g:818:42: mode
					{
					pushFollow(FOLLOW_mode_in_interface_variable_declaration4565);
					mode();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_subtype_indication_in_interface_variable_declaration4569);
			subtype_indication();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:819:9: ( COLONEQ expression )?
			int alt137=2;
			int LA137_0 = input.LA(1);
			if ( (LA137_0==COLONEQ) ) {
				alt137=1;
			}
			switch (alt137) {
				case 1 :
					// Vhdl.g:819:10: COLONEQ expression
					{
					match(input,COLONEQ,FOLLOW_COLONEQ_in_interface_variable_declaration4580); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_interface_variable_declaration4582);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "interface_variable_declaration"



	// $ANTLR start "iteration_scheme"
	// Vhdl.g:822:1: iteration_scheme : ( K_WHILE condition | K_FOR parameter_specification );
	public final void iteration_scheme() throws RecognitionException {
		try {
			// Vhdl.g:823:5: ( K_WHILE condition | K_FOR parameter_specification )
			int alt138=2;
			int LA138_0 = input.LA(1);
			if ( (LA138_0==K_WHILE) ) {
				alt138=1;
			}
			else if ( (LA138_0==K_FOR) ) {
				alt138=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 138, 0, input);
				throw nvae;
			}

			switch (alt138) {
				case 1 :
					// Vhdl.g:823:5: K_WHILE condition
					{
					match(input,K_WHILE,FOLLOW_K_WHILE_in_iteration_scheme4595); if (state.failed) return;
					pushFollow(FOLLOW_condition_in_iteration_scheme4597);
					condition();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:824:5: K_FOR parameter_specification
					{
					match(input,K_FOR,FOLLOW_K_FOR_in_iteration_scheme4603); if (state.failed) return;
					pushFollow(FOLLOW_parameter_specification_in_iteration_scheme4605);
					parameter_specification();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "iteration_scheme"



	// $ANTLR start "label"
	// Vhdl.g:827:1: label : identifier ;
	public final void label() throws RecognitionException {
		try {
			// Vhdl.g:828:5: ( identifier )
			// Vhdl.g:828:5: identifier
			{
			pushFollow(FOLLOW_identifier_in_label4616);
			identifier();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "label"



	// $ANTLR start "label_colon"
	// Vhdl.g:831:1: label_colon : label COLON ;
	public final void label_colon() throws RecognitionException {
		try {
			// Vhdl.g:832:5: ( label COLON )
			// Vhdl.g:832:5: label COLON
			{
			pushFollow(FOLLOW_label_in_label_colon4627);
			label();
			state._fsp--;
			if (state.failed) return;
			match(input,COLON,FOLLOW_COLON_in_label_colon4629); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "label_colon"



	// $ANTLR start "library_clause"
	// Vhdl.g:835:1: library_clause : K_LIBRARY logical_name_list SEMI ;
	public final void library_clause() throws RecognitionException {
		try {
			// Vhdl.g:836:5: ( K_LIBRARY logical_name_list SEMI )
			// Vhdl.g:836:5: K_LIBRARY logical_name_list SEMI
			{
			match(input,K_LIBRARY,FOLLOW_K_LIBRARY_in_library_clause4640); if (state.failed) return;
			pushFollow(FOLLOW_logical_name_list_in_library_clause4642);
			logical_name_list();
			state._fsp--;
			if (state.failed) return;
			match(input,SEMI,FOLLOW_SEMI_in_library_clause4644); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "library_clause"



	// $ANTLR start "library_unit"
	// Vhdl.g:839:1: library_unit : ( ( K_ARCHITECTURE | K_PACKAGE K_BODY )=> secondary_unit | primary_unit );
	public final void library_unit() throws RecognitionException {
		try {
			// Vhdl.g:840:5: ( ( K_ARCHITECTURE | K_PACKAGE K_BODY )=> secondary_unit | primary_unit )
			int alt139=2;
			int LA139_0 = input.LA(1);
			if ( (LA139_0==K_ARCHITECTURE) && (synpred34_Vhdl())) {
				alt139=1;
			}
			else if ( (LA139_0==K_PACKAGE) ) {
				int LA139_2 = input.LA(2);
				if ( (LA139_2==K_BODY) && (synpred34_Vhdl())) {
					alt139=1;
				}
				else if ( (LA139_2==BASIC_IDENTIFIER||LA139_2==EXTENDED_IDENTIFIER) ) {
					alt139=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 139, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA139_0==K_CONFIGURATION||LA139_0==K_ENTITY) ) {
				alt139=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 139, 0, input);
				throw nvae;
			}

			switch (alt139) {
				case 1 :
					// Vhdl.g:840:5: ( K_ARCHITECTURE | K_PACKAGE K_BODY )=> secondary_unit
					{
					pushFollow(FOLLOW_secondary_unit_in_library_unit4666);
					secondary_unit();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:841:5: primary_unit
					{
					pushFollow(FOLLOW_primary_unit_in_library_unit4672);
					primary_unit();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "library_unit"



	// $ANTLR start "literal"
	// Vhdl.g:844:1: literal : ( ( numeric_literal )=> numeric_literal | enumeration_literal | string_literal | bit_string_literal | K_NULL );
	public final void literal() throws RecognitionException {
		try {
			// Vhdl.g:845:5: ( ( numeric_literal )=> numeric_literal | enumeration_literal | string_literal | bit_string_literal | K_NULL )
			int alt140=5;
			alt140 = dfa140.predict(input);
			switch (alt140) {
				case 1 :
					// Vhdl.g:845:5: ( numeric_literal )=> numeric_literal
					{
					pushFollow(FOLLOW_numeric_literal_in_literal4688);
					numeric_literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:846:5: enumeration_literal
					{
					pushFollow(FOLLOW_enumeration_literal_in_literal4694);
					enumeration_literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Vhdl.g:847:5: string_literal
					{
					pushFollow(FOLLOW_string_literal_in_literal4701);
					string_literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// Vhdl.g:848:5: bit_string_literal
					{
					pushFollow(FOLLOW_bit_string_literal_in_literal4708);
					bit_string_literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// Vhdl.g:849:5: K_NULL
					{
					match(input,K_NULL,FOLLOW_K_NULL_in_literal4715); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "literal"



	// $ANTLR start "logical_name"
	// Vhdl.g:852:1: logical_name : identifier ;
	public final void logical_name() throws RecognitionException {
		try {
			// Vhdl.g:853:5: ( identifier )
			// Vhdl.g:853:5: identifier
			{
			pushFollow(FOLLOW_identifier_in_logical_name4726);
			identifier();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "logical_name"



	// $ANTLR start "logical_name_list"
	// Vhdl.g:856:1: logical_name_list : logical_name ( COMMA logical_name )* ;
	public final void logical_name_list() throws RecognitionException {
		try {
			// Vhdl.g:857:5: ( logical_name ( COMMA logical_name )* )
			// Vhdl.g:857:5: logical_name ( COMMA logical_name )*
			{
			pushFollow(FOLLOW_logical_name_in_logical_name_list4738);
			logical_name();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:857:18: ( COMMA logical_name )*
			loop141:
			while (true) {
				int alt141=2;
				int LA141_0 = input.LA(1);
				if ( (LA141_0==COMMA) ) {
					alt141=1;
				}

				switch (alt141) {
				case 1 :
					// Vhdl.g:857:19: COMMA logical_name
					{
					match(input,COMMA,FOLLOW_COMMA_in_logical_name_list4741); if (state.failed) return;
					pushFollow(FOLLOW_logical_name_in_logical_name_list4743);
					logical_name();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop141;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "logical_name_list"



	// $ANTLR start "logical_operator"
	// Vhdl.g:860:1: logical_operator : ( K_AND | K_OR | K_NAND | K_NOR | K_XOR | K_XNOR );
	public final void logical_operator() throws RecognitionException {
		try {
			// Vhdl.g:861:5: ( K_AND | K_OR | K_NAND | K_NOR | K_XOR | K_XNOR )
			// Vhdl.g:
			{
			if ( input.LA(1)==K_AND||input.LA(1)==K_NAND||input.LA(1)==K_NOR||input.LA(1)==K_OR||(input.LA(1) >= K_XNOR && input.LA(1) <= K_XOR) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "logical_operator"



	// $ANTLR start "loop_statement"
	// Vhdl.g:869:1: loop_statement : ( label_colon )? ( iteration_scheme )? K_LOOP sequence_of_statements K_END K_LOOP ( label )? SEMI ;
	public final void loop_statement() throws RecognitionException {
		try {
			// Vhdl.g:870:5: ( ( label_colon )? ( iteration_scheme )? K_LOOP sequence_of_statements K_END K_LOOP ( label )? SEMI )
			// Vhdl.g:870:5: ( label_colon )? ( iteration_scheme )? K_LOOP sequence_of_statements K_END K_LOOP ( label )? SEMI
			{
			// Vhdl.g:870:5: ( label_colon )?
			int alt142=2;
			int LA142_0 = input.LA(1);
			if ( (LA142_0==BASIC_IDENTIFIER||LA142_0==EXTENDED_IDENTIFIER) ) {
				alt142=1;
			}
			switch (alt142) {
				case 1 :
					// Vhdl.g:870:6: label_colon
					{
					pushFollow(FOLLOW_label_colon_in_loop_statement4798);
					label_colon();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// Vhdl.g:871:9: ( iteration_scheme )?
			int alt143=2;
			int LA143_0 = input.LA(1);
			if ( (LA143_0==K_FOR||LA143_0==K_WHILE) ) {
				alt143=1;
			}
			switch (alt143) {
				case 1 :
					// Vhdl.g:871:10: iteration_scheme
					{
					pushFollow(FOLLOW_iteration_scheme_in_loop_statement4811);
					iteration_scheme();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,K_LOOP,FOLLOW_K_LOOP_in_loop_statement4815); if (state.failed) return;
			pushFollow(FOLLOW_sequence_of_statements_in_loop_statement4817);
			sequence_of_statements();
			state._fsp--;
			if (state.failed) return;
			match(input,K_END,FOLLOW_K_END_in_loop_statement4827); if (state.failed) return;
			match(input,K_LOOP,FOLLOW_K_LOOP_in_loop_statement4829); if (state.failed) return;
			// Vhdl.g:872:22: ( label )?
			int alt144=2;
			int LA144_0 = input.LA(1);
			if ( (LA144_0==BASIC_IDENTIFIER||LA144_0==EXTENDED_IDENTIFIER) ) {
				alt144=1;
			}
			switch (alt144) {
				case 1 :
					// Vhdl.g:872:23: label
					{
					pushFollow(FOLLOW_label_in_loop_statement4832);
					label();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,SEMI,FOLLOW_SEMI_in_loop_statement4836); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "loop_statement"



	// $ANTLR start "miscellaneous_operator"
	// Vhdl.g:875:1: miscellaneous_operator : ( STAR2 | K_ABS | K_NOT );
	public final void miscellaneous_operator() throws RecognitionException {
		try {
			// Vhdl.g:876:5: ( STAR2 | K_ABS | K_NOT )
			// Vhdl.g:
			{
			if ( input.LA(1)==K_ABS||input.LA(1)==K_NOT||input.LA(1)==STAR2 ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "miscellaneous_operator"



	// $ANTLR start "mode"
	// Vhdl.g:881:1: mode : ( K_IN | K_OUT | K_INOUT | K_BUFFER | K_LINKAGE );
	public final void mode() throws RecognitionException {
		try {
			// Vhdl.g:882:5: ( K_IN | K_OUT | K_INOUT | K_BUFFER | K_LINKAGE )
			// Vhdl.g:
			{
			if ( input.LA(1)==K_BUFFER||input.LA(1)==K_IN||input.LA(1)==K_INOUT||input.LA(1)==K_LINKAGE||input.LA(1)==K_OUT ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "mode"



	// $ANTLR start "multiplying_operator"
	// Vhdl.g:889:1: multiplying_operator : ( STAR | SLASH | K_MOD | K_REM );
	public final void multiplying_operator() throws RecognitionException {
		try {
			// Vhdl.g:890:5: ( STAR | SLASH | K_MOD | K_REM )
			// Vhdl.g:
			{
			if ( input.LA(1)==K_MOD||input.LA(1)==K_REM||input.LA(1)==SLASH||input.LA(1)==STAR ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "multiplying_operator"



	// $ANTLR start "name"
	// Vhdl.g:906:1: name : ( simple_name | operator_symbol ) ( options {greedy=true; } : ( DOT suffix | TIC aggregate | ( signature )? tic_attribute_designator | ( LPAREN expression ( COMMA expression )* RPAREN )=> LPAREN expression ( COMMA expression )* RPAREN | ( LPAREN actual_parameter_part RPAREN )=> LPAREN actual_parameter_part RPAREN | LPAREN discrete_range RPAREN ) )* ;
	public final void name() throws RecognitionException {
		try {
			// Vhdl.g:907:5: ( ( simple_name | operator_symbol ) ( options {greedy=true; } : ( DOT suffix | TIC aggregate | ( signature )? tic_attribute_designator | ( LPAREN expression ( COMMA expression )* RPAREN )=> LPAREN expression ( COMMA expression )* RPAREN | ( LPAREN actual_parameter_part RPAREN )=> LPAREN actual_parameter_part RPAREN | LPAREN discrete_range RPAREN ) )* )
			// Vhdl.g:907:5: ( simple_name | operator_symbol ) ( options {greedy=true; } : ( DOT suffix | TIC aggregate | ( signature )? tic_attribute_designator | ( LPAREN expression ( COMMA expression )* RPAREN )=> LPAREN expression ( COMMA expression )* RPAREN | ( LPAREN actual_parameter_part RPAREN )=> LPAREN actual_parameter_part RPAREN | LPAREN discrete_range RPAREN ) )*
			{
			// Vhdl.g:907:5: ( simple_name | operator_symbol )
			int alt145=2;
			int LA145_0 = input.LA(1);
			if ( (LA145_0==BASIC_IDENTIFIER||LA145_0==EXTENDED_IDENTIFIER) ) {
				alt145=1;
			}
			else if ( (LA145_0==STRING_LITERAL) ) {
				alt145=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 145, 0, input);
				throw nvae;
			}

			switch (alt145) {
				case 1 :
					// Vhdl.g:907:9: simple_name
					{
					pushFollow(FOLLOW_simple_name_in_name4950);
					simple_name();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:908:9: operator_symbol
					{
					pushFollow(FOLLOW_operator_symbol_in_name4960);
					operator_symbol();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// Vhdl.g:910:5: ( options {greedy=true; } : ( DOT suffix | TIC aggregate | ( signature )? tic_attribute_designator | ( LPAREN expression ( COMMA expression )* RPAREN )=> LPAREN expression ( COMMA expression )* RPAREN | ( LPAREN actual_parameter_part RPAREN )=> LPAREN actual_parameter_part RPAREN | LPAREN discrete_range RPAREN ) )*
			loop149:
			while (true) {
				int alt149=2;
				alt149 = dfa149.predict(input);
				switch (alt149) {
				case 1 :
					// Vhdl.g:911:9: ( DOT suffix | TIC aggregate | ( signature )? tic_attribute_designator | ( LPAREN expression ( COMMA expression )* RPAREN )=> LPAREN expression ( COMMA expression )* RPAREN | ( LPAREN actual_parameter_part RPAREN )=> LPAREN actual_parameter_part RPAREN | LPAREN discrete_range RPAREN )
					{
					// Vhdl.g:911:9: ( DOT suffix | TIC aggregate | ( signature )? tic_attribute_designator | ( LPAREN expression ( COMMA expression )* RPAREN )=> LPAREN expression ( COMMA expression )* RPAREN | ( LPAREN actual_parameter_part RPAREN )=> LPAREN actual_parameter_part RPAREN | LPAREN discrete_range RPAREN )
					int alt148=6;
					switch ( input.LA(1) ) {
					case DOT:
						{
						alt148=1;
						}
						break;
					case TIC:
						{
						alt148=2;
						}
						break;
					case LBRACK:
					case TIC_SIMPLE_NAME:
						{
						alt148=3;
						}
						break;
					case LPAREN:
						{
						int LA148_5 = input.LA(2);
						if ( (LA148_5==MINUS||LA148_5==PLUS) ) {
							int LA148_6 = input.LA(3);
							if ( (synpred36_Vhdl()) ) {
								alt148=4;
							}
							else if ( (synpred37_Vhdl()) ) {
								alt148=5;
							}
							else if ( (true) ) {
								alt148=6;
							}

						}
						else if ( (LA148_5==BASIC_IDENTIFIER||LA148_5==EXTENDED_IDENTIFIER) ) {
							int LA148_7 = input.LA(3);
							if ( (synpred36_Vhdl()) ) {
								alt148=4;
							}
							else if ( (synpred37_Vhdl()) ) {
								alt148=5;
							}
							else if ( (true) ) {
								alt148=6;
							}

						}
						else if ( (LA148_5==STRING_LITERAL) ) {
							int LA148_8 = input.LA(3);
							if ( (synpred36_Vhdl()) ) {
								alt148=4;
							}
							else if ( (synpred37_Vhdl()) ) {
								alt148=5;
							}
							else if ( (true) ) {
								alt148=6;
							}

						}
						else if ( (LA148_5==LPAREN) ) {
							int LA148_9 = input.LA(3);
							if ( (synpred36_Vhdl()) ) {
								alt148=4;
							}
							else if ( (synpred37_Vhdl()) ) {
								alt148=5;
							}
							else if ( (true) ) {
								alt148=6;
							}

						}
						else if ( (LA148_5==DECIMAL_LITERAL) ) {
							int LA148_10 = input.LA(3);
							if ( (synpred36_Vhdl()) ) {
								alt148=4;
							}
							else if ( (synpred37_Vhdl()) ) {
								alt148=5;
							}
							else if ( (true) ) {
								alt148=6;
							}

						}
						else if ( (LA148_5==BASED_LITERAL) ) {
							int LA148_11 = input.LA(3);
							if ( (synpred36_Vhdl()) ) {
								alt148=4;
							}
							else if ( (synpred37_Vhdl()) ) {
								alt148=5;
							}
							else if ( (true) ) {
								alt148=6;
							}

						}
						else if ( (LA148_5==CHARACTER_LITERAL) ) {
							int LA148_12 = input.LA(3);
							if ( (synpred36_Vhdl()) ) {
								alt148=4;
							}
							else if ( (synpred37_Vhdl()) ) {
								alt148=5;
							}
							else if ( (true) ) {
								alt148=6;
							}

						}
						else if ( (LA148_5==BIT_STRING_LITERAL) ) {
							int LA148_13 = input.LA(3);
							if ( (synpred36_Vhdl()) ) {
								alt148=4;
							}
							else if ( (synpred37_Vhdl()) ) {
								alt148=5;
							}
							else if ( (true) ) {
								alt148=6;
							}

						}
						else if ( (LA148_5==K_NULL) ) {
							int LA148_14 = input.LA(3);
							if ( (synpred36_Vhdl()) ) {
								alt148=4;
							}
							else if ( (synpred37_Vhdl()) ) {
								alt148=5;
							}
							else if ( (true) ) {
								alt148=6;
							}

						}
						else if ( (LA148_5==K_NEW) ) {
							int LA148_15 = input.LA(3);
							if ( (synpred36_Vhdl()) ) {
								alt148=4;
							}
							else if ( (synpred37_Vhdl()) ) {
								alt148=5;
							}
							else if ( (true) ) {
								alt148=6;
							}

						}
						else if ( (LA148_5==K_ABS) ) {
							int LA148_16 = input.LA(3);
							if ( (synpred36_Vhdl()) ) {
								alt148=4;
							}
							else if ( (synpred37_Vhdl()) ) {
								alt148=5;
							}
							else if ( (true) ) {
								alt148=6;
							}

						}
						else if ( (LA148_5==K_NOT) ) {
							int LA148_17 = input.LA(3);
							if ( (synpred36_Vhdl()) ) {
								alt148=4;
							}
							else if ( (synpred37_Vhdl()) ) {
								alt148=5;
							}
							else if ( (true) ) {
								alt148=6;
							}

						}
						else if ( (LA148_5==K_OPEN) && (synpred37_Vhdl())) {
							alt148=5;
						}

						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 148, 0, input);
						throw nvae;
					}
					switch (alt148) {
						case 1 :
							// Vhdl.g:911:13: DOT suffix
							{
							match(input,DOT,FOLLOW_DOT_in_name4994); if (state.failed) return;
							pushFollow(FOLLOW_suffix_in_name4996);
							suffix();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// Vhdl.g:912:13: TIC aggregate
							{
							match(input,TIC,FOLLOW_TIC_in_name5010); if (state.failed) return;
							pushFollow(FOLLOW_aggregate_in_name5012);
							aggregate();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 3 :
							// Vhdl.g:913:13: ( signature )? tic_attribute_designator
							{
							// Vhdl.g:913:13: ( signature )?
							int alt146=2;
							int LA146_0 = input.LA(1);
							if ( (LA146_0==LBRACK) ) {
								alt146=1;
							}
							switch (alt146) {
								case 1 :
									// Vhdl.g:913:14: signature
									{
									pushFollow(FOLLOW_signature_in_name5027);
									signature();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}

							pushFollow(FOLLOW_tic_attribute_designator_in_name5031);
							tic_attribute_designator();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 4 :
							// Vhdl.g:914:13: ( LPAREN expression ( COMMA expression )* RPAREN )=> LPAREN expression ( COMMA expression )* RPAREN
							{
							match(input,LPAREN,FOLLOW_LPAREN_in_name5071); if (state.failed) return;
							pushFollow(FOLLOW_expression_in_name5073);
							expression();
							state._fsp--;
							if (state.failed) return;
							// Vhdl.g:915:29: ( COMMA expression )*
							loop147:
							while (true) {
								int alt147=2;
								int LA147_0 = input.LA(1);
								if ( (LA147_0==COMMA) ) {
									alt147=1;
								}

								switch (alt147) {
								case 1 :
									// Vhdl.g:915:30: COMMA expression
									{
									match(input,COMMA,FOLLOW_COMMA_in_name5076); if (state.failed) return;
									pushFollow(FOLLOW_expression_in_name5078);
									expression();
									state._fsp--;
									if (state.failed) return;
									}
									break;

								default :
									break loop147;
								}
							}

							match(input,RPAREN,FOLLOW_RPAREN_in_name5082); if (state.failed) return;
							}
							break;
						case 5 :
							// Vhdl.g:916:13: ( LPAREN actual_parameter_part RPAREN )=> LPAREN actual_parameter_part RPAREN
							{
							match(input,LPAREN,FOLLOW_LPAREN_in_name5105); if (state.failed) return;
							pushFollow(FOLLOW_actual_parameter_part_in_name5107);
							actual_parameter_part();
							state._fsp--;
							if (state.failed) return;
							match(input,RPAREN,FOLLOW_RPAREN_in_name5109); if (state.failed) return;
							}
							break;
						case 6 :
							// Vhdl.g:917:13: LPAREN discrete_range RPAREN
							{
							match(input,LPAREN,FOLLOW_LPAREN_in_name5123); if (state.failed) return;
							pushFollow(FOLLOW_discrete_range_in_name5125);
							discrete_range();
							state._fsp--;
							if (state.failed) return;
							match(input,RPAREN,FOLLOW_RPAREN_in_name5127); if (state.failed) return;
							}
							break;

					}

					}
					break;

				default :
					break loop149;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "name"



	// $ANTLR start "next_statement"
	// Vhdl.g:922:1: next_statement : ( label_colon )? K_NEXT ( label )? ( K_WHEN condition )? SEMI ;
	public final void next_statement() throws RecognitionException {
		try {
			// Vhdl.g:923:5: ( ( label_colon )? K_NEXT ( label )? ( K_WHEN condition )? SEMI )
			// Vhdl.g:923:5: ( label_colon )? K_NEXT ( label )? ( K_WHEN condition )? SEMI
			{
			// Vhdl.g:923:5: ( label_colon )?
			int alt150=2;
			int LA150_0 = input.LA(1);
			if ( (LA150_0==BASIC_IDENTIFIER||LA150_0==EXTENDED_IDENTIFIER) ) {
				alt150=1;
			}
			switch (alt150) {
				case 1 :
					// Vhdl.g:923:6: label_colon
					{
					pushFollow(FOLLOW_label_colon_in_next_statement5156);
					label_colon();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,K_NEXT,FOLLOW_K_NEXT_in_next_statement5160); if (state.failed) return;
			// Vhdl.g:923:27: ( label )?
			int alt151=2;
			int LA151_0 = input.LA(1);
			if ( (LA151_0==BASIC_IDENTIFIER||LA151_0==EXTENDED_IDENTIFIER) ) {
				alt151=1;
			}
			switch (alt151) {
				case 1 :
					// Vhdl.g:923:28: label
					{
					pushFollow(FOLLOW_label_in_next_statement5163);
					label();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// Vhdl.g:923:36: ( K_WHEN condition )?
			int alt152=2;
			int LA152_0 = input.LA(1);
			if ( (LA152_0==K_WHEN) ) {
				alt152=1;
			}
			switch (alt152) {
				case 1 :
					// Vhdl.g:923:37: K_WHEN condition
					{
					match(input,K_WHEN,FOLLOW_K_WHEN_in_next_statement5168); if (state.failed) return;
					pushFollow(FOLLOW_condition_in_next_statement5170);
					condition();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,SEMI,FOLLOW_SEMI_in_next_statement5174); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "next_statement"



	// $ANTLR start "null_statement"
	// Vhdl.g:926:1: null_statement : ( label_colon )? K_NULL SEMI ;
	public final void null_statement() throws RecognitionException {
		try {
			// Vhdl.g:927:5: ( ( label_colon )? K_NULL SEMI )
			// Vhdl.g:927:5: ( label_colon )? K_NULL SEMI
			{
			// Vhdl.g:927:5: ( label_colon )?
			int alt153=2;
			int LA153_0 = input.LA(1);
			if ( (LA153_0==BASIC_IDENTIFIER||LA153_0==EXTENDED_IDENTIFIER) ) {
				alt153=1;
			}
			switch (alt153) {
				case 1 :
					// Vhdl.g:927:6: label_colon
					{
					pushFollow(FOLLOW_label_colon_in_null_statement5186);
					label_colon();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,K_NULL,FOLLOW_K_NULL_in_null_statement5190); if (state.failed) return;
			match(input,SEMI,FOLLOW_SEMI_in_null_statement5192); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "null_statement"



	// $ANTLR start "numeric_literal"
	// Vhdl.g:930:1: numeric_literal : ( ( abstract_literal )=> abstract_literal | physical_literal );
	public final void numeric_literal() throws RecognitionException {
		try {
			// Vhdl.g:931:5: ( ( abstract_literal )=> abstract_literal | physical_literal )
			int alt154=2;
			alt154 = dfa154.predict(input);
			switch (alt154) {
				case 1 :
					// Vhdl.g:931:5: ( abstract_literal )=> abstract_literal
					{
					pushFollow(FOLLOW_abstract_literal_in_numeric_literal5208);
					abstract_literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:932:5: physical_literal
					{
					pushFollow(FOLLOW_physical_literal_in_numeric_literal5214);
					physical_literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "numeric_literal"



	// $ANTLR start "object_declaration"
	// Vhdl.g:941:1: object_declaration : ( constant_declaration | signal_declaration | variable_declaration | file_declaration );
	public final void object_declaration() throws RecognitionException {
		try {
			// Vhdl.g:942:5: ( constant_declaration | signal_declaration | variable_declaration | file_declaration )
			int alt155=4;
			switch ( input.LA(1) ) {
			case K_CONSTANT:
				{
				alt155=1;
				}
				break;
			case K_SIGNAL:
				{
				alt155=2;
				}
				break;
			case K_SHARED:
			case K_VARIABLE:
				{
				alt155=3;
				}
				break;
			case K_FILE:
				{
				alt155=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 155, 0, input);
				throw nvae;
			}
			switch (alt155) {
				case 1 :
					// Vhdl.g:942:5: constant_declaration
					{
					pushFollow(FOLLOW_constant_declaration_in_object_declaration5231);
					constant_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:943:5: signal_declaration
					{
					pushFollow(FOLLOW_signal_declaration_in_object_declaration5237);
					signal_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Vhdl.g:944:5: variable_declaration
					{
					pushFollow(FOLLOW_variable_declaration_in_object_declaration5244);
					variable_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// Vhdl.g:945:5: file_declaration
					{
					pushFollow(FOLLOW_file_declaration_in_object_declaration5251);
					file_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "object_declaration"



	// $ANTLR start "operator_symbol"
	// Vhdl.g:948:1: operator_symbol : string_literal ;
	public final void operator_symbol() throws RecognitionException {
		try {
			// Vhdl.g:949:5: ( string_literal )
			// Vhdl.g:949:5: string_literal
			{
			pushFollow(FOLLOW_string_literal_in_operator_symbol5262);
			string_literal();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "operator_symbol"



	// $ANTLR start "package_body"
	// Vhdl.g:954:1: package_body : K_PACKAGE K_BODY simple_name K_IS package_body_declarative_part K_END ( K_PACKAGE K_BODY )? ( simple_name )? SEMI ;
	public final void package_body() throws RecognitionException {
		try {
			// Vhdl.g:955:5: ( K_PACKAGE K_BODY simple_name K_IS package_body_declarative_part K_END ( K_PACKAGE K_BODY )? ( simple_name )? SEMI )
			// Vhdl.g:955:5: K_PACKAGE K_BODY simple_name K_IS package_body_declarative_part K_END ( K_PACKAGE K_BODY )? ( simple_name )? SEMI
			{
			match(input,K_PACKAGE,FOLLOW_K_PACKAGE_in_package_body5275); if (state.failed) return;
			match(input,K_BODY,FOLLOW_K_BODY_in_package_body5277); if (state.failed) return;
			pushFollow(FOLLOW_simple_name_in_package_body5279);
			simple_name();
			state._fsp--;
			if (state.failed) return;
			match(input,K_IS,FOLLOW_K_IS_in_package_body5281); if (state.failed) return;
			pushFollow(FOLLOW_package_body_declarative_part_in_package_body5291);
			package_body_declarative_part();
			state._fsp--;
			if (state.failed) return;
			match(input,K_END,FOLLOW_K_END_in_package_body5293); if (state.failed) return;
			// Vhdl.g:957:9: ( K_PACKAGE K_BODY )?
			int alt156=2;
			int LA156_0 = input.LA(1);
			if ( (LA156_0==K_PACKAGE) ) {
				alt156=1;
			}
			switch (alt156) {
				case 1 :
					// Vhdl.g:957:10: K_PACKAGE K_BODY
					{
					match(input,K_PACKAGE,FOLLOW_K_PACKAGE_in_package_body5304); if (state.failed) return;
					match(input,K_BODY,FOLLOW_K_BODY_in_package_body5306); if (state.failed) return;
					}
					break;

			}

			// Vhdl.g:957:29: ( simple_name )?
			int alt157=2;
			int LA157_0 = input.LA(1);
			if ( (LA157_0==BASIC_IDENTIFIER||LA157_0==EXTENDED_IDENTIFIER) ) {
				alt157=1;
			}
			switch (alt157) {
				case 1 :
					// Vhdl.g:957:30: simple_name
					{
					pushFollow(FOLLOW_simple_name_in_package_body5311);
					simple_name();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,SEMI,FOLLOW_SEMI_in_package_body5315); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "package_body"



	// $ANTLR start "package_body_declarative_item"
	// Vhdl.g:960:1: package_body_declarative_item : ( ( subprogram_declaration )=> subprogram_declaration | subprogram_body | type_declaration | subtype_declaration | constant_declaration | variable_declaration | file_declaration | alias_declaration | use_clause | ( K_GROUP identifier COLON )=> group_declaration | group_template_declaration );
	public final void package_body_declarative_item() throws RecognitionException {
		try {
			// Vhdl.g:961:5: ( ( subprogram_declaration )=> subprogram_declaration | subprogram_body | type_declaration | subtype_declaration | constant_declaration | variable_declaration | file_declaration | alias_declaration | use_clause | ( K_GROUP identifier COLON )=> group_declaration | group_template_declaration )
			int alt158=11;
			switch ( input.LA(1) ) {
			case K_PROCEDURE:
				{
				int LA158_1 = input.LA(2);
				if ( (LA158_1==BASIC_IDENTIFIER||LA158_1==EXTENDED_IDENTIFIER) ) {
					int LA158_13 = input.LA(3);
					if ( (synpred39_Vhdl()) ) {
						alt158=1;
					}
					else if ( (true) ) {
						alt158=2;
					}

				}
				else if ( (LA158_1==STRING_LITERAL) ) {
					int LA158_14 = input.LA(3);
					if ( (synpred39_Vhdl()) ) {
						alt158=1;
					}
					else if ( (true) ) {
						alt158=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 158, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_IMPURE:
			case K_PURE:
				{
				int LA158_2 = input.LA(2);
				if ( (LA158_2==K_FUNCTION) ) {
					int LA158_15 = input.LA(3);
					if ( (synpred39_Vhdl()) ) {
						alt158=1;
					}
					else if ( (true) ) {
						alt158=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 158, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_FUNCTION:
				{
				int LA158_3 = input.LA(2);
				if ( (LA158_3==BASIC_IDENTIFIER||LA158_3==EXTENDED_IDENTIFIER) ) {
					int LA158_16 = input.LA(3);
					if ( (synpred39_Vhdl()) ) {
						alt158=1;
					}
					else if ( (true) ) {
						alt158=2;
					}

				}
				else if ( (LA158_3==STRING_LITERAL) ) {
					int LA158_17 = input.LA(3);
					if ( (synpred39_Vhdl()) ) {
						alt158=1;
					}
					else if ( (true) ) {
						alt158=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 158, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_TYPE:
				{
				alt158=3;
				}
				break;
			case K_SUBTYPE:
				{
				alt158=4;
				}
				break;
			case K_CONSTANT:
				{
				alt158=5;
				}
				break;
			case K_SHARED:
			case K_VARIABLE:
				{
				alt158=6;
				}
				break;
			case K_FILE:
				{
				alt158=7;
				}
				break;
			case K_ALIAS:
				{
				alt158=8;
				}
				break;
			case K_USE:
				{
				alt158=9;
				}
				break;
			case K_GROUP:
				{
				int LA158_12 = input.LA(2);
				if ( (LA158_12==BASIC_IDENTIFIER||LA158_12==EXTENDED_IDENTIFIER) ) {
					int LA158_18 = input.LA(3);
					if ( (synpred40_Vhdl()) ) {
						alt158=10;
					}
					else if ( (true) ) {
						alt158=11;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 158, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 158, 0, input);
				throw nvae;
			}
			switch (alt158) {
				case 1 :
					// Vhdl.g:961:5: ( subprogram_declaration )=> subprogram_declaration
					{
					pushFollow(FOLLOW_subprogram_declaration_in_package_body_declarative_item5331);
					subprogram_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:962:5: subprogram_body
					{
					pushFollow(FOLLOW_subprogram_body_in_package_body_declarative_item5337);
					subprogram_body();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Vhdl.g:963:5: type_declaration
					{
					pushFollow(FOLLOW_type_declaration_in_package_body_declarative_item5344);
					type_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// Vhdl.g:964:5: subtype_declaration
					{
					pushFollow(FOLLOW_subtype_declaration_in_package_body_declarative_item5351);
					subtype_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// Vhdl.g:965:5: constant_declaration
					{
					pushFollow(FOLLOW_constant_declaration_in_package_body_declarative_item5358);
					constant_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// Vhdl.g:966:5: variable_declaration
					{
					pushFollow(FOLLOW_variable_declaration_in_package_body_declarative_item5365);
					variable_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// Vhdl.g:967:5: file_declaration
					{
					pushFollow(FOLLOW_file_declaration_in_package_body_declarative_item5372);
					file_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// Vhdl.g:968:5: alias_declaration
					{
					pushFollow(FOLLOW_alias_declaration_in_package_body_declarative_item5379);
					alias_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 9 :
					// Vhdl.g:969:5: use_clause
					{
					pushFollow(FOLLOW_use_clause_in_package_body_declarative_item5386);
					use_clause();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 10 :
					// Vhdl.g:970:5: ( K_GROUP identifier COLON )=> group_declaration
					{
					pushFollow(FOLLOW_group_declaration_in_package_body_declarative_item5402);
					group_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 11 :
					// Vhdl.g:971:5: group_template_declaration
					{
					pushFollow(FOLLOW_group_template_declaration_in_package_body_declarative_item5408);
					group_template_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "package_body_declarative_item"



	// $ANTLR start "package_body_declarative_part"
	// Vhdl.g:974:1: package_body_declarative_part : ( package_body_declarative_item )* ;
	public final void package_body_declarative_part() throws RecognitionException {
		try {
			// Vhdl.g:975:5: ( ( package_body_declarative_item )* )
			// Vhdl.g:975:5: ( package_body_declarative_item )*
			{
			// Vhdl.g:975:5: ( package_body_declarative_item )*
			loop159:
			while (true) {
				int alt159=2;
				int LA159_0 = input.LA(1);
				if ( (LA159_0==K_ALIAS||LA159_0==K_CONSTANT||LA159_0==K_FILE||LA159_0==K_FUNCTION||LA159_0==K_GROUP||LA159_0==K_IMPURE||LA159_0==K_PROCEDURE||LA159_0==K_PURE||LA159_0==K_SHARED||LA159_0==K_SUBTYPE||LA159_0==K_TYPE||(LA159_0 >= K_USE && LA159_0 <= K_VARIABLE)) ) {
					alt159=1;
				}

				switch (alt159) {
				case 1 :
					// Vhdl.g:975:6: package_body_declarative_item
					{
					pushFollow(FOLLOW_package_body_declarative_item_in_package_body_declarative_part5420);
					package_body_declarative_item();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop159;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "package_body_declarative_part"



	// $ANTLR start "package_declaration"
	// Vhdl.g:978:1: package_declaration : K_PACKAGE identifier K_IS package_declarative_part K_END ( K_PACKAGE )? ( simple_name )? SEMI ;
	public final void package_declaration() throws RecognitionException {
		try {
			// Vhdl.g:979:5: ( K_PACKAGE identifier K_IS package_declarative_part K_END ( K_PACKAGE )? ( simple_name )? SEMI )
			// Vhdl.g:979:5: K_PACKAGE identifier K_IS package_declarative_part K_END ( K_PACKAGE )? ( simple_name )? SEMI
			{
			match(input,K_PACKAGE,FOLLOW_K_PACKAGE_in_package_declaration5433); if (state.failed) return;
			pushFollow(FOLLOW_identifier_in_package_declaration5435);
			identifier();
			state._fsp--;
			if (state.failed) return;
			match(input,K_IS,FOLLOW_K_IS_in_package_declaration5437); if (state.failed) return;
			pushFollow(FOLLOW_package_declarative_part_in_package_declaration5439);
			package_declarative_part();
			state._fsp--;
			if (state.failed) return;
			match(input,K_END,FOLLOW_K_END_in_package_declaration5450); if (state.failed) return;
			// Vhdl.g:980:15: ( K_PACKAGE )?
			int alt160=2;
			int LA160_0 = input.LA(1);
			if ( (LA160_0==K_PACKAGE) ) {
				alt160=1;
			}
			switch (alt160) {
				case 1 :
					// Vhdl.g:980:16: K_PACKAGE
					{
					match(input,K_PACKAGE,FOLLOW_K_PACKAGE_in_package_declaration5453); if (state.failed) return;
					}
					break;

			}

			// Vhdl.g:980:28: ( simple_name )?
			int alt161=2;
			int LA161_0 = input.LA(1);
			if ( (LA161_0==BASIC_IDENTIFIER||LA161_0==EXTENDED_IDENTIFIER) ) {
				alt161=1;
			}
			switch (alt161) {
				case 1 :
					// Vhdl.g:980:29: simple_name
					{
					pushFollow(FOLLOW_simple_name_in_package_declaration5458);
					simple_name();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,SEMI,FOLLOW_SEMI_in_package_declaration5462); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "package_declaration"



	// $ANTLR start "package_declarative_item"
	// Vhdl.g:983:1: package_declarative_item : ( subprogram_declaration | type_declaration | subtype_declaration | constant_declaration | signal_declaration | variable_declaration | file_declaration | alias_declaration | component_declaration | ( attribute_specification )=> attribute_specification | attribute_declaration | disconnection_specification | use_clause | ( K_GROUP identifier COLON )=> group_declaration | group_template_declaration );
	public final void package_declarative_item() throws RecognitionException {
		try {
			// Vhdl.g:984:5: ( subprogram_declaration | type_declaration | subtype_declaration | constant_declaration | signal_declaration | variable_declaration | file_declaration | alias_declaration | component_declaration | ( attribute_specification )=> attribute_specification | attribute_declaration | disconnection_specification | use_clause | ( K_GROUP identifier COLON )=> group_declaration | group_template_declaration )
			int alt162=15;
			switch ( input.LA(1) ) {
			case K_FUNCTION:
			case K_IMPURE:
			case K_PROCEDURE:
			case K_PURE:
				{
				alt162=1;
				}
				break;
			case K_TYPE:
				{
				alt162=2;
				}
				break;
			case K_SUBTYPE:
				{
				alt162=3;
				}
				break;
			case K_CONSTANT:
				{
				alt162=4;
				}
				break;
			case K_SIGNAL:
				{
				alt162=5;
				}
				break;
			case K_SHARED:
			case K_VARIABLE:
				{
				alt162=6;
				}
				break;
			case K_FILE:
				{
				alt162=7;
				}
				break;
			case K_ALIAS:
				{
				alt162=8;
				}
				break;
			case K_COMPONENT:
				{
				alt162=9;
				}
				break;
			case K_ATTRIBUTE:
				{
				int LA162_13 = input.LA(2);
				if ( (LA162_13==BASIC_IDENTIFIER||LA162_13==EXTENDED_IDENTIFIER) ) {
					int LA162_17 = input.LA(3);
					if ( (synpred41_Vhdl()) ) {
						alt162=10;
					}
					else if ( (true) ) {
						alt162=11;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 162, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_DISCONNECT:
				{
				alt162=12;
				}
				break;
			case K_USE:
				{
				alt162=13;
				}
				break;
			case K_GROUP:
				{
				int LA162_16 = input.LA(2);
				if ( (LA162_16==BASIC_IDENTIFIER||LA162_16==EXTENDED_IDENTIFIER) ) {
					int LA162_18 = input.LA(3);
					if ( (synpred42_Vhdl()) ) {
						alt162=14;
					}
					else if ( (true) ) {
						alt162=15;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 162, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 162, 0, input);
				throw nvae;
			}
			switch (alt162) {
				case 1 :
					// Vhdl.g:984:5: subprogram_declaration
					{
					pushFollow(FOLLOW_subprogram_declaration_in_package_declarative_item5473);
					subprogram_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:985:5: type_declaration
					{
					pushFollow(FOLLOW_type_declaration_in_package_declarative_item5479);
					type_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Vhdl.g:986:5: subtype_declaration
					{
					pushFollow(FOLLOW_subtype_declaration_in_package_declarative_item5486);
					subtype_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// Vhdl.g:987:5: constant_declaration
					{
					pushFollow(FOLLOW_constant_declaration_in_package_declarative_item5493);
					constant_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// Vhdl.g:988:5: signal_declaration
					{
					pushFollow(FOLLOW_signal_declaration_in_package_declarative_item5500);
					signal_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// Vhdl.g:989:5: variable_declaration
					{
					pushFollow(FOLLOW_variable_declaration_in_package_declarative_item5507);
					variable_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// Vhdl.g:990:5: file_declaration
					{
					pushFollow(FOLLOW_file_declaration_in_package_declarative_item5514);
					file_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// Vhdl.g:991:5: alias_declaration
					{
					pushFollow(FOLLOW_alias_declaration_in_package_declarative_item5521);
					alias_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 9 :
					// Vhdl.g:992:5: component_declaration
					{
					pushFollow(FOLLOW_component_declaration_in_package_declarative_item5528);
					component_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 10 :
					// Vhdl.g:993:5: ( attribute_specification )=> attribute_specification
					{
					pushFollow(FOLLOW_attribute_specification_in_package_declarative_item5540);
					attribute_specification();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 11 :
					// Vhdl.g:994:5: attribute_declaration
					{
					pushFollow(FOLLOW_attribute_declaration_in_package_declarative_item5546);
					attribute_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 12 :
					// Vhdl.g:995:5: disconnection_specification
					{
					pushFollow(FOLLOW_disconnection_specification_in_package_declarative_item5552);
					disconnection_specification();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 13 :
					// Vhdl.g:996:5: use_clause
					{
					pushFollow(FOLLOW_use_clause_in_package_declarative_item5559);
					use_clause();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 14 :
					// Vhdl.g:997:5: ( K_GROUP identifier COLON )=> group_declaration
					{
					pushFollow(FOLLOW_group_declaration_in_package_declarative_item5575);
					group_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 15 :
					// Vhdl.g:998:5: group_template_declaration
					{
					pushFollow(FOLLOW_group_template_declaration_in_package_declarative_item5581);
					group_template_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "package_declarative_item"



	// $ANTLR start "package_declarative_part"
	// Vhdl.g:1001:1: package_declarative_part : ( package_declarative_item )* ;
	public final void package_declarative_part() throws RecognitionException {
		try {
			// Vhdl.g:1002:5: ( ( package_declarative_item )* )
			// Vhdl.g:1002:5: ( package_declarative_item )*
			{
			// Vhdl.g:1002:5: ( package_declarative_item )*
			loop163:
			while (true) {
				int alt163=2;
				int LA163_0 = input.LA(1);
				if ( (LA163_0==K_ALIAS||LA163_0==K_ATTRIBUTE||LA163_0==K_COMPONENT||(LA163_0 >= K_CONSTANT && LA163_0 <= K_DISCONNECT)||LA163_0==K_FILE||LA163_0==K_FUNCTION||LA163_0==K_GROUP||LA163_0==K_IMPURE||LA163_0==K_PROCEDURE||LA163_0==K_PURE||(LA163_0 >= K_SHARED && LA163_0 <= K_SIGNAL)||LA163_0==K_SUBTYPE||LA163_0==K_TYPE||(LA163_0 >= K_USE && LA163_0 <= K_VARIABLE)) ) {
					alt163=1;
				}

				switch (alt163) {
				case 1 :
					// Vhdl.g:1002:6: package_declarative_item
					{
					pushFollow(FOLLOW_package_declarative_item_in_package_declarative_part5593);
					package_declarative_item();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop163;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "package_declarative_part"



	// $ANTLR start "parameter_specification"
	// Vhdl.g:1005:1: parameter_specification : identifier K_IN discrete_range ;
	public final void parameter_specification() throws RecognitionException {
		try {
			// Vhdl.g:1006:5: ( identifier K_IN discrete_range )
			// Vhdl.g:1006:5: identifier K_IN discrete_range
			{
			pushFollow(FOLLOW_identifier_in_parameter_specification5606);
			identifier();
			state._fsp--;
			if (state.failed) return;
			match(input,K_IN,FOLLOW_K_IN_in_parameter_specification5608); if (state.failed) return;
			pushFollow(FOLLOW_discrete_range_in_parameter_specification5610);
			discrete_range();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "parameter_specification"



	// $ANTLR start "physical_literal"
	// Vhdl.g:1009:1: physical_literal : ( abstract_literal )? name ;
	public final void physical_literal() throws RecognitionException {
		try {
			// Vhdl.g:1010:5: ( ( abstract_literal )? name )
			// Vhdl.g:1010:5: ( abstract_literal )? name
			{
			// Vhdl.g:1010:5: ( abstract_literal )?
			int alt164=2;
			int LA164_0 = input.LA(1);
			if ( (LA164_0==BASED_LITERAL||LA164_0==DECIMAL_LITERAL) ) {
				alt164=1;
			}
			switch (alt164) {
				case 1 :
					// Vhdl.g:1010:6: abstract_literal
					{
					pushFollow(FOLLOW_abstract_literal_in_physical_literal5622);
					abstract_literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_name_in_physical_literal5626);
			name();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "physical_literal"



	// $ANTLR start "physical_type_definition"
	// Vhdl.g:1013:1: physical_type_definition : range_constraint K_UNITS base_unit_declaration ( secondary_unit_declaration )? K_END K_UNITS ( simple_name )? ;
	public final void physical_type_definition() throws RecognitionException {
		try {
			// Vhdl.g:1014:5: ( range_constraint K_UNITS base_unit_declaration ( secondary_unit_declaration )? K_END K_UNITS ( simple_name )? )
			// Vhdl.g:1014:5: range_constraint K_UNITS base_unit_declaration ( secondary_unit_declaration )? K_END K_UNITS ( simple_name )?
			{
			pushFollow(FOLLOW_range_constraint_in_physical_type_definition5637);
			range_constraint();
			state._fsp--;
			if (state.failed) return;
			match(input,K_UNITS,FOLLOW_K_UNITS_in_physical_type_definition5639); if (state.failed) return;
			pushFollow(FOLLOW_base_unit_declaration_in_physical_type_definition5644);
			base_unit_declaration();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:1015:25: ( secondary_unit_declaration )?
			int alt165=2;
			int LA165_0 = input.LA(1);
			if ( (LA165_0==BASIC_IDENTIFIER||LA165_0==EXTENDED_IDENTIFIER) ) {
				alt165=1;
			}
			switch (alt165) {
				case 1 :
					// Vhdl.g:1015:26: secondary_unit_declaration
					{
					pushFollow(FOLLOW_secondary_unit_declaration_in_physical_type_definition5647);
					secondary_unit_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,K_END,FOLLOW_K_END_in_physical_type_definition5659); if (state.failed) return;
			match(input,K_UNITS,FOLLOW_K_UNITS_in_physical_type_definition5661); if (state.failed) return;
			// Vhdl.g:1016:23: ( simple_name )?
			int alt166=2;
			int LA166_0 = input.LA(1);
			if ( (LA166_0==BASIC_IDENTIFIER||LA166_0==EXTENDED_IDENTIFIER) ) {
				alt166=1;
			}
			switch (alt166) {
				case 1 :
					// Vhdl.g:1016:24: simple_name
					{
					pushFollow(FOLLOW_simple_name_in_physical_type_definition5664);
					simple_name();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "physical_type_definition"



	// $ANTLR start "port_clause"
	// Vhdl.g:1019:1: port_clause : K_PORT LPAREN port_list RPAREN SEMI ;
	public final void port_clause() throws RecognitionException {
		try {
			// Vhdl.g:1020:5: ( K_PORT LPAREN port_list RPAREN SEMI )
			// Vhdl.g:1020:5: K_PORT LPAREN port_list RPAREN SEMI
			{
			match(input,K_PORT,FOLLOW_K_PORT_in_port_clause5677); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_port_clause5679); if (state.failed) return;
			pushFollow(FOLLOW_port_list_in_port_clause5681);
			port_list();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_port_clause5683); if (state.failed) return;
			match(input,SEMI,FOLLOW_SEMI_in_port_clause5685); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "port_clause"



	// $ANTLR start "port_list"
	// Vhdl.g:1023:1: port_list : interface_list ;
	public final void port_list() throws RecognitionException {
		try {
			// Vhdl.g:1024:5: ( interface_list )
			// Vhdl.g:1024:5: interface_list
			{
			pushFollow(FOLLOW_interface_list_in_port_list5696);
			interface_list();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "port_list"



	// $ANTLR start "port_map_aspect"
	// Vhdl.g:1027:1: port_map_aspect : K_PORT K_MAP LPAREN association_list RPAREN ;
	public final void port_map_aspect() throws RecognitionException {
		try {
			// Vhdl.g:1028:5: ( K_PORT K_MAP LPAREN association_list RPAREN )
			// Vhdl.g:1028:5: K_PORT K_MAP LPAREN association_list RPAREN
			{
			match(input,K_PORT,FOLLOW_K_PORT_in_port_map_aspect5707); if (state.failed) return;
			match(input,K_MAP,FOLLOW_K_MAP_in_port_map_aspect5709); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_port_map_aspect5711); if (state.failed) return;
			pushFollow(FOLLOW_association_list_in_port_map_aspect5713);
			association_list();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_port_map_aspect5715); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "port_map_aspect"



	// $ANTLR start "primary"
	// Vhdl.g:1031:1: primary : ( ( name ( signature )? tic_attribute_designator )=> name ( signature )? tic_attribute_designator | ( name TIC )=> qualified_expression | ( LPAREN expression RPAREN )=> LPAREN expression RPAREN | literal | allocator | aggregate );
	public final void primary() throws RecognitionException {
		try {
			// Vhdl.g:1032:4: ( ( name ( signature )? tic_attribute_designator )=> name ( signature )? tic_attribute_designator | ( name TIC )=> qualified_expression | ( LPAREN expression RPAREN )=> LPAREN expression RPAREN | literal | allocator | aggregate )
			int alt168=6;
			alt168 = dfa168.predict(input);
			switch (alt168) {
				case 1 :
					// Vhdl.g:1033:4: ( name ( signature )? tic_attribute_designator )=> name ( signature )? tic_attribute_designator
					{
					pushFollow(FOLLOW_name_in_primary5752);
					name();
					state._fsp--;
					if (state.failed) return;
					// Vhdl.g:1034:14: ( signature )?
					int alt167=2;
					int LA167_0 = input.LA(1);
					if ( (LA167_0==LBRACK) ) {
						alt167=1;
					}
					switch (alt167) {
						case 1 :
							// Vhdl.g:1034:15: signature
							{
							pushFollow(FOLLOW_signature_in_primary5755);
							signature();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					pushFollow(FOLLOW_tic_attribute_designator_in_primary5759);
					tic_attribute_designator();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:1035:3: ( name TIC )=> qualified_expression
					{
					pushFollow(FOLLOW_qualified_expression_in_primary5771);
					qualified_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Vhdl.g:1036:3: ( LPAREN expression RPAREN )=> LPAREN expression RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_primary5784); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_primary5786);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,RPAREN,FOLLOW_RPAREN_in_primary5788); if (state.failed) return;
					}
					break;
				case 4 :
					// Vhdl.g:1037:3: literal
					{
					pushFollow(FOLLOW_literal_in_primary5792);
					literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// Vhdl.g:1038:3: allocator
					{
					pushFollow(FOLLOW_allocator_in_primary5796);
					allocator();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// Vhdl.g:1039:3: aggregate
					{
					pushFollow(FOLLOW_aggregate_in_primary5800);
					aggregate();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "primary"



	// $ANTLR start "primary_unit"
	// Vhdl.g:1042:1: primary_unit : ( entity_declaration | configuration_declaration | package_declaration );
	public final void primary_unit() throws RecognitionException {
		try {
			// Vhdl.g:1043:5: ( entity_declaration | configuration_declaration | package_declaration )
			int alt169=3;
			switch ( input.LA(1) ) {
			case K_ENTITY:
				{
				alt169=1;
				}
				break;
			case K_CONFIGURATION:
				{
				alt169=2;
				}
				break;
			case K_PACKAGE:
				{
				alt169=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 169, 0, input);
				throw nvae;
			}
			switch (alt169) {
				case 1 :
					// Vhdl.g:1043:5: entity_declaration
					{
					pushFollow(FOLLOW_entity_declaration_in_primary_unit5811);
					entity_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:1044:5: configuration_declaration
					{
					pushFollow(FOLLOW_configuration_declaration_in_primary_unit5817);
					configuration_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Vhdl.g:1045:5: package_declaration
					{
					pushFollow(FOLLOW_package_declaration_in_primary_unit5824);
					package_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "primary_unit"



	// $ANTLR start "procedure_call"
	// Vhdl.g:1048:1: procedure_call : name ( LPAREN actual_parameter_part RPAREN )? ;
	public final void procedure_call() throws RecognitionException {
		try {
			// Vhdl.g:1049:5: ( name ( LPAREN actual_parameter_part RPAREN )? )
			// Vhdl.g:1049:5: name ( LPAREN actual_parameter_part RPAREN )?
			{
			pushFollow(FOLLOW_name_in_procedure_call5835);
			name();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:1049:10: ( LPAREN actual_parameter_part RPAREN )?
			int alt170=2;
			int LA170_0 = input.LA(1);
			if ( (LA170_0==LPAREN) ) {
				alt170=1;
			}
			switch (alt170) {
				case 1 :
					// Vhdl.g:1049:12: LPAREN actual_parameter_part RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_procedure_call5839); if (state.failed) return;
					pushFollow(FOLLOW_actual_parameter_part_in_procedure_call5841);
					actual_parameter_part();
					state._fsp--;
					if (state.failed) return;
					match(input,RPAREN,FOLLOW_RPAREN_in_procedure_call5843); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "procedure_call"



	// $ANTLR start "procedure_call_statement"
	// Vhdl.g:1052:1: procedure_call_statement : ( options {greedy=true; } : label_colon )? procedure_call SEMI ;
	public final void procedure_call_statement() throws RecognitionException {
		try {
			// Vhdl.g:1053:5: ( ( options {greedy=true; } : label_colon )? procedure_call SEMI )
			// Vhdl.g:1053:5: ( options {greedy=true; } : label_colon )? procedure_call SEMI
			{
			// Vhdl.g:1053:5: ( options {greedy=true; } : label_colon )?
			int alt171=2;
			int LA171_0 = input.LA(1);
			if ( (LA171_0==BASIC_IDENTIFIER||LA171_0==EXTENDED_IDENTIFIER) ) {
				int LA171_1 = input.LA(2);
				if ( (LA171_1==COLON) ) {
					alt171=1;
				}
			}
			switch (alt171) {
				case 1 :
					// Vhdl.g:1053:29: label_colon
					{
					pushFollow(FOLLOW_label_colon_in_procedure_call_statement5866);
					label_colon();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_procedure_call_in_procedure_call_statement5870);
			procedure_call();
			state._fsp--;
			if (state.failed) return;
			match(input,SEMI,FOLLOW_SEMI_in_procedure_call_statement5872); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "procedure_call_statement"



	// $ANTLR start "process_declarative_item"
	// Vhdl.g:1056:1: process_declarative_item : ( ( subprogram_declaration )=> subprogram_declaration | subprogram_body | type_declaration | subtype_declaration | constant_declaration | variable_declaration | file_declaration | alias_declaration | ( attribute_specification )=> attribute_specification | attribute_declaration | use_clause | ( K_GROUP identifier COLON )=> group_declaration | group_template_declaration );
	public final void process_declarative_item() throws RecognitionException {
		try {
			// Vhdl.g:1057:5: ( ( subprogram_declaration )=> subprogram_declaration | subprogram_body | type_declaration | subtype_declaration | constant_declaration | variable_declaration | file_declaration | alias_declaration | ( attribute_specification )=> attribute_specification | attribute_declaration | use_clause | ( K_GROUP identifier COLON )=> group_declaration | group_template_declaration )
			int alt172=13;
			switch ( input.LA(1) ) {
			case K_PROCEDURE:
				{
				int LA172_1 = input.LA(2);
				if ( (LA172_1==BASIC_IDENTIFIER||LA172_1==EXTENDED_IDENTIFIER) ) {
					int LA172_14 = input.LA(3);
					if ( (synpred46_Vhdl()) ) {
						alt172=1;
					}
					else if ( (true) ) {
						alt172=2;
					}

				}
				else if ( (LA172_1==STRING_LITERAL) ) {
					int LA172_15 = input.LA(3);
					if ( (synpred46_Vhdl()) ) {
						alt172=1;
					}
					else if ( (true) ) {
						alt172=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 172, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_IMPURE:
			case K_PURE:
				{
				int LA172_2 = input.LA(2);
				if ( (LA172_2==K_FUNCTION) ) {
					int LA172_16 = input.LA(3);
					if ( (synpred46_Vhdl()) ) {
						alt172=1;
					}
					else if ( (true) ) {
						alt172=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 172, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_FUNCTION:
				{
				int LA172_3 = input.LA(2);
				if ( (LA172_3==BASIC_IDENTIFIER||LA172_3==EXTENDED_IDENTIFIER) ) {
					int LA172_17 = input.LA(3);
					if ( (synpred46_Vhdl()) ) {
						alt172=1;
					}
					else if ( (true) ) {
						alt172=2;
					}

				}
				else if ( (LA172_3==STRING_LITERAL) ) {
					int LA172_18 = input.LA(3);
					if ( (synpred46_Vhdl()) ) {
						alt172=1;
					}
					else if ( (true) ) {
						alt172=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 172, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_TYPE:
				{
				alt172=3;
				}
				break;
			case K_SUBTYPE:
				{
				alt172=4;
				}
				break;
			case K_CONSTANT:
				{
				alt172=5;
				}
				break;
			case K_SHARED:
			case K_VARIABLE:
				{
				alt172=6;
				}
				break;
			case K_FILE:
				{
				alt172=7;
				}
				break;
			case K_ALIAS:
				{
				alt172=8;
				}
				break;
			case K_ATTRIBUTE:
				{
				int LA172_11 = input.LA(2);
				if ( (LA172_11==BASIC_IDENTIFIER||LA172_11==EXTENDED_IDENTIFIER) ) {
					int LA172_19 = input.LA(3);
					if ( (synpred47_Vhdl()) ) {
						alt172=9;
					}
					else if ( (true) ) {
						alt172=10;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 172, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_USE:
				{
				alt172=11;
				}
				break;
			case K_GROUP:
				{
				int LA172_13 = input.LA(2);
				if ( (LA172_13==BASIC_IDENTIFIER||LA172_13==EXTENDED_IDENTIFIER) ) {
					int LA172_20 = input.LA(3);
					if ( (synpred48_Vhdl()) ) {
						alt172=12;
					}
					else if ( (true) ) {
						alt172=13;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 172, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 172, 0, input);
				throw nvae;
			}
			switch (alt172) {
				case 1 :
					// Vhdl.g:1057:5: ( subprogram_declaration )=> subprogram_declaration
					{
					pushFollow(FOLLOW_subprogram_declaration_in_process_declarative_item5888);
					subprogram_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:1058:5: subprogram_body
					{
					pushFollow(FOLLOW_subprogram_body_in_process_declarative_item5895);
					subprogram_body();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Vhdl.g:1059:5: type_declaration
					{
					pushFollow(FOLLOW_type_declaration_in_process_declarative_item5902);
					type_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// Vhdl.g:1060:5: subtype_declaration
					{
					pushFollow(FOLLOW_subtype_declaration_in_process_declarative_item5909);
					subtype_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// Vhdl.g:1061:5: constant_declaration
					{
					pushFollow(FOLLOW_constant_declaration_in_process_declarative_item5916);
					constant_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// Vhdl.g:1062:5: variable_declaration
					{
					pushFollow(FOLLOW_variable_declaration_in_process_declarative_item5923);
					variable_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// Vhdl.g:1063:5: file_declaration
					{
					pushFollow(FOLLOW_file_declaration_in_process_declarative_item5930);
					file_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// Vhdl.g:1064:5: alias_declaration
					{
					pushFollow(FOLLOW_alias_declaration_in_process_declarative_item5937);
					alias_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 9 :
					// Vhdl.g:1065:5: ( attribute_specification )=> attribute_specification
					{
					pushFollow(FOLLOW_attribute_specification_in_process_declarative_item5949);
					attribute_specification();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 10 :
					// Vhdl.g:1066:5: attribute_declaration
					{
					pushFollow(FOLLOW_attribute_declaration_in_process_declarative_item5955);
					attribute_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 11 :
					// Vhdl.g:1067:5: use_clause
					{
					pushFollow(FOLLOW_use_clause_in_process_declarative_item5961);
					use_clause();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 12 :
					// Vhdl.g:1068:5: ( K_GROUP identifier COLON )=> group_declaration
					{
					pushFollow(FOLLOW_group_declaration_in_process_declarative_item5977);
					group_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 13 :
					// Vhdl.g:1069:5: group_template_declaration
					{
					pushFollow(FOLLOW_group_template_declaration_in_process_declarative_item5983);
					group_template_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "process_declarative_item"



	// $ANTLR start "process_declarative_part"
	// Vhdl.g:1072:1: process_declarative_part : ( process_declarative_item )* ;
	public final void process_declarative_part() throws RecognitionException {
		try {
			// Vhdl.g:1073:5: ( ( process_declarative_item )* )
			// Vhdl.g:1073:5: ( process_declarative_item )*
			{
			// Vhdl.g:1073:5: ( process_declarative_item )*
			loop173:
			while (true) {
				int alt173=2;
				int LA173_0 = input.LA(1);
				if ( (LA173_0==K_ALIAS||LA173_0==K_ATTRIBUTE||LA173_0==K_CONSTANT||LA173_0==K_FILE||LA173_0==K_FUNCTION||LA173_0==K_GROUP||LA173_0==K_IMPURE||LA173_0==K_PROCEDURE||LA173_0==K_PURE||LA173_0==K_SHARED||LA173_0==K_SUBTYPE||LA173_0==K_TYPE||(LA173_0 >= K_USE && LA173_0 <= K_VARIABLE)) ) {
					alt173=1;
				}

				switch (alt173) {
				case 1 :
					// Vhdl.g:1073:6: process_declarative_item
					{
					pushFollow(FOLLOW_process_declarative_item_in_process_declarative_part5995);
					process_declarative_item();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop173;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "process_declarative_part"



	// $ANTLR start "process_statement"
	// Vhdl.g:1076:1: process_statement : ( label_colon )? ( K_POSTPONED )? K_PROCESS ( LPAREN sensitivity_list RPAREN )? ( K_IS )? process_declarative_part K_BEGIN process_statement_part K_END ( K_POSTPONED )? K_PROCESS ( label )? SEMI ;
	public final void process_statement() throws RecognitionException {
		try {
			// Vhdl.g:1077:5: ( ( label_colon )? ( K_POSTPONED )? K_PROCESS ( LPAREN sensitivity_list RPAREN )? ( K_IS )? process_declarative_part K_BEGIN process_statement_part K_END ( K_POSTPONED )? K_PROCESS ( label )? SEMI )
			// Vhdl.g:1077:5: ( label_colon )? ( K_POSTPONED )? K_PROCESS ( LPAREN sensitivity_list RPAREN )? ( K_IS )? process_declarative_part K_BEGIN process_statement_part K_END ( K_POSTPONED )? K_PROCESS ( label )? SEMI
			{
			// Vhdl.g:1077:5: ( label_colon )?
			int alt174=2;
			int LA174_0 = input.LA(1);
			if ( (LA174_0==BASIC_IDENTIFIER||LA174_0==EXTENDED_IDENTIFIER) ) {
				alt174=1;
			}
			switch (alt174) {
				case 1 :
					// Vhdl.g:1077:6: label_colon
					{
					pushFollow(FOLLOW_label_colon_in_process_statement6009);
					label_colon();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// Vhdl.g:1077:21: ( K_POSTPONED )?
			int alt175=2;
			int LA175_0 = input.LA(1);
			if ( (LA175_0==K_POSTPONED) ) {
				alt175=1;
			}
			switch (alt175) {
				case 1 :
					// Vhdl.g:1077:22: K_POSTPONED
					{
					match(input,K_POSTPONED,FOLLOW_K_POSTPONED_in_process_statement6015); if (state.failed) return;
					}
					break;

			}

			match(input,K_PROCESS,FOLLOW_K_PROCESS_in_process_statement6019); if (state.failed) return;
			// Vhdl.g:1077:46: ( LPAREN sensitivity_list RPAREN )?
			int alt176=2;
			int LA176_0 = input.LA(1);
			if ( (LA176_0==LPAREN) ) {
				alt176=1;
			}
			switch (alt176) {
				case 1 :
					// Vhdl.g:1077:47: LPAREN sensitivity_list RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_process_statement6022); if (state.failed) return;
					pushFollow(FOLLOW_sensitivity_list_in_process_statement6024);
					sensitivity_list();
					state._fsp--;
					if (state.failed) return;
					match(input,RPAREN,FOLLOW_RPAREN_in_process_statement6026); if (state.failed) return;
					}
					break;

			}

			// Vhdl.g:1078:9: ( K_IS )?
			int alt177=2;
			int LA177_0 = input.LA(1);
			if ( (LA177_0==K_IS) ) {
				alt177=1;
			}
			switch (alt177) {
				case 1 :
					// Vhdl.g:1078:10: K_IS
					{
					match(input,K_IS,FOLLOW_K_IS_in_process_statement6039); if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_process_declarative_part_in_process_statement6043);
			process_declarative_part();
			state._fsp--;
			if (state.failed) return;
			match(input,K_BEGIN,FOLLOW_K_BEGIN_in_process_statement6045); if (state.failed) return;
			pushFollow(FOLLOW_process_statement_part_in_process_statement6055);
			process_statement_part();
			state._fsp--;
			if (state.failed) return;
			match(input,K_END,FOLLOW_K_END_in_process_statement6057); if (state.failed) return;
			// Vhdl.g:1079:38: ( K_POSTPONED )?
			int alt178=2;
			int LA178_0 = input.LA(1);
			if ( (LA178_0==K_POSTPONED) ) {
				alt178=1;
			}
			switch (alt178) {
				case 1 :
					// Vhdl.g:1079:39: K_POSTPONED
					{
					match(input,K_POSTPONED,FOLLOW_K_POSTPONED_in_process_statement6060); if (state.failed) return;
					}
					break;

			}

			match(input,K_PROCESS,FOLLOW_K_PROCESS_in_process_statement6064); if (state.failed) return;
			// Vhdl.g:1079:63: ( label )?
			int alt179=2;
			int LA179_0 = input.LA(1);
			if ( (LA179_0==BASIC_IDENTIFIER||LA179_0==EXTENDED_IDENTIFIER) ) {
				alt179=1;
			}
			switch (alt179) {
				case 1 :
					// Vhdl.g:1079:64: label
					{
					pushFollow(FOLLOW_label_in_process_statement6067);
					label();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,SEMI,FOLLOW_SEMI_in_process_statement6071); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "process_statement"



	// $ANTLR start "process_statement_part"
	// Vhdl.g:1082:1: process_statement_part : ( sequential_statement )* ;
	public final void process_statement_part() throws RecognitionException {
		try {
			// Vhdl.g:1083:5: ( ( sequential_statement )* )
			// Vhdl.g:1083:5: ( sequential_statement )*
			{
			// Vhdl.g:1083:5: ( sequential_statement )*
			loop180:
			while (true) {
				int alt180=2;
				int LA180_0 = input.LA(1);
				if ( (LA180_0==BASIC_IDENTIFIER||LA180_0==EXTENDED_IDENTIFIER||LA180_0==K_ASSERT||LA180_0==K_CASE||LA180_0==K_EXIT||LA180_0==K_FOR||LA180_0==K_IF||LA180_0==K_LOOP||LA180_0==K_NEXT||LA180_0==K_NULL||(LA180_0 >= K_REPORT && LA180_0 <= K_RETURN)||LA180_0==K_WAIT||LA180_0==K_WHILE||LA180_0==LPAREN||LA180_0==STRING_LITERAL) ) {
					alt180=1;
				}

				switch (alt180) {
				case 1 :
					// Vhdl.g:1083:6: sequential_statement
					{
					pushFollow(FOLLOW_sequential_statement_in_process_statement_part6083);
					sequential_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop180;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "process_statement_part"



	// $ANTLR start "protected_type_body"
	// Vhdl.g:1086:1: protected_type_body : K_PROTECTED K_BODY protected_type_body_declarative_part K_END K_PROTECTED K_BODY ( simple_name )? ;
	public final void protected_type_body() throws RecognitionException {
		try {
			// Vhdl.g:1087:5: ( K_PROTECTED K_BODY protected_type_body_declarative_part K_END K_PROTECTED K_BODY ( simple_name )? )
			// Vhdl.g:1087:5: K_PROTECTED K_BODY protected_type_body_declarative_part K_END K_PROTECTED K_BODY ( simple_name )?
			{
			match(input,K_PROTECTED,FOLLOW_K_PROTECTED_in_protected_type_body6096); if (state.failed) return;
			match(input,K_BODY,FOLLOW_K_BODY_in_protected_type_body6098); if (state.failed) return;
			pushFollow(FOLLOW_protected_type_body_declarative_part_in_protected_type_body6100);
			protected_type_body_declarative_part();
			state._fsp--;
			if (state.failed) return;
			match(input,K_END,FOLLOW_K_END_in_protected_type_body6111); if (state.failed) return;
			match(input,K_PROTECTED,FOLLOW_K_PROTECTED_in_protected_type_body6113); if (state.failed) return;
			match(input,K_BODY,FOLLOW_K_BODY_in_protected_type_body6115); if (state.failed) return;
			// Vhdl.g:1088:34: ( simple_name )?
			int alt181=2;
			int LA181_0 = input.LA(1);
			if ( (LA181_0==BASIC_IDENTIFIER||LA181_0==EXTENDED_IDENTIFIER) ) {
				alt181=1;
			}
			switch (alt181) {
				case 1 :
					// Vhdl.g:1088:35: simple_name
					{
					pushFollow(FOLLOW_simple_name_in_protected_type_body6118);
					simple_name();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "protected_type_body"



	// $ANTLR start "protected_type_body_declarative_item"
	// Vhdl.g:1091:1: protected_type_body_declarative_item : ( ( subprogram_declaration )=> subprogram_declaration | subprogram_body | type_declaration | subtype_declaration | constant_declaration | variable_declaration | file_declaration | alias_declaration | ( attribute_specification )=> attribute_specification | attribute_declaration | use_clause | ( K_GROUP identifier COLON )=> group_declaration | group_template_declaration );
	public final void protected_type_body_declarative_item() throws RecognitionException {
		try {
			// Vhdl.g:1092:5: ( ( subprogram_declaration )=> subprogram_declaration | subprogram_body | type_declaration | subtype_declaration | constant_declaration | variable_declaration | file_declaration | alias_declaration | ( attribute_specification )=> attribute_specification | attribute_declaration | use_clause | ( K_GROUP identifier COLON )=> group_declaration | group_template_declaration )
			int alt182=13;
			switch ( input.LA(1) ) {
			case K_PROCEDURE:
				{
				int LA182_1 = input.LA(2);
				if ( (LA182_1==BASIC_IDENTIFIER||LA182_1==EXTENDED_IDENTIFIER) ) {
					int LA182_14 = input.LA(3);
					if ( (synpred49_Vhdl()) ) {
						alt182=1;
					}
					else if ( (true) ) {
						alt182=2;
					}

				}
				else if ( (LA182_1==STRING_LITERAL) ) {
					int LA182_15 = input.LA(3);
					if ( (synpred49_Vhdl()) ) {
						alt182=1;
					}
					else if ( (true) ) {
						alt182=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 182, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_IMPURE:
			case K_PURE:
				{
				int LA182_2 = input.LA(2);
				if ( (LA182_2==K_FUNCTION) ) {
					int LA182_16 = input.LA(3);
					if ( (synpred49_Vhdl()) ) {
						alt182=1;
					}
					else if ( (true) ) {
						alt182=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 182, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_FUNCTION:
				{
				int LA182_3 = input.LA(2);
				if ( (LA182_3==BASIC_IDENTIFIER||LA182_3==EXTENDED_IDENTIFIER) ) {
					int LA182_17 = input.LA(3);
					if ( (synpred49_Vhdl()) ) {
						alt182=1;
					}
					else if ( (true) ) {
						alt182=2;
					}

				}
				else if ( (LA182_3==STRING_LITERAL) ) {
					int LA182_18 = input.LA(3);
					if ( (synpred49_Vhdl()) ) {
						alt182=1;
					}
					else if ( (true) ) {
						alt182=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 182, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_TYPE:
				{
				alt182=3;
				}
				break;
			case K_SUBTYPE:
				{
				alt182=4;
				}
				break;
			case K_CONSTANT:
				{
				alt182=5;
				}
				break;
			case K_SHARED:
			case K_VARIABLE:
				{
				alt182=6;
				}
				break;
			case K_FILE:
				{
				alt182=7;
				}
				break;
			case K_ALIAS:
				{
				alt182=8;
				}
				break;
			case K_ATTRIBUTE:
				{
				int LA182_11 = input.LA(2);
				if ( (LA182_11==BASIC_IDENTIFIER||LA182_11==EXTENDED_IDENTIFIER) ) {
					int LA182_19 = input.LA(3);
					if ( (synpred50_Vhdl()) ) {
						alt182=9;
					}
					else if ( (true) ) {
						alt182=10;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 182, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_USE:
				{
				alt182=11;
				}
				break;
			case K_GROUP:
				{
				int LA182_13 = input.LA(2);
				if ( (LA182_13==BASIC_IDENTIFIER||LA182_13==EXTENDED_IDENTIFIER) ) {
					int LA182_20 = input.LA(3);
					if ( (synpred51_Vhdl()) ) {
						alt182=12;
					}
					else if ( (true) ) {
						alt182=13;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 182, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 182, 0, input);
				throw nvae;
			}
			switch (alt182) {
				case 1 :
					// Vhdl.g:1092:5: ( subprogram_declaration )=> subprogram_declaration
					{
					pushFollow(FOLLOW_subprogram_declaration_in_protected_type_body_declarative_item6136);
					subprogram_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:1093:5: subprogram_body
					{
					pushFollow(FOLLOW_subprogram_body_in_protected_type_body_declarative_item6143);
					subprogram_body();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Vhdl.g:1094:5: type_declaration
					{
					pushFollow(FOLLOW_type_declaration_in_protected_type_body_declarative_item6150);
					type_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// Vhdl.g:1095:5: subtype_declaration
					{
					pushFollow(FOLLOW_subtype_declaration_in_protected_type_body_declarative_item6157);
					subtype_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// Vhdl.g:1096:5: constant_declaration
					{
					pushFollow(FOLLOW_constant_declaration_in_protected_type_body_declarative_item6164);
					constant_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// Vhdl.g:1097:5: variable_declaration
					{
					pushFollow(FOLLOW_variable_declaration_in_protected_type_body_declarative_item6171);
					variable_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// Vhdl.g:1098:5: file_declaration
					{
					pushFollow(FOLLOW_file_declaration_in_protected_type_body_declarative_item6178);
					file_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// Vhdl.g:1099:5: alias_declaration
					{
					pushFollow(FOLLOW_alias_declaration_in_protected_type_body_declarative_item6185);
					alias_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 9 :
					// Vhdl.g:1100:5: ( attribute_specification )=> attribute_specification
					{
					pushFollow(FOLLOW_attribute_specification_in_protected_type_body_declarative_item6197);
					attribute_specification();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 10 :
					// Vhdl.g:1101:5: attribute_declaration
					{
					pushFollow(FOLLOW_attribute_declaration_in_protected_type_body_declarative_item6203);
					attribute_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 11 :
					// Vhdl.g:1102:5: use_clause
					{
					pushFollow(FOLLOW_use_clause_in_protected_type_body_declarative_item6209);
					use_clause();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 12 :
					// Vhdl.g:1103:5: ( K_GROUP identifier COLON )=> group_declaration
					{
					pushFollow(FOLLOW_group_declaration_in_protected_type_body_declarative_item6225);
					group_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 13 :
					// Vhdl.g:1104:5: group_template_declaration
					{
					pushFollow(FOLLOW_group_template_declaration_in_protected_type_body_declarative_item6231);
					group_template_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "protected_type_body_declarative_item"



	// $ANTLR start "protected_type_body_declarative_part"
	// Vhdl.g:1107:1: protected_type_body_declarative_part : ( protected_type_body_declarative_item )* ;
	public final void protected_type_body_declarative_part() throws RecognitionException {
		try {
			// Vhdl.g:1108:5: ( ( protected_type_body_declarative_item )* )
			// Vhdl.g:1108:5: ( protected_type_body_declarative_item )*
			{
			// Vhdl.g:1108:5: ( protected_type_body_declarative_item )*
			loop183:
			while (true) {
				int alt183=2;
				int LA183_0 = input.LA(1);
				if ( (LA183_0==K_ALIAS||LA183_0==K_ATTRIBUTE||LA183_0==K_CONSTANT||LA183_0==K_FILE||LA183_0==K_FUNCTION||LA183_0==K_GROUP||LA183_0==K_IMPURE||LA183_0==K_PROCEDURE||LA183_0==K_PURE||LA183_0==K_SHARED||LA183_0==K_SUBTYPE||LA183_0==K_TYPE||(LA183_0 >= K_USE && LA183_0 <= K_VARIABLE)) ) {
					alt183=1;
				}

				switch (alt183) {
				case 1 :
					// Vhdl.g:1108:6: protected_type_body_declarative_item
					{
					pushFollow(FOLLOW_protected_type_body_declarative_item_in_protected_type_body_declarative_part6243);
					protected_type_body_declarative_item();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop183;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "protected_type_body_declarative_part"



	// $ANTLR start "protected_type_declaration"
	// Vhdl.g:1111:1: protected_type_declaration : K_PROTECTED protected_type_declarative_part K_END K_PROTECTED ( simple_name )? ;
	public final void protected_type_declaration() throws RecognitionException {
		try {
			// Vhdl.g:1112:5: ( K_PROTECTED protected_type_declarative_part K_END K_PROTECTED ( simple_name )? )
			// Vhdl.g:1112:5: K_PROTECTED protected_type_declarative_part K_END K_PROTECTED ( simple_name )?
			{
			match(input,K_PROTECTED,FOLLOW_K_PROTECTED_in_protected_type_declaration6256); if (state.failed) return;
			pushFollow(FOLLOW_protected_type_declarative_part_in_protected_type_declaration6258);
			protected_type_declarative_part();
			state._fsp--;
			if (state.failed) return;
			match(input,K_END,FOLLOW_K_END_in_protected_type_declaration6269); if (state.failed) return;
			match(input,K_PROTECTED,FOLLOW_K_PROTECTED_in_protected_type_declaration6271); if (state.failed) return;
			// Vhdl.g:1113:27: ( simple_name )?
			int alt184=2;
			int LA184_0 = input.LA(1);
			if ( (LA184_0==BASIC_IDENTIFIER||LA184_0==EXTENDED_IDENTIFIER) ) {
				alt184=1;
			}
			switch (alt184) {
				case 1 :
					// Vhdl.g:1113:28: simple_name
					{
					pushFollow(FOLLOW_simple_name_in_protected_type_declaration6274);
					simple_name();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "protected_type_declaration"



	// $ANTLR start "protected_type_declarative_item"
	// Vhdl.g:1116:1: protected_type_declarative_item : ( subprogram_specification | attribute_specification | use_clause );
	public final void protected_type_declarative_item() throws RecognitionException {
		try {
			// Vhdl.g:1117:5: ( subprogram_specification | attribute_specification | use_clause )
			int alt185=3;
			switch ( input.LA(1) ) {
			case K_FUNCTION:
			case K_IMPURE:
			case K_PROCEDURE:
			case K_PURE:
				{
				alt185=1;
				}
				break;
			case K_ATTRIBUTE:
				{
				alt185=2;
				}
				break;
			case K_USE:
				{
				alt185=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 185, 0, input);
				throw nvae;
			}
			switch (alt185) {
				case 1 :
					// Vhdl.g:1117:5: subprogram_specification
					{
					pushFollow(FOLLOW_subprogram_specification_in_protected_type_declarative_item6287);
					subprogram_specification();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:1118:5: attribute_specification
					{
					pushFollow(FOLLOW_attribute_specification_in_protected_type_declarative_item6293);
					attribute_specification();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Vhdl.g:1119:5: use_clause
					{
					pushFollow(FOLLOW_use_clause_in_protected_type_declarative_item6300);
					use_clause();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "protected_type_declarative_item"



	// $ANTLR start "protected_type_declarative_part"
	// Vhdl.g:1122:1: protected_type_declarative_part : ( protected_type_declarative_item )* ;
	public final void protected_type_declarative_part() throws RecognitionException {
		try {
			// Vhdl.g:1123:5: ( ( protected_type_declarative_item )* )
			// Vhdl.g:1123:5: ( protected_type_declarative_item )*
			{
			// Vhdl.g:1123:5: ( protected_type_declarative_item )*
			loop186:
			while (true) {
				int alt186=2;
				int LA186_0 = input.LA(1);
				if ( (LA186_0==K_ATTRIBUTE||LA186_0==K_FUNCTION||LA186_0==K_IMPURE||LA186_0==K_PROCEDURE||LA186_0==K_PURE||LA186_0==K_USE) ) {
					alt186=1;
				}

				switch (alt186) {
				case 1 :
					// Vhdl.g:1123:6: protected_type_declarative_item
					{
					pushFollow(FOLLOW_protected_type_declarative_item_in_protected_type_declarative_part6312);
					protected_type_declarative_item();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop186;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "protected_type_declarative_part"



	// $ANTLR start "protected_type_definition"
	// Vhdl.g:1126:1: protected_type_definition : ( protected_type_declaration | protected_type_body );
	public final void protected_type_definition() throws RecognitionException {
		try {
			// Vhdl.g:1127:5: ( protected_type_declaration | protected_type_body )
			int alt187=2;
			int LA187_0 = input.LA(1);
			if ( (LA187_0==K_PROTECTED) ) {
				int LA187_1 = input.LA(2);
				if ( (LA187_1==K_BODY) ) {
					alt187=2;
				}
				else if ( (LA187_1==K_ATTRIBUTE||LA187_1==K_END||LA187_1==K_FUNCTION||LA187_1==K_IMPURE||LA187_1==K_PROCEDURE||LA187_1==K_PURE||LA187_1==K_USE) ) {
					alt187=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 187, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 187, 0, input);
				throw nvae;
			}

			switch (alt187) {
				case 1 :
					// Vhdl.g:1127:5: protected_type_declaration
					{
					pushFollow(FOLLOW_protected_type_declaration_in_protected_type_definition6325);
					protected_type_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:1128:5: protected_type_body
					{
					pushFollow(FOLLOW_protected_type_body_in_protected_type_definition6331);
					protected_type_body();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "protected_type_definition"



	// $ANTLR start "qualified_expression"
	// Vhdl.g:1131:1: qualified_expression : name TIC ( ( aggregate )=> aggregate | LPAREN expression RPAREN ) ;
	public final void qualified_expression() throws RecognitionException {
		try {
			// Vhdl.g:1132:3: ( name TIC ( ( aggregate )=> aggregate | LPAREN expression RPAREN ) )
			// Vhdl.g:1132:3: name TIC ( ( aggregate )=> aggregate | LPAREN expression RPAREN )
			{
			pushFollow(FOLLOW_name_in_qualified_expression6341);
			name();
			state._fsp--;
			if (state.failed) return;
			match(input,TIC,FOLLOW_TIC_in_qualified_expression6343); if (state.failed) return;
			// Vhdl.g:1133:2: ( ( aggregate )=> aggregate | LPAREN expression RPAREN )
			int alt188=2;
			int LA188_0 = input.LA(1);
			if ( (LA188_0==LPAREN) ) {
				int LA188_1 = input.LA(2);
				if ( (LA188_1==MINUS||LA188_1==PLUS) ) {
					int LA188_2 = input.LA(3);
					if ( (synpred52_Vhdl()) ) {
						alt188=1;
					}
					else if ( (true) ) {
						alt188=2;
					}

				}
				else if ( (LA188_1==BASIC_IDENTIFIER||LA188_1==EXTENDED_IDENTIFIER) ) {
					int LA188_3 = input.LA(3);
					if ( (synpred52_Vhdl()) ) {
						alt188=1;
					}
					else if ( (true) ) {
						alt188=2;
					}

				}
				else if ( (LA188_1==STRING_LITERAL) ) {
					int LA188_4 = input.LA(3);
					if ( (synpred52_Vhdl()) ) {
						alt188=1;
					}
					else if ( (true) ) {
						alt188=2;
					}

				}
				else if ( (LA188_1==LPAREN) ) {
					int LA188_5 = input.LA(3);
					if ( (synpred52_Vhdl()) ) {
						alt188=1;
					}
					else if ( (true) ) {
						alt188=2;
					}

				}
				else if ( (LA188_1==DECIMAL_LITERAL) ) {
					int LA188_6 = input.LA(3);
					if ( (synpred52_Vhdl()) ) {
						alt188=1;
					}
					else if ( (true) ) {
						alt188=2;
					}

				}
				else if ( (LA188_1==BASED_LITERAL) ) {
					int LA188_7 = input.LA(3);
					if ( (synpred52_Vhdl()) ) {
						alt188=1;
					}
					else if ( (true) ) {
						alt188=2;
					}

				}
				else if ( (LA188_1==CHARACTER_LITERAL) ) {
					int LA188_8 = input.LA(3);
					if ( (synpred52_Vhdl()) ) {
						alt188=1;
					}
					else if ( (true) ) {
						alt188=2;
					}

				}
				else if ( (LA188_1==BIT_STRING_LITERAL) ) {
					int LA188_9 = input.LA(3);
					if ( (synpred52_Vhdl()) ) {
						alt188=1;
					}
					else if ( (true) ) {
						alt188=2;
					}

				}
				else if ( (LA188_1==K_NULL) ) {
					int LA188_10 = input.LA(3);
					if ( (synpred52_Vhdl()) ) {
						alt188=1;
					}
					else if ( (true) ) {
						alt188=2;
					}

				}
				else if ( (LA188_1==K_NEW) ) {
					int LA188_11 = input.LA(3);
					if ( (synpred52_Vhdl()) ) {
						alt188=1;
					}
					else if ( (true) ) {
						alt188=2;
					}

				}
				else if ( (LA188_1==K_ABS) ) {
					int LA188_12 = input.LA(3);
					if ( (synpred52_Vhdl()) ) {
						alt188=1;
					}
					else if ( (true) ) {
						alt188=2;
					}

				}
				else if ( (LA188_1==K_NOT) ) {
					int LA188_13 = input.LA(3);
					if ( (synpred52_Vhdl()) ) {
						alt188=1;
					}
					else if ( (true) ) {
						alt188=2;
					}

				}
				else if ( (LA188_1==K_OTHERS) && (synpred52_Vhdl())) {
					alt188=1;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 188, 0, input);
				throw nvae;
			}

			switch (alt188) {
				case 1 :
					// Vhdl.g:1133:4: ( aggregate )=> aggregate
					{
					pushFollow(FOLLOW_aggregate_in_qualified_expression6353);
					aggregate();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:1134:5: LPAREN expression RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_qualified_expression6360); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_qualified_expression6362);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,RPAREN,FOLLOW_RPAREN_in_qualified_expression6364); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "qualified_expression"



	// $ANTLR start "range"
	// Vhdl.g:1138:1: range : ( ( simple_expression direction simple_expression )=> simple_expression direction simple_expression | name );
	public final void range() throws RecognitionException {
		try {
			// Vhdl.g:1139:5: ( ( simple_expression direction simple_expression )=> simple_expression direction simple_expression | name )
			int alt189=2;
			alt189 = dfa189.predict(input);
			switch (alt189) {
				case 1 :
					// Vhdl.g:1139:5: ( simple_expression direction simple_expression )=> simple_expression direction simple_expression
					{
					pushFollow(FOLLOW_simple_expression_in_range6390);
					simple_expression();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_direction_in_range6392);
					direction();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_simple_expression_in_range6394);
					simple_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:1141:5: name
					{
					pushFollow(FOLLOW_name_in_range6400);
					name();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "range"



	// $ANTLR start "range_constraint"
	// Vhdl.g:1144:1: range_constraint : K_RANGE range ;
	public final void range_constraint() throws RecognitionException {
		try {
			// Vhdl.g:1145:5: ( K_RANGE range )
			// Vhdl.g:1145:5: K_RANGE range
			{
			match(input,K_RANGE,FOLLOW_K_RANGE_in_range_constraint6411); if (state.failed) return;
			pushFollow(FOLLOW_range_in_range_constraint6413);
			range();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "range_constraint"



	// $ANTLR start "record_type_definition"
	// Vhdl.g:1148:1: record_type_definition : K_RECORD ( element_declaration )+ K_END K_RECORD ( simple_name )? ;
	public final void record_type_definition() throws RecognitionException {
		try {
			// Vhdl.g:1149:5: ( K_RECORD ( element_declaration )+ K_END K_RECORD ( simple_name )? )
			// Vhdl.g:1149:5: K_RECORD ( element_declaration )+ K_END K_RECORD ( simple_name )?
			{
			match(input,K_RECORD,FOLLOW_K_RECORD_in_record_type_definition6424); if (state.failed) return;
			// Vhdl.g:1149:14: ( element_declaration )+
			int cnt190=0;
			loop190:
			while (true) {
				int alt190=2;
				int LA190_0 = input.LA(1);
				if ( (LA190_0==BASIC_IDENTIFIER||LA190_0==EXTENDED_IDENTIFIER) ) {
					alt190=1;
				}

				switch (alt190) {
				case 1 :
					// Vhdl.g:1149:15: element_declaration
					{
					pushFollow(FOLLOW_element_declaration_in_record_type_definition6427);
					element_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt190 >= 1 ) break loop190;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(190, input);
					throw eee;
				}
				cnt190++;
			}

			match(input,K_END,FOLLOW_K_END_in_record_type_definition6439); if (state.failed) return;
			match(input,K_RECORD,FOLLOW_K_RECORD_in_record_type_definition6441); if (state.failed) return;
			// Vhdl.g:1150:24: ( simple_name )?
			int alt191=2;
			int LA191_0 = input.LA(1);
			if ( (LA191_0==BASIC_IDENTIFIER||LA191_0==EXTENDED_IDENTIFIER) ) {
				alt191=1;
			}
			switch (alt191) {
				case 1 :
					// Vhdl.g:1150:25: simple_name
					{
					pushFollow(FOLLOW_simple_name_in_record_type_definition6444);
					simple_name();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "record_type_definition"



	// $ANTLR start "relation"
	// Vhdl.g:1153:1: relation : shift_expression ( relational_operator shift_expression )? ;
	public final void relation() throws RecognitionException {
		try {
			// Vhdl.g:1154:5: ( shift_expression ( relational_operator shift_expression )? )
			// Vhdl.g:1154:5: shift_expression ( relational_operator shift_expression )?
			{
			pushFollow(FOLLOW_shift_expression_in_relation6457);
			shift_expression();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:1154:22: ( relational_operator shift_expression )?
			int alt192=2;
			int LA192_0 = input.LA(1);
			if ( (LA192_0==EQ||(LA192_0 >= GRT && LA192_0 <= GRTEQ)||(LA192_0 >= LST && LA192_0 <= LSTEQ)||LA192_0==SLASHEQ) ) {
				alt192=1;
			}
			switch (alt192) {
				case 1 :
					// Vhdl.g:1154:23: relational_operator shift_expression
					{
					pushFollow(FOLLOW_relational_operator_in_relation6460);
					relational_operator();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_shift_expression_in_relation6462);
					shift_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "relation"



	// $ANTLR start "relational_operator"
	// Vhdl.g:1157:1: relational_operator : ( EQ | SLASHEQ | LST | LSTEQ | GRT | GRTEQ );
	public final void relational_operator() throws RecognitionException {
		try {
			// Vhdl.g:1158:5: ( EQ | SLASHEQ | LST | LSTEQ | GRT | GRTEQ )
			// Vhdl.g:
			{
			if ( input.LA(1)==EQ||(input.LA(1) >= GRT && input.LA(1) <= GRTEQ)||(input.LA(1) >= LST && input.LA(1) <= LSTEQ)||input.LA(1)==SLASHEQ ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "relational_operator"



	// $ANTLR start "report_statement"
	// Vhdl.g:1166:1: report_statement : ( label_colon )? K_REPORT expression ( K_SEVERITY expression )? SEMI ;
	public final void report_statement() throws RecognitionException {
		try {
			// Vhdl.g:1167:5: ( ( label_colon )? K_REPORT expression ( K_SEVERITY expression )? SEMI )
			// Vhdl.g:1167:5: ( label_colon )? K_REPORT expression ( K_SEVERITY expression )? SEMI
			{
			// Vhdl.g:1167:5: ( label_colon )?
			int alt193=2;
			int LA193_0 = input.LA(1);
			if ( (LA193_0==BASIC_IDENTIFIER||LA193_0==EXTENDED_IDENTIFIER) ) {
				alt193=1;
			}
			switch (alt193) {
				case 1 :
					// Vhdl.g:1167:6: label_colon
					{
					pushFollow(FOLLOW_label_colon_in_report_statement6529);
					label_colon();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,K_REPORT,FOLLOW_K_REPORT_in_report_statement6534); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_report_statement6536);
			expression();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:1167:41: ( K_SEVERITY expression )?
			int alt194=2;
			int LA194_0 = input.LA(1);
			if ( (LA194_0==K_SEVERITY) ) {
				alt194=1;
			}
			switch (alt194) {
				case 1 :
					// Vhdl.g:1167:42: K_SEVERITY expression
					{
					match(input,K_SEVERITY,FOLLOW_K_SEVERITY_in_report_statement6539); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_report_statement6541);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,SEMI,FOLLOW_SEMI_in_report_statement6545); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "report_statement"



	// $ANTLR start "return_statement"
	// Vhdl.g:1170:1: return_statement : ( label_colon )? K_RETURN ( expression )? SEMI ;
	public final void return_statement() throws RecognitionException {
		try {
			// Vhdl.g:1171:5: ( ( label_colon )? K_RETURN ( expression )? SEMI )
			// Vhdl.g:1171:5: ( label_colon )? K_RETURN ( expression )? SEMI
			{
			// Vhdl.g:1171:5: ( label_colon )?
			int alt195=2;
			int LA195_0 = input.LA(1);
			if ( (LA195_0==BASIC_IDENTIFIER||LA195_0==EXTENDED_IDENTIFIER) ) {
				alt195=1;
			}
			switch (alt195) {
				case 1 :
					// Vhdl.g:1171:6: label_colon
					{
					pushFollow(FOLLOW_label_colon_in_return_statement6557);
					label_colon();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,K_RETURN,FOLLOW_K_RETURN_in_return_statement6561); if (state.failed) return;
			// Vhdl.g:1171:29: ( expression )?
			int alt196=2;
			int LA196_0 = input.LA(1);
			if ( (LA196_0==BASED_LITERAL||(LA196_0 >= BASIC_IDENTIFIER && LA196_0 <= BIT_STRING_LITERAL)||LA196_0==CHARACTER_LITERAL||LA196_0==DECIMAL_LITERAL||LA196_0==EXTENDED_IDENTIFIER||LA196_0==K_ABS||LA196_0==K_NEW||(LA196_0 >= K_NOT && LA196_0 <= K_NULL)||LA196_0==LPAREN||LA196_0==MINUS||LA196_0==PLUS||LA196_0==STRING_LITERAL) ) {
				alt196=1;
			}
			switch (alt196) {
				case 1 :
					// Vhdl.g:1171:30: expression
					{
					pushFollow(FOLLOW_expression_in_return_statement6564);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,SEMI,FOLLOW_SEMI_in_return_statement6568); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "return_statement"



	// $ANTLR start "scalar_type_definition"
	// Vhdl.g:1174:1: scalar_type_definition : ( enumeration_type_definition | ( range_constraint )=> range_constraint | physical_type_definition );
	public final void scalar_type_definition() throws RecognitionException {
		try {
			// Vhdl.g:1175:5: ( enumeration_type_definition | ( range_constraint )=> range_constraint | physical_type_definition )
			int alt197=3;
			int LA197_0 = input.LA(1);
			if ( (LA197_0==LPAREN) ) {
				alt197=1;
			}
			else if ( (LA197_0==K_RANGE) ) {
				switch ( input.LA(2) ) {
				case MINUS:
				case PLUS:
					{
					int LA197_3 = input.LA(3);
					if ( (synpred54_Vhdl()) ) {
						alt197=2;
					}
					else if ( (true) ) {
						alt197=3;
					}

					}
					break;
				case BASIC_IDENTIFIER:
				case EXTENDED_IDENTIFIER:
					{
					int LA197_4 = input.LA(3);
					if ( (synpred54_Vhdl()) ) {
						alt197=2;
					}
					else if ( (true) ) {
						alt197=3;
					}

					}
					break;
				case STRING_LITERAL:
					{
					int LA197_5 = input.LA(3);
					if ( (synpred54_Vhdl()) ) {
						alt197=2;
					}
					else if ( (true) ) {
						alt197=3;
					}

					}
					break;
				case LPAREN:
					{
					int LA197_6 = input.LA(3);
					if ( (synpred54_Vhdl()) ) {
						alt197=2;
					}
					else if ( (true) ) {
						alt197=3;
					}

					}
					break;
				case DECIMAL_LITERAL:
					{
					int LA197_7 = input.LA(3);
					if ( (synpred54_Vhdl()) ) {
						alt197=2;
					}
					else if ( (true) ) {
						alt197=3;
					}

					}
					break;
				case BASED_LITERAL:
					{
					int LA197_8 = input.LA(3);
					if ( (synpred54_Vhdl()) ) {
						alt197=2;
					}
					else if ( (true) ) {
						alt197=3;
					}

					}
					break;
				case CHARACTER_LITERAL:
					{
					int LA197_9 = input.LA(3);
					if ( (synpred54_Vhdl()) ) {
						alt197=2;
					}
					else if ( (true) ) {
						alt197=3;
					}

					}
					break;
				case BIT_STRING_LITERAL:
					{
					int LA197_10 = input.LA(3);
					if ( (synpred54_Vhdl()) ) {
						alt197=2;
					}
					else if ( (true) ) {
						alt197=3;
					}

					}
					break;
				case K_NULL:
					{
					int LA197_11 = input.LA(3);
					if ( (synpred54_Vhdl()) ) {
						alt197=2;
					}
					else if ( (true) ) {
						alt197=3;
					}

					}
					break;
				case K_NEW:
					{
					int LA197_12 = input.LA(3);
					if ( (synpred54_Vhdl()) ) {
						alt197=2;
					}
					else if ( (true) ) {
						alt197=3;
					}

					}
					break;
				case K_ABS:
					{
					int LA197_13 = input.LA(3);
					if ( (synpred54_Vhdl()) ) {
						alt197=2;
					}
					else if ( (true) ) {
						alt197=3;
					}

					}
					break;
				case K_NOT:
					{
					int LA197_14 = input.LA(3);
					if ( (synpred54_Vhdl()) ) {
						alt197=2;
					}
					else if ( (true) ) {
						alt197=3;
					}

					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 197, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 197, 0, input);
				throw nvae;
			}

			switch (alt197) {
				case 1 :
					// Vhdl.g:1175:5: enumeration_type_definition
					{
					pushFollow(FOLLOW_enumeration_type_definition_in_scalar_type_definition6579);
					enumeration_type_definition();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:1176:5: ( range_constraint )=> range_constraint
					{
					pushFollow(FOLLOW_range_constraint_in_scalar_type_definition6591);
					range_constraint();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Vhdl.g:1177:5: physical_type_definition
					{
					pushFollow(FOLLOW_physical_type_definition_in_scalar_type_definition6597);
					physical_type_definition();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "scalar_type_definition"



	// $ANTLR start "secondary_unit"
	// Vhdl.g:1180:1: secondary_unit : ( architecture_body | package_body );
	public final void secondary_unit() throws RecognitionException {
		try {
			// Vhdl.g:1181:5: ( architecture_body | package_body )
			int alt198=2;
			int LA198_0 = input.LA(1);
			if ( (LA198_0==K_ARCHITECTURE) ) {
				alt198=1;
			}
			else if ( (LA198_0==K_PACKAGE) ) {
				alt198=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 198, 0, input);
				throw nvae;
			}

			switch (alt198) {
				case 1 :
					// Vhdl.g:1181:5: architecture_body
					{
					pushFollow(FOLLOW_architecture_body_in_secondary_unit6608);
					architecture_body();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:1182:5: package_body
					{
					pushFollow(FOLLOW_package_body_in_secondary_unit6614);
					package_body();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "secondary_unit"



	// $ANTLR start "secondary_unit_declaration"
	// Vhdl.g:1185:1: secondary_unit_declaration : identifier EQ physical_literal SEMI ;
	public final void secondary_unit_declaration() throws RecognitionException {
		try {
			// Vhdl.g:1186:5: ( identifier EQ physical_literal SEMI )
			// Vhdl.g:1186:5: identifier EQ physical_literal SEMI
			{
			pushFollow(FOLLOW_identifier_in_secondary_unit_declaration6625);
			identifier();
			state._fsp--;
			if (state.failed) return;
			match(input,EQ,FOLLOW_EQ_in_secondary_unit_declaration6627); if (state.failed) return;
			pushFollow(FOLLOW_physical_literal_in_secondary_unit_declaration6629);
			physical_literal();
			state._fsp--;
			if (state.failed) return;
			match(input,SEMI,FOLLOW_SEMI_in_secondary_unit_declaration6631); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "secondary_unit_declaration"



	// $ANTLR start "selected_signal_assignment"
	// Vhdl.g:1189:1: selected_signal_assignment : K_WITH expression K_SELECT target LSTEQ voptions selected_waveforms SEMI ;
	public final void selected_signal_assignment() throws RecognitionException {
		try {
			// Vhdl.g:1190:5: ( K_WITH expression K_SELECT target LSTEQ voptions selected_waveforms SEMI )
			// Vhdl.g:1190:5: K_WITH expression K_SELECT target LSTEQ voptions selected_waveforms SEMI
			{
			match(input,K_WITH,FOLLOW_K_WITH_in_selected_signal_assignment6642); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_selected_signal_assignment6644);
			expression();
			state._fsp--;
			if (state.failed) return;
			match(input,K_SELECT,FOLLOW_K_SELECT_in_selected_signal_assignment6646); if (state.failed) return;
			pushFollow(FOLLOW_target_in_selected_signal_assignment6648);
			target();
			state._fsp--;
			if (state.failed) return;
			match(input,LSTEQ,FOLLOW_LSTEQ_in_selected_signal_assignment6650); if (state.failed) return;
			pushFollow(FOLLOW_voptions_in_selected_signal_assignment6652);
			voptions();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_selected_waveforms_in_selected_signal_assignment6654);
			selected_waveforms();
			state._fsp--;
			if (state.failed) return;
			match(input,SEMI,FOLLOW_SEMI_in_selected_signal_assignment6656); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "selected_signal_assignment"



	// $ANTLR start "selected_waveforms"
	// Vhdl.g:1193:1: selected_waveforms : waveform K_WHEN choices ( COMMA waveform K_WHEN choices )* ;
	public final void selected_waveforms() throws RecognitionException {
		try {
			// Vhdl.g:1194:5: ( waveform K_WHEN choices ( COMMA waveform K_WHEN choices )* )
			// Vhdl.g:1194:5: waveform K_WHEN choices ( COMMA waveform K_WHEN choices )*
			{
			pushFollow(FOLLOW_waveform_in_selected_waveforms6667);
			waveform();
			state._fsp--;
			if (state.failed) return;
			match(input,K_WHEN,FOLLOW_K_WHEN_in_selected_waveforms6669); if (state.failed) return;
			pushFollow(FOLLOW_choices_in_selected_waveforms6671);
			choices();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:1194:29: ( COMMA waveform K_WHEN choices )*
			loop199:
			while (true) {
				int alt199=2;
				int LA199_0 = input.LA(1);
				if ( (LA199_0==COMMA) ) {
					alt199=1;
				}

				switch (alt199) {
				case 1 :
					// Vhdl.g:1194:30: COMMA waveform K_WHEN choices
					{
					match(input,COMMA,FOLLOW_COMMA_in_selected_waveforms6674); if (state.failed) return;
					pushFollow(FOLLOW_waveform_in_selected_waveforms6676);
					waveform();
					state._fsp--;
					if (state.failed) return;
					match(input,K_WHEN,FOLLOW_K_WHEN_in_selected_waveforms6678); if (state.failed) return;
					pushFollow(FOLLOW_choices_in_selected_waveforms6680);
					choices();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop199;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "selected_waveforms"



	// $ANTLR start "sensitivity_clause"
	// Vhdl.g:1197:1: sensitivity_clause : K_ON sensitivity_list ;
	public final void sensitivity_clause() throws RecognitionException {
		try {
			// Vhdl.g:1198:5: ( K_ON sensitivity_list )
			// Vhdl.g:1198:5: K_ON sensitivity_list
			{
			match(input,K_ON,FOLLOW_K_ON_in_sensitivity_clause6693); if (state.failed) return;
			pushFollow(FOLLOW_sensitivity_list_in_sensitivity_clause6695);
			sensitivity_list();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sensitivity_clause"



	// $ANTLR start "sensitivity_list"
	// Vhdl.g:1201:1: sensitivity_list : name ( COMMA name )* ;
	public final void sensitivity_list() throws RecognitionException {
		try {
			// Vhdl.g:1202:5: ( name ( COMMA name )* )
			// Vhdl.g:1202:5: name ( COMMA name )*
			{
			pushFollow(FOLLOW_name_in_sensitivity_list6706);
			name();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:1202:10: ( COMMA name )*
			loop200:
			while (true) {
				int alt200=2;
				int LA200_0 = input.LA(1);
				if ( (LA200_0==COMMA) ) {
					alt200=1;
				}

				switch (alt200) {
				case 1 :
					// Vhdl.g:1202:11: COMMA name
					{
					match(input,COMMA,FOLLOW_COMMA_in_sensitivity_list6709); if (state.failed) return;
					pushFollow(FOLLOW_name_in_sensitivity_list6711);
					name();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop200;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sensitivity_list"



	// $ANTLR start "sequence_of_statements"
	// Vhdl.g:1205:1: sequence_of_statements : ( sequential_statement )* ;
	public final void sequence_of_statements() throws RecognitionException {
		try {
			// Vhdl.g:1206:5: ( ( sequential_statement )* )
			// Vhdl.g:1206:5: ( sequential_statement )*
			{
			// Vhdl.g:1206:5: ( sequential_statement )*
			loop201:
			while (true) {
				int alt201=2;
				int LA201_0 = input.LA(1);
				if ( (LA201_0==BASIC_IDENTIFIER||LA201_0==EXTENDED_IDENTIFIER||LA201_0==K_ASSERT||LA201_0==K_CASE||LA201_0==K_EXIT||LA201_0==K_FOR||LA201_0==K_IF||LA201_0==K_LOOP||LA201_0==K_NEXT||LA201_0==K_NULL||(LA201_0 >= K_REPORT && LA201_0 <= K_RETURN)||LA201_0==K_WAIT||LA201_0==K_WHILE||LA201_0==LPAREN||LA201_0==STRING_LITERAL) ) {
					alt201=1;
				}

				switch (alt201) {
				case 1 :
					// Vhdl.g:1206:6: sequential_statement
					{
					pushFollow(FOLLOW_sequential_statement_in_sequence_of_statements6725);
					sequential_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop201;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sequence_of_statements"



	// $ANTLR start "sequential_statement"
	// Vhdl.g:1209:1: sequential_statement : ( ( ( label_colon )? K_WAIT )=> wait_statement | ( ( label_colon )? K_ASSERT )=> assertion_statement | ( ( label_colon )? K_REPORT )=> report_statement | ( ( label_colon )? K_IF )=> if_statement | ( ( label_colon )? K_CASE )=> case_statement | ( ( label_colon )? K_NEXT )=> next_statement | ( ( label_colon )? K_EXIT )=> exit_statement | ( ( label_colon )? K_RETURN )=> return_statement | ( ( label_colon )? K_NULL )=> null_statement | ( loop_statement )=> loop_statement | ( procedure_call_statement )=> procedure_call_statement | ( variable_assignment_statement )=> variable_assignment_statement | signal_assignment_statement );
	public final void sequential_statement() throws RecognitionException {
		try {
			// Vhdl.g:1210:5: ( ( ( label_colon )? K_WAIT )=> wait_statement | ( ( label_colon )? K_ASSERT )=> assertion_statement | ( ( label_colon )? K_REPORT )=> report_statement | ( ( label_colon )? K_IF )=> if_statement | ( ( label_colon )? K_CASE )=> case_statement | ( ( label_colon )? K_NEXT )=> next_statement | ( ( label_colon )? K_EXIT )=> exit_statement | ( ( label_colon )? K_RETURN )=> return_statement | ( ( label_colon )? K_NULL )=> null_statement | ( loop_statement )=> loop_statement | ( procedure_call_statement )=> procedure_call_statement | ( variable_assignment_statement )=> variable_assignment_statement | signal_assignment_statement )
			int alt202=13;
			int LA202_0 = input.LA(1);
			if ( (LA202_0==BASIC_IDENTIFIER||LA202_0==EXTENDED_IDENTIFIER) ) {
				int LA202_1 = input.LA(2);
				if ( (LA202_1==COLON) ) {
					int LA202_16 = input.LA(3);
					if ( (synpred55_Vhdl()) ) {
						alt202=1;
					}
					else if ( (synpred56_Vhdl()) ) {
						alt202=2;
					}
					else if ( (synpred57_Vhdl()) ) {
						alt202=3;
					}
					else if ( (synpred58_Vhdl()) ) {
						alt202=4;
					}
					else if ( (synpred59_Vhdl()) ) {
						alt202=5;
					}
					else if ( (synpred60_Vhdl()) ) {
						alt202=6;
					}
					else if ( (synpred61_Vhdl()) ) {
						alt202=7;
					}
					else if ( (synpred62_Vhdl()) ) {
						alt202=8;
					}
					else if ( (synpred63_Vhdl()) ) {
						alt202=9;
					}
					else if ( (synpred64_Vhdl()) ) {
						alt202=10;
					}
					else if ( (synpred65_Vhdl()) ) {
						alt202=11;
					}
					else if ( (synpred66_Vhdl()) ) {
						alt202=12;
					}
					else if ( (true) ) {
						alt202=13;
					}

				}
				else if ( (LA202_1==DOT) ) {
					int LA202_17 = input.LA(3);
					if ( (synpred65_Vhdl()) ) {
						alt202=11;
					}
					else if ( (synpred66_Vhdl()) ) {
						alt202=12;
					}
					else if ( (true) ) {
						alt202=13;
					}

				}
				else if ( (LA202_1==TIC) ) {
					int LA202_18 = input.LA(3);
					if ( (synpred65_Vhdl()) ) {
						alt202=11;
					}
					else if ( (synpred66_Vhdl()) ) {
						alt202=12;
					}
					else if ( (true) ) {
						alt202=13;
					}

				}
				else if ( (LA202_1==LBRACK) ) {
					int LA202_19 = input.LA(3);
					if ( (synpred65_Vhdl()) ) {
						alt202=11;
					}
					else if ( (synpred66_Vhdl()) ) {
						alt202=12;
					}
					else if ( (true) ) {
						alt202=13;
					}

				}
				else if ( (LA202_1==TIC_SIMPLE_NAME) ) {
					int LA202_20 = input.LA(3);
					if ( (synpred65_Vhdl()) ) {
						alt202=11;
					}
					else if ( (synpred66_Vhdl()) ) {
						alt202=12;
					}
					else if ( (true) ) {
						alt202=13;
					}

				}
				else if ( (LA202_1==LPAREN) ) {
					int LA202_21 = input.LA(3);
					if ( (synpred65_Vhdl()) ) {
						alt202=11;
					}
					else if ( (synpred66_Vhdl()) ) {
						alt202=12;
					}
					else if ( (true) ) {
						alt202=13;
					}

				}
				else if ( (LA202_1==SEMI) && (synpred65_Vhdl())) {
					alt202=11;
				}
				else if ( (LA202_1==COLONEQ) && (synpred66_Vhdl())) {
					alt202=12;
				}
				else if ( (LA202_1==LSTEQ) ) {
					alt202=13;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 202, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA202_0==K_WAIT) && (synpred55_Vhdl())) {
				alt202=1;
			}
			else if ( (LA202_0==K_ASSERT) && (synpred56_Vhdl())) {
				alt202=2;
			}
			else if ( (LA202_0==K_REPORT) && (synpred57_Vhdl())) {
				alt202=3;
			}
			else if ( (LA202_0==K_IF) && (synpred58_Vhdl())) {
				alt202=4;
			}
			else if ( (LA202_0==K_CASE) && (synpred59_Vhdl())) {
				alt202=5;
			}
			else if ( (LA202_0==K_NEXT) && (synpred60_Vhdl())) {
				alt202=6;
			}
			else if ( (LA202_0==K_EXIT) && (synpred61_Vhdl())) {
				alt202=7;
			}
			else if ( (LA202_0==K_RETURN) && (synpred62_Vhdl())) {
				alt202=8;
			}
			else if ( (LA202_0==K_NULL) && (synpred63_Vhdl())) {
				alt202=9;
			}
			else if ( (LA202_0==K_WHILE) && (synpred64_Vhdl())) {
				alt202=10;
			}
			else if ( (LA202_0==K_FOR) && (synpred64_Vhdl())) {
				alt202=10;
			}
			else if ( (LA202_0==K_LOOP) && (synpred64_Vhdl())) {
				alt202=10;
			}
			else if ( (LA202_0==STRING_LITERAL) ) {
				int LA202_14 = input.LA(2);
				if ( (LA202_14==DOT) ) {
					int LA202_25 = input.LA(3);
					if ( (synpred65_Vhdl()) ) {
						alt202=11;
					}
					else if ( (synpred66_Vhdl()) ) {
						alt202=12;
					}
					else if ( (true) ) {
						alt202=13;
					}

				}
				else if ( (LA202_14==TIC) ) {
					int LA202_26 = input.LA(3);
					if ( (synpred65_Vhdl()) ) {
						alt202=11;
					}
					else if ( (synpred66_Vhdl()) ) {
						alt202=12;
					}
					else if ( (true) ) {
						alt202=13;
					}

				}
				else if ( (LA202_14==LBRACK) ) {
					int LA202_27 = input.LA(3);
					if ( (synpred65_Vhdl()) ) {
						alt202=11;
					}
					else if ( (synpred66_Vhdl()) ) {
						alt202=12;
					}
					else if ( (true) ) {
						alt202=13;
					}

				}
				else if ( (LA202_14==TIC_SIMPLE_NAME) ) {
					int LA202_28 = input.LA(3);
					if ( (synpred65_Vhdl()) ) {
						alt202=11;
					}
					else if ( (synpred66_Vhdl()) ) {
						alt202=12;
					}
					else if ( (true) ) {
						alt202=13;
					}

				}
				else if ( (LA202_14==LPAREN) ) {
					int LA202_29 = input.LA(3);
					if ( (synpred65_Vhdl()) ) {
						alt202=11;
					}
					else if ( (synpred66_Vhdl()) ) {
						alt202=12;
					}
					else if ( (true) ) {
						alt202=13;
					}

				}
				else if ( (LA202_14==SEMI) && (synpred65_Vhdl())) {
					alt202=11;
				}
				else if ( (LA202_14==COLONEQ) && (synpred66_Vhdl())) {
					alt202=12;
				}
				else if ( (LA202_14==LSTEQ) ) {
					alt202=13;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 202, 14, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA202_0==LPAREN) ) {
				switch ( input.LA(2) ) {
				case MINUS:
				case PLUS:
					{
					int LA202_33 = input.LA(3);
					if ( (synpred66_Vhdl()) ) {
						alt202=12;
					}
					else if ( (true) ) {
						alt202=13;
					}

					}
					break;
				case BASIC_IDENTIFIER:
				case EXTENDED_IDENTIFIER:
					{
					int LA202_34 = input.LA(3);
					if ( (synpred66_Vhdl()) ) {
						alt202=12;
					}
					else if ( (true) ) {
						alt202=13;
					}

					}
					break;
				case STRING_LITERAL:
					{
					int LA202_35 = input.LA(3);
					if ( (synpred66_Vhdl()) ) {
						alt202=12;
					}
					else if ( (true) ) {
						alt202=13;
					}

					}
					break;
				case LPAREN:
					{
					int LA202_36 = input.LA(3);
					if ( (synpred66_Vhdl()) ) {
						alt202=12;
					}
					else if ( (true) ) {
						alt202=13;
					}

					}
					break;
				case DECIMAL_LITERAL:
					{
					int LA202_37 = input.LA(3);
					if ( (synpred66_Vhdl()) ) {
						alt202=12;
					}
					else if ( (true) ) {
						alt202=13;
					}

					}
					break;
				case BASED_LITERAL:
					{
					int LA202_38 = input.LA(3);
					if ( (synpred66_Vhdl()) ) {
						alt202=12;
					}
					else if ( (true) ) {
						alt202=13;
					}

					}
					break;
				case CHARACTER_LITERAL:
					{
					int LA202_39 = input.LA(3);
					if ( (synpred66_Vhdl()) ) {
						alt202=12;
					}
					else if ( (true) ) {
						alt202=13;
					}

					}
					break;
				case BIT_STRING_LITERAL:
					{
					int LA202_40 = input.LA(3);
					if ( (synpred66_Vhdl()) ) {
						alt202=12;
					}
					else if ( (true) ) {
						alt202=13;
					}

					}
					break;
				case K_NULL:
					{
					int LA202_41 = input.LA(3);
					if ( (synpred66_Vhdl()) ) {
						alt202=12;
					}
					else if ( (true) ) {
						alt202=13;
					}

					}
					break;
				case K_NEW:
					{
					int LA202_42 = input.LA(3);
					if ( (synpred66_Vhdl()) ) {
						alt202=12;
					}
					else if ( (true) ) {
						alt202=13;
					}

					}
					break;
				case K_ABS:
					{
					int LA202_43 = input.LA(3);
					if ( (synpred66_Vhdl()) ) {
						alt202=12;
					}
					else if ( (true) ) {
						alt202=13;
					}

					}
					break;
				case K_NOT:
					{
					int LA202_44 = input.LA(3);
					if ( (synpred66_Vhdl()) ) {
						alt202=12;
					}
					else if ( (true) ) {
						alt202=13;
					}

					}
					break;
				case K_OTHERS:
					{
					int LA202_45 = input.LA(3);
					if ( (synpred66_Vhdl()) ) {
						alt202=12;
					}
					else if ( (true) ) {
						alt202=13;
					}

					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 202, 15, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 202, 0, input);
				throw nvae;
			}

			switch (alt202) {
				case 1 :
					// Vhdl.g:1210:5: ( ( label_colon )? K_WAIT )=> wait_statement
					{
					pushFollow(FOLLOW_wait_statement_in_sequential_statement6748);
					wait_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:1211:5: ( ( label_colon )? K_ASSERT )=> assertion_statement
					{
					pushFollow(FOLLOW_assertion_statement_in_sequential_statement6765);
					assertion_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Vhdl.g:1212:5: ( ( label_colon )? K_REPORT )=> report_statement
					{
					pushFollow(FOLLOW_report_statement_in_sequential_statement6782);
					report_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// Vhdl.g:1213:5: ( ( label_colon )? K_IF )=> if_statement
					{
					pushFollow(FOLLOW_if_statement_in_sequential_statement6799);
					if_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// Vhdl.g:1214:5: ( ( label_colon )? K_CASE )=> case_statement
					{
					pushFollow(FOLLOW_case_statement_in_sequential_statement6816);
					case_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// Vhdl.g:1215:5: ( ( label_colon )? K_NEXT )=> next_statement
					{
					pushFollow(FOLLOW_next_statement_in_sequential_statement6833);
					next_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// Vhdl.g:1216:5: ( ( label_colon )? K_EXIT )=> exit_statement
					{
					pushFollow(FOLLOW_exit_statement_in_sequential_statement6850);
					exit_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// Vhdl.g:1217:5: ( ( label_colon )? K_RETURN )=> return_statement
					{
					pushFollow(FOLLOW_return_statement_in_sequential_statement6867);
					return_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 9 :
					// Vhdl.g:1218:5: ( ( label_colon )? K_NULL )=> null_statement
					{
					pushFollow(FOLLOW_null_statement_in_sequential_statement6884);
					null_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 10 :
					// Vhdl.g:1219:5: ( loop_statement )=> loop_statement
					{
					pushFollow(FOLLOW_loop_statement_in_sequential_statement6896);
					loop_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 11 :
					// Vhdl.g:1220:5: ( procedure_call_statement )=> procedure_call_statement
					{
					pushFollow(FOLLOW_procedure_call_statement_in_sequential_statement6909);
					procedure_call_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 12 :
					// Vhdl.g:1221:5: ( variable_assignment_statement )=> variable_assignment_statement
					{
					pushFollow(FOLLOW_variable_assignment_statement_in_sequential_statement6921);
					variable_assignment_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 13 :
					// Vhdl.g:1222:5: signal_assignment_statement
					{
					pushFollow(FOLLOW_signal_assignment_statement_in_sequential_statement6928);
					signal_assignment_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sequential_statement"



	// $ANTLR start "shift_expression"
	// Vhdl.g:1225:1: shift_expression : simple_expression ( shift_operator simple_expression )? ;
	public final void shift_expression() throws RecognitionException {
		try {
			// Vhdl.g:1226:5: ( simple_expression ( shift_operator simple_expression )? )
			// Vhdl.g:1226:5: simple_expression ( shift_operator simple_expression )?
			{
			pushFollow(FOLLOW_simple_expression_in_shift_expression6940);
			simple_expression();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:1226:23: ( shift_operator simple_expression )?
			int alt203=2;
			int LA203_0 = input.LA(1);
			if ( ((LA203_0 >= K_ROL && LA203_0 <= K_ROR)||(LA203_0 >= K_SLA && LA203_0 <= K_SRL)) ) {
				alt203=1;
			}
			switch (alt203) {
				case 1 :
					// Vhdl.g:1226:24: shift_operator simple_expression
					{
					pushFollow(FOLLOW_shift_operator_in_shift_expression6943);
					shift_operator();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_simple_expression_in_shift_expression6945);
					simple_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "shift_expression"



	// $ANTLR start "shift_operator"
	// Vhdl.g:1229:1: shift_operator : ( K_SLL | K_SRL | K_SLA | K_SRA | K_ROL | K_ROR );
	public final void shift_operator() throws RecognitionException {
		try {
			// Vhdl.g:1230:5: ( K_SLL | K_SRL | K_SLA | K_SRA | K_ROL | K_ROR )
			// Vhdl.g:
			{
			if ( (input.LA(1) >= K_ROL && input.LA(1) <= K_ROR)||(input.LA(1) >= K_SLA && input.LA(1) <= K_SRL) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "shift_operator"



	// $ANTLR start "sign"
	// Vhdl.g:1238:1: sign : ( PLUS | MINUS );
	public final void sign() throws RecognitionException {
		try {
			// Vhdl.g:1239:5: ( PLUS | MINUS )
			// Vhdl.g:
			{
			if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sign"



	// $ANTLR start "signal_assignment_statement"
	// Vhdl.g:1243:1: signal_assignment_statement : ( options {greedy=true; } : label_colon )? target LSTEQ ( delay_mechanism )? waveform SEMI ;
	public final void signal_assignment_statement() throws RecognitionException {
		try {
			// Vhdl.g:1244:5: ( ( options {greedy=true; } : label_colon )? target LSTEQ ( delay_mechanism )? waveform SEMI )
			// Vhdl.g:1244:5: ( options {greedy=true; } : label_colon )? target LSTEQ ( delay_mechanism )? waveform SEMI
			{
			// Vhdl.g:1244:5: ( options {greedy=true; } : label_colon )?
			int alt204=2;
			int LA204_0 = input.LA(1);
			if ( (LA204_0==BASIC_IDENTIFIER||LA204_0==EXTENDED_IDENTIFIER) ) {
				int LA204_1 = input.LA(2);
				if ( (LA204_1==COLON) ) {
					alt204=1;
				}
			}
			switch (alt204) {
				case 1 :
					// Vhdl.g:1244:29: label_colon
					{
					pushFollow(FOLLOW_label_colon_in_signal_assignment_statement7025);
					label_colon();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_target_in_signal_assignment_statement7029);
			target();
			state._fsp--;
			if (state.failed) return;
			match(input,LSTEQ,FOLLOW_LSTEQ_in_signal_assignment_statement7034); if (state.failed) return;
			// Vhdl.g:1245:9: ( delay_mechanism )?
			int alt205=2;
			int LA205_0 = input.LA(1);
			if ( (LA205_0==K_INERTIAL||LA205_0==K_REJECT||LA205_0==K_TRANSPORT) ) {
				alt205=1;
			}
			switch (alt205) {
				case 1 :
					// Vhdl.g:1245:10: delay_mechanism
					{
					pushFollow(FOLLOW_delay_mechanism_in_signal_assignment_statement7037);
					delay_mechanism();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_waveform_in_signal_assignment_statement7041);
			waveform();
			state._fsp--;
			if (state.failed) return;
			match(input,SEMI,FOLLOW_SEMI_in_signal_assignment_statement7043); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "signal_assignment_statement"



	// $ANTLR start "signal_declaration"
	// Vhdl.g:1248:1: signal_declaration : K_SIGNAL identifier_list COLON subtype_indication ( signal_kind )? ( COLONEQ expression )? SEMI ;
	public final void signal_declaration() throws RecognitionException {
		try {
			// Vhdl.g:1249:5: ( K_SIGNAL identifier_list COLON subtype_indication ( signal_kind )? ( COLONEQ expression )? SEMI )
			// Vhdl.g:1249:5: K_SIGNAL identifier_list COLON subtype_indication ( signal_kind )? ( COLONEQ expression )? SEMI
			{
			match(input,K_SIGNAL,FOLLOW_K_SIGNAL_in_signal_declaration7054); if (state.failed) return;
			pushFollow(FOLLOW_identifier_list_in_signal_declaration7056);
			identifier_list();
			state._fsp--;
			if (state.failed) return;
			match(input,COLON,FOLLOW_COLON_in_signal_declaration7058); if (state.failed) return;
			pushFollow(FOLLOW_subtype_indication_in_signal_declaration7060);
			subtype_indication();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:1249:55: ( signal_kind )?
			int alt206=2;
			int LA206_0 = input.LA(1);
			if ( (LA206_0==K_BUS||LA206_0==K_REGISTER) ) {
				alt206=1;
			}
			switch (alt206) {
				case 1 :
					// Vhdl.g:1249:56: signal_kind
					{
					pushFollow(FOLLOW_signal_kind_in_signal_declaration7063);
					signal_kind();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// Vhdl.g:1250:9: ( COLONEQ expression )?
			int alt207=2;
			int LA207_0 = input.LA(1);
			if ( (LA207_0==COLONEQ) ) {
				alt207=1;
			}
			switch (alt207) {
				case 1 :
					// Vhdl.g:1250:10: COLONEQ expression
					{
					match(input,COLONEQ,FOLLOW_COLONEQ_in_signal_declaration7077); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_signal_declaration7079);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,SEMI,FOLLOW_SEMI_in_signal_declaration7083); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "signal_declaration"



	// $ANTLR start "signal_kind"
	// Vhdl.g:1253:1: signal_kind : ( K_REGISTER | K_BUS );
	public final void signal_kind() throws RecognitionException {
		try {
			// Vhdl.g:1254:5: ( K_REGISTER | K_BUS )
			// Vhdl.g:
			{
			if ( input.LA(1)==K_BUS||input.LA(1)==K_REGISTER ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "signal_kind"



	// $ANTLR start "signal_list"
	// Vhdl.g:1258:1: signal_list : ( name ( COMMA name )* | K_OTHERS | K_ALL );
	public final void signal_list() throws RecognitionException {
		try {
			// Vhdl.g:1259:5: ( name ( COMMA name )* | K_OTHERS | K_ALL )
			int alt209=3;
			switch ( input.LA(1) ) {
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
			case STRING_LITERAL:
				{
				alt209=1;
				}
				break;
			case K_OTHERS:
				{
				alt209=2;
				}
				break;
			case K_ALL:
				{
				alt209=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 209, 0, input);
				throw nvae;
			}
			switch (alt209) {
				case 1 :
					// Vhdl.g:1259:5: name ( COMMA name )*
					{
					pushFollow(FOLLOW_name_in_signal_list7112);
					name();
					state._fsp--;
					if (state.failed) return;
					// Vhdl.g:1259:10: ( COMMA name )*
					loop208:
					while (true) {
						int alt208=2;
						int LA208_0 = input.LA(1);
						if ( (LA208_0==COMMA) ) {
							alt208=1;
						}

						switch (alt208) {
						case 1 :
							// Vhdl.g:1259:11: COMMA name
							{
							match(input,COMMA,FOLLOW_COMMA_in_signal_list7115); if (state.failed) return;
							pushFollow(FOLLOW_name_in_signal_list7117);
							name();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop208;
						}
					}

					}
					break;
				case 2 :
					// Vhdl.g:1260:5: K_OTHERS
					{
					match(input,K_OTHERS,FOLLOW_K_OTHERS_in_signal_list7125); if (state.failed) return;
					}
					break;
				case 3 :
					// Vhdl.g:1261:5: K_ALL
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_signal_list7131); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "signal_list"



	// $ANTLR start "signature"
	// Vhdl.g:1264:1: signature : LBRACK ( name ( COMMA name )* )? ( K_RETURN name )? RBRACK ;
	public final void signature() throws RecognitionException {
		try {
			// Vhdl.g:1265:5: ( LBRACK ( name ( COMMA name )* )? ( K_RETURN name )? RBRACK )
			// Vhdl.g:1265:5: LBRACK ( name ( COMMA name )* )? ( K_RETURN name )? RBRACK
			{
			match(input,LBRACK,FOLLOW_LBRACK_in_signature7142); if (state.failed) return;
			// Vhdl.g:1265:12: ( name ( COMMA name )* )?
			int alt211=2;
			int LA211_0 = input.LA(1);
			if ( (LA211_0==BASIC_IDENTIFIER||LA211_0==EXTENDED_IDENTIFIER||LA211_0==STRING_LITERAL) ) {
				alt211=1;
			}
			switch (alt211) {
				case 1 :
					// Vhdl.g:1265:13: name ( COMMA name )*
					{
					pushFollow(FOLLOW_name_in_signature7145);
					name();
					state._fsp--;
					if (state.failed) return;
					// Vhdl.g:1265:18: ( COMMA name )*
					loop210:
					while (true) {
						int alt210=2;
						int LA210_0 = input.LA(1);
						if ( (LA210_0==COMMA) ) {
							alt210=1;
						}

						switch (alt210) {
						case 1 :
							// Vhdl.g:1265:19: COMMA name
							{
							match(input,COMMA,FOLLOW_COMMA_in_signature7148); if (state.failed) return;
							pushFollow(FOLLOW_name_in_signature7150);
							name();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop210;
						}
					}

					}
					break;

			}

			// Vhdl.g:1265:34: ( K_RETURN name )?
			int alt212=2;
			int LA212_0 = input.LA(1);
			if ( (LA212_0==K_RETURN) ) {
				alt212=1;
			}
			switch (alt212) {
				case 1 :
					// Vhdl.g:1265:35: K_RETURN name
					{
					match(input,K_RETURN,FOLLOW_K_RETURN_in_signature7157); if (state.failed) return;
					pushFollow(FOLLOW_name_in_signature7159);
					name();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,RBRACK,FOLLOW_RBRACK_in_signature7163); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "signature"



	// $ANTLR start "simple_expression"
	// Vhdl.g:1268:1: simple_expression : ( sign )? term ( options {greedy=true; } : adding_operator term )* ;
	public final void simple_expression() throws RecognitionException {
		try {
			// Vhdl.g:1269:5: ( ( sign )? term ( options {greedy=true; } : adding_operator term )* )
			// Vhdl.g:1269:5: ( sign )? term ( options {greedy=true; } : adding_operator term )*
			{
			// Vhdl.g:1269:5: ( sign )?
			int alt213=2;
			int LA213_0 = input.LA(1);
			if ( (LA213_0==MINUS||LA213_0==PLUS) ) {
				alt213=1;
			}
			switch (alt213) {
				case 1 :
					// Vhdl.g:1269:6: sign
					{
					pushFollow(FOLLOW_sign_in_simple_expression7175);
					sign();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_term_in_simple_expression7179);
			term();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:1269:18: ( options {greedy=true; } : adding_operator term )*
			loop214:
			while (true) {
				int alt214=2;
				int LA214_0 = input.LA(1);
				if ( (LA214_0==AND||LA214_0==MINUS||LA214_0==PLUS) ) {
					alt214=1;
				}

				switch (alt214) {
				case 1 :
					// Vhdl.g:1269:42: adding_operator term
					{
					pushFollow(FOLLOW_adding_operator_in_simple_expression7190);
					adding_operator();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_term_in_simple_expression7192);
					term();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop214;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "simple_expression"



	// $ANTLR start "simple_name"
	// Vhdl.g:1272:1: simple_name : identifier ;
	public final void simple_name() throws RecognitionException {
		try {
			// Vhdl.g:1273:5: ( identifier )
			// Vhdl.g:1273:5: identifier
			{
			pushFollow(FOLLOW_identifier_in_simple_name7205);
			identifier();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "simple_name"



	// $ANTLR start "string_literal"
	// Vhdl.g:1276:1: string_literal : STRING_LITERAL ;
	public final void string_literal() throws RecognitionException {
		try {
			// Vhdl.g:1277:3: ( STRING_LITERAL )
			// Vhdl.g:1277:3: STRING_LITERAL
			{
			match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_string_literal7214); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "string_literal"



	// $ANTLR start "subprogram_body"
	// Vhdl.g:1280:1: subprogram_body : subprogram_specification K_IS subprogram_declarative_part K_BEGIN subprogram_statement_part K_END ( subprogram_kind )? ( designator )? SEMI ;
	public final void subprogram_body() throws RecognitionException {
		try {
			// Vhdl.g:1281:5: ( subprogram_specification K_IS subprogram_declarative_part K_BEGIN subprogram_statement_part K_END ( subprogram_kind )? ( designator )? SEMI )
			// Vhdl.g:1281:5: subprogram_specification K_IS subprogram_declarative_part K_BEGIN subprogram_statement_part K_END ( subprogram_kind )? ( designator )? SEMI
			{
			pushFollow(FOLLOW_subprogram_specification_in_subprogram_body7225);
			subprogram_specification();
			state._fsp--;
			if (state.failed) return;
			match(input,K_IS,FOLLOW_K_IS_in_subprogram_body7227); if (state.failed) return;
			pushFollow(FOLLOW_subprogram_declarative_part_in_subprogram_body7229);
			subprogram_declarative_part();
			state._fsp--;
			if (state.failed) return;
			match(input,K_BEGIN,FOLLOW_K_BEGIN_in_subprogram_body7235); if (state.failed) return;
			pushFollow(FOLLOW_subprogram_statement_part_in_subprogram_body7237);
			subprogram_statement_part();
			state._fsp--;
			if (state.failed) return;
			match(input,K_END,FOLLOW_K_END_in_subprogram_body7239); if (state.failed) return;
			// Vhdl.g:1283:5: ( subprogram_kind )?
			int alt215=2;
			int LA215_0 = input.LA(1);
			if ( (LA215_0==K_FUNCTION||LA215_0==K_PROCEDURE) ) {
				alt215=1;
			}
			switch (alt215) {
				case 1 :
					// Vhdl.g:1283:6: subprogram_kind
					{
					pushFollow(FOLLOW_subprogram_kind_in_subprogram_body7247);
					subprogram_kind();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// Vhdl.g:1283:24: ( designator )?
			int alt216=2;
			int LA216_0 = input.LA(1);
			if ( (LA216_0==BASIC_IDENTIFIER||LA216_0==EXTENDED_IDENTIFIER||LA216_0==STRING_LITERAL) ) {
				alt216=1;
			}
			switch (alt216) {
				case 1 :
					// Vhdl.g:1283:25: designator
					{
					pushFollow(FOLLOW_designator_in_subprogram_body7252);
					designator();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,SEMI,FOLLOW_SEMI_in_subprogram_body7256); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "subprogram_body"



	// $ANTLR start "subprogram_declaration"
	// Vhdl.g:1286:1: subprogram_declaration : subprogram_specification SEMI ;
	public final void subprogram_declaration() throws RecognitionException {
		try {
			// Vhdl.g:1287:5: ( subprogram_specification SEMI )
			// Vhdl.g:1287:5: subprogram_specification SEMI
			{
			pushFollow(FOLLOW_subprogram_specification_in_subprogram_declaration7267);
			subprogram_specification();
			state._fsp--;
			if (state.failed) return;
			match(input,SEMI,FOLLOW_SEMI_in_subprogram_declaration7269); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "subprogram_declaration"



	// $ANTLR start "subprogram_declarative_item"
	// Vhdl.g:1290:1: subprogram_declarative_item : ( ( subprogram_declaration )=> subprogram_declaration | subprogram_body | type_declaration | subtype_declaration | constant_declaration | variable_declaration | file_declaration | alias_declaration | ( attribute_specification )=> attribute_specification | attribute_declaration | use_clause | ( K_GROUP identifier COLON )=> group_declaration | group_template_declaration );
	public final void subprogram_declarative_item() throws RecognitionException {
		try {
			// Vhdl.g:1291:5: ( ( subprogram_declaration )=> subprogram_declaration | subprogram_body | type_declaration | subtype_declaration | constant_declaration | variable_declaration | file_declaration | alias_declaration | ( attribute_specification )=> attribute_specification | attribute_declaration | use_clause | ( K_GROUP identifier COLON )=> group_declaration | group_template_declaration )
			int alt217=13;
			switch ( input.LA(1) ) {
			case K_PROCEDURE:
				{
				int LA217_1 = input.LA(2);
				if ( (LA217_1==BASIC_IDENTIFIER||LA217_1==EXTENDED_IDENTIFIER) ) {
					int LA217_14 = input.LA(3);
					if ( (synpred67_Vhdl()) ) {
						alt217=1;
					}
					else if ( (true) ) {
						alt217=2;
					}

				}
				else if ( (LA217_1==STRING_LITERAL) ) {
					int LA217_15 = input.LA(3);
					if ( (synpred67_Vhdl()) ) {
						alt217=1;
					}
					else if ( (true) ) {
						alt217=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 217, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_IMPURE:
			case K_PURE:
				{
				int LA217_2 = input.LA(2);
				if ( (LA217_2==K_FUNCTION) ) {
					int LA217_16 = input.LA(3);
					if ( (synpred67_Vhdl()) ) {
						alt217=1;
					}
					else if ( (true) ) {
						alt217=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 217, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_FUNCTION:
				{
				int LA217_3 = input.LA(2);
				if ( (LA217_3==BASIC_IDENTIFIER||LA217_3==EXTENDED_IDENTIFIER) ) {
					int LA217_17 = input.LA(3);
					if ( (synpred67_Vhdl()) ) {
						alt217=1;
					}
					else if ( (true) ) {
						alt217=2;
					}

				}
				else if ( (LA217_3==STRING_LITERAL) ) {
					int LA217_18 = input.LA(3);
					if ( (synpred67_Vhdl()) ) {
						alt217=1;
					}
					else if ( (true) ) {
						alt217=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 217, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_TYPE:
				{
				alt217=3;
				}
				break;
			case K_SUBTYPE:
				{
				alt217=4;
				}
				break;
			case K_CONSTANT:
				{
				alt217=5;
				}
				break;
			case K_SHARED:
			case K_VARIABLE:
				{
				alt217=6;
				}
				break;
			case K_FILE:
				{
				alt217=7;
				}
				break;
			case K_ALIAS:
				{
				alt217=8;
				}
				break;
			case K_ATTRIBUTE:
				{
				int LA217_11 = input.LA(2);
				if ( (LA217_11==BASIC_IDENTIFIER||LA217_11==EXTENDED_IDENTIFIER) ) {
					int LA217_19 = input.LA(3);
					if ( (synpred68_Vhdl()) ) {
						alt217=9;
					}
					else if ( (true) ) {
						alt217=10;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 217, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_USE:
				{
				alt217=11;
				}
				break;
			case K_GROUP:
				{
				int LA217_13 = input.LA(2);
				if ( (LA217_13==BASIC_IDENTIFIER||LA217_13==EXTENDED_IDENTIFIER) ) {
					int LA217_20 = input.LA(3);
					if ( (synpred69_Vhdl()) ) {
						alt217=12;
					}
					else if ( (true) ) {
						alt217=13;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 217, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 217, 0, input);
				throw nvae;
			}
			switch (alt217) {
				case 1 :
					// Vhdl.g:1291:5: ( subprogram_declaration )=> subprogram_declaration
					{
					pushFollow(FOLLOW_subprogram_declaration_in_subprogram_declarative_item7285);
					subprogram_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:1292:5: subprogram_body
					{
					pushFollow(FOLLOW_subprogram_body_in_subprogram_declarative_item7292);
					subprogram_body();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Vhdl.g:1293:5: type_declaration
					{
					pushFollow(FOLLOW_type_declaration_in_subprogram_declarative_item7299);
					type_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// Vhdl.g:1294:5: subtype_declaration
					{
					pushFollow(FOLLOW_subtype_declaration_in_subprogram_declarative_item7306);
					subtype_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// Vhdl.g:1295:5: constant_declaration
					{
					pushFollow(FOLLOW_constant_declaration_in_subprogram_declarative_item7313);
					constant_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// Vhdl.g:1296:5: variable_declaration
					{
					pushFollow(FOLLOW_variable_declaration_in_subprogram_declarative_item7320);
					variable_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// Vhdl.g:1297:5: file_declaration
					{
					pushFollow(FOLLOW_file_declaration_in_subprogram_declarative_item7327);
					file_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// Vhdl.g:1298:5: alias_declaration
					{
					pushFollow(FOLLOW_alias_declaration_in_subprogram_declarative_item7334);
					alias_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 9 :
					// Vhdl.g:1299:5: ( attribute_specification )=> attribute_specification
					{
					pushFollow(FOLLOW_attribute_specification_in_subprogram_declarative_item7346);
					attribute_specification();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 10 :
					// Vhdl.g:1300:5: attribute_declaration
					{
					pushFollow(FOLLOW_attribute_declaration_in_subprogram_declarative_item7352);
					attribute_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 11 :
					// Vhdl.g:1301:5: use_clause
					{
					pushFollow(FOLLOW_use_clause_in_subprogram_declarative_item7358);
					use_clause();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 12 :
					// Vhdl.g:1302:5: ( K_GROUP identifier COLON )=> group_declaration
					{
					pushFollow(FOLLOW_group_declaration_in_subprogram_declarative_item7374);
					group_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 13 :
					// Vhdl.g:1303:5: group_template_declaration
					{
					pushFollow(FOLLOW_group_template_declaration_in_subprogram_declarative_item7380);
					group_template_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "subprogram_declarative_item"



	// $ANTLR start "subprogram_declarative_part"
	// Vhdl.g:1306:1: subprogram_declarative_part : ( subprogram_declarative_item )* ;
	public final void subprogram_declarative_part() throws RecognitionException {
		try {
			// Vhdl.g:1307:5: ( ( subprogram_declarative_item )* )
			// Vhdl.g:1307:5: ( subprogram_declarative_item )*
			{
			// Vhdl.g:1307:5: ( subprogram_declarative_item )*
			loop218:
			while (true) {
				int alt218=2;
				int LA218_0 = input.LA(1);
				if ( (LA218_0==K_ALIAS||LA218_0==K_ATTRIBUTE||LA218_0==K_CONSTANT||LA218_0==K_FILE||LA218_0==K_FUNCTION||LA218_0==K_GROUP||LA218_0==K_IMPURE||LA218_0==K_PROCEDURE||LA218_0==K_PURE||LA218_0==K_SHARED||LA218_0==K_SUBTYPE||LA218_0==K_TYPE||(LA218_0 >= K_USE && LA218_0 <= K_VARIABLE)) ) {
					alt218=1;
				}

				switch (alt218) {
				case 1 :
					// Vhdl.g:1307:6: subprogram_declarative_item
					{
					pushFollow(FOLLOW_subprogram_declarative_item_in_subprogram_declarative_part7392);
					subprogram_declarative_item();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop218;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "subprogram_declarative_part"



	// $ANTLR start "subprogram_kind"
	// Vhdl.g:1310:1: subprogram_kind : ( K_PROCEDURE | K_FUNCTION );
	public final void subprogram_kind() throws RecognitionException {
		try {
			// Vhdl.g:1311:5: ( K_PROCEDURE | K_FUNCTION )
			// Vhdl.g:
			{
			if ( input.LA(1)==K_FUNCTION||input.LA(1)==K_PROCEDURE ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "subprogram_kind"



	// $ANTLR start "subprogram_specification"
	// Vhdl.g:1315:1: subprogram_specification : ( K_PROCEDURE designator ( LPAREN formal_parameter_list RPAREN )? | ( K_PURE | K_IMPURE )? K_FUNCTION designator ( LPAREN formal_parameter_list RPAREN )? K_RETURN name );
	public final void subprogram_specification() throws RecognitionException {
		try {
			// Vhdl.g:1316:5: ( K_PROCEDURE designator ( LPAREN formal_parameter_list RPAREN )? | ( K_PURE | K_IMPURE )? K_FUNCTION designator ( LPAREN formal_parameter_list RPAREN )? K_RETURN name )
			int alt222=2;
			int LA222_0 = input.LA(1);
			if ( (LA222_0==K_PROCEDURE) ) {
				alt222=1;
			}
			else if ( (LA222_0==K_FUNCTION||LA222_0==K_IMPURE||LA222_0==K_PURE) ) {
				alt222=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 222, 0, input);
				throw nvae;
			}

			switch (alt222) {
				case 1 :
					// Vhdl.g:1316:5: K_PROCEDURE designator ( LPAREN formal_parameter_list RPAREN )?
					{
					match(input,K_PROCEDURE,FOLLOW_K_PROCEDURE_in_subprogram_specification7423); if (state.failed) return;
					pushFollow(FOLLOW_designator_in_subprogram_specification7425);
					designator();
					state._fsp--;
					if (state.failed) return;
					// Vhdl.g:1316:28: ( LPAREN formal_parameter_list RPAREN )?
					int alt219=2;
					int LA219_0 = input.LA(1);
					if ( (LA219_0==LPAREN) ) {
						alt219=1;
					}
					switch (alt219) {
						case 1 :
							// Vhdl.g:1316:29: LPAREN formal_parameter_list RPAREN
							{
							match(input,LPAREN,FOLLOW_LPAREN_in_subprogram_specification7428); if (state.failed) return;
							pushFollow(FOLLOW_formal_parameter_list_in_subprogram_specification7430);
							formal_parameter_list();
							state._fsp--;
							if (state.failed) return;
							match(input,RPAREN,FOLLOW_RPAREN_in_subprogram_specification7432); if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 2 :
					// Vhdl.g:1317:5: ( K_PURE | K_IMPURE )? K_FUNCTION designator ( LPAREN formal_parameter_list RPAREN )? K_RETURN name
					{
					// Vhdl.g:1317:5: ( K_PURE | K_IMPURE )?
					int alt220=2;
					int LA220_0 = input.LA(1);
					if ( (LA220_0==K_IMPURE||LA220_0==K_PURE) ) {
						alt220=1;
					}
					switch (alt220) {
						case 1 :
							// Vhdl.g:
							{
							if ( input.LA(1)==K_IMPURE||input.LA(1)==K_PURE ) {
								input.consume();
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

					}

					match(input,K_FUNCTION,FOLLOW_K_FUNCTION_in_subprogram_specification7449); if (state.failed) return;
					pushFollow(FOLLOW_designator_in_subprogram_specification7451);
					designator();
					state._fsp--;
					if (state.failed) return;
					// Vhdl.g:1318:3: ( LPAREN formal_parameter_list RPAREN )?
					int alt221=2;
					int LA221_0 = input.LA(1);
					if ( (LA221_0==LPAREN) ) {
						alt221=1;
					}
					switch (alt221) {
						case 1 :
							// Vhdl.g:1318:4: LPAREN formal_parameter_list RPAREN
							{
							match(input,LPAREN,FOLLOW_LPAREN_in_subprogram_specification7457); if (state.failed) return;
							pushFollow(FOLLOW_formal_parameter_list_in_subprogram_specification7459);
							formal_parameter_list();
							state._fsp--;
							if (state.failed) return;
							match(input,RPAREN,FOLLOW_RPAREN_in_subprogram_specification7461); if (state.failed) return;
							}
							break;

					}

					match(input,K_RETURN,FOLLOW_K_RETURN_in_subprogram_specification7466); if (state.failed) return;
					pushFollow(FOLLOW_name_in_subprogram_specification7468);
					name();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "subprogram_specification"



	// $ANTLR start "subprogram_statement_part"
	// Vhdl.g:1321:1: subprogram_statement_part : ( sequential_statement )* ;
	public final void subprogram_statement_part() throws RecognitionException {
		try {
			// Vhdl.g:1322:5: ( ( sequential_statement )* )
			// Vhdl.g:1322:5: ( sequential_statement )*
			{
			// Vhdl.g:1322:5: ( sequential_statement )*
			loop223:
			while (true) {
				int alt223=2;
				int LA223_0 = input.LA(1);
				if ( (LA223_0==BASIC_IDENTIFIER||LA223_0==EXTENDED_IDENTIFIER||LA223_0==K_ASSERT||LA223_0==K_CASE||LA223_0==K_EXIT||LA223_0==K_FOR||LA223_0==K_IF||LA223_0==K_LOOP||LA223_0==K_NEXT||LA223_0==K_NULL||(LA223_0 >= K_REPORT && LA223_0 <= K_RETURN)||LA223_0==K_WAIT||LA223_0==K_WHILE||LA223_0==LPAREN||LA223_0==STRING_LITERAL) ) {
					alt223=1;
				}

				switch (alt223) {
				case 1 :
					// Vhdl.g:1322:6: sequential_statement
					{
					pushFollow(FOLLOW_sequential_statement_in_subprogram_statement_part7480);
					sequential_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop223;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "subprogram_statement_part"



	// $ANTLR start "subtype_declaration"
	// Vhdl.g:1325:1: subtype_declaration : K_SUBTYPE identifier K_IS subtype_indication SEMI ;
	public final void subtype_declaration() throws RecognitionException {
		try {
			// Vhdl.g:1326:5: ( K_SUBTYPE identifier K_IS subtype_indication SEMI )
			// Vhdl.g:1326:5: K_SUBTYPE identifier K_IS subtype_indication SEMI
			{
			match(input,K_SUBTYPE,FOLLOW_K_SUBTYPE_in_subtype_declaration7493); if (state.failed) return;
			pushFollow(FOLLOW_identifier_in_subtype_declaration7495);
			identifier();
			state._fsp--;
			if (state.failed) return;
			match(input,K_IS,FOLLOW_K_IS_in_subtype_declaration7497); if (state.failed) return;
			pushFollow(FOLLOW_subtype_indication_in_subtype_declaration7499);
			subtype_indication();
			state._fsp--;
			if (state.failed) return;
			match(input,SEMI,FOLLOW_SEMI_in_subtype_declaration7501); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "subtype_declaration"



	// $ANTLR start "subtype_indication"
	// Vhdl.g:1329:1: subtype_indication : name ( name )? ( constraint )? ;
	public final void subtype_indication() throws RecognitionException {
		try {
			// Vhdl.g:1330:5: ( name ( name )? ( constraint )? )
			// Vhdl.g:1330:5: name ( name )? ( constraint )?
			{
			pushFollow(FOLLOW_name_in_subtype_indication7512);
			name();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:1330:10: ( name )?
			int alt224=2;
			int LA224_0 = input.LA(1);
			if ( (LA224_0==BASIC_IDENTIFIER||LA224_0==EXTENDED_IDENTIFIER||LA224_0==STRING_LITERAL) ) {
				alt224=1;
			}
			switch (alt224) {
				case 1 :
					// Vhdl.g:1330:11: name
					{
					pushFollow(FOLLOW_name_in_subtype_indication7515);
					name();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// Vhdl.g:1330:18: ( constraint )?
			int alt225=2;
			int LA225_0 = input.LA(1);
			if ( (LA225_0==K_RANGE||LA225_0==LPAREN) ) {
				alt225=1;
			}
			switch (alt225) {
				case 1 :
					// Vhdl.g:1330:19: constraint
					{
					pushFollow(FOLLOW_constraint_in_subtype_indication7520);
					constraint();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "subtype_indication"



	// $ANTLR start "suffix"
	// Vhdl.g:1333:1: suffix : ( simple_name | character_literal | operator_symbol | K_ALL );
	public final void suffix() throws RecognitionException {
		try {
			// Vhdl.g:1334:5: ( simple_name | character_literal | operator_symbol | K_ALL )
			int alt226=4;
			switch ( input.LA(1) ) {
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
				{
				alt226=1;
				}
				break;
			case CHARACTER_LITERAL:
				{
				alt226=2;
				}
				break;
			case STRING_LITERAL:
				{
				alt226=3;
				}
				break;
			case K_ALL:
				{
				alt226=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 226, 0, input);
				throw nvae;
			}
			switch (alt226) {
				case 1 :
					// Vhdl.g:1334:5: simple_name
					{
					pushFollow(FOLLOW_simple_name_in_suffix7533);
					simple_name();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:1335:5: character_literal
					{
					pushFollow(FOLLOW_character_literal_in_suffix7539);
					character_literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Vhdl.g:1336:5: operator_symbol
					{
					pushFollow(FOLLOW_operator_symbol_in_suffix7545);
					operator_symbol();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// Vhdl.g:1337:5: K_ALL
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_suffix7552); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "suffix"



	// $ANTLR start "target"
	// Vhdl.g:1340:1: target : ( name | aggregate );
	public final void target() throws RecognitionException {
		try {
			// Vhdl.g:1341:5: ( name | aggregate )
			int alt227=2;
			int LA227_0 = input.LA(1);
			if ( (LA227_0==BASIC_IDENTIFIER||LA227_0==EXTENDED_IDENTIFIER||LA227_0==STRING_LITERAL) ) {
				alt227=1;
			}
			else if ( (LA227_0==LPAREN) ) {
				alt227=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 227, 0, input);
				throw nvae;
			}

			switch (alt227) {
				case 1 :
					// Vhdl.g:1341:5: name
					{
					pushFollow(FOLLOW_name_in_target7563);
					name();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:1342:5: aggregate
					{
					pushFollow(FOLLOW_aggregate_in_target7569);
					aggregate();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "target"



	// $ANTLR start "term"
	// Vhdl.g:1345:1: term : factor ( options {greedy=true; } : multiplying_operator factor )* ;
	public final void term() throws RecognitionException {
		try {
			// Vhdl.g:1346:5: ( factor ( options {greedy=true; } : multiplying_operator factor )* )
			// Vhdl.g:1346:5: factor ( options {greedy=true; } : multiplying_operator factor )*
			{
			pushFollow(FOLLOW_factor_in_term7580);
			factor();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:1346:12: ( options {greedy=true; } : multiplying_operator factor )*
			loop228:
			while (true) {
				int alt228=2;
				int LA228_0 = input.LA(1);
				if ( (LA228_0==K_MOD||LA228_0==K_REM||LA228_0==SLASH||LA228_0==STAR) ) {
					alt228=1;
				}

				switch (alt228) {
				case 1 :
					// Vhdl.g:1346:36: multiplying_operator factor
					{
					pushFollow(FOLLOW_multiplying_operator_in_term7591);
					multiplying_operator();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_factor_in_term7593);
					factor();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop228;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "term"



	// $ANTLR start "timeout_clause"
	// Vhdl.g:1349:1: timeout_clause : K_FOR expression ;
	public final void timeout_clause() throws RecognitionException {
		try {
			// Vhdl.g:1350:5: ( K_FOR expression )
			// Vhdl.g:1350:5: K_FOR expression
			{
			match(input,K_FOR,FOLLOW_K_FOR_in_timeout_clause7606); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_timeout_clause7608);
			expression();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "timeout_clause"



	// $ANTLR start "type_declaration"
	// Vhdl.g:1353:1: type_declaration : ( ( full_type_declaration )=> full_type_declaration | incomplete_type_declaration );
	public final void type_declaration() throws RecognitionException {
		try {
			// Vhdl.g:1354:5: ( ( full_type_declaration )=> full_type_declaration | incomplete_type_declaration )
			int alt229=2;
			int LA229_0 = input.LA(1);
			if ( (LA229_0==K_TYPE) ) {
				int LA229_1 = input.LA(2);
				if ( (LA229_1==BASIC_IDENTIFIER||LA229_1==EXTENDED_IDENTIFIER) ) {
					int LA229_2 = input.LA(3);
					if ( (synpred70_Vhdl()) ) {
						alt229=1;
					}
					else if ( (true) ) {
						alt229=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 229, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 229, 0, input);
				throw nvae;
			}

			switch (alt229) {
				case 1 :
					// Vhdl.g:1354:5: ( full_type_declaration )=> full_type_declaration
					{
					pushFollow(FOLLOW_full_type_declaration_in_type_declaration7624);
					full_type_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:1355:5: incomplete_type_declaration
					{
					pushFollow(FOLLOW_incomplete_type_declaration_in_type_declaration7630);
					incomplete_type_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type_declaration"



	// $ANTLR start "type_definition"
	// Vhdl.g:1358:1: type_definition : ( scalar_type_definition | composite_type_definition | access_type_definition | file_type_definition | protected_type_definition );
	public final void type_definition() throws RecognitionException {
		try {
			// Vhdl.g:1359:5: ( scalar_type_definition | composite_type_definition | access_type_definition | file_type_definition | protected_type_definition )
			int alt230=5;
			switch ( input.LA(1) ) {
			case K_RANGE:
			case LPAREN:
				{
				alt230=1;
				}
				break;
			case K_ARRAY:
			case K_RECORD:
				{
				alt230=2;
				}
				break;
			case K_ACCESS:
				{
				alt230=3;
				}
				break;
			case K_FILE:
				{
				alt230=4;
				}
				break;
			case K_PROTECTED:
				{
				alt230=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 230, 0, input);
				throw nvae;
			}
			switch (alt230) {
				case 1 :
					// Vhdl.g:1359:5: scalar_type_definition
					{
					pushFollow(FOLLOW_scalar_type_definition_in_type_definition7641);
					scalar_type_definition();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:1360:5: composite_type_definition
					{
					pushFollow(FOLLOW_composite_type_definition_in_type_definition7647);
					composite_type_definition();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Vhdl.g:1361:5: access_type_definition
					{
					pushFollow(FOLLOW_access_type_definition_in_type_definition7654);
					access_type_definition();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// Vhdl.g:1362:5: file_type_definition
					{
					pushFollow(FOLLOW_file_type_definition_in_type_definition7661);
					file_type_definition();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// Vhdl.g:1363:5: protected_type_definition
					{
					pushFollow(FOLLOW_protected_type_definition_in_type_definition7668);
					protected_type_definition();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type_definition"



	// $ANTLR start "unconstrained_array_definition"
	// Vhdl.g:1366:1: unconstrained_array_definition : K_ARRAY LPAREN index_subtype_definition ( COMMA index_subtype_definition )* RPAREN K_OF subtype_indication ;
	public final void unconstrained_array_definition() throws RecognitionException {
		try {
			// Vhdl.g:1367:5: ( K_ARRAY LPAREN index_subtype_definition ( COMMA index_subtype_definition )* RPAREN K_OF subtype_indication )
			// Vhdl.g:1367:5: K_ARRAY LPAREN index_subtype_definition ( COMMA index_subtype_definition )* RPAREN K_OF subtype_indication
			{
			match(input,K_ARRAY,FOLLOW_K_ARRAY_in_unconstrained_array_definition7679); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_unconstrained_array_definition7681); if (state.failed) return;
			pushFollow(FOLLOW_index_subtype_definition_in_unconstrained_array_definition7683);
			index_subtype_definition();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:1368:3: ( COMMA index_subtype_definition )*
			loop231:
			while (true) {
				int alt231=2;
				int LA231_0 = input.LA(1);
				if ( (LA231_0==COMMA) ) {
					alt231=1;
				}

				switch (alt231) {
				case 1 :
					// Vhdl.g:1368:4: COMMA index_subtype_definition
					{
					match(input,COMMA,FOLLOW_COMMA_in_unconstrained_array_definition7689); if (state.failed) return;
					pushFollow(FOLLOW_index_subtype_definition_in_unconstrained_array_definition7691);
					index_subtype_definition();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop231;
				}
			}

			match(input,RPAREN,FOLLOW_RPAREN_in_unconstrained_array_definition7695); if (state.failed) return;
			match(input,K_OF,FOLLOW_K_OF_in_unconstrained_array_definition7697); if (state.failed) return;
			pushFollow(FOLLOW_subtype_indication_in_unconstrained_array_definition7699);
			subtype_indication();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "unconstrained_array_definition"



	// $ANTLR start "use_clause"
	// Vhdl.g:1371:1: use_clause : K_USE name ( COMMA name )* SEMI ;
	public final void use_clause() throws RecognitionException {
		try {
			// Vhdl.g:1372:5: ( K_USE name ( COMMA name )* SEMI )
			// Vhdl.g:1372:5: K_USE name ( COMMA name )* SEMI
			{
			match(input,K_USE,FOLLOW_K_USE_in_use_clause7710); if (state.failed) return;
			pushFollow(FOLLOW_name_in_use_clause7712);
			name();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:1372:16: ( COMMA name )*
			loop232:
			while (true) {
				int alt232=2;
				int LA232_0 = input.LA(1);
				if ( (LA232_0==COMMA) ) {
					alt232=1;
				}

				switch (alt232) {
				case 1 :
					// Vhdl.g:1372:17: COMMA name
					{
					match(input,COMMA,FOLLOW_COMMA_in_use_clause7715); if (state.failed) return;
					pushFollow(FOLLOW_name_in_use_clause7717);
					name();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop232;
				}
			}

			match(input,SEMI,FOLLOW_SEMI_in_use_clause7721); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "use_clause"



	// $ANTLR start "variable_assignment_statement"
	// Vhdl.g:1375:1: variable_assignment_statement : ( options {greedy=true; } : label_colon )? target COLONEQ expression SEMI ;
	public final void variable_assignment_statement() throws RecognitionException {
		try {
			// Vhdl.g:1376:5: ( ( options {greedy=true; } : label_colon )? target COLONEQ expression SEMI )
			// Vhdl.g:1376:5: ( options {greedy=true; } : label_colon )? target COLONEQ expression SEMI
			{
			// Vhdl.g:1376:5: ( options {greedy=true; } : label_colon )?
			int alt233=2;
			int LA233_0 = input.LA(1);
			if ( (LA233_0==BASIC_IDENTIFIER||LA233_0==EXTENDED_IDENTIFIER) ) {
				int LA233_1 = input.LA(2);
				if ( (LA233_1==COLON) ) {
					alt233=1;
				}
			}
			switch (alt233) {
				case 1 :
					// Vhdl.g:1376:29: label_colon
					{
					pushFollow(FOLLOW_label_colon_in_variable_assignment_statement7741);
					label_colon();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_target_in_variable_assignment_statement7745);
			target();
			state._fsp--;
			if (state.failed) return;
			match(input,COLONEQ,FOLLOW_COLONEQ_in_variable_assignment_statement7747); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_variable_assignment_statement7749);
			expression();
			state._fsp--;
			if (state.failed) return;
			match(input,SEMI,FOLLOW_SEMI_in_variable_assignment_statement7751); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "variable_assignment_statement"



	// $ANTLR start "variable_declaration"
	// Vhdl.g:1379:1: variable_declaration : ( K_SHARED )? K_VARIABLE identifier_list COLON subtype_indication ( COLONEQ expression )? SEMI ;
	public final void variable_declaration() throws RecognitionException {
		try {
			// Vhdl.g:1380:5: ( ( K_SHARED )? K_VARIABLE identifier_list COLON subtype_indication ( COLONEQ expression )? SEMI )
			// Vhdl.g:1380:5: ( K_SHARED )? K_VARIABLE identifier_list COLON subtype_indication ( COLONEQ expression )? SEMI
			{
			// Vhdl.g:1380:5: ( K_SHARED )?
			int alt234=2;
			int LA234_0 = input.LA(1);
			if ( (LA234_0==K_SHARED) ) {
				alt234=1;
			}
			switch (alt234) {
				case 1 :
					// Vhdl.g:1380:6: K_SHARED
					{
					match(input,K_SHARED,FOLLOW_K_SHARED_in_variable_declaration7763); if (state.failed) return;
					}
					break;

			}

			match(input,K_VARIABLE,FOLLOW_K_VARIABLE_in_variable_declaration7767); if (state.failed) return;
			pushFollow(FOLLOW_identifier_list_in_variable_declaration7769);
			identifier_list();
			state._fsp--;
			if (state.failed) return;
			match(input,COLON,FOLLOW_COLON_in_variable_declaration7771); if (state.failed) return;
			pushFollow(FOLLOW_subtype_indication_in_variable_declaration7773);
			subtype_indication();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:1381:9: ( COLONEQ expression )?
			int alt235=2;
			int LA235_0 = input.LA(1);
			if ( (LA235_0==COLONEQ) ) {
				alt235=1;
			}
			switch (alt235) {
				case 1 :
					// Vhdl.g:1381:10: COLONEQ expression
					{
					match(input,COLONEQ,FOLLOW_COLONEQ_in_variable_declaration7785); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_variable_declaration7787);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,SEMI,FOLLOW_SEMI_in_variable_declaration7791); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "variable_declaration"



	// $ANTLR start "wait_statement"
	// Vhdl.g:1384:1: wait_statement : ( label_colon )? K_WAIT ( sensitivity_clause )? ( condition_clause )? ( timeout_clause )? SEMI ;
	public final void wait_statement() throws RecognitionException {
		try {
			// Vhdl.g:1385:5: ( ( label_colon )? K_WAIT ( sensitivity_clause )? ( condition_clause )? ( timeout_clause )? SEMI )
			// Vhdl.g:1385:5: ( label_colon )? K_WAIT ( sensitivity_clause )? ( condition_clause )? ( timeout_clause )? SEMI
			{
			// Vhdl.g:1385:5: ( label_colon )?
			int alt236=2;
			int LA236_0 = input.LA(1);
			if ( (LA236_0==BASIC_IDENTIFIER||LA236_0==EXTENDED_IDENTIFIER) ) {
				alt236=1;
			}
			switch (alt236) {
				case 1 :
					// Vhdl.g:1385:6: label_colon
					{
					pushFollow(FOLLOW_label_colon_in_wait_statement7803);
					label_colon();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,K_WAIT,FOLLOW_K_WAIT_in_wait_statement7807); if (state.failed) return;
			// Vhdl.g:1385:27: ( sensitivity_clause )?
			int alt237=2;
			int LA237_0 = input.LA(1);
			if ( (LA237_0==K_ON) ) {
				alt237=1;
			}
			switch (alt237) {
				case 1 :
					// Vhdl.g:1385:28: sensitivity_clause
					{
					pushFollow(FOLLOW_sensitivity_clause_in_wait_statement7810);
					sensitivity_clause();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// Vhdl.g:1385:49: ( condition_clause )?
			int alt238=2;
			int LA238_0 = input.LA(1);
			if ( (LA238_0==K_UNTIL) ) {
				alt238=1;
			}
			switch (alt238) {
				case 1 :
					// Vhdl.g:1385:50: condition_clause
					{
					pushFollow(FOLLOW_condition_clause_in_wait_statement7815);
					condition_clause();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// Vhdl.g:1386:9: ( timeout_clause )?
			int alt239=2;
			int LA239_0 = input.LA(1);
			if ( (LA239_0==K_FOR) ) {
				alt239=1;
			}
			switch (alt239) {
				case 1 :
					// Vhdl.g:1386:10: timeout_clause
					{
					pushFollow(FOLLOW_timeout_clause_in_wait_statement7829);
					timeout_clause();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,SEMI,FOLLOW_SEMI_in_wait_statement7833); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "wait_statement"



	// $ANTLR start "waveform"
	// Vhdl.g:1389:1: waveform : ( waveform_element ( COMMA waveform_element )* | K_UNAFFECTED );
	public final void waveform() throws RecognitionException {
		try {
			// Vhdl.g:1390:5: ( waveform_element ( COMMA waveform_element )* | K_UNAFFECTED )
			int alt241=2;
			int LA241_0 = input.LA(1);
			if ( (LA241_0==BASED_LITERAL||(LA241_0 >= BASIC_IDENTIFIER && LA241_0 <= BIT_STRING_LITERAL)||LA241_0==CHARACTER_LITERAL||LA241_0==DECIMAL_LITERAL||LA241_0==EXTENDED_IDENTIFIER||LA241_0==K_ABS||LA241_0==K_NEW||(LA241_0 >= K_NOT && LA241_0 <= K_NULL)||LA241_0==LPAREN||LA241_0==MINUS||LA241_0==PLUS||LA241_0==STRING_LITERAL) ) {
				alt241=1;
			}
			else if ( (LA241_0==K_UNAFFECTED) ) {
				alt241=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 241, 0, input);
				throw nvae;
			}

			switch (alt241) {
				case 1 :
					// Vhdl.g:1390:5: waveform_element ( COMMA waveform_element )*
					{
					pushFollow(FOLLOW_waveform_element_in_waveform7844);
					waveform_element();
					state._fsp--;
					if (state.failed) return;
					// Vhdl.g:1390:22: ( COMMA waveform_element )*
					loop240:
					while (true) {
						int alt240=2;
						int LA240_0 = input.LA(1);
						if ( (LA240_0==COMMA) ) {
							alt240=1;
						}

						switch (alt240) {
						case 1 :
							// Vhdl.g:1390:23: COMMA waveform_element
							{
							match(input,COMMA,FOLLOW_COMMA_in_waveform7847); if (state.failed) return;
							pushFollow(FOLLOW_waveform_element_in_waveform7849);
							waveform_element();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop240;
						}
					}

					}
					break;
				case 2 :
					// Vhdl.g:1391:5: K_UNAFFECTED
					{
					match(input,K_UNAFFECTED,FOLLOW_K_UNAFFECTED_in_waveform7857); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "waveform"



	// $ANTLR start "waveform_element"
	// Vhdl.g:1394:1: waveform_element : expression ( K_AFTER expression )? ;
	public final void waveform_element() throws RecognitionException {
		try {
			// Vhdl.g:1395:5: ( expression ( K_AFTER expression )? )
			// Vhdl.g:1395:5: expression ( K_AFTER expression )?
			{
			pushFollow(FOLLOW_expression_in_waveform_element7868);
			expression();
			state._fsp--;
			if (state.failed) return;
			// Vhdl.g:1395:16: ( K_AFTER expression )?
			int alt242=2;
			int LA242_0 = input.LA(1);
			if ( (LA242_0==K_AFTER) ) {
				alt242=1;
			}
			switch (alt242) {
				case 1 :
					// Vhdl.g:1395:17: K_AFTER expression
					{
					match(input,K_AFTER,FOLLOW_K_AFTER_in_waveform_element7871); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_waveform_element7873);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "waveform_element"



	// $ANTLR start "voptions"
	// Vhdl.g:1400:1: voptions : ( K_GUARDED )? ( delay_mechanism )? ;
	public final void voptions() throws RecognitionException {
		try {
			// Vhdl.g:1401:5: ( ( K_GUARDED )? ( delay_mechanism )? )
			// Vhdl.g:1401:5: ( K_GUARDED )? ( delay_mechanism )?
			{
			// Vhdl.g:1401:5: ( K_GUARDED )?
			int alt243=2;
			int LA243_0 = input.LA(1);
			if ( (LA243_0==K_GUARDED) ) {
				alt243=1;
			}
			switch (alt243) {
				case 1 :
					// Vhdl.g:1401:6: K_GUARDED
					{
					match(input,K_GUARDED,FOLLOW_K_GUARDED_in_voptions7889); if (state.failed) return;
					}
					break;

			}

			// Vhdl.g:1401:18: ( delay_mechanism )?
			int alt244=2;
			int LA244_0 = input.LA(1);
			if ( (LA244_0==K_INERTIAL||LA244_0==K_REJECT||LA244_0==K_TRANSPORT) ) {
				alt244=1;
			}
			switch (alt244) {
				case 1 :
					// Vhdl.g:1401:19: delay_mechanism
					{
					pushFollow(FOLLOW_delay_mechanism_in_voptions7894);
					delay_mechanism();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "voptions"

	// $ANTLR start synpred1_Vhdl
	public final void synpred1_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:163:5: ( name LPAREN )
		// Vhdl.g:163:6: name LPAREN
		{
		pushFollow(FOLLOW_name_in_synpred1_Vhdl1052);
		name();
		state._fsp--;
		if (state.failed) return;
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred1_Vhdl1054); if (state.failed) return;
		}

	}
	// $ANTLR end synpred1_Vhdl

	// $ANTLR start synpred2_Vhdl
	public final void synpred2_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:190:13: ( subtype_indication )
		// Vhdl.g:190:14: subtype_indication
		{
		pushFollow(FOLLOW_subtype_indication_in_synpred2_Vhdl1205);
		subtype_indication();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred2_Vhdl

	// $ANTLR start synpred3_Vhdl
	public final void synpred3_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:211:5: ( unconstrained_array_definition )
		// Vhdl.g:211:6: unconstrained_array_definition
		{
		pushFollow(FOLLOW_unconstrained_array_definition_in_synpred3_Vhdl1336);
		unconstrained_array_definition();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred3_Vhdl

	// $ANTLR start synpred4_Vhdl
	public final void synpred4_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:226:6: ( formal_part EQGRT )
		// Vhdl.g:226:7: formal_part EQGRT
		{
		pushFollow(FOLLOW_formal_part_in_synpred4_Vhdl1420);
		formal_part();
		state._fsp--;
		if (state.failed) return;
		match(input,EQGRT,FOLLOW_EQGRT_in_synpred4_Vhdl1422); if (state.failed) return;
		}

	}
	// $ANTLR end synpred4_Vhdl

	// $ANTLR start synpred5_Vhdl
	public final void synpred5_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:272:5: ( subprogram_declaration )
		// Vhdl.g:272:6: subprogram_declaration
		{
		pushFollow(FOLLOW_subprogram_declaration_in_synpred5_Vhdl1632);
		subprogram_declaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred5_Vhdl

	// $ANTLR start synpred6_Vhdl
	public final void synpred6_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:282:5: ( attribute_specification )
		// Vhdl.g:282:6: attribute_specification
		{
		pushFollow(FOLLOW_attribute_specification_in_synpred6_Vhdl1697);
		attribute_specification();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred6_Vhdl

	// $ANTLR start synpred7_Vhdl
	public final void synpred7_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:287:5: ( K_GROUP identifier COLON )
		// Vhdl.g:287:6: K_GROUP identifier COLON
		{
		match(input,K_GROUP,FOLLOW_K_GROUP_in_synpred7_Vhdl1732); if (state.failed) return;
		pushFollow(FOLLOW_identifier_in_synpred7_Vhdl1734);
		identifier();
		state._fsp--;
		if (state.failed) return;
		match(input,COLON,FOLLOW_COLON_in_synpred7_Vhdl1736); if (state.failed) return;
		}

	}
	// $ANTLR end synpred7_Vhdl

	// $ANTLR start synpred8_Vhdl
	public final void synpred8_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:301:5: ( label LPAREN )
		// Vhdl.g:301:6: label LPAREN
		{
		pushFollow(FOLLOW_label_in_synpred8_Vhdl1815);
		label();
		state._fsp--;
		if (state.failed) return;
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred8_Vhdl1817); if (state.failed) return;
		}

	}
	// $ANTLR end synpred8_Vhdl

	// $ANTLR start synpred9_Vhdl
	public final void synpred9_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:330:5: ( simple_expression )
		// Vhdl.g:330:6: simple_expression
		{
		pushFollow(FOLLOW_simple_expression_in_synpred9_Vhdl2001);
		simple_expression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred9_Vhdl

	// $ANTLR start synpred10_Vhdl
	public final void synpred10_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:331:5: ( simple_name )
		// Vhdl.g:331:6: simple_name
		{
		pushFollow(FOLLOW_simple_name_in_synpred10_Vhdl2012);
		simple_name();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred10_Vhdl

	// $ANTLR start synpred11_Vhdl
	public final void synpred11_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:370:5: ( label_colon )
		// Vhdl.g:370:6: label_colon
		{
		pushFollow(FOLLOW_label_colon_in_synpred11_Vhdl2241);
		label_colon();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred11_Vhdl

	// $ANTLR start synpred12_Vhdl
	public final void synpred12_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:375:5: ( label_colon )
		// Vhdl.g:375:6: label_colon
		{
		pushFollow(FOLLOW_label_colon_in_synpred12_Vhdl2279);
		label_colon();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred12_Vhdl

	// $ANTLR start synpred13_Vhdl
	public final void synpred13_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:386:5: ( block_statement )
		// Vhdl.g:386:6: block_statement
		{
		pushFollow(FOLLOW_block_statement_in_synpred13_Vhdl2331);
		block_statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred13_Vhdl

	// $ANTLR start synpred14_Vhdl
	public final void synpred14_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:387:5: ( process_statement )
		// Vhdl.g:387:6: process_statement
		{
		pushFollow(FOLLOW_process_statement_in_synpred14_Vhdl2342);
		process_statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred14_Vhdl

	// $ANTLR start synpred15_Vhdl
	public final void synpred15_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:388:5: ( concurrent_procedure_call_statement )
		// Vhdl.g:388:6: concurrent_procedure_call_statement
		{
		pushFollow(FOLLOW_concurrent_procedure_call_statement_in_synpred15_Vhdl2353);
		concurrent_procedure_call_statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred15_Vhdl

	// $ANTLR start synpred16_Vhdl
	public final void synpred16_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:390:5: ( concurrent_assertion_statement )
		// Vhdl.g:390:6: concurrent_assertion_statement
		{
		pushFollow(FOLLOW_concurrent_assertion_statement_in_synpred16_Vhdl2367);
		concurrent_assertion_statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred16_Vhdl

	// $ANTLR start synpred17_Vhdl
	public final void synpred17_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:391:5: ( concurrent_signal_assignment_statement )
		// Vhdl.g:391:6: concurrent_signal_assignment_statement
		{
		pushFollow(FOLLOW_concurrent_signal_assignment_statement_in_synpred17_Vhdl2378);
		concurrent_signal_assignment_statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred17_Vhdl

	// $ANTLR start synpred18_Vhdl
	public final void synpred18_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:393:5: ( component_instantiation_statement )
		// Vhdl.g:393:6: component_instantiation_statement
		{
		pushFollow(FOLLOW_component_instantiation_statement_in_synpred18_Vhdl2391);
		component_instantiation_statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred18_Vhdl

	// $ANTLR start synpred19_Vhdl
	public final void synpred19_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:413:13: ( K_WHEN condition K_ELSE )
		// Vhdl.g:413:14: K_WHEN condition K_ELSE
		{
		match(input,K_WHEN,FOLLOW_K_WHEN_in_synpred19_Vhdl2461); if (state.failed) return;
		pushFollow(FOLLOW_condition_in_synpred19_Vhdl2463);
		condition();
		state._fsp--;
		if (state.failed) return;
		match(input,K_ELSE,FOLLOW_K_ELSE_in_synpred19_Vhdl2465); if (state.failed) return;
		}

	}
	// $ANTLR end synpred19_Vhdl

	// $ANTLR start synpred20_Vhdl
	public final void synpred20_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:419:7: ( K_WHEN condition K_ELSE )
		// Vhdl.g:419:8: K_WHEN condition K_ELSE
		{
		match(input,K_WHEN,FOLLOW_K_WHEN_in_synpred20_Vhdl2507); if (state.failed) return;
		pushFollow(FOLLOW_condition_in_synpred20_Vhdl2509);
		condition();
		state._fsp--;
		if (state.failed) return;
		match(input,K_ELSE,FOLLOW_K_ELSE_in_synpred20_Vhdl2511); if (state.failed) return;
		}

	}
	// $ANTLR end synpred20_Vhdl

	// $ANTLR start synpred21_Vhdl
	public final void synpred21_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:439:5: ( block_configuration )
		// Vhdl.g:439:6: block_configuration
		{
		pushFollow(FOLLOW_block_configuration_in_synpred21_Vhdl2619);
		block_configuration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred21_Vhdl

	// $ANTLR start synpred22_Vhdl
	public final void synpred22_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:476:5: ( object_declaration )
		// Vhdl.g:476:6: object_declaration
		{
		pushFollow(FOLLOW_object_declaration_in_synpred22_Vhdl2773);
		object_declaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred22_Vhdl

	// $ANTLR start synpred23_Vhdl
	public final void synpred23_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:481:5: ( K_GROUP identifier COLON )
		// Vhdl.g:481:6: K_GROUP identifier COLON
		{
		match(input,K_GROUP,FOLLOW_K_GROUP_in_synpred23_Vhdl2812); if (state.failed) return;
		pushFollow(FOLLOW_identifier_in_synpred23_Vhdl2814);
		identifier();
		state._fsp--;
		if (state.failed) return;
		match(input,COLON,FOLLOW_COLON_in_synpred23_Vhdl2816); if (state.failed) return;
		}

	}
	// $ANTLR end synpred23_Vhdl

	// $ANTLR start synpred24_Vhdl
	public final void synpred24_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:517:5: ( range )
		// Vhdl.g:517:6: range
		{
		pushFollow(FOLLOW_range_in_synpred24_Vhdl2972);
		range();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred24_Vhdl

	// $ANTLR start synpred25_Vhdl
	public final void synpred25_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:522:6: ( choices EQGRT )
		// Vhdl.g:522:7: choices EQGRT
		{
		pushFollow(FOLLOW_choices_in_synpred25_Vhdl2995);
		choices();
		state._fsp--;
		if (state.failed) return;
		match(input,EQGRT,FOLLOW_EQGRT_in_synpred25_Vhdl2997); if (state.failed) return;
		}

	}
	// $ANTLR end synpred25_Vhdl

	// $ANTLR start synpred26_Vhdl
	public final void synpred26_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:573:5: ( subprogram_declaration )
		// Vhdl.g:573:6: subprogram_declaration
		{
		pushFollow(FOLLOW_subprogram_declaration_in_synpred26_Vhdl3273);
		subprogram_declaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred26_Vhdl

	// $ANTLR start synpred27_Vhdl
	public final void synpred27_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:582:5: ( attribute_specification )
		// Vhdl.g:582:6: attribute_specification
		{
		pushFollow(FOLLOW_attribute_specification_in_synpred27_Vhdl3340);
		attribute_specification();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred27_Vhdl

	// $ANTLR start synpred28_Vhdl
	public final void synpred28_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:586:5: ( K_GROUP identifier COLON )
		// Vhdl.g:586:6: K_GROUP identifier COLON
		{
		match(input,K_GROUP,FOLLOW_K_GROUP_in_synpred28_Vhdl3371); if (state.failed) return;
		pushFollow(FOLLOW_identifier_in_synpred28_Vhdl3373);
		identifier();
		state._fsp--;
		if (state.failed) return;
		match(input,COLON,FOLLOW_COLON_in_synpred28_Vhdl3375); if (state.failed) return;
		}

	}
	// $ANTLR end synpred28_Vhdl

	// $ANTLR start synpred29_Vhdl
	public final void synpred29_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:613:5: ( concurrent_assertion_statement )
		// Vhdl.g:613:6: concurrent_assertion_statement
		{
		pushFollow(FOLLOW_concurrent_assertion_statement_in_synpred29_Vhdl3492);
		concurrent_assertion_statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred29_Vhdl

	// $ANTLR start synpred30_Vhdl
	public final void synpred30_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:614:5: ( concurrent_procedure_call_statement )
		// Vhdl.g:614:6: concurrent_procedure_call_statement
		{
		pushFollow(FOLLOW_concurrent_procedure_call_statement_in_synpred30_Vhdl3503);
		concurrent_procedure_call_statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred30_Vhdl

	// $ANTLR start synpred31_Vhdl
	public final void synpred31_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:768:5: ( discrete_range )
		// Vhdl.g:768:6: discrete_range
		{
		pushFollow(FOLLOW_discrete_range_in_synpred31_Vhdl4270);
		discrete_range();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred31_Vhdl

	// $ANTLR start synpred32_Vhdl
	public final void synpred32_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:794:5: ( interface_constant_declaration )
		// Vhdl.g:794:6: interface_constant_declaration
		{
		pushFollow(FOLLOW_interface_constant_declaration_in_synpred32_Vhdl4422);
		interface_constant_declaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred32_Vhdl

	// $ANTLR start synpred33_Vhdl
	public final void synpred33_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:795:5: ( interface_signal_declaration )
		// Vhdl.g:795:6: interface_signal_declaration
		{
		pushFollow(FOLLOW_interface_signal_declaration_in_synpred33_Vhdl4433);
		interface_signal_declaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred33_Vhdl

	// $ANTLR start synpred34_Vhdl
	public final void synpred34_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:840:5: ( K_ARCHITECTURE | K_PACKAGE K_BODY )
		int alt245=2;
		int LA245_0 = input.LA(1);
		if ( (LA245_0==K_ARCHITECTURE) ) {
			alt245=1;
		}
		else if ( (LA245_0==K_PACKAGE) ) {
			alt245=2;
		}

		else {
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 245, 0, input);
			throw nvae;
		}

		switch (alt245) {
			case 1 :
				// Vhdl.g:840:6: K_ARCHITECTURE
				{
				match(input,K_ARCHITECTURE,FOLLOW_K_ARCHITECTURE_in_synpred34_Vhdl4656); if (state.failed) return;
				}
				break;
			case 2 :
				// Vhdl.g:840:23: K_PACKAGE K_BODY
				{
				match(input,K_PACKAGE,FOLLOW_K_PACKAGE_in_synpred34_Vhdl4660); if (state.failed) return;
				match(input,K_BODY,FOLLOW_K_BODY_in_synpred34_Vhdl4662); if (state.failed) return;
				}
				break;

		}
	}
	// $ANTLR end synpred34_Vhdl

	// $ANTLR start synpred35_Vhdl
	public final void synpred35_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:845:5: ( numeric_literal )
		// Vhdl.g:845:6: numeric_literal
		{
		pushFollow(FOLLOW_numeric_literal_in_synpred35_Vhdl4684);
		numeric_literal();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred35_Vhdl

	// $ANTLR start synpred36_Vhdl
	public final void synpred36_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:914:13: ( LPAREN expression ( COMMA expression )* RPAREN )
		// Vhdl.g:914:14: LPAREN expression ( COMMA expression )* RPAREN
		{
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred36_Vhdl5046); if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred36_Vhdl5048);
		expression();
		state._fsp--;
		if (state.failed) return;
		// Vhdl.g:914:32: ( COMMA expression )*
		loop246:
		while (true) {
			int alt246=2;
			int LA246_0 = input.LA(1);
			if ( (LA246_0==COMMA) ) {
				alt246=1;
			}

			switch (alt246) {
			case 1 :
				// Vhdl.g:914:33: COMMA expression
				{
				match(input,COMMA,FOLLOW_COMMA_in_synpred36_Vhdl5051); if (state.failed) return;
				pushFollow(FOLLOW_expression_in_synpred36_Vhdl5053);
				expression();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				break loop246;
			}
		}

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred36_Vhdl5057); if (state.failed) return;
		}

	}
	// $ANTLR end synpred36_Vhdl

	// $ANTLR start synpred37_Vhdl
	public final void synpred37_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:916:13: ( LPAREN actual_parameter_part RPAREN )
		// Vhdl.g:916:14: LPAREN actual_parameter_part RPAREN
		{
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred37_Vhdl5097); if (state.failed) return;
		pushFollow(FOLLOW_actual_parameter_part_in_synpred37_Vhdl5099);
		actual_parameter_part();
		state._fsp--;
		if (state.failed) return;
		match(input,RPAREN,FOLLOW_RPAREN_in_synpred37_Vhdl5101); if (state.failed) return;
		}

	}
	// $ANTLR end synpred37_Vhdl

	// $ANTLR start synpred38_Vhdl
	public final void synpred38_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:931:5: ( abstract_literal )
		// Vhdl.g:931:6: abstract_literal
		{
		pushFollow(FOLLOW_abstract_literal_in_synpred38_Vhdl5204);
		abstract_literal();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred38_Vhdl

	// $ANTLR start synpred39_Vhdl
	public final void synpred39_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:961:5: ( subprogram_declaration )
		// Vhdl.g:961:6: subprogram_declaration
		{
		pushFollow(FOLLOW_subprogram_declaration_in_synpred39_Vhdl5327);
		subprogram_declaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred39_Vhdl

	// $ANTLR start synpred40_Vhdl
	public final void synpred40_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:970:5: ( K_GROUP identifier COLON )
		// Vhdl.g:970:6: K_GROUP identifier COLON
		{
		match(input,K_GROUP,FOLLOW_K_GROUP_in_synpred40_Vhdl5394); if (state.failed) return;
		pushFollow(FOLLOW_identifier_in_synpred40_Vhdl5396);
		identifier();
		state._fsp--;
		if (state.failed) return;
		match(input,COLON,FOLLOW_COLON_in_synpred40_Vhdl5398); if (state.failed) return;
		}

	}
	// $ANTLR end synpred40_Vhdl

	// $ANTLR start synpred41_Vhdl
	public final void synpred41_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:993:5: ( attribute_specification )
		// Vhdl.g:993:6: attribute_specification
		{
		pushFollow(FOLLOW_attribute_specification_in_synpred41_Vhdl5536);
		attribute_specification();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred41_Vhdl

	// $ANTLR start synpred42_Vhdl
	public final void synpred42_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:997:5: ( K_GROUP identifier COLON )
		// Vhdl.g:997:6: K_GROUP identifier COLON
		{
		match(input,K_GROUP,FOLLOW_K_GROUP_in_synpred42_Vhdl5567); if (state.failed) return;
		pushFollow(FOLLOW_identifier_in_synpred42_Vhdl5569);
		identifier();
		state._fsp--;
		if (state.failed) return;
		match(input,COLON,FOLLOW_COLON_in_synpred42_Vhdl5571); if (state.failed) return;
		}

	}
	// $ANTLR end synpred42_Vhdl

	// $ANTLR start synpred43_Vhdl
	public final void synpred43_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:1033:4: ( name ( signature )? tic_attribute_designator )
		// Vhdl.g:1033:5: name ( signature )? tic_attribute_designator
		{
		pushFollow(FOLLOW_name_in_synpred43_Vhdl5733);
		name();
		state._fsp--;
		if (state.failed) return;
		// Vhdl.g:1033:10: ( signature )?
		int alt247=2;
		int LA247_0 = input.LA(1);
		if ( (LA247_0==LBRACK) ) {
			alt247=1;
		}
		switch (alt247) {
			case 1 :
				// Vhdl.g:1033:11: signature
				{
				pushFollow(FOLLOW_signature_in_synpred43_Vhdl5736);
				signature();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		pushFollow(FOLLOW_tic_attribute_designator_in_synpred43_Vhdl5740);
		tic_attribute_designator();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred43_Vhdl

	// $ANTLR start synpred44_Vhdl
	public final void synpred44_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:1035:3: ( name TIC )
		// Vhdl.g:1035:4: name TIC
		{
		pushFollow(FOLLOW_name_in_synpred44_Vhdl5765);
		name();
		state._fsp--;
		if (state.failed) return;
		match(input,TIC,FOLLOW_TIC_in_synpred44_Vhdl5767); if (state.failed) return;
		}

	}
	// $ANTLR end synpred44_Vhdl

	// $ANTLR start synpred45_Vhdl
	public final void synpred45_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:1036:3: ( LPAREN expression RPAREN )
		// Vhdl.g:1036:4: LPAREN expression RPAREN
		{
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred45_Vhdl5776); if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred45_Vhdl5778);
		expression();
		state._fsp--;
		if (state.failed) return;
		match(input,RPAREN,FOLLOW_RPAREN_in_synpred45_Vhdl5780); if (state.failed) return;
		}

	}
	// $ANTLR end synpred45_Vhdl

	// $ANTLR start synpred46_Vhdl
	public final void synpred46_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:1057:5: ( subprogram_declaration )
		// Vhdl.g:1057:6: subprogram_declaration
		{
		pushFollow(FOLLOW_subprogram_declaration_in_synpred46_Vhdl5884);
		subprogram_declaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred46_Vhdl

	// $ANTLR start synpred47_Vhdl
	public final void synpred47_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:1065:5: ( attribute_specification )
		// Vhdl.g:1065:6: attribute_specification
		{
		pushFollow(FOLLOW_attribute_specification_in_synpred47_Vhdl5945);
		attribute_specification();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred47_Vhdl

	// $ANTLR start synpred48_Vhdl
	public final void synpred48_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:1068:5: ( K_GROUP identifier COLON )
		// Vhdl.g:1068:6: K_GROUP identifier COLON
		{
		match(input,K_GROUP,FOLLOW_K_GROUP_in_synpred48_Vhdl5969); if (state.failed) return;
		pushFollow(FOLLOW_identifier_in_synpred48_Vhdl5971);
		identifier();
		state._fsp--;
		if (state.failed) return;
		match(input,COLON,FOLLOW_COLON_in_synpred48_Vhdl5973); if (state.failed) return;
		}

	}
	// $ANTLR end synpred48_Vhdl

	// $ANTLR start synpred49_Vhdl
	public final void synpred49_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:1092:5: ( subprogram_declaration )
		// Vhdl.g:1092:6: subprogram_declaration
		{
		pushFollow(FOLLOW_subprogram_declaration_in_synpred49_Vhdl6132);
		subprogram_declaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred49_Vhdl

	// $ANTLR start synpred50_Vhdl
	public final void synpred50_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:1100:5: ( attribute_specification )
		// Vhdl.g:1100:6: attribute_specification
		{
		pushFollow(FOLLOW_attribute_specification_in_synpred50_Vhdl6193);
		attribute_specification();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred50_Vhdl

	// $ANTLR start synpred51_Vhdl
	public final void synpred51_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:1103:5: ( K_GROUP identifier COLON )
		// Vhdl.g:1103:6: K_GROUP identifier COLON
		{
		match(input,K_GROUP,FOLLOW_K_GROUP_in_synpred51_Vhdl6217); if (state.failed) return;
		pushFollow(FOLLOW_identifier_in_synpred51_Vhdl6219);
		identifier();
		state._fsp--;
		if (state.failed) return;
		match(input,COLON,FOLLOW_COLON_in_synpred51_Vhdl6221); if (state.failed) return;
		}

	}
	// $ANTLR end synpred51_Vhdl

	// $ANTLR start synpred52_Vhdl
	public final void synpred52_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:1133:4: ( aggregate )
		// Vhdl.g:1133:5: aggregate
		{
		pushFollow(FOLLOW_aggregate_in_synpred52_Vhdl6349);
		aggregate();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred52_Vhdl

	// $ANTLR start synpred53_Vhdl
	public final void synpred53_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:1139:5: ( simple_expression direction simple_expression )
		// Vhdl.g:1139:6: simple_expression direction simple_expression
		{
		pushFollow(FOLLOW_simple_expression_in_synpred53_Vhdl6380);
		simple_expression();
		state._fsp--;
		if (state.failed) return;
		pushFollow(FOLLOW_direction_in_synpred53_Vhdl6382);
		direction();
		state._fsp--;
		if (state.failed) return;
		pushFollow(FOLLOW_simple_expression_in_synpred53_Vhdl6384);
		simple_expression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred53_Vhdl

	// $ANTLR start synpred54_Vhdl
	public final void synpred54_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:1176:5: ( range_constraint )
		// Vhdl.g:1176:6: range_constraint
		{
		pushFollow(FOLLOW_range_constraint_in_synpred54_Vhdl6587);
		range_constraint();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred54_Vhdl

	// $ANTLR start synpred55_Vhdl
	public final void synpred55_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:1210:5: ( ( label_colon )? K_WAIT )
		// Vhdl.g:1210:6: ( label_colon )? K_WAIT
		{
		// Vhdl.g:1210:6: ( label_colon )?
		int alt248=2;
		int LA248_0 = input.LA(1);
		if ( (LA248_0==BASIC_IDENTIFIER||LA248_0==EXTENDED_IDENTIFIER) ) {
			alt248=1;
		}
		switch (alt248) {
			case 1 :
				// Vhdl.g:1210:7: label_colon
				{
				pushFollow(FOLLOW_label_colon_in_synpred55_Vhdl6740);
				label_colon();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		match(input,K_WAIT,FOLLOW_K_WAIT_in_synpred55_Vhdl6744); if (state.failed) return;
		}

	}
	// $ANTLR end synpred55_Vhdl

	// $ANTLR start synpred56_Vhdl
	public final void synpred56_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:1211:5: ( ( label_colon )? K_ASSERT )
		// Vhdl.g:1211:6: ( label_colon )? K_ASSERT
		{
		// Vhdl.g:1211:6: ( label_colon )?
		int alt249=2;
		int LA249_0 = input.LA(1);
		if ( (LA249_0==BASIC_IDENTIFIER||LA249_0==EXTENDED_IDENTIFIER) ) {
			alt249=1;
		}
		switch (alt249) {
			case 1 :
				// Vhdl.g:1211:7: label_colon
				{
				pushFollow(FOLLOW_label_colon_in_synpred56_Vhdl6757);
				label_colon();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		match(input,K_ASSERT,FOLLOW_K_ASSERT_in_synpred56_Vhdl6761); if (state.failed) return;
		}

	}
	// $ANTLR end synpred56_Vhdl

	// $ANTLR start synpred57_Vhdl
	public final void synpred57_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:1212:5: ( ( label_colon )? K_REPORT )
		// Vhdl.g:1212:6: ( label_colon )? K_REPORT
		{
		// Vhdl.g:1212:6: ( label_colon )?
		int alt250=2;
		int LA250_0 = input.LA(1);
		if ( (LA250_0==BASIC_IDENTIFIER||LA250_0==EXTENDED_IDENTIFIER) ) {
			alt250=1;
		}
		switch (alt250) {
			case 1 :
				// Vhdl.g:1212:7: label_colon
				{
				pushFollow(FOLLOW_label_colon_in_synpred57_Vhdl6774);
				label_colon();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		match(input,K_REPORT,FOLLOW_K_REPORT_in_synpred57_Vhdl6778); if (state.failed) return;
		}

	}
	// $ANTLR end synpred57_Vhdl

	// $ANTLR start synpred58_Vhdl
	public final void synpred58_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:1213:5: ( ( label_colon )? K_IF )
		// Vhdl.g:1213:6: ( label_colon )? K_IF
		{
		// Vhdl.g:1213:6: ( label_colon )?
		int alt251=2;
		int LA251_0 = input.LA(1);
		if ( (LA251_0==BASIC_IDENTIFIER||LA251_0==EXTENDED_IDENTIFIER) ) {
			alt251=1;
		}
		switch (alt251) {
			case 1 :
				// Vhdl.g:1213:7: label_colon
				{
				pushFollow(FOLLOW_label_colon_in_synpred58_Vhdl6791);
				label_colon();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		match(input,K_IF,FOLLOW_K_IF_in_synpred58_Vhdl6795); if (state.failed) return;
		}

	}
	// $ANTLR end synpred58_Vhdl

	// $ANTLR start synpred59_Vhdl
	public final void synpred59_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:1214:5: ( ( label_colon )? K_CASE )
		// Vhdl.g:1214:6: ( label_colon )? K_CASE
		{
		// Vhdl.g:1214:6: ( label_colon )?
		int alt252=2;
		int LA252_0 = input.LA(1);
		if ( (LA252_0==BASIC_IDENTIFIER||LA252_0==EXTENDED_IDENTIFIER) ) {
			alt252=1;
		}
		switch (alt252) {
			case 1 :
				// Vhdl.g:1214:7: label_colon
				{
				pushFollow(FOLLOW_label_colon_in_synpred59_Vhdl6808);
				label_colon();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		match(input,K_CASE,FOLLOW_K_CASE_in_synpred59_Vhdl6812); if (state.failed) return;
		}

	}
	// $ANTLR end synpred59_Vhdl

	// $ANTLR start synpred60_Vhdl
	public final void synpred60_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:1215:5: ( ( label_colon )? K_NEXT )
		// Vhdl.g:1215:6: ( label_colon )? K_NEXT
		{
		// Vhdl.g:1215:6: ( label_colon )?
		int alt253=2;
		int LA253_0 = input.LA(1);
		if ( (LA253_0==BASIC_IDENTIFIER||LA253_0==EXTENDED_IDENTIFIER) ) {
			alt253=1;
		}
		switch (alt253) {
			case 1 :
				// Vhdl.g:1215:7: label_colon
				{
				pushFollow(FOLLOW_label_colon_in_synpred60_Vhdl6825);
				label_colon();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		match(input,K_NEXT,FOLLOW_K_NEXT_in_synpred60_Vhdl6829); if (state.failed) return;
		}

	}
	// $ANTLR end synpred60_Vhdl

	// $ANTLR start synpred61_Vhdl
	public final void synpred61_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:1216:5: ( ( label_colon )? K_EXIT )
		// Vhdl.g:1216:6: ( label_colon )? K_EXIT
		{
		// Vhdl.g:1216:6: ( label_colon )?
		int alt254=2;
		int LA254_0 = input.LA(1);
		if ( (LA254_0==BASIC_IDENTIFIER||LA254_0==EXTENDED_IDENTIFIER) ) {
			alt254=1;
		}
		switch (alt254) {
			case 1 :
				// Vhdl.g:1216:7: label_colon
				{
				pushFollow(FOLLOW_label_colon_in_synpred61_Vhdl6842);
				label_colon();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		match(input,K_EXIT,FOLLOW_K_EXIT_in_synpred61_Vhdl6846); if (state.failed) return;
		}

	}
	// $ANTLR end synpred61_Vhdl

	// $ANTLR start synpred62_Vhdl
	public final void synpred62_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:1217:5: ( ( label_colon )? K_RETURN )
		// Vhdl.g:1217:6: ( label_colon )? K_RETURN
		{
		// Vhdl.g:1217:6: ( label_colon )?
		int alt255=2;
		int LA255_0 = input.LA(1);
		if ( (LA255_0==BASIC_IDENTIFIER||LA255_0==EXTENDED_IDENTIFIER) ) {
			alt255=1;
		}
		switch (alt255) {
			case 1 :
				// Vhdl.g:1217:7: label_colon
				{
				pushFollow(FOLLOW_label_colon_in_synpred62_Vhdl6859);
				label_colon();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		match(input,K_RETURN,FOLLOW_K_RETURN_in_synpred62_Vhdl6863); if (state.failed) return;
		}

	}
	// $ANTLR end synpred62_Vhdl

	// $ANTLR start synpred63_Vhdl
	public final void synpred63_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:1218:5: ( ( label_colon )? K_NULL )
		// Vhdl.g:1218:6: ( label_colon )? K_NULL
		{
		// Vhdl.g:1218:6: ( label_colon )?
		int alt256=2;
		int LA256_0 = input.LA(1);
		if ( (LA256_0==BASIC_IDENTIFIER||LA256_0==EXTENDED_IDENTIFIER) ) {
			alt256=1;
		}
		switch (alt256) {
			case 1 :
				// Vhdl.g:1218:7: label_colon
				{
				pushFollow(FOLLOW_label_colon_in_synpred63_Vhdl6876);
				label_colon();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		match(input,K_NULL,FOLLOW_K_NULL_in_synpred63_Vhdl6880); if (state.failed) return;
		}

	}
	// $ANTLR end synpred63_Vhdl

	// $ANTLR start synpred64_Vhdl
	public final void synpred64_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:1219:5: ( loop_statement )
		// Vhdl.g:1219:6: loop_statement
		{
		pushFollow(FOLLOW_loop_statement_in_synpred64_Vhdl6891);
		loop_statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred64_Vhdl

	// $ANTLR start synpred65_Vhdl
	public final void synpred65_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:1220:5: ( procedure_call_statement )
		// Vhdl.g:1220:6: procedure_call_statement
		{
		pushFollow(FOLLOW_procedure_call_statement_in_synpred65_Vhdl6904);
		procedure_call_statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred65_Vhdl

	// $ANTLR start synpred66_Vhdl
	public final void synpred66_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:1221:5: ( variable_assignment_statement )
		// Vhdl.g:1221:6: variable_assignment_statement
		{
		pushFollow(FOLLOW_variable_assignment_statement_in_synpred66_Vhdl6917);
		variable_assignment_statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred66_Vhdl

	// $ANTLR start synpred67_Vhdl
	public final void synpred67_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:1291:5: ( subprogram_declaration )
		// Vhdl.g:1291:6: subprogram_declaration
		{
		pushFollow(FOLLOW_subprogram_declaration_in_synpred67_Vhdl7281);
		subprogram_declaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred67_Vhdl

	// $ANTLR start synpred68_Vhdl
	public final void synpred68_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:1299:5: ( attribute_specification )
		// Vhdl.g:1299:6: attribute_specification
		{
		pushFollow(FOLLOW_attribute_specification_in_synpred68_Vhdl7342);
		attribute_specification();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred68_Vhdl

	// $ANTLR start synpred69_Vhdl
	public final void synpred69_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:1302:5: ( K_GROUP identifier COLON )
		// Vhdl.g:1302:6: K_GROUP identifier COLON
		{
		match(input,K_GROUP,FOLLOW_K_GROUP_in_synpred69_Vhdl7366); if (state.failed) return;
		pushFollow(FOLLOW_identifier_in_synpred69_Vhdl7368);
		identifier();
		state._fsp--;
		if (state.failed) return;
		match(input,COLON,FOLLOW_COLON_in_synpred69_Vhdl7370); if (state.failed) return;
		}

	}
	// $ANTLR end synpred69_Vhdl

	// $ANTLR start synpred70_Vhdl
	public final void synpred70_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:1354:5: ( full_type_declaration )
		// Vhdl.g:1354:6: full_type_declaration
		{
		pushFollow(FOLLOW_full_type_declaration_in_synpred70_Vhdl7620);
		full_type_declaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred70_Vhdl

	// Delegated rules

	public final boolean synpred43_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred43_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred38_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred38_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred20_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred20_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred67_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred67_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred57_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred57_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred33_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred33_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred32_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred32_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred56_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred56_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred15_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred15_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred17_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred17_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred25_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred25_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred50_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred50_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred59_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred59_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred65_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred65_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred10_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred10_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred36_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred36_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred19_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred19_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred42_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred42_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred4_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred28_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred28_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred60_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred60_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred58_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred58_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred26_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred26_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred68_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred68_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred47_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred47_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred35_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred35_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred69_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred69_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred64_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred64_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred62_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred62_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred37_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred37_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred63_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred63_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred41_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred41_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred9_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred9_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred34_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred34_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred44_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred44_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred70_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred70_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred48_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred48_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred11_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred11_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred55_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred55_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred12_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred12_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred39_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred39_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred18_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred18_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred6_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred6_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred53_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred53_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred22_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred22_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred31_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred31_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred27_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred27_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred46_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred46_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred54_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred54_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred45_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred45_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred8_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred8_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred29_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred29_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred24_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred24_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred61_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred61_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred52_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred52_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred49_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred49_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred13_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred13_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred30_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred30_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred51_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred51_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred14_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred14_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred7_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred7_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred23_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred23_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred66_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred66_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred21_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred21_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred5_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred5_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred40_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred40_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred16_Vhdl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred16_Vhdl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA8 dfa8 = new DFA8(this);
	protected DFA38 dfa38 = new DFA38(this);
	protected DFA77 dfa77 = new DFA77(this);
	protected DFA120 dfa120 = new DFA120(this);
	protected DFA140 dfa140 = new DFA140(this);
	protected DFA149 dfa149 = new DFA149(this);
	protected DFA154 dfa154 = new DFA154(this);
	protected DFA168 dfa168 = new DFA168(this);
	protected DFA189 dfa189 = new DFA189(this);
	static final String DFA8_eotS =
		"\120\uffff";
	static final String DFA8_eofS =
		"\1\uffff\1\26\1\74\115\uffff";
	static final String DFA8_minS =
		"\1\13\2\4\5\0\41\uffff\5\0\42\uffff";
	static final String DFA8_maxS =
		"\1\u009e\2\u00a0\5\0\41\uffff\5\0\42\uffff";
	static final String DFA8_acceptS =
		"\10\uffff\41\1\5\uffff\41\1\1\2";
	static final String DFA8_specialS =
		"\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\41\uffff\1\7\1\10\1\11\1\12\1\13"+
		"\42\uffff}>";
	static final String[] DFA8_transitionS = {
			"\1\1\23\uffff\1\1\176\uffff\1\2",
			"\1\15\1\uffff\1\16\4\uffff\1\10\7\uffff\1\30\1\20\4\uffff\1\3\1\36\1"+
			"\17\3\uffff\1\10\2\uffff\2\36\3\uffff\1\47\2\uffff\1\37\10\uffff\1\32"+
			"\5\uffff\1\22\1\43\5\uffff\1\42\1\uffff\1\24\6\uffff\1\45\1\uffff\1\27"+
			"\4\uffff\1\25\1\uffff\1\14\1\37\2\uffff\1\37\4\uffff\1\31\1\37\11\uffff"+
			"\1\12\1\uffff\1\33\1\uffff\1\14\1\41\1\uffff\2\35\1\46\1\40\2\uffff\4"+
			"\35\1\uffff\1\44\1\22\3\uffff\1\34\4\uffff\1\50\2\uffff\2\37\1\5\3\uffff"+
			"\1\7\2\36\1\uffff\1\15\2\uffff\1\15\5\uffff\1\23\1\21\1\14\1\36\1\14"+
			"\1\13\1\11\1\4\1\6",
			"\1\63\1\uffff\1\64\4\uffff\1\56\7\uffff\1\76\1\66\4\uffff\1\51\1\104"+
			"\1\65\3\uffff\1\56\2\uffff\2\104\3\uffff\1\115\2\uffff\1\105\10\uffff"+
			"\1\100\5\uffff\1\70\1\111\5\uffff\1\110\1\uffff\1\72\6\uffff\1\113\1"+
			"\uffff\1\75\4\uffff\1\73\1\uffff\1\62\1\105\2\uffff\1\105\4\uffff\1\77"+
			"\1\105\11\uffff\1\60\1\uffff\1\101\1\uffff\1\62\1\107\1\uffff\2\103\1"+
			"\114\1\106\2\uffff\4\103\1\uffff\1\112\1\70\3\uffff\1\102\4\uffff\1\116"+
			"\2\uffff\2\105\1\53\3\uffff\1\55\2\104\1\uffff\1\63\2\uffff\1\63\5\uffff"+
			"\1\71\1\67\1\62\1\104\1\62\1\61\1\57\1\52\1\54",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "190:9: ( ( subtype_indication )=> subtype_indication | qualified_expression )";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA8_1 = input.LA(1);
						 
						int index8_1 = input.index();
						input.rewind();
						s = -1;
						if ( (LA8_1==DOT) ) {s = 3;}
						else if ( (LA8_1==TIC) ) {s = 4;}
						else if ( (LA8_1==LBRACK) ) {s = 5;}
						else if ( (LA8_1==TIC_SIMPLE_NAME) ) {s = 6;}
						else if ( (LA8_1==LPAREN) ) {s = 7;}
						else if ( (LA8_1==BASIC_IDENTIFIER||LA8_1==EXTENDED_IDENTIFIER) && (synpred2_Vhdl())) {s = 8;}
						else if ( (LA8_1==STRING_LITERAL) && (synpred2_Vhdl())) {s = 9;}
						else if ( (LA8_1==K_RANGE) && (synpred2_Vhdl())) {s = 10;}
						else if ( (LA8_1==STAR2) && (synpred2_Vhdl())) {s = 11;}
						else if ( (LA8_1==K_MOD||LA8_1==K_REM||LA8_1==SLASH||LA8_1==STAR) && (synpred2_Vhdl())) {s = 12;}
						else if ( (LA8_1==AND||LA8_1==MINUS||LA8_1==PLUS) && (synpred2_Vhdl())) {s = 13;}
						else if ( (LA8_1==BAR) && (synpred2_Vhdl())) {s = 14;}
						else if ( (LA8_1==EQGRT) && (synpred2_Vhdl())) {s = 15;}
						else if ( (LA8_1==COMMA) && (synpred2_Vhdl())) {s = 16;}
						else if ( (LA8_1==SEMI) && (synpred2_Vhdl())) {s = 17;}
						else if ( (LA8_1==K_DOWNTO||LA8_1==K_TO) && (synpred2_Vhdl())) {s = 18;}
						else if ( (LA8_1==RPAREN) && (synpred2_Vhdl())) {s = 19;}
						else if ( (LA8_1==K_GENERATE) && (synpred2_Vhdl())) {s = 20;}
						else if ( (LA8_1==K_LOOP) && (synpred2_Vhdl())) {s = 21;}
						else if ( (LA8_1==EOF) && (synpred2_Vhdl())) {s = 22;}
						else if ( (LA8_1==K_IS) && (synpred2_Vhdl())) {s = 23;}
						else if ( (LA8_1==COLONEQ) && (synpred2_Vhdl())) {s = 24;}
						else if ( (LA8_1==K_OPEN) && (synpred2_Vhdl())) {s = 25;}
						else if ( (LA8_1==K_BUS) && (synpred2_Vhdl())) {s = 26;}
						else if ( (LA8_1==K_REGISTER) && (synpred2_Vhdl())) {s = 27;}
						else if ( (LA8_1==K_UNITS) && (synpred2_Vhdl())) {s = 28;}
						else if ( ((LA8_1 >= K_ROL && LA8_1 <= K_ROR)||(LA8_1 >= K_SLA && LA8_1 <= K_SRL)) && (synpred2_Vhdl())) {s = 29;}
						else if ( (LA8_1==EQ||(LA8_1 >= GRT && LA8_1 <= GRTEQ)||(LA8_1 >= LST && LA8_1 <= LSTEQ)||LA8_1==SLASHEQ) && (synpred2_Vhdl())) {s = 30;}
						else if ( (LA8_1==K_AND||LA8_1==K_NAND||LA8_1==K_NOR||LA8_1==K_OR||(LA8_1 >= K_XNOR && LA8_1 <= K_XOR)) && (synpred2_Vhdl())) {s = 31;}
						else if ( (LA8_1==K_SEVERITY) && (synpred2_Vhdl())) {s = 32;}
						else if ( (LA8_1==K_REPORT) && (synpred2_Vhdl())) {s = 33;}
						else if ( (LA8_1==K_FOR) && (synpred2_Vhdl())) {s = 34;}
						else if ( (LA8_1==K_ELSE) && (synpred2_Vhdl())) {s = 35;}
						else if ( (LA8_1==K_THEN) && (synpred2_Vhdl())) {s = 36;}
						else if ( (LA8_1==K_INERTIAL) && (synpred2_Vhdl())) {s = 37;}
						else if ( (LA8_1==K_SELECT) && (synpred2_Vhdl())) {s = 38;}
						else if ( (LA8_1==K_AFTER) && (synpred2_Vhdl())) {s = 39;}
						else if ( (LA8_1==K_WHEN) && (synpred2_Vhdl())) {s = 40;}
						 
						input.seek(index8_1);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA8_2 = input.LA(1);
						 
						int index8_2 = input.index();
						input.rewind();
						s = -1;
						if ( (LA8_2==DOT) ) {s = 41;}
						else if ( (LA8_2==TIC) ) {s = 42;}
						else if ( (LA8_2==LBRACK) ) {s = 43;}
						else if ( (LA8_2==TIC_SIMPLE_NAME) ) {s = 44;}
						else if ( (LA8_2==LPAREN) ) {s = 45;}
						else if ( (LA8_2==BASIC_IDENTIFIER||LA8_2==EXTENDED_IDENTIFIER) && (synpred2_Vhdl())) {s = 46;}
						else if ( (LA8_2==STRING_LITERAL) && (synpred2_Vhdl())) {s = 47;}
						else if ( (LA8_2==K_RANGE) && (synpred2_Vhdl())) {s = 48;}
						else if ( (LA8_2==STAR2) && (synpred2_Vhdl())) {s = 49;}
						else if ( (LA8_2==K_MOD||LA8_2==K_REM||LA8_2==SLASH||LA8_2==STAR) && (synpred2_Vhdl())) {s = 50;}
						else if ( (LA8_2==AND||LA8_2==MINUS||LA8_2==PLUS) && (synpred2_Vhdl())) {s = 51;}
						else if ( (LA8_2==BAR) && (synpred2_Vhdl())) {s = 52;}
						else if ( (LA8_2==EQGRT) && (synpred2_Vhdl())) {s = 53;}
						else if ( (LA8_2==COMMA) && (synpred2_Vhdl())) {s = 54;}
						else if ( (LA8_2==SEMI) && (synpred2_Vhdl())) {s = 55;}
						else if ( (LA8_2==K_DOWNTO||LA8_2==K_TO) && (synpred2_Vhdl())) {s = 56;}
						else if ( (LA8_2==RPAREN) && (synpred2_Vhdl())) {s = 57;}
						else if ( (LA8_2==K_GENERATE) && (synpred2_Vhdl())) {s = 58;}
						else if ( (LA8_2==K_LOOP) && (synpred2_Vhdl())) {s = 59;}
						else if ( (LA8_2==EOF) && (synpred2_Vhdl())) {s = 60;}
						else if ( (LA8_2==K_IS) && (synpred2_Vhdl())) {s = 61;}
						else if ( (LA8_2==COLONEQ) && (synpred2_Vhdl())) {s = 62;}
						else if ( (LA8_2==K_OPEN) && (synpred2_Vhdl())) {s = 63;}
						else if ( (LA8_2==K_BUS) && (synpred2_Vhdl())) {s = 64;}
						else if ( (LA8_2==K_REGISTER) && (synpred2_Vhdl())) {s = 65;}
						else if ( (LA8_2==K_UNITS) && (synpred2_Vhdl())) {s = 66;}
						else if ( ((LA8_2 >= K_ROL && LA8_2 <= K_ROR)||(LA8_2 >= K_SLA && LA8_2 <= K_SRL)) && (synpred2_Vhdl())) {s = 67;}
						else if ( (LA8_2==EQ||(LA8_2 >= GRT && LA8_2 <= GRTEQ)||(LA8_2 >= LST && LA8_2 <= LSTEQ)||LA8_2==SLASHEQ) && (synpred2_Vhdl())) {s = 68;}
						else if ( (LA8_2==K_AND||LA8_2==K_NAND||LA8_2==K_NOR||LA8_2==K_OR||(LA8_2 >= K_XNOR && LA8_2 <= K_XOR)) && (synpred2_Vhdl())) {s = 69;}
						else if ( (LA8_2==K_SEVERITY) && (synpred2_Vhdl())) {s = 70;}
						else if ( (LA8_2==K_REPORT) && (synpred2_Vhdl())) {s = 71;}
						else if ( (LA8_2==K_FOR) && (synpred2_Vhdl())) {s = 72;}
						else if ( (LA8_2==K_ELSE) && (synpred2_Vhdl())) {s = 73;}
						else if ( (LA8_2==K_THEN) && (synpred2_Vhdl())) {s = 74;}
						else if ( (LA8_2==K_INERTIAL) && (synpred2_Vhdl())) {s = 75;}
						else if ( (LA8_2==K_SELECT) && (synpred2_Vhdl())) {s = 76;}
						else if ( (LA8_2==K_AFTER) && (synpred2_Vhdl())) {s = 77;}
						else if ( (LA8_2==K_WHEN) && (synpred2_Vhdl())) {s = 78;}
						 
						input.seek(index8_2);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA8_3 = input.LA(1);
						 
						int index8_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Vhdl()) ) {s = 78;}
						else if ( (true) ) {s = 79;}
						 
						input.seek(index8_3);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA8_4 = input.LA(1);
						 
						int index8_4 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Vhdl()) ) {s = 78;}
						else if ( (true) ) {s = 79;}
						 
						input.seek(index8_4);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA8_5 = input.LA(1);
						 
						int index8_5 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Vhdl()) ) {s = 78;}
						else if ( (true) ) {s = 79;}
						 
						input.seek(index8_5);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA8_6 = input.LA(1);
						 
						int index8_6 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Vhdl()) ) {s = 78;}
						else if ( (true) ) {s = 79;}
						 
						input.seek(index8_6);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA8_7 = input.LA(1);
						 
						int index8_7 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Vhdl()) ) {s = 78;}
						else if ( (true) ) {s = 79;}
						 
						input.seek(index8_7);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA8_41 = input.LA(1);
						 
						int index8_41 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Vhdl()) ) {s = 78;}
						else if ( (true) ) {s = 79;}
						 
						input.seek(index8_41);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA8_42 = input.LA(1);
						 
						int index8_42 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Vhdl()) ) {s = 78;}
						else if ( (true) ) {s = 79;}
						 
						input.seek(index8_42);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA8_43 = input.LA(1);
						 
						int index8_43 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Vhdl()) ) {s = 78;}
						else if ( (true) ) {s = 79;}
						 
						input.seek(index8_43);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA8_44 = input.LA(1);
						 
						int index8_44 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Vhdl()) ) {s = 78;}
						else if ( (true) ) {s = 79;}
						 
						input.seek(index8_44);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA8_45 = input.LA(1);
						 
						int index8_45 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Vhdl()) ) {s = 78;}
						else if ( (true) ) {s = 79;}
						 
						input.seek(index8_45);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 8, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA38_eotS =
		"\u0089\uffff";
	static final String DFA38_eofS =
		"\u0089\uffff";
	static final String DFA38_minS =
		"\2\10\2\0\1\10\5\4\1\13\2\10\1\uffff\13\0\43\uffff\20\0\4\uffff\2\0\1"+
		"\uffff\3\0\4\uffff\2\0\1\uffff\3\0\5\uffff\3\0\5\uffff\3\0\5\uffff\24"+
		"\0";
	static final String DFA38_maxS =
		"\2\u009e\2\0\3\u009e\3\u009d\3\u009e\1\uffff\13\0\43\uffff\20\0\4\uffff"+
		"\2\0\1\uffff\3\0\4\uffff\2\0\1\uffff\3\0\5\uffff\3\0\5\uffff\3\0\5\uffff"+
		"\24\0";
	static final String DFA38_acceptS =
		"\15\uffff\1\4\33\uffff\1\1\1\2\1\3\40\uffff\4\1\6\uffff\4\1\6\uffff\4"+
		"\1\4\uffff\4\1\4\uffff\4\1\25\uffff";
	static final String DFA38_specialS =
		"\2\uffff\1\0\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\4\uffff\1\7\1\10\1\11\1\12"+
		"\1\13\1\14\1\15\1\16\1\17\1\20\1\21\43\uffff\1\22\1\23\1\24\1\25\1\26"+
		"\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\4\uffff\1\42\1"+
		"\43\1\uffff\1\44\1\45\1\46\4\uffff\1\47\1\50\1\uffff\1\51\1\52\1\53\5"+
		"\uffff\1\54\1\55\1\56\5\uffff\1\57\1\60\1\61\5\uffff\1\62\1\63\1\64\1"+
		"\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102"+
		"\1\103\1\104\1\105}>";
	static final String[] DFA38_transitionS = {
			"\1\6\2\uffff\1\2\1\10\4\uffff\1\7\4\uffff\1\5\10\uffff\1\2\5\uffff\1"+
			"\13\56\uffff\1\12\2\uffff\1\14\1\11\4\uffff\1\15\55\uffff\1\4\3\uffff"+
			"\1\1\2\uffff\1\1\13\uffff\1\3",
			"\1\22\2\uffff\1\16\1\24\4\uffff\1\23\4\uffff\1\21\10\uffff\1\16\5\uffff"+
			"\1\27\56\uffff\1\26\2\uffff\1\30\1\25\62\uffff\1\20\22\uffff\1\17",
			"\1\uffff",
			"\1\uffff",
			"\1\101\2\uffff\1\75\1\103\4\uffff\1\102\4\uffff\1\100\10\uffff\1\75"+
			"\5\uffff\1\106\56\uffff\1\105\2\uffff\1\107\1\104\4\uffff\1\110\55\uffff"+
			"\1\77\3\uffff\1\74\2\uffff\1\74\13\uffff\1\76",
			"\1\113\1\uffff\1\114\4\uffff\1\120\10\uffff\1\116\6\uffff\1\115\3\uffff"+
			"\1\120\31\uffff\1\53\30\uffff\1\112\27\uffff\1\112\16\uffff\1\53\25\uffff"+
			"\1\113\2\uffff\1\113\6\uffff\1\117\1\112\1\uffff\1\112\1\111\1\121",
			"\1\125\1\uffff\1\126\4\uffff\1\132\10\uffff\1\130\6\uffff\1\127\3\uffff"+
			"\1\132\31\uffff\1\53\30\uffff\1\124\27\uffff\1\124\16\uffff\1\53\25\uffff"+
			"\1\125\2\uffff\1\125\6\uffff\1\131\1\124\1\uffff\1\124\1\123\1\133",
			"\1\137\1\uffff\1\140\15\uffff\1\142\6\uffff\1\141\35\uffff\1\53\30\uffff"+
			"\1\136\27\uffff\1\136\16\uffff\1\53\25\uffff\1\137\2\uffff\1\137\6\uffff"+
			"\1\143\1\136\1\uffff\1\136\1\135",
			"\1\147\1\uffff\1\150\15\uffff\1\152\6\uffff\1\151\35\uffff\1\53\30\uffff"+
			"\1\146\27\uffff\1\146\16\uffff\1\53\25\uffff\1\147\2\uffff\1\147\6\uffff"+
			"\1\153\1\146\1\uffff\1\146\1\145",
			"\1\157\1\uffff\1\160\15\uffff\1\162\6\uffff\1\161\35\uffff\1\53\30\uffff"+
			"\1\156\27\uffff\1\156\16\uffff\1\53\25\uffff\1\157\2\uffff\1\157\6\uffff"+
			"\1\163\1\156\1\uffff\1\156\1\155",
			"\1\165\23\uffff\1\165\176\uffff\1\166",
			"\1\173\2\uffff\1\167\1\175\4\uffff\1\174\4\uffff\1\172\10\uffff\1\167"+
			"\64\uffff\1\177\3\uffff\1\176\62\uffff\1\171\22\uffff\1\170",
			"\1\u0084\2\uffff\1\u0080\1\u0086\4\uffff\1\u0085\4\uffff\1\u0083\10"+
			"\uffff\1\u0080\64\uffff\1\u0088\3\uffff\1\u0087\62\uffff\1\u0082\22\uffff"+
			"\1\u0081",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff"
	};

	static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
	static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
	static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
	static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
	static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
	static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
	static final short[][] DFA38_transition;

	static {
		int numStates = DFA38_transitionS.length;
		DFA38_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
		}
	}

	protected class DFA38 extends DFA {

		public DFA38(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 38;
			this.eot = DFA38_eot;
			this.eof = DFA38_eof;
			this.min = DFA38_min;
			this.max = DFA38_max;
			this.accept = DFA38_accept;
			this.special = DFA38_special;
			this.transition = DFA38_transition;
		}
		@Override
		public String getDescription() {
			return "329:1: choice : ( ( simple_expression )=> simple_expression | ( simple_name )=> simple_name | discrete_range | K_OTHERS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA38_2 = input.LA(1);
						 
						int index38_2 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 41;}
						else if ( (synpred10_Vhdl()) ) {s = 42;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_2);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA38_3 = input.LA(1);
						 
						int index38_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 41;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_3);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA38_5 = input.LA(1);
						 
						int index38_5 = input.index();
						input.rewind();
						s = -1;
						if ( (LA38_5==STAR2) ) {s = 73;}
						else if ( (LA38_5==K_MOD||LA38_5==K_REM||LA38_5==SLASH||LA38_5==STAR) ) {s = 74;}
						else if ( (LA38_5==AND||LA38_5==MINUS||LA38_5==PLUS) ) {s = 75;}
						else if ( (LA38_5==BAR) && (synpred9_Vhdl())) {s = 76;}
						else if ( (LA38_5==EQGRT) && (synpred9_Vhdl())) {s = 77;}
						else if ( (LA38_5==COMMA) && (synpred9_Vhdl())) {s = 78;}
						else if ( (LA38_5==SEMI) && (synpred9_Vhdl())) {s = 79;}
						else if ( (LA38_5==BASIC_IDENTIFIER||LA38_5==EXTENDED_IDENTIFIER) ) {s = 80;}
						else if ( (LA38_5==STRING_LITERAL) ) {s = 81;}
						else if ( (LA38_5==K_DOWNTO||LA38_5==K_TO) ) {s = 43;}
						 
						input.seek(index38_5);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA38_6 = input.LA(1);
						 
						int index38_6 = input.index();
						input.rewind();
						s = -1;
						if ( (LA38_6==STAR2) ) {s = 83;}
						else if ( (LA38_6==K_MOD||LA38_6==K_REM||LA38_6==SLASH||LA38_6==STAR) ) {s = 84;}
						else if ( (LA38_6==AND||LA38_6==MINUS||LA38_6==PLUS) ) {s = 85;}
						else if ( (LA38_6==BAR) && (synpred9_Vhdl())) {s = 86;}
						else if ( (LA38_6==EQGRT) && (synpred9_Vhdl())) {s = 87;}
						else if ( (LA38_6==COMMA) && (synpred9_Vhdl())) {s = 88;}
						else if ( (LA38_6==SEMI) && (synpred9_Vhdl())) {s = 89;}
						else if ( (LA38_6==BASIC_IDENTIFIER||LA38_6==EXTENDED_IDENTIFIER) ) {s = 90;}
						else if ( (LA38_6==STRING_LITERAL) ) {s = 91;}
						else if ( (LA38_6==K_DOWNTO||LA38_6==K_TO) ) {s = 43;}
						 
						input.seek(index38_6);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA38_7 = input.LA(1);
						 
						int index38_7 = input.index();
						input.rewind();
						s = -1;
						if ( (LA38_7==STAR2) ) {s = 93;}
						else if ( (LA38_7==K_MOD||LA38_7==K_REM||LA38_7==SLASH||LA38_7==STAR) ) {s = 94;}
						else if ( (LA38_7==AND||LA38_7==MINUS||LA38_7==PLUS) ) {s = 95;}
						else if ( (LA38_7==BAR) && (synpred9_Vhdl())) {s = 96;}
						else if ( (LA38_7==EQGRT) && (synpred9_Vhdl())) {s = 97;}
						else if ( (LA38_7==COMMA) && (synpred9_Vhdl())) {s = 98;}
						else if ( (LA38_7==SEMI) && (synpred9_Vhdl())) {s = 99;}
						else if ( (LA38_7==K_DOWNTO||LA38_7==K_TO) ) {s = 43;}
						 
						input.seek(index38_7);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA38_8 = input.LA(1);
						 
						int index38_8 = input.index();
						input.rewind();
						s = -1;
						if ( (LA38_8==STAR2) ) {s = 101;}
						else if ( (LA38_8==K_MOD||LA38_8==K_REM||LA38_8==SLASH||LA38_8==STAR) ) {s = 102;}
						else if ( (LA38_8==AND||LA38_8==MINUS||LA38_8==PLUS) ) {s = 103;}
						else if ( (LA38_8==BAR) && (synpred9_Vhdl())) {s = 104;}
						else if ( (LA38_8==EQGRT) && (synpred9_Vhdl())) {s = 105;}
						else if ( (LA38_8==COMMA) && (synpred9_Vhdl())) {s = 106;}
						else if ( (LA38_8==SEMI) && (synpred9_Vhdl())) {s = 107;}
						else if ( (LA38_8==K_DOWNTO||LA38_8==K_TO) ) {s = 43;}
						 
						input.seek(index38_8);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA38_9 = input.LA(1);
						 
						int index38_9 = input.index();
						input.rewind();
						s = -1;
						if ( (LA38_9==STAR2) ) {s = 109;}
						else if ( (LA38_9==K_MOD||LA38_9==K_REM||LA38_9==SLASH||LA38_9==STAR) ) {s = 110;}
						else if ( (LA38_9==AND||LA38_9==MINUS||LA38_9==PLUS) ) {s = 111;}
						else if ( (LA38_9==BAR) && (synpred9_Vhdl())) {s = 112;}
						else if ( (LA38_9==EQGRT) && (synpred9_Vhdl())) {s = 113;}
						else if ( (LA38_9==COMMA) && (synpred9_Vhdl())) {s = 114;}
						else if ( (LA38_9==SEMI) && (synpred9_Vhdl())) {s = 115;}
						else if ( (LA38_9==K_DOWNTO||LA38_9==K_TO) ) {s = 43;}
						 
						input.seek(index38_9);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA38_14 = input.LA(1);
						 
						int index38_14 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_14);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA38_15 = input.LA(1);
						 
						int index38_15 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_15);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA38_16 = input.LA(1);
						 
						int index38_16 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_16);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA38_17 = input.LA(1);
						 
						int index38_17 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_17);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA38_18 = input.LA(1);
						 
						int index38_18 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_18);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA38_19 = input.LA(1);
						 
						int index38_19 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_19);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA38_20 = input.LA(1);
						 
						int index38_20 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_20);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA38_21 = input.LA(1);
						 
						int index38_21 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_21);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA38_22 = input.LA(1);
						 
						int index38_22 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_22);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA38_23 = input.LA(1);
						 
						int index38_23 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_23);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA38_24 = input.LA(1);
						 
						int index38_24 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_24);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA38_60 = input.LA(1);
						 
						int index38_60 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_60);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA38_61 = input.LA(1);
						 
						int index38_61 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_61);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA38_62 = input.LA(1);
						 
						int index38_62 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_62);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA38_63 = input.LA(1);
						 
						int index38_63 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_63);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA38_64 = input.LA(1);
						 
						int index38_64 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_64);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA38_65 = input.LA(1);
						 
						int index38_65 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_65);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA38_66 = input.LA(1);
						 
						int index38_66 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_66);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA38_67 = input.LA(1);
						 
						int index38_67 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_67);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA38_68 = input.LA(1);
						 
						int index38_68 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_68);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA38_69 = input.LA(1);
						 
						int index38_69 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_69);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA38_70 = input.LA(1);
						 
						int index38_70 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_70);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA38_71 = input.LA(1);
						 
						int index38_71 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_71);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA38_72 = input.LA(1);
						 
						int index38_72 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_72);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA38_73 = input.LA(1);
						 
						int index38_73 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_73);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA38_74 = input.LA(1);
						 
						int index38_74 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_74);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA38_75 = input.LA(1);
						 
						int index38_75 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_75);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA38_80 = input.LA(1);
						 
						int index38_80 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_80);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA38_81 = input.LA(1);
						 
						int index38_81 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_81);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA38_83 = input.LA(1);
						 
						int index38_83 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_83);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA38_84 = input.LA(1);
						 
						int index38_84 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_84);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA38_85 = input.LA(1);
						 
						int index38_85 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_85);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA38_90 = input.LA(1);
						 
						int index38_90 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_90);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA38_91 = input.LA(1);
						 
						int index38_91 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_91);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA38_93 = input.LA(1);
						 
						int index38_93 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_93);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA38_94 = input.LA(1);
						 
						int index38_94 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_94);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA38_95 = input.LA(1);
						 
						int index38_95 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_95);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA38_101 = input.LA(1);
						 
						int index38_101 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_101);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA38_102 = input.LA(1);
						 
						int index38_102 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_102);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA38_103 = input.LA(1);
						 
						int index38_103 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_103);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA38_109 = input.LA(1);
						 
						int index38_109 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_109);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA38_110 = input.LA(1);
						 
						int index38_110 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_110);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA38_111 = input.LA(1);
						 
						int index38_111 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_111);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA38_117 = input.LA(1);
						 
						int index38_117 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_117);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA38_118 = input.LA(1);
						 
						int index38_118 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_118);
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA38_119 = input.LA(1);
						 
						int index38_119 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_119);
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA38_120 = input.LA(1);
						 
						int index38_120 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_120);
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA38_121 = input.LA(1);
						 
						int index38_121 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_121);
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA38_122 = input.LA(1);
						 
						int index38_122 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_122);
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA38_123 = input.LA(1);
						 
						int index38_123 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_123);
						if ( s>=0 ) return s;
						break;

					case 57 : 
						int LA38_124 = input.LA(1);
						 
						int index38_124 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_124);
						if ( s>=0 ) return s;
						break;

					case 58 : 
						int LA38_125 = input.LA(1);
						 
						int index38_125 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_125);
						if ( s>=0 ) return s;
						break;

					case 59 : 
						int LA38_126 = input.LA(1);
						 
						int index38_126 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_126);
						if ( s>=0 ) return s;
						break;

					case 60 : 
						int LA38_127 = input.LA(1);
						 
						int index38_127 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_127);
						if ( s>=0 ) return s;
						break;

					case 61 : 
						int LA38_128 = input.LA(1);
						 
						int index38_128 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_128);
						if ( s>=0 ) return s;
						break;

					case 62 : 
						int LA38_129 = input.LA(1);
						 
						int index38_129 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_129);
						if ( s>=0 ) return s;
						break;

					case 63 : 
						int LA38_130 = input.LA(1);
						 
						int index38_130 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_130);
						if ( s>=0 ) return s;
						break;

					case 64 : 
						int LA38_131 = input.LA(1);
						 
						int index38_131 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_131);
						if ( s>=0 ) return s;
						break;

					case 65 : 
						int LA38_132 = input.LA(1);
						 
						int index38_132 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_132);
						if ( s>=0 ) return s;
						break;

					case 66 : 
						int LA38_133 = input.LA(1);
						 
						int index38_133 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_133);
						if ( s>=0 ) return s;
						break;

					case 67 : 
						int LA38_134 = input.LA(1);
						 
						int index38_134 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_134);
						if ( s>=0 ) return s;
						break;

					case 68 : 
						int LA38_135 = input.LA(1);
						 
						int index38_135 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_135);
						if ( s>=0 ) return s;
						break;

					case 69 : 
						int LA38_136 = input.LA(1);
						 
						int index38_136 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Vhdl()) ) {s = 115;}
						else if ( (true) ) {s = 43;}
						 
						input.seek(index38_136);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 38, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA77_eotS =
		"\u009b\uffff";
	static final String DFA77_eofS =
		"\u009b\uffff";
	static final String DFA77_minS =
		"\2\10\2\4\1\10\5\4\1\13\2\10\1\uffff\23\0\13\uffff\10\0\13\uffff\20\0"+
		"\2\uffff\2\0\6\uffff\3\0\2\uffff\2\0\6\uffff\3\0\10\uffff\3\0\10\uffff"+
		"\3\0\10\uffff\24\0";
	static final String DFA77_maxS =
		"\2\u009e\2\u00a0\3\u009e\3\u009d\3\u009e\1\uffff\23\0\13\uffff\10\0\13"+
		"\uffff\20\0\2\uffff\2\0\6\uffff\3\0\2\uffff\2\0\6\uffff\3\0\10\uffff\3"+
		"\0\10\uffff\3\0\10\uffff\24\0";
	static final String DFA77_acceptS =
		"\15\uffff\1\1\23\uffff\6\1\1\2\14\uffff\6\1\25\uffff\2\1\2\uffff\1\1\10"+
		"\uffff\2\1\2\uffff\1\1\10\uffff\3\1\10\uffff\3\1\10\uffff\3\1\31\uffff";
	static final String DFA77_specialS =
		"\1\0\1\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\4\uffff\1\10\1\11\1\12"+
		"\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
		"\1\31\1\32\13\uffff\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\13\uffff\1"+
		"\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1"+
		"\61\1\62\2\uffff\1\63\1\64\6\uffff\1\65\1\66\1\67\2\uffff\1\70\1\71\6"+
		"\uffff\1\72\1\73\1\74\10\uffff\1\75\1\76\1\77\10\uffff\1\100\1\101\1\102"+
		"\10\uffff\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114"+
		"\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126}>";
	static final String[] DFA77_transitionS = {
			"\1\6\2\uffff\1\2\1\10\4\uffff\1\7\4\uffff\1\5\10\uffff\1\2\5\uffff\1"+
			"\13\56\uffff\1\12\2\uffff\1\14\1\11\4\uffff\1\15\55\uffff\1\4\3\uffff"+
			"\1\1\2\uffff\1\1\13\uffff\1\3",
			"\1\22\2\uffff\1\16\1\24\4\uffff\1\23\4\uffff\1\21\10\uffff\1\16\5\uffff"+
			"\1\27\56\uffff\1\26\2\uffff\1\30\1\25\62\uffff\1\20\22\uffff\1\17",
			"\1\40\1\uffff\1\41\4\uffff\1\44\10\uffff\1\47\4\uffff\1\31\1\47\1\42"+
			"\3\uffff\1\44\2\uffff\2\47\6\uffff\1\47\16\uffff\1\43\30\uffff\1\37\1"+
			"\47\2\uffff\1\47\5\uffff\1\47\11\uffff\1\46\3\uffff\1\37\2\uffff\2\47"+
			"\4\uffff\4\47\2\uffff\1\43\13\uffff\2\47\1\33\3\uffff\1\35\2\47\1\uffff"+
			"\1\40\2\uffff\1\40\5\uffff\1\47\1\uffff\1\37\1\47\1\37\1\36\1\45\1\32"+
			"\1\34",
			"\1\63\1\uffff\1\64\4\uffff\1\67\10\uffff\1\47\4\uffff\1\54\1\47\1\65"+
			"\3\uffff\1\67\2\uffff\2\47\6\uffff\1\47\16\uffff\1\66\30\uffff\1\62\1"+
			"\47\2\uffff\1\47\5\uffff\1\47\11\uffff\1\71\3\uffff\1\62\2\uffff\2\47"+
			"\4\uffff\4\47\2\uffff\1\66\13\uffff\2\47\1\56\3\uffff\1\60\2\47\1\uffff"+
			"\1\63\2\uffff\1\63\5\uffff\1\47\1\uffff\1\62\1\47\1\62\1\61\1\70\1\55"+
			"\1\57",
			"\1\104\2\uffff\1\100\1\106\4\uffff\1\105\4\uffff\1\103\10\uffff\1\100"+
			"\5\uffff\1\111\56\uffff\1\110\2\uffff\1\112\1\107\4\uffff\1\113\55\uffff"+
			"\1\102\3\uffff\1\77\2\uffff\1\77\13\uffff\1\101",
			"\1\116\1\uffff\1\117\4\uffff\1\121\10\uffff\1\47\5\uffff\1\47\1\120"+
			"\3\uffff\1\121\2\uffff\2\47\6\uffff\1\47\16\uffff\1\123\30\uffff\1\115"+
			"\1\47\2\uffff\1\47\5\uffff\1\47\15\uffff\1\115\2\uffff\2\47\4\uffff\4"+
			"\47\2\uffff\1\123\13\uffff\2\47\5\uffff\2\47\1\uffff\1\116\2\uffff\1"+
			"\116\5\uffff\1\47\1\uffff\1\115\1\47\1\115\1\114\1\122",
			"\1\133\1\uffff\1\134\4\uffff\1\136\10\uffff\1\47\5\uffff\1\47\1\135"+
			"\3\uffff\1\136\2\uffff\2\47\6\uffff\1\47\16\uffff\1\140\30\uffff\1\132"+
			"\1\47\2\uffff\1\47\5\uffff\1\47\15\uffff\1\132\2\uffff\2\47\4\uffff\4"+
			"\47\2\uffff\1\140\13\uffff\2\47\5\uffff\2\47\1\uffff\1\133\2\uffff\1"+
			"\133\5\uffff\1\47\1\uffff\1\132\1\47\1\132\1\131\1\137",
			"\1\150\1\uffff\1\151\15\uffff\1\47\5\uffff\1\47\1\152\6\uffff\2\47\6"+
			"\uffff\1\47\16\uffff\1\153\30\uffff\1\147\1\47\2\uffff\1\47\5\uffff\1"+
			"\47\15\uffff\1\147\2\uffff\2\47\4\uffff\4\47\2\uffff\1\153\13\uffff\2"+
			"\47\5\uffff\2\47\1\uffff\1\150\2\uffff\1\150\5\uffff\1\47\1\uffff\1\147"+
			"\1\47\1\147\1\146",
			"\1\163\1\uffff\1\164\15\uffff\1\47\5\uffff\1\47\1\165\6\uffff\2\47\6"+
			"\uffff\1\47\16\uffff\1\166\30\uffff\1\162\1\47\2\uffff\1\47\5\uffff\1"+
			"\47\15\uffff\1\162\2\uffff\2\47\4\uffff\4\47\2\uffff\1\166\13\uffff\2"+
			"\47\5\uffff\2\47\1\uffff\1\163\2\uffff\1\163\5\uffff\1\47\1\uffff\1\162"+
			"\1\47\1\162\1\161",
			"\1\176\1\uffff\1\177\15\uffff\1\47\5\uffff\1\47\1\u0080\6\uffff\2\47"+
			"\6\uffff\1\47\16\uffff\1\u0081\30\uffff\1\175\1\47\2\uffff\1\47\5\uffff"+
			"\1\47\15\uffff\1\175\2\uffff\2\47\4\uffff\4\47\2\uffff\1\u0081\13\uffff"+
			"\2\47\5\uffff\2\47\1\uffff\1\176\2\uffff\1\176\5\uffff\1\47\1\uffff\1"+
			"\175\1\47\1\175\1\174",
			"\1\u0087\23\uffff\1\u0087\176\uffff\1\u0088",
			"\1\u008d\2\uffff\1\u0089\1\u008f\4\uffff\1\u008e\4\uffff\1\u008c\10"+
			"\uffff\1\u0089\64\uffff\1\u0091\3\uffff\1\u0090\62\uffff\1\u008b\22\uffff"+
			"\1\u008a",
			"\1\u0096\2\uffff\1\u0092\1\u0098\4\uffff\1\u0097\4\uffff\1\u0095\10"+
			"\uffff\1\u0092\64\uffff\1\u009a\3\uffff\1\u0099\62\uffff\1\u0094\22\uffff"+
			"\1\u0093",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff"
	};

	static final short[] DFA77_eot = DFA.unpackEncodedString(DFA77_eotS);
	static final short[] DFA77_eof = DFA.unpackEncodedString(DFA77_eofS);
	static final char[] DFA77_min = DFA.unpackEncodedStringToUnsignedChars(DFA77_minS);
	static final char[] DFA77_max = DFA.unpackEncodedStringToUnsignedChars(DFA77_maxS);
	static final short[] DFA77_accept = DFA.unpackEncodedString(DFA77_acceptS);
	static final short[] DFA77_special = DFA.unpackEncodedString(DFA77_specialS);
	static final short[][] DFA77_transition;

	static {
		int numStates = DFA77_transitionS.length;
		DFA77_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA77_transition[i] = DFA.unpackEncodedString(DFA77_transitionS[i]);
		}
	}

	protected class DFA77 extends DFA {

		public DFA77(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 77;
			this.eot = DFA77_eot;
			this.eof = DFA77_eof;
			this.min = DFA77_min;
			this.max = DFA77_max;
			this.accept = DFA77_accept;
			this.special = DFA77_special;
			this.transition = DFA77_transition;
		}
		@Override
		public String getDescription() {
			return "522:5: ( ( choices EQGRT )=> choices EQGRT )?";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA77_0 = input.LA(1);
						 
						int index77_0 = input.index();
						input.rewind();
						s = -1;
						if ( (LA77_0==MINUS||LA77_0==PLUS) ) {s = 1;}
						else if ( (LA77_0==BASIC_IDENTIFIER||LA77_0==EXTENDED_IDENTIFIER) ) {s = 2;}
						else if ( (LA77_0==STRING_LITERAL) ) {s = 3;}
						else if ( (LA77_0==LPAREN) ) {s = 4;}
						else if ( (LA77_0==DECIMAL_LITERAL) ) {s = 5;}
						else if ( (LA77_0==BASED_LITERAL) ) {s = 6;}
						else if ( (LA77_0==CHARACTER_LITERAL) ) {s = 7;}
						else if ( (LA77_0==BIT_STRING_LITERAL) ) {s = 8;}
						else if ( (LA77_0==K_NULL) ) {s = 9;}
						else if ( (LA77_0==K_NEW) ) {s = 10;}
						else if ( (LA77_0==K_ABS) ) {s = 11;}
						else if ( (LA77_0==K_NOT) ) {s = 12;}
						else if ( (LA77_0==K_OTHERS) && (synpred25_Vhdl())) {s = 13;}
						 
						input.seek(index77_0);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA77_2 = input.LA(1);
						 
						int index77_2 = input.index();
						input.rewind();
						s = -1;
						if ( (LA77_2==DOT) ) {s = 25;}
						else if ( (LA77_2==TIC) ) {s = 26;}
						else if ( (LA77_2==LBRACK) ) {s = 27;}
						else if ( (LA77_2==TIC_SIMPLE_NAME) ) {s = 28;}
						else if ( (LA77_2==LPAREN) ) {s = 29;}
						else if ( (LA77_2==STAR2) ) {s = 30;}
						else if ( (LA77_2==K_MOD||LA77_2==K_REM||LA77_2==SLASH||LA77_2==STAR) ) {s = 31;}
						else if ( (LA77_2==AND||LA77_2==MINUS||LA77_2==PLUS) ) {s = 32;}
						else if ( (LA77_2==BAR) && (synpred25_Vhdl())) {s = 33;}
						else if ( (LA77_2==EQGRT) && (synpred25_Vhdl())) {s = 34;}
						else if ( (LA77_2==K_DOWNTO||LA77_2==K_TO) && (synpred25_Vhdl())) {s = 35;}
						else if ( (LA77_2==BASIC_IDENTIFIER||LA77_2==EXTENDED_IDENTIFIER) && (synpred25_Vhdl())) {s = 36;}
						else if ( (LA77_2==STRING_LITERAL) && (synpred25_Vhdl())) {s = 37;}
						else if ( (LA77_2==K_RANGE) && (synpred25_Vhdl())) {s = 38;}
						else if ( (LA77_2==COMMA||LA77_2==EQ||(LA77_2 >= GRT && LA77_2 <= GRTEQ)||LA77_2==K_AND||LA77_2==K_NAND||LA77_2==K_NOR||LA77_2==K_OR||(LA77_2 >= K_ROL && LA77_2 <= K_ROR)||(LA77_2 >= K_SLA && LA77_2 <= K_SRL)||(LA77_2 >= K_XNOR && LA77_2 <= K_XOR)||(LA77_2 >= LST && LA77_2 <= LSTEQ)||LA77_2==RPAREN||LA77_2==SLASHEQ) ) {s = 39;}
						 
						input.seek(index77_2);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA77_3 = input.LA(1);
						 
						int index77_3 = input.index();
						input.rewind();
						s = -1;
						if ( (LA77_3==DOT) ) {s = 44;}
						else if ( (LA77_3==TIC) ) {s = 45;}
						else if ( (LA77_3==LBRACK) ) {s = 46;}
						else if ( (LA77_3==TIC_SIMPLE_NAME) ) {s = 47;}
						else if ( (LA77_3==LPAREN) ) {s = 48;}
						else if ( (LA77_3==STAR2) ) {s = 49;}
						else if ( (LA77_3==K_MOD||LA77_3==K_REM||LA77_3==SLASH||LA77_3==STAR) ) {s = 50;}
						else if ( (LA77_3==AND||LA77_3==MINUS||LA77_3==PLUS) ) {s = 51;}
						else if ( (LA77_3==BAR) && (synpred25_Vhdl())) {s = 52;}
						else if ( (LA77_3==EQGRT) && (synpred25_Vhdl())) {s = 53;}
						else if ( (LA77_3==K_DOWNTO||LA77_3==K_TO) && (synpred25_Vhdl())) {s = 54;}
						else if ( (LA77_3==BASIC_IDENTIFIER||LA77_3==EXTENDED_IDENTIFIER) && (synpred25_Vhdl())) {s = 55;}
						else if ( (LA77_3==STRING_LITERAL) && (synpred25_Vhdl())) {s = 56;}
						else if ( (LA77_3==K_RANGE) && (synpred25_Vhdl())) {s = 57;}
						else if ( (LA77_3==COMMA||LA77_3==EQ||(LA77_3 >= GRT && LA77_3 <= GRTEQ)||LA77_3==K_AND||LA77_3==K_NAND||LA77_3==K_NOR||LA77_3==K_OR||(LA77_3 >= K_ROL && LA77_3 <= K_ROR)||(LA77_3 >= K_SLA && LA77_3 <= K_SRL)||(LA77_3 >= K_XNOR && LA77_3 <= K_XOR)||(LA77_3 >= LST && LA77_3 <= LSTEQ)||LA77_3==RPAREN||LA77_3==SLASHEQ) ) {s = 39;}
						 
						input.seek(index77_3);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA77_5 = input.LA(1);
						 
						int index77_5 = input.index();
						input.rewind();
						s = -1;
						if ( (LA77_5==STAR2) ) {s = 76;}
						else if ( (LA77_5==K_MOD||LA77_5==K_REM||LA77_5==SLASH||LA77_5==STAR) ) {s = 77;}
						else if ( (LA77_5==AND||LA77_5==MINUS||LA77_5==PLUS) ) {s = 78;}
						else if ( (LA77_5==BAR) && (synpred25_Vhdl())) {s = 79;}
						else if ( (LA77_5==EQGRT) && (synpred25_Vhdl())) {s = 80;}
						else if ( (LA77_5==BASIC_IDENTIFIER||LA77_5==EXTENDED_IDENTIFIER) ) {s = 81;}
						else if ( (LA77_5==STRING_LITERAL) ) {s = 82;}
						else if ( (LA77_5==K_DOWNTO||LA77_5==K_TO) && (synpred25_Vhdl())) {s = 83;}
						else if ( (LA77_5==COMMA||LA77_5==EQ||(LA77_5 >= GRT && LA77_5 <= GRTEQ)||LA77_5==K_AND||LA77_5==K_NAND||LA77_5==K_NOR||LA77_5==K_OR||(LA77_5 >= K_ROL && LA77_5 <= K_ROR)||(LA77_5 >= K_SLA && LA77_5 <= K_SRL)||(LA77_5 >= K_XNOR && LA77_5 <= K_XOR)||(LA77_5 >= LST && LA77_5 <= LSTEQ)||LA77_5==RPAREN||LA77_5==SLASHEQ) ) {s = 39;}
						 
						input.seek(index77_5);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA77_6 = input.LA(1);
						 
						int index77_6 = input.index();
						input.rewind();
						s = -1;
						if ( (LA77_6==STAR2) ) {s = 89;}
						else if ( (LA77_6==K_MOD||LA77_6==K_REM||LA77_6==SLASH||LA77_6==STAR) ) {s = 90;}
						else if ( (LA77_6==AND||LA77_6==MINUS||LA77_6==PLUS) ) {s = 91;}
						else if ( (LA77_6==BAR) && (synpred25_Vhdl())) {s = 92;}
						else if ( (LA77_6==EQGRT) && (synpred25_Vhdl())) {s = 93;}
						else if ( (LA77_6==BASIC_IDENTIFIER||LA77_6==EXTENDED_IDENTIFIER) ) {s = 94;}
						else if ( (LA77_6==STRING_LITERAL) ) {s = 95;}
						else if ( (LA77_6==K_DOWNTO||LA77_6==K_TO) && (synpred25_Vhdl())) {s = 96;}
						else if ( (LA77_6==COMMA||LA77_6==EQ||(LA77_6 >= GRT && LA77_6 <= GRTEQ)||LA77_6==K_AND||LA77_6==K_NAND||LA77_6==K_NOR||LA77_6==K_OR||(LA77_6 >= K_ROL && LA77_6 <= K_ROR)||(LA77_6 >= K_SLA && LA77_6 <= K_SRL)||(LA77_6 >= K_XNOR && LA77_6 <= K_XOR)||(LA77_6 >= LST && LA77_6 <= LSTEQ)||LA77_6==RPAREN||LA77_6==SLASHEQ) ) {s = 39;}
						 
						input.seek(index77_6);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA77_7 = input.LA(1);
						 
						int index77_7 = input.index();
						input.rewind();
						s = -1;
						if ( (LA77_7==STAR2) ) {s = 102;}
						else if ( (LA77_7==K_MOD||LA77_7==K_REM||LA77_7==SLASH||LA77_7==STAR) ) {s = 103;}
						else if ( (LA77_7==AND||LA77_7==MINUS||LA77_7==PLUS) ) {s = 104;}
						else if ( (LA77_7==BAR) && (synpred25_Vhdl())) {s = 105;}
						else if ( (LA77_7==EQGRT) && (synpred25_Vhdl())) {s = 106;}
						else if ( (LA77_7==K_DOWNTO||LA77_7==K_TO) && (synpred25_Vhdl())) {s = 107;}
						else if ( (LA77_7==COMMA||LA77_7==EQ||(LA77_7 >= GRT && LA77_7 <= GRTEQ)||LA77_7==K_AND||LA77_7==K_NAND||LA77_7==K_NOR||LA77_7==K_OR||(LA77_7 >= K_ROL && LA77_7 <= K_ROR)||(LA77_7 >= K_SLA && LA77_7 <= K_SRL)||(LA77_7 >= K_XNOR && LA77_7 <= K_XOR)||(LA77_7 >= LST && LA77_7 <= LSTEQ)||LA77_7==RPAREN||LA77_7==SLASHEQ) ) {s = 39;}
						 
						input.seek(index77_7);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA77_8 = input.LA(1);
						 
						int index77_8 = input.index();
						input.rewind();
						s = -1;
						if ( (LA77_8==STAR2) ) {s = 113;}
						else if ( (LA77_8==K_MOD||LA77_8==K_REM||LA77_8==SLASH||LA77_8==STAR) ) {s = 114;}
						else if ( (LA77_8==AND||LA77_8==MINUS||LA77_8==PLUS) ) {s = 115;}
						else if ( (LA77_8==BAR) && (synpred25_Vhdl())) {s = 116;}
						else if ( (LA77_8==EQGRT) && (synpred25_Vhdl())) {s = 117;}
						else if ( (LA77_8==K_DOWNTO||LA77_8==K_TO) && (synpred25_Vhdl())) {s = 118;}
						else if ( (LA77_8==COMMA||LA77_8==EQ||(LA77_8 >= GRT && LA77_8 <= GRTEQ)||LA77_8==K_AND||LA77_8==K_NAND||LA77_8==K_NOR||LA77_8==K_OR||(LA77_8 >= K_ROL && LA77_8 <= K_ROR)||(LA77_8 >= K_SLA && LA77_8 <= K_SRL)||(LA77_8 >= K_XNOR && LA77_8 <= K_XOR)||(LA77_8 >= LST && LA77_8 <= LSTEQ)||LA77_8==RPAREN||LA77_8==SLASHEQ) ) {s = 39;}
						 
						input.seek(index77_8);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA77_9 = input.LA(1);
						 
						int index77_9 = input.index();
						input.rewind();
						s = -1;
						if ( (LA77_9==STAR2) ) {s = 124;}
						else if ( (LA77_9==K_MOD||LA77_9==K_REM||LA77_9==SLASH||LA77_9==STAR) ) {s = 125;}
						else if ( (LA77_9==AND||LA77_9==MINUS||LA77_9==PLUS) ) {s = 126;}
						else if ( (LA77_9==BAR) && (synpred25_Vhdl())) {s = 127;}
						else if ( (LA77_9==EQGRT) && (synpred25_Vhdl())) {s = 128;}
						else if ( (LA77_9==K_DOWNTO||LA77_9==K_TO) && (synpred25_Vhdl())) {s = 129;}
						else if ( (LA77_9==COMMA||LA77_9==EQ||(LA77_9 >= GRT && LA77_9 <= GRTEQ)||LA77_9==K_AND||LA77_9==K_NAND||LA77_9==K_NOR||LA77_9==K_OR||(LA77_9 >= K_ROL && LA77_9 <= K_ROR)||(LA77_9 >= K_SLA && LA77_9 <= K_SRL)||(LA77_9 >= K_XNOR && LA77_9 <= K_XOR)||(LA77_9 >= LST && LA77_9 <= LSTEQ)||LA77_9==RPAREN||LA77_9==SLASHEQ) ) {s = 39;}
						 
						input.seek(index77_9);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA77_14 = input.LA(1);
						 
						int index77_14 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_14);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA77_15 = input.LA(1);
						 
						int index77_15 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_15);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA77_16 = input.LA(1);
						 
						int index77_16 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_16);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA77_17 = input.LA(1);
						 
						int index77_17 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_17);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA77_18 = input.LA(1);
						 
						int index77_18 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_18);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA77_19 = input.LA(1);
						 
						int index77_19 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_19);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA77_20 = input.LA(1);
						 
						int index77_20 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_20);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA77_21 = input.LA(1);
						 
						int index77_21 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_21);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA77_22 = input.LA(1);
						 
						int index77_22 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_22);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA77_23 = input.LA(1);
						 
						int index77_23 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_23);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA77_24 = input.LA(1);
						 
						int index77_24 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_24);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA77_25 = input.LA(1);
						 
						int index77_25 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_25);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA77_26 = input.LA(1);
						 
						int index77_26 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_26);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA77_27 = input.LA(1);
						 
						int index77_27 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_27);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA77_28 = input.LA(1);
						 
						int index77_28 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_28);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA77_29 = input.LA(1);
						 
						int index77_29 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_29);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA77_30 = input.LA(1);
						 
						int index77_30 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_30);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA77_31 = input.LA(1);
						 
						int index77_31 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_31);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA77_32 = input.LA(1);
						 
						int index77_32 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_32);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA77_44 = input.LA(1);
						 
						int index77_44 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_44);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA77_45 = input.LA(1);
						 
						int index77_45 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_45);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA77_46 = input.LA(1);
						 
						int index77_46 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_46);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA77_47 = input.LA(1);
						 
						int index77_47 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_47);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA77_48 = input.LA(1);
						 
						int index77_48 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_48);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA77_49 = input.LA(1);
						 
						int index77_49 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_49);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA77_50 = input.LA(1);
						 
						int index77_50 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_50);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA77_51 = input.LA(1);
						 
						int index77_51 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_51);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA77_63 = input.LA(1);
						 
						int index77_63 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_63);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA77_64 = input.LA(1);
						 
						int index77_64 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_64);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA77_65 = input.LA(1);
						 
						int index77_65 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_65);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA77_66 = input.LA(1);
						 
						int index77_66 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_66);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA77_67 = input.LA(1);
						 
						int index77_67 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_67);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA77_68 = input.LA(1);
						 
						int index77_68 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_68);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA77_69 = input.LA(1);
						 
						int index77_69 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_69);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA77_70 = input.LA(1);
						 
						int index77_70 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_70);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA77_71 = input.LA(1);
						 
						int index77_71 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_71);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA77_72 = input.LA(1);
						 
						int index77_72 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_72);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA77_73 = input.LA(1);
						 
						int index77_73 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_73);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA77_74 = input.LA(1);
						 
						int index77_74 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_74);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA77_75 = input.LA(1);
						 
						int index77_75 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_75);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA77_76 = input.LA(1);
						 
						int index77_76 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_76);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA77_77 = input.LA(1);
						 
						int index77_77 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_77);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA77_78 = input.LA(1);
						 
						int index77_78 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_78);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA77_81 = input.LA(1);
						 
						int index77_81 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_81);
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA77_82 = input.LA(1);
						 
						int index77_82 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_82);
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA77_89 = input.LA(1);
						 
						int index77_89 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_89);
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA77_90 = input.LA(1);
						 
						int index77_90 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_90);
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA77_91 = input.LA(1);
						 
						int index77_91 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_91);
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA77_94 = input.LA(1);
						 
						int index77_94 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_94);
						if ( s>=0 ) return s;
						break;

					case 57 : 
						int LA77_95 = input.LA(1);
						 
						int index77_95 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_95);
						if ( s>=0 ) return s;
						break;

					case 58 : 
						int LA77_102 = input.LA(1);
						 
						int index77_102 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_102);
						if ( s>=0 ) return s;
						break;

					case 59 : 
						int LA77_103 = input.LA(1);
						 
						int index77_103 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_103);
						if ( s>=0 ) return s;
						break;

					case 60 : 
						int LA77_104 = input.LA(1);
						 
						int index77_104 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_104);
						if ( s>=0 ) return s;
						break;

					case 61 : 
						int LA77_113 = input.LA(1);
						 
						int index77_113 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_113);
						if ( s>=0 ) return s;
						break;

					case 62 : 
						int LA77_114 = input.LA(1);
						 
						int index77_114 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_114);
						if ( s>=0 ) return s;
						break;

					case 63 : 
						int LA77_115 = input.LA(1);
						 
						int index77_115 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_115);
						if ( s>=0 ) return s;
						break;

					case 64 : 
						int LA77_124 = input.LA(1);
						 
						int index77_124 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_124);
						if ( s>=0 ) return s;
						break;

					case 65 : 
						int LA77_125 = input.LA(1);
						 
						int index77_125 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_125);
						if ( s>=0 ) return s;
						break;

					case 66 : 
						int LA77_126 = input.LA(1);
						 
						int index77_126 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_126);
						if ( s>=0 ) return s;
						break;

					case 67 : 
						int LA77_135 = input.LA(1);
						 
						int index77_135 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_135);
						if ( s>=0 ) return s;
						break;

					case 68 : 
						int LA77_136 = input.LA(1);
						 
						int index77_136 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_136);
						if ( s>=0 ) return s;
						break;

					case 69 : 
						int LA77_137 = input.LA(1);
						 
						int index77_137 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_137);
						if ( s>=0 ) return s;
						break;

					case 70 : 
						int LA77_138 = input.LA(1);
						 
						int index77_138 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_138);
						if ( s>=0 ) return s;
						break;

					case 71 : 
						int LA77_139 = input.LA(1);
						 
						int index77_139 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_139);
						if ( s>=0 ) return s;
						break;

					case 72 : 
						int LA77_140 = input.LA(1);
						 
						int index77_140 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_140);
						if ( s>=0 ) return s;
						break;

					case 73 : 
						int LA77_141 = input.LA(1);
						 
						int index77_141 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_141);
						if ( s>=0 ) return s;
						break;

					case 74 : 
						int LA77_142 = input.LA(1);
						 
						int index77_142 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_142);
						if ( s>=0 ) return s;
						break;

					case 75 : 
						int LA77_143 = input.LA(1);
						 
						int index77_143 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_143);
						if ( s>=0 ) return s;
						break;

					case 76 : 
						int LA77_144 = input.LA(1);
						 
						int index77_144 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_144);
						if ( s>=0 ) return s;
						break;

					case 77 : 
						int LA77_145 = input.LA(1);
						 
						int index77_145 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_145);
						if ( s>=0 ) return s;
						break;

					case 78 : 
						int LA77_146 = input.LA(1);
						 
						int index77_146 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_146);
						if ( s>=0 ) return s;
						break;

					case 79 : 
						int LA77_147 = input.LA(1);
						 
						int index77_147 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_147);
						if ( s>=0 ) return s;
						break;

					case 80 : 
						int LA77_148 = input.LA(1);
						 
						int index77_148 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_148);
						if ( s>=0 ) return s;
						break;

					case 81 : 
						int LA77_149 = input.LA(1);
						 
						int index77_149 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_149);
						if ( s>=0 ) return s;
						break;

					case 82 : 
						int LA77_150 = input.LA(1);
						 
						int index77_150 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_150);
						if ( s>=0 ) return s;
						break;

					case 83 : 
						int LA77_151 = input.LA(1);
						 
						int index77_151 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_151);
						if ( s>=0 ) return s;
						break;

					case 84 : 
						int LA77_152 = input.LA(1);
						 
						int index77_152 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_152);
						if ( s>=0 ) return s;
						break;

					case 85 : 
						int LA77_153 = input.LA(1);
						 
						int index77_153 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_153);
						if ( s>=0 ) return s;
						break;

					case 86 : 
						int LA77_154 = input.LA(1);
						 
						int index77_154 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_Vhdl()) ) {s = 129;}
						else if ( (true) ) {s = 39;}
						 
						input.seek(index77_154);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 77, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA120_eotS =
		"\u0087\uffff";
	static final String DFA120_eofS =
		"\u0087\uffff";
	static final String DFA120_minS =
		"\2\10\2\0\1\10\5\4\1\13\2\10\13\0\42\uffff\20\0\1\uffff\2\0\4\uffff\3"+
		"\0\1\uffff\2\0\4\uffff\3\0\5\uffff\3\0\5\uffff\3\0\5\uffff\24\0";
	static final String DFA120_maxS =
		"\2\u009e\2\0\3\u009e\3\u009d\3\u009e\13\0\42\uffff\20\0\1\uffff\2\0\4"+
		"\uffff\3\0\1\uffff\2\0\4\uffff\3\0\5\uffff\3\0\5\uffff\3\0\5\uffff\24"+
		"\0";
	static final String DFA120_acceptS =
		"\50\uffff\1\1\1\2\40\uffff\1\1\11\uffff\1\1\11\uffff\1\1\7\uffff\1\1\7"+
		"\uffff\1\1\30\uffff";
	static final String DFA120_specialS =
		"\2\uffff\1\0\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\3\uffff\1\7\1\10\1\11\1\12"+
		"\1\13\1\14\1\15\1\16\1\17\1\20\1\21\42\uffff\1\22\1\23\1\24\1\25\1\26"+
		"\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\uffff\1\42\1"+
		"\43\4\uffff\1\44\1\45\1\46\1\uffff\1\47\1\50\4\uffff\1\51\1\52\1\53\5"+
		"\uffff\1\54\1\55\1\56\5\uffff\1\57\1\60\1\61\5\uffff\1\62\1\63\1\64\1"+
		"\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102"+
		"\1\103\1\104\1\105}>";
	static final String[] DFA120_transitionS = {
			"\1\6\2\uffff\1\2\1\10\4\uffff\1\7\4\uffff\1\5\10\uffff\1\2\5\uffff\1"+
			"\13\56\uffff\1\12\2\uffff\1\14\1\11\62\uffff\1\4\3\uffff\1\1\2\uffff"+
			"\1\1\13\uffff\1\3",
			"\1\21\2\uffff\1\15\1\23\4\uffff\1\22\4\uffff\1\20\10\uffff\1\15\5\uffff"+
			"\1\26\56\uffff\1\25\2\uffff\1\27\1\24\62\uffff\1\17\22\uffff\1\16",
			"\1\uffff",
			"\1\uffff",
			"\1\77\2\uffff\1\73\1\101\4\uffff\1\100\4\uffff\1\76\10\uffff\1\73\5"+
			"\uffff\1\104\56\uffff\1\103\2\uffff\1\105\1\102\4\uffff\1\106\55\uffff"+
			"\1\75\3\uffff\1\72\2\uffff\1\72\13\uffff\1\74",
			"\1\111\6\uffff\1\113\16\uffff\1\51\4\uffff\1\113\2\uffff\2\51\6\uffff"+
			"\1\51\16\uffff\1\112\30\uffff\1\110\1\51\2\uffff\1\51\5\uffff\1\51\15"+
			"\uffff\1\110\2\uffff\2\51\4\uffff\4\51\2\uffff\1\112\13\uffff\2\51\5"+
			"\uffff\2\51\1\uffff\1\111\2\uffff\1\111\5\uffff\1\51\1\uffff\1\110\1"+
			"\51\1\110\1\107\1\114",
			"\1\123\6\uffff\1\125\16\uffff\1\51\4\uffff\1\125\2\uffff\2\51\6\uffff"+
			"\1\51\16\uffff\1\124\30\uffff\1\122\1\51\2\uffff\1\51\5\uffff\1\51\15"+
			"\uffff\1\122\2\uffff\2\51\4\uffff\4\51\2\uffff\1\124\13\uffff\2\51\5"+
			"\uffff\2\51\1\uffff\1\123\2\uffff\1\123\5\uffff\1\51\1\uffff\1\122\1"+
			"\51\1\122\1\121\1\126",
			"\1\135\25\uffff\1\51\7\uffff\2\51\6\uffff\1\51\16\uffff\1\136\30\uffff"+
			"\1\134\1\51\2\uffff\1\51\5\uffff\1\51\15\uffff\1\134\2\uffff\2\51\4\uffff"+
			"\4\51\2\uffff\1\136\13\uffff\2\51\5\uffff\2\51\1\uffff\1\135\2\uffff"+
			"\1\135\5\uffff\1\51\1\uffff\1\134\1\51\1\134\1\133",
			"\1\145\25\uffff\1\51\7\uffff\2\51\6\uffff\1\51\16\uffff\1\146\30\uffff"+
			"\1\144\1\51\2\uffff\1\51\5\uffff\1\51\15\uffff\1\144\2\uffff\2\51\4\uffff"+
			"\4\51\2\uffff\1\146\13\uffff\2\51\5\uffff\2\51\1\uffff\1\145\2\uffff"+
			"\1\145\5\uffff\1\51\1\uffff\1\144\1\51\1\144\1\143",
			"\1\155\25\uffff\1\51\7\uffff\2\51\6\uffff\1\51\16\uffff\1\156\30\uffff"+
			"\1\154\1\51\2\uffff\1\51\5\uffff\1\51\15\uffff\1\154\2\uffff\2\51\4\uffff"+
			"\4\51\2\uffff\1\156\13\uffff\2\51\5\uffff\2\51\1\uffff\1\155\2\uffff"+
			"\1\155\5\uffff\1\51\1\uffff\1\154\1\51\1\154\1\153",
			"\1\163\23\uffff\1\163\176\uffff\1\164",
			"\1\171\2\uffff\1\165\1\173\4\uffff\1\172\4\uffff\1\170\10\uffff\1\165"+
			"\64\uffff\1\175\3\uffff\1\174\62\uffff\1\167\22\uffff\1\166",
			"\1\u0082\2\uffff\1\176\1\u0084\4\uffff\1\u0083\4\uffff\1\u0081\10\uffff"+
			"\1\176\64\uffff\1\u0086\3\uffff\1\u0085\62\uffff\1\u0080\22\uffff\1\177",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff"
	};

	static final short[] DFA120_eot = DFA.unpackEncodedString(DFA120_eotS);
	static final short[] DFA120_eof = DFA.unpackEncodedString(DFA120_eofS);
	static final char[] DFA120_min = DFA.unpackEncodedStringToUnsignedChars(DFA120_minS);
	static final char[] DFA120_max = DFA.unpackEncodedStringToUnsignedChars(DFA120_maxS);
	static final short[] DFA120_accept = DFA.unpackEncodedString(DFA120_acceptS);
	static final short[] DFA120_special = DFA.unpackEncodedString(DFA120_specialS);
	static final short[][] DFA120_transition;

	static {
		int numStates = DFA120_transitionS.length;
		DFA120_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA120_transition[i] = DFA.unpackEncodedString(DFA120_transitionS[i]);
		}
	}

	protected class DFA120 extends DFA {

		public DFA120(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 120;
			this.eot = DFA120_eot;
			this.eof = DFA120_eof;
			this.min = DFA120_min;
			this.max = DFA120_max;
			this.accept = DFA120_accept;
			this.special = DFA120_special;
			this.transition = DFA120_transition;
		}
		@Override
		public String getDescription() {
			return "767:1: index_specification : ( ( discrete_range )=> discrete_range | expression );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA120_2 = input.LA(1);
						 
						int index120_2 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 40;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_2);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA120_3 = input.LA(1);
						 
						int index120_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 40;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_3);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA120_5 = input.LA(1);
						 
						int index120_5 = input.index();
						input.rewind();
						s = -1;
						if ( (LA120_5==STAR2) ) {s = 71;}
						else if ( (LA120_5==K_MOD||LA120_5==K_REM||LA120_5==SLASH||LA120_5==STAR) ) {s = 72;}
						else if ( (LA120_5==AND||LA120_5==MINUS||LA120_5==PLUS) ) {s = 73;}
						else if ( (LA120_5==K_DOWNTO||LA120_5==K_TO) && (synpred31_Vhdl())) {s = 74;}
						else if ( (LA120_5==BASIC_IDENTIFIER||LA120_5==EXTENDED_IDENTIFIER) ) {s = 75;}
						else if ( (LA120_5==STRING_LITERAL) ) {s = 76;}
						else if ( (LA120_5==EQ||(LA120_5 >= GRT && LA120_5 <= GRTEQ)||LA120_5==K_AND||LA120_5==K_NAND||LA120_5==K_NOR||LA120_5==K_OR||(LA120_5 >= K_ROL && LA120_5 <= K_ROR)||(LA120_5 >= K_SLA && LA120_5 <= K_SRL)||(LA120_5 >= K_XNOR && LA120_5 <= K_XOR)||(LA120_5 >= LST && LA120_5 <= LSTEQ)||LA120_5==RPAREN||LA120_5==SLASHEQ) ) {s = 41;}
						 
						input.seek(index120_5);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA120_6 = input.LA(1);
						 
						int index120_6 = input.index();
						input.rewind();
						s = -1;
						if ( (LA120_6==STAR2) ) {s = 81;}
						else if ( (LA120_6==K_MOD||LA120_6==K_REM||LA120_6==SLASH||LA120_6==STAR) ) {s = 82;}
						else if ( (LA120_6==AND||LA120_6==MINUS||LA120_6==PLUS) ) {s = 83;}
						else if ( (LA120_6==K_DOWNTO||LA120_6==K_TO) && (synpred31_Vhdl())) {s = 84;}
						else if ( (LA120_6==BASIC_IDENTIFIER||LA120_6==EXTENDED_IDENTIFIER) ) {s = 85;}
						else if ( (LA120_6==STRING_LITERAL) ) {s = 86;}
						else if ( (LA120_6==EQ||(LA120_6 >= GRT && LA120_6 <= GRTEQ)||LA120_6==K_AND||LA120_6==K_NAND||LA120_6==K_NOR||LA120_6==K_OR||(LA120_6 >= K_ROL && LA120_6 <= K_ROR)||(LA120_6 >= K_SLA && LA120_6 <= K_SRL)||(LA120_6 >= K_XNOR && LA120_6 <= K_XOR)||(LA120_6 >= LST && LA120_6 <= LSTEQ)||LA120_6==RPAREN||LA120_6==SLASHEQ) ) {s = 41;}
						 
						input.seek(index120_6);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA120_7 = input.LA(1);
						 
						int index120_7 = input.index();
						input.rewind();
						s = -1;
						if ( (LA120_7==STAR2) ) {s = 91;}
						else if ( (LA120_7==K_MOD||LA120_7==K_REM||LA120_7==SLASH||LA120_7==STAR) ) {s = 92;}
						else if ( (LA120_7==AND||LA120_7==MINUS||LA120_7==PLUS) ) {s = 93;}
						else if ( (LA120_7==K_DOWNTO||LA120_7==K_TO) && (synpred31_Vhdl())) {s = 94;}
						else if ( (LA120_7==EQ||(LA120_7 >= GRT && LA120_7 <= GRTEQ)||LA120_7==K_AND||LA120_7==K_NAND||LA120_7==K_NOR||LA120_7==K_OR||(LA120_7 >= K_ROL && LA120_7 <= K_ROR)||(LA120_7 >= K_SLA && LA120_7 <= K_SRL)||(LA120_7 >= K_XNOR && LA120_7 <= K_XOR)||(LA120_7 >= LST && LA120_7 <= LSTEQ)||LA120_7==RPAREN||LA120_7==SLASHEQ) ) {s = 41;}
						 
						input.seek(index120_7);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA120_8 = input.LA(1);
						 
						int index120_8 = input.index();
						input.rewind();
						s = -1;
						if ( (LA120_8==STAR2) ) {s = 99;}
						else if ( (LA120_8==K_MOD||LA120_8==K_REM||LA120_8==SLASH||LA120_8==STAR) ) {s = 100;}
						else if ( (LA120_8==AND||LA120_8==MINUS||LA120_8==PLUS) ) {s = 101;}
						else if ( (LA120_8==K_DOWNTO||LA120_8==K_TO) && (synpred31_Vhdl())) {s = 102;}
						else if ( (LA120_8==EQ||(LA120_8 >= GRT && LA120_8 <= GRTEQ)||LA120_8==K_AND||LA120_8==K_NAND||LA120_8==K_NOR||LA120_8==K_OR||(LA120_8 >= K_ROL && LA120_8 <= K_ROR)||(LA120_8 >= K_SLA && LA120_8 <= K_SRL)||(LA120_8 >= K_XNOR && LA120_8 <= K_XOR)||(LA120_8 >= LST && LA120_8 <= LSTEQ)||LA120_8==RPAREN||LA120_8==SLASHEQ) ) {s = 41;}
						 
						input.seek(index120_8);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA120_9 = input.LA(1);
						 
						int index120_9 = input.index();
						input.rewind();
						s = -1;
						if ( (LA120_9==STAR2) ) {s = 107;}
						else if ( (LA120_9==K_MOD||LA120_9==K_REM||LA120_9==SLASH||LA120_9==STAR) ) {s = 108;}
						else if ( (LA120_9==AND||LA120_9==MINUS||LA120_9==PLUS) ) {s = 109;}
						else if ( (LA120_9==K_DOWNTO||LA120_9==K_TO) && (synpred31_Vhdl())) {s = 110;}
						else if ( (LA120_9==EQ||(LA120_9 >= GRT && LA120_9 <= GRTEQ)||LA120_9==K_AND||LA120_9==K_NAND||LA120_9==K_NOR||LA120_9==K_OR||(LA120_9 >= K_ROL && LA120_9 <= K_ROR)||(LA120_9 >= K_SLA && LA120_9 <= K_SRL)||(LA120_9 >= K_XNOR && LA120_9 <= K_XOR)||(LA120_9 >= LST && LA120_9 <= LSTEQ)||LA120_9==RPAREN||LA120_9==SLASHEQ) ) {s = 41;}
						 
						input.seek(index120_9);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA120_13 = input.LA(1);
						 
						int index120_13 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_13);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA120_14 = input.LA(1);
						 
						int index120_14 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_14);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA120_15 = input.LA(1);
						 
						int index120_15 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_15);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA120_16 = input.LA(1);
						 
						int index120_16 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_16);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA120_17 = input.LA(1);
						 
						int index120_17 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_17);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA120_18 = input.LA(1);
						 
						int index120_18 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_18);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA120_19 = input.LA(1);
						 
						int index120_19 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_19);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA120_20 = input.LA(1);
						 
						int index120_20 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_20);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA120_21 = input.LA(1);
						 
						int index120_21 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_21);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA120_22 = input.LA(1);
						 
						int index120_22 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_22);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA120_23 = input.LA(1);
						 
						int index120_23 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_23);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA120_58 = input.LA(1);
						 
						int index120_58 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_58);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA120_59 = input.LA(1);
						 
						int index120_59 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_59);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA120_60 = input.LA(1);
						 
						int index120_60 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_60);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA120_61 = input.LA(1);
						 
						int index120_61 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_61);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA120_62 = input.LA(1);
						 
						int index120_62 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_62);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA120_63 = input.LA(1);
						 
						int index120_63 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_63);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA120_64 = input.LA(1);
						 
						int index120_64 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_64);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA120_65 = input.LA(1);
						 
						int index120_65 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_65);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA120_66 = input.LA(1);
						 
						int index120_66 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_66);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA120_67 = input.LA(1);
						 
						int index120_67 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_67);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA120_68 = input.LA(1);
						 
						int index120_68 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_68);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA120_69 = input.LA(1);
						 
						int index120_69 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_69);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA120_70 = input.LA(1);
						 
						int index120_70 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_70);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA120_71 = input.LA(1);
						 
						int index120_71 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_71);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA120_72 = input.LA(1);
						 
						int index120_72 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_72);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA120_73 = input.LA(1);
						 
						int index120_73 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_73);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA120_75 = input.LA(1);
						 
						int index120_75 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_75);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA120_76 = input.LA(1);
						 
						int index120_76 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_76);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA120_81 = input.LA(1);
						 
						int index120_81 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_81);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA120_82 = input.LA(1);
						 
						int index120_82 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_82);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA120_83 = input.LA(1);
						 
						int index120_83 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_83);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA120_85 = input.LA(1);
						 
						int index120_85 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_85);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA120_86 = input.LA(1);
						 
						int index120_86 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_86);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA120_91 = input.LA(1);
						 
						int index120_91 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_91);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA120_92 = input.LA(1);
						 
						int index120_92 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_92);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA120_93 = input.LA(1);
						 
						int index120_93 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_93);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA120_99 = input.LA(1);
						 
						int index120_99 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_99);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA120_100 = input.LA(1);
						 
						int index120_100 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_100);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA120_101 = input.LA(1);
						 
						int index120_101 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_101);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA120_107 = input.LA(1);
						 
						int index120_107 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_107);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA120_108 = input.LA(1);
						 
						int index120_108 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_108);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA120_109 = input.LA(1);
						 
						int index120_109 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_109);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA120_115 = input.LA(1);
						 
						int index120_115 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_115);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA120_116 = input.LA(1);
						 
						int index120_116 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_116);
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA120_117 = input.LA(1);
						 
						int index120_117 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_117);
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA120_118 = input.LA(1);
						 
						int index120_118 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_118);
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA120_119 = input.LA(1);
						 
						int index120_119 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_119);
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA120_120 = input.LA(1);
						 
						int index120_120 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_120);
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA120_121 = input.LA(1);
						 
						int index120_121 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_121);
						if ( s>=0 ) return s;
						break;

					case 57 : 
						int LA120_122 = input.LA(1);
						 
						int index120_122 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_122);
						if ( s>=0 ) return s;
						break;

					case 58 : 
						int LA120_123 = input.LA(1);
						 
						int index120_123 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_123);
						if ( s>=0 ) return s;
						break;

					case 59 : 
						int LA120_124 = input.LA(1);
						 
						int index120_124 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_124);
						if ( s>=0 ) return s;
						break;

					case 60 : 
						int LA120_125 = input.LA(1);
						 
						int index120_125 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_125);
						if ( s>=0 ) return s;
						break;

					case 61 : 
						int LA120_126 = input.LA(1);
						 
						int index120_126 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_126);
						if ( s>=0 ) return s;
						break;

					case 62 : 
						int LA120_127 = input.LA(1);
						 
						int index120_127 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_127);
						if ( s>=0 ) return s;
						break;

					case 63 : 
						int LA120_128 = input.LA(1);
						 
						int index120_128 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_128);
						if ( s>=0 ) return s;
						break;

					case 64 : 
						int LA120_129 = input.LA(1);
						 
						int index120_129 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_129);
						if ( s>=0 ) return s;
						break;

					case 65 : 
						int LA120_130 = input.LA(1);
						 
						int index120_130 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_130);
						if ( s>=0 ) return s;
						break;

					case 66 : 
						int LA120_131 = input.LA(1);
						 
						int index120_131 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_131);
						if ( s>=0 ) return s;
						break;

					case 67 : 
						int LA120_132 = input.LA(1);
						 
						int index120_132 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_132);
						if ( s>=0 ) return s;
						break;

					case 68 : 
						int LA120_133 = input.LA(1);
						 
						int index120_133 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_133);
						if ( s>=0 ) return s;
						break;

					case 69 : 
						int LA120_134 = input.LA(1);
						 
						int index120_134 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred31_Vhdl()) ) {s = 110;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index120_134);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 120, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA140_eotS =
		"\117\uffff";
	static final String DFA140_eofS =
		"\117\uffff";
	static final String DFA140_minS =
		"\1\10\2\uffff\2\0\112\uffff";
	static final String DFA140_maxS =
		"\1\u009e\2\uffff\2\0\112\uffff";
	static final String DFA140_acceptS =
		"\1\uffff\2\1\2\uffff\1\2\1\4\1\5\106\uffff\1\3";
	static final String DFA140_specialS =
		"\1\0\2\uffff\1\1\1\2\112\uffff}>";
	static final String[] DFA140_transitionS = {
			"\1\2\2\uffff\1\3\1\6\4\uffff\1\5\4\uffff\1\1\10\uffff\1\3\70\uffff\1"+
			"\7\105\uffff\1\4",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA140_eot = DFA.unpackEncodedString(DFA140_eotS);
	static final short[] DFA140_eof = DFA.unpackEncodedString(DFA140_eofS);
	static final char[] DFA140_min = DFA.unpackEncodedStringToUnsignedChars(DFA140_minS);
	static final char[] DFA140_max = DFA.unpackEncodedStringToUnsignedChars(DFA140_maxS);
	static final short[] DFA140_accept = DFA.unpackEncodedString(DFA140_acceptS);
	static final short[] DFA140_special = DFA.unpackEncodedString(DFA140_specialS);
	static final short[][] DFA140_transition;

	static {
		int numStates = DFA140_transitionS.length;
		DFA140_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA140_transition[i] = DFA.unpackEncodedString(DFA140_transitionS[i]);
		}
	}

	protected class DFA140 extends DFA {

		public DFA140(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 140;
			this.eot = DFA140_eot;
			this.eof = DFA140_eof;
			this.min = DFA140_min;
			this.max = DFA140_max;
			this.accept = DFA140_accept;
			this.special = DFA140_special;
			this.transition = DFA140_transition;
		}
		@Override
		public String getDescription() {
			return "844:1: literal : ( ( numeric_literal )=> numeric_literal | enumeration_literal | string_literal | bit_string_literal | K_NULL );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA140_0 = input.LA(1);
						 
						int index140_0 = input.index();
						input.rewind();
						s = -1;
						if ( (LA140_0==DECIMAL_LITERAL) && (synpred35_Vhdl())) {s = 1;}
						else if ( (LA140_0==BASED_LITERAL) && (synpred35_Vhdl())) {s = 2;}
						else if ( (LA140_0==BASIC_IDENTIFIER||LA140_0==EXTENDED_IDENTIFIER) ) {s = 3;}
						else if ( (LA140_0==STRING_LITERAL) ) {s = 4;}
						else if ( (LA140_0==CHARACTER_LITERAL) ) {s = 5;}
						else if ( (LA140_0==BIT_STRING_LITERAL) ) {s = 6;}
						else if ( (LA140_0==K_NULL) ) {s = 7;}
						 
						input.seek(index140_0);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA140_3 = input.LA(1);
						 
						int index140_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred35_Vhdl()) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index140_3);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA140_4 = input.LA(1);
						 
						int index140_4 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred35_Vhdl()) ) {s = 2;}
						else if ( (true) ) {s = 78;}
						 
						input.seek(index140_4);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 140, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA149_eotS =
		"\110\uffff";
	static final String DFA149_eofS =
		"\2\3\45\uffff\1\3\40\uffff";
	static final String DFA149_minS =
		"\1\4\1\10\1\13\44\uffff\1\u008b\40\uffff";
	static final String DFA149_maxS =
		"\1\u00a0\2\u009e\44\uffff\1\u008b\40\uffff";
	static final String DFA149_acceptS =
		"\3\uffff\1\2\42\uffff\1\1\15\uffff\15\1\1\uffff\5\1\1\uffff";
	static final String DFA149_specialS =
		"\110\uffff}>";
	static final String[] DFA149_transitionS = {
			"\1\3\1\uffff\1\3\4\uffff\1\3\6\uffff\3\3\4\uffff\1\46\2\3\3\uffff\1\3"+
			"\2\uffff\2\3\3\uffff\1\3\2\uffff\1\3\3\uffff\1\3\4\uffff\1\3\5\uffff"+
			"\2\3\1\uffff\1\3\3\uffff\4\3\3\uffff\1\3\1\uffff\1\3\1\uffff\1\3\4\uffff"+
			"\1\3\1\uffff\2\3\2\uffff\1\3\4\uffff\2\3\3\uffff\1\3\1\uffff\1\3\2\uffff"+
			"\2\3\1\uffff\1\3\1\uffff\7\3\2\uffff\4\3\1\uffff\2\3\3\uffff\3\3\2\uffff"+
			"\1\3\2\uffff\2\3\1\2\3\uffff\1\1\2\3\1\uffff\1\3\2\uffff\1\3\3\uffff"+
			"\1\3\1\uffff\7\3\1\47\1\46",
			"\1\71\2\uffff\1\65\1\73\4\uffff\1\72\4\uffff\1\70\10\uffff\1\65\5\uffff"+
			"\1\76\56\uffff\1\75\2\uffff\1\77\1\74\2\uffff\1\100\57\uffff\1\67\3\uffff"+
			"\1\64\2\uffff\1\64\13\uffff\1\66",
			"\1\102\23\uffff\1\102\114\uffff\1\104\51\uffff\1\105\7\uffff\1\103",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\106",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA149_eot = DFA.unpackEncodedString(DFA149_eotS);
	static final short[] DFA149_eof = DFA.unpackEncodedString(DFA149_eofS);
	static final char[] DFA149_min = DFA.unpackEncodedStringToUnsignedChars(DFA149_minS);
	static final char[] DFA149_max = DFA.unpackEncodedStringToUnsignedChars(DFA149_maxS);
	static final short[] DFA149_accept = DFA.unpackEncodedString(DFA149_acceptS);
	static final short[] DFA149_special = DFA.unpackEncodedString(DFA149_specialS);
	static final short[][] DFA149_transition;

	static {
		int numStates = DFA149_transitionS.length;
		DFA149_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA149_transition[i] = DFA.unpackEncodedString(DFA149_transitionS[i]);
		}
	}

	protected class DFA149 extends DFA {

		public DFA149(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 149;
			this.eot = DFA149_eot;
			this.eof = DFA149_eof;
			this.min = DFA149_min;
			this.max = DFA149_max;
			this.accept = DFA149_accept;
			this.special = DFA149_special;
			this.transition = DFA149_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 910:5: ( options {greedy=true; } : ( DOT suffix | TIC aggregate | ( signature )? tic_attribute_designator | ( LPAREN expression ( COMMA expression )* RPAREN )=> LPAREN expression ( COMMA expression )* RPAREN | ( LPAREN actual_parameter_part RPAREN )=> LPAREN actual_parameter_part RPAREN | LPAREN discrete_range RPAREN ) )*";
		}
	}

	static final String DFA154_eotS =
		"\105\uffff";
	static final String DFA154_eofS =
		"\1\uffff\1\20\1\60\102\uffff";
	static final String DFA154_minS =
		"\1\10\2\4\102\uffff";
	static final String DFA154_maxS =
		"\3\u009e\102\uffff";
	static final String DFA154_acceptS =
		"\3\uffff\1\2\1\uffff\36\1\2\uffff\36\1\2\uffff";
	static final String DFA154_specialS =
		"\1\uffff\1\0\1\1\102\uffff}>";
	static final String[] DFA154_transitionS = {
			"\1\2\2\uffff\1\3\12\uffff\1\1\10\uffff\1\3\176\uffff\1\3",
			"\1\7\1\uffff\1\10\4\uffff\1\3\7\uffff\1\22\1\12\5\uffff\1\30\1\11\3"+
			"\uffff\1\3\2\uffff\2\30\3\uffff\1\41\2\uffff\1\31\10\uffff\1\24\5\uffff"+
			"\1\14\1\35\5\uffff\1\34\1\uffff\1\16\6\uffff\1\37\1\uffff\1\21\4\uffff"+
			"\1\17\1\uffff\1\6\1\31\2\uffff\1\31\4\uffff\1\23\1\31\13\uffff\1\25\1"+
			"\uffff\1\6\1\33\1\uffff\2\27\1\40\1\32\2\uffff\4\27\1\uffff\1\36\1\14"+
			"\3\uffff\1\26\4\uffff\1\42\2\uffff\2\31\5\uffff\2\30\1\uffff\1\7\2\uffff"+
			"\1\7\5\uffff\1\15\1\13\1\6\1\30\1\6\1\5\1\3",
			"\1\47\1\uffff\1\50\4\uffff\1\3\7\uffff\1\62\1\52\5\uffff\1\70\1\51\3"+
			"\uffff\1\3\2\uffff\2\70\3\uffff\1\101\2\uffff\1\71\10\uffff\1\64\5\uffff"+
			"\1\54\1\75\5\uffff\1\74\1\uffff\1\56\6\uffff\1\77\1\uffff\1\61\4\uffff"+
			"\1\57\1\uffff\1\46\1\71\2\uffff\1\71\4\uffff\1\63\1\71\13\uffff\1\65"+
			"\1\uffff\1\46\1\73\1\uffff\2\67\1\100\1\72\2\uffff\4\67\1\uffff\1\76"+
			"\1\54\3\uffff\1\66\4\uffff\1\102\2\uffff\2\71\5\uffff\2\70\1\uffff\1"+
			"\47\2\uffff\1\47\5\uffff\1\55\1\53\1\46\1\70\1\46\1\45\1\3",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA154_eot = DFA.unpackEncodedString(DFA154_eotS);
	static final short[] DFA154_eof = DFA.unpackEncodedString(DFA154_eofS);
	static final char[] DFA154_min = DFA.unpackEncodedStringToUnsignedChars(DFA154_minS);
	static final char[] DFA154_max = DFA.unpackEncodedStringToUnsignedChars(DFA154_maxS);
	static final short[] DFA154_accept = DFA.unpackEncodedString(DFA154_acceptS);
	static final short[] DFA154_special = DFA.unpackEncodedString(DFA154_specialS);
	static final short[][] DFA154_transition;

	static {
		int numStates = DFA154_transitionS.length;
		DFA154_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA154_transition[i] = DFA.unpackEncodedString(DFA154_transitionS[i]);
		}
	}

	protected class DFA154 extends DFA {

		public DFA154(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 154;
			this.eot = DFA154_eot;
			this.eof = DFA154_eof;
			this.min = DFA154_min;
			this.max = DFA154_max;
			this.accept = DFA154_accept;
			this.special = DFA154_special;
			this.transition = DFA154_transition;
		}
		@Override
		public String getDescription() {
			return "930:1: numeric_literal : ( ( abstract_literal )=> abstract_literal | physical_literal );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA154_1 = input.LA(1);
						 
						int index154_1 = input.index();
						input.rewind();
						s = -1;
						if ( (LA154_1==STAR2) && (synpred38_Vhdl())) {s = 5;}
						else if ( (LA154_1==K_MOD||LA154_1==K_REM||LA154_1==SLASH||LA154_1==STAR) && (synpred38_Vhdl())) {s = 6;}
						else if ( (LA154_1==AND||LA154_1==MINUS||LA154_1==PLUS) && (synpred38_Vhdl())) {s = 7;}
						else if ( (LA154_1==BAR) && (synpred38_Vhdl())) {s = 8;}
						else if ( (LA154_1==EQGRT) && (synpred38_Vhdl())) {s = 9;}
						else if ( (LA154_1==COMMA) && (synpred38_Vhdl())) {s = 10;}
						else if ( (LA154_1==SEMI) && (synpred38_Vhdl())) {s = 11;}
						else if ( (LA154_1==K_DOWNTO||LA154_1==K_TO) && (synpred38_Vhdl())) {s = 12;}
						else if ( (LA154_1==RPAREN) && (synpred38_Vhdl())) {s = 13;}
						else if ( (LA154_1==K_GENERATE) && (synpred38_Vhdl())) {s = 14;}
						else if ( (LA154_1==K_LOOP) && (synpred38_Vhdl())) {s = 15;}
						else if ( (LA154_1==EOF) && (synpred38_Vhdl())) {s = 16;}
						else if ( (LA154_1==K_IS) && (synpred38_Vhdl())) {s = 17;}
						else if ( (LA154_1==COLONEQ) && (synpred38_Vhdl())) {s = 18;}
						else if ( (LA154_1==K_OPEN) && (synpred38_Vhdl())) {s = 19;}
						else if ( (LA154_1==K_BUS) && (synpred38_Vhdl())) {s = 20;}
						else if ( (LA154_1==K_REGISTER) && (synpred38_Vhdl())) {s = 21;}
						else if ( (LA154_1==K_UNITS) && (synpred38_Vhdl())) {s = 22;}
						else if ( ((LA154_1 >= K_ROL && LA154_1 <= K_ROR)||(LA154_1 >= K_SLA && LA154_1 <= K_SRL)) && (synpred38_Vhdl())) {s = 23;}
						else if ( (LA154_1==EQ||(LA154_1 >= GRT && LA154_1 <= GRTEQ)||(LA154_1 >= LST && LA154_1 <= LSTEQ)||LA154_1==SLASHEQ) && (synpred38_Vhdl())) {s = 24;}
						else if ( (LA154_1==K_AND||LA154_1==K_NAND||LA154_1==K_NOR||LA154_1==K_OR||(LA154_1 >= K_XNOR && LA154_1 <= K_XOR)) && (synpred38_Vhdl())) {s = 25;}
						else if ( (LA154_1==K_SEVERITY) && (synpred38_Vhdl())) {s = 26;}
						else if ( (LA154_1==K_REPORT) && (synpred38_Vhdl())) {s = 27;}
						else if ( (LA154_1==K_FOR) && (synpred38_Vhdl())) {s = 28;}
						else if ( (LA154_1==K_ELSE) && (synpred38_Vhdl())) {s = 29;}
						else if ( (LA154_1==K_THEN) && (synpred38_Vhdl())) {s = 30;}
						else if ( (LA154_1==K_INERTIAL) && (synpred38_Vhdl())) {s = 31;}
						else if ( (LA154_1==K_SELECT) && (synpred38_Vhdl())) {s = 32;}
						else if ( (LA154_1==K_AFTER) && (synpred38_Vhdl())) {s = 33;}
						else if ( (LA154_1==K_WHEN) && (synpred38_Vhdl())) {s = 34;}
						else if ( (LA154_1==BASIC_IDENTIFIER||LA154_1==EXTENDED_IDENTIFIER||LA154_1==STRING_LITERAL) ) {s = 3;}
						 
						input.seek(index154_1);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA154_2 = input.LA(1);
						 
						int index154_2 = input.index();
						input.rewind();
						s = -1;
						if ( (LA154_2==STAR2) && (synpred38_Vhdl())) {s = 37;}
						else if ( (LA154_2==K_MOD||LA154_2==K_REM||LA154_2==SLASH||LA154_2==STAR) && (synpred38_Vhdl())) {s = 38;}
						else if ( (LA154_2==AND||LA154_2==MINUS||LA154_2==PLUS) && (synpred38_Vhdl())) {s = 39;}
						else if ( (LA154_2==BAR) && (synpred38_Vhdl())) {s = 40;}
						else if ( (LA154_2==EQGRT) && (synpred38_Vhdl())) {s = 41;}
						else if ( (LA154_2==COMMA) && (synpred38_Vhdl())) {s = 42;}
						else if ( (LA154_2==SEMI) && (synpred38_Vhdl())) {s = 43;}
						else if ( (LA154_2==K_DOWNTO||LA154_2==K_TO) && (synpred38_Vhdl())) {s = 44;}
						else if ( (LA154_2==RPAREN) && (synpred38_Vhdl())) {s = 45;}
						else if ( (LA154_2==K_GENERATE) && (synpred38_Vhdl())) {s = 46;}
						else if ( (LA154_2==K_LOOP) && (synpred38_Vhdl())) {s = 47;}
						else if ( (LA154_2==EOF) && (synpred38_Vhdl())) {s = 48;}
						else if ( (LA154_2==K_IS) && (synpred38_Vhdl())) {s = 49;}
						else if ( (LA154_2==COLONEQ) && (synpred38_Vhdl())) {s = 50;}
						else if ( (LA154_2==K_OPEN) && (synpred38_Vhdl())) {s = 51;}
						else if ( (LA154_2==K_BUS) && (synpred38_Vhdl())) {s = 52;}
						else if ( (LA154_2==K_REGISTER) && (synpred38_Vhdl())) {s = 53;}
						else if ( (LA154_2==K_UNITS) && (synpred38_Vhdl())) {s = 54;}
						else if ( ((LA154_2 >= K_ROL && LA154_2 <= K_ROR)||(LA154_2 >= K_SLA && LA154_2 <= K_SRL)) && (synpred38_Vhdl())) {s = 55;}
						else if ( (LA154_2==EQ||(LA154_2 >= GRT && LA154_2 <= GRTEQ)||(LA154_2 >= LST && LA154_2 <= LSTEQ)||LA154_2==SLASHEQ) && (synpred38_Vhdl())) {s = 56;}
						else if ( (LA154_2==K_AND||LA154_2==K_NAND||LA154_2==K_NOR||LA154_2==K_OR||(LA154_2 >= K_XNOR && LA154_2 <= K_XOR)) && (synpred38_Vhdl())) {s = 57;}
						else if ( (LA154_2==K_SEVERITY) && (synpred38_Vhdl())) {s = 58;}
						else if ( (LA154_2==K_REPORT) && (synpred38_Vhdl())) {s = 59;}
						else if ( (LA154_2==K_FOR) && (synpred38_Vhdl())) {s = 60;}
						else if ( (LA154_2==K_ELSE) && (synpred38_Vhdl())) {s = 61;}
						else if ( (LA154_2==K_THEN) && (synpred38_Vhdl())) {s = 62;}
						else if ( (LA154_2==K_INERTIAL) && (synpred38_Vhdl())) {s = 63;}
						else if ( (LA154_2==K_SELECT) && (synpred38_Vhdl())) {s = 64;}
						else if ( (LA154_2==K_AFTER) && (synpred38_Vhdl())) {s = 65;}
						else if ( (LA154_2==K_WHEN) && (synpred38_Vhdl())) {s = 66;}
						else if ( (LA154_2==BASIC_IDENTIFIER||LA154_2==EXTENDED_IDENTIFIER||LA154_2==STRING_LITERAL) ) {s = 3;}
						 
						input.seek(index154_2);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 154, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA168_eotS =
		"\140\uffff";
	static final String DFA168_eofS =
		"\1\uffff\2\4\135\uffff";
	static final String DFA168_minS =
		"\1\10\2\4\1\10\6\uffff\5\0\36\uffff\5\0\36\uffff\14\0\4\uffff";
	static final String DFA168_maxS =
		"\1\u009e\2\u00a0\1\u009e\6\uffff\5\0\36\uffff\5\0\36\uffff\14\0\4\uffff";
	static final String DFA168_acceptS =
		"\4\uffff\1\4\4\uffff\1\5\122\uffff\1\6\1\1\1\2\1\3";
	static final String DFA168_specialS =
		"\12\uffff\1\0\1\1\1\2\1\3\1\4\36\uffff\1\5\1\6\1\7\1\10\1\11\36\uffff"+
		"\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\4\uffff}>";
	static final String[] DFA168_transitionS = {
			"\1\4\2\uffff\1\1\1\4\4\uffff\1\4\4\uffff\1\4\10\uffff\1\1\64\uffff\1"+
			"\11\3\uffff\1\4\62\uffff\1\3\22\uffff\1\2",
			"\1\4\1\uffff\1\4\14\uffff\2\4\4\uffff\1\12\2\4\6\uffff\2\4\3\uffff\1"+
			"\4\2\uffff\1\4\10\uffff\1\4\5\uffff\2\4\5\uffff\1\4\1\uffff\1\4\6\uffff"+
			"\1\4\1\uffff\1\4\4\uffff\1\4\1\uffff\2\4\2\uffff\1\4\4\uffff\2\4\13\uffff"+
			"\1\4\1\uffff\2\4\1\uffff\4\4\2\uffff\4\4\1\uffff\2\4\3\uffff\1\4\4\uffff"+
			"\1\4\2\uffff\2\4\1\14\3\uffff\1\16\2\4\1\uffff\1\4\2\uffff\1\4\5\uffff"+
			"\6\4\1\uffff\1\13\1\15",
			"\1\4\1\uffff\1\4\14\uffff\2\4\4\uffff\1\55\2\4\6\uffff\2\4\3\uffff\1"+
			"\4\2\uffff\1\4\10\uffff\1\4\5\uffff\2\4\5\uffff\1\4\1\uffff\1\4\6\uffff"+
			"\1\4\1\uffff\1\4\4\uffff\1\4\1\uffff\2\4\2\uffff\1\4\4\uffff\2\4\13\uffff"+
			"\1\4\1\uffff\2\4\1\uffff\4\4\2\uffff\4\4\1\uffff\2\4\3\uffff\1\4\4\uffff"+
			"\1\4\2\uffff\2\4\1\57\3\uffff\1\61\2\4\1\uffff\1\4\2\uffff\1\4\5\uffff"+
			"\6\4\1\uffff\1\56\1\60",
			"\1\125\2\uffff\1\121\1\127\4\uffff\1\126\4\uffff\1\124\10\uffff\1\121"+
			"\5\uffff\1\132\56\uffff\1\131\2\uffff\1\133\1\130\4\uffff\1\134\55\uffff"+
			"\1\123\3\uffff\1\120\2\uffff\1\120\13\uffff\1\122",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			""
	};

	static final short[] DFA168_eot = DFA.unpackEncodedString(DFA168_eotS);
	static final short[] DFA168_eof = DFA.unpackEncodedString(DFA168_eofS);
	static final char[] DFA168_min = DFA.unpackEncodedStringToUnsignedChars(DFA168_minS);
	static final char[] DFA168_max = DFA.unpackEncodedStringToUnsignedChars(DFA168_maxS);
	static final short[] DFA168_accept = DFA.unpackEncodedString(DFA168_acceptS);
	static final short[] DFA168_special = DFA.unpackEncodedString(DFA168_specialS);
	static final short[][] DFA168_transition;

	static {
		int numStates = DFA168_transitionS.length;
		DFA168_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA168_transition[i] = DFA.unpackEncodedString(DFA168_transitionS[i]);
		}
	}

	protected class DFA168 extends DFA {

		public DFA168(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 168;
			this.eot = DFA168_eot;
			this.eof = DFA168_eof;
			this.min = DFA168_min;
			this.max = DFA168_max;
			this.accept = DFA168_accept;
			this.special = DFA168_special;
			this.transition = DFA168_transition;
		}
		@Override
		public String getDescription() {
			return "1031:1: primary : ( ( name ( signature )? tic_attribute_designator )=> name ( signature )? tic_attribute_designator | ( name TIC )=> qualified_expression | ( LPAREN expression RPAREN )=> LPAREN expression RPAREN | literal | allocator | aggregate );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA168_10 = input.LA(1);
						 
						int index168_10 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred43_Vhdl()) ) {s = 93;}
						else if ( (synpred44_Vhdl()) ) {s = 94;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index168_10);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA168_11 = input.LA(1);
						 
						int index168_11 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred43_Vhdl()) ) {s = 93;}
						else if ( (synpred44_Vhdl()) ) {s = 94;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index168_11);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA168_12 = input.LA(1);
						 
						int index168_12 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred43_Vhdl()) ) {s = 93;}
						else if ( (synpred44_Vhdl()) ) {s = 94;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index168_12);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA168_13 = input.LA(1);
						 
						int index168_13 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred43_Vhdl()) ) {s = 93;}
						else if ( (synpred44_Vhdl()) ) {s = 94;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index168_13);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA168_14 = input.LA(1);
						 
						int index168_14 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred43_Vhdl()) ) {s = 93;}
						else if ( (synpred44_Vhdl()) ) {s = 94;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index168_14);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA168_45 = input.LA(1);
						 
						int index168_45 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred43_Vhdl()) ) {s = 93;}
						else if ( (synpred44_Vhdl()) ) {s = 94;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index168_45);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA168_46 = input.LA(1);
						 
						int index168_46 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred43_Vhdl()) ) {s = 93;}
						else if ( (synpred44_Vhdl()) ) {s = 94;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index168_46);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA168_47 = input.LA(1);
						 
						int index168_47 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred43_Vhdl()) ) {s = 93;}
						else if ( (synpred44_Vhdl()) ) {s = 94;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index168_47);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA168_48 = input.LA(1);
						 
						int index168_48 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred43_Vhdl()) ) {s = 93;}
						else if ( (synpred44_Vhdl()) ) {s = 94;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index168_48);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA168_49 = input.LA(1);
						 
						int index168_49 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred43_Vhdl()) ) {s = 93;}
						else if ( (synpred44_Vhdl()) ) {s = 94;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index168_49);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA168_80 = input.LA(1);
						 
						int index168_80 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred45_Vhdl()) ) {s = 95;}
						else if ( (true) ) {s = 92;}
						 
						input.seek(index168_80);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA168_81 = input.LA(1);
						 
						int index168_81 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred45_Vhdl()) ) {s = 95;}
						else if ( (true) ) {s = 92;}
						 
						input.seek(index168_81);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA168_82 = input.LA(1);
						 
						int index168_82 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred45_Vhdl()) ) {s = 95;}
						else if ( (true) ) {s = 92;}
						 
						input.seek(index168_82);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA168_83 = input.LA(1);
						 
						int index168_83 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred45_Vhdl()) ) {s = 95;}
						else if ( (true) ) {s = 92;}
						 
						input.seek(index168_83);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA168_84 = input.LA(1);
						 
						int index168_84 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred45_Vhdl()) ) {s = 95;}
						else if ( (true) ) {s = 92;}
						 
						input.seek(index168_84);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA168_85 = input.LA(1);
						 
						int index168_85 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred45_Vhdl()) ) {s = 95;}
						else if ( (true) ) {s = 92;}
						 
						input.seek(index168_85);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA168_86 = input.LA(1);
						 
						int index168_86 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred45_Vhdl()) ) {s = 95;}
						else if ( (true) ) {s = 92;}
						 
						input.seek(index168_86);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA168_87 = input.LA(1);
						 
						int index168_87 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred45_Vhdl()) ) {s = 95;}
						else if ( (true) ) {s = 92;}
						 
						input.seek(index168_87);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA168_88 = input.LA(1);
						 
						int index168_88 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred45_Vhdl()) ) {s = 95;}
						else if ( (true) ) {s = 92;}
						 
						input.seek(index168_88);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA168_89 = input.LA(1);
						 
						int index168_89 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred45_Vhdl()) ) {s = 95;}
						else if ( (true) ) {s = 92;}
						 
						input.seek(index168_89);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA168_90 = input.LA(1);
						 
						int index168_90 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred45_Vhdl()) ) {s = 95;}
						else if ( (true) ) {s = 92;}
						 
						input.seek(index168_90);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA168_91 = input.LA(1);
						 
						int index168_91 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred45_Vhdl()) ) {s = 95;}
						else if ( (true) ) {s = 92;}
						 
						input.seek(index168_91);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 168, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA189_eotS =
		"\124\uffff";
	static final String DFA189_eofS =
		"\124\uffff";
	static final String DFA189_minS =
		"\1\10\1\uffff\2\0\120\uffff";
	static final String DFA189_maxS =
		"\1\u009e\1\uffff\2\0\120\uffff";
	static final String DFA189_acceptS =
		"\1\uffff\1\1\2\uffff\11\1\43\uffff\1\2\43\uffff";
	static final String DFA189_specialS =
		"\1\0\1\uffff\1\1\1\2\120\uffff}>";
	static final String[] DFA189_transitionS = {
			"\1\6\2\uffff\1\2\1\10\4\uffff\1\7\4\uffff\1\5\10\uffff\1\2\5\uffff\1"+
			"\13\56\uffff\1\12\2\uffff\1\14\1\11\62\uffff\1\4\3\uffff\1\1\2\uffff"+
			"\1\1\13\uffff\1\3",
			"",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA189_eot = DFA.unpackEncodedString(DFA189_eotS);
	static final short[] DFA189_eof = DFA.unpackEncodedString(DFA189_eofS);
	static final char[] DFA189_min = DFA.unpackEncodedStringToUnsignedChars(DFA189_minS);
	static final char[] DFA189_max = DFA.unpackEncodedStringToUnsignedChars(DFA189_maxS);
	static final short[] DFA189_accept = DFA.unpackEncodedString(DFA189_acceptS);
	static final short[] DFA189_special = DFA.unpackEncodedString(DFA189_specialS);
	static final short[][] DFA189_transition;

	static {
		int numStates = DFA189_transitionS.length;
		DFA189_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA189_transition[i] = DFA.unpackEncodedString(DFA189_transitionS[i]);
		}
	}

	protected class DFA189 extends DFA {

		public DFA189(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 189;
			this.eot = DFA189_eot;
			this.eof = DFA189_eof;
			this.min = DFA189_min;
			this.max = DFA189_max;
			this.accept = DFA189_accept;
			this.special = DFA189_special;
			this.transition = DFA189_transition;
		}
		@Override
		public String getDescription() {
			return "1138:1: range : ( ( simple_expression direction simple_expression )=> simple_expression direction simple_expression | name );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA189_0 = input.LA(1);
						 
						int index189_0 = input.index();
						input.rewind();
						s = -1;
						if ( (LA189_0==MINUS||LA189_0==PLUS) && (synpred53_Vhdl())) {s = 1;}
						else if ( (LA189_0==BASIC_IDENTIFIER||LA189_0==EXTENDED_IDENTIFIER) ) {s = 2;}
						else if ( (LA189_0==STRING_LITERAL) ) {s = 3;}
						else if ( (LA189_0==LPAREN) && (synpred53_Vhdl())) {s = 4;}
						else if ( (LA189_0==DECIMAL_LITERAL) && (synpred53_Vhdl())) {s = 5;}
						else if ( (LA189_0==BASED_LITERAL) && (synpred53_Vhdl())) {s = 6;}
						else if ( (LA189_0==CHARACTER_LITERAL) && (synpred53_Vhdl())) {s = 7;}
						else if ( (LA189_0==BIT_STRING_LITERAL) && (synpred53_Vhdl())) {s = 8;}
						else if ( (LA189_0==K_NULL) && (synpred53_Vhdl())) {s = 9;}
						else if ( (LA189_0==K_NEW) && (synpred53_Vhdl())) {s = 10;}
						else if ( (LA189_0==K_ABS) && (synpred53_Vhdl())) {s = 11;}
						else if ( (LA189_0==K_NOT) && (synpred53_Vhdl())) {s = 12;}
						 
						input.seek(index189_0);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA189_2 = input.LA(1);
						 
						int index189_2 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred53_Vhdl()) ) {s = 12;}
						else if ( (true) ) {s = 48;}
						 
						input.seek(index189_2);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA189_3 = input.LA(1);
						 
						int index189_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred53_Vhdl()) ) {s = 12;}
						else if ( (true) ) {s = 48;}
						 
						input.seek(index189_3);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 189, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_decimal_literal_in_abstract_literal993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_based_literal_in_abstract_literal999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ACCESS_in_access_type_definition1010 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_subtype_indication_in_access_type_definition1012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_actual_designator1023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_OPEN_in_actual_designator1029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_association_list_in_actual_parameter_part1040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_name_in_actual_part1058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_LPAREN_in_actual_part1060 = new BitSet(new long[]{0x0000002080421900L,0x0000000009900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_actual_designator_in_actual_part1062 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_actual_part1064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_actual_designator_in_actual_part1070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_aggregate1104 = new BitSet(new long[]{0x0000002080421900L,0x0000000021900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_element_association_in_aggregate1106 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_aggregate1109 = new BitSet(new long[]{0x0000002080421900L,0x0000000021900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_element_association_in_aggregate1111 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_aggregate1115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALIAS_in_alias_declaration1126 = new BitSet(new long[]{0x0000000080020800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_alias_designator_in_alias_declaration1128 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000800L});
	public static final BitSet FOLLOW_COLON_in_alias_declaration1131 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_subtype_indication_in_alias_declaration1133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_K_IS_in_alias_declaration1146 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_name_in_alias_declaration1148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000080L});
	public static final BitSet FOLLOW_signature_in_alias_declaration1151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_alias_declaration1155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_alias_designator1166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_character_literal_in_alias_designator1172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operator_symbol_in_alias_designator1178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_NEW_in_allocator1189 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_subtype_indication_in_allocator1209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualified_expression_in_allocator1223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ARCHITECTURE_in_architecture_body1244 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_identifier_in_architecture_body1246 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_K_OF_in_architecture_body1248 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_name_in_architecture_body1250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_K_IS_in_architecture_body1252 = new BitSet(new long[]{0x81A0C10000000000L,0x8886002400000093L,0x0000000000000001L});
	public static final BitSet FOLLOW_architecture_declarative_part_in_architecture_body1262 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_K_BEGIN_in_architecture_body1272 = new BitSet(new long[]{0x1000200080000800L,0x0000000A00000000L,0x0000000040000810L});
	public static final BitSet FOLLOW_architecture_statement_part_in_architecture_body1274 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_K_END_in_architecture_body1276 = new BitSet(new long[]{0x0000080080000800L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_K_ARCHITECTURE_in_architecture_body1287 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_simple_name_in_architecture_body1292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_architecture_body1296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_declarative_item_in_architecture_declarative_part1308 = new BitSet(new long[]{0x81A0410000000002L,0x8886002400000093L,0x0000000000000001L});
	public static final BitSet FOLLOW_concurrent_statement_in_architecture_statement_part1322 = new BitSet(new long[]{0x0000200080000802L,0x0000000A00000000L,0x0000000040000810L});
	public static final BitSet FOLLOW_unconstrained_array_definition_in_array_type_definition1340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constrained_array_definition_in_array_type_definition1346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ASSERT_in_assertion1357 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_condition_in_assertion1359 = new BitSet(new long[]{0x0000000000000002L,0x0001080000000000L});
	public static final BitSet FOLLOW_K_REPORT_in_assertion1370 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_expression_in_assertion1372 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_K_SEVERITY_in_assertion1385 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_expression_in_assertion1387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_colon_in_assertion_statement1401 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_assertion_in_assertion_statement1405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_assertion_statement1407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formal_part_in_association_element1426 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_EQGRT_in_association_element1428 = new BitSet(new long[]{0x0000002080421900L,0x0000000009900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_actual_part_in_association_element1432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_association_element_in_association_list1443 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_COMMA_in_association_list1446 = new BitSet(new long[]{0x0000002080421900L,0x0000000009900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_association_element_in_association_list1448 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_K_ATTRIBUTE_in_attribute_declaration1461 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_identifier_in_attribute_declaration1463 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_COLON_in_attribute_declaration1465 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_name_in_attribute_declaration1467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_attribute_declaration1469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_name_in_attribute_designator1480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIC_SIMPLE_NAME_in_tic_attribute_designator1489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ATTRIBUTE_in_attribute_specification1500 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_attribute_designator_in_attribute_specification1502 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_K_OF_in_attribute_specification1513 = new BitSet(new long[]{0x0000020080020800L,0x0000000020000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_entity_specification_in_attribute_specification1515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_K_IS_in_attribute_specification1517 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_expression_in_attribute_specification1519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_attribute_specification1521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_base_unit_declaration1532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BASED_LITERAL_in_based_literal1543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_USE_in_binding_indication1555 = new BitSet(new long[]{0x2040000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_entity_aspect_in_binding_indication1557 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000008L});
	public static final BitSet FOLLOW_generic_map_aspect_in_binding_indication1563 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
	public static final BitSet FOLLOW_port_map_aspect_in_binding_indication1568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BIT_STRING_LITERAL_in_bit_string_literal1583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FOR_in_block_configuration1594 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_block_specification_in_block_configuration1596 = new BitSet(new long[]{0x1000000000000000L,0x8000000000000001L});
	public static final BitSet FOLLOW_use_clause_in_block_configuration1599 = new BitSet(new long[]{0x1000000000000000L,0x8000000000000001L});
	public static final BitSet FOLLOW_configuration_item_in_block_configuration1604 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_K_END_in_block_configuration1616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_K_FOR_in_block_configuration1618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_block_configuration1620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subprogram_declaration_in_block_declarative_item1636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subprogram_body_in_block_declarative_item1642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_declaration_in_block_declarative_item1648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subtype_declaration_in_block_declarative_item1654 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_declaration_in_block_declarative_item1660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_signal_declaration_in_block_declarative_item1666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_declaration_in_block_declarative_item1672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_file_declaration_in_block_declarative_item1678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alias_declaration_in_block_declarative_item1684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_component_declaration_in_block_declarative_item1690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attribute_specification_in_block_declarative_item1701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attribute_declaration_in_block_declarative_item1707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_configuration_specification_in_block_declarative_item1713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_disconnection_specification_in_block_declarative_item1719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_use_clause_in_block_declarative_item1725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_declaration_in_block_declarative_item1740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_template_declaration_in_block_declarative_item1746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_declarative_item_in_block_declarative_part1758 = new BitSet(new long[]{0x81A0410000000002L,0x8886002400000093L,0x0000000000000001L});
	public static final BitSet FOLLOW_generic_clause_in_block_header1772 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000008L});
	public static final BitSet FOLLOW_generic_map_aspect_in_block_header1775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_block_header1777 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
	public static final BitSet FOLLOW_port_clause_in_block_header1793 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
	public static final BitSet FOLLOW_port_map_aspect_in_block_header1796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_block_header1798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_in_block_specification1821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_LPAREN_in_block_specification1823 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_index_specification_in_block_specification1825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_block_specification1827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_name_in_block_specification1833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_in_block_statement1844 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_COLON_in_block_statement1846 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_K_BLOCK_in_block_statement1848 = new BitSet(new long[]{0x81A0C10000000000L,0x888600250000089BL,0x0000000000000801L});
	public static final BitSet FOLLOW_LPAREN_in_block_statement1851 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_expression_in_block_statement1853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_block_statement1855 = new BitSet(new long[]{0x81A0C10000000000L,0x888600250000089BL,0x0000000000000001L});
	public static final BitSet FOLLOW_K_IS_in_block_statement1860 = new BitSet(new long[]{0x81A0C10000000000L,0x888600250000009BL,0x0000000000000001L});
	public static final BitSet FOLLOW_block_header_in_block_statement1872 = new BitSet(new long[]{0x81A0C10000000000L,0x8886002400000093L,0x0000000000000001L});
	public static final BitSet FOLLOW_block_declarative_part_in_block_statement1874 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_K_BEGIN_in_block_statement1884 = new BitSet(new long[]{0x1000200080000800L,0x0000000A00000000L,0x0000000040000810L});
	public static final BitSet FOLLOW_block_statement_part_in_block_statement1886 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_K_END_in_block_statement1888 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_K_BLOCK_in_block_statement1890 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_label_in_block_statement1893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_block_statement1897 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_concurrent_statement_in_block_statement_part1909 = new BitSet(new long[]{0x0000200080000802L,0x0000000A00000000L,0x0000000040000810L});
	public static final BitSet FOLLOW_label_colon_in_case_statement1923 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_K_CASE_in_case_statement1927 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_expression_in_case_statement1929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_K_IS_in_case_statement1931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_case_statement_alternative_in_case_statement1942 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_K_END_in_case_statement1954 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_K_CASE_in_case_statement1956 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_label_in_case_statement1959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_case_statement1963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_WHEN_in_case_statement_alternative1974 = new BitSet(new long[]{0x0000002080421900L,0x0000000021900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_choices_in_case_statement_alternative1976 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_EQGRT_in_case_statement_alternative1978 = new BitSet(new long[]{0x4010200080000800L,0x0000180001210041L,0x000000004000080AL});
	public static final BitSet FOLLOW_sequence_of_statements_in_case_statement_alternative1980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_LITERAL_in_character_literal1989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_expression_in_choice2005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_name_in_choice2016 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_discrete_range_in_choice2022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_OTHERS_in_choice2028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_choice_in_choices2039 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_BAR_in_choices2042 = new BitSet(new long[]{0x0000002080421900L,0x0000000021900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_choice_in_choices2044 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_K_FOR_in_component_configuration2057 = new BitSet(new long[]{0x0000020080000800L,0x0000000020000000L});
	public static final BitSet FOLLOW_component_specification_in_component_configuration2059 = new BitSet(new long[]{0x1000000000000000L,0x8000000100000009L,0x0000000002000000L});
	public static final BitSet FOLLOW_binding_indication_in_component_configuration2062 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_component_configuration2064 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_block_configuration_in_component_configuration2077 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_K_END_in_component_configuration2081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_K_FOR_in_component_configuration2083 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_component_configuration2085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COMPONENT_in_component_declaration2096 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_identifier_in_component_declaration2098 = new BitSet(new long[]{0x1000000000000000L,0x0000000100000808L});
	public static final BitSet FOLLOW_K_IS_in_component_declaration2101 = new BitSet(new long[]{0x1000000000000000L,0x0000000100000008L});
	public static final BitSet FOLLOW_generic_clause_in_component_declaration2114 = new BitSet(new long[]{0x1000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_port_clause_in_component_declaration2119 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_K_END_in_component_declaration2131 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_K_COMPONENT_in_component_declaration2133 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_simple_name_in_component_declaration2136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_component_declaration2140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_in_component_instantiation_statement2153 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_COLON_in_component_instantiation_statement2155 = new BitSet(new long[]{0x2060000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_instantiated_unit_in_component_instantiation_statement2159 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000008L,0x0000000002000000L});
	public static final BitSet FOLLOW_generic_map_aspect_in_component_instantiation_statement2165 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_port_map_aspect_in_component_instantiation_statement2170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_component_instantiation_statement2174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instantiation_list_in_component_specification2185 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_COLON_in_component_specification2187 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_name_in_component_specification2189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_type_definition_in_composite_type_definition2200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_record_type_definition_in_composite_type_definition2206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_colon_in_concurrent_assertion_statement2218 = new BitSet(new long[]{0x0000200000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_K_POSTPONED_in_concurrent_assertion_statement2223 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_assertion_in_concurrent_assertion_statement2227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_concurrent_assertion_statement2229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_colon_in_concurrent_procedure_call_statement2245 = new BitSet(new long[]{0x0000000080000800L,0x0000000200000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_K_POSTPONED_in_concurrent_procedure_call_statement2248 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_procedure_call_in_concurrent_procedure_call_statement2252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_concurrent_procedure_call_statement2254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_POSTPONED_in_concurrent_procedure_call_statement2261 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_procedure_call_in_concurrent_procedure_call_statement2265 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_concurrent_procedure_call_statement2267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_colon_in_concurrent_signal_assignment_statement2286 = new BitSet(new long[]{0x0000000080000800L,0x0000000200000000L,0x0000000040000810L});
	public static final BitSet FOLLOW_K_POSTPONED_in_concurrent_signal_assignment_statement2289 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000810L});
	public static final BitSet FOLLOW_concurrent_signal_assignment_statement_2_in_concurrent_signal_assignment_statement2293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_POSTPONED_in_concurrent_signal_assignment_statement2300 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000810L});
	public static final BitSet FOLLOW_concurrent_signal_assignment_statement_2_in_concurrent_signal_assignment_statement2304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_signal_assignment_in_concurrent_signal_assignment_statement_22313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selected_signal_assignment_in_concurrent_signal_assignment_statement_22319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_statement_in_concurrent_statement2335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_process_statement_in_concurrent_statement2346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_concurrent_procedure_call_statement_in_concurrent_statement2360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_concurrent_assertion_statement_in_concurrent_statement2371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_concurrent_signal_assignment_statement_in_concurrent_statement2384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_component_instantiation_statement_in_concurrent_statement2397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_generate_statement_in_concurrent_statement2403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_condition2414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_UNTIL_in_condition_clause2425 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_condition_in_condition_clause2427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_target_in_conditional_signal_assignment2440 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_LSTEQ_in_conditional_signal_assignment2442 = new BitSet(new long[]{0x0000002080421900L,0x1400020001900220L,0x0000000040048800L});
	public static final BitSet FOLLOW_voptions_in_conditional_signal_assignment2444 = new BitSet(new long[]{0x0000002080421900L,0x1000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_conditional_waveforms_in_conditional_signal_assignment2446 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_conditional_signal_assignment2448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_waveform_in_conditional_waveforms2457 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_conditional_waveforms_2_in_conditional_waveforms2469 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_K_WHEN_in_conditional_waveforms2479 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_condition_in_conditional_waveforms2481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_WHEN_in_conditional_waveforms_22492 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_condition_in_conditional_waveforms_22494 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_K_ELSE_in_conditional_waveforms_22496 = new BitSet(new long[]{0x0000002080421900L,0x1000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_waveform_in_conditional_waveforms_22498 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_conditional_waveforms_2_in_conditional_waveforms_22515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CONFIGURATION_in_configuration_declaration2528 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_identifier_in_configuration_declaration2530 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_K_OF_in_configuration_declaration2532 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_name_in_configuration_declaration2534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_K_IS_in_configuration_declaration2536 = new BitSet(new long[]{0x0000400000000000L,0x8000000000000011L});
	public static final BitSet FOLLOW_configuration_declarative_part_in_configuration_declaration2546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_block_configuration_in_configuration_declaration2548 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_K_END_in_configuration_declaration2558 = new BitSet(new long[]{0x0040000080000800L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_K_CONFIGURATION_in_configuration_declaration2561 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_simple_name_in_configuration_declaration2566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_configuration_declaration2570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_use_clause_in_configuration_declarative_item2581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attribute_specification_in_configuration_declarative_item2587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_declaration_in_configuration_declarative_item2593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_configuration_declarative_item_in_configuration_declarative_part2605 = new BitSet(new long[]{0x0000400000000002L,0x8000000000000010L});
	public static final BitSet FOLLOW_block_configuration_in_configuration_item2623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_component_configuration_in_configuration_item2629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FOR_in_configuration_specification2640 = new BitSet(new long[]{0x0000020080000800L,0x0000000020000000L});
	public static final BitSet FOLLOW_component_specification_in_configuration_specification2642 = new BitSet(new long[]{0x0000000000000000L,0x8000000100000008L,0x0000000002000000L});
	public static final BitSet FOLLOW_binding_indication_in_configuration_specification2644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_configuration_specification2646 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CONSTANT_in_constant_declaration2657 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_identifier_list_in_constant_declaration2659 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_COLON_in_constant_declaration2661 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_subtype_indication_in_constant_declaration2663 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_COLONEQ_in_constant_declaration2666 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_expression_in_constant_declaration2668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_constant_declaration2672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ARRAY_in_constrained_array_definition2683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_index_constraint_in_constrained_array_definition2685 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_K_OF_in_constrained_array_definition2687 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_subtype_indication_in_constrained_array_definition2689 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_range_constraint_in_constraint2700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_constraint_in_constraint2706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_context_item_in_context_clause2718 = new BitSet(new long[]{0x0000000000000002L,0x8000000000002000L});
	public static final BitSet FOLLOW_library_clause_in_context_item2731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_use_clause_in_context_item2737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECIMAL_LITERAL_in_decimal_literal2748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_declaration_in_declaration2759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subtype_declaration_in_declaration2765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_object_declaration_in_declaration2777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interface_declaration_in_declaration2784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alias_declaration_in_declaration2791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attribute_declaration_in_declaration2797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_component_declaration_in_declaration2804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_declaration_in_declaration2820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_template_declaration_in_declaration2826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entity_declaration_in_declaration2832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_configuration_declaration_in_declaration2839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subprogram_declaration_in_declaration2846 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_package_declaration_in_declaration2853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TRANSPORT_in_delay_mechanism2864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_REJECT_in_delay_mechanism2871 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_expression_in_delay_mechanism2873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_INERTIAL_in_delay_mechanism2877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_design_unit_in_design_file2890 = new BitSet(new long[]{0x2040080000000002L,0x8000000080002000L});
	public static final BitSet FOLLOW_context_clause_in_design_unit2903 = new BitSet(new long[]{0x2040080000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_library_unit_in_design_unit2905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_designator2916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operator_symbol_in_designator2923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DISCONNECT_in_disconnection_specification2952 = new BitSet(new long[]{0x0000020080000800L,0x0000000020000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_guarded_signal_specification_in_disconnection_specification2954 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_K_AFTER_in_disconnection_specification2956 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_expression_in_disconnection_specification2958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_disconnection_specification2960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_range_in_discrete_range2976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subtype_indication_in_discrete_range2982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_choices_in_element_association3001 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_EQGRT_in_element_association3003 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_expression_in_element_association3007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_list_in_element_declaration3018 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_COLON_in_element_declaration3020 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_element_subtype_definition_in_element_declaration3022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_element_declaration3024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subtype_indication_in_element_subtype_definition3035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ENTITY_in_entity_aspect3046 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_name_in_entity_aspect3048 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_LPAREN_in_entity_aspect3051 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_identifier_in_entity_aspect3053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_entity_aspect3055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CONFIGURATION_in_entity_aspect3063 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_name_in_entity_aspect3065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_OPEN_in_entity_aspect3071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entity_class_in_entity_class_entry3180 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_LSTGRT_in_entity_class_entry3183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entity_class_entry_in_entity_class_entry_list3196 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_COMMA_in_entity_class_entry_list3199 = new BitSet(new long[]{0x20E0080000000000L,0x2884000480009002L,0x0000000000000001L});
	public static final BitSet FOLLOW_entity_class_entry_in_entity_class_entry_list3201 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_K_ENTITY_in_entity_declaration3214 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_identifier_in_entity_declaration3216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_K_IS_in_entity_declaration3220 = new BitSet(new long[]{0x9180C10000000000L,0x888600250000009AL,0x0000000000000001L});
	public static final BitSet FOLLOW_entity_header_in_entity_declaration3222 = new BitSet(new long[]{0x9180C10000000000L,0x8886002400000092L,0x0000000000000001L});
	public static final BitSet FOLLOW_entity_declarative_part_in_entity_declaration3224 = new BitSet(new long[]{0x1000800000000000L});
	public static final BitSet FOLLOW_K_BEGIN_in_entity_declaration3235 = new BitSet(new long[]{0x1000200080000800L,0x0000000A00000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_entity_statement_part_in_entity_declaration3237 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_K_END_in_entity_declaration3249 = new BitSet(new long[]{0x2000000080000800L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_K_ENTITY_in_entity_declaration3252 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_simple_name_in_entity_declaration3257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_entity_declaration3261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subprogram_declaration_in_entity_declarative_item3277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subprogram_body_in_entity_declarative_item3283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_declaration_in_entity_declarative_item3290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subtype_declaration_in_entity_declarative_item3297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_declaration_in_entity_declarative_item3304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_signal_declaration_in_entity_declarative_item3311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_declaration_in_entity_declarative_item3318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_file_declaration_in_entity_declarative_item3325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alias_declaration_in_entity_declarative_item3332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attribute_specification_in_entity_declarative_item3344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attribute_declaration_in_entity_declarative_item3350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_disconnection_specification_in_entity_declarative_item3356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_use_clause_in_entity_declarative_item3363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_declaration_in_entity_declarative_item3379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_template_declaration_in_entity_declarative_item3385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entity_declarative_item_in_entity_declarative_part3397 = new BitSet(new long[]{0x8180410000000002L,0x8886002400000092L,0x0000000000000001L});
	public static final BitSet FOLLOW_entity_tag_in_entity_designator3410 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_signature_in_entity_designator3413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_generic_clause_in_entity_header3427 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
	public static final BitSet FOLLOW_port_clause_in_entity_header3433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entity_designator_in_entity_name_list3446 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_COMMA_in_entity_name_list3449 = new BitSet(new long[]{0x0000000080020800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_entity_designator_in_entity_name_list3451 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_K_OTHERS_in_entity_name_list3459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_entity_name_list3465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entity_name_list_in_entity_specification3476 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_COLON_in_entity_specification3478 = new BitSet(new long[]{0x20E0080000000000L,0x2884000480009002L,0x0000000000000001L});
	public static final BitSet FOLLOW_entity_class_in_entity_specification3480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_concurrent_assertion_statement_in_entity_statement3496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_concurrent_procedure_call_statement_in_entity_statement3510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_process_statement_in_entity_statement3517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entity_statement_in_entity_statement_part3529 = new BitSet(new long[]{0x0000200080000802L,0x0000000A00000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_simple_name_in_entity_tag3542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_character_literal_in_entity_tag3549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operator_symbol_in_entity_tag3556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_enumeration_literal3567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_character_literal_in_enumeration_literal3574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_enumeration_type_definition3585 = new BitSet(new long[]{0x0000000080020800L});
	public static final BitSet FOLLOW_enumeration_literal_in_enumeration_type_definition3587 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_enumeration_type_definition3590 = new BitSet(new long[]{0x0000000080020800L});
	public static final BitSet FOLLOW_enumeration_literal_in_enumeration_type_definition3592 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_enumeration_type_definition3596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_colon_in_exit_statement3608 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_K_EXIT_in_exit_statement3612 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000002000004L});
	public static final BitSet FOLLOW_label_in_exit_statement3615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000004L});
	public static final BitSet FOLLOW_K_WHEN_in_exit_statement3620 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_condition_in_exit_statement3622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_exit_statement3626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relation_in_expression3637 = new BitSet(new long[]{0x0000040000000002L,0x0000000010480000L,0x0000000000000060L});
	public static final BitSet FOLLOW_logical_op_in_expression3640 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_relation_in_expression3642 = new BitSet(new long[]{0x0000040000000002L,0x0000000010480000L,0x0000000000000060L});
	public static final BitSet FOLLOW_primary_in_factor3684 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_STAR2_in_factor3695 = new BitSet(new long[]{0x0000000080421900L,0x0000000001100000L,0x0000000040000800L});
	public static final BitSet FOLLOW_primary_in_factor3697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ABS_in_factor3705 = new BitSet(new long[]{0x0000000080421900L,0x0000000001100000L,0x0000000040000800L});
	public static final BitSet FOLLOW_primary_in_factor3707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_NOT_in_factor3713 = new BitSet(new long[]{0x0000000080421900L,0x0000000001100000L,0x0000000040000800L});
	public static final BitSet FOLLOW_primary_in_factor3715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FILE_in_file_declaration3726 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_identifier_list_in_file_declaration3728 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_COLON_in_file_declaration3730 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_subtype_indication_in_file_declaration3735 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000800L,0x0000000002000000L});
	public static final BitSet FOLLOW_file_open_information_in_file_declaration3738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_file_declaration3742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_file_logical_name3753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_OPEN_in_file_open_information3766 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_expression_in_file_open_information3768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_K_IS_in_file_open_information3772 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_file_logical_name_in_file_open_information3774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FILE_in_file_type_definition3786 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_K_OF_in_file_type_definition3788 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_name_in_file_type_definition3790 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_range_constraint_in_floating_type_definition3801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interface_list_in_formal_parameter_list3812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_name_in_formal_part3823 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_LPAREN_in_formal_part3826 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_name_in_formal_part3828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_formal_part3830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TYPE_in_full_type_declaration3844 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_identifier_in_full_type_declaration3846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_K_IS_in_full_type_declaration3848 = new BitSet(new long[]{0x8000104000000000L,0x000000D000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_type_definition_in_full_type_declaration3850 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_full_type_declaration3852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_name_in_function_call3862 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_LPAREN_in_function_call3865 = new BitSet(new long[]{0x0000002080421900L,0x0000000009900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_actual_parameter_part_in_function_call3867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_function_call3869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_in_generate_statement3882 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_COLON_in_generate_statement3884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000041L});
	public static final BitSet FOLLOW_generation_scheme_in_generate_statement3886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_K_GENERATE_in_generate_statement3888 = new BitSet(new long[]{0x91A0E10080000800L,0x8886002E00000093L,0x0000000040000811L});
	public static final BitSet FOLLOW_block_declarative_item_in_generate_statement3900 = new BitSet(new long[]{0x81A0C10000000000L,0x8886002400000093L,0x0000000000000001L});
	public static final BitSet FOLLOW_K_BEGIN_in_generate_statement3904 = new BitSet(new long[]{0x1000200080000800L,0x0000000A00000000L,0x0000000040000810L});
	public static final BitSet FOLLOW_concurrent_statement_in_generate_statement3917 = new BitSet(new long[]{0x1000200080000800L,0x0000000A00000000L,0x0000000040000810L});
	public static final BitSet FOLLOW_K_END_in_generate_statement3929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_K_GENERATE_in_generate_statement3931 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_label_in_generate_statement3934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_generate_statement3938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FOR_in_generation_scheme3949 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_parameter_specification_in_generation_scheme3951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_IF_in_generation_scheme3957 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_condition_in_generation_scheme3959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_GENERIC_in_generic_clause3970 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_LPAREN_in_generic_clause3972 = new BitSet(new long[]{0x8080000080000800L,0x0004000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_generic_list_in_generic_clause3974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_generic_clause3976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_generic_clause3978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interface_list_in_generic_list3989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_GENERIC_in_generic_map_aspect4000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_K_MAP_in_generic_map_aspect4002 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_LPAREN_in_generic_map_aspect4004 = new BitSet(new long[]{0x0000002080421900L,0x0000000009900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_association_list_in_generic_map_aspect4006 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_generic_map_aspect4008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_name_in_group_constituent4019 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_character_literal_in_group_constituent4026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_constituent_in_group_constituent_list4037 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_COMMA_in_group_constituent_list4040 = new BitSet(new long[]{0x0000000080020800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_group_constituent_in_group_constituent_list4042 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_K_GROUP_in_group_declaration4055 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_identifier_in_group_declaration4057 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_COLON_in_group_declaration4059 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_name_in_group_declaration4061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_LPAREN_in_group_declaration4063 = new BitSet(new long[]{0x0000000080020800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_group_constituent_list_in_group_declaration4065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_group_declaration4067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_group_declaration4069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_GROUP_in_group_template_declaration4080 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_identifier_in_group_template_declaration4082 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_K_IS_in_group_template_declaration4084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_LPAREN_in_group_template_declaration4086 = new BitSet(new long[]{0x20E0080000000000L,0x2884000480009002L,0x0000000000000001L});
	public static final BitSet FOLLOW_entity_class_entry_list_in_group_template_declaration4088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_group_template_declaration4090 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_group_template_declaration4092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_signal_list_in_guarded_signal_specification4103 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_COLON_in_guarded_signal_specification4105 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_name_in_guarded_signal_specification4107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_identifier_list4139 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_COMMA_in_identifier_list4142 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_identifier_in_identifier_list4144 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_label_colon_in_if_statement4158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_IF_in_if_statement4170 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_condition_in_if_statement4172 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_K_THEN_in_if_statement4174 = new BitSet(new long[]{0x5C10200080000800L,0x0000180001210041L,0x000000004000080AL});
	public static final BitSet FOLLOW_sequence_of_statements_in_if_statement4176 = new BitSet(new long[]{0x1C00000000000000L});
	public static final BitSet FOLLOW_K_ELSIF_in_if_statement4187 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_condition_in_if_statement4189 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_K_THEN_in_if_statement4191 = new BitSet(new long[]{0x5C10200080000800L,0x0000180001210041L,0x000000004000080AL});
	public static final BitSet FOLLOW_sequence_of_statements_in_if_statement4193 = new BitSet(new long[]{0x1C00000000000000L});
	public static final BitSet FOLLOW_K_ELSE_in_if_statement4206 = new BitSet(new long[]{0x5010200080000800L,0x0000180001210041L,0x000000004000080AL});
	public static final BitSet FOLLOW_sequence_of_statements_in_if_statement4208 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_K_END_in_if_statement4212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_IF_in_if_statement4214 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_label_in_if_statement4217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_if_statement4221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TYPE_in_incomplete_type_declaration4232 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_identifier_in_incomplete_type_declaration4234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_incomplete_type_declaration4236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_index_constraint4247 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_discrete_range_in_index_constraint4249 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_index_constraint4252 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_discrete_range_in_index_constraint4254 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_index_constraint4258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_discrete_range_in_index_specification4274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_index_specification4280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_name_in_index_subtype_definition4291 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_K_RANGE_in_index_subtype_definition4293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_LSTGRT_in_index_subtype_definition4295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COMPONENT_in_instantiated_unit4308 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_name_in_instantiated_unit4312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ENTITY_in_instantiated_unit4318 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_name_in_instantiated_unit4320 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_LPAREN_in_instantiated_unit4323 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_identifier_in_instantiated_unit4325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_instantiated_unit4327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CONFIGURATION_in_instantiated_unit4336 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_name_in_instantiated_unit4338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_in_instantiation_list4350 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_COMMA_in_instantiation_list4353 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_label_in_instantiation_list4355 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_K_OTHERS_in_instantiation_list4363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_instantiation_list4370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CONSTANT_in_interface_constant_declaration4382 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_identifier_list_in_interface_constant_declaration4386 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_COLON_in_interface_constant_declaration4388 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000100L,0x0000000040000000L});
	public static final BitSet FOLLOW_K_IN_in_interface_constant_declaration4391 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_subtype_indication_in_interface_constant_declaration4395 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_COLONEQ_in_interface_constant_declaration4406 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_expression_in_interface_constant_declaration4408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interface_constant_declaration_in_interface_declaration4426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interface_signal_declaration_in_interface_declaration4438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interface_variable_declaration_in_interface_declaration4445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interface_file_declaration_in_interface_declaration4452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interface_declaration_in_interface_element4463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FILE_in_interface_file_declaration4474 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_identifier_list_in_interface_file_declaration4476 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_COLON_in_interface_file_declaration4478 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_subtype_indication_in_interface_file_declaration4480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interface_element_in_interface_list4491 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_interface_list4494 = new BitSet(new long[]{0x8080000080000800L,0x0004000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_interface_element_in_interface_list4496 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_K_SIGNAL_in_interface_signal_declaration4510 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_identifier_list_in_interface_signal_declaration4514 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_COLON_in_interface_signal_declaration4516 = new BitSet(new long[]{0x0004000080000800L,0x0000000040004500L,0x0000000040000000L});
	public static final BitSet FOLLOW_mode_in_interface_signal_declaration4519 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_subtype_indication_in_interface_signal_declaration4523 = new BitSet(new long[]{0x0008000000080002L});
	public static final BitSet FOLLOW_K_BUS_in_interface_signal_declaration4526 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_COLONEQ_in_interface_signal_declaration4540 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_expression_in_interface_signal_declaration4542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_VARIABLE_in_interface_variable_declaration4556 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_identifier_list_in_interface_variable_declaration4560 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_COLON_in_interface_variable_declaration4562 = new BitSet(new long[]{0x0004000080000800L,0x0000000040004500L,0x0000000040000000L});
	public static final BitSet FOLLOW_mode_in_interface_variable_declaration4565 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_subtype_indication_in_interface_variable_declaration4569 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_COLONEQ_in_interface_variable_declaration4580 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_expression_in_interface_variable_declaration4582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_WHILE_in_iteration_scheme4595 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_condition_in_iteration_scheme4597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FOR_in_iteration_scheme4603 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_parameter_specification_in_iteration_scheme4605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_label4616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_in_label_colon4627 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_COLON_in_label_colon4629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LIBRARY_in_library_clause4640 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_logical_name_list_in_library_clause4642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_library_clause4644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_secondary_unit_in_library_unit4666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_unit_in_library_unit4672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_literal_in_literal4688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumeration_literal_in_literal4694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_literal_in_literal4701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bit_string_literal_in_literal4708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_NULL_in_literal4715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_logical_name4726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_name_in_logical_name_list4738 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_COMMA_in_logical_name_list4741 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_logical_name_in_logical_name_list4743 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_label_colon_in_loop_statement4798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010001L,0x0000000000000008L});
	public static final BitSet FOLLOW_iteration_scheme_in_loop_statement4811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_K_LOOP_in_loop_statement4815 = new BitSet(new long[]{0x5010200080000800L,0x0000180001210041L,0x000000004000080AL});
	public static final BitSet FOLLOW_sequence_of_statements_in_loop_statement4817 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_K_END_in_loop_statement4827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_K_LOOP_in_loop_statement4829 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_label_in_loop_statement4832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_loop_statement4836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_name_in_name4950 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000180000880L});
	public static final BitSet FOLLOW_operator_symbol_in_name4960 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000180000880L});
	public static final BitSet FOLLOW_DOT_in_name4994 = new BitSet(new long[]{0x0000020080020800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_suffix_in_name4996 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000180000880L});
	public static final BitSet FOLLOW_TIC_in_name5010 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_aggregate_in_name5012 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000180000880L});
	public static final BitSet FOLLOW_signature_in_name5027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_tic_attribute_designator_in_name5031 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000180000880L});
	public static final BitSet FOLLOW_LPAREN_in_name5071 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_expression_in_name5073 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_name5076 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_expression_in_name5078 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_name5082 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000180000880L});
	public static final BitSet FOLLOW_LPAREN_in_name5105 = new BitSet(new long[]{0x0000002080421900L,0x0000000009900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_actual_parameter_part_in_name5107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_name5109 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000180000880L});
	public static final BitSet FOLLOW_LPAREN_in_name5123 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_discrete_range_in_name5125 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_name5127 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000180000880L});
	public static final BitSet FOLLOW_label_colon_in_next_statement5156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_K_NEXT_in_next_statement5160 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000002000004L});
	public static final BitSet FOLLOW_label_in_next_statement5163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000004L});
	public static final BitSet FOLLOW_K_WHEN_in_next_statement5168 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_condition_in_next_statement5170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_next_statement5174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_colon_in_null_statement5186 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_NULL_in_null_statement5190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_null_statement5192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_abstract_literal_in_numeric_literal5208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_physical_literal_in_numeric_literal5214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_declaration_in_object_declaration5231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_signal_declaration_in_object_declaration5237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_declaration_in_object_declaration5244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_file_declaration_in_object_declaration5251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_literal_in_operator_symbol5262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_PACKAGE_in_package_body5275 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_K_BODY_in_package_body5277 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_simple_name_in_package_body5279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_K_IS_in_package_body5281 = new BitSet(new long[]{0x9080010000000000L,0x8882002400000092L,0x0000000000000001L});
	public static final BitSet FOLLOW_package_body_declarative_part_in_package_body5291 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_K_END_in_package_body5293 = new BitSet(new long[]{0x0000000080000800L,0x0000000080000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_K_PACKAGE_in_package_body5304 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_K_BODY_in_package_body5306 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_simple_name_in_package_body5311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_package_body5315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subprogram_declaration_in_package_body_declarative_item5331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subprogram_body_in_package_body_declarative_item5337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_declaration_in_package_body_declarative_item5344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subtype_declaration_in_package_body_declarative_item5351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_declaration_in_package_body_declarative_item5358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_declaration_in_package_body_declarative_item5365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_file_declaration_in_package_body_declarative_item5372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alias_declaration_in_package_body_declarative_item5379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_use_clause_in_package_body_declarative_item5386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_declaration_in_package_body_declarative_item5402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_template_declaration_in_package_body_declarative_item5408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_package_body_declarative_item_in_package_body_declarative_part5420 = new BitSet(new long[]{0x8080010000000002L,0x8882002400000092L,0x0000000000000001L});
	public static final BitSet FOLLOW_K_PACKAGE_in_package_declaration5433 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_identifier_in_package_declaration5435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_K_IS_in_package_declaration5437 = new BitSet(new long[]{0x91A0410000000000L,0x8886002400000092L,0x0000000000000001L});
	public static final BitSet FOLLOW_package_declarative_part_in_package_declaration5439 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_K_END_in_package_declaration5450 = new BitSet(new long[]{0x0000000080000800L,0x0000000080000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_K_PACKAGE_in_package_declaration5453 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_simple_name_in_package_declaration5458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_package_declaration5462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subprogram_declaration_in_package_declarative_item5473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_declaration_in_package_declarative_item5479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subtype_declaration_in_package_declarative_item5486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_declaration_in_package_declarative_item5493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_signal_declaration_in_package_declarative_item5500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_declaration_in_package_declarative_item5507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_file_declaration_in_package_declarative_item5514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alias_declaration_in_package_declarative_item5521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_component_declaration_in_package_declarative_item5528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attribute_specification_in_package_declarative_item5540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attribute_declaration_in_package_declarative_item5546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_disconnection_specification_in_package_declarative_item5552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_use_clause_in_package_declarative_item5559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_declaration_in_package_declarative_item5575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_template_declaration_in_package_declarative_item5581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_package_declarative_item_in_package_declarative_part5593 = new BitSet(new long[]{0x81A0410000000002L,0x8886002400000092L,0x0000000000000001L});
	public static final BitSet FOLLOW_identifier_in_parameter_specification5606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_K_IN_in_parameter_specification5608 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_discrete_range_in_parameter_specification5610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_abstract_literal_in_physical_literal5622 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_name_in_physical_literal5626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_range_constraint_in_physical_type_definition5637 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_K_UNITS_in_physical_type_definition5639 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_base_unit_declaration_in_physical_type_definition5644 = new BitSet(new long[]{0x1000000080000800L});
	public static final BitSet FOLLOW_secondary_unit_declaration_in_physical_type_definition5647 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_K_END_in_physical_type_definition5659 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_K_UNITS_in_physical_type_definition5661 = new BitSet(new long[]{0x0000000080000802L});
	public static final BitSet FOLLOW_simple_name_in_physical_type_definition5664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_PORT_in_port_clause5677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_LPAREN_in_port_clause5679 = new BitSet(new long[]{0x8080000080000800L,0x0004000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_port_list_in_port_clause5681 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_port_clause5683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_port_clause5685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interface_list_in_port_list5696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_PORT_in_port_map_aspect5707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_K_MAP_in_port_map_aspect5709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_LPAREN_in_port_map_aspect5711 = new BitSet(new long[]{0x0000002080421900L,0x0000000009900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_association_list_in_port_map_aspect5713 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_port_map_aspect5715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_name_in_primary5752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000080L});
	public static final BitSet FOLLOW_signature_in_primary5755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_tic_attribute_designator_in_primary5759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualified_expression_in_primary5771 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_primary5784 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_expression_in_primary5786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_primary5788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_primary5792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allocator_in_primary5796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_in_primary5800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entity_declaration_in_primary_unit5811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_configuration_declaration_in_primary_unit5817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_package_declaration_in_primary_unit5824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_name_in_procedure_call5835 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_LPAREN_in_procedure_call5839 = new BitSet(new long[]{0x0000002080421900L,0x0000000009900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_actual_parameter_part_in_procedure_call5841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_procedure_call5843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_colon_in_procedure_call_statement5866 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_procedure_call_in_procedure_call_statement5870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_procedure_call_statement5872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subprogram_declaration_in_process_declarative_item5888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subprogram_body_in_process_declarative_item5895 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_declaration_in_process_declarative_item5902 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subtype_declaration_in_process_declarative_item5909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_declaration_in_process_declarative_item5916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_declaration_in_process_declarative_item5923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_file_declaration_in_process_declarative_item5930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alias_declaration_in_process_declarative_item5937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attribute_specification_in_process_declarative_item5949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attribute_declaration_in_process_declarative_item5955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_use_clause_in_process_declarative_item5961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_declaration_in_process_declarative_item5977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_template_declaration_in_process_declarative_item5983 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_process_declarative_item_in_process_declarative_part5995 = new BitSet(new long[]{0x8080410000000002L,0x8882002400000092L,0x0000000000000001L});
	public static final BitSet FOLLOW_label_colon_in_process_statement6009 = new BitSet(new long[]{0x0000000000000000L,0x0000000A00000000L});
	public static final BitSet FOLLOW_K_POSTPONED_in_process_statement6015 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_K_PROCESS_in_process_statement6019 = new BitSet(new long[]{0x8080C10000000000L,0x8882002400000892L,0x0000000000000801L});
	public static final BitSet FOLLOW_LPAREN_in_process_statement6022 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_sensitivity_list_in_process_statement6024 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_process_statement6026 = new BitSet(new long[]{0x8080C10000000000L,0x8882002400000892L,0x0000000000000001L});
	public static final BitSet FOLLOW_K_IS_in_process_statement6039 = new BitSet(new long[]{0x8080C10000000000L,0x8882002400000092L,0x0000000000000001L});
	public static final BitSet FOLLOW_process_declarative_part_in_process_statement6043 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_K_BEGIN_in_process_statement6045 = new BitSet(new long[]{0x5010200080000800L,0x0000180001210041L,0x000000004000080AL});
	public static final BitSet FOLLOW_process_statement_part_in_process_statement6055 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_K_END_in_process_statement6057 = new BitSet(new long[]{0x0000000000000000L,0x0000000A00000000L});
	public static final BitSet FOLLOW_K_POSTPONED_in_process_statement6060 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_K_PROCESS_in_process_statement6064 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_label_in_process_statement6067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_process_statement6071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sequential_statement_in_process_statement_part6083 = new BitSet(new long[]{0x4010200080000802L,0x0000180001210041L,0x000000004000080AL});
	public static final BitSet FOLLOW_K_PROTECTED_in_protected_type_body6096 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_K_BODY_in_protected_type_body6098 = new BitSet(new long[]{0x9080410000000000L,0x8882002400000092L,0x0000000000000001L});
	public static final BitSet FOLLOW_protected_type_body_declarative_part_in_protected_type_body6100 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_K_END_in_protected_type_body6111 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_K_PROTECTED_in_protected_type_body6113 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_K_BODY_in_protected_type_body6115 = new BitSet(new long[]{0x0000000080000802L});
	public static final BitSet FOLLOW_simple_name_in_protected_type_body6118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subprogram_declaration_in_protected_type_body_declarative_item6136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subprogram_body_in_protected_type_body_declarative_item6143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_declaration_in_protected_type_body_declarative_item6150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subtype_declaration_in_protected_type_body_declarative_item6157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_declaration_in_protected_type_body_declarative_item6164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_declaration_in_protected_type_body_declarative_item6171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_file_declaration_in_protected_type_body_declarative_item6178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alias_declaration_in_protected_type_body_declarative_item6185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attribute_specification_in_protected_type_body_declarative_item6197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attribute_declaration_in_protected_type_body_declarative_item6203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_use_clause_in_protected_type_body_declarative_item6209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_declaration_in_protected_type_body_declarative_item6225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_template_declaration_in_protected_type_body_declarative_item6231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_protected_type_body_declarative_item_in_protected_type_body_declarative_part6243 = new BitSet(new long[]{0x8080410000000002L,0x8882002400000092L,0x0000000000000001L});
	public static final BitSet FOLLOW_K_PROTECTED_in_protected_type_declaration6256 = new BitSet(new long[]{0x1000400000000000L,0x8000002400000082L});
	public static final BitSet FOLLOW_protected_type_declarative_part_in_protected_type_declaration6258 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_K_END_in_protected_type_declaration6269 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_K_PROTECTED_in_protected_type_declaration6271 = new BitSet(new long[]{0x0000000080000802L});
	public static final BitSet FOLLOW_simple_name_in_protected_type_declaration6274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subprogram_specification_in_protected_type_declarative_item6287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attribute_specification_in_protected_type_declarative_item6293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_use_clause_in_protected_type_declarative_item6300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_protected_type_declarative_item_in_protected_type_declarative_part6312 = new BitSet(new long[]{0x0000400000000002L,0x8000002400000082L});
	public static final BitSet FOLLOW_protected_type_declaration_in_protected_type_definition6325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_protected_type_body_in_protected_type_definition6331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_name_in_qualified_expression6341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_TIC_in_qualified_expression6343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_aggregate_in_qualified_expression6353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_qualified_expression6360 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_expression_in_qualified_expression6362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_qualified_expression6364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_expression_in_range6390 = new BitSet(new long[]{0x0200000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_direction_in_range6392 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_simple_expression_in_range6394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_name_in_range6400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_RANGE_in_range_constraint6411 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_range_in_range_constraint6413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_RECORD_in_record_type_definition6424 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_element_declaration_in_record_type_definition6427 = new BitSet(new long[]{0x1000000080000800L});
	public static final BitSet FOLLOW_K_END_in_record_type_definition6439 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_K_RECORD_in_record_type_definition6441 = new BitSet(new long[]{0x0000000080000802L});
	public static final BitSet FOLLOW_simple_name_in_record_type_definition6444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_shift_expression_in_relation6457 = new BitSet(new long[]{0x0000000C04000002L,0x0000000000000000L,0x0000000008003000L});
	public static final BitSet FOLLOW_relational_operator_in_relation6460 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_shift_expression_in_relation6462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_colon_in_report_statement6529 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_K_REPORT_in_report_statement6534 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_expression_in_report_statement6536 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_K_SEVERITY_in_report_statement6539 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_expression_in_report_statement6541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_report_statement6545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_colon_in_return_statement6557 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_K_RETURN_in_return_statement6561 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000042048800L});
	public static final BitSet FOLLOW_expression_in_return_statement6564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_return_statement6568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumeration_type_definition_in_scalar_type_definition6579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_range_constraint_in_scalar_type_definition6591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_physical_type_definition_in_scalar_type_definition6597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_architecture_body_in_secondary_unit6608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_package_body_in_secondary_unit6614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_secondary_unit_declaration6625 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_EQ_in_secondary_unit_declaration6627 = new BitSet(new long[]{0x0000000080400900L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_physical_literal_in_secondary_unit_declaration6629 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_secondary_unit_declaration6631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_WITH_in_selected_signal_assignment6642 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_expression_in_selected_signal_assignment6644 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_K_SELECT_in_selected_signal_assignment6646 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000800L});
	public static final BitSet FOLLOW_target_in_selected_signal_assignment6648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_LSTEQ_in_selected_signal_assignment6650 = new BitSet(new long[]{0x0000002080421900L,0x1400020001900220L,0x0000000040048800L});
	public static final BitSet FOLLOW_voptions_in_selected_signal_assignment6652 = new BitSet(new long[]{0x0000002080421900L,0x1000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_selected_waveforms_in_selected_signal_assignment6654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_selected_signal_assignment6656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_waveform_in_selected_waveforms6667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_K_WHEN_in_selected_waveforms6669 = new BitSet(new long[]{0x0000002080421900L,0x0000000021900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_choices_in_selected_waveforms6671 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_COMMA_in_selected_waveforms6674 = new BitSet(new long[]{0x0000002080421900L,0x1000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_waveform_in_selected_waveforms6676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_K_WHEN_in_selected_waveforms6678 = new BitSet(new long[]{0x0000002080421900L,0x0000000021900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_choices_in_selected_waveforms6680 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_K_ON_in_sensitivity_clause6693 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_sensitivity_list_in_sensitivity_clause6695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_name_in_sensitivity_list6706 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_COMMA_in_sensitivity_list6709 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_name_in_sensitivity_list6711 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_sequential_statement_in_sequence_of_statements6725 = new BitSet(new long[]{0x4010200080000802L,0x0000180001210041L,0x000000004000080AL});
	public static final BitSet FOLLOW_wait_statement_in_sequential_statement6748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assertion_statement_in_sequential_statement6765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_report_statement_in_sequential_statement6782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_statement_in_sequential_statement6799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_case_statement_in_sequential_statement6816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_next_statement_in_sequential_statement6833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exit_statement_in_sequential_statement6850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_return_statement_in_sequential_statement6867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_null_statement_in_sequential_statement6884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_loop_statement_in_sequential_statement6896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedure_call_statement_in_sequential_statement6909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_assignment_statement_in_sequential_statement6921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_signal_assignment_statement_in_sequential_statement6928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_expression_in_shift_expression6940 = new BitSet(new long[]{0x0000000000000002L,0x0078600000000000L});
	public static final BitSet FOLLOW_shift_operator_in_shift_expression6943 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_simple_expression_in_shift_expression6945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_colon_in_signal_assignment_statement7025 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000800L});
	public static final BitSet FOLLOW_target_in_signal_assignment_statement7029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_LSTEQ_in_signal_assignment_statement7034 = new BitSet(new long[]{0x0000002080421900L,0x1400020001900200L,0x0000000040048800L});
	public static final BitSet FOLLOW_delay_mechanism_in_signal_assignment_statement7037 = new BitSet(new long[]{0x0000002080421900L,0x1000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_waveform_in_signal_assignment_statement7041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_signal_assignment_statement7043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_SIGNAL_in_signal_declaration7054 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_identifier_list_in_signal_declaration7056 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_COLON_in_signal_declaration7058 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_subtype_indication_in_signal_declaration7060 = new BitSet(new long[]{0x0008000000080000L,0x0000010000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_signal_kind_in_signal_declaration7063 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_COLONEQ_in_signal_declaration7077 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_expression_in_signal_declaration7079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_signal_declaration7083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_name_in_signal_list7112 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_COMMA_in_signal_list7115 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_name_in_signal_list7117 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_K_OTHERS_in_signal_list7125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_signal_list7131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_signature7142 = new BitSet(new long[]{0x0000000080000800L,0x0000100000000000L,0x0000000040400000L});
	public static final BitSet FOLLOW_name_in_signature7145 = new BitSet(new long[]{0x0000000000100000L,0x0000100000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_COMMA_in_signature7148 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_name_in_signature7150 = new BitSet(new long[]{0x0000000000100000L,0x0000100000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_K_RETURN_in_signature7157 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_name_in_signature7159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_RBRACK_in_signature7163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sign_in_simple_expression7175 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040000800L});
	public static final BitSet FOLLOW_term_in_simple_expression7179 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000048000L});
	public static final BitSet FOLLOW_adding_operator_in_simple_expression7190 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040000800L});
	public static final BitSet FOLLOW_term_in_simple_expression7192 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000048000L});
	public static final BitSet FOLLOW_identifier_in_simple_name7205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_string_literal7214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subprogram_specification_in_subprogram_body7225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_K_IS_in_subprogram_body7227 = new BitSet(new long[]{0x8080C10000000000L,0x8882002400000092L,0x0000000000000001L});
	public static final BitSet FOLLOW_subprogram_declarative_part_in_subprogram_body7229 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_K_BEGIN_in_subprogram_body7235 = new BitSet(new long[]{0x5010200080000800L,0x0000180001210041L,0x000000004000080AL});
	public static final BitSet FOLLOW_subprogram_statement_part_in_subprogram_body7237 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_K_END_in_subprogram_body7239 = new BitSet(new long[]{0x0000000080000800L,0x0000000400000002L,0x0000000042000000L});
	public static final BitSet FOLLOW_subprogram_kind_in_subprogram_body7247 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000042000000L});
	public static final BitSet FOLLOW_designator_in_subprogram_body7252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_subprogram_body7256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subprogram_specification_in_subprogram_declaration7267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_subprogram_declaration7269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subprogram_declaration_in_subprogram_declarative_item7285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subprogram_body_in_subprogram_declarative_item7292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_declaration_in_subprogram_declarative_item7299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subtype_declaration_in_subprogram_declarative_item7306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_declaration_in_subprogram_declarative_item7313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_declaration_in_subprogram_declarative_item7320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_file_declaration_in_subprogram_declarative_item7327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alias_declaration_in_subprogram_declarative_item7334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attribute_specification_in_subprogram_declarative_item7346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attribute_declaration_in_subprogram_declarative_item7352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_use_clause_in_subprogram_declarative_item7358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_declaration_in_subprogram_declarative_item7374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_template_declaration_in_subprogram_declarative_item7380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subprogram_declarative_item_in_subprogram_declarative_part7392 = new BitSet(new long[]{0x8080410000000002L,0x8882002400000092L,0x0000000000000001L});
	public static final BitSet FOLLOW_K_PROCEDURE_in_subprogram_specification7423 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_designator_in_subprogram_specification7425 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_LPAREN_in_subprogram_specification7428 = new BitSet(new long[]{0x8080000080000800L,0x0004000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_formal_parameter_list_in_subprogram_specification7430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_subprogram_specification7432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FUNCTION_in_subprogram_specification7449 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_designator_in_subprogram_specification7451 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_LPAREN_in_subprogram_specification7457 = new BitSet(new long[]{0x8080000080000800L,0x0004000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_formal_parameter_list_in_subprogram_specification7459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_subprogram_specification7461 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_K_RETURN_in_subprogram_specification7466 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_name_in_subprogram_specification7468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sequential_statement_in_subprogram_statement_part7480 = new BitSet(new long[]{0x4010200080000802L,0x0000180001210041L,0x000000004000080AL});
	public static final BitSet FOLLOW_K_SUBTYPE_in_subtype_declaration7493 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_identifier_in_subtype_declaration7495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_K_IS_in_subtype_declaration7497 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_subtype_indication_in_subtype_declaration7499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_subtype_declaration7501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_name_in_subtype_indication7512 = new BitSet(new long[]{0x0000000080000802L,0x0000004000000000L,0x0000000040000800L});
	public static final BitSet FOLLOW_name_in_subtype_indication7515 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_constraint_in_subtype_indication7520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_name_in_suffix7533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_character_literal_in_suffix7539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operator_symbol_in_suffix7545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_suffix7552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_name_in_target7563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_in_target7569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_factor_in_term7580 = new BitSet(new long[]{0x0000000000000002L,0x0000040000040000L,0x0000000014000000L});
	public static final BitSet FOLLOW_multiplying_operator_in_term7591 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040000800L});
	public static final BitSet FOLLOW_factor_in_term7593 = new BitSet(new long[]{0x0000000000000002L,0x0000040000040000L,0x0000000014000000L});
	public static final BitSet FOLLOW_K_FOR_in_timeout_clause7606 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_expression_in_timeout_clause7608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_full_type_declaration_in_type_declaration7624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incomplete_type_declaration_in_type_declaration7630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalar_type_definition_in_type_definition7641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_composite_type_definition_in_type_definition7647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_access_type_definition_in_type_definition7654 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_file_type_definition_in_type_definition7661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_protected_type_definition_in_type_definition7668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ARRAY_in_unconstrained_array_definition7679 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_LPAREN_in_unconstrained_array_definition7681 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_index_subtype_definition_in_unconstrained_array_definition7683 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_unconstrained_array_definition7689 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_index_subtype_definition_in_unconstrained_array_definition7691 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_unconstrained_array_definition7695 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_K_OF_in_unconstrained_array_definition7697 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_subtype_indication_in_unconstrained_array_definition7699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_USE_in_use_clause7710 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_name_in_use_clause7712 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_COMMA_in_use_clause7715 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_name_in_use_clause7717 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_use_clause7721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_colon_in_variable_assignment_statement7741 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000800L});
	public static final BitSet FOLLOW_target_in_variable_assignment_statement7745 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_COLONEQ_in_variable_assignment_statement7747 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_expression_in_variable_assignment_statement7749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_variable_assignment_statement7751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_SHARED_in_variable_declaration7763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_K_VARIABLE_in_variable_declaration7767 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_identifier_list_in_variable_declaration7769 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_COLON_in_variable_declaration7771 = new BitSet(new long[]{0x0000000080000800L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_subtype_indication_in_variable_declaration7773 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_COLONEQ_in_variable_declaration7785 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_expression_in_variable_declaration7787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_variable_declaration7791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_colon_in_wait_statement7803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_WAIT_in_wait_statement7807 = new BitSet(new long[]{0x0000000000000000L,0x4000000004000001L,0x0000000002000000L});
	public static final BitSet FOLLOW_sensitivity_clause_in_wait_statement7810 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000001L,0x0000000002000000L});
	public static final BitSet FOLLOW_condition_clause_in_wait_statement7815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L,0x0000000002000000L});
	public static final BitSet FOLLOW_timeout_clause_in_wait_statement7829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_SEMI_in_wait_statement7833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_waveform_element_in_waveform7844 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_COMMA_in_waveform7847 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_waveform_element_in_waveform7849 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_K_UNAFFECTED_in_waveform7857 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_waveform_element7868 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_K_AFTER_in_waveform_element7871 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_expression_in_waveform_element7873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_GUARDED_in_voptions7889 = new BitSet(new long[]{0x0000000000000002L,0x0400020000000200L});
	public static final BitSet FOLLOW_delay_mechanism_in_voptions7894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_name_in_synpred1_Vhdl1052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_LPAREN_in_synpred1_Vhdl1054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subtype_indication_in_synpred2_Vhdl1205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unconstrained_array_definition_in_synpred3_Vhdl1336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formal_part_in_synpred4_Vhdl1420 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_EQGRT_in_synpred4_Vhdl1422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subprogram_declaration_in_synpred5_Vhdl1632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attribute_specification_in_synpred6_Vhdl1697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_GROUP_in_synpred7_Vhdl1732 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_identifier_in_synpred7_Vhdl1734 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_COLON_in_synpred7_Vhdl1736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_in_synpred8_Vhdl1815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_LPAREN_in_synpred8_Vhdl1817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_expression_in_synpred9_Vhdl2001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_name_in_synpred10_Vhdl2012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_colon_in_synpred11_Vhdl2241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_colon_in_synpred12_Vhdl2279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_statement_in_synpred13_Vhdl2331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_process_statement_in_synpred14_Vhdl2342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_concurrent_procedure_call_statement_in_synpred15_Vhdl2353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_concurrent_assertion_statement_in_synpred16_Vhdl2367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_concurrent_signal_assignment_statement_in_synpred17_Vhdl2378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_component_instantiation_statement_in_synpred18_Vhdl2391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_WHEN_in_synpred19_Vhdl2461 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_condition_in_synpred19_Vhdl2463 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_K_ELSE_in_synpred19_Vhdl2465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_WHEN_in_synpred20_Vhdl2507 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_condition_in_synpred20_Vhdl2509 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_K_ELSE_in_synpred20_Vhdl2511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_configuration_in_synpred21_Vhdl2619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_object_declaration_in_synpred22_Vhdl2773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_GROUP_in_synpred23_Vhdl2812 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_identifier_in_synpred23_Vhdl2814 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_COLON_in_synpred23_Vhdl2816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_range_in_synpred24_Vhdl2972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_choices_in_synpred25_Vhdl2995 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_EQGRT_in_synpred25_Vhdl2997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subprogram_declaration_in_synpred26_Vhdl3273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attribute_specification_in_synpred27_Vhdl3340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_GROUP_in_synpred28_Vhdl3371 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_identifier_in_synpred28_Vhdl3373 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_COLON_in_synpred28_Vhdl3375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_concurrent_assertion_statement_in_synpred29_Vhdl3492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_concurrent_procedure_call_statement_in_synpred30_Vhdl3503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_discrete_range_in_synpred31_Vhdl4270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interface_constant_declaration_in_synpred32_Vhdl4422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interface_signal_declaration_in_synpred33_Vhdl4433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ARCHITECTURE_in_synpred34_Vhdl4656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_PACKAGE_in_synpred34_Vhdl4660 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_K_BODY_in_synpred34_Vhdl4662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_literal_in_synpred35_Vhdl4684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_synpred36_Vhdl5046 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_expression_in_synpred36_Vhdl5048 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_synpred36_Vhdl5051 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_expression_in_synpred36_Vhdl5053 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred36_Vhdl5057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_synpred37_Vhdl5097 = new BitSet(new long[]{0x0000002080421900L,0x0000000009900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_actual_parameter_part_in_synpred37_Vhdl5099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred37_Vhdl5101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_abstract_literal_in_synpred38_Vhdl5204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subprogram_declaration_in_synpred39_Vhdl5327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_GROUP_in_synpred40_Vhdl5394 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_identifier_in_synpred40_Vhdl5396 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_COLON_in_synpred40_Vhdl5398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attribute_specification_in_synpred41_Vhdl5536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_GROUP_in_synpred42_Vhdl5567 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_identifier_in_synpred42_Vhdl5569 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_COLON_in_synpred42_Vhdl5571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_name_in_synpred43_Vhdl5733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000080L});
	public static final BitSet FOLLOW_signature_in_synpred43_Vhdl5736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_tic_attribute_designator_in_synpred43_Vhdl5740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_name_in_synpred44_Vhdl5765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_TIC_in_synpred44_Vhdl5767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_synpred45_Vhdl5776 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_expression_in_synpred45_Vhdl5778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred45_Vhdl5780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subprogram_declaration_in_synpred46_Vhdl5884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attribute_specification_in_synpred47_Vhdl5945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_GROUP_in_synpred48_Vhdl5969 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_identifier_in_synpred48_Vhdl5971 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_COLON_in_synpred48_Vhdl5973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subprogram_declaration_in_synpred49_Vhdl6132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attribute_specification_in_synpred50_Vhdl6193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_GROUP_in_synpred51_Vhdl6217 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_identifier_in_synpred51_Vhdl6219 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_COLON_in_synpred51_Vhdl6221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_in_synpred52_Vhdl6349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_expression_in_synpred53_Vhdl6380 = new BitSet(new long[]{0x0200000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_direction_in_synpred53_Vhdl6382 = new BitSet(new long[]{0x0000002080421900L,0x0000000001900000L,0x0000000040048800L});
	public static final BitSet FOLLOW_simple_expression_in_synpred53_Vhdl6384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_range_constraint_in_synpred54_Vhdl6587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_colon_in_synpred55_Vhdl6740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_WAIT_in_synpred55_Vhdl6744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_colon_in_synpred56_Vhdl6757 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_K_ASSERT_in_synpred56_Vhdl6761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_colon_in_synpred57_Vhdl6774 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_K_REPORT_in_synpred57_Vhdl6778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_colon_in_synpred58_Vhdl6791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_IF_in_synpred58_Vhdl6795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_colon_in_synpred59_Vhdl6808 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_K_CASE_in_synpred59_Vhdl6812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_colon_in_synpred60_Vhdl6825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_K_NEXT_in_synpred60_Vhdl6829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_colon_in_synpred61_Vhdl6842 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_K_EXIT_in_synpred61_Vhdl6846 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_colon_in_synpred62_Vhdl6859 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_K_RETURN_in_synpred62_Vhdl6863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_colon_in_synpred63_Vhdl6876 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_NULL_in_synpred63_Vhdl6880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_loop_statement_in_synpred64_Vhdl6891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedure_call_statement_in_synpred65_Vhdl6904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_assignment_statement_in_synpred66_Vhdl6917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subprogram_declaration_in_synpred67_Vhdl7281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attribute_specification_in_synpred68_Vhdl7342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_GROUP_in_synpred69_Vhdl7366 = new BitSet(new long[]{0x0000000080000800L});
	public static final BitSet FOLLOW_identifier_in_synpred69_Vhdl7368 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_COLON_in_synpred69_Vhdl7370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_full_type_declaration_in_synpred70_Vhdl7620 = new BitSet(new long[]{0x0000000000000002L});
}
