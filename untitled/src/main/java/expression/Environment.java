package expression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Environment {
    Map<String,Boolean> latches;
    Map<String,Boolean> outputs;

    Simulate simulate;
    public Environment(){
        latches=new HashMap<>();
        outputs=new HashMap<>();

    }
}
