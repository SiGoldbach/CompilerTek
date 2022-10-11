package expression;

public class Start extends AST {
    public String expr;
    public Start(String expr){
        this.expr=expr;
    }
    public boolean eval() {
        return false;
    }
}
