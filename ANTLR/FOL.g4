grammar FOL;

// Lexer rules
VARIABLE: [a-z]+ ;   // Variables are lowercase letters
CONSTANT: [A-Z]+ ;   // Constants are uppercase letters
LPAREN: '(' ;        // Left parenthesis
RPAREN: ')' ;        // Right parenthesis
AND: '∧' ;           // Logical AND
OR: '∨' ;            // Logical OR
NOT: '¬' ;           // Logical NOT
IMPLIES: '→' ;       // Logical implication
FORALL: '∀' ;        // Universal quantifier
EXISTS: '∃' ;        // Existential quantifier
COMMA: ',' ;         // Comma for separating terms

// Whitespace
WS: [ \t\r\n]+ -> skip ;  // Skip whitespace

// Parser rules
expression
    : formula+ ;  // One or more formulas

formula
    : atomicFormula                                  // An atomic formula
    | NOT formula                                    // Negation of a formula
    | LPAREN formula AND formula RPAREN              // Conjunction
    | LPAREN formula OR formula RPAREN               // Disjunction
    | LPAREN formula IMPLIES formula RPAREN          // Implication
    | FORALL VARIABLE formula                        // Universal quantification
    | EXISTS VARIABLE formula                        // Existential quantification
    ;

atomicFormula
    : predicate LPAREN termList RPAREN               // A predicate applied to a list of terms
    ;

termList
    : term (COMMA term)*                             // One or more terms separated by commas
    ;

term
    : VARIABLE                                       // A term can be a variable
    | CONSTANT                                       // Or a constant
    | function                                       // Or a function application
    ;

function
    : VARIABLE LPAREN termList RPAREN                // A function name followed by a list of terms in parentheses
    ;

predicate
    : CONSTANT                                       // A predicate is represented by a constant
    ;
