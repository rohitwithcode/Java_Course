package Chapter_16_Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    Dot (.) :-> any one character except a line terminator at end
    (\d)    :-> a digit : [0-9]
    (\D)    :-> a non digit value : [^0-9]
    (\s)    :-> a whitespace character : [\t\n\x0B\f\r]
    (\S)    :-> a non whitespace character : [^\s]
    (\w)    :-> a word character : [a-zA-Z_0-9]
    (\W)    :-> a non-word character : [^\W]

 */
public class Meta_Character_Classes {
    public static void main(String[] args) {
//        String input="CoderABCd hhjCoderB CoderC CoderD";
//        Pattern pattern=Pattern.compile("Coder.");
//        Matcher matcher=pattern.matcher(input);
//
//        while (matcher.find()){
//            System.out.println(input.substring(matcher.start(),matcher.end()));
//        }

        String input1="343l4n42b";
        Pattern pattern=Pattern.compile("\\d");
        Matcher matcher=pattern.matcher(input1);

        while (matcher.find()){
            System.out.println(input1.substring(matcher.start(),matcher.end()));
        }
    }
}
