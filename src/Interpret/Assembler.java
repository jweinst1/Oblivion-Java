package Interpret;

import Interpret.Utils.IntAssembler;

import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Created by Josh on 12/28/15.
 * Class that acts as the top body to the interpreter, and evaluates low levels of instruction
 */
public class Assembler {

    protected Pattern addint = Pattern.compile("^\\+([0-9]+)$");
    protected Pattern subint = Pattern.compile("^\\-([0-9]+)$");
    protected Pattern mulint = Pattern.compile("^\\*([0-9]+)$");
    protected Pattern divint = Pattern.compile("^/([0-9]+)$");
    protected Pattern bindint = Pattern.compile("^~([0-9]+)$");
    protected Pattern bindstr = Pattern.compile("^~([a-zA-Z]+)$");
    public int[] intstorage;
    public int boundint;
    public String boundstr;

    public Assembler() {
        intstorage = new int[100];
    }

    public String Assemble(Token[] instructions) {
        String returnable = "none";
        for(int i=0;i<instructions.length;i++) {
            if(instructions[i].tag.equals("BIND")) {
                if(equalsregex(instructions[i].symbol, bindint)) {
                    boundint = getintgroup(instructions[i].symbol, bindint);
                    returnable = "int";
                }
                else if(equalsregex(instructions[i].symbol, bindstr)) {
                    boundstr = getstrgroup(instructions[i].symbol, bindstr);
                    returnable = "str";
                }
            }
            else if(instructions[i].tag.equals("ADD")) boundint += getintgroup(instructions[i].tag, addint);
            else if(instructions[i].tag.equals("SUB")) boundint -= getintgroup(instructions[i].tag, subint);
            else if(instructions[i].tag.equals("MUL")) boundint *= getintgroup(instructions[i].tag, mulint);
            else if(instructions[i].tag.equals("DIV")) boundint /= getintgroup(instructions[i].tag, divint);
            else if(instructions[i].tag.equals("RETURN")) break;

        }
        if(returnable.equals("int")) return String.valueOf(boundint);
        else if(returnable.equals("str")) return boundstr;
        else return returnable;

    }
    public boolean equalsregex(String input, Pattern test) {
        return test.matcher(input).matches();
    }

    public int getintgroup(String input, Pattern test) {
        Matcher nums = test.matcher(input);
        if(nums.matches()) return Integer.parseInt(nums.group(1));
        return 0;
    }

    public String getstrgroup(String input, Pattern test) {
        Matcher nums = test.matcher(input);
        if(nums.matches()) return nums.group(1);
        return "";
    }
}
