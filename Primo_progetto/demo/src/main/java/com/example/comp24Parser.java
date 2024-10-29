// Generated from c:/Users/Giuseppe/Desktop/Practica y Construccion de Compiladores/Primo_progetto/demo/src/main/java/com/example/comp24.g4 by ANTLR 4.13.1

package com.example;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class comp24Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FOR=1, IF=2, ELSE=3, WHILE=4, RETURN=5, INT=6, DOUBLE=7, CHAR=8, VOID=9, 
		COMA=10, PA=11, PC=12, LLA=13, LLC=14, ASIGN=15, PYC=16, SUMA=17, RESTA=18, 
		MULT=19, DIV=20, MOD=21, AND=22, OR=23, NOT=24, NUMERO=25, ID=26, OPERADOR_UNARIO=27, 
		OPERADOR_BINARIO=28, COMPARACION=29, WS=30, COMENTARIO=31;
	public static final int
		RULE_programa = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_bloque = 3, 
		RULE_tdato = 4, RULE_opales = 5, RULE_opal = 6, RULE_or_expr = 7, RULE_o = 8, 
		RULE_and_expr = 9, RULE_a = 10, RULE_not_expr = 11, RULE_comp = 12, RULE_exp = 13, 
		RULE_e = 14, RULE_term = 15, RULE_t = 16, RULE_factor = 17, RULE_if_instruccion = 18, 
		RULE_else_instruccion = 19, RULE_while = 20, RULE_for = 21, RULE_acciones_iniciales = 22, 
		RULE_accion_inicial = 23, RULE_acciones_siempre = 24, RULE_accion_siempre = 25, 
		RULE_acciones_post = 26, RULE_accion_post = 27, RULE_declaracion = 28, 
		RULE_inicializacion = 29, RULE_list_decl = 30, RULE_asignacion = 31, RULE_list_asign = 32, 
		RULE_funcion_prototipo = 33, RULE_funcion_definicion = 34, RULE_argumentos = 35, 
		RULE_argumento = 36, RULE_funcion_llamada = 37, RULE_func_llamada = 38, 
		RULE_parametros = 39, RULE_parametro = 40, RULE_return = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucciones", "instruccion", "bloque", "tdato", "opales", 
			"opal", "or_expr", "o", "and_expr", "a", "not_expr", "comp", "exp", "e", 
			"term", "t", "factor", "if_instruccion", "else_instruccion", "while", 
			"for", "acciones_iniciales", "accion_inicial", "acciones_siempre", "accion_siempre", 
			"acciones_post", "accion_post", "declaracion", "inicializacion", "list_decl", 
			"asignacion", "list_asign", "funcion_prototipo", "funcion_definicion", 
			"argumentos", "argumento", "funcion_llamada", "func_llamada", "parametros", 
			"parametro", "return"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'for'", "'if'", "'else'", "'while'", "'return'", "'int'", "'double'", 
			"'char'", "'void'", "','", "'('", "')'", "'{'", "'}'", "'='", "';'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FOR", "IF", "ELSE", "WHILE", "RETURN", "INT", "DOUBLE", "CHAR", 
			"VOID", "COMA", "PA", "PC", "LLA", "LLC", "ASIGN", "PYC", "SUMA", "RESTA", 
			"MULT", "DIV", "MOD", "AND", "OR", "NOT", "NUMERO", "ID", "OPERADOR_UNARIO", 
			"OPERADOR_BINARIO", "COMPARACION", "WS", "COMENTARIO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "comp24.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public comp24Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(comp24Parser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			instrucciones();
			setState(85);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionesContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
			case IF:
			case WHILE:
			case RETURN:
			case INT:
			case DOUBLE:
			case CHAR:
			case VOID:
			case PA:
			case LLA:
			case RESTA:
			case NOT:
			case NUMERO:
			case ID:
			case OPERADOR_UNARIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				instruccion();
				setState(88);
				instrucciones();
				}
				break;
			case EOF:
			case LLC:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public TerminalNode PYC() { return getToken(comp24Parser.PYC, 0); }
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public Funcion_prototipoContext funcion_prototipo() {
			return getRuleContext(Funcion_prototipoContext.class,0);
		}
		public Funcion_definicionContext funcion_definicion() {
			return getRuleContext(Funcion_definicionContext.class,0);
		}
		public Funcion_llamadaContext funcion_llamada() {
			return getRuleContext(Funcion_llamadaContext.class,0);
		}
		public If_instruccionContext if_instruccion() {
			return getRuleContext(If_instruccionContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				declaracion();
				setState(94);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				while_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				bloque();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				asignacion();
				setState(99);
				match(PYC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				funcion_prototipo();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
				funcion_definicion();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(103);
				funcion_llamada();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(104);
				if_instruccion();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(105);
				for_();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(106);
				exp();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(107);
				opal();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(108);
				return_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LLA() { return getToken(comp24Parser.LLA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LLC() { return getToken(comp24Parser.LLC, 0); }
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(LLA);
			setState(112);
			instrucciones();
			setState(113);
			match(LLC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TdatoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(comp24Parser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(comp24Parser.DOUBLE, 0); }
		public TerminalNode CHAR() { return getToken(comp24Parser.CHAR, 0); }
		public TerminalNode VOID() { return getToken(comp24Parser.VOID, 0); }
		public TdatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tdato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterTdato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitTdato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitTdato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TdatoContext tdato() throws RecognitionException {
		TdatoContext _localctx = new TdatoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tdato);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpalesContext extends ParserRuleContext {
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public TerminalNode COMA() { return getToken(comp24Parser.COMA, 0); }
		public OpalesContext opales() {
			return getRuleContext(OpalesContext.class,0);
		}
		public OpalesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opales; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterOpales(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitOpales(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitOpales(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpalesContext opales() throws RecognitionException {
		OpalesContext _localctx = new OpalesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_opales);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				opal();
				setState(118);
				match(COMA);
				setState(119);
				opales();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				opal();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpalContext extends ParserRuleContext {
		public Or_exprContext or_expr() {
			return getRuleContext(Or_exprContext.class,0);
		}
		public OpalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterOpal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitOpal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitOpal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpalContext opal() throws RecognitionException {
		OpalContext _localctx = new OpalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_opal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			or_expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Or_exprContext extends ParserRuleContext {
		public And_exprContext and_expr() {
			return getRuleContext(And_exprContext.class,0);
		}
		public OContext o() {
			return getRuleContext(OContext.class,0);
		}
		public Or_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterOr_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitOr_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitOr_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_exprContext or_expr() throws RecognitionException {
		Or_exprContext _localctx = new Or_exprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_or_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			and_expr();
			setState(127);
			o();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(comp24Parser.OR, 0); }
		public And_exprContext and_expr() {
			return getRuleContext(And_exprContext.class,0);
		}
		public OContext o() {
			return getRuleContext(OContext.class,0);
		}
		public OContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_o; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitO(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitO(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OContext o() throws RecognitionException {
		OContext _localctx = new OContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_o);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(OR);
				setState(130);
				and_expr();
				setState(131);
				o();
				}
				break;
			case EOF:
			case FOR:
			case IF:
			case ELSE:
			case WHILE:
			case RETURN:
			case INT:
			case DOUBLE:
			case CHAR:
			case VOID:
			case COMA:
			case PA:
			case PC:
			case LLA:
			case LLC:
			case PYC:
			case RESTA:
			case NOT:
			case NUMERO:
			case ID:
			case OPERADOR_UNARIO:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class And_exprContext extends ParserRuleContext {
		public Not_exprContext not_expr() {
			return getRuleContext(Not_exprContext.class,0);
		}
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public And_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterAnd_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitAnd_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitAnd_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_exprContext and_expr() throws RecognitionException {
		And_exprContext _localctx = new And_exprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_and_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			not_expr();
			setState(137);
			a();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(comp24Parser.AND, 0); }
		public Not_exprContext not_expr() {
			return getRuleContext(Not_exprContext.class,0);
		}
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_a);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(AND);
				setState(140);
				not_expr();
				setState(141);
				a();
				}
				break;
			case EOF:
			case FOR:
			case IF:
			case ELSE:
			case WHILE:
			case RETURN:
			case INT:
			case DOUBLE:
			case CHAR:
			case VOID:
			case COMA:
			case PA:
			case PC:
			case LLA:
			case LLC:
			case PYC:
			case RESTA:
			case OR:
			case NOT:
			case NUMERO:
			case ID:
			case OPERADOR_UNARIO:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Not_exprContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(comp24Parser.NOT, 0); }
		public Not_exprContext not_expr() {
			return getRuleContext(Not_exprContext.class,0);
		}
		public TerminalNode PA() { return getToken(comp24Parser.PA, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public TerminalNode PC() { return getToken(comp24Parser.PC, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public Not_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterNot_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitNot_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitNot_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_exprContext not_expr() throws RecognitionException {
		Not_exprContext _localctx = new Not_exprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_not_expr);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(NOT);
				setState(147);
				not_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(PA);
				setState(149);
				opal();
				setState(150);
				match(PC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				comp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode COMPARACION() { return getToken(comp24Parser.COMPARACION, 0); }
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			exp();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMPARACION) {
				{
				setState(156);
				match(COMPARACION);
				setState(157);
				exp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			term();
			setState(161);
			e();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(comp24Parser.SUMA, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode RESTA() { return getToken(comp24Parser.RESTA, 0); }
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_e);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(SUMA);
				setState(164);
				term();
				setState(165);
				e();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(RESTA);
				setState(168);
				term();
				setState(169);
				e();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			factor();
			setState(175);
			t();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(comp24Parser.MULT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TerminalNode DIV() { return getToken(comp24Parser.DIV, 0); }
		public TerminalNode MOD() { return getToken(comp24Parser.MOD, 0); }
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_t);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(MULT);
				setState(178);
				factor();
				setState(179);
				t();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(DIV);
				setState(182);
				factor();
				setState(183);
				t();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				match(MOD);
				setState(186);
				factor();
				setState(187);
				t();
				}
				break;
			case EOF:
			case FOR:
			case IF:
			case ELSE:
			case WHILE:
			case RETURN:
			case INT:
			case DOUBLE:
			case CHAR:
			case VOID:
			case COMA:
			case PA:
			case PC:
			case LLA:
			case LLC:
			case PYC:
			case SUMA:
			case RESTA:
			case AND:
			case OR:
			case NOT:
			case NUMERO:
			case ID:
			case OPERADOR_UNARIO:
			case COMPARACION:
				enterOuterAlt(_localctx, 4);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode PA() { return getToken(comp24Parser.PA, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode PC() { return getToken(comp24Parser.PC, 0); }
		public TerminalNode ID() { return getToken(comp24Parser.ID, 0); }
		public TerminalNode OPERADOR_UNARIO() { return getToken(comp24Parser.OPERADOR_UNARIO, 0); }
		public TerminalNode NUMERO() { return getToken(comp24Parser.NUMERO, 0); }
		public TerminalNode RESTA() { return getToken(comp24Parser.RESTA, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Func_llamadaContext func_llamada() {
			return getRuleContext(Func_llamadaContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_factor);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(PA);
				setState(193);
				exp();
				setState(194);
				match(PC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(ID);
				setState(197);
				match(OPERADOR_UNARIO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				match(OPERADOR_UNARIO);
				setState(199);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				match(NUMERO);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(201);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(202);
				match(RESTA);
				setState(203);
				factor();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(204);
				func_llamada();
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_instruccionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(comp24Parser.IF, 0); }
		public TerminalNode PA() { return getToken(comp24Parser.PA, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public TerminalNode PC() { return getToken(comp24Parser.PC, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public Else_instruccionContext else_instruccion() {
			return getRuleContext(Else_instruccionContext.class,0);
		}
		public If_instruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterIf_instruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitIf_instruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitIf_instruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_instruccionContext if_instruccion() throws RecognitionException {
		If_instruccionContext _localctx = new If_instruccionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_if_instruccion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(IF);
			setState(208);
			match(PA);
			setState(209);
			opal();
			setState(210);
			match(PC);
			setState(211);
			instruccion();
			setState(212);
			else_instruccion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Else_instruccionContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(comp24Parser.ELSE, 0); }
		public TerminalNode IF() { return getToken(comp24Parser.IF, 0); }
		public TerminalNode PA() { return getToken(comp24Parser.PA, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public TerminalNode PC() { return getToken(comp24Parser.PC, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public Else_instruccionContext else_instruccion() {
			return getRuleContext(Else_instruccionContext.class,0);
		}
		public Else_instruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterElse_instruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitElse_instruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitElse_instruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_instruccionContext else_instruccion() throws RecognitionException {
		Else_instruccionContext _localctx = new Else_instruccionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_else_instruccion);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(ELSE);
				setState(215);
				match(IF);
				setState(216);
				match(PA);
				setState(217);
				opal();
				setState(218);
				match(PC);
				setState(219);
				instruccion();
				setState(220);
				else_instruccion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(ELSE);
				setState(223);
				instruccion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(comp24Parser.WHILE, 0); }
		public TerminalNode PA() { return getToken(comp24Parser.PA, 0); }
		public TerminalNode PC() { return getToken(comp24Parser.PC, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public TerminalNode ID() { return getToken(comp24Parser.ID, 0); }
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(WHILE);
			setState(228);
			match(PA);
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(229);
				opal();
				}
				break;
			case 2:
				{
				setState(230);
				match(ID);
				}
				break;
			}
			setState(233);
			match(PC);
			setState(234);
			instruccion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(comp24Parser.FOR, 0); }
		public TerminalNode PA() { return getToken(comp24Parser.PA, 0); }
		public List<TerminalNode> PYC() { return getTokens(comp24Parser.PYC); }
		public TerminalNode PYC(int i) {
			return getToken(comp24Parser.PYC, i);
		}
		public TerminalNode PC() { return getToken(comp24Parser.PC, 0); }
		public Acciones_inicialesContext acciones_iniciales() {
			return getRuleContext(Acciones_inicialesContext.class,0);
		}
		public Acciones_siempreContext acciones_siempre() {
			return getRuleContext(Acciones_siempreContext.class,0);
		}
		public Acciones_postContext acciones_post() {
			return getRuleContext(Acciones_postContext.class,0);
		}
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(FOR);
			setState(237);
			match(PA);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 251923392L) != 0)) {
				{
				setState(238);
				acciones_iniciales();
				}
			}

			setState(241);
			match(PYC);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 251923392L) != 0)) {
				{
				setState(242);
				acciones_siempre();
				}
			}

			setState(245);
			match(PYC);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 251923392L) != 0)) {
				{
				setState(246);
				acciones_post();
				}
			}

			setState(249);
			match(PC);
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(250);
				instruccion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Acciones_inicialesContext extends ParserRuleContext {
		public Accion_inicialContext accion_inicial() {
			return getRuleContext(Accion_inicialContext.class,0);
		}
		public TerminalNode COMA() { return getToken(comp24Parser.COMA, 0); }
		public Acciones_inicialesContext acciones_iniciales() {
			return getRuleContext(Acciones_inicialesContext.class,0);
		}
		public Acciones_inicialesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acciones_iniciales; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterAcciones_iniciales(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitAcciones_iniciales(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitAcciones_iniciales(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Acciones_inicialesContext acciones_iniciales() throws RecognitionException {
		Acciones_inicialesContext _localctx = new Acciones_inicialesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_acciones_iniciales);
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				accion_inicial();
				setState(254);
				match(COMA);
				setState(255);
				acciones_iniciales();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				accion_inicial();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Accion_inicialContext extends ParserRuleContext {
		public OpalesContext opales() {
			return getRuleContext(OpalesContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public Accion_inicialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accion_inicial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterAccion_inicial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitAccion_inicial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitAccion_inicial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Accion_inicialContext accion_inicial() throws RecognitionException {
		Accion_inicialContext _localctx = new Accion_inicialContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_accion_inicial);
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case RESTA:
			case NOT:
			case NUMERO:
			case ID:
			case OPERADOR_UNARIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				opales();
				}
				break;
			case INT:
			case DOUBLE:
			case CHAR:
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				declaracion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Acciones_siempreContext extends ParserRuleContext {
		public Accion_siempreContext accion_siempre() {
			return getRuleContext(Accion_siempreContext.class,0);
		}
		public TerminalNode COMA() { return getToken(comp24Parser.COMA, 0); }
		public Acciones_siempreContext acciones_siempre() {
			return getRuleContext(Acciones_siempreContext.class,0);
		}
		public Acciones_siempreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acciones_siempre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterAcciones_siempre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitAcciones_siempre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitAcciones_siempre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Acciones_siempreContext acciones_siempre() throws RecognitionException {
		Acciones_siempreContext _localctx = new Acciones_siempreContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_acciones_siempre);
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				accion_siempre();
				setState(265);
				match(COMA);
				setState(266);
				acciones_siempre();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				accion_siempre();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Accion_siempreContext extends ParserRuleContext {
		public OpalesContext opales() {
			return getRuleContext(OpalesContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public Accion_siempreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accion_siempre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterAccion_siempre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitAccion_siempre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitAccion_siempre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Accion_siempreContext accion_siempre() throws RecognitionException {
		Accion_siempreContext _localctx = new Accion_siempreContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_accion_siempre);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case RESTA:
			case NOT:
			case NUMERO:
			case ID:
			case OPERADOR_UNARIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				opales();
				}
				break;
			case INT:
			case DOUBLE:
			case CHAR:
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				declaracion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Acciones_postContext extends ParserRuleContext {
		public Accion_postContext accion_post() {
			return getRuleContext(Accion_postContext.class,0);
		}
		public TerminalNode COMA() { return getToken(comp24Parser.COMA, 0); }
		public Acciones_postContext acciones_post() {
			return getRuleContext(Acciones_postContext.class,0);
		}
		public Acciones_postContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acciones_post; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterAcciones_post(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitAcciones_post(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitAcciones_post(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Acciones_postContext acciones_post() throws RecognitionException {
		Acciones_postContext _localctx = new Acciones_postContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_acciones_post);
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				accion_post();
				setState(276);
				match(COMA);
				setState(277);
				acciones_post();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				accion_post();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Accion_postContext extends ParserRuleContext {
		public OpalesContext opales() {
			return getRuleContext(OpalesContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public Accion_postContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accion_post; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterAccion_post(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitAccion_post(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitAccion_post(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Accion_postContext accion_post() throws RecognitionException {
		Accion_postContext _localctx = new Accion_postContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_accion_post);
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case RESTA:
			case NOT:
			case NUMERO:
			case ID:
			case OPERADOR_UNARIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				opales();
				}
				break;
			case INT:
			case DOUBLE:
			case CHAR:
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				declaracion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionContext extends ParserRuleContext {
		public TdatoContext tdato() {
			return getRuleContext(TdatoContext.class,0);
		}
		public TerminalNode ID() { return getToken(comp24Parser.ID, 0); }
		public InicializacionContext inicializacion() {
			return getRuleContext(InicializacionContext.class,0);
		}
		public List_declContext list_decl() {
			return getRuleContext(List_declContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			tdato();
			setState(287);
			match(ID);
			setState(288);
			inicializacion();
			setState(289);
			list_decl();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InicializacionContext extends ParserRuleContext {
		public TerminalNode ASIGN() { return getToken(comp24Parser.ASIGN, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public TerminalNode ID() { return getToken(comp24Parser.ID, 0); }
		public List_asignContext list_asign() {
			return getRuleContext(List_asignContext.class,0);
		}
		public InicializacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterInicializacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitInicializacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitInicializacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicializacionContext inicializacion() throws RecognitionException {
		InicializacionContext _localctx = new InicializacionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_inicializacion);
		try {
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(ASIGN);
				setState(292);
				opal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(ASIGN);
				setState(294);
				match(ID);
				setState(295);
				list_asign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class List_declContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(comp24Parser.COMA, 0); }
		public TerminalNode ID() { return getToken(comp24Parser.ID, 0); }
		public InicializacionContext inicializacion() {
			return getRuleContext(InicializacionContext.class,0);
		}
		public List_declContext list_decl() {
			return getRuleContext(List_declContext.class,0);
		}
		public List_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterList_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitList_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitList_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_declContext list_decl() throws RecognitionException {
		List_declContext _localctx = new List_declContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_list_decl);
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(COMA);
				setState(300);
				match(ID);
				setState(301);
				inicializacion();
				setState(302);
				list_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(comp24Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(comp24Parser.ID, i);
		}
		public TerminalNode ASIGN() { return getToken(comp24Parser.ASIGN, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public List_asignContext list_asign() {
			return getRuleContext(List_asignContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_asignacion);
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(ID);
				setState(308);
				match(ASIGN);
				setState(309);
				opal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				match(ID);
				setState(311);
				match(ASIGN);
				setState(312);
				match(ID);
				setState(313);
				list_asign();
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

	@SuppressWarnings("CheckReturnValue")
	public static class List_asignContext extends ParserRuleContext {
		public TerminalNode ASIGN() { return getToken(comp24Parser.ASIGN, 0); }
		public TerminalNode ID() { return getToken(comp24Parser.ID, 0); }
		public List_asignContext list_asign() {
			return getRuleContext(List_asignContext.class,0);
		}
		public Func_llamadaContext func_llamada() {
			return getRuleContext(Func_llamadaContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(comp24Parser.NUMERO, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public List_asignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_asign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterList_asign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitList_asign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitList_asign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_asignContext list_asign() throws RecognitionException {
		List_asignContext _localctx = new List_asignContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_list_asign);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				match(ASIGN);
				setState(317);
				match(ID);
				setState(318);
				list_asign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				match(ASIGN);
				setState(320);
				func_llamada();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				match(ASIGN);
				setState(322);
				match(NUMERO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(323);
				match(ASIGN);
				setState(324);
				opal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Funcion_prototipoContext extends ParserRuleContext {
		public TdatoContext tdato() {
			return getRuleContext(TdatoContext.class,0);
		}
		public TerminalNode ID() { return getToken(comp24Parser.ID, 0); }
		public TerminalNode PA() { return getToken(comp24Parser.PA, 0); }
		public TerminalNode PC() { return getToken(comp24Parser.PC, 0); }
		public TerminalNode PYC() { return getToken(comp24Parser.PYC, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public Funcion_prototipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion_prototipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterFuncion_prototipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitFuncion_prototipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitFuncion_prototipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funcion_prototipoContext funcion_prototipo() throws RecognitionException {
		Funcion_prototipoContext _localctx = new Funcion_prototipoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_funcion_prototipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			tdato();
			setState(329);
			match(ID);
			setState(330);
			match(PA);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0)) {
				{
				setState(331);
				argumentos();
				}
			}

			setState(334);
			match(PC);
			setState(335);
			match(PYC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Funcion_definicionContext extends ParserRuleContext {
		public TdatoContext tdato() {
			return getRuleContext(TdatoContext.class,0);
		}
		public TerminalNode ID() { return getToken(comp24Parser.ID, 0); }
		public TerminalNode PA() { return getToken(comp24Parser.PA, 0); }
		public TerminalNode PC() { return getToken(comp24Parser.PC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public Funcion_definicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion_definicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterFuncion_definicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitFuncion_definicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitFuncion_definicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funcion_definicionContext funcion_definicion() throws RecognitionException {
		Funcion_definicionContext _localctx = new Funcion_definicionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_funcion_definicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			tdato();
			setState(338);
			match(ID);
			setState(339);
			match(PA);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0)) {
				{
				setState(340);
				argumentos();
				}
			}

			setState(343);
			match(PC);
			setState(344);
			bloque();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentosContext extends ParserRuleContext {
		public ArgumentoContext argumento() {
			return getRuleContext(ArgumentoContext.class,0);
		}
		public TerminalNode COMA() { return getToken(comp24Parser.COMA, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitArgumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_argumentos);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				argumento();
				setState(347);
				match(COMA);
				setState(348);
				argumentos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				argumento();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentoContext extends ParserRuleContext {
		public TdatoContext tdato() {
			return getRuleContext(TdatoContext.class,0);
		}
		public TerminalNode ID() { return getToken(comp24Parser.ID, 0); }
		public ArgumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterArgumento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitArgumento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitArgumento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentoContext argumento() throws RecognitionException {
		ArgumentoContext _localctx = new ArgumentoContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_argumento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			tdato();
			setState(354);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Funcion_llamadaContext extends ParserRuleContext {
		public Func_llamadaContext func_llamada() {
			return getRuleContext(Func_llamadaContext.class,0);
		}
		public TerminalNode PYC() { return getToken(comp24Parser.PYC, 0); }
		public Funcion_llamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion_llamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterFuncion_llamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitFuncion_llamada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitFuncion_llamada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funcion_llamadaContext funcion_llamada() throws RecognitionException {
		Funcion_llamadaContext _localctx = new Funcion_llamadaContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_funcion_llamada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			func_llamada();
			setState(357);
			match(PYC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Func_llamadaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(comp24Parser.ID, 0); }
		public TerminalNode PA() { return getToken(comp24Parser.PA, 0); }
		public TerminalNode PC() { return getToken(comp24Parser.PC, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public Func_llamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_llamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterFunc_llamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitFunc_llamada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitFunc_llamada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_llamadaContext func_llamada() throws RecognitionException {
		Func_llamadaContext _localctx = new Func_llamadaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_func_llamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(ID);
			setState(360);
			match(PA);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 251922432L) != 0)) {
				{
				setState(361);
				parametros();
				}
			}

			setState(364);
			match(PC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public TerminalNode COMA() { return getToken(comp24Parser.COMA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_parametros);
		try {
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				parametro();
				setState(367);
				match(COMA);
				setState(368);
				parametros();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				parametro();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public TerminalNode ID() { return getToken(comp24Parser.ID, 0); }
		public TerminalNode NUMERO() { return getToken(comp24Parser.NUMERO, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_parametro);
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				opal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(375);
				match(NUMERO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(comp24Parser.RETURN, 0); }
		public TerminalNode PYC() { return getToken(comp24Parser.PYC, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_return);
		try {
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				match(RETURN);
				setState(379);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				match(RETURN);
				setState(381);
				opal();
				setState(382);
				match(PYC);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u0183\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\\\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002n\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005{\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0087\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0091\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u009a\b\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u009f\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00ad"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00bf"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00ce\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00e2\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00e8\b\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u00f0\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00f4\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u00f8\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u00fc\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0103\b\u0016\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u0107\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u010e\b\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u0112\b"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u0119\b\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u011d\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u012a\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u0132\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u013b\b\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0003 \u0147\b \u0001!\u0001!\u0001!\u0001!\u0003!\u014d\b!\u0001!\u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0156\b\"\u0001\"\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u0160\b#\u0001$\u0001"+
		"$\u0001$\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0003&\u016b\b&\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0174\b\'\u0001"+
		"(\u0001(\u0001(\u0003(\u0179\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0003)\u0181\b)\u0001)\u0000\u0000*\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPR\u0000\u0001\u0001\u0000\u0006\t\u0192\u0000T\u0001\u0000\u0000"+
		"\u0000\u0002[\u0001\u0000\u0000\u0000\u0004m\u0001\u0000\u0000\u0000\u0006"+
		"o\u0001\u0000\u0000\u0000\bs\u0001\u0000\u0000\u0000\nz\u0001\u0000\u0000"+
		"\u0000\f|\u0001\u0000\u0000\u0000\u000e~\u0001\u0000\u0000\u0000\u0010"+
		"\u0086\u0001\u0000\u0000\u0000\u0012\u0088\u0001\u0000\u0000\u0000\u0014"+
		"\u0090\u0001\u0000\u0000\u0000\u0016\u0099\u0001\u0000\u0000\u0000\u0018"+
		"\u009b\u0001\u0000\u0000\u0000\u001a\u00a0\u0001\u0000\u0000\u0000\u001c"+
		"\u00ac\u0001\u0000\u0000\u0000\u001e\u00ae\u0001\u0000\u0000\u0000 \u00be"+
		"\u0001\u0000\u0000\u0000\"\u00cd\u0001\u0000\u0000\u0000$\u00cf\u0001"+
		"\u0000\u0000\u0000&\u00e1\u0001\u0000\u0000\u0000(\u00e3\u0001\u0000\u0000"+
		"\u0000*\u00ec\u0001\u0000\u0000\u0000,\u0102\u0001\u0000\u0000\u0000."+
		"\u0106\u0001\u0000\u0000\u00000\u010d\u0001\u0000\u0000\u00002\u0111\u0001"+
		"\u0000\u0000\u00004\u0118\u0001\u0000\u0000\u00006\u011c\u0001\u0000\u0000"+
		"\u00008\u011e\u0001\u0000\u0000\u0000:\u0129\u0001\u0000\u0000\u0000<"+
		"\u0131\u0001\u0000\u0000\u0000>\u013a\u0001\u0000\u0000\u0000@\u0146\u0001"+
		"\u0000\u0000\u0000B\u0148\u0001\u0000\u0000\u0000D\u0151\u0001\u0000\u0000"+
		"\u0000F\u015f\u0001\u0000\u0000\u0000H\u0161\u0001\u0000\u0000\u0000J"+
		"\u0164\u0001\u0000\u0000\u0000L\u0167\u0001\u0000\u0000\u0000N\u0173\u0001"+
		"\u0000\u0000\u0000P\u0178\u0001\u0000\u0000\u0000R\u0180\u0001\u0000\u0000"+
		"\u0000TU\u0003\u0002\u0001\u0000UV\u0005\u0000\u0000\u0001V\u0001\u0001"+
		"\u0000\u0000\u0000WX\u0003\u0004\u0002\u0000XY\u0003\u0002\u0001\u0000"+
		"Y\\\u0001\u0000\u0000\u0000Z\\\u0001\u0000\u0000\u0000[W\u0001\u0000\u0000"+
		"\u0000[Z\u0001\u0000\u0000\u0000\\\u0003\u0001\u0000\u0000\u0000]^\u0003"+
		"8\u001c\u0000^_\u0005\u0010\u0000\u0000_n\u0001\u0000\u0000\u0000`n\u0003"+
		"(\u0014\u0000an\u0003\u0006\u0003\u0000bc\u0003>\u001f\u0000cd\u0005\u0010"+
		"\u0000\u0000dn\u0001\u0000\u0000\u0000en\u0003B!\u0000fn\u0003D\"\u0000"+
		"gn\u0003J%\u0000hn\u0003$\u0012\u0000in\u0003*\u0015\u0000jn\u0003\u001a"+
		"\r\u0000kn\u0003\f\u0006\u0000ln\u0003R)\u0000m]\u0001\u0000\u0000\u0000"+
		"m`\u0001\u0000\u0000\u0000ma\u0001\u0000\u0000\u0000mb\u0001\u0000\u0000"+
		"\u0000me\u0001\u0000\u0000\u0000mf\u0001\u0000\u0000\u0000mg\u0001\u0000"+
		"\u0000\u0000mh\u0001\u0000\u0000\u0000mi\u0001\u0000\u0000\u0000mj\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000"+
		"n\u0005\u0001\u0000\u0000\u0000op\u0005\r\u0000\u0000pq\u0003\u0002\u0001"+
		"\u0000qr\u0005\u000e\u0000\u0000r\u0007\u0001\u0000\u0000\u0000st\u0007"+
		"\u0000\u0000\u0000t\t\u0001\u0000\u0000\u0000uv\u0003\f\u0006\u0000vw"+
		"\u0005\n\u0000\u0000wx\u0003\n\u0005\u0000x{\u0001\u0000\u0000\u0000y"+
		"{\u0003\f\u0006\u0000zu\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000\u0000"+
		"{\u000b\u0001\u0000\u0000\u0000|}\u0003\u000e\u0007\u0000}\r\u0001\u0000"+
		"\u0000\u0000~\u007f\u0003\u0012\t\u0000\u007f\u0080\u0003\u0010\b\u0000"+
		"\u0080\u000f\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0017\u0000\u0000"+
		"\u0082\u0083\u0003\u0012\t\u0000\u0083\u0084\u0003\u0010\b\u0000\u0084"+
		"\u0087\u0001\u0000\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086"+
		"\u0081\u0001\u0000\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087"+
		"\u0011\u0001\u0000\u0000\u0000\u0088\u0089\u0003\u0016\u000b\u0000\u0089"+
		"\u008a\u0003\u0014\n\u0000\u008a\u0013\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0005\u0016\u0000\u0000\u008c\u008d\u0003\u0016\u000b\u0000\u008d\u008e"+
		"\u0003\u0014\n\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u0091\u0001"+
		"\u0000\u0000\u0000\u0090\u008b\u0001\u0000\u0000\u0000\u0090\u008f\u0001"+
		"\u0000\u0000\u0000\u0091\u0015\u0001\u0000\u0000\u0000\u0092\u0093\u0005"+
		"\u0018\u0000\u0000\u0093\u009a\u0003\u0016\u000b\u0000\u0094\u0095\u0005"+
		"\u000b\u0000\u0000\u0095\u0096\u0003\f\u0006\u0000\u0096\u0097\u0005\f"+
		"\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u009a\u0003\u0018"+
		"\f\u0000\u0099\u0092\u0001\u0000\u0000\u0000\u0099\u0094\u0001\u0000\u0000"+
		"\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u0017\u0001\u0000\u0000"+
		"\u0000\u009b\u009e\u0003\u001a\r\u0000\u009c\u009d\u0005\u001d\u0000\u0000"+
		"\u009d\u009f\u0003\u001a\r\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0001\u0000\u0000\u0000\u009f\u0019\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0003\u001e\u000f\u0000\u00a1\u00a2\u0003\u001c\u000e\u0000\u00a2"+
		"\u001b\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u0011\u0000\u0000\u00a4"+
		"\u00a5\u0003\u001e\u000f\u0000\u00a5\u00a6\u0003\u001c\u000e\u0000\u00a6"+
		"\u00ad\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\u0012\u0000\u0000\u00a8"+
		"\u00a9\u0003\u001e\u000f\u0000\u00a9\u00aa\u0003\u001c\u000e\u0000\u00aa"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac"+
		"\u00a3\u0001\u0000\u0000\u0000\u00ac\u00a7\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ad\u001d\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0003\"\u0011\u0000\u00af\u00b0\u0003 \u0010\u0000\u00b0\u001f"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u0013\u0000\u0000\u00b2\u00b3"+
		"\u0003\"\u0011\u0000\u00b3\u00b4\u0003 \u0010\u0000\u00b4\u00bf\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0005\u0014\u0000\u0000\u00b6\u00b7\u0003"+
		"\"\u0011\u0000\u00b7\u00b8\u0003 \u0010\u0000\u00b8\u00bf\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0005\u0015\u0000\u0000\u00ba\u00bb\u0003\"\u0011"+
		"\u0000\u00bb\u00bc\u0003 \u0010\u0000\u00bc\u00bf\u0001\u0000\u0000\u0000"+
		"\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u00b1\u0001\u0000\u0000\u0000"+
		"\u00be\u00b5\u0001\u0000\u0000\u0000\u00be\u00b9\u0001\u0000\u0000\u0000"+
		"\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf!\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0005\u000b\u0000\u0000\u00c1\u00c2\u0003\u001a\r\u0000\u00c2\u00c3"+
		"\u0005\f\u0000\u0000\u00c3\u00ce\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005"+
		"\u001a\u0000\u0000\u00c5\u00ce\u0005\u001b\u0000\u0000\u00c6\u00c7\u0005"+
		"\u001b\u0000\u0000\u00c7\u00ce\u0005\u001a\u0000\u0000\u00c8\u00ce\u0005"+
		"\u0019\u0000\u0000\u00c9\u00ce\u0005\u001a\u0000\u0000\u00ca\u00cb\u0005"+
		"\u0012\u0000\u0000\u00cb\u00ce\u0003\"\u0011\u0000\u00cc\u00ce\u0003L"+
		"&\u0000\u00cd\u00c0\u0001\u0000\u0000\u0000\u00cd\u00c4\u0001\u0000\u0000"+
		"\u0000\u00cd\u00c6\u0001\u0000\u0000\u0000\u00cd\u00c8\u0001\u0000\u0000"+
		"\u0000\u00cd\u00c9\u0001\u0000\u0000\u0000\u00cd\u00ca\u0001\u0000\u0000"+
		"\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce#\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0005\u0002\u0000\u0000\u00d0\u00d1\u0005\u000b\u0000\u0000"+
		"\u00d1\u00d2\u0003\f\u0006\u0000\u00d2\u00d3\u0005\f\u0000\u0000\u00d3"+
		"\u00d4\u0003\u0004\u0002\u0000\u00d4\u00d5\u0003&\u0013\u0000\u00d5%\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0005\u0003\u0000\u0000\u00d7\u00d8\u0005"+
		"\u0002\u0000\u0000\u00d8\u00d9\u0005\u000b\u0000\u0000\u00d9\u00da\u0003"+
		"\f\u0006\u0000\u00da\u00db\u0005\f\u0000\u0000\u00db\u00dc\u0003\u0004"+
		"\u0002\u0000\u00dc\u00dd\u0003&\u0013\u0000\u00dd\u00e2\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0005\u0003\u0000\u0000\u00df\u00e2\u0003\u0004\u0002"+
		"\u0000\u00e0\u00e2\u0001\u0000\u0000\u0000\u00e1\u00d6\u0001\u0000\u0000"+
		"\u0000\u00e1\u00de\u0001\u0000\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e2\'\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\u0004\u0000\u0000"+
		"\u00e4\u00e7\u0005\u000b\u0000\u0000\u00e5\u00e8\u0003\f\u0006\u0000\u00e6"+
		"\u00e8\u0005\u001a\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ea\u0005\f\u0000\u0000\u00ea\u00eb\u0003\u0004\u0002\u0000\u00eb)"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\u0001\u0000\u0000\u00ed\u00ef"+
		"\u0005\u000b\u0000\u0000\u00ee\u00f0\u0003,\u0016\u0000\u00ef\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f3\u0005\u0010\u0000\u0000\u00f2\u00f4\u0003"+
		"0\u0018\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f7\u0005\u0010"+
		"\u0000\u0000\u00f6\u00f8\u00034\u001a\u0000\u00f7\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fb\u0005\f\u0000\u0000\u00fa\u00fc\u0003\u0004\u0002\u0000"+
		"\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fc+\u0001\u0000\u0000\u0000\u00fd\u00fe\u0003.\u0017\u0000\u00fe\u00ff"+
		"\u0005\n\u0000\u0000\u00ff\u0100\u0003,\u0016\u0000\u0100\u0103\u0001"+
		"\u0000\u0000\u0000\u0101\u0103\u0003.\u0017\u0000\u0102\u00fd\u0001\u0000"+
		"\u0000\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0103-\u0001\u0000\u0000"+
		"\u0000\u0104\u0107\u0003\n\u0005\u0000\u0105\u0107\u00038\u001c\u0000"+
		"\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0105\u0001\u0000\u0000\u0000"+
		"\u0107/\u0001\u0000\u0000\u0000\u0108\u0109\u00032\u0019\u0000\u0109\u010a"+
		"\u0005\n\u0000\u0000\u010a\u010b\u00030\u0018\u0000\u010b\u010e\u0001"+
		"\u0000\u0000\u0000\u010c\u010e\u00032\u0019\u0000\u010d\u0108\u0001\u0000"+
		"\u0000\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010e1\u0001\u0000\u0000"+
		"\u0000\u010f\u0112\u0003\n\u0005\u0000\u0110\u0112\u00038\u001c\u0000"+
		"\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0110\u0001\u0000\u0000\u0000"+
		"\u01123\u0001\u0000\u0000\u0000\u0113\u0114\u00036\u001b\u0000\u0114\u0115"+
		"\u0005\n\u0000\u0000\u0115\u0116\u00034\u001a\u0000\u0116\u0119\u0001"+
		"\u0000\u0000\u0000\u0117\u0119\u00036\u001b\u0000\u0118\u0113\u0001\u0000"+
		"\u0000\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u01195\u0001\u0000\u0000"+
		"\u0000\u011a\u011d\u0003\n\u0005\u0000\u011b\u011d\u00038\u001c\u0000"+
		"\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011b\u0001\u0000\u0000\u0000"+
		"\u011d7\u0001\u0000\u0000\u0000\u011e\u011f\u0003\b\u0004\u0000\u011f"+
		"\u0120\u0005\u001a\u0000\u0000\u0120\u0121\u0003:\u001d\u0000\u0121\u0122"+
		"\u0003<\u001e\u0000\u01229\u0001\u0000\u0000\u0000\u0123\u0124\u0005\u000f"+
		"\u0000\u0000\u0124\u012a\u0003\f\u0006\u0000\u0125\u0126\u0005\u000f\u0000"+
		"\u0000\u0126\u0127\u0005\u001a\u0000\u0000\u0127\u012a\u0003@ \u0000\u0128"+
		"\u012a\u0001\u0000\u0000\u0000\u0129\u0123\u0001\u0000\u0000\u0000\u0129"+
		"\u0125\u0001\u0000\u0000\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u012a"+
		";\u0001\u0000\u0000\u0000\u012b\u012c\u0005\n\u0000\u0000\u012c\u012d"+
		"\u0005\u001a\u0000\u0000\u012d\u012e\u0003:\u001d\u0000\u012e\u012f\u0003"+
		"<\u001e\u0000\u012f\u0132\u0001\u0000\u0000\u0000\u0130\u0132\u0001\u0000"+
		"\u0000\u0000\u0131\u012b\u0001\u0000\u0000\u0000\u0131\u0130\u0001\u0000"+
		"\u0000\u0000\u0132=\u0001\u0000\u0000\u0000\u0133\u0134\u0005\u001a\u0000"+
		"\u0000\u0134\u0135\u0005\u000f\u0000\u0000\u0135\u013b\u0003\f\u0006\u0000"+
		"\u0136\u0137\u0005\u001a\u0000\u0000\u0137\u0138\u0005\u000f\u0000\u0000"+
		"\u0138\u0139\u0005\u001a\u0000\u0000\u0139\u013b\u0003@ \u0000\u013a\u0133"+
		"\u0001\u0000\u0000\u0000\u013a\u0136\u0001\u0000\u0000\u0000\u013b?\u0001"+
		"\u0000\u0000\u0000\u013c\u013d\u0005\u000f\u0000\u0000\u013d\u013e\u0005"+
		"\u001a\u0000\u0000\u013e\u0147\u0003@ \u0000\u013f\u0140\u0005\u000f\u0000"+
		"\u0000\u0140\u0147\u0003L&\u0000\u0141\u0142\u0005\u000f\u0000\u0000\u0142"+
		"\u0147\u0005\u0019\u0000\u0000\u0143\u0144\u0005\u000f\u0000\u0000\u0144"+
		"\u0147\u0003\f\u0006\u0000\u0145\u0147\u0001\u0000\u0000\u0000\u0146\u013c"+
		"\u0001\u0000\u0000\u0000\u0146\u013f\u0001\u0000\u0000\u0000\u0146\u0141"+
		"\u0001\u0000\u0000\u0000\u0146\u0143\u0001\u0000\u0000\u0000\u0146\u0145"+
		"\u0001\u0000\u0000\u0000\u0147A\u0001\u0000\u0000\u0000\u0148\u0149\u0003"+
		"\b\u0004\u0000\u0149\u014a\u0005\u001a\u0000\u0000\u014a\u014c\u0005\u000b"+
		"\u0000\u0000\u014b\u014d\u0003F#\u0000\u014c\u014b\u0001\u0000\u0000\u0000"+
		"\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000"+
		"\u014e\u014f\u0005\f\u0000\u0000\u014f\u0150\u0005\u0010\u0000\u0000\u0150"+
		"C\u0001\u0000\u0000\u0000\u0151\u0152\u0003\b\u0004\u0000\u0152\u0153"+
		"\u0005\u001a\u0000\u0000\u0153\u0155\u0005\u000b\u0000\u0000\u0154\u0156"+
		"\u0003F#\u0000\u0155\u0154\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000"+
		"\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0158\u0005\f\u0000"+
		"\u0000\u0158\u0159\u0003\u0006\u0003\u0000\u0159E\u0001\u0000\u0000\u0000"+
		"\u015a\u015b\u0003H$\u0000\u015b\u015c\u0005\n\u0000\u0000\u015c\u015d"+
		"\u0003F#\u0000\u015d\u0160\u0001\u0000\u0000\u0000\u015e\u0160\u0003H"+
		"$\u0000\u015f\u015a\u0001\u0000\u0000\u0000\u015f\u015e\u0001\u0000\u0000"+
		"\u0000\u0160G\u0001\u0000\u0000\u0000\u0161\u0162\u0003\b\u0004\u0000"+
		"\u0162\u0163\u0005\u001a\u0000\u0000\u0163I\u0001\u0000\u0000\u0000\u0164"+
		"\u0165\u0003L&\u0000\u0165\u0166\u0005\u0010\u0000\u0000\u0166K\u0001"+
		"\u0000\u0000\u0000\u0167\u0168\u0005\u001a\u0000\u0000\u0168\u016a\u0005"+
		"\u000b\u0000\u0000\u0169\u016b\u0003N\'\u0000\u016a\u0169\u0001\u0000"+
		"\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000"+
		"\u0000\u0000\u016c\u016d\u0005\f\u0000\u0000\u016dM\u0001\u0000\u0000"+
		"\u0000\u016e\u016f\u0003P(\u0000\u016f\u0170\u0005\n\u0000\u0000\u0170"+
		"\u0171\u0003N\'\u0000\u0171\u0174\u0001\u0000\u0000\u0000\u0172\u0174"+
		"\u0003P(\u0000\u0173\u016e\u0001\u0000\u0000\u0000\u0173\u0172\u0001\u0000"+
		"\u0000\u0000\u0174O\u0001\u0000\u0000\u0000\u0175\u0179\u0003\f\u0006"+
		"\u0000\u0176\u0179\u0005\u001a\u0000\u0000\u0177\u0179\u0005\u0019\u0000"+
		"\u0000\u0178\u0175\u0001\u0000\u0000\u0000\u0178\u0176\u0001\u0000\u0000"+
		"\u0000\u0178\u0177\u0001\u0000\u0000\u0000\u0179Q\u0001\u0000\u0000\u0000"+
		"\u017a\u017b\u0005\u0005\u0000\u0000\u017b\u0181\u0005\u0010\u0000\u0000"+
		"\u017c\u017d\u0005\u0005\u0000\u0000\u017d\u017e\u0003\f\u0006\u0000\u017e"+
		"\u017f\u0005\u0010\u0000\u0000\u017f\u0181\u0001\u0000\u0000\u0000\u0180"+
		"\u017a\u0001\u0000\u0000\u0000\u0180\u017c\u0001\u0000\u0000\u0000\u0181"+
		"S\u0001\u0000\u0000\u0000![mz\u0086\u0090\u0099\u009e\u00ac\u00be\u00cd"+
		"\u00e1\u00e7\u00ef\u00f3\u00f7\u00fb\u0102\u0106\u010d\u0111\u0118\u011c"+
		"\u0129\u0131\u013a\u0146\u014c\u0155\u015f\u016a\u0173\u0178\u0180";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}