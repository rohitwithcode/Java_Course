package Chapter_16_Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Many_Operator_experiment {
    public static void main(String[] args) {
        String myString="I am Coder Rohit From Kunjalpur";
        Pattern pattern=Pattern.compile("[a-z]+");
        Matcher matcher=pattern.matcher(myString);

        while (matcher.find()){
            System.out.println(myString.substring(matcher.start(),matcher.end()));
        }
//        if (matcher.matches()){
//            System.out.println("Pattern Matched ");
//        }
//        else {
//            System.out.println("Pattern not matched");
//        }
    }
}
