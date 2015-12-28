package Interpret.Utils;

import java.util.HashSet;

/**
 * Created by Josh on 12/28/15.
 * Implements a set of numerical characters, for easy checking
 */
public class NumSet {

    public HashSet<Character> numbers;

    public NumSet() {
        char[] ints = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        numbers = new HashSet<Character>();
        for(char elem : ints) numbers.add(elem);
    }

    public boolean isint(char elem) {
        return numbers.contains(elem);
    }
}
