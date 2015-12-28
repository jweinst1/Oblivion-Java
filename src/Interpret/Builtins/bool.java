package Interpret.Builtins;

/**
 * Created by Josh on 12/27/15.
 * Class for implementing boolean values
 */
public class bool {
    public String state;
    public String[] states;

    public bool(String result) {
        state = result;
        states = new String[] {"True", "False", "Maybe"};
    }

    public void changestate(String result) {
        state = result;
    }

    public String gettsate() {
        return state;
    }
}
