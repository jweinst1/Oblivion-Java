package Interpret.Builtins;

/**
 * Created by Josh on 12/26/15.
 * Class that implements the turing machine object
 */
public class TuringMachine {

    public int size;
    public int pointer;
    public int[] cells;

    public TuringMachine(int capacity) {
        size = capacity;
        pointer = 0;
        cells = new int[size];
        for(int i=0;i<cells.length;i++) cells[i] = 0;
    }
    public void pushpointer(int spaces) {
        pointer += spaces;
    }
    public void pullpointer(int spaces) {
        pointer -= spaces;
        if(pointer > 0) pointer += pointer*-1;
    }
    public void increasecell(int amount) {
        cells[pointer] += amount;
    }
    public void decreasecell(int amount) {
        cells[pointer] -= amount;
    }

    public int getcell() {
        return cells[pointer];
    }
}
