import sys
from antlr4 import *
from ANTLR.PrologLexer import PrologLexer
from ANTLR.PrologParser import PrologParser

def main():
    input_stream = FileStream("test.pl") 
    lexer = PrologLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = PrologParser(stream)
    
    tree = parser.p_text()
    print(tree.toStringTree(recog=parser))

if __name__ == "__main__":
    main()
