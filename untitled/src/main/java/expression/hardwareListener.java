// Generated from C:/Users/siggo/IdeaProjects/CompilerTek/untitled/src/main/java/expression\hardware.g4 by ANTLR 4.10.1
package expression;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link hardwareParser}.
 */
public interface hardwareListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link hardwareParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(hardwareParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link hardwareParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(hardwareParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link hardwareParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(hardwareParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link hardwareParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(hardwareParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link hardwareParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOr(hardwareParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link hardwareParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOr(hardwareParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Paranthesis}
	 * labeled alternative in {@link hardwareParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParanthesis(hardwareParser.ParanthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Paranthesis}
	 * labeled alternative in {@link hardwareParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParanthesis(hardwareParser.ParanthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link hardwareParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd(hardwareParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link hardwareParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd(hardwareParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Binexpr}
	 * labeled alternative in {@link hardwareParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinexpr(hardwareParser.BinexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Binexpr}
	 * labeled alternative in {@link hardwareParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinexpr(hardwareParser.BinexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UpdateVal1}
	 * labeled alternative in {@link hardwareParser#updateVal}.
	 * @param ctx the parse tree
	 */
	void enterUpdateVal1(hardwareParser.UpdateVal1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code UpdateVal1}
	 * labeled alternative in {@link hardwareParser#updateVal}.
	 * @param ctx the parse tree
	 */
	void exitUpdateVal1(hardwareParser.UpdateVal1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Latch1}
	 * labeled alternative in {@link hardwareParser#latch}.
	 * @param ctx the parse tree
	 */
	void enterLatch1(hardwareParser.Latch1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Latch1}
	 * labeled alternative in {@link hardwareParser#latch}.
	 * @param ctx the parse tree
	 */
	void exitLatch1(hardwareParser.Latch1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Simulate1}
	 * labeled alternative in {@link hardwareParser#simulate}.
	 * @param ctx the parse tree
	 */
	void enterSimulate1(hardwareParser.Simulate1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Simulate1}
	 * labeled alternative in {@link hardwareParser#simulate}.
	 * @param ctx the parse tree
	 */
	void exitSimulate1(hardwareParser.Simulate1Context ctx);
}