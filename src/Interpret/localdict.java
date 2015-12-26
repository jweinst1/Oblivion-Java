package Interpret;
import java.util.HashMap;
/**
 * Created by Josh on 12/25/15.
 * Class that implements a hashmap for storing running variables and objects
 */
public class localdict {
    //needs to store running variables
    public HashMap<String, Object> bindings;
    public boolean empty;

    public localdict() {
        bindings = new HashMap<String, Object>();
        empty = true;
    }
    public int getsize() {
        return bindings.size();
    }
    public void addbind(String name, Object value) {
        bindings.put(name, value);
    }
    public Object getbind(String name) {
        return bindings.get(name);
    }
    public void deletebind(String name) {
        bindings.remove(name);
    }
    //checks if a binding exists
    public boolean checkbind(String name) {
        return bindings.containsKey(name);
    }
    //gets the class of a binding
    public String gettype(String name) {
        return String.valueOf(bindings.get(name).getClass());
    }
}
