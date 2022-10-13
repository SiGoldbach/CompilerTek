// Generated from C:/Users/siggo/IdeaProjects/CompilerTek/untitled/src/main/java/expression\hardware.g4 by ANTLR 4.10.1
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
	/**
	 * Visit a parse tree produced by the {@code UpdateVal1}
	 * labeled alternative in {@link hardwareParser#updateVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateVal1(hardwareParser.UpdateVal1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Latch1}
	 * labeled alternative in {@link hardwareParser#latch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatch1(hardwareParser.Latch1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Simulate1}
	 * labeled alternative in {@link hardwareParser#simulate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimulate1(hardwareParser.Simulate1Context ctx);
}