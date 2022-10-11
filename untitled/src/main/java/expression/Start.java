package expression;

public class Start extends AST {
    public AST expr;
    public Start(AST expr){
        this.expr=expr;
    }
    public boolean eval() {
        return this.expr.eval();
    }
}
