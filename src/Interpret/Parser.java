package Interpret;
import Interpret.Tokenizer;
import java.util.regex.*;
import Interpret.Builtins.*;
import java.util.ArrayList;

/**
 * Created by Josh on 12/25/15.
 * Class for parsing statements and binding into the localdict
 */
public class Parser {

    public static void create_intcontainer(String name, String container, localdict storage) {
        Pattern intharvest = Pattern.compile("([0-9]+)");
        Matcher numbers = intharvest.matcher(container);
        ArrayList<Integer> template = new ArrayList<Integer>();
        while(numbers.find()) {
            String num = numbers.group();
            template.add(Integer.parseInt(num));
        }

    }
}
