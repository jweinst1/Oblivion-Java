package Interpret;
import Interpret.localdict;
import Interpret.Builtins.*;
import Interpret.Tokenizer;
import java.util.ArrayList;
import java.util.regex.*;
/**
 * Created by Josh on 12/26/15.
 * Main Interpreter object
 */
public class Processor {

    public localdict bounds;
    public ArrayList<String> history;
    public int linecount;

    public Processor() {
        bounds = new localdict();
        history = new ArrayList<String>();
        linecount = 0;
    }
    //logs every line made at the command line
    public void logcommand(String line) {
        Pattern logline = Pattern.compile("^>>> (.*)$");
        Matcher target = logline.matcher(line);
        if(target.matches()) history.add(target.group(1));
    }
}
