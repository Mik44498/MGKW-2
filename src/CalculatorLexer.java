// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOUBLE=1, DOT=2, TIMES=3, DIV=4, POW=5, SQRT=6, PLUS=7, MINUS=8, INTEGRAL=9, 
		COS=10, SIN=11, TAN=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DOUBLE", "DOT", "TIMES", "DIV", "POW", "SQRT", "PLUS", "MINUS", "INTEGRAL", 
			"COS", "SIN", "TAN", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'.'", "'*'", "'/'", "'^'", "'#'", "'+'", "'-'", "'cal'", 
			"'cos'", "'sin'", "'tan'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOUBLE", "DOT", "TIMES", "DIV", "POW", "SQRT", "PLUS", "MINUS", 
			"INTEGRAL", "COS", "SIN", "TAN", "WS"
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


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

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
		"\u0004\u0000\rM\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0004\u0000\u001d\b\u0000\u000b"+
		"\u0000\f\u0000\u001e\u0001\u0000\u0001\u0000\u0004\u0000#\b\u0000\u000b"+
		"\u0000\f\u0000$\u0003\u0000\'\b\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0004"+
		"\fH\b\f\u000b\f\f\fI\u0001\f\u0001\f\u0000\u0000\r\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u0001\u0000\u0001\u0003\u0000\t\n\r\r "+
		" P\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0001\u001c\u0001\u0000\u0000\u0000\u0003(\u0001"+
		"\u0000\u0000\u0000\u0005*\u0001\u0000\u0000\u0000\u0007,\u0001\u0000\u0000"+
		"\u0000\t.\u0001\u0000\u0000\u0000\u000b0\u0001\u0000\u0000\u0000\r2\u0001"+
		"\u0000\u0000\u0000\u000f4\u0001\u0000\u0000\u0000\u00116\u0001\u0000\u0000"+
		"\u0000\u0013:\u0001\u0000\u0000\u0000\u0015>\u0001\u0000\u0000\u0000\u0017"+
		"B\u0001\u0000\u0000\u0000\u0019G\u0001\u0000\u0000\u0000\u001b\u001d\u0002"+
		"09\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000"+
		"\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000"+
		"\u0000\u001f&\u0001\u0000\u0000\u0000 \"\u0005.\u0000\u0000!#\u000209"+
		"\u0000\"!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\"\u0001\u0000"+
		"\u0000\u0000$%\u0001\u0000\u0000\u0000%\'\u0001\u0000\u0000\u0000& \u0001"+
		"\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'\u0002\u0001\u0000\u0000"+
		"\u0000()\u0005.\u0000\u0000)\u0004\u0001\u0000\u0000\u0000*+\u0005*\u0000"+
		"\u0000+\u0006\u0001\u0000\u0000\u0000,-\u0005/\u0000\u0000-\b\u0001\u0000"+
		"\u0000\u0000./\u0005^\u0000\u0000/\n\u0001\u0000\u0000\u000001\u0005#"+
		"\u0000\u00001\f\u0001\u0000\u0000\u000023\u0005+\u0000\u00003\u000e\u0001"+
		"\u0000\u0000\u000045\u0005-\u0000\u00005\u0010\u0001\u0000\u0000\u0000"+
		"67\u0005c\u0000\u000078\u0005a\u0000\u000089\u0005l\u0000\u00009\u0012"+
		"\u0001\u0000\u0000\u0000:;\u0005c\u0000\u0000;<\u0005o\u0000\u0000<=\u0005"+
		"s\u0000\u0000=\u0014\u0001\u0000\u0000\u0000>?\u0005s\u0000\u0000?@\u0005"+
		"i\u0000\u0000@A\u0005n\u0000\u0000A\u0016\u0001\u0000\u0000\u0000BC\u0005"+
		"t\u0000\u0000CD\u0005a\u0000\u0000DE\u0005n\u0000\u0000E\u0018\u0001\u0000"+
		"\u0000\u0000FH\u0007\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000"+
		"JK\u0001\u0000\u0000\u0000KL\u0006\f\u0000\u0000L\u001a\u0001\u0000\u0000"+
		"\u0000\u0005\u0000\u001e$&I\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}