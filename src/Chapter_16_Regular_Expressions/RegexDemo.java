package Chapter_16_Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        String input="Hello1";
        Pattern pattern=Pattern.compile("[A-Za-z]+[0-9]");// + quantifier approve only one number at end
        Matcher matcher=pattern.matcher(input);

        if (matcher.matches()){
            System.out.println("Pattern matched");
        }
        else {
            System.out.println("Pattern not matched");
        }
    }
}
