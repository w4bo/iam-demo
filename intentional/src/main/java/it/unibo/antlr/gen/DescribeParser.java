// Generated from Describe.g4 by ANTLR 4.10.1

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
public class DescribeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		IN=10, AND=11, NOT=12, TRUE=13, FALSE=14, GT=15, GE=16, LT=17, LE=18, 
		EQ=19, MODEL=20, DECIMAL=21, INT=22, ID=23, WS=24;
	public static final int
		RULE_describe = 0, RULE_id = 1, RULE_c = 2, RULE_clause = 3, RULE_condition = 4, 
		RULE_value = 5, RULE_comparator = 6, RULE_binary = 7, RULE_bool = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"describe", "id", "c", "clause", "condition", "value", "comparator", 
			"binary", "bool"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'with'", "'describe'", "','", "'for'", "'by'", "'using'", "'size'", 
			"'('", "')'", null, null, null, null, null, "'>'", "'>='", "'<'", "'<='", 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "IN", "AND", 
			"NOT", "TRUE", "FALSE", "GT", "GE", "LT", "LE", "EQ", "MODEL", "DECIMAL", 
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
	public String getGrammarFileName() { return "Describe.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DescribeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DescribeContext extends ParserRuleContext {
		public IdContext id;
		public List<IdContext> mc = new ArrayList<IdContext>();
		public ClauseContext sc;
		public List<IdContext> gc = new ArrayList<IdContext>();
		public Token MODEL;
		public List<Token> models = new ArrayList<Token>();
		public Token k;
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public TerminalNode EOF() { return getToken(DescribeParser.EOF, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> MODEL() { return getTokens(DescribeParser.MODEL); }
		public TerminalNode MODEL(int i) {
			return getToken(DescribeParser.MODEL, i);
		}
		public TerminalNode INT() { return getToken(DescribeParser.INT, 0); }
		public ClauseContext clause() {
			return getRuleContext(ClauseContext.class,0);
		}
		public DescribeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DescribeListener ) ((DescribeListener)listener).enterDescribe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DescribeListener ) ((DescribeListener)listener).exitDescribe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DescribeVisitor ) return ((DescribeVisitor<? extends T>)visitor).visitDescribe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeContext describe() throws RecognitionException {
		DescribeContext _localctx = new DescribeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_describe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(T__0);
			setState(19);
			c();
			setState(20);
			match(T__1);
			setState(21);
			((DescribeContext)_localctx).id = id();
			((DescribeContext)_localctx).mc.add(((DescribeContext)_localctx).id);
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(22);
				match(T__2);
				setState(23);
				((DescribeContext)_localctx).id = id();
				((DescribeContext)_localctx).mc.add(((DescribeContext)_localctx).id);
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(29);
					match(T__3);
					setState(30);
					((DescribeContext)_localctx).sc = clause();
					}
				}

				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(33);
					match(T__4);
					setState(34);
					((DescribeContext)_localctx).id = id();
					((DescribeContext)_localctx).gc.add(((DescribeContext)_localctx).id);
					setState(39);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(35);
						match(T__2);
						setState(36);
						((DescribeContext)_localctx).id = id();
						((DescribeContext)_localctx).gc.add(((DescribeContext)_localctx).id);
						}
						}
						setState(41);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 2:
				{
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(44);
					match(T__4);
					setState(45);
					((DescribeContext)_localctx).id = id();
					((DescribeContext)_localctx).gc.add(((DescribeContext)_localctx).id);
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(46);
						match(T__2);
						setState(47);
						((DescribeContext)_localctx).id = id();
						((DescribeContext)_localctx).gc.add(((DescribeContext)_localctx).id);
						}
						}
						setState(52);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(55);
					match(T__3);
					setState(56);
					((DescribeContext)_localctx).sc = clause();
					}
				}

				}
				break;
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(61);
				match(T__5);
				setState(62);
				((DescribeContext)_localctx).MODEL = match(MODEL);
				((DescribeContext)_localctx).models.add(((DescribeContext)_localctx).MODEL);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(63);
					match(T__2);
					setState(64);
					((DescribeContext)_localctx).MODEL = match(MODEL);
					((DescribeContext)_localctx).models.add(((DescribeContext)_localctx).MODEL);
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(72);
				match(T__6);
				setState(73);
				((DescribeContext)_localctx).k = match(INT);
				}
			}

			setState(76);
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
		public TerminalNode ID() { return getToken(DescribeParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DescribeListener ) ((DescribeListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DescribeListener ) ((DescribeListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DescribeVisitor ) return ((DescribeVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
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

	public static class CContext extends ParserRuleContext {
		public IdContext cube;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DescribeListener ) ((DescribeListener)listener).enterC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DescribeListener ) ((DescribeListener)listener).exitC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DescribeVisitor ) return ((DescribeVisitor<? extends T>)visitor).visitC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CContext c() throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_c);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			((CContext)_localctx).cube = id();
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
			if ( listener instanceof DescribeListener ) ((DescribeListener)listener).enterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DescribeListener ) ((DescribeListener)listener).exitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DescribeVisitor ) return ((DescribeVisitor<? extends T>)visitor).visitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClauseContext clause() throws RecognitionException {
		ClauseContext _localctx = new ClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			condition();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(84);
				binary();
				setState(85);
				condition();
				}
				}
				setState(91);
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
		public Token attr;
		public ComparatorContext op;
		public ValueContext value;
		public List<ValueContext> val = new ArrayList<ValueContext>();
		public Token in;
		public TerminalNode ID() { return getToken(DescribeParser.ID, 0); }
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode IN() { return getToken(DescribeParser.IN, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DescribeListener ) ((DescribeListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DescribeListener ) ((DescribeListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DescribeVisitor ) return ((DescribeVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condition);
		int _la;
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				((ConditionContext)_localctx).attr = match(ID);
				setState(93);
				((ConditionContext)_localctx).op = comparator();
				setState(94);
				((ConditionContext)_localctx).value = value();
				((ConditionContext)_localctx).val.add(((ConditionContext)_localctx).value);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				((ConditionContext)_localctx).attr = match(ID);
				setState(97);
				((ConditionContext)_localctx).in = match(IN);
				setState(98);
				match(T__7);
				setState(99);
				((ConditionContext)_localctx).value = value();
				((ConditionContext)_localctx).val.add(((ConditionContext)_localctx).value);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(100);
					match(T__2);
					setState(101);
					((ConditionContext)_localctx).value = value();
					((ConditionContext)_localctx).val.add(((ConditionContext)_localctx).value);
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(107);
				match(T__8);
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
		public TerminalNode ID() { return getToken(DescribeParser.ID, 0); }
		public TerminalNode DECIMAL() { return getToken(DescribeParser.DECIMAL, 0); }
		public TerminalNode INT() { return getToken(DescribeParser.INT, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DescribeListener ) ((DescribeListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DescribeListener ) ((DescribeListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DescribeVisitor ) return ((DescribeVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(ID);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(DECIMAL);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				match(INT);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
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
		public TerminalNode GE() { return getToken(DescribeParser.GE, 0); }
		public TerminalNode LE() { return getToken(DescribeParser.LE, 0); }
		public TerminalNode EQ() { return getToken(DescribeParser.EQ, 0); }
		public TerminalNode GT() { return getToken(DescribeParser.GT, 0); }
		public TerminalNode LT() { return getToken(DescribeParser.LT, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DescribeListener ) ((DescribeListener)listener).enterComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DescribeListener ) ((DescribeListener)listener).exitComparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DescribeVisitor ) return ((DescribeVisitor<? extends T>)visitor).visitComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
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
		public TerminalNode AND() { return getToken(DescribeParser.AND, 0); }
		public BinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DescribeListener ) ((DescribeListener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DescribeListener ) ((DescribeListener)listener).exitBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DescribeVisitor ) return ((DescribeVisitor<? extends T>)visitor).visitBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryContext binary() throws RecognitionException {
		BinaryContext _localctx = new BinaryContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_binary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
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
		public TerminalNode TRUE() { return getToken(DescribeParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(DescribeParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DescribeListener ) ((DescribeListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DescribeListener ) ((DescribeListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DescribeVisitor ) return ((DescribeVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
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
		"\u0004\u0001\u0018|\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\u0019\b\u0000\n\u0000\f\u0000\u001c\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000 \b\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000&\b\u0000\n\u0000\f\u0000)\t\u0000\u0003"+
		"\u0000+\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u00001\b\u0000\n\u0000\f\u00004\t\u0000\u0003\u00006\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000:\b\u0000\u0003\u0000<\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000B\b\u0000\n\u0000\f\u0000E\t"+
		"\u0000\u0003\u0000G\b\u0000\u0001\u0000\u0001\u0000\u0003\u0000K\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"X\b\u0003\n\u0003\f\u0003[\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004g\b\u0004\n\u0004\f\u0004j\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004n\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005t\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0000\u0002\u0001\u0000\u000f\u0013\u0001\u0000\r\u000e"+
		"\u0083\u0000\u0012\u0001\u0000\u0000\u0000\u0002N\u0001\u0000\u0000\u0000"+
		"\u0004Q\u0001\u0000\u0000\u0000\u0006S\u0001\u0000\u0000\u0000\bm\u0001"+
		"\u0000\u0000\u0000\ns\u0001\u0000\u0000\u0000\fu\u0001\u0000\u0000\u0000"+
		"\u000ew\u0001\u0000\u0000\u0000\u0010y\u0001\u0000\u0000\u0000\u0012\u0013"+
		"\u0005\u0001\u0000\u0000\u0013\u0014\u0003\u0004\u0002\u0000\u0014\u0015"+
		"\u0005\u0002\u0000\u0000\u0015\u001a\u0003\u0002\u0001\u0000\u0016\u0017"+
		"\u0005\u0003\u0000\u0000\u0017\u0019\u0003\u0002\u0001\u0000\u0018\u0016"+
		"\u0001\u0000\u0000\u0000\u0019\u001c\u0001\u0000\u0000\u0000\u001a\u0018"+
		"\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b;\u0001"+
		"\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001d\u001e\u0005"+
		"\u0004\u0000\u0000\u001e \u0003\u0006\u0003\u0000\u001f\u001d\u0001\u0000"+
		"\u0000\u0000\u001f \u0001\u0000\u0000\u0000 *\u0001\u0000\u0000\u0000"+
		"!\"\u0005\u0005\u0000\u0000\"\'\u0003\u0002\u0001\u0000#$\u0005\u0003"+
		"\u0000\u0000$&\u0003\u0002\u0001\u0000%#\u0001\u0000\u0000\u0000&)\u0001"+
		"\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000"+
		"(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000*!\u0001\u0000\u0000"+
		"\u0000*+\u0001\u0000\u0000\u0000+<\u0001\u0000\u0000\u0000,-\u0005\u0005"+
		"\u0000\u0000-2\u0003\u0002\u0001\u0000./\u0005\u0003\u0000\u0000/1\u0003"+
		"\u0002\u0001\u00000.\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u0000"+
		"20\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000036\u0001\u0000\u0000"+
		"\u000042\u0001\u0000\u0000\u00005,\u0001\u0000\u0000\u000056\u0001\u0000"+
		"\u0000\u000069\u0001\u0000\u0000\u000078\u0005\u0004\u0000\u00008:\u0003"+
		"\u0006\u0003\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":<\u0001\u0000\u0000\u0000;\u001f\u0001\u0000\u0000\u0000;5\u0001\u0000"+
		"\u0000\u0000<F\u0001\u0000\u0000\u0000=>\u0005\u0006\u0000\u0000>C\u0005"+
		"\u0014\u0000\u0000?@\u0005\u0003\u0000\u0000@B\u0005\u0014\u0000\u0000"+
		"A?\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000"+
		"\u0000CD\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000"+
		"\u0000\u0000F=\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GJ\u0001"+
		"\u0000\u0000\u0000HI\u0005\u0007\u0000\u0000IK\u0005\u0016\u0000\u0000"+
		"JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000LM\u0005\u0000\u0000\u0001M\u0001\u0001\u0000\u0000\u0000NO\u0005"+
		"\u0017\u0000\u0000OP\u0006\u0001\uffff\uffff\u0000P\u0003\u0001\u0000"+
		"\u0000\u0000QR\u0003\u0002\u0001\u0000R\u0005\u0001\u0000\u0000\u0000"+
		"SY\u0003\b\u0004\u0000TU\u0003\u000e\u0007\u0000UV\u0003\b\u0004\u0000"+
		"VX\u0001\u0000\u0000\u0000WT\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000"+
		"\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\u0007\u0001"+
		"\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\]\u0005\u0017\u0000\u0000"+
		"]^\u0003\f\u0006\u0000^_\u0003\n\u0005\u0000_n\u0001\u0000\u0000\u0000"+
		"`a\u0005\u0017\u0000\u0000ab\u0005\n\u0000\u0000bc\u0005\b\u0000\u0000"+
		"ch\u0003\n\u0005\u0000de\u0005\u0003\u0000\u0000eg\u0003\n\u0005\u0000"+
		"fd\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000"+
		"\u0000hi\u0001\u0000\u0000\u0000ik\u0001\u0000\u0000\u0000jh\u0001\u0000"+
		"\u0000\u0000kl\u0005\t\u0000\u0000ln\u0001\u0000\u0000\u0000m\\\u0001"+
		"\u0000\u0000\u0000m`\u0001\u0000\u0000\u0000n\t\u0001\u0000\u0000\u0000"+
		"ot\u0005\u0017\u0000\u0000pt\u0005\u0015\u0000\u0000qt\u0005\u0016\u0000"+
		"\u0000rt\u0003\u0010\b\u0000so\u0001\u0000\u0000\u0000sp\u0001\u0000\u0000"+
		"\u0000sq\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000t\u000b\u0001"+
		"\u0000\u0000\u0000uv\u0007\u0000\u0000\u0000v\r\u0001\u0000\u0000\u0000"+
		"wx\u0005\u000b\u0000\u0000x\u000f\u0001\u0000\u0000\u0000yz\u0007\u0001"+
		"\u0000\u0000z\u0011\u0001\u0000\u0000\u0000\u000f\u001a\u001f\'*259;C"+
		"FJYhms";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}