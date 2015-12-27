package Interpret.Builtins;

/**
 * Created by Josh on 12/27/15.
 * Machine Abstract Class
 */
public abstract class machine {

    public Object[] cells;
    public int pointer;
    public int size;
    public boolean freeze;

    public abstract void pushpointer(int spaces);

    public abstract void pullpointer(int spaces);

    public abstract void increasecell(Object change);

    public abstract void decreasecell(Object change);

    public abstract Object getcell();

    public abstract String Tostring();

}
