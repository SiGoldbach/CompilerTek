package expression;

import java.util.ArrayList;
import java.util.List;

public class Environment {
    List<Latch> latches;
    public Environment(){
        latches=new ArrayList<>();
    }
}
