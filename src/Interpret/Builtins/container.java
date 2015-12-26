package Interpret.Builtins;

/**
 * Created by Josh on 12/25/15.
 * The general container class for the Oblivion language
 */
public abstract class container {

    public abstract void add(Object[] addition);

    public abstract void remove();

    public abstract boolean sameas();

    public abstract void check();

    public abstract int size();

    public abstract int maxsize();

}
