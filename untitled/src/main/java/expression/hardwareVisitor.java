// Generated from C:/Users/siggo/IdeaProjects/untitled/src/main/java/expression\hardware.g4 by ANTLR 4.10.1
package expression;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link hardwareParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface hardwareVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link hardwareParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(hardwareParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Name}
	 * labeled alternative in {@link hardwareParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(hardwareParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Input}
	 * labeled alternative in {@link hardwareParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(hardwareParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Output}
	 * labeled alternative in {@link hardwareParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(hardwareParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Update}
	 * labeled alternative in {@link hardwareParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(hardwareParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Latch}
	 * labeled alternative in {@link hardwareParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatch(hardwareParser.LatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Simulate}
	 * labeled alternative in {@link hardwareParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimulate(hardwareParser.SimulateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link hardwareParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(hardwareParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link hardwareParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(hardwareParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Paranthesis}
	 * labeled alternative in {@link hardwareParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParanthesis(hardwareParser.ParanthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link hardwareParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(hardwareParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Binexpr}
	 * labeled alternative in {@link hardwareParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinexpr(hardwareParser.BinexprContext ctx);
}