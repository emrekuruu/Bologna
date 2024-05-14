# Generated from FOL.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .FOLParser import FOLParser
else:
    from FOLParser import FOLParser

# This class defines a complete listener for a parse tree produced by FOLParser.
class FOLListener(ParseTreeListener):

    # Enter a parse tree produced by FOLParser#expression.
    def enterExpression(self, ctx:FOLParser.ExpressionContext):
        pass

    # Exit a parse tree produced by FOLParser#expression.
    def exitExpression(self, ctx:FOLParser.ExpressionContext):
        pass


    # Enter a parse tree produced by FOLParser#formula.
    def enterFormula(self, ctx:FOLParser.FormulaContext):
        pass

    # Exit a parse tree produced by FOLParser#formula.
    def exitFormula(self, ctx:FOLParser.FormulaContext):
        pass


    # Enter a parse tree produced by FOLParser#atomicFormula.
    def enterAtomicFormula(self, ctx:FOLParser.AtomicFormulaContext):
        pass

    # Exit a parse tree produced by FOLParser#atomicFormula.
    def exitAtomicFormula(self, ctx:FOLParser.AtomicFormulaContext):
        pass


    # Enter a parse tree produced by FOLParser#termList.
    def enterTermList(self, ctx:FOLParser.TermListContext):
        pass

    # Exit a parse tree produced by FOLParser#termList.
    def exitTermList(self, ctx:FOLParser.TermListContext):
        pass


    # Enter a parse tree produced by FOLParser#term.
    def enterTerm(self, ctx:FOLParser.TermContext):
        pass

    # Exit a parse tree produced by FOLParser#term.
    def exitTerm(self, ctx:FOLParser.TermContext):
        pass


    # Enter a parse tree produced by FOLParser#function.
    def enterFunction(self, ctx:FOLParser.FunctionContext):
        pass

    # Exit a parse tree produced by FOLParser#function.
    def exitFunction(self, ctx:FOLParser.FunctionContext):
        pass


    # Enter a parse tree produced by FOLParser#predicate.
    def enterPredicate(self, ctx:FOLParser.PredicateContext):
        pass

    # Exit a parse tree produced by FOLParser#predicate.
    def exitPredicate(self, ctx:FOLParser.PredicateContext):
        pass



del FOLParser