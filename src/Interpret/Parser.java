package Interpret;
import Interpret.Tokenizer;

import java.util.HashMap;
import java.util.Objects;
import java.util.regex.*;
import Interpret.Builtins.*;
import Interpret.Utils.IntAssembler;
import Interpret.Utils.NumSet;

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
    public IntAssembler numcreator;
    public NumSet numchecker;

    public Parser() {
        numbermode = false;
        inputmode = false;
        storage = new HashMap<String, Object>();
        //used for number memory storage
        numberstage = new int[100];
        numchecker = new NumSet();
    }

    public void changeinput(boolean state) {
        inputmode = state;
    }

    public Object Parse(Token[] tokens) {
        for(int i=0;i<tokens.length;i++) {
            if(Objects.equals(tokens[i].getTag(), "START INPUT")) changeinput(true);
            else if(Objects.equals(tokens[i].getTag(), "END INPUT")) changeinput(false);
            else continue;
        }
        return 0;
    }

    public int connectnums(char[] syms) {
        return 0;
    }

}
