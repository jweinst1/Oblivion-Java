package Interpret;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import Interpret.Statement;

public class Tokenizer {
    protected static Pattern plus = Pattern.compile("^(.+) plus (.+)$");
    protected static Pattern create = Pattern.compile("^create (.+) (.+)$");
    protected static Pattern connect = Pattern.compile("^connect (.+) to (.+)$");

    //
    public static boolean iscreate(String test) {
        Matcher Cstate = create.matcher(test);
        return Cstate.matches();
    }

    /*public static Statement tokenize(String input) {

    }*/

}
