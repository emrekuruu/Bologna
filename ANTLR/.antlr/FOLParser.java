// Generated from /Users/emrekuru/Downloads/Bologna/ANTLR/FOL.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FOLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VARIABLE=1, CONSTANT=2, LPAREN=3, RPAREN=4, AND=5, OR=6, NOT=7, IMPLIES=8, 
		FORALL=9, EXISTS=10, COMMA=11, WS=12;
	public static final int
		RULE_expression = 0, RULE_formula = 1, RULE_atomicFormula = 2, RULE_termList = 3, 
		RULE_term = 4, RULE_function = 5, RULE_predicate = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression", "formula", "atomicFormula", "termList", "term", "function", 
			"predicate"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'('", "')'", "'\\u2227'", "'\\u2228'", "'\\u00AC'", 
			"'\\u2192'", "'\\u2200'", "'\\u2203'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VARIABLE", "CONSTANT", "LPAREN", "RPAREN", "AND", "OR", "NOT", 
			"IMPLIES", "FORALL", "EXISTS", "COMMA", "WS"
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
	public String getGrammarFileName() { return "FOL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FOLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				formula();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1676L) != 0) );
			}
		}
		catch (RecognitionException re) {
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
	public static class FormulaContext extends ParserRuleContext {
		public AtomicFormulaContext atomicFormula() {
			return getRuleContext(AtomicFormulaContext.class,0);
		}
		public TerminalNode NOT() { return getToken(FOLParser.NOT, 0); }
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(FOLParser.LPAREN, 0); }
		public TerminalNode AND() { return getToken(FOLParser.AND, 0); }
		public TerminalNode RPAREN() { return getToken(FOLParser.RPAREN, 0); }
		public TerminalNode OR() { return getToken(FOLParser.OR, 0); }
		public TerminalNode IMPLIES() { return getToken(FOLParser.IMPLIES, 0); }
		public TerminalNode FORALL() { return getToken(FOLParser.FORALL, 0); }
		public TerminalNode VARIABLE() { return getToken(FOLParser.VARIABLE, 0); }
		public TerminalNode EXISTS() { return getToken(FOLParser.EXISTS, 0); }
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
	}

	public final FormulaContext formula() throws RecognitionException {
		FormulaContext _localctx = new FormulaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_formula);
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				atomicFormula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				match(NOT);
				setState(21);
				formula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
				match(LPAREN);
				setState(23);
				formula();
				setState(24);
				match(AND);
				setState(25);
				formula();
				setState(26);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(28);
				match(LPAREN);
				setState(29);
				formula();
				setState(30);
				match(OR);
				setState(31);
				formula();
				setState(32);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(34);
				match(LPAREN);
				setState(35);
				formula();
				setState(36);
				match(IMPLIES);
				setState(37);
				formula();
				setState(38);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(40);
				match(FORALL);
				setState(41);
				match(VARIABLE);
				setState(42);
				formula();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(43);
				match(EXISTS);
				setState(44);
				match(VARIABLE);
				setState(45);
				formula();
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
	public static class AtomicFormulaContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(FOLParser.LPAREN, 0); }
		public TermListContext termList() {
			return getRuleContext(TermListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FOLParser.RPAREN, 0); }
		public AtomicFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicFormula; }
	}

	public final AtomicFormulaContext atomicFormula() throws RecognitionException {
		AtomicFormulaContext _localctx = new AtomicFormulaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atomicFormula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			predicate();
			setState(49);
			match(LPAREN);
			setState(50);
			termList();
			setState(51);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
	public static class TermListContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FOLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FOLParser.COMMA, i);
		}
		public TermListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termList; }
	}

	public final TermListContext termList() throws RecognitionException {
		TermListContext _localctx = new TermListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_termList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			term();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(54);
				match(COMMA);
				setState(55);
				term();
				}
				}
				setState(60);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(FOLParser.VARIABLE, 0); }
		public TerminalNode CONSTANT() { return getToken(FOLParser.CONSTANT, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_term);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(VARIABLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(CONSTANT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				function();
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
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(FOLParser.VARIABLE, 0); }
		public TerminalNode LPAREN() { return getToken(FOLParser.LPAREN, 0); }
		public TermListContext termList() {
			return getRuleContext(TermListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FOLParser.RPAREN, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(VARIABLE);
			setState(67);
			match(LPAREN);
			setState(68);
			termList();
			setState(69);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
	public static class PredicateContext extends ParserRuleContext {
		public TerminalNode CONSTANT() { return getToken(FOLParser.CONSTANT, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(CONSTANT);
			}
		}
		catch (RecognitionException re) {
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
		"\u0004\u0001\fJ\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0004\u0000\u0010"+
		"\b\u0000\u000b\u0000\f\u0000\u0011\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001/\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u00039\b\u0003"+
		"\n\u0003\f\u0003<\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"A\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0000\u0000\u0007\u0000\u0002\u0004"+
		"\u0006\b\n\f\u0000\u0000L\u0000\u000f\u0001\u0000\u0000\u0000\u0002.\u0001"+
		"\u0000\u0000\u0000\u00040\u0001\u0000\u0000\u0000\u00065\u0001\u0000\u0000"+
		"\u0000\b@\u0001\u0000\u0000\u0000\nB\u0001\u0000\u0000\u0000\fG\u0001"+
		"\u0000\u0000\u0000\u000e\u0010\u0003\u0002\u0001\u0000\u000f\u000e\u0001"+
		"\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u000f\u0001"+
		"\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0001\u0001"+
		"\u0000\u0000\u0000\u0013/\u0003\u0004\u0002\u0000\u0014\u0015\u0005\u0007"+
		"\u0000\u0000\u0015/\u0003\u0002\u0001\u0000\u0016\u0017\u0005\u0003\u0000"+
		"\u0000\u0017\u0018\u0003\u0002\u0001\u0000\u0018\u0019\u0005\u0005\u0000"+
		"\u0000\u0019\u001a\u0003\u0002\u0001\u0000\u001a\u001b\u0005\u0004\u0000"+
		"\u0000\u001b/\u0001\u0000\u0000\u0000\u001c\u001d\u0005\u0003\u0000\u0000"+
		"\u001d\u001e\u0003\u0002\u0001\u0000\u001e\u001f\u0005\u0006\u0000\u0000"+
		"\u001f \u0003\u0002\u0001\u0000 !\u0005\u0004\u0000\u0000!/\u0001\u0000"+
		"\u0000\u0000\"#\u0005\u0003\u0000\u0000#$\u0003\u0002\u0001\u0000$%\u0005"+
		"\b\u0000\u0000%&\u0003\u0002\u0001\u0000&\'\u0005\u0004\u0000\u0000\'"+
		"/\u0001\u0000\u0000\u0000()\u0005\t\u0000\u0000)*\u0005\u0001\u0000\u0000"+
		"*/\u0003\u0002\u0001\u0000+,\u0005\n\u0000\u0000,-\u0005\u0001\u0000\u0000"+
		"-/\u0003\u0002\u0001\u0000.\u0013\u0001\u0000\u0000\u0000.\u0014\u0001"+
		"\u0000\u0000\u0000.\u0016\u0001\u0000\u0000\u0000.\u001c\u0001\u0000\u0000"+
		"\u0000.\"\u0001\u0000\u0000\u0000.(\u0001\u0000\u0000\u0000.+\u0001\u0000"+
		"\u0000\u0000/\u0003\u0001\u0000\u0000\u000001\u0003\f\u0006\u000012\u0005"+
		"\u0003\u0000\u000023\u0003\u0006\u0003\u000034\u0005\u0004\u0000\u0000"+
		"4\u0005\u0001\u0000\u0000\u00005:\u0003\b\u0004\u000067\u0005\u000b\u0000"+
		"\u000079\u0003\b\u0004\u000086\u0001\u0000\u0000\u00009<\u0001\u0000\u0000"+
		"\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;\u0007\u0001"+
		"\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=A\u0005\u0001\u0000\u0000"+
		">A\u0005\u0002\u0000\u0000?A\u0003\n\u0005\u0000@=\u0001\u0000\u0000\u0000"+
		"@>\u0001\u0000\u0000\u0000@?\u0001\u0000\u0000\u0000A\t\u0001\u0000\u0000"+
		"\u0000BC\u0005\u0001\u0000\u0000CD\u0005\u0003\u0000\u0000DE\u0003\u0006"+
		"\u0003\u0000EF\u0005\u0004\u0000\u0000F\u000b\u0001\u0000\u0000\u0000"+
		"GH\u0005\u0002\u0000\u0000H\r\u0001\u0000\u0000\u0000\u0004\u0011.:@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}