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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, IN=24, AND=25, 
		NOT=26, TRUE=27, FALSE=28, GT=29, GE=30, LT=31, LE=32, EQ=33, DECIMAL=34, 
		INT=35, ID=36, WS=37;
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
			null, "'with'", "'WITH'", "'assess'", "'ASSESS'", "'for'", "'FOR'", "'by'", 
			"','", "'against'", "'AGAINST'", "'using'", "'USING'", "'labels'", "'LABELS'", 
			"'scaled'", "'past'", "'('", "')'", "'{'", "'}'", "'['", "']'", "':'", 
			null, null, null, null, null, "'>'", "'>='", "'<'", "'<='", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"IN", "AND", "NOT", "TRUE", "FALSE", "GT", "GE", "LT", "LE", "EQ", "DECIMAL", 
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
		public IdContext id;
		public List<IdContext> mcs = new ArrayList<IdContext>();
		public ClauseContext sc;
		public List<IdContext> gc = new ArrayList<IdContext>();
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
			((AssessContext)_localctx).id = id();
			((AssessContext)_localctx).mcs.add(((AssessContext)_localctx).id);
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(28);
				_la = _input.LA(1);
				if ( !(_la==T__4 || _la==T__5) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(29);
				((AssessContext)_localctx).sc = clause();
				}
				break;
			}
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(32);
				match(T__6);
				setState(33);
				((AssessContext)_localctx).id = id();
				((AssessContext)_localctx).gc.add(((AssessContext)_localctx).id);
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(34);
					match(T__7);
					setState(35);
					((AssessContext)_localctx).id = id();
					((AssessContext)_localctx).gc.add(((AssessContext)_localctx).id);
					}
					}
					setState(40);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4 || _la==T__5) {
				{
				setState(43);
				_la = _input.LA(1);
				if ( !(_la==T__4 || _la==T__5) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(44);
				((AssessContext)_localctx).sc = clause();
				}
			}

			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__9) {
				{
				setState(47);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__9) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(48);
				((AssessContext)_localctx).bc = benchmark();
				}
			}

			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10 || _la==T__11) {
				{
				setState(51);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(52);
				((AssessContext)_localctx).as = function();
				}
			}

			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__13) {
				{
				setState(55);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__13) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(56);
				((AssessContext)_localctx).l = label();
				}
			}

			setState(59);
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
			setState(61);
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
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new TargetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				((TargetContext)_localctx).val = match(DECIMAL);
				}
				break;
			case 2:
				_localctx = new SiblingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				((SiblingContext)_localctx).attr = id();
				setState(66);
				((SiblingContext)_localctx).op = comparator();
				setState(67);
				((SiblingContext)_localctx).value = value();
				((SiblingContext)_localctx).val.add(((SiblingContext)_localctx).value);
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(68);
					match(T__14);
					setState(69);
					((SiblingContext)_localctx).weight = id();
					}
				}

				}
				break;
			case 3:
				_localctx = new ParentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				((ParentContext)_localctx).attr = id();
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(73);
					match(T__14);
					setState(74);
					((ParentContext)_localctx).weight = id();
					}
				}

				}
				break;
			case 4:
				_localctx = new PastContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				match(T__15);
				setState(78);
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
		public Token _tset259;
		public Token _tset270;
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
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new NestedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				((NestedFunctionContext)_localctx).fun = id();
				setState(82);
				match(T__16);
				setState(83);
				((NestedFunctionContext)_localctx).function = function();
				((NestedFunctionContext)_localctx).functions.add(((NestedFunctionContext)_localctx).function);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(84);
					match(T__7);
					setState(85);
					((NestedFunctionContext)_localctx).function = function();
					((NestedFunctionContext)_localctx).functions.add(((NestedFunctionContext)_localctx).function);
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(91);
				match(T__17);
				}
				break;
			case 2:
				_localctx = new ParametricFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				((ParametricFunctionContext)_localctx).fun = id();
				setState(94);
				match(T__16);
				setState(95);
				((ParametricFunctionContext)_localctx)._tset259 = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DECIMAL || _la==ID) ) {
					((ParametricFunctionContext)_localctx)._tset259 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((ParametricFunctionContext)_localctx).params.add(((ParametricFunctionContext)_localctx)._tset259);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(96);
					match(T__7);
					setState(97);
					((ParametricFunctionContext)_localctx)._tset270 = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==DECIMAL || _la==ID) ) {
						((ParametricFunctionContext)_localctx)._tset270 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					((ParametricFunctionContext)_localctx).params.add(((ParametricFunctionContext)_localctx)._tset270);
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(103);
				match(T__17);
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
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new Label_intContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				((Label_intContext)_localctx).lbl = id();
				}
				break;
			case T__18:
				_localctx = new UselessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(T__18);
				setState(109);
				interval();
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(110);
					match(T__7);
					setState(111);
					interval();
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(117);
				match(T__19);
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
			setState(121);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__20) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(122);
			((Label_funContext)_localctx).fr = match(DECIMAL);
			setState(123);
			match(T__7);
			setState(124);
			((Label_funContext)_localctx).to = match(DECIMAL);
			setState(125);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__21) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(126);
			match(T__22);
			setState(127);
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
			setState(129);
			condition();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(130);
				binary();
				setState(131);
				condition();
				}
				}
				setState(137);
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
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				((ConditionContext)_localctx).attr = id();
				setState(139);
				((ConditionContext)_localctx).op = comparator();
				setState(140);
				((ConditionContext)_localctx).value = value();
				((ConditionContext)_localctx).val.add(((ConditionContext)_localctx).value);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				((ConditionContext)_localctx).attr = id();
				setState(143);
				((ConditionContext)_localctx).in = match(IN);
				setState(144);
				match(T__16);
				setState(145);
				((ConditionContext)_localctx).value = value();
				((ConditionContext)_localctx).val.add(((ConditionContext)_localctx).value);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(146);
					match(T__7);
					setState(147);
					((ConditionContext)_localctx).value = value();
					((ConditionContext)_localctx).val.add(((ConditionContext)_localctx).value);
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153);
				match(T__17);
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
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(ID);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(DECIMAL);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(INT);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
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
			setState(163);
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
			setState(165);
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
			setState(167);
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
		"\u0004\u0001%\u00aa\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000\u001f\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000%\b\u0000\n\u0000\f\u0000(\t\u0000\u0003\u0000*\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000.\b\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"2\b\u0000\u0001\u0000\u0001\u0000\u0003\u00006\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000:\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002G\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002L\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002P\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"W\b\u0003\n\u0003\f\u0003Z\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003c\b\u0003"+
		"\n\u0003\f\u0003f\t\u0003\u0001\u0003\u0001\u0003\u0003\u0003j\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"q\b\u0004\n\u0004\f\u0004t\t\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"x\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u0086\b\u0006\n\u0006\f\u0006\u0089\t\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0095\b\u0007\n"+
		"\u0007\f\u0007\u0098\t\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u009c"+
		"\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00a2\b\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0000\u0000\f\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u000b\u0001"+
		"\u0000\u0001\u0002\u0001\u0000\u0003\u0004\u0001\u0000\u0005\u0006\u0001"+
		"\u0000\t\n\u0001\u0000\u000b\f\u0001\u0000\r\u000e\u0002\u0000\"\"$$\u0002"+
		"\u0000\u0011\u0011\u0015\u0015\u0002\u0000\u0012\u0012\u0016\u0016\u0001"+
		"\u0000\u001d!\u0001\u0000\u001b\u001c\u00b4\u0000\u0018\u0001\u0000\u0000"+
		"\u0000\u0002=\u0001\u0000\u0000\u0000\u0004O\u0001\u0000\u0000\u0000\u0006"+
		"i\u0001\u0000\u0000\u0000\bw\u0001\u0000\u0000\u0000\ny\u0001\u0000\u0000"+
		"\u0000\f\u0081\u0001\u0000\u0000\u0000\u000e\u009b\u0001\u0000\u0000\u0000"+
		"\u0010\u00a1\u0001\u0000\u0000\u0000\u0012\u00a3\u0001\u0000\u0000\u0000"+
		"\u0014\u00a5\u0001\u0000\u0000\u0000\u0016\u00a7\u0001\u0000\u0000\u0000"+
		"\u0018\u0019\u0007\u0000\u0000\u0000\u0019\u001a\u0003\u0002\u0001\u0000"+
		"\u001a\u001b\u0007\u0001\u0000\u0000\u001b\u001e\u0003\u0002\u0001\u0000"+
		"\u001c\u001d\u0007\u0002\u0000\u0000\u001d\u001f\u0003\f\u0006\u0000\u001e"+
		"\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f"+
		")\u0001\u0000\u0000\u0000 !\u0005\u0007\u0000\u0000!&\u0003\u0002\u0001"+
		"\u0000\"#\u0005\b\u0000\u0000#%\u0003\u0002\u0001\u0000$\"\u0001\u0000"+
		"\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001"+
		"\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000"+
		") \u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000"+
		"\u0000+,\u0007\u0002\u0000\u0000,.\u0003\f\u0006\u0000-+\u0001\u0000\u0000"+
		"\u0000-.\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/0\u0007\u0003"+
		"\u0000\u000002\u0003\u0004\u0002\u00001/\u0001\u0000\u0000\u000012\u0001"+
		"\u0000\u0000\u000025\u0001\u0000\u0000\u000034\u0007\u0004\u0000\u0000"+
		"46\u0003\u0006\u0003\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000"+
		"\u000069\u0001\u0000\u0000\u000078\u0007\u0005\u0000\u00008:\u0003\b\u0004"+
		"\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0001\u0000"+
		"\u0000\u0000;<\u0005\u0000\u0000\u0001<\u0001\u0001\u0000\u0000\u0000"+
		"=>\u0005$\u0000\u0000>?\u0006\u0001\uffff\uffff\u0000?\u0003\u0001\u0000"+
		"\u0000\u0000@P\u0005\"\u0000\u0000AB\u0003\u0002\u0001\u0000BC\u0003\u0012"+
		"\t\u0000CF\u0003\u0010\b\u0000DE\u0005\u000f\u0000\u0000EG\u0003\u0002"+
		"\u0001\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GP\u0001"+
		"\u0000\u0000\u0000HK\u0003\u0002\u0001\u0000IJ\u0005\u000f\u0000\u0000"+
		"JL\u0003\u0002\u0001\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000LP\u0001\u0000\u0000\u0000MN\u0005\u0010\u0000\u0000NP\u0005\"\u0000"+
		"\u0000O@\u0001\u0000\u0000\u0000OA\u0001\u0000\u0000\u0000OH\u0001\u0000"+
		"\u0000\u0000OM\u0001\u0000\u0000\u0000P\u0005\u0001\u0000\u0000\u0000"+
		"QR\u0003\u0002\u0001\u0000RS\u0005\u0011\u0000\u0000SX\u0003\u0006\u0003"+
		"\u0000TU\u0005\b\u0000\u0000UW\u0003\u0006\u0003\u0000VT\u0001\u0000\u0000"+
		"\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000"+
		"\u0000\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[\\\u0005"+
		"\u0012\u0000\u0000\\j\u0001\u0000\u0000\u0000]^\u0003\u0002\u0001\u0000"+
		"^_\u0005\u0011\u0000\u0000_d\u0007\u0006\u0000\u0000`a\u0005\b\u0000\u0000"+
		"ac\u0007\u0006\u0000\u0000b`\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000"+
		"\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eg\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000gh\u0005\u0012\u0000\u0000hj\u0001"+
		"\u0000\u0000\u0000iQ\u0001\u0000\u0000\u0000i]\u0001\u0000\u0000\u0000"+
		"j\u0007\u0001\u0000\u0000\u0000kx\u0003\u0002\u0001\u0000lm\u0005\u0013"+
		"\u0000\u0000mr\u0003\n\u0005\u0000no\u0005\b\u0000\u0000oq\u0003\n\u0005"+
		"\u0000pn\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000"+
		"\u0000\u0000rs\u0001\u0000\u0000\u0000su\u0001\u0000\u0000\u0000tr\u0001"+
		"\u0000\u0000\u0000uv\u0005\u0014\u0000\u0000vx\u0001\u0000\u0000\u0000"+
		"wk\u0001\u0000\u0000\u0000wl\u0001\u0000\u0000\u0000x\t\u0001\u0000\u0000"+
		"\u0000yz\u0007\u0007\u0000\u0000z{\u0005\"\u0000\u0000{|\u0005\b\u0000"+
		"\u0000|}\u0005\"\u0000\u0000}~\u0007\b\u0000\u0000~\u007f\u0005\u0017"+
		"\u0000\u0000\u007f\u0080\u0003\u0002\u0001\u0000\u0080\u000b\u0001\u0000"+
		"\u0000\u0000\u0081\u0087\u0003\u000e\u0007\u0000\u0082\u0083\u0003\u0014"+
		"\n\u0000\u0083\u0084\u0003\u000e\u0007\u0000\u0084\u0086\u0001\u0000\u0000"+
		"\u0000\u0085\u0082\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000"+
		"\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000"+
		"\u0000\u0088\r\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0003\u0002\u0001\u0000\u008b\u008c\u0003\u0012\t\u0000\u008c"+
		"\u008d\u0003\u0010\b\u0000\u008d\u009c\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0003\u0002\u0001\u0000\u008f\u0090\u0005\u0018\u0000\u0000\u0090\u0091"+
		"\u0005\u0011\u0000\u0000\u0091\u0096\u0003\u0010\b\u0000\u0092\u0093\u0005"+
		"\b\u0000\u0000\u0093\u0095\u0003\u0010\b\u0000\u0094\u0092\u0001\u0000"+
		"\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0099\u0001\u0000"+
		"\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u0012"+
		"\u0000\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u008a\u0001\u0000"+
		"\u0000\u0000\u009b\u008e\u0001\u0000\u0000\u0000\u009c\u000f\u0001\u0000"+
		"\u0000\u0000\u009d\u00a2\u0005$\u0000\u0000\u009e\u00a2\u0005\"\u0000"+
		"\u0000\u009f\u00a2\u0005#\u0000\u0000\u00a0\u00a2\u0003\u0016\u000b\u0000"+
		"\u00a1\u009d\u0001\u0000\u0000\u0000\u00a1\u009e\u0001\u0000\u0000\u0000"+
		"\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a2\u0011\u0001\u0000\u0000\u0000\u00a3\u00a4\u0007\t\u0000\u0000\u00a4"+
		"\u0013\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0019\u0000\u0000\u00a6"+
		"\u0015\u0001\u0000\u0000\u0000\u00a7\u00a8\u0007\n\u0000\u0000\u00a8\u0017"+
		"\u0001\u0000\u0000\u0000\u0013\u001e&)-159FKOXdirw\u0087\u0096\u009b\u00a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}