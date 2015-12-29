package Interpret.Utils;

/**
 * Created by Josh on 12/29/15.
 * Class that acts as a token of instruction
 */
public class Instruction {

    public String type;
    public String valtype;
    public Object value;

    public Instruction(String kind, Object element, String classifiction) {
        type = kind;
        value = element;
        valtype = classifiction;
    }

    public Object getValue() {
        return value;
    }

    public String getType() {
        return type;
    }
}
