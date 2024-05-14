// Generated from /Users/emrekuru/Downloads/Bologna/ANTLR/PrologParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PrologParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, ATOM=3, VARIABLE=4, NUMBER=5, STRING=6, LPAR=7, RPAR=8, 
		COMMA=9, DOT=10, LE_OP=11, COLON_DASH=12;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_fact = 2, RULE_rule = 3, RULE_head = 4, 
		RULE_body = 5, RULE_predicate = 6, RULE_termList = 7, RULE_expression = 8, 
		RULE_term = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "fact", "rule", "head", "body", "predicate", 
			"termList", "expression", "term"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'('", "')'", "','", "'.'", 
			null, "':-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT", "ATOM", "VARIABLE", "NUMBER", "STRING", "LPAR", 
			"RPAR", "COMMA", "DOT", "LE_OP", "COLON_DASH"
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
	public String getGrammarFileName() { return "PrologParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PrologParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PrologParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATOM) {
				{
				{
				setState(20);
				statement();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
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
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(PrologParser.DOT, 0); }
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public RuleContext rule_() {
			return getRuleContext(RuleContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(28);
				fact();
				}
				break;
			case 2:
				{
				setState(29);
				rule_();
				}
				break;
			}
			setState(32);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
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
	public static class FactContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fact);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			predicate();
			}
		}
		catch (RecognitionException re) {
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
	public static class RuleContext extends ParserRuleContext {
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public TerminalNode COLON_DASH() { return getToken(PrologParser.COLON_DASH, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public RuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule; }
	}

	public final RuleContext rule_() throws RecognitionException {
		RuleContext _localctx = new RuleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			head();
			setState(37);
			match(COLON_DASH);
			setState(38);
			body();
			}
		}
		catch (RecognitionException re) {
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
	public static class HeadContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			predicate();
			}
		}
		catch (RecognitionException re) {
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
	public static class BodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			expression();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode ATOM() { return getToken(PrologParser.ATOM, 0); }
		public TerminalNode LPAR() { return getToken(PrologParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PrologParser.RPAR, 0); }
		public TermListContext termList() {
			return getRuleContext(TermListContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(ATOM);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(45);
				match(LPAR);
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 248L) != 0)) {
					{
					setState(46);
					termList();
					}
				}

				setState(49);
				match(RPAR);
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
	public static class TermListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PrologParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PrologParser.COMMA, i);
		}
		public TermListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termList; }
	}

	public final TermListContext termList() throws RecognitionException {
		TermListContext _localctx = new TermListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_termList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			expression();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(53);
				match(COMMA);
				setState(54);
				expression();
				}
				}
				setState(59);
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
	public static class ExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode LE_OP() { return getToken(PrologParser.LE_OP, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			term();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LE_OP) {
				{
				setState(61);
				match(LE_OP);
				setState(62);
				term();
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
	public static class TermContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(PrologParser.VARIABLE, 0); }
		public TerminalNode NUMBER() { return getToken(PrologParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(PrologParser.STRING, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(PrologParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PrologParser.RPAR, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_term);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(VARIABLE);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				match(STRING);
				}
				break;
			case ATOM:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				predicate();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				match(LPAR);
				setState(70);
				expression();
				setState(71);
				match(RPAR);
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

	public static final String _serializedATN =
		"\u0004\u0001\fL\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0005\u0000\u0016\b\u0000\n\u0000"+
		"\f\u0000\u0019\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u001f\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"0\b\u0006\u0001\u0006\u0003\u00063\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u00078\b\u0007\n\u0007\f\u0007;\t\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0003\b@\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\tJ\b\t\u0001\t\u0000\u0000\n\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0000\u0000K\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0002\u001e\u0001\u0000\u0000\u0000\u0004\"\u0001\u0000\u0000\u0000\u0006"+
		"$\u0001\u0000\u0000\u0000\b(\u0001\u0000\u0000\u0000\n*\u0001\u0000\u0000"+
		"\u0000\f,\u0001\u0000\u0000\u0000\u000e4\u0001\u0000\u0000\u0000\u0010"+
		"<\u0001\u0000\u0000\u0000\u0012I\u0001\u0000\u0000\u0000\u0014\u0016\u0003"+
		"\u0002\u0001\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0019\u0001"+
		"\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001"+
		"\u0000\u0000\u0000\u0018\u001a\u0001\u0000\u0000\u0000\u0019\u0017\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0005\u0000\u0000\u0001\u001b\u0001\u0001"+
		"\u0000\u0000\u0000\u001c\u001f\u0003\u0004\u0002\u0000\u001d\u001f\u0003"+
		"\u0006\u0003\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001d\u0001"+
		"\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 !\u0005\n\u0000\u0000"+
		"!\u0003\u0001\u0000\u0000\u0000\"#\u0003\f\u0006\u0000#\u0005\u0001\u0000"+
		"\u0000\u0000$%\u0003\b\u0004\u0000%&\u0005\f\u0000\u0000&\'\u0003\n\u0005"+
		"\u0000\'\u0007\u0001\u0000\u0000\u0000()\u0003\f\u0006\u0000)\t\u0001"+
		"\u0000\u0000\u0000*+\u0003\u0010\b\u0000+\u000b\u0001\u0000\u0000\u0000"+
		",2\u0005\u0003\u0000\u0000-/\u0005\u0007\u0000\u0000.0\u0003\u000e\u0007"+
		"\u0000/.\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000001\u0001\u0000"+
		"\u0000\u000013\u0005\b\u0000\u00002-\u0001\u0000\u0000\u000023\u0001\u0000"+
		"\u0000\u00003\r\u0001\u0000\u0000\u000049\u0003\u0010\b\u000056\u0005"+
		"\t\u0000\u000068\u0003\u0010\b\u000075\u0001\u0000\u0000\u00008;\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":\u000f\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<?\u0003\u0012"+
		"\t\u0000=>\u0005\u000b\u0000\u0000>@\u0003\u0012\t\u0000?=\u0001\u0000"+
		"\u0000\u0000?@\u0001\u0000\u0000\u0000@\u0011\u0001\u0000\u0000\u0000"+
		"AJ\u0005\u0004\u0000\u0000BJ\u0005\u0005\u0000\u0000CJ\u0005\u0006\u0000"+
		"\u0000DJ\u0003\f\u0006\u0000EF\u0005\u0007\u0000\u0000FG\u0003\u0010\b"+
		"\u0000GH\u0005\b\u0000\u0000HJ\u0001\u0000\u0000\u0000IA\u0001\u0000\u0000"+
		"\u0000IB\u0001\u0000\u0000\u0000IC\u0001\u0000\u0000\u0000ID\u0001\u0000"+
		"\u0000\u0000IE\u0001\u0000\u0000\u0000J\u0013\u0001\u0000\u0000\u0000"+
		"\u0007\u0017\u001e/29?I";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}