package Interpret;

import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import Interpret.Statement;
import Interpret.localdict;
import Interpret.Token;

public class Tokenizer {

    public boolean inputmode;
    public ArrayList<String> log;

    public Tokenizer() {
        inputmode = false;
        log = new ArrayList<String>();
    }

    public void inputchange(boolean state) {
        inputmode = state;
    }

    public Token[] Tokenize(String line) {
        char[] syms = line.toCharArray();
        Token[] tokens = new Token[syms.length];
        for(int i=0;i<syms.length;i++) {
            switch (syms[i]) {
                case '(': inputchange(true);
                    tokens[i] = new Token("START INPUT", syms[i]);
                    break;
                case ')': inputchange(false);
                    tokens[i] = new Token("END INPUT", syms[i]);
                    break;
                case '-': if(inputmode) tokens[i] = new Token("SUBTRACT", syms[i]);
                    else tokens[i] = new Token("CARRY", syms[i]);
                    break;
                case '>': if(inputmode) tokens[i] = new Token("GREATER", syms[i]);
                    else tokens[i] = new Token("APPLY", syms[i]);
                    break;
                case '+': if(inputmode) tokens[i] = new Token("ADD", syms[i]);
                    break;
                case '@': if(inputmode) tokens[i] = new Token("RETURN", syms[i]);
                    else tokens[i] = new Token("DISPLAY", syms[i]);
                    break;
                case '0': if(inputmode) tokens[i] = new Token("INT", syms[i]);
                    break;
                case '1': if(inputmode) tokens[i] = new Token("INT", syms[i]);
                    break;
                case '2': if(inputmode) tokens[i] = new Token("INT", syms[i]);
                    break;
                case '3': if(inputmode) tokens[i] = new Token("INT", syms[i]);
                    break;
                case '4': if(inputmode) tokens[i] = new Token("INT", syms[i]);
                    break;
                case '5': if(inputmode) tokens[i] = new Token("INT", syms[i]);
                    break;
                case '6': if(inputmode) tokens[i] = new Token("INT", syms[i]);
                    break;
                case '7': if(inputmode) tokens[i] = new Token("INT", syms[i]);
                    break;
                case '8': if(inputmode) tokens[i] = new Token("INT", syms[i]);
                    break;
                case '9': if(inputmode) tokens[i] = new Token("INT", syms[i]);
                    break;
                default:
                    break;
            }
        }
        return tokens;
    }
}
