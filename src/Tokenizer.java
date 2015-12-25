/**
 * Created by Josh on 12/24/15.
 * Class that implements classification of statement lines
 */

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Tokenizer {
    protected static Pattern plus = Pattern.compile("^(.+) plus (.+)$");
    protected static Pattern create = Pattern.compile("^create (.+) (.+)$");
    protected static Pattern connect = Pattern.compile("^connect (.+) to (.+)$");

    //
    public static boolean iscreate(String test) {
        Matcher Cstate = create.matcher(test);
        return Cstate.matches();
    }

}
