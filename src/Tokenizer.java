/**
 * Created by Josh on 12/24/15.
 * Class that implements classification of statement lines
 */

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Tokenizer {
    protected Pattern plus = Pattern.compile("^(.+) plus (.+)$");
    
}
