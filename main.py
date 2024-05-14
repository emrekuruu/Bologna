import sys
from antlr4 import *
from ANTLR.FOLLexer import FOLLexer
from ANTLR.FOLParser import FOLParser
from antlr4.InputStream import InputStream
from antlr4.tree.Trees import Trees
from antlr4.tree.Tree import TerminalNodeImpl
from graphviz import Digraph

def get_node_label(node, parser):
    if isinstance(node, TerminalNodeImpl):
        return parser.symbolicNames[node.getSymbol().type]
    else:
        return parser.ruleNames[node.getRuleIndex()]

def create_dot_graph(tree, parser):
    dot = Digraph()
    stack = [(tree, "0")]
    counter = 1

    while stack:
        node, parent_id = stack.pop()
        node_id = str(counter)
        counter += 1
        label = get_node_label(node, parser)
        dot.node(node_id, label)
        if parent_id:
            dot.edge(parent_id, node_id)
        
        if isinstance(node, TerminalNodeImpl):
            continue
        
        for i in range(node.getChildCount() - 1, -1, -1):
            stack.append((node.getChild(i), node_id))
    
    return dot

def main(input_str):
    input_stream = InputStream(input_str)
    lexer = FOLLexer(input_stream)
    stream = CommonTokenStream(lexer)

    # Print tokens for debugging
    stream.fill()
    for token in stream.tokens:
        print(f'Token: {token.text}, Type: {token.type}')

    parser = FOLParser(stream)
    tree = parser.expression()  # Use the 'expression' rule

    # Generate and render the parse tree
    dot = create_dot_graph(tree, parser)
    dot.render('parse_tree', format='png', cleanup=True)
    print(f"Parse tree generated and saved as 'parse_tree.png'")

if __name__ == '__main__':
    input_str = "∀x (P(x) ∧ Q(x)) ∃y (R(y) ∨ ¬S(y))"
    main(input_str)
