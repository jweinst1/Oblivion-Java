/**
 * Created by Josh on 12/25/15.
 * Class to implement a statement to be interpreted
 */
package Interpret;

public class Statement {

    public String line;
    public String tag;
    public String[] info;

    //constructor
    public Statement(String input) {
        line = input;
        tag = null;
        info = new String[10];
    }

    public String Tostring() {
        return line;
    }

    public void settag(String label) {
        tag = label;
    }
}

/*
Info key:
info[0]: name
info[1]: return value
 */