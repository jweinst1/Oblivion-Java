package Interpret;
import
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import Interpret.Statement;
import Interpret.localdict;

public class Tokenizer {
    protected static Pattern plus = Pattern.compile("^(.+) plus (.+)$");
    protected static Pattern create = Pattern.compile("^create (.+) (.+)$");
    protected static Pattern connect = Pattern.compile("^connect (.+) to (.+)$");
    protected static Pattern extend = Pattern.compile("^extend (.+) by (.+)$");
    protected static Pattern assign = Pattern.compile("^assign (.+) to (.+)$");

    //constructor
    public Tokenizer() {

    }

    //top level function that categorizes a statement
    public void Tokenize(String line) {

    }

    //checks if create statement
    public static boolean iscreate(String test) {
        Matcher Cstate = create.matcher(test);
        return Cstate.matches();
    }
    //checks if assign statement
    public static boolean isassign(String test) {
        Matcher Cstate = assign.matcher(test);
        return Cstate.matches();
    }

    public static boolean isIntContainer(String test) {
        Pattern Icont = Pattern.compile("i\\[.*\\]i");
        Matcher temp = Icont.matcher(test);
        return temp.matches();
    }

    public void matchline(String line) {

    }

    /*public static Statement tokenize(String input) {

    }*/

}
