package Interpret;

import Interpret.Utils.IntAssembler;

import java.util.HashMap;
import java.util.regex.Pattern;

/**
 * Created by Josh on 12/28/15.
 * Class that acts as the top body to the interpreter, and evaluates low levels of instruction
 */
public class Assembler {

    protected Pattern add = Pattern.compile("^ADD ([0-9]+)$");
    protected Pattern sub = Pattern.compile("^SUB ([0-9]+)$");
    protected Pattern bind = Pattern.compile("^BIND (.+)$");
    public int[] intstorage;
    public HashMap<String, Integer> stage;

    public Assembler() {
        intstorage = new int[100];
        stage = new HashMap<String, Integer>();
    }

    public void assignID(Object target) {

    }

    public void addto(String key, Object value) {

    }
}
