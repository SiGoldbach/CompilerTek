package expression;

import java.util.HashMap;

public class SavedValuesENV {
    private static SavedValuesENV savedValues=null;

    private HashMap<String,Boolean> output;
    private SavedValuesENV(){
        output=new HashMap<>();
    }
    public static SavedValuesENV getInstance(){

        return savedValues;
    }
}
