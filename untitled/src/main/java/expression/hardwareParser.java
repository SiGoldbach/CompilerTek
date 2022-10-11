// Generated from C:/Users/siggo/IdeaProjects/untitled/src/main/java/expression\hardware.g4 by ANTLR 4.10.1
package expression;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class hardwareParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, IDENTIFIER=14, BINARY=15, WHITESPACE=16, 
		KOMMENTAR=17, MULTILINECOMMENTS=18;
	public static final int
		RULE_start = 0, RULE_command = 1, RULE_expr = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "command", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.hardware'", "'.inputs'", "'.outputs'", "'.update'", "'='", "'.latch'", 
			"'->'", "'.simulate'", "'('", "')'", "'!'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "IDENTIFIER", "BINARY", "WHITESPACE", "KOMMENTAR", "MULTILINECOMMENTS"
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
	public String getGrammarFileName() { return "hardware.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public hardwareParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(hardwareParser.EOF, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardwareListener ) ((hardwareListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardwareListener ) ((hardwareListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hardwareVisitor ) return ((hardwareVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__7))) != 0)) {
				{
				{
				setState(6);
				command();
				}
				}
				setState(11);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(12);
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

	public static class CommandContext extends ParserRuleContext {
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	 
		public CommandContext() { }
		public void copyFrom(CommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InputContext extends CommandContext {
		public Token idp;
		public List<TerminalNode> IDENTIFIER() { return getTokens(hardwareParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(hardwareParser.IDENTIFIER, i);
		}
		public InputContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardwareListener ) ((hardwareListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardwareListener ) ((hardwareListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hardwareVisitor ) return ((hardwareVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OutputContext extends CommandContext {
		public Token idp;
		public List<TerminalNode> IDENTIFIER() { return getTokens(hardwareParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(hardwareParser.IDENTIFIER, i);
		}
		public OutputContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardwareListener ) ((hardwareListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardwareListener ) ((hardwareListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hardwareVisitor ) return ((hardwareVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimulateContext extends CommandContext {
		public Token id;
		public Token bin;
		public TerminalNode IDENTIFIER() { return getToken(hardwareParser.IDENTIFIER, 0); }
		public TerminalNode BINARY() { return getToken(hardwareParser.BINARY, 0); }
		public SimulateContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardwareListener ) ((hardwareListener)listener).enterSimulate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardwareListener ) ((hardwareListener)listener).exitSimulate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hardwareVisitor ) return ((hardwareVisitor<? extends T>)visitor).visitSimulate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LatchContext extends CommandContext {
		public Token id;
		public Token id2;
		public List<TerminalNode> IDENTIFIER() { return getTokens(hardwareParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(hardwareParser.IDENTIFIER, i);
		}
		public LatchContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardwareListener ) ((hardwareListener)listener).enterLatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardwareListener ) ((hardwareListener)listener).exitLatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hardwareVisitor ) return ((hardwareVisitor<? extends T>)visitor).visitLatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UpdateContext extends CommandContext {
		public Token id;
		public ExprContext ex;
		public List<TerminalNode> IDENTIFIER() { return getTokens(hardwareParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(hardwareParser.IDENTIFIER, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public UpdateContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardwareListener ) ((hardwareListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardwareListener ) ((hardwareListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hardwareVisitor ) return ((hardwareVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NameContext extends CommandContext {
		public Token id;
		public TerminalNode IDENTIFIER() { return getToken(hardwareParser.IDENTIFIER, 0); }
		public NameContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardwareListener ) ((hardwareListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardwareListener ) ((hardwareListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hardwareVisitor ) return ((hardwareVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		int _la;
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new NameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				match(T__0);
				setState(15);
				((NameContext)_localctx).id = match(IDENTIFIER);
				}
				break;
			case T__1:
				_localctx = new InputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				match(T__1);
				setState(18); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(17);
					((InputContext)_localctx).idp = match(IDENTIFIER);
					}
					}
					setState(20); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				}
				break;
			case T__2:
				_localctx = new OutputContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
				match(T__2);
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(23);
					((OutputContext)_localctx).idp = match(IDENTIFIER);
					}
					}
					setState(26); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				}
				break;
			case T__3:
				_localctx = new UpdateContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(28);
				match(T__3);
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(29);
					((UpdateContext)_localctx).id = match(IDENTIFIER);
					setState(30);
					match(T__4);
					setState(31);
					((UpdateContext)_localctx).ex = expr(0);
					}
					}
					setState(34); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				}
				break;
			case T__5:
				_localctx = new LatchContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(36);
				match(T__5);
				setState(37);
				((LatchContext)_localctx).id = match(IDENTIFIER);
				setState(38);
				match(T__6);
				setState(39);
				((LatchContext)_localctx).id2 = match(IDENTIFIER);
				}
				break;
			case T__7:
				_localctx = new SimulateContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(40);
				match(T__7);
				setState(41);
				((SimulateContext)_localctx).id = match(IDENTIFIER);
				setState(42);
				match(T__4);
				setState(43);
				((SimulateContext)_localctx).bin = match(BINARY);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotContext extends ExprContext {
		public ExprContext ex1;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardwareListener ) ((hardwareListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardwareListener ) ((hardwareListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hardwareVisitor ) return ((hardwareVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends ExprContext {
		public ExprContext ex1;
		public ExprContext ex2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardwareListener ) ((hardwareListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardwareListener ) ((hardwareListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hardwareVisitor ) return ((hardwareVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParanthesisContext extends ExprContext {
		public ExprContext ex1;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParanthesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardwareListener ) ((hardwareListener)listener).enterParanthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardwareListener ) ((hardwareListener)listener).exitParanthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hardwareVisitor ) return ((hardwareVisitor<? extends T>)visitor).visitParanthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ExprContext {
		public ExprContext ex1;
		public ExprContext ex2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardwareListener ) ((hardwareListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardwareListener ) ((hardwareListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hardwareVisitor ) return ((hardwareVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinexprContext extends ExprContext {
		public Token id;
		public TerminalNode IDENTIFIER() { return getToken(hardwareParser.IDENTIFIER, 0); }
		public BinexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardwareListener ) ((hardwareListener)listener).enterBinexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardwareListener ) ((hardwareListener)listener).exitBinexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hardwareVisitor ) return ((hardwareVisitor<? extends T>)visitor).visitBinexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				{
				_localctx = new ParanthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(47);
				match(T__8);
				setState(48);
				((ParanthesisContext)_localctx).ex1 = expr(0);
				setState(49);
				match(T__9);
				}
				break;
			case T__10:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				{
				setState(51);
				match(T__10);
				}
				setState(52);
				((NotContext)_localctx).ex1 = expr(4);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new BinexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				((BinexprContext)_localctx).id = match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(62);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new ExprContext(_parentctx, _parentState));
						((AndContext)_localctx).ex1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(56);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						{
						setState(57);
						match(T__11);
						}
						setState(58);
						((AndContext)_localctx).ex2 = expr(4);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new ExprContext(_parentctx, _parentState));
						((OrContext)_localctx).ex1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(59);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						{
						setState(60);
						match(T__12);
						}
						setState(61);
						((OrContext)_localctx).ex2 = expr(3);
						}
						break;
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0012D\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0005\u0000\b\b\u0000\n\u0000\f\u0000\u000b"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0004\u0001\u0013\b\u0001\u000b\u0001\f\u0001\u0014\u0001\u0001"+
		"\u0001\u0001\u0004\u0001\u0019\b\u0001\u000b\u0001\f\u0001\u001a\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001!\b\u0001\u000b"+
		"\u0001\f\u0001\"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001-\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u00027\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002?\b\u0002\n\u0002"+
		"\f\u0002B\t\u0002\u0001\u0002\u0000\u0001\u0004\u0003\u0000\u0002\u0004"+
		"\u0000\u0000M\u0000\t\u0001\u0000\u0000\u0000\u0002,\u0001\u0000\u0000"+
		"\u0000\u00046\u0001\u0000\u0000\u0000\u0006\b\u0003\u0002\u0001\u0000"+
		"\u0007\u0006\u0001\u0000\u0000\u0000\b\u000b\u0001\u0000\u0000\u0000\t"+
		"\u0007\u0001\u0000\u0000\u0000\t\n\u0001\u0000\u0000\u0000\n\f\u0001\u0000"+
		"\u0000\u0000\u000b\t\u0001\u0000\u0000\u0000\f\r\u0005\u0000\u0000\u0001"+
		"\r\u0001\u0001\u0000\u0000\u0000\u000e\u000f\u0005\u0001\u0000\u0000\u000f"+
		"-\u0005\u000e\u0000\u0000\u0010\u0012\u0005\u0002\u0000\u0000\u0011\u0013"+
		"\u0005\u000e\u0000\u0000\u0012\u0011\u0001\u0000\u0000\u0000\u0013\u0014"+
		"\u0001\u0000\u0000\u0000\u0014\u0012\u0001\u0000\u0000\u0000\u0014\u0015"+
		"\u0001\u0000\u0000\u0000\u0015-\u0001\u0000\u0000\u0000\u0016\u0018\u0005"+
		"\u0003\u0000\u0000\u0017\u0019\u0005\u000e\u0000\u0000\u0018\u0017\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u0018\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b-\u0001\u0000"+
		"\u0000\u0000\u001c \u0005\u0004\u0000\u0000\u001d\u001e\u0005\u000e\u0000"+
		"\u0000\u001e\u001f\u0005\u0005\u0000\u0000\u001f!\u0003\u0004\u0002\u0000"+
		" \u001d\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\" \u0001\u0000"+
		"\u0000\u0000\"#\u0001\u0000\u0000\u0000#-\u0001\u0000\u0000\u0000$%\u0005"+
		"\u0006\u0000\u0000%&\u0005\u000e\u0000\u0000&\'\u0005\u0007\u0000\u0000"+
		"\'-\u0005\u000e\u0000\u0000()\u0005\b\u0000\u0000)*\u0005\u000e\u0000"+
		"\u0000*+\u0005\u0005\u0000\u0000+-\u0005\u000f\u0000\u0000,\u000e\u0001"+
		"\u0000\u0000\u0000,\u0010\u0001\u0000\u0000\u0000,\u0016\u0001\u0000\u0000"+
		"\u0000,\u001c\u0001\u0000\u0000\u0000,$\u0001\u0000\u0000\u0000,(\u0001"+
		"\u0000\u0000\u0000-\u0003\u0001\u0000\u0000\u0000./\u0006\u0002\uffff"+
		"\uffff\u0000/0\u0005\t\u0000\u000001\u0003\u0004\u0002\u000012\u0005\n"+
		"\u0000\u000027\u0001\u0000\u0000\u000034\u0005\u000b\u0000\u000047\u0003"+
		"\u0004\u0002\u000457\u0005\u000e\u0000\u00006.\u0001\u0000\u0000\u0000"+
		"63\u0001\u0000\u0000\u000065\u0001\u0000\u0000\u00007@\u0001\u0000\u0000"+
		"\u000089\n\u0003\u0000\u00009:\u0005\f\u0000\u0000:?\u0003\u0004\u0002"+
		"\u0004;<\n\u0002\u0000\u0000<=\u0005\r\u0000\u0000=?\u0003\u0004\u0002"+
		"\u0003>8\u0001\u0000\u0000\u0000>;\u0001\u0000\u0000\u0000?B\u0001\u0000"+
		"\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A\u0005"+
		"\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000\b\t\u0014\u001a\","+
		"6>@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}