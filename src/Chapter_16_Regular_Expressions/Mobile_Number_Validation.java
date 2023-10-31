package Chapter_16_Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mobile_Number_Validation {
    public static void main(String[] args) {
        String input="4435346434";

        Pattern pattern=Pattern.compile("\\d{10}");
        Matcher matcher=pattern.matcher(input);

        if (matcher.matches()){
            System.out.println("Mobile number in valid");
        }
        else {
            System.out.println("Number is not matched");
        }
    }
}
