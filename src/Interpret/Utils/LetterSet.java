package Interpret.Utils;

import java.util.HashSet;

/**
 * Created by Josh on 12/28/15.
 * Class that can check if a character is a letter
 */
public class LetterSet {
    public HashSet<Character> letters;

    public LetterSet() {
        char[] alphabet = new char[] {'a', 'A', 'b', 'B', 'c', 'C', 'd', 'D', 'e'
        , 'E', 'f', 'F', 'g', 'G', 'h', 'H', 'i', 'I', 'j', 'J'};
        letters = new HashSet<Character>();
        for(char elem : alphabet) letters.add(elem);
    }

    public boolean isletter(char elem) {
        return letters.contains(elem);
    }
}
