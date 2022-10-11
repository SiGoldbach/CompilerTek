package expression;

import java.util.HashMap;

public abstract class AST {

    public abstract boolean eval();

}


class And extends AST {
    public AST expr;
    public AST expr2;
    public And(AST expr,AST expr1){
        this.expr=expr;
        this.expr2=expr1;

    }

    @Override
    public boolean eval() {
        return this.expr.eval() && this.expr2.eval();
    }
}

class BinExpr extends AST {
    String id;
    public BinExpr(String id){
        this.id=id;


    }

    public boolean eval() {
        return true;
    }

}
class Name extends AST {
    String name;

    public Name(String name) {
        this.name = name;
    }

    @Override
    public boolean eval() {
        return false;
    }
}

class Not extends AST {
    AST expr;

    public Not(AST expr) {
        this.expr = expr;
    }

    public boolean eval() {
        return !expr.eval();
    }
}

class Update extends AST {

    @Override
    public boolean eval() {
        return false;
    }
}

class Paranthesis extends AST {
    AST expr;

    public Paranthesis(AST expr) {
        this.expr = expr;
    }

    @Override
    public boolean eval() {
        return expr.eval();
    }
}

class Output extends AST {
    public Output() {
    }

    @Override
    public boolean eval() {
        return false;
    }
}

class Or extends AST {
    AST expr;
    AST expr2;

    public Or(AST expr, AST expr2) {
        this.expr = expr;
        this.expr2 = expr2;
    }

    @Override
    public boolean eval() {
        return expr.eval() || expr2.eval();
    }
}

class Latch extends AST{
    String color;
    boolean value;

    @Override
    public boolean eval() {
        return false;
    }
}

class Simulate extends AST {
    @Override
    public boolean eval() {
        return false;
    }
}





