package Interpret.Utils;

/**
 * Created by Josh on 12/28/15.
 */
public class IntAssembler {

    public StringBuffer currentint;
    public char[] memory;
    public boolean mode;

    public IntAssembler() {
        currentint = new StringBuffer();
        memory = new char[100];
        mode = false;
    }

    public void addintstr(char num){
        currentint.append(String.valueOf(num));
    }

    public String getstr() {
        return currentint.toString();
    }

    public int getint() {
        return Integer.parseInt(currentint.toString());
    }

    public void clearintstr() {
        currentint = new StringBuffer();
    }
}
