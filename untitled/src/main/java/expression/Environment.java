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
}
