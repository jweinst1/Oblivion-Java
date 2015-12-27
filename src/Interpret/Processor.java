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

    public localdict globals;
    public ArrayList<String> history;
    public int linecount;
    public boolean running;

    public Processor() {
        globals = new localdict();
        history = new ArrayList<String>();
        linecount = 0;
        running = true;
    }
    //logs every line made at the command line
    public void logcommand(String line) {
        Pattern logline = Pattern.compile("^>>> (.*)$");
        Matcher target = logline.matcher(line);
        if(target.matches()) history.add(target.group(1));
        else history.add(line);
    }

    public void bindglobal(String name, Object value) {
        globals.addbind(name, value);
    }

    public void interpret(String line) {
        logcommand(line);
        linecount += 1;
    }
}
