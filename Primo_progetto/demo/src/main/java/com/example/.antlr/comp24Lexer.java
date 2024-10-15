// Generated from c:/Users/Giuseppe/Desktop/Practica y Construccion de Compiladores/Primo_progetto/demo/src/main/java/com/example/comp24.g4 by ANTLR 4.13.1

package com.example;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class comp24Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FOR=1, IF=2, ELSE=3, WHILE=4, RETURN=5, PA=6, PC=7, ASIGN=8, IGUAL=9, 
		ID=10, NUMERO=11, WS=12, OTRO=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "FOR", "IF", "ELSE", "WHILE", "RETURN", "PA", "PC", 
			"ASIGN", "IGUAL", "ID", "NUMERO", "WS", "OTRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'for'", "'if'", "'else'", "'while'", "'return'", "'('", "')'", 
			"'='", "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FOR", "IF", "ELSE", "WHILE", "RETURN", "PA", "PC", "ASIGN", "IGUAL", 
			"ID", "NUMERO", "WS", "OTRO"
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


	public comp24Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "comp24.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\r\\\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0003\u000bH\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000bM\b\u000b\n\u000b\f\u000bP\t\u000b\u0001\f\u0004\fS\b\f\u000b"+
		"\f\f\fT\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0000"+
		"\u0000\u000f\u0001\u0000\u0003\u0000\u0005\u0001\u0007\u0002\t\u0003\u000b"+
		"\u0004\r\u0005\u000f\u0006\u0011\u0007\u0013\b\u0015\t\u0017\n\u0019\u000b"+
		"\u001b\f\u001d\r\u0001\u0000\u0003\u0002\u0000AZaz\u0001\u000009\u0003"+
		"\u0000\t\n\r\r  ^\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000\u0000"+
		"\u0000\u0003!\u0001\u0000\u0000\u0000\u0005#\u0001\u0000\u0000\u0000\u0007"+
		"\'\u0001\u0000\u0000\u0000\t*\u0001\u0000\u0000\u0000\u000b/\u0001\u0000"+
		"\u0000\u0000\r5\u0001\u0000\u0000\u0000\u000f<\u0001\u0000\u0000\u0000"+
		"\u0011>\u0001\u0000\u0000\u0000\u0013@\u0001\u0000\u0000\u0000\u0015B"+
		"\u0001\u0000\u0000\u0000\u0017G\u0001\u0000\u0000\u0000\u0019R\u0001\u0000"+
		"\u0000\u0000\u001bV\u0001\u0000\u0000\u0000\u001dZ\u0001\u0000\u0000\u0000"+
		"\u001f \u0007\u0000\u0000\u0000 \u0002\u0001\u0000\u0000\u0000!\"\u0007"+
		"\u0001\u0000\u0000\"\u0004\u0001\u0000\u0000\u0000#$\u0005f\u0000\u0000"+
		"$%\u0005o\u0000\u0000%&\u0005r\u0000\u0000&\u0006\u0001\u0000\u0000\u0000"+
		"\'(\u0005i\u0000\u0000()\u0005f\u0000\u0000)\b\u0001\u0000\u0000\u0000"+
		"*+\u0005e\u0000\u0000+,\u0005l\u0000\u0000,-\u0005s\u0000\u0000-.\u0005"+
		"e\u0000\u0000.\n\u0001\u0000\u0000\u0000/0\u0005w\u0000\u000001\u0005"+
		"h\u0000\u000012\u0005i\u0000\u000023\u0005l\u0000\u000034\u0005e\u0000"+
		"\u00004\f\u0001\u0000\u0000\u000056\u0005r\u0000\u000067\u0005e\u0000"+
		"\u000078\u0005t\u0000\u000089\u0005u\u0000\u00009:\u0005r\u0000\u0000"+
		":;\u0005n\u0000\u0000;\u000e\u0001\u0000\u0000\u0000<=\u0005(\u0000\u0000"+
		"=\u0010\u0001\u0000\u0000\u0000>?\u0005)\u0000\u0000?\u0012\u0001\u0000"+
		"\u0000\u0000@A\u0005=\u0000\u0000A\u0014\u0001\u0000\u0000\u0000BC\u0005"+
		"=\u0000\u0000CD\u0005=\u0000\u0000D\u0016\u0001\u0000\u0000\u0000EH\u0003"+
		"\u0001\u0000\u0000FH\u0005_\u0000\u0000GE\u0001\u0000\u0000\u0000GF\u0001"+
		"\u0000\u0000\u0000HN\u0001\u0000\u0000\u0000IM\u0003\u0001\u0000\u0000"+
		"JM\u0003\u0003\u0001\u0000KM\u0005_\u0000\u0000LI\u0001\u0000\u0000\u0000"+
		"LJ\u0001\u0000\u0000\u0000LK\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000"+
		"\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000O\u0018\u0001"+
		"\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QS\u0003\u0003\u0001\u0000"+
		"RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000U\u001a\u0001\u0000\u0000\u0000VW\u0007"+
		"\u0002\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0006\r\u0000\u0000Y\u001c"+
		"\u0001\u0000\u0000\u0000Z[\t\u0000\u0000\u0000[\u001e\u0001\u0000\u0000"+
		"\u0000\u0005\u0000GLNT\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}