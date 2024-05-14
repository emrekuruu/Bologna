# Generated from FOL.g4 by ANTLR 4.13.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,12,74,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,1,0,4,0,16,8,0,11,0,12,0,17,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,1,1,3,1,47,8,1,1,2,1,2,1,2,1,2,1,2,1,3,1,3,1,3,5,3,57,8,3,
        10,3,12,3,60,9,3,1,4,1,4,1,4,3,4,65,8,4,1,5,1,5,1,5,1,5,1,5,1,6,
        1,6,1,6,0,0,7,0,2,4,6,8,10,12,0,0,76,0,15,1,0,0,0,2,46,1,0,0,0,4,
        48,1,0,0,0,6,53,1,0,0,0,8,64,1,0,0,0,10,66,1,0,0,0,12,71,1,0,0,0,
        14,16,3,2,1,0,15,14,1,0,0,0,16,17,1,0,0,0,17,15,1,0,0,0,17,18,1,
        0,0,0,18,1,1,0,0,0,19,47,3,4,2,0,20,21,5,7,0,0,21,47,3,2,1,0,22,
        23,5,3,0,0,23,24,3,2,1,0,24,25,5,5,0,0,25,26,3,2,1,0,26,27,5,4,0,
        0,27,47,1,0,0,0,28,29,5,3,0,0,29,30,3,2,1,0,30,31,5,6,0,0,31,32,
        3,2,1,0,32,33,5,4,0,0,33,47,1,0,0,0,34,35,5,3,0,0,35,36,3,2,1,0,
        36,37,5,8,0,0,37,38,3,2,1,0,38,39,5,4,0,0,39,47,1,0,0,0,40,41,5,
        9,0,0,41,42,5,1,0,0,42,47,3,2,1,0,43,44,5,10,0,0,44,45,5,1,0,0,45,
        47,3,2,1,0,46,19,1,0,0,0,46,20,1,0,0,0,46,22,1,0,0,0,46,28,1,0,0,
        0,46,34,1,0,0,0,46,40,1,0,0,0,46,43,1,0,0,0,47,3,1,0,0,0,48,49,3,
        12,6,0,49,50,5,3,0,0,50,51,3,6,3,0,51,52,5,4,0,0,52,5,1,0,0,0,53,
        58,3,8,4,0,54,55,5,11,0,0,55,57,3,8,4,0,56,54,1,0,0,0,57,60,1,0,
        0,0,58,56,1,0,0,0,58,59,1,0,0,0,59,7,1,0,0,0,60,58,1,0,0,0,61,65,
        5,1,0,0,62,65,5,2,0,0,63,65,3,10,5,0,64,61,1,0,0,0,64,62,1,0,0,0,
        64,63,1,0,0,0,65,9,1,0,0,0,66,67,5,1,0,0,67,68,5,3,0,0,68,69,3,6,
        3,0,69,70,5,4,0,0,70,11,1,0,0,0,71,72,5,2,0,0,72,13,1,0,0,0,4,17,
        46,58,64
    ]

class FOLParser ( Parser ):

    grammarFileName = "FOL.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "'('", "')'", 
                     "'\\u2227'", "'\\u2228'", "'\\u00AC'", "'\\u2192'", 
                     "'\\u2200'", "'\\u2203'", "','" ]

    symbolicNames = [ "<INVALID>", "VARIABLE", "CONSTANT", "LPAREN", "RPAREN", 
                      "AND", "OR", "NOT", "IMPLIES", "FORALL", "EXISTS", 
                      "COMMA", "WS" ]

    RULE_expression = 0
    RULE_formula = 1
    RULE_atomicFormula = 2
    RULE_termList = 3
    RULE_term = 4
    RULE_function = 5
    RULE_predicate = 6

    ruleNames =  [ "expression", "formula", "atomicFormula", "termList", 
                   "term", "function", "predicate" ]

    EOF = Token.EOF
    VARIABLE=1
    CONSTANT=2
    LPAREN=3
    RPAREN=4
    AND=5
    OR=6
    NOT=7
    IMPLIES=8
    FORALL=9
    EXISTS=10
    COMMA=11
    WS=12

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ExpressionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def formula(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(FOLParser.FormulaContext)
            else:
                return self.getTypedRuleContext(FOLParser.FormulaContext,i)


        def getRuleIndex(self):
            return FOLParser.RULE_expression

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpression" ):
                listener.enterExpression(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpression" ):
                listener.exitExpression(self)




    def expression(self):

        localctx = FOLParser.ExpressionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_expression)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 15 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 14
                self.formula()
                self.state = 17 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 1676) != 0)):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FormulaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def atomicFormula(self):
            return self.getTypedRuleContext(FOLParser.AtomicFormulaContext,0)


        def NOT(self):
            return self.getToken(FOLParser.NOT, 0)

        def formula(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(FOLParser.FormulaContext)
            else:
                return self.getTypedRuleContext(FOLParser.FormulaContext,i)


        def LPAREN(self):
            return self.getToken(FOLParser.LPAREN, 0)

        def AND(self):
            return self.getToken(FOLParser.AND, 0)

        def RPAREN(self):
            return self.getToken(FOLParser.RPAREN, 0)

        def OR(self):
            return self.getToken(FOLParser.OR, 0)

        def IMPLIES(self):
            return self.getToken(FOLParser.IMPLIES, 0)

        def FORALL(self):
            return self.getToken(FOLParser.FORALL, 0)

        def VARIABLE(self):
            return self.getToken(FOLParser.VARIABLE, 0)

        def EXISTS(self):
            return self.getToken(FOLParser.EXISTS, 0)

        def getRuleIndex(self):
            return FOLParser.RULE_formula

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFormula" ):
                listener.enterFormula(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFormula" ):
                listener.exitFormula(self)




    def formula(self):

        localctx = FOLParser.FormulaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_formula)
        try:
            self.state = 46
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,1,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 19
                self.atomicFormula()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 20
                self.match(FOLParser.NOT)
                self.state = 21
                self.formula()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 22
                self.match(FOLParser.LPAREN)
                self.state = 23
                self.formula()
                self.state = 24
                self.match(FOLParser.AND)
                self.state = 25
                self.formula()
                self.state = 26
                self.match(FOLParser.RPAREN)
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 28
                self.match(FOLParser.LPAREN)
                self.state = 29
                self.formula()
                self.state = 30
                self.match(FOLParser.OR)
                self.state = 31
                self.formula()
                self.state = 32
                self.match(FOLParser.RPAREN)
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 34
                self.match(FOLParser.LPAREN)
                self.state = 35
                self.formula()
                self.state = 36
                self.match(FOLParser.IMPLIES)
                self.state = 37
                self.formula()
                self.state = 38
                self.match(FOLParser.RPAREN)
                pass

            elif la_ == 6:
                self.enterOuterAlt(localctx, 6)
                self.state = 40
                self.match(FOLParser.FORALL)
                self.state = 41
                self.match(FOLParser.VARIABLE)
                self.state = 42
                self.formula()
                pass

            elif la_ == 7:
                self.enterOuterAlt(localctx, 7)
                self.state = 43
                self.match(FOLParser.EXISTS)
                self.state = 44
                self.match(FOLParser.VARIABLE)
                self.state = 45
                self.formula()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AtomicFormulaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def predicate(self):
            return self.getTypedRuleContext(FOLParser.PredicateContext,0)


        def LPAREN(self):
            return self.getToken(FOLParser.LPAREN, 0)

        def termList(self):
            return self.getTypedRuleContext(FOLParser.TermListContext,0)


        def RPAREN(self):
            return self.getToken(FOLParser.RPAREN, 0)

        def getRuleIndex(self):
            return FOLParser.RULE_atomicFormula

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAtomicFormula" ):
                listener.enterAtomicFormula(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAtomicFormula" ):
                listener.exitAtomicFormula(self)




    def atomicFormula(self):

        localctx = FOLParser.AtomicFormulaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_atomicFormula)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 48
            self.predicate()
            self.state = 49
            self.match(FOLParser.LPAREN)
            self.state = 50
            self.termList()
            self.state = 51
            self.match(FOLParser.RPAREN)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TermListContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def term(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(FOLParser.TermContext)
            else:
                return self.getTypedRuleContext(FOLParser.TermContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(FOLParser.COMMA)
            else:
                return self.getToken(FOLParser.COMMA, i)

        def getRuleIndex(self):
            return FOLParser.RULE_termList

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTermList" ):
                listener.enterTermList(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTermList" ):
                listener.exitTermList(self)




    def termList(self):

        localctx = FOLParser.TermListContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_termList)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 53
            self.term()
            self.state = 58
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==11:
                self.state = 54
                self.match(FOLParser.COMMA)
                self.state = 55
                self.term()
                self.state = 60
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TermContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VARIABLE(self):
            return self.getToken(FOLParser.VARIABLE, 0)

        def CONSTANT(self):
            return self.getToken(FOLParser.CONSTANT, 0)

        def function(self):
            return self.getTypedRuleContext(FOLParser.FunctionContext,0)


        def getRuleIndex(self):
            return FOLParser.RULE_term

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTerm" ):
                listener.enterTerm(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTerm" ):
                listener.exitTerm(self)




    def term(self):

        localctx = FOLParser.TermContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_term)
        try:
            self.state = 64
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,3,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 61
                self.match(FOLParser.VARIABLE)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 62
                self.match(FOLParser.CONSTANT)
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 63
                self.function()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FunctionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VARIABLE(self):
            return self.getToken(FOLParser.VARIABLE, 0)

        def LPAREN(self):
            return self.getToken(FOLParser.LPAREN, 0)

        def termList(self):
            return self.getTypedRuleContext(FOLParser.TermListContext,0)


        def RPAREN(self):
            return self.getToken(FOLParser.RPAREN, 0)

        def getRuleIndex(self):
            return FOLParser.RULE_function

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunction" ):
                listener.enterFunction(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunction" ):
                listener.exitFunction(self)




    def function(self):

        localctx = FOLParser.FunctionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_function)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 66
            self.match(FOLParser.VARIABLE)
            self.state = 67
            self.match(FOLParser.LPAREN)
            self.state = 68
            self.termList()
            self.state = 69
            self.match(FOLParser.RPAREN)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PredicateContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CONSTANT(self):
            return self.getToken(FOLParser.CONSTANT, 0)

        def getRuleIndex(self):
            return FOLParser.RULE_predicate

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPredicate" ):
                listener.enterPredicate(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPredicate" ):
                listener.exitPredicate(self)




    def predicate(self):

        localctx = FOLParser.PredicateContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_predicate)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 71
            self.match(FOLParser.CONSTANT)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





