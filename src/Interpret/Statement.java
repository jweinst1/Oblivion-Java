/**
 * Created by Josh on 12/25/15.
 * Class to implement a statement to be interpreted
 */
package Interpret;

public class Statement {

    public String line;
    public String tag;
    public String[] funcs;

    //constructor
    public Statement(String input, String type, String[] pros) {
        line = input;
        tag = type;
        funcs = pros;
    }
}
