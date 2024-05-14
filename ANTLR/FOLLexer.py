# Generated from FOL.g4 by ANTLR 4.13.1
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO


def serializedATN():
    return [
        4,0,12,60,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,
        6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,1,0,4,0,27,8,0,
        11,0,12,0,28,1,1,4,1,32,8,1,11,1,12,1,33,1,2,1,2,1,3,1,3,1,4,1,4,
        1,5,1,5,1,6,1,6,1,7,1,7,1,8,1,8,1,9,1,9,1,10,1,10,1,11,4,11,55,8,
        11,11,11,12,11,56,1,11,1,11,0,0,12,1,1,3,2,5,3,7,4,9,5,11,6,13,7,
        15,8,17,9,19,10,21,11,23,12,1,0,3,1,0,97,122,1,0,65,90,3,0,9,10,
        13,13,32,32,62,0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,
        9,1,0,0,0,0,11,1,0,0,0,0,13,1,0,0,0,0,15,1,0,0,0,0,17,1,0,0,0,0,
        19,1,0,0,0,0,21,1,0,0,0,0,23,1,0,0,0,1,26,1,0,0,0,3,31,1,0,0,0,5,
        35,1,0,0,0,7,37,1,0,0,0,9,39,1,0,0,0,11,41,1,0,0,0,13,43,1,0,0,0,
        15,45,1,0,0,0,17,47,1,0,0,0,19,49,1,0,0,0,21,51,1,0,0,0,23,54,1,
        0,0,0,25,27,7,0,0,0,26,25,1,0,0,0,27,28,1,0,0,0,28,26,1,0,0,0,28,
        29,1,0,0,0,29,2,1,0,0,0,30,32,7,1,0,0,31,30,1,0,0,0,32,33,1,0,0,
        0,33,31,1,0,0,0,33,34,1,0,0,0,34,4,1,0,0,0,35,36,5,40,0,0,36,6,1,
        0,0,0,37,38,5,41,0,0,38,8,1,0,0,0,39,40,5,8743,0,0,40,10,1,0,0,0,
        41,42,5,8744,0,0,42,12,1,0,0,0,43,44,5,172,0,0,44,14,1,0,0,0,45,
        46,5,8594,0,0,46,16,1,0,0,0,47,48,5,8704,0,0,48,18,1,0,0,0,49,50,
        5,8707,0,0,50,20,1,0,0,0,51,52,5,44,0,0,52,22,1,0,0,0,53,55,7,2,
        0,0,54,53,1,0,0,0,55,56,1,0,0,0,56,54,1,0,0,0,56,57,1,0,0,0,57,58,
        1,0,0,0,58,59,6,11,0,0,59,24,1,0,0,0,4,0,28,33,56,1,6,0,0
    ]

class FOLLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    VARIABLE = 1
    CONSTANT = 2
    LPAREN = 3
    RPAREN = 4
    AND = 5
    OR = 6
    NOT = 7
    IMPLIES = 8
    FORALL = 9
    EXISTS = 10
    COMMA = 11
    WS = 12

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'('", "')'", "'\\u2227'", "'\\u2228'", "'\\u00AC'", "'\\u2192'", 
            "'\\u2200'", "'\\u2203'", "','" ]

    symbolicNames = [ "<INVALID>",
            "VARIABLE", "CONSTANT", "LPAREN", "RPAREN", "AND", "OR", "NOT", 
            "IMPLIES", "FORALL", "EXISTS", "COMMA", "WS" ]

    ruleNames = [ "VARIABLE", "CONSTANT", "LPAREN", "RPAREN", "AND", "OR", 
                  "NOT", "IMPLIES", "FORALL", "EXISTS", "COMMA", "WS" ]

    grammarFileName = "FOL.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


