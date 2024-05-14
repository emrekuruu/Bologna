// Generated from /Users/emrekuru/Downloads/Bologna/ANTLR/Datalog.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DatalogParser}.
 */
public interface DatalogListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DatalogParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DatalogParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DatalogParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFact(DatalogParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFact(DatalogParser.FactContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#rule}.
	 * @param ctx the parse tree
	 */
	void enterRule(DatalogParser.RuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#rule}.
	 * @param ctx the parse tree
	 */
	void exitRule(DatalogParser.RuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(DatalogParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(DatalogParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(DatalogParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(DatalogParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(DatalogParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(DatalogParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(DatalogParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(DatalogParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#termList}.
	 * @param ctx the parse tree
	 */
	void enterTermList(DatalogParser.TermListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#termList}.
	 * @param ctx the parse tree
	 */
	void exitTermList(DatalogParser.TermListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(DatalogParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(DatalogParser.TermContext ctx);
}