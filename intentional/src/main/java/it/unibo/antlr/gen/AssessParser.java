// Generated from Assess.g4 by ANTLR 4.10.1

package it.unibo.antlr.gen;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AssessParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, IN=23, AND=24, NOT=25, 
		TRUE=26, FALSE=27, GT=28, GE=29, LT=30, LE=31, EQ=32, DECIMAL=33, INT=34, 
		ID=35, WS=36;
	public static final int
		RULE_assess = 0, RULE_id = 1, RULE_benchmark = 2, RULE_function = 3, RULE_label = 4, 
		RULE_interval = 5, RULE_clause = 6, RULE_condition = 7, RULE_value = 8, 
		RULE_comparator = 9, RULE_binary = 10, RULE_bool = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"assess", "id", "benchmark", "function", "label", "interval", "clause", 
			"condition", "value", "comparator", "binary", "bool"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'with'", "'WITH'", "'for'", "'FOR'", "'by'", "','", "'assess'", 
			"'ASSESS'", "'against'", "'AGAINST'", "'using'", "'USING'", "'labels'", 
			"'scaled'", "'past'", "'('", "')'", "'{'", "'}'", "'['", "']'", "':'", 
			null, null, null, null, null, "'>'", "'>='", "'<'", "'<='", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "IN", 
			"AND", "NOT", "TRUE", "FALSE", "GT", "GE", "LT", "LE", "EQ", "DECIMAL", 
			"INT", "ID", "WS"
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
	public String getGrammarFileName() { return "Assess.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AssessParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class AssessContext extends ParserRuleContext {
		public IdContext cube;
		public ClauseContext sc;
		public IdContext id;
		public List<IdContext> gc = new ArrayList<IdContext>();
		public List<IdContext> mcs = new ArrayList<IdContext>();
		public BenchmarkContext bc;
		public FunctionContext as;
		public LabelContext l;
		public TerminalNode EOF() { return getToken(AssessParser.EOF, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<ClauseContext> clause() {
			return getRuleContexts(ClauseContext.class);
		}
		public ClauseContext clause(int i) {
			return getRuleContext(ClauseContext.class,i);
		}
		public BenchmarkContext benchmark() {
			return getRuleContext(BenchmarkContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public AssessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).enterAssess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).exitAssess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssessVisitor ) return ((AssessVisitor<? extends T>)visitor).visitAssess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssessContext assess() throws RecognitionException {
		AssessContext _localctx = new AssessContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_assess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(25);
			((AssessContext)_localctx).cube = id();
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(26);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(27);
				((AssessContext)_localctx).sc = clause();
				}
				break;
			}
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(30);
				match(T__4);
				setState(31);
				((AssessContext)_localctx).id = id();
				((AssessContext)_localctx).gc.add(((AssessContext)_localctx).id);
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(32);
					match(T__5);
					setState(33);
					((AssessContext)_localctx).id = id();
					((AssessContext)_localctx).gc.add(((AssessContext)_localctx).id);
					}
					}
					setState(38);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2 || _la==T__3) {
				{
				setState(41);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(42);
				((AssessContext)_localctx).sc = clause();
				}
			}

			setState(45);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(46);
			((AssessContext)_localctx).id = id();
			((AssessContext)_localctx).mcs.add(((AssessContext)_localctx).id);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(47);
				match(T__5);
				setState(48);
				((AssessContext)_localctx).id = id();
				((AssessContext)_localctx).mcs.add(((AssessContext)_localctx).id);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__9) {
				{
				setState(54);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__9) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(55);
				((AssessContext)_localctx).bc = benchmark();
				}
			}

			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10 || _la==T__11) {
				{
				setState(58);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(59);
				((AssessContext)_localctx).as = function();
				}
			}

			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(62);
				_la = _input.LA(1);
				if ( !(_la==T__12) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(63);
				((AssessContext)_localctx).l = label();
				}
			}

			setState(66);
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

	public static class IdContext extends ParserRuleContext {
		public String name;
		public Token ID;
		public TerminalNode ID() { return getToken(AssessParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssessVisitor ) return ((AssessVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			((IdContext)_localctx).ID = match(ID);
			 ((IdContext)_localctx).name =  (((IdContext)_localctx).ID!=null?((IdContext)_localctx).ID.getText():null); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BenchmarkContext extends ParserRuleContext {
		public BenchmarkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_benchmark; }
	 
		public BenchmarkContext() { }
		public void copyFrom(BenchmarkContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParentContext extends BenchmarkContext {
		public IdContext attr;
		public IdContext weight;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public ParentContext(BenchmarkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).enterParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).exitParent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssessVisitor ) return ((AssessVisitor<? extends T>)visitor).visitParent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SiblingContext extends BenchmarkContext {
		public IdContext attr;
		public ComparatorContext op;
		public ValueContext value;
		public List<ValueContext> val = new ArrayList<ValueContext>();
		public IdContext weight;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public SiblingContext(BenchmarkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).enterSibling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).exitSibling(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssessVisitor ) return ((AssessVisitor<? extends T>)visitor).visitSibling(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PastContext extends BenchmarkContext {
		public Token val;
		public TerminalNode DECIMAL() { return getToken(AssessParser.DECIMAL, 0); }
		public PastContext(BenchmarkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).enterPast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).exitPast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssessVisitor ) return ((AssessVisitor<? extends T>)visitor).visitPast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TargetContext extends BenchmarkContext {
		public Token val;
		public TerminalNode DECIMAL() { return getToken(AssessParser.DECIMAL, 0); }
		public TargetContext(BenchmarkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).enterTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).exitTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssessVisitor ) return ((AssessVisitor<? extends T>)visitor).visitTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BenchmarkContext benchmark() throws RecognitionException {
		BenchmarkContext _localctx = new BenchmarkContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_benchmark);
		int _la;
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new TargetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				((TargetContext)_localctx).val = match(DECIMAL);
				}
				break;
			case 2:
				_localctx = new SiblingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				((SiblingContext)_localctx).attr = id();
				setState(73);
				((SiblingContext)_localctx).op = comparator();
				setState(74);
				((SiblingContext)_localctx).value = value();
				((SiblingContext)_localctx).val.add(((SiblingContext)_localctx).value);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(75);
					match(T__13);
					setState(76);
					((SiblingContext)_localctx).weight = id();
					}
				}

				}
				break;
			case 3:
				_localctx = new ParentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				((ParentContext)_localctx).attr = id();
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(80);
					match(T__13);
					setState(81);
					((ParentContext)_localctx).weight = id();
					}
				}

				}
				break;
			case 4:
				_localctx = new PastContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				match(T__14);
				setState(85);
				((PastContext)_localctx).val = match(DECIMAL);
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NestedFunctionContext extends FunctionContext {
		public IdContext fun;
		public FunctionContext function;
		public List<FunctionContext> functions = new ArrayList<FunctionContext>();
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public NestedFunctionContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).enterNestedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).exitNestedFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssessVisitor ) return ((AssessVisitor<? extends T>)visitor).visitNestedFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParametricFunctionContext extends FunctionContext {
		public IdContext fun;
		public Token ID;
		public List<Token> params = new ArrayList<Token>();
		public Token DECIMAL;
		public Token _tset266;
		public Token _tset277;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(AssessParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AssessParser.ID, i);
		}
		public List<TerminalNode> DECIMAL() { return getTokens(AssessParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(AssessParser.DECIMAL, i);
		}
		public ParametricFunctionContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).enterParametricFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).exitParametricFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssessVisitor ) return ((AssessVisitor<? extends T>)visitor).visitParametricFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new NestedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				((NestedFunctionContext)_localctx).fun = id();
				setState(89);
				match(T__15);
				setState(90);
				((NestedFunctionContext)_localctx).function = function();
				((NestedFunctionContext)_localctx).functions.add(((NestedFunctionContext)_localctx).function);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(91);
					match(T__5);
					setState(92);
					((NestedFunctionContext)_localctx).function = function();
					((NestedFunctionContext)_localctx).functions.add(((NestedFunctionContext)_localctx).function);
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(98);
				match(T__16);
				}
				break;
			case 2:
				_localctx = new ParametricFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				((ParametricFunctionContext)_localctx).fun = id();
				setState(101);
				match(T__15);
				setState(102);
				((ParametricFunctionContext)_localctx)._tset266 = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DECIMAL || _la==ID) ) {
					((ParametricFunctionContext)_localctx)._tset266 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((ParametricFunctionContext)_localctx).params.add(((ParametricFunctionContext)_localctx)._tset266);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(103);
					match(T__5);
					setState(104);
					((ParametricFunctionContext)_localctx)._tset277 = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==DECIMAL || _la==ID) ) {
						((ParametricFunctionContext)_localctx)._tset277 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					((ParametricFunctionContext)_localctx).params.add(((ParametricFunctionContext)_localctx)._tset277);
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(110);
				match(T__16);
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

	public static class LabelContext extends ParserRuleContext {
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
	 
		public LabelContext() { }
		public void copyFrom(LabelContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UselessContext extends LabelContext {
		public List<IntervalContext> interval() {
			return getRuleContexts(IntervalContext.class);
		}
		public IntervalContext interval(int i) {
			return getRuleContext(IntervalContext.class,i);
		}
		public UselessContext(LabelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).enterUseless(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).exitUseless(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssessVisitor ) return ((AssessVisitor<? extends T>)visitor).visitUseless(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Label_intContext extends LabelContext {
		public IdContext lbl;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Label_intContext(LabelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).enterLabel_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).exitLabel_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssessVisitor ) return ((AssessVisitor<? extends T>)visitor).visitLabel_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_label);
		int _la;
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new Label_intContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				((Label_intContext)_localctx).lbl = id();
				}
				break;
			case T__17:
				_localctx = new UselessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(T__17);
				setState(116);
				interval();
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(117);
					match(T__5);
					setState(118);
					interval();
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(124);
				match(T__18);
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

	public static class IntervalContext extends ParserRuleContext {
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
	 
		public IntervalContext() { }
		public void copyFrom(IntervalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Label_funContext extends IntervalContext {
		public Token fr;
		public Token to;
		public IdContext l;
		public List<TerminalNode> DECIMAL() { return getTokens(AssessParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(AssessParser.DECIMAL, i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Label_funContext(IntervalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).enterLabel_fun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).exitLabel_fun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssessVisitor ) return ((AssessVisitor<? extends T>)visitor).visitLabel_fun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_interval);
		int _la;
		try {
			_localctx = new Label_funContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__19) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(129);
			((Label_funContext)_localctx).fr = match(DECIMAL);
			setState(130);
			match(T__5);
			setState(131);
			((Label_funContext)_localctx).to = match(DECIMAL);
			setState(132);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__20) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(133);
			match(T__21);
			setState(134);
			((Label_funContext)_localctx).l = id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClauseContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<BinaryContext> binary() {
			return getRuleContexts(BinaryContext.class);
		}
		public BinaryContext binary(int i) {
			return getRuleContext(BinaryContext.class,i);
		}
		public ClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).enterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).exitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssessVisitor ) return ((AssessVisitor<? extends T>)visitor).visitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClauseContext clause() throws RecognitionException {
		ClauseContext _localctx = new ClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			condition();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(137);
				binary();
				setState(138);
				condition();
				}
				}
				setState(144);
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

	public static class ConditionContext extends ParserRuleContext {
		public IdContext attr;
		public ComparatorContext op;
		public ValueContext value;
		public List<ValueContext> val = new ArrayList<ValueContext>();
		public Token in;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode IN() { return getToken(AssessParser.IN, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssessVisitor ) return ((AssessVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condition);
		int _la;
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				((ConditionContext)_localctx).attr = id();
				setState(146);
				((ConditionContext)_localctx).op = comparator();
				setState(147);
				((ConditionContext)_localctx).value = value();
				((ConditionContext)_localctx).val.add(((ConditionContext)_localctx).value);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				((ConditionContext)_localctx).attr = id();
				setState(150);
				((ConditionContext)_localctx).in = match(IN);
				setState(151);
				match(T__15);
				setState(152);
				((ConditionContext)_localctx).value = value();
				((ConditionContext)_localctx).val.add(((ConditionContext)_localctx).value);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(153);
					match(T__5);
					setState(154);
					((ConditionContext)_localctx).value = value();
					((ConditionContext)_localctx).val.add(((ConditionContext)_localctx).value);
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(160);
				match(T__16);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AssessParser.ID, 0); }
		public TerminalNode DECIMAL() { return getToken(AssessParser.DECIMAL, 0); }
		public TerminalNode INT() { return getToken(AssessParser.INT, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssessVisitor ) return ((AssessVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_value);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(ID);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(DECIMAL);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				match(INT);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				bool();
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

	public static class ComparatorContext extends ParserRuleContext {
		public TerminalNode GE() { return getToken(AssessParser.GE, 0); }
		public TerminalNode LE() { return getToken(AssessParser.LE, 0); }
		public TerminalNode EQ() { return getToken(AssessParser.EQ, 0); }
		public TerminalNode GT() { return getToken(AssessParser.GT, 0); }
		public TerminalNode LT() { return getToken(AssessParser.LT, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).enterComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).exitComparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssessVisitor ) return ((AssessVisitor<? extends T>)visitor).visitComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << EQ))) != 0)) ) {
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

	public static class BinaryContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(AssessParser.AND, 0); }
		public BinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).exitBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssessVisitor ) return ((AssessVisitor<? extends T>)visitor).visitBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryContext binary() throws RecognitionException {
		BinaryContext _localctx = new BinaryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_binary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(AND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(AssessParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(AssessParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssessListener ) ((AssessListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssessVisitor ) return ((AssessVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001$\u00b1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u001d\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000#\b\u0000\n\u0000"+
		"\f\u0000&\t\u0000\u0003\u0000(\b\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		",\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"2\b\u0000\n\u0000\f\u00005\t\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"9\b\u0000\u0001\u0000\u0001\u0000\u0003\u0000=\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000A\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002N\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002S\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002W\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"^\b\u0003\n\u0003\f\u0003a\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003j\b\u0003"+
		"\n\u0003\f\u0003m\t\u0003\u0001\u0003\u0001\u0003\u0003\u0003q\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"x\b\u0004\n\u0004\f\u0004{\t\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u007f\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u008d\b\u0006\n\u0006\f\u0006\u0090\t\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u009c\b\u0007\n"+
		"\u0007\f\u0007\u009f\t\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00a3"+
		"\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00a9\b\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0000\u0000\f\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u000b\u0001"+
		"\u0000\u0001\u0002\u0001\u0000\u0003\u0004\u0001\u0000\u0007\b\u0001\u0000"+
		"\t\n\u0001\u0000\u000b\f\u0001\u0000\r\r\u0002\u0000!!##\u0002\u0000\u0010"+
		"\u0010\u0014\u0014\u0002\u0000\u0011\u0011\u0015\u0015\u0001\u0000\u001c"+
		" \u0001\u0000\u001a\u001b\u00bc\u0000\u0018\u0001\u0000\u0000\u0000\u0002"+
		"D\u0001\u0000\u0000\u0000\u0004V\u0001\u0000\u0000\u0000\u0006p\u0001"+
		"\u0000\u0000\u0000\b~\u0001\u0000\u0000\u0000\n\u0080\u0001\u0000\u0000"+
		"\u0000\f\u0088\u0001\u0000\u0000\u0000\u000e\u00a2\u0001\u0000\u0000\u0000"+
		"\u0010\u00a8\u0001\u0000\u0000\u0000\u0012\u00aa\u0001\u0000\u0000\u0000"+
		"\u0014\u00ac\u0001\u0000\u0000\u0000\u0016\u00ae\u0001\u0000\u0000\u0000"+
		"\u0018\u0019\u0007\u0000\u0000\u0000\u0019\u001c\u0003\u0002\u0001\u0000"+
		"\u001a\u001b\u0007\u0001\u0000\u0000\u001b\u001d\u0003\f\u0006\u0000\u001c"+
		"\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d"+
		"\'\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u0005\u0000\u0000\u001f$"+
		"\u0003\u0002\u0001\u0000 !\u0005\u0006\u0000\u0000!#\u0003\u0002\u0001"+
		"\u0000\" \u0001\u0000\u0000\u0000#&\u0001\u0000\u0000\u0000$\"\u0001\u0000"+
		"\u0000\u0000$%\u0001\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001"+
		"\u0000\u0000\u0000\'\u001e\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000"+
		"\u0000(+\u0001\u0000\u0000\u0000)*\u0007\u0001\u0000\u0000*,\u0003\f\u0006"+
		"\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0001\u0000"+
		"\u0000\u0000-.\u0007\u0002\u0000\u0000.3\u0003\u0002\u0001\u0000/0\u0005"+
		"\u0006\u0000\u000002\u0003\u0002\u0001\u00001/\u0001\u0000\u0000\u0000"+
		"25\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000"+
		"\u000048\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000067\u0007\u0003"+
		"\u0000\u000079\u0003\u0004\u0002\u000086\u0001\u0000\u0000\u000089\u0001"+
		"\u0000\u0000\u00009<\u0001\u0000\u0000\u0000:;\u0007\u0004\u0000\u0000"+
		";=\u0003\u0006\u0003\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000"+
		"\u0000=@\u0001\u0000\u0000\u0000>?\u0007\u0005\u0000\u0000?A\u0003\b\u0004"+
		"\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0001\u0000"+
		"\u0000\u0000BC\u0005\u0000\u0000\u0001C\u0001\u0001\u0000\u0000\u0000"+
		"DE\u0005#\u0000\u0000EF\u0006\u0001\uffff\uffff\u0000F\u0003\u0001\u0000"+
		"\u0000\u0000GW\u0005!\u0000\u0000HI\u0003\u0002\u0001\u0000IJ\u0003\u0012"+
		"\t\u0000JM\u0003\u0010\b\u0000KL\u0005\u000e\u0000\u0000LN\u0003\u0002"+
		"\u0001\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NW\u0001"+
		"\u0000\u0000\u0000OR\u0003\u0002\u0001\u0000PQ\u0005\u000e\u0000\u0000"+
		"QS\u0003\u0002\u0001\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000"+
		"\u0000SW\u0001\u0000\u0000\u0000TU\u0005\u000f\u0000\u0000UW\u0005!\u0000"+
		"\u0000VG\u0001\u0000\u0000\u0000VH\u0001\u0000\u0000\u0000VO\u0001\u0000"+
		"\u0000\u0000VT\u0001\u0000\u0000\u0000W\u0005\u0001\u0000\u0000\u0000"+
		"XY\u0003\u0002\u0001\u0000YZ\u0005\u0010\u0000\u0000Z_\u0003\u0006\u0003"+
		"\u0000[\\\u0005\u0006\u0000\u0000\\^\u0003\u0006\u0003\u0000][\u0001\u0000"+
		"\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001"+
		"\u0000\u0000\u0000`b\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"bc\u0005\u0011\u0000\u0000cq\u0001\u0000\u0000\u0000de\u0003\u0002\u0001"+
		"\u0000ef\u0005\u0010\u0000\u0000fk\u0007\u0006\u0000\u0000gh\u0005\u0006"+
		"\u0000\u0000hj\u0007\u0006\u0000\u0000ig\u0001\u0000\u0000\u0000jm\u0001"+
		"\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000"+
		"ln\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000no\u0005\u0011\u0000"+
		"\u0000oq\u0001\u0000\u0000\u0000pX\u0001\u0000\u0000\u0000pd\u0001\u0000"+
		"\u0000\u0000q\u0007\u0001\u0000\u0000\u0000r\u007f\u0003\u0002\u0001\u0000"+
		"st\u0005\u0012\u0000\u0000ty\u0003\n\u0005\u0000uv\u0005\u0006\u0000\u0000"+
		"vx\u0003\n\u0005\u0000wu\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000"+
		"yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000"+
		"\u0000{y\u0001\u0000\u0000\u0000|}\u0005\u0013\u0000\u0000}\u007f\u0001"+
		"\u0000\u0000\u0000~r\u0001\u0000\u0000\u0000~s\u0001\u0000\u0000\u0000"+
		"\u007f\t\u0001\u0000\u0000\u0000\u0080\u0081\u0007\u0007\u0000\u0000\u0081"+
		"\u0082\u0005!\u0000\u0000\u0082\u0083\u0005\u0006\u0000\u0000\u0083\u0084"+
		"\u0005!\u0000\u0000\u0084\u0085\u0007\b\u0000\u0000\u0085\u0086\u0005"+
		"\u0016\u0000\u0000\u0086\u0087\u0003\u0002\u0001\u0000\u0087\u000b\u0001"+
		"\u0000\u0000\u0000\u0088\u008e\u0003\u000e\u0007\u0000\u0089\u008a\u0003"+
		"\u0014\n\u0000\u008a\u008b\u0003\u000e\u0007\u0000\u008b\u008d\u0001\u0000"+
		"\u0000\u0000\u008c\u0089\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000"+
		"\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000"+
		"\u0000\u0000\u008f\r\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0003\u0002\u0001\u0000\u0092\u0093\u0003\u0012\t\u0000"+
		"\u0093\u0094\u0003\u0010\b\u0000\u0094\u00a3\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0003\u0002\u0001\u0000\u0096\u0097\u0005\u0017\u0000\u0000\u0097"+
		"\u0098\u0005\u0010\u0000\u0000\u0098\u009d\u0003\u0010\b\u0000\u0099\u009a"+
		"\u0005\u0006\u0000\u0000\u009a\u009c\u0003\u0010\b\u0000\u009b\u0099\u0001"+
		"\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a0\u0001"+
		"\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005"+
		"\u0011\u0000\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u0091\u0001"+
		"\u0000\u0000\u0000\u00a2\u0095\u0001\u0000\u0000\u0000\u00a3\u000f\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a9\u0005#\u0000\u0000\u00a5\u00a9\u0005!\u0000"+
		"\u0000\u00a6\u00a9\u0005\"\u0000\u0000\u00a7\u00a9\u0003\u0016\u000b\u0000"+
		"\u00a8\u00a4\u0001\u0000\u0000\u0000\u00a8\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a9\u0011\u0001\u0000\u0000\u0000\u00aa\u00ab\u0007\t\u0000\u0000\u00ab"+
		"\u0013\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0018\u0000\u0000\u00ad"+
		"\u0015\u0001\u0000\u0000\u0000\u00ae\u00af\u0007\n\u0000\u0000\u00af\u0017"+
		"\u0001\u0000\u0000\u0000\u0014\u001c$\'+38<@MRV_kpy~\u008e\u009d\u00a2"+
		"\u00a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}