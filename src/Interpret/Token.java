package Interpret;

/**
 * Created by Josh on 12/27/15.
 * Token class implementation
 */
public class Token {

    public String symbol;
    public String tag;

    public Token(String label, String mark) {
        symbol = mark;
        tag = label;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getTag() {
        return tag;
    }
}
