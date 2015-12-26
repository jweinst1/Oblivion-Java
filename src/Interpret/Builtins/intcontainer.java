package Interpret.Builtins;

/**
 * Created by Josh on 12/25/15.
 */
public class intcontainer {

    public boolean freeze;
    public int maxsize;
    public int[] bin;

    public intcontainer(int[] numbers, int max, boolean frozen) {
        bin = numbers;
        maxsize = max;
        freeze = frozen;
    }
    //resizes bin once and copies all new elements into bin
    public void add(int[] addition) {
        int newsize = bin.length + addition.length;
        int[] newlst = new int[newsize];
        System.arraycopy(bin, 0, newlst, 0, bin.length);
        System.arraycopy(addition, 0, newlst, bin.length, addition.length);
        bin = newlst;
    }

    public int get(int index) {
        return bin[index];
    }

    public void remove() {

    }

    public boolean sameas(Object input) {
        return bin.equals(input);
    }

    public void check() {

    }

    public int size() {
        return bin.length;
    }

    public int maxsize() {
        return maxsize;
    }
}
