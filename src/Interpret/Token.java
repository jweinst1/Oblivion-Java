package Interpret;

/**
 * Created by Josh on 12/27/15.
 * Token class implementation
 */
public class Token {

    public char symbol;
    public String tag;

    public Token(String label, char mark) {
        symbol = mark;
        tag = label;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getTag() {
        return tag;
    }
}
