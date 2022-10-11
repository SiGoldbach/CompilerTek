package expression;

import java.util.HashMap;

public class SavedValuesENV {
    private static SavedValuesENV savedValues=null;

    public static SavedValuesENV getSavedValues() {
        return savedValues;
    }

    public static void setSavedValues(SavedValuesENV savedValues) {
        SavedValuesENV.savedValues = savedValues;
    }

    public HashMap<String, Boolean> getOutput() {
        return output;
    }

    public void setOutput(HashMap<String, Boolean> output) {
        this.output = output;
    }

    private HashMap<String,Boolean> output;
    private SavedValuesENV(){
        output=new HashMap<>();
    }
    public static SavedValuesENV getInstance(){

        return savedValues;
    }
}
