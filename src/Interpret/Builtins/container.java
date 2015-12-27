package Interpret.Builtins;
import java.util.ArrayList;

/**
 * Created by Josh on 12/25/15.
 * The general container class for the Oblivion language
 */
public abstract class container {
    public ArrayList<Object> bin;
    public boolean freeze;
    public int maxsize;



    public abstract void add(Object[] addition);

    public abstract void remove(int index);

    public abstract void delete(Object elem);

    public abstract void check(Object elem);

    public abstract void Freeze();

    public abstract int size();

    public abstract int maxsize();

    public abstract String ToString();

}
