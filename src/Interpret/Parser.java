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

    protected Pattern intcont = Pattern.compile("^i\\[([0-9 ,]+)\\]i$");
    protected Pattern strcont = Pattern.compile("^s\\[([a-zA-Z ,]+)\\]s$");

    public Parser() {

    }
    //main function of parser
    public void Parse(Statement command, localdict binder) {
        switch (command.tag) {
            case "create": ParseCreate(command, binder);
                break;
            case "add":
                break;
            case "connect":
                break;
            case "extend":
                break;
            case "display":
                break;
            case "remove":
                break;
            case "assign":
                break;
            default:
                break;
        }
    }

    public static void create_intcontainer(String name, String container, localdict storage) {
        Pattern intharvest = Pattern.compile("([0-9]+)");
        Matcher numbers = intharvest.matcher(container);
        ArrayList<Integer> template = new ArrayList<Integer>();
        while(numbers.find()) {
            String num = numbers.group();
            template.add(Integer.parseInt(num));
        }

    }

    public void ParseCreate(Statement command, localdict binder) {

    }

    public void ParseAdd(Statement command, localdict binder) {

    }
}
