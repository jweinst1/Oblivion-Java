package Interpret;
import Interpret.Tokenizer;

import java.util.HashMap;
import java.util.regex.*;
import Interpret.Builtins.*;
import java.util.ArrayList;

/**
 * Created by Josh on 12/25/15.
 * Class for parsing statements and binding into the localdict
 */
public class Parser {

    public boolean numbermode;
    public boolean inputmode;
    public int[] numberstage;
    public HashMap<String, Object> storage;

    public Parser() {
        numbermode = false;
        inputmode = false;
        storage = new HashMap<String, Object>();
        numberstage = new int[10];
    }

    public Object Parse(Token[] tokens) {
        return 0;
    }

    public int connectnums(char[] syms) {
        return 0;
    }

}
