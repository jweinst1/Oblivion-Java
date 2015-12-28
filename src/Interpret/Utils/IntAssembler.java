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
}
