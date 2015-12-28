package Interpret.Builtins;

/**
 * Created by Josh on 12/27/15.
 * Class that implements a static, mutable range of integers
 */
public abstract class range {

    public Object[] elements;
    public int size;

    public abstract Object get(int index);

    public abstract int length();

    public abstract boolean contains(Object elem);

    public abstract String Tostring();
}
