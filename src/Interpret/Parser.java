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

    protected Pattern intcont = Pattern.compile("i\\[([0-9 ,]+)\\]i");
    protected Pattern strcont = Pattern.compile("^s\\[([a-zA-Z ,]+)\\]s$");
    protected Pattern turing = Pattern.compile("^t\\[([0-9]+)\\]t$");

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
            case "display": ParseDisplay(command, binder);
                break;
            case "remove":
                break;
            case "assign":
                break;
            default:
                break;
        }
    }

    public void create_intcontainer(Statement command, localdict storage) {
        Matcher inttemp = intcont.matcher(command.line);
        if(inttemp.find()) {
            int[] gotints;
            gotints = extractints(inttemp.group(1));
            intcontainer newobj = new intcontainer(gotints, 0, false);
            storage.addbind(command.info[0], newobj);
        }
    }

    public void create_strcontainer(Statement command, localdict storage) {

    }

    public void ParseDisplay(Statement command, localdict binder) {

    }

    public void ParseCreate(Statement command, localdict binder) {
        if(intcont.matcher(command.line).matches()) create_intcontainer(command, binder);
        else if(strcont.matcher(command.line).matches()) create_strcontainer(command, binder);
    }

    public void ParseAdd(Statement command, localdict binder) {

    }
    // extracts the integers from a string.
    public int[] extractints(String target) {
        String[] nums = target.split(", ");
        int[] numlst = new int[nums.length];
        for(int i=0;i<numlst.length;i++) numlst[i] = Integer.parseInt(nums[i]);
        return numlst;
    }
}
