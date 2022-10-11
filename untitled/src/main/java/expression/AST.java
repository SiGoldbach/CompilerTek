package expression;

public abstract class AST {

}


class And extends Expr {
    public Expr expr;
    public Expr expr2;

    public And(Expr expr, Expr expr1) {
        this.expr = expr;
        this.expr2 = expr1;

    }

    @Override
    public boolean eval(Environment env) {
        return this.expr.eval(env) && this.expr2.eval(env);
    }
}

abstract class Expr extends AST {
    public abstract boolean eval(Environment env);

}

class Variable extends Expr {
    Boolean id;
    String varname;

    public Variable(String varname) {
        this.varname = varname;
    }


    public boolean eval(Environment env) {
        return env.getLatches().get(varname);
    }

}

class Not extends Expr {
    Expr expr;

    public Not(Expr expr) {
        this.expr = expr;
    }

    public boolean eval(Environment env) {
        return !expr.eval(env);
    }
}

class Update extends AST {
    public String name;

    public Update(String name) {
        this.name = name;
    }

    public boolean eval() {
        return false;
    }
}

class Paranthesis extends Expr {
    Expr expr;

    public Paranthesis(Expr expr) {
        this.expr = expr;
    }

    @Override
    public boolean eval(Environment env) {
        return expr.eval(env);
    }
}


class Or extends Expr {
    Expr expr;
    Expr expr2;

    public Or(Expr expr, Expr expr2) {
        this.expr = expr;
        this.expr2 = expr2;
    }

    @Override
    public boolean eval(Environment env) {
        return expr.eval(env) || expr2.eval(env);
    }
}

class Latch extends AST {
    public String name;
    public boolean val = false;

    public Latch(String name) {
        this.name = name;
    }


}

class Simulate extends AST {
    public String name;

    public Simulate(String name) {
        this.name = name;
    }


}





