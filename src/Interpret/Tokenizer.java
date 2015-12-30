package Interpret;

import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import Interpret.Statement;
import Interpret.localdict;
import Interpret.Token;

public class Tokenizer {

    public ArrayList<Token[]> log;
    protected Pattern intnum = Pattern.compile("[0-9]+");
    protected Pattern str = Pattern.compile("[a-zA-Z]+");

    public Tokenizer() {
        log = new ArrayList<Token[]>();
    }



    public Token[] Tokenize(String line) {
        String[] syms = line.split(" ");
        Token[] tokens = new Token[syms.length];
        for(int i=0;i<syms.length;i++) {
            if(syms[i].charAt(0) == '+' && syms[i].length() > 1) tokens[i] = new Token("ADD", syms[i]);
            else if(syms[i].equals("->")) tokens[i] = new Token("PROCEED", syms[i]);
            else if(syms[i].equals("@")) tokens[i] = new Token("RETURN", syms[i]);
            else if(syms[i].charAt(0) == '~' && syms[i].length() > 1) tokens[i] = new Token("BIND", syms[i]);
            else if(syms[i].charAt(0) == '-' && syms[i].length() > 1) tokens[i] = new Token("SUB", syms[i]);
            else if(syms[i].charAt(0) == '*' && syms[i].length() > 1) tokens[i] = new Token("MUL", syms[i]);
            else if(syms[i].charAt(0) == '/' && syms[i].length() > 1) tokens[i] = new Token("DIV", syms[i]);
            else if(syms[i].equals("(")) tokens[i] = new Token("SPUT", syms[i]);
            else if(syms[i].equals(")")) tokens[i] = new Token("EPUT", syms[i]);
            else tokens[i] = new Token("PASS", syms[i]);
        }
        log.add(tokens);
        return tokens;
    }

    public boolean equalsregex(String input, Pattern test) {
        return test.matcher(input).matches();
    }
}
