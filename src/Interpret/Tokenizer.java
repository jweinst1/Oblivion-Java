package Interpret;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import Interpret.Statement;
import Interpret.localdict;

public class Tokenizer {
    //token patterns compiled initially to improve spped
    protected static Pattern add = Pattern.compile("^add (.+) to (.+)$");
    protected static Pattern create = Pattern.compile("^create (.+) (.+)$");
    protected static Pattern connect = Pattern.compile("^connect (.+) to (.+)$");
    protected static Pattern extend = Pattern.compile("^extend (.+) by (.+)$");
    protected static Pattern assign = Pattern.compile("^assign (.+) to (.+)$");
    protected static Pattern remove = Pattern.compile("^remove (.+) from (.+)$");
    protected static Pattern display = Pattern.compile("^display (.+)$");

    //constructor
    public Tokenizer() {

    }

    //top level function that categorizes a statement
    public void Tokenize(Statement command) {
        if(create.matcher(command.line).matches()) {
            command.settag("create"); 
            attachname(command, create);
        }
        else if(connect.matcher(command.line).matches()) command.settag("connect");
        else if(add.matcher(command.line).matches()) command.settag("add");
        else if(extend.matcher(command.line).matches()) command.settag("extend");
        else if(assign.matcher(command.line).matches()) command.settag("assign");
        else if(remove.matcher(command.line).matches()) command.settag("remove");
        else if(display.matcher(command.line).matches()) command.settag("display");
        else System.out.println("Not a Valid Statement.");
    }
    //uses a capturing group to attach a name to a statement object
    public void attachname(Statement command, Pattern capture) {
        Matcher temp = capture.matcher(command.line);
        if(temp.matches()) command.info[0] = temp.group(1);
        else command.info[0] = "NA";
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
