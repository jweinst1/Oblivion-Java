package Interpret.Builtins;

/**
 * Created by Josh on 12/27/15.
 * Class that implements a static, mutable range of integers
 */
public class range {

    public int[] numbers;
    public int size;

    public range(int length) {
        int[] target = new int[length];
        for(int i=0;i<length;i++) target[i] = i;
        numbers = target;
        size = length;
    }

    public void mutenum(int index) {
        numbers[index] = 00;
    }

    public boolean isnum(int index) {
        return numbers[index]==00;
    }

    public int length() {
        return size;
    }
}
