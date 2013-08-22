// $ANTLR 3.5 Vhdl.g 2013-08-22 10:11:56



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class VhdlLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public VhdlLexer() {} 
	public VhdlLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public VhdlLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Vhdl.g"; }

	// $ANTLR start "K_ABS"
	public final void mK_ABS() throws RecognitionException {
		try {
			int _type = K_ABS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:10:7: ( 'abs' )
			// Vhdl.g:10:9: 'abs'
			{
			match("abs"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ABS"

	// $ANTLR start "K_ACCESS"
	public final void mK_ACCESS() throws RecognitionException {
		try {
			int _type = K_ACCESS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:11:10: ( 'access' )
			// Vhdl.g:11:12: 'access'
			{
			match("access"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ACCESS"

	// $ANTLR start "K_AFTER"
	public final void mK_AFTER() throws RecognitionException {
		try {
			int _type = K_AFTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:12:9: ( 'after' )
			// Vhdl.g:12:11: 'after'
			{
			match("after"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_AFTER"

	// $ANTLR start "K_ALIAS"
	public final void mK_ALIAS() throws RecognitionException {
		try {
			int _type = K_ALIAS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:13:9: ( 'alias' )
			// Vhdl.g:13:11: 'alias'
			{
			match("alias"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ALIAS"

	// $ANTLR start "K_ALL"
	public final void mK_ALL() throws RecognitionException {
		try {
			int _type = K_ALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:14:7: ( 'all' )
			// Vhdl.g:14:9: 'all'
			{
			match("all"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ALL"

	// $ANTLR start "K_AND"
	public final void mK_AND() throws RecognitionException {
		try {
			int _type = K_AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:15:7: ( 'and' )
			// Vhdl.g:15:9: 'and'
			{
			match("and"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_AND"

	// $ANTLR start "K_ARCHITECTURE"
	public final void mK_ARCHITECTURE() throws RecognitionException {
		try {
			int _type = K_ARCHITECTURE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:16:16: ( 'architecture' )
			// Vhdl.g:16:18: 'architecture'
			{
			match("architecture"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ARCHITECTURE"

	// $ANTLR start "K_ARRAY"
	public final void mK_ARRAY() throws RecognitionException {
		try {
			int _type = K_ARRAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:17:9: ( 'array' )
			// Vhdl.g:17:11: 'array'
			{
			match("array"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ARRAY"

	// $ANTLR start "K_ASSERT"
	public final void mK_ASSERT() throws RecognitionException {
		try {
			int _type = K_ASSERT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:18:10: ( 'assert' )
			// Vhdl.g:18:12: 'assert'
			{
			match("assert"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ASSERT"

	// $ANTLR start "K_ATTRIBUTE"
	public final void mK_ATTRIBUTE() throws RecognitionException {
		try {
			int _type = K_ATTRIBUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:19:13: ( 'attribute' )
			// Vhdl.g:19:15: 'attribute'
			{
			match("attribute"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ATTRIBUTE"

	// $ANTLR start "K_BEGIN"
	public final void mK_BEGIN() throws RecognitionException {
		try {
			int _type = K_BEGIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:20:9: ( 'begin' )
			// Vhdl.g:20:11: 'begin'
			{
			match("begin"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_BEGIN"

	// $ANTLR start "K_BLOCK"
	public final void mK_BLOCK() throws RecognitionException {
		try {
			int _type = K_BLOCK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:21:9: ( 'block' )
			// Vhdl.g:21:11: 'block'
			{
			match("block"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_BLOCK"

	// $ANTLR start "K_BODY"
	public final void mK_BODY() throws RecognitionException {
		try {
			int _type = K_BODY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:22:8: ( 'body' )
			// Vhdl.g:22:10: 'body'
			{
			match("body"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_BODY"

	// $ANTLR start "K_BUFFER"
	public final void mK_BUFFER() throws RecognitionException {
		try {
			int _type = K_BUFFER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:23:10: ( 'buffer' )
			// Vhdl.g:23:12: 'buffer'
			{
			match("buffer"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_BUFFER"

	// $ANTLR start "K_BUS"
	public final void mK_BUS() throws RecognitionException {
		try {
			int _type = K_BUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:24:7: ( 'bus' )
			// Vhdl.g:24:9: 'bus'
			{
			match("bus"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_BUS"

	// $ANTLR start "K_CASE"
	public final void mK_CASE() throws RecognitionException {
		try {
			int _type = K_CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:25:8: ( 'case' )
			// Vhdl.g:25:10: 'case'
			{
			match("case"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_CASE"

	// $ANTLR start "K_COMPONENT"
	public final void mK_COMPONENT() throws RecognitionException {
		try {
			int _type = K_COMPONENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:26:13: ( 'component' )
			// Vhdl.g:26:15: 'component'
			{
			match("component"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_COMPONENT"

	// $ANTLR start "K_CONFIGURATION"
	public final void mK_CONFIGURATION() throws RecognitionException {
		try {
			int _type = K_CONFIGURATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:27:17: ( 'configuration' )
			// Vhdl.g:27:19: 'configuration'
			{
			match("configuration"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_CONFIGURATION"

	// $ANTLR start "K_CONSTANT"
	public final void mK_CONSTANT() throws RecognitionException {
		try {
			int _type = K_CONSTANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:28:12: ( 'constant' )
			// Vhdl.g:28:14: 'constant'
			{
			match("constant"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_CONSTANT"

	// $ANTLR start "K_DISCONNECT"
	public final void mK_DISCONNECT() throws RecognitionException {
		try {
			int _type = K_DISCONNECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:29:14: ( 'disconnect' )
			// Vhdl.g:29:16: 'disconnect'
			{
			match("disconnect"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_DISCONNECT"

	// $ANTLR start "K_DOWNTO"
	public final void mK_DOWNTO() throws RecognitionException {
		try {
			int _type = K_DOWNTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:30:10: ( 'downto' )
			// Vhdl.g:30:12: 'downto'
			{
			match("downto"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_DOWNTO"

	// $ANTLR start "K_ELSE"
	public final void mK_ELSE() throws RecognitionException {
		try {
			int _type = K_ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:31:8: ( 'else' )
			// Vhdl.g:31:10: 'else'
			{
			match("else"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ELSE"

	// $ANTLR start "K_ELSIF"
	public final void mK_ELSIF() throws RecognitionException {
		try {
			int _type = K_ELSIF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:32:9: ( 'elsif' )
			// Vhdl.g:32:11: 'elsif'
			{
			match("elsif"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ELSIF"

	// $ANTLR start "K_END"
	public final void mK_END() throws RecognitionException {
		try {
			int _type = K_END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:33:7: ( 'end' )
			// Vhdl.g:33:9: 'end'
			{
			match("end"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_END"

	// $ANTLR start "K_ENTITY"
	public final void mK_ENTITY() throws RecognitionException {
		try {
			int _type = K_ENTITY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:34:10: ( 'entity' )
			// Vhdl.g:34:12: 'entity'
			{
			match("entity"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ENTITY"

	// $ANTLR start "K_EXIT"
	public final void mK_EXIT() throws RecognitionException {
		try {
			int _type = K_EXIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:35:8: ( 'exit' )
			// Vhdl.g:35:10: 'exit'
			{
			match("exit"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_EXIT"

	// $ANTLR start "K_FILE"
	public final void mK_FILE() throws RecognitionException {
		try {
			int _type = K_FILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:36:8: ( 'file' )
			// Vhdl.g:36:10: 'file'
			{
			match("file"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_FILE"

	// $ANTLR start "K_FOR"
	public final void mK_FOR() throws RecognitionException {
		try {
			int _type = K_FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:37:7: ( 'for' )
			// Vhdl.g:37:9: 'for'
			{
			match("for"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_FOR"

	// $ANTLR start "K_FUNCTION"
	public final void mK_FUNCTION() throws RecognitionException {
		try {
			int _type = K_FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:38:12: ( 'function' )
			// Vhdl.g:38:14: 'function'
			{
			match("function"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_FUNCTION"

	// $ANTLR start "K_GENERATE"
	public final void mK_GENERATE() throws RecognitionException {
		try {
			int _type = K_GENERATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:39:12: ( 'generate' )
			// Vhdl.g:39:14: 'generate'
			{
			match("generate"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_GENERATE"

	// $ANTLR start "K_GENERIC"
	public final void mK_GENERIC() throws RecognitionException {
		try {
			int _type = K_GENERIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:40:11: ( 'generic' )
			// Vhdl.g:40:13: 'generic'
			{
			match("generic"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_GENERIC"

	// $ANTLR start "K_GROUP"
	public final void mK_GROUP() throws RecognitionException {
		try {
			int _type = K_GROUP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:41:9: ( 'group' )
			// Vhdl.g:41:11: 'group'
			{
			match("group"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_GROUP"

	// $ANTLR start "K_GUARDED"
	public final void mK_GUARDED() throws RecognitionException {
		try {
			int _type = K_GUARDED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:42:11: ( 'guarded' )
			// Vhdl.g:42:13: 'guarded'
			{
			match("guarded"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_GUARDED"

	// $ANTLR start "K_IF"
	public final void mK_IF() throws RecognitionException {
		try {
			int _type = K_IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:43:6: ( 'if' )
			// Vhdl.g:43:8: 'if'
			{
			match("if"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_IF"

	// $ANTLR start "K_IMPURE"
	public final void mK_IMPURE() throws RecognitionException {
		try {
			int _type = K_IMPURE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:44:10: ( 'impure' )
			// Vhdl.g:44:12: 'impure'
			{
			match("impure"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_IMPURE"

	// $ANTLR start "K_IN"
	public final void mK_IN() throws RecognitionException {
		try {
			int _type = K_IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:45:6: ( 'in' )
			// Vhdl.g:45:8: 'in'
			{
			match("in"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_IN"

	// $ANTLR start "K_INERTIAL"
	public final void mK_INERTIAL() throws RecognitionException {
		try {
			int _type = K_INERTIAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:46:12: ( 'inertial' )
			// Vhdl.g:46:14: 'inertial'
			{
			match("inertial"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_INERTIAL"

	// $ANTLR start "K_INOUT"
	public final void mK_INOUT() throws RecognitionException {
		try {
			int _type = K_INOUT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:47:9: ( 'inout' )
			// Vhdl.g:47:11: 'inout'
			{
			match("inout"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_INOUT"

	// $ANTLR start "K_IS"
	public final void mK_IS() throws RecognitionException {
		try {
			int _type = K_IS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:48:6: ( 'is' )
			// Vhdl.g:48:8: 'is'
			{
			match("is"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_IS"

	// $ANTLR start "K_LABEL"
	public final void mK_LABEL() throws RecognitionException {
		try {
			int _type = K_LABEL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:49:9: ( 'label' )
			// Vhdl.g:49:11: 'label'
			{
			match("label"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_LABEL"

	// $ANTLR start "K_LIBRARY"
	public final void mK_LIBRARY() throws RecognitionException {
		try {
			int _type = K_LIBRARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:50:11: ( 'library' )
			// Vhdl.g:50:13: 'library'
			{
			match("library"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_LIBRARY"

	// $ANTLR start "K_LINKAGE"
	public final void mK_LINKAGE() throws RecognitionException {
		try {
			int _type = K_LINKAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:51:11: ( 'linkage' )
			// Vhdl.g:51:13: 'linkage'
			{
			match("linkage"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_LINKAGE"

	// $ANTLR start "K_LITERAL"
	public final void mK_LITERAL() throws RecognitionException {
		try {
			int _type = K_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:52:11: ( 'literal' )
			// Vhdl.g:52:13: 'literal'
			{
			match("literal"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_LITERAL"

	// $ANTLR start "K_LOOP"
	public final void mK_LOOP() throws RecognitionException {
		try {
			int _type = K_LOOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:53:8: ( 'loop' )
			// Vhdl.g:53:10: 'loop'
			{
			match("loop"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_LOOP"

	// $ANTLR start "K_MAP"
	public final void mK_MAP() throws RecognitionException {
		try {
			int _type = K_MAP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:54:7: ( 'map' )
			// Vhdl.g:54:9: 'map'
			{
			match("map"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_MAP"

	// $ANTLR start "K_MOD"
	public final void mK_MOD() throws RecognitionException {
		try {
			int _type = K_MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:55:7: ( 'mod' )
			// Vhdl.g:55:9: 'mod'
			{
			match("mod"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_MOD"

	// $ANTLR start "K_NAND"
	public final void mK_NAND() throws RecognitionException {
		try {
			int _type = K_NAND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:56:8: ( 'nand' )
			// Vhdl.g:56:10: 'nand'
			{
			match("nand"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_NAND"

	// $ANTLR start "K_NEW"
	public final void mK_NEW() throws RecognitionException {
		try {
			int _type = K_NEW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:57:7: ( 'new' )
			// Vhdl.g:57:9: 'new'
			{
			match("new"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_NEW"

	// $ANTLR start "K_NEXT"
	public final void mK_NEXT() throws RecognitionException {
		try {
			int _type = K_NEXT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:58:8: ( 'next' )
			// Vhdl.g:58:10: 'next'
			{
			match("next"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_NEXT"

	// $ANTLR start "K_NOR"
	public final void mK_NOR() throws RecognitionException {
		try {
			int _type = K_NOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:59:7: ( 'nor' )
			// Vhdl.g:59:9: 'nor'
			{
			match("nor"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_NOR"

	// $ANTLR start "K_NOT"
	public final void mK_NOT() throws RecognitionException {
		try {
			int _type = K_NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:60:7: ( 'not' )
			// Vhdl.g:60:9: 'not'
			{
			match("not"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_NOT"

	// $ANTLR start "K_NULL"
	public final void mK_NULL() throws RecognitionException {
		try {
			int _type = K_NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:61:8: ( 'null' )
			// Vhdl.g:61:10: 'null'
			{
			match("null"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_NULL"

	// $ANTLR start "K_OF"
	public final void mK_OF() throws RecognitionException {
		try {
			int _type = K_OF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:62:6: ( 'of' )
			// Vhdl.g:62:8: 'of'
			{
			match("of"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_OF"

	// $ANTLR start "K_ON"
	public final void mK_ON() throws RecognitionException {
		try {
			int _type = K_ON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:63:6: ( 'on' )
			// Vhdl.g:63:8: 'on'
			{
			match("on"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ON"

	// $ANTLR start "K_OPEN"
	public final void mK_OPEN() throws RecognitionException {
		try {
			int _type = K_OPEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:64:8: ( 'open' )
			// Vhdl.g:64:10: 'open'
			{
			match("open"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_OPEN"

	// $ANTLR start "K_OR"
	public final void mK_OR() throws RecognitionException {
		try {
			int _type = K_OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:65:6: ( 'or' )
			// Vhdl.g:65:8: 'or'
			{
			match("or"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_OR"

	// $ANTLR start "K_OTHERS"
	public final void mK_OTHERS() throws RecognitionException {
		try {
			int _type = K_OTHERS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:66:10: ( 'others' )
			// Vhdl.g:66:12: 'others'
			{
			match("others"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_OTHERS"

	// $ANTLR start "K_OUT"
	public final void mK_OUT() throws RecognitionException {
		try {
			int _type = K_OUT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:67:7: ( 'out' )
			// Vhdl.g:67:9: 'out'
			{
			match("out"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_OUT"

	// $ANTLR start "K_PACKAGE"
	public final void mK_PACKAGE() throws RecognitionException {
		try {
			int _type = K_PACKAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:68:11: ( 'package' )
			// Vhdl.g:68:13: 'package'
			{
			match("package"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_PACKAGE"

	// $ANTLR start "K_PORT"
	public final void mK_PORT() throws RecognitionException {
		try {
			int _type = K_PORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:69:8: ( 'port' )
			// Vhdl.g:69:10: 'port'
			{
			match("port"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_PORT"

	// $ANTLR start "K_POSTPONED"
	public final void mK_POSTPONED() throws RecognitionException {
		try {
			int _type = K_POSTPONED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:70:13: ( 'postponed' )
			// Vhdl.g:70:15: 'postponed'
			{
			match("postponed"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_POSTPONED"

	// $ANTLR start "K_PROCEDURE"
	public final void mK_PROCEDURE() throws RecognitionException {
		try {
			int _type = K_PROCEDURE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:71:13: ( 'procedure' )
			// Vhdl.g:71:15: 'procedure'
			{
			match("procedure"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_PROCEDURE"

	// $ANTLR start "K_PROCESS"
	public final void mK_PROCESS() throws RecognitionException {
		try {
			int _type = K_PROCESS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:72:11: ( 'process' )
			// Vhdl.g:72:13: 'process'
			{
			match("process"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_PROCESS"

	// $ANTLR start "K_PROTECTED"
	public final void mK_PROTECTED() throws RecognitionException {
		try {
			int _type = K_PROTECTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:73:13: ( 'protected' )
			// Vhdl.g:73:15: 'protected'
			{
			match("protected"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_PROTECTED"

	// $ANTLR start "K_PURE"
	public final void mK_PURE() throws RecognitionException {
		try {
			int _type = K_PURE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:74:8: ( 'pure' )
			// Vhdl.g:74:10: 'pure'
			{
			match("pure"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_PURE"

	// $ANTLR start "K_RANGE"
	public final void mK_RANGE() throws RecognitionException {
		try {
			int _type = K_RANGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:75:9: ( 'range' )
			// Vhdl.g:75:11: 'range'
			{
			match("range"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_RANGE"

	// $ANTLR start "K_RECORD"
	public final void mK_RECORD() throws RecognitionException {
		try {
			int _type = K_RECORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:76:10: ( 'record' )
			// Vhdl.g:76:12: 'record'
			{
			match("record"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_RECORD"

	// $ANTLR start "K_REGISTER"
	public final void mK_REGISTER() throws RecognitionException {
		try {
			int _type = K_REGISTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:77:12: ( 'register' )
			// Vhdl.g:77:14: 'register'
			{
			match("register"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_REGISTER"

	// $ANTLR start "K_REJECT"
	public final void mK_REJECT() throws RecognitionException {
		try {
			int _type = K_REJECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:78:10: ( 'reject' )
			// Vhdl.g:78:12: 'reject'
			{
			match("reject"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_REJECT"

	// $ANTLR start "K_REM"
	public final void mK_REM() throws RecognitionException {
		try {
			int _type = K_REM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:79:7: ( 'rem' )
			// Vhdl.g:79:9: 'rem'
			{
			match("rem"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_REM"

	// $ANTLR start "K_REPORT"
	public final void mK_REPORT() throws RecognitionException {
		try {
			int _type = K_REPORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:80:10: ( 'report' )
			// Vhdl.g:80:12: 'report'
			{
			match("report"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_REPORT"

	// $ANTLR start "K_RETURN"
	public final void mK_RETURN() throws RecognitionException {
		try {
			int _type = K_RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:81:10: ( 'return' )
			// Vhdl.g:81:12: 'return'
			{
			match("return"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_RETURN"

	// $ANTLR start "K_ROL"
	public final void mK_ROL() throws RecognitionException {
		try {
			int _type = K_ROL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:82:7: ( 'rol' )
			// Vhdl.g:82:9: 'rol'
			{
			match("rol"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ROL"

	// $ANTLR start "K_ROR"
	public final void mK_ROR() throws RecognitionException {
		try {
			int _type = K_ROR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:83:7: ( 'ror' )
			// Vhdl.g:83:9: 'ror'
			{
			match("ror"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ROR"

	// $ANTLR start "K_SELECT"
	public final void mK_SELECT() throws RecognitionException {
		try {
			int _type = K_SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:84:10: ( 'select' )
			// Vhdl.g:84:12: 'select'
			{
			match("select"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_SELECT"

	// $ANTLR start "K_SEVERITY"
	public final void mK_SEVERITY() throws RecognitionException {
		try {
			int _type = K_SEVERITY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:85:12: ( 'severity' )
			// Vhdl.g:85:14: 'severity'
			{
			match("severity"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_SEVERITY"

	// $ANTLR start "K_SHARED"
	public final void mK_SHARED() throws RecognitionException {
		try {
			int _type = K_SHARED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:86:10: ( 'shared' )
			// Vhdl.g:86:12: 'shared'
			{
			match("shared"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_SHARED"

	// $ANTLR start "K_SIGNAL"
	public final void mK_SIGNAL() throws RecognitionException {
		try {
			int _type = K_SIGNAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:87:10: ( 'signal' )
			// Vhdl.g:87:12: 'signal'
			{
			match("signal"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_SIGNAL"

	// $ANTLR start "K_SLA"
	public final void mK_SLA() throws RecognitionException {
		try {
			int _type = K_SLA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:88:7: ( 'sla' )
			// Vhdl.g:88:9: 'sla'
			{
			match("sla"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_SLA"

	// $ANTLR start "K_SLL"
	public final void mK_SLL() throws RecognitionException {
		try {
			int _type = K_SLL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:89:7: ( 'sll' )
			// Vhdl.g:89:9: 'sll'
			{
			match("sll"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_SLL"

	// $ANTLR start "K_SRA"
	public final void mK_SRA() throws RecognitionException {
		try {
			int _type = K_SRA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:90:7: ( 'sra' )
			// Vhdl.g:90:9: 'sra'
			{
			match("sra"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_SRA"

	// $ANTLR start "K_SRL"
	public final void mK_SRL() throws RecognitionException {
		try {
			int _type = K_SRL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:91:7: ( 'srl' )
			// Vhdl.g:91:9: 'srl'
			{
			match("srl"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_SRL"

	// $ANTLR start "K_SUBTYPE"
	public final void mK_SUBTYPE() throws RecognitionException {
		try {
			int _type = K_SUBTYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:92:11: ( 'subtype' )
			// Vhdl.g:92:13: 'subtype'
			{
			match("subtype"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_SUBTYPE"

	// $ANTLR start "K_THEN"
	public final void mK_THEN() throws RecognitionException {
		try {
			int _type = K_THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:93:8: ( 'then' )
			// Vhdl.g:93:10: 'then'
			{
			match("then"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_THEN"

	// $ANTLR start "K_TO"
	public final void mK_TO() throws RecognitionException {
		try {
			int _type = K_TO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:94:6: ( 'to' )
			// Vhdl.g:94:8: 'to'
			{
			match("to"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_TO"

	// $ANTLR start "K_TRANSPORT"
	public final void mK_TRANSPORT() throws RecognitionException {
		try {
			int _type = K_TRANSPORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:95:13: ( 'transport' )
			// Vhdl.g:95:15: 'transport'
			{
			match("transport"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_TRANSPORT"

	// $ANTLR start "K_TYPE"
	public final void mK_TYPE() throws RecognitionException {
		try {
			int _type = K_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:96:8: ( 'type' )
			// Vhdl.g:96:10: 'type'
			{
			match("type"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_TYPE"

	// $ANTLR start "K_UNAFFECTED"
	public final void mK_UNAFFECTED() throws RecognitionException {
		try {
			int _type = K_UNAFFECTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:97:14: ( 'unaffected' )
			// Vhdl.g:97:16: 'unaffected'
			{
			match("unaffected"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_UNAFFECTED"

	// $ANTLR start "K_UNITS"
	public final void mK_UNITS() throws RecognitionException {
		try {
			int _type = K_UNITS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:98:9: ( 'units' )
			// Vhdl.g:98:11: 'units'
			{
			match("units"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_UNITS"

	// $ANTLR start "K_UNTIL"
	public final void mK_UNTIL() throws RecognitionException {
		try {
			int _type = K_UNTIL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:99:9: ( 'until' )
			// Vhdl.g:99:11: 'until'
			{
			match("until"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_UNTIL"

	// $ANTLR start "K_USE"
	public final void mK_USE() throws RecognitionException {
		try {
			int _type = K_USE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:100:7: ( 'use' )
			// Vhdl.g:100:9: 'use'
			{
			match("use"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_USE"

	// $ANTLR start "K_VARIABLE"
	public final void mK_VARIABLE() throws RecognitionException {
		try {
			int _type = K_VARIABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:101:12: ( 'variable' )
			// Vhdl.g:101:14: 'variable'
			{
			match("variable"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_VARIABLE"

	// $ANTLR start "K_WAIT"
	public final void mK_WAIT() throws RecognitionException {
		try {
			int _type = K_WAIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:102:8: ( 'wait' )
			// Vhdl.g:102:10: 'wait'
			{
			match("wait"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_WAIT"

	// $ANTLR start "K_WHEN"
	public final void mK_WHEN() throws RecognitionException {
		try {
			int _type = K_WHEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:103:8: ( 'when' )
			// Vhdl.g:103:10: 'when'
			{
			match("when"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_WHEN"

	// $ANTLR start "K_WHILE"
	public final void mK_WHILE() throws RecognitionException {
		try {
			int _type = K_WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:104:9: ( 'while' )
			// Vhdl.g:104:11: 'while'
			{
			match("while"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_WHILE"

	// $ANTLR start "K_WITH"
	public final void mK_WITH() throws RecognitionException {
		try {
			int _type = K_WITH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:105:8: ( 'with' )
			// Vhdl.g:105:10: 'with'
			{
			match("with"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_WITH"

	// $ANTLR start "K_XNOR"
	public final void mK_XNOR() throws RecognitionException {
		try {
			int _type = K_XNOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:106:8: ( 'xnor' )
			// Vhdl.g:106:10: 'xnor'
			{
			match("xnor"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_XNOR"

	// $ANTLR start "K_XOR"
	public final void mK_XOR() throws RecognitionException {
		try {
			int _type = K_XOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:107:7: ( 'xor' )
			// Vhdl.g:107:9: 'xor'
			{
			match("xor"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_XOR"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1410:7: ( '(' )
			// Vhdl.g:1410:9: '('
			{
			match('('); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1411:7: ( ')' )
			// Vhdl.g:1411:9: ')'
			{
			match(')'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "QUOTE"
	public final void mQUOTE() throws RecognitionException {
		try {
			int _type = QUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1412:6: ( '\"' )
			// Vhdl.g:1412:9: '\"'
			{
			match('\"'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUOTE"

	// $ANTLR start "POUND"
	public final void mPOUND() throws RecognitionException {
		try {
			int _type = POUND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1413:6: ( '#' )
			// Vhdl.g:1413:9: '#'
			{
			match('#'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POUND"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1414:4: ( '&' )
			// Vhdl.g:1414:9: '&'
			{
			match('&'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "STAR"
	public final void mSTAR() throws RecognitionException {
		try {
			int _type = STAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1416:5: ( '*' )
			// Vhdl.g:1416:9: '*'
			{
			match('*'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STAR"

	// $ANTLR start "STAR2"
	public final void mSTAR2() throws RecognitionException {
		try {
			int _type = STAR2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1417:6: ( '**' )
			// Vhdl.g:1417:9: '**'
			{
			match("**"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STAR2"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1418:5: ( '+' )
			// Vhdl.g:1418:9: '+'
			{
			match('+'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1419:6: ( ',' )
			// Vhdl.g:1419:9: ','
			{
			match(','); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1420:6: ( '-' )
			// Vhdl.g:1420:8: '-'
			{
			match('-'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1421:4: ( '.' )
			// Vhdl.g:1421:6: '.'
			{
			match('.'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "SLASH"
	public final void mSLASH() throws RecognitionException {
		try {
			int _type = SLASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1422:6: ( '/' )
			// Vhdl.g:1422:9: '/'
			{
			match('/'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SLASH"

	// $ANTLR start "SLASHEQ"
	public final void mSLASHEQ() throws RecognitionException {
		try {
			int _type = SLASHEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1423:8: ( '/=' )
			// Vhdl.g:1423:9: '/='
			{
			match("/="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SLASHEQ"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1424:6: ( ':' )
			// Vhdl.g:1424:8: ':'
			{
			match(':'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "SEMI"
	public final void mSEMI() throws RecognitionException {
		try {
			int _type = SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1425:5: ( ';' )
			// Vhdl.g:1425:7: ';'
			{
			match(';'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMI"

	// $ANTLR start "LST"
	public final void mLST() throws RecognitionException {
		try {
			int _type = LST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1426:4: ( '<' )
			// Vhdl.g:1426:6: '<'
			{
			match('<'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LST"

	// $ANTLR start "LSTEQ"
	public final void mLSTEQ() throws RecognitionException {
		try {
			int _type = LSTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1427:6: ( '<=' )
			// Vhdl.g:1427:8: '<='
			{
			match("<="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSTEQ"

	// $ANTLR start "LSTGRT"
	public final void mLSTGRT() throws RecognitionException {
		try {
			int _type = LSTGRT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1428:7: ( '<>' )
			// Vhdl.g:1428:9: '<>'
			{
			match("<>"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSTGRT"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1429:3: ( '=' )
			// Vhdl.g:1429:6: '='
			{
			match('='); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "GRT"
	public final void mGRT() throws RecognitionException {
		try {
			int _type = GRT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1430:4: ( '>' )
			// Vhdl.g:1430:6: '>'
			{
			match('>'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GRT"

	// $ANTLR start "GRTEQ"
	public final void mGRTEQ() throws RecognitionException {
		try {
			int _type = GRTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1431:6: ( '>=' )
			// Vhdl.g:1431:8: '>='
			{
			match(">="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GRTEQ"

	// $ANTLR start "EQGRT"
	public final void mEQGRT() throws RecognitionException {
		try {
			int _type = EQGRT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1432:6: ( '=>' )
			// Vhdl.g:1432:8: '=>'
			{
			match("=>"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQGRT"

	// $ANTLR start "LBRACK"
	public final void mLBRACK() throws RecognitionException {
		try {
			int _type = LBRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1433:7: ( '[' )
			// Vhdl.g:1433:9: '['
			{
			match('['); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBRACK"

	// $ANTLR start "RBRACK"
	public final void mRBRACK() throws RecognitionException {
		try {
			int _type = RBRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1434:7: ( ']' )
			// Vhdl.g:1434:9: ']'
			{
			match(']'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBRACK"

	// $ANTLR start "USCORE"
	public final void mUSCORE() throws RecognitionException {
		try {
			int _type = USCORE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1435:7: ( '_' )
			// Vhdl.g:1435:9: '_'
			{
			match('_'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "USCORE"

	// $ANTLR start "BAR"
	public final void mBAR() throws RecognitionException {
		try {
			int _type = BAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1436:4: ( '|' )
			// Vhdl.g:1436:6: '|'
			{
			match('|'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BAR"

	// $ANTLR start "EXCL"
	public final void mEXCL() throws RecognitionException {
		try {
			int _type = EXCL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1437:5: ( '!' )
			// Vhdl.g:1437:7: '!'
			{
			match('!'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXCL"

	// $ANTLR start "DOLLAR"
	public final void mDOLLAR() throws RecognitionException {
		try {
			int _type = DOLLAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1438:7: ( '$' )
			// Vhdl.g:1438:9: '$'
			{
			match('$'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOLLAR"

	// $ANTLR start "PCNT"
	public final void mPCNT() throws RecognitionException {
		try {
			int _type = PCNT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1439:5: ( '%' )
			// Vhdl.g:1439:7: '%'
			{
			match('%'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PCNT"

	// $ANTLR start "AT"
	public final void mAT() throws RecognitionException {
		try {
			int _type = AT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1440:3: ( '@' )
			// Vhdl.g:1440:6: '@'
			{
			match('@'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AT"

	// $ANTLR start "QMARK"
	public final void mQMARK() throws RecognitionException {
		try {
			int _type = QMARK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1441:6: ( '?' )
			// Vhdl.g:1441:8: '?'
			{
			match('?'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QMARK"

	// $ANTLR start "BSLASH"
	public final void mBSLASH() throws RecognitionException {
		try {
			int _type = BSLASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1442:7: ( '\\\\' )
			// Vhdl.g:1442:9: '\\\\'
			{
			match('\\'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BSLASH"

	// $ANTLR start "CARET"
	public final void mCARET() throws RecognitionException {
		try {
			int _type = CARET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1443:6: ( '^' )
			// Vhdl.g:1443:8: '^'
			{
			match('^'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CARET"

	// $ANTLR start "BTIC"
	public final void mBTIC() throws RecognitionException {
		try {
			int _type = BTIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1444:5: ( '`' )
			// Vhdl.g:1444:7: '`'
			{
			match('`'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BTIC"

	// $ANTLR start "LCURLY"
	public final void mLCURLY() throws RecognitionException {
		try {
			int _type = LCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1445:7: ( '{' )
			// Vhdl.g:1445:9: '{'
			{
			match('{'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LCURLY"

	// $ANTLR start "RCURLY"
	public final void mRCURLY() throws RecognitionException {
		try {
			int _type = RCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1446:7: ( '}' )
			// Vhdl.g:1446:9: '}'
			{
			match('}'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RCURLY"

	// $ANTLR start "TILDE"
	public final void mTILDE() throws RecognitionException {
		try {
			int _type = TILDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1447:6: ( '~' )
			// Vhdl.g:1447:8: '~'
			{
			match('~'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TILDE"

	// $ANTLR start "COLONEQ"
	public final void mCOLONEQ() throws RecognitionException {
		try {
			int _type = COLONEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1448:8: ( ':=' )
			// Vhdl.g:1448:9: ':='
			{
			match(":="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLONEQ"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1451:3: ( ( ' ' | '\\r' | '\\t' )+ )
			// Vhdl.g:1451:3: ( ' ' | '\\r' | '\\t' )+
			{
			// Vhdl.g:1451:3: ( ' ' | '\\r' | '\\t' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='\t'||LA1_0=='\r'||LA1_0==' ') ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Vhdl.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			if ( state.backtracking==0 ) {_channel=HIDDEN;}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1455:3: ( '\\n' )
			// Vhdl.g:1455:3: '\\n'
			{
			match('\n'); if (state.failed) return;
			if ( state.backtracking==0 ) {_channel=HIDDEN;}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWLINE"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1459:3: ( '--' (~ '\\n' )* )
			// Vhdl.g:1459:3: '--' (~ '\\n' )*
			{
			match("--"); if (state.failed) return;

			// Vhdl.g:1459:8: (~ '\\n' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\uFFFF')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Vhdl.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			if ( state.backtracking==0 ) {_channel=HIDDEN;}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "BASIC_IDENTIFIER"
	public final void mBASIC_IDENTIFIER() throws RecognitionException {
		try {
			int _type = BASIC_IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1464:5: ( LETTER ( ( '_' )? ( LETTER | DIGIT ) )* )
			// Vhdl.g:1464:5: LETTER ( ( '_' )? ( LETTER | DIGIT ) )*
			{
			mLETTER(); if (state.failed) return;

			// Vhdl.g:1464:12: ( ( '_' )? ( LETTER | DIGIT ) )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Vhdl.g:1464:13: ( '_' )? ( LETTER | DIGIT )
					{
					// Vhdl.g:1464:13: ( '_' )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0=='_') ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// Vhdl.g:1464:14: '_'
							{
							match('_'); if (state.failed) return;
							}
							break;

					}

					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop4;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BASIC_IDENTIFIER"

	// $ANTLR start "BIT_STRING_LITERAL"
	public final void mBIT_STRING_LITERAL() throws RecognitionException {
		try {
			int _type = BIT_STRING_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1468:5: ( BASE_SPECIFIER '\"' ( BIT_VALUE )? '\"' )
			// Vhdl.g:1468:5: BASE_SPECIFIER '\"' ( BIT_VALUE )? '\"'
			{
			mBASE_SPECIFIER(); if (state.failed) return;

			match('\"'); if (state.failed) return;
			// Vhdl.g:1468:24: ( BIT_VALUE )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// Vhdl.g:1468:25: BIT_VALUE
					{
					mBIT_VALUE(); if (state.failed) return;

					}
					break;

			}

			match('\"'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BIT_STRING_LITERAL"

	// $ANTLR start "TIC"
	public final void mTIC() throws RecognitionException {
		try {
			int _type = TIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1472:4: ( '\\'' )
			// Vhdl.g:1472:6: '\\''
			{
			match('\''); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TIC"

	// $ANTLR start "TIC_SIMPLE_NAME"
	public final void mTIC_SIMPLE_NAME() throws RecognitionException {
		try {
			int _type = TIC_SIMPLE_NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1478:5: ( TIC ( BASIC_IDENTIFIER | TIC EXTENDED_IDENTIFIER ) )
			// Vhdl.g:1478:5: TIC ( BASIC_IDENTIFIER | TIC EXTENDED_IDENTIFIER )
			{
			mTIC(); if (state.failed) return;

			// Vhdl.g:1478:9: ( BASIC_IDENTIFIER | TIC EXTENDED_IDENTIFIER )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( ((LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
				alt6=1;
			}
			else if ( (LA6_0=='\'') ) {
				alt6=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// Vhdl.g:1478:10: BASIC_IDENTIFIER
					{
					mBASIC_IDENTIFIER(); if (state.failed) return;

					}
					break;
				case 2 :
					// Vhdl.g:1478:29: TIC EXTENDED_IDENTIFIER
					{
					mTIC(); if (state.failed) return;

					mEXTENDED_IDENTIFIER(); if (state.failed) return;

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TIC_SIMPLE_NAME"

	// $ANTLR start "CHARACTER_LITERAL"
	public final void mCHARACTER_LITERAL() throws RecognitionException {
		try {
			int _type = CHARACTER_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1482:5: ( ( '\\'' ( GRAPHIC_CHARACTER )? '\\'' )=> '\\'' ( GRAPHIC_CHARACTER )? '\\'' | ( TIC_SIMPLE_NAME )=> TIC_SIMPLE_NAME | TIC )
			int alt8=3;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='\'') ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1=='\'') ) {
					int LA8_2 = input.LA(3);
					if ( (LA8_2=='\'') && (synpred1_Vhdl())) {
						alt8=1;
					}
					else if ( (LA8_2=='\\') && (synpred2_Vhdl())) {
						alt8=2;
					}

				}
				else if ( ((LA8_1 >= 'a' && LA8_1 <= 'z')) ) {
					int LA8_3 = input.LA(3);
					if ( (LA8_3=='\'') && (synpred1_Vhdl())) {
						alt8=1;
					}
					else if ( (LA8_3=='_') && (synpred2_Vhdl())) {
						alt8=2;
					}
					else if ( ((LA8_3 >= '0' && LA8_3 <= '9')||(LA8_3 >= 'a' && LA8_3 <= 'z')) && (synpred2_Vhdl())) {
						alt8=2;
					}

				}
				else if ( ((LA8_1 >= ' ' && LA8_1 <= '&')||(LA8_1 >= '(' && LA8_1 <= '@')||(LA8_1 >= '[' && LA8_1 <= '`')||(LA8_1 >= '{' && LA8_1 <= '~')||(LA8_1 >= '\u00A0' && LA8_1 <= '\u00FF')) && (synpred1_Vhdl())) {
					alt8=1;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// Vhdl.g:1482:5: ( '\\'' ( GRAPHIC_CHARACTER )? '\\'' )=> '\\'' ( GRAPHIC_CHARACTER )? '\\''
					{
					match('\''); if (state.failed) return;
					// Vhdl.g:1482:45: ( GRAPHIC_CHARACTER )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='\'') ) {
						int LA7_1 = input.LA(2);
						if ( (LA7_1=='\'') ) {
							alt7=1;
						}
					}
					else if ( ((LA7_0 >= ' ' && LA7_0 <= '&')||(LA7_0 >= '(' && LA7_0 <= '@')||(LA7_0 >= '[' && LA7_0 <= '~')||(LA7_0 >= '\u00A0' && LA7_0 <= '\u00FF')) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// Vhdl.g:
							{
							if ( (input.LA(1) >= ' ' && input.LA(1) <= '@')||(input.LA(1) >= '[' && input.LA(1) <= '~')||(input.LA(1) >= '\u00A0' && input.LA(1) <= '\u00FF') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					match('\''); if (state.failed) return;
					}
					break;
				case 2 :
					// Vhdl.g:1483:3: ( TIC_SIMPLE_NAME )=> TIC_SIMPLE_NAME
					{
					mTIC_SIMPLE_NAME(); if (state.failed) return;

					if ( state.backtracking==0 ) {_type = TIC_SIMPLE_NAME;}
					}
					break;
				case 3 :
					// Vhdl.g:1484:3: TIC
					{
					mTIC(); if (state.failed) return;

					if ( state.backtracking==0 ) {_type = TIC;}
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHARACTER_LITERAL"

	// $ANTLR start "EXTENDED_IDENTIFIER"
	public final void mEXTENDED_IDENTIFIER() throws RecognitionException {
		try {
			int _type = EXTENDED_IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1488:5: ( '\\\\' ( GRAPHIC_CHARACTER )* '\\\\' )
			// Vhdl.g:1488:5: '\\\\' ( GRAPHIC_CHARACTER )* '\\\\'
			{
			match('\\'); if (state.failed) return;
			// Vhdl.g:1488:10: ( GRAPHIC_CHARACTER )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0=='\\') ) {
					int LA9_1 = input.LA(2);
					if ( ((LA9_1 >= ' ' && LA9_1 <= '@')||(LA9_1 >= '[' && LA9_1 <= '~')||(LA9_1 >= '\u00A0' && LA9_1 <= '\u00FF')) ) {
						alt9=1;
					}

				}
				else if ( ((LA9_0 >= ' ' && LA9_0 <= '@')||LA9_0=='['||(LA9_0 >= ']' && LA9_0 <= '~')||(LA9_0 >= '\u00A0' && LA9_0 <= '\u00FF')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// Vhdl.g:
					{
					if ( (input.LA(1) >= ' ' && input.LA(1) <= '@')||(input.LA(1) >= '[' && input.LA(1) <= '~')||(input.LA(1) >= '\u00A0' && input.LA(1) <= '\u00FF') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop9;
				}
			}

			match('\\'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXTENDED_IDENTIFIER"

	// $ANTLR start "STRING_LITERAL"
	public final void mSTRING_LITERAL() throws RecognitionException {
		try {
			int _type = STRING_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1492:5: ( '\"' ( GRAPHIC_CHARACTER_BASE | '\"\"' )* '\"' )
			// Vhdl.g:1492:5: '\"' ( GRAPHIC_CHARACTER_BASE | '\"\"' )* '\"'
			{
			match('\"'); if (state.failed) return;
			// Vhdl.g:1492:9: ( GRAPHIC_CHARACTER_BASE | '\"\"' )*
			loop10:
			while (true) {
				int alt10=3;
				int LA10_0 = input.LA(1);
				if ( (LA10_0=='\"') ) {
					int LA10_1 = input.LA(2);
					if ( (LA10_1=='\"') ) {
						alt10=2;
					}

				}
				else if ( ((LA10_0 >= ' ' && LA10_0 <= '!')||(LA10_0 >= '#' && LA10_0 <= '@')||(LA10_0 >= '[' && LA10_0 <= '~')||(LA10_0 >= '\u00A0' && LA10_0 <= '\u00FF')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// Vhdl.g:1492:10: GRAPHIC_CHARACTER_BASE
					{
					mGRAPHIC_CHARACTER_BASE(); if (state.failed) return;

					}
					break;
				case 2 :
					// Vhdl.g:1492:35: '\"\"'
					{
					match("\"\""); if (state.failed) return;

					}
					break;

				default :
					break loop10;
				}
			}

			match('\"'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_LITERAL"

	// $ANTLR start "DECIMAL_LITERAL"
	public final void mDECIMAL_LITERAL() throws RecognitionException {
		try {
			int _type = DECIMAL_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1496:5: ( INTEGER ( '.' INTEGER )? ( EXPONENT )? )
			// Vhdl.g:1496:5: INTEGER ( '.' INTEGER )? ( EXPONENT )?
			{
			mINTEGER(); if (state.failed) return;

			// Vhdl.g:1496:13: ( '.' INTEGER )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='.') ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// Vhdl.g:1496:14: '.' INTEGER
					{
					match('.'); if (state.failed) return;
					mINTEGER(); if (state.failed) return;

					}
					break;

			}

			// Vhdl.g:1496:28: ( EXPONENT )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='e') ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// Vhdl.g:1496:29: EXPONENT
					{
					mEXPONENT(); if (state.failed) return;

					}
					break;

			}

			if ( state.backtracking==0 ) {_type = DECIMAL_LITERAL;}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DECIMAL_LITERAL"

	// $ANTLR start "BASED_LITERAL"
	public final void mBASED_LITERAL() throws RecognitionException {
		try {
			int _type = BASED_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Vhdl.g:1500:5: ( INTEGER '#' BASED_INTEGER ( '.' BASED_INTEGER )? '#' ( EXPONENT )? )
			// Vhdl.g:1500:5: INTEGER '#' BASED_INTEGER ( '.' BASED_INTEGER )? '#' ( EXPONENT )?
			{
			mINTEGER(); if (state.failed) return;

			match('#'); if (state.failed) return;
			mBASED_INTEGER(); if (state.failed) return;

			// Vhdl.g:1500:31: ( '.' BASED_INTEGER )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='.') ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// Vhdl.g:1500:32: '.' BASED_INTEGER
					{
					match('.'); if (state.failed) return;
					mBASED_INTEGER(); if (state.failed) return;

					}
					break;

			}

			match('#'); if (state.failed) return;
			// Vhdl.g:1500:56: ( EXPONENT )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0=='e') ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// Vhdl.g:1500:57: EXPONENT
					{
					mEXPONENT(); if (state.failed) return;

					}
					break;

			}

			if ( state.backtracking==0 ) {_type = BASED_LITERAL;}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BASED_LITERAL"

	// $ANTLR start "BASE_SPECIFIER"
	public final void mBASE_SPECIFIER() throws RecognitionException {
		try {
			// Vhdl.g:1506:5: ( 'b' | 'o' | 'x' )
			// Vhdl.g:
			{
			if ( input.LA(1)=='b'||input.LA(1)=='o'||input.LA(1)=='x' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BASE_SPECIFIER"

	// $ANTLR start "BASED_INTEGER"
	public final void mBASED_INTEGER() throws RecognitionException {
		try {
			// Vhdl.g:1511:5: ( EXTENDED_DIGIT ( ( '_' )? EXTENDED_DIGIT )* )
			// Vhdl.g:1511:5: EXTENDED_DIGIT ( ( '_' )? EXTENDED_DIGIT )*
			{
			mEXTENDED_DIGIT(); if (state.failed) return;

			// Vhdl.g:1511:20: ( ( '_' )? EXTENDED_DIGIT )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( ((LA16_0 >= '0' && LA16_0 <= '9')||LA16_0=='_'||(LA16_0 >= 'a' && LA16_0 <= 'z')) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// Vhdl.g:1511:21: ( '_' )? EXTENDED_DIGIT
					{
					// Vhdl.g:1511:21: ( '_' )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0=='_') ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// Vhdl.g:1511:22: '_'
							{
							match('_'); if (state.failed) return;
							}
							break;

					}

					mEXTENDED_DIGIT(); if (state.failed) return;

					}
					break;

				default :
					break loop16;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BASED_INTEGER"

	// $ANTLR start "EXTENDED_DIGIT"
	public final void mEXTENDED_DIGIT() throws RecognitionException {
		try {
			// Vhdl.g:1516:5: ( DIGIT | LETTER )
			// Vhdl.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXTENDED_DIGIT"

	// $ANTLR start "BASIC_GRAPHIC_CHARACTER_BASE"
	public final void mBASIC_GRAPHIC_CHARACTER_BASE() throws RecognitionException {
		try {
			// Vhdl.g:1524:5: ( '\\u00C0' .. '\\u00DE' | DIGIT | '#' | '&' | '\\'' | '(' | ')' | '*' | '+' | ',' | '-' | '.' | '/' | ':' | ';' | '<' | '=' | '>' | '[' | ']' | '_' | '|' | ' ' | '\\u00A0' )
			// Vhdl.g:
			{
			if ( input.LA(1)==' '||input.LA(1)=='#'||(input.LA(1) >= '&' && input.LA(1) <= '>')||input.LA(1)=='['||input.LA(1)==']'||input.LA(1)=='_'||input.LA(1)=='|'||input.LA(1)=='\u00A0'||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00DE') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BASIC_GRAPHIC_CHARACTER_BASE"

	// $ANTLR start "GRAPHIC_CHARACTER_BASE"
	public final void mGRAPHIC_CHARACTER_BASE() throws RecognitionException {
		try {
			// Vhdl.g:1533:5: ( BASIC_GRAPHIC_CHARACTER_BASE | LOWER_CASE_LETTER | '\\u00DF' .. '\\u00FF' | '!' | '$' | '%' | '@' | '?' | '\\\\' | '^' | '`' | '{' | '}' | '~' | '\\u00A1' .. '\\u00BF' )
			// Vhdl.g:
			{
			if ( (input.LA(1) >= ' ' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '@')||(input.LA(1) >= '[' && input.LA(1) <= '~')||(input.LA(1) >= '\u00A0' && input.LA(1) <= '\u00FF') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GRAPHIC_CHARACTER_BASE"

	// $ANTLR start "GRAPHIC_CHARACTER"
	public final void mGRAPHIC_CHARACTER() throws RecognitionException {
		try {
			// Vhdl.g:1542:3: ( GRAPHIC_CHARACTER_BASE | '\"' )
			// Vhdl.g:
			{
			if ( (input.LA(1) >= ' ' && input.LA(1) <= '@')||(input.LA(1) >= '[' && input.LA(1) <= '~')||(input.LA(1) >= '\u00A0' && input.LA(1) <= '\u00FF') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GRAPHIC_CHARACTER"

	// $ANTLR start "BIT_VALUE"
	public final void mBIT_VALUE() throws RecognitionException {
		try {
			// Vhdl.g:1548:5: ( BASED_INTEGER )
			// Vhdl.g:1548:5: BASED_INTEGER
			{
			mBASED_INTEGER(); if (state.failed) return;

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BIT_VALUE"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// Vhdl.g:1553:5: ( '0' .. '9' )
			// Vhdl.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// Vhdl.g:1558:5: ( 'e' ( ( '+' )? | '-' ) INTEGER )
			// Vhdl.g:1558:5: 'e' ( ( '+' )? | '-' ) INTEGER
			{
			match('e'); if (state.failed) return;
			// Vhdl.g:1558:9: ( ( '+' )? | '-' )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='+'||(LA18_0 >= '0' && LA18_0 <= '9')) ) {
				alt18=1;
			}
			else if ( (LA18_0=='-') ) {
				alt18=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// Vhdl.g:1558:10: ( '+' )?
					{
					// Vhdl.g:1558:10: ( '+' )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0=='+') ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// Vhdl.g:1558:11: '+'
							{
							match('+'); if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 2 :
					// Vhdl.g:1558:19: '-'
					{
					match('-'); if (state.failed) return;
					}
					break;

			}

			mINTEGER(); if (state.failed) return;

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "LOWER_CASE_LETTER"
	public final void mLOWER_CASE_LETTER() throws RecognitionException {
		try {
			// Vhdl.g:1563:5: ( 'a' .. 'z' )
			// Vhdl.g:
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOWER_CASE_LETTER"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// Vhdl.g:1568:5: ( LOWER_CASE_LETTER )
			// Vhdl.g:
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			// Vhdl.g:1573:5: ( DIGIT ( ( '_' )? DIGIT )* )
			// Vhdl.g:1573:5: DIGIT ( ( '_' )? DIGIT )*
			{
			mDIGIT(); if (state.failed) return;

			// Vhdl.g:1573:11: ( ( '_' )? DIGIT )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( ((LA20_0 >= '0' && LA20_0 <= '9')||LA20_0=='_') ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// Vhdl.g:1573:12: ( '_' )? DIGIT
					{
					// Vhdl.g:1573:12: ( '_' )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0=='_') ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// Vhdl.g:1573:13: '_'
							{
							match('_'); if (state.failed) return;
							}
							break;

					}

					mDIGIT(); if (state.failed) return;

					}
					break;

				default :
					break loop20;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	@Override
	public void mTokens() throws RecognitionException {
		// Vhdl.g:1:8: ( K_ABS | K_ACCESS | K_AFTER | K_ALIAS | K_ALL | K_AND | K_ARCHITECTURE | K_ARRAY | K_ASSERT | K_ATTRIBUTE | K_BEGIN | K_BLOCK | K_BODY | K_BUFFER | K_BUS | K_CASE | K_COMPONENT | K_CONFIGURATION | K_CONSTANT | K_DISCONNECT | K_DOWNTO | K_ELSE | K_ELSIF | K_END | K_ENTITY | K_EXIT | K_FILE | K_FOR | K_FUNCTION | K_GENERATE | K_GENERIC | K_GROUP | K_GUARDED | K_IF | K_IMPURE | K_IN | K_INERTIAL | K_INOUT | K_IS | K_LABEL | K_LIBRARY | K_LINKAGE | K_LITERAL | K_LOOP | K_MAP | K_MOD | K_NAND | K_NEW | K_NEXT | K_NOR | K_NOT | K_NULL | K_OF | K_ON | K_OPEN | K_OR | K_OTHERS | K_OUT | K_PACKAGE | K_PORT | K_POSTPONED | K_PROCEDURE | K_PROCESS | K_PROTECTED | K_PURE | K_RANGE | K_RECORD | K_REGISTER | K_REJECT | K_REM | K_REPORT | K_RETURN | K_ROL | K_ROR | K_SELECT | K_SEVERITY | K_SHARED | K_SIGNAL | K_SLA | K_SLL | K_SRA | K_SRL | K_SUBTYPE | K_THEN | K_TO | K_TRANSPORT | K_TYPE | K_UNAFFECTED | K_UNITS | K_UNTIL | K_USE | K_VARIABLE | K_WAIT | K_WHEN | K_WHILE | K_WITH | K_XNOR | K_XOR | LPAREN | RPAREN | QUOTE | POUND | AND | STAR | STAR2 | PLUS | COMMA | MINUS | DOT | SLASH | SLASHEQ | COLON | SEMI | LST | LSTEQ | LSTGRT | EQ | GRT | GRTEQ | EQGRT | LBRACK | RBRACK | USCORE | BAR | EXCL | DOLLAR | PCNT | AT | QMARK | BSLASH | CARET | BTIC | LCURLY | RCURLY | TILDE | COLONEQ | WS | NEWLINE | COMMENT | BASIC_IDENTIFIER | BIT_STRING_LITERAL | TIC | TIC_SIMPLE_NAME | CHARACTER_LITERAL | EXTENDED_IDENTIFIER | STRING_LITERAL | DECIMAL_LITERAL | BASED_LITERAL )
		int alt21=148;
		alt21 = dfa21.predict(input);
		switch (alt21) {
			case 1 :
				// Vhdl.g:1:10: K_ABS
				{
				mK_ABS(); if (state.failed) return;

				}
				break;
			case 2 :
				// Vhdl.g:1:16: K_ACCESS
				{
				mK_ACCESS(); if (state.failed) return;

				}
				break;
			case 3 :
				// Vhdl.g:1:25: K_AFTER
				{
				mK_AFTER(); if (state.failed) return;

				}
				break;
			case 4 :
				// Vhdl.g:1:33: K_ALIAS
				{
				mK_ALIAS(); if (state.failed) return;

				}
				break;
			case 5 :
				// Vhdl.g:1:41: K_ALL
				{
				mK_ALL(); if (state.failed) return;

				}
				break;
			case 6 :
				// Vhdl.g:1:47: K_AND
				{
				mK_AND(); if (state.failed) return;

				}
				break;
			case 7 :
				// Vhdl.g:1:53: K_ARCHITECTURE
				{
				mK_ARCHITECTURE(); if (state.failed) return;

				}
				break;
			case 8 :
				// Vhdl.g:1:68: K_ARRAY
				{
				mK_ARRAY(); if (state.failed) return;

				}
				break;
			case 9 :
				// Vhdl.g:1:76: K_ASSERT
				{
				mK_ASSERT(); if (state.failed) return;

				}
				break;
			case 10 :
				// Vhdl.g:1:85: K_ATTRIBUTE
				{
				mK_ATTRIBUTE(); if (state.failed) return;

				}
				break;
			case 11 :
				// Vhdl.g:1:97: K_BEGIN
				{
				mK_BEGIN(); if (state.failed) return;

				}
				break;
			case 12 :
				// Vhdl.g:1:105: K_BLOCK
				{
				mK_BLOCK(); if (state.failed) return;

				}
				break;
			case 13 :
				// Vhdl.g:1:113: K_BODY
				{
				mK_BODY(); if (state.failed) return;

				}
				break;
			case 14 :
				// Vhdl.g:1:120: K_BUFFER
				{
				mK_BUFFER(); if (state.failed) return;

				}
				break;
			case 15 :
				// Vhdl.g:1:129: K_BUS
				{
				mK_BUS(); if (state.failed) return;

				}
				break;
			case 16 :
				// Vhdl.g:1:135: K_CASE
				{
				mK_CASE(); if (state.failed) return;

				}
				break;
			case 17 :
				// Vhdl.g:1:142: K_COMPONENT
				{
				mK_COMPONENT(); if (state.failed) return;

				}
				break;
			case 18 :
				// Vhdl.g:1:154: K_CONFIGURATION
				{
				mK_CONFIGURATION(); if (state.failed) return;

				}
				break;
			case 19 :
				// Vhdl.g:1:170: K_CONSTANT
				{
				mK_CONSTANT(); if (state.failed) return;

				}
				break;
			case 20 :
				// Vhdl.g:1:181: K_DISCONNECT
				{
				mK_DISCONNECT(); if (state.failed) return;

				}
				break;
			case 21 :
				// Vhdl.g:1:194: K_DOWNTO
				{
				mK_DOWNTO(); if (state.failed) return;

				}
				break;
			case 22 :
				// Vhdl.g:1:203: K_ELSE
				{
				mK_ELSE(); if (state.failed) return;

				}
				break;
			case 23 :
				// Vhdl.g:1:210: K_ELSIF
				{
				mK_ELSIF(); if (state.failed) return;

				}
				break;
			case 24 :
				// Vhdl.g:1:218: K_END
				{
				mK_END(); if (state.failed) return;

				}
				break;
			case 25 :
				// Vhdl.g:1:224: K_ENTITY
				{
				mK_ENTITY(); if (state.failed) return;

				}
				break;
			case 26 :
				// Vhdl.g:1:233: K_EXIT
				{
				mK_EXIT(); if (state.failed) return;

				}
				break;
			case 27 :
				// Vhdl.g:1:240: K_FILE
				{
				mK_FILE(); if (state.failed) return;

				}
				break;
			case 28 :
				// Vhdl.g:1:247: K_FOR
				{
				mK_FOR(); if (state.failed) return;

				}
				break;
			case 29 :
				// Vhdl.g:1:253: K_FUNCTION
				{
				mK_FUNCTION(); if (state.failed) return;

				}
				break;
			case 30 :
				// Vhdl.g:1:264: K_GENERATE
				{
				mK_GENERATE(); if (state.failed) return;

				}
				break;
			case 31 :
				// Vhdl.g:1:275: K_GENERIC
				{
				mK_GENERIC(); if (state.failed) return;

				}
				break;
			case 32 :
				// Vhdl.g:1:285: K_GROUP
				{
				mK_GROUP(); if (state.failed) return;

				}
				break;
			case 33 :
				// Vhdl.g:1:293: K_GUARDED
				{
				mK_GUARDED(); if (state.failed) return;

				}
				break;
			case 34 :
				// Vhdl.g:1:303: K_IF
				{
				mK_IF(); if (state.failed) return;

				}
				break;
			case 35 :
				// Vhdl.g:1:308: K_IMPURE
				{
				mK_IMPURE(); if (state.failed) return;

				}
				break;
			case 36 :
				// Vhdl.g:1:317: K_IN
				{
				mK_IN(); if (state.failed) return;

				}
				break;
			case 37 :
				// Vhdl.g:1:322: K_INERTIAL
				{
				mK_INERTIAL(); if (state.failed) return;

				}
				break;
			case 38 :
				// Vhdl.g:1:333: K_INOUT
				{
				mK_INOUT(); if (state.failed) return;

				}
				break;
			case 39 :
				// Vhdl.g:1:341: K_IS
				{
				mK_IS(); if (state.failed) return;

				}
				break;
			case 40 :
				// Vhdl.g:1:346: K_LABEL
				{
				mK_LABEL(); if (state.failed) return;

				}
				break;
			case 41 :
				// Vhdl.g:1:354: K_LIBRARY
				{
				mK_LIBRARY(); if (state.failed) return;

				}
				break;
			case 42 :
				// Vhdl.g:1:364: K_LINKAGE
				{
				mK_LINKAGE(); if (state.failed) return;

				}
				break;
			case 43 :
				// Vhdl.g:1:374: K_LITERAL
				{
				mK_LITERAL(); if (state.failed) return;

				}
				break;
			case 44 :
				// Vhdl.g:1:384: K_LOOP
				{
				mK_LOOP(); if (state.failed) return;

				}
				break;
			case 45 :
				// Vhdl.g:1:391: K_MAP
				{
				mK_MAP(); if (state.failed) return;

				}
				break;
			case 46 :
				// Vhdl.g:1:397: K_MOD
				{
				mK_MOD(); if (state.failed) return;

				}
				break;
			case 47 :
				// Vhdl.g:1:403: K_NAND
				{
				mK_NAND(); if (state.failed) return;

				}
				break;
			case 48 :
				// Vhdl.g:1:410: K_NEW
				{
				mK_NEW(); if (state.failed) return;

				}
				break;
			case 49 :
				// Vhdl.g:1:416: K_NEXT
				{
				mK_NEXT(); if (state.failed) return;

				}
				break;
			case 50 :
				// Vhdl.g:1:423: K_NOR
				{
				mK_NOR(); if (state.failed) return;

				}
				break;
			case 51 :
				// Vhdl.g:1:429: K_NOT
				{
				mK_NOT(); if (state.failed) return;

				}
				break;
			case 52 :
				// Vhdl.g:1:435: K_NULL
				{
				mK_NULL(); if (state.failed) return;

				}
				break;
			case 53 :
				// Vhdl.g:1:442: K_OF
				{
				mK_OF(); if (state.failed) return;

				}
				break;
			case 54 :
				// Vhdl.g:1:447: K_ON
				{
				mK_ON(); if (state.failed) return;

				}
				break;
			case 55 :
				// Vhdl.g:1:452: K_OPEN
				{
				mK_OPEN(); if (state.failed) return;

				}
				break;
			case 56 :
				// Vhdl.g:1:459: K_OR
				{
				mK_OR(); if (state.failed) return;

				}
				break;
			case 57 :
				// Vhdl.g:1:464: K_OTHERS
				{
				mK_OTHERS(); if (state.failed) return;

				}
				break;
			case 58 :
				// Vhdl.g:1:473: K_OUT
				{
				mK_OUT(); if (state.failed) return;

				}
				break;
			case 59 :
				// Vhdl.g:1:479: K_PACKAGE
				{
				mK_PACKAGE(); if (state.failed) return;

				}
				break;
			case 60 :
				// Vhdl.g:1:489: K_PORT
				{
				mK_PORT(); if (state.failed) return;

				}
				break;
			case 61 :
				// Vhdl.g:1:496: K_POSTPONED
				{
				mK_POSTPONED(); if (state.failed) return;

				}
				break;
			case 62 :
				// Vhdl.g:1:508: K_PROCEDURE
				{
				mK_PROCEDURE(); if (state.failed) return;

				}
				break;
			case 63 :
				// Vhdl.g:1:520: K_PROCESS
				{
				mK_PROCESS(); if (state.failed) return;

				}
				break;
			case 64 :
				// Vhdl.g:1:530: K_PROTECTED
				{
				mK_PROTECTED(); if (state.failed) return;

				}
				break;
			case 65 :
				// Vhdl.g:1:542: K_PURE
				{
				mK_PURE(); if (state.failed) return;

				}
				break;
			case 66 :
				// Vhdl.g:1:549: K_RANGE
				{
				mK_RANGE(); if (state.failed) return;

				}
				break;
			case 67 :
				// Vhdl.g:1:557: K_RECORD
				{
				mK_RECORD(); if (state.failed) return;

				}
				break;
			case 68 :
				// Vhdl.g:1:566: K_REGISTER
				{
				mK_REGISTER(); if (state.failed) return;

				}
				break;
			case 69 :
				// Vhdl.g:1:577: K_REJECT
				{
				mK_REJECT(); if (state.failed) return;

				}
				break;
			case 70 :
				// Vhdl.g:1:586: K_REM
				{
				mK_REM(); if (state.failed) return;

				}
				break;
			case 71 :
				// Vhdl.g:1:592: K_REPORT
				{
				mK_REPORT(); if (state.failed) return;

				}
				break;
			case 72 :
				// Vhdl.g:1:601: K_RETURN
				{
				mK_RETURN(); if (state.failed) return;

				}
				break;
			case 73 :
				// Vhdl.g:1:610: K_ROL
				{
				mK_ROL(); if (state.failed) return;

				}
				break;
			case 74 :
				// Vhdl.g:1:616: K_ROR
				{
				mK_ROR(); if (state.failed) return;

				}
				break;
			case 75 :
				// Vhdl.g:1:622: K_SELECT
				{
				mK_SELECT(); if (state.failed) return;

				}
				break;
			case 76 :
				// Vhdl.g:1:631: K_SEVERITY
				{
				mK_SEVERITY(); if (state.failed) return;

				}
				break;
			case 77 :
				// Vhdl.g:1:642: K_SHARED
				{
				mK_SHARED(); if (state.failed) return;

				}
				break;
			case 78 :
				// Vhdl.g:1:651: K_SIGNAL
				{
				mK_SIGNAL(); if (state.failed) return;

				}
				break;
			case 79 :
				// Vhdl.g:1:660: K_SLA
				{
				mK_SLA(); if (state.failed) return;

				}
				break;
			case 80 :
				// Vhdl.g:1:666: K_SLL
				{
				mK_SLL(); if (state.failed) return;

				}
				break;
			case 81 :
				// Vhdl.g:1:672: K_SRA
				{
				mK_SRA(); if (state.failed) return;

				}
				break;
			case 82 :
				// Vhdl.g:1:678: K_SRL
				{
				mK_SRL(); if (state.failed) return;

				}
				break;
			case 83 :
				// Vhdl.g:1:684: K_SUBTYPE
				{
				mK_SUBTYPE(); if (state.failed) return;

				}
				break;
			case 84 :
				// Vhdl.g:1:694: K_THEN
				{
				mK_THEN(); if (state.failed) return;

				}
				break;
			case 85 :
				// Vhdl.g:1:701: K_TO
				{
				mK_TO(); if (state.failed) return;

				}
				break;
			case 86 :
				// Vhdl.g:1:706: K_TRANSPORT
				{
				mK_TRANSPORT(); if (state.failed) return;

				}
				break;
			case 87 :
				// Vhdl.g:1:718: K_TYPE
				{
				mK_TYPE(); if (state.failed) return;

				}
				break;
			case 88 :
				// Vhdl.g:1:725: K_UNAFFECTED
				{
				mK_UNAFFECTED(); if (state.failed) return;

				}
				break;
			case 89 :
				// Vhdl.g:1:738: K_UNITS
				{
				mK_UNITS(); if (state.failed) return;

				}
				break;
			case 90 :
				// Vhdl.g:1:746: K_UNTIL
				{
				mK_UNTIL(); if (state.failed) return;

				}
				break;
			case 91 :
				// Vhdl.g:1:754: K_USE
				{
				mK_USE(); if (state.failed) return;

				}
				break;
			case 92 :
				// Vhdl.g:1:760: K_VARIABLE
				{
				mK_VARIABLE(); if (state.failed) return;

				}
				break;
			case 93 :
				// Vhdl.g:1:771: K_WAIT
				{
				mK_WAIT(); if (state.failed) return;

				}
				break;
			case 94 :
				// Vhdl.g:1:778: K_WHEN
				{
				mK_WHEN(); if (state.failed) return;

				}
				break;
			case 95 :
				// Vhdl.g:1:785: K_WHILE
				{
				mK_WHILE(); if (state.failed) return;

				}
				break;
			case 96 :
				// Vhdl.g:1:793: K_WITH
				{
				mK_WITH(); if (state.failed) return;

				}
				break;
			case 97 :
				// Vhdl.g:1:800: K_XNOR
				{
				mK_XNOR(); if (state.failed) return;

				}
				break;
			case 98 :
				// Vhdl.g:1:807: K_XOR
				{
				mK_XOR(); if (state.failed) return;

				}
				break;
			case 99 :
				// Vhdl.g:1:813: LPAREN
				{
				mLPAREN(); if (state.failed) return;

				}
				break;
			case 100 :
				// Vhdl.g:1:820: RPAREN
				{
				mRPAREN(); if (state.failed) return;

				}
				break;
			case 101 :
				// Vhdl.g:1:827: QUOTE
				{
				mQUOTE(); if (state.failed) return;

				}
				break;
			case 102 :
				// Vhdl.g:1:833: POUND
				{
				mPOUND(); if (state.failed) return;

				}
				break;
			case 103 :
				// Vhdl.g:1:839: AND
				{
				mAND(); if (state.failed) return;

				}
				break;
			case 104 :
				// Vhdl.g:1:843: STAR
				{
				mSTAR(); if (state.failed) return;

				}
				break;
			case 105 :
				// Vhdl.g:1:848: STAR2
				{
				mSTAR2(); if (state.failed) return;

				}
				break;
			case 106 :
				// Vhdl.g:1:854: PLUS
				{
				mPLUS(); if (state.failed) return;

				}
				break;
			case 107 :
				// Vhdl.g:1:859: COMMA
				{
				mCOMMA(); if (state.failed) return;

				}
				break;
			case 108 :
				// Vhdl.g:1:865: MINUS
				{
				mMINUS(); if (state.failed) return;

				}
				break;
			case 109 :
				// Vhdl.g:1:871: DOT
				{
				mDOT(); if (state.failed) return;

				}
				break;
			case 110 :
				// Vhdl.g:1:875: SLASH
				{
				mSLASH(); if (state.failed) return;

				}
				break;
			case 111 :
				// Vhdl.g:1:881: SLASHEQ
				{
				mSLASHEQ(); if (state.failed) return;

				}
				break;
			case 112 :
				// Vhdl.g:1:889: COLON
				{
				mCOLON(); if (state.failed) return;

				}
				break;
			case 113 :
				// Vhdl.g:1:895: SEMI
				{
				mSEMI(); if (state.failed) return;

				}
				break;
			case 114 :
				// Vhdl.g:1:900: LST
				{
				mLST(); if (state.failed) return;

				}
				break;
			case 115 :
				// Vhdl.g:1:904: LSTEQ
				{
				mLSTEQ(); if (state.failed) return;

				}
				break;
			case 116 :
				// Vhdl.g:1:910: LSTGRT
				{
				mLSTGRT(); if (state.failed) return;

				}
				break;
			case 117 :
				// Vhdl.g:1:917: EQ
				{
				mEQ(); if (state.failed) return;

				}
				break;
			case 118 :
				// Vhdl.g:1:920: GRT
				{
				mGRT(); if (state.failed) return;

				}
				break;
			case 119 :
				// Vhdl.g:1:924: GRTEQ
				{
				mGRTEQ(); if (state.failed) return;

				}
				break;
			case 120 :
				// Vhdl.g:1:930: EQGRT
				{
				mEQGRT(); if (state.failed) return;

				}
				break;
			case 121 :
				// Vhdl.g:1:936: LBRACK
				{
				mLBRACK(); if (state.failed) return;

				}
				break;
			case 122 :
				// Vhdl.g:1:943: RBRACK
				{
				mRBRACK(); if (state.failed) return;

				}
				break;
			case 123 :
				// Vhdl.g:1:950: USCORE
				{
				mUSCORE(); if (state.failed) return;

				}
				break;
			case 124 :
				// Vhdl.g:1:957: BAR
				{
				mBAR(); if (state.failed) return;

				}
				break;
			case 125 :
				// Vhdl.g:1:961: EXCL
				{
				mEXCL(); if (state.failed) return;

				}
				break;
			case 126 :
				// Vhdl.g:1:966: DOLLAR
				{
				mDOLLAR(); if (state.failed) return;

				}
				break;
			case 127 :
				// Vhdl.g:1:973: PCNT
				{
				mPCNT(); if (state.failed) return;

				}
				break;
			case 128 :
				// Vhdl.g:1:978: AT
				{
				mAT(); if (state.failed) return;

				}
				break;
			case 129 :
				// Vhdl.g:1:981: QMARK
				{
				mQMARK(); if (state.failed) return;

				}
				break;
			case 130 :
				// Vhdl.g:1:987: BSLASH
				{
				mBSLASH(); if (state.failed) return;

				}
				break;
			case 131 :
				// Vhdl.g:1:994: CARET
				{
				mCARET(); if (state.failed) return;

				}
				break;
			case 132 :
				// Vhdl.g:1:1000: BTIC
				{
				mBTIC(); if (state.failed) return;

				}
				break;
			case 133 :
				// Vhdl.g:1:1005: LCURLY
				{
				mLCURLY(); if (state.failed) return;

				}
				break;
			case 134 :
				// Vhdl.g:1:1012: RCURLY
				{
				mRCURLY(); if (state.failed) return;

				}
				break;
			case 135 :
				// Vhdl.g:1:1019: TILDE
				{
				mTILDE(); if (state.failed) return;

				}
				break;
			case 136 :
				// Vhdl.g:1:1025: COLONEQ
				{
				mCOLONEQ(); if (state.failed) return;

				}
				break;
			case 137 :
				// Vhdl.g:1:1033: WS
				{
				mWS(); if (state.failed) return;

				}
				break;
			case 138 :
				// Vhdl.g:1:1036: NEWLINE
				{
				mNEWLINE(); if (state.failed) return;

				}
				break;
			case 139 :
				// Vhdl.g:1:1044: COMMENT
				{
				mCOMMENT(); if (state.failed) return;

				}
				break;
			case 140 :
				// Vhdl.g:1:1052: BASIC_IDENTIFIER
				{
				mBASIC_IDENTIFIER(); if (state.failed) return;

				}
				break;
			case 141 :
				// Vhdl.g:1:1069: BIT_STRING_LITERAL
				{
				mBIT_STRING_LITERAL(); if (state.failed) return;

				}
				break;
			case 142 :
				// Vhdl.g:1:1088: TIC
				{
				mTIC(); if (state.failed) return;

				}
				break;
			case 143 :
				// Vhdl.g:1:1092: TIC_SIMPLE_NAME
				{
				mTIC_SIMPLE_NAME(); if (state.failed) return;

				}
				break;
			case 144 :
				// Vhdl.g:1:1108: CHARACTER_LITERAL
				{
				mCHARACTER_LITERAL(); if (state.failed) return;

				}
				break;
			case 145 :
				// Vhdl.g:1:1126: EXTENDED_IDENTIFIER
				{
				mEXTENDED_IDENTIFIER(); if (state.failed) return;

				}
				break;
			case 146 :
				// Vhdl.g:1:1146: STRING_LITERAL
				{
				mSTRING_LITERAL(); if (state.failed) return;

				}
				break;
			case 147 :
				// Vhdl.g:1:1161: DECIMAL_LITERAL
				{
				mDECIMAL_LITERAL(); if (state.failed) return;

				}
				break;
			case 148 :
				// Vhdl.g:1:1177: BASED_LITERAL
				{
				mBASED_LITERAL(); if (state.failed) return;

				}
				break;

		}
	}

	// $ANTLR start synpred1_Vhdl
	public final void synpred1_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:1482:5: ( '\\'' ( GRAPHIC_CHARACTER )? '\\'' )
		// Vhdl.g:1482:6: '\\'' ( GRAPHIC_CHARACTER )? '\\''
		{
		match('\''); if (state.failed) return;
		// Vhdl.g:1482:11: ( GRAPHIC_CHARACTER )?
		int alt22=2;
		int LA22_0 = input.LA(1);
		if ( (LA22_0=='\'') ) {
			int LA22_1 = input.LA(2);
			if ( (LA22_1=='\'') ) {
				alt22=1;
			}
		}
		else if ( ((LA22_0 >= ' ' && LA22_0 <= '&')||(LA22_0 >= '(' && LA22_0 <= '@')||(LA22_0 >= '[' && LA22_0 <= '~')||(LA22_0 >= '\u00A0' && LA22_0 <= '\u00FF')) ) {
			alt22=1;
		}
		switch (alt22) {
			case 1 :
				// Vhdl.g:
				{
				if ( (input.LA(1) >= ' ' && input.LA(1) <= '@')||(input.LA(1) >= '[' && input.LA(1) <= '~')||(input.LA(1) >= '\u00A0' && input.LA(1) <= '\u00FF') ) {
					input.consume();
					state.failed=false;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return;}
					MismatchedSetException mse = new MismatchedSetException(null,input);
					recover(mse);
					throw mse;
				}
				}
				break;

		}

		match('\''); if (state.failed) return;
		}

	}
	// $ANTLR end synpred1_Vhdl

	// $ANTLR start synpred2_Vhdl
	public final void synpred2_Vhdl_fragment() throws RecognitionException {
		// Vhdl.g:1483:3: ( TIC_SIMPLE_NAME )
		// Vhdl.g:1483:4: TIC_SIMPLE_NAME
		{
		mTIC_SIMPLE_NAME(); if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_Vhdl

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


	protected DFA21 dfa21 = new DFA21(this);
	static final String DFA21_eotS =
		"\1\uffff\24\66\2\uffff\1\177\2\uffff\1\u0082\2\uffff\1\u0084\1\uffff\1"+
		"\u0086\1\u0088\1\uffff\1\u008b\1\u008d\1\u008f\11\uffff\1\u0090\10\uffff"+
		"\1\u0092\1\u0096\14\66\1\uffff\15\66\1\u00b8\1\66\1\u00bc\1\u00bd\11\66"+
		"\1\u00cb\1\u00cc\1\66\1\u00ce\20\66\1\u00e9\12\66\24\uffff\1\u00f7\1\u0095"+
		"\3\uffff\1\u0096\1\uffff\1\u00fb\3\66\1\u00ff\1\u0100\10\66\1\u0109\6"+
		"\66\1\u0112\3\66\1\u0116\4\66\1\uffff\3\66\2\uffff\5\66\1\u0123\1\u0124"+
		"\1\66\1\u0126\1\66\1\u0128\1\u0129\1\66\2\uffff\1\66\1\uffff\1\66\1\u012d"+
		"\11\66\1\u0138\2\66\1\u013b\1\u013c\4\66\1\u0141\1\u0142\1\u0143\1\u0144"+
		"\2\66\1\uffff\5\66\1\u014c\6\66\1\u0153\2\uffff\1\u00f7\2\uffff\3\66\2"+
		"\uffff\6\66\1\u015f\1\66\1\uffff\1\u0161\5\66\1\u0167\1\66\1\uffff\1\66"+
		"\1\u016a\1\u016b\1\uffff\13\66\1\u0177\2\uffff\1\u0178\1\uffff\1\u0179"+
		"\2\uffff\1\u017a\1\u017b\1\66\1\uffff\1\66\1\u017e\3\66\1\u0182\4\66\1"+
		"\uffff\2\66\2\uffff\4\66\4\uffff\1\66\1\u018e\1\66\1\u0190\3\66\1\uffff"+
		"\1\66\1\u0195\1\u0196\1\66\1\u0198\1\u0199\1\uffff\1\u00f7\1\uffff\1\66"+
		"\1\u019b\1\u019c\1\66\1\u019e\2\66\1\u01a1\1\u01a2\1\uffff\1\66\1\uffff"+
		"\5\66\1\uffff\1\u01a9\1\66\2\uffff\2\66\1\u01ae\3\66\1\u01b2\1\u01b3\3"+
		"\66\5\uffff\2\66\1\uffff\3\66\1\uffff\1\u01bd\12\66\1\uffff\1\66\1\uffff"+
		"\1\66\1\u01ca\1\u01cb\1\66\2\uffff\1\u01cd\2\uffff\1\u01ce\2\uffff\1\66"+
		"\1\uffff\1\u01d0\1\66\2\uffff\1\u01d2\4\66\1\u01d7\1\uffff\1\u01d8\3\66"+
		"\1\uffff\1\66\1\u01dd\1\66\2\uffff\3\66\1\u01e2\5\66\1\uffff\1\u01e8\1"+
		"\66\1\u01ea\1\u01eb\1\u01ec\1\u01ed\1\66\1\u01ef\1\u01f0\3\66\2\uffff"+
		"\1\66\2\uffff\1\66\1\uffff\1\66\1\uffff\4\66\2\uffff\2\66\1\u01fd\1\u01fe"+
		"\1\uffff\1\66\1\u0200\1\u0201\1\u0202\1\uffff\1\u0203\2\66\1\u0206\1\66"+
		"\1\uffff\1\66\4\uffff\1\66\2\uffff\1\u020a\7\66\1\u0212\1\66\1\u0214\1"+
		"\u0215\2\uffff\1\u0216\4\uffff\2\66\1\uffff\1\66\1\u021a\1\u021b\1\uffff"+
		"\2\66\1\u021e\1\66\1\u0220\1\u0221\1\66\1\uffff\1\66\3\uffff\1\u0224\1"+
		"\u0225\1\u0226\2\uffff\1\u0227\1\66\1\uffff\1\66\2\uffff\1\66\1\u022b"+
		"\4\uffff\1\u022c\2\66\2\uffff\1\u022f\1\66\1\uffff\1\u0231\1\uffff";
	static final String DFA21_eofS =
		"\u0232\uffff";
	static final String DFA21_minS =
		"\1\11\1\142\1\42\1\141\1\151\1\154\1\151\1\145\1\146\3\141\1\42\2\141"+
		"\1\145\1\150\1\156\2\141\1\42\2\uffff\1\40\2\uffff\1\52\2\uffff\1\55\1"+
		"\uffff\2\75\1\uffff\1\75\1\76\1\75\11\uffff\1\40\10\uffff\1\40\1\43\1"+
		"\163\1\143\1\164\1\151\1\144\1\143\1\163\1\164\1\147\1\157\1\144\1\146"+
		"\1\uffff\1\163\1\155\1\163\1\167\1\163\1\144\1\151\1\154\1\162\2\156\1"+
		"\157\1\141\1\60\1\160\2\60\2\142\1\157\1\160\1\144\1\156\1\167\1\162\1"+
		"\154\2\60\1\145\1\60\1\150\1\164\1\143\1\162\1\157\1\162\1\156\1\143\2"+
		"\154\1\141\1\147\2\141\1\142\1\145\1\60\1\141\1\160\1\141\1\145\1\162"+
		"\1\151\1\145\1\164\1\157\1\162\24\uffff\1\47\1\134\2\uffff\1\60\1\43\1"+
		"\uffff\1\60\2\145\1\141\2\60\1\150\1\141\1\145\1\162\1\151\1\143\1\171"+
		"\1\146\1\60\1\145\1\160\1\146\1\143\1\156\1\145\1\60\1\151\1\164\1\145"+
		"\1\60\1\143\1\145\1\165\1\162\1\uffff\1\165\1\162\1\165\2\uffff\1\145"+
		"\1\162\1\153\1\145\1\160\2\60\1\144\1\60\1\164\2\60\1\154\2\uffff\1\156"+
		"\1\uffff\1\145\1\60\1\153\2\164\1\143\1\145\1\147\1\157\1\151\1\145\1"+
		"\60\1\157\1\165\2\60\2\145\1\162\1\156\4\60\1\164\1\156\1\uffff\1\156"+
		"\1\145\1\146\1\164\1\151\1\60\1\151\1\164\1\156\1\154\1\150\1\162\1\60"+
		"\1\uffff\2\60\1\40\1\uffff\1\163\1\162\1\163\2\uffff\1\151\1\171\1\162"+
		"\1\151\1\156\1\153\1\60\1\145\1\uffff\1\60\1\157\1\151\1\164\1\157\1\164"+
		"\1\60\1\146\1\uffff\1\164\2\60\1\uffff\1\164\1\162\1\160\1\144\1\162\2"+
		"\164\1\154\2\141\1\162\1\60\2\uffff\1\60\1\uffff\1\60\2\uffff\2\60\1\162"+
		"\1\uffff\1\141\1\60\1\160\2\145\1\60\1\145\1\162\1\163\1\143\1\uffff\2"+
		"\162\2\uffff\1\143\1\162\1\145\1\141\4\uffff\1\171\1\60\1\163\1\60\1\146"+
		"\1\163\1\154\1\uffff\1\141\2\60\1\145\2\60\1\uffff\2\40\1\163\2\60\1\164"+
		"\1\60\1\164\1\142\2\60\1\uffff\1\162\1\uffff\1\156\1\147\1\141\1\156\1"+
		"\157\1\uffff\1\60\1\171\2\uffff\1\151\1\141\1\60\2\145\1\151\2\60\1\162"+
		"\1\147\1\141\5\uffff\1\163\1\147\1\uffff\1\157\1\144\1\143\1\uffff\1\60"+
		"\1\144\3\164\1\156\1\164\1\151\1\144\1\154\1\160\1\uffff\1\160\1\uffff"+
		"\1\145\2\60\1\142\2\uffff\1\60\2\uffff\1\60\2\uffff\1\145\1\uffff\1\60"+
		"\1\165\2\uffff\1\60\1\145\1\165\2\156\1\60\1\uffff\1\60\1\157\1\164\1"+
		"\143\1\uffff\1\144\1\60\1\141\2\uffff\1\171\1\145\1\154\1\60\1\145\1\156"+
		"\1\165\1\163\1\164\1\uffff\1\60\1\145\4\60\1\164\2\60\1\145\1\157\1\143"+
		"\2\uffff\1\154\2\uffff\1\143\1\uffff\1\164\1\uffff\1\156\1\162\1\164\1"+
		"\145\2\uffff\1\156\1\145\2\60\1\uffff\1\154\3\60\1\uffff\1\60\1\145\1"+
		"\162\1\60\1\145\1\uffff\1\162\4\uffff\1\171\2\uffff\1\60\1\162\1\164\1"+
		"\145\1\164\1\145\1\164\1\141\1\60\1\143\2\60\2\uffff\1\60\4\uffff\1\144"+
		"\1\145\1\uffff\1\144\2\60\1\uffff\1\164\1\145\1\60\1\165\2\60\1\164\1"+
		"\uffff\1\164\3\uffff\3\60\2\uffff\1\60\1\144\1\uffff\1\162\2\uffff\1\151"+
		"\1\60\4\uffff\1\60\1\145\1\157\2\uffff\1\60\1\156\1\uffff\1\60\1\uffff";
	static final String DFA21_maxS =
		"\1\176\1\164\1\165\2\157\1\170\2\165\1\163\2\157\3\165\1\157\1\165\1\171"+
		"\1\163\1\141\1\151\1\157\2\uffff\1\u00ff\2\uffff\1\52\2\uffff\1\55\1\uffff"+
		"\2\75\1\uffff\2\76\1\75\11\uffff\1\u00ff\10\uffff\1\u00ff\1\137\1\163"+
		"\1\143\1\164\1\154\1\144\1\162\1\163\1\164\1\147\1\157\1\144\1\163\1\uffff"+
		"\1\163\1\156\1\163\1\167\1\163\1\164\1\151\1\154\1\162\2\156\1\157\1\141"+
		"\1\172\1\160\2\172\1\142\1\164\1\157\1\160\1\144\1\156\1\170\1\164\1\154"+
		"\2\172\1\145\1\172\1\150\1\164\1\143\1\163\1\157\1\162\1\156\1\164\1\162"+
		"\1\166\1\141\1\147\2\154\1\142\1\145\1\172\1\141\1\160\1\164\1\145\1\162"+
		"\2\151\1\164\1\157\1\162\24\uffff\1\172\1\134\2\uffff\1\71\1\137\1\uffff"+
		"\1\172\2\145\1\141\2\172\1\150\1\141\1\145\1\162\1\151\1\143\1\171\1\146"+
		"\1\172\1\145\1\160\1\163\1\143\1\156\1\151\1\172\1\151\1\164\1\145\1\172"+
		"\1\143\1\145\1\165\1\162\1\uffff\1\165\1\162\1\165\2\uffff\1\145\1\162"+
		"\1\153\1\145\1\160\2\172\1\144\1\172\1\164\2\172\1\154\2\uffff\1\156\1"+
		"\uffff\1\145\1\172\1\153\3\164\1\145\1\147\1\157\1\151\1\145\1\172\1\157"+
		"\1\165\2\172\2\145\1\162\1\156\4\172\1\164\1\156\1\uffff\1\156\1\145\1"+
		"\146\1\164\1\151\1\172\1\151\1\164\1\156\1\154\1\150\1\162\1\172\1\uffff"+
		"\2\172\1\u00ff\1\uffff\1\163\1\162\1\163\2\uffff\1\151\1\171\1\162\1\151"+
		"\1\156\1\153\1\172\1\145\1\uffff\1\172\1\157\1\151\1\164\1\157\1\164\1"+
		"\172\1\146\1\uffff\1\164\2\172\1\uffff\1\164\1\162\1\160\1\144\1\162\2"+
		"\164\1\154\2\141\1\162\1\172\2\uffff\1\172\1\uffff\1\172\2\uffff\2\172"+
		"\1\162\1\uffff\1\141\1\172\1\160\2\145\1\172\1\145\1\162\1\163\1\143\1"+
		"\uffff\2\162\2\uffff\1\143\1\162\1\145\1\141\4\uffff\1\171\1\172\1\163"+
		"\1\172\1\146\1\163\1\154\1\uffff\1\141\2\172\1\145\2\172\1\uffff\2\u00ff"+
		"\1\163\2\172\1\164\1\172\1\164\1\142\2\172\1\uffff\1\162\1\uffff\1\156"+
		"\1\147\1\141\1\156\1\157\1\uffff\1\172\1\171\2\uffff\2\151\1\172\2\145"+
		"\1\151\2\172\1\162\1\147\1\141\5\uffff\1\163\1\147\1\uffff\1\157\1\163"+
		"\1\143\1\uffff\1\172\1\144\3\164\1\156\1\164\1\151\1\144\1\154\1\160\1"+
		"\uffff\1\160\1\uffff\1\145\2\172\1\142\2\uffff\1\172\2\uffff\1\172\2\uffff"+
		"\1\145\1\uffff\1\172\1\165\2\uffff\1\172\1\145\1\165\2\156\1\172\1\uffff"+
		"\1\172\1\157\1\164\1\143\1\uffff\1\144\1\172\1\141\2\uffff\1\171\1\145"+
		"\1\154\1\172\1\145\1\156\1\165\1\163\1\164\1\uffff\1\172\1\145\4\172\1"+
		"\164\2\172\1\145\1\157\1\143\2\uffff\1\154\2\uffff\1\143\1\uffff\1\164"+
		"\1\uffff\1\156\1\162\1\164\1\145\2\uffff\1\156\1\145\2\172\1\uffff\1\154"+
		"\3\172\1\uffff\1\172\1\145\1\162\1\172\1\145\1\uffff\1\162\4\uffff\1\171"+
		"\2\uffff\1\172\1\162\1\164\1\145\1\164\1\145\1\164\1\141\1\172\1\143\2"+
		"\172\2\uffff\1\172\4\uffff\1\144\1\145\1\uffff\1\144\2\172\1\uffff\1\164"+
		"\1\145\1\172\1\165\2\172\1\164\1\uffff\1\164\3\uffff\3\172\2\uffff\1\172"+
		"\1\144\1\uffff\1\162\2\uffff\1\151\1\172\4\uffff\1\172\1\145\1\157\2\uffff"+
		"\1\172\1\156\1\uffff\1\172\1\uffff";
	static final String DFA21_acceptS =
		"\25\uffff\1\143\1\144\1\uffff\1\146\1\147\1\uffff\1\152\1\153\1\uffff"+
		"\1\155\2\uffff\1\161\3\uffff\1\171\1\172\1\173\1\174\1\175\1\176\1\177"+
		"\1\u0080\1\u0081\1\uffff\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087\1\u0089"+
		"\1\u008a\1\u008c\16\uffff\1\u008d\71\uffff\1\145\1\u0092\1\151\1\150\1"+
		"\u008b\1\154\1\157\1\156\1\u0088\1\160\1\163\1\164\1\162\1\170\1\165\1"+
		"\167\1\166\1\u0082\1\u0091\1\u008e\2\uffff\1\u0090\1\u0093\2\uffff\1\u0094"+
		"\36\uffff\1\42\3\uffff\1\44\1\47\15\uffff\1\65\1\66\1\uffff\1\70\32\uffff"+
		"\1\125\15\uffff\1\u008f\3\uffff\1\1\3\uffff\1\5\1\6\10\uffff\1\17\10\uffff"+
		"\1\30\3\uffff\1\34\14\uffff\1\55\1\56\1\uffff\1\60\1\uffff\1\62\1\63\3"+
		"\uffff\1\72\12\uffff\1\106\2\uffff\1\111\1\112\4\uffff\1\117\1\120\1\121"+
		"\1\122\7\uffff\1\133\6\uffff\1\142\13\uffff\1\15\1\uffff\1\20\5\uffff"+
		"\1\26\2\uffff\1\32\1\33\13\uffff\1\54\1\57\1\61\1\64\1\67\2\uffff\1\74"+
		"\3\uffff\1\101\13\uffff\1\124\1\uffff\1\127\4\uffff\1\135\1\136\1\uffff"+
		"\1\140\1\141\1\uffff\1\3\1\4\1\uffff\1\10\2\uffff\1\13\1\14\6\uffff\1"+
		"\27\4\uffff\1\40\3\uffff\1\46\1\50\11\uffff\1\102\14\uffff\1\131\1\132"+
		"\1\uffff\1\137\1\2\1\uffff\1\11\1\uffff\1\16\4\uffff\1\25\1\31\4\uffff"+
		"\1\43\4\uffff\1\71\5\uffff\1\103\1\uffff\1\105\1\107\1\110\1\113\1\uffff"+
		"\1\115\1\116\14\uffff\1\37\1\41\1\uffff\1\51\1\52\1\53\1\73\2\uffff\1"+
		"\77\3\uffff\1\123\7\uffff\1\23\1\uffff\1\35\1\36\1\45\3\uffff\1\104\1"+
		"\114\2\uffff\1\134\1\uffff\1\12\1\21\2\uffff\1\75\1\76\1\100\1\126\3\uffff"+
		"\1\24\1\130\2\uffff\1\7\1\uffff\1\22";
	static final String DFA21_specialS =
		"\u0232\uffff}>";
	static final String[] DFA21_transitionS = {
			"\1\64\1\65\2\uffff\1\64\22\uffff\1\64\1\51\1\27\1\30\1\52\1\53\1\31\1"+
			"\67\1\25\1\26\1\32\1\33\1\34\1\35\1\36\1\37\12\70\1\40\1\41\1\42\1\43"+
			"\1\44\1\55\1\54\32\uffff\1\45\1\56\1\46\1\57\1\47\1\60\1\1\1\2\1\3\1"+
			"\4\1\5\1\6\1\7\1\66\1\10\2\66\1\11\1\12\1\13\1\14\1\15\1\66\1\16\1\17"+
			"\1\20\1\21\1\22\1\23\1\24\2\66\1\61\1\50\1\62\1\63",
			"\1\71\1\72\2\uffff\1\73\5\uffff\1\74\1\uffff\1\75\3\uffff\1\76\1\77"+
			"\1\100",
			"\1\105\102\uffff\1\101\6\uffff\1\102\2\uffff\1\103\5\uffff\1\104",
			"\1\106\15\uffff\1\107",
			"\1\110\5\uffff\1\111",
			"\1\112\1\uffff\1\113\11\uffff\1\114",
			"\1\115\5\uffff\1\116\5\uffff\1\117",
			"\1\120\14\uffff\1\121\2\uffff\1\122",
			"\1\123\6\uffff\1\124\1\125\4\uffff\1\126",
			"\1\127\7\uffff\1\130\5\uffff\1\131",
			"\1\132\15\uffff\1\133",
			"\1\134\3\uffff\1\135\11\uffff\1\136\5\uffff\1\137",
			"\1\105\103\uffff\1\140\7\uffff\1\141\1\uffff\1\142\1\uffff\1\143\1\uffff"+
			"\1\144\1\145",
			"\1\146\15\uffff\1\147\2\uffff\1\150\2\uffff\1\151",
			"\1\152\3\uffff\1\153\11\uffff\1\154",
			"\1\155\2\uffff\1\156\1\157\2\uffff\1\160\5\uffff\1\161\2\uffff\1\162",
			"\1\163\6\uffff\1\164\2\uffff\1\165\6\uffff\1\166",
			"\1\167\4\uffff\1\170",
			"\1\171",
			"\1\172\6\uffff\1\173\1\174",
			"\1\105\113\uffff\1\175\1\176",
			"",
			"",
			"\41\u0080\32\uffff\44\u0080\41\uffff\140\u0080",
			"",
			"",
			"\1\u0081",
			"",
			"",
			"\1\u0083",
			"",
			"\1\u0085",
			"\1\u0087",
			"",
			"\1\u0089\1\u008a",
			"\1\u008c",
			"\1\u008e",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\41\u0091\32\uffff\44\u0091\41\uffff\140\u0091",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\7\u0095\1\u0094\31\u0095\32\uffff\6\u0095\32\u0093\4\u0095\41\uffff"+
			"\140\u0095",
			"\1\u0099\14\uffff\12\u0098\45\uffff\1\u0097",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d\2\uffff\1\u009e",
			"\1\u009f",
			"\1\u00a0\16\uffff\1\u00a1",
			"\1\u00a2",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"\1\u00a7\14\uffff\1\u00a8",
			"",
			"\1\u00a9",
			"\1\u00aa\1\u00ab",
			"\1\u00ac",
			"\1\u00ad",
			"\1\u00ae",
			"\1\u00af\17\uffff\1\u00b0",
			"\1\u00b1",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"\1\u00b6",
			"\1\u00b7",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u00b9",
			"\12\66\45\uffff\1\66\1\uffff\4\66\1\u00ba\11\66\1\u00bb\13\66",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u00be",
			"\1\u00bf\13\uffff\1\u00c0\5\uffff\1\u00c1",
			"\1\u00c2",
			"\1\u00c3",
			"\1\u00c4",
			"\1\u00c5",
			"\1\u00c6\1\u00c7",
			"\1\u00c8\1\uffff\1\u00c9",
			"\1\u00ca",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u00cd",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u00cf",
			"\1\u00d0",
			"\1\u00d1",
			"\1\u00d2\1\u00d3",
			"\1\u00d4",
			"\1\u00d5",
			"\1\u00d6",
			"\1\u00d7\3\uffff\1\u00d8\2\uffff\1\u00d9\2\uffff\1\u00da\2\uffff\1\u00db"+
			"\3\uffff\1\u00dc",
			"\1\u00dd\5\uffff\1\u00de",
			"\1\u00df\11\uffff\1\u00e0",
			"\1\u00e1",
			"\1\u00e2",
			"\1\u00e3\12\uffff\1\u00e4",
			"\1\u00e5\12\uffff\1\u00e6",
			"\1\u00e7",
			"\1\u00e8",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u00ea",
			"\1\u00eb",
			"\1\u00ec\7\uffff\1\u00ed\12\uffff\1\u00ee",
			"\1\u00ef",
			"\1\u00f0",
			"\1\u00f1",
			"\1\u00f2\3\uffff\1\u00f3",
			"\1\u00f4",
			"\1\u00f5",
			"\1\u00f6",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0095\10\uffff\12\u00f9\45\uffff\1\u00f8\1\uffff\32\u00f9",
			"\1\u00fa",
			"",
			"",
			"\12\u0098",
			"\1\u0099\14\uffff\12\u0098\45\uffff\1\u0097",
			"",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u00fc",
			"\1\u00fd",
			"\1\u00fe",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u0101",
			"\1\u0102",
			"\1\u0103",
			"\1\u0104",
			"\1\u0105",
			"\1\u0106",
			"\1\u0107",
			"\1\u0108",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u010a",
			"\1\u010b",
			"\1\u010c\14\uffff\1\u010d",
			"\1\u010e",
			"\1\u010f",
			"\1\u0110\3\uffff\1\u0111",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u0113",
			"\1\u0114",
			"\1\u0115",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u0117",
			"\1\u0118",
			"\1\u0119",
			"\1\u011a",
			"",
			"\1\u011b",
			"\1\u011c",
			"\1\u011d",
			"",
			"",
			"\1\u011e",
			"\1\u011f",
			"\1\u0120",
			"\1\u0121",
			"\1\u0122",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u0125",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u0127",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u012a",
			"",
			"",
			"\1\u012b",
			"",
			"\1\u012c",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u012e",
			"\1\u012f",
			"\1\u0130",
			"\1\u0131\20\uffff\1\u0132",
			"\1\u0133",
			"\1\u0134",
			"\1\u0135",
			"\1\u0136",
			"\1\u0137",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u0139",
			"\1\u013a",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u013d",
			"\1\u013e",
			"\1\u013f",
			"\1\u0140",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u0145",
			"\1\u0146",
			"",
			"\1\u0147",
			"\1\u0148",
			"\1\u0149",
			"\1\u014a",
			"\1\u014b",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u014d",
			"\1\u014e",
			"\1\u014f",
			"\1\u0150",
			"\1\u0151",
			"\1\u0152",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"",
			"\12\u00f9\47\uffff\32\u00f9",
			"\12\u00f9\45\uffff\1\u00f8\1\uffff\32\u00f9",
			"\41\u0155\32\uffff\1\u0155\1\u0154\42\u0155\41\uffff\140\u0155",
			"",
			"\1\u0156",
			"\1\u0157",
			"\1\u0158",
			"",
			"",
			"\1\u0159",
			"\1\u015a",
			"\1\u015b",
			"\1\u015c",
			"\1\u015d",
			"\1\u015e",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u0160",
			"",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u0162",
			"\1\u0163",
			"\1\u0164",
			"\1\u0165",
			"\1\u0166",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u0168",
			"",
			"\1\u0169",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"",
			"\1\u016c",
			"\1\u016d",
			"\1\u016e",
			"\1\u016f",
			"\1\u0170",
			"\1\u0171",
			"\1\u0172",
			"\1\u0173",
			"\1\u0174",
			"\1\u0175",
			"\1\u0176",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"",
			"",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"",
			"",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u017c",
			"",
			"\1\u017d",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u017f",
			"\1\u0180",
			"\1\u0181",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u0183",
			"\1\u0184",
			"\1\u0185",
			"\1\u0186",
			"",
			"\1\u0187",
			"\1\u0188",
			"",
			"",
			"\1\u0189",
			"\1\u018a",
			"\1\u018b",
			"\1\u018c",
			"",
			"",
			"",
			"",
			"\1\u018d",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u018f",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u0191",
			"\1\u0192",
			"\1\u0193",
			"",
			"\1\u0194",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u0197",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"",
			"\41\u0155\32\uffff\1\u0155\1\u0154\42\u0155\41\uffff\140\u0155",
			"\41\u0155\32\uffff\1\u0155\1\u0154\42\u0155\41\uffff\140\u0155",
			"\1\u019a",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u019d",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u019f",
			"\1\u01a0",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"",
			"\1\u01a3",
			"",
			"\1\u01a4",
			"\1\u01a5",
			"\1\u01a6",
			"\1\u01a7",
			"\1\u01a8",
			"",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u01aa",
			"",
			"",
			"\1\u01ab",
			"\1\u01ac\7\uffff\1\u01ad",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u01af",
			"\1\u01b0",
			"\1\u01b1",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u01b4",
			"\1\u01b5",
			"\1\u01b6",
			"",
			"",
			"",
			"",
			"",
			"\1\u01b7",
			"\1\u01b8",
			"",
			"\1\u01b9",
			"\1\u01ba\16\uffff\1\u01bb",
			"\1\u01bc",
			"",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u01be",
			"\1\u01bf",
			"\1\u01c0",
			"\1\u01c1",
			"\1\u01c2",
			"\1\u01c3",
			"\1\u01c4",
			"\1\u01c5",
			"\1\u01c6",
			"\1\u01c7",
			"",
			"\1\u01c8",
			"",
			"\1\u01c9",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u01cc",
			"",
			"",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"",
			"",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"",
			"",
			"\1\u01cf",
			"",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u01d1",
			"",
			"",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u01d3",
			"\1\u01d4",
			"\1\u01d5",
			"\1\u01d6",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u01d9",
			"\1\u01da",
			"\1\u01db",
			"",
			"\1\u01dc",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u01de",
			"",
			"",
			"\1\u01df",
			"\1\u01e0",
			"\1\u01e1",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u01e3",
			"\1\u01e4",
			"\1\u01e5",
			"\1\u01e6",
			"\1\u01e7",
			"",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u01e9",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u01ee",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u01f1",
			"\1\u01f2",
			"\1\u01f3",
			"",
			"",
			"\1\u01f4",
			"",
			"",
			"\1\u01f5",
			"",
			"\1\u01f6",
			"",
			"\1\u01f7",
			"\1\u01f8",
			"\1\u01f9",
			"\1\u01fa",
			"",
			"",
			"\1\u01fb",
			"\1\u01fc",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"",
			"\1\u01ff",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u0204",
			"\1\u0205",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u0207",
			"",
			"\1\u0208",
			"",
			"",
			"",
			"",
			"\1\u0209",
			"",
			"",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u020b",
			"\1\u020c",
			"\1\u020d",
			"\1\u020e",
			"\1\u020f",
			"\1\u0210",
			"\1\u0211",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u0213",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"",
			"",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"",
			"",
			"",
			"",
			"\1\u0217",
			"\1\u0218",
			"",
			"\1\u0219",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"",
			"\1\u021c",
			"\1\u021d",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u021f",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u0222",
			"",
			"\1\u0223",
			"",
			"",
			"",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"",
			"",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u0228",
			"",
			"\1\u0229",
			"",
			"",
			"\1\u022a",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"",
			"",
			"",
			"",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u022d",
			"\1\u022e",
			"",
			"",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			"\1\u0230",
			"",
			"\12\66\45\uffff\1\66\1\uffff\32\66",
			""
	};

	static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
	static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
	static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
	static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
	static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
	static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
	static final short[][] DFA21_transition;

	static {
		int numStates = DFA21_transitionS.length;
		DFA21_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
		}
	}

	protected class DFA21 extends DFA {

		public DFA21(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 21;
			this.eot = DFA21_eot;
			this.eof = DFA21_eof;
			this.min = DFA21_min;
			this.max = DFA21_max;
			this.accept = DFA21_accept;
			this.special = DFA21_special;
			this.transition = DFA21_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( K_ABS | K_ACCESS | K_AFTER | K_ALIAS | K_ALL | K_AND | K_ARCHITECTURE | K_ARRAY | K_ASSERT | K_ATTRIBUTE | K_BEGIN | K_BLOCK | K_BODY | K_BUFFER | K_BUS | K_CASE | K_COMPONENT | K_CONFIGURATION | K_CONSTANT | K_DISCONNECT | K_DOWNTO | K_ELSE | K_ELSIF | K_END | K_ENTITY | K_EXIT | K_FILE | K_FOR | K_FUNCTION | K_GENERATE | K_GENERIC | K_GROUP | K_GUARDED | K_IF | K_IMPURE | K_IN | K_INERTIAL | K_INOUT | K_IS | K_LABEL | K_LIBRARY | K_LINKAGE | K_LITERAL | K_LOOP | K_MAP | K_MOD | K_NAND | K_NEW | K_NEXT | K_NOR | K_NOT | K_NULL | K_OF | K_ON | K_OPEN | K_OR | K_OTHERS | K_OUT | K_PACKAGE | K_PORT | K_POSTPONED | K_PROCEDURE | K_PROCESS | K_PROTECTED | K_PURE | K_RANGE | K_RECORD | K_REGISTER | K_REJECT | K_REM | K_REPORT | K_RETURN | K_ROL | K_ROR | K_SELECT | K_SEVERITY | K_SHARED | K_SIGNAL | K_SLA | K_SLL | K_SRA | K_SRL | K_SUBTYPE | K_THEN | K_TO | K_TRANSPORT | K_TYPE | K_UNAFFECTED | K_UNITS | K_UNTIL | K_USE | K_VARIABLE | K_WAIT | K_WHEN | K_WHILE | K_WITH | K_XNOR | K_XOR | LPAREN | RPAREN | QUOTE | POUND | AND | STAR | STAR2 | PLUS | COMMA | MINUS | DOT | SLASH | SLASHEQ | COLON | SEMI | LST | LSTEQ | LSTGRT | EQ | GRT | GRTEQ | EQGRT | LBRACK | RBRACK | USCORE | BAR | EXCL | DOLLAR | PCNT | AT | QMARK | BSLASH | CARET | BTIC | LCURLY | RCURLY | TILDE | COLONEQ | WS | NEWLINE | COMMENT | BASIC_IDENTIFIER | BIT_STRING_LITERAL | TIC | TIC_SIMPLE_NAME | CHARACTER_LITERAL | EXTENDED_IDENTIFIER | STRING_LITERAL | DECIMAL_LITERAL | BASED_LITERAL );";
		}
	}

}
