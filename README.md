## Prolog Parser
This is a simple prolog parser which utilizes antlr, takes logic rules in the form of Horn Clauses and outputs the Parse tree that is generetad with Graphviz.

## How to generete the parser
antlr4 -Dlanguage=Python3 Prolog.g4

## How to prepare the enviorement 
python3 -m venv venv , source venv/bin/activate,
python install -r requirements.txt
