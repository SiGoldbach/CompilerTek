package expression;

public class Input extends AST {
    public String name;
    public Input(String name){
        this.name=name;
    }
    public boolean eval() {
        return false;
    }
}
