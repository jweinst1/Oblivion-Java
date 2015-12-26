package Interpret.Builtins;
import java.util.ArrayList;
/**
 * Created by Josh on 12/25/15.
 */
public class intcontainer {

    public boolean freeze;
    public int maxsize;
    public ArrayList<Integer> bin;

    public intcontainer(int[] numbers, int max, boolean frozen) {
        bin = new ArrayList<Integer>();
        for(int elem : numbers) bin.add(elem);
        maxsize = max;
        freeze = frozen;
    }
    //resizes bin once and copies all new elements into bin
    public void add(int[] addition) {
        for(int elem : addition) bin.add(elem);
    }

    public void insert(int[] addition, int index) throws IndexOutOfBoundsException {
        for(int elem : addition) bin.add(index, elem);
    }

    public int get(int index) {
        return bin.get(index);
    }

    public Object[] getarray() {
        return bin.toArray();
    }

    public void remove(int[] deletion) {
        for(int elem : deletion) bin.remove(elem);
    }

    public boolean sameas(intcontainer input) {
        return bin.equals(input.bin);
    }

    public boolean check(int num) {
        return bin.contains(num);
    }

    public int size() {
        return bin.size();
    }

    public int maxsize() {
        return maxsize;
    }
}
