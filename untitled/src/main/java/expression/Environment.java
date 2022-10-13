package expression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Environment {
    public Map<String, Boolean> getLatches() {
        return latches;
    }

    public void setLatches(Map<String, Boolean> latches) {
        this.latches = latches;
    }

    public Map<String, Boolean> getOutputs() {
        return outputs;
    }

    public void setOutputs(Map<String, Boolean> outputs) {
        this.outputs = outputs;
    }

    Map<String,Boolean> latches;
    Map<String,Boolean> outputs;

    Simulate simulate;
    public Environment(){
        latches=new HashMap<>();
        outputs=new HashMap<>();
    }

    public Simulate getSimulate() {
        return simulate;
    }

    public void setSimulate(Simulate simulate) {
        this.simulate = simulate;
    }

    And and;

    public And getAnd() {
        return and;
    }
    public void setAnd(And and) {
        this.and = and;
    }

    Not not;

    public Not getNot() {
        return not;
    }

    public void setNot(Not not) {
        this.not = not;
    }

    Or or;

    public Or getOr() {
        return or;
    }

    public void setOr(Or or) {
        this.or = or;
    }

    Variable variable;

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    Input input;

    public Input getInput() {
        return input;
    }

    public void setInput(Input input) {
        this.input = input;
    }

    Update update;

    public Update getUpdate() {
        return update;
    }

    public void setUpdate(Update update) {
        this.update = update;
    }

}


