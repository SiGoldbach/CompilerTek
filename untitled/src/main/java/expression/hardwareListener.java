// Generated from C:/Users/siggo/IdeaProjects/untitled/src/main/java/expression\hardware.g4 by ANTLR 4.10.1
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
	 * Enter a parse tree produced by the {@code Name}
	 * labeled alternative in {@link hardwareParser#command}.
	 * @param ctx the parse tree
	 */
	void enterName(hardwareParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Name}
	 * labeled alternative in {@link hardwareParser#command}.
	 * @param ctx the parse tree
	 */
	void exitName(hardwareParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Input}
	 * labeled alternative in {@link hardwareParser#command}.
	 * @param ctx the parse tree
	 */
	void enterInput(hardwareParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Input}
	 * labeled alternative in {@link hardwareParser#command}.
	 * @param ctx the parse tree
	 */
	void exitInput(hardwareParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Output}
	 * labeled alternative in {@link hardwareParser#command}.
	 * @param ctx the parse tree
	 */
	void enterOutput(hardwareParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Output}
	 * labeled alternative in {@link hardwareParser#command}.
	 * @param ctx the parse tree
	 */
	void exitOutput(hardwareParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Update}
	 * labeled alternative in {@link hardwareParser#command}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(hardwareParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Update}
	 * labeled alternative in {@link hardwareParser#command}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(hardwareParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Latch}
	 * labeled alternative in {@link hardwareParser#command}.
	 * @param ctx the parse tree
	 */
	void enterLatch(hardwareParser.LatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Latch}
	 * labeled alternative in {@link hardwareParser#command}.
	 * @param ctx the parse tree
	 */
	void exitLatch(hardwareParser.LatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Simulate}
	 * labeled alternative in {@link hardwareParser#command}.
	 * @param ctx the parse tree
	 */
	void enterSimulate(hardwareParser.SimulateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Simulate}
	 * labeled alternative in {@link hardwareParser#command}.
	 * @param ctx the parse tree
	 */
	void exitSimulate(hardwareParser.SimulateContext ctx);
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
}