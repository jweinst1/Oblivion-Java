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
public class Interpreter {

    public localdict globals;
    public ArrayList<String> history;
    public int linecount;
    public boolean running;
    public Tokenizer token;
    public Parser parse;
    public Assembler assemble;

    public Interpreter() {
        globals = new localdict();
        history = new ArrayList<String>();
        linecount = 0;
        running = true;
        token = new Tokenizer();
        assemble = new Assembler();
    }

    public String InterpretLine(String line) {
        linecount += 1;
        logcommand(line);
        line = removearrows(line);
        Token[] pieces = token.Tokenize(line);
        String result = assemble.Assemble(pieces);
        return result;
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

    public String removearrows(String line) {
        Matcher raw = Pattern.compile("^>>> (.*)$").matcher(line);
        if(raw.matches()) return raw.group(1);
        else return line;
    }

}
